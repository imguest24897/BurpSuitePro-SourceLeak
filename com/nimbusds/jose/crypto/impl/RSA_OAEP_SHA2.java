/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import java.security.AlgorithmParameters;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Provider;
/*     */ import java.security.interfaces.RSAPublicKey;
/*     */ import java.security.spec.AlgorithmParameterSpec;
/*     */ import java.security.spec.MGF1ParameterSpec;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.IllegalBlockSizeException;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.OAEPParameterSpec;
/*     */ import javax.crypto.spec.PSource;
/*     */ import javax.crypto.spec.SecretKeySpec;
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
/*     */ @ThreadSafe
/*     */ public class RSA_OAEP_SHA2
/*     */ {
/*     */   private static final String RSA_OEAP_256_JCA_ALG = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
/*     */   private static final String RSA_OEAP_384_JCA_ALG = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
/*     */   private static final String RSA_OEAP_512_JCA_ALG = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
/*     */   private static final String SHA_256_JCA_ALG = "SHA-256";
/*     */   private static final String SHA_384_JCA_ALG = "SHA-384";
/*     */   private static final String SHA_512_JCA_ALG = "SHA-512";
/*     */   
/*     */   public static byte[] encryptCEK(RSAPublicKey pub, SecretKey cek, int shaBitSize, Provider provider) throws JOSEException {
/*     */     String jcaAlgName;
/*     */     String jcaShaAlgName;
/*     */     MGF1ParameterSpec mgf1ParameterSpec;
/* 110 */     if (256 == shaBitSize) {
/* 111 */       jcaAlgName = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
/* 112 */       jcaShaAlgName = "SHA-256";
/* 113 */       mgf1ParameterSpec = MGF1ParameterSpec.SHA256;
/* 114 */     } else if (384 == shaBitSize) {
/* 115 */       jcaAlgName = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
/* 116 */       jcaShaAlgName = "SHA-384";
/* 117 */       mgf1ParameterSpec = MGF1ParameterSpec.SHA384;
/* 118 */     } else if (512 == shaBitSize) {
/* 119 */       jcaAlgName = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
/* 120 */       jcaShaAlgName = "SHA-512";
/* 121 */       mgf1ParameterSpec = MGF1ParameterSpec.SHA512;
/*     */     } else {
/* 123 */       throw new JOSEException("Unsupported SHA-2 bit size: " + shaBitSize);
/*     */     } 
/*     */     
/*     */     try {
/* 127 */       AlgorithmParameters algp = AlgorithmParametersHelper.getInstance("OAEP", provider);
/* 128 */       AlgorithmParameterSpec paramSpec = new OAEPParameterSpec(jcaShaAlgName, "MGF1", mgf1ParameterSpec, PSource.PSpecified.DEFAULT);
/* 129 */       algp.init(paramSpec);
/* 130 */       Cipher cipher = CipherHelper.getInstance(jcaAlgName, provider);
/* 131 */       cipher.init(1, pub, algp);
/* 132 */       return cipher.doFinal(cek.getEncoded());
/*     */     }
/* 134 */     catch (IllegalBlockSizeException e) {
/* 135 */       throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
/* 136 */     } catch (Exception e) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 141 */       throw new JOSEException(e.getMessage(), e);
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
/*     */   public static SecretKey decryptCEK(PrivateKey priv, byte[] encryptedCEK, int shaBitSize, Provider provider) throws JOSEException {
/*     */     String jcaAlgName;
/*     */     String jcaShaAlgName;
/*     */     MGF1ParameterSpec mgf1ParameterSpec;
/* 169 */     if (256 == shaBitSize) {
/* 170 */       jcaAlgName = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
/* 171 */       jcaShaAlgName = "SHA-256";
/* 172 */       mgf1ParameterSpec = MGF1ParameterSpec.SHA256;
/* 173 */     } else if (384 == shaBitSize) {
/* 174 */       jcaAlgName = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
/* 175 */       jcaShaAlgName = "SHA-384";
/* 176 */       mgf1ParameterSpec = MGF1ParameterSpec.SHA384;
/* 177 */     } else if (512 == shaBitSize) {
/* 178 */       jcaAlgName = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
/* 179 */       jcaShaAlgName = "SHA-512";
/* 180 */       mgf1ParameterSpec = MGF1ParameterSpec.SHA512;
/*     */     } else {
/* 182 */       throw new JOSEException("Unsupported SHA-2 bit size: " + shaBitSize);
/*     */     } 
/*     */     
/*     */     try {
/* 186 */       AlgorithmParameters algp = AlgorithmParametersHelper.getInstance("OAEP", provider);
/* 187 */       AlgorithmParameterSpec paramSpec = new OAEPParameterSpec(jcaShaAlgName, "MGF1", mgf1ParameterSpec, PSource.PSpecified.DEFAULT);
/* 188 */       algp.init(paramSpec);
/* 189 */       Cipher cipher = CipherHelper.getInstance(jcaAlgName, provider);
/* 190 */       cipher.init(2, priv, algp);
/* 191 */       return new SecretKeySpec(cipher.doFinal(encryptedCEK), "AES");
/*     */     }
/* 193 */     catch (Exception e) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 199 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\RSA_OAEP_SHA2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */