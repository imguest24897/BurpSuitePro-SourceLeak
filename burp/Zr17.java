package burp;

import java.math.BigInteger;

class Zr17 extends ClassLoader {
  static String Zu;
  
  static Object ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zg(Object paramObject) {
    Zge2.ZT = a(7675, 27875);
    Zge2.Zv = new BigInteger(a(7677, 7066));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrqe.ZB.charAt(Math.abs(((BigInteger)Zgcg.Zi).intValue() % 32)) > Zm1d.ZE.charAt(Math.abs(((BigInteger)Zxcn.Zq).intValue() % 32))) {
          try {
            Ztvn.ZL(Class.forName(a(7673, 16767)));
            if (bool)
              Zbjx.ZJ(Class.forName(a(7674, -1704))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zbjx.ZJ(Class.forName(a(7674, -1704)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgeq.ZT : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zt8m.Zf : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxzv.Zg : Ljava/lang/Object;
    //   22: sipush #7679
    //   25: sipush #23701
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zram
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
    //   150: sipush #7676
    //   153: sipush #-3508
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
    //   192: sipush #7678
    //   195: sipush #-3478
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
    //   351: getstatic burp/Zzii.ZO : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: aload_3
    //   362: arraylength
    //   363: bipush #8
    //   365: iadd
    //   366: bipush #6
    //   368: ishr
    //   369: iconst_1
    //   370: iadd
    //   371: bipush #16
    //   373: imul
    //   374: newarray int
    //   376: astore #5
    //   378: iconst_0
    //   379: istore #6
    //   381: iload #6
    //   383: aload_3
    //   384: arraylength
    //   385: if_icmpge -> 428
    //   388: aload_3
    //   389: iload #6
    //   391: baload
    //   392: sipush #255
    //   395: iand
    //   396: istore #7
    //   398: aload #5
    //   400: iload #6
    //   402: iconst_2
    //   403: ishr
    //   404: dup2
    //   405: iaload
    //   406: iload #7
    //   408: bipush #24
    //   410: iload #6
    //   412: iconst_4
    //   413: irem
    //   414: bipush #8
    //   416: imul
    //   417: isub
    //   418: ishl
    //   419: ior
    //   420: iastore
    //   421: iinc #6, 1
    //   424: iload_2
    //   425: ifne -> 381
    //   428: aload #5
    //   430: iload #6
    //   432: iconst_2
    //   433: ishr
    //   434: dup2
    //   435: iaload
    //   436: sipush #128
    //   439: bipush #24
    //   441: iload #6
    //   443: iconst_4
    //   444: irem
    //   445: bipush #8
    //   447: imul
    //   448: isub
    //   449: ishl
    //   450: ior
    //   451: iastore
    //   452: aload #5
    //   454: aload #5
    //   456: arraylength
    //   457: iconst_1
    //   458: isub
    //   459: aload_3
    //   460: arraylength
    //   461: bipush #8
    //   463: imul
    //   464: iastore
    //   465: bipush #80
    //   467: newarray int
    //   469: astore #7
    //   471: ldc 1732584193
    //   473: istore #8
    //   475: ldc -271733879
    //   477: istore #9
    //   479: ldc -1732584194
    //   481: istore #10
    //   483: ldc 271733878
    //   485: istore #11
    //   487: ldc -1009589776
    //   489: istore #12
    //   491: iconst_0
    //   492: istore #6
    //   494: iload #6
    //   496: aload #5
    //   498: arraylength
    //   499: if_icmpge -> 821
    //   502: iload #8
    //   504: istore #13
    //   506: iload #9
    //   508: istore #14
    //   510: iload #10
    //   512: istore #15
    //   514: iload #11
    //   516: istore #16
    //   518: iload #12
    //   520: istore #17
    //   522: iconst_0
    //   523: istore #18
    //   525: iload #18
    //   527: bipush #80
    //   529: if_icmpge -> 779
    //   532: iload #18
    //   534: bipush #16
    //   536: if_icmpge -> 563
    //   539: aload #7
    //   541: iload #18
    //   543: aload #5
    //   545: iload #6
    //   547: iload #18
    //   549: iadd
    //   550: iaload
    //   551: iastore
    //   552: iload_2
    //   553: ifne -> 618
    //   556: goto -> 563
    //   559: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   562: athrow
    //   563: aload #7
    //   565: iload #18
    //   567: iconst_3
    //   568: isub
    //   569: iaload
    //   570: aload #7
    //   572: iload #18
    //   574: bipush #8
    //   576: isub
    //   577: iaload
    //   578: ixor
    //   579: aload #7
    //   581: iload #18
    //   583: bipush #14
    //   585: isub
    //   586: iaload
    //   587: ixor
    //   588: aload #7
    //   590: iload #18
    //   592: bipush #16
    //   594: isub
    //   595: iaload
    //   596: ixor
    //   597: istore #19
    //   599: iload #19
    //   601: iconst_1
    //   602: ishl
    //   603: iload #19
    //   605: bipush #31
    //   607: iushr
    //   608: ior
    //   609: istore #20
    //   611: aload #7
    //   613: iload #18
    //   615: iload #20
    //   617: iastore
    //   618: iload #8
    //   620: iconst_5
    //   621: ishl
    //   622: iload #8
    //   624: bipush #27
    //   626: iushr
    //   627: ior
    //   628: istore #19
    //   630: iload #19
    //   632: iload #12
    //   634: iadd
    //   635: aload #7
    //   637: iload #18
    //   639: iaload
    //   640: iadd
    //   641: iload #18
    //   643: bipush #20
    //   645: if_icmpge -> 671
    //   648: ldc 1518500249
    //   650: iload #9
    //   652: iload #10
    //   654: iand
    //   655: iload #9
    //   657: iconst_m1
    //   658: ixor
    //   659: iload #11
    //   661: iand
    //   662: ior
    //   663: iadd
    //   664: goto -> 741
    //   667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   670: athrow
    //   671: iload #18
    //   673: bipush #40
    //   675: if_icmpge -> 696
    //   678: ldc 1859775393
    //   680: iload #9
    //   682: iload #10
    //   684: ixor
    //   685: iload #11
    //   687: ixor
    //   688: iadd
    //   689: goto -> 741
    //   692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   695: athrow
    //   696: iload #18
    //   698: bipush #60
    //   700: if_icmpge -> 730
    //   703: ldc -1894007588
    //   705: iload #9
    //   707: iload #10
    //   709: iand
    //   710: iload #9
    //   712: iload #11
    //   714: iand
    //   715: ior
    //   716: iload #10
    //   718: iload #11
    //   720: iand
    //   721: ior
    //   722: iadd
    //   723: goto -> 741
    //   726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   729: athrow
    //   730: ldc -899497514
    //   732: iload #9
    //   734: iload #10
    //   736: ixor
    //   737: iload #11
    //   739: ixor
    //   740: iadd
    //   741: iadd
    //   742: istore #20
    //   744: iload #11
    //   746: istore #12
    //   748: iload #10
    //   750: istore #11
    //   752: iload #9
    //   754: bipush #30
    //   756: ishl
    //   757: iload #9
    //   759: iconst_2
    //   760: iushr
    //   761: ior
    //   762: istore #10
    //   764: iload #8
    //   766: istore #9
    //   768: iload #20
    //   770: istore #8
    //   772: iinc #18, 1
    //   775: iload_2
    //   776: ifne -> 525
    //   779: iload #8
    //   781: iload #13
    //   783: iadd
    //   784: istore #8
    //   786: iload #9
    //   788: iload #14
    //   790: iadd
    //   791: istore #9
    //   793: iload #10
    //   795: iload #15
    //   797: iadd
    //   798: istore #10
    //   800: iload #11
    //   802: iload #16
    //   804: iadd
    //   805: istore #11
    //   807: iload #12
    //   809: iload #17
    //   811: iadd
    //   812: istore #12
    //   814: iinc #6, 16
    //   817: iload_2
    //   818: ifne -> 494
    //   821: iconst_5
    //   822: newarray int
    //   824: dup
    //   825: iconst_0
    //   826: iload #8
    //   828: iastore
    //   829: dup
    //   830: iconst_1
    //   831: iload #9
    //   833: iastore
    //   834: dup
    //   835: iconst_2
    //   836: iload #10
    //   838: iastore
    //   839: dup
    //   840: iconst_3
    //   841: iload #11
    //   843: iastore
    //   844: dup
    //   845: iconst_4
    //   846: iload #12
    //   848: iastore
    //   849: astore #13
    //   851: bipush #20
    //   853: newarray byte
    //   855: astore #14
    //   857: iconst_0
    //   858: istore #15
    //   860: iload #15
    //   862: bipush #20
    //   864: if_icmpge -> 905
    //   867: aload #13
    //   869: iload #15
    //   871: iconst_4
    //   872: idiv
    //   873: iaload
    //   874: istore #16
    //   876: iconst_3
    //   877: iload #15
    //   879: iconst_4
    //   880: irem
    //   881: isub
    //   882: bipush #8
    //   884: imul
    //   885: istore #17
    //   887: aload #14
    //   889: iload #15
    //   891: iload #16
    //   893: iload #17
    //   895: iushr
    //   896: i2b
    //   897: bastore
    //   898: iinc #15, 1
    //   901: iload_2
    //   902: ifne -> 860
    //   905: aload #14
    //   907: astore #4
    //   909: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   912: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   915: checkcast java/math/BigInteger
    //   918: invokevirtual intValue : ()I
    //   921: bipush #32
    //   923: irem
    //   924: invokestatic abs : (I)I
    //   927: invokevirtual charAt : (I)C
    //   930: getstatic burp/Ztgv.ZC : Ljava/lang/String;
    //   933: getstatic burp/Zlxw.Zi : Ljava/lang/Object;
    //   936: checkcast java/math/BigInteger
    //   939: invokevirtual intValue : ()I
    //   942: bipush #32
    //   944: irem
    //   945: invokestatic abs : (I)I
    //   948: invokevirtual charAt : (I)C
    //   951: if_icmple -> 1058
    //   954: getstatic burp/Zrb6.ZP : Ljava/lang/String;
    //   957: getstatic burp/Zrtp.Zy : Ljava/lang/Object;
    //   960: checkcast java/math/BigInteger
    //   963: invokevirtual intValue : ()I
    //   966: bipush #32
    //   968: irem
    //   969: invokestatic abs : (I)I
    //   972: invokevirtual charAt : (I)C
    //   975: getstatic burp/Zmh3.Zy : Ljava/lang/String;
    //   978: getstatic burp/Zedq.Zy : Ljava/lang/Object;
    //   981: checkcast java/math/BigInteger
    //   984: invokevirtual intValue : ()I
    //   987: bipush #32
    //   989: irem
    //   990: invokestatic abs : (I)I
    //   993: invokevirtual charAt : (I)C
    //   996: if_icmpgt -> 1058
    //   999: goto -> 1006
    //   1002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1005: athrow
    //   1006: getstatic burp/Zex0.Zk : Ljava/lang/String;
    //   1009: getstatic burp/Zsvd.Zk : Ljava/lang/Object;
    //   1012: checkcast java/math/BigInteger
    //   1015: invokevirtual intValue : ()I
    //   1018: bipush #32
    //   1020: irem
    //   1021: invokestatic abs : (I)I
    //   1024: invokevirtual charAt : (I)C
    //   1027: getstatic burp/Ztq2.Zt : Ljava/lang/String;
    //   1030: getstatic burp/Zkdx.Zn : Ljava/lang/Object;
    //   1033: checkcast java/math/BigInteger
    //   1036: invokevirtual intValue : ()I
    //   1039: bipush #32
    //   1041: irem
    //   1042: invokestatic abs : (I)I
    //   1045: invokevirtual charAt : (I)C
    //   1048: if_icmpgt -> 1066
    //   1051: goto -> 1058
    //   1054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1057: athrow
    //   1058: iconst_1
    //   1059: goto -> 1067
    //   1062: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1065: athrow
    //   1066: iconst_0
    //   1067: ireturn
    //   1068: astore_3
    //   1069: new java/lang/Exception
    //   1072: dup
    //   1073: aload_3
    //   1074: invokevirtual getMessage : ()Ljava/lang/String;
    //   1077: invokespecial <init> : (Ljava/lang/String;)V
    //   1080: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1067	1068	java/lang/Throwable
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
    //   532	556	559	java/lang/Throwable
    //   630	667	667	java/lang/Throwable
    //   671	692	692	java/lang/Throwable
    //   696	726	726	java/lang/Throwable
    //   909	999	1002	java/lang/Throwable
    //   954	1051	1054	java/lang/Throwable
    //   1006	1062	1062	java/lang/Throwable
  }
  
  static void Zf(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'öÊ/Òá7Ji\\tÄ7im)À´JM¨Gnz&M1üî>Èâ¡Þ¬8l7\\bÒÒ´ìÞ¸J<Á³[ø0yÞÔXê#Z6ºHÝÞL\\nbÍîíÐy{Æ"0}DDC òF¾þ©£w¿;¹ýS ¦ÔÓ\3»u1¬¨µþú<Z\\tÆrSJáX'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #115
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
    //   68: ldc 'ÛbXÝßÙT ³Ë¿Ïö´bméòAÖ¬ßÐµIaN® ­Ø°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zr17.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr17.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #7
    //   214: goto -> 243
    //   217: bipush #107
    //   219: goto -> 243
    //   222: bipush #80
    //   224: goto -> 243
    //   227: bipush #80
    //   229: goto -> 243
    //   232: iconst_1
    //   233: goto -> 243
    //   236: bipush #94
    //   238: goto -> 243
    //   241: bipush #18
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
    //   300: sipush #7672
    //   303: sipush #3969
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zr17.Zu : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #48
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #53
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-8
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-29
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-76
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-89
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #29
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #88
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #28
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-123
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #82
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-41
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #55
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #37
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-30
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #127
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-95
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-92
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #59
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #33
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #37
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-51
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-35
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #39
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-81
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-119
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #34
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-118
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-33
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-60
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #40
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-19
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zr17.ZR : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1DFF) & 0xFFFF;
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
      byte b1 = 38;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr17.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */