/*     */ package com.nimbusds.jwt.proc;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSVerifier;
/*     */ import com.nimbusds.jose.KeySourceException;
/*     */ import com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory;
/*     */ import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
/*     */ import com.nimbusds.jose.proc.BadJOSEException;
/*     */ import com.nimbusds.jose.proc.BadJWEException;
/*     */ import com.nimbusds.jose.proc.BadJWSException;
/*     */ import com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier;
/*     */ import com.nimbusds.jose.proc.JOSEObjectTypeVerifier;
/*     */ import com.nimbusds.jose.proc.JWEDecrypterFactory;
/*     */ import com.nimbusds.jose.proc.JWEKeySelector;
/*     */ import com.nimbusds.jose.proc.JWSKeySelector;
/*     */ import com.nimbusds.jose.proc.JWSVerifierFactory;
/*     */ import com.nimbusds.jose.proc.SecurityContext;
/*     */ import com.nimbusds.jwt.EncryptedJWT;
/*     */ import com.nimbusds.jwt.JWT;
/*     */ import com.nimbusds.jwt.JWTClaimsSet;
/*     */ import com.nimbusds.jwt.JWTParser;
/*     */ import com.nimbusds.jwt.PlainJWT;
/*     */ import com.nimbusds.jwt.SignedJWT;
/*     */ import java.security.Key;
/*     */ import java.text.ParseException;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DefaultJWTProcessor<C extends SecurityContext>
/*     */   implements ConfigurableJWTProcessor<C>
/*     */ {
/*  97 */   private JOSEObjectTypeVerifier<C> jwsTypeVerifier = (JOSEObjectTypeVerifier<C>)DefaultJOSEObjectTypeVerifier.JWT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 103 */   private JOSEObjectTypeVerifier<C> jweTypeVerifier = (JOSEObjectTypeVerifier<C>)DefaultJOSEObjectTypeVerifier.JWT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JWSKeySelector<C> jwsKeySelector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JWTClaimsSetAwareJWSKeySelector<C> claimsSetAwareJWSKeySelector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JWEKeySelector<C> jweKeySelector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 128 */   private JWSVerifierFactory jwsVerifierFactory = (JWSVerifierFactory)new DefaultJWSVerifierFactory();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 134 */   private JWEDecrypterFactory jweDecrypterFactory = (JWEDecrypterFactory)new DefaultJWEDecrypterFactory();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 140 */   private JWTClaimsSetVerifier<C> claimsVerifier = new DefaultJWTClaimsVerifier<>(null, null);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
/* 146 */     return this.jwsTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSTypeVerifier(JOSEObjectTypeVerifier<C> jwsTypeVerifier) {
/* 153 */     this.jwsTypeVerifier = jwsTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSKeySelector<C> getJWSKeySelector() {
/* 160 */     return this.jwsKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSKeySelector(JWSKeySelector<C> jwsKeySelector) {
/* 167 */     this.jwsKeySelector = jwsKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSetAwareJWSKeySelector<C> getJWTClaimsSetAwareJWSKeySelector() {
/* 174 */     return this.claimsSetAwareJWSKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWTClaimsSetAwareJWSKeySelector(JWTClaimsSetAwareJWSKeySelector<C> jwsKeySelector) {
/* 181 */     this.claimsSetAwareJWSKeySelector = jwsKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
/* 188 */     return this.jweTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWETypeVerifier(JOSEObjectTypeVerifier<C> jweTypeVerifier) {
/* 195 */     this.jweTypeVerifier = jweTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEKeySelector<C> getJWEKeySelector() {
/* 202 */     return this.jweKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWEKeySelector(JWEKeySelector<C> jweKeySelector) {
/* 209 */     this.jweKeySelector = jweKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSVerifierFactory getJWSVerifierFactory() {
/* 216 */     return this.jwsVerifierFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSVerifierFactory(JWSVerifierFactory factory) {
/* 223 */     this.jwsVerifierFactory = factory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEDecrypterFactory getJWEDecrypterFactory() {
/* 230 */     return this.jweDecrypterFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWEDecrypterFactory(JWEDecrypterFactory factory) {
/* 237 */     this.jweDecrypterFactory = factory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier() {
/* 244 */     return this.claimsVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWTClaimsSetVerifier(JWTClaimsSetVerifier<C> claimsVerifier) {
/* 251 */     this.claimsVerifier = claimsVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JWTClaimsSet extractJWTClaimsSet(JWT jwt) throws BadJWTException {
/*     */     try {
/* 259 */       return jwt.getJWTClaimsSet();
/* 260 */     } catch (ParseException e) {
/*     */       
/* 262 */       throw new BadJWTException(e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JWTClaimsSet verifyClaims(JWTClaimsSet claimsSet, C context) throws BadJWTException {
/* 270 */     if (getJWTClaimsSetVerifier() != null) {
/* 271 */       getJWTClaimsSetVerifier().verify(claimsSet, context);
/*     */     }
/* 273 */     return claimsSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private List<? extends Key> selectKeys(JWSHeader header, JWTClaimsSet claimsSet, C context) throws KeySourceException, BadJOSEException {
/* 280 */     if (getJWTClaimsSetAwareJWSKeySelector() != null)
/* 281 */       return getJWTClaimsSetAwareJWSKeySelector().selectKeys(header, claimsSet, context); 
/* 282 */     if (getJWSKeySelector() != null) {
/* 283 */       return getJWSKeySelector().selectJWSKeys(header, (SecurityContext)context);
/*     */     }
/* 285 */     throw new BadJOSEException("Signed JWT rejected: No JWS key selector is configured");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet process(String jwtString, C context) throws ParseException, BadJOSEException, JOSEException {
/* 294 */     return process(JWTParser.parse(jwtString), context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet process(JWT jwt, C context) throws BadJOSEException, JOSEException {
/* 302 */     if (jwt instanceof SignedJWT) {
/* 303 */       return process((SignedJWT)jwt, context);
/*     */     }
/*     */     
/* 306 */     if (jwt instanceof EncryptedJWT) {
/* 307 */       return process((EncryptedJWT)jwt, context);
/*     */     }
/*     */     
/* 310 */     if (jwt instanceof PlainJWT) {
/* 311 */       return process((PlainJWT)jwt, context);
/*     */     }
/*     */ 
/*     */     
/* 315 */     throw new JOSEException("Unexpected JWT object type: " + jwt.getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet process(PlainJWT plainJWT, C context) throws BadJOSEException, JOSEException {
/* 324 */     if (this.jwsTypeVerifier == null) {
/* 325 */       throw new BadJOSEException("Plain JWT rejected: No JWS header typ (type) verifier is configured");
/*     */     }
/* 327 */     this.jwsTypeVerifier.verify(plainJWT.getHeader().getType(), (SecurityContext)context);
/*     */     
/* 329 */     throw new BadJOSEException("Unsecured (plain) JWTs are rejected, extend class to handle");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet process(SignedJWT signedJWT, C context) throws BadJOSEException, JOSEException {
/* 337 */     if (this.jwsTypeVerifier == null) {
/* 338 */       throw new BadJOSEException("Signed JWT rejected: No JWS header typ (type) verifier is configured");
/*     */     }
/*     */     
/* 341 */     this.jwsTypeVerifier.verify(signedJWT.getHeader().getType(), (SecurityContext)context);
/*     */     
/* 343 */     if (getJWSKeySelector() == null && getJWTClaimsSetAwareJWSKeySelector() == null)
/*     */     {
/* 345 */       throw new BadJOSEException("Signed JWT rejected: No JWS key selector is configured");
/*     */     }
/*     */     
/* 348 */     if (getJWSVerifierFactory() == null) {
/* 349 */       throw new JOSEException("No JWS verifier is configured");
/*     */     }
/*     */     
/* 352 */     JWTClaimsSet claimsSet = extractJWTClaimsSet((JWT)signedJWT);
/*     */     
/* 354 */     List<? extends Key> keyCandidates = selectKeys(signedJWT.getHeader(), claimsSet, context);
/*     */     
/* 356 */     if (keyCandidates == null || keyCandidates.isEmpty()) {
/* 357 */       throw new BadJOSEException("Signed JWT rejected: Another algorithm expected, or no matching key(s) found");
/*     */     }
/*     */     
/* 360 */     ListIterator<? extends Key> it = keyCandidates.listIterator();
/*     */     
/* 362 */     while (it.hasNext()) {
/*     */       
/* 364 */       JWSVerifier verifier = getJWSVerifierFactory().createJWSVerifier(signedJWT.getHeader(), it.next());
/*     */       
/* 366 */       if (verifier == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 370 */       boolean validSignature = signedJWT.verify(verifier);
/*     */       
/* 372 */       if (validSignature) {
/* 373 */         return verifyClaims(claimsSet, context);
/*     */       }
/*     */       
/* 376 */       if (!it.hasNext())
/*     */       {
/* 378 */         throw new BadJWSException("Signed JWT rejected: Invalid signature");
/*     */       }
/*     */     } 
/*     */     
/* 382 */     throw new BadJOSEException("JWS object rejected: No matching verifier(s) found");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet process(EncryptedJWT encryptedJWT, C context) throws BadJOSEException, JOSEException {
/* 390 */     if (this.jweTypeVerifier == null) {
/* 391 */       throw new BadJOSEException("Encrypted JWT rejected: No JWE header typ (type) verifier is configured");
/*     */     }
/*     */     
/* 394 */     this.jweTypeVerifier.verify(encryptedJWT.getHeader().getType(), (SecurityContext)context);
/*     */     
/* 396 */     if (getJWEKeySelector() == null)
/*     */     {
/* 398 */       throw new BadJOSEException("Encrypted JWT rejected: No JWE key selector is configured");
/*     */     }
/*     */     
/* 401 */     if (getJWEDecrypterFactory() == null) {
/* 402 */       throw new JOSEException("No JWE decrypter is configured");
/*     */     }
/*     */     
/* 405 */     List<? extends Key> keyCandidates = getJWEKeySelector().selectJWEKeys(encryptedJWT.getHeader(), (SecurityContext)context);
/*     */     
/* 407 */     if (keyCandidates == null || keyCandidates.isEmpty()) {
/* 408 */       throw new BadJOSEException("Encrypted JWT rejected: Another algorithm expected, or no matching key(s) found");
/*     */     }
/*     */     
/* 411 */     ListIterator<? extends Key> it = keyCandidates.listIterator();
/*     */     
/* 413 */     while (it.hasNext()) {
/*     */       
/* 415 */       JWEDecrypter decrypter = getJWEDecrypterFactory().createJWEDecrypter(encryptedJWT.getHeader(), it.next());
/*     */       
/* 417 */       if (decrypter == null) {
/*     */         continue;
/*     */       }
/*     */       
/*     */       try {
/* 422 */         encryptedJWT.decrypt(decrypter);
/*     */       }
/* 424 */       catch (JOSEException e) {
/*     */         
/* 426 */         if (it.hasNext()) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 432 */         throw new BadJWEException("Encrypted JWT rejected: " + e.getMessage(), e);
/*     */       } 
/*     */       
/* 435 */       if ("JWT".equalsIgnoreCase(encryptedJWT.getHeader().getContentType())) {
/*     */ 
/*     */         
/* 438 */         SignedJWT signedJWTPayload = encryptedJWT.getPayload().toSignedJWT();
/*     */         
/* 440 */         if (signedJWTPayload == null)
/*     */         {
/* 442 */           throw new BadJWTException("The payload is not a nested signed JWT");
/*     */         }
/*     */         
/* 445 */         return process(signedJWTPayload, context);
/*     */       } 
/*     */       
/* 448 */       JWTClaimsSet claimsSet = extractJWTClaimsSet((JWT)encryptedJWT);
/* 449 */       return verifyClaims(claimsSet, context);
/*     */     } 
/*     */     
/* 452 */     throw new BadJOSEException("Encrypted JWT rejected: No matching decrypter(s) found");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\proc\DefaultJWTProcessor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */