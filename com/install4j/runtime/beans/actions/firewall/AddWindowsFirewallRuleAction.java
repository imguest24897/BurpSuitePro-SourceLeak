/*     */ package com.install4j.runtime.beans.actions.firewall;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.windows.WinFirewall;
/*     */ import com.install4j.runtime.beans.actions.SystemAutoUninstallInstallAction;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AddWindowsFirewallRuleAction
/*     */   extends SystemAutoUninstallInstallAction
/*     */ {
/*     */   private static final String PROPERTY_NAME_CREATED = "created";
/*     */   private static final String PROPERTY_NAME_EXECUTABLE = "executable";
/*     */   private static final String PROPERTY_NAME_RULE_NAME = "ruleName";
/*     */   private static final String PROPERTY_NAME_INCOMING = "incoming";
/*     */   private static final String PROPERTY_NAME_UDP = "udp";
/*  29 */   private String launcherId = ""; private static final String PROPERTY_NAME_GROUP = "group"; private static final String PROPERTY_NAME_LOCAL_ADDRESSES = "localAddresses"; private static final String PROPERTY_NAME_LOCAL_PORTS = "localPorts"; private static final String PROPERTY_NAME_REMOTE_ADDRESSES = "remoteAddresses"; private static final String PROPERTY_NAME_REMOTE_PORTS = "remotePorts";
/*  30 */   private String executablePath = "";
/*     */   
/*  32 */   private WindowsFirewallDirection direction = WindowsFirewallDirection.INCOMING;
/*     */   
/*  34 */   private String ruleName = "";
/*  35 */   private String description = "";
/*  36 */   private String group = "${compiler:sys.fullName}";
/*     */   
/*  38 */   private WindowsFirewallProtocol protocol = WindowsFirewallProtocol.TCP;
/*  39 */   private String localPorts = "";
/*  40 */   private String localAddresses = "";
/*  41 */   private String remotePorts = "";
/*  42 */   private String remoteAddresses = "";
/*     */   
/*     */   private boolean domainProfile = true;
/*     */   
/*     */   private boolean privateProfile = true;
/*     */   
/*     */   private boolean publicProfile;
/*     */   private boolean avoidPublicProfile;
/*     */   private boolean onlyActiveProfiles;
/*     */   private transient boolean created;
/*     */   
/*     */   public String getLauncherId() {
/*  54 */     return replaceVariables(this.launcherId);
/*     */   }
/*     */   
/*     */   public void setLauncherId(String launcherId) {
/*  58 */     this.launcherId = launcherId;
/*     */   }
/*     */   
/*     */   public String getExecutablePath() {
/*  62 */     return replaceVariables(this.executablePath);
/*     */   }
/*     */   
/*     */   public void setExecutablePath(String executablePath) {
/*  66 */     this.executablePath = executablePath;
/*     */   }
/*     */   
/*     */   public WindowsFirewallDirection getDirection() {
/*  70 */     return (WindowsFirewallDirection)replaceWithTextOverride("direction", this.direction, WindowsFirewallDirection.class);
/*     */   }
/*     */   
/*     */   public void setDirection(WindowsFirewallDirection direction) {
/*  74 */     this.direction = direction;
/*     */   }
/*     */   
/*     */   public String getRuleName() {
/*  78 */     return replaceVariables(this.ruleName);
/*     */   }
/*     */   
/*     */   public void setRuleName(String ruleName) {
/*  82 */     this.ruleName = ruleName;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/*  86 */     return replaceVariables(this.description);
/*     */   }
/*     */   
/*     */   public void setDescription(String description) {
/*  90 */     this.description = description;
/*     */   }
/*     */   
/*     */   public String getGroup() {
/*  94 */     return replaceVariables(this.group);
/*     */   }
/*     */   
/*     */   public void setGroup(String group) {
/*  98 */     this.group = group;
/*     */   }
/*     */   
/*     */   public WindowsFirewallProtocol getProtocol() {
/* 102 */     return (WindowsFirewallProtocol)replaceWithTextOverride("protocol", this.protocol, WindowsFirewallProtocol.class);
/*     */   }
/*     */   
/*     */   public void setProtocol(WindowsFirewallProtocol protocol) {
/* 106 */     this.protocol = protocol;
/*     */   }
/*     */   
/*     */   public String getLocalPorts() {
/* 110 */     return replaceVariables(this.localPorts);
/*     */   }
/*     */   
/*     */   public void setLocalPorts(String localPorts) {
/* 114 */     this.localPorts = localPorts;
/*     */   }
/*     */   
/*     */   public String getLocalAddresses() {
/* 118 */     return replaceVariables(this.localAddresses);
/*     */   }
/*     */   
/*     */   public void setLocalAddresses(String localAddresses) {
/* 122 */     this.localAddresses = localAddresses;
/*     */   }
/*     */   
/*     */   public String getRemotePorts() {
/* 126 */     return replaceVariables(this.remotePorts);
/*     */   }
/*     */   
/*     */   public void setRemotePorts(String remotePorts) {
/* 130 */     this.remotePorts = remotePorts;
/*     */   }
/*     */   
/*     */   public String getRemoteAddresses() {
/* 134 */     return replaceVariables(this.remoteAddresses);
/*     */   }
/*     */   
/*     */   public void setRemoteAddresses(String remoteAddresses) {
/* 138 */     this.remoteAddresses = remoteAddresses;
/*     */   }
/*     */   
/*     */   public boolean isDomainProfile() {
/* 142 */     return replaceWithTextOverride("domainProfile", this.domainProfile);
/*     */   }
/*     */   
/*     */   public void setDomainProfile(boolean domainProfile) {
/* 146 */     this.domainProfile = domainProfile;
/*     */   }
/*     */   
/*     */   public boolean isPrivateProfile() {
/* 150 */     return replaceWithTextOverride("privateProfile", this.privateProfile);
/*     */   }
/*     */   
/*     */   public void setPrivateProfile(boolean privateProfile) {
/* 154 */     this.privateProfile = privateProfile;
/*     */   }
/*     */   
/*     */   public boolean isPublicProfile() {
/* 158 */     return replaceWithTextOverride("publicProfile", this.publicProfile);
/*     */   }
/*     */   
/*     */   public void setPublicProfile(boolean publicProfile) {
/* 162 */     this.publicProfile = publicProfile;
/*     */   }
/*     */   
/*     */   public boolean isAvoidPublicProfile() {
/* 166 */     return replaceWithTextOverride("avoidPublicProfile", this.avoidPublicProfile);
/*     */   }
/*     */   
/*     */   public void setAvoidPublicProfile(boolean avoidPublicProfile) {
/* 170 */     this.avoidPublicProfile = avoidPublicProfile;
/*     */   }
/*     */   
/*     */   public boolean isOnlyActiveProfiles() {
/* 174 */     return replaceWithTextOverride("onlyActiveProfiles", this.onlyActiveProfiles);
/*     */   }
/*     */   
/*     */   public void setOnlyActiveProfiles(boolean onlyActiveProfiles) {
/* 178 */     this.onlyActiveProfiles = onlyActiveProfiles;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/* 183 */     if (!InstallerUtil.isWindows()) {
/* 184 */       return true;
/*     */     }
/*     */     try {
/* 187 */       this.created = WinFirewall.addRule(createRule((Context)context, getPersistentProperties()));
/* 188 */       Logger.getInstance().info(this, "created new rule: " + this.created);
/* 189 */       getPersistentProperties().setProperty("created", String.valueOf(this.created));
/* 190 */     } catch (IOException|com.install4j.api.windows.WinFirewall.AccessDeniedException|com.install4j.api.windows.WinFirewall.FirewallException e) {
/* 191 */       Logger.getInstance().log(e);
/* 192 */       return false;
/*     */     } 
/* 194 */     return true;
/*     */   }
/*     */   
/*     */   private WinFirewall.Rule createRule(Context context, Properties storeToProperties) throws IOException {
/*     */     File usedExecutable;
/* 199 */     if (getLauncherId() == null) {
/* 200 */       usedExecutable = context.getDestinationFile(getExecutablePath());
/*     */     } else {
/* 202 */       LauncherSetup launcherSetup = context.getLauncherById(getLauncherId());
/* 203 */       if (launcherSetup == null) {
/* 204 */         throw new IOException("The launcher with ID " + getLauncherId() + " cannot be found");
/*     */       }
/* 206 */       usedExecutable = context.getDestinationFile(launcherSetup.getRelativeFileName());
/*     */     } 
/* 208 */     EnumSet<WinFirewall.ProfileType> profileTypes = EnumSet.noneOf(WinFirewall.ProfileType.class);
/* 209 */     if (isDomainProfile()) {
/* 210 */       profileTypes.add(WinFirewall.ProfileType.DOMAIN);
/*     */     }
/* 212 */     if (isPrivateProfile()) {
/* 213 */       profileTypes.add(WinFirewall.ProfileType.PRIVATE);
/*     */     }
/* 215 */     if (isPublicProfile()) {
/* 216 */       profileTypes.add(WinFirewall.ProfileType.PUBLIC);
/*     */     }
/* 218 */     if (storeToProperties != null) {
/* 219 */       storeToProperties.setProperty("executable", usedExecutable.getAbsolutePath());
/* 220 */       storeToProperties.setProperty("ruleName", getRuleName());
/* 221 */       storeToProperties.setProperty("incoming", String.valueOf((getDirection() == WindowsFirewallDirection.INCOMING)));
/* 222 */       storeToProperties.setProperty("udp", String.valueOf((getProtocol() == WindowsFirewallProtocol.UDP)));
/* 223 */       storeToProperties.setProperty("group", getGroup());
/* 224 */       storeToProperties.setProperty("localAddresses", getLocalAddresses());
/* 225 */       storeToProperties.setProperty("localPorts", getLocalPorts());
/* 226 */       storeToProperties.setProperty("remoteAddresses", getRemoteAddresses());
/* 227 */       storeToProperties.setProperty("remotePorts", getRemotePorts());
/*     */     } 
/* 229 */     return (new WinFirewall.Rule(usedExecutable.getAbsolutePath(), getRuleName(), getDirection().getRuleDirection(), getProtocol().getNetworkProtocol()))
/* 230 */       .setGroupName(getGroup())
/* 231 */       .setDescription(getDescription())
/* 232 */       .setLocalAddresses(getLocalAddresses())
/* 233 */       .setLocalPorts(getLocalPorts())
/* 234 */       .setRemotePorts(getRemotePorts())
/* 235 */       .setRemoteAddresses(getRemoteAddresses())
/* 236 */       .setProfileTypes(profileTypes)
/* 237 */       .setAvoidPublicProfile(isAvoidPublicProfile())
/* 238 */       .setOnlyActiveProfiles(isOnlyActiveProfiles());
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 243 */     if (!InstallerUtil.isWindows()) {
/*     */       return;
/*     */     }
/* 246 */     if (this.created) {
/*     */       try {
/* 248 */         int deleted = WinFirewall.deleteRules(createRule((Context)context, (Properties)null));
/* 249 */         Logger.getInstance().info(this, "deleted " + deleted + " firewall rules.");
/* 250 */       } catch (IOException|com.install4j.api.windows.WinFirewall.AccessDeniedException|com.install4j.api.windows.WinFirewall.FirewallException e) {
/* 251 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/* 258 */     if (!InstallerUtil.isWindows()) {
/* 259 */       return true;
/*     */     }
/* 261 */     Properties properties = getPersistentProperties();
/* 262 */     String created = properties.getProperty("created");
/* 263 */     if (created == null) {
/* 264 */       return true;
/*     */     }
/*     */     try {
/* 267 */       boolean removeOnlyCreated = CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "firewallRemoveOnlyCreated", false);
/* 268 */       if (!removeOnlyCreated || Objects.equals(created, String.valueOf(true))) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 278 */         WinFirewall.Rule rule = (new WinFirewall.Rule(properties.getProperty("executable", ""), properties.getProperty("ruleName", ""), Boolean.parseBoolean(properties.getProperty("incoming", "true")) ? WinFirewall.RuleDirection.INCOMING : WinFirewall.RuleDirection.OUTGOING, Boolean.parseBoolean(properties.getProperty("udp", "false")) ? WinFirewall.NetworkProtocol.UDP : WinFirewall.NetworkProtocol.TCP)).setGroupName(properties.getProperty("group", "")).setLocalAddresses(properties.getProperty("localAddresses", "")).setLocalPorts(properties.getProperty("localPorts", "")).setRemotePorts(properties.getProperty("remotePorts", "")).setRemoteAddresses(properties.getProperty("remoteAddresses", ""));
/*     */         
/* 280 */         int deleted = WinFirewall.deleteRules(rule);
/* 281 */         Logger.getInstance().info(this, "deleted " + deleted + " firewall rules.");
/*     */       } 
/* 283 */       return true;
/* 284 */     } catch (com.install4j.api.windows.WinFirewall.AccessDeniedException|com.install4j.api.windows.WinFirewall.FirewallException e) {
/* 285 */       Logger.getInstance().log(e);
/* 286 */       return false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\firewall\AddWindowsFirewallRuleAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */