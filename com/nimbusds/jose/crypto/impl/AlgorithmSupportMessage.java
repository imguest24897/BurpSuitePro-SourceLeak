/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JWEAlgorithm;
/*     */ import com.nimbusds.jose.JWSAlgorithm;
/*     */ import com.nimbusds.jose.jwk.Curve;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AlgorithmSupportMessage
/*     */ {
/*     */   private static String itemize(Collection collection) {
/*  48 */     StringBuilder sb = new StringBuilder();
/*     */     
/*  50 */     Object[] items = collection.toArray();
/*     */     
/*  52 */     for (int i = 0; i < items.length; i++) {
/*     */       
/*  54 */       if (i != 0)
/*     */       {
/*  56 */         if (i < items.length - 1) {
/*  57 */           sb.append(", ");
/*  58 */         } else if (i == items.length - 1) {
/*  59 */           sb.append(" or ");
/*     */         } 
/*     */       }
/*  62 */       sb.append(items[i].toString());
/*     */     } 
/*     */     
/*  65 */     return sb.toString();
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
/*     */   public static String unsupportedJWSAlgorithm(JWSAlgorithm unsupported, Collection<JWSAlgorithm> supported) {
/*  82 */     return "Unsupported JWS algorithm " + unsupported + ", must be " + itemize(supported);
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
/*     */   public static String unsupportedJWEAlgorithm(JWEAlgorithm unsupported, Collection<JWEAlgorithm> supported) {
/*  99 */     return "Unsupported JWE algorithm " + unsupported + ", must be " + itemize(supported);
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
/*     */   public static String unsupportedEncryptionMethod(EncryptionMethod unsupported, Collection<EncryptionMethod> supported) {
/* 117 */     return "Unsupported JWE encryption method " + unsupported + ", must be " + itemize(supported);
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
/*     */   public static String unsupportedEllipticCurve(Curve unsupported, Collection<Curve> supported) {
/* 135 */     return "Unsupported elliptic curve " + unsupported + ", must be " + itemize(supported);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AlgorithmSupportMessage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */