/*     */ package com.nimbusds.jose.shaded.json.writer;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.asm.Accessor;
/*     */ import com.nimbusds.jose.shaded.asm.BeansAccess;
/*     */ import com.nimbusds.jose.shaded.asm.ConvertDate;
/*     */ import com.nimbusds.jose.shaded.asm.FieldFilter;
/*     */ import com.nimbusds.jose.shaded.json.JSONUtil;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class BeansMapper<T>
/*     */   extends JsonReaderI<T>
/*     */ {
/*     */   public BeansMapper(JsonReader base) {
/*  32 */     super(base);
/*     */   }
/*     */   
/*     */   public static class Bean<T>
/*     */     extends JsonReaderI<T>
/*     */   {
/*     */     final Class<T> clz;
/*     */     final BeansAccess<T> ba;
/*     */     final HashMap<String, Accessor> index;
/*     */     
/*     */     public Bean(JsonReader base, Class<T> clz) {
/*  43 */       super(base);
/*  44 */       this.clz = clz;
/*  45 */       this.ba = BeansAccess.get(clz, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/*  46 */       this.index = this.ba.getMap();
/*     */     }
/*     */ 
/*     */     
/*     */     public void setValue(Object current, String key, Object value) {
/*  51 */       this.ba.set(current, key, value);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Object getValue(Object current, String key) {
/*  61 */       return this.ba.get(current, key);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Type getType(String key) {
/*  71 */       Accessor nfo = this.index.get(key);
/*  72 */       return nfo.getGenericType();
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/*  77 */       Accessor nfo = this.index.get(key);
/*  78 */       if (nfo == null)
/*  79 */         throw new RuntimeException("Can not find Array '" + key + "' field in " + this.clz); 
/*  80 */       return this.base.getMapper(nfo.getGenericType());
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/*  85 */       Accessor f = this.index.get(key);
/*  86 */       if (f == null)
/*  87 */         throw new RuntimeException("Can not find Object '" + key + "' field in " + this.clz); 
/*  88 */       return this.base.getMapper(f.getGenericType());
/*     */     }
/*     */ 
/*     */     
/*     */     public Object createObject() {
/*  93 */       return this.ba.newInstance();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class BeanNoConv<T> extends JsonReaderI<T> {
/*     */     final Class<T> clz;
/*     */     final BeansAccess<T> ba;
/*     */     final HashMap<String, Accessor> index;
/*     */     
/*     */     public BeanNoConv(JsonReader base, Class<T> clz) {
/* 103 */       super(base);
/* 104 */       this.clz = clz;
/* 105 */       this.ba = BeansAccess.get(clz, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/* 106 */       this.index = this.ba.getMap();
/*     */     }
/*     */ 
/*     */     
/*     */     public void setValue(Object current, String key, Object value) {
/* 111 */       this.ba.set(current, key, value);
/*     */     }
/*     */     
/*     */     public Object getValue(Object current, String key) {
/* 115 */       return this.ba.get(current, key);
/*     */     }
/*     */ 
/*     */     
/*     */     public Type getType(String key) {
/* 120 */       Accessor nfo = this.index.get(key);
/* 121 */       return nfo.getGenericType();
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/* 126 */       Accessor nfo = this.index.get(key);
/* 127 */       if (nfo == null)
/* 128 */         throw new RuntimeException("Can not set " + key + " field in " + this.clz); 
/* 129 */       return this.base.getMapper(nfo.getGenericType());
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/* 134 */       Accessor f = this.index.get(key);
/* 135 */       if (f == null)
/* 136 */         throw new RuntimeException("Can not set " + key + " field in " + this.clz); 
/* 137 */       return this.base.getMapper(f.getGenericType());
/*     */     }
/*     */ 
/*     */     
/*     */     public Object createObject() {
/* 142 */       return this.ba.newInstance();
/*     */     }
/*     */   }
/*     */   
/* 146 */   public static JsonReaderI<Date> MAPPER_DATE = new ArraysMapper<Date>(null)
/*     */     {
/*     */       public Date convert(Object current) {
/* 149 */         return ConvertDate.convertToDate(current);
/*     */       }
/*     */     };
/*     */   
/*     */   public abstract Object getValue(Object paramObject, String paramString);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\BeansMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */