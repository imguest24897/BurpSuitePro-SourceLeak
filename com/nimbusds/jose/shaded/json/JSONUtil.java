/*     */ package com.nimbusds.jose.shaded.json;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.asm.FieldFilter;
/*     */ import com.nimbusds.jose.shaded.json.annotate.JsonIgnore;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
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
/*     */ public class JSONUtil
/*     */ {
/*     */   public static Object convertToStrict(Object obj, Class<?> dest) {
/*  27 */     if (obj == null)
/*  28 */       return null; 
/*  29 */     if (dest.isAssignableFrom(obj.getClass()))
/*  30 */       return obj; 
/*  31 */     if (dest.isPrimitive()) {
/*  32 */       if (dest == int.class) {
/*  33 */         if (obj instanceof Number) {
/*  34 */           return Integer.valueOf(((Number)obj).intValue());
/*     */         }
/*  36 */         return Integer.valueOf(obj.toString());
/*  37 */       }  if (dest == short.class) {
/*  38 */         if (obj instanceof Number) {
/*  39 */           return Short.valueOf(((Number)obj).shortValue());
/*     */         }
/*  41 */         return Short.valueOf(obj.toString());
/*  42 */       }  if (dest == long.class) {
/*  43 */         if (obj instanceof Number) {
/*  44 */           return Long.valueOf(((Number)obj).longValue());
/*     */         }
/*  46 */         return Long.valueOf(obj.toString());
/*  47 */       }  if (dest == byte.class) {
/*  48 */         if (obj instanceof Number) {
/*  49 */           return Byte.valueOf(((Number)obj).byteValue());
/*     */         }
/*  51 */         return Byte.valueOf(obj.toString());
/*  52 */       }  if (dest == float.class) {
/*  53 */         if (obj instanceof Number) {
/*  54 */           return Float.valueOf(((Number)obj).floatValue());
/*     */         }
/*  56 */         return Float.valueOf(obj.toString());
/*  57 */       }  if (dest == double.class) {
/*  58 */         if (obj instanceof Number) {
/*  59 */           return Double.valueOf(((Number)obj).doubleValue());
/*     */         }
/*  61 */         return Double.valueOf(obj.toString());
/*  62 */       }  if (dest == char.class) {
/*  63 */         String asString = dest.toString();
/*  64 */         if (asString.length() > 0)
/*  65 */           return Character.valueOf(asString.charAt(0)); 
/*  66 */       } else if (dest == boolean.class) {
/*  67 */         return obj;
/*     */       } 
/*  69 */       throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to " + dest
/*  70 */           .getName());
/*     */     } 
/*  72 */     if (dest.isEnum())
/*  73 */       return Enum.valueOf(dest, obj.toString()); 
/*  74 */     if (dest == Integer.class) {
/*  75 */       if (obj instanceof Number) {
/*  76 */         return Integer.valueOf(((Number)obj).intValue());
/*     */       }
/*  78 */       return Integer.valueOf(obj.toString());
/*  79 */     }  if (dest == Long.class) {
/*  80 */       if (obj instanceof Number) {
/*  81 */         return Long.valueOf(((Number)obj).longValue());
/*     */       }
/*  83 */       return Long.valueOf(obj.toString());
/*  84 */     }  if (dest == Short.class) {
/*  85 */       if (obj instanceof Number) {
/*  86 */         return Short.valueOf(((Number)obj).shortValue());
/*     */       }
/*  88 */       return Short.valueOf(obj.toString());
/*  89 */     }  if (dest == Byte.class) {
/*  90 */       if (obj instanceof Number) {
/*  91 */         return Byte.valueOf(((Number)obj).byteValue());
/*     */       }
/*  93 */       return Byte.valueOf(obj.toString());
/*  94 */     }  if (dest == Float.class) {
/*  95 */       if (obj instanceof Number) {
/*  96 */         return Float.valueOf(((Number)obj).floatValue());
/*     */       }
/*  98 */       return Float.valueOf(obj.toString());
/*  99 */     }  if (dest == Double.class) {
/* 100 */       if (obj instanceof Number) {
/* 101 */         return Double.valueOf(((Number)obj).doubleValue());
/*     */       }
/* 103 */       return Double.valueOf(obj.toString());
/* 104 */     }  if (dest == Character.class) {
/* 105 */       String asString = dest.toString();
/* 106 */       if (asString.length() > 0)
/* 107 */         return Character.valueOf(asString.charAt(0)); 
/*     */     } 
/* 109 */     throw new RuntimeException("Object: Can not Convert " + obj.getClass().getName() + " to " + dest.getName());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object convertToX(Object obj, Class<?> dest) {
/* 115 */     if (obj == null)
/* 116 */       return null; 
/* 117 */     if (dest.isAssignableFrom(obj.getClass()))
/* 118 */       return obj; 
/* 119 */     if (dest.isPrimitive()) {
/* 120 */       if (obj instanceof Number)
/* 121 */         return obj; 
/* 122 */       if (dest == int.class)
/* 123 */         return Integer.valueOf(obj.toString()); 
/* 124 */       if (dest == short.class)
/* 125 */         return Short.valueOf(obj.toString()); 
/* 126 */       if (dest == long.class)
/* 127 */         return Long.valueOf(obj.toString()); 
/* 128 */       if (dest == byte.class)
/* 129 */         return Byte.valueOf(obj.toString()); 
/* 130 */       if (dest == float.class)
/* 131 */         return Float.valueOf(obj.toString()); 
/* 132 */       if (dest == double.class)
/* 133 */         return Double.valueOf(obj.toString()); 
/* 134 */       if (dest == char.class) {
/* 135 */         String asString = dest.toString();
/* 136 */         if (asString.length() > 0)
/* 137 */           return Character.valueOf(asString.charAt(0)); 
/* 138 */       } else if (dest == boolean.class) {
/* 139 */         return obj;
/*     */       } 
/* 141 */       throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to " + dest
/* 142 */           .getName());
/*     */     } 
/* 144 */     if (dest.isEnum())
/* 145 */       return Enum.valueOf(dest, obj.toString()); 
/* 146 */     if (dest == Integer.class) {
/* 147 */       if (obj instanceof Number) {
/* 148 */         return Integer.valueOf(((Number)obj).intValue());
/*     */       }
/* 150 */       return Integer.valueOf(obj.toString());
/* 151 */     }  if (dest == Long.class) {
/* 152 */       if (obj instanceof Number) {
/* 153 */         return Long.valueOf(((Number)obj).longValue());
/*     */       }
/* 155 */       return Long.valueOf(obj.toString());
/* 156 */     }  if (dest == Short.class) {
/* 157 */       if (obj instanceof Number) {
/* 158 */         return Short.valueOf(((Number)obj).shortValue());
/*     */       }
/* 160 */       return Short.valueOf(obj.toString());
/* 161 */     }  if (dest == Byte.class) {
/* 162 */       if (obj instanceof Number) {
/* 163 */         return Byte.valueOf(((Number)obj).byteValue());
/*     */       }
/* 165 */       return Byte.valueOf(obj.toString());
/* 166 */     }  if (dest == Float.class) {
/* 167 */       if (obj instanceof Number) {
/* 168 */         return Float.valueOf(((Number)obj).floatValue());
/*     */       }
/* 170 */       return Float.valueOf(obj.toString());
/* 171 */     }  if (dest == Double.class) {
/* 172 */       if (obj instanceof Number) {
/* 173 */         return Double.valueOf(((Number)obj).doubleValue());
/*     */       }
/* 175 */       return Double.valueOf(obj.toString());
/* 176 */     }  if (dest == Character.class) {
/* 177 */       String asString = dest.toString();
/* 178 */       if (asString.length() > 0)
/* 179 */         return Character.valueOf(asString.charAt(0)); 
/*     */     } 
/* 181 */     throw new RuntimeException("Object: Can not Convert " + obj.getClass().getName() + " to " + dest.getName());
/*     */   }
/*     */ 
/*     */   
/* 185 */   public static final JsonSmartFieldFilter JSON_SMART_FIELD_FILTER = new JsonSmartFieldFilter();
/*     */   
/*     */   public static class JsonSmartFieldFilter
/*     */     implements FieldFilter {
/*     */     public boolean canUse(Field field) {
/* 190 */       JsonIgnore ignore = field.<JsonIgnore>getAnnotation(JsonIgnore.class);
/* 191 */       if (ignore != null && ignore.value())
/* 192 */         return false; 
/* 193 */       return true;
/*     */     }
/*     */     
/*     */     public boolean canUse(Field field, Method method) {
/* 197 */       JsonIgnore ignore = method.<JsonIgnore>getAnnotation(JsonIgnore.class);
/* 198 */       if (ignore != null && ignore.value())
/* 199 */         return false; 
/* 200 */       return true;
/*     */     }
/*     */     
/*     */     public boolean canRead(Field field) {
/* 204 */       return true;
/*     */     }
/*     */     
/*     */     public boolean canWrite(Field field) {
/* 208 */       return true;
/*     */     } }
/*     */   
/*     */   public static String getSetterName(String key) {
/* 212 */     int len = key.length();
/* 213 */     char[] b = new char[len + 3];
/* 214 */     b[0] = 's';
/* 215 */     b[1] = 'e';
/* 216 */     b[2] = 't';
/* 217 */     char c = key.charAt(0);
/* 218 */     if (c >= 'a' && c <= 'z')
/* 219 */       c = (char)(c - 32); 
/* 220 */     b[3] = c;
/* 221 */     for (int i = 1; i < len; i++) {
/* 222 */       b[i + 3] = key.charAt(i);
/*     */     }
/* 224 */     return new String(b);
/*     */   }
/*     */   
/*     */   public static String getGetterName(String key) {
/* 228 */     int len = key.length();
/* 229 */     char[] b = new char[len + 3];
/* 230 */     b[0] = 'g';
/* 231 */     b[1] = 'e';
/* 232 */     b[2] = 't';
/* 233 */     char c = key.charAt(0);
/* 234 */     if (c >= 'a' && c <= 'z')
/* 235 */       c = (char)(c - 32); 
/* 236 */     b[3] = c;
/* 237 */     for (int i = 1; i < len; i++) {
/* 238 */       b[i + 3] = key.charAt(i);
/*     */     }
/* 240 */     return new String(b);
/*     */   }
/*     */   
/*     */   public static String getIsName(String key) {
/* 244 */     int len = key.length();
/* 245 */     char[] b = new char[len + 2];
/* 246 */     b[0] = 'i';
/* 247 */     b[1] = 's';
/* 248 */     char c = key.charAt(0);
/* 249 */     if (c >= 'a' && c <= 'z')
/* 250 */       c = (char)(c - 32); 
/* 251 */     b[2] = c;
/* 252 */     for (int i = 1; i < len; i++) {
/* 253 */       b[i + 2] = key.charAt(i);
/*     */     }
/* 255 */     return new String(b);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JSONUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */