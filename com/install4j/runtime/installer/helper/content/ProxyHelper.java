/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Proxy;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.Proxy;
/*     */ import java.net.ProxySelector;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class ProxyHelper {
/*     */   public static final String SYSPROP_PROXY_HOST = "proxyHost";
/*     */   
/*     */   @NotNull
/*     */   public static Proxy getProxyHostInfo(final URL url) {
/*  25 */     Proxy externalProxy = getExternalProxy(url.getProtocol().toLowerCase(Locale.ROOT));
/*  26 */     if (externalProxy != null) {
/*  27 */       return externalProxy;
/*     */     }
/*  29 */     if (!HelperCommunication.getUnelevatedBooleanProperty("install4j.noProxyAutoDetect")) {
/*  30 */       final boolean winSystem = !HelperCommunication.getUnelevatedBooleanProperty("install4j.winNoSystemProxy");
/*  31 */       final boolean winJava = !HelperCommunication.getUnelevatedBooleanProperty("install4j.winNoJavaProxy");
/*  32 */       ProxyHostInfo proxyHostInfo = (ProxyHostInfo)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<ProxyHostInfo>()
/*     */           {
/*     */             protected ProxyHostInfo fetchValue(Context context) throws Exception {
/*  35 */               if (InstallerUtil.isWindows()) {
/*  36 */                 if (winSystem) {
/*  37 */                   ProxyHostInfo proxyHostInfo = ProxyHelper.autoDetectWindowsProxy(url);
/*  38 */                   if (proxyHostInfo != null) {
/*  39 */                     return proxyHostInfo;
/*     */                   }
/*     */                 } 
/*  42 */                 if (winJava) {
/*  43 */                   ProxyHostInfo proxyHostInfo = ProxyHelper.autoDetectJavaProxy(url);
/*  44 */                   if (proxyHostInfo != null) {
/*  45 */                     return proxyHostInfo;
/*     */                   }
/*     */                 } 
/*  48 */                 return null;
/*     */               } 
/*  50 */               return ProxyHelper.autoDetectJavaProxy(url);
/*     */             }
/*     */           });
/*     */       
/*  54 */       if (proxyHostInfo != null) {
/*  55 */         return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHostInfo.getHost(), proxyHostInfo.getPort()));
/*     */       }
/*     */     } 
/*  58 */     return Proxy.NO_PROXY;
/*     */   }
/*     */   public static final String SYSPROP_PROXY_PORT = "proxyPort"; public static final String SYSPROP_DEBUG_PROXY = "install4j.debugProxy";
/*     */   @Nullable
/*     */   private static Proxy getExternalProxy(@NotNull String protocol) {
/*  63 */     String host = HelperCommunication.getUnelevatedProperty("proxyHost");
/*  64 */     if (host == null) {
/*  65 */       host = HelperCommunication.getUnelevatedProperty(protocol + "." + "proxyHost");
/*     */     }
/*  67 */     if (host != null) {
/*  68 */       String portText = HelperCommunication.getUnelevatedProperty("proxyPort");
/*  69 */       if (portText == null) {
/*  70 */         portText = HelperCommunication.getUnelevatedProperty(protocol + "." + "proxyPort");
/*     */       }
/*  72 */       int port = parsePort(portText, protocol.equals("http") ? 80 : 443);
/*  73 */       return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
/*     */     } 
/*  75 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int parsePort(@Nullable String portText, int defaultValue) {
/*  80 */     if (portText != null) {
/*     */       try {
/*  82 */         return Integer.parseInt(portText);
/*  83 */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*  86 */     return defaultValue;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static ProxyHostInfo autoDetectWindowsProxy(URL url) {
/*  91 */     String host = url.getHost().toLowerCase(Locale.ENGLISH);
/*  92 */     if (host.equals("localhost") || host.equals("127.0.0.1")) {
/*  93 */       return null;
/*     */     }
/*     */     try {
/*  96 */       return Win32Proxy.getProxyHostInfo(url);
/*  97 */     } catch (Throwable t) {
/*  98 */       Logger.getInstance().log(t);
/*  99 */       t.printStackTrace();
/* 100 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static ProxyHostInfo autoDetectJavaProxy(URL url) {
/*     */     try {
/* 107 */       List<Proxy> proxies = ProxySelector.getDefault().select(url.toURI());
/* 108 */       if (Boolean.getBoolean("install4j.debugProxy")) {
/* 109 */         System.err.println("Detected proxies = " + proxies);
/*     */       }
/* 111 */       if (proxies != null && proxies.size() > 0) {
/* 112 */         Proxy proxy = proxies.get(0);
/* 113 */         SocketAddress address = proxy.address();
/* 114 */         if (address instanceof InetSocketAddress) {
/* 115 */           InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
/* 116 */           return new ProxyHostInfo(inetSocketAddress.getHostName(), inetSocketAddress.getPort());
/*     */         } 
/*     */       } 
/* 119 */     } catch (URISyntaxException uRISyntaxException) {}
/*     */     
/* 121 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\ProxyHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */