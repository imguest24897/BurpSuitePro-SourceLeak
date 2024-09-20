/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.install4j.runtime.installer.platform.win32.wininet.IgnoreCaseString;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.net.ProtocolException;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public abstract class AbstractHttpConnectionWrapper implements HttpConnection {
/*  13 */   private Map<IgnoreCaseString, List<String>> requestHeaders = new HashMap<>();
/*     */   
/*  15 */   private String requestMethod = "GET";
/*  16 */   private long postContentLength = 0L;
/*     */   
/*     */   private boolean acceptAllCertificates;
/*     */   private int connectTimeout;
/*     */   private int readTimeout;
/*     */   private URL url;
/*     */   
/*     */   public AbstractHttpConnectionWrapper(URL url, boolean acceptAllCertificates) {
/*  24 */     this.url = url;
/*  25 */     this.acceptAllCertificates = acceptAllCertificates;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public URL getURL() {
/*  32 */     return this.url;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContentEncoding() {
/*  37 */     return getHeaderField("content-encoding");
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContentType() {
/*  42 */     return getHeaderField("content-type");
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRequestMethod(String requestMethod) throws ProtocolException {
/*  47 */     this.requestMethod = requestMethod;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRequestProperty(String key, String value) {
/*  52 */     this.requestHeaders.put(new IgnoreCaseString(key), new ArrayList<>(Collections.singletonList(value)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void addRequestProperty(String key, String value) {
/*  57 */     ((List<String>)this.requestHeaders.computeIfAbsent(new IgnoreCaseString(key), s -> new ArrayList())).add(value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDoOutput(long contentLength) {
/*  62 */     this.postContentLength = contentLength;
/*     */   }
/*     */   
/*     */   protected int getConnectTimeout() {
/*  66 */     return this.connectTimeout;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setConnectTimeout(int connectTimeout) {
/*  71 */     this.connectTimeout = connectTimeout;
/*     */   }
/*     */   
/*     */   protected int getReadTimeout() {
/*  75 */     return this.readTimeout;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setReadTimeout(int readTimeout) {
/*  80 */     this.readTimeout = readTimeout;
/*     */   }
/*     */   
/*     */   private void setRequestHeaderIfNotSet(String key, String value) {
/*  84 */     this.requestHeaders.computeIfAbsent(new IgnoreCaseString(key), s -> new ArrayList(Collections.singletonList(value)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUseCaches(boolean useCaches) {
/*  89 */     setRequestHeaderIfNotSet("cache-control", "no-cache");
/*  90 */     setRequestHeaderIfNotSet("pragma", "no-cache");
/*     */   }
/*     */ 
/*     */   
/*     */   public long getContentLengthLong() {
/*  95 */     String responseHeader = getHeaderField("content-length");
/*  96 */     if (responseHeader != null) {
/*     */       try {
/*  98 */         return Long.parseLong(responseHeader);
/*  99 */       } catch (NumberFormatException numberFormatException) {}
/*     */     }
/*     */     
/* 102 */     return -1L;
/*     */   }
/*     */   
/*     */   protected void checkConnectedAndFound() throws IOException {
/* 106 */     checkConnected();
/* 107 */     if (getResponseCode() == 404) {
/* 108 */       throw new FileNotFoundException(getURL().toExternalForm());
/*     */     }
/*     */   }
/*     */   
/*     */   protected Map<IgnoreCaseString, List<String>> getRequestHeaders() {
/* 113 */     return this.requestHeaders;
/*     */   }
/*     */   
/*     */   protected String getRequestMethod() {
/* 117 */     return this.requestMethod;
/*     */   }
/*     */   
/*     */   protected long getPostContentLength() {
/* 121 */     return this.postContentLength;
/*     */   }
/*     */   
/*     */   protected boolean isAcceptAllCertificates() {
/* 125 */     return this.acceptAllCertificates;
/*     */   }
/*     */   
/*     */   protected abstract void checkConnected();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\AbstractHttpConnectionWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */