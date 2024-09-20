/*    */ package com.github.weisj.jsvg.geometry.mesh;
/*    */ 
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
/*    */ final class Split<T>
/*    */ {
/*    */   @NotNull
/*    */   public final T left;
/*    */   @NotNull
/*    */   public final T right;
/*    */   
/*    */   public Split(@NotNull T left, @NotNull T right) {
/* 31 */     this.left = left;
/* 32 */     this.right = right;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\mesh\Split.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */