/*     */ package com.nimbusds.jwt.proc;
/*     */ 
/*     */ import com.nimbusds.jose.proc.SecurityContext;
/*     */ import com.nimbusds.jwt.JWTClaimsSet;
/*     */ import com.nimbusds.jwt.util.DateUtils;
/*     */ import java.util.Collections;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.SortedSet;
/*     */ import java.util.TreeSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class DefaultJWTClaimsVerifier<C extends SecurityContext>
/*     */   implements JWTClaimsSetVerifier<C>, ClockSkewAware
/*     */ {
/*     */   public static final int DEFAULT_MAX_CLOCK_SKEW_SECONDS = 60;
/* 100 */   private int maxClockSkew = 60;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Set<String> acceptedAudienceValues;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final JWTClaimsSet exactMatchClaims;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Set<String> requiredClaims;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Set<String> prohibitedClaims;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public DefaultJWTClaimsVerifier() {
/* 140 */     this(null, null, null, null);
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
/*     */   public DefaultJWTClaimsVerifier(JWTClaimsSet exactMatchClaims, Set<String> requiredClaims) {
/* 159 */     this(null, exactMatchClaims, requiredClaims, null);
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
/*     */   public DefaultJWTClaimsVerifier(String requiredAudience, JWTClaimsSet exactMatchClaims, Set<String> requiredClaims) {
/* 180 */     this((requiredAudience != null) ? Collections.<String>singleton(requiredAudience) : null, exactMatchClaims, requiredClaims, null);
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
/*     */   public DefaultJWTClaimsVerifier(Set<String> acceptedAudience, JWTClaimsSet exactMatchClaims, Set<String> requiredClaims, Set<String> prohibitedClaims) {
/* 209 */     this.acceptedAudienceValues = (acceptedAudience != null) ? Collections.<String>unmodifiableSet(acceptedAudience) : null;
/*     */     
/* 211 */     this.exactMatchClaims = (exactMatchClaims != null) ? exactMatchClaims : (new JWTClaimsSet.Builder()).build();
/*     */     
/* 213 */     Set<String> requiredClaimsCopy = new HashSet<>(this.exactMatchClaims.getClaims().keySet());
/* 214 */     if (this.acceptedAudienceValues != null && !this.acceptedAudienceValues.contains(null))
/*     */     {
/* 216 */       requiredClaimsCopy.add("aud");
/*     */     }
/* 218 */     if (requiredClaims != null) {
/* 219 */       requiredClaimsCopy.addAll(requiredClaims);
/*     */     }
/* 221 */     this.requiredClaims = Collections.unmodifiableSet(requiredClaimsCopy);
/*     */     
/* 223 */     this.prohibitedClaims = (prohibitedClaims != null) ? Collections.<String>unmodifiableSet(prohibitedClaims) : Collections.<String>emptySet();
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
/*     */   public Set<String> getAcceptedAudienceValues() {
/* 235 */     return this.acceptedAudienceValues;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWTClaimsSet getExactMatchClaims() {
/* 245 */     return this.exactMatchClaims;
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
/*     */   public Set<String> getRequiredClaims() {
/* 257 */     return this.requiredClaims;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getProhibitedClaims() {
/* 268 */     return this.prohibitedClaims;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxClockSkew() {
/* 274 */     return this.maxClockSkew;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxClockSkew(int maxClockSkewSeconds) {
/* 280 */     this.maxClockSkew = maxClockSkewSeconds;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void verify(JWTClaimsSet claimsSet, C context) throws BadJWTException {
/* 289 */     if (this.acceptedAudienceValues != null) {
/* 290 */       List<String> audList = claimsSet.getAudience();
/* 291 */       if (audList != null && !audList.isEmpty()) {
/* 292 */         boolean audMatch = false;
/* 293 */         for (String aud : audList) {
/* 294 */           if (this.acceptedAudienceValues.contains(aud)) {
/* 295 */             audMatch = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 299 */         if (!audMatch) {
/* 300 */           throw new BadJWTException("JWT audience rejected: " + audList);
/*     */         }
/* 302 */       } else if (!this.acceptedAudienceValues.contains(null)) {
/* 303 */         throw new BadJWTException("JWT missing required audience");
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 308 */     if (!claimsSet.getClaims().keySet().containsAll(this.requiredClaims)) {
/* 309 */       SortedSet<String> missingClaims = new TreeSet<>(this.requiredClaims);
/* 310 */       missingClaims.removeAll(claimsSet.getClaims().keySet());
/* 311 */       throw new BadJWTException("JWT missing required claims: " + missingClaims);
/*     */     } 
/*     */ 
/*     */     
/* 315 */     SortedSet<String> presentProhibitedClaims = new TreeSet<>();
/* 316 */     for (String prohibited : this.prohibitedClaims) {
/* 317 */       if (claimsSet.getClaims().containsKey(prohibited)) {
/* 318 */         presentProhibitedClaims.add(prohibited);
/*     */       }
/*     */     } 
/* 321 */     if (!presentProhibitedClaims.isEmpty()) {
/* 322 */       throw new BadJWTException("JWT has prohibited claims: " + presentProhibitedClaims);
/*     */     }
/*     */ 
/*     */     
/* 326 */     for (String exactMatch : this.exactMatchClaims.getClaims().keySet()) {
/* 327 */       Object actualClaim = claimsSet.getClaim(exactMatch);
/* 328 */       Object expectedClaim = this.exactMatchClaims.getClaim(exactMatch);
/* 329 */       if (!actualClaim.equals(expectedClaim)) {
/* 330 */         throw new BadJWTException("JWT " + exactMatch + " claim has value " + actualClaim + ", must be " + expectedClaim);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 335 */     Date now = currentTime();
/*     */     
/* 337 */     if (now != null) {
/* 338 */       Date exp = claimsSet.getExpirationTime();
/* 339 */       if (exp != null)
/*     */       {
/* 341 */         if (!DateUtils.isAfter(exp, now, this.maxClockSkew)) {
/* 342 */           throw new BadJWTException("Expired JWT");
/*     */         }
/*     */       }
/*     */       
/* 346 */       Date nbf = claimsSet.getNotBeforeTime();
/* 347 */       if (nbf != null)
/*     */       {
/* 349 */         if (!DateUtils.isBefore(nbf, now, this.maxClockSkew)) {
/* 350 */           throw new BadJWTException("JWT before use time");
/*     */         }
/*     */       }
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
/*     */   protected Date currentTime() {
/* 368 */     return new Date();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\proc\DefaultJWTClaimsVerifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */