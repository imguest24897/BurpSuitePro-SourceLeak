package burp;

import java.math.BigInteger;

class Zlr2 extends ClassLoader {
  static Object Zq;
  
  static String ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Z_(Object paramObject) {
    Zbzc.ZL = a(22914, 23366);
    Zbzc.Zp = new BigInteger(a(22919, -30418));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zzxs.Zd.charAt(Math.abs(((BigInteger)Ztdx.ZX).intValue() % 32)) <= Zgwu.Zd.charAt(Math.abs(((BigInteger)Ztdx.ZX).intValue() % 32))) {
          try {
            Zry0.ZO(Class.forName(a(22916, 13268)));
            if (!bool)
              Zth7.ZN(Class.forName(a(22917, 26514))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zth7.ZN(Class.forName(a(22917, 26514)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zelc.ZR : Ljava/lang/Object;
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
    //   562: sipush #22918
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Zrf9.Zu : Ljava/lang/Object;
    //   580: sipush #-28236
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: iconst_1
    //   587: ldc burp/Zg_p
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
    //   705: sipush #22923
    //   708: sipush #-22349
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
    //   747: sipush #22912
    //   750: sipush #-16066
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
    //   906: new java/io/ByteArrayOutputStream
    //   909: dup
    //   910: invokespecial <init> : ()V
    //   913: astore_3
    //   914: sipush #22915
    //   917: aload_3
    //   918: sipush #202
    //   921: invokevirtual write : (I)V
    //   924: sipush #-12692
    //   927: aload_3
    //   928: sipush #254
    //   931: invokevirtual write : (I)V
    //   934: aload_3
    //   935: sipush #186
    //   938: invokevirtual write : (I)V
    //   941: aload_3
    //   942: sipush #190
    //   945: invokevirtual write : (I)V
    //   948: aload_3
    //   949: iconst_0
    //   950: invokevirtual write : (I)V
    //   953: aload_3
    //   954: iconst_1
    //   955: invokevirtual write : (I)V
    //   958: aload_3
    //   959: iconst_0
    //   960: invokevirtual write : (I)V
    //   963: aload_3
    //   964: bipush #50
    //   966: invokevirtual write : (I)V
    //   969: aload_3
    //   970: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   973: checkcast java/math/BigInteger
    //   976: invokevirtual toByteArray : ()[B
    //   979: invokevirtual write : ([B)V
    //   982: aload_3
    //   983: getstatic burp/Zm06.ZU : Ljava/lang/Object;
    //   986: checkcast java/math/BigInteger
    //   989: invokevirtual toByteArray : ()[B
    //   992: invokevirtual write : ([B)V
    //   995: aload_3
    //   996: getstatic burp/Zrpm.ZR : Ljava/lang/Object;
    //   999: checkcast java/math/BigInteger
    //   1002: invokevirtual toByteArray : ()[B
    //   1005: invokevirtual write : ([B)V
    //   1008: aload_3
    //   1009: invokevirtual toByteArray : ()[B
    //   1012: astore #4
    //   1014: aconst_null
    //   1015: astore #5
    //   1017: invokestatic a : (II)Ljava/lang/String;
    //   1020: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1023: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1026: astore #6
    //   1028: aload #6
    //   1030: arraylength
    //   1031: istore #7
    //   1033: iconst_0
    //   1034: istore #8
    //   1036: iload #8
    //   1038: iload #7
    //   1040: if_icmpge -> 1168
    //   1043: aload #6
    //   1045: iload #8
    //   1047: aaload
    //   1048: astore #9
    //   1050: aload #9
    //   1052: invokevirtual getName : ()Ljava/lang/String;
    //   1055: sipush #22913
    //   1058: sipush #3956
    //   1061: invokestatic a : (II)Ljava/lang/String;
    //   1064: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1067: ifeq -> 1161
    //   1070: aload #9
    //   1072: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1075: astore #10
    //   1077: aload #10
    //   1079: arraylength
    //   1080: iconst_4
    //   1081: if_icmpeq -> 1091
    //   1084: goto -> 1161
    //   1087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1090: athrow
    //   1091: aload #10
    //   1093: iconst_0
    //   1094: aaload
    //   1095: ldc java/lang/String
    //   1097: if_acmpeq -> 1107
    //   1100: goto -> 1161
    //   1103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1106: athrow
    //   1107: aload #10
    //   1109: iconst_1
    //   1110: aaload
    //   1111: ldc [B
    //   1113: if_acmpeq -> 1123
    //   1116: goto -> 1161
    //   1119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1122: athrow
    //   1123: aload #10
    //   1125: iconst_2
    //   1126: aaload
    //   1127: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1130: if_acmpeq -> 1140
    //   1133: goto -> 1161
    //   1136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1139: athrow
    //   1140: aload #10
    //   1142: iconst_3
    //   1143: aaload
    //   1144: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1147: if_acmpeq -> 1157
    //   1150: goto -> 1161
    //   1153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1156: athrow
    //   1157: aload #9
    //   1159: astore #5
    //   1161: iinc #8, 1
    //   1164: iload_2
    //   1165: ifne -> 1036
    //   1168: aload #5
    //   1170: iconst_1
    //   1171: invokevirtual setAccessible : (Z)V
    //   1174: ldc burp/Zebu
    //   1176: iconst_0
    //   1177: anewarray java/lang/Class
    //   1180: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1183: astore #6
    //   1185: aload #6
    //   1187: iconst_1
    //   1188: invokevirtual setAccessible : (Z)V
    //   1191: aload #5
    //   1193: aload #6
    //   1195: iconst_0
    //   1196: anewarray java/lang/Object
    //   1199: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1202: iconst_4
    //   1203: anewarray java/lang/Object
    //   1206: dup
    //   1207: iconst_0
    //   1208: sipush #22922
    //   1211: sipush #11372
    //   1214: invokestatic a : (II)Ljava/lang/String;
    //   1217: aastore
    //   1218: dup
    //   1219: iconst_1
    //   1220: aload #4
    //   1222: aastore
    //   1223: dup
    //   1224: iconst_2
    //   1225: iconst_0
    //   1226: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1229: aastore
    //   1230: dup
    //   1231: iconst_3
    //   1232: aload #4
    //   1234: arraylength
    //   1235: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1238: aastore
    //   1239: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1242: pop
    //   1243: goto -> 1247
    //   1246: astore_3
    //   1247: getstatic burp/Zezq.Zp : Ljava/lang/String;
    //   1250: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   1253: checkcast java/math/BigInteger
    //   1256: invokevirtual intValue : ()I
    //   1259: bipush #32
    //   1261: irem
    //   1262: invokestatic abs : (I)I
    //   1265: invokevirtual charAt : (I)C
    //   1268: getstatic burp/Zxxf.Zw : Ljava/lang/String;
    //   1271: getstatic burp/Zrva.ZE : Ljava/lang/Object;
    //   1274: checkcast java/math/BigInteger
    //   1277: invokevirtual intValue : ()I
    //   1280: bipush #32
    //   1282: irem
    //   1283: invokestatic abs : (I)I
    //   1286: invokevirtual charAt : (I)C
    //   1289: if_icmpgt -> 1404
    //   1292: getstatic burp/Zmf6.Zn : Ljava/lang/String;
    //   1295: getstatic burp/Zrct.ZV : Ljava/lang/Object;
    //   1298: checkcast java/math/BigInteger
    //   1301: invokevirtual intValue : ()I
    //   1304: bipush #32
    //   1306: irem
    //   1307: invokestatic abs : (I)I
    //   1310: invokevirtual charAt : (I)C
    //   1313: getstatic burp/Zrd3.Z_ : Ljava/lang/String;
    //   1316: getstatic burp/Zsk2.ZD : Ljava/lang/Object;
    //   1319: checkcast java/math/BigInteger
    //   1322: invokevirtual intValue : ()I
    //   1325: bipush #32
    //   1327: irem
    //   1328: invokestatic abs : (I)I
    //   1331: invokevirtual charAt : (I)C
    //   1334: if_icmpgt -> 1404
    //   1337: goto -> 1344
    //   1340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1343: athrow
    //   1344: getstatic burp/Zb9q.Zk : Ljava/lang/String;
    //   1347: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   1350: checkcast java/math/BigInteger
    //   1353: invokevirtual intValue : ()I
    //   1356: bipush #32
    //   1358: irem
    //   1359: invokestatic abs : (I)I
    //   1362: invokevirtual charAt : (I)C
    //   1365: getstatic burp/Zlqy.ZZ : Ljava/lang/String;
    //   1368: getstatic burp/Zbli.Zo : Ljava/lang/Object;
    //   1371: checkcast java/math/BigInteger
    //   1374: invokevirtual intValue : ()I
    //   1377: bipush #32
    //   1379: irem
    //   1380: invokestatic abs : (I)I
    //   1383: invokevirtual charAt : (I)C
    //   1386: if_icmple -> 1404
    //   1389: goto -> 1396
    //   1392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1395: athrow
    //   1396: iconst_1
    //   1397: goto -> 1405
    //   1400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1403: athrow
    //   1404: iconst_0
    //   1405: ireturn
    //   1406: astore_3
    //   1407: new java/lang/Exception
    //   1410: dup
    //   1411: aload_3
    //   1412: invokevirtual getMessage : ()Ljava/lang/String;
    //   1415: invokespecial <init> : (Ljava/lang/String;)V
    //   1418: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1405	1406	java/lang/Throwable
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
    //   906	1243	1246	java/lang/Throwable
    //   1077	1087	1087	java/lang/Throwable
    //   1091	1103	1103	java/lang/Throwable
    //   1107	1119	1119	java/lang/Throwable
    //   1123	1136	1136	java/lang/Throwable
    //   1140	1153	1153	java/lang/Throwable
    //   1247	1337	1340	java/lang/Throwable
    //   1292	1389	1392	java/lang/Throwable
    //   1344	1400	1400	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ';¨ä²Y± 0]ý(L§É]Êo§-¼§úwæhU¾Ô0GÊû1³Y:(N!\\tdÿp¦!fmû"kÖÏ)DÐ\\t@ÓQkÖÀM¾oxäèw¸©®GdR~Â`Ô\\t¼av2æêuònEl°ûí·£ ·U^J ÙûÞ²µEo0Ä¨Ñ%ÃÏîð0^2\\tÄÌëù$.e¹\\t[ÇZ¿eý\\b4õÃçYy'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #23
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc '­Ïq. ÐwÞÍÑBÿÈò(\\tÿÄë-¯'×É®¦©ú'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_2
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zlr2.a : [Ljava/lang/String;
    //   130: bipush #11
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zlr2.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #54
    //   214: goto -> 244
    //   217: bipush #72
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #55
    //   229: goto -> 244
    //   232: bipush #61
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #32
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 97
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #114
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-92
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-98
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-90
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #40
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #36
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-29
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-56
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #113
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-47
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #38
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #118
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #116
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #20
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-30
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-112
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-127
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-45
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-44
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-29
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-15
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #61
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-15
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-19
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #10
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #86
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-47
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #109
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #53
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #115
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-18
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #7
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zlr2.Zq : Ljava/lang/Object;
    //   501: sipush #22920
    //   504: sipush #14433
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zlr2.ZV : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5982) & 0xFFFF;
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
      byte b1 = 55;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlr2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */