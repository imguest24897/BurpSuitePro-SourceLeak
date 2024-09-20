/*     */ package com.install4j.runtime.installer.helper.apiimpl;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.JVMSelector;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import com.install4j.runtime.installer.platform.JVMLocator;
/*     */ import com.install4j.runtime.util.VersionCheck;
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JVMSelectorImpl
/*     */ {
/*     */   public static JVMSelector.JVMLocation[] getJVMLocations() {
/*  32 */     return (JVMSelector.JVMLocation[])JVMLocator.getJVMLocations(null);
/*     */   }
/*     */   
/*     */   public static JVMSelector.JVMLocation[] getJVMLocations(String minVersion, String maxVersion, boolean jdkOnly, File[] additionalLocations) {
/*  36 */     JVMLocator.JVMLocation[] arrayOfJVMLocation = JVMLocator.getJVMLocations(additionalLocations);
/*     */     
/*  38 */     List<JVMSelector.JVMLocation> ret = new ArrayList<>();
/*  39 */     for (JVMLocator.JVMLocation jVMLocation : arrayOfJVMLocation) {
/*  40 */       if (checkJVMLocation((JVMSelector.JVMLocation)jVMLocation, minVersion, maxVersion, jdkOnly)) {
/*  41 */         ret.add(jVMLocation);
/*     */       }
/*     */     } 
/*  44 */     return ret.<JVMSelector.JVMLocation>toArray(new JVMSelector.JVMLocation[0]);
/*     */   }
/*     */   
/*     */   public static JVMSelector.JVMLocation getJVMLocation(File javaHome, String minVersion, String maxVersion, boolean jdkOnly) {
/*  48 */     JVMLocator.JVMLocation jVMLocation = JVMLocator.getJVMLocation(javaHome);
/*  49 */     if (checkJVMLocation((JVMSelector.JVMLocation)jVMLocation, minVersion, maxVersion, jdkOnly)) {
/*  50 */       return (JVMSelector.JVMLocation)jVMLocation;
/*     */     }
/*  52 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setPreferredJVM(final String javaHome) {
/*  57 */     if (ContextImpl.getSingleContextInt() == null) {
/*  58 */       writePreferredJreFile(javaHome);
/*     */     } else {
/*  60 */       HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/*  63 */               if (InstallerConfig.getCurrentApplication() instanceof com.install4j.runtime.beans.applications.InstallerApplication) {
/*  64 */                 ContentInstaller.getInstance().setPreferredJre(javaHome);
/*     */               } else {
/*  66 */                 JVMSelectorImpl.writePreferredJreFile(javaHome);
/*     */               } 
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void writePreferredJreFile(String javaHome) {
/*  74 */     if (!Util.isMacOS()) {
/*     */       
/*     */       try {
/*  77 */         PrintWriter pw = new PrintWriter(new FileWriter(new File(ResourceHelper.getRuntimeDir(), "pref_jre.cfg")));
/*  78 */         pw.println(javaHome);
/*  79 */         pw.close();
/*  80 */       } catch (IOException e) {
/*  81 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean checkJVMLocation(JVMSelector.JVMLocation location, String minVersion, String maxVersion, boolean jdkOnly) {
/*  87 */     if (location != null && (
/*  88 */       !jdkOnly || location.isJDK())) {
/*  89 */       String version = location.getVersion();
/*  90 */       if (minVersion == null || VersionCheck.checkCompatible(minVersion, version)) {
/*  91 */         if (maxVersion != null) {
/*  92 */           if (maxVersion.length() < version.length()) {
/*  93 */             version = version.substring(0, maxVersion.length());
/*     */           }
/*     */           
/*  96 */           if (VersionCheck.checkCompatible(version, maxVersion)) {
/*  97 */             return true;
/*     */           }
/*     */         } else {
/* 100 */           return true;
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 105 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\JVMSelectorImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */