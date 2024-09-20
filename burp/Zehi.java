package burp;

import java.math.BigInteger;

class Zehi extends ClassLoader {
  static Object Zb;
  
  static String Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm__.Zz : Ljava/lang/Object;
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
    //   562: new java/math/BigInteger
    //   565: dup
    //   566: aload #4
    //   568: invokespecial <init> : ([B)V
    //   571: invokevirtual abs : ()Ljava/math/BigInteger;
    //   574: putstatic burp/Zl2g.ZG : Ljava/lang/Object;
    //   577: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
    //   580: checkcast java/math/BigInteger
    //   583: getstatic burp/Ze7q.Zk : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   592: putstatic burp/Zkig.ZK : Ljava/lang/Object;
    //   595: ldc2_w 8682522807148012
    //   598: invokestatic currentTimeMillis : ()J
    //   601: lxor
    //   602: lstore #4
    //   604: lload #4
    //   606: ldc2_w 25214903917
    //   609: lmul
    //   610: ldc2_w 11
    //   613: ladd
    //   614: ldc2_w 281474976710655
    //   617: land
    //   618: lstore #4
    //   620: lload #4
    //   622: bipush #32
    //   624: lshl
    //   625: lstore #6
    //   627: lload #4
    //   629: ldc2_w 25214903917
    //   632: lmul
    //   633: ldc2_w 11
    //   636: ladd
    //   637: ldc2_w 281474976710655
    //   640: land
    //   641: lstore #4
    //   643: lload #6
    //   645: lload #4
    //   647: ladd
    //   648: lstore #6
    //   650: bipush #16
    //   652: newarray byte
    //   654: dup
    //   655: iconst_0
    //   656: bipush #48
    //   658: bastore
    //   659: dup
    //   660: iconst_1
    //   661: bipush #49
    //   663: bastore
    //   664: dup
    //   665: iconst_2
    //   666: bipush #50
    //   668: bastore
    //   669: dup
    //   670: iconst_3
    //   671: bipush #51
    //   673: bastore
    //   674: dup
    //   675: iconst_4
    //   676: bipush #52
    //   678: bastore
    //   679: dup
    //   680: iconst_5
    //   681: bipush #53
    //   683: bastore
    //   684: dup
    //   685: bipush #6
    //   687: bipush #54
    //   689: bastore
    //   690: dup
    //   691: bipush #7
    //   693: bipush #55
    //   695: bastore
    //   696: dup
    //   697: bipush #8
    //   699: bipush #56
    //   701: bastore
    //   702: dup
    //   703: bipush #9
    //   705: bipush #57
    //   707: bastore
    //   708: dup
    //   709: bipush #10
    //   711: bipush #97
    //   713: bastore
    //   714: dup
    //   715: bipush #11
    //   717: bipush #98
    //   719: bastore
    //   720: dup
    //   721: bipush #12
    //   723: bipush #99
    //   725: bastore
    //   726: dup
    //   727: bipush #13
    //   729: bipush #100
    //   731: bastore
    //   732: dup
    //   733: bipush #14
    //   735: bipush #101
    //   737: bastore
    //   738: dup
    //   739: bipush #15
    //   741: bipush #102
    //   743: bastore
    //   744: astore #8
    //   746: bipush #64
    //   748: newarray byte
    //   750: astore #9
    //   752: bipush #64
    //   754: istore #10
    //   756: bipush #16
    //   758: istore #11
    //   760: iload #11
    //   762: iconst_1
    //   763: isub
    //   764: i2l
    //   765: lstore #12
    //   767: aload #9
    //   769: iinc #10, -1
    //   772: iload #10
    //   774: aload #8
    //   776: lload #6
    //   778: lload #12
    //   780: land
    //   781: l2i
    //   782: baload
    //   783: bastore
    //   784: lload #6
    //   786: iconst_4
    //   787: lushr
    //   788: lstore #6
    //   790: lload #6
    //   792: lconst_0
    //   793: lcmp
    //   794: ifne -> 767
    //   797: bipush #64
    //   799: iload #10
    //   801: isub
    //   802: newarray byte
    //   804: astore_3
    //   805: iconst_0
    //   806: istore #14
    //   808: iload #14
    //   810: aload_3
    //   811: arraylength
    //   812: if_icmpge -> 834
    //   815: aload_3
    //   816: iload #14
    //   818: aload #9
    //   820: iload #10
    //   822: iload #14
    //   824: iadd
    //   825: baload
    //   826: bastore
    //   827: iinc #14, 1
    //   830: iload_2
    //   831: ifne -> 808
    //   834: aload_3
    //   835: arraylength
    //   836: bipush #10
    //   838: if_icmplt -> 604
    //   841: sipush #-29256
    //   844: sipush #13249
    //   847: invokestatic a : (II)Ljava/lang/String;
    //   850: iconst_1
    //   851: ldc burp/Zzh0
    //   853: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   856: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   859: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   862: astore_3
    //   863: aload_3
    //   864: arraylength
    //   865: istore #4
    //   867: iconst_0
    //   868: istore #5
    //   870: iload #5
    //   872: iload #4
    //   874: if_icmpge -> 1011
    //   877: aload_3
    //   878: iload #5
    //   880: aaload
    //   881: astore #6
    //   883: aload #6
    //   885: invokevirtual getModifiers : ()I
    //   888: invokestatic isStatic : (I)Z
    //   891: ifne -> 901
    //   894: goto -> 1004
    //   897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   900: athrow
    //   901: aload #6
    //   903: invokevirtual getType : ()Ljava/lang/Class;
    //   906: astore #7
    //   908: aload #7
    //   910: ifnull -> 991
    //   913: aload #7
    //   915: invokevirtual isPrimitive : ()Z
    //   918: ifne -> 991
    //   921: goto -> 928
    //   924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   927: athrow
    //   928: aload #7
    //   930: invokevirtual getPackage : ()Ljava/lang/Package;
    //   933: ifnull -> 991
    //   936: goto -> 943
    //   939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   942: athrow
    //   943: aload #7
    //   945: invokevirtual getPackage : ()Ljava/lang/Package;
    //   948: invokevirtual getName : ()Ljava/lang/String;
    //   951: ifnull -> 991
    //   954: goto -> 961
    //   957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   960: athrow
    //   961: aload #7
    //   963: invokevirtual getPackage : ()Ljava/lang/Package;
    //   966: invokevirtual getName : ()Ljava/lang/String;
    //   969: sipush #-29249
    //   972: sipush #-12332
    //   975: invokestatic a : (II)Ljava/lang/String;
    //   978: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   981: ifne -> 991
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #6
    //   993: iconst_1
    //   994: invokevirtual setAccessible : (Z)V
    //   997: aload #6
    //   999: aconst_null
    //   1000: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1003: pop
    //   1004: iinc #5, 1
    //   1007: iload_2
    //   1008: ifne -> 870
    //   1011: sipush #-29251
    //   1014: sipush #6961
    //   1017: invokestatic a : (II)Ljava/lang/String;
    //   1020: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1023: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1026: astore_3
    //   1027: aload_3
    //   1028: arraylength
    //   1029: istore #4
    //   1031: iconst_0
    //   1032: istore #5
    //   1034: iload #5
    //   1036: iload #4
    //   1038: if_icmpge -> 1170
    //   1041: aload_3
    //   1042: iload #5
    //   1044: aaload
    //   1045: astore #6
    //   1047: aload #6
    //   1049: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1052: pop
    //   1053: aload #6
    //   1055: invokevirtual getModifiers : ()I
    //   1058: invokestatic isStatic : (I)Z
    //   1061: ifeq -> 1156
    //   1064: aload #6
    //   1066: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1069: arraylength
    //   1070: iconst_2
    //   1071: if_icmpne -> 1156
    //   1074: goto -> 1081
    //   1077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1080: athrow
    //   1081: aload #6
    //   1083: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1086: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1089: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1092: ifeq -> 1156
    //   1095: goto -> 1102
    //   1098: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1101: athrow
    //   1102: aload #6
    //   1104: iconst_1
    //   1105: invokevirtual setAccessible : (Z)V
    //   1108: aload #6
    //   1110: aconst_null
    //   1111: iconst_2
    //   1112: anewarray java/lang/Object
    //   1115: dup
    //   1116: iconst_0
    //   1117: aload_0
    //   1118: aastore
    //   1119: dup
    //   1120: iconst_1
    //   1121: aload_1
    //   1122: ifnonnull -> 1140
    //   1125: goto -> 1132
    //   1128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1131: athrow
    //   1132: aload_1
    //   1133: goto -> 1147
    //   1136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1139: athrow
    //   1140: aload_1
    //   1141: checkcast [B
    //   1144: invokevirtual clone : ()Ljava/lang/Object;
    //   1147: aastore
    //   1148: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1151: pop
    //   1152: iload_2
    //   1153: ifne -> 1170
    //   1156: iinc #5, 1
    //   1159: iload_2
    //   1160: ifne -> 1034
    //   1163: goto -> 1170
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: getstatic burp/Zxzd.ZM : Ljava/lang/String;
    //   1173: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   1176: checkcast java/math/BigInteger
    //   1179: invokevirtual intValue : ()I
    //   1182: bipush #32
    //   1184: irem
    //   1185: invokestatic abs : (I)I
    //   1188: invokevirtual charAt : (I)C
    //   1191: getstatic burp/Zkbm.Zb : Ljava/lang/String;
    //   1194: getstatic burp/Zb8v.ZA : Ljava/lang/Object;
    //   1197: checkcast java/math/BigInteger
    //   1200: invokevirtual intValue : ()I
    //   1203: bipush #32
    //   1205: irem
    //   1206: invokestatic abs : (I)I
    //   1209: invokevirtual charAt : (I)C
    //   1212: if_icmple -> 1327
    //   1215: getstatic burp/Zshq.Zi : Ljava/lang/String;
    //   1218: getstatic burp/Zxwl.Ze : Ljava/lang/Object;
    //   1221: checkcast java/math/BigInteger
    //   1224: invokevirtual intValue : ()I
    //   1227: bipush #32
    //   1229: irem
    //   1230: invokestatic abs : (I)I
    //   1233: invokevirtual charAt : (I)C
    //   1236: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   1239: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
    //   1242: checkcast java/math/BigInteger
    //   1245: invokevirtual intValue : ()I
    //   1248: bipush #32
    //   1250: irem
    //   1251: invokestatic abs : (I)I
    //   1254: invokevirtual charAt : (I)C
    //   1257: if_icmple -> 1327
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1266: athrow
    //   1267: getstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   1270: getstatic burp/Zl_u.ZR : Ljava/lang/Object;
    //   1273: checkcast java/math/BigInteger
    //   1276: invokevirtual intValue : ()I
    //   1279: bipush #32
    //   1281: irem
    //   1282: invokestatic abs : (I)I
    //   1285: invokevirtual charAt : (I)C
    //   1288: getstatic burp/Zl2g.ZI : Ljava/lang/String;
    //   1291: getstatic burp/Zxso.ZF : Ljava/lang/Object;
    //   1294: checkcast java/math/BigInteger
    //   1297: invokevirtual intValue : ()I
    //   1300: bipush #32
    //   1302: irem
    //   1303: invokestatic abs : (I)I
    //   1306: invokevirtual charAt : (I)C
    //   1309: if_icmpgt -> 1327
    //   1312: goto -> 1319
    //   1315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1318: athrow
    //   1319: iconst_1
    //   1320: goto -> 1328
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: iconst_0
    //   1328: ireturn
    //   1329: astore_3
    //   1330: new java/lang/Exception
    //   1333: dup
    //   1334: aload_3
    //   1335: invokevirtual getMessage : ()Ljava/lang/String;
    //   1338: invokespecial <init> : (Ljava/lang/String;)V
    //   1341: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1328	1329	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   883	897	897	java/lang/Throwable
    //   908	921	924	java/lang/Throwable
    //   913	936	939	java/lang/Throwable
    //   928	954	957	java/lang/Throwable
    //   943	984	987	java/lang/Throwable
    //   1047	1074	1077	java/lang/Throwable
    //   1064	1095	1098	java/lang/Throwable
    //   1081	1125	1128	java/lang/Throwable
    //   1102	1136	1136	java/lang/Throwable
    //   1147	1163	1166	java/lang/Throwable
    //   1170	1260	1263	java/lang/Throwable
    //   1215	1312	1315	java/lang/Throwable
    //   1267	1323	1323	java/lang/Throwable
  }
  
  static void ZI(Object paramObject) {
    Zxl5.Zq = a(-29250, 97);
    Zxl5.Zh = new BigInteger(a(-29255, 4198));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zr3q.ZM.charAt(Math.abs(((BigInteger)Zkmx.Zu).intValue() % 32)) <= Zb2s.Zq.charAt(Math.abs(((BigInteger)Zxzd.ZD).intValue() % 32))) {
          try {
            Zk9s.Zr(Class.forName(a(-29252, 12074)));
            if (!bool)
              Zgw7.Z_(Class.forName(a(-29254, 26068))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgw7.Z_(Class.forName(a(-29254, 26068)));
    } catch (Throwable throwable) {}
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'FSSññ«ÎÑM}­LÍþ²¾ýW?úfp ·US*î©eI,I¾Êâ½Å:àÐiR´c0ÊË18Ï,¼ÑÁÓáÖÙX ÿ@Ã)\\tt½L,ÉdU ¤Ëz6.3|çÑàFç3\åeÎö´ÈÞ\\tºÿd) O°\\t,.G^sPûúÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
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
    //   68: ldc '¶.x\\bÛòÿ½ïûT ¶³©­Ïqm{N¼¼=´8[ 5'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #9
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
    //   129: putstatic burp/Zehi.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zehi.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #67
    //   214: goto -> 243
    //   217: bipush #44
    //   219: goto -> 243
    //   222: bipush #27
    //   224: goto -> 243
    //   227: bipush #88
    //   229: goto -> 243
    //   232: bipush #7
    //   234: goto -> 243
    //   237: bipush #89
    //   239: goto -> 243
    //   242: iconst_1
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #34
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #100
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-24
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-33
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-105
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-42
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-26
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-13
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-11
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-19
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-118
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-47
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #75
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #54
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #114
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #96
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-33
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #88
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #74
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-19
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #97
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-72
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #22
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: iconst_5
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-49
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-88
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #-9
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-38
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #80
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #70
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #85
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #70
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zehi.Zb : Ljava/lang/Object;
    //   499: sipush #-29253
    //   502: sipush #27688
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zehi.Zi : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8DB8) & 0xFFFF;
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
      char c = 'þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zehi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */