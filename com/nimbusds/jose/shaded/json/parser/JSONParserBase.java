/*     */ package com.nimbusds.jose.shaded.json.parser;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReader;
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*     */ import java.io.IOException;
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class JSONParserBase
/*     */ {
/*     */   protected char c;
/*     */   JsonReader base;
/*     */   public static final byte EOI = 26;
/*     */   protected static final char MAX_STOP = '~';
/*     */   private String lastKey;
/*  47 */   protected static boolean[] stopAll = new boolean[126];
/*  48 */   protected static boolean[] stopArray = new boolean[126];
/*  49 */   protected static boolean[] stopKey = new boolean[126];
/*  50 */   protected static boolean[] stopValue = new boolean[126];
/*  51 */   protected static boolean[] stopX = new boolean[126];
/*     */   
/*     */   static {
/*  54 */     stopKey[26] = true; stopKey[58] = true;
/*  55 */     stopValue[26] = true; stopValue[125] = true; stopValue[44] = true;
/*  56 */     stopArray[26] = true; stopArray[93] = true; stopArray[44] = true;
/*  57 */     stopX[26] = true;
/*  58 */     stopAll[58] = true; stopAll[44] = true;
/*  59 */     stopAll[26] = true; stopAll[125] = true; stopAll[93] = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  67 */   protected final MSB sb = new MSB(15);
/*     */   
/*     */   protected Object xo;
/*     */   
/*     */   protected String xs;
/*     */   
/*     */   protected int pos;
/*     */   
/*     */   protected final boolean acceptLeadinZero;
/*     */   protected final boolean acceptNaN;
/*     */   protected final boolean acceptNonQuote;
/*     */   protected final boolean acceptSimpleQuote;
/*     */   protected final boolean acceptUselessComma;
/*     */   protected final boolean checkTaillingData;
/*     */   protected final boolean checkTaillingSpace;
/*     */   protected final boolean ignoreControlChar;
/*     */   protected final boolean useHiPrecisionFloat;
/*     */   protected final boolean useIntegerStorage;
/*     */   protected final boolean reject127;
/*     */   protected final boolean unrestictBigDigit;
/*     */   
/*     */   public JSONParserBase(int permissiveMode) {
/*  89 */     this.acceptNaN = ((permissiveMode & 0x4) > 0);
/*  90 */     this.acceptNonQuote = ((permissiveMode & 0x2) > 0);
/*  91 */     this.acceptSimpleQuote = ((permissiveMode & 0x1) > 0);
/*  92 */     this.ignoreControlChar = ((permissiveMode & 0x8) > 0);
/*  93 */     this.useIntegerStorage = ((permissiveMode & 0x10) > 0);
/*  94 */     this.acceptLeadinZero = ((permissiveMode & 0x20) > 0);
/*  95 */     this.acceptUselessComma = ((permissiveMode & 0x40) > 0);
/*  96 */     this.useHiPrecisionFloat = ((permissiveMode & 0x80) > 0);
/*  97 */     this.checkTaillingData = ((permissiveMode & 0x300) != 768);
/*  98 */     this.checkTaillingSpace = ((permissiveMode & 0x200) == 0);
/*  99 */     this.reject127 = ((permissiveMode & 0x400) > 0);
/* 100 */     this.unrestictBigDigit = ((permissiveMode & 0x800) > 0);
/*     */   }
/*     */   
/*     */   public void checkControleChar() throws ParseException {
/* 104 */     if (this.ignoreControlChar)
/*     */       return; 
/* 106 */     int l = this.xs.length();
/* 107 */     for (int i = 0; i < l; i++) {
/* 108 */       char c = this.xs.charAt(i);
/* 109 */       if (c >= '\000') {
/*     */         
/* 111 */         if (c <= '\037')
/* 112 */           throw new ParseException(this.pos + i, 0, Character.valueOf(c)); 
/* 113 */         if (c == '' && 
/* 114 */           this.reject127)
/* 115 */           throw new ParseException(this.pos + i, 0, Character.valueOf(c)); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void checkLeadinZero() throws ParseException {
/* 121 */     int len = this.xs.length();
/* 122 */     if (len == 1)
/*     */       return; 
/* 124 */     if (len == 2) {
/* 125 */       if (this.xs.equals("00"))
/* 126 */         throw new ParseException(this.pos, 6, this.xs); 
/*     */       return;
/*     */     } 
/* 129 */     char c1 = this.xs.charAt(0);
/* 130 */     char c2 = this.xs.charAt(1);
/* 131 */     if (c1 == '-') {
/* 132 */       char c3 = this.xs.charAt(2);
/* 133 */       if (c2 == '0' && c3 >= '0' && c3 <= '9')
/* 134 */         throw new ParseException(this.pos, 6, this.xs); 
/*     */       return;
/*     */     } 
/* 137 */     if (c1 == '0' && c2 >= '0' && c2 <= '9')
/* 138 */       throw new ParseException(this.pos, 6, this.xs); 
/*     */   }
/*     */   
/*     */   protected Number extractFloat() throws ParseException {
/* 142 */     if (!this.acceptLeadinZero) {
/* 143 */       checkLeadinZero();
/*     */     }
/*     */     try {
/* 146 */       if (!this.useHiPrecisionFloat) {
/* 147 */         return Float.valueOf(Float.parseFloat(this.xs));
/*     */       }
/*     */       
/* 150 */       if (this.xs.length() > 18) {
/* 151 */         BigDecimal big = new BigDecimal(this.xs);
/*     */         
/* 153 */         if (!this.unrestictBigDigit) {
/* 154 */           double asDouble = Double.parseDouble(this.xs);
/* 155 */           if (String.valueOf(asDouble).equals(this.xs))
/* 156 */             return Double.valueOf(asDouble); 
/*     */         } 
/* 158 */         return big;
/*     */       } 
/*     */       
/* 161 */       return Double.valueOf(Double.parseDouble(this.xs));
/*     */     }
/* 163 */     catch (NumberFormatException e) {
/* 164 */       throw new ParseException(this.pos, 1, this.xs);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected <T> T parse(JsonReaderI<T> mapper) throws ParseException {
/*     */     T result;
/* 173 */     this.pos = -1;
/*     */     
/*     */     try {
/* 176 */       read();
/* 177 */       result = readFirst(mapper);
/* 178 */       if (this.checkTaillingData) {
/* 179 */         if (!this.checkTaillingSpace)
/* 180 */           skipSpace(); 
/* 181 */         if (this.c != '\032')
/* 182 */           throw new ParseException(this.pos - 1, 1, Character.valueOf(this.c)); 
/*     */       } 
/* 184 */     } catch (IOException e) {
/* 185 */       throw new ParseException(this.pos, e);
/*     */     } 
/* 187 */     this.xs = null;
/* 188 */     this.xo = null;
/* 189 */     return result;
/*     */   }
/*     */   
/*     */   protected Number parseNumber(String s) throws ParseException {
/*     */     boolean neg, mustCheck;
/* 194 */     int p = 0;
/*     */     
/* 196 */     int l = s.length();
/*     */     
/* 198 */     int max = 19;
/*     */ 
/*     */     
/* 201 */     if (s.charAt(0) == '-') {
/* 202 */       p++;
/* 203 */       max++;
/* 204 */       neg = true;
/* 205 */       if (!this.acceptLeadinZero && l >= 3 && s.charAt(1) == '0')
/* 206 */         throw new ParseException(this.pos, 6, s); 
/*     */     } else {
/* 208 */       neg = false;
/* 209 */       if (!this.acceptLeadinZero && l >= 2 && s.charAt(0) == '0') {
/* 210 */         throw new ParseException(this.pos, 6, s);
/*     */       }
/*     */     } 
/*     */     
/* 214 */     if (l < max)
/* 215 */     { max = l;
/* 216 */       mustCheck = false; }
/* 217 */     else { if (l > max) {
/* 218 */         return new BigInteger(s, 10);
/*     */       }
/* 220 */       max = l - 1;
/* 221 */       mustCheck = true; }
/*     */ 
/*     */     
/* 224 */     long r = 0L;
/* 225 */     while (p < max) {
/* 226 */       r = r * 10L + (48 - s.charAt(p++));
/*     */     }
/* 228 */     if (mustCheck) {
/*     */       boolean isBig;
/* 230 */       if (r > -922337203685477580L) {
/* 231 */         isBig = false;
/* 232 */       } else if (r < -922337203685477580L) {
/* 233 */         isBig = true;
/*     */       }
/* 235 */       else if (neg) {
/* 236 */         isBig = (s.charAt(p) > '8');
/*     */       } else {
/* 238 */         isBig = (s.charAt(p) > '7');
/*     */       } 
/* 240 */       if (isBig)
/* 241 */         return new BigInteger(s, 10); 
/* 242 */       r = r * 10L + (48 - s.charAt(p));
/*     */     } 
/* 244 */     if (neg) {
/* 245 */       if (this.useIntegerStorage && r >= -2147483648L)
/* 246 */         return Integer.valueOf((int)r); 
/* 247 */       return Long.valueOf(r);
/*     */     } 
/* 249 */     r = -r;
/* 250 */     if (this.useIntegerStorage && r <= 2147483647L)
/* 251 */       return Integer.valueOf((int)r); 
/* 252 */     return Long.valueOf(r);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected <T> T readArray(JsonReaderI<T> mapper) throws ParseException, IOException {
/* 258 */     Object current = mapper.createArray();
/* 259 */     if (this.c != '[')
/* 260 */       throw new RuntimeException("Internal Error"); 
/* 261 */     read();
/* 262 */     boolean needData = false;
/*     */     
/* 264 */     if (this.c == ',' && !this.acceptUselessComma)
/* 265 */       throw new ParseException(this.pos, 0, Character.valueOf(this.c)); 
/*     */     while (true) {
/* 267 */       switch (this.c) {
/*     */         case '\t':
/*     */         case '\n':
/*     */         case '\r':
/*     */         case ' ':
/* 272 */           read();
/*     */           continue;
/*     */         case ']':
/* 275 */           if (needData && !this.acceptUselessComma)
/* 276 */             throw new ParseException(this.pos, 0, Character.valueOf(this.c)); 
/* 277 */           read();
/*     */           
/* 279 */           return (T)mapper.convert(current);
/*     */         case ':':
/*     */         case '}':
/* 282 */           throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */         case ',':
/* 284 */           if (needData && !this.acceptUselessComma)
/* 285 */             throw new ParseException(this.pos, 0, Character.valueOf(this.c)); 
/* 286 */           read();
/* 287 */           needData = true;
/*     */           continue;
/*     */         case '\032':
/* 290 */           throw new ParseException(this.pos - 1, 3, "EOF");
/*     */       } 
/* 292 */       mapper.addValue(current, readMain(mapper, stopArray));
/* 293 */       needData = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected <T> T readFirst(JsonReaderI<T> mapper) throws ParseException, IOException {
/*     */     while (true) {
/* 305 */       switch (this.c) {
/*     */         
/*     */         case '\t':
/*     */         case '\n':
/*     */         case '\r':
/*     */         case ' ':
/* 311 */           read();
/*     */           continue;
/*     */         
/*     */         case ':':
/*     */         case ']':
/*     */         case '}':
/* 317 */           throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */         
/*     */         case '{':
/* 320 */           return readObject(mapper);
/*     */         
/*     */         case '[':
/* 323 */           return readArray(mapper);
/*     */         
/*     */         case '"':
/*     */         case '\'':
/* 327 */           readString();
/*     */           
/* 329 */           return (T)mapper.convert(this.xs);
/*     */         
/*     */         case 'n':
/* 332 */           readNQString(stopX);
/* 333 */           if ("null".equals(this.xs))
/*     */           {
/* 335 */             return null;
/*     */           }
/* 337 */           if (!this.acceptNonQuote) {
/* 338 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 340 */           return (T)mapper.convert(this.xs);
/*     */         
/*     */         case 'f':
/* 343 */           readNQString(stopX);
/* 344 */           if ("false".equals(this.xs))
/*     */           {
/* 346 */             return (T)mapper.convert(Boolean.FALSE);
/*     */           }
/* 348 */           if (!this.acceptNonQuote) {
/* 349 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 351 */           return (T)mapper.convert(this.xs);
/*     */         
/*     */         case 't':
/* 354 */           readNQString(stopX);
/* 355 */           if ("true".equals(this.xs))
/*     */           {
/* 357 */             return (T)mapper.convert(Boolean.TRUE);
/*     */           }
/* 359 */           if (!this.acceptNonQuote) {
/* 360 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 362 */           return (T)mapper.convert(this.xs);
/*     */         
/*     */         case 'N':
/* 365 */           readNQString(stopX);
/* 366 */           if (!this.acceptNaN)
/* 367 */             throw new ParseException(this.pos, 1, this.xs); 
/* 368 */           if ("NaN".equals(this.xs))
/*     */           {
/* 370 */             return (T)mapper.convert(Float.valueOf(Float.NaN));
/*     */           }
/* 372 */           if (!this.acceptNonQuote) {
/* 373 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 375 */           return (T)mapper.convert(this.xs);
/*     */         
/*     */         case '-':
/*     */         case '0':
/*     */         case '1':
/*     */         case '2':
/*     */         case '3':
/*     */         case '4':
/*     */         case '5':
/*     */         case '6':
/*     */         case '7':
/*     */         case '8':
/*     */         case '9':
/* 388 */           this.xo = readNumber(stopX);
/*     */           
/* 390 */           return (T)mapper.convert(this.xo);
/*     */       }  break;
/* 392 */     }  readNQString(stopX);
/* 393 */     if (!this.acceptNonQuote) {
/* 394 */       throw new ParseException(this.pos, 1, this.xs);
/*     */     }
/* 396 */     return (T)mapper.convert(this.xs);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object readMain(JsonReaderI<?> mapper, boolean[] stop) throws ParseException, IOException {
/*     */     while (true) {
/* 407 */       switch (this.c) {
/*     */         
/*     */         case '\t':
/*     */         case '\n':
/*     */         case '\r':
/*     */         case ' ':
/* 413 */           read();
/*     */           continue;
/*     */         
/*     */         case ':':
/*     */         case ']':
/*     */         case '}':
/* 419 */           throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */         
/*     */         case '{':
/* 422 */           return readObject(mapper.startObject(this.lastKey));
/*     */         
/*     */         case '[':
/* 425 */           return readArray(mapper.startArray(this.lastKey));
/*     */         
/*     */         case '"':
/*     */         case '\'':
/* 429 */           readString();
/*     */           
/* 431 */           return this.xs;
/*     */         
/*     */         case 'n':
/* 434 */           readNQString(stop);
/* 435 */           if ("null".equals(this.xs))
/*     */           {
/* 437 */             return null;
/*     */           }
/* 439 */           if (!this.acceptNonQuote) {
/* 440 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 442 */           return this.xs;
/*     */         
/*     */         case 'f':
/* 445 */           readNQString(stop);
/* 446 */           if ("false".equals(this.xs))
/*     */           {
/* 448 */             return Boolean.FALSE;
/*     */           }
/* 450 */           if (!this.acceptNonQuote) {
/* 451 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 453 */           return this.xs;
/*     */         
/*     */         case 't':
/* 456 */           readNQString(stop);
/* 457 */           if ("true".equals(this.xs))
/*     */           {
/* 459 */             return Boolean.TRUE;
/*     */           }
/* 461 */           if (!this.acceptNonQuote) {
/* 462 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 464 */           return this.xs;
/*     */         
/*     */         case 'N':
/* 467 */           readNQString(stop);
/* 468 */           if (!this.acceptNaN)
/* 469 */             throw new ParseException(this.pos, 1, this.xs); 
/* 470 */           if ("NaN".equals(this.xs))
/*     */           {
/* 472 */             return Float.valueOf(Float.NaN);
/*     */           }
/* 474 */           if (!this.acceptNonQuote) {
/* 475 */             throw new ParseException(this.pos, 1, this.xs);
/*     */           }
/* 477 */           return this.xs;
/*     */ 
/*     */ 
/*     */         
/*     */         case '-':
/*     */         case '0':
/*     */         case '1':
/*     */         case '2':
/*     */         case '3':
/*     */         case '4':
/*     */         case '5':
/*     */         case '6':
/*     */         case '7':
/*     */         case '8':
/*     */         case '9':
/* 492 */           return readNumber(stop);
/*     */       }  break;
/* 494 */     }  readNQString(stop);
/* 495 */     if (!this.acceptNonQuote) {
/* 496 */       throw new ParseException(this.pos, 1, this.xs);
/*     */     }
/* 498 */     return this.xs;
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
/*     */   protected <T> T readObject(JsonReaderI<T> mapper) throws ParseException, IOException {
/* 511 */     if (this.c != '{')
/* 512 */       throw new RuntimeException("Internal Error"); 
/* 513 */     Object current = mapper.createObject();
/* 514 */     boolean needData = false;
/* 515 */     boolean acceptData = true;
/*     */     while (true) {
/* 517 */       read();
/* 518 */       switch (this.c) {
/*     */         case '\t':
/*     */         case '\n':
/*     */         case '\r':
/*     */         case ' ':
/*     */           continue;
/*     */         case ':':
/*     */         case '[':
/*     */         case ']':
/*     */         case '{':
/* 528 */           throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */         case '}':
/* 530 */           if (needData && !this.acceptUselessComma)
/* 531 */             throw new ParseException(this.pos, 0, Character.valueOf(this.c)); 
/* 532 */           read();
/*     */           
/* 534 */           return (T)mapper.convert(current);
/*     */         case ',':
/* 536 */           if (needData && !this.acceptUselessComma)
/* 537 */             throw new ParseException(this.pos, 0, Character.valueOf(this.c)); 
/* 538 */           acceptData = needData = true;
/*     */           continue;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 544 */       if (this.c == '"' || this.c == '\'') {
/* 545 */         readString();
/*     */       } else {
/* 547 */         readNQString(stopKey);
/* 548 */         if (!this.acceptNonQuote)
/* 549 */           throw new ParseException(this.pos, 1, this.xs); 
/*     */       } 
/* 551 */       String key = this.xs;
/* 552 */       if (!acceptData) {
/* 553 */         throw new ParseException(this.pos, 1, key);
/*     */       }
/*     */       
/* 556 */       skipSpace();
/*     */       
/* 558 */       if (this.c != ':') {
/* 559 */         if (this.c == '\032')
/* 560 */           throw new ParseException(this.pos - 1, 3, null); 
/* 561 */         throw new ParseException(this.pos - 1, 0, Character.valueOf(this.c));
/*     */       } 
/* 563 */       readNoEnd();
/* 564 */       this.lastKey = key;
/* 565 */       Object value = readMain(mapper, stopValue);
/* 566 */       mapper.setValue(current, key, value);
/* 567 */       this.lastKey = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 574 */       skipSpace();
/* 575 */       if (this.c == '}') {
/* 576 */         read();
/*     */         
/* 578 */         return (T)mapper.convert(current);
/*     */       } 
/* 580 */       if (this.c == '\032') {
/* 581 */         throw new ParseException(this.pos - 1, 3, null);
/*     */       }
/* 583 */       if (this.c == ',') {
/* 584 */         acceptData = needData = true; continue;
/*     */       }  break;
/* 586 */     }  throw new ParseException(this.pos - 1, 1, Character.valueOf(this.c));
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
/*     */   protected void readString2() throws ParseException, IOException {
/* 601 */     char sep = this.c;
/*     */     while (true) {
/* 603 */       read();
/* 604 */       switch (this.c) {
/*     */         case '\032':
/* 606 */           throw new ParseException(this.pos - 1, 3, null);
/*     */         case '"':
/*     */         case '\'':
/* 609 */           if (sep == this.c) {
/* 610 */             read();
/* 611 */             this.xs = this.sb.toString();
/*     */             return;
/*     */           } 
/* 614 */           this.sb.append(this.c);
/*     */           continue;
/*     */         case '\\':
/* 617 */           read();
/* 618 */           switch (this.c) {
/*     */             case 't':
/* 620 */               this.sb.append('\t');
/*     */               continue;
/*     */             case 'n':
/* 623 */               this.sb.append('\n');
/*     */               continue;
/*     */             case 'r':
/* 626 */               this.sb.append('\r');
/*     */               continue;
/*     */             case 'f':
/* 629 */               this.sb.append('\f');
/*     */               continue;
/*     */             case 'b':
/* 632 */               this.sb.append('\b');
/*     */               continue;
/*     */             case '\\':
/* 635 */               this.sb.append('\\');
/*     */               continue;
/*     */             case '/':
/* 638 */               this.sb.append('/');
/*     */               continue;
/*     */             case '\'':
/* 641 */               this.sb.append('\'');
/*     */               continue;
/*     */             case '"':
/* 644 */               this.sb.append('"');
/*     */               continue;
/*     */             case 'u':
/* 647 */               this.sb.append(readUnicode(4));
/*     */               continue;
/*     */             case 'x':
/* 650 */               this.sb.append(readUnicode(2));
/*     */               continue;
/*     */           } 
/*     */ 
/*     */           
/*     */           continue;
/*     */         
/*     */         case '\000':
/*     */         case '\001':
/*     */         case '\002':
/*     */         case '\003':
/*     */         case '\004':
/*     */         case '\005':
/*     */         case '\006':
/*     */         case '\007':
/*     */         case '\b':
/*     */         case '\t':
/*     */         case '\n':
/*     */         case '\013':
/*     */         case '\f':
/*     */         case '\r':
/*     */         case '\016':
/*     */         case '\017':
/*     */         case '\020':
/*     */         case '\021':
/*     */         case '\022':
/*     */         case '\023':
/*     */         case '\024':
/*     */         case '\025':
/*     */         case '\026':
/*     */         case '\027':
/*     */         case '\030':
/*     */         case '\031':
/*     */         case '\033':
/*     */         case '\034':
/*     */         case '\035':
/*     */         case '\036':
/*     */         case '\037':
/* 688 */           if (this.ignoreControlChar)
/*     */             continue; 
/* 690 */           throw new ParseException(this.pos, 0, Character.valueOf(this.c));
/*     */         case '':
/* 692 */           if (this.ignoreControlChar)
/*     */             continue; 
/* 694 */           if (this.reject127)
/* 695 */             throw new ParseException(this.pos, 0, Character.valueOf(this.c));  break;
/*     */       } 
/* 697 */       this.sb.append(this.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected char readUnicode(int totalChars) throws ParseException, IOException {
/* 703 */     int value = 0;
/* 704 */     for (int i = 0; i < totalChars; i++) {
/* 705 */       value *= 16;
/* 706 */       read();
/* 707 */       if (this.c <= '9' && this.c >= '0')
/* 708 */       { value += this.c - 48; }
/* 709 */       else if (this.c <= 'F' && this.c >= 'A')
/* 710 */       { value += this.c - 65 + 10; }
/* 711 */       else if (this.c >= 'a' && this.c <= 'f')
/* 712 */       { value += this.c - 97 + 10; }
/* 713 */       else { if (this.c == '\032') {
/* 714 */           throw new ParseException(this.pos, 3, "EOF");
/*     */         }
/* 716 */         throw new ParseException(this.pos, 4, Character.valueOf(this.c)); }
/*     */     
/* 718 */     }  return (char)value;
/*     */   }
/*     */   
/*     */   protected void skipDigits() throws IOException {
/*     */     while (true) {
/* 723 */       if (this.c < '0' || this.c > '9')
/*     */         return; 
/* 725 */       readS();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void skipNQString(boolean[] stop) throws IOException {
/*     */     while (true) {
/* 731 */       if (this.c == '\032' || (this.c >= '\000' && this.c < '~' && stop[this.c]))
/*     */         return; 
/* 733 */       readS();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void skipSpace() throws IOException {
/*     */     while (true) {
/* 739 */       if (this.c > ' ' || this.c == '\032')
/*     */         return; 
/* 741 */       readS();
/*     */     } 
/*     */   } protected abstract void read() throws IOException; protected abstract void readNoEnd() throws ParseException, IOException;
/*     */   protected abstract void readNQString(boolean[] paramArrayOfboolean) throws IOException;
/*     */   protected abstract Object readNumber(boolean[] paramArrayOfboolean) throws ParseException, IOException;
/*     */   abstract void readS() throws IOException;
/*     */   protected abstract void readString() throws ParseException, IOException;
/*     */   public static class MSB { char[] b;
/*     */     public MSB(int size) {
/* 750 */       this.b = new char[size];
/* 751 */       this.p = -1;
/*     */     }
/*     */     int p;
/*     */     public void append(char c) {
/* 755 */       this.p++;
/* 756 */       if (this.b.length <= this.p) {
/* 757 */         char[] t = new char[this.b.length * 2 + 1];
/* 758 */         System.arraycopy(this.b, 0, t, 0, this.b.length);
/* 759 */         this.b = t;
/*     */       } 
/* 761 */       this.b[this.p] = c;
/*     */     }
/*     */     
/*     */     public void append(int c) {
/* 765 */       this.p++;
/* 766 */       if (this.b.length <= this.p) {
/* 767 */         char[] t = new char[this.b.length * 2 + 1];
/* 768 */         System.arraycopy(this.b, 0, t, 0, this.b.length);
/* 769 */         this.b = t;
/*     */       } 
/* 771 */       this.b[this.p] = (char)c;
/*     */     }
/*     */     
/*     */     public String toString() {
/* 775 */       return new String(this.b, 0, this.p + 1);
/*     */     }
/*     */     
/*     */     public void clear() {
/* 779 */       this.p = -1;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\JSONParserBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */