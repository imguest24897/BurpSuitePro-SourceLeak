package burp;

import java.math.BigInteger;

class Zgtd extends ClassLoader {
  static String Zj;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object paramObject) {
    Zreu.ZI = a(23902, 25936);
    Zreu.Zi = new BigInteger(a(23889, 295));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlo0.ZD.charAt(Math.abs(((BigInteger)Zgk9.ZD).intValue() % 32)) <= Zr_x.ZF.charAt(Math.abs(((BigInteger)Zv8d.ZN).intValue() % 32))) {
          try {
            Zql.Zt(Class.forName(a(23895, 21569)));
            if (bool)
              Zk8i.Zc(Class.forName(a(23894, -15682))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zk8i.Zc(Class.forName(a(23894, -15682)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm7v.ZP : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   22: sipush #23900
    //   25: sipush #28625
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zrcu
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #23903
    //   153: sipush #-4864
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifne -> 51
    //   192: sipush #23891
    //   195: sipush #-10561
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: new java/io/ByteArrayOutputStream
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: astore_3
    //   359: getstatic burp/Zxln.Zz : Ljava/lang/String;
    //   362: astore #4
    //   364: iconst_0
    //   365: istore #5
    //   367: iload #5
    //   369: aload #4
    //   371: invokevirtual length : ()I
    //   374: if_icmpge -> 404
    //   377: aload_3
    //   378: aload #4
    //   380: iload #5
    //   382: iload #5
    //   384: iconst_2
    //   385: iadd
    //   386: invokevirtual substring : (II)Ljava/lang/String;
    //   389: bipush #16
    //   391: invokestatic parseInt : (Ljava/lang/String;I)I
    //   394: invokevirtual write : (I)V
    //   397: iinc #5, 2
    //   400: iload_2
    //   401: ifne -> 367
    //   404: aload_3
    //   405: invokevirtual toByteArray : ()[B
    //   408: astore #5
    //   410: getstatic burp/Zbw5.ZR : Ljava/lang/Object;
    //   413: checkcast java/math/BigInteger
    //   416: invokevirtual toByteArray : ()[B
    //   419: astore #6
    //   421: sipush #256
    //   424: newarray byte
    //   426: astore #8
    //   428: sipush #256
    //   431: newarray int
    //   433: astore #9
    //   435: sipush #256
    //   438: newarray int
    //   440: astore #10
    //   442: sipush #256
    //   445: newarray int
    //   447: astore #11
    //   449: sipush #256
    //   452: newarray int
    //   454: astore #12
    //   456: bipush #10
    //   458: newarray int
    //   460: astore #13
    //   462: sipush #283
    //   465: istore #14
    //   467: iconst_0
    //   468: istore #16
    //   470: iload #16
    //   472: sipush #256
    //   475: if_icmpge -> 709
    //   478: sipush #23890
    //   481: sipush #-13193
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: iload #16
    //   489: iconst_1
    //   490: iushr
    //   491: invokevirtual charAt : (I)C
    //   494: istore #25
    //   496: iload #16
    //   498: iconst_1
    //   499: iand
    //   500: ifne -> 515
    //   503: iload #25
    //   505: bipush #8
    //   507: iushr
    //   508: goto -> 517
    //   511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   514: athrow
    //   515: iload #25
    //   517: i2b
    //   518: sipush #255
    //   521: iand
    //   522: istore #15
    //   524: iload #16
    //   526: iconst_1
    //   527: ishl
    //   528: istore #17
    //   530: iload #17
    //   532: sipush #256
    //   535: if_icmplt -> 545
    //   538: iload #17
    //   540: iload #14
    //   542: ixor
    //   543: istore #17
    //   545: iload #17
    //   547: iconst_1
    //   548: ishl
    //   549: istore #18
    //   551: iload #18
    //   553: sipush #256
    //   556: if_icmplt -> 566
    //   559: iload #18
    //   561: iload #14
    //   563: ixor
    //   564: istore #18
    //   566: iload #18
    //   568: iconst_1
    //   569: ishl
    //   570: istore #19
    //   572: iload #19
    //   574: sipush #256
    //   577: if_icmplt -> 587
    //   580: iload #19
    //   582: iload #14
    //   584: ixor
    //   585: istore #19
    //   587: iload #19
    //   589: iload #16
    //   591: ixor
    //   592: istore #20
    //   594: iload #20
    //   596: iload #17
    //   598: ixor
    //   599: istore #21
    //   601: iload #20
    //   603: iload #18
    //   605: ixor
    //   606: istore #22
    //   608: iload #19
    //   610: iload #18
    //   612: ixor
    //   613: iload #17
    //   615: ixor
    //   616: istore #23
    //   618: aload #8
    //   620: iload #16
    //   622: iload #15
    //   624: i2b
    //   625: bastore
    //   626: aload #9
    //   628: iload #15
    //   630: iload #23
    //   632: bipush #24
    //   634: ishl
    //   635: iload #20
    //   637: bipush #16
    //   639: ishl
    //   640: ior
    //   641: iload #22
    //   643: bipush #8
    //   645: ishl
    //   646: ior
    //   647: iload #21
    //   649: ior
    //   650: dup
    //   651: istore #24
    //   653: iastore
    //   654: aload #10
    //   656: iload #15
    //   658: iload #24
    //   660: bipush #8
    //   662: iushr
    //   663: iload #24
    //   665: bipush #24
    //   667: ishl
    //   668: ior
    //   669: iastore
    //   670: aload #11
    //   672: iload #15
    //   674: iload #24
    //   676: bipush #16
    //   678: iushr
    //   679: iload #24
    //   681: bipush #16
    //   683: ishl
    //   684: ior
    //   685: iastore
    //   686: aload #12
    //   688: iload #15
    //   690: iload #24
    //   692: bipush #24
    //   694: iushr
    //   695: iload #24
    //   697: bipush #8
    //   699: ishl
    //   700: ior
    //   701: iastore
    //   702: iinc #16, 1
    //   705: iload_2
    //   706: ifne -> 470
    //   709: iconst_1
    //   710: istore #25
    //   712: aload #13
    //   714: iconst_0
    //   715: iload #25
    //   717: bipush #24
    //   719: ishl
    //   720: iastore
    //   721: iconst_1
    //   722: istore #26
    //   724: iload #26
    //   726: bipush #10
    //   728: if_icmpge -> 769
    //   731: iload #25
    //   733: iconst_1
    //   734: ishl
    //   735: istore #25
    //   737: iload #25
    //   739: sipush #256
    //   742: if_icmplt -> 752
    //   745: iload #25
    //   747: iload #14
    //   749: ixor
    //   750: istore #25
    //   752: aload #13
    //   754: iload #26
    //   756: iload #25
    //   758: bipush #24
    //   760: ishl
    //   761: iastore
    //   762: iinc #26, 1
    //   765: iload_2
    //   766: ifne -> 724
    //   769: iconst_4
    //   770: istore #26
    //   772: iload #26
    //   774: bipush #6
    //   776: iadd
    //   777: istore #27
    //   779: iconst_4
    //   780: iload #27
    //   782: iconst_1
    //   783: iadd
    //   784: imul
    //   785: istore #28
    //   787: iload #28
    //   789: newarray int
    //   791: astore #29
    //   793: iload #28
    //   795: newarray int
    //   797: astore #30
    //   799: iconst_0
    //   800: istore #25
    //   802: iconst_0
    //   803: istore #32
    //   805: iconst_0
    //   806: istore #33
    //   808: iload #32
    //   810: iload #26
    //   812: if_icmpge -> 880
    //   815: aload #29
    //   817: iload #32
    //   819: aload #5
    //   821: iload #33
    //   823: baload
    //   824: bipush #24
    //   826: ishl
    //   827: aload #5
    //   829: iload #33
    //   831: iconst_1
    //   832: iadd
    //   833: baload
    //   834: sipush #255
    //   837: iand
    //   838: bipush #16
    //   840: ishl
    //   841: ior
    //   842: aload #5
    //   844: iload #33
    //   846: iconst_2
    //   847: iadd
    //   848: baload
    //   849: sipush #255
    //   852: iand
    //   853: bipush #8
    //   855: ishl
    //   856: ior
    //   857: aload #5
    //   859: iload #33
    //   861: iconst_3
    //   862: iadd
    //   863: baload
    //   864: sipush #255
    //   867: iand
    //   868: ior
    //   869: iastore
    //   870: iinc #32, 1
    //   873: iinc #33, 4
    //   876: iload_2
    //   877: ifne -> 808
    //   880: iload #26
    //   882: istore #32
    //   884: iconst_0
    //   885: istore #33
    //   887: iload #32
    //   889: iload #28
    //   891: if_icmpge -> 1018
    //   894: aload #29
    //   896: iload #32
    //   898: iconst_1
    //   899: isub
    //   900: iaload
    //   901: istore #31
    //   903: iload #33
    //   905: ifne -> 992
    //   908: iload #26
    //   910: istore #33
    //   912: aload #8
    //   914: iload #31
    //   916: bipush #16
    //   918: iushr
    //   919: sipush #255
    //   922: iand
    //   923: baload
    //   924: bipush #24
    //   926: ishl
    //   927: aload #8
    //   929: iload #31
    //   931: bipush #8
    //   933: iushr
    //   934: sipush #255
    //   937: iand
    //   938: baload
    //   939: sipush #255
    //   942: iand
    //   943: bipush #16
    //   945: ishl
    //   946: ior
    //   947: aload #8
    //   949: iload #31
    //   951: sipush #255
    //   954: iand
    //   955: baload
    //   956: sipush #255
    //   959: iand
    //   960: bipush #8
    //   962: ishl
    //   963: ior
    //   964: aload #8
    //   966: iload #31
    //   968: bipush #24
    //   970: iushr
    //   971: baload
    //   972: sipush #255
    //   975: iand
    //   976: ior
    //   977: istore #31
    //   979: iload #31
    //   981: aload #13
    //   983: iload #25
    //   985: iinc #25, 1
    //   988: iaload
    //   989: ixor
    //   990: istore #31
    //   992: aload #29
    //   994: iload #32
    //   996: aload #29
    //   998: iload #32
    //   1000: iload #26
    //   1002: isub
    //   1003: iaload
    //   1004: iload #31
    //   1006: ixor
    //   1007: iastore
    //   1008: iinc #32, 1
    //   1011: iinc #33, -1
    //   1014: iload_2
    //   1015: ifne -> 887
    //   1018: iconst_0
    //   1019: istore #32
    //   1021: iconst_4
    //   1022: iload #27
    //   1024: imul
    //   1025: istore #33
    //   1027: aload #30
    //   1029: iload #32
    //   1031: aload #29
    //   1033: iload #33
    //   1035: iaload
    //   1036: iastore
    //   1037: aload #30
    //   1039: iload #32
    //   1041: iconst_1
    //   1042: iadd
    //   1043: aload #29
    //   1045: iload #33
    //   1047: iconst_1
    //   1048: iadd
    //   1049: iaload
    //   1050: iastore
    //   1051: aload #30
    //   1053: iload #32
    //   1055: iconst_2
    //   1056: iadd
    //   1057: aload #29
    //   1059: iload #33
    //   1061: iconst_2
    //   1062: iadd
    //   1063: iaload
    //   1064: iastore
    //   1065: aload #30
    //   1067: iload #32
    //   1069: iconst_3
    //   1070: iadd
    //   1071: aload #29
    //   1073: iload #33
    //   1075: iconst_3
    //   1076: iadd
    //   1077: iaload
    //   1078: iastore
    //   1079: iinc #32, 4
    //   1082: iinc #33, -4
    //   1085: iconst_1
    //   1086: istore #35
    //   1088: iload #35
    //   1090: iload #27
    //   1092: if_icmpge -> 1456
    //   1095: aload #29
    //   1097: iload #33
    //   1099: iaload
    //   1100: istore #34
    //   1102: aload #30
    //   1104: iload #32
    //   1106: aload #9
    //   1108: aload #8
    //   1110: iload #34
    //   1112: bipush #24
    //   1114: iushr
    //   1115: baload
    //   1116: sipush #255
    //   1119: iand
    //   1120: iaload
    //   1121: aload #10
    //   1123: aload #8
    //   1125: iload #34
    //   1127: bipush #16
    //   1129: iushr
    //   1130: sipush #255
    //   1133: iand
    //   1134: baload
    //   1135: sipush #255
    //   1138: iand
    //   1139: iaload
    //   1140: ixor
    //   1141: aload #11
    //   1143: aload #8
    //   1145: iload #34
    //   1147: bipush #8
    //   1149: iushr
    //   1150: sipush #255
    //   1153: iand
    //   1154: baload
    //   1155: sipush #255
    //   1158: iand
    //   1159: iaload
    //   1160: ixor
    //   1161: aload #12
    //   1163: aload #8
    //   1165: iload #34
    //   1167: sipush #255
    //   1170: iand
    //   1171: baload
    //   1172: sipush #255
    //   1175: iand
    //   1176: iaload
    //   1177: ixor
    //   1178: iastore
    //   1179: aload #29
    //   1181: iload #33
    //   1183: iconst_1
    //   1184: iadd
    //   1185: iaload
    //   1186: istore #34
    //   1188: aload #30
    //   1190: iload #32
    //   1192: iconst_1
    //   1193: iadd
    //   1194: aload #9
    //   1196: aload #8
    //   1198: iload #34
    //   1200: bipush #24
    //   1202: iushr
    //   1203: baload
    //   1204: sipush #255
    //   1207: iand
    //   1208: iaload
    //   1209: aload #10
    //   1211: aload #8
    //   1213: iload #34
    //   1215: bipush #16
    //   1217: iushr
    //   1218: sipush #255
    //   1221: iand
    //   1222: baload
    //   1223: sipush #255
    //   1226: iand
    //   1227: iaload
    //   1228: ixor
    //   1229: aload #11
    //   1231: aload #8
    //   1233: iload #34
    //   1235: bipush #8
    //   1237: iushr
    //   1238: sipush #255
    //   1241: iand
    //   1242: baload
    //   1243: sipush #255
    //   1246: iand
    //   1247: iaload
    //   1248: ixor
    //   1249: aload #12
    //   1251: aload #8
    //   1253: iload #34
    //   1255: sipush #255
    //   1258: iand
    //   1259: baload
    //   1260: sipush #255
    //   1263: iand
    //   1264: iaload
    //   1265: ixor
    //   1266: iastore
    //   1267: aload #29
    //   1269: iload #33
    //   1271: iconst_2
    //   1272: iadd
    //   1273: iaload
    //   1274: istore #34
    //   1276: aload #30
    //   1278: iload #32
    //   1280: iconst_2
    //   1281: iadd
    //   1282: aload #9
    //   1284: aload #8
    //   1286: iload #34
    //   1288: bipush #24
    //   1290: iushr
    //   1291: baload
    //   1292: sipush #255
    //   1295: iand
    //   1296: iaload
    //   1297: aload #10
    //   1299: aload #8
    //   1301: iload #34
    //   1303: bipush #16
    //   1305: iushr
    //   1306: sipush #255
    //   1309: iand
    //   1310: baload
    //   1311: sipush #255
    //   1314: iand
    //   1315: iaload
    //   1316: ixor
    //   1317: aload #11
    //   1319: aload #8
    //   1321: iload #34
    //   1323: bipush #8
    //   1325: iushr
    //   1326: sipush #255
    //   1329: iand
    //   1330: baload
    //   1331: sipush #255
    //   1334: iand
    //   1335: iaload
    //   1336: ixor
    //   1337: aload #12
    //   1339: aload #8
    //   1341: iload #34
    //   1343: sipush #255
    //   1346: iand
    //   1347: baload
    //   1348: sipush #255
    //   1351: iand
    //   1352: iaload
    //   1353: ixor
    //   1354: iastore
    //   1355: aload #29
    //   1357: iload #33
    //   1359: iconst_3
    //   1360: iadd
    //   1361: iaload
    //   1362: istore #34
    //   1364: aload #30
    //   1366: iload #32
    //   1368: iconst_3
    //   1369: iadd
    //   1370: aload #9
    //   1372: aload #8
    //   1374: iload #34
    //   1376: bipush #24
    //   1378: iushr
    //   1379: baload
    //   1380: sipush #255
    //   1383: iand
    //   1384: iaload
    //   1385: aload #10
    //   1387: aload #8
    //   1389: iload #34
    //   1391: bipush #16
    //   1393: iushr
    //   1394: sipush #255
    //   1397: iand
    //   1398: baload
    //   1399: sipush #255
    //   1402: iand
    //   1403: iaload
    //   1404: ixor
    //   1405: aload #11
    //   1407: aload #8
    //   1409: iload #34
    //   1411: bipush #8
    //   1413: iushr
    //   1414: sipush #255
    //   1417: iand
    //   1418: baload
    //   1419: sipush #255
    //   1422: iand
    //   1423: iaload
    //   1424: ixor
    //   1425: aload #12
    //   1427: aload #8
    //   1429: iload #34
    //   1431: sipush #255
    //   1434: iand
    //   1435: baload
    //   1436: sipush #255
    //   1439: iand
    //   1440: iaload
    //   1441: ixor
    //   1442: iastore
    //   1443: iinc #32, 4
    //   1446: iinc #33, -4
    //   1449: iinc #35, 1
    //   1452: iload_2
    //   1453: ifne -> 1088
    //   1456: aload #30
    //   1458: iload #32
    //   1460: aload #29
    //   1462: iload #33
    //   1464: iaload
    //   1465: iastore
    //   1466: aload #30
    //   1468: iload #32
    //   1470: iconst_1
    //   1471: iadd
    //   1472: aload #29
    //   1474: iload #33
    //   1476: iconst_1
    //   1477: iadd
    //   1478: iaload
    //   1479: iastore
    //   1480: aload #30
    //   1482: iload #32
    //   1484: iconst_2
    //   1485: iadd
    //   1486: aload #29
    //   1488: iload #33
    //   1490: iconst_2
    //   1491: iadd
    //   1492: iaload
    //   1493: iastore
    //   1494: aload #30
    //   1496: iload #32
    //   1498: iconst_3
    //   1499: iadd
    //   1500: aload #29
    //   1502: iload #33
    //   1504: iconst_3
    //   1505: iadd
    //   1506: iaload
    //   1507: iastore
    //   1508: iconst_0
    //   1509: newarray byte
    //   1511: astore #35
    //   1513: aload #6
    //   1515: arraylength
    //   1516: bipush #16
    //   1518: irem
    //   1519: ifeq -> 1543
    //   1522: new java/lang/Exception
    //   1525: dup
    //   1526: sipush #23893
    //   1529: sipush #-5430
    //   1532: invokestatic a : (II)Ljava/lang/String;
    //   1535: invokespecial <init> : (Ljava/lang/String;)V
    //   1538: athrow
    //   1539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1542: athrow
    //   1543: bipush #10
    //   1545: istore #36
    //   1547: sipush #23888
    //   1550: sipush #256
    //   1553: newarray byte
    //   1555: astore #37
    //   1557: sipush #-26171
    //   1560: sipush #256
    //   1563: newarray int
    //   1565: astore #38
    //   1567: sipush #256
    //   1570: newarray int
    //   1572: astore #39
    //   1574: sipush #256
    //   1577: newarray int
    //   1579: astore #40
    //   1581: sipush #256
    //   1584: newarray int
    //   1586: astore #41
    //   1588: sipush #283
    //   1591: istore #14
    //   1593: invokestatic a : (II)Ljava/lang/String;
    //   1596: astore #42
    //   1598: iconst_0
    //   1599: istore #16
    //   1601: iload #16
    //   1603: sipush #256
    //   1606: if_icmpge -> 1833
    //   1609: aload #42
    //   1611: iload #16
    //   1613: iconst_1
    //   1614: iushr
    //   1615: invokevirtual charAt : (I)C
    //   1618: istore #43
    //   1620: iload #16
    //   1622: iconst_1
    //   1623: iand
    //   1624: ifne -> 1639
    //   1627: iload #43
    //   1629: bipush #8
    //   1631: iushr
    //   1632: goto -> 1641
    //   1635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1638: athrow
    //   1639: iload #43
    //   1641: i2b
    //   1642: sipush #255
    //   1645: iand
    //   1646: istore #15
    //   1648: iload #16
    //   1650: iconst_1
    //   1651: ishl
    //   1652: istore #17
    //   1654: iload #17
    //   1656: sipush #256
    //   1659: if_icmplt -> 1669
    //   1662: iload #17
    //   1664: iload #14
    //   1666: ixor
    //   1667: istore #17
    //   1669: iload #17
    //   1671: iconst_1
    //   1672: ishl
    //   1673: istore #18
    //   1675: iload #18
    //   1677: sipush #256
    //   1680: if_icmplt -> 1690
    //   1683: iload #18
    //   1685: iload #14
    //   1687: ixor
    //   1688: istore #18
    //   1690: iload #18
    //   1692: iconst_1
    //   1693: ishl
    //   1694: istore #19
    //   1696: iload #19
    //   1698: sipush #256
    //   1701: if_icmplt -> 1711
    //   1704: iload #19
    //   1706: iload #14
    //   1708: ixor
    //   1709: istore #19
    //   1711: iload #19
    //   1713: iload #16
    //   1715: ixor
    //   1716: istore #20
    //   1718: iload #20
    //   1720: iload #17
    //   1722: ixor
    //   1723: istore #21
    //   1725: iload #20
    //   1727: iload #18
    //   1729: ixor
    //   1730: istore #22
    //   1732: iload #19
    //   1734: iload #18
    //   1736: ixor
    //   1737: iload #17
    //   1739: ixor
    //   1740: istore #23
    //   1742: aload #37
    //   1744: iload #15
    //   1746: iload #16
    //   1748: i2b
    //   1749: bastore
    //   1750: aload #38
    //   1752: iload #15
    //   1754: iload #23
    //   1756: bipush #24
    //   1758: ishl
    //   1759: iload #20
    //   1761: bipush #16
    //   1763: ishl
    //   1764: ior
    //   1765: iload #22
    //   1767: bipush #8
    //   1769: ishl
    //   1770: ior
    //   1771: iload #21
    //   1773: ior
    //   1774: dup
    //   1775: istore #24
    //   1777: iastore
    //   1778: aload #39
    //   1780: iload #15
    //   1782: iload #24
    //   1784: bipush #8
    //   1786: iushr
    //   1787: iload #24
    //   1789: bipush #24
    //   1791: ishl
    //   1792: ior
    //   1793: iastore
    //   1794: aload #40
    //   1796: iload #15
    //   1798: iload #24
    //   1800: bipush #16
    //   1802: iushr
    //   1803: iload #24
    //   1805: bipush #16
    //   1807: ishl
    //   1808: ior
    //   1809: iastore
    //   1810: aload #41
    //   1812: iload #15
    //   1814: iload #24
    //   1816: bipush #24
    //   1818: iushr
    //   1819: iload #24
    //   1821: bipush #8
    //   1823: ishl
    //   1824: ior
    //   1825: iastore
    //   1826: iinc #16, 1
    //   1829: iload_2
    //   1830: ifne -> 1601
    //   1833: aload #6
    //   1835: arraylength
    //   1836: newarray byte
    //   1838: astore #43
    //   1840: iconst_0
    //   1841: istore #44
    //   1843: iload #44
    //   1845: aload #6
    //   1847: arraylength
    //   1848: bipush #16
    //   1850: idiv
    //   1851: if_icmpge -> 2765
    //   1854: bipush #16
    //   1856: newarray byte
    //   1858: astore #45
    //   1860: bipush #16
    //   1862: newarray byte
    //   1864: astore #46
    //   1866: iconst_0
    //   1867: istore #47
    //   1869: iload #47
    //   1871: bipush #16
    //   1873: if_icmpge -> 1899
    //   1876: aload #45
    //   1878: iload #47
    //   1880: aload #6
    //   1882: iload #47
    //   1884: iload #44
    //   1886: bipush #16
    //   1888: imul
    //   1889: iadd
    //   1890: baload
    //   1891: bastore
    //   1892: iinc #47, 1
    //   1895: iload_2
    //   1896: ifne -> 1869
    //   1899: iconst_0
    //   1900: istore #47
    //   1902: aload #45
    //   1904: iconst_0
    //   1905: baload
    //   1906: bipush #24
    //   1908: ishl
    //   1909: aload #45
    //   1911: iconst_1
    //   1912: baload
    //   1913: sipush #255
    //   1916: iand
    //   1917: bipush #16
    //   1919: ishl
    //   1920: ior
    //   1921: aload #45
    //   1923: iconst_2
    //   1924: baload
    //   1925: sipush #255
    //   1928: iand
    //   1929: bipush #8
    //   1931: ishl
    //   1932: ior
    //   1933: aload #45
    //   1935: iconst_3
    //   1936: baload
    //   1937: sipush #255
    //   1940: iand
    //   1941: ior
    //   1942: aload #30
    //   1944: iconst_0
    //   1945: iaload
    //   1946: ixor
    //   1947: istore #49
    //   1949: aload #45
    //   1951: iconst_4
    //   1952: baload
    //   1953: bipush #24
    //   1955: ishl
    //   1956: aload #45
    //   1958: iconst_5
    //   1959: baload
    //   1960: sipush #255
    //   1963: iand
    //   1964: bipush #16
    //   1966: ishl
    //   1967: ior
    //   1968: aload #45
    //   1970: bipush #6
    //   1972: baload
    //   1973: sipush #255
    //   1976: iand
    //   1977: bipush #8
    //   1979: ishl
    //   1980: ior
    //   1981: aload #45
    //   1983: bipush #7
    //   1985: baload
    //   1986: sipush #255
    //   1989: iand
    //   1990: ior
    //   1991: aload #30
    //   1993: iconst_1
    //   1994: iaload
    //   1995: ixor
    //   1996: istore #50
    //   1998: aload #45
    //   2000: bipush #8
    //   2002: baload
    //   2003: bipush #24
    //   2005: ishl
    //   2006: aload #45
    //   2008: bipush #9
    //   2010: baload
    //   2011: sipush #255
    //   2014: iand
    //   2015: bipush #16
    //   2017: ishl
    //   2018: ior
    //   2019: aload #45
    //   2021: bipush #10
    //   2023: baload
    //   2024: sipush #255
    //   2027: iand
    //   2028: bipush #8
    //   2030: ishl
    //   2031: ior
    //   2032: aload #45
    //   2034: bipush #11
    //   2036: baload
    //   2037: sipush #255
    //   2040: iand
    //   2041: ior
    //   2042: aload #30
    //   2044: iconst_2
    //   2045: iaload
    //   2046: ixor
    //   2047: istore #51
    //   2049: aload #45
    //   2051: bipush #12
    //   2053: baload
    //   2054: bipush #24
    //   2056: ishl
    //   2057: aload #45
    //   2059: bipush #13
    //   2061: baload
    //   2062: sipush #255
    //   2065: iand
    //   2066: bipush #16
    //   2068: ishl
    //   2069: ior
    //   2070: aload #45
    //   2072: bipush #14
    //   2074: baload
    //   2075: sipush #255
    //   2078: iand
    //   2079: bipush #8
    //   2081: ishl
    //   2082: ior
    //   2083: aload #45
    //   2085: bipush #15
    //   2087: baload
    //   2088: sipush #255
    //   2091: iand
    //   2092: ior
    //   2093: aload #30
    //   2095: iconst_3
    //   2096: iaload
    //   2097: ixor
    //   2098: istore #52
    //   2100: iconst_1
    //   2101: istore #53
    //   2103: iload #53
    //   2105: iload #36
    //   2107: if_icmpge -> 2350
    //   2110: iinc #47, 4
    //   2113: aload #38
    //   2115: iload #49
    //   2117: bipush #24
    //   2119: iushr
    //   2120: iaload
    //   2121: aload #39
    //   2123: iload #52
    //   2125: bipush #16
    //   2127: iushr
    //   2128: sipush #255
    //   2131: iand
    //   2132: iaload
    //   2133: ixor
    //   2134: aload #40
    //   2136: iload #51
    //   2138: bipush #8
    //   2140: iushr
    //   2141: sipush #255
    //   2144: iand
    //   2145: iaload
    //   2146: ixor
    //   2147: aload #41
    //   2149: iload #50
    //   2151: sipush #255
    //   2154: iand
    //   2155: iaload
    //   2156: ixor
    //   2157: aload #30
    //   2159: iload #47
    //   2161: iaload
    //   2162: ixor
    //   2163: istore #54
    //   2165: aload #38
    //   2167: iload #50
    //   2169: bipush #24
    //   2171: iushr
    //   2172: iaload
    //   2173: aload #39
    //   2175: iload #49
    //   2177: bipush #16
    //   2179: iushr
    //   2180: sipush #255
    //   2183: iand
    //   2184: iaload
    //   2185: ixor
    //   2186: aload #40
    //   2188: iload #52
    //   2190: bipush #8
    //   2192: iushr
    //   2193: sipush #255
    //   2196: iand
    //   2197: iaload
    //   2198: ixor
    //   2199: aload #41
    //   2201: iload #51
    //   2203: sipush #255
    //   2206: iand
    //   2207: iaload
    //   2208: ixor
    //   2209: aload #30
    //   2211: iload #47
    //   2213: iconst_1
    //   2214: iadd
    //   2215: iaload
    //   2216: ixor
    //   2217: istore #55
    //   2219: aload #38
    //   2221: iload #51
    //   2223: bipush #24
    //   2225: iushr
    //   2226: iaload
    //   2227: aload #39
    //   2229: iload #50
    //   2231: bipush #16
    //   2233: iushr
    //   2234: sipush #255
    //   2237: iand
    //   2238: iaload
    //   2239: ixor
    //   2240: aload #40
    //   2242: iload #49
    //   2244: bipush #8
    //   2246: iushr
    //   2247: sipush #255
    //   2250: iand
    //   2251: iaload
    //   2252: ixor
    //   2253: aload #41
    //   2255: iload #52
    //   2257: sipush #255
    //   2260: iand
    //   2261: iaload
    //   2262: ixor
    //   2263: aload #30
    //   2265: iload #47
    //   2267: iconst_2
    //   2268: iadd
    //   2269: iaload
    //   2270: ixor
    //   2271: istore #56
    //   2273: aload #38
    //   2275: iload #52
    //   2277: bipush #24
    //   2279: iushr
    //   2280: iaload
    //   2281: aload #39
    //   2283: iload #51
    //   2285: bipush #16
    //   2287: iushr
    //   2288: sipush #255
    //   2291: iand
    //   2292: iaload
    //   2293: ixor
    //   2294: aload #40
    //   2296: iload #50
    //   2298: bipush #8
    //   2300: iushr
    //   2301: sipush #255
    //   2304: iand
    //   2305: iaload
    //   2306: ixor
    //   2307: aload #41
    //   2309: iload #49
    //   2311: sipush #255
    //   2314: iand
    //   2315: iaload
    //   2316: ixor
    //   2317: aload #30
    //   2319: iload #47
    //   2321: iconst_3
    //   2322: iadd
    //   2323: iaload
    //   2324: ixor
    //   2325: istore #57
    //   2327: iload #54
    //   2329: istore #49
    //   2331: iload #55
    //   2333: istore #50
    //   2335: iload #56
    //   2337: istore #51
    //   2339: iload #57
    //   2341: istore #52
    //   2343: iinc #53, 1
    //   2346: iload_2
    //   2347: ifne -> 2103
    //   2350: iinc #47, 4
    //   2353: aload #30
    //   2355: iload #47
    //   2357: iaload
    //   2358: istore #48
    //   2360: aload #46
    //   2362: iconst_0
    //   2363: aload #37
    //   2365: iload #49
    //   2367: bipush #24
    //   2369: iushr
    //   2370: baload
    //   2371: iload #48
    //   2373: bipush #24
    //   2375: iushr
    //   2376: ixor
    //   2377: i2b
    //   2378: bastore
    //   2379: aload #46
    //   2381: iconst_1
    //   2382: aload #37
    //   2384: iload #52
    //   2386: bipush #16
    //   2388: iushr
    //   2389: sipush #255
    //   2392: iand
    //   2393: baload
    //   2394: iload #48
    //   2396: bipush #16
    //   2398: iushr
    //   2399: ixor
    //   2400: i2b
    //   2401: bastore
    //   2402: aload #46
    //   2404: iconst_2
    //   2405: aload #37
    //   2407: iload #51
    //   2409: bipush #8
    //   2411: iushr
    //   2412: sipush #255
    //   2415: iand
    //   2416: baload
    //   2417: iload #48
    //   2419: bipush #8
    //   2421: iushr
    //   2422: ixor
    //   2423: i2b
    //   2424: bastore
    //   2425: aload #46
    //   2427: iconst_3
    //   2428: aload #37
    //   2430: iload #50
    //   2432: sipush #255
    //   2435: iand
    //   2436: baload
    //   2437: iload #48
    //   2439: ixor
    //   2440: i2b
    //   2441: bastore
    //   2442: aload #30
    //   2444: iload #47
    //   2446: iconst_1
    //   2447: iadd
    //   2448: iaload
    //   2449: istore #48
    //   2451: aload #46
    //   2453: iconst_4
    //   2454: aload #37
    //   2456: iload #50
    //   2458: bipush #24
    //   2460: iushr
    //   2461: baload
    //   2462: iload #48
    //   2464: bipush #24
    //   2466: iushr
    //   2467: ixor
    //   2468: i2b
    //   2469: bastore
    //   2470: aload #46
    //   2472: iconst_5
    //   2473: aload #37
    //   2475: iload #49
    //   2477: bipush #16
    //   2479: iushr
    //   2480: sipush #255
    //   2483: iand
    //   2484: baload
    //   2485: iload #48
    //   2487: bipush #16
    //   2489: iushr
    //   2490: ixor
    //   2491: i2b
    //   2492: bastore
    //   2493: aload #46
    //   2495: bipush #6
    //   2497: aload #37
    //   2499: iload #52
    //   2501: bipush #8
    //   2503: iushr
    //   2504: sipush #255
    //   2507: iand
    //   2508: baload
    //   2509: iload #48
    //   2511: bipush #8
    //   2513: iushr
    //   2514: ixor
    //   2515: i2b
    //   2516: bastore
    //   2517: aload #46
    //   2519: bipush #7
    //   2521: aload #37
    //   2523: iload #51
    //   2525: sipush #255
    //   2528: iand
    //   2529: baload
    //   2530: iload #48
    //   2532: ixor
    //   2533: i2b
    //   2534: bastore
    //   2535: aload #30
    //   2537: iload #47
    //   2539: iconst_2
    //   2540: iadd
    //   2541: iaload
    //   2542: istore #48
    //   2544: aload #46
    //   2546: bipush #8
    //   2548: aload #37
    //   2550: iload #51
    //   2552: bipush #24
    //   2554: iushr
    //   2555: baload
    //   2556: iload #48
    //   2558: bipush #24
    //   2560: iushr
    //   2561: ixor
    //   2562: i2b
    //   2563: bastore
    //   2564: aload #46
    //   2566: bipush #9
    //   2568: aload #37
    //   2570: iload #50
    //   2572: bipush #16
    //   2574: iushr
    //   2575: sipush #255
    //   2578: iand
    //   2579: baload
    //   2580: iload #48
    //   2582: bipush #16
    //   2584: iushr
    //   2585: ixor
    //   2586: i2b
    //   2587: bastore
    //   2588: aload #46
    //   2590: bipush #10
    //   2592: aload #37
    //   2594: iload #49
    //   2596: bipush #8
    //   2598: iushr
    //   2599: sipush #255
    //   2602: iand
    //   2603: baload
    //   2604: iload #48
    //   2606: bipush #8
    //   2608: iushr
    //   2609: ixor
    //   2610: i2b
    //   2611: bastore
    //   2612: aload #46
    //   2614: bipush #11
    //   2616: aload #37
    //   2618: iload #52
    //   2620: sipush #255
    //   2623: iand
    //   2624: baload
    //   2625: iload #48
    //   2627: ixor
    //   2628: i2b
    //   2629: bastore
    //   2630: aload #30
    //   2632: iload #47
    //   2634: iconst_3
    //   2635: iadd
    //   2636: iaload
    //   2637: istore #48
    //   2639: aload #46
    //   2641: bipush #12
    //   2643: aload #37
    //   2645: iload #52
    //   2647: bipush #24
    //   2649: iushr
    //   2650: baload
    //   2651: iload #48
    //   2653: bipush #24
    //   2655: iushr
    //   2656: ixor
    //   2657: i2b
    //   2658: bastore
    //   2659: aload #46
    //   2661: bipush #13
    //   2663: aload #37
    //   2665: iload #51
    //   2667: bipush #16
    //   2669: iushr
    //   2670: sipush #255
    //   2673: iand
    //   2674: baload
    //   2675: iload #48
    //   2677: bipush #16
    //   2679: iushr
    //   2680: ixor
    //   2681: i2b
    //   2682: bastore
    //   2683: aload #46
    //   2685: bipush #14
    //   2687: aload #37
    //   2689: iload #50
    //   2691: bipush #8
    //   2693: iushr
    //   2694: sipush #255
    //   2697: iand
    //   2698: baload
    //   2699: iload #48
    //   2701: bipush #8
    //   2703: iushr
    //   2704: ixor
    //   2705: i2b
    //   2706: bastore
    //   2707: aload #46
    //   2709: bipush #15
    //   2711: aload #37
    //   2713: iload #49
    //   2715: sipush #255
    //   2718: iand
    //   2719: baload
    //   2720: iload #48
    //   2722: ixor
    //   2723: i2b
    //   2724: bastore
    //   2725: iconst_0
    //   2726: istore #53
    //   2728: iload #53
    //   2730: bipush #16
    //   2732: if_icmpge -> 2758
    //   2735: aload #43
    //   2737: iload #53
    //   2739: iload #44
    //   2741: bipush #16
    //   2743: imul
    //   2744: iadd
    //   2745: aload #46
    //   2747: iload #53
    //   2749: baload
    //   2750: bastore
    //   2751: iinc #53, 1
    //   2754: iload_2
    //   2755: ifne -> 2728
    //   2758: iinc #44, 1
    //   2761: iload_2
    //   2762: ifne -> 1843
    //   2765: aload #43
    //   2767: arraylength
    //   2768: ifle -> 2849
    //   2771: aload #43
    //   2773: aload #43
    //   2775: arraylength
    //   2776: iconst_1
    //   2777: isub
    //   2778: baload
    //   2779: istore #44
    //   2781: iload #44
    //   2783: bipush #16
    //   2785: if_icmple -> 2796
    //   2788: aload #43
    //   2790: astore #35
    //   2792: iload_2
    //   2793: ifne -> 2849
    //   2796: aload #43
    //   2798: arraylength
    //   2799: iload #44
    //   2801: isub
    //   2802: newarray byte
    //   2804: astore #35
    //   2806: iconst_0
    //   2807: istore #45
    //   2809: iload #45
    //   2811: aload #35
    //   2813: arraylength
    //   2814: if_icmpge -> 2849
    //   2817: iload #45
    //   2819: aload #43
    //   2821: arraylength
    //   2822: if_icmpge -> 2849
    //   2825: aload #35
    //   2827: iload #45
    //   2829: aload #43
    //   2831: iload #45
    //   2833: baload
    //   2834: bastore
    //   2835: iinc #45, 1
    //   2838: iload_2
    //   2839: ifne -> 2809
    //   2842: goto -> 2849
    //   2845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2848: athrow
    //   2849: aload #35
    //   2851: astore #7
    //   2853: getstatic burp/Zz7j.ZP : Ljava/lang/String;
    //   2856: getstatic burp/Zedq.Zy : Ljava/lang/Object;
    //   2859: checkcast java/math/BigInteger
    //   2862: invokevirtual intValue : ()I
    //   2865: bipush #32
    //   2867: irem
    //   2868: invokestatic abs : (I)I
    //   2871: invokevirtual charAt : (I)C
    //   2874: getstatic burp/Zt7x.Zu : Ljava/lang/String;
    //   2877: getstatic burp/Zlsg.ZD : Ljava/lang/Object;
    //   2880: checkcast java/math/BigInteger
    //   2883: invokevirtual intValue : ()I
    //   2886: bipush #32
    //   2888: irem
    //   2889: invokestatic abs : (I)I
    //   2892: invokevirtual charAt : (I)C
    //   2895: if_icmple -> 3010
    //   2898: getstatic burp/Zegj.ZS : Ljava/lang/String;
    //   2901: getstatic burp/Zxd1.Zc : Ljava/lang/Object;
    //   2904: checkcast java/math/BigInteger
    //   2907: invokevirtual intValue : ()I
    //   2910: bipush #32
    //   2912: irem
    //   2913: invokestatic abs : (I)I
    //   2916: invokevirtual charAt : (I)C
    //   2919: getstatic burp/Zmui.ZY : Ljava/lang/String;
    //   2922: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   2925: checkcast java/math/BigInteger
    //   2928: invokevirtual intValue : ()I
    //   2931: bipush #32
    //   2933: irem
    //   2934: invokestatic abs : (I)I
    //   2937: invokevirtual charAt : (I)C
    //   2940: if_icmple -> 3010
    //   2943: goto -> 2950
    //   2946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2949: athrow
    //   2950: getstatic burp/Ztr5.ZY : Ljava/lang/String;
    //   2953: getstatic burp/Zkdq.ZG : Ljava/lang/Object;
    //   2956: checkcast java/math/BigInteger
    //   2959: invokevirtual intValue : ()I
    //   2962: bipush #32
    //   2964: irem
    //   2965: invokestatic abs : (I)I
    //   2968: invokevirtual charAt : (I)C
    //   2971: getstatic burp/Zb4d.ZS : Ljava/lang/String;
    //   2974: getstatic burp/Zb4d.Ze : Ljava/lang/Object;
    //   2977: checkcast java/math/BigInteger
    //   2980: invokevirtual intValue : ()I
    //   2983: bipush #32
    //   2985: irem
    //   2986: invokestatic abs : (I)I
    //   2989: invokevirtual charAt : (I)C
    //   2992: if_icmpgt -> 3010
    //   2995: goto -> 3002
    //   2998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3001: athrow
    //   3002: iconst_1
    //   3003: goto -> 3011
    //   3006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3009: athrow
    //   3010: iconst_0
    //   3011: ireturn
    //   3012: astore_3
    //   3013: new java/lang/Exception
    //   3016: dup
    //   3017: aload_3
    //   3018: invokevirtual getMessage : ()Ljava/lang/String;
    //   3021: invokespecial <init> : (Ljava/lang/String;)V
    //   3024: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3011	3012	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   496	511	511	java/lang/Throwable
    //   1513	1539	1539	java/lang/Throwable
    //   1620	1635	1635	java/lang/Throwable
    //   2817	2842	2845	java/lang/Throwable
    //   2853	2943	2946	java/lang/Throwable
    //   2898	2995	2998	java/lang/Throwable
    //   2950	3006	3006	java/lang/Throwable
  }
  
  static void ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'fh_áãØ¢\\t½Òá\\b\\t4ª| uÁå¿TÚðAë\\rLÛ±%\\rBSÅSá(ÕE®È±à§¤:Íp¨¬z&¾¨]挼矫潕々某︫ꯕ쨞쥵缾䜬궼ꊹ鲊特랖錨㘏㓡無ㆦә⌀ᢾ՜ݶ聴늼খⱺᬲ婁刊혥⤇⽅厂,₰녚檴뺻䫈墊큎ꩫ䍂㍦䖬Ȧ偃龁冇䃖銰㢨밮?ဧ촼ጧ彤䐢쑢绱撵ᤃ惋佘≂部䚴롧?஫㩿䤩⒅싇곑野㞅趫丮沘攌긨뫠╟᰺됒璺䬧謍炭뗫䢛懜垬蛥᷸颗楽躬鯳蝖캋⠶賻觥뿵䋘䄱ⴌ뀯뮭\\tG¾Ñe2IÐÙ挬眚潫ぅ朗︣ꬭ쨟쥪晴䟏궸ꋅ鰊狶랆鏙㘍㒡焩ㅞӘ⌟ᢞֿݲ耈눳আⲋᬰ婿削훢⤏⾽厃3ₐ놹檰뻇䩈堅큞ꪚ䍀㍘䗬ˡ偋齹円䃉銐㡋밪?Ⴇ촬Ꮦ彦䐜쐢縶撽᧻惊佇≢逋䚰렛?ତ㪎䤫Ⓕ슇갖釆㞚趋仍沜斌꺧뫰▮᰸됬瑽䬯诵炬뗴䢻懘埐虥ᵷ顦楿躒鮳螑캃⣎賺觺뿕䈻䄵⵰낯묢Mp9EY­§\\rfÞÂ%¸áÃ*Øa9)I¿®¬\\r\S\\bÃøi\\rÎq;±°û\\rÈÀÈ:Ì&÷Ê\\n2´gßýECQÃt*½]ù §´X'3kjSªköÍx¼£lþ6õ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
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
    //   68: ldc 'þ¼T\\t±aUK-Tu)k'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #111
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
    //   128: putstatic burp/Zgtd.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgtd.b : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #7
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #73
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
    //   300: sipush #23892
    //   303: sipush #16579
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgtd.Zj : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #53
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #18
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-82
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #18
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #94
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-53
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #43
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #118
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: iconst_1
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #92
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-126
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: iconst_4
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #119
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #106
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #122
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #8
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-60
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-25
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-53
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #127
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #102
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-33
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-109
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #102
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-115
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #43
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #11
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #19
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-68
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-25
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #7
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #18
    //   504: bastore
    //   505: invokespecial <init> : (I[B)V
    //   508: putstatic burp/Zgtd.Zo : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D56) & 0xFFFF;
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
      byte b1 = 27;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgtd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */