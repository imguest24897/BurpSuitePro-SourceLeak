/*     */ package com.install4j.runtime.beans.groups;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.formcomponents.AbstractFormComponent;
/*     */ import com.install4j.api.formcomponents.GroupType;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTabbedPane;
/*     */ 
/*     */ public class TabGroup extends LayoutManagerGroup {
/*  17 */   private static final Object TAB_ICON = "tabIcon";
/*     */   
/*  19 */   private String title = "";
/*     */   private ExternalFile iconFile;
/*     */   private ScriptProperty activationScript;
/*  22 */   private String tooltipText = ""; private JTabbedPane tabbedPane; private JComponent tabComponent;
/*     */   
/*     */   public String getTitle() {
/*  25 */     return replaceVariables(this.title);
/*     */   }
/*     */   
/*     */   public void setTitle(String title) {
/*  29 */     this.title = title;
/*     */   }
/*     */   
/*     */   public ExternalFile getIconFile() {
/*  33 */     return (ExternalFile)replaceWithTextOverride("iconFile", this.iconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setIconFile(ExternalFile iconFile) {
/*  37 */     this.iconFile = iconFile;
/*     */   }
/*     */   
/*     */   public ScriptProperty getActivationScript() {
/*  41 */     return (ScriptProperty)replaceWithTextOverride("activationScript", this.activationScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setActivationScript(ScriptProperty activationScript) {
/*  45 */     this.activationScript = activationScript;
/*     */   }
/*     */   
/*     */   public String getTooltipText() {
/*  49 */     return replaceVariables(this.tooltipText);
/*     */   }
/*     */   
/*     */   public void setTooltipText(String tooltipText) {
/*  53 */     this.tooltipText = tooltipText;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   private int lastIndex = -1;
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/*  64 */     super.setVisible(visible);
/*     */     
/*  66 */     if (visible) {
/*  67 */       insertTab(this.lastIndex);
/*  68 */       setEnabled(isEnabled());
/*     */     } else {
/*  70 */       int index = this.tabbedPane.indexOfComponent(this.tabComponent);
/*  71 */       if (index >= 0) {
/*  72 */         this.lastIndex = index;
/*  73 */         this.tabbedPane.removeTabAt(index);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  80 */     super.setEnabled(enabled);
/*  81 */     int index = this.tabbedPane.indexOfComponent(this.tabComponent);
/*  82 */     if (index >= 0) {
/*  83 */       this.tabbedPane.setEnabledAt(index, enabled);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getDefaultCellSpacing() {
/*  89 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public GroupOrientation getGroupOrientation() {
/*  94 */     return GroupOrientation.VERTICAL;
/*     */   }
/*     */ 
/*     */   
/*     */   public GroupType getGroupType() {
/*  99 */     return GroupType.SINGLE_TAB;
/*     */   }
/*     */ 
/*     */   
/*     */   public Anchor getDefaultAnchor() {
/* 104 */     return Anchor.NORTHWEST;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createComponent(JComponent container) {
/* 109 */     this.tabComponent = super.createComponent(container);
/* 110 */     if (getIconFile() != null) {
/* 111 */       IconHelper.withIcon(getIconFile(), getContext(), icon -> {
/*     */             this.tabComponent.putClientProperty(TAB_ICON, icon);
/*     */             
/*     */             return null;
/*     */           });
/*     */     }
/* 117 */     this.tabbedPane = (JTabbedPane)container;
/* 118 */     insertTab(-1);
/*     */     
/* 120 */     this.tabbedPane.addChangeListener(event -> {
/*     */           if (getActivationScript() != null && this.tabbedPane.getSelectedComponent() == this.tabComponent) {
/*     */             try {
/*     */               getContext().runScript(getActivationScript(), (Bean)this, new Object[] { getFormEnvironment().getLayoutGroupById(getId()), getFormEnvironment() });
/* 124 */             } catch (Exception e) {
/*     */               Util.printAnnotatedStackTrace(e);
/*     */               
/*     */               Logger.getInstance().log(e);
/*     */             } 
/*     */           }
/*     */         });
/* 131 */     JPanel panel = new JPanel(new GridBagLayout());
/* 132 */     panel.setOpaque(false);
/* 133 */     return panel;
/*     */   }
/*     */   
/*     */   private void insertTab(int index) {
/* 137 */     if (isVisible()) {
/* 138 */       int componentCount = this.tabbedPane.getComponentCount();
/* 139 */       int actualIndex = (index < 0) ? componentCount : Math.min(index, componentCount);
/* 140 */       String titleWithoutMnemonics = AbstractFormComponent.getTextWithoutMnemonics(getTitle());
/* 141 */       this.tabbedPane.insertTab(titleWithoutMnemonics, (Icon)this.tabComponent.getClientProperty(TAB_ICON), this.tabComponent, (getTooltipText().length() > 0) ? getTooltipText() : null, actualIndex);
/* 142 */       int mnemonicCharIndex = AbstractFormComponent.getMnemonicCharIndex(getTitle());
/* 143 */       if (mnemonicCharIndex >= 0) {
/* 144 */         int mnemonic = titleWithoutMnemonics.charAt(mnemonicCharIndex);
/* 145 */         if (mnemonic >= 97 && mnemonic <= 122) {
/* 146 */           mnemonic -= 32;
/*     */         }
/* 148 */         this.tabbedPane.setMnemonicAt(actualIndex, mnemonic);
/* 149 */         this.tabbedPane.setDisplayedMnemonicIndexAt(actualIndex, mnemonicCharIndex);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected Insets getDefaultInsets() {
/* 156 */     return new Insets(5, 5, 5, 5);
/*     */   }
/*     */   
/*     */   public void makeTabVisible() {
/* 160 */     this.tabbedPane.setSelectedComponent(this.tabComponent);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\TabGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */