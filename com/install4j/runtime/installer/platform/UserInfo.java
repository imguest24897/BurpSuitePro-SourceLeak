/*    */ package com.install4j.runtime.installer.platform;
/*    */ 
/*    */ import com.install4j.api.windows.Elevation;
/*    */ import com.install4j.api.windows.ElevationState;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.platform.macos.MacosUserInfo;
/*    */ import com.install4j.runtime.installer.platform.unix.UnixUserInfo;
/*    */ import com.install4j.runtime.installer.platform.win32.Win32UserInfo;
/*    */ 
/*    */ public class UserInfo {
/*    */   public static boolean isAdminUser() {
/* 12 */     if (InstallerUtil.isWindows())
/* 13 */       return Win32UserInfo.isAdminUser(); 
/* 14 */     if (InstallerUtil.isMacOS()) {
/* 15 */       return MacosUserInfo.isAdminUser();
/*    */     }
/* 17 */     return UnixUserInfo.isAdminUser();
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isAdminGroup() {
/* 22 */     if (InstallerUtil.isWindows())
/* 23 */       return (Win32UserInfo.isAdminUser() || Elevation.getElevationState() == ElevationState.ELEVATION_STATE_LIMITED); 
/* 24 */     if (InstallerUtil.isMacOS()) {
/* 25 */       return MacosUserInfo.isAdminUser();
/*    */     }
/* 27 */     return UnixUserInfo.isAdminUser();
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean hasFullAdminRights() {
/* 32 */     if (InstallerUtil.isWindows()) {
/* 33 */       return Win32UserInfo.isAdminUser();
/*    */     }
/* 35 */     return UnixUserInfo.isAdminUser();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\UserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */