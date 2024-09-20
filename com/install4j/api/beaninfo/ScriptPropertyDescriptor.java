/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ import java.beans.IntrospectionException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ScriptPropertyDescriptor
/*    */   extends Install4JPropertyDescriptor
/*    */ {
/*    */   public static final String ATTRIBUTE_RETURN_TYPE = "returnType";
/*    */   public static final String ATTRIBUTE_SCRIPT_PARAMETERS = "scriptParameters";
/*    */   public static final String ATTRIBUTE_CODE_GALLERY_TAGS = "codeGalleryTags";
/*    */   
/*    */   public static ScriptPropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription, Class returnType, ScriptParameter[] scriptParameters) {
/*    */     try {
/* 42 */       ScriptPropertyDescriptor descriptor = createDescriptor(propertyName, beanClass);
/* 43 */       descriptor.setDisplayName(displayName);
/* 44 */       descriptor.setShortDescription(shortDescription);
/* 45 */       descriptor.setReturnType(returnType);
/* 46 */       descriptor.setScriptParameters(scriptParameters);
/* 47 */       return descriptor;
/* 48 */     } catch (IntrospectionException e) {
/* 49 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ScriptPropertyDescriptor setCodeGalleryTags(String[] tags) {
/* 61 */     if (tags != null) {
/* 62 */       setValue("codeGalleryTags", tags);
/*    */     }
/* 64 */     return this;
/*    */   }
/*    */   
/*    */   private void setReturnType(Class returnType) {
/* 68 */     if (returnType != null) {
/* 69 */       setValue("returnType", returnType);
/*    */     }
/*    */   }
/*    */   
/*    */   private void setScriptParameters(ScriptParameter[] scriptParameters) {
/* 74 */     if (scriptParameters != null) {
/* 75 */       setValue("scriptParameters", scriptParameters);
/*    */     }
/*    */   }
/*    */   
/*    */   private static ScriptPropertyDescriptor createDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/*    */     try {
/* 81 */       return new ScriptPropertyDescriptor(propertyName, beanClass);
/* 82 */     } catch (Exception exception) {
/*    */       
/* 84 */       return new ScriptPropertyDescriptor(propertyName, beanClass, "get" + capitalize(propertyName), null);
/*    */     } 
/*    */   }
/*    */   ScriptPropertyDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/* 88 */     super(propertyName, beanClass);
/*    */   }
/*    */   
/*    */   ScriptPropertyDescriptor(String propertyName, Class beanClass, String readMethod, String writeMethod) throws IntrospectionException {
/* 92 */     super(propertyName, beanClass, readMethod, writeMethod);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ScriptPropertyDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */