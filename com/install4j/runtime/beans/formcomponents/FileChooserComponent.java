/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.components.AbstractFileSelector;
/*    */ import com.install4j.runtime.installer.frontend.components.FileSelector;
/*    */ 
/*    */ public class FileChooserComponent extends AbstractFileChooserComponent<FileSelector> {
/*    */   private boolean useFileFilter = false;
/*  8 */   private String fileFilterName = "";
/*  9 */   private String[] filteredExtensions = null;
/*    */   
/*    */   public boolean isUseFileFilter() {
/* 12 */     return replaceWithTextOverride("useFileFilter", this.useFileFilter);
/*    */   }
/*    */   
/*    */   public void setUseFileFilter(boolean useFileFilter) {
/* 16 */     this.useFileFilter = useFileFilter;
/*    */   }
/*    */   
/*    */   public String getFileFilterName() {
/* 20 */     return replaceVariables(replaceFormVariables(this.fileFilterName));
/*    */   }
/*    */   
/*    */   public void setFileFilterName(String fileFilterName) {
/* 24 */     this.fileFilterName = fileFilterName;
/*    */   }
/*    */   
/*    */   public String[] getFilteredExtensions() {
/* 28 */     return (String[])replaceWithTextOverride("filteredExtensions", replaceFormVariables(this.filteredExtensions), String[].class);
/*    */   }
/*    */   
/*    */   public void setFilteredExtensions(String[] filteredExtensions) {
/* 32 */     this.filteredExtensions = filteredExtensions;
/*    */   }
/*    */ 
/*    */   
/*    */   protected FileSelector createFileSelector() {
/* 37 */     return new FileSelector(isUseFileFilter() ? getFileFilterName() : "", isUseFileFilter() ? getFilteredExtensions() : null, getFormEnvironment().isDesignTime());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FileChooserComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */