/*    */ package com.nimbusds.jose.crypto.impl;
/*    */ 
/*    */ import com.nimbusds.jose.JWEHeader;
/*    */ import com.nimbusds.jose.util.Base64URL;
/*    */ import com.nimbusds.jose.util.ByteUtils;
/*    */ import com.nimbusds.jose.util.IntegerOverflowException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AAD
/*    */ {
/*    */   public static byte[] compute(JWEHeader jweHeader) {
/* 51 */     return compute(jweHeader.toBase64URL());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static byte[] compute(Base64URL encodedJWEHeader) {
/* 66 */     return encodedJWEHeader.toString().getBytes(StandardCharsets.US_ASCII);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static byte[] computeLength(byte[] aad) throws IntegerOverflowException {
/* 85 */     int bitLength = ByteUtils.safeBitLength(aad);
/* 86 */     return ByteBuffer.allocate(8).putLong(bitLength).array();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\crypto\impl\AAD.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */