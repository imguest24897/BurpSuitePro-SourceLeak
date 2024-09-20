/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.screens.components.InstallationDirectorySelector;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class InstallationDirectoryChooserComponent extends LeadingLabelComponent {
/*     */   private InstallationDirectorySelector installationDirectorySelector;
/*     */   
/*     */   public InstallationDirectoryChooserComponent() {
/*  17 */     this.installationDirectorySelector = new InstallationDirectorySelector((Bean)this);
/*  18 */     this.installationDirectorySelector.setCompact(true);
/*     */   }
/*     */   
/*     */   public boolean isStandardValidation() {
/*  22 */     return replaceWithTextOverride("standardValidation", this.installationDirectorySelector.isStandardValidation());
/*     */   }
/*     */   
/*     */   public void setStandardValidation(boolean standardValidation) {
/*  26 */     this.installationDirectorySelector.setStandardValidation(standardValidation);
/*     */   }
/*     */   
/*     */   public boolean isCheckWritable() {
/*  30 */     return replaceWithTextOverride("checkWritable", this.installationDirectorySelector.isCheckWritable());
/*     */   }
/*     */   
/*     */   public void setCheckWritable(boolean standardValidation) {
/*  34 */     this.installationDirectorySelector.setCheckWritable(standardValidation);
/*     */   }
/*     */   
/*     */   public boolean isShowRequiredDiskSpace() {
/*  38 */     return replaceWithTextOverride("showRequiredDiskSpace", this.installationDirectorySelector.isShowRequiredDiskSpace());
/*     */   }
/*     */   
/*     */   public void setShowRequiredDiskSpace(boolean showRequiredDiskSpace) {
/*  42 */     this.installationDirectorySelector.setShowRequiredDiskSpace(showRequiredDiskSpace);
/*     */   }
/*     */   
/*     */   public boolean isShowFreeDiskSpace() {
/*  46 */     return replaceWithTextOverride("showFreeDiskSpace", this.installationDirectorySelector.isShowFreeDiskSpace());
/*     */   }
/*     */   
/*     */   public void setShowFreeDiskSpace(boolean showFreeDiskSpace) {
/*  50 */     this.installationDirectorySelector.setShowFreeDiskSpace(showFreeDiskSpace);
/*     */   }
/*     */   
/*     */   public boolean isCheckFreeSpace() {
/*  54 */     return replaceWithTextOverride("checkFreeSpace", this.installationDirectorySelector.isCheckFreeSpace());
/*     */   }
/*     */   
/*     */   public void setCheckFreeSpace(boolean checkFreeSpace) {
/*  58 */     this.installationDirectorySelector.setCheckFreeSpace(checkFreeSpace);
/*     */   }
/*     */   
/*     */   public boolean isSuggestAppDir() {
/*  62 */     return replaceWithTextOverride("suggestAppDir", this.installationDirectorySelector.isSuggestAppDir());
/*     */   }
/*     */   
/*     */   public void setSuggestAppDir(boolean suggestAppDir) {
/*  66 */     this.installationDirectorySelector.setSuggestAppDir(suggestAppDir);
/*     */   }
/*     */   
/*     */   public boolean isExistingDirWarning() {
/*  70 */     return replaceWithTextOverride("existingDirWarning", this.installationDirectorySelector.isExistingDirWarning());
/*     */   }
/*     */   
/*     */   public void setExistingDirWarning(boolean existingDirWarning) {
/*  74 */     this.installationDirectorySelector.setExistingDirWarning(existingDirWarning);
/*     */   }
/*     */   
/*     */   public boolean isValidateApplicationId() {
/*  78 */     return replaceWithTextOverride("validateApplicationId", this.installationDirectorySelector.isValidateApplicationId());
/*     */   }
/*     */   
/*     */   public void setValidateApplicationId(boolean validateApplicationId) {
/*  82 */     this.installationDirectorySelector.setValidateApplicationId(validateApplicationId);
/*     */   }
/*     */   
/*     */   public boolean isAllowSpacesOnUnix() {
/*  86 */     return replaceWithTextOverride("allowSpacesOnUnix", this.installationDirectorySelector.isAllowSpacesOnUnix());
/*     */   }
/*     */   
/*     */   public void setAllowSpacesOnUnix(boolean allowSpacesOnUnix) {
/*  90 */     this.installationDirectorySelector.setAllowSpacesOnUnix(allowSpacesOnUnix);
/*     */   }
/*     */   
/*     */   public boolean isManualEntryAllowed() {
/*  94 */     return replaceWithTextOverride("manualEntryAllowed", this.installationDirectorySelector.isManualEntryAllowed());
/*     */   }
/*     */   
/*     */   public void setManualEntryAllowed(boolean manualEntryAllowed) {
/*  98 */     this.installationDirectorySelector.setManualEntryAllowed(manualEntryAllowed);
/*     */   }
/*     */   
/*     */   public ScriptProperty getValidationScript() {
/* 102 */     return (ScriptProperty)replaceWithTextOverride("validationScript", this.installationDirectorySelector.getValidationScript(), ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setValidationScript(ScriptProperty validationScript) {
/* 106 */     this.installationDirectorySelector.setValidationScript(validationScript);
/*     */   }
/*     */   
/*     */   public boolean isCompact() {
/* 110 */     return replaceWithTextOverride("compact", this.installationDirectorySelector.isCompact());
/*     */   }
/*     */   
/*     */   public void setCompact(boolean compact) {
/* 114 */     this.installationDirectorySelector.setCompact(compact);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 119 */     return this.installationDirectorySelector.handleUnattended();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 124 */     return this.installationDirectorySelector.handleConsole(console);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContext(Context context) {
/* 129 */     super.setContext(context);
/* 130 */     if (context != null) {
/* 131 */       this.installationDirectorySelector.setContext(context);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 137 */     super.formWillActivate();
/* 138 */     this.installationDirectorySelector.update();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 143 */     return (super.checkCompleted() && (getContext().isConsole() || !isEnabled() || !isVisible() || this.installationDirectorySelector.checkCompleted()));
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 148 */     this.installationDirectorySelector.setDesignTime(getFormEnvironment().isDesignTime());
/* 149 */     this.installationDirectorySelector.createComponent();
/* 150 */     return (JComponent)this.installationDirectorySelector;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 155 */     return this.installationDirectorySelector.getDirectorySelector().getTextField();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/* 160 */     super.setEnabled(enabled);
/* 161 */     this.installationDirectorySelector.getDirectorySelector().getButton().setEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 166 */     return JTextField.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isLeadingLabelTopAligned() {
/* 176 */     return (isShowFreeDiskSpace() || isShowRequiredDiskSpace());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 181 */     super.setFormEnvironment(formEnvironment);
/* 182 */     this.installationDirectorySelector.setFormEnvironment(formEnvironment);
/*     */   }
/*     */   
/*     */   public void update() {
/* 186 */     if (this.installationDirectorySelector != null)
/* 187 */       this.installationDirectorySelector.update(); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\InstallationDirectoryChooserComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */