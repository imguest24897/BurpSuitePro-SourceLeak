/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
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
/*    */ public class ChangeHelper
/*    */ {
/*    */   public static String addRemoveChangeToString(int paramInt1, int paramInt2, List<?> paramList1, List<?> paramList2) {
/* 33 */     StringBuilder stringBuilder = new StringBuilder();
/*    */     
/* 35 */     if (paramList2.isEmpty()) {
/* 36 */       stringBuilder.append(paramList1.subList(paramInt1, paramInt2));
/* 37 */       stringBuilder.append(" added at ").append(paramInt1);
/*    */     } else {
/* 39 */       stringBuilder.append(paramList2);
/* 40 */       if (paramInt1 == paramInt2) {
/* 41 */         stringBuilder.append(" removed at ").append(paramInt1);
/*    */       } else {
/* 43 */         stringBuilder.append(" replaced by ");
/* 44 */         stringBuilder.append(paramList1.subList(paramInt1, paramInt2));
/* 45 */         stringBuilder.append(" at ").append(paramInt1);
/*    */       } 
/*    */     } 
/* 48 */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public static String permChangeToString(int[] paramArrayOfint) {
/* 52 */     return "permutated by " + Arrays.toString(paramArrayOfint);
/*    */   }
/*    */   
/*    */   public static String updateChangeToString(int paramInt1, int paramInt2) {
/* 56 */     return "updated at range [" + paramInt1 + ", " + paramInt2 + ")";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ChangeHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */