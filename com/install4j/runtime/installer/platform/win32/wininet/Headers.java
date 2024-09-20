/*     */ package com.install4j.runtime.installer.platform.win32.wininet;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ class Headers {
/*   9 */   private final Map<String, List<String>> lowerCaseHeaders = new LinkedHashMap<>();
/*  10 */   private final Map<String, List<String>> headers = new LinkedHashMap<>();
/*     */   private String message;
/*  12 */   private int code = -1;
/*     */   
/*     */   public Map<String, List<String>> getHeaders() {
/*  15 */     return this.headers;
/*     */   }
/*     */   
/*     */   public Map<String, List<String>> getLowerCaseHeaders() {
/*  19 */     return this.lowerCaseHeaders;
/*     */   }
/*     */   
/*     */   public String getMessage() {
/*  23 */     return this.message;
/*     */   }
/*     */   
/*     */   public int getCode() {
/*  27 */     return this.code;
/*     */   }
/*     */   
/*     */   public void clear() {
/*  31 */     this.code = -1;
/*  32 */     this.message = null;
/*  33 */     this.lowerCaseHeaders.clear();
/*  34 */     this.headers.clear();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void parse(byte[] data) throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnonnull -> 5
/*     */     //   4: return
/*     */     //   5: new java/io/ByteArrayInputStream
/*     */     //   8: dup
/*     */     //   9: aload_1
/*     */     //   10: invokespecial <init> : ([B)V
/*     */     //   13: astore_2
/*     */     //   14: bipush #10
/*     */     //   16: newarray char
/*     */     //   18: astore_3
/*     */     //   19: aload_2
/*     */     //   20: invokevirtual read : ()I
/*     */     //   23: istore #4
/*     */     //   25: iload #4
/*     */     //   27: bipush #10
/*     */     //   29: if_icmpeq -> 449
/*     */     //   32: iload #4
/*     */     //   34: bipush #13
/*     */     //   36: if_icmpeq -> 449
/*     */     //   39: iload #4
/*     */     //   41: iflt -> 449
/*     */     //   44: iconst_0
/*     */     //   45: istore #5
/*     */     //   47: iconst_m1
/*     */     //   48: istore #6
/*     */     //   50: iload #4
/*     */     //   52: bipush #32
/*     */     //   54: if_icmple -> 61
/*     */     //   57: iconst_1
/*     */     //   58: goto -> 62
/*     */     //   61: iconst_0
/*     */     //   62: istore #8
/*     */     //   64: aload_3
/*     */     //   65: iload #5
/*     */     //   67: iinc #5, 1
/*     */     //   70: iload #4
/*     */     //   72: i2c
/*     */     //   73: castore
/*     */     //   74: aload_2
/*     */     //   75: invokevirtual read : ()I
/*     */     //   78: dup
/*     */     //   79: istore #7
/*     */     //   81: iflt -> 274
/*     */     //   84: iload #7
/*     */     //   86: lookupswitch default -> 233, 9 -> 156, 10 -> 166, 13 -> 166, 32 -> 160, 58 -> 136
/*     */     //   136: iload #8
/*     */     //   138: ifeq -> 150
/*     */     //   141: iload #5
/*     */     //   143: ifle -> 150
/*     */     //   146: iload #5
/*     */     //   148: istore #6
/*     */     //   150: iconst_0
/*     */     //   151: istore #8
/*     */     //   153: goto -> 233
/*     */     //   156: bipush #32
/*     */     //   158: istore #7
/*     */     //   160: iconst_0
/*     */     //   161: istore #8
/*     */     //   163: goto -> 233
/*     */     //   166: aload_2
/*     */     //   167: invokevirtual read : ()I
/*     */     //   170: istore #4
/*     */     //   172: iload #7
/*     */     //   174: bipush #13
/*     */     //   176: if_icmpne -> 205
/*     */     //   179: iload #4
/*     */     //   181: bipush #10
/*     */     //   183: if_icmpne -> 205
/*     */     //   186: aload_2
/*     */     //   187: invokevirtual read : ()I
/*     */     //   190: istore #4
/*     */     //   192: iload #4
/*     */     //   194: bipush #13
/*     */     //   196: if_icmpne -> 205
/*     */     //   199: aload_2
/*     */     //   200: invokevirtual read : ()I
/*     */     //   203: istore #4
/*     */     //   205: iload #4
/*     */     //   207: bipush #10
/*     */     //   209: if_icmpeq -> 277
/*     */     //   212: iload #4
/*     */     //   214: bipush #13
/*     */     //   216: if_icmpeq -> 277
/*     */     //   219: iload #4
/*     */     //   221: bipush #32
/*     */     //   223: if_icmple -> 229
/*     */     //   226: goto -> 277
/*     */     //   229: bipush #32
/*     */     //   231: istore #7
/*     */     //   233: iload #5
/*     */     //   235: aload_3
/*     */     //   236: arraylength
/*     */     //   237: if_icmplt -> 261
/*     */     //   240: aload_3
/*     */     //   241: arraylength
/*     */     //   242: iconst_2
/*     */     //   243: imul
/*     */     //   244: newarray char
/*     */     //   246: astore #9
/*     */     //   248: aload_3
/*     */     //   249: iconst_0
/*     */     //   250: aload #9
/*     */     //   252: iconst_0
/*     */     //   253: iload #5
/*     */     //   255: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   258: aload #9
/*     */     //   260: astore_3
/*     */     //   261: aload_3
/*     */     //   262: iload #5
/*     */     //   264: iinc #5, 1
/*     */     //   267: iload #7
/*     */     //   269: i2c
/*     */     //   270: castore
/*     */     //   271: goto -> 74
/*     */     //   274: iconst_m1
/*     */     //   275: istore #4
/*     */     //   277: iload #5
/*     */     //   279: ifle -> 299
/*     */     //   282: aload_3
/*     */     //   283: iload #5
/*     */     //   285: iconst_1
/*     */     //   286: isub
/*     */     //   287: caload
/*     */     //   288: bipush #32
/*     */     //   290: if_icmpgt -> 299
/*     */     //   293: iinc #5, -1
/*     */     //   296: goto -> 277
/*     */     //   299: iload #6
/*     */     //   301: ifgt -> 313
/*     */     //   304: aconst_null
/*     */     //   305: astore #9
/*     */     //   307: iconst_0
/*     */     //   308: istore #6
/*     */     //   310: goto -> 363
/*     */     //   313: aload_3
/*     */     //   314: iconst_0
/*     */     //   315: iload #6
/*     */     //   317: invokestatic copyValueOf : ([CII)Ljava/lang/String;
/*     */     //   320: astore #9
/*     */     //   322: iload #6
/*     */     //   324: iload #5
/*     */     //   326: if_icmpge -> 341
/*     */     //   329: aload_3
/*     */     //   330: iload #6
/*     */     //   332: caload
/*     */     //   333: bipush #58
/*     */     //   335: if_icmpne -> 341
/*     */     //   338: iinc #6, 1
/*     */     //   341: iload #6
/*     */     //   343: iload #5
/*     */     //   345: if_icmpge -> 363
/*     */     //   348: aload_3
/*     */     //   349: iload #6
/*     */     //   351: caload
/*     */     //   352: bipush #32
/*     */     //   354: if_icmpgt -> 363
/*     */     //   357: iinc #6, 1
/*     */     //   360: goto -> 341
/*     */     //   363: iload #6
/*     */     //   365: iload #5
/*     */     //   367: if_icmplt -> 377
/*     */     //   370: ldc ''
/*     */     //   372: astore #10
/*     */     //   374: goto -> 390
/*     */     //   377: aload_3
/*     */     //   378: iload #6
/*     */     //   380: iload #5
/*     */     //   382: iload #6
/*     */     //   384: isub
/*     */     //   385: invokestatic copyValueOf : ([CII)Ljava/lang/String;
/*     */     //   388: astore #10
/*     */     //   390: aload #9
/*     */     //   392: ifnonnull -> 416
/*     */     //   395: aload_0
/*     */     //   396: getfield headers : Ljava/util/Map;
/*     */     //   399: invokeinterface isEmpty : ()Z
/*     */     //   404: ifeq -> 446
/*     */     //   407: aload_0
/*     */     //   408: aload #10
/*     */     //   410: invokespecial parseStatusLine : (Ljava/lang/String;)V
/*     */     //   413: goto -> 446
/*     */     //   416: aload_0
/*     */     //   417: aload #9
/*     */     //   419: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   422: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   425: aload #10
/*     */     //   427: aload_0
/*     */     //   428: getfield lowerCaseHeaders : Ljava/util/Map;
/*     */     //   431: invokespecial addHeaderValue : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
/*     */     //   434: aload_0
/*     */     //   435: aload #9
/*     */     //   437: aload #10
/*     */     //   439: aload_0
/*     */     //   440: getfield headers : Ljava/util/Map;
/*     */     //   443: invokespecial addHeaderValue : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
/*     */     //   446: goto -> 25
/*     */     //   449: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 0
/*     */     //   #39	-> 4
/*     */     //   #41	-> 5
/*     */     //   #42	-> 14
/*     */     //   #43	-> 19
/*     */     //   #44	-> 25
/*     */     //   #45	-> 44
/*     */     //   #46	-> 47
/*     */     //   #48	-> 50
/*     */     //   #49	-> 64
/*     */     //   #51	-> 74
/*     */     //   #52	-> 84
/*     */     //   #54	-> 136
/*     */     //   #55	-> 146
/*     */     //   #57	-> 150
/*     */     //   #58	-> 153
/*     */     //   #60	-> 156
/*     */     //   #63	-> 160
/*     */     //   #64	-> 163
/*     */     //   #67	-> 166
/*     */     //   #68	-> 172
/*     */     //   #69	-> 186
/*     */     //   #70	-> 192
/*     */     //   #71	-> 199
/*     */     //   #74	-> 205
/*     */     //   #75	-> 226
/*     */     //   #77	-> 229
/*     */     //   #80	-> 233
/*     */     //   #81	-> 240
/*     */     //   #82	-> 248
/*     */     //   #83	-> 258
/*     */     //   #85	-> 261
/*     */     //   #87	-> 274
/*     */     //   #89	-> 277
/*     */     //   #90	-> 293
/*     */     //   #93	-> 299
/*     */     //   #94	-> 304
/*     */     //   #95	-> 307
/*     */     //   #97	-> 313
/*     */     //   #98	-> 322
/*     */     //   #99	-> 338
/*     */     //   #101	-> 341
/*     */     //   #102	-> 357
/*     */     //   #106	-> 363
/*     */     //   #107	-> 370
/*     */     //   #109	-> 377
/*     */     //   #112	-> 390
/*     */     //   #113	-> 395
/*     */     //   #114	-> 407
/*     */     //   #117	-> 416
/*     */     //   #118	-> 434
/*     */     //   #120	-> 446
/*     */     //   #121	-> 449
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   248	13	9	ns	[C
/*     */     //   307	6	9	key	Ljava/lang/String;
/*     */     //   374	3	10	value	Ljava/lang/String;
/*     */     //   47	399	5	length	I
/*     */     //   50	396	6	keyEndPos	I
/*     */     //   81	365	7	currentChar	I
/*     */     //   64	382	8	inKey	Z
/*     */     //   322	124	9	key	Ljava/lang/String;
/*     */     //   390	56	10	value	Ljava/lang/String;
/*     */     //   0	450	0	this	Lcom/install4j/runtime/installer/platform/win32/wininet/Headers;
/*     */     //   0	450	1	data	[B
/*     */     //   14	436	2	input	Ljava/io/InputStream;
/*     */     //   19	431	3	s	[C
/*     */     //   25	425	4	firstChar	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void addHeaderValue(String key, String value, Map<String, List<String>> headers) {
/* 124 */     ((List<String>)headers.computeIfAbsent(key, k -> new ArrayList())).add(value);
/*     */   }
/*     */   
/*     */   private void parseStatusLine(String statusLine) {
/* 128 */     if (statusLine != null && statusLine.startsWith("HTTP/1.")) {
/* 129 */       int spacePos = statusLine.indexOf(' ');
/* 130 */       if (spacePos > 0) {
/* 131 */         int messagePos = statusLine.indexOf(' ', spacePos + 1);
/* 132 */         if (messagePos > 0 && messagePos < statusLine.length()) {
/* 133 */           this.message = statusLine.substring(messagePos + 1);
/*     */         }
/*     */         
/* 136 */         if (messagePos < 0) {
/* 137 */           messagePos = statusLine.length();
/*     */         }
/*     */         
/*     */         try {
/* 141 */           this.code = Integer.parseInt(statusLine.substring(spacePos + 1, messagePos));
/* 142 */         } catch (NumberFormatException numberFormatException) {}
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 150 */     return "Headers{headers=" + this.headers + ", message='" + this.message + '\'' + ", code=" + this.code + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\Headers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */