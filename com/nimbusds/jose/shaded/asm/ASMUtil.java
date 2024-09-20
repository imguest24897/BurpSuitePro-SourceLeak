/*     */ package com.nimbusds.jose.shaded.asm;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.ow2asm.Label;
/*     */ import com.nimbusds.jose.shaded.ow2asm.MethodVisitor;
/*     */ import com.nimbusds.jose.shaded.ow2asm.Type;
/*     */ import java.lang.reflect.Field;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ASMUtil
/*     */ {
/*     */   public static void autoBoxing(MethodVisitor mv, Class<?> clz) {
/*  42 */     autoBoxing(mv, Type.getType(clz));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Accessor[] getAccessors(Class<?> type, FieldFilter filter) {
/*  53 */     Class<?> nextClass = type;
/*  54 */     HashMap<String, Accessor> map = new HashMap<>();
/*  55 */     if (filter == null)
/*  56 */       filter = BasicFiledFilter.SINGLETON; 
/*  57 */     while (nextClass != Object.class) {
/*  58 */       Field[] declaredFields = nextClass.getDeclaredFields();
/*     */       
/*  60 */       for (Field field : declaredFields) {
/*  61 */         String fn = field.getName();
/*  62 */         if (!map.containsKey(fn)) {
/*     */           
/*  64 */           Accessor acc = new Accessor(nextClass, field, filter);
/*  65 */           if (acc.isUsable())
/*     */           {
/*  67 */             map.put(fn, acc); } 
/*     */         } 
/*  69 */       }  nextClass = nextClass.getSuperclass();
/*     */     } 
/*  71 */     return (Accessor[])map.values().toArray((Object[])new Accessor[map.size()]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void autoBoxing(MethodVisitor mv, Type fieldType) {
/*  81 */     switch (fieldType.getSort()) {
/*     */       case 1:
/*  83 */         mv.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
/*     */         break;
/*     */       case 3:
/*  86 */         mv.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
/*     */         break;
/*     */       case 2:
/*  89 */         mv.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
/*     */         break;
/*     */       case 4:
/*  92 */         mv.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
/*     */         break;
/*     */       case 5:
/*  95 */         mv.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
/*     */         break;
/*     */       case 6:
/*  98 */         mv.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
/*     */         break;
/*     */       case 7:
/* 101 */         mv.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
/*     */         break;
/*     */       case 8:
/* 104 */         mv.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void autoUnBoxing1(MethodVisitor mv, Type fieldType) {
/* 116 */     switch (fieldType.getSort()) {
/*     */       case 1:
/* 118 */         mv.visitTypeInsn(192, "java/lang/Boolean");
/* 119 */         mv.visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z", false);
/*     */         return;
/*     */       case 3:
/* 122 */         mv.visitTypeInsn(192, "java/lang/Byte");
/* 123 */         mv.visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B", false);
/*     */         return;
/*     */       case 2:
/* 126 */         mv.visitTypeInsn(192, "java/lang/Character");
/* 127 */         mv.visitMethodInsn(182, "java/lang/Character", "charValue", "()C", false);
/*     */         return;
/*     */       case 4:
/* 130 */         mv.visitTypeInsn(192, "java/lang/Short");
/* 131 */         mv.visitMethodInsn(182, "java/lang/Short", "shortValue", "()S", false);
/*     */         return;
/*     */       case 5:
/* 134 */         mv.visitTypeInsn(192, "java/lang/Integer");
/* 135 */         mv.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I", false);
/*     */         return;
/*     */       case 6:
/* 138 */         mv.visitTypeInsn(192, "java/lang/Float");
/* 139 */         mv.visitMethodInsn(182, "java/lang/Float", "floatValue", "()F", false);
/*     */         return;
/*     */       case 7:
/* 142 */         mv.visitTypeInsn(192, "java/lang/Long");
/* 143 */         mv.visitMethodInsn(182, "java/lang/Long", "longValue", "()J", false);
/*     */         return;
/*     */       case 8:
/* 146 */         mv.visitTypeInsn(192, "java/lang/Double");
/* 147 */         mv.visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D", false);
/*     */         return;
/*     */       case 9:
/* 150 */         mv.visitTypeInsn(192, fieldType.getInternalName());
/*     */         return;
/*     */     } 
/* 153 */     mv.visitTypeInsn(192, fieldType.getInternalName());
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
/*     */   protected static void autoUnBoxing2(MethodVisitor mv, Type fieldType) {
/* 165 */     switch (fieldType.getSort()) {
/*     */       case 1:
/* 167 */         mv.visitTypeInsn(192, "java/lang/Boolean");
/* 168 */         mv.visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z", false);
/*     */         return;
/*     */       case 3:
/* 171 */         mv.visitTypeInsn(192, "java/lang/Number");
/* 172 */         mv.visitMethodInsn(182, "java/lang/Number", "byteValue", "()B", false);
/*     */         return;
/*     */       case 2:
/* 175 */         mv.visitTypeInsn(192, "java/lang/Character");
/* 176 */         mv.visitMethodInsn(182, "java/lang/Character", "charValue", "()C", false);
/*     */         return;
/*     */       case 4:
/* 179 */         mv.visitTypeInsn(192, "java/lang/Number");
/* 180 */         mv.visitMethodInsn(182, "java/lang/Number", "shortValue", "()S", false);
/*     */         return;
/*     */       case 5:
/* 183 */         mv.visitTypeInsn(192, "java/lang/Number");
/* 184 */         mv.visitMethodInsn(182, "java/lang/Number", "intValue", "()I", false);
/*     */         return;
/*     */       case 6:
/* 187 */         mv.visitTypeInsn(192, "java/lang/Number");
/* 188 */         mv.visitMethodInsn(182, "java/lang/Number", "floatValue", "()F", false);
/*     */         return;
/*     */       case 7:
/* 191 */         mv.visitTypeInsn(192, "java/lang/Number");
/* 192 */         mv.visitMethodInsn(182, "java/lang/Number", "longValue", "()J", false);
/*     */         return;
/*     */       case 8:
/* 195 */         mv.visitTypeInsn(192, "java/lang/Number");
/* 196 */         mv.visitMethodInsn(182, "java/lang/Number", "doubleValue", "()D", false);
/*     */         return;
/*     */       case 9:
/* 199 */         mv.visitTypeInsn(192, fieldType.getInternalName());
/*     */         return;
/*     */     } 
/* 202 */     mv.visitTypeInsn(192, fieldType.getInternalName());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Label[] newLabels(int cnt) {
/* 213 */     Label[] r = new Label[cnt];
/* 214 */     for (int i = 0; i < cnt; i++)
/* 215 */       r[i] = new Label(); 
/* 216 */     return r;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getSetterName(String key) {
/* 224 */     int len = key.length();
/* 225 */     char[] b = new char[len + 3];
/* 226 */     b[0] = 's';
/* 227 */     b[1] = 'e';
/* 228 */     b[2] = 't';
/* 229 */     char c = key.charAt(0);
/* 230 */     if (c >= 'a' && c <= 'z')
/* 231 */       c = (char)(c - 32); 
/* 232 */     b[3] = c;
/* 233 */     for (int i = 1; i < len; i++) {
/* 234 */       b[i + 3] = key.charAt(i);
/*     */     }
/* 236 */     return new String(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getGetterName(String key) {
/* 244 */     int len = key.length();
/* 245 */     char[] b = new char[len + 3];
/* 246 */     b[0] = 'g';
/* 247 */     b[1] = 'e';
/* 248 */     b[2] = 't';
/* 249 */     char c = key.charAt(0);
/* 250 */     if (c >= 'a' && c <= 'z')
/* 251 */       c = (char)(c - 32); 
/* 252 */     b[3] = c;
/* 253 */     for (int i = 1; i < len; i++) {
/* 254 */       b[i + 3] = key.charAt(i);
/*     */     }
/* 256 */     return new String(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getIsName(String key) {
/* 264 */     int len = key.length();
/* 265 */     char[] b = new char[len + 2];
/* 266 */     b[0] = 'i';
/* 267 */     b[1] = 's';
/* 268 */     char c = key.charAt(0);
/* 269 */     if (c >= 'a' && c <= 'z')
/* 270 */       c = (char)(c - 32); 
/* 271 */     b[2] = c;
/* 272 */     for (int i = 1; i < len; i++) {
/* 273 */       b[i + 2] = key.charAt(i);
/*     */     }
/* 275 */     return new String(b);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\ASMUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */