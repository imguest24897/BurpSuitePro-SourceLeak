/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.JVMLocator;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class MacosJVMLocator
/*    */ {
/*    */   private static final String OLD_APPLE_ROOT_LOCATION = "/System/Library/Frameworks/JavaVM.framework/Versions";
/*    */   public static final String OLD_APPLE_HOME_DIR = "Home";
/* 14 */   private static final String[] OLD_APPLE_JDK_FILES = new String[] { "Commands/javac", "Home/src.jar" };
/*    */   
/*    */   private static final String OLD_APPLE_JAVA_EXECUTABLE = "Commands/java";
/*    */   private static final String NEW_APPLE_ROOT_LOCATIONS = "/System/Library/Java/JavaVirtualMachines";
/*    */   private static final String NEW_HOME_DIR = "Contents/Home";
/* 19 */   private static final String[] NEW_JDK_FILES = new String[] { "Contents/Home/bin/javac" };
/*    */   
/*    */   private static final String NEW_JAVA_EXECUTABLE = "Contents/Home/bin/java";
/*    */   private static final String ORACLE_ROOT_LOCATIONS = "/Library/Java/JavaVirtualMachines";
/*    */   private static final String JRE_PLUGIN = "/Library/Internet Plug-Ins/JavaAppletPlugin.plugin";
/*    */   
/*    */   public static Collection<JVMLocator.JVMLocation> getJVMLocations() {
/* 26 */     Set<JVMLocator.JVMLocation> ret = new HashSet<>();
/*    */     
/* 28 */     addJVMs(ret, "/System/Library/Java/JavaVirtualMachines", "Contents/Home/bin/java", NEW_JDK_FILES, "Contents/Home");
/* 29 */     if (ret.size() == 0) {
/* 30 */       addJVMs(ret, "/System/Library/Frameworks/JavaVM.framework/Versions", "Commands/java", OLD_APPLE_JDK_FILES, "Home");
/*    */     }
/* 32 */     addJVMs(ret, "/Library/Java/JavaVirtualMachines", "Contents/Home/bin/java", NEW_JDK_FILES, "Contents/Home");
/*    */     
/* 34 */     checkBundle(ret, new File("/Library/Internet Plug-Ins/JavaAppletPlugin.plugin"), "Contents/Home/bin/java", NEW_JDK_FILES, "Contents/Home");
/* 35 */     return ret;
/*    */   }
/*    */   
/*    */   private static void addJVMs(Set<JVMLocator.JVMLocation> ret, String rootLocation, String javaExecutable, String[] jdkFiles, String homeDir) {
/* 39 */     File[] files = (new File(rootLocation)).listFiles();
/* 40 */     if (files != null) {
/* 41 */       for (File file : files) {
/* 42 */         checkBundle(ret, file, javaExecutable, jdkFiles, homeDir);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private static void checkBundle(Set<JVMLocator.JVMLocation> ret, File bundleDir, String javaExecutable, String[] jdkFiles, String homeDir) {
/* 48 */     if (bundleDir.isDirectory()) {
/*    */       try {
/* 50 */         JVMLocator.JVMLocation jvmLocation = JVMLocator.checkJVMLocation(bundleDir, javaExecutable, jdkFiles);
/* 51 */         if (jvmLocation != null && jvmLocation.getJavaHome() != null) {
/* 52 */           jvmLocation.setJavaHome(new File(jvmLocation.getJavaHome(), homeDir));
/* 53 */           ret.add(jvmLocation);
/*    */         } 
/* 55 */       } catch (IOException e) {
/* 56 */         e.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public static JVMLocator.JVMLocation getJVMLocation(File javaHome) throws IOException {
/* 62 */     javaHome = stripContentsHome(javaHome);
/* 63 */     JVMLocator.JVMLocation jvmLocation = JVMLocator.checkJVMLocation(javaHome, "Contents/Home/bin/java", NEW_JDK_FILES);
/* 64 */     if (jvmLocation != null) {
/* 65 */       jvmLocation.setJavaHome(new File(jvmLocation.getJavaHome(), "Contents/Home"));
/*    */     } else {
/* 67 */       jvmLocation = JVMLocator.checkJVMLocation(javaHome, "Commands/java", OLD_APPLE_JDK_FILES);
/* 68 */       if (jvmLocation != null) {
/* 69 */         jvmLocation.setJavaHome(new File(jvmLocation.getJavaHome(), "Home"));
/*    */       }
/*    */     } 
/* 72 */     return jvmLocation;
/*    */   }
/*    */   
/*    */   private static File stripContentsHome(File javaHome) {
/* 76 */     if (javaHome == null) {
/* 77 */       return null;
/*    */     }
/* 79 */     String path = javaHome.getPath();
/* 80 */     if (path.endsWith("/Contents/Home/jre"))
/* 81 */       return javaHome.getParentFile().getParentFile().getParentFile(); 
/* 82 */     if (path.endsWith("/Contents/Home")) {
/* 83 */       return javaHome.getParentFile().getParentFile();
/*    */     }
/* 85 */     return javaHome;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacosJVMLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */