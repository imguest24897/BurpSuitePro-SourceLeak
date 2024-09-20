/*    */ package com.github.weisj.jsvg.attributes.paint;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import java.awt.Color;
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
/*    */ 
/*    */ public interface PaintParser
/*    */ {
/* 32 */   public static final Color DEFAULT_COLOR = Color.BLACK;
/*    */   
/*    */   @Nullable
/*    */   Color parseColor(@NotNull String paramString, @NotNull AttributeNode paramAttributeNode);
/*    */   
/*    */   @Nullable
/*    */   SVGPaint parsePaint(@Nullable String paramString, @NotNull AttributeNode paramAttributeNode);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\paint\PaintParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */