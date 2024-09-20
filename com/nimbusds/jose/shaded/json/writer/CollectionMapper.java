/*     */ package com.nimbusds.jose.shaded.json.writer;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.asm.BeansAccess;
/*     */ import com.nimbusds.jose.shaded.asm.FieldFilter;
/*     */ import com.nimbusds.jose.shaded.json.JSONArray;
/*     */ import com.nimbusds.jose.shaded.json.JSONObject;
/*     */ import com.nimbusds.jose.shaded.json.JSONUtil;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CollectionMapper
/*     */ {
/*     */   public static class MapType<T>
/*     */     extends JsonReaderI<T>
/*     */   {
/*     */     final ParameterizedType type;
/*     */     final Class<?> rawClass;
/*     */     final Class<?> instance;
/*     */     final BeansAccess<?> ba;
/*     */     final Type keyType;
/*     */     final Type valueType;
/*     */     final Class<?> keyClass;
/*     */     final Class<?> valueClass;
/*     */     JsonReaderI<?> subMapper;
/*     */     
/*     */     public MapType(JsonReader base, ParameterizedType type) {
/*  45 */       super(base);
/*  46 */       this.type = type;
/*  47 */       this.rawClass = (Class)type.getRawType();
/*  48 */       if (this.rawClass.isInterface()) {
/*  49 */         this.instance = JSONObject.class;
/*     */       } else {
/*  51 */         this.instance = this.rawClass;
/*  52 */       }  this.ba = BeansAccess.get(this.instance, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/*     */       
/*  54 */       this.keyType = type.getActualTypeArguments()[0];
/*  55 */       this.valueType = type.getActualTypeArguments()[1];
/*  56 */       if (this.keyType instanceof Class) {
/*  57 */         this.keyClass = (Class)this.keyType;
/*     */       } else {
/*  59 */         this.keyClass = (Class)((ParameterizedType)this.keyType).getRawType();
/*  60 */       }  if (this.valueType instanceof Class) {
/*  61 */         this.valueClass = (Class)this.valueType;
/*     */       } else {
/*  63 */         this.valueClass = (Class)((ParameterizedType)this.valueType).getRawType();
/*     */       } 
/*     */     }
/*     */     
/*     */     public Object createObject() {
/*     */       try {
/*  69 */         return this.instance.newInstance();
/*  70 */       } catch (InstantiationException e) {
/*  71 */         e.printStackTrace();
/*  72 */       } catch (IllegalAccessException e) {
/*  73 */         e.printStackTrace();
/*     */       } 
/*  75 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/*  80 */       if (this.subMapper == null)
/*  81 */         this.subMapper = this.base.getMapper(this.valueType); 
/*  82 */       return this.subMapper;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/*  87 */       if (this.subMapper == null)
/*  88 */         this.subMapper = this.base.getMapper(this.valueType); 
/*  89 */       return this.subMapper;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void setValue(Object current, String key, Object value) {
/*  95 */       ((Map<Object, Object>)current).put(JSONUtil.convertToX(key, this.keyClass), 
/*  96 */           JSONUtil.convertToX(value, this.valueClass));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object getValue(Object current, String key) {
/* 102 */       return ((Map)current).get(JSONUtil.convertToX(key, this.keyClass));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type getType(String key) {
/* 107 */       return this.type;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class MapClass<T>
/*     */     extends JsonReaderI<T> {
/*     */     final Class<?> type;
/*     */     final Class<?> instance;
/*     */     final BeansAccess<?> ba;
/*     */     JsonReaderI<?> subMapper;
/*     */     
/*     */     public MapClass(JsonReader base, Class<?> type) {
/* 119 */       super(base);
/* 120 */       this.type = type;
/* 121 */       if (type.isInterface()) {
/* 122 */         this.instance = JSONObject.class;
/*     */       } else {
/* 124 */         this.instance = type;
/* 125 */       }  this.ba = BeansAccess.get(this.instance, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/*     */     }
/*     */ 
/*     */     
/*     */     public Object createObject() {
/* 130 */       return this.ba.newInstance();
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/* 135 */       return this.base.DEFAULT;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/* 140 */       return this.base.DEFAULT;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void setValue(Object current, String key, Object value) {
/* 146 */       ((Map<String, Object>)current).put(key, value);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object getValue(Object current, String key) {
/* 152 */       return ((Map)current).get(key);
/*     */     }
/*     */ 
/*     */     
/*     */     public Type getType(String key) {
/* 157 */       return this.type;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class ListType<T>
/*     */     extends JsonReaderI<T>
/*     */   {
/*     */     final ParameterizedType type;
/*     */     final Class<?> rawClass;
/*     */     final Class<?> instance;
/*     */     final BeansAccess<?> ba;
/*     */     final Type valueType;
/*     */     final Class<?> valueClass;
/*     */     JsonReaderI<?> subMapper;
/*     */     
/*     */     public ListType(JsonReader base, ParameterizedType type) {
/* 173 */       super(base);
/* 174 */       this.type = type;
/* 175 */       this.rawClass = (Class)type.getRawType();
/* 176 */       if (this.rawClass.isInterface()) {
/* 177 */         this.instance = JSONArray.class;
/*     */       } else {
/* 179 */         this.instance = this.rawClass;
/* 180 */       }  this.ba = BeansAccess.get(this.instance, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/* 181 */       this.valueType = type.getActualTypeArguments()[0];
/* 182 */       if (this.valueType instanceof Class) {
/* 183 */         this.valueClass = (Class)this.valueType;
/*     */       } else {
/* 185 */         this.valueClass = (Class)((ParameterizedType)this.valueType).getRawType();
/*     */       } 
/*     */     }
/*     */     
/*     */     public Object createArray() {
/* 190 */       return this.ba.newInstance();
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/* 195 */       if (this.subMapper == null)
/* 196 */         this.subMapper = this.base.getMapper(this.type.getActualTypeArguments()[0]); 
/* 197 */       return this.subMapper;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/* 202 */       if (this.subMapper == null)
/* 203 */         this.subMapper = this.base.getMapper(this.type.getActualTypeArguments()[0]); 
/* 204 */       return this.subMapper;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void addValue(Object current, Object value) {
/* 210 */       ((List<Object>)current).add(JSONUtil.convertToX(value, this.valueClass));
/*     */     }
/*     */   }
/*     */   
/*     */   public static class ListClass<T>
/*     */     extends JsonReaderI<T> {
/*     */     final Class<?> type;
/*     */     final Class<?> instance;
/*     */     final BeansAccess<?> ba;
/*     */     JsonReaderI<?> subMapper;
/*     */     
/*     */     public ListClass(JsonReader base, Class<?> clazz) {
/* 222 */       super(base);
/* 223 */       this.type = clazz;
/* 224 */       if (clazz.isInterface()) {
/* 225 */         this.instance = JSONArray.class;
/*     */       } else {
/* 227 */         this.instance = clazz;
/* 228 */       }  this.ba = BeansAccess.get(this.instance, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/*     */     }
/*     */ 
/*     */     
/*     */     public Object createArray() {
/* 233 */       return this.ba.newInstance();
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/* 238 */       return this.base.DEFAULT;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/* 243 */       return this.base.DEFAULT;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void addValue(Object current, Object value) {
/* 249 */       ((List<Object>)current).add(value);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\CollectionMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */