/*     */ package com.nimbusds.jose.proc;
/*     */ 
/*     */ import com.nimbusds.jose.Algorithm;
/*     */ import com.nimbusds.jose.EncryptionMethod;
/*     */ import com.nimbusds.jose.JOSEObject;
/*     */ import com.nimbusds.jose.JWEObject;
/*     */ import com.nimbusds.jose.JWSObject;
/*     */ import java.net.URI;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
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
/*     */ public class JOSEMatcher
/*     */ {
/*     */   private final Set<Class<? extends JOSEObject>> classes;
/*     */   private final Set<Algorithm> algs;
/*     */   private final Set<EncryptionMethod> encs;
/*     */   private final Set<URI> jkus;
/*     */   private final Set<String> kids;
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     private Set<Class<? extends JOSEObject>> classes;
/*     */     private Set<Algorithm> algs;
/*     */     private Set<EncryptionMethod> encs;
/*     */     private Set<URI> jkus;
/*     */     private Set<String> kids;
/*     */     
/*     */     public Builder joseClass(Class<? extends JOSEObject> clazz) {
/* 134 */       if (clazz == null) {
/* 135 */         this.classes = null;
/*     */       } else {
/* 137 */         this.classes = new HashSet<>(Collections.singletonList(clazz));
/*     */       } 
/* 139 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder joseClasses(Class<? extends JOSEObject>... classes) {
/* 152 */       joseClasses(new HashSet<>(Arrays.asList(classes)));
/* 153 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder joseClasses(Set<Class<? extends JOSEObject>> classes) {
/* 167 */       this.classes = classes;
/* 168 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder algorithm(Algorithm alg) {
/* 182 */       if (alg == null) {
/* 183 */         this.algs = null;
/*     */       } else {
/* 185 */         this.algs = new HashSet<>(Collections.singletonList(alg));
/*     */       } 
/* 187 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder algorithms(Algorithm... algs) {
/* 200 */       algorithms(new HashSet<>(Arrays.asList(algs)));
/* 201 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder algorithms(Set<Algorithm> algs) {
/* 215 */       this.algs = algs;
/* 216 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder encryptionMethod(EncryptionMethod enc) {
/* 230 */       if (enc == null) {
/* 231 */         this.encs = null;
/*     */       } else {
/* 233 */         this.encs = new HashSet<>(Collections.singletonList(enc));
/*     */       } 
/* 235 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder encryptionMethods(EncryptionMethod... encs) {
/* 248 */       encryptionMethods(new HashSet<>(Arrays.asList(encs)));
/* 249 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder encryptionMethods(Set<EncryptionMethod> encs) {
/* 263 */       this.encs = encs;
/* 264 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder jwkURL(URI jku) {
/* 277 */       if (jku == null) {
/* 278 */         this.jkus = null;
/*     */       } else {
/* 280 */         this.jkus = new HashSet<>(Collections.singletonList(jku));
/*     */       } 
/* 282 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder jwkURLs(URI... jkus) {
/* 295 */       jwkURLs(new HashSet<>(Arrays.asList(jkus)));
/* 296 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder jwkURLs(Set<URI> jkus) {
/* 309 */       this.jkus = jkus;
/* 310 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyID(String kid) {
/* 323 */       if (kid == null) {
/* 324 */         this.kids = null;
/*     */       } else {
/* 326 */         this.kids = new HashSet<>(Collections.singletonList(kid));
/*     */       } 
/* 328 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyIDs(String... ids) {
/* 341 */       keyIDs(new HashSet<>(Arrays.asList(ids)));
/* 342 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder keyIDs(Set<String> kids) {
/* 355 */       this.kids = kids;
/* 356 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public JOSEMatcher build() {
/* 367 */       return new JOSEMatcher(this.classes, this.algs, this.encs, this.jkus, this.kids);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JOSEMatcher(Set<Class<? extends JOSEObject>> classes, Set<Algorithm> algs, Set<EncryptionMethod> encs, Set<URI> jkus, Set<String> kids) {
/* 390 */     this.classes = classes;
/* 391 */     this.algs = algs;
/* 392 */     this.encs = encs;
/* 393 */     this.jkus = jkus;
/* 394 */     this.kids = kids;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Class<? extends JOSEObject>> getJOSEClasses() {
/* 405 */     return this.classes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<Algorithm> getAlgorithms() {
/* 416 */     return this.algs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<EncryptionMethod> getEncryptionMethods() {
/* 427 */     return this.encs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<URI> getJWKURLs() {
/* 438 */     return this.jkus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getKeyIDs() {
/* 449 */     return this.kids;
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
/*     */   public boolean matches(JOSEObject joseObject) {
/* 462 */     if (this.classes != null) {
/*     */       
/* 464 */       boolean pass = false;
/* 465 */       for (Class<? extends JOSEObject> c : this.classes) {
/* 466 */         if (c != null && c.isInstance(joseObject)) {
/* 467 */           pass = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 472 */       if (!pass) {
/* 473 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 477 */     if (this.algs != null && !this.algs.contains(joseObject.getHeader().getAlgorithm())) {
/* 478 */       return false;
/*     */     }
/* 480 */     if (this.encs != null) {
/*     */       
/* 482 */       if (!(joseObject instanceof JWEObject)) {
/* 483 */         return false;
/*     */       }
/* 485 */       JWEObject jweObject = (JWEObject)joseObject;
/*     */       
/* 487 */       if (!this.encs.contains(jweObject.getHeader().getEncryptionMethod())) {
/* 488 */         return false;
/*     */       }
/*     */     } 
/* 491 */     if (this.jkus != null) {
/*     */       URI jku;
/*     */ 
/*     */       
/* 495 */       if (joseObject instanceof JWSObject) {
/* 496 */         jku = ((JWSObject)joseObject).getHeader().getJWKURL();
/* 497 */       } else if (joseObject instanceof JWEObject) {
/* 498 */         jku = ((JWEObject)joseObject).getHeader().getJWKURL();
/*     */       } else {
/*     */         
/* 501 */         jku = null;
/*     */       } 
/*     */       
/* 504 */       if (!this.jkus.contains(jku)) {
/* 505 */         return false;
/*     */       }
/*     */     } 
/* 508 */     if (this.kids != null) {
/*     */       String kid;
/*     */ 
/*     */       
/* 512 */       if (joseObject instanceof JWSObject) {
/* 513 */         kid = ((JWSObject)joseObject).getHeader().getKeyID();
/* 514 */       } else if (joseObject instanceof JWEObject) {
/* 515 */         kid = ((JWEObject)joseObject).getHeader().getKeyID();
/*     */       } else {
/*     */         
/* 518 */         kid = null;
/*     */       } 
/*     */       
/* 521 */       return this.kids.contains(kid);
/*     */     } 
/*     */     
/* 524 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JOSEMatcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */