/*     */ package com.nimbusds.jose.crypto.impl;
/*     */ 
/*     */ import com.nimbusds.jose.CompressionAlgorithm;
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.util.DeflateUtils;
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
/*     */ @ThreadSafe
/*     */ public class DeflateHelper
/*     */ {
/*     */   public static byte[] applyCompression(JWEHeader jweHeader, byte[] bytes) throws JOSEException {
/*  53 */     CompressionAlgorithm compressionAlg = jweHeader.getCompressionAlgorithm();
/*     */     
/*  55 */     if (compressionAlg == null)
/*     */     {
/*  57 */       return bytes;
/*     */     }
/*  59 */     if (compressionAlg.equals(CompressionAlgorithm.DEF)) {
/*     */       
/*     */       try {
/*  62 */         return DeflateUtils.compress(bytes);
/*     */       }
/*  64 */       catch (Exception e) {
/*     */         
/*  66 */         throw new JOSEException("Couldn't compress plain text: " + e.getMessage(), e);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*  71 */     throw new JOSEException("Unsupported compression algorithm: " + compressionAlg);
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
/*     */   public static byte[] applyDecompression(JWEHeader jweHeader, byte[] bytes) throws JOSEException {
/*  90 */     CompressionAlgorithm compressionAlg = jweHeader.getCompressionAlgorithm();
/*     */     
/*  92 */     if (compressionAlg == null)
/*     */     {
/*  94 */       return bytes;
/*     */     }
/*  96 */     if (compressionAlg.equals(CompressionAlgorithm.DEF)) {
/*     */       
/*     */       try {
/*  99 */         return DeflateUtils.decompress(bytes);
/*     */       }
/* 101 */       catch (Exception e) {
/*     */         
/* 103 */         throw new JOSEException("Couldn't decompress plain text: " + e.getMessage(), e);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 108 */     throw new JOSEException("Unsupported compression algorithm: " + compressionAlg);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\DeflateHelper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */