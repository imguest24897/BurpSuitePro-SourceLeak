/*     */ package com.install4j.api.beaninfo;
/*     */ 
/*     */ import java.beans.IntrospectionException;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.beans.PropertyDescriptor;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Install4JPropertyDescriptor
/*     */   extends PropertyDescriptor
/*     */ {
/*     */   public static final String ATTRIBUTE_PROPERTY_CATEGORY = "propertyCategory";
/*     */   public static final String CATEGORY_CONFIGURATION = "Configuration";
/*     */   public static final String ATTRIBUTE_CONTEXT = "context";
/*     */   public static final String CONTEXT_LAUNCHER_ID = "launcher";
/*     */   public static final String CONTEXT_LAUNCHER_ID_OR_OTHER = "launcherOrOther";
/*     */   public static final String CONTEXT_NON_SERVICE_LAUNCHER_ID = "nonServiceLauncher";
/*     */   public static final String CONTEXT_SERVICE_LAUNCHER_ID = "serviceLauncher";
/*     */   public static final String CONTEXT_COMPONENT_ID = "component";
/*     */   public static final String CONTEXT_FORM_COMPONENT_ID = "formComponent";
/*     */   public static final String CONTEXT_STYLE_ID = "style";
/*     */   public static final String CONTEXT_DOWNLOADABLE_COMPONENT_ID = "downloadableComponent";
/*     */   public static final String CONTEXT_MULTILINE = "multiline";
/*     */   public static final String CONTEXT_HTML = "html";
/*     */   public static final String CONTEXT_DATETIME = "dateTime";
/*     */   public static final String CONTEXT_VARIABLE_NAME = "variableName";
/*     */   public static final String CONTEXT_NO_INSTALLER_VARIABLES = "noInstallerVariables";
/*     */   public static final String CONTEXT_STRING_TO_STRING_MAP = "stringToStringMap";
/*     */   public static final String CONTEXT_ANCHOR_CORNERS = "corners";
/*     */   public static final String CONTEXT_ANCHOR_SIDES = "sides";
/*     */   public static final String CONTEXT_ANCHOR_HORIZONTAL = "horizontal";
/*     */   public static final String CONTEXT_ANCHOR_VERTICAL = "vertical";
/*     */   public static final String ATTRIBUTE_SORT_KEY = "sortKey";
/*     */   public static final String ATTRIBUTE_PROPERTY_CHANGE_LISTENER = "propertyChangeListener";
/*     */   public static final String ATTRIBUTE_PARENT_PROPERTY = "parentProperty";
/*     */   public static final String ATTRIBUTE_VARIABLE_VALUE_CLASS = "variableValueClass";
/*     */   public static final String ATTRIBUTE_VISIBILITY_DISCRIMINATOR = "visibilityDiscriminator";
/*     */   public static final String ATTRIBUTE_ACTION_LIST_HIDDEN_KEYS = "actionListHiddenKeys";
/*     */   public static final String ATTRIBUTE_ACTION_LIST_SHOWN_KEYS = "actionListShownKeys";
/*     */   public static final String ATTRIBUTE_ALLOW_TEXT_OVERRIDE = "allowTextOverride";
/*     */   public static final String ATTRIBUTE_EMPTY_MESSAGE = "emptyMessage";
/*     */   public static final String ATTRIBUTE_SUGGESTED_VALUES = "suggestedValues";
/*     */   
/*     */   public static Install4JPropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription) {
/* 206 */     return create(propertyName, beanClass, displayName, shortDescription, (String)null);
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
/*     */ 
/*     */   
/*     */   public static Install4JPropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription, String context) {
/*     */     try {
/* 223 */       Install4JPropertyDescriptor descriptor = createDescriptor(propertyName, beanClass);
/* 224 */       descriptor.setDisplayName(displayName);
/* 225 */       descriptor.setShortDescription(shortDescription);
/* 226 */       descriptor.setContext(context);
/* 227 */       return descriptor;
/* 228 */     } catch (IntrospectionException e) {
/* 229 */       e.printStackTrace();
/* 230 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Install4JPropertyDescriptor createDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/*     */     try {
/* 236 */       return new Install4JPropertyDescriptor(propertyName, beanClass);
/* 237 */     } catch (Exception exception) {
/*     */       
/*     */       try {
/* 240 */         return new Install4JPropertyDescriptor(propertyName, beanClass, "is" + capitalize(propertyName), null);
/* 241 */       } catch (Exception exception1) {
/*     */         
/* 243 */         return new Install4JPropertyDescriptor(propertyName, beanClass, "get" + capitalize(propertyName), null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   static String capitalize(String name) {
/* 248 */     if (name == null || name.length() == 0) {
/* 249 */       return name;
/*     */     }
/* 251 */     return name.substring(0, 1).toUpperCase() + name.substring(1);
/*     */   }
/*     */   
/*     */   Install4JPropertyDescriptor(String propertyName, Class<?> beanClass) throws IntrospectionException {
/* 255 */     super(propertyName, beanClass);
/*     */   }
/*     */   
/*     */   Install4JPropertyDescriptor(String propertyName, Class<?> beanClass, String readMethod, String writeMethod) throws IntrospectionException {
/* 259 */     super(propertyName, beanClass, readMethod, writeMethod);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setContext(String editorContext) {
/* 269 */     if (editorContext != null) {
/* 270 */       setValue("context", editorContext);
/*     */     }
/* 272 */     return this;
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
/*     */   public Install4JPropertyDescriptor setPropertyCategory(String propertyCategory) {
/* 284 */     if (propertyCategory != null) {
/* 285 */       setValue("propertyCategory", propertyCategory);
/*     */     }
/* 287 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDisplayName(String displayName) {
/* 292 */     super.setDisplayName(displayName);
/* 293 */     if (displayName == null || displayName.trim().length() == 0) {
/* 294 */       setHidden(true);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setSortKey(Integer sortKey) {
/* 306 */     if (sortKey != null) {
/* 307 */       setValue("sortKey", sortKey);
/*     */     }
/* 309 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setVariableValueClass(Class variableClass) {
/* 319 */     if (variableClass != null) {
/* 320 */       setValue("variableValueClass", variableClass);
/*     */     }
/* 322 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setPropertyChangeListener(PropertyChangeListener listener) {
/* 332 */     if (listener != null) {
/* 333 */       setValue("propertyChangeListener", listener);
/*     */     }
/* 335 */     return this;
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
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setParentProperty(String parentProperty) {
/* 351 */     if (parentProperty != null) {
/* 352 */       setValue("parentProperty", parentProperty);
/*     */     }
/* 354 */     return this;
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
/*     */   public Install4JPropertyDescriptor setVisibilityDiscriminator(VisibilityDiscriminator visibilityDiscriminator) {
/* 367 */     if (visibilityDiscriminator != null) {
/* 368 */       setValue("visibilityDiscriminator", visibilityDiscriminator);
/*     */     }
/* 370 */     return this;
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
/*     */   public Install4JPropertyDescriptor setActionListHiddenKeys(String[] hiddenKeys) {
/* 382 */     if (hiddenKeys != null) {
/* 383 */       setValue("actionListHiddenKeys", hiddenKeys);
/*     */     }
/* 385 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setActionListShownKeys(String[] shownKeys) {
/* 396 */     if (shownKeys != null) {
/* 397 */       setValue("actionListShownKeys", shownKeys);
/*     */     }
/* 399 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setHiddenInActionLists() {
/* 409 */     setActionListHiddenKeys(new String[] { null });
/* 410 */     return this;
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
/*     */   public Install4JPropertyDescriptor setAllowTextOverride(boolean allowTextOverride) {
/* 422 */     setValue("allowTextOverride", Boolean.valueOf(allowTextOverride));
/* 423 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setEmptyMessage(String message) {
/* 433 */     setValue("emptyMessage", message);
/* 434 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Install4JPropertyDescriptor setSuggestedValues(String[] values) {
/* 444 */     setValue("suggestedValues", values);
/* 445 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreferred(boolean preferred) {
/* 455 */     super.setPreferred(preferred);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\Install4JPropertyDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */