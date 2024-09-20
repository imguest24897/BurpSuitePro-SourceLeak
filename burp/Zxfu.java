package burp;

import java.math.BigInteger;

class Zxfu extends ClassLoader {
  static String Zo;
  
  static Object ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzai.Z_ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: iconst_2
    //   17: iadd
    //   18: newarray byte
    //   20: astore #5
    //   22: iconst_0
    //   23: istore #6
    //   25: iload #6
    //   27: aload_3
    //   28: arraylength
    //   29: if_icmpge -> 48
    //   32: aload #5
    //   34: iload #6
    //   36: aload_3
    //   37: iload #6
    //   39: baload
    //   40: bastore
    //   41: iinc #6, 1
    //   44: iload_2
    //   45: ifeq -> 25
    //   48: aload #5
    //   50: arraylength
    //   51: iconst_3
    //   52: idiv
    //   53: iconst_4
    //   54: imul
    //   55: newarray byte
    //   57: astore #4
    //   59: iconst_0
    //   60: istore #6
    //   62: iconst_0
    //   63: istore #7
    //   65: iload #6
    //   67: aload_3
    //   68: arraylength
    //   69: if_icmpge -> 180
    //   72: aload #4
    //   74: iload #7
    //   76: aload #5
    //   78: iload #6
    //   80: baload
    //   81: iconst_2
    //   82: iushr
    //   83: bipush #63
    //   85: iand
    //   86: i2b
    //   87: bastore
    //   88: aload #4
    //   90: iload #7
    //   92: iconst_1
    //   93: iadd
    //   94: aload #5
    //   96: iload #6
    //   98: iconst_1
    //   99: iadd
    //   100: baload
    //   101: iconst_4
    //   102: iushr
    //   103: bipush #15
    //   105: iand
    //   106: aload #5
    //   108: iload #6
    //   110: baload
    //   111: iconst_4
    //   112: ishl
    //   113: bipush #63
    //   115: iand
    //   116: ior
    //   117: i2b
    //   118: bastore
    //   119: aload #4
    //   121: iload #7
    //   123: iconst_2
    //   124: iadd
    //   125: aload #5
    //   127: iload #6
    //   129: iconst_2
    //   130: iadd
    //   131: baload
    //   132: bipush #6
    //   134: iushr
    //   135: iconst_3
    //   136: iand
    //   137: aload #5
    //   139: iload #6
    //   141: iconst_1
    //   142: iadd
    //   143: baload
    //   144: iconst_2
    //   145: ishl
    //   146: bipush #63
    //   148: iand
    //   149: ior
    //   150: i2b
    //   151: bastore
    //   152: aload #4
    //   154: iload #7
    //   156: iconst_3
    //   157: iadd
    //   158: aload #5
    //   160: iload #6
    //   162: iconst_2
    //   163: iadd
    //   164: baload
    //   165: bipush #63
    //   167: iand
    //   168: i2b
    //   169: bastore
    //   170: iinc #6, 3
    //   173: iinc #7, 4
    //   176: iload_2
    //   177: ifeq -> 65
    //   180: iconst_0
    //   181: istore #6
    //   183: iload #6
    //   185: aload #4
    //   187: arraylength
    //   188: if_icmpge -> 372
    //   191: aload #4
    //   193: iload #6
    //   195: baload
    //   196: bipush #26
    //   198: if_icmpge -> 226
    //   201: aload #4
    //   203: iload #6
    //   205: aload #4
    //   207: iload #6
    //   209: baload
    //   210: bipush #65
    //   212: iadd
    //   213: i2b
    //   214: bastore
    //   215: iload_2
    //   216: ifeq -> 365
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: athrow
    //   226: aload #4
    //   228: iload #6
    //   230: baload
    //   231: bipush #52
    //   233: if_icmpge -> 271
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: aload #4
    //   245: iload #6
    //   247: aload #4
    //   249: iload #6
    //   251: baload
    //   252: bipush #97
    //   254: iadd
    //   255: bipush #26
    //   257: isub
    //   258: i2b
    //   259: bastore
    //   260: iload_2
    //   261: ifeq -> 365
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: aload #4
    //   273: iload #6
    //   275: baload
    //   276: bipush #62
    //   278: if_icmpge -> 316
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   287: athrow
    //   288: aload #4
    //   290: iload #6
    //   292: aload #4
    //   294: iload #6
    //   296: baload
    //   297: bipush #48
    //   299: iadd
    //   300: bipush #52
    //   302: isub
    //   303: i2b
    //   304: bastore
    //   305: iload_2
    //   306: ifeq -> 365
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload #4
    //   318: iload #6
    //   320: baload
    //   321: bipush #63
    //   323: if_icmpge -> 351
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload #4
    //   335: iload #6
    //   337: bipush #43
    //   339: bastore
    //   340: iload_2
    //   341: ifeq -> 365
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #47
    //   357: bastore
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: iinc #6, 1
    //   368: iload_2
    //   369: ifeq -> 183
    //   372: aload #4
    //   374: arraylength
    //   375: iconst_1
    //   376: isub
    //   377: istore #6
    //   379: iload #6
    //   381: aload_3
    //   382: arraylength
    //   383: iconst_4
    //   384: imul
    //   385: iconst_3
    //   386: idiv
    //   387: if_icmple -> 404
    //   390: aload #4
    //   392: iload #6
    //   394: bipush #61
    //   396: bastore
    //   397: iinc #6, -1
    //   400: iload_2
    //   401: ifeq -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zer.Zk : Ljava/lang/Object;
    //   419: sipush #-22103
    //   422: getstatic burp/Zz1k.ZP : Ljava/lang/Object;
    //   425: checkcast java/math/BigInteger
    //   428: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   437: putstatic burp/Zehi.Zb : Ljava/lang/Object;
    //   440: sipush #30139
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: iconst_1
    //   447: ldc burp/Zlsw
    //   449: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   452: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   455: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   458: astore_3
    //   459: aload_3
    //   460: arraylength
    //   461: istore #4
    //   463: iconst_0
    //   464: istore #5
    //   466: iload #5
    //   468: iload #4
    //   470: if_icmpge -> 607
    //   473: aload_3
    //   474: iload #5
    //   476: aaload
    //   477: astore #6
    //   479: aload #6
    //   481: invokevirtual getModifiers : ()I
    //   484: invokestatic isStatic : (I)Z
    //   487: ifne -> 497
    //   490: goto -> 600
    //   493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   496: athrow
    //   497: aload #6
    //   499: invokevirtual getType : ()Ljava/lang/Class;
    //   502: astore #7
    //   504: aload #7
    //   506: ifnull -> 587
    //   509: aload #7
    //   511: invokevirtual isPrimitive : ()Z
    //   514: ifne -> 587
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   523: athrow
    //   524: aload #7
    //   526: invokevirtual getPackage : ()Ljava/lang/Package;
    //   529: ifnull -> 587
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: ifnull -> 587
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #7
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: sipush #-22102
    //   568: sipush #29936
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   577: ifne -> 587
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: aload #6
    //   589: iconst_1
    //   590: invokevirtual setAccessible : (Z)V
    //   593: aload #6
    //   595: aconst_null
    //   596: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   599: pop
    //   600: iinc #5, 1
    //   603: iload_2
    //   604: ifeq -> 466
    //   607: sipush #-22106
    //   610: sipush #-7446
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   619: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   622: astore_3
    //   623: aload_3
    //   624: arraylength
    //   625: istore #4
    //   627: iconst_0
    //   628: istore #5
    //   630: iload #5
    //   632: iload #4
    //   634: if_icmpge -> 766
    //   637: aload_3
    //   638: iload #5
    //   640: aaload
    //   641: astore #6
    //   643: aload #6
    //   645: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   648: pop
    //   649: aload #6
    //   651: invokevirtual getModifiers : ()I
    //   654: invokestatic isStatic : (I)Z
    //   657: ifeq -> 752
    //   660: aload #6
    //   662: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   665: arraylength
    //   666: iconst_2
    //   667: if_icmpne -> 752
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: aload #6
    //   679: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   682: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   688: ifeq -> 752
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload #6
    //   700: iconst_1
    //   701: invokevirtual setAccessible : (Z)V
    //   704: aload #6
    //   706: aconst_null
    //   707: iconst_2
    //   708: anewarray java/lang/Object
    //   711: dup
    //   712: iconst_0
    //   713: aload_0
    //   714: aastore
    //   715: dup
    //   716: iconst_1
    //   717: aload_1
    //   718: ifnonnull -> 736
    //   721: goto -> 728
    //   724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   727: athrow
    //   728: aload_1
    //   729: goto -> 743
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: aload_1
    //   737: checkcast [B
    //   740: invokevirtual clone : ()Ljava/lang/Object;
    //   743: aastore
    //   744: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   747: pop
    //   748: iload_2
    //   749: ifeq -> 766
    //   752: iinc #5, 1
    //   755: iload_2
    //   756: ifeq -> 630
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   765: athrow
    //   766: getstatic burp/Zzai.Z_ : Ljava/lang/Object;
    //   769: checkcast java/math/BigInteger
    //   772: invokevirtual toByteArray : ()[B
    //   775: astore_3
    //   776: iconst_0
    //   777: istore #5
    //   779: iconst_0
    //   780: istore #6
    //   782: iload #6
    //   784: aload_3
    //   785: arraylength
    //   786: if_icmpge -> 931
    //   789: aload_3
    //   790: iload #6
    //   792: baload
    //   793: istore #7
    //   795: iload #7
    //   797: bipush #48
    //   799: if_icmplt -> 816
    //   802: iload #7
    //   804: bipush #57
    //   806: if_icmple -> 914
    //   809: goto -> 816
    //   812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   815: athrow
    //   816: iload #7
    //   818: bipush #65
    //   820: if_icmplt -> 844
    //   823: goto -> 830
    //   826: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   829: athrow
    //   830: iload #7
    //   832: bipush #90
    //   834: if_icmple -> 914
    //   837: goto -> 844
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: iload #7
    //   846: bipush #97
    //   848: if_icmplt -> 872
    //   851: goto -> 858
    //   854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   857: athrow
    //   858: iload #7
    //   860: bipush #122
    //   862: if_icmple -> 914
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: iload #7
    //   874: bipush #43
    //   876: if_icmpeq -> 914
    //   879: goto -> 886
    //   882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   885: athrow
    //   886: iload #7
    //   888: bipush #47
    //   890: if_icmpeq -> 914
    //   893: goto -> 900
    //   896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   899: athrow
    //   900: iload #7
    //   902: bipush #61
    //   904: if_icmpne -> 924
    //   907: goto -> 914
    //   910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   913: athrow
    //   914: iinc #5, 1
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: iinc #6, 1
    //   927: iload_2
    //   928: ifeq -> 782
    //   931: iload #5
    //   933: newarray byte
    //   935: astore #6
    //   937: iconst_0
    //   938: istore #7
    //   940: iconst_0
    //   941: istore #8
    //   943: iload #8
    //   945: aload_3
    //   946: arraylength
    //   947: if_icmpge -> 1099
    //   950: aload_3
    //   951: iload #8
    //   953: baload
    //   954: istore #9
    //   956: iload #9
    //   958: bipush #48
    //   960: if_icmplt -> 977
    //   963: iload #9
    //   965: bipush #57
    //   967: if_icmple -> 1075
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   976: athrow
    //   977: iload #9
    //   979: bipush #65
    //   981: if_icmplt -> 1005
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: iload #9
    //   993: bipush #90
    //   995: if_icmple -> 1075
    //   998: goto -> 1005
    //   1001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1004: athrow
    //   1005: iload #9
    //   1007: bipush #97
    //   1009: if_icmplt -> 1033
    //   1012: goto -> 1019
    //   1015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1018: athrow
    //   1019: iload #9
    //   1021: bipush #122
    //   1023: if_icmple -> 1075
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1032: athrow
    //   1033: iload #9
    //   1035: bipush #43
    //   1037: if_icmpeq -> 1075
    //   1040: goto -> 1047
    //   1043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1046: athrow
    //   1047: iload #9
    //   1049: bipush #47
    //   1051: if_icmpeq -> 1075
    //   1054: goto -> 1061
    //   1057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1060: athrow
    //   1061: iload #9
    //   1063: bipush #61
    //   1065: if_icmpne -> 1092
    //   1068: goto -> 1075
    //   1071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1074: athrow
    //   1075: aload #6
    //   1077: iload #7
    //   1079: iload #9
    //   1081: bastore
    //   1082: iinc #7, 1
    //   1085: goto -> 1092
    //   1088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1091: athrow
    //   1092: iinc #8, 1
    //   1095: iload_2
    //   1096: ifeq -> 943
    //   1099: aload #6
    //   1101: astore #4
    //   1103: aload #4
    //   1105: astore_3
    //   1106: aload_3
    //   1107: arraylength
    //   1108: istore #5
    //   1110: aload_3
    //   1111: iload #5
    //   1113: iconst_1
    //   1114: isub
    //   1115: baload
    //   1116: bipush #61
    //   1118: if_icmpne -> 1128
    //   1121: iinc #5, -1
    //   1124: iload_2
    //   1125: ifeq -> 1110
    //   1128: iload #5
    //   1130: aload_3
    //   1131: arraylength
    //   1132: iconst_4
    //   1133: idiv
    //   1134: isub
    //   1135: newarray byte
    //   1137: astore #6
    //   1139: iconst_0
    //   1140: istore #7
    //   1142: iload #7
    //   1144: aload_3
    //   1145: arraylength
    //   1146: if_icmpge -> 1408
    //   1149: aload_3
    //   1150: iload #7
    //   1152: baload
    //   1153: bipush #61
    //   1155: if_icmpne -> 1174
    //   1158: aload_3
    //   1159: iload #7
    //   1161: iconst_0
    //   1162: bastore
    //   1163: iload_2
    //   1164: ifeq -> 1401
    //   1167: goto -> 1174
    //   1170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1173: athrow
    //   1174: aload_3
    //   1175: iload #7
    //   1177: baload
    //   1178: bipush #47
    //   1180: if_icmpne -> 1207
    //   1183: goto -> 1190
    //   1186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1189: athrow
    //   1190: aload_3
    //   1191: iload #7
    //   1193: bipush #63
    //   1195: bastore
    //   1196: iload_2
    //   1197: ifeq -> 1401
    //   1200: goto -> 1207
    //   1203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1206: athrow
    //   1207: aload_3
    //   1208: iload #7
    //   1210: baload
    //   1211: bipush #43
    //   1213: if_icmpne -> 1240
    //   1216: goto -> 1223
    //   1219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1222: athrow
    //   1223: aload_3
    //   1224: iload #7
    //   1226: bipush #62
    //   1228: bastore
    //   1229: iload_2
    //   1230: ifeq -> 1401
    //   1233: goto -> 1240
    //   1236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1239: athrow
    //   1240: aload_3
    //   1241: iload #7
    //   1243: baload
    //   1244: bipush #48
    //   1246: if_icmplt -> 1295
    //   1249: goto -> 1256
    //   1252: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1255: athrow
    //   1256: aload_3
    //   1257: iload #7
    //   1259: baload
    //   1260: bipush #57
    //   1262: if_icmpgt -> 1295
    //   1265: goto -> 1272
    //   1268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1271: athrow
    //   1272: aload_3
    //   1273: iload #7
    //   1275: aload_3
    //   1276: iload #7
    //   1278: baload
    //   1279: bipush #-4
    //   1281: isub
    //   1282: i2b
    //   1283: bastore
    //   1284: iload_2
    //   1285: ifeq -> 1401
    //   1288: goto -> 1295
    //   1291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1294: athrow
    //   1295: aload_3
    //   1296: iload #7
    //   1298: baload
    //   1299: bipush #97
    //   1301: if_icmplt -> 1350
    //   1304: goto -> 1311
    //   1307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1310: athrow
    //   1311: aload_3
    //   1312: iload #7
    //   1314: baload
    //   1315: bipush #122
    //   1317: if_icmpgt -> 1350
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: aload_3
    //   1328: iload #7
    //   1330: aload_3
    //   1331: iload #7
    //   1333: baload
    //   1334: bipush #71
    //   1336: isub
    //   1337: i2b
    //   1338: bastore
    //   1339: iload_2
    //   1340: ifeq -> 1401
    //   1343: goto -> 1350
    //   1346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1349: athrow
    //   1350: aload_3
    //   1351: iload #7
    //   1353: baload
    //   1354: bipush #65
    //   1356: if_icmplt -> 1401
    //   1359: goto -> 1366
    //   1362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1365: athrow
    //   1366: aload_3
    //   1367: iload #7
    //   1369: baload
    //   1370: bipush #90
    //   1372: if_icmpgt -> 1401
    //   1375: goto -> 1382
    //   1378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1381: athrow
    //   1382: aload_3
    //   1383: iload #7
    //   1385: aload_3
    //   1386: iload #7
    //   1388: baload
    //   1389: bipush #65
    //   1391: isub
    //   1392: i2b
    //   1393: bastore
    //   1394: goto -> 1401
    //   1397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1400: athrow
    //   1401: iinc #7, 1
    //   1404: iload_2
    //   1405: ifeq -> 1142
    //   1408: iconst_0
    //   1409: istore #7
    //   1411: iconst_0
    //   1412: istore #8
    //   1414: iload #8
    //   1416: aload #6
    //   1418: arraylength
    //   1419: iconst_2
    //   1420: isub
    //   1421: if_icmpge -> 1524
    //   1424: aload #6
    //   1426: iload #8
    //   1428: aload_3
    //   1429: iload #7
    //   1431: baload
    //   1432: iconst_2
    //   1433: ishl
    //   1434: sipush #255
    //   1437: iand
    //   1438: aload_3
    //   1439: iload #7
    //   1441: iconst_1
    //   1442: iadd
    //   1443: baload
    //   1444: iconst_4
    //   1445: iushr
    //   1446: iconst_3
    //   1447: iand
    //   1448: ior
    //   1449: i2b
    //   1450: bastore
    //   1451: aload #6
    //   1453: iload #8
    //   1455: iconst_1
    //   1456: iadd
    //   1457: aload_3
    //   1458: iload #7
    //   1460: iconst_1
    //   1461: iadd
    //   1462: baload
    //   1463: iconst_4
    //   1464: ishl
    //   1465: sipush #255
    //   1468: iand
    //   1469: aload_3
    //   1470: iload #7
    //   1472: iconst_2
    //   1473: iadd
    //   1474: baload
    //   1475: iconst_2
    //   1476: iushr
    //   1477: bipush #15
    //   1479: iand
    //   1480: ior
    //   1481: i2b
    //   1482: bastore
    //   1483: aload #6
    //   1485: iload #8
    //   1487: iconst_2
    //   1488: iadd
    //   1489: aload_3
    //   1490: iload #7
    //   1492: iconst_2
    //   1493: iadd
    //   1494: baload
    //   1495: bipush #6
    //   1497: ishl
    //   1498: sipush #255
    //   1501: iand
    //   1502: aload_3
    //   1503: iload #7
    //   1505: iconst_3
    //   1506: iadd
    //   1507: baload
    //   1508: bipush #63
    //   1510: iand
    //   1511: ior
    //   1512: i2b
    //   1513: bastore
    //   1514: iinc #7, 4
    //   1517: iinc #8, 3
    //   1520: iload_2
    //   1521: ifeq -> 1414
    //   1524: iload #8
    //   1526: aload #6
    //   1528: arraylength
    //   1529: if_icmpge -> 1566
    //   1532: aload #6
    //   1534: iload #8
    //   1536: aload_3
    //   1537: iload #7
    //   1539: baload
    //   1540: iconst_2
    //   1541: ishl
    //   1542: sipush #255
    //   1545: iand
    //   1546: aload_3
    //   1547: iload #7
    //   1549: iconst_1
    //   1550: iadd
    //   1551: baload
    //   1552: iconst_4
    //   1553: iushr
    //   1554: iconst_3
    //   1555: iand
    //   1556: ior
    //   1557: i2b
    //   1558: bastore
    //   1559: goto -> 1566
    //   1562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1565: athrow
    //   1566: iinc #8, 1
    //   1569: iload #8
    //   1571: aload #6
    //   1573: arraylength
    //   1574: if_icmpge -> 1614
    //   1577: aload #6
    //   1579: iload #8
    //   1581: aload_3
    //   1582: iload #7
    //   1584: iconst_1
    //   1585: iadd
    //   1586: baload
    //   1587: iconst_4
    //   1588: ishl
    //   1589: sipush #255
    //   1592: iand
    //   1593: aload_3
    //   1594: iload #7
    //   1596: iconst_2
    //   1597: iadd
    //   1598: baload
    //   1599: iconst_2
    //   1600: iushr
    //   1601: bipush #15
    //   1603: iand
    //   1604: ior
    //   1605: i2b
    //   1606: bastore
    //   1607: goto -> 1614
    //   1610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1613: athrow
    //   1614: aload #6
    //   1616: astore #4
    //   1618: new java/io/ByteArrayOutputStream
    //   1621: dup
    //   1622: invokespecial <init> : ()V
    //   1625: astore_3
    //   1626: sipush #-22107
    //   1629: aload_3
    //   1630: sipush #202
    //   1633: invokevirtual write : (I)V
    //   1636: sipush #21053
    //   1639: aload_3
    //   1640: sipush #254
    //   1643: invokevirtual write : (I)V
    //   1646: aload_3
    //   1647: sipush #186
    //   1650: invokevirtual write : (I)V
    //   1653: aload_3
    //   1654: sipush #190
    //   1657: invokevirtual write : (I)V
    //   1660: aload_3
    //   1661: iconst_0
    //   1662: invokevirtual write : (I)V
    //   1665: aload_3
    //   1666: iconst_1
    //   1667: invokevirtual write : (I)V
    //   1670: aload_3
    //   1671: iconst_0
    //   1672: invokevirtual write : (I)V
    //   1675: aload_3
    //   1676: bipush #50
    //   1678: invokevirtual write : (I)V
    //   1681: aload_3
    //   1682: getstatic burp/Zlxm.Zc : Ljava/lang/Object;
    //   1685: checkcast java/math/BigInteger
    //   1688: invokevirtual toByteArray : ()[B
    //   1691: invokevirtual write : ([B)V
    //   1694: aload_3
    //   1695: getstatic burp/Zb6e.ZD : Ljava/lang/Object;
    //   1698: checkcast java/math/BigInteger
    //   1701: invokevirtual toByteArray : ()[B
    //   1704: invokevirtual write : ([B)V
    //   1707: aload_3
    //   1708: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
    //   1711: checkcast java/math/BigInteger
    //   1714: invokevirtual toByteArray : ()[B
    //   1717: invokevirtual write : ([B)V
    //   1720: aload_3
    //   1721: invokevirtual toByteArray : ()[B
    //   1724: astore #4
    //   1726: aconst_null
    //   1727: astore #5
    //   1729: invokestatic a : (II)Ljava/lang/String;
    //   1732: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1735: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1738: astore #6
    //   1740: aload #6
    //   1742: arraylength
    //   1743: istore #7
    //   1745: iconst_0
    //   1746: istore #8
    //   1748: iload #8
    //   1750: iload #7
    //   1752: if_icmpge -> 1880
    //   1755: aload #6
    //   1757: iload #8
    //   1759: aaload
    //   1760: astore #9
    //   1762: aload #9
    //   1764: invokevirtual getName : ()Ljava/lang/String;
    //   1767: sipush #-22105
    //   1770: sipush #18755
    //   1773: invokestatic a : (II)Ljava/lang/String;
    //   1776: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1779: ifeq -> 1873
    //   1782: aload #9
    //   1784: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1787: astore #10
    //   1789: aload #10
    //   1791: arraylength
    //   1792: iconst_4
    //   1793: if_icmpeq -> 1803
    //   1796: goto -> 1873
    //   1799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1802: athrow
    //   1803: aload #10
    //   1805: iconst_0
    //   1806: aaload
    //   1807: ldc java/lang/String
    //   1809: if_acmpeq -> 1819
    //   1812: goto -> 1873
    //   1815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1818: athrow
    //   1819: aload #10
    //   1821: iconst_1
    //   1822: aaload
    //   1823: ldc [B
    //   1825: if_acmpeq -> 1835
    //   1828: goto -> 1873
    //   1831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1834: athrow
    //   1835: aload #10
    //   1837: iconst_2
    //   1838: aaload
    //   1839: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1842: if_acmpeq -> 1852
    //   1845: goto -> 1873
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #10
    //   1854: iconst_3
    //   1855: aaload
    //   1856: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1859: if_acmpeq -> 1869
    //   1862: goto -> 1873
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: aload #9
    //   1871: astore #5
    //   1873: iinc #8, 1
    //   1876: iload_2
    //   1877: ifeq -> 1748
    //   1880: aload #5
    //   1882: iconst_1
    //   1883: invokevirtual setAccessible : (Z)V
    //   1886: ldc burp/Zr64
    //   1888: iconst_0
    //   1889: anewarray java/lang/Class
    //   1892: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1895: astore #6
    //   1897: aload #6
    //   1899: iconst_1
    //   1900: invokevirtual setAccessible : (Z)V
    //   1903: aload #5
    //   1905: aload #6
    //   1907: iconst_0
    //   1908: anewarray java/lang/Object
    //   1911: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1914: iconst_4
    //   1915: anewarray java/lang/Object
    //   1918: dup
    //   1919: iconst_0
    //   1920: sipush #-22109
    //   1923: sipush #-19560
    //   1926: invokestatic a : (II)Ljava/lang/String;
    //   1929: aastore
    //   1930: dup
    //   1931: iconst_1
    //   1932: aload #4
    //   1934: aastore
    //   1935: dup
    //   1936: iconst_2
    //   1937: iconst_0
    //   1938: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1941: aastore
    //   1942: dup
    //   1943: iconst_3
    //   1944: aload #4
    //   1946: arraylength
    //   1947: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1950: aastore
    //   1951: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1954: pop
    //   1955: goto -> 1959
    //   1958: astore_3
    //   1959: getstatic burp/Zod.ZS : Ljava/lang/String;
    //   1962: getstatic burp/Zb3z.ZR : Ljava/lang/Object;
    //   1965: checkcast java/math/BigInteger
    //   1968: invokevirtual intValue : ()I
    //   1971: bipush #32
    //   1973: irem
    //   1974: invokestatic abs : (I)I
    //   1977: invokevirtual charAt : (I)C
    //   1980: getstatic burp/Ze3j.ZI : Ljava/lang/String;
    //   1983: getstatic burp/Zkig.ZK : Ljava/lang/Object;
    //   1986: checkcast java/math/BigInteger
    //   1989: invokevirtual intValue : ()I
    //   1992: bipush #32
    //   1994: irem
    //   1995: invokestatic abs : (I)I
    //   1998: invokevirtual charAt : (I)C
    //   2001: if_icmpgt -> 2108
    //   2004: getstatic burp/Zb2s.Zq : Ljava/lang/String;
    //   2007: getstatic burp/Ze3j.Ze : Ljava/lang/Object;
    //   2010: checkcast java/math/BigInteger
    //   2013: invokevirtual intValue : ()I
    //   2016: bipush #32
    //   2018: irem
    //   2019: invokestatic abs : (I)I
    //   2022: invokevirtual charAt : (I)C
    //   2025: getstatic burp/Zehi.Zi : Ljava/lang/String;
    //   2028: getstatic burp/Zkyc.ZD : Ljava/lang/Object;
    //   2031: checkcast java/math/BigInteger
    //   2034: invokevirtual intValue : ()I
    //   2037: bipush #32
    //   2039: irem
    //   2040: invokestatic abs : (I)I
    //   2043: invokevirtual charAt : (I)C
    //   2046: if_icmple -> 2108
    //   2049: goto -> 2056
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: getstatic burp/Zgw0.ZL : Ljava/lang/String;
    //   2059: getstatic burp/Zmj4.Zm : Ljava/lang/Object;
    //   2062: checkcast java/math/BigInteger
    //   2065: invokevirtual intValue : ()I
    //   2068: bipush #32
    //   2070: irem
    //   2071: invokestatic abs : (I)I
    //   2074: invokevirtual charAt : (I)C
    //   2077: getstatic burp/Ze7q.ZW : Ljava/lang/String;
    //   2080: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   2083: checkcast java/math/BigInteger
    //   2086: invokevirtual intValue : ()I
    //   2089: bipush #32
    //   2091: irem
    //   2092: invokestatic abs : (I)I
    //   2095: invokevirtual charAt : (I)C
    //   2098: if_icmple -> 2116
    //   2101: goto -> 2108
    //   2104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2107: athrow
    //   2108: iconst_1
    //   2109: goto -> 2117
    //   2112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2115: athrow
    //   2116: iconst_0
    //   2117: ireturn
    //   2118: astore_3
    //   2119: new java/lang/Exception
    //   2122: dup
    //   2123: aload_3
    //   2124: invokevirtual getMessage : ()Ljava/lang/String;
    //   2127: invokespecial <init> : (Ljava/lang/String;)V
    //   2130: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2117	2118	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   479	493	493	java/lang/Throwable
    //   504	517	520	java/lang/Throwable
    //   509	532	535	java/lang/Throwable
    //   524	550	553	java/lang/Throwable
    //   539	580	583	java/lang/Throwable
    //   643	670	673	java/lang/Throwable
    //   660	691	694	java/lang/Throwable
    //   677	721	724	java/lang/Throwable
    //   698	732	732	java/lang/Throwable
    //   743	759	762	java/lang/Throwable
    //   795	809	812	java/lang/Throwable
    //   802	823	826	java/lang/Throwable
    //   816	837	840	java/lang/Throwable
    //   830	851	854	java/lang/Throwable
    //   844	865	868	java/lang/Throwable
    //   858	879	882	java/lang/Throwable
    //   872	893	896	java/lang/Throwable
    //   886	907	910	java/lang/Throwable
    //   900	917	920	java/lang/Throwable
    //   956	970	973	java/lang/Throwable
    //   963	984	987	java/lang/Throwable
    //   977	998	1001	java/lang/Throwable
    //   991	1012	1015	java/lang/Throwable
    //   1005	1026	1029	java/lang/Throwable
    //   1019	1040	1043	java/lang/Throwable
    //   1033	1054	1057	java/lang/Throwable
    //   1047	1068	1071	java/lang/Throwable
    //   1061	1085	1088	java/lang/Throwable
    //   1149	1167	1170	java/lang/Throwable
    //   1158	1183	1186	java/lang/Throwable
    //   1174	1200	1203	java/lang/Throwable
    //   1190	1216	1219	java/lang/Throwable
    //   1207	1233	1236	java/lang/Throwable
    //   1223	1249	1252	java/lang/Throwable
    //   1240	1265	1268	java/lang/Throwable
    //   1256	1288	1291	java/lang/Throwable
    //   1272	1304	1307	java/lang/Throwable
    //   1295	1320	1323	java/lang/Throwable
    //   1311	1343	1346	java/lang/Throwable
    //   1327	1359	1362	java/lang/Throwable
    //   1350	1375	1378	java/lang/Throwable
    //   1366	1394	1397	java/lang/Throwable
    //   1524	1559	1562	java/lang/Throwable
    //   1566	1607	1610	java/lang/Throwable
    //   1618	1955	1958	java/lang/Throwable
    //   1789	1799	1799	java/lang/Throwable
    //   1803	1815	1815	java/lang/Throwable
    //   1819	1831	1831	java/lang/Throwable
    //   1835	1848	1848	java/lang/Throwable
    //   1852	1865	1865	java/lang/Throwable
    //   1959	2049	2052	java/lang/Throwable
    //   2004	2101	2104	java/lang/Throwable
    //   2056	2112	2112	java/lang/Throwable
  }
  
  static void ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zl(Object paramObject) {
    Zzip.Za = a(-22104, -15566);
    Zzip.ZW = new BigInteger(a(-22111, 27506));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzip.Za.charAt(Math.abs(((BigInteger)Zzqj.Zq).intValue() % 32)) <= Zzip.Za.charAt(Math.abs(((BigInteger)Zgmt.ZX).intValue() % 32))) {
          try {
            Zgrf.Zt(Class.forName(a(-22108, -13712)));
            if (bool)
              Ze13.ZA(Class.forName(a(-22110, -30613))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze13.ZA(Class.forName(a(-22110, -30613)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '«WÝ-ôE4ëNOcWo®W!>ÝÔÑ\\b1«½"dMÔT\\bHæ&è¯wöÁÊ8óaÀ\\rã\\bþ­rnfsÉ~\\r)h5E5]ÊÄB èú^Õµ±9ø ´ «º,1Lß¨:w\\t©Â«¾+ä\\byßØHËÞÃ`\\t'Ü(²îè]ï\\nÉ×\\b'`¡r/YÖÌf\\to&wËÿÆýË¹ñ*|e u¾°nDÒy%õç0¹½&'ÂYeHòTëà%Á'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #9
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
    //   68: ldc '.±yÎ´yd;?#Ø+'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_3
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zxfu.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zxfu.b : [Ljava/lang/String;
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
    //   212: bipush #124
    //   214: goto -> 244
    //   217: bipush #42
    //   219: goto -> 244
    //   222: bipush #12
    //   224: goto -> 244
    //   227: bipush #117
    //   229: goto -> 244
    //   232: bipush #107
    //   234: goto -> 244
    //   237: bipush #73
    //   239: goto -> 244
    //   242: bipush #99
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
    //   300: sipush #-22112
    //   303: sipush #-15510
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zxfu.Zo : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: iconst_1
    //   323: bastore
    //   324: dup
    //   325: iconst_1
    //   326: bipush #-82
    //   328: bastore
    //   329: dup
    //   330: iconst_2
    //   331: bipush #-62
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #9
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #-116
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #127
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #-118
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #-57
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #75
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: iconst_3
    //   371: bastore
    //   372: dup
    //   373: bipush #10
    //   375: bipush #36
    //   377: bastore
    //   378: dup
    //   379: bipush #11
    //   381: bipush #-17
    //   383: bastore
    //   384: dup
    //   385: bipush #12
    //   387: bipush #119
    //   389: bastore
    //   390: dup
    //   391: bipush #13
    //   393: bipush #126
    //   395: bastore
    //   396: dup
    //   397: bipush #14
    //   399: bipush #-109
    //   401: bastore
    //   402: dup
    //   403: bipush #15
    //   405: bipush #122
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #95
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #-114
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #-64
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #77
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #21
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: bipush #-2
    //   443: bastore
    //   444: dup
    //   445: bipush #22
    //   447: bipush #-21
    //   449: bastore
    //   450: dup
    //   451: bipush #23
    //   453: bipush #-67
    //   455: bastore
    //   456: dup
    //   457: bipush #24
    //   459: bipush #87
    //   461: bastore
    //   462: dup
    //   463: bipush #25
    //   465: bipush #25
    //   467: bastore
    //   468: dup
    //   469: bipush #26
    //   471: bipush #93
    //   473: bastore
    //   474: dup
    //   475: bipush #27
    //   477: bipush #-53
    //   479: bastore
    //   480: dup
    //   481: bipush #28
    //   483: bipush #-100
    //   485: bastore
    //   486: dup
    //   487: bipush #29
    //   489: bipush #58
    //   491: bastore
    //   492: dup
    //   493: bipush #30
    //   495: bipush #-54
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #-7
    //   503: bastore
    //   504: invokespecial <init> : ([B)V
    //   507: putstatic burp/Zxfu.ZA : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA9A0) & 0xFFFF;
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
      byte b1 = 22;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */