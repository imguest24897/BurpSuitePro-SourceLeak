/*     */ package com.install4j.runtime.beans.actions.misc;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.MacSpecificConfig;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public abstract class AbstractModifyVmOptionsAction extends SystemInstallAction {
/*  25 */   private String launcherId = "";
/*  26 */   private MacosVmOptionsType macosVmOptionsType = MacosVmOptionsType.INNER;
/*     */ 
/*     */   
/*  29 */   private static final String[] REPLACE_OPTION_PREFIXES = new String[] { "-Xmx", "-Xms", "-Xss", "-Xloggc:", "-Xbootclasspath:", "-Xbootclasspath/a:", "-Xbootclasspath/p:", "-verbose:", "-ea:", "-da:", "-enableassertions:", "-disableassertions:", "-splash:", "-classpath ", "-classpath/a ", "-classpath/p " };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract String[] getAddVmOptions();
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLauncherId() {
/*  39 */     return replaceVariables(this.launcherId);
/*     */   }
/*     */   
/*     */   public void setLauncherId(String launcherId) {
/*  43 */     this.launcherId = launcherId;
/*     */   }
/*     */   
/*     */   public MacosVmOptionsType getMacosVmOptionsType() {
/*  47 */     return (MacosVmOptionsType)replaceWithTextOverride("macosVmOptionsType", this.macosVmOptionsType, MacosVmOptionsType.class);
/*     */   }
/*     */   
/*     */   public void setMacosVmOptionsType(MacosVmOptionsType macosVmOptionsType) {
/*  51 */     this.macosVmOptionsType = macosVmOptionsType;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  56 */     File launcherFile = null;
/*     */     
/*  58 */     ContextImpl.LauncherSetupImpl launcherSetup = (ContextImpl.LauncherSetupImpl)context.getLauncherById(getLauncherId());
/*  59 */     if (launcherSetup != null) {
/*  60 */       MacSpecificConfig macSpecificConfig = InstallerConfig.getCurrentInstance().getMacSpecificConfig();
/*  61 */       if (Util.isMacosInstaller() && macSpecificConfig.isSingleBundle() && Objects.equals(launcherSetup.getInternalId(), macSpecificConfig.getSingleBundleLauncherId())) {
/*  62 */         launcherFile = context.getDestinationFile(macSpecificConfig.getSingleBundleName());
/*     */       } else {
/*  64 */         launcherFile = context.getDestinationFile(launcherSetup.getRelativeFileName());
/*     */       } 
/*     */     } 
/*     */     
/*  68 */     if (launcherFile == null || !launcherFile.exists()) {
/*  69 */       Logger.getInstance().error(this, "launcher file " + launcherFile + " does not exist.");
/*  70 */       return false;
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       if (launcherFile.isDirectory()) {
/*     */         File vmOptionsFile;
/*  76 */         if (getMacosVmOptionsType() == MacosVmOptionsType.OUTER) {
/*  77 */           vmOptionsFile = new File(launcherFile.getParentFile(), launcherFile.getName().replace(".app", "") + ".vmoptions");
/*     */         } else {
/*  79 */           vmOptionsFile = new File(launcherFile, "Contents/vmoptions.txt");
/*     */         } 
/*     */         
/*  82 */         return modifyVmOptions(vmOptionsFile, context);
/*     */       } 
/*  84 */       String vmOptionsPath = launcherFile.getAbsolutePath();
/*  85 */       if (vmOptionsPath.endsWith(".exe")) {
/*  86 */         vmOptionsPath = vmOptionsPath.substring(0, vmOptionsPath.length() - 4);
/*     */       }
/*  88 */       vmOptionsPath = vmOptionsPath + ".vmoptions";
/*  89 */       return modifyVmOptions(new File(vmOptionsPath), context);
/*     */     }
/*  91 */     catch (IOException e) {
/*  92 */       Logger.getInstance().log(e);
/*  93 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean modifyVmOptions(File vmOptionsFile, InstallerContext context) throws IOException, UserCanceledException {
/*  98 */     if (!vmOptionsFile.exists()) {
/*  99 */       FileInstaller.getInstance().registerUninstallFile(vmOptionsFile);
/*     */     } else {
/* 101 */       BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(vmOptionsFile, false);
/* 102 */       backupAction.install(context);
/* 103 */       addRollbackAction((InstallAction)backupAction);
/*     */     } 
/*     */     
/* 106 */     List<String> oldVmOptions = readVmOptions(vmOptionsFile);
/* 107 */     List<String> newVmOptions = addVmOptions(oldVmOptions, new ArrayList<>(Arrays.asList(getAddVmOptions())));
/*     */     
/* 109 */     writeFile(vmOptionsFile, newVmOptions);
/* 110 */     return true;
/*     */   }
/*     */   
/*     */   private static void writeFile(final File vmOptionsFile, final List<String> newVmOptions) {
/* 114 */     HelperCommunication.getInstance().executeAction(ContentInstaller.getExecutionContext(), (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 117 */             PrintWriter pw = Util.isMacOS() ? new PrintWriter(vmOptionsFile, StandardCharsets.UTF_8.name()) : new PrintWriter(vmOptionsFile);
/* 118 */             for (String newVmOption : newVmOptions) {
/* 119 */               pw.println(newVmOption);
/*     */             }
/* 121 */             pw.close();
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static List<String> addVmOptions(List<String> oldVmOptions, List<String> addVmOptions) {
/* 127 */     List<String> newOptions = new ArrayList<>();
/*     */     
/* 129 */     for (String oldVmOption : oldVmOptions) {
/* 130 */       String option = oldVmOption.trim();
/*     */       
/* 132 */       addVmOptions.remove(option);
/*     */       
/* 134 */       if (option.startsWith("-D")) {
/* 135 */         option = findReplaceOption(addVmOptions, getParameterPrefix(option), option);
/*     */       } else {
/* 137 */         for (String replaceOptionPrefix : REPLACE_OPTION_PREFIXES) {
/* 138 */           if (option.startsWith(replaceOptionPrefix)) {
/* 139 */             option = findReplaceOption(addVmOptions, replaceOptionPrefix, option);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 144 */       newOptions.add(option);
/*     */     } 
/*     */     
/* 147 */     newOptions.addAll(addVmOptions);
/*     */     
/* 149 */     return newOptions;
/*     */   }
/*     */   
/*     */   private static String getParameterPrefix(String option) {
/* 153 */     int equalPos = option.indexOf('=');
/* 154 */     if (equalPos > -1) {
/* 155 */       return option.substring(0, equalPos + 1);
/*     */     }
/* 157 */     return option;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String findReplaceOption(List<String> addVmOptions, String prefix, String oldOption) {
/* 162 */     for (Iterator<String> iterator = addVmOptions.iterator(); iterator.hasNext(); ) {
/* 163 */       String option = iterator.next();
/* 164 */       if (option.trim().startsWith(prefix)) {
/* 165 */         iterator.remove();
/* 166 */         return option;
/*     */       } 
/*     */     } 
/* 169 */     return oldOption;
/*     */   }
/*     */   
/*     */   private static List<String> readVmOptions(File vmOptionsFile) throws IOException {
/* 173 */     List<String> vmOptions = new ArrayList<>();
/* 174 */     if (vmOptionsFile.exists()) {
/* 175 */       BufferedReader reader = new BufferedReader(new FileReader(vmOptionsFile));
/* 176 */       String line = reader.readLine();
/* 177 */       while (line != null) {
/* 178 */         vmOptions.add(line);
/* 179 */         line = reader.readLine();
/*     */       } 
/* 181 */       reader.close();
/*     */     } 
/* 183 */     return vmOptions;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\AbstractModifyVmOptionsAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */