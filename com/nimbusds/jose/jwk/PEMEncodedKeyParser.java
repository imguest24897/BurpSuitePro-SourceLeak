/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import java.io.Reader;
/*     */ import java.io.StringReader;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPair;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.interfaces.RSAPrivateCrtKey;
/*     */ import java.security.spec.InvalidKeySpecException;
/*     */ import java.security.spec.RSAPublicKeySpec;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
/*     */ import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
/*     */ import org.bouncycastle.cert.X509CertificateHolder;
/*     */ import org.bouncycastle.openssl.PEMException;
/*     */ import org.bouncycastle.openssl.PEMKeyPair;
/*     */ import org.bouncycastle.openssl.PEMParser;
/*     */ import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class PEMEncodedKeyParser
/*     */ {
/*  48 */   private static final JcaPEMKeyConverter pemConverter = new JcaPEMKeyConverter();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static List<KeyPair> parseKeys(String pemEncodedKeys) throws JOSEException {
/*  72 */     Reader pemReader = new StringReader(pemEncodedKeys);
/*  73 */     PEMParser parser = new PEMParser(pemReader);
/*  74 */     List<KeyPair> keys = new ArrayList<>();
/*     */     
/*     */     try {
/*     */       Object pemObj;
/*     */       do {
/*  79 */         pemObj = parser.readObject();
/*     */ 
/*     */         
/*  82 */         if (pemObj instanceof SubjectPublicKeyInfo) {
/*  83 */           keys.add(toKeyPair((SubjectPublicKeyInfo)pemObj));
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*  88 */         else if (pemObj instanceof X509CertificateHolder) {
/*  89 */           keys.add(toKeyPair((X509CertificateHolder)pemObj));
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*  94 */         else if (pemObj instanceof PEMKeyPair) {
/*  95 */           keys.add(toKeyPair((PEMKeyPair)pemObj));
/*     */ 
/*     */ 
/*     */         
/*     */         }
/* 100 */         else if (pemObj instanceof PrivateKeyInfo) {
/* 101 */           keys.add(toKeyPair((PrivateKeyInfo)pemObj));
/*     */         }
/*     */       
/* 104 */       } while (pemObj != null);
/*     */       
/* 106 */       return keys;
/* 107 */     } catch (Exception e) {
/* 108 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static KeyPair toKeyPair(SubjectPublicKeyInfo spki) throws PEMException {
/* 116 */     return new KeyPair(pemConverter.getPublicKey(spki), null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static KeyPair toKeyPair(X509CertificateHolder pemObj) throws PEMException {
/* 123 */     SubjectPublicKeyInfo spki = pemObj.getSubjectPublicKeyInfo();
/* 124 */     return new KeyPair(pemConverter.getPublicKey(spki), null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static KeyPair toKeyPair(PEMKeyPair pair) throws PEMException {
/* 131 */     return pemConverter.getKeyPair(pair);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static KeyPair toKeyPair(PrivateKeyInfo pki) throws PEMException, NoSuchAlgorithmException, InvalidKeySpecException {
/* 138 */     PrivateKey privateKey = pemConverter.getPrivateKey(pki);
/*     */ 
/*     */     
/* 141 */     if (privateKey instanceof RSAPrivateCrtKey) {
/*     */ 
/*     */       
/* 144 */       RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(((RSAPrivateCrtKey)privateKey).getModulus(), ((RSAPrivateCrtKey)privateKey).getPublicExponent());
/*     */       
/* 146 */       KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/* 147 */       PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
/* 148 */       return new KeyPair(publicKey, privateKey);
/*     */     } 
/*     */ 
/*     */     
/* 152 */     return new KeyPair(null, privateKey);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\PEMEncodedKeyParser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */