/*     */ package com.install4j.runtime.installer.helper.versionspecific;
/*     */ import com.install4j.runtime.installer.helper.content.HttpAuthenticator;
/*     */ import com.install4j.runtime.installer.helper.content.UserNameAndPassword;
/*     */ import com.install4j.runtime.installer.platform.win32.wininet.IgnoreCaseString;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.Authenticator;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Proxy;
/*     */ import java.net.ProxySelector;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.net.http.HttpClient;
/*     */ import java.net.http.HttpRequest;
/*     */ import java.net.http.HttpResponse;
/*     */ import java.security.cert.CertificateException;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.time.Duration;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.net.ssl.SSLContext;
/*     */ import javax.net.ssl.SSLEngine;
/*     */ import javax.net.ssl.TrustManager;
/*     */ import javax.net.ssl.X509ExtendedTrustManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class HttpClientWrapper extends AbstractHttpConnectionWrapper implements JavaHttpConnection {
/*     */   private Proxy proxy;
/*     */   private HttpResponse<InputStream> response;
/*     */   
/*     */   public HttpClientWrapper(URL url, Proxy proxy, boolean acceptAllCertificates) {
/*  37 */     super(url, acceptAllCertificates);
/*  38 */     this.proxy = proxy;
/*     */   }
/*     */   private PostOutputStream outputStream; private boolean followRedirects = true;
/*     */   
/*     */   public void connect() throws IOException {
/*  43 */     HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(getUri());
/*  44 */     int readTimeout = getReadTimeout();
/*  45 */     if (readTimeout >= 0) {
/*  46 */       requestBuilder.timeout(Duration.ofMillis(readTimeout));
/*     */     }
/*  48 */     requestBuilder.method(getRequestMethod(), createBodyPublisher());
/*  49 */     for (Map.Entry<IgnoreCaseString, List<String>> entry : (Iterable<Map.Entry<IgnoreCaseString, List<String>>>)getRequestHeaders().entrySet()) {
/*  50 */       List<String> values = entry.getValue();
/*  51 */       for (String value : values) {
/*     */         try {
/*  53 */           requestBuilder.header(((IgnoreCaseString)entry.getKey()).toString(), value);
/*  54 */         } catch (IllegalArgumentException illegalArgumentException) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  59 */     HttpRequest request = requestBuilder.build();
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
/*  72 */     HttpClient.Builder clientBuilder = HttpClient.newBuilder().proxy(new ProxySelector() { public List<Proxy> select(URI uri) { return Collections.singletonList(HttpClientWrapper.this.proxy); } public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {} }).authenticator(new AuthenticatorWrapper(HttpAuthenticator.getInstance()));
/*     */     
/*  74 */     if (isAcceptAllCertificates()) {
/*     */       try {
/*  76 */         SSLContext sslContext = SSLContext.getInstance("TLS");
/*  77 */         sslContext.init(null, new TrustManager[] { createAcceptAllTrustManager() }, new SecureRandom());
/*  78 */         clientBuilder.sslContext(sslContext);
/*  79 */       } catch (NoSuchAlgorithmException|java.security.KeyManagementException e) {
/*  80 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */     
/*  84 */     int connectTimeout = getConnectTimeout();
/*  85 */     if (connectTimeout >= 0) {
/*  86 */       clientBuilder.connectTimeout(Duration.ofMillis(connectTimeout));
/*     */     }
/*  88 */     clientBuilder.followRedirects(this.followRedirects ? HttpClient.Redirect.NORMAL : HttpClient.Redirect.NEVER);
/*  89 */     HttpClient client = clientBuilder.build();
/*     */     try {
/*  91 */       this.response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
/*  92 */     } catch (InterruptedException e) {
/*  93 */       throw new IOException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private HttpRequest.BodyPublisher createBodyPublisher() {
/*  99 */     if (getPostContentLength() > 0L) {
/* 100 */       if (this.outputStream == null) {
/* 101 */         throw new IllegalStateException("No output was written");
/*     */       }
/* 103 */       return HttpRequest.BodyPublishers.ofInputStream(() -> new ByteArrayInputStream(this.outputStream.toByteArray()));
/*     */     } 
/* 105 */     return HttpRequest.BodyPublishers.noBody();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static TrustManager createAcceptAllTrustManager() {
/* 111 */     return new X509ExtendedTrustManager()
/*     */       {
/*     */         public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
/*     */ 
/*     */ 
/*     */         
/*     */         public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
/*     */ 
/*     */ 
/*     */         
/*     */         public X509Certificate[] getAcceptedIssuers() {
/* 122 */           return null;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public void checkClientTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {}
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public void checkServerTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {}
/*     */ 
/*     */ 
/*     */         
/*     */         public void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {}
/*     */ 
/*     */ 
/*     */         
/*     */         public void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {}
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private URI getUri() throws IOException {
/*     */     try {
/* 149 */       return getURL().toURI();
/* 150 */     } catch (URISyntaxException e) {
/* 151 */       throw new IOException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Proxy getProxy() {
/* 158 */     return this.proxy;
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream getInputStream() throws IOException {
/* 163 */     checkConnectedAndFound();
/* 164 */     return this.response.body();
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream getErrorStream() throws IOException {
/* 169 */     checkConnected();
/* 170 */     return this.response.body();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getResponseCode() throws IOException {
/* 175 */     checkConnected();
/* 176 */     return this.response.statusCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getHeaderFields() {
/* 181 */     checkConnected();
/* 182 */     return this.response.headers().map();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getHeaderField(String key) {
/* 187 */     checkConnected();
/* 188 */     return this.response.headers().firstValue(key).orElse(null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFollowRedirects(boolean value) {
/* 193 */     this.followRedirects = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public OutputStream getOutputStream() throws IOException {
/* 198 */     if (this.outputStream == null) {
/* 199 */       this.outputStream = new PostOutputStream();
/*     */     }
/* 201 */     return this.outputStream;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 206 */     if (this.response != null) {
/*     */       try {
/* 208 */         InputStream body = this.response.body();
/* 209 */         if (body != null) {
/* 210 */           body.close();
/*     */         }
/* 212 */       } catch (IOException iOException) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkConnected() {
/* 219 */     if (this.response == null) {
/* 220 */       throw new IllegalStateException();
/*     */     }
/*     */   }
/*     */   
/*     */   private static int getByteArrayLength(long contentLength) throws IOException {
/* 225 */     if (contentLength > 2147483647L) {
/* 226 */       throw new IOException("maximum content length is 2147483647");
/*     */     }
/* 228 */     return (int)contentLength;
/*     */   }
/*     */   
/*     */   private class PostOutputStream extends ByteArrayOutputStream {
/*     */     public PostOutputStream() throws IOException {
/* 233 */       super(HttpClientWrapper.getByteArrayLength(HttpClientWrapper.this.getPostContentLength()));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class AuthenticatorWrapper extends Authenticator {
/* 238 */     private static final Object LOCK = new Object();
/*     */     
/*     */     private final HttpAuthenticator authenticator;
/* 241 */     private ThreadLocal<Boolean> firstRequest = ThreadLocal.withInitial(() -> Boolean.valueOf(true));
/*     */     
/*     */     public AuthenticatorWrapper(HttpAuthenticator authenticator) {
/* 244 */       this.authenticator = authenticator;
/*     */     }
/*     */ 
/*     */     
/*     */     public PasswordAuthentication requestPasswordAuthenticationInstance(String host, InetAddress addr, int port, String protocol, String prompt, String scheme, URL url, Authenticator.RequestorType reqType) {
/* 249 */       synchronized (LOCK) {
/* 250 */         if (((Boolean)this.firstRequest.get()).booleanValue()) {
/* 251 */           this.firstRequest.set(Boolean.valueOf(false));
/* 252 */           if (reqType == Authenticator.RequestorType.PROXY) {
/* 253 */             UserNameAndPassword lastProxyCredentials = this.authenticator.getLastProxyCredentials();
/* 254 */             if (lastProxyCredentials != null) {
/* 255 */               return lastProxyCredentials.toPasswordAuthentication();
/*     */             }
/* 257 */           } else if (reqType == Authenticator.RequestorType.SERVER) {
/* 258 */             UserNameAndPassword lastServerCredentials = this.authenticator.getLastServerCredentials(host);
/* 259 */             if (lastServerCredentials != null) {
/* 260 */               return lastServerCredentials.toPasswordAuthentication();
/*     */             }
/*     */           } 
/*     */         } 
/* 264 */         return this.authenticator.requestPasswordAuthenticationInstance(host, addr, port, protocol, prompt, scheme, url, reqType);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\HttpClientWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */