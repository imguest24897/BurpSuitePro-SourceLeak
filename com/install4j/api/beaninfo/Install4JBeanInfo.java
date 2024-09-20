/*     */ package com.install4j.api.beaninfo;
/*     */ 
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.LocalizedExternalFile;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import java.beans.BeanDescriptor;
/*     */ import java.beans.PersistenceDelegate;
/*     */ import java.beans.PropertyDescriptor;
/*     */ import java.beans.SimpleBeanInfo;
/*     */ import java.lang.reflect.Array;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
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
/*     */ public abstract class Install4JBeanInfo
/*     */   extends SimpleBeanInfo
/*     */ {
/*     */   public static final String ATTRIBUTE_MINIMUM_JAVA_VERSION = "minimumJavaVersion";
/*     */   public static final String ATTRIBUTE_MULTIPLE_INSTANCES_SUPPORTED = "multipleInstancesSupported";
/*     */   public static final String ATTRIBUTE_INSTALLED_FILES_REQUIRED = "installedFilesRequired";
/*     */   public static final String ATTRIBUTE_BEAN_CATEGORY = "beanCategory";
/*     */   public static final String ATTRIBUTE_COLLAPSED_PROPERTY_CATEGORIES = "collapsedPropertyCategories";
/*     */   public static final String ATTRIBUTE_ENUMERATION_MAPPERS = "enumerationMapper";
/*     */   public static final String ATTRIBUTE_PROPERTY_CONVERTERS = "propertyConverters";
/*     */   public static final String ATTRIBUTE_PERSISTENCE_DELEGATE_MAP = "persistenceDelegateMap";
/*     */   public static final String ATTRIBUTE_CUSTOMIZER_PLACEMENT = "customizerPlacement";
/*     */   public static final String ATTRIBUTE_CUSTOMIZER_ICON = "customizerIcon";
/*     */   public static final String ATTRIBUTE_BEAN_VALIDATOR = "beanValidator";
/*     */   public static final String ATTRIBUTE_BEAN_INITIALIZER = "beanInitializer";
/*     */   public static final String ATTRIBUTE_SORT_KEY = "sortKey";
/*     */   public static final String ATTRIBUTE_SEQUENCE_VALIDATOR = "sequenceValidator";
/*     */   public static final String ATTRIBUTE_DEFAULT_ROLLBACK_BARRIER = "defaultRollbackBarrier";
/*     */   public static final String ATTRIBUTE_DEFAULT_ROLLBACK_BARRIER_EXIT_CODE = "defaultRollbackBarrierExitCode";
/*     */   public static final String ATTRIBUTE_DEFAULT_CONDITION_EXPRESSION = "defaultConditionExpression";
/*     */   public static final String ATTRIBUTE_ICON_16x16 = "icon16x16";
/*     */   public static final String ATTRIBUTE_ICON_24x24 = "icon24x24";
/*     */   public static final String ATTRIBUTE_NOTICE_PANEL = "noticePanel";
/*     */   public static final String ATTRIBUTE_CATEGORY_SORT_ORDER = "categorySortOrder";
/* 134 */   private List<Install4JPropertyDescriptor> propertyDescriptors = new ArrayList<>();
/*     */   
/*     */   private BeanDescriptor beanDescriptor;
/*     */   
/* 138 */   private int nextPropertySortKeyValue = 0;
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
/*     */   protected Install4JBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, boolean installedFilesRequired, Integer sortKey, Class<? extends Bean> beanClass, Class<?> customizerClass) {
/* 191 */     initBeanDescriptor(beanClass, customizerClass);
/* 192 */     setDisplayName(displayName);
/* 193 */     setShortDescription(shortDescription);
/* 194 */     setBeanCategory(category);
/* 195 */     setMultipleInstancesSupported(multipleInstancesSupported);
/* 196 */     setInstalledFilesRequired(installedFilesRequired);
/* 197 */     setSortKey(sortKey);
/*     */     
/* 199 */     if (this instanceof BeanValidator) {
/* 200 */       setBeanValidator((BeanValidator)this);
/*     */     }
/*     */     
/* 203 */     if (this instanceof BeanInitializer) {
/* 204 */       setBeanInitializer((BeanInitializer)this);
/*     */     }
/*     */     
/* 207 */     if (this instanceof SequenceValidator) {
/* 208 */       setSequenceValidator((SequenceValidator)this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Install4JBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, boolean installedFilesRequired, Integer sortKey, Class<? extends Bean> beanClass) {
/* 216 */     this(displayName, shortDescription, category, multipleInstancesSupported, installedFilesRequired, sortKey, beanClass, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addPropertyDescriptor(Install4JPropertyDescriptor propertyDescriptor) {
/* 224 */     if (propertyDescriptor.getValue("sortKey") == null) {
/* 225 */       this.nextPropertySortKeyValue += 100;
/* 226 */       propertyDescriptor.setSortKey(Integer.valueOf(this.nextPropertySortKeyValue));
/*     */     } 
/* 228 */     this.propertyDescriptors.add(propertyDescriptor);
/*     */   }
/*     */ 
/*     */   
/*     */   public PropertyDescriptor[] getPropertyDescriptors() {
/* 233 */     return this.propertyDescriptors.<PropertyDescriptor>toArray(new PropertyDescriptor[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public BeanDescriptor getBeanDescriptor() {
/* 238 */     return this.beanDescriptor;
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
/*     */   public void setIcons(Icon icon16x16, Icon icon24x24) {
/* 250 */     BeanDescriptor beanDescriptor = getBeanDescriptor();
/*     */     
/* 252 */     if (icon16x16 != null) {
/* 253 */       beanDescriptor.setValue("icon16x16", icon16x16);
/*     */     }
/* 255 */     if (icon24x24 != null) {
/* 256 */       beanDescriptor.setValue("icon24x24", icon24x24);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimumJavaVersion(String minimumJavaVersion) {
/* 267 */     if (minimumJavaVersion != null) {
/* 268 */       getBeanDescriptor().setValue("minimumJavaVersion", minimumJavaVersion);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCollapsedPropertyCategories(String[] collapsedCategories) {
/* 279 */     if (collapsedCategories != null) {
/* 280 */       getBeanDescriptor().setValue("collapsedPropertyCategories", collapsedCategories);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnumerationMappers(EnumerationMapper[] enumerationMappers) {
/* 291 */     if (enumerationMappers != null) {
/* 292 */       getBeanDescriptor().setValue("enumerationMapper", enumerationMappers);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPropertyConverters(PropertyConverter[] propertyConverters) {
/* 303 */     if (propertyConverters != null) {
/* 304 */       getBeanDescriptor().setValue("propertyConverters", propertyConverters);
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
/*     */   
/*     */   public void setPersistenceDelegateMap(Map<? extends Class<?>, ? extends PersistenceDelegate> persistenceDelegates) {
/* 317 */     if (persistenceDelegates != null) {
/* 318 */       getBeanDescriptor().setValue("persistenceDelegateMap", persistenceDelegates);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomizerPlacement(CustomizerPlacement customizerPlacement) {
/* 329 */     if (customizerPlacement != null) {
/* 330 */       getBeanDescriptor().setValue("customizerPlacement", customizerPlacement);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomizerIcon(Icon customizerIcon) {
/* 340 */     if (customizerIcon != null) {
/* 341 */       getBeanDescriptor().setValue("customizerIcon", customizerIcon);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBeanValidator(BeanValidator beanValidator) {
/* 351 */     if (beanValidator != null) {
/* 352 */       getBeanDescriptor().setValue("beanValidator", beanValidator);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBeanInitializer(BeanInitializer beanInitializer) {
/* 363 */     if (beanInitializer != null) {
/* 364 */       getBeanDescriptor().setValue("beanInitializer", beanInitializer);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSequenceValidator(SequenceValidator sequenceValidator) {
/* 375 */     if (sequenceValidator != null) {
/* 376 */       getBeanDescriptor().setValue("sequenceValidator", sequenceValidator);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultRollbackBarrier(boolean defaultRollbackBarrier) {
/* 386 */     getBeanDescriptor().setValue("defaultRollbackBarrier", Boolean.valueOf(defaultRollbackBarrier));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultRollbackBarrierExitCode(int defaultRollbackBarrierExitCode) {
/* 396 */     getBeanDescriptor().setValue("defaultRollbackBarrierExitCode", Integer.valueOf(defaultRollbackBarrierExitCode));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultConditionExpression(String defaultConditionExpression) {
/* 405 */     getBeanDescriptor().setValue("defaultConditionExpression", defaultConditionExpression);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNoticePanel(JComponent noticePanel) {
/* 414 */     getBeanDescriptor().setValue("noticePanel", noticePanel);
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
/*     */   public void setCategorySortOrder(String... categories) {
/* 426 */     if (categories != null) {
/* 427 */       getBeanDescriptor().setValue("categorySortOrder", categories);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class<?> getBeanClass() {
/* 436 */     return this.beanDescriptor.getBeanClass();
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
/*     */   public void checkNotEmpty(String propertyName, Bean bean) throws BeanValidationException {
/* 449 */     if (isEmpty(propertyName, bean)) {
/* 450 */       PropertyDescriptor propertyDescriptor = findPropertyDescriptor(propertyName);
/* 451 */       String displayName = propertyDescriptor.getDisplayName();
/* 452 */       if (displayName == null || displayName.trim().length() == 0) {
/* 453 */         throw new BeanValidationException("Please enter all required information.");
/*     */       }
/* 455 */       throw new BeanValidationException("The property \"" + displayName + "\" must not be empty.", propertyName);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void checkNotEmpty(String propertyName, String errorMessage, Bean bean) throws BeanValidationException {
/* 471 */     if (isEmpty(propertyName, bean)) {
/* 472 */       throw new BeanValidationException(errorMessage);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEmpty(String propertyName, Bean bean) {
/* 483 */     PropertyDescriptor propertyDescriptor = findPropertyDescriptor(propertyName);
/* 484 */     if (propertyDescriptor == null) {
/* 485 */       return false;
/*     */     }
/*     */     
/* 488 */     Object value = getPropertyValue(propertyDescriptor, bean);
/* 489 */     if (value == null) {
/* 490 */       return true;
/*     */     }
/* 492 */     if (value.getClass().isArray())
/* 493 */       return (Array.getLength(value) == 0); 
/* 494 */     if (value instanceof LocalizedExternalFile)
/* 495 */       return ((LocalizedExternalFile)value).getLanguageIdToExternalFile().isEmpty(); 
/* 496 */     if (value instanceof List)
/* 497 */       return ((List)value).isEmpty(); 
/* 498 */     if (value instanceof Map)
/* 499 */       return ((Map)value).isEmpty(); 
/* 500 */     if (value instanceof ScriptProperty) {
/* 501 */       return ((ScriptProperty)value).getValue().isEmpty();
/*     */     }
/* 503 */     return (value.toString().trim().length() == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getPropertyValue(PropertyDescriptor propertyDescriptor, Bean bean) {
/* 513 */     if (propertyDescriptor == null || bean == null) {
/* 514 */       return null;
/*     */     }
/* 516 */     Method readMethod = propertyDescriptor.getReadMethod();
/*     */     try {
/* 518 */       return readMethod.invoke(bean, new Object[0]);
/* 519 */     } catch (Exception e) {
/* 520 */       e.printStackTrace();
/* 521 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getPropertyValue(String propertyName, Bean bean) {
/* 532 */     PropertyDescriptor propertyDescriptor = findPropertyDescriptor(propertyName);
/* 533 */     if (propertyDescriptor == null) {
/* 534 */       return null;
/*     */     }
/* 536 */     return getPropertyValue(propertyDescriptor, bean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PropertyDescriptor findPropertyDescriptor(String propertyName) {
/* 546 */     PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors();
/* 547 */     if (propertyDescriptors == null) {
/* 548 */       return null;
/*     */     }
/* 550 */     for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
/* 551 */       if (Objects.equals(propertyDescriptor.getName(), propertyName)) {
/* 552 */         return propertyDescriptor;
/*     */       }
/*     */     } 
/* 555 */     return null;
/*     */   }
/*     */   
/*     */   private void initBeanDescriptor(Class<? extends Bean> beanClass, Class<?> customizerClass) {
/* 559 */     this.beanDescriptor = new BeanDescriptor(beanClass, customizerClass);
/*     */   }
/*     */   
/*     */   private void setDisplayName(String displayName) {
/* 563 */     this.beanDescriptor.setDisplayName(displayName);
/*     */   }
/*     */   
/*     */   private void setShortDescription(String shortDescription) {
/* 567 */     this.beanDescriptor.setShortDescription(shortDescription);
/*     */   }
/*     */   
/*     */   private void setBeanCategory(String category) {
/* 571 */     if (category != null) {
/* 572 */       getBeanDescriptor().setValue("beanCategory", category);
/*     */     }
/*     */   }
/*     */   
/*     */   private void setMultipleInstancesSupported(boolean multipleInstancesSupported) {
/* 577 */     getBeanDescriptor().setValue("multipleInstancesSupported", Boolean.valueOf(multipleInstancesSupported));
/*     */   }
/*     */   
/*     */   private void setInstalledFilesRequired(boolean installedFilesRequired) {
/* 581 */     getBeanDescriptor().setValue("installedFilesRequired", Boolean.valueOf(installedFilesRequired));
/*     */   }
/*     */   
/*     */   private void setSortKey(Integer sortKey) {
/* 585 */     if (sortKey != null)
/* 586 */       getBeanDescriptor().setValue("sortKey", sortKey); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\Install4JBeanInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */