/*    */ package com.install4j.api.styles;
/*    */ 
/*    */ import com.install4j.api.beans.AbstractBean;
/*    */ import com.install4j.api.beans.Anchor;
/*    */ import com.install4j.api.context.Context;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractStyle
/*    */   extends AbstractBean
/*    */   implements Style
/*    */ {
/*    */   private Context context;
/*    */   
/*    */   public void setContext(Context context) {
/* 20 */     this.context = context;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isStandalone() {
/* 25 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void willActivate() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void activated() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void deactivated() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Context getContext() {
/* 47 */     return this.context;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public StyleManager getStyleManager() {
/* 57 */     return getContext().getWizardContext().getStyleManager();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Anchor getAnchor() {
/* 67 */     return Anchor.NORTHWEST;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\styles\AbstractStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */