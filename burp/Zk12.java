package burp;

import java.math.BigInteger;

class Zk12 extends ClassLoader {
  static Object Zh;
  
  static String Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZP(Object paramObject) {
    Zxzz.ZT = a(-13367, -17625);
    Zxzz.ZM = new BigInteger(a(-13353, -27872));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ze6d.Zx.charAt(Math.abs(((BigInteger)Zlpj.Zc).intValue() % 32)) > Zef0.ZR.charAt(Math.abs(((BigInteger)Ze8m.Zm).intValue() % 32))) {
          try {
            Zess.Zb(Class.forName(a(-13362, 2659)));
            if (!bool)
              Zkk2.ZP(Class.forName(a(-13364, -21582))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkk2.ZP(Class.forName(a(-13364, -21582)));
    } catch (Throwable throwable) {}
  }
  
  static void ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZF(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs0_.Zu : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zlrm.ZM : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zz75.ZX : Ljava/lang/Object;
    //   22: getstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: bipush #8
    //   36: iadd
    //   37: bipush #6
    //   39: ishr
    //   40: iconst_1
    //   41: iadd
    //   42: bipush #16
    //   44: imul
    //   45: newarray int
    //   47: astore #5
    //   49: iconst_0
    //   50: istore #6
    //   52: iload #6
    //   54: aload_3
    //   55: arraylength
    //   56: if_icmpge -> 99
    //   59: aload_3
    //   60: iload #6
    //   62: baload
    //   63: sipush #255
    //   66: iand
    //   67: istore #7
    //   69: aload #5
    //   71: iload #6
    //   73: iconst_2
    //   74: ishr
    //   75: dup2
    //   76: iaload
    //   77: iload #7
    //   79: bipush #24
    //   81: iload #6
    //   83: iconst_4
    //   84: irem
    //   85: bipush #8
    //   87: imul
    //   88: isub
    //   89: ishl
    //   90: ior
    //   91: iastore
    //   92: iinc #6, 1
    //   95: iload_2
    //   96: ifeq -> 52
    //   99: aload #5
    //   101: iload #6
    //   103: iconst_2
    //   104: ishr
    //   105: dup2
    //   106: iaload
    //   107: sipush #128
    //   110: bipush #24
    //   112: iload #6
    //   114: iconst_4
    //   115: irem
    //   116: bipush #8
    //   118: imul
    //   119: isub
    //   120: ishl
    //   121: ior
    //   122: iastore
    //   123: aload #5
    //   125: aload #5
    //   127: arraylength
    //   128: iconst_1
    //   129: isub
    //   130: aload_3
    //   131: arraylength
    //   132: bipush #8
    //   134: imul
    //   135: iastore
    //   136: bipush #80
    //   138: newarray int
    //   140: astore #7
    //   142: ldc 1732584193
    //   144: istore #8
    //   146: ldc -271733879
    //   148: istore #9
    //   150: ldc -1732584194
    //   152: istore #10
    //   154: ldc 271733878
    //   156: istore #11
    //   158: ldc -1009589776
    //   160: istore #12
    //   162: iconst_0
    //   163: istore #6
    //   165: iload #6
    //   167: aload #5
    //   169: arraylength
    //   170: if_icmpge -> 492
    //   173: iload #8
    //   175: istore #13
    //   177: iload #9
    //   179: istore #14
    //   181: iload #10
    //   183: istore #15
    //   185: iload #11
    //   187: istore #16
    //   189: iload #12
    //   191: istore #17
    //   193: iconst_0
    //   194: istore #18
    //   196: iload #18
    //   198: bipush #80
    //   200: if_icmpge -> 450
    //   203: iload #18
    //   205: bipush #16
    //   207: if_icmpge -> 234
    //   210: aload #7
    //   212: iload #18
    //   214: aload #5
    //   216: iload #6
    //   218: iload #18
    //   220: iadd
    //   221: iaload
    //   222: iastore
    //   223: iload_2
    //   224: ifeq -> 289
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   233: athrow
    //   234: aload #7
    //   236: iload #18
    //   238: iconst_3
    //   239: isub
    //   240: iaload
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #8
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: aload #7
    //   252: iload #18
    //   254: bipush #14
    //   256: isub
    //   257: iaload
    //   258: ixor
    //   259: aload #7
    //   261: iload #18
    //   263: bipush #16
    //   265: isub
    //   266: iaload
    //   267: ixor
    //   268: istore #19
    //   270: iload #19
    //   272: iconst_1
    //   273: ishl
    //   274: iload #19
    //   276: bipush #31
    //   278: iushr
    //   279: ior
    //   280: istore #20
    //   282: aload #7
    //   284: iload #18
    //   286: iload #20
    //   288: iastore
    //   289: iload #8
    //   291: iconst_5
    //   292: ishl
    //   293: iload #8
    //   295: bipush #27
    //   297: iushr
    //   298: ior
    //   299: istore #19
    //   301: iload #19
    //   303: iload #12
    //   305: iadd
    //   306: aload #7
    //   308: iload #18
    //   310: iaload
    //   311: iadd
    //   312: iload #18
    //   314: bipush #20
    //   316: if_icmpge -> 342
    //   319: ldc 1518500249
    //   321: iload #9
    //   323: iload #10
    //   325: iand
    //   326: iload #9
    //   328: iconst_m1
    //   329: ixor
    //   330: iload #11
    //   332: iand
    //   333: ior
    //   334: iadd
    //   335: goto -> 412
    //   338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   341: athrow
    //   342: iload #18
    //   344: bipush #40
    //   346: if_icmpge -> 367
    //   349: ldc 1859775393
    //   351: iload #9
    //   353: iload #10
    //   355: ixor
    //   356: iload #11
    //   358: ixor
    //   359: iadd
    //   360: goto -> 412
    //   363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   366: athrow
    //   367: iload #18
    //   369: bipush #60
    //   371: if_icmpge -> 401
    //   374: ldc -1894007588
    //   376: iload #9
    //   378: iload #10
    //   380: iand
    //   381: iload #9
    //   383: iload #11
    //   385: iand
    //   386: ior
    //   387: iload #10
    //   389: iload #11
    //   391: iand
    //   392: ior
    //   393: iadd
    //   394: goto -> 412
    //   397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   400: athrow
    //   401: ldc -899497514
    //   403: iload #9
    //   405: iload #10
    //   407: ixor
    //   408: iload #11
    //   410: ixor
    //   411: iadd
    //   412: iadd
    //   413: istore #20
    //   415: iload #11
    //   417: istore #12
    //   419: iload #10
    //   421: istore #11
    //   423: iload #9
    //   425: bipush #30
    //   427: ishl
    //   428: iload #9
    //   430: iconst_2
    //   431: iushr
    //   432: ior
    //   433: istore #10
    //   435: iload #8
    //   437: istore #9
    //   439: iload #20
    //   441: istore #8
    //   443: iinc #18, 1
    //   446: iload_2
    //   447: ifeq -> 196
    //   450: iload #8
    //   452: iload #13
    //   454: iadd
    //   455: istore #8
    //   457: iload #9
    //   459: iload #14
    //   461: iadd
    //   462: istore #9
    //   464: iload #10
    //   466: iload #15
    //   468: iadd
    //   469: istore #10
    //   471: iload #11
    //   473: iload #16
    //   475: iadd
    //   476: istore #11
    //   478: iload #12
    //   480: iload #17
    //   482: iadd
    //   483: istore #12
    //   485: iinc #6, 16
    //   488: iload_2
    //   489: ifeq -> 165
    //   492: iconst_5
    //   493: newarray int
    //   495: dup
    //   496: iconst_0
    //   497: iload #8
    //   499: iastore
    //   500: dup
    //   501: iconst_1
    //   502: iload #9
    //   504: iastore
    //   505: dup
    //   506: iconst_2
    //   507: iload #10
    //   509: iastore
    //   510: dup
    //   511: iconst_3
    //   512: iload #11
    //   514: iastore
    //   515: dup
    //   516: iconst_4
    //   517: iload #12
    //   519: iastore
    //   520: astore #13
    //   522: bipush #20
    //   524: newarray byte
    //   526: astore #14
    //   528: iconst_0
    //   529: istore #15
    //   531: iload #15
    //   533: bipush #20
    //   535: if_icmpge -> 576
    //   538: aload #13
    //   540: iload #15
    //   542: iconst_4
    //   543: idiv
    //   544: iaload
    //   545: istore #16
    //   547: iconst_3
    //   548: iload #15
    //   550: iconst_4
    //   551: irem
    //   552: isub
    //   553: bipush #8
    //   555: imul
    //   556: istore #17
    //   558: aload #14
    //   560: iload #15
    //   562: iload #16
    //   564: iload #17
    //   566: iushr
    //   567: i2b
    //   568: bastore
    //   569: iinc #15, 1
    //   572: iload_2
    //   573: ifeq -> 531
    //   576: aload #14
    //   578: astore #4
    //   580: sipush #-13355
    //   583: new java/math/BigInteger
    //   586: dup
    //   587: aload #4
    //   589: invokespecial <init> : ([B)V
    //   592: invokevirtual abs : ()Ljava/math/BigInteger;
    //   595: putstatic burp/Ze64.ZW : Ljava/lang/Object;
    //   598: sipush #21077
    //   601: getstatic burp/Zs8y.ZG : Ljava/lang/Object;
    //   604: checkcast java/math/BigInteger
    //   607: getstatic burp/Zefo.ZW : Ljava/lang/Object;
    //   610: checkcast java/math/BigInteger
    //   613: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   616: putstatic burp/Ze69.ZH : Ljava/lang/Object;
    //   619: invokestatic a : (II)Ljava/lang/String;
    //   622: iconst_1
    //   623: ldc burp/Zr8s
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
    //   741: sipush #-13345
    //   744: sipush #2045
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
    //   780: ifeq -> 642
    //   783: sipush #-13350
    //   786: sipush #6427
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
    //   925: ifeq -> 942
    //   928: iinc #5, 1
    //   931: iload_2
    //   932: ifeq -> 806
    //   935: goto -> 942
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: iconst_0
    //   943: istore_3
    //   944: getstatic burp/Zrjg.Zl : Ljava/lang/String;
    //   947: getstatic burp/Zs8y.ZG : Ljava/lang/Object;
    //   950: checkcast java/math/BigInteger
    //   953: invokevirtual intValue : ()I
    //   956: bipush #32
    //   958: irem
    //   959: invokestatic abs : (I)I
    //   962: invokevirtual charAt : (I)C
    //   965: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   968: getstatic burp/Ztj5.Zj : Ljava/lang/Object;
    //   971: checkcast java/math/BigInteger
    //   974: invokevirtual intValue : ()I
    //   977: bipush #32
    //   979: irem
    //   980: invokestatic abs : (I)I
    //   983: invokevirtual charAt : (I)C
    //   986: if_icmpgt -> 1330
    //   989: sipush #-13361
    //   992: sipush #31384
    //   995: invokestatic a : (II)Ljava/lang/String;
    //   998: iconst_1
    //   999: ldc burp/Zb_u
    //   1001: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1004: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1007: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1010: astore #4
    //   1012: aload #4
    //   1014: arraylength
    //   1015: istore #5
    //   1017: iconst_0
    //   1018: istore #6
    //   1020: iload #6
    //   1022: iload #5
    //   1024: if_icmpge -> 1162
    //   1027: aload #4
    //   1029: iload #6
    //   1031: aaload
    //   1032: astore #7
    //   1034: aload #7
    //   1036: invokevirtual getModifiers : ()I
    //   1039: invokestatic isStatic : (I)Z
    //   1042: ifne -> 1052
    //   1045: goto -> 1155
    //   1048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1051: athrow
    //   1052: aload #7
    //   1054: invokevirtual getType : ()Ljava/lang/Class;
    //   1057: astore #8
    //   1059: aload #8
    //   1061: ifnull -> 1142
    //   1064: aload #8
    //   1066: invokevirtual isPrimitive : ()Z
    //   1069: ifne -> 1142
    //   1072: goto -> 1079
    //   1075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1078: athrow
    //   1079: aload #8
    //   1081: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1084: ifnull -> 1142
    //   1087: goto -> 1094
    //   1090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1093: athrow
    //   1094: aload #8
    //   1096: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1099: invokevirtual getName : ()Ljava/lang/String;
    //   1102: ifnull -> 1142
    //   1105: goto -> 1112
    //   1108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1111: athrow
    //   1112: aload #8
    //   1114: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1117: invokevirtual getName : ()Ljava/lang/String;
    //   1120: sipush #-13351
    //   1123: sipush #-29496
    //   1126: invokestatic a : (II)Ljava/lang/String;
    //   1129: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1132: ifne -> 1142
    //   1135: goto -> 1142
    //   1138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1141: athrow
    //   1142: aload #7
    //   1144: iconst_1
    //   1145: invokevirtual setAccessible : (Z)V
    //   1148: aload #7
    //   1150: aconst_null
    //   1151: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1154: pop
    //   1155: iinc #6, 1
    //   1158: iload_2
    //   1159: ifeq -> 1020
    //   1162: sipush #-13370
    //   1165: sipush #27519
    //   1168: invokestatic a : (II)Ljava/lang/String;
    //   1171: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1174: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1177: astore #4
    //   1179: aload #4
    //   1181: arraylength
    //   1182: istore #5
    //   1184: iconst_0
    //   1185: istore #6
    //   1187: iload #6
    //   1189: iload #5
    //   1191: if_icmpge -> 1327
    //   1194: aload #4
    //   1196: iload #6
    //   1198: aaload
    //   1199: astore #7
    //   1201: aload #7
    //   1203: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1206: pop
    //   1207: aload #7
    //   1209: invokevirtual getModifiers : ()I
    //   1212: invokestatic isStatic : (I)Z
    //   1215: ifeq -> 1313
    //   1218: aload #7
    //   1220: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1223: arraylength
    //   1224: iconst_2
    //   1225: if_icmpne -> 1313
    //   1228: goto -> 1235
    //   1231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1234: athrow
    //   1235: aload #7
    //   1237: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1240: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1243: if_acmpne -> 1313
    //   1246: goto -> 1253
    //   1249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1252: athrow
    //   1253: aload #7
    //   1255: iconst_1
    //   1256: invokevirtual setAccessible : (Z)V
    //   1259: aload #7
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
    //   1302: checkcast java/lang/Boolean
    //   1305: invokevirtual booleanValue : ()Z
    //   1308: istore_3
    //   1309: iload_2
    //   1310: ifeq -> 1327
    //   1313: iinc #6, 1
    //   1316: iload_2
    //   1317: ifeq -> 1187
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: goto -> 1668
    //   1330: sipush #-13368
    //   1333: sipush #-9189
    //   1336: invokestatic a : (II)Ljava/lang/String;
    //   1339: iconst_1
    //   1340: ldc burp/Zer
    //   1342: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1345: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1348: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1351: astore #4
    //   1353: aload #4
    //   1355: arraylength
    //   1356: istore #5
    //   1358: iconst_0
    //   1359: istore #6
    //   1361: iload #6
    //   1363: iload #5
    //   1365: if_icmpge -> 1503
    //   1368: aload #4
    //   1370: iload #6
    //   1372: aaload
    //   1373: astore #7
    //   1375: aload #7
    //   1377: invokevirtual getModifiers : ()I
    //   1380: invokestatic isStatic : (I)Z
    //   1383: ifne -> 1393
    //   1386: goto -> 1496
    //   1389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1392: athrow
    //   1393: aload #7
    //   1395: invokevirtual getType : ()Ljava/lang/Class;
    //   1398: astore #8
    //   1400: aload #8
    //   1402: ifnull -> 1483
    //   1405: aload #8
    //   1407: invokevirtual isPrimitive : ()Z
    //   1410: ifne -> 1483
    //   1413: goto -> 1420
    //   1416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1419: athrow
    //   1420: aload #8
    //   1422: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1425: ifnull -> 1483
    //   1428: goto -> 1435
    //   1431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1434: athrow
    //   1435: aload #8
    //   1437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1440: invokevirtual getName : ()Ljava/lang/String;
    //   1443: ifnull -> 1483
    //   1446: goto -> 1453
    //   1449: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1452: athrow
    //   1453: aload #8
    //   1455: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1458: invokevirtual getName : ()Ljava/lang/String;
    //   1461: sipush #-13351
    //   1464: sipush #-29496
    //   1467: invokestatic a : (II)Ljava/lang/String;
    //   1470: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1473: ifne -> 1483
    //   1476: goto -> 1483
    //   1479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1482: athrow
    //   1483: aload #7
    //   1485: iconst_1
    //   1486: invokevirtual setAccessible : (Z)V
    //   1489: aload #7
    //   1491: aconst_null
    //   1492: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1495: pop
    //   1496: iinc #6, 1
    //   1499: iload_2
    //   1500: ifeq -> 1361
    //   1503: sipush #-13374
    //   1506: sipush #-20731
    //   1509: invokestatic a : (II)Ljava/lang/String;
    //   1512: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1515: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1518: astore #4
    //   1520: aload #4
    //   1522: arraylength
    //   1523: istore #5
    //   1525: iconst_0
    //   1526: istore #6
    //   1528: iload #6
    //   1530: iload #5
    //   1532: if_icmpge -> 1668
    //   1535: aload #4
    //   1537: iload #6
    //   1539: aaload
    //   1540: astore #7
    //   1542: aload #7
    //   1544: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1547: pop
    //   1548: aload #7
    //   1550: invokevirtual getModifiers : ()I
    //   1553: invokestatic isStatic : (I)Z
    //   1556: ifeq -> 1654
    //   1559: aload #7
    //   1561: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1564: arraylength
    //   1565: iconst_2
    //   1566: if_icmpne -> 1654
    //   1569: goto -> 1576
    //   1572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1575: athrow
    //   1576: aload #7
    //   1578: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1581: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1584: if_acmpne -> 1654
    //   1587: goto -> 1594
    //   1590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1593: athrow
    //   1594: aload #7
    //   1596: iconst_1
    //   1597: invokevirtual setAccessible : (Z)V
    //   1600: aload #7
    //   1602: aconst_null
    //   1603: iconst_2
    //   1604: anewarray java/lang/Object
    //   1607: dup
    //   1608: iconst_0
    //   1609: aload_0
    //   1610: aastore
    //   1611: dup
    //   1612: iconst_1
    //   1613: aload_1
    //   1614: ifnonnull -> 1632
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload_1
    //   1625: goto -> 1639
    //   1628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1631: athrow
    //   1632: aload_1
    //   1633: checkcast [B
    //   1636: invokevirtual clone : ()Ljava/lang/Object;
    //   1639: aastore
    //   1640: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1643: checkcast java/lang/Boolean
    //   1646: invokevirtual booleanValue : ()Z
    //   1649: istore_3
    //   1650: iload_2
    //   1651: ifeq -> 1668
    //   1654: iinc #6, 1
    //   1657: iload_2
    //   1658: ifeq -> 1528
    //   1661: goto -> 1668
    //   1664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1667: athrow
    //   1668: iload_3
    //   1669: ifeq -> 1674
    //   1672: iload_3
    //   1673: ireturn
    //   1674: getstatic burp/Zgva.ZV : Ljava/lang/String;
    //   1677: getstatic burp/Ztlz.ZW : Ljava/lang/Object;
    //   1680: checkcast java/math/BigInteger
    //   1683: invokevirtual intValue : ()I
    //   1686: bipush #32
    //   1688: irem
    //   1689: invokestatic abs : (I)I
    //   1692: invokevirtual charAt : (I)C
    //   1695: getstatic burp/Ztfh.ZU : Ljava/lang/String;
    //   1698: getstatic burp/Zvo3.Ze : Ljava/lang/Object;
    //   1701: checkcast java/math/BigInteger
    //   1704: invokevirtual intValue : ()I
    //   1707: bipush #32
    //   1709: irem
    //   1710: invokestatic abs : (I)I
    //   1713: invokevirtual charAt : (I)C
    //   1716: if_icmpgt -> 2061
    //   1719: sipush #-13360
    //   1722: sipush #25085
    //   1725: invokestatic a : (II)Ljava/lang/String;
    //   1728: iconst_1
    //   1729: ldc burp/Ztex
    //   1731: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1734: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1737: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1740: astore #4
    //   1742: aload #4
    //   1744: arraylength
    //   1745: istore #5
    //   1747: iconst_0
    //   1748: istore #6
    //   1750: iload #6
    //   1752: iload #5
    //   1754: if_icmpge -> 1892
    //   1757: aload #4
    //   1759: iload #6
    //   1761: aaload
    //   1762: astore #7
    //   1764: aload #7
    //   1766: invokevirtual getModifiers : ()I
    //   1769: invokestatic isStatic : (I)Z
    //   1772: ifne -> 1782
    //   1775: goto -> 1885
    //   1778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1781: athrow
    //   1782: aload #7
    //   1784: invokevirtual getType : ()Ljava/lang/Class;
    //   1787: astore #8
    //   1789: aload #8
    //   1791: ifnull -> 1872
    //   1794: aload #8
    //   1796: invokevirtual isPrimitive : ()Z
    //   1799: ifne -> 1872
    //   1802: goto -> 1809
    //   1805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1808: athrow
    //   1809: aload #8
    //   1811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1814: ifnull -> 1872
    //   1817: goto -> 1824
    //   1820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1823: athrow
    //   1824: aload #8
    //   1826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1829: invokevirtual getName : ()Ljava/lang/String;
    //   1832: ifnull -> 1872
    //   1835: goto -> 1842
    //   1838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1841: athrow
    //   1842: aload #8
    //   1844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1847: invokevirtual getName : ()Ljava/lang/String;
    //   1850: sipush #-13351
    //   1853: sipush #-29496
    //   1856: invokestatic a : (II)Ljava/lang/String;
    //   1859: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1862: ifne -> 1872
    //   1865: goto -> 1872
    //   1868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1871: athrow
    //   1872: aload #7
    //   1874: iconst_1
    //   1875: invokevirtual setAccessible : (Z)V
    //   1878: aload #7
    //   1880: aconst_null
    //   1881: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1884: pop
    //   1885: iinc #6, 1
    //   1888: iload_2
    //   1889: ifeq -> 1750
    //   1892: sipush #-13376
    //   1895: sipush #3225
    //   1898: invokestatic a : (II)Ljava/lang/String;
    //   1901: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1904: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1907: astore #4
    //   1909: aload #4
    //   1911: arraylength
    //   1912: istore #5
    //   1914: iconst_0
    //   1915: istore #6
    //   1917: iload #6
    //   1919: iload #5
    //   1921: if_icmpge -> 2057
    //   1924: aload #4
    //   1926: iload #6
    //   1928: aaload
    //   1929: astore #7
    //   1931: aload #7
    //   1933: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1936: pop
    //   1937: aload #7
    //   1939: invokevirtual getModifiers : ()I
    //   1942: invokestatic isStatic : (I)Z
    //   1945: ifeq -> 2043
    //   1948: aload #7
    //   1950: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1953: arraylength
    //   1954: iconst_2
    //   1955: if_icmpne -> 2043
    //   1958: goto -> 1965
    //   1961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1964: athrow
    //   1965: aload #7
    //   1967: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1970: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1973: if_acmpne -> 2043
    //   1976: goto -> 1983
    //   1979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1982: athrow
    //   1983: aload #7
    //   1985: iconst_1
    //   1986: invokevirtual setAccessible : (Z)V
    //   1989: aload #7
    //   1991: aconst_null
    //   1992: iconst_2
    //   1993: anewarray java/lang/Object
    //   1996: dup
    //   1997: iconst_0
    //   1998: aload_0
    //   1999: aastore
    //   2000: dup
    //   2001: iconst_1
    //   2002: aload_1
    //   2003: ifnonnull -> 2021
    //   2006: goto -> 2013
    //   2009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2012: athrow
    //   2013: aload_1
    //   2014: goto -> 2028
    //   2017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2020: athrow
    //   2021: aload_1
    //   2022: checkcast [B
    //   2025: invokevirtual clone : ()Ljava/lang/Object;
    //   2028: aastore
    //   2029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2032: checkcast java/lang/Boolean
    //   2035: invokevirtual booleanValue : ()Z
    //   2038: istore_3
    //   2039: iload_2
    //   2040: ifeq -> 2057
    //   2043: iinc #6, 1
    //   2046: iload_2
    //   2047: ifeq -> 1917
    //   2050: goto -> 2057
    //   2053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2056: athrow
    //   2057: iload_2
    //   2058: ifeq -> 2399
    //   2061: sipush #-13372
    //   2064: sipush #-29437
    //   2067: invokestatic a : (II)Ljava/lang/String;
    //   2070: iconst_1
    //   2071: ldc burp/Zs_3
    //   2073: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2076: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2079: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2082: astore #4
    //   2084: aload #4
    //   2086: arraylength
    //   2087: istore #5
    //   2089: iconst_0
    //   2090: istore #6
    //   2092: iload #6
    //   2094: iload #5
    //   2096: if_icmpge -> 2234
    //   2099: aload #4
    //   2101: iload #6
    //   2103: aaload
    //   2104: astore #7
    //   2106: aload #7
    //   2108: invokevirtual getModifiers : ()I
    //   2111: invokestatic isStatic : (I)Z
    //   2114: ifne -> 2124
    //   2117: goto -> 2227
    //   2120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2123: athrow
    //   2124: aload #7
    //   2126: invokevirtual getType : ()Ljava/lang/Class;
    //   2129: astore #8
    //   2131: aload #8
    //   2133: ifnull -> 2214
    //   2136: aload #8
    //   2138: invokevirtual isPrimitive : ()Z
    //   2141: ifne -> 2214
    //   2144: goto -> 2151
    //   2147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2150: athrow
    //   2151: aload #8
    //   2153: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2156: ifnull -> 2214
    //   2159: goto -> 2166
    //   2162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2165: athrow
    //   2166: aload #8
    //   2168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2171: invokevirtual getName : ()Ljava/lang/String;
    //   2174: ifnull -> 2214
    //   2177: goto -> 2184
    //   2180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2183: athrow
    //   2184: aload #8
    //   2186: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2189: invokevirtual getName : ()Ljava/lang/String;
    //   2192: sipush #-13351
    //   2195: sipush #-29496
    //   2198: invokestatic a : (II)Ljava/lang/String;
    //   2201: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2204: ifne -> 2214
    //   2207: goto -> 2214
    //   2210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2213: athrow
    //   2214: aload #7
    //   2216: iconst_1
    //   2217: invokevirtual setAccessible : (Z)V
    //   2220: aload #7
    //   2222: aconst_null
    //   2223: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2226: pop
    //   2227: iinc #6, 1
    //   2230: iload_2
    //   2231: ifeq -> 2092
    //   2234: sipush #-13354
    //   2237: sipush #-26690
    //   2240: invokestatic a : (II)Ljava/lang/String;
    //   2243: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2246: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2249: astore #4
    //   2251: aload #4
    //   2253: arraylength
    //   2254: istore #5
    //   2256: iconst_0
    //   2257: istore #6
    //   2259: iload #6
    //   2261: iload #5
    //   2263: if_icmpge -> 2399
    //   2266: aload #4
    //   2268: iload #6
    //   2270: aaload
    //   2271: astore #7
    //   2273: aload #7
    //   2275: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2278: pop
    //   2279: aload #7
    //   2281: invokevirtual getModifiers : ()I
    //   2284: invokestatic isStatic : (I)Z
    //   2287: ifeq -> 2385
    //   2290: aload #7
    //   2292: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2295: arraylength
    //   2296: iconst_2
    //   2297: if_icmpne -> 2385
    //   2300: goto -> 2307
    //   2303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2306: athrow
    //   2307: aload #7
    //   2309: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2312: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2315: if_acmpne -> 2385
    //   2318: goto -> 2325
    //   2321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2324: athrow
    //   2325: aload #7
    //   2327: iconst_1
    //   2328: invokevirtual setAccessible : (Z)V
    //   2331: aload #7
    //   2333: aconst_null
    //   2334: iconst_2
    //   2335: anewarray java/lang/Object
    //   2338: dup
    //   2339: iconst_0
    //   2340: aload_0
    //   2341: aastore
    //   2342: dup
    //   2343: iconst_1
    //   2344: aload_1
    //   2345: ifnonnull -> 2363
    //   2348: goto -> 2355
    //   2351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2354: athrow
    //   2355: aload_1
    //   2356: goto -> 2370
    //   2359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2362: athrow
    //   2363: aload_1
    //   2364: checkcast [B
    //   2367: invokevirtual clone : ()Ljava/lang/Object;
    //   2370: aastore
    //   2371: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2374: checkcast java/lang/Boolean
    //   2377: invokevirtual booleanValue : ()Z
    //   2380: istore_3
    //   2381: iload_2
    //   2382: ifeq -> 2399
    //   2385: iinc #6, 1
    //   2388: iload_2
    //   2389: ifeq -> 2259
    //   2392: goto -> 2399
    //   2395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2398: athrow
    //   2399: iload_3
    //   2400: ifeq -> 2405
    //   2403: iload_3
    //   2404: ireturn
    //   2405: getstatic burp/Zr1z.ZB : Ljava/lang/String;
    //   2408: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   2411: checkcast java/math/BigInteger
    //   2414: invokevirtual intValue : ()I
    //   2417: bipush #32
    //   2419: irem
    //   2420: invokestatic abs : (I)I
    //   2423: invokevirtual charAt : (I)C
    //   2426: getstatic burp/Zrcy.Zq : Ljava/lang/String;
    //   2429: getstatic burp/Zt3p.ZO : Ljava/lang/Object;
    //   2432: checkcast java/math/BigInteger
    //   2435: invokevirtual intValue : ()I
    //   2438: bipush #32
    //   2440: irem
    //   2441: invokestatic abs : (I)I
    //   2444: invokevirtual charAt : (I)C
    //   2447: if_icmpgt -> 2792
    //   2450: sipush #-13347
    //   2453: sipush #25272
    //   2456: invokestatic a : (II)Ljava/lang/String;
    //   2459: iconst_1
    //   2460: ldc burp/Zrj3
    //   2462: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2465: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2468: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2471: astore #4
    //   2473: aload #4
    //   2475: arraylength
    //   2476: istore #5
    //   2478: iconst_0
    //   2479: istore #6
    //   2481: iload #6
    //   2483: iload #5
    //   2485: if_icmpge -> 2623
    //   2488: aload #4
    //   2490: iload #6
    //   2492: aaload
    //   2493: astore #7
    //   2495: aload #7
    //   2497: invokevirtual getModifiers : ()I
    //   2500: invokestatic isStatic : (I)Z
    //   2503: ifne -> 2513
    //   2506: goto -> 2616
    //   2509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2512: athrow
    //   2513: aload #7
    //   2515: invokevirtual getType : ()Ljava/lang/Class;
    //   2518: astore #8
    //   2520: aload #8
    //   2522: ifnull -> 2603
    //   2525: aload #8
    //   2527: invokevirtual isPrimitive : ()Z
    //   2530: ifne -> 2603
    //   2533: goto -> 2540
    //   2536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2539: athrow
    //   2540: aload #8
    //   2542: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2545: ifnull -> 2603
    //   2548: goto -> 2555
    //   2551: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2554: athrow
    //   2555: aload #8
    //   2557: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2560: invokevirtual getName : ()Ljava/lang/String;
    //   2563: ifnull -> 2603
    //   2566: goto -> 2573
    //   2569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2572: athrow
    //   2573: aload #8
    //   2575: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2578: invokevirtual getName : ()Ljava/lang/String;
    //   2581: sipush #-13351
    //   2584: sipush #-29496
    //   2587: invokestatic a : (II)Ljava/lang/String;
    //   2590: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2593: ifne -> 2603
    //   2596: goto -> 2603
    //   2599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2602: athrow
    //   2603: aload #7
    //   2605: iconst_1
    //   2606: invokevirtual setAccessible : (Z)V
    //   2609: aload #7
    //   2611: aconst_null
    //   2612: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2615: pop
    //   2616: iinc #6, 1
    //   2619: iload_2
    //   2620: ifeq -> 2481
    //   2623: sipush #-13369
    //   2626: sipush #21244
    //   2629: invokestatic a : (II)Ljava/lang/String;
    //   2632: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2635: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2638: astore #4
    //   2640: aload #4
    //   2642: arraylength
    //   2643: istore #5
    //   2645: iconst_0
    //   2646: istore #6
    //   2648: iload #6
    //   2650: iload #5
    //   2652: if_icmpge -> 2788
    //   2655: aload #4
    //   2657: iload #6
    //   2659: aaload
    //   2660: astore #7
    //   2662: aload #7
    //   2664: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2667: pop
    //   2668: aload #7
    //   2670: invokevirtual getModifiers : ()I
    //   2673: invokestatic isStatic : (I)Z
    //   2676: ifeq -> 2774
    //   2679: aload #7
    //   2681: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2684: arraylength
    //   2685: iconst_2
    //   2686: if_icmpne -> 2774
    //   2689: goto -> 2696
    //   2692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2695: athrow
    //   2696: aload #7
    //   2698: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2701: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2704: if_acmpne -> 2774
    //   2707: goto -> 2714
    //   2710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2713: athrow
    //   2714: aload #7
    //   2716: iconst_1
    //   2717: invokevirtual setAccessible : (Z)V
    //   2720: aload #7
    //   2722: aconst_null
    //   2723: iconst_2
    //   2724: anewarray java/lang/Object
    //   2727: dup
    //   2728: iconst_0
    //   2729: aload_0
    //   2730: aastore
    //   2731: dup
    //   2732: iconst_1
    //   2733: aload_1
    //   2734: ifnonnull -> 2752
    //   2737: goto -> 2744
    //   2740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2743: athrow
    //   2744: aload_1
    //   2745: goto -> 2759
    //   2748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2751: athrow
    //   2752: aload_1
    //   2753: checkcast [B
    //   2756: invokevirtual clone : ()Ljava/lang/Object;
    //   2759: aastore
    //   2760: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2763: checkcast java/lang/Boolean
    //   2766: invokevirtual booleanValue : ()Z
    //   2769: istore_3
    //   2770: iload_2
    //   2771: ifeq -> 2788
    //   2774: iinc #6, 1
    //   2777: iload_2
    //   2778: ifeq -> 2648
    //   2781: goto -> 2788
    //   2784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2787: athrow
    //   2788: iload_2
    //   2789: ifeq -> 3130
    //   2792: sipush #-13363
    //   2795: sipush #-13919
    //   2798: invokestatic a : (II)Ljava/lang/String;
    //   2801: iconst_1
    //   2802: ldc burp/Zre1
    //   2804: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2807: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2810: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2813: astore #4
    //   2815: aload #4
    //   2817: arraylength
    //   2818: istore #5
    //   2820: iconst_0
    //   2821: istore #6
    //   2823: iload #6
    //   2825: iload #5
    //   2827: if_icmpge -> 2965
    //   2830: aload #4
    //   2832: iload #6
    //   2834: aaload
    //   2835: astore #7
    //   2837: aload #7
    //   2839: invokevirtual getModifiers : ()I
    //   2842: invokestatic isStatic : (I)Z
    //   2845: ifne -> 2855
    //   2848: goto -> 2958
    //   2851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2854: athrow
    //   2855: aload #7
    //   2857: invokevirtual getType : ()Ljava/lang/Class;
    //   2860: astore #8
    //   2862: aload #8
    //   2864: ifnull -> 2945
    //   2867: aload #8
    //   2869: invokevirtual isPrimitive : ()Z
    //   2872: ifne -> 2945
    //   2875: goto -> 2882
    //   2878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2881: athrow
    //   2882: aload #8
    //   2884: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2887: ifnull -> 2945
    //   2890: goto -> 2897
    //   2893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2896: athrow
    //   2897: aload #8
    //   2899: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2902: invokevirtual getName : ()Ljava/lang/String;
    //   2905: ifnull -> 2945
    //   2908: goto -> 2915
    //   2911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2914: athrow
    //   2915: aload #8
    //   2917: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2920: invokevirtual getName : ()Ljava/lang/String;
    //   2923: sipush #-13351
    //   2926: sipush #-29496
    //   2929: invokestatic a : (II)Ljava/lang/String;
    //   2932: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2935: ifne -> 2945
    //   2938: goto -> 2945
    //   2941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2944: athrow
    //   2945: aload #7
    //   2947: iconst_1
    //   2948: invokevirtual setAccessible : (Z)V
    //   2951: aload #7
    //   2953: aconst_null
    //   2954: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2957: pop
    //   2958: iinc #6, 1
    //   2961: iload_2
    //   2962: ifeq -> 2823
    //   2965: sipush #-13375
    //   2968: sipush #8506
    //   2971: invokestatic a : (II)Ljava/lang/String;
    //   2974: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2977: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2980: astore #4
    //   2982: aload #4
    //   2984: arraylength
    //   2985: istore #5
    //   2987: iconst_0
    //   2988: istore #6
    //   2990: iload #6
    //   2992: iload #5
    //   2994: if_icmpge -> 3130
    //   2997: aload #4
    //   2999: iload #6
    //   3001: aaload
    //   3002: astore #7
    //   3004: aload #7
    //   3006: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3009: pop
    //   3010: aload #7
    //   3012: invokevirtual getModifiers : ()I
    //   3015: invokestatic isStatic : (I)Z
    //   3018: ifeq -> 3116
    //   3021: aload #7
    //   3023: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3026: arraylength
    //   3027: iconst_2
    //   3028: if_icmpne -> 3116
    //   3031: goto -> 3038
    //   3034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3037: athrow
    //   3038: aload #7
    //   3040: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3043: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3046: if_acmpne -> 3116
    //   3049: goto -> 3056
    //   3052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3055: athrow
    //   3056: aload #7
    //   3058: iconst_1
    //   3059: invokevirtual setAccessible : (Z)V
    //   3062: aload #7
    //   3064: aconst_null
    //   3065: iconst_2
    //   3066: anewarray java/lang/Object
    //   3069: dup
    //   3070: iconst_0
    //   3071: aload_0
    //   3072: aastore
    //   3073: dup
    //   3074: iconst_1
    //   3075: aload_1
    //   3076: ifnonnull -> 3094
    //   3079: goto -> 3086
    //   3082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3085: athrow
    //   3086: aload_1
    //   3087: goto -> 3101
    //   3090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3093: athrow
    //   3094: aload_1
    //   3095: checkcast [B
    //   3098: invokevirtual clone : ()Ljava/lang/Object;
    //   3101: aastore
    //   3102: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3105: checkcast java/lang/Boolean
    //   3108: invokevirtual booleanValue : ()Z
    //   3111: istore_3
    //   3112: iload_2
    //   3113: ifeq -> 3130
    //   3116: iinc #6, 1
    //   3119: iload_2
    //   3120: ifeq -> 2990
    //   3123: goto -> 3130
    //   3126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3129: athrow
    //   3130: iload_3
    //   3131: ifeq -> 3136
    //   3134: iload_3
    //   3135: ireturn
    //   3136: getstatic burp/Zrtc.Zl : Ljava/lang/String;
    //   3139: getstatic burp/Zevr.ZG : Ljava/lang/Object;
    //   3142: checkcast java/math/BigInteger
    //   3145: invokevirtual intValue : ()I
    //   3148: bipush #32
    //   3150: irem
    //   3151: invokestatic abs : (I)I
    //   3154: invokevirtual charAt : (I)C
    //   3157: getstatic burp/Zmyg.ZE : Ljava/lang/String;
    //   3160: getstatic burp/Zb4a.ZJ : Ljava/lang/Object;
    //   3163: checkcast java/math/BigInteger
    //   3166: invokevirtual intValue : ()I
    //   3169: bipush #32
    //   3171: irem
    //   3172: invokestatic abs : (I)I
    //   3175: invokevirtual charAt : (I)C
    //   3178: if_icmple -> 3523
    //   3181: sipush #-13366
    //   3184: sipush #14837
    //   3187: invokestatic a : (II)Ljava/lang/String;
    //   3190: iconst_1
    //   3191: ldc burp/Zg2u
    //   3193: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3196: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3199: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3202: astore #4
    //   3204: aload #4
    //   3206: arraylength
    //   3207: istore #5
    //   3209: iconst_0
    //   3210: istore #6
    //   3212: iload #6
    //   3214: iload #5
    //   3216: if_icmpge -> 3354
    //   3219: aload #4
    //   3221: iload #6
    //   3223: aaload
    //   3224: astore #7
    //   3226: aload #7
    //   3228: invokevirtual getModifiers : ()I
    //   3231: invokestatic isStatic : (I)Z
    //   3234: ifne -> 3244
    //   3237: goto -> 3347
    //   3240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3243: athrow
    //   3244: aload #7
    //   3246: invokevirtual getType : ()Ljava/lang/Class;
    //   3249: astore #8
    //   3251: aload #8
    //   3253: ifnull -> 3334
    //   3256: aload #8
    //   3258: invokevirtual isPrimitive : ()Z
    //   3261: ifne -> 3334
    //   3264: goto -> 3271
    //   3267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3270: athrow
    //   3271: aload #8
    //   3273: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3276: ifnull -> 3334
    //   3279: goto -> 3286
    //   3282: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3285: athrow
    //   3286: aload #8
    //   3288: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3291: invokevirtual getName : ()Ljava/lang/String;
    //   3294: ifnull -> 3334
    //   3297: goto -> 3304
    //   3300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3303: athrow
    //   3304: aload #8
    //   3306: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3309: invokevirtual getName : ()Ljava/lang/String;
    //   3312: sipush #-13351
    //   3315: sipush #-29496
    //   3318: invokestatic a : (II)Ljava/lang/String;
    //   3321: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3324: ifne -> 3334
    //   3327: goto -> 3334
    //   3330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3333: athrow
    //   3334: aload #7
    //   3336: iconst_1
    //   3337: invokevirtual setAccessible : (Z)V
    //   3340: aload #7
    //   3342: aconst_null
    //   3343: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3346: pop
    //   3347: iinc #6, 1
    //   3350: iload_2
    //   3351: ifeq -> 3212
    //   3354: sipush #-13371
    //   3357: sipush #1433
    //   3360: invokestatic a : (II)Ljava/lang/String;
    //   3363: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3366: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3369: astore #4
    //   3371: aload #4
    //   3373: arraylength
    //   3374: istore #5
    //   3376: iconst_0
    //   3377: istore #6
    //   3379: iload #6
    //   3381: iload #5
    //   3383: if_icmpge -> 3519
    //   3386: aload #4
    //   3388: iload #6
    //   3390: aaload
    //   3391: astore #7
    //   3393: aload #7
    //   3395: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3398: pop
    //   3399: aload #7
    //   3401: invokevirtual getModifiers : ()I
    //   3404: invokestatic isStatic : (I)Z
    //   3407: ifeq -> 3505
    //   3410: aload #7
    //   3412: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3415: arraylength
    //   3416: iconst_2
    //   3417: if_icmpne -> 3505
    //   3420: goto -> 3427
    //   3423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3426: athrow
    //   3427: aload #7
    //   3429: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3432: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3435: if_acmpne -> 3505
    //   3438: goto -> 3445
    //   3441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3444: athrow
    //   3445: aload #7
    //   3447: iconst_1
    //   3448: invokevirtual setAccessible : (Z)V
    //   3451: aload #7
    //   3453: aconst_null
    //   3454: iconst_2
    //   3455: anewarray java/lang/Object
    //   3458: dup
    //   3459: iconst_0
    //   3460: aload_0
    //   3461: aastore
    //   3462: dup
    //   3463: iconst_1
    //   3464: aload_1
    //   3465: ifnonnull -> 3483
    //   3468: goto -> 3475
    //   3471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3474: athrow
    //   3475: aload_1
    //   3476: goto -> 3490
    //   3479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3482: athrow
    //   3483: aload_1
    //   3484: checkcast [B
    //   3487: invokevirtual clone : ()Ljava/lang/Object;
    //   3490: aastore
    //   3491: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3494: checkcast java/lang/Boolean
    //   3497: invokevirtual booleanValue : ()Z
    //   3500: istore_3
    //   3501: iload_2
    //   3502: ifeq -> 3519
    //   3505: iinc #6, 1
    //   3508: iload_2
    //   3509: ifeq -> 3379
    //   3512: goto -> 3519
    //   3515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3518: athrow
    //   3519: iload_2
    //   3520: ifeq -> 3861
    //   3523: sipush #-13346
    //   3526: sipush #-19707
    //   3529: invokestatic a : (II)Ljava/lang/String;
    //   3532: iconst_1
    //   3533: ldc burp/Zs00
    //   3535: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3538: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3541: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3544: astore #4
    //   3546: aload #4
    //   3548: arraylength
    //   3549: istore #5
    //   3551: iconst_0
    //   3552: istore #6
    //   3554: iload #6
    //   3556: iload #5
    //   3558: if_icmpge -> 3696
    //   3561: aload #4
    //   3563: iload #6
    //   3565: aaload
    //   3566: astore #7
    //   3568: aload #7
    //   3570: invokevirtual getModifiers : ()I
    //   3573: invokestatic isStatic : (I)Z
    //   3576: ifne -> 3586
    //   3579: goto -> 3689
    //   3582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3585: athrow
    //   3586: aload #7
    //   3588: invokevirtual getType : ()Ljava/lang/Class;
    //   3591: astore #8
    //   3593: aload #8
    //   3595: ifnull -> 3676
    //   3598: aload #8
    //   3600: invokevirtual isPrimitive : ()Z
    //   3603: ifne -> 3676
    //   3606: goto -> 3613
    //   3609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3612: athrow
    //   3613: aload #8
    //   3615: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3618: ifnull -> 3676
    //   3621: goto -> 3628
    //   3624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3627: athrow
    //   3628: aload #8
    //   3630: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3633: invokevirtual getName : ()Ljava/lang/String;
    //   3636: ifnull -> 3676
    //   3639: goto -> 3646
    //   3642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3645: athrow
    //   3646: aload #8
    //   3648: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3651: invokevirtual getName : ()Ljava/lang/String;
    //   3654: sipush #-13351
    //   3657: sipush #-29496
    //   3660: invokestatic a : (II)Ljava/lang/String;
    //   3663: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3666: ifne -> 3676
    //   3669: goto -> 3676
    //   3672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3675: athrow
    //   3676: aload #7
    //   3678: iconst_1
    //   3679: invokevirtual setAccessible : (Z)V
    //   3682: aload #7
    //   3684: aconst_null
    //   3685: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3688: pop
    //   3689: iinc #6, 1
    //   3692: iload_2
    //   3693: ifeq -> 3554
    //   3696: sipush #-13348
    //   3699: sipush #-12610
    //   3702: invokestatic a : (II)Ljava/lang/String;
    //   3705: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3708: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3711: astore #4
    //   3713: aload #4
    //   3715: arraylength
    //   3716: istore #5
    //   3718: iconst_0
    //   3719: istore #6
    //   3721: iload #6
    //   3723: iload #5
    //   3725: if_icmpge -> 3861
    //   3728: aload #4
    //   3730: iload #6
    //   3732: aaload
    //   3733: astore #7
    //   3735: aload #7
    //   3737: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3740: pop
    //   3741: aload #7
    //   3743: invokevirtual getModifiers : ()I
    //   3746: invokestatic isStatic : (I)Z
    //   3749: ifeq -> 3847
    //   3752: aload #7
    //   3754: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3757: arraylength
    //   3758: iconst_2
    //   3759: if_icmpne -> 3847
    //   3762: goto -> 3769
    //   3765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3768: athrow
    //   3769: aload #7
    //   3771: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3774: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3777: if_acmpne -> 3847
    //   3780: goto -> 3787
    //   3783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3786: athrow
    //   3787: aload #7
    //   3789: iconst_1
    //   3790: invokevirtual setAccessible : (Z)V
    //   3793: aload #7
    //   3795: aconst_null
    //   3796: iconst_2
    //   3797: anewarray java/lang/Object
    //   3800: dup
    //   3801: iconst_0
    //   3802: aload_0
    //   3803: aastore
    //   3804: dup
    //   3805: iconst_1
    //   3806: aload_1
    //   3807: ifnonnull -> 3825
    //   3810: goto -> 3817
    //   3813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3816: athrow
    //   3817: aload_1
    //   3818: goto -> 3832
    //   3821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3824: athrow
    //   3825: aload_1
    //   3826: checkcast [B
    //   3829: invokevirtual clone : ()Ljava/lang/Object;
    //   3832: aastore
    //   3833: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3836: checkcast java/lang/Boolean
    //   3839: invokevirtual booleanValue : ()Z
    //   3842: istore_3
    //   3843: iload_2
    //   3844: ifeq -> 3861
    //   3847: iinc #6, 1
    //   3850: iload_2
    //   3851: ifeq -> 3721
    //   3854: goto -> 3861
    //   3857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3860: athrow
    //   3861: iload_3
    //   3862: ifeq -> 3867
    //   3865: iload_3
    //   3866: ireturn
    //   3867: getstatic burp/Zxjk.Za : Ljava/lang/String;
    //   3870: getstatic burp/Zix.ZO : Ljava/lang/Object;
    //   3873: checkcast java/math/BigInteger
    //   3876: invokevirtual intValue : ()I
    //   3879: bipush #32
    //   3881: irem
    //   3882: invokestatic abs : (I)I
    //   3885: invokevirtual charAt : (I)C
    //   3888: getstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   3891: getstatic burp/Zs75.Zo : Ljava/lang/Object;
    //   3894: checkcast java/math/BigInteger
    //   3897: invokevirtual intValue : ()I
    //   3900: bipush #32
    //   3902: irem
    //   3903: invokestatic abs : (I)I
    //   3906: invokevirtual charAt : (I)C
    //   3909: if_icmpgt -> 4254
    //   3912: sipush #-13356
    //   3915: sipush #-17288
    //   3918: invokestatic a : (II)Ljava/lang/String;
    //   3921: iconst_1
    //   3922: ldc burp/Zll8
    //   3924: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3927: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3930: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3933: astore #4
    //   3935: aload #4
    //   3937: arraylength
    //   3938: istore #5
    //   3940: iconst_0
    //   3941: istore #6
    //   3943: iload #6
    //   3945: iload #5
    //   3947: if_icmpge -> 4085
    //   3950: aload #4
    //   3952: iload #6
    //   3954: aaload
    //   3955: astore #7
    //   3957: aload #7
    //   3959: invokevirtual getModifiers : ()I
    //   3962: invokestatic isStatic : (I)Z
    //   3965: ifne -> 3975
    //   3968: goto -> 4078
    //   3971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3974: athrow
    //   3975: aload #7
    //   3977: invokevirtual getType : ()Ljava/lang/Class;
    //   3980: astore #8
    //   3982: aload #8
    //   3984: ifnull -> 4065
    //   3987: aload #8
    //   3989: invokevirtual isPrimitive : ()Z
    //   3992: ifne -> 4065
    //   3995: goto -> 4002
    //   3998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4001: athrow
    //   4002: aload #8
    //   4004: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4007: ifnull -> 4065
    //   4010: goto -> 4017
    //   4013: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4016: athrow
    //   4017: aload #8
    //   4019: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4022: invokevirtual getName : ()Ljava/lang/String;
    //   4025: ifnull -> 4065
    //   4028: goto -> 4035
    //   4031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4034: athrow
    //   4035: aload #8
    //   4037: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4040: invokevirtual getName : ()Ljava/lang/String;
    //   4043: sipush #-13351
    //   4046: sipush #-29496
    //   4049: invokestatic a : (II)Ljava/lang/String;
    //   4052: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4055: ifne -> 4065
    //   4058: goto -> 4065
    //   4061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4064: athrow
    //   4065: aload #7
    //   4067: iconst_1
    //   4068: invokevirtual setAccessible : (Z)V
    //   4071: aload #7
    //   4073: aconst_null
    //   4074: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4077: pop
    //   4078: iinc #6, 1
    //   4081: iload_2
    //   4082: ifeq -> 3943
    //   4085: sipush #-13373
    //   4088: sipush #14887
    //   4091: invokestatic a : (II)Ljava/lang/String;
    //   4094: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4097: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4100: astore #4
    //   4102: aload #4
    //   4104: arraylength
    //   4105: istore #5
    //   4107: iconst_0
    //   4108: istore #6
    //   4110: iload #6
    //   4112: iload #5
    //   4114: if_icmpge -> 4250
    //   4117: aload #4
    //   4119: iload #6
    //   4121: aaload
    //   4122: astore #7
    //   4124: aload #7
    //   4126: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4129: pop
    //   4130: aload #7
    //   4132: invokevirtual getModifiers : ()I
    //   4135: invokestatic isStatic : (I)Z
    //   4138: ifeq -> 4236
    //   4141: aload #7
    //   4143: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4146: arraylength
    //   4147: iconst_2
    //   4148: if_icmpne -> 4236
    //   4151: goto -> 4158
    //   4154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4157: athrow
    //   4158: aload #7
    //   4160: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4163: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4166: if_acmpne -> 4236
    //   4169: goto -> 4176
    //   4172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4175: athrow
    //   4176: aload #7
    //   4178: iconst_1
    //   4179: invokevirtual setAccessible : (Z)V
    //   4182: aload #7
    //   4184: aconst_null
    //   4185: iconst_2
    //   4186: anewarray java/lang/Object
    //   4189: dup
    //   4190: iconst_0
    //   4191: aload_0
    //   4192: aastore
    //   4193: dup
    //   4194: iconst_1
    //   4195: aload_1
    //   4196: ifnonnull -> 4214
    //   4199: goto -> 4206
    //   4202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4205: athrow
    //   4206: aload_1
    //   4207: goto -> 4221
    //   4210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4213: athrow
    //   4214: aload_1
    //   4215: checkcast [B
    //   4218: invokevirtual clone : ()Ljava/lang/Object;
    //   4221: aastore
    //   4222: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4225: checkcast java/lang/Boolean
    //   4228: invokevirtual booleanValue : ()Z
    //   4231: istore_3
    //   4232: iload_2
    //   4233: ifeq -> 4250
    //   4236: iinc #6, 1
    //   4239: iload_2
    //   4240: ifeq -> 4110
    //   4243: goto -> 4250
    //   4246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4249: athrow
    //   4250: iload_2
    //   4251: ifeq -> 4592
    //   4254: sipush #-13349
    //   4257: sipush #11687
    //   4260: invokestatic a : (II)Ljava/lang/String;
    //   4263: iconst_1
    //   4264: ldc burp/Zlfi
    //   4266: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4269: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4272: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4275: astore #4
    //   4277: aload #4
    //   4279: arraylength
    //   4280: istore #5
    //   4282: iconst_0
    //   4283: istore #6
    //   4285: iload #6
    //   4287: iload #5
    //   4289: if_icmpge -> 4427
    //   4292: aload #4
    //   4294: iload #6
    //   4296: aaload
    //   4297: astore #7
    //   4299: aload #7
    //   4301: invokevirtual getModifiers : ()I
    //   4304: invokestatic isStatic : (I)Z
    //   4307: ifne -> 4317
    //   4310: goto -> 4420
    //   4313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4316: athrow
    //   4317: aload #7
    //   4319: invokevirtual getType : ()Ljava/lang/Class;
    //   4322: astore #8
    //   4324: aload #8
    //   4326: ifnull -> 4407
    //   4329: aload #8
    //   4331: invokevirtual isPrimitive : ()Z
    //   4334: ifne -> 4407
    //   4337: goto -> 4344
    //   4340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4343: athrow
    //   4344: aload #8
    //   4346: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4349: ifnull -> 4407
    //   4352: goto -> 4359
    //   4355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4358: athrow
    //   4359: aload #8
    //   4361: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4364: invokevirtual getName : ()Ljava/lang/String;
    //   4367: ifnull -> 4407
    //   4370: goto -> 4377
    //   4373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4376: athrow
    //   4377: aload #8
    //   4379: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4382: invokevirtual getName : ()Ljava/lang/String;
    //   4385: sipush #-13351
    //   4388: sipush #-29496
    //   4391: invokestatic a : (II)Ljava/lang/String;
    //   4394: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4397: ifne -> 4407
    //   4400: goto -> 4407
    //   4403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4406: athrow
    //   4407: aload #7
    //   4409: iconst_1
    //   4410: invokevirtual setAccessible : (Z)V
    //   4413: aload #7
    //   4415: aconst_null
    //   4416: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4419: pop
    //   4420: iinc #6, 1
    //   4423: iload_2
    //   4424: ifeq -> 4285
    //   4427: sipush #-13365
    //   4430: sipush #-18981
    //   4433: invokestatic a : (II)Ljava/lang/String;
    //   4436: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4439: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4442: astore #4
    //   4444: aload #4
    //   4446: arraylength
    //   4447: istore #5
    //   4449: iconst_0
    //   4450: istore #6
    //   4452: iload #6
    //   4454: iload #5
    //   4456: if_icmpge -> 4592
    //   4459: aload #4
    //   4461: iload #6
    //   4463: aaload
    //   4464: astore #7
    //   4466: aload #7
    //   4468: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4471: pop
    //   4472: aload #7
    //   4474: invokevirtual getModifiers : ()I
    //   4477: invokestatic isStatic : (I)Z
    //   4480: ifeq -> 4578
    //   4483: aload #7
    //   4485: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4488: arraylength
    //   4489: iconst_2
    //   4490: if_icmpne -> 4578
    //   4493: goto -> 4500
    //   4496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4499: athrow
    //   4500: aload #7
    //   4502: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4505: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4508: if_acmpne -> 4578
    //   4511: goto -> 4518
    //   4514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4517: athrow
    //   4518: aload #7
    //   4520: iconst_1
    //   4521: invokevirtual setAccessible : (Z)V
    //   4524: aload #7
    //   4526: aconst_null
    //   4527: iconst_2
    //   4528: anewarray java/lang/Object
    //   4531: dup
    //   4532: iconst_0
    //   4533: aload_0
    //   4534: aastore
    //   4535: dup
    //   4536: iconst_1
    //   4537: aload_1
    //   4538: ifnonnull -> 4556
    //   4541: goto -> 4548
    //   4544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4547: athrow
    //   4548: aload_1
    //   4549: goto -> 4563
    //   4552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4555: athrow
    //   4556: aload_1
    //   4557: checkcast [B
    //   4560: invokevirtual clone : ()Ljava/lang/Object;
    //   4563: aastore
    //   4564: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4567: checkcast java/lang/Boolean
    //   4570: invokevirtual booleanValue : ()Z
    //   4573: istore_3
    //   4574: iload_2
    //   4575: ifeq -> 4592
    //   4578: iinc #6, 1
    //   4581: iload_2
    //   4582: ifeq -> 4452
    //   4585: goto -> 4592
    //   4588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4591: athrow
    //   4592: iload_3
    //   4593: ireturn
    //   4594: astore_3
    //   4595: new java/lang/Exception
    //   4598: dup
    //   4599: aload_3
    //   4600: invokevirtual getMessage : ()Ljava/lang/String;
    //   4603: invokespecial <init> : (Ljava/lang/String;)V
    //   4606: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1673	4594	java/lang/Throwable
    //   203	227	230	java/lang/Throwable
    //   301	338	338	java/lang/Throwable
    //   342	363	363	java/lang/Throwable
    //   367	397	397	java/lang/Throwable
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
    //   1034	1048	1048	java/lang/Throwable
    //   1059	1072	1075	java/lang/Throwable
    //   1064	1087	1090	java/lang/Throwable
    //   1079	1105	1108	java/lang/Throwable
    //   1094	1135	1138	java/lang/Throwable
    //   1201	1228	1231	java/lang/Throwable
    //   1218	1246	1249	java/lang/Throwable
    //   1235	1276	1279	java/lang/Throwable
    //   1253	1287	1287	java/lang/Throwable
    //   1309	1320	1323	java/lang/Throwable
    //   1375	1389	1389	java/lang/Throwable
    //   1400	1413	1416	java/lang/Throwable
    //   1405	1428	1431	java/lang/Throwable
    //   1420	1446	1449	java/lang/Throwable
    //   1435	1476	1479	java/lang/Throwable
    //   1542	1569	1572	java/lang/Throwable
    //   1559	1587	1590	java/lang/Throwable
    //   1576	1617	1620	java/lang/Throwable
    //   1594	1628	1628	java/lang/Throwable
    //   1650	1661	1664	java/lang/Throwable
    //   1674	2404	4594	java/lang/Throwable
    //   1764	1778	1778	java/lang/Throwable
    //   1789	1802	1805	java/lang/Throwable
    //   1794	1817	1820	java/lang/Throwable
    //   1809	1835	1838	java/lang/Throwable
    //   1824	1865	1868	java/lang/Throwable
    //   1931	1958	1961	java/lang/Throwable
    //   1948	1976	1979	java/lang/Throwable
    //   1965	2006	2009	java/lang/Throwable
    //   1983	2017	2017	java/lang/Throwable
    //   2039	2050	2053	java/lang/Throwable
    //   2106	2120	2120	java/lang/Throwable
    //   2131	2144	2147	java/lang/Throwable
    //   2136	2159	2162	java/lang/Throwable
    //   2151	2177	2180	java/lang/Throwable
    //   2166	2207	2210	java/lang/Throwable
    //   2273	2300	2303	java/lang/Throwable
    //   2290	2318	2321	java/lang/Throwable
    //   2307	2348	2351	java/lang/Throwable
    //   2325	2359	2359	java/lang/Throwable
    //   2381	2392	2395	java/lang/Throwable
    //   2405	3135	4594	java/lang/Throwable
    //   2495	2509	2509	java/lang/Throwable
    //   2520	2533	2536	java/lang/Throwable
    //   2525	2548	2551	java/lang/Throwable
    //   2540	2566	2569	java/lang/Throwable
    //   2555	2596	2599	java/lang/Throwable
    //   2662	2689	2692	java/lang/Throwable
    //   2679	2707	2710	java/lang/Throwable
    //   2696	2737	2740	java/lang/Throwable
    //   2714	2748	2748	java/lang/Throwable
    //   2770	2781	2784	java/lang/Throwable
    //   2837	2851	2851	java/lang/Throwable
    //   2862	2875	2878	java/lang/Throwable
    //   2867	2890	2893	java/lang/Throwable
    //   2882	2908	2911	java/lang/Throwable
    //   2897	2938	2941	java/lang/Throwable
    //   3004	3031	3034	java/lang/Throwable
    //   3021	3049	3052	java/lang/Throwable
    //   3038	3079	3082	java/lang/Throwable
    //   3056	3090	3090	java/lang/Throwable
    //   3112	3123	3126	java/lang/Throwable
    //   3136	3866	4594	java/lang/Throwable
    //   3226	3240	3240	java/lang/Throwable
    //   3251	3264	3267	java/lang/Throwable
    //   3256	3279	3282	java/lang/Throwable
    //   3271	3297	3300	java/lang/Throwable
    //   3286	3327	3330	java/lang/Throwable
    //   3393	3420	3423	java/lang/Throwable
    //   3410	3438	3441	java/lang/Throwable
    //   3427	3468	3471	java/lang/Throwable
    //   3445	3479	3479	java/lang/Throwable
    //   3501	3512	3515	java/lang/Throwable
    //   3568	3582	3582	java/lang/Throwable
    //   3593	3606	3609	java/lang/Throwable
    //   3598	3621	3624	java/lang/Throwable
    //   3613	3639	3642	java/lang/Throwable
    //   3628	3669	3672	java/lang/Throwable
    //   3735	3762	3765	java/lang/Throwable
    //   3752	3780	3783	java/lang/Throwable
    //   3769	3810	3813	java/lang/Throwable
    //   3787	3821	3821	java/lang/Throwable
    //   3843	3854	3857	java/lang/Throwable
    //   3867	4593	4594	java/lang/Throwable
    //   3957	3971	3971	java/lang/Throwable
    //   3982	3995	3998	java/lang/Throwable
    //   3987	4010	4013	java/lang/Throwable
    //   4002	4028	4031	java/lang/Throwable
    //   4017	4058	4061	java/lang/Throwable
    //   4124	4151	4154	java/lang/Throwable
    //   4141	4169	4172	java/lang/Throwable
    //   4158	4199	4202	java/lang/Throwable
    //   4176	4210	4210	java/lang/Throwable
    //   4232	4243	4246	java/lang/Throwable
    //   4299	4313	4313	java/lang/Throwable
    //   4324	4337	4340	java/lang/Throwable
    //   4329	4352	4355	java/lang/Throwable
    //   4344	4370	4373	java/lang/Throwable
    //   4359	4400	4403	java/lang/Throwable
    //   4466	4493	4496	java/lang/Throwable
    //   4483	4511	4514	java/lang/Throwable
    //   4500	4541	4544	java/lang/Throwable
    //   4518	4552	4552	java/lang/Throwable
    //   4574	4585	4588	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÆµadÍ£ì\\têøÈÔø¼¿\\t_<EfcL\\té±üáØÝ%_<\\t#Â³Ìg »6À°Z¨Ø#ÒhC?+ÁL"RÞ×¢«§ÿ(ÚÖ\\t ¦ÁßÒ¬\\t\\t)àò[¿MH?\\täAKoÕ¶ý\\tyî%E~M0\\t¶ÐÍ¥XªË\\t0äÇK¿Öñ´\\tyîaj1\\t\\f"V+XÂ@\\t§£5£áS\\tG()Òb»c\\t¢ÈÎõ8¶\\t©¹ôàÙý_-\\t§¯5"á¥ÜÑóí q÷QÙÁ[ÃB¢d1|¼Ãaô[Î¶¾g@¥àÍ¨Â\\ts¯¶²7fCÂ\\tægÊ¯Ï\\t,R«×H\\tÁ¼ù@xé?é\\t¢ñéõÜ<'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
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
    //   68: ldc 'åM½1ÍíÚêáñú°øÂìf0n¨¢æA/¦,9ËóiJ¡-xðZ&Ö×à·3½&79JMÇ\\f$6·¨ßs>Wûãôª|\\tº\Øí!B'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #76
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #81
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
    //   129: putstatic burp/Zk12.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk12.b : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #57
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #36
    //   234: goto -> 244
    //   237: bipush #61
    //   239: goto -> 244
    //   242: bipush #16
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
    //   310: bipush #42
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-7
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-8
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-69
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #87
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-83
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-8
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #68
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-100
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #83
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #96
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-57
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #75
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-27
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #51
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #95
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-17
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-84
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-89
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-6
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-46
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-56
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #31
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #97
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #53
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-81
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #40
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-106
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #82
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #31
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #24
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #40
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zk12.Zh : Ljava/lang/Object;
    //   500: sipush #-13352
    //   503: sipush #-7731
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zk12.Zu : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCBCC) & 0xFFFF;
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
      byte b1 = 99;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk12.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */