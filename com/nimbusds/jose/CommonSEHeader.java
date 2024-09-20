/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.util.Base64;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.net.URI;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class CommonSEHeader
/*     */   extends Header
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final URI jku;
/*     */   private final JWK jwk;
/*     */   private final URI x5u;
/*     */   private final Base64URL x5t;
/*     */   private final Base64URL x5t256;
/*     */   private final List<Base64> x5c;
/*     */   private final String kid;
/*     */   
/*     */   protected CommonSEHeader(Algorithm alg, JOSEObjectType typ, String cty, Set<String> crit, URI jku, JWK jwk, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, String kid, Map<String, Object> customParams, Base64URL parsedBase64URL) {
/* 148 */     super(alg, typ, cty, crit, customParams, parsedBase64URL);
/*     */     
/* 150 */     this.jku = jku;
/* 151 */     this.jwk = jwk;
/* 152 */     this.x5u = x5u;
/* 153 */     this.x5t = x5t;
/* 154 */     this.x5t256 = x5t256;
/*     */     
/* 156 */     if (x5c != null) {
/*     */       
/* 158 */       this.x5c = Collections.unmodifiableList(new ArrayList<>(x5c));
/*     */     } else {
/* 160 */       this.x5c = null;
/*     */     } 
/*     */     
/* 163 */     this.kid = kid;
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
/*     */   public URI getJWKURL() {
/* 175 */     return this.jku;
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
/*     */   public JWK getJWK() {
/* 187 */     return this.jwk;
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
/*     */   public URI getX509CertURL() {
/* 199 */     return this.x5u;
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
/*     */   @Deprecated
/*     */   public Base64URL getX509CertThumbprint() {
/* 212 */     return this.x5t;
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
/*     */   public Base64URL getX509CertSHA256Thumbprint() {
/* 225 */     return this.x5t256;
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
/*     */   public List<Base64> getX509CertChain() {
/* 239 */     return this.x5c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getKeyID() {
/* 250 */     return this.kid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getIncludedParams() {
/* 257 */     Set<String> includedParameters = super.getIncludedParams();
/*     */     
/* 259 */     if (this.jku != null) {
/* 260 */       includedParameters.add("jku");
/*     */     }
/*     */     
/* 263 */     if (this.jwk != null) {
/* 264 */       includedParameters.add("jwk");
/*     */     }
/*     */     
/* 267 */     if (this.x5u != null) {
/* 268 */       includedParameters.add("x5u");
/*     */     }
/*     */     
/* 271 */     if (this.x5t != null) {
/* 272 */       includedParameters.add("x5t");
/*     */     }
/*     */     
/* 275 */     if (this.x5t256 != null) {
/* 276 */       includedParameters.add("x5t#S256");
/*     */     }
/*     */     
/* 279 */     if (this.x5c != null && !this.x5c.isEmpty()) {
/* 280 */       includedParameters.add("x5c");
/*     */     }
/*     */     
/* 283 */     if (this.kid != null) {
/* 284 */       includedParameters.add("kid");
/*     */     }
/*     */     
/* 287 */     return includedParameters;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toJSONObject() {
/* 294 */     Map<String, Object> o = super.toJSONObject();
/*     */     
/* 296 */     if (this.jku != null) {
/* 297 */       o.put("jku", this.jku.toString());
/*     */     }
/*     */     
/* 300 */     if (this.jwk != null) {
/* 301 */       o.put("jwk", this.jwk.toJSONObject());
/*     */     }
/*     */     
/* 304 */     if (this.x5u != null) {
/* 305 */       o.put("x5u", this.x5u.toString());
/*     */     }
/*     */     
/* 308 */     if (this.x5t != null) {
/* 309 */       o.put("x5t", this.x5t.toString());
/*     */     }
/*     */     
/* 312 */     if (this.x5t256 != null) {
/* 313 */       o.put("x5t#S256", this.x5t256.toString());
/*     */     }
/*     */     
/* 316 */     if (this.x5c != null && !this.x5c.isEmpty()) {
/* 317 */       List<String> x5cJson = new ArrayList<>(this.x5c.size());
/* 318 */       for (Base64 item : this.x5c) {
/* 319 */         x5cJson.add(item.toString());
/*     */       }
/* 321 */       o.put("x5c", x5cJson);
/*     */     } 
/*     */     
/* 324 */     if (this.kid != null) {
/* 325 */       o.put("kid", this.kid);
/*     */     }
/*     */     
/* 328 */     return o;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\CommonSEHeader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */