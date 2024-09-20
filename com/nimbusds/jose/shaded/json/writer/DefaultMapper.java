/*    */ package com.nimbusds.jose.shaded.json.writer;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.JSONArray;
/*    */ import com.nimbusds.jose.shaded.json.JSONAwareEx;
/*    */ import com.nimbusds.jose.shaded.json.JSONObject;
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
/*    */ public class DefaultMapper<T>
/*    */   extends JsonReaderI<T>
/*    */ {
/*    */   protected DefaultMapper(JsonReader base) {
/* 30 */     super(base);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<JSONAwareEx> startObject(String key) {
/* 35 */     return this.base.DEFAULT;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<JSONAwareEx> startArray(String key) {
/* 40 */     return this.base.DEFAULT;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createObject() {
/* 45 */     return new JSONObject();
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createArray() {
/* 50 */     return new JSONArray();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setValue(Object current, String key, Object value) {
/* 55 */     ((JSONObject)current).put(key, value);
/*    */   }
/*    */ 
/*    */   
/*    */   public void addValue(Object current, Object value) {
/* 60 */     ((JSONArray)current).add(value);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\DefaultMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */