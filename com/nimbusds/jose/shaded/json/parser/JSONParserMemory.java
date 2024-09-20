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
/*     */ abstract class JSONParserMemory
/*     */   extends JSONParserBase
/*     */ {
/*     */   protected int len;
/*     */   
/*     */   public JSONParserMemory(int permissiveMode) {
/*  35 */     super(permissiveMode);
/*     */   }
/*     */   
/*     */   protected void readNQString(boolean[] stop) throws IOException {
/*  39 */     int start = this.pos;
/*  40 */     skipNQString(stop);
/*  41 */     extractStringTrim(start, this.pos);
/*     */   }
/*     */   
/*     */   protected Object readNumber(boolean[] stop) throws ParseException, IOException {
/*  45 */     int start = this.pos;
/*     */     
/*  47 */     read();
/*  48 */     skipDigits();
/*     */ 
/*     */     
/*  51 */     if (this.c != '.' && this.c != 'E' && this.c != 'e') {
/*  52 */       skipSpace();
/*  53 */       if (this.c >= '\000' && this.c < '~' && !stop[this.c] && this.c != '\032') {
/*     */         
/*  55 */         skipNQString(stop);
/*  56 */         extractStringTrim(start, this.pos);
/*  57 */         if (!this.acceptNonQuote)
/*  58 */           throw new ParseException(this.pos, 1, this.xs); 
/*  59 */         return this.xs;
/*     */       } 
/*  61 */       extractStringTrim(start, this.pos);
/*  62 */       return parseNumber(this.xs);
/*     */     } 
/*     */     
/*  65 */     if (this.c == '.') {
/*     */       
/*  67 */       read();
/*  68 */       skipDigits();
/*     */     } 
/*  70 */     if (this.c != 'E' && this.c != 'e') {
/*  71 */       skipSpace();
/*  72 */       if (this.c >= '\000' && this.c < '~' && !stop[this.c] && this.c != '\032') {
/*     */         
/*  74 */         skipNQString(stop);
/*  75 */         extractStringTrim(start, this.pos);
/*  76 */         if (!this.acceptNonQuote)
/*  77 */           throw new ParseException(this.pos, 1, this.xs); 
/*  78 */         return this.xs;
/*     */       } 
/*  80 */       extractStringTrim(start, this.pos);
/*  81 */       return extractFloat();
/*     */     } 
/*  83 */     this.sb.append('E');
/*  84 */     read();
/*  85 */     if (this.c == '+' || this.c == '-' || (this.c >= '0' && this.c <= '9')) {
/*  86 */       this.sb.append(this.c);
/*  87 */       read();
/*  88 */       skipDigits();
/*  89 */       skipSpace();
/*  90 */       if (this.c >= '\000' && this.c < '~' && !stop[this.c] && this.c != '\032') {
/*     */         
/*  92 */         skipNQString(stop);
/*  93 */         extractStringTrim(start, this.pos);
/*  94 */         if (!this.acceptNonQuote)
/*  95 */           throw new ParseException(this.pos, 1, this.xs); 
/*  96 */         return this.xs;
/*     */       } 
/*  98 */       extractStringTrim(start, this.pos);
/*  99 */       return extractFloat();
/*     */     } 
/* 101 */     skipNQString(stop);
/* 102 */     extractStringTrim(start, this.pos);
/* 103 */     if (!this.acceptNonQuote)
/* 104 */       throw new ParseException(this.pos, 1, this.xs); 
/* 105 */     if (!this.acceptLeadinZero)
/* 106 */       checkLeadinZero(); 
/* 107 */     return this.xs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void readString() throws ParseException, IOException {
/* 113 */     if (!this.acceptSimpleQuote && this.c == '\'') {
/* 114 */       if (this.acceptNonQuote) {
/* 115 */         readNQString(stopAll);
/*     */         return;
/*     */       } 
/* 118 */       throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */     } 
/* 120 */     int tmpP = indexOf(this.c, this.pos + 1);
/* 121 */     if (tmpP == -1)
/* 122 */       throw new ParseException(this.len, 3, null); 
/* 123 */     extractString(this.pos + 1, tmpP);
/* 124 */     if (this.xs.indexOf('\\') == -1) {
/* 125 */       checkControleChar();
/* 126 */       this.pos = tmpP;
/* 127 */       read();
/*     */       
/*     */       return;
/*     */     } 
/* 131 */     this.sb.clear();
/* 132 */     readString2();
/*     */   }
/*     */   
/*     */   protected abstract void extractString(int paramInt1, int paramInt2);
/*     */   
/*     */   protected abstract int indexOf(char paramChar, int paramInt);
/*     */   
/*     */   protected abstract void extractStringTrim(int paramInt1, int paramInt2);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserMemory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */