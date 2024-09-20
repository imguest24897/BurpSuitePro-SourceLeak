/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.jwk.JWK;
/*     */ import com.nimbusds.jose.util.Base64;
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import com.nimbusds.jose.util.X509CertChainUtils;
/*     */ import java.net.URI;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public final class JWSHeader
/*     */   extends CommonSEHeader
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private static final Set<String> REGISTERED_PARAMETER_NAMES;
/*     */   private final boolean b64;
/*     */   
/*     */   static {
/*  84 */     Set<String> p = new HashSet<>();
/*     */     
/*  86 */     p.add("alg");
/*  87 */     p.add("jku");
/*  88 */     p.add("jwk");
/*  89 */     p.add("x5u");
/*  90 */     p.add("x5t");
/*  91 */     p.add("x5t#S256");
/*  92 */     p.add("x5c");
/*  93 */     p.add("kid");
/*  94 */     p.add("typ");
/*  95 */     p.add("cty");
/*  96 */     p.add("crit");
/*  97 */     p.add("b64");
/*     */     
/*  99 */     REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(p);
/*     */   }
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
/*     */     private final JWSAlgorithm alg;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private JOSEObjectType typ;
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
/*     */     private Set<String> crit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private URI jku;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private JWK jwk;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private URI x5u;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     private Base64URL x5t;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Base64URL x5t256;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private List<Base64> x5c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private String kid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean b64 = true;
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
/*     */     private Base64URL parsedBase64URL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder(JWSAlgorithm alg) {
/* 213 */       if (alg.getName().equals(Algorithm.NONE.getName())) {
/* 214 */         throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
/*     */       }
/*     */       
/* 217 */       this.alg = alg;
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
/*     */     public Builder(JWSHeader jwsHeader) {
/* 230 */       this(jwsHeader.getAlgorithm());
/*     */       
/* 232 */       this.typ = jwsHeader.getType();
/* 233 */       this.cty = jwsHeader.getContentType();
/* 234 */       this.crit = jwsHeader.getCriticalParams();
/*     */       
/* 236 */       this.jku = jwsHeader.getJWKURL();
/* 237 */       this.jwk = jwsHeader.getJWK();
/* 238 */       this.x5u = jwsHeader.getX509CertURL();
/* 239 */       this.x5t = jwsHeader.getX509CertThumbprint();
/* 240 */       this.x5t256 = jwsHeader.getX509CertSHA256Thumbprint();
/* 241 */       this.x5c = jwsHeader.getX509CertChain();
/* 242 */       this.kid = jwsHeader.getKeyID();
/* 243 */       this.b64 = jwsHeader.isBase64URLEncodePayload();
/* 244 */       this.customParams = jwsHeader.getCustomParams();
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
/* 258 */       this.typ = typ;
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
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder contentType(String cty) {
/* 273 */       this.cty = cty;
/* 274 */       return this;
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
/* 289 */       this.crit = crit;
/* 290 */       return this;
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
/*     */     public Builder jwkURL(URI jku) {
/* 304 */       this.jku = jku;
/* 305 */       return this;
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
/*     */     public Builder jwk(JWK jwk) {
/* 319 */       this.jwk = jwk;
/* 320 */       return this;
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
/*     */     public Builder x509CertURL(URI x5u) {
/* 334 */       this.x5u = x5u;
/* 335 */       return this;
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
/*     */     @Deprecated
/*     */     public Builder x509CertThumbprint(Base64URL x5t) {
/* 351 */       this.x5t = x5t;
/* 352 */       return this;
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
/*     */     public Builder x509CertSHA256Thumbprint(Base64URL x5t256) {
/* 367 */       this.x5t256 = x5t256;
/* 368 */       return this;
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
/*     */     public Builder x509CertChain(List<Base64> x5c) {
/* 383 */       this.x5c = x5c;
/* 384 */       return this;
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
/*     */     public Builder keyID(String kid) {
/* 398 */       this.kid = kid;
/* 399 */       return this;
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
/*     */     public Builder base64URLEncodePayload(boolean b64) {
/* 414 */       this.b64 = b64;
/* 415 */       return this;
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
/* 437 */       if (JWSHeader.getRegisteredParameterNames().contains(name)) {
/* 438 */         throw new IllegalArgumentException("The parameter name \"" + name + "\" matches a registered name");
/*     */       }
/*     */       
/* 441 */       if (this.customParams == null) {
/* 442 */         this.customParams = new HashMap<>();
/*     */       }
/*     */       
/* 445 */       this.customParams.put(name, value);
/*     */       
/* 447 */       return this;
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
/* 462 */       this.customParams = customParameters;
/* 463 */       return this;
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
/* 477 */       this.parsedBase64URL = base64URL;
/* 478 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public JWSHeader build() {
/* 489 */       return new JWSHeader(this.alg, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.b64, this.customParams, this.parsedBase64URL);
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
/*     */   public JWSHeader(JWSAlgorithm alg) {
/* 515 */     this(alg, (JOSEObjectType)null, (String)null, (Set<String>)null, (URI)null, (JWK)null, (URI)null, (Base64URL)null, (Base64URL)null, (List<Base64>)null, (String)null, true, (Map<String, Object>)null, (Base64URL)null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public JWSHeader(JWSAlgorithm alg, JOSEObjectType typ, String cty, Set<String> crit, URI jku, JWK jwk, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, String kid, Map<String, Object> customParams, Base64URL parsedBase64URL) {
/* 570 */     this(alg, typ, cty, crit, jku, jwk, x5u, x5t, x5t256, x5c, kid, true, customParams, parsedBase64URL);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSHeader(JWSAlgorithm alg, JOSEObjectType typ, String cty, Set<String> crit, URI jku, JWK jwk, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, String kid, boolean b64, Map<String, Object> customParams, Base64URL parsedBase64URL) {
/* 628 */     super(alg, typ, cty, crit, jku, jwk, x5u, x5t, x5t256, x5c, kid, customParams, parsedBase64URL);
/*     */     
/* 630 */     if (alg.getName().equals(Algorithm.NONE.getName())) {
/* 631 */       throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
/*     */     }
/*     */     
/* 634 */     this.b64 = b64;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSHeader(JWSHeader jwsHeader) {
/* 645 */     this(jwsHeader
/* 646 */         .getAlgorithm(), jwsHeader
/* 647 */         .getType(), jwsHeader
/* 648 */         .getContentType(), jwsHeader
/* 649 */         .getCriticalParams(), jwsHeader
/* 650 */         .getJWKURL(), jwsHeader
/* 651 */         .getJWK(), jwsHeader
/* 652 */         .getX509CertURL(), jwsHeader
/* 653 */         .getX509CertThumbprint(), jwsHeader
/* 654 */         .getX509CertSHA256Thumbprint(), jwsHeader
/* 655 */         .getX509CertChain(), jwsHeader
/* 656 */         .getKeyID(), jwsHeader
/* 657 */         .isBase64URLEncodePayload(), jwsHeader
/* 658 */         .getCustomParams(), jwsHeader
/* 659 */         .getParsedBase64URL());
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
/* 671 */     return REGISTERED_PARAMETER_NAMES;
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
/*     */   public JWSAlgorithm getAlgorithm() {
/* 683 */     return (JWSAlgorithm)super.getAlgorithm();
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
/*     */   public boolean isBase64URLEncodePayload() {
/* 696 */     return this.b64;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getIncludedParams() {
/* 702 */     Set<String> includedParams = super.getIncludedParams();
/* 703 */     if (!isBase64URLEncodePayload()) {
/* 704 */       includedParams.add("b64");
/*     */     }
/* 706 */     return includedParams;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toJSONObject() {
/* 712 */     Map<String, Object> o = super.toJSONObject();
/* 713 */     if (!isBase64URLEncodePayload()) {
/* 714 */       o.put("b64", Boolean.valueOf(false));
/*     */     }
/* 716 */     return o;
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
/*     */   public static JWSHeader parse(Map<String, Object> jsonObject) throws ParseException {
/* 734 */     return parse(jsonObject, (Base64URL)null);
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
/*     */   public static JWSHeader parse(Map<String, Object> jsonObject, Base64URL parsedBase64URL) throws ParseException {
/* 756 */     Algorithm alg = Header.parseAlgorithm(jsonObject);
/*     */     
/* 758 */     if (!(alg instanceof JWSAlgorithm)) {
/* 759 */       throw new ParseException("Not a JWS header", 0);
/*     */     }
/*     */     
/* 762 */     Builder header = (new Builder((JWSAlgorithm)alg)).parsedBase64URL(parsedBase64URL);
/*     */ 
/*     */     
/* 765 */     for (String name : jsonObject.keySet()) {
/*     */       
/* 767 */       if ("alg".equals(name))
/*     */         continue; 
/* 769 */       if ("typ".equals(name)) {
/* 770 */         String typValue = JSONObjectUtils.getString(jsonObject, name);
/* 771 */         if (typValue != null)
/* 772 */           header = header.type(new JOSEObjectType(typValue));  continue;
/*     */       } 
/* 774 */       if ("cty".equals(name)) {
/* 775 */         header = header.contentType(JSONObjectUtils.getString(jsonObject, name)); continue;
/* 776 */       }  if ("crit".equals(name)) {
/* 777 */         List<String> critValues = JSONObjectUtils.getStringList(jsonObject, name);
/* 778 */         if (critValues != null)
/* 779 */           header = header.criticalParams(new HashSet<>(critValues));  continue;
/*     */       } 
/* 781 */       if ("jku".equals(name)) {
/* 782 */         header = header.jwkURL(JSONObjectUtils.getURI(jsonObject, name)); continue;
/* 783 */       }  if ("jwk".equals(name)) {
/* 784 */         Map<String, Object> jwkObject = JSONObjectUtils.getJSONObject(jsonObject, name);
/* 785 */         if (jwkObject != null)
/* 786 */           header = header.jwk(JWK.parse(jwkObject));  continue;
/*     */       } 
/* 788 */       if ("x5u".equals(name)) {
/* 789 */         header = header.x509CertURL(JSONObjectUtils.getURI(jsonObject, name)); continue;
/* 790 */       }  if ("x5t".equals(name)) {
/* 791 */         header = header.x509CertThumbprint(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 792 */       }  if ("x5t#S256".equals(name)) {
/* 793 */         header = header.x509CertSHA256Thumbprint(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 794 */       }  if ("x5c".equals(name)) {
/* 795 */         header = header.x509CertChain(X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(jsonObject, name))); continue;
/* 796 */       }  if ("kid".equals(name)) {
/* 797 */         header = header.keyID(JSONObjectUtils.getString(jsonObject, name)); continue;
/* 798 */       }  if ("b64".equals(name)) {
/* 799 */         header = header.base64URLEncodePayload(JSONObjectUtils.getBoolean(jsonObject, name)); continue;
/*     */       } 
/* 801 */       header = header.customParam(name, jsonObject.get(name));
/*     */     } 
/*     */ 
/*     */     
/* 805 */     return header.build();
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
/*     */   public static JWSHeader parse(String jsonString) throws ParseException {
/* 823 */     return parse(jsonString, (Base64URL)null);
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
/*     */   public static JWSHeader parse(String jsonString, Base64URL parsedBase64URL) throws ParseException {
/* 844 */     return parse(JSONObjectUtils.parse(jsonString, 20000), parsedBase64URL);
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
/*     */   public static JWSHeader parse(Base64URL base64URL) throws ParseException {
/* 861 */     return parse(base64URL.decodeToString(), base64URL);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSHeader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */