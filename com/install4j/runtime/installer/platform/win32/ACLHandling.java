/*   */ package com.install4j.runtime.installer.platform.win32;
/*   */ 
/*   */ public class ACLHandling {
/*   */   static {
/* 5 */     Common.init();
/*   */   }
/*   */   
/*   */   public static final int AUTHENTICATED_USERS = 1;
/*   */   
/*   */   public static final int WORLD = 2;
/*   */   public static final int SID_OR_ACCOUNT_NAME = 3;
/*   */   public static final String SID_ADMINISTRATORS = "S-1-5-32-544";
/*   */   public static final String SID_USERS = "S-1-5-32-545";
/*   */   public static final String SID_GUESTS = "S-1-5-32-546";
/*   */   public static final int GRANT_ACCESS = 1;
/*   */   public static final int SET_ACCESS = 2;
/*   */   public static final int DENY_ACCESS = 3;
/*   */   public static final int REVOKE_ACCESS = 4;
/*   */   public static final int SET_AUDIT_SUCCESS = 5;
/*   */   public static final int SET_AUDIT_FAILURE = 6;
/*   */   
/*   */   public static native boolean addACE(String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt1, String paramString2, int paramInt2);
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\ACLHandling.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */