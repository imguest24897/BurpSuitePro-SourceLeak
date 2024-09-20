/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.context.Context;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ public abstract class Script
/*    */   implements Serializable
/*    */ {
/*    */   protected abstract Object evaluate(Object[] paramArrayOfObject) throws Exception;
/*    */   
/*    */   public Object evaluate(Context context, Bean bean, Object[] customParameters) throws Exception {
/* 14 */     ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
/*    */     
/*    */     try {
/* 17 */       Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
/* 18 */       if (customParameters == null) {
/* 19 */         customParameters = new Object[0];
/*    */       }
/*    */       
/* 22 */       boolean internalBean = (bean instanceof com.install4j.runtime.beans.groups.Group || bean instanceof com.install4j.runtime.beans.applications.Application);
/* 23 */       int fixedLength = internalBean ? 1 : 2;
/* 24 */       Object[] parameters = new Object[customParameters.length + fixedLength];
/*    */       
/* 26 */       parameters[0] = context;
/* 27 */       if (!internalBean) {
/* 28 */         parameters[1] = bean;
/*    */       }
/*    */       
/* 31 */       System.arraycopy(customParameters, 0, parameters, fixedLength, customParameters.length);
/*    */       
/* 33 */       return evaluate(parameters);
/*    */     } finally {
/* 35 */       Thread.currentThread().setContextClassLoader(oldContextClassLoader);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\Script.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */