/*      */ package com.nimbusds.jose;
/*      */ 
/*      */ import com.nimbusds.jose.jwk.JWK;
/*      */ import com.nimbusds.jose.util.Base64;
/*      */ import com.nimbusds.jose.util.Base64URL;
/*      */ import com.nimbusds.jose.util.JSONObjectUtils;
/*      */ import com.nimbusds.jose.util.X509CertChainUtils;
/*      */ import java.net.URI;
/*      */ import java.text.ParseException;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import net.jcip.annotations.Immutable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Immutable
/*      */ public final class JWEHeader
/*      */   extends CommonSEHeader
/*      */ {
/*      */   private static final long serialVersionUID = 1L;
/*      */   private static final Set<String> REGISTERED_PARAMETER_NAMES;
/*      */   private final EncryptionMethod enc;
/*      */   private final JWK epk;
/*      */   private final CompressionAlgorithm zip;
/*      */   private final Base64URL apu;
/*      */   private final Base64URL apv;
/*      */   private final Base64URL p2s;
/*      */   private final int p2c;
/*      */   private final Base64URL iv;
/*      */   private final Base64URL tag;
/*      */   private final String skid;
/*      */   
/*      */   static {
/*   93 */     Set<String> p = new HashSet<>();
/*      */     
/*   95 */     p.add("alg");
/*   96 */     p.add("enc");
/*   97 */     p.add("epk");
/*   98 */     p.add("zip");
/*   99 */     p.add("jku");
/*  100 */     p.add("jwk");
/*  101 */     p.add("x5u");
/*  102 */     p.add("x5t");
/*  103 */     p.add("x5t#S256");
/*  104 */     p.add("x5c");
/*  105 */     p.add("kid");
/*  106 */     p.add("typ");
/*  107 */     p.add("cty");
/*  108 */     p.add("crit");
/*  109 */     p.add("apu");
/*  110 */     p.add("apv");
/*  111 */     p.add("p2s");
/*  112 */     p.add("p2c");
/*  113 */     p.add("iv");
/*  114 */     p.add("tag");
/*  115 */     p.add("skid");
/*  116 */     p.add("authTag");
/*      */     
/*  118 */     REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(p);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Builder
/*      */   {
/*      */     private final JWEAlgorithm alg;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final EncryptionMethod enc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private JOSEObjectType typ;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String cty;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Set<String> crit;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private URI jku;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private JWK jwk;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private URI x5u;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     private Base64URL x5t;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL x5t256;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private List<Base64> x5c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String kid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private JWK epk;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private CompressionAlgorithm zip;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL apu;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL apv;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL p2s;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private int p2c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL iv;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL tag;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String skid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Map<String, Object> customParams;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Base64URL parsedBase64URL;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder(JWEAlgorithm alg, EncryptionMethod enc) {
/*  286 */       if (alg.getName().equals(Algorithm.NONE.getName())) {
/*  287 */         throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
/*      */       }
/*      */       
/*  290 */       this.alg = alg;
/*      */       
/*  292 */       if (enc == null) {
/*  293 */         throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
/*      */       }
/*      */       
/*  296 */       this.enc = enc;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder(JWEHeader jweHeader) {
/*  309 */       this(jweHeader.getAlgorithm(), jweHeader.getEncryptionMethod());
/*      */       
/*  311 */       this.typ = jweHeader.getType();
/*  312 */       this.cty = jweHeader.getContentType();
/*  313 */       this.crit = jweHeader.getCriticalParams();
/*  314 */       this.customParams = jweHeader.getCustomParams();
/*      */       
/*  316 */       this.jku = jweHeader.getJWKURL();
/*  317 */       this.jwk = jweHeader.getJWK();
/*  318 */       this.x5u = jweHeader.getX509CertURL();
/*  319 */       this.x5t = jweHeader.getX509CertThumbprint();
/*  320 */       this.x5t256 = jweHeader.getX509CertSHA256Thumbprint();
/*  321 */       this.x5c = jweHeader.getX509CertChain();
/*  322 */       this.kid = jweHeader.getKeyID();
/*      */       
/*  324 */       this.epk = jweHeader.getEphemeralPublicKey();
/*  325 */       this.zip = jweHeader.getCompressionAlgorithm();
/*  326 */       this.apu = jweHeader.getAgreementPartyUInfo();
/*  327 */       this.apv = jweHeader.getAgreementPartyVInfo();
/*  328 */       this.p2s = jweHeader.getPBES2Salt();
/*  329 */       this.p2c = jweHeader.getPBES2Count();
/*  330 */       this.iv = jweHeader.getIV();
/*  331 */       this.tag = jweHeader.getAuthTag();
/*      */       
/*  333 */       this.skid = jweHeader.getSenderKeyID();
/*      */       
/*  335 */       this.customParams = jweHeader.getCustomParams();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder type(JOSEObjectType typ) {
/*  349 */       this.typ = typ;
/*  350 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder contentType(String cty) {
/*  364 */       this.cty = cty;
/*  365 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder criticalParams(Set<String> crit) {
/*  380 */       this.crit = crit;
/*  381 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder jwkURL(URI jku) {
/*  395 */       this.jku = jku;
/*  396 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder jwk(JWK jwk) {
/*  410 */       this.jwk = jwk;
/*  411 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder x509CertURL(URI x5u) {
/*  425 */       this.x5u = x5u;
/*  426 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Builder x509CertThumbprint(Base64URL x5t) {
/*  442 */       this.x5t = x5t;
/*  443 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder x509CertSHA256Thumbprint(Base64URL x5t256) {
/*  458 */       this.x5t256 = x5t256;
/*  459 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder x509CertChain(List<Base64> x5c) {
/*  474 */       this.x5c = x5c;
/*  475 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder keyID(String kid) {
/*  489 */       this.kid = kid;
/*  490 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder ephemeralPublicKey(JWK epk) {
/*  504 */       this.epk = epk;
/*  505 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder compressionAlgorithm(CompressionAlgorithm zip) {
/*  519 */       this.zip = zip;
/*  520 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder agreementPartyUInfo(Base64URL apu) {
/*  534 */       this.apu = apu;
/*  535 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder agreementPartyVInfo(Base64URL apv) {
/*  549 */       this.apv = apv;
/*  550 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder pbes2Salt(Base64URL p2s) {
/*  564 */       this.p2s = p2s;
/*  565 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder pbes2Count(int p2c) {
/*  579 */       if (p2c < 0) {
/*  580 */         throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
/*      */       }
/*  582 */       this.p2c = p2c;
/*  583 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder iv(Base64URL iv) {
/*  597 */       this.iv = iv;
/*  598 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder authTag(Base64URL tag) {
/*  612 */       this.tag = tag;
/*  613 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder senderKeyID(String skid) {
/*  627 */       this.skid = skid;
/*  628 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder customParam(String name, Object value) {
/*  650 */       if (JWEHeader.getRegisteredParameterNames().contains(name)) {
/*  651 */         throw new IllegalArgumentException("The parameter name \"" + name + "\" matches a registered name");
/*      */       }
/*      */       
/*  654 */       if (this.customParams == null) {
/*  655 */         this.customParams = new HashMap<>();
/*      */       }
/*      */       
/*  658 */       this.customParams.put(name, value);
/*      */       
/*  660 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder customParams(Map<String, Object> customParameters) {
/*  675 */       this.customParams = customParameters;
/*  676 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder parsedBase64URL(Base64URL base64URL) {
/*  690 */       this.parsedBase64URL = base64URL;
/*  691 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public JWEHeader build() {
/*  702 */       return new JWEHeader(this.alg, this.enc, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.epk, this.zip, this.apu, this.apv, this.p2s, this.p2c, this.iv, this.tag, this.skid, this.customParams, this.parsedBase64URL);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JWEHeader(JWEAlgorithm alg, EncryptionMethod enc) {
/*  785 */     this(alg, enc, (JOSEObjectType)null, (String)null, (Set<String>)null, (URI)null, (JWK)null, (URI)null, (Base64URL)null, (Base64URL)null, (List<Base64>)null, (String)null, (JWK)null, (CompressionAlgorithm)null, (Base64URL)null, (Base64URL)null, (Base64URL)null, 0, (Base64URL)null, (Base64URL)null, (String)null, (Map<String, Object>)null, (Base64URL)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JWEHeader(Algorithm alg, EncryptionMethod enc, JOSEObjectType typ, String cty, Set<String> crit, URI jku, JWK jwk, URI x5u, Base64URL x5t, Base64URL x5t256, List<Base64> x5c, String kid, JWK epk, CompressionAlgorithm zip, Base64URL apu, Base64URL apv, Base64URL p2s, int p2c, Base64URL iv, Base64URL tag, String skid, Map<String, Object> customParams, Base64URL parsedBase64URL) {
/*  874 */     super(alg, typ, cty, crit, jku, jwk, x5u, x5t, x5t256, x5c, kid, customParams, parsedBase64URL);
/*      */     
/*  876 */     if (alg.getName().equals(Algorithm.NONE.getName())) {
/*  877 */       throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
/*      */     }
/*      */     
/*  880 */     if (enc == null) {
/*  881 */       throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
/*      */     }
/*      */     
/*  884 */     if (epk != null && epk.isPrivate()) {
/*  885 */       throw new IllegalArgumentException("Ephemeral public key should not be a private key");
/*      */     }
/*      */     
/*  888 */     this.enc = enc;
/*      */     
/*  890 */     this.epk = epk;
/*  891 */     this.zip = zip;
/*  892 */     this.apu = apu;
/*  893 */     this.apv = apv;
/*  894 */     this.p2s = p2s;
/*  895 */     this.p2c = p2c;
/*  896 */     this.iv = iv;
/*  897 */     this.tag = tag;
/*  898 */     this.skid = skid;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JWEHeader(JWEHeader jweHeader) {
/*  909 */     this(jweHeader
/*  910 */         .getAlgorithm(), jweHeader
/*  911 */         .getEncryptionMethod(), jweHeader
/*  912 */         .getType(), jweHeader
/*  913 */         .getContentType(), jweHeader
/*  914 */         .getCriticalParams(), jweHeader
/*  915 */         .getJWKURL(), jweHeader
/*  916 */         .getJWK(), jweHeader
/*  917 */         .getX509CertURL(), jweHeader
/*  918 */         .getX509CertThumbprint(), jweHeader
/*  919 */         .getX509CertSHA256Thumbprint(), jweHeader
/*  920 */         .getX509CertChain(), jweHeader
/*  921 */         .getKeyID(), jweHeader
/*  922 */         .getEphemeralPublicKey(), jweHeader
/*  923 */         .getCompressionAlgorithm(), jweHeader
/*  924 */         .getAgreementPartyUInfo(), jweHeader
/*  925 */         .getAgreementPartyVInfo(), jweHeader
/*  926 */         .getPBES2Salt(), jweHeader
/*  927 */         .getPBES2Count(), jweHeader
/*  928 */         .getIV(), jweHeader
/*  929 */         .getAuthTag(), jweHeader
/*  930 */         .getSenderKeyID(), jweHeader
/*  931 */         .getCustomParams(), jweHeader
/*  932 */         .getParsedBase64URL());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Set<String> getRegisteredParameterNames() {
/*  944 */     return REGISTERED_PARAMETER_NAMES;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JWEAlgorithm getAlgorithm() {
/*  956 */     return (JWEAlgorithm)super.getAlgorithm();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EncryptionMethod getEncryptionMethod() {
/*  967 */     return this.enc;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JWK getEphemeralPublicKey() {
/*  979 */     return this.epk;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CompressionAlgorithm getCompressionAlgorithm() {
/*  991 */     return this.zip;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getAgreementPartyUInfo() {
/* 1003 */     return this.apu;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getAgreementPartyVInfo() {
/* 1015 */     return this.apv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getPBES2Salt() {
/* 1026 */     return this.p2s;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPBES2Count() {
/* 1037 */     return this.p2c;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getIV() {
/* 1048 */     return this.iv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Base64URL getAuthTag() {
/* 1059 */     return this.tag;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSenderKeyID() {
/* 1070 */     return this.skid;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<String> getIncludedParams() {
/* 1077 */     Set<String> includedParameters = super.getIncludedParams();
/*      */     
/* 1079 */     if (this.enc != null) {
/* 1080 */       includedParameters.add("enc");
/*      */     }
/*      */     
/* 1083 */     if (this.epk != null) {
/* 1084 */       includedParameters.add("epk");
/*      */     }
/*      */     
/* 1087 */     if (this.zip != null) {
/* 1088 */       includedParameters.add("zip");
/*      */     }
/*      */     
/* 1091 */     if (this.apu != null) {
/* 1092 */       includedParameters.add("apu");
/*      */     }
/*      */     
/* 1095 */     if (this.apv != null) {
/* 1096 */       includedParameters.add("apv");
/*      */     }
/*      */     
/* 1099 */     if (this.p2s != null) {
/* 1100 */       includedParameters.add("p2s");
/*      */     }
/*      */     
/* 1103 */     if (this.p2c > 0) {
/* 1104 */       includedParameters.add("p2c");
/*      */     }
/*      */     
/* 1107 */     if (this.iv != null) {
/* 1108 */       includedParameters.add("iv");
/*      */     }
/*      */     
/* 1111 */     if (this.tag != null) {
/* 1112 */       includedParameters.add("tag");
/*      */     }
/*      */     
/* 1115 */     if (this.skid != null) {
/* 1116 */       includedParameters.add("skid");
/*      */     }
/*      */     
/* 1119 */     return includedParameters;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, Object> toJSONObject() {
/* 1126 */     Map<String, Object> o = super.toJSONObject();
/*      */     
/* 1128 */     if (this.enc != null) {
/* 1129 */       o.put("enc", this.enc.toString());
/*      */     }
/*      */     
/* 1132 */     if (this.epk != null) {
/* 1133 */       o.put("epk", this.epk.toJSONObject());
/*      */     }
/*      */     
/* 1136 */     if (this.zip != null) {
/* 1137 */       o.put("zip", this.zip.toString());
/*      */     }
/*      */     
/* 1140 */     if (this.apu != null) {
/* 1141 */       o.put("apu", this.apu.toString());
/*      */     }
/*      */     
/* 1144 */     if (this.apv != null) {
/* 1145 */       o.put("apv", this.apv.toString());
/*      */     }
/*      */     
/* 1148 */     if (this.p2s != null) {
/* 1149 */       o.put("p2s", this.p2s.toString());
/*      */     }
/*      */     
/* 1152 */     if (this.p2c > 0) {
/* 1153 */       o.put("p2c", Integer.valueOf(this.p2c));
/*      */     }
/*      */     
/* 1156 */     if (this.iv != null) {
/* 1157 */       o.put("iv", this.iv.toString());
/*      */     }
/*      */     
/* 1160 */     if (this.tag != null) {
/* 1161 */       o.put("tag", this.tag.toString());
/*      */     }
/*      */     
/* 1164 */     if (this.skid != null) {
/* 1165 */       o.put("skid", this.skid);
/*      */     }
/*      */     
/* 1168 */     return o;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static EncryptionMethod parseEncryptionMethod(Map<String, Object> json) throws ParseException {
/* 1186 */     return EncryptionMethod.parse(JSONObjectUtils.getString(json, "enc"));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static JWEHeader parse(Map<String, Object> jsonObject) throws ParseException {
/* 1204 */     return parse(jsonObject, (Base64URL)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static JWEHeader parse(Map<String, Object> jsonObject, Base64URL parsedBase64URL) throws ParseException {
/* 1226 */     Algorithm alg = Header.parseAlgorithm(jsonObject);
/*      */     
/* 1228 */     if (!(alg instanceof JWEAlgorithm)) {
/* 1229 */       throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
/*      */     }
/*      */ 
/*      */     
/* 1233 */     EncryptionMethod enc = parseEncryptionMethod(jsonObject);
/*      */     
/* 1235 */     Builder header = (new Builder((JWEAlgorithm)alg, enc)).parsedBase64URL(parsedBase64URL);
/*      */ 
/*      */     
/* 1238 */     for (String name : jsonObject.keySet()) {
/*      */       
/* 1240 */       if ("alg".equals(name))
/*      */         continue; 
/* 1242 */       if ("enc".equals(name))
/*      */         continue; 
/* 1244 */       if ("typ".equals(name)) {
/* 1245 */         String typValue = JSONObjectUtils.getString(jsonObject, name);
/* 1246 */         if (typValue != null)
/* 1247 */           header = header.type(new JOSEObjectType(typValue));  continue;
/*      */       } 
/* 1249 */       if ("cty".equals(name)) {
/* 1250 */         header = header.contentType(JSONObjectUtils.getString(jsonObject, name)); continue;
/* 1251 */       }  if ("crit".equals(name)) {
/* 1252 */         List<String> critValues = JSONObjectUtils.getStringList(jsonObject, name);
/* 1253 */         if (critValues != null)
/* 1254 */           header = header.criticalParams(new HashSet<>(critValues));  continue;
/*      */       } 
/* 1256 */       if ("jku".equals(name)) {
/* 1257 */         header = header.jwkURL(JSONObjectUtils.getURI(jsonObject, name)); continue;
/* 1258 */       }  if ("jwk".equals(name)) {
/* 1259 */         Map<String, Object> jwkObject = JSONObjectUtils.getJSONObject(jsonObject, name);
/* 1260 */         if (jwkObject != null)
/* 1261 */           header = header.jwk(JWK.parse(jwkObject));  continue;
/*      */       } 
/* 1263 */       if ("x5u".equals(name)) {
/* 1264 */         header = header.x509CertURL(JSONObjectUtils.getURI(jsonObject, name)); continue;
/* 1265 */       }  if ("x5t".equals(name)) {
/* 1266 */         header = header.x509CertThumbprint(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1267 */       }  if ("x5t#S256".equals(name)) {
/* 1268 */         header = header.x509CertSHA256Thumbprint(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1269 */       }  if ("x5c".equals(name)) {
/* 1270 */         header = header.x509CertChain(X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(jsonObject, name))); continue;
/* 1271 */       }  if ("kid".equals(name)) {
/* 1272 */         header = header.keyID(JSONObjectUtils.getString(jsonObject, name)); continue;
/* 1273 */       }  if ("epk".equals(name)) {
/* 1274 */         header = header.ephemeralPublicKey(JWK.parse(JSONObjectUtils.getJSONObject(jsonObject, name))); continue;
/* 1275 */       }  if ("zip".equals(name)) {
/* 1276 */         String zipValue = JSONObjectUtils.getString(jsonObject, name);
/* 1277 */         if (zipValue != null)
/* 1278 */           header = header.compressionAlgorithm(new CompressionAlgorithm(zipValue));  continue;
/*      */       } 
/* 1280 */       if ("apu".equals(name)) {
/* 1281 */         header = header.agreementPartyUInfo(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1282 */       }  if ("apv".equals(name)) {
/* 1283 */         header = header.agreementPartyVInfo(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1284 */       }  if ("p2s".equals(name)) {
/* 1285 */         header = header.pbes2Salt(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1286 */       }  if ("p2c".equals(name)) {
/* 1287 */         header = header.pbes2Count(JSONObjectUtils.getInt(jsonObject, name)); continue;
/* 1288 */       }  if ("iv".equals(name)) {
/* 1289 */         header = header.iv(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1290 */       }  if ("tag".equals(name)) {
/* 1291 */         header = header.authTag(Base64URL.from(JSONObjectUtils.getString(jsonObject, name))); continue;
/* 1292 */       }  if ("skid".equals(name)) {
/* 1293 */         header = header.senderKeyID(JSONObjectUtils.getString(jsonObject, name)); continue;
/*      */       } 
/* 1295 */       header = header.customParam(name, jsonObject.get(name));
/*      */     } 
/*      */ 
/*      */     
/* 1299 */     return header.build();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static JWEHeader parse(String jsonString) throws ParseException {
/* 1316 */     return parse(JSONObjectUtils.parse(jsonString), (Base64URL)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static JWEHeader parse(String jsonString, Base64URL parsedBase64URL) throws ParseException {
/* 1337 */     return parse(JSONObjectUtils.parse(jsonString, 20000), parsedBase64URL);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static JWEHeader parse(Base64URL base64URL) throws ParseException {
/* 1354 */     return parse(base64URL.decodeToString(), base64URL);
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWEHeader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */