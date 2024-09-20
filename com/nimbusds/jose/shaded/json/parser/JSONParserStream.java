/*     */ package com.nimbusds.jose.shaded.json.parser;
/*     */ 
/*     */ import java.io.IOException;
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
/*     */ abstract class JSONParserStream
/*     */   extends JSONParserBase
/*     */ {
/*     */   public JSONParserStream(int permissiveMode) {
/*  34 */     super(permissiveMode);
/*     */   }
/*     */   
/*     */   protected void readNQString(boolean[] stop) throws IOException {
/*  38 */     this.sb.clear();
/*  39 */     skipNQString(stop);
/*  40 */     this.xs = this.sb.toString().trim();
/*     */   }
/*     */   
/*     */   protected Object readNumber(boolean[] stop) throws ParseException, IOException {
/*  44 */     this.sb.clear();
/*  45 */     this.sb.append(this.c);
/*  46 */     read();
/*  47 */     skipDigits();
/*     */ 
/*     */     
/*  50 */     if (this.c != '.' && this.c != 'E' && this.c != 'e') {
/*  51 */       skipSpace();
/*  52 */       if (this.c >= '\000' && this.c < '~' && !stop[this.c] && this.c != '\032') {
/*     */         
/*  54 */         skipNQString(stop);
/*  55 */         this.xs = this.sb.toString().trim();
/*  56 */         if (!this.acceptNonQuote)
/*  57 */           throw new ParseException(this.pos, 1, this.xs); 
/*  58 */         return this.xs;
/*     */       } 
/*  60 */       this.xs = this.sb.toString().trim();
/*  61 */       return parseNumber(this.xs);
/*     */     } 
/*     */     
/*  64 */     if (this.c == '.') {
/*  65 */       this.sb.append(this.c);
/*  66 */       read();
/*  67 */       skipDigits();
/*     */     } 
/*  69 */     if (this.c != 'E' && this.c != 'e') {
/*  70 */       skipSpace();
/*  71 */       if (this.c >= '\000' && this.c < '~' && !stop[this.c] && this.c != '\032') {
/*     */         
/*  73 */         skipNQString(stop);
/*  74 */         this.xs = this.sb.toString().trim();
/*  75 */         if (!this.acceptNonQuote)
/*  76 */           throw new ParseException(this.pos, 1, this.xs); 
/*  77 */         return this.xs;
/*     */       } 
/*  79 */       this.xs = this.sb.toString().trim();
/*  80 */       return extractFloat();
/*     */     } 
/*  82 */     this.sb.append('E');
/*  83 */     read();
/*  84 */     if (this.c == '+' || this.c == '-' || (this.c >= '0' && this.c <= '9')) {
/*  85 */       this.sb.append(this.c);
/*  86 */       read();
/*  87 */       skipDigits();
/*  88 */       skipSpace();
/*  89 */       if (this.c >= '\000' && this.c < '~' && !stop[this.c] && this.c != '\032') {
/*     */         
/*  91 */         skipNQString(stop);
/*  92 */         this.xs = this.sb.toString().trim();
/*  93 */         if (!this.acceptNonQuote)
/*  94 */           throw new ParseException(this.pos, 1, this.xs); 
/*  95 */         return this.xs;
/*     */       } 
/*  97 */       this.xs = this.sb.toString().trim();
/*  98 */       return extractFloat();
/*     */     } 
/* 100 */     skipNQString(stop);
/* 101 */     this.xs = this.sb.toString().trim();
/* 102 */     if (!this.acceptNonQuote)
/* 103 */       throw new ParseException(this.pos, 1, this.xs); 
/* 104 */     if (!this.acceptLeadinZero)
/* 105 */       checkLeadinZero(); 
/* 106 */     return this.xs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void readString() throws ParseException, IOException {
/* 112 */     if (!this.acceptSimpleQuote && this.c == '\'') {
/* 113 */       if (this.acceptNonQuote) {
/* 114 */         readNQString(stopAll);
/*     */         return;
/*     */       } 
/* 117 */       throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */     } 
/* 119 */     this.sb.clear();
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
/* 131 */     readString2();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */