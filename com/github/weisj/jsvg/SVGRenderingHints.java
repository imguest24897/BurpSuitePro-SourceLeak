/*    */ package com.github.weisj.jsvg;
/*    */ 
/*    */ import java.awt.RenderingHints;
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
/*    */ 
/*    */ 
/*    */ public final class SVGRenderingHints
/*    */ {
/*    */   private static final int P_KEY_IMAGE_ANTIALIASING = 1;
/* 33 */   public static final RenderingHints.Key KEY_IMAGE_ANTIALIASING = new Key(1);
/* 34 */   public static final Object VALUE_IMAGE_ANTIALIASING_ON = Value.ON;
/* 35 */   public static final Object VALUE_IMAGE_ANTIALIASING_OFF = Value.OFF;
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
/*    */   private static final class Key
/*    */     extends RenderingHints.Key
/*    */   {
/*    */     private Key(int privateKey) {
/* 50 */       super(privateKey);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean isCompatibleValue(@Nullable Object val) {
/* 55 */       return val instanceof SVGRenderingHints.Value;
/*    */     }
/*    */   }
/*    */   
/*    */   private enum Value {
/* 60 */     ON,
/* 61 */     OFF;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\SVGRenderingHints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */