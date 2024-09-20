/*     */ package com.nimbusds.jwt;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEObject;
/*     */ import com.nimbusds.jose.JWSHeader;
/*     */ import com.nimbusds.jose.JWSObject;
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
/*     */ public class SignedJWT
/*     */   extends JWSObject
/*     */   implements JWT
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JWTClaimsSet claimsSet;
/*     */   
/*     */   public SignedJWT(JWSHeader header, JWTClaimsSet claimsSet) {
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
/*     */   public SignedJWT(Base64URL firstPart, Base64URL secondPart, Base64URL thirdPart) throws ParseException {
/*  83 */     super(firstPart, secondPart, thirdPart);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet getJWTClaimsSet() throws ParseException {
/*  91 */     if (this.claimsSet != null) {
/*  92 */       return this.claimsSet;
/*     */     }
/*     */     
/*  95 */     Map<String, Object> json = getPayload().toJSONObject();
/*     */     
/*  97 */     if (json == null) {
/*  98 */       throw new ParseException("Payload of JWS object is not a valid JSON object", 0);
/*     */     }
/*     */     
/* 101 */     this.claimsSet = JWTClaimsSet.parse(json);
/* 102 */     return this.claimsSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setPayload(Payload payload) {
/* 111 */     this.claimsSet = null;
/* 112 */     super.setPayload(payload);
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
/*     */   public static SignedJWT parse(String s) throws ParseException {
/* 130 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 132 */     if (parts.length != 3) {
/* 133 */       throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
/*     */     }
/*     */     
/* 136 */     return new SignedJWT(parts[0], parts[1], parts[2]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\SignedJWT.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */