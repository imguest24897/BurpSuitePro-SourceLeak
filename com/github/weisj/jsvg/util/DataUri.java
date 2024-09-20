/*     */ package com.github.weisj.jsvg.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URLDecoder;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Arrays;
/*     */ import java.util.Base64;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.regex.Pattern;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ final class DataUri
/*     */ {
/*     */   private static final String CHARSET_OPTION_NAME = "charset";
/*     */   private static final String FILENAME_OPTION_NAME = "filename";
/*     */   private static final String CONTENT_DISPOSITION_OPTION_NAME = "content-disposition";
/*     */   @NotNull
/*     */   private final String mime;
/*     */   @Nullable
/*     */   private final Charset charset;
/*     */   @Nullable
/*     */   private final String filename;
/*     */   @Nullable
/*     */   private final String contentDisposition;
/*     */   private final byte[] data;
/*     */   
/*     */   public DataUri(String mime, Charset charset, byte[] data) {
/*  71 */     this(mime, charset, null, null, data);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataUri(@NotNull String mime, @Nullable Charset charset, @Nullable String filename, @Nullable String contentDisposition, byte[] data) {
/*  76 */     this.mime = mime;
/*  77 */     this.charset = charset;
/*  78 */     this.filename = filename;
/*  79 */     this.contentDisposition = contentDisposition;
/*  80 */     this.data = data;
/*     */   }
/*     */   @NotNull
/*     */   public String mime() {
/*  84 */     return this.mime;
/*     */   }
/*     */   
/*     */   public byte[] data() {
/*  88 */     return this.data;
/*     */   }
/*     */   @Nullable
/*     */   public Charset charset() {
/*  92 */     return this.charset;
/*     */   }
/*     */   @Nullable
/*     */   public String contentDisposition() {
/*  96 */     return this.contentDisposition;
/*     */   }
/*     */   @Nullable
/*     */   public String filename() {
/* 100 */     return this.filename;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 105 */     if (this == o) return true; 
/* 106 */     if (!(o instanceof DataUri)) return false; 
/* 107 */     DataUri dataUri = (DataUri)o;
/* 108 */     return (this.mime.equals(dataUri.mime) && 
/* 109 */       Objects.equals(this.charset, dataUri.charset) && 
/* 110 */       Objects.equals(this.filename, dataUri.filename) && 
/* 111 */       Objects.equals(this.contentDisposition, dataUri.contentDisposition) && 
/* 112 */       Arrays.equals(this.data, dataUri.data));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 117 */     int result = Objects.hash(new Object[] { this.mime, this.charset, this.filename, this.contentDisposition });
/* 118 */     result = 31 * result + Arrays.hashCode(this.data);
/* 119 */     return result;
/*     */   }
/*     */   
/*     */   static final class MalformedDataUriException extends IOException {
/*     */     MalformedDataUriException(@NotNull String reason) {
/* 124 */       super(reason);
/*     */     }
/*     */     
/*     */     MalformedDataUriException(@NotNull Exception reason) {
/* 128 */       super(reason);
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
/*     */   public static DataUri parse(@NotNull String uri, Charset charset) throws MalformedDataUriException {
/*     */     byte[] finalData;
/* 146 */     if (!uri.toLowerCase().startsWith("data:")) {
/* 147 */       throw new MalformedDataUriException("URI must start with a case-insensitive `data:'");
/*     */     }
/*     */     
/* 150 */     if (-1 == uri.indexOf(',')) throw new MalformedDataUriException("URI must contain a `,'");
/*     */ 
/*     */ 
/*     */     
/* 154 */     Collection<String> supportedContentEncodings = Collections.singletonList("base64");
/*     */ 
/*     */     
/* 157 */     String mimeType = "text/plain";
/*     */ 
/*     */     
/* 160 */     String contentEncoding = "";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     boolean contentEncodingAlreadySet = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     Map<String, String> supportedValues = new HashMap<>();
/* 173 */     supportedValues.put("charset", "");
/* 174 */     supportedValues.put("filename", "");
/* 175 */     supportedValues.put("content-disposition", "");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     Map<String, Boolean> supportedValueSetBits = new HashMap<>();
/* 181 */     for (String key : supportedValues.keySet()) {
/* 182 */       supportedValueSetBits.put(key, Boolean.valueOf(false));
/*     */     }
/*     */ 
/*     */     
/* 186 */     int comma = uri.indexOf(',');
/*     */ 
/*     */ 
/*     */     
/* 190 */     String temp = uri.substring("data:".length(), comma);
/*     */ 
/*     */     
/* 193 */     String[] headers = temp.split(";");
/*     */ 
/*     */     
/* 196 */     for (int header = 0; header < headers.length; header++) {
/* 197 */       String name, s = headers[header];
/*     */ 
/*     */       
/* 200 */       s = s.toLowerCase();
/*     */ 
/*     */       
/* 203 */       int eq = s.indexOf('=');
/*     */ 
/*     */ 
/*     */       
/* 207 */       String value = "";
/*     */ 
/*     */       
/* 210 */       if (-1 == eq) {
/*     */ 
/*     */         
/* 213 */         name = percentDecode(s, charset);
/*     */ 
/*     */         
/* 216 */         name = name.trim();
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 222 */         name = s.substring(0, eq);
/*     */ 
/*     */         
/* 225 */         name = percentDecode(name, charset);
/*     */ 
/*     */         
/* 228 */         name = name.trim();
/*     */ 
/*     */         
/* 231 */         value = s.substring(eq + 1);
/*     */ 
/*     */         
/* 234 */         value = percentDecode(value, charset);
/*     */ 
/*     */         
/* 237 */         value = value.trim();
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 242 */       if (0 == header && -1 == eq && !name.isEmpty()) {
/*     */ 
/*     */         
/* 245 */         mimeType = name;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 251 */       else if (-1 == eq) {
/*     */ 
/*     */         
/* 254 */         String nameCaseInsensitive = name.toLowerCase();
/*     */         
/* 256 */         if (supportedContentEncodings.contains(nameCaseInsensitive))
/*     */         {
/*     */           
/* 259 */           if (!contentEncodingAlreadySet)
/*     */           {
/*     */             
/* 262 */             contentEncoding = name;
/*     */ 
/*     */             
/* 265 */             contentEncodingAlreadySet = true;
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 274 */         String nameCaseInsensitive = name.toLowerCase();
/*     */         
/* 276 */         if (!value.isEmpty() && supportedValues.containsKey(nameCaseInsensitive)) {
/*     */ 
/*     */ 
/*     */           
/* 280 */           boolean valueSet = ((Boolean)supportedValueSetBits.get(nameCaseInsensitive)).booleanValue();
/*     */           
/* 282 */           if (!valueSet) {
/*     */ 
/*     */ 
/*     */             
/* 286 */             supportedValues.put(nameCaseInsensitive, value);
/*     */ 
/*     */ 
/*     */             
/* 290 */             supportedValueSetBits.put(nameCaseInsensitive, Boolean.valueOf(true));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 299 */     String data = uri.substring(comma + 1);
/*     */ 
/*     */     
/* 302 */     data = percentDecode(data, charset);
/*     */ 
/*     */ 
/*     */     
/* 306 */     String finalMimeType = mimeType;
/*     */ 
/*     */     
/* 309 */     Charset finalCharset = ((String)supportedValues.get("charset")).isEmpty() ? null : Charset.forName(supportedValues.get("charset"));
/*     */ 
/*     */     
/* 312 */     String finalFilename = ((String)supportedValues.get("filename")).isEmpty() ? null : supportedValues.get("filename");
/*     */ 
/*     */     
/* 315 */     String finalContentDisposition = ((String)supportedValues.get("content-disposition")).isEmpty() ? null : supportedValues.get("content-disposition");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 321 */       finalData = "base64".equalsIgnoreCase(contentEncoding) ? Base64.getMimeDecoder().decode(data) : data.getBytes(charset);
/* 322 */     } catch (RuntimeException e) {
/* 323 */       throw new MalformedDataUriException(e);
/*     */     } 
/*     */ 
/*     */     
/* 327 */     return new DataUri(finalMimeType, finalCharset, finalFilename, finalContentDisposition, finalData);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 337 */     StringBuilder s = new StringBuilder();
/* 338 */     s.append("data:").append(mime()).append(";");
/*     */     
/* 340 */     if (this.charset != null) s.append("charset=").append(this.charset.name()).append(";"); 
/* 341 */     if (this.contentDisposition != null)
/* 342 */       s.append("content-disposition=").append(this.contentDisposition).append(";"); 
/* 343 */     if (this.filename != null) s.append("filename=").append(this.filename).append(";");
/*     */     
/* 345 */     s.append("base64,").append(new String(Base64.getEncoder().encode(data()), StandardCharsets.UTF_8));
/*     */     
/* 347 */     return s.toString();
/*     */   }
/*     */   
/* 350 */   private static final Pattern PLUS = Pattern.compile("+", 16);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String percentDecode(String s, Charset cs) {
/*     */     try {
/* 358 */       s = PLUS.matcher(s).replaceAll("%2B");
/*     */       
/* 360 */       return URLDecoder.decode(s, cs.name());
/* 361 */     } catch (UnsupportedEncodingException e) {
/* 362 */       throw new IllegalStateException("Charset `" + cs.name() + "' not supported", e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\DataUri.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */