/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*    */ 
/*    */ public class I4jLibraryHelper
/*    */ {
/*    */   private static boolean i4jChecked = false;
/*    */   private static boolean i4jAvailable = false;
/*    */   
/*    */   public static synchronized boolean isI4jLibraryAvailable() {
/* 11 */     if (!i4jChecked) {
/* 12 */       i4jChecked = true;
/*    */       try {
/* 14 */         FolderInfo.getWindowsDirectory();
/* 15 */         i4jAvailable = true;
/* 16 */       } catch (Throwable throwable) {}
/*    */     } 
/*    */     
/* 19 */     return i4jAvailable;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\I4jLibraryHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */