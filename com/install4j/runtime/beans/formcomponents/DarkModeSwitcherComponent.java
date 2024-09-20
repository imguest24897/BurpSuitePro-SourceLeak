/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ public class DarkModeSwitcherComponent extends SystemFormComponent {
/*  12 */   private static final Icon ICON_LIGHT_MODE_16 = IconHelper.loadIcon("light_mode_16.png");
/*  13 */   private static final Icon ICON_DARK_MODE_16 = IconHelper.loadIcon("dark_mode_16.png");
/*     */   
/*     */   private boolean iconOnly = true;
/*     */   
/*     */   private JButton button;
/*     */   
/*     */   public boolean isIconOnly() {
/*  20 */     return replaceWithTextOverride("iconOnly", this.iconOnly);
/*     */   }
/*     */   
/*     */   public void setIconOnly(boolean iconOnly) {
/*  24 */     this.iconOnly = iconOnly;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  29 */     this.button = new JButton()
/*     */       {
/*     */         public Dimension getMinimumSize()
/*     */         {
/*  33 */           if (DarkModeSwitcherComponent.this.isIconOnly()) {
/*  34 */             return getIconSize();
/*     */           }
/*  36 */           return super.getMinimumSize();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         public Dimension getPreferredSize() {
/*  42 */           if (DarkModeSwitcherComponent.this.isIconOnly()) {
/*  43 */             return getIconSize();
/*     */           }
/*  45 */           return super.getPreferredSize();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         public Dimension getMaximumSize() {
/*  51 */           if (DarkModeSwitcherComponent.this.isIconOnly()) {
/*  52 */             return getIconSize();
/*     */           }
/*  54 */           return super.getMaximumSize();
/*     */         }
/*     */ 
/*     */         
/*     */         private Dimension getIconSize() {
/*  59 */           Dimension preferredSize = super.getPreferredSize();
/*     */           
/*  61 */           preferredSize.width = preferredSize.height;
/*  62 */           return preferredSize;
/*     */         }
/*     */       };
/*  65 */     if (isIconOnly()) {
/*  66 */       this.button.putClientProperty("JButton.buttonType", "borderless");
/*     */     }
/*     */     
/*  69 */     this.button.addActionListener(e -> UiUtil.setDarkUi(!UiUtil.isDarkUi()));
/*  70 */     updateButton();
/*     */     
/*  72 */     LookAndFeelChangeUtil.onLookAndFeelChange(this, DarkModeSwitcherComponent::updateButton);
/*     */     
/*  74 */     return this.button;
/*     */   }
/*     */   
/*     */   private void updateButton() {
/*  78 */     boolean visible = (isDarkModeSwitchingSupported() || getFormEnvironment().isDesignTime());
/*  79 */     setVisible(visible);
/*  80 */     this.button.setVisible(visible);
/*  81 */     boolean dark = UiUtil.isDarkUi();
/*  82 */     this.button.setIcon(dark ? ICON_LIGHT_MODE_16 : ICON_DARK_MODE_16);
/*  83 */     if (!isIconOnly()) {
/*  84 */       this.button.setText(dark ? Messages.getString(".ButtonLightMode") : Messages.getString(".ButtonDarkMode"));
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean isDarkModeSwitchingSupported() {
/*  89 */     return UiUtil.getLookAndFeelEnhancer().isDarkModeSwitchingSupported();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/*  94 */     if (isDarkModeSwitchingSupported()) {
/*  95 */       super.setVisible(visible);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 101 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DarkModeSwitcherComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */