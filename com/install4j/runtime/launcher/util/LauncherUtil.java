/*    */ package com.install4j.runtime.launcher.util;
/*    */ 
/*    */ import com.exe4j.runtime.util.LauncherPlatformUtil;
/*    */ import com.install4j.runtime.installer.platform.win32.ACLHandling;
/*    */ import com.install4j.runtime.launcher.LauncherHelper;
/*    */ import java.io.File;
/*    */ import java.lang.management.ManagementFactory;
/*    */ import java.util.Map;
/*    */ import java.util.Properties;
/*    */ 
/*    */ public class LauncherUtil
/*    */   extends LauncherPlatformUtil
/*    */ {
/*    */   public static Properties replaceVariables(Properties properties) {
/* 15 */     Properties replacedProperties = new Properties();
/* 16 */     for (Map.Entry<Object, Object> entry : properties.entrySet()) {
/* 17 */       String name = (String)entry.getKey();
/* 18 */       String value = LauncherHelper.INSTANCE.replaceVariables((String)entry.getValue());
/* 19 */       replacedProperties.put(name, value);
/*    */     } 
/*    */     
/* 22 */     return replacedProperties;
/*    */   }
/*    */   
/*    */   public static long getPidFromMBean() {
/*    */     try {
/* 27 */       String name = ManagementFactory.getRuntimeMXBean().getName();
/* 28 */       int atPos = name.indexOf('@');
/* 29 */       if (atPos > 0) {
/* 30 */         return Long.parseLong(name.substring(0, atPos));
/*    */       }
/*    */     }
/* 33 */     catch (Throwable throwable) {}
/*    */     
/* 35 */     return 0L;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean setWorldReadable(File file) {
/* 40 */     if (isWindows()) {
/* 41 */       return ACLHandling.addACE(file.getAbsolutePath(), false, true, false, true, false, 2, null, 1);
/*    */     }
/* 43 */     LauncherHelper.INSTANCE.setPosixFilePermissions(file, "a+r");
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launche\\util\LauncherUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */