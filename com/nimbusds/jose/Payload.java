/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import com.nimbusds.jwt.SignedJWT;
/*     */ import java.io.Serializable;
/*     */ import java.text.ParseException;
/*     */ import java.util.Map;
/*     */ import net.jcip.annotations.Immutable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public final class Payload
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final Origin origin;
/*     */   private final Map<String, Object> jsonObject;
/*     */   private final String string;
/*     */   private final byte[] bytes;
/*     */   private final Base64URL base64URL;
/*     */   private final JWSObject jwsObject;
/*     */   private final SignedJWT signedJWT;
/*     */   
/*     */   public enum Origin
/*     */   {
/*  69 */     JSON,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     STRING,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     BYTE_ARRAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     BASE64URL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     JWS_OBJECT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     SIGNED_JWT;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String byteArrayToString(byte[] bytes) {
/* 157 */     return (bytes != null) ? new String(bytes, StandardCharset.UTF_8) : null;
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
/*     */   private static byte[] stringToByteArray(String string) {
/* 170 */     return (string != null) ? string.getBytes(StandardCharset.UTF_8) : null;
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
/*     */   public Payload(Map<String, Object> jsonObject) {
/* 182 */     if (jsonObject == null) {
/* 183 */       throw new IllegalArgumentException("The JSON object must not be null");
/*     */     }
/*     */     
/* 186 */     this.jsonObject = JSONObjectUtils.newJSONObject();
/* 187 */     this.jsonObject.putAll(jsonObject);
/* 188 */     this.string = null;
/* 189 */     this.bytes = null;
/* 190 */     this.base64URL = null;
/* 191 */     this.jwsObject = null;
/* 192 */     this.signedJWT = null;
/*     */     
/* 194 */     this.origin = Origin.JSON;
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
/*     */   public Payload(String string) {
/* 206 */     if (string == null) {
/* 207 */       throw new IllegalArgumentException("The string must not be null");
/*     */     }
/*     */     
/* 210 */     this.jsonObject = null;
/* 211 */     this.string = string;
/* 212 */     this.bytes = null;
/* 213 */     this.base64URL = null;
/* 214 */     this.jwsObject = null;
/* 215 */     this.signedJWT = null;
/*     */     
/* 217 */     this.origin = Origin.STRING;
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
/*     */   public Payload(byte[] bytes) {
/* 229 */     if (bytes == null) {
/* 230 */       throw new IllegalArgumentException("The byte array must not be null");
/*     */     }
/*     */     
/* 233 */     this.jsonObject = null;
/* 234 */     this.string = null;
/* 235 */     this.bytes = bytes;
/* 236 */     this.base64URL = null;
/* 237 */     this.jwsObject = null;
/* 238 */     this.signedJWT = null;
/*     */     
/* 240 */     this.origin = Origin.BYTE_ARRAY;
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
/*     */   public Payload(Base64URL base64URL) {
/* 252 */     if (base64URL == null) {
/* 253 */       throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
/*     */     }
/*     */     
/* 256 */     this.jsonObject = null;
/* 257 */     this.string = null;
/* 258 */     this.bytes = null;
/* 259 */     this.base64URL = base64URL;
/* 260 */     this.jwsObject = null;
/* 261 */     this.signedJWT = null;
/*     */     
/* 263 */     this.origin = Origin.BASE64URL;
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
/*     */   public Payload(JWSObject jwsObject) {
/* 276 */     if (jwsObject == null) {
/* 277 */       throw new IllegalArgumentException("The JWS object must not be null");
/*     */     }
/*     */     
/* 280 */     if (jwsObject.getState() == JWSObject.State.UNSIGNED) {
/* 281 */       throw new IllegalArgumentException("The JWS object must be signed");
/*     */     }
/*     */     
/* 284 */     this.jsonObject = null;
/* 285 */     this.string = null;
/* 286 */     this.bytes = null;
/* 287 */     this.base64URL = null;
/* 288 */     this.jwsObject = jwsObject;
/* 289 */     this.signedJWT = null;
/*     */     
/* 291 */     this.origin = Origin.JWS_OBJECT;
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
/*     */   public Payload(SignedJWT signedJWT) {
/* 304 */     if (signedJWT == null) {
/* 305 */       throw new IllegalArgumentException("The signed JWT must not be null");
/*     */     }
/*     */     
/* 308 */     if (signedJWT.getState() == JWSObject.State.UNSIGNED) {
/* 309 */       throw new IllegalArgumentException("The JWT must be signed");
/*     */     }
/*     */     
/* 312 */     this.jsonObject = null;
/* 313 */     this.string = null;
/* 314 */     this.bytes = null;
/* 315 */     this.base64URL = null;
/* 316 */     this.signedJWT = signedJWT;
/* 317 */     this.jwsObject = (JWSObject)signedJWT;
/*     */     
/* 319 */     this.origin = Origin.SIGNED_JWT;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Origin getOrigin() {
/* 330 */     return this.origin;
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
/*     */   public Map<String, Object> toJSONObject() {
/* 342 */     if (this.jsonObject != null) {
/* 343 */       return this.jsonObject;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 348 */     String s = toString();
/*     */     
/* 350 */     if (s == null)
/*     */     {
/* 352 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 356 */       return JSONObjectUtils.parse(s);
/*     */     }
/* 358 */     catch (ParseException e) {
/*     */       
/* 360 */       return null;
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
/*     */   public String toString() {
/* 372 */     if (this.string != null)
/*     */     {
/* 374 */       return this.string;
/*     */     }
/*     */ 
/*     */     
/* 378 */     if (this.jwsObject != null) {
/*     */       
/* 380 */       if (this.jwsObject.getParsedString() != null) {
/* 381 */         return this.jwsObject.getParsedString();
/*     */       }
/* 383 */       return this.jwsObject.serialize();
/*     */     } 
/*     */     
/* 386 */     if (this.jsonObject != null)
/*     */     {
/* 388 */       return JSONObjectUtils.toJSONString(this.jsonObject);
/*     */     }
/* 390 */     if (this.bytes != null)
/*     */     {
/* 392 */       return byteArrayToString(this.bytes);
/*     */     }
/* 394 */     if (this.base64URL != null)
/*     */     {
/* 396 */       return this.base64URL.decodeToString();
/*     */     }
/* 398 */     return null;
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
/*     */   public byte[] toBytes() {
/* 410 */     if (this.bytes != null) {
/* 411 */       return this.bytes;
/*     */     }
/*     */ 
/*     */     
/* 415 */     if (this.base64URL != null) {
/* 416 */       return this.base64URL.decode();
/*     */     }
/*     */ 
/*     */     
/* 420 */     return stringToByteArray(toString());
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
/*     */   public Base64URL toBase64URL() {
/* 432 */     if (this.base64URL != null) {
/* 433 */       return this.base64URL;
/*     */     }
/*     */ 
/*     */     
/* 437 */     return Base64URL.encode(toBytes());
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
/*     */   public JWSObject toJWSObject() {
/* 450 */     if (this.jwsObject != null) {
/* 451 */       return this.jwsObject;
/*     */     }
/*     */     
/*     */     try {
/* 455 */       return JWSObject.parse(toString());
/*     */     }
/* 457 */     catch (ParseException e) {
/*     */       
/* 459 */       return null;
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
/*     */   public SignedJWT toSignedJWT() {
/* 473 */     if (this.signedJWT != null) {
/* 474 */       return this.signedJWT;
/*     */     }
/*     */     
/*     */     try {
/* 478 */       return SignedJWT.parse(toString());
/*     */     }
/* 480 */     catch (ParseException e) {
/*     */       
/* 482 */       return null;
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
/*     */   public <T> T toType(PayloadTransformer<T> transformer) {
/* 498 */     return transformer.transform(this);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\Payload.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */