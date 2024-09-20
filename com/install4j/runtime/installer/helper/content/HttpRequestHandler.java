/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.ErrorHandlingCallback;
/*     */ import com.install4j.api.beans.ErrorHandlingMode;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import com.install4j.runtime.launcher.Launcher;
/*     */ import java.io.Closeable;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.util.Collections;
/*     */ import java.util.IdentityHashMap;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.net.ssl.SSLHandshakeException;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class HttpRequestHandler
/*     */   implements Closeable
/*     */ {
/*     */   public static final int MODE_GUI = 1;
/*     */   public static final int MODE_CONSOLE = 2;
/*     */   public static final int MODE_UNATTENDED = 3;
/*     */   public static final String USER_AGENT_HEADER = "User-Agent";
/*     */   public static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64)";
/*     */   public static final String SYSPROP_SHOW_CONNECT_ERROR = "install4j.showConnectError";
/*     */   private static final String SYSPROP_NO_PROXY = "install4j.noProxy";
/*     */   private static final String SYSPROP_CONNECT_TIMEOUT = "install4j.connectTimeout";
/*     */   private static final String SYSPROP_INSTALL4J_READ_TIMEOUT = "install4j.readTimeout";
/*     */   private Context context;
/*     */   private ErrorHandlingCallback errorHandlingCallback;
/*     */   private boolean acceptAllCertificates = false;
/*     */   private HttpConnection connection;
/*     */   private int mode;
/*  48 */   private Map<String, List<String>> requestHeaders = new LinkedHashMap<>();
/*  49 */   private int connectTimeout = 10000;
/*  50 */   private int readTimeout = 10000;
/*     */   
/*     */   private boolean readResponse = true;
/*     */   private boolean readErrors = false;
/*     */   private volatile boolean canceled;
/*     */   
/*     */   protected HttpRequestHandler(Context context) {
/*  57 */     this(context, InstallerUtil.isUnattendedWithoutAlerts() ? 3 : (context.isConsole() ? 2 : 1));
/*     */   }
/*     */   
/*     */   protected HttpRequestHandler(Context context, int mode) {
/*  61 */     this.context = context;
/*  62 */     this.mode = mode;
/*     */   }
/*     */   
/*     */   public void cancel() {
/*  66 */     this.canceled = true;
/*     */   }
/*     */   
/*     */   public HttpConnection getConnection() {
/*  70 */     return this.connection;
/*     */   }
/*     */   
/*     */   public void setErrorHandlingCallback(ErrorHandlingCallback errorHandlingCallback) {
/*  74 */     this.errorHandlingCallback = errorHandlingCallback;
/*     */   }
/*     */   
/*     */   public void setRequestHeaders(Map<String, List<String>> requestHeaders) {
/*  78 */     this.requestHeaders = requestHeaders;
/*     */   }
/*     */   
/*     */   public void setConnectTimeout(int connectTimeout) {
/*  82 */     this.connectTimeout = connectTimeout;
/*     */   }
/*     */   
/*     */   public void setReadTimeout(int readTimeout) {
/*  86 */     this.readTimeout = readTimeout;
/*     */   }
/*     */   
/*     */   public void setAcceptAllCertificates(boolean acceptAllCertificates) {
/*  90 */     this.acceptAllCertificates = acceptAllCertificates;
/*     */   }
/*     */   
/*     */   public void setReadResponse(boolean readResponse) {
/*  94 */     this.readResponse = readResponse;
/*     */   }
/*     */   
/*     */   protected boolean isReadResponse() {
/*  98 */     return this.readResponse;
/*     */   }
/*     */   
/*     */   public boolean isReadErrors() {
/* 102 */     return this.readErrors;
/*     */   }
/*     */   
/*     */   public void setReadErrors(boolean readErrors) {
/* 106 */     this.readErrors = readErrors;
/*     */   }
/*     */   
/*     */   protected Context getContext() {
/* 110 */     return this.context;
/*     */   }
/*     */   
/*     */   public HttpRequestHandler connect(String urlString) throws IOException, UserCanceledException {
/* 114 */     return connect(urlString, null);
/*     */   }
/*     */   
/*     */   public HttpRequestHandler connect(String urlString, ConnectionPreparer connectionPreparer) throws IOException, UserCanceledException {
/*     */     try {
/* 119 */       close();
/* 120 */       URL url = new URL(urlString);
/* 121 */       String protocol = url.getProtocol().toLowerCase(Locale.ROOT);
/* 122 */       if (Util.isWindows() && 
/* 123 */         !Boolean.getBoolean("install4j.noWinInetConnection") && 
/* 124 */         !Boolean.getBoolean("install4j.fromService") && 
/* 125 */         !Launcher.isService() && (
/* 126 */         isProtocolWithoutExternalProxyProperty(protocol, "http") || 
/* 127 */         isProtocolWithoutExternalProxyProperty(protocol, "https"))) {
/*     */         
/* 129 */         createWindowsConnection(url, connectionPreparer);
/*     */       } else {
/* 131 */         createJavaConnection(url, connectionPreparer);
/*     */       } 
/* 133 */     } catch (IOException|RuntimeException e) {
/* 134 */       Set<Throwable> throwables = Collections.newSetFromMap(new IdentityHashMap<>());
/* 135 */       Throwable cause = e.getCause();
/* 136 */       while (cause != null && throwables.add(cause)) {
/* 137 */         if (cause instanceof UserCanceledException) {
/* 138 */           throw (UserCanceledException)cause;
/*     */         }
/* 140 */         cause = cause.getCause();
/*     */       } 
/* 142 */       throw e;
/*     */     } 
/* 144 */     return this;
/*     */   }
/*     */   
/*     */   private boolean isProtocolWithoutExternalProxyProperty(String protocol, String target) {
/* 148 */     return (protocol.equals(target) && System.getProperty(target + ".proxyHost") == null);
/*     */   }
/*     */   
/*     */   protected void createWindowsConnection(URL url, ConnectionPreparer connectionPreparer) throws IOException, UserCanceledException {
/* 152 */     WinInetCallWrapper connection = new WinInetCallWrapper(url, this.acceptAllCertificates, this.mode);
/* 153 */     prepareConnection(connection, connectionPreparer);
/* 154 */     connection.connect();
/* 155 */     connectionInitialized(connection);
/* 156 */     this.connection = connection;
/*     */   }
/*     */   
/*     */   private void createJavaConnection(URL url, ConnectionPreparer connectionPreparer) throws IOException, UserCanceledException {
/* 160 */     JavaHttpConnection javaHttpConnection = getURLConnection(url, connectionPreparer);
/* 161 */     this.connection = javaHttpConnection;
/* 162 */     connectionInitialized(this.connection);
/* 163 */     if (isReadResponse()) {
/*     */       try {
/* 165 */         getUsedInputStream();
/* 166 */       } catch (IOException e) {
/* 167 */         Proxy proxy = javaHttpConnection.getProxy();
/* 168 */         String message = "Used proxy " + proxy;
/* 169 */         if (this.context != null) {
/* 170 */           ContextInt contextInt = ContextImpl.getContextInt(this.context);
/* 171 */           if (contextInt != null) {
/* 172 */             Logger.getInstance().info(contextInt.getEventSource(), message);
/*     */           }
/* 174 */         } else if (Boolean.getBoolean("install4j.showConnectError")) {
/* 175 */           System.err.println(message);
/*     */         } 
/* 177 */         throw e;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected InputStream getUsedInputStream() throws IOException {
/* 183 */     if (this.readErrors) {
/* 184 */       return this.connection.getErrorStream();
/*     */     }
/* 186 */     return this.connection.getInputStream();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void connectionInitialized(HttpConnection connection) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void disconnect() throws IOException {
/* 196 */     getUsedInputStream().close();
/*     */   }
/*     */   
/*     */   protected boolean isCancelled() {
/* 200 */     return ((this.context != null && this.context.isCancelling()) || this.canceled);
/*     */   }
/*     */   
/*     */   private JavaHttpConnection getURLConnection(URL url, ConnectionPreparer connectionPreparer) throws IOException, UserCanceledException {
/*     */     Proxy proxy;
/* 205 */     if (Boolean.getBoolean("install4j.noProxy")) {
/* 206 */       proxy = Proxy.NO_PROXY;
/*     */     } else {
/* 208 */       proxy = ProxyHelper.getProxyHostInfo(url);
/*     */     } 
/* 210 */     HttpAuthenticator.setRequestHandler(this);
/* 211 */     if (Boolean.getBoolean("install4j.debugProxy")) {
/* 212 */       System.err.println("used proxy = " + proxy);
/*     */     }
/*     */     
/* 215 */     int redirectCount = 0;
/*     */     while (true) {
/* 217 */       if (this.context != null && this.context.isCancelling()) {
/* 218 */         throw new UserCanceledException();
/*     */       }
/*     */       try {
/* 221 */         JavaHttpConnection connection = VersionSpecificHelper.createHttpConnection(url, proxy, this.acceptAllCertificates);
/* 222 */         prepareConnection(connection, connectionPreparer);
/* 223 */         connection.connect();
/* 224 */         int responseCode = connection.getResponseCode();
/* 225 */         if (responseCode == 302 || responseCode == 301) {
/* 226 */           if (redirectCount++ < 5) {
/* 227 */             String location = connection.getHeaderField("Location");
/* 228 */             if (location == null) {
/* 229 */               throw new IOException("Location header missing for response code " + responseCode);
/*     */             }
/* 231 */             url = new URL(location);
/*     */             continue;
/*     */           } 
/* 234 */           System.err.println("Too many redirects");
/*     */         } 
/*     */ 
/*     */         
/* 238 */         if (Boolean.getBoolean("install4j.showConnectError")) {
/* 239 */           System.err.println("response code = " + connection.getResponseCode());
/* 240 */           System.err.println("header fields = " + connection.getHeaderFields());
/*     */         } 
/* 242 */         return connection;
/* 243 */       } catch (SSLHandshakeException|java.io.FileNotFoundException e) {
/* 244 */         throw e;
/* 245 */       } catch (IOException|IllegalArgumentException e) {
/* 246 */         if (!handleFailure(e)) {
/* 247 */           throw e;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void prepareConnection(HttpConnection connection, ConnectionPreparer connectionPreparer) throws IOException {
/* 255 */     if (!Boolean.getBoolean("install4j.noClientHttpProperty")) {
/* 256 */       connection.addRequestProperty("X-Client-Application", "install4j");
/*     */     }
/* 258 */     connection.setConnectTimeout(Integer.getInteger("install4j.connectTimeout", this.connectTimeout).intValue());
/* 259 */     connection.setReadTimeout(Integer.getInteger("install4j.readTimeout", this.readTimeout).intValue());
/* 260 */     for (Map.Entry<String, List<String>> entry : this.requestHeaders.entrySet()) {
/* 261 */       String key = entry.getKey();
/* 262 */       List<String> values = entry.getValue();
/* 263 */       if (!key.isEmpty()) {
/* 264 */         for (String value : values) {
/* 265 */           if (!value.isEmpty()) {
/* 266 */             connection.addRequestProperty(key, value);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 271 */     String cookies = HelperCommunication.getUnelevatedProperty("install4j.cookies");
/* 272 */     if (cookies != null && !this.requestHeaders.containsKey("Cookie")) {
/* 273 */       connection.setRequestProperty("Cookie", cookies);
/*     */     }
/* 275 */     connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64)");
/* 276 */     if (connectionPreparer != null) {
/* 277 */       connectionPreparer.prepare(connection);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean handleFailure(Exception e) throws IOException, UserCanceledException {
/* 282 */     if (this.errorHandlingCallback != null) {
/* 283 */       ErrorHandlingMode errorHandlingMode = this.errorHandlingCallback.errorOccurred(e);
/* 284 */       if (errorHandlingMode != null) {
/* 285 */         switch (errorHandlingMode) {
/*     */           case CANCEL:
/* 287 */             return false;
/*     */           case RETRY:
/* 289 */             return true;
/*     */         } 
/*     */       }
/*     */     } 
/* 293 */     return false;
/*     */   }
/*     */   
/*     */   public int getMode() {
/* 297 */     return this.mode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 302 */     HttpConnection connection = this.connection;
/* 303 */     if (connection != null)
/* 304 */       connection.close(); 
/*     */   }
/*     */   
/*     */   public static interface ConnectionPreparer {
/*     */     void prepare(HttpConnection param1HttpConnection) throws IOException;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\HttpRequestHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */