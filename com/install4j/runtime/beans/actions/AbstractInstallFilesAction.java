/*    */ package com.install4j.runtime.beans.actions;
/*    */ 
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.runtime.installer.frontend.ProgressDelegate;
/*    */ 
/*    */ public abstract class AbstractInstallFilesAction
/*    */   extends SystemInstallAction
/*    */ {
/*    */   private ScriptProperty fileFilterScript;
/*    */   private ScriptProperty directoryResolverScript;
/*    */   private boolean showFileNames = true;
/*    */   private boolean delay = false;
/*    */   private boolean triggerReboot = true;
/*    */   private boolean acceptAllCertificates = false;
/*    */   
/*    */   public boolean isDelay() {
/* 19 */     return replaceWithTextOverride("delay", this.delay);
/*    */   }
/*    */   
/*    */   public void setDelay(boolean delay) {
/* 23 */     this.delay = delay;
/*    */   }
/*    */   
/*    */   public boolean isTriggerReboot() {
/* 27 */     return replaceWithTextOverride("triggerReboot", this.triggerReboot);
/*    */   }
/*    */   
/*    */   public void setTriggerReboot(boolean triggerReboot) {
/* 31 */     this.triggerReboot = triggerReboot;
/*    */   }
/*    */   
/*    */   public ScriptProperty getFileFilterScript() {
/* 35 */     return (ScriptProperty)replaceWithTextOverride("fileFilterScript", this.fileFilterScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setFileFilterScript(ScriptProperty fileFilterScript) {
/* 39 */     this.fileFilterScript = fileFilterScript;
/*    */   }
/*    */   
/*    */   public ScriptProperty getDirectoryResolverScript() {
/* 43 */     return (ScriptProperty)replaceWithTextOverride("directoryResolverScript", this.directoryResolverScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setDirectoryResolverScript(ScriptProperty directoryResolverScript) {
/* 47 */     this.directoryResolverScript = directoryResolverScript;
/*    */   }
/*    */   
/*    */   public boolean isShowFileNames() {
/* 51 */     return replaceWithTextOverride("showFileNames", this.showFileNames);
/*    */   }
/*    */   
/*    */   public void setShowFileNames(boolean showFileNames) {
/* 55 */     this.showFileNames = showFileNames;
/*    */   }
/*    */   
/*    */   public boolean isAcceptAllCertificates() {
/* 59 */     return replaceWithTextOverride("acceptAllCertificates", this.acceptAllCertificates);
/*    */   }
/*    */   
/*    */   public void setAcceptAllCertificates(boolean acceptAllCertificates) {
/* 63 */     this.acceptAllCertificates = acceptAllCertificates;
/*    */   }
/*    */   protected ProgressInterface getProgressInterface(InstallerContext context) {
/*    */     ProgressDelegate progressDelegate;
/* 67 */     ProgressInterface progressInterface = context.getProgressInterface();
/* 68 */     if (!isShowFileNames()) {
/* 69 */       progressDelegate = new ProgressDelegate(progressInterface)
/*    */         {
/*    */           public void setDetailMessage(String message) {
/* 72 */             super.setDetailMessage("");
/*    */           }
/*    */ 
/*    */ 
/*    */ 
/*    */           
/*    */           public void setSecondaryPercentCompleted(int value) {}
/*    */         };
/*    */     }
/* 81 */     return (ProgressInterface)progressDelegate;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\AbstractInstallFilesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */