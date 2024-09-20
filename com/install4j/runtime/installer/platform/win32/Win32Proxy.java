/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.ProxyHostInfo;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ public class Win32Proxy {
/*  13 */   private static final boolean DEBUG = Boolean.getBoolean("install4j.debugPAC"); private static final int WINHTTP_AUTOPROXY_AUTO_DETECT = 1; private static final int WINHTTP_AUTOPROXY_CONFIG_URL = 2; private static final int WINHTTP_AUTOPROXY_HOST_KEEPCASE = 4; private static final int WINHTTP_AUTOPROXY_HOST_LOWERCASE = 8; private static final int WINHTTP_AUTOPROXY_RUN_INPROCESS = 65536; private static final int WINHTTP_AUTOPROXY_RUN_OUTPROCESS_ONLY = 131072;
/*     */   
/*     */   static {
/*  16 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int WINHTTP_AUTOPROXY_NO_DIRECTACCESS = 262144;
/*     */ 
/*     */   
/*     */   private static final int WINHTTP_AUTOPROXY_NO_CACHE_CLIENT = 524288;
/*     */ 
/*     */   
/*     */   private static final int WINHTTP_AUTOPROXY_NO_CACHE_SVC = 1048576;
/*     */ 
/*     */   
/*     */   private static final int WINHTTP_AUTOPROXY_SORT_RESULTS = 4194304;
/*     */ 
/*     */   
/*     */   private static final int WINHTTP_AUTO_DETECT_TYPE_DHCP = 1;
/*     */ 
/*     */   
/*     */   private static final int WINHTTP_AUTO_DETECT_TYPE_DNS_A = 2;
/*     */   
/*     */   private static boolean functionLoaded;
/*     */ 
/*     */   
/*     */   private static synchronized boolean loadFunctions() {
/*  42 */     if (!functionLoaded) {
/*  43 */       if (loadFunctions0()) {
/*  44 */         functionLoaded = true;
/*     */       } else {
/*  46 */         System.err.println("could not load proxy functions");
/*     */       } 
/*     */     }
/*  49 */     return functionLoaded;
/*     */   }
/*     */   
/*     */   public static ProxyHostInfo getProxyHostInfo(URL url) throws Exception {
/*  53 */     if (!loadFunctions()) {
/*  54 */       return null;
/*     */     }
/*     */     
/*  57 */     IEProxyConfig ieProxyConfig = getIEConfig();
/*  58 */     if (ieProxyConfig != null) {
/*  59 */       if (ieProxyConfig.isProxySet())
/*  60 */         return ieProxyConfig.getProxyHostInfo(url); 
/*  61 */       if (ieProxyConfig.isAutoDetect() || ieProxyConfig.getAutoConfigUrl() != null) {
/*  62 */         return getAutoProxyHostInfo(url, ieProxyConfig.getAutoConfigUrl());
/*     */       }
/*  64 */       return null;
/*     */     } 
/*     */     
/*  67 */     ProxyConfig defaultConfig = getDefaultConfig();
/*  68 */     if (defaultConfig != null && defaultConfig.isProxySet())
/*  69 */       return defaultConfig.getProxyHostInfo(url); 
/*  70 */     if (Boolean.getBoolean("install4j.proxyAutoDetectionFallback")) {
/*  71 */       return getAutoProxyHostInfo(url, null);
/*     */     }
/*  73 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static ProxyHostInfo getAutoProxyHostInfo(URL url, String autoConfigUrl) {
/*  79 */     ProxyConfig autoProxyConfig = getAutoProxyConfig(url.toExternalForm(), autoConfigUrl);
/*  80 */     return (autoProxyConfig == null) ? null : autoProxyConfig.getProxyHostInfo(url);
/*     */   }
/*     */   
/*     */   private static ProxyConfig getDefaultConfig() {
/*  84 */     String[] data = new String[3];
/*  85 */     int error = getDefaultConfig0(data);
/*  86 */     ProxyConfig proxyConfig = null;
/*  87 */     if (error == 0) {
/*  88 */       proxyConfig = new ProxyConfig(data);
/*     */     }
/*  90 */     if (DEBUG) {
/*  91 */       Logger.getDebugInstance().info(null, "default proxy config (error " + error + "): " + proxyConfig);
/*     */     }
/*  93 */     return proxyConfig;
/*     */   }
/*     */   
/*     */   private static IEProxyConfig getIEConfig() {
/*  97 */     IEProxyConfig ieProxyConfig = null;
/*  98 */     if (!Boolean.getBoolean("install4j.proxyForceDefault")) {
/*  99 */       String[] data = new String[4];
/* 100 */       int error = getIEConfig0(data);
/* 101 */       if (error == 0) {
/* 102 */         ieProxyConfig = new IEProxyConfig(data);
/*     */       }
/* 104 */       if (DEBUG) {
/* 105 */         Logger.getDebugInstance().info(null, "IE proxy config (error " + error + "): " + ieProxyConfig);
/*     */       }
/*     */     } 
/* 108 */     return ieProxyConfig;
/*     */   }
/*     */ 
/*     */   
/*     */   private static ProxyConfig getAutoProxyConfig(String url, String pacUrl) {
/*     */     int flags, autoDetectFlags;
/* 114 */     if (pacUrl != null) {
/* 115 */       flags = 2;
/* 116 */       autoDetectFlags = 0;
/*     */     } else {
/* 118 */       flags = 1;
/* 119 */       autoDetectFlags = Integer.getInteger("install4j.proxyAutoDetectFlags", 3).intValue();
/*     */     } 
/* 121 */     flags |= Integer.getInteger("install4j.proxyAdditionalFlags", 0).intValue();
/*     */     
/* 123 */     String[] data = new String[3];
/* 124 */     long error = getAutoProxyConfig0(data, url, pacUrl, flags, autoDetectFlags, true);
/* 125 */     ProxyConfig autoProxyConfig = null;
/* 126 */     if (error == 0L) {
/* 127 */       autoProxyConfig = new ProxyConfig(data);
/*     */     }
/* 129 */     if (DEBUG) {
/* 130 */       Logger.getDebugInstance().info(null, "Auto proxy config (error " + Long.toHexString(error) + "): " + autoProxyConfig + ", flags " + flags + ", " + autoDetectFlags + ", url " + url + ", pac " + pacUrl);
/*     */     }
/* 132 */     return autoProxyConfig;
/*     */   }
/*     */   private static native int getIEConfig0(String[] paramArrayOfString);
/*     */   private static native int getDefaultConfig0(String[] paramArrayOfString);
/*     */   private static native long getAutoProxyConfig0(String[] paramArrayOfString, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean);
/*     */   private static native boolean loadFunctions0();
/*     */   private static class IEProxyConfig extends BaseProxyConfig { private final boolean autoDetect;
/*     */     public IEProxyConfig(String[] data) {
/* 140 */       super(data[2], data[3]);
/* 141 */       this.autoDetect = Boolean.parseBoolean(data[0]);
/* 142 */       this.autoConfigUrl = data[1];
/*     */     }
/*     */     private final String autoConfigUrl;
/*     */     public boolean isAutoDetect() {
/* 146 */       return this.autoDetect;
/*     */     }
/*     */     
/*     */     public String getAutoConfigUrl() {
/* 150 */       return this.autoConfigUrl;
/*     */     }
/*     */ 
/*     */     
/*     */     public ProxyHostInfo getProxyHostInfo(URL url) {
/* 155 */       return super.getProxyHostInfo(url);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 160 */       return "IEProxyConfig{autoDetect=" + this.autoDetect + ", autoConfigUrl='" + this.autoConfigUrl + '\'' + ", proxy='" + this.proxy + '\'' + ", proxyBypass='" + this.proxyBypass + '\'' + '}';
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static class ProxyConfig
/*     */     extends BaseProxyConfig
/*     */   {
/*     */     private final boolean proxySet;
/*     */ 
/*     */     
/*     */     public ProxyConfig(String[] data) {
/* 173 */       super(data[1], data[2]);
/* 174 */       this.proxySet = Boolean.parseBoolean(data[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isProxySet() {
/* 179 */       return (this.proxySet && super.isProxySet());
/*     */     }
/*     */ 
/*     */     
/*     */     public ProxyHostInfo getProxyHostInfo(URL url) {
/* 184 */       if (this.proxySet) {
/* 185 */         return super.getProxyHostInfo(url);
/*     */       }
/* 187 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 193 */       return "ProxyConfig{proxySet=" + this.proxySet + ", proxy='" + this.proxy + '\'' + ", proxyBypass=" + this.proxyBypass + '}';
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static abstract class BaseProxyConfig
/*     */   {
/*     */     protected final String proxy;
/*     */     
/*     */     protected final List<String> proxyBypass;
/*     */ 
/*     */     
/*     */     public BaseProxyConfig(String proxy, String bypassString) {
/* 206 */       this.proxy = proxy;
/* 207 */       this.proxyBypass = parseProxyBypass(bypassString);
/*     */     }
/*     */     
/*     */     public boolean isProxySet() {
/* 211 */       return (this.proxy != null);
/*     */     }
/*     */     
/*     */     public ProxyHostInfo getProxyHostInfo(URL url) {
/* 215 */       if (this.proxy == null || isBypassed(url, this.proxyBypass)) {
/* 216 */         return null;
/*     */       }
/* 218 */       return getProxyHostInfo(url.getProtocol(), this.proxy);
/*     */     }
/*     */     
/*     */     private static ProxyHostInfo getProxyHostInfo(String protocol, String proxy) {
/*     */       String host;
/* 223 */       if (!Objects.equals("http", protocol) && !Objects.equals("https", protocol) && !Objects.equals("ftp", protocol)) {
/* 224 */         protocol = "http";
/*     */       }
/* 226 */       proxy = findForProtocol(protocol, proxy);
/*     */       
/* 228 */       int port = 80;
/*     */       
/*     */       try {
/* 231 */         URL url = new URL(proxy);
/* 232 */         host = url.getHost();
/* 233 */         port = url.getPort();
/* 234 */       } catch (MalformedURLException var12) {
/* 235 */         int colonIndex = proxy.indexOf(":");
/* 236 */         if (colonIndex == -1) {
/* 237 */           host = proxy;
/*     */         } else {
/* 239 */           host = proxy.substring(0, colonIndex);
/*     */           try {
/* 241 */             port = Integer.parseInt(proxy.substring(colonIndex + 1));
/* 242 */           } catch (NumberFormatException e) {
/* 243 */             e.printStackTrace();
/*     */           } 
/*     */         } 
/*     */       } 
/* 247 */       ProxyHostInfo proxyHostInfo = new ProxyHostInfo(host, port);
/* 248 */       if (Win32Proxy.DEBUG) {
/* 249 */         Logger.getDebugInstance().info(null, "Using proxy " + proxy + " for " + protocol + ": " + proxyHostInfo);
/*     */       }
/* 251 */       return proxyHostInfo;
/*     */     }
/*     */     
/*     */     private static String findForProtocol(String protocol, String proxy) {
/* 255 */       proxy = proxy.replace(' ', ';');
/* 256 */       if (!proxy.contains("=")) {
/* 257 */         int delimiterIndex = proxy.indexOf(';');
/* 258 */         if (delimiterIndex > -1) {
/* 259 */           return proxy.substring(0, delimiterIndex);
/*     */         }
/* 261 */         return proxy;
/*     */       } 
/*     */       
/* 264 */       StringTokenizer tokenizer = new StringTokenizer(proxy, ";");
/* 265 */       String httpProxy = null;
/* 266 */       while (tokenizer.hasMoreTokens()) {
/* 267 */         String singleProxy = tokenizer.nextToken();
/* 268 */         if (singleProxy.startsWith(protocol + "="))
/* 269 */           return singleProxy.substring(protocol.length() + 1); 
/* 270 */         if (singleProxy.startsWith("http=")) {
/* 271 */           httpProxy = singleProxy.substring(5);
/*     */         }
/*     */       } 
/* 274 */       return httpProxy;
/*     */     }
/*     */ 
/*     */     
/*     */     private static List<String> parseProxyBypass(String string) {
/* 279 */       List<String> list = new ArrayList<>();
/* 280 */       if (string != null) {
/* 281 */         StringTokenizer tokenizer = new StringTokenizer(string, " ;");
/* 282 */         while (tokenizer.hasMoreTokens()) {
/* 283 */           String singleValue = tokenizer.nextToken().toLowerCase(Locale.ENGLISH).trim();
/* 284 */           if (singleValue.length() > 0) {
/* 285 */             list.add(singleValue);
/*     */           }
/*     */         } 
/*     */       } 
/* 289 */       return list;
/*     */     }
/*     */     
/*     */     private static boolean isBypassed(URL url, List<String> proxyBypass) {
/* 293 */       if (url != null && proxyBypass != null) {
/* 294 */         String host = url.getHost().toLowerCase(Locale.ENGLISH);
/* 295 */         for (String override : proxyBypass) {
/* 296 */           override = override.toLowerCase(Locale.ENGLISH);
/* 297 */           if (override.length() > 0) {
/* 298 */             if (Objects.equals(override, "<local>")) {
/* 299 */               if (!host.contains(".")) {
/* 300 */                 if (Win32Proxy.DEBUG) {
/* 301 */                   Logger.getDebugInstance().info(null, "Proxy bypass: " + host + ", " + override);
/*     */                 }
/* 303 */                 return true;
/*     */               }  continue;
/* 305 */             }  if (override.startsWith("*")) {
/* 306 */               override = override.replace('*', ' ').trim();
/* 307 */               if (host.endsWith(override.toLowerCase(Locale.ENGLISH))) {
/* 308 */                 if (Win32Proxy.DEBUG) {
/* 309 */                   Logger.getDebugInstance().info(null, "Proxy bypass: " + host + ", " + override);
/*     */                 }
/* 311 */                 return true;
/*     */               }  continue;
/* 313 */             }  if (Objects.equals(host, override)) {
/* 314 */               if (Win32Proxy.DEBUG) {
/* 315 */                 Logger.getDebugInstance().info(null, "Proxy bypass: " + host + ", " + override);
/*     */               }
/* 317 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 322 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32Proxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */