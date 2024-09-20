/*    */ package com.nimbusds.jose.shaded.json.writer;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.parser.ParseException;
/*    */ import java.io.IOException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MapperRemapped<T>
/*    */   extends JsonReaderI<T>
/*    */ {
/*    */   private Map<String, String> rename;
/*    */   private JsonReaderI<T> parent;
/*    */   
/*    */   public MapperRemapped(JsonReaderI<T> parent) {
/* 22 */     super(parent.base);
/* 23 */     this.parent = parent;
/* 24 */     this.rename = new HashMap<>();
/*    */   }
/*    */   
/*    */   public void renameField(String source, String dest) {
/* 28 */     this.rename.put(source, dest);
/*    */   }
/*    */   
/*    */   private String rename(String key) {
/* 32 */     String k2 = this.rename.get(key);
/* 33 */     if (k2 != null)
/* 34 */       return k2; 
/* 35 */     return key;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setValue(Object current, String key, Object value) throws ParseException, IOException {
/* 40 */     key = rename(key);
/* 41 */     this.parent.setValue(current, key, value);
/*    */   }
/*    */   
/*    */   public Object getValue(Object current, String key) {
/* 45 */     key = rename(key);
/* 46 */     return this.parent.getValue(current, key);
/*    */   }
/*    */ 
/*    */   
/*    */   public Type getType(String key) {
/* 51 */     key = rename(key);
/* 52 */     return this.parent.getType(key);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<?> startArray(String key) throws ParseException, IOException {
/* 57 */     key = rename(key);
/* 58 */     return this.parent.startArray(key);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonReaderI<?> startObject(String key) throws ParseException, IOException {
/* 63 */     key = rename(key);
/* 64 */     return this.parent.startObject(key);
/*    */   }
/*    */ 
/*    */   
/*    */   public Object createObject() {
/* 69 */     return this.parent.createObject();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\MapperRemapped.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */