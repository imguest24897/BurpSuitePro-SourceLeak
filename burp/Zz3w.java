package burp;

import java.math.BigInteger;

class Zz3w extends ClassLoader {
  static Object ZX;
  
  static String ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZM(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zbxp.ZW : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zxtc.ZF : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zgvf.Zd : Ljava/lang/Object;
    //   22: getstatic burp/Zeor.Zb : Ljava/lang/Object;
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
    //   96: ifne -> 52
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
    //   224: ifne -> 289
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
    //   447: ifne -> 196
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
    //   489: ifne -> 165
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
    //   573: ifne -> 531
    //   576: aload #14
    //   578: astore #4
    //   580: sipush #-25068
    //   583: new java/math/BigInteger
    //   586: dup
    //   587: aload #4
    //   589: invokespecial <init> : ([B)V
    //   592: invokevirtual abs : ()Ljava/math/BigInteger;
    //   595: putstatic burp/Zme.Zd : Ljava/lang/Object;
    //   598: sipush #17882
    //   601: invokestatic a : (II)Ljava/lang/String;
    //   604: iconst_1
    //   605: ldc burp/Zxd4
    //   607: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   610: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   613: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   616: astore_3
    //   617: aload_3
    //   618: arraylength
    //   619: istore #4
    //   621: iconst_0
    //   622: istore #5
    //   624: iload #5
    //   626: iload #4
    //   628: if_icmpge -> 765
    //   631: aload_3
    //   632: iload #5
    //   634: aaload
    //   635: astore #6
    //   637: aload #6
    //   639: invokevirtual getModifiers : ()I
    //   642: invokestatic isStatic : (I)Z
    //   645: ifne -> 655
    //   648: goto -> 758
    //   651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   654: athrow
    //   655: aload #6
    //   657: invokevirtual getType : ()Ljava/lang/Class;
    //   660: astore #7
    //   662: aload #7
    //   664: ifnull -> 745
    //   667: aload #7
    //   669: invokevirtual isPrimitive : ()Z
    //   672: ifne -> 745
    //   675: goto -> 682
    //   678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   681: athrow
    //   682: aload #7
    //   684: invokevirtual getPackage : ()Ljava/lang/Package;
    //   687: ifnull -> 745
    //   690: goto -> 697
    //   693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   696: athrow
    //   697: aload #7
    //   699: invokevirtual getPackage : ()Ljava/lang/Package;
    //   702: invokevirtual getName : ()Ljava/lang/String;
    //   705: ifnull -> 745
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload #7
    //   717: invokevirtual getPackage : ()Ljava/lang/Package;
    //   720: invokevirtual getName : ()Ljava/lang/String;
    //   723: sipush #-25066
    //   726: sipush #18949
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   735: ifne -> 745
    //   738: goto -> 745
    //   741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   744: athrow
    //   745: aload #6
    //   747: iconst_1
    //   748: invokevirtual setAccessible : (Z)V
    //   751: aload #6
    //   753: aconst_null
    //   754: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   757: pop
    //   758: iinc #5, 1
    //   761: iload_2
    //   762: ifne -> 624
    //   765: sipush #-25065
    //   768: sipush #391
    //   771: invokestatic a : (II)Ljava/lang/String;
    //   774: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   777: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   780: astore_3
    //   781: aload_3
    //   782: arraylength
    //   783: istore #4
    //   785: iconst_0
    //   786: istore #5
    //   788: iload #5
    //   790: iload #4
    //   792: if_icmpge -> 924
    //   795: aload_3
    //   796: iload #5
    //   798: aaload
    //   799: astore #6
    //   801: aload #6
    //   803: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   806: pop
    //   807: aload #6
    //   809: invokevirtual getModifiers : ()I
    //   812: invokestatic isStatic : (I)Z
    //   815: ifeq -> 910
    //   818: aload #6
    //   820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   823: arraylength
    //   824: iconst_2
    //   825: if_icmpne -> 910
    //   828: goto -> 835
    //   831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   834: athrow
    //   835: aload #6
    //   837: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   840: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   843: invokevirtual equals : (Ljava/lang/Object;)Z
    //   846: ifeq -> 910
    //   849: goto -> 856
    //   852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   855: athrow
    //   856: aload #6
    //   858: iconst_1
    //   859: invokevirtual setAccessible : (Z)V
    //   862: aload #6
    //   864: aconst_null
    //   865: iconst_2
    //   866: anewarray java/lang/Object
    //   869: dup
    //   870: iconst_0
    //   871: aload_0
    //   872: aastore
    //   873: dup
    //   874: iconst_1
    //   875: aload_1
    //   876: ifnonnull -> 894
    //   879: goto -> 886
    //   882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   885: athrow
    //   886: aload_1
    //   887: goto -> 901
    //   890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   893: athrow
    //   894: aload_1
    //   895: checkcast [B
    //   898: invokevirtual clone : ()Ljava/lang/Object;
    //   901: aastore
    //   902: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   905: pop
    //   906: iload_2
    //   907: ifne -> 924
    //   910: iinc #5, 1
    //   913: iload_2
    //   914: ifne -> 788
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: getstatic burp/Zg_p.ZO : Ljava/lang/String;
    //   927: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   930: checkcast java/math/BigInteger
    //   933: invokevirtual intValue : ()I
    //   936: bipush #32
    //   938: irem
    //   939: invokestatic abs : (I)I
    //   942: invokevirtual charAt : (I)C
    //   945: getstatic burp/Zsf4.ZA : Ljava/lang/String;
    //   948: getstatic burp/Zb_u.Zp : Ljava/lang/Object;
    //   951: checkcast java/math/BigInteger
    //   954: invokevirtual intValue : ()I
    //   957: bipush #32
    //   959: irem
    //   960: invokestatic abs : (I)I
    //   963: invokevirtual charAt : (I)C
    //   966: if_icmple -> 1081
    //   969: getstatic burp/Zzc_.Zg : Ljava/lang/String;
    //   972: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   975: checkcast java/math/BigInteger
    //   978: invokevirtual intValue : ()I
    //   981: bipush #32
    //   983: irem
    //   984: invokestatic abs : (I)I
    //   987: invokevirtual charAt : (I)C
    //   990: getstatic burp/Zgia.Zh : Ljava/lang/String;
    //   993: getstatic burp/Zzr.ZZ : Ljava/lang/Object;
    //   996: checkcast java/math/BigInteger
    //   999: invokevirtual intValue : ()I
    //   1002: bipush #32
    //   1004: irem
    //   1005: invokestatic abs : (I)I
    //   1008: invokevirtual charAt : (I)C
    //   1011: if_icmple -> 1081
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: getstatic burp/Zktq.Zc : Ljava/lang/String;
    //   1024: getstatic burp/Zxzp.Zh : Ljava/lang/Object;
    //   1027: checkcast java/math/BigInteger
    //   1030: invokevirtual intValue : ()I
    //   1033: bipush #32
    //   1035: irem
    //   1036: invokestatic abs : (I)I
    //   1039: invokevirtual charAt : (I)C
    //   1042: getstatic burp/Zl_k.Zw : Ljava/lang/String;
    //   1045: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   1048: checkcast java/math/BigInteger
    //   1051: invokevirtual intValue : ()I
    //   1054: bipush #32
    //   1056: irem
    //   1057: invokestatic abs : (I)I
    //   1060: invokevirtual charAt : (I)C
    //   1063: if_icmple -> 1081
    //   1066: goto -> 1073
    //   1069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1072: athrow
    //   1073: iconst_1
    //   1074: goto -> 1082
    //   1077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1080: athrow
    //   1081: iconst_0
    //   1082: ireturn
    //   1083: astore_3
    //   1084: new java/lang/Exception
    //   1087: dup
    //   1088: aload_3
    //   1089: invokevirtual getMessage : ()Ljava/lang/String;
    //   1092: invokespecial <init> : (Ljava/lang/String;)V
    //   1095: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1082	1083	java/lang/Throwable
    //   203	227	230	java/lang/Throwable
    //   301	338	338	java/lang/Throwable
    //   342	363	363	java/lang/Throwable
    //   367	397	397	java/lang/Throwable
    //   637	651	651	java/lang/Throwable
    //   662	675	678	java/lang/Throwable
    //   667	690	693	java/lang/Throwable
    //   682	708	711	java/lang/Throwable
    //   697	738	741	java/lang/Throwable
    //   801	828	831	java/lang/Throwable
    //   818	849	852	java/lang/Throwable
    //   835	879	882	java/lang/Throwable
    //   856	890	890	java/lang/Throwable
    //   901	917	920	java/lang/Throwable
    //   924	1014	1017	java/lang/Throwable
    //   969	1066	1069	java/lang/Throwable
    //   1021	1077	1077	java/lang/Throwable
  }
  
  static void ZE(Object paramObject) {
    Zgwu.Zd = a(-25067, -3410);
    Zgwu.ZD = new BigInteger(a(-25072, -5760));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zkf9.ZS.charAt(Math.abs(((BigInteger)Zro5.ZT).intValue() % 32)) > Zgw_.ZH.charAt(Math.abs(((BigInteger)Ztdx.ZX).intValue() % 32))) {
          try {
            Zk12.ZP(Class.forName(a(-25071, 4544)));
            if (!bool)
              Zlpn.ZA(Class.forName(a(-25070, -2721))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlpn.ZA(Class.forName(a(-25070, -2721)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'zÔ?v«íMF¤\\nÖ³nÛ­ÌÖñêFz°fÑÃº]Óêø5C9èLZEC3v©+9ï-ÁôÝ¼zÛw¡Éþýx%ua¦Ai]ÎM7îÌæèwß ø}tX÷k´\\rZjÞóÛ?zOïµkw*©lxÇo:(q§É8ðÏ &ÆÍÕZj&À\\tôÌ(ÂAZæÂTDé\\bøËö5ZN \\tNz\°½°Å"öñÛál"@Ü ËôñÌ=2\\tlEäf«\\td¤Ø´ðq'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #48
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
    //   68: ldc 'ÖF¹h 5Üí¤yëÎo¼$!ù×¯âñ\\fD?¯+ÂTÝ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #37
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
    //   128: putstatic burp/Zz3w.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zz3w.b : [Ljava/lang/String;
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
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #16
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #120
    //   239: goto -> 244
    //   242: bipush #30
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #-25069
    //   307: sipush #6282
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zz3w.ZX : Ljava/lang/Object;
    //   319: sipush #-25063
    //   322: sipush #31626
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zz3w.ZB : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9E11) & 0xFFFF;
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
      byte b1 = 78;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */