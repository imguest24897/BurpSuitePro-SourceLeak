/*     */ package com.nimbusds.jose.jwk;
/*     */ 
/*     */ import com.nimbusds.jose.JOSEException;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.DefaultResourceRetriever;
/*     */ import com.nimbusds.jose.util.IOUtils;
/*     */ import com.nimbusds.jose.util.JSONArrayUtils;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import com.nimbusds.jose.util.Resource;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Serializable;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.security.KeyStore;
/*     */ import java.security.KeyStoreException;
/*     */ import java.security.cert.Certificate;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public class JWKSet
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   public static final String MIME_TYPE = "application/jwk-set+json; charset=UTF-8";
/*     */   private final List<JWK> keys;
/*     */   private final Map<String, Object> customMembers;
/*     */   
/*     */   public JWKSet() {
/* 106 */     this(Collections.emptyList());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWKSet(JWK key) {
/* 117 */     this(Collections.singletonList(key));
/*     */     
/* 119 */     if (key == null) {
/* 120 */       throw new IllegalArgumentException("The JWK must not be null");
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
/*     */   public JWKSet(List<JWK> keys) {
/* 132 */     this(keys, Collections.emptyMap());
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
/*     */   public JWKSet(List<JWK> keys, Map<String, Object> customMembers) {
/* 146 */     if (keys == null) {
/* 147 */       throw new IllegalArgumentException("The JWK list must not be null");
/*     */     }
/*     */     
/* 150 */     this.keys = Collections.unmodifiableList(keys);
/*     */     
/* 152 */     this.customMembers = Collections.unmodifiableMap(customMembers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<JWK> getKeys() {
/* 163 */     return this.keys;
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
/*     */   public JWK getKeyByKeyId(String kid) {
/* 181 */     for (JWK key : getKeys()) {
/*     */       
/* 183 */       if (key.getKeyID() != null && key.getKeyID().equals(kid)) {
/* 184 */         return key;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 189 */     return null;
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
/*     */   public boolean containsJWK(JWK jwk) throws JOSEException {
/* 206 */     Base64URL thumbprint = jwk.computeThumbprint();
/*     */     
/* 208 */     for (JWK k : getKeys()) {
/* 209 */       if (thumbprint.equals(k.computeThumbprint())) {
/* 210 */         return true;
/*     */       }
/*     */     } 
/* 213 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> getAdditionalMembers() {
/* 224 */     return this.customMembers;
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
/*     */   public JWKSet toPublicJWKSet() {
/* 237 */     List<JWK> publicKeyList = new LinkedList<>();
/*     */     
/* 239 */     for (JWK key : this.keys) {
/*     */       
/* 241 */       JWK publicKey = key.toPublicJWK();
/*     */       
/* 243 */       if (publicKey != null) {
/* 244 */         publicKeyList.add(publicKey);
/*     */       }
/*     */     } 
/*     */     
/* 248 */     return new JWKSet(publicKeyList, this.customMembers);
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
/*     */   public Map<String, Object> toJSONObject() {
/* 261 */     return toJSONObject(true);
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
/*     */   public Map<String, Object> toJSONObject(boolean publicKeysOnly) {
/* 279 */     Map<String, Object> o = JSONObjectUtils.newJSONObject();
/* 280 */     o.putAll(this.customMembers);
/* 281 */     List<Object> a = JSONArrayUtils.newJSONArray();
/*     */     
/* 283 */     for (JWK key : this.keys) {
/*     */       
/* 285 */       if (publicKeysOnly) {
/*     */ 
/*     */         
/* 288 */         JWK publicKey = key.toPublicJWK();
/*     */         
/* 290 */         if (publicKey != null) {
/* 291 */           a.add(publicKey.toJSONObject());
/*     */         }
/*     */         continue;
/*     */       } 
/* 295 */       a.add(key.toJSONObject());
/*     */     } 
/*     */ 
/*     */     
/* 299 */     o.put("keys", a);
/*     */     
/* 301 */     return o;
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
/*     */   public String toString(boolean publicKeysOnly) {
/* 319 */     return JSONObjectUtils.toJSONString(toJSONObject(publicKeysOnly));
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
/*     */   public String toString() {
/* 334 */     return toString(true);
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
/*     */   public static JWKSet parse(String s) throws ParseException {
/* 351 */     return parse(JSONObjectUtils.parse(s));
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
/*     */   public static JWKSet parse(Map<String, Object> json) throws ParseException {
/* 369 */     List<Object> keyArray = JSONObjectUtils.getJSONArray(json, "keys");
/*     */     
/* 371 */     if (keyArray == null) {
/* 372 */       throw new ParseException("Missing required \"keys\" member", 0);
/*     */     }
/*     */     
/* 375 */     List<JWK> keys = new LinkedList<>();
/*     */     
/* 377 */     for (int i = 0; i < keyArray.size(); i++) {
/*     */       
/*     */       try {
/* 380 */         Map<String, Object> keyJSONObject = (Map<String, Object>)keyArray.get(i);
/* 381 */         keys.add(JWK.parse(keyJSONObject));
/*     */       }
/* 383 */       catch (ClassCastException e) {
/*     */         
/* 385 */         throw new ParseException("The \"keys\" JSON array must contain JSON objects only", 0);
/*     */       }
/* 387 */       catch (ParseException e) {
/*     */         
/* 389 */         if (e.getMessage() == null || !e.getMessage().startsWith("Unsupported key type"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 395 */           throw new ParseException("Invalid JWK at position " + i + ": " + e.getMessage(), 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 400 */     Map<String, Object> additionalMembers = new HashMap<>();
/* 401 */     for (Map.Entry<String, Object> entry : json.entrySet()) {
/*     */       
/* 403 */       if (entry.getKey() == null || ((String)entry.getKey()).equals("keys")) {
/*     */         continue;
/*     */       }
/*     */       
/* 407 */       additionalMembers.put(entry.getKey(), entry.getValue());
/*     */     } 
/*     */     
/* 410 */     return new JWKSet(keys, additionalMembers);
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
/*     */   public static JWKSet load(InputStream inputStream) throws IOException, ParseException {
/* 428 */     return parse(IOUtils.readInputStreamToString(inputStream, StandardCharset.UTF_8));
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
/*     */   public static JWKSet load(File file) throws IOException, ParseException {
/* 446 */     return parse(IOUtils.readFileToString(file, StandardCharset.UTF_8));
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
/*     */   public static JWKSet load(URL url, int connectTimeout, int readTimeout, int sizeLimit) throws IOException, ParseException {
/* 473 */     return load(url, connectTimeout, readTimeout, sizeLimit, null);
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
/*     */   public static JWKSet load(URL url, int connectTimeout, int readTimeout, int sizeLimit, Proxy proxy) throws IOException, ParseException {
/* 504 */     DefaultResourceRetriever resourceRetriever = new DefaultResourceRetriever(connectTimeout, readTimeout, sizeLimit);
/*     */ 
/*     */ 
/*     */     
/* 508 */     resourceRetriever.setProxy(proxy);
/* 509 */     Resource resource = resourceRetriever.retrieveResource(url);
/* 510 */     return parse(resource.getContent());
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
/*     */   public static JWKSet load(URL url) throws IOException, ParseException {
/* 528 */     return load(url, 0, 0, 0);
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
/*     */   public static JWKSet load(KeyStore keyStore, PasswordLookup pwLookup) throws KeyStoreException {
/* 551 */     List<JWK> jwks = new LinkedList<>();
/*     */     
/*     */     Enumeration<String> keyAliases;
/* 554 */     for (keyAliases = keyStore.aliases(); keyAliases.hasMoreElements(); ) {
/*     */       
/* 556 */       String keyAlias = keyAliases.nextElement();
/* 557 */       char[] keyPassword = (pwLookup == null) ? "".toCharArray() : pwLookup.lookupPassword(keyAlias);
/*     */       
/* 559 */       Certificate cert = keyStore.getCertificate(keyAlias);
/* 560 */       if (cert == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 564 */       if (cert.getPublicKey() instanceof java.security.interfaces.RSAPublicKey) {
/*     */         RSAKey rsaJWK;
/*     */         
/*     */         try {
/* 568 */           rsaJWK = RSAKey.load(keyStore, keyAlias, keyPassword);
/* 569 */         } catch (JOSEException e) {
/*     */           continue;
/*     */         } 
/*     */         
/* 573 */         if (rsaJWK == null) {
/*     */           continue;
/*     */         }
/*     */         
/* 577 */         jwks.add(rsaJWK); continue;
/*     */       } 
/* 579 */       if (cert.getPublicKey() instanceof java.security.interfaces.ECPublicKey) {
/*     */         ECKey ecJWK;
/*     */         
/*     */         try {
/* 583 */           ecJWK = ECKey.load(keyStore, keyAlias, keyPassword);
/* 584 */         } catch (JOSEException e) {
/*     */           continue;
/*     */         } 
/*     */         
/* 588 */         if (ecJWK != null) {
/* 589 */           jwks.add(ecJWK);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 596 */     for (keyAliases = keyStore.aliases(); keyAliases.hasMoreElements(); ) {
/*     */       OctetSequenceKey octJWK;
/* 598 */       String keyAlias = keyAliases.nextElement();
/* 599 */       char[] keyPassword = (pwLookup == null) ? "".toCharArray() : pwLookup.lookupPassword(keyAlias);
/*     */ 
/*     */       
/*     */       try {
/* 603 */         octJWK = OctetSequenceKey.load(keyStore, keyAlias, keyPassword);
/* 604 */       } catch (JOSEException e) {
/*     */         ECKey ecJWK;
/*     */         continue;
/*     */       } 
/* 608 */       if (octJWK != null) {
/* 609 */         jwks.add(octJWK);
/*     */       }
/*     */     } 
/*     */     
/* 613 */     return new JWKSet(jwks);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\JWKSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */