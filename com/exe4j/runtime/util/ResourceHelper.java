/*     */ package com.exe4j.runtime.util;
/*     */ 
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.List;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class ResourceHelper {
/*     */   private static final String URL_JAR_PREFIX = "jar:file:";
/*     */   private static final String URL_FILE_PREFIX = "file:";
/*     */   public static final String DEVELOPMENT_RUNTIME_DIR = "../dist/install4j/resource";
/*     */   private static final String PROPERTY_INSTALL4J_RUNTIME_DIR = "install4j.runtimeDir";
/*     */   private static final String NATIVE_RESOURCE_PATH = "com/install4j/native/";
/*     */   private static final String NATIVE_FILE_LIST_PATH = "com/install4j/native/files.txt";
/*     */   private static File runtimeDir;
/*     */   private static boolean fromFile;
/*     */   
/*     */   public static URL getImageURL(String fileName) {
/*     */     try {
/*  25 */       return (new File(getRuntimeDir(), fileName)).toURI().toURL();
/*  26 */     } catch (MalformedURLException e) {
/*  27 */       e.printStackTrace();
/*  28 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void setRuntimeDir(File runtimeDir) {
/*  33 */     ResourceHelper.runtimeDir = runtimeDir;
/*     */   }
/*     */   
/*     */   public static boolean isFromFile() {
/*  37 */     getRuntimeDir();
/*  38 */     return fromFile;
/*     */   }
/*     */   
/*     */   public static File getRuntimeDir() {
/*  42 */     if (runtimeDir == null) {
/*  43 */       String className = ResourceHelper.class.getName().replace('.', '/') + ".class";
/*  44 */       String simpleName = className.substring(className.lastIndexOf('/') + 1);
/*  45 */       URL resource = ResourceHelper.class.getResource(simpleName);
/*  46 */       if (resource == null) {
/*  47 */         return null;
/*     */       }
/*  49 */       String classLocation = resource.toString();
/*     */       
/*  51 */       String baseName = classLocation.substring(0, classLocation.lastIndexOf(className) - 1);
/*  52 */       baseName = getDecodedPath(baseName);
/*     */       
/*  54 */       int lastIndex = baseName.lastIndexOf('/');
/*  55 */       if (lastIndex == -1) {
/*  56 */         lastIndex = baseName.lastIndexOf('\\');
/*     */       }
/*  58 */       if (lastIndex == -1 && !classLocation.startsWith("rsrc:")) {
/*  59 */         return null;
/*     */       }
/*  61 */       String externalRuntimeDir = System.getProperty("install4j.runtimeDir");
/*  62 */       if (externalRuntimeDir != null && externalRuntimeDir.length() > 0) {
/*     */         try {
/*  64 */           runtimeDir = (new File(externalRuntimeDir)).getCanonicalFile();
/*  65 */         } catch (IOException e) {
/*  66 */           e.printStackTrace();
/*     */         } 
/*     */       } else {
/*  69 */         String moduleName = System.getProperty("exe4j.moduleName");
/*  70 */         if (baseName.startsWith("file:")) {
/*  71 */           fromFile = true;
/*  72 */           baseName = baseName.substring("file:".length(), lastIndex);
/*  73 */           initDevelopmentRuntimeDir(new File(baseName, "../../"));
/*  74 */         } else if (baseName.startsWith("jar:file:")) {
/*  75 */           baseName = baseName.substring("jar:file:".length(), lastIndex);
/*  76 */           String nativePlatform = getNativePlatform();
/*  77 */           if (nativePlatform != null && moduleName == null && isNativeFileListAvailable()) {
/*  78 */             runtimeDir = extractNativeDir(nativePlatform);
/*     */           } else {
/*  80 */             runtimeDir = new File(baseName);
/*     */           }
/*     */         
/*  83 */         } else if (moduleName != null) {
/*  84 */           File file = new File(moduleName);
/*  85 */           while (file.getParentFile() != null && !(new File(file.getParentFile(), ".install4j")).isDirectory()) {
/*  86 */             file = file.getParentFile();
/*     */           }
/*  88 */           runtimeDir = new File(file.getParentFile(), ".install4j");
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/*  93 */       if (runtimeDir == null) {
/*  94 */         throw new RuntimeException("cannot find runtime dir from " + classLocation + " or " + System.getProperty("exe4j.moduleName"));
/*     */       }
/*     */     } 
/*     */     
/*  98 */     return runtimeDir;
/*     */   }
/*     */   
/*     */   private static boolean isNativeFileListAvailable() {
/* 102 */     return (ResourceHelper.class.getClassLoader().getResource("com/install4j/native/files.txt") != null);
/*     */   }
/*     */   
/*     */   private static File extractNativeDir(String nativePlatform) {
/*     */     try {
/* 107 */       File nativeDir = new File(System.getProperty("java.io.tmpdir"), "install4jNative");
/* 108 */       File nativeBuildDir = new File(nativeDir, getBuildNumber());
/* 109 */       File nativePlatformDir = new File(nativeBuildDir, nativePlatform);
/* 110 */       if (isNativePlatformDirEmpty(nativePlatformDir)) {
/* 111 */         InputStream stream = ResourceHelper.class.getClassLoader().getResourceAsStream("com/install4j/native/files.txt");
/* 112 */         String platformPrefix = nativePlatform + "/";
/* 113 */         List<String> paths = FileUtil.readLines(stream);
/* 114 */         for (String path : paths) {
/* 115 */           if (path.startsWith(platformPrefix)) {
/* 116 */             InputStream input = ResourceHelper.class.getClassLoader().getResourceAsStream("com/install4j/native/" + path);
/* 117 */             File outputFile = new File(nativeBuildDir, path);
/* 118 */             outputFile.getParentFile().mkdirs();
/* 119 */             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile));
/*     */             try {
/* 121 */               FileUtil.pumpStream(input, output);
/*     */             } finally {
/* 123 */               output.close();
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 128 */       return nativePlatformDir;
/* 129 */     } catch (IOException e) {
/* 130 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean isNativePlatformDirEmpty(File nativePlatformDir) {
/* 135 */     if (!nativePlatformDir.exists()) {
/* 136 */       return true;
/*     */     }
/* 138 */     File[] files = nativePlatformDir.listFiles();
/* 139 */     return (files == null || files.length == 0);
/*     */   }
/*     */   
/*     */   private static String getBuildNumber() throws IOException {
/* 143 */     InputStream stream = ResourceHelper.class.getClassLoader().getResourceAsStream("META-INF/install4j.properties");
/* 144 */     Properties properties = new Properties();
/* 145 */     properties.load(stream);
/* 146 */     return properties.getProperty("build");
/*     */   }
/*     */   
/*     */   private static String getNativePlatform() {
/* 150 */     if (LauncherPlatformUtil.isWindows()) {
/* 151 */       if (LauncherPlatformUtil.isAarch64())
/* 152 */         return "windows-arm64"; 
/* 153 */       if (LauncherPlatformUtil.isX86()) {
/* 154 */         return "windows-x32";
/*     */       }
/* 156 */       return "windows-x64";
/*     */     } 
/* 158 */     if (LauncherPlatformUtil.isMacOS()) {
/* 159 */       return "macos";
/*     */     }
/* 161 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void initDevelopmentRuntimeDir(File buildDir) {
/*     */     try {
/* 167 */       buildDir = buildDir.getCanonicalFile();
/* 168 */     } catch (IOException e) {
/* 169 */       e.printStackTrace();
/*     */     } 
/* 171 */     runtimeDir = new File(buildDir, "c");
/* 172 */     if (!(new File(runtimeDir, "i4jinst.dll.64")).exists()) {
/* 173 */       runtimeDir = new File(buildDir, "../dist/install4j/resource");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static String getDecodedPath(String path) {
/* 179 */     StringBuilder stringbuffer = new StringBuilder();
/*     */     
/* 181 */     for (int i = 0; i < path.length(); stringbuffer.append(c)) {
/* 182 */       char c = path.charAt(i);
/* 183 */       if (c != '%') {
/* 184 */         i++;
/*     */       } else {
/*     */         
/*     */         try {
/* 188 */           c = unescape(path, i);
/* 189 */           i += 3;
/* 190 */           if ((c & 0x80) != 0) {
/*     */             char c1; char c2; char c3;
/* 192 */             switch (c >> 4)
/*     */             { case 12:
/*     */               case 13:
/* 195 */                 c1 = unescape(path, i);
/* 196 */                 i += 3;
/* 197 */                 c = (char)((c & 0x1F) << 6 | c1 & 0x3F);
/*     */                 break;
/*     */               
/*     */               case 14:
/* 201 */                 c2 = unescape(path, i);
/* 202 */                 i += 3;
/* 203 */                 c3 = unescape(path, i);
/* 204 */                 i += 3;
/* 205 */                 c = (char)((c & 0xF) << 12 | (c2 & 0x3F) << 6 | c3 & 0x3F);
/*     */                 break;
/*     */               
/*     */               default:
/* 209 */                 throw new IllegalArgumentException(); } 
/*     */           } 
/* 211 */         } catch (NumberFormatException ex) {
/* 212 */           throw new IllegalArgumentException();
/*     */         } 
/*     */       } 
/*     */     } 
/* 216 */     return stringbuffer.toString();
/*     */   }
/*     */   
/*     */   private static char unescape(String s, int i) {
/* 220 */     return (char)Integer.parseInt(s.substring(i + 1, i + 3), 16);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\ResourceHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */