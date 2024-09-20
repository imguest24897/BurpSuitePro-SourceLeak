package burp;

import java.math.BigInteger;

class Zgrz extends ClassLoader {
  static Object ZX;
  
  static String Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs8w.ZW : Ljava/lang/Object;
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
    //   45: ifne -> 25
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
    //   177: ifne -> 65
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
    //   216: ifne -> 365
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
    //   261: ifne -> 365
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
    //   306: ifne -> 365
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
    //   341: ifne -> 365
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
    //   369: ifne -> 183
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
    //   401: ifne -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zkjj.Zh : Ljava/lang/Object;
    //   419: sipush #-3398
    //   422: sipush #20649
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: iconst_1
    //   429: ldc burp/Zk7w
    //   431: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   434: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   437: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   440: astore_3
    //   441: aload_3
    //   442: arraylength
    //   443: istore #4
    //   445: iconst_0
    //   446: istore #5
    //   448: iload #5
    //   450: iload #4
    //   452: if_icmpge -> 589
    //   455: aload_3
    //   456: iload #5
    //   458: aaload
    //   459: astore #6
    //   461: aload #6
    //   463: invokevirtual getModifiers : ()I
    //   466: invokestatic isStatic : (I)Z
    //   469: ifne -> 479
    //   472: goto -> 582
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload #6
    //   481: invokevirtual getType : ()Ljava/lang/Class;
    //   484: astore #7
    //   486: aload #7
    //   488: ifnull -> 569
    //   491: aload #7
    //   493: invokevirtual isPrimitive : ()Z
    //   496: ifne -> 569
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #7
    //   508: invokevirtual getPackage : ()Ljava/lang/Package;
    //   511: ifnull -> 569
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #7
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: invokevirtual getName : ()Ljava/lang/String;
    //   529: ifnull -> 569
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: sipush #-3404
    //   550: sipush #-28232
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   559: ifne -> 569
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   568: athrow
    //   569: aload #6
    //   571: iconst_1
    //   572: invokevirtual setAccessible : (Z)V
    //   575: aload #6
    //   577: aconst_null
    //   578: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   581: pop
    //   582: iinc #5, 1
    //   585: iload_2
    //   586: ifne -> 448
    //   589: sipush #-3402
    //   592: sipush #-4774
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   601: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   604: astore_3
    //   605: aload_3
    //   606: arraylength
    //   607: istore #4
    //   609: iconst_0
    //   610: istore #5
    //   612: iload #5
    //   614: iload #4
    //   616: if_icmpge -> 748
    //   619: aload_3
    //   620: iload #5
    //   622: aaload
    //   623: astore #6
    //   625: aload #6
    //   627: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   630: pop
    //   631: aload #6
    //   633: invokevirtual getModifiers : ()I
    //   636: invokestatic isStatic : (I)Z
    //   639: ifeq -> 734
    //   642: aload #6
    //   644: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   647: arraylength
    //   648: iconst_2
    //   649: if_icmpne -> 734
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: aload #6
    //   661: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   664: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   670: ifeq -> 734
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #6
    //   682: iconst_1
    //   683: invokevirtual setAccessible : (Z)V
    //   686: aload #6
    //   688: aconst_null
    //   689: iconst_2
    //   690: anewarray java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_0
    //   696: aastore
    //   697: dup
    //   698: iconst_1
    //   699: aload_1
    //   700: ifnonnull -> 718
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   709: athrow
    //   710: aload_1
    //   711: goto -> 725
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_1
    //   719: checkcast [B
    //   722: invokevirtual clone : ()Ljava/lang/Object;
    //   725: aastore
    //   726: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   729: pop
    //   730: iload_2
    //   731: ifne -> 748
    //   734: iinc #5, 1
    //   737: iload_2
    //   738: ifne -> 612
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: getstatic burp/Zex0.Ze : Ljava/lang/Object;
    //   751: checkcast java/math/BigInteger
    //   754: invokevirtual intValue : ()I
    //   757: i2l
    //   758: invokestatic currentTimeMillis : ()J
    //   761: ladd
    //   762: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   765: checkcast java/math/BigInteger
    //   768: invokevirtual intValue : ()I
    //   771: i2l
    //   772: lcmp
    //   773: ifge -> 1105
    //   776: sipush #-3415
    //   779: sipush #-18339
    //   782: invokestatic a : (II)Ljava/lang/String;
    //   785: iconst_1
    //   786: ldc burp/Zgly
    //   788: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   791: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   794: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   797: astore_3
    //   798: aload_3
    //   799: arraylength
    //   800: istore #4
    //   802: iconst_0
    //   803: istore #5
    //   805: iload #5
    //   807: iload #4
    //   809: if_icmpge -> 946
    //   812: aload_3
    //   813: iload #5
    //   815: aaload
    //   816: astore #6
    //   818: aload #6
    //   820: invokevirtual getModifiers : ()I
    //   823: invokestatic isStatic : (I)Z
    //   826: ifne -> 836
    //   829: goto -> 939
    //   832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   835: athrow
    //   836: aload #6
    //   838: invokevirtual getType : ()Ljava/lang/Class;
    //   841: astore #7
    //   843: aload #7
    //   845: ifnull -> 926
    //   848: aload #7
    //   850: invokevirtual isPrimitive : ()Z
    //   853: ifne -> 926
    //   856: goto -> 863
    //   859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   862: athrow
    //   863: aload #7
    //   865: invokevirtual getPackage : ()Ljava/lang/Package;
    //   868: ifnull -> 926
    //   871: goto -> 878
    //   874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   877: athrow
    //   878: aload #7
    //   880: invokevirtual getPackage : ()Ljava/lang/Package;
    //   883: invokevirtual getName : ()Ljava/lang/String;
    //   886: ifnull -> 926
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: aload #7
    //   898: invokevirtual getPackage : ()Ljava/lang/Package;
    //   901: invokevirtual getName : ()Ljava/lang/String;
    //   904: sipush #-3405
    //   907: sipush #-18868
    //   910: invokestatic a : (II)Ljava/lang/String;
    //   913: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   916: ifne -> 926
    //   919: goto -> 926
    //   922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   925: athrow
    //   926: aload #6
    //   928: iconst_1
    //   929: invokevirtual setAccessible : (Z)V
    //   932: aload #6
    //   934: aconst_null
    //   935: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   938: pop
    //   939: iinc #5, 1
    //   942: iload_2
    //   943: ifne -> 805
    //   946: sipush #-3424
    //   949: sipush #22908
    //   952: invokestatic a : (II)Ljava/lang/String;
    //   955: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   958: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   961: astore_3
    //   962: aload_3
    //   963: arraylength
    //   964: istore #4
    //   966: iconst_0
    //   967: istore #5
    //   969: iload #5
    //   971: iload #4
    //   973: if_icmpge -> 1105
    //   976: aload_3
    //   977: iload #5
    //   979: aaload
    //   980: astore #6
    //   982: aload #6
    //   984: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   987: pop
    //   988: aload #6
    //   990: invokevirtual getModifiers : ()I
    //   993: invokestatic isStatic : (I)Z
    //   996: ifeq -> 1091
    //   999: aload #6
    //   1001: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1004: arraylength
    //   1005: iconst_2
    //   1006: if_icmpne -> 1091
    //   1009: goto -> 1016
    //   1012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1015: athrow
    //   1016: aload #6
    //   1018: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1021: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1024: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1027: ifeq -> 1091
    //   1030: goto -> 1037
    //   1033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1036: athrow
    //   1037: aload #6
    //   1039: iconst_1
    //   1040: invokevirtual setAccessible : (Z)V
    //   1043: aload #6
    //   1045: aconst_null
    //   1046: iconst_2
    //   1047: anewarray java/lang/Object
    //   1050: dup
    //   1051: iconst_0
    //   1052: aload_0
    //   1053: aastore
    //   1054: dup
    //   1055: iconst_1
    //   1056: aload_1
    //   1057: ifnonnull -> 1075
    //   1060: goto -> 1067
    //   1063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1066: athrow
    //   1067: aload_1
    //   1068: goto -> 1082
    //   1071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1074: athrow
    //   1075: aload_1
    //   1076: checkcast [B
    //   1079: invokevirtual clone : ()Ljava/lang/Object;
    //   1082: aastore
    //   1083: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1086: pop
    //   1087: iload_2
    //   1088: ifne -> 1105
    //   1091: iinc #5, 1
    //   1094: iload_2
    //   1095: ifne -> 969
    //   1098: goto -> 1105
    //   1101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1104: athrow
    //   1105: getstatic burp/Zz7j.ZR : Ljava/lang/Object;
    //   1108: checkcast java/math/BigInteger
    //   1111: invokevirtual toByteArray : ()[B
    //   1114: astore_3
    //   1115: bipush #32
    //   1117: newarray int
    //   1119: dup
    //   1120: iconst_0
    //   1121: ldc 943331329
    //   1123: iastore
    //   1124: dup
    //   1125: iconst_1
    //   1126: ldc 170788368
    //   1128: iastore
    //   1129: dup
    //   1130: iconst_2
    //   1131: ldc 1008414755
    //   1133: iastore
    //   1134: dup
    //   1135: iconst_3
    //   1136: ldc 187049985
    //   1138: iastore
    //   1139: dup
    //   1140: iconst_4
    //   1141: ldc 1010368540
    //   1143: iastore
    //   1144: dup
    //   1145: iconst_5
    //   1146: ldc 220604441
    //   1148: iastore
    //   1149: dup
    //   1150: bipush #6
    //   1152: ldc 940377620
    //   1154: iastore
    //   1155: dup
    //   1156: bipush #7
    //   1158: ldc 255209728
    //   1160: iastore
    //   1161: dup
    //   1162: bipush #8
    //   1164: ldc 689771012
    //   1166: iastore
    //   1167: dup
    //   1168: bipush #9
    //   1170: ldc 221709344
    //   1172: iastore
    //   1173: dup
    //   1174: bipush #10
    //   1176: ldc 957157408
    //   1178: iastore
    //   1179: dup
    //   1180: bipush #11
    //   1182: ldc 892536332
    //   1184: iastore
    //   1185: dup
    //   1186: bipush #12
    //   1188: ldc 722417666
    //   1190: iastore
    //   1191: dup
    //   1192: bipush #13
    //   1194: ldc 1026621720
    //   1196: iastore
    //   1197: dup
    //   1198: bipush #14
    //   1200: ldc 655302664
    //   1202: iastore
    //   1203: dup
    //   1204: bipush #15
    //   1206: ldc 890966315
    //   1208: iastore
    //   1209: dup
    //   1210: bipush #16
    //   1212: ldc 187632156
    //   1214: iastore
    //   1215: dup
    //   1216: bipush #17
    //   1218: ldc 874189824
    //   1220: iastore
    //   1221: dup
    //   1222: bipush #18
    //   1224: ldc 254150144
    //   1226: iastore
    //   1227: dup
    //   1228: bipush #19
    //   1230: ldc 924386310
    //   1232: iastore
    //   1233: dup
    //   1234: bipush #20
    //   1236: ldc 121057538
    //   1238: iastore
    //   1239: dup
    //   1240: bipush #21
    //   1242: ldc 840500228
    //   1244: iastore
    //   1245: dup
    //   1246: bipush #22
    //   1248: ldc 389160971
    //   1250: iastore
    //   1251: dup
    //   1252: bipush #23
    //   1254: ldc 907870729
    //   1256: iastore
    //   1257: dup
    //   1258: bipush #24
    //   1260: ldc 389426184
    //   1262: iastore
    //   1263: dup
    //   1264: bipush #25
    //   1266: ldc 973875457
    //   1268: iastore
    //   1269: dup
    //   1270: bipush #26
    //   1272: ldc 372376604
    //   1274: iastore
    //   1275: dup
    //   1276: bipush #27
    //   1278: ldc 707731490
    //   1280: iastore
    //   1281: dup
    //   1282: bipush #28
    //   1284: ldc 1043334948
    //   1286: iastore
    //   1287: dup
    //   1288: bipush #29
    //   1290: ldc 439222784
    //   1292: iastore
    //   1293: dup
    //   1294: bipush #30
    //   1296: ldc 876216579
    //   1298: iastore
    //   1299: dup
    //   1300: bipush #31
    //   1302: ldc 455999525
    //   1304: iastore
    //   1305: astore #5
    //   1307: bipush #8
    //   1309: aload_3
    //   1310: arraylength
    //   1311: bipush #8
    //   1313: irem
    //   1314: isub
    //   1315: istore #6
    //   1317: aload_3
    //   1318: arraylength
    //   1319: iload #6
    //   1321: iadd
    //   1322: newarray byte
    //   1324: astore #7
    //   1326: iconst_0
    //   1327: istore #8
    //   1329: iload #8
    //   1331: aload_3
    //   1332: arraylength
    //   1333: if_icmpge -> 1352
    //   1336: aload #7
    //   1338: iload #8
    //   1340: aload_3
    //   1341: iload #8
    //   1343: baload
    //   1344: bastore
    //   1345: iinc #8, 1
    //   1348: iload_2
    //   1349: ifne -> 1329
    //   1352: aload_3
    //   1353: arraylength
    //   1354: istore #8
    //   1356: iload #8
    //   1358: aload #7
    //   1360: arraylength
    //   1361: if_icmpge -> 1379
    //   1364: aload #7
    //   1366: iload #8
    //   1368: iload #6
    //   1370: i2b
    //   1371: bastore
    //   1372: iinc #8, 1
    //   1375: iload_2
    //   1376: ifne -> 1356
    //   1379: aload #7
    //   1381: astore_3
    //   1382: bipush #64
    //   1384: newarray int
    //   1386: dup
    //   1387: iconst_0
    //   1388: ldc 16843776
    //   1390: iastore
    //   1391: dup
    //   1392: iconst_1
    //   1393: iconst_0
    //   1394: iastore
    //   1395: dup
    //   1396: iconst_2
    //   1397: ldc 65536
    //   1399: iastore
    //   1400: dup
    //   1401: iconst_3
    //   1402: ldc 16843780
    //   1404: iastore
    //   1405: dup
    //   1406: iconst_4
    //   1407: ldc 16842756
    //   1409: iastore
    //   1410: dup
    //   1411: iconst_5
    //   1412: ldc 66564
    //   1414: iastore
    //   1415: dup
    //   1416: bipush #6
    //   1418: iconst_4
    //   1419: iastore
    //   1420: dup
    //   1421: bipush #7
    //   1423: ldc 65536
    //   1425: iastore
    //   1426: dup
    //   1427: bipush #8
    //   1429: sipush #1024
    //   1432: iastore
    //   1433: dup
    //   1434: bipush #9
    //   1436: ldc 16843776
    //   1438: iastore
    //   1439: dup
    //   1440: bipush #10
    //   1442: ldc 16843780
    //   1444: iastore
    //   1445: dup
    //   1446: bipush #11
    //   1448: sipush #1024
    //   1451: iastore
    //   1452: dup
    //   1453: bipush #12
    //   1455: ldc 16778244
    //   1457: iastore
    //   1458: dup
    //   1459: bipush #13
    //   1461: ldc 16842756
    //   1463: iastore
    //   1464: dup
    //   1465: bipush #14
    //   1467: ldc 16777216
    //   1469: iastore
    //   1470: dup
    //   1471: bipush #15
    //   1473: iconst_4
    //   1474: iastore
    //   1475: dup
    //   1476: bipush #16
    //   1478: sipush #1028
    //   1481: iastore
    //   1482: dup
    //   1483: bipush #17
    //   1485: ldc 16778240
    //   1487: iastore
    //   1488: dup
    //   1489: bipush #18
    //   1491: ldc 16778240
    //   1493: iastore
    //   1494: dup
    //   1495: bipush #19
    //   1497: ldc 66560
    //   1499: iastore
    //   1500: dup
    //   1501: bipush #20
    //   1503: ldc 66560
    //   1505: iastore
    //   1506: dup
    //   1507: bipush #21
    //   1509: ldc 16842752
    //   1511: iastore
    //   1512: dup
    //   1513: bipush #22
    //   1515: ldc 16842752
    //   1517: iastore
    //   1518: dup
    //   1519: bipush #23
    //   1521: ldc 16778244
    //   1523: iastore
    //   1524: dup
    //   1525: bipush #24
    //   1527: ldc 65540
    //   1529: iastore
    //   1530: dup
    //   1531: bipush #25
    //   1533: ldc 16777220
    //   1535: iastore
    //   1536: dup
    //   1537: bipush #26
    //   1539: ldc 16777220
    //   1541: iastore
    //   1542: dup
    //   1543: bipush #27
    //   1545: ldc 65540
    //   1547: iastore
    //   1548: dup
    //   1549: bipush #28
    //   1551: iconst_0
    //   1552: iastore
    //   1553: dup
    //   1554: bipush #29
    //   1556: sipush #1028
    //   1559: iastore
    //   1560: dup
    //   1561: bipush #30
    //   1563: ldc 66564
    //   1565: iastore
    //   1566: dup
    //   1567: bipush #31
    //   1569: ldc 16777216
    //   1571: iastore
    //   1572: dup
    //   1573: bipush #32
    //   1575: ldc 65536
    //   1577: iastore
    //   1578: dup
    //   1579: bipush #33
    //   1581: ldc 16843780
    //   1583: iastore
    //   1584: dup
    //   1585: bipush #34
    //   1587: iconst_4
    //   1588: iastore
    //   1589: dup
    //   1590: bipush #35
    //   1592: ldc 16842752
    //   1594: iastore
    //   1595: dup
    //   1596: bipush #36
    //   1598: ldc 16843776
    //   1600: iastore
    //   1601: dup
    //   1602: bipush #37
    //   1604: ldc 16777216
    //   1606: iastore
    //   1607: dup
    //   1608: bipush #38
    //   1610: ldc 16777216
    //   1612: iastore
    //   1613: dup
    //   1614: bipush #39
    //   1616: sipush #1024
    //   1619: iastore
    //   1620: dup
    //   1621: bipush #40
    //   1623: ldc 16842756
    //   1625: iastore
    //   1626: dup
    //   1627: bipush #41
    //   1629: ldc 65536
    //   1631: iastore
    //   1632: dup
    //   1633: bipush #42
    //   1635: ldc 66560
    //   1637: iastore
    //   1638: dup
    //   1639: bipush #43
    //   1641: ldc 16777220
    //   1643: iastore
    //   1644: dup
    //   1645: bipush #44
    //   1647: sipush #1024
    //   1650: iastore
    //   1651: dup
    //   1652: bipush #45
    //   1654: iconst_4
    //   1655: iastore
    //   1656: dup
    //   1657: bipush #46
    //   1659: ldc 16778244
    //   1661: iastore
    //   1662: dup
    //   1663: bipush #47
    //   1665: ldc 66564
    //   1667: iastore
    //   1668: dup
    //   1669: bipush #48
    //   1671: ldc 16843780
    //   1673: iastore
    //   1674: dup
    //   1675: bipush #49
    //   1677: ldc 65540
    //   1679: iastore
    //   1680: dup
    //   1681: bipush #50
    //   1683: ldc 16842752
    //   1685: iastore
    //   1686: dup
    //   1687: bipush #51
    //   1689: ldc 16778244
    //   1691: iastore
    //   1692: dup
    //   1693: bipush #52
    //   1695: ldc 16777220
    //   1697: iastore
    //   1698: dup
    //   1699: bipush #53
    //   1701: sipush #1028
    //   1704: iastore
    //   1705: dup
    //   1706: bipush #54
    //   1708: ldc 66564
    //   1710: iastore
    //   1711: dup
    //   1712: bipush #55
    //   1714: ldc 16843776
    //   1716: iastore
    //   1717: dup
    //   1718: bipush #56
    //   1720: sipush #1028
    //   1723: iastore
    //   1724: dup
    //   1725: bipush #57
    //   1727: ldc 16778240
    //   1729: iastore
    //   1730: dup
    //   1731: bipush #58
    //   1733: ldc 16778240
    //   1735: iastore
    //   1736: dup
    //   1737: bipush #59
    //   1739: iconst_0
    //   1740: iastore
    //   1741: dup
    //   1742: bipush #60
    //   1744: ldc 65540
    //   1746: iastore
    //   1747: dup
    //   1748: bipush #61
    //   1750: ldc 66560
    //   1752: iastore
    //   1753: dup
    //   1754: bipush #62
    //   1756: iconst_0
    //   1757: iastore
    //   1758: dup
    //   1759: bipush #63
    //   1761: ldc 16842756
    //   1763: iastore
    //   1764: astore #8
    //   1766: bipush #64
    //   1768: newarray int
    //   1770: dup
    //   1771: iconst_0
    //   1772: ldc -2146402272
    //   1774: iastore
    //   1775: dup
    //   1776: iconst_1
    //   1777: ldc -2147450880
    //   1779: iastore
    //   1780: dup
    //   1781: iconst_2
    //   1782: ldc 32768
    //   1784: iastore
    //   1785: dup
    //   1786: iconst_3
    //   1787: ldc 1081376
    //   1789: iastore
    //   1790: dup
    //   1791: iconst_4
    //   1792: ldc 1048576
    //   1794: iastore
    //   1795: dup
    //   1796: iconst_5
    //   1797: bipush #32
    //   1799: iastore
    //   1800: dup
    //   1801: bipush #6
    //   1803: ldc -2146435040
    //   1805: iastore
    //   1806: dup
    //   1807: bipush #7
    //   1809: ldc -2147450848
    //   1811: iastore
    //   1812: dup
    //   1813: bipush #8
    //   1815: ldc -2147483616
    //   1817: iastore
    //   1818: dup
    //   1819: bipush #9
    //   1821: ldc -2146402272
    //   1823: iastore
    //   1824: dup
    //   1825: bipush #10
    //   1827: ldc -2146402304
    //   1829: iastore
    //   1830: dup
    //   1831: bipush #11
    //   1833: ldc -2147483648
    //   1835: iastore
    //   1836: dup
    //   1837: bipush #12
    //   1839: ldc -2147450880
    //   1841: iastore
    //   1842: dup
    //   1843: bipush #13
    //   1845: ldc 1048576
    //   1847: iastore
    //   1848: dup
    //   1849: bipush #14
    //   1851: bipush #32
    //   1853: iastore
    //   1854: dup
    //   1855: bipush #15
    //   1857: ldc -2146435040
    //   1859: iastore
    //   1860: dup
    //   1861: bipush #16
    //   1863: ldc 1081344
    //   1865: iastore
    //   1866: dup
    //   1867: bipush #17
    //   1869: ldc 1048608
    //   1871: iastore
    //   1872: dup
    //   1873: bipush #18
    //   1875: ldc -2147450848
    //   1877: iastore
    //   1878: dup
    //   1879: bipush #19
    //   1881: iconst_0
    //   1882: iastore
    //   1883: dup
    //   1884: bipush #20
    //   1886: ldc -2147483648
    //   1888: iastore
    //   1889: dup
    //   1890: bipush #21
    //   1892: ldc 32768
    //   1894: iastore
    //   1895: dup
    //   1896: bipush #22
    //   1898: ldc 1081376
    //   1900: iastore
    //   1901: dup
    //   1902: bipush #23
    //   1904: ldc -2146435072
    //   1906: iastore
    //   1907: dup
    //   1908: bipush #24
    //   1910: ldc 1048608
    //   1912: iastore
    //   1913: dup
    //   1914: bipush #25
    //   1916: ldc -2147483616
    //   1918: iastore
    //   1919: dup
    //   1920: bipush #26
    //   1922: iconst_0
    //   1923: iastore
    //   1924: dup
    //   1925: bipush #27
    //   1927: ldc 1081344
    //   1929: iastore
    //   1930: dup
    //   1931: bipush #28
    //   1933: ldc 32800
    //   1935: iastore
    //   1936: dup
    //   1937: bipush #29
    //   1939: ldc -2146402304
    //   1941: iastore
    //   1942: dup
    //   1943: bipush #30
    //   1945: ldc -2146435072
    //   1947: iastore
    //   1948: dup
    //   1949: bipush #31
    //   1951: ldc 32800
    //   1953: iastore
    //   1954: dup
    //   1955: bipush #32
    //   1957: iconst_0
    //   1958: iastore
    //   1959: dup
    //   1960: bipush #33
    //   1962: ldc 1081376
    //   1964: iastore
    //   1965: dup
    //   1966: bipush #34
    //   1968: ldc -2146435040
    //   1970: iastore
    //   1971: dup
    //   1972: bipush #35
    //   1974: ldc 1048576
    //   1976: iastore
    //   1977: dup
    //   1978: bipush #36
    //   1980: ldc -2147450848
    //   1982: iastore
    //   1983: dup
    //   1984: bipush #37
    //   1986: ldc -2146435072
    //   1988: iastore
    //   1989: dup
    //   1990: bipush #38
    //   1992: ldc -2146402304
    //   1994: iastore
    //   1995: dup
    //   1996: bipush #39
    //   1998: ldc 32768
    //   2000: iastore
    //   2001: dup
    //   2002: bipush #40
    //   2004: ldc -2146435072
    //   2006: iastore
    //   2007: dup
    //   2008: bipush #41
    //   2010: ldc -2147450880
    //   2012: iastore
    //   2013: dup
    //   2014: bipush #42
    //   2016: bipush #32
    //   2018: iastore
    //   2019: dup
    //   2020: bipush #43
    //   2022: ldc -2146402272
    //   2024: iastore
    //   2025: dup
    //   2026: bipush #44
    //   2028: ldc 1081376
    //   2030: iastore
    //   2031: dup
    //   2032: bipush #45
    //   2034: bipush #32
    //   2036: iastore
    //   2037: dup
    //   2038: bipush #46
    //   2040: ldc 32768
    //   2042: iastore
    //   2043: dup
    //   2044: bipush #47
    //   2046: ldc -2147483648
    //   2048: iastore
    //   2049: dup
    //   2050: bipush #48
    //   2052: ldc 32800
    //   2054: iastore
    //   2055: dup
    //   2056: bipush #49
    //   2058: ldc -2146402304
    //   2060: iastore
    //   2061: dup
    //   2062: bipush #50
    //   2064: ldc 1048576
    //   2066: iastore
    //   2067: dup
    //   2068: bipush #51
    //   2070: ldc -2147483616
    //   2072: iastore
    //   2073: dup
    //   2074: bipush #52
    //   2076: ldc 1048608
    //   2078: iastore
    //   2079: dup
    //   2080: bipush #53
    //   2082: ldc -2147450848
    //   2084: iastore
    //   2085: dup
    //   2086: bipush #54
    //   2088: ldc -2147483616
    //   2090: iastore
    //   2091: dup
    //   2092: bipush #55
    //   2094: ldc 1048608
    //   2096: iastore
    //   2097: dup
    //   2098: bipush #56
    //   2100: ldc 1081344
    //   2102: iastore
    //   2103: dup
    //   2104: bipush #57
    //   2106: iconst_0
    //   2107: iastore
    //   2108: dup
    //   2109: bipush #58
    //   2111: ldc -2147450880
    //   2113: iastore
    //   2114: dup
    //   2115: bipush #59
    //   2117: ldc 32800
    //   2119: iastore
    //   2120: dup
    //   2121: bipush #60
    //   2123: ldc -2147483648
    //   2125: iastore
    //   2126: dup
    //   2127: bipush #61
    //   2129: ldc -2146435040
    //   2131: iastore
    //   2132: dup
    //   2133: bipush #62
    //   2135: ldc -2146402272
    //   2137: iastore
    //   2138: dup
    //   2139: bipush #63
    //   2141: ldc 1081344
    //   2143: iastore
    //   2144: astore #9
    //   2146: bipush #64
    //   2148: newarray int
    //   2150: dup
    //   2151: iconst_0
    //   2152: sipush #520
    //   2155: iastore
    //   2156: dup
    //   2157: iconst_1
    //   2158: ldc 134349312
    //   2160: iastore
    //   2161: dup
    //   2162: iconst_2
    //   2163: iconst_0
    //   2164: iastore
    //   2165: dup
    //   2166: iconst_3
    //   2167: ldc 134348808
    //   2169: iastore
    //   2170: dup
    //   2171: iconst_4
    //   2172: ldc 134218240
    //   2174: iastore
    //   2175: dup
    //   2176: iconst_5
    //   2177: iconst_0
    //   2178: iastore
    //   2179: dup
    //   2180: bipush #6
    //   2182: ldc 131592
    //   2184: iastore
    //   2185: dup
    //   2186: bipush #7
    //   2188: ldc 134218240
    //   2190: iastore
    //   2191: dup
    //   2192: bipush #8
    //   2194: ldc 131080
    //   2196: iastore
    //   2197: dup
    //   2198: bipush #9
    //   2200: ldc 134217736
    //   2202: iastore
    //   2203: dup
    //   2204: bipush #10
    //   2206: ldc 134217736
    //   2208: iastore
    //   2209: dup
    //   2210: bipush #11
    //   2212: ldc 131072
    //   2214: iastore
    //   2215: dup
    //   2216: bipush #12
    //   2218: ldc 134349320
    //   2220: iastore
    //   2221: dup
    //   2222: bipush #13
    //   2224: ldc 131080
    //   2226: iastore
    //   2227: dup
    //   2228: bipush #14
    //   2230: ldc 134348800
    //   2232: iastore
    //   2233: dup
    //   2234: bipush #15
    //   2236: sipush #520
    //   2239: iastore
    //   2240: dup
    //   2241: bipush #16
    //   2243: ldc 134217728
    //   2245: iastore
    //   2246: dup
    //   2247: bipush #17
    //   2249: bipush #8
    //   2251: iastore
    //   2252: dup
    //   2253: bipush #18
    //   2255: ldc 134349312
    //   2257: iastore
    //   2258: dup
    //   2259: bipush #19
    //   2261: sipush #512
    //   2264: iastore
    //   2265: dup
    //   2266: bipush #20
    //   2268: ldc 131584
    //   2270: iastore
    //   2271: dup
    //   2272: bipush #21
    //   2274: ldc 134348800
    //   2276: iastore
    //   2277: dup
    //   2278: bipush #22
    //   2280: ldc 134348808
    //   2282: iastore
    //   2283: dup
    //   2284: bipush #23
    //   2286: ldc 131592
    //   2288: iastore
    //   2289: dup
    //   2290: bipush #24
    //   2292: ldc 134218248
    //   2294: iastore
    //   2295: dup
    //   2296: bipush #25
    //   2298: ldc 131584
    //   2300: iastore
    //   2301: dup
    //   2302: bipush #26
    //   2304: ldc 131072
    //   2306: iastore
    //   2307: dup
    //   2308: bipush #27
    //   2310: ldc 134218248
    //   2312: iastore
    //   2313: dup
    //   2314: bipush #28
    //   2316: bipush #8
    //   2318: iastore
    //   2319: dup
    //   2320: bipush #29
    //   2322: ldc 134349320
    //   2324: iastore
    //   2325: dup
    //   2326: bipush #30
    //   2328: sipush #512
    //   2331: iastore
    //   2332: dup
    //   2333: bipush #31
    //   2335: ldc 134217728
    //   2337: iastore
    //   2338: dup
    //   2339: bipush #32
    //   2341: ldc 134349312
    //   2343: iastore
    //   2344: dup
    //   2345: bipush #33
    //   2347: ldc 134217728
    //   2349: iastore
    //   2350: dup
    //   2351: bipush #34
    //   2353: ldc 131080
    //   2355: iastore
    //   2356: dup
    //   2357: bipush #35
    //   2359: sipush #520
    //   2362: iastore
    //   2363: dup
    //   2364: bipush #36
    //   2366: ldc 131072
    //   2368: iastore
    //   2369: dup
    //   2370: bipush #37
    //   2372: ldc 134349312
    //   2374: iastore
    //   2375: dup
    //   2376: bipush #38
    //   2378: ldc 134218240
    //   2380: iastore
    //   2381: dup
    //   2382: bipush #39
    //   2384: iconst_0
    //   2385: iastore
    //   2386: dup
    //   2387: bipush #40
    //   2389: sipush #512
    //   2392: iastore
    //   2393: dup
    //   2394: bipush #41
    //   2396: ldc 131080
    //   2398: iastore
    //   2399: dup
    //   2400: bipush #42
    //   2402: ldc 134349320
    //   2404: iastore
    //   2405: dup
    //   2406: bipush #43
    //   2408: ldc 134218240
    //   2410: iastore
    //   2411: dup
    //   2412: bipush #44
    //   2414: ldc 134217736
    //   2416: iastore
    //   2417: dup
    //   2418: bipush #45
    //   2420: sipush #512
    //   2423: iastore
    //   2424: dup
    //   2425: bipush #46
    //   2427: iconst_0
    //   2428: iastore
    //   2429: dup
    //   2430: bipush #47
    //   2432: ldc 134348808
    //   2434: iastore
    //   2435: dup
    //   2436: bipush #48
    //   2438: ldc 134218248
    //   2440: iastore
    //   2441: dup
    //   2442: bipush #49
    //   2444: ldc 131072
    //   2446: iastore
    //   2447: dup
    //   2448: bipush #50
    //   2450: ldc 134217728
    //   2452: iastore
    //   2453: dup
    //   2454: bipush #51
    //   2456: ldc 134349320
    //   2458: iastore
    //   2459: dup
    //   2460: bipush #52
    //   2462: bipush #8
    //   2464: iastore
    //   2465: dup
    //   2466: bipush #53
    //   2468: ldc 131592
    //   2470: iastore
    //   2471: dup
    //   2472: bipush #54
    //   2474: ldc 131584
    //   2476: iastore
    //   2477: dup
    //   2478: bipush #55
    //   2480: ldc 134217736
    //   2482: iastore
    //   2483: dup
    //   2484: bipush #56
    //   2486: ldc 134348800
    //   2488: iastore
    //   2489: dup
    //   2490: bipush #57
    //   2492: ldc 134218248
    //   2494: iastore
    //   2495: dup
    //   2496: bipush #58
    //   2498: sipush #520
    //   2501: iastore
    //   2502: dup
    //   2503: bipush #59
    //   2505: ldc 134348800
    //   2507: iastore
    //   2508: dup
    //   2509: bipush #60
    //   2511: ldc 131592
    //   2513: iastore
    //   2514: dup
    //   2515: bipush #61
    //   2517: bipush #8
    //   2519: iastore
    //   2520: dup
    //   2521: bipush #62
    //   2523: ldc 134348808
    //   2525: iastore
    //   2526: dup
    //   2527: bipush #63
    //   2529: ldc 131584
    //   2531: iastore
    //   2532: astore #10
    //   2534: bipush #64
    //   2536: newarray int
    //   2538: dup
    //   2539: iconst_0
    //   2540: ldc 8396801
    //   2542: iastore
    //   2543: dup
    //   2544: iconst_1
    //   2545: sipush #8321
    //   2548: iastore
    //   2549: dup
    //   2550: iconst_2
    //   2551: sipush #8321
    //   2554: iastore
    //   2555: dup
    //   2556: iconst_3
    //   2557: sipush #128
    //   2560: iastore
    //   2561: dup
    //   2562: iconst_4
    //   2563: ldc 8396928
    //   2565: iastore
    //   2566: dup
    //   2567: iconst_5
    //   2568: ldc 8388737
    //   2570: iastore
    //   2571: dup
    //   2572: bipush #6
    //   2574: ldc 8388609
    //   2576: iastore
    //   2577: dup
    //   2578: bipush #7
    //   2580: sipush #8193
    //   2583: iastore
    //   2584: dup
    //   2585: bipush #8
    //   2587: iconst_0
    //   2588: iastore
    //   2589: dup
    //   2590: bipush #9
    //   2592: ldc 8396800
    //   2594: iastore
    //   2595: dup
    //   2596: bipush #10
    //   2598: ldc 8396800
    //   2600: iastore
    //   2601: dup
    //   2602: bipush #11
    //   2604: ldc 8396929
    //   2606: iastore
    //   2607: dup
    //   2608: bipush #12
    //   2610: sipush #129
    //   2613: iastore
    //   2614: dup
    //   2615: bipush #13
    //   2617: iconst_0
    //   2618: iastore
    //   2619: dup
    //   2620: bipush #14
    //   2622: ldc 8388736
    //   2624: iastore
    //   2625: dup
    //   2626: bipush #15
    //   2628: ldc 8388609
    //   2630: iastore
    //   2631: dup
    //   2632: bipush #16
    //   2634: iconst_1
    //   2635: iastore
    //   2636: dup
    //   2637: bipush #17
    //   2639: sipush #8192
    //   2642: iastore
    //   2643: dup
    //   2644: bipush #18
    //   2646: ldc 8388608
    //   2648: iastore
    //   2649: dup
    //   2650: bipush #19
    //   2652: ldc 8396801
    //   2654: iastore
    //   2655: dup
    //   2656: bipush #20
    //   2658: sipush #128
    //   2661: iastore
    //   2662: dup
    //   2663: bipush #21
    //   2665: ldc 8388608
    //   2667: iastore
    //   2668: dup
    //   2669: bipush #22
    //   2671: sipush #8193
    //   2674: iastore
    //   2675: dup
    //   2676: bipush #23
    //   2678: sipush #8320
    //   2681: iastore
    //   2682: dup
    //   2683: bipush #24
    //   2685: ldc 8388737
    //   2687: iastore
    //   2688: dup
    //   2689: bipush #25
    //   2691: iconst_1
    //   2692: iastore
    //   2693: dup
    //   2694: bipush #26
    //   2696: sipush #8320
    //   2699: iastore
    //   2700: dup
    //   2701: bipush #27
    //   2703: ldc 8388736
    //   2705: iastore
    //   2706: dup
    //   2707: bipush #28
    //   2709: sipush #8192
    //   2712: iastore
    //   2713: dup
    //   2714: bipush #29
    //   2716: ldc 8396928
    //   2718: iastore
    //   2719: dup
    //   2720: bipush #30
    //   2722: ldc 8396929
    //   2724: iastore
    //   2725: dup
    //   2726: bipush #31
    //   2728: sipush #129
    //   2731: iastore
    //   2732: dup
    //   2733: bipush #32
    //   2735: ldc 8388736
    //   2737: iastore
    //   2738: dup
    //   2739: bipush #33
    //   2741: ldc 8388609
    //   2743: iastore
    //   2744: dup
    //   2745: bipush #34
    //   2747: ldc 8396800
    //   2749: iastore
    //   2750: dup
    //   2751: bipush #35
    //   2753: ldc 8396929
    //   2755: iastore
    //   2756: dup
    //   2757: bipush #36
    //   2759: sipush #129
    //   2762: iastore
    //   2763: dup
    //   2764: bipush #37
    //   2766: iconst_0
    //   2767: iastore
    //   2768: dup
    //   2769: bipush #38
    //   2771: iconst_0
    //   2772: iastore
    //   2773: dup
    //   2774: bipush #39
    //   2776: ldc 8396800
    //   2778: iastore
    //   2779: dup
    //   2780: bipush #40
    //   2782: sipush #8320
    //   2785: iastore
    //   2786: dup
    //   2787: bipush #41
    //   2789: ldc 8388736
    //   2791: iastore
    //   2792: dup
    //   2793: bipush #42
    //   2795: ldc 8388737
    //   2797: iastore
    //   2798: dup
    //   2799: bipush #43
    //   2801: iconst_1
    //   2802: iastore
    //   2803: dup
    //   2804: bipush #44
    //   2806: ldc 8396801
    //   2808: iastore
    //   2809: dup
    //   2810: bipush #45
    //   2812: sipush #8321
    //   2815: iastore
    //   2816: dup
    //   2817: bipush #46
    //   2819: sipush #8321
    //   2822: iastore
    //   2823: dup
    //   2824: bipush #47
    //   2826: sipush #128
    //   2829: iastore
    //   2830: dup
    //   2831: bipush #48
    //   2833: ldc 8396929
    //   2835: iastore
    //   2836: dup
    //   2837: bipush #49
    //   2839: sipush #129
    //   2842: iastore
    //   2843: dup
    //   2844: bipush #50
    //   2846: iconst_1
    //   2847: iastore
    //   2848: dup
    //   2849: bipush #51
    //   2851: sipush #8192
    //   2854: iastore
    //   2855: dup
    //   2856: bipush #52
    //   2858: ldc 8388609
    //   2860: iastore
    //   2861: dup
    //   2862: bipush #53
    //   2864: sipush #8193
    //   2867: iastore
    //   2868: dup
    //   2869: bipush #54
    //   2871: ldc 8396928
    //   2873: iastore
    //   2874: dup
    //   2875: bipush #55
    //   2877: ldc 8388737
    //   2879: iastore
    //   2880: dup
    //   2881: bipush #56
    //   2883: sipush #8193
    //   2886: iastore
    //   2887: dup
    //   2888: bipush #57
    //   2890: sipush #8320
    //   2893: iastore
    //   2894: dup
    //   2895: bipush #58
    //   2897: ldc 8388608
    //   2899: iastore
    //   2900: dup
    //   2901: bipush #59
    //   2903: ldc 8396801
    //   2905: iastore
    //   2906: dup
    //   2907: bipush #60
    //   2909: sipush #128
    //   2912: iastore
    //   2913: dup
    //   2914: bipush #61
    //   2916: ldc 8388608
    //   2918: iastore
    //   2919: dup
    //   2920: bipush #62
    //   2922: sipush #8192
    //   2925: iastore
    //   2926: dup
    //   2927: bipush #63
    //   2929: ldc 8396928
    //   2931: iastore
    //   2932: astore #11
    //   2934: bipush #64
    //   2936: newarray int
    //   2938: dup
    //   2939: iconst_0
    //   2940: sipush #256
    //   2943: iastore
    //   2944: dup
    //   2945: iconst_1
    //   2946: ldc 34078976
    //   2948: iastore
    //   2949: dup
    //   2950: iconst_2
    //   2951: ldc 34078720
    //   2953: iastore
    //   2954: dup
    //   2955: iconst_3
    //   2956: ldc 1107296512
    //   2958: iastore
    //   2959: dup
    //   2960: iconst_4
    //   2961: ldc 524288
    //   2963: iastore
    //   2964: dup
    //   2965: iconst_5
    //   2966: sipush #256
    //   2969: iastore
    //   2970: dup
    //   2971: bipush #6
    //   2973: ldc 1073741824
    //   2975: iastore
    //   2976: dup
    //   2977: bipush #7
    //   2979: ldc 34078720
    //   2981: iastore
    //   2982: dup
    //   2983: bipush #8
    //   2985: ldc 1074266368
    //   2987: iastore
    //   2988: dup
    //   2989: bipush #9
    //   2991: ldc 524288
    //   2993: iastore
    //   2994: dup
    //   2995: bipush #10
    //   2997: ldc 33554688
    //   2999: iastore
    //   3000: dup
    //   3001: bipush #11
    //   3003: ldc 1074266368
    //   3005: iastore
    //   3006: dup
    //   3007: bipush #12
    //   3009: ldc 1107296512
    //   3011: iastore
    //   3012: dup
    //   3013: bipush #13
    //   3015: ldc 1107820544
    //   3017: iastore
    //   3018: dup
    //   3019: bipush #14
    //   3021: ldc 524544
    //   3023: iastore
    //   3024: dup
    //   3025: bipush #15
    //   3027: ldc 1073741824
    //   3029: iastore
    //   3030: dup
    //   3031: bipush #16
    //   3033: ldc 33554432
    //   3035: iastore
    //   3036: dup
    //   3037: bipush #17
    //   3039: ldc 1074266112
    //   3041: iastore
    //   3042: dup
    //   3043: bipush #18
    //   3045: ldc 1074266112
    //   3047: iastore
    //   3048: dup
    //   3049: bipush #19
    //   3051: iconst_0
    //   3052: iastore
    //   3053: dup
    //   3054: bipush #20
    //   3056: ldc 1073742080
    //   3058: iastore
    //   3059: dup
    //   3060: bipush #21
    //   3062: ldc 1107820800
    //   3064: iastore
    //   3065: dup
    //   3066: bipush #22
    //   3068: ldc 1107820800
    //   3070: iastore
    //   3071: dup
    //   3072: bipush #23
    //   3074: ldc 33554688
    //   3076: iastore
    //   3077: dup
    //   3078: bipush #24
    //   3080: ldc 1107820544
    //   3082: iastore
    //   3083: dup
    //   3084: bipush #25
    //   3086: ldc 1073742080
    //   3088: iastore
    //   3089: dup
    //   3090: bipush #26
    //   3092: iconst_0
    //   3093: iastore
    //   3094: dup
    //   3095: bipush #27
    //   3097: ldc 1107296256
    //   3099: iastore
    //   3100: dup
    //   3101: bipush #28
    //   3103: ldc 34078976
    //   3105: iastore
    //   3106: dup
    //   3107: bipush #29
    //   3109: ldc 33554432
    //   3111: iastore
    //   3112: dup
    //   3113: bipush #30
    //   3115: ldc 1107296256
    //   3117: iastore
    //   3118: dup
    //   3119: bipush #31
    //   3121: ldc 524544
    //   3123: iastore
    //   3124: dup
    //   3125: bipush #32
    //   3127: ldc 524288
    //   3129: iastore
    //   3130: dup
    //   3131: bipush #33
    //   3133: ldc 1107296512
    //   3135: iastore
    //   3136: dup
    //   3137: bipush #34
    //   3139: sipush #256
    //   3142: iastore
    //   3143: dup
    //   3144: bipush #35
    //   3146: ldc 33554432
    //   3148: iastore
    //   3149: dup
    //   3150: bipush #36
    //   3152: ldc 1073741824
    //   3154: iastore
    //   3155: dup
    //   3156: bipush #37
    //   3158: ldc 34078720
    //   3160: iastore
    //   3161: dup
    //   3162: bipush #38
    //   3164: ldc 1107296512
    //   3166: iastore
    //   3167: dup
    //   3168: bipush #39
    //   3170: ldc 1074266368
    //   3172: iastore
    //   3173: dup
    //   3174: bipush #40
    //   3176: ldc 33554688
    //   3178: iastore
    //   3179: dup
    //   3180: bipush #41
    //   3182: ldc 1073741824
    //   3184: iastore
    //   3185: dup
    //   3186: bipush #42
    //   3188: ldc 1107820544
    //   3190: iastore
    //   3191: dup
    //   3192: bipush #43
    //   3194: ldc 34078976
    //   3196: iastore
    //   3197: dup
    //   3198: bipush #44
    //   3200: ldc 1074266368
    //   3202: iastore
    //   3203: dup
    //   3204: bipush #45
    //   3206: sipush #256
    //   3209: iastore
    //   3210: dup
    //   3211: bipush #46
    //   3213: ldc 33554432
    //   3215: iastore
    //   3216: dup
    //   3217: bipush #47
    //   3219: ldc 1107820544
    //   3221: iastore
    //   3222: dup
    //   3223: bipush #48
    //   3225: ldc 1107820800
    //   3227: iastore
    //   3228: dup
    //   3229: bipush #49
    //   3231: ldc 524544
    //   3233: iastore
    //   3234: dup
    //   3235: bipush #50
    //   3237: ldc 1107296256
    //   3239: iastore
    //   3240: dup
    //   3241: bipush #51
    //   3243: ldc 1107820800
    //   3245: iastore
    //   3246: dup
    //   3247: bipush #52
    //   3249: ldc 34078720
    //   3251: iastore
    //   3252: dup
    //   3253: bipush #53
    //   3255: iconst_0
    //   3256: iastore
    //   3257: dup
    //   3258: bipush #54
    //   3260: ldc 1074266112
    //   3262: iastore
    //   3263: dup
    //   3264: bipush #55
    //   3266: ldc 1107296256
    //   3268: iastore
    //   3269: dup
    //   3270: bipush #56
    //   3272: ldc 524544
    //   3274: iastore
    //   3275: dup
    //   3276: bipush #57
    //   3278: ldc 33554688
    //   3280: iastore
    //   3281: dup
    //   3282: bipush #58
    //   3284: ldc 1073742080
    //   3286: iastore
    //   3287: dup
    //   3288: bipush #59
    //   3290: ldc 524288
    //   3292: iastore
    //   3293: dup
    //   3294: bipush #60
    //   3296: iconst_0
    //   3297: iastore
    //   3298: dup
    //   3299: bipush #61
    //   3301: ldc 1074266112
    //   3303: iastore
    //   3304: dup
    //   3305: bipush #62
    //   3307: ldc 34078976
    //   3309: iastore
    //   3310: dup
    //   3311: bipush #63
    //   3313: ldc 1073742080
    //   3315: iastore
    //   3316: astore #12
    //   3318: bipush #64
    //   3320: newarray int
    //   3322: dup
    //   3323: iconst_0
    //   3324: ldc 536870928
    //   3326: iastore
    //   3327: dup
    //   3328: iconst_1
    //   3329: ldc 541065216
    //   3331: iastore
    //   3332: dup
    //   3333: iconst_2
    //   3334: sipush #16384
    //   3337: iastore
    //   3338: dup
    //   3339: iconst_3
    //   3340: ldc 541081616
    //   3342: iastore
    //   3343: dup
    //   3344: iconst_4
    //   3345: ldc 541065216
    //   3347: iastore
    //   3348: dup
    //   3349: iconst_5
    //   3350: bipush #16
    //   3352: iastore
    //   3353: dup
    //   3354: bipush #6
    //   3356: ldc 541081616
    //   3358: iastore
    //   3359: dup
    //   3360: bipush #7
    //   3362: ldc 4194304
    //   3364: iastore
    //   3365: dup
    //   3366: bipush #8
    //   3368: ldc 536887296
    //   3370: iastore
    //   3371: dup
    //   3372: bipush #9
    //   3374: ldc 4210704
    //   3376: iastore
    //   3377: dup
    //   3378: bipush #10
    //   3380: ldc 4194304
    //   3382: iastore
    //   3383: dup
    //   3384: bipush #11
    //   3386: ldc 536870928
    //   3388: iastore
    //   3389: dup
    //   3390: bipush #12
    //   3392: ldc 4194320
    //   3394: iastore
    //   3395: dup
    //   3396: bipush #13
    //   3398: ldc 536887296
    //   3400: iastore
    //   3401: dup
    //   3402: bipush #14
    //   3404: ldc 536870912
    //   3406: iastore
    //   3407: dup
    //   3408: bipush #15
    //   3410: sipush #16400
    //   3413: iastore
    //   3414: dup
    //   3415: bipush #16
    //   3417: iconst_0
    //   3418: iastore
    //   3419: dup
    //   3420: bipush #17
    //   3422: ldc 4194320
    //   3424: iastore
    //   3425: dup
    //   3426: bipush #18
    //   3428: ldc 536887312
    //   3430: iastore
    //   3431: dup
    //   3432: bipush #19
    //   3434: sipush #16384
    //   3437: iastore
    //   3438: dup
    //   3439: bipush #20
    //   3441: ldc 4210688
    //   3443: iastore
    //   3444: dup
    //   3445: bipush #21
    //   3447: ldc 536887312
    //   3449: iastore
    //   3450: dup
    //   3451: bipush #22
    //   3453: bipush #16
    //   3455: iastore
    //   3456: dup
    //   3457: bipush #23
    //   3459: ldc 541065232
    //   3461: iastore
    //   3462: dup
    //   3463: bipush #24
    //   3465: ldc 541065232
    //   3467: iastore
    //   3468: dup
    //   3469: bipush #25
    //   3471: iconst_0
    //   3472: iastore
    //   3473: dup
    //   3474: bipush #26
    //   3476: ldc 4210704
    //   3478: iastore
    //   3479: dup
    //   3480: bipush #27
    //   3482: ldc 541081600
    //   3484: iastore
    //   3485: dup
    //   3486: bipush #28
    //   3488: sipush #16400
    //   3491: iastore
    //   3492: dup
    //   3493: bipush #29
    //   3495: ldc 4210688
    //   3497: iastore
    //   3498: dup
    //   3499: bipush #30
    //   3501: ldc 541081600
    //   3503: iastore
    //   3504: dup
    //   3505: bipush #31
    //   3507: ldc 536870912
    //   3509: iastore
    //   3510: dup
    //   3511: bipush #32
    //   3513: ldc 536887296
    //   3515: iastore
    //   3516: dup
    //   3517: bipush #33
    //   3519: bipush #16
    //   3521: iastore
    //   3522: dup
    //   3523: bipush #34
    //   3525: ldc 541065232
    //   3527: iastore
    //   3528: dup
    //   3529: bipush #35
    //   3531: ldc 4210688
    //   3533: iastore
    //   3534: dup
    //   3535: bipush #36
    //   3537: ldc 541081616
    //   3539: iastore
    //   3540: dup
    //   3541: bipush #37
    //   3543: ldc 4194304
    //   3545: iastore
    //   3546: dup
    //   3547: bipush #38
    //   3549: sipush #16400
    //   3552: iastore
    //   3553: dup
    //   3554: bipush #39
    //   3556: ldc 536870928
    //   3558: iastore
    //   3559: dup
    //   3560: bipush #40
    //   3562: ldc 4194304
    //   3564: iastore
    //   3565: dup
    //   3566: bipush #41
    //   3568: ldc 536887296
    //   3570: iastore
    //   3571: dup
    //   3572: bipush #42
    //   3574: ldc 536870912
    //   3576: iastore
    //   3577: dup
    //   3578: bipush #43
    //   3580: sipush #16400
    //   3583: iastore
    //   3584: dup
    //   3585: bipush #44
    //   3587: ldc 536870928
    //   3589: iastore
    //   3590: dup
    //   3591: bipush #45
    //   3593: ldc 541081616
    //   3595: iastore
    //   3596: dup
    //   3597: bipush #46
    //   3599: ldc 4210688
    //   3601: iastore
    //   3602: dup
    //   3603: bipush #47
    //   3605: ldc 541065216
    //   3607: iastore
    //   3608: dup
    //   3609: bipush #48
    //   3611: ldc 4210704
    //   3613: iastore
    //   3614: dup
    //   3615: bipush #49
    //   3617: ldc 541081600
    //   3619: iastore
    //   3620: dup
    //   3621: bipush #50
    //   3623: iconst_0
    //   3624: iastore
    //   3625: dup
    //   3626: bipush #51
    //   3628: ldc 541065232
    //   3630: iastore
    //   3631: dup
    //   3632: bipush #52
    //   3634: bipush #16
    //   3636: iastore
    //   3637: dup
    //   3638: bipush #53
    //   3640: sipush #16384
    //   3643: iastore
    //   3644: dup
    //   3645: bipush #54
    //   3647: ldc 541065216
    //   3649: iastore
    //   3650: dup
    //   3651: bipush #55
    //   3653: ldc 4210704
    //   3655: iastore
    //   3656: dup
    //   3657: bipush #56
    //   3659: sipush #16384
    //   3662: iastore
    //   3663: dup
    //   3664: bipush #57
    //   3666: ldc 4194320
    //   3668: iastore
    //   3669: dup
    //   3670: bipush #58
    //   3672: ldc 536887312
    //   3674: iastore
    //   3675: dup
    //   3676: bipush #59
    //   3678: iconst_0
    //   3679: iastore
    //   3680: dup
    //   3681: bipush #60
    //   3683: ldc 541081600
    //   3685: iastore
    //   3686: dup
    //   3687: bipush #61
    //   3689: ldc 536870912
    //   3691: iastore
    //   3692: dup
    //   3693: bipush #62
    //   3695: ldc 4194320
    //   3697: iastore
    //   3698: dup
    //   3699: bipush #63
    //   3701: ldc 536887312
    //   3703: iastore
    //   3704: astore #13
    //   3706: bipush #64
    //   3708: newarray int
    //   3710: dup
    //   3711: iconst_0
    //   3712: ldc 2097152
    //   3714: iastore
    //   3715: dup
    //   3716: iconst_1
    //   3717: ldc 69206018
    //   3719: iastore
    //   3720: dup
    //   3721: iconst_2
    //   3722: ldc 67110914
    //   3724: iastore
    //   3725: dup
    //   3726: iconst_3
    //   3727: iconst_0
    //   3728: iastore
    //   3729: dup
    //   3730: iconst_4
    //   3731: sipush #2048
    //   3734: iastore
    //   3735: dup
    //   3736: iconst_5
    //   3737: ldc 67110914
    //   3739: iastore
    //   3740: dup
    //   3741: bipush #6
    //   3743: ldc 2099202
    //   3745: iastore
    //   3746: dup
    //   3747: bipush #7
    //   3749: ldc 69208064
    //   3751: iastore
    //   3752: dup
    //   3753: bipush #8
    //   3755: ldc 69208066
    //   3757: iastore
    //   3758: dup
    //   3759: bipush #9
    //   3761: ldc 2097152
    //   3763: iastore
    //   3764: dup
    //   3765: bipush #10
    //   3767: iconst_0
    //   3768: iastore
    //   3769: dup
    //   3770: bipush #11
    //   3772: ldc 67108866
    //   3774: iastore
    //   3775: dup
    //   3776: bipush #12
    //   3778: iconst_2
    //   3779: iastore
    //   3780: dup
    //   3781: bipush #13
    //   3783: ldc 67108864
    //   3785: iastore
    //   3786: dup
    //   3787: bipush #14
    //   3789: ldc 69206018
    //   3791: iastore
    //   3792: dup
    //   3793: bipush #15
    //   3795: sipush #2050
    //   3798: iastore
    //   3799: dup
    //   3800: bipush #16
    //   3802: ldc 67110912
    //   3804: iastore
    //   3805: dup
    //   3806: bipush #17
    //   3808: ldc 2099202
    //   3810: iastore
    //   3811: dup
    //   3812: bipush #18
    //   3814: ldc 2097154
    //   3816: iastore
    //   3817: dup
    //   3818: bipush #19
    //   3820: ldc 67110912
    //   3822: iastore
    //   3823: dup
    //   3824: bipush #20
    //   3826: ldc 67108866
    //   3828: iastore
    //   3829: dup
    //   3830: bipush #21
    //   3832: ldc 69206016
    //   3834: iastore
    //   3835: dup
    //   3836: bipush #22
    //   3838: ldc 69208064
    //   3840: iastore
    //   3841: dup
    //   3842: bipush #23
    //   3844: ldc 2097154
    //   3846: iastore
    //   3847: dup
    //   3848: bipush #24
    //   3850: ldc 69206016
    //   3852: iastore
    //   3853: dup
    //   3854: bipush #25
    //   3856: sipush #2048
    //   3859: iastore
    //   3860: dup
    //   3861: bipush #26
    //   3863: sipush #2050
    //   3866: iastore
    //   3867: dup
    //   3868: bipush #27
    //   3870: ldc 69208066
    //   3872: iastore
    //   3873: dup
    //   3874: bipush #28
    //   3876: ldc 2099200
    //   3878: iastore
    //   3879: dup
    //   3880: bipush #29
    //   3882: iconst_2
    //   3883: iastore
    //   3884: dup
    //   3885: bipush #30
    //   3887: ldc 67108864
    //   3889: iastore
    //   3890: dup
    //   3891: bipush #31
    //   3893: ldc 2099200
    //   3895: iastore
    //   3896: dup
    //   3897: bipush #32
    //   3899: ldc 67108864
    //   3901: iastore
    //   3902: dup
    //   3903: bipush #33
    //   3905: ldc 2099200
    //   3907: iastore
    //   3908: dup
    //   3909: bipush #34
    //   3911: ldc 2097152
    //   3913: iastore
    //   3914: dup
    //   3915: bipush #35
    //   3917: ldc 67110914
    //   3919: iastore
    //   3920: dup
    //   3921: bipush #36
    //   3923: ldc 67110914
    //   3925: iastore
    //   3926: dup
    //   3927: bipush #37
    //   3929: ldc 69206018
    //   3931: iastore
    //   3932: dup
    //   3933: bipush #38
    //   3935: ldc 69206018
    //   3937: iastore
    //   3938: dup
    //   3939: bipush #39
    //   3941: iconst_2
    //   3942: iastore
    //   3943: dup
    //   3944: bipush #40
    //   3946: ldc 2097154
    //   3948: iastore
    //   3949: dup
    //   3950: bipush #41
    //   3952: ldc 67108864
    //   3954: iastore
    //   3955: dup
    //   3956: bipush #42
    //   3958: ldc 67110912
    //   3960: iastore
    //   3961: dup
    //   3962: bipush #43
    //   3964: ldc 2097152
    //   3966: iastore
    //   3967: dup
    //   3968: bipush #44
    //   3970: ldc 69208064
    //   3972: iastore
    //   3973: dup
    //   3974: bipush #45
    //   3976: sipush #2050
    //   3979: iastore
    //   3980: dup
    //   3981: bipush #46
    //   3983: ldc 2099202
    //   3985: iastore
    //   3986: dup
    //   3987: bipush #47
    //   3989: ldc 69208064
    //   3991: iastore
    //   3992: dup
    //   3993: bipush #48
    //   3995: sipush #2050
    //   3998: iastore
    //   3999: dup
    //   4000: bipush #49
    //   4002: ldc 67108866
    //   4004: iastore
    //   4005: dup
    //   4006: bipush #50
    //   4008: ldc 69208066
    //   4010: iastore
    //   4011: dup
    //   4012: bipush #51
    //   4014: ldc 69206016
    //   4016: iastore
    //   4017: dup
    //   4018: bipush #52
    //   4020: ldc 2099200
    //   4022: iastore
    //   4023: dup
    //   4024: bipush #53
    //   4026: iconst_0
    //   4027: iastore
    //   4028: dup
    //   4029: bipush #54
    //   4031: iconst_2
    //   4032: iastore
    //   4033: dup
    //   4034: bipush #55
    //   4036: ldc 69208066
    //   4038: iastore
    //   4039: dup
    //   4040: bipush #56
    //   4042: iconst_0
    //   4043: iastore
    //   4044: dup
    //   4045: bipush #57
    //   4047: ldc 2099202
    //   4049: iastore
    //   4050: dup
    //   4051: bipush #58
    //   4053: ldc 69206016
    //   4055: iastore
    //   4056: dup
    //   4057: bipush #59
    //   4059: sipush #2048
    //   4062: iastore
    //   4063: dup
    //   4064: bipush #60
    //   4066: ldc 67108866
    //   4068: iastore
    //   4069: dup
    //   4070: bipush #61
    //   4072: ldc 67110912
    //   4074: iastore
    //   4075: dup
    //   4076: bipush #62
    //   4078: sipush #2048
    //   4081: iastore
    //   4082: dup
    //   4083: bipush #63
    //   4085: ldc 2097154
    //   4087: iastore
    //   4088: astore #14
    //   4090: bipush #64
    //   4092: newarray int
    //   4094: dup
    //   4095: iconst_0
    //   4096: ldc 268439616
    //   4098: iastore
    //   4099: dup
    //   4100: iconst_1
    //   4101: sipush #4096
    //   4104: iastore
    //   4105: dup
    //   4106: iconst_2
    //   4107: ldc 262144
    //   4109: iastore
    //   4110: dup
    //   4111: iconst_3
    //   4112: ldc 268701760
    //   4114: iastore
    //   4115: dup
    //   4116: iconst_4
    //   4117: ldc 268435456
    //   4119: iastore
    //   4120: dup
    //   4121: iconst_5
    //   4122: ldc 268439616
    //   4124: iastore
    //   4125: dup
    //   4126: bipush #6
    //   4128: bipush #64
    //   4130: iastore
    //   4131: dup
    //   4132: bipush #7
    //   4134: ldc 268435456
    //   4136: iastore
    //   4137: dup
    //   4138: bipush #8
    //   4140: ldc 262208
    //   4142: iastore
    //   4143: dup
    //   4144: bipush #9
    //   4146: ldc 268697600
    //   4148: iastore
    //   4149: dup
    //   4150: bipush #10
    //   4152: ldc 268701760
    //   4154: iastore
    //   4155: dup
    //   4156: bipush #11
    //   4158: ldc 266240
    //   4160: iastore
    //   4161: dup
    //   4162: bipush #12
    //   4164: ldc 268701696
    //   4166: iastore
    //   4167: dup
    //   4168: bipush #13
    //   4170: ldc 266304
    //   4172: iastore
    //   4173: dup
    //   4174: bipush #14
    //   4176: sipush #4096
    //   4179: iastore
    //   4180: dup
    //   4181: bipush #15
    //   4183: bipush #64
    //   4185: iastore
    //   4186: dup
    //   4187: bipush #16
    //   4189: ldc 268697600
    //   4191: iastore
    //   4192: dup
    //   4193: bipush #17
    //   4195: ldc 268435520
    //   4197: iastore
    //   4198: dup
    //   4199: bipush #18
    //   4201: ldc 268439552
    //   4203: iastore
    //   4204: dup
    //   4205: bipush #19
    //   4207: sipush #4160
    //   4210: iastore
    //   4211: dup
    //   4212: bipush #20
    //   4214: ldc 266240
    //   4216: iastore
    //   4217: dup
    //   4218: bipush #21
    //   4220: ldc 262208
    //   4222: iastore
    //   4223: dup
    //   4224: bipush #22
    //   4226: ldc 268697664
    //   4228: iastore
    //   4229: dup
    //   4230: bipush #23
    //   4232: ldc 268701696
    //   4234: iastore
    //   4235: dup
    //   4236: bipush #24
    //   4238: sipush #4160
    //   4241: iastore
    //   4242: dup
    //   4243: bipush #25
    //   4245: iconst_0
    //   4246: iastore
    //   4247: dup
    //   4248: bipush #26
    //   4250: iconst_0
    //   4251: iastore
    //   4252: dup
    //   4253: bipush #27
    //   4255: ldc 268697664
    //   4257: iastore
    //   4258: dup
    //   4259: bipush #28
    //   4261: ldc 268435520
    //   4263: iastore
    //   4264: dup
    //   4265: bipush #29
    //   4267: ldc 268439552
    //   4269: iastore
    //   4270: dup
    //   4271: bipush #30
    //   4273: ldc 266304
    //   4275: iastore
    //   4276: dup
    //   4277: bipush #31
    //   4279: ldc 262144
    //   4281: iastore
    //   4282: dup
    //   4283: bipush #32
    //   4285: ldc 266304
    //   4287: iastore
    //   4288: dup
    //   4289: bipush #33
    //   4291: ldc 262144
    //   4293: iastore
    //   4294: dup
    //   4295: bipush #34
    //   4297: ldc 268701696
    //   4299: iastore
    //   4300: dup
    //   4301: bipush #35
    //   4303: sipush #4096
    //   4306: iastore
    //   4307: dup
    //   4308: bipush #36
    //   4310: bipush #64
    //   4312: iastore
    //   4313: dup
    //   4314: bipush #37
    //   4316: ldc 268697664
    //   4318: iastore
    //   4319: dup
    //   4320: bipush #38
    //   4322: sipush #4096
    //   4325: iastore
    //   4326: dup
    //   4327: bipush #39
    //   4329: ldc 266304
    //   4331: iastore
    //   4332: dup
    //   4333: bipush #40
    //   4335: ldc 268439552
    //   4337: iastore
    //   4338: dup
    //   4339: bipush #41
    //   4341: bipush #64
    //   4343: iastore
    //   4344: dup
    //   4345: bipush #42
    //   4347: ldc 268435520
    //   4349: iastore
    //   4350: dup
    //   4351: bipush #43
    //   4353: ldc 268697600
    //   4355: iastore
    //   4356: dup
    //   4357: bipush #44
    //   4359: ldc 268697664
    //   4361: iastore
    //   4362: dup
    //   4363: bipush #45
    //   4365: ldc 268435456
    //   4367: iastore
    //   4368: dup
    //   4369: bipush #46
    //   4371: ldc 262144
    //   4373: iastore
    //   4374: dup
    //   4375: bipush #47
    //   4377: ldc 268439616
    //   4379: iastore
    //   4380: dup
    //   4381: bipush #48
    //   4383: iconst_0
    //   4384: iastore
    //   4385: dup
    //   4386: bipush #49
    //   4388: ldc 268701760
    //   4390: iastore
    //   4391: dup
    //   4392: bipush #50
    //   4394: ldc 262208
    //   4396: iastore
    //   4397: dup
    //   4398: bipush #51
    //   4400: ldc 268435520
    //   4402: iastore
    //   4403: dup
    //   4404: bipush #52
    //   4406: ldc 268697600
    //   4408: iastore
    //   4409: dup
    //   4410: bipush #53
    //   4412: ldc 268439552
    //   4414: iastore
    //   4415: dup
    //   4416: bipush #54
    //   4418: ldc 268439616
    //   4420: iastore
    //   4421: dup
    //   4422: bipush #55
    //   4424: iconst_0
    //   4425: iastore
    //   4426: dup
    //   4427: bipush #56
    //   4429: ldc 268701760
    //   4431: iastore
    //   4432: dup
    //   4433: bipush #57
    //   4435: ldc 266240
    //   4437: iastore
    //   4438: dup
    //   4439: bipush #58
    //   4441: ldc 266240
    //   4443: iastore
    //   4444: dup
    //   4445: bipush #59
    //   4447: sipush #4160
    //   4450: iastore
    //   4451: dup
    //   4452: bipush #60
    //   4454: sipush #4160
    //   4457: iastore
    //   4458: dup
    //   4459: bipush #61
    //   4461: ldc 262208
    //   4463: iastore
    //   4464: dup
    //   4465: bipush #62
    //   4467: ldc 268435456
    //   4469: iastore
    //   4470: dup
    //   4471: bipush #63
    //   4473: ldc 268701696
    //   4475: iastore
    //   4476: astore #15
    //   4478: aload_3
    //   4479: arraylength
    //   4480: istore #16
    //   4482: iconst_2
    //   4483: newarray int
    //   4485: astore #17
    //   4487: iload #16
    //   4489: newarray byte
    //   4491: astore #4
    //   4493: iload #16
    //   4495: bipush #8
    //   4497: idiv
    //   4498: istore #18
    //   4500: iconst_0
    //   4501: istore #19
    //   4503: iload #19
    //   4505: iload #18
    //   4507: if_icmpge -> 5421
    //   4510: iload #19
    //   4512: bipush #8
    //   4514: imul
    //   4515: istore #20
    //   4517: iconst_0
    //   4518: istore #21
    //   4520: iload #21
    //   4522: iconst_2
    //   4523: if_icmpge -> 4608
    //   4526: aload #17
    //   4528: iload #21
    //   4530: aload_3
    //   4531: iload #20
    //   4533: iload #21
    //   4535: iconst_4
    //   4536: imul
    //   4537: iadd
    //   4538: baload
    //   4539: sipush #255
    //   4542: iand
    //   4543: bipush #24
    //   4545: ishl
    //   4546: aload_3
    //   4547: iload #20
    //   4549: iload #21
    //   4551: iconst_4
    //   4552: imul
    //   4553: iadd
    //   4554: iconst_1
    //   4555: iadd
    //   4556: baload
    //   4557: sipush #255
    //   4560: iand
    //   4561: bipush #16
    //   4563: ishl
    //   4564: ior
    //   4565: aload_3
    //   4566: iload #20
    //   4568: iload #21
    //   4570: iconst_4
    //   4571: imul
    //   4572: iadd
    //   4573: iconst_2
    //   4574: iadd
    //   4575: baload
    //   4576: sipush #255
    //   4579: iand
    //   4580: bipush #8
    //   4582: ishl
    //   4583: ior
    //   4584: aload_3
    //   4585: iload #20
    //   4587: iload #21
    //   4589: iconst_4
    //   4590: imul
    //   4591: iadd
    //   4592: iconst_3
    //   4593: iadd
    //   4594: baload
    //   4595: sipush #255
    //   4598: iand
    //   4599: ior
    //   4600: iastore
    //   4601: iinc #21, 1
    //   4604: iload_2
    //   4605: ifne -> 4520
    //   4608: iconst_0
    //   4609: istore #26
    //   4611: aload #17
    //   4613: iconst_0
    //   4614: iaload
    //   4615: istore #24
    //   4617: aload #17
    //   4619: iconst_1
    //   4620: iaload
    //   4621: istore #23
    //   4623: iload #24
    //   4625: iconst_4
    //   4626: iushr
    //   4627: iload #23
    //   4629: ixor
    //   4630: ldc 252645135
    //   4632: iand
    //   4633: istore #22
    //   4635: iload #23
    //   4637: iload #22
    //   4639: ixor
    //   4640: istore #23
    //   4642: iload #24
    //   4644: iload #22
    //   4646: iconst_4
    //   4647: ishl
    //   4648: ixor
    //   4649: istore #24
    //   4651: iload #24
    //   4653: bipush #16
    //   4655: iushr
    //   4656: iload #23
    //   4658: ixor
    //   4659: ldc 65535
    //   4661: iand
    //   4662: istore #22
    //   4664: iload #23
    //   4666: iload #22
    //   4668: ixor
    //   4669: istore #23
    //   4671: iload #24
    //   4673: iload #22
    //   4675: bipush #16
    //   4677: ishl
    //   4678: ixor
    //   4679: istore #24
    //   4681: iload #23
    //   4683: iconst_2
    //   4684: iushr
    //   4685: iload #24
    //   4687: ixor
    //   4688: ldc 858993459
    //   4690: iand
    //   4691: istore #22
    //   4693: iload #24
    //   4695: iload #22
    //   4697: ixor
    //   4698: istore #24
    //   4700: iload #23
    //   4702: iload #22
    //   4704: iconst_2
    //   4705: ishl
    //   4706: ixor
    //   4707: istore #23
    //   4709: iload #23
    //   4711: bipush #8
    //   4713: iushr
    //   4714: iload #24
    //   4716: ixor
    //   4717: ldc 16711935
    //   4719: iand
    //   4720: istore #22
    //   4722: iload #24
    //   4724: iload #22
    //   4726: ixor
    //   4727: istore #24
    //   4729: iload #23
    //   4731: iload #22
    //   4733: bipush #8
    //   4735: ishl
    //   4736: ixor
    //   4737: istore #23
    //   4739: iload #23
    //   4741: iconst_1
    //   4742: ishl
    //   4743: iload #23
    //   4745: bipush #31
    //   4747: iushr
    //   4748: iconst_1
    //   4749: iand
    //   4750: ior
    //   4751: istore #23
    //   4753: iload #24
    //   4755: iload #23
    //   4757: ixor
    //   4758: ldc -1431655766
    //   4760: iand
    //   4761: istore #22
    //   4763: iload #24
    //   4765: iload #22
    //   4767: ixor
    //   4768: istore #24
    //   4770: iload #23
    //   4772: iload #22
    //   4774: ixor
    //   4775: istore #23
    //   4777: iload #24
    //   4779: iconst_1
    //   4780: ishl
    //   4781: iload #24
    //   4783: bipush #31
    //   4785: iushr
    //   4786: iconst_1
    //   4787: iand
    //   4788: ior
    //   4789: istore #24
    //   4791: iconst_0
    //   4792: istore #25
    //   4794: iload #25
    //   4796: bipush #8
    //   4798: if_icmpge -> 5136
    //   4801: iload #23
    //   4803: bipush #28
    //   4805: ishl
    //   4806: iload #23
    //   4808: iconst_4
    //   4809: iushr
    //   4810: ior
    //   4811: istore #22
    //   4813: iload #22
    //   4815: aload #5
    //   4817: iload #26
    //   4819: iinc #26, 1
    //   4822: iaload
    //   4823: ixor
    //   4824: istore #22
    //   4826: aload #14
    //   4828: iload #22
    //   4830: bipush #63
    //   4832: iand
    //   4833: iaload
    //   4834: istore #21
    //   4836: iload #21
    //   4838: aload #12
    //   4840: iload #22
    //   4842: bipush #8
    //   4844: iushr
    //   4845: bipush #63
    //   4847: iand
    //   4848: iaload
    //   4849: ior
    //   4850: istore #21
    //   4852: iload #21
    //   4854: aload #10
    //   4856: iload #22
    //   4858: bipush #16
    //   4860: iushr
    //   4861: bipush #63
    //   4863: iand
    //   4864: iaload
    //   4865: ior
    //   4866: istore #21
    //   4868: iload #21
    //   4870: aload #8
    //   4872: iload #22
    //   4874: bipush #24
    //   4876: iushr
    //   4877: bipush #63
    //   4879: iand
    //   4880: iaload
    //   4881: ior
    //   4882: istore #21
    //   4884: iload #23
    //   4886: aload #5
    //   4888: iload #26
    //   4890: iinc #26, 1
    //   4893: iaload
    //   4894: ixor
    //   4895: istore #22
    //   4897: iload #21
    //   4899: aload #15
    //   4901: iload #22
    //   4903: bipush #63
    //   4905: iand
    //   4906: iaload
    //   4907: ior
    //   4908: istore #21
    //   4910: iload #21
    //   4912: aload #13
    //   4914: iload #22
    //   4916: bipush #8
    //   4918: iushr
    //   4919: bipush #63
    //   4921: iand
    //   4922: iaload
    //   4923: ior
    //   4924: istore #21
    //   4926: iload #21
    //   4928: aload #11
    //   4930: iload #22
    //   4932: bipush #16
    //   4934: iushr
    //   4935: bipush #63
    //   4937: iand
    //   4938: iaload
    //   4939: ior
    //   4940: istore #21
    //   4942: iload #21
    //   4944: aload #9
    //   4946: iload #22
    //   4948: bipush #24
    //   4950: iushr
    //   4951: bipush #63
    //   4953: iand
    //   4954: iaload
    //   4955: ior
    //   4956: istore #21
    //   4958: iload #24
    //   4960: iload #21
    //   4962: ixor
    //   4963: istore #24
    //   4965: iload #24
    //   4967: bipush #28
    //   4969: ishl
    //   4970: iload #24
    //   4972: iconst_4
    //   4973: iushr
    //   4974: ior
    //   4975: istore #22
    //   4977: iload #22
    //   4979: aload #5
    //   4981: iload #26
    //   4983: iinc #26, 1
    //   4986: iaload
    //   4987: ixor
    //   4988: istore #22
    //   4990: aload #14
    //   4992: iload #22
    //   4994: bipush #63
    //   4996: iand
    //   4997: iaload
    //   4998: istore #21
    //   5000: iload #21
    //   5002: aload #12
    //   5004: iload #22
    //   5006: bipush #8
    //   5008: iushr
    //   5009: bipush #63
    //   5011: iand
    //   5012: iaload
    //   5013: ior
    //   5014: istore #21
    //   5016: iload #21
    //   5018: aload #10
    //   5020: iload #22
    //   5022: bipush #16
    //   5024: iushr
    //   5025: bipush #63
    //   5027: iand
    //   5028: iaload
    //   5029: ior
    //   5030: istore #21
    //   5032: iload #21
    //   5034: aload #8
    //   5036: iload #22
    //   5038: bipush #24
    //   5040: iushr
    //   5041: bipush #63
    //   5043: iand
    //   5044: iaload
    //   5045: ior
    //   5046: istore #21
    //   5048: iload #24
    //   5050: aload #5
    //   5052: iload #26
    //   5054: iinc #26, 1
    //   5057: iaload
    //   5058: ixor
    //   5059: istore #22
    //   5061: iload #21
    //   5063: aload #15
    //   5065: iload #22
    //   5067: bipush #63
    //   5069: iand
    //   5070: iaload
    //   5071: ior
    //   5072: istore #21
    //   5074: iload #21
    //   5076: aload #13
    //   5078: iload #22
    //   5080: bipush #8
    //   5082: iushr
    //   5083: bipush #63
    //   5085: iand
    //   5086: iaload
    //   5087: ior
    //   5088: istore #21
    //   5090: iload #21
    //   5092: aload #11
    //   5094: iload #22
    //   5096: bipush #16
    //   5098: iushr
    //   5099: bipush #63
    //   5101: iand
    //   5102: iaload
    //   5103: ior
    //   5104: istore #21
    //   5106: iload #21
    //   5108: aload #9
    //   5110: iload #22
    //   5112: bipush #24
    //   5114: iushr
    //   5115: bipush #63
    //   5117: iand
    //   5118: iaload
    //   5119: ior
    //   5120: istore #21
    //   5122: iload #23
    //   5124: iload #21
    //   5126: ixor
    //   5127: istore #23
    //   5129: iinc #25, 1
    //   5132: iload_2
    //   5133: ifne -> 4794
    //   5136: iload #23
    //   5138: bipush #31
    //   5140: ishl
    //   5141: iload #23
    //   5143: iconst_1
    //   5144: iushr
    //   5145: ior
    //   5146: istore #23
    //   5148: iload #24
    //   5150: iload #23
    //   5152: ixor
    //   5153: ldc -1431655766
    //   5155: iand
    //   5156: istore #22
    //   5158: iload #24
    //   5160: iload #22
    //   5162: ixor
    //   5163: istore #24
    //   5165: iload #23
    //   5167: iload #22
    //   5169: ixor
    //   5170: istore #23
    //   5172: iload #24
    //   5174: bipush #31
    //   5176: ishl
    //   5177: iload #24
    //   5179: iconst_1
    //   5180: iushr
    //   5181: ior
    //   5182: istore #24
    //   5184: iload #24
    //   5186: bipush #8
    //   5188: iushr
    //   5189: iload #23
    //   5191: ixor
    //   5192: ldc 16711935
    //   5194: iand
    //   5195: istore #22
    //   5197: iload #23
    //   5199: iload #22
    //   5201: ixor
    //   5202: istore #23
    //   5204: iload #24
    //   5206: iload #22
    //   5208: bipush #8
    //   5210: ishl
    //   5211: ixor
    //   5212: istore #24
    //   5214: iload #24
    //   5216: iconst_2
    //   5217: iushr
    //   5218: iload #23
    //   5220: ixor
    //   5221: ldc 858993459
    //   5223: iand
    //   5224: istore #22
    //   5226: iload #23
    //   5228: iload #22
    //   5230: ixor
    //   5231: istore #23
    //   5233: iload #24
    //   5235: iload #22
    //   5237: iconst_2
    //   5238: ishl
    //   5239: ixor
    //   5240: istore #24
    //   5242: iload #23
    //   5244: bipush #16
    //   5246: iushr
    //   5247: iload #24
    //   5249: ixor
    //   5250: ldc 65535
    //   5252: iand
    //   5253: istore #22
    //   5255: iload #24
    //   5257: iload #22
    //   5259: ixor
    //   5260: istore #24
    //   5262: iload #23
    //   5264: iload #22
    //   5266: bipush #16
    //   5268: ishl
    //   5269: ixor
    //   5270: istore #23
    //   5272: iload #23
    //   5274: iconst_4
    //   5275: iushr
    //   5276: iload #24
    //   5278: ixor
    //   5279: ldc 252645135
    //   5281: iand
    //   5282: istore #22
    //   5284: iload #24
    //   5286: iload #22
    //   5288: ixor
    //   5289: istore #24
    //   5291: iload #23
    //   5293: iload #22
    //   5295: iconst_4
    //   5296: ishl
    //   5297: ixor
    //   5298: istore #23
    //   5300: aload #17
    //   5302: iconst_0
    //   5303: iload #23
    //   5305: iastore
    //   5306: aload #17
    //   5308: iconst_1
    //   5309: iload #24
    //   5311: iastore
    //   5312: iload #19
    //   5314: bipush #8
    //   5316: imul
    //   5317: istore #27
    //   5319: iconst_0
    //   5320: istore #28
    //   5322: iload #28
    //   5324: iconst_2
    //   5325: if_icmpge -> 5414
    //   5328: aload #4
    //   5330: iload #27
    //   5332: iload #28
    //   5334: iconst_4
    //   5335: imul
    //   5336: iadd
    //   5337: aload #17
    //   5339: iload #28
    //   5341: iaload
    //   5342: bipush #24
    //   5344: iushr
    //   5345: i2b
    //   5346: bastore
    //   5347: aload #4
    //   5349: iload #27
    //   5351: iload #28
    //   5353: iconst_4
    //   5354: imul
    //   5355: iadd
    //   5356: iconst_1
    //   5357: iadd
    //   5358: aload #17
    //   5360: iload #28
    //   5362: iaload
    //   5363: bipush #16
    //   5365: iushr
    //   5366: i2b
    //   5367: bastore
    //   5368: aload #4
    //   5370: iload #27
    //   5372: iload #28
    //   5374: iconst_4
    //   5375: imul
    //   5376: iadd
    //   5377: iconst_2
    //   5378: iadd
    //   5379: aload #17
    //   5381: iload #28
    //   5383: iaload
    //   5384: bipush #8
    //   5386: iushr
    //   5387: i2b
    //   5388: bastore
    //   5389: aload #4
    //   5391: iload #27
    //   5393: iload #28
    //   5395: iconst_4
    //   5396: imul
    //   5397: iadd
    //   5398: iconst_3
    //   5399: iadd
    //   5400: aload #17
    //   5402: iload #28
    //   5404: iaload
    //   5405: i2b
    //   5406: bastore
    //   5407: iinc #28, 1
    //   5410: iload_2
    //   5411: ifne -> 5322
    //   5414: iinc #19, 1
    //   5417: iload_2
    //   5418: ifne -> 4503
    //   5421: iconst_0
    //   5422: istore_3
    //   5423: getstatic burp/Zzh5.Zc : Ljava/lang/String;
    //   5426: getstatic burp/Zbss.Zh : Ljava/lang/Object;
    //   5429: checkcast java/math/BigInteger
    //   5432: invokevirtual intValue : ()I
    //   5435: bipush #32
    //   5437: irem
    //   5438: invokestatic abs : (I)I
    //   5441: invokevirtual charAt : (I)C
    //   5444: getstatic burp/Zxln.Zz : Ljava/lang/String;
    //   5447: getstatic burp/Zsjw.Zw : Ljava/lang/Object;
    //   5450: checkcast java/math/BigInteger
    //   5453: invokevirtual intValue : ()I
    //   5456: bipush #32
    //   5458: irem
    //   5459: invokestatic abs : (I)I
    //   5462: invokevirtual charAt : (I)C
    //   5465: if_icmple -> 5809
    //   5468: sipush #-3394
    //   5471: sipush #18027
    //   5474: invokestatic a : (II)Ljava/lang/String;
    //   5477: iconst_1
    //   5478: ldc burp/Zkbf
    //   5480: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5483: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5486: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5489: astore #4
    //   5491: aload #4
    //   5493: arraylength
    //   5494: istore #5
    //   5496: iconst_0
    //   5497: istore #6
    //   5499: iload #6
    //   5501: iload #5
    //   5503: if_icmpge -> 5641
    //   5506: aload #4
    //   5508: iload #6
    //   5510: aaload
    //   5511: astore #7
    //   5513: aload #7
    //   5515: invokevirtual getModifiers : ()I
    //   5518: invokestatic isStatic : (I)Z
    //   5521: ifne -> 5531
    //   5524: goto -> 5634
    //   5527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5530: athrow
    //   5531: aload #7
    //   5533: invokevirtual getType : ()Ljava/lang/Class;
    //   5536: astore #8
    //   5538: aload #8
    //   5540: ifnull -> 5621
    //   5543: aload #8
    //   5545: invokevirtual isPrimitive : ()Z
    //   5548: ifne -> 5621
    //   5551: goto -> 5558
    //   5554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5557: athrow
    //   5558: aload #8
    //   5560: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5563: ifnull -> 5621
    //   5566: goto -> 5573
    //   5569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5572: athrow
    //   5573: aload #8
    //   5575: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5578: invokevirtual getName : ()Ljava/lang/String;
    //   5581: ifnull -> 5621
    //   5584: goto -> 5591
    //   5587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5590: athrow
    //   5591: aload #8
    //   5593: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5596: invokevirtual getName : ()Ljava/lang/String;
    //   5599: sipush #-3405
    //   5602: sipush #-18868
    //   5605: invokestatic a : (II)Ljava/lang/String;
    //   5608: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5611: ifne -> 5621
    //   5614: goto -> 5621
    //   5617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5620: athrow
    //   5621: aload #7
    //   5623: iconst_1
    //   5624: invokevirtual setAccessible : (Z)V
    //   5627: aload #7
    //   5629: aconst_null
    //   5630: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5633: pop
    //   5634: iinc #6, 1
    //   5637: iload_2
    //   5638: ifne -> 5499
    //   5641: sipush #-3396
    //   5644: sipush #-10860
    //   5647: invokestatic a : (II)Ljava/lang/String;
    //   5650: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5653: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5656: astore #4
    //   5658: aload #4
    //   5660: arraylength
    //   5661: istore #5
    //   5663: iconst_0
    //   5664: istore #6
    //   5666: iload #6
    //   5668: iload #5
    //   5670: if_icmpge -> 5806
    //   5673: aload #4
    //   5675: iload #6
    //   5677: aaload
    //   5678: astore #7
    //   5680: aload #7
    //   5682: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5685: pop
    //   5686: aload #7
    //   5688: invokevirtual getModifiers : ()I
    //   5691: invokestatic isStatic : (I)Z
    //   5694: ifeq -> 5792
    //   5697: aload #7
    //   5699: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5702: arraylength
    //   5703: iconst_2
    //   5704: if_icmpne -> 5792
    //   5707: goto -> 5714
    //   5710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5713: athrow
    //   5714: aload #7
    //   5716: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5719: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5722: if_acmpne -> 5792
    //   5725: goto -> 5732
    //   5728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5731: athrow
    //   5732: aload #7
    //   5734: iconst_1
    //   5735: invokevirtual setAccessible : (Z)V
    //   5738: aload #7
    //   5740: aconst_null
    //   5741: iconst_2
    //   5742: anewarray java/lang/Object
    //   5745: dup
    //   5746: iconst_0
    //   5747: aload_0
    //   5748: aastore
    //   5749: dup
    //   5750: iconst_1
    //   5751: aload_1
    //   5752: ifnonnull -> 5770
    //   5755: goto -> 5762
    //   5758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5761: athrow
    //   5762: aload_1
    //   5763: goto -> 5777
    //   5766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5769: athrow
    //   5770: aload_1
    //   5771: checkcast [B
    //   5774: invokevirtual clone : ()Ljava/lang/Object;
    //   5777: aastore
    //   5778: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5781: checkcast java/lang/Boolean
    //   5784: invokevirtual booleanValue : ()Z
    //   5787: istore_3
    //   5788: iload_2
    //   5789: ifne -> 5806
    //   5792: iinc #6, 1
    //   5795: iload_2
    //   5796: ifne -> 5666
    //   5799: goto -> 5806
    //   5802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5805: athrow
    //   5806: goto -> 6147
    //   5809: sipush #-3414
    //   5812: sipush #-17935
    //   5815: invokestatic a : (II)Ljava/lang/String;
    //   5818: iconst_1
    //   5819: ldc burp/Ztcv
    //   5821: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5824: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5827: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5830: astore #4
    //   5832: aload #4
    //   5834: arraylength
    //   5835: istore #5
    //   5837: iconst_0
    //   5838: istore #6
    //   5840: iload #6
    //   5842: iload #5
    //   5844: if_icmpge -> 5982
    //   5847: aload #4
    //   5849: iload #6
    //   5851: aaload
    //   5852: astore #7
    //   5854: aload #7
    //   5856: invokevirtual getModifiers : ()I
    //   5859: invokestatic isStatic : (I)Z
    //   5862: ifne -> 5872
    //   5865: goto -> 5975
    //   5868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5871: athrow
    //   5872: aload #7
    //   5874: invokevirtual getType : ()Ljava/lang/Class;
    //   5877: astore #8
    //   5879: aload #8
    //   5881: ifnull -> 5962
    //   5884: aload #8
    //   5886: invokevirtual isPrimitive : ()Z
    //   5889: ifne -> 5962
    //   5892: goto -> 5899
    //   5895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5898: athrow
    //   5899: aload #8
    //   5901: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5904: ifnull -> 5962
    //   5907: goto -> 5914
    //   5910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5913: athrow
    //   5914: aload #8
    //   5916: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5919: invokevirtual getName : ()Ljava/lang/String;
    //   5922: ifnull -> 5962
    //   5925: goto -> 5932
    //   5928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5931: athrow
    //   5932: aload #8
    //   5934: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5937: invokevirtual getName : ()Ljava/lang/String;
    //   5940: sipush #-3405
    //   5943: sipush #-18868
    //   5946: invokestatic a : (II)Ljava/lang/String;
    //   5949: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5952: ifne -> 5962
    //   5955: goto -> 5962
    //   5958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5961: athrow
    //   5962: aload #7
    //   5964: iconst_1
    //   5965: invokevirtual setAccessible : (Z)V
    //   5968: aload #7
    //   5970: aconst_null
    //   5971: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5974: pop
    //   5975: iinc #6, 1
    //   5978: iload_2
    //   5979: ifne -> 5840
    //   5982: sipush #-3400
    //   5985: sipush #28328
    //   5988: invokestatic a : (II)Ljava/lang/String;
    //   5991: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5994: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5997: astore #4
    //   5999: aload #4
    //   6001: arraylength
    //   6002: istore #5
    //   6004: iconst_0
    //   6005: istore #6
    //   6007: iload #6
    //   6009: iload #5
    //   6011: if_icmpge -> 6147
    //   6014: aload #4
    //   6016: iload #6
    //   6018: aaload
    //   6019: astore #7
    //   6021: aload #7
    //   6023: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6026: pop
    //   6027: aload #7
    //   6029: invokevirtual getModifiers : ()I
    //   6032: invokestatic isStatic : (I)Z
    //   6035: ifeq -> 6133
    //   6038: aload #7
    //   6040: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6043: arraylength
    //   6044: iconst_2
    //   6045: if_icmpne -> 6133
    //   6048: goto -> 6055
    //   6051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6054: athrow
    //   6055: aload #7
    //   6057: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6060: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6063: if_acmpne -> 6133
    //   6066: goto -> 6073
    //   6069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6072: athrow
    //   6073: aload #7
    //   6075: iconst_1
    //   6076: invokevirtual setAccessible : (Z)V
    //   6079: aload #7
    //   6081: aconst_null
    //   6082: iconst_2
    //   6083: anewarray java/lang/Object
    //   6086: dup
    //   6087: iconst_0
    //   6088: aload_0
    //   6089: aastore
    //   6090: dup
    //   6091: iconst_1
    //   6092: aload_1
    //   6093: ifnonnull -> 6111
    //   6096: goto -> 6103
    //   6099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6102: athrow
    //   6103: aload_1
    //   6104: goto -> 6118
    //   6107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6110: athrow
    //   6111: aload_1
    //   6112: checkcast [B
    //   6115: invokevirtual clone : ()Ljava/lang/Object;
    //   6118: aastore
    //   6119: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6122: checkcast java/lang/Boolean
    //   6125: invokevirtual booleanValue : ()Z
    //   6128: istore_3
    //   6129: iload_2
    //   6130: ifne -> 6147
    //   6133: iinc #6, 1
    //   6136: iload_2
    //   6137: ifne -> 6007
    //   6140: goto -> 6147
    //   6143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6146: athrow
    //   6147: iload_3
    //   6148: ifeq -> 6153
    //   6151: iload_3
    //   6152: ireturn
    //   6153: getstatic burp/Zm63.Zs : Ljava/lang/String;
    //   6156: getstatic burp/Zeqz.ZG : Ljava/lang/Object;
    //   6159: checkcast java/math/BigInteger
    //   6162: invokevirtual intValue : ()I
    //   6165: bipush #32
    //   6167: irem
    //   6168: invokestatic abs : (I)I
    //   6171: invokevirtual charAt : (I)C
    //   6174: getstatic burp/Zxci.Zw : Ljava/lang/String;
    //   6177: getstatic burp/Zgpx.ZQ : Ljava/lang/Object;
    //   6180: checkcast java/math/BigInteger
    //   6183: invokevirtual intValue : ()I
    //   6186: bipush #32
    //   6188: irem
    //   6189: invokestatic abs : (I)I
    //   6192: invokevirtual charAt : (I)C
    //   6195: if_icmpgt -> 6540
    //   6198: sipush #-3422
    //   6201: sipush #1682
    //   6204: invokestatic a : (II)Ljava/lang/String;
    //   6207: iconst_1
    //   6208: ldc burp/Zxtn
    //   6210: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6213: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6216: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6219: astore #4
    //   6221: aload #4
    //   6223: arraylength
    //   6224: istore #5
    //   6226: iconst_0
    //   6227: istore #6
    //   6229: iload #6
    //   6231: iload #5
    //   6233: if_icmpge -> 6371
    //   6236: aload #4
    //   6238: iload #6
    //   6240: aaload
    //   6241: astore #7
    //   6243: aload #7
    //   6245: invokevirtual getModifiers : ()I
    //   6248: invokestatic isStatic : (I)Z
    //   6251: ifne -> 6261
    //   6254: goto -> 6364
    //   6257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6260: athrow
    //   6261: aload #7
    //   6263: invokevirtual getType : ()Ljava/lang/Class;
    //   6266: astore #8
    //   6268: aload #8
    //   6270: ifnull -> 6351
    //   6273: aload #8
    //   6275: invokevirtual isPrimitive : ()Z
    //   6278: ifne -> 6351
    //   6281: goto -> 6288
    //   6284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6287: athrow
    //   6288: aload #8
    //   6290: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6293: ifnull -> 6351
    //   6296: goto -> 6303
    //   6299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6302: athrow
    //   6303: aload #8
    //   6305: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6308: invokevirtual getName : ()Ljava/lang/String;
    //   6311: ifnull -> 6351
    //   6314: goto -> 6321
    //   6317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6320: athrow
    //   6321: aload #8
    //   6323: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6326: invokevirtual getName : ()Ljava/lang/String;
    //   6329: sipush #-3405
    //   6332: sipush #-18868
    //   6335: invokestatic a : (II)Ljava/lang/String;
    //   6338: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6341: ifne -> 6351
    //   6344: goto -> 6351
    //   6347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6350: athrow
    //   6351: aload #7
    //   6353: iconst_1
    //   6354: invokevirtual setAccessible : (Z)V
    //   6357: aload #7
    //   6359: aconst_null
    //   6360: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6363: pop
    //   6364: iinc #6, 1
    //   6367: iload_2
    //   6368: ifne -> 6229
    //   6371: sipush #-3397
    //   6374: sipush #-3224
    //   6377: invokestatic a : (II)Ljava/lang/String;
    //   6380: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6383: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6386: astore #4
    //   6388: aload #4
    //   6390: arraylength
    //   6391: istore #5
    //   6393: iconst_0
    //   6394: istore #6
    //   6396: iload #6
    //   6398: iload #5
    //   6400: if_icmpge -> 6536
    //   6403: aload #4
    //   6405: iload #6
    //   6407: aaload
    //   6408: astore #7
    //   6410: aload #7
    //   6412: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6415: pop
    //   6416: aload #7
    //   6418: invokevirtual getModifiers : ()I
    //   6421: invokestatic isStatic : (I)Z
    //   6424: ifeq -> 6522
    //   6427: aload #7
    //   6429: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6432: arraylength
    //   6433: iconst_2
    //   6434: if_icmpne -> 6522
    //   6437: goto -> 6444
    //   6440: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6443: athrow
    //   6444: aload #7
    //   6446: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6449: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6452: if_acmpne -> 6522
    //   6455: goto -> 6462
    //   6458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6461: athrow
    //   6462: aload #7
    //   6464: iconst_1
    //   6465: invokevirtual setAccessible : (Z)V
    //   6468: aload #7
    //   6470: aconst_null
    //   6471: iconst_2
    //   6472: anewarray java/lang/Object
    //   6475: dup
    //   6476: iconst_0
    //   6477: aload_0
    //   6478: aastore
    //   6479: dup
    //   6480: iconst_1
    //   6481: aload_1
    //   6482: ifnonnull -> 6500
    //   6485: goto -> 6492
    //   6488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6491: athrow
    //   6492: aload_1
    //   6493: goto -> 6507
    //   6496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6499: athrow
    //   6500: aload_1
    //   6501: checkcast [B
    //   6504: invokevirtual clone : ()Ljava/lang/Object;
    //   6507: aastore
    //   6508: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6511: checkcast java/lang/Boolean
    //   6514: invokevirtual booleanValue : ()Z
    //   6517: istore_3
    //   6518: iload_2
    //   6519: ifne -> 6536
    //   6522: iinc #6, 1
    //   6525: iload_2
    //   6526: ifne -> 6396
    //   6529: goto -> 6536
    //   6532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6535: athrow
    //   6536: iload_2
    //   6537: ifne -> 6878
    //   6540: sipush #-3412
    //   6543: sipush #30459
    //   6546: invokestatic a : (II)Ljava/lang/String;
    //   6549: iconst_1
    //   6550: ldc burp/Zgl2
    //   6552: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6555: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6558: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6561: astore #4
    //   6563: aload #4
    //   6565: arraylength
    //   6566: istore #5
    //   6568: iconst_0
    //   6569: istore #6
    //   6571: iload #6
    //   6573: iload #5
    //   6575: if_icmpge -> 6713
    //   6578: aload #4
    //   6580: iload #6
    //   6582: aaload
    //   6583: astore #7
    //   6585: aload #7
    //   6587: invokevirtual getModifiers : ()I
    //   6590: invokestatic isStatic : (I)Z
    //   6593: ifne -> 6603
    //   6596: goto -> 6706
    //   6599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6602: athrow
    //   6603: aload #7
    //   6605: invokevirtual getType : ()Ljava/lang/Class;
    //   6608: astore #8
    //   6610: aload #8
    //   6612: ifnull -> 6693
    //   6615: aload #8
    //   6617: invokevirtual isPrimitive : ()Z
    //   6620: ifne -> 6693
    //   6623: goto -> 6630
    //   6626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6629: athrow
    //   6630: aload #8
    //   6632: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6635: ifnull -> 6693
    //   6638: goto -> 6645
    //   6641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6644: athrow
    //   6645: aload #8
    //   6647: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6650: invokevirtual getName : ()Ljava/lang/String;
    //   6653: ifnull -> 6693
    //   6656: goto -> 6663
    //   6659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6662: athrow
    //   6663: aload #8
    //   6665: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6668: invokevirtual getName : ()Ljava/lang/String;
    //   6671: sipush #-3405
    //   6674: sipush #-18868
    //   6677: invokestatic a : (II)Ljava/lang/String;
    //   6680: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6683: ifne -> 6693
    //   6686: goto -> 6693
    //   6689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6692: athrow
    //   6693: aload #7
    //   6695: iconst_1
    //   6696: invokevirtual setAccessible : (Z)V
    //   6699: aload #7
    //   6701: aconst_null
    //   6702: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6705: pop
    //   6706: iinc #6, 1
    //   6709: iload_2
    //   6710: ifne -> 6571
    //   6713: sipush #-3399
    //   6716: sipush #19333
    //   6719: invokestatic a : (II)Ljava/lang/String;
    //   6722: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6725: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6728: astore #4
    //   6730: aload #4
    //   6732: arraylength
    //   6733: istore #5
    //   6735: iconst_0
    //   6736: istore #6
    //   6738: iload #6
    //   6740: iload #5
    //   6742: if_icmpge -> 6878
    //   6745: aload #4
    //   6747: iload #6
    //   6749: aaload
    //   6750: astore #7
    //   6752: aload #7
    //   6754: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6757: pop
    //   6758: aload #7
    //   6760: invokevirtual getModifiers : ()I
    //   6763: invokestatic isStatic : (I)Z
    //   6766: ifeq -> 6864
    //   6769: aload #7
    //   6771: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6774: arraylength
    //   6775: iconst_2
    //   6776: if_icmpne -> 6864
    //   6779: goto -> 6786
    //   6782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6785: athrow
    //   6786: aload #7
    //   6788: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6791: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6794: if_acmpne -> 6864
    //   6797: goto -> 6804
    //   6800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6803: athrow
    //   6804: aload #7
    //   6806: iconst_1
    //   6807: invokevirtual setAccessible : (Z)V
    //   6810: aload #7
    //   6812: aconst_null
    //   6813: iconst_2
    //   6814: anewarray java/lang/Object
    //   6817: dup
    //   6818: iconst_0
    //   6819: aload_0
    //   6820: aastore
    //   6821: dup
    //   6822: iconst_1
    //   6823: aload_1
    //   6824: ifnonnull -> 6842
    //   6827: goto -> 6834
    //   6830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6833: athrow
    //   6834: aload_1
    //   6835: goto -> 6849
    //   6838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6841: athrow
    //   6842: aload_1
    //   6843: checkcast [B
    //   6846: invokevirtual clone : ()Ljava/lang/Object;
    //   6849: aastore
    //   6850: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6853: checkcast java/lang/Boolean
    //   6856: invokevirtual booleanValue : ()Z
    //   6859: istore_3
    //   6860: iload_2
    //   6861: ifne -> 6878
    //   6864: iinc #6, 1
    //   6867: iload_2
    //   6868: ifne -> 6738
    //   6871: goto -> 6878
    //   6874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6877: athrow
    //   6878: iload_3
    //   6879: ifeq -> 6884
    //   6882: iload_3
    //   6883: ireturn
    //   6884: getstatic burp/Zrqi.Zu : Ljava/lang/String;
    //   6887: getstatic burp/Ztnn.ZA : Ljava/lang/Object;
    //   6890: checkcast java/math/BigInteger
    //   6893: invokevirtual intValue : ()I
    //   6896: bipush #32
    //   6898: irem
    //   6899: invokestatic abs : (I)I
    //   6902: invokevirtual charAt : (I)C
    //   6905: getstatic burp/Ztvg.ZZ : Ljava/lang/String;
    //   6908: getstatic burp/Zs4g.ZC : Ljava/lang/Object;
    //   6911: checkcast java/math/BigInteger
    //   6914: invokevirtual intValue : ()I
    //   6917: bipush #32
    //   6919: irem
    //   6920: invokestatic abs : (I)I
    //   6923: invokevirtual charAt : (I)C
    //   6926: if_icmpgt -> 7271
    //   6929: sipush #-3423
    //   6932: sipush #30852
    //   6935: invokestatic a : (II)Ljava/lang/String;
    //   6938: iconst_1
    //   6939: ldc burp/Zstq
    //   6941: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6944: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6947: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6950: astore #4
    //   6952: aload #4
    //   6954: arraylength
    //   6955: istore #5
    //   6957: iconst_0
    //   6958: istore #6
    //   6960: iload #6
    //   6962: iload #5
    //   6964: if_icmpge -> 7102
    //   6967: aload #4
    //   6969: iload #6
    //   6971: aaload
    //   6972: astore #7
    //   6974: aload #7
    //   6976: invokevirtual getModifiers : ()I
    //   6979: invokestatic isStatic : (I)Z
    //   6982: ifne -> 6992
    //   6985: goto -> 7095
    //   6988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6991: athrow
    //   6992: aload #7
    //   6994: invokevirtual getType : ()Ljava/lang/Class;
    //   6997: astore #8
    //   6999: aload #8
    //   7001: ifnull -> 7082
    //   7004: aload #8
    //   7006: invokevirtual isPrimitive : ()Z
    //   7009: ifne -> 7082
    //   7012: goto -> 7019
    //   7015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7018: athrow
    //   7019: aload #8
    //   7021: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7024: ifnull -> 7082
    //   7027: goto -> 7034
    //   7030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7033: athrow
    //   7034: aload #8
    //   7036: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7039: invokevirtual getName : ()Ljava/lang/String;
    //   7042: ifnull -> 7082
    //   7045: goto -> 7052
    //   7048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7051: athrow
    //   7052: aload #8
    //   7054: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7057: invokevirtual getName : ()Ljava/lang/String;
    //   7060: sipush #-3405
    //   7063: sipush #-18868
    //   7066: invokestatic a : (II)Ljava/lang/String;
    //   7069: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7072: ifne -> 7082
    //   7075: goto -> 7082
    //   7078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7081: athrow
    //   7082: aload #7
    //   7084: iconst_1
    //   7085: invokevirtual setAccessible : (Z)V
    //   7088: aload #7
    //   7090: aconst_null
    //   7091: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7094: pop
    //   7095: iinc #6, 1
    //   7098: iload_2
    //   7099: ifne -> 6960
    //   7102: sipush #-3393
    //   7105: sipush #6909
    //   7108: invokestatic a : (II)Ljava/lang/String;
    //   7111: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7114: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7117: astore #4
    //   7119: aload #4
    //   7121: arraylength
    //   7122: istore #5
    //   7124: iconst_0
    //   7125: istore #6
    //   7127: iload #6
    //   7129: iload #5
    //   7131: if_icmpge -> 7267
    //   7134: aload #4
    //   7136: iload #6
    //   7138: aaload
    //   7139: astore #7
    //   7141: aload #7
    //   7143: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7146: pop
    //   7147: aload #7
    //   7149: invokevirtual getModifiers : ()I
    //   7152: invokestatic isStatic : (I)Z
    //   7155: ifeq -> 7253
    //   7158: aload #7
    //   7160: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7163: arraylength
    //   7164: iconst_2
    //   7165: if_icmpne -> 7253
    //   7168: goto -> 7175
    //   7171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7174: athrow
    //   7175: aload #7
    //   7177: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7180: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7183: if_acmpne -> 7253
    //   7186: goto -> 7193
    //   7189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7192: athrow
    //   7193: aload #7
    //   7195: iconst_1
    //   7196: invokevirtual setAccessible : (Z)V
    //   7199: aload #7
    //   7201: aconst_null
    //   7202: iconst_2
    //   7203: anewarray java/lang/Object
    //   7206: dup
    //   7207: iconst_0
    //   7208: aload_0
    //   7209: aastore
    //   7210: dup
    //   7211: iconst_1
    //   7212: aload_1
    //   7213: ifnonnull -> 7231
    //   7216: goto -> 7223
    //   7219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7222: athrow
    //   7223: aload_1
    //   7224: goto -> 7238
    //   7227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7230: athrow
    //   7231: aload_1
    //   7232: checkcast [B
    //   7235: invokevirtual clone : ()Ljava/lang/Object;
    //   7238: aastore
    //   7239: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7242: checkcast java/lang/Boolean
    //   7245: invokevirtual booleanValue : ()Z
    //   7248: istore_3
    //   7249: iload_2
    //   7250: ifne -> 7267
    //   7253: iinc #6, 1
    //   7256: iload_2
    //   7257: ifne -> 7127
    //   7260: goto -> 7267
    //   7263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7266: athrow
    //   7267: iload_2
    //   7268: ifne -> 7609
    //   7271: sipush #-3408
    //   7274: sipush #-24747
    //   7277: invokestatic a : (II)Ljava/lang/String;
    //   7280: iconst_1
    //   7281: ldc burp/Zmli
    //   7283: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7286: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7289: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7292: astore #4
    //   7294: aload #4
    //   7296: arraylength
    //   7297: istore #5
    //   7299: iconst_0
    //   7300: istore #6
    //   7302: iload #6
    //   7304: iload #5
    //   7306: if_icmpge -> 7444
    //   7309: aload #4
    //   7311: iload #6
    //   7313: aaload
    //   7314: astore #7
    //   7316: aload #7
    //   7318: invokevirtual getModifiers : ()I
    //   7321: invokestatic isStatic : (I)Z
    //   7324: ifne -> 7334
    //   7327: goto -> 7437
    //   7330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7333: athrow
    //   7334: aload #7
    //   7336: invokevirtual getType : ()Ljava/lang/Class;
    //   7339: astore #8
    //   7341: aload #8
    //   7343: ifnull -> 7424
    //   7346: aload #8
    //   7348: invokevirtual isPrimitive : ()Z
    //   7351: ifne -> 7424
    //   7354: goto -> 7361
    //   7357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7360: athrow
    //   7361: aload #8
    //   7363: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7366: ifnull -> 7424
    //   7369: goto -> 7376
    //   7372: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7375: athrow
    //   7376: aload #8
    //   7378: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7381: invokevirtual getName : ()Ljava/lang/String;
    //   7384: ifnull -> 7424
    //   7387: goto -> 7394
    //   7390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7393: athrow
    //   7394: aload #8
    //   7396: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7399: invokevirtual getName : ()Ljava/lang/String;
    //   7402: sipush #-3405
    //   7405: sipush #-18868
    //   7408: invokestatic a : (II)Ljava/lang/String;
    //   7411: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7414: ifne -> 7424
    //   7417: goto -> 7424
    //   7420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7423: athrow
    //   7424: aload #7
    //   7426: iconst_1
    //   7427: invokevirtual setAccessible : (Z)V
    //   7430: aload #7
    //   7432: aconst_null
    //   7433: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7436: pop
    //   7437: iinc #6, 1
    //   7440: iload_2
    //   7441: ifne -> 7302
    //   7444: sipush #-3395
    //   7447: sipush #15354
    //   7450: invokestatic a : (II)Ljava/lang/String;
    //   7453: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7456: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7459: astore #4
    //   7461: aload #4
    //   7463: arraylength
    //   7464: istore #5
    //   7466: iconst_0
    //   7467: istore #6
    //   7469: iload #6
    //   7471: iload #5
    //   7473: if_icmpge -> 7609
    //   7476: aload #4
    //   7478: iload #6
    //   7480: aaload
    //   7481: astore #7
    //   7483: aload #7
    //   7485: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7488: pop
    //   7489: aload #7
    //   7491: invokevirtual getModifiers : ()I
    //   7494: invokestatic isStatic : (I)Z
    //   7497: ifeq -> 7595
    //   7500: aload #7
    //   7502: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7505: arraylength
    //   7506: iconst_2
    //   7507: if_icmpne -> 7595
    //   7510: goto -> 7517
    //   7513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7516: athrow
    //   7517: aload #7
    //   7519: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7522: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7525: if_acmpne -> 7595
    //   7528: goto -> 7535
    //   7531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7534: athrow
    //   7535: aload #7
    //   7537: iconst_1
    //   7538: invokevirtual setAccessible : (Z)V
    //   7541: aload #7
    //   7543: aconst_null
    //   7544: iconst_2
    //   7545: anewarray java/lang/Object
    //   7548: dup
    //   7549: iconst_0
    //   7550: aload_0
    //   7551: aastore
    //   7552: dup
    //   7553: iconst_1
    //   7554: aload_1
    //   7555: ifnonnull -> 7573
    //   7558: goto -> 7565
    //   7561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7564: athrow
    //   7565: aload_1
    //   7566: goto -> 7580
    //   7569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7572: athrow
    //   7573: aload_1
    //   7574: checkcast [B
    //   7577: invokevirtual clone : ()Ljava/lang/Object;
    //   7580: aastore
    //   7581: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7584: checkcast java/lang/Boolean
    //   7587: invokevirtual booleanValue : ()Z
    //   7590: istore_3
    //   7591: iload_2
    //   7592: ifne -> 7609
    //   7595: iinc #6, 1
    //   7598: iload_2
    //   7599: ifne -> 7469
    //   7602: goto -> 7609
    //   7605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7608: athrow
    //   7609: iload_3
    //   7610: ifeq -> 7615
    //   7613: iload_3
    //   7614: ireturn
    //   7615: getstatic burp/Zgsy.Zv : Ljava/lang/String;
    //   7618: getstatic burp/Zk92.Zn : Ljava/lang/Object;
    //   7621: checkcast java/math/BigInteger
    //   7624: invokevirtual intValue : ()I
    //   7627: bipush #32
    //   7629: irem
    //   7630: invokestatic abs : (I)I
    //   7633: invokevirtual charAt : (I)C
    //   7636: getstatic burp/Zejz.Zd : Ljava/lang/String;
    //   7639: getstatic burp/Ze5h.Zn : Ljava/lang/Object;
    //   7642: checkcast java/math/BigInteger
    //   7645: invokevirtual intValue : ()I
    //   7648: bipush #32
    //   7650: irem
    //   7651: invokestatic abs : (I)I
    //   7654: invokevirtual charAt : (I)C
    //   7657: if_icmple -> 8002
    //   7660: sipush #-3416
    //   7663: sipush #-25724
    //   7666: invokestatic a : (II)Ljava/lang/String;
    //   7669: iconst_1
    //   7670: ldc burp/Zlbr
    //   7672: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7675: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7678: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7681: astore #4
    //   7683: aload #4
    //   7685: arraylength
    //   7686: istore #5
    //   7688: iconst_0
    //   7689: istore #6
    //   7691: iload #6
    //   7693: iload #5
    //   7695: if_icmpge -> 7833
    //   7698: aload #4
    //   7700: iload #6
    //   7702: aaload
    //   7703: astore #7
    //   7705: aload #7
    //   7707: invokevirtual getModifiers : ()I
    //   7710: invokestatic isStatic : (I)Z
    //   7713: ifne -> 7723
    //   7716: goto -> 7826
    //   7719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7722: athrow
    //   7723: aload #7
    //   7725: invokevirtual getType : ()Ljava/lang/Class;
    //   7728: astore #8
    //   7730: aload #8
    //   7732: ifnull -> 7813
    //   7735: aload #8
    //   7737: invokevirtual isPrimitive : ()Z
    //   7740: ifne -> 7813
    //   7743: goto -> 7750
    //   7746: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7749: athrow
    //   7750: aload #8
    //   7752: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7755: ifnull -> 7813
    //   7758: goto -> 7765
    //   7761: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7764: athrow
    //   7765: aload #8
    //   7767: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7770: invokevirtual getName : ()Ljava/lang/String;
    //   7773: ifnull -> 7813
    //   7776: goto -> 7783
    //   7779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7782: athrow
    //   7783: aload #8
    //   7785: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7788: invokevirtual getName : ()Ljava/lang/String;
    //   7791: sipush #-3405
    //   7794: sipush #-18868
    //   7797: invokestatic a : (II)Ljava/lang/String;
    //   7800: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7803: ifne -> 7813
    //   7806: goto -> 7813
    //   7809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7812: athrow
    //   7813: aload #7
    //   7815: iconst_1
    //   7816: invokevirtual setAccessible : (Z)V
    //   7819: aload #7
    //   7821: aconst_null
    //   7822: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7825: pop
    //   7826: iinc #6, 1
    //   7829: iload_2
    //   7830: ifne -> 7691
    //   7833: sipush #-3406
    //   7836: sipush #-20362
    //   7839: invokestatic a : (II)Ljava/lang/String;
    //   7842: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7845: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7848: astore #4
    //   7850: aload #4
    //   7852: arraylength
    //   7853: istore #5
    //   7855: iconst_0
    //   7856: istore #6
    //   7858: iload #6
    //   7860: iload #5
    //   7862: if_icmpge -> 7998
    //   7865: aload #4
    //   7867: iload #6
    //   7869: aaload
    //   7870: astore #7
    //   7872: aload #7
    //   7874: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7877: pop
    //   7878: aload #7
    //   7880: invokevirtual getModifiers : ()I
    //   7883: invokestatic isStatic : (I)Z
    //   7886: ifeq -> 7984
    //   7889: aload #7
    //   7891: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7894: arraylength
    //   7895: iconst_2
    //   7896: if_icmpne -> 7984
    //   7899: goto -> 7906
    //   7902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7905: athrow
    //   7906: aload #7
    //   7908: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7911: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7914: if_acmpne -> 7984
    //   7917: goto -> 7924
    //   7920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7923: athrow
    //   7924: aload #7
    //   7926: iconst_1
    //   7927: invokevirtual setAccessible : (Z)V
    //   7930: aload #7
    //   7932: aconst_null
    //   7933: iconst_2
    //   7934: anewarray java/lang/Object
    //   7937: dup
    //   7938: iconst_0
    //   7939: aload_0
    //   7940: aastore
    //   7941: dup
    //   7942: iconst_1
    //   7943: aload_1
    //   7944: ifnonnull -> 7962
    //   7947: goto -> 7954
    //   7950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7953: athrow
    //   7954: aload_1
    //   7955: goto -> 7969
    //   7958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7961: athrow
    //   7962: aload_1
    //   7963: checkcast [B
    //   7966: invokevirtual clone : ()Ljava/lang/Object;
    //   7969: aastore
    //   7970: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7973: checkcast java/lang/Boolean
    //   7976: invokevirtual booleanValue : ()Z
    //   7979: istore_3
    //   7980: iload_2
    //   7981: ifne -> 7998
    //   7984: iinc #6, 1
    //   7987: iload_2
    //   7988: ifne -> 7858
    //   7991: goto -> 7998
    //   7994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7997: athrow
    //   7998: iload_2
    //   7999: ifne -> 8340
    //   8002: sipush #-3401
    //   8005: sipush #-16840
    //   8008: invokestatic a : (II)Ljava/lang/String;
    //   8011: iconst_1
    //   8012: ldc burp/Zg_i
    //   8014: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8017: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   8020: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   8023: astore #4
    //   8025: aload #4
    //   8027: arraylength
    //   8028: istore #5
    //   8030: iconst_0
    //   8031: istore #6
    //   8033: iload #6
    //   8035: iload #5
    //   8037: if_icmpge -> 8175
    //   8040: aload #4
    //   8042: iload #6
    //   8044: aaload
    //   8045: astore #7
    //   8047: aload #7
    //   8049: invokevirtual getModifiers : ()I
    //   8052: invokestatic isStatic : (I)Z
    //   8055: ifne -> 8065
    //   8058: goto -> 8168
    //   8061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8064: athrow
    //   8065: aload #7
    //   8067: invokevirtual getType : ()Ljava/lang/Class;
    //   8070: astore #8
    //   8072: aload #8
    //   8074: ifnull -> 8155
    //   8077: aload #8
    //   8079: invokevirtual isPrimitive : ()Z
    //   8082: ifne -> 8155
    //   8085: goto -> 8092
    //   8088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8091: athrow
    //   8092: aload #8
    //   8094: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8097: ifnull -> 8155
    //   8100: goto -> 8107
    //   8103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8106: athrow
    //   8107: aload #8
    //   8109: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8112: invokevirtual getName : ()Ljava/lang/String;
    //   8115: ifnull -> 8155
    //   8118: goto -> 8125
    //   8121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8124: athrow
    //   8125: aload #8
    //   8127: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8130: invokevirtual getName : ()Ljava/lang/String;
    //   8133: sipush #-3405
    //   8136: sipush #-18868
    //   8139: invokestatic a : (II)Ljava/lang/String;
    //   8142: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8145: ifne -> 8155
    //   8148: goto -> 8155
    //   8151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8154: athrow
    //   8155: aload #7
    //   8157: iconst_1
    //   8158: invokevirtual setAccessible : (Z)V
    //   8161: aload #7
    //   8163: aconst_null
    //   8164: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8167: pop
    //   8168: iinc #6, 1
    //   8171: iload_2
    //   8172: ifne -> 8033
    //   8175: sipush #-3403
    //   8178: sipush #29252
    //   8181: invokestatic a : (II)Ljava/lang/String;
    //   8184: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8187: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8190: astore #4
    //   8192: aload #4
    //   8194: arraylength
    //   8195: istore #5
    //   8197: iconst_0
    //   8198: istore #6
    //   8200: iload #6
    //   8202: iload #5
    //   8204: if_icmpge -> 8340
    //   8207: aload #4
    //   8209: iload #6
    //   8211: aaload
    //   8212: astore #7
    //   8214: aload #7
    //   8216: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8219: pop
    //   8220: aload #7
    //   8222: invokevirtual getModifiers : ()I
    //   8225: invokestatic isStatic : (I)Z
    //   8228: ifeq -> 8326
    //   8231: aload #7
    //   8233: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8236: arraylength
    //   8237: iconst_2
    //   8238: if_icmpne -> 8326
    //   8241: goto -> 8248
    //   8244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8247: athrow
    //   8248: aload #7
    //   8250: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8253: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8256: if_acmpne -> 8326
    //   8259: goto -> 8266
    //   8262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8265: athrow
    //   8266: aload #7
    //   8268: iconst_1
    //   8269: invokevirtual setAccessible : (Z)V
    //   8272: aload #7
    //   8274: aconst_null
    //   8275: iconst_2
    //   8276: anewarray java/lang/Object
    //   8279: dup
    //   8280: iconst_0
    //   8281: aload_0
    //   8282: aastore
    //   8283: dup
    //   8284: iconst_1
    //   8285: aload_1
    //   8286: ifnonnull -> 8304
    //   8289: goto -> 8296
    //   8292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8295: athrow
    //   8296: aload_1
    //   8297: goto -> 8311
    //   8300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8303: athrow
    //   8304: aload_1
    //   8305: checkcast [B
    //   8308: invokevirtual clone : ()Ljava/lang/Object;
    //   8311: aastore
    //   8312: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8315: checkcast java/lang/Boolean
    //   8318: invokevirtual booleanValue : ()Z
    //   8321: istore_3
    //   8322: iload_2
    //   8323: ifne -> 8340
    //   8326: iinc #6, 1
    //   8329: iload_2
    //   8330: ifne -> 8200
    //   8333: goto -> 8340
    //   8336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8339: athrow
    //   8340: iload_3
    //   8341: ireturn
    //   8342: astore_3
    //   8343: new java/lang/Exception
    //   8346: dup
    //   8347: aload_3
    //   8348: invokevirtual getMessage : ()Ljava/lang/String;
    //   8351: invokespecial <init> : (Ljava/lang/String;)V
    //   8354: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6152	8342	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   461	475	475	java/lang/Throwable
    //   486	499	502	java/lang/Throwable
    //   491	514	517	java/lang/Throwable
    //   506	532	535	java/lang/Throwable
    //   521	562	565	java/lang/Throwable
    //   625	652	655	java/lang/Throwable
    //   642	673	676	java/lang/Throwable
    //   659	703	706	java/lang/Throwable
    //   680	714	714	java/lang/Throwable
    //   725	741	744	java/lang/Throwable
    //   818	832	832	java/lang/Throwable
    //   843	856	859	java/lang/Throwable
    //   848	871	874	java/lang/Throwable
    //   863	889	892	java/lang/Throwable
    //   878	919	922	java/lang/Throwable
    //   982	1009	1012	java/lang/Throwable
    //   999	1030	1033	java/lang/Throwable
    //   1016	1060	1063	java/lang/Throwable
    //   1037	1071	1071	java/lang/Throwable
    //   1082	1098	1101	java/lang/Throwable
    //   5513	5527	5527	java/lang/Throwable
    //   5538	5551	5554	java/lang/Throwable
    //   5543	5566	5569	java/lang/Throwable
    //   5558	5584	5587	java/lang/Throwable
    //   5573	5614	5617	java/lang/Throwable
    //   5680	5707	5710	java/lang/Throwable
    //   5697	5725	5728	java/lang/Throwable
    //   5714	5755	5758	java/lang/Throwable
    //   5732	5766	5766	java/lang/Throwable
    //   5788	5799	5802	java/lang/Throwable
    //   5854	5868	5868	java/lang/Throwable
    //   5879	5892	5895	java/lang/Throwable
    //   5884	5907	5910	java/lang/Throwable
    //   5899	5925	5928	java/lang/Throwable
    //   5914	5955	5958	java/lang/Throwable
    //   6021	6048	6051	java/lang/Throwable
    //   6038	6066	6069	java/lang/Throwable
    //   6055	6096	6099	java/lang/Throwable
    //   6073	6107	6107	java/lang/Throwable
    //   6129	6140	6143	java/lang/Throwable
    //   6153	6883	8342	java/lang/Throwable
    //   6243	6257	6257	java/lang/Throwable
    //   6268	6281	6284	java/lang/Throwable
    //   6273	6296	6299	java/lang/Throwable
    //   6288	6314	6317	java/lang/Throwable
    //   6303	6344	6347	java/lang/Throwable
    //   6410	6437	6440	java/lang/Throwable
    //   6427	6455	6458	java/lang/Throwable
    //   6444	6485	6488	java/lang/Throwable
    //   6462	6496	6496	java/lang/Throwable
    //   6518	6529	6532	java/lang/Throwable
    //   6585	6599	6599	java/lang/Throwable
    //   6610	6623	6626	java/lang/Throwable
    //   6615	6638	6641	java/lang/Throwable
    //   6630	6656	6659	java/lang/Throwable
    //   6645	6686	6689	java/lang/Throwable
    //   6752	6779	6782	java/lang/Throwable
    //   6769	6797	6800	java/lang/Throwable
    //   6786	6827	6830	java/lang/Throwable
    //   6804	6838	6838	java/lang/Throwable
    //   6860	6871	6874	java/lang/Throwable
    //   6884	7614	8342	java/lang/Throwable
    //   6974	6988	6988	java/lang/Throwable
    //   6999	7012	7015	java/lang/Throwable
    //   7004	7027	7030	java/lang/Throwable
    //   7019	7045	7048	java/lang/Throwable
    //   7034	7075	7078	java/lang/Throwable
    //   7141	7168	7171	java/lang/Throwable
    //   7158	7186	7189	java/lang/Throwable
    //   7175	7216	7219	java/lang/Throwable
    //   7193	7227	7227	java/lang/Throwable
    //   7249	7260	7263	java/lang/Throwable
    //   7316	7330	7330	java/lang/Throwable
    //   7341	7354	7357	java/lang/Throwable
    //   7346	7369	7372	java/lang/Throwable
    //   7361	7387	7390	java/lang/Throwable
    //   7376	7417	7420	java/lang/Throwable
    //   7483	7510	7513	java/lang/Throwable
    //   7500	7528	7531	java/lang/Throwable
    //   7517	7558	7561	java/lang/Throwable
    //   7535	7569	7569	java/lang/Throwable
    //   7591	7602	7605	java/lang/Throwable
    //   7615	8341	8342	java/lang/Throwable
    //   7705	7719	7719	java/lang/Throwable
    //   7730	7743	7746	java/lang/Throwable
    //   7735	7758	7761	java/lang/Throwable
    //   7750	7776	7779	java/lang/Throwable
    //   7765	7806	7809	java/lang/Throwable
    //   7872	7899	7902	java/lang/Throwable
    //   7889	7917	7920	java/lang/Throwable
    //   7906	7947	7950	java/lang/Throwable
    //   7924	7958	7958	java/lang/Throwable
    //   7980	7991	7994	java/lang/Throwable
    //   8047	8061	8061	java/lang/Throwable
    //   8072	8085	8088	java/lang/Throwable
    //   8077	8100	8103	java/lang/Throwable
    //   8092	8118	8121	java/lang/Throwable
    //   8107	8148	8151	java/lang/Throwable
    //   8214	8241	8244	java/lang/Throwable
    //   8231	8259	8262	java/lang/Throwable
    //   8248	8289	8292	java/lang/Throwable
    //   8266	8300	8300	java/lang/Throwable
    //   8322	8333	8336	java/lang/Throwable
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZH(Object paramObject) {
    Ztvg.ZZ = a(-3413, 14857);
    Ztvg.ZO = new BigInteger(a(-3409, 27014));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ze1k.ZI.charAt(Math.abs(((BigInteger)Zlg2.ZO).intValue() % 32)) <= Zsvd.ZB.charAt(Math.abs(((BigInteger)Ze4g.Zz).intValue() % 32))) {
          try {
            Ztvp.Zc(Class.forName(a(-3411, -23599)));
            if (!bool)
              Zxy6.ZO(Class.forName(a(-3407, 6768))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxy6.ZO(Class.forName(a(-3407, 6768)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '>éôÃ1ýìï\\tM`W£®èè\\tÌª-\ì\\nÉ\\th>=ÎîØAÜ\\t¤è§ãý5»|M\\t%kû;q \\tùÙ\\fÅñä\\tâo¼äÞ'\\t}ª«<DO\\tÉ\\n-HìÎ\\te²¨ú\FäC¯U\\tÑâÄUÑ½ýð\\t|â¼¢Õ4Â\\tÆAëÖt§0\\t¾Øäåõ«&¯\\t 7,ïÌó \\b\\t.ö×úíñ iíH_·XvØú<o-KÂ%Â²+ ÁJª~\\t,ª¶«ß<õ\\tÍ²¨X\K Öé)[ýeòº|éÆ%æ)gÉj%ÏéðMÀ<ÖZ÷áÅ5ÛªQ¹%¼é\\bª7Î*¿ yÏWí`5[z.-IµÊð×}\\t{b³YC{­IBÏ/±ý¼té|û\\t\\tÈ¨*ëL4'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #46
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
    //   68: ldc '®¯ôx¤Óò\\tDµ©Z.ÙÐ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #62
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
    //   129: putstatic burp/Zgrz.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgrz.b : [Ljava/lang/String;
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
    //   212: bipush #92
    //   214: goto -> 244
    //   217: bipush #70
    //   219: goto -> 244
    //   222: bipush #15
    //   224: goto -> 244
    //   227: bipush #118
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #72
    //   239: goto -> 244
    //   242: bipush #65
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #115
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-75
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-87
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #32
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-14
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #30
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-54
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #103
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-122
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: iconst_4
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #82
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #31
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-96
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #-30
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-126
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #127
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #66
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-43
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-7
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-78
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-62
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #74
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-84
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #28
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #35
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-6
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #30
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-25
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #12
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-76
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-17
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-37
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   499: sipush #-3410
    //   502: sipush #-21217
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zgrz.Zu : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF2B8) & 0xFFFF;
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
      char c = '¥';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgrz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */