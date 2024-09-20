/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.platform.win32.wininet.IgnoreCaseString;
/*     */ import com.install4j.runtime.installer.platform.win32.wininet.WinInet;
/*     */ import com.install4j.runtime.installer.platform.win32.wininet.WinInetAuthenticator;
/*     */ import com.install4j.runtime.installer.platform.win32.wininet.WinInetCall;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.Serializable;
/*     */ import java.net.PasswordAuthentication;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Supplier;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class WinInetCallWrapper extends AbstractHttpConnectionWrapper {
/*  24 */   private static Map<SchemeAndHost, UserNameAndPassword> lastServerCredentials = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*     */   private static volatile UserNameAndPassword lastProxyCredentials;
/*     */   
/*     */   private int mode;
/*     */   private boolean followRedirects = true;
/*     */   private WinInetCall winInetCall;
/*  31 */   private static volatile WinInet.ProxyConfig proxyConfig = null;
/*     */   
/*     */   public static void setProxyConfig(WinInet.ProxyConfig proxyConfig) {
/*  34 */     WinInetCallWrapper.proxyConfig = proxyConfig;
/*     */   }
/*     */   
/*     */   public WinInetCallWrapper(URL url, boolean acceptAllCertificates, int mode) {
/*  38 */     super(url, acceptAllCertificates);
/*  39 */     this.mode = mode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void connect() throws IOException {
/*  44 */     if (this.winInetCall != null) {
/*     */       return;
/*     */     }
/*  47 */     String userAgent = getRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64)");
/*     */     
/*  49 */     HashMap<IgnoreCaseString, List<String>> usedRequestHeaders = new HashMap<>(getRequestHeaders().size());
/*  50 */     IgnoreCaseString userAgentKeyName = new IgnoreCaseString("User-Agent");
/*  51 */     for (Map.Entry<IgnoreCaseString, List<String>> entry : getRequestHeaders().entrySet()) {
/*  52 */       if (!((IgnoreCaseString)entry.getKey()).equals(userAgentKeyName)) {
/*  53 */         usedRequestHeaders.put(entry.getKey(), new ArrayList<>(entry.getValue()));
/*     */       }
/*     */     } 
/*     */     
/*  57 */     WinInetAuthenticator authenticator = createAuthenticator(new SchemeAndHost(getURL().getProtocol(), getURL().getHost()));
/*  58 */     this.winInetCall = WinInet.open(userAgent, getURL().toExternalForm(), usedRequestHeaders, getRequestMethod(), getPostContentLength(), isAcceptAllCertificates(), getConnectTimeout(), getReadTimeout(), this.followRedirects, proxyConfig, authenticator);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private WinInetAuthenticator createAuthenticator(SchemeAndHost schemeAndHost) {
/*  63 */     long hwnd = 0L;
/*  64 */     if (this.mode == 1 && !HelperCommunication.getInstance().isElevatedHelper()) {
/*  65 */       hwnd = WinGuiHelper.getHwnd(GUIHelper.getParentWindow());
/*     */     }
/*  67 */     WinInetAuthenticator authenticator = new WinInetAuthenticator(hwnd);
/*  68 */     setProxySupplier(authenticator);
/*  69 */     setServerSupplier(authenticator, schemeAndHost);
/*  70 */     return authenticator;
/*     */   }
/*     */   
/*     */   private void setProxySupplier(WinInetAuthenticator authenticator) {
/*  74 */     String proxyUser = System.getProperty("proxyAuthUser");
/*  75 */     String proxyPassword = System.getProperty("proxyAuthPassword");
/*  76 */     if (proxyUser != null && !proxyUser.isEmpty() && proxyPassword != null) {
/*  77 */       authenticator.setProxySupplier(() -> new PasswordAuthentication(proxyUser, proxyPassword.toCharArray()));
/*  78 */     } else if (this.mode == 2) {
/*  79 */       authenticator.setProxySupplier(new Supplier<PasswordAuthentication>() {
/*     */             boolean first = true;
/*     */             
/*     */             public PasswordAuthentication get() {
/*     */               try {
/*  84 */                 String user = (WinInetCallWrapper.lastProxyCredentials != null) ? WinInetCallWrapper.lastProxyCredentials.userName : null;
/*  85 */                 String password = (WinInetCallWrapper.lastProxyCredentials != null) ? WinInetCallWrapper.lastProxyCredentials.password : null;
/*  86 */                 if (this.first && user != null && password != null) {
/*  87 */                   return new PasswordAuthentication(user, password.toCharArray());
/*     */                 }
/*  89 */                 UserNameAndPassword userNameAndPassword = HttpAuthenticator.askForCredentialsConsole(HttpAuthenticator.AuthenticationType.PROXY, null);
/*  90 */                 WinInetCallWrapper.lastProxyCredentials = userNameAndPassword;
/*  91 */                 return userNameAndPassword.toPasswordAuthentication();
/*     */               } finally {
/*     */                 
/*  94 */                 this.first = false;
/*     */               } 
/*     */             }
/*     */           });
/*  98 */     } else if (this.mode == 3) {
/*  99 */       authenticator.setProxySupplier(() -> null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setServerSupplier(WinInetAuthenticator authenticator, final SchemeAndHost schemeAndHost) {
/* 104 */     String serverUser = System.getProperty("serverAuthUser");
/* 105 */     String serverPassword = System.getProperty("serverAuthPassword");
/* 106 */     if (serverUser != null && !serverUser.isEmpty() && serverPassword != null) {
/* 107 */       authenticator.setServerSupplier(() -> new PasswordAuthentication(serverUser, serverPassword.toCharArray()));
/* 108 */     } else if (this.mode == 2) {
/* 109 */       authenticator.setServerSupplier(new Supplier<PasswordAuthentication>() {
/*     */             boolean first = true;
/*     */             
/*     */             public PasswordAuthentication get() {
/*     */               try {
/* 114 */                 UserNameAndPassword lastCredentials = (UserNameAndPassword)WinInetCallWrapper.lastServerCredentials.get(schemeAndHost);
/* 115 */                 String user = (lastCredentials != null) ? lastCredentials.userName : null;
/* 116 */                 String password = (lastCredentials != null) ? lastCredentials.password : null;
/* 117 */                 if (this.first && user != null && password != null) {
/* 118 */                   return new PasswordAuthentication(user, password.toCharArray());
/*     */                 }
/* 120 */                 UserNameAndPassword userNameAndPassword = HttpAuthenticator.askForCredentialsConsole(HttpAuthenticator.AuthenticationType.SERVER, schemeAndHost.host);
/* 121 */                 WinInetCallWrapper.lastServerCredentials.put(schemeAndHost, userNameAndPassword);
/* 122 */                 return userNameAndPassword.toPasswordAuthentication();
/*     */               } finally {
/*     */                 
/* 125 */                 this.first = false;
/*     */               } 
/*     */             }
/*     */           });
/* 129 */     } else if (this.mode == 3) {
/* 130 */       authenticator.setServerSupplier(() -> null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream getInputStream() throws IOException {
/* 136 */     checkConnectedAndFound();
/* 137 */     return this.winInetCall.getInputStream();
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream getErrorStream() throws IOException {
/* 142 */     checkConnected();
/* 143 */     return this.winInetCall.getInputStream();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getResponseCode() throws IOException {
/* 148 */     checkConnected();
/* 149 */     return this.winInetCall.getResponseCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getHeaderFields() {
/* 154 */     checkConnected();
/* 155 */     return this.winInetCall.getAllHeaders();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getHeaderField(String key) {
/* 160 */     return this.winInetCall.getLastHeader(key);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFollowRedirects(boolean value) {
/* 165 */     this.followRedirects = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public OutputStream getOutputStream() throws IOException {
/* 170 */     if (this.winInetCall == null) {
/* 171 */       connect();
/*     */     }
/* 173 */     return this.winInetCall.getOutputStream();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getConnectTimeout() {
/* 178 */     return replaceDefaultTimeout(super.getConnectTimeout());
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getReadTimeout() {
/* 183 */     return replaceDefaultTimeout(super.getReadTimeout());
/*     */   }
/*     */   
/*     */   private int replaceDefaultTimeout(int timeout) {
/* 187 */     if (timeout <= 0) {
/* 188 */       return -2;
/*     */     }
/* 190 */     return timeout;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 196 */     WinInetCall winInetCall = this.winInetCall;
/* 197 */     if (winInetCall != null) {
/* 198 */       winInetCall.close();
/*     */     }
/*     */   }
/*     */   
/*     */   private String getRequestHeader(String key, String defaultValue) {
/* 203 */     List<String> values = getRequestHeaders().get(new IgnoreCaseString(key));
/* 204 */     if (values != null && values.size() > 0) {
/* 205 */       return values.get(0);
/*     */     }
/* 207 */     return defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkConnected() {
/* 213 */     if (this.winInetCall == null)
/* 214 */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public static class SchemeAndHost
/*     */     implements Serializable {
/*     */     private final String scheme;
/*     */     private final String host;
/*     */     
/*     */     public SchemeAndHost(String scheme, String host) {
/* 223 */       this.scheme = scheme;
/* 224 */       this.host = host;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 229 */       if (this == o) return true; 
/* 230 */       if (o == null || getClass() != o.getClass()) return false;
/*     */       
/* 232 */       SchemeAndHost that = (SchemeAndHost)o;
/*     */       
/* 234 */       if (!Objects.equals(this.scheme, that.scheme)) return false; 
/* 235 */       if (!Objects.equals(this.host, that.host)) return false;
/*     */       
/* 237 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 242 */       int result = (this.scheme != null) ? this.scheme.hashCode() : 0;
/* 243 */       result = 31 * result + ((this.host != null) ? this.host.hashCode() : 0);
/* 244 */       return result;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\WinInetCallWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */