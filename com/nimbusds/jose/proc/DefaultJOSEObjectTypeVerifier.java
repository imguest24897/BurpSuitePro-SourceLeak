/*     */ package com.nimbusds.jose.proc;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEObjectType;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public class DefaultJOSEObjectTypeVerifier<C extends SecurityContext>
/*     */   implements JOSEObjectTypeVerifier<C>
/*     */ {
/*     */   private final Set<JOSEObjectType> allowedTypes;
/*  76 */   public static final DefaultJOSEObjectTypeVerifier JOSE = new DefaultJOSEObjectTypeVerifier(new JOSEObjectType[] { JOSEObjectType.JOSE, null });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  82 */   public static final DefaultJOSEObjectTypeVerifier JWT = new DefaultJOSEObjectTypeVerifier(new JOSEObjectType[] { JOSEObjectType.JWT, null });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DefaultJOSEObjectTypeVerifier() {
/*  91 */     this.allowedTypes = Collections.singleton(null);
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
/*     */   public DefaultJOSEObjectTypeVerifier(Set<JOSEObjectType> allowedTypes) {
/* 105 */     if (allowedTypes == null || allowedTypes.isEmpty()) {
/* 106 */       throw new IllegalArgumentException("The allowed types must not be null or empty");
/*     */     }
/* 108 */     this.allowedTypes = allowedTypes;
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
/*     */   public DefaultJOSEObjectTypeVerifier(JOSEObjectType... allowedTypes) {
/* 122 */     if (allowedTypes == null || allowedTypes.length == 0) {
/* 123 */       throw new IllegalArgumentException("The allowed types must not be null or empty");
/*     */     }
/* 125 */     this.allowedTypes = new HashSet<>(Arrays.asList(allowedTypes));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<JOSEObjectType> getAllowedTypes() {
/* 136 */     return this.allowedTypes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void verify(JOSEObjectType type, C context) throws BadJOSEException {
/* 144 */     if (type == null && !this.allowedTypes.contains(null)) {
/* 145 */       throw new BadJOSEException("Required JOSE header typ (type) parameter is missing");
/*     */     }
/*     */     
/* 148 */     if (!this.allowedTypes.contains(type))
/* 149 */       throw new BadJOSEException("JOSE header typ (type) " + type + " not allowed"); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\DefaultJOSEObjectTypeVerifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */