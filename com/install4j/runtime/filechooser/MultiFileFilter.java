/*     */ package com.install4j.runtime.filechooser;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.Arrays;
/*     */ import java.util.Locale;
/*     */ import javax.swing.filechooser.FileFilter;
/*     */ import org.jetbrains.annotations.Nls;
/*     */ 
/*     */ public class MultiFileFilter
/*     */   extends FileFilter
/*     */ {
/*     */   private String[] suffixes;
/*     */   private String name;
/*     */   private String description;
/*     */   private boolean exact;
/*     */   
/*     */   public MultiFileFilter(String suffix, @Nls String name) {
/*  18 */     this(suffix, name, false);
/*     */   }
/*     */   
/*     */   public MultiFileFilter(String suffix, @Nls String name, boolean exact) {
/*  22 */     this(new String[] { suffix }, name, exact);
/*     */   }
/*     */   
/*     */   public MultiFileFilter(String[] suffixes, @Nls String name) {
/*  26 */     this(suffixes, name, false);
/*     */   }
/*     */   
/*     */   public MultiFileFilter(String[] suffixes, @Nls String name, boolean exact) {
/*  30 */     this.suffixes = suffixes;
/*  31 */     this.name = name;
/*  32 */     this.exact = exact;
/*  33 */     StringBuilder buffer = new StringBuilder();
/*  34 */     for (String suffix : suffixes) {
/*  35 */       if (buffer.length() > 0) {
/*  36 */         buffer.append(", ");
/*     */       }
/*  38 */       if (!exact) {
/*  39 */         int dotIndex = suffix.indexOf('.');
/*  40 */         if (dotIndex == -1) {
/*  41 */           buffer.append("*.");
/*  42 */         } else if (dotIndex == 0) {
/*  43 */           buffer.append("*");
/*     */         } 
/*     */       } 
/*  46 */       buffer.append(suffix);
/*     */     } 
/*     */     
/*  49 */     if (name != null) {
/*  50 */       this.description = name + " (" + buffer + ")";
/*     */     } else {
/*  52 */       this.description = buffer.toString();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nls
/*     */   public String getName() {
/*  58 */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/*  63 */     return this.description;
/*     */   }
/*     */   
/*     */   public String[] getSuffixes() {
/*  67 */     return this.suffixes;
/*     */   }
/*     */   
/*     */   public boolean isExact() {
/*  71 */     return this.exact;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean accept(File file) {
/*     */     String testFileName;
/*  77 */     if (file.isDirectory()) {
/*  78 */       return true;
/*     */     }
/*     */     
/*  81 */     String fileName = file.getName();
/*  82 */     int lastDotIndex = fileName.lastIndexOf(".");
/*     */     
/*  84 */     if (lastDotIndex > -1) {
/*  85 */       testFileName = fileName.toLowerCase(Locale.ENGLISH);
/*     */     } else {
/*  87 */       testFileName = "";
/*     */     } 
/*     */     
/*  90 */     for (String testSuffix : this.suffixes) {
/*  91 */       if (testSuffix.equals("*")) {
/*  92 */         return true;
/*     */       }
/*  94 */       if (this.exact || testSuffix.indexOf('.') > 0) {
/*  95 */         if (fileName.equalsIgnoreCase(testSuffix)) {
/*  96 */           return true;
/*     */         }
/*     */       }
/*  99 */       else if (testFileName.endsWith(testSuffix.toLowerCase(Locale.ENGLISH))) {
/* 100 */         return true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object other) {
/* 110 */     return (other instanceof MultiFileFilter && Arrays.equals((Object[])((MultiFileFilter)other).suffixes, (Object[])this.suffixes));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\MultiFileFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */