/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONObject;
/*     */ import com.nimbusds.jose.shaded.json.parser.JSONParser;
/*     */ import com.nimbusds.jose.shaded.json.parser.ParseException;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.text.ParseException;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JSONObjectUtils
/*     */ {
/*     */   public static Map<String, Object> parse(String s) throws ParseException {
/*  69 */     return parse(s, -1);
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
/*     */   public static Map<String, Object> parse(String s, int sizeLimit) throws ParseException {
/*     */     Object o;
/* 103 */     if (sizeLimit >= 0 && s.length() > sizeLimit) {
/* 104 */       throw new ParseException("The parsed string is longer than the max accepted size of " + sizeLimit + " characters", 0);
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 109 */       o = (new JSONParser(640)).parse(s);
/* 110 */     } catch (ParseException e) {
/* 111 */       throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
/* 112 */     } catch (Exception e) {
/* 113 */       throw new ParseException("Unexpected exception: " + e.getMessage(), 0);
/* 114 */     } catch (StackOverflowError e) {
/* 115 */       throw new ParseException("Excessive JSON object and / or array nesting", 0);
/*     */     } 
/*     */     
/* 118 */     if (o instanceof JSONObject) {
/* 119 */       return (Map<String, Object>)o;
/*     */     }
/* 121 */     throw new ParseException("JSON entity is not an object", 0);
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
/*     */   @Deprecated
/*     */   public static Map<String, Object> parseJSONObject(String s) throws ParseException {
/* 140 */     return parse(s);
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
/*     */   private static <T> T getGeneric(Map<String, Object> o, String key, Class<T> clazz) throws ParseException {
/* 159 */     if (o.get(key) == null) {
/* 160 */       return null;
/*     */     }
/*     */     
/* 163 */     Object value = o.get(key);
/*     */     
/* 165 */     if (!clazz.isAssignableFrom(value.getClass())) {
/* 166 */       throw new ParseException("Unexpected type of JSON object member with key " + key + "", 0);
/*     */     }
/*     */ 
/*     */     
/* 170 */     T castValue = (T)value;
/* 171 */     return castValue;
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
/*     */   public static boolean getBoolean(Map<String, Object> o, String key) throws ParseException {
/* 189 */     Boolean value = getGeneric(o, key, Boolean.class);
/*     */     
/* 191 */     if (value == null) {
/* 192 */       throw new ParseException("JSON object member with key " + key + " is missing or null", 0);
/*     */     }
/*     */     
/* 195 */     return value.booleanValue();
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
/*     */   public static int getInt(Map<String, Object> o, String key) throws ParseException {
/* 213 */     Number value = getGeneric(o, key, Number.class);
/*     */     
/* 215 */     if (value == null) {
/* 216 */       throw new ParseException("JSON object member with key " + key + " is missing or null", 0);
/*     */     }
/*     */     
/* 219 */     return value.intValue();
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
/*     */   public static long getLong(Map<String, Object> o, String key) throws ParseException {
/* 237 */     Number value = getGeneric(o, key, Number.class);
/*     */     
/* 239 */     if (value == null) {
/* 240 */       throw new ParseException("JSON object member with key " + key + " is missing or null", 0);
/*     */     }
/*     */     
/* 243 */     return value.longValue();
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
/*     */   public static float getFloat(Map<String, Object> o, String key) throws ParseException {
/* 261 */     Number value = getGeneric(o, key, Number.class);
/*     */     
/* 263 */     if (value == null) {
/* 264 */       throw new ParseException("JSON object member with key " + key + " is missing or null", 0);
/*     */     }
/*     */     
/* 267 */     return value.floatValue();
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
/*     */   public static double getDouble(Map<String, Object> o, String key) throws ParseException {
/* 285 */     Number value = getGeneric(o, key, Number.class);
/*     */     
/* 287 */     if (value == null) {
/* 288 */       throw new ParseException("JSON object member with key " + key + " is missing or null", 0);
/*     */     }
/*     */     
/* 291 */     return value.doubleValue();
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
/*     */   public static String getString(Map<String, Object> o, String key) throws ParseException {
/* 308 */     return getGeneric(o, key, String.class);
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
/*     */   public static URI getURI(Map<String, Object> o, String key) throws ParseException {
/* 325 */     String value = getString(o, key);
/*     */     
/* 327 */     if (value == null) {
/* 328 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 332 */       return new URI(value);
/*     */     }
/* 334 */     catch (URISyntaxException e) {
/*     */       
/* 336 */       throw new ParseException(e.getMessage(), 0);
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
/*     */   public static List<Object> getJSONArray(Map<String, Object> o, String key) throws ParseException {
/* 355 */     List<Object> jsonArray = getGeneric(o, key, (Class)List.class);
/* 356 */     return jsonArray;
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
/*     */   public static String[] getStringArray(Map<String, Object> o, String key) throws ParseException {
/* 373 */     List<Object> jsonArray = getJSONArray(o, key);
/*     */     
/* 375 */     if (jsonArray == null) {
/* 376 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 380 */       return jsonArray.<String>toArray(new String[0]);
/* 381 */     } catch (ArrayStoreException e) {
/* 382 */       throw new ParseException("JSON object member with key \"" + key + "\" is not an array of strings", 0);
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
/*     */   public static Map<String, Object>[] getJSONObjectArray(Map<String, Object> o, String key) throws ParseException {
/* 399 */     List<Object> jsonArray = getJSONArray(o, key);
/*     */     
/* 401 */     if (jsonArray == null) {
/* 402 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 406 */       return jsonArray.<Map<String, Object>>toArray((Map<String, Object>[])new HashMap[0]);
/* 407 */     } catch (ArrayStoreException e) {
/* 408 */       throw new ParseException("JSON object member with key \"" + key + "\" is not an array of JSON objects", 0);
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
/*     */   public static List<String> getStringList(Map<String, Object> o, String key) throws ParseException {
/* 424 */     String[] array = getStringArray(o, key);
/*     */     
/* 426 */     if (array == null) {
/* 427 */       return null;
/*     */     }
/*     */     
/* 430 */     return Arrays.asList(array);
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
/*     */   public static Map<String, Object> getJSONObject(Map<String, Object> o, String key) throws ParseException {
/* 447 */     Map<?, ?> jsonObject = getGeneric(o, key, (Class)Map.class);
/*     */     
/* 449 */     if (jsonObject == null) {
/* 450 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 454 */     for (Object oKey : jsonObject.keySet()) {
/* 455 */       if (!(oKey instanceof String)) {
/* 456 */         throw new ParseException("JSON object member with key " + key + " not a JSON object", 0);
/*     */       }
/*     */     } 
/*     */     
/* 460 */     return (Map)jsonObject;
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
/*     */   public static Base64URL getBase64URL(Map<String, Object> o, String key) throws ParseException {
/* 478 */     String value = getString(o, key);
/*     */     
/* 480 */     if (value == null) {
/* 481 */       return null;
/*     */     }
/*     */     
/* 484 */     return new Base64URL(value);
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
/*     */   public static String toJSONString(Map<String, ?> o) {
/* 497 */     return JSONObject.toJSONString(o);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Map<String, Object> newJSONObject() {
/* 506 */     return new HashMap<>();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\JSONObjectUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */