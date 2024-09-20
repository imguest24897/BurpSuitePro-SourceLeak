/*     */ package com.nimbusds.jose.shaded.json;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.parser.JSONParser;
/*     */ import com.nimbusds.jose.shaded.json.parser.ParseException;
/*     */ import com.nimbusds.jose.shaded.json.reader.JsonWriter;
/*     */ import com.nimbusds.jose.shaded.json.reader.JsonWriterI;
/*     */ import com.nimbusds.jose.shaded.json.writer.CompessorMapper;
/*     */ import com.nimbusds.jose.shaded.json.writer.FakeMapper;
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReader;
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*     */ import com.nimbusds.jose.shaded.json.writer.UpdaterMapper;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JSONValue
/*     */ {
/*  51 */   public static JSONStyle COMPRESSION = JSONStyle.NO_COMPRESS;
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
/*     */   public static Object parse(InputStream in) {
/*     */     try {
/*  67 */       return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in);
/*  68 */     } catch (Exception e) {
/*  69 */       return null;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object parse(byte[] in) {
/*     */     try {
/*  87 */       return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in);
/*  88 */     } catch (Exception e) {
/*  89 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(InputStream in, Class<T> mapTo) {
/*     */     try {
/* 102 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 103 */       return (T)p.parse(in, defaultReader.getMapper(mapTo));
/* 104 */     } catch (Exception e) {
/* 105 */       return null;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object parse(Reader in) {
/*     */     try {
/* 123 */       return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in);
/* 124 */     } catch (Exception e) {
/* 125 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(byte[] in, Class<T> mapTo) {
/*     */     try {
/* 138 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 139 */       return (T)p.parse(in, defaultReader.getMapper(mapTo));
/* 140 */     } catch (Exception e) {
/* 141 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(Reader in, Class<T> mapTo) {
/*     */     try {
/* 154 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 155 */       return (T)p.parse(in, defaultReader.getMapper(mapTo));
/* 156 */     } catch (Exception e) {
/* 157 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(Reader in, T toUpdate) {
/*     */     try {
/* 170 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 171 */       return (T)p.parse(in, (JsonReaderI)new UpdaterMapper(defaultReader, toUpdate));
/* 172 */     } catch (Exception e) {
/* 173 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static <T> T parse(Reader in, JsonReaderI<T> mapper) {
/*     */     try {
/* 184 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 185 */       return (T)p.parse(in, mapper);
/* 186 */     } catch (Exception e) {
/* 187 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(String in, Class<T> mapTo) {
/*     */     try {
/* 200 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 201 */       return (T)p.parse(in, defaultReader.getMapper(mapTo));
/* 202 */     } catch (Exception e) {
/* 203 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(InputStream in, T toUpdate) {
/*     */     try {
/* 216 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 217 */       return (T)p.parse(in, (JsonReaderI)new UpdaterMapper(defaultReader, toUpdate));
/* 218 */     } catch (Exception e) {
/* 219 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T parse(String in, T toUpdate) {
/*     */     try {
/* 232 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 233 */       return (T)p.parse(in, (JsonReaderI)new UpdaterMapper(defaultReader, toUpdate));
/* 234 */     } catch (Exception e) {
/* 235 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static <T> T parse(byte[] in, JsonReaderI<T> mapper) {
/*     */     try {
/* 246 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 247 */       return (T)p.parse(in, mapper);
/* 248 */     } catch (Exception e) {
/* 249 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static <T> T parse(String in, JsonReaderI<T> mapper) {
/*     */     try {
/* 260 */       JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 261 */       return (T)p.parse(in, mapper);
/* 262 */     } catch (Exception e) {
/* 263 */       return null;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object parse(String s) {
/*     */     try {
/* 281 */       return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(s);
/* 282 */     } catch (Exception e) {
/* 283 */       return null;
/*     */     } 
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
/*     */   
/*     */   public static Object parseKeepingOrder(Reader in) {
/*     */     try {
/* 298 */       return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in, defaultReader.DEFAULT_ORDERED);
/* 299 */     } catch (Exception e) {
/* 300 */       return null;
/*     */     } 
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
/*     */   
/*     */   public static Object parseKeepingOrder(String in) {
/*     */     try {
/* 315 */       return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in, defaultReader.DEFAULT_ORDERED);
/* 316 */     } catch (Exception e) {
/* 317 */       return null;
/*     */     } 
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
/*     */ 
/*     */   
/*     */   public static String compress(String input, JSONStyle style) {
/*     */     try {
/* 333 */       StringBuilder sb = new StringBuilder();
/* 334 */       (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(input, (JsonReaderI)new CompessorMapper(defaultReader, sb, style));
/* 335 */       return sb.toString();
/* 336 */     } catch (Exception e) {
/* 337 */       return input;
/*     */     } 
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
/*     */   
/*     */   public static String compress(String input) {
/* 351 */     return compress(input, JSONStyle.MAX_COMPRESS);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String uncompress(String input) {
/* 361 */     return compress(input, JSONStyle.NO_COMPRESS);
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
/*     */ 
/*     */   
/*     */   public static Object parseWithException(byte[] in) throws IOException, ParseException {
/* 375 */     return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in, defaultReader.DEFAULT);
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
/*     */   
/*     */   public static Object parseWithException(InputStream in) throws IOException, ParseException {
/* 388 */     return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in, defaultReader.DEFAULT);
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
/*     */ 
/*     */   
/*     */   public static Object parseWithException(Reader in) throws IOException, ParseException {
/* 402 */     return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in, defaultReader.DEFAULT);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object parseWithException(String input) throws ParseException {
/* 418 */     return (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(input, defaultReader.DEFAULT);
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
/*     */ 
/*     */   
/*     */   public static <T> T parseWithException(String in, Class<T> mapTo) throws ParseException {
/* 432 */     JSONParser p = new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE);
/* 433 */     return (T)p.parse(in, defaultReader.getMapper(mapTo));
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
/*     */ 
/*     */   
/*     */   public static Object parseStrict(Reader in) throws IOException, ParseException {
/* 447 */     return (new JSONParser(656)).parse(in, defaultReader.DEFAULT);
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
/*     */   
/*     */   public static Object parseStrict(String s) throws ParseException {
/* 460 */     return (new JSONParser(656)).parse(s, defaultReader.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidJsonStrict(Reader in) throws IOException {
/*     */     try {
/* 470 */       (new JSONParser(656)).parse(in, FakeMapper.DEFAULT);
/* 471 */       return true;
/* 472 */     } catch (ParseException e) {
/* 473 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidJsonStrict(String s) {
/*     */     try {
/* 484 */       (new JSONParser(656)).parse(s, FakeMapper.DEFAULT);
/* 485 */       return true;
/* 486 */     } catch (ParseException e) {
/* 487 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidJson(Reader in) throws IOException {
/*     */     try {
/* 498 */       (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(in, FakeMapper.DEFAULT);
/* 499 */       return true;
/* 500 */     } catch (ParseException e) {
/* 501 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidJson(String s) {
/*     */     try {
/* 512 */       (new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE)).parse(s, FakeMapper.DEFAULT);
/* 513 */       return true;
/* 514 */     } catch (ParseException e) {
/* 515 */       return false;
/*     */     } 
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
/*     */ 
/*     */   
/*     */   public static void writeJSONString(Object value, Appendable out) throws IOException {
/* 530 */     writeJSONString(value, out, COMPRESSION);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 536 */   public static final JsonWriter defaultWriter = new JsonWriter();
/*     */ 
/*     */ 
/*     */   
/* 540 */   public static final JsonReader defaultReader = new JsonReader();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> void remapField(Class<T> type, String jsonFieldName, String javaFieldName) {
/* 551 */     defaultReader.remapField(type, jsonFieldName, javaFieldName);
/* 552 */     defaultWriter.remapField(type, javaFieldName, jsonFieldName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> void registerWriter(Class<?> cls, JsonWriterI<T> writer) {
/* 559 */     defaultWriter.registerWriter(writer, new Class[] { cls });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> void registerReader(Class<T> type, JsonReaderI<T> mapper) {
/* 566 */     defaultReader.registerReader(type, mapper);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeJSONString(Object value, Appendable out, JSONStyle compression) throws IOException {
/* 581 */     if (value == null) {
/* 582 */       out.append("null");
/*     */       return;
/*     */     } 
/* 585 */     Class<?> clz = value.getClass();
/*     */     
/* 587 */     JsonWriterI w = defaultWriter.getWrite(clz);
/* 588 */     if (w == null) {
/* 589 */       if (clz.isArray()) {
/* 590 */         w = JsonWriter.arrayWriter;
/*     */       } else {
/* 592 */         w = defaultWriter.getWriterByInterface(value.getClass());
/* 593 */         if (w == null) {
/* 594 */           w = JsonWriter.beansWriterASM;
/*     */         }
/*     */       } 
/* 597 */       defaultWriter.registerWriter(w, new Class[] { clz });
/*     */     } 
/* 599 */     w.writeJSONString(value, out, compression);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String toJSONString(Object value) {
/* 617 */     return toJSONString(value, COMPRESSION);
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
/*     */   public static String toJSONString(Object value, JSONStyle compression) {
/* 640 */     StringBuilder sb = new StringBuilder();
/*     */     try {
/* 642 */       writeJSONString(value, sb, compression);
/* 643 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 646 */     return sb.toString();
/*     */   }
/*     */   
/*     */   public static String escape(String s) {
/* 650 */     return escape(s, COMPRESSION);
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
/*     */   
/*     */   public static String escape(String s, JSONStyle compression) {
/* 663 */     if (s == null)
/* 664 */       return null; 
/* 665 */     StringBuilder sb = new StringBuilder();
/* 666 */     compression.escape(s, sb);
/* 667 */     return sb.toString();
/*     */   }
/*     */   
/*     */   public static void escape(String s, Appendable ap) {
/* 671 */     escape(s, ap, COMPRESSION);
/*     */   }
/*     */   
/*     */   public static void escape(String s, Appendable ap, JSONStyle compression) {
/* 675 */     if (s == null)
/*     */       return; 
/* 677 */     compression.escape(s, ap);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JSONValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */