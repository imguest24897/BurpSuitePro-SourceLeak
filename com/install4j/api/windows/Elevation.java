/*    */ package com.install4j.api.windows;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.platform.win32.Win32UserInfo;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Elevation
/*    */ {
/*    */   public static ElevationState getElevationState() {
/* 20 */     if (!Util.isWindows()) return null; 
/* 21 */     return ElevationState.getFromIntValue(Win32UserInfo.getElevationType());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean executeElevated(File executable, String parameters, File directory) {
/* 33 */     if (!Util.isWindows()) return false; 
/* 34 */     return Win32UserInfo.executeElevated(executable.getAbsolutePath(), parameters, (directory != null) ? directory.getAbsolutePath() : null);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\Elevation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */