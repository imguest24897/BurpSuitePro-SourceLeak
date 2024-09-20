/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.text.ParseException;
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
/*     */ @ThreadSafe
/*     */ public class JWEObject
/*     */   extends JOSEObject
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JWEHeader header;
/*     */   private Base64URL encryptedKey;
/*     */   private Base64URL iv;
/*     */   private Base64URL cipherText;
/*     */   private Base64URL authTag;
/*     */   private State state;
/*     */   
/*     */   public enum State
/*     */   {
/*  55 */     UNENCRYPTED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     ENCRYPTED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     DECRYPTED;
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
/*     */   public JWEObject(JWEHeader header, Payload payload) {
/* 118 */     if (header == null)
/*     */     {
/* 120 */       throw new IllegalArgumentException("The JWE header must not be null");
/*     */     }
/*     */     
/* 123 */     this.header = header;
/*     */     
/* 125 */     if (payload == null)
/*     */     {
/* 127 */       throw new IllegalArgumentException("The payload must not be null");
/*     */     }
/*     */     
/* 130 */     setPayload(payload);
/*     */     
/* 132 */     this.encryptedKey = null;
/*     */     
/* 134 */     this.cipherText = null;
/*     */     
/* 136 */     this.state = State.UNENCRYPTED;
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
/*     */   public JWEObject(Base64URL firstPart, Base64URL secondPart, Base64URL thirdPart, Base64URL fourthPart, Base64URL fifthPart) throws ParseException {
/* 166 */     if (firstPart == null)
/*     */     {
/* 168 */       throw new IllegalArgumentException("The first part must not be null");
/*     */     }
/*     */     
/*     */     try {
/* 172 */       this.header = JWEHeader.parse(firstPart);
/*     */     }
/* 174 */     catch (ParseException e) {
/*     */       
/* 176 */       throw new ParseException("Invalid JWE header: " + e.getMessage(), 0);
/*     */     } 
/*     */     
/* 179 */     if (secondPart == null || secondPart.toString().isEmpty()) {
/*     */       
/* 181 */       this.encryptedKey = null;
/*     */     }
/*     */     else {
/*     */       
/* 185 */       this.encryptedKey = secondPart;
/*     */     } 
/*     */     
/* 188 */     if (thirdPart == null || thirdPart.toString().isEmpty()) {
/*     */       
/* 190 */       this.iv = null;
/*     */     }
/*     */     else {
/*     */       
/* 194 */       this.iv = thirdPart;
/*     */     } 
/*     */     
/* 197 */     if (fourthPart == null)
/*     */     {
/* 199 */       throw new IllegalArgumentException("The fourth part must not be null");
/*     */     }
/*     */     
/* 202 */     this.cipherText = fourthPart;
/*     */     
/* 204 */     if (fifthPart == null || fifthPart.toString().isEmpty()) {
/*     */       
/* 206 */       this.authTag = null;
/*     */     }
/*     */     else {
/*     */       
/* 210 */       this.authTag = fifthPart;
/*     */     } 
/*     */     
/* 213 */     this.state = State.ENCRYPTED;
/*     */     
/* 215 */     setParsedParts(new Base64URL[] { firstPart, secondPart, thirdPart, fourthPart, fifthPart });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEHeader getHeader() {
/* 222 */     return this.header;
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
/*     */   public Base64URL getEncryptedKey() {
/* 234 */     return this.encryptedKey;
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
/*     */   public Base64URL getIV() {
/* 246 */     return this.iv;
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
/*     */   public Base64URL getCipherText() {
/* 258 */     return this.cipherText;
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
/*     */   public Base64URL getAuthTag() {
/* 270 */     return this.authTag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public State getState() {
/* 281 */     return this.state;
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
/*     */   private void ensureUnencryptedState() {
/* 293 */     if (this.state != State.UNENCRYPTED)
/*     */     {
/* 295 */       throw new IllegalStateException("The JWE object must be in an unencrypted state");
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
/*     */   private void ensureEncryptedState() {
/* 307 */     if (this.state != State.ENCRYPTED)
/*     */     {
/* 309 */       throw new IllegalStateException("The JWE object must be in an encrypted state");
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
/*     */   private void ensureEncryptedOrDecryptedState() {
/* 323 */     if (this.state != State.ENCRYPTED && this.state != State.DECRYPTED)
/*     */     {
/* 325 */       throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
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
/*     */   private void ensureJWEEncrypterSupport(JWEEncrypter encrypter) throws JOSEException {
/* 339 */     if (!encrypter.supportedJWEAlgorithms().contains(getHeader().getAlgorithm()))
/*     */     {
/* 341 */       throw new JOSEException("The " + getHeader().getAlgorithm() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + encrypter
/* 342 */           .supportedJWEAlgorithms());
/*     */     }
/*     */     
/* 345 */     if (!encrypter.supportedEncryptionMethods().contains(getHeader().getEncryptionMethod()))
/*     */     {
/* 347 */       throw new JOSEException("The " + getHeader().getEncryptionMethod() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + encrypter
/* 348 */           .supportedEncryptionMethods());
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
/*     */ 
/*     */   
/*     */   public synchronized void encrypt(JWEEncrypter encrypter) throws JOSEException {
/*     */     JWECryptoParts parts;
/* 368 */     ensureUnencryptedState();
/*     */     
/* 370 */     ensureJWEEncrypterSupport(encrypter);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 375 */       parts = encrypter.encrypt(getHeader(), getPayload().toBytes());
/*     */     }
/* 377 */     catch (JOSEException e) {
/*     */       
/* 379 */       throw e;
/*     */     }
/* 381 */     catch (Exception e) {
/*     */ 
/*     */ 
/*     */       
/* 385 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */ 
/*     */     
/* 389 */     if (parts.getHeader() != null) {
/* 390 */       this.header = parts.getHeader();
/*     */     }
/*     */     
/* 393 */     this.encryptedKey = parts.getEncryptedKey();
/* 394 */     this.iv = parts.getInitializationVector();
/* 395 */     this.cipherText = parts.getCipherText();
/* 396 */     this.authTag = parts.getAuthenticationTag();
/*     */     
/* 398 */     this.state = State.ENCRYPTED;
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
/*     */   public synchronized void decrypt(JWEDecrypter decrypter) throws JOSEException {
/* 417 */     ensureEncryptedState();
/*     */     
/*     */     try {
/* 420 */       setPayload(new Payload(decrypter.decrypt(getHeader(), 
/* 421 */               getEncryptedKey(), 
/* 422 */               getIV(), 
/* 423 */               getCipherText(), 
/* 424 */               getAuthTag())));
/*     */     }
/* 426 */     catch (JOSEException e) {
/*     */       
/* 428 */       throw e;
/*     */     }
/* 430 */     catch (Exception e) {
/*     */ 
/*     */ 
/*     */       
/* 434 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 437 */     this.state = State.DECRYPTED;
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
/*     */   public String serialize() {
/* 461 */     ensureEncryptedOrDecryptedState();
/*     */     
/* 463 */     StringBuilder sb = new StringBuilder(this.header.toBase64URL().toString());
/* 464 */     sb.append('.');
/*     */     
/* 466 */     if (this.encryptedKey != null) {
/* 467 */       sb.append(this.encryptedKey);
/*     */     }
/*     */     
/* 470 */     sb.append('.');
/*     */     
/* 472 */     if (this.iv != null) {
/* 473 */       sb.append(this.iv);
/*     */     }
/*     */     
/* 476 */     sb.append('.');
/* 477 */     sb.append(this.cipherText);
/* 478 */     sb.append('.');
/*     */     
/* 480 */     if (this.authTag != null) {
/* 481 */       sb.append(this.authTag);
/*     */     }
/*     */     
/* 484 */     return sb.toString();
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
/*     */   public static JWEObject parse(String s) throws ParseException {
/* 502 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 504 */     if (parts.length != 5)
/*     */     {
/* 506 */       throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
/*     */     }
/*     */     
/* 509 */     return new JWEObject(parts[0], parts[1], parts[2], parts[3], parts[4]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWEObject.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */