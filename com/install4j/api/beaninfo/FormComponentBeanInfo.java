/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ import com.install4j.api.formcomponents.FormComponent;
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
/*    */ public class FormComponentBeanInfo
/*    */   extends Install4JBeanInfo
/*    */ {
/*    */   public static final String ATTRIBUTE_DEFAULT_VISIBILITY_SCRIPT = "defaultVisibilityScript";
/*    */   public static final String ATTRIBUTE_HIDE_VISIBILITY_SCRIPT = "hideVisibilityScript";
/*    */   
/*    */   public FormComponentBeanInfo(String displayName, String shortDescription, String category, Integer sortKey, Class<? extends FormComponent> beanClass, Class<?> customizerClass) {
/* 27 */     super(displayName, shortDescription, category, true, false, sortKey, (Class)beanClass, customizerClass);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FormComponentBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, Integer sortKey, Class<? extends FormComponent> beanClass, Class<?> customizerClass) {
/* 35 */     super(displayName, shortDescription, category, multipleInstancesSupported, false, sortKey, (Class)beanClass, customizerClass);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FormComponentBeanInfo(String displayName, String shortDescription, String category, Integer sortKey, Class<? extends FormComponent> beanClass) {
/* 42 */     super(displayName, shortDescription, category, true, false, sortKey, (Class)beanClass);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDefaultVisibilityScript(String defaultVisibilityScript) {
/* 51 */     getBeanDescriptor().setValue("defaultVisibilityScript", defaultVisibilityScript);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setHideVisibilityScript(boolean hideVisibilityScript) {
/* 61 */     getBeanDescriptor().setValue("hideVisibilityScript", Boolean.valueOf(hideVisibilityScript));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\FormComponentBeanInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */