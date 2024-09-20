/*     */ package com.nimbusds.jose.jca;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Provider;
/*     */ import java.security.Security;
/*     */ import javax.crypto.Cipher;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class JCASupport
/*     */ {
/*     */   public static boolean isUnlimitedStrength() {
/*     */     try {
/*  56 */       return (Cipher.getMaxAllowedKeyLength("AES") >= 256);
/*  57 */     } catch (NoSuchAlgorithmException e) {
/*  58 */       return false;
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
/*     */   public static boolean isSupported(Algorithm alg) {
/*  74 */     if (alg instanceof JWSAlgorithm) {
/*  75 */       return isSupported((JWSAlgorithm)alg);
/*     */     }
/*  77 */     if (alg instanceof JWEAlgorithm) {
/*  78 */       return isSupported((JWEAlgorithm)alg);
/*     */     }
/*  80 */     if (alg instanceof EncryptionMethod) {
/*  81 */       return isSupported((EncryptionMethod)alg);
/*     */     }
/*  83 */     throw new IllegalArgumentException("Unexpected algorithm class: " + alg.getClass().getCanonicalName());
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
/*     */   public static boolean isSupported(Algorithm alg, Provider provider) {
/*  99 */     if (alg instanceof JWSAlgorithm) {
/* 100 */       return isSupported((JWSAlgorithm)alg, provider);
/*     */     }
/* 102 */     if (alg instanceof JWEAlgorithm) {
/* 103 */       return isSupported((JWEAlgorithm)alg, provider);
/*     */     }
/* 105 */     if (alg instanceof EncryptionMethod) {
/* 106 */       return isSupported((EncryptionMethod)alg, provider);
/*     */     }
/* 108 */     throw new IllegalArgumentException("Unexpected algorithm class: " + alg.getClass().getCanonicalName());
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
/*     */   public static boolean isSupported(JWSAlgorithm alg) {
/* 123 */     if (alg.getName().equals(Algorithm.NONE.getName())) {
/* 124 */       return true;
/*     */     }
/*     */     
/* 127 */     for (Provider p : Security.getProviders()) {
/*     */       
/* 129 */       if (isSupported(alg, p)) {
/* 130 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 134 */     return false;
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
/*     */   public static boolean isSupported(JWSAlgorithm alg, Provider provider) {
/* 150 */     if (JWSAlgorithm.Family.HMAC_SHA.contains(alg)) {
/*     */       String jcaName;
/* 152 */       if (alg.equals(JWSAlgorithm.HS256)) {
/* 153 */         jcaName = "HMACSHA256";
/* 154 */       } else if (alg.equals(JWSAlgorithm.HS384)) {
/* 155 */         jcaName = "HMACSHA384";
/* 156 */       } else if (alg.equals(JWSAlgorithm.HS512)) {
/* 157 */         jcaName = "HMACSHA512";
/*     */       } else {
/* 159 */         return false;
/*     */       } 
/* 161 */       return (provider.getService("KeyGenerator", jcaName) != null);
/*     */     } 
/*     */     
/* 164 */     if (JWSAlgorithm.Family.RSA.contains(alg)) {
/*     */       
/* 166 */       String jcaName, jcaNameAlt = null;
/* 167 */       if (alg.equals(JWSAlgorithm.RS256)) {
/* 168 */         jcaName = "SHA256withRSA";
/* 169 */       } else if (alg.equals(JWSAlgorithm.RS384)) {
/* 170 */         jcaName = "SHA384withRSA";
/* 171 */       } else if (alg.equals(JWSAlgorithm.RS512)) {
/* 172 */         jcaName = "SHA512withRSA";
/* 173 */       } else if (alg.equals(JWSAlgorithm.PS256)) {
/* 174 */         jcaName = "RSASSA-PSS";
/* 175 */         jcaNameAlt = "SHA256withRSAandMGF1";
/* 176 */       } else if (alg.equals(JWSAlgorithm.PS384)) {
/* 177 */         jcaName = "RSASSA-PSS";
/* 178 */         jcaNameAlt = "SHA384withRSAandMGF1";
/* 179 */       } else if (alg.equals(JWSAlgorithm.PS512)) {
/* 180 */         jcaName = "RSASSA-PSS";
/* 181 */         jcaNameAlt = "SHA512withRSAandMGF1";
/*     */       } else {
/* 183 */         return false;
/*     */       } 
/*     */       
/* 186 */       return (provider.getService("Signature", jcaName) != null || (jcaNameAlt != null && provider
/* 187 */         .getService("Signature", jcaNameAlt) != null));
/*     */     } 
/*     */     
/* 190 */     if (JWSAlgorithm.Family.EC.contains(alg)) {
/*     */       String jcaName;
/* 192 */       if (alg.equals(JWSAlgorithm.ES256)) {
/* 193 */         jcaName = "SHA256withECDSA";
/* 194 */       } else if (alg.equals(JWSAlgorithm.ES384)) {
/* 195 */         jcaName = "SHA384withECDSA";
/* 196 */       } else if (alg.equals(JWSAlgorithm.ES512)) {
/* 197 */         jcaName = "SHA512withECDSA";
/*     */       } else {
/* 199 */         return false;
/*     */       } 
/* 201 */       return (provider.getService("Signature", jcaName) != null);
/*     */     } 
/*     */     
/* 204 */     return false;
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
/*     */   public static boolean isSupported(JWEAlgorithm alg) {
/* 219 */     for (Provider p : Security.getProviders()) {
/*     */       
/* 221 */       if (isSupported(alg, p)) {
/* 222 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 226 */     return false;
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
/*     */   public static boolean isSupported(JWEAlgorithm alg, Provider provider) {
/* 244 */     if (JWEAlgorithm.Family.RSA.contains(alg)) {
/* 245 */       String jcaName; if (alg.equals(JWEAlgorithm.RSA1_5)) {
/* 246 */         jcaName = "RSA/ECB/PKCS1Padding";
/* 247 */       } else if (alg.equals(JWEAlgorithm.RSA_OAEP)) {
/* 248 */         jcaName = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
/* 249 */       } else if (alg.equals(JWEAlgorithm.RSA_OAEP_256)) {
/* 250 */         jcaName = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
/* 251 */       } else if (alg.equals(JWEAlgorithm.RSA_OAEP_512)) {
/* 252 */         jcaName = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
/*     */       } else {
/* 254 */         return false;
/*     */       } 
/*     */ 
/*     */       
/*     */       try {
/* 259 */         Cipher.getInstance(jcaName, provider);
/* 260 */       } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException e) {
/* 261 */         return false;
/*     */       } 
/* 263 */       return true;
/*     */     } 
/*     */     
/* 266 */     if (JWEAlgorithm.Family.AES_KW.contains(alg)) {
/* 267 */       return (provider.getService("Cipher", "AESWrap") != null);
/*     */     }
/*     */     
/* 270 */     if (JWEAlgorithm.Family.ECDH_ES.contains(alg)) {
/* 271 */       return (provider.getService("KeyAgreement", "ECDH") != null);
/*     */     }
/*     */     
/* 274 */     if (JWEAlgorithm.Family.AES_GCM_KW.contains(alg)) {
/*     */       
/*     */       try {
/* 277 */         Cipher.getInstance("AES/GCM/NoPadding", provider);
/* 278 */       } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException e) {
/* 279 */         return false;
/*     */       } 
/* 281 */       return true;
/*     */     } 
/*     */     
/* 284 */     if (JWEAlgorithm.Family.PBES2.contains(alg)) {
/*     */       String hmac;
/* 286 */       if (alg.equals(JWEAlgorithm.PBES2_HS256_A128KW)) {
/* 287 */         hmac = "HmacSHA256";
/* 288 */       } else if (alg.equals(JWEAlgorithm.PBES2_HS384_A192KW)) {
/* 289 */         hmac = "HmacSHA384";
/*     */       } else {
/* 291 */         hmac = "HmacSHA512";
/*     */       } 
/* 293 */       return (provider.getService("KeyGenerator", hmac) != null);
/*     */     } 
/*     */     
/* 296 */     return JWEAlgorithm.DIR.equals(alg);
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
/*     */   public static boolean isSupported(EncryptionMethod enc) {
/* 311 */     for (Provider p : Security.getProviders()) {
/*     */       
/* 313 */       if (isSupported(enc, p)) {
/* 314 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 318 */     return false;
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
/*     */   public static boolean isSupported(EncryptionMethod enc, Provider provider) {
/* 334 */     if (EncryptionMethod.Family.AES_CBC_HMAC_SHA.contains(enc)) {
/*     */       String hmac;
/*     */       try {
/* 337 */         Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
/* 338 */       } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException e) {
/* 339 */         return false;
/*     */       } 
/*     */ 
/*     */       
/* 343 */       if (enc.equals(EncryptionMethod.A128CBC_HS256)) {
/* 344 */         hmac = "HmacSHA256";
/* 345 */       } else if (enc.equals(EncryptionMethod.A192CBC_HS384)) {
/* 346 */         hmac = "HmacSHA384";
/*     */       } else {
/* 348 */         hmac = "HmacSHA512";
/*     */       } 
/* 350 */       return (provider.getService("KeyGenerator", hmac) != null);
/*     */     } 
/*     */     
/* 353 */     if (EncryptionMethod.Family.AES_GCM.contains(enc)) {
/*     */       
/*     */       try {
/* 356 */         Cipher.getInstance("AES/GCM/NoPadding", provider);
/* 357 */       } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException e) {
/* 358 */         return false;
/*     */       } 
/* 360 */       return true;
/*     */     } 
/*     */     
/* 363 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jca\JCASupport.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */