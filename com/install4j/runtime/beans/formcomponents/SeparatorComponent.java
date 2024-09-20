/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JSeparator;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ public class SeparatorComponent extends AbstractLabelWithIconComponent {
/*    */   private boolean specialTitleFont = true;
/*    */   
/*    */   public boolean isSpecialTitleFont() {
/* 17 */     return replaceWithTextOverride("specialTitleFont", this.specialTitleFont);
/*    */   }
/*    */   private boolean enabledTitleText = true; private JSeparator separator;
/*    */   public void setSpecialTitleFont(boolean specialTitleFont) {
/* 21 */     this.specialTitleFont = specialTitleFont;
/*    */   }
/*    */   
/*    */   public boolean isEnabledTitleText() {
/* 25 */     return replaceWithTextOverride("enabledTitleText", this.enabledTitleText);
/*    */   }
/*    */   
/*    */   public void setEnabledTitleText(boolean enabledTitleText) {
/* 29 */     this.enabledTitleText = enabledTitleText;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 35 */     JPanel panel = new JPanel(new GridBagLayout());
/* 36 */     panel.setOpaque(false);
/* 37 */     GridBagConstraints gc = new GridBagConstraints();
/* 38 */     gc.gridx = -1;
/* 39 */     gc.gridy = 0;
/* 40 */     gc.anchor = 10;
/* 41 */     if (getLabelText().trim().length() > 0) {
/* 42 */       JLabel label = createLabel();
/* 43 */       label.setEnabled(isEnabledTitleText());
/* 44 */       if (isSpecialTitleFont()) {
/* 45 */         label.setFont(UIManager.getFont("TitledBorder.font"));
/* 46 */         label.setForeground(UIManager.getColor("TitledBorder.titleColor"));
/*    */       } 
/* 48 */       panel.add(label, gc);
/* 49 */       gc.insets.left = 5;
/*    */     } 
/* 51 */     gc.weightx = 1.0D;
/* 52 */     gc.fill = 2;
/* 53 */     this.separator = GUIHelper.createHorizontalSeparator();
/* 54 */     panel.add(this.separator, gc);
/*    */     
/* 56 */     return panel;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getConfigurationObject() {
/* 66 */     return this.separator;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getConfigurationObjectClass() {
/* 71 */     return JSeparator.class;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) {
/* 76 */     if (getLabelText().trim().length() > 0) {
/* 77 */       console.println(getTextWithoutMnemonics(getLabelText()));
/*    */     }
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasUserInput() {
/* 84 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\SeparatorComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */