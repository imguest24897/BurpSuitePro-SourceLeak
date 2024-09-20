/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BeanValidationException
/*    */   extends Exception
/*    */ {
/*    */   private String propertyName;
/*    */   private String customizerTabName;
/*    */   
/*    */   public BeanValidationException(String errorMessage) {
/* 18 */     this(errorMessage, null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BeanValidationException(String errorMessage, String propertyName) {
/* 28 */     super(errorMessage);
/* 29 */     this.propertyName = propertyName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getPropertyName() {
/* 37 */     return this.propertyName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCustomizerTabName(String customizerTabName) {
/* 48 */     this.customizerTabName = customizerTabName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCustomizerTabName() {
/* 57 */     return this.customizerTabName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\BeanValidationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */