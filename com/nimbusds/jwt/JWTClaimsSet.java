/*      */ package com.nimbusds.jwt;
/*      */ 
/*      */ import com.nimbusds.jose.Payload;
/*      */ import com.nimbusds.jose.util.JSONArrayUtils;
/*      */ import com.nimbusds.jose.util.JSONObjectUtils;
/*      */ import com.nimbusds.jwt.util.DateUtils;
/*      */ import java.io.Serializable;
/*      */ import java.net.URI;
/*      */ import java.net.URISyntaxException;
/*      */ import java.text.ParseException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.HashSet;
/*      */ import java.util.LinkedHashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Immutable
/*      */ public final class JWTClaimsSet
/*      */   implements Serializable
/*      */ {
/*      */   private static final long serialVersionUID = 1L;
/*      */   private static final Set<String> REGISTERED_CLAIM_NAMES;
/*      */   
/*      */   static {
/*   95 */     Set<String> n = new HashSet<>();
/*      */     
/*   97 */     n.add("iss");
/*   98 */     n.add("sub");
/*   99 */     n.add("aud");
/*  100 */     n.add("exp");
/*  101 */     n.add("nbf");
/*  102 */     n.add("iat");
/*  103 */     n.add("jti");
/*      */     
/*  105 */     REGISTERED_CLAIM_NAMES = Collections.unmodifiableSet(n);
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
/*      */   public static class Builder
/*      */   {
/*  128 */     private final Map<String, Object> claims = new LinkedHashMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Builder(JWTClaimsSet jwtClaimsSet) {
/*  149 */       this.claims.putAll(jwtClaimsSet.claims);
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
/*      */     public Builder issuer(String iss) {
/*  162 */       this.claims.put("iss", iss);
/*  163 */       return this;
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
/*      */     public Builder subject(String sub) {
/*  176 */       this.claims.put("sub", sub);
/*  177 */       return this;
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
/*      */     public Builder audience(List<String> aud) {
/*  191 */       this.claims.put("aud", aud);
/*  192 */       return this;
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
/*      */     public Builder audience(String aud) {
/*  206 */       if (aud == null) {
/*  207 */         this.claims.put("aud", null);
/*      */       } else {
/*  209 */         this.claims.put("aud", Collections.singletonList(aud));
/*      */       } 
/*  211 */       return this;
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
/*      */     public Builder expirationTime(Date exp) {
/*  225 */       this.claims.put("exp", exp);
/*  226 */       return this;
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
/*      */     public Builder notBeforeTime(Date nbf) {
/*  240 */       this.claims.put("nbf", nbf);
/*  241 */       return this;
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
/*      */     public Builder issueTime(Date iat) {
/*  255 */       this.claims.put("iat", iat);
/*  256 */       return this;
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
/*      */     public Builder jwtID(String jti) {
/*  269 */       this.claims.put("jti", jti);
/*  270 */       return this;
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
/*      */     public Builder claim(String name, Object value) {
/*  286 */       this.claims.put(name, value);
/*  287 */       return this;
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
/*      */     public Map<String, Object> getClaims() {
/*  304 */       return Collections.unmodifiableMap(this.claims);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public JWTClaimsSet build() {
/*  315 */       return new JWTClaimsSet(this.claims);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  323 */   private final Map<String, Object> claims = new LinkedHashMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private JWTClaimsSet(Map<String, Object> claims) {
/*  333 */     this.claims.putAll(claims);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Set<String> getRegisteredNames() {
/*  344 */     return REGISTERED_CLAIM_NAMES;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIssuer() {
/*      */     try {
/*  356 */       return getStringClaim("iss");
/*  357 */     } catch (ParseException e) {
/*  358 */       return null;
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
/*      */   public String getSubject() {
/*      */     try {
/*  371 */       return getStringClaim("sub");
/*  372 */     } catch (ParseException e) {
/*  373 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<String> getAudience() {
/*      */     List<String> aud;
/*  385 */     Object audValue = getClaim("aud");
/*      */     
/*  387 */     if (audValue instanceof String)
/*      */     {
/*  389 */       return Collections.singletonList((String)audValue);
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  394 */       aud = getStringListClaim("aud");
/*  395 */     } catch (ParseException e) {
/*  396 */       return Collections.emptyList();
/*      */     } 
/*  398 */     return (aud != null) ? aud : Collections.<String>emptyList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getExpirationTime() {
/*      */     try {
/*  410 */       return getDateClaim("exp");
/*  411 */     } catch (ParseException e) {
/*  412 */       return null;
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
/*      */   public Date getNotBeforeTime() {
/*      */     try {
/*  425 */       return getDateClaim("nbf");
/*  426 */     } catch (ParseException e) {
/*  427 */       return null;
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
/*      */   public Date getIssueTime() {
/*      */     try {
/*  440 */       return getDateClaim("iat");
/*  441 */     } catch (ParseException e) {
/*  442 */       return null;
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
/*      */   public String getJWTID() {
/*      */     try {
/*  455 */       return getStringClaim("jti");
/*  456 */     } catch (ParseException e) {
/*  457 */       return null;
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
/*      */   public Object getClaim(String name) {
/*  471 */     return this.claims.get(name);
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
/*      */   public String getStringClaim(String name) throws ParseException {
/*  489 */     Object value = getClaim(name);
/*      */     
/*  491 */     if (value == null || value instanceof String) {
/*  492 */       return (String)value;
/*      */     }
/*  494 */     throw new ParseException("The " + name + " claim is not a String", 0);
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
/*      */   public String[] getStringArrayClaim(String name) throws ParseException {
/*      */     List<?> list;
/*  513 */     Object value = getClaim(name);
/*      */     
/*  515 */     if (value == null) {
/*  516 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  522 */       list = (List)getClaim(name);
/*      */     }
/*  524 */     catch (ClassCastException e) {
/*  525 */       throw new ParseException("The " + name + " claim is not a list / JSON array", 0);
/*      */     } 
/*      */     
/*  528 */     String[] stringArray = new String[list.size()];
/*      */     
/*  530 */     for (int i = 0; i < stringArray.length; i++) {
/*      */       
/*      */       try {
/*  533 */         stringArray[i] = (String)list.get(i);
/*  534 */       } catch (ClassCastException e) {
/*  535 */         throw new ParseException("The " + name + " claim is not a list / JSON array of strings", 0);
/*      */       } 
/*      */     } 
/*      */     
/*  539 */     return stringArray;
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
/*      */   public List<String> getStringListClaim(String name) throws ParseException {
/*  557 */     String[] stringArray = getStringArrayClaim(name);
/*      */     
/*  559 */     if (stringArray == null) {
/*  560 */       return null;
/*      */     }
/*      */     
/*  563 */     return Collections.unmodifiableList(Arrays.asList(stringArray));
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
/*      */   public URI getURIClaim(String name) throws ParseException {
/*  580 */     String uriString = getStringClaim(name);
/*      */     
/*  582 */     if (uriString == null) {
/*  583 */       return null;
/*      */     }
/*      */     
/*      */     try {
/*  587 */       return new URI(uriString);
/*  588 */     } catch (URISyntaxException e) {
/*  589 */       throw new ParseException("The \"" + name + "\" claim is not a URI: " + e.getMessage(), 0);
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
/*      */   public Boolean getBooleanClaim(String name) throws ParseException {
/*  608 */     Object value = getClaim(name);
/*      */     
/*  610 */     if (value == null || value instanceof Boolean) {
/*  611 */       return (Boolean)value;
/*      */     }
/*  613 */     throw new ParseException("The \"" + name + "\" claim is not a Boolean", 0);
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
/*      */   public Integer getIntegerClaim(String name) throws ParseException {
/*  632 */     Object value = getClaim(name);
/*      */     
/*  634 */     if (value == null)
/*  635 */       return null; 
/*  636 */     if (value instanceof Number) {
/*  637 */       return Integer.valueOf(((Number)value).intValue());
/*      */     }
/*  639 */     throw new ParseException("The \"" + name + "\" claim is not an Integer", 0);
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
/*      */   public Long getLongClaim(String name) throws ParseException {
/*  658 */     Object value = getClaim(name);
/*      */     
/*  660 */     if (value == null)
/*  661 */       return null; 
/*  662 */     if (value instanceof Number) {
/*  663 */       return Long.valueOf(((Number)value).longValue());
/*      */     }
/*  665 */     throw new ParseException("The \"" + name + "\" claim is not a Number", 0);
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
/*      */   public Date getDateClaim(String name) throws ParseException {
/*  685 */     Object value = getClaim(name);
/*      */     
/*  687 */     if (value == null)
/*  688 */       return null; 
/*  689 */     if (value instanceof Date)
/*  690 */       return (Date)value; 
/*  691 */     if (value instanceof Number) {
/*  692 */       return DateUtils.fromSecondsSinceEpoch(((Number)value).longValue());
/*      */     }
/*  694 */     throw new ParseException("The \"" + name + "\" claim is not a Date", 0);
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
/*      */   public Float getFloatClaim(String name) throws ParseException {
/*  713 */     Object value = getClaim(name);
/*      */     
/*  715 */     if (value == null)
/*  716 */       return null; 
/*  717 */     if (value instanceof Number) {
/*  718 */       return Float.valueOf(((Number)value).floatValue());
/*      */     }
/*  720 */     throw new ParseException("The \"" + name + "\" claim is not a Float", 0);
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
/*      */   public Double getDoubleClaim(String name) throws ParseException {
/*  739 */     Object value = getClaim(name);
/*      */     
/*  741 */     if (value == null)
/*  742 */       return null; 
/*  743 */     if (value instanceof Number) {
/*  744 */       return Double.valueOf(((Number)value).doubleValue());
/*      */     }
/*  746 */     throw new ParseException("The \"" + name + "\" claim is not a Double", 0);
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
/*      */   public Map<String, Object> getJSONObjectClaim(String name) throws ParseException {
/*  764 */     Object value = getClaim(name);
/*      */     
/*  766 */     if (value == null)
/*  767 */       return null; 
/*  768 */     if (value instanceof Map) {
/*  769 */       Map<String, Object> jsonObject = JSONObjectUtils.newJSONObject();
/*  770 */       Map<?, ?> map = (Map<?, ?>)value;
/*  771 */       for (Map.Entry<?, ?> entry : map.entrySet()) {
/*  772 */         if (entry.getKey() instanceof String) {
/*  773 */           jsonObject.put((String)entry.getKey(), entry.getValue());
/*      */         }
/*      */       } 
/*  776 */       return jsonObject;
/*      */     } 
/*  778 */     throw new ParseException("The \"" + name + "\" claim is not a JSON object or Map", 0);
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
/*      */   public Map<String, Object> getClaims() {
/*  794 */     return Collections.unmodifiableMap(this.claims);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Payload toPayload() {
/*  805 */     return new Payload(toJSONObject());
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
/*      */   public Map<String, Object> toJSONObject() {
/*  818 */     return toJSONObject(false);
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
/*      */   public Map<String, Object> toJSONObject(boolean includeClaimsWithNullValues) {
/*  834 */     Map<String, Object> o = JSONObjectUtils.newJSONObject();
/*      */     
/*  836 */     for (Map.Entry<String, Object> claim : this.claims.entrySet()) {
/*      */       
/*  838 */       if (claim.getValue() instanceof Date) {
/*      */ 
/*      */         
/*  841 */         Date dateValue = (Date)claim.getValue();
/*  842 */         o.put(claim.getKey(), Long.valueOf(DateUtils.toSecondsSinceEpoch(dateValue))); continue;
/*      */       } 
/*  844 */       if ("aud".equals(claim.getKey())) {
/*      */ 
/*      */         
/*  847 */         List<String> audList = getAudience();
/*      */         
/*  849 */         if (audList != null && !audList.isEmpty()) {
/*  850 */           if (audList.size() == 1) {
/*  851 */             o.put("aud", audList.get(0)); continue;
/*      */           } 
/*  853 */           List<Object> audArray = JSONArrayUtils.newJSONArray();
/*  854 */           audArray.addAll(audList);
/*  855 */           o.put("aud", audArray); continue;
/*      */         } 
/*  857 */         if (includeClaimsWithNullValues)
/*  858 */           o.put("aud", null); 
/*      */         continue;
/*      */       } 
/*  861 */       if (claim.getValue() != null) {
/*  862 */         o.put(claim.getKey(), claim.getValue()); continue;
/*  863 */       }  if (includeClaimsWithNullValues) {
/*  864 */         o.put(claim.getKey(), null);
/*      */       }
/*      */     } 
/*      */     
/*  868 */     return o;
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
/*      */   public String toString() {
/*  882 */     return JSONObjectUtils.toJSONString(toJSONObject());
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
/*      */   public String toString(boolean includeClaimsWithNullValues) {
/*  898 */     return JSONObjectUtils.toJSONString(toJSONObject(includeClaimsWithNullValues));
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
/*      */   public <T> T toType(JWTClaimsSetTransformer<T> transformer) {
/*  913 */     return transformer.transform(this);
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
/*      */   public static JWTClaimsSet parse(Map<String, Object> json) throws ParseException {
/*  931 */     Builder builder = new Builder();
/*      */ 
/*      */     
/*  934 */     for (String name : json.keySet()) {
/*      */       Object audValue;
/*  936 */       switch (name) {
/*      */         case "iss":
/*  938 */           builder.issuer(JSONObjectUtils.getString(json, "iss"));
/*      */           continue;
/*      */         case "sub":
/*  941 */           builder.subject(JSONObjectUtils.getString(json, "sub"));
/*      */           continue;
/*      */         case "aud":
/*  944 */           audValue = json.get("aud");
/*  945 */           if (audValue instanceof String) {
/*  946 */             List<String> singleAud = new ArrayList<>();
/*  947 */             singleAud.add(JSONObjectUtils.getString(json, "aud"));
/*  948 */             builder.audience(singleAud); continue;
/*  949 */           }  if (audValue instanceof List) {
/*  950 */             builder.audience(JSONObjectUtils.getStringList(json, "aud")); continue;
/*  951 */           }  if (audValue == null) {
/*  952 */             builder.audience((String)null);
/*      */           }
/*      */           continue;
/*      */         case "exp":
/*  956 */           builder.expirationTime(new Date(JSONObjectUtils.getLong(json, "exp") * 1000L));
/*      */           continue;
/*      */         case "nbf":
/*  959 */           builder.notBeforeTime(new Date(JSONObjectUtils.getLong(json, "nbf") * 1000L));
/*      */           continue;
/*      */         case "iat":
/*  962 */           builder.issueTime(new Date(JSONObjectUtils.getLong(json, "iat") * 1000L));
/*      */           continue;
/*      */         case "jti":
/*  965 */           builder.jwtID(JSONObjectUtils.getString(json, "jti"));
/*      */           continue;
/*      */       } 
/*  968 */       builder.claim(name, json.get(name));
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  973 */     return builder.build();
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
/*      */   public static JWTClaimsSet parse(String s) throws ParseException {
/*  991 */     return parse(JSONObjectUtils.parse(s));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean equals(Object o) {
/*  997 */     if (this == o) return true; 
/*  998 */     if (!(o instanceof JWTClaimsSet)) return false; 
/*  999 */     JWTClaimsSet that = (JWTClaimsSet)o;
/* 1000 */     return Objects.equals(this.claims, that.claims);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1006 */     return Objects.hash(new Object[] { this.claims });
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\JWTClaimsSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */