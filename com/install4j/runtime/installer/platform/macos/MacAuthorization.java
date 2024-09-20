/*     */ package com.install4j.runtime.installer.platform.macos;
/*     */ import com.install4j.runtime.installer.platform.win32.Common;
/*     */ import java.util.List;
/*     */ 
/*     */ public class MacAuthorization {
/*     */   private static final String FAILURE_MARKER = "__ejtf_";
/*     */   private static final int SUCCESS = 0;
/*     */   private static final String UNINITIALIZED_DEFAULT_PROMPT = "__uninitialized";
/*     */   
/*     */   static {
/*  11 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  19 */   private static volatile String defaultPrompt = "__uninitialized";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static synchronized void createAuthorization(String prompt) throws AuthorizationException {
/*  27 */     checkResult(create0(prompt));
/*     */   }
/*     */   
/*     */   private static void checkResult(int result) throws AuthorizationException {
/*  31 */     if (result != 0) {
/*  32 */       throw new AuthorizationException(result);
/*     */     }
/*     */   }
/*     */   
/*     */   public static synchronized void free() throws AuthorizationException {
/*  37 */     checkResult(free0());
/*     */   }
/*     */   
/*     */   public static String executeAndWait(String prompt, String command, List<String> arguments) throws BaseAuthorizationException {
/*  41 */     createAuthorization(prompt);
/*     */     
/*  43 */     String ret = executeAndWait0(command, getArgumentsArray(arguments));
/*  44 */     if (ret == null)
/*  45 */       throw new ExecutionException(-1); 
/*  46 */     if (ret.startsWith("__ejtf_")) {
/*  47 */       int errorCode = -2;
/*     */       try {
/*  49 */         errorCode = Integer.parseInt(ret.substring("__ejtf_".length()));
/*  50 */       } catch (NumberFormatException e) {
/*  51 */         e.printStackTrace();
/*     */       } 
/*  53 */       throw new ExecutionException(errorCode);
/*     */     } 
/*  55 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void execute(String prompt, String command, List<String> arguments) throws BaseAuthorizationException {
/*  60 */     createAuthorization(prompt);
/*     */     
/*  62 */     int ret = execute0(command, getArgumentsArray(arguments));
/*  63 */     if (ret != 0) {
/*  64 */       throw new ExecutionException(ret);
/*     */     }
/*     */   }
/*     */   
/*     */   private static String[] getArgumentsArray(List<String> arguments) {
/*  69 */     return (arguments == null) ? null : arguments.<String>toArray(new String[0]);
/*     */   }
/*     */   
/*     */   public static String getDefaultPrompt(String appName) {
/*  73 */     if (appName == null) {
/*  74 */       return null;
/*     */     }
/*  76 */     if ("__uninitialized".equals(defaultPrompt)) {
/*  77 */       String bundlePath = "/System/Library/Frameworks/Security.framework/Versions/Current/MachServices/SecurityAgent.bundle";
/*  78 */       if (!(new File(bundlePath)).exists()) {
/*  79 */         bundlePath = "/System/Library/Frameworks/Security.framework/Versions/Current/XPCServices/SecurityAgent.xpc";
/*     */       }
/*  81 */       defaultPrompt = MacLocalization.getLocalizedString(bundlePath, "%1$@ wants to make changes.", appName);
/*     */     } 
/*  83 */     return defaultPrompt;
/*     */   }
/*     */   private static native int create0(String paramString);
/*     */   private static native int free0();
/*     */   private static native int execute0(String paramString, String[] paramArrayOfString);
/*     */   private static native String executeAndWait0(String paramString, String[] paramArrayOfString);
/*     */   public static class BaseAuthorizationException extends Exception { private BaseAuthorizationException(int errorCode) {
/*  90 */       super("error code " + errorCode);
/*  91 */       this.errorCode = errorCode;
/*     */     }
/*     */     private final int errorCode;
/*     */     public int getErrorCode() {
/*  95 */       return this.errorCode;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class AuthorizationException extends BaseAuthorizationException {
/*     */     private AuthorizationException(int errorCode) {
/* 101 */       super(errorCode);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class ExecutionException extends BaseAuthorizationException {
/*     */     private ExecutionException(int errorCode) {
/* 107 */       super(errorCode);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacAuthorization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */