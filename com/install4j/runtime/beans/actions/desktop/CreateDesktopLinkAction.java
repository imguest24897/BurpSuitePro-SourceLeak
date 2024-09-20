/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*     */ import com.install4j.runtime.installer.InstallerContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.unix.DesktopFile;
/*     */ import com.install4j.runtime.installer.platform.unix.UnixSpecialDirs;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class CreateDesktopLinkAction
/*     */   extends SystemInstallAction {
/*     */   private File file;
/*  32 */   private String name = "";
/*     */   private boolean allUsers = true;
/*     */   private ExternalFile winIconFile;
/*     */   private ExternalFile unixIconFile;
/*  36 */   private String arguments = "";
/*  37 */   private String description = "";
/*     */   
/*     */   private File startIn;
/*     */   
/*     */   private boolean runAsAdministrator = false;
/*     */   private boolean macSingleBundleTarget = true;
/*  43 */   private String additionalDesktopFileEntries = "";
/*     */   
/*     */   public File getStartIn() {
/*  46 */     return (File)replaceWithTextOverride("startIn", replaceVariables(this.startIn), File.class);
/*     */   }
/*     */   
/*     */   public void setStartIn(File startIn) {
/*  50 */     this.startIn = startIn;
/*     */   }
/*     */   
/*     */   public boolean isRunAsAdministrator() {
/*  54 */     return replaceWithTextOverride("runAsAdministrator", this.runAsAdministrator);
/*     */   }
/*     */   
/*     */   public void setRunAsAdministrator(boolean runAsAdministrator) {
/*  58 */     this.runAsAdministrator = runAsAdministrator;
/*     */   }
/*     */   
/*     */   public File getFile() {
/*  62 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*     */   }
/*     */   
/*     */   public void setFile(File file) {
/*  66 */     this.file = file;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  70 */     return replaceVariables(replaceVariables(this.name, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/*  74 */     this.name = name;
/*     */   }
/*     */ 
/*     */   
/*     */   public ExternalFile getWinIconFile() {
/*  79 */     return (ExternalFile)replaceWithTextOverride("winIconFile", this.winIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setWinIconFile(ExternalFile winIconFile) {
/*  83 */     this.winIconFile = winIconFile;
/*     */   }
/*     */   
/*     */   public ExternalFile getUnixIconFile() {
/*  87 */     return (ExternalFile)replaceWithTextOverride("unixIconFile", this.unixIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setUnixIconFile(ExternalFile unixIconFile) {
/*  91 */     this.unixIconFile = unixIconFile;
/*     */   }
/*     */   
/*     */   public String getArguments() {
/*  95 */     return replaceVariables(replaceVariables(this.arguments));
/*     */   }
/*     */   
/*     */   public void setArguments(String arguments) {
/*  99 */     this.arguments = arguments;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/* 103 */     return replaceVariables(replaceVariables(this.description, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setDescription(String description) {
/* 107 */     this.description = description;
/*     */   }
/*     */   
/*     */   public boolean isMacSingleBundleTarget() {
/* 111 */     return replaceWithTextOverride("macSingleBundleTarget", this.macSingleBundleTarget);
/*     */   }
/*     */   
/*     */   public void setMacSingleBundleTarget(boolean macSingleBundleTarget) {
/* 115 */     this.macSingleBundleTarget = macSingleBundleTarget;
/*     */   }
/*     */   
/*     */   public boolean isAllUsers() {
/* 119 */     return replaceWithTextOverride("allUsers", this.allUsers);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/* 123 */     this.allUsers = allUsers;
/*     */   }
/*     */   
/*     */   public String getAdditionalDesktopFileEntries() {
/* 127 */     return replaceVariables(replaceVariables(this.additionalDesktopFileEntries));
/*     */   }
/*     */   
/*     */   public void setAdditionalDesktopFileEntries(String additionalDesktopFileEntries) {
/* 131 */     this.additionalDesktopFileEntries = additionalDesktopFileEntries;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/* 136 */     if (InstallerUtil.isWindows())
/* 137 */       return installWindows(context); 
/* 138 */     if (InstallerUtil.isMacOS()) {
/* 139 */       return installMacos(context);
/*     */     }
/* 141 */     return installUnix(context);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean installUnix(InstallerContext context) throws UserCanceledException {
/* 147 */     File desktopDir = UnixSpecialDirs.getDirectory("XDG_DESKTOP_DIR");
/* 148 */     if (desktopDir == null || !desktopDir.isDirectory()) {
/* 149 */       desktopDir = new File(Util.getUserHome(), "Desktop");
/*     */     }
/* 151 */     if (desktopDir.isDirectory()) {
/*     */       try {
/* 153 */         File destinationFile = context.getDestinationFile(getFile());
/* 154 */         DesktopFile desktopFile = new DesktopFile();
/* 155 */         desktopFile.addContent(MenuHelper.getAdditionalEntries(MenuHelper.getLauncherWithUnixPath((Context)context, destinationFile)));
/* 156 */         desktopFile.addContent(getAdditionalDesktopFileEntries());
/*     */         
/* 158 */         if (MenuHelper.installUnixDesktopFile(context.getInstallationDirectory(), desktopDir, getName(), destinationFile, getName(), null, getArguments(), context
/* 159 */             .getExternalFile(getUnixIconFile(), true), getDescription(), desktopFile.getAsAdditional()) == null) {
/*     */           
/* 161 */           Logger.getInstance().log(this, "Destination file does not exist", false);
/* 162 */           return false;
/*     */         } 
/* 164 */         return true;
/*     */       }
/* 166 */       catch (IOException e) {
/* 167 */         Logger.getInstance().log(e);
/* 168 */         return false;
/*     */       } 
/*     */     }
/* 171 */     Logger.getInstance().log(this, "Desktop directory " + desktopDir + " does not exist", false);
/* 172 */     return false;
/*     */   }
/*     */   
/*     */   private boolean installMacos(InstallerContext context) {
/*     */     File executableFile;
/* 177 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */ 
/*     */     
/* 180 */     if (config.getMacSpecificConfig().isSingleBundle() && isMacSingleBundleTarget()) {
/* 181 */       executableFile = context.getDestinationFile(config.getMacSpecificConfig().getSingleBundleName());
/* 182 */     } else if (getFile() != null && getFile().getPath().trim().length() > 0) {
/* 183 */       executableFile = context.getDestinationFile(getFile());
/* 184 */       if (!executableFile.exists()) {
/* 185 */         File appFile = new File(executableFile, ".app");
/* 186 */         if (appFile.exists()) {
/* 187 */           executableFile = appFile;
/*     */         }
/*     */       } 
/*     */     } else {
/* 191 */       return false;
/*     */     } 
/*     */     
/* 194 */     if (executableFile != null && executableFile.exists()) {
/* 195 */       if (Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle()) {
/* 196 */         File file = executableFile;
/* 197 */         InstallerContextImpl.registerAfterFinishAction(() -> createLink(file, getName()));
/* 198 */         return true;
/*     */       } 
/* 200 */       return createLink(executableFile, getName());
/*     */     } 
/*     */     
/* 203 */     Logger.getInstance().log(this, "Destination file " + executableFile + " does not exist", false);
/* 204 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean createLink(final File executableFile, final String name) {
/* 209 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 212 */             File linkFile = new File(new File(Util.getUserHome(), "Desktop"), name);
/* 213 */             if (context instanceof InstallerContext) {
/* 214 */               BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(linkFile, true, true);
/* 215 */               backupAction.install((InstallerContext)context);
/* 216 */               CreateDesktopLinkAction.this.addRollbackAction((InstallAction)backupAction);
/*     */             } 
/*     */             
/* 219 */             if (!UnixFileSystem.createLink(executableFile.getAbsolutePath(), linkFile)) {
/* 220 */               return false;
/*     */             }
/* 222 */             FileInstaller.getInstance().registerUninstallFile(linkFile);
/* 223 */             return true;
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean installWindows(InstallerContext context) throws UserCanceledException {
/* 230 */     File destFile = context.getDestinationFile(getFile());
/* 231 */     if (destFile != null) {
/* 232 */       if (!destFile.exists()) {
/* 233 */         destFile = context.getDestinationFile(getFile() + ".exe");
/*     */       }
/* 235 */       if (destFile.exists()) {
/* 236 */         boolean allUsers = isAllUsers();
/* 237 */         Object varValue = InstallerVariables.getVariable("sys.programGroupAllUsers");
/* 238 */         if (varValue instanceof Boolean) {
/* 239 */           allUsers = ((Boolean)varValue).booleanValue();
/*     */         }
/* 241 */         File iconFile = context.getExternalFile(getWinIconFile(), true);
/* 242 */         if (allUsers && !InstallerUtil.checkWritable(FolderInfo.getSpecialFolder(1, true))) {
/* 243 */           allUsers = false;
/*     */         }
/* 245 */         File desktopDir = FolderInfo.getSpecialFolder(1, allUsers);
/*     */         
/* 247 */         File usedStartIn = context.getDestinationFile(getStartIn());
/* 248 */         if (usedStartIn != null && !usedStartIn.isDirectory()) {
/* 249 */           usedStartIn = null;
/*     */         }
/*     */         try {
/* 252 */           MenuHelper.installWindowsMenu(allUsers ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED, new File(desktopDir, 
/* 253 */                 getName()), destFile, iconFile, getArguments(), 
/* 254 */               isRunAsAdministrator(), getDescription(), usedStartIn);
/* 255 */           return true;
/* 256 */         } catch (IOException e) {
/* 257 */           Logger.getInstance().log(e);
/* 258 */           return false;
/*     */         } 
/*     */       } 
/* 261 */       Logger.getInstance().log(this, "Destination file does not exist", false);
/* 262 */       return false;
/*     */     } 
/*     */     
/* 265 */     Logger.getInstance().log(this, "Destination file does not exist", false);
/* 266 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\CreateDesktopLinkAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */