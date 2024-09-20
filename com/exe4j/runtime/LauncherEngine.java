/*     */ package com.exe4j.runtime;
/*     */ 
/*     */ import com.exe4j.runtime.gui.InternalErrorFrame;
/*     */ import com.exe4j.runtime.util.LazyFileOutputStream;
/*     */ import com.exe4j.runtime.util.NullOutputStream;
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class LauncherEngine
/*     */ {
/*     */   public static final String MODULE_HANDLER_CLASS_NAME = "com.exe4j.runtime.jpms.ModuleHandler";
/*     */   public static final String EMPTY_REDIRECTION_PLACEHOLDER = "0";
/*     */   private static Properties properties;
/*     */   public static final String DEV_NULL = "/dev/null";
/*     */   public static final String PROPNAME_MODULE_NAME = "exe4j.moduleName";
/*     */   public static final String PROPNAME_APP_DIR = "install4j.appDir";
/*     */   public static final String PROPNAME_EXE_DIR = "install4j.exeDir";
/*     */   public static final String PROPNAME_NO_REDIRECTION = "install4j.noRedir";
/*     */   public static final int EXE4J_MAGIC = -387705899;
/*     */   private static IntegrationChecker integrationChecker;
/*     */   
/*     */   public static void setIntegrationChecker(IntegrationChecker integrationChecker) {
/*  31 */     LauncherEngine.integrationChecker = integrationChecker;
/*     */   }
/*     */   
/*     */   public static void launch(String className, String[] args, String stdErrFile, String stdOutFile, boolean failOnMainMethodException, boolean guiApplication, ClassLoader classLoader) {
/*  35 */     if (Boolean.getBoolean("install4j.noRedir")) {
/*  36 */       stdErrFile = "";
/*  37 */       stdOutFile = "";
/*     */     } 
/*  39 */     stdErrFile = replaceRedirectionFile(stdErrFile);
/*  40 */     stdOutFile = replaceRedirectionFile(stdOutFile);
/*     */     
/*  42 */     String moduleName = System.getProperty("exe4j.moduleName");
/*  43 */     if (moduleName != null) {
/*     */       try {
/*  45 */         System.setProperty("install4j.exeDir", (new File(moduleName)).getParentFile().getCanonicalPath() + File.separator);
/*  46 */       } catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */     
/*  50 */     if (!WinLauncher.isUsed() || WinLauncher.APP_MODE_INSTALL4J) {
/*  51 */       File runtimeDir = ResourceHelper.getRuntimeDir();
/*  52 */       if (runtimeDir != null) {
/*  53 */         System.setProperty("install4j.appDir", runtimeDir.getParentFile().getAbsolutePath() + File.separator);
/*     */       }
/*     */     } 
/*     */     
/*     */     try {
/*     */       try {
/*  59 */         doRedirection(stdErrFile, stdOutFile);
/*  60 */       } catch (Throwable e) {
/*     */         
/*  62 */         e.printStackTrace();
/*     */       } 
/*     */       
/*  65 */       if (integrationChecker != null) {
/*  66 */         integrationChecker.checkIntegrations(args);
/*     */       }
/*     */ 
/*     */       
/*     */       try {
/*  71 */         Class<?> mainClass, mainParamClasses[] = new Class[1];
/*  72 */         mainParamClasses[0] = String[].class;
/*     */         
/*  74 */         Object[] mainParams = new Object[1];
/*  75 */         mainParams[0] = args;
/*     */         
/*  77 */         if (className.startsWith("/")) {
/*  78 */           mainClass = (Class)Class.forName("com.exe4j.runtime.jpms.ModuleHandler").getMethod("findClass", new Class[] { String.class }).invoke(null, new Object[] { className.substring(1) });
/*     */         } else {
/*  80 */           mainClass = classLoader.loadClass(className);
/*     */         } 
/*  82 */         Method mainMethod = mainClass.getDeclaredMethod("main", mainParamClasses);
/*  83 */         mainMethod.setAccessible(true);
/*  84 */         mainMethod.invoke(null, mainParams);
/*  85 */       } catch (InvocationTargetException e) {
/*  86 */         Throwable cause = e.getCause();
/*  87 */         handleFailure(failOnMainMethodException, guiApplication, (cause != null) ? cause : e);
/*  88 */       } catch (Throwable t) {
/*  89 */         handleFailure(failOnMainMethodException, guiApplication, t);
/*     */       }
/*     */     
/*  92 */     } catch (Throwable t) {
/*  93 */       handleFailure(true, guiApplication, t);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String replaceRedirectionFile(String fileName) {
/*  98 */     return replaceUserHome(replaceEmptyPlaceHolder(fileName));
/*     */   }
/*     */   
/*     */   private static String replaceEmptyPlaceHolder(String fileName) {
/* 102 */     if ("0".equals(fileName)) {
/* 103 */       return "";
/*     */     }
/* 105 */     return fileName;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String replaceUserHome(String fileName) {
/* 110 */     if (fileName != null && fileName.startsWith("~")) {
/* 111 */       return System.getProperty("user.home") + fileName.substring(1);
/*     */     }
/* 113 */     return fileName;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getProperty(int key) {
/* 118 */     return properties.getProperty(String.valueOf(key));
/*     */   }
/*     */   
/*     */   public static boolean getBooleanProperty(int key) {
/*     */     try {
/* 123 */       String stringValue = getProperty(key);
/* 124 */       if (stringValue == null || stringValue.isEmpty()) {
/* 125 */         return false;
/*     */       }
/* 127 */       return (Integer.parseInt(stringValue) == 1);
/* 128 */     } catch (NumberFormatException e) {
/* 129 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int getIntProperty(int key) {
/*     */     try {
/* 135 */       String stringValue = getProperty(key);
/* 136 */       if (stringValue == null || stringValue.isEmpty()) {
/* 137 */         return 0;
/*     */       }
/* 139 */       return Integer.parseInt(stringValue);
/* 140 */     } catch (NumberFormatException e) {
/* 141 */       return 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setProperties(Properties properties) {
/* 149 */     LauncherEngine.properties = properties;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void handleFailure(boolean failOnMainMethodException, boolean guiApplication, Throwable t) {
/* 154 */     if (t != null) {
/* 155 */       t.printStackTrace();
/*     */     }
/* 157 */     if (failOnMainMethodException) {
/*     */       try {
/* 159 */         if (!guiApplication || !InternalErrorFrame.Invoker.showLaterIfNotHeadless(t)) {
/* 160 */           System.exit(1);
/*     */         }
/* 162 */       } catch (Throwable ignored) {
/* 163 */         System.exit(1);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static void doRedirection(String stdErrFile, String stdOutFile) throws FileNotFoundException {
/* 169 */     PrintStream out = null;
/* 170 */     if (stdOutFile.equals("/dev/null")) {
/* 171 */       System.setOut(new PrintStream((OutputStream)new NullOutputStream()));
/* 172 */     } else if (stdOutFile.length() > 0 && checkRedirectionFile(stdOutFile)) {
/* 173 */       out = new PrintStream(new BufferedOutputStream((OutputStream)new LazyFileOutputStream(stdOutFile)), true);
/* 174 */       System.setOut(out);
/*     */     } 
/*     */     
/* 177 */     if (stdErrFile.equals("/dev/null")) {
/* 178 */       System.setErr(new PrintStream((OutputStream)new NullOutputStream()));
/* 179 */     } else if (stdErrFile.length() > 0 && checkRedirectionFile(stdErrFile)) {
/*     */       PrintStream err;
/* 181 */       if (stdErrFile.equalsIgnoreCase(stdOutFile)) {
/* 182 */         err = out;
/*     */       } else {
/* 184 */         err = new PrintStream((OutputStream)new LazyFileOutputStream(stdErrFile), true);
/*     */       } 
/* 186 */       System.setErr(err);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean checkRedirectionFile(String fileName) throws FileNotFoundException {
/* 192 */     File file = new File(fileName);
/* 193 */     File parentFile = file.getParentFile();
/* 194 */     parentFile.mkdirs();
/* 195 */     if (!parentFile.exists()) {
/* 196 */       throw new FileNotFoundException("log file directory '" + parentFile + "' doesn't exist.");
/*     */     }
/* 198 */     if (file.exists()) {
/* 199 */       return file.canWrite();
/*     */     }
/* 201 */     return parentFile.canWrite();
/*     */   }
/*     */   
/*     */   public static interface IntegrationChecker {
/*     */     void checkIntegrations(String[] param1ArrayOfString);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\LauncherEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */