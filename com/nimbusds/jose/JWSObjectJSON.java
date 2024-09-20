/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONArrayUtils;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import net.jcip.annotations.Immutable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ThreadSafe
/*     */ public class JWSObjectJSON
/*     */   extends JOSEObjectJSON
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   
/*     */   @Immutable
/*     */   public static final class Signature
/*     */   {
/*     */     private final Payload payload;
/*     */     private final JWSHeader header;
/*     */     private final UnprotectedHeader unprotectedHeader;
/*     */     private final Base64URL signature;
/*  84 */     private final AtomicBoolean verified = new AtomicBoolean(false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Signature(Payload payload, JWSHeader header, UnprotectedHeader unprotectedHeader, Base64URL signature) {
/* 104 */       Objects.requireNonNull(payload);
/* 105 */       this.payload = payload;
/*     */       
/* 107 */       this.header = header;
/* 108 */       this.unprotectedHeader = unprotectedHeader;
/*     */       
/* 110 */       Objects.requireNonNull(signature);
/* 111 */       this.signature = signature;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public JWSHeader getHeader() {
/* 121 */       return this.header;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UnprotectedHeader getUnprotectedHeader() {
/* 131 */       return this.unprotectedHeader;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Base64URL getSignature() {
/* 141 */       return this.signature;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Map<String, Object> toJSONObject() {
/* 153 */       Map<String, Object> jsonObject = JSONObjectUtils.newJSONObject();
/*     */       
/* 155 */       if (this.header != null) {
/* 156 */         jsonObject.put("protected", this.header.toBase64URL().toString());
/*     */       }
/*     */       
/* 159 */       if (this.unprotectedHeader != null && !this.unprotectedHeader.getIncludedParams().isEmpty()) {
/* 160 */         jsonObject.put("header", this.unprotectedHeader.toJSONObject());
/*     */       }
/*     */       
/* 163 */       jsonObject.put("signature", this.signature.toString());
/*     */       
/* 165 */       return jsonObject;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public JWSObject toJWSObject() {
/*     */       try {
/* 178 */         return new JWSObject(this.header.toBase64URL(), this.payload.toBase64URL(), this.signature);
/* 179 */       } catch (ParseException e) {
/* 180 */         throw new IllegalStateException();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isVerified() {
/* 194 */       return this.verified.get();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public synchronized boolean verify(JWSVerifier verifier) throws JOSEException {
/*     */       try {
/* 212 */         this.verified.set(toJWSObject().verify(verifier));
/* 213 */       } catch (JOSEException e) {
/* 214 */         throw e;
/* 215 */       } catch (Exception e) {
/*     */ 
/*     */         
/* 218 */         throw new JOSEException(e.getMessage(), e);
/*     */       } 
/*     */       
/* 221 */       return this.verified.get();
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
/*     */   public enum State
/*     */   {
/* 236 */     UNSIGNED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     SIGNED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     VERIFIED;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 256 */   private final List<Signature> signatures = new LinkedList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSObjectJSON(Payload payload) {
/* 267 */     super(payload);
/* 268 */     Objects.requireNonNull(payload, "The payload must not be null");
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
/*     */   private JWSObjectJSON(Payload payload, List<Signature> signatures) {
/* 282 */     super(payload);
/*     */     
/* 284 */     Objects.requireNonNull(payload, "The payload must not be null");
/*     */     
/* 286 */     if (signatures.isEmpty()) {
/* 287 */       throw new IllegalArgumentException("At least one signature required");
/*     */     }
/*     */     
/* 290 */     this.signatures.addAll(signatures);
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
/*     */   public List<Signature> getSignatures() {
/* 302 */     return Collections.unmodifiableList(this.signatures);
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
/*     */   public synchronized void sign(JWSHeader jwsHeader, JWSSigner signer) throws JOSEException {
/* 322 */     sign(jwsHeader, null, signer);
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
/*     */   public synchronized void sign(JWSHeader jwsHeader, UnprotectedHeader unprotectedHeader, JWSSigner signer) throws JOSEException {
/*     */     try {
/* 348 */       HeaderValidation.ensureDisjoint(jwsHeader, unprotectedHeader);
/* 349 */     } catch (IllegalHeaderException e) {
/* 350 */       throw new IllegalArgumentException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 353 */     JWSObject jwsObject = new JWSObject(jwsHeader, getPayload());
/* 354 */     jwsObject.sign(signer);
/*     */     
/* 356 */     this.signatures.add(new Signature(getPayload(), jwsHeader, unprotectedHeader, jwsObject.getSignature()));
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
/* 367 */     if (getSignatures().isEmpty()) {
/* 368 */       return State.UNSIGNED;
/*     */     }
/*     */     
/* 371 */     for (Signature sig : getSignatures()) {
/* 372 */       if (!sig.isVerified()) {
/* 373 */         return State.SIGNED;
/*     */       }
/*     */     } 
/*     */     
/* 377 */     return State.VERIFIED;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toGeneralJSONObject() {
/* 384 */     if (this.signatures.size() < 1) {
/* 385 */       throw new IllegalStateException("The general JWS JSON serialization requires at least one signature");
/*     */     }
/*     */     
/* 388 */     Map<String, Object> jsonObject = JSONObjectUtils.newJSONObject();
/* 389 */     jsonObject.put("payload", getPayload().toBase64URL().toString());
/*     */     
/* 391 */     List<Object> signaturesJSONArray = JSONArrayUtils.newJSONArray();
/*     */     
/* 393 */     for (Signature signature : getSignatures()) {
/* 394 */       Map<String, Object> signatureJSONObject = signature.toJSONObject();
/* 395 */       signaturesJSONArray.add(signatureJSONObject);
/*     */     } 
/*     */     
/* 398 */     jsonObject.put("signatures", signaturesJSONArray);
/*     */     
/* 400 */     return jsonObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toFlattenedJSONObject() {
/* 407 */     if (this.signatures.size() != 1) {
/* 408 */       throw new IllegalStateException("The flattened JWS JSON serialization requires exactly one signature");
/*     */     }
/*     */     
/* 411 */     Map<String, Object> jsonObject = JSONObjectUtils.newJSONObject();
/* 412 */     jsonObject.put("payload", getPayload().toBase64URL().toString());
/* 413 */     jsonObject.putAll(((Signature)getSignatures().get(0)).toJSONObject());
/* 414 */     return jsonObject;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String serializeGeneral() {
/* 420 */     return JSONObjectUtils.toJSONString(toGeneralJSONObject());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String serializeFlattened() {
/* 426 */     return JSONObjectUtils.toJSONString(toFlattenedJSONObject());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static JWSHeader parseJWSHeader(Map<String, Object> jsonObject) throws ParseException {
/* 433 */     Base64URL protectedHeader = JSONObjectUtils.getBase64URL(jsonObject, "protected");
/*     */     
/* 435 */     if (protectedHeader == null) {
/* 436 */       throw new ParseException("Missing protected header (required by this library)", 0);
/*     */     }
/*     */     
/*     */     try {
/* 440 */       return JWSHeader.parse(protectedHeader);
/* 441 */     } catch (ParseException e) {
/* 442 */       if ("Not a JWS header".equals(e.getMessage()))
/*     */       {
/* 444 */         throw new ParseException("Missing JWS \"alg\" parameter in protected header (required by this library)", 0);
/*     */       }
/* 446 */       throw e;
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
/*     */ 
/*     */   
/*     */   public static JWSObjectJSON parse(Map<String, Object> jsonObject) throws ParseException {
/* 467 */     Base64URL payloadB64URL = JSONObjectUtils.getBase64URL(jsonObject, "payload");
/*     */     
/* 469 */     if (payloadB64URL == null) {
/* 470 */       throw new ParseException("Missing payload", 0);
/*     */     }
/*     */     
/* 473 */     Payload payload = new Payload(payloadB64URL);
/*     */ 
/*     */     
/* 476 */     Base64URL topLevelSignatureB64 = JSONObjectUtils.getBase64URL(jsonObject, "signature");
/*     */     
/* 478 */     boolean flattened = (topLevelSignatureB64 != null);
/*     */     
/* 480 */     List<Signature> signatureList = new LinkedList<>();
/*     */     
/* 482 */     if (flattened) {
/*     */       
/* 484 */       JWSHeader jwsHeader = parseJWSHeader(jsonObject);
/*     */       
/* 486 */       UnprotectedHeader unprotectedHeader = UnprotectedHeader.parse(JSONObjectUtils.getJSONObject(jsonObject, "header"));
/*     */ 
/*     */ 
/*     */       
/* 490 */       if (jsonObject.get("signatures") != null) {
/* 491 */         throw new ParseException("The \"signatures\" member must not be present in flattened JWS JSON serialization", 0);
/*     */       }
/*     */       
/*     */       try {
/* 495 */         HeaderValidation.ensureDisjoint(jwsHeader, unprotectedHeader);
/* 496 */       } catch (IllegalHeaderException e) {
/* 497 */         throw new ParseException(e.getMessage(), 0);
/*     */       } 
/*     */       
/* 500 */       signatureList.add(new Signature(payload, jwsHeader, unprotectedHeader, topLevelSignatureB64));
/*     */     } else {
/*     */       
/* 503 */       Map[] arrayOfMap = JSONObjectUtils.getJSONObjectArray(jsonObject, "signatures");
/* 504 */       if (arrayOfMap == null || arrayOfMap.length == 0) {
/* 505 */         throw new ParseException("The \"signatures\" member must be present in general JSON Serialization", 0);
/*     */       }
/*     */       
/* 508 */       for (Map<String, Object> signatureJSONObject : arrayOfMap) {
/*     */         
/* 510 */         JWSHeader jwsHeader = parseJWSHeader(signatureJSONObject);
/*     */         
/* 512 */         UnprotectedHeader unprotectedHeader = UnprotectedHeader.parse(JSONObjectUtils.getJSONObject(signatureJSONObject, "header"));
/*     */         
/*     */         try {
/* 515 */           HeaderValidation.ensureDisjoint(jwsHeader, unprotectedHeader);
/* 516 */         } catch (IllegalHeaderException e) {
/* 517 */           throw new ParseException(e.getMessage(), 0);
/*     */         } 
/*     */         
/* 520 */         Base64URL signatureB64 = JSONObjectUtils.getBase64URL(signatureJSONObject, "signature");
/*     */         
/* 522 */         if (signatureB64 == null) {
/* 523 */           throw new ParseException("Missing \"signature\" member", 0);
/*     */         }
/*     */         
/* 526 */         signatureList.add(new Signature(payload, jwsHeader, unprotectedHeader, signatureB64));
/*     */       } 
/*     */     } 
/*     */     
/* 530 */     return new JWSObjectJSON(payload, signatureList);
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
/*     */   public static JWSObjectJSON parse(String json) throws ParseException {
/* 548 */     return parse(JSONObjectUtils.parse(json));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSObjectJSON.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */