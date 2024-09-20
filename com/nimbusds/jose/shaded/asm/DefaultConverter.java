/*     */ package com.nimbusds.jose.shaded.asm;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.asm.ex.ConvertException;
/*     */ 
/*     */ public class DefaultConverter {
/*     */   public static int convertToint(Object obj) {
/*   7 */     if (obj == null)
/*   8 */       return 0; 
/*   9 */     if (obj instanceof Number)
/*  10 */       return ((Number)obj).intValue(); 
/*  11 */     if (obj instanceof String)
/*  12 */       return Integer.parseInt((String)obj); 
/*  13 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
/*     */   }
/*     */   
/*     */   public static Integer convertToInt(Object obj) {
/*  17 */     if (obj == null)
/*  18 */       return null; 
/*  19 */     Class<?> c = obj.getClass();
/*  20 */     if (c == Integer.class)
/*  21 */       return (Integer)obj; 
/*  22 */     if (obj instanceof Number)
/*  23 */       return Integer.valueOf(((Number)obj).intValue()); 
/*  24 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Integer");
/*     */   }
/*     */   
/*     */   public static short convertToshort(Object obj) {
/*  28 */     if (obj == null)
/*  29 */       return 0; 
/*  30 */     if (obj instanceof Number)
/*  31 */       return ((Number)obj).shortValue(); 
/*  32 */     if (obj instanceof String)
/*  33 */       return Short.parseShort((String)obj); 
/*  34 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to short");
/*     */   }
/*     */   
/*     */   public static Short convertToShort(Object obj) {
/*  38 */     if (obj == null)
/*  39 */       return null; 
/*  40 */     Class<?> c = obj.getClass();
/*  41 */     if (c == Short.class)
/*  42 */       return (Short)obj; 
/*  43 */     if (obj instanceof Number)
/*  44 */       return Short.valueOf(((Number)obj).shortValue()); 
/*  45 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Short");
/*     */   }
/*     */   
/*     */   public static long convertTolong(Object obj) {
/*  49 */     if (obj == null)
/*  50 */       return 0L; 
/*  51 */     if (obj instanceof Number)
/*  52 */       return ((Number)obj).longValue(); 
/*  53 */     if (obj instanceof String)
/*  54 */       return Long.parseLong((String)obj); 
/*  55 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to long");
/*     */   }
/*     */   
/*     */   public static Long convertToLong(Object obj) {
/*  59 */     if (obj == null)
/*  60 */       return null; 
/*  61 */     Class<?> c = obj.getClass();
/*  62 */     if (c == Long.class)
/*  63 */       return (Long)obj; 
/*  64 */     if (obj instanceof Number)
/*  65 */       return Long.valueOf(((Number)obj).longValue()); 
/*  66 */     throw new ConvertException("Primitive: Can not convert value '" + obj + "' As " + obj.getClass().getName() + " to Long");
/*     */   }
/*     */   
/*     */   public static byte convertTobyte(Object obj) {
/*  70 */     if (obj == null)
/*  71 */       return 0; 
/*  72 */     if (obj instanceof Number)
/*  73 */       return ((Number)obj).byteValue(); 
/*  74 */     if (obj instanceof String)
/*  75 */       return Byte.parseByte((String)obj); 
/*  76 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to byte");
/*     */   }
/*     */   
/*     */   public static Byte convertToByte(Object obj) {
/*  80 */     if (obj == null)
/*  81 */       return null; 
/*  82 */     Class<?> c = obj.getClass();
/*  83 */     if (c == Byte.class)
/*  84 */       return (Byte)obj; 
/*  85 */     if (obj instanceof Number)
/*  86 */       return Byte.valueOf(((Number)obj).byteValue()); 
/*  87 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Byte");
/*     */   }
/*     */   
/*     */   public static float convertTofloat(Object obj) {
/*  91 */     if (obj == null)
/*  92 */       return 0.0F; 
/*  93 */     if (obj instanceof Number)
/*  94 */       return ((Number)obj).floatValue(); 
/*  95 */     if (obj instanceof String)
/*  96 */       return Float.parseFloat((String)obj); 
/*  97 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to float");
/*     */   }
/*     */   
/*     */   public static Float convertToFloat(Object obj) {
/* 101 */     if (obj == null)
/* 102 */       return null; 
/* 103 */     Class<?> c = obj.getClass();
/* 104 */     if (c == Float.class)
/* 105 */       return (Float)obj; 
/* 106 */     if (obj instanceof Number)
/* 107 */       return Float.valueOf(((Number)obj).floatValue()); 
/* 108 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Float");
/*     */   }
/*     */   
/*     */   public static double convertTodouble(Object obj) {
/* 112 */     if (obj == null)
/* 113 */       return 0.0D; 
/* 114 */     if (obj instanceof Number)
/* 115 */       return ((Number)obj).doubleValue(); 
/* 116 */     if (obj instanceof String)
/* 117 */       return Double.parseDouble((String)obj); 
/* 118 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to float");
/*     */   }
/*     */   
/*     */   public static Double convertToDouble(Object obj) {
/* 122 */     if (obj == null)
/* 123 */       return null; 
/* 124 */     Class<?> c = obj.getClass();
/* 125 */     if (c == Double.class)
/* 126 */       return (Double)obj; 
/* 127 */     if (obj instanceof Number)
/* 128 */       return Double.valueOf(((Number)obj).doubleValue()); 
/* 129 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Float");
/*     */   }
/*     */   
/*     */   public static char convertTochar(Object obj) {
/* 133 */     if (obj == null)
/* 134 */       return ' '; 
/* 135 */     if (obj instanceof String) {
/* 136 */       if (((String)obj).length() > 0) {
/* 137 */         return ((String)obj).charAt(0);
/*     */       }
/* 139 */       return ' ';
/* 140 */     }  throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to char");
/*     */   }
/*     */   
/*     */   public static Character convertToChar(Object obj) {
/* 144 */     if (obj == null)
/* 145 */       return null; 
/* 146 */     Class<?> c = obj.getClass();
/* 147 */     if (c == Character.class)
/* 148 */       return (Character)obj; 
/* 149 */     if (obj instanceof String) {
/* 150 */       if (((String)obj).length() > 0) {
/* 151 */         return Character.valueOf(((String)obj).charAt(0));
/*     */       }
/* 153 */       return Character.valueOf(' ');
/* 154 */     }  throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Character");
/*     */   }
/*     */   
/*     */   public static boolean convertTobool(Object obj) {
/* 158 */     if (obj == null)
/* 159 */       return false; 
/* 160 */     if (obj.getClass() == Boolean.class)
/* 161 */       return ((Boolean)obj).booleanValue(); 
/* 162 */     if (obj instanceof String)
/* 163 */       return Boolean.parseBoolean((String)obj); 
/* 164 */     if (obj instanceof Number) {
/* 165 */       if (obj.toString().equals("0")) {
/* 166 */         return false;
/*     */       }
/* 168 */       return true;
/*     */     } 
/* 170 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to boolean");
/*     */   }
/*     */   
/*     */   public static Boolean convertToBool(Object obj) {
/* 174 */     if (obj == null)
/* 175 */       return null; 
/* 176 */     Class<?> c = obj.getClass();
/* 177 */     if (c == Boolean.class)
/* 178 */       return (Boolean)obj; 
/* 179 */     if (obj instanceof String)
/* 180 */       return Boolean.valueOf(Boolean.parseBoolean((String)obj)); 
/* 181 */     throw new ConvertException("Primitive: Can not convert " + obj.getClass().getName() + " to Boolean");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\DefaultConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */