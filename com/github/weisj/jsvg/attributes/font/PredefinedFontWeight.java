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
/*    */ public enum PredefinedFontWeight
/*    */   implements FontWeight
/*    */ {
/* 28 */   Normal
/*    */   {
/*    */     public int weight(int parentWeight) {
/* 31 */       return 400;
/*    */     }
/*    */   },
/* 34 */   Bold
/*    */   {
/*    */     public int weight(int parentWeight) {
/* 37 */       return 700;
/*    */     }
/*    */   },
/* 40 */   Bolder
/*    */   {
/*    */     public int weight(int parentWeight) {
/* 43 */       if (parentWeight < 400) return 400; 
/* 44 */       if (parentWeight < 600) return 600; 
/* 45 */       return Math.max(parentWeight, 900);
/*    */     }
/*    */   },
/* 48 */   Lighter
/*    */   {
/*    */     public int weight(int parentWeight) {
/* 51 */       if (parentWeight > 700) return 700; 
/* 52 */       if (parentWeight > 500) return 400; 
/* 53 */       return Math.min(parentWeight, 100);
/*    */     }
/*    */   },
/* 56 */   Number
/*    */   {
/*    */     public int weight(int parentWeight) {
/* 59 */       throw new UnsupportedOperationException("Number needs to be parsed explicitly");
/*    */     }
/*    */   };
/*    */   
/*    */   public static final int NORMAL_WEIGHT = 400;
/*    */   public static final int BOLD_WEIGHT = 700;
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\PredefinedFontWeight.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */