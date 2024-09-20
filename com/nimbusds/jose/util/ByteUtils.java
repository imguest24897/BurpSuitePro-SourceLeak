/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ByteUtils
/*     */ {
/*     */   public static byte[] concat(byte[]... byteArrays) {
/*     */     try {
/*  45 */       ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */       
/*  47 */       for (byte[] bytes : byteArrays) {
/*     */         
/*  49 */         if (bytes != null)
/*     */         {
/*     */ 
/*     */           
/*  53 */           baos.write(bytes); } 
/*     */       } 
/*  55 */       return baos.toByteArray();
/*     */     }
/*  57 */     catch (IOException e) {
/*     */       
/*  59 */       throw new IllegalStateException(e.getMessage(), e);
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
/*     */   public static byte[] subArray(byte[] byteArray, int beginIndex, int length) {
/*  76 */     byte[] subArray = new byte[length];
/*  77 */     System.arraycopy(byteArray, beginIndex, subArray, 0, subArray.length);
/*  78 */     return subArray;
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
/*     */   public static int bitLength(int byteLength) {
/*  91 */     return byteLength * 8;
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
/*     */   public static int safeBitLength(int byteLength) throws IntegerOverflowException {
/* 108 */     long longResult = byteLength * 8L;
/* 109 */     if ((int)longResult != longResult) {
/* 110 */       throw new IntegerOverflowException();
/*     */     }
/* 112 */     return (int)longResult;
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
/*     */   public static int bitLength(byte[] byteArray) {
/* 126 */     if (byteArray == null) {
/* 127 */       return 0;
/*     */     }
/* 129 */     return bitLength(byteArray.length);
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
/*     */   public static int safeBitLength(byte[] byteArray) throws IntegerOverflowException {
/* 147 */     if (byteArray == null) {
/* 148 */       return 0;
/*     */     }
/* 150 */     return safeBitLength(byteArray.length);
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
/*     */   public static int byteLength(int bitLength) {
/* 164 */     return bitLength / 8;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\ByteUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */