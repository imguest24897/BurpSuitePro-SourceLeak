package burp;

import java.math.BigInteger;

class Zgtx extends ClassLoader {
  static Object Z_;
  
  static String ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZO(Object paramObject) {
    Zgsy.Zv = a(27158, 32228);
    Zgsy.ZC = new BigInteger(a(27159, -30212));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxzv.ZI.charAt(Math.abs(((BigInteger)Zkhf.ZU).intValue() % 32)) > Zegj.ZS.charAt(Math.abs(((BigInteger)Zrle.Zl).intValue() % 32))) {
          try {
            Zxyq.ZT(Class.forName(a(27161, -29024)));
            if (!bool)
              Zsjw.ZH(Class.forName(a(27155, -10315))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsjw.ZH(Class.forName(a(27155, -10315)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm69.Zg : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #27152
    //   28: sipush #27818
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_3
    //   39: astore #6
    //   41: aload #6
    //   43: arraylength
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iload #8
    //   51: iload #7
    //   53: if_icmpge -> 79
    //   56: aload #6
    //   58: iload #8
    //   60: baload
    //   61: istore #9
    //   63: aload #5
    //   65: iload #9
    //   67: i2c
    //   68: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iinc #8, 1
    //   75: iload_2
    //   76: ifeq -> 49
    //   79: aload #5
    //   81: sipush #27160
    //   84: sipush #-30111
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #27157
    //   107: sipush #19681
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: ldc ''
    //   115: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   118: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #5
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokevirtual getBytes : ()[B
    //   133: astore #4
    //   135: aload #4
    //   137: astore_3
    //   138: aload_3
    //   139: arraylength
    //   140: bipush #8
    //   142: iadd
    //   143: bipush #6
    //   145: ishr
    //   146: iconst_1
    //   147: iadd
    //   148: bipush #16
    //   150: imul
    //   151: newarray int
    //   153: astore #5
    //   155: iconst_0
    //   156: istore #6
    //   158: iload #6
    //   160: aload_3
    //   161: arraylength
    //   162: if_icmpge -> 205
    //   165: aload_3
    //   166: iload #6
    //   168: baload
    //   169: sipush #255
    //   172: iand
    //   173: istore #7
    //   175: aload #5
    //   177: iload #6
    //   179: iconst_2
    //   180: ishr
    //   181: dup2
    //   182: iaload
    //   183: iload #7
    //   185: bipush #24
    //   187: iload #6
    //   189: iconst_4
    //   190: irem
    //   191: bipush #8
    //   193: imul
    //   194: isub
    //   195: ishl
    //   196: ior
    //   197: iastore
    //   198: iinc #6, 1
    //   201: iload_2
    //   202: ifeq -> 158
    //   205: aload #5
    //   207: iload #6
    //   209: iconst_2
    //   210: ishr
    //   211: dup2
    //   212: iaload
    //   213: sipush #128
    //   216: bipush #24
    //   218: iload #6
    //   220: iconst_4
    //   221: irem
    //   222: bipush #8
    //   224: imul
    //   225: isub
    //   226: ishl
    //   227: ior
    //   228: iastore
    //   229: aload #5
    //   231: aload #5
    //   233: arraylength
    //   234: iconst_1
    //   235: isub
    //   236: aload_3
    //   237: arraylength
    //   238: bipush #8
    //   240: imul
    //   241: iastore
    //   242: bipush #80
    //   244: newarray int
    //   246: astore #7
    //   248: ldc 1732584193
    //   250: istore #8
    //   252: ldc -271733879
    //   254: istore #9
    //   256: ldc -1732584194
    //   258: istore #10
    //   260: ldc 271733878
    //   262: istore #11
    //   264: ldc -1009589776
    //   266: istore #12
    //   268: iconst_0
    //   269: istore #6
    //   271: iload #6
    //   273: aload #5
    //   275: arraylength
    //   276: if_icmpge -> 598
    //   279: iload #8
    //   281: istore #13
    //   283: iload #9
    //   285: istore #14
    //   287: iload #10
    //   289: istore #15
    //   291: iload #11
    //   293: istore #16
    //   295: iload #12
    //   297: istore #17
    //   299: iconst_0
    //   300: istore #18
    //   302: iload #18
    //   304: bipush #80
    //   306: if_icmpge -> 556
    //   309: iload #18
    //   311: bipush #16
    //   313: if_icmpge -> 340
    //   316: aload #7
    //   318: iload #18
    //   320: aload #5
    //   322: iload #6
    //   324: iload #18
    //   326: iadd
    //   327: iaload
    //   328: iastore
    //   329: iload_2
    //   330: ifeq -> 395
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   339: athrow
    //   340: aload #7
    //   342: iload #18
    //   344: iconst_3
    //   345: isub
    //   346: iaload
    //   347: aload #7
    //   349: iload #18
    //   351: bipush #8
    //   353: isub
    //   354: iaload
    //   355: ixor
    //   356: aload #7
    //   358: iload #18
    //   360: bipush #14
    //   362: isub
    //   363: iaload
    //   364: ixor
    //   365: aload #7
    //   367: iload #18
    //   369: bipush #16
    //   371: isub
    //   372: iaload
    //   373: ixor
    //   374: istore #19
    //   376: iload #19
    //   378: iconst_1
    //   379: ishl
    //   380: iload #19
    //   382: bipush #31
    //   384: iushr
    //   385: ior
    //   386: istore #20
    //   388: aload #7
    //   390: iload #18
    //   392: iload #20
    //   394: iastore
    //   395: iload #8
    //   397: iconst_5
    //   398: ishl
    //   399: iload #8
    //   401: bipush #27
    //   403: iushr
    //   404: ior
    //   405: istore #19
    //   407: iload #19
    //   409: iload #12
    //   411: iadd
    //   412: aload #7
    //   414: iload #18
    //   416: iaload
    //   417: iadd
    //   418: iload #18
    //   420: bipush #20
    //   422: if_icmpge -> 448
    //   425: ldc 1518500249
    //   427: iload #9
    //   429: iload #10
    //   431: iand
    //   432: iload #9
    //   434: iconst_m1
    //   435: ixor
    //   436: iload #11
    //   438: iand
    //   439: ior
    //   440: iadd
    //   441: goto -> 518
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: iload #18
    //   450: bipush #40
    //   452: if_icmpge -> 473
    //   455: ldc 1859775393
    //   457: iload #9
    //   459: iload #10
    //   461: ixor
    //   462: iload #11
    //   464: ixor
    //   465: iadd
    //   466: goto -> 518
    //   469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   472: athrow
    //   473: iload #18
    //   475: bipush #60
    //   477: if_icmpge -> 507
    //   480: ldc -1894007588
    //   482: iload #9
    //   484: iload #10
    //   486: iand
    //   487: iload #9
    //   489: iload #11
    //   491: iand
    //   492: ior
    //   493: iload #10
    //   495: iload #11
    //   497: iand
    //   498: ior
    //   499: iadd
    //   500: goto -> 518
    //   503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   506: athrow
    //   507: ldc -899497514
    //   509: iload #9
    //   511: iload #10
    //   513: ixor
    //   514: iload #11
    //   516: ixor
    //   517: iadd
    //   518: iadd
    //   519: istore #20
    //   521: iload #11
    //   523: istore #12
    //   525: iload #10
    //   527: istore #11
    //   529: iload #9
    //   531: bipush #30
    //   533: ishl
    //   534: iload #9
    //   536: iconst_2
    //   537: iushr
    //   538: ior
    //   539: istore #10
    //   541: iload #8
    //   543: istore #9
    //   545: iload #20
    //   547: istore #8
    //   549: iinc #18, 1
    //   552: iload_2
    //   553: ifeq -> 302
    //   556: iload #8
    //   558: iload #13
    //   560: iadd
    //   561: istore #8
    //   563: iload #9
    //   565: iload #14
    //   567: iadd
    //   568: istore #9
    //   570: iload #10
    //   572: iload #15
    //   574: iadd
    //   575: istore #10
    //   577: iload #11
    //   579: iload #16
    //   581: iadd
    //   582: istore #11
    //   584: iload #12
    //   586: iload #17
    //   588: iadd
    //   589: istore #12
    //   591: iinc #6, 16
    //   594: iload_2
    //   595: ifeq -> 271
    //   598: iconst_5
    //   599: newarray int
    //   601: dup
    //   602: iconst_0
    //   603: iload #8
    //   605: iastore
    //   606: dup
    //   607: iconst_1
    //   608: iload #9
    //   610: iastore
    //   611: dup
    //   612: iconst_2
    //   613: iload #10
    //   615: iastore
    //   616: dup
    //   617: iconst_3
    //   618: iload #11
    //   620: iastore
    //   621: dup
    //   622: iconst_4
    //   623: iload #12
    //   625: iastore
    //   626: astore #13
    //   628: bipush #20
    //   630: newarray byte
    //   632: astore #14
    //   634: iconst_0
    //   635: istore #15
    //   637: iload #15
    //   639: bipush #20
    //   641: if_icmpge -> 682
    //   644: aload #13
    //   646: iload #15
    //   648: iconst_4
    //   649: idiv
    //   650: iaload
    //   651: istore #16
    //   653: iconst_3
    //   654: iload #15
    //   656: iconst_4
    //   657: irem
    //   658: isub
    //   659: bipush #8
    //   661: imul
    //   662: istore #17
    //   664: aload #14
    //   666: iload #15
    //   668: iload #16
    //   670: iload #17
    //   672: iushr
    //   673: i2b
    //   674: bastore
    //   675: iinc #15, 1
    //   678: iload_2
    //   679: ifeq -> 637
    //   682: aload #14
    //   684: astore #4
    //   686: sipush #27156
    //   689: getstatic burp/Zb6m.ZQ : Ljava/lang/Object;
    //   692: checkcast java/math/BigInteger
    //   695: getstatic burp/Zejz.ZF : Ljava/lang/Object;
    //   698: checkcast java/math/BigInteger
    //   701: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   704: putstatic burp/Zg6z.ZS : Ljava/lang/Object;
    //   707: sipush #-13432
    //   710: invokestatic a : (II)Ljava/lang/String;
    //   713: iconst_1
    //   714: ldc burp/Zrdy
    //   716: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   719: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   722: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   725: astore_3
    //   726: aload_3
    //   727: arraylength
    //   728: istore #4
    //   730: iconst_0
    //   731: istore #5
    //   733: iload #5
    //   735: iload #4
    //   737: if_icmpge -> 874
    //   740: aload_3
    //   741: iload #5
    //   743: aaload
    //   744: astore #6
    //   746: aload #6
    //   748: invokevirtual getModifiers : ()I
    //   751: invokestatic isStatic : (I)Z
    //   754: ifne -> 764
    //   757: goto -> 867
    //   760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   763: athrow
    //   764: aload #6
    //   766: invokevirtual getType : ()Ljava/lang/Class;
    //   769: astore #7
    //   771: aload #7
    //   773: ifnull -> 854
    //   776: aload #7
    //   778: invokevirtual isPrimitive : ()Z
    //   781: ifne -> 854
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   790: athrow
    //   791: aload #7
    //   793: invokevirtual getPackage : ()Ljava/lang/Package;
    //   796: ifnull -> 854
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   805: athrow
    //   806: aload #7
    //   808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   811: invokevirtual getName : ()Ljava/lang/String;
    //   814: ifnull -> 854
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   823: athrow
    //   824: aload #7
    //   826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   829: invokevirtual getName : ()Ljava/lang/String;
    //   832: sipush #27163
    //   835: sipush #-11057
    //   838: invokestatic a : (II)Ljava/lang/String;
    //   841: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   844: ifne -> 854
    //   847: goto -> 854
    //   850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   853: athrow
    //   854: aload #6
    //   856: iconst_1
    //   857: invokevirtual setAccessible : (Z)V
    //   860: aload #6
    //   862: aconst_null
    //   863: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   866: pop
    //   867: iinc #5, 1
    //   870: iload_2
    //   871: ifeq -> 733
    //   874: sipush #27153
    //   877: sipush #15618
    //   880: invokestatic a : (II)Ljava/lang/String;
    //   883: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   886: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   889: astore_3
    //   890: aload_3
    //   891: arraylength
    //   892: istore #4
    //   894: iconst_0
    //   895: istore #5
    //   897: iload #5
    //   899: iload #4
    //   901: if_icmpge -> 1033
    //   904: aload_3
    //   905: iload #5
    //   907: aaload
    //   908: astore #6
    //   910: aload #6
    //   912: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   915: pop
    //   916: aload #6
    //   918: invokevirtual getModifiers : ()I
    //   921: invokestatic isStatic : (I)Z
    //   924: ifeq -> 1019
    //   927: aload #6
    //   929: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   932: arraylength
    //   933: iconst_2
    //   934: if_icmpne -> 1019
    //   937: goto -> 944
    //   940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   943: athrow
    //   944: aload #6
    //   946: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   949: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   952: invokevirtual equals : (Ljava/lang/Object;)Z
    //   955: ifeq -> 1019
    //   958: goto -> 965
    //   961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   964: athrow
    //   965: aload #6
    //   967: iconst_1
    //   968: invokevirtual setAccessible : (Z)V
    //   971: aload #6
    //   973: aconst_null
    //   974: iconst_2
    //   975: anewarray java/lang/Object
    //   978: dup
    //   979: iconst_0
    //   980: aload_0
    //   981: aastore
    //   982: dup
    //   983: iconst_1
    //   984: aload_1
    //   985: ifnonnull -> 1003
    //   988: goto -> 995
    //   991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   994: athrow
    //   995: aload_1
    //   996: goto -> 1010
    //   999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1002: athrow
    //   1003: aload_1
    //   1004: checkcast [B
    //   1007: invokevirtual clone : ()Ljava/lang/Object;
    //   1010: aastore
    //   1011: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1014: pop
    //   1015: iload_2
    //   1016: ifeq -> 1033
    //   1019: iinc #5, 1
    //   1022: iload_2
    //   1023: ifeq -> 897
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1032: athrow
    //   1033: getstatic burp/Zm83.Zq : Ljava/lang/String;
    //   1036: getstatic burp/Zscf.ZG : Ljava/lang/Object;
    //   1039: checkcast java/math/BigInteger
    //   1042: invokevirtual intValue : ()I
    //   1045: bipush #32
    //   1047: irem
    //   1048: invokestatic abs : (I)I
    //   1051: invokevirtual charAt : (I)C
    //   1054: getstatic burp/Zbx4.ZS : Ljava/lang/String;
    //   1057: getstatic burp/Zmf2.Zx : Ljava/lang/Object;
    //   1060: checkcast java/math/BigInteger
    //   1063: invokevirtual intValue : ()I
    //   1066: bipush #32
    //   1068: irem
    //   1069: invokestatic abs : (I)I
    //   1072: invokevirtual charAt : (I)C
    //   1075: if_icmpgt -> 1182
    //   1078: getstatic burp/Zt85.ZR : Ljava/lang/String;
    //   1081: getstatic burp/Zk5k.Zr : Ljava/lang/Object;
    //   1084: checkcast java/math/BigInteger
    //   1087: invokevirtual intValue : ()I
    //   1090: bipush #32
    //   1092: irem
    //   1093: invokestatic abs : (I)I
    //   1096: invokevirtual charAt : (I)C
    //   1099: getstatic burp/Zlf7.ZM : Ljava/lang/String;
    //   1102: getstatic burp/Zepy.Ze : Ljava/lang/Object;
    //   1105: checkcast java/math/BigInteger
    //   1108: invokevirtual intValue : ()I
    //   1111: bipush #32
    //   1113: irem
    //   1114: invokestatic abs : (I)I
    //   1117: invokevirtual charAt : (I)C
    //   1120: if_icmple -> 1182
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1129: athrow
    //   1130: getstatic burp/Zgu4.Za : Ljava/lang/String;
    //   1133: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   1136: checkcast java/math/BigInteger
    //   1139: invokevirtual intValue : ()I
    //   1142: bipush #32
    //   1144: irem
    //   1145: invokestatic abs : (I)I
    //   1148: invokevirtual charAt : (I)C
    //   1151: getstatic burp/Zrzg.ZX : Ljava/lang/String;
    //   1154: getstatic burp/Ze7e.Z_ : Ljava/lang/Object;
    //   1157: checkcast java/math/BigInteger
    //   1160: invokevirtual intValue : ()I
    //   1163: bipush #32
    //   1165: irem
    //   1166: invokestatic abs : (I)I
    //   1169: invokevirtual charAt : (I)C
    //   1172: if_icmple -> 1190
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1181: athrow
    //   1182: iconst_1
    //   1183: goto -> 1191
    //   1186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1189: athrow
    //   1190: iconst_0
    //   1191: ireturn
    //   1192: astore_3
    //   1193: new java/lang/Exception
    //   1196: dup
    //   1197: aload_3
    //   1198: invokevirtual getMessage : ()Ljava/lang/String;
    //   1201: invokespecial <init> : (Ljava/lang/String;)V
    //   1204: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1191	1192	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   746	760	760	java/lang/Throwable
    //   771	784	787	java/lang/Throwable
    //   776	799	802	java/lang/Throwable
    //   791	817	820	java/lang/Throwable
    //   806	847	850	java/lang/Throwable
    //   910	937	940	java/lang/Throwable
    //   927	958	961	java/lang/Throwable
    //   944	988	991	java/lang/Throwable
    //   965	999	999	java/lang/Throwable
    //   1010	1026	1029	java/lang/Throwable
    //   1033	1123	1126	java/lang/Throwable
    //   1078	1175	1178	java/lang/Throwable
    //   1130	1186	1186	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'r°Ãl @ÿ¾Ëµgç_Y_ø/hµ·#*²úX-'\\tÝÂ4  ódõÆ(*ó6¥bðgÀâ,&>SõçJ;Téås?\\bD¹ÌR_x4\\tFrë+»Cµú\\tå@oï}MÌ¼ ìØmrh¬Æþt²·ÏS¹ä¿¬*¦²*ñæ5ilLEÅOÓÕ7åÄÝq¼¸wlC¯u¬}G ´Ï1 pæA¿å<®q9Of#\\r`Ëw¶pPM\\bè+n+âís@\\f¶ýD¤j\\tG,Ù¦^òÈ%'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #105
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
    //   68: ldc ' rñ@àjÚËÁ\\rv\\tBvA#Gí\©j_ÂÿÆBS$È¬ñÙþúU{¦ª©¾¦×øHåã=h<Ê®³êÿÞýä4øä"³'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #75
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #64
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
    //   129: putstatic burp/Zgtx.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgtx.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #10
    //   214: goto -> 243
    //   217: iconst_4
    //   218: goto -> 243
    //   221: bipush #104
    //   223: goto -> 243
    //   226: bipush #76
    //   228: goto -> 243
    //   231: bipush #62
    //   233: goto -> 243
    //   236: bipush #47
    //   238: goto -> 243
    //   241: bipush #34
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
    //   304: sipush #27162
    //   307: sipush #6388
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zgtx.Z_ : Ljava/lang/Object;
    //   319: sipush #27154
    //   322: sipush #3188
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zgtx.ZN : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6A10) & 0xFFFF;
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
      char c = 'ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgtx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */