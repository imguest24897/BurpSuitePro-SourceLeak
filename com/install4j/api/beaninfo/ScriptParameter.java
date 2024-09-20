/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ import java.lang.reflect.ParameterizedType;
/*    */ import java.lang.reflect.Type;
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
/*    */ public class ScriptParameter
/*    */ {
/*    */   private String parameterName;
/*    */   private Type parameterType;
/*    */   
/*    */   public ScriptParameter(String parameterName, Class parameterClass) {
/* 21 */     this.parameterName = parameterName;
/* 22 */     this.parameterType = parameterClass;
/*    */   }
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
/*    */   public ScriptParameter(String parameterName, ParameterizedType parameterizedType) {
/* 40 */     this.parameterName = parameterName;
/* 41 */     this.parameterType = parameterizedType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getParameterName() {
/* 49 */     return this.parameterName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Class getParameterClass() {
/* 58 */     if (this.parameterType == null)
/* 59 */       return null; 
/* 60 */     if (this.parameterType instanceof Class)
/* 61 */       return (Class)this.parameterType; 
/* 62 */     if (this.parameterType instanceof ParameterizedType) {
/* 63 */       return (Class)((ParameterizedType)this.parameterType).getRawType();
/*    */     }
/* 65 */     throw new IllegalStateException(this.parameterType.getClass().getName());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Type getParameterType() {
/* 74 */     return this.parameterType;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ScriptParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */