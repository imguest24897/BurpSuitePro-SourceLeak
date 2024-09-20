/*    */ package com.github.weisj.jsvg.renderer;
/*    */ 
/*    */ import java.awt.AlphaComposite;
/*    */ import java.awt.Composite;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Paint;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.util.logging.Logger;
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
/*    */ public final class GraphicsUtil
/*    */ {
/* 33 */   private static final Logger LOGGER = Logger.getLogger(GraphicsUtil.class.getName());
/*    */ 
/*    */ 
/*    */   
/*    */   public static void safelySetPaint(@NotNull Graphics2D g, @NotNull Paint paint) {
/* 38 */     g.setPaint(setupPaint(g.getPaint(), paint));
/*    */   }
/*    */   @NotNull
/*    */   public static Paint setupPaint(@NotNull Paint current, @NotNull Paint paint) {
/* 42 */     if (current instanceof WrappingPaint) {
/* 43 */       ((WrappingPaint)current).setPaint(paint);
/* 44 */       return current;
/*    */     } 
/* 46 */     return paint;
/*    */   }
/*    */   @NotNull
/*    */   public static Graphics2D createGraphics(@NotNull BufferedImage image) {
/* 50 */     Graphics2D g = image.createGraphics();
/* 51 */     g.clipRect(0, 0, image.getWidth(), image.getHeight());
/* 52 */     return g;
/*    */   }
/*    */   @NotNull
/*    */   public static Composite deriveComposite(@NotNull Graphics2D g, float opacity) {
/* 56 */     Composite composite = g.getComposite();
/* 57 */     if (composite instanceof AlphaComposite) {
/* 58 */       AlphaComposite ac = (AlphaComposite)composite;
/* 59 */       return AlphaComposite.getInstance(ac.getRule(), ac.getAlpha() * opacity);
/* 60 */     }  if (composite != null) {
/* 61 */       LOGGER.warning(String.format("Composite %s will be overridden by opacity %s", new Object[] { composite, Float.valueOf(opacity) }));
/*    */     }
/* 63 */     return AlphaComposite.getInstance(3, opacity);
/*    */   }
/*    */   
/*    */   public static interface WrappingPaint {
/*    */     void setPaint(@NotNull Paint param1Paint);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\GraphicsUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */