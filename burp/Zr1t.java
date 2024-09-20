package burp;

import java.math.BigInteger;

class Zr1t extends ClassLoader {
  static String Ze;
  
  static Object ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZX(Object paramObject) {
    Zeub.ZT = a(-12335, -499);
    Zeub.ZD = new BigInteger(a(-12334, 18807));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zscz.ZJ.charAt(Math.abs(((BigInteger)Ze6w.Ze).intValue() % 32)) > Zlt1.ZA.charAt(Math.abs(((BigInteger)Zrl5.ZI).intValue() % 32))) {
          try {
            Zzhx.ZY(Class.forName(a(-12323, 10151)));
            if (bool)
              Zg_6.ZB(Class.forName(a(-12325, -32522))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zg_6.ZB(Class.forName(a(-12325, -32522)));
    } catch (Throwable throwable) {}
  }
  
  static void ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zy(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg61.Zp : Ljava/lang/Object;
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
    //   562: sipush #-12321
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Zenr.ZA : Ljava/lang/Object;
    //   580: sipush #11974
    //   583: getstatic burp/Zea.ZO : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   592: checkcast java/math/BigInteger
    //   595: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   598: putstatic burp/Zek4.ZR : Ljava/lang/Object;
    //   601: getstatic burp/Zewr.Zw : Ljava/lang/Object;
    //   604: checkcast java/math/BigInteger
    //   607: getstatic burp/Zbnk.Zp : Ljava/lang/Object;
    //   610: checkcast java/math/BigInteger
    //   613: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   616: putstatic burp/Zm83.Zl : Ljava/lang/Object;
    //   619: invokestatic a : (II)Ljava/lang/String;
    //   622: iconst_1
    //   623: ldc burp/Zk5y
    //   625: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   628: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   631: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   634: astore_3
    //   635: aload_3
    //   636: arraylength
    //   637: istore #4
    //   639: iconst_0
    //   640: istore #5
    //   642: iload #5
    //   644: iload #4
    //   646: if_icmpge -> 783
    //   649: aload_3
    //   650: iload #5
    //   652: aaload
    //   653: astore #6
    //   655: aload #6
    //   657: invokevirtual getModifiers : ()I
    //   660: invokestatic isStatic : (I)Z
    //   663: ifne -> 673
    //   666: goto -> 776
    //   669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   672: athrow
    //   673: aload #6
    //   675: invokevirtual getType : ()Ljava/lang/Class;
    //   678: astore #7
    //   680: aload #7
    //   682: ifnull -> 763
    //   685: aload #7
    //   687: invokevirtual isPrimitive : ()Z
    //   690: ifne -> 763
    //   693: goto -> 700
    //   696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   699: athrow
    //   700: aload #7
    //   702: invokevirtual getPackage : ()Ljava/lang/Package;
    //   705: ifnull -> 763
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload #7
    //   717: invokevirtual getPackage : ()Ljava/lang/Package;
    //   720: invokevirtual getName : ()Ljava/lang/String;
    //   723: ifnull -> 763
    //   726: goto -> 733
    //   729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   732: athrow
    //   733: aload #7
    //   735: invokevirtual getPackage : ()Ljava/lang/Package;
    //   738: invokevirtual getName : ()Ljava/lang/String;
    //   741: sipush #-12327
    //   744: sipush #-28763
    //   747: invokestatic a : (II)Ljava/lang/String;
    //   750: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   753: ifne -> 763
    //   756: goto -> 763
    //   759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   762: athrow
    //   763: aload #6
    //   765: iconst_1
    //   766: invokevirtual setAccessible : (Z)V
    //   769: aload #6
    //   771: aconst_null
    //   772: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   775: pop
    //   776: iinc #5, 1
    //   779: iload_2
    //   780: ifne -> 642
    //   783: sipush #-12322
    //   786: sipush #-12756
    //   789: invokestatic a : (II)Ljava/lang/String;
    //   792: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   795: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   798: astore_3
    //   799: aload_3
    //   800: arraylength
    //   801: istore #4
    //   803: iconst_0
    //   804: istore #5
    //   806: iload #5
    //   808: iload #4
    //   810: if_icmpge -> 942
    //   813: aload_3
    //   814: iload #5
    //   816: aaload
    //   817: astore #6
    //   819: aload #6
    //   821: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   824: pop
    //   825: aload #6
    //   827: invokevirtual getModifiers : ()I
    //   830: invokestatic isStatic : (I)Z
    //   833: ifeq -> 928
    //   836: aload #6
    //   838: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   841: arraylength
    //   842: iconst_2
    //   843: if_icmpne -> 928
    //   846: goto -> 853
    //   849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   852: athrow
    //   853: aload #6
    //   855: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   858: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   861: invokevirtual equals : (Ljava/lang/Object;)Z
    //   864: ifeq -> 928
    //   867: goto -> 874
    //   870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   873: athrow
    //   874: aload #6
    //   876: iconst_1
    //   877: invokevirtual setAccessible : (Z)V
    //   880: aload #6
    //   882: aconst_null
    //   883: iconst_2
    //   884: anewarray java/lang/Object
    //   887: dup
    //   888: iconst_0
    //   889: aload_0
    //   890: aastore
    //   891: dup
    //   892: iconst_1
    //   893: aload_1
    //   894: ifnonnull -> 912
    //   897: goto -> 904
    //   900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   903: athrow
    //   904: aload_1
    //   905: goto -> 919
    //   908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   911: athrow
    //   912: aload_1
    //   913: checkcast [B
    //   916: invokevirtual clone : ()Ljava/lang/Object;
    //   919: aastore
    //   920: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   923: pop
    //   924: iload_2
    //   925: ifne -> 942
    //   928: iinc #5, 1
    //   931: iload_2
    //   932: ifne -> 806
    //   935: goto -> 942
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: sipush #-12333
    //   945: sipush #25099
    //   948: invokestatic a : (II)Ljava/lang/String;
    //   951: iconst_1
    //   952: ldc burp/Zter
    //   954: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   957: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   960: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   963: astore_3
    //   964: aload_3
    //   965: arraylength
    //   966: istore #4
    //   968: iconst_0
    //   969: istore #5
    //   971: iload #5
    //   973: iload #4
    //   975: if_icmpge -> 1112
    //   978: aload_3
    //   979: iload #5
    //   981: aaload
    //   982: astore #6
    //   984: aload #6
    //   986: invokevirtual getModifiers : ()I
    //   989: invokestatic isStatic : (I)Z
    //   992: ifne -> 1002
    //   995: goto -> 1105
    //   998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1001: athrow
    //   1002: aload #6
    //   1004: invokevirtual getType : ()Ljava/lang/Class;
    //   1007: astore #7
    //   1009: aload #7
    //   1011: ifnull -> 1092
    //   1014: aload #7
    //   1016: invokevirtual isPrimitive : ()Z
    //   1019: ifne -> 1092
    //   1022: goto -> 1029
    //   1025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1028: athrow
    //   1029: aload #7
    //   1031: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1034: ifnull -> 1092
    //   1037: goto -> 1044
    //   1040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1043: athrow
    //   1044: aload #7
    //   1046: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1049: invokevirtual getName : ()Ljava/lang/String;
    //   1052: ifnull -> 1092
    //   1055: goto -> 1062
    //   1058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1061: athrow
    //   1062: aload #7
    //   1064: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1067: invokevirtual getName : ()Ljava/lang/String;
    //   1070: sipush #-12336
    //   1073: sipush #-11230
    //   1076: invokestatic a : (II)Ljava/lang/String;
    //   1079: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1082: ifne -> 1092
    //   1085: goto -> 1092
    //   1088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1091: athrow
    //   1092: aload #6
    //   1094: iconst_1
    //   1095: invokevirtual setAccessible : (Z)V
    //   1098: aload #6
    //   1100: aconst_null
    //   1101: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1104: pop
    //   1105: iinc #5, 1
    //   1108: iload_2
    //   1109: ifne -> 971
    //   1112: sipush #-12326
    //   1115: sipush #18833
    //   1118: invokestatic a : (II)Ljava/lang/String;
    //   1121: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1124: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1127: astore_3
    //   1128: aload_3
    //   1129: arraylength
    //   1130: istore #4
    //   1132: iconst_0
    //   1133: istore #5
    //   1135: iload #5
    //   1137: iload #4
    //   1139: if_icmpge -> 1250
    //   1142: aload_3
    //   1143: iload #5
    //   1145: aaload
    //   1146: astore #6
    //   1148: aload #6
    //   1150: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1153: pop
    //   1154: aload #6
    //   1156: invokevirtual getModifiers : ()I
    //   1159: invokestatic isStatic : (I)Z
    //   1162: ifeq -> 1236
    //   1165: aload #6
    //   1167: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1170: arraylength
    //   1171: iconst_2
    //   1172: if_icmpne -> 1236
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1181: athrow
    //   1182: aload #6
    //   1184: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1187: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1190: if_acmpne -> 1236
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: aload #6
    //   1202: iconst_1
    //   1203: invokevirtual setAccessible : (Z)V
    //   1206: aload #6
    //   1208: aconst_null
    //   1209: iconst_2
    //   1210: anewarray java/lang/Object
    //   1213: dup
    //   1214: iconst_0
    //   1215: aload_0
    //   1216: aastore
    //   1217: dup
    //   1218: iconst_1
    //   1219: aload_1
    //   1220: aastore
    //   1221: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1224: pop
    //   1225: iload_2
    //   1226: ifne -> 1250
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: iinc #5, 1
    //   1239: iload_2
    //   1240: ifne -> 1135
    //   1243: goto -> 1250
    //   1246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1249: athrow
    //   1250: getstatic burp/Zxp5.ZO : Ljava/lang/String;
    //   1253: getstatic burp/Zl_f.ZI : Ljava/lang/Object;
    //   1256: checkcast java/math/BigInteger
    //   1259: invokevirtual intValue : ()I
    //   1262: bipush #32
    //   1264: irem
    //   1265: invokestatic abs : (I)I
    //   1268: invokevirtual charAt : (I)C
    //   1271: getstatic burp/Zsp9.ZA : Ljava/lang/String;
    //   1274: getstatic burp/Zrd3.ZI : Ljava/lang/Object;
    //   1277: checkcast java/math/BigInteger
    //   1280: invokevirtual intValue : ()I
    //   1283: bipush #32
    //   1285: irem
    //   1286: invokestatic abs : (I)I
    //   1289: invokevirtual charAt : (I)C
    //   1292: if_icmple -> 1399
    //   1295: getstatic burp/Ze84.Zv : Ljava/lang/String;
    //   1298: getstatic burp/Zewr.Zw : Ljava/lang/Object;
    //   1301: checkcast java/math/BigInteger
    //   1304: invokevirtual intValue : ()I
    //   1307: bipush #32
    //   1309: irem
    //   1310: invokestatic abs : (I)I
    //   1313: invokevirtual charAt : (I)C
    //   1316: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   1319: getstatic burp/Zttd.Zi : Ljava/lang/Object;
    //   1322: checkcast java/math/BigInteger
    //   1325: invokevirtual intValue : ()I
    //   1328: bipush #32
    //   1330: irem
    //   1331: invokestatic abs : (I)I
    //   1334: invokevirtual charAt : (I)C
    //   1337: if_icmple -> 1399
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1346: athrow
    //   1347: getstatic burp/Zlgh.Zm : Ljava/lang/String;
    //   1350: getstatic burp/Zrgo.ZJ : Ljava/lang/Object;
    //   1353: checkcast java/math/BigInteger
    //   1356: invokevirtual intValue : ()I
    //   1359: bipush #32
    //   1361: irem
    //   1362: invokestatic abs : (I)I
    //   1365: invokevirtual charAt : (I)C
    //   1368: getstatic burp/Zegw.Zn : Ljava/lang/String;
    //   1371: getstatic burp/Zrqe.ZX : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual intValue : ()I
    //   1380: bipush #32
    //   1382: irem
    //   1383: invokestatic abs : (I)I
    //   1386: invokevirtual charAt : (I)C
    //   1389: if_icmple -> 1407
    //   1392: goto -> 1399
    //   1395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1398: athrow
    //   1399: iconst_1
    //   1400: goto -> 1408
    //   1403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1406: athrow
    //   1407: iconst_0
    //   1408: ireturn
    //   1409: astore_3
    //   1410: new java/lang/Exception
    //   1413: dup
    //   1414: aload_3
    //   1415: invokevirtual getMessage : ()Ljava/lang/String;
    //   1418: invokespecial <init> : (Ljava/lang/String;)V
    //   1421: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1408	1409	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   655	669	669	java/lang/Throwable
    //   680	693	696	java/lang/Throwable
    //   685	708	711	java/lang/Throwable
    //   700	726	729	java/lang/Throwable
    //   715	756	759	java/lang/Throwable
    //   819	846	849	java/lang/Throwable
    //   836	867	870	java/lang/Throwable
    //   853	897	900	java/lang/Throwable
    //   874	908	908	java/lang/Throwable
    //   919	935	938	java/lang/Throwable
    //   984	998	998	java/lang/Throwable
    //   1009	1022	1025	java/lang/Throwable
    //   1014	1037	1040	java/lang/Throwable
    //   1029	1055	1058	java/lang/Throwable
    //   1044	1085	1088	java/lang/Throwable
    //   1148	1175	1178	java/lang/Throwable
    //   1165	1193	1196	java/lang/Throwable
    //   1182	1229	1232	java/lang/Throwable
    //   1200	1243	1246	java/lang/Throwable
    //   1250	1340	1343	java/lang/Throwable
    //   1295	1392	1395	java/lang/Throwable
    //   1347	1403	1403	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'WðtuX7Æ\\t¶cHßIÔçÈbEÒÃL£6¼ÆõW¯vsb-ê· aU¦ú»QÃA\\r,ÀJÏòÂX8NS/¡ntnþ\\rdAßN,Íh^ªIÐ¨¿;Ã{VJbF\\tÝ(%nrdx/~\\tÆyFD!õÏ\\tÿba'úMp1W »8g;4Ug©ê×=7_RdI \\t[µÍ\\t·s\\tn¤Sÿ¼V¸EM­«71ªÑ?½64K«\\r¾ÄßnöE:a¦e!ÀÄ·;:, ß$üêN÷_;ïçOU¦j=ÏÛ<e ¾¼pF@f*Ñ#IÄ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
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
    //   68: ldc '=+ÞàËY·=­ÞÈ/º Á/eÎ¦SåÛs^CÊk[ôBB'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zr1t.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr1t.b : [Ljava/lang/String;
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
    //   212: bipush #74
    //   214: goto -> 244
    //   217: bipush #64
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #42
    //   229: goto -> 244
    //   232: bipush #11
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #51
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
    //   300: sipush #-12324
    //   303: sipush #-2190
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zr1t.Ze : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-12328
    //   319: sipush #-21700
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zr1t.ZP : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCFDB) & 0xFFFF;
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
      byte b1 = 106;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */