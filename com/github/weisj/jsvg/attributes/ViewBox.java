/*    */ package com.github.weisj.jsvg.attributes;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import java.awt.geom.Point2D;
/*    */ import java.awt.geom.Rectangle2D;
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
/*    */ public final class ViewBox
/*    */   extends Rectangle2D.Float
/*    */ {
/*    */   public ViewBox(float[] viewBox) {
/* 35 */     super(viewBox[0], viewBox[1], viewBox[2], viewBox[3]);
/*    */   }
/*    */   
/*    */   public ViewBox(float x, float y, float w, float h) {
/* 39 */     super(x, y, w, h);
/*    */   }
/*    */   
/*    */   public ViewBox(float w, float h) {
/* 43 */     this(0.0F, 0.0F, w, h);
/*    */   }
/*    */   
/*    */   public ViewBox(FloatSize size) {
/* 47 */     this(size.width, size.height);
/*    */   }
/*    */   
/*    */   public ViewBox(@NotNull Rectangle2D bounds) {
/* 51 */     this((float)bounds.getX(), (float)bounds.getY(), (float)bounds.getWidth(), (float)bounds.getHeight());
/*    */   }
/*    */   
/*    */   public void setSize(@NotNull FloatSize size) {
/* 55 */     this.width = size.width;
/* 56 */     this.height = size.height;
/*    */   }
/*    */   @NotNull
/*    */   public FloatSize size() {
/* 60 */     return new FloatSize(this.width, this.height);
/*    */   }
/*    */   @NotNull
/*    */   public Point2D.Float location() {
/* 64 */     return new Point2D.Float(this.x, this.y);
/*    */   }
/*    */   
/*    */   public boolean hasSpecifiedX() {
/* 68 */     return Length.isSpecified(this.x);
/*    */   }
/*    */   
/*    */   public boolean hasSpecifiedY() {
/* 72 */     return Length.isSpecified(this.y);
/*    */   }
/*    */   
/*    */   public boolean hasSpecifiedWidth() {
/* 76 */     return Length.isSpecified(this.width);
/*    */   }
/*    */   
/*    */   public boolean hasSpecifiedHeight() {
/* 80 */     return Length.isSpecified(this.height);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 85 */     return "ViewBox[" + this.x + "," + this.y + "," + this.width + "," + this.height + "]";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public float normedDiagonalLength() {
/* 91 */     return (float)Math.sqrt(((this.width * this.width + this.height * this.height) / 2.0F));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\ViewBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */