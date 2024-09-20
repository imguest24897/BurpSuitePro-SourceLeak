/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.io.Serializable;
/*     */ import java.text.ParseException;
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
/*     */ public abstract class JOSEObject
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   public static final String MIME_TYPE_COMPACT = "application/jose; charset=UTF-8";
/*     */   @Deprecated
/*     */   public static final String MIME_TYPE_JS = "application/jose+json; charset=UTF-8";
/*     */   private Payload payload;
/*     */   private Base64URL[] parsedParts;
/*     */   
/*     */   protected JOSEObject() {
/*  80 */     this.payload = null;
/*  81 */     this.parsedParts = null;
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
/*     */   protected JOSEObject(Payload payload) {
/*  93 */     this.payload = payload;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract Header getHeader();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setPayload(Payload payload) {
/* 113 */     this.payload = payload;
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
/*     */   public Payload getPayload() {
/* 125 */     return this.payload;
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
/*     */   protected void setParsedParts(Base64URL... parts) {
/* 140 */     this.parsedParts = parts;
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
/*     */   public Base64URL[] getParsedParts() {
/* 155 */     return this.parsedParts;
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
/*     */   public String getParsedString() {
/* 169 */     if (this.parsedParts == null) {
/* 170 */       return null;
/*     */     }
/*     */     
/* 173 */     StringBuilder sb = new StringBuilder();
/*     */     
/* 175 */     for (Base64URL part : this.parsedParts) {
/*     */       
/* 177 */       if (sb.length() > 0) {
/* 178 */         sb.append('.');
/*     */       }
/*     */       
/* 181 */       if (part != null) {
/* 182 */         sb.append(part);
/*     */       }
/*     */     } 
/*     */     
/* 186 */     return sb.toString();
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
/*     */   public abstract String serialize();
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
/*     */   public static Base64URL[] split(String s) throws ParseException {
/* 218 */     String t = s.trim();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     int dot1 = t.indexOf(".");
/*     */     
/* 225 */     if (dot1 == -1) {
/* 226 */       throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
/*     */     }
/*     */     
/* 229 */     int dot2 = t.indexOf(".", dot1 + 1);
/*     */     
/* 231 */     if (dot2 == -1) {
/* 232 */       throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
/*     */     }
/*     */ 
/*     */     
/* 236 */     int dot3 = t.indexOf(".", dot2 + 1);
/*     */     
/* 238 */     if (dot3 == -1) {
/*     */ 
/*     */       
/* 241 */       Base64URL[] arrayOfBase64URL = new Base64URL[3];
/* 242 */       arrayOfBase64URL[0] = new Base64URL(t.substring(0, dot1));
/* 243 */       arrayOfBase64URL[1] = new Base64URL(t.substring(dot1 + 1, dot2));
/* 244 */       arrayOfBase64URL[2] = new Base64URL(t.substring(dot2 + 1));
/* 245 */       return arrayOfBase64URL;
/*     */     } 
/*     */ 
/*     */     
/* 249 */     int dot4 = t.indexOf(".", dot3 + 1);
/*     */     
/* 251 */     if (dot4 == -1) {
/* 252 */       throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
/*     */     }
/*     */     
/* 255 */     if (dot4 != -1 && t.indexOf(".", dot4 + 1) != -1) {
/* 256 */       throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
/*     */     }
/*     */ 
/*     */     
/* 260 */     Base64URL[] parts = new Base64URL[5];
/* 261 */     parts[0] = new Base64URL(t.substring(0, dot1));
/* 262 */     parts[1] = new Base64URL(t.substring(dot1 + 1, dot2));
/* 263 */     parts[2] = new Base64URL(t.substring(dot2 + 1, dot3));
/* 264 */     parts[3] = new Base64URL(t.substring(dot3 + 1, dot4));
/* 265 */     parts[4] = new Base64URL(t.substring(dot4 + 1));
/* 266 */     return parts;
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
/*     */   public static JOSEObject parse(String s) throws ParseException {
/*     */     Map<String, Object> jsonObject;
/* 284 */     Base64URL[] parts = split(s);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 289 */       jsonObject = JSONObjectUtils.parse(parts[0].decodeToString());
/*     */     }
/* 291 */     catch (ParseException e) {
/*     */       
/* 293 */       throw new ParseException("Invalid unsecured/JWS/JWE header: " + e.getMessage(), 0);
/*     */     } 
/*     */     
/* 296 */     Algorithm alg = Header.parseAlgorithm(jsonObject);
/*     */     
/* 298 */     if (alg.equals(Algorithm.NONE))
/* 299 */       return PlainObject.parse(s); 
/* 300 */     if (alg instanceof JWSAlgorithm)
/* 301 */       return JWSObject.parse(s); 
/* 302 */     if (alg instanceof JWEAlgorithm) {
/* 303 */       return JWEObject.parse(s);
/*     */     }
/* 305 */     throw new AssertionError("Unexpected algorithm type: " + alg);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JOSEObject.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */