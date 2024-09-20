/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ @Immutable
/*     */ public final class PlainHeader
/*     */   extends Header
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private static final Set<String> REGISTERED_PARAMETER_NAMES;
/*     */   
/*     */   static {
/*  74 */     Set<String> p = new HashSet<>();
/*     */     
/*  76 */     p.add("alg");
/*  77 */     p.add("typ");
/*  78 */     p.add("cty");
/*  79 */     p.add("crit");
/*     */     
/*  81 */     REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(p);
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
/*     */   public static class Builder
/*     */   {
/*     */     private JOSEObjectType typ;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private String cty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Set<String> crit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Map<String, Object> customParams;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Base64URL parsedBase64URL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder(PlainHeader plainHeader) {
/* 147 */       this.typ = plainHeader.getType();
/* 148 */       this.cty = plainHeader.getContentType();
/* 149 */       this.crit = plainHeader.getCriticalParams();
/* 150 */       this.customParams = plainHeader.getCustomParams();
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
/*     */     public Builder type(JOSEObjectType typ) {
/* 164 */       this.typ = typ;
/* 165 */       return this;
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
/*     */     public Builder contentType(String cty) {
/* 179 */       this.cty = cty;
/* 180 */       return this;
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
/*     */     
/*     */     public Builder criticalParams(Set<String> crit) {
/* 195 */       this.crit = crit;
/* 196 */       return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder customParam(String name, Object value) {
/* 218 */       if (PlainHeader.getRegisteredParameterNames().contains(name)) {
/* 219 */         throw new IllegalArgumentException("The parameter name \"" + name + "\" matches a registered name");
/*     */       }
/*     */       
/* 222 */       if (this.customParams == null) {
/* 223 */         this.customParams = new HashMap<>();
/*     */       }
/*     */       
/* 226 */       this.customParams.put(name, value);
/*     */       
/* 228 */       return this;
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
/*     */     
/*     */     public Builder customParams(Map<String, Object> customParameters) {
/* 243 */       this.customParams = customParameters;
/* 244 */       return this;
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
/*     */     public Builder parsedBase64URL(Base64URL base64URL) {
/* 258 */       this.parsedBase64URL = base64URL;
/* 259 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public PlainHeader build() {
/* 270 */       return new PlainHeader(this.typ, this.cty, this.crit, this.customParams, this.parsedBase64URL);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PlainHeader() {
/* 281 */     this((JOSEObjectType)null, (String)null, (Set<String>)null, (Map<String, Object>)null, (Base64URL)null);
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
/*     */   public PlainHeader(JOSEObjectType typ, String cty, Set<String> crit, Map<String, Object> customParams, Base64URL parsedBase64URL) {
/* 307 */     super(Algorithm.NONE, typ, cty, crit, customParams, parsedBase64URL);
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
/*     */   public PlainHeader(PlainHeader plainHeader) {
/* 319 */     this(plainHeader
/* 320 */         .getType(), plainHeader
/* 321 */         .getContentType(), plainHeader
/* 322 */         .getCriticalParams(), plainHeader
/* 323 */         .getCustomParams(), plainHeader
/* 324 */         .getParsedBase64URL());
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
/*     */   public static Set<String> getRegisteredParameterNames() {
/* 336 */     return REGISTERED_PARAMETER_NAMES;
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
/*     */   public Algorithm getAlgorithm() {
/* 348 */     return Algorithm.NONE;
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
/*     */   public static PlainHeader parse(Map<String, Object> jsonObject) throws ParseException {
/* 365 */     return parse(jsonObject, (Base64URL)null);
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
/*     */   public static PlainHeader parse(Map<String, Object> jsonObject, Base64URL parsedBase64URL) throws ParseException {
/* 387 */     Algorithm alg = Header.parseAlgorithm(jsonObject);
/*     */     
/* 389 */     if (alg != Algorithm.NONE) {
/* 390 */       throw new ParseException("The algorithm \"alg\" header parameter must be \"none\"", 0);
/*     */     }
/*     */     
/* 393 */     Builder header = (new Builder()).parsedBase64URL(parsedBase64URL);
/*     */ 
/*     */     
/* 396 */     for (String name : jsonObject.keySet()) {
/*     */       
/* 398 */       if ("alg".equals(name))
/*     */         continue; 
/* 400 */       if ("typ".equals(name)) {
/* 401 */         String typValue = JSONObjectUtils.getString(jsonObject, name);
/* 402 */         if (typValue != null)
/* 403 */           header = header.type(new JOSEObjectType(typValue));  continue;
/*     */       } 
/* 405 */       if ("cty".equals(name)) {
/* 406 */         header = header.contentType(JSONObjectUtils.getString(jsonObject, name)); continue;
/* 407 */       }  if ("crit".equals(name)) {
/* 408 */         List<String> critValues = JSONObjectUtils.getStringList(jsonObject, name);
/* 409 */         if (critValues != null)
/* 410 */           header = header.criticalParams(new HashSet<>(critValues)); 
/*     */         continue;
/*     */       } 
/* 413 */       header = header.customParam(name, jsonObject.get(name));
/*     */     } 
/*     */ 
/*     */     
/* 417 */     return header.build();
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
/*     */   public static PlainHeader parse(String jsonString) throws ParseException {
/* 435 */     return parse(jsonString, (Base64URL)null);
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
/*     */   public static PlainHeader parse(String jsonString, Base64URL parsedBase64URL) throws ParseException {
/* 456 */     return parse(JSONObjectUtils.parse(jsonString, 20000), parsedBase64URL);
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
/*     */   public static PlainHeader parse(Base64URL base64URL) throws ParseException {
/* 473 */     return parse(base64URL.decodeToString(), base64URL);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\PlainHeader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */