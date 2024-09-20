/*     */ package com.nimbusds.jose.shaded.json.writer;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ArraysMapper<T>
/*     */   extends JsonReaderI<T>
/*     */ {
/*     */   public ArraysMapper(JsonReader base) {
/*  24 */     super(base);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object createArray() {
/*  29 */     return new ArrayList();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addValue(Object current, Object value) {
/*  35 */     ((List<Object>)current).add(value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public T convert(Object current) {
/*  41 */     return (T)current;
/*     */   }
/*     */   
/*     */   public static class GenericMapper<T> extends ArraysMapper<T> {
/*     */     final Class<?> componentType;
/*     */     JsonReaderI<?> subMapper;
/*     */     
/*     */     public GenericMapper(JsonReader base, Class<T> type) {
/*  49 */       super(base);
/*  50 */       this.componentType = type.getComponentType();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public T convert(Object current) {
/*  56 */       int p = 0;
/*     */       
/*  58 */       Object[] r = (Object[])Array.newInstance(this.componentType, ((List)current).size());
/*  59 */       for (Object e : current)
/*  60 */         r[p++] = e; 
/*  61 */       return (T)r;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startArray(String key) {
/*  66 */       if (this.subMapper == null)
/*  67 */         this.subMapper = this.base.getMapper(this.componentType); 
/*  68 */       return this.subMapper;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonReaderI<?> startObject(String key) {
/*  73 */       if (this.subMapper == null)
/*  74 */         this.subMapper = this.base.getMapper(this.componentType); 
/*  75 */       return this.subMapper;
/*     */     }
/*     */   }
/*     */   
/*  79 */   public static JsonReaderI<int[]> MAPPER_PRIM_INT = (JsonReaderI<int[]>)new ArraysMapper<int[]>(null)
/*     */     {
/*     */       public int[] convert(Object current) {
/*  82 */         int p = 0;
/*  83 */         int[] r = new int[((List)current).size()];
/*  84 */         for (Object e : current)
/*  85 */           r[p++] = ((Number)e).intValue(); 
/*  86 */         return r;
/*     */       }
/*     */     };
/*     */   
/*  90 */   public static JsonReaderI<Integer[]> MAPPER_INT = (JsonReaderI<Integer[]>)new ArraysMapper<Integer[]>(null)
/*     */     {
/*     */       public Integer[] convert(Object current) {
/*  93 */         int p = 0;
/*  94 */         Integer[] r = new Integer[((List)current).size()];
/*  95 */         for (Object e : current) {
/*  96 */           if (e == null)
/*     */             continue; 
/*  98 */           if (e instanceof Integer) {
/*  99 */             r[p] = (Integer)e;
/*     */           } else {
/* 101 */             r[p] = Integer.valueOf(((Number)e).intValue());
/* 102 */           }  p++;
/*     */         } 
/* 104 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 108 */   public static JsonReaderI<short[]> MAPPER_PRIM_SHORT = (JsonReaderI<short[]>)new ArraysMapper<short[]>(null)
/*     */     {
/*     */       public short[] convert(Object current) {
/* 111 */         int p = 0;
/* 112 */         short[] r = new short[((List)current).size()];
/* 113 */         for (Object e : current)
/* 114 */           r[p++] = ((Number)e).shortValue(); 
/* 115 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 119 */   public static JsonReaderI<Short[]> MAPPER_SHORT = (JsonReaderI<Short[]>)new ArraysMapper<Short[]>(null)
/*     */     {
/*     */       public Short[] convert(Object current) {
/* 122 */         int p = 0;
/* 123 */         Short[] r = new Short[((List)current).size()];
/* 124 */         for (Object e : current) {
/* 125 */           if (e == null)
/*     */             continue; 
/* 127 */           if (e instanceof Short) {
/* 128 */             r[p] = (Short)e;
/*     */           } else {
/* 130 */             r[p] = Short.valueOf(((Number)e).shortValue());
/* 131 */           }  p++;
/*     */         } 
/* 133 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 137 */   public static JsonReaderI<byte[]> MAPPER_PRIM_BYTE = (JsonReaderI<byte[]>)new ArraysMapper<byte[]>(null)
/*     */     {
/*     */       public byte[] convert(Object current) {
/* 140 */         int p = 0;
/* 141 */         byte[] r = new byte[((List)current).size()];
/* 142 */         for (Object e : current)
/* 143 */           r[p++] = ((Number)e).byteValue(); 
/* 144 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 148 */   public static JsonReaderI<Byte[]> MAPPER_BYTE = (JsonReaderI<Byte[]>)new ArraysMapper<Byte[]>(null)
/*     */     {
/*     */       public Byte[] convert(Object current) {
/* 151 */         int p = 0;
/* 152 */         Byte[] r = new Byte[((List)current).size()];
/* 153 */         for (Object e : current) {
/* 154 */           if (e == null)
/*     */             continue; 
/* 156 */           if (e instanceof Byte) {
/* 157 */             r[p] = (Byte)e;
/*     */           } else {
/* 159 */             r[p] = Byte.valueOf(((Number)e).byteValue());
/* 160 */           }  p++;
/*     */         } 
/* 162 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 166 */   public static JsonReaderI<char[]> MAPPER_PRIM_CHAR = (JsonReaderI<char[]>)new ArraysMapper<char[]>(null)
/*     */     {
/*     */       public char[] convert(Object current) {
/* 169 */         int p = 0;
/* 170 */         char[] r = new char[((List)current).size()];
/* 171 */         for (Object e : current)
/* 172 */           r[p++] = e.toString().charAt(0); 
/* 173 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 177 */   public static JsonReaderI<Character[]> MAPPER_CHAR = (JsonReaderI<Character[]>)new ArraysMapper<Character[]>(null)
/*     */     {
/*     */       public Character[] convert(Object current) {
/* 180 */         int p = 0;
/* 181 */         Character[] r = new Character[((List)current).size()];
/* 182 */         for (Object e : current) {
/* 183 */           if (e == null)
/*     */             continue; 
/* 185 */           r[p] = Character.valueOf(e.toString().charAt(0));
/* 186 */           p++;
/*     */         } 
/* 188 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 192 */   public static JsonReaderI<long[]> MAPPER_PRIM_LONG = (JsonReaderI<long[]>)new ArraysMapper<long[]>(null)
/*     */     {
/*     */       public long[] convert(Object current) {
/* 195 */         int p = 0;
/* 196 */         long[] r = new long[((List)current).size()];
/* 197 */         for (Object e : current)
/* 198 */           r[p++] = ((Number)e).intValue(); 
/* 199 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 203 */   public static JsonReaderI<Long[]> MAPPER_LONG = (JsonReaderI<Long[]>)new ArraysMapper<Long[]>(null)
/*     */     {
/*     */       public Long[] convert(Object current) {
/* 206 */         int p = 0;
/* 207 */         Long[] r = new Long[((List)current).size()];
/* 208 */         for (Object e : current) {
/* 209 */           if (e == null)
/*     */             continue; 
/* 211 */           if (e instanceof Float) {
/* 212 */             r[p] = (Long)e;
/*     */           } else {
/* 214 */             r[p] = Long.valueOf(((Number)e).longValue());
/* 215 */           }  p++;
/*     */         } 
/* 217 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 221 */   public static JsonReaderI<float[]> MAPPER_PRIM_FLOAT = (JsonReaderI<float[]>)new ArraysMapper<float[]>(null)
/*     */     {
/*     */       public float[] convert(Object current) {
/* 224 */         int p = 0;
/* 225 */         float[] r = new float[((List)current).size()];
/* 226 */         for (Object e : current)
/* 227 */           r[p++] = ((Number)e).floatValue(); 
/* 228 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 232 */   public static JsonReaderI<Float[]> MAPPER_FLOAT = (JsonReaderI<Float[]>)new ArraysMapper<Float[]>(null)
/*     */     {
/*     */       public Float[] convert(Object current) {
/* 235 */         int p = 0;
/* 236 */         Float[] r = new Float[((List)current).size()];
/* 237 */         for (Object e : current) {
/* 238 */           if (e == null)
/*     */             continue; 
/* 240 */           if (e instanceof Float) {
/* 241 */             r[p] = (Float)e;
/*     */           } else {
/* 243 */             r[p] = Float.valueOf(((Number)e).floatValue());
/* 244 */           }  p++;
/*     */         } 
/* 246 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 250 */   public static JsonReaderI<double[]> MAPPER_PRIM_DOUBLE = (JsonReaderI<double[]>)new ArraysMapper<double[]>(null)
/*     */     {
/*     */       public double[] convert(Object current) {
/* 253 */         int p = 0;
/* 254 */         double[] r = new double[((List)current).size()];
/* 255 */         for (Object e : current)
/* 256 */           r[p++] = ((Number)e).doubleValue(); 
/* 257 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 261 */   public static JsonReaderI<Double[]> MAPPER_DOUBLE = (JsonReaderI<Double[]>)new ArraysMapper<Double[]>(null)
/*     */     {
/*     */       public Double[] convert(Object current) {
/* 264 */         int p = 0;
/* 265 */         Double[] r = new Double[((List)current).size()];
/* 266 */         for (Object e : current) {
/* 267 */           if (e == null)
/*     */             continue; 
/* 269 */           if (e instanceof Double) {
/* 270 */             r[p] = (Double)e;
/*     */           } else {
/* 272 */             r[p] = Double.valueOf(((Number)e).doubleValue());
/* 273 */           }  p++;
/*     */         } 
/* 275 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 279 */   public static JsonReaderI<boolean[]> MAPPER_PRIM_BOOL = (JsonReaderI<boolean[]>)new ArraysMapper<boolean[]>(null)
/*     */     {
/*     */       public boolean[] convert(Object current) {
/* 282 */         int p = 0;
/* 283 */         boolean[] r = new boolean[((List)current).size()];
/* 284 */         for (Object e : current)
/* 285 */           r[p++] = ((Boolean)e).booleanValue(); 
/* 286 */         return r;
/*     */       }
/*     */     };
/*     */   
/* 290 */   public static JsonReaderI<Boolean[]> MAPPER_BOOL = (JsonReaderI<Boolean[]>)new ArraysMapper<Boolean[]>(null)
/*     */     {
/*     */       public Boolean[] convert(Object current) {
/* 293 */         int p = 0;
/* 294 */         Boolean[] r = new Boolean[((List)current).size()];
/* 295 */         for (Object e : current) {
/* 296 */           if (e == null)
/*     */             continue; 
/* 298 */           if (e instanceof Boolean) {
/* 299 */             r[p] = Boolean.valueOf(((Boolean)e).booleanValue());
/* 300 */           } else if (e instanceof Number) {
/* 301 */             r[p] = Boolean.valueOf((((Number)e).intValue() != 0));
/*     */           } else {
/* 303 */             throw new RuntimeException("can not convert " + e + " toBoolean");
/* 304 */           }  p++;
/*     */         } 
/* 306 */         return r;
/*     */       }
/*     */     };
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\ArraysMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */