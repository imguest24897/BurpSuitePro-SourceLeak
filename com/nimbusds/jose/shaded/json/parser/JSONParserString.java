/*     */ package com.nimbusds.jose.shaded.json.parser;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONValue;
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
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
/*     */ class JSONParserString
/*     */   extends JSONParserMemory
/*     */ {
/*     */   private String in;
/*     */   
/*     */   public JSONParserString(int permissiveMode) {
/*  31 */     super(permissiveMode);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parse(String in) throws ParseException {
/*  39 */     return parse(in, JSONValue.defaultReader.DEFAULT);
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
/*     */   public <T> T parse(String in, JsonReaderI<T> mapper) throws ParseException {
/*  55 */     this.base = mapper.base;
/*  56 */     this.in = in;
/*  57 */     this.len = in.length();
/*  58 */     return parse(mapper);
/*     */   }
/*     */   
/*     */   protected void extractString(int beginIndex, int endIndex) {
/*  62 */     this.xs = this.in.substring(beginIndex, endIndex);
/*     */   }
/*     */   
/*     */   protected void extractStringTrim(int start, int stop) {
/*  66 */     while (start < stop - 1 && Character.isWhitespace(this.in.charAt(start))) {
/*  67 */       start++;
/*     */     }
/*  69 */     while (stop - 1 > start && Character.isWhitespace(this.in.charAt(stop - 1))) {
/*  70 */       stop--;
/*     */     }
/*  72 */     extractString(start, stop);
/*     */   }
/*     */   
/*     */   protected int indexOf(char c, int pos) {
/*  76 */     return this.in.indexOf(c, pos);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void read() {
/*  83 */     if (++this.pos >= this.len) {
/*  84 */       this.c = '\032';
/*     */     } else {
/*  86 */       this.c = this.in.charAt(this.pos);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void readS() {
/*  93 */     if (++this.pos >= this.len) {
/*  94 */       this.c = '\032';
/*     */     } else {
/*  96 */       this.c = this.in.charAt(this.pos);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void readNoEnd() throws ParseException {
/* 103 */     if (++this.pos >= this.len) {
/* 104 */       this.c = '\032';
/* 105 */       throw new ParseException(this.pos - 1, 3, "EOF");
/*     */     } 
/* 107 */     this.c = this.in.charAt(this.pos);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */