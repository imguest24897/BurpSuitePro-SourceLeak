/*     */ package com.sun.javafx.runtime;
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
/*     */ public class VersionInfo
/*     */ {
/*     */   private static final String BUILD_TIMESTAMP = "2023-09-18T08:32:23Z";
/*     */   private static final String HUDSON_JOB_NAME = "OpenJFX-build-target";
/*     */   private static final String HUDSON_BUILD_NUMBER = "146";
/*     */   private static final String PROMOTED_BUILD_NUMBER = "31";
/*     */   private static final String RELEASE_VERSION = "21";
/*     */   private static final String RELEASE_SUFFIX = "";
/*     */   private static final String VERSION;
/*     */   private static final String RUNTIME_VERSION;
/*     */   
/*     */   static {
/* 128 */     String str = "21";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     str = str;
/* 134 */     VERSION = str;
/*     */ 
/*     */     
/* 137 */     str = str + "+31";
/* 138 */     if (getHudsonJobName().length() == 0)
/*     */     {
/* 140 */       str = str + "-2023-09-18T08:32:23Z";
/*     */     }
/* 142 */     RUNTIME_VERSION = str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setupSystemProperties() {
/* 153 */     if (System.getProperty("javafx.version") == null) {
/* 154 */       System.setProperty("javafx.version", getVersion());
/* 155 */       System.setProperty("javafx.runtime.version", getRuntimeVersion());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getBuildTimestamp() {
/* 164 */     return "2023-09-18T08:32:23Z";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getHudsonJobName() {
/* 173 */     if ("OpenJFX-build-target".equals("not_hudson")) {
/* 174 */       return "";
/*     */     }
/* 176 */     return "OpenJFX-build-target";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getHudsonBuildNumber() {
/* 184 */     return "146";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getReleaseMilestone() {
/* 195 */     String str = "";
/* 196 */     if (str.startsWith("-")) {
/* 197 */       str = str.substring(1);
/*     */     }
/* 199 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getVersion() {
/* 207 */     return VERSION;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getRuntimeVersion() {
/* 215 */     return RUNTIME_VERSION;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\runtime\VersionInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */