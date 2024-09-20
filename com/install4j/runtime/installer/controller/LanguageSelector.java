/*     */ package com.install4j.runtime.installer.controller;
/*     */ 
/*     */ import com.ejt.internal.io.StreamConsumerThread;
/*     */ import com.exe4j.runtime.WinLauncher;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.beans.applications.InstallerApplication;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.launcher.Launcher;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ 
/*     */ class LanguageSelector
/*     */ {
/*     */   static void initSystemAndDefaultLanguage() {
/*  25 */     String systemLanguageId = System.getProperty("install4j.systemLanguage");
/*  26 */     if (systemLanguageId == null || !systemLanguageId.matches("\\w\\w")) {
/*  27 */       systemLanguageId = System.getProperty("user.language");
/*  28 */       System.setProperty("install4j.systemLanguage", systemLanguageId);
/*     */     } 
/*  30 */     String defaultLanguageId = System.getProperty("install4j.defaultLanguage");
/*  31 */     if (defaultLanguageId != null && systemLanguageId.matches("\\w\\w|\\w\\w_\\w\\w")) {
/*  32 */       System.setProperty("user.language", defaultLanguageId);
/*  33 */       Locale.setDefault(new Locale(defaultLanguageId.substring(0, 2), 
/*  34 */             (defaultLanguageId.length() == 5) ? defaultLanguageId.substring(3, 5) : Locale.getDefault().getCountry()));
/*  35 */       System.setProperty("install4j.defaultLanguage", "");
/*     */     } 
/*     */   }
/*     */   
/*     */   static void initLanguage(ContextImpl context, ScreenExecutor screenExecutor) {
/*  40 */     String languageId = context.getLanguageId();
/*  41 */     Application application = InstallerConfig.getCurrentApplication();
/*  42 */     if (application instanceof InstallerApplication && System.getProperty("install4j.language") == null) {
/*  43 */       ScriptProperty languageSelectionScript = ((InstallerApplication)application).getLanguageSelectionScript();
/*  44 */       if (languageSelectionScript != null && !Objects.equals(languageSelectionScript.getValue(), "")) {
/*     */         try {
/*  46 */           languageId = (String)context.runScript(languageSelectionScript, (Bean)application, new Object[] { languageId });
/*  47 */           if (InstallerConfig.getCurrentInstance().getLanguageById(languageId) == null) {
/*  48 */             languageId = null;
/*     */           } else {
/*  50 */             context.setLanguageId(languageId);
/*     */           } 
/*  52 */         } catch (Exception e) {
/*  53 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  59 */     if (languageId != null) {
/*  60 */       Messages.setLanguageConfig(InstallerConfig.getCurrentInstance().getLanguageById(languageId));
/*     */     } else {
/*  62 */       languageId = queryLanguage(screenExecutor);
/*     */       
/*  64 */       if (languageId == null) {
/*  65 */         InstallerUtil.exit(1);
/*     */       } else {
/*  67 */         context.setLanguageId(languageId);
/*  68 */         String installerFileName = System.getProperty("exe4j.moduleName");
/*  69 */         if (installerFileName == null || !(new File(installerFileName)).exists() || InstallerUtil.isMacOS() || Objects.equals(languageId, System.getProperty("user.language")) || context
/*  70 */           .isConsole() || context.isUnattended() || Boolean.getBoolean("install4j.noSecondaryProcess")) {
/*     */           
/*  72 */           Messages.setLanguageConfig(InstallerConfig.getCurrentInstance().getLanguageById(languageId));
/*     */         } else {
/*  74 */           String[] command; Logger.getImpl().switchToSecondaryProcess();
/*     */           
/*  76 */           if (InstallerUtil.isWindows()) {
/*  77 */             InstallerUtil.storeJreInfoForInstaller();
/*  78 */             command = WinLauncher.appendOriginalArgs(new String[] { installerFileName, "__i4j_lang_restart", "-Duser.language=" + languageId, "-Dinstall4j.language=" + languageId, "-Dinstall4j.systemLanguage=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*  83 */                   System.getProperty("install4j.systemLanguage"), "-Dexe4j.unextractedPositionRestart=" + 
/*     */                   
/*  85 */                   Integer.getInteger("exe4j.unextractedPosition", 0) });
/*     */           } else {
/*     */             
/*  88 */             command = Launcher.appendOriginalArgs(new String[] { "/bin/sh", installerFileName, "__i4j_lang_restart", "-Duser.language=" + languageId, "-Dinstall4j.language=" + languageId, "-Dinstall4j.systemLanguage=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*  94 */                   System.getProperty("install4j.systemLanguage") });
/*     */           } 
/*     */ 
/*     */           
/*     */           try {
/*  99 */             Process process = (new ProcessBuilder(command)).directory(new File(System.getProperty("user.dir"))).start();
/* 100 */             StreamConsumerThread.consumeOutput(process);
/*     */             try {
/* 102 */               System.exit(process.waitFor());
/* 103 */             } catch (InterruptedException e) {
/* 104 */               e.printStackTrace();
/* 105 */               System.exit(1);
/*     */             } 
/* 107 */           } catch (IOException e) {
/* 108 */             e.printStackTrace();
/* 109 */             Messages.setLanguageConfig(InstallerConfig.getCurrentInstance().getLanguageById(languageId));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String queryLanguage(ScreenExecutor screenExecutor) {
/* 118 */     ReturnToken wakeupToken = new ReturnToken();
/* 119 */     SwingUtilities.invokeLater(() -> screenExecutor.selectLanguage(wakeupToken));
/* 120 */     synchronized (wakeupToken) {
/* 121 */       while (!wakeupToken.isWokenUp()) {
/*     */         try {
/* 123 */           wakeupToken.wait();
/* 124 */         } catch (InterruptedException e) {
/* 125 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 130 */     return (String)wakeupToken.getReturnValue();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\LanguageSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */