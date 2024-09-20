/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.windows.WinFirewall;
/*     */ import java.util.Collection;
/*     */ import java.util.EnumSet;
/*     */ 
/*     */ public class Win32Firewall
/*     */ {
/*     */   static {
/*  11 */     Common.init();
/*     */   }
/*     */ 
/*     */   
/*     */   public static final int DIRECTION_INCOMING = 1;
/*     */   
/*     */   public static final int DIRECTION_OUTGOING = 2;
/*     */   
/*     */   public static final int PROTOCOL_TCP = 6;
/*     */   public static final int PROTOCOL_UDP = 17;
/*     */   public static final int PROFILE_DOMAIN = 1;
/*     */   public static final int PROFILE_PRIVATE = 2;
/*     */   public static final int PROFILE_PUBLIC = 4;
/*  24 */   private static ThreadLocal initializer = ThreadLocal.withInitial(() -> {
/*     */         if (Util.isWindows()) {
/*     */           initialize0();
/*     */         }
/*     */         return null;
/*     */       });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void initialize() {
/*  37 */     initializer.get();
/*     */   }
/*     */   
/*     */   public static int getProfiles(Collection<WinFirewall.ProfileType> profileTypes, boolean onlyActiveProfiles, boolean avoidPublicProfile) throws WinFirewall.AccessDeniedException, WinFirewall.FirewallException {
/*  41 */     int profiles = 0;
/*  42 */     for (WinFirewall.ProfileType profileType : profileTypes) {
/*  43 */       switch (profileType) {
/*     */         case INCOMING:
/*  45 */           profiles |= 0x1;
/*     */         
/*     */         case OUTGOING:
/*  48 */           profiles |= 0x2;
/*     */         
/*     */         case null:
/*  51 */           profiles |= 0x4;
/*     */       } 
/*     */     
/*     */     } 
/*  55 */     int activeProfiles = -1;
/*  56 */     if (onlyActiveProfiles) {
/*  57 */       activeProfiles = getCurrentProfileTypes();
/*  58 */       profiles &= activeProfiles;
/*     */     } 
/*  60 */     if (avoidPublicProfile) {
/*  61 */       if (activeProfiles == -1) {
/*  62 */         activeProfiles = getCurrentProfileTypes();
/*     */       }
/*  64 */       if (activeProfiles != 4) {
/*  65 */         profiles ^= 0x4;
/*     */       }
/*     */     } 
/*  68 */     return profiles;
/*     */   }
/*     */   
/*     */   public static int getCurrentProfileTypes() throws WinFirewall.AccessDeniedException, WinFirewall.FirewallException {
/*  72 */     if (!Util.isWindows()) {
/*  73 */       return 0;
/*     */     }
/*  75 */     initialize();
/*  76 */     long result = getCurrentProfileTypes0();
/*  77 */     int returnCode = (int)(result >> 32L);
/*  78 */     if (returnCode == 0) {
/*  79 */       return (int)(result & 0xFFFFFFFFFFFFFFFFL);
/*     */     }
/*  81 */     return ((Integer)throwFirewallException(returnCode)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean addRule(String executablePath, String ruleName, String groupName, WinFirewall.RuleDirection ruleDirection, WinFirewall.NetworkProtocol networkProtocol, String description, String localPorts, String localAddresses, String remotePorts, String remoteAddresses, int profiles, boolean enabled) throws WinFirewall.AccessDeniedException, WinFirewall.FirewallException {
/*  86 */     if (!Util.isWindows()) {
/*  87 */       return false;
/*     */     }
/*  89 */     initialize();
/*  90 */     int returnCode = addRule0(executablePath, ruleName, groupName, getRuleDirection(ruleDirection), getNetworkProtocol(networkProtocol), description, fill(localPorts), fill(localAddresses), fill(remotePorts), fill(remoteAddresses), profiles, enabled);
/*  91 */     if (returnCode == 0)
/*  92 */       return true; 
/*  93 */     if (returnCode == -1) {
/*  94 */       return false;
/*     */     }
/*  96 */     return ((Boolean)throwFirewallException(returnCode)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public static int deleteRules(String executablePath, String ruleName, String groupName, WinFirewall.RuleDirection ruleDirection, WinFirewall.NetworkProtocol networkProtocol, String description, String localPorts, String localAddresses, String remotePorts, String remoteAddresses) throws WinFirewall.AccessDeniedException, WinFirewall.FirewallException {
/* 101 */     if (!Util.isWindows()) {
/* 102 */       return 0;
/*     */     }
/* 104 */     initialize();
/* 105 */     int returnCode = deleteRules0(executablePath, ruleName, groupName, getRuleDirection(ruleDirection), getNetworkProtocol(networkProtocol), description, localPorts, localAddresses, remotePorts, remoteAddresses);
/* 106 */     if (returnCode <= 0) {
/* 107 */       return -returnCode;
/*     */     }
/* 109 */     return ((Integer)throwFirewallException(returnCode)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T> T throwFirewallException(int returnCode) throws WinFirewall.AccessDeniedException, WinFirewall.FirewallException {
/* 114 */     if (returnCode == 1)
/* 115 */       throw new WinFirewall.AccessDeniedException(); 
/* 116 */     if (returnCode >= 500) {
/* 117 */       throw new WinFirewall.FirewallException("Invalid property value. (location: " + returnCode + ")");
/*     */     }
/* 119 */     throw new WinFirewall.FirewallException("firewall error " + returnCode);
/*     */   }
/*     */ 
/*     */   
/*     */   private static String fill(String str) {
/* 124 */     return (str == null) ? "" : str;
/*     */   }
/*     */   
/*     */   private static int getNetworkProtocol(WinFirewall.NetworkProtocol networkProtocol) {
/* 128 */     if (networkProtocol == null) {
/* 129 */       return 0;
/*     */     }
/* 131 */     switch (networkProtocol) {
/*     */       case INCOMING:
/* 133 */         return 6;
/*     */       case OUTGOING:
/* 135 */         return 17;
/*     */     } 
/* 137 */     throw new RuntimeException("unknown " + networkProtocol);
/*     */   }
/*     */   
/*     */   private static int getRuleDirection(WinFirewall.RuleDirection ruleDirection) {
/* 141 */     if (ruleDirection == null) {
/* 142 */       return 0;
/*     */     }
/* 144 */     switch (ruleDirection) {
/*     */       case INCOMING:
/* 146 */         return 1;
/*     */       case OUTGOING:
/* 148 */         return 2;
/*     */     } 
/* 150 */     throw new RuntimeException("unknown " + ruleDirection);
/*     */   }
/*     */   
/*     */   public static EnumSet<WinFirewall.ProfileType> translate(int profiles) {
/* 154 */     EnumSet<WinFirewall.ProfileType> ret = EnumSet.noneOf(WinFirewall.ProfileType.class);
/* 155 */     if ((profiles & 0x1) != 0) {
/* 156 */       ret.add(WinFirewall.ProfileType.DOMAIN);
/*     */     }
/* 158 */     if ((profiles & 0x2) != 0) {
/* 159 */       ret.add(WinFirewall.ProfileType.PRIVATE);
/*     */     }
/* 161 */     if ((profiles & 0x4) != 0) {
/* 162 */       ret.add(WinFirewall.ProfileType.PUBLIC);
/*     */     }
/* 164 */     return ret;
/*     */   }
/*     */   
/*     */   private static synchronized native void initialize0();
/*     */   
/*     */   private static native int addRule0(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt3, boolean paramBoolean);
/*     */   
/*     */   private static native int deleteRules0(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8);
/*     */   
/*     */   private static native long getCurrentProfileTypes0();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32Firewall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */