/*    */ package com.github.weisj.jsvg.nodes.text;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ final class StringTextSegment
/*    */   implements TextSegment
/*    */ {
/*    */   private final char[] codepoints;
/*    */   private final TextContainer parent;
/*    */   private final int index;
/*    */   @Nullable
/* 36 */   Shape currentGlyphRun = null;
/*    */   @Nullable
/* 38 */   RenderContext currentRenderContext = null;
/*    */ 
/*    */   
/*    */   public StringTextSegment(@NotNull TextContainer parent, int index, char[] codepoints) {
/* 42 */     this.parent = parent;
/* 43 */     this.index = index;
/* 44 */     assert codepoints.length != 0;
/* 45 */     this.codepoints = codepoints;
/*    */   }
/*    */   
/*    */   public char[] codepoints() {
/* 49 */     return this.codepoints;
/*    */   }
/*    */   
/*    */   public boolean isLastSegmentInParent() {
/* 53 */     return (this.index == this.parent.children().size() - 1);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\StringTextSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */