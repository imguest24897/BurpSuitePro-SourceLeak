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
/*     */ 
/*     */ public class FilePropertyDescriptor
/*     */   extends Install4JPropertyDescriptor
/*     */ {
/*     */   public static final String ATTRIBUTE_SELECTION_MODE = "selectionMode";
/*     */   public static final String ATTRIBUTE_SUFFIXES = "suffixes";
/*     */   public static final String ATTRIBUTE_FILTER_NAME = "filterName";
/*     */   public static final String ATTRIBUTE_FILE_CONTENT_TYPE = "fileContentType";
/*     */   public static final String CONTEXT_EXTERNAL_OR_INTERNAL = "externalOrInternal";
/*     */   
/*     */   public static FilePropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription, FileSelectionMode selectionMode) {
/*  54 */     return create(propertyName, beanClass, displayName, shortDescription, selectionMode, (String[])null, (String)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FilePropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription, FileSelectionMode selectionMode, String context) {
/*  62 */     return create(propertyName, beanClass, displayName, shortDescription, selectionMode, (String[])null, (String)null, context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FilePropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription, FileSelectionMode selectionMode, String[] suffixes, String filterName) {
/*  70 */     return create(propertyName, beanClass, displayName, shortDescription, selectionMode, suffixes, filterName, (String)null);
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
/*     */   public static FilePropertyDescriptor create(String propertyName, Class beanClass, String displayName, String shortDescription, FileSelectionMode selectionMode, String[] suffixes, String filterName, String context) {
/*     */     try {
/*  85 */       FilePropertyDescriptor descriptor = createDescriptor(propertyName, beanClass);
/*  86 */       descriptor.setDisplayName(displayName);
/*  87 */       descriptor.setShortDescription(shortDescription);
/*  88 */       descriptor.setSelectionMode(selectionMode);
/*  89 */       descriptor.setSuffixes(suffixes);
/*  90 */       descriptor.setFilterName(filterName);
/*  91 */       descriptor.setContext(context);
/*  92 */       return descriptor;
/*  93 */     } catch (IntrospectionException e) {
/*  94 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setSelectionMode(FileSelectionMode selectionMode) {
/*  99 */     if (selectionMode != null) {
/* 100 */       setValue("selectionMode", selectionMode);
/*     */     }
/*     */   }
/*     */   
/*     */   private void setSuffixes(String[] suffixes) {
/* 105 */     if (suffixes != null) {
/* 106 */       setValue("suffixes", suffixes);
/*     */     }
/*     */   }
/*     */   
/*     */   private void setFilterName(String filterName) {
/* 111 */     if (filterName != null) {
/* 112 */       setValue("filterName", filterName);
/*     */     }
/*     */   }
/*     */   
/*     */   private static FilePropertyDescriptor createDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/*     */     try {
/* 118 */       return new FilePropertyDescriptor(propertyName, beanClass);
/* 119 */     } catch (Exception exception) {
/*     */       
/* 121 */       return new FilePropertyDescriptor(propertyName, beanClass, "get" + capitalize(propertyName), null);
/*     */     } 
/*     */   }
/*     */   FilePropertyDescriptor(String propertyName, Class beanClass) throws IntrospectionException {
/* 125 */     super(propertyName, beanClass);
/*     */   }
/*     */   
/*     */   FilePropertyDescriptor(String propertyName, Class beanClass, String readMethod, String writeMethod) throws IntrospectionException {
/* 129 */     super(propertyName, beanClass, readMethod, writeMethod);
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
/*     */   public FilePropertyDescriptor setFileContentType(FileContentType fileContentType) {
/* 141 */     if (fileContentType != null) {
/* 142 */       setValue("fileContentType", fileContentType);
/*     */     }
/* 144 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\FilePropertyDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */