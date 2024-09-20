/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.AttributeParser;
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
/*    */ public final class LoadHelper
/*    */ {
/*    */   @NotNull
/*    */   private final AttributeParser attributeParser;
/*    */   @NotNull
/*    */   private final ResourceLoader resourceLoader;
/*    */   
/*    */   public LoadHelper(@NotNull AttributeParser attributeParser, @NotNull ResourceLoader resourceLoader) {
/* 33 */     this.attributeParser = attributeParser;
/* 34 */     this.resourceLoader = resourceLoader;
/*    */   }
/*    */   @NotNull
/*    */   public AttributeParser attributeParser() {
/* 38 */     return this.attributeParser;
/*    */   }
/*    */   @NotNull
/*    */   public ResourceLoader resourceLoader() {
/* 42 */     return this.resourceLoader;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\LoadHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */