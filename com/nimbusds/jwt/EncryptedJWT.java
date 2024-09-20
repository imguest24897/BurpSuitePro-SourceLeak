/*     */ package com.nimbusds.jwt;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEObject;
/*     */ import com.nimbusds.jose.JWEHeader;
/*     */ import com.nimbusds.jose.JWEObject;
/*     */ import com.nimbusds.jose.Payload;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.text.ParseException;
/*     */ import java.util.Map;
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
/*     */ public class EncryptedJWT
/*     */   extends JWEObject
/*     */   implements JWT
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JWTClaimsSet claimsSet;
/*     */   
/*     */   public EncryptedJWT(JWEHeader header, JWTClaimsSet claimsSet) {
/*  61 */     super(header, claimsSet.toPayload());
/*  62 */     this.claimsSet = claimsSet;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public EncryptedJWT(Base64URL firstPart, Base64URL secondPart, Base64URL thirdPart, Base64URL fourthPart, Base64URL fifthPart) throws ParseException {
/*  91 */     super(firstPart, secondPart, thirdPart, fourthPart, fifthPart);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet getJWTClaimsSet() throws ParseException {
/*  99 */     if (this.claimsSet != null) {
/* 100 */       return this.claimsSet;
/*     */     }
/*     */     
/* 103 */     Payload payload = getPayload();
/*     */     
/* 105 */     if (payload == null) {
/* 106 */       return null;
/*     */     }
/*     */     
/* 109 */     Map<String, Object> json = payload.toJSONObject();
/*     */     
/* 111 */     if (json == null) {
/* 112 */       throw new ParseException("Payload of JWE object is not a valid JSON object", 0);
/*     */     }
/*     */     
/* 115 */     this.claimsSet = JWTClaimsSet.parse(json);
/* 116 */     return this.claimsSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setPayload(Payload payload) {
/* 125 */     this.claimsSet = null;
/* 126 */     super.setPayload(payload);
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
/*     */   public static EncryptedJWT parse(String s) throws ParseException {
/* 144 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 146 */     if (parts.length != 5) {
/* 147 */       throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
/*     */     }
/*     */     
/* 150 */     return new EncryptedJWT(parts[0], parts[1], parts[2], parts[3], parts[4]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\EncryptedJWT.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */