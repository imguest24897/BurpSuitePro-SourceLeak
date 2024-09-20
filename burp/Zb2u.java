package burp;

import java.math.BigInteger;

class Zb2u extends ClassLoader {
  static Object ZY;
  
  static String ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZO(Object paramObject) {
    Zsn3.ZS = a(-8002, 26453);
    Zsn3.Zy = new BigInteger(a(-8001, 29051));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrw0.Zj.charAt(Math.abs(((BigInteger)Zlc2.ZQ).intValue() % 32)) > Zz7j.ZP.charAt(Math.abs(((BigInteger)Zxln.ZJ).intValue() % 32))) {
          try {
            Zmf2.Zr(Class.forName(a(-8021, 16411)));
            if (!bool)
              Zgd7.Zh(Class.forName(a(-8004, 14171))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgd7.Zh(Class.forName(a(-8004, 14171)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zeva.Zf : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zbnz.Zb : Ljava/lang/Object;
    //   22: getstatic burp/Ze2k.ZK : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: iconst_0
    //   33: istore #5
    //   35: iconst_0
    //   36: istore #6
    //   38: iload #6
    //   40: aload_3
    //   41: arraylength
    //   42: if_icmpge -> 187
    //   45: aload_3
    //   46: iload #6
    //   48: baload
    //   49: istore #7
    //   51: iload #7
    //   53: bipush #48
    //   55: if_icmplt -> 72
    //   58: iload #7
    //   60: bipush #57
    //   62: if_icmple -> 170
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: iload #7
    //   74: bipush #65
    //   76: if_icmplt -> 100
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: iload #7
    //   88: bipush #90
    //   90: if_icmple -> 170
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: iload #7
    //   102: bipush #97
    //   104: if_icmplt -> 128
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   113: athrow
    //   114: iload #7
    //   116: bipush #122
    //   118: if_icmple -> 170
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   127: athrow
    //   128: iload #7
    //   130: bipush #43
    //   132: if_icmpeq -> 170
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: iload #7
    //   144: bipush #47
    //   146: if_icmpeq -> 170
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   155: athrow
    //   156: iload #7
    //   158: bipush #61
    //   160: if_icmpne -> 180
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   169: athrow
    //   170: iinc #5, 1
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   179: athrow
    //   180: iinc #6, 1
    //   183: iload_2
    //   184: ifne -> 38
    //   187: iload #5
    //   189: newarray byte
    //   191: astore #6
    //   193: iconst_0
    //   194: istore #7
    //   196: iconst_0
    //   197: istore #8
    //   199: iload #8
    //   201: aload_3
    //   202: arraylength
    //   203: if_icmpge -> 355
    //   206: aload_3
    //   207: iload #8
    //   209: baload
    //   210: istore #9
    //   212: iload #9
    //   214: bipush #48
    //   216: if_icmplt -> 233
    //   219: iload #9
    //   221: bipush #57
    //   223: if_icmple -> 331
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   232: athrow
    //   233: iload #9
    //   235: bipush #65
    //   237: if_icmplt -> 261
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: athrow
    //   247: iload #9
    //   249: bipush #90
    //   251: if_icmple -> 331
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: athrow
    //   261: iload #9
    //   263: bipush #97
    //   265: if_icmplt -> 289
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   274: athrow
    //   275: iload #9
    //   277: bipush #122
    //   279: if_icmple -> 331
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: iload #9
    //   291: bipush #43
    //   293: if_icmpeq -> 331
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   302: athrow
    //   303: iload #9
    //   305: bipush #47
    //   307: if_icmpeq -> 331
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   316: athrow
    //   317: iload #9
    //   319: bipush #61
    //   321: if_icmpne -> 348
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload #6
    //   333: iload #7
    //   335: iload #9
    //   337: bastore
    //   338: iinc #7, 1
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: iinc #8, 1
    //   351: iload_2
    //   352: ifne -> 199
    //   355: aload #6
    //   357: astore #4
    //   359: aload #4
    //   361: astore_3
    //   362: aload_3
    //   363: arraylength
    //   364: istore #5
    //   366: aload_3
    //   367: iload #5
    //   369: iconst_1
    //   370: isub
    //   371: baload
    //   372: bipush #61
    //   374: if_icmpne -> 384
    //   377: iinc #5, -1
    //   380: iload_2
    //   381: ifne -> 366
    //   384: iload #5
    //   386: aload_3
    //   387: arraylength
    //   388: iconst_4
    //   389: idiv
    //   390: isub
    //   391: newarray byte
    //   393: astore #6
    //   395: iconst_0
    //   396: istore #7
    //   398: iload #7
    //   400: aload_3
    //   401: arraylength
    //   402: if_icmpge -> 664
    //   405: aload_3
    //   406: iload #7
    //   408: baload
    //   409: bipush #61
    //   411: if_icmpne -> 430
    //   414: aload_3
    //   415: iload #7
    //   417: iconst_0
    //   418: bastore
    //   419: iload_2
    //   420: ifne -> 657
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   429: athrow
    //   430: aload_3
    //   431: iload #7
    //   433: baload
    //   434: bipush #47
    //   436: if_icmpne -> 463
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   445: athrow
    //   446: aload_3
    //   447: iload #7
    //   449: bipush #63
    //   451: bastore
    //   452: iload_2
    //   453: ifne -> 657
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: aload_3
    //   464: iload #7
    //   466: baload
    //   467: bipush #43
    //   469: if_icmpne -> 496
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload_3
    //   480: iload #7
    //   482: bipush #62
    //   484: bastore
    //   485: iload_2
    //   486: ifne -> 657
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload_3
    //   497: iload #7
    //   499: baload
    //   500: bipush #48
    //   502: if_icmplt -> 551
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   511: athrow
    //   512: aload_3
    //   513: iload #7
    //   515: baload
    //   516: bipush #57
    //   518: if_icmpgt -> 551
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   527: athrow
    //   528: aload_3
    //   529: iload #7
    //   531: aload_3
    //   532: iload #7
    //   534: baload
    //   535: bipush #-4
    //   537: isub
    //   538: i2b
    //   539: bastore
    //   540: iload_2
    //   541: ifne -> 657
    //   544: goto -> 551
    //   547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   550: athrow
    //   551: aload_3
    //   552: iload #7
    //   554: baload
    //   555: bipush #97
    //   557: if_icmplt -> 606
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload_3
    //   568: iload #7
    //   570: baload
    //   571: bipush #122
    //   573: if_icmpgt -> 606
    //   576: goto -> 583
    //   579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   582: athrow
    //   583: aload_3
    //   584: iload #7
    //   586: aload_3
    //   587: iload #7
    //   589: baload
    //   590: bipush #71
    //   592: isub
    //   593: i2b
    //   594: bastore
    //   595: iload_2
    //   596: ifne -> 657
    //   599: goto -> 606
    //   602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   605: athrow
    //   606: aload_3
    //   607: iload #7
    //   609: baload
    //   610: bipush #65
    //   612: if_icmplt -> 657
    //   615: goto -> 622
    //   618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   621: athrow
    //   622: aload_3
    //   623: iload #7
    //   625: baload
    //   626: bipush #90
    //   628: if_icmpgt -> 657
    //   631: goto -> 638
    //   634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   637: athrow
    //   638: aload_3
    //   639: iload #7
    //   641: aload_3
    //   642: iload #7
    //   644: baload
    //   645: bipush #65
    //   647: isub
    //   648: i2b
    //   649: bastore
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   656: athrow
    //   657: iinc #7, 1
    //   660: iload_2
    //   661: ifne -> 398
    //   664: iconst_0
    //   665: istore #7
    //   667: iconst_0
    //   668: istore #8
    //   670: iload #8
    //   672: aload #6
    //   674: arraylength
    //   675: iconst_2
    //   676: isub
    //   677: if_icmpge -> 780
    //   680: aload #6
    //   682: iload #8
    //   684: aload_3
    //   685: iload #7
    //   687: baload
    //   688: iconst_2
    //   689: ishl
    //   690: sipush #255
    //   693: iand
    //   694: aload_3
    //   695: iload #7
    //   697: iconst_1
    //   698: iadd
    //   699: baload
    //   700: iconst_4
    //   701: iushr
    //   702: iconst_3
    //   703: iand
    //   704: ior
    //   705: i2b
    //   706: bastore
    //   707: aload #6
    //   709: iload #8
    //   711: iconst_1
    //   712: iadd
    //   713: aload_3
    //   714: iload #7
    //   716: iconst_1
    //   717: iadd
    //   718: baload
    //   719: iconst_4
    //   720: ishl
    //   721: sipush #255
    //   724: iand
    //   725: aload_3
    //   726: iload #7
    //   728: iconst_2
    //   729: iadd
    //   730: baload
    //   731: iconst_2
    //   732: iushr
    //   733: bipush #15
    //   735: iand
    //   736: ior
    //   737: i2b
    //   738: bastore
    //   739: aload #6
    //   741: iload #8
    //   743: iconst_2
    //   744: iadd
    //   745: aload_3
    //   746: iload #7
    //   748: iconst_2
    //   749: iadd
    //   750: baload
    //   751: bipush #6
    //   753: ishl
    //   754: sipush #255
    //   757: iand
    //   758: aload_3
    //   759: iload #7
    //   761: iconst_3
    //   762: iadd
    //   763: baload
    //   764: bipush #63
    //   766: iand
    //   767: ior
    //   768: i2b
    //   769: bastore
    //   770: iinc #7, 4
    //   773: iinc #8, 3
    //   776: iload_2
    //   777: ifne -> 670
    //   780: iload #8
    //   782: aload #6
    //   784: arraylength
    //   785: if_icmpge -> 822
    //   788: aload #6
    //   790: iload #8
    //   792: aload_3
    //   793: iload #7
    //   795: baload
    //   796: iconst_2
    //   797: ishl
    //   798: sipush #255
    //   801: iand
    //   802: aload_3
    //   803: iload #7
    //   805: iconst_1
    //   806: iadd
    //   807: baload
    //   808: iconst_4
    //   809: iushr
    //   810: iconst_3
    //   811: iand
    //   812: ior
    //   813: i2b
    //   814: bastore
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   821: athrow
    //   822: iinc #8, 1
    //   825: iload #8
    //   827: aload #6
    //   829: arraylength
    //   830: if_icmpge -> 870
    //   833: aload #6
    //   835: iload #8
    //   837: aload_3
    //   838: iload #7
    //   840: iconst_1
    //   841: iadd
    //   842: baload
    //   843: iconst_4
    //   844: ishl
    //   845: sipush #255
    //   848: iand
    //   849: aload_3
    //   850: iload #7
    //   852: iconst_2
    //   853: iadd
    //   854: baload
    //   855: iconst_2
    //   856: iushr
    //   857: bipush #15
    //   859: iand
    //   860: ior
    //   861: i2b
    //   862: bastore
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   869: athrow
    //   870: aload #6
    //   872: astore #4
    //   874: sipush #-8016
    //   877: new java/math/BigInteger
    //   880: dup
    //   881: aload #4
    //   883: invokespecial <init> : ([B)V
    //   886: invokevirtual abs : ()Ljava/math/BigInteger;
    //   889: putstatic burp/Zxd1.Zc : Ljava/lang/Object;
    //   892: sipush #26561
    //   895: getstatic burp/Zxdy.ZZ : Ljava/lang/Object;
    //   898: checkcast java/math/BigInteger
    //   901: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   904: checkcast java/math/BigInteger
    //   907: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   910: putstatic burp/Zzah.Za : Ljava/lang/Object;
    //   913: invokestatic a : (II)Ljava/lang/String;
    //   916: iconst_1
    //   917: ldc burp/Zb6a
    //   919: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   922: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   925: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   928: astore_3
    //   929: aload_3
    //   930: arraylength
    //   931: istore #4
    //   933: iconst_0
    //   934: istore #5
    //   936: iload #5
    //   938: iload #4
    //   940: if_icmpge -> 1077
    //   943: aload_3
    //   944: iload #5
    //   946: aaload
    //   947: astore #6
    //   949: aload #6
    //   951: invokevirtual getModifiers : ()I
    //   954: invokestatic isStatic : (I)Z
    //   957: ifne -> 967
    //   960: goto -> 1070
    //   963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   966: athrow
    //   967: aload #6
    //   969: invokevirtual getType : ()Ljava/lang/Class;
    //   972: astore #7
    //   974: aload #7
    //   976: ifnull -> 1057
    //   979: aload #7
    //   981: invokevirtual isPrimitive : ()Z
    //   984: ifne -> 1057
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: aload #7
    //   996: invokevirtual getPackage : ()Ljava/lang/Package;
    //   999: ifnull -> 1057
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1008: athrow
    //   1009: aload #7
    //   1011: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1014: invokevirtual getName : ()Ljava/lang/String;
    //   1017: ifnull -> 1057
    //   1020: goto -> 1027
    //   1023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1026: athrow
    //   1027: aload #7
    //   1029: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1032: invokevirtual getName : ()Ljava/lang/String;
    //   1035: sipush #-8022
    //   1038: sipush #1995
    //   1041: invokestatic a : (II)Ljava/lang/String;
    //   1044: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1047: ifne -> 1057
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1056: athrow
    //   1057: aload #6
    //   1059: iconst_1
    //   1060: invokevirtual setAccessible : (Z)V
    //   1063: aload #6
    //   1065: aconst_null
    //   1066: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1069: pop
    //   1070: iinc #5, 1
    //   1073: iload_2
    //   1074: ifne -> 936
    //   1077: sipush #-8028
    //   1080: sipush #-6767
    //   1083: invokestatic a : (II)Ljava/lang/String;
    //   1086: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1089: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1092: astore_3
    //   1093: aload_3
    //   1094: arraylength
    //   1095: istore #4
    //   1097: iconst_0
    //   1098: istore #5
    //   1100: iload #5
    //   1102: iload #4
    //   1104: if_icmpge -> 1236
    //   1107: aload_3
    //   1108: iload #5
    //   1110: aaload
    //   1111: astore #6
    //   1113: aload #6
    //   1115: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1118: pop
    //   1119: aload #6
    //   1121: invokevirtual getModifiers : ()I
    //   1124: invokestatic isStatic : (I)Z
    //   1127: ifeq -> 1222
    //   1130: aload #6
    //   1132: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1135: arraylength
    //   1136: iconst_2
    //   1137: if_icmpne -> 1222
    //   1140: goto -> 1147
    //   1143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1146: athrow
    //   1147: aload #6
    //   1149: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1152: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1158: ifeq -> 1222
    //   1161: goto -> 1168
    //   1164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1167: athrow
    //   1168: aload #6
    //   1170: iconst_1
    //   1171: invokevirtual setAccessible : (Z)V
    //   1174: aload #6
    //   1176: aconst_null
    //   1177: iconst_2
    //   1178: anewarray java/lang/Object
    //   1181: dup
    //   1182: iconst_0
    //   1183: aload_0
    //   1184: aastore
    //   1185: dup
    //   1186: iconst_1
    //   1187: aload_1
    //   1188: ifnonnull -> 1206
    //   1191: goto -> 1198
    //   1194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1197: athrow
    //   1198: aload_1
    //   1199: goto -> 1213
    //   1202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1205: athrow
    //   1206: aload_1
    //   1207: checkcast [B
    //   1210: invokevirtual clone : ()Ljava/lang/Object;
    //   1213: aastore
    //   1214: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1217: pop
    //   1218: iload_2
    //   1219: ifne -> 1236
    //   1222: iinc #5, 1
    //   1225: iload_2
    //   1226: ifne -> 1100
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: sipush #-8013
    //   1239: sipush #5228
    //   1242: invokestatic a : (II)Ljava/lang/String;
    //   1245: iconst_1
    //   1246: ldc burp/Zeqw
    //   1248: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1251: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1254: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1257: astore_3
    //   1258: aload_3
    //   1259: arraylength
    //   1260: istore #4
    //   1262: iconst_0
    //   1263: istore #5
    //   1265: iload #5
    //   1267: iload #4
    //   1269: if_icmpge -> 1406
    //   1272: aload_3
    //   1273: iload #5
    //   1275: aaload
    //   1276: astore #6
    //   1278: aload #6
    //   1280: invokevirtual getModifiers : ()I
    //   1283: invokestatic isStatic : (I)Z
    //   1286: ifne -> 1296
    //   1289: goto -> 1399
    //   1292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1295: athrow
    //   1296: aload #6
    //   1298: invokevirtual getType : ()Ljava/lang/Class;
    //   1301: astore #7
    //   1303: aload #7
    //   1305: ifnull -> 1386
    //   1308: aload #7
    //   1310: invokevirtual isPrimitive : ()Z
    //   1313: ifne -> 1386
    //   1316: goto -> 1323
    //   1319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1322: athrow
    //   1323: aload #7
    //   1325: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1328: ifnull -> 1386
    //   1331: goto -> 1338
    //   1334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1337: athrow
    //   1338: aload #7
    //   1340: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1343: invokevirtual getName : ()Ljava/lang/String;
    //   1346: ifnull -> 1386
    //   1349: goto -> 1356
    //   1352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1355: athrow
    //   1356: aload #7
    //   1358: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1361: invokevirtual getName : ()Ljava/lang/String;
    //   1364: sipush #-8026
    //   1367: sipush #22692
    //   1370: invokestatic a : (II)Ljava/lang/String;
    //   1373: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1376: ifne -> 1386
    //   1379: goto -> 1386
    //   1382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1385: athrow
    //   1386: aload #6
    //   1388: iconst_1
    //   1389: invokevirtual setAccessible : (Z)V
    //   1392: aload #6
    //   1394: aconst_null
    //   1395: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1398: pop
    //   1399: iinc #5, 1
    //   1402: iload_2
    //   1403: ifne -> 1265
    //   1406: sipush #-8011
    //   1409: sipush #1443
    //   1412: invokestatic a : (II)Ljava/lang/String;
    //   1415: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1418: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1421: astore_3
    //   1422: aload_3
    //   1423: arraylength
    //   1424: istore #4
    //   1426: iconst_0
    //   1427: istore #5
    //   1429: iload #5
    //   1431: iload #4
    //   1433: if_icmpge -> 1544
    //   1436: aload_3
    //   1437: iload #5
    //   1439: aaload
    //   1440: astore #6
    //   1442: aload #6
    //   1444: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1447: pop
    //   1448: aload #6
    //   1450: invokevirtual getModifiers : ()I
    //   1453: invokestatic isStatic : (I)Z
    //   1456: ifeq -> 1530
    //   1459: aload #6
    //   1461: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1464: arraylength
    //   1465: iconst_2
    //   1466: if_icmpne -> 1530
    //   1469: goto -> 1476
    //   1472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1475: athrow
    //   1476: aload #6
    //   1478: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1481: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1484: if_acmpne -> 1530
    //   1487: goto -> 1494
    //   1490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1493: athrow
    //   1494: aload #6
    //   1496: iconst_1
    //   1497: invokevirtual setAccessible : (Z)V
    //   1500: aload #6
    //   1502: aconst_null
    //   1503: iconst_2
    //   1504: anewarray java/lang/Object
    //   1507: dup
    //   1508: iconst_0
    //   1509: aload_0
    //   1510: aastore
    //   1511: dup
    //   1512: iconst_1
    //   1513: aload_1
    //   1514: aastore
    //   1515: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1518: pop
    //   1519: iload_2
    //   1520: ifne -> 1544
    //   1523: goto -> 1530
    //   1526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1529: athrow
    //   1530: iinc #5, 1
    //   1533: iload_2
    //   1534: ifne -> 1429
    //   1537: goto -> 1544
    //   1540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1543: athrow
    //   1544: iconst_0
    //   1545: istore_3
    //   1546: getstatic burp/Zmf2.ZK : Ljava/lang/String;
    //   1549: getstatic burp/Zsdl.Zx : Ljava/lang/Object;
    //   1552: checkcast java/math/BigInteger
    //   1555: invokevirtual intValue : ()I
    //   1558: bipush #32
    //   1560: irem
    //   1561: invokestatic abs : (I)I
    //   1564: invokevirtual charAt : (I)C
    //   1567: getstatic burp/Zk8i.ZS : Ljava/lang/String;
    //   1570: getstatic burp/Zedu.ZL : Ljava/lang/Object;
    //   1573: checkcast java/math/BigInteger
    //   1576: invokevirtual intValue : ()I
    //   1579: bipush #32
    //   1581: irem
    //   1582: invokestatic abs : (I)I
    //   1585: invokevirtual charAt : (I)C
    //   1588: if_icmpgt -> 1932
    //   1591: sipush #-8006
    //   1594: sipush #-462
    //   1597: invokestatic a : (II)Ljava/lang/String;
    //   1600: iconst_1
    //   1601: ldc burp/Zg2z
    //   1603: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1606: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1609: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1612: astore #4
    //   1614: aload #4
    //   1616: arraylength
    //   1617: istore #5
    //   1619: iconst_0
    //   1620: istore #6
    //   1622: iload #6
    //   1624: iload #5
    //   1626: if_icmpge -> 1764
    //   1629: aload #4
    //   1631: iload #6
    //   1633: aaload
    //   1634: astore #7
    //   1636: aload #7
    //   1638: invokevirtual getModifiers : ()I
    //   1641: invokestatic isStatic : (I)Z
    //   1644: ifne -> 1654
    //   1647: goto -> 1757
    //   1650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1653: athrow
    //   1654: aload #7
    //   1656: invokevirtual getType : ()Ljava/lang/Class;
    //   1659: astore #8
    //   1661: aload #8
    //   1663: ifnull -> 1744
    //   1666: aload #8
    //   1668: invokevirtual isPrimitive : ()Z
    //   1671: ifne -> 1744
    //   1674: goto -> 1681
    //   1677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1680: athrow
    //   1681: aload #8
    //   1683: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1686: ifnull -> 1744
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1695: athrow
    //   1696: aload #8
    //   1698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1701: invokevirtual getName : ()Ljava/lang/String;
    //   1704: ifnull -> 1744
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: aload #8
    //   1716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1719: invokevirtual getName : ()Ljava/lang/String;
    //   1722: sipush #-8026
    //   1725: sipush #22692
    //   1728: invokestatic a : (II)Ljava/lang/String;
    //   1731: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1734: ifne -> 1744
    //   1737: goto -> 1744
    //   1740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1743: athrow
    //   1744: aload #7
    //   1746: iconst_1
    //   1747: invokevirtual setAccessible : (Z)V
    //   1750: aload #7
    //   1752: aconst_null
    //   1753: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1756: pop
    //   1757: iinc #6, 1
    //   1760: iload_2
    //   1761: ifne -> 1622
    //   1764: sipush #-8005
    //   1767: sipush #-6973
    //   1770: invokestatic a : (II)Ljava/lang/String;
    //   1773: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1776: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1779: astore #4
    //   1781: aload #4
    //   1783: arraylength
    //   1784: istore #5
    //   1786: iconst_0
    //   1787: istore #6
    //   1789: iload #6
    //   1791: iload #5
    //   1793: if_icmpge -> 1929
    //   1796: aload #4
    //   1798: iload #6
    //   1800: aaload
    //   1801: astore #7
    //   1803: aload #7
    //   1805: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1808: pop
    //   1809: aload #7
    //   1811: invokevirtual getModifiers : ()I
    //   1814: invokestatic isStatic : (I)Z
    //   1817: ifeq -> 1915
    //   1820: aload #7
    //   1822: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1825: arraylength
    //   1826: iconst_2
    //   1827: if_icmpne -> 1915
    //   1830: goto -> 1837
    //   1833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1836: athrow
    //   1837: aload #7
    //   1839: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1842: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1845: if_acmpne -> 1915
    //   1848: goto -> 1855
    //   1851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1854: athrow
    //   1855: aload #7
    //   1857: iconst_1
    //   1858: invokevirtual setAccessible : (Z)V
    //   1861: aload #7
    //   1863: aconst_null
    //   1864: iconst_2
    //   1865: anewarray java/lang/Object
    //   1868: dup
    //   1869: iconst_0
    //   1870: aload_0
    //   1871: aastore
    //   1872: dup
    //   1873: iconst_1
    //   1874: aload_1
    //   1875: ifnonnull -> 1893
    //   1878: goto -> 1885
    //   1881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1884: athrow
    //   1885: aload_1
    //   1886: goto -> 1900
    //   1889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1892: athrow
    //   1893: aload_1
    //   1894: checkcast [B
    //   1897: invokevirtual clone : ()Ljava/lang/Object;
    //   1900: aastore
    //   1901: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1904: checkcast java/lang/Boolean
    //   1907: invokevirtual booleanValue : ()Z
    //   1910: istore_3
    //   1911: iload_2
    //   1912: ifne -> 1929
    //   1915: iinc #6, 1
    //   1918: iload_2
    //   1919: ifne -> 1789
    //   1922: goto -> 1929
    //   1925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1928: athrow
    //   1929: goto -> 2270
    //   1932: sipush #-8015
    //   1935: sipush #32197
    //   1938: invokestatic a : (II)Ljava/lang/String;
    //   1941: iconst_1
    //   1942: ldc burp/Zmh0
    //   1944: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1947: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1950: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1953: astore #4
    //   1955: aload #4
    //   1957: arraylength
    //   1958: istore #5
    //   1960: iconst_0
    //   1961: istore #6
    //   1963: iload #6
    //   1965: iload #5
    //   1967: if_icmpge -> 2105
    //   1970: aload #4
    //   1972: iload #6
    //   1974: aaload
    //   1975: astore #7
    //   1977: aload #7
    //   1979: invokevirtual getModifiers : ()I
    //   1982: invokestatic isStatic : (I)Z
    //   1985: ifne -> 1995
    //   1988: goto -> 2098
    //   1991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1994: athrow
    //   1995: aload #7
    //   1997: invokevirtual getType : ()Ljava/lang/Class;
    //   2000: astore #8
    //   2002: aload #8
    //   2004: ifnull -> 2085
    //   2007: aload #8
    //   2009: invokevirtual isPrimitive : ()Z
    //   2012: ifne -> 2085
    //   2015: goto -> 2022
    //   2018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2021: athrow
    //   2022: aload #8
    //   2024: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2027: ifnull -> 2085
    //   2030: goto -> 2037
    //   2033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2036: athrow
    //   2037: aload #8
    //   2039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2042: invokevirtual getName : ()Ljava/lang/String;
    //   2045: ifnull -> 2085
    //   2048: goto -> 2055
    //   2051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2054: athrow
    //   2055: aload #8
    //   2057: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2060: invokevirtual getName : ()Ljava/lang/String;
    //   2063: sipush #-8026
    //   2066: sipush #22692
    //   2069: invokestatic a : (II)Ljava/lang/String;
    //   2072: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2075: ifne -> 2085
    //   2078: goto -> 2085
    //   2081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2084: athrow
    //   2085: aload #7
    //   2087: iconst_1
    //   2088: invokevirtual setAccessible : (Z)V
    //   2091: aload #7
    //   2093: aconst_null
    //   2094: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2097: pop
    //   2098: iinc #6, 1
    //   2101: iload_2
    //   2102: ifne -> 1963
    //   2105: sipush #-8030
    //   2108: sipush #-9872
    //   2111: invokestatic a : (II)Ljava/lang/String;
    //   2114: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2117: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2120: astore #4
    //   2122: aload #4
    //   2124: arraylength
    //   2125: istore #5
    //   2127: iconst_0
    //   2128: istore #6
    //   2130: iload #6
    //   2132: iload #5
    //   2134: if_icmpge -> 2270
    //   2137: aload #4
    //   2139: iload #6
    //   2141: aaload
    //   2142: astore #7
    //   2144: aload #7
    //   2146: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2149: pop
    //   2150: aload #7
    //   2152: invokevirtual getModifiers : ()I
    //   2155: invokestatic isStatic : (I)Z
    //   2158: ifeq -> 2256
    //   2161: aload #7
    //   2163: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2166: arraylength
    //   2167: iconst_2
    //   2168: if_icmpne -> 2256
    //   2171: goto -> 2178
    //   2174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2177: athrow
    //   2178: aload #7
    //   2180: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2183: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2186: if_acmpne -> 2256
    //   2189: goto -> 2196
    //   2192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2195: athrow
    //   2196: aload #7
    //   2198: iconst_1
    //   2199: invokevirtual setAccessible : (Z)V
    //   2202: aload #7
    //   2204: aconst_null
    //   2205: iconst_2
    //   2206: anewarray java/lang/Object
    //   2209: dup
    //   2210: iconst_0
    //   2211: aload_0
    //   2212: aastore
    //   2213: dup
    //   2214: iconst_1
    //   2215: aload_1
    //   2216: ifnonnull -> 2234
    //   2219: goto -> 2226
    //   2222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2225: athrow
    //   2226: aload_1
    //   2227: goto -> 2241
    //   2230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2233: athrow
    //   2234: aload_1
    //   2235: checkcast [B
    //   2238: invokevirtual clone : ()Ljava/lang/Object;
    //   2241: aastore
    //   2242: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2245: checkcast java/lang/Boolean
    //   2248: invokevirtual booleanValue : ()Z
    //   2251: istore_3
    //   2252: iload_2
    //   2253: ifne -> 2270
    //   2256: iinc #6, 1
    //   2259: iload_2
    //   2260: ifne -> 2130
    //   2263: goto -> 2270
    //   2266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2269: athrow
    //   2270: iload_3
    //   2271: ifeq -> 2276
    //   2274: iload_3
    //   2275: ireturn
    //   2276: getstatic burp/Zl7x.Zo : Ljava/lang/String;
    //   2279: getstatic burp/Zmdi.Zw : Ljava/lang/Object;
    //   2282: checkcast java/math/BigInteger
    //   2285: invokevirtual intValue : ()I
    //   2288: bipush #32
    //   2290: irem
    //   2291: invokestatic abs : (I)I
    //   2294: invokevirtual charAt : (I)C
    //   2297: getstatic burp/Zelt.ZJ : Ljava/lang/String;
    //   2300: getstatic burp/Zz66.ZQ : Ljava/lang/Object;
    //   2303: checkcast java/math/BigInteger
    //   2306: invokevirtual intValue : ()I
    //   2309: bipush #32
    //   2311: irem
    //   2312: invokestatic abs : (I)I
    //   2315: invokevirtual charAt : (I)C
    //   2318: if_icmple -> 2663
    //   2321: sipush #-8008
    //   2324: sipush #18466
    //   2327: invokestatic a : (II)Ljava/lang/String;
    //   2330: iconst_1
    //   2331: ldc burp/Zg7w
    //   2333: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2336: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2339: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2342: astore #4
    //   2344: aload #4
    //   2346: arraylength
    //   2347: istore #5
    //   2349: iconst_0
    //   2350: istore #6
    //   2352: iload #6
    //   2354: iload #5
    //   2356: if_icmpge -> 2494
    //   2359: aload #4
    //   2361: iload #6
    //   2363: aaload
    //   2364: astore #7
    //   2366: aload #7
    //   2368: invokevirtual getModifiers : ()I
    //   2371: invokestatic isStatic : (I)Z
    //   2374: ifne -> 2384
    //   2377: goto -> 2487
    //   2380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2383: athrow
    //   2384: aload #7
    //   2386: invokevirtual getType : ()Ljava/lang/Class;
    //   2389: astore #8
    //   2391: aload #8
    //   2393: ifnull -> 2474
    //   2396: aload #8
    //   2398: invokevirtual isPrimitive : ()Z
    //   2401: ifne -> 2474
    //   2404: goto -> 2411
    //   2407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2410: athrow
    //   2411: aload #8
    //   2413: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2416: ifnull -> 2474
    //   2419: goto -> 2426
    //   2422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2425: athrow
    //   2426: aload #8
    //   2428: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2431: invokevirtual getName : ()Ljava/lang/String;
    //   2434: ifnull -> 2474
    //   2437: goto -> 2444
    //   2440: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2443: athrow
    //   2444: aload #8
    //   2446: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2449: invokevirtual getName : ()Ljava/lang/String;
    //   2452: sipush #-8026
    //   2455: sipush #22692
    //   2458: invokestatic a : (II)Ljava/lang/String;
    //   2461: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2464: ifne -> 2474
    //   2467: goto -> 2474
    //   2470: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2473: athrow
    //   2474: aload #7
    //   2476: iconst_1
    //   2477: invokevirtual setAccessible : (Z)V
    //   2480: aload #7
    //   2482: aconst_null
    //   2483: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2486: pop
    //   2487: iinc #6, 1
    //   2490: iload_2
    //   2491: ifne -> 2352
    //   2494: sipush #-8032
    //   2497: sipush #19434
    //   2500: invokestatic a : (II)Ljava/lang/String;
    //   2503: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2506: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2509: astore #4
    //   2511: aload #4
    //   2513: arraylength
    //   2514: istore #5
    //   2516: iconst_0
    //   2517: istore #6
    //   2519: iload #6
    //   2521: iload #5
    //   2523: if_icmpge -> 2659
    //   2526: aload #4
    //   2528: iload #6
    //   2530: aaload
    //   2531: astore #7
    //   2533: aload #7
    //   2535: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2538: pop
    //   2539: aload #7
    //   2541: invokevirtual getModifiers : ()I
    //   2544: invokestatic isStatic : (I)Z
    //   2547: ifeq -> 2645
    //   2550: aload #7
    //   2552: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2555: arraylength
    //   2556: iconst_2
    //   2557: if_icmpne -> 2645
    //   2560: goto -> 2567
    //   2563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2566: athrow
    //   2567: aload #7
    //   2569: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2572: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2575: if_acmpne -> 2645
    //   2578: goto -> 2585
    //   2581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2584: athrow
    //   2585: aload #7
    //   2587: iconst_1
    //   2588: invokevirtual setAccessible : (Z)V
    //   2591: aload #7
    //   2593: aconst_null
    //   2594: iconst_2
    //   2595: anewarray java/lang/Object
    //   2598: dup
    //   2599: iconst_0
    //   2600: aload_0
    //   2601: aastore
    //   2602: dup
    //   2603: iconst_1
    //   2604: aload_1
    //   2605: ifnonnull -> 2623
    //   2608: goto -> 2615
    //   2611: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2614: athrow
    //   2615: aload_1
    //   2616: goto -> 2630
    //   2619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2622: athrow
    //   2623: aload_1
    //   2624: checkcast [B
    //   2627: invokevirtual clone : ()Ljava/lang/Object;
    //   2630: aastore
    //   2631: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2634: checkcast java/lang/Boolean
    //   2637: invokevirtual booleanValue : ()Z
    //   2640: istore_3
    //   2641: iload_2
    //   2642: ifne -> 2659
    //   2645: iinc #6, 1
    //   2648: iload_2
    //   2649: ifne -> 2519
    //   2652: goto -> 2659
    //   2655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2658: athrow
    //   2659: iload_2
    //   2660: ifne -> 3001
    //   2663: sipush #-8023
    //   2666: sipush #-22812
    //   2669: invokestatic a : (II)Ljava/lang/String;
    //   2672: iconst_1
    //   2673: ldc burp/Zro5
    //   2675: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2678: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2681: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2684: astore #4
    //   2686: aload #4
    //   2688: arraylength
    //   2689: istore #5
    //   2691: iconst_0
    //   2692: istore #6
    //   2694: iload #6
    //   2696: iload #5
    //   2698: if_icmpge -> 2836
    //   2701: aload #4
    //   2703: iload #6
    //   2705: aaload
    //   2706: astore #7
    //   2708: aload #7
    //   2710: invokevirtual getModifiers : ()I
    //   2713: invokestatic isStatic : (I)Z
    //   2716: ifne -> 2726
    //   2719: goto -> 2829
    //   2722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2725: athrow
    //   2726: aload #7
    //   2728: invokevirtual getType : ()Ljava/lang/Class;
    //   2731: astore #8
    //   2733: aload #8
    //   2735: ifnull -> 2816
    //   2738: aload #8
    //   2740: invokevirtual isPrimitive : ()Z
    //   2743: ifne -> 2816
    //   2746: goto -> 2753
    //   2749: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2752: athrow
    //   2753: aload #8
    //   2755: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2758: ifnull -> 2816
    //   2761: goto -> 2768
    //   2764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2767: athrow
    //   2768: aload #8
    //   2770: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2773: invokevirtual getName : ()Ljava/lang/String;
    //   2776: ifnull -> 2816
    //   2779: goto -> 2786
    //   2782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2785: athrow
    //   2786: aload #8
    //   2788: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2791: invokevirtual getName : ()Ljava/lang/String;
    //   2794: sipush #-8026
    //   2797: sipush #22692
    //   2800: invokestatic a : (II)Ljava/lang/String;
    //   2803: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2806: ifne -> 2816
    //   2809: goto -> 2816
    //   2812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2815: athrow
    //   2816: aload #7
    //   2818: iconst_1
    //   2819: invokevirtual setAccessible : (Z)V
    //   2822: aload #7
    //   2824: aconst_null
    //   2825: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2828: pop
    //   2829: iinc #6, 1
    //   2832: iload_2
    //   2833: ifne -> 2694
    //   2836: sipush #-8025
    //   2839: sipush #8847
    //   2842: invokestatic a : (II)Ljava/lang/String;
    //   2845: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2848: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2851: astore #4
    //   2853: aload #4
    //   2855: arraylength
    //   2856: istore #5
    //   2858: iconst_0
    //   2859: istore #6
    //   2861: iload #6
    //   2863: iload #5
    //   2865: if_icmpge -> 3001
    //   2868: aload #4
    //   2870: iload #6
    //   2872: aaload
    //   2873: astore #7
    //   2875: aload #7
    //   2877: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2880: pop
    //   2881: aload #7
    //   2883: invokevirtual getModifiers : ()I
    //   2886: invokestatic isStatic : (I)Z
    //   2889: ifeq -> 2987
    //   2892: aload #7
    //   2894: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2897: arraylength
    //   2898: iconst_2
    //   2899: if_icmpne -> 2987
    //   2902: goto -> 2909
    //   2905: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2908: athrow
    //   2909: aload #7
    //   2911: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2914: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2917: if_acmpne -> 2987
    //   2920: goto -> 2927
    //   2923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2926: athrow
    //   2927: aload #7
    //   2929: iconst_1
    //   2930: invokevirtual setAccessible : (Z)V
    //   2933: aload #7
    //   2935: aconst_null
    //   2936: iconst_2
    //   2937: anewarray java/lang/Object
    //   2940: dup
    //   2941: iconst_0
    //   2942: aload_0
    //   2943: aastore
    //   2944: dup
    //   2945: iconst_1
    //   2946: aload_1
    //   2947: ifnonnull -> 2965
    //   2950: goto -> 2957
    //   2953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2956: athrow
    //   2957: aload_1
    //   2958: goto -> 2972
    //   2961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2964: athrow
    //   2965: aload_1
    //   2966: checkcast [B
    //   2969: invokevirtual clone : ()Ljava/lang/Object;
    //   2972: aastore
    //   2973: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2976: checkcast java/lang/Boolean
    //   2979: invokevirtual booleanValue : ()Z
    //   2982: istore_3
    //   2983: iload_2
    //   2984: ifne -> 3001
    //   2987: iinc #6, 1
    //   2990: iload_2
    //   2991: ifne -> 2861
    //   2994: goto -> 3001
    //   2997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3000: athrow
    //   3001: iload_3
    //   3002: ifeq -> 3007
    //   3005: iload_3
    //   3006: ireturn
    //   3007: getstatic burp/Zegj.ZS : Ljava/lang/String;
    //   3010: getstatic burp/Zbnz.Zb : Ljava/lang/Object;
    //   3013: checkcast java/math/BigInteger
    //   3016: invokevirtual intValue : ()I
    //   3019: bipush #32
    //   3021: irem
    //   3022: invokestatic abs : (I)I
    //   3025: invokevirtual charAt : (I)C
    //   3028: getstatic burp/Zm63.Zs : Ljava/lang/String;
    //   3031: getstatic burp/Ze8j.ZQ : Ljava/lang/Object;
    //   3034: checkcast java/math/BigInteger
    //   3037: invokevirtual intValue : ()I
    //   3040: bipush #32
    //   3042: irem
    //   3043: invokestatic abs : (I)I
    //   3046: invokevirtual charAt : (I)C
    //   3049: if_icmple -> 3394
    //   3052: sipush #-8031
    //   3055: sipush #-2067
    //   3058: invokestatic a : (II)Ljava/lang/String;
    //   3061: iconst_1
    //   3062: ldc burp/Zkor
    //   3064: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3067: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3070: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3073: astore #4
    //   3075: aload #4
    //   3077: arraylength
    //   3078: istore #5
    //   3080: iconst_0
    //   3081: istore #6
    //   3083: iload #6
    //   3085: iload #5
    //   3087: if_icmpge -> 3225
    //   3090: aload #4
    //   3092: iload #6
    //   3094: aaload
    //   3095: astore #7
    //   3097: aload #7
    //   3099: invokevirtual getModifiers : ()I
    //   3102: invokestatic isStatic : (I)Z
    //   3105: ifne -> 3115
    //   3108: goto -> 3218
    //   3111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3114: athrow
    //   3115: aload #7
    //   3117: invokevirtual getType : ()Ljava/lang/Class;
    //   3120: astore #8
    //   3122: aload #8
    //   3124: ifnull -> 3205
    //   3127: aload #8
    //   3129: invokevirtual isPrimitive : ()Z
    //   3132: ifne -> 3205
    //   3135: goto -> 3142
    //   3138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3141: athrow
    //   3142: aload #8
    //   3144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3147: ifnull -> 3205
    //   3150: goto -> 3157
    //   3153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3156: athrow
    //   3157: aload #8
    //   3159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3162: invokevirtual getName : ()Ljava/lang/String;
    //   3165: ifnull -> 3205
    //   3168: goto -> 3175
    //   3171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3174: athrow
    //   3175: aload #8
    //   3177: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3180: invokevirtual getName : ()Ljava/lang/String;
    //   3183: sipush #-8026
    //   3186: sipush #22692
    //   3189: invokestatic a : (II)Ljava/lang/String;
    //   3192: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3195: ifne -> 3205
    //   3198: goto -> 3205
    //   3201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3204: athrow
    //   3205: aload #7
    //   3207: iconst_1
    //   3208: invokevirtual setAccessible : (Z)V
    //   3211: aload #7
    //   3213: aconst_null
    //   3214: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3217: pop
    //   3218: iinc #6, 1
    //   3221: iload_2
    //   3222: ifne -> 3083
    //   3225: sipush #-8029
    //   3228: sipush #-12468
    //   3231: invokestatic a : (II)Ljava/lang/String;
    //   3234: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3237: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3240: astore #4
    //   3242: aload #4
    //   3244: arraylength
    //   3245: istore #5
    //   3247: iconst_0
    //   3248: istore #6
    //   3250: iload #6
    //   3252: iload #5
    //   3254: if_icmpge -> 3390
    //   3257: aload #4
    //   3259: iload #6
    //   3261: aaload
    //   3262: astore #7
    //   3264: aload #7
    //   3266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3269: pop
    //   3270: aload #7
    //   3272: invokevirtual getModifiers : ()I
    //   3275: invokestatic isStatic : (I)Z
    //   3278: ifeq -> 3376
    //   3281: aload #7
    //   3283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3286: arraylength
    //   3287: iconst_2
    //   3288: if_icmpne -> 3376
    //   3291: goto -> 3298
    //   3294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3297: athrow
    //   3298: aload #7
    //   3300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3303: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3306: if_acmpne -> 3376
    //   3309: goto -> 3316
    //   3312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3315: athrow
    //   3316: aload #7
    //   3318: iconst_1
    //   3319: invokevirtual setAccessible : (Z)V
    //   3322: aload #7
    //   3324: aconst_null
    //   3325: iconst_2
    //   3326: anewarray java/lang/Object
    //   3329: dup
    //   3330: iconst_0
    //   3331: aload_0
    //   3332: aastore
    //   3333: dup
    //   3334: iconst_1
    //   3335: aload_1
    //   3336: ifnonnull -> 3354
    //   3339: goto -> 3346
    //   3342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3345: athrow
    //   3346: aload_1
    //   3347: goto -> 3361
    //   3350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3353: athrow
    //   3354: aload_1
    //   3355: checkcast [B
    //   3358: invokevirtual clone : ()Ljava/lang/Object;
    //   3361: aastore
    //   3362: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3365: checkcast java/lang/Boolean
    //   3368: invokevirtual booleanValue : ()Z
    //   3371: istore_3
    //   3372: iload_2
    //   3373: ifne -> 3390
    //   3376: iinc #6, 1
    //   3379: iload_2
    //   3380: ifne -> 3250
    //   3383: goto -> 3390
    //   3386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3389: athrow
    //   3390: iload_2
    //   3391: ifne -> 3732
    //   3394: sipush #-8003
    //   3397: sipush #-16274
    //   3400: invokestatic a : (II)Ljava/lang/String;
    //   3403: iconst_1
    //   3404: ldc burp/Ze3j
    //   3406: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3409: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3412: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3415: astore #4
    //   3417: aload #4
    //   3419: arraylength
    //   3420: istore #5
    //   3422: iconst_0
    //   3423: istore #6
    //   3425: iload #6
    //   3427: iload #5
    //   3429: if_icmpge -> 3567
    //   3432: aload #4
    //   3434: iload #6
    //   3436: aaload
    //   3437: astore #7
    //   3439: aload #7
    //   3441: invokevirtual getModifiers : ()I
    //   3444: invokestatic isStatic : (I)Z
    //   3447: ifne -> 3457
    //   3450: goto -> 3560
    //   3453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3456: athrow
    //   3457: aload #7
    //   3459: invokevirtual getType : ()Ljava/lang/Class;
    //   3462: astore #8
    //   3464: aload #8
    //   3466: ifnull -> 3547
    //   3469: aload #8
    //   3471: invokevirtual isPrimitive : ()Z
    //   3474: ifne -> 3547
    //   3477: goto -> 3484
    //   3480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3483: athrow
    //   3484: aload #8
    //   3486: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3489: ifnull -> 3547
    //   3492: goto -> 3499
    //   3495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3498: athrow
    //   3499: aload #8
    //   3501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3504: invokevirtual getName : ()Ljava/lang/String;
    //   3507: ifnull -> 3547
    //   3510: goto -> 3517
    //   3513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3516: athrow
    //   3517: aload #8
    //   3519: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3522: invokevirtual getName : ()Ljava/lang/String;
    //   3525: sipush #-8026
    //   3528: sipush #22692
    //   3531: invokestatic a : (II)Ljava/lang/String;
    //   3534: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3537: ifne -> 3547
    //   3540: goto -> 3547
    //   3543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3546: athrow
    //   3547: aload #7
    //   3549: iconst_1
    //   3550: invokevirtual setAccessible : (Z)V
    //   3553: aload #7
    //   3555: aconst_null
    //   3556: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3559: pop
    //   3560: iinc #6, 1
    //   3563: iload_2
    //   3564: ifne -> 3425
    //   3567: sipush #-8027
    //   3570: sipush #-21869
    //   3573: invokestatic a : (II)Ljava/lang/String;
    //   3576: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3579: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3582: astore #4
    //   3584: aload #4
    //   3586: arraylength
    //   3587: istore #5
    //   3589: iconst_0
    //   3590: istore #6
    //   3592: iload #6
    //   3594: iload #5
    //   3596: if_icmpge -> 3732
    //   3599: aload #4
    //   3601: iload #6
    //   3603: aaload
    //   3604: astore #7
    //   3606: aload #7
    //   3608: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3611: pop
    //   3612: aload #7
    //   3614: invokevirtual getModifiers : ()I
    //   3617: invokestatic isStatic : (I)Z
    //   3620: ifeq -> 3718
    //   3623: aload #7
    //   3625: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3628: arraylength
    //   3629: iconst_2
    //   3630: if_icmpne -> 3718
    //   3633: goto -> 3640
    //   3636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3639: athrow
    //   3640: aload #7
    //   3642: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3645: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3648: if_acmpne -> 3718
    //   3651: goto -> 3658
    //   3654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3657: athrow
    //   3658: aload #7
    //   3660: iconst_1
    //   3661: invokevirtual setAccessible : (Z)V
    //   3664: aload #7
    //   3666: aconst_null
    //   3667: iconst_2
    //   3668: anewarray java/lang/Object
    //   3671: dup
    //   3672: iconst_0
    //   3673: aload_0
    //   3674: aastore
    //   3675: dup
    //   3676: iconst_1
    //   3677: aload_1
    //   3678: ifnonnull -> 3696
    //   3681: goto -> 3688
    //   3684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3687: athrow
    //   3688: aload_1
    //   3689: goto -> 3703
    //   3692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3695: athrow
    //   3696: aload_1
    //   3697: checkcast [B
    //   3700: invokevirtual clone : ()Ljava/lang/Object;
    //   3703: aastore
    //   3704: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3707: checkcast java/lang/Boolean
    //   3710: invokevirtual booleanValue : ()Z
    //   3713: istore_3
    //   3714: iload_2
    //   3715: ifne -> 3732
    //   3718: iinc #6, 1
    //   3721: iload_2
    //   3722: ifne -> 3592
    //   3725: goto -> 3732
    //   3728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3731: athrow
    //   3732: iload_3
    //   3733: ifeq -> 3738
    //   3736: iload_3
    //   3737: ireturn
    //   3738: getstatic burp/Zb3l.Zz : Ljava/lang/String;
    //   3741: getstatic burp/Zbli.Zo : Ljava/lang/Object;
    //   3744: checkcast java/math/BigInteger
    //   3747: invokevirtual intValue : ()I
    //   3750: bipush #32
    //   3752: irem
    //   3753: invokestatic abs : (I)I
    //   3756: invokevirtual charAt : (I)C
    //   3759: getstatic burp/Zxju.Zt : Ljava/lang/String;
    //   3762: getstatic burp/Zlsg.ZD : Ljava/lang/Object;
    //   3765: checkcast java/math/BigInteger
    //   3768: invokevirtual intValue : ()I
    //   3771: bipush #32
    //   3773: irem
    //   3774: invokestatic abs : (I)I
    //   3777: invokevirtual charAt : (I)C
    //   3780: if_icmpgt -> 4125
    //   3783: sipush #-8014
    //   3786: sipush #-18470
    //   3789: invokestatic a : (II)Ljava/lang/String;
    //   3792: iconst_1
    //   3793: ldc burp/Ze6k
    //   3795: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3798: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3801: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3804: astore #4
    //   3806: aload #4
    //   3808: arraylength
    //   3809: istore #5
    //   3811: iconst_0
    //   3812: istore #6
    //   3814: iload #6
    //   3816: iload #5
    //   3818: if_icmpge -> 3956
    //   3821: aload #4
    //   3823: iload #6
    //   3825: aaload
    //   3826: astore #7
    //   3828: aload #7
    //   3830: invokevirtual getModifiers : ()I
    //   3833: invokestatic isStatic : (I)Z
    //   3836: ifne -> 3846
    //   3839: goto -> 3949
    //   3842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3845: athrow
    //   3846: aload #7
    //   3848: invokevirtual getType : ()Ljava/lang/Class;
    //   3851: astore #8
    //   3853: aload #8
    //   3855: ifnull -> 3936
    //   3858: aload #8
    //   3860: invokevirtual isPrimitive : ()Z
    //   3863: ifne -> 3936
    //   3866: goto -> 3873
    //   3869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3872: athrow
    //   3873: aload #8
    //   3875: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3878: ifnull -> 3936
    //   3881: goto -> 3888
    //   3884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3887: athrow
    //   3888: aload #8
    //   3890: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3893: invokevirtual getName : ()Ljava/lang/String;
    //   3896: ifnull -> 3936
    //   3899: goto -> 3906
    //   3902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3905: athrow
    //   3906: aload #8
    //   3908: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3911: invokevirtual getName : ()Ljava/lang/String;
    //   3914: sipush #-8026
    //   3917: sipush #22692
    //   3920: invokestatic a : (II)Ljava/lang/String;
    //   3923: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3926: ifne -> 3936
    //   3929: goto -> 3936
    //   3932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3935: athrow
    //   3936: aload #7
    //   3938: iconst_1
    //   3939: invokevirtual setAccessible : (Z)V
    //   3942: aload #7
    //   3944: aconst_null
    //   3945: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3948: pop
    //   3949: iinc #6, 1
    //   3952: iload_2
    //   3953: ifne -> 3814
    //   3956: sipush #-8010
    //   3959: sipush #-16935
    //   3962: invokestatic a : (II)Ljava/lang/String;
    //   3965: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3968: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3971: astore #4
    //   3973: aload #4
    //   3975: arraylength
    //   3976: istore #5
    //   3978: iconst_0
    //   3979: istore #6
    //   3981: iload #6
    //   3983: iload #5
    //   3985: if_icmpge -> 4121
    //   3988: aload #4
    //   3990: iload #6
    //   3992: aaload
    //   3993: astore #7
    //   3995: aload #7
    //   3997: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4000: pop
    //   4001: aload #7
    //   4003: invokevirtual getModifiers : ()I
    //   4006: invokestatic isStatic : (I)Z
    //   4009: ifeq -> 4107
    //   4012: aload #7
    //   4014: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4017: arraylength
    //   4018: iconst_2
    //   4019: if_icmpne -> 4107
    //   4022: goto -> 4029
    //   4025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4028: athrow
    //   4029: aload #7
    //   4031: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4034: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4037: if_acmpne -> 4107
    //   4040: goto -> 4047
    //   4043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4046: athrow
    //   4047: aload #7
    //   4049: iconst_1
    //   4050: invokevirtual setAccessible : (Z)V
    //   4053: aload #7
    //   4055: aconst_null
    //   4056: iconst_2
    //   4057: anewarray java/lang/Object
    //   4060: dup
    //   4061: iconst_0
    //   4062: aload_0
    //   4063: aastore
    //   4064: dup
    //   4065: iconst_1
    //   4066: aload_1
    //   4067: ifnonnull -> 4085
    //   4070: goto -> 4077
    //   4073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4076: athrow
    //   4077: aload_1
    //   4078: goto -> 4092
    //   4081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4084: athrow
    //   4085: aload_1
    //   4086: checkcast [B
    //   4089: invokevirtual clone : ()Ljava/lang/Object;
    //   4092: aastore
    //   4093: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4096: checkcast java/lang/Boolean
    //   4099: invokevirtual booleanValue : ()Z
    //   4102: istore_3
    //   4103: iload_2
    //   4104: ifne -> 4121
    //   4107: iinc #6, 1
    //   4110: iload_2
    //   4111: ifne -> 3981
    //   4114: goto -> 4121
    //   4117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4120: athrow
    //   4121: iload_2
    //   4122: ifne -> 4463
    //   4125: sipush #-8012
    //   4128: sipush #-21438
    //   4131: invokestatic a : (II)Ljava/lang/String;
    //   4134: iconst_1
    //   4135: ldc burp/Zzvr
    //   4137: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4140: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4143: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4146: astore #4
    //   4148: aload #4
    //   4150: arraylength
    //   4151: istore #5
    //   4153: iconst_0
    //   4154: istore #6
    //   4156: iload #6
    //   4158: iload #5
    //   4160: if_icmpge -> 4298
    //   4163: aload #4
    //   4165: iload #6
    //   4167: aaload
    //   4168: astore #7
    //   4170: aload #7
    //   4172: invokevirtual getModifiers : ()I
    //   4175: invokestatic isStatic : (I)Z
    //   4178: ifne -> 4188
    //   4181: goto -> 4291
    //   4184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4187: athrow
    //   4188: aload #7
    //   4190: invokevirtual getType : ()Ljava/lang/Class;
    //   4193: astore #8
    //   4195: aload #8
    //   4197: ifnull -> 4278
    //   4200: aload #8
    //   4202: invokevirtual isPrimitive : ()Z
    //   4205: ifne -> 4278
    //   4208: goto -> 4215
    //   4211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4214: athrow
    //   4215: aload #8
    //   4217: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4220: ifnull -> 4278
    //   4223: goto -> 4230
    //   4226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4229: athrow
    //   4230: aload #8
    //   4232: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4235: invokevirtual getName : ()Ljava/lang/String;
    //   4238: ifnull -> 4278
    //   4241: goto -> 4248
    //   4244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4247: athrow
    //   4248: aload #8
    //   4250: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4253: invokevirtual getName : ()Ljava/lang/String;
    //   4256: sipush #-8026
    //   4259: sipush #22692
    //   4262: invokestatic a : (II)Ljava/lang/String;
    //   4265: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4268: ifne -> 4278
    //   4271: goto -> 4278
    //   4274: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4277: athrow
    //   4278: aload #7
    //   4280: iconst_1
    //   4281: invokevirtual setAccessible : (Z)V
    //   4284: aload #7
    //   4286: aconst_null
    //   4287: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4290: pop
    //   4291: iinc #6, 1
    //   4294: iload_2
    //   4295: ifne -> 4156
    //   4298: sipush #-8024
    //   4301: sipush #30417
    //   4304: invokestatic a : (II)Ljava/lang/String;
    //   4307: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4310: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4313: astore #4
    //   4315: aload #4
    //   4317: arraylength
    //   4318: istore #5
    //   4320: iconst_0
    //   4321: istore #6
    //   4323: iload #6
    //   4325: iload #5
    //   4327: if_icmpge -> 4463
    //   4330: aload #4
    //   4332: iload #6
    //   4334: aaload
    //   4335: astore #7
    //   4337: aload #7
    //   4339: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4342: pop
    //   4343: aload #7
    //   4345: invokevirtual getModifiers : ()I
    //   4348: invokestatic isStatic : (I)Z
    //   4351: ifeq -> 4449
    //   4354: aload #7
    //   4356: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4359: arraylength
    //   4360: iconst_2
    //   4361: if_icmpne -> 4449
    //   4364: goto -> 4371
    //   4367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4370: athrow
    //   4371: aload #7
    //   4373: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4376: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4379: if_acmpne -> 4449
    //   4382: goto -> 4389
    //   4385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4388: athrow
    //   4389: aload #7
    //   4391: iconst_1
    //   4392: invokevirtual setAccessible : (Z)V
    //   4395: aload #7
    //   4397: aconst_null
    //   4398: iconst_2
    //   4399: anewarray java/lang/Object
    //   4402: dup
    //   4403: iconst_0
    //   4404: aload_0
    //   4405: aastore
    //   4406: dup
    //   4407: iconst_1
    //   4408: aload_1
    //   4409: ifnonnull -> 4427
    //   4412: goto -> 4419
    //   4415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4418: athrow
    //   4419: aload_1
    //   4420: goto -> 4434
    //   4423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4426: athrow
    //   4427: aload_1
    //   4428: checkcast [B
    //   4431: invokevirtual clone : ()Ljava/lang/Object;
    //   4434: aastore
    //   4435: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4438: checkcast java/lang/Boolean
    //   4441: invokevirtual booleanValue : ()Z
    //   4444: istore_3
    //   4445: iload_2
    //   4446: ifne -> 4463
    //   4449: iinc #6, 1
    //   4452: iload_2
    //   4453: ifne -> 4323
    //   4456: goto -> 4463
    //   4459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4462: athrow
    //   4463: iload_3
    //   4464: ireturn
    //   4465: astore_3
    //   4466: new java/lang/Exception
    //   4469: dup
    //   4470: aload_3
    //   4471: invokevirtual getMessage : ()Ljava/lang/String;
    //   4474: invokespecial <init> : (Ljava/lang/String;)V
    //   4477: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2275	4465	java/lang/Throwable
    //   51	65	68	java/lang/Throwable
    //   58	79	82	java/lang/Throwable
    //   72	93	96	java/lang/Throwable
    //   86	107	110	java/lang/Throwable
    //   100	121	124	java/lang/Throwable
    //   114	135	138	java/lang/Throwable
    //   128	149	152	java/lang/Throwable
    //   142	163	166	java/lang/Throwable
    //   156	173	176	java/lang/Throwable
    //   212	226	229	java/lang/Throwable
    //   219	240	243	java/lang/Throwable
    //   233	254	257	java/lang/Throwable
    //   247	268	271	java/lang/Throwable
    //   261	282	285	java/lang/Throwable
    //   275	296	299	java/lang/Throwable
    //   289	310	313	java/lang/Throwable
    //   303	324	327	java/lang/Throwable
    //   317	341	344	java/lang/Throwable
    //   405	423	426	java/lang/Throwable
    //   414	439	442	java/lang/Throwable
    //   430	456	459	java/lang/Throwable
    //   446	472	475	java/lang/Throwable
    //   463	489	492	java/lang/Throwable
    //   479	505	508	java/lang/Throwable
    //   496	521	524	java/lang/Throwable
    //   512	544	547	java/lang/Throwable
    //   528	560	563	java/lang/Throwable
    //   551	576	579	java/lang/Throwable
    //   567	599	602	java/lang/Throwable
    //   583	615	618	java/lang/Throwable
    //   606	631	634	java/lang/Throwable
    //   622	650	653	java/lang/Throwable
    //   780	815	818	java/lang/Throwable
    //   822	863	866	java/lang/Throwable
    //   949	963	963	java/lang/Throwable
    //   974	987	990	java/lang/Throwable
    //   979	1002	1005	java/lang/Throwable
    //   994	1020	1023	java/lang/Throwable
    //   1009	1050	1053	java/lang/Throwable
    //   1113	1140	1143	java/lang/Throwable
    //   1130	1161	1164	java/lang/Throwable
    //   1147	1191	1194	java/lang/Throwable
    //   1168	1202	1202	java/lang/Throwable
    //   1213	1229	1232	java/lang/Throwable
    //   1278	1292	1292	java/lang/Throwable
    //   1303	1316	1319	java/lang/Throwable
    //   1308	1331	1334	java/lang/Throwable
    //   1323	1349	1352	java/lang/Throwable
    //   1338	1379	1382	java/lang/Throwable
    //   1442	1469	1472	java/lang/Throwable
    //   1459	1487	1490	java/lang/Throwable
    //   1476	1523	1526	java/lang/Throwable
    //   1494	1537	1540	java/lang/Throwable
    //   1636	1650	1650	java/lang/Throwable
    //   1661	1674	1677	java/lang/Throwable
    //   1666	1689	1692	java/lang/Throwable
    //   1681	1707	1710	java/lang/Throwable
    //   1696	1737	1740	java/lang/Throwable
    //   1803	1830	1833	java/lang/Throwable
    //   1820	1848	1851	java/lang/Throwable
    //   1837	1878	1881	java/lang/Throwable
    //   1855	1889	1889	java/lang/Throwable
    //   1911	1922	1925	java/lang/Throwable
    //   1977	1991	1991	java/lang/Throwable
    //   2002	2015	2018	java/lang/Throwable
    //   2007	2030	2033	java/lang/Throwable
    //   2022	2048	2051	java/lang/Throwable
    //   2037	2078	2081	java/lang/Throwable
    //   2144	2171	2174	java/lang/Throwable
    //   2161	2189	2192	java/lang/Throwable
    //   2178	2219	2222	java/lang/Throwable
    //   2196	2230	2230	java/lang/Throwable
    //   2252	2263	2266	java/lang/Throwable
    //   2276	3006	4465	java/lang/Throwable
    //   2366	2380	2380	java/lang/Throwable
    //   2391	2404	2407	java/lang/Throwable
    //   2396	2419	2422	java/lang/Throwable
    //   2411	2437	2440	java/lang/Throwable
    //   2426	2467	2470	java/lang/Throwable
    //   2533	2560	2563	java/lang/Throwable
    //   2550	2578	2581	java/lang/Throwable
    //   2567	2608	2611	java/lang/Throwable
    //   2585	2619	2619	java/lang/Throwable
    //   2641	2652	2655	java/lang/Throwable
    //   2708	2722	2722	java/lang/Throwable
    //   2733	2746	2749	java/lang/Throwable
    //   2738	2761	2764	java/lang/Throwable
    //   2753	2779	2782	java/lang/Throwable
    //   2768	2809	2812	java/lang/Throwable
    //   2875	2902	2905	java/lang/Throwable
    //   2892	2920	2923	java/lang/Throwable
    //   2909	2950	2953	java/lang/Throwable
    //   2927	2961	2961	java/lang/Throwable
    //   2983	2994	2997	java/lang/Throwable
    //   3007	3737	4465	java/lang/Throwable
    //   3097	3111	3111	java/lang/Throwable
    //   3122	3135	3138	java/lang/Throwable
    //   3127	3150	3153	java/lang/Throwable
    //   3142	3168	3171	java/lang/Throwable
    //   3157	3198	3201	java/lang/Throwable
    //   3264	3291	3294	java/lang/Throwable
    //   3281	3309	3312	java/lang/Throwable
    //   3298	3339	3342	java/lang/Throwable
    //   3316	3350	3350	java/lang/Throwable
    //   3372	3383	3386	java/lang/Throwable
    //   3439	3453	3453	java/lang/Throwable
    //   3464	3477	3480	java/lang/Throwable
    //   3469	3492	3495	java/lang/Throwable
    //   3484	3510	3513	java/lang/Throwable
    //   3499	3540	3543	java/lang/Throwable
    //   3606	3633	3636	java/lang/Throwable
    //   3623	3651	3654	java/lang/Throwable
    //   3640	3681	3684	java/lang/Throwable
    //   3658	3692	3692	java/lang/Throwable
    //   3714	3725	3728	java/lang/Throwable
    //   3738	4464	4465	java/lang/Throwable
    //   3828	3842	3842	java/lang/Throwable
    //   3853	3866	3869	java/lang/Throwable
    //   3858	3881	3884	java/lang/Throwable
    //   3873	3899	3902	java/lang/Throwable
    //   3888	3929	3932	java/lang/Throwable
    //   3995	4022	4025	java/lang/Throwable
    //   4012	4040	4043	java/lang/Throwable
    //   4029	4070	4073	java/lang/Throwable
    //   4047	4081	4081	java/lang/Throwable
    //   4103	4114	4117	java/lang/Throwable
    //   4170	4184	4184	java/lang/Throwable
    //   4195	4208	4211	java/lang/Throwable
    //   4200	4223	4226	java/lang/Throwable
    //   4215	4241	4244	java/lang/Throwable
    //   4230	4271	4274	java/lang/Throwable
    //   4337	4364	4367	java/lang/Throwable
    //   4354	4382	4385	java/lang/Throwable
    //   4371	4412	4415	java/lang/Throwable
    //   4389	4423	4423	java/lang/Throwable
    //   4445	4456	4459	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'í\\t)xÅQ:"\\t>hST©\\tnw\\r9Z\\tö J]©4Æå\\tVÂ^+¿Úß\\tªÁØ¬èöJ\\bA³¼/wz\\ta eS­¨kPL²-ðh²\\tÉ#_â oÝÂåÒ\\tõ¡*m¥2T?µMT,%×-&³ø \\n}ælliÛ)!õÍNó|àràð[y8í×îçÿSjk·¥PÜµ!¤×¦)w0:\\r<Räðõtiüp²\\to­yìÏk\\tcøÿºÓ\\tÀ*q×ùÿ\\tcg5\\f9~MS 11\\nF`ìBi¾\\f%¸OüÂ ´iîRÉçÒ­3MÌÉ÷)¨ò{À,ãùÕRä\kNiTÂ_¨öÃ¥OV  UÏÊîêéE¤æZÇ¾EAPØ%DGø(¡¡qÅ\\tû&"[£\\b©\\t­­!ìÄam'\\tp¥WTulq\\tËHíP]RA\\tm79¿Çh%*\\t®§}©bò0Ê_\\bEÞ<gÏ\\tßvo\\rmMG\\b¼ôÇgþ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #97
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
    //   68: ldc 'G\\r\\r\\t²Rú_5á,'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #118
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
    //   128: putstatic burp/Zb2u.a : [Ljava/lang/String;
    //   131: bipush #28
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zb2u.b : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #44
    //   224: goto -> 244
    //   227: bipush #53
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #80
    //   239: goto -> 244
    //   242: bipush #106
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
    //   304: sipush #-8007
    //   307: sipush #-29011
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zb2u.ZY : Ljava/lang/Object;
    //   319: sipush #-8009
    //   322: sipush #25228
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zb2u.ZM : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE0B0) & 0xFFFF;
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
      byte b1 = 21;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */