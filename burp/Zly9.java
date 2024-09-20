package burp;

import java.math.BigInteger;

class Zly9 extends ClassLoader {
  static String ZS;
  
  static Object Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zn(Object paramObject) {
    Zzna.Zi = a(31388, -377);
    Zzna.ZD = new BigInteger(a(31376, -31231));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zs3m.Zl.charAt(Math.abs(((BigInteger)Zlo0.Zu).intValue() % 32)) > Zx5w.Zq.charAt(Math.abs(((BigInteger)Zd9.Zr).intValue() % 32))) {
          try {
            Zxwl.Zk(Class.forName(a(31389, 28959)));
            if (!bool)
              Zsko.ZP(Class.forName(a(31378, 23689))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsko.ZP(Class.forName(a(31378, 23689)));
    } catch (Throwable throwable) {}
  }
  
  static void ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zk8i.ZN : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zz3b.Zu : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsko.ZD : Ljava/lang/Object;
    //   22: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: new java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: astore #5
    //   41: aload #5
    //   43: sipush #31385
    //   46: sipush #-5436
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_3
    //   57: astore #6
    //   59: aload #6
    //   61: arraylength
    //   62: istore #7
    //   64: iconst_0
    //   65: istore #8
    //   67: iload #8
    //   69: iload #7
    //   71: if_icmpge -> 97
    //   74: aload #6
    //   76: iload #8
    //   78: baload
    //   79: istore #9
    //   81: aload #5
    //   83: iload #9
    //   85: i2c
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: iinc #8, 1
    //   93: iload_2
    //   94: ifeq -> 67
    //   97: aload #5
    //   99: sipush #31386
    //   102: sipush #16317
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: ldc ''
    //   110: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   113: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload #5
    //   122: sipush #31387
    //   125: sipush #-15943
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: ldc ''
    //   133: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload #5
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: invokevirtual getBytes : ()[B
    //   151: astore #4
    //   153: aload #4
    //   155: astore_3
    //   156: aload_3
    //   157: arraylength
    //   158: bipush #8
    //   160: iadd
    //   161: bipush #6
    //   163: ishr
    //   164: iconst_1
    //   165: iadd
    //   166: bipush #16
    //   168: imul
    //   169: newarray int
    //   171: astore #5
    //   173: iconst_0
    //   174: istore #6
    //   176: iload #6
    //   178: aload_3
    //   179: arraylength
    //   180: if_icmpge -> 223
    //   183: aload_3
    //   184: iload #6
    //   186: baload
    //   187: sipush #255
    //   190: iand
    //   191: istore #7
    //   193: aload #5
    //   195: iload #6
    //   197: iconst_2
    //   198: ishr
    //   199: dup2
    //   200: iaload
    //   201: iload #7
    //   203: bipush #24
    //   205: iload #6
    //   207: iconst_4
    //   208: irem
    //   209: bipush #8
    //   211: imul
    //   212: isub
    //   213: ishl
    //   214: ior
    //   215: iastore
    //   216: iinc #6, 1
    //   219: iload_2
    //   220: ifeq -> 176
    //   223: aload #5
    //   225: iload #6
    //   227: iconst_2
    //   228: ishr
    //   229: dup2
    //   230: iaload
    //   231: sipush #128
    //   234: bipush #24
    //   236: iload #6
    //   238: iconst_4
    //   239: irem
    //   240: bipush #8
    //   242: imul
    //   243: isub
    //   244: ishl
    //   245: ior
    //   246: iastore
    //   247: aload #5
    //   249: aload #5
    //   251: arraylength
    //   252: iconst_1
    //   253: isub
    //   254: aload_3
    //   255: arraylength
    //   256: bipush #8
    //   258: imul
    //   259: iastore
    //   260: bipush #80
    //   262: newarray int
    //   264: astore #7
    //   266: ldc 1732584193
    //   268: istore #8
    //   270: ldc -271733879
    //   272: istore #9
    //   274: ldc -1732584194
    //   276: istore #10
    //   278: ldc 271733878
    //   280: istore #11
    //   282: ldc -1009589776
    //   284: istore #12
    //   286: iconst_0
    //   287: istore #6
    //   289: iload #6
    //   291: aload #5
    //   293: arraylength
    //   294: if_icmpge -> 616
    //   297: iload #8
    //   299: istore #13
    //   301: iload #9
    //   303: istore #14
    //   305: iload #10
    //   307: istore #15
    //   309: iload #11
    //   311: istore #16
    //   313: iload #12
    //   315: istore #17
    //   317: iconst_0
    //   318: istore #18
    //   320: iload #18
    //   322: bipush #80
    //   324: if_icmpge -> 574
    //   327: iload #18
    //   329: bipush #16
    //   331: if_icmpge -> 358
    //   334: aload #7
    //   336: iload #18
    //   338: aload #5
    //   340: iload #6
    //   342: iload #18
    //   344: iadd
    //   345: iaload
    //   346: iastore
    //   347: iload_2
    //   348: ifeq -> 413
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   357: athrow
    //   358: aload #7
    //   360: iload #18
    //   362: iconst_3
    //   363: isub
    //   364: iaload
    //   365: aload #7
    //   367: iload #18
    //   369: bipush #8
    //   371: isub
    //   372: iaload
    //   373: ixor
    //   374: aload #7
    //   376: iload #18
    //   378: bipush #14
    //   380: isub
    //   381: iaload
    //   382: ixor
    //   383: aload #7
    //   385: iload #18
    //   387: bipush #16
    //   389: isub
    //   390: iaload
    //   391: ixor
    //   392: istore #19
    //   394: iload #19
    //   396: iconst_1
    //   397: ishl
    //   398: iload #19
    //   400: bipush #31
    //   402: iushr
    //   403: ior
    //   404: istore #20
    //   406: aload #7
    //   408: iload #18
    //   410: iload #20
    //   412: iastore
    //   413: iload #8
    //   415: iconst_5
    //   416: ishl
    //   417: iload #8
    //   419: bipush #27
    //   421: iushr
    //   422: ior
    //   423: istore #19
    //   425: iload #19
    //   427: iload #12
    //   429: iadd
    //   430: aload #7
    //   432: iload #18
    //   434: iaload
    //   435: iadd
    //   436: iload #18
    //   438: bipush #20
    //   440: if_icmpge -> 466
    //   443: ldc 1518500249
    //   445: iload #9
    //   447: iload #10
    //   449: iand
    //   450: iload #9
    //   452: iconst_m1
    //   453: ixor
    //   454: iload #11
    //   456: iand
    //   457: ior
    //   458: iadd
    //   459: goto -> 536
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: iload #18
    //   468: bipush #40
    //   470: if_icmpge -> 491
    //   473: ldc 1859775393
    //   475: iload #9
    //   477: iload #10
    //   479: ixor
    //   480: iload #11
    //   482: ixor
    //   483: iadd
    //   484: goto -> 536
    //   487: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   490: athrow
    //   491: iload #18
    //   493: bipush #60
    //   495: if_icmpge -> 525
    //   498: ldc -1894007588
    //   500: iload #9
    //   502: iload #10
    //   504: iand
    //   505: iload #9
    //   507: iload #11
    //   509: iand
    //   510: ior
    //   511: iload #10
    //   513: iload #11
    //   515: iand
    //   516: ior
    //   517: iadd
    //   518: goto -> 536
    //   521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   524: athrow
    //   525: ldc -899497514
    //   527: iload #9
    //   529: iload #10
    //   531: ixor
    //   532: iload #11
    //   534: ixor
    //   535: iadd
    //   536: iadd
    //   537: istore #20
    //   539: iload #11
    //   541: istore #12
    //   543: iload #10
    //   545: istore #11
    //   547: iload #9
    //   549: bipush #30
    //   551: ishl
    //   552: iload #9
    //   554: iconst_2
    //   555: iushr
    //   556: ior
    //   557: istore #10
    //   559: iload #8
    //   561: istore #9
    //   563: iload #20
    //   565: istore #8
    //   567: iinc #18, 1
    //   570: iload_2
    //   571: ifeq -> 320
    //   574: iload #8
    //   576: iload #13
    //   578: iadd
    //   579: istore #8
    //   581: iload #9
    //   583: iload #14
    //   585: iadd
    //   586: istore #9
    //   588: iload #10
    //   590: iload #15
    //   592: iadd
    //   593: istore #10
    //   595: iload #11
    //   597: iload #16
    //   599: iadd
    //   600: istore #11
    //   602: iload #12
    //   604: iload #17
    //   606: iadd
    //   607: istore #12
    //   609: iinc #6, 16
    //   612: iload_2
    //   613: ifeq -> 289
    //   616: iconst_5
    //   617: newarray int
    //   619: dup
    //   620: iconst_0
    //   621: iload #8
    //   623: iastore
    //   624: dup
    //   625: iconst_1
    //   626: iload #9
    //   628: iastore
    //   629: dup
    //   630: iconst_2
    //   631: iload #10
    //   633: iastore
    //   634: dup
    //   635: iconst_3
    //   636: iload #11
    //   638: iastore
    //   639: dup
    //   640: iconst_4
    //   641: iload #12
    //   643: iastore
    //   644: astore #13
    //   646: bipush #20
    //   648: newarray byte
    //   650: astore #14
    //   652: iconst_0
    //   653: istore #15
    //   655: iload #15
    //   657: bipush #20
    //   659: if_icmpge -> 700
    //   662: aload #13
    //   664: iload #15
    //   666: iconst_4
    //   667: idiv
    //   668: iaload
    //   669: istore #16
    //   671: iconst_3
    //   672: iload #15
    //   674: iconst_4
    //   675: irem
    //   676: isub
    //   677: bipush #8
    //   679: imul
    //   680: istore #17
    //   682: aload #14
    //   684: iload #15
    //   686: iload #16
    //   688: iload #17
    //   690: iushr
    //   691: i2b
    //   692: bastore
    //   693: iinc #15, 1
    //   696: iload_2
    //   697: ifeq -> 655
    //   700: aload #14
    //   702: astore #4
    //   704: sipush #31390
    //   707: sipush #-29253
    //   710: invokestatic a : (II)Ljava/lang/String;
    //   713: iconst_1
    //   714: ldc burp/Zbz_
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
    //   832: sipush #31384
    //   835: sipush #-17202
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
    //   874: sipush #31377
    //   877: sipush #22184
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
    //   1033: getstatic burp/Zm7v.ZX : Ljava/lang/String;
    //   1036: getstatic burp/Zlcc.ZP : Ljava/lang/Object;
    //   1039: checkcast java/math/BigInteger
    //   1042: invokevirtual intValue : ()I
    //   1045: bipush #32
    //   1047: irem
    //   1048: invokestatic abs : (I)I
    //   1051: invokevirtual charAt : (I)C
    //   1054: getstatic burp/Zewr.ZW : Ljava/lang/String;
    //   1057: getstatic burp/Zk1.Z_ : Ljava/lang/Object;
    //   1060: checkcast java/math/BigInteger
    //   1063: invokevirtual intValue : ()I
    //   1066: bipush #32
    //   1068: irem
    //   1069: invokestatic abs : (I)I
    //   1072: invokevirtual charAt : (I)C
    //   1075: if_icmpgt -> 1182
    //   1078: getstatic burp/Zxdy.Zm : Ljava/lang/String;
    //   1081: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   1084: checkcast java/math/BigInteger
    //   1087: invokevirtual intValue : ()I
    //   1090: bipush #32
    //   1092: irem
    //   1093: invokestatic abs : (I)I
    //   1096: invokevirtual charAt : (I)C
    //   1099: getstatic burp/Ztq4.Zb : Ljava/lang/String;
    //   1102: getstatic burp/Zrqi.Zb : Ljava/lang/Object;
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
    //   1130: getstatic burp/Zmt_.ZH : Ljava/lang/String;
    //   1133: getstatic burp/Zl2t.ZS : Ljava/lang/Object;
    //   1136: checkcast java/math/BigInteger
    //   1139: invokevirtual intValue : ()I
    //   1142: bipush #32
    //   1144: irem
    //   1145: invokestatic abs : (I)I
    //   1148: invokevirtual charAt : (I)C
    //   1151: getstatic burp/Zsn9.Zp : Ljava/lang/String;
    //   1154: getstatic burp/Zrwp.Zk : Ljava/lang/Object;
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
    //   327	351	354	java/lang/Throwable
    //   425	462	462	java/lang/Throwable
    //   466	487	487	java/lang/Throwable
    //   491	521	521	java/lang/Throwable
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
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\¥Ñ ¬¸\©0ó\\t\\f+ûmDq/KV­p[â¤<\åf5ÓïCò\\tõ¤9\\n¤GÈ>ß ,¨õ=7ÜðÆe'[åF6U¾GSJ÷³x¥èY,ÜÇ\\tz?\\t~XªQ#Z5!Ê gÙÜ>`X*¯°@\\f÷ ÆÚgDÀ¿´¾\ª#>ÓMh®1Ç´ß©$zÓ=Ä®ä#Í5Ìîª ä:pTLÎÖ Ó¥n¤ïÄÿhNÁ3.Ìôn´í _£¸F1OJz'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #31
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
    //   67: ldc 'Ë·¿µ\\tY>Ò°ÌÛn'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #73
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
    //   128: putstatic burp/Zly9.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zly9.b : [Ljava/lang/String;
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
    //   212: bipush #76
    //   214: goto -> 244
    //   217: bipush #19
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #111
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #69
    //   239: goto -> 244
    //   242: bipush #8
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
    //   300: sipush #31391
    //   303: sipush #5693
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zly9.ZS : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: iconst_2
    //   323: bastore
    //   324: dup
    //   325: iconst_1
    //   326: bipush #127
    //   328: bastore
    //   329: dup
    //   330: iconst_2
    //   331: bipush #93
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #-14
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #34
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #-24
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #-45
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #100
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #-53
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #17
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #44
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-77
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-104
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #70
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #-42
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: iconst_2
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #-111
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #-20
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #-68
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #-43
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #41
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: bipush #12
    //   443: bastore
    //   444: dup
    //   445: bipush #22
    //   447: bipush #-27
    //   449: bastore
    //   450: dup
    //   451: bipush #23
    //   453: bipush #123
    //   455: bastore
    //   456: dup
    //   457: bipush #24
    //   459: bipush #8
    //   461: bastore
    //   462: dup
    //   463: bipush #25
    //   465: bipush #84
    //   467: bastore
    //   468: dup
    //   469: bipush #26
    //   471: bipush #73
    //   473: bastore
    //   474: dup
    //   475: bipush #27
    //   477: bipush #-101
    //   479: bastore
    //   480: dup
    //   481: bipush #28
    //   483: bipush #78
    //   485: bastore
    //   486: dup
    //   487: bipush #29
    //   489: bipush #116
    //   491: bastore
    //   492: dup
    //   493: bipush #30
    //   495: bipush #83
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #-126
    //   503: bastore
    //   504: invokespecial <init> : ([B)V
    //   507: putstatic burp/Zly9.Zz : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7A98) & 0xFFFF;
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
      byte b1 = 9;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zly9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */