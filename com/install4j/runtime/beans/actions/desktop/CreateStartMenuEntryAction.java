/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ 
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.UndefinedVariableException;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.platform.unix.DesktopFile;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class CreateStartMenuEntryAction
/*     */   extends SystemInstallAction
/*     */ {
/*     */   private boolean allUsers = true;
/*  22 */   private String entryName = "";
/*  23 */   private String arguments = "";
/*  24 */   private String categories = "Application";
/*     */   
/*     */   private File file;
/*     */   private ExternalFile icon;
/*     */   private ExternalFile unixIconFile;
/*  29 */   private String programGroupName = "${installer:sys.programGroupName}";
/*     */   
/*  31 */   private String additionalDesktopFileEntries = "";
/*     */   
/*     */   private File startIn;
/*     */   private boolean runAsAdministrator = false;
/*     */   
/*     */   public File getStartIn() {
/*  37 */     return (File)replaceWithTextOverride("startIn", replaceVariables(this.startIn), File.class);
/*     */   }
/*     */   
/*     */   public void setStartIn(File startIn) {
/*  41 */     this.startIn = startIn;
/*     */   }
/*     */   
/*     */   public boolean isRunAsAdministrator() {
/*  45 */     return replaceWithTextOverride("runAsAdministrator", this.runAsAdministrator);
/*     */   }
/*     */   
/*     */   public void setRunAsAdministrator(boolean runAsAdministrator) {
/*  49 */     this.runAsAdministrator = runAsAdministrator;
/*     */   }
/*     */   
/*     */   public String getAdditionalDesktopFileEntries() {
/*  53 */     return replaceVariables(replaceVariables(this.additionalDesktopFileEntries));
/*     */   }
/*     */   
/*     */   public void setAdditionalDesktopFileEntries(String additionalDesktopFileEntries) {
/*  57 */     this.additionalDesktopFileEntries = additionalDesktopFileEntries;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*     */     try {
/*  63 */       File destinationFile = context.getDestinationFile(getFile());
/*  64 */       if (InstallerUtil.isWindows()) {
/*  65 */         String entryName = getEntryName();
/*  66 */         File menuFile = new File(entryName);
/*     */         
/*  68 */         boolean allUsers = isAllUsers();
/*  69 */         if (!menuFile.isAbsolute()) {
/*  70 */           if (allUsers && !InstallerUtil.checkWritable(FolderInfo.getSpecialFolder(3, true))) {
/*  71 */             allUsers = false;
/*     */           }
/*  73 */           File folder = FolderInfo.getSpecialFolder(3, allUsers);
/*  74 */           if (getProgramGroupName().trim().length() > 0) {
/*  75 */             folder = new File(folder, getProgramGroupName().trim());
/*     */           }
/*  77 */           menuFile = new File(folder, entryName);
/*     */         } 
/*  79 */         File startIn = context.getDestinationFile(getStartIn());
/*  80 */         if (startIn != null && !startIn.isDirectory()) {
/*  81 */           startIn = null;
/*     */         }
/*  83 */         MenuHelper.installWindowsMenu(allUsers ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED, menuFile, destinationFile, context
/*     */ 
/*     */             
/*  86 */             .getExternalFile(getIcon(), true), 
/*  87 */             getArguments(), isRunAsAdministrator(), null, startIn);
/*  88 */       } else if (!InstallerUtil.isMacOS()) {
/*  89 */         DesktopFile desktopFile = new DesktopFile();
/*  90 */         desktopFile.addContent(MenuHelper.getAdditionalEntries(MenuHelper.getLauncherWithUnixPath((Context)context, destinationFile)));
/*  91 */         desktopFile.addContent(getAdditionalDesktopFileEntries());
/*     */         
/*  93 */         MenuHelper.installUnixMenu(context.getInstallationDirectory(), destinationFile, getEntryName(), getCategories(), getArguments(), context
/*  94 */             .getExternalFile(getUnixIconFile(), true), null, desktopFile.getAsAdditional(), false);
/*     */       } 
/*  96 */     } catch (IOException e) {
/*  97 */       e.printStackTrace();
/*  98 */       return false;
/*     */     } 
/* 100 */     return true;
/*     */   }
/*     */   
/*     */   public String getProgramGroupName() {
/*     */     try {
/* 105 */       return replaceVariables(replaceVariables(this.programGroupName));
/* 106 */     } catch (UndefinedVariableException e) {
/* 107 */       return replaceVariables("");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setProgramGroupName(String programGroupName) {
/* 112 */     this.programGroupName = programGroupName;
/*     */   }
/*     */   
/*     */   public String getArguments() {
/* 116 */     return replaceVariables(replaceVariables(this.arguments));
/*     */   }
/*     */   
/*     */   public void setArguments(String arguments) {
/* 120 */     this.arguments = arguments;
/*     */   }
/*     */   
/*     */   public String getCategories() {
/* 124 */     return replaceVariables(replaceVariables(this.categories));
/*     */   }
/*     */   
/*     */   public void setCategories(String categories) {
/* 128 */     this.categories = categories;
/*     */   }
/*     */   
/*     */   public String getEntryName() {
/* 132 */     return replaceVariables(replaceVariables(this.entryName, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setEntryName(String entryName) {
/* 136 */     this.entryName = entryName;
/*     */   }
/*     */   
/*     */   public File getFile() {
/* 140 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*     */   }
/*     */   
/*     */   public void setFile(File file) {
/* 144 */     this.file = file;
/*     */   }
/*     */   
/*     */   public ExternalFile getIcon() {
/* 148 */     return (ExternalFile)replaceWithTextOverride("icon", this.icon, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setIcon(ExternalFile icon) {
/* 152 */     this.icon = icon;
/*     */   }
/*     */   
/*     */   public ExternalFile getUnixIconFile() {
/* 156 */     return (ExternalFile)replaceWithTextOverride("unixIconFile", this.unixIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setUnixIconFile(ExternalFile unixIconFile) {
/* 160 */     this.unixIconFile = unixIconFile;
/*     */   }
/*     */   
/*     */   public boolean isAllUsers() {
/* 164 */     return replaceWithTextOverride("allUsers", this.allUsers);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/* 168 */     this.allUsers = allUsers;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\CreateStartMenuEntryAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */