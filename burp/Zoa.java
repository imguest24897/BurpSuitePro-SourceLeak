package burp;

import java.math.BigInteger;

class Zoa extends ClassLoader {
  static String ZF;
  
  static Object ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ztte.ZR : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: iload #6
    //   22: aload_3
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: aload_3
    //   28: iload #6
    //   30: baload
    //   31: istore #7
    //   33: iload #7
    //   35: bipush #48
    //   37: if_icmplt -> 54
    //   40: iload #7
    //   42: bipush #57
    //   44: if_icmple -> 152
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: iload #7
    //   56: bipush #65
    //   58: if_icmplt -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iload #7
    //   70: bipush #90
    //   72: if_icmple -> 152
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: iload #7
    //   84: bipush #97
    //   86: if_icmplt -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #7
    //   98: bipush #122
    //   100: if_icmple -> 152
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: iload #7
    //   112: bipush #43
    //   114: if_icmpeq -> 152
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: iload #7
    //   126: bipush #47
    //   128: if_icmpeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: iload #7
    //   140: bipush #61
    //   142: if_icmpne -> 162
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: iinc #5, 1
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: iinc #6, 1
    //   165: iload_2
    //   166: ifeq -> 20
    //   169: iload #5
    //   171: newarray byte
    //   173: astore #6
    //   175: iconst_0
    //   176: istore #7
    //   178: iconst_0
    //   179: istore #8
    //   181: iload #8
    //   183: aload_3
    //   184: arraylength
    //   185: if_icmpge -> 337
    //   188: aload_3
    //   189: iload #8
    //   191: baload
    //   192: istore #9
    //   194: iload #9
    //   196: bipush #48
    //   198: if_icmplt -> 215
    //   201: iload #9
    //   203: bipush #57
    //   205: if_icmple -> 313
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: iload #9
    //   217: bipush #65
    //   219: if_icmplt -> 243
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   228: athrow
    //   229: iload #9
    //   231: bipush #90
    //   233: if_icmple -> 313
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iload #9
    //   245: bipush #97
    //   247: if_icmplt -> 271
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   256: athrow
    //   257: iload #9
    //   259: bipush #122
    //   261: if_icmple -> 313
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: iload #9
    //   273: bipush #43
    //   275: if_icmpeq -> 313
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   284: athrow
    //   285: iload #9
    //   287: bipush #47
    //   289: if_icmpeq -> 313
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: iload #9
    //   301: bipush #61
    //   303: if_icmpne -> 330
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iload #7
    //   317: iload #9
    //   319: bastore
    //   320: iinc #7, 1
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #8, 1
    //   333: iload_2
    //   334: ifeq -> 181
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: astore_3
    //   344: aload_3
    //   345: arraylength
    //   346: istore #5
    //   348: aload_3
    //   349: iload #5
    //   351: iconst_1
    //   352: isub
    //   353: baload
    //   354: bipush #61
    //   356: if_icmpne -> 366
    //   359: iinc #5, -1
    //   362: iload_2
    //   363: ifeq -> 348
    //   366: iload #5
    //   368: aload_3
    //   369: arraylength
    //   370: iconst_4
    //   371: idiv
    //   372: isub
    //   373: newarray byte
    //   375: astore #6
    //   377: iconst_0
    //   378: istore #7
    //   380: iload #7
    //   382: aload_3
    //   383: arraylength
    //   384: if_icmpge -> 646
    //   387: aload_3
    //   388: iload #7
    //   390: baload
    //   391: bipush #61
    //   393: if_icmpne -> 412
    //   396: aload_3
    //   397: iload #7
    //   399: iconst_0
    //   400: bastore
    //   401: iload_2
    //   402: ifeq -> 639
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: athrow
    //   412: aload_3
    //   413: iload #7
    //   415: baload
    //   416: bipush #47
    //   418: if_icmpne -> 445
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   427: athrow
    //   428: aload_3
    //   429: iload #7
    //   431: bipush #63
    //   433: bastore
    //   434: iload_2
    //   435: ifeq -> 639
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   444: athrow
    //   445: aload_3
    //   446: iload #7
    //   448: baload
    //   449: bipush #43
    //   451: if_icmpne -> 478
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload_3
    //   462: iload #7
    //   464: bipush #62
    //   466: bastore
    //   467: iload_2
    //   468: ifeq -> 639
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   477: athrow
    //   478: aload_3
    //   479: iload #7
    //   481: baload
    //   482: bipush #48
    //   484: if_icmplt -> 533
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload_3
    //   495: iload #7
    //   497: baload
    //   498: bipush #57
    //   500: if_icmpgt -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: aload_3
    //   511: iload #7
    //   513: aload_3
    //   514: iload #7
    //   516: baload
    //   517: bipush #-4
    //   519: isub
    //   520: i2b
    //   521: bastore
    //   522: iload_2
    //   523: ifeq -> 639
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: iload #7
    //   536: baload
    //   537: bipush #97
    //   539: if_icmplt -> 588
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #122
    //   555: if_icmpgt -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload_3
    //   566: iload #7
    //   568: aload_3
    //   569: iload #7
    //   571: baload
    //   572: bipush #71
    //   574: isub
    //   575: i2b
    //   576: bastore
    //   577: iload_2
    //   578: ifeq -> 639
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload_3
    //   589: iload #7
    //   591: baload
    //   592: bipush #65
    //   594: if_icmplt -> 639
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #90
    //   610: if_icmpgt -> 639
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload_3
    //   621: iload #7
    //   623: aload_3
    //   624: iload #7
    //   626: baload
    //   627: bipush #65
    //   629: isub
    //   630: i2b
    //   631: bastore
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iinc #7, 1
    //   642: iload_2
    //   643: ifeq -> 380
    //   646: iconst_0
    //   647: istore #7
    //   649: iconst_0
    //   650: istore #8
    //   652: iload #8
    //   654: aload #6
    //   656: arraylength
    //   657: iconst_2
    //   658: isub
    //   659: if_icmpge -> 762
    //   662: aload #6
    //   664: iload #8
    //   666: aload_3
    //   667: iload #7
    //   669: baload
    //   670: iconst_2
    //   671: ishl
    //   672: sipush #255
    //   675: iand
    //   676: aload_3
    //   677: iload #7
    //   679: iconst_1
    //   680: iadd
    //   681: baload
    //   682: iconst_4
    //   683: iushr
    //   684: iconst_3
    //   685: iand
    //   686: ior
    //   687: i2b
    //   688: bastore
    //   689: aload #6
    //   691: iload #8
    //   693: iconst_1
    //   694: iadd
    //   695: aload_3
    //   696: iload #7
    //   698: iconst_1
    //   699: iadd
    //   700: baload
    //   701: iconst_4
    //   702: ishl
    //   703: sipush #255
    //   706: iand
    //   707: aload_3
    //   708: iload #7
    //   710: iconst_2
    //   711: iadd
    //   712: baload
    //   713: iconst_2
    //   714: iushr
    //   715: bipush #15
    //   717: iand
    //   718: ior
    //   719: i2b
    //   720: bastore
    //   721: aload #6
    //   723: iload #8
    //   725: iconst_2
    //   726: iadd
    //   727: aload_3
    //   728: iload #7
    //   730: iconst_2
    //   731: iadd
    //   732: baload
    //   733: bipush #6
    //   735: ishl
    //   736: sipush #255
    //   739: iand
    //   740: aload_3
    //   741: iload #7
    //   743: iconst_3
    //   744: iadd
    //   745: baload
    //   746: bipush #63
    //   748: iand
    //   749: ior
    //   750: i2b
    //   751: bastore
    //   752: iinc #7, 4
    //   755: iinc #8, 3
    //   758: iload_2
    //   759: ifeq -> 652
    //   762: iload #8
    //   764: aload #6
    //   766: arraylength
    //   767: if_icmpge -> 804
    //   770: aload #6
    //   772: iload #8
    //   774: aload_3
    //   775: iload #7
    //   777: baload
    //   778: iconst_2
    //   779: ishl
    //   780: sipush #255
    //   783: iand
    //   784: aload_3
    //   785: iload #7
    //   787: iconst_1
    //   788: iadd
    //   789: baload
    //   790: iconst_4
    //   791: iushr
    //   792: iconst_3
    //   793: iand
    //   794: ior
    //   795: i2b
    //   796: bastore
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: iinc #8, 1
    //   807: iload #8
    //   809: aload #6
    //   811: arraylength
    //   812: if_icmpge -> 852
    //   815: aload #6
    //   817: iload #8
    //   819: aload_3
    //   820: iload #7
    //   822: iconst_1
    //   823: iadd
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: sipush #255
    //   830: iand
    //   831: aload_3
    //   832: iload #7
    //   834: iconst_2
    //   835: iadd
    //   836: baload
    //   837: iconst_2
    //   838: iushr
    //   839: bipush #15
    //   841: iand
    //   842: ior
    //   843: i2b
    //   844: bastore
    //   845: goto -> 852
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #6
    //   854: astore #4
    //   856: sipush #-30632
    //   859: new java/math/BigInteger
    //   862: dup
    //   863: aload #4
    //   865: invokespecial <init> : ([B)V
    //   868: invokevirtual abs : ()Ljava/math/BigInteger;
    //   871: putstatic burp/Zty5.Zf : Ljava/lang/Object;
    //   874: sipush #-27648
    //   877: invokestatic a : (II)Ljava/lang/String;
    //   880: iconst_1
    //   881: ldc burp/Zelc
    //   883: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   886: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   889: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   892: astore_3
    //   893: aload_3
    //   894: arraylength
    //   895: istore #4
    //   897: iconst_0
    //   898: istore #5
    //   900: iload #5
    //   902: iload #4
    //   904: if_icmpge -> 1041
    //   907: aload_3
    //   908: iload #5
    //   910: aaload
    //   911: astore #6
    //   913: aload #6
    //   915: invokevirtual getModifiers : ()I
    //   918: invokestatic isStatic : (I)Z
    //   921: ifne -> 931
    //   924: goto -> 1034
    //   927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   930: athrow
    //   931: aload #6
    //   933: invokevirtual getType : ()Ljava/lang/Class;
    //   936: astore #7
    //   938: aload #7
    //   940: ifnull -> 1021
    //   943: aload #7
    //   945: invokevirtual isPrimitive : ()Z
    //   948: ifne -> 1021
    //   951: goto -> 958
    //   954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   957: athrow
    //   958: aload #7
    //   960: invokevirtual getPackage : ()Ljava/lang/Package;
    //   963: ifnull -> 1021
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   972: athrow
    //   973: aload #7
    //   975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   978: invokevirtual getName : ()Ljava/lang/String;
    //   981: ifnull -> 1021
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #7
    //   993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: sipush #-30648
    //   1002: sipush #7307
    //   1005: invokestatic a : (II)Ljava/lang/String;
    //   1008: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1011: ifne -> 1021
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload #6
    //   1023: iconst_1
    //   1024: invokevirtual setAccessible : (Z)V
    //   1027: aload #6
    //   1029: aconst_null
    //   1030: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1033: pop
    //   1034: iinc #5, 1
    //   1037: iload_2
    //   1038: ifeq -> 900
    //   1041: sipush #-30654
    //   1044: sipush #-7106
    //   1047: invokestatic a : (II)Ljava/lang/String;
    //   1050: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1053: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1056: astore_3
    //   1057: aload_3
    //   1058: arraylength
    //   1059: istore #4
    //   1061: iconst_0
    //   1062: istore #5
    //   1064: iload #5
    //   1066: iload #4
    //   1068: if_icmpge -> 1200
    //   1071: aload_3
    //   1072: iload #5
    //   1074: aaload
    //   1075: astore #6
    //   1077: aload #6
    //   1079: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1082: pop
    //   1083: aload #6
    //   1085: invokevirtual getModifiers : ()I
    //   1088: invokestatic isStatic : (I)Z
    //   1091: ifeq -> 1186
    //   1094: aload #6
    //   1096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1099: arraylength
    //   1100: iconst_2
    //   1101: if_icmpne -> 1186
    //   1104: goto -> 1111
    //   1107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1110: athrow
    //   1111: aload #6
    //   1113: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1116: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1122: ifeq -> 1186
    //   1125: goto -> 1132
    //   1128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1131: athrow
    //   1132: aload #6
    //   1134: iconst_1
    //   1135: invokevirtual setAccessible : (Z)V
    //   1138: aload #6
    //   1140: aconst_null
    //   1141: iconst_2
    //   1142: anewarray java/lang/Object
    //   1145: dup
    //   1146: iconst_0
    //   1147: aload_0
    //   1148: aastore
    //   1149: dup
    //   1150: iconst_1
    //   1151: aload_1
    //   1152: ifnonnull -> 1170
    //   1155: goto -> 1162
    //   1158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1161: athrow
    //   1162: aload_1
    //   1163: goto -> 1177
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: aload_1
    //   1171: checkcast [B
    //   1174: invokevirtual clone : ()Ljava/lang/Object;
    //   1177: aastore
    //   1178: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1181: pop
    //   1182: iload_2
    //   1183: ifeq -> 1200
    //   1186: iinc #5, 1
    //   1189: iload_2
    //   1190: ifeq -> 1064
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: iconst_0
    //   1201: istore_3
    //   1202: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   1205: getstatic burp/Zsgj.ZK : Ljava/lang/Object;
    //   1208: checkcast java/math/BigInteger
    //   1211: invokevirtual intValue : ()I
    //   1214: bipush #32
    //   1216: irem
    //   1217: invokestatic abs : (I)I
    //   1220: invokevirtual charAt : (I)C
    //   1223: getstatic burp/Zewo.ZM : Ljava/lang/String;
    //   1226: getstatic burp/Zebj.Zf : Ljava/lang/Object;
    //   1229: checkcast java/math/BigInteger
    //   1232: invokevirtual intValue : ()I
    //   1235: bipush #32
    //   1237: irem
    //   1238: invokestatic abs : (I)I
    //   1241: invokevirtual charAt : (I)C
    //   1244: if_icmple -> 1588
    //   1247: sipush #-30628
    //   1250: sipush #-8094
    //   1253: invokestatic a : (II)Ljava/lang/String;
    //   1256: iconst_1
    //   1257: ldc burp/Zxo7
    //   1259: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1262: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1265: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1268: astore #4
    //   1270: aload #4
    //   1272: arraylength
    //   1273: istore #5
    //   1275: iconst_0
    //   1276: istore #6
    //   1278: iload #6
    //   1280: iload #5
    //   1282: if_icmpge -> 1420
    //   1285: aload #4
    //   1287: iload #6
    //   1289: aaload
    //   1290: astore #7
    //   1292: aload #7
    //   1294: invokevirtual getModifiers : ()I
    //   1297: invokestatic isStatic : (I)Z
    //   1300: ifne -> 1310
    //   1303: goto -> 1413
    //   1306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1309: athrow
    //   1310: aload #7
    //   1312: invokevirtual getType : ()Ljava/lang/Class;
    //   1315: astore #8
    //   1317: aload #8
    //   1319: ifnull -> 1400
    //   1322: aload #8
    //   1324: invokevirtual isPrimitive : ()Z
    //   1327: ifne -> 1400
    //   1330: goto -> 1337
    //   1333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1336: athrow
    //   1337: aload #8
    //   1339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1342: ifnull -> 1400
    //   1345: goto -> 1352
    //   1348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1351: athrow
    //   1352: aload #8
    //   1354: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1357: invokevirtual getName : ()Ljava/lang/String;
    //   1360: ifnull -> 1400
    //   1363: goto -> 1370
    //   1366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1369: athrow
    //   1370: aload #8
    //   1372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1375: invokevirtual getName : ()Ljava/lang/String;
    //   1378: sipush #-30631
    //   1381: sipush #32261
    //   1384: invokestatic a : (II)Ljava/lang/String;
    //   1387: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1390: ifne -> 1400
    //   1393: goto -> 1400
    //   1396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1399: athrow
    //   1400: aload #7
    //   1402: iconst_1
    //   1403: invokevirtual setAccessible : (Z)V
    //   1406: aload #7
    //   1408: aconst_null
    //   1409: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1412: pop
    //   1413: iinc #6, 1
    //   1416: iload_2
    //   1417: ifeq -> 1278
    //   1420: sipush #-30626
    //   1423: sipush #-5148
    //   1426: invokestatic a : (II)Ljava/lang/String;
    //   1429: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1432: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1435: astore #4
    //   1437: aload #4
    //   1439: arraylength
    //   1440: istore #5
    //   1442: iconst_0
    //   1443: istore #6
    //   1445: iload #6
    //   1447: iload #5
    //   1449: if_icmpge -> 1585
    //   1452: aload #4
    //   1454: iload #6
    //   1456: aaload
    //   1457: astore #7
    //   1459: aload #7
    //   1461: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1464: pop
    //   1465: aload #7
    //   1467: invokevirtual getModifiers : ()I
    //   1470: invokestatic isStatic : (I)Z
    //   1473: ifeq -> 1571
    //   1476: aload #7
    //   1478: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1481: arraylength
    //   1482: iconst_2
    //   1483: if_icmpne -> 1571
    //   1486: goto -> 1493
    //   1489: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1492: athrow
    //   1493: aload #7
    //   1495: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1498: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1501: if_acmpne -> 1571
    //   1504: goto -> 1511
    //   1507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1510: athrow
    //   1511: aload #7
    //   1513: iconst_1
    //   1514: invokevirtual setAccessible : (Z)V
    //   1517: aload #7
    //   1519: aconst_null
    //   1520: iconst_2
    //   1521: anewarray java/lang/Object
    //   1524: dup
    //   1525: iconst_0
    //   1526: aload_0
    //   1527: aastore
    //   1528: dup
    //   1529: iconst_1
    //   1530: aload_1
    //   1531: ifnonnull -> 1549
    //   1534: goto -> 1541
    //   1537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1540: athrow
    //   1541: aload_1
    //   1542: goto -> 1556
    //   1545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1548: athrow
    //   1549: aload_1
    //   1550: checkcast [B
    //   1553: invokevirtual clone : ()Ljava/lang/Object;
    //   1556: aastore
    //   1557: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1560: checkcast java/lang/Boolean
    //   1563: invokevirtual booleanValue : ()Z
    //   1566: istore_3
    //   1567: iload_2
    //   1568: ifeq -> 1585
    //   1571: iinc #6, 1
    //   1574: iload_2
    //   1575: ifeq -> 1445
    //   1578: goto -> 1585
    //   1581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1584: athrow
    //   1585: goto -> 1926
    //   1588: sipush #-30651
    //   1591: sipush #-23523
    //   1594: invokestatic a : (II)Ljava/lang/String;
    //   1597: iconst_1
    //   1598: ldc burp/Zlqy
    //   1600: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1603: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1606: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1609: astore #4
    //   1611: aload #4
    //   1613: arraylength
    //   1614: istore #5
    //   1616: iconst_0
    //   1617: istore #6
    //   1619: iload #6
    //   1621: iload #5
    //   1623: if_icmpge -> 1761
    //   1626: aload #4
    //   1628: iload #6
    //   1630: aaload
    //   1631: astore #7
    //   1633: aload #7
    //   1635: invokevirtual getModifiers : ()I
    //   1638: invokestatic isStatic : (I)Z
    //   1641: ifne -> 1651
    //   1644: goto -> 1754
    //   1647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1650: athrow
    //   1651: aload #7
    //   1653: invokevirtual getType : ()Ljava/lang/Class;
    //   1656: astore #8
    //   1658: aload #8
    //   1660: ifnull -> 1741
    //   1663: aload #8
    //   1665: invokevirtual isPrimitive : ()Z
    //   1668: ifne -> 1741
    //   1671: goto -> 1678
    //   1674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1677: athrow
    //   1678: aload #8
    //   1680: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1683: ifnull -> 1741
    //   1686: goto -> 1693
    //   1689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1692: athrow
    //   1693: aload #8
    //   1695: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1698: invokevirtual getName : ()Ljava/lang/String;
    //   1701: ifnull -> 1741
    //   1704: goto -> 1711
    //   1707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1710: athrow
    //   1711: aload #8
    //   1713: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1716: invokevirtual getName : ()Ljava/lang/String;
    //   1719: sipush #-30631
    //   1722: sipush #32261
    //   1725: invokestatic a : (II)Ljava/lang/String;
    //   1728: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1731: ifne -> 1741
    //   1734: goto -> 1741
    //   1737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1740: athrow
    //   1741: aload #7
    //   1743: iconst_1
    //   1744: invokevirtual setAccessible : (Z)V
    //   1747: aload #7
    //   1749: aconst_null
    //   1750: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1753: pop
    //   1754: iinc #6, 1
    //   1757: iload_2
    //   1758: ifeq -> 1619
    //   1761: sipush #-30652
    //   1764: sipush #21971
    //   1767: invokestatic a : (II)Ljava/lang/String;
    //   1770: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1773: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1776: astore #4
    //   1778: aload #4
    //   1780: arraylength
    //   1781: istore #5
    //   1783: iconst_0
    //   1784: istore #6
    //   1786: iload #6
    //   1788: iload #5
    //   1790: if_icmpge -> 1926
    //   1793: aload #4
    //   1795: iload #6
    //   1797: aaload
    //   1798: astore #7
    //   1800: aload #7
    //   1802: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1805: pop
    //   1806: aload #7
    //   1808: invokevirtual getModifiers : ()I
    //   1811: invokestatic isStatic : (I)Z
    //   1814: ifeq -> 1912
    //   1817: aload #7
    //   1819: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1822: arraylength
    //   1823: iconst_2
    //   1824: if_icmpne -> 1912
    //   1827: goto -> 1834
    //   1830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1833: athrow
    //   1834: aload #7
    //   1836: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1839: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1842: if_acmpne -> 1912
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #7
    //   1854: iconst_1
    //   1855: invokevirtual setAccessible : (Z)V
    //   1858: aload #7
    //   1860: aconst_null
    //   1861: iconst_2
    //   1862: anewarray java/lang/Object
    //   1865: dup
    //   1866: iconst_0
    //   1867: aload_0
    //   1868: aastore
    //   1869: dup
    //   1870: iconst_1
    //   1871: aload_1
    //   1872: ifnonnull -> 1890
    //   1875: goto -> 1882
    //   1878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1881: athrow
    //   1882: aload_1
    //   1883: goto -> 1897
    //   1886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1889: athrow
    //   1890: aload_1
    //   1891: checkcast [B
    //   1894: invokevirtual clone : ()Ljava/lang/Object;
    //   1897: aastore
    //   1898: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1901: checkcast java/lang/Boolean
    //   1904: invokevirtual booleanValue : ()Z
    //   1907: istore_3
    //   1908: iload_2
    //   1909: ifeq -> 1926
    //   1912: iinc #6, 1
    //   1915: iload_2
    //   1916: ifeq -> 1786
    //   1919: goto -> 1926
    //   1922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1925: athrow
    //   1926: iload_3
    //   1927: ifeq -> 1932
    //   1930: iload_3
    //   1931: ireturn
    //   1932: getstatic burp/Ztid.Zz : Ljava/lang/String;
    //   1935: getstatic burp/Zeyt.ZR : Ljava/lang/Object;
    //   1938: checkcast java/math/BigInteger
    //   1941: invokevirtual intValue : ()I
    //   1944: bipush #32
    //   1946: irem
    //   1947: invokestatic abs : (I)I
    //   1950: invokevirtual charAt : (I)C
    //   1953: getstatic burp/Zre1.ZA : Ljava/lang/String;
    //   1956: getstatic burp/Zkku.Zz : Ljava/lang/Object;
    //   1959: checkcast java/math/BigInteger
    //   1962: invokevirtual intValue : ()I
    //   1965: bipush #32
    //   1967: irem
    //   1968: invokestatic abs : (I)I
    //   1971: invokevirtual charAt : (I)C
    //   1974: if_icmpgt -> 2319
    //   1977: sipush #-30647
    //   1980: sipush #-24828
    //   1983: invokestatic a : (II)Ljava/lang/String;
    //   1986: iconst_1
    //   1987: ldc burp/Zlgh
    //   1989: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1992: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1995: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1998: astore #4
    //   2000: aload #4
    //   2002: arraylength
    //   2003: istore #5
    //   2005: iconst_0
    //   2006: istore #6
    //   2008: iload #6
    //   2010: iload #5
    //   2012: if_icmpge -> 2150
    //   2015: aload #4
    //   2017: iload #6
    //   2019: aaload
    //   2020: astore #7
    //   2022: aload #7
    //   2024: invokevirtual getModifiers : ()I
    //   2027: invokestatic isStatic : (I)Z
    //   2030: ifne -> 2040
    //   2033: goto -> 2143
    //   2036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2039: athrow
    //   2040: aload #7
    //   2042: invokevirtual getType : ()Ljava/lang/Class;
    //   2045: astore #8
    //   2047: aload #8
    //   2049: ifnull -> 2130
    //   2052: aload #8
    //   2054: invokevirtual isPrimitive : ()Z
    //   2057: ifne -> 2130
    //   2060: goto -> 2067
    //   2063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2066: athrow
    //   2067: aload #8
    //   2069: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2072: ifnull -> 2130
    //   2075: goto -> 2082
    //   2078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2081: athrow
    //   2082: aload #8
    //   2084: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2087: invokevirtual getName : ()Ljava/lang/String;
    //   2090: ifnull -> 2130
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2099: athrow
    //   2100: aload #8
    //   2102: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2105: invokevirtual getName : ()Ljava/lang/String;
    //   2108: sipush #-30631
    //   2111: sipush #32261
    //   2114: invokestatic a : (II)Ljava/lang/String;
    //   2117: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2120: ifne -> 2130
    //   2123: goto -> 2130
    //   2126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2129: athrow
    //   2130: aload #7
    //   2132: iconst_1
    //   2133: invokevirtual setAccessible : (Z)V
    //   2136: aload #7
    //   2138: aconst_null
    //   2139: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2142: pop
    //   2143: iinc #6, 1
    //   2146: iload_2
    //   2147: ifeq -> 2008
    //   2150: sipush #-30653
    //   2153: sipush #-11071
    //   2156: invokestatic a : (II)Ljava/lang/String;
    //   2159: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2162: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2165: astore #4
    //   2167: aload #4
    //   2169: arraylength
    //   2170: istore #5
    //   2172: iconst_0
    //   2173: istore #6
    //   2175: iload #6
    //   2177: iload #5
    //   2179: if_icmpge -> 2315
    //   2182: aload #4
    //   2184: iload #6
    //   2186: aaload
    //   2187: astore #7
    //   2189: aload #7
    //   2191: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2194: pop
    //   2195: aload #7
    //   2197: invokevirtual getModifiers : ()I
    //   2200: invokestatic isStatic : (I)Z
    //   2203: ifeq -> 2301
    //   2206: aload #7
    //   2208: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2211: arraylength
    //   2212: iconst_2
    //   2213: if_icmpne -> 2301
    //   2216: goto -> 2223
    //   2219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2222: athrow
    //   2223: aload #7
    //   2225: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2228: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2231: if_acmpne -> 2301
    //   2234: goto -> 2241
    //   2237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2240: athrow
    //   2241: aload #7
    //   2243: iconst_1
    //   2244: invokevirtual setAccessible : (Z)V
    //   2247: aload #7
    //   2249: aconst_null
    //   2250: iconst_2
    //   2251: anewarray java/lang/Object
    //   2254: dup
    //   2255: iconst_0
    //   2256: aload_0
    //   2257: aastore
    //   2258: dup
    //   2259: iconst_1
    //   2260: aload_1
    //   2261: ifnonnull -> 2279
    //   2264: goto -> 2271
    //   2267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2270: athrow
    //   2271: aload_1
    //   2272: goto -> 2286
    //   2275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2278: athrow
    //   2279: aload_1
    //   2280: checkcast [B
    //   2283: invokevirtual clone : ()Ljava/lang/Object;
    //   2286: aastore
    //   2287: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2290: checkcast java/lang/Boolean
    //   2293: invokevirtual booleanValue : ()Z
    //   2296: istore_3
    //   2297: iload_2
    //   2298: ifeq -> 2315
    //   2301: iinc #6, 1
    //   2304: iload_2
    //   2305: ifeq -> 2175
    //   2308: goto -> 2315
    //   2311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2314: athrow
    //   2315: iload_2
    //   2316: ifeq -> 2657
    //   2319: sipush #-30650
    //   2322: sipush #4669
    //   2325: invokestatic a : (II)Ljava/lang/String;
    //   2328: iconst_1
    //   2329: ldc burp/Zlem
    //   2331: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2334: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2337: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2340: astore #4
    //   2342: aload #4
    //   2344: arraylength
    //   2345: istore #5
    //   2347: iconst_0
    //   2348: istore #6
    //   2350: iload #6
    //   2352: iload #5
    //   2354: if_icmpge -> 2492
    //   2357: aload #4
    //   2359: iload #6
    //   2361: aaload
    //   2362: astore #7
    //   2364: aload #7
    //   2366: invokevirtual getModifiers : ()I
    //   2369: invokestatic isStatic : (I)Z
    //   2372: ifne -> 2382
    //   2375: goto -> 2485
    //   2378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2381: athrow
    //   2382: aload #7
    //   2384: invokevirtual getType : ()Ljava/lang/Class;
    //   2387: astore #8
    //   2389: aload #8
    //   2391: ifnull -> 2472
    //   2394: aload #8
    //   2396: invokevirtual isPrimitive : ()Z
    //   2399: ifne -> 2472
    //   2402: goto -> 2409
    //   2405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2408: athrow
    //   2409: aload #8
    //   2411: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2414: ifnull -> 2472
    //   2417: goto -> 2424
    //   2420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2423: athrow
    //   2424: aload #8
    //   2426: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2429: invokevirtual getName : ()Ljava/lang/String;
    //   2432: ifnull -> 2472
    //   2435: goto -> 2442
    //   2438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2441: athrow
    //   2442: aload #8
    //   2444: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2447: invokevirtual getName : ()Ljava/lang/String;
    //   2450: sipush #-30631
    //   2453: sipush #32261
    //   2456: invokestatic a : (II)Ljava/lang/String;
    //   2459: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2462: ifne -> 2472
    //   2465: goto -> 2472
    //   2468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2471: athrow
    //   2472: aload #7
    //   2474: iconst_1
    //   2475: invokevirtual setAccessible : (Z)V
    //   2478: aload #7
    //   2480: aconst_null
    //   2481: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2484: pop
    //   2485: iinc #6, 1
    //   2488: iload_2
    //   2489: ifeq -> 2350
    //   2492: sipush #-30643
    //   2495: sipush #16625
    //   2498: invokestatic a : (II)Ljava/lang/String;
    //   2501: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2504: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2507: astore #4
    //   2509: aload #4
    //   2511: arraylength
    //   2512: istore #5
    //   2514: iconst_0
    //   2515: istore #6
    //   2517: iload #6
    //   2519: iload #5
    //   2521: if_icmpge -> 2657
    //   2524: aload #4
    //   2526: iload #6
    //   2528: aaload
    //   2529: astore #7
    //   2531: aload #7
    //   2533: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2536: pop
    //   2537: aload #7
    //   2539: invokevirtual getModifiers : ()I
    //   2542: invokestatic isStatic : (I)Z
    //   2545: ifeq -> 2643
    //   2548: aload #7
    //   2550: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2553: arraylength
    //   2554: iconst_2
    //   2555: if_icmpne -> 2643
    //   2558: goto -> 2565
    //   2561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2564: athrow
    //   2565: aload #7
    //   2567: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2570: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2573: if_acmpne -> 2643
    //   2576: goto -> 2583
    //   2579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2582: athrow
    //   2583: aload #7
    //   2585: iconst_1
    //   2586: invokevirtual setAccessible : (Z)V
    //   2589: aload #7
    //   2591: aconst_null
    //   2592: iconst_2
    //   2593: anewarray java/lang/Object
    //   2596: dup
    //   2597: iconst_0
    //   2598: aload_0
    //   2599: aastore
    //   2600: dup
    //   2601: iconst_1
    //   2602: aload_1
    //   2603: ifnonnull -> 2621
    //   2606: goto -> 2613
    //   2609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2612: athrow
    //   2613: aload_1
    //   2614: goto -> 2628
    //   2617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2620: athrow
    //   2621: aload_1
    //   2622: checkcast [B
    //   2625: invokevirtual clone : ()Ljava/lang/Object;
    //   2628: aastore
    //   2629: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2632: checkcast java/lang/Boolean
    //   2635: invokevirtual booleanValue : ()Z
    //   2638: istore_3
    //   2639: iload_2
    //   2640: ifeq -> 2657
    //   2643: iinc #6, 1
    //   2646: iload_2
    //   2647: ifeq -> 2517
    //   2650: goto -> 2657
    //   2653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2656: athrow
    //   2657: iload_3
    //   2658: ifeq -> 2663
    //   2661: iload_3
    //   2662: ireturn
    //   2663: getstatic burp/Zttj.ZN : Ljava/lang/String;
    //   2666: getstatic burp/Zei_.Za : Ljava/lang/Object;
    //   2669: checkcast java/math/BigInteger
    //   2672: invokevirtual intValue : ()I
    //   2675: bipush #32
    //   2677: irem
    //   2678: invokestatic abs : (I)I
    //   2681: invokevirtual charAt : (I)C
    //   2684: getstatic burp/Zlno.ZM : Ljava/lang/String;
    //   2687: getstatic burp/Zgny.ZR : Ljava/lang/Object;
    //   2690: checkcast java/math/BigInteger
    //   2693: invokevirtual intValue : ()I
    //   2696: bipush #32
    //   2698: irem
    //   2699: invokestatic abs : (I)I
    //   2702: invokevirtual charAt : (I)C
    //   2705: if_icmple -> 3050
    //   2708: sipush #-30646
    //   2711: sipush #-2726
    //   2714: invokestatic a : (II)Ljava/lang/String;
    //   2717: iconst_1
    //   2718: ldc burp/Zkde
    //   2720: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2723: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2726: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2729: astore #4
    //   2731: aload #4
    //   2733: arraylength
    //   2734: istore #5
    //   2736: iconst_0
    //   2737: istore #6
    //   2739: iload #6
    //   2741: iload #5
    //   2743: if_icmpge -> 2881
    //   2746: aload #4
    //   2748: iload #6
    //   2750: aaload
    //   2751: astore #7
    //   2753: aload #7
    //   2755: invokevirtual getModifiers : ()I
    //   2758: invokestatic isStatic : (I)Z
    //   2761: ifne -> 2771
    //   2764: goto -> 2874
    //   2767: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2770: athrow
    //   2771: aload #7
    //   2773: invokevirtual getType : ()Ljava/lang/Class;
    //   2776: astore #8
    //   2778: aload #8
    //   2780: ifnull -> 2861
    //   2783: aload #8
    //   2785: invokevirtual isPrimitive : ()Z
    //   2788: ifne -> 2861
    //   2791: goto -> 2798
    //   2794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2797: athrow
    //   2798: aload #8
    //   2800: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2803: ifnull -> 2861
    //   2806: goto -> 2813
    //   2809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2812: athrow
    //   2813: aload #8
    //   2815: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2818: invokevirtual getName : ()Ljava/lang/String;
    //   2821: ifnull -> 2861
    //   2824: goto -> 2831
    //   2827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2830: athrow
    //   2831: aload #8
    //   2833: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2836: invokevirtual getName : ()Ljava/lang/String;
    //   2839: sipush #-30631
    //   2842: sipush #32261
    //   2845: invokestatic a : (II)Ljava/lang/String;
    //   2848: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2851: ifne -> 2861
    //   2854: goto -> 2861
    //   2857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2860: athrow
    //   2861: aload #7
    //   2863: iconst_1
    //   2864: invokevirtual setAccessible : (Z)V
    //   2867: aload #7
    //   2869: aconst_null
    //   2870: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2873: pop
    //   2874: iinc #6, 1
    //   2877: iload_2
    //   2878: ifeq -> 2739
    //   2881: sipush #-30655
    //   2884: sipush #-10758
    //   2887: invokestatic a : (II)Ljava/lang/String;
    //   2890: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2893: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2896: astore #4
    //   2898: aload #4
    //   2900: arraylength
    //   2901: istore #5
    //   2903: iconst_0
    //   2904: istore #6
    //   2906: iload #6
    //   2908: iload #5
    //   2910: if_icmpge -> 3046
    //   2913: aload #4
    //   2915: iload #6
    //   2917: aaload
    //   2918: astore #7
    //   2920: aload #7
    //   2922: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2925: pop
    //   2926: aload #7
    //   2928: invokevirtual getModifiers : ()I
    //   2931: invokestatic isStatic : (I)Z
    //   2934: ifeq -> 3032
    //   2937: aload #7
    //   2939: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2942: arraylength
    //   2943: iconst_2
    //   2944: if_icmpne -> 3032
    //   2947: goto -> 2954
    //   2950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2953: athrow
    //   2954: aload #7
    //   2956: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2959: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2962: if_acmpne -> 3032
    //   2965: goto -> 2972
    //   2968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2971: athrow
    //   2972: aload #7
    //   2974: iconst_1
    //   2975: invokevirtual setAccessible : (Z)V
    //   2978: aload #7
    //   2980: aconst_null
    //   2981: iconst_2
    //   2982: anewarray java/lang/Object
    //   2985: dup
    //   2986: iconst_0
    //   2987: aload_0
    //   2988: aastore
    //   2989: dup
    //   2990: iconst_1
    //   2991: aload_1
    //   2992: ifnonnull -> 3010
    //   2995: goto -> 3002
    //   2998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3001: athrow
    //   3002: aload_1
    //   3003: goto -> 3017
    //   3006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3009: athrow
    //   3010: aload_1
    //   3011: checkcast [B
    //   3014: invokevirtual clone : ()Ljava/lang/Object;
    //   3017: aastore
    //   3018: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3021: checkcast java/lang/Boolean
    //   3024: invokevirtual booleanValue : ()Z
    //   3027: istore_3
    //   3028: iload_2
    //   3029: ifeq -> 3046
    //   3032: iinc #6, 1
    //   3035: iload_2
    //   3036: ifeq -> 2906
    //   3039: goto -> 3046
    //   3042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3045: athrow
    //   3046: iload_2
    //   3047: ifeq -> 3388
    //   3050: sipush #-30625
    //   3053: sipush #14832
    //   3056: invokestatic a : (II)Ljava/lang/String;
    //   3059: iconst_1
    //   3060: ldc burp/Zzy5
    //   3062: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3065: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3068: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3071: astore #4
    //   3073: aload #4
    //   3075: arraylength
    //   3076: istore #5
    //   3078: iconst_0
    //   3079: istore #6
    //   3081: iload #6
    //   3083: iload #5
    //   3085: if_icmpge -> 3223
    //   3088: aload #4
    //   3090: iload #6
    //   3092: aaload
    //   3093: astore #7
    //   3095: aload #7
    //   3097: invokevirtual getModifiers : ()I
    //   3100: invokestatic isStatic : (I)Z
    //   3103: ifne -> 3113
    //   3106: goto -> 3216
    //   3109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3112: athrow
    //   3113: aload #7
    //   3115: invokevirtual getType : ()Ljava/lang/Class;
    //   3118: astore #8
    //   3120: aload #8
    //   3122: ifnull -> 3203
    //   3125: aload #8
    //   3127: invokevirtual isPrimitive : ()Z
    //   3130: ifne -> 3203
    //   3133: goto -> 3140
    //   3136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3139: athrow
    //   3140: aload #8
    //   3142: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3145: ifnull -> 3203
    //   3148: goto -> 3155
    //   3151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3154: athrow
    //   3155: aload #8
    //   3157: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3160: invokevirtual getName : ()Ljava/lang/String;
    //   3163: ifnull -> 3203
    //   3166: goto -> 3173
    //   3169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3172: athrow
    //   3173: aload #8
    //   3175: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3178: invokevirtual getName : ()Ljava/lang/String;
    //   3181: sipush #-30631
    //   3184: sipush #32261
    //   3187: invokestatic a : (II)Ljava/lang/String;
    //   3190: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3193: ifne -> 3203
    //   3196: goto -> 3203
    //   3199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3202: athrow
    //   3203: aload #7
    //   3205: iconst_1
    //   3206: invokevirtual setAccessible : (Z)V
    //   3209: aload #7
    //   3211: aconst_null
    //   3212: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3215: pop
    //   3216: iinc #6, 1
    //   3219: iload_2
    //   3220: ifeq -> 3081
    //   3223: sipush #-30644
    //   3226: sipush #-12847
    //   3229: invokestatic a : (II)Ljava/lang/String;
    //   3232: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3235: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3238: astore #4
    //   3240: aload #4
    //   3242: arraylength
    //   3243: istore #5
    //   3245: iconst_0
    //   3246: istore #6
    //   3248: iload #6
    //   3250: iload #5
    //   3252: if_icmpge -> 3388
    //   3255: aload #4
    //   3257: iload #6
    //   3259: aaload
    //   3260: astore #7
    //   3262: aload #7
    //   3264: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3267: pop
    //   3268: aload #7
    //   3270: invokevirtual getModifiers : ()I
    //   3273: invokestatic isStatic : (I)Z
    //   3276: ifeq -> 3374
    //   3279: aload #7
    //   3281: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3284: arraylength
    //   3285: iconst_2
    //   3286: if_icmpne -> 3374
    //   3289: goto -> 3296
    //   3292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3295: athrow
    //   3296: aload #7
    //   3298: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3301: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3304: if_acmpne -> 3374
    //   3307: goto -> 3314
    //   3310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3313: athrow
    //   3314: aload #7
    //   3316: iconst_1
    //   3317: invokevirtual setAccessible : (Z)V
    //   3320: aload #7
    //   3322: aconst_null
    //   3323: iconst_2
    //   3324: anewarray java/lang/Object
    //   3327: dup
    //   3328: iconst_0
    //   3329: aload_0
    //   3330: aastore
    //   3331: dup
    //   3332: iconst_1
    //   3333: aload_1
    //   3334: ifnonnull -> 3352
    //   3337: goto -> 3344
    //   3340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3343: athrow
    //   3344: aload_1
    //   3345: goto -> 3359
    //   3348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3351: athrow
    //   3352: aload_1
    //   3353: checkcast [B
    //   3356: invokevirtual clone : ()Ljava/lang/Object;
    //   3359: aastore
    //   3360: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3363: checkcast java/lang/Boolean
    //   3366: invokevirtual booleanValue : ()Z
    //   3369: istore_3
    //   3370: iload_2
    //   3371: ifeq -> 3388
    //   3374: iinc #6, 1
    //   3377: iload_2
    //   3378: ifeq -> 3248
    //   3381: goto -> 3388
    //   3384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3387: athrow
    //   3388: iload_3
    //   3389: ifeq -> 3394
    //   3392: iload_3
    //   3393: ireturn
    //   3394: getstatic burp/Zre1.ZA : Ljava/lang/String;
    //   3397: getstatic burp/Zs_.Zs : Ljava/lang/Object;
    //   3400: checkcast java/math/BigInteger
    //   3403: invokevirtual intValue : ()I
    //   3406: bipush #32
    //   3408: irem
    //   3409: invokestatic abs : (I)I
    //   3412: invokevirtual charAt : (I)C
    //   3415: getstatic burp/Zl_1.ZH : Ljava/lang/String;
    //   3418: getstatic burp/Zmhx.ZQ : Ljava/lang/Object;
    //   3421: checkcast java/math/BigInteger
    //   3424: invokevirtual intValue : ()I
    //   3427: bipush #32
    //   3429: irem
    //   3430: invokestatic abs : (I)I
    //   3433: invokevirtual charAt : (I)C
    //   3436: if_icmple -> 3781
    //   3439: sipush #-30641
    //   3442: sipush #12789
    //   3445: invokestatic a : (II)Ljava/lang/String;
    //   3448: iconst_1
    //   3449: ldc burp/Zlnq
    //   3451: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3454: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3457: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3460: astore #4
    //   3462: aload #4
    //   3464: arraylength
    //   3465: istore #5
    //   3467: iconst_0
    //   3468: istore #6
    //   3470: iload #6
    //   3472: iload #5
    //   3474: if_icmpge -> 3612
    //   3477: aload #4
    //   3479: iload #6
    //   3481: aaload
    //   3482: astore #7
    //   3484: aload #7
    //   3486: invokevirtual getModifiers : ()I
    //   3489: invokestatic isStatic : (I)Z
    //   3492: ifne -> 3502
    //   3495: goto -> 3605
    //   3498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3501: athrow
    //   3502: aload #7
    //   3504: invokevirtual getType : ()Ljava/lang/Class;
    //   3507: astore #8
    //   3509: aload #8
    //   3511: ifnull -> 3592
    //   3514: aload #8
    //   3516: invokevirtual isPrimitive : ()Z
    //   3519: ifne -> 3592
    //   3522: goto -> 3529
    //   3525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3528: athrow
    //   3529: aload #8
    //   3531: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3534: ifnull -> 3592
    //   3537: goto -> 3544
    //   3540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3543: athrow
    //   3544: aload #8
    //   3546: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3549: invokevirtual getName : ()Ljava/lang/String;
    //   3552: ifnull -> 3592
    //   3555: goto -> 3562
    //   3558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3561: athrow
    //   3562: aload #8
    //   3564: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3567: invokevirtual getName : ()Ljava/lang/String;
    //   3570: sipush #-30631
    //   3573: sipush #32261
    //   3576: invokestatic a : (II)Ljava/lang/String;
    //   3579: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3582: ifne -> 3592
    //   3585: goto -> 3592
    //   3588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3591: athrow
    //   3592: aload #7
    //   3594: iconst_1
    //   3595: invokevirtual setAccessible : (Z)V
    //   3598: aload #7
    //   3600: aconst_null
    //   3601: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3604: pop
    //   3605: iinc #6, 1
    //   3608: iload_2
    //   3609: ifeq -> 3470
    //   3612: sipush #-30627
    //   3615: sipush #-28512
    //   3618: invokestatic a : (II)Ljava/lang/String;
    //   3621: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3624: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3627: astore #4
    //   3629: aload #4
    //   3631: arraylength
    //   3632: istore #5
    //   3634: iconst_0
    //   3635: istore #6
    //   3637: iload #6
    //   3639: iload #5
    //   3641: if_icmpge -> 3777
    //   3644: aload #4
    //   3646: iload #6
    //   3648: aaload
    //   3649: astore #7
    //   3651: aload #7
    //   3653: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3656: pop
    //   3657: aload #7
    //   3659: invokevirtual getModifiers : ()I
    //   3662: invokestatic isStatic : (I)Z
    //   3665: ifeq -> 3763
    //   3668: aload #7
    //   3670: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3673: arraylength
    //   3674: iconst_2
    //   3675: if_icmpne -> 3763
    //   3678: goto -> 3685
    //   3681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3684: athrow
    //   3685: aload #7
    //   3687: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3690: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3693: if_acmpne -> 3763
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3702: athrow
    //   3703: aload #7
    //   3705: iconst_1
    //   3706: invokevirtual setAccessible : (Z)V
    //   3709: aload #7
    //   3711: aconst_null
    //   3712: iconst_2
    //   3713: anewarray java/lang/Object
    //   3716: dup
    //   3717: iconst_0
    //   3718: aload_0
    //   3719: aastore
    //   3720: dup
    //   3721: iconst_1
    //   3722: aload_1
    //   3723: ifnonnull -> 3741
    //   3726: goto -> 3733
    //   3729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3732: athrow
    //   3733: aload_1
    //   3734: goto -> 3748
    //   3737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3740: athrow
    //   3741: aload_1
    //   3742: checkcast [B
    //   3745: invokevirtual clone : ()Ljava/lang/Object;
    //   3748: aastore
    //   3749: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3752: checkcast java/lang/Boolean
    //   3755: invokevirtual booleanValue : ()Z
    //   3758: istore_3
    //   3759: iload_2
    //   3760: ifeq -> 3777
    //   3763: iinc #6, 1
    //   3766: iload_2
    //   3767: ifeq -> 3637
    //   3770: goto -> 3777
    //   3773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3776: athrow
    //   3777: iload_2
    //   3778: ifeq -> 4119
    //   3781: sipush #-30642
    //   3784: sipush #-1895
    //   3787: invokestatic a : (II)Ljava/lang/String;
    //   3790: iconst_1
    //   3791: ldc burp/Zva
    //   3793: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3796: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3799: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3802: astore #4
    //   3804: aload #4
    //   3806: arraylength
    //   3807: istore #5
    //   3809: iconst_0
    //   3810: istore #6
    //   3812: iload #6
    //   3814: iload #5
    //   3816: if_icmpge -> 3954
    //   3819: aload #4
    //   3821: iload #6
    //   3823: aaload
    //   3824: astore #7
    //   3826: aload #7
    //   3828: invokevirtual getModifiers : ()I
    //   3831: invokestatic isStatic : (I)Z
    //   3834: ifne -> 3844
    //   3837: goto -> 3947
    //   3840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3843: athrow
    //   3844: aload #7
    //   3846: invokevirtual getType : ()Ljava/lang/Class;
    //   3849: astore #8
    //   3851: aload #8
    //   3853: ifnull -> 3934
    //   3856: aload #8
    //   3858: invokevirtual isPrimitive : ()Z
    //   3861: ifne -> 3934
    //   3864: goto -> 3871
    //   3867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3870: athrow
    //   3871: aload #8
    //   3873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3876: ifnull -> 3934
    //   3879: goto -> 3886
    //   3882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3885: athrow
    //   3886: aload #8
    //   3888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3891: invokevirtual getName : ()Ljava/lang/String;
    //   3894: ifnull -> 3934
    //   3897: goto -> 3904
    //   3900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3903: athrow
    //   3904: aload #8
    //   3906: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3909: invokevirtual getName : ()Ljava/lang/String;
    //   3912: sipush #-30631
    //   3915: sipush #32261
    //   3918: invokestatic a : (II)Ljava/lang/String;
    //   3921: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3924: ifne -> 3934
    //   3927: goto -> 3934
    //   3930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3933: athrow
    //   3934: aload #7
    //   3936: iconst_1
    //   3937: invokevirtual setAccessible : (Z)V
    //   3940: aload #7
    //   3942: aconst_null
    //   3943: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3946: pop
    //   3947: iinc #6, 1
    //   3950: iload_2
    //   3951: ifeq -> 3812
    //   3954: sipush #-30645
    //   3957: sipush #29136
    //   3960: invokestatic a : (II)Ljava/lang/String;
    //   3963: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3966: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3969: astore #4
    //   3971: aload #4
    //   3973: arraylength
    //   3974: istore #5
    //   3976: iconst_0
    //   3977: istore #6
    //   3979: iload #6
    //   3981: iload #5
    //   3983: if_icmpge -> 4119
    //   3986: aload #4
    //   3988: iload #6
    //   3990: aaload
    //   3991: astore #7
    //   3993: aload #7
    //   3995: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3998: pop
    //   3999: aload #7
    //   4001: invokevirtual getModifiers : ()I
    //   4004: invokestatic isStatic : (I)Z
    //   4007: ifeq -> 4105
    //   4010: aload #7
    //   4012: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4015: arraylength
    //   4016: iconst_2
    //   4017: if_icmpne -> 4105
    //   4020: goto -> 4027
    //   4023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4026: athrow
    //   4027: aload #7
    //   4029: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4032: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4035: if_acmpne -> 4105
    //   4038: goto -> 4045
    //   4041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4044: athrow
    //   4045: aload #7
    //   4047: iconst_1
    //   4048: invokevirtual setAccessible : (Z)V
    //   4051: aload #7
    //   4053: aconst_null
    //   4054: iconst_2
    //   4055: anewarray java/lang/Object
    //   4058: dup
    //   4059: iconst_0
    //   4060: aload_0
    //   4061: aastore
    //   4062: dup
    //   4063: iconst_1
    //   4064: aload_1
    //   4065: ifnonnull -> 4083
    //   4068: goto -> 4075
    //   4071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4074: athrow
    //   4075: aload_1
    //   4076: goto -> 4090
    //   4079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4082: athrow
    //   4083: aload_1
    //   4084: checkcast [B
    //   4087: invokevirtual clone : ()Ljava/lang/Object;
    //   4090: aastore
    //   4091: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4094: checkcast java/lang/Boolean
    //   4097: invokevirtual booleanValue : ()Z
    //   4100: istore_3
    //   4101: iload_2
    //   4102: ifeq -> 4119
    //   4105: iinc #6, 1
    //   4108: iload_2
    //   4109: ifeq -> 3979
    //   4112: goto -> 4119
    //   4115: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4118: athrow
    //   4119: iload_3
    //   4120: ireturn
    //   4121: astore_3
    //   4122: new java/lang/Exception
    //   4125: dup
    //   4126: aload_3
    //   4127: invokevirtual getMessage : ()Ljava/lang/String;
    //   4130: invokespecial <init> : (Ljava/lang/String;)V
    //   4133: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1931	4121	java/lang/Throwable
    //   33	47	50	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   54	75	78	java/lang/Throwable
    //   68	89	92	java/lang/Throwable
    //   82	103	106	java/lang/Throwable
    //   96	117	120	java/lang/Throwable
    //   110	131	134	java/lang/Throwable
    //   124	145	148	java/lang/Throwable
    //   138	155	158	java/lang/Throwable
    //   194	208	211	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   215	236	239	java/lang/Throwable
    //   229	250	253	java/lang/Throwable
    //   243	264	267	java/lang/Throwable
    //   257	278	281	java/lang/Throwable
    //   271	292	295	java/lang/Throwable
    //   285	306	309	java/lang/Throwable
    //   299	323	326	java/lang/Throwable
    //   387	405	408	java/lang/Throwable
    //   396	421	424	java/lang/Throwable
    //   412	438	441	java/lang/Throwable
    //   428	454	457	java/lang/Throwable
    //   445	471	474	java/lang/Throwable
    //   461	487	490	java/lang/Throwable
    //   478	503	506	java/lang/Throwable
    //   494	526	529	java/lang/Throwable
    //   510	542	545	java/lang/Throwable
    //   533	558	561	java/lang/Throwable
    //   549	581	584	java/lang/Throwable
    //   565	597	600	java/lang/Throwable
    //   588	613	616	java/lang/Throwable
    //   604	632	635	java/lang/Throwable
    //   762	797	800	java/lang/Throwable
    //   804	845	848	java/lang/Throwable
    //   913	927	927	java/lang/Throwable
    //   938	951	954	java/lang/Throwable
    //   943	966	969	java/lang/Throwable
    //   958	984	987	java/lang/Throwable
    //   973	1014	1017	java/lang/Throwable
    //   1077	1104	1107	java/lang/Throwable
    //   1094	1125	1128	java/lang/Throwable
    //   1111	1155	1158	java/lang/Throwable
    //   1132	1166	1166	java/lang/Throwable
    //   1177	1193	1196	java/lang/Throwable
    //   1292	1306	1306	java/lang/Throwable
    //   1317	1330	1333	java/lang/Throwable
    //   1322	1345	1348	java/lang/Throwable
    //   1337	1363	1366	java/lang/Throwable
    //   1352	1393	1396	java/lang/Throwable
    //   1459	1486	1489	java/lang/Throwable
    //   1476	1504	1507	java/lang/Throwable
    //   1493	1534	1537	java/lang/Throwable
    //   1511	1545	1545	java/lang/Throwable
    //   1567	1578	1581	java/lang/Throwable
    //   1633	1647	1647	java/lang/Throwable
    //   1658	1671	1674	java/lang/Throwable
    //   1663	1686	1689	java/lang/Throwable
    //   1678	1704	1707	java/lang/Throwable
    //   1693	1734	1737	java/lang/Throwable
    //   1800	1827	1830	java/lang/Throwable
    //   1817	1845	1848	java/lang/Throwable
    //   1834	1875	1878	java/lang/Throwable
    //   1852	1886	1886	java/lang/Throwable
    //   1908	1919	1922	java/lang/Throwable
    //   1932	2662	4121	java/lang/Throwable
    //   2022	2036	2036	java/lang/Throwable
    //   2047	2060	2063	java/lang/Throwable
    //   2052	2075	2078	java/lang/Throwable
    //   2067	2093	2096	java/lang/Throwable
    //   2082	2123	2126	java/lang/Throwable
    //   2189	2216	2219	java/lang/Throwable
    //   2206	2234	2237	java/lang/Throwable
    //   2223	2264	2267	java/lang/Throwable
    //   2241	2275	2275	java/lang/Throwable
    //   2297	2308	2311	java/lang/Throwable
    //   2364	2378	2378	java/lang/Throwable
    //   2389	2402	2405	java/lang/Throwable
    //   2394	2417	2420	java/lang/Throwable
    //   2409	2435	2438	java/lang/Throwable
    //   2424	2465	2468	java/lang/Throwable
    //   2531	2558	2561	java/lang/Throwable
    //   2548	2576	2579	java/lang/Throwable
    //   2565	2606	2609	java/lang/Throwable
    //   2583	2617	2617	java/lang/Throwable
    //   2639	2650	2653	java/lang/Throwable
    //   2663	3393	4121	java/lang/Throwable
    //   2753	2767	2767	java/lang/Throwable
    //   2778	2791	2794	java/lang/Throwable
    //   2783	2806	2809	java/lang/Throwable
    //   2798	2824	2827	java/lang/Throwable
    //   2813	2854	2857	java/lang/Throwable
    //   2920	2947	2950	java/lang/Throwable
    //   2937	2965	2968	java/lang/Throwable
    //   2954	2995	2998	java/lang/Throwable
    //   2972	3006	3006	java/lang/Throwable
    //   3028	3039	3042	java/lang/Throwable
    //   3095	3109	3109	java/lang/Throwable
    //   3120	3133	3136	java/lang/Throwable
    //   3125	3148	3151	java/lang/Throwable
    //   3140	3166	3169	java/lang/Throwable
    //   3155	3196	3199	java/lang/Throwable
    //   3262	3289	3292	java/lang/Throwable
    //   3279	3307	3310	java/lang/Throwable
    //   3296	3337	3340	java/lang/Throwable
    //   3314	3348	3348	java/lang/Throwable
    //   3370	3381	3384	java/lang/Throwable
    //   3394	4120	4121	java/lang/Throwable
    //   3484	3498	3498	java/lang/Throwable
    //   3509	3522	3525	java/lang/Throwable
    //   3514	3537	3540	java/lang/Throwable
    //   3529	3555	3558	java/lang/Throwable
    //   3544	3585	3588	java/lang/Throwable
    //   3651	3678	3681	java/lang/Throwable
    //   3668	3696	3699	java/lang/Throwable
    //   3685	3726	3729	java/lang/Throwable
    //   3703	3737	3737	java/lang/Throwable
    //   3759	3770	3773	java/lang/Throwable
    //   3826	3840	3840	java/lang/Throwable
    //   3851	3864	3867	java/lang/Throwable
    //   3856	3879	3882	java/lang/Throwable
    //   3871	3897	3900	java/lang/Throwable
    //   3886	3927	3930	java/lang/Throwable
    //   3993	4020	4023	java/lang/Throwable
    //   4010	4038	4041	java/lang/Throwable
    //   4027	4068	4071	java/lang/Throwable
    //   4045	4079	4079	java/lang/Throwable
    //   4101	4112	4115	java/lang/Throwable
  }
  
  static void ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZP(Object paramObject) {
    Zead.Zo = a(-30630, -20785);
    Zead.ZI = new BigInteger(a(-30656, 26641));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zs33.ZX.charAt(Math.abs(((BigInteger)Zg97.Zc).intValue() % 32)) > Zewo.ZM.charAt(Math.abs(((BigInteger)Zk7w.ZF).intValue() % 32))) {
          try {
            Zrvb.ZH(Class.forName(a(-30649, -11471)));
            if (bool)
              Zkk2.ZP(Class.forName(a(-30634, 12031))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkk2.ZP(Class.forName(a(-30634, 12031)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'êx>iäÐÓv\\tó÷¹¾\\t¡±R·=(¬\\t\>è¡>ÉMÌI\\tà7?k½E\\tTCwê'èS\\t´ ð'ãd¢/\\th`njî°Wã\\n\\t4yåIÔFÒ\\t×fª¨Çú\\tøB|.¬8Õ\\b\\teÏ÷ÚÐü×\\tQuIÈ\\näÁMQRYTÒoj&QUÙ4+¢Y}ë8á/½}`6!}XÆ;ÕPc_ÝHo^Rs8ou_¤ZM½Õl·.bõY¨ÅÆå©\\tZ´(ð&ãH¢!\\tþÄ¼þ´"f\\tä`ú/¢nS\\tTåéÚ¦VO\\tæÅ¿ÞÔ&Ö æîëjgïÈ"ïV¡^n¢0úB»ËJãwº¬Ñ Gmu¹)U³hk¡3Õú*0¼©õåÉzsã\\t°um:1'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #11
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
    //   68: ldc '¾-}\\tãáÃjAÜô'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #124
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
    //   128: putstatic burp/Zoa.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zoa.b : [Ljava/lang/String;
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
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #22
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #31
    //   239: goto -> 244
    //   242: bipush #94
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
    //   300: sipush #-30629
    //   303: sipush #-25129
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zoa.ZF : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #37
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #106
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-53
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-39
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-90
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #121
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-64
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #89
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #87
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #79
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #110
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #120
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-121
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-30
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #117
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #123
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-69
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #103
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-73
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #122
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #102
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-101
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-40
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-15
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #48
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #27
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-5
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-78
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #40
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-96
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-98
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #53
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF884E) & 0xFFFF;
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
      char c = '¸';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zoa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */