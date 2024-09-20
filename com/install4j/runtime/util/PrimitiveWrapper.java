/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ public class PrimitiveWrapper
/*    */ {
/*    */   public static Boolean wrap(boolean v) {
/*  6 */     return Boolean.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Byte wrap(byte v) {
/* 10 */     return Byte.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Short wrap(short v) {
/* 14 */     return Short.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Integer wrap(int v) {
/* 18 */     return Integer.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Long wrap(long v) {
/* 22 */     return Long.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Character wrap(char v) {
/* 26 */     return Character.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Float wrap(float v) {
/* 30 */     return Float.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Double wrap(double v) {
/* 34 */     return Double.valueOf(v);
/*    */   }
/*    */   
/*    */   public static Object wrap(Object v) {
/* 38 */     return v;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\PrimitiveWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */