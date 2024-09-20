/*    */ package com.github.weisj.jsvg.attributes.filter;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum DefaultFilterChannel
/*    */   implements FilterChannelKey
/*    */ {
/* 30 */   SourceGraphic,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   SourceAlpha,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 40 */   BackgroundImage,
/*    */ 
/*    */ 
/*    */   
/* 44 */   BackgroundAlpha,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 50 */   FillPaint,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 56 */   StrokePaint,
/*    */ 
/*    */ 
/*    */   
/* 60 */   LastResult;
/*    */   
/*    */   @NotNull
/*    */   public Object key() {
/* 64 */     if (this == LastResult) return this; 
/* 65 */     return toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\filter\DefaultFilterChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */