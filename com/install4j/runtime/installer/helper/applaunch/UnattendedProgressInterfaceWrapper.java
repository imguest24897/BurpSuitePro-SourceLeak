/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UnattendedProgressInterface;
/*    */ import com.install4j.api.launcher.ApplicationLauncher;
/*    */ 
/*    */ public class UnattendedProgressInterfaceWrapper
/*    */   extends ProgressInterfaceWrapper implements UnattendedProgressInterface {
/*    */   public UnattendedProgressInterfaceWrapper(UnattendedProgressInterface delegate, ApplicationLauncher.ProgressListener progressListener) {
/* 10 */     super((ProgressInterface)delegate, progressListener);
/* 11 */     this.delegate = delegate;
/*    */   }
/*    */   private final UnattendedProgressInterface delegate;
/*    */   
/*    */   public void setVisible(boolean visible) {
/* 16 */     this.delegate.setVisible(visible);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelButtonEnabled(boolean enabled) {
/* 21 */     this.delegate.setCancelButtonEnabled(enabled);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelButtonVisible(boolean visible) {
/* 26 */     this.delegate.setCancelButtonVisible(visible);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\UnattendedProgressInterfaceWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */