/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.text.Glyph;
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
/*    */ public interface SVGFont
/*    */ {
/*    */   static float defaultFontSize() {
/* 31 */     return 10.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   static float exFromEm(float em) {
/* 36 */     return em / 2.0F;
/*    */   }
/*    */   
/*    */   static float emFromEx(float ex) {
/* 40 */     return 2.0F * ex;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   Glyph codepointGlyph(char paramChar);
/*    */   
/*    */   @NotNull
/*    */   String family();
/*    */   
/*    */   int size();
/*    */   
/*    */   float effectiveExHeight();
/*    */   
/*    */   float effectiveEmHeight();
/*    */   
/*    */   float mathematicalBaseline();
/*    */   
/*    */   float hangingBaseline();
/*    */   
/*    */   float romanBaseline();
/*    */   
/*    */   float centerBaseline();
/*    */   
/*    */   float middleBaseline();
/*    */   
/*    */   float textUnderBaseline();
/*    */   
/*    */   float textOverBaseline();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\SVGFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */