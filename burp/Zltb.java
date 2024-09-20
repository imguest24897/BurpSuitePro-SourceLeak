package burp;

import java.math.BigInteger;

class Zltb extends ClassLoader {
  static Object ZL;
  
  static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
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
    //   78: ifeq -> 34
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
    //   206: ifeq -> 271
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
    //   429: ifeq -> 178
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
    //   471: ifeq -> 147
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
    //   555: ifeq -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: sipush #32571
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Zlc5.ZH : Ljava/lang/Object;
    //   580: sipush #20905
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: iconst_1
    //   587: ldc burp/Zkvq
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
    //   705: sipush #32573
    //   708: sipush #24620
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
    //   744: ifeq -> 606
    //   747: sipush #32563
    //   750: sipush #-19867
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
    //   889: ifeq -> 906
    //   892: iinc #5, 1
    //   895: iload_2
    //   896: ifeq -> 770
    //   899: goto -> 906
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: getstatic burp/Zsgj.ZK : Ljava/lang/Object;
    //   909: checkcast java/math/BigInteger
    //   912: invokevirtual intValue : ()I
    //   915: i2l
    //   916: invokestatic currentTimeMillis : ()J
    //   919: ladd
    //   920: getstatic burp/Zsgj.ZK : Ljava/lang/Object;
    //   923: checkcast java/math/BigInteger
    //   926: invokevirtual intValue : ()I
    //   929: i2l
    //   930: lcmp
    //   931: ifge -> 1263
    //   934: sipush #32568
    //   937: sipush #23639
    //   940: invokestatic a : (II)Ljava/lang/String;
    //   943: iconst_1
    //   944: ldc burp/Zme
    //   946: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   949: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   952: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   955: astore_3
    //   956: aload_3
    //   957: arraylength
    //   958: istore #4
    //   960: iconst_0
    //   961: istore #5
    //   963: iload #5
    //   965: iload #4
    //   967: if_icmpge -> 1104
    //   970: aload_3
    //   971: iload #5
    //   973: aaload
    //   974: astore #6
    //   976: aload #6
    //   978: invokevirtual getModifiers : ()I
    //   981: invokestatic isStatic : (I)Z
    //   984: ifne -> 994
    //   987: goto -> 1097
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: aload #6
    //   996: invokevirtual getType : ()Ljava/lang/Class;
    //   999: astore #7
    //   1001: aload #7
    //   1003: ifnull -> 1084
    //   1006: aload #7
    //   1008: invokevirtual isPrimitive : ()Z
    //   1011: ifne -> 1084
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload #7
    //   1023: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1026: ifnull -> 1084
    //   1029: goto -> 1036
    //   1032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1035: athrow
    //   1036: aload #7
    //   1038: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1041: invokevirtual getName : ()Ljava/lang/String;
    //   1044: ifnull -> 1084
    //   1047: goto -> 1054
    //   1050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1053: athrow
    //   1054: aload #7
    //   1056: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1059: invokevirtual getName : ()Ljava/lang/String;
    //   1062: sipush #32569
    //   1065: sipush #-18590
    //   1068: invokestatic a : (II)Ljava/lang/String;
    //   1071: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1074: ifne -> 1084
    //   1077: goto -> 1084
    //   1080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1083: athrow
    //   1084: aload #6
    //   1086: iconst_1
    //   1087: invokevirtual setAccessible : (Z)V
    //   1090: aload #6
    //   1092: aconst_null
    //   1093: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1096: pop
    //   1097: iinc #5, 1
    //   1100: iload_2
    //   1101: ifeq -> 963
    //   1104: sipush #32570
    //   1107: sipush #29374
    //   1110: invokestatic a : (II)Ljava/lang/String;
    //   1113: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1116: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1119: astore_3
    //   1120: aload_3
    //   1121: arraylength
    //   1122: istore #4
    //   1124: iconst_0
    //   1125: istore #5
    //   1127: iload #5
    //   1129: iload #4
    //   1131: if_icmpge -> 1263
    //   1134: aload_3
    //   1135: iload #5
    //   1137: aaload
    //   1138: astore #6
    //   1140: aload #6
    //   1142: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1145: pop
    //   1146: aload #6
    //   1148: invokevirtual getModifiers : ()I
    //   1151: invokestatic isStatic : (I)Z
    //   1154: ifeq -> 1249
    //   1157: aload #6
    //   1159: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1162: arraylength
    //   1163: iconst_2
    //   1164: if_icmpne -> 1249
    //   1167: goto -> 1174
    //   1170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1173: athrow
    //   1174: aload #6
    //   1176: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1179: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1182: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1185: ifeq -> 1249
    //   1188: goto -> 1195
    //   1191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1194: athrow
    //   1195: aload #6
    //   1197: iconst_1
    //   1198: invokevirtual setAccessible : (Z)V
    //   1201: aload #6
    //   1203: aconst_null
    //   1204: iconst_2
    //   1205: anewarray java/lang/Object
    //   1208: dup
    //   1209: iconst_0
    //   1210: aload_0
    //   1211: aastore
    //   1212: dup
    //   1213: iconst_1
    //   1214: aload_1
    //   1215: ifnonnull -> 1233
    //   1218: goto -> 1225
    //   1221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1224: athrow
    //   1225: aload_1
    //   1226: goto -> 1240
    //   1229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1232: athrow
    //   1233: aload_1
    //   1234: checkcast [B
    //   1237: invokevirtual clone : ()Ljava/lang/Object;
    //   1240: aastore
    //   1241: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1244: pop
    //   1245: iload_2
    //   1246: ifeq -> 1263
    //   1249: iinc #5, 1
    //   1252: iload_2
    //   1253: ifeq -> 1127
    //   1256: goto -> 1263
    //   1259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1262: athrow
    //   1263: getstatic burp/Zmir.ZI : Ljava/lang/String;
    //   1266: getstatic burp/Zg8.ZX : Ljava/lang/Object;
    //   1269: checkcast java/math/BigInteger
    //   1272: invokevirtual intValue : ()I
    //   1275: bipush #32
    //   1277: irem
    //   1278: invokestatic abs : (I)I
    //   1281: invokevirtual charAt : (I)C
    //   1284: getstatic burp/Zx5w.Zq : Ljava/lang/String;
    //   1287: getstatic burp/Zefm.ZP : Ljava/lang/Object;
    //   1290: checkcast java/math/BigInteger
    //   1293: invokevirtual intValue : ()I
    //   1296: bipush #32
    //   1298: irem
    //   1299: invokestatic abs : (I)I
    //   1302: invokevirtual charAt : (I)C
    //   1305: if_icmple -> 1420
    //   1308: getstatic burp/Zz67.Zc : Ljava/lang/String;
    //   1311: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
    //   1314: checkcast java/math/BigInteger
    //   1317: invokevirtual intValue : ()I
    //   1320: bipush #32
    //   1322: irem
    //   1323: invokestatic abs : (I)I
    //   1326: invokevirtual charAt : (I)C
    //   1329: getstatic burp/Zl5b.Zi : Ljava/lang/String;
    //   1332: getstatic burp/Zmh0.Zt : Ljava/lang/Object;
    //   1335: checkcast java/math/BigInteger
    //   1338: invokevirtual intValue : ()I
    //   1341: bipush #32
    //   1343: irem
    //   1344: invokestatic abs : (I)I
    //   1347: invokevirtual charAt : (I)C
    //   1350: if_icmpgt -> 1420
    //   1353: goto -> 1360
    //   1356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1359: athrow
    //   1360: getstatic burp/Zz0.ZX : Ljava/lang/String;
    //   1363: getstatic burp/Zvof.Zl : Ljava/lang/Object;
    //   1366: checkcast java/math/BigInteger
    //   1369: invokevirtual intValue : ()I
    //   1372: bipush #32
    //   1374: irem
    //   1375: invokestatic abs : (I)I
    //   1378: invokevirtual charAt : (I)C
    //   1381: getstatic burp/Zrcx.ZW : Ljava/lang/String;
    //   1384: getstatic burp/Zgkp.Zp : Ljava/lang/Object;
    //   1387: checkcast java/math/BigInteger
    //   1390: invokevirtual intValue : ()I
    //   1393: bipush #32
    //   1395: irem
    //   1396: invokestatic abs : (I)I
    //   1399: invokevirtual charAt : (I)C
    //   1402: if_icmpgt -> 1420
    //   1405: goto -> 1412
    //   1408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1411: athrow
    //   1412: iconst_1
    //   1413: goto -> 1421
    //   1416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1419: athrow
    //   1420: iconst_0
    //   1421: ireturn
    //   1422: astore_3
    //   1423: new java/lang/Exception
    //   1426: dup
    //   1427: aload_3
    //   1428: invokevirtual getMessage : ()Ljava/lang/String;
    //   1431: invokespecial <init> : (Ljava/lang/String;)V
    //   1434: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1421	1422	java/lang/Throwable
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
    //   976	990	990	java/lang/Throwable
    //   1001	1014	1017	java/lang/Throwable
    //   1006	1029	1032	java/lang/Throwable
    //   1021	1047	1050	java/lang/Throwable
    //   1036	1077	1080	java/lang/Throwable
    //   1140	1167	1170	java/lang/Throwable
    //   1157	1188	1191	java/lang/Throwable
    //   1174	1218	1221	java/lang/Throwable
    //   1195	1229	1229	java/lang/Throwable
    //   1240	1256	1259	java/lang/Throwable
    //   1263	1353	1356	java/lang/Throwable
    //   1308	1405	1408	java/lang/Throwable
    //   1360	1416	1416	java/lang/Throwable
  }
  
  static void Zc(Object paramObject) {
    Zxnm.Zw = a(32572, -29619);
    Zxnm.ZW = new BigInteger(a(32574, 29414));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ztte.ZD.charAt(Math.abs(((BigInteger)Zblv.Zf).intValue() % 32)) <= Zko9.Zf.charAt(Math.abs(((BigInteger)Zbxp.ZW).intValue() % 32))) {
          try {
            Zct.Zl(Class.forName(a(32560, -21391)));
            if (!bool)
              Zgkl.ZY(Class.forName(a(32575, 23645))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgkl.ZY(Class.forName(a(32575, 23645)));
    } catch (Throwable throwable) {}
  }
  
  static void Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ë¾\\týc±2ß4V\\tJpÒÒ³¦ß\\t=·{õ1P]ûU¸v 03Xå©e6;2»í+Øk¾Xæ(ãtr>u\\töu­[á?LÃÿ*Ðÿà!R±¿t.­¼æ< RôÖË  4ÿÛ-´'k]T~/rzyxÁ\\bantÑÐ\\n/ ¼²Å \\rð-E¦Uýv\qm\\r8C`ì×÷z_Â÷Î²ÞM'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #65
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'ÎW-¸àóx\\tè_Á, Àåv8'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #89
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
    //   128: putstatic burp/Zltb.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zltb.b : [Ljava/lang/String;
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
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #96
    //   219: goto -> 244
    //   222: bipush #80
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #81
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #104
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-31
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-122
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #27
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-35
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-25
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #42
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #14
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #20
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-52
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-11
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-29
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #59
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #91
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #55
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #70
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #22
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #53
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-8
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-112
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-97
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #21
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #62
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: iconst_m1
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: iconst_4
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #37
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #117
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #19
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #101
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #69
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-79
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-33
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Zltb.ZL : Ljava/lang/Object;
    //   499: sipush #32561
    //   502: sipush #21262
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zltb.ZO : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7F39) & 0xFFFF;
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
      byte b1 = 120;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zltb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */