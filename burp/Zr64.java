package burp;

import java.math.BigInteger;

class Zr64 extends ClassLoader {
  static String Zj;
  
  static Object ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZE(Object paramObject) {
    Zlqm.ZQ = a(28293, 30136);
    Zlqm.Zw = new BigInteger(a(28306, -29173));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zz4r.Zq.charAt(Math.abs(((BigInteger)Zlhk.ZD).intValue() % 32)) > Zb1.Z_.charAt(Math.abs(((BigInteger)Zgl4.Zb).intValue() % 32))) {
          try {
            Zsjo.Zn(Class.forName(a(28288, 4884)));
            if (bool)
              Zsji.Zw(Class.forName(a(28308, -19863))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsji.Zw(Class.forName(a(28308, -19863)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrqd.Zi : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: bipush #8
    //   18: iadd
    //   19: bipush #6
    //   21: ishr
    //   22: iconst_1
    //   23: iadd
    //   24: bipush #16
    //   26: imul
    //   27: newarray int
    //   29: astore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: iload #6
    //   36: aload_3
    //   37: arraylength
    //   38: if_icmpge -> 81
    //   41: aload_3
    //   42: iload #6
    //   44: baload
    //   45: sipush #255
    //   48: iand
    //   49: istore #7
    //   51: aload #5
    //   53: iload #6
    //   55: iconst_2
    //   56: ishr
    //   57: dup2
    //   58: iaload
    //   59: iload #7
    //   61: bipush #24
    //   63: iload #6
    //   65: iconst_4
    //   66: irem
    //   67: bipush #8
    //   69: imul
    //   70: isub
    //   71: ishl
    //   72: ior
    //   73: iastore
    //   74: iinc #6, 1
    //   77: iload_2
    //   78: ifne -> 34
    //   81: aload #5
    //   83: iload #6
    //   85: iconst_2
    //   86: ishr
    //   87: dup2
    //   88: iaload
    //   89: sipush #128
    //   92: bipush #24
    //   94: iload #6
    //   96: iconst_4
    //   97: irem
    //   98: bipush #8
    //   100: imul
    //   101: isub
    //   102: ishl
    //   103: ior
    //   104: iastore
    //   105: aload #5
    //   107: aload #5
    //   109: arraylength
    //   110: iconst_1
    //   111: isub
    //   112: aload_3
    //   113: arraylength
    //   114: bipush #8
    //   116: imul
    //   117: iastore
    //   118: bipush #80
    //   120: newarray int
    //   122: astore #7
    //   124: ldc 1732584193
    //   126: istore #8
    //   128: ldc -271733879
    //   130: istore #9
    //   132: ldc -1732584194
    //   134: istore #10
    //   136: ldc 271733878
    //   138: istore #11
    //   140: ldc -1009589776
    //   142: istore #12
    //   144: iconst_0
    //   145: istore #6
    //   147: iload #6
    //   149: aload #5
    //   151: arraylength
    //   152: if_icmpge -> 474
    //   155: iload #8
    //   157: istore #13
    //   159: iload #9
    //   161: istore #14
    //   163: iload #10
    //   165: istore #15
    //   167: iload #11
    //   169: istore #16
    //   171: iload #12
    //   173: istore #17
    //   175: iconst_0
    //   176: istore #18
    //   178: iload #18
    //   180: bipush #80
    //   182: if_icmpge -> 432
    //   185: iload #18
    //   187: bipush #16
    //   189: if_icmpge -> 216
    //   192: aload #7
    //   194: iload #18
    //   196: aload #5
    //   198: iload #6
    //   200: iload #18
    //   202: iadd
    //   203: iaload
    //   204: iastore
    //   205: iload_2
    //   206: ifne -> 271
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: athrow
    //   216: aload #7
    //   218: iload #18
    //   220: iconst_3
    //   221: isub
    //   222: iaload
    //   223: aload #7
    //   225: iload #18
    //   227: bipush #8
    //   229: isub
    //   230: iaload
    //   231: ixor
    //   232: aload #7
    //   234: iload #18
    //   236: bipush #14
    //   238: isub
    //   239: iaload
    //   240: ixor
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #16
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: istore #19
    //   252: iload #19
    //   254: iconst_1
    //   255: ishl
    //   256: iload #19
    //   258: bipush #31
    //   260: iushr
    //   261: ior
    //   262: istore #20
    //   264: aload #7
    //   266: iload #18
    //   268: iload #20
    //   270: iastore
    //   271: iload #8
    //   273: iconst_5
    //   274: ishl
    //   275: iload #8
    //   277: bipush #27
    //   279: iushr
    //   280: ior
    //   281: istore #19
    //   283: iload #19
    //   285: iload #12
    //   287: iadd
    //   288: aload #7
    //   290: iload #18
    //   292: iaload
    //   293: iadd
    //   294: iload #18
    //   296: bipush #20
    //   298: if_icmpge -> 324
    //   301: ldc 1518500249
    //   303: iload #9
    //   305: iload #10
    //   307: iand
    //   308: iload #9
    //   310: iconst_m1
    //   311: ixor
    //   312: iload #11
    //   314: iand
    //   315: ior
    //   316: iadd
    //   317: goto -> 394
    //   320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   323: athrow
    //   324: iload #18
    //   326: bipush #40
    //   328: if_icmpge -> 349
    //   331: ldc 1859775393
    //   333: iload #9
    //   335: iload #10
    //   337: ixor
    //   338: iload #11
    //   340: ixor
    //   341: iadd
    //   342: goto -> 394
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: iload #18
    //   351: bipush #60
    //   353: if_icmpge -> 383
    //   356: ldc -1894007588
    //   358: iload #9
    //   360: iload #10
    //   362: iand
    //   363: iload #9
    //   365: iload #11
    //   367: iand
    //   368: ior
    //   369: iload #10
    //   371: iload #11
    //   373: iand
    //   374: ior
    //   375: iadd
    //   376: goto -> 394
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: ldc -899497514
    //   385: iload #9
    //   387: iload #10
    //   389: ixor
    //   390: iload #11
    //   392: ixor
    //   393: iadd
    //   394: iadd
    //   395: istore #20
    //   397: iload #11
    //   399: istore #12
    //   401: iload #10
    //   403: istore #11
    //   405: iload #9
    //   407: bipush #30
    //   409: ishl
    //   410: iload #9
    //   412: iconst_2
    //   413: iushr
    //   414: ior
    //   415: istore #10
    //   417: iload #8
    //   419: istore #9
    //   421: iload #20
    //   423: istore #8
    //   425: iinc #18, 1
    //   428: iload_2
    //   429: ifne -> 178
    //   432: iload #8
    //   434: iload #13
    //   436: iadd
    //   437: istore #8
    //   439: iload #9
    //   441: iload #14
    //   443: iadd
    //   444: istore #9
    //   446: iload #10
    //   448: iload #15
    //   450: iadd
    //   451: istore #10
    //   453: iload #11
    //   455: iload #16
    //   457: iadd
    //   458: istore #11
    //   460: iload #12
    //   462: iload #17
    //   464: iadd
    //   465: istore #12
    //   467: iinc #6, 16
    //   470: iload_2
    //   471: ifne -> 147
    //   474: iconst_5
    //   475: newarray int
    //   477: dup
    //   478: iconst_0
    //   479: iload #8
    //   481: iastore
    //   482: dup
    //   483: iconst_1
    //   484: iload #9
    //   486: iastore
    //   487: dup
    //   488: iconst_2
    //   489: iload #10
    //   491: iastore
    //   492: dup
    //   493: iconst_3
    //   494: iload #11
    //   496: iastore
    //   497: dup
    //   498: iconst_4
    //   499: iload #12
    //   501: iastore
    //   502: astore #13
    //   504: bipush #20
    //   506: newarray byte
    //   508: astore #14
    //   510: iconst_0
    //   511: istore #15
    //   513: iload #15
    //   515: bipush #20
    //   517: if_icmpge -> 558
    //   520: aload #13
    //   522: iload #15
    //   524: iconst_4
    //   525: idiv
    //   526: iaload
    //   527: istore #16
    //   529: iconst_3
    //   530: iload #15
    //   532: iconst_4
    //   533: irem
    //   534: isub
    //   535: bipush #8
    //   537: imul
    //   538: istore #17
    //   540: aload #14
    //   542: iload #15
    //   544: iload #16
    //   546: iload #17
    //   548: iushr
    //   549: i2b
    //   550: bastore
    //   551: iinc #15, 1
    //   554: iload_2
    //   555: ifne -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: sipush #28319
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Zm3s.ZW : Ljava/lang/Object;
    //   580: sipush #-15293
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: iconst_1
    //   587: ldc burp/Zsot
    //   589: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   592: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   595: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   598: astore_3
    //   599: aload_3
    //   600: arraylength
    //   601: istore #4
    //   603: iconst_0
    //   604: istore #5
    //   606: iload #5
    //   608: iload #4
    //   610: if_icmpge -> 747
    //   613: aload_3
    //   614: iload #5
    //   616: aaload
    //   617: astore #6
    //   619: aload #6
    //   621: invokevirtual getModifiers : ()I
    //   624: invokestatic isStatic : (I)Z
    //   627: ifne -> 637
    //   630: goto -> 740
    //   633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   636: athrow
    //   637: aload #6
    //   639: invokevirtual getType : ()Ljava/lang/Class;
    //   642: astore #7
    //   644: aload #7
    //   646: ifnull -> 727
    //   649: aload #7
    //   651: invokevirtual isPrimitive : ()Z
    //   654: ifne -> 727
    //   657: goto -> 664
    //   660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   663: athrow
    //   664: aload #7
    //   666: invokevirtual getPackage : ()Ljava/lang/Package;
    //   669: ifnull -> 727
    //   672: goto -> 679
    //   675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   678: athrow
    //   679: aload #7
    //   681: invokevirtual getPackage : ()Ljava/lang/Package;
    //   684: invokevirtual getName : ()Ljava/lang/String;
    //   687: ifnull -> 727
    //   690: goto -> 697
    //   693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   696: athrow
    //   697: aload #7
    //   699: invokevirtual getPackage : ()Ljava/lang/Package;
    //   702: invokevirtual getName : ()Ljava/lang/String;
    //   705: sipush #28313
    //   708: sipush #-11620
    //   711: invokestatic a : (II)Ljava/lang/String;
    //   714: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   717: ifne -> 727
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   726: athrow
    //   727: aload #6
    //   729: iconst_1
    //   730: invokevirtual setAccessible : (Z)V
    //   733: aload #6
    //   735: aconst_null
    //   736: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   739: pop
    //   740: iinc #5, 1
    //   743: iload_2
    //   744: ifne -> 606
    //   747: sipush #28295
    //   750: sipush #-7173
    //   753: invokestatic a : (II)Ljava/lang/String;
    //   756: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   759: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   762: astore_3
    //   763: aload_3
    //   764: arraylength
    //   765: istore #4
    //   767: iconst_0
    //   768: istore #5
    //   770: iload #5
    //   772: iload #4
    //   774: if_icmpge -> 906
    //   777: aload_3
    //   778: iload #5
    //   780: aaload
    //   781: astore #6
    //   783: aload #6
    //   785: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   788: pop
    //   789: aload #6
    //   791: invokevirtual getModifiers : ()I
    //   794: invokestatic isStatic : (I)Z
    //   797: ifeq -> 892
    //   800: aload #6
    //   802: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   805: arraylength
    //   806: iconst_2
    //   807: if_icmpne -> 892
    //   810: goto -> 817
    //   813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   816: athrow
    //   817: aload #6
    //   819: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   822: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   825: invokevirtual equals : (Ljava/lang/Object;)Z
    //   828: ifeq -> 892
    //   831: goto -> 838
    //   834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   837: athrow
    //   838: aload #6
    //   840: iconst_1
    //   841: invokevirtual setAccessible : (Z)V
    //   844: aload #6
    //   846: aconst_null
    //   847: iconst_2
    //   848: anewarray java/lang/Object
    //   851: dup
    //   852: iconst_0
    //   853: aload_0
    //   854: aastore
    //   855: dup
    //   856: iconst_1
    //   857: aload_1
    //   858: ifnonnull -> 876
    //   861: goto -> 868
    //   864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   867: athrow
    //   868: aload_1
    //   869: goto -> 883
    //   872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   875: athrow
    //   876: aload_1
    //   877: checkcast [B
    //   880: invokevirtual clone : ()Ljava/lang/Object;
    //   883: aastore
    //   884: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   887: pop
    //   888: iload_2
    //   889: ifne -> 906
    //   892: iinc #5, 1
    //   895: iload_2
    //   896: ifne -> 770
    //   899: goto -> 906
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: getstatic burp/Zeoa.ZF : Ljava/lang/Object;
    //   909: checkcast java/math/BigInteger
    //   912: invokevirtual toByteArray : ()[B
    //   915: astore_3
    //   916: bipush #32
    //   918: newarray int
    //   920: dup
    //   921: iconst_0
    //   922: ldc 876216579
    //   924: iastore
    //   925: dup
    //   926: iconst_1
    //   927: ldc 455999525
    //   929: iastore
    //   930: dup
    //   931: iconst_2
    //   932: ldc 1043334948
    //   934: iastore
    //   935: dup
    //   936: iconst_3
    //   937: ldc 439222784
    //   939: iastore
    //   940: dup
    //   941: iconst_4
    //   942: ldc 372376604
    //   944: iastore
    //   945: dup
    //   946: iconst_5
    //   947: ldc 707731490
    //   949: iastore
    //   950: dup
    //   951: bipush #6
    //   953: ldc 389426184
    //   955: iastore
    //   956: dup
    //   957: bipush #7
    //   959: ldc 973875457
    //   961: iastore
    //   962: dup
    //   963: bipush #8
    //   965: ldc 389160971
    //   967: iastore
    //   968: dup
    //   969: bipush #9
    //   971: ldc 907870729
    //   973: iastore
    //   974: dup
    //   975: bipush #10
    //   977: ldc 121057538
    //   979: iastore
    //   980: dup
    //   981: bipush #11
    //   983: ldc 840500228
    //   985: iastore
    //   986: dup
    //   987: bipush #12
    //   989: ldc 254150144
    //   991: iastore
    //   992: dup
    //   993: bipush #13
    //   995: ldc 924386310
    //   997: iastore
    //   998: dup
    //   999: bipush #14
    //   1001: ldc 187632156
    //   1003: iastore
    //   1004: dup
    //   1005: bipush #15
    //   1007: ldc 874189824
    //   1009: iastore
    //   1010: dup
    //   1011: bipush #16
    //   1013: ldc 655302664
    //   1015: iastore
    //   1016: dup
    //   1017: bipush #17
    //   1019: ldc 890966315
    //   1021: iastore
    //   1022: dup
    //   1023: bipush #18
    //   1025: ldc 722417666
    //   1027: iastore
    //   1028: dup
    //   1029: bipush #19
    //   1031: ldc 1026621720
    //   1033: iastore
    //   1034: dup
    //   1035: bipush #20
    //   1037: ldc 957157408
    //   1039: iastore
    //   1040: dup
    //   1041: bipush #21
    //   1043: ldc 892536332
    //   1045: iastore
    //   1046: dup
    //   1047: bipush #22
    //   1049: ldc 689771012
    //   1051: iastore
    //   1052: dup
    //   1053: bipush #23
    //   1055: ldc 221709344
    //   1057: iastore
    //   1058: dup
    //   1059: bipush #24
    //   1061: ldc 940377620
    //   1063: iastore
    //   1064: dup
    //   1065: bipush #25
    //   1067: ldc 255209728
    //   1069: iastore
    //   1070: dup
    //   1071: bipush #26
    //   1073: ldc 1010368540
    //   1075: iastore
    //   1076: dup
    //   1077: bipush #27
    //   1079: ldc 220604441
    //   1081: iastore
    //   1082: dup
    //   1083: bipush #28
    //   1085: ldc 1008414755
    //   1087: iastore
    //   1088: dup
    //   1089: bipush #29
    //   1091: ldc 187049985
    //   1093: iastore
    //   1094: dup
    //   1095: bipush #30
    //   1097: ldc 943331329
    //   1099: iastore
    //   1100: dup
    //   1101: bipush #31
    //   1103: ldc 170788368
    //   1105: iastore
    //   1106: astore #5
    //   1108: bipush #64
    //   1110: newarray int
    //   1112: dup
    //   1113: iconst_0
    //   1114: ldc 16843776
    //   1116: iastore
    //   1117: dup
    //   1118: iconst_1
    //   1119: iconst_0
    //   1120: iastore
    //   1121: dup
    //   1122: iconst_2
    //   1123: ldc 65536
    //   1125: iastore
    //   1126: dup
    //   1127: iconst_3
    //   1128: ldc 16843780
    //   1130: iastore
    //   1131: dup
    //   1132: iconst_4
    //   1133: ldc 16842756
    //   1135: iastore
    //   1136: dup
    //   1137: iconst_5
    //   1138: ldc 66564
    //   1140: iastore
    //   1141: dup
    //   1142: bipush #6
    //   1144: iconst_4
    //   1145: iastore
    //   1146: dup
    //   1147: bipush #7
    //   1149: ldc 65536
    //   1151: iastore
    //   1152: dup
    //   1153: bipush #8
    //   1155: sipush #1024
    //   1158: iastore
    //   1159: dup
    //   1160: bipush #9
    //   1162: ldc 16843776
    //   1164: iastore
    //   1165: dup
    //   1166: bipush #10
    //   1168: ldc 16843780
    //   1170: iastore
    //   1171: dup
    //   1172: bipush #11
    //   1174: sipush #1024
    //   1177: iastore
    //   1178: dup
    //   1179: bipush #12
    //   1181: ldc 16778244
    //   1183: iastore
    //   1184: dup
    //   1185: bipush #13
    //   1187: ldc 16842756
    //   1189: iastore
    //   1190: dup
    //   1191: bipush #14
    //   1193: ldc 16777216
    //   1195: iastore
    //   1196: dup
    //   1197: bipush #15
    //   1199: iconst_4
    //   1200: iastore
    //   1201: dup
    //   1202: bipush #16
    //   1204: sipush #1028
    //   1207: iastore
    //   1208: dup
    //   1209: bipush #17
    //   1211: ldc 16778240
    //   1213: iastore
    //   1214: dup
    //   1215: bipush #18
    //   1217: ldc 16778240
    //   1219: iastore
    //   1220: dup
    //   1221: bipush #19
    //   1223: ldc 66560
    //   1225: iastore
    //   1226: dup
    //   1227: bipush #20
    //   1229: ldc 66560
    //   1231: iastore
    //   1232: dup
    //   1233: bipush #21
    //   1235: ldc 16842752
    //   1237: iastore
    //   1238: dup
    //   1239: bipush #22
    //   1241: ldc 16842752
    //   1243: iastore
    //   1244: dup
    //   1245: bipush #23
    //   1247: ldc 16778244
    //   1249: iastore
    //   1250: dup
    //   1251: bipush #24
    //   1253: ldc 65540
    //   1255: iastore
    //   1256: dup
    //   1257: bipush #25
    //   1259: ldc 16777220
    //   1261: iastore
    //   1262: dup
    //   1263: bipush #26
    //   1265: ldc 16777220
    //   1267: iastore
    //   1268: dup
    //   1269: bipush #27
    //   1271: ldc 65540
    //   1273: iastore
    //   1274: dup
    //   1275: bipush #28
    //   1277: iconst_0
    //   1278: iastore
    //   1279: dup
    //   1280: bipush #29
    //   1282: sipush #1028
    //   1285: iastore
    //   1286: dup
    //   1287: bipush #30
    //   1289: ldc 66564
    //   1291: iastore
    //   1292: dup
    //   1293: bipush #31
    //   1295: ldc 16777216
    //   1297: iastore
    //   1298: dup
    //   1299: bipush #32
    //   1301: ldc 65536
    //   1303: iastore
    //   1304: dup
    //   1305: bipush #33
    //   1307: ldc 16843780
    //   1309: iastore
    //   1310: dup
    //   1311: bipush #34
    //   1313: iconst_4
    //   1314: iastore
    //   1315: dup
    //   1316: bipush #35
    //   1318: ldc 16842752
    //   1320: iastore
    //   1321: dup
    //   1322: bipush #36
    //   1324: ldc 16843776
    //   1326: iastore
    //   1327: dup
    //   1328: bipush #37
    //   1330: ldc 16777216
    //   1332: iastore
    //   1333: dup
    //   1334: bipush #38
    //   1336: ldc 16777216
    //   1338: iastore
    //   1339: dup
    //   1340: bipush #39
    //   1342: sipush #1024
    //   1345: iastore
    //   1346: dup
    //   1347: bipush #40
    //   1349: ldc 16842756
    //   1351: iastore
    //   1352: dup
    //   1353: bipush #41
    //   1355: ldc 65536
    //   1357: iastore
    //   1358: dup
    //   1359: bipush #42
    //   1361: ldc 66560
    //   1363: iastore
    //   1364: dup
    //   1365: bipush #43
    //   1367: ldc 16777220
    //   1369: iastore
    //   1370: dup
    //   1371: bipush #44
    //   1373: sipush #1024
    //   1376: iastore
    //   1377: dup
    //   1378: bipush #45
    //   1380: iconst_4
    //   1381: iastore
    //   1382: dup
    //   1383: bipush #46
    //   1385: ldc 16778244
    //   1387: iastore
    //   1388: dup
    //   1389: bipush #47
    //   1391: ldc 66564
    //   1393: iastore
    //   1394: dup
    //   1395: bipush #48
    //   1397: ldc 16843780
    //   1399: iastore
    //   1400: dup
    //   1401: bipush #49
    //   1403: ldc 65540
    //   1405: iastore
    //   1406: dup
    //   1407: bipush #50
    //   1409: ldc 16842752
    //   1411: iastore
    //   1412: dup
    //   1413: bipush #51
    //   1415: ldc 16778244
    //   1417: iastore
    //   1418: dup
    //   1419: bipush #52
    //   1421: ldc 16777220
    //   1423: iastore
    //   1424: dup
    //   1425: bipush #53
    //   1427: sipush #1028
    //   1430: iastore
    //   1431: dup
    //   1432: bipush #54
    //   1434: ldc 66564
    //   1436: iastore
    //   1437: dup
    //   1438: bipush #55
    //   1440: ldc 16843776
    //   1442: iastore
    //   1443: dup
    //   1444: bipush #56
    //   1446: sipush #1028
    //   1449: iastore
    //   1450: dup
    //   1451: bipush #57
    //   1453: ldc 16778240
    //   1455: iastore
    //   1456: dup
    //   1457: bipush #58
    //   1459: ldc 16778240
    //   1461: iastore
    //   1462: dup
    //   1463: bipush #59
    //   1465: iconst_0
    //   1466: iastore
    //   1467: dup
    //   1468: bipush #60
    //   1470: ldc 65540
    //   1472: iastore
    //   1473: dup
    //   1474: bipush #61
    //   1476: ldc 66560
    //   1478: iastore
    //   1479: dup
    //   1480: bipush #62
    //   1482: iconst_0
    //   1483: iastore
    //   1484: dup
    //   1485: bipush #63
    //   1487: ldc 16842756
    //   1489: iastore
    //   1490: astore #6
    //   1492: bipush #64
    //   1494: newarray int
    //   1496: dup
    //   1497: iconst_0
    //   1498: ldc -2146402272
    //   1500: iastore
    //   1501: dup
    //   1502: iconst_1
    //   1503: ldc -2147450880
    //   1505: iastore
    //   1506: dup
    //   1507: iconst_2
    //   1508: ldc 32768
    //   1510: iastore
    //   1511: dup
    //   1512: iconst_3
    //   1513: ldc 1081376
    //   1515: iastore
    //   1516: dup
    //   1517: iconst_4
    //   1518: ldc 1048576
    //   1520: iastore
    //   1521: dup
    //   1522: iconst_5
    //   1523: bipush #32
    //   1525: iastore
    //   1526: dup
    //   1527: bipush #6
    //   1529: ldc -2146435040
    //   1531: iastore
    //   1532: dup
    //   1533: bipush #7
    //   1535: ldc -2147450848
    //   1537: iastore
    //   1538: dup
    //   1539: bipush #8
    //   1541: ldc -2147483616
    //   1543: iastore
    //   1544: dup
    //   1545: bipush #9
    //   1547: ldc -2146402272
    //   1549: iastore
    //   1550: dup
    //   1551: bipush #10
    //   1553: ldc -2146402304
    //   1555: iastore
    //   1556: dup
    //   1557: bipush #11
    //   1559: ldc -2147483648
    //   1561: iastore
    //   1562: dup
    //   1563: bipush #12
    //   1565: ldc -2147450880
    //   1567: iastore
    //   1568: dup
    //   1569: bipush #13
    //   1571: ldc 1048576
    //   1573: iastore
    //   1574: dup
    //   1575: bipush #14
    //   1577: bipush #32
    //   1579: iastore
    //   1580: dup
    //   1581: bipush #15
    //   1583: ldc -2146435040
    //   1585: iastore
    //   1586: dup
    //   1587: bipush #16
    //   1589: ldc 1081344
    //   1591: iastore
    //   1592: dup
    //   1593: bipush #17
    //   1595: ldc 1048608
    //   1597: iastore
    //   1598: dup
    //   1599: bipush #18
    //   1601: ldc -2147450848
    //   1603: iastore
    //   1604: dup
    //   1605: bipush #19
    //   1607: iconst_0
    //   1608: iastore
    //   1609: dup
    //   1610: bipush #20
    //   1612: ldc -2147483648
    //   1614: iastore
    //   1615: dup
    //   1616: bipush #21
    //   1618: ldc 32768
    //   1620: iastore
    //   1621: dup
    //   1622: bipush #22
    //   1624: ldc 1081376
    //   1626: iastore
    //   1627: dup
    //   1628: bipush #23
    //   1630: ldc -2146435072
    //   1632: iastore
    //   1633: dup
    //   1634: bipush #24
    //   1636: ldc 1048608
    //   1638: iastore
    //   1639: dup
    //   1640: bipush #25
    //   1642: ldc -2147483616
    //   1644: iastore
    //   1645: dup
    //   1646: bipush #26
    //   1648: iconst_0
    //   1649: iastore
    //   1650: dup
    //   1651: bipush #27
    //   1653: ldc 1081344
    //   1655: iastore
    //   1656: dup
    //   1657: bipush #28
    //   1659: ldc 32800
    //   1661: iastore
    //   1662: dup
    //   1663: bipush #29
    //   1665: ldc -2146402304
    //   1667: iastore
    //   1668: dup
    //   1669: bipush #30
    //   1671: ldc -2146435072
    //   1673: iastore
    //   1674: dup
    //   1675: bipush #31
    //   1677: ldc 32800
    //   1679: iastore
    //   1680: dup
    //   1681: bipush #32
    //   1683: iconst_0
    //   1684: iastore
    //   1685: dup
    //   1686: bipush #33
    //   1688: ldc 1081376
    //   1690: iastore
    //   1691: dup
    //   1692: bipush #34
    //   1694: ldc -2146435040
    //   1696: iastore
    //   1697: dup
    //   1698: bipush #35
    //   1700: ldc 1048576
    //   1702: iastore
    //   1703: dup
    //   1704: bipush #36
    //   1706: ldc -2147450848
    //   1708: iastore
    //   1709: dup
    //   1710: bipush #37
    //   1712: ldc -2146435072
    //   1714: iastore
    //   1715: dup
    //   1716: bipush #38
    //   1718: ldc -2146402304
    //   1720: iastore
    //   1721: dup
    //   1722: bipush #39
    //   1724: ldc 32768
    //   1726: iastore
    //   1727: dup
    //   1728: bipush #40
    //   1730: ldc -2146435072
    //   1732: iastore
    //   1733: dup
    //   1734: bipush #41
    //   1736: ldc -2147450880
    //   1738: iastore
    //   1739: dup
    //   1740: bipush #42
    //   1742: bipush #32
    //   1744: iastore
    //   1745: dup
    //   1746: bipush #43
    //   1748: ldc -2146402272
    //   1750: iastore
    //   1751: dup
    //   1752: bipush #44
    //   1754: ldc 1081376
    //   1756: iastore
    //   1757: dup
    //   1758: bipush #45
    //   1760: bipush #32
    //   1762: iastore
    //   1763: dup
    //   1764: bipush #46
    //   1766: ldc 32768
    //   1768: iastore
    //   1769: dup
    //   1770: bipush #47
    //   1772: ldc -2147483648
    //   1774: iastore
    //   1775: dup
    //   1776: bipush #48
    //   1778: ldc 32800
    //   1780: iastore
    //   1781: dup
    //   1782: bipush #49
    //   1784: ldc -2146402304
    //   1786: iastore
    //   1787: dup
    //   1788: bipush #50
    //   1790: ldc 1048576
    //   1792: iastore
    //   1793: dup
    //   1794: bipush #51
    //   1796: ldc -2147483616
    //   1798: iastore
    //   1799: dup
    //   1800: bipush #52
    //   1802: ldc 1048608
    //   1804: iastore
    //   1805: dup
    //   1806: bipush #53
    //   1808: ldc -2147450848
    //   1810: iastore
    //   1811: dup
    //   1812: bipush #54
    //   1814: ldc -2147483616
    //   1816: iastore
    //   1817: dup
    //   1818: bipush #55
    //   1820: ldc 1048608
    //   1822: iastore
    //   1823: dup
    //   1824: bipush #56
    //   1826: ldc 1081344
    //   1828: iastore
    //   1829: dup
    //   1830: bipush #57
    //   1832: iconst_0
    //   1833: iastore
    //   1834: dup
    //   1835: bipush #58
    //   1837: ldc -2147450880
    //   1839: iastore
    //   1840: dup
    //   1841: bipush #59
    //   1843: ldc 32800
    //   1845: iastore
    //   1846: dup
    //   1847: bipush #60
    //   1849: ldc -2147483648
    //   1851: iastore
    //   1852: dup
    //   1853: bipush #61
    //   1855: ldc -2146435040
    //   1857: iastore
    //   1858: dup
    //   1859: bipush #62
    //   1861: ldc -2146402272
    //   1863: iastore
    //   1864: dup
    //   1865: bipush #63
    //   1867: ldc 1081344
    //   1869: iastore
    //   1870: astore #7
    //   1872: bipush #64
    //   1874: newarray int
    //   1876: dup
    //   1877: iconst_0
    //   1878: sipush #520
    //   1881: iastore
    //   1882: dup
    //   1883: iconst_1
    //   1884: ldc 134349312
    //   1886: iastore
    //   1887: dup
    //   1888: iconst_2
    //   1889: iconst_0
    //   1890: iastore
    //   1891: dup
    //   1892: iconst_3
    //   1893: ldc 134348808
    //   1895: iastore
    //   1896: dup
    //   1897: iconst_4
    //   1898: ldc 134218240
    //   1900: iastore
    //   1901: dup
    //   1902: iconst_5
    //   1903: iconst_0
    //   1904: iastore
    //   1905: dup
    //   1906: bipush #6
    //   1908: ldc 131592
    //   1910: iastore
    //   1911: dup
    //   1912: bipush #7
    //   1914: ldc 134218240
    //   1916: iastore
    //   1917: dup
    //   1918: bipush #8
    //   1920: ldc 131080
    //   1922: iastore
    //   1923: dup
    //   1924: bipush #9
    //   1926: ldc 134217736
    //   1928: iastore
    //   1929: dup
    //   1930: bipush #10
    //   1932: ldc 134217736
    //   1934: iastore
    //   1935: dup
    //   1936: bipush #11
    //   1938: ldc 131072
    //   1940: iastore
    //   1941: dup
    //   1942: bipush #12
    //   1944: ldc 134349320
    //   1946: iastore
    //   1947: dup
    //   1948: bipush #13
    //   1950: ldc 131080
    //   1952: iastore
    //   1953: dup
    //   1954: bipush #14
    //   1956: ldc 134348800
    //   1958: iastore
    //   1959: dup
    //   1960: bipush #15
    //   1962: sipush #520
    //   1965: iastore
    //   1966: dup
    //   1967: bipush #16
    //   1969: ldc 134217728
    //   1971: iastore
    //   1972: dup
    //   1973: bipush #17
    //   1975: bipush #8
    //   1977: iastore
    //   1978: dup
    //   1979: bipush #18
    //   1981: ldc 134349312
    //   1983: iastore
    //   1984: dup
    //   1985: bipush #19
    //   1987: sipush #512
    //   1990: iastore
    //   1991: dup
    //   1992: bipush #20
    //   1994: ldc 131584
    //   1996: iastore
    //   1997: dup
    //   1998: bipush #21
    //   2000: ldc 134348800
    //   2002: iastore
    //   2003: dup
    //   2004: bipush #22
    //   2006: ldc 134348808
    //   2008: iastore
    //   2009: dup
    //   2010: bipush #23
    //   2012: ldc 131592
    //   2014: iastore
    //   2015: dup
    //   2016: bipush #24
    //   2018: ldc 134218248
    //   2020: iastore
    //   2021: dup
    //   2022: bipush #25
    //   2024: ldc 131584
    //   2026: iastore
    //   2027: dup
    //   2028: bipush #26
    //   2030: ldc 131072
    //   2032: iastore
    //   2033: dup
    //   2034: bipush #27
    //   2036: ldc 134218248
    //   2038: iastore
    //   2039: dup
    //   2040: bipush #28
    //   2042: bipush #8
    //   2044: iastore
    //   2045: dup
    //   2046: bipush #29
    //   2048: ldc 134349320
    //   2050: iastore
    //   2051: dup
    //   2052: bipush #30
    //   2054: sipush #512
    //   2057: iastore
    //   2058: dup
    //   2059: bipush #31
    //   2061: ldc 134217728
    //   2063: iastore
    //   2064: dup
    //   2065: bipush #32
    //   2067: ldc 134349312
    //   2069: iastore
    //   2070: dup
    //   2071: bipush #33
    //   2073: ldc 134217728
    //   2075: iastore
    //   2076: dup
    //   2077: bipush #34
    //   2079: ldc 131080
    //   2081: iastore
    //   2082: dup
    //   2083: bipush #35
    //   2085: sipush #520
    //   2088: iastore
    //   2089: dup
    //   2090: bipush #36
    //   2092: ldc 131072
    //   2094: iastore
    //   2095: dup
    //   2096: bipush #37
    //   2098: ldc 134349312
    //   2100: iastore
    //   2101: dup
    //   2102: bipush #38
    //   2104: ldc 134218240
    //   2106: iastore
    //   2107: dup
    //   2108: bipush #39
    //   2110: iconst_0
    //   2111: iastore
    //   2112: dup
    //   2113: bipush #40
    //   2115: sipush #512
    //   2118: iastore
    //   2119: dup
    //   2120: bipush #41
    //   2122: ldc 131080
    //   2124: iastore
    //   2125: dup
    //   2126: bipush #42
    //   2128: ldc 134349320
    //   2130: iastore
    //   2131: dup
    //   2132: bipush #43
    //   2134: ldc 134218240
    //   2136: iastore
    //   2137: dup
    //   2138: bipush #44
    //   2140: ldc 134217736
    //   2142: iastore
    //   2143: dup
    //   2144: bipush #45
    //   2146: sipush #512
    //   2149: iastore
    //   2150: dup
    //   2151: bipush #46
    //   2153: iconst_0
    //   2154: iastore
    //   2155: dup
    //   2156: bipush #47
    //   2158: ldc 134348808
    //   2160: iastore
    //   2161: dup
    //   2162: bipush #48
    //   2164: ldc 134218248
    //   2166: iastore
    //   2167: dup
    //   2168: bipush #49
    //   2170: ldc 131072
    //   2172: iastore
    //   2173: dup
    //   2174: bipush #50
    //   2176: ldc 134217728
    //   2178: iastore
    //   2179: dup
    //   2180: bipush #51
    //   2182: ldc 134349320
    //   2184: iastore
    //   2185: dup
    //   2186: bipush #52
    //   2188: bipush #8
    //   2190: iastore
    //   2191: dup
    //   2192: bipush #53
    //   2194: ldc 131592
    //   2196: iastore
    //   2197: dup
    //   2198: bipush #54
    //   2200: ldc 131584
    //   2202: iastore
    //   2203: dup
    //   2204: bipush #55
    //   2206: ldc 134217736
    //   2208: iastore
    //   2209: dup
    //   2210: bipush #56
    //   2212: ldc 134348800
    //   2214: iastore
    //   2215: dup
    //   2216: bipush #57
    //   2218: ldc 134218248
    //   2220: iastore
    //   2221: dup
    //   2222: bipush #58
    //   2224: sipush #520
    //   2227: iastore
    //   2228: dup
    //   2229: bipush #59
    //   2231: ldc 134348800
    //   2233: iastore
    //   2234: dup
    //   2235: bipush #60
    //   2237: ldc 131592
    //   2239: iastore
    //   2240: dup
    //   2241: bipush #61
    //   2243: bipush #8
    //   2245: iastore
    //   2246: dup
    //   2247: bipush #62
    //   2249: ldc 134348808
    //   2251: iastore
    //   2252: dup
    //   2253: bipush #63
    //   2255: ldc 131584
    //   2257: iastore
    //   2258: astore #8
    //   2260: bipush #64
    //   2262: newarray int
    //   2264: dup
    //   2265: iconst_0
    //   2266: ldc 8396801
    //   2268: iastore
    //   2269: dup
    //   2270: iconst_1
    //   2271: sipush #8321
    //   2274: iastore
    //   2275: dup
    //   2276: iconst_2
    //   2277: sipush #8321
    //   2280: iastore
    //   2281: dup
    //   2282: iconst_3
    //   2283: sipush #128
    //   2286: iastore
    //   2287: dup
    //   2288: iconst_4
    //   2289: ldc 8396928
    //   2291: iastore
    //   2292: dup
    //   2293: iconst_5
    //   2294: ldc 8388737
    //   2296: iastore
    //   2297: dup
    //   2298: bipush #6
    //   2300: ldc 8388609
    //   2302: iastore
    //   2303: dup
    //   2304: bipush #7
    //   2306: sipush #8193
    //   2309: iastore
    //   2310: dup
    //   2311: bipush #8
    //   2313: iconst_0
    //   2314: iastore
    //   2315: dup
    //   2316: bipush #9
    //   2318: ldc 8396800
    //   2320: iastore
    //   2321: dup
    //   2322: bipush #10
    //   2324: ldc 8396800
    //   2326: iastore
    //   2327: dup
    //   2328: bipush #11
    //   2330: ldc 8396929
    //   2332: iastore
    //   2333: dup
    //   2334: bipush #12
    //   2336: sipush #129
    //   2339: iastore
    //   2340: dup
    //   2341: bipush #13
    //   2343: iconst_0
    //   2344: iastore
    //   2345: dup
    //   2346: bipush #14
    //   2348: ldc 8388736
    //   2350: iastore
    //   2351: dup
    //   2352: bipush #15
    //   2354: ldc 8388609
    //   2356: iastore
    //   2357: dup
    //   2358: bipush #16
    //   2360: iconst_1
    //   2361: iastore
    //   2362: dup
    //   2363: bipush #17
    //   2365: sipush #8192
    //   2368: iastore
    //   2369: dup
    //   2370: bipush #18
    //   2372: ldc 8388608
    //   2374: iastore
    //   2375: dup
    //   2376: bipush #19
    //   2378: ldc 8396801
    //   2380: iastore
    //   2381: dup
    //   2382: bipush #20
    //   2384: sipush #128
    //   2387: iastore
    //   2388: dup
    //   2389: bipush #21
    //   2391: ldc 8388608
    //   2393: iastore
    //   2394: dup
    //   2395: bipush #22
    //   2397: sipush #8193
    //   2400: iastore
    //   2401: dup
    //   2402: bipush #23
    //   2404: sipush #8320
    //   2407: iastore
    //   2408: dup
    //   2409: bipush #24
    //   2411: ldc 8388737
    //   2413: iastore
    //   2414: dup
    //   2415: bipush #25
    //   2417: iconst_1
    //   2418: iastore
    //   2419: dup
    //   2420: bipush #26
    //   2422: sipush #8320
    //   2425: iastore
    //   2426: dup
    //   2427: bipush #27
    //   2429: ldc 8388736
    //   2431: iastore
    //   2432: dup
    //   2433: bipush #28
    //   2435: sipush #8192
    //   2438: iastore
    //   2439: dup
    //   2440: bipush #29
    //   2442: ldc 8396928
    //   2444: iastore
    //   2445: dup
    //   2446: bipush #30
    //   2448: ldc 8396929
    //   2450: iastore
    //   2451: dup
    //   2452: bipush #31
    //   2454: sipush #129
    //   2457: iastore
    //   2458: dup
    //   2459: bipush #32
    //   2461: ldc 8388736
    //   2463: iastore
    //   2464: dup
    //   2465: bipush #33
    //   2467: ldc 8388609
    //   2469: iastore
    //   2470: dup
    //   2471: bipush #34
    //   2473: ldc 8396800
    //   2475: iastore
    //   2476: dup
    //   2477: bipush #35
    //   2479: ldc 8396929
    //   2481: iastore
    //   2482: dup
    //   2483: bipush #36
    //   2485: sipush #129
    //   2488: iastore
    //   2489: dup
    //   2490: bipush #37
    //   2492: iconst_0
    //   2493: iastore
    //   2494: dup
    //   2495: bipush #38
    //   2497: iconst_0
    //   2498: iastore
    //   2499: dup
    //   2500: bipush #39
    //   2502: ldc 8396800
    //   2504: iastore
    //   2505: dup
    //   2506: bipush #40
    //   2508: sipush #8320
    //   2511: iastore
    //   2512: dup
    //   2513: bipush #41
    //   2515: ldc 8388736
    //   2517: iastore
    //   2518: dup
    //   2519: bipush #42
    //   2521: ldc 8388737
    //   2523: iastore
    //   2524: dup
    //   2525: bipush #43
    //   2527: iconst_1
    //   2528: iastore
    //   2529: dup
    //   2530: bipush #44
    //   2532: ldc 8396801
    //   2534: iastore
    //   2535: dup
    //   2536: bipush #45
    //   2538: sipush #8321
    //   2541: iastore
    //   2542: dup
    //   2543: bipush #46
    //   2545: sipush #8321
    //   2548: iastore
    //   2549: dup
    //   2550: bipush #47
    //   2552: sipush #128
    //   2555: iastore
    //   2556: dup
    //   2557: bipush #48
    //   2559: ldc 8396929
    //   2561: iastore
    //   2562: dup
    //   2563: bipush #49
    //   2565: sipush #129
    //   2568: iastore
    //   2569: dup
    //   2570: bipush #50
    //   2572: iconst_1
    //   2573: iastore
    //   2574: dup
    //   2575: bipush #51
    //   2577: sipush #8192
    //   2580: iastore
    //   2581: dup
    //   2582: bipush #52
    //   2584: ldc 8388609
    //   2586: iastore
    //   2587: dup
    //   2588: bipush #53
    //   2590: sipush #8193
    //   2593: iastore
    //   2594: dup
    //   2595: bipush #54
    //   2597: ldc 8396928
    //   2599: iastore
    //   2600: dup
    //   2601: bipush #55
    //   2603: ldc 8388737
    //   2605: iastore
    //   2606: dup
    //   2607: bipush #56
    //   2609: sipush #8193
    //   2612: iastore
    //   2613: dup
    //   2614: bipush #57
    //   2616: sipush #8320
    //   2619: iastore
    //   2620: dup
    //   2621: bipush #58
    //   2623: ldc 8388608
    //   2625: iastore
    //   2626: dup
    //   2627: bipush #59
    //   2629: ldc 8396801
    //   2631: iastore
    //   2632: dup
    //   2633: bipush #60
    //   2635: sipush #128
    //   2638: iastore
    //   2639: dup
    //   2640: bipush #61
    //   2642: ldc 8388608
    //   2644: iastore
    //   2645: dup
    //   2646: bipush #62
    //   2648: sipush #8192
    //   2651: iastore
    //   2652: dup
    //   2653: bipush #63
    //   2655: ldc 8396928
    //   2657: iastore
    //   2658: astore #9
    //   2660: bipush #64
    //   2662: newarray int
    //   2664: dup
    //   2665: iconst_0
    //   2666: sipush #256
    //   2669: iastore
    //   2670: dup
    //   2671: iconst_1
    //   2672: ldc 34078976
    //   2674: iastore
    //   2675: dup
    //   2676: iconst_2
    //   2677: ldc 34078720
    //   2679: iastore
    //   2680: dup
    //   2681: iconst_3
    //   2682: ldc 1107296512
    //   2684: iastore
    //   2685: dup
    //   2686: iconst_4
    //   2687: ldc 524288
    //   2689: iastore
    //   2690: dup
    //   2691: iconst_5
    //   2692: sipush #256
    //   2695: iastore
    //   2696: dup
    //   2697: bipush #6
    //   2699: ldc 1073741824
    //   2701: iastore
    //   2702: dup
    //   2703: bipush #7
    //   2705: ldc 34078720
    //   2707: iastore
    //   2708: dup
    //   2709: bipush #8
    //   2711: ldc 1074266368
    //   2713: iastore
    //   2714: dup
    //   2715: bipush #9
    //   2717: ldc 524288
    //   2719: iastore
    //   2720: dup
    //   2721: bipush #10
    //   2723: ldc 33554688
    //   2725: iastore
    //   2726: dup
    //   2727: bipush #11
    //   2729: ldc 1074266368
    //   2731: iastore
    //   2732: dup
    //   2733: bipush #12
    //   2735: ldc 1107296512
    //   2737: iastore
    //   2738: dup
    //   2739: bipush #13
    //   2741: ldc 1107820544
    //   2743: iastore
    //   2744: dup
    //   2745: bipush #14
    //   2747: ldc 524544
    //   2749: iastore
    //   2750: dup
    //   2751: bipush #15
    //   2753: ldc 1073741824
    //   2755: iastore
    //   2756: dup
    //   2757: bipush #16
    //   2759: ldc 33554432
    //   2761: iastore
    //   2762: dup
    //   2763: bipush #17
    //   2765: ldc 1074266112
    //   2767: iastore
    //   2768: dup
    //   2769: bipush #18
    //   2771: ldc 1074266112
    //   2773: iastore
    //   2774: dup
    //   2775: bipush #19
    //   2777: iconst_0
    //   2778: iastore
    //   2779: dup
    //   2780: bipush #20
    //   2782: ldc 1073742080
    //   2784: iastore
    //   2785: dup
    //   2786: bipush #21
    //   2788: ldc 1107820800
    //   2790: iastore
    //   2791: dup
    //   2792: bipush #22
    //   2794: ldc 1107820800
    //   2796: iastore
    //   2797: dup
    //   2798: bipush #23
    //   2800: ldc 33554688
    //   2802: iastore
    //   2803: dup
    //   2804: bipush #24
    //   2806: ldc 1107820544
    //   2808: iastore
    //   2809: dup
    //   2810: bipush #25
    //   2812: ldc 1073742080
    //   2814: iastore
    //   2815: dup
    //   2816: bipush #26
    //   2818: iconst_0
    //   2819: iastore
    //   2820: dup
    //   2821: bipush #27
    //   2823: ldc 1107296256
    //   2825: iastore
    //   2826: dup
    //   2827: bipush #28
    //   2829: ldc 34078976
    //   2831: iastore
    //   2832: dup
    //   2833: bipush #29
    //   2835: ldc 33554432
    //   2837: iastore
    //   2838: dup
    //   2839: bipush #30
    //   2841: ldc 1107296256
    //   2843: iastore
    //   2844: dup
    //   2845: bipush #31
    //   2847: ldc 524544
    //   2849: iastore
    //   2850: dup
    //   2851: bipush #32
    //   2853: ldc 524288
    //   2855: iastore
    //   2856: dup
    //   2857: bipush #33
    //   2859: ldc 1107296512
    //   2861: iastore
    //   2862: dup
    //   2863: bipush #34
    //   2865: sipush #256
    //   2868: iastore
    //   2869: dup
    //   2870: bipush #35
    //   2872: ldc 33554432
    //   2874: iastore
    //   2875: dup
    //   2876: bipush #36
    //   2878: ldc 1073741824
    //   2880: iastore
    //   2881: dup
    //   2882: bipush #37
    //   2884: ldc 34078720
    //   2886: iastore
    //   2887: dup
    //   2888: bipush #38
    //   2890: ldc 1107296512
    //   2892: iastore
    //   2893: dup
    //   2894: bipush #39
    //   2896: ldc 1074266368
    //   2898: iastore
    //   2899: dup
    //   2900: bipush #40
    //   2902: ldc 33554688
    //   2904: iastore
    //   2905: dup
    //   2906: bipush #41
    //   2908: ldc 1073741824
    //   2910: iastore
    //   2911: dup
    //   2912: bipush #42
    //   2914: ldc 1107820544
    //   2916: iastore
    //   2917: dup
    //   2918: bipush #43
    //   2920: ldc 34078976
    //   2922: iastore
    //   2923: dup
    //   2924: bipush #44
    //   2926: ldc 1074266368
    //   2928: iastore
    //   2929: dup
    //   2930: bipush #45
    //   2932: sipush #256
    //   2935: iastore
    //   2936: dup
    //   2937: bipush #46
    //   2939: ldc 33554432
    //   2941: iastore
    //   2942: dup
    //   2943: bipush #47
    //   2945: ldc 1107820544
    //   2947: iastore
    //   2948: dup
    //   2949: bipush #48
    //   2951: ldc 1107820800
    //   2953: iastore
    //   2954: dup
    //   2955: bipush #49
    //   2957: ldc 524544
    //   2959: iastore
    //   2960: dup
    //   2961: bipush #50
    //   2963: ldc 1107296256
    //   2965: iastore
    //   2966: dup
    //   2967: bipush #51
    //   2969: ldc 1107820800
    //   2971: iastore
    //   2972: dup
    //   2973: bipush #52
    //   2975: ldc 34078720
    //   2977: iastore
    //   2978: dup
    //   2979: bipush #53
    //   2981: iconst_0
    //   2982: iastore
    //   2983: dup
    //   2984: bipush #54
    //   2986: ldc 1074266112
    //   2988: iastore
    //   2989: dup
    //   2990: bipush #55
    //   2992: ldc 1107296256
    //   2994: iastore
    //   2995: dup
    //   2996: bipush #56
    //   2998: ldc 524544
    //   3000: iastore
    //   3001: dup
    //   3002: bipush #57
    //   3004: ldc 33554688
    //   3006: iastore
    //   3007: dup
    //   3008: bipush #58
    //   3010: ldc 1073742080
    //   3012: iastore
    //   3013: dup
    //   3014: bipush #59
    //   3016: ldc 524288
    //   3018: iastore
    //   3019: dup
    //   3020: bipush #60
    //   3022: iconst_0
    //   3023: iastore
    //   3024: dup
    //   3025: bipush #61
    //   3027: ldc 1074266112
    //   3029: iastore
    //   3030: dup
    //   3031: bipush #62
    //   3033: ldc 34078976
    //   3035: iastore
    //   3036: dup
    //   3037: bipush #63
    //   3039: ldc 1073742080
    //   3041: iastore
    //   3042: astore #10
    //   3044: bipush #64
    //   3046: newarray int
    //   3048: dup
    //   3049: iconst_0
    //   3050: ldc 536870928
    //   3052: iastore
    //   3053: dup
    //   3054: iconst_1
    //   3055: ldc 541065216
    //   3057: iastore
    //   3058: dup
    //   3059: iconst_2
    //   3060: sipush #16384
    //   3063: iastore
    //   3064: dup
    //   3065: iconst_3
    //   3066: ldc 541081616
    //   3068: iastore
    //   3069: dup
    //   3070: iconst_4
    //   3071: ldc 541065216
    //   3073: iastore
    //   3074: dup
    //   3075: iconst_5
    //   3076: bipush #16
    //   3078: iastore
    //   3079: dup
    //   3080: bipush #6
    //   3082: ldc 541081616
    //   3084: iastore
    //   3085: dup
    //   3086: bipush #7
    //   3088: ldc 4194304
    //   3090: iastore
    //   3091: dup
    //   3092: bipush #8
    //   3094: ldc 536887296
    //   3096: iastore
    //   3097: dup
    //   3098: bipush #9
    //   3100: ldc 4210704
    //   3102: iastore
    //   3103: dup
    //   3104: bipush #10
    //   3106: ldc 4194304
    //   3108: iastore
    //   3109: dup
    //   3110: bipush #11
    //   3112: ldc 536870928
    //   3114: iastore
    //   3115: dup
    //   3116: bipush #12
    //   3118: ldc 4194320
    //   3120: iastore
    //   3121: dup
    //   3122: bipush #13
    //   3124: ldc 536887296
    //   3126: iastore
    //   3127: dup
    //   3128: bipush #14
    //   3130: ldc 536870912
    //   3132: iastore
    //   3133: dup
    //   3134: bipush #15
    //   3136: sipush #16400
    //   3139: iastore
    //   3140: dup
    //   3141: bipush #16
    //   3143: iconst_0
    //   3144: iastore
    //   3145: dup
    //   3146: bipush #17
    //   3148: ldc 4194320
    //   3150: iastore
    //   3151: dup
    //   3152: bipush #18
    //   3154: ldc 536887312
    //   3156: iastore
    //   3157: dup
    //   3158: bipush #19
    //   3160: sipush #16384
    //   3163: iastore
    //   3164: dup
    //   3165: bipush #20
    //   3167: ldc 4210688
    //   3169: iastore
    //   3170: dup
    //   3171: bipush #21
    //   3173: ldc 536887312
    //   3175: iastore
    //   3176: dup
    //   3177: bipush #22
    //   3179: bipush #16
    //   3181: iastore
    //   3182: dup
    //   3183: bipush #23
    //   3185: ldc 541065232
    //   3187: iastore
    //   3188: dup
    //   3189: bipush #24
    //   3191: ldc 541065232
    //   3193: iastore
    //   3194: dup
    //   3195: bipush #25
    //   3197: iconst_0
    //   3198: iastore
    //   3199: dup
    //   3200: bipush #26
    //   3202: ldc 4210704
    //   3204: iastore
    //   3205: dup
    //   3206: bipush #27
    //   3208: ldc 541081600
    //   3210: iastore
    //   3211: dup
    //   3212: bipush #28
    //   3214: sipush #16400
    //   3217: iastore
    //   3218: dup
    //   3219: bipush #29
    //   3221: ldc 4210688
    //   3223: iastore
    //   3224: dup
    //   3225: bipush #30
    //   3227: ldc 541081600
    //   3229: iastore
    //   3230: dup
    //   3231: bipush #31
    //   3233: ldc 536870912
    //   3235: iastore
    //   3236: dup
    //   3237: bipush #32
    //   3239: ldc 536887296
    //   3241: iastore
    //   3242: dup
    //   3243: bipush #33
    //   3245: bipush #16
    //   3247: iastore
    //   3248: dup
    //   3249: bipush #34
    //   3251: ldc 541065232
    //   3253: iastore
    //   3254: dup
    //   3255: bipush #35
    //   3257: ldc 4210688
    //   3259: iastore
    //   3260: dup
    //   3261: bipush #36
    //   3263: ldc 541081616
    //   3265: iastore
    //   3266: dup
    //   3267: bipush #37
    //   3269: ldc 4194304
    //   3271: iastore
    //   3272: dup
    //   3273: bipush #38
    //   3275: sipush #16400
    //   3278: iastore
    //   3279: dup
    //   3280: bipush #39
    //   3282: ldc 536870928
    //   3284: iastore
    //   3285: dup
    //   3286: bipush #40
    //   3288: ldc 4194304
    //   3290: iastore
    //   3291: dup
    //   3292: bipush #41
    //   3294: ldc 536887296
    //   3296: iastore
    //   3297: dup
    //   3298: bipush #42
    //   3300: ldc 536870912
    //   3302: iastore
    //   3303: dup
    //   3304: bipush #43
    //   3306: sipush #16400
    //   3309: iastore
    //   3310: dup
    //   3311: bipush #44
    //   3313: ldc 536870928
    //   3315: iastore
    //   3316: dup
    //   3317: bipush #45
    //   3319: ldc 541081616
    //   3321: iastore
    //   3322: dup
    //   3323: bipush #46
    //   3325: ldc 4210688
    //   3327: iastore
    //   3328: dup
    //   3329: bipush #47
    //   3331: ldc 541065216
    //   3333: iastore
    //   3334: dup
    //   3335: bipush #48
    //   3337: ldc 4210704
    //   3339: iastore
    //   3340: dup
    //   3341: bipush #49
    //   3343: ldc 541081600
    //   3345: iastore
    //   3346: dup
    //   3347: bipush #50
    //   3349: iconst_0
    //   3350: iastore
    //   3351: dup
    //   3352: bipush #51
    //   3354: ldc 541065232
    //   3356: iastore
    //   3357: dup
    //   3358: bipush #52
    //   3360: bipush #16
    //   3362: iastore
    //   3363: dup
    //   3364: bipush #53
    //   3366: sipush #16384
    //   3369: iastore
    //   3370: dup
    //   3371: bipush #54
    //   3373: ldc 541065216
    //   3375: iastore
    //   3376: dup
    //   3377: bipush #55
    //   3379: ldc 4210704
    //   3381: iastore
    //   3382: dup
    //   3383: bipush #56
    //   3385: sipush #16384
    //   3388: iastore
    //   3389: dup
    //   3390: bipush #57
    //   3392: ldc 4194320
    //   3394: iastore
    //   3395: dup
    //   3396: bipush #58
    //   3398: ldc 536887312
    //   3400: iastore
    //   3401: dup
    //   3402: bipush #59
    //   3404: iconst_0
    //   3405: iastore
    //   3406: dup
    //   3407: bipush #60
    //   3409: ldc 541081600
    //   3411: iastore
    //   3412: dup
    //   3413: bipush #61
    //   3415: ldc 536870912
    //   3417: iastore
    //   3418: dup
    //   3419: bipush #62
    //   3421: ldc 4194320
    //   3423: iastore
    //   3424: dup
    //   3425: bipush #63
    //   3427: ldc 536887312
    //   3429: iastore
    //   3430: astore #11
    //   3432: bipush #64
    //   3434: newarray int
    //   3436: dup
    //   3437: iconst_0
    //   3438: ldc 2097152
    //   3440: iastore
    //   3441: dup
    //   3442: iconst_1
    //   3443: ldc 69206018
    //   3445: iastore
    //   3446: dup
    //   3447: iconst_2
    //   3448: ldc 67110914
    //   3450: iastore
    //   3451: dup
    //   3452: iconst_3
    //   3453: iconst_0
    //   3454: iastore
    //   3455: dup
    //   3456: iconst_4
    //   3457: sipush #2048
    //   3460: iastore
    //   3461: dup
    //   3462: iconst_5
    //   3463: ldc 67110914
    //   3465: iastore
    //   3466: dup
    //   3467: bipush #6
    //   3469: ldc 2099202
    //   3471: iastore
    //   3472: dup
    //   3473: bipush #7
    //   3475: ldc 69208064
    //   3477: iastore
    //   3478: dup
    //   3479: bipush #8
    //   3481: ldc 69208066
    //   3483: iastore
    //   3484: dup
    //   3485: bipush #9
    //   3487: ldc 2097152
    //   3489: iastore
    //   3490: dup
    //   3491: bipush #10
    //   3493: iconst_0
    //   3494: iastore
    //   3495: dup
    //   3496: bipush #11
    //   3498: ldc 67108866
    //   3500: iastore
    //   3501: dup
    //   3502: bipush #12
    //   3504: iconst_2
    //   3505: iastore
    //   3506: dup
    //   3507: bipush #13
    //   3509: ldc 67108864
    //   3511: iastore
    //   3512: dup
    //   3513: bipush #14
    //   3515: ldc 69206018
    //   3517: iastore
    //   3518: dup
    //   3519: bipush #15
    //   3521: sipush #2050
    //   3524: iastore
    //   3525: dup
    //   3526: bipush #16
    //   3528: ldc 67110912
    //   3530: iastore
    //   3531: dup
    //   3532: bipush #17
    //   3534: ldc 2099202
    //   3536: iastore
    //   3537: dup
    //   3538: bipush #18
    //   3540: ldc 2097154
    //   3542: iastore
    //   3543: dup
    //   3544: bipush #19
    //   3546: ldc 67110912
    //   3548: iastore
    //   3549: dup
    //   3550: bipush #20
    //   3552: ldc 67108866
    //   3554: iastore
    //   3555: dup
    //   3556: bipush #21
    //   3558: ldc 69206016
    //   3560: iastore
    //   3561: dup
    //   3562: bipush #22
    //   3564: ldc 69208064
    //   3566: iastore
    //   3567: dup
    //   3568: bipush #23
    //   3570: ldc 2097154
    //   3572: iastore
    //   3573: dup
    //   3574: bipush #24
    //   3576: ldc 69206016
    //   3578: iastore
    //   3579: dup
    //   3580: bipush #25
    //   3582: sipush #2048
    //   3585: iastore
    //   3586: dup
    //   3587: bipush #26
    //   3589: sipush #2050
    //   3592: iastore
    //   3593: dup
    //   3594: bipush #27
    //   3596: ldc 69208066
    //   3598: iastore
    //   3599: dup
    //   3600: bipush #28
    //   3602: ldc 2099200
    //   3604: iastore
    //   3605: dup
    //   3606: bipush #29
    //   3608: iconst_2
    //   3609: iastore
    //   3610: dup
    //   3611: bipush #30
    //   3613: ldc 67108864
    //   3615: iastore
    //   3616: dup
    //   3617: bipush #31
    //   3619: ldc 2099200
    //   3621: iastore
    //   3622: dup
    //   3623: bipush #32
    //   3625: ldc 67108864
    //   3627: iastore
    //   3628: dup
    //   3629: bipush #33
    //   3631: ldc 2099200
    //   3633: iastore
    //   3634: dup
    //   3635: bipush #34
    //   3637: ldc 2097152
    //   3639: iastore
    //   3640: dup
    //   3641: bipush #35
    //   3643: ldc 67110914
    //   3645: iastore
    //   3646: dup
    //   3647: bipush #36
    //   3649: ldc 67110914
    //   3651: iastore
    //   3652: dup
    //   3653: bipush #37
    //   3655: ldc 69206018
    //   3657: iastore
    //   3658: dup
    //   3659: bipush #38
    //   3661: ldc 69206018
    //   3663: iastore
    //   3664: dup
    //   3665: bipush #39
    //   3667: iconst_2
    //   3668: iastore
    //   3669: dup
    //   3670: bipush #40
    //   3672: ldc 2097154
    //   3674: iastore
    //   3675: dup
    //   3676: bipush #41
    //   3678: ldc 67108864
    //   3680: iastore
    //   3681: dup
    //   3682: bipush #42
    //   3684: ldc 67110912
    //   3686: iastore
    //   3687: dup
    //   3688: bipush #43
    //   3690: ldc 2097152
    //   3692: iastore
    //   3693: dup
    //   3694: bipush #44
    //   3696: ldc 69208064
    //   3698: iastore
    //   3699: dup
    //   3700: bipush #45
    //   3702: sipush #2050
    //   3705: iastore
    //   3706: dup
    //   3707: bipush #46
    //   3709: ldc 2099202
    //   3711: iastore
    //   3712: dup
    //   3713: bipush #47
    //   3715: ldc 69208064
    //   3717: iastore
    //   3718: dup
    //   3719: bipush #48
    //   3721: sipush #2050
    //   3724: iastore
    //   3725: dup
    //   3726: bipush #49
    //   3728: ldc 67108866
    //   3730: iastore
    //   3731: dup
    //   3732: bipush #50
    //   3734: ldc 69208066
    //   3736: iastore
    //   3737: dup
    //   3738: bipush #51
    //   3740: ldc 69206016
    //   3742: iastore
    //   3743: dup
    //   3744: bipush #52
    //   3746: ldc 2099200
    //   3748: iastore
    //   3749: dup
    //   3750: bipush #53
    //   3752: iconst_0
    //   3753: iastore
    //   3754: dup
    //   3755: bipush #54
    //   3757: iconst_2
    //   3758: iastore
    //   3759: dup
    //   3760: bipush #55
    //   3762: ldc 69208066
    //   3764: iastore
    //   3765: dup
    //   3766: bipush #56
    //   3768: iconst_0
    //   3769: iastore
    //   3770: dup
    //   3771: bipush #57
    //   3773: ldc 2099202
    //   3775: iastore
    //   3776: dup
    //   3777: bipush #58
    //   3779: ldc 69206016
    //   3781: iastore
    //   3782: dup
    //   3783: bipush #59
    //   3785: sipush #2048
    //   3788: iastore
    //   3789: dup
    //   3790: bipush #60
    //   3792: ldc 67108866
    //   3794: iastore
    //   3795: dup
    //   3796: bipush #61
    //   3798: ldc 67110912
    //   3800: iastore
    //   3801: dup
    //   3802: bipush #62
    //   3804: sipush #2048
    //   3807: iastore
    //   3808: dup
    //   3809: bipush #63
    //   3811: ldc 2097154
    //   3813: iastore
    //   3814: astore #12
    //   3816: bipush #64
    //   3818: newarray int
    //   3820: dup
    //   3821: iconst_0
    //   3822: ldc 268439616
    //   3824: iastore
    //   3825: dup
    //   3826: iconst_1
    //   3827: sipush #4096
    //   3830: iastore
    //   3831: dup
    //   3832: iconst_2
    //   3833: ldc 262144
    //   3835: iastore
    //   3836: dup
    //   3837: iconst_3
    //   3838: ldc 268701760
    //   3840: iastore
    //   3841: dup
    //   3842: iconst_4
    //   3843: ldc 268435456
    //   3845: iastore
    //   3846: dup
    //   3847: iconst_5
    //   3848: ldc 268439616
    //   3850: iastore
    //   3851: dup
    //   3852: bipush #6
    //   3854: bipush #64
    //   3856: iastore
    //   3857: dup
    //   3858: bipush #7
    //   3860: ldc 268435456
    //   3862: iastore
    //   3863: dup
    //   3864: bipush #8
    //   3866: ldc 262208
    //   3868: iastore
    //   3869: dup
    //   3870: bipush #9
    //   3872: ldc 268697600
    //   3874: iastore
    //   3875: dup
    //   3876: bipush #10
    //   3878: ldc 268701760
    //   3880: iastore
    //   3881: dup
    //   3882: bipush #11
    //   3884: ldc 266240
    //   3886: iastore
    //   3887: dup
    //   3888: bipush #12
    //   3890: ldc 268701696
    //   3892: iastore
    //   3893: dup
    //   3894: bipush #13
    //   3896: ldc 266304
    //   3898: iastore
    //   3899: dup
    //   3900: bipush #14
    //   3902: sipush #4096
    //   3905: iastore
    //   3906: dup
    //   3907: bipush #15
    //   3909: bipush #64
    //   3911: iastore
    //   3912: dup
    //   3913: bipush #16
    //   3915: ldc 268697600
    //   3917: iastore
    //   3918: dup
    //   3919: bipush #17
    //   3921: ldc 268435520
    //   3923: iastore
    //   3924: dup
    //   3925: bipush #18
    //   3927: ldc 268439552
    //   3929: iastore
    //   3930: dup
    //   3931: bipush #19
    //   3933: sipush #4160
    //   3936: iastore
    //   3937: dup
    //   3938: bipush #20
    //   3940: ldc 266240
    //   3942: iastore
    //   3943: dup
    //   3944: bipush #21
    //   3946: ldc 262208
    //   3948: iastore
    //   3949: dup
    //   3950: bipush #22
    //   3952: ldc 268697664
    //   3954: iastore
    //   3955: dup
    //   3956: bipush #23
    //   3958: ldc 268701696
    //   3960: iastore
    //   3961: dup
    //   3962: bipush #24
    //   3964: sipush #4160
    //   3967: iastore
    //   3968: dup
    //   3969: bipush #25
    //   3971: iconst_0
    //   3972: iastore
    //   3973: dup
    //   3974: bipush #26
    //   3976: iconst_0
    //   3977: iastore
    //   3978: dup
    //   3979: bipush #27
    //   3981: ldc 268697664
    //   3983: iastore
    //   3984: dup
    //   3985: bipush #28
    //   3987: ldc 268435520
    //   3989: iastore
    //   3990: dup
    //   3991: bipush #29
    //   3993: ldc 268439552
    //   3995: iastore
    //   3996: dup
    //   3997: bipush #30
    //   3999: ldc 266304
    //   4001: iastore
    //   4002: dup
    //   4003: bipush #31
    //   4005: ldc 262144
    //   4007: iastore
    //   4008: dup
    //   4009: bipush #32
    //   4011: ldc 266304
    //   4013: iastore
    //   4014: dup
    //   4015: bipush #33
    //   4017: ldc 262144
    //   4019: iastore
    //   4020: dup
    //   4021: bipush #34
    //   4023: ldc 268701696
    //   4025: iastore
    //   4026: dup
    //   4027: bipush #35
    //   4029: sipush #4096
    //   4032: iastore
    //   4033: dup
    //   4034: bipush #36
    //   4036: bipush #64
    //   4038: iastore
    //   4039: dup
    //   4040: bipush #37
    //   4042: ldc 268697664
    //   4044: iastore
    //   4045: dup
    //   4046: bipush #38
    //   4048: sipush #4096
    //   4051: iastore
    //   4052: dup
    //   4053: bipush #39
    //   4055: ldc 266304
    //   4057: iastore
    //   4058: dup
    //   4059: bipush #40
    //   4061: ldc 268439552
    //   4063: iastore
    //   4064: dup
    //   4065: bipush #41
    //   4067: bipush #64
    //   4069: iastore
    //   4070: dup
    //   4071: bipush #42
    //   4073: ldc 268435520
    //   4075: iastore
    //   4076: dup
    //   4077: bipush #43
    //   4079: ldc 268697600
    //   4081: iastore
    //   4082: dup
    //   4083: bipush #44
    //   4085: ldc 268697664
    //   4087: iastore
    //   4088: dup
    //   4089: bipush #45
    //   4091: ldc 268435456
    //   4093: iastore
    //   4094: dup
    //   4095: bipush #46
    //   4097: ldc 262144
    //   4099: iastore
    //   4100: dup
    //   4101: bipush #47
    //   4103: ldc 268439616
    //   4105: iastore
    //   4106: dup
    //   4107: bipush #48
    //   4109: iconst_0
    //   4110: iastore
    //   4111: dup
    //   4112: bipush #49
    //   4114: ldc 268701760
    //   4116: iastore
    //   4117: dup
    //   4118: bipush #50
    //   4120: ldc 262208
    //   4122: iastore
    //   4123: dup
    //   4124: bipush #51
    //   4126: ldc 268435520
    //   4128: iastore
    //   4129: dup
    //   4130: bipush #52
    //   4132: ldc 268697600
    //   4134: iastore
    //   4135: dup
    //   4136: bipush #53
    //   4138: ldc 268439552
    //   4140: iastore
    //   4141: dup
    //   4142: bipush #54
    //   4144: ldc 268439616
    //   4146: iastore
    //   4147: dup
    //   4148: bipush #55
    //   4150: iconst_0
    //   4151: iastore
    //   4152: dup
    //   4153: bipush #56
    //   4155: ldc 268701760
    //   4157: iastore
    //   4158: dup
    //   4159: bipush #57
    //   4161: ldc 266240
    //   4163: iastore
    //   4164: dup
    //   4165: bipush #58
    //   4167: ldc 266240
    //   4169: iastore
    //   4170: dup
    //   4171: bipush #59
    //   4173: sipush #4160
    //   4176: iastore
    //   4177: dup
    //   4178: bipush #60
    //   4180: sipush #4160
    //   4183: iastore
    //   4184: dup
    //   4185: bipush #61
    //   4187: ldc 262208
    //   4189: iastore
    //   4190: dup
    //   4191: bipush #62
    //   4193: ldc 268435456
    //   4195: iastore
    //   4196: dup
    //   4197: bipush #63
    //   4199: ldc 268701696
    //   4201: iastore
    //   4202: astore #13
    //   4204: aload_3
    //   4205: arraylength
    //   4206: istore #14
    //   4208: iload #14
    //   4210: bipush #8
    //   4212: irem
    //   4213: ifeq -> 4237
    //   4216: new java/lang/Exception
    //   4219: dup
    //   4220: sipush #28310
    //   4223: sipush #-6049
    //   4226: invokestatic a : (II)Ljava/lang/String;
    //   4229: invokespecial <init> : (Ljava/lang/String;)V
    //   4232: athrow
    //   4233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4236: athrow
    //   4237: iconst_2
    //   4238: newarray int
    //   4240: astore #15
    //   4242: iload #14
    //   4244: newarray byte
    //   4246: astore #16
    //   4248: iload #14
    //   4250: bipush #8
    //   4252: idiv
    //   4253: istore #17
    //   4255: iconst_0
    //   4256: istore #18
    //   4258: iload #18
    //   4260: iload #17
    //   4262: if_icmpge -> 5176
    //   4265: iload #18
    //   4267: bipush #8
    //   4269: imul
    //   4270: istore #19
    //   4272: iconst_0
    //   4273: istore #20
    //   4275: iload #20
    //   4277: iconst_2
    //   4278: if_icmpge -> 4363
    //   4281: aload #15
    //   4283: iload #20
    //   4285: aload_3
    //   4286: iload #19
    //   4288: iload #20
    //   4290: iconst_4
    //   4291: imul
    //   4292: iadd
    //   4293: baload
    //   4294: sipush #255
    //   4297: iand
    //   4298: bipush #24
    //   4300: ishl
    //   4301: aload_3
    //   4302: iload #19
    //   4304: iload #20
    //   4306: iconst_4
    //   4307: imul
    //   4308: iadd
    //   4309: iconst_1
    //   4310: iadd
    //   4311: baload
    //   4312: sipush #255
    //   4315: iand
    //   4316: bipush #16
    //   4318: ishl
    //   4319: ior
    //   4320: aload_3
    //   4321: iload #19
    //   4323: iload #20
    //   4325: iconst_4
    //   4326: imul
    //   4327: iadd
    //   4328: iconst_2
    //   4329: iadd
    //   4330: baload
    //   4331: sipush #255
    //   4334: iand
    //   4335: bipush #8
    //   4337: ishl
    //   4338: ior
    //   4339: aload_3
    //   4340: iload #19
    //   4342: iload #20
    //   4344: iconst_4
    //   4345: imul
    //   4346: iadd
    //   4347: iconst_3
    //   4348: iadd
    //   4349: baload
    //   4350: sipush #255
    //   4353: iand
    //   4354: ior
    //   4355: iastore
    //   4356: iinc #20, 1
    //   4359: iload_2
    //   4360: ifne -> 4275
    //   4363: iconst_0
    //   4364: istore #25
    //   4366: aload #15
    //   4368: iconst_0
    //   4369: iaload
    //   4370: istore #23
    //   4372: aload #15
    //   4374: iconst_1
    //   4375: iaload
    //   4376: istore #22
    //   4378: iload #23
    //   4380: iconst_4
    //   4381: iushr
    //   4382: iload #22
    //   4384: ixor
    //   4385: ldc 252645135
    //   4387: iand
    //   4388: istore #21
    //   4390: iload #22
    //   4392: iload #21
    //   4394: ixor
    //   4395: istore #22
    //   4397: iload #23
    //   4399: iload #21
    //   4401: iconst_4
    //   4402: ishl
    //   4403: ixor
    //   4404: istore #23
    //   4406: iload #23
    //   4408: bipush #16
    //   4410: iushr
    //   4411: iload #22
    //   4413: ixor
    //   4414: ldc 65535
    //   4416: iand
    //   4417: istore #21
    //   4419: iload #22
    //   4421: iload #21
    //   4423: ixor
    //   4424: istore #22
    //   4426: iload #23
    //   4428: iload #21
    //   4430: bipush #16
    //   4432: ishl
    //   4433: ixor
    //   4434: istore #23
    //   4436: iload #22
    //   4438: iconst_2
    //   4439: iushr
    //   4440: iload #23
    //   4442: ixor
    //   4443: ldc 858993459
    //   4445: iand
    //   4446: istore #21
    //   4448: iload #23
    //   4450: iload #21
    //   4452: ixor
    //   4453: istore #23
    //   4455: iload #22
    //   4457: iload #21
    //   4459: iconst_2
    //   4460: ishl
    //   4461: ixor
    //   4462: istore #22
    //   4464: iload #22
    //   4466: bipush #8
    //   4468: iushr
    //   4469: iload #23
    //   4471: ixor
    //   4472: ldc 16711935
    //   4474: iand
    //   4475: istore #21
    //   4477: iload #23
    //   4479: iload #21
    //   4481: ixor
    //   4482: istore #23
    //   4484: iload #22
    //   4486: iload #21
    //   4488: bipush #8
    //   4490: ishl
    //   4491: ixor
    //   4492: istore #22
    //   4494: iload #22
    //   4496: iconst_1
    //   4497: ishl
    //   4498: iload #22
    //   4500: bipush #31
    //   4502: iushr
    //   4503: iconst_1
    //   4504: iand
    //   4505: ior
    //   4506: istore #22
    //   4508: iload #23
    //   4510: iload #22
    //   4512: ixor
    //   4513: ldc -1431655766
    //   4515: iand
    //   4516: istore #21
    //   4518: iload #23
    //   4520: iload #21
    //   4522: ixor
    //   4523: istore #23
    //   4525: iload #22
    //   4527: iload #21
    //   4529: ixor
    //   4530: istore #22
    //   4532: iload #23
    //   4534: iconst_1
    //   4535: ishl
    //   4536: iload #23
    //   4538: bipush #31
    //   4540: iushr
    //   4541: iconst_1
    //   4542: iand
    //   4543: ior
    //   4544: istore #23
    //   4546: iconst_0
    //   4547: istore #24
    //   4549: iload #24
    //   4551: bipush #8
    //   4553: if_icmpge -> 4891
    //   4556: iload #22
    //   4558: bipush #28
    //   4560: ishl
    //   4561: iload #22
    //   4563: iconst_4
    //   4564: iushr
    //   4565: ior
    //   4566: istore #21
    //   4568: iload #21
    //   4570: aload #5
    //   4572: iload #25
    //   4574: iinc #25, 1
    //   4577: iaload
    //   4578: ixor
    //   4579: istore #21
    //   4581: aload #12
    //   4583: iload #21
    //   4585: bipush #63
    //   4587: iand
    //   4588: iaload
    //   4589: istore #20
    //   4591: iload #20
    //   4593: aload #10
    //   4595: iload #21
    //   4597: bipush #8
    //   4599: iushr
    //   4600: bipush #63
    //   4602: iand
    //   4603: iaload
    //   4604: ior
    //   4605: istore #20
    //   4607: iload #20
    //   4609: aload #8
    //   4611: iload #21
    //   4613: bipush #16
    //   4615: iushr
    //   4616: bipush #63
    //   4618: iand
    //   4619: iaload
    //   4620: ior
    //   4621: istore #20
    //   4623: iload #20
    //   4625: aload #6
    //   4627: iload #21
    //   4629: bipush #24
    //   4631: iushr
    //   4632: bipush #63
    //   4634: iand
    //   4635: iaload
    //   4636: ior
    //   4637: istore #20
    //   4639: iload #22
    //   4641: aload #5
    //   4643: iload #25
    //   4645: iinc #25, 1
    //   4648: iaload
    //   4649: ixor
    //   4650: istore #21
    //   4652: iload #20
    //   4654: aload #13
    //   4656: iload #21
    //   4658: bipush #63
    //   4660: iand
    //   4661: iaload
    //   4662: ior
    //   4663: istore #20
    //   4665: iload #20
    //   4667: aload #11
    //   4669: iload #21
    //   4671: bipush #8
    //   4673: iushr
    //   4674: bipush #63
    //   4676: iand
    //   4677: iaload
    //   4678: ior
    //   4679: istore #20
    //   4681: iload #20
    //   4683: aload #9
    //   4685: iload #21
    //   4687: bipush #16
    //   4689: iushr
    //   4690: bipush #63
    //   4692: iand
    //   4693: iaload
    //   4694: ior
    //   4695: istore #20
    //   4697: iload #20
    //   4699: aload #7
    //   4701: iload #21
    //   4703: bipush #24
    //   4705: iushr
    //   4706: bipush #63
    //   4708: iand
    //   4709: iaload
    //   4710: ior
    //   4711: istore #20
    //   4713: iload #23
    //   4715: iload #20
    //   4717: ixor
    //   4718: istore #23
    //   4720: iload #23
    //   4722: bipush #28
    //   4724: ishl
    //   4725: iload #23
    //   4727: iconst_4
    //   4728: iushr
    //   4729: ior
    //   4730: istore #21
    //   4732: iload #21
    //   4734: aload #5
    //   4736: iload #25
    //   4738: iinc #25, 1
    //   4741: iaload
    //   4742: ixor
    //   4743: istore #21
    //   4745: aload #12
    //   4747: iload #21
    //   4749: bipush #63
    //   4751: iand
    //   4752: iaload
    //   4753: istore #20
    //   4755: iload #20
    //   4757: aload #10
    //   4759: iload #21
    //   4761: bipush #8
    //   4763: iushr
    //   4764: bipush #63
    //   4766: iand
    //   4767: iaload
    //   4768: ior
    //   4769: istore #20
    //   4771: iload #20
    //   4773: aload #8
    //   4775: iload #21
    //   4777: bipush #16
    //   4779: iushr
    //   4780: bipush #63
    //   4782: iand
    //   4783: iaload
    //   4784: ior
    //   4785: istore #20
    //   4787: iload #20
    //   4789: aload #6
    //   4791: iload #21
    //   4793: bipush #24
    //   4795: iushr
    //   4796: bipush #63
    //   4798: iand
    //   4799: iaload
    //   4800: ior
    //   4801: istore #20
    //   4803: iload #23
    //   4805: aload #5
    //   4807: iload #25
    //   4809: iinc #25, 1
    //   4812: iaload
    //   4813: ixor
    //   4814: istore #21
    //   4816: iload #20
    //   4818: aload #13
    //   4820: iload #21
    //   4822: bipush #63
    //   4824: iand
    //   4825: iaload
    //   4826: ior
    //   4827: istore #20
    //   4829: iload #20
    //   4831: aload #11
    //   4833: iload #21
    //   4835: bipush #8
    //   4837: iushr
    //   4838: bipush #63
    //   4840: iand
    //   4841: iaload
    //   4842: ior
    //   4843: istore #20
    //   4845: iload #20
    //   4847: aload #9
    //   4849: iload #21
    //   4851: bipush #16
    //   4853: iushr
    //   4854: bipush #63
    //   4856: iand
    //   4857: iaload
    //   4858: ior
    //   4859: istore #20
    //   4861: iload #20
    //   4863: aload #7
    //   4865: iload #21
    //   4867: bipush #24
    //   4869: iushr
    //   4870: bipush #63
    //   4872: iand
    //   4873: iaload
    //   4874: ior
    //   4875: istore #20
    //   4877: iload #22
    //   4879: iload #20
    //   4881: ixor
    //   4882: istore #22
    //   4884: iinc #24, 1
    //   4887: iload_2
    //   4888: ifne -> 4549
    //   4891: iload #22
    //   4893: bipush #31
    //   4895: ishl
    //   4896: iload #22
    //   4898: iconst_1
    //   4899: iushr
    //   4900: ior
    //   4901: istore #22
    //   4903: iload #23
    //   4905: iload #22
    //   4907: ixor
    //   4908: ldc -1431655766
    //   4910: iand
    //   4911: istore #21
    //   4913: iload #23
    //   4915: iload #21
    //   4917: ixor
    //   4918: istore #23
    //   4920: iload #22
    //   4922: iload #21
    //   4924: ixor
    //   4925: istore #22
    //   4927: iload #23
    //   4929: bipush #31
    //   4931: ishl
    //   4932: iload #23
    //   4934: iconst_1
    //   4935: iushr
    //   4936: ior
    //   4937: istore #23
    //   4939: iload #23
    //   4941: bipush #8
    //   4943: iushr
    //   4944: iload #22
    //   4946: ixor
    //   4947: ldc 16711935
    //   4949: iand
    //   4950: istore #21
    //   4952: iload #22
    //   4954: iload #21
    //   4956: ixor
    //   4957: istore #22
    //   4959: iload #23
    //   4961: iload #21
    //   4963: bipush #8
    //   4965: ishl
    //   4966: ixor
    //   4967: istore #23
    //   4969: iload #23
    //   4971: iconst_2
    //   4972: iushr
    //   4973: iload #22
    //   4975: ixor
    //   4976: ldc 858993459
    //   4978: iand
    //   4979: istore #21
    //   4981: iload #22
    //   4983: iload #21
    //   4985: ixor
    //   4986: istore #22
    //   4988: iload #23
    //   4990: iload #21
    //   4992: iconst_2
    //   4993: ishl
    //   4994: ixor
    //   4995: istore #23
    //   4997: iload #22
    //   4999: bipush #16
    //   5001: iushr
    //   5002: iload #23
    //   5004: ixor
    //   5005: ldc 65535
    //   5007: iand
    //   5008: istore #21
    //   5010: iload #23
    //   5012: iload #21
    //   5014: ixor
    //   5015: istore #23
    //   5017: iload #22
    //   5019: iload #21
    //   5021: bipush #16
    //   5023: ishl
    //   5024: ixor
    //   5025: istore #22
    //   5027: iload #22
    //   5029: iconst_4
    //   5030: iushr
    //   5031: iload #23
    //   5033: ixor
    //   5034: ldc 252645135
    //   5036: iand
    //   5037: istore #21
    //   5039: iload #23
    //   5041: iload #21
    //   5043: ixor
    //   5044: istore #23
    //   5046: iload #22
    //   5048: iload #21
    //   5050: iconst_4
    //   5051: ishl
    //   5052: ixor
    //   5053: istore #22
    //   5055: aload #15
    //   5057: iconst_0
    //   5058: iload #22
    //   5060: iastore
    //   5061: aload #15
    //   5063: iconst_1
    //   5064: iload #23
    //   5066: iastore
    //   5067: iload #18
    //   5069: bipush #8
    //   5071: imul
    //   5072: istore #26
    //   5074: iconst_0
    //   5075: istore #27
    //   5077: iload #27
    //   5079: iconst_2
    //   5080: if_icmpge -> 5169
    //   5083: aload #16
    //   5085: iload #26
    //   5087: iload #27
    //   5089: iconst_4
    //   5090: imul
    //   5091: iadd
    //   5092: aload #15
    //   5094: iload #27
    //   5096: iaload
    //   5097: bipush #24
    //   5099: iushr
    //   5100: i2b
    //   5101: bastore
    //   5102: aload #16
    //   5104: iload #26
    //   5106: iload #27
    //   5108: iconst_4
    //   5109: imul
    //   5110: iadd
    //   5111: iconst_1
    //   5112: iadd
    //   5113: aload #15
    //   5115: iload #27
    //   5117: iaload
    //   5118: bipush #16
    //   5120: iushr
    //   5121: i2b
    //   5122: bastore
    //   5123: aload #16
    //   5125: iload #26
    //   5127: iload #27
    //   5129: iconst_4
    //   5130: imul
    //   5131: iadd
    //   5132: iconst_2
    //   5133: iadd
    //   5134: aload #15
    //   5136: iload #27
    //   5138: iaload
    //   5139: bipush #8
    //   5141: iushr
    //   5142: i2b
    //   5143: bastore
    //   5144: aload #16
    //   5146: iload #26
    //   5148: iload #27
    //   5150: iconst_4
    //   5151: imul
    //   5152: iadd
    //   5153: iconst_3
    //   5154: iadd
    //   5155: aload #15
    //   5157: iload #27
    //   5159: iaload
    //   5160: i2b
    //   5161: bastore
    //   5162: iinc #27, 1
    //   5165: iload_2
    //   5166: ifne -> 5077
    //   5169: iinc #18, 1
    //   5172: iload_2
    //   5173: ifne -> 4258
    //   5176: aload #16
    //   5178: aload #16
    //   5180: arraylength
    //   5181: iconst_1
    //   5182: isub
    //   5183: baload
    //   5184: istore #18
    //   5186: aload #16
    //   5188: arraylength
    //   5189: iload #18
    //   5191: isub
    //   5192: newarray byte
    //   5194: astore #4
    //   5196: aload #16
    //   5198: arraylength
    //   5199: aload #4
    //   5201: arraylength
    //   5202: if_icmpge -> 5226
    //   5205: new java/lang/Exception
    //   5208: dup
    //   5209: sipush #28292
    //   5212: sipush #14708
    //   5215: invokestatic a : (II)Ljava/lang/String;
    //   5218: invokespecial <init> : (Ljava/lang/String;)V
    //   5221: athrow
    //   5222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5225: athrow
    //   5226: iconst_0
    //   5227: istore #19
    //   5229: iload #19
    //   5231: aload #4
    //   5233: arraylength
    //   5234: if_icmpge -> 5254
    //   5237: aload #4
    //   5239: iload #19
    //   5241: aload #16
    //   5243: iload #19
    //   5245: baload
    //   5246: bastore
    //   5247: iinc #19, 1
    //   5250: iload_2
    //   5251: ifne -> 5229
    //   5254: new java/io/ByteArrayOutputStream
    //   5257: dup
    //   5258: invokespecial <init> : ()V
    //   5261: astore_3
    //   5262: sipush #28300
    //   5265: aload_3
    //   5266: sipush #202
    //   5269: invokevirtual write : (I)V
    //   5272: sipush #-17174
    //   5275: aload_3
    //   5276: sipush #254
    //   5279: invokevirtual write : (I)V
    //   5282: aload_3
    //   5283: sipush #186
    //   5286: invokevirtual write : (I)V
    //   5289: aload_3
    //   5290: sipush #190
    //   5293: invokevirtual write : (I)V
    //   5296: aload_3
    //   5297: iconst_0
    //   5298: invokevirtual write : (I)V
    //   5301: aload_3
    //   5302: iconst_1
    //   5303: invokevirtual write : (I)V
    //   5306: aload_3
    //   5307: iconst_0
    //   5308: invokevirtual write : (I)V
    //   5311: aload_3
    //   5312: bipush #50
    //   5314: invokevirtual write : (I)V
    //   5317: aload_3
    //   5318: getstatic burp/Zedz.Za : Ljava/lang/Object;
    //   5321: checkcast java/math/BigInteger
    //   5324: invokevirtual toByteArray : ()[B
    //   5327: invokevirtual write : ([B)V
    //   5330: aload_3
    //   5331: getstatic burp/Zlp8.Zu : Ljava/lang/Object;
    //   5334: checkcast java/math/BigInteger
    //   5337: invokevirtual toByteArray : ()[B
    //   5340: invokevirtual write : ([B)V
    //   5343: aload_3
    //   5344: getstatic burp/Zghe.ZJ : Ljava/lang/Object;
    //   5347: checkcast java/math/BigInteger
    //   5350: invokevirtual toByteArray : ()[B
    //   5353: invokevirtual write : ([B)V
    //   5356: aload_3
    //   5357: invokevirtual toByteArray : ()[B
    //   5360: astore #4
    //   5362: aconst_null
    //   5363: astore #5
    //   5365: invokestatic a : (II)Ljava/lang/String;
    //   5368: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5371: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5374: astore #6
    //   5376: aload #6
    //   5378: arraylength
    //   5379: istore #7
    //   5381: iconst_0
    //   5382: istore #8
    //   5384: iload #8
    //   5386: iload #7
    //   5388: if_icmpge -> 5516
    //   5391: aload #6
    //   5393: iload #8
    //   5395: aaload
    //   5396: astore #9
    //   5398: aload #9
    //   5400: invokevirtual getName : ()Ljava/lang/String;
    //   5403: sipush #28314
    //   5406: sipush #18657
    //   5409: invokestatic a : (II)Ljava/lang/String;
    //   5412: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5415: ifeq -> 5509
    //   5418: aload #9
    //   5420: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5423: astore #10
    //   5425: aload #10
    //   5427: arraylength
    //   5428: iconst_4
    //   5429: if_icmpeq -> 5439
    //   5432: goto -> 5509
    //   5435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5438: athrow
    //   5439: aload #10
    //   5441: iconst_0
    //   5442: aaload
    //   5443: ldc java/lang/String
    //   5445: if_acmpeq -> 5455
    //   5448: goto -> 5509
    //   5451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5454: athrow
    //   5455: aload #10
    //   5457: iconst_1
    //   5458: aaload
    //   5459: ldc [B
    //   5461: if_acmpeq -> 5471
    //   5464: goto -> 5509
    //   5467: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5470: athrow
    //   5471: aload #10
    //   5473: iconst_2
    //   5474: aaload
    //   5475: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   5478: if_acmpeq -> 5488
    //   5481: goto -> 5509
    //   5484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5487: athrow
    //   5488: aload #10
    //   5490: iconst_3
    //   5491: aaload
    //   5492: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   5495: if_acmpeq -> 5505
    //   5498: goto -> 5509
    //   5501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5504: athrow
    //   5505: aload #9
    //   5507: astore #5
    //   5509: iinc #8, 1
    //   5512: iload_2
    //   5513: ifne -> 5384
    //   5516: aload #5
    //   5518: iconst_1
    //   5519: invokevirtual setAccessible : (Z)V
    //   5522: ldc burp/Zxzd
    //   5524: iconst_0
    //   5525: anewarray java/lang/Class
    //   5528: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   5531: astore #6
    //   5533: aload #6
    //   5535: iconst_1
    //   5536: invokevirtual setAccessible : (Z)V
    //   5539: aload #5
    //   5541: aload #6
    //   5543: iconst_0
    //   5544: anewarray java/lang/Object
    //   5547: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   5550: iconst_4
    //   5551: anewarray java/lang/Object
    //   5554: dup
    //   5555: iconst_0
    //   5556: sipush #28302
    //   5559: sipush #-18841
    //   5562: invokestatic a : (II)Ljava/lang/String;
    //   5565: aastore
    //   5566: dup
    //   5567: iconst_1
    //   5568: aload #4
    //   5570: aastore
    //   5571: dup
    //   5572: iconst_2
    //   5573: iconst_0
    //   5574: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5577: aastore
    //   5578: dup
    //   5579: iconst_3
    //   5580: aload #4
    //   5582: arraylength
    //   5583: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5586: aastore
    //   5587: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5590: pop
    //   5591: goto -> 5595
    //   5594: astore_3
    //   5595: iconst_0
    //   5596: istore_3
    //   5597: getstatic burp/Zmpv.Zb : Ljava/lang/String;
    //   5600: getstatic burp/Zgqp.Zf : Ljava/lang/Object;
    //   5603: checkcast java/math/BigInteger
    //   5606: invokevirtual intValue : ()I
    //   5609: bipush #32
    //   5611: irem
    //   5612: invokestatic abs : (I)I
    //   5615: invokevirtual charAt : (I)C
    //   5618: getstatic burp/Zm54.Zg : Ljava/lang/String;
    //   5621: getstatic burp/Zvof.Zl : Ljava/lang/Object;
    //   5624: checkcast java/math/BigInteger
    //   5627: invokevirtual intValue : ()I
    //   5630: bipush #32
    //   5632: irem
    //   5633: invokestatic abs : (I)I
    //   5636: invokevirtual charAt : (I)C
    //   5639: if_icmpgt -> 5983
    //   5642: sipush #28289
    //   5645: sipush #20865
    //   5648: invokestatic a : (II)Ljava/lang/String;
    //   5651: iconst_1
    //   5652: ldc burp/Zl_u
    //   5654: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5657: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5660: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5663: astore #4
    //   5665: aload #4
    //   5667: arraylength
    //   5668: istore #5
    //   5670: iconst_0
    //   5671: istore #6
    //   5673: iload #6
    //   5675: iload #5
    //   5677: if_icmpge -> 5815
    //   5680: aload #4
    //   5682: iload #6
    //   5684: aaload
    //   5685: astore #7
    //   5687: aload #7
    //   5689: invokevirtual getModifiers : ()I
    //   5692: invokestatic isStatic : (I)Z
    //   5695: ifne -> 5705
    //   5698: goto -> 5808
    //   5701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5704: athrow
    //   5705: aload #7
    //   5707: invokevirtual getType : ()Ljava/lang/Class;
    //   5710: astore #8
    //   5712: aload #8
    //   5714: ifnull -> 5795
    //   5717: aload #8
    //   5719: invokevirtual isPrimitive : ()Z
    //   5722: ifne -> 5795
    //   5725: goto -> 5732
    //   5728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5731: athrow
    //   5732: aload #8
    //   5734: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5737: ifnull -> 5795
    //   5740: goto -> 5747
    //   5743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5746: athrow
    //   5747: aload #8
    //   5749: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5752: invokevirtual getName : ()Ljava/lang/String;
    //   5755: ifnull -> 5795
    //   5758: goto -> 5765
    //   5761: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5764: athrow
    //   5765: aload #8
    //   5767: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5770: invokevirtual getName : ()Ljava/lang/String;
    //   5773: sipush #28301
    //   5776: sipush #-27896
    //   5779: invokestatic a : (II)Ljava/lang/String;
    //   5782: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5785: ifne -> 5795
    //   5788: goto -> 5795
    //   5791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5794: athrow
    //   5795: aload #7
    //   5797: iconst_1
    //   5798: invokevirtual setAccessible : (Z)V
    //   5801: aload #7
    //   5803: aconst_null
    //   5804: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5807: pop
    //   5808: iinc #6, 1
    //   5811: iload_2
    //   5812: ifne -> 5673
    //   5815: sipush #28297
    //   5818: sipush #-2833
    //   5821: invokestatic a : (II)Ljava/lang/String;
    //   5824: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5827: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5830: astore #4
    //   5832: aload #4
    //   5834: arraylength
    //   5835: istore #5
    //   5837: iconst_0
    //   5838: istore #6
    //   5840: iload #6
    //   5842: iload #5
    //   5844: if_icmpge -> 5980
    //   5847: aload #4
    //   5849: iload #6
    //   5851: aaload
    //   5852: astore #7
    //   5854: aload #7
    //   5856: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5859: pop
    //   5860: aload #7
    //   5862: invokevirtual getModifiers : ()I
    //   5865: invokestatic isStatic : (I)Z
    //   5868: ifeq -> 5966
    //   5871: aload #7
    //   5873: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5876: arraylength
    //   5877: iconst_2
    //   5878: if_icmpne -> 5966
    //   5881: goto -> 5888
    //   5884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5887: athrow
    //   5888: aload #7
    //   5890: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5893: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5896: if_acmpne -> 5966
    //   5899: goto -> 5906
    //   5902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5905: athrow
    //   5906: aload #7
    //   5908: iconst_1
    //   5909: invokevirtual setAccessible : (Z)V
    //   5912: aload #7
    //   5914: aconst_null
    //   5915: iconst_2
    //   5916: anewarray java/lang/Object
    //   5919: dup
    //   5920: iconst_0
    //   5921: aload_0
    //   5922: aastore
    //   5923: dup
    //   5924: iconst_1
    //   5925: aload_1
    //   5926: ifnonnull -> 5944
    //   5929: goto -> 5936
    //   5932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5935: athrow
    //   5936: aload_1
    //   5937: goto -> 5951
    //   5940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5943: athrow
    //   5944: aload_1
    //   5945: checkcast [B
    //   5948: invokevirtual clone : ()Ljava/lang/Object;
    //   5951: aastore
    //   5952: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5955: checkcast java/lang/Boolean
    //   5958: invokevirtual booleanValue : ()Z
    //   5961: istore_3
    //   5962: iload_2
    //   5963: ifne -> 5980
    //   5966: iinc #6, 1
    //   5969: iload_2
    //   5970: ifne -> 5840
    //   5973: goto -> 5980
    //   5976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5979: athrow
    //   5980: goto -> 6321
    //   5983: sipush #28290
    //   5986: sipush #-4311
    //   5989: invokestatic a : (II)Ljava/lang/String;
    //   5992: iconst_1
    //   5993: ldc burp/Zsjo
    //   5995: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5998: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6001: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6004: astore #4
    //   6006: aload #4
    //   6008: arraylength
    //   6009: istore #5
    //   6011: iconst_0
    //   6012: istore #6
    //   6014: iload #6
    //   6016: iload #5
    //   6018: if_icmpge -> 6156
    //   6021: aload #4
    //   6023: iload #6
    //   6025: aaload
    //   6026: astore #7
    //   6028: aload #7
    //   6030: invokevirtual getModifiers : ()I
    //   6033: invokestatic isStatic : (I)Z
    //   6036: ifne -> 6046
    //   6039: goto -> 6149
    //   6042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6045: athrow
    //   6046: aload #7
    //   6048: invokevirtual getType : ()Ljava/lang/Class;
    //   6051: astore #8
    //   6053: aload #8
    //   6055: ifnull -> 6136
    //   6058: aload #8
    //   6060: invokevirtual isPrimitive : ()Z
    //   6063: ifne -> 6136
    //   6066: goto -> 6073
    //   6069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6072: athrow
    //   6073: aload #8
    //   6075: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6078: ifnull -> 6136
    //   6081: goto -> 6088
    //   6084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6087: athrow
    //   6088: aload #8
    //   6090: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6093: invokevirtual getName : ()Ljava/lang/String;
    //   6096: ifnull -> 6136
    //   6099: goto -> 6106
    //   6102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6105: athrow
    //   6106: aload #8
    //   6108: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6111: invokevirtual getName : ()Ljava/lang/String;
    //   6114: sipush #28301
    //   6117: sipush #-27896
    //   6120: invokestatic a : (II)Ljava/lang/String;
    //   6123: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6126: ifne -> 6136
    //   6129: goto -> 6136
    //   6132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6135: athrow
    //   6136: aload #7
    //   6138: iconst_1
    //   6139: invokevirtual setAccessible : (Z)V
    //   6142: aload #7
    //   6144: aconst_null
    //   6145: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6148: pop
    //   6149: iinc #6, 1
    //   6152: iload_2
    //   6153: ifne -> 6014
    //   6156: sipush #28291
    //   6159: sipush #-20877
    //   6162: invokestatic a : (II)Ljava/lang/String;
    //   6165: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6168: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6171: astore #4
    //   6173: aload #4
    //   6175: arraylength
    //   6176: istore #5
    //   6178: iconst_0
    //   6179: istore #6
    //   6181: iload #6
    //   6183: iload #5
    //   6185: if_icmpge -> 6321
    //   6188: aload #4
    //   6190: iload #6
    //   6192: aaload
    //   6193: astore #7
    //   6195: aload #7
    //   6197: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6200: pop
    //   6201: aload #7
    //   6203: invokevirtual getModifiers : ()I
    //   6206: invokestatic isStatic : (I)Z
    //   6209: ifeq -> 6307
    //   6212: aload #7
    //   6214: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6217: arraylength
    //   6218: iconst_2
    //   6219: if_icmpne -> 6307
    //   6222: goto -> 6229
    //   6225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6228: athrow
    //   6229: aload #7
    //   6231: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6234: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6237: if_acmpne -> 6307
    //   6240: goto -> 6247
    //   6243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6246: athrow
    //   6247: aload #7
    //   6249: iconst_1
    //   6250: invokevirtual setAccessible : (Z)V
    //   6253: aload #7
    //   6255: aconst_null
    //   6256: iconst_2
    //   6257: anewarray java/lang/Object
    //   6260: dup
    //   6261: iconst_0
    //   6262: aload_0
    //   6263: aastore
    //   6264: dup
    //   6265: iconst_1
    //   6266: aload_1
    //   6267: ifnonnull -> 6285
    //   6270: goto -> 6277
    //   6273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6276: athrow
    //   6277: aload_1
    //   6278: goto -> 6292
    //   6281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6284: athrow
    //   6285: aload_1
    //   6286: checkcast [B
    //   6289: invokevirtual clone : ()Ljava/lang/Object;
    //   6292: aastore
    //   6293: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6296: checkcast java/lang/Boolean
    //   6299: invokevirtual booleanValue : ()Z
    //   6302: istore_3
    //   6303: iload_2
    //   6304: ifne -> 6321
    //   6307: iinc #6, 1
    //   6310: iload_2
    //   6311: ifne -> 6181
    //   6314: goto -> 6321
    //   6317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6320: athrow
    //   6321: iload_3
    //   6322: ifeq -> 6327
    //   6325: iload_3
    //   6326: ireturn
    //   6327: getstatic burp/Zkup.Zr : Ljava/lang/String;
    //   6330: getstatic burp/Zstq.Zf : Ljava/lang/Object;
    //   6333: checkcast java/math/BigInteger
    //   6336: invokevirtual intValue : ()I
    //   6339: bipush #32
    //   6341: irem
    //   6342: invokestatic abs : (I)I
    //   6345: invokevirtual charAt : (I)C
    //   6348: getstatic burp/Zlqy.ZZ : Ljava/lang/String;
    //   6351: getstatic burp/Zsn6.Zo : Ljava/lang/Object;
    //   6354: checkcast java/math/BigInteger
    //   6357: invokevirtual intValue : ()I
    //   6360: bipush #32
    //   6362: irem
    //   6363: invokestatic abs : (I)I
    //   6366: invokevirtual charAt : (I)C
    //   6369: if_icmpgt -> 6714
    //   6372: sipush #28296
    //   6375: sipush #32347
    //   6378: invokestatic a : (II)Ljava/lang/String;
    //   6381: iconst_1
    //   6382: ldc burp/Zkdq
    //   6384: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6387: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6390: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6393: astore #4
    //   6395: aload #4
    //   6397: arraylength
    //   6398: istore #5
    //   6400: iconst_0
    //   6401: istore #6
    //   6403: iload #6
    //   6405: iload #5
    //   6407: if_icmpge -> 6545
    //   6410: aload #4
    //   6412: iload #6
    //   6414: aaload
    //   6415: astore #7
    //   6417: aload #7
    //   6419: invokevirtual getModifiers : ()I
    //   6422: invokestatic isStatic : (I)Z
    //   6425: ifne -> 6435
    //   6428: goto -> 6538
    //   6431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6434: athrow
    //   6435: aload #7
    //   6437: invokevirtual getType : ()Ljava/lang/Class;
    //   6440: astore #8
    //   6442: aload #8
    //   6444: ifnull -> 6525
    //   6447: aload #8
    //   6449: invokevirtual isPrimitive : ()Z
    //   6452: ifne -> 6525
    //   6455: goto -> 6462
    //   6458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6461: athrow
    //   6462: aload #8
    //   6464: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6467: ifnull -> 6525
    //   6470: goto -> 6477
    //   6473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6476: athrow
    //   6477: aload #8
    //   6479: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6482: invokevirtual getName : ()Ljava/lang/String;
    //   6485: ifnull -> 6525
    //   6488: goto -> 6495
    //   6491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6494: athrow
    //   6495: aload #8
    //   6497: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6500: invokevirtual getName : ()Ljava/lang/String;
    //   6503: sipush #28301
    //   6506: sipush #-27896
    //   6509: invokestatic a : (II)Ljava/lang/String;
    //   6512: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6515: ifne -> 6525
    //   6518: goto -> 6525
    //   6521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6524: athrow
    //   6525: aload #7
    //   6527: iconst_1
    //   6528: invokevirtual setAccessible : (Z)V
    //   6531: aload #7
    //   6533: aconst_null
    //   6534: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6537: pop
    //   6538: iinc #6, 1
    //   6541: iload_2
    //   6542: ifne -> 6403
    //   6545: sipush #28316
    //   6548: sipush #5225
    //   6551: invokestatic a : (II)Ljava/lang/String;
    //   6554: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6557: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6560: astore #4
    //   6562: aload #4
    //   6564: arraylength
    //   6565: istore #5
    //   6567: iconst_0
    //   6568: istore #6
    //   6570: iload #6
    //   6572: iload #5
    //   6574: if_icmpge -> 6710
    //   6577: aload #4
    //   6579: iload #6
    //   6581: aaload
    //   6582: astore #7
    //   6584: aload #7
    //   6586: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6589: pop
    //   6590: aload #7
    //   6592: invokevirtual getModifiers : ()I
    //   6595: invokestatic isStatic : (I)Z
    //   6598: ifeq -> 6696
    //   6601: aload #7
    //   6603: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6606: arraylength
    //   6607: iconst_2
    //   6608: if_icmpne -> 6696
    //   6611: goto -> 6618
    //   6614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6617: athrow
    //   6618: aload #7
    //   6620: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6623: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6626: if_acmpne -> 6696
    //   6629: goto -> 6636
    //   6632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6635: athrow
    //   6636: aload #7
    //   6638: iconst_1
    //   6639: invokevirtual setAccessible : (Z)V
    //   6642: aload #7
    //   6644: aconst_null
    //   6645: iconst_2
    //   6646: anewarray java/lang/Object
    //   6649: dup
    //   6650: iconst_0
    //   6651: aload_0
    //   6652: aastore
    //   6653: dup
    //   6654: iconst_1
    //   6655: aload_1
    //   6656: ifnonnull -> 6674
    //   6659: goto -> 6666
    //   6662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6665: athrow
    //   6666: aload_1
    //   6667: goto -> 6681
    //   6670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6673: athrow
    //   6674: aload_1
    //   6675: checkcast [B
    //   6678: invokevirtual clone : ()Ljava/lang/Object;
    //   6681: aastore
    //   6682: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6685: checkcast java/lang/Boolean
    //   6688: invokevirtual booleanValue : ()Z
    //   6691: istore_3
    //   6692: iload_2
    //   6693: ifne -> 6710
    //   6696: iinc #6, 1
    //   6699: iload_2
    //   6700: ifne -> 6570
    //   6703: goto -> 6710
    //   6706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6709: athrow
    //   6710: iload_2
    //   6711: ifne -> 7052
    //   6714: sipush #28307
    //   6717: sipush #32633
    //   6720: invokestatic a : (II)Ljava/lang/String;
    //   6723: iconst_1
    //   6724: ldc burp/Zrt9
    //   6726: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6729: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6732: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6735: astore #4
    //   6737: aload #4
    //   6739: arraylength
    //   6740: istore #5
    //   6742: iconst_0
    //   6743: istore #6
    //   6745: iload #6
    //   6747: iload #5
    //   6749: if_icmpge -> 6887
    //   6752: aload #4
    //   6754: iload #6
    //   6756: aaload
    //   6757: astore #7
    //   6759: aload #7
    //   6761: invokevirtual getModifiers : ()I
    //   6764: invokestatic isStatic : (I)Z
    //   6767: ifne -> 6777
    //   6770: goto -> 6880
    //   6773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6776: athrow
    //   6777: aload #7
    //   6779: invokevirtual getType : ()Ljava/lang/Class;
    //   6782: astore #8
    //   6784: aload #8
    //   6786: ifnull -> 6867
    //   6789: aload #8
    //   6791: invokevirtual isPrimitive : ()Z
    //   6794: ifne -> 6867
    //   6797: goto -> 6804
    //   6800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6803: athrow
    //   6804: aload #8
    //   6806: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6809: ifnull -> 6867
    //   6812: goto -> 6819
    //   6815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6818: athrow
    //   6819: aload #8
    //   6821: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6824: invokevirtual getName : ()Ljava/lang/String;
    //   6827: ifnull -> 6867
    //   6830: goto -> 6837
    //   6833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6836: athrow
    //   6837: aload #8
    //   6839: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6842: invokevirtual getName : ()Ljava/lang/String;
    //   6845: sipush #28301
    //   6848: sipush #-27896
    //   6851: invokestatic a : (II)Ljava/lang/String;
    //   6854: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6857: ifne -> 6867
    //   6860: goto -> 6867
    //   6863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6866: athrow
    //   6867: aload #7
    //   6869: iconst_1
    //   6870: invokevirtual setAccessible : (Z)V
    //   6873: aload #7
    //   6875: aconst_null
    //   6876: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6879: pop
    //   6880: iinc #6, 1
    //   6883: iload_2
    //   6884: ifne -> 6745
    //   6887: sipush #28309
    //   6890: sipush #20046
    //   6893: invokestatic a : (II)Ljava/lang/String;
    //   6896: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6899: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6902: astore #4
    //   6904: aload #4
    //   6906: arraylength
    //   6907: istore #5
    //   6909: iconst_0
    //   6910: istore #6
    //   6912: iload #6
    //   6914: iload #5
    //   6916: if_icmpge -> 7052
    //   6919: aload #4
    //   6921: iload #6
    //   6923: aaload
    //   6924: astore #7
    //   6926: aload #7
    //   6928: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6931: pop
    //   6932: aload #7
    //   6934: invokevirtual getModifiers : ()I
    //   6937: invokestatic isStatic : (I)Z
    //   6940: ifeq -> 7038
    //   6943: aload #7
    //   6945: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6948: arraylength
    //   6949: iconst_2
    //   6950: if_icmpne -> 7038
    //   6953: goto -> 6960
    //   6956: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6959: athrow
    //   6960: aload #7
    //   6962: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6965: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6968: if_acmpne -> 7038
    //   6971: goto -> 6978
    //   6974: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6977: athrow
    //   6978: aload #7
    //   6980: iconst_1
    //   6981: invokevirtual setAccessible : (Z)V
    //   6984: aload #7
    //   6986: aconst_null
    //   6987: iconst_2
    //   6988: anewarray java/lang/Object
    //   6991: dup
    //   6992: iconst_0
    //   6993: aload_0
    //   6994: aastore
    //   6995: dup
    //   6996: iconst_1
    //   6997: aload_1
    //   6998: ifnonnull -> 7016
    //   7001: goto -> 7008
    //   7004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7007: athrow
    //   7008: aload_1
    //   7009: goto -> 7023
    //   7012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7015: athrow
    //   7016: aload_1
    //   7017: checkcast [B
    //   7020: invokevirtual clone : ()Ljava/lang/Object;
    //   7023: aastore
    //   7024: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7027: checkcast java/lang/Boolean
    //   7030: invokevirtual booleanValue : ()Z
    //   7033: istore_3
    //   7034: iload_2
    //   7035: ifne -> 7052
    //   7038: iinc #6, 1
    //   7041: iload_2
    //   7042: ifne -> 6912
    //   7045: goto -> 7052
    //   7048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7051: athrow
    //   7052: iload_3
    //   7053: ifeq -> 7058
    //   7056: iload_3
    //   7057: ireturn
    //   7058: getstatic burp/Zlqm.ZQ : Ljava/lang/String;
    //   7061: getstatic burp/Zlqm.Zw : Ljava/lang/Object;
    //   7064: checkcast java/math/BigInteger
    //   7067: invokevirtual intValue : ()I
    //   7070: bipush #32
    //   7072: irem
    //   7073: invokestatic abs : (I)I
    //   7076: invokevirtual charAt : (I)C
    //   7079: getstatic burp/Zrqd.Zk : Ljava/lang/String;
    //   7082: getstatic burp/Zzi3.ZJ : Ljava/lang/Object;
    //   7085: checkcast java/math/BigInteger
    //   7088: invokevirtual intValue : ()I
    //   7091: bipush #32
    //   7093: irem
    //   7094: invokestatic abs : (I)I
    //   7097: invokevirtual charAt : (I)C
    //   7100: if_icmple -> 7445
    //   7103: sipush #28303
    //   7106: sipush #7598
    //   7109: invokestatic a : (II)Ljava/lang/String;
    //   7112: iconst_1
    //   7113: ldc burp/Zly0
    //   7115: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7118: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7121: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7124: astore #4
    //   7126: aload #4
    //   7128: arraylength
    //   7129: istore #5
    //   7131: iconst_0
    //   7132: istore #6
    //   7134: iload #6
    //   7136: iload #5
    //   7138: if_icmpge -> 7276
    //   7141: aload #4
    //   7143: iload #6
    //   7145: aaload
    //   7146: astore #7
    //   7148: aload #7
    //   7150: invokevirtual getModifiers : ()I
    //   7153: invokestatic isStatic : (I)Z
    //   7156: ifne -> 7166
    //   7159: goto -> 7269
    //   7162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7165: athrow
    //   7166: aload #7
    //   7168: invokevirtual getType : ()Ljava/lang/Class;
    //   7171: astore #8
    //   7173: aload #8
    //   7175: ifnull -> 7256
    //   7178: aload #8
    //   7180: invokevirtual isPrimitive : ()Z
    //   7183: ifne -> 7256
    //   7186: goto -> 7193
    //   7189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7192: athrow
    //   7193: aload #8
    //   7195: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7198: ifnull -> 7256
    //   7201: goto -> 7208
    //   7204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7207: athrow
    //   7208: aload #8
    //   7210: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7213: invokevirtual getName : ()Ljava/lang/String;
    //   7216: ifnull -> 7256
    //   7219: goto -> 7226
    //   7222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7225: athrow
    //   7226: aload #8
    //   7228: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7231: invokevirtual getName : ()Ljava/lang/String;
    //   7234: sipush #28301
    //   7237: sipush #-27896
    //   7240: invokestatic a : (II)Ljava/lang/String;
    //   7243: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7246: ifne -> 7256
    //   7249: goto -> 7256
    //   7252: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7255: athrow
    //   7256: aload #7
    //   7258: iconst_1
    //   7259: invokevirtual setAccessible : (Z)V
    //   7262: aload #7
    //   7264: aconst_null
    //   7265: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7268: pop
    //   7269: iinc #6, 1
    //   7272: iload_2
    //   7273: ifne -> 7134
    //   7276: sipush #28299
    //   7279: sipush #-29829
    //   7282: invokestatic a : (II)Ljava/lang/String;
    //   7285: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7288: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7291: astore #4
    //   7293: aload #4
    //   7295: arraylength
    //   7296: istore #5
    //   7298: iconst_0
    //   7299: istore #6
    //   7301: iload #6
    //   7303: iload #5
    //   7305: if_icmpge -> 7441
    //   7308: aload #4
    //   7310: iload #6
    //   7312: aaload
    //   7313: astore #7
    //   7315: aload #7
    //   7317: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7320: pop
    //   7321: aload #7
    //   7323: invokevirtual getModifiers : ()I
    //   7326: invokestatic isStatic : (I)Z
    //   7329: ifeq -> 7427
    //   7332: aload #7
    //   7334: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7337: arraylength
    //   7338: iconst_2
    //   7339: if_icmpne -> 7427
    //   7342: goto -> 7349
    //   7345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7348: athrow
    //   7349: aload #7
    //   7351: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7354: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7357: if_acmpne -> 7427
    //   7360: goto -> 7367
    //   7363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7366: athrow
    //   7367: aload #7
    //   7369: iconst_1
    //   7370: invokevirtual setAccessible : (Z)V
    //   7373: aload #7
    //   7375: aconst_null
    //   7376: iconst_2
    //   7377: anewarray java/lang/Object
    //   7380: dup
    //   7381: iconst_0
    //   7382: aload_0
    //   7383: aastore
    //   7384: dup
    //   7385: iconst_1
    //   7386: aload_1
    //   7387: ifnonnull -> 7405
    //   7390: goto -> 7397
    //   7393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7396: athrow
    //   7397: aload_1
    //   7398: goto -> 7412
    //   7401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7404: athrow
    //   7405: aload_1
    //   7406: checkcast [B
    //   7409: invokevirtual clone : ()Ljava/lang/Object;
    //   7412: aastore
    //   7413: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7416: checkcast java/lang/Boolean
    //   7419: invokevirtual booleanValue : ()Z
    //   7422: istore_3
    //   7423: iload_2
    //   7424: ifne -> 7441
    //   7427: iinc #6, 1
    //   7430: iload_2
    //   7431: ifne -> 7301
    //   7434: goto -> 7441
    //   7437: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7440: athrow
    //   7441: iload_2
    //   7442: ifne -> 7783
    //   7445: sipush #28305
    //   7448: sipush #15266
    //   7451: invokestatic a : (II)Ljava/lang/String;
    //   7454: iconst_1
    //   7455: ldc burp/Zcc
    //   7457: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7460: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7463: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7466: astore #4
    //   7468: aload #4
    //   7470: arraylength
    //   7471: istore #5
    //   7473: iconst_0
    //   7474: istore #6
    //   7476: iload #6
    //   7478: iload #5
    //   7480: if_icmpge -> 7618
    //   7483: aload #4
    //   7485: iload #6
    //   7487: aaload
    //   7488: astore #7
    //   7490: aload #7
    //   7492: invokevirtual getModifiers : ()I
    //   7495: invokestatic isStatic : (I)Z
    //   7498: ifne -> 7508
    //   7501: goto -> 7611
    //   7504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7507: athrow
    //   7508: aload #7
    //   7510: invokevirtual getType : ()Ljava/lang/Class;
    //   7513: astore #8
    //   7515: aload #8
    //   7517: ifnull -> 7598
    //   7520: aload #8
    //   7522: invokevirtual isPrimitive : ()Z
    //   7525: ifne -> 7598
    //   7528: goto -> 7535
    //   7531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7534: athrow
    //   7535: aload #8
    //   7537: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7540: ifnull -> 7598
    //   7543: goto -> 7550
    //   7546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7549: athrow
    //   7550: aload #8
    //   7552: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7555: invokevirtual getName : ()Ljava/lang/String;
    //   7558: ifnull -> 7598
    //   7561: goto -> 7568
    //   7564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7567: athrow
    //   7568: aload #8
    //   7570: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7573: invokevirtual getName : ()Ljava/lang/String;
    //   7576: sipush #28301
    //   7579: sipush #-27896
    //   7582: invokestatic a : (II)Ljava/lang/String;
    //   7585: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7588: ifne -> 7598
    //   7591: goto -> 7598
    //   7594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7597: athrow
    //   7598: aload #7
    //   7600: iconst_1
    //   7601: invokevirtual setAccessible : (Z)V
    //   7604: aload #7
    //   7606: aconst_null
    //   7607: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7610: pop
    //   7611: iinc #6, 1
    //   7614: iload_2
    //   7615: ifne -> 7476
    //   7618: sipush #28311
    //   7621: sipush #-12845
    //   7624: invokestatic a : (II)Ljava/lang/String;
    //   7627: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7630: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7633: astore #4
    //   7635: aload #4
    //   7637: arraylength
    //   7638: istore #5
    //   7640: iconst_0
    //   7641: istore #6
    //   7643: iload #6
    //   7645: iload #5
    //   7647: if_icmpge -> 7783
    //   7650: aload #4
    //   7652: iload #6
    //   7654: aaload
    //   7655: astore #7
    //   7657: aload #7
    //   7659: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7662: pop
    //   7663: aload #7
    //   7665: invokevirtual getModifiers : ()I
    //   7668: invokestatic isStatic : (I)Z
    //   7671: ifeq -> 7769
    //   7674: aload #7
    //   7676: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7679: arraylength
    //   7680: iconst_2
    //   7681: if_icmpne -> 7769
    //   7684: goto -> 7691
    //   7687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7690: athrow
    //   7691: aload #7
    //   7693: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7696: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7699: if_acmpne -> 7769
    //   7702: goto -> 7709
    //   7705: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7708: athrow
    //   7709: aload #7
    //   7711: iconst_1
    //   7712: invokevirtual setAccessible : (Z)V
    //   7715: aload #7
    //   7717: aconst_null
    //   7718: iconst_2
    //   7719: anewarray java/lang/Object
    //   7722: dup
    //   7723: iconst_0
    //   7724: aload_0
    //   7725: aastore
    //   7726: dup
    //   7727: iconst_1
    //   7728: aload_1
    //   7729: ifnonnull -> 7747
    //   7732: goto -> 7739
    //   7735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7738: athrow
    //   7739: aload_1
    //   7740: goto -> 7754
    //   7743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7746: athrow
    //   7747: aload_1
    //   7748: checkcast [B
    //   7751: invokevirtual clone : ()Ljava/lang/Object;
    //   7754: aastore
    //   7755: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7758: checkcast java/lang/Boolean
    //   7761: invokevirtual booleanValue : ()Z
    //   7764: istore_3
    //   7765: iload_2
    //   7766: ifne -> 7783
    //   7769: iinc #6, 1
    //   7772: iload_2
    //   7773: ifne -> 7643
    //   7776: goto -> 7783
    //   7779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7782: athrow
    //   7783: iload_3
    //   7784: ifeq -> 7789
    //   7787: iload_3
    //   7788: ireturn
    //   7789: getstatic burp/Zl8l.ZG : Ljava/lang/String;
    //   7792: getstatic burp/Zb8x.Zz : Ljava/lang/Object;
    //   7795: checkcast java/math/BigInteger
    //   7798: invokevirtual intValue : ()I
    //   7801: bipush #32
    //   7803: irem
    //   7804: invokestatic abs : (I)I
    //   7807: invokevirtual charAt : (I)C
    //   7810: getstatic burp/Zkw.ZU : Ljava/lang/String;
    //   7813: getstatic burp/Zzuh.ZV : Ljava/lang/Object;
    //   7816: checkcast java/math/BigInteger
    //   7819: invokevirtual intValue : ()I
    //   7822: bipush #32
    //   7824: irem
    //   7825: invokestatic abs : (I)I
    //   7828: invokevirtual charAt : (I)C
    //   7831: if_icmple -> 8176
    //   7834: sipush #28312
    //   7837: sipush #-11309
    //   7840: invokestatic a : (II)Ljava/lang/String;
    //   7843: iconst_1
    //   7844: ldc burp/Zmjw
    //   7846: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7849: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7852: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7855: astore #4
    //   7857: aload #4
    //   7859: arraylength
    //   7860: istore #5
    //   7862: iconst_0
    //   7863: istore #6
    //   7865: iload #6
    //   7867: iload #5
    //   7869: if_icmpge -> 8007
    //   7872: aload #4
    //   7874: iload #6
    //   7876: aaload
    //   7877: astore #7
    //   7879: aload #7
    //   7881: invokevirtual getModifiers : ()I
    //   7884: invokestatic isStatic : (I)Z
    //   7887: ifne -> 7897
    //   7890: goto -> 8000
    //   7893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7896: athrow
    //   7897: aload #7
    //   7899: invokevirtual getType : ()Ljava/lang/Class;
    //   7902: astore #8
    //   7904: aload #8
    //   7906: ifnull -> 7987
    //   7909: aload #8
    //   7911: invokevirtual isPrimitive : ()Z
    //   7914: ifne -> 7987
    //   7917: goto -> 7924
    //   7920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7923: athrow
    //   7924: aload #8
    //   7926: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7929: ifnull -> 7987
    //   7932: goto -> 7939
    //   7935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7938: athrow
    //   7939: aload #8
    //   7941: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7944: invokevirtual getName : ()Ljava/lang/String;
    //   7947: ifnull -> 7987
    //   7950: goto -> 7957
    //   7953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7956: athrow
    //   7957: aload #8
    //   7959: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7962: invokevirtual getName : ()Ljava/lang/String;
    //   7965: sipush #28301
    //   7968: sipush #-27896
    //   7971: invokestatic a : (II)Ljava/lang/String;
    //   7974: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7977: ifne -> 7987
    //   7980: goto -> 7987
    //   7983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7986: athrow
    //   7987: aload #7
    //   7989: iconst_1
    //   7990: invokevirtual setAccessible : (Z)V
    //   7993: aload #7
    //   7995: aconst_null
    //   7996: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7999: pop
    //   8000: iinc #6, 1
    //   8003: iload_2
    //   8004: ifne -> 7865
    //   8007: sipush #28298
    //   8010: sipush #21966
    //   8013: invokestatic a : (II)Ljava/lang/String;
    //   8016: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8019: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8022: astore #4
    //   8024: aload #4
    //   8026: arraylength
    //   8027: istore #5
    //   8029: iconst_0
    //   8030: istore #6
    //   8032: iload #6
    //   8034: iload #5
    //   8036: if_icmpge -> 8172
    //   8039: aload #4
    //   8041: iload #6
    //   8043: aaload
    //   8044: astore #7
    //   8046: aload #7
    //   8048: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8051: pop
    //   8052: aload #7
    //   8054: invokevirtual getModifiers : ()I
    //   8057: invokestatic isStatic : (I)Z
    //   8060: ifeq -> 8158
    //   8063: aload #7
    //   8065: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8068: arraylength
    //   8069: iconst_2
    //   8070: if_icmpne -> 8158
    //   8073: goto -> 8080
    //   8076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8079: athrow
    //   8080: aload #7
    //   8082: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8085: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8088: if_acmpne -> 8158
    //   8091: goto -> 8098
    //   8094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8097: athrow
    //   8098: aload #7
    //   8100: iconst_1
    //   8101: invokevirtual setAccessible : (Z)V
    //   8104: aload #7
    //   8106: aconst_null
    //   8107: iconst_2
    //   8108: anewarray java/lang/Object
    //   8111: dup
    //   8112: iconst_0
    //   8113: aload_0
    //   8114: aastore
    //   8115: dup
    //   8116: iconst_1
    //   8117: aload_1
    //   8118: ifnonnull -> 8136
    //   8121: goto -> 8128
    //   8124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8127: athrow
    //   8128: aload_1
    //   8129: goto -> 8143
    //   8132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8135: athrow
    //   8136: aload_1
    //   8137: checkcast [B
    //   8140: invokevirtual clone : ()Ljava/lang/Object;
    //   8143: aastore
    //   8144: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8147: checkcast java/lang/Boolean
    //   8150: invokevirtual booleanValue : ()Z
    //   8153: istore_3
    //   8154: iload_2
    //   8155: ifne -> 8172
    //   8158: iinc #6, 1
    //   8161: iload_2
    //   8162: ifne -> 8032
    //   8165: goto -> 8172
    //   8168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8171: athrow
    //   8172: iload_2
    //   8173: ifne -> 8514
    //   8176: sipush #28318
    //   8179: sipush #11379
    //   8182: invokestatic a : (II)Ljava/lang/String;
    //   8185: iconst_1
    //   8186: ldc burp/Zg3v
    //   8188: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8191: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   8194: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   8197: astore #4
    //   8199: aload #4
    //   8201: arraylength
    //   8202: istore #5
    //   8204: iconst_0
    //   8205: istore #6
    //   8207: iload #6
    //   8209: iload #5
    //   8211: if_icmpge -> 8349
    //   8214: aload #4
    //   8216: iload #6
    //   8218: aaload
    //   8219: astore #7
    //   8221: aload #7
    //   8223: invokevirtual getModifiers : ()I
    //   8226: invokestatic isStatic : (I)Z
    //   8229: ifne -> 8239
    //   8232: goto -> 8342
    //   8235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8238: athrow
    //   8239: aload #7
    //   8241: invokevirtual getType : ()Ljava/lang/Class;
    //   8244: astore #8
    //   8246: aload #8
    //   8248: ifnull -> 8329
    //   8251: aload #8
    //   8253: invokevirtual isPrimitive : ()Z
    //   8256: ifne -> 8329
    //   8259: goto -> 8266
    //   8262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8265: athrow
    //   8266: aload #8
    //   8268: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8271: ifnull -> 8329
    //   8274: goto -> 8281
    //   8277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8280: athrow
    //   8281: aload #8
    //   8283: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8286: invokevirtual getName : ()Ljava/lang/String;
    //   8289: ifnull -> 8329
    //   8292: goto -> 8299
    //   8295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8298: athrow
    //   8299: aload #8
    //   8301: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8304: invokevirtual getName : ()Ljava/lang/String;
    //   8307: sipush #28301
    //   8310: sipush #-27896
    //   8313: invokestatic a : (II)Ljava/lang/String;
    //   8316: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8319: ifne -> 8329
    //   8322: goto -> 8329
    //   8325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8328: athrow
    //   8329: aload #7
    //   8331: iconst_1
    //   8332: invokevirtual setAccessible : (Z)V
    //   8335: aload #7
    //   8337: aconst_null
    //   8338: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8341: pop
    //   8342: iinc #6, 1
    //   8345: iload_2
    //   8346: ifne -> 8207
    //   8349: sipush #28304
    //   8352: sipush #18834
    //   8355: invokestatic a : (II)Ljava/lang/String;
    //   8358: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8361: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8364: astore #4
    //   8366: aload #4
    //   8368: arraylength
    //   8369: istore #5
    //   8371: iconst_0
    //   8372: istore #6
    //   8374: iload #6
    //   8376: iload #5
    //   8378: if_icmpge -> 8514
    //   8381: aload #4
    //   8383: iload #6
    //   8385: aaload
    //   8386: astore #7
    //   8388: aload #7
    //   8390: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8393: pop
    //   8394: aload #7
    //   8396: invokevirtual getModifiers : ()I
    //   8399: invokestatic isStatic : (I)Z
    //   8402: ifeq -> 8500
    //   8405: aload #7
    //   8407: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8410: arraylength
    //   8411: iconst_2
    //   8412: if_icmpne -> 8500
    //   8415: goto -> 8422
    //   8418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8421: athrow
    //   8422: aload #7
    //   8424: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8427: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8430: if_acmpne -> 8500
    //   8433: goto -> 8440
    //   8436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8439: athrow
    //   8440: aload #7
    //   8442: iconst_1
    //   8443: invokevirtual setAccessible : (Z)V
    //   8446: aload #7
    //   8448: aconst_null
    //   8449: iconst_2
    //   8450: anewarray java/lang/Object
    //   8453: dup
    //   8454: iconst_0
    //   8455: aload_0
    //   8456: aastore
    //   8457: dup
    //   8458: iconst_1
    //   8459: aload_1
    //   8460: ifnonnull -> 8478
    //   8463: goto -> 8470
    //   8466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8469: athrow
    //   8470: aload_1
    //   8471: goto -> 8485
    //   8474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8477: athrow
    //   8478: aload_1
    //   8479: checkcast [B
    //   8482: invokevirtual clone : ()Ljava/lang/Object;
    //   8485: aastore
    //   8486: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8489: checkcast java/lang/Boolean
    //   8492: invokevirtual booleanValue : ()Z
    //   8495: istore_3
    //   8496: iload_2
    //   8497: ifne -> 8514
    //   8500: iinc #6, 1
    //   8503: iload_2
    //   8504: ifne -> 8374
    //   8507: goto -> 8514
    //   8510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8513: athrow
    //   8514: iload_3
    //   8515: ireturn
    //   8516: astore_3
    //   8517: new java/lang/Exception
    //   8520: dup
    //   8521: aload_3
    //   8522: invokevirtual getMessage : ()Ljava/lang/String;
    //   8525: invokespecial <init> : (Ljava/lang/String;)V
    //   8528: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6326	8516	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   619	633	633	java/lang/Throwable
    //   644	657	660	java/lang/Throwable
    //   649	672	675	java/lang/Throwable
    //   664	690	693	java/lang/Throwable
    //   679	720	723	java/lang/Throwable
    //   783	810	813	java/lang/Throwable
    //   800	831	834	java/lang/Throwable
    //   817	861	864	java/lang/Throwable
    //   838	872	872	java/lang/Throwable
    //   883	899	902	java/lang/Throwable
    //   4208	4233	4233	java/lang/Throwable
    //   5196	5222	5222	java/lang/Throwable
    //   5254	5591	5594	java/lang/Throwable
    //   5425	5435	5435	java/lang/Throwable
    //   5439	5451	5451	java/lang/Throwable
    //   5455	5467	5467	java/lang/Throwable
    //   5471	5484	5484	java/lang/Throwable
    //   5488	5501	5501	java/lang/Throwable
    //   5687	5701	5701	java/lang/Throwable
    //   5712	5725	5728	java/lang/Throwable
    //   5717	5740	5743	java/lang/Throwable
    //   5732	5758	5761	java/lang/Throwable
    //   5747	5788	5791	java/lang/Throwable
    //   5854	5881	5884	java/lang/Throwable
    //   5871	5899	5902	java/lang/Throwable
    //   5888	5929	5932	java/lang/Throwable
    //   5906	5940	5940	java/lang/Throwable
    //   5962	5973	5976	java/lang/Throwable
    //   6028	6042	6042	java/lang/Throwable
    //   6053	6066	6069	java/lang/Throwable
    //   6058	6081	6084	java/lang/Throwable
    //   6073	6099	6102	java/lang/Throwable
    //   6088	6129	6132	java/lang/Throwable
    //   6195	6222	6225	java/lang/Throwable
    //   6212	6240	6243	java/lang/Throwable
    //   6229	6270	6273	java/lang/Throwable
    //   6247	6281	6281	java/lang/Throwable
    //   6303	6314	6317	java/lang/Throwable
    //   6327	7057	8516	java/lang/Throwable
    //   6417	6431	6431	java/lang/Throwable
    //   6442	6455	6458	java/lang/Throwable
    //   6447	6470	6473	java/lang/Throwable
    //   6462	6488	6491	java/lang/Throwable
    //   6477	6518	6521	java/lang/Throwable
    //   6584	6611	6614	java/lang/Throwable
    //   6601	6629	6632	java/lang/Throwable
    //   6618	6659	6662	java/lang/Throwable
    //   6636	6670	6670	java/lang/Throwable
    //   6692	6703	6706	java/lang/Throwable
    //   6759	6773	6773	java/lang/Throwable
    //   6784	6797	6800	java/lang/Throwable
    //   6789	6812	6815	java/lang/Throwable
    //   6804	6830	6833	java/lang/Throwable
    //   6819	6860	6863	java/lang/Throwable
    //   6926	6953	6956	java/lang/Throwable
    //   6943	6971	6974	java/lang/Throwable
    //   6960	7001	7004	java/lang/Throwable
    //   6978	7012	7012	java/lang/Throwable
    //   7034	7045	7048	java/lang/Throwable
    //   7058	7788	8516	java/lang/Throwable
    //   7148	7162	7162	java/lang/Throwable
    //   7173	7186	7189	java/lang/Throwable
    //   7178	7201	7204	java/lang/Throwable
    //   7193	7219	7222	java/lang/Throwable
    //   7208	7249	7252	java/lang/Throwable
    //   7315	7342	7345	java/lang/Throwable
    //   7332	7360	7363	java/lang/Throwable
    //   7349	7390	7393	java/lang/Throwable
    //   7367	7401	7401	java/lang/Throwable
    //   7423	7434	7437	java/lang/Throwable
    //   7490	7504	7504	java/lang/Throwable
    //   7515	7528	7531	java/lang/Throwable
    //   7520	7543	7546	java/lang/Throwable
    //   7535	7561	7564	java/lang/Throwable
    //   7550	7591	7594	java/lang/Throwable
    //   7657	7684	7687	java/lang/Throwable
    //   7674	7702	7705	java/lang/Throwable
    //   7691	7732	7735	java/lang/Throwable
    //   7709	7743	7743	java/lang/Throwable
    //   7765	7776	7779	java/lang/Throwable
    //   7789	8515	8516	java/lang/Throwable
    //   7879	7893	7893	java/lang/Throwable
    //   7904	7917	7920	java/lang/Throwable
    //   7909	7932	7935	java/lang/Throwable
    //   7924	7950	7953	java/lang/Throwable
    //   7939	7980	7983	java/lang/Throwable
    //   8046	8073	8076	java/lang/Throwable
    //   8063	8091	8094	java/lang/Throwable
    //   8080	8121	8124	java/lang/Throwable
    //   8098	8132	8132	java/lang/Throwable
    //   8154	8165	8168	java/lang/Throwable
    //   8221	8235	8235	java/lang/Throwable
    //   8246	8259	8262	java/lang/Throwable
    //   8251	8274	8277	java/lang/Throwable
    //   8266	8292	8295	java/lang/Throwable
    //   8281	8322	8325	java/lang/Throwable
    //   8388	8415	8418	java/lang/Throwable
    //   8405	8433	8436	java/lang/Throwable
    //   8422	8463	8466	java/lang/Throwable
    //   8440	8474	8474	java/lang/Throwable
    //   8496	8507	8510	java/lang/Throwable
  }
  
  static void Zj(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'úêÕº&@zÚÉL&6yÓÜ³< (îQÛ:ñzÆ8Hà@þçö?cU E60GPL¼\\b]º)¡{jòÀï|Ù ;sAÝÒõ°Ë¸\\b=ä¯yÍDÃ)1Ç~_À32§5HA¬Y²ÞÐ>-|'OÅA¹½<\\t¬Í¶u¡à\\tÅö )Ò°\\t\\tkwÕ%0²\\t´KaöôÕâ\\tÓÂ7ÇSÌÌj\\teAßNo¥ôî;m@àuÅ¤c«iûH;ß\\b:Ðÿí`(3\\tÙQÝïÖeÊ\\t5\\tÖ\o¿F\\t¶ªn¢RánÞ\\tXº³ é¡ÑÖ\\tiG²]}¿\\tO\\t¾véB\\t·ìC¶ØÜ9o­±µ0¡¸æÛNGÖWgÿ6D\\tñìjOøÃ§\\\tÊ«®ê`aí\\t©.'ñCLÈ¶Ðþ¹2è®ÌµPvÐ#\\fièåõESødò#´9x/åì\\n1¤QMÝ(ûkð>­ê×´sië¿0<iT°oþ/\\b`¿\\tÄÕ MX3\\té\\tÊ¾ìô/Ç ±\\t`Þº+ôdd6R4¦mBBä%Úè-Ý8W\\teÇT# \\tÕOßvÚl\\b\\tñêªOàÊùL'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #19
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #42
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '"OörÖÌÎ8¢¿^iA'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #78
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zr64.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr64.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #35
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #87
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #39
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: sipush #28317
    //   303: sipush #15241
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zr64.Zj : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #28294
    //   319: sipush #2901
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zr64.ZN : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6E84) & 0xFFFF;
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
      char c = '·';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr64.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */