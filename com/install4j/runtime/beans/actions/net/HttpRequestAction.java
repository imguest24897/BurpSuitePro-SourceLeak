/*     */ package com.install4j.runtime.beans.actions.net;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.KeyValuePair;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.HttpConnection;
/*     */ import com.install4j.runtime.installer.helper.content.HttpRequestHandler;
/*     */ import com.install4j.runtime.installer.helper.content.TextRequestHandler;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URLEncoder;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class HttpRequestAction
/*     */   extends AbstractHttpRequestAction {
/*  20 */   private HttpRequestMethod requestMethod = HttpRequestMethod.GET;
/*     */   private boolean useRequestBody = false;
/*  22 */   private String requestBodyContentType = "";
/*  23 */   private String requestBody = "";
/*     */   
/*  25 */   private List<KeyValuePair> formData = new ArrayList<>();
/*  26 */   private String responseVariableName = "";
/*  27 */   private String responseCodeVariableName = "";
/*  28 */   private String responseHeadersVariableName = "";
/*     */   
/*     */   private boolean performRollbackRequest = false;
/*  31 */   private String rollbackUrl = "";
/*  32 */   private HttpRequestMethod rollbackRequestMethod = HttpRequestMethod.GET;
/*     */   private boolean useRollbackRequestBody = false;
/*  34 */   private String rollbackRequestBodyContentType = "";
/*  35 */   private String rollbackRequestBody = "";
/*  36 */   private List<KeyValuePair> rollbackFormData = new ArrayList<>();
/*     */   
/*     */   public HttpRequestMethod getRequestMethod() {
/*  39 */     return (HttpRequestMethod)replaceWithTextOverride("requestMethod", this.requestMethod, HttpRequestMethod.class);
/*     */   }
/*     */   
/*     */   public void setRequestMethod(HttpRequestMethod requestMethod) {
/*  43 */     this.requestMethod = requestMethod;
/*     */   }
/*     */   
/*     */   public boolean isUseRequestBody() {
/*  47 */     return replaceWithTextOverride("useRequestBody", this.useRequestBody);
/*     */   }
/*     */   
/*     */   public void setUseRequestBody(boolean useRequestBody) {
/*  51 */     this.useRequestBody = useRequestBody;
/*     */   }
/*     */   
/*     */   public String getRequestBodyContentType() {
/*  55 */     return replaceVariables(replaceVariables(this.requestBodyContentType));
/*     */   }
/*     */   
/*     */   public void setRequestBodyContentType(String requestBodyContentType) {
/*  59 */     this.requestBodyContentType = requestBodyContentType;
/*     */   }
/*     */   
/*     */   public String getRequestBody() {
/*  63 */     return replaceVariables(replaceVariables(this.requestBody));
/*     */   }
/*     */   
/*     */   public void setRequestBody(String requestBody) {
/*  67 */     this.requestBody = requestBody;
/*     */   }
/*     */   
/*     */   public List<KeyValuePair> getFormData() {
/*  71 */     return (List<KeyValuePair>)replaceWithTextOverride("formData", this.formData, List.class);
/*     */   }
/*     */   
/*     */   public void setFormData(List<KeyValuePair> formData) {
/*  75 */     this.formData = formData;
/*     */   }
/*     */   
/*     */   public String getResponseVariableName() {
/*  79 */     return replaceVariables(this.responseVariableName);
/*     */   }
/*     */   
/*     */   public void setResponseVariableName(String responseVariableName) {
/*  83 */     this.responseVariableName = responseVariableName;
/*     */   }
/*     */   
/*     */   public String getResponseCodeVariableName() {
/*  87 */     return replaceVariables(this.responseCodeVariableName);
/*     */   }
/*     */   
/*     */   public void setResponseCodeVariableName(String responseCodeVariableName) {
/*  91 */     this.responseCodeVariableName = responseCodeVariableName;
/*     */   }
/*     */   
/*     */   public String getResponseHeadersVariableName() {
/*  95 */     return replaceVariables(this.responseHeadersVariableName);
/*     */   }
/*     */   
/*     */   public void setResponseHeadersVariableName(String responseHeadersVariableName) {
/*  99 */     this.responseHeadersVariableName = responseHeadersVariableName;
/*     */   }
/*     */   
/*     */   public boolean isPerformRollbackRequest() {
/* 103 */     return replaceWithTextOverride("performRollbackRequest", this.performRollbackRequest);
/*     */   }
/*     */   
/*     */   public void setPerformRollbackRequest(boolean performRollbackRequest) {
/* 107 */     this.performRollbackRequest = performRollbackRequest;
/*     */   }
/*     */   
/*     */   public String getRollbackUrl() {
/* 111 */     return replaceVariables(this.rollbackUrl);
/*     */   }
/*     */   
/*     */   public void setRollbackUrl(String rollbackUrl) {
/* 115 */     this.rollbackUrl = rollbackUrl;
/*     */   }
/*     */   
/*     */   public HttpRequestMethod getRollbackRequestMethod() {
/* 119 */     return (HttpRequestMethod)replaceWithTextOverride("rollbackRequestMethod", this.rollbackRequestMethod, HttpRequestMethod.class);
/*     */   }
/*     */   
/*     */   public void setRollbackRequestMethod(HttpRequestMethod rollbackRequestMethod) {
/* 123 */     this.rollbackRequestMethod = rollbackRequestMethod;
/*     */   }
/*     */   
/*     */   public boolean isUseRollbackRequestBody() {
/* 127 */     return replaceWithTextOverride("useRollbackRequestBody", this.useRollbackRequestBody);
/*     */   }
/*     */   
/*     */   public void setUseRollbackRequestBody(boolean useRollbackRequestBody) {
/* 131 */     this.useRollbackRequestBody = useRollbackRequestBody;
/*     */   }
/*     */   
/*     */   public String getRollbackRequestBodyContentType() {
/* 135 */     return replaceVariables(replaceVariables(this.rollbackRequestBodyContentType));
/*     */   }
/*     */   
/*     */   public void setRollbackRequestBodyContentType(String rollbackRequestBodyContentType) {
/* 139 */     this.rollbackRequestBodyContentType = rollbackRequestBodyContentType;
/*     */   }
/*     */   
/*     */   public String getRollbackRequestBody() {
/* 143 */     return replaceVariables(replaceVariables(this.rollbackRequestBody));
/*     */   }
/*     */   
/*     */   public void setRollbackRequestBody(String rollbackRequestBody) {
/* 147 */     this.rollbackRequestBody = rollbackRequestBody;
/*     */   }
/*     */   
/*     */   public List<KeyValuePair> getRollbackFormData() {
/* 151 */     return (List<KeyValuePair>)replaceWithTextOverride("rollbackFormData", this.rollbackFormData, List.class);
/*     */   }
/*     */   
/*     */   public void setRollbackFormData(List<KeyValuePair> rollbackFormData) {
/* 155 */     this.rollbackFormData = rollbackFormData;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*     */     try {
/* 161 */       TextRequestHandler.TextResponse textResponse = performRequest(context, getUrl(), getRequestMethod(), getFormData(), isUseRequestBody(), getRequestBodyContentType(), getRequestBody());
/*     */       
/* 163 */       if (!getResponseVariableName().isEmpty()) {
/* 164 */         context.registerHiddenVariable(getResponseVariableName());
/* 165 */         context.setVariable(getResponseVariableName(), textResponse.getText());
/*     */       } 
/* 167 */       if (!getResponseCodeVariableName().isEmpty()) {
/* 168 */         context.setVariable(getResponseCodeVariableName(), Integer.valueOf(textResponse.getResponseCode()));
/*     */       }
/* 170 */       if (!getResponseHeadersVariableName().isEmpty()) {
/* 171 */         context.registerHiddenVariable(getResponseHeadersVariableName());
/* 172 */         context.setVariable(getResponseHeadersVariableName(), textResponse.getHeaderFields());
/*     */       } 
/*     */       
/* 175 */       return textResponse.isSuccess();
/* 176 */     } catch (UserCanceledException e) {
/* 177 */       if (context.isCancelling()) {
/* 178 */         throw new UserCanceledException();
/*     */       }
/* 180 */       return false;
/*     */     }
/* 182 */     catch (IOException e) {
/* 183 */       Logger.getInstance().error(this, "HTTP request failed");
/* 184 */       Logger.getInstance().log(e);
/* 185 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private TextRequestHandler.TextResponse performRequest(Context context, String url, HttpRequestMethod requestMethod, List<KeyValuePair> formData, boolean useRequestBody, String requestBodyContentType, String requestBody) throws IOException, UserCanceledException {
/* 190 */     TextRequestHandler handler = new TextRequestHandler(context); 
/* 191 */     try { applyCommonProperties((HttpRequestHandler)handler);
/*     */       
/* 193 */       try { performRequest(handler, url, requestMethod, formData, useRequestBody, requestBodyContentType, requestBody);
/* 194 */         TextRequestHandler.TextResponse textResponse = handler.getTextResponse();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 203 */         handler.close(); return textResponse; } catch (IOException e) { TextRequestHandler.TextResponse textResponse = handler.getTextResponse(true); if (textResponse != null) { TextRequestHandler.TextResponse textResponse1 = textResponse; handler.close(); return textResponse1; }  throw e; }  }
/*     */     catch (Throwable throwable) { try { handler.close(); }
/*     */       catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */        throw throwable; }
/* 207 */      } public static void performRequest(TextRequestHandler handler, String url, HttpRequestMethod requestMethod, List<KeyValuePair> formData, boolean useRequestBody, String requestBodyContentType, String requestBody) throws IOException, UserCanceledException { handler.connect(createConnectionUrl(url, requestMethod, formData, useRequestBody), connection -> {
/*     */           connection.setRequestMethod(requestMethod.getMethodName());
/*     */           if (requestMethod.isBodyFormData()) {
/*     */             if (useRequestBody) {
/*     */               writeRequestBody(connection, requestBody, requestBodyContentType);
/*     */             } else {
/*     */               writeRequestBody(connection, createRequestBody(formData), "application/x-www-form-urlencoded");
/*     */             } 
/*     */           }
/*     */         }); }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeRequestBody(HttpConnection connection, String body, String contentType) throws IOException {
/* 221 */     if (!body.isEmpty()) {
/* 222 */       connection.setRequestProperty("Content-Type", contentType);
/* 223 */       connection.setRequestProperty("Cache-Control", "no-cache");
/* 224 */       connection.setDoOutput(body.length());
/*     */       
/* 226 */       PrintStream out = new PrintStream(connection.getOutputStream());
/* 227 */       out.print(body);
/* 228 */       out.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String createConnectionUrl(String url, HttpRequestMethod requestMethod, List<KeyValuePair> formData, boolean useRequestBody) {
/* 233 */     StringBuilder buffer = new StringBuilder();
/* 234 */     buffer.append(url);
/* 235 */     if (!requestMethod.isBodyFormData() || useRequestBody) {
/* 236 */       String requestData = createRequestBody(formData);
/* 237 */       if (!requestData.isEmpty()) {
/* 238 */         if (!url.contains("?")) {
/* 239 */           buffer.append('?');
/*     */         }
/* 241 */         if (buffer.length() > 0 && buffer.charAt(buffer.length() - 1) != '?') {
/* 242 */           buffer.append('&');
/*     */         }
/* 244 */         buffer.append(requestData);
/*     */       } 
/*     */     } 
/* 247 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   private static String createRequestBody(List<KeyValuePair> formData) {
/* 251 */     StringBuilder buffer = new StringBuilder();
/* 252 */     for (KeyValuePair keyValuePair : formData) {
/* 253 */       if (buffer.length() > 0) {
/* 254 */         buffer.append("&");
/*     */       }
/* 256 */       buffer.append(replaceVariables(keyValuePair.getKey()));
/* 257 */       buffer.append("=");
/*     */       try {
/* 259 */         buffer.append(URLEncoder.encode(replaceVariables(keyValuePair.getValue()), "UTF-8"));
/* 260 */       } catch (UnsupportedEncodingException e) {
/* 261 */         throw new RuntimeException(e);
/*     */       } 
/*     */     } 
/* 264 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 269 */     super.rollback(context);
/*     */     
/* 271 */     if (isPerformRollbackRequest()) {
/*     */       try {
/* 273 */         performRequest((Context)context, getRollbackUrl(), getRollbackRequestMethod(), getRollbackFormData(), isUseRollbackRequestBody(), getRollbackRequestBodyContentType(), getRollbackRequestBody());
/* 274 */       } catch (IOException e) {
/* 275 */         Logger.getInstance().error(this, "HTTP rollback request failed");
/* 276 */         Logger.getInstance().log(e);
/* 277 */         e.printStackTrace();
/* 278 */       } catch (UserCanceledException userCanceledException) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 285 */     return isPerformRollbackRequest();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\HttpRequestAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */