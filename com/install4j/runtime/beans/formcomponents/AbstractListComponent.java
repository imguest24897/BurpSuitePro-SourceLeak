/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public abstract class AbstractListComponent
/*    */   extends LeadingLabelComponent {
/* 12 */   private String variableName = "";
/*    */   private String[] listEntries;
/*    */   private int initiallySelectedIndex;
/*    */   private boolean fillHorizontal;
/*    */   private ScriptProperty selectionChangedScript;
/*    */   
/*    */   protected AbstractListComponent() {
/* 19 */     setFillHorizontal(getInitialFillHorizontal());
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract boolean getInitialFillHorizontal();
/*    */   
/*    */   public void initialize() {
/* 26 */     super.initialize();
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 30 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 34 */     this.variableName = variableName;
/*    */   }
/*    */   
/*    */   public String[] getListEntries() {
/* 38 */     return (String[])replaceWithTextOverride("listEntries", replaceFormVariables(this.listEntries), String[].class);
/*    */   }
/*    */   
/*    */   public void setListEntries(String[] listEntries) {
/* 42 */     this.listEntries = listEntries;
/*    */   }
/*    */   
/*    */   public int getInitiallySelectedIndex() {
/* 46 */     return replaceWithTextOverride("initiallySelectedIndex", this.initiallySelectedIndex);
/*    */   }
/*    */   
/*    */   public void setInitiallySelectedIndex(int initiallySelectedIndex) {
/* 50 */     this.initiallySelectedIndex = initiallySelectedIndex;
/*    */   }
/*    */   
/*    */   public boolean isFillHorizontal() {
/* 54 */     return replaceWithTextOverride("fillHorizontal", this.fillHorizontal);
/*    */   }
/*    */   
/*    */   public void setFillHorizontal(boolean fillHorizontal) {
/* 58 */     this.fillHorizontal = fillHorizontal;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 63 */     return isFillHorizontal();
/*    */   }
/*    */   
/*    */   public ScriptProperty getSelectionChangedScript() {
/* 67 */     return (ScriptProperty)replaceWithTextOverride("selectionChangedScript", this.selectionChangedScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setSelectionChangedScript(ScriptProperty selectionChangedScript) {
/* 71 */     this.selectionChangedScript = selectionChangedScript;
/*    */   }
/*    */   
/*    */   protected void adjustMinimumSize(JComponent adjustableComponent, JComponent preferredSizeComponent) {
/* 75 */     if (!isFillHorizontal()) {
/* 76 */       Dimension preferredSize = preferredSizeComponent.getPreferredSize();
/* 77 */       adjustableComponent.setMinimumSize(preferredSize);
/* 78 */       adjustableComponent.setMaximumSize(preferredSize);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void selectionChanged(Object selectedItem, int selectedIndex) {
/* 83 */     if (getSelectionChangedScript() != null)
/*    */       try {
/* 85 */         getContext().runScript(getSelectionChangedScript(), (Bean)this, new Object[] { getFormEnvironment(), selectedItem, Integer.valueOf(selectedIndex) });
/* 86 */       } catch (Exception e) {
/* 87 */         Util.printAnnotatedStackTrace(e);
/* 88 */         Logger.getInstance().log(e);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\AbstractListComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */