/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ 
/*     */ import com.install4j.api.actions.AutoUninstallAction;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.installer.helper.AppleScriptHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class AddStartupItemAction
/*     */   extends SystemInstallAction implements AutoUninstallAction {
/*  26 */   private Properties persistentProperties = new Properties();
/*     */   
/*     */   private File executable;
/*     */   
/*     */   private String name;
/*     */   
/*     */   private boolean allUsers;
/*     */   
/*     */   private boolean hide = false;
/*     */   private static final String PROPNAME_EXECUTABLE = "executable";
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*     */     try {
/*  39 */       File destinationFile = context.getDestinationFile(getExecutable());
/*  40 */       if (InstallerUtil.isWindows()) {
/*  41 */         if (!destinationFile.exists()) {
/*  42 */           destinationFile = context.getDestinationFile(getExecutable() + ".exe");
/*     */         }
/*  44 */         Logger.getInstance().info(this, "using " + destinationFile + ", " + destinationFile.exists());
/*  45 */         boolean allUsers = isAllUsers();
/*  46 */         if (allUsers && !InstallerUtil.checkWritable(FolderInfo.getSpecialFolder(4, true))) {
/*  47 */           allUsers = false;
/*     */         }
/*  49 */         MenuHelper.installWindowsMenu(allUsers ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED, new File(FolderInfo.getSpecialFolder(4, allUsers), getName()), destinationFile, null);
/*     */       }
/*  51 */       else if (InstallerUtil.isMacOS()) {
/*  52 */         Logger.getInstance().info(this, "using " + destinationFile + ", " + destinationFile.exists());
/*  53 */         doRollback(destinationFile.getAbsolutePath());
/*  54 */         if (addOnMac(destinationFile, isHide())) {
/*  55 */           getPersistentProperties().setProperty("executable", destinationFile.getAbsolutePath());
/*     */         } else {
/*  57 */           return false;
/*     */         } 
/*     */       } 
/*  60 */       return true;
/*  61 */     } catch (IOException e) {
/*  62 */       Logger.getImpl().log(e);
/*  63 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean addOnMac(final File destinationFile, final boolean hide) {
/*  68 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/*  71 */             String name = destinationFile.getName();
/*  72 */             if (name.endsWith(".app")) {
/*  73 */               name = name.substring(0, name.length() - 4);
/*     */             }
/*  75 */             return AppleScriptHelper.executeScript("tell app \"System Events\" to make login item at end with properties {path:\"" + destinationFile.getAbsolutePath() + "\", hidden:" + hide + ", name:\"" + name + "\"}");
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Properties getPersistentProperties() {
/*  83 */     return (Properties)replaceWithTextOverride("persistentProperties", this.persistentProperties, Properties.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPersistentProperties(Properties properties) {
/*  88 */     this.persistentProperties = properties;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/*  94 */     if (InstallerUtil.isMacOS()) {
/*  95 */       doRollback(context.getDestinationFile(getExecutable()).getAbsolutePath());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/* 101 */     if (InstallerUtil.isMacOS()) {
/* 102 */       doRollback(getPersistentProperties().getProperty("executable"));
/*     */     }
/* 104 */     return true;
/*     */   }
/*     */   
/*     */   private static void doRollback(final String executable) {
/* 108 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 111 */             if (executable != null) {
/* 112 */               File destinationFile = new File(executable);
/* 113 */               String name = destinationFile.getName();
/* 114 */               if (name.endsWith(".app")) {
/* 115 */                 name = name.substring(0, name.length() - 4);
/*     */               }
/* 117 */               AppleScriptHelper.executeScript("tell app \"System Events\" to delete login item \"" + name + "\"");
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public boolean isHide() {
/* 124 */     return replaceWithTextOverride("hide", this.hide);
/*     */   }
/*     */   
/*     */   public void setHide(boolean hide) {
/* 128 */     this.hide = hide;
/*     */   }
/*     */   
/*     */   public String getName() {
/* 132 */     return replaceVariables(replaceVariables(this.name, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/* 136 */     this.name = name;
/*     */   }
/*     */   
/*     */   public File getExecutable() {
/* 140 */     return (File)replaceWithTextOverride("executable", replaceVariables(this.executable), File.class);
/*     */   }
/*     */   
/*     */   public void setExecutable(File executable) {
/* 144 */     this.executable = executable;
/*     */   }
/*     */   
/*     */   public boolean isAllUsers() {
/* 148 */     return replaceWithTextOverride("allUsers", this.allUsers);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/* 152 */     this.allUsers = allUsers;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\AddStartupItemAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */