/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import javax.swing.JTextArea;
/*    */ import javax.swing.text.JTextComponent;
/*    */ 
/*    */ public class TextAreaComponent
/*    */   extends AbstractTextAreaComponent {
/*    */   private boolean lineWrap = true;
/*    */   private boolean wrapWordStyle = false;
/*    */   
/*    */   public boolean isLineWrap() {
/* 12 */     return replaceWithTextOverride("lineWrap", this.lineWrap);
/*    */   }
/*    */   
/*    */   public void setLineWrap(boolean lineWrap) {
/* 16 */     this.lineWrap = lineWrap;
/*    */   }
/*    */   
/*    */   public boolean isWrapWordStyle() {
/* 20 */     return replaceWithTextOverride("wrapWordStyle", this.wrapWordStyle);
/*    */   }
/*    */   
/*    */   public void setWrapWordStyle(boolean wrapWordStyle) {
/* 24 */     this.wrapWordStyle = wrapWordStyle;
/*    */   }
/*    */ 
/*    */   
/*    */   protected JTextComponent createTextComponent() {
/* 29 */     JTextArea textArea = (JTextArea)super.createTextComponent();
/* 30 */     textArea.setLineWrap(isLineWrap());
/* 31 */     textArea.setWrapStyleWord(isWrapWordStyle());
/* 32 */     return textArea;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\TextAreaComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */