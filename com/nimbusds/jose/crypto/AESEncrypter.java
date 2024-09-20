/*     */ package com.nimbusds.jose.crypto;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWECryptoParts;
/*     */ import com.nimbusds.jose.JWEEncrypter;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.KeyLengthException;
/*     */ import com.nimbusds.jose.crypto.impl.AESCryptoProvider;
/*     */ import com.nimbusds.jose.crypto.impl.AESGCM;
/*     */ import com.nimbusds.jose.crypto.impl.AESGCMKW;
/*     */ import com.nimbusds.jose.crypto.impl.AESKW;
/*     */ import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
/*     */ import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
/*     */ import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
/*     */ import com.nimbusds.jose.jwk.OctetSequenceKey;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.ByteUtils;
/*     */ import com.nimbusds.jose.util.Container;
/*     */ import javax.crypto.SecretKey;
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
/*     */ @ThreadSafe
/*     */ public class AESEncrypter
/*     */   extends AESCryptoProvider
/*     */   implements JWEEncrypter
/*     */ {
/*     */   private enum AlgFamily
/*     */   {
/*  86 */     AESKW, AESGCMKW;
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
/*     */   public AESEncrypter(SecretKey kek) throws KeyLengthException {
/* 102 */     super(kek);
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
/*     */   public AESEncrypter(byte[] keyBytes) throws KeyLengthException {
/* 117 */     this(new SecretKeySpec(keyBytes, "AES"));
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
/*     */   public AESEncrypter(OctetSequenceKey octJWK) throws KeyLengthException {
/* 134 */     this(octJWK.toSecretKey("AES"));
/*     */   }
/*     */ 
/*     */   
/*     */   public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws JOSEException {
/*     */     AlgFamily algFamily;
/*     */     JWEHeader updatedHeader;
/*     */     Base64URL encryptedKey;
/* 142 */     JWEAlgorithm alg = header.getAlgorithm();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     if (alg.equals(JWEAlgorithm.A128KW)) {
/*     */       
/* 149 */       if (ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
/* 150 */         throw new KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128KW encryption");
/*     */       }
/* 152 */       algFamily = AlgFamily.AESKW;
/*     */     }
/* 154 */     else if (alg.equals(JWEAlgorithm.A192KW)) {
/*     */       
/* 156 */       if (ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
/* 157 */         throw new KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192KW encryption");
/*     */       }
/* 159 */       algFamily = AlgFamily.AESKW;
/*     */     }
/* 161 */     else if (alg.equals(JWEAlgorithm.A256KW)) {
/*     */       
/* 163 */       if (ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
/* 164 */         throw new KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256KW encryption");
/*     */       }
/* 166 */       algFamily = AlgFamily.AESKW;
/*     */     }
/* 168 */     else if (alg.equals(JWEAlgorithm.A128GCMKW)) {
/*     */       
/* 170 */       if (ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
/* 171 */         throw new KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128GCMKW encryption");
/*     */       }
/* 173 */       algFamily = AlgFamily.AESGCMKW;
/*     */     }
/* 175 */     else if (alg.equals(JWEAlgorithm.A192GCMKW)) {
/*     */       
/* 177 */       if (ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
/* 178 */         throw new KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192GCMKW encryption");
/*     */       }
/* 180 */       algFamily = AlgFamily.AESGCMKW;
/*     */     }
/* 182 */     else if (alg.equals(JWEAlgorithm.A256GCMKW)) {
/*     */       
/* 184 */       if (ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
/* 185 */         throw new KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256GCMKW encryption");
/*     */       }
/* 187 */       algFamily = AlgFamily.AESGCMKW;
/*     */     }
/*     */     else {
/*     */       
/* 191 */       throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(alg, SUPPORTED_ALGORITHMS));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     EncryptionMethod enc = header.getEncryptionMethod();
/* 200 */     SecretKey cek = ContentCryptoProvider.generateCEK(enc, getJCAContext().getSecureRandom());
/*     */     
/* 202 */     if (AlgFamily.AESKW.equals(algFamily)) {
/*     */       
/* 204 */       encryptedKey = Base64URL.encode(AESKW.wrapCEK(cek, getKey(), getJCAContext().getKeyEncryptionProvider()));
/* 205 */       updatedHeader = header;
/*     */     }
/* 207 */     else if (AlgFamily.AESGCMKW.equals(algFamily)) {
/*     */       
/* 209 */       Container<byte[]> keyIV = new Container(AESGCM.generateIV(getJCAContext().getSecureRandom()));
/* 210 */       AuthenticatedCipherText authCiphCEK = AESGCMKW.encryptCEK(cek, keyIV, getKey(), getJCAContext().getKeyEncryptionProvider());
/* 211 */       encryptedKey = Base64URL.encode(authCiphCEK.getCipherText());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 217 */       updatedHeader = (new JWEHeader.Builder(header)).iv(Base64URL.encode((byte[])keyIV.get())).authTag(Base64URL.encode(authCiphCEK.getAuthenticationTag())).build();
/*     */     } else {
/*     */       
/* 220 */       throw new JOSEException("Unexpected JWE algorithm: " + alg);
/*     */     } 
/*     */     
/* 223 */     return ContentCryptoProvider.encrypt(updatedHeader, clearText, cek, encryptedKey, getJCAContext());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\AESEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */