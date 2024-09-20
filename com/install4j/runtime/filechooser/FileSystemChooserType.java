/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ 
/*    */ public enum FileSystemChooserType
/*    */ {
/*  6 */   FILES, DIRECTORIES;
/*    */   
/*    */   public static FileSystemChooserType fromJFileChooserValue(int selectionMode) {
/*  9 */     switch (selectionMode) {
/*    */       case 0:
/*    */       case 2:
/* 12 */         return FILES;
/*    */       case 1:
/* 14 */         return DIRECTORIES;
/*    */     } 
/* 16 */     throw new RuntimeException("Invalid selection mode " + selectionMode);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\FileSystemChooserType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */