/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import com.install4j.api.UiUtil;
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.beans.DynamicLightOrDarkColor;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ 
/*    */ public class AlertLafHelper
/*    */ {
/*    */   public static final float TITLE_FONT_FACTOR = 1.25F;
/*    */   public static boolean useWindowsIcons = false;
/*    */   
/*    */   public static boolean isUseWindowsIcons() {
/* 17 */     return useWindowsIcons;
/*    */   }
/*    */   
/*    */   public static void setUseWindowsIcons(boolean useWindowsIcons) {
/* 21 */     AlertLafHelper.useWindowsIcons = useWindowsIcons;
/*    */   }
/*    */   
/* 24 */   private static final Color SEPARATOR_COLOR = (Color)new DynamicLightOrDarkColor(() -> new Color(223, 223, 223), () -> UIManager.getColor("Separator.foreground"));
/*    */   
/*    */   public static <T extends javax.swing.JComponent> T applyBottomSeparator(T component) {
/* 27 */     component.setBorder(new PartialLineBorder(SEPARATOR_COLOR, 1, 2));
/* 28 */     return component;
/*    */   }
/*    */   
/*    */   public static <T extends javax.swing.JComponent> T alertFont(T component) {
/* 32 */     if (!Boolean.getBoolean("ejt.noNativeDialogFont") && Util.isWindows()) {
/* 33 */       component.setFont(getAlertFont());
/*    */     }
/* 35 */     return component;
/*    */   }
/*    */   
/*    */   public static Font getAlertFont() {
/* 39 */     return UiUtil.getLookAndFeelEnhancer().getAlertFont();
/*    */   }
/*    */   public static <T extends javax.swing.JComponent> T makeAlertTitleLabel(T component) {
/*    */     float size;
/* 43 */     alertFont(component);
/* 44 */     Font font = component.getFont();
/*    */     
/* 46 */     if (font.getFamily().equals("Segoe UI")) {
/* 47 */       size = 16.0F;
/*    */     } else {
/* 49 */       size = font.getSize() * 1.25F;
/*    */     } 
/*    */     
/* 52 */     component.setFont(font.deriveFont(size));
/* 53 */     component.setForeground(UiUtil.getLookAndFeelEnhancer().getTitleColor());
/* 54 */     return component;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\AlertLafHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */