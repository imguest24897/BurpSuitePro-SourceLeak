/*     */ package com.nimbusds.jose.crypto.factories;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWEDecrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.KeyTypeException;
/*     */ import com.nimbusds.jose.crypto.AESDecrypter;
/*     */ import com.nimbusds.jose.crypto.DirectDecrypter;
/*     */ import com.nimbusds.jose.crypto.ECDHDecrypter;
/*     */ import com.nimbusds.jose.crypto.PasswordBasedDecrypter;
/*     */ import com.nimbusds.jose.crypto.RSADecrypter;
/*     */ import com.nimbusds.jose.jca.JCAContext;
/*     */ import com.nimbusds.jose.jca.JWEJCAContext;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import com.nimbusds.jose.proc.JWEDecrypterFactory;
/*     */ import java.security.Key;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.interfaces.ECKey;
/*     */ import java.security.interfaces.RSAKey;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
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
/*     */ @ThreadSafe
/*     */ public class DefaultJWEDecrypterFactory
/*     */   implements JWEDecrypterFactory
/*     */ {
/*     */   public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
/*     */   public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;
/*     */   
/*     */   static {
/*  65 */     Set<JWEAlgorithm> algs = new LinkedHashSet<>();
/*  66 */     algs.addAll(RSADecrypter.SUPPORTED_ALGORITHMS);
/*  67 */     algs.addAll(ECDHDecrypter.SUPPORTED_ALGORITHMS);
/*  68 */     algs.addAll(DirectDecrypter.SUPPORTED_ALGORITHMS);
/*  69 */     algs.addAll(AESDecrypter.SUPPORTED_ALGORITHMS);
/*  70 */     algs.addAll(PasswordBasedDecrypter.SUPPORTED_ALGORITHMS);
/*  71 */     SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(algs);
/*     */     
/*  73 */     Set<EncryptionMethod> encs = new LinkedHashSet<>();
/*  74 */     encs.addAll(RSADecrypter.SUPPORTED_ENCRYPTION_METHODS);
/*  75 */     encs.addAll(ECDHDecrypter.SUPPORTED_ENCRYPTION_METHODS);
/*  76 */     encs.addAll(DirectDecrypter.SUPPORTED_ENCRYPTION_METHODS);
/*  77 */     encs.addAll(AESDecrypter.SUPPORTED_ENCRYPTION_METHODS);
/*  78 */     encs.addAll(PasswordBasedDecrypter.SUPPORTED_ENCRYPTION_METHODS);
/*  79 */     SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(encs);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   private final JWEJCAContext jcaContext = new JWEJCAContext();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<JWEAlgorithm> supportedJWEAlgorithms() {
/*  92 */     return SUPPORTED_ALGORITHMS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<EncryptionMethod> supportedEncryptionMethods() {
/*  99 */     return SUPPORTED_ENCRYPTION_METHODS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEJCAContext getJCAContext() {
/* 106 */     return this.jcaContext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEDecrypter createJWEDecrypter(JWEHeader header, Key key) throws JOSEException {
/*     */     PasswordBasedDecrypter passwordBasedDecrypter;
/* 116 */     if (RSADecrypter.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm()) && RSADecrypter.SUPPORTED_ENCRYPTION_METHODS
/* 117 */       .contains(header.getEncryptionMethod())) {
/*     */       
/* 119 */       if (!(key instanceof PrivateKey) || !(key instanceof RSAKey)) {
/* 120 */         throw new KeyTypeException(PrivateKey.class, new Class[] { RSAKey.class });
/*     */       }
/*     */       
/* 123 */       PrivateKey rsaPrivateKey = (PrivateKey)key;
/*     */       
/* 125 */       RSADecrypter rSADecrypter = new RSADecrypter(rsaPrivateKey);
/*     */     }
/* 127 */     else if (ECDHDecrypter.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm()) && ECDHDecrypter.SUPPORTED_ENCRYPTION_METHODS
/* 128 */       .contains(header.getEncryptionMethod())) {
/*     */       
/* 130 */       if (!(key instanceof PrivateKey) || !(key instanceof ECKey)) {
/* 131 */         throw new KeyTypeException(PrivateKey.class, new Class[] { ECKey.class });
/*     */       }
/*     */       
/* 134 */       PrivateKey ecPrivateKey = (PrivateKey)key;
/* 135 */       Curve curve = Curve.forECParameterSpec(((ECKey)key).getParams());
/*     */       
/* 137 */       ECDHDecrypter eCDHDecrypter = new ECDHDecrypter(ecPrivateKey, null, curve);
/*     */     }
/* 139 */     else if (DirectDecrypter.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm()) && DirectDecrypter.SUPPORTED_ENCRYPTION_METHODS
/* 140 */       .contains(header.getEncryptionMethod())) {
/*     */       
/* 142 */       if (!(key instanceof SecretKey)) {
/* 143 */         throw new KeyTypeException(SecretKey.class);
/*     */       }
/*     */       
/* 146 */       SecretKey aesKey = (SecretKey)key;
/* 147 */       DirectDecrypter directDecrypter = new DirectDecrypter(aesKey);
/*     */       
/* 149 */       if (!directDecrypter.supportedEncryptionMethods().contains(header.getEncryptionMethod())) {
/* 150 */         throw new KeyLengthException(header.getEncryptionMethod().cekBitLength(), header.getEncryptionMethod());
/*     */       }
/*     */       
/* 153 */       DirectDecrypter directDecrypter1 = directDecrypter;
/*     */     }
/* 155 */     else if (AESDecrypter.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm()) && AESDecrypter.SUPPORTED_ENCRYPTION_METHODS
/* 156 */       .contains(header.getEncryptionMethod())) {
/*     */       
/* 158 */       if (!(key instanceof SecretKey)) {
/* 159 */         throw new KeyTypeException(SecretKey.class);
/*     */       }
/*     */       
/* 162 */       SecretKey aesKey = (SecretKey)key;
/* 163 */       AESDecrypter aesDecrypter = new AESDecrypter(aesKey);
/*     */       
/* 165 */       if (!aesDecrypter.supportedJWEAlgorithms().contains(header.getAlgorithm())) {
/* 166 */         throw new KeyLengthException(header.getAlgorithm());
/*     */       }
/*     */       
/* 169 */       AESDecrypter aESDecrypter1 = aesDecrypter;
/*     */     }
/* 171 */     else if (PasswordBasedDecrypter.SUPPORTED_ALGORITHMS.contains(header.getAlgorithm()) && PasswordBasedDecrypter.SUPPORTED_ENCRYPTION_METHODS
/* 172 */       .contains(header.getEncryptionMethod())) {
/*     */       
/* 174 */       if (!(key instanceof SecretKey)) {
/* 175 */         throw new KeyTypeException(SecretKey.class);
/*     */       }
/*     */       
/* 178 */       byte[] password = key.getEncoded();
/* 179 */       passwordBasedDecrypter = new PasswordBasedDecrypter(password);
/*     */     }
/*     */     else {
/*     */       
/* 183 */       throw new JOSEException("Unsupported JWE algorithm or encryption method");
/*     */     } 
/*     */ 
/*     */     
/* 187 */     ((JWEJCAContext)passwordBasedDecrypter.getJCAContext()).setSecureRandom(this.jcaContext.getSecureRandom());
/* 188 */     ((JWEJCAContext)passwordBasedDecrypter.getJCAContext()).setProvider(this.jcaContext.getProvider());
/* 189 */     ((JWEJCAContext)passwordBasedDecrypter.getJCAContext()).setKeyEncryptionProvider(this.jcaContext.getKeyEncryptionProvider());
/* 190 */     ((JWEJCAContext)passwordBasedDecrypter.getJCAContext()).setMACProvider(this.jcaContext.getMACProvider());
/* 191 */     ((JWEJCAContext)passwordBasedDecrypter.getJCAContext()).setContentEncryptionProvider(this.jcaContext.getContentEncryptionProvider());
/*     */     
/* 193 */     return (JWEDecrypter)passwordBasedDecrypter;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\factories\DefaultJWEDecrypterFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */