/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.ActionRequiredForJWSCompletionException;
/*     */ import com.nimbusds.jose.CompletableJWSObjectSigning;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSSigner;
/*     */ import com.nimbusds.jose.JWSSignerOption;
/*     */ import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
/*     */ import com.nimbusds.jose.crypto.impl.RSASSA;
/*     */ import com.nimbusds.jose.crypto.impl.RSASSAProvider;
/*     */ import com.nimbusds.jose.crypto.opts.AllowWeakRSAKey;
/*     */ import com.nimbusds.jose.crypto.opts.OptionUtils;
/*     */ import com.nimbusds.jose.crypto.opts.UserAuthenticationRequired;
/*     */ import com.nimbusds.jose.jwk.RSAKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Signature;
/*     */ import java.security.SignatureException;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class RSASSASigner
/*     */   extends RSASSAProvider
/*     */   implements JWSSigner
/*     */ {
/*     */   private final PrivateKey privateKey;
/*     */   private final Set<JWSSignerOption> opts;
/*     */   
/*     */   public RSASSASigner(PrivateKey privateKey) {
/* 121 */     this(privateKey, false);
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
/*     */   @Deprecated
/*     */   public RSASSASigner(PrivateKey privateKey, boolean allowWeakKey) {
/* 141 */     this(privateKey, allowWeakKey ? (Set)Collections.singleton(AllowWeakRSAKey.getInstance()) : Collections.<JWSSignerOption>emptySet());
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
/*     */   public RSASSASigner(PrivateKey privateKey, Set<JWSSignerOption> opts) {
/* 160 */     if (!"RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
/* 161 */       throw new IllegalArgumentException("The private key algorithm must be RSA");
/*     */     }
/*     */     
/* 164 */     this.privateKey = privateKey;
/*     */     
/* 166 */     this.opts = (opts != null) ? opts : Collections.<JWSSignerOption>emptySet();
/*     */     
/* 168 */     if (!OptionUtils.optionIsPresent(this.opts, AllowWeakRSAKey.class)) {
/* 169 */       int keyBitLength = RSAKeyUtils.keyBitLength(privateKey);
/*     */       
/* 171 */       if (keyBitLength > 0 && keyBitLength < 2048) {
/* 172 */         throw new IllegalArgumentException("The RSA key size must be at least 2048 bits");
/*     */       }
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
/*     */   public RSASSASigner(RSAKey rsaJWK) throws JOSEException {
/* 192 */     this(RSAKeyUtils.toRSAPrivateKey(rsaJWK));
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
/*     */   @Deprecated
/*     */   public RSASSASigner(RSAKey rsaJWK, boolean allowWeakKey) throws JOSEException {
/* 214 */     this(RSAKeyUtils.toRSAPrivateKey(rsaJWK), allowWeakKey);
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
/*     */   public PrivateKey getPrivateKey() {
/* 228 */     return this.privateKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL sign(JWSHeader header, final byte[] signingInput) throws JOSEException {
/* 236 */     final Signature signer = getInitiatedSignature(header);
/*     */     
/* 238 */     if (OptionUtils.optionIsPresent(this.opts, UserAuthenticationRequired.class))
/*     */     {
/* 240 */       throw new ActionRequiredForJWSCompletionException("Authenticate user to complete signing", 
/*     */           
/* 242 */           UserAuthenticationRequired.getInstance(), new CompletableJWSObjectSigning()
/*     */           {
/*     */             public Base64URL complete() throws JOSEException
/*     */             {
/* 246 */               return RSASSASigner.this.sign(signingInput, signer);
/*     */             }
/*     */           });
/*     */     }
/*     */ 
/*     */     
/* 252 */     return sign(signingInput, signer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Signature getInitiatedSignature(JWSHeader header) throws JOSEException {
/* 259 */     Signature signer = RSASSA.getSignerAndVerifier(header.getAlgorithm(), getJCAContext().getProvider());
/*     */     try {
/* 261 */       signer.initSign(this.privateKey);
/* 262 */     } catch (InvalidKeyException e) {
/* 263 */       throw new JOSEException("Invalid private RSA key: " + e.getMessage(), e);
/*     */     } 
/*     */     
/* 266 */     return signer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Base64URL sign(byte[] signingInput, Signature signer) throws JOSEException {
/*     */     try {
/* 274 */       signer.update(signingInput);
/* 275 */       return Base64URL.encode(signer.sign());
/* 276 */     } catch (SignatureException e) {
/* 277 */       throw new JOSEException("RSA signature exception: " + e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\RSASSASigner.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */