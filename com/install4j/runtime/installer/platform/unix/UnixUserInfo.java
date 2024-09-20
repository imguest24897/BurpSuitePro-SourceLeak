/*   */ package com.install4j.runtime.installer.platform.unix;
/*   */ 
/*   */ import java.util.Objects;
/*   */ 
/*   */ public class UnixUserInfo {
/* 6 */   public static final boolean ROOT_USER = Objects.equals(System.getProperty("user.name"), "root");
/*   */   
/*   */   public static boolean isAdminUser() {
/* 9 */     return ROOT_USER;
/*   */   }
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\UnixUserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */