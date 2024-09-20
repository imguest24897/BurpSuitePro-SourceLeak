/*     */ package com.ejt.internal.i18n;
/*     */ import com.ejt.internal.util.CommonStringUtil;
/*     */ import com.ejt.internal.util.XMLEnum;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.Arrays;
/*     */ import java.util.Deque;
/*     */ import java.util.Locale;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public enum SupportedLocale implements XMLEnum<SupportedLocale> {
/*     */   private static final SupportedLocale DEFAULT;
/*     */   private static SupportedLocale current;
/*  13 */   AUTO_DETECT(""),
/*  14 */   ENGLISH("en"),
/*  15 */   SIMPLIFIED_CHINESE("zh_CN"),
/*  16 */   REVERSE_ENGLISH("zz");
/*     */   
/*     */   static {
/*  19 */     DEFAULT = ENGLISH;
/*  20 */     current = AUTO_DETECT;
/*     */   }
/*     */   private static SupportedLocale resolved;
/*     */   private final String code;
/*     */   
/*     */   SupportedLocale(String code) {
/*  26 */     this.code = code;
/*     */   }
/*     */   
/*     */   public static SupportedLocale getByCode(@NotNull String code) {
/*  30 */     for (SupportedLocale supportedLocale : values()) {
/*  31 */       if (supportedLocale.code.equals(code)) {
/*  32 */         return supportedLocale;
/*     */       }
/*     */     } 
/*  35 */     return AUTO_DETECT;
/*     */   }
/*     */   
/*     */   public static String getResolvedNonDefaultSuffix() {
/*  39 */     return (resolved == null || resolved == DEFAULT) ? "" : ("_" + resolved.code);
/*     */   }
/*     */   
/*     */   public String getCode() {
/*  43 */     return this.code;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getXMLValue() {
/*  48 */     return this.code;
/*     */   }
/*     */ 
/*     */   
/*     */   public SupportedLocale[] getXMLEnums() {
/*  53 */     return values();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static SupportedLocale getCurrent() {
/*  58 */     return current;
/*     */   }
/*     */   
/*     */   public void setCurrent(boolean applyLocale) {
/*  62 */     current = this;
/*  63 */     if (this.code.isEmpty()) {
/*  64 */       resolved = getAutoDetected();
/*     */     } else {
/*  66 */       resolved = this;
/*     */     } 
/*  68 */     if (applyLocale) {
/*  69 */       Locale.setDefault(createLocale());
/*  70 */       AbstractMessages.invalidateAll();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void initActual() {
/*  75 */     createLocale();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static SupportedLocale getResolved() {
/*  80 */     return (resolved != null) ? resolved : current;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private Locale createLocale() {
/*  85 */     if (this.code.isEmpty()) {
/*  86 */       return resolved.createLocale();
/*     */     }
/*  88 */     String[] parts = this.code.split("_");
/*  89 */     int length = parts.length;
/*  90 */     if (length == 1)
/*  91 */       return new Locale(parts[0]); 
/*  92 */     if (length == 2)
/*  93 */       return new Locale(parts[0], parts[1]); 
/*  94 */     if (length == 3) {
/*  95 */       return new Locale(parts[0], parts[1], parts[1]);
/*     */     }
/*  97 */     throw new IllegalStateException(this.code + " has more than 3 components");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private SupportedLocale getAutoDetected() {
/* 104 */     Deque<String> parts = new ArrayDeque<String>(Arrays.asList(Locale.getDefault().toString().split("_")));
/* 105 */     while (!parts.isEmpty()) {
/* 106 */       String truncatedCode = CommonStringUtil.join("_", parts);
/* 107 */       for (SupportedLocale supportedLocale : values()) {
/* 108 */         if (supportedLocale.getCode().equals(truncatedCode)) {
/* 109 */           return supportedLocale;
/*     */         }
/*     */       } 
/* 112 */       parts.removeLast();
/*     */     } 
/* 114 */     return DEFAULT;
/*     */   }
/*     */   
/*     */   public boolean isCapitalizeWordsSupported() {
/* 118 */     return (this == ENGLISH);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\i18n\SupportedLocale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */