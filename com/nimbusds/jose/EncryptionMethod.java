/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import net.jcip.annotations.Immutable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public final class EncryptionMethod
/*     */   extends Algorithm
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final int cekBitLength;
/*  64 */   public static final EncryptionMethod A128CBC_HS256 = new EncryptionMethod("A128CBC-HS256", Requirement.REQUIRED, 256);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   public static final EncryptionMethod A192CBC_HS384 = new EncryptionMethod("A192CBC-HS384", Requirement.OPTIONAL, 384);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  80 */   public static final EncryptionMethod A256CBC_HS512 = new EncryptionMethod("A256CBC-HS512", Requirement.REQUIRED, 512);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  88 */   public static final EncryptionMethod A128CBC_HS256_DEPRECATED = new EncryptionMethod("A128CBC+HS256", Requirement.OPTIONAL, 256);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public static final EncryptionMethod A256CBC_HS512_DEPRECATED = new EncryptionMethod("A256CBC+HS512", Requirement.OPTIONAL, 512);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   public static final EncryptionMethod A128GCM = new EncryptionMethod("A128GCM", Requirement.RECOMMENDED, 128);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   public static final EncryptionMethod A192GCM = new EncryptionMethod("A192GCM", Requirement.OPTIONAL, 192);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 120 */   public static final EncryptionMethod A256GCM = new EncryptionMethod("A256GCM", Requirement.RECOMMENDED, 256);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 128 */   public static final EncryptionMethod XC20P = new EncryptionMethod("XC20P", Requirement.OPTIONAL, 256);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Family
/*     */     extends AlgorithmFamily<EncryptionMethod>
/*     */   {
/*     */     private static final long serialVersionUID = 1L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     public static final Family AES_CBC_HMAC_SHA = new Family(new EncryptionMethod[] { EncryptionMethod.A128CBC_HS256, EncryptionMethod.A192CBC_HS384, EncryptionMethod.A256CBC_HS512 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     public static final Family AES_GCM = new Family(new EncryptionMethod[] { EncryptionMethod.A128GCM, EncryptionMethod.A192GCM, EncryptionMethod.A256GCM });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Family(EncryptionMethod... encs) {
/* 160 */       super(encs);
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
/*     */   public EncryptionMethod(String name, Requirement req, int cekBitLength) {
/* 177 */     super(name, req);
/*     */     
/* 179 */     this.cekBitLength = cekBitLength;
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
/*     */   public EncryptionMethod(String name, Requirement req) {
/* 193 */     this(name, req, 0);
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
/*     */   public EncryptionMethod(String name) {
/* 205 */     this(name, null, 0);
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
/*     */   public int cekBitLength() {
/* 217 */     return this.cekBitLength;
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
/*     */   public static EncryptionMethod parse(String s) {
/* 231 */     if (s.equals(A128CBC_HS256.getName()))
/*     */     {
/* 233 */       return A128CBC_HS256;
/*     */     }
/* 235 */     if (s.equals(A192CBC_HS384.getName()))
/*     */     {
/* 237 */       return A192CBC_HS384;
/*     */     }
/* 239 */     if (s.equals(A256CBC_HS512.getName()))
/*     */     {
/* 241 */       return A256CBC_HS512;
/*     */     }
/* 243 */     if (s.equals(A128GCM.getName()))
/*     */     {
/* 245 */       return A128GCM;
/*     */     }
/* 247 */     if (s.equals(A192GCM.getName()))
/*     */     {
/* 249 */       return A192GCM;
/*     */     }
/* 251 */     if (s.equals(A256GCM.getName()))
/*     */     {
/* 253 */       return A256GCM;
/*     */     }
/* 255 */     if (s.equals(A128CBC_HS256_DEPRECATED.getName()))
/*     */     {
/* 257 */       return A128CBC_HS256_DEPRECATED;
/*     */     }
/* 259 */     if (s.equals(A256CBC_HS512_DEPRECATED.getName()))
/*     */     {
/* 261 */       return A256CBC_HS512_DEPRECATED;
/*     */     }
/* 263 */     if (s.equals(XC20P.getName()))
/*     */     {
/* 265 */       return XC20P;
/*     */     }
/*     */     
/* 268 */     return new EncryptionMethod(s);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\EncryptionMethod.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */