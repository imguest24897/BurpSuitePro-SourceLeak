/*    */ package com.nimbusds.jose.shaded.json.reader;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.JSONStyle;
/*    */ import com.nimbusds.jose.shaded.json.JSONUtil;
/*    */ import java.io.IOException;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class BeansWriter
/*    */   implements JsonWriterI<Object>
/*    */ {
/*    */   public <E> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*    */     try {
/* 14 */       Class<?> nextClass = value.getClass();
/* 15 */       boolean needSep = false;
/* 16 */       compression.objectStart(out);
/* 17 */       while (nextClass != Object.class) {
/* 18 */         Field[] fields = nextClass.getDeclaredFields();
/* 19 */         for (Field field : fields) {
/* 20 */           int m = field.getModifiers();
/* 21 */           if ((m & 0x98) > 0)
/*    */             continue; 
/* 23 */           Object v = null;
/* 24 */           if ((m & 0x1) > 0) {
/* 25 */             v = field.get(value);
/*    */           } else {
/* 27 */             String g = JSONUtil.getGetterName(field.getName());
/* 28 */             Method mtd = null;
/*    */             
/*    */             try {
/* 31 */               mtd = nextClass.getDeclaredMethod(g, new Class[0]);
/* 32 */             } catch (Exception exception) {}
/*    */             
/* 34 */             if (mtd == null) {
/* 35 */               Class<?> c2 = field.getType();
/* 36 */               if (c2 == boolean.class || c2 == Boolean.class) {
/* 37 */                 g = JSONUtil.getIsName(field.getName());
/* 38 */                 mtd = nextClass.getDeclaredMethod(g, new Class[0]);
/*    */               } 
/*    */             } 
/* 41 */             if (mtd == null)
/*    */               continue; 
/* 43 */             v = mtd.invoke(value, new Object[0]);
/*    */           } 
/* 45 */           if (v != null || !compression.ignoreNull()) {
/*    */             
/* 47 */             if (needSep) {
/* 48 */               compression.objectNext(out);
/*    */             } else {
/* 50 */               needSep = true;
/* 51 */             }  String key = field.getName();
/*    */             
/* 53 */             JsonWriter.writeJSONKV(key, v, out, compression);
/*    */           }  continue;
/*    */         } 
/* 56 */         nextClass = nextClass.getSuperclass();
/*    */       } 
/* 58 */       compression.objectStop(out);
/* 59 */     } catch (Exception e) {
/* 60 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\reader\BeansWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */