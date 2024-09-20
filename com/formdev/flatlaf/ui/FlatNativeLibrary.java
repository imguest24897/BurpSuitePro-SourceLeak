/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatSystemProperties;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.NativeLibrary;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import java.io.File;
/*     */ import java.net.URL;
/*     */ import java.security.CodeSource;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class FlatNativeLibrary
/*     */ {
/*     */   private static boolean initialized;
/*     */   private static NativeLibrary nativeLibrary;
/*     */   
/*     */   static synchronized boolean isLoaded() {
/*  44 */     initialize();
/*  45 */     return (nativeLibrary != null) ? nativeLibrary.isLoaded() : false;
/*     */   }
/*     */   private static void initialize() {
/*     */     String classifier, ext;
/*  49 */     if (initialized)
/*     */       return; 
/*  51 */     initialized = true;
/*     */     
/*  53 */     if (!FlatSystemProperties.getBoolean("flatlaf.useNativeLibrary", true)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  58 */     if (SystemInfo.isWindows_10_orLater && (SystemInfo.isX86 || SystemInfo.isX86_64 || SystemInfo.isAARCH64)) {
/*     */ 
/*     */       
/*  61 */       if (SystemInfo.isAARCH64) {
/*  62 */         classifier = "windows-arm64";
/*  63 */       } else if (SystemInfo.isX86_64) {
/*  64 */         classifier = "windows-x86_64";
/*     */       } else {
/*  66 */         classifier = "windows-x86";
/*     */       } 
/*  68 */       ext = "dll";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  84 */     else if (SystemInfo.isLinux && SystemInfo.isX86_64) {
/*     */ 
/*     */       
/*  87 */       classifier = "linux-x86_64";
/*  88 */       ext = "so";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  95 */       loadJAWT();
/*     */     } else {
/*     */       return;
/*     */     } 
/*     */     
/* 100 */     nativeLibrary = createNativeLibrary(classifier, ext);
/*     */   }
/*     */   
/*     */   private static NativeLibrary createNativeLibrary(String classifier, String ext) {
/* 104 */     String libraryName = "flatlaf-" + classifier;
/*     */ 
/*     */     
/* 107 */     String libraryPath = System.getProperty("flatlaf.nativeLibraryPath");
/* 108 */     if (libraryPath != null) {
/* 109 */       if ("system".equals(libraryPath)) {
/* 110 */         NativeLibrary library = new NativeLibrary(libraryName, true);
/* 111 */         if (library.isLoaded()) {
/* 112 */           return library;
/*     */         }
/* 114 */         LoggingFacade.INSTANCE.logSevere("Did not find library " + libraryName + " in java.library.path, using extracted library instead", null);
/*     */       } else {
/* 116 */         File file = new File(libraryPath, System.mapLibraryName(libraryName));
/* 117 */         if (file.exists()) {
/* 118 */           return new NativeLibrary(file, true);
/*     */         }
/* 120 */         LoggingFacade.INSTANCE.logSevere("Did not find external library " + file + ", using extracted library instead", null);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 126 */     File libraryFile = findLibraryBesideJar(classifier, ext);
/* 127 */     if (libraryFile != null) {
/* 128 */       return new NativeLibrary(libraryFile, true);
/*     */     }
/*     */     
/* 131 */     return new NativeLibrary("com/formdev/flatlaf/natives/" + libraryName, null, true);
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
/*     */ 
/*     */   
/*     */   private static File findLibraryBesideJar(String classifier, String ext) {
/*     */     try {
/* 150 */       CodeSource codeSource = FlatNativeLibrary.class.getProtectionDomain().getCodeSource();
/* 151 */       URL jarUrl = (codeSource != null) ? codeSource.getLocation() : null;
/* 152 */       if (jarUrl == null) {
/* 153 */         return null;
/*     */       }
/*     */       
/* 156 */       if (!"file".equals(jarUrl.getProtocol())) {
/* 157 */         return null;
/*     */       }
/* 159 */       File jarFile = new File(jarUrl.toURI());
/*     */ 
/*     */       
/* 162 */       if (!jarFile.isFile()) {
/* 163 */         return null;
/*     */       }
/*     */       
/* 166 */       String jarName = jarFile.getName();
/* 167 */       String jarBasename = jarName.substring(0, jarName.lastIndexOf('.'));
/* 168 */       File parent = jarFile.getParentFile();
/*     */       
/* 170 */       String libraryName = jarBasename + (jarBasename.contains("flatlaf") ? "" : "-flatlaf") + '-' + classifier + '.' + ext;
/*     */ 
/*     */ 
/*     */       
/* 174 */       File libraryFile = new File(parent, libraryName);
/* 175 */       if (libraryFile.isFile()) {
/* 176 */         return libraryFile;
/*     */       }
/*     */ 
/*     */       
/* 180 */       if (parent.getName().equalsIgnoreCase("lib")) {
/* 181 */         libraryFile = new File(parent.getParentFile(), "bin/" + libraryName);
/* 182 */         if (libraryFile.isFile())
/* 183 */           return libraryFile; 
/*     */       } 
/* 185 */     } catch (Exception ex) {
/* 186 */       LoggingFacade.INSTANCE.logSevere(ex.getMessage(), ex);
/*     */     } 
/*     */     
/* 189 */     return null;
/*     */   }
/*     */   
/*     */   private static void loadJAWT() {
/*     */     try {
/* 194 */       System.loadLibrary("jawt");
/* 195 */     } catch (UnsatisfiedLinkError ex) {
/*     */       
/* 197 */       String message = ex.getMessage();
/* 198 */       if (message == null || !message.contains("already loaded in another classloader"))
/* 199 */         LoggingFacade.INSTANCE.logSevere(message, ex); 
/* 200 */     } catch (Exception ex) {
/* 201 */       LoggingFacade.INSTANCE.logSevere(ex.getMessage(), ex);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatNativeLibrary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */