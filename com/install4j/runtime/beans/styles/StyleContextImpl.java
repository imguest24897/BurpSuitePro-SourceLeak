/*    */ package com.install4j.runtime.beans.styles;
/*    */ 
/*    */ import com.install4j.api.styles.StyleContext;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class StyleContextImpl
/*    */   implements StyleContext
/*    */ {
/*    */   private final JComponent contentComponent;
/*    */   private final String title;
/*    */   private final String subTitle;
/*    */   
/*    */   public StyleContextImpl(JComponent contentComponent, String title, String subTitle) {
/* 14 */     this.contentComponent = contentComponent;
/* 15 */     this.title = title;
/* 16 */     this.subTitle = subTitle;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent getContentComponent() {
/* 21 */     return this.contentComponent;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTitle() {
/* 26 */     return this.title;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSubTitle() {
/* 31 */     return this.subTitle;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\StyleContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */