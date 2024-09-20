/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.styles.Style;
/*    */ import com.install4j.runtime.beans.styles.StyleManagerInt;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class StyleManagerProxy
/*    */   implements StyleManagerInt
/*    */ {
/*    */   private StyleManagerInt parentStyleManager;
/*    */   
/*    */   public StyleManagerProxy(StyleManagerInt parentStyleManager) {
/* 14 */     this.parentStyleManager = parentStyleManager;
/*    */   }
/*    */ 
/*    */   
/*    */   public Style getStyleById(String styleId) {
/* 19 */     return this.parentStyleManager.getStyleById(styleId);
/*    */   }
/*    */ 
/*    */   
/*    */   public Style cloneStyleById(String styleId) {
/* 24 */     return this.parentStyleManager.cloneStyleById(styleId);
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createStyleComponent(Style style) {
/* 29 */     return this.parentStyleManager.createStyleComponent(style);
/*    */   }
/*    */ 
/*    */   
/*    */   public void willActivate(Style style) {
/* 34 */     this.parentStyleManager.willActivate(style);
/*    */   }
/*    */ 
/*    */   
/*    */   public void activated(Style style) {
/* 39 */     this.parentStyleManager.activated(style);
/*    */   }
/*    */ 
/*    */   
/*    */   public void deactivated(Style style) {
/* 44 */     this.parentStyleManager.deactivated(style);
/*    */   }
/*    */ 
/*    */   
/*    */   public Bean replaceBean(String id, Bean bean) {
/* 49 */     return this.parentStyleManager.replaceBean(id, bean);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\StyleManagerProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */