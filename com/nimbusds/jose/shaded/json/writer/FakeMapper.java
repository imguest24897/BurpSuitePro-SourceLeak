/*    */ package com.nimbusds.jose.shaded.json.writer;
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
/*    */ public class FakeMapper
/*    */   extends JsonReaderI<Object>
/*    */ {
/*    */   private FakeMapper() {
/* 22 */     super(null);
/*    */   }
/*    */   
/* 25 */   public static JsonReaderI<Object> DEFAULT = new FakeMapper();
/*    */ 
/*    */   
/*    */   public JsonReaderI<?> startObject(String key) {
/* 29 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<?> startArray(String key) {
/* 34 */     return this;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValue(Object current, String key, Object value) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void addValue(Object current, Object value) {}
/*    */ 
/*    */   
/*    */   public Object createObject() {
/* 47 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createArray() {
/* 52 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\FakeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */