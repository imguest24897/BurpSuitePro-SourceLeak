/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.actions.Action;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallationComponentSetup;
/*    */ import com.install4j.api.context.LauncherSetup;
/*    */ import com.install4j.api.context.WizardContext;
/*    */ import com.install4j.api.screens.Screen;
/*    */ 
/*    */ public class IdWrapperContext
/*    */   extends ContextProxy {
/*    */   public static String getQualifiedId(String id, String unqualifiedIdNamespace) {
/*    */     String qualifiedId;
/* 14 */     if (id.indexOf(':') < 0) {
/* 15 */       qualifiedId = unqualifiedIdNamespace + ":" + id;
/*    */     } else {
/* 17 */       qualifiedId = id;
/*    */     } 
/* 19 */     return qualifiedId;
/*    */   }
/*    */   
/*    */   private String unqualifiedIdNamespace;
/*    */   private IdWrapperWizardContext idWrapperWizardContext;
/*    */   
/*    */   public IdWrapperContext(Context parentContext, String unqualifiedIdNamespace) {
/* 26 */     super(parentContext);
/* 27 */     this.unqualifiedIdNamespace = unqualifiedIdNamespace;
/* 28 */     this.idWrapperWizardContext = new IdWrapperWizardContext(parentContext.getWizardContext(), unqualifiedIdNamespace);
/*    */   }
/*    */ 
/*    */   
/*    */   public ContextImpl getParentContext() {
/* 33 */     return (ContextImpl)super.getParentContext();
/*    */   }
/*    */ 
/*    */   
/*    */   public Screen getScreenById(String id) {
/* 38 */     return getParentContext().getScreenById(getQualifiedId(id));
/*    */   }
/*    */ 
/*    */   
/*    */   public Action getActionById(String id) {
/* 43 */     return getParentContext().getActionById(getQualifiedId(id));
/*    */   }
/*    */ 
/*    */   
/*    */   public InstallationComponentSetup getInstallationComponentById(String id) {
/* 48 */     return getParentContext().getInstallationComponentById(getQualifiedId(id));
/*    */   }
/*    */ 
/*    */   
/*    */   public LauncherSetup getLauncherById(String id) {
/* 53 */     return getParentContext().getLauncherById(getQualifiedId(id));
/*    */   }
/*    */   
/*    */   protected String getQualifiedId(String id) {
/* 57 */     return getQualifiedId(id, this.unqualifiedIdNamespace);
/*    */   }
/*    */ 
/*    */   
/*    */   public WizardContext getWizardContext() {
/* 62 */     return this.idWrapperWizardContext;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\IdWrapperContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */