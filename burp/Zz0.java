package burp;

import java.math.BigInteger;

class Zz0 extends ClassLoader {
  static Object ZJ;
  
  static String ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zy(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #-23782
    //   7: sipush #-27909
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zf : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zszm.ZI : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: invokevirtual toByteArray : ()[B
    //   28: astore_3
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #5
    //   38: aload #5
    //   40: sipush #-23777
    //   43: sipush #26771
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_3
    //   54: astore #6
    //   56: aload #6
    //   58: arraylength
    //   59: istore #7
    //   61: iconst_0
    //   62: istore #8
    //   64: iload #8
    //   66: iload #7
    //   68: if_icmpge -> 94
    //   71: aload #6
    //   73: iload #8
    //   75: baload
    //   76: istore #9
    //   78: aload #5
    //   80: iload #9
    //   82: i2c
    //   83: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: iinc #8, 1
    //   90: iload_2
    //   91: ifne -> 64
    //   94: aload #5
    //   96: sipush #-23788
    //   99: sipush #27630
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: ldc ''
    //   107: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   110: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload #5
    //   119: sipush #-23792
    //   122: sipush #-25334
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: ldc ''
    //   130: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   133: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload #5
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokevirtual getBytes : ()[B
    //   148: astore #4
    //   150: aload #4
    //   152: astore_3
    //   153: aload_3
    //   154: arraylength
    //   155: bipush #8
    //   157: iadd
    //   158: bipush #6
    //   160: ishr
    //   161: iconst_1
    //   162: iadd
    //   163: bipush #16
    //   165: imul
    //   166: newarray int
    //   168: astore #5
    //   170: iconst_0
    //   171: istore #6
    //   173: iload #6
    //   175: aload_3
    //   176: arraylength
    //   177: if_icmpge -> 220
    //   180: aload_3
    //   181: iload #6
    //   183: baload
    //   184: sipush #255
    //   187: iand
    //   188: istore #7
    //   190: aload #5
    //   192: iload #6
    //   194: iconst_2
    //   195: ishr
    //   196: dup2
    //   197: iaload
    //   198: iload #7
    //   200: bipush #24
    //   202: iload #6
    //   204: iconst_4
    //   205: irem
    //   206: bipush #8
    //   208: imul
    //   209: isub
    //   210: ishl
    //   211: ior
    //   212: iastore
    //   213: iinc #6, 1
    //   216: iload_2
    //   217: ifne -> 173
    //   220: aload #5
    //   222: iload #6
    //   224: iconst_2
    //   225: ishr
    //   226: dup2
    //   227: iaload
    //   228: sipush #128
    //   231: bipush #24
    //   233: iload #6
    //   235: iconst_4
    //   236: irem
    //   237: bipush #8
    //   239: imul
    //   240: isub
    //   241: ishl
    //   242: ior
    //   243: iastore
    //   244: aload #5
    //   246: aload #5
    //   248: arraylength
    //   249: iconst_1
    //   250: isub
    //   251: aload_3
    //   252: arraylength
    //   253: bipush #8
    //   255: imul
    //   256: iastore
    //   257: bipush #80
    //   259: newarray int
    //   261: astore #7
    //   263: ldc 1732584193
    //   265: istore #8
    //   267: ldc -271733879
    //   269: istore #9
    //   271: ldc -1732584194
    //   273: istore #10
    //   275: ldc 271733878
    //   277: istore #11
    //   279: ldc -1009589776
    //   281: istore #12
    //   283: iconst_0
    //   284: istore #6
    //   286: iload #6
    //   288: aload #5
    //   290: arraylength
    //   291: if_icmpge -> 613
    //   294: iload #8
    //   296: istore #13
    //   298: iload #9
    //   300: istore #14
    //   302: iload #10
    //   304: istore #15
    //   306: iload #11
    //   308: istore #16
    //   310: iload #12
    //   312: istore #17
    //   314: iconst_0
    //   315: istore #18
    //   317: iload #18
    //   319: bipush #80
    //   321: if_icmpge -> 571
    //   324: iload #18
    //   326: bipush #16
    //   328: if_icmpge -> 355
    //   331: aload #7
    //   333: iload #18
    //   335: aload #5
    //   337: iload #6
    //   339: iload #18
    //   341: iadd
    //   342: iaload
    //   343: iastore
    //   344: iload_2
    //   345: ifne -> 410
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   354: athrow
    //   355: aload #7
    //   357: iload #18
    //   359: iconst_3
    //   360: isub
    //   361: iaload
    //   362: aload #7
    //   364: iload #18
    //   366: bipush #8
    //   368: isub
    //   369: iaload
    //   370: ixor
    //   371: aload #7
    //   373: iload #18
    //   375: bipush #14
    //   377: isub
    //   378: iaload
    //   379: ixor
    //   380: aload #7
    //   382: iload #18
    //   384: bipush #16
    //   386: isub
    //   387: iaload
    //   388: ixor
    //   389: istore #19
    //   391: iload #19
    //   393: iconst_1
    //   394: ishl
    //   395: iload #19
    //   397: bipush #31
    //   399: iushr
    //   400: ior
    //   401: istore #20
    //   403: aload #7
    //   405: iload #18
    //   407: iload #20
    //   409: iastore
    //   410: iload #8
    //   412: iconst_5
    //   413: ishl
    //   414: iload #8
    //   416: bipush #27
    //   418: iushr
    //   419: ior
    //   420: istore #19
    //   422: iload #19
    //   424: iload #12
    //   426: iadd
    //   427: aload #7
    //   429: iload #18
    //   431: iaload
    //   432: iadd
    //   433: iload #18
    //   435: bipush #20
    //   437: if_icmpge -> 463
    //   440: ldc 1518500249
    //   442: iload #9
    //   444: iload #10
    //   446: iand
    //   447: iload #9
    //   449: iconst_m1
    //   450: ixor
    //   451: iload #11
    //   453: iand
    //   454: ior
    //   455: iadd
    //   456: goto -> 533
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: iload #18
    //   465: bipush #40
    //   467: if_icmpge -> 488
    //   470: ldc 1859775393
    //   472: iload #9
    //   474: iload #10
    //   476: ixor
    //   477: iload #11
    //   479: ixor
    //   480: iadd
    //   481: goto -> 533
    //   484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   487: athrow
    //   488: iload #18
    //   490: bipush #60
    //   492: if_icmpge -> 522
    //   495: ldc -1894007588
    //   497: iload #9
    //   499: iload #10
    //   501: iand
    //   502: iload #9
    //   504: iload #11
    //   506: iand
    //   507: ior
    //   508: iload #10
    //   510: iload #11
    //   512: iand
    //   513: ior
    //   514: iadd
    //   515: goto -> 533
    //   518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   521: athrow
    //   522: ldc -899497514
    //   524: iload #9
    //   526: iload #10
    //   528: ixor
    //   529: iload #11
    //   531: ixor
    //   532: iadd
    //   533: iadd
    //   534: istore #20
    //   536: iload #11
    //   538: istore #12
    //   540: iload #10
    //   542: istore #11
    //   544: iload #9
    //   546: bipush #30
    //   548: ishl
    //   549: iload #9
    //   551: iconst_2
    //   552: iushr
    //   553: ior
    //   554: istore #10
    //   556: iload #8
    //   558: istore #9
    //   560: iload #20
    //   562: istore #8
    //   564: iinc #18, 1
    //   567: iload_2
    //   568: ifne -> 317
    //   571: iload #8
    //   573: iload #13
    //   575: iadd
    //   576: istore #8
    //   578: iload #9
    //   580: iload #14
    //   582: iadd
    //   583: istore #9
    //   585: iload #10
    //   587: iload #15
    //   589: iadd
    //   590: istore #10
    //   592: iload #11
    //   594: iload #16
    //   596: iadd
    //   597: istore #11
    //   599: iload #12
    //   601: iload #17
    //   603: iadd
    //   604: istore #12
    //   606: iinc #6, 16
    //   609: iload_2
    //   610: ifne -> 286
    //   613: iconst_5
    //   614: newarray int
    //   616: dup
    //   617: iconst_0
    //   618: iload #8
    //   620: iastore
    //   621: dup
    //   622: iconst_1
    //   623: iload #9
    //   625: iastore
    //   626: dup
    //   627: iconst_2
    //   628: iload #10
    //   630: iastore
    //   631: dup
    //   632: iconst_3
    //   633: iload #11
    //   635: iastore
    //   636: dup
    //   637: iconst_4
    //   638: iload #12
    //   640: iastore
    //   641: astore #13
    //   643: bipush #20
    //   645: newarray byte
    //   647: astore #14
    //   649: iconst_0
    //   650: istore #15
    //   652: iload #15
    //   654: bipush #20
    //   656: if_icmpge -> 697
    //   659: aload #13
    //   661: iload #15
    //   663: iconst_4
    //   664: idiv
    //   665: iaload
    //   666: istore #16
    //   668: iconst_3
    //   669: iload #15
    //   671: iconst_4
    //   672: irem
    //   673: isub
    //   674: bipush #8
    //   676: imul
    //   677: istore #17
    //   679: aload #14
    //   681: iload #15
    //   683: iload #16
    //   685: iload #17
    //   687: iushr
    //   688: i2b
    //   689: bastore
    //   690: iinc #15, 1
    //   693: iload_2
    //   694: ifne -> 652
    //   697: aload #14
    //   699: astore #4
    //   701: sipush #-23795
    //   704: sipush #22229
    //   707: invokestatic a : (II)Ljava/lang/String;
    //   710: iconst_1
    //   711: ldc burp/Zsmn
    //   713: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   716: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   719: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   722: astore_3
    //   723: aload_3
    //   724: arraylength
    //   725: istore #4
    //   727: iconst_0
    //   728: istore #5
    //   730: iload #5
    //   732: iload #4
    //   734: if_icmpge -> 871
    //   737: aload_3
    //   738: iload #5
    //   740: aaload
    //   741: astore #6
    //   743: aload #6
    //   745: invokevirtual getModifiers : ()I
    //   748: invokestatic isStatic : (I)Z
    //   751: ifne -> 761
    //   754: goto -> 864
    //   757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   760: athrow
    //   761: aload #6
    //   763: invokevirtual getType : ()Ljava/lang/Class;
    //   766: astore #7
    //   768: aload #7
    //   770: ifnull -> 851
    //   773: aload #7
    //   775: invokevirtual isPrimitive : ()Z
    //   778: ifne -> 851
    //   781: goto -> 788
    //   784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   787: athrow
    //   788: aload #7
    //   790: invokevirtual getPackage : ()Ljava/lang/Package;
    //   793: ifnull -> 851
    //   796: goto -> 803
    //   799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   802: athrow
    //   803: aload #7
    //   805: invokevirtual getPackage : ()Ljava/lang/Package;
    //   808: invokevirtual getName : ()Ljava/lang/String;
    //   811: ifnull -> 851
    //   814: goto -> 821
    //   817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   820: athrow
    //   821: aload #7
    //   823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   826: invokevirtual getName : ()Ljava/lang/String;
    //   829: sipush #-23787
    //   832: sipush #-202
    //   835: invokestatic a : (II)Ljava/lang/String;
    //   838: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   841: ifne -> 851
    //   844: goto -> 851
    //   847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   850: athrow
    //   851: aload #6
    //   853: iconst_1
    //   854: invokevirtual setAccessible : (Z)V
    //   857: aload #6
    //   859: aconst_null
    //   860: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   863: pop
    //   864: iinc #5, 1
    //   867: iload_2
    //   868: ifne -> 730
    //   871: sipush #-23778
    //   874: sipush #1442
    //   877: invokestatic a : (II)Ljava/lang/String;
    //   880: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   883: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   886: astore_3
    //   887: aload_3
    //   888: arraylength
    //   889: istore #4
    //   891: iconst_0
    //   892: istore #5
    //   894: iload #5
    //   896: iload #4
    //   898: if_icmpge -> 1009
    //   901: aload_3
    //   902: iload #5
    //   904: aaload
    //   905: astore #6
    //   907: aload #6
    //   909: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   912: pop
    //   913: aload #6
    //   915: invokevirtual getModifiers : ()I
    //   918: invokestatic isStatic : (I)Z
    //   921: ifeq -> 995
    //   924: aload #6
    //   926: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   929: arraylength
    //   930: iconst_2
    //   931: if_icmpne -> 995
    //   934: goto -> 941
    //   937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   940: athrow
    //   941: aload #6
    //   943: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   946: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   949: if_acmpne -> 995
    //   952: goto -> 959
    //   955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   958: athrow
    //   959: aload #6
    //   961: iconst_1
    //   962: invokevirtual setAccessible : (Z)V
    //   965: aload #6
    //   967: aconst_null
    //   968: iconst_2
    //   969: anewarray java/lang/Object
    //   972: dup
    //   973: iconst_0
    //   974: aload_0
    //   975: aastore
    //   976: dup
    //   977: iconst_1
    //   978: aload_1
    //   979: aastore
    //   980: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   983: pop
    //   984: iload_2
    //   985: ifne -> 1009
    //   988: goto -> 995
    //   991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   994: athrow
    //   995: iinc #5, 1
    //   998: iload_2
    //   999: ifne -> 894
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1008: athrow
    //   1009: sipush #-23789
    //   1012: sipush #-25481
    //   1015: invokestatic a : (II)Ljava/lang/String;
    //   1018: iconst_1
    //   1019: ldc burp/Zk8g
    //   1021: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1024: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1027: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1030: astore_3
    //   1031: aload_3
    //   1032: arraylength
    //   1033: istore #4
    //   1035: iconst_0
    //   1036: istore #5
    //   1038: iload #5
    //   1040: iload #4
    //   1042: if_icmpge -> 1179
    //   1045: aload_3
    //   1046: iload #5
    //   1048: aaload
    //   1049: astore #6
    //   1051: aload #6
    //   1053: invokevirtual getModifiers : ()I
    //   1056: invokestatic isStatic : (I)Z
    //   1059: ifne -> 1069
    //   1062: goto -> 1172
    //   1065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1068: athrow
    //   1069: aload #6
    //   1071: invokevirtual getType : ()Ljava/lang/Class;
    //   1074: astore #7
    //   1076: aload #7
    //   1078: ifnull -> 1159
    //   1081: aload #7
    //   1083: invokevirtual isPrimitive : ()Z
    //   1086: ifne -> 1159
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1095: athrow
    //   1096: aload #7
    //   1098: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1101: ifnull -> 1159
    //   1104: goto -> 1111
    //   1107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1110: athrow
    //   1111: aload #7
    //   1113: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1116: invokevirtual getName : ()Ljava/lang/String;
    //   1119: ifnull -> 1159
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #7
    //   1131: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1134: invokevirtual getName : ()Ljava/lang/String;
    //   1137: sipush #-23780
    //   1140: sipush #9271
    //   1143: invokestatic a : (II)Ljava/lang/String;
    //   1146: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1149: ifne -> 1159
    //   1152: goto -> 1159
    //   1155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1158: athrow
    //   1159: aload #6
    //   1161: iconst_1
    //   1162: invokevirtual setAccessible : (Z)V
    //   1165: aload #6
    //   1167: aconst_null
    //   1168: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1171: pop
    //   1172: iinc #5, 1
    //   1175: iload_2
    //   1176: ifne -> 1038
    //   1179: sipush #-23791
    //   1182: sipush #-6021
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1191: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1194: astore_3
    //   1195: aload_3
    //   1196: arraylength
    //   1197: istore #4
    //   1199: iconst_0
    //   1200: istore #5
    //   1202: iload #5
    //   1204: iload #4
    //   1206: if_icmpge -> 1335
    //   1209: aload_3
    //   1210: iload #5
    //   1212: aaload
    //   1213: astore #6
    //   1215: aload #6
    //   1217: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1220: pop
    //   1221: aload #6
    //   1223: invokevirtual getModifiers : ()I
    //   1226: invokestatic isStatic : (I)Z
    //   1229: ifeq -> 1321
    //   1232: aload #6
    //   1234: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1237: arraylength
    //   1238: iconst_2
    //   1239: if_icmpne -> 1321
    //   1242: goto -> 1249
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload #6
    //   1251: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1254: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1257: if_acmpne -> 1321
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1266: athrow
    //   1267: aload #6
    //   1269: iconst_1
    //   1270: invokevirtual setAccessible : (Z)V
    //   1273: aload #6
    //   1275: aconst_null
    //   1276: iconst_2
    //   1277: anewarray java/lang/Object
    //   1280: dup
    //   1281: iconst_0
    //   1282: aload_0
    //   1283: aastore
    //   1284: dup
    //   1285: iconst_1
    //   1286: aload_1
    //   1287: ifnonnull -> 1305
    //   1290: goto -> 1297
    //   1293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1296: athrow
    //   1297: aload_1
    //   1298: goto -> 1312
    //   1301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1304: athrow
    //   1305: aload_1
    //   1306: checkcast [B
    //   1309: invokevirtual clone : ()Ljava/lang/Object;
    //   1312: aastore
    //   1313: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1316: pop
    //   1317: iload_2
    //   1318: ifne -> 1335
    //   1321: iinc #5, 1
    //   1324: iload_2
    //   1325: ifne -> 1202
    //   1328: goto -> 1335
    //   1331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1334: athrow
    //   1335: sipush #-23779
    //   1338: sipush #31836
    //   1341: invokestatic a : (II)Ljava/lang/String;
    //   1344: iconst_1
    //   1345: ldc burp/Zgds
    //   1347: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1350: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1353: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1356: astore_3
    //   1357: aload_3
    //   1358: arraylength
    //   1359: istore #4
    //   1361: iconst_0
    //   1362: istore #5
    //   1364: iload #5
    //   1366: iload #4
    //   1368: if_icmpge -> 1505
    //   1371: aload_3
    //   1372: iload #5
    //   1374: aaload
    //   1375: astore #6
    //   1377: aload #6
    //   1379: invokevirtual getModifiers : ()I
    //   1382: invokestatic isStatic : (I)Z
    //   1385: ifne -> 1395
    //   1388: goto -> 1498
    //   1391: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1394: athrow
    //   1395: aload #6
    //   1397: invokevirtual getType : ()Ljava/lang/Class;
    //   1400: astore #7
    //   1402: aload #7
    //   1404: ifnull -> 1485
    //   1407: aload #7
    //   1409: invokevirtual isPrimitive : ()Z
    //   1412: ifne -> 1485
    //   1415: goto -> 1422
    //   1418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1421: athrow
    //   1422: aload #7
    //   1424: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1427: ifnull -> 1485
    //   1430: goto -> 1437
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload #7
    //   1439: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1442: invokevirtual getName : ()Ljava/lang/String;
    //   1445: ifnull -> 1485
    //   1448: goto -> 1455
    //   1451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1454: athrow
    //   1455: aload #7
    //   1457: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1460: invokevirtual getName : ()Ljava/lang/String;
    //   1463: sipush #-23780
    //   1466: sipush #9271
    //   1469: invokestatic a : (II)Ljava/lang/String;
    //   1472: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1475: ifne -> 1485
    //   1478: goto -> 1485
    //   1481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1484: athrow
    //   1485: aload #6
    //   1487: iconst_1
    //   1488: invokevirtual setAccessible : (Z)V
    //   1491: aload #6
    //   1493: aconst_null
    //   1494: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1497: pop
    //   1498: iinc #5, 1
    //   1501: iload_2
    //   1502: ifne -> 1364
    //   1505: sipush #-23796
    //   1508: sipush #16290
    //   1511: invokestatic a : (II)Ljava/lang/String;
    //   1514: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1517: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1520: astore_3
    //   1521: aload_3
    //   1522: arraylength
    //   1523: istore #4
    //   1525: iconst_0
    //   1526: istore #5
    //   1528: iload #5
    //   1530: iload #4
    //   1532: if_icmpge -> 1664
    //   1535: aload_3
    //   1536: iload #5
    //   1538: aaload
    //   1539: astore #6
    //   1541: aload #6
    //   1543: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1546: pop
    //   1547: aload #6
    //   1549: invokevirtual getModifiers : ()I
    //   1552: invokestatic isStatic : (I)Z
    //   1555: ifeq -> 1650
    //   1558: aload #6
    //   1560: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1563: arraylength
    //   1564: iconst_2
    //   1565: if_icmpne -> 1650
    //   1568: goto -> 1575
    //   1571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1574: athrow
    //   1575: aload #6
    //   1577: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1580: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1583: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1586: ifeq -> 1650
    //   1589: goto -> 1596
    //   1592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1595: athrow
    //   1596: aload #6
    //   1598: iconst_1
    //   1599: invokevirtual setAccessible : (Z)V
    //   1602: aload #6
    //   1604: aconst_null
    //   1605: iconst_2
    //   1606: anewarray java/lang/Object
    //   1609: dup
    //   1610: iconst_0
    //   1611: aload_0
    //   1612: aastore
    //   1613: dup
    //   1614: iconst_1
    //   1615: aload_1
    //   1616: ifnonnull -> 1634
    //   1619: goto -> 1626
    //   1622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1625: athrow
    //   1626: aload_1
    //   1627: goto -> 1641
    //   1630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1633: athrow
    //   1634: aload_1
    //   1635: checkcast [B
    //   1638: invokevirtual clone : ()Ljava/lang/Object;
    //   1641: aastore
    //   1642: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1645: pop
    //   1646: iload_2
    //   1647: ifne -> 1664
    //   1650: iinc #5, 1
    //   1653: iload_2
    //   1654: ifne -> 1528
    //   1657: goto -> 1664
    //   1660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1663: athrow
    //   1664: getstatic burp/Zecm.ZJ : Ljava/lang/Object;
    //   1667: checkcast java/math/BigInteger
    //   1670: invokevirtual intValue : ()I
    //   1673: i2l
    //   1674: invokestatic currentTimeMillis : ()J
    //   1677: ladd
    //   1678: getstatic burp/Zrh1.ZF : Ljava/lang/Object;
    //   1681: checkcast java/math/BigInteger
    //   1684: invokevirtual intValue : ()I
    //   1687: i2l
    //   1688: lcmp
    //   1689: ifge -> 2021
    //   1692: sipush #-23783
    //   1695: sipush #-5625
    //   1698: invokestatic a : (II)Ljava/lang/String;
    //   1701: iconst_1
    //   1702: ldc burp/Zzpj
    //   1704: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1707: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1710: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1713: astore_3
    //   1714: aload_3
    //   1715: arraylength
    //   1716: istore #4
    //   1718: iconst_0
    //   1719: istore #5
    //   1721: iload #5
    //   1723: iload #4
    //   1725: if_icmpge -> 1862
    //   1728: aload_3
    //   1729: iload #5
    //   1731: aaload
    //   1732: astore #6
    //   1734: aload #6
    //   1736: invokevirtual getModifiers : ()I
    //   1739: invokestatic isStatic : (I)Z
    //   1742: ifne -> 1752
    //   1745: goto -> 1855
    //   1748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1751: athrow
    //   1752: aload #6
    //   1754: invokevirtual getType : ()Ljava/lang/Class;
    //   1757: astore #7
    //   1759: aload #7
    //   1761: ifnull -> 1842
    //   1764: aload #7
    //   1766: invokevirtual isPrimitive : ()Z
    //   1769: ifne -> 1842
    //   1772: goto -> 1779
    //   1775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1778: athrow
    //   1779: aload #7
    //   1781: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1784: ifnull -> 1842
    //   1787: goto -> 1794
    //   1790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1793: athrow
    //   1794: aload #7
    //   1796: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1799: invokevirtual getName : ()Ljava/lang/String;
    //   1802: ifnull -> 1842
    //   1805: goto -> 1812
    //   1808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1811: athrow
    //   1812: aload #7
    //   1814: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1817: invokevirtual getName : ()Ljava/lang/String;
    //   1820: sipush #-23780
    //   1823: sipush #9271
    //   1826: invokestatic a : (II)Ljava/lang/String;
    //   1829: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1832: ifne -> 1842
    //   1835: goto -> 1842
    //   1838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1841: athrow
    //   1842: aload #6
    //   1844: iconst_1
    //   1845: invokevirtual setAccessible : (Z)V
    //   1848: aload #6
    //   1850: aconst_null
    //   1851: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1854: pop
    //   1855: iinc #5, 1
    //   1858: iload_2
    //   1859: ifne -> 1721
    //   1862: sipush #-23785
    //   1865: sipush #-32421
    //   1868: invokestatic a : (II)Ljava/lang/String;
    //   1871: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1874: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1877: astore_3
    //   1878: aload_3
    //   1879: arraylength
    //   1880: istore #4
    //   1882: iconst_0
    //   1883: istore #5
    //   1885: iload #5
    //   1887: iload #4
    //   1889: if_icmpge -> 2021
    //   1892: aload_3
    //   1893: iload #5
    //   1895: aaload
    //   1896: astore #6
    //   1898: aload #6
    //   1900: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1903: pop
    //   1904: aload #6
    //   1906: invokevirtual getModifiers : ()I
    //   1909: invokestatic isStatic : (I)Z
    //   1912: ifeq -> 2007
    //   1915: aload #6
    //   1917: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1920: arraylength
    //   1921: iconst_2
    //   1922: if_icmpne -> 2007
    //   1925: goto -> 1932
    //   1928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1931: athrow
    //   1932: aload #6
    //   1934: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1937: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1940: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1943: ifeq -> 2007
    //   1946: goto -> 1953
    //   1949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1952: athrow
    //   1953: aload #6
    //   1955: iconst_1
    //   1956: invokevirtual setAccessible : (Z)V
    //   1959: aload #6
    //   1961: aconst_null
    //   1962: iconst_2
    //   1963: anewarray java/lang/Object
    //   1966: dup
    //   1967: iconst_0
    //   1968: aload_0
    //   1969: aastore
    //   1970: dup
    //   1971: iconst_1
    //   1972: aload_1
    //   1973: ifnonnull -> 1991
    //   1976: goto -> 1983
    //   1979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1982: athrow
    //   1983: aload_1
    //   1984: goto -> 1998
    //   1987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1990: athrow
    //   1991: aload_1
    //   1992: checkcast [B
    //   1995: invokevirtual clone : ()Ljava/lang/Object;
    //   1998: aastore
    //   1999: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2002: pop
    //   2003: iload_2
    //   2004: ifne -> 2021
    //   2007: iinc #5, 1
    //   2010: iload_2
    //   2011: ifne -> 1885
    //   2014: goto -> 2021
    //   2017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2020: athrow
    //   2021: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   2024: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   2027: checkcast java/math/BigInteger
    //   2030: invokevirtual intValue : ()I
    //   2033: bipush #32
    //   2035: irem
    //   2036: invokestatic abs : (I)I
    //   2039: invokevirtual charAt : (I)C
    //   2042: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   2045: getstatic burp/Zmjw.ZD : Ljava/lang/Object;
    //   2048: checkcast java/math/BigInteger
    //   2051: invokevirtual intValue : ()I
    //   2054: bipush #32
    //   2056: irem
    //   2057: invokestatic abs : (I)I
    //   2060: invokevirtual charAt : (I)C
    //   2063: if_icmpgt -> 2170
    //   2066: getstatic burp/Zg1k.Ze : Ljava/lang/String;
    //   2069: getstatic burp/Zsyu.Zj : Ljava/lang/Object;
    //   2072: checkcast java/math/BigInteger
    //   2075: invokevirtual intValue : ()I
    //   2078: bipush #32
    //   2080: irem
    //   2081: invokestatic abs : (I)I
    //   2084: invokevirtual charAt : (I)C
    //   2087: getstatic burp/Zrc0.ZL : Ljava/lang/String;
    //   2090: getstatic burp/Zx4y.Zc : Ljava/lang/Object;
    //   2093: checkcast java/math/BigInteger
    //   2096: invokevirtual intValue : ()I
    //   2099: bipush #32
    //   2101: irem
    //   2102: invokestatic abs : (I)I
    //   2105: invokevirtual charAt : (I)C
    //   2108: if_icmpgt -> 2170
    //   2111: goto -> 2118
    //   2114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2117: athrow
    //   2118: getstatic burp/Zepm.Zl : Ljava/lang/String;
    //   2121: getstatic burp/Ztv8.ZS : Ljava/lang/Object;
    //   2124: checkcast java/math/BigInteger
    //   2127: invokevirtual intValue : ()I
    //   2130: bipush #32
    //   2132: irem
    //   2133: invokestatic abs : (I)I
    //   2136: invokevirtual charAt : (I)C
    //   2139: getstatic burp/Zkw.ZU : Ljava/lang/String;
    //   2142: getstatic burp/Zg6f.Zl : Ljava/lang/Object;
    //   2145: checkcast java/math/BigInteger
    //   2148: invokevirtual intValue : ()I
    //   2151: bipush #32
    //   2153: irem
    //   2154: invokestatic abs : (I)I
    //   2157: invokevirtual charAt : (I)C
    //   2160: if_icmple -> 2178
    //   2163: goto -> 2170
    //   2166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2169: athrow
    //   2170: iconst_1
    //   2171: goto -> 2179
    //   2174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2177: athrow
    //   2178: iconst_0
    //   2179: ireturn
    //   2180: astore_3
    //   2181: new java/lang/Exception
    //   2184: dup
    //   2185: aload_3
    //   2186: invokevirtual getMessage : ()Ljava/lang/String;
    //   2189: invokespecial <init> : (Ljava/lang/String;)V
    //   2192: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2179	2180	java/lang/Throwable
    //   324	348	351	java/lang/Throwable
    //   422	459	459	java/lang/Throwable
    //   463	484	484	java/lang/Throwable
    //   488	518	518	java/lang/Throwable
    //   743	757	757	java/lang/Throwable
    //   768	781	784	java/lang/Throwable
    //   773	796	799	java/lang/Throwable
    //   788	814	817	java/lang/Throwable
    //   803	844	847	java/lang/Throwable
    //   907	934	937	java/lang/Throwable
    //   924	952	955	java/lang/Throwable
    //   941	988	991	java/lang/Throwable
    //   959	1002	1005	java/lang/Throwable
    //   1051	1065	1065	java/lang/Throwable
    //   1076	1089	1092	java/lang/Throwable
    //   1081	1104	1107	java/lang/Throwable
    //   1096	1122	1125	java/lang/Throwable
    //   1111	1152	1155	java/lang/Throwable
    //   1215	1242	1245	java/lang/Throwable
    //   1232	1260	1263	java/lang/Throwable
    //   1249	1290	1293	java/lang/Throwable
    //   1267	1301	1301	java/lang/Throwable
    //   1312	1328	1331	java/lang/Throwable
    //   1377	1391	1391	java/lang/Throwable
    //   1402	1415	1418	java/lang/Throwable
    //   1407	1430	1433	java/lang/Throwable
    //   1422	1448	1451	java/lang/Throwable
    //   1437	1478	1481	java/lang/Throwable
    //   1541	1568	1571	java/lang/Throwable
    //   1558	1589	1592	java/lang/Throwable
    //   1575	1619	1622	java/lang/Throwable
    //   1596	1630	1630	java/lang/Throwable
    //   1641	1657	1660	java/lang/Throwable
    //   1734	1748	1748	java/lang/Throwable
    //   1759	1772	1775	java/lang/Throwable
    //   1764	1787	1790	java/lang/Throwable
    //   1779	1805	1808	java/lang/Throwable
    //   1794	1835	1838	java/lang/Throwable
    //   1898	1925	1928	java/lang/Throwable
    //   1915	1946	1949	java/lang/Throwable
    //   1932	1976	1979	java/lang/Throwable
    //   1953	1987	1987	java/lang/Throwable
    //   1998	2014	2017	java/lang/Throwable
    //   2021	2111	2114	java/lang/Throwable
    //   2066	2163	2166	java/lang/Throwable
    //   2118	2174	2174	java/lang/Throwable
  }
  
  static void Zn(Object paramObject) {
    Zzpj.ZR = a(-23784, -21430);
    Zzpj.ZI = new BigInteger(a(-23786, -11927));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlvx.Zr.charAt(Math.abs(((BigInteger)Zmh0.Zt).intValue() % 32)) > Zro_.Zz.charAt(Math.abs(((BigInteger)Zrxf.ZS).intValue() % 32))) {
          try {
            Zmu6.Zh(Class.forName(a(-23794, -28466)));
            if (bool)
              Zza3.Zg(Class.forName(a(-23781, 18353))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zza3.Zg(Class.forName(a(-23781, 18353)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '@\\b'\\t(u^:×¤\\tÐÕ<ö¬Øgl köD¡ùðü¯òH£csñPÎQê4Íså­ØÌ2 ¿7Ûn _¯û wÛS»~Q¨ÒÖã«æFÆ?\\tÙ¹®\\t>Äß\\t'¨«Õ\\t CN|â¥FÕ&ß:/Xt@.M}»£è¬D¦JÏÙt0ä¥Ä¸0\\b¬\ôª<»'k D øw¤Aö(5tÄ<æÍ^dã?Ñ¤pzväº6eàsù`º¹\\tü§\\nÒ\\rq²\\tòªJ)\\t{§I¸¹M zjêïn;ÿÚ-e÷)pkÆÕ1ýêzþ¯¤ù\\tç±ia)&Ý.\\bÕuöÅJ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #114
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'içËï\\r¤\\f¼\\t4+ÿvÀ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_3
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
    //   127: putstatic burp/Zz0.a : [Ljava/lang/String;
    //   130: bipush #19
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zz0.b : [Ljava/lang/String;
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
    //   212: bipush #52
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #124
    //   239: goto -> 244
    //   242: bipush #40
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #55
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #73
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-56
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #81
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #122
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-81
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #28
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #13
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #90
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #107
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-126
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-3
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #17
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #109
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #16
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #12
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-13
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #62
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-84
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-21
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #8
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-59
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-4
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-57
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #11
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-80
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-37
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-14
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #66
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #106
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #65
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-82
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zz0.ZJ : Ljava/lang/Object;
    //   501: sipush #-23790
    //   504: sipush #-18023
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zz0.ZX : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA31C) & 0xFFFF;
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
      char c = 'ß';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */