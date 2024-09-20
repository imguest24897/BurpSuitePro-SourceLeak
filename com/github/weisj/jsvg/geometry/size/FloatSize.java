/*    */ package com.github.weisj.jsvg.geometry.size;
/*    */ 
/*    */ import java.awt.geom.Dimension2D;
/*    */ import java.util.Objects;
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
/*    */ public final class FloatSize
/*    */   extends Dimension2D
/*    */ {
/*    */   public float width;
/*    */   public float height;
/*    */   
/*    */   public FloatSize(float width, float height) {
/* 33 */     this.width = width;
/* 34 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getWidth() {
/* 39 */     return this.width;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getHeight() {
/* 44 */     return this.height;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSize(double width, double height) {
/* 49 */     this.width = (float)width;
/* 50 */     this.height = (float)height;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 55 */     return "FloatSize{width=" + this.width + ", height=" + this.height + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 63 */     if (this == o) return true; 
/* 64 */     if (!(o instanceof FloatSize)) return false; 
/* 65 */     FloatSize floatSize = (FloatSize)o;
/* 66 */     return (Float.compare(floatSize.width, this.width) == 0 && Float.compare(floatSize.height, this.height) == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 71 */     return Objects.hash(new Object[] { Float.valueOf(this.width), Float.valueOf(this.height) });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\size\FloatSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */