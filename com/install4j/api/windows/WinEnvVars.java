/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ import com.install4j.runtime.installer.platform.win32.EnvVars;
/*     */ import com.install4j.runtime.installer.platform.win32.Misc;
/*     */ import java.io.IOException;
/*     */ import java.util.Properties;
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
/*     */ public class WinEnvVars
/*     */ {
/*     */   public static void set(String key, String value) throws IOException {
/*  21 */     EnvVars.setWinNT(key, value, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setUserSpecific(String key, String value) throws IOException {
/*  31 */     EnvVars.setWinNT(key, value, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getenv(String key) {
/*  40 */     return Misc.getenv(key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Properties getenv() {
/*  48 */     return Misc.getenv();
/*     */   }
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
/*     */   public static String getFromRegistry(String key, boolean userSpecific) throws IOException {
/*  63 */     return EnvVars.getWinNT(key, userSpecific);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void appendToPath(String value) throws IOException {
/*  72 */     String previousPath = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Session Manager\\Environment", "PATH").toString();
/*  73 */     EnvVars.setWinNT("PATH", previousPath + ";" + value, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void prependToPath(String value) throws IOException {
/*  82 */     String previousPath = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Session Manager\\Environment", "PATH").toString();
/*  83 */     EnvVars.setWinNT("PATH", value + ";" + previousPath, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void appendToUserPath(String value) throws IOException {
/*  93 */     String previousPath = WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "Environment", "PATH").toString();
/*  94 */     EnvVars.setWinNT("PATH", previousPath + ";" + value, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void prependToUserPath(String value) throws IOException {
/*     */     String newUserPath;
/* 104 */     Object userPath = WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "Environment", "PATH");
/*     */     
/* 106 */     if (userPath == null) {
/* 107 */       newUserPath = value;
/*     */     } else {
/* 109 */       newUserPath = value + ";" + userPath;
/*     */     } 
/* 111 */     EnvVars.setWinNT("PATH", newUserPath, true);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinEnvVars.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */