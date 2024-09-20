/*    */ package com.nimbusds.jose.shaded.json.writer;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.parser.ParseException;
/*    */ import java.io.IOException;
/*    */ import java.lang.reflect.Type;
/*    */ 
/*    */ public class UpdaterMapper<T>
/*    */   extends JsonReaderI<T> {
/*    */   final T obj;
/*    */   final JsonReaderI<?> mapper;
/*    */   
/*    */   public UpdaterMapper(JsonReader base, T obj) {
/* 13 */     super(base);
/* 14 */     if (obj == null)
/* 15 */       throw new NullPointerException("can not update null Object"); 
/* 16 */     this.obj = obj;
/* 17 */     this.mapper = base.getMapper(obj.getClass());
/*    */   }
/*    */   
/*    */   public UpdaterMapper(JsonReader base, T obj, Type type) {
/* 21 */     super(base);
/* 22 */     if (obj == null)
/* 23 */       throw new NullPointerException("can not update null Object"); 
/* 24 */     this.obj = obj;
/* 25 */     this.mapper = base.getMapper(type);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonReaderI<?> startObject(String key) throws ParseException, IOException {
/* 32 */     Object bean = this.mapper.getValue(this.obj, key);
/* 33 */     if (bean == null)
/* 34 */       return this.mapper.startObject(key); 
/* 35 */     return new UpdaterMapper(this.base, (T)bean, this.mapper.getType(key));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonReaderI<?> startArray(String key) throws ParseException, IOException {
/* 46 */     return this.mapper.startArray(key);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValue(Object current, String key, Object value) throws ParseException, IOException {
/* 54 */     this.mapper.setValue(current, key, value);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addValue(Object current, Object value) throws ParseException, IOException {
/* 62 */     this.mapper.addValue(current, value);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object createObject() {
/* 69 */     if (this.obj != null)
/* 70 */       return this.obj; 
/* 71 */     return this.mapper.createObject();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object createArray() {
/* 78 */     if (this.obj != null)
/* 79 */       return this.obj; 
/* 80 */     return this.mapper.createArray();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public T convert(Object current) {
/* 90 */     if (this.obj != null)
/* 91 */       return this.obj; 
/* 92 */     return (T)this.mapper.convert(current);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\UpdaterMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */