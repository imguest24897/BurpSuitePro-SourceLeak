/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.lang.reflect.Array;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ObjectUtil
/*    */ {
/*    */   public static <T> T[] toTypedArray(List<T> list, Class<T> elementClass) {
/* 13 */     return list.toArray((T[])Array.newInstance(elementClass, list.size()));
/*    */   }
/*    */   
/*    */   public static <T> T[] concat(T[] first, T[] second) {
/* 17 */     if (first == null)
/* 18 */       return second; 
/* 19 */     if (second == null) {
/* 20 */       return first;
/*    */     }
/* 22 */     T[] result = Arrays.copyOf(first, first.length + second.length);
/* 23 */     System.arraycopy(second, 0, result, first.length, second.length);
/* 24 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\ObjectUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */