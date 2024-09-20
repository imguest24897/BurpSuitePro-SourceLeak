/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.google.errorprone.annotations.Immutable;
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
/*    */ @Immutable
/*    */ public final class NumberFontWeight
/*    */   implements FontWeight
/*    */ {
/*    */   private final float weight;
/*    */   
/*    */   public NumberFontWeight(float weight) {
/* 31 */     this.weight = weight;
/*    */   }
/*    */ 
/*    */   
/*    */   public int weight(int parentWeight) {
/* 36 */     return (int)this.weight;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 41 */     return "NumberFontWeight{weight=" + this.weight + '}';
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 46 */     if (this == o) return true; 
/* 47 */     if (!(o instanceof NumberFontWeight)) return false; 
/* 48 */     NumberFontWeight that = (NumberFontWeight)o;
/* 49 */     return (this.weight == that.weight);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 54 */     return Float.hashCode(this.weight);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\NumberFontWeight.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */