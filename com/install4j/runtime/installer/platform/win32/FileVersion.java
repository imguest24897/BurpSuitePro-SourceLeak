/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ public class FileVersion {
/*    */   public static final int EQUAL = 0;
/*    */   public static final int FIRST_NEWER = 1;
/*    */   public static final int SECOND_NEWER = 2;
/*    */   public static final int NO_INFO = 3;
/*    */   
/*    */   static {
/* 12 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static int compare(File file1, File file2) {
/* 18 */     return compare0(file1.getAbsolutePath(), file2.getAbsolutePath());
/*    */   }
/*    */   
/*    */   private static native int compare0(String paramString1, String paramString2);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\FileVersion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */