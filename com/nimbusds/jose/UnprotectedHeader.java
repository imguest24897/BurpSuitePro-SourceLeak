/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.JSONObjectUtils;
/*     */ import java.text.ParseException;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
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
/*     */ @Immutable
/*     */ public final class UnprotectedHeader
/*     */ {
/*     */   private final Map<String, Object> params;
/*     */   
/*     */   private UnprotectedHeader(Map<String, Object> params) {
/*  38 */     Objects.requireNonNull(params);
/*  39 */     this.params = params;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getKeyID() {
/*  50 */     return (String)this.params.get("kid");
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
/*     */   public Object getParam(String name) {
/*  63 */     return this.params.get(name);
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
/*     */   public Set<String> getIncludedParams() {
/*  75 */     return this.params.keySet();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Object> toJSONObject() {
/*  86 */     Map<String, Object> o = JSONObjectUtils.newJSONObject();
/*  87 */     o.putAll(this.params);
/*  88 */     return o;
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
/*     */   public static UnprotectedHeader parse(Map<String, Object> jsonObject) throws ParseException {
/* 105 */     if (jsonObject == null) {
/* 106 */       return null;
/*     */     }
/*     */     
/* 109 */     Builder header = new Builder();
/*     */     
/* 111 */     for (String name : jsonObject.keySet()) {
/* 112 */       header = header.param(name, jsonObject.get(name));
/*     */     }
/*     */     
/* 115 */     return header.build();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/* 125 */     private final Map<String, Object> params = JSONObjectUtils.newJSONObject();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 145 */       this.params.put("kid", kid);
/* 146 */       return this;
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
/*     */     public Builder param(String name, Object value) {
/* 162 */       this.params.put(name, value);
/* 163 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UnprotectedHeader build() {
/* 173 */       return new UnprotectedHeader(this.params);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\UnprotectedHeader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */