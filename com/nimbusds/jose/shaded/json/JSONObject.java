/*     */ package com.nimbusds.jose.shaded.json;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.reader.JsonWriter;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JSONObject
/*     */   extends HashMap<String, Object>
/*     */   implements JSONAwareEx, JSONStreamAwareEx
/*     */ {
/*     */   private static final long serialVersionUID = -503443796854799292L;
/*     */   
/*     */   public JSONObject() {}
/*     */   
/*     */   public static String escape(String s) {
/*  46 */     return JSONValue.escape(s);
/*     */   }
/*     */   
/*     */   public static String toJSONString(Map<String, ? extends Object> map) {
/*  50 */     return toJSONString(map, JSONValue.COMPRESSION);
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
/*     */   public static String toJSONString(Map<String, ? extends Object> map, JSONStyle compression) {
/*  64 */     StringBuilder sb = new StringBuilder();
/*     */     try {
/*  66 */       writeJSON(map, sb, compression);
/*  67 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/*  70 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeJSONKV(String key, Object value, Appendable out, JSONStyle compression) throws IOException {
/*  77 */     if (key == null) {
/*  78 */       out.append("null");
/*  79 */     } else if (!compression.mustProtectKey(key)) {
/*  80 */       out.append(key);
/*     */     } else {
/*  82 */       out.append('"');
/*  83 */       JSONValue.escape(key, out, compression);
/*  84 */       out.append('"');
/*     */     } 
/*  86 */     out.append(':');
/*  87 */     if (value instanceof String) {
/*  88 */       compression.writeString(out, (String)value);
/*     */     } else {
/*  90 */       JSONValue.writeJSONString(value, out, compression);
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
/*     */   public JSONObject appendField(String fieldName, Object fieldValue) {
/* 102 */     put(fieldName, fieldValue);
/* 103 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAsString(String key) {
/* 112 */     Object obj = get(key);
/* 113 */     if (obj == null)
/* 114 */       return null; 
/* 115 */     return obj.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Number getAsNumber(String key) {
/* 124 */     Object obj = get(key);
/* 125 */     if (obj == null)
/* 126 */       return null; 
/* 127 */     if (obj instanceof Number)
/* 128 */       return (Number)obj; 
/* 129 */     return Long.valueOf(obj.toString());
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
/*     */   public JSONObject(Map<String, ?> map) {
/* 158 */     super(map);
/*     */   }
/*     */   
/*     */   public static void writeJSON(Map<String, ? extends Object> map, Appendable out) throws IOException {
/* 162 */     writeJSON(map, out, JSONValue.COMPRESSION);
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
/*     */   public static void writeJSON(Map<String, ? extends Object> map, Appendable out, JSONStyle compression) throws IOException {
/* 174 */     if (map == null) {
/* 175 */       out.append("null");
/*     */       return;
/*     */     } 
/* 178 */     JsonWriter.JSONMapWriter.writeJSONString(map, out, compression);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeJSONString(Appendable out) throws IOException {
/* 185 */     writeJSON(this, out, JSONValue.COMPRESSION);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeJSONString(Appendable out, JSONStyle compression) throws IOException {
/* 192 */     writeJSON(this, out, compression);
/*     */   }
/*     */   
/*     */   public void merge(Object o2) {
/* 196 */     merge(this, o2);
/*     */   }
/*     */   
/*     */   protected static JSONObject merge(JSONObject o1, Object o2) {
/* 200 */     if (o2 == null)
/* 201 */       return o1; 
/* 202 */     if (o2 instanceof JSONObject)
/* 203 */       return merge(o1, (JSONObject)o2); 
/* 204 */     throw new RuntimeException("JSON merge can not merge JSONObject with " + o2.getClass());
/*     */   }
/*     */   
/*     */   private static JSONObject merge(JSONObject o1, JSONObject o2) {
/* 208 */     if (o2 == null)
/* 209 */       return o1; 
/* 210 */     for (String key : o1.keySet()) {
/* 211 */       Object value1 = o1.get(key);
/* 212 */       Object value2 = o2.get(key);
/* 213 */       if (value2 == null)
/*     */         continue; 
/* 215 */       if (value1 instanceof JSONArray) {
/* 216 */         o1.put(key, merge((JSONArray)value1, value2));
/*     */         continue;
/*     */       } 
/* 219 */       if (value1 instanceof JSONObject) {
/* 220 */         o1.put(key, merge((JSONObject)value1, value2));
/*     */         continue;
/*     */       } 
/* 223 */       if (value1.equals(value2))
/*     */         continue; 
/* 225 */       if (value1.getClass().equals(value2.getClass()))
/* 226 */         throw new RuntimeException("JSON merge can not merge two " + value1.getClass().getName() + " Object together"); 
/* 227 */       throw new RuntimeException("JSON merge can not merge " + value1.getClass().getName() + " with " + value2.getClass().getName());
/*     */     } 
/* 229 */     for (String key : o2.keySet()) {
/* 230 */       if (o1.containsKey(key))
/*     */         continue; 
/* 232 */       o1.put(key, o2.get(key));
/*     */     } 
/* 234 */     return o1;
/*     */   }
/*     */   
/*     */   protected static JSONArray merge(JSONArray o1, Object o2) {
/* 238 */     if (o2 == null)
/* 239 */       return o1; 
/* 240 */     if (o1 instanceof JSONArray)
/* 241 */       return merge(o1, (JSONArray)o2); 
/* 242 */     o1.add(o2);
/* 243 */     return o1;
/*     */   }
/*     */   
/*     */   private static JSONArray merge(JSONArray o1, JSONArray o2) {
/* 247 */     o1.addAll(o2);
/* 248 */     return o1;
/*     */   }
/*     */   
/*     */   public String toJSONString() {
/* 252 */     return toJSONString(this, JSONValue.COMPRESSION);
/*     */   }
/*     */   
/*     */   public String toJSONString(JSONStyle compression) {
/* 256 */     return toJSONString(this, compression);
/*     */   }
/*     */   
/*     */   public String toString(JSONStyle compression) {
/* 260 */     return toJSONString(this, compression);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 264 */     return toJSONString(this, JSONValue.COMPRESSION);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JSONObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */