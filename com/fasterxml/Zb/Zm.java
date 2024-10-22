package com.fasterxml.Zb;

public enum Zm {
  AUTO_CLOSE_SOURCE, ALLOW_COMMENTS, ALLOW_YAML_COMMENTS, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_NUMERIC_LEADING_ZEROS, ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS, ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS, ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS, ALLOW_NON_NUMERIC_NUMBERS, ALLOW_MISSING_VALUES, ALLOW_TRAILING_COMMA, STRICT_DUPLICATE_DETECTION, IGNORE_UNDEFINED, INCLUDE_SOURCE_IN_LOCATION, USE_FAST_DOUBLE_PARSER, USE_FAST_BIG_NUMBER_PARSER;
  
  private final boolean ZT;
  
  private final int Zm = 1 << ordinal();
  
  private static final Zm[] ZZ;
  
  public static int Zb() {
    int i = 0;
    for (Zm zm : values()) {
      if (zm.ZA())
        i |= zm.Zi(); 
    } 
    return i;
  }
  
  Zm(boolean paramBoolean) {
    this.ZT = paramBoolean;
  }
  
  public boolean ZA() {
    return this.ZT;
  }
  
  public boolean Zi(int paramInt) {
    return ((paramInt & this.Zm) != 0);
  }
  
  public int Zi() {
    return this.Zm;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'o'ivr>jl\\be"rmb&mo'ivn&p}v?aj p.mf`.o'ivn'}ff%\\rmo'ivb"wg`$sho'ivm,{v\\tl?m'o'iv b/pnf(sh s$p}l9p|f9\\nw9}}v;wj\\r\\bf4{}\\tw"p(o'ivb"wgg.wd\\r|;wge$aga.m\\tp.xh\\b|)yv\\tn)lvq8lm(km\\tp$\\flj\\tj%rfw"p#o'iv b/pn\\fo>\\nazm4q{v&{{d%ll\\tm/x`g\\tp.xh\\b|/kk |;lz\\to'iv\\tn.wjf*wgy.qz&o'iv` \\nrh|.\\n}hm,g`#lh\\bf9o'ivm4kd\\tj(p|f9\\n'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #26
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #95
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
    //   68: ldc 'f\m\\rbi\\tEmsx_l xkSj df\m\\rznCkhq\w '
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #28
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #36
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
    //   146: if_icmpgt -> 247
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 229, 0 -> 200, 1 -> 204, 2 -> 209, 3 -> 214, 4 -> 219, 5 -> 224
    //   200: iconst_3
    //   201: goto -> 231
    //   204: bipush #124
    //   206: goto -> 231
    //   209: bipush #52
    //   211: goto -> 231
    //   214: bipush #6
    //   216: goto -> 231
    //   219: bipush #97
    //   221: goto -> 231
    //   224: bipush #118
    //   226: goto -> 231
    //   229: bipush #19
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 153
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 149
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 40, 0 -> 99
    //   288: new com/fasterxml/Zb/Zm
    //   291: dup
    //   292: aload_0
    //   293: iconst_2
    //   294: aaload
    //   295: iconst_0
    //   296: iconst_1
    //   297: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   300: putstatic com/fasterxml/Zb/Zm.AUTO_CLOSE_SOURCE : Lcom/fasterxml/Zb/Zm;
    //   303: new com/fasterxml/Zb/Zm
    //   306: dup
    //   307: aload_0
    //   308: iconst_1
    //   309: aaload
    //   310: iconst_1
    //   311: iconst_0
    //   312: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   315: putstatic com/fasterxml/Zb/Zm.ALLOW_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   318: new com/fasterxml/Zb/Zm
    //   321: dup
    //   322: aload_0
    //   323: iconst_3
    //   324: aaload
    //   325: iconst_2
    //   326: iconst_0
    //   327: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   330: putstatic com/fasterxml/Zb/Zm.ALLOW_YAML_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   333: new com/fasterxml/Zb/Zm
    //   336: dup
    //   337: aload_0
    //   338: iconst_0
    //   339: aaload
    //   340: iconst_3
    //   341: iconst_0
    //   342: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   345: putstatic com/fasterxml/Zb/Zm.ALLOW_UNQUOTED_FIELD_NAMES : Lcom/fasterxml/Zb/Zm;
    //   348: new com/fasterxml/Zb/Zm
    //   351: dup
    //   352: aload_0
    //   353: iconst_5
    //   354: aaload
    //   355: iconst_4
    //   356: iconst_0
    //   357: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   360: putstatic com/fasterxml/Zb/Zm.ALLOW_SINGLE_QUOTES : Lcom/fasterxml/Zb/Zm;
    //   363: new com/fasterxml/Zb/Zm
    //   366: dup
    //   367: aload_0
    //   368: bipush #17
    //   370: aaload
    //   371: iconst_5
    //   372: iconst_0
    //   373: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   376: putstatic com/fasterxml/Zb/Zm.ALLOW_UNQUOTED_CONTROL_CHARS : Lcom/fasterxml/Zb/Zm;
    //   379: new com/fasterxml/Zb/Zm
    //   382: dup
    //   383: aload_0
    //   384: bipush #15
    //   386: aaload
    //   387: bipush #6
    //   389: iconst_0
    //   390: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   393: putstatic com/fasterxml/Zb/Zm.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER : Lcom/fasterxml/Zb/Zm;
    //   396: new com/fasterxml/Zb/Zm
    //   399: dup
    //   400: aload_0
    //   401: bipush #14
    //   403: aaload
    //   404: bipush #7
    //   406: iconst_0
    //   407: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   410: putstatic com/fasterxml/Zb/Zm.ALLOW_NUMERIC_LEADING_ZEROS : Lcom/fasterxml/Zb/Zm;
    //   413: new com/fasterxml/Zb/Zm
    //   416: dup
    //   417: aload_0
    //   418: bipush #11
    //   420: aaload
    //   421: bipush #8
    //   423: iconst_0
    //   424: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   427: putstatic com/fasterxml/Zb/Zm.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   430: new com/fasterxml/Zb/Zm
    //   433: dup
    //   434: aload_0
    //   435: bipush #6
    //   437: aaload
    //   438: bipush #9
    //   440: iconst_0
    //   441: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   444: putstatic com/fasterxml/Zb/Zm.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   447: new com/fasterxml/Zb/Zm
    //   450: dup
    //   451: aload_0
    //   452: bipush #8
    //   454: aaload
    //   455: bipush #10
    //   457: iconst_0
    //   458: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   461: putstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   464: new com/fasterxml/Zb/Zm
    //   467: dup
    //   468: aload_0
    //   469: bipush #16
    //   471: aaload
    //   472: bipush #11
    //   474: iconst_0
    //   475: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   478: putstatic com/fasterxml/Zb/Zm.ALLOW_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   481: new com/fasterxml/Zb/Zm
    //   484: dup
    //   485: aload_0
    //   486: bipush #18
    //   488: aaload
    //   489: bipush #12
    //   491: iconst_0
    //   492: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   495: putstatic com/fasterxml/Zb/Zm.ALLOW_MISSING_VALUES : Lcom/fasterxml/Zb/Zm;
    //   498: new com/fasterxml/Zb/Zm
    //   501: dup
    //   502: aload_0
    //   503: iconst_4
    //   504: aaload
    //   505: bipush #13
    //   507: iconst_0
    //   508: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   511: putstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_COMMA : Lcom/fasterxml/Zb/Zm;
    //   514: new com/fasterxml/Zb/Zm
    //   517: dup
    //   518: aload_0
    //   519: bipush #7
    //   521: aaload
    //   522: bipush #14
    //   524: iconst_0
    //   525: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   528: putstatic com/fasterxml/Zb/Zm.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zm;
    //   531: new com/fasterxml/Zb/Zm
    //   534: dup
    //   535: aload_0
    //   536: bipush #12
    //   538: aaload
    //   539: bipush #15
    //   541: iconst_0
    //   542: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   545: putstatic com/fasterxml/Zb/Zm.IGNORE_UNDEFINED : Lcom/fasterxml/Zb/Zm;
    //   548: new com/fasterxml/Zb/Zm
    //   551: dup
    //   552: aload_0
    //   553: bipush #10
    //   555: aaload
    //   556: bipush #16
    //   558: iconst_0
    //   559: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   562: putstatic com/fasterxml/Zb/Zm.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zm;
    //   565: new com/fasterxml/Zb/Zm
    //   568: dup
    //   569: aload_0
    //   570: bipush #13
    //   572: aaload
    //   573: bipush #17
    //   575: iconst_0
    //   576: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   579: putstatic com/fasterxml/Zb/Zm.USE_FAST_DOUBLE_PARSER : Lcom/fasterxml/Zb/Zm;
    //   582: new com/fasterxml/Zb/Zm
    //   585: dup
    //   586: aload_0
    //   587: bipush #9
    //   589: aaload
    //   590: bipush #18
    //   592: iconst_0
    //   593: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   596: putstatic com/fasterxml/Zb/Zm.USE_FAST_BIG_NUMBER_PARSER : Lcom/fasterxml/Zb/Zm;
    //   599: bipush #19
    //   601: anewarray com/fasterxml/Zb/Zm
    //   604: dup
    //   605: iconst_0
    //   606: getstatic com/fasterxml/Zb/Zm.AUTO_CLOSE_SOURCE : Lcom/fasterxml/Zb/Zm;
    //   609: aastore
    //   610: dup
    //   611: iconst_1
    //   612: getstatic com/fasterxml/Zb/Zm.ALLOW_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   615: aastore
    //   616: dup
    //   617: iconst_2
    //   618: getstatic com/fasterxml/Zb/Zm.ALLOW_YAML_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   621: aastore
    //   622: dup
    //   623: iconst_3
    //   624: getstatic com/fasterxml/Zb/Zm.ALLOW_UNQUOTED_FIELD_NAMES : Lcom/fasterxml/Zb/Zm;
    //   627: aastore
    //   628: dup
    //   629: iconst_4
    //   630: getstatic com/fasterxml/Zb/Zm.ALLOW_SINGLE_QUOTES : Lcom/fasterxml/Zb/Zm;
    //   633: aastore
    //   634: dup
    //   635: iconst_5
    //   636: getstatic com/fasterxml/Zb/Zm.ALLOW_UNQUOTED_CONTROL_CHARS : Lcom/fasterxml/Zb/Zm;
    //   639: aastore
    //   640: dup
    //   641: bipush #6
    //   643: getstatic com/fasterxml/Zb/Zm.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER : Lcom/fasterxml/Zb/Zm;
    //   646: aastore
    //   647: dup
    //   648: bipush #7
    //   650: getstatic com/fasterxml/Zb/Zm.ALLOW_NUMERIC_LEADING_ZEROS : Lcom/fasterxml/Zb/Zm;
    //   653: aastore
    //   654: dup
    //   655: bipush #8
    //   657: getstatic com/fasterxml/Zb/Zm.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   660: aastore
    //   661: dup
    //   662: bipush #9
    //   664: getstatic com/fasterxml/Zb/Zm.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   667: aastore
    //   668: dup
    //   669: bipush #10
    //   671: getstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   674: aastore
    //   675: dup
    //   676: bipush #11
    //   678: getstatic com/fasterxml/Zb/Zm.ALLOW_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   681: aastore
    //   682: dup
    //   683: bipush #12
    //   685: getstatic com/fasterxml/Zb/Zm.ALLOW_MISSING_VALUES : Lcom/fasterxml/Zb/Zm;
    //   688: aastore
    //   689: dup
    //   690: bipush #13
    //   692: getstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_COMMA : Lcom/fasterxml/Zb/Zm;
    //   695: aastore
    //   696: dup
    //   697: bipush #14
    //   699: getstatic com/fasterxml/Zb/Zm.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zm;
    //   702: aastore
    //   703: dup
    //   704: bipush #15
    //   706: getstatic com/fasterxml/Zb/Zm.IGNORE_UNDEFINED : Lcom/fasterxml/Zb/Zm;
    //   709: aastore
    //   710: dup
    //   711: bipush #16
    //   713: getstatic com/fasterxml/Zb/Zm.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zm;
    //   716: aastore
    //   717: dup
    //   718: bipush #17
    //   720: getstatic com/fasterxml/Zb/Zm.USE_FAST_DOUBLE_PARSER : Lcom/fasterxml/Zb/Zm;
    //   723: aastore
    //   724: dup
    //   725: bipush #18
    //   727: getstatic com/fasterxml/Zb/Zm.USE_FAST_BIG_NUMBER_PARSER : Lcom/fasterxml/Zb/Zm;
    //   730: aastore
    //   731: putstatic com/fasterxml/Zb/Zm.ZZ : [Lcom/fasterxml/Zb/Zm;
    //   734: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */