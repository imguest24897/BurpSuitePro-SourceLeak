/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.context.UninstallerContext;
/*    */ 
/*    */ public class IdWrapperUninstallerContext
/*    */   extends IdWrapperContext implements UninstallerContext {
/*    */   public IdWrapperUninstallerContext(UninstallerContextImpl parentContext, String unqualifiedIdNamespace) {
/*  8 */     super(parentContext, unqualifiedIdNamespace);
/*    */   }
/*    */   
/*    */   public UninstallerContext getUninstallerParentContext() {
/* 12 */     return (UninstallerContext)getParentContext();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isUninstallForUpgrade() {
/* 17 */     return getUninstallerParentContext().isUninstallForUpgrade();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\IdWrapperUninstallerContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */