/*    */ package com.nimbusds.jose.shaded.asm;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.LinkedHashSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BeansAccessConfig
/*    */ {
/* 27 */   protected static HashMap<Class<?>, LinkedHashSet<Class<?>>> classMapper = new HashMap<>();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 32 */   protected static HashMap<Class<?>, HashMap<String, String>> classFiledNameMapper = new HashMap<>();
/*    */   
/*    */   static {
/* 35 */     addTypeMapper(Object.class, DefaultConverter.class);
/* 36 */     addTypeMapper(Object.class, ConvertDate.class);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void addTypeMapper(Class<?> clz, Class<?> mapper) {
/* 67 */     synchronized (classMapper) {
/* 68 */       LinkedHashSet<Class<?>> h = classMapper.get(clz);
/* 69 */       if (h == null) {
/* 70 */         h = new LinkedHashSet<>();
/* 71 */         classMapper.put(clz, h);
/*    */       } 
/*    */       
/* 74 */       h.add(mapper);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\BeansAccessConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */