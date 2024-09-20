/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*    */ import com.install4j.runtime.installer.platform.JVMLocator;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.HashSet;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class UnixJVMLocator {
/* 15 */   private static final String[] UNIX_DIR_KEYWORDS = new String[] { "java", "jre", "jdk", "j2sdk", "j2re", "j2jre" };
/*    */   
/* 17 */   public static final String[] JDK_FILES = new String[] { "bin/javac" };
/*    */   
/*    */   public static final String JAVA_EXECUTABLE = "bin/java";
/*    */   public static final String FIND_COMMON_SHARED_JRES_VARIABLE_NAME = "findCommonSharedJres";
/*    */   
/*    */   public static Collection<JVMLocator.JVMLocation> getJVMLocations() {
/* 23 */     Set<JVMLocator.JVMLocation> ret = new HashSet<>();
/*    */     
/* 25 */     List<String> unixRootLocations = new ArrayList<>();
/* 26 */     unixRootLocations.addAll(getSharedLocations(new String[] { "/opt/i4j_jres", "/usr/local/i4j_jres", (new File(
/*    */               
/* 28 */               Util.getUserHome(), ".i4j_jres")).getAbsolutePath() }));
/* 29 */     unixRootLocations.addAll(Arrays.asList(new String[] { "/usr/bin", "/usr", "/usr/java", "/usr/lib/java", "/usr/lib/jvm", "/usr/local", "/usr/lib", "/usr/jdk", "/opt" }));
/*    */ 
/*    */     
/* 32 */     for (String unixRootLocation : unixRootLocations) {
/* 33 */       ret.addAll(searchRootLocation(unixRootLocation));
/*    */     }
/*    */     
/* 36 */     return ret;
/*    */   }
/*    */   
/*    */   public static List<String> getSharedLocations(String... baseLocations) {
/* 40 */     List<String> ret = new ArrayList<>();
/* 41 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/* 42 */     if (installerConfig != null) {
/* 43 */       String sharingKey = installerConfig.getJreSharingKey();
/* 44 */       if (!sharingKey.isEmpty()) {
/* 45 */         for (String baseLocation : baseLocations) {
/* 46 */           ret.add((new File(baseLocation, sharingKey)).getAbsolutePath());
/*    */         }
/*    */       }
/*    */     } 
/* 50 */     if (isFindCommonShared()) {
/* 51 */       ret.addAll(Arrays.asList(baseLocations));
/*    */     }
/* 53 */     return ret;
/*    */   }
/*    */   
/*    */   private static boolean isFindCommonShared() {
/* 57 */     return CompilerVariableHelper.getCompilerExtensionVariable((Context)ContextImpl.getSingleContextInt(), "findCommonSharedJres", false);
/*    */   }
/*    */   
/*    */   private static Collection<JVMLocator.JVMLocation> searchRootLocation(String rootLocation) {
/* 61 */     Set<JVMLocator.JVMLocation> ret = new HashSet<>();
/*    */     
/* 63 */     File[] files = (new File(rootLocation)).listFiles();
/* 64 */     if (files != null) {
/* 65 */       for (File file : files) {
/* 66 */         if (file.isDirectory()) {
/* 67 */           for (String keyword : UNIX_DIR_KEYWORDS) {
/* 68 */             if (file.getName().contains(keyword)) {
/*    */               try {
/* 70 */                 JVMLocator.JVMLocation jvmLocation = JVMLocator.checkJVMLocation(file, "bin/java", JDK_FILES);
/* 71 */                 if (jvmLocation == null) {
/* 72 */                   jvmLocation = JVMLocator.checkJVMLocation(new File(file, "jre"), "bin/java", JDK_FILES);
/*    */                 }
/* 74 */                 if (jvmLocation != null) {
/* 75 */                   ret.add(jvmLocation);
/*    */                 }
/* 77 */               } catch (IOException e) {
/* 78 */                 e.printStackTrace();
/*    */               } 
/*    */               
/*    */               break;
/*    */             } 
/*    */           } 
/*    */         }
/*    */       } 
/*    */     }
/* 87 */     return ret;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\UnixJVMLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */