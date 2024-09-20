/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.context.WizardContext;
/*    */ import com.install4j.api.styles.StyleManager;
/*    */ import com.install4j.runtime.beans.styles.StyleManagerInt;
/*    */ 
/*    */ public class IdWrapperWizardContext
/*    */   extends WizardContextProxy {
/*    */   private StyleManager idWrapperStyleManager;
/*    */   
/*    */   public IdWrapperWizardContext(WizardContext parentContext, String unqualifiedIdNamespace) {
/* 12 */     super(parentContext);
/* 13 */     this.idWrapperStyleManager = (StyleManager)new IdWrapperStyleManager((StyleManagerInt)parentContext.getStyleManager(), unqualifiedIdNamespace);
/*    */   }
/*    */ 
/*    */   
/*    */   public StyleManager getStyleManager() {
/* 18 */     return this.idWrapperStyleManager;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\IdWrapperWizardContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */