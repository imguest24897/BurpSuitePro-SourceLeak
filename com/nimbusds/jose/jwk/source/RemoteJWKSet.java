/*     */ package com.nimbusds.jose.jwk.source;
/*     */ 
/*     */ import com.nimbusds.jose.KeySourceException;
/*     */ import com.nimbusds.jose.RemoteKeySourceException;
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.jwk.JWKMatcher;
/*     */ import com.nimbusds.jose.jwk.JWKSelector;
/*     */ import com.nimbusds.jose.jwk.JWKSet;
/*     */ import com.nimbusds.jose.proc.SecurityContext;
/*     */ import com.nimbusds.jose.util.DefaultResourceRetriever;
/*     */ import com.nimbusds.jose.util.Resource;
/*     */ import com.nimbusds.jose.util.ResourceRetriever;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ @ThreadSafe
/*     */ public class RemoteJWKSet<C extends SecurityContext>
/*     */   implements JWKSource<C>
/*     */ {
/*     */   public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
/*     */   public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
/*     */   public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
/*     */   private final URL jwkSetURL;
/*     */   private final JWKSource<C> failoverJWKSource;
/*     */   private final JWKSetCache jwkSetCache;
/*     */   private final ResourceRetriever jwkSetRetriever;
/*     */   
/*     */   public static int resolveDefaultHTTPConnectTimeout() {
/* 111 */     return resolveDefault(RemoteJWKSet.class.getName() + ".defaultHttpConnectTimeout", 500);
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
/*     */   public static int resolveDefaultHTTPReadTimeout() {
/* 125 */     return resolveDefault(RemoteJWKSet.class.getName() + ".defaultHttpReadTimeout", 500);
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
/*     */   public static int resolveDefaultHTTPSizeLimit() {
/* 139 */     return resolveDefault(RemoteJWKSet.class.getName() + ".defaultHttpSizeLimit", 51200);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int resolveDefault(String sysPropertyName, int defaultValue) {
/* 145 */     String value = System.getProperty(sysPropertyName);
/*     */     
/* 147 */     if (value == null) {
/* 148 */       return defaultValue;
/*     */     }
/*     */     
/*     */     try {
/* 152 */       return Integer.parseInt(value);
/* 153 */     } catch (NumberFormatException e) {
/*     */       
/* 155 */       return defaultValue;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemoteJWKSet(URL jwkSetURL) {
/* 192 */     this(jwkSetURL, (JWKSource<C>)null);
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
/*     */   public RemoteJWKSet(URL jwkSetURL, JWKSource<C> failoverJWKSource) {
/* 207 */     this(jwkSetURL, failoverJWKSource, null, null);
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
/*     */   public RemoteJWKSet(URL jwkSetURL, ResourceRetriever resourceRetriever) {
/* 224 */     this(jwkSetURL, resourceRetriever, null);
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
/*     */   public RemoteJWKSet(URL jwkSetURL, ResourceRetriever resourceRetriever, JWKSetCache jwkSetCache) {
/* 245 */     this(jwkSetURL, null, resourceRetriever, jwkSetCache);
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
/*     */   public RemoteJWKSet(URL jwkSetURL, JWKSource<C> failoverJWKSource, ResourceRetriever resourceRetriever, JWKSetCache jwkSetCache) {
/* 270 */     if (jwkSetURL == null) {
/* 271 */       throw new IllegalArgumentException("The JWK set URL must not be null");
/*     */     }
/* 273 */     this.jwkSetURL = jwkSetURL;
/*     */     
/* 275 */     this.failoverJWKSource = failoverJWKSource;
/*     */     
/* 277 */     if (resourceRetriever != null) {
/* 278 */       this.jwkSetRetriever = resourceRetriever;
/*     */     } else {
/* 280 */       this
/*     */ 
/*     */         
/* 283 */         .jwkSetRetriever = (ResourceRetriever)new DefaultResourceRetriever(resolveDefaultHTTPConnectTimeout(), resolveDefaultHTTPReadTimeout(), resolveDefaultHTTPSizeLimit());
/*     */     } 
/*     */     
/* 286 */     if (jwkSetCache != null) {
/* 287 */       this.jwkSetCache = jwkSetCache;
/*     */     } else {
/* 289 */       this.jwkSetCache = new DefaultJWKSetCache();
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
/*     */   private JWKSet updateJWKSetFromURL() throws RemoteKeySourceException {
/*     */     Resource res;
/*     */     JWKSet jwkSet;
/*     */     try {
/* 305 */       res = this.jwkSetRetriever.retrieveResource(this.jwkSetURL);
/* 306 */     } catch (IOException e) {
/* 307 */       throw new RemoteKeySourceException("Couldn't retrieve remote JWK set: " + e.getMessage(), e);
/*     */     } 
/*     */     
/*     */     try {
/* 311 */       jwkSet = JWKSet.parse(res.getContent());
/* 312 */     } catch (ParseException e) {
/* 313 */       throw new RemoteKeySourceException("Couldn't parse remote JWK set: " + e.getMessage(), e);
/*     */     } 
/* 315 */     this.jwkSetCache.put(jwkSet);
/* 316 */     return jwkSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public URL getJWKSetURL() {
/* 327 */     return this.jwkSetURL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWKSource<C> getFailoverJWKSource() {
/* 338 */     return this.failoverJWKSource;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResourceRetriever getResourceRetriever() {
/* 349 */     return this.jwkSetRetriever;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWKSetCache getJWKSetCache() {
/* 360 */     return this.jwkSetCache;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWKSet getCachedJWKSet() {
/* 371 */     return this.jwkSetCache.get();
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
/*     */   protected static String getFirstSpecifiedKeyID(JWKMatcher jwkMatcher) {
/* 384 */     Set<String> keyIDs = jwkMatcher.getKeyIDs();
/*     */     
/* 386 */     if (keyIDs == null || keyIDs.isEmpty()) {
/* 387 */       return null;
/*     */     }
/*     */     
/* 390 */     for (String id : keyIDs) {
/* 391 */       if (id != null) {
/* 392 */         return id;
/*     */       }
/*     */     } 
/* 395 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private List<JWK> failover(Exception exception, JWKSelector jwkSelector, C context) throws RemoteKeySourceException {
/* 405 */     if (getFailoverJWKSource() == null) {
/* 406 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 410 */       return getFailoverJWKSource().get(jwkSelector, context);
/* 411 */     } catch (KeySourceException kse) {
/* 412 */       throw new RemoteKeySourceException(exception
/* 413 */           .getMessage() + "; Failover JWK source retrieval failed with: " + kse
/* 414 */           .getMessage(), kse);
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
/*     */   public List<JWK> get(JWKSelector jwkSelector, C context) throws RemoteKeySourceException {
/* 426 */     JWKSet jwkSet = this.jwkSetCache.get();
/*     */     
/* 428 */     if (this.jwkSetCache.requiresRefresh() || jwkSet == null) {
/*     */       
/*     */       try {
/*     */ 
/*     */         
/* 433 */         synchronized (this) {
/* 434 */           jwkSet = this.jwkSetCache.get();
/* 435 */           if (this.jwkSetCache.requiresRefresh() || jwkSet == null)
/*     */           {
/* 437 */             jwkSet = updateJWKSetFromURL();
/*     */           }
/*     */         } 
/* 440 */       } catch (Exception e) {
/*     */         
/* 442 */         List<JWK> failoverMatches = failover(e, jwkSelector, context);
/* 443 */         if (failoverMatches != null) {
/* 444 */           return failoverMatches;
/*     */         }
/*     */         
/* 447 */         if (jwkSet == null)
/*     */         {
/* 449 */           throw e;
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 457 */     List<JWK> matches = jwkSelector.select(jwkSet);
/*     */     
/* 459 */     if (!matches.isEmpty())
/*     */     {
/* 461 */       return matches;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 467 */     String soughtKeyID = getFirstSpecifiedKeyID(jwkSelector.getMatcher());
/* 468 */     if (soughtKeyID == null)
/*     */     {
/* 470 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 473 */     if (jwkSet.getKeyByKeyId(soughtKeyID) != null)
/*     */     {
/*     */       
/* 476 */       return Collections.emptyList();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 483 */       synchronized (this) {
/* 484 */         if (jwkSet == this.jwkSetCache.get()) {
/*     */           
/* 486 */           jwkSet = updateJWKSetFromURL();
/*     */         } else {
/*     */           
/* 489 */           jwkSet = this.jwkSetCache.get();
/*     */         } 
/*     */       } 
/* 492 */     } catch (KeySourceException e) {
/*     */       
/* 494 */       List<JWK> failoverMatches = failover((Exception)e, jwkSelector, context);
/* 495 */       if (failoverMatches != null) {
/* 496 */         return failoverMatches;
/*     */       }
/*     */       
/* 499 */       throw e;
/*     */     } 
/*     */ 
/*     */     
/* 503 */     if (jwkSet == null)
/*     */     {
/* 505 */       return Collections.emptyList();
/*     */     }
/*     */ 
/*     */     
/* 509 */     return jwkSelector.select(jwkSet);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\RemoteJWKSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */