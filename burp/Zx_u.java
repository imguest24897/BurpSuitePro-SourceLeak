package burp;

import java.math.BigInteger;

class Zx_u extends ClassLoader {
  static String Z_;
  
  static Object Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZC(Object paramObject) {
    Ztzw.Zi = a(-30327, 28537);
    Ztzw.Zk = new BigInteger(a(-30334, 23337));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zg27.ZP.charAt(Math.abs(((BigInteger)Zgr4.ZL).intValue() % 32)) > Zx_b.ZD.charAt(Math.abs(((BigInteger)Ztzw.Zk).intValue() % 32))) {
          try {
            Zrt9.Zn(Class.forName(a(-30332, -20904)));
            if (bool)
              Zegk.Zo(Class.forName(a(-30329, -26167))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zegk.Zo(Class.forName(a(-30329, -26167)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #-30331
    //   7: sipush #15281
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zl : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zz16.ZK : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: invokevirtual toByteArray : ()[B
    //   28: astore_3
    //   29: aload_3
    //   30: arraylength
    //   31: iconst_2
    //   32: iadd
    //   33: newarray byte
    //   35: astore #5
    //   37: iconst_0
    //   38: istore #6
    //   40: iload #6
    //   42: aload_3
    //   43: arraylength
    //   44: if_icmpge -> 63
    //   47: aload #5
    //   49: iload #6
    //   51: aload_3
    //   52: iload #6
    //   54: baload
    //   55: bastore
    //   56: iinc #6, 1
    //   59: iload_2
    //   60: ifne -> 40
    //   63: aload #5
    //   65: arraylength
    //   66: iconst_3
    //   67: idiv
    //   68: iconst_4
    //   69: imul
    //   70: newarray byte
    //   72: astore #4
    //   74: iconst_0
    //   75: istore #6
    //   77: iconst_0
    //   78: istore #7
    //   80: iload #6
    //   82: aload_3
    //   83: arraylength
    //   84: if_icmpge -> 195
    //   87: aload #4
    //   89: iload #7
    //   91: aload #5
    //   93: iload #6
    //   95: baload
    //   96: iconst_2
    //   97: iushr
    //   98: bipush #63
    //   100: iand
    //   101: i2b
    //   102: bastore
    //   103: aload #4
    //   105: iload #7
    //   107: iconst_1
    //   108: iadd
    //   109: aload #5
    //   111: iload #6
    //   113: iconst_1
    //   114: iadd
    //   115: baload
    //   116: iconst_4
    //   117: iushr
    //   118: bipush #15
    //   120: iand
    //   121: aload #5
    //   123: iload #6
    //   125: baload
    //   126: iconst_4
    //   127: ishl
    //   128: bipush #63
    //   130: iand
    //   131: ior
    //   132: i2b
    //   133: bastore
    //   134: aload #4
    //   136: iload #7
    //   138: iconst_2
    //   139: iadd
    //   140: aload #5
    //   142: iload #6
    //   144: iconst_2
    //   145: iadd
    //   146: baload
    //   147: bipush #6
    //   149: iushr
    //   150: iconst_3
    //   151: iand
    //   152: aload #5
    //   154: iload #6
    //   156: iconst_1
    //   157: iadd
    //   158: baload
    //   159: iconst_2
    //   160: ishl
    //   161: bipush #63
    //   163: iand
    //   164: ior
    //   165: i2b
    //   166: bastore
    //   167: aload #4
    //   169: iload #7
    //   171: iconst_3
    //   172: iadd
    //   173: aload #5
    //   175: iload #6
    //   177: iconst_2
    //   178: iadd
    //   179: baload
    //   180: bipush #63
    //   182: iand
    //   183: i2b
    //   184: bastore
    //   185: iinc #6, 3
    //   188: iinc #7, 4
    //   191: iload_2
    //   192: ifne -> 80
    //   195: iconst_0
    //   196: istore #6
    //   198: iload #6
    //   200: aload #4
    //   202: arraylength
    //   203: if_icmpge -> 387
    //   206: aload #4
    //   208: iload #6
    //   210: baload
    //   211: bipush #26
    //   213: if_icmpge -> 241
    //   216: aload #4
    //   218: iload #6
    //   220: aload #4
    //   222: iload #6
    //   224: baload
    //   225: bipush #65
    //   227: iadd
    //   228: i2b
    //   229: bastore
    //   230: iload_2
    //   231: ifne -> 380
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   240: athrow
    //   241: aload #4
    //   243: iload #6
    //   245: baload
    //   246: bipush #52
    //   248: if_icmpge -> 286
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   257: athrow
    //   258: aload #4
    //   260: iload #6
    //   262: aload #4
    //   264: iload #6
    //   266: baload
    //   267: bipush #97
    //   269: iadd
    //   270: bipush #26
    //   272: isub
    //   273: i2b
    //   274: bastore
    //   275: iload_2
    //   276: ifne -> 380
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   285: athrow
    //   286: aload #4
    //   288: iload #6
    //   290: baload
    //   291: bipush #62
    //   293: if_icmpge -> 331
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   302: athrow
    //   303: aload #4
    //   305: iload #6
    //   307: aload #4
    //   309: iload #6
    //   311: baload
    //   312: bipush #48
    //   314: iadd
    //   315: bipush #52
    //   317: isub
    //   318: i2b
    //   319: bastore
    //   320: iload_2
    //   321: ifne -> 380
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload #4
    //   333: iload #6
    //   335: baload
    //   336: bipush #63
    //   338: if_icmpge -> 366
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: aload #4
    //   350: iload #6
    //   352: bipush #43
    //   354: bastore
    //   355: iload_2
    //   356: ifne -> 380
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: aload #4
    //   368: iload #6
    //   370: bipush #47
    //   372: bastore
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   379: athrow
    //   380: iinc #6, 1
    //   383: iload_2
    //   384: ifne -> 198
    //   387: aload #4
    //   389: arraylength
    //   390: iconst_1
    //   391: isub
    //   392: istore #6
    //   394: iload #6
    //   396: aload_3
    //   397: arraylength
    //   398: iconst_4
    //   399: imul
    //   400: iconst_3
    //   401: idiv
    //   402: if_icmple -> 419
    //   405: aload #4
    //   407: iload #6
    //   409: bipush #61
    //   411: bastore
    //   412: iinc #6, -1
    //   415: iload_2
    //   416: ifne -> 394
    //   419: new java/math/BigInteger
    //   422: dup
    //   423: aload #4
    //   425: invokespecial <init> : ([B)V
    //   428: invokevirtual abs : ()Ljava/math/BigInteger;
    //   431: putstatic burp/Zgfm.ZV : Ljava/lang/Object;
    //   434: sipush #-30333
    //   437: sipush #-22086
    //   440: invokestatic a : (II)Ljava/lang/String;
    //   443: iconst_1
    //   444: ldc burp/Zxo4
    //   446: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   449: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   452: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   455: astore_3
    //   456: aload_3
    //   457: arraylength
    //   458: istore #4
    //   460: iconst_0
    //   461: istore #5
    //   463: iload #5
    //   465: iload #4
    //   467: if_icmpge -> 604
    //   470: aload_3
    //   471: iload #5
    //   473: aaload
    //   474: astore #6
    //   476: aload #6
    //   478: invokevirtual getModifiers : ()I
    //   481: invokestatic isStatic : (I)Z
    //   484: ifne -> 494
    //   487: goto -> 597
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload #6
    //   496: invokevirtual getType : ()Ljava/lang/Class;
    //   499: astore #7
    //   501: aload #7
    //   503: ifnull -> 584
    //   506: aload #7
    //   508: invokevirtual isPrimitive : ()Z
    //   511: ifne -> 584
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #7
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: ifnull -> 584
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   535: athrow
    //   536: aload #7
    //   538: invokevirtual getPackage : ()Ljava/lang/Package;
    //   541: invokevirtual getName : ()Ljava/lang/String;
    //   544: ifnull -> 584
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   553: athrow
    //   554: aload #7
    //   556: invokevirtual getPackage : ()Ljava/lang/Package;
    //   559: invokevirtual getName : ()Ljava/lang/String;
    //   562: sipush #-30326
    //   565: sipush #-25914
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   574: ifne -> 584
    //   577: goto -> 584
    //   580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   583: athrow
    //   584: aload #6
    //   586: iconst_1
    //   587: invokevirtual setAccessible : (Z)V
    //   590: aload #6
    //   592: aconst_null
    //   593: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   596: pop
    //   597: iinc #5, 1
    //   600: iload_2
    //   601: ifne -> 463
    //   604: sipush #-30325
    //   607: sipush #6477
    //   610: invokestatic a : (II)Ljava/lang/String;
    //   613: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   616: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   619: astore_3
    //   620: aload_3
    //   621: arraylength
    //   622: istore #4
    //   624: iconst_0
    //   625: istore #5
    //   627: iload #5
    //   629: iload #4
    //   631: if_icmpge -> 763
    //   634: aload_3
    //   635: iload #5
    //   637: aaload
    //   638: astore #6
    //   640: aload #6
    //   642: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   645: pop
    //   646: aload #6
    //   648: invokevirtual getModifiers : ()I
    //   651: invokestatic isStatic : (I)Z
    //   654: ifeq -> 749
    //   657: aload #6
    //   659: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   662: arraylength
    //   663: iconst_2
    //   664: if_icmpne -> 749
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   673: athrow
    //   674: aload #6
    //   676: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   679: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   682: invokevirtual equals : (Ljava/lang/Object;)Z
    //   685: ifeq -> 749
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: aload #6
    //   697: iconst_1
    //   698: invokevirtual setAccessible : (Z)V
    //   701: aload #6
    //   703: aconst_null
    //   704: iconst_2
    //   705: anewarray java/lang/Object
    //   708: dup
    //   709: iconst_0
    //   710: aload_0
    //   711: aastore
    //   712: dup
    //   713: iconst_1
    //   714: aload_1
    //   715: ifnonnull -> 733
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   724: athrow
    //   725: aload_1
    //   726: goto -> 740
    //   729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   732: athrow
    //   733: aload_1
    //   734: checkcast [B
    //   737: invokevirtual clone : ()Ljava/lang/Object;
    //   740: aastore
    //   741: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   744: pop
    //   745: iload_2
    //   746: ifne -> 763
    //   749: iinc #5, 1
    //   752: iload_2
    //   753: ifne -> 627
    //   756: goto -> 763
    //   759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   762: athrow
    //   763: iconst_0
    //   764: istore_3
    //   765: sipush #-30336
    //   768: sipush #19191
    //   771: invokestatic a : (II)Ljava/lang/String;
    //   774: iconst_1
    //   775: ldc burp/Zmhx
    //   777: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   780: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   783: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   786: astore #4
    //   788: aload #4
    //   790: arraylength
    //   791: istore #5
    //   793: iconst_0
    //   794: istore #6
    //   796: iload #6
    //   798: iload #5
    //   800: if_icmpge -> 938
    //   803: aload #4
    //   805: iload #6
    //   807: aaload
    //   808: astore #7
    //   810: aload #7
    //   812: invokevirtual getModifiers : ()I
    //   815: invokestatic isStatic : (I)Z
    //   818: ifne -> 828
    //   821: goto -> 931
    //   824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   827: athrow
    //   828: aload #7
    //   830: invokevirtual getType : ()Ljava/lang/Class;
    //   833: astore #8
    //   835: aload #8
    //   837: ifnull -> 918
    //   840: aload #8
    //   842: invokevirtual isPrimitive : ()Z
    //   845: ifne -> 918
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   854: athrow
    //   855: aload #8
    //   857: invokevirtual getPackage : ()Ljava/lang/Package;
    //   860: ifnull -> 918
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   869: athrow
    //   870: aload #8
    //   872: invokevirtual getPackage : ()Ljava/lang/Package;
    //   875: invokevirtual getName : ()Ljava/lang/String;
    //   878: ifnull -> 918
    //   881: goto -> 888
    //   884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   887: athrow
    //   888: aload #8
    //   890: invokevirtual getPackage : ()Ljava/lang/Package;
    //   893: invokevirtual getName : ()Ljava/lang/String;
    //   896: sipush #-30330
    //   899: sipush #19603
    //   902: invokestatic a : (II)Ljava/lang/String;
    //   905: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   908: ifne -> 918
    //   911: goto -> 918
    //   914: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   917: athrow
    //   918: aload #7
    //   920: iconst_1
    //   921: invokevirtual setAccessible : (Z)V
    //   924: aload #7
    //   926: aconst_null
    //   927: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   930: pop
    //   931: iinc #6, 1
    //   934: iload_2
    //   935: ifne -> 796
    //   938: sipush #-30335
    //   941: sipush #-26009
    //   944: invokestatic a : (II)Ljava/lang/String;
    //   947: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   950: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   953: astore #4
    //   955: aload #4
    //   957: arraylength
    //   958: istore #5
    //   960: iconst_0
    //   961: istore #6
    //   963: iload #6
    //   965: iload #5
    //   967: if_icmpge -> 1103
    //   970: aload #4
    //   972: iload #6
    //   974: aaload
    //   975: astore #7
    //   977: aload #7
    //   979: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   982: pop
    //   983: aload #7
    //   985: invokevirtual getModifiers : ()I
    //   988: invokestatic isStatic : (I)Z
    //   991: ifeq -> 1089
    //   994: aload #7
    //   996: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   999: arraylength
    //   1000: iconst_2
    //   1001: if_icmpne -> 1089
    //   1004: goto -> 1011
    //   1007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1010: athrow
    //   1011: aload #7
    //   1013: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1016: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1019: if_acmpne -> 1089
    //   1022: goto -> 1029
    //   1025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1028: athrow
    //   1029: aload #7
    //   1031: iconst_1
    //   1032: invokevirtual setAccessible : (Z)V
    //   1035: aload #7
    //   1037: aconst_null
    //   1038: iconst_2
    //   1039: anewarray java/lang/Object
    //   1042: dup
    //   1043: iconst_0
    //   1044: aload_0
    //   1045: aastore
    //   1046: dup
    //   1047: iconst_1
    //   1048: aload_1
    //   1049: ifnonnull -> 1067
    //   1052: goto -> 1059
    //   1055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1058: athrow
    //   1059: aload_1
    //   1060: goto -> 1074
    //   1063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1066: athrow
    //   1067: aload_1
    //   1068: checkcast [B
    //   1071: invokevirtual clone : ()Ljava/lang/Object;
    //   1074: aastore
    //   1075: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1078: checkcast java/lang/Boolean
    //   1081: invokevirtual booleanValue : ()Z
    //   1084: istore_3
    //   1085: iload_2
    //   1086: ifne -> 1103
    //   1089: iinc #6, 1
    //   1092: iload_2
    //   1093: ifne -> 963
    //   1096: goto -> 1103
    //   1099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1102: athrow
    //   1103: iload_3
    //   1104: ireturn
    //   1105: astore_3
    //   1106: new java/lang/Exception
    //   1109: dup
    //   1110: aload_3
    //   1111: invokevirtual getMessage : ()Ljava/lang/String;
    //   1114: invokespecial <init> : (Ljava/lang/String;)V
    //   1117: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1104	1105	java/lang/Throwable
    //   206	234	237	java/lang/Throwable
    //   216	251	254	java/lang/Throwable
    //   241	279	282	java/lang/Throwable
    //   258	296	299	java/lang/Throwable
    //   286	324	327	java/lang/Throwable
    //   303	341	344	java/lang/Throwable
    //   331	359	362	java/lang/Throwable
    //   348	373	376	java/lang/Throwable
    //   476	490	490	java/lang/Throwable
    //   501	514	517	java/lang/Throwable
    //   506	529	532	java/lang/Throwable
    //   521	547	550	java/lang/Throwable
    //   536	577	580	java/lang/Throwable
    //   640	667	670	java/lang/Throwable
    //   657	688	691	java/lang/Throwable
    //   674	718	721	java/lang/Throwable
    //   695	729	729	java/lang/Throwable
    //   740	756	759	java/lang/Throwable
    //   810	824	824	java/lang/Throwable
    //   835	848	851	java/lang/Throwable
    //   840	863	866	java/lang/Throwable
    //   855	881	884	java/lang/Throwable
    //   870	911	914	java/lang/Throwable
    //   977	1004	1007	java/lang/Throwable
    //   994	1022	1025	java/lang/Throwable
    //   1011	1052	1055	java/lang/Throwable
    //   1029	1063	1063	java/lang/Throwable
    //   1085	1096	1099	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ',3|ÔS4MtóèF$ÈÔ¼.k>Ã)ºíà¸©¨_(r±Ì©£ÜJäqè÷ÅÖð*äÌãÃ#>çÏé/m*}%R:ÜÉ$Mã° \\tlÀ}(µÞ%À\\tTÁz\\bUÚ'\\t\\rØ¡ëgE9?xÿ\\týR¿ºÇM6*k\\bËyrT:\\t\-UA°äÆ'Öá*'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #95
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
    //   68: ldc 'Îò|(JaU<\\bSr2E2á¸­¤toj9ÖÌùR \¡FµjEV#êÄ¼U´^VÌAàö}ñó^2Lz'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #17
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
    //   129: putstatic burp/Zx_u.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zx_u.b : [Ljava/lang/String;
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
    //   212: bipush #37
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #31
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #10
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
    //   300: sipush #-30328
    //   303: sipush #-22252
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zx_u.Z_ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #11
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #78
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #30
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #48
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-111
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-97
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #28
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-43
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-77
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #111
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-43
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-62
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-46
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #91
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-83
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #20
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-37
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #66
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #69
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #20
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: iconst_m1
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #118
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #120
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #123
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #53
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #29
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-114
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #73
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #114
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-100
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-120
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #59
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zx_u.Zy : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8983) & 0xFFFF;
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
      byte b1 = 1;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */