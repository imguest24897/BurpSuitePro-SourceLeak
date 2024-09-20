package burp;

import java.math.BigInteger;

class Zg5 extends ClassLoader {
  static String ZF;
  
  static Object Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zl(Object paramObject) {
    Zlwi.ZN = a(25169, -23693);
    Zlwi.Zw = new BigInteger(a(25166, -28116));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zewq.ZV.charAt(Math.abs(((BigInteger)Zenq.Zd).intValue() % 32)) <= Zlwi.ZN.charAt(Math.abs(((BigInteger)Zewq.ZO).intValue() % 32))) {
          try {
            Zs5k.ZG(Class.forName(a(25164, -29322)));
            if (bool)
              Zk12.ZP(Class.forName(a(25181, 18140))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zk12.ZP(Class.forName(a(25181, 18140)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zre4.Zx : Ljava/lang/Object;
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
    //   416: putstatic burp/Zbzj.Zz : Ljava/lang/Object;
    //   419: getstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   422: checkcast java/math/BigInteger
    //   425: invokevirtual toByteArray : ()[B
    //   428: astore_3
    //   429: aload_3
    //   430: arraylength
    //   431: bipush #8
    //   433: iadd
    //   434: bipush #6
    //   436: ishr
    //   437: iconst_1
    //   438: iadd
    //   439: bipush #16
    //   441: imul
    //   442: newarray int
    //   444: astore #5
    //   446: iconst_0
    //   447: istore #6
    //   449: iload #6
    //   451: aload_3
    //   452: arraylength
    //   453: if_icmpge -> 496
    //   456: aload_3
    //   457: iload #6
    //   459: baload
    //   460: sipush #255
    //   463: iand
    //   464: istore #7
    //   466: aload #5
    //   468: iload #6
    //   470: iconst_2
    //   471: ishr
    //   472: dup2
    //   473: iaload
    //   474: iload #7
    //   476: bipush #24
    //   478: iload #6
    //   480: iconst_4
    //   481: irem
    //   482: bipush #8
    //   484: imul
    //   485: isub
    //   486: ishl
    //   487: ior
    //   488: iastore
    //   489: iinc #6, 1
    //   492: iload_2
    //   493: ifeq -> 449
    //   496: aload #5
    //   498: iload #6
    //   500: iconst_2
    //   501: ishr
    //   502: dup2
    //   503: iaload
    //   504: sipush #128
    //   507: bipush #24
    //   509: iload #6
    //   511: iconst_4
    //   512: irem
    //   513: bipush #8
    //   515: imul
    //   516: isub
    //   517: ishl
    //   518: ior
    //   519: iastore
    //   520: aload #5
    //   522: aload #5
    //   524: arraylength
    //   525: iconst_1
    //   526: isub
    //   527: aload_3
    //   528: arraylength
    //   529: bipush #8
    //   531: imul
    //   532: iastore
    //   533: bipush #80
    //   535: newarray int
    //   537: astore #7
    //   539: ldc 1732584193
    //   541: istore #8
    //   543: ldc -271733879
    //   545: istore #9
    //   547: ldc -1732584194
    //   549: istore #10
    //   551: ldc 271733878
    //   553: istore #11
    //   555: ldc -1009589776
    //   557: istore #12
    //   559: iconst_0
    //   560: istore #6
    //   562: iload #6
    //   564: aload #5
    //   566: arraylength
    //   567: if_icmpge -> 889
    //   570: iload #8
    //   572: istore #13
    //   574: iload #9
    //   576: istore #14
    //   578: iload #10
    //   580: istore #15
    //   582: iload #11
    //   584: istore #16
    //   586: iload #12
    //   588: istore #17
    //   590: iconst_0
    //   591: istore #18
    //   593: iload #18
    //   595: bipush #80
    //   597: if_icmpge -> 847
    //   600: iload #18
    //   602: bipush #16
    //   604: if_icmpge -> 631
    //   607: aload #7
    //   609: iload #18
    //   611: aload #5
    //   613: iload #6
    //   615: iload #18
    //   617: iadd
    //   618: iaload
    //   619: iastore
    //   620: iload_2
    //   621: ifeq -> 686
    //   624: goto -> 631
    //   627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   630: athrow
    //   631: aload #7
    //   633: iload #18
    //   635: iconst_3
    //   636: isub
    //   637: iaload
    //   638: aload #7
    //   640: iload #18
    //   642: bipush #8
    //   644: isub
    //   645: iaload
    //   646: ixor
    //   647: aload #7
    //   649: iload #18
    //   651: bipush #14
    //   653: isub
    //   654: iaload
    //   655: ixor
    //   656: aload #7
    //   658: iload #18
    //   660: bipush #16
    //   662: isub
    //   663: iaload
    //   664: ixor
    //   665: istore #19
    //   667: iload #19
    //   669: iconst_1
    //   670: ishl
    //   671: iload #19
    //   673: bipush #31
    //   675: iushr
    //   676: ior
    //   677: istore #20
    //   679: aload #7
    //   681: iload #18
    //   683: iload #20
    //   685: iastore
    //   686: iload #8
    //   688: iconst_5
    //   689: ishl
    //   690: iload #8
    //   692: bipush #27
    //   694: iushr
    //   695: ior
    //   696: istore #19
    //   698: iload #19
    //   700: iload #12
    //   702: iadd
    //   703: aload #7
    //   705: iload #18
    //   707: iaload
    //   708: iadd
    //   709: iload #18
    //   711: bipush #20
    //   713: if_icmpge -> 739
    //   716: ldc 1518500249
    //   718: iload #9
    //   720: iload #10
    //   722: iand
    //   723: iload #9
    //   725: iconst_m1
    //   726: ixor
    //   727: iload #11
    //   729: iand
    //   730: ior
    //   731: iadd
    //   732: goto -> 809
    //   735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   738: athrow
    //   739: iload #18
    //   741: bipush #40
    //   743: if_icmpge -> 764
    //   746: ldc 1859775393
    //   748: iload #9
    //   750: iload #10
    //   752: ixor
    //   753: iload #11
    //   755: ixor
    //   756: iadd
    //   757: goto -> 809
    //   760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   763: athrow
    //   764: iload #18
    //   766: bipush #60
    //   768: if_icmpge -> 798
    //   771: ldc -1894007588
    //   773: iload #9
    //   775: iload #10
    //   777: iand
    //   778: iload #9
    //   780: iload #11
    //   782: iand
    //   783: ior
    //   784: iload #10
    //   786: iload #11
    //   788: iand
    //   789: ior
    //   790: iadd
    //   791: goto -> 809
    //   794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   797: athrow
    //   798: ldc -899497514
    //   800: iload #9
    //   802: iload #10
    //   804: ixor
    //   805: iload #11
    //   807: ixor
    //   808: iadd
    //   809: iadd
    //   810: istore #20
    //   812: iload #11
    //   814: istore #12
    //   816: iload #10
    //   818: istore #11
    //   820: iload #9
    //   822: bipush #30
    //   824: ishl
    //   825: iload #9
    //   827: iconst_2
    //   828: iushr
    //   829: ior
    //   830: istore #10
    //   832: iload #8
    //   834: istore #9
    //   836: iload #20
    //   838: istore #8
    //   840: iinc #18, 1
    //   843: iload_2
    //   844: ifeq -> 593
    //   847: iload #8
    //   849: iload #13
    //   851: iadd
    //   852: istore #8
    //   854: iload #9
    //   856: iload #14
    //   858: iadd
    //   859: istore #9
    //   861: iload #10
    //   863: iload #15
    //   865: iadd
    //   866: istore #10
    //   868: iload #11
    //   870: iload #16
    //   872: iadd
    //   873: istore #11
    //   875: iload #12
    //   877: iload #17
    //   879: iadd
    //   880: istore #12
    //   882: iinc #6, 16
    //   885: iload_2
    //   886: ifeq -> 562
    //   889: iconst_5
    //   890: newarray int
    //   892: dup
    //   893: iconst_0
    //   894: iload #8
    //   896: iastore
    //   897: dup
    //   898: iconst_1
    //   899: iload #9
    //   901: iastore
    //   902: dup
    //   903: iconst_2
    //   904: iload #10
    //   906: iastore
    //   907: dup
    //   908: iconst_3
    //   909: iload #11
    //   911: iastore
    //   912: dup
    //   913: iconst_4
    //   914: iload #12
    //   916: iastore
    //   917: astore #13
    //   919: bipush #20
    //   921: newarray byte
    //   923: astore #14
    //   925: iconst_0
    //   926: istore #15
    //   928: iload #15
    //   930: bipush #20
    //   932: if_icmpge -> 973
    //   935: aload #13
    //   937: iload #15
    //   939: iconst_4
    //   940: idiv
    //   941: iaload
    //   942: istore #16
    //   944: iconst_3
    //   945: iload #15
    //   947: iconst_4
    //   948: irem
    //   949: isub
    //   950: bipush #8
    //   952: imul
    //   953: istore #17
    //   955: aload #14
    //   957: iload #15
    //   959: iload #16
    //   961: iload #17
    //   963: iushr
    //   964: i2b
    //   965: bastore
    //   966: iinc #15, 1
    //   969: iload_2
    //   970: ifeq -> 928
    //   973: aload #14
    //   975: astore #4
    //   977: sipush #25182
    //   980: new java/math/BigInteger
    //   983: dup
    //   984: aload #4
    //   986: invokespecial <init> : ([B)V
    //   989: invokevirtual abs : ()Ljava/math/BigInteger;
    //   992: putstatic burp/Zeqw.ZV : Ljava/lang/Object;
    //   995: sipush #-12948
    //   998: invokestatic a : (II)Ljava/lang/String;
    //   1001: iconst_1
    //   1002: ldc burp/Zrqd
    //   1004: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1007: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1010: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1013: astore_3
    //   1014: aload_3
    //   1015: arraylength
    //   1016: istore #4
    //   1018: iconst_0
    //   1019: istore #5
    //   1021: iload #5
    //   1023: iload #4
    //   1025: if_icmpge -> 1162
    //   1028: aload_3
    //   1029: iload #5
    //   1031: aaload
    //   1032: astore #6
    //   1034: aload #6
    //   1036: invokevirtual getModifiers : ()I
    //   1039: invokestatic isStatic : (I)Z
    //   1042: ifne -> 1052
    //   1045: goto -> 1155
    //   1048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1051: athrow
    //   1052: aload #6
    //   1054: invokevirtual getType : ()Ljava/lang/Class;
    //   1057: astore #7
    //   1059: aload #7
    //   1061: ifnull -> 1142
    //   1064: aload #7
    //   1066: invokevirtual isPrimitive : ()Z
    //   1069: ifne -> 1142
    //   1072: goto -> 1079
    //   1075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1078: athrow
    //   1079: aload #7
    //   1081: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1084: ifnull -> 1142
    //   1087: goto -> 1094
    //   1090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1093: athrow
    //   1094: aload #7
    //   1096: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1099: invokevirtual getName : ()Ljava/lang/String;
    //   1102: ifnull -> 1142
    //   1105: goto -> 1112
    //   1108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1111: athrow
    //   1112: aload #7
    //   1114: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1117: invokevirtual getName : ()Ljava/lang/String;
    //   1120: sipush #25178
    //   1123: sipush #18442
    //   1126: invokestatic a : (II)Ljava/lang/String;
    //   1129: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1132: ifne -> 1142
    //   1135: goto -> 1142
    //   1138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1141: athrow
    //   1142: aload #6
    //   1144: iconst_1
    //   1145: invokevirtual setAccessible : (Z)V
    //   1148: aload #6
    //   1150: aconst_null
    //   1151: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1154: pop
    //   1155: iinc #5, 1
    //   1158: iload_2
    //   1159: ifeq -> 1021
    //   1162: sipush #25168
    //   1165: sipush #-2064
    //   1168: invokestatic a : (II)Ljava/lang/String;
    //   1171: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1174: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1177: astore_3
    //   1178: aload_3
    //   1179: arraylength
    //   1180: istore #4
    //   1182: iconst_0
    //   1183: istore #5
    //   1185: iload #5
    //   1187: iload #4
    //   1189: if_icmpge -> 1321
    //   1192: aload_3
    //   1193: iload #5
    //   1195: aaload
    //   1196: astore #6
    //   1198: aload #6
    //   1200: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1203: pop
    //   1204: aload #6
    //   1206: invokevirtual getModifiers : ()I
    //   1209: invokestatic isStatic : (I)Z
    //   1212: ifeq -> 1307
    //   1215: aload #6
    //   1217: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1220: arraylength
    //   1221: iconst_2
    //   1222: if_icmpne -> 1307
    //   1225: goto -> 1232
    //   1228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1231: athrow
    //   1232: aload #6
    //   1234: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1237: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1240: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1243: ifeq -> 1307
    //   1246: goto -> 1253
    //   1249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1252: athrow
    //   1253: aload #6
    //   1255: iconst_1
    //   1256: invokevirtual setAccessible : (Z)V
    //   1259: aload #6
    //   1261: aconst_null
    //   1262: iconst_2
    //   1263: anewarray java/lang/Object
    //   1266: dup
    //   1267: iconst_0
    //   1268: aload_0
    //   1269: aastore
    //   1270: dup
    //   1271: iconst_1
    //   1272: aload_1
    //   1273: ifnonnull -> 1291
    //   1276: goto -> 1283
    //   1279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1282: athrow
    //   1283: aload_1
    //   1284: goto -> 1298
    //   1287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1290: athrow
    //   1291: aload_1
    //   1292: checkcast [B
    //   1295: invokevirtual clone : ()Ljava/lang/Object;
    //   1298: aastore
    //   1299: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1302: pop
    //   1303: iload_2
    //   1304: ifeq -> 1321
    //   1307: iinc #5, 1
    //   1310: iload_2
    //   1311: ifeq -> 1185
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1320: athrow
    //   1321: iconst_0
    //   1322: istore_3
    //   1323: getstatic burp/Zzoc.Zg : Ljava/lang/String;
    //   1326: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   1329: checkcast java/math/BigInteger
    //   1332: invokevirtual intValue : ()I
    //   1335: bipush #32
    //   1337: irem
    //   1338: invokestatic abs : (I)I
    //   1341: invokevirtual charAt : (I)C
    //   1344: getstatic burp/Zso7.Zr : Ljava/lang/String;
    //   1347: getstatic burp/Ze_e.Za : Ljava/lang/Object;
    //   1350: checkcast java/math/BigInteger
    //   1353: invokevirtual intValue : ()I
    //   1356: bipush #32
    //   1358: irem
    //   1359: invokestatic abs : (I)I
    //   1362: invokevirtual charAt : (I)C
    //   1365: if_icmple -> 1709
    //   1368: sipush #25168
    //   1371: sipush #-2064
    //   1374: invokestatic a : (II)Ljava/lang/String;
    //   1377: iconst_1
    //   1378: ldc burp/Zzou
    //   1380: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1383: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1386: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1389: astore #4
    //   1391: aload #4
    //   1393: arraylength
    //   1394: istore #5
    //   1396: iconst_0
    //   1397: istore #6
    //   1399: iload #6
    //   1401: iload #5
    //   1403: if_icmpge -> 1541
    //   1406: aload #4
    //   1408: iload #6
    //   1410: aaload
    //   1411: astore #7
    //   1413: aload #7
    //   1415: invokevirtual getModifiers : ()I
    //   1418: invokestatic isStatic : (I)Z
    //   1421: ifne -> 1431
    //   1424: goto -> 1534
    //   1427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1430: athrow
    //   1431: aload #7
    //   1433: invokevirtual getType : ()Ljava/lang/Class;
    //   1436: astore #8
    //   1438: aload #8
    //   1440: ifnull -> 1521
    //   1443: aload #8
    //   1445: invokevirtual isPrimitive : ()Z
    //   1448: ifne -> 1521
    //   1451: goto -> 1458
    //   1454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1457: athrow
    //   1458: aload #8
    //   1460: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1463: ifnull -> 1521
    //   1466: goto -> 1473
    //   1469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1472: athrow
    //   1473: aload #8
    //   1475: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1478: invokevirtual getName : ()Ljava/lang/String;
    //   1481: ifnull -> 1521
    //   1484: goto -> 1491
    //   1487: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1490: athrow
    //   1491: aload #8
    //   1493: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1496: invokevirtual getName : ()Ljava/lang/String;
    //   1499: sipush #25160
    //   1502: sipush #-7630
    //   1505: invokestatic a : (II)Ljava/lang/String;
    //   1508: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1511: ifne -> 1521
    //   1514: goto -> 1521
    //   1517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1520: athrow
    //   1521: aload #7
    //   1523: iconst_1
    //   1524: invokevirtual setAccessible : (Z)V
    //   1527: aload #7
    //   1529: aconst_null
    //   1530: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1533: pop
    //   1534: iinc #6, 1
    //   1537: iload_2
    //   1538: ifeq -> 1399
    //   1541: sipush #25168
    //   1544: sipush #-2064
    //   1547: invokestatic a : (II)Ljava/lang/String;
    //   1550: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1553: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1556: astore #4
    //   1558: aload #4
    //   1560: arraylength
    //   1561: istore #5
    //   1563: iconst_0
    //   1564: istore #6
    //   1566: iload #6
    //   1568: iload #5
    //   1570: if_icmpge -> 1706
    //   1573: aload #4
    //   1575: iload #6
    //   1577: aaload
    //   1578: astore #7
    //   1580: aload #7
    //   1582: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1585: pop
    //   1586: aload #7
    //   1588: invokevirtual getModifiers : ()I
    //   1591: invokestatic isStatic : (I)Z
    //   1594: ifeq -> 1692
    //   1597: aload #7
    //   1599: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1602: arraylength
    //   1603: iconst_2
    //   1604: if_icmpne -> 1692
    //   1607: goto -> 1614
    //   1610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1613: athrow
    //   1614: aload #7
    //   1616: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1619: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1622: if_acmpne -> 1692
    //   1625: goto -> 1632
    //   1628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1631: athrow
    //   1632: aload #7
    //   1634: iconst_1
    //   1635: invokevirtual setAccessible : (Z)V
    //   1638: aload #7
    //   1640: aconst_null
    //   1641: iconst_2
    //   1642: anewarray java/lang/Object
    //   1645: dup
    //   1646: iconst_0
    //   1647: aload_0
    //   1648: aastore
    //   1649: dup
    //   1650: iconst_1
    //   1651: aload_1
    //   1652: ifnonnull -> 1670
    //   1655: goto -> 1662
    //   1658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1661: athrow
    //   1662: aload_1
    //   1663: goto -> 1677
    //   1666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1669: athrow
    //   1670: aload_1
    //   1671: checkcast [B
    //   1674: invokevirtual clone : ()Ljava/lang/Object;
    //   1677: aastore
    //   1678: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1681: checkcast java/lang/Boolean
    //   1684: invokevirtual booleanValue : ()Z
    //   1687: istore_3
    //   1688: iload_2
    //   1689: ifeq -> 1706
    //   1692: iinc #6, 1
    //   1695: iload_2
    //   1696: ifeq -> 1566
    //   1699: goto -> 1706
    //   1702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1705: athrow
    //   1706: goto -> 2047
    //   1709: sipush #25163
    //   1712: sipush #975
    //   1715: invokestatic a : (II)Ljava/lang/String;
    //   1718: iconst_1
    //   1719: ldc burp/Zzxa
    //   1721: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1724: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1727: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1730: astore #4
    //   1732: aload #4
    //   1734: arraylength
    //   1735: istore #5
    //   1737: iconst_0
    //   1738: istore #6
    //   1740: iload #6
    //   1742: iload #5
    //   1744: if_icmpge -> 1882
    //   1747: aload #4
    //   1749: iload #6
    //   1751: aaload
    //   1752: astore #7
    //   1754: aload #7
    //   1756: invokevirtual getModifiers : ()I
    //   1759: invokestatic isStatic : (I)Z
    //   1762: ifne -> 1772
    //   1765: goto -> 1875
    //   1768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1771: athrow
    //   1772: aload #7
    //   1774: invokevirtual getType : ()Ljava/lang/Class;
    //   1777: astore #8
    //   1779: aload #8
    //   1781: ifnull -> 1862
    //   1784: aload #8
    //   1786: invokevirtual isPrimitive : ()Z
    //   1789: ifne -> 1862
    //   1792: goto -> 1799
    //   1795: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1798: athrow
    //   1799: aload #8
    //   1801: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1804: ifnull -> 1862
    //   1807: goto -> 1814
    //   1810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1813: athrow
    //   1814: aload #8
    //   1816: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1819: invokevirtual getName : ()Ljava/lang/String;
    //   1822: ifnull -> 1862
    //   1825: goto -> 1832
    //   1828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1831: athrow
    //   1832: aload #8
    //   1834: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1837: invokevirtual getName : ()Ljava/lang/String;
    //   1840: sipush #25160
    //   1843: sipush #-7630
    //   1846: invokestatic a : (II)Ljava/lang/String;
    //   1849: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1852: ifne -> 1862
    //   1855: goto -> 1862
    //   1858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1861: athrow
    //   1862: aload #7
    //   1864: iconst_1
    //   1865: invokevirtual setAccessible : (Z)V
    //   1868: aload #7
    //   1870: aconst_null
    //   1871: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1874: pop
    //   1875: iinc #6, 1
    //   1878: iload_2
    //   1879: ifeq -> 1740
    //   1882: sipush #25180
    //   1885: sipush #32163
    //   1888: invokestatic a : (II)Ljava/lang/String;
    //   1891: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1894: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1897: astore #4
    //   1899: aload #4
    //   1901: arraylength
    //   1902: istore #5
    //   1904: iconst_0
    //   1905: istore #6
    //   1907: iload #6
    //   1909: iload #5
    //   1911: if_icmpge -> 2047
    //   1914: aload #4
    //   1916: iload #6
    //   1918: aaload
    //   1919: astore #7
    //   1921: aload #7
    //   1923: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1926: pop
    //   1927: aload #7
    //   1929: invokevirtual getModifiers : ()I
    //   1932: invokestatic isStatic : (I)Z
    //   1935: ifeq -> 2033
    //   1938: aload #7
    //   1940: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1943: arraylength
    //   1944: iconst_2
    //   1945: if_icmpne -> 2033
    //   1948: goto -> 1955
    //   1951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1954: athrow
    //   1955: aload #7
    //   1957: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1960: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1963: if_acmpne -> 2033
    //   1966: goto -> 1973
    //   1969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1972: athrow
    //   1973: aload #7
    //   1975: iconst_1
    //   1976: invokevirtual setAccessible : (Z)V
    //   1979: aload #7
    //   1981: aconst_null
    //   1982: iconst_2
    //   1983: anewarray java/lang/Object
    //   1986: dup
    //   1987: iconst_0
    //   1988: aload_0
    //   1989: aastore
    //   1990: dup
    //   1991: iconst_1
    //   1992: aload_1
    //   1993: ifnonnull -> 2011
    //   1996: goto -> 2003
    //   1999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2002: athrow
    //   2003: aload_1
    //   2004: goto -> 2018
    //   2007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2010: athrow
    //   2011: aload_1
    //   2012: checkcast [B
    //   2015: invokevirtual clone : ()Ljava/lang/Object;
    //   2018: aastore
    //   2019: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2022: checkcast java/lang/Boolean
    //   2025: invokevirtual booleanValue : ()Z
    //   2028: istore_3
    //   2029: iload_2
    //   2030: ifeq -> 2047
    //   2033: iinc #6, 1
    //   2036: iload_2
    //   2037: ifeq -> 1907
    //   2040: goto -> 2047
    //   2043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2046: athrow
    //   2047: iload_3
    //   2048: ifeq -> 2053
    //   2051: iload_3
    //   2052: ireturn
    //   2053: getstatic burp/Zt7k.ZH : Ljava/lang/String;
    //   2056: getstatic burp/Zrct.ZV : Ljava/lang/Object;
    //   2059: checkcast java/math/BigInteger
    //   2062: invokevirtual intValue : ()I
    //   2065: bipush #32
    //   2067: irem
    //   2068: invokestatic abs : (I)I
    //   2071: invokevirtual charAt : (I)C
    //   2074: getstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   2077: getstatic burp/Zeqw.ZV : Ljava/lang/Object;
    //   2080: checkcast java/math/BigInteger
    //   2083: invokevirtual intValue : ()I
    //   2086: bipush #32
    //   2088: irem
    //   2089: invokestatic abs : (I)I
    //   2092: invokevirtual charAt : (I)C
    //   2095: if_icmpgt -> 2440
    //   2098: sipush #25173
    //   2101: sipush #18034
    //   2104: invokestatic a : (II)Ljava/lang/String;
    //   2107: iconst_1
    //   2108: ldc burp/Zst7
    //   2110: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2113: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2116: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2119: astore #4
    //   2121: aload #4
    //   2123: arraylength
    //   2124: istore #5
    //   2126: iconst_0
    //   2127: istore #6
    //   2129: iload #6
    //   2131: iload #5
    //   2133: if_icmpge -> 2271
    //   2136: aload #4
    //   2138: iload #6
    //   2140: aaload
    //   2141: astore #7
    //   2143: aload #7
    //   2145: invokevirtual getModifiers : ()I
    //   2148: invokestatic isStatic : (I)Z
    //   2151: ifne -> 2161
    //   2154: goto -> 2264
    //   2157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2160: athrow
    //   2161: aload #7
    //   2163: invokevirtual getType : ()Ljava/lang/Class;
    //   2166: astore #8
    //   2168: aload #8
    //   2170: ifnull -> 2251
    //   2173: aload #8
    //   2175: invokevirtual isPrimitive : ()Z
    //   2178: ifne -> 2251
    //   2181: goto -> 2188
    //   2184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2187: athrow
    //   2188: aload #8
    //   2190: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2193: ifnull -> 2251
    //   2196: goto -> 2203
    //   2199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2202: athrow
    //   2203: aload #8
    //   2205: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2208: invokevirtual getName : ()Ljava/lang/String;
    //   2211: ifnull -> 2251
    //   2214: goto -> 2221
    //   2217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2220: athrow
    //   2221: aload #8
    //   2223: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2226: invokevirtual getName : ()Ljava/lang/String;
    //   2229: sipush #25160
    //   2232: sipush #-7630
    //   2235: invokestatic a : (II)Ljava/lang/String;
    //   2238: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2241: ifne -> 2251
    //   2244: goto -> 2251
    //   2247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2250: athrow
    //   2251: aload #7
    //   2253: iconst_1
    //   2254: invokevirtual setAccessible : (Z)V
    //   2257: aload #7
    //   2259: aconst_null
    //   2260: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2263: pop
    //   2264: iinc #6, 1
    //   2267: iload_2
    //   2268: ifeq -> 2129
    //   2271: sipush #25174
    //   2274: sipush #-18168
    //   2277: invokestatic a : (II)Ljava/lang/String;
    //   2280: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2283: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2286: astore #4
    //   2288: aload #4
    //   2290: arraylength
    //   2291: istore #5
    //   2293: iconst_0
    //   2294: istore #6
    //   2296: iload #6
    //   2298: iload #5
    //   2300: if_icmpge -> 2436
    //   2303: aload #4
    //   2305: iload #6
    //   2307: aaload
    //   2308: astore #7
    //   2310: aload #7
    //   2312: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2315: pop
    //   2316: aload #7
    //   2318: invokevirtual getModifiers : ()I
    //   2321: invokestatic isStatic : (I)Z
    //   2324: ifeq -> 2422
    //   2327: aload #7
    //   2329: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2332: arraylength
    //   2333: iconst_2
    //   2334: if_icmpne -> 2422
    //   2337: goto -> 2344
    //   2340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2343: athrow
    //   2344: aload #7
    //   2346: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2349: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2352: if_acmpne -> 2422
    //   2355: goto -> 2362
    //   2358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2361: athrow
    //   2362: aload #7
    //   2364: iconst_1
    //   2365: invokevirtual setAccessible : (Z)V
    //   2368: aload #7
    //   2370: aconst_null
    //   2371: iconst_2
    //   2372: anewarray java/lang/Object
    //   2375: dup
    //   2376: iconst_0
    //   2377: aload_0
    //   2378: aastore
    //   2379: dup
    //   2380: iconst_1
    //   2381: aload_1
    //   2382: ifnonnull -> 2400
    //   2385: goto -> 2392
    //   2388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2391: athrow
    //   2392: aload_1
    //   2393: goto -> 2407
    //   2396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2399: athrow
    //   2400: aload_1
    //   2401: checkcast [B
    //   2404: invokevirtual clone : ()Ljava/lang/Object;
    //   2407: aastore
    //   2408: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2411: checkcast java/lang/Boolean
    //   2414: invokevirtual booleanValue : ()Z
    //   2417: istore_3
    //   2418: iload_2
    //   2419: ifeq -> 2436
    //   2422: iinc #6, 1
    //   2425: iload_2
    //   2426: ifeq -> 2296
    //   2429: goto -> 2436
    //   2432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2435: athrow
    //   2436: iload_2
    //   2437: ifeq -> 2778
    //   2440: sipush #25162
    //   2443: sipush #22007
    //   2446: invokestatic a : (II)Ljava/lang/String;
    //   2449: iconst_1
    //   2450: ldc burp/Zbzj
    //   2452: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2455: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2458: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2461: astore #4
    //   2463: aload #4
    //   2465: arraylength
    //   2466: istore #5
    //   2468: iconst_0
    //   2469: istore #6
    //   2471: iload #6
    //   2473: iload #5
    //   2475: if_icmpge -> 2613
    //   2478: aload #4
    //   2480: iload #6
    //   2482: aaload
    //   2483: astore #7
    //   2485: aload #7
    //   2487: invokevirtual getModifiers : ()I
    //   2490: invokestatic isStatic : (I)Z
    //   2493: ifne -> 2503
    //   2496: goto -> 2606
    //   2499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2502: athrow
    //   2503: aload #7
    //   2505: invokevirtual getType : ()Ljava/lang/Class;
    //   2508: astore #8
    //   2510: aload #8
    //   2512: ifnull -> 2593
    //   2515: aload #8
    //   2517: invokevirtual isPrimitive : ()Z
    //   2520: ifne -> 2593
    //   2523: goto -> 2530
    //   2526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2529: athrow
    //   2530: aload #8
    //   2532: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2535: ifnull -> 2593
    //   2538: goto -> 2545
    //   2541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2544: athrow
    //   2545: aload #8
    //   2547: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2550: invokevirtual getName : ()Ljava/lang/String;
    //   2553: ifnull -> 2593
    //   2556: goto -> 2563
    //   2559: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2562: athrow
    //   2563: aload #8
    //   2565: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2568: invokevirtual getName : ()Ljava/lang/String;
    //   2571: sipush #25160
    //   2574: sipush #-7630
    //   2577: invokestatic a : (II)Ljava/lang/String;
    //   2580: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2583: ifne -> 2593
    //   2586: goto -> 2593
    //   2589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2592: athrow
    //   2593: aload #7
    //   2595: iconst_1
    //   2596: invokevirtual setAccessible : (Z)V
    //   2599: aload #7
    //   2601: aconst_null
    //   2602: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2605: pop
    //   2606: iinc #6, 1
    //   2609: iload_2
    //   2610: ifeq -> 2471
    //   2613: sipush #25161
    //   2616: sipush #3796
    //   2619: invokestatic a : (II)Ljava/lang/String;
    //   2622: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2625: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2628: astore #4
    //   2630: aload #4
    //   2632: arraylength
    //   2633: istore #5
    //   2635: iconst_0
    //   2636: istore #6
    //   2638: iload #6
    //   2640: iload #5
    //   2642: if_icmpge -> 2778
    //   2645: aload #4
    //   2647: iload #6
    //   2649: aaload
    //   2650: astore #7
    //   2652: aload #7
    //   2654: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2657: pop
    //   2658: aload #7
    //   2660: invokevirtual getModifiers : ()I
    //   2663: invokestatic isStatic : (I)Z
    //   2666: ifeq -> 2764
    //   2669: aload #7
    //   2671: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2674: arraylength
    //   2675: iconst_2
    //   2676: if_icmpne -> 2764
    //   2679: goto -> 2686
    //   2682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2685: athrow
    //   2686: aload #7
    //   2688: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2691: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2694: if_acmpne -> 2764
    //   2697: goto -> 2704
    //   2700: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2703: athrow
    //   2704: aload #7
    //   2706: iconst_1
    //   2707: invokevirtual setAccessible : (Z)V
    //   2710: aload #7
    //   2712: aconst_null
    //   2713: iconst_2
    //   2714: anewarray java/lang/Object
    //   2717: dup
    //   2718: iconst_0
    //   2719: aload_0
    //   2720: aastore
    //   2721: dup
    //   2722: iconst_1
    //   2723: aload_1
    //   2724: ifnonnull -> 2742
    //   2727: goto -> 2734
    //   2730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2733: athrow
    //   2734: aload_1
    //   2735: goto -> 2749
    //   2738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2741: athrow
    //   2742: aload_1
    //   2743: checkcast [B
    //   2746: invokevirtual clone : ()Ljava/lang/Object;
    //   2749: aastore
    //   2750: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2753: checkcast java/lang/Boolean
    //   2756: invokevirtual booleanValue : ()Z
    //   2759: istore_3
    //   2760: iload_2
    //   2761: ifeq -> 2778
    //   2764: iinc #6, 1
    //   2767: iload_2
    //   2768: ifeq -> 2638
    //   2771: goto -> 2778
    //   2774: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2777: athrow
    //   2778: iload_3
    //   2779: ifeq -> 2784
    //   2782: iload_3
    //   2783: ireturn
    //   2784: getstatic burp/Ztdg.ZS : Ljava/lang/String;
    //   2787: getstatic burp/Zlhu.ZJ : Ljava/lang/Object;
    //   2790: checkcast java/math/BigInteger
    //   2793: invokevirtual intValue : ()I
    //   2796: bipush #32
    //   2798: irem
    //   2799: invokestatic abs : (I)I
    //   2802: invokevirtual charAt : (I)C
    //   2805: getstatic burp/Zm14.ZE : Ljava/lang/String;
    //   2808: getstatic burp/Zrp3.Zd : Ljava/lang/Object;
    //   2811: checkcast java/math/BigInteger
    //   2814: invokevirtual intValue : ()I
    //   2817: bipush #32
    //   2819: irem
    //   2820: invokestatic abs : (I)I
    //   2823: invokevirtual charAt : (I)C
    //   2826: if_icmpgt -> 3171
    //   2829: sipush #25170
    //   2832: sipush #29192
    //   2835: invokestatic a : (II)Ljava/lang/String;
    //   2838: iconst_1
    //   2839: ldc burp/Zmt7
    //   2841: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2844: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2847: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2850: astore #4
    //   2852: aload #4
    //   2854: arraylength
    //   2855: istore #5
    //   2857: iconst_0
    //   2858: istore #6
    //   2860: iload #6
    //   2862: iload #5
    //   2864: if_icmpge -> 3002
    //   2867: aload #4
    //   2869: iload #6
    //   2871: aaload
    //   2872: astore #7
    //   2874: aload #7
    //   2876: invokevirtual getModifiers : ()I
    //   2879: invokestatic isStatic : (I)Z
    //   2882: ifne -> 2892
    //   2885: goto -> 2995
    //   2888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2891: athrow
    //   2892: aload #7
    //   2894: invokevirtual getType : ()Ljava/lang/Class;
    //   2897: astore #8
    //   2899: aload #8
    //   2901: ifnull -> 2982
    //   2904: aload #8
    //   2906: invokevirtual isPrimitive : ()Z
    //   2909: ifne -> 2982
    //   2912: goto -> 2919
    //   2915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2918: athrow
    //   2919: aload #8
    //   2921: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2924: ifnull -> 2982
    //   2927: goto -> 2934
    //   2930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2933: athrow
    //   2934: aload #8
    //   2936: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2939: invokevirtual getName : ()Ljava/lang/String;
    //   2942: ifnull -> 2982
    //   2945: goto -> 2952
    //   2948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2951: athrow
    //   2952: aload #8
    //   2954: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2957: invokevirtual getName : ()Ljava/lang/String;
    //   2960: sipush #25160
    //   2963: sipush #-7630
    //   2966: invokestatic a : (II)Ljava/lang/String;
    //   2969: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2972: ifne -> 2982
    //   2975: goto -> 2982
    //   2978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2981: athrow
    //   2982: aload #7
    //   2984: iconst_1
    //   2985: invokevirtual setAccessible : (Z)V
    //   2988: aload #7
    //   2990: aconst_null
    //   2991: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2994: pop
    //   2995: iinc #6, 1
    //   2998: iload_2
    //   2999: ifeq -> 2860
    //   3002: sipush #25183
    //   3005: sipush #28710
    //   3008: invokestatic a : (II)Ljava/lang/String;
    //   3011: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3014: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3017: astore #4
    //   3019: aload #4
    //   3021: arraylength
    //   3022: istore #5
    //   3024: iconst_0
    //   3025: istore #6
    //   3027: iload #6
    //   3029: iload #5
    //   3031: if_icmpge -> 3167
    //   3034: aload #4
    //   3036: iload #6
    //   3038: aaload
    //   3039: astore #7
    //   3041: aload #7
    //   3043: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3046: pop
    //   3047: aload #7
    //   3049: invokevirtual getModifiers : ()I
    //   3052: invokestatic isStatic : (I)Z
    //   3055: ifeq -> 3153
    //   3058: aload #7
    //   3060: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3063: arraylength
    //   3064: iconst_2
    //   3065: if_icmpne -> 3153
    //   3068: goto -> 3075
    //   3071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3074: athrow
    //   3075: aload #7
    //   3077: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3080: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3083: if_acmpne -> 3153
    //   3086: goto -> 3093
    //   3089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3092: athrow
    //   3093: aload #7
    //   3095: iconst_1
    //   3096: invokevirtual setAccessible : (Z)V
    //   3099: aload #7
    //   3101: aconst_null
    //   3102: iconst_2
    //   3103: anewarray java/lang/Object
    //   3106: dup
    //   3107: iconst_0
    //   3108: aload_0
    //   3109: aastore
    //   3110: dup
    //   3111: iconst_1
    //   3112: aload_1
    //   3113: ifnonnull -> 3131
    //   3116: goto -> 3123
    //   3119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3122: athrow
    //   3123: aload_1
    //   3124: goto -> 3138
    //   3127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3130: athrow
    //   3131: aload_1
    //   3132: checkcast [B
    //   3135: invokevirtual clone : ()Ljava/lang/Object;
    //   3138: aastore
    //   3139: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3142: checkcast java/lang/Boolean
    //   3145: invokevirtual booleanValue : ()Z
    //   3148: istore_3
    //   3149: iload_2
    //   3150: ifeq -> 3167
    //   3153: iinc #6, 1
    //   3156: iload_2
    //   3157: ifeq -> 3027
    //   3160: goto -> 3167
    //   3163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3166: athrow
    //   3167: iload_2
    //   3168: ifeq -> 3509
    //   3171: sipush #25177
    //   3174: sipush #-31261
    //   3177: invokestatic a : (II)Ljava/lang/String;
    //   3180: iconst_1
    //   3181: ldc burp/Zl5
    //   3183: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3186: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3189: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3192: astore #4
    //   3194: aload #4
    //   3196: arraylength
    //   3197: istore #5
    //   3199: iconst_0
    //   3200: istore #6
    //   3202: iload #6
    //   3204: iload #5
    //   3206: if_icmpge -> 3344
    //   3209: aload #4
    //   3211: iload #6
    //   3213: aaload
    //   3214: astore #7
    //   3216: aload #7
    //   3218: invokevirtual getModifiers : ()I
    //   3221: invokestatic isStatic : (I)Z
    //   3224: ifne -> 3234
    //   3227: goto -> 3337
    //   3230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3233: athrow
    //   3234: aload #7
    //   3236: invokevirtual getType : ()Ljava/lang/Class;
    //   3239: astore #8
    //   3241: aload #8
    //   3243: ifnull -> 3324
    //   3246: aload #8
    //   3248: invokevirtual isPrimitive : ()Z
    //   3251: ifne -> 3324
    //   3254: goto -> 3261
    //   3257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3260: athrow
    //   3261: aload #8
    //   3263: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3266: ifnull -> 3324
    //   3269: goto -> 3276
    //   3272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3275: athrow
    //   3276: aload #8
    //   3278: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3281: invokevirtual getName : ()Ljava/lang/String;
    //   3284: ifnull -> 3324
    //   3287: goto -> 3294
    //   3290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3293: athrow
    //   3294: aload #8
    //   3296: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3299: invokevirtual getName : ()Ljava/lang/String;
    //   3302: sipush #25160
    //   3305: sipush #-7630
    //   3308: invokestatic a : (II)Ljava/lang/String;
    //   3311: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3314: ifne -> 3324
    //   3317: goto -> 3324
    //   3320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3323: athrow
    //   3324: aload #7
    //   3326: iconst_1
    //   3327: invokevirtual setAccessible : (Z)V
    //   3330: aload #7
    //   3332: aconst_null
    //   3333: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3336: pop
    //   3337: iinc #6, 1
    //   3340: iload_2
    //   3341: ifeq -> 3202
    //   3344: sipush #25179
    //   3347: sipush #-10595
    //   3350: invokestatic a : (II)Ljava/lang/String;
    //   3353: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3356: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3359: astore #4
    //   3361: aload #4
    //   3363: arraylength
    //   3364: istore #5
    //   3366: iconst_0
    //   3367: istore #6
    //   3369: iload #6
    //   3371: iload #5
    //   3373: if_icmpge -> 3509
    //   3376: aload #4
    //   3378: iload #6
    //   3380: aaload
    //   3381: astore #7
    //   3383: aload #7
    //   3385: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3388: pop
    //   3389: aload #7
    //   3391: invokevirtual getModifiers : ()I
    //   3394: invokestatic isStatic : (I)Z
    //   3397: ifeq -> 3495
    //   3400: aload #7
    //   3402: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3405: arraylength
    //   3406: iconst_2
    //   3407: if_icmpne -> 3495
    //   3410: goto -> 3417
    //   3413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3416: athrow
    //   3417: aload #7
    //   3419: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3422: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3425: if_acmpne -> 3495
    //   3428: goto -> 3435
    //   3431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3434: athrow
    //   3435: aload #7
    //   3437: iconst_1
    //   3438: invokevirtual setAccessible : (Z)V
    //   3441: aload #7
    //   3443: aconst_null
    //   3444: iconst_2
    //   3445: anewarray java/lang/Object
    //   3448: dup
    //   3449: iconst_0
    //   3450: aload_0
    //   3451: aastore
    //   3452: dup
    //   3453: iconst_1
    //   3454: aload_1
    //   3455: ifnonnull -> 3473
    //   3458: goto -> 3465
    //   3461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3464: athrow
    //   3465: aload_1
    //   3466: goto -> 3480
    //   3469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3472: athrow
    //   3473: aload_1
    //   3474: checkcast [B
    //   3477: invokevirtual clone : ()Ljava/lang/Object;
    //   3480: aastore
    //   3481: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3484: checkcast java/lang/Boolean
    //   3487: invokevirtual booleanValue : ()Z
    //   3490: istore_3
    //   3491: iload_2
    //   3492: ifeq -> 3509
    //   3495: iinc #6, 1
    //   3498: iload_2
    //   3499: ifeq -> 3369
    //   3502: goto -> 3509
    //   3505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3508: athrow
    //   3509: iload_3
    //   3510: ifeq -> 3515
    //   3513: iload_3
    //   3514: ireturn
    //   3515: getstatic burp/Zms1.ZZ : Ljava/lang/String;
    //   3518: getstatic burp/Zro_.ZP : Ljava/lang/Object;
    //   3521: checkcast java/math/BigInteger
    //   3524: invokevirtual intValue : ()I
    //   3527: bipush #32
    //   3529: irem
    //   3530: invokestatic abs : (I)I
    //   3533: invokevirtual charAt : (I)C
    //   3536: getstatic burp/Zza3.ZU : Ljava/lang/String;
    //   3539: getstatic burp/Zecm.ZJ : Ljava/lang/Object;
    //   3542: checkcast java/math/BigInteger
    //   3545: invokevirtual intValue : ()I
    //   3548: bipush #32
    //   3550: irem
    //   3551: invokestatic abs : (I)I
    //   3554: invokevirtual charAt : (I)C
    //   3557: if_icmple -> 3902
    //   3560: sipush #25176
    //   3563: sipush #-17029
    //   3566: invokestatic a : (II)Ljava/lang/String;
    //   3569: iconst_1
    //   3570: ldc burp/Zgly
    //   3572: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3575: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3578: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3581: astore #4
    //   3583: aload #4
    //   3585: arraylength
    //   3586: istore #5
    //   3588: iconst_0
    //   3589: istore #6
    //   3591: iload #6
    //   3593: iload #5
    //   3595: if_icmpge -> 3733
    //   3598: aload #4
    //   3600: iload #6
    //   3602: aaload
    //   3603: astore #7
    //   3605: aload #7
    //   3607: invokevirtual getModifiers : ()I
    //   3610: invokestatic isStatic : (I)Z
    //   3613: ifne -> 3623
    //   3616: goto -> 3726
    //   3619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3622: athrow
    //   3623: aload #7
    //   3625: invokevirtual getType : ()Ljava/lang/Class;
    //   3628: astore #8
    //   3630: aload #8
    //   3632: ifnull -> 3713
    //   3635: aload #8
    //   3637: invokevirtual isPrimitive : ()Z
    //   3640: ifne -> 3713
    //   3643: goto -> 3650
    //   3646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3649: athrow
    //   3650: aload #8
    //   3652: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3655: ifnull -> 3713
    //   3658: goto -> 3665
    //   3661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3664: athrow
    //   3665: aload #8
    //   3667: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3670: invokevirtual getName : ()Ljava/lang/String;
    //   3673: ifnull -> 3713
    //   3676: goto -> 3683
    //   3679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3682: athrow
    //   3683: aload #8
    //   3685: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3688: invokevirtual getName : ()Ljava/lang/String;
    //   3691: sipush #25160
    //   3694: sipush #-7630
    //   3697: invokestatic a : (II)Ljava/lang/String;
    //   3700: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3703: ifne -> 3713
    //   3706: goto -> 3713
    //   3709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3712: athrow
    //   3713: aload #7
    //   3715: iconst_1
    //   3716: invokevirtual setAccessible : (Z)V
    //   3719: aload #7
    //   3721: aconst_null
    //   3722: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3725: pop
    //   3726: iinc #6, 1
    //   3729: iload_2
    //   3730: ifeq -> 3591
    //   3733: sipush #25167
    //   3736: sipush #18022
    //   3739: invokestatic a : (II)Ljava/lang/String;
    //   3742: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3745: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3748: astore #4
    //   3750: aload #4
    //   3752: arraylength
    //   3753: istore #5
    //   3755: iconst_0
    //   3756: istore #6
    //   3758: iload #6
    //   3760: iload #5
    //   3762: if_icmpge -> 3898
    //   3765: aload #4
    //   3767: iload #6
    //   3769: aaload
    //   3770: astore #7
    //   3772: aload #7
    //   3774: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3777: pop
    //   3778: aload #7
    //   3780: invokevirtual getModifiers : ()I
    //   3783: invokestatic isStatic : (I)Z
    //   3786: ifeq -> 3884
    //   3789: aload #7
    //   3791: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3794: arraylength
    //   3795: iconst_2
    //   3796: if_icmpne -> 3884
    //   3799: goto -> 3806
    //   3802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3805: athrow
    //   3806: aload #7
    //   3808: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3811: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3814: if_acmpne -> 3884
    //   3817: goto -> 3824
    //   3820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3823: athrow
    //   3824: aload #7
    //   3826: iconst_1
    //   3827: invokevirtual setAccessible : (Z)V
    //   3830: aload #7
    //   3832: aconst_null
    //   3833: iconst_2
    //   3834: anewarray java/lang/Object
    //   3837: dup
    //   3838: iconst_0
    //   3839: aload_0
    //   3840: aastore
    //   3841: dup
    //   3842: iconst_1
    //   3843: aload_1
    //   3844: ifnonnull -> 3862
    //   3847: goto -> 3854
    //   3850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3853: athrow
    //   3854: aload_1
    //   3855: goto -> 3869
    //   3858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3861: athrow
    //   3862: aload_1
    //   3863: checkcast [B
    //   3866: invokevirtual clone : ()Ljava/lang/Object;
    //   3869: aastore
    //   3870: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3873: checkcast java/lang/Boolean
    //   3876: invokevirtual booleanValue : ()Z
    //   3879: istore_3
    //   3880: iload_2
    //   3881: ifeq -> 3898
    //   3884: iinc #6, 1
    //   3887: iload_2
    //   3888: ifeq -> 3758
    //   3891: goto -> 3898
    //   3894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3897: athrow
    //   3898: iload_2
    //   3899: ifeq -> 4240
    //   3902: sipush #25171
    //   3905: sipush #-9000
    //   3908: invokestatic a : (II)Ljava/lang/String;
    //   3911: iconst_1
    //   3912: ldc burp/Zx4u
    //   3914: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3917: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3920: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3923: astore #4
    //   3925: aload #4
    //   3927: arraylength
    //   3928: istore #5
    //   3930: iconst_0
    //   3931: istore #6
    //   3933: iload #6
    //   3935: iload #5
    //   3937: if_icmpge -> 4075
    //   3940: aload #4
    //   3942: iload #6
    //   3944: aaload
    //   3945: astore #7
    //   3947: aload #7
    //   3949: invokevirtual getModifiers : ()I
    //   3952: invokestatic isStatic : (I)Z
    //   3955: ifne -> 3965
    //   3958: goto -> 4068
    //   3961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3964: athrow
    //   3965: aload #7
    //   3967: invokevirtual getType : ()Ljava/lang/Class;
    //   3970: astore #8
    //   3972: aload #8
    //   3974: ifnull -> 4055
    //   3977: aload #8
    //   3979: invokevirtual isPrimitive : ()Z
    //   3982: ifne -> 4055
    //   3985: goto -> 3992
    //   3988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3991: athrow
    //   3992: aload #8
    //   3994: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3997: ifnull -> 4055
    //   4000: goto -> 4007
    //   4003: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4006: athrow
    //   4007: aload #8
    //   4009: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4012: invokevirtual getName : ()Ljava/lang/String;
    //   4015: ifnull -> 4055
    //   4018: goto -> 4025
    //   4021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4024: athrow
    //   4025: aload #8
    //   4027: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4030: invokevirtual getName : ()Ljava/lang/String;
    //   4033: sipush #25160
    //   4036: sipush #-7630
    //   4039: invokestatic a : (II)Ljava/lang/String;
    //   4042: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4045: ifne -> 4055
    //   4048: goto -> 4055
    //   4051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4054: athrow
    //   4055: aload #7
    //   4057: iconst_1
    //   4058: invokevirtual setAccessible : (Z)V
    //   4061: aload #7
    //   4063: aconst_null
    //   4064: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4067: pop
    //   4068: iinc #6, 1
    //   4071: iload_2
    //   4072: ifeq -> 3933
    //   4075: sipush #25172
    //   4078: sipush #20235
    //   4081: invokestatic a : (II)Ljava/lang/String;
    //   4084: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4087: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4090: astore #4
    //   4092: aload #4
    //   4094: arraylength
    //   4095: istore #5
    //   4097: iconst_0
    //   4098: istore #6
    //   4100: iload #6
    //   4102: iload #5
    //   4104: if_icmpge -> 4240
    //   4107: aload #4
    //   4109: iload #6
    //   4111: aaload
    //   4112: astore #7
    //   4114: aload #7
    //   4116: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4119: pop
    //   4120: aload #7
    //   4122: invokevirtual getModifiers : ()I
    //   4125: invokestatic isStatic : (I)Z
    //   4128: ifeq -> 4226
    //   4131: aload #7
    //   4133: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4136: arraylength
    //   4137: iconst_2
    //   4138: if_icmpne -> 4226
    //   4141: goto -> 4148
    //   4144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4147: athrow
    //   4148: aload #7
    //   4150: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4153: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4156: if_acmpne -> 4226
    //   4159: goto -> 4166
    //   4162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4165: athrow
    //   4166: aload #7
    //   4168: iconst_1
    //   4169: invokevirtual setAccessible : (Z)V
    //   4172: aload #7
    //   4174: aconst_null
    //   4175: iconst_2
    //   4176: anewarray java/lang/Object
    //   4179: dup
    //   4180: iconst_0
    //   4181: aload_0
    //   4182: aastore
    //   4183: dup
    //   4184: iconst_1
    //   4185: aload_1
    //   4186: ifnonnull -> 4204
    //   4189: goto -> 4196
    //   4192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4195: athrow
    //   4196: aload_1
    //   4197: goto -> 4211
    //   4200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4203: athrow
    //   4204: aload_1
    //   4205: checkcast [B
    //   4208: invokevirtual clone : ()Ljava/lang/Object;
    //   4211: aastore
    //   4212: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4215: checkcast java/lang/Boolean
    //   4218: invokevirtual booleanValue : ()Z
    //   4221: istore_3
    //   4222: iload_2
    //   4223: ifeq -> 4240
    //   4226: iinc #6, 1
    //   4229: iload_2
    //   4230: ifeq -> 4100
    //   4233: goto -> 4240
    //   4236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4239: athrow
    //   4240: iload_3
    //   4241: ireturn
    //   4242: astore_3
    //   4243: new java/lang/Exception
    //   4246: dup
    //   4247: aload_3
    //   4248: invokevirtual getMessage : ()Ljava/lang/String;
    //   4251: invokespecial <init> : (Ljava/lang/String;)V
    //   4254: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2052	4242	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   600	624	627	java/lang/Throwable
    //   698	735	735	java/lang/Throwable
    //   739	760	760	java/lang/Throwable
    //   764	794	794	java/lang/Throwable
    //   1034	1048	1048	java/lang/Throwable
    //   1059	1072	1075	java/lang/Throwable
    //   1064	1087	1090	java/lang/Throwable
    //   1079	1105	1108	java/lang/Throwable
    //   1094	1135	1138	java/lang/Throwable
    //   1198	1225	1228	java/lang/Throwable
    //   1215	1246	1249	java/lang/Throwable
    //   1232	1276	1279	java/lang/Throwable
    //   1253	1287	1287	java/lang/Throwable
    //   1298	1314	1317	java/lang/Throwable
    //   1413	1427	1427	java/lang/Throwable
    //   1438	1451	1454	java/lang/Throwable
    //   1443	1466	1469	java/lang/Throwable
    //   1458	1484	1487	java/lang/Throwable
    //   1473	1514	1517	java/lang/Throwable
    //   1580	1607	1610	java/lang/Throwable
    //   1597	1625	1628	java/lang/Throwable
    //   1614	1655	1658	java/lang/Throwable
    //   1632	1666	1666	java/lang/Throwable
    //   1688	1699	1702	java/lang/Throwable
    //   1754	1768	1768	java/lang/Throwable
    //   1779	1792	1795	java/lang/Throwable
    //   1784	1807	1810	java/lang/Throwable
    //   1799	1825	1828	java/lang/Throwable
    //   1814	1855	1858	java/lang/Throwable
    //   1921	1948	1951	java/lang/Throwable
    //   1938	1966	1969	java/lang/Throwable
    //   1955	1996	1999	java/lang/Throwable
    //   1973	2007	2007	java/lang/Throwable
    //   2029	2040	2043	java/lang/Throwable
    //   2053	2783	4242	java/lang/Throwable
    //   2143	2157	2157	java/lang/Throwable
    //   2168	2181	2184	java/lang/Throwable
    //   2173	2196	2199	java/lang/Throwable
    //   2188	2214	2217	java/lang/Throwable
    //   2203	2244	2247	java/lang/Throwable
    //   2310	2337	2340	java/lang/Throwable
    //   2327	2355	2358	java/lang/Throwable
    //   2344	2385	2388	java/lang/Throwable
    //   2362	2396	2396	java/lang/Throwable
    //   2418	2429	2432	java/lang/Throwable
    //   2485	2499	2499	java/lang/Throwable
    //   2510	2523	2526	java/lang/Throwable
    //   2515	2538	2541	java/lang/Throwable
    //   2530	2556	2559	java/lang/Throwable
    //   2545	2586	2589	java/lang/Throwable
    //   2652	2679	2682	java/lang/Throwable
    //   2669	2697	2700	java/lang/Throwable
    //   2686	2727	2730	java/lang/Throwable
    //   2704	2738	2738	java/lang/Throwable
    //   2760	2771	2774	java/lang/Throwable
    //   2784	3514	4242	java/lang/Throwable
    //   2874	2888	2888	java/lang/Throwable
    //   2899	2912	2915	java/lang/Throwable
    //   2904	2927	2930	java/lang/Throwable
    //   2919	2945	2948	java/lang/Throwable
    //   2934	2975	2978	java/lang/Throwable
    //   3041	3068	3071	java/lang/Throwable
    //   3058	3086	3089	java/lang/Throwable
    //   3075	3116	3119	java/lang/Throwable
    //   3093	3127	3127	java/lang/Throwable
    //   3149	3160	3163	java/lang/Throwable
    //   3216	3230	3230	java/lang/Throwable
    //   3241	3254	3257	java/lang/Throwable
    //   3246	3269	3272	java/lang/Throwable
    //   3261	3287	3290	java/lang/Throwable
    //   3276	3317	3320	java/lang/Throwable
    //   3383	3410	3413	java/lang/Throwable
    //   3400	3428	3431	java/lang/Throwable
    //   3417	3458	3461	java/lang/Throwable
    //   3435	3469	3469	java/lang/Throwable
    //   3491	3502	3505	java/lang/Throwable
    //   3515	4241	4242	java/lang/Throwable
    //   3605	3619	3619	java/lang/Throwable
    //   3630	3643	3646	java/lang/Throwable
    //   3635	3658	3661	java/lang/Throwable
    //   3650	3676	3679	java/lang/Throwable
    //   3665	3706	3709	java/lang/Throwable
    //   3772	3799	3802	java/lang/Throwable
    //   3789	3817	3820	java/lang/Throwable
    //   3806	3847	3850	java/lang/Throwable
    //   3824	3858	3858	java/lang/Throwable
    //   3880	3891	3894	java/lang/Throwable
    //   3947	3961	3961	java/lang/Throwable
    //   3972	3985	3988	java/lang/Throwable
    //   3977	4000	4003	java/lang/Throwable
    //   3992	4018	4021	java/lang/Throwable
    //   4007	4048	4051	java/lang/Throwable
    //   4114	4141	4144	java/lang/Throwable
    //   4131	4159	4162	java/lang/Throwable
    //   4148	4189	4192	java/lang/Throwable
    //   4166	4200	4200	java/lang/Throwable
    //   4222	4233	4236	java/lang/Throwable
  }
  
  static void ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¾wÅÇ\\t0ð7ìQÐ\\t:ýnÑ4ôót\\t¬ÅË\\b@\\tÇ­ê3j·1·\\t*ïWÔc\I*\\t°î4\\tða\\fïY.ZÍ\\tøY\\rÏ¹5\\tåò®w»µÅß\\tJH[ ýqÃo µ(î±®ÖÊ&ì@ó©°-Ç\\f:©ªmÒ~ÎVKFAYê`\\tø \\r-Ï\5® ¸ÅEA¥JÖ\\fDÆIdVt5Ë,`ü¦ÅÂe\\tz5]Å\\b}wy\\tÒ-Hgh=t½\\tÞ·ÉßW.$8\\tx'ÍÍ@{s.U×\\t8éÌ{]VMôyqõ¹kz\\f<ðfN\\töb2±KÐýàÅl(N}·´ñ,qÂ±.&Ê8Áw¦Ð4#ÊÉ§í¯u\\tÈá¡)ê/(Ù[ËFècÄT'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #65
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'óØÊÍZj\\bàð¨ÝmÈo'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
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
    //   128: putstatic burp/Zg5.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg5.b : [Ljava/lang/String;
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
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #106
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #63
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #25175
    //   303: sipush #3484
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zg5.ZF : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #113
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-62
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-121
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-58
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-86
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-30
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #88
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: iconst_0
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #-82
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #-6
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #-16
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-82
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #105
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-86
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #97
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #-109
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-94
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #113
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #13
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #30
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #-29
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #60
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-38
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #48
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #8
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-87
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-95
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-3
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-78
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #96
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #108
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #25
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zg5.Zs : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x625A) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */