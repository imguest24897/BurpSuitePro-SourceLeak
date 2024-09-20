/*     */ package com.nimbusds.jose.shaded.json.reader;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONAware;
/*     */ import com.nimbusds.jose.shaded.json.JSONAwareEx;
/*     */ import com.nimbusds.jose.shaded.json.JSONStreamAware;
/*     */ import com.nimbusds.jose.shaded.json.JSONStreamAwareEx;
/*     */ import com.nimbusds.jose.shaded.json.JSONStyle;
/*     */ import com.nimbusds.jose.shaded.json.JSONValue;
/*     */ import java.io.IOException;
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.util.Date;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ 
/*     */ public class JsonWriter {
/*     */   private ConcurrentHashMap<Class<?>, JsonWriterI<?>> data;
/*     */   private LinkedList<WriterByInterface> writerInterfaces;
/*     */   
/*     */   public JsonWriter() {
/*  22 */     this.data = new ConcurrentHashMap<>();
/*  23 */     this.writerInterfaces = new LinkedList<>();
/*  24 */     init();
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
/*     */   public <T> void remapField(Class<T> type, String fromJava, String toJson) {
/*  38 */     JsonWriterI<?> map = getWrite(type);
/*  39 */     if (!(map instanceof BeansWriterASMRemap)) {
/*  40 */       map = new BeansWriterASMRemap();
/*  41 */       registerWriter(map, new Class[] { type });
/*     */     } 
/*  43 */     ((BeansWriterASMRemap)map).renameField(fromJava, toJson);
/*     */   }
/*     */   
/*     */   static class WriterByInterface {
/*     */     public Class<?> _interface;
/*     */     public JsonWriterI<?> _writer;
/*     */     
/*     */     public WriterByInterface(Class<?> _interface, JsonWriterI<?> _writer) {
/*  51 */       this._interface = _interface;
/*  52 */       this._writer = _writer;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonWriterI getWriterByInterface(Class<?> clazz) {
/*  63 */     for (WriterByInterface w : this.writerInterfaces) {
/*  64 */       if (w._interface.isAssignableFrom(clazz))
/*  65 */         return w._writer; 
/*     */     } 
/*  67 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonWriterI getWrite(Class cls) {
/*  72 */     return this.data.get(cls);
/*     */   }
/*     */   
/*  75 */   public static final JsonWriterI<JSONStreamAwareEx> JSONStreamAwareWriter = new JsonWriterI<JSONStreamAwareEx>() {
/*     */       public <E extends JSONStreamAwareEx> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*  77 */         value.writeJSONString(out);
/*     */       }
/*     */     };
/*     */   
/*  81 */   public static final JsonWriterI<JSONStreamAwareEx> JSONStreamAwareExWriter = new JsonWriterI<JSONStreamAwareEx>() {
/*     */       public <E extends JSONStreamAwareEx> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*  83 */         value.writeJSONString(out, compression);
/*     */       }
/*     */     };
/*     */   
/*  87 */   public static final JsonWriterI<JSONAwareEx> JSONJSONAwareExWriter = new JsonWriterI<JSONAwareEx>() {
/*     */       public <E extends JSONAwareEx> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*  89 */         out.append(value.toJSONString(compression));
/*     */       }
/*     */     };
/*     */   
/*  93 */   public static final JsonWriterI<JSONAware> JSONJSONAwareWriter = new JsonWriterI<JSONAware>() {
/*     */       public <E extends JSONAware> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*  95 */         out.append(value.toJSONString());
/*     */       }
/*     */     };
/*     */   
/*  99 */   public static final JsonWriterI<Iterable<? extends Object>> JSONIterableWriter = new JsonWriterI<Iterable<? extends Object>>() {
/*     */       public <E extends Iterable<? extends Object>> void writeJSONString(E list, Appendable out, JSONStyle compression) throws IOException {
/* 101 */         boolean first = true;
/* 102 */         compression.arrayStart(out);
/* 103 */         for (Object value : list) {
/* 104 */           if (first) {
/* 105 */             first = false;
/* 106 */             compression.arrayfirstObject(out);
/*     */           } else {
/* 108 */             compression.arrayNextElm(out);
/*     */           } 
/* 110 */           if (value == null) {
/* 111 */             out.append("null");
/*     */           } else {
/* 113 */             JSONValue.writeJSONString(value, out, compression);
/* 114 */           }  compression.arrayObjectEnd(out);
/*     */         } 
/* 116 */         compression.arrayStop(out);
/*     */       }
/*     */     };
/*     */   
/* 120 */   public static final JsonWriterI<Enum<?>> EnumWriter = new JsonWriterI<Enum<?>>()
/*     */     {
/*     */       public <E extends Enum<?>> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/* 123 */         String s = value.name();
/* 124 */         compression.writeString(out, s);
/*     */       }
/*     */     };
/*     */   
/* 128 */   public static final JsonWriterI<Map<String, ? extends Object>> JSONMapWriter = new JsonWriterI<Map<String, ? extends Object>>() {
/*     */       public <E extends Map<String, ? extends Object>> void writeJSONString(E map, Appendable out, JSONStyle compression) throws IOException {
/* 130 */         boolean first = true;
/* 131 */         compression.objectStart(out);
/*     */ 
/*     */ 
/*     */         
/* 135 */         for (Map.Entry<?, ?> entry : (Iterable<Map.Entry<?, ?>>)map.entrySet()) {
/* 136 */           Object v = entry.getValue();
/* 137 */           if (v == null && compression.ignoreNull())
/*     */             continue; 
/* 139 */           if (first) {
/* 140 */             compression.objectFirstStart(out);
/* 141 */             first = false;
/*     */           } else {
/* 143 */             compression.objectNext(out);
/*     */           } 
/* 145 */           JsonWriter.writeJSONKV(entry.getKey().toString(), v, out, compression);
/*     */         } 
/*     */         
/* 148 */         compression.objectStop(out);
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 157 */   public static final JsonWriterI<Object> beansWriterASM = new BeansWriterASM();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   public static final JsonWriterI<Object> beansWriter = new BeansWriter();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 167 */   public static final JsonWriterI<Object> arrayWriter = new ArrayWriter();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 172 */   public static final JsonWriterI<Object> toStringWriter = new JsonWriterI() {
/*     */       public void writeJSONString(Object value, Appendable out, JSONStyle compression) throws IOException {
/* 174 */         out.append(value.toString());
/*     */       }
/*     */     };
/*     */   
/*     */   public void init() {
/* 179 */     registerWriter(new JsonWriterI<String>() {
/*     */           public void writeJSONString(String value, Appendable out, JSONStyle compression) throws IOException {
/* 181 */             compression.writeString(out, value);
/*     */           }
/*     */         }new Class[] { String.class });
/*     */     
/* 185 */     registerWriter(new JsonWriterI<Double>() {
/*     */           public void writeJSONString(Double value, Appendable out, JSONStyle compression) throws IOException {
/* 187 */             if (value.isInfinite()) {
/* 188 */               out.append("null");
/*     */             } else {
/* 190 */               out.append(value.toString());
/*     */             } 
/*     */           }
/*     */         },  new Class[] { Double.class });
/* 194 */     registerWriter(new JsonWriterI<Date>() {
/*     */           public void writeJSONString(Date value, Appendable out, JSONStyle compression) throws IOException {
/* 196 */             out.append('"');
/* 197 */             JSONValue.escape(value.toString(), out, compression);
/* 198 */             out.append('"');
/*     */           }
/*     */         }new Class[] { Date.class });
/*     */     
/* 202 */     registerWriter(new JsonWriterI<Float>() {
/*     */           public void writeJSONString(Float value, Appendable out, JSONStyle compression) throws IOException {
/* 204 */             if (value.isInfinite()) {
/* 205 */               out.append("null");
/*     */             } else {
/* 207 */               out.append(value.toString());
/*     */             } 
/*     */           }
/*     */         },  new Class[] { Float.class });
/* 211 */     registerWriter(toStringWriter, new Class[] { Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class });
/* 212 */     registerWriter(toStringWriter, new Class[] { Boolean.class });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     registerWriter(new JsonWriterI<int[]>() {
/*     */           public void writeJSONString(int[] value, Appendable out, JSONStyle compression) throws IOException {
/* 220 */             boolean needSep = false;
/* 221 */             compression.arrayStart(out);
/* 222 */             for (int b : value) {
/* 223 */               if (needSep) {
/* 224 */                 compression.objectNext(out);
/*     */               } else {
/* 226 */                 needSep = true;
/* 227 */               }  out.append(Integer.toString(b));
/*     */             } 
/* 229 */             compression.arrayStop(out);
/*     */           }
/*     */         },  new Class[] { int[].class });
/*     */     
/* 233 */     registerWriter(new JsonWriterI<short[]>() {
/*     */           public void writeJSONString(short[] value, Appendable out, JSONStyle compression) throws IOException {
/* 235 */             boolean needSep = false;
/* 236 */             compression.arrayStart(out);
/* 237 */             for (short b : value) {
/* 238 */               if (needSep) {
/* 239 */                 compression.objectNext(out);
/*     */               } else {
/* 241 */                 needSep = true;
/* 242 */               }  out.append(Short.toString(b));
/*     */             } 
/* 244 */             compression.arrayStop(out);
/*     */           }
/*     */         },  new Class[] { short[].class });
/*     */     
/* 248 */     registerWriter(new JsonWriterI<long[]>() {
/*     */           public void writeJSONString(long[] value, Appendable out, JSONStyle compression) throws IOException {
/* 250 */             boolean needSep = false;
/* 251 */             compression.arrayStart(out);
/* 252 */             for (long b : value) {
/* 253 */               if (needSep) {
/* 254 */                 compression.objectNext(out);
/*     */               } else {
/* 256 */                 needSep = true;
/* 257 */               }  out.append(Long.toString(b));
/*     */             } 
/* 259 */             compression.arrayStop(out);
/*     */           }
/*     */         },  new Class[] { long[].class });
/*     */     
/* 263 */     registerWriter(new JsonWriterI<float[]>() {
/*     */           public void writeJSONString(float[] value, Appendable out, JSONStyle compression) throws IOException {
/* 265 */             boolean needSep = false;
/* 266 */             compression.arrayStart(out);
/* 267 */             for (float b : value) {
/* 268 */               if (needSep) {
/* 269 */                 compression.objectNext(out);
/*     */               } else {
/* 271 */                 needSep = true;
/* 272 */               }  out.append(Float.toString(b));
/*     */             } 
/* 274 */             compression.arrayStop(out);
/*     */           }
/*     */         },  new Class[] { float[].class });
/*     */     
/* 278 */     registerWriter(new JsonWriterI<double[]>() {
/*     */           public void writeJSONString(double[] value, Appendable out, JSONStyle compression) throws IOException {
/* 280 */             boolean needSep = false;
/* 281 */             compression.arrayStart(out);
/* 282 */             for (double b : value) {
/* 283 */               if (needSep) {
/* 284 */                 compression.objectNext(out);
/*     */               } else {
/* 286 */                 needSep = true;
/* 287 */               }  out.append(Double.toString(b));
/*     */             } 
/* 289 */             compression.arrayStop(out);
/*     */           }
/*     */         },  new Class[] { double[].class });
/*     */     
/* 293 */     registerWriter(new JsonWriterI<boolean[]>() {
/*     */           public void writeJSONString(boolean[] value, Appendable out, JSONStyle compression) throws IOException {
/* 295 */             boolean needSep = false;
/* 296 */             compression.arrayStart(out);
/* 297 */             for (boolean b : value) {
/* 298 */               if (needSep) {
/* 299 */                 compression.objectNext(out);
/*     */               } else {
/* 301 */                 needSep = true;
/* 302 */               }  out.append(Boolean.toString(b));
/*     */             } 
/* 304 */             compression.arrayStop(out);
/*     */           }
/*     */         },  new Class[] { boolean[].class });
/*     */     
/* 308 */     registerWriterInterface(JSONStreamAwareEx.class, JSONStreamAwareExWriter);
/* 309 */     registerWriterInterface(JSONStreamAware.class, JSONStreamAwareWriter);
/* 310 */     registerWriterInterface(JSONAwareEx.class, JSONJSONAwareExWriter);
/* 311 */     registerWriterInterface(JSONAware.class, JSONJSONAwareWriter);
/* 312 */     registerWriterInterface(Map.class, JSONMapWriter);
/* 313 */     registerWriterInterface(Iterable.class, JSONIterableWriter);
/* 314 */     registerWriterInterface(Enum.class, EnumWriter);
/* 315 */     registerWriterInterface(Number.class, toStringWriter);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addInterfaceWriterFirst(Class<?> interFace, JsonWriterI<?> writer) {
/* 325 */     registerWriterInterfaceFirst(interFace, writer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addInterfaceWriterLast(Class<?> interFace, JsonWriterI<?> writer) {
/* 335 */     registerWriterInterfaceLast(interFace, writer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerWriterInterfaceLast(Class<?> interFace, JsonWriterI<?> writer) {
/* 344 */     this.writerInterfaces.addLast(new WriterByInterface(interFace, writer));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerWriterInterfaceFirst(Class<?> interFace, JsonWriterI<?> writer) {
/* 353 */     this.writerInterfaces.addFirst(new WriterByInterface(interFace, writer));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerWriterInterface(Class<?> interFace, JsonWriterI<?> writer) {
/* 362 */     registerWriterInterfaceLast(interFace, writer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> void registerWriter(JsonWriterI<T> writer, Class<?>... cls) {
/* 371 */     for (Class<?> c : cls) {
/* 372 */       this.data.put(c, writer);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeJSONKV(String key, Object value, Appendable out, JSONStyle compression) throws IOException {
/* 379 */     if (key == null) {
/* 380 */       out.append("null");
/* 381 */     } else if (!compression.mustProtectKey(key)) {
/* 382 */       out.append(key);
/*     */     } else {
/* 384 */       out.append('"');
/* 385 */       JSONValue.escape(key, out, compression);
/* 386 */       out.append('"');
/*     */     } 
/* 388 */     compression.objectEndOfKey(out);
/* 389 */     if (value instanceof String) {
/* 390 */       compression.writeString(out, (String)value);
/*     */     } else {
/* 392 */       JSONValue.writeJSONString(value, out, compression);
/* 393 */     }  compression.objectElmStop(out);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\reader\JsonWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */