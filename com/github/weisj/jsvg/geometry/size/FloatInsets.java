/*    */ package com.github.weisj.jsvg.geometry.size;
/*    */ 
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
/*    */ public final class FloatInsets
/*    */ {
/*    */   private final float top;
/*    */   private final float left;
/*    */   private final float bottom;
/*    */   private final float right;
/*    */   
/*    */   public FloatInsets(float top, float left, float bottom, float right) {
/* 33 */     this.top = top;
/* 34 */     this.left = left;
/* 35 */     this.bottom = bottom;
/* 36 */     this.right = right;
/*    */   }
/*    */   
/*    */   public FloatInsets() {
/* 40 */     this(0.0F, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public float top() {
/* 44 */     return this.top;
/*    */   }
/*    */   
/*    */   public float bottom() {
/* 48 */     return this.bottom;
/*    */   }
/*    */   
/*    */   public float left() {
/* 52 */     return this.left;
/*    */   }
/*    */   
/*    */   public float right() {
/* 56 */     return this.right;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 61 */     if (this == o) return true; 
/* 62 */     if (!(o instanceof FloatInsets)) return false; 
/* 63 */     FloatInsets that = (FloatInsets)o;
/* 64 */     return (Float.compare(that.top, this.top) == 0 && 
/* 65 */       Float.compare(that.bottom, this.bottom) == 0 && 
/* 66 */       Float.compare(that.left, this.left) == 0 && 
/* 67 */       Float.compare(that.right, this.right) == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 72 */     return Objects.hash(new Object[] { Float.valueOf(this.top), Float.valueOf(this.left), Float.valueOf(this.bottom), Float.valueOf(this.right) });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 77 */     return "[" + this.top + "," + this.left + "," + this.bottom + "," + this.right + "]";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\size\FloatInsets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */