/*     */ package com.install4j.runtime.util;
/*     */ import com.ejt.internal.gui.LookAndFeelChangeUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import java.awt.Color;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public abstract class CustomDialog extends JDialog {
/*     */   protected CustomDialog(Window parentWindow) {
/*  18 */     super(parentWindow);
/*  19 */     UiUtil.getLookAndFeelEnhancer().prepareWindow(this);
/*  20 */     LookAndFeelChangeUtil.registerWindow(this);
/*  21 */     LookAndFeelChangeUtil.onLookAndFeelChangeAndNow(this, CustomDialog::updateTitleBar);
/*  22 */     if (Util.isMacOS()) {
/*  23 */       addWindowListener(new WindowAdapter()
/*     */           {
/*     */             public void windowActivated(WindowEvent e) {
/*  26 */               CustomDialog.this.repaint();
/*     */             }
/*     */ 
/*     */             
/*     */             public void windowOpened(WindowEvent e) {
/*  31 */               CustomDialog.this.repaint();
/*     */             }
/*     */           });
/*  34 */     } else if (Util.isLinux()) {
/*  35 */       addWindowListener(new WindowAdapter() {
/*     */             boolean activated = false;
/*     */             
/*     */             public void windowActivated(WindowEvent e) {
/*  39 */               if (!this.activated) {
/*  40 */                 this.activated = true;
/*  41 */                 CustomDialog.this.setBounds(CustomDialog.this.getFrameBounds());
/*     */               } 
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   private void updateTitleBar() {
/*  49 */     getRootPane().putClientProperty("JRootPane.titleBarBackground", getTitlePaneBackgroundColor());
/*     */   }
/*     */   
/*     */   protected Color getTitlePaneBackgroundColor() {
/*  53 */     return UIManager.getColor("Panel.background");
/*     */   }
/*     */   
/*     */   protected abstract int getFrameHeight();
/*     */   
/*     */   protected abstract int getFrameWidth();
/*     */   
/*     */   public void setVisible(boolean visible) {
/*  61 */     if (visible) {
/*  62 */       GUIHelper.applyComponentOrientation(this);
/*     */     }
/*  64 */     super.setVisible(visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rectangle getFrameBounds() {
/*  69 */     float factor = 1.0F;
/*  70 */     if (InstallerUtil.isLinux() || InstallerUtil.isSolaris()) {
/*  71 */       factor = 1.2F;
/*     */     }
/*  73 */     int width = (int)(factor * getFrameWidth());
/*  74 */     int height = (int)(factor * getFrameHeight());
/*     */     
/*  76 */     if (width < 0 || height < 0) {
/*  77 */       pack();
/*  78 */       if (width < 0) {
/*  79 */         width = Math.max(-width, getWidth());
/*     */       }
/*  81 */       if (height < 0) {
/*  82 */         height = Math.max(-height, getHeight());
/*     */       }
/*     */     } 
/*     */     
/*  86 */     return getFrameBounds(width, height);
/*     */   }
/*     */   
/*     */   public Rectangle getFrameBounds(int width, int height) {
/*  90 */     return ScreenSizeUtil.getFrameBounds(width, height, getParentWindow());
/*     */   }
/*     */   
/*     */   public Window getParentWindow() {
/*  94 */     return (Window)getParent();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected JRootPane createRootPane() {
/* 101 */     if (Util.isMacOS() && VersionCheck.checkCompatible("10.11", InstallerUtil.OS_VERSION)) {
/* 102 */       JRootPane rootPane = new JRootPane()
/*     */         {
/*     */           public void setDefaultButton(JButton defaultButton) {
/* 105 */             if (defaultButton != null) {
/* 106 */               Color oldForeground = defaultButton.getForeground();
/* 107 */               Color correctedForeground = Color.WHITE;
/* 108 */               defaultButton.setForeground(correctedForeground);
/* 109 */               defaultButton.addPropertyChangeListener("Frame.active", event -> defaultButton.setForeground(((Boolean)event.getNewValue()).booleanValue() ? correctedForeground : oldForeground));
/*     */             } 
/* 111 */             super.setDefaultButton(defaultButton);
/*     */           }
/*     */         };
/* 114 */       rootPane.setOpaque(true);
/* 115 */       return rootPane;
/*     */     } 
/* 117 */     return super.createRootPane();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\CustomDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */