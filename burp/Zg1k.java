package burp;

import java.math.BigInteger;

class Zg1k extends ClassLoader {
  static Object ZG;
  
  static String Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZQ(Object paramObject) {
    Zeai.ZA = a(21813, -27381);
    Zeai.ZI = new BigInteger(a(21823, -12390));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmdm.Za.charAt(Math.abs(((BigInteger)Zl15.Zn).intValue() % 32)) > Zza3.ZU.charAt(Math.abs(((BigInteger)Zxee.Zj).intValue() % 32))) {
          try {
            Ztid.ZV(Class.forName(a(21822, 24298)));
            if (!bool)
              Zlhu.ZE(Class.forName(a(21816, -14134))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlhu.ZE(Class.forName(a(21816, -14134)));
    } catch (Throwable throwable) {}
  }
  
  static void Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zre4.Zx : Ljava/lang/Object;
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
    //   78: ifeq -> 34
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
    //   206: ifeq -> 271
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
    //   429: ifeq -> 178
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
    //   471: ifeq -> 147
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
    //   555: ifeq -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: sipush #21820
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Ztpg.Z_ : Ljava/lang/Object;
    //   580: sipush #-6891
    //   583: getstatic burp/Zre4.Zx : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: getstatic burp/Zg1k.ZG : Ljava/lang/Object;
    //   592: checkcast java/math/BigInteger
    //   595: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   598: putstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   601: invokestatic a : (II)Ljava/lang/String;
    //   604: iconst_1
    //   605: ldc burp/Zxtc
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
    //   723: sipush #21821
    //   726: sipush #-13978
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
    //   762: ifeq -> 624
    //   765: sipush #21819
    //   768: sipush #12002
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
    //   907: ifeq -> 924
    //   910: iinc #5, 1
    //   913: iload_2
    //   914: ifeq -> 788
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: getstatic burp/Zszm.Zf : Ljava/lang/String;
    //   927: getstatic burp/Zkfb.ZN : Ljava/lang/Object;
    //   930: checkcast java/math/BigInteger
    //   933: invokevirtual intValue : ()I
    //   936: bipush #32
    //   938: irem
    //   939: invokestatic abs : (I)I
    //   942: invokevirtual charAt : (I)C
    //   945: getstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   948: getstatic burp/Zrt9.Zy : Ljava/lang/Object;
    //   951: checkcast java/math/BigInteger
    //   954: invokevirtual intValue : ()I
    //   957: bipush #32
    //   959: irem
    //   960: invokestatic abs : (I)I
    //   963: invokevirtual charAt : (I)C
    //   966: if_icmple -> 1081
    //   969: getstatic burp/Zb8_.ZP : Ljava/lang/String;
    //   972: getstatic burp/Zt5a.Zs : Ljava/lang/Object;
    //   975: checkcast java/math/BigInteger
    //   978: invokevirtual intValue : ()I
    //   981: bipush #32
    //   983: irem
    //   984: invokestatic abs : (I)I
    //   987: invokevirtual charAt : (I)C
    //   990: getstatic burp/Zzpj.ZR : Ljava/lang/String;
    //   993: getstatic burp/Zs5i.ZD : Ljava/lang/Object;
    //   996: checkcast java/math/BigInteger
    //   999: invokevirtual intValue : ()I
    //   1002: bipush #32
    //   1004: irem
    //   1005: invokestatic abs : (I)I
    //   1008: invokevirtual charAt : (I)C
    //   1011: if_icmpgt -> 1081
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: getstatic burp/Zz8o.Zo : Ljava/lang/String;
    //   1024: getstatic burp/Zzhu.ZW : Ljava/lang/Object;
    //   1027: checkcast java/math/BigInteger
    //   1030: invokevirtual intValue : ()I
    //   1033: bipush #32
    //   1035: irem
    //   1036: invokestatic abs : (I)I
    //   1039: invokevirtual charAt : (I)C
    //   1042: getstatic burp/Zbxa.ZY : Ljava/lang/String;
    //   1045: getstatic burp/Zth8.Zk : Ljava/lang/Object;
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
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
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
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'àîË\\tÔç®ã+³M7À]4¾¿÷\\b1yé¾Ùë6\\t0¥P[*6Ú¥-lúã4ØúÃ¶K>µs`«Tÿ6ELªðZ¥\\tÅË8m?9X\ov\\tLeÌ³V=-MdüÞ >.kÞ§Fé@ho§èoûOÊQVúâÄÈºÝ_RÎo#¿0¯vv«1þ}ò\PlSÕ¡ |\\tkÚ§$x;ý\\t}½\\bÂ·<\\t»aí3g1¾'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #107
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
    //   67: ldc 'Õ\\bÒÜ¹²°Co\\f­>Òÿ«Ðá·¶¸LuGü÷Ød juÜj<pÁÏéH·'CçÆ©/±*aYöX3'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #110
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
    //   128: putstatic burp/Zg1k.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg1k.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #98
    //   214: goto -> 243
    //   217: bipush #30
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #120
    //   228: goto -> 243
    //   231: bipush #43
    //   233: goto -> 243
    //   236: bipush #50
    //   238: goto -> 243
    //   241: bipush #63
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #21817
    //   307: sipush #-18891
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zg1k.ZG : Ljava/lang/Object;
    //   319: sipush #21818
    //   322: sipush #9663
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zg1k.Ze : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x553D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */