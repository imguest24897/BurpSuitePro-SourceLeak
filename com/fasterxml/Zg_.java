package com.fasterxml;

public enum Zg_ {
  NONE, CLASS, MINIMAL_CLASS, NAME, SIMPLE_NAME, DEDUCTION, CUSTOM;
  
  private final String Zw;
  
  private static final Zg_[] ZE;
  
  Zg_(String paramString1) {
    this.Zw = paramString1;
  }
  
  public String ZY() {
    return this.Zw;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '\}?@wWeAu?U\\rB}<YvSvPw>QhAOWAu?UA{<UOWqHaLx3ChO@`^La!Dt_'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #11
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #101
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'z@tIwBqK~q:Qo'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #9
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #84
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #106
    //   202: goto -> 232
    //   205: bipush #81
    //   207: goto -> 232
    //   210: bipush #23
    //   212: goto -> 232
    //   215: bipush #117
    //   217: goto -> 232
    //   220: bipush #94
    //   222: goto -> 232
    //   225: bipush #119
    //   227: goto -> 232
    //   230: bipush #95
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: new com/fasterxml/Zg_
    //   291: dup
    //   292: aload_0
    //   293: iconst_4
    //   294: aaload
    //   295: iconst_0
    //   296: aconst_null
    //   297: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   300: putstatic com/fasterxml/Zg_.NONE : Lcom/fasterxml/Zg_;
    //   303: new com/fasterxml/Zg_
    //   306: dup
    //   307: aload_0
    //   308: bipush #6
    //   310: aaload
    //   311: iconst_1
    //   312: aload_0
    //   313: iconst_5
    //   314: aaload
    //   315: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   318: putstatic com/fasterxml/Zg_.CLASS : Lcom/fasterxml/Zg_;
    //   321: new com/fasterxml/Zg_
    //   324: dup
    //   325: aload_0
    //   326: iconst_1
    //   327: aaload
    //   328: iconst_2
    //   329: aload_0
    //   330: iconst_2
    //   331: aaload
    //   332: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   335: putstatic com/fasterxml/Zg_.MINIMAL_CLASS : Lcom/fasterxml/Zg_;
    //   338: new com/fasterxml/Zg_
    //   341: dup
    //   342: aload_0
    //   343: iconst_3
    //   344: aaload
    //   345: iconst_3
    //   346: aload_0
    //   347: bipush #10
    //   349: aaload
    //   350: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   353: putstatic com/fasterxml/Zg_.NAME : Lcom/fasterxml/Zg_;
    //   356: new com/fasterxml/Zg_
    //   359: dup
    //   360: aload_0
    //   361: iconst_0
    //   362: aaload
    //   363: iconst_4
    //   364: aload_0
    //   365: bipush #7
    //   367: aaload
    //   368: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   371: putstatic com/fasterxml/Zg_.SIMPLE_NAME : Lcom/fasterxml/Zg_;
    //   374: new com/fasterxml/Zg_
    //   377: dup
    //   378: aload_0
    //   379: bipush #9
    //   381: aaload
    //   382: iconst_5
    //   383: aconst_null
    //   384: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   387: putstatic com/fasterxml/Zg_.DEDUCTION : Lcom/fasterxml/Zg_;
    //   390: new com/fasterxml/Zg_
    //   393: dup
    //   394: aload_0
    //   395: bipush #8
    //   397: aaload
    //   398: bipush #6
    //   400: aconst_null
    //   401: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   404: putstatic com/fasterxml/Zg_.CUSTOM : Lcom/fasterxml/Zg_;
    //   407: bipush #7
    //   409: anewarray com/fasterxml/Zg_
    //   412: dup
    //   413: iconst_0
    //   414: getstatic com/fasterxml/Zg_.NONE : Lcom/fasterxml/Zg_;
    //   417: aastore
    //   418: dup
    //   419: iconst_1
    //   420: getstatic com/fasterxml/Zg_.CLASS : Lcom/fasterxml/Zg_;
    //   423: aastore
    //   424: dup
    //   425: iconst_2
    //   426: getstatic com/fasterxml/Zg_.MINIMAL_CLASS : Lcom/fasterxml/Zg_;
    //   429: aastore
    //   430: dup
    //   431: iconst_3
    //   432: getstatic com/fasterxml/Zg_.NAME : Lcom/fasterxml/Zg_;
    //   435: aastore
    //   436: dup
    //   437: iconst_4
    //   438: getstatic com/fasterxml/Zg_.SIMPLE_NAME : Lcom/fasterxml/Zg_;
    //   441: aastore
    //   442: dup
    //   443: iconst_5
    //   444: getstatic com/fasterxml/Zg_.DEDUCTION : Lcom/fasterxml/Zg_;
    //   447: aastore
    //   448: dup
    //   449: bipush #6
    //   451: getstatic com/fasterxml/Zg_.CUSTOM : Lcom/fasterxml/Zg_;
    //   454: aastore
    //   455: putstatic com/fasterxml/Zg_.ZE : [Lcom/fasterxml/Zg_;
    //   458: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */