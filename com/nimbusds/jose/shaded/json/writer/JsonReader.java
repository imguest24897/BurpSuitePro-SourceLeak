/*     */ package com.nimbusds.jose.shaded.json.writer;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONArray;
/*     */ import com.nimbusds.jose.shaded.json.JSONAware;
/*     */ import com.nimbusds.jose.shaded.json.JSONAwareEx;
/*     */ import com.nimbusds.jose.shaded.json.JSONObject;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JsonReader
/*     */ {
/*     */   private final ConcurrentHashMap<Type, JsonReaderI<?>> cache;
/*     */   public JsonReaderI<JSONAwareEx> DEFAULT;
/*     */   public JsonReaderI<JSONAwareEx> DEFAULT_ORDERED;
/*     */   
/*     */   public JsonReader() {
/*  37 */     this.cache = new ConcurrentHashMap<>(100);
/*     */     
/*  39 */     this.cache.put(Date.class, BeansMapper.MAPPER_DATE);
/*     */     
/*  41 */     this.cache.put(int[].class, ArraysMapper.MAPPER_PRIM_INT);
/*  42 */     this.cache.put(Integer[].class, ArraysMapper.MAPPER_INT);
/*     */     
/*  44 */     this.cache.put(short[].class, ArraysMapper.MAPPER_PRIM_INT);
/*  45 */     this.cache.put(Short[].class, ArraysMapper.MAPPER_INT);
/*     */     
/*  47 */     this.cache.put(long[].class, ArraysMapper.MAPPER_PRIM_LONG);
/*  48 */     this.cache.put(Long[].class, ArraysMapper.MAPPER_LONG);
/*     */     
/*  50 */     this.cache.put(byte[].class, ArraysMapper.MAPPER_PRIM_BYTE);
/*  51 */     this.cache.put(Byte[].class, ArraysMapper.MAPPER_BYTE);
/*     */     
/*  53 */     this.cache.put(char[].class, ArraysMapper.MAPPER_PRIM_CHAR);
/*  54 */     this.cache.put(Character[].class, ArraysMapper.MAPPER_CHAR);
/*     */     
/*  56 */     this.cache.put(float[].class, ArraysMapper.MAPPER_PRIM_FLOAT);
/*  57 */     this.cache.put(Float[].class, ArraysMapper.MAPPER_FLOAT);
/*     */     
/*  59 */     this.cache.put(double[].class, ArraysMapper.MAPPER_PRIM_DOUBLE);
/*  60 */     this.cache.put(Double[].class, ArraysMapper.MAPPER_DOUBLE);
/*     */     
/*  62 */     this.cache.put(boolean[].class, ArraysMapper.MAPPER_PRIM_BOOL);
/*  63 */     this.cache.put(Boolean[].class, ArraysMapper.MAPPER_BOOL);
/*     */     
/*  65 */     this.DEFAULT = new DefaultMapper<>(this);
/*  66 */     this.DEFAULT_ORDERED = new DefaultMapperOrdered(this);
/*     */     
/*  68 */     this.cache.put(JSONAwareEx.class, this.DEFAULT);
/*  69 */     this.cache.put(JSONAware.class, this.DEFAULT);
/*  70 */     this.cache.put(JSONArray.class, this.DEFAULT);
/*  71 */     this.cache.put(JSONObject.class, this.DEFAULT);
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
/*     */   public <T> void remapField(Class<T> type, String fromJson, String toJava) {
/*  84 */     JsonReaderI<T> map = getMapper(type);
/*  85 */     if (!(map instanceof MapperRemapped)) {
/*  86 */       map = new MapperRemapped<>(map);
/*  87 */       registerReader(type, map);
/*     */     } 
/*  89 */     ((MapperRemapped)map).renameField(fromJson, toJava);
/*     */   }
/*     */   
/*     */   public <T> void registerReader(Class<T> type, JsonReaderI<T> mapper) {
/*  93 */     this.cache.put(type, mapper);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> JsonReaderI<T> getMapper(Type type) {
/*  98 */     if (type instanceof ParameterizedType)
/*  99 */       return getMapper((ParameterizedType)type); 
/* 100 */     return getMapper((Class<T>)type);
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
/*     */   public <T> JsonReaderI<T> getMapper(Class<T> type) {
/* 112 */     JsonReaderI<T> map = (JsonReaderI<T>)this.cache.get(type);
/* 113 */     if (map != null) {
/* 114 */       return map;
/*     */     }
/*     */ 
/*     */     
/* 118 */     if (type instanceof Class) {
/* 119 */       if (Map.class.isAssignableFrom(type)) {
/* 120 */         map = new DefaultMapperCollection<>(this, type);
/* 121 */       } else if (List.class.isAssignableFrom(type)) {
/* 122 */         map = new DefaultMapperCollection<>(this, type);
/* 123 */       }  if (map != null) {
/* 124 */         this.cache.put(type, map);
/* 125 */         return map;
/*     */       } 
/*     */     } 
/*     */     
/* 129 */     if (type.isArray()) {
/* 130 */       map = new ArraysMapper.GenericMapper<>(this, type);
/* 131 */     } else if (List.class.isAssignableFrom(type)) {
/* 132 */       map = new CollectionMapper.ListClass<>(this, type);
/* 133 */     } else if (Map.class.isAssignableFrom(type)) {
/* 134 */       map = new CollectionMapper.MapClass<>(this, type);
/*     */     } else {
/*     */       
/* 137 */       map = new BeansMapper.Bean<>(this, type);
/* 138 */     }  this.cache.putIfAbsent(type, map);
/* 139 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> JsonReaderI<T> getMapper(ParameterizedType type) {
/* 144 */     JsonReaderI<T> map = (JsonReaderI<T>)this.cache.get(type);
/* 145 */     if (map != null)
/* 146 */       return map; 
/* 147 */     Class<T> clz = (Class<T>)type.getRawType();
/* 148 */     if (List.class.isAssignableFrom(clz)) {
/* 149 */       map = new CollectionMapper.ListType<>(this, type);
/* 150 */     } else if (Map.class.isAssignableFrom(clz)) {
/* 151 */       map = new CollectionMapper.MapType<>(this, type);
/* 152 */     }  this.cache.putIfAbsent(type, map);
/* 153 */     return map;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\JsonReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */