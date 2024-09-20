/*     */ package com.install4j.runtime.installer.helper.comm;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchLongAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.comm.impl.ClassLoaderObjectInputStream;
/*     */ import com.install4j.runtime.installer.helper.comm.impl.HelperContextImpl;
/*     */ import com.install4j.runtime.installer.helper.comm.responses.BooleanResponse;
/*     */ import com.install4j.runtime.installer.helper.comm.responses.LongResponse;
/*     */ import com.install4j.runtime.installer.helper.comm.responses.Response;
/*     */ import com.install4j.runtime.installer.helper.comm.responses.StringResponse;
/*     */ import com.install4j.runtime.installer.helper.comm.responses.ThrowableResponse;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectOutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.Serializable;
/*     */ import java.util.Map;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class HelperCommunication {
/*  31 */   private static HelperCommunication instance = new HelperCommunication(); private static final int TIMEOUT = 120000; private boolean terminated; private static PrintStream debugLogWriter; private ByteArrayOutputStream bout; private DataOutputStream dout; private Thread executorThread; private final InterProcessCommunication interProcessCommunication; private HelperContextImpl helperContext; private final Stack<ActionWrapper> actions; private final Map<Long, Response> responses; private final Object sendMonitor; private long nextPacketId; private long lastPing;
/*     */   private volatile boolean edtWaiting;
/*     */   
/*     */   public HelperCommunication() {
/*     */     InterProcessCommunication.ErrorLogger logger;
/*  36 */     this.bout = new ByteArrayOutputStream();
/*  37 */     this.dout = new DataOutputStream(this.bout);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     this.actions = new Stack<>();
/*  70 */     this.responses = new HashMap<>();
/*  71 */     this.sendMonitor = new Object();
/*     */     
/*  73 */     this.nextPacketId = 1L;
/*  74 */     this.lastPing = -1L;
/*     */     
/*  76 */     this.edtWaiting = false; String parentIdentifier = System.getProperty("install4j.commIdentifier"); if (parentIdentifier == null) { logger = new InterProcessCommunication.ErrorLogger() { public void log(String str) { HelperCommunication.log(str); } public void log(Throwable t) { HelperCommunication.log(t); } }
/*     */         ; } else { logger = InterProcessCommunication.INSTALLER_APP_LOGGER; }  this.interProcessCommunication = new InterProcessCommunication(parentIdentifier, System.getProperty("install4j.commHash"), false, logger); }
/*     */   public static HelperCommunication getInstance() { return instance; }
/*  79 */   public String getParentIdentifier() { return this.interProcessCommunication.getParentIdentifier(); }
/*     */ 
/*     */   
/*     */   public String getHash() {
/*  83 */     return this.interProcessCommunication.getHash();
/*     */   }
/*     */   
/*     */   public boolean isElevatedHelper() {
/*  87 */     return (getParentIdentifier() != null);
/*     */   }
/*     */   
/*     */   public boolean hasElevatedHelper() {
/*     */     try {
/*  92 */       return (!isElevatedHelper() && isConnected());
/*  93 */     } catch (Exception e) {
/*  94 */       e.printStackTrace();
/*  95 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean connect() {
/* 100 */     if (this.interProcessCommunication.connect()) {
/* 101 */       this.terminated = false;
/*     */       
/* 103 */       if (isElevatedHelper()) {
/* 104 */         this.helperContext = Objects.equals(InstallerConfig.getCurrentApplicationId(), "uninstaller") ? (HelperContextImpl)new UninstallerHelperContextImpl() : (HelperContextImpl)new InstallerHelperContextImpl();
/* 105 */         ContextImpl.setSingleContextInt((ContextInt)this.helperContext);
/* 106 */         FileInstaller.getInstance().setDefaultProgressInterface(this.helperContext.getProgressInterface());
/*     */       } 
/*     */       
/* 109 */       (new ReaderThread()).start();
/*     */       
/* 111 */       this.executorThread = new Thread("helper_ipc_executor")
/*     */         {
/*     */           public void run()
/*     */           {
/*     */             while (true) {
/* 116 */               HelperCommunication.this.executeActionWrapper(HelperCommunication.this.getNextAction(true), true);
/*     */             }
/*     */           }
/*     */         };
/*     */       
/* 121 */       (new Thread("helper_ipc_ping")
/*     */         {
/*     */           public void run()
/*     */           {
/*     */             while (true) {
/*     */               try {
/* 127 */                 Thread.sleep(5000L);
/* 128 */               } catch (InterruptedException interruptedException) {}
/* 129 */               HelperCommunication.ping();
/* 130 */               if (HelperCommunication.this.isElevatedHelper() && HelperCommunication.this.lastPing > -1L && System.currentTimeMillis() - HelperCommunication.this.lastPing > 120000L) {
/* 131 */                 System.exit(1);
/*     */               }
/*     */             }
/*     */           
/*     */           }
/* 136 */         }).start();
/*     */       
/* 138 */       if (hasElevatedHelper()) {
/* 139 */         Runtime.getRuntime().addShutdownHook(new Thread("helper_ipc_shutdown")
/*     */             {
/*     */               public void run() {
/* 142 */                 HelperCommunication.this.terminate();
/*     */               }
/*     */             });
/*     */       } else {
/* 146 */         InstallerUtil.initHelperState();
/* 147 */         InstallerVariables.initHelperState();
/* 148 */         Install4jClassLoader.initHelperState();
/*     */         
/* 150 */         Logger.getInstance().log(this, "Using communication backend " + this.interProcessCommunication.getBackendClass().getName(), true);
/*     */       } 
/*     */       
/* 153 */       this.executorThread.start();
/*     */       
/* 155 */       return true;
/*     */     } 
/* 157 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void ping() {
/*     */     try {
/* 163 */       getInstance().executeAction(ExecutionContext.OTHER, (CommunicationAction)new DirectRunAction()
/*     */           {
/*     */             protected void run(Context context) {
/* 166 */               (HelperCommunication.getInstance()).lastPing = System.currentTimeMillis();
/*     */             }
/*     */           });
/* 169 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEdtWaiting() {
/* 175 */     return this.edtWaiting;
/*     */   }
/*     */   
/*     */   public String createListener() {
/* 179 */     return this.interProcessCommunication.createListener();
/*     */   }
/*     */   
/*     */   public String fetchStringChecked(ExecutionContext executionContext, FetchStringAction action) throws UserCanceledException, IOException {
/* 183 */     return ((StringResponse)executeActionChecked(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T fetchObjectChecked(ExecutionContext executionContext, FetchObjectAction<T> action) throws UserCanceledException, IOException {
/* 188 */     return (T)((ObjectResponse)executeActionChecked(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public long fetchLongChecked(ExecutionContext executionContext, FetchLongAction action) throws UserCanceledException, IOException {
/* 192 */     return ((LongResponse)executeActionChecked(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public boolean fetchBooleanChecked(ExecutionContext executionContext, FetchBooleanAction action) throws UserCanceledException, IOException {
/* 196 */     return ((BooleanResponse)executeActionChecked(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public int fetchIntChecked(ExecutionContext executionContext, FetchIntAction action) throws UserCanceledException, IOException {
/* 200 */     return ((IntResponse)executeActionChecked(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public Response executeActionChecked(ExecutionContext executionContext, CommunicationAction action) throws UserCanceledException, IOException {
/*     */     try {
/* 205 */       return executeActionInt(executionContext, action);
/* 206 */     } catch (Throwable throwable) {
/* 207 */       if (throwable instanceof Error)
/* 208 */         throw (Error)throwable; 
/* 209 */       if (throwable instanceof RuntimeException)
/* 210 */         throw (RuntimeException)throwable; 
/* 211 */       if (throwable instanceof UserCanceledException)
/* 212 */         throw (UserCanceledException)throwable; 
/* 213 */       if (throwable instanceof IOException) {
/* 214 */         throw (IOException)throwable;
/*     */       }
/* 216 */       throw new RuntimeException(throwable);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String fetchString(ExecutionContext executionContext, FetchStringAction action) {
/* 222 */     return ((StringResponse)executeAction(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T fetchObject(ExecutionContext executionContext, FetchObjectAction<T> action) {
/* 227 */     return (T)((ObjectResponse)executeAction(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public long fetchLong(ExecutionContext executionContext, FetchLongAction action) {
/* 231 */     return ((LongResponse)executeAction(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public boolean fetchBoolean(ExecutionContext executionContext, FetchBooleanAction action) {
/* 235 */     return ((BooleanResponse)executeAction(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public int fetchInt(ExecutionContext executionContext, FetchLongAction action) {
/* 239 */     return (int)((LongResponse)executeAction(executionContext, (CommunicationAction)action)).getValue();
/*     */   }
/*     */   
/*     */   public Response executeAction(ExecutionContext executionContext, CommunicationAction action) {
/*     */     try {
/* 244 */       return executeActionInt(executionContext, action);
/* 245 */     } catch (Throwable throwable) {
/* 246 */       if (throwable instanceof Error)
/* 247 */         throw (Error)throwable; 
/* 248 */       if (throwable instanceof RuntimeException) {
/* 249 */         throw (RuntimeException)throwable;
/*     */       }
/* 251 */       throw new RuntimeException(throwable);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private Response executeActionInt(ExecutionContext executionContext, CommunicationAction action) throws Throwable {
/* 257 */     if (executionContext == null) executionContext = ExecutionContext.SAME;
/*     */     
/* 259 */     if (executionContext == ExecutionContext.ELEVATED) {
/* 260 */       if (isElevatedHelper()) {
/* 261 */         return executeActionDirect(action);
/*     */       }
/* 263 */       return executeOther(action);
/*     */     } 
/* 265 */     if (executionContext == ExecutionContext.UNELEVATED) {
/* 266 */       if (!isElevatedHelper() || !isConnected()) {
/* 267 */         return executeActionDirect(action);
/*     */       }
/* 269 */       return executeOther(action);
/*     */     } 
/* 271 */     if (executionContext == ExecutionContext.SAME)
/* 272 */       return executeActionDirect(action); 
/* 273 */     if (executionContext == ExecutionContext.OTHER)
/* 274 */       return executeOther(action); 
/* 275 */     if (executionContext == ExecutionContext.MAXIMUM) {
/* 276 */       if (isElevatedHelper() || !hasElevatedHelper()) {
/* 277 */         return executeActionDirect(action);
/*     */       }
/* 279 */       return executeOther(action);
/*     */     } 
/* 281 */     if (executionContext == ExecutionContext.ALL) {
/* 282 */       if (isConnected()) {
/* 283 */         executeOther(action);
/*     */       }
/* 285 */       return executeActionDirect(action);
/*     */     } 
/* 287 */     throw new RuntimeException("unknown ExecutionContext " + executionContext);
/*     */   }
/*     */ 
/*     */   
/*     */   private Response executeActionDirect(CommunicationAction action) throws Throwable {
/* 292 */     Response response = action.execute(getContext());
/* 293 */     if (response instanceof ThrowableResponse) {
/* 294 */       throw ((ThrowableResponse)response).getThrowable();
/*     */     }
/* 296 */     return response;
/*     */   }
/*     */   
/*     */   private Response executeOther(CommunicationAction action) throws Throwable {
/* 300 */     if (!isConnected()) throw new RuntimeException("other process not connected");
/*     */     
/*     */     try {
/*     */       Long id;
/* 304 */       synchronized (this.sendMonitor) {
/* 305 */         id = Long.valueOf(this.nextPacketId++);
/*     */       } 
/* 307 */       sendObject(new ActionWrapper(id.longValue(), action));
/* 308 */       if (!(action instanceof RunNoWaitAction)) {
/* 309 */         this.edtWaiting = (!isElevatedHelper() && SwingUtilities.isEventDispatchThread());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/*     */         
/*     */         } finally {
/* 333 */           if (this.edtWaiting && SwingUtilities.isEventDispatchThread()) {
/* 334 */             this.edtWaiting = false;
/*     */           }
/*     */         } 
/*     */       } 
/* 338 */       return null;
/*     */     }
/* 340 */     catch (IOException e) {
/* 341 */       Long id; if (!isElevatedHelper() && !this.terminated) {
/* 342 */         Logger.getInstance().log((Throwable)id);
/*     */       }
/* 344 */       throw new RuntimeException(id);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void terminate() {
/* 349 */     if (hasElevatedHelper() && isConnected()) {
/* 350 */       this.terminated = true;
/* 351 */       terminateInt();
/* 352 */       this.interProcessCommunication.setDisconnected();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void terminateInt() {
/*     */     try {
/* 358 */       getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new DirectRunAction()
/*     */           {
/*     */             protected void run(Context context) {
/* 361 */               (HelperCommunication.getInstance()).interProcessCommunication.setDisconnected();
/* 362 */               System.exit(0);
/*     */             }
/*     */           });
/* 365 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void executeActionWrapper(ActionWrapper actionWrapper, boolean sendResponse) {
/*     */     ThrowableResponse throwableResponse;
/*     */     try {
/* 373 */       Response response = actionWrapper.action.execute(getContext());
/* 374 */     } catch (Throwable t) {
/* 375 */       throwableResponse = new ThrowableResponse(t);
/*     */     } 
/* 377 */     if (sendResponse) {
/*     */       try {
/* 379 */         sendObject(new ResponseWrapper(actionWrapper.id, (Response)throwableResponse));
/* 380 */       } catch (Throwable e) {
/* 381 */         if (isElevatedHelper()) {
/* 382 */           e.printStackTrace();
/*     */         } else {
/* 384 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private Context getContext() {
/* 391 */     return (this.helperContext != null) ? (Context)this.helperContext : ContextImpl.getCurrentContext();
/*     */   }
/*     */   
/*     */   public static void helperUnsupported() throws NotSupportedInElevationException {
/* 395 */     if (getInstance().isElevatedHelper()) {
/* 396 */       throw new NotSupportedInElevationException();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkEdtWaiting() {
/* 401 */     HelperCommunication helperCommunication = getInstance();
/* 402 */     if (!helperCommunication.isElevatedHelper() && helperCommunication.isEdtWaiting()) {
/* 403 */       throw new RuntimeException("Unable to perform this operation from the elevated helper process because the EDT thread in the unelevated process is waiting for a reply.");
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean executeAsHelper(String[] args) {
/* 408 */     if (System.getProperty("install4j.helperAppId") != null) {
/* 409 */       main(args);
/* 410 */       return true;
/*     */     } 
/* 412 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private ActionWrapper getNextAction(boolean wait) {
/* 417 */     synchronized (this.actions) {
/* 418 */       if (wait) {
/* 419 */         while (this.actions.empty()) {
/*     */           try {
/* 421 */             this.actions.wait();
/* 422 */           } catch (InterruptedException interruptedException) {}
/*     */         } 
/*     */         
/* 425 */         return this.actions.pop();
/*     */       } 
/* 427 */       if (this.actions.empty()) {
/* 428 */         return null;
/*     */       }
/* 430 */       return this.actions.pop();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void checkWork() {}
/*     */ 
/*     */   
/*     */   public static abstract class RunNoWaitAction
/*     */     extends RunAction {}
/*     */ 
/*     */   
/*     */   public static abstract class DirectRunAction
/*     */     extends RunNoWaitAction {}
/*     */   
/*     */   private class ReaderThread
/*     */     extends Thread
/*     */   {
/*     */     private ReaderThread() {
/* 449 */       super("helper_ipc_reader");
/*     */     }
/*     */     
/*     */     public void handleData(Object data) {
/* 453 */       if (data instanceof HelperCommunication.ActionWrapper) {
/* 454 */         HelperCommunication.ActionWrapper actionWrapper = (HelperCommunication.ActionWrapper)data;
/* 455 */         if (actionWrapper.action instanceof HelperCommunication.DirectRunAction) {
/* 456 */           HelperCommunication.this.executeActionWrapper(actionWrapper, false);
/*     */         } else {
/* 458 */           synchronized (HelperCommunication.this.actions) {
/* 459 */             HelperCommunication.this.actions.push((HelperCommunication.ActionWrapper)data);
/* 460 */             HelperCommunication.this.actions.notifyAll();
/*     */           } 
/*     */           
/* 463 */           synchronized (HelperCommunication.this.responses) {
/* 464 */             HelperCommunication.this.responses.notifyAll();
/*     */           } 
/*     */         } 
/* 467 */       } else if (data instanceof HelperCommunication.ResponseWrapper) {
/* 468 */         synchronized (HelperCommunication.this.responses) {
/* 469 */           HelperCommunication.ResponseWrapper wrapper = (HelperCommunication.ResponseWrapper)data;
/* 470 */           HelperCommunication.this.responses.put(Long.valueOf(wrapper.id), wrapper.response);
/* 471 */           HelperCommunication.this.responses.notifyAll();
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/*     */       try {
/* 479 */         while (HelperCommunication.this.isConnected()) {
/* 480 */           handleData(HelperCommunication.this.readData());
/*     */         }
/* 482 */       } catch (Throwable e) {
/* 483 */         HelperCommunication.log(e);
/* 484 */         if (!HelperCommunication.this.terminated && !HelperCommunication.this.isElevatedHelper()) {
/* 485 */           Logger.getInstance().log(e);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public Object readData() throws IOException {
/* 492 */     byte[] bytes = this.interProcessCommunication.readDataBlock();
/* 493 */     ClassLoaderObjectInputStream classLoaderObjectInputStream = new ClassLoaderObjectInputStream((ClassLoader)Install4jClassLoader.getInstance(), new ByteArrayInputStream(bytes));
/*     */     try {
/* 495 */       return classLoaderObjectInputStream.readObject();
/* 496 */     } catch (ClassNotFoundException e) {
/* 497 */       throw new IOException(e.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void sendObject(Object data) throws IOException {
/*     */     try {
/* 503 */       synchronized (this.sendMonitor) {
/* 504 */         this.bout.reset();
/* 505 */         ObjectOutputStream oout = new ObjectOutputStream(this.dout);
/* 506 */         oout.writeObject(data);
/* 507 */         oout.close();
/* 508 */         this.interProcessCommunication.writeDataBlock(this.bout.toByteArray());
/*     */       } 
/* 510 */     } catch (InvalidClassException|java.io.NotSerializableException e) {
/* 511 */       Util.fatalError(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isConnected() {
/* 516 */     return this.interProcessCommunication.isConnected();
/*     */   }
/*     */   
/*     */   private static class ActionWrapper implements Serializable {
/*     */     long id;
/*     */     CommunicationAction action;
/*     */     
/*     */     private ActionWrapper(long id, CommunicationAction action) {
/* 524 */       this.id = id;
/* 525 */       this.action = action;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class ResponseWrapper implements Serializable {
/*     */     long id;
/*     */     Response response;
/*     */     
/*     */     private ResponseWrapper(long id, Response response) {
/* 534 */       this.id = id;
/* 535 */       this.response = response;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 540 */     InstallerUtil.setStartupVmParameters();
/* 541 */     if ("yes".equals(System.getenv("I4J_LOG_HELPER")) || Boolean.getBoolean("install4j.helperLog")) {
/*     */       try {
/* 543 */         File tempFile = Util.isMacOS() ? new File("/var/tmp/i4j_helper.log") : File.createTempFile("i4j_helper", ".log");
/* 544 */         debugLogWriter = new PrintStream(new FileOutputStream(tempFile), true);
/* 545 */         System.setErr(debugLogWriter);
/* 546 */         System.setOut(debugLogWriter);
/* 547 */       } catch (IOException iOException) {}
/*     */     }
/*     */     
/* 550 */     log("Started helper");
/* 551 */     InstallerUtil.setUnattended(true);
/* 552 */     InstallerConfig.setCurrentApplicationId(System.getProperty("install4j.helperAppId"));
/* 553 */     NativeLogger.registerCleanup();
/* 554 */     getInstance().connect();
/*     */   }
/*     */   
/*     */   public static synchronized void log(String msg) {
/* 558 */     if (debugLogWriter != null) {
/* 559 */       debugLogWriter.println(DateFormat.getTimeInstance().format(new Date()) + ": " + msg);
/* 560 */       debugLogWriter.flush();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static synchronized void log(Throwable t) {
/* 565 */     if (debugLogWriter != null) {
/* 566 */       debugLogWriter.println(DateFormat.getTimeInstance().format(new Date()) + ":");
/* 567 */       t.printStackTrace(debugLogWriter);
/* 568 */       debugLogWriter.flush();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean getUnelevatedBooleanProperty(final String propertyName) {
/* 573 */     return getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 576 */             return Boolean.getBoolean(propertyName);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static void setUnelevatedBooleanProperty(final String propertyName, final boolean value) {
/* 582 */     getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 585 */             System.setProperty(propertyName, String.valueOf(value));
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static String getUnelevatedProperty(final String propertyName) {
/* 591 */     return getInstance().fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) throws Exception {
/* 594 */             return System.getProperty(propertyName);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\HelperCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */