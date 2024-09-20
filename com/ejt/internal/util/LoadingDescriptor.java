/*     */ package com.ejt.internal.util;
/*     */ 
/*     */ import java.io.File;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ public class LoadingDescriptor
/*     */ {
/*     */   public static final String URL_FILE_PREFIX = "file:";
/*     */   public static final String URL_JAR_PREFIX = "jar:file:";
/*     */   private File baseDir;
/*     */   private File classpathDir;
/*     */   private boolean loadedFromJAR;
/*     */   
/*     */   @NotNull
/*     */   public static LoadingDescriptor getInstance(Class clazz) {
/*     */     String classPathName;
/*     */     boolean loadedFromJAR;
/*  19 */     String className = clazz.getName().replace('.', '/') + ".class";
/*  20 */     String simpleName = className.substring(className.lastIndexOf('/') + 1);
/*  21 */     String classLocation = clazz.getResource(simpleName).toString();
/*     */     
/*  23 */     String baseName = classLocation.substring(0, classLocation.lastIndexOf(className) - 1);
/*  24 */     baseName = decodePath(baseName);
/*     */ 
/*     */     
/*  27 */     if (baseName.startsWith("jar:file:")) {
/*  28 */       loadedFromJAR = true;
/*  29 */       classPathName = baseName.substring("jar:file:".length(), baseName.length() - 1);
/*  30 */       int lastIndex = baseName.lastIndexOf('/');
/*  31 */       if (lastIndex == -1) {
/*  32 */         lastIndex = baseName.lastIndexOf('\\');
/*     */       }
/*  34 */       if (lastIndex == -1) {
/*  35 */         throw new RuntimeException("Base URL " + baseName + " is invalid");
/*     */       }
/*  37 */       baseName = baseName.substring("jar:file:".length(), lastIndex);
/*  38 */     } else if (baseName.startsWith("file:")) {
/*  39 */       loadedFromJAR = false;
/*  40 */       baseName = baseName.substring("file:".length());
/*  41 */       classPathName = baseName;
/*     */     } else {
/*     */       
/*  44 */       throw new RuntimeException("Base URL " + baseName + " is invalid");
/*     */     } 
/*     */     
/*  47 */     return new LoadingDescriptor(new File(baseName), new File(classPathName), loadedFromJAR);
/*     */   }
/*     */ 
/*     */   
/*     */   public static File getJarParentDir(Class clazz) {
/*  52 */     String className = clazz.getName().replace('.', '/') + ".class";
/*  53 */     String simpleName = className.substring(className.lastIndexOf('/') + 1);
/*  54 */     String classLocation = clazz.getResource(simpleName).toString();
/*     */     
/*  56 */     String baseName = classLocation.substring(0, classLocation.lastIndexOf(className) - 1);
/*  57 */     if (baseName.startsWith("jar:file:")) {
/*  58 */       int lastIndex = baseName.lastIndexOf('/');
/*  59 */       if (lastIndex == -1) {
/*  60 */         lastIndex = baseName.lastIndexOf('\\');
/*     */       }
/*  62 */       if (lastIndex == -1) {
/*  63 */         throw new RuntimeException("Base URL " + baseName + " is invalid");
/*     */       }
/*  65 */       baseName = baseName.substring("jar:file:".length(), lastIndex);
/*  66 */       return new File(baseName);
/*     */     } 
/*     */     
/*  69 */     throw new RuntimeException("Base URL " + baseName + " is invalid");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String decodePath(String path) {
/*  76 */     StringBuilder buffer = new StringBuilder();
/*     */     
/*  78 */     for (int i = 0; i < path.length(); buffer.append(c)) {
/*  79 */       char c = path.charAt(i);
/*  80 */       if (c != '%') {
/*  81 */         i++;
/*     */       } else {
/*     */         
/*     */         try {
/*  85 */           c = unescape(path, i);
/*  86 */           i += 3;
/*  87 */           if ((c & 0x80) != 0) {
/*     */             char c1; char c2; char c3;
/*  89 */             switch (c >> 4)
/*     */             { case 12:
/*     */               case 13:
/*  92 */                 c1 = unescape(path, i);
/*  93 */                 i += 3;
/*  94 */                 c = (char)((c & 0x1F) << 6 | c1 & 0x3F);
/*     */                 break;
/*     */               
/*     */               case 14:
/*  98 */                 c2 = unescape(path, i);
/*  99 */                 i += 3;
/* 100 */                 c3 = unescape(path, i);
/* 101 */                 i += 3;
/* 102 */                 c = (char)((c & 0xF) << 12 | (c2 & 0x3F) << 6 | c3 & 0x3F);
/*     */                 break;
/*     */               
/*     */               default:
/* 106 */                 throw new IllegalArgumentException(); } 
/*     */           } 
/* 108 */         } catch (NumberFormatException ex) {
/* 109 */           throw new IllegalArgumentException();
/*     */         } 
/*     */       } 
/*     */     } 
/* 113 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   private static char unescape(String s, int i) {
/* 117 */     return (char)Integer.parseInt(s.substring(i + 1, i + 3), 16);
/*     */   }
/*     */   
/*     */   private LoadingDescriptor(File baseDir, File classpathDir, boolean loadedFromJAR) {
/* 121 */     this.baseDir = baseDir;
/* 122 */     this.classpathDir = classpathDir;
/* 123 */     this.loadedFromJAR = loadedFromJAR;
/*     */   }
/*     */   
/*     */   public File getBaseDir() {
/* 127 */     return this.baseDir;
/*     */   }
/*     */   
/*     */   public File getClasspathDir() {
/* 131 */     return this.classpathDir;
/*     */   }
/*     */   
/*     */   public boolean isLoadedFromJAR() {
/* 135 */     return this.loadedFromJAR;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 141 */     return "base dir: " + this.baseDir + ", class path dir: " + this.classpathDir + ", loadedFromJar: " + this.loadedFromJAR;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\LoadingDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */