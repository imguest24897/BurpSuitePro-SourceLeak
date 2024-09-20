package org.yaml;

public enum Ztt {
  Alias, Anchor, BlockEnd, BlockEntry, BlockMappingStart, BlockSequenceStart, Directive, DocumentEnd, DocumentStart, FlowEntry, FlowMappingEnd, FlowMappingStart, FlowSequenceEnd, FlowSequenceStart, Key, Scalar, StreamEnd, StreamStart, Tag, Value, Whitespace, Comment, Error;
  
  private final String Zv;
  
  private static final Ztt[] ZZ;
  
  Ztt(String paramString1) {
    this.Zv = paramString1;
  }
  
  public String toString() {
    return this.Zv;
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'B|<D'Lqu(rIeb@>z'SpU/8t(b/XjdW8c#Op.Ws'v0E|*d8r$t)a~uF|(|Xue%t'npq?8t9r!Imfu8d,)\\bF|(|S`8q"v1\\b8q(-O:\\f8g"c'Ntq.)Rq>r\\nF|(|SpbWd.v/npq?8r$t)iq;~,Z$c*e6E~#x08t(b/XjdW.y&B|<D'Lqu(rS`\\t@y.t6Tru\\f8c9r#P$u/)\\r@>z'SpC*e6\\b8c*{#O:G&r,I8r$t)wu>r,^a0?v0I:\\nSx?r1Mes\\tB|<R,IviB|<Z#Mty,R,YAb$e8u9x0F|(|\t`%pIebB|<Z#Mty,D6\vdPqOu'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #17
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #54
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
    //   68: ldc '8Yr*s$6(d?_e.\\fx?_v9j_'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #9
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #106
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
    //   200: bipush #50
    //   202: goto -> 232
    //   205: bipush #38
    //   207: goto -> 232
    //   210: bipush #65
    //   212: goto -> 232
    //   215: bipush #125
    //   217: goto -> 232
    //   220: bipush #33
    //   222: goto -> 232
    //   225: bipush #116
    //   227: goto -> 232
    //   230: bipush #11
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
    //   288: new org/yaml/Ztt
    //   291: dup
    //   292: aload_0
    //   293: iconst_4
    //   294: aaload
    //   295: iconst_0
    //   296: aload_0
    //   297: bipush #10
    //   299: aaload
    //   300: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   303: putstatic org/yaml/Ztt.Alias : Lorg/yaml/Ztt;
    //   306: new org/yaml/Ztt
    //   309: dup
    //   310: aload_0
    //   311: bipush #17
    //   313: aaload
    //   314: iconst_1
    //   315: aload_0
    //   316: bipush #11
    //   318: aaload
    //   319: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   322: putstatic org/yaml/Ztt.Anchor : Lorg/yaml/Ztt;
    //   325: new org/yaml/Ztt
    //   328: dup
    //   329: aload_0
    //   330: bipush #9
    //   332: aaload
    //   333: iconst_2
    //   334: aload_0
    //   335: iconst_5
    //   336: aaload
    //   337: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   340: putstatic org/yaml/Ztt.BlockEnd : Lorg/yaml/Ztt;
    //   343: new org/yaml/Ztt
    //   346: dup
    //   347: aload_0
    //   348: bipush #14
    //   350: aaload
    //   351: iconst_3
    //   352: ldc '-'
    //   354: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   357: putstatic org/yaml/Ztt.BlockEntry : Lorg/yaml/Ztt;
    //   360: new org/yaml/Ztt
    //   363: dup
    //   364: aload_0
    //   365: bipush #31
    //   367: aaload
    //   368: iconst_4
    //   369: aload_0
    //   370: bipush #16
    //   372: aaload
    //   373: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   376: putstatic org/yaml/Ztt.BlockMappingStart : Lorg/yaml/Ztt;
    //   379: new org/yaml/Ztt
    //   382: dup
    //   383: aload_0
    //   384: bipush #6
    //   386: aaload
    //   387: iconst_5
    //   388: aload_0
    //   389: bipush #25
    //   391: aaload
    //   392: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   395: putstatic org/yaml/Ztt.BlockSequenceStart : Lorg/yaml/Ztt;
    //   398: new org/yaml/Ztt
    //   401: dup
    //   402: aload_0
    //   403: bipush #20
    //   405: aaload
    //   406: bipush #6
    //   408: aload_0
    //   409: bipush #7
    //   411: aaload
    //   412: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   415: putstatic org/yaml/Ztt.Directive : Lorg/yaml/Ztt;
    //   418: new org/yaml/Ztt
    //   421: dup
    //   422: aload_0
    //   423: iconst_1
    //   424: aaload
    //   425: bipush #7
    //   427: aload_0
    //   428: bipush #18
    //   430: aaload
    //   431: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   434: putstatic org/yaml/Ztt.DocumentEnd : Lorg/yaml/Ztt;
    //   437: new org/yaml/Ztt
    //   440: dup
    //   441: aload_0
    //   442: bipush #22
    //   444: aaload
    //   445: bipush #8
    //   447: aload_0
    //   448: iconst_2
    //   449: aaload
    //   450: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   453: putstatic org/yaml/Ztt.DocumentStart : Lorg/yaml/Ztt;
    //   456: new org/yaml/Ztt
    //   459: dup
    //   460: aload_0
    //   461: bipush #27
    //   463: aaload
    //   464: bipush #9
    //   466: ldc ','
    //   468: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   471: putstatic org/yaml/Ztt.FlowEntry : Lorg/yaml/Ztt;
    //   474: new org/yaml/Ztt
    //   477: dup
    //   478: aload_0
    //   479: bipush #28
    //   481: aaload
    //   482: bipush #10
    //   484: ldc '}'
    //   486: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   489: putstatic org/yaml/Ztt.FlowMappingEnd : Lorg/yaml/Ztt;
    //   492: new org/yaml/Ztt
    //   495: dup
    //   496: aload_0
    //   497: bipush #32
    //   499: aaload
    //   500: bipush #11
    //   502: ldc '{'
    //   504: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   507: putstatic org/yaml/Ztt.FlowMappingStart : Lorg/yaml/Ztt;
    //   510: new org/yaml/Ztt
    //   513: dup
    //   514: aload_0
    //   515: bipush #19
    //   517: aaload
    //   518: bipush #12
    //   520: ldc ']'
    //   522: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   525: putstatic org/yaml/Ztt.FlowSequenceEnd : Lorg/yaml/Ztt;
    //   528: new org/yaml/Ztt
    //   531: dup
    //   532: aload_0
    //   533: iconst_0
    //   534: aaload
    //   535: bipush #13
    //   537: ldc '['
    //   539: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   542: putstatic org/yaml/Ztt.FlowSequenceStart : Lorg/yaml/Ztt;
    //   545: new org/yaml/Ztt
    //   548: dup
    //   549: aload_0
    //   550: bipush #34
    //   552: aaload
    //   553: bipush #14
    //   555: ldc '?'
    //   557: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   560: putstatic org/yaml/Ztt.Key : Lorg/yaml/Ztt;
    //   563: new org/yaml/Ztt
    //   566: dup
    //   567: aload_0
    //   568: iconst_3
    //   569: aaload
    //   570: bipush #15
    //   572: aload_0
    //   573: bipush #23
    //   575: aaload
    //   576: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   579: putstatic org/yaml/Ztt.Scalar : Lorg/yaml/Ztt;
    //   582: new org/yaml/Ztt
    //   585: dup
    //   586: aload_0
    //   587: bipush #35
    //   589: aaload
    //   590: bipush #16
    //   592: aload_0
    //   593: bipush #21
    //   595: aaload
    //   596: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   599: putstatic org/yaml/Ztt.StreamEnd : Lorg/yaml/Ztt;
    //   602: new org/yaml/Ztt
    //   605: dup
    //   606: aload_0
    //   607: bipush #15
    //   609: aaload
    //   610: bipush #17
    //   612: aload_0
    //   613: bipush #36
    //   615: aaload
    //   616: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   619: putstatic org/yaml/Ztt.StreamStart : Lorg/yaml/Ztt;
    //   622: new org/yaml/Ztt
    //   625: dup
    //   626: aload_0
    //   627: bipush #33
    //   629: aaload
    //   630: bipush #18
    //   632: aload_0
    //   633: bipush #8
    //   635: aaload
    //   636: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   639: putstatic org/yaml/Ztt.Tag : Lorg/yaml/Ztt;
    //   642: new org/yaml/Ztt
    //   645: dup
    //   646: aload_0
    //   647: bipush #13
    //   649: aaload
    //   650: bipush #19
    //   652: ldc ':'
    //   654: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   657: putstatic org/yaml/Ztt.Value : Lorg/yaml/Ztt;
    //   660: new org/yaml/Ztt
    //   663: dup
    //   664: aload_0
    //   665: bipush #26
    //   667: aaload
    //   668: bipush #20
    //   670: aload_0
    //   671: bipush #12
    //   673: aaload
    //   674: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   677: putstatic org/yaml/Ztt.Whitespace : Lorg/yaml/Ztt;
    //   680: new org/yaml/Ztt
    //   683: dup
    //   684: aload_0
    //   685: bipush #24
    //   687: aaload
    //   688: bipush #21
    //   690: ldc '#'
    //   692: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   695: putstatic org/yaml/Ztt.Comment : Lorg/yaml/Ztt;
    //   698: new org/yaml/Ztt
    //   701: dup
    //   702: aload_0
    //   703: bipush #29
    //   705: aaload
    //   706: bipush #22
    //   708: aload_0
    //   709: bipush #30
    //   711: aaload
    //   712: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   715: putstatic org/yaml/Ztt.Error : Lorg/yaml/Ztt;
    //   718: bipush #23
    //   720: anewarray org/yaml/Ztt
    //   723: dup
    //   724: iconst_0
    //   725: getstatic org/yaml/Ztt.Alias : Lorg/yaml/Ztt;
    //   728: aastore
    //   729: dup
    //   730: iconst_1
    //   731: getstatic org/yaml/Ztt.Anchor : Lorg/yaml/Ztt;
    //   734: aastore
    //   735: dup
    //   736: iconst_2
    //   737: getstatic org/yaml/Ztt.BlockEnd : Lorg/yaml/Ztt;
    //   740: aastore
    //   741: dup
    //   742: iconst_3
    //   743: getstatic org/yaml/Ztt.BlockEntry : Lorg/yaml/Ztt;
    //   746: aastore
    //   747: dup
    //   748: iconst_4
    //   749: getstatic org/yaml/Ztt.BlockMappingStart : Lorg/yaml/Ztt;
    //   752: aastore
    //   753: dup
    //   754: iconst_5
    //   755: getstatic org/yaml/Ztt.BlockSequenceStart : Lorg/yaml/Ztt;
    //   758: aastore
    //   759: dup
    //   760: bipush #6
    //   762: getstatic org/yaml/Ztt.Directive : Lorg/yaml/Ztt;
    //   765: aastore
    //   766: dup
    //   767: bipush #7
    //   769: getstatic org/yaml/Ztt.DocumentEnd : Lorg/yaml/Ztt;
    //   772: aastore
    //   773: dup
    //   774: bipush #8
    //   776: getstatic org/yaml/Ztt.DocumentStart : Lorg/yaml/Ztt;
    //   779: aastore
    //   780: dup
    //   781: bipush #9
    //   783: getstatic org/yaml/Ztt.FlowEntry : Lorg/yaml/Ztt;
    //   786: aastore
    //   787: dup
    //   788: bipush #10
    //   790: getstatic org/yaml/Ztt.FlowMappingEnd : Lorg/yaml/Ztt;
    //   793: aastore
    //   794: dup
    //   795: bipush #11
    //   797: getstatic org/yaml/Ztt.FlowMappingStart : Lorg/yaml/Ztt;
    //   800: aastore
    //   801: dup
    //   802: bipush #12
    //   804: getstatic org/yaml/Ztt.FlowSequenceEnd : Lorg/yaml/Ztt;
    //   807: aastore
    //   808: dup
    //   809: bipush #13
    //   811: getstatic org/yaml/Ztt.FlowSequenceStart : Lorg/yaml/Ztt;
    //   814: aastore
    //   815: dup
    //   816: bipush #14
    //   818: getstatic org/yaml/Ztt.Key : Lorg/yaml/Ztt;
    //   821: aastore
    //   822: dup
    //   823: bipush #15
    //   825: getstatic org/yaml/Ztt.Scalar : Lorg/yaml/Ztt;
    //   828: aastore
    //   829: dup
    //   830: bipush #16
    //   832: getstatic org/yaml/Ztt.StreamEnd : Lorg/yaml/Ztt;
    //   835: aastore
    //   836: dup
    //   837: bipush #17
    //   839: getstatic org/yaml/Ztt.StreamStart : Lorg/yaml/Ztt;
    //   842: aastore
    //   843: dup
    //   844: bipush #18
    //   846: getstatic org/yaml/Ztt.Tag : Lorg/yaml/Ztt;
    //   849: aastore
    //   850: dup
    //   851: bipush #19
    //   853: getstatic org/yaml/Ztt.Value : Lorg/yaml/Ztt;
    //   856: aastore
    //   857: dup
    //   858: bipush #20
    //   860: getstatic org/yaml/Ztt.Whitespace : Lorg/yaml/Ztt;
    //   863: aastore
    //   864: dup
    //   865: bipush #21
    //   867: getstatic org/yaml/Ztt.Comment : Lorg/yaml/Ztt;
    //   870: aastore
    //   871: dup
    //   872: bipush #22
    //   874: getstatic org/yaml/Ztt.Error : Lorg/yaml/Ztt;
    //   877: aastore
    //   878: putstatic org/yaml/Ztt.ZZ : [Lorg/yaml/Ztt;
    //   881: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Ztt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */