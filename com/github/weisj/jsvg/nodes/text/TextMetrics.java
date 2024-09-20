/*    */ package com.github.weisj.jsvg.nodes.text;
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
/*    */ public final class TextMetrics
/*    */ {
/*    */   private final double letterSpacingLength;
/*    */   private final double glyphLength;
/*    */   private final double fixedGlyphLength;
/*    */   private final int glyphCount;
/*    */   private final int controllableLetterSpacingCount;
/*    */   
/*    */   public TextMetrics(double letterSpacingLength, double visibleCodepointLength, int glyphCount, double fixedGlyphLength, int controllableLetterSpacingCount) {
/* 33 */     this.letterSpacingLength = letterSpacingLength;
/* 34 */     this.glyphLength = visibleCodepointLength;
/* 35 */     this.glyphCount = glyphCount;
/* 36 */     this.fixedGlyphLength = fixedGlyphLength;
/* 37 */     this.controllableLetterSpacingCount = controllableLetterSpacingCount;
/*    */   }
/*    */   
/*    */   public double letterSpacingLength() {
/* 41 */     return this.letterSpacingLength;
/*    */   }
/*    */   
/*    */   public double glyphLength() {
/* 45 */     return this.glyphLength;
/*    */   }
/*    */   
/*    */   public double fixedGlyphLength() {
/* 49 */     return this.fixedGlyphLength;
/*    */   }
/*    */   
/*    */   public double totalAdjustableLength() {
/* 53 */     return glyphLength() + letterSpacingLength();
/*    */   }
/*    */   
/*    */   public int glyphCount() {
/* 57 */     return this.glyphCount;
/*    */   }
/*    */   
/*    */   public int controllableLetterSpacingCount() {
/* 61 */     return this.controllableLetterSpacingCount;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     return "TextMetrics{whiteSpaceLength=" + this.letterSpacingLength + ", glyphLength=" + this.glyphLength + ", glyphCount=" + this.glyphCount + ", fixedGlyphLength=" + this.fixedGlyphLength + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\TextMetrics.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */