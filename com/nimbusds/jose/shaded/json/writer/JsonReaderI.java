/*     */ package com.nimbusds.jose.shaded.json.writer;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.parser.ParseException;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Type;
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
/*     */ public abstract class JsonReaderI<T>
/*     */ {
/*     */   public final JsonReader base;
/*     */   
/*     */   public JsonReaderI(JsonReader base) {
/*  39 */     this.base = base;
/*     */   }
/*     */   
/*  42 */   private static String ERR_MSG = "Invalid or non Implemented status";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonReaderI<?> startObject(String key) throws ParseException, IOException {
/*  49 */     throw new RuntimeException(ERR_MSG + " startObject(String key) in " + getClass() + " key=" + key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonReaderI<?> startArray(String key) throws ParseException, IOException {
/*  58 */     throw new RuntimeException(ERR_MSG + " startArray in " + getClass() + " key=" + key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(Object current, String key, Object value) throws ParseException, IOException {
/*  65 */     throw new RuntimeException(ERR_MSG + " setValue in " + getClass() + " key=" + key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getValue(Object current, String key) {
/*  72 */     throw new RuntimeException(ERR_MSG + " getValue(Object current, String key) in " + getClass() + " key=" + key);
/*     */   }
/*     */ 
/*     */   
/*     */   public Type getType(String key) {
/*  77 */     throw new RuntimeException(ERR_MSG + " getType(String key) in " + getClass() + " key=" + key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addValue(Object current, Object value) throws ParseException, IOException {
/*  84 */     throw new RuntimeException(ERR_MSG + " addValue(Object current, Object value) in " + getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object createObject() {
/*  91 */     throw new RuntimeException(ERR_MSG + " createObject() in " + getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object createArray() {
/*  98 */     throw new RuntimeException(ERR_MSG + " createArray() in " + getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public T convert(Object current) {
/* 108 */     return (T)current;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\JsonReaderI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */