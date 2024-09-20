/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.components.AbstractFileSelector;
/*    */ import com.install4j.runtime.installer.frontend.components.DirectorySelector;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.io.File;
/*    */ 
/*    */ public class DirectoryChooserComponent
/*    */   extends AbstractFileChooserComponent<DirectorySelector> {
/*    */   private boolean allowSpacesOnUnix = true;
/*    */   private boolean allowEmpty = false;
/*    */   private boolean standardValidation = true;
/* 13 */   private String directoryDescription = "";
/* 14 */   private String standardDirectoryName = "";
/*    */   private boolean onlyWritable = false;
/*    */   private boolean nextOnEnter;
/*    */   
/*    */   public boolean isAllowSpacesOnUnix() {
/* 19 */     return replaceWithTextOverride("allowSpacesOnUnix", this.allowSpacesOnUnix);
/*    */   }
/*    */   
/*    */   public void setAllowSpacesOnUnix(boolean allowSpacesOnUnix) {
/* 23 */     this.allowSpacesOnUnix = allowSpacesOnUnix;
/*    */   }
/*    */   
/*    */   public boolean isAllowEmpty() {
/* 27 */     return replaceWithTextOverride("allowEmpty", this.allowEmpty);
/*    */   }
/*    */   
/*    */   public void setAllowEmpty(boolean allowEmpty) {
/* 31 */     this.allowEmpty = allowEmpty;
/*    */   }
/*    */   
/*    */   public boolean isStandardValidation() {
/* 35 */     return replaceWithTextOverride("standardValidation", this.standardValidation);
/*    */   }
/*    */   
/*    */   public void setStandardValidation(boolean standardValidation) {
/* 39 */     this.standardValidation = standardValidation;
/*    */   }
/*    */   
/*    */   public String getDirectoryDescription() {
/* 43 */     return replaceVariables(replaceFormVariables(this.directoryDescription));
/*    */   }
/*    */   
/*    */   public void setDirectoryDescription(String directoryDescription) {
/* 47 */     this.directoryDescription = directoryDescription;
/*    */   }
/*    */   
/*    */   public String getStandardDirectoryName() {
/* 51 */     return replaceVariables(replaceFormVariables(this.standardDirectoryName));
/*    */   }
/*    */   
/*    */   public void setStandardDirectoryName(String standardDirectoryName) {
/* 55 */     this.standardDirectoryName = standardDirectoryName;
/*    */   }
/*    */   
/*    */   public boolean isOnlyWritable() {
/* 59 */     return replaceWithTextOverride("onlyWritable", this.onlyWritable);
/*    */   }
/*    */   
/*    */   public void setOnlyWritable(boolean onlyWritable) {
/* 63 */     this.onlyWritable = onlyWritable;
/*    */   }
/*    */   
/*    */   public boolean isNextOnEnter() {
/* 67 */     return replaceWithTextOverride("nextOnEnter", this.nextOnEnter);
/*    */   }
/*    */   
/*    */   public void setNextOnEnter(boolean nextOnEnter) {
/* 71 */     this.nextOnEnter = nextOnEnter;
/*    */   }
/*    */ 
/*    */   
/*    */   protected DirectorySelector createFileSelector() {
/* 76 */     DirectorySelector selector = new DirectorySelector(getDirectoryDescription(), getFormEnvironment().isDesignTime());
/* 77 */     selector.setAllowSpacesOnUnix(isAllowSpacesOnUnix());
/* 78 */     selector.setAllowEmpty(isAllowEmpty());
/* 79 */     selector.setStandardValidation(isStandardValidation());
/* 80 */     if (isNextOnEnter()) {
/* 81 */       selector.activateNextScreenOnEnter(getContext().getWizardContext());
/*    */     }
/* 83 */     return selector;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initFileSelector(File initialFile) {
/* 88 */     getFileSelector().initDirectory(initialFile, getStandardDirectoryName());
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean checkSelectedFile() {
/* 93 */     return (super.checkSelectedFile() && (!isOnlyWritable() || InstallerUtil.checkWritableInstallationDirectory(getFileSelector().getSelectedFile(), true)));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DirectoryChooserComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */