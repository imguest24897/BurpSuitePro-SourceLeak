package burp;

import java.math.BigInteger;

class Zx58 extends ClassLoader {
  static Object ZE;
  
  static String Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ztvp.Zy : Ljava/lang/Object;
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
    //   856: sipush #-13488
    //   859: new java/math/BigInteger
    //   862: dup
    //   863: aload #4
    //   865: invokespecial <init> : ([B)V
    //   868: invokevirtual abs : ()Ljava/math/BigInteger;
    //   871: putstatic burp/Ztvp.Zy : Ljava/lang/Object;
    //   874: sipush #5652
    //   877: invokestatic a : (II)Ljava/lang/String;
    //   880: iconst_1
    //   881: ldc burp/Zefm
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
    //   999: sipush #-13491
    //   1002: sipush #-30484
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
    //   1041: sipush #-13504
    //   1044: sipush #-18712
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
    //   1068: if_icmpge -> 1179
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
    //   1091: ifeq -> 1165
    //   1094: aload #6
    //   1096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1099: arraylength
    //   1100: iconst_2
    //   1101: if_icmpne -> 1165
    //   1104: goto -> 1111
    //   1107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1110: athrow
    //   1111: aload #6
    //   1113: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1116: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1119: if_acmpne -> 1165
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #6
    //   1131: iconst_1
    //   1132: invokevirtual setAccessible : (Z)V
    //   1135: aload #6
    //   1137: aconst_null
    //   1138: iconst_2
    //   1139: anewarray java/lang/Object
    //   1142: dup
    //   1143: iconst_0
    //   1144: aload_0
    //   1145: aastore
    //   1146: dup
    //   1147: iconst_1
    //   1148: aload_1
    //   1149: aastore
    //   1150: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1153: pop
    //   1154: iload_2
    //   1155: ifeq -> 1179
    //   1158: goto -> 1165
    //   1161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1164: athrow
    //   1165: iinc #5, 1
    //   1168: iload_2
    //   1169: ifeq -> 1064
    //   1172: goto -> 1179
    //   1175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1178: athrow
    //   1179: sipush #-13489
    //   1182: sipush #15870
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: iconst_1
    //   1189: ldc burp/Zf
    //   1191: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1194: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1197: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1200: astore_3
    //   1201: aload_3
    //   1202: arraylength
    //   1203: istore #4
    //   1205: iconst_0
    //   1206: istore #5
    //   1208: iload #5
    //   1210: iload #4
    //   1212: if_icmpge -> 1349
    //   1215: aload_3
    //   1216: iload #5
    //   1218: aaload
    //   1219: astore #6
    //   1221: aload #6
    //   1223: invokevirtual getModifiers : ()I
    //   1226: invokestatic isStatic : (I)Z
    //   1229: ifne -> 1239
    //   1232: goto -> 1342
    //   1235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1238: athrow
    //   1239: aload #6
    //   1241: invokevirtual getType : ()Ljava/lang/Class;
    //   1244: astore #7
    //   1246: aload #7
    //   1248: ifnull -> 1329
    //   1251: aload #7
    //   1253: invokevirtual isPrimitive : ()Z
    //   1256: ifne -> 1329
    //   1259: goto -> 1266
    //   1262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1265: athrow
    //   1266: aload #7
    //   1268: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1271: ifnull -> 1329
    //   1274: goto -> 1281
    //   1277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1280: athrow
    //   1281: aload #7
    //   1283: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1286: invokevirtual getName : ()Ljava/lang/String;
    //   1289: ifnull -> 1329
    //   1292: goto -> 1299
    //   1295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1298: athrow
    //   1299: aload #7
    //   1301: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1304: invokevirtual getName : ()Ljava/lang/String;
    //   1307: sipush #-13490
    //   1310: sipush #-4959
    //   1313: invokestatic a : (II)Ljava/lang/String;
    //   1316: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1319: ifne -> 1329
    //   1322: goto -> 1329
    //   1325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1328: athrow
    //   1329: aload #6
    //   1331: iconst_1
    //   1332: invokevirtual setAccessible : (Z)V
    //   1335: aload #6
    //   1337: aconst_null
    //   1338: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1341: pop
    //   1342: iinc #5, 1
    //   1345: iload_2
    //   1346: ifeq -> 1208
    //   1349: sipush #-13494
    //   1352: sipush #-32602
    //   1355: invokestatic a : (II)Ljava/lang/String;
    //   1358: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1361: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1364: astore_3
    //   1365: aload_3
    //   1366: arraylength
    //   1367: istore #4
    //   1369: iconst_0
    //   1370: istore #5
    //   1372: iload #5
    //   1374: iload #4
    //   1376: if_icmpge -> 1508
    //   1379: aload_3
    //   1380: iload #5
    //   1382: aaload
    //   1383: astore #6
    //   1385: aload #6
    //   1387: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1390: pop
    //   1391: aload #6
    //   1393: invokevirtual getModifiers : ()I
    //   1396: invokestatic isStatic : (I)Z
    //   1399: ifeq -> 1494
    //   1402: aload #6
    //   1404: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1407: arraylength
    //   1408: iconst_2
    //   1409: if_icmpne -> 1494
    //   1412: goto -> 1419
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: aload #6
    //   1421: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1424: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1427: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1430: ifeq -> 1494
    //   1433: goto -> 1440
    //   1436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1439: athrow
    //   1440: aload #6
    //   1442: iconst_1
    //   1443: invokevirtual setAccessible : (Z)V
    //   1446: aload #6
    //   1448: aconst_null
    //   1449: iconst_2
    //   1450: anewarray java/lang/Object
    //   1453: dup
    //   1454: iconst_0
    //   1455: aload_0
    //   1456: aastore
    //   1457: dup
    //   1458: iconst_1
    //   1459: aload_1
    //   1460: ifnonnull -> 1478
    //   1463: goto -> 1470
    //   1466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1469: athrow
    //   1470: aload_1
    //   1471: goto -> 1485
    //   1474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1477: athrow
    //   1478: aload_1
    //   1479: checkcast [B
    //   1482: invokevirtual clone : ()Ljava/lang/Object;
    //   1485: aastore
    //   1486: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1489: pop
    //   1490: iload_2
    //   1491: ifeq -> 1508
    //   1494: iinc #5, 1
    //   1497: iload_2
    //   1498: ifeq -> 1372
    //   1501: goto -> 1508
    //   1504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1507: athrow
    //   1508: getstatic burp/Ze08.ZJ : Ljava/lang/Object;
    //   1511: checkcast java/math/BigInteger
    //   1514: invokevirtual toByteArray : ()[B
    //   1517: astore_3
    //   1518: new java/lang/StringBuilder
    //   1521: dup
    //   1522: invokespecial <init> : ()V
    //   1525: astore #5
    //   1527: aload #5
    //   1529: sipush #-13485
    //   1532: sipush #17236
    //   1535: invokestatic a : (II)Ljava/lang/String;
    //   1538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1541: pop
    //   1542: aload_3
    //   1543: astore #6
    //   1545: aload #6
    //   1547: arraylength
    //   1548: istore #7
    //   1550: iconst_0
    //   1551: istore #8
    //   1553: iload #8
    //   1555: iload #7
    //   1557: if_icmpge -> 1583
    //   1560: aload #6
    //   1562: iload #8
    //   1564: baload
    //   1565: istore #9
    //   1567: aload #5
    //   1569: iload #9
    //   1571: i2c
    //   1572: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1575: pop
    //   1576: iinc #8, 1
    //   1579: iload_2
    //   1580: ifeq -> 1553
    //   1583: aload #5
    //   1585: sipush #-13502
    //   1588: sipush #-17690
    //   1591: invokestatic a : (II)Ljava/lang/String;
    //   1594: ldc ''
    //   1596: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1599: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1602: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1605: pop
    //   1606: aload #5
    //   1608: sipush #-13496
    //   1611: sipush #13939
    //   1614: invokestatic a : (II)Ljava/lang/String;
    //   1617: ldc ''
    //   1619: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1622: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1625: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1628: pop
    //   1629: aload #5
    //   1631: invokevirtual toString : ()Ljava/lang/String;
    //   1634: invokevirtual getBytes : ()[B
    //   1637: astore #4
    //   1639: aload #4
    //   1641: astore_3
    //   1642: aload_3
    //   1643: arraylength
    //   1644: bipush #8
    //   1646: iadd
    //   1647: bipush #6
    //   1649: ishr
    //   1650: iconst_1
    //   1651: iadd
    //   1652: bipush #16
    //   1654: imul
    //   1655: newarray int
    //   1657: astore #5
    //   1659: iconst_0
    //   1660: istore #6
    //   1662: iload #6
    //   1664: aload_3
    //   1665: arraylength
    //   1666: if_icmpge -> 1709
    //   1669: aload_3
    //   1670: iload #6
    //   1672: baload
    //   1673: sipush #255
    //   1676: iand
    //   1677: istore #7
    //   1679: aload #5
    //   1681: iload #6
    //   1683: iconst_2
    //   1684: ishr
    //   1685: dup2
    //   1686: iaload
    //   1687: iload #7
    //   1689: bipush #24
    //   1691: iload #6
    //   1693: iconst_4
    //   1694: irem
    //   1695: bipush #8
    //   1697: imul
    //   1698: isub
    //   1699: ishl
    //   1700: ior
    //   1701: iastore
    //   1702: iinc #6, 1
    //   1705: iload_2
    //   1706: ifeq -> 1662
    //   1709: aload #5
    //   1711: iload #6
    //   1713: iconst_2
    //   1714: ishr
    //   1715: dup2
    //   1716: iaload
    //   1717: sipush #128
    //   1720: bipush #24
    //   1722: iload #6
    //   1724: iconst_4
    //   1725: irem
    //   1726: bipush #8
    //   1728: imul
    //   1729: isub
    //   1730: ishl
    //   1731: ior
    //   1732: iastore
    //   1733: aload #5
    //   1735: aload #5
    //   1737: arraylength
    //   1738: iconst_1
    //   1739: isub
    //   1740: aload_3
    //   1741: arraylength
    //   1742: bipush #8
    //   1744: imul
    //   1745: iastore
    //   1746: bipush #80
    //   1748: newarray int
    //   1750: astore #7
    //   1752: ldc 1732584193
    //   1754: istore #8
    //   1756: ldc -271733879
    //   1758: istore #9
    //   1760: ldc -1732584194
    //   1762: istore #10
    //   1764: ldc 271733878
    //   1766: istore #11
    //   1768: ldc -1009589776
    //   1770: istore #12
    //   1772: iconst_0
    //   1773: istore #6
    //   1775: iload #6
    //   1777: aload #5
    //   1779: arraylength
    //   1780: if_icmpge -> 2102
    //   1783: iload #8
    //   1785: istore #13
    //   1787: iload #9
    //   1789: istore #14
    //   1791: iload #10
    //   1793: istore #15
    //   1795: iload #11
    //   1797: istore #16
    //   1799: iload #12
    //   1801: istore #17
    //   1803: iconst_0
    //   1804: istore #18
    //   1806: iload #18
    //   1808: bipush #80
    //   1810: if_icmpge -> 2060
    //   1813: iload #18
    //   1815: bipush #16
    //   1817: if_icmpge -> 1844
    //   1820: aload #7
    //   1822: iload #18
    //   1824: aload #5
    //   1826: iload #6
    //   1828: iload #18
    //   1830: iadd
    //   1831: iaload
    //   1832: iastore
    //   1833: iload_2
    //   1834: ifeq -> 1899
    //   1837: goto -> 1844
    //   1840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1843: athrow
    //   1844: aload #7
    //   1846: iload #18
    //   1848: iconst_3
    //   1849: isub
    //   1850: iaload
    //   1851: aload #7
    //   1853: iload #18
    //   1855: bipush #8
    //   1857: isub
    //   1858: iaload
    //   1859: ixor
    //   1860: aload #7
    //   1862: iload #18
    //   1864: bipush #14
    //   1866: isub
    //   1867: iaload
    //   1868: ixor
    //   1869: aload #7
    //   1871: iload #18
    //   1873: bipush #16
    //   1875: isub
    //   1876: iaload
    //   1877: ixor
    //   1878: istore #19
    //   1880: iload #19
    //   1882: iconst_1
    //   1883: ishl
    //   1884: iload #19
    //   1886: bipush #31
    //   1888: iushr
    //   1889: ior
    //   1890: istore #20
    //   1892: aload #7
    //   1894: iload #18
    //   1896: iload #20
    //   1898: iastore
    //   1899: iload #8
    //   1901: iconst_5
    //   1902: ishl
    //   1903: iload #8
    //   1905: bipush #27
    //   1907: iushr
    //   1908: ior
    //   1909: istore #19
    //   1911: iload #19
    //   1913: iload #12
    //   1915: iadd
    //   1916: aload #7
    //   1918: iload #18
    //   1920: iaload
    //   1921: iadd
    //   1922: iload #18
    //   1924: bipush #20
    //   1926: if_icmpge -> 1952
    //   1929: ldc 1518500249
    //   1931: iload #9
    //   1933: iload #10
    //   1935: iand
    //   1936: iload #9
    //   1938: iconst_m1
    //   1939: ixor
    //   1940: iload #11
    //   1942: iand
    //   1943: ior
    //   1944: iadd
    //   1945: goto -> 2022
    //   1948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1951: athrow
    //   1952: iload #18
    //   1954: bipush #40
    //   1956: if_icmpge -> 1977
    //   1959: ldc 1859775393
    //   1961: iload #9
    //   1963: iload #10
    //   1965: ixor
    //   1966: iload #11
    //   1968: ixor
    //   1969: iadd
    //   1970: goto -> 2022
    //   1973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1976: athrow
    //   1977: iload #18
    //   1979: bipush #60
    //   1981: if_icmpge -> 2011
    //   1984: ldc -1894007588
    //   1986: iload #9
    //   1988: iload #10
    //   1990: iand
    //   1991: iload #9
    //   1993: iload #11
    //   1995: iand
    //   1996: ior
    //   1997: iload #10
    //   1999: iload #11
    //   2001: iand
    //   2002: ior
    //   2003: iadd
    //   2004: goto -> 2022
    //   2007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2010: athrow
    //   2011: ldc -899497514
    //   2013: iload #9
    //   2015: iload #10
    //   2017: ixor
    //   2018: iload #11
    //   2020: ixor
    //   2021: iadd
    //   2022: iadd
    //   2023: istore #20
    //   2025: iload #11
    //   2027: istore #12
    //   2029: iload #10
    //   2031: istore #11
    //   2033: iload #9
    //   2035: bipush #30
    //   2037: ishl
    //   2038: iload #9
    //   2040: iconst_2
    //   2041: iushr
    //   2042: ior
    //   2043: istore #10
    //   2045: iload #8
    //   2047: istore #9
    //   2049: iload #20
    //   2051: istore #8
    //   2053: iinc #18, 1
    //   2056: iload_2
    //   2057: ifeq -> 1806
    //   2060: iload #8
    //   2062: iload #13
    //   2064: iadd
    //   2065: istore #8
    //   2067: iload #9
    //   2069: iload #14
    //   2071: iadd
    //   2072: istore #9
    //   2074: iload #10
    //   2076: iload #15
    //   2078: iadd
    //   2079: istore #10
    //   2081: iload #11
    //   2083: iload #16
    //   2085: iadd
    //   2086: istore #11
    //   2088: iload #12
    //   2090: iload #17
    //   2092: iadd
    //   2093: istore #12
    //   2095: iinc #6, 16
    //   2098: iload_2
    //   2099: ifeq -> 1775
    //   2102: iconst_5
    //   2103: newarray int
    //   2105: dup
    //   2106: iconst_0
    //   2107: iload #8
    //   2109: iastore
    //   2110: dup
    //   2111: iconst_1
    //   2112: iload #9
    //   2114: iastore
    //   2115: dup
    //   2116: iconst_2
    //   2117: iload #10
    //   2119: iastore
    //   2120: dup
    //   2121: iconst_3
    //   2122: iload #11
    //   2124: iastore
    //   2125: dup
    //   2126: iconst_4
    //   2127: iload #12
    //   2129: iastore
    //   2130: astore #13
    //   2132: bipush #20
    //   2134: newarray byte
    //   2136: astore #14
    //   2138: iconst_0
    //   2139: istore #15
    //   2141: iload #15
    //   2143: bipush #20
    //   2145: if_icmpge -> 2186
    //   2148: aload #13
    //   2150: iload #15
    //   2152: iconst_4
    //   2153: idiv
    //   2154: iaload
    //   2155: istore #16
    //   2157: iconst_3
    //   2158: iload #15
    //   2160: iconst_4
    //   2161: irem
    //   2162: isub
    //   2163: bipush #8
    //   2165: imul
    //   2166: istore #17
    //   2168: aload #14
    //   2170: iload #15
    //   2172: iload #16
    //   2174: iload #17
    //   2176: iushr
    //   2177: i2b
    //   2178: bastore
    //   2179: iinc #15, 1
    //   2182: iload_2
    //   2183: ifeq -> 2141
    //   2186: aload #14
    //   2188: astore #4
    //   2190: new java/io/ByteArrayOutputStream
    //   2193: dup
    //   2194: invokespecial <init> : ()V
    //   2197: astore_3
    //   2198: sipush #-13503
    //   2201: aload_3
    //   2202: sipush #202
    //   2205: invokevirtual write : (I)V
    //   2208: sipush #1661
    //   2211: aload_3
    //   2212: sipush #254
    //   2215: invokevirtual write : (I)V
    //   2218: aload_3
    //   2219: sipush #186
    //   2222: invokevirtual write : (I)V
    //   2225: aload_3
    //   2226: sipush #190
    //   2229: invokevirtual write : (I)V
    //   2232: aload_3
    //   2233: iconst_0
    //   2234: invokevirtual write : (I)V
    //   2237: aload_3
    //   2238: iconst_1
    //   2239: invokevirtual write : (I)V
    //   2242: aload_3
    //   2243: iconst_0
    //   2244: invokevirtual write : (I)V
    //   2247: aload_3
    //   2248: bipush #50
    //   2250: invokevirtual write : (I)V
    //   2253: aload_3
    //   2254: getstatic burp/Zkht.ZR : Ljava/lang/Object;
    //   2257: checkcast java/math/BigInteger
    //   2260: invokevirtual toByteArray : ()[B
    //   2263: invokevirtual write : ([B)V
    //   2266: aload_3
    //   2267: getstatic burp/Zkdq.ZG : Ljava/lang/Object;
    //   2270: checkcast java/math/BigInteger
    //   2273: invokevirtual toByteArray : ()[B
    //   2276: invokevirtual write : ([B)V
    //   2279: aload_3
    //   2280: getstatic burp/Zb20.Zq : Ljava/lang/Object;
    //   2283: checkcast java/math/BigInteger
    //   2286: invokevirtual toByteArray : ()[B
    //   2289: invokevirtual write : ([B)V
    //   2292: aload_3
    //   2293: invokevirtual toByteArray : ()[B
    //   2296: astore #4
    //   2298: aconst_null
    //   2299: astore #5
    //   2301: invokestatic a : (II)Ljava/lang/String;
    //   2304: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2307: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2310: astore #6
    //   2312: aload #6
    //   2314: arraylength
    //   2315: istore #7
    //   2317: iconst_0
    //   2318: istore #8
    //   2320: iload #8
    //   2322: iload #7
    //   2324: if_icmpge -> 2452
    //   2327: aload #6
    //   2329: iload #8
    //   2331: aaload
    //   2332: astore #9
    //   2334: aload #9
    //   2336: invokevirtual getName : ()Ljava/lang/String;
    //   2339: sipush #-13493
    //   2342: sipush #16015
    //   2345: invokestatic a : (II)Ljava/lang/String;
    //   2348: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2351: ifeq -> 2445
    //   2354: aload #9
    //   2356: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2359: astore #10
    //   2361: aload #10
    //   2363: arraylength
    //   2364: iconst_4
    //   2365: if_icmpeq -> 2375
    //   2368: goto -> 2445
    //   2371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2374: athrow
    //   2375: aload #10
    //   2377: iconst_0
    //   2378: aaload
    //   2379: ldc java/lang/String
    //   2381: if_acmpeq -> 2391
    //   2384: goto -> 2445
    //   2387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2390: athrow
    //   2391: aload #10
    //   2393: iconst_1
    //   2394: aaload
    //   2395: ldc [B
    //   2397: if_acmpeq -> 2407
    //   2400: goto -> 2445
    //   2403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2406: athrow
    //   2407: aload #10
    //   2409: iconst_2
    //   2410: aaload
    //   2411: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2414: if_acmpeq -> 2424
    //   2417: goto -> 2445
    //   2420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2423: athrow
    //   2424: aload #10
    //   2426: iconst_3
    //   2427: aaload
    //   2428: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2431: if_acmpeq -> 2441
    //   2434: goto -> 2445
    //   2437: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2440: athrow
    //   2441: aload #9
    //   2443: astore #5
    //   2445: iinc #8, 1
    //   2448: iload_2
    //   2449: ifeq -> 2320
    //   2452: aload #5
    //   2454: iconst_1
    //   2455: invokevirtual setAccessible : (Z)V
    //   2458: ldc burp/Zz1k
    //   2460: iconst_0
    //   2461: anewarray java/lang/Class
    //   2464: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2467: astore #6
    //   2469: aload #6
    //   2471: iconst_1
    //   2472: invokevirtual setAccessible : (Z)V
    //   2475: aload #5
    //   2477: aload #6
    //   2479: iconst_0
    //   2480: anewarray java/lang/Object
    //   2483: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2486: iconst_4
    //   2487: anewarray java/lang/Object
    //   2490: dup
    //   2491: iconst_0
    //   2492: sipush #-13497
    //   2495: sipush #17697
    //   2498: invokestatic a : (II)Ljava/lang/String;
    //   2501: aastore
    //   2502: dup
    //   2503: iconst_1
    //   2504: aload #4
    //   2506: aastore
    //   2507: dup
    //   2508: iconst_2
    //   2509: iconst_0
    //   2510: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2513: aastore
    //   2514: dup
    //   2515: iconst_3
    //   2516: aload #4
    //   2518: arraylength
    //   2519: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2522: aastore
    //   2523: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2526: pop
    //   2527: goto -> 2531
    //   2530: astore_3
    //   2531: iconst_0
    //   2532: istore_3
    //   2533: sipush #-13501
    //   2536: sipush #19788
    //   2539: invokestatic a : (II)Ljava/lang/String;
    //   2542: iconst_1
    //   2543: ldc burp/Zepm
    //   2545: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2548: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2551: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2554: astore #4
    //   2556: aload #4
    //   2558: arraylength
    //   2559: istore #5
    //   2561: iconst_0
    //   2562: istore #6
    //   2564: iload #6
    //   2566: iload #5
    //   2568: if_icmpge -> 2706
    //   2571: aload #4
    //   2573: iload #6
    //   2575: aaload
    //   2576: astore #7
    //   2578: aload #7
    //   2580: invokevirtual getModifiers : ()I
    //   2583: invokestatic isStatic : (I)Z
    //   2586: ifne -> 2596
    //   2589: goto -> 2699
    //   2592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2595: athrow
    //   2596: aload #7
    //   2598: invokevirtual getType : ()Ljava/lang/Class;
    //   2601: astore #8
    //   2603: aload #8
    //   2605: ifnull -> 2686
    //   2608: aload #8
    //   2610: invokevirtual isPrimitive : ()Z
    //   2613: ifne -> 2686
    //   2616: goto -> 2623
    //   2619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2622: athrow
    //   2623: aload #8
    //   2625: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2628: ifnull -> 2686
    //   2631: goto -> 2638
    //   2634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2637: athrow
    //   2638: aload #8
    //   2640: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2643: invokevirtual getName : ()Ljava/lang/String;
    //   2646: ifnull -> 2686
    //   2649: goto -> 2656
    //   2652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2655: athrow
    //   2656: aload #8
    //   2658: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2661: invokevirtual getName : ()Ljava/lang/String;
    //   2664: sipush #-13490
    //   2667: sipush #-4959
    //   2670: invokestatic a : (II)Ljava/lang/String;
    //   2673: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2676: ifne -> 2686
    //   2679: goto -> 2686
    //   2682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2685: athrow
    //   2686: aload #7
    //   2688: iconst_1
    //   2689: invokevirtual setAccessible : (Z)V
    //   2692: aload #7
    //   2694: aconst_null
    //   2695: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2698: pop
    //   2699: iinc #6, 1
    //   2702: iload_2
    //   2703: ifeq -> 2564
    //   2706: sipush #-13499
    //   2709: sipush #10175
    //   2712: invokestatic a : (II)Ljava/lang/String;
    //   2715: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2718: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2721: astore #4
    //   2723: aload #4
    //   2725: arraylength
    //   2726: istore #5
    //   2728: iconst_0
    //   2729: istore #6
    //   2731: iload #6
    //   2733: iload #5
    //   2735: if_icmpge -> 2871
    //   2738: aload #4
    //   2740: iload #6
    //   2742: aaload
    //   2743: astore #7
    //   2745: aload #7
    //   2747: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2750: pop
    //   2751: aload #7
    //   2753: invokevirtual getModifiers : ()I
    //   2756: invokestatic isStatic : (I)Z
    //   2759: ifeq -> 2857
    //   2762: aload #7
    //   2764: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2767: arraylength
    //   2768: iconst_2
    //   2769: if_icmpne -> 2857
    //   2772: goto -> 2779
    //   2775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2778: athrow
    //   2779: aload #7
    //   2781: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2784: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2787: if_acmpne -> 2857
    //   2790: goto -> 2797
    //   2793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2796: athrow
    //   2797: aload #7
    //   2799: iconst_1
    //   2800: invokevirtual setAccessible : (Z)V
    //   2803: aload #7
    //   2805: aconst_null
    //   2806: iconst_2
    //   2807: anewarray java/lang/Object
    //   2810: dup
    //   2811: iconst_0
    //   2812: aload_0
    //   2813: aastore
    //   2814: dup
    //   2815: iconst_1
    //   2816: aload_1
    //   2817: ifnonnull -> 2835
    //   2820: goto -> 2827
    //   2823: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2826: athrow
    //   2827: aload_1
    //   2828: goto -> 2842
    //   2831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2834: athrow
    //   2835: aload_1
    //   2836: checkcast [B
    //   2839: invokevirtual clone : ()Ljava/lang/Object;
    //   2842: aastore
    //   2843: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2846: checkcast java/lang/Boolean
    //   2849: invokevirtual booleanValue : ()Z
    //   2852: istore_3
    //   2853: iload_2
    //   2854: ifeq -> 2871
    //   2857: iinc #6, 1
    //   2860: iload_2
    //   2861: ifeq -> 2731
    //   2864: goto -> 2871
    //   2867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2870: athrow
    //   2871: iload_3
    //   2872: ireturn
    //   2873: astore_3
    //   2874: new java/lang/Exception
    //   2877: dup
    //   2878: aload_3
    //   2879: invokevirtual getMessage : ()Ljava/lang/String;
    //   2882: invokespecial <init> : (Ljava/lang/String;)V
    //   2885: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2872	2873	java/lang/Throwable
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
    //   1094	1122	1125	java/lang/Throwable
    //   1111	1158	1161	java/lang/Throwable
    //   1129	1172	1175	java/lang/Throwable
    //   1221	1235	1235	java/lang/Throwable
    //   1246	1259	1262	java/lang/Throwable
    //   1251	1274	1277	java/lang/Throwable
    //   1266	1292	1295	java/lang/Throwable
    //   1281	1322	1325	java/lang/Throwable
    //   1385	1412	1415	java/lang/Throwable
    //   1402	1433	1436	java/lang/Throwable
    //   1419	1463	1466	java/lang/Throwable
    //   1440	1474	1474	java/lang/Throwable
    //   1485	1501	1504	java/lang/Throwable
    //   1813	1837	1840	java/lang/Throwable
    //   1911	1948	1948	java/lang/Throwable
    //   1952	1973	1973	java/lang/Throwable
    //   1977	2007	2007	java/lang/Throwable
    //   2190	2527	2530	java/lang/Throwable
    //   2361	2371	2371	java/lang/Throwable
    //   2375	2387	2387	java/lang/Throwable
    //   2391	2403	2403	java/lang/Throwable
    //   2407	2420	2420	java/lang/Throwable
    //   2424	2437	2437	java/lang/Throwable
    //   2578	2592	2592	java/lang/Throwable
    //   2603	2616	2619	java/lang/Throwable
    //   2608	2631	2634	java/lang/Throwable
    //   2623	2649	2652	java/lang/Throwable
    //   2638	2679	2682	java/lang/Throwable
    //   2745	2772	2775	java/lang/Throwable
    //   2762	2790	2793	java/lang/Throwable
    //   2779	2820	2823	java/lang/Throwable
    //   2797	2831	2831	java/lang/Throwable
    //   2853	2864	2867	java/lang/Throwable
  }
  
  static void ZU(Object paramObject) {
    Zec0.Zk = a(-13495, -3362);
    Zec0.Zg = new BigInteger(a(-13498, 5999));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zboa.Zq.charAt(Math.abs(((BigInteger)Zelz.Z_).intValue() % 32)) > Zcc.Zb.charAt(Math.abs(((BigInteger)Zg27.ZQ).intValue() % 32))) {
          try {
            Zz35.ZB(Class.forName(a(-13492, -23060)));
            if (!bool)
              Zty4.ZD(Class.forName(a(-13486, -17244))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zty4.ZD(Class.forName(a(-13486, -17244)));
    } catch (Throwable throwable) {}
  }
  
  static void Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '* tãÖ\\töËíâ:Çrh\\t¯à< `/ùÇ%àöàáØàõ,ÍÁ?aLY67(¦ZÜ½ôå8X"- Í¡ea¹Eqâcy [KZØPU?\\rÕc1ìawß½SÆ¡ÆþFvm7Îq5[)\\bêkHÒâÍ« ·?uÇç\\beë§¾æV-46òOÁ0à¬1\\ten7Jvq$\\tAz=ð<WO<@¦EVT"Õ\\t\\rºV,¤t\\r} \\nw»Lë\c¨Ø,BN ¢] ùVAÜò7@¥¶ÜNv\\t?vXU)¼ò\\tÔè¢jÓÂM£Zaô\\tòúáÄ»\\n© QÒ¼Ö3{øÄ¬ep;7-tÜÚ}RÝ³`h¼'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #79
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
    //   68: ldc '\\rnB%áÂå[M¨ 7R¶Ä\¼l¯¼\\b¨ÜN¥©÷øMµð×ÆàÎÁ[ÁX ãW¼ÒæyCÀõ8Ãí³IÊìä]\\rÎÚ&óRXHk'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #18
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
    //   129: putstatic burp/Zx58.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zx58.b : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #93
    //   219: goto -> 244
    //   222: bipush #10
    //   224: goto -> 244
    //   227: bipush #25
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #119
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #-13487
    //   307: sipush #-3399
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zx58.ZE : Ljava/lang/Object;
    //   319: sipush #-13500
    //   322: sipush #23731
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zx58.Zs : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCB42) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx58.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */