/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.runtime.beans.applications.CustomApplication;
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.InstallerContextImpl;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import java.awt.Window;
/*    */ 
/*    */ public class InstallerWizardScreenExecutor
/*    */   extends WizardScreenExecutor
/*    */ {
/*    */   private InstallerContextImpl installerContext;
/*    */   
/*    */   public InstallerWizardScreenExecutor(boolean dialog, Window parentWindow) {
/* 15 */     super(dialog, parentWindow);
/* 16 */     this.installerContext = new InstallerContextImpl(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getWindowTitle() {
/* 21 */     String windowTitle = super.getWindowTitle();
/* 22 */     if (windowTitle != null) {
/* 23 */       return windowTitle;
/*    */     }
/* 25 */     if (InstallerConfig.isInstaller()) {
/* 26 */       return Messages.format(getContext().getMessage(".SetupWindowTitle"), new Object[] { InstallerConfig.getCurrentInstance().getApplicationNameWithVersion() });
/*    */     }
/* 28 */     return ((CustomApplication)InstallerConfig.getCurrentApplication()).getWindowTitleRaw();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ContextImpl getContext() {
/* 35 */     return (ContextImpl)this.installerContext;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\InstallerWizardScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */