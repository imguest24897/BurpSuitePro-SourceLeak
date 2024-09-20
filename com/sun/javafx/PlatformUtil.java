/*     */ package com.sun.javafx;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.security.AccessController;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PlatformUtil
/*     */ {
/*  46 */   private static final String os = System.getProperty("os.name");
/*  47 */   private static final String version = System.getProperty("os.version");
/*     */   private static final boolean embedded;
/*     */   private static final String embeddedType;
/*     */   private static final boolean useEGL;
/*     */   private static final boolean doEGLCompositing;
/*     */   private static String javafxPlatform;
/*     */   private static final boolean ANDROID;
/*     */   private static final boolean WINDOWS;
/*     */   
/*     */   static {
/*  57 */     String str1 = AccessController.<String>doPrivileged(() -> System.getProperty("javafx.platform"));
/*  58 */     javafxPlatform = str1;
/*     */     
/*  60 */     loadProperties();
/*     */ 
/*     */     
/*  63 */     boolean bool1 = ((Boolean)AccessController.<Boolean>doPrivileged(() -> Boolean.valueOf(Boolean.getBoolean("com.sun.javafx.isEmbedded")))).booleanValue();
/*  64 */     embedded = bool1;
/*     */ 
/*     */     
/*  67 */     String str2 = AccessController.<String>doPrivileged(() -> System.getProperty("glass.platform", "").toLowerCase(Locale.ROOT));
/*  68 */     embeddedType = str2;
/*     */ 
/*     */     
/*  71 */     boolean bool2 = ((Boolean)AccessController.<Boolean>doPrivileged(() -> Boolean.valueOf(Boolean.getBoolean("use.egl")))).booleanValue();
/*  72 */     useEGL = bool2;
/*     */     
/*  74 */     if (useEGL) {
/*     */       
/*  76 */       boolean bool = ((Boolean)AccessController.<Boolean>doPrivileged(() -> Boolean.valueOf(Boolean.getBoolean("doNativeComposite")))).booleanValue();
/*  77 */       doEGLCompositing = bool;
/*     */     } else {
/*  79 */       doEGLCompositing = false;
/*     */     } 
/*     */     
/*  82 */     ANDROID = ("android".equals(javafxPlatform) || "Dalvik".equals(System.getProperty("java.vm.name")));
/*  83 */     WINDOWS = os.startsWith("Windows");
/*  84 */     WINDOWS_VISTA_OR_LATER = (WINDOWS && versionNumberGreaterThanOrEqualTo(6.0F));
/*  85 */     WINDOWS_7_OR_LATER = (WINDOWS && versionNumberGreaterThanOrEqualTo(6.1F));
/*  86 */     MAC = os.startsWith("Mac");
/*  87 */     LINUX = (os.startsWith("Linux") && !ANDROID);
/*  88 */     SOLARIS = os.startsWith("SunOS");
/*  89 */     IOS = os.startsWith("iOS");
/*  90 */     STATIC_BUILD = "Substrate VM".equals(System.getProperty("java.vm.name"));
/*     */   }
/*     */   
/*     */   private static final boolean WINDOWS_VISTA_OR_LATER;
/*     */   private static final boolean WINDOWS_7_OR_LATER;
/*     */   private static final boolean MAC;
/*     */   private static final boolean LINUX;
/*     */   private static final boolean SOLARIS;
/*     */   private static final boolean IOS;
/*     */   private static final boolean STATIC_BUILD;
/*     */   
/*     */   private static boolean versionNumberGreaterThanOrEqualTo(float paramFloat) {
/*     */     try {
/* 103 */       return (Float.parseFloat(version) >= paramFloat);
/* 104 */     } catch (Exception exception) {
/* 105 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows() {
/* 113 */     return WINDOWS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWinVistaOrLater() {
/* 120 */     return WINDOWS_VISTA_OR_LATER;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWin7OrLater() {
/* 127 */     return WINDOWS_7_OR_LATER;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isMac() {
/* 134 */     return MAC;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isLinux() {
/* 141 */     return LINUX;
/*     */   }
/*     */   
/*     */   public static boolean useEGL() {
/* 145 */     return useEGL;
/*     */   }
/*     */   
/*     */   public static boolean useEGLWindowComposition() {
/* 149 */     return doEGLCompositing;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean useGLES2() {
/* 155 */     String str = AccessController.<String>doPrivileged(() -> System.getProperty("use.gles2"));
/* 156 */     if ("true".equals(str)) {
/* 157 */       return true;
/*     */     }
/* 159 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isSolaris() {
/* 166 */     return SOLARIS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isUnix() {
/* 173 */     return (LINUX || SOLARIS);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEmbedded() {
/* 180 */     return embedded;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getEmbeddedType() {
/* 187 */     return embeddedType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isIOS() {
/* 194 */     return IOS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isStaticBuild() {
/* 201 */     return STATIC_BUILD;
/*     */   }
/*     */   
/*     */   private static void loadPropertiesFromFile(File paramFile) {
/* 205 */     Properties properties = new Properties();
/*     */     try {
/* 207 */       FileInputStream fileInputStream = new FileInputStream(paramFile);
/* 208 */       properties.load(fileInputStream);
/* 209 */       fileInputStream.close();
/* 210 */     } catch (IOException iOException) {
/* 211 */       iOException.printStackTrace();
/*     */     } 
/* 213 */     if (javafxPlatform == null) {
/* 214 */       javafxPlatform = properties.getProperty("javafx.platform");
/*     */     }
/* 216 */     String str = javafxPlatform + ".";
/* 217 */     int i = str.length();
/* 218 */     boolean bool = false;
/* 219 */     for (String str1 : properties.keySet()) {
/* 220 */       String str2 = str1;
/* 221 */       if (str2.startsWith(str)) {
/* 222 */         bool = true;
/* 223 */         String str3 = str2.substring(i);
/* 224 */         if (System.getProperty(str3) == null) {
/* 225 */           String str4 = properties.getProperty(str2);
/* 226 */           System.setProperty(str3, str4);
/*     */         } 
/*     */       } 
/*     */     } 
/* 230 */     if (!bool) {
/* 231 */       System.err.println("Warning: No settings found for javafx.platform='" + javafxPlatform + "'");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static File getRTDir() {
/*     */     try {
/* 242 */       String str1 = "PlatformUtil.class";
/* 243 */       Class<PlatformUtil> clazz = PlatformUtil.class;
/* 244 */       URL uRL = clazz.getResource(str1);
/* 245 */       if (uRL == null) return null; 
/* 246 */       String str2 = uRL.toString();
/* 247 */       if (!str2.startsWith("jar:file:") || str2
/* 248 */         .indexOf('!') == -1) {
/* 249 */         return null;
/*     */       }
/*     */       
/* 252 */       String str3 = str2.substring(4, str2
/* 253 */           .lastIndexOf('!'));
/*     */       
/* 255 */       int i = Math.max(str3
/* 256 */           .lastIndexOf('/'), str3.lastIndexOf('\\'));
/* 257 */       return new File((new URL(str3.substring(0, i + 1))).getPath());
/* 258 */     } catch (MalformedURLException malformedURLException) {
/* 259 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void loadProperties() {
/* 265 */     String str1 = System.getProperty("java.vm.name");
/* 266 */     String str2 = System.getProperty("os.arch");
/*     */     
/* 268 */     if (javafxPlatform == null && (str2 == null || 
/* 269 */       !str2.equals("arm")) && (str1 == null || str1
/* 270 */       .indexOf("Embedded") <= 0)) {
/*     */       return;
/*     */     }
/* 273 */     AccessController.doPrivileged(() -> {
/*     */           File file1 = getRTDir();
/*     */           String str1 = "javafx.platform.properties";
/*     */           File file2 = new File(file1, "javafx.platform.properties");
/*     */           if (file2.exists()) {
/*     */             loadPropertiesFromFile(file2);
/*     */             return null;
/*     */           } 
/*     */           String str2 = System.getProperty("java.home");
/*     */           File file3 = new File(str2, "lib" + File.separator + "javafx.platform.properties");
/*     */           if (file3.exists()) {
/*     */             loadPropertiesFromFile(file3);
/*     */             return null;
/*     */           } 
/*     */           String str3 = System.getProperty("javafx.runtime.path");
/*     */           File file4 = new File(str3, File.separator + "javafx.platform.properties");
/*     */           if (file4.exists()) {
/*     */             loadPropertiesFromFile(file4);
/*     */             return null;
/*     */           } 
/*     */           return null;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isAndroid() {
/* 304 */     return ANDROID;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\PlatformUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */