/*    */ package com.nimbusds.jose.shaded.json.parser;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.JSONValue;
/*    */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*    */ import java.io.IOException;
/*    */ import java.io.Reader;
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
/*    */ 
/*    */ class JSONParserReader
/*    */   extends JSONParserStream
/*    */ {
/*    */   private Reader in;
/*    */   
/*    */   public JSONParserReader(int permissiveMode) {
/* 36 */     super(permissiveMode);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object parse(Reader in) throws ParseException {
/* 44 */     return parse(in, JSONValue.defaultReader.DEFAULT);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public <T> T parse(Reader in, JsonReaderI<T> mapper) throws ParseException {
/* 52 */     this.base = mapper.base;
/*    */     
/* 54 */     this.in = in;
/* 55 */     return parse(mapper);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void read() throws IOException {
/* 67 */     int i = this.in.read();
/* 68 */     this.c = (i == -1) ? '\032' : (char)i;
/* 69 */     this.pos++;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void readS() throws IOException {
/* 74 */     this.sb.append(this.c);
/* 75 */     int i = this.in.read();
/* 76 */     if (i == -1) {
/* 77 */       this.c = '\032';
/*    */     } else {
/* 79 */       this.c = (char)i;
/* 80 */       this.pos++;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void readNoEnd() throws ParseException, IOException {
/* 85 */     int i = this.in.read();
/* 86 */     if (i == -1)
/* 87 */       throw new ParseException(this.pos - 1, 3, "EOF"); 
/* 88 */     this.c = (char)i;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */