/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ import com.install4j.api.beans.UndefinedVariableException;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.LauncherType;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.beans.screens.components.ProgramGroupEntryConfig;
/*     */ import com.install4j.runtime.beans.screens.components.ProgramGroupFileConfig;
/*     */ import com.install4j.runtime.beans.screens.components.ProgramGroupUrlConfig;
/*     */ import com.install4j.runtime.beans.screens.components.ProgramGroupWithIconConfig;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ 
/*     */ public class CreateProgramGroupAction extends SystemInstallAction {
/*  27 */   private String programGroupName = "${installer:sys.programGroupName}";
/*     */   private boolean allUsers = true;
/*     */   private boolean addUninstaller = false;
/*  30 */   private String uninstallerMenuName = "";
/*     */   
/*     */   private boolean addDefaultLauncherLinks = true;
/*  33 */   private String linkDirectory = "${installer:sys.symlinkDir}";
/*  34 */   private String categories = "Application";
/*     */   
/*     */   private boolean unixSymlinks = true;
/*     */   private boolean failForSymlinksNotCreated = false;
/*     */   private boolean unixMenuEntries = true;
/*  39 */   private List<ProgramGroupEntryConfig> programGroupEntryConfigs = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void init(Context context) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  49 */     if (context.getVariable("sys.programGroupName") == null) {
/*  50 */       context.setVariable("sys.programGroupName", context.getCompilerVariable("sys.fullName"));
/*     */     }
/*  52 */     if (context.getVariable("sys.symlinkDir") == null) {
/*  53 */       context.setVariable("sys.symlinkDir", "/usr/local/bin");
/*     */     }
/*     */     
/*  56 */     boolean success = true;
/*     */     try {
/*  58 */       if (InstallerUtil.isWindows()) {
/*  59 */         installWindows(context);
/*  60 */       } else if (!InstallerUtil.isMacOS()) {
/*  61 */         success = installUnix(context);
/*     */       } 
/*  63 */     } catch (IOException e) {
/*  64 */       e.printStackTrace();
/*  65 */       return false;
/*     */     } 
/*  67 */     return success;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isAddUninstaller() {
/*  72 */     return replaceWithTextOverride("addUninstaller", this.addUninstaller);
/*     */   }
/*     */   
/*     */   public void setAddUninstaller(boolean addUninstaller) {
/*  76 */     this.addUninstaller = addUninstaller;
/*     */   }
/*     */   
/*     */   public String getUninstallerMenuName() {
/*  80 */     return replaceVariables(replaceVariables(this.uninstallerMenuName));
/*     */   }
/*     */   
/*     */   public void setUninstallerMenuName(String uninstallerMenuName) {
/*  84 */     this.uninstallerMenuName = uninstallerMenuName;
/*     */   }
/*     */   
/*     */   public boolean isAddDefaultLauncherLinks() {
/*  88 */     return replaceWithTextOverride("addDefaultLauncherLinks", this.addDefaultLauncherLinks);
/*     */   }
/*     */   
/*     */   public void setAddDefaultLauncherLinks(boolean addDefaultLauncherLinks) {
/*  92 */     this.addDefaultLauncherLinks = addDefaultLauncherLinks;
/*     */   }
/*     */   
/*     */   public String getCategories() {
/*  96 */     return replaceVariables(replaceVariables(this.categories));
/*     */   }
/*     */   
/*     */   public void setCategories(String categories) {
/* 100 */     this.categories = categories;
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
/*     */   public boolean isAllUsers() {
/* 116 */     return replaceWithTextOverride("allUsers", this.allUsers);
/*     */   }
/*     */   
/*     */   public void setAllUsers(boolean allUsers) {
/* 120 */     this.allUsers = allUsers;
/*     */   }
/*     */   
/*     */   public String getLinkDirectory() {
/*     */     try {
/* 125 */       return replaceVariables(replaceVariables(this.linkDirectory));
/* 126 */     } catch (UndefinedVariableException e) {
/* 127 */       return replaceVariables("");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setLinkDirectory(String linkDirectory) {
/* 132 */     this.linkDirectory = linkDirectory;
/*     */   }
/*     */   
/*     */   public List<ProgramGroupEntryConfig> getProgramGroupEntryConfigs() {
/* 136 */     return (List<ProgramGroupEntryConfig>)replaceWithTextOverride("programGroupEntryConfigs", this.programGroupEntryConfigs, List.class);
/*     */   }
/*     */   
/*     */   public void setProgramGroupEntryConfigs(List<ProgramGroupEntryConfig> programGroupEntryConfigs) {
/* 140 */     this.programGroupEntryConfigs = programGroupEntryConfigs;
/*     */   }
/*     */   
/*     */   public boolean isUnixSymlinks() {
/* 144 */     return replaceWithTextOverride("unixSymlinks", this.unixSymlinks);
/*     */   }
/*     */   
/*     */   public void setUnixSymlinks(boolean unixSymlinks) {
/* 148 */     this.unixSymlinks = unixSymlinks;
/*     */   }
/*     */   
/*     */   public boolean isFailForSymlinksNotCreated() {
/* 152 */     return replaceWithTextOverride("failForSymlinksNotCreated", this.failForSymlinksNotCreated);
/*     */   }
/*     */   
/*     */   public void setFailForSymlinksNotCreated(boolean failForSymlinksNotCreated) {
/* 156 */     this.failForSymlinksNotCreated = failForSymlinksNotCreated;
/*     */   }
/*     */   
/*     */   public boolean isUnixMenuEntries() {
/* 160 */     return replaceWithTextOverride("unixMenuEntries", this.unixMenuEntries);
/*     */   }
/*     */   
/*     */   public void setUnixMenuEntries(boolean unixMenuEntries) {
/* 164 */     this.unixMenuEntries = unixMenuEntries;
/*     */   }
/*     */   
/*     */   private boolean installUnix(InstallerContext context) throws IOException, UserCanceledException {
/* 168 */     FileInstaller fileInstaller = FileInstaller.getInstance();
/* 169 */     boolean success = true;
/* 170 */     for (LauncherSetup launcherSetup : context.getLaunchers()) {
/* 171 */       if (!launcherSetup.isUninstaller()) {
/* 172 */         File destFile = context.getDestinationFile(launcherSetup.getRelativeFileName());
/* 173 */         if (destFile.exists()) {
/* 174 */           boolean excludeFromMenu = launcherSetup.isExcludeFromMenu();
/* 175 */           if (isUnixMenuEntries() && !excludeFromMenu && (launcherSetup.getType() == LauncherType.GUI || launcherSetup.getType() == LauncherType.EXTERNAL)) {
/* 176 */             MenuHelper.installUnixMenu(context.getInstallationDirectory(), destFile, ((ContextImpl.LauncherSetupImpl)launcherSetup).getMenuName(), getCategories(), null, null, null, 
/* 177 */                 MenuHelper.getAdditionalEntries(launcherSetup), true);
/*     */           }
/*     */           
/* 180 */           if (isUnixSymlinks() && !excludeFromMenu && getLinkDirectory() != null && getLinkDirectory().trim().length() > 0) {
/* 181 */             File linkDir = (new File(getLinkDirectory())).getCanonicalFile();
/* 182 */             if (!Objects.equals(linkDir, destFile.getParentFile().getCanonicalFile())) {
/* 183 */               fileInstaller.createDirectory(linkDir);
/*     */               
/* 185 */               File linkFile = new File(linkDir, destFile.getName());
/*     */               
/* 187 */               boolean created = UnixFileSystem.createLink(destFile.getAbsolutePath(), linkFile);
/* 188 */               if (isFailForSymlinksNotCreated() && !created) {
/* 189 */                 success = false;
/*     */               }
/* 191 */               if (created) {
/* 192 */                 fileInstaller.registerUninstallFile(linkFile);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*     */     try {
/* 201 */       Runtime.getRuntime().exec("kbuildsycoca");
/* 202 */       MenuHelper.updateDesktopDatabase();
/* 203 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 206 */     return success;
/*     */   }
/*     */   
/*     */   private void installWindows(InstallerContext context) throws UserCanceledException, IOException {
/* 210 */     boolean allUsers = isAllUsers();
/* 211 */     Object varValue = InstallerVariables.getVariable("sys.programGroupAllUsers");
/* 212 */     if (varValue instanceof Boolean) {
/* 213 */       allUsers = ((Boolean)varValue).booleanValue();
/*     */     }
/* 215 */     if (allUsers && !InstallerUtil.checkWritable(FolderInfo.getSpecialFolder(3, true))) {
/* 216 */       allUsers = false;
/*     */     }
/*     */     
/* 219 */     File groupDir = FolderInfo.getSpecialFolder(3, allUsers);
/* 220 */     if (getProgramGroupName().trim().length() > 0) {
/* 221 */       groupDir = new File(groupDir, getProgramGroupName());
/*     */     }
/*     */     
/* 224 */     ExecutionContext executionContext = allUsers ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED;
/*     */     
/* 226 */     for (LauncherSetup launcherSetup : context.getLaunchers()) {
/* 227 */       if (!launcherSetup.isExcludeFromMenu() && (
/* 228 */         !launcherSetup.isUninstaller() || isAddUninstaller())) {
/* 229 */         File launcherFile = context.getDestinationFile(replaceVariables(launcherSetup.getRelativeFileName()));
/* 230 */         if (launcherFile.exists()) {
/*     */           String menuName;
/* 232 */           if (launcherSetup.isUninstaller()) {
/* 233 */             menuName = getUninstallerMenuName();
/*     */           } else {
/* 235 */             menuName = ((ContextImpl.LauncherSetupImpl)launcherSetup).getMenuName();
/*     */           } 
/* 237 */           MenuHelper.installWindowsMenu(executionContext, new File(groupDir, menuName), launcherFile, null);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 244 */     for (ProgramGroupEntryConfig programGroupEntryConfig : getProgramGroupEntryConfigs()) {
/* 245 */       if (programGroupEntryConfig instanceof ProgramGroupWithIconConfig) {
/* 246 */         ProgramGroupWithIconConfig programGroupWithIconConfig = (ProgramGroupWithIconConfig)programGroupEntryConfig;
/* 247 */         File iconFile = context.getExternalFile(programGroupWithIconConfig.getIconFile(), true);
/* 248 */         File menuFile = new File(groupDir, programGroupEntryConfig.getName());
/*     */         
/* 250 */         if (programGroupEntryConfig instanceof ProgramGroupUrlConfig) {
/* 251 */           ProgramGroupUrlConfig programGroupUrlConfig = (ProgramGroupUrlConfig)programGroupEntryConfig;
/* 252 */           String url = replaceVariables(programGroupUrlConfig.getUrl());
/* 253 */           if (!url.contains("://")) {
/* 254 */             url = "http://" + url;
/*     */           }
/* 256 */           MenuHelper.installUrlLink(executionContext, url, menuFile, iconFile, programGroupUrlConfig.isFavicon()); continue;
/*     */         } 
/* 258 */         if (programGroupEntryConfig instanceof ProgramGroupFileConfig) {
/* 259 */           ProgramGroupFileConfig programGroupFileConfig = (ProgramGroupFileConfig)programGroupEntryConfig;
/* 260 */           File targetFile = context.getDestinationFile(replaceVariables(programGroupFileConfig.getTarget()));
/* 261 */           if (targetFile.exists())
/* 262 */             MenuHelper.installWindowsMenu(executionContext, menuFile, targetFile, iconFile, replaceVariables(programGroupFileConfig.getArguments()), programGroupFileConfig
/* 263 */                 .isRunAsAdministrator(), null); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\CreateProgramGroupAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */