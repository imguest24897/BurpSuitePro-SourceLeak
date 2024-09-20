/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.Authenticator;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.security.SecureRandom;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.util.Map;
/*     */ import javax.net.ssl.HostnameVerifier;
/*     */ import javax.net.ssl.HttpsURLConnection;
/*     */ import javax.net.ssl.SSLContext;
/*     */ import javax.net.ssl.SSLSession;
/*     */ import javax.net.ssl.SSLSocketFactory;
/*     */ import javax.net.ssl.TrustManager;
/*     */ import javax.net.ssl.X509TrustManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class UrlConnectionWrapper implements JavaHttpConnection {
/*     */   private final URLConnection connection;
/*     */   
/*     */   public UrlConnectionWrapper(URL url, @NotNull Proxy proxy, boolean acceptAllCertificates) throws IOException {
/*  26 */     Authenticator.setDefault(HttpAuthenticator.getInstance());
/*  27 */     if (acceptAllCertificates && Objects.equals(url.getProtocol(), "https")) {
/*  28 */       this.sslResetter = acceptAllCertificates();
/*     */     }
/*  30 */     this.proxy = proxy;
/*  31 */     this.connection = url.openConnection(proxy);
/*     */   }
/*     */   private Proxy proxy; private Runnable sslResetter;
/*     */   
/*     */   @NotNull
/*     */   public Proxy getProxy() {
/*  37 */     return this.proxy;
/*     */   }
/*     */ 
/*     */   
/*     */   public void connect() throws IOException {
/*  42 */     this.connection.connect();
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream getInputStream() throws IOException {
/*  47 */     return this.connection.getInputStream();
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream getErrorStream() throws IOException {
/*  52 */     if (this.connection instanceof HttpURLConnection) {
/*  53 */       HttpURLConnection httpURLConnection = (HttpURLConnection)this.connection;
/*  54 */       httpURLConnection.getResponseCode();
/*  55 */       InputStream errorStream = httpURLConnection.getErrorStream();
/*  56 */       if (errorStream != null) {
/*  57 */         return errorStream;
/*     */       }
/*     */     } 
/*  60 */     return this.connection.getInputStream();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getResponseCode() throws IOException {
/*     */     try {
/*  66 */       if (this.connection instanceof HttpURLConnection) {
/*  67 */         return ((HttpURLConnection)this.connection).getResponseCode();
/*     */       }
/*  69 */       return 200;
/*     */     } finally {
/*     */       
/*  72 */       if (this.sslResetter != null) {
/*  73 */         this.sslResetter.run();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getHeaderFields() {
/*  80 */     return this.connection.getHeaderFields();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getHeaderField(String key) {
/*  85 */     return this.connection.getHeaderField(key);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContentEncoding() {
/*  90 */     return this.connection.getContentEncoding();
/*     */   }
/*     */ 
/*     */   
/*     */   public URL getURL() {
/*  95 */     return this.connection.getURL();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContentType() {
/* 100 */     return this.connection.getContentType();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRequestMethod(String requestMethod) throws ProtocolException {
/* 105 */     if (this.connection instanceof HttpURLConnection) {
/* 106 */       ((HttpURLConnection)this.connection).setRequestMethod(requestMethod);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFollowRedirects(boolean value) {
/* 112 */     if (this.connection instanceof HttpURLConnection) {
/* 113 */       ((HttpURLConnection)this.connection).setInstanceFollowRedirects(value);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRequestProperty(String key, String value) {
/* 119 */     this.connection.setRequestProperty(key, value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addRequestProperty(String key, String value) {
/* 124 */     this.connection.addRequestProperty(key, value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDoOutput(long contentLength) {
/* 129 */     this.connection.setRequestProperty("Content-Length", String.valueOf(contentLength));
/* 130 */     this.connection.setDoOutput(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public OutputStream getOutputStream() throws IOException {
/* 135 */     return this.connection.getOutputStream();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUseCaches(boolean useCaches) {
/* 140 */     this.connection.setUseCaches(useCaches);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setConnectTimeout(int timeout) {
/* 145 */     this.connection.setConnectTimeout(timeout);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setReadTimeout(int timeout) {
/* 150 */     this.connection.setReadTimeout(timeout);
/*     */   }
/*     */ 
/*     */   
/*     */   public long getContentLengthLong() {
/* 155 */     return this.connection.getContentLengthLong();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {}
/*     */ 
/*     */   
/*     */   private Runnable acceptAllCertificates() {
/* 163 */     SSLSocketFactory defaultSSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
/* 164 */     HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
/* 165 */     TrustManager[] trustAllCerts = { new X509TrustManager()
/*     */         {
/*     */           public X509Certificate[] getAcceptedIssuers()
/*     */           {
/* 169 */             return null;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void checkClientTrusted(X509Certificate[] certs, String authType) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public void checkServerTrusted(X509Certificate[] certs, String authType) {}
/*     */         } };
/* 181 */     HttpsURLConnection.setDefaultHostnameVerifier((s, sslSession) -> true);
/*     */     
/*     */     try {
/* 184 */       SSLContext sc = SSLContext.getInstance("TLS");
/* 185 */       sc.init(null, trustAllCerts, new SecureRandom());
/* 186 */       HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
/* 187 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/* 190 */     return () -> {
/*     */         HttpsURLConnection.setDefaultSSLSocketFactory(defaultSSLSocketFactory);
/*     */         HttpsURLConnection.setDefaultHostnameVerifier(defaultHostnameVerifier);
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\UrlConnectionWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */