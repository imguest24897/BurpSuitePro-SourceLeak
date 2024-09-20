package burp;

import java.math.BigInteger;

class Zgdt extends ClassLoader {
  static String Zd;
  
  static Object Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zebj.Zf : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxn7.ZU : Ljava/lang/Object;
    //   22: getstatic burp/Ztte.ZR : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zejg.ZR : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zzwl.Z_ : Ljava/lang/Object;
    //   40: getstatic burp/Zzv.Zu : Ljava/lang/Object;
    //   43: checkcast java/math/BigInteger
    //   46: invokevirtual toByteArray : ()[B
    //   49: astore_3
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore #5
    //   59: aload #5
    //   61: sipush #5348
    //   64: sipush #6072
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload_3
    //   75: astore #6
    //   77: aload #6
    //   79: arraylength
    //   80: istore #7
    //   82: iconst_0
    //   83: istore #8
    //   85: iload #8
    //   87: iload #7
    //   89: if_icmpge -> 115
    //   92: aload #6
    //   94: iload #8
    //   96: baload
    //   97: istore #9
    //   99: aload #5
    //   101: iload #9
    //   103: i2c
    //   104: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: iinc #8, 1
    //   111: iload_2
    //   112: ifne -> 85
    //   115: aload #5
    //   117: sipush #5351
    //   120: sipush #-10056
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: ldc ''
    //   128: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload #5
    //   140: sipush #5345
    //   143: sipush #-12947
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: ldc ''
    //   151: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   154: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload #5
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: invokevirtual getBytes : ()[B
    //   169: astore #4
    //   171: aload #4
    //   173: astore_3
    //   174: aload_3
    //   175: arraylength
    //   176: bipush #8
    //   178: iadd
    //   179: bipush #6
    //   181: ishr
    //   182: iconst_1
    //   183: iadd
    //   184: bipush #16
    //   186: imul
    //   187: newarray int
    //   189: astore #5
    //   191: iconst_0
    //   192: istore #6
    //   194: iload #6
    //   196: aload_3
    //   197: arraylength
    //   198: if_icmpge -> 241
    //   201: aload_3
    //   202: iload #6
    //   204: baload
    //   205: sipush #255
    //   208: iand
    //   209: istore #7
    //   211: aload #5
    //   213: iload #6
    //   215: iconst_2
    //   216: ishr
    //   217: dup2
    //   218: iaload
    //   219: iload #7
    //   221: bipush #24
    //   223: iload #6
    //   225: iconst_4
    //   226: irem
    //   227: bipush #8
    //   229: imul
    //   230: isub
    //   231: ishl
    //   232: ior
    //   233: iastore
    //   234: iinc #6, 1
    //   237: iload_2
    //   238: ifne -> 194
    //   241: aload #5
    //   243: iload #6
    //   245: iconst_2
    //   246: ishr
    //   247: dup2
    //   248: iaload
    //   249: sipush #128
    //   252: bipush #24
    //   254: iload #6
    //   256: iconst_4
    //   257: irem
    //   258: bipush #8
    //   260: imul
    //   261: isub
    //   262: ishl
    //   263: ior
    //   264: iastore
    //   265: aload #5
    //   267: aload #5
    //   269: arraylength
    //   270: iconst_1
    //   271: isub
    //   272: aload_3
    //   273: arraylength
    //   274: bipush #8
    //   276: imul
    //   277: iastore
    //   278: bipush #80
    //   280: newarray int
    //   282: astore #7
    //   284: ldc 1732584193
    //   286: istore #8
    //   288: ldc -271733879
    //   290: istore #9
    //   292: ldc -1732584194
    //   294: istore #10
    //   296: ldc 271733878
    //   298: istore #11
    //   300: ldc -1009589776
    //   302: istore #12
    //   304: iconst_0
    //   305: istore #6
    //   307: iload #6
    //   309: aload #5
    //   311: arraylength
    //   312: if_icmpge -> 634
    //   315: iload #8
    //   317: istore #13
    //   319: iload #9
    //   321: istore #14
    //   323: iload #10
    //   325: istore #15
    //   327: iload #11
    //   329: istore #16
    //   331: iload #12
    //   333: istore #17
    //   335: iconst_0
    //   336: istore #18
    //   338: iload #18
    //   340: bipush #80
    //   342: if_icmpge -> 592
    //   345: iload #18
    //   347: bipush #16
    //   349: if_icmpge -> 376
    //   352: aload #7
    //   354: iload #18
    //   356: aload #5
    //   358: iload #6
    //   360: iload #18
    //   362: iadd
    //   363: iaload
    //   364: iastore
    //   365: iload_2
    //   366: ifne -> 431
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   375: athrow
    //   376: aload #7
    //   378: iload #18
    //   380: iconst_3
    //   381: isub
    //   382: iaload
    //   383: aload #7
    //   385: iload #18
    //   387: bipush #8
    //   389: isub
    //   390: iaload
    //   391: ixor
    //   392: aload #7
    //   394: iload #18
    //   396: bipush #14
    //   398: isub
    //   399: iaload
    //   400: ixor
    //   401: aload #7
    //   403: iload #18
    //   405: bipush #16
    //   407: isub
    //   408: iaload
    //   409: ixor
    //   410: istore #19
    //   412: iload #19
    //   414: iconst_1
    //   415: ishl
    //   416: iload #19
    //   418: bipush #31
    //   420: iushr
    //   421: ior
    //   422: istore #20
    //   424: aload #7
    //   426: iload #18
    //   428: iload #20
    //   430: iastore
    //   431: iload #8
    //   433: iconst_5
    //   434: ishl
    //   435: iload #8
    //   437: bipush #27
    //   439: iushr
    //   440: ior
    //   441: istore #19
    //   443: iload #19
    //   445: iload #12
    //   447: iadd
    //   448: aload #7
    //   450: iload #18
    //   452: iaload
    //   453: iadd
    //   454: iload #18
    //   456: bipush #20
    //   458: if_icmpge -> 484
    //   461: ldc 1518500249
    //   463: iload #9
    //   465: iload #10
    //   467: iand
    //   468: iload #9
    //   470: iconst_m1
    //   471: ixor
    //   472: iload #11
    //   474: iand
    //   475: ior
    //   476: iadd
    //   477: goto -> 554
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: iload #18
    //   486: bipush #40
    //   488: if_icmpge -> 509
    //   491: ldc 1859775393
    //   493: iload #9
    //   495: iload #10
    //   497: ixor
    //   498: iload #11
    //   500: ixor
    //   501: iadd
    //   502: goto -> 554
    //   505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   508: athrow
    //   509: iload #18
    //   511: bipush #60
    //   513: if_icmpge -> 543
    //   516: ldc -1894007588
    //   518: iload #9
    //   520: iload #10
    //   522: iand
    //   523: iload #9
    //   525: iload #11
    //   527: iand
    //   528: ior
    //   529: iload #10
    //   531: iload #11
    //   533: iand
    //   534: ior
    //   535: iadd
    //   536: goto -> 554
    //   539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   542: athrow
    //   543: ldc -899497514
    //   545: iload #9
    //   547: iload #10
    //   549: ixor
    //   550: iload #11
    //   552: ixor
    //   553: iadd
    //   554: iadd
    //   555: istore #20
    //   557: iload #11
    //   559: istore #12
    //   561: iload #10
    //   563: istore #11
    //   565: iload #9
    //   567: bipush #30
    //   569: ishl
    //   570: iload #9
    //   572: iconst_2
    //   573: iushr
    //   574: ior
    //   575: istore #10
    //   577: iload #8
    //   579: istore #9
    //   581: iload #20
    //   583: istore #8
    //   585: iinc #18, 1
    //   588: iload_2
    //   589: ifne -> 338
    //   592: iload #8
    //   594: iload #13
    //   596: iadd
    //   597: istore #8
    //   599: iload #9
    //   601: iload #14
    //   603: iadd
    //   604: istore #9
    //   606: iload #10
    //   608: iload #15
    //   610: iadd
    //   611: istore #10
    //   613: iload #11
    //   615: iload #16
    //   617: iadd
    //   618: istore #11
    //   620: iload #12
    //   622: iload #17
    //   624: iadd
    //   625: istore #12
    //   627: iinc #6, 16
    //   630: iload_2
    //   631: ifne -> 307
    //   634: iconst_5
    //   635: newarray int
    //   637: dup
    //   638: iconst_0
    //   639: iload #8
    //   641: iastore
    //   642: dup
    //   643: iconst_1
    //   644: iload #9
    //   646: iastore
    //   647: dup
    //   648: iconst_2
    //   649: iload #10
    //   651: iastore
    //   652: dup
    //   653: iconst_3
    //   654: iload #11
    //   656: iastore
    //   657: dup
    //   658: iconst_4
    //   659: iload #12
    //   661: iastore
    //   662: astore #13
    //   664: bipush #20
    //   666: newarray byte
    //   668: astore #14
    //   670: iconst_0
    //   671: istore #15
    //   673: iload #15
    //   675: bipush #20
    //   677: if_icmpge -> 718
    //   680: aload #13
    //   682: iload #15
    //   684: iconst_4
    //   685: idiv
    //   686: iaload
    //   687: istore #16
    //   689: iconst_3
    //   690: iload #15
    //   692: iconst_4
    //   693: irem
    //   694: isub
    //   695: bipush #8
    //   697: imul
    //   698: istore #17
    //   700: aload #14
    //   702: iload #15
    //   704: iload #16
    //   706: iload #17
    //   708: iushr
    //   709: i2b
    //   710: bastore
    //   711: iinc #15, 1
    //   714: iload_2
    //   715: ifne -> 673
    //   718: aload #14
    //   720: astore #4
    //   722: sipush #5344
    //   725: sipush #-12084
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: iconst_1
    //   732: ldc burp/Zrdo
    //   734: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   737: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   740: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   743: astore_3
    //   744: aload_3
    //   745: arraylength
    //   746: istore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: iload #5
    //   753: iload #4
    //   755: if_icmpge -> 892
    //   758: aload_3
    //   759: iload #5
    //   761: aaload
    //   762: astore #6
    //   764: aload #6
    //   766: invokevirtual getModifiers : ()I
    //   769: invokestatic isStatic : (I)Z
    //   772: ifne -> 782
    //   775: goto -> 885
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #6
    //   784: invokevirtual getType : ()Ljava/lang/Class;
    //   787: astore #7
    //   789: aload #7
    //   791: ifnull -> 872
    //   794: aload #7
    //   796: invokevirtual isPrimitive : ()Z
    //   799: ifne -> 872
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   814: ifnull -> 872
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   823: athrow
    //   824: aload #7
    //   826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   829: invokevirtual getName : ()Ljava/lang/String;
    //   832: ifnull -> 872
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   841: athrow
    //   842: aload #7
    //   844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   847: invokevirtual getName : ()Ljava/lang/String;
    //   850: sipush #5346
    //   853: sipush #10367
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   862: ifne -> 872
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: aload #6
    //   874: iconst_1
    //   875: invokevirtual setAccessible : (Z)V
    //   878: aload #6
    //   880: aconst_null
    //   881: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   884: pop
    //   885: iinc #5, 1
    //   888: iload_2
    //   889: ifne -> 751
    //   892: sipush #5347
    //   895: sipush #12261
    //   898: invokestatic a : (II)Ljava/lang/String;
    //   901: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   904: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   907: astore_3
    //   908: aload_3
    //   909: arraylength
    //   910: istore #4
    //   912: iconst_0
    //   913: istore #5
    //   915: iload #5
    //   917: iload #4
    //   919: if_icmpge -> 1051
    //   922: aload_3
    //   923: iload #5
    //   925: aaload
    //   926: astore #6
    //   928: aload #6
    //   930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   933: pop
    //   934: aload #6
    //   936: invokevirtual getModifiers : ()I
    //   939: invokestatic isStatic : (I)Z
    //   942: ifeq -> 1037
    //   945: aload #6
    //   947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   950: arraylength
    //   951: iconst_2
    //   952: if_icmpne -> 1037
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   961: athrow
    //   962: aload #6
    //   964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   967: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   970: invokevirtual equals : (Ljava/lang/Object;)Z
    //   973: ifeq -> 1037
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   982: athrow
    //   983: aload #6
    //   985: iconst_1
    //   986: invokevirtual setAccessible : (Z)V
    //   989: aload #6
    //   991: aconst_null
    //   992: iconst_2
    //   993: anewarray java/lang/Object
    //   996: dup
    //   997: iconst_0
    //   998: aload_0
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: aload_1
    //   1003: ifnonnull -> 1021
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1012: athrow
    //   1013: aload_1
    //   1014: goto -> 1028
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload_1
    //   1022: checkcast [B
    //   1025: invokevirtual clone : ()Ljava/lang/Object;
    //   1028: aastore
    //   1029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: pop
    //   1033: iload_2
    //   1034: ifne -> 1051
    //   1037: iinc #5, 1
    //   1040: iload_2
    //   1041: ifne -> 915
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: getstatic burp/Zsej.Zd : Ljava/lang/String;
    //   1054: getstatic burp/Zkul.Zb : Ljava/lang/Object;
    //   1057: checkcast java/math/BigInteger
    //   1060: invokevirtual intValue : ()I
    //   1063: bipush #32
    //   1065: irem
    //   1066: invokestatic abs : (I)I
    //   1069: invokevirtual charAt : (I)C
    //   1072: getstatic burp/Zty5.Za : Ljava/lang/String;
    //   1075: getstatic burp/Zewo.ZZ : Ljava/lang/Object;
    //   1078: checkcast java/math/BigInteger
    //   1081: invokevirtual intValue : ()I
    //   1084: bipush #32
    //   1086: irem
    //   1087: invokestatic abs : (I)I
    //   1090: invokevirtual charAt : (I)C
    //   1093: if_icmple -> 1200
    //   1096: getstatic burp/Zr3x.ZM : Ljava/lang/String;
    //   1099: getstatic burp/Zg97.Zc : Ljava/lang/Object;
    //   1102: checkcast java/math/BigInteger
    //   1105: invokevirtual intValue : ()I
    //   1108: bipush #32
    //   1110: irem
    //   1111: invokestatic abs : (I)I
    //   1114: invokevirtual charAt : (I)C
    //   1117: getstatic burp/Zxoa.Z_ : Ljava/lang/String;
    //   1120: getstatic burp/Zly0.ZB : Ljava/lang/Object;
    //   1123: checkcast java/math/BigInteger
    //   1126: invokevirtual intValue : ()I
    //   1129: bipush #32
    //   1131: irem
    //   1132: invokestatic abs : (I)I
    //   1135: invokevirtual charAt : (I)C
    //   1138: if_icmple -> 1200
    //   1141: goto -> 1148
    //   1144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1147: athrow
    //   1148: getstatic burp/Zm06.Zg : Ljava/lang/String;
    //   1151: getstatic burp/Zljx.ZZ : Ljava/lang/Object;
    //   1154: checkcast java/math/BigInteger
    //   1157: invokevirtual intValue : ()I
    //   1160: bipush #32
    //   1162: irem
    //   1163: invokestatic abs : (I)I
    //   1166: invokevirtual charAt : (I)C
    //   1169: getstatic burp/Zxyq.Zr : Ljava/lang/String;
    //   1172: getstatic burp/Zewo.ZZ : Ljava/lang/Object;
    //   1175: checkcast java/math/BigInteger
    //   1178: invokevirtual intValue : ()I
    //   1181: bipush #32
    //   1183: irem
    //   1184: invokestatic abs : (I)I
    //   1187: invokevirtual charAt : (I)C
    //   1190: if_icmpgt -> 1208
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: iconst_1
    //   1201: goto -> 1209
    //   1204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1207: athrow
    //   1208: iconst_0
    //   1209: ireturn
    //   1210: astore_3
    //   1211: new java/lang/Exception
    //   1214: dup
    //   1215: aload_3
    //   1216: invokevirtual getMessage : ()Ljava/lang/String;
    //   1219: invokespecial <init> : (Ljava/lang/String;)V
    //   1222: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1209	1210	java/lang/Throwable
    //   345	369	372	java/lang/Throwable
    //   443	480	480	java/lang/Throwable
    //   484	505	505	java/lang/Throwable
    //   509	539	539	java/lang/Throwable
    //   764	778	778	java/lang/Throwable
    //   789	802	805	java/lang/Throwable
    //   794	817	820	java/lang/Throwable
    //   809	835	838	java/lang/Throwable
    //   824	865	868	java/lang/Throwable
    //   928	955	958	java/lang/Throwable
    //   945	976	979	java/lang/Throwable
    //   962	1006	1009	java/lang/Throwable
    //   983	1017	1017	java/lang/Throwable
    //   1028	1044	1047	java/lang/Throwable
    //   1051	1141	1144	java/lang/Throwable
    //   1096	1193	1196	java/lang/Throwable
    //   1148	1204	1204	java/lang/Throwable
  }
  
  static void ZZ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZP(Object paramObject) {
    Zz67.Zc = a(5350, -32115);
    Zz67.ZE = new BigInteger(a(5359, -15462));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zz0j.Zf.charAt(Math.abs(((BigInteger)Zs59.Zw).intValue() % 32)) > Zz67.Zc.charAt(Math.abs(((BigInteger)Zeyt.ZR).intValue() % 32))) {
          try {
            Zltb.Zc(Class.forName(a(5349, -32270)));
            if (!bool)
              Ztpa.ZD(Class.forName(a(5357, -15721))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztpa.ZD(Class.forName(a(5357, -15721)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'çz©iÌ zJ+¶m:ÔÝùCu¶ªGåãÙ²Æ%ªÒÜ$|  ØçÉè²¾[Ñ>m·y*«\\r²S]!TøÛ¾,=ËÃµZ\\tªÀbày\\bÉ±¿gj0\\b9÷v§KtPâ\\tíô;Ïg¯¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #13
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'jS¿_6ßdµA£¨>¿aÅÐ?f$¤ªÚö\\bMPÿÁ\\t^òñ­ê3ÔèeQ\\rEÉé)[·_¡¢¯\\f|ð?¤DÜÐ9ØÌÉ$vèÊ¨g¾(²Æ2É~·£Ç'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #49
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zgdt.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgdt.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #43
    //   214: goto -> 244
    //   217: bipush #88
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #93
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #74
    //   239: goto -> 244
    //   242: bipush #59
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: sipush #5356
    //   303: sipush #-16470
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgdt.Zd : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #51
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: iconst_2
    //   328: bastore
    //   329: dup
    //   330: iconst_2
    //   331: bipush #-92
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #27
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #-113
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #81
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #89
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #52
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #-29
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #20
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #39
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: iconst_0
    //   383: bastore
    //   384: dup
    //   385: bipush #12
    //   387: bipush #-39
    //   389: bastore
    //   390: dup
    //   391: bipush #13
    //   393: bipush #118
    //   395: bastore
    //   396: dup
    //   397: bipush #14
    //   399: bipush #68
    //   401: bastore
    //   402: dup
    //   403: bipush #15
    //   405: bipush #9
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #30
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #-84
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #-78
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #-23
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #-36
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: iconst_m1
    //   442: bastore
    //   443: dup
    //   444: bipush #22
    //   446: bipush #-23
    //   448: bastore
    //   449: dup
    //   450: bipush #23
    //   452: bipush #-72
    //   454: bastore
    //   455: dup
    //   456: bipush #24
    //   458: bipush #-69
    //   460: bastore
    //   461: dup
    //   462: bipush #25
    //   464: bipush #-16
    //   466: bastore
    //   467: dup
    //   468: bipush #26
    //   470: bipush #-2
    //   472: bastore
    //   473: dup
    //   474: bipush #27
    //   476: bipush #-19
    //   478: bastore
    //   479: dup
    //   480: bipush #28
    //   482: bipush #-117
    //   484: bastore
    //   485: dup
    //   486: bipush #29
    //   488: bipush #34
    //   490: bastore
    //   491: dup
    //   492: bipush #30
    //   494: bipush #-11
    //   496: bastore
    //   497: dup
    //   498: bipush #31
    //   500: bipush #-108
    //   502: bastore
    //   503: invokespecial <init> : ([B)V
    //   506: putstatic burp/Zgdt.Zb : Ljava/lang/Object;
    //   509: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x14E5) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 83;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */