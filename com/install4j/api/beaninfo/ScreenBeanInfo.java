/*     */ package com.install4j.api.beaninfo;
/*     */ 
/*     */ import com.install4j.api.screens.Screen;
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
/*     */ public class ScreenBeanInfo
/*     */   extends Install4JBeanInfo
/*     */ {
/*     */   public static final String ATTRIBUTE_DEFAULT_QUIT_AFTER_SCREEN = "defaultQuitAfterScreen";
/*     */   @Deprecated
/*     */   public static final String ATTRIBUTE_FORM_COMPONENT_CUSTOMIZER_PLACEMENT = "formComponentCustomizerPlacement";
/*     */   public static final String ATTRIBUTE_ASSOCIATED_ACTION = "associatedAction";
/*     */   public static final String ATTRIBUTE_ASSOCIATED_ACTION_TARGET_SCREEN = "associatedActionTargetScreen";
/*     */   public static final String ATTRIBUTE_DEFAULT_STYLE_NAME = "defaultStyleName";
/*     */   public static final String ATTRIBUTE_DEFAULT_PRE_ACTIVATION_SCRIPT = "defaultPreActivationScript";
/*     */   public static final String ATTRIBUTE_DEFAULT_POST_ACTIVATION_SCRIPT = "defaultPostActivationScript";
/*     */   
/*     */   public ScreenBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, boolean installedFilesRequired, Integer sortKey, Class<? extends Screen> beanClass, Class<?> customizerClass) {
/*  52 */     super(displayName, shortDescription, category, multipleInstancesSupported, installedFilesRequired, sortKey, (Class)beanClass, customizerClass);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ScreenBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, boolean installedFilesRequired, Integer sortKey, Class<? extends Screen> beanClass) {
/*  59 */     super(displayName, shortDescription, category, multipleInstancesSupported, installedFilesRequired, sortKey, (Class)beanClass);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultQuitAfterScreen(boolean defaultQuitAfterScreen) {
/*  67 */     getBeanDescriptor().setValue("defaultQuitAfterScreen", Boolean.valueOf(defaultQuitAfterScreen));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setFormComponentCustomizerPlacement(CustomizerPlacement customizerPlacement) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAssociatedAction(String actionClassName, String targetScreenClassName) {
/*  88 */     if (actionClassName != null) {
/*  89 */       getBeanDescriptor().setValue("associatedAction", actionClassName);
/*     */     }
/*  91 */     if (targetScreenClassName != null) {
/*  92 */       getBeanDescriptor().setValue("associatedActionTargetScreen", targetScreenClassName);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultStyleName(String defaultStyleName) {
/* 102 */     if (defaultStyleName != null) {
/* 103 */       getBeanDescriptor().setValue("defaultStyleName", defaultStyleName);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultPreActivationScript(String defaultPreActivationScript) {
/* 113 */     getBeanDescriptor().setValue("defaultPreActivationScript", defaultPreActivationScript);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultPostActivationScript(String defaultPostActivationScript) {
/* 122 */     getBeanDescriptor().setValue("defaultPostActivationScript", defaultPostActivationScript);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ScreenBeanInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */