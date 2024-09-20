/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import java.text.ParseException;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum KeyOperation
/*     */ {
/*  53 */   SIGN("sign"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   VERIFY("verify"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   ENCRYPT("encrypt"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   DECRYPT("decrypt"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  77 */   WRAP_KEY("wrapKey"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   UNWRAP_KEY("unwrapKey"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   DERIVE_KEY("deriveKey"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   DERIVE_BITS("deriveBits");
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
/*     */   KeyOperation(String identifier) {
/* 112 */     if (identifier == null) {
/* 113 */       throw new IllegalArgumentException("The key operation identifier must not be null");
/*     */     }
/* 115 */     this.identifier = identifier;
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
/* 126 */     return this.identifier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 136 */     return identifier();
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
/*     */   public static Set<KeyOperation> parse(List<String> sl) throws ParseException {
/* 154 */     if (sl == null) {
/* 155 */       return null;
/*     */     }
/*     */     
/* 158 */     Set<KeyOperation> keyOps = new LinkedHashSet<>();
/*     */     
/* 160 */     for (String s : sl) {
/*     */       
/* 162 */       if (s == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 167 */       KeyOperation parsedOp = null;
/*     */       
/* 169 */       for (KeyOperation op : values()) {
/*     */         
/* 171 */         if (s.equals(op.identifier())) {
/* 172 */           parsedOp = op;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 177 */       if (parsedOp != null) {
/* 178 */         keyOps.add(parsedOp);
/*     */         continue;
/*     */       } 
/* 181 */       throw new ParseException("Invalid JWK operation: " + s, 0);
/*     */     } 
/*     */ 
/*     */     
/* 185 */     return keyOps;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\KeyOperation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */