/*     */ package com.install4j.runtime.beans.actions.misc;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.MsiHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.platform.win32.MsiCommunication;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RequestPrivilegesAction
/*     */   extends AbstractPrivilegesAction
/*     */ {
/*     */   private boolean obtainIfAdminWin = true;
/*     */   private boolean obtainIfNormalWin = false;
/*     */   private boolean failIfNotObtainedWin = true;
/*     */   private boolean obtainIfAdminMac = false;
/*     */   private boolean obtainIfNormalMac = false;
/*     */   private boolean failIfNotObtainedMac = true;
/*  25 */   private PrivilegeRequirement linuxPrivilegeRequirement = PrivilegeRequirement.NONE;
/*     */   
/*     */   private boolean failIfNotObtainedLinux = false;
/*     */   
/*     */   private boolean failIfNotRootUnix = false;
/*     */   private boolean updateInstallationDirectory = true;
/*     */   
/*     */   public boolean isObtainIfAdminWin() {
/*  33 */     return replaceWithTextOverride("obtainIfAdminWin", this.obtainIfAdminWin);
/*     */   }
/*     */   
/*     */   public void setObtainIfAdminWin(boolean obtainIfAdminWin) {
/*  37 */     this.obtainIfAdminWin = obtainIfAdminWin;
/*     */   }
/*     */   
/*     */   public boolean isObtainIfNormalWin() {
/*  41 */     return replaceWithTextOverride("obtainIfNormalWin", this.obtainIfNormalWin);
/*     */   }
/*     */   
/*     */   public void setObtainIfNormalWin(boolean obtainIfNormalWin) {
/*  45 */     this.obtainIfNormalWin = obtainIfNormalWin;
/*     */   }
/*     */   
/*     */   public boolean isFailIfNotObtainedWin() {
/*  49 */     return replaceWithTextOverride("failIfNotObtainedWin", this.failIfNotObtainedWin);
/*     */   }
/*     */   
/*     */   public void setFailIfNotObtainedWin(boolean failIfNotObtainedWin) {
/*  53 */     this.failIfNotObtainedWin = failIfNotObtainedWin;
/*     */   }
/*     */   
/*     */   public boolean isObtainIfAdminMac() {
/*  57 */     return replaceWithTextOverride("obtainIfAdminMac", this.obtainIfAdminMac);
/*     */   }
/*     */   
/*     */   public void setObtainIfAdminMac(boolean obtainIfAdminMac) {
/*  61 */     this.obtainIfAdminMac = obtainIfAdminMac;
/*     */   }
/*     */   
/*     */   public boolean isObtainIfNormalMac() {
/*  65 */     return replaceWithTextOverride("obtainIfNormalMac", this.obtainIfNormalMac);
/*     */   }
/*     */   
/*     */   public void setObtainIfNormalMac(boolean obtainIfNormalMac) {
/*  69 */     this.obtainIfNormalMac = obtainIfNormalMac;
/*     */   }
/*     */   
/*     */   public boolean isFailIfNotObtainedMac() {
/*  73 */     return replaceWithTextOverride("failIfNotObtainedMac", this.failIfNotObtainedMac);
/*     */   }
/*     */   
/*     */   public void setFailIfNotObtainedMac(boolean failIfNotObtainedMac) {
/*  77 */     this.failIfNotObtainedMac = failIfNotObtainedMac;
/*     */   }
/*     */   
/*     */   public boolean isFailIfNotRootUnix() {
/*  81 */     return replaceWithTextOverride("failIfNotRootUnix", this.failIfNotRootUnix);
/*     */   }
/*     */   
/*     */   public void setFailIfNotRootUnix(boolean failIfNotRootUnix) {
/*  85 */     this.failIfNotRootUnix = failIfNotRootUnix;
/*     */   }
/*     */   
/*     */   public PrivilegeRequirement getLinuxPrivilegeRequirement() {
/*  89 */     return (PrivilegeRequirement)replaceWithTextOverride("linuxPrivilegeRequirement", this.linuxPrivilegeRequirement, PrivilegeRequirement.class);
/*     */   }
/*     */   
/*     */   public void setLinuxPrivilegeRequirement(PrivilegeRequirement linuxPrivilegeRequirement) {
/*  93 */     this.linuxPrivilegeRequirement = linuxPrivilegeRequirement;
/*     */   }
/*     */   
/*     */   public boolean isFailIfNotObtainedLinux() {
/*  97 */     return replaceWithTextOverride("failIfNotObtainedLinux", this.failIfNotObtainedLinux);
/*     */   }
/*     */   
/*     */   public void setFailIfNotObtainedLinux(boolean failIfNotObtainedLinux) {
/* 101 */     this.failIfNotObtainedLinux = failIfNotObtainedLinux;
/*     */   }
/*     */   
/*     */   public boolean isUpdateInstallationDirectory() {
/* 105 */     return replaceWithTextOverride("updateInstallationDirectory", this.updateInstallationDirectory);
/*     */   }
/*     */   
/*     */   public void setUpdateInstallationDirectory(boolean updateInstallationDirectory) {
/* 109 */     this.updateInstallationDirectory = updateInstallationDirectory;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/* 114 */     boolean success = requestRights(context);
/* 115 */     boolean adminRightsSet = setAdminRightsVariable();
/* 116 */     if (adminRightsSet && isLinuxPrivilegeHandling()) {
/* 117 */       context.setVariable("sys.adminRightsUiRootUnix", Boolean.valueOf((getLinuxPrivilegeRequirement() == PrivilegeRequirement.ROOT)));
/* 118 */       InstallerVariables.registerResponseFileVariable("sys.adminRightsUiRootUnix");
/*     */     } 
/* 120 */     if (context instanceof InstallerContext) {
/* 121 */       boolean sufficientRights = HelperCommunication.getInstance().hasElevatedHelper();
/* 122 */       if (!sufficientRights) {
/* 123 */         sufficientRights = Util.hasFullAdminRights();
/* 124 */         if (!sufficientRights && Util.isMacOS() && !isObtainIfAdminMac() && Util.isAdminGroup()) {
/* 125 */           sufficientRights = InstallerConfig.canInstallTo(InstallerConfig.getInstallationDirWithSingleBundle(context.getInstallationDirectory()));
/*     */         }
/*     */       } 
/* 128 */       if (!sufficientRights && !context.getBooleanVariable("sys.resolveUserSpecificInstallationDir")) {
/* 129 */         context.setVariable("sys.resolveUserSpecificInstallationDir", Boolean.valueOf(true));
/* 130 */         if (isUpdateInstallationDirectory() && !InstallerConfig.canInstallTo(InstallerConfig.getInstallationDirWithSingleBundle(context.getInstallationDirectory()))) {
/* 131 */           InstallerContext installerContext = (InstallerContext)context;
/* 132 */           installerContext.setInstallationDirectory(context.getDefaultInstallationDirectory());
/*     */         } 
/*     */       } 
/*     */     } 
/* 136 */     return success;
/*     */   }
/*     */   
/*     */   private boolean requestRights(Context context) throws UserCanceledException {
/* 140 */     if (Util.isWindows())
/* 141 */       return executeOnWindows(context); 
/* 142 */     if (Util.isMacOS())
/* 143 */       return executeOnMac(context); 
/* 144 */     if (isLinuxPrivilegeHandling()) {
/* 145 */       return executeOnLinux(context);
/*     */     }
/* 147 */     return executeOnUnix(context);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean executeOnUnix(Context context) throws UserCanceledException {
/* 152 */     if (isFailIfNotRootUnix() && !Util.hasFullAdminRights()) {
/* 153 */       showFailureMessage(context);
/* 154 */       return false;
/*     */     } 
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean executeOnLinux(Context context) throws UserCanceledException {
/* 161 */     if (!Util.hasFullAdminRights()) {
/* 162 */       switch (getLinuxPrivilegeRequirement()) {
/*     */         case NONE:
/* 164 */           return true;
/*     */         case ROOT:
/* 166 */           showFailureMessage(context);
/* 167 */           return false;
/*     */         case OBTAIN:
/* 169 */           if (!startOnLinux(context) && isFailIfNotObtainedLinux()) {
/* 170 */             showFailureMessage(context);
/* 171 */             return false;
/*     */           } 
/* 173 */           return true;
/*     */       } 
/*     */     
/*     */     }
/* 177 */     return true;
/*     */   }
/*     */   
/*     */   private boolean executeOnMac(Context context) throws UserCanceledException {
/* 181 */     boolean success = true;
/* 182 */     if (Util.isAdminGroup()) {
/* 183 */       if (isObtainIfAdminMac()) {
/* 184 */         success = (Util.hasFullAdminRights() || startOnMac(context));
/*     */       }
/*     */     }
/* 187 */     else if (isObtainIfNormalMac()) {
/* 188 */       success = startOnMac(context);
/*     */     } 
/*     */     
/* 191 */     if (!success && isFailIfNotObtainedMac()) {
/* 192 */       showFailureMessage(context);
/*     */     }
/* 194 */     return success;
/*     */   }
/*     */   
/*     */   private boolean executeOnWindows(Context context) throws UserCanceledException {
/* 198 */     boolean success = true;
/* 199 */     if (Util.isAdminGroup()) {
/* 200 */       if (isObtainIfAdminWin()) {
/* 201 */         if (Util.hasFullAdminRights()) {
/* 202 */           if (MsiHelper.isStartedFromMsi() && 
/* 203 */             !context.isUnattended() && MsiCommunication.isConnected() && MsiCommunication.sendElevationRequested()) {
/* 204 */             MsiHelper.setMsiAllUsers(true);
/*     */           }
/*     */         } else {
/*     */           
/* 208 */           success = startOnWindows(context);
/*     */         }
/*     */       
/*     */       }
/* 212 */     } else if (isObtainIfNormalWin()) {
/* 213 */       success = startOnWindows(context);
/*     */     } 
/*     */     
/* 216 */     if (!success && isFailIfNotObtainedWin()) {
/* 217 */       showFailureMessage(context);
/*     */     }
/* 219 */     return success;
/*     */   }
/*     */   
/*     */   public boolean isAllRequested(boolean windowsOnly) {
/* 223 */     return (isObtainIfAdminWin() && isObtainIfNormalWin() && (windowsOnly || (isObtainIfAdminMac() && isObtainIfNormalMac() && getLinuxPrivilegeRequirement() != PrivilegeRequirement.NONE)));
/*     */   }
/*     */   
/*     */   public void setAllRequested(boolean windowsOnly) {
/* 227 */     setObtainIfAdminWin(true);
/* 228 */     setObtainIfNormalWin(true);
/* 229 */     setFailIfNotObtainedWin(true);
/*     */     
/* 231 */     if (!windowsOnly) {
/* 232 */       setObtainIfAdminMac(true);
/* 233 */       setObtainIfNormalMac(true);
/*     */       
/* 235 */       setFailIfNotObtainedMac(true);
/*     */       
/* 237 */       if (getLinuxPrivilegeRequirement() == PrivilegeRequirement.NONE) {
/* 238 */         setLinuxPrivilegeRequirement(PrivilegeRequirement.OBTAIN);
/*     */       }
/* 240 */       setFailIfNotObtainedLinux(true);
/*     */       
/* 242 */       setFailIfNotRootUnix(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   static boolean isLinuxPrivilegeHandling() {
/* 247 */     return (Util.isLinux() || (!Util.isWindows() && !Util.isMacOS() && Objects.equals(Boolean.TRUE, InstallerVariables.getVariable("sys.forcePrivilegeRequest"))));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\RequestPrivilegesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */