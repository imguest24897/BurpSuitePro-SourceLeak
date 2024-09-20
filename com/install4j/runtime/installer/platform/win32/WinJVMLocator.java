/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.RegistryView;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.installer.platform.JVMLocator;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class WinJVMLocator {
/*  15 */   private static final String[] REGKEY_JAVASOFT_JDK = new String[] { "SOFTWARE\\JavaSoft\\Java Development Kit", "SOFTWARE\\JavaSoft\\JDK" };
/*  16 */   private static final String[] REGKEY_JAVASOFT_JRE = new String[] { "SOFTWARE\\JavaSoft\\Java Runtime Environment", "SOFTWARE\\JavaSoft\\JRE" };
/*     */   
/*     */   private static final String REGVAL_JAVAHOME = "JavaHome";
/*  19 */   public static final String[] JDK_FILES = new String[] { "bin/javac.exe" };
/*     */   public static final String JAVA_EXECUTABLE = "bin/java.exe";
/*     */   
/*     */   public static Collection<JVMLocator.JVMLocation> getJVMLocations(boolean allMachines) {
/*  23 */     Set<JVMLocator.JVMLocation> ret = new HashSet<>();
/*  24 */     if (allMachines) {
/*  25 */       addJvms(ret, RegistryView.BIT32, PE32Handler.Machine.UNKNOWN);
/*  26 */       addJvms(ret, RegistryView.BIT64, PE32Handler.Machine.UNKNOWN);
/*     */       
/*  28 */       ret.addAll(getSharedJRES(PE32Handler.Machine.UNKNOWN));
/*     */     } else {
/*  30 */       PE32Handler.Machine currentMachine = PE32Handler.getJREMachine();
/*  31 */       addJvms(ret, RegistryView.DEFAULT, currentMachine);
/*  32 */       ret.addAll(getSharedJRES(currentMachine));
/*     */     } 
/*     */ 
/*     */     
/*  36 */     return ret;
/*     */   }
/*     */   
/*     */   private static void addJvms(Set<JVMLocator.JVMLocation> ret, RegistryView registryView, PE32Handler.Machine requiredMachine) {
/*  40 */     for (String jdkKey : REGKEY_JAVASOFT_JDK) {
/*  41 */       ret.addAll(getFromKey(jdkKey, registryView, true, requiredMachine));
/*     */     }
/*  43 */     for (String jreKey : REGKEY_JAVASOFT_JRE) {
/*  44 */       ret.addAll(getFromKey(jreKey, registryView, false, requiredMachine));
/*     */     }
/*     */   }
/*     */   
/*     */   private static Collection<JVMLocator.JVMLocation> getSharedJRES(PE32Handler.Machine requiredMachine) {
/*  49 */     List<JVMLocator.JVMLocation> ret = new ArrayList<>();
/*     */     
/*  51 */     File baseDir = new File(FolderInfo.getCommonFilesDirectory(), "i4j_jres");
/*  52 */     for (String sharedLocation : UnixJVMLocator.getSharedLocations(new String[] { baseDir.getAbsolutePath() })) {
/*  53 */       addSharedJres(ret, new File(sharedLocation), requiredMachine);
/*     */     }
/*     */     
/*  56 */     return ret;
/*     */   }
/*     */   
/*     */   private static void addSharedJres(List<JVMLocator.JVMLocation> ret, File parent, PE32Handler.Machine requiredMachine) {
/*  60 */     File[] files = parent.listFiles();
/*  61 */     if (files != null) {
/*  62 */       for (File file : files) {
/*  63 */         if (file.isDirectory() && !file.getName().startsWith("jre") && checkExecutable(file, requiredMachine)) {
/*  64 */           JVMLocator.JVMLocation jvmLocation = new JVMLocator.JVMLocation();
/*  65 */           jvmLocation.setJavaHome(file);
/*  66 */           jvmLocation.setVersion(file.getName());
/*  67 */           ret.add(jvmLocation);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static Collection<JVMLocator.JVMLocation> getFromKey(String keyName, RegistryView registryView, boolean jdk, PE32Handler.Machine requiredMachine) {
/*  74 */     Map<JVMLocator.JVMLocation, JVMLocator.JVMLocation> ret = new HashMap<>();
/*     */     
/*  76 */     String[] subKeys = WinRegistry.getSubKeyNames(RegistryRoot.HKEY_LOCAL_MACHINE, keyName, registryView);
/*  77 */     if (subKeys != null) {
/*  78 */       for (String subKey : subKeys) {
/*  79 */         Object javaHomeObject = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, keyName + "\\" + subKey, "JavaHome", registryView);
/*     */         
/*  81 */         String javaHome = (String)javaHomeObject;
/*  82 */         if (javaHomeObject instanceof String && checkExecutable(new File(javaHome), requiredMachine)) {
/*  83 */           JVMLocator.JVMLocation jvmLocation = new JVMLocator.JVMLocation();
/*  84 */           jvmLocation.setVersion(subKey);
/*  85 */           jvmLocation.setJavaHome(new File(javaHome));
/*  86 */           jvmLocation.setJDK(jdk);
/*  87 */           JVMLocator.JVMLocation oldJvmLocation = ret.get(jvmLocation);
/*  88 */           if (oldJvmLocation == null || oldJvmLocation.getVersion().length() < jvmLocation.getVersion().length()) {
/*  89 */             ret.put(jvmLocation, jvmLocation);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*  96 */     return ret.values();
/*     */   }
/*     */   
/*     */   private static boolean checkExecutable(File javaHome, PE32Handler.Machine requiredMachine) {
/* 100 */     File javaExecutable = new File(javaHome, "bin\\java.exe");
/* 101 */     if (javaExecutable.isFile()) {
/* 102 */       if (requiredMachine == PE32Handler.Machine.UNKNOWN) {
/* 103 */         return true;
/*     */       }
/*     */       try {
/* 106 */         return (requiredMachine == PE32Handler.getMachine(javaExecutable));
/* 107 */       } catch (IOException e) {
/* 108 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 112 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\WinJVMLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */