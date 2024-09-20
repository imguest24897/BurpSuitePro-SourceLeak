/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.text.ParseException;
/*     */ import java.util.HashSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class KeyUse
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  54 */   public static final KeyUse SIGNATURE = new KeyUse("sig");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   public static final KeyUse ENCRYPTION = new KeyUse("enc");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String identifier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyUse(String identifier) {
/*  77 */     if (identifier == null) {
/*  78 */       throw new IllegalArgumentException("The key use identifier must not be null");
/*     */     }
/*  80 */     this.identifier = identifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String identifier() {
/*  91 */     return this.identifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValue() {
/* 100 */     return identifier();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 110 */     return identifier();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 116 */     if (this == o) return true; 
/* 117 */     if (!(o instanceof KeyUse)) return false; 
/* 118 */     KeyUse keyUse = (KeyUse)o;
/* 119 */     return Objects.equals(this.identifier, keyUse.identifier);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 125 */     return Objects.hash(new Object[] { this.identifier });
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
/*     */   public static KeyUse parse(String s) throws ParseException {
/* 143 */     if (s == null) {
/* 144 */       return null;
/*     */     }
/*     */     
/* 147 */     if (s.equals(SIGNATURE.identifier())) {
/* 148 */       return SIGNATURE;
/*     */     }
/*     */     
/* 151 */     if (s.equals(ENCRYPTION.identifier())) {
/* 152 */       return ENCRYPTION;
/*     */     }
/*     */     
/* 155 */     if (s.trim().isEmpty()) {
/* 156 */       throw new ParseException("JWK use value must not be empty or blank", 0);
/*     */     }
/*     */     
/* 159 */     return new KeyUse(s);
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
/*     */   public static KeyUse from(X509Certificate cert) {
/* 178 */     if (cert.getKeyUsage() == null) {
/* 179 */       return null;
/*     */     }
/*     */     
/* 182 */     Set<KeyUse> foundUses = new HashSet<>();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     if (cert.getKeyUsage()[0] || cert.getKeyUsage()[1]) {
/* 188 */       foundUses.add(SIGNATURE);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 193 */     if (cert.getKeyUsage()[0] && cert.getKeyUsage()[2]) {
/* 194 */       foundUses.add(ENCRYPTION);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 199 */     if (cert.getKeyUsage()[0] && cert.getKeyUsage()[4]) {
/* 200 */       foundUses.add(ENCRYPTION);
/*     */     }
/*     */ 
/*     */     
/* 204 */     if (cert.getKeyUsage()[2] || cert.getKeyUsage()[3] || cert.getKeyUsage()[4]) {
/* 205 */       foundUses.add(ENCRYPTION);
/*     */     }
/*     */ 
/*     */     
/* 209 */     if (cert.getKeyUsage()[5] || cert.getKeyUsage()[6]) {
/* 210 */       foundUses.add(SIGNATURE);
/*     */     }
/*     */     
/* 213 */     if (foundUses.size() == 1) {
/* 214 */       return foundUses.iterator().next();
/*     */     }
/*     */     
/* 217 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\KeyUse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */