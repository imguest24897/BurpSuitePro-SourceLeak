/*     */ package com.install4j.api.beaninfo;
/*     */ 
/*     */ import java.beans.IntrospectionException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ActionListPropertyDescriptor
/*     */   extends Install4JPropertyDescriptor
/*     */ {
/*     */   public static final String ATTRIBUTE_ALLOWED_ACTION_CLASSES = "allowedActions";
/*     */   public static final String ATTRIBUTE_EXTRA_SCRIPT_PARAMETERS = "extraScriptParameters";
/*     */   public static final String ATTRIBUTE_CONFIGURABLE_ELEVATION_TYPE = "configurableElevationType";
/*     */   public static final String ATTRIBUTE_ACTION_KEYS = "actionsKeys";
/*     */   public static final String ACTION_KEY_NO_ROLLBACK = "noRollback";
/*     */   
/*     */   public static ActionListPropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription) {
/*     */     try {
/*  54 */       ActionListPropertyDescriptor descriptor = createDescriptor(propertyName, beanClass);
/*  55 */       descriptor.setDisplayName(displayName);
/*  56 */       descriptor.setShortDescription(shortDescription);
/*  57 */       return descriptor;
/*  58 */     } catch (IntrospectionException e) {
/*  59 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static ActionListPropertyDescriptor createDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/*     */     try {
/*  65 */       return new ActionListPropertyDescriptor(propertyName, beanClass);
/*  66 */     } catch (Exception exception) {
/*     */       
/*  68 */       return new ActionListPropertyDescriptor(propertyName, beanClass, "get" + capitalize(propertyName), null);
/*     */     } 
/*     */   }
/*     */   ActionListPropertyDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/*  72 */     super(propertyName, beanClass);
/*     */   }
/*     */   
/*     */   ActionListPropertyDescriptor(String propertyName, Class beanClass, String readMethod, String writeMethod) throws IntrospectionException {
/*  76 */     super(propertyName, beanClass, readMethod, writeMethod);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ActionListPropertyDescriptor setAllowedActionClasses(Class[] actionClasses) {
/*  87 */     if (actionClasses != null) {
/*  88 */       setValue("allowedActions", actionClasses);
/*     */     }
/*  90 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ActionListPropertyDescriptor setExtraScriptParameters(ScriptParameter[] scriptParameters) {
/* 103 */     if (scriptParameters != null) {
/* 104 */       setValue("extraScriptParameters", scriptParameters);
/*     */     }
/* 106 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ActionListPropertyDescriptor setConfigurableElevationType(boolean configurableElevationType) {
/* 120 */     setValue("configurableElevationType", Boolean.valueOf(configurableElevationType));
/* 121 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ActionListPropertyDescriptor setActionKeys(String[] actionsKeys) {
/* 132 */     if (actionsKeys != null) {
/* 133 */       setValue("actionsKeys", actionsKeys);
/*     */     }
/* 135 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ActionListPropertyDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */