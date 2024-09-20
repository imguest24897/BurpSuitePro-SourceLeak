/*     */ package com.formdev.flatlaf.extras.components;
/*     */ 
/*     */ import java.awt.Insets;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFormattedTextField;
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
/*     */ public class FlatFormattedTextField
/*     */   extends JFormattedTextField
/*     */   implements FlatComponentExtension, FlatStyleableComponent
/*     */ {
/*     */   public String getPlaceholderText() {
/*  40 */     return (String)getClientProperty("JTextField.placeholderText");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPlaceholderText(String placeholderText) {
/*  47 */     putClientProperty("JTextField.placeholderText", placeholderText);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Icon getLeadingIcon() {
/*  57 */     return (Icon)getClientProperty("JTextField.leadingIcon");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLeadingIcon(Icon leadingIcon) {
/*  66 */     putClientProperty("JTextField.leadingIcon", leadingIcon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Icon getTrailingIcon() {
/*  76 */     return (Icon)getClientProperty("JTextField.trailingIcon");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrailingIcon(Icon trailingIcon) {
/*  85 */     putClientProperty("JTextField.trailingIcon", trailingIcon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent getLeadingComponent() {
/*  95 */     return (JComponent)getClientProperty("JTextField.leadingComponent");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLeadingComponent(JComponent leadingComponent) {
/* 114 */     putClientProperty("JTextField.leadingComponent", leadingComponent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent getTrailingComponent() {
/* 124 */     return (JComponent)getClientProperty("JTextField.trailingComponent");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrailingComponent(JComponent trailingComponent) {
/* 143 */     putClientProperty("JTextField.trailingComponent", trailingComponent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShowClearButton() {
/* 153 */     return getClientPropertyBoolean("JTextField.showClearButton", false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowClearButton(boolean showClearButton) {
/* 163 */     putClientPropertyBoolean("JTextField.showClearButton", showClearButton, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlatTextField.SelectAllOnFocusPolicy getSelectAllOnFocusPolicy() {
/* 171 */     return getClientPropertyEnumString("JTextField.selectAllOnFocusPolicy", FlatTextField.SelectAllOnFocusPolicy.class, "TextComponent.selectAllOnFocusPolicy", FlatTextField.SelectAllOnFocusPolicy.once);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelectAllOnFocusPolicy(FlatTextField.SelectAllOnFocusPolicy selectAllOnFocusPolicy) {
/* 179 */     putClientPropertyEnumString("JTextField.selectAllOnFocusPolicy", selectAllOnFocusPolicy);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Insets getPadding() {
/* 189 */     return (Insets)getClientProperty("JTextField.padding");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPadding(Insets padding) {
/* 200 */     putClientProperty("JTextField.padding", padding);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinimumWidth() {
/* 208 */     return getClientPropertyInt("JComponent.minimumWidth", "Component.minimumWidth");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimumWidth(int minimumWidth) {
/* 215 */     putClientProperty("JComponent.minimumWidth", (minimumWidth >= 0) ? Integer.valueOf(minimumWidth) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRoundRect() {
/* 223 */     return getClientPropertyBoolean("JComponent.roundRect", false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRoundRect(boolean roundRect) {
/* 230 */     putClientPropertyBoolean("JComponent.roundRect", roundRect, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getOutline() {
/* 238 */     return getClientProperty("JComponent.outline");
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOutline(Object outline) {
/* 255 */     putClientProperty("JComponent.outline", outline);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatFormattedTextField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */