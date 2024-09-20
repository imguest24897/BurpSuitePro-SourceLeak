package burp;

import java.math.BigInteger;

class Zgz2 extends ClassLoader {
  static String ZI;
  
  static Object Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zss8.ZO : Ljava/lang/Object;
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
    //   856: new java/math/BigInteger
    //   859: dup
    //   860: aload #4
    //   862: invokespecial <init> : ([B)V
    //   865: invokevirtual abs : ()Ljava/math/BigInteger;
    //   868: putstatic burp/Zr3j.ZT : Ljava/lang/Object;
    //   871: ldc2_w 8682522807148012
    //   874: invokestatic currentTimeMillis : ()J
    //   877: lxor
    //   878: lstore #4
    //   880: lload #4
    //   882: ldc2_w 25214903917
    //   885: lmul
    //   886: ldc2_w 11
    //   889: ladd
    //   890: ldc2_w 281474976710655
    //   893: land
    //   894: lstore #4
    //   896: lload #4
    //   898: bipush #32
    //   900: lshl
    //   901: lstore #6
    //   903: lload #4
    //   905: ldc2_w 25214903917
    //   908: lmul
    //   909: ldc2_w 11
    //   912: ladd
    //   913: ldc2_w 281474976710655
    //   916: land
    //   917: lstore #4
    //   919: lload #6
    //   921: lload #4
    //   923: ladd
    //   924: lstore #6
    //   926: bipush #16
    //   928: newarray byte
    //   930: dup
    //   931: iconst_0
    //   932: bipush #48
    //   934: bastore
    //   935: dup
    //   936: iconst_1
    //   937: bipush #49
    //   939: bastore
    //   940: dup
    //   941: iconst_2
    //   942: bipush #50
    //   944: bastore
    //   945: dup
    //   946: iconst_3
    //   947: bipush #51
    //   949: bastore
    //   950: dup
    //   951: iconst_4
    //   952: bipush #52
    //   954: bastore
    //   955: dup
    //   956: iconst_5
    //   957: bipush #53
    //   959: bastore
    //   960: dup
    //   961: bipush #6
    //   963: bipush #54
    //   965: bastore
    //   966: dup
    //   967: bipush #7
    //   969: bipush #55
    //   971: bastore
    //   972: dup
    //   973: bipush #8
    //   975: bipush #56
    //   977: bastore
    //   978: dup
    //   979: bipush #9
    //   981: bipush #57
    //   983: bastore
    //   984: dup
    //   985: bipush #10
    //   987: bipush #97
    //   989: bastore
    //   990: dup
    //   991: bipush #11
    //   993: bipush #98
    //   995: bastore
    //   996: dup
    //   997: bipush #12
    //   999: bipush #99
    //   1001: bastore
    //   1002: dup
    //   1003: bipush #13
    //   1005: bipush #100
    //   1007: bastore
    //   1008: dup
    //   1009: bipush #14
    //   1011: bipush #101
    //   1013: bastore
    //   1014: dup
    //   1015: bipush #15
    //   1017: bipush #102
    //   1019: bastore
    //   1020: astore #8
    //   1022: bipush #64
    //   1024: newarray byte
    //   1026: astore #9
    //   1028: bipush #64
    //   1030: istore #10
    //   1032: bipush #16
    //   1034: istore #11
    //   1036: iload #11
    //   1038: iconst_1
    //   1039: isub
    //   1040: i2l
    //   1041: lstore #12
    //   1043: aload #9
    //   1045: iinc #10, -1
    //   1048: iload #10
    //   1050: aload #8
    //   1052: lload #6
    //   1054: lload #12
    //   1056: land
    //   1057: l2i
    //   1058: baload
    //   1059: bastore
    //   1060: lload #6
    //   1062: iconst_4
    //   1063: lushr
    //   1064: lstore #6
    //   1066: lload #6
    //   1068: lconst_0
    //   1069: lcmp
    //   1070: ifne -> 1043
    //   1073: bipush #64
    //   1075: iload #10
    //   1077: isub
    //   1078: newarray byte
    //   1080: astore_3
    //   1081: iconst_0
    //   1082: istore #14
    //   1084: iload #14
    //   1086: aload_3
    //   1087: arraylength
    //   1088: if_icmpge -> 1110
    //   1091: aload_3
    //   1092: iload #14
    //   1094: aload #9
    //   1096: iload #10
    //   1098: iload #14
    //   1100: iadd
    //   1101: baload
    //   1102: bastore
    //   1103: iinc #14, 1
    //   1106: iload_2
    //   1107: ifeq -> 1084
    //   1110: aload_3
    //   1111: arraylength
    //   1112: bipush #10
    //   1114: if_icmplt -> 880
    //   1117: sipush #27157
    //   1120: sipush #-13351
    //   1123: invokestatic a : (II)Ljava/lang/String;
    //   1126: iconst_1
    //   1127: ldc burp/Zead
    //   1129: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1132: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1135: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1138: astore_3
    //   1139: aload_3
    //   1140: arraylength
    //   1141: istore #4
    //   1143: iconst_0
    //   1144: istore #5
    //   1146: iload #5
    //   1148: iload #4
    //   1150: if_icmpge -> 1287
    //   1153: aload_3
    //   1154: iload #5
    //   1156: aaload
    //   1157: astore #6
    //   1159: aload #6
    //   1161: invokevirtual getModifiers : ()I
    //   1164: invokestatic isStatic : (I)Z
    //   1167: ifne -> 1177
    //   1170: goto -> 1280
    //   1173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1176: athrow
    //   1177: aload #6
    //   1179: invokevirtual getType : ()Ljava/lang/Class;
    //   1182: astore #7
    //   1184: aload #7
    //   1186: ifnull -> 1267
    //   1189: aload #7
    //   1191: invokevirtual isPrimitive : ()Z
    //   1194: ifne -> 1267
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1203: athrow
    //   1204: aload #7
    //   1206: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1209: ifnull -> 1267
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1218: athrow
    //   1219: aload #7
    //   1221: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1224: invokevirtual getName : ()Ljava/lang/String;
    //   1227: ifnull -> 1267
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1236: athrow
    //   1237: aload #7
    //   1239: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1242: invokevirtual getName : ()Ljava/lang/String;
    //   1245: sipush #27159
    //   1248: sipush #-2968
    //   1251: invokestatic a : (II)Ljava/lang/String;
    //   1254: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1257: ifne -> 1267
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1266: athrow
    //   1267: aload #6
    //   1269: iconst_1
    //   1270: invokevirtual setAccessible : (Z)V
    //   1273: aload #6
    //   1275: aconst_null
    //   1276: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1279: pop
    //   1280: iinc #5, 1
    //   1283: iload_2
    //   1284: ifeq -> 1146
    //   1287: sipush #27158
    //   1290: sipush #5653
    //   1293: invokestatic a : (II)Ljava/lang/String;
    //   1296: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1299: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1302: astore_3
    //   1303: aload_3
    //   1304: arraylength
    //   1305: istore #4
    //   1307: iconst_0
    //   1308: istore #5
    //   1310: iload #5
    //   1312: iload #4
    //   1314: if_icmpge -> 1446
    //   1317: aload_3
    //   1318: iload #5
    //   1320: aaload
    //   1321: astore #6
    //   1323: aload #6
    //   1325: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1328: pop
    //   1329: aload #6
    //   1331: invokevirtual getModifiers : ()I
    //   1334: invokestatic isStatic : (I)Z
    //   1337: ifeq -> 1432
    //   1340: aload #6
    //   1342: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1345: arraylength
    //   1346: iconst_2
    //   1347: if_icmpne -> 1432
    //   1350: goto -> 1357
    //   1353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1356: athrow
    //   1357: aload #6
    //   1359: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1362: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1365: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1368: ifeq -> 1432
    //   1371: goto -> 1378
    //   1374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1377: athrow
    //   1378: aload #6
    //   1380: iconst_1
    //   1381: invokevirtual setAccessible : (Z)V
    //   1384: aload #6
    //   1386: aconst_null
    //   1387: iconst_2
    //   1388: anewarray java/lang/Object
    //   1391: dup
    //   1392: iconst_0
    //   1393: aload_0
    //   1394: aastore
    //   1395: dup
    //   1396: iconst_1
    //   1397: aload_1
    //   1398: ifnonnull -> 1416
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1407: athrow
    //   1408: aload_1
    //   1409: goto -> 1423
    //   1412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1415: athrow
    //   1416: aload_1
    //   1417: checkcast [B
    //   1420: invokevirtual clone : ()Ljava/lang/Object;
    //   1423: aastore
    //   1424: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1427: pop
    //   1428: iload_2
    //   1429: ifeq -> 1446
    //   1432: iinc #5, 1
    //   1435: iload_2
    //   1436: ifeq -> 1310
    //   1439: goto -> 1446
    //   1442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1445: athrow
    //   1446: new java/io/ByteArrayOutputStream
    //   1449: dup
    //   1450: invokespecial <init> : ()V
    //   1453: astore_3
    //   1454: getstatic burp/Zeoa.Zn : Ljava/lang/String;
    //   1457: astore #4
    //   1459: iconst_0
    //   1460: istore #5
    //   1462: iload #5
    //   1464: aload #4
    //   1466: invokevirtual length : ()I
    //   1469: if_icmpge -> 1499
    //   1472: aload_3
    //   1473: aload #4
    //   1475: iload #5
    //   1477: iload #5
    //   1479: iconst_2
    //   1480: iadd
    //   1481: invokevirtual substring : (II)Ljava/lang/String;
    //   1484: bipush #16
    //   1486: invokestatic parseInt : (Ljava/lang/String;I)I
    //   1489: invokevirtual write : (I)V
    //   1492: iinc #5, 2
    //   1495: iload_2
    //   1496: ifeq -> 1462
    //   1499: aload_3
    //   1500: invokevirtual toByteArray : ()[B
    //   1503: astore #5
    //   1505: getstatic burp/Zltp.ZT : Ljava/lang/Object;
    //   1508: checkcast java/math/BigInteger
    //   1511: invokevirtual toByteArray : ()[B
    //   1514: astore #6
    //   1516: sipush #256
    //   1519: newarray byte
    //   1521: astore #8
    //   1523: sipush #256
    //   1526: newarray int
    //   1528: astore #9
    //   1530: sipush #256
    //   1533: newarray int
    //   1535: astore #10
    //   1537: sipush #256
    //   1540: newarray int
    //   1542: astore #11
    //   1544: sipush #256
    //   1547: newarray int
    //   1549: astore #12
    //   1551: bipush #10
    //   1553: newarray int
    //   1555: astore #13
    //   1557: sipush #283
    //   1560: istore #14
    //   1562: iconst_0
    //   1563: istore #16
    //   1565: iload #16
    //   1567: sipush #256
    //   1570: if_icmpge -> 1804
    //   1573: sipush #27154
    //   1576: sipush #-6167
    //   1579: invokestatic a : (II)Ljava/lang/String;
    //   1582: iload #16
    //   1584: iconst_1
    //   1585: iushr
    //   1586: invokevirtual charAt : (I)C
    //   1589: istore #25
    //   1591: iload #16
    //   1593: iconst_1
    //   1594: iand
    //   1595: ifne -> 1610
    //   1598: iload #25
    //   1600: bipush #8
    //   1602: iushr
    //   1603: goto -> 1612
    //   1606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1609: athrow
    //   1610: iload #25
    //   1612: i2b
    //   1613: sipush #255
    //   1616: iand
    //   1617: istore #15
    //   1619: iload #16
    //   1621: iconst_1
    //   1622: ishl
    //   1623: istore #17
    //   1625: iload #17
    //   1627: sipush #256
    //   1630: if_icmplt -> 1640
    //   1633: iload #17
    //   1635: iload #14
    //   1637: ixor
    //   1638: istore #17
    //   1640: iload #17
    //   1642: iconst_1
    //   1643: ishl
    //   1644: istore #18
    //   1646: iload #18
    //   1648: sipush #256
    //   1651: if_icmplt -> 1661
    //   1654: iload #18
    //   1656: iload #14
    //   1658: ixor
    //   1659: istore #18
    //   1661: iload #18
    //   1663: iconst_1
    //   1664: ishl
    //   1665: istore #19
    //   1667: iload #19
    //   1669: sipush #256
    //   1672: if_icmplt -> 1682
    //   1675: iload #19
    //   1677: iload #14
    //   1679: ixor
    //   1680: istore #19
    //   1682: iload #19
    //   1684: iload #16
    //   1686: ixor
    //   1687: istore #20
    //   1689: iload #20
    //   1691: iload #17
    //   1693: ixor
    //   1694: istore #21
    //   1696: iload #20
    //   1698: iload #18
    //   1700: ixor
    //   1701: istore #22
    //   1703: iload #19
    //   1705: iload #18
    //   1707: ixor
    //   1708: iload #17
    //   1710: ixor
    //   1711: istore #23
    //   1713: aload #8
    //   1715: iload #16
    //   1717: iload #15
    //   1719: i2b
    //   1720: bastore
    //   1721: aload #9
    //   1723: iload #15
    //   1725: iload #23
    //   1727: bipush #24
    //   1729: ishl
    //   1730: iload #20
    //   1732: bipush #16
    //   1734: ishl
    //   1735: ior
    //   1736: iload #22
    //   1738: bipush #8
    //   1740: ishl
    //   1741: ior
    //   1742: iload #21
    //   1744: ior
    //   1745: dup
    //   1746: istore #24
    //   1748: iastore
    //   1749: aload #10
    //   1751: iload #15
    //   1753: iload #24
    //   1755: bipush #8
    //   1757: iushr
    //   1758: iload #24
    //   1760: bipush #24
    //   1762: ishl
    //   1763: ior
    //   1764: iastore
    //   1765: aload #11
    //   1767: iload #15
    //   1769: iload #24
    //   1771: bipush #16
    //   1773: iushr
    //   1774: iload #24
    //   1776: bipush #16
    //   1778: ishl
    //   1779: ior
    //   1780: iastore
    //   1781: aload #12
    //   1783: iload #15
    //   1785: iload #24
    //   1787: bipush #24
    //   1789: iushr
    //   1790: iload #24
    //   1792: bipush #8
    //   1794: ishl
    //   1795: ior
    //   1796: iastore
    //   1797: iinc #16, 1
    //   1800: iload_2
    //   1801: ifeq -> 1565
    //   1804: iconst_1
    //   1805: istore #25
    //   1807: aload #13
    //   1809: iconst_0
    //   1810: iload #25
    //   1812: bipush #24
    //   1814: ishl
    //   1815: iastore
    //   1816: iconst_1
    //   1817: istore #26
    //   1819: iload #26
    //   1821: bipush #10
    //   1823: if_icmpge -> 1864
    //   1826: iload #25
    //   1828: iconst_1
    //   1829: ishl
    //   1830: istore #25
    //   1832: iload #25
    //   1834: sipush #256
    //   1837: if_icmplt -> 1847
    //   1840: iload #25
    //   1842: iload #14
    //   1844: ixor
    //   1845: istore #25
    //   1847: aload #13
    //   1849: iload #26
    //   1851: iload #25
    //   1853: bipush #24
    //   1855: ishl
    //   1856: iastore
    //   1857: iinc #26, 1
    //   1860: iload_2
    //   1861: ifeq -> 1819
    //   1864: iconst_4
    //   1865: istore #26
    //   1867: iload #26
    //   1869: bipush #6
    //   1871: iadd
    //   1872: istore #27
    //   1874: iconst_4
    //   1875: iload #27
    //   1877: iconst_1
    //   1878: iadd
    //   1879: imul
    //   1880: istore #28
    //   1882: iload #28
    //   1884: newarray int
    //   1886: astore #29
    //   1888: iload #28
    //   1890: newarray int
    //   1892: astore #30
    //   1894: iconst_0
    //   1895: istore #25
    //   1897: iconst_0
    //   1898: istore #32
    //   1900: iconst_0
    //   1901: istore #33
    //   1903: iload #32
    //   1905: iload #26
    //   1907: if_icmpge -> 1975
    //   1910: aload #29
    //   1912: iload #32
    //   1914: aload #5
    //   1916: iload #33
    //   1918: baload
    //   1919: bipush #24
    //   1921: ishl
    //   1922: aload #5
    //   1924: iload #33
    //   1926: iconst_1
    //   1927: iadd
    //   1928: baload
    //   1929: sipush #255
    //   1932: iand
    //   1933: bipush #16
    //   1935: ishl
    //   1936: ior
    //   1937: aload #5
    //   1939: iload #33
    //   1941: iconst_2
    //   1942: iadd
    //   1943: baload
    //   1944: sipush #255
    //   1947: iand
    //   1948: bipush #8
    //   1950: ishl
    //   1951: ior
    //   1952: aload #5
    //   1954: iload #33
    //   1956: iconst_3
    //   1957: iadd
    //   1958: baload
    //   1959: sipush #255
    //   1962: iand
    //   1963: ior
    //   1964: iastore
    //   1965: iinc #32, 1
    //   1968: iinc #33, 4
    //   1971: iload_2
    //   1972: ifeq -> 1903
    //   1975: iload #26
    //   1977: istore #32
    //   1979: iconst_0
    //   1980: istore #33
    //   1982: iload #32
    //   1984: iload #28
    //   1986: if_icmpge -> 2113
    //   1989: aload #29
    //   1991: iload #32
    //   1993: iconst_1
    //   1994: isub
    //   1995: iaload
    //   1996: istore #31
    //   1998: iload #33
    //   2000: ifne -> 2087
    //   2003: iload #26
    //   2005: istore #33
    //   2007: aload #8
    //   2009: iload #31
    //   2011: bipush #16
    //   2013: iushr
    //   2014: sipush #255
    //   2017: iand
    //   2018: baload
    //   2019: bipush #24
    //   2021: ishl
    //   2022: aload #8
    //   2024: iload #31
    //   2026: bipush #8
    //   2028: iushr
    //   2029: sipush #255
    //   2032: iand
    //   2033: baload
    //   2034: sipush #255
    //   2037: iand
    //   2038: bipush #16
    //   2040: ishl
    //   2041: ior
    //   2042: aload #8
    //   2044: iload #31
    //   2046: sipush #255
    //   2049: iand
    //   2050: baload
    //   2051: sipush #255
    //   2054: iand
    //   2055: bipush #8
    //   2057: ishl
    //   2058: ior
    //   2059: aload #8
    //   2061: iload #31
    //   2063: bipush #24
    //   2065: iushr
    //   2066: baload
    //   2067: sipush #255
    //   2070: iand
    //   2071: ior
    //   2072: istore #31
    //   2074: iload #31
    //   2076: aload #13
    //   2078: iload #25
    //   2080: iinc #25, 1
    //   2083: iaload
    //   2084: ixor
    //   2085: istore #31
    //   2087: aload #29
    //   2089: iload #32
    //   2091: aload #29
    //   2093: iload #32
    //   2095: iload #26
    //   2097: isub
    //   2098: iaload
    //   2099: iload #31
    //   2101: ixor
    //   2102: iastore
    //   2103: iinc #32, 1
    //   2106: iinc #33, -1
    //   2109: iload_2
    //   2110: ifeq -> 1982
    //   2113: iconst_0
    //   2114: istore #32
    //   2116: iconst_4
    //   2117: iload #27
    //   2119: imul
    //   2120: istore #33
    //   2122: aload #30
    //   2124: iload #32
    //   2126: aload #29
    //   2128: iload #33
    //   2130: iaload
    //   2131: iastore
    //   2132: aload #30
    //   2134: iload #32
    //   2136: iconst_1
    //   2137: iadd
    //   2138: aload #29
    //   2140: iload #33
    //   2142: iconst_1
    //   2143: iadd
    //   2144: iaload
    //   2145: iastore
    //   2146: aload #30
    //   2148: iload #32
    //   2150: iconst_2
    //   2151: iadd
    //   2152: aload #29
    //   2154: iload #33
    //   2156: iconst_2
    //   2157: iadd
    //   2158: iaload
    //   2159: iastore
    //   2160: aload #30
    //   2162: iload #32
    //   2164: iconst_3
    //   2165: iadd
    //   2166: aload #29
    //   2168: iload #33
    //   2170: iconst_3
    //   2171: iadd
    //   2172: iaload
    //   2173: iastore
    //   2174: iinc #32, 4
    //   2177: iinc #33, -4
    //   2180: iconst_1
    //   2181: istore #35
    //   2183: iload #35
    //   2185: iload #27
    //   2187: if_icmpge -> 2551
    //   2190: aload #29
    //   2192: iload #33
    //   2194: iaload
    //   2195: istore #34
    //   2197: aload #30
    //   2199: iload #32
    //   2201: aload #9
    //   2203: aload #8
    //   2205: iload #34
    //   2207: bipush #24
    //   2209: iushr
    //   2210: baload
    //   2211: sipush #255
    //   2214: iand
    //   2215: iaload
    //   2216: aload #10
    //   2218: aload #8
    //   2220: iload #34
    //   2222: bipush #16
    //   2224: iushr
    //   2225: sipush #255
    //   2228: iand
    //   2229: baload
    //   2230: sipush #255
    //   2233: iand
    //   2234: iaload
    //   2235: ixor
    //   2236: aload #11
    //   2238: aload #8
    //   2240: iload #34
    //   2242: bipush #8
    //   2244: iushr
    //   2245: sipush #255
    //   2248: iand
    //   2249: baload
    //   2250: sipush #255
    //   2253: iand
    //   2254: iaload
    //   2255: ixor
    //   2256: aload #12
    //   2258: aload #8
    //   2260: iload #34
    //   2262: sipush #255
    //   2265: iand
    //   2266: baload
    //   2267: sipush #255
    //   2270: iand
    //   2271: iaload
    //   2272: ixor
    //   2273: iastore
    //   2274: aload #29
    //   2276: iload #33
    //   2278: iconst_1
    //   2279: iadd
    //   2280: iaload
    //   2281: istore #34
    //   2283: aload #30
    //   2285: iload #32
    //   2287: iconst_1
    //   2288: iadd
    //   2289: aload #9
    //   2291: aload #8
    //   2293: iload #34
    //   2295: bipush #24
    //   2297: iushr
    //   2298: baload
    //   2299: sipush #255
    //   2302: iand
    //   2303: iaload
    //   2304: aload #10
    //   2306: aload #8
    //   2308: iload #34
    //   2310: bipush #16
    //   2312: iushr
    //   2313: sipush #255
    //   2316: iand
    //   2317: baload
    //   2318: sipush #255
    //   2321: iand
    //   2322: iaload
    //   2323: ixor
    //   2324: aload #11
    //   2326: aload #8
    //   2328: iload #34
    //   2330: bipush #8
    //   2332: iushr
    //   2333: sipush #255
    //   2336: iand
    //   2337: baload
    //   2338: sipush #255
    //   2341: iand
    //   2342: iaload
    //   2343: ixor
    //   2344: aload #12
    //   2346: aload #8
    //   2348: iload #34
    //   2350: sipush #255
    //   2353: iand
    //   2354: baload
    //   2355: sipush #255
    //   2358: iand
    //   2359: iaload
    //   2360: ixor
    //   2361: iastore
    //   2362: aload #29
    //   2364: iload #33
    //   2366: iconst_2
    //   2367: iadd
    //   2368: iaload
    //   2369: istore #34
    //   2371: aload #30
    //   2373: iload #32
    //   2375: iconst_2
    //   2376: iadd
    //   2377: aload #9
    //   2379: aload #8
    //   2381: iload #34
    //   2383: bipush #24
    //   2385: iushr
    //   2386: baload
    //   2387: sipush #255
    //   2390: iand
    //   2391: iaload
    //   2392: aload #10
    //   2394: aload #8
    //   2396: iload #34
    //   2398: bipush #16
    //   2400: iushr
    //   2401: sipush #255
    //   2404: iand
    //   2405: baload
    //   2406: sipush #255
    //   2409: iand
    //   2410: iaload
    //   2411: ixor
    //   2412: aload #11
    //   2414: aload #8
    //   2416: iload #34
    //   2418: bipush #8
    //   2420: iushr
    //   2421: sipush #255
    //   2424: iand
    //   2425: baload
    //   2426: sipush #255
    //   2429: iand
    //   2430: iaload
    //   2431: ixor
    //   2432: aload #12
    //   2434: aload #8
    //   2436: iload #34
    //   2438: sipush #255
    //   2441: iand
    //   2442: baload
    //   2443: sipush #255
    //   2446: iand
    //   2447: iaload
    //   2448: ixor
    //   2449: iastore
    //   2450: aload #29
    //   2452: iload #33
    //   2454: iconst_3
    //   2455: iadd
    //   2456: iaload
    //   2457: istore #34
    //   2459: aload #30
    //   2461: iload #32
    //   2463: iconst_3
    //   2464: iadd
    //   2465: aload #9
    //   2467: aload #8
    //   2469: iload #34
    //   2471: bipush #24
    //   2473: iushr
    //   2474: baload
    //   2475: sipush #255
    //   2478: iand
    //   2479: iaload
    //   2480: aload #10
    //   2482: aload #8
    //   2484: iload #34
    //   2486: bipush #16
    //   2488: iushr
    //   2489: sipush #255
    //   2492: iand
    //   2493: baload
    //   2494: sipush #255
    //   2497: iand
    //   2498: iaload
    //   2499: ixor
    //   2500: aload #11
    //   2502: aload #8
    //   2504: iload #34
    //   2506: bipush #8
    //   2508: iushr
    //   2509: sipush #255
    //   2512: iand
    //   2513: baload
    //   2514: sipush #255
    //   2517: iand
    //   2518: iaload
    //   2519: ixor
    //   2520: aload #12
    //   2522: aload #8
    //   2524: iload #34
    //   2526: sipush #255
    //   2529: iand
    //   2530: baload
    //   2531: sipush #255
    //   2534: iand
    //   2535: iaload
    //   2536: ixor
    //   2537: iastore
    //   2538: iinc #32, 4
    //   2541: iinc #33, -4
    //   2544: iinc #35, 1
    //   2547: iload_2
    //   2548: ifeq -> 2183
    //   2551: aload #30
    //   2553: iload #32
    //   2555: aload #29
    //   2557: iload #33
    //   2559: iaload
    //   2560: iastore
    //   2561: aload #30
    //   2563: iload #32
    //   2565: iconst_1
    //   2566: iadd
    //   2567: aload #29
    //   2569: iload #33
    //   2571: iconst_1
    //   2572: iadd
    //   2573: iaload
    //   2574: iastore
    //   2575: aload #30
    //   2577: iload #32
    //   2579: iconst_2
    //   2580: iadd
    //   2581: aload #29
    //   2583: iload #33
    //   2585: iconst_2
    //   2586: iadd
    //   2587: iaload
    //   2588: iastore
    //   2589: aload #30
    //   2591: iload #32
    //   2593: iconst_3
    //   2594: iadd
    //   2595: aload #29
    //   2597: iload #33
    //   2599: iconst_3
    //   2600: iadd
    //   2601: iaload
    //   2602: iastore
    //   2603: iconst_0
    //   2604: newarray byte
    //   2606: astore #35
    //   2608: aload #6
    //   2610: arraylength
    //   2611: bipush #16
    //   2613: irem
    //   2614: ifeq -> 2638
    //   2617: new java/lang/Exception
    //   2620: dup
    //   2621: sipush #27161
    //   2624: sipush #-5558
    //   2627: invokestatic a : (II)Ljava/lang/String;
    //   2630: invokespecial <init> : (Ljava/lang/String;)V
    //   2633: athrow
    //   2634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2637: athrow
    //   2638: bipush #10
    //   2640: istore #36
    //   2642: sipush #27152
    //   2645: sipush #256
    //   2648: newarray byte
    //   2650: astore #37
    //   2652: sipush #3144
    //   2655: sipush #256
    //   2658: newarray int
    //   2660: astore #38
    //   2662: sipush #256
    //   2665: newarray int
    //   2667: astore #39
    //   2669: sipush #256
    //   2672: newarray int
    //   2674: astore #40
    //   2676: sipush #256
    //   2679: newarray int
    //   2681: astore #41
    //   2683: sipush #283
    //   2686: istore #14
    //   2688: invokestatic a : (II)Ljava/lang/String;
    //   2691: astore #42
    //   2693: iconst_0
    //   2694: istore #16
    //   2696: iload #16
    //   2698: sipush #256
    //   2701: if_icmpge -> 2928
    //   2704: aload #42
    //   2706: iload #16
    //   2708: iconst_1
    //   2709: iushr
    //   2710: invokevirtual charAt : (I)C
    //   2713: istore #43
    //   2715: iload #16
    //   2717: iconst_1
    //   2718: iand
    //   2719: ifne -> 2734
    //   2722: iload #43
    //   2724: bipush #8
    //   2726: iushr
    //   2727: goto -> 2736
    //   2730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2733: athrow
    //   2734: iload #43
    //   2736: i2b
    //   2737: sipush #255
    //   2740: iand
    //   2741: istore #15
    //   2743: iload #16
    //   2745: iconst_1
    //   2746: ishl
    //   2747: istore #17
    //   2749: iload #17
    //   2751: sipush #256
    //   2754: if_icmplt -> 2764
    //   2757: iload #17
    //   2759: iload #14
    //   2761: ixor
    //   2762: istore #17
    //   2764: iload #17
    //   2766: iconst_1
    //   2767: ishl
    //   2768: istore #18
    //   2770: iload #18
    //   2772: sipush #256
    //   2775: if_icmplt -> 2785
    //   2778: iload #18
    //   2780: iload #14
    //   2782: ixor
    //   2783: istore #18
    //   2785: iload #18
    //   2787: iconst_1
    //   2788: ishl
    //   2789: istore #19
    //   2791: iload #19
    //   2793: sipush #256
    //   2796: if_icmplt -> 2806
    //   2799: iload #19
    //   2801: iload #14
    //   2803: ixor
    //   2804: istore #19
    //   2806: iload #19
    //   2808: iload #16
    //   2810: ixor
    //   2811: istore #20
    //   2813: iload #20
    //   2815: iload #17
    //   2817: ixor
    //   2818: istore #21
    //   2820: iload #20
    //   2822: iload #18
    //   2824: ixor
    //   2825: istore #22
    //   2827: iload #19
    //   2829: iload #18
    //   2831: ixor
    //   2832: iload #17
    //   2834: ixor
    //   2835: istore #23
    //   2837: aload #37
    //   2839: iload #15
    //   2841: iload #16
    //   2843: i2b
    //   2844: bastore
    //   2845: aload #38
    //   2847: iload #15
    //   2849: iload #23
    //   2851: bipush #24
    //   2853: ishl
    //   2854: iload #20
    //   2856: bipush #16
    //   2858: ishl
    //   2859: ior
    //   2860: iload #22
    //   2862: bipush #8
    //   2864: ishl
    //   2865: ior
    //   2866: iload #21
    //   2868: ior
    //   2869: dup
    //   2870: istore #24
    //   2872: iastore
    //   2873: aload #39
    //   2875: iload #15
    //   2877: iload #24
    //   2879: bipush #8
    //   2881: iushr
    //   2882: iload #24
    //   2884: bipush #24
    //   2886: ishl
    //   2887: ior
    //   2888: iastore
    //   2889: aload #40
    //   2891: iload #15
    //   2893: iload #24
    //   2895: bipush #16
    //   2897: iushr
    //   2898: iload #24
    //   2900: bipush #16
    //   2902: ishl
    //   2903: ior
    //   2904: iastore
    //   2905: aload #41
    //   2907: iload #15
    //   2909: iload #24
    //   2911: bipush #24
    //   2913: iushr
    //   2914: iload #24
    //   2916: bipush #8
    //   2918: ishl
    //   2919: ior
    //   2920: iastore
    //   2921: iinc #16, 1
    //   2924: iload_2
    //   2925: ifeq -> 2696
    //   2928: aload #6
    //   2930: arraylength
    //   2931: newarray byte
    //   2933: astore #43
    //   2935: iconst_0
    //   2936: istore #44
    //   2938: iload #44
    //   2940: aload #6
    //   2942: arraylength
    //   2943: bipush #16
    //   2945: idiv
    //   2946: if_icmpge -> 3860
    //   2949: bipush #16
    //   2951: newarray byte
    //   2953: astore #45
    //   2955: bipush #16
    //   2957: newarray byte
    //   2959: astore #46
    //   2961: iconst_0
    //   2962: istore #47
    //   2964: iload #47
    //   2966: bipush #16
    //   2968: if_icmpge -> 2994
    //   2971: aload #45
    //   2973: iload #47
    //   2975: aload #6
    //   2977: iload #47
    //   2979: iload #44
    //   2981: bipush #16
    //   2983: imul
    //   2984: iadd
    //   2985: baload
    //   2986: bastore
    //   2987: iinc #47, 1
    //   2990: iload_2
    //   2991: ifeq -> 2964
    //   2994: iconst_0
    //   2995: istore #47
    //   2997: aload #45
    //   2999: iconst_0
    //   3000: baload
    //   3001: bipush #24
    //   3003: ishl
    //   3004: aload #45
    //   3006: iconst_1
    //   3007: baload
    //   3008: sipush #255
    //   3011: iand
    //   3012: bipush #16
    //   3014: ishl
    //   3015: ior
    //   3016: aload #45
    //   3018: iconst_2
    //   3019: baload
    //   3020: sipush #255
    //   3023: iand
    //   3024: bipush #8
    //   3026: ishl
    //   3027: ior
    //   3028: aload #45
    //   3030: iconst_3
    //   3031: baload
    //   3032: sipush #255
    //   3035: iand
    //   3036: ior
    //   3037: aload #30
    //   3039: iconst_0
    //   3040: iaload
    //   3041: ixor
    //   3042: istore #49
    //   3044: aload #45
    //   3046: iconst_4
    //   3047: baload
    //   3048: bipush #24
    //   3050: ishl
    //   3051: aload #45
    //   3053: iconst_5
    //   3054: baload
    //   3055: sipush #255
    //   3058: iand
    //   3059: bipush #16
    //   3061: ishl
    //   3062: ior
    //   3063: aload #45
    //   3065: bipush #6
    //   3067: baload
    //   3068: sipush #255
    //   3071: iand
    //   3072: bipush #8
    //   3074: ishl
    //   3075: ior
    //   3076: aload #45
    //   3078: bipush #7
    //   3080: baload
    //   3081: sipush #255
    //   3084: iand
    //   3085: ior
    //   3086: aload #30
    //   3088: iconst_1
    //   3089: iaload
    //   3090: ixor
    //   3091: istore #50
    //   3093: aload #45
    //   3095: bipush #8
    //   3097: baload
    //   3098: bipush #24
    //   3100: ishl
    //   3101: aload #45
    //   3103: bipush #9
    //   3105: baload
    //   3106: sipush #255
    //   3109: iand
    //   3110: bipush #16
    //   3112: ishl
    //   3113: ior
    //   3114: aload #45
    //   3116: bipush #10
    //   3118: baload
    //   3119: sipush #255
    //   3122: iand
    //   3123: bipush #8
    //   3125: ishl
    //   3126: ior
    //   3127: aload #45
    //   3129: bipush #11
    //   3131: baload
    //   3132: sipush #255
    //   3135: iand
    //   3136: ior
    //   3137: aload #30
    //   3139: iconst_2
    //   3140: iaload
    //   3141: ixor
    //   3142: istore #51
    //   3144: aload #45
    //   3146: bipush #12
    //   3148: baload
    //   3149: bipush #24
    //   3151: ishl
    //   3152: aload #45
    //   3154: bipush #13
    //   3156: baload
    //   3157: sipush #255
    //   3160: iand
    //   3161: bipush #16
    //   3163: ishl
    //   3164: ior
    //   3165: aload #45
    //   3167: bipush #14
    //   3169: baload
    //   3170: sipush #255
    //   3173: iand
    //   3174: bipush #8
    //   3176: ishl
    //   3177: ior
    //   3178: aload #45
    //   3180: bipush #15
    //   3182: baload
    //   3183: sipush #255
    //   3186: iand
    //   3187: ior
    //   3188: aload #30
    //   3190: iconst_3
    //   3191: iaload
    //   3192: ixor
    //   3193: istore #52
    //   3195: iconst_1
    //   3196: istore #53
    //   3198: iload #53
    //   3200: iload #36
    //   3202: if_icmpge -> 3445
    //   3205: iinc #47, 4
    //   3208: aload #38
    //   3210: iload #49
    //   3212: bipush #24
    //   3214: iushr
    //   3215: iaload
    //   3216: aload #39
    //   3218: iload #52
    //   3220: bipush #16
    //   3222: iushr
    //   3223: sipush #255
    //   3226: iand
    //   3227: iaload
    //   3228: ixor
    //   3229: aload #40
    //   3231: iload #51
    //   3233: bipush #8
    //   3235: iushr
    //   3236: sipush #255
    //   3239: iand
    //   3240: iaload
    //   3241: ixor
    //   3242: aload #41
    //   3244: iload #50
    //   3246: sipush #255
    //   3249: iand
    //   3250: iaload
    //   3251: ixor
    //   3252: aload #30
    //   3254: iload #47
    //   3256: iaload
    //   3257: ixor
    //   3258: istore #54
    //   3260: aload #38
    //   3262: iload #50
    //   3264: bipush #24
    //   3266: iushr
    //   3267: iaload
    //   3268: aload #39
    //   3270: iload #49
    //   3272: bipush #16
    //   3274: iushr
    //   3275: sipush #255
    //   3278: iand
    //   3279: iaload
    //   3280: ixor
    //   3281: aload #40
    //   3283: iload #52
    //   3285: bipush #8
    //   3287: iushr
    //   3288: sipush #255
    //   3291: iand
    //   3292: iaload
    //   3293: ixor
    //   3294: aload #41
    //   3296: iload #51
    //   3298: sipush #255
    //   3301: iand
    //   3302: iaload
    //   3303: ixor
    //   3304: aload #30
    //   3306: iload #47
    //   3308: iconst_1
    //   3309: iadd
    //   3310: iaload
    //   3311: ixor
    //   3312: istore #55
    //   3314: aload #38
    //   3316: iload #51
    //   3318: bipush #24
    //   3320: iushr
    //   3321: iaload
    //   3322: aload #39
    //   3324: iload #50
    //   3326: bipush #16
    //   3328: iushr
    //   3329: sipush #255
    //   3332: iand
    //   3333: iaload
    //   3334: ixor
    //   3335: aload #40
    //   3337: iload #49
    //   3339: bipush #8
    //   3341: iushr
    //   3342: sipush #255
    //   3345: iand
    //   3346: iaload
    //   3347: ixor
    //   3348: aload #41
    //   3350: iload #52
    //   3352: sipush #255
    //   3355: iand
    //   3356: iaload
    //   3357: ixor
    //   3358: aload #30
    //   3360: iload #47
    //   3362: iconst_2
    //   3363: iadd
    //   3364: iaload
    //   3365: ixor
    //   3366: istore #56
    //   3368: aload #38
    //   3370: iload #52
    //   3372: bipush #24
    //   3374: iushr
    //   3375: iaload
    //   3376: aload #39
    //   3378: iload #51
    //   3380: bipush #16
    //   3382: iushr
    //   3383: sipush #255
    //   3386: iand
    //   3387: iaload
    //   3388: ixor
    //   3389: aload #40
    //   3391: iload #50
    //   3393: bipush #8
    //   3395: iushr
    //   3396: sipush #255
    //   3399: iand
    //   3400: iaload
    //   3401: ixor
    //   3402: aload #41
    //   3404: iload #49
    //   3406: sipush #255
    //   3409: iand
    //   3410: iaload
    //   3411: ixor
    //   3412: aload #30
    //   3414: iload #47
    //   3416: iconst_3
    //   3417: iadd
    //   3418: iaload
    //   3419: ixor
    //   3420: istore #57
    //   3422: iload #54
    //   3424: istore #49
    //   3426: iload #55
    //   3428: istore #50
    //   3430: iload #56
    //   3432: istore #51
    //   3434: iload #57
    //   3436: istore #52
    //   3438: iinc #53, 1
    //   3441: iload_2
    //   3442: ifeq -> 3198
    //   3445: iinc #47, 4
    //   3448: aload #30
    //   3450: iload #47
    //   3452: iaload
    //   3453: istore #48
    //   3455: aload #46
    //   3457: iconst_0
    //   3458: aload #37
    //   3460: iload #49
    //   3462: bipush #24
    //   3464: iushr
    //   3465: baload
    //   3466: iload #48
    //   3468: bipush #24
    //   3470: iushr
    //   3471: ixor
    //   3472: i2b
    //   3473: bastore
    //   3474: aload #46
    //   3476: iconst_1
    //   3477: aload #37
    //   3479: iload #52
    //   3481: bipush #16
    //   3483: iushr
    //   3484: sipush #255
    //   3487: iand
    //   3488: baload
    //   3489: iload #48
    //   3491: bipush #16
    //   3493: iushr
    //   3494: ixor
    //   3495: i2b
    //   3496: bastore
    //   3497: aload #46
    //   3499: iconst_2
    //   3500: aload #37
    //   3502: iload #51
    //   3504: bipush #8
    //   3506: iushr
    //   3507: sipush #255
    //   3510: iand
    //   3511: baload
    //   3512: iload #48
    //   3514: bipush #8
    //   3516: iushr
    //   3517: ixor
    //   3518: i2b
    //   3519: bastore
    //   3520: aload #46
    //   3522: iconst_3
    //   3523: aload #37
    //   3525: iload #50
    //   3527: sipush #255
    //   3530: iand
    //   3531: baload
    //   3532: iload #48
    //   3534: ixor
    //   3535: i2b
    //   3536: bastore
    //   3537: aload #30
    //   3539: iload #47
    //   3541: iconst_1
    //   3542: iadd
    //   3543: iaload
    //   3544: istore #48
    //   3546: aload #46
    //   3548: iconst_4
    //   3549: aload #37
    //   3551: iload #50
    //   3553: bipush #24
    //   3555: iushr
    //   3556: baload
    //   3557: iload #48
    //   3559: bipush #24
    //   3561: iushr
    //   3562: ixor
    //   3563: i2b
    //   3564: bastore
    //   3565: aload #46
    //   3567: iconst_5
    //   3568: aload #37
    //   3570: iload #49
    //   3572: bipush #16
    //   3574: iushr
    //   3575: sipush #255
    //   3578: iand
    //   3579: baload
    //   3580: iload #48
    //   3582: bipush #16
    //   3584: iushr
    //   3585: ixor
    //   3586: i2b
    //   3587: bastore
    //   3588: aload #46
    //   3590: bipush #6
    //   3592: aload #37
    //   3594: iload #52
    //   3596: bipush #8
    //   3598: iushr
    //   3599: sipush #255
    //   3602: iand
    //   3603: baload
    //   3604: iload #48
    //   3606: bipush #8
    //   3608: iushr
    //   3609: ixor
    //   3610: i2b
    //   3611: bastore
    //   3612: aload #46
    //   3614: bipush #7
    //   3616: aload #37
    //   3618: iload #51
    //   3620: sipush #255
    //   3623: iand
    //   3624: baload
    //   3625: iload #48
    //   3627: ixor
    //   3628: i2b
    //   3629: bastore
    //   3630: aload #30
    //   3632: iload #47
    //   3634: iconst_2
    //   3635: iadd
    //   3636: iaload
    //   3637: istore #48
    //   3639: aload #46
    //   3641: bipush #8
    //   3643: aload #37
    //   3645: iload #51
    //   3647: bipush #24
    //   3649: iushr
    //   3650: baload
    //   3651: iload #48
    //   3653: bipush #24
    //   3655: iushr
    //   3656: ixor
    //   3657: i2b
    //   3658: bastore
    //   3659: aload #46
    //   3661: bipush #9
    //   3663: aload #37
    //   3665: iload #50
    //   3667: bipush #16
    //   3669: iushr
    //   3670: sipush #255
    //   3673: iand
    //   3674: baload
    //   3675: iload #48
    //   3677: bipush #16
    //   3679: iushr
    //   3680: ixor
    //   3681: i2b
    //   3682: bastore
    //   3683: aload #46
    //   3685: bipush #10
    //   3687: aload #37
    //   3689: iload #49
    //   3691: bipush #8
    //   3693: iushr
    //   3694: sipush #255
    //   3697: iand
    //   3698: baload
    //   3699: iload #48
    //   3701: bipush #8
    //   3703: iushr
    //   3704: ixor
    //   3705: i2b
    //   3706: bastore
    //   3707: aload #46
    //   3709: bipush #11
    //   3711: aload #37
    //   3713: iload #52
    //   3715: sipush #255
    //   3718: iand
    //   3719: baload
    //   3720: iload #48
    //   3722: ixor
    //   3723: i2b
    //   3724: bastore
    //   3725: aload #30
    //   3727: iload #47
    //   3729: iconst_3
    //   3730: iadd
    //   3731: iaload
    //   3732: istore #48
    //   3734: aload #46
    //   3736: bipush #12
    //   3738: aload #37
    //   3740: iload #52
    //   3742: bipush #24
    //   3744: iushr
    //   3745: baload
    //   3746: iload #48
    //   3748: bipush #24
    //   3750: iushr
    //   3751: ixor
    //   3752: i2b
    //   3753: bastore
    //   3754: aload #46
    //   3756: bipush #13
    //   3758: aload #37
    //   3760: iload #51
    //   3762: bipush #16
    //   3764: iushr
    //   3765: sipush #255
    //   3768: iand
    //   3769: baload
    //   3770: iload #48
    //   3772: bipush #16
    //   3774: iushr
    //   3775: ixor
    //   3776: i2b
    //   3777: bastore
    //   3778: aload #46
    //   3780: bipush #14
    //   3782: aload #37
    //   3784: iload #50
    //   3786: bipush #8
    //   3788: iushr
    //   3789: sipush #255
    //   3792: iand
    //   3793: baload
    //   3794: iload #48
    //   3796: bipush #8
    //   3798: iushr
    //   3799: ixor
    //   3800: i2b
    //   3801: bastore
    //   3802: aload #46
    //   3804: bipush #15
    //   3806: aload #37
    //   3808: iload #49
    //   3810: sipush #255
    //   3813: iand
    //   3814: baload
    //   3815: iload #48
    //   3817: ixor
    //   3818: i2b
    //   3819: bastore
    //   3820: iconst_0
    //   3821: istore #53
    //   3823: iload #53
    //   3825: bipush #16
    //   3827: if_icmpge -> 3853
    //   3830: aload #43
    //   3832: iload #53
    //   3834: iload #44
    //   3836: bipush #16
    //   3838: imul
    //   3839: iadd
    //   3840: aload #46
    //   3842: iload #53
    //   3844: baload
    //   3845: bastore
    //   3846: iinc #53, 1
    //   3849: iload_2
    //   3850: ifeq -> 3823
    //   3853: iinc #44, 1
    //   3856: iload_2
    //   3857: ifeq -> 2938
    //   3860: aload #43
    //   3862: arraylength
    //   3863: ifle -> 3944
    //   3866: aload #43
    //   3868: aload #43
    //   3870: arraylength
    //   3871: iconst_1
    //   3872: isub
    //   3873: baload
    //   3874: istore #44
    //   3876: iload #44
    //   3878: bipush #16
    //   3880: if_icmple -> 3891
    //   3883: aload #43
    //   3885: astore #35
    //   3887: iload_2
    //   3888: ifeq -> 3944
    //   3891: aload #43
    //   3893: arraylength
    //   3894: iload #44
    //   3896: isub
    //   3897: newarray byte
    //   3899: astore #35
    //   3901: iconst_0
    //   3902: istore #45
    //   3904: iload #45
    //   3906: aload #35
    //   3908: arraylength
    //   3909: if_icmpge -> 3944
    //   3912: iload #45
    //   3914: aload #43
    //   3916: arraylength
    //   3917: if_icmpge -> 3944
    //   3920: aload #35
    //   3922: iload #45
    //   3924: aload #43
    //   3926: iload #45
    //   3928: baload
    //   3929: bastore
    //   3930: iinc #45, 1
    //   3933: iload_2
    //   3934: ifeq -> 3904
    //   3937: goto -> 3944
    //   3940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3943: athrow
    //   3944: aload #35
    //   3946: astore #7
    //   3948: getstatic burp/Zrdo.Zj : Ljava/lang/String;
    //   3951: getstatic burp/Zrc0.Zz : Ljava/lang/Object;
    //   3954: checkcast java/math/BigInteger
    //   3957: invokevirtual intValue : ()I
    //   3960: bipush #32
    //   3962: irem
    //   3963: invokestatic abs : (I)I
    //   3966: invokevirtual charAt : (I)C
    //   3969: getstatic burp/Zmou.ZP : Ljava/lang/String;
    //   3972: getstatic burp/Zgh3.ZZ : Ljava/lang/Object;
    //   3975: checkcast java/math/BigInteger
    //   3978: invokevirtual intValue : ()I
    //   3981: bipush #32
    //   3983: irem
    //   3984: invokestatic abs : (I)I
    //   3987: invokevirtual charAt : (I)C
    //   3990: if_icmpgt -> 4097
    //   3993: getstatic burp/Zmwx.ZB : Ljava/lang/String;
    //   3996: getstatic burp/Zk52.Zu : Ljava/lang/Object;
    //   3999: checkcast java/math/BigInteger
    //   4002: invokevirtual intValue : ()I
    //   4005: bipush #32
    //   4007: irem
    //   4008: invokestatic abs : (I)I
    //   4011: invokevirtual charAt : (I)C
    //   4014: getstatic burp/Zm54.Zg : Ljava/lang/String;
    //   4017: getstatic burp/Zg8.ZX : Ljava/lang/Object;
    //   4020: checkcast java/math/BigInteger
    //   4023: invokevirtual intValue : ()I
    //   4026: bipush #32
    //   4028: irem
    //   4029: invokestatic abs : (I)I
    //   4032: invokevirtual charAt : (I)C
    //   4035: if_icmpgt -> 4097
    //   4038: goto -> 4045
    //   4041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4044: athrow
    //   4045: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   4048: getstatic burp/Zs4v.ZB : Ljava/lang/Object;
    //   4051: checkcast java/math/BigInteger
    //   4054: invokevirtual intValue : ()I
    //   4057: bipush #32
    //   4059: irem
    //   4060: invokestatic abs : (I)I
    //   4063: invokevirtual charAt : (I)C
    //   4066: getstatic burp/Zgz2.ZI : Ljava/lang/String;
    //   4069: getstatic burp/Zbu6.ZJ : Ljava/lang/Object;
    //   4072: checkcast java/math/BigInteger
    //   4075: invokevirtual intValue : ()I
    //   4078: bipush #32
    //   4080: irem
    //   4081: invokestatic abs : (I)I
    //   4084: invokevirtual charAt : (I)C
    //   4087: if_icmple -> 4105
    //   4090: goto -> 4097
    //   4093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4096: athrow
    //   4097: iconst_1
    //   4098: goto -> 4106
    //   4101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4104: athrow
    //   4105: iconst_0
    //   4106: ireturn
    //   4107: astore_3
    //   4108: new java/lang/Exception
    //   4111: dup
    //   4112: aload_3
    //   4113: invokevirtual getMessage : ()Ljava/lang/String;
    //   4116: invokespecial <init> : (Ljava/lang/String;)V
    //   4119: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4106	4107	java/lang/Throwable
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
    //   1159	1173	1173	java/lang/Throwable
    //   1184	1197	1200	java/lang/Throwable
    //   1189	1212	1215	java/lang/Throwable
    //   1204	1230	1233	java/lang/Throwable
    //   1219	1260	1263	java/lang/Throwable
    //   1323	1350	1353	java/lang/Throwable
    //   1340	1371	1374	java/lang/Throwable
    //   1357	1401	1404	java/lang/Throwable
    //   1378	1412	1412	java/lang/Throwable
    //   1423	1439	1442	java/lang/Throwable
    //   1591	1606	1606	java/lang/Throwable
    //   2608	2634	2634	java/lang/Throwable
    //   2715	2730	2730	java/lang/Throwable
    //   3912	3937	3940	java/lang/Throwable
    //   3948	4038	4041	java/lang/Throwable
    //   3993	4090	4093	java/lang/Throwable
    //   4045	4101	4101	java/lang/Throwable
  }
  
  static void ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Ze(Object paramObject) {
    Zmou.ZP = a(27160, -3814);
    Zmou.ZT = new BigInteger(a(27153, 31628));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgl4.ZX.charAt(Math.abs(((BigInteger)Zzuh.ZV).intValue() % 32)) <= Zr64.Zj.charAt(Math.abs(((BigInteger)Zmcb.ZR).intValue() % 32))) {
          try {
            Zljx.Zj(Class.forName(a(27155, -20604)));
            if (bool)
              Zlfg.ZJ(Class.forName(a(27156, -27404))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlfg.ZJ(Class.forName(a(27156, -27404)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ';WÅÈ´sÔÌ¶7Üë^ÆR1uUÌ¦Äç*$öca.×SØ!Ð÷R"Ù«ªü4§ªkJ¥«ÕlÌsþVðVn挀眎澋フ枹﹜꬯쫬쥭揄䟧궉ꊭ鳻狧럿鎙㛪㐰焇ㄉѿ⌽ᣘ֖ݭ耱뉶৚ⲑᯖ嫫劊혷⥵⿏卾⃸뇁櫺뺪䫉堚퀃ꪮ䏷㎙䕸ȑ偫鼊兕䂻銭㡧뱅?ဧ촠Ꮇ待䓸쓬织撳᧙恌佡≺遽䛞렂?ୀ㫊䦒⑞쉧겶醝㟦趒井沣攉껦뫲◫Ჯ뒘璉䭑诙瀎떦䣳憳垹蚺ᴷ顲榽蹲鬣蜿컼⣌谉觽뿉䈓䄄ⴘ끞묳\\t÷ðï.x±í掊矎澓ヿ枺︙ꭏ쩄쥡滛䝦괫ꊝ鲯狡띵鍙㚻㐚煂ㅩӗ⌱ᣍԗߏ老뉰ॐⱑᮇ嫳加혴⤰⾯取⃭녀橘뺚䪝堜킉ꩮ䎦㎁䕒Ȓ倮齪函䂷銸㣦볧?ၳ춪፷忔䓠쓆组擶ᦹ惤佭≯郼䙼렲?୆㨊䧃⑆쉍겵釘㟪趇且氁敝껠멸┫᳾뒀璊䬔讹炦떪䣦愑垉蛮ᴱ颲槬蹪鬉蜼캹⢬財觱뿜䊒䆦⴨뀊묵\\tP2ü¿ñÝ\\tÙ+*U?yFT#ß\\t},¾µ­\\f)ï.èæ9Ùg5è¶kÜ/'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #122
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
    //   68: ldc 'Î¢qêß#-"%ØÑª\\n³êûOøäË©;4C®! h­ÅwÜÃ¼6ÌAHªHÈÜûø<ÿtN¤ÿ¾bz¿d'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #7
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
    //   129: putstatic burp/Zgz2.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgz2.b : [Ljava/lang/String;
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
    //   212: bipush #80
    //   214: goto -> 244
    //   217: bipush #21
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #19
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #71
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
    //   300: sipush #27163
    //   303: sipush #-13070
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgz2.ZI : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #50
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-4
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #44
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #59
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-47
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #56
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-44
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-35
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #82
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #33
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-115
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-63
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-11
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #52
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #48
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #63
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-114
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #124
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #25
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #34
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-104
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-35
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-91
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-126
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #107
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-35
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-17
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-27
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-72
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #70
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-105
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-19
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zgz2.Zs : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6A11) & 0xFFFF;
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
      char c = 'å';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */