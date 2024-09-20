/*    */ package com.nimbusds.jose.shaded.json.writer;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.JSONArray;
/*    */ import com.nimbusds.jose.shaded.json.JSONAwareEx;
/*    */ import java.util.LinkedHashMap;
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
/*    */ 
/*    */ public class DefaultMapperOrdered
/*    */   extends JsonReaderI<JSONAwareEx>
/*    */ {
/*    */   protected DefaultMapperOrdered(JsonReader base) {
/* 26 */     super(base);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<JSONAwareEx> startObject(String key) {
/* 31 */     return this.base.DEFAULT_ORDERED;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<JSONAwareEx> startArray(String key) {
/* 36 */     return this.base.DEFAULT_ORDERED;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setValue(Object current, String key, Object value) {
/* 41 */     ((Map<String, Object>)current).put(key, value);
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createObject() {
/* 46 */     return new LinkedHashMap<>();
/*    */   }
/*    */ 
/*    */   
/*    */   public void addValue(Object current, Object value) {
/* 51 */     ((JSONArray)current).add(value);
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createArray() {
/* 56 */     return new JSONArray();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\DefaultMapperOrdered.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */