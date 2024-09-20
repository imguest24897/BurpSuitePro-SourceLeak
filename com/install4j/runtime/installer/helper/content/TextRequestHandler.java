/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ public class TextRequestHandler
/*     */   extends HttpRequestHandler
/*     */ {
/*  22 */   private static final Pattern CHARSET_PATTERN = Pattern.compile("charset=(.*)"); static {
/*  23 */     DEFAULT_READ_CONTENT_TYPE = (contentType -> Boolean.valueOf((contentType == null || contentType.startsWith("text/") || contentType.equals("application/json") || contentType.equals("application/javascript") || contentType.contains("charset"))));
/*     */   }
/*     */   public static final Function<String, Boolean> DEFAULT_READ_CONTENT_TYPE;
/*  26 */   private Function<String, Boolean> readContentType = DEFAULT_READ_CONTENT_TYPE;
/*     */   
/*     */   public TextRequestHandler(Context context) {
/*  29 */     super(context);
/*     */   }
/*     */   
/*     */   public TextRequestHandler(int mode) {
/*  33 */     super(null, mode);
/*     */   }
/*     */   
/*     */   public TextResponse getTextResponse() throws IOException, UserCanceledException {
/*  37 */     return getTextResponse(false);
/*     */   }
/*     */   
/*     */   public TextResponse getTextResponse(boolean preventReadResponse) throws IOException, UserCanceledException {
/*  41 */     HttpConnection connection = getConnection();
/*  42 */     if (connection == null) {
/*  43 */       return null;
/*     */     }
/*     */     
/*  46 */     String response = null;
/*  47 */     String contentType = connection.getContentType();
/*  48 */     if (!preventReadResponse && isReadResponse()) {
/*  49 */       if (((Boolean)this.readContentType.apply(contentType)).booleanValue()) {
/*  50 */         ByteArrayOutputStream out = new ByteArrayOutputStream();
/*  51 */         FileUtil.pumpStream(getUsedInputStream(), out, val -> !isCancelled());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  60 */         checkCancelled();
/*  61 */         response = out.toString(getCharset(contentType).name());
/*  62 */         if (Boolean.getBoolean("install4j.logTextResponse")) {
/*  63 */           Logger.getInstance().log(null, "Text response: \"" + response, true);
/*     */         }
/*     */       } else {
/*  66 */         Logger.getInstance().log(null, "Content type \"" + contentType + "\" cannot be interpreted as text. Response body is not read.", false);
/*     */       } 
/*     */     }
/*  69 */     return new TextResponse(response, connection.getResponseCode(), connection.getHeaderFields());
/*     */   }
/*     */   
/*     */   public void setReadContentType(Function<String, Boolean> readContentType) {
/*  73 */     this.readContentType = readContentType;
/*     */   }
/*     */   
/*     */   private void checkCancelled() throws UserCanceledException {
/*  77 */     if (isCancelled()) {
/*  78 */       Context context = getContext();
/*  79 */       ContextInt contextInt = ContextImpl.getContextInt(context);
/*  80 */       if (context != null && contextInt != null) {
/*  81 */         Logger.getInstance().info(contextInt.getEventSource(), "HTTP request was canceled by the user");
/*     */       }
/*  83 */       throw new UserCanceledException();
/*     */     } 
/*     */   }
/*     */   
/*     */   private Charset getCharset(String contentType) {
/*  88 */     if (contentType != null) {
/*  89 */       Matcher matcher = CHARSET_PATTERN.matcher(contentType);
/*  90 */       if (matcher.find()) {
/*  91 */         String charsetName = matcher.group(1);
/*     */         try {
/*  93 */           return Charset.forName(charsetName);
/*  94 */         } catch (Exception exception) {}
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     return StandardCharsets.UTF_8;
/*     */   }
/*     */ 
/*     */   
/*     */   public TextRequestHandler connect(String urlString) throws IOException, UserCanceledException {
/* 103 */     return (TextRequestHandler)super.connect(urlString);
/*     */   }
/*     */ 
/*     */   
/*     */   public TextRequestHandler connect(String urlString, HttpRequestHandler.ConnectionPreparer connectionPreparer) throws IOException, UserCanceledException {
/* 108 */     return (TextRequestHandler)super.connect(urlString, connectionPreparer);
/*     */   }
/*     */   
/*     */   public static class TextResponse {
/*     */     private String text;
/*     */     private int responseCode;
/*     */     private Map<String, List<String>> headerFields;
/*     */     
/*     */     public TextResponse(String text, int responseCode, Map<String, List<String>> headerFields) {
/* 117 */       this.text = text;
/* 118 */       this.responseCode = responseCode;
/* 119 */       this.headerFields = headerFields;
/*     */     }
/*     */     
/*     */     public String getText() {
/* 123 */       return this.text;
/*     */     }
/*     */     
/*     */     public int getResponseCode() {
/* 127 */       return this.responseCode;
/*     */     }
/*     */     
/*     */     public boolean isSuccess() {
/* 131 */       return (getResponseCode() / 200 == 1);
/*     */     }
/*     */     
/*     */     public Map<String, List<String>> getHeaderFields() {
/* 135 */       return this.headerFields;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\TextRequestHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */