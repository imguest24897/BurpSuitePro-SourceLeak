/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Firewall;
/*     */ import java.util.Collection;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WinFirewall
/*     */ {
/*     */   public static boolean addRule(Rule rule) throws AccessDeniedException, FirewallException {
/*  27 */     int profiles = Win32Firewall.getProfiles(rule.profileTypes, rule.onlyActiveProfiles, rule.avoidPublicProfile);
/*  28 */     return Win32Firewall.addRule(rule.executablePath, rule.ruleName, rule.groupName, rule.ruleDirection, rule
/*  29 */         .networkProtocol, rule.description, rule.localPorts, rule.localAddresses, rule.remotePorts, rule.remoteAddresses, profiles, rule.enabled);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int deleteRulesByExecutable(String executablePath) throws AccessDeniedException, FirewallException {
/*  41 */     return Win32Firewall.deleteRules(executablePath, null, null, null, null, null, null, null, null, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int deleteRulesByName(String ruleName) throws AccessDeniedException, FirewallException {
/*  53 */     return Win32Firewall.deleteRules(null, ruleName, null, null, null, null, null, null, null, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int deleteRulesByGroup(String groupName) throws AccessDeniedException, FirewallException {
/*  65 */     return Win32Firewall.deleteRules(null, null, groupName, null, null, null, null, null, null, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int deleteRules(Rule template) throws AccessDeniedException, FirewallException {
/*  78 */     return Win32Firewall.deleteRules(template.executablePath, template.ruleName, template.groupName, template
/*  79 */         .ruleDirection, template.networkProtocol, template.description, template.localPorts, template.localAddresses, template.remotePorts, template.remoteAddresses);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Set<ProfileType> getCurrentProfileTypes() throws AccessDeniedException, FirewallException {
/*  89 */     return Win32Firewall.translate(Win32Firewall.getCurrentProfileTypes());
/*     */   }
/*     */ 
/*     */   
/*     */   public static class Rule
/*     */   {
/*     */     @NotNull
/*     */     private final String executablePath;
/*     */     
/*     */     @NotNull
/*     */     private final String ruleName;
/*     */     
/*     */     @NotNull
/*     */     private final WinFirewall.RuleDirection ruleDirection;
/*     */     
/*     */     @NotNull
/*     */     private final WinFirewall.NetworkProtocol networkProtocol;
/*     */     private String groupName;
/*     */     private String description;
/*     */     private String localPorts;
/*     */     private String localAddresses;
/*     */     private String remotePorts;
/*     */     private String remoteAddresses;
/* 112 */     private EnumSet<WinFirewall.ProfileType> profileTypes = EnumSet.of(WinFirewall.ProfileType.DOMAIN, WinFirewall.ProfileType.PRIVATE);
/*     */ 
/*     */     
/*     */     private boolean onlyActiveProfiles;
/*     */ 
/*     */     
/*     */     private boolean avoidPublicProfile;
/*     */ 
/*     */     
/*     */     private boolean enabled = true;
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule(@NotNull String executablePath, @NotNull String ruleName, @NotNull WinFirewall.RuleDirection ruleDirection, @NotNull WinFirewall.NetworkProtocol networkProtocol) {
/* 126 */       this.executablePath = executablePath;
/* 127 */       this.ruleName = ruleName;
/* 128 */       this.ruleDirection = ruleDirection;
/* 129 */       this.networkProtocol = networkProtocol;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setGroupName(String groupName) {
/* 138 */       this.groupName = groupName;
/* 139 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setDescription(String description) {
/* 148 */       this.description = description;
/* 149 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setLocalPorts(String localPorts) {
/* 160 */       this.localPorts = localPorts;
/* 161 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setLocalAddresses(String localAddresses) {
/* 177 */       this.localAddresses = localAddresses;
/* 178 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setRemotePorts(String remotePorts) {
/* 189 */       this.remotePorts = remotePorts;
/* 190 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setRemoteAddresses(String remoteAddresses) {
/* 211 */       this.remoteAddresses = remoteAddresses;
/* 212 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setProfileTypes(Collection<WinFirewall.ProfileType> profileTypes) {
/* 222 */       this.profileTypes = (profileTypes == null || profileTypes.isEmpty()) ? EnumSet.<WinFirewall.ProfileType>noneOf(WinFirewall.ProfileType.class) : EnumSet.<WinFirewall.ProfileType>copyOf(profileTypes);
/* 223 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setOnlyActiveProfiles(boolean onlyActiveProfiles) {
/* 233 */       this.onlyActiveProfiles = onlyActiveProfiles;
/* 234 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setAvoidPublicProfile(boolean avoidPublicProfile) {
/* 244 */       this.avoidPublicProfile = avoidPublicProfile;
/* 245 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rule setEnabled(boolean enabled) {
/* 255 */       this.enabled = enabled;
/* 256 */       return this;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public enum NetworkProtocol
/*     */   {
/* 264 */     TCP,
/* 265 */     UDP;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public enum RuleDirection
/*     */   {
/* 272 */     INCOMING,
/* 273 */     OUTGOING;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public enum ProfileType
/*     */   {
/* 280 */     DOMAIN,
/* 281 */     PRIVATE,
/* 282 */     PUBLIC;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class AccessDeniedException
/*     */     extends Exception {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class FirewallException
/*     */     extends Exception
/*     */   {
/*     */     public FirewallException(String message) {
/* 300 */       super(message);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinFirewall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */