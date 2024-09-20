/*     */ package com.nimbusds.jose.proc;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JOSEObject;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEObject;
/*     */ import com.nimbusds.jose.JWSObject;
/*     */ import com.nimbusds.jose.JWSVerifier;
/*     */ import com.nimbusds.jose.Payload;
/*     */ import com.nimbusds.jose.PlainObject;
/*     */ import com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory;
/*     */ import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
/*     */ import java.security.Key;
/*     */ import java.text.ParseException;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
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
/*     */ 
/*     */ 
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
/*     */ public class DefaultJOSEProcessor<C extends SecurityContext>
/*     */   implements ConfigurableJOSEProcessor<C>
/*     */ {
/*  89 */   private JOSEObjectTypeVerifier<C> jwsTypeVerifier = DefaultJOSEObjectTypeVerifier.JOSE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   private JOSEObjectTypeVerifier<C> jweTypeVerifier = DefaultJOSEObjectTypeVerifier.JOSE;
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
/*     */   private JWEKeySelector<C> jweKeySelector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 113 */   private JWSVerifierFactory jwsVerifierFactory = (JWSVerifierFactory)new DefaultJWSVerifierFactory();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   private JWEDecrypterFactory jweDecrypterFactory = (JWEDecrypterFactory)new DefaultJWEDecrypterFactory();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
/* 125 */     return this.jwsTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSTypeVerifier(JOSEObjectTypeVerifier<C> jwsTypeVerifier) {
/* 132 */     this.jwsTypeVerifier = jwsTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSKeySelector<C> getJWSKeySelector() {
/* 139 */     return this.jwsKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSKeySelector(JWSKeySelector<C> jwsKeySelector) {
/* 146 */     this.jwsKeySelector = jwsKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
/* 153 */     return this.jweTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWETypeVerifier(JOSEObjectTypeVerifier<C> jweTypeVerifier) {
/* 160 */     this.jweTypeVerifier = jweTypeVerifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEKeySelector<C> getJWEKeySelector() {
/* 167 */     return this.jweKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWEKeySelector(JWEKeySelector<C> jweKeySelector) {
/* 174 */     this.jweKeySelector = jweKeySelector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSVerifierFactory getJWSVerifierFactory() {
/* 181 */     return this.jwsVerifierFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWSVerifierFactory(JWSVerifierFactory factory) {
/* 188 */     this.jwsVerifierFactory = factory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEDecrypterFactory getJWEDecrypterFactory() {
/* 195 */     return this.jweDecrypterFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJWEDecrypterFactory(JWEDecrypterFactory factory) {
/* 202 */     this.jweDecrypterFactory = factory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Payload process(String compactJOSE, C context) throws ParseException, BadJOSEException, JOSEException {
/* 210 */     return process(JOSEObject.parse(compactJOSE), context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Payload process(JOSEObject joseObject, C context) throws BadJOSEException, JOSEException {
/* 218 */     if (joseObject instanceof JWSObject) {
/* 219 */       return process((JWSObject)joseObject, context);
/*     */     }
/*     */     
/* 222 */     if (joseObject instanceof JWEObject) {
/* 223 */       return process((JWEObject)joseObject, context);
/*     */     }
/*     */     
/* 226 */     if (joseObject instanceof PlainObject) {
/* 227 */       return process((PlainObject)joseObject, context);
/*     */     }
/*     */ 
/*     */     
/* 231 */     throw new JOSEException("Unexpected JOSE object type: " + joseObject.getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Payload process(PlainObject plainObject, C context) throws BadJOSEException {
/* 240 */     if (this.jwsTypeVerifier == null) {
/* 241 */       throw new BadJOSEException("Unsecured (plain) JOSE object rejected: No JWS header typ (type) verifier is configured");
/*     */     }
/* 243 */     this.jwsTypeVerifier.verify(plainObject.getHeader().getType(), context);
/*     */     
/* 245 */     throw new BadJOSEException("Unsecured (plain) JOSE objects are rejected, extend class to handle");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Payload process(JWSObject jwsObject, C context) throws BadJOSEException, JOSEException {
/* 253 */     if (this.jwsTypeVerifier == null) {
/* 254 */       throw new BadJOSEException("JWS object rejected: No JWS header typ (type) verifier is configured");
/*     */     }
/*     */     
/* 257 */     this.jwsTypeVerifier.verify(jwsObject.getHeader().getType(), context);
/*     */     
/* 259 */     if (getJWSKeySelector() == null)
/*     */     {
/* 261 */       throw new BadJOSEException("JWS object rejected: No JWS key selector is configured");
/*     */     }
/*     */     
/* 264 */     if (getJWSVerifierFactory() == null) {
/* 265 */       throw new JOSEException("No JWS verifier is configured");
/*     */     }
/*     */     
/* 268 */     List<? extends Key> keyCandidates = getJWSKeySelector().selectJWSKeys(jwsObject.getHeader(), context);
/*     */     
/* 270 */     if (keyCandidates == null || keyCandidates.isEmpty()) {
/* 271 */       throw new BadJOSEException("JWS object rejected: Another algorithm expected, or no matching key(s) found");
/*     */     }
/*     */     
/* 274 */     ListIterator<? extends Key> it = keyCandidates.listIterator();
/*     */     
/* 276 */     while (it.hasNext()) {
/*     */       
/* 278 */       JWSVerifier verifier = getJWSVerifierFactory().createJWSVerifier(jwsObject.getHeader(), it.next());
/*     */       
/* 280 */       if (verifier == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 284 */       boolean validSignature = jwsObject.verify(verifier);
/*     */       
/* 286 */       if (validSignature) {
/* 287 */         return jwsObject.getPayload();
/*     */       }
/*     */       
/* 290 */       if (!it.hasNext())
/*     */       {
/* 292 */         throw new BadJWSException("JWS object rejected: Invalid signature");
/*     */       }
/*     */     } 
/*     */     
/* 296 */     throw new BadJOSEException("JWS object rejected: No matching verifier(s) found");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Payload process(JWEObject jweObject, C context) throws BadJOSEException, JOSEException {
/* 304 */     if (this.jweTypeVerifier == null) {
/* 305 */       throw new BadJOSEException("JWE object rejected: No JWE header typ (type) verifier is configured");
/*     */     }
/*     */     
/* 308 */     this.jweTypeVerifier.verify(jweObject.getHeader().getType(), context);
/*     */     
/* 310 */     if (getJWEKeySelector() == null)
/*     */     {
/* 312 */       throw new BadJOSEException("JWE object rejected: No JWE key selector is configured");
/*     */     }
/*     */     
/* 315 */     if (getJWEDecrypterFactory() == null) {
/* 316 */       throw new JOSEException("No JWE decrypter is configured");
/*     */     }
/*     */     
/* 319 */     List<? extends Key> keyCandidates = getJWEKeySelector().selectJWEKeys(jweObject.getHeader(), context);
/*     */     
/* 321 */     if (keyCandidates == null || keyCandidates.isEmpty()) {
/* 322 */       throw new BadJOSEException("JWE object rejected: Another algorithm expected, or no matching key(s) found");
/*     */     }
/*     */     
/* 325 */     ListIterator<? extends Key> it = keyCandidates.listIterator();
/*     */     
/* 327 */     while (it.hasNext()) {
/*     */       
/* 329 */       JWEDecrypter decrypter = getJWEDecrypterFactory().createJWEDecrypter(jweObject.getHeader(), it.next());
/*     */       
/* 331 */       if (decrypter == null) {
/*     */         continue;
/*     */       }
/*     */       
/*     */       try {
/* 336 */         jweObject.decrypt(decrypter);
/*     */       }
/* 338 */       catch (JOSEException e) {
/*     */         
/* 340 */         if (it.hasNext()) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 346 */         throw new BadJWEException("JWE object rejected: " + e.getMessage(), e);
/*     */       } 
/*     */       
/* 349 */       if ("JWT".equalsIgnoreCase(jweObject.getHeader().getContentType())) {
/*     */ 
/*     */         
/* 352 */         JWSObject nestedJWS = jweObject.getPayload().toJWSObject();
/*     */         
/* 354 */         if (nestedJWS == null)
/*     */         {
/* 356 */           return jweObject.getPayload();
/*     */         }
/*     */         
/* 359 */         return process(nestedJWS, context);
/*     */       } 
/*     */       
/* 362 */       return jweObject.getPayload();
/*     */     } 
/*     */     
/* 365 */     throw new BadJOSEException("JWE object rejected: No matching decrypter(s) found");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\DefaultJOSEProcessor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */