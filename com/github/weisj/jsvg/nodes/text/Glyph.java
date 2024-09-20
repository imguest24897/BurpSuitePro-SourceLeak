/*    */ package com.github.weisj.jsvg.nodes.text;
/*    */ 
/*    */ import java.awt.Shape;
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
/*    */ public final class Glyph
/*    */ {
/*    */   @NotNull
/*    */   private final Shape outline;
/*    */   private final float advance;
/*    */   private final boolean isEmpty;
/*    */   
/*    */   public Glyph(@NotNull Shape outline, float advance, boolean isEmpty) {
/* 34 */     this.outline = outline;
/* 35 */     this.advance = advance;
/* 36 */     this.isEmpty = isEmpty;
/*    */   }
/*    */   
/*    */   public float advance() {
/* 40 */     return this.advance;
/*    */   }
/*    */   @NotNull
/*    */   public Shape glyphOutline() {
/* 44 */     return this.outline;
/*    */   }
/*    */   
/*    */   public boolean isRendered() {
/* 48 */     return !this.isEmpty;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\Glyph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */