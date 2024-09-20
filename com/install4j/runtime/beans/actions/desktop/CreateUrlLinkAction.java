/*    */ package com.install4j.runtime.beans.actions.desktop;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.beans.ExternalFile;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.MenuHelper;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class CreateUrlLinkAction
/*    */   extends SystemInstallAction
/*    */ {
/*    */   private String url;
/*    */   private File file;
/*    */   private ExternalFile icon;
/*    */   private boolean useFavicon;
/*    */   
/*    */   public String getUrl() {
/* 23 */     return replaceVariables(replaceVariables(this.url));
/*    */   }
/*    */   
/*    */   public void setUrl(String url) {
/* 27 */     this.url = url;
/*    */   }
/*    */   
/*    */   public File getFile() {
/* 31 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 35 */     this.file = file;
/*    */   }
/*    */   
/*    */   public ExternalFile getIcon() {
/* 39 */     return (ExternalFile)replaceWithTextOverride("icon", this.icon, ExternalFile.class);
/*    */   }
/*    */   
/*    */   public void setIcon(ExternalFile icon) {
/* 43 */     this.icon = icon;
/*    */   }
/*    */   
/*    */   public boolean isUseFavicon() {
/* 47 */     return replaceWithTextOverride("useFavicon", this.useFavicon);
/*    */   }
/*    */   
/*    */   public void setUseFavicon(boolean useFavicon) {
/* 51 */     this.useFavicon = useFavicon;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean install(InstallerContext context) throws UserCanceledException {
/* 56 */     if (!Util.isWindows()) {
/* 57 */       return true;
/*    */     }
/*    */     try {
/* 60 */       MenuHelper.installUrlLink(ExecutionContext.SAME, getUrl(), context.getDestinationFile(getFile()), context.getExternalFile(getIcon(), true), isUseFavicon());
/* 61 */     } catch (IOException e) {
/* 62 */       Logger.getInstance().log(e);
/* 63 */       return false;
/*    */     } 
/* 65 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\CreateUrlLinkAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */