/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.security.KeyStore;
/*     */ import java.security.KeyStoreException;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Provider;
/*     */ import java.security.cert.Certificate;
/*     */ import java.security.cert.CertificateEncodingException;
/*     */ import java.security.cert.CertificateException;
/*     */ import java.security.cert.CertificateFactory;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class X509CertUtils
/*     */ {
/*     */   public static final String PEM_BEGIN_MARKER = "-----BEGIN CERTIFICATE-----";
/*     */   public static final String PEM_END_MARKER = "-----END CERTIFICATE-----";
/*     */   private static Provider jcaProvider;
/*     */   
/*     */   public static Provider getProvider() {
/*  64 */     return jcaProvider;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setProvider(Provider provider) {
/*  75 */     jcaProvider = provider;
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
/*     */   public static X509Certificate parse(byte[] derEncodedCert) {
/*     */     try {
/*  91 */       return parseWithException(derEncodedCert);
/*  92 */     } catch (CertificateException e) {
/*  93 */       return null;
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
/*     */   public static X509Certificate parseWithException(byte[] derEncodedCert) throws CertificateException {
/* 111 */     if (derEncodedCert == null || derEncodedCert.length == 0) {
/* 112 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 117 */     CertificateFactory cf = (jcaProvider != null) ? CertificateFactory.getInstance("X.509", jcaProvider) : CertificateFactory.getInstance("X.509");
/* 118 */     Certificate cert = cf.generateCertificate(new ByteArrayInputStream(derEncodedCert));
/*     */     
/* 120 */     if (!(cert instanceof X509Certificate)) {
/* 121 */       throw new CertificateException("Not a X.509 certificate: " + cert.getType());
/*     */     }
/*     */     
/* 124 */     return (X509Certificate)cert;
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
/*     */   public static X509Certificate parse(String pemEncodedCert) {
/* 139 */     if (pemEncodedCert == null || pemEncodedCert.isEmpty()) {
/* 140 */       return null;
/*     */     }
/*     */     
/* 143 */     int markerStart = pemEncodedCert.indexOf("-----BEGIN CERTIFICATE-----");
/*     */     
/* 145 */     if (markerStart < 0) {
/* 146 */       return null;
/*     */     }
/*     */     
/* 149 */     String buf = pemEncodedCert.substring(markerStart + "-----BEGIN CERTIFICATE-----".length());
/*     */     
/* 151 */     int markerEnd = buf.indexOf("-----END CERTIFICATE-----");
/*     */     
/* 153 */     if (markerEnd < 0) {
/* 154 */       return null;
/*     */     }
/*     */     
/* 157 */     buf = buf.substring(0, markerEnd);
/*     */     
/* 159 */     buf = buf.replaceAll("\\s", "");
/*     */     
/* 161 */     return parse((new Base64(buf)).decode());
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
/*     */   public static X509Certificate parseWithException(String pemEncodedCert) throws CertificateException {
/* 177 */     if (pemEncodedCert == null || pemEncodedCert.isEmpty()) {
/* 178 */       return null;
/*     */     }
/*     */     
/* 181 */     int markerStart = pemEncodedCert.indexOf("-----BEGIN CERTIFICATE-----");
/*     */     
/* 183 */     if (markerStart < 0) {
/* 184 */       throw new CertificateException("PEM begin marker not found");
/*     */     }
/*     */     
/* 187 */     String buf = pemEncodedCert.substring(markerStart + "-----BEGIN CERTIFICATE-----".length());
/*     */     
/* 189 */     int markerEnd = buf.indexOf("-----END CERTIFICATE-----");
/*     */     
/* 191 */     if (markerEnd < 0) {
/* 192 */       throw new CertificateException("PEM end marker not found");
/*     */     }
/*     */     
/* 195 */     buf = buf.substring(0, markerEnd);
/*     */     
/* 197 */     buf = buf.replaceAll("\\s", "");
/*     */     
/* 199 */     return parseWithException((new Base64(buf)).decode());
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
/*     */   public static String toPEMString(X509Certificate cert) {
/* 213 */     return toPEMString(cert, true);
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
/*     */   public static String toPEMString(X509Certificate cert, boolean withLineBreaks) {
/* 229 */     StringBuilder sb = new StringBuilder();
/* 230 */     sb.append("-----BEGIN CERTIFICATE-----");
/*     */     
/* 232 */     if (withLineBreaks) {
/* 233 */       sb.append('\n');
/*     */     }
/*     */     try {
/* 236 */       sb.append(Base64.encode(cert.getEncoded()));
/* 237 */     } catch (CertificateEncodingException e) {
/* 238 */       return null;
/*     */     } 
/*     */     
/* 241 */     if (withLineBreaks) {
/* 242 */       sb.append('\n');
/*     */     }
/* 244 */     sb.append("-----END CERTIFICATE-----");
/* 245 */     return sb.toString();
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
/*     */   public static Base64URL computeSHA256Thumbprint(X509Certificate cert) {
/*     */     try {
/* 260 */       byte[] derEncodedCert = cert.getEncoded();
/* 261 */       MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
/* 262 */       return Base64URL.encode(sha256.digest(derEncodedCert));
/* 263 */     } catch (NoSuchAlgorithmException|CertificateEncodingException e) {
/* 264 */       return null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static UUID store(KeyStore keyStore, PrivateKey privateKey, char[] keyPassword, X509Certificate cert) throws KeyStoreException {
/* 291 */     UUID alias = UUID.randomUUID();
/* 292 */     keyStore.setKeyEntry(alias.toString(), privateKey, keyPassword, new Certificate[] { cert });
/* 293 */     return alias;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\X509CertUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */