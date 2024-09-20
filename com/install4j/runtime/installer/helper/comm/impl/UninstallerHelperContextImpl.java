/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UninstallerContext;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.UninstallerContextImpl;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*    */ import java.io.File;
/*    */ 
/*    */ public class UninstallerHelperContextImpl
/*    */   extends HelperContextImpl
/*    */   implements UninstallerContext {
/*    */   public UninstallerHelperContextImpl() {
/* 15 */     UninstallerContextImpl.preLoadLibraries();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isUninstallForUpgrade() {
/* 20 */     return this.helperCommunication.fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 23 */             return ((UninstallerContext)context).isUninstallForUpgrade();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public File getAdditionalUserJarsDir() {
/* 30 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\UninstallerHelperContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */