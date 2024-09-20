/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.frontend.components.ProgramGroupSelector;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ public class ProgramGroupComponent
/*     */   extends SystemFormComponent
/*     */ {
/*  11 */   private String variableName = "";
/*  12 */   private String initialProgramGroup = "";
/*     */   
/*     */   private boolean allUsers = false;
/*     */   private boolean showWarningIfExists = false;
/*     */   private boolean fillVertical = false;
/*     */   private ProgramGroupSelector programGroupSelector;
/*     */   private boolean initialized;
/*     */   
/*     */   public String getVariableName() {
/*  21 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  25 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getInitialProgramGroup() {
/*  29 */     return replaceVariables(replaceFormVariables(this.initialProgramGroup));
/*     */   }
/*     */   
/*     */   public void setInitialProgramGroup(String initialProgramGroup) {
/*  33 */     this.initialProgramGroup = initialProgramGroup;
/*     */   }
/*     */   
/*     */   public boolean isAllUsers() {
/*  37 */     return replaceWithTextOverride("allUsers", this.allUsers);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/*  41 */     this.allUsers = allUsers;
/*     */   }
/*     */   
/*     */   public boolean isShowWarningIfExists() {
/*  45 */     return replaceWithTextOverride("showWarningIfExists", this.showWarningIfExists);
/*     */   }
/*     */   
/*     */   public void setShowWarningIfExists(boolean showWarningIfExists) {
/*  49 */     this.showWarningIfExists = showWarningIfExists;
/*     */   }
/*     */   
/*     */   private void initProgramGroupSelector() {
/*  53 */     if (this.programGroupSelector == null) {
/*  54 */       this.programGroupSelector = new ProgramGroupSelector(isAllUsers(), isShowWarningIfExists(), getContext().getWizardContext());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/*  60 */     super.formWillActivate();
/*  61 */     initializeProgramGroupSelector();
/*     */   }
/*     */   
/*     */   public boolean isFillVertical() {
/*  65 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  69 */     this.fillVertical = fillVertical;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/*  74 */     initProgramGroupSelector();
/*  75 */     setVariable(getSelectedProgramGroupName());
/*  76 */     return true;
/*     */   }
/*     */   
/*     */   private String getUsedInitialProgramGroup() {
/*  80 */     Object value = getContext().getVariable(getVariableName());
/*  81 */     if (value instanceof String) {
/*  82 */       return (String)value;
/*     */     }
/*  84 */     return getInitialProgramGroup();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*  90 */     if (!super.handleConsole(console)) {
/*  91 */       return false;
/*     */     }
/*     */     
/*     */     while (true) {
/*  95 */       String programGroup = console.askString(null, getUsedInitialProgramGroup());
/*  96 */       if (ProgramGroupSelector.checkProgramGroup(programGroup, isAllUsers(), isShowWarningIfExists(), null)) {
/*  97 */         setVariable(programGroup);
/*  98 */         return true;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public boolean checkCompleted() {
/* 103 */     if (!this.programGroupSelector.checkSelectedProgramGroup()) {
/* 104 */       return false;
/*     */     }
/* 106 */     getContext().setVariable(getVariableName(), getSelectedProgramGroupName());
/* 107 */     getContext().registerResponseFileVariable(getVariableName());
/* 108 */     return true;
/*     */   }
/*     */   
/*     */   private void setVariable(String selectedProgramGroupName) {
/* 112 */     getContext().setVariable(getVariableName(), selectedProgramGroupName);
/* 113 */     getContext().registerResponseFileVariable(getVariableName());
/*     */   }
/*     */   
/*     */   private void initializeProgramGroupSelector() {
/* 117 */     if (!this.initialized) {
/* 118 */       this.programGroupSelector.setSelectedProgramGroup(getUsedInitialProgramGroup());
/* 119 */       this.initialized = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getSelectedProgramGroupName() {
/* 124 */     initializeProgramGroupSelector();
/* 125 */     return this.programGroupSelector.getSelectedProgramGroup();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 130 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/* 135 */     return isFillVertical();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 141 */     initProgramGroupSelector();
/* 142 */     return (JComponent)this.programGroupSelector;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ProgramGroupComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */