/*     */ package com.install4j.runtime.beans.actions.net;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ErrorHandlingMode;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.KeyValuePair;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.HttpRequestHandler;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public abstract class AbstractHttpRequestAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*     */   protected static boolean askRetry(String message) throws UserCanceledException {
/*  23 */     switch (Util.showOptionDialog(message, new String[] {
/*  24 */           Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo"), Messages.getString(".ButtonCancel") }, 2)) {
/*     */       case 2:
/*  26 */         throw new UserCanceledException();
/*     */       case -1:
/*     */       case 1:
/*  29 */         return false;
/*     */     } 
/*  31 */     return true;
/*     */   }
/*     */   
/*  34 */   private String url = "";
/*  35 */   private List<KeyValuePair> requestHeaders = new ArrayList<>();
/*     */   
/*     */   private boolean askForProxy = true;
/*     */   private ScriptProperty connectionFailureScript;
/*  39 */   private int connectTimeout = 10000;
/*  40 */   private int readTimeout = 20000;
/*     */   private boolean acceptAllCertificates = false;
/*     */   
/*     */   public String getUrl() {
/*  44 */     return replaceVariables(replaceVariables(this.url));
/*     */   }
/*     */   
/*     */   public void setUrl(String url) {
/*  48 */     this.url = url;
/*     */   }
/*     */   
/*     */   public List<KeyValuePair> getRequestHeaders() {
/*  52 */     return (List<KeyValuePair>)replaceWithTextOverride("requestHeaders", this.requestHeaders, List.class);
/*     */   }
/*     */   
/*     */   public void setRequestHeaders(List<KeyValuePair> requestHeaders) {
/*  56 */     this.requestHeaders = requestHeaders;
/*     */   }
/*     */   
/*     */   public boolean isAskForProxy() {
/*  60 */     return replaceWithTextOverride("askForProxy", this.askForProxy);
/*     */   }
/*     */   
/*     */   public void setAskForProxy(boolean askForProxy) {
/*  64 */     this.askForProxy = askForProxy;
/*     */   }
/*     */   
/*     */   public ScriptProperty getConnectionFailureScript() {
/*  68 */     return (ScriptProperty)replaceWithTextOverride("connectionFailureScript", this.connectionFailureScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setConnectionFailureScript(ScriptProperty connectionFailureScript) {
/*  72 */     this.connectionFailureScript = connectionFailureScript;
/*     */   }
/*     */   
/*     */   public int getConnectTimeout() {
/*  76 */     return replaceWithTextOverride("connectTimeout", this.connectTimeout);
/*     */   }
/*     */   
/*     */   public void setConnectTimeout(int connectTimeout) {
/*  80 */     this.connectTimeout = connectTimeout;
/*     */   }
/*     */   
/*     */   public int getReadTimeout() {
/*  84 */     return replaceWithTextOverride("readTimeout", this.readTimeout);
/*     */   }
/*     */   
/*     */   public void setReadTimeout(int readTimeout) {
/*  88 */     this.readTimeout = readTimeout;
/*     */   }
/*     */   
/*     */   public boolean isAcceptAllCertificates() {
/*  92 */     return replaceWithTextOverride("acceptAllCertificates", this.acceptAllCertificates);
/*     */   }
/*     */   
/*     */   public void setAcceptAllCertificates(boolean acceptAllCertificates) {
/*  96 */     this.acceptAllCertificates = acceptAllCertificates;
/*     */   }
/*     */   
/*     */   protected void applyCommonProperties(HttpRequestHandler requestHandler) {
/* 100 */     requestHandler.setErrorHandlingCallback(e -> {
/*     */           if (getConnectionFailureScript() != null) {
/*     */             try {
/*     */               return (ErrorHandlingMode)ContextImpl.getCurrentContext().runScript(getConnectionFailureScript(), (Bean)this, new Object[] { e });
/* 104 */             } catch (Exception e1) {
/*     */               Logger.getInstance().log(e1);
/*     */             } 
/*     */           }
/*     */           return null;
/*     */         });
/* 110 */     requestHandler.setConnectTimeout(getConnectTimeout());
/* 111 */     requestHandler.setReadTimeout(getReadTimeout());
/* 112 */     requestHandler.setRequestHeaders(createRequestHeadersMap());
/* 113 */     requestHandler.setAcceptAllCertificates(isAcceptAllCertificates());
/*     */   }
/*     */   
/*     */   private Map<String, List<String>> createRequestHeadersMap() {
/* 117 */     Map<String, List<String>> requestHeadersMap = new LinkedHashMap<>();
/* 118 */     for (KeyValuePair requestHeader : getRequestHeaders()) {
/* 119 */       String key = replaceVariables(requestHeader.getKey());
/* 120 */       List<String> values = requestHeadersMap.computeIfAbsent(key, k -> new ArrayList());
/* 121 */       values.add(replaceVariables(requestHeader.getValue()));
/*     */     } 
/* 123 */     return requestHeadersMap;
/*     */   }
/*     */   
/*     */   protected String wrapMessageInNobr(String message) {
/* 127 */     return "<html><nobr>" + message + "</nobr>";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\AbstractHttpRequestAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */