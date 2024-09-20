/*     */ package com.nimbusds.jose.jwk.source;
/*     */ 
/*     */ import com.nimbusds.jose.jwk.JWKSet;
/*     */ import java.util.Date;
/*     */ import java.util.concurrent.TimeUnit;
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
/*     */ @ThreadSafe
/*     */ public class DefaultJWKSetCache
/*     */   implements JWKSetCache
/*     */ {
/*     */   public static final long DEFAULT_LIFESPAN_MINUTES = 15L;
/*     */   public static final long DEFAULT_REFRESH_TIME_MINUTES = 5L;
/*     */   private final long lifespan;
/*     */   private final long refreshTime;
/*     */   private final TimeUnit timeUnit;
/*     */   private volatile JWKSetWithTimestamp jwkSetWithTimestamp;
/*     */   
/*     */   public DefaultJWKSetCache() {
/*  84 */     this(15L, 5L, TimeUnit.MINUTES);
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
/*     */   public DefaultJWKSetCache(long lifespan, long refreshTime, TimeUnit timeUnit) {
/* 101 */     this.lifespan = lifespan;
/* 102 */     this.refreshTime = refreshTime;
/*     */     
/* 104 */     if ((lifespan > -1L || refreshTime > -1L) && timeUnit == null) {
/* 105 */       throw new IllegalArgumentException("A time unit must be specified for non-negative lifespans or refresh times");
/*     */     }
/*     */     
/* 108 */     this.timeUnit = timeUnit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void put(JWKSet jwkSet) {
/*     */     JWKSetWithTimestamp updatedJWKSetWithTs;
/* 116 */     if (jwkSet != null) {
/* 117 */       updatedJWKSetWithTs = new JWKSetWithTimestamp(jwkSet);
/*     */     } else {
/*     */       
/* 120 */       updatedJWKSetWithTs = null;
/*     */     } 
/*     */     
/* 123 */     this.jwkSetWithTimestamp = updatedJWKSetWithTs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWKSet get() {
/* 130 */     if (this.jwkSetWithTimestamp == null || isExpired()) {
/* 131 */       return null;
/*     */     }
/*     */     
/* 134 */     return this.jwkSetWithTimestamp.getJWKSet();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean requiresRefresh() {
/* 141 */     return (this.jwkSetWithTimestamp != null && this.refreshTime > -1L && (new Date())
/*     */       
/* 143 */       .getTime() > this.jwkSetWithTimestamp.getDate().getTime() + TimeUnit.MILLISECONDS.convert(this.refreshTime, this.timeUnit));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getPutTimestamp() {
/* 154 */     return (this.jwkSetWithTimestamp != null) ? this.jwkSetWithTimestamp.getDate().getTime() : -1L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isExpired() {
/* 165 */     return (this.jwkSetWithTimestamp != null && this.lifespan > -1L && (new Date())
/*     */       
/* 167 */       .getTime() > this.jwkSetWithTimestamp.getDate().getTime() + TimeUnit.MILLISECONDS.convert(this.lifespan, this.timeUnit));
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
/*     */   public long getLifespan(TimeUnit timeUnit) {
/* 180 */     if (this.lifespan < 0L) {
/* 181 */       return this.lifespan;
/*     */     }
/*     */     
/* 184 */     return timeUnit.convert(this.lifespan, this.timeUnit);
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
/*     */   public long getRefreshTime(TimeUnit timeUnit) {
/* 197 */     if (this.refreshTime < 0L) {
/* 198 */       return this.refreshTime;
/*     */     }
/*     */     
/* 201 */     return timeUnit.convert(this.refreshTime, this.timeUnit);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\DefaultJWKSetCache.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */