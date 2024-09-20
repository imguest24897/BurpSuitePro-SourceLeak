/*     */ package com.install4j.api.update;
/*     */ 
/*     */ import com.install4j.api.beans.ErrorHandlingCallback;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class UpdateCheckRequest
/*     */ {
/*     */   private String urlSpec;
/*  28 */   private ApplicationDisplayMode applicationDisplayMode = ApplicationDisplayMode.GUI;
/*  29 */   private ErrorHandlingCallback errorHandlingCallback = null;
/*  30 */   private Map<String, List<String>> requestHeaders = new LinkedHashMap<>();
/*  31 */   private int connectTimeout = 10000;
/*  32 */   private int readTimeout = 10000;
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean acceptAllCertificates = false;
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest(String urlSpec) {
/*  41 */     urlSpec(urlSpec);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUrlSpec() {
/*  50 */     return this.urlSpec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest urlSpec(String urlSpec) {
/*  60 */     this.urlSpec = urlSpec;
/*  61 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApplicationDisplayMode getApplicationDisplayMode() {
/*  71 */     return this.applicationDisplayMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest applicationDisplayMode(ApplicationDisplayMode applicationDisplayMode) {
/*  78 */     this.applicationDisplayMode = applicationDisplayMode;
/*  79 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ErrorHandlingCallback getErrorHandlingCallback() {
/*  88 */     return this.errorHandlingCallback;
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
/*     */   public UpdateCheckRequest errorHandlingCallback(ErrorHandlingCallback errorHandlingCallback) {
/* 107 */     this.errorHandlingCallback = errorHandlingCallback;
/* 108 */     return this;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public boolean isAskForProxy() {
/* 113 */     return false;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public UpdateCheckRequest askForProxy(boolean askForProxy) {
/* 118 */     return this;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public boolean isShowProxyOnErrorCode() {
/* 123 */     return false;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public UpdateCheckRequest showProxyOnErrorCode(boolean showProxyOnErrorCode) {
/* 128 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getRequestHeaders() {
/* 137 */     return this.requestHeaders;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest requestHeaders(Map<String, List<String>> requestHeaders) {
/* 148 */     this.requestHeaders = requestHeaders;
/* 149 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getConnectTimeout() {
/* 159 */     return this.connectTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest connectTimeout(int connectTimeout) {
/* 169 */     this.connectTimeout = connectTimeout;
/* 170 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getReadTimeout() {
/* 180 */     return this.readTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest readTimeout(int readTimeout) {
/* 190 */     this.readTimeout = readTimeout;
/* 191 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isAcceptAllCertificates() {
/* 200 */     return this.acceptAllCertificates;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateCheckRequest acceptAllCertificates(boolean acceptAllCertificates) {
/* 211 */     this.acceptAllCertificates = acceptAllCertificates;
/* 212 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\UpdateCheckRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */