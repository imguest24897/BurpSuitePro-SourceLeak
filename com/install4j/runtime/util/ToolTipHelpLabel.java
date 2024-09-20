/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.event.MouseAdapter;
/*    */ import java.awt.event.MouseEvent;
/*    */ import javax.swing.Icon;
/*    */ import javax.swing.InputMap;
/*    */ import javax.swing.KeyStroke;
/*    */ import javax.swing.ToolTipManager;
/*    */ 
/*    */ public class ToolTipHelpLabel extends JLabel {
/* 10 */   private static final Icon ICON_16 = IconHelper.loadIcon("help_16.png");
/* 11 */   private static final Icon ICON_DISABLED_16 = IconHelper.loadIcon("help_disabled_16.png");
/*    */   
/*    */   private String tooltipText;
/*    */   
/*    */   public ToolTipHelpLabel(String tooltipText) {
/* 16 */     super(ICON_16);
/* 17 */     setDisabledIcon(ICON_DISABLED_16);
/* 18 */     this.tooltipText = tooltipText;
/*    */     
/* 20 */     registerWithToolTipManager();
/*    */     
/* 22 */     addMouseListener(new MouseAdapter()
/*    */         {
/*    */           private boolean initialized;
/*    */           private int initialDelay;
/*    */           private int dismissDelay;
/*    */           
/*    */           public void mouseEntered(MouseEvent e) {
/* 29 */             ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
/* 30 */             if (!this.initialized) {
/* 31 */               this.dismissDelay = toolTipManager.getDismissDelay();
/* 32 */               this.initialDelay = toolTipManager.getInitialDelay();
/* 33 */               this.initialized = true;
/*    */             } 
/* 35 */             toolTipManager.setDismissDelay(2147483647);
/* 36 */             toolTipManager.setInitialDelay(0);
/* 37 */             toolTipManager.mouseMoved(e);
/*    */           }
/*    */ 
/*    */           
/*    */           public void mouseExited(MouseEvent e) {
/* 42 */             if (this.initialized) {
/* 43 */               ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
/* 44 */               toolTipManager.setDismissDelay(this.dismissDelay);
/* 45 */               toolTipManager.setInitialDelay(this.initialDelay);
/*    */             } 
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getToolTipText() {
/* 53 */     return isEnabled() ? this.tooltipText : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setToolTipText(String tooltipText) {
/* 58 */     this.tooltipText = tooltipText;
/*    */   }
/*    */ 
/*    */   
/*    */   private void registerWithToolTipManager() {
/* 63 */     InputMap inputMap = getInputMap();
/* 64 */     getActionMap();
/* 65 */     boolean removeKeyStroke = false;
/* 66 */     KeyStroke[] ks = inputMap.keys();
/* 67 */     if (ks == null || ks.length == 0) {
/* 68 */       inputMap.put(KeyStroke.getKeyStroke(92, 0), "backSlash");
/* 69 */       removeKeyStroke = true;
/*    */     } 
/* 71 */     ToolTipManager.sharedInstance().registerComponent(this);
/* 72 */     if (removeKeyStroke) {
/* 73 */       inputMap.remove(KeyStroke.getKeyStroke(92, 0));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFocusable() {
/* 79 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\ToolTipHelpLabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */