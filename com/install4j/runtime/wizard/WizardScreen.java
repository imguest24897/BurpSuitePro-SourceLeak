/*    */ package com.install4j.runtime.wizard;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Component;
/*    */ import java.awt.ComponentOrientation;
/*    */ import java.awt.Window;
/*    */ import java.awt.event.ComponentAdapter;
/*    */ import java.awt.event.ComponentEvent;
/*    */ import javax.swing.JCheckBox;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.SwingUtilities;
/*    */ 
/*    */ public abstract class WizardScreen extends JPanel {
/*    */   public static final int CHECKBOX_WIDTH;
/*    */   
/*    */   static {
/* 18 */     if (!InstallerUtil.isConsole() && !InstallerUtil.isUnattended()) {
/* 19 */       CHECKBOX_WIDTH = ((new JCheckBox()).getPreferredSize()).width;
/* 20 */       RADIOBUTTON_WIDTH = ((new JRadioButton()).getPreferredSize()).width;
/*    */     } else {
/* 22 */       CHECKBOX_WIDTH = 10;
/* 23 */       RADIOBUTTON_WIDTH = 10;
/*    */     } 
/*    */   }
/*    */   public static final int RADIOBUTTON_WIDTH;
/* 27 */   private static int nameCount = 0;
/*    */   
/*    */   private WizardBase wizardBase;
/*    */   private final String cardName;
/*    */   
/*    */   protected WizardScreen(WizardBase wizardBase) {
/* 33 */     this.wizardBase = wizardBase;
/* 34 */     this.cardName = String.valueOf(nameCount++);
/*    */   }
/*    */   
/*    */   public String getCardName() {
/* 38 */     return this.cardName;
/*    */   }
/*    */   
/*    */   protected WizardBase getWizardBase() {
/* 42 */     return this.wizardBase;
/*    */   }
/*    */   
/*    */   protected void activate() {
/* 46 */     this.wizardBase.activateScreen(this);
/* 47 */     requestFocus();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void deactivate() {}
/*    */   
/*    */   protected Window getParentWindow() {
/* 54 */     return (Window)SwingUtilities.getAncestorOfClass(Window.class, this);
/*    */   }
/*    */   
/*    */   protected boolean supportsPrevious() {
/* 58 */     return true;
/*    */   }
/*    */   
/*    */   protected boolean supportsNext() {
/* 62 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initScreen() {
/* 67 */     setupComponent();
/* 68 */     setupEventHandlers();
/*    */   }
/*    */   
/*    */   protected void setupComponent() {
/* 72 */     setLayout(new BorderLayout());
/* 73 */     setComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
/*    */   }
/*    */   
/*    */   protected void setupEventHandlers() {
/* 77 */     addComponentListener(new ComponentAdapter()
/*    */         {
/*    */           public void componentResized(ComponentEvent event) {
/* 80 */             WizardScreen.this.invalidateDisplayTextAreas(WizardScreen.this);
/* 81 */             WizardScreen.this.validate();
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   private void invalidateDisplayTextAreas(JComponent container) {
/* 87 */     for (int i = 0; i < container.getComponentCount(); i++) {
/* 88 */       Component component = container.getComponent(i);
/* 89 */       if (component instanceof com.install4j.runtime.util.DisplayTextArea) {
/* 90 */         component.invalidate();
/* 91 */       } else if (component instanceof JComponent) {
/* 92 */         invalidateDisplayTextAreas((JComponent)component);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\wizard\WizardScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */