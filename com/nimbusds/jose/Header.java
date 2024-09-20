/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.io.Serializable;
/*     */ import java.text.ParseException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
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
/*     */ public abstract class Header
/*     */   implements Serializable
/*     */ {
/*     */   public static final int MAX_HEADER_STRING_LENGTH = 20000;
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final Algorithm alg;
/*     */   private final JOSEObjectType typ;
/*     */   private final String cty;
/*     */   private final Set<String> crit;
/*     */   private final Map<String, Object> customParams;
/*  88 */   private static final Map<String, Object> EMPTY_CUSTOM_PARAMS = Collections.unmodifiableMap(new HashMap<>());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Base64URL parsedBase64URL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Header(Algorithm alg, JOSEObjectType typ, String cty, Set<String> crit, Map<String, Object> customParams, Base64URL parsedBase64URL) {
/* 121 */     if (alg == null) {
/* 122 */       throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
/*     */     }
/*     */     
/* 125 */     this.alg = alg;
/*     */     
/* 127 */     this.typ = typ;
/* 128 */     this.cty = cty;
/*     */     
/* 130 */     if (crit != null) {
/*     */       
/* 132 */       this.crit = Collections.unmodifiableSet(new HashSet<>(crit));
/*     */     } else {
/* 134 */       this.crit = null;
/*     */     } 
/*     */     
/* 137 */     if (customParams != null) {
/*     */       
/* 139 */       this.customParams = Collections.unmodifiableMap(new HashMap<>(customParams));
/*     */     } else {
/* 141 */       this.customParams = EMPTY_CUSTOM_PARAMS;
/*     */     } 
/*     */     
/* 144 */     this.parsedBase64URL = parsedBase64URL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Header(Header header) {
/* 155 */     this(header
/* 156 */         .getAlgorithm(), header
/* 157 */         .getType(), header
/* 158 */         .getContentType(), header
/* 159 */         .getCriticalParams(), header
/* 160 */         .getCustomParams(), header
/* 161 */         .getParsedBase64URL());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Algorithm getAlgorithm() {
/* 172 */     return this.alg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JOSEObjectType getType() {
/* 183 */     return this.typ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getContentType() {
/* 194 */     return this.cty;
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
/*     */   public Set<String> getCriticalParams() {
/* 206 */     return this.crit;
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
/*     */   public Object getCustomParam(String name) {
/* 220 */     return this.customParams.get(name);
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
/*     */   public Map<String, Object> getCustomParams() {
/* 232 */     return this.customParams;
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
/*     */   public Base64URL getParsedBase64URL() {
/* 244 */     return this.parsedBase64URL;
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
/*     */   public Set<String> getIncludedParams() {
/* 257 */     Set<String> includedParameters = new HashSet<>(getCustomParams().keySet());
/*     */     
/* 259 */     includedParameters.add("alg");
/*     */     
/* 261 */     if (getType() != null) {
/* 262 */       includedParameters.add("typ");
/*     */     }
/*     */     
/* 265 */     if (getContentType() != null) {
/* 266 */       includedParameters.add("cty");
/*     */     }
/*     */     
/* 269 */     if (getCriticalParams() != null && !getCriticalParams().isEmpty()) {
/* 270 */       includedParameters.add("crit");
/*     */     }
/*     */     
/* 273 */     return includedParameters;
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
/*     */   public Map<String, Object> toJSONObject() {
/* 288 */     Map<String, Object> o = JSONObjectUtils.newJSONObject();
/* 289 */     o.putAll(this.customParams);
/*     */ 
/*     */     
/* 292 */     o.put("alg", this.alg.toString());
/*     */     
/* 294 */     if (this.typ != null) {
/* 295 */       o.put("typ", this.typ.toString());
/*     */     }
/*     */     
/* 298 */     if (this.cty != null) {
/* 299 */       o.put("cty", this.cty);
/*     */     }
/*     */     
/* 302 */     if (this.crit != null && !this.crit.isEmpty()) {
/* 303 */       o.put("crit", new ArrayList<>(this.crit));
/*     */     }
/*     */     
/* 306 */     return o;
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
/*     */   public String toString() {
/* 319 */     return JSONObjectUtils.toJSONString(toJSONObject());
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
/*     */   public Base64URL toBase64URL() {
/* 334 */     if (this.parsedBase64URL == null)
/*     */     {
/*     */       
/* 337 */       return Base64URL.encode(toString());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 342 */     return this.parsedBase64URL;
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
/*     */   public static Algorithm parseAlgorithm(Map<String, Object> json) throws ParseException {
/* 368 */     String algName = JSONObjectUtils.getString(json, "alg");
/*     */     
/* 370 */     if (algName == null) {
/* 371 */       throw new ParseException("Missing \"alg\" in header JSON object", 0);
/*     */     }
/*     */ 
/*     */     
/* 375 */     if (algName.equals(Algorithm.NONE.getName()))
/*     */     {
/* 377 */       return Algorithm.NONE; } 
/* 378 */     if (json.containsKey("enc"))
/*     */     {
/* 380 */       return JWEAlgorithm.parse(algName);
/*     */     }
/*     */     
/* 383 */     return JWSAlgorithm.parse(algName);
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
/*     */   public static Header parse(Map<String, Object> jsonObject) throws ParseException {
/* 403 */     return parse(jsonObject, (Base64URL)null);
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
/*     */   public static Header parse(Map<String, Object> jsonObject, Base64URL parsedBase64URL) throws ParseException {
/* 425 */     Algorithm alg = parseAlgorithm(jsonObject);
/*     */     
/* 427 */     if (alg.equals(Algorithm.NONE))
/*     */     {
/* 429 */       return PlainHeader.parse(jsonObject, parsedBase64URL);
/*     */     }
/* 431 */     if (alg instanceof JWSAlgorithm)
/*     */     {
/* 433 */       return JWSHeader.parse(jsonObject, parsedBase64URL);
/*     */     }
/* 435 */     if (alg instanceof JWEAlgorithm)
/*     */     {
/* 437 */       return JWEHeader.parse(jsonObject, parsedBase64URL);
/*     */     }
/*     */ 
/*     */     
/* 441 */     throw new AssertionError("Unexpected algorithm type: " + alg);
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
/*     */   public static Header parse(String jsonString) throws ParseException {
/* 461 */     return parse(jsonString, (Base64URL)null);
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
/*     */   public static Header parse(String jsonString, Base64URL parsedBase64URL) throws ParseException {
/* 483 */     Map<String, Object> jsonObject = JSONObjectUtils.parse(jsonString, 20000);
/*     */     
/* 485 */     return parse(jsonObject, parsedBase64URL);
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
/*     */   public static Header parse(Base64URL base64URL) throws ParseException {
/* 503 */     return parse(base64URL.decodeToString(), base64URL);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\Header.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */