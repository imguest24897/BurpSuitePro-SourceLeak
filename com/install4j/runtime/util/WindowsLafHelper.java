/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.Font;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WindowsLafHelper
/*    */ {
/*    */   public static <T extends javax.swing.JComponent> T applyWindowsBottomSeparator(T component) {
/* 12 */     return AlertLafHelper.applyBottomSeparator(component);
/*    */   }
/*    */   
/*    */   public static <T extends javax.swing.JComponent> T nativeWindowsFont(T component) {
/* 16 */     return AlertLafHelper.alertFont(component);
/*    */   }
/*    */   
/*    */   public static Font getNativeDialogFont() {
/* 20 */     return AlertLafHelper.getAlertFont();
/*    */   }
/*    */   
/*    */   public static <T extends javax.swing.JComponent> T makeWindowsTitleLabel(T component) {
/* 24 */     return AlertLafHelper.makeAlertTitleLabel(component);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\WindowsLafHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */