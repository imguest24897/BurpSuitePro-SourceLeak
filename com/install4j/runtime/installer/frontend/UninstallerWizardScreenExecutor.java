/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.UninstallerContextImpl;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import java.awt.Component;
/*    */ import java.awt.event.MouseEvent;
/*    */ 
/*    */ public class UninstallerWizardScreenExecutor
/*    */   extends WizardScreenExecutor {
/*    */   private UninstallerContextImpl uninstallerContext;
/*    */   
/*    */   public UninstallerWizardScreenExecutor() {
/* 14 */     super(false, null);
/* 15 */     this.uninstallerContext = new UninstallerContextImpl(this);
/* 16 */     new MouseEvent((Component)this, 1, 0L, 0, 0, 0, 0, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getWindowTitle() {
/* 21 */     String windowTitle = super.getWindowTitle();
/* 22 */     if (windowTitle != null) {
/* 23 */       return windowTitle;
/*    */     }
/* 25 */     return Messages.format(getContext().getMessage(".UninstallAppFullTitle"), new Object[] { InstallerConfig.getCurrentInstance().getApplicationNameWithVersion() });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ContextImpl getContext() {
/* 31 */     return (ContextImpl)this.uninstallerContext;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\UninstallerWizardScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */