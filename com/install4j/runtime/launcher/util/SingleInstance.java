/*     */ package com.install4j.runtime.launcher.util;
/*     */ import com.install4j.runtime.launcher.LauncherHelper;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FilenameFilter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.nio.channels.FileLock;
/*     */ import java.nio.channels.OverlappingFileLockException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.util.Deque;
/*     */ import java.util.List;
/*     */ 
/*     */ public class SingleInstance {
/*  19 */   private static final Deque<String> performedStartups = new ArrayDeque<String>();
/*     */   
/*  21 */   private static final int NOTIFICATION_WAIT_TIME = Integer.getInteger("install4j.notificationWaitTime", 5).intValue();
/*     */   
/*     */   private static final String FINISHED_SUFFIX = ".f";
/*     */   
/*     */   private static SingleInstanceListener listener;
/*     */   private static boolean checkUsedForCurrentLauncher = false;
/*     */   
/*     */   public static synchronized void checkForCurrentLauncher(File launcherPath, boolean global, String[] arguments) {
/*  29 */     if (!checkUsedForCurrentLauncher) {
/*  30 */       checkUsedForCurrentLauncher = true;
/*     */       try {
/*  32 */         Runnable shutdownRunnable = check(launcherPath, global, arguments);
/*  33 */         if (shutdownRunnable == null) {
/*  34 */           System.exit(0);
/*     */         } else {
/*  36 */           Runtime.getRuntime().addShutdownHook(new Thread(shutdownRunnable));
/*     */         } 
/*  38 */       } catch (IOException e) {
/*  39 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean checkInProcessAndRun(File launcherPath, Runnable runnable) {
/*  45 */     Runnable shutdownRunnable = null;
/*     */     try {
/*  47 */       shutdownRunnable = check(launcherPath, false, null);
/*  48 */       if (shutdownRunnable == null) {
/*  49 */         return false;
/*     */       }
/*  51 */     } catch (IOException e) {
/*  52 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  55 */       runnable.run();
/*     */     } finally {
/*  57 */       if (shutdownRunnable != null) {
/*  58 */         shutdownRunnable.run();
/*     */       }
/*     */     } 
/*  61 */     return true;
/*     */   }
/*     */   private static synchronized Runnable check(File launcherPath, boolean global, String[] arguments) throws IOException {
/*     */     final File lockFile;
/*  65 */     String userName = System.getProperty("user.name", "");
/*     */     
/*  67 */     File baseDir = getLockFileDir();
/*  68 */     baseDir.mkdirs();
/*     */     
/*  70 */     if (global) {
/*  71 */       File globalFileDir = new File(baseDir, "i4j_launcher_locks");
/*  72 */       if (globalFileDir.mkdir()) {
/*  73 */         LauncherHelper.INSTANCE.setPosixFilePermissions(globalFileDir, "777");
/*     */       }
/*  75 */       lockFile = new File(globalFileDir, "i4j_" + getPathHash(launcherPath, "") + ".lock");
/*     */     } else {
/*  77 */       lockFile = new File(baseDir, "i4j_" + getPathHash(launcherPath, userName) + ".lock");
/*     */     } 
/*  79 */     final File notificationDir = new File(baseDir, "i4j_" + getPathHash(launcherPath, userName) + ".notify");
/*  80 */     boolean locked = true;
/*  81 */     final RandomAccessFile randomAccessFile = new RandomAccessFile(lockFile, "rw");
/*     */     try {
/*  83 */       FileLock fileLock = randomAccessFile.getChannel().tryLock();
/*  84 */       if (fileLock == null) {
/*  85 */         locked = false;
/*     */       }
/*  87 */     } catch (OverlappingFileLockException e) {
/*  88 */       locked = false;
/*     */     } 
/*  90 */     if (locked) {
/*  91 */       if (global) {
/*  92 */         LauncherHelper.INSTANCE.setPosixFilePermissions(lockFile, "666");
/*     */       }
/*  94 */       Runnable shutdownRunnable = new Runnable()
/*     */         {
/*     */           public void run() {
/*  97 */             notificationDir.delete();
/*     */             try {
/*  99 */               randomAccessFile.close();
/* 100 */             } catch (IOException e) {
/* 101 */               e.printStackTrace();
/*     */             } 
/* 103 */             lockFile.delete();
/*     */           }
/*     */         };
/* 106 */       if (arguments != null) {
/* 107 */         createStartupListener(notificationDir);
/*     */       }
/* 109 */       return shutdownRunnable;
/*     */     } 
/* 111 */     randomAccessFile.close();
/* 112 */     if (!Launcher.JAVA_1_6 && arguments != null) {
/* 113 */       boolean longWait = true;
/* 114 */       if (global) {
/* 115 */         String lockFileOwner = LauncherHelper.INSTANCE.getUnixOwner(lockFile);
/* 116 */         longWait = (lockFileOwner == null || !isValidUserName(userName) || lockFileOwner.equals(userName));
/*     */       } 
/*     */       try {
/* 119 */         notifyLaunch(arguments, notificationDir, longWait);
/* 120 */       } catch (Exception e) {
/* 121 */         if (Boolean.getBoolean("install4j.debugStartupNotification")) {
/* 122 */           e.printStackTrace();
/*     */         }
/*     */       } 
/*     */     } 
/* 126 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isValidUserName(String userName) {
/* 131 */     return (!userName.isEmpty() && !userName.startsWith("?"));
/*     */   }
/*     */   
/*     */   private static void createStartupListener(final File notificationDir) {
/* 135 */     LauncherHelper.INSTANCE.watchDirectory(notificationDir, "700", "install4j startup listener", new Runnable()
/*     */         {
/*     */           public void run() {
/* 138 */             File[] files = notificationDir.listFiles(new FilenameFilter()
/*     */                 {
/*     */                   public boolean accept(File dir, String name) {
/* 141 */                     return name.endsWith(".f");
/*     */                   }
/*     */                 });
/* 144 */             if (files != null) {
/* 145 */               for (File file : files) {
/* 146 */                 String arguments = SingleInstance.readArguments(file);
/* 147 */                 file.delete();
/*     */                 
/* 149 */                 synchronized (SingleInstance.performedStartups) {
/* 150 */                   if (SingleInstance.listener != null) {
/* 151 */                     SingleInstance.listener.startupPerformed(arguments);
/*     */                   } else {
/* 153 */                     SingleInstance.performedStartups.add(arguments);
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             }
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static String readArguments(File file) {
/* 163 */     List<String> args = new ArrayList<String>();
/* 164 */     BufferedReader reader = null;
/*     */     try {
/* 166 */       reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
/* 167 */       String arg = reader.readLine();
/* 168 */       while (arg != null) {
/* 169 */         args.add(arg);
/* 170 */         arg = reader.readLine();
/*     */       } 
/* 172 */     } catch (IOException e) {
/* 173 */       e.printStackTrace();
/*     */     } finally {
/* 175 */       if (reader != null) {
/*     */         try {
/* 177 */           reader.close();
/* 178 */         } catch (IOException e) {
/* 179 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*     */     } 
/* 183 */     if (args.isEmpty()) {
/* 184 */       return "";
/*     */     }
/* 186 */     StringBuilder builder = new StringBuilder();
/* 187 */     for (String arg : args) {
/* 188 */       if (builder.length() > 0 && arg.length() > 0) {
/* 189 */         builder.append(" ");
/*     */       }
/* 191 */       builder.append(quoteArgument(arg));
/*     */     } 
/* 193 */     return builder.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static String quoteArgument(String argument) {
/* 198 */     if (argument.contains("\""))
/* 199 */       return '\'' + argument + '\''; 
/* 200 */     if (argument.contains("'") || argument.contains(" ")) {
/* 201 */       return '"' + argument + '"';
/*     */     }
/* 203 */     return argument;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void notifyLaunch(String[] arguments, File notificationDir, boolean longWait) throws IOException {
/* 208 */     if (longWait) {
/* 209 */       for (int i = 0; i < 10 * NOTIFICATION_WAIT_TIME && !notificationDir.isDirectory(); i++) {
/*     */         try {
/* 211 */           Thread.sleep(100L);
/* 212 */         } catch (InterruptedException e) {
/* 213 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/* 216 */     } else if (!notificationDir.isDirectory()) {
/*     */       try {
/* 218 */         Thread.sleep(100L);
/* 219 */       } catch (InterruptedException e) {
/* 220 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/* 223 */     if (notificationDir.isDirectory()) {
/* 224 */       File tempFile = File.createTempFile("launch", ".tmp", notificationDir);
/* 225 */       PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(tempFile)), "UTF-8"));
/* 226 */       for (String argument : arguments) {
/* 227 */         pw.println(argument);
/*     */       }
/* 229 */       pw.close();
/* 230 */       tempFile.renameTo(new File(notificationDir, tempFile.getName() + ".f"));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static File getLockFileDir() {
/* 235 */     return new File(System.getProperty("install4j.lockFileDir", System.getProperty("java.io.tmpdir")));
/*     */   }
/*     */   
/*     */   public static String getPathHash(File installationPath, String suffix) {
/* 239 */     String pathHash = "unknown";
/*     */     try {
/* 241 */       pathHash = Base64.encodeForFiles(MessageDigest.getInstance("SHA-1").digest((FileUtil.getCanonicalPath(installationPath) + suffix).getBytes("UTF-8")));
/* 242 */     } catch (NoSuchAlgorithmException e) {
/* 243 */       e.printStackTrace();
/* 244 */     } catch (UnsupportedEncodingException e) {
/* 245 */       e.printStackTrace();
/*     */     } 
/* 247 */     return pathHash;
/*     */   }
/*     */   
/*     */   public static void registerStartupListener(SingleInstanceListener listener) {
/* 251 */     synchronized (performedStartups) {
/* 252 */       SingleInstance.listener = listener;
/* 253 */       if (listener != null)
/* 254 */         while (!performedStartups.isEmpty())
/* 255 */           listener.startupPerformed(performedStartups.removeFirst());  
/*     */     } 
/*     */   }
/*     */   
/*     */   public static interface SingleInstanceListener {
/*     */     void startupPerformed(String param1String);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launche\\util\SingleInstance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */