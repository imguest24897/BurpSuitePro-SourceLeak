/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.net.ssl.HttpsURLConnection;
/*     */ import javax.net.ssl.SSLSocketFactory;
/*     */ import net.jcip.annotations.ThreadSafe;
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
/*     */ @ThreadSafe
/*     */ public class DefaultResourceRetriever
/*     */   extends AbstractRestrictedResourceRetriever
/*     */   implements RestrictedResourceRetriever
/*     */ {
/*     */   private boolean disconnectAfterUse;
/*     */   private final SSLSocketFactory sslSocketFactory;
/*     */   private Proxy proxy;
/*     */   
/*     */   public DefaultResourceRetriever() {
/*  76 */     this(0, 0);
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
/*     */ 
/*     */   
/*     */   public DefaultResourceRetriever(int connectTimeout, int readTimeout) {
/*  91 */     this(connectTimeout, readTimeout, 0);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public DefaultResourceRetriever(int connectTimeout, int readTimeout, int sizeLimit) {
/* 107 */     this(connectTimeout, readTimeout, sizeLimit, true);
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
/*     */   public DefaultResourceRetriever(int connectTimeout, int readTimeout, int sizeLimit, boolean disconnectAfterUse) {
/* 135 */     this(connectTimeout, readTimeout, sizeLimit, disconnectAfterUse, (SSLSocketFactory)null);
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
/*     */   public DefaultResourceRetriever(int connectTimeout, int readTimeout, int sizeLimit, boolean disconnectAfterUse, SSLSocketFactory sslSocketFactory) {
/* 166 */     super(connectTimeout, readTimeout, sizeLimit);
/* 167 */     this.disconnectAfterUse = disconnectAfterUse;
/* 168 */     this.sslSocketFactory = sslSocketFactory;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean disconnectsAfterUse() {
/* 185 */     return this.disconnectAfterUse;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisconnectsAfterUse(boolean disconnectAfterUse) {
/* 202 */     this.disconnectAfterUse = disconnectAfterUse;
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
/*     */   public Proxy getProxy() {
/* 215 */     return this.proxy;
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
/*     */   
/*     */   public void setProxy(Proxy proxy) {
/* 229 */     this.proxy = proxy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Resource retrieveResource(URL url) throws IOException {
/* 237 */     HttpURLConnection con = null; try {
/*     */       String content;
/* 239 */       con = openConnection(url);
/*     */       
/* 241 */       con.setConnectTimeout(getConnectTimeout());
/* 242 */       con.setReadTimeout(getReadTimeout());
/*     */       
/* 244 */       if (this.sslSocketFactory != null && con instanceof HttpsURLConnection) {
/* 245 */         ((HttpsURLConnection)con).setSSLSocketFactory(this.sslSocketFactory);
/*     */       }
/*     */       
/* 248 */       if (getHeaders() != null && !getHeaders().isEmpty()) {
/* 249 */         for (Map.Entry<String, List<String>> entry : getHeaders().entrySet()) {
/* 250 */           for (String value : entry.getValue()) {
/* 251 */             con.addRequestProperty(entry.getKey(), value);
/*     */           }
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 257 */       InputStream inputStream = getInputStream(con, getSizeLimit()); 
/* 258 */       try { content = IOUtils.readInputStreamToString(inputStream, StandardCharset.UTF_8);
/* 259 */         if (inputStream != null) inputStream.close();  } catch (Throwable throwable) { if (inputStream != null)
/*     */           try { inputStream.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */             throw throwable; }
/* 262 */        int statusCode = con.getResponseCode();
/* 263 */       String statusMessage = con.getResponseMessage();
/*     */ 
/*     */       
/* 266 */       if (statusCode > 299 || statusCode < 200) {
/* 267 */         throw new IOException("HTTP " + statusCode + ": " + statusMessage);
/*     */       }
/*     */       
/* 270 */       return new Resource(content, con.getContentType());
/*     */     }
/* 272 */     catch (ClassCastException e) {
/* 273 */       String content; throw new IOException("Couldn't open HTTP(S) connection: " + content.getMessage(), content);
/*     */     } finally {
/* 275 */       if (this.disconnectAfterUse && con != null) {
/* 276 */         con.disconnect();
/*     */       }
/*     */     } 
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
/*     */ 
/*     */ 
/*     */   
/*     */   protected HttpURLConnection openConnection(URL url) throws IOException {
/* 294 */     if (this.proxy != null) {
/* 295 */       return (HttpURLConnection)url.openConnection(this.proxy);
/*     */     }
/* 297 */     return (HttpURLConnection)url.openConnection();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private InputStream getInputStream(HttpURLConnection con, int sizeLimit) throws IOException {
/* 305 */     InputStream inputStream = con.getInputStream();
/*     */     
/* 307 */     return (sizeLimit > 0) ? new BoundedInputStream(inputStream, getSizeLimit()) : inputStream;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\DefaultResourceRetriever.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */