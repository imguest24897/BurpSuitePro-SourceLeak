/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ 
/*    */ public class ObjectPicker
/*    */ {
/*    */   static {
/*  9 */     Common.init();
/*    */   }
/*    */   
/*    */   public static Result[] show(boolean multipleSelection, boolean groups, boolean users, boolean wellKnownPrincipals, boolean onlyLocal) {
/* 13 */     if (InstallerUtil.isAtLeastWindows2000()) {
/* 14 */       return show0(multipleSelection, groups, users, wellKnownPrincipals, onlyLocal);
/*    */     }
/* 16 */     return null;
/*    */   }
/*    */   
/*    */   private static native Result[] show0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5);
/*    */   
/*    */   public static class Result
/*    */   {
/*    */     private String name;
/*    */     private String adsPath;
/*    */     
/*    */     public Result(String name, String adsPath, String objectClass, String upn, String sid) {
/* 27 */       this.name = name;
/* 28 */       this.adsPath = adsPath;
/* 29 */       this.objectClass = objectClass;
/* 30 */       this.upn = upn;
/* 31 */       this.sid = sid;
/*    */     }
/*    */     private String objectClass; private String upn; private String sid;
/*    */     public String getName() {
/* 35 */       return this.name;
/*    */     }
/*    */     
/*    */     public String getAdsPath() {
/* 39 */       return this.adsPath;
/*    */     }
/*    */     
/*    */     public String getObjectClass() {
/* 43 */       return this.objectClass;
/*    */     }
/*    */     
/*    */     public String getUpn() {
/* 47 */       return this.upn;
/*    */     }
/*    */     
/*    */     public String getSid() {
/* 51 */       return this.sid;
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 56 */       return "Result{name='" + this.name + '\'' + ", adsPath='" + this.adsPath + '\'' + ", objectClass='" + this.objectClass + '\'' + ", upn='" + this.upn + '\'' + ", sid='" + this.sid + '\'' + '}';
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\ObjectPicker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */