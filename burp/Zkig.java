package burp;

import java.math.BigInteger;

class Zkig extends ClassLoader {
  static String ZE;
  
  static Object ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Ze(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg0j.ZV : Ljava/lang/Object;
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
    //   562: sipush #-26350
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Zm__.Zz : Ljava/lang/Object;
    //   580: sipush #5359
    //   583: getstatic burp/Zg99.ZZ : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: getstatic burp/Zzsq.Zh : Ljava/lang/Object;
    //   592: checkcast java/math/BigInteger
    //   595: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   598: putstatic burp/Ze3d.Ze : Ljava/lang/Object;
    //   601: invokestatic a : (II)Ljava/lang/String;
    //   604: iconst_1
    //   605: ldc burp/Zsn4
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
    //   723: sipush #-26352
    //   726: sipush #2507
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
    //   765: sipush #-26346
    //   768: sipush #-14395
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
    //   924: getstatic burp/Zg_p.ZO : Ljava/lang/String;
    //   927: getstatic burp/Zkbf.Zx : Ljava/lang/Object;
    //   930: checkcast java/math/BigInteger
    //   933: invokevirtual intValue : ()I
    //   936: bipush #32
    //   938: irem
    //   939: invokestatic abs : (I)I
    //   942: invokevirtual charAt : (I)C
    //   945: getstatic burp/Zbsr.Zq : Ljava/lang/String;
    //   948: getstatic burp/Zsby.ZZ : Ljava/lang/Object;
    //   951: checkcast java/math/BigInteger
    //   954: invokevirtual intValue : ()I
    //   957: bipush #32
    //   959: irem
    //   960: invokestatic abs : (I)I
    //   963: invokevirtual charAt : (I)C
    //   966: if_icmpgt -> 1073
    //   969: getstatic burp/Zx4l.Zy : Ljava/lang/String;
    //   972: getstatic burp/Zr0g.Zj : Ljava/lang/Object;
    //   975: checkcast java/math/BigInteger
    //   978: invokevirtual intValue : ()I
    //   981: bipush #32
    //   983: irem
    //   984: invokestatic abs : (I)I
    //   987: invokevirtual charAt : (I)C
    //   990: getstatic burp/Zrbp.Ze : Ljava/lang/String;
    //   993: getstatic burp/Zb2s.Ze : Ljava/lang/Object;
    //   996: checkcast java/math/BigInteger
    //   999: invokevirtual intValue : ()I
    //   1002: bipush #32
    //   1004: irem
    //   1005: invokestatic abs : (I)I
    //   1008: invokevirtual charAt : (I)C
    //   1011: if_icmpgt -> 1073
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: getstatic burp/Zgw0.ZL : Ljava/lang/String;
    //   1024: getstatic burp/Zl_k.ZH : Ljava/lang/Object;
    //   1027: checkcast java/math/BigInteger
    //   1030: invokevirtual intValue : ()I
    //   1033: bipush #32
    //   1035: irem
    //   1036: invokestatic abs : (I)I
    //   1039: invokevirtual charAt : (I)C
    //   1042: getstatic burp/Zedz.Zh : Ljava/lang/String;
    //   1045: getstatic burp/Zd1.ZV : Ljava/lang/Object;
    //   1048: checkcast java/math/BigInteger
    //   1051: invokevirtual intValue : ()I
    //   1054: bipush #32
    //   1056: irem
    //   1057: invokestatic abs : (I)I
    //   1060: invokevirtual charAt : (I)C
    //   1063: if_icmpgt -> 1081
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
  
  static void Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZE(Object paramObject) {
    Zlhm.Zx = a(-26351, 5362);
    Zlhm.ZT = new BigInteger(a(-26347, -29429));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxzd.ZM.charAt(Math.abs(((BigInteger)Zlv6.ZN).intValue() % 32)) <= Zgss.Zc.charAt(Math.abs(((BigInteger)Zgss.Zl).intValue() % 32))) {
          try {
            Zg_p.ZA(Class.forName(a(-26338, -26946)));
            if (!bool)
              Ze0z.Zo(Class.forName(a(-26349, 32483))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze0z.Zo(Class.forName(a(-26349, 32483)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ï[{bñAMöõúb$_8xá<x_`ÓwW+¥}j,³Rp¸Ñt4m$0!odntXdºÊJîÚ4:ï\\tÅ-jíiXYà<n óKÆé3lø9Ì¼ý]´Â8&_BÀ¾ôõ¡(LÌkCñîõ>â\\fÈ\\f|ÎûÝk\\bäV%å·A Þ»J)àJùTÙÜ\\n8"öÖÍæÑ7ÔâiêUÎÜ/U¢ËB~Â#aI)7\\t@>ªo\sFg\\t.gjåÓ©TÎ¨9·'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #8
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
    //   68: ldc 'ÜÓ3á·å_b¬Ò1U¥a;#<oÈ\\tôÿç.Ôl'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #125
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
    //   129: putstatic burp/Zkig.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zkig.b : [Ljava/lang/String;
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
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #104
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #7
    //   229: goto -> 244
    //   232: bipush #92
    //   234: goto -> 244
    //   237: bipush #83
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
    //   300: sipush #-26348
    //   303: sipush #-16544
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zkig.ZE : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-26345
    //   319: sipush #19339
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zkig.ZK : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9916) & 0xFFFF;
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
      char c = 'Ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */