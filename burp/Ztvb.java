package burp;

interface Ztvb {
  public static final String[][] Zx;
  
  void Zz(Zm82 paramZm82, Zzv5 paramZzv5);
  
  int Zi();
  
  boolean Zm();
  
  boolean ZR();
  
  byte Zr();
  
  String Zv();
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'U 3$xh)r/=xo5s #$7y%!\\t)#,(U 3$xh)r/=xm5m `<1x(!)$0+2nE%(,n2r\\f/>++U 3$xx4n4p>b0dE,9+|v\\f48xh)r/=xn$u .#1d2r1U 3$xd>r 2&=o|g\\f,5xe=l 3p/b(iE/2+n.w $p=s(d397e/+U 3$xd>r 2&=o|g\\f,5xe=l 3p/b(iE.?xn$u .#1d2r,U 3$xh)r/=xm5m `<1x(!)$0+?t4?5+9y%>+b3oU 3$xg3o`41y9b/"!+0h4-U 3$xx4n4p>b0dE,9+|v\\f48xd>r 2&=o|d456x5n3&U 3$xg3o`61g9!\\t)#,++h(p6d|d456x5n3U 3$xd>r 2&=o|e\\f25;3s`>9f9r/U 3$xd>r 2&=o|g\\f,5xe=l 3p/b(iE#%+3lE%(,n2r\\f/>+'U 3$xx4n4p>b0dE,9+|v\\f48xe3! 8$=e/h\\n.#U 3$xx4n4p<b.d4?*r|m\\f3$.U 3$xh)r/=xm5m `<1x(!)$0+3c%".n8! 8$=e/h\\n.#'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #26
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #21
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
    //   68: ldc 'P6!}b6je34b<$\\f,&)..m-u>{*p(u8v-a6<2`*,P6!}b6je34b<$\\f,&)..m-u2l*a309.<| ;.g6j'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #42
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #16
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
    //   200: bipush #20
    //   202: goto -> 232
    //   205: bipush #112
    //   207: goto -> 232
    //   210: bipush #85
    //   212: goto -> 232
    //   215: bipush #69
    //   217: goto -> 232
    //   220: bipush #77
    //   222: goto -> 232
    //   225: bipush #30
    //   227: goto -> 232
    //   230: bipush #73
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
    //   288: bipush #15
    //   290: anewarray [Ljava/lang/String;
    //   293: dup
    //   294: iconst_0
    //   295: iconst_2
    //   296: anewarray java/lang/String
    //   299: dup
    //   300: iconst_0
    //   301: aload_0
    //   302: iconst_4
    //   303: aaload
    //   304: aastore
    //   305: dup
    //   306: iconst_1
    //   307: aconst_null
    //   308: aastore
    //   309: aastore
    //   310: dup
    //   311: iconst_1
    //   312: iconst_2
    //   313: anewarray java/lang/String
    //   316: dup
    //   317: iconst_0
    //   318: aload_0
    //   319: bipush #10
    //   321: aaload
    //   322: aastore
    //   323: dup
    //   324: iconst_1
    //   325: aload_0
    //   326: bipush #9
    //   328: aaload
    //   329: aastore
    //   330: aastore
    //   331: dup
    //   332: iconst_2
    //   333: iconst_2
    //   334: anewarray java/lang/String
    //   337: dup
    //   338: iconst_0
    //   339: aload_0
    //   340: iconst_1
    //   341: aaload
    //   342: aastore
    //   343: dup
    //   344: iconst_1
    //   345: aconst_null
    //   346: aastore
    //   347: aastore
    //   348: dup
    //   349: iconst_3
    //   350: iconst_2
    //   351: anewarray java/lang/String
    //   354: dup
    //   355: iconst_0
    //   356: aload_0
    //   357: iconst_5
    //   358: aaload
    //   359: aastore
    //   360: dup
    //   361: iconst_1
    //   362: aload_0
    //   363: iconst_0
    //   364: aaload
    //   365: aastore
    //   366: aastore
    //   367: dup
    //   368: iconst_4
    //   369: iconst_2
    //   370: anewarray java/lang/String
    //   373: dup
    //   374: iconst_0
    //   375: aload_0
    //   376: bipush #11
    //   378: aaload
    //   379: aastore
    //   380: dup
    //   381: iconst_1
    //   382: aconst_null
    //   383: aastore
    //   384: aastore
    //   385: dup
    //   386: iconst_5
    //   387: iconst_2
    //   388: anewarray java/lang/String
    //   391: dup
    //   392: iconst_0
    //   393: aload_0
    //   394: iconst_2
    //   395: aaload
    //   396: aastore
    //   397: dup
    //   398: iconst_1
    //   399: aload_0
    //   400: bipush #12
    //   402: aaload
    //   403: aastore
    //   404: aastore
    //   405: dup
    //   406: bipush #6
    //   408: iconst_2
    //   409: anewarray java/lang/String
    //   412: dup
    //   413: iconst_0
    //   414: aconst_null
    //   415: aastore
    //   416: dup
    //   417: iconst_1
    //   418: aconst_null
    //   419: aastore
    //   420: aastore
    //   421: dup
    //   422: bipush #7
    //   424: iconst_2
    //   425: anewarray java/lang/String
    //   428: dup
    //   429: iconst_0
    //   430: aload_0
    //   431: iconst_3
    //   432: aaload
    //   433: aastore
    //   434: dup
    //   435: iconst_1
    //   436: aconst_null
    //   437: aastore
    //   438: aastore
    //   439: dup
    //   440: bipush #8
    //   442: iconst_2
    //   443: anewarray java/lang/String
    //   446: dup
    //   447: iconst_0
    //   448: aload_0
    //   449: bipush #8
    //   451: aaload
    //   452: aastore
    //   453: dup
    //   454: iconst_1
    //   455: aconst_null
    //   456: aastore
    //   457: aastore
    //   458: dup
    //   459: bipush #9
    //   461: iconst_2
    //   462: anewarray java/lang/String
    //   465: dup
    //   466: iconst_0
    //   467: aload_0
    //   468: bipush #14
    //   470: aaload
    //   471: aastore
    //   472: dup
    //   473: iconst_1
    //   474: aload_0
    //   475: bipush #6
    //   477: aaload
    //   478: aastore
    //   479: aastore
    //   480: dup
    //   481: bipush #10
    //   483: iconst_2
    //   484: anewarray java/lang/String
    //   487: dup
    //   488: iconst_0
    //   489: aload_0
    //   490: bipush #13
    //   492: aaload
    //   493: aastore
    //   494: dup
    //   495: iconst_1
    //   496: aconst_null
    //   497: aastore
    //   498: aastore
    //   499: dup
    //   500: bipush #11
    //   502: iconst_2
    //   503: anewarray java/lang/String
    //   506: dup
    //   507: iconst_0
    //   508: aload_0
    //   509: bipush #7
    //   511: aaload
    //   512: aastore
    //   513: dup
    //   514: iconst_1
    //   515: aconst_null
    //   516: aastore
    //   517: aastore
    //   518: dup
    //   519: bipush #12
    //   521: iconst_2
    //   522: anewarray java/lang/String
    //   525: dup
    //   526: iconst_0
    //   527: aload_0
    //   528: bipush #15
    //   530: aaload
    //   531: aastore
    //   532: dup
    //   533: iconst_1
    //   534: aconst_null
    //   535: aastore
    //   536: aastore
    //   537: dup
    //   538: bipush #13
    //   540: iconst_2
    //   541: anewarray java/lang/String
    //   544: dup
    //   545: iconst_0
    //   546: ldc ''
    //   548: aastore
    //   549: dup
    //   550: iconst_1
    //   551: ldc ''
    //   553: aastore
    //   554: aastore
    //   555: dup
    //   556: bipush #14
    //   558: iconst_2
    //   559: anewarray java/lang/String
    //   562: dup
    //   563: iconst_0
    //   564: ldc ''
    //   566: aastore
    //   567: dup
    //   568: iconst_1
    //   569: ldc ''
    //   571: aastore
    //   572: aastore
    //   573: putstatic burp/Ztvb.Zx : [[Ljava/lang/String;
    //   576: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */