/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.text.ParseException;
/*     */ import java.util.Objects;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public class ThumbprintURI
/*     */ {
/*     */   public static final String PREFIX = "urn:ietf:params:oauth:jwk-thumbprint:";
/*     */   private final String hashAlg;
/*     */   private final Base64URL thumbprint;
/*     */   
/*     */   public ThumbprintURI(String hashAlg, Base64URL thumbprint) {
/*  75 */     if (hashAlg == null || hashAlg.isEmpty()) {
/*  76 */       throw new IllegalArgumentException("The hash algorithm must not be null or empty");
/*     */     }
/*  78 */     this.hashAlg = hashAlg;
/*     */     
/*  80 */     if (thumbprint == null || thumbprint.toString().isEmpty()) {
/*  81 */       throw new IllegalArgumentException("The thumbprint must not be null or empty");
/*     */     }
/*  83 */     this.thumbprint = thumbprint;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAlgorithmString() {
/*  94 */     return this.hashAlg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Base64URL getThumbprint() {
/* 105 */     return this.thumbprint;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public URI toURI() {
/* 116 */     return URI.create(toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 123 */     return "urn:ietf:params:oauth:jwk-thumbprint:" + this.hashAlg + ":" + this.thumbprint;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 129 */     if (this == o) return true; 
/* 130 */     if (!(o instanceof ThumbprintURI)) return false; 
/* 131 */     ThumbprintURI that = (ThumbprintURI)o;
/* 132 */     return (this.hashAlg.equals(that.hashAlg) && getThumbprint().equals(that.getThumbprint()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 138 */     return Objects.hash(new Object[] { this.hashAlg, getThumbprint() });
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
/*     */   public static ThumbprintURI compute(JWK jwk) throws JOSEException {
/* 155 */     return new ThumbprintURI("sha-256", jwk.computeThumbprint());
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
/*     */   public static ThumbprintURI parse(URI uri) throws ParseException {
/* 171 */     String uriString = uri.toString();
/* 172 */     if (!uriString.startsWith("urn:ietf:params:oauth:jwk-thumbprint:")) {
/* 173 */       throw new ParseException("Illegal JWK thumbprint prefix", 0);
/*     */     }
/*     */     
/* 176 */     String valuesString = uriString.substring("urn:ietf:params:oauth:jwk-thumbprint:".length());
/* 177 */     if (valuesString.isEmpty()) {
/* 178 */       throw new ParseException("Illegal JWK thumbprint: Missing value", 0);
/*     */     }
/*     */     
/* 181 */     String[] values = valuesString.split(":");
/* 182 */     if (values.length != 2) {
/* 183 */       throw new ParseException("Illegal JWK thumbprint: Unexpected number of components", 0);
/*     */     }
/* 185 */     if (values[0].isEmpty()) {
/* 186 */       throw new ParseException("Illegal JWK thumbprint: The hash algorithm must not be empty", 0);
/*     */     }
/*     */ 
/*     */     
/* 190 */     return new ThumbprintURI(values[0], new Base64URL(values[1]));
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
/*     */   public static ThumbprintURI parse(String s) throws ParseException {
/*     */     try {
/* 207 */       return parse(new URI(s));
/* 208 */     } catch (URISyntaxException e) {
/* 209 */       throw new ParseException(e.getMessage(), 0);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\ThumbprintURI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */