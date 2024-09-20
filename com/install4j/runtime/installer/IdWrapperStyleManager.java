/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.styles.Style;
/*    */ import com.install4j.runtime.beans.styles.StyleManagerInt;
/*    */ 
/*    */ public class IdWrapperStyleManager
/*    */   extends StyleManagerProxy {
/*    */   private String unqualifiedIdNamespace;
/*    */   
/*    */   public IdWrapperStyleManager(StyleManagerInt parentStyleManager, String unqualifiedIdNamespace) {
/* 11 */     super(parentStyleManager);
/* 12 */     this.unqualifiedIdNamespace = unqualifiedIdNamespace;
/*    */   }
/*    */ 
/*    */   
/*    */   public Style getStyleById(String styleId) {
/* 17 */     return super.getStyleById(getQualifiedId(styleId));
/*    */   }
/*    */ 
/*    */   
/*    */   public Style cloneStyleById(String styleId) {
/* 22 */     return super.cloneStyleById(getQualifiedId(styleId));
/*    */   }
/*    */   
/*    */   private String getQualifiedId(String id) {
/* 26 */     return IdWrapperContext.getQualifiedId(id, this.unqualifiedIdNamespace);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\IdWrapperStyleManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */