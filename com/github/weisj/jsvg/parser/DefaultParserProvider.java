/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.paint.DefaultPaintParser;
/*    */ import com.github.weisj.jsvg.attributes.paint.PaintParser;
/*    */ import com.github.weisj.jsvg.parser.css.CssParser;
/*    */ import com.github.weisj.jsvg.parser.css.impl.SimpleCssParser;
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
/*    */ public class DefaultParserProvider
/*    */   implements ParserProvider
/*    */ {
/*    */   @NotNull
/*    */   public PaintParser createPaintParser() {
/* 35 */     return (PaintParser)new DefaultPaintParser();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CssParser createCssParser() {
/* 40 */     return (CssParser)new SimpleCssParser();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public DomProcessor createPreProcessor() {
/* 45 */     return null;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public DomProcessor createPostProcessor() {
/* 50 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\DefaultParserProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */