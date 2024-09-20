/*    */ package com.install4j.runtime.beans.styles;
/*    */ 
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.styles.StyleContext;
/*    */ import com.install4j.api.styles.StyleContextReceiver;
/*    */ import com.install4j.runtime.beans.formcomponents.MultilineLabelComponent;
/*    */ 
/*    */ public class ScreenTitleComponent
/*    */   extends MultilineLabelComponent implements StyleContextReceiver {
/* 10 */   private TitleType titleType = TitleType.TITLE;
/*    */   
/*    */   public TitleType getTitleType() {
/* 13 */     return (TitleType)replaceWithTextOverride("titleType", this.titleType, TitleType.class);
/*    */   }
/*    */   
/*    */   public void setTitleType(TitleType titleType) {
/* 17 */     this.titleType = titleType;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setStyleContext(StyleContext styleContext) {
/* 22 */     String title = getTitleType().getTitle(styleContext);
/* 23 */     getLabel().setText((title == null || title.isEmpty()) ? " " : title);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isInitLabelText() {
/* 28 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String getLabelName(FormEnvironment formEnvironment) {
/* 33 */     return getTitleType().name();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\ScreenTitleComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */