/*    */ package com.github.weisj.jsvg.util;
/*    */ 
/*    */ import java.awt.Composite;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Paint;
/*    */ import java.awt.Stroke;
/*    */ import java.awt.geom.AffineTransform;
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
/*    */ 
/*    */ 
/*    */ public class GraphicsResetHelper
/*    */ {
/*    */   private final Graphics2D graphics;
/*    */   private final Composite originalComposite;
/*    */   private final Paint originalPaint;
/*    */   private final Stroke originalStroke;
/*    */   private final AffineTransform originalTransform;
/*    */   
/*    */   public GraphicsResetHelper(Graphics2D graphics) {
/* 44 */     this.graphics = graphics;
/*    */     
/* 46 */     this.originalComposite = graphics.getComposite();
/* 47 */     this.originalPaint = graphics.getPaint();
/* 48 */     this.originalStroke = graphics.getStroke();
/* 49 */     this.originalTransform = graphics.getTransform();
/*    */   }
/*    */   
/*    */   public Graphics2D graphics() {
/* 53 */     return this.graphics;
/*    */   }
/*    */   
/*    */   public void reset() {
/* 57 */     this.graphics.setComposite(this.originalComposite);
/* 58 */     this.graphics.setPaint(this.originalPaint);
/* 59 */     this.graphics.setStroke(this.originalStroke);
/* 60 */     this.graphics.setTransform(this.originalTransform);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\GraphicsResetHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */