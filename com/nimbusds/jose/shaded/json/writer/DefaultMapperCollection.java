/*    */ package com.nimbusds.jose.shaded.json.writer;
/*    */ 
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public class DefaultMapperCollection<T>
/*    */   extends JsonReaderI<T>
/*    */ {
/*    */   Class<T> clz;
/*    */   
/*    */   public DefaultMapperCollection(JsonReader base, Class<T> clz) {
/* 26 */     super(base);
/* 27 */     this.clz = clz;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonReaderI<T> startObject(String key) {
/* 34 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<T> startArray(String key) {
/* 39 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createObject() {
/*    */     try {
/* 45 */       Constructor<T> c = this.clz.getConstructor(new Class[0]);
/* 46 */       return c.newInstance(new Object[0]);
/* 47 */     } catch (Exception e) {
/* 48 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createArray() {
/*    */     try {
/* 55 */       Constructor<T> c = this.clz.getConstructor(new Class[0]);
/* 56 */       return c.newInstance(new Object[0]);
/* 57 */     } catch (Exception e) {
/* 58 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValue(Object current, String key, Object value) {
/* 65 */     ((Map<String, Object>)current).put(key, value);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void addValue(Object current, Object value) {
/* 71 */     ((List<Object>)current).add(value);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\DefaultMapperCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */