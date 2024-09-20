/*     */ package com.install4j.runtime.launcher;
/*     */ 
/*     */ import com.exe4j.runtime.LauncherEngine;
/*     */ import com.exe4j.runtime.WinLauncher;
/*     */ import com.exe4j.runtime.splash.SplashEngine;
/*     */ import com.exe4j.runtime.splash.SplashScreenConfig;
/*     */ import com.exe4j.runtime.util.ArgumentStack;
/*     */ import com.install4j.runtime.launcher.service.UnixServiceHandler;
/*     */ import com.install4j.runtime.launcher.util.ErrorHandler;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Launcher
/*     */ {
/*  17 */   public static final boolean JAVA_1_6 = System.getProperty("java.version", "").startsWith("1.6");
/*     */   
/*     */   private static String[] originalArgs;
/*     */   
/*     */   public static void main(String[] args) {
/*  22 */     LauncherHelper.INSTANCE.initIntegration();
/*  23 */     args = LauncherHelper.INSTANCE.initVariables(Launcher.class, args);
/*     */     
/*     */     try {
/*  26 */       ArgumentStack argStack = new ArgumentStack(args);
/*     */       
/*  28 */       String method = argStack.popString();
/*     */       
/*  30 */       if (method.equals("stop")) {
/*  31 */         UnixServiceHandler.INSTANCE.setStop();
/*  32 */       } else if (method.equals("status")) {
/*  33 */         UnixServiceHandler.INSTANCE.reportStatus();
/*     */       } else {
/*  35 */         SplashScreenConfig splashScreenConfig; String className = argStack.popString();
/*     */         
/*  37 */         boolean isGuiApplication = argStack.popBoolean();
/*  38 */         ErrorHandler.setIsGuiApplication(isGuiApplication);
/*     */         
/*  40 */         boolean isEvaluation = argStack.popBoolean();
/*     */         
/*  42 */         String stdErrFile = argStack.popString();
/*  43 */         String stdOutFile = argStack.popString();
/*  44 */         boolean failOnMainMethodException = argStack.popBoolean();
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/*  49 */           splashScreenConfig = (new SplashScreenConfig()).init(argStack);
/*  50 */           originalArgs = getArgumentArray(argStack, Boolean.getBoolean("i4j.vpt"));
/*  51 */         } catch (Exception e) {
/*  52 */           originalArgs = new String[0];
/*  53 */           splashScreenConfig = new SplashScreenConfig();
/*     */         } 
/*  55 */         SplashEngine.setJavaSplashScreenConfig(true, splashScreenConfig);
/*     */         
/*  57 */         if (method.equals("launch")) {
/*  58 */           LauncherEngine.launch(className, originalArgs, stdErrFile, stdOutFile, failOnMainMethodException, isGuiApplication, ClassLoader.getSystemClassLoader());
/*  59 */         } else if (method.equals("start")) {
/*  60 */           if (isEvaluation) {
/*  61 */             System.out.println("This daemon was created with an evaluation version of install4j.");
/*     */           }
/*  63 */           UnixServiceHandler.INSTANCE.setStart();
/*  64 */           LauncherEngine.launch(className, originalArgs, stdErrFile, stdOutFile, failOnMainMethodException, isGuiApplication, ClassLoader.getSystemClassLoader());
/*     */         } 
/*     */       } 
/*  67 */     } catch (Exception e) {
/*  68 */       e.printStackTrace();
/*  69 */       ErrorHandler.reportError(e.toString());
/*  70 */       System.exit(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   static String[] getArgumentArray(ArgumentStack argStack, boolean removeVmPassThrough) {
/*  75 */     int numArgs = argStack.popInt();
/*  76 */     if (numArgs == -1) {
/*  77 */       numArgs = argStack.size();
/*     */     }
/*  79 */     return getArgumentArray(argStack, numArgs, removeVmPassThrough);
/*     */   }
/*     */   
/*     */   static String[] getArgumentArray(ArgumentStack argStack, int numArgs, boolean removeVmPassThrough) {
/*  83 */     boolean removeJvmParameter = LauncherEngine.getBooleanProperty(169);
/*  84 */     List<String> ret = new ArrayList<String>();
/*  85 */     for (int i = 0; i < numArgs; i++) {
/*  86 */       String singleArg = argStack.popString();
/*  87 */       boolean remove = ((removeVmPassThrough && singleArg.startsWith("-J")) || (removeJvmParameter && singleArg.startsWith("-jvm=")));
/*  88 */       if (!remove) {
/*  89 */         ret.add(singleArg);
/*     */       }
/*     */     } 
/*  92 */     return ret.<String>toArray(new String[0]);
/*     */   }
/*     */   
/*     */   public static boolean isService() {
/*  96 */     return (UnixServiceHandler.INSTANCE.isService() || WinLauncher.isService());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] appendOriginalArgs(String[] params) {
/* 103 */     if (originalArgs != null) {
/* 104 */       String[] ret = new String[params.length + originalArgs.length];
/* 105 */       System.arraycopy(params, 0, ret, 0, params.length);
/* 106 */       System.arraycopy(originalArgs, 0, ret, params.length, originalArgs.length);
/* 107 */       return ret;
/*     */     } 
/* 109 */     return params;
/*     */   }
/*     */ 
/*     */   
/*     */   static void setOriginalArgs(String[] originalArgs) {
/* 114 */     Launcher.originalArgs = originalArgs;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\Launcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */