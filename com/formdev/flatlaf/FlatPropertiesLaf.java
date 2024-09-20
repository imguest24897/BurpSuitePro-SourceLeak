/*     */ package com.formdev.flatlaf;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Properties;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatPropertiesLaf
/*     */   extends FlatLaf
/*     */ {
/*     */   private final String name;
/*     */   private final String baseTheme;
/*     */   private final boolean dark;
/*     */   private final Properties properties;
/*     */   
/*     */   public FlatPropertiesLaf(String name, File propertiesFile) throws IOException {
/*  50 */     this(name, new FileInputStream(propertiesFile));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlatPropertiesLaf(String name, InputStream in) throws IOException {
/*  56 */     this(name, loadProperties(in));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Properties loadProperties(InputStream in) throws IOException {
/*  62 */     Properties properties = new Properties();
/*  63 */     InputStream in2 = in; 
/*  64 */     try { properties.load(in2);
/*  65 */       if (in2 != null) in2.close();  } catch (Throwable throwable) { if (in2 != null)
/*  66 */         try { in2.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  return properties;
/*     */   }
/*     */   
/*     */   public FlatPropertiesLaf(String name, Properties properties) {
/*  70 */     this.name = name;
/*  71 */     this.properties = properties;
/*     */     
/*  73 */     this.baseTheme = properties.getProperty("@baseTheme", "light");
/*  74 */     this.dark = ("dark".equalsIgnoreCase(this.baseTheme) || "darcula".equalsIgnoreCase(this.baseTheme));
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/*  79 */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/*  84 */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDark() {
/*  89 */     return this.dark;
/*     */   }
/*     */   
/*     */   public Properties getProperties() {
/*  93 */     return this.properties;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayList<Class<?>> getLafClassesForDefaultsLoading() {
/*  98 */     ArrayList<Class<?>> lafClasses = new ArrayList<>();
/*  99 */     lafClasses.add(FlatLaf.class);
/* 100 */     switch (this.baseTheme.toLowerCase(Locale.ENGLISH))
/*     */     
/*     */     { default:
/* 103 */         lafClasses.add(FlatLightLaf.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 120 */         return lafClasses;case "dark": lafClasses.add(FlatDarkLaf.class); return lafClasses;case "intellij": lafClasses.add(FlatLightLaf.class); lafClasses.add(FlatIntelliJLaf.class); return lafClasses;case "darcula": break; }  lafClasses.add(FlatDarkLaf.class); lafClasses.add(FlatDarculaLaf.class); return lafClasses;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Properties getAdditionalDefaults() {
/* 125 */     return this.properties;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\FlatPropertiesLaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */