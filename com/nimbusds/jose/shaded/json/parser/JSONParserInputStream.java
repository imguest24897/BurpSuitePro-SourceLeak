/*    */ package com.nimbusds.jose.shaded.json.parser;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.UnsupportedEncodingException;
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
/*    */ class JSONParserInputStream
/*    */   extends JSONParserReader
/*    */ {
/*    */   public JSONParserInputStream(int permissiveMode) {
/* 33 */     super(permissiveMode);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object parse(InputStream in) throws ParseException, UnsupportedEncodingException {
/* 42 */     InputStreamReader i2 = new InputStreamReader(in, "utf8");
/* 43 */     return parse(i2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public <T> T parse(InputStream in, JsonReaderI<T> mapper) throws ParseException, UnsupportedEncodingException {
/* 51 */     InputStreamReader i2 = new InputStreamReader(in, "utf8");
/*    */     
/* 53 */     return parse(i2, mapper);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */