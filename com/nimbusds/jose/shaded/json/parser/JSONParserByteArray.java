/*     */ package com.nimbusds.jose.shaded.json.parser;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONValue;
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*     */ import java.nio.charset.StandardCharsets;
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
/*     */ class JSONParserByteArray
/*     */   extends JSONParserMemory
/*     */ {
/*     */   private byte[] in;
/*     */   
/*     */   public JSONParserByteArray(int permissiveMode) {
/*  34 */     super(permissiveMode);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parse(byte[] in) throws ParseException {
/*  42 */     return parse(in, JSONValue.defaultReader.DEFAULT);
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
/*     */   public <T> T parse(byte[] in, JsonReaderI<T> mapper) throws ParseException {
/*  58 */     this.base = mapper.base;
/*  59 */     this.in = in;
/*  60 */     this.len = in.length;
/*  61 */     return parse(mapper);
/*     */   }
/*     */   
/*     */   protected void extractString(int beginIndex, int endIndex) {
/*  65 */     this.xs = new String(this.in, beginIndex, endIndex - beginIndex, StandardCharsets.UTF_8);
/*     */   }
/*     */   
/*     */   protected void extractStringTrim(int start, int stop) {
/*  69 */     byte[] val = this.in;
/*     */     
/*  71 */     while (start < stop && val[start] <= 32) {
/*  72 */       start++;
/*     */     }
/*  74 */     while (start < stop && val[stop - 1] <= 32) {
/*  75 */       stop--;
/*     */     }
/*  77 */     this.xs = new String(this.in, start, stop - start, StandardCharsets.UTF_8);
/*     */   }
/*     */   
/*     */   protected int indexOf(char c, int pos) {
/*  81 */     for (int i = pos; i < this.len; i++) {
/*  82 */       if (this.in[i] == (byte)c)
/*  83 */         return i; 
/*  84 */     }  return -1;
/*     */   }
/*     */   
/*     */   protected void read() {
/*  88 */     if (++this.pos >= this.len) {
/*  89 */       this.c = '\032';
/*     */     } else {
/*  91 */       this.c = (char)this.in[this.pos];
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void readS() {
/*  98 */     if (++this.pos >= this.len) {
/*  99 */       this.c = '\032';
/*     */     } else {
/* 101 */       this.c = (char)this.in[this.pos];
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void readNoEnd() throws ParseException {
/* 108 */     if (++this.pos >= this.len) {
/* 109 */       this.c = '\032';
/* 110 */       throw new ParseException(this.pos - 1, 3, "EOF");
/*     */     } 
/* 112 */     this.c = (char)this.in[this.pos];
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserByteArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */