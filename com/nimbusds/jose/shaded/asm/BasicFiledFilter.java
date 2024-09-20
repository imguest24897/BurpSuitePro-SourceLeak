/*    */ package com.nimbusds.jose.shaded.asm;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class BasicFiledFilter implements FieldFilter {
/*  7 */   public static final BasicFiledFilter SINGLETON = new BasicFiledFilter();
/*    */ 
/*    */   
/*    */   public boolean canUse(Field field) {
/* 11 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canUse(Field field, Method method) {
/* 16 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canRead(Field field) {
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canWrite(Field field) {
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\BasicFiledFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */