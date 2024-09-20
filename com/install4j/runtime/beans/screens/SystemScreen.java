/*     */ package com.install4j.runtime.beans.screens;
/*     */ 
/*     */ import com.install4j.api.screens.AbstractInstallerOrUninstallerScreen;
/*     */ import com.install4j.runtime.beans.SystemLoaded;
/*     */ import com.install4j.runtime.util.DisplayTextArea;
/*     */ import com.install4j.runtime.wizard.WizardScreen;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.event.ComponentAdapter;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public abstract class SystemScreen extends AbstractInstallerOrUninstallerScreen implements SystemLoaded {
/*  18 */   protected static final int CHECKBOX_WIDTH = WizardScreen.CHECKBOX_WIDTH;
/*     */   
/*  20 */   private List<JComponent> revalidationComponents = new ArrayList<>();
/*     */ 
/*     */   
/*     */   private DefaultPanel panel;
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setupControls() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setupComponent() {}
/*     */ 
/*     */   
/*     */   protected void setupEventHandlers() {}
/*     */ 
/*     */   
/*     */   public JComponent createComponent() {
/*  38 */     this.panel = createPanel();
/*     */     
/*  40 */     this.panel.setupControls();
/*  41 */     this.panel.setupComponent();
/*  42 */     this.panel.setupEventHandlers();
/*     */     
/*  44 */     GridBagConstraints gc = new GridBagConstraints();
/*  45 */     if (!(this instanceof com.install4j.api.screens.FormPanelContainer)) {
/*  46 */       gc.insets.top = 3;
/*     */     }
/*     */     
/*  49 */     gc.gridwidth = getMaxGridWidth();
/*  50 */     gc.fill = 2;
/*  51 */     gc.anchor = 23;
/*  52 */     gc.gridwidth = getMaxGridWidth();
/*  53 */     gc.gridy = gc.gridx = 0;
/*  54 */     gc.weightx = 1.0D;
/*  55 */     gc.fill = 2;
/*     */     
/*  57 */     this.panel.addScreenContent(this.panel, gc);
/*     */     
/*  59 */     this.panel.addComponentListener(new ComponentAdapter()
/*     */         {
/*     */           public void componentResized(ComponentEvent event) {
/*  62 */             for (JComponent revalidationComponent : SystemScreen.this.revalidationComponents) {
/*  63 */               revalidationComponent.invalidate();
/*     */             }
/*  65 */             SystemScreen.this.panel.validate();
/*     */           }
/*     */         });
/*     */     
/*  69 */     return this.panel;
/*     */   }
/*     */   
/*     */   protected DefaultPanel createPanel() {
/*  73 */     return new DefaultPanel();
/*     */   }
/*     */   
/*     */   protected DefaultPanel getPanel() {
/*  77 */     return this.panel;
/*     */   }
/*     */   
/*     */   protected boolean checkCompleted() {
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean next() {
/*  86 */     return (checkCompleted() && super.next());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void addScreenContent(JPanel panel, GridBagConstraints gc) {}
/*     */ 
/*     */   
/*     */   protected int getMaxGridWidth() {
/*  94 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillHorizontal() {
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillVertical() {
/* 104 */     return true;
/*     */   }
/*     */   
/*     */   protected String getApplicationName() {
/* 108 */     return getContext().getApplicationName();
/*     */   }
/*     */ 
/*     */   
/*     */   protected DisplayTextArea addDisplayTextArea(String text, JPanel panel, GridBagConstraints gc) {
/* 113 */     int oldFill = gc.fill;
/* 114 */     double oldWeightX = gc.weightx;
/* 115 */     gc.fill = 2;
/* 116 */     gc.weightx = 1.0D;
/*     */     
/* 118 */     DisplayTextArea dtxa = new DisplayTextArea();
/* 119 */     dtxa.setText(text);
/*     */     
/* 121 */     panel.add((Component)dtxa, gc);
/* 122 */     this.revalidationComponents.add(dtxa);
/*     */     
/* 124 */     gc.gridy++;
/* 125 */     gc.fill = oldFill;
/* 126 */     gc.weightx = oldWeightX;
/*     */     
/* 128 */     return dtxa;
/*     */   }
/*     */   
/*     */   protected String getMessage(String key) {
/* 132 */     return getContext().getMessage(key);
/*     */   }
/*     */   
/*     */   protected class DefaultPanel
/*     */     extends JPanel {
/*     */     public DefaultPanel() {
/* 138 */       super(new GridBagLayout());
/* 139 */       setOpaque(false);
/*     */     }
/*     */     
/*     */     protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 143 */       SystemScreen.this.addScreenContent(panel, gc);
/*     */     }
/*     */     
/*     */     protected void setupControls() {
/* 147 */       SystemScreen.this.setupControls();
/*     */     }
/*     */     
/*     */     protected void setupComponent() {
/* 151 */       SystemScreen.this.setupComponent();
/*     */     }
/*     */     
/*     */     protected void setupEventHandlers() {
/* 155 */       SystemScreen.this.setupEventHandlers();
/*     */     }
/*     */ 
/*     */     
/*     */     public void willActivate() {}
/*     */ 
/*     */     
/*     */     public void activated() {}
/*     */     
/*     */     public boolean checkCompleted() {
/* 165 */       return true;
/*     */     }
/*     */     
/*     */     public boolean next() {
/* 169 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\SystemScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */