/*     */ package com.formdev.flatlaf.extras.components;
/*     */ 
/*     */ import java.awt.Insets;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextField;
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
/*     */ public class FlatTextField
/*     */   extends JTextField
/*     */   implements FlatComponentExtension, FlatStyleableComponent
/*     */ {
/*     */   public String getPlaceholderText() {
/*  39 */     return (String)getClientProperty("JTextField.placeholderText");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPlaceholderText(String placeholderText) {
/*  46 */     putClientProperty("JTextField.placeholderText", placeholderText);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Icon getLeadingIcon() {
/*  56 */     return (Icon)getClientProperty("JTextField.leadingIcon");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLeadingIcon(Icon leadingIcon) {
/*  65 */     putClientProperty("JTextField.leadingIcon", leadingIcon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Icon getTrailingIcon() {
/*  75 */     return (Icon)getClientProperty("JTextField.trailingIcon");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrailingIcon(Icon trailingIcon) {
/*  84 */     putClientProperty("JTextField.trailingIcon", trailingIcon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent getLeadingComponent() {
/*  94 */     return (JComponent)getClientProperty("JTextField.leadingComponent");
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
/* 113 */     putClientProperty("JTextField.leadingComponent", leadingComponent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent getTrailingComponent() {
/* 123 */     return (JComponent)getClientProperty("JTextField.trailingComponent");
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
/* 142 */     putClientProperty("JTextField.trailingComponent", trailingComponent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShowClearButton() {
/* 152 */     return getClientPropertyBoolean("JTextField.showClearButton", false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowClearButton(boolean showClearButton) {
/* 162 */     putClientPropertyBoolean("JTextField.showClearButton", showClearButton, false);
/*     */   }
/*     */   
/*     */   public enum SelectAllOnFocusPolicy
/*     */   {
/* 167 */     never, once, always;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SelectAllOnFocusPolicy getSelectAllOnFocusPolicy() {
/* 173 */     return getClientPropertyEnumString("JTextField.selectAllOnFocusPolicy", SelectAllOnFocusPolicy.class, "TextComponent.selectAllOnFocusPolicy", SelectAllOnFocusPolicy.once);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelectAllOnFocusPolicy(SelectAllOnFocusPolicy selectAllOnFocusPolicy) {
/* 181 */     putClientPropertyEnumString("JTextField.selectAllOnFocusPolicy", selectAllOnFocusPolicy);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Insets getPadding() {
/* 191 */     return (Insets)getClientProperty("JTextField.padding");
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
/* 202 */     putClientProperty("JTextField.padding", padding);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinimumWidth() {
/* 210 */     return getClientPropertyInt("JComponent.minimumWidth", "Component.minimumWidth");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimumWidth(int minimumWidth) {
/* 217 */     putClientProperty("JComponent.minimumWidth", (minimumWidth >= 0) ? Integer.valueOf(minimumWidth) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRoundRect() {
/* 225 */     return getClientPropertyBoolean("JComponent.roundRect", false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRoundRect(boolean roundRect) {
/* 232 */     putClientPropertyBoolean("JComponent.roundRect", roundRect, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getOutline() {
/* 240 */     return getClientProperty("JComponent.outline");
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
/* 257 */     putClientProperty("JComponent.outline", outline);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatTextField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */