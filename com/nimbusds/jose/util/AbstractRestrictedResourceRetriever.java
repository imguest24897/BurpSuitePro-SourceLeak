/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ @ThreadSafe
/*     */ public abstract class AbstractRestrictedResourceRetriever
/*     */   implements RestrictedResourceRetriever
/*     */ {
/*     */   private int connectTimeout;
/*     */   private int readTimeout;
/*     */   private int sizeLimit;
/*     */   private Map<String, List<String>> headers;
/*     */   
/*     */   public AbstractRestrictedResourceRetriever(int connectTimeout, int readTimeout, int sizeLimit) {
/*  66 */     setConnectTimeout(connectTimeout);
/*  67 */     setReadTimeout(readTimeout);
/*  68 */     setSizeLimit(sizeLimit);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getConnectTimeout() {
/*  75 */     return this.connectTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConnectTimeout(int connectTimeoutMs) {
/*  82 */     if (connectTimeoutMs < 0) {
/*  83 */       throw new IllegalArgumentException("The connect timeout must not be negative");
/*     */     }
/*     */     
/*  86 */     this.connectTimeout = connectTimeoutMs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getReadTimeout() {
/*  93 */     return this.readTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReadTimeout(int readTimeoutMs) {
/* 100 */     if (readTimeoutMs < 0) {
/* 101 */       throw new IllegalArgumentException("The read timeout must not be negative");
/*     */     }
/*     */     
/* 104 */     this.readTimeout = readTimeoutMs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSizeLimit() {
/* 111 */     return this.sizeLimit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSizeLimit(int sizeLimitBytes) {
/* 118 */     if (sizeLimitBytes < 0) {
/* 119 */       throw new IllegalArgumentException("The size limit must not be negative");
/*     */     }
/*     */     
/* 122 */     this.sizeLimit = sizeLimitBytes;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getHeaders() {
/* 127 */     return this.headers;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setHeaders(Map<String, List<String>> headers) {
/* 132 */     this.headers = headers;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\AbstractRestrictedResourceRetriever.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */