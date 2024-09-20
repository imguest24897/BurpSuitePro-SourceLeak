/*     */ package com.nimbusds.jose.shaded.json.parser;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONValue;
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
/*     */ import java.io.UnsupportedEncodingException;
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
/*     */ 
/*     */ public class JSONParser
/*     */ {
/*     */   public static final int ACCEPT_SIMPLE_QUOTE = 1;
/*     */   public static final int ACCEPT_NON_QUOTE = 2;
/*     */   public static final int ACCEPT_NAN = 4;
/*     */   public static final int IGNORE_CONTROL_CHAR = 8;
/*     */   public static final int USE_INTEGER_STORAGE = 16;
/*     */   public static final int ACCEPT_LEADING_ZERO = 32;
/*     */   public static final int ACCEPT_USELESS_COMMA = 64;
/*     */   public static final int USE_HI_PRECISION_FLOAT = 128;
/*     */   public static final int ACCEPT_TAILLING_DATA = 256;
/*     */   public static final int ACCEPT_TAILLING_SPACE = 512;
/*     */   public static final int REJECT_127_CHAR = 1024;
/*     */   public static final int BIG_DIGIT_UNRESTRICTED = 2048;
/*     */   public static final int MODE_PERMISSIVE = -1;
/*     */   public static final int MODE_RFC4627 = 656;
/*     */   public static final int MODE_JSON_SIMPLE = 4032;
/*     */   public static final int MODE_STRICTEST = 1168;
/* 129 */   public static int DEFAULT_PERMISSIVE_MODE = (System.getProperty("JSON_SMART_SIMPLE") != null) ? 4032 : 
/* 130 */     -1;
/*     */   
/*     */   private int mode;
/*     */   
/*     */   private JSONParserInputStream pBinStream;
/*     */   
/*     */   private JSONParserByteArray pBytes;
/*     */   
/*     */   private JSONParserReader pStream;
/*     */   
/*     */   private JSONParserString pString;
/*     */   
/*     */   private JSONParserReader getPStream() {
/* 143 */     if (this.pStream == null)
/* 144 */       this.pStream = new JSONParserReader(this.mode); 
/* 145 */     return this.pStream;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JSONParserInputStream getPBinStream() {
/* 154 */     if (this.pBinStream == null)
/* 155 */       this.pBinStream = new JSONParserInputStream(this.mode); 
/* 156 */     return this.pBinStream;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JSONParserString getPString() {
/* 165 */     if (this.pString == null)
/* 166 */       this.pString = new JSONParserString(this.mode); 
/* 167 */     return this.pString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JSONParserByteArray getPBytes() {
/* 176 */     if (this.pBytes == null)
/* 177 */       this.pBytes = new JSONParserByteArray(this.mode); 
/* 178 */     return this.pBytes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONParser() {
/* 185 */     this.mode = DEFAULT_PERMISSIVE_MODE;
/*     */   }
/*     */   
/*     */   public JSONParser(int permissifMode) {
/* 189 */     this.mode = permissifMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parse(byte[] in) throws ParseException {
/* 197 */     return getPBytes().parse(in);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(byte[] in, JsonReaderI<T> mapper) throws ParseException {
/* 205 */     return getPBytes().parse(in, mapper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(byte[] in, Class<T> mapTo) throws ParseException {
/* 213 */     return getPBytes().parse(in, JSONValue.defaultReader.getMapper(mapTo));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parse(InputStream in) throws ParseException, UnsupportedEncodingException {
/* 222 */     return getPBinStream().parse(in);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(InputStream in, JsonReaderI<T> mapper) throws ParseException, UnsupportedEncodingException {
/* 230 */     return getPBinStream().parse(in, mapper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(InputStream in, Class<T> mapTo) throws ParseException, UnsupportedEncodingException {
/* 238 */     return getPBinStream().parse(in, JSONValue.defaultReader.getMapper(mapTo));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parse(Reader in) throws ParseException {
/* 246 */     return getPStream().parse(in);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(Reader in, JsonReaderI<T> mapper) throws ParseException {
/* 254 */     return getPStream().parse(in, mapper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(Reader in, Class<T> mapTo) throws ParseException {
/* 262 */     return getPStream().parse(in, JSONValue.defaultReader.getMapper(mapTo));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parse(String in) throws ParseException {
/* 270 */     return getPString().parse(in);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(String in, JsonReaderI<T> mapper) throws ParseException {
/* 278 */     return getPString().parse(in, mapper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T parse(String in, Class<T> mapTo) throws ParseException {
/* 286 */     return getPString().parse(in, JSONValue.defaultReader.getMapper(mapTo));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */