/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.screens.components.ScrollablePanel;
/*     */ import com.install4j.runtime.util.ComponentsScrollPane;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public abstract class ChecklistComponent<T extends ChecklistComponent.SingleCheckPanel> extends SystemFormComponent {
/*  17 */   private List<T> singleCheckPanels = new ArrayList<>();
/*     */   private ScrollablePanel checklistPanel;
/*     */   private boolean fillVertical = false;
/*     */   
/*     */   protected ChecklistComponent() {
/*  22 */     this.checklistPanel = new ScrollablePanel();
/*     */   }
/*     */   
/*     */   protected List<T> getSingleCheckPanels() {
/*  26 */     return this.singleCheckPanels;
/*     */   }
/*     */   
/*     */   public boolean isFillVertical() {
/*  30 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  34 */     this.fillVertical = fillVertical;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/*  39 */     return isFillVertical();
/*     */   }
/*     */   
/*     */   protected void save() {
/*  43 */     for (SingleCheckPanel singleCheckPanel : getSingleCheckPanels()) {
/*  44 */       singleCheckPanel.save();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*  50 */     save();
/*  51 */     return super.checkCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/*  56 */     super.formWillActivate();
/*  57 */     this.checklistPanel.removeAll();
/*  58 */     fillChecklistPanel();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/*  63 */     fillChecklistPanel();
/*  64 */     save();
/*  65 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*  70 */     if (!super.handleConsole(console)) {
/*  71 */       return false;
/*     */     }
/*     */     
/*  74 */     fillChecklistPanel();
/*     */     
/*  76 */     for (SingleCheckPanel singleCheckPanel : getSingleCheckPanels()) {
/*  77 */       singleCheckPanel.handleConsole(console);
/*     */     }
/*     */     
/*  80 */     save();
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  91 */     JPanel panel = new JPanel(new GridBagLayout());
/*  92 */     GridBagConstraints gc = new GridBagConstraints();
/*  93 */     gc.gridx = gc.gridy = 0;
/*  94 */     gc.weightx = 1.0D;
/*  95 */     gc.fill = 1;
/*  96 */     gc.anchor = 23;
/*  97 */     gc.insets.top = 3;
/*     */     
/*  99 */     buildPanel(panel, gc);
/*     */     
/* 101 */     return panel;
/*     */   }
/*     */   
/*     */   protected void buildPanel(JPanel panel, GridBagConstraints gc) {
/* 105 */     gc.weightx = gc.weighty = 1.0D;
/* 106 */     if (isFillVertical()) {
/* 107 */       gc.fill = 1;
/* 108 */       ComponentsScrollPane scrollPane = new ComponentsScrollPane((JPanel)this.checklistPanel);
/* 109 */       panel.add((Component)scrollPane, gc);
/*     */     } else {
/* 111 */       panel.add((Component)this.checklistPanel, gc);
/*     */     } 
/* 113 */     gc.gridy++;
/*     */   }
/*     */ 
/*     */   
/*     */   private void fillChecklistPanel() {
/* 118 */     this.checklistPanel.setLayout(new GridBagLayout());
/* 119 */     GridBagConstraints gc = new GridBagConstraints();
/* 120 */     gc.gridx = 0;
/* 121 */     gc.gridy = 0;
/* 122 */     gc.anchor = 21;
/* 123 */     gc.weightx = 1.0D;
/* 124 */     gc.fill = 2;
/*     */     
/* 126 */     addSingleChecks((JPanel)this.checklistPanel, gc);
/*     */     
/* 128 */     gc.weighty = 1.0D;
/* 129 */     gc.fill = 1;
/* 130 */     this.checklistPanel.add(new JPanel(), gc);
/*     */   }
/*     */   
/*     */   protected abstract void addSingleChecks(JPanel paramJPanel, GridBagConstraints paramGridBagConstraints);
/*     */   
/*     */   public void setSingleCheckPanels(List<T> singleCheckPanels) {
/* 136 */     this.singleCheckPanels = singleCheckPanels;
/*     */   }
/*     */   
/*     */   protected static abstract class SingleCheckPanel
/*     */     extends JPanel
/*     */   {
/*     */     protected JCheckBox chkSingle;
/*     */     
/*     */     public void save() {}
/*     */     
/*     */     public void handleConsole(Console console) throws UserCanceledException {
/* 147 */       if (this.chkSingle != null)
/* 148 */         this.chkSingle.setSelected(console.askYesNo(this.chkSingle.getText(), this.chkSingle.isSelected())); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ChecklistComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */