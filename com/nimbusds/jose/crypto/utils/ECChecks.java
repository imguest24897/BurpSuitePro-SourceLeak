/*     */ package com.nimbusds.jose.crypto.utils;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.security.interfaces.ECPrivateKey;
/*     */ import java.security.interfaces.ECPublicKey;
/*     */ import java.security.spec.ECFieldFp;
/*     */ import java.security.spec.ECParameterSpec;
/*     */ import java.security.spec.ECPoint;
/*     */ import java.security.spec.EllipticCurve;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ECChecks
/*     */ {
/*     */   public static boolean isPointOnCurve(ECPublicKey publicKey, ECPrivateKey privateKey) {
/*  55 */     return isPointOnCurve(publicKey, privateKey.getParams());
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
/*     */   public static boolean isPointOnCurve(ECPublicKey publicKey, ECParameterSpec ecParameterSpec) {
/*  74 */     ECPoint point = publicKey.getW();
/*  75 */     return isPointOnCurve(point.getAffineX(), point.getAffineY(), ecParameterSpec);
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
/*     */   public static boolean isPointOnCurve(BigInteger x, BigInteger y, ECParameterSpec ecParameterSpec) {
/*  99 */     EllipticCurve curve = ecParameterSpec.getCurve();
/* 100 */     BigInteger a = curve.getA();
/* 101 */     BigInteger b = curve.getB();
/* 102 */     BigInteger p = ((ECFieldFp)curve.getField()).getP();
/* 103 */     BigInteger leftSide = y.pow(2).mod(p);
/* 104 */     BigInteger rightSide = x.pow(3).add(a.multiply(x)).add(b).mod(p);
/*     */     
/* 106 */     return leftSide.equals(rightSide);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypt\\utils\ECChecks.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */