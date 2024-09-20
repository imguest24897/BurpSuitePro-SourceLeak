package burp;

import java.math.BigInteger;

class Zt5a extends ClassLoader {
  static String Zl;
  
  static Object Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-19435
    //   7: sipush #19744
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZC : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zl6z.Zt : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: getstatic burp/Zb9d.Ze : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   34: putstatic burp/Zg_5.ZA : Ljava/lang/Object;
    //   37: getstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   40: checkcast java/math/BigInteger
    //   43: invokevirtual toByteArray : ()[B
    //   46: astore_3
    //   47: aload_3
    //   48: arraylength
    //   49: bipush #8
    //   51: iadd
    //   52: bipush #6
    //   54: ishr
    //   55: iconst_1
    //   56: iadd
    //   57: bipush #16
    //   59: imul
    //   60: newarray int
    //   62: astore #5
    //   64: iconst_0
    //   65: istore #6
    //   67: iload #6
    //   69: aload_3
    //   70: arraylength
    //   71: if_icmpge -> 114
    //   74: aload_3
    //   75: iload #6
    //   77: baload
    //   78: sipush #255
    //   81: iand
    //   82: istore #7
    //   84: aload #5
    //   86: iload #6
    //   88: iconst_2
    //   89: ishr
    //   90: dup2
    //   91: iaload
    //   92: iload #7
    //   94: bipush #24
    //   96: iload #6
    //   98: iconst_4
    //   99: irem
    //   100: bipush #8
    //   102: imul
    //   103: isub
    //   104: ishl
    //   105: ior
    //   106: iastore
    //   107: iinc #6, 1
    //   110: iload_2
    //   111: ifeq -> 67
    //   114: aload #5
    //   116: iload #6
    //   118: iconst_2
    //   119: ishr
    //   120: dup2
    //   121: iaload
    //   122: sipush #128
    //   125: bipush #24
    //   127: iload #6
    //   129: iconst_4
    //   130: irem
    //   131: bipush #8
    //   133: imul
    //   134: isub
    //   135: ishl
    //   136: ior
    //   137: iastore
    //   138: aload #5
    //   140: aload #5
    //   142: arraylength
    //   143: iconst_1
    //   144: isub
    //   145: aload_3
    //   146: arraylength
    //   147: bipush #8
    //   149: imul
    //   150: iastore
    //   151: bipush #80
    //   153: newarray int
    //   155: astore #7
    //   157: ldc 1732584193
    //   159: istore #8
    //   161: ldc -271733879
    //   163: istore #9
    //   165: ldc -1732584194
    //   167: istore #10
    //   169: ldc 271733878
    //   171: istore #11
    //   173: ldc -1009589776
    //   175: istore #12
    //   177: iconst_0
    //   178: istore #6
    //   180: iload #6
    //   182: aload #5
    //   184: arraylength
    //   185: if_icmpge -> 507
    //   188: iload #8
    //   190: istore #13
    //   192: iload #9
    //   194: istore #14
    //   196: iload #10
    //   198: istore #15
    //   200: iload #11
    //   202: istore #16
    //   204: iload #12
    //   206: istore #17
    //   208: iconst_0
    //   209: istore #18
    //   211: iload #18
    //   213: bipush #80
    //   215: if_icmpge -> 465
    //   218: iload #18
    //   220: bipush #16
    //   222: if_icmpge -> 249
    //   225: aload #7
    //   227: iload #18
    //   229: aload #5
    //   231: iload #6
    //   233: iload #18
    //   235: iadd
    //   236: iaload
    //   237: iastore
    //   238: iload_2
    //   239: ifeq -> 304
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   248: athrow
    //   249: aload #7
    //   251: iload #18
    //   253: iconst_3
    //   254: isub
    //   255: iaload
    //   256: aload #7
    //   258: iload #18
    //   260: bipush #8
    //   262: isub
    //   263: iaload
    //   264: ixor
    //   265: aload #7
    //   267: iload #18
    //   269: bipush #14
    //   271: isub
    //   272: iaload
    //   273: ixor
    //   274: aload #7
    //   276: iload #18
    //   278: bipush #16
    //   280: isub
    //   281: iaload
    //   282: ixor
    //   283: istore #19
    //   285: iload #19
    //   287: iconst_1
    //   288: ishl
    //   289: iload #19
    //   291: bipush #31
    //   293: iushr
    //   294: ior
    //   295: istore #20
    //   297: aload #7
    //   299: iload #18
    //   301: iload #20
    //   303: iastore
    //   304: iload #8
    //   306: iconst_5
    //   307: ishl
    //   308: iload #8
    //   310: bipush #27
    //   312: iushr
    //   313: ior
    //   314: istore #19
    //   316: iload #19
    //   318: iload #12
    //   320: iadd
    //   321: aload #7
    //   323: iload #18
    //   325: iaload
    //   326: iadd
    //   327: iload #18
    //   329: bipush #20
    //   331: if_icmpge -> 357
    //   334: ldc 1518500249
    //   336: iload #9
    //   338: iload #10
    //   340: iand
    //   341: iload #9
    //   343: iconst_m1
    //   344: ixor
    //   345: iload #11
    //   347: iand
    //   348: ior
    //   349: iadd
    //   350: goto -> 427
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: iload #18
    //   359: bipush #40
    //   361: if_icmpge -> 382
    //   364: ldc 1859775393
    //   366: iload #9
    //   368: iload #10
    //   370: ixor
    //   371: iload #11
    //   373: ixor
    //   374: iadd
    //   375: goto -> 427
    //   378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   381: athrow
    //   382: iload #18
    //   384: bipush #60
    //   386: if_icmpge -> 416
    //   389: ldc -1894007588
    //   391: iload #9
    //   393: iload #10
    //   395: iand
    //   396: iload #9
    //   398: iload #11
    //   400: iand
    //   401: ior
    //   402: iload #10
    //   404: iload #11
    //   406: iand
    //   407: ior
    //   408: iadd
    //   409: goto -> 427
    //   412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   415: athrow
    //   416: ldc -899497514
    //   418: iload #9
    //   420: iload #10
    //   422: ixor
    //   423: iload #11
    //   425: ixor
    //   426: iadd
    //   427: iadd
    //   428: istore #20
    //   430: iload #11
    //   432: istore #12
    //   434: iload #10
    //   436: istore #11
    //   438: iload #9
    //   440: bipush #30
    //   442: ishl
    //   443: iload #9
    //   445: iconst_2
    //   446: iushr
    //   447: ior
    //   448: istore #10
    //   450: iload #8
    //   452: istore #9
    //   454: iload #20
    //   456: istore #8
    //   458: iinc #18, 1
    //   461: iload_2
    //   462: ifeq -> 211
    //   465: iload #8
    //   467: iload #13
    //   469: iadd
    //   470: istore #8
    //   472: iload #9
    //   474: iload #14
    //   476: iadd
    //   477: istore #9
    //   479: iload #10
    //   481: iload #15
    //   483: iadd
    //   484: istore #10
    //   486: iload #11
    //   488: iload #16
    //   490: iadd
    //   491: istore #11
    //   493: iload #12
    //   495: iload #17
    //   497: iadd
    //   498: istore #12
    //   500: iinc #6, 16
    //   503: iload_2
    //   504: ifeq -> 180
    //   507: iconst_5
    //   508: newarray int
    //   510: dup
    //   511: iconst_0
    //   512: iload #8
    //   514: iastore
    //   515: dup
    //   516: iconst_1
    //   517: iload #9
    //   519: iastore
    //   520: dup
    //   521: iconst_2
    //   522: iload #10
    //   524: iastore
    //   525: dup
    //   526: iconst_3
    //   527: iload #11
    //   529: iastore
    //   530: dup
    //   531: iconst_4
    //   532: iload #12
    //   534: iastore
    //   535: astore #13
    //   537: bipush #20
    //   539: newarray byte
    //   541: astore #14
    //   543: iconst_0
    //   544: istore #15
    //   546: iload #15
    //   548: bipush #20
    //   550: if_icmpge -> 591
    //   553: aload #13
    //   555: iload #15
    //   557: iconst_4
    //   558: idiv
    //   559: iaload
    //   560: istore #16
    //   562: iconst_3
    //   563: iload #15
    //   565: iconst_4
    //   566: irem
    //   567: isub
    //   568: bipush #8
    //   570: imul
    //   571: istore #17
    //   573: aload #14
    //   575: iload #15
    //   577: iload #16
    //   579: iload #17
    //   581: iushr
    //   582: i2b
    //   583: bastore
    //   584: iinc #15, 1
    //   587: iload_2
    //   588: ifeq -> 546
    //   591: aload #14
    //   593: astore #4
    //   595: sipush #-19428
    //   598: new java/math/BigInteger
    //   601: dup
    //   602: aload #4
    //   604: invokespecial <init> : ([B)V
    //   607: invokevirtual abs : ()Ljava/math/BigInteger;
    //   610: putstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   613: sipush #-13776
    //   616: invokestatic a : (II)Ljava/lang/String;
    //   619: iconst_1
    //   620: ldc burp/Zb8v
    //   622: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   625: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   628: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   631: astore_3
    //   632: aload_3
    //   633: arraylength
    //   634: istore #4
    //   636: iconst_0
    //   637: istore #5
    //   639: iload #5
    //   641: iload #4
    //   643: if_icmpge -> 780
    //   646: aload_3
    //   647: iload #5
    //   649: aaload
    //   650: astore #6
    //   652: aload #6
    //   654: invokevirtual getModifiers : ()I
    //   657: invokestatic isStatic : (I)Z
    //   660: ifne -> 670
    //   663: goto -> 773
    //   666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   669: athrow
    //   670: aload #6
    //   672: invokevirtual getType : ()Ljava/lang/Class;
    //   675: astore #7
    //   677: aload #7
    //   679: ifnull -> 760
    //   682: aload #7
    //   684: invokevirtual isPrimitive : ()Z
    //   687: ifne -> 760
    //   690: goto -> 697
    //   693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   696: athrow
    //   697: aload #7
    //   699: invokevirtual getPackage : ()Ljava/lang/Package;
    //   702: ifnull -> 760
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: aload #7
    //   714: invokevirtual getPackage : ()Ljava/lang/Package;
    //   717: invokevirtual getName : ()Ljava/lang/String;
    //   720: ifnull -> 760
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   729: athrow
    //   730: aload #7
    //   732: invokevirtual getPackage : ()Ljava/lang/Package;
    //   735: invokevirtual getName : ()Ljava/lang/String;
    //   738: sipush #-19434
    //   741: sipush #-18904
    //   744: invokestatic a : (II)Ljava/lang/String;
    //   747: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   750: ifne -> 760
    //   753: goto -> 760
    //   756: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   759: athrow
    //   760: aload #6
    //   762: iconst_1
    //   763: invokevirtual setAccessible : (Z)V
    //   766: aload #6
    //   768: aconst_null
    //   769: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   772: pop
    //   773: iinc #5, 1
    //   776: iload_2
    //   777: ifeq -> 639
    //   780: sipush #-19426
    //   783: sipush #-23272
    //   786: invokestatic a : (II)Ljava/lang/String;
    //   789: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   792: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   795: astore_3
    //   796: aload_3
    //   797: arraylength
    //   798: istore #4
    //   800: iconst_0
    //   801: istore #5
    //   803: iload #5
    //   805: iload #4
    //   807: if_icmpge -> 939
    //   810: aload_3
    //   811: iload #5
    //   813: aaload
    //   814: astore #6
    //   816: aload #6
    //   818: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   821: pop
    //   822: aload #6
    //   824: invokevirtual getModifiers : ()I
    //   827: invokestatic isStatic : (I)Z
    //   830: ifeq -> 925
    //   833: aload #6
    //   835: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   838: arraylength
    //   839: iconst_2
    //   840: if_icmpne -> 925
    //   843: goto -> 850
    //   846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   849: athrow
    //   850: aload #6
    //   852: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   855: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   858: invokevirtual equals : (Ljava/lang/Object;)Z
    //   861: ifeq -> 925
    //   864: goto -> 871
    //   867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   870: athrow
    //   871: aload #6
    //   873: iconst_1
    //   874: invokevirtual setAccessible : (Z)V
    //   877: aload #6
    //   879: aconst_null
    //   880: iconst_2
    //   881: anewarray java/lang/Object
    //   884: dup
    //   885: iconst_0
    //   886: aload_0
    //   887: aastore
    //   888: dup
    //   889: iconst_1
    //   890: aload_1
    //   891: ifnonnull -> 909
    //   894: goto -> 901
    //   897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   900: athrow
    //   901: aload_1
    //   902: goto -> 916
    //   905: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   908: athrow
    //   909: aload_1
    //   910: checkcast [B
    //   913: invokevirtual clone : ()Ljava/lang/Object;
    //   916: aastore
    //   917: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   920: pop
    //   921: iload_2
    //   922: ifeq -> 939
    //   925: iinc #5, 1
    //   928: iload_2
    //   929: ifeq -> 803
    //   932: goto -> 939
    //   935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   938: athrow
    //   939: iconst_0
    //   940: istore_3
    //   941: getstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   944: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   947: checkcast java/math/BigInteger
    //   950: invokevirtual intValue : ()I
    //   953: bipush #32
    //   955: irem
    //   956: invokestatic abs : (I)I
    //   959: invokevirtual charAt : (I)C
    //   962: getstatic burp/Zkc5.ZH : Ljava/lang/String;
    //   965: getstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   968: checkcast java/math/BigInteger
    //   971: invokevirtual intValue : ()I
    //   974: bipush #32
    //   976: irem
    //   977: invokestatic abs : (I)I
    //   980: invokevirtual charAt : (I)C
    //   983: if_icmple -> 1327
    //   986: sipush #-19427
    //   989: sipush #1777
    //   992: invokestatic a : (II)Ljava/lang/String;
    //   995: iconst_1
    //   996: ldc burp/Zxe
    //   998: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1001: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1004: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1007: astore #4
    //   1009: aload #4
    //   1011: arraylength
    //   1012: istore #5
    //   1014: iconst_0
    //   1015: istore #6
    //   1017: iload #6
    //   1019: iload #5
    //   1021: if_icmpge -> 1159
    //   1024: aload #4
    //   1026: iload #6
    //   1028: aaload
    //   1029: astore #7
    //   1031: aload #7
    //   1033: invokevirtual getModifiers : ()I
    //   1036: invokestatic isStatic : (I)Z
    //   1039: ifne -> 1049
    //   1042: goto -> 1152
    //   1045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1048: athrow
    //   1049: aload #7
    //   1051: invokevirtual getType : ()Ljava/lang/Class;
    //   1054: astore #8
    //   1056: aload #8
    //   1058: ifnull -> 1139
    //   1061: aload #8
    //   1063: invokevirtual isPrimitive : ()Z
    //   1066: ifne -> 1139
    //   1069: goto -> 1076
    //   1072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1075: athrow
    //   1076: aload #8
    //   1078: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1081: ifnull -> 1139
    //   1084: goto -> 1091
    //   1087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1090: athrow
    //   1091: aload #8
    //   1093: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1096: invokevirtual getName : ()Ljava/lang/String;
    //   1099: ifnull -> 1139
    //   1102: goto -> 1109
    //   1105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1108: athrow
    //   1109: aload #8
    //   1111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1114: invokevirtual getName : ()Ljava/lang/String;
    //   1117: sipush #-19444
    //   1120: sipush #1744
    //   1123: invokestatic a : (II)Ljava/lang/String;
    //   1126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1129: ifne -> 1139
    //   1132: goto -> 1139
    //   1135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1138: athrow
    //   1139: aload #7
    //   1141: iconst_1
    //   1142: invokevirtual setAccessible : (Z)V
    //   1145: aload #7
    //   1147: aconst_null
    //   1148: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1151: pop
    //   1152: iinc #6, 1
    //   1155: iload_2
    //   1156: ifeq -> 1017
    //   1159: sipush #-19425
    //   1162: sipush #-17354
    //   1165: invokestatic a : (II)Ljava/lang/String;
    //   1168: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1171: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1174: astore #4
    //   1176: aload #4
    //   1178: arraylength
    //   1179: istore #5
    //   1181: iconst_0
    //   1182: istore #6
    //   1184: iload #6
    //   1186: iload #5
    //   1188: if_icmpge -> 1324
    //   1191: aload #4
    //   1193: iload #6
    //   1195: aaload
    //   1196: astore #7
    //   1198: aload #7
    //   1200: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1203: pop
    //   1204: aload #7
    //   1206: invokevirtual getModifiers : ()I
    //   1209: invokestatic isStatic : (I)Z
    //   1212: ifeq -> 1310
    //   1215: aload #7
    //   1217: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1220: arraylength
    //   1221: iconst_2
    //   1222: if_icmpne -> 1310
    //   1225: goto -> 1232
    //   1228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1231: athrow
    //   1232: aload #7
    //   1234: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1237: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1240: if_acmpne -> 1310
    //   1243: goto -> 1250
    //   1246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1249: athrow
    //   1250: aload #7
    //   1252: iconst_1
    //   1253: invokevirtual setAccessible : (Z)V
    //   1256: aload #7
    //   1258: aconst_null
    //   1259: iconst_2
    //   1260: anewarray java/lang/Object
    //   1263: dup
    //   1264: iconst_0
    //   1265: aload_0
    //   1266: aastore
    //   1267: dup
    //   1268: iconst_1
    //   1269: aload_1
    //   1270: ifnonnull -> 1288
    //   1273: goto -> 1280
    //   1276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1279: athrow
    //   1280: aload_1
    //   1281: goto -> 1295
    //   1284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1287: athrow
    //   1288: aload_1
    //   1289: checkcast [B
    //   1292: invokevirtual clone : ()Ljava/lang/Object;
    //   1295: aastore
    //   1296: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1299: checkcast java/lang/Boolean
    //   1302: invokevirtual booleanValue : ()Z
    //   1305: istore_3
    //   1306: iload_2
    //   1307: ifeq -> 1324
    //   1310: iinc #6, 1
    //   1313: iload_2
    //   1314: ifeq -> 1184
    //   1317: goto -> 1324
    //   1320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1323: athrow
    //   1324: goto -> 1665
    //   1327: sipush #-19440
    //   1330: sipush #-19854
    //   1333: invokestatic a : (II)Ljava/lang/String;
    //   1336: iconst_1
    //   1337: ldc burp/Zls_
    //   1339: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1342: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1345: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1348: astore #4
    //   1350: aload #4
    //   1352: arraylength
    //   1353: istore #5
    //   1355: iconst_0
    //   1356: istore #6
    //   1358: iload #6
    //   1360: iload #5
    //   1362: if_icmpge -> 1500
    //   1365: aload #4
    //   1367: iload #6
    //   1369: aaload
    //   1370: astore #7
    //   1372: aload #7
    //   1374: invokevirtual getModifiers : ()I
    //   1377: invokestatic isStatic : (I)Z
    //   1380: ifne -> 1390
    //   1383: goto -> 1493
    //   1386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1389: athrow
    //   1390: aload #7
    //   1392: invokevirtual getType : ()Ljava/lang/Class;
    //   1395: astore #8
    //   1397: aload #8
    //   1399: ifnull -> 1480
    //   1402: aload #8
    //   1404: invokevirtual isPrimitive : ()Z
    //   1407: ifne -> 1480
    //   1410: goto -> 1417
    //   1413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1416: athrow
    //   1417: aload #8
    //   1419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1422: ifnull -> 1480
    //   1425: goto -> 1432
    //   1428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1431: athrow
    //   1432: aload #8
    //   1434: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1437: invokevirtual getName : ()Ljava/lang/String;
    //   1440: ifnull -> 1480
    //   1443: goto -> 1450
    //   1446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1449: athrow
    //   1450: aload #8
    //   1452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1455: invokevirtual getName : ()Ljava/lang/String;
    //   1458: sipush #-19444
    //   1461: sipush #1744
    //   1464: invokestatic a : (II)Ljava/lang/String;
    //   1467: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1470: ifne -> 1480
    //   1473: goto -> 1480
    //   1476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1479: athrow
    //   1480: aload #7
    //   1482: iconst_1
    //   1483: invokevirtual setAccessible : (Z)V
    //   1486: aload #7
    //   1488: aconst_null
    //   1489: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1492: pop
    //   1493: iinc #6, 1
    //   1496: iload_2
    //   1497: ifeq -> 1358
    //   1500: sipush #-19440
    //   1503: sipush #-19854
    //   1506: invokestatic a : (II)Ljava/lang/String;
    //   1509: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1512: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1515: astore #4
    //   1517: aload #4
    //   1519: arraylength
    //   1520: istore #5
    //   1522: iconst_0
    //   1523: istore #6
    //   1525: iload #6
    //   1527: iload #5
    //   1529: if_icmpge -> 1665
    //   1532: aload #4
    //   1534: iload #6
    //   1536: aaload
    //   1537: astore #7
    //   1539: aload #7
    //   1541: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1544: pop
    //   1545: aload #7
    //   1547: invokevirtual getModifiers : ()I
    //   1550: invokestatic isStatic : (I)Z
    //   1553: ifeq -> 1651
    //   1556: aload #7
    //   1558: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1561: arraylength
    //   1562: iconst_2
    //   1563: if_icmpne -> 1651
    //   1566: goto -> 1573
    //   1569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1572: athrow
    //   1573: aload #7
    //   1575: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1578: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1581: if_acmpne -> 1651
    //   1584: goto -> 1591
    //   1587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1590: athrow
    //   1591: aload #7
    //   1593: iconst_1
    //   1594: invokevirtual setAccessible : (Z)V
    //   1597: aload #7
    //   1599: aconst_null
    //   1600: iconst_2
    //   1601: anewarray java/lang/Object
    //   1604: dup
    //   1605: iconst_0
    //   1606: aload_0
    //   1607: aastore
    //   1608: dup
    //   1609: iconst_1
    //   1610: aload_1
    //   1611: ifnonnull -> 1629
    //   1614: goto -> 1621
    //   1617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1620: athrow
    //   1621: aload_1
    //   1622: goto -> 1636
    //   1625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1628: athrow
    //   1629: aload_1
    //   1630: checkcast [B
    //   1633: invokevirtual clone : ()Ljava/lang/Object;
    //   1636: aastore
    //   1637: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1640: checkcast java/lang/Boolean
    //   1643: invokevirtual booleanValue : ()Z
    //   1646: istore_3
    //   1647: iload_2
    //   1648: ifeq -> 1665
    //   1651: iinc #6, 1
    //   1654: iload_2
    //   1655: ifeq -> 1525
    //   1658: goto -> 1665
    //   1661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1664: athrow
    //   1665: iload_3
    //   1666: ifeq -> 1671
    //   1669: iload_3
    //   1670: ireturn
    //   1671: getstatic burp/Zmvk.Z_ : Ljava/lang/String;
    //   1674: getstatic burp/Ze_e.Za : Ljava/lang/Object;
    //   1677: checkcast java/math/BigInteger
    //   1680: invokevirtual intValue : ()I
    //   1683: bipush #32
    //   1685: irem
    //   1686: invokestatic abs : (I)I
    //   1689: invokevirtual charAt : (I)C
    //   1692: getstatic burp/Zt5a.Zl : Ljava/lang/String;
    //   1695: getstatic burp/Zzh9.Zv : Ljava/lang/Object;
    //   1698: checkcast java/math/BigInteger
    //   1701: invokevirtual intValue : ()I
    //   1704: bipush #32
    //   1706: irem
    //   1707: invokestatic abs : (I)I
    //   1710: invokevirtual charAt : (I)C
    //   1713: if_icmpgt -> 2058
    //   1716: sipush #-19437
    //   1719: sipush #8779
    //   1722: invokestatic a : (II)Ljava/lang/String;
    //   1725: iconst_1
    //   1726: ldc burp/Zb1
    //   1728: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1731: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1734: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1737: astore #4
    //   1739: aload #4
    //   1741: arraylength
    //   1742: istore #5
    //   1744: iconst_0
    //   1745: istore #6
    //   1747: iload #6
    //   1749: iload #5
    //   1751: if_icmpge -> 1889
    //   1754: aload #4
    //   1756: iload #6
    //   1758: aaload
    //   1759: astore #7
    //   1761: aload #7
    //   1763: invokevirtual getModifiers : ()I
    //   1766: invokestatic isStatic : (I)Z
    //   1769: ifne -> 1779
    //   1772: goto -> 1882
    //   1775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1778: athrow
    //   1779: aload #7
    //   1781: invokevirtual getType : ()Ljava/lang/Class;
    //   1784: astore #8
    //   1786: aload #8
    //   1788: ifnull -> 1869
    //   1791: aload #8
    //   1793: invokevirtual isPrimitive : ()Z
    //   1796: ifne -> 1869
    //   1799: goto -> 1806
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: aload #8
    //   1808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1811: ifnull -> 1869
    //   1814: goto -> 1821
    //   1817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1820: athrow
    //   1821: aload #8
    //   1823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1826: invokevirtual getName : ()Ljava/lang/String;
    //   1829: ifnull -> 1869
    //   1832: goto -> 1839
    //   1835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1838: athrow
    //   1839: aload #8
    //   1841: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1844: invokevirtual getName : ()Ljava/lang/String;
    //   1847: sipush #-19444
    //   1850: sipush #1744
    //   1853: invokestatic a : (II)Ljava/lang/String;
    //   1856: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1859: ifne -> 1869
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: aload #7
    //   1871: iconst_1
    //   1872: invokevirtual setAccessible : (Z)V
    //   1875: aload #7
    //   1877: aconst_null
    //   1878: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1881: pop
    //   1882: iinc #6, 1
    //   1885: iload_2
    //   1886: ifeq -> 1747
    //   1889: sipush #-19438
    //   1892: sipush #13729
    //   1895: invokestatic a : (II)Ljava/lang/String;
    //   1898: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1901: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1904: astore #4
    //   1906: aload #4
    //   1908: arraylength
    //   1909: istore #5
    //   1911: iconst_0
    //   1912: istore #6
    //   1914: iload #6
    //   1916: iload #5
    //   1918: if_icmpge -> 2054
    //   1921: aload #4
    //   1923: iload #6
    //   1925: aaload
    //   1926: astore #7
    //   1928: aload #7
    //   1930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1933: pop
    //   1934: aload #7
    //   1936: invokevirtual getModifiers : ()I
    //   1939: invokestatic isStatic : (I)Z
    //   1942: ifeq -> 2040
    //   1945: aload #7
    //   1947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1950: arraylength
    //   1951: iconst_2
    //   1952: if_icmpne -> 2040
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1961: athrow
    //   1962: aload #7
    //   1964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1967: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1970: if_acmpne -> 2040
    //   1973: goto -> 1980
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #7
    //   1982: iconst_1
    //   1983: invokevirtual setAccessible : (Z)V
    //   1986: aload #7
    //   1988: aconst_null
    //   1989: iconst_2
    //   1990: anewarray java/lang/Object
    //   1993: dup
    //   1994: iconst_0
    //   1995: aload_0
    //   1996: aastore
    //   1997: dup
    //   1998: iconst_1
    //   1999: aload_1
    //   2000: ifnonnull -> 2018
    //   2003: goto -> 2010
    //   2006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2009: athrow
    //   2010: aload_1
    //   2011: goto -> 2025
    //   2014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2017: athrow
    //   2018: aload_1
    //   2019: checkcast [B
    //   2022: invokevirtual clone : ()Ljava/lang/Object;
    //   2025: aastore
    //   2026: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2029: checkcast java/lang/Boolean
    //   2032: invokevirtual booleanValue : ()Z
    //   2035: istore_3
    //   2036: iload_2
    //   2037: ifeq -> 2054
    //   2040: iinc #6, 1
    //   2043: iload_2
    //   2044: ifeq -> 1914
    //   2047: goto -> 2054
    //   2050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2053: athrow
    //   2054: iload_2
    //   2055: ifeq -> 2396
    //   2058: sipush #-19447
    //   2061: sipush #13919
    //   2064: invokestatic a : (II)Ljava/lang/String;
    //   2067: iconst_1
    //   2068: ldc burp/Zzpj
    //   2070: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2073: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2076: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2079: astore #4
    //   2081: aload #4
    //   2083: arraylength
    //   2084: istore #5
    //   2086: iconst_0
    //   2087: istore #6
    //   2089: iload #6
    //   2091: iload #5
    //   2093: if_icmpge -> 2231
    //   2096: aload #4
    //   2098: iload #6
    //   2100: aaload
    //   2101: astore #7
    //   2103: aload #7
    //   2105: invokevirtual getModifiers : ()I
    //   2108: invokestatic isStatic : (I)Z
    //   2111: ifne -> 2121
    //   2114: goto -> 2224
    //   2117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2120: athrow
    //   2121: aload #7
    //   2123: invokevirtual getType : ()Ljava/lang/Class;
    //   2126: astore #8
    //   2128: aload #8
    //   2130: ifnull -> 2211
    //   2133: aload #8
    //   2135: invokevirtual isPrimitive : ()Z
    //   2138: ifne -> 2211
    //   2141: goto -> 2148
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: aload #8
    //   2150: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2153: ifnull -> 2211
    //   2156: goto -> 2163
    //   2159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2162: athrow
    //   2163: aload #8
    //   2165: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2168: invokevirtual getName : ()Ljava/lang/String;
    //   2171: ifnull -> 2211
    //   2174: goto -> 2181
    //   2177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2180: athrow
    //   2181: aload #8
    //   2183: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2186: invokevirtual getName : ()Ljava/lang/String;
    //   2189: sipush #-19444
    //   2192: sipush #1744
    //   2195: invokestatic a : (II)Ljava/lang/String;
    //   2198: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2201: ifne -> 2211
    //   2204: goto -> 2211
    //   2207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2210: athrow
    //   2211: aload #7
    //   2213: iconst_1
    //   2214: invokevirtual setAccessible : (Z)V
    //   2217: aload #7
    //   2219: aconst_null
    //   2220: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2223: pop
    //   2224: iinc #6, 1
    //   2227: iload_2
    //   2228: ifeq -> 2089
    //   2231: sipush #-19433
    //   2234: sipush #-32553
    //   2237: invokestatic a : (II)Ljava/lang/String;
    //   2240: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2243: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2246: astore #4
    //   2248: aload #4
    //   2250: arraylength
    //   2251: istore #5
    //   2253: iconst_0
    //   2254: istore #6
    //   2256: iload #6
    //   2258: iload #5
    //   2260: if_icmpge -> 2396
    //   2263: aload #4
    //   2265: iload #6
    //   2267: aaload
    //   2268: astore #7
    //   2270: aload #7
    //   2272: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2275: pop
    //   2276: aload #7
    //   2278: invokevirtual getModifiers : ()I
    //   2281: invokestatic isStatic : (I)Z
    //   2284: ifeq -> 2382
    //   2287: aload #7
    //   2289: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2292: arraylength
    //   2293: iconst_2
    //   2294: if_icmpne -> 2382
    //   2297: goto -> 2304
    //   2300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2303: athrow
    //   2304: aload #7
    //   2306: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2309: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2312: if_acmpne -> 2382
    //   2315: goto -> 2322
    //   2318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2321: athrow
    //   2322: aload #7
    //   2324: iconst_1
    //   2325: invokevirtual setAccessible : (Z)V
    //   2328: aload #7
    //   2330: aconst_null
    //   2331: iconst_2
    //   2332: anewarray java/lang/Object
    //   2335: dup
    //   2336: iconst_0
    //   2337: aload_0
    //   2338: aastore
    //   2339: dup
    //   2340: iconst_1
    //   2341: aload_1
    //   2342: ifnonnull -> 2360
    //   2345: goto -> 2352
    //   2348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2351: athrow
    //   2352: aload_1
    //   2353: goto -> 2367
    //   2356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2359: athrow
    //   2360: aload_1
    //   2361: checkcast [B
    //   2364: invokevirtual clone : ()Ljava/lang/Object;
    //   2367: aastore
    //   2368: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2371: checkcast java/lang/Boolean
    //   2374: invokevirtual booleanValue : ()Z
    //   2377: istore_3
    //   2378: iload_2
    //   2379: ifeq -> 2396
    //   2382: iinc #6, 1
    //   2385: iload_2
    //   2386: ifeq -> 2256
    //   2389: goto -> 2396
    //   2392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2395: athrow
    //   2396: iload_3
    //   2397: ifeq -> 2402
    //   2400: iload_3
    //   2401: ireturn
    //   2402: getstatic burp/Zrfh.ZH : Ljava/lang/String;
    //   2405: getstatic burp/Zkc5.ZZ : Ljava/lang/Object;
    //   2408: checkcast java/math/BigInteger
    //   2411: invokevirtual intValue : ()I
    //   2414: bipush #32
    //   2416: irem
    //   2417: invokestatic abs : (I)I
    //   2420: invokevirtual charAt : (I)C
    //   2423: getstatic burp/Zecm.Zv : Ljava/lang/String;
    //   2426: getstatic burp/Zbzj.Zz : Ljava/lang/Object;
    //   2429: checkcast java/math/BigInteger
    //   2432: invokevirtual intValue : ()I
    //   2435: bipush #32
    //   2437: irem
    //   2438: invokestatic abs : (I)I
    //   2441: invokevirtual charAt : (I)C
    //   2444: if_icmple -> 2789
    //   2447: sipush #-19448
    //   2450: sipush #31029
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: iconst_1
    //   2457: ldc burp/Zkaw
    //   2459: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2462: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2465: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2468: astore #4
    //   2470: aload #4
    //   2472: arraylength
    //   2473: istore #5
    //   2475: iconst_0
    //   2476: istore #6
    //   2478: iload #6
    //   2480: iload #5
    //   2482: if_icmpge -> 2620
    //   2485: aload #4
    //   2487: iload #6
    //   2489: aaload
    //   2490: astore #7
    //   2492: aload #7
    //   2494: invokevirtual getModifiers : ()I
    //   2497: invokestatic isStatic : (I)Z
    //   2500: ifne -> 2510
    //   2503: goto -> 2613
    //   2506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2509: athrow
    //   2510: aload #7
    //   2512: invokevirtual getType : ()Ljava/lang/Class;
    //   2515: astore #8
    //   2517: aload #8
    //   2519: ifnull -> 2600
    //   2522: aload #8
    //   2524: invokevirtual isPrimitive : ()Z
    //   2527: ifne -> 2600
    //   2530: goto -> 2537
    //   2533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2536: athrow
    //   2537: aload #8
    //   2539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2542: ifnull -> 2600
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2551: athrow
    //   2552: aload #8
    //   2554: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2557: invokevirtual getName : ()Ljava/lang/String;
    //   2560: ifnull -> 2600
    //   2563: goto -> 2570
    //   2566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2569: athrow
    //   2570: aload #8
    //   2572: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2575: invokevirtual getName : ()Ljava/lang/String;
    //   2578: sipush #-19444
    //   2581: sipush #1744
    //   2584: invokestatic a : (II)Ljava/lang/String;
    //   2587: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2590: ifne -> 2600
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #7
    //   2602: iconst_1
    //   2603: invokevirtual setAccessible : (Z)V
    //   2606: aload #7
    //   2608: aconst_null
    //   2609: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2612: pop
    //   2613: iinc #6, 1
    //   2616: iload_2
    //   2617: ifeq -> 2478
    //   2620: sipush #-19429
    //   2623: sipush #-11591
    //   2626: invokestatic a : (II)Ljava/lang/String;
    //   2629: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2632: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2635: astore #4
    //   2637: aload #4
    //   2639: arraylength
    //   2640: istore #5
    //   2642: iconst_0
    //   2643: istore #6
    //   2645: iload #6
    //   2647: iload #5
    //   2649: if_icmpge -> 2785
    //   2652: aload #4
    //   2654: iload #6
    //   2656: aaload
    //   2657: astore #7
    //   2659: aload #7
    //   2661: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2664: pop
    //   2665: aload #7
    //   2667: invokevirtual getModifiers : ()I
    //   2670: invokestatic isStatic : (I)Z
    //   2673: ifeq -> 2771
    //   2676: aload #7
    //   2678: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2681: arraylength
    //   2682: iconst_2
    //   2683: if_icmpne -> 2771
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2692: athrow
    //   2693: aload #7
    //   2695: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2698: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2701: if_acmpne -> 2771
    //   2704: goto -> 2711
    //   2707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2710: athrow
    //   2711: aload #7
    //   2713: iconst_1
    //   2714: invokevirtual setAccessible : (Z)V
    //   2717: aload #7
    //   2719: aconst_null
    //   2720: iconst_2
    //   2721: anewarray java/lang/Object
    //   2724: dup
    //   2725: iconst_0
    //   2726: aload_0
    //   2727: aastore
    //   2728: dup
    //   2729: iconst_1
    //   2730: aload_1
    //   2731: ifnonnull -> 2749
    //   2734: goto -> 2741
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload_1
    //   2742: goto -> 2756
    //   2745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2748: athrow
    //   2749: aload_1
    //   2750: checkcast [B
    //   2753: invokevirtual clone : ()Ljava/lang/Object;
    //   2756: aastore
    //   2757: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2760: checkcast java/lang/Boolean
    //   2763: invokevirtual booleanValue : ()Z
    //   2766: istore_3
    //   2767: iload_2
    //   2768: ifeq -> 2785
    //   2771: iinc #6, 1
    //   2774: iload_2
    //   2775: ifeq -> 2645
    //   2778: goto -> 2785
    //   2781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2784: athrow
    //   2785: iload_2
    //   2786: ifeq -> 3127
    //   2789: sipush #-19436
    //   2792: sipush #10067
    //   2795: invokestatic a : (II)Ljava/lang/String;
    //   2798: iconst_1
    //   2799: ldc burp/Zxzj
    //   2801: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2804: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2807: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2810: astore #4
    //   2812: aload #4
    //   2814: arraylength
    //   2815: istore #5
    //   2817: iconst_0
    //   2818: istore #6
    //   2820: iload #6
    //   2822: iload #5
    //   2824: if_icmpge -> 2962
    //   2827: aload #4
    //   2829: iload #6
    //   2831: aaload
    //   2832: astore #7
    //   2834: aload #7
    //   2836: invokevirtual getModifiers : ()I
    //   2839: invokestatic isStatic : (I)Z
    //   2842: ifne -> 2852
    //   2845: goto -> 2955
    //   2848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2851: athrow
    //   2852: aload #7
    //   2854: invokevirtual getType : ()Ljava/lang/Class;
    //   2857: astore #8
    //   2859: aload #8
    //   2861: ifnull -> 2942
    //   2864: aload #8
    //   2866: invokevirtual isPrimitive : ()Z
    //   2869: ifne -> 2942
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: aload #8
    //   2881: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2884: ifnull -> 2942
    //   2887: goto -> 2894
    //   2890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2893: athrow
    //   2894: aload #8
    //   2896: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2899: invokevirtual getName : ()Ljava/lang/String;
    //   2902: ifnull -> 2942
    //   2905: goto -> 2912
    //   2908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2911: athrow
    //   2912: aload #8
    //   2914: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2917: invokevirtual getName : ()Ljava/lang/String;
    //   2920: sipush #-19444
    //   2923: sipush #1744
    //   2926: invokestatic a : (II)Ljava/lang/String;
    //   2929: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2932: ifne -> 2942
    //   2935: goto -> 2942
    //   2938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2941: athrow
    //   2942: aload #7
    //   2944: iconst_1
    //   2945: invokevirtual setAccessible : (Z)V
    //   2948: aload #7
    //   2950: aconst_null
    //   2951: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2954: pop
    //   2955: iinc #6, 1
    //   2958: iload_2
    //   2959: ifeq -> 2820
    //   2962: sipush #-19445
    //   2965: sipush #-8972
    //   2968: invokestatic a : (II)Ljava/lang/String;
    //   2971: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2974: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2977: astore #4
    //   2979: aload #4
    //   2981: arraylength
    //   2982: istore #5
    //   2984: iconst_0
    //   2985: istore #6
    //   2987: iload #6
    //   2989: iload #5
    //   2991: if_icmpge -> 3127
    //   2994: aload #4
    //   2996: iload #6
    //   2998: aaload
    //   2999: astore #7
    //   3001: aload #7
    //   3003: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3006: pop
    //   3007: aload #7
    //   3009: invokevirtual getModifiers : ()I
    //   3012: invokestatic isStatic : (I)Z
    //   3015: ifeq -> 3113
    //   3018: aload #7
    //   3020: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3023: arraylength
    //   3024: iconst_2
    //   3025: if_icmpne -> 3113
    //   3028: goto -> 3035
    //   3031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3034: athrow
    //   3035: aload #7
    //   3037: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3040: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3043: if_acmpne -> 3113
    //   3046: goto -> 3053
    //   3049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3052: athrow
    //   3053: aload #7
    //   3055: iconst_1
    //   3056: invokevirtual setAccessible : (Z)V
    //   3059: aload #7
    //   3061: aconst_null
    //   3062: iconst_2
    //   3063: anewarray java/lang/Object
    //   3066: dup
    //   3067: iconst_0
    //   3068: aload_0
    //   3069: aastore
    //   3070: dup
    //   3071: iconst_1
    //   3072: aload_1
    //   3073: ifnonnull -> 3091
    //   3076: goto -> 3083
    //   3079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3082: athrow
    //   3083: aload_1
    //   3084: goto -> 3098
    //   3087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3090: athrow
    //   3091: aload_1
    //   3092: checkcast [B
    //   3095: invokevirtual clone : ()Ljava/lang/Object;
    //   3098: aastore
    //   3099: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3102: checkcast java/lang/Boolean
    //   3105: invokevirtual booleanValue : ()Z
    //   3108: istore_3
    //   3109: iload_2
    //   3110: ifeq -> 3127
    //   3113: iinc #6, 1
    //   3116: iload_2
    //   3117: ifeq -> 2987
    //   3120: goto -> 3127
    //   3123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3126: athrow
    //   3127: iload_3
    //   3128: ifeq -> 3133
    //   3131: iload_3
    //   3132: ireturn
    //   3133: getstatic burp/Zrp3.Zf : Ljava/lang/String;
    //   3136: getstatic burp/Zg1k.ZG : Ljava/lang/Object;
    //   3139: checkcast java/math/BigInteger
    //   3142: invokevirtual intValue : ()I
    //   3145: bipush #32
    //   3147: irem
    //   3148: invokestatic abs : (I)I
    //   3151: invokevirtual charAt : (I)C
    //   3154: getstatic burp/Zms1.ZZ : Ljava/lang/String;
    //   3157: getstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   3160: checkcast java/math/BigInteger
    //   3163: invokevirtual intValue : ()I
    //   3166: bipush #32
    //   3168: irem
    //   3169: invokestatic abs : (I)I
    //   3172: invokevirtual charAt : (I)C
    //   3175: if_icmple -> 3520
    //   3178: sipush #-19441
    //   3181: sipush #-28655
    //   3184: invokestatic a : (II)Ljava/lang/String;
    //   3187: iconst_1
    //   3188: ldc burp/Ztex
    //   3190: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3193: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3196: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3199: astore #4
    //   3201: aload #4
    //   3203: arraylength
    //   3204: istore #5
    //   3206: iconst_0
    //   3207: istore #6
    //   3209: iload #6
    //   3211: iload #5
    //   3213: if_icmpge -> 3351
    //   3216: aload #4
    //   3218: iload #6
    //   3220: aaload
    //   3221: astore #7
    //   3223: aload #7
    //   3225: invokevirtual getModifiers : ()I
    //   3228: invokestatic isStatic : (I)Z
    //   3231: ifne -> 3241
    //   3234: goto -> 3344
    //   3237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3240: athrow
    //   3241: aload #7
    //   3243: invokevirtual getType : ()Ljava/lang/Class;
    //   3246: astore #8
    //   3248: aload #8
    //   3250: ifnull -> 3331
    //   3253: aload #8
    //   3255: invokevirtual isPrimitive : ()Z
    //   3258: ifne -> 3331
    //   3261: goto -> 3268
    //   3264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3267: athrow
    //   3268: aload #8
    //   3270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3273: ifnull -> 3331
    //   3276: goto -> 3283
    //   3279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3282: athrow
    //   3283: aload #8
    //   3285: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3288: invokevirtual getName : ()Ljava/lang/String;
    //   3291: ifnull -> 3331
    //   3294: goto -> 3301
    //   3297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3300: athrow
    //   3301: aload #8
    //   3303: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3306: invokevirtual getName : ()Ljava/lang/String;
    //   3309: sipush #-19444
    //   3312: sipush #1744
    //   3315: invokestatic a : (II)Ljava/lang/String;
    //   3318: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3321: ifne -> 3331
    //   3324: goto -> 3331
    //   3327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3330: athrow
    //   3331: aload #7
    //   3333: iconst_1
    //   3334: invokevirtual setAccessible : (Z)V
    //   3337: aload #7
    //   3339: aconst_null
    //   3340: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3343: pop
    //   3344: iinc #6, 1
    //   3347: iload_2
    //   3348: ifeq -> 3209
    //   3351: sipush #-19431
    //   3354: sipush #-1697
    //   3357: invokestatic a : (II)Ljava/lang/String;
    //   3360: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3363: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3366: astore #4
    //   3368: aload #4
    //   3370: arraylength
    //   3371: istore #5
    //   3373: iconst_0
    //   3374: istore #6
    //   3376: iload #6
    //   3378: iload #5
    //   3380: if_icmpge -> 3516
    //   3383: aload #4
    //   3385: iload #6
    //   3387: aaload
    //   3388: astore #7
    //   3390: aload #7
    //   3392: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3395: pop
    //   3396: aload #7
    //   3398: invokevirtual getModifiers : ()I
    //   3401: invokestatic isStatic : (I)Z
    //   3404: ifeq -> 3502
    //   3407: aload #7
    //   3409: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3412: arraylength
    //   3413: iconst_2
    //   3414: if_icmpne -> 3502
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload #7
    //   3426: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3429: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3432: if_acmpne -> 3502
    //   3435: goto -> 3442
    //   3438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3441: athrow
    //   3442: aload #7
    //   3444: iconst_1
    //   3445: invokevirtual setAccessible : (Z)V
    //   3448: aload #7
    //   3450: aconst_null
    //   3451: iconst_2
    //   3452: anewarray java/lang/Object
    //   3455: dup
    //   3456: iconst_0
    //   3457: aload_0
    //   3458: aastore
    //   3459: dup
    //   3460: iconst_1
    //   3461: aload_1
    //   3462: ifnonnull -> 3480
    //   3465: goto -> 3472
    //   3468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3471: athrow
    //   3472: aload_1
    //   3473: goto -> 3487
    //   3476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3479: athrow
    //   3480: aload_1
    //   3481: checkcast [B
    //   3484: invokevirtual clone : ()Ljava/lang/Object;
    //   3487: aastore
    //   3488: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3491: checkcast java/lang/Boolean
    //   3494: invokevirtual booleanValue : ()Z
    //   3497: istore_3
    //   3498: iload_2
    //   3499: ifeq -> 3516
    //   3502: iinc #6, 1
    //   3505: iload_2
    //   3506: ifeq -> 3376
    //   3509: goto -> 3516
    //   3512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3515: athrow
    //   3516: iload_2
    //   3517: ifeq -> 3858
    //   3520: sipush #-19446
    //   3523: sipush #18480
    //   3526: invokestatic a : (II)Ljava/lang/String;
    //   3529: iconst_1
    //   3530: ldc burp/Zt3l
    //   3532: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3535: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3538: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3541: astore #4
    //   3543: aload #4
    //   3545: arraylength
    //   3546: istore #5
    //   3548: iconst_0
    //   3549: istore #6
    //   3551: iload #6
    //   3553: iload #5
    //   3555: if_icmpge -> 3693
    //   3558: aload #4
    //   3560: iload #6
    //   3562: aaload
    //   3563: astore #7
    //   3565: aload #7
    //   3567: invokevirtual getModifiers : ()I
    //   3570: invokestatic isStatic : (I)Z
    //   3573: ifne -> 3583
    //   3576: goto -> 3686
    //   3579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3582: athrow
    //   3583: aload #7
    //   3585: invokevirtual getType : ()Ljava/lang/Class;
    //   3588: astore #8
    //   3590: aload #8
    //   3592: ifnull -> 3673
    //   3595: aload #8
    //   3597: invokevirtual isPrimitive : ()Z
    //   3600: ifne -> 3673
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: aload #8
    //   3612: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3615: ifnull -> 3673
    //   3618: goto -> 3625
    //   3621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3624: athrow
    //   3625: aload #8
    //   3627: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3630: invokevirtual getName : ()Ljava/lang/String;
    //   3633: ifnull -> 3673
    //   3636: goto -> 3643
    //   3639: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3642: athrow
    //   3643: aload #8
    //   3645: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3648: invokevirtual getName : ()Ljava/lang/String;
    //   3651: sipush #-19444
    //   3654: sipush #1744
    //   3657: invokestatic a : (II)Ljava/lang/String;
    //   3660: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3663: ifne -> 3673
    //   3666: goto -> 3673
    //   3669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3672: athrow
    //   3673: aload #7
    //   3675: iconst_1
    //   3676: invokevirtual setAccessible : (Z)V
    //   3679: aload #7
    //   3681: aconst_null
    //   3682: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3685: pop
    //   3686: iinc #6, 1
    //   3689: iload_2
    //   3690: ifeq -> 3551
    //   3693: sipush #-19430
    //   3696: sipush #27528
    //   3699: invokestatic a : (II)Ljava/lang/String;
    //   3702: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3705: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3708: astore #4
    //   3710: aload #4
    //   3712: arraylength
    //   3713: istore #5
    //   3715: iconst_0
    //   3716: istore #6
    //   3718: iload #6
    //   3720: iload #5
    //   3722: if_icmpge -> 3858
    //   3725: aload #4
    //   3727: iload #6
    //   3729: aaload
    //   3730: astore #7
    //   3732: aload #7
    //   3734: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3737: pop
    //   3738: aload #7
    //   3740: invokevirtual getModifiers : ()I
    //   3743: invokestatic isStatic : (I)Z
    //   3746: ifeq -> 3844
    //   3749: aload #7
    //   3751: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3754: arraylength
    //   3755: iconst_2
    //   3756: if_icmpne -> 3844
    //   3759: goto -> 3766
    //   3762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3765: athrow
    //   3766: aload #7
    //   3768: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3771: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3774: if_acmpne -> 3844
    //   3777: goto -> 3784
    //   3780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3783: athrow
    //   3784: aload #7
    //   3786: iconst_1
    //   3787: invokevirtual setAccessible : (Z)V
    //   3790: aload #7
    //   3792: aconst_null
    //   3793: iconst_2
    //   3794: anewarray java/lang/Object
    //   3797: dup
    //   3798: iconst_0
    //   3799: aload_0
    //   3800: aastore
    //   3801: dup
    //   3802: iconst_1
    //   3803: aload_1
    //   3804: ifnonnull -> 3822
    //   3807: goto -> 3814
    //   3810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3813: athrow
    //   3814: aload_1
    //   3815: goto -> 3829
    //   3818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3821: athrow
    //   3822: aload_1
    //   3823: checkcast [B
    //   3826: invokevirtual clone : ()Ljava/lang/Object;
    //   3829: aastore
    //   3830: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3833: checkcast java/lang/Boolean
    //   3836: invokevirtual booleanValue : ()Z
    //   3839: istore_3
    //   3840: iload_2
    //   3841: ifeq -> 3858
    //   3844: iinc #6, 1
    //   3847: iload_2
    //   3848: ifeq -> 3718
    //   3851: goto -> 3858
    //   3854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3857: athrow
    //   3858: iload_3
    //   3859: ireturn
    //   3860: astore_3
    //   3861: new java/lang/Exception
    //   3864: dup
    //   3865: aload_3
    //   3866: invokevirtual getMessage : ()Ljava/lang/String;
    //   3869: invokespecial <init> : (Ljava/lang/String;)V
    //   3872: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1670	3860	java/lang/Throwable
    //   218	242	245	java/lang/Throwable
    //   316	353	353	java/lang/Throwable
    //   357	378	378	java/lang/Throwable
    //   382	412	412	java/lang/Throwable
    //   652	666	666	java/lang/Throwable
    //   677	690	693	java/lang/Throwable
    //   682	705	708	java/lang/Throwable
    //   697	723	726	java/lang/Throwable
    //   712	753	756	java/lang/Throwable
    //   816	843	846	java/lang/Throwable
    //   833	864	867	java/lang/Throwable
    //   850	894	897	java/lang/Throwable
    //   871	905	905	java/lang/Throwable
    //   916	932	935	java/lang/Throwable
    //   1031	1045	1045	java/lang/Throwable
    //   1056	1069	1072	java/lang/Throwable
    //   1061	1084	1087	java/lang/Throwable
    //   1076	1102	1105	java/lang/Throwable
    //   1091	1132	1135	java/lang/Throwable
    //   1198	1225	1228	java/lang/Throwable
    //   1215	1243	1246	java/lang/Throwable
    //   1232	1273	1276	java/lang/Throwable
    //   1250	1284	1284	java/lang/Throwable
    //   1306	1317	1320	java/lang/Throwable
    //   1372	1386	1386	java/lang/Throwable
    //   1397	1410	1413	java/lang/Throwable
    //   1402	1425	1428	java/lang/Throwable
    //   1417	1443	1446	java/lang/Throwable
    //   1432	1473	1476	java/lang/Throwable
    //   1539	1566	1569	java/lang/Throwable
    //   1556	1584	1587	java/lang/Throwable
    //   1573	1614	1617	java/lang/Throwable
    //   1591	1625	1625	java/lang/Throwable
    //   1647	1658	1661	java/lang/Throwable
    //   1671	2401	3860	java/lang/Throwable
    //   1761	1775	1775	java/lang/Throwable
    //   1786	1799	1802	java/lang/Throwable
    //   1791	1814	1817	java/lang/Throwable
    //   1806	1832	1835	java/lang/Throwable
    //   1821	1862	1865	java/lang/Throwable
    //   1928	1955	1958	java/lang/Throwable
    //   1945	1973	1976	java/lang/Throwable
    //   1962	2003	2006	java/lang/Throwable
    //   1980	2014	2014	java/lang/Throwable
    //   2036	2047	2050	java/lang/Throwable
    //   2103	2117	2117	java/lang/Throwable
    //   2128	2141	2144	java/lang/Throwable
    //   2133	2156	2159	java/lang/Throwable
    //   2148	2174	2177	java/lang/Throwable
    //   2163	2204	2207	java/lang/Throwable
    //   2270	2297	2300	java/lang/Throwable
    //   2287	2315	2318	java/lang/Throwable
    //   2304	2345	2348	java/lang/Throwable
    //   2322	2356	2356	java/lang/Throwable
    //   2378	2389	2392	java/lang/Throwable
    //   2402	3132	3860	java/lang/Throwable
    //   2492	2506	2506	java/lang/Throwable
    //   2517	2530	2533	java/lang/Throwable
    //   2522	2545	2548	java/lang/Throwable
    //   2537	2563	2566	java/lang/Throwable
    //   2552	2593	2596	java/lang/Throwable
    //   2659	2686	2689	java/lang/Throwable
    //   2676	2704	2707	java/lang/Throwable
    //   2693	2734	2737	java/lang/Throwable
    //   2711	2745	2745	java/lang/Throwable
    //   2767	2778	2781	java/lang/Throwable
    //   2834	2848	2848	java/lang/Throwable
    //   2859	2872	2875	java/lang/Throwable
    //   2864	2887	2890	java/lang/Throwable
    //   2879	2905	2908	java/lang/Throwable
    //   2894	2935	2938	java/lang/Throwable
    //   3001	3028	3031	java/lang/Throwable
    //   3018	3046	3049	java/lang/Throwable
    //   3035	3076	3079	java/lang/Throwable
    //   3053	3087	3087	java/lang/Throwable
    //   3109	3120	3123	java/lang/Throwable
    //   3133	3859	3860	java/lang/Throwable
    //   3223	3237	3237	java/lang/Throwable
    //   3248	3261	3264	java/lang/Throwable
    //   3253	3276	3279	java/lang/Throwable
    //   3268	3294	3297	java/lang/Throwable
    //   3283	3324	3327	java/lang/Throwable
    //   3390	3417	3420	java/lang/Throwable
    //   3407	3435	3438	java/lang/Throwable
    //   3424	3465	3468	java/lang/Throwable
    //   3442	3476	3476	java/lang/Throwable
    //   3498	3509	3512	java/lang/Throwable
    //   3565	3579	3579	java/lang/Throwable
    //   3590	3603	3606	java/lang/Throwable
    //   3595	3618	3621	java/lang/Throwable
    //   3610	3636	3639	java/lang/Throwable
    //   3625	3666	3669	java/lang/Throwable
    //   3732	3759	3762	java/lang/Throwable
    //   3749	3777	3780	java/lang/Throwable
    //   3766	3807	3810	java/lang/Throwable
    //   3784	3818	3818	java/lang/Throwable
    //   3840	3851	3854	java/lang/Throwable
  }
  
  static void ZE(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Za(Object paramObject) {
    Zmly.Zi = a(-19432, -14494);
    Zmly.ZT = new BigInteger(a(-19439, 12625));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxee.Zd.charAt(Math.abs(((BigInteger)Zr4z.ZH).intValue() % 32)) > Zs5i.ZJ.charAt(Math.abs(((BigInteger)Zbzj.Zz).intValue() % 32))) {
          try {
            Zrpu.ZN(Class.forName(a(-19443, 9599)));
            if (!bool)
              Zzoc.ZE(Class.forName(a(-19453, 12840))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzoc.ZE(Class.forName(a(-19453, 12840)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Peûç'ïx@\\tè'³.®QÐ\\tß·¬ÀÍ;ã õ/*nYèÊÞb{e¸Å^h\\búÚ$8äl@\\tsÕêíkåodv\\t\\f]üÇÜ{Ö\\tbsÈ9/ñuy\\tÔbõ;¼ú\\t\\t§ÔÂÂKßÖ\\tyù«hCU{-ÐMÈ.ÐU^>£úàÜÙ\<ÿ¾û¨´ëââQ@ô­BHÕ®çÊ;f¼ÔÓáã\1.Ð=-3ízâÍÜjIíSçÌ7øµ¦\\tÑ½¾àáD>Y\\tùn»A2Ó©3±1\\t¶·R¡|l+\\t¦þP<I÷#\\b%a {27Hh\\tÃü¥©ì!\\bh\\t·ÄÀÀ\\tj:ÉZò×ã\\t½ÆàîDÙ\\n[ \\nª5m| ö~û=!gg~Ià\\rlªOr%&qÍ\\r\\bdî\\b7\\tè¯'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #25
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
    //   68: ldc 'úan\\t"n1pá'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #59
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
    //   128: putstatic burp/Zt5a.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zt5a.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #15
    //   214: goto -> 243
    //   217: bipush #52
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #64
    //   228: goto -> 243
    //   231: bipush #126
    //   233: goto -> 243
    //   236: bipush #78
    //   238: goto -> 243
    //   241: bipush #104
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: sipush #-19442
    //   303: sipush #2770
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zt5a.Zl : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #22
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #14
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-60
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #13
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #49
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #45
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-114
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-16
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-22
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-30
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #18
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #123
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #50
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #30
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-61
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-105
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-26
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #112
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-77
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-78
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #77
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #16
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-78
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #15
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #35
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-126
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #97
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #26
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-104
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #17
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #53
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #87
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zt5a.Zs : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB41B) & 0xFFFF;
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
      char c = 'Ý';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */