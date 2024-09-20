/*     */ package com.install4j.api.laf;
/*     */ 
/*     */ import com.install4j.runtime.beans.DynamicLightOrDarkColor;
/*     */ import com.install4j.runtime.util.ArmedTriStateCheckBox;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Window;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.UIManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface LookAndFeelEnhancer
/*     */ {
/*  30 */   public static final Color DEFAULT_LIGHT_TITLE_COLOR = new Color(0, 94, 140);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean isDark() {
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean isDarkModeSwitchingSupported() {
/*  47 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean isWideTreeSelection() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean isPreventTransparency(JComponent component) {
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   default JCheckBox createTriStateCheckBox() {
/*  81 */     return (JCheckBox)new ArmedTriStateCheckBox();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default Color getTitleColor() {
/*  92 */     return (Color)new DynamicLightOrDarkColor(() -> DEFAULT_LIGHT_TITLE_COLOR, () -> UIManager.getColor("Label.foreground"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   default Font getAlertFont() {
/* 102 */     return UIManager.getFont("Label.font");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default int getFileChooserLowerAccessoryInset() {
/* 112 */     return 5;
/*     */   }
/*     */   
/*     */   default void prepareWindow(Window window) {}
/*     */   
/*     */   default void disableExtraSelectionPainting(JTree tree) {}
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\laf\LookAndFeelEnhancer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */