/*     */ package com.nimbusds.jwt;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEObject;
/*     */ import com.nimbusds.jose.Payload;
/*     */ import com.nimbusds.jose.PlainHeader;
/*     */ import com.nimbusds.jose.PlainObject;
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
/*     */ @ThreadSafe
/*     */ public class PlainJWT
/*     */   extends PlainObject
/*     */   implements JWT
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JWTClaimsSet claimsSet;
/*     */   
/*     */   public PlainJWT(JWTClaimsSet claimsSet) {
/*  60 */     super(claimsSet.toPayload());
/*  61 */     this.claimsSet = claimsSet;
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
/*     */   public PlainJWT(PlainHeader header, JWTClaimsSet claimsSet) {
/*  74 */     super(header, claimsSet.toPayload());
/*  75 */     this.claimsSet = claimsSet;
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
/*     */   public PlainJWT(Base64URL firstPart, Base64URL secondPart) throws ParseException {
/*  93 */     super(firstPart, secondPart);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet getJWTClaimsSet() throws ParseException {
/* 101 */     if (this.claimsSet != null)
/*     */     {
/* 103 */       return this.claimsSet;
/*     */     }
/*     */     
/* 106 */     Map<String, Object> json = getPayload().toJSONObject();
/*     */     
/* 108 */     if (json == null)
/*     */     {
/* 110 */       throw new ParseException("Payload of unsecured JOSE object is not a valid JSON object", 0);
/*     */     }
/*     */     
/* 113 */     this.claimsSet = JWTClaimsSet.parse(json);
/* 114 */     return this.claimsSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setPayload(Payload payload) {
/* 123 */     this.claimsSet = null;
/* 124 */     super.setPayload(payload);
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
/*     */   public static PlainJWT parse(String s) throws ParseException {
/* 141 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 143 */     if (!parts[2].toString().isEmpty())
/*     */     {
/* 145 */       throw new ParseException("Unexpected third Base64URL part in the unsecured JWT object", 0);
/*     */     }
/*     */     
/* 148 */     return new PlainJWT(parts[0], parts[1]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\PlainJWT.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */