package burp;

import java.math.BigInteger;

class Zxjm extends ClassLoader {
  static Object Zn;
  
  static String ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zj(Object paramObject) {
    Zgfm.ZE = a(6523, -12939);
    Zgfm.ZV = new BigInteger(a(6508, -29750));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrcu.Zb.charAt(Math.abs(((BigInteger)Zrcu.Zs).intValue() % 32)) > Zm1l.Zp.charAt(Math.abs(((BigInteger)Zlxh.ZU).intValue() % 32))) {
          try {
            Zrcu.ZM(Class.forName(a(6522, 22334)));
            if (bool)
              Zsn6.ZL(Class.forName(a(6504, -15149))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsn6.ZL(Class.forName(a(6504, -15149)));
    } catch (Throwable throwable) {}
  }
  
  static void ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zu(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrw7.ZV : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zmir.ZF : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsk4.Ze : Ljava/lang/Object;
    //   22: getstatic burp/Zg7j.Zr : Ljava/lang/Object;
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
    //   874: sipush #6518
    //   877: new java/math/BigInteger
    //   880: dup
    //   881: aload #4
    //   883: invokespecial <init> : ([B)V
    //   886: invokevirtual abs : ()Ljava/math/BigInteger;
    //   889: putstatic burp/Zry9.Zw : Ljava/lang/Object;
    //   892: sipush #4973
    //   895: invokestatic a : (II)Ljava/lang/String;
    //   898: iconst_1
    //   899: ldc burp/Zluk
    //   901: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   904: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   907: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   910: astore_3
    //   911: aload_3
    //   912: arraylength
    //   913: istore #4
    //   915: iconst_0
    //   916: istore #5
    //   918: iload #5
    //   920: iload #4
    //   922: if_icmpge -> 1059
    //   925: aload_3
    //   926: iload #5
    //   928: aaload
    //   929: astore #6
    //   931: aload #6
    //   933: invokevirtual getModifiers : ()I
    //   936: invokestatic isStatic : (I)Z
    //   939: ifne -> 949
    //   942: goto -> 1052
    //   945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   948: athrow
    //   949: aload #6
    //   951: invokevirtual getType : ()Ljava/lang/Class;
    //   954: astore #7
    //   956: aload #7
    //   958: ifnull -> 1039
    //   961: aload #7
    //   963: invokevirtual isPrimitive : ()Z
    //   966: ifne -> 1039
    //   969: goto -> 976
    //   972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   975: athrow
    //   976: aload #7
    //   978: invokevirtual getPackage : ()Ljava/lang/Package;
    //   981: ifnull -> 1039
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #7
    //   993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: ifnull -> 1039
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1008: athrow
    //   1009: aload #7
    //   1011: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1014: invokevirtual getName : ()Ljava/lang/String;
    //   1017: sipush #6501
    //   1020: sipush #25016
    //   1023: invokestatic a : (II)Ljava/lang/String;
    //   1026: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1029: ifne -> 1039
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: aload #6
    //   1041: iconst_1
    //   1042: invokevirtual setAccessible : (Z)V
    //   1045: aload #6
    //   1047: aconst_null
    //   1048: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1051: pop
    //   1052: iinc #5, 1
    //   1055: iload_2
    //   1056: ifne -> 918
    //   1059: sipush #6507
    //   1062: sipush #24984
    //   1065: invokestatic a : (II)Ljava/lang/String;
    //   1068: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1071: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1074: astore_3
    //   1075: aload_3
    //   1076: arraylength
    //   1077: istore #4
    //   1079: iconst_0
    //   1080: istore #5
    //   1082: iload #5
    //   1084: iload #4
    //   1086: if_icmpge -> 1218
    //   1089: aload_3
    //   1090: iload #5
    //   1092: aaload
    //   1093: astore #6
    //   1095: aload #6
    //   1097: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1100: pop
    //   1101: aload #6
    //   1103: invokevirtual getModifiers : ()I
    //   1106: invokestatic isStatic : (I)Z
    //   1109: ifeq -> 1204
    //   1112: aload #6
    //   1114: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1117: arraylength
    //   1118: iconst_2
    //   1119: if_icmpne -> 1204
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #6
    //   1131: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1134: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1137: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1140: ifeq -> 1204
    //   1143: goto -> 1150
    //   1146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1149: athrow
    //   1150: aload #6
    //   1152: iconst_1
    //   1153: invokevirtual setAccessible : (Z)V
    //   1156: aload #6
    //   1158: aconst_null
    //   1159: iconst_2
    //   1160: anewarray java/lang/Object
    //   1163: dup
    //   1164: iconst_0
    //   1165: aload_0
    //   1166: aastore
    //   1167: dup
    //   1168: iconst_1
    //   1169: aload_1
    //   1170: ifnonnull -> 1188
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload_1
    //   1181: goto -> 1195
    //   1184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1187: athrow
    //   1188: aload_1
    //   1189: checkcast [B
    //   1192: invokevirtual clone : ()Ljava/lang/Object;
    //   1195: aastore
    //   1196: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1199: pop
    //   1200: iload_2
    //   1201: ifne -> 1218
    //   1204: iinc #5, 1
    //   1207: iload_2
    //   1208: ifne -> 1082
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: new java/io/ByteArrayOutputStream
    //   1221: dup
    //   1222: invokespecial <init> : ()V
    //   1225: astore_3
    //   1226: sipush #6509
    //   1229: aload_3
    //   1230: sipush #202
    //   1233: invokevirtual write : (I)V
    //   1236: sipush #1181
    //   1239: aload_3
    //   1240: sipush #254
    //   1243: invokevirtual write : (I)V
    //   1246: aload_3
    //   1247: sipush #186
    //   1250: invokevirtual write : (I)V
    //   1253: aload_3
    //   1254: sipush #190
    //   1257: invokevirtual write : (I)V
    //   1260: aload_3
    //   1261: iconst_0
    //   1262: invokevirtual write : (I)V
    //   1265: aload_3
    //   1266: iconst_1
    //   1267: invokevirtual write : (I)V
    //   1270: aload_3
    //   1271: iconst_0
    //   1272: invokevirtual write : (I)V
    //   1275: aload_3
    //   1276: bipush #50
    //   1278: invokevirtual write : (I)V
    //   1281: aload_3
    //   1282: getstatic burp/Zl39.ZA : Ljava/lang/Object;
    //   1285: checkcast java/math/BigInteger
    //   1288: invokevirtual toByteArray : ()[B
    //   1291: invokevirtual write : ([B)V
    //   1294: aload_3
    //   1295: getstatic burp/Zlqq.ZV : Ljava/lang/Object;
    //   1298: checkcast java/math/BigInteger
    //   1301: invokevirtual toByteArray : ()[B
    //   1304: invokevirtual write : ([B)V
    //   1307: aload_3
    //   1308: getstatic burp/Zxtc.ZF : Ljava/lang/Object;
    //   1311: checkcast java/math/BigInteger
    //   1314: invokevirtual toByteArray : ()[B
    //   1317: invokevirtual write : ([B)V
    //   1320: aload_3
    //   1321: invokevirtual toByteArray : ()[B
    //   1324: astore #4
    //   1326: aconst_null
    //   1327: astore #5
    //   1329: invokestatic a : (II)Ljava/lang/String;
    //   1332: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1335: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1338: astore #6
    //   1340: aload #6
    //   1342: arraylength
    //   1343: istore #7
    //   1345: iconst_0
    //   1346: istore #8
    //   1348: iload #8
    //   1350: iload #7
    //   1352: if_icmpge -> 1480
    //   1355: aload #6
    //   1357: iload #8
    //   1359: aaload
    //   1360: astore #9
    //   1362: aload #9
    //   1364: invokevirtual getName : ()Ljava/lang/String;
    //   1367: sipush #6525
    //   1370: sipush #-7075
    //   1373: invokestatic a : (II)Ljava/lang/String;
    //   1376: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1379: ifeq -> 1473
    //   1382: aload #9
    //   1384: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1387: astore #10
    //   1389: aload #10
    //   1391: arraylength
    //   1392: iconst_4
    //   1393: if_icmpeq -> 1403
    //   1396: goto -> 1473
    //   1399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1402: athrow
    //   1403: aload #10
    //   1405: iconst_0
    //   1406: aaload
    //   1407: ldc java/lang/String
    //   1409: if_acmpeq -> 1419
    //   1412: goto -> 1473
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: aload #10
    //   1421: iconst_1
    //   1422: aaload
    //   1423: ldc [B
    //   1425: if_acmpeq -> 1435
    //   1428: goto -> 1473
    //   1431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1434: athrow
    //   1435: aload #10
    //   1437: iconst_2
    //   1438: aaload
    //   1439: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1442: if_acmpeq -> 1452
    //   1445: goto -> 1473
    //   1448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1451: athrow
    //   1452: aload #10
    //   1454: iconst_3
    //   1455: aaload
    //   1456: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1459: if_acmpeq -> 1469
    //   1462: goto -> 1473
    //   1465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1468: athrow
    //   1469: aload #9
    //   1471: astore #5
    //   1473: iinc #8, 1
    //   1476: iload_2
    //   1477: ifne -> 1348
    //   1480: aload #5
    //   1482: iconst_1
    //   1483: invokevirtual setAccessible : (Z)V
    //   1486: ldc burp/Zxjw
    //   1488: iconst_0
    //   1489: anewarray java/lang/Class
    //   1492: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1495: astore #6
    //   1497: aload #6
    //   1499: iconst_1
    //   1500: invokevirtual setAccessible : (Z)V
    //   1503: aload #5
    //   1505: aload #6
    //   1507: iconst_0
    //   1508: anewarray java/lang/Object
    //   1511: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1514: iconst_4
    //   1515: anewarray java/lang/Object
    //   1518: dup
    //   1519: iconst_0
    //   1520: sipush #6520
    //   1523: sipush #6560
    //   1526: invokestatic a : (II)Ljava/lang/String;
    //   1529: aastore
    //   1530: dup
    //   1531: iconst_1
    //   1532: aload #4
    //   1534: aastore
    //   1535: dup
    //   1536: iconst_2
    //   1537: iconst_0
    //   1538: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1541: aastore
    //   1542: dup
    //   1543: iconst_3
    //   1544: aload #4
    //   1546: arraylength
    //   1547: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1550: aastore
    //   1551: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1554: pop
    //   1555: goto -> 1559
    //   1558: astore_3
    //   1559: iconst_0
    //   1560: istore_3
    //   1561: getstatic burp/Zec0.Zk : Ljava/lang/String;
    //   1564: getstatic burp/Zxjm.Zn : Ljava/lang/Object;
    //   1567: checkcast java/math/BigInteger
    //   1570: invokevirtual intValue : ()I
    //   1573: bipush #32
    //   1575: irem
    //   1576: invokestatic abs : (I)I
    //   1579: invokevirtual charAt : (I)C
    //   1582: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   1585: getstatic burp/Zsmn.Zq : Ljava/lang/Object;
    //   1588: checkcast java/math/BigInteger
    //   1591: invokevirtual intValue : ()I
    //   1594: bipush #32
    //   1596: irem
    //   1597: invokestatic abs : (I)I
    //   1600: invokevirtual charAt : (I)C
    //   1603: if_icmple -> 1947
    //   1606: sipush #6517
    //   1609: sipush #12101
    //   1612: invokestatic a : (II)Ljava/lang/String;
    //   1615: iconst_1
    //   1616: ldc burp/Zm8i
    //   1618: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1621: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1624: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1627: astore #4
    //   1629: aload #4
    //   1631: arraylength
    //   1632: istore #5
    //   1634: iconst_0
    //   1635: istore #6
    //   1637: iload #6
    //   1639: iload #5
    //   1641: if_icmpge -> 1779
    //   1644: aload #4
    //   1646: iload #6
    //   1648: aaload
    //   1649: astore #7
    //   1651: aload #7
    //   1653: invokevirtual getModifiers : ()I
    //   1656: invokestatic isStatic : (I)Z
    //   1659: ifne -> 1669
    //   1662: goto -> 1772
    //   1665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1668: athrow
    //   1669: aload #7
    //   1671: invokevirtual getType : ()Ljava/lang/Class;
    //   1674: astore #8
    //   1676: aload #8
    //   1678: ifnull -> 1759
    //   1681: aload #8
    //   1683: invokevirtual isPrimitive : ()Z
    //   1686: ifne -> 1759
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1695: athrow
    //   1696: aload #8
    //   1698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1701: ifnull -> 1759
    //   1704: goto -> 1711
    //   1707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1710: athrow
    //   1711: aload #8
    //   1713: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1716: invokevirtual getName : ()Ljava/lang/String;
    //   1719: ifnull -> 1759
    //   1722: goto -> 1729
    //   1725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1728: athrow
    //   1729: aload #8
    //   1731: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1734: invokevirtual getName : ()Ljava/lang/String;
    //   1737: sipush #6527
    //   1740: sipush #11115
    //   1743: invokestatic a : (II)Ljava/lang/String;
    //   1746: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1749: ifne -> 1759
    //   1752: goto -> 1759
    //   1755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1758: athrow
    //   1759: aload #7
    //   1761: iconst_1
    //   1762: invokevirtual setAccessible : (Z)V
    //   1765: aload #7
    //   1767: aconst_null
    //   1768: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1771: pop
    //   1772: iinc #6, 1
    //   1775: iload_2
    //   1776: ifne -> 1637
    //   1779: sipush #6506
    //   1782: sipush #31214
    //   1785: invokestatic a : (II)Ljava/lang/String;
    //   1788: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1791: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1794: astore #4
    //   1796: aload #4
    //   1798: arraylength
    //   1799: istore #5
    //   1801: iconst_0
    //   1802: istore #6
    //   1804: iload #6
    //   1806: iload #5
    //   1808: if_icmpge -> 1944
    //   1811: aload #4
    //   1813: iload #6
    //   1815: aaload
    //   1816: astore #7
    //   1818: aload #7
    //   1820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1823: pop
    //   1824: aload #7
    //   1826: invokevirtual getModifiers : ()I
    //   1829: invokestatic isStatic : (I)Z
    //   1832: ifeq -> 1930
    //   1835: aload #7
    //   1837: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1840: arraylength
    //   1841: iconst_2
    //   1842: if_icmpne -> 1930
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #7
    //   1854: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1857: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1860: if_acmpne -> 1930
    //   1863: goto -> 1870
    //   1866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1869: athrow
    //   1870: aload #7
    //   1872: iconst_1
    //   1873: invokevirtual setAccessible : (Z)V
    //   1876: aload #7
    //   1878: aconst_null
    //   1879: iconst_2
    //   1880: anewarray java/lang/Object
    //   1883: dup
    //   1884: iconst_0
    //   1885: aload_0
    //   1886: aastore
    //   1887: dup
    //   1888: iconst_1
    //   1889: aload_1
    //   1890: ifnonnull -> 1908
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: aload_1
    //   1901: goto -> 1915
    //   1904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1907: athrow
    //   1908: aload_1
    //   1909: checkcast [B
    //   1912: invokevirtual clone : ()Ljava/lang/Object;
    //   1915: aastore
    //   1916: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1919: checkcast java/lang/Boolean
    //   1922: invokevirtual booleanValue : ()Z
    //   1925: istore_3
    //   1926: iload_2
    //   1927: ifne -> 1944
    //   1930: iinc #6, 1
    //   1933: iload_2
    //   1934: ifne -> 1804
    //   1937: goto -> 1944
    //   1940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1943: athrow
    //   1944: goto -> 2285
    //   1947: sipush #6526
    //   1950: sipush #9082
    //   1953: invokestatic a : (II)Ljava/lang/String;
    //   1956: iconst_1
    //   1957: ldc burp/Zk52
    //   1959: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1962: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1965: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1968: astore #4
    //   1970: aload #4
    //   1972: arraylength
    //   1973: istore #5
    //   1975: iconst_0
    //   1976: istore #6
    //   1978: iload #6
    //   1980: iload #5
    //   1982: if_icmpge -> 2120
    //   1985: aload #4
    //   1987: iload #6
    //   1989: aaload
    //   1990: astore #7
    //   1992: aload #7
    //   1994: invokevirtual getModifiers : ()I
    //   1997: invokestatic isStatic : (I)Z
    //   2000: ifne -> 2010
    //   2003: goto -> 2113
    //   2006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2009: athrow
    //   2010: aload #7
    //   2012: invokevirtual getType : ()Ljava/lang/Class;
    //   2015: astore #8
    //   2017: aload #8
    //   2019: ifnull -> 2100
    //   2022: aload #8
    //   2024: invokevirtual isPrimitive : ()Z
    //   2027: ifne -> 2100
    //   2030: goto -> 2037
    //   2033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2036: athrow
    //   2037: aload #8
    //   2039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2042: ifnull -> 2100
    //   2045: goto -> 2052
    //   2048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2051: athrow
    //   2052: aload #8
    //   2054: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2057: invokevirtual getName : ()Ljava/lang/String;
    //   2060: ifnull -> 2100
    //   2063: goto -> 2070
    //   2066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2069: athrow
    //   2070: aload #8
    //   2072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2075: invokevirtual getName : ()Ljava/lang/String;
    //   2078: sipush #6527
    //   2081: sipush #11115
    //   2084: invokestatic a : (II)Ljava/lang/String;
    //   2087: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2090: ifne -> 2100
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2099: athrow
    //   2100: aload #7
    //   2102: iconst_1
    //   2103: invokevirtual setAccessible : (Z)V
    //   2106: aload #7
    //   2108: aconst_null
    //   2109: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2112: pop
    //   2113: iinc #6, 1
    //   2116: iload_2
    //   2117: ifne -> 1978
    //   2120: sipush #6516
    //   2123: sipush #-32551
    //   2126: invokestatic a : (II)Ljava/lang/String;
    //   2129: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2132: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2135: astore #4
    //   2137: aload #4
    //   2139: arraylength
    //   2140: istore #5
    //   2142: iconst_0
    //   2143: istore #6
    //   2145: iload #6
    //   2147: iload #5
    //   2149: if_icmpge -> 2285
    //   2152: aload #4
    //   2154: iload #6
    //   2156: aaload
    //   2157: astore #7
    //   2159: aload #7
    //   2161: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2164: pop
    //   2165: aload #7
    //   2167: invokevirtual getModifiers : ()I
    //   2170: invokestatic isStatic : (I)Z
    //   2173: ifeq -> 2271
    //   2176: aload #7
    //   2178: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2181: arraylength
    //   2182: iconst_2
    //   2183: if_icmpne -> 2271
    //   2186: goto -> 2193
    //   2189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2192: athrow
    //   2193: aload #7
    //   2195: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2198: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2201: if_acmpne -> 2271
    //   2204: goto -> 2211
    //   2207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2210: athrow
    //   2211: aload #7
    //   2213: iconst_1
    //   2214: invokevirtual setAccessible : (Z)V
    //   2217: aload #7
    //   2219: aconst_null
    //   2220: iconst_2
    //   2221: anewarray java/lang/Object
    //   2224: dup
    //   2225: iconst_0
    //   2226: aload_0
    //   2227: aastore
    //   2228: dup
    //   2229: iconst_1
    //   2230: aload_1
    //   2231: ifnonnull -> 2249
    //   2234: goto -> 2241
    //   2237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2240: athrow
    //   2241: aload_1
    //   2242: goto -> 2256
    //   2245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2248: athrow
    //   2249: aload_1
    //   2250: checkcast [B
    //   2253: invokevirtual clone : ()Ljava/lang/Object;
    //   2256: aastore
    //   2257: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2260: checkcast java/lang/Boolean
    //   2263: invokevirtual booleanValue : ()Z
    //   2266: istore_3
    //   2267: iload_2
    //   2268: ifne -> 2285
    //   2271: iinc #6, 1
    //   2274: iload_2
    //   2275: ifne -> 2145
    //   2278: goto -> 2285
    //   2281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2284: athrow
    //   2285: iload_3
    //   2286: ifeq -> 2291
    //   2289: iload_3
    //   2290: ireturn
    //   2291: getstatic burp/Zsdn.Zf : Ljava/lang/String;
    //   2294: getstatic burp/Zgde.ZG : Ljava/lang/Object;
    //   2297: checkcast java/math/BigInteger
    //   2300: invokevirtual intValue : ()I
    //   2303: bipush #32
    //   2305: irem
    //   2306: invokestatic abs : (I)I
    //   2309: invokevirtual charAt : (I)C
    //   2312: getstatic burp/Zs9x.ZY : Ljava/lang/String;
    //   2315: getstatic burp/Zx58.ZE : Ljava/lang/Object;
    //   2318: checkcast java/math/BigInteger
    //   2321: invokevirtual intValue : ()I
    //   2324: bipush #32
    //   2326: irem
    //   2327: invokestatic abs : (I)I
    //   2330: invokevirtual charAt : (I)C
    //   2333: if_icmple -> 2678
    //   2336: sipush #6524
    //   2339: sipush #25663
    //   2342: invokestatic a : (II)Ljava/lang/String;
    //   2345: iconst_1
    //   2346: ldc burp/Zz9v
    //   2348: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2351: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2354: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2357: astore #4
    //   2359: aload #4
    //   2361: arraylength
    //   2362: istore #5
    //   2364: iconst_0
    //   2365: istore #6
    //   2367: iload #6
    //   2369: iload #5
    //   2371: if_icmpge -> 2509
    //   2374: aload #4
    //   2376: iload #6
    //   2378: aaload
    //   2379: astore #7
    //   2381: aload #7
    //   2383: invokevirtual getModifiers : ()I
    //   2386: invokestatic isStatic : (I)Z
    //   2389: ifne -> 2399
    //   2392: goto -> 2502
    //   2395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2398: athrow
    //   2399: aload #7
    //   2401: invokevirtual getType : ()Ljava/lang/Class;
    //   2404: astore #8
    //   2406: aload #8
    //   2408: ifnull -> 2489
    //   2411: aload #8
    //   2413: invokevirtual isPrimitive : ()Z
    //   2416: ifne -> 2489
    //   2419: goto -> 2426
    //   2422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2425: athrow
    //   2426: aload #8
    //   2428: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2431: ifnull -> 2489
    //   2434: goto -> 2441
    //   2437: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2440: athrow
    //   2441: aload #8
    //   2443: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2446: invokevirtual getName : ()Ljava/lang/String;
    //   2449: ifnull -> 2489
    //   2452: goto -> 2459
    //   2455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2458: athrow
    //   2459: aload #8
    //   2461: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2464: invokevirtual getName : ()Ljava/lang/String;
    //   2467: sipush #6527
    //   2470: sipush #11115
    //   2473: invokestatic a : (II)Ljava/lang/String;
    //   2476: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2479: ifne -> 2489
    //   2482: goto -> 2489
    //   2485: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2488: athrow
    //   2489: aload #7
    //   2491: iconst_1
    //   2492: invokevirtual setAccessible : (Z)V
    //   2495: aload #7
    //   2497: aconst_null
    //   2498: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2501: pop
    //   2502: iinc #6, 1
    //   2505: iload_2
    //   2506: ifne -> 2367
    //   2509: sipush #6510
    //   2512: sipush #19228
    //   2515: invokestatic a : (II)Ljava/lang/String;
    //   2518: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2521: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2524: astore #4
    //   2526: aload #4
    //   2528: arraylength
    //   2529: istore #5
    //   2531: iconst_0
    //   2532: istore #6
    //   2534: iload #6
    //   2536: iload #5
    //   2538: if_icmpge -> 2674
    //   2541: aload #4
    //   2543: iload #6
    //   2545: aaload
    //   2546: astore #7
    //   2548: aload #7
    //   2550: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2553: pop
    //   2554: aload #7
    //   2556: invokevirtual getModifiers : ()I
    //   2559: invokestatic isStatic : (I)Z
    //   2562: ifeq -> 2660
    //   2565: aload #7
    //   2567: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2570: arraylength
    //   2571: iconst_2
    //   2572: if_icmpne -> 2660
    //   2575: goto -> 2582
    //   2578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2581: athrow
    //   2582: aload #7
    //   2584: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2587: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2590: if_acmpne -> 2660
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #7
    //   2602: iconst_1
    //   2603: invokevirtual setAccessible : (Z)V
    //   2606: aload #7
    //   2608: aconst_null
    //   2609: iconst_2
    //   2610: anewarray java/lang/Object
    //   2613: dup
    //   2614: iconst_0
    //   2615: aload_0
    //   2616: aastore
    //   2617: dup
    //   2618: iconst_1
    //   2619: aload_1
    //   2620: ifnonnull -> 2638
    //   2623: goto -> 2630
    //   2626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2629: athrow
    //   2630: aload_1
    //   2631: goto -> 2645
    //   2634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2637: athrow
    //   2638: aload_1
    //   2639: checkcast [B
    //   2642: invokevirtual clone : ()Ljava/lang/Object;
    //   2645: aastore
    //   2646: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2649: checkcast java/lang/Boolean
    //   2652: invokevirtual booleanValue : ()Z
    //   2655: istore_3
    //   2656: iload_2
    //   2657: ifne -> 2674
    //   2660: iinc #6, 1
    //   2663: iload_2
    //   2664: ifne -> 2534
    //   2667: goto -> 2674
    //   2670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2673: athrow
    //   2674: iload_2
    //   2675: ifne -> 3016
    //   2678: sipush #6505
    //   2681: sipush #13787
    //   2684: invokestatic a : (II)Ljava/lang/String;
    //   2687: iconst_1
    //   2688: ldc burp/Zxjw
    //   2690: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2693: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2696: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2699: astore #4
    //   2701: aload #4
    //   2703: arraylength
    //   2704: istore #5
    //   2706: iconst_0
    //   2707: istore #6
    //   2709: iload #6
    //   2711: iload #5
    //   2713: if_icmpge -> 2851
    //   2716: aload #4
    //   2718: iload #6
    //   2720: aaload
    //   2721: astore #7
    //   2723: aload #7
    //   2725: invokevirtual getModifiers : ()I
    //   2728: invokestatic isStatic : (I)Z
    //   2731: ifne -> 2741
    //   2734: goto -> 2844
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload #7
    //   2743: invokevirtual getType : ()Ljava/lang/Class;
    //   2746: astore #8
    //   2748: aload #8
    //   2750: ifnull -> 2831
    //   2753: aload #8
    //   2755: invokevirtual isPrimitive : ()Z
    //   2758: ifne -> 2831
    //   2761: goto -> 2768
    //   2764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2767: athrow
    //   2768: aload #8
    //   2770: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2773: ifnull -> 2831
    //   2776: goto -> 2783
    //   2779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2782: athrow
    //   2783: aload #8
    //   2785: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2788: invokevirtual getName : ()Ljava/lang/String;
    //   2791: ifnull -> 2831
    //   2794: goto -> 2801
    //   2797: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2800: athrow
    //   2801: aload #8
    //   2803: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2806: invokevirtual getName : ()Ljava/lang/String;
    //   2809: sipush #6527
    //   2812: sipush #11115
    //   2815: invokestatic a : (II)Ljava/lang/String;
    //   2818: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2821: ifne -> 2831
    //   2824: goto -> 2831
    //   2827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2830: athrow
    //   2831: aload #7
    //   2833: iconst_1
    //   2834: invokevirtual setAccessible : (Z)V
    //   2837: aload #7
    //   2839: aconst_null
    //   2840: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2843: pop
    //   2844: iinc #6, 1
    //   2847: iload_2
    //   2848: ifne -> 2709
    //   2851: sipush #6502
    //   2854: sipush #20324
    //   2857: invokestatic a : (II)Ljava/lang/String;
    //   2860: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2863: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2866: astore #4
    //   2868: aload #4
    //   2870: arraylength
    //   2871: istore #5
    //   2873: iconst_0
    //   2874: istore #6
    //   2876: iload #6
    //   2878: iload #5
    //   2880: if_icmpge -> 3016
    //   2883: aload #4
    //   2885: iload #6
    //   2887: aaload
    //   2888: astore #7
    //   2890: aload #7
    //   2892: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2895: pop
    //   2896: aload #7
    //   2898: invokevirtual getModifiers : ()I
    //   2901: invokestatic isStatic : (I)Z
    //   2904: ifeq -> 3002
    //   2907: aload #7
    //   2909: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2912: arraylength
    //   2913: iconst_2
    //   2914: if_icmpne -> 3002
    //   2917: goto -> 2924
    //   2920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2923: athrow
    //   2924: aload #7
    //   2926: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2929: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2932: if_acmpne -> 3002
    //   2935: goto -> 2942
    //   2938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2941: athrow
    //   2942: aload #7
    //   2944: iconst_1
    //   2945: invokevirtual setAccessible : (Z)V
    //   2948: aload #7
    //   2950: aconst_null
    //   2951: iconst_2
    //   2952: anewarray java/lang/Object
    //   2955: dup
    //   2956: iconst_0
    //   2957: aload_0
    //   2958: aastore
    //   2959: dup
    //   2960: iconst_1
    //   2961: aload_1
    //   2962: ifnonnull -> 2980
    //   2965: goto -> 2972
    //   2968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2971: athrow
    //   2972: aload_1
    //   2973: goto -> 2987
    //   2976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2979: athrow
    //   2980: aload_1
    //   2981: checkcast [B
    //   2984: invokevirtual clone : ()Ljava/lang/Object;
    //   2987: aastore
    //   2988: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2991: checkcast java/lang/Boolean
    //   2994: invokevirtual booleanValue : ()Z
    //   2997: istore_3
    //   2998: iload_2
    //   2999: ifne -> 3016
    //   3002: iinc #6, 1
    //   3005: iload_2
    //   3006: ifne -> 2876
    //   3009: goto -> 3016
    //   3012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3015: athrow
    //   3016: iload_3
    //   3017: ifeq -> 3022
    //   3020: iload_3
    //   3021: ireturn
    //   3022: getstatic burp/Zry9.ZW : Ljava/lang/String;
    //   3025: getstatic burp/Zmir.ZF : Ljava/lang/Object;
    //   3028: checkcast java/math/BigInteger
    //   3031: invokevirtual intValue : ()I
    //   3034: bipush #32
    //   3036: irem
    //   3037: invokestatic abs : (I)I
    //   3040: invokevirtual charAt : (I)C
    //   3043: getstatic burp/Zl4v.ZD : Ljava/lang/String;
    //   3046: getstatic burp/Zsk4.Ze : Ljava/lang/Object;
    //   3049: checkcast java/math/BigInteger
    //   3052: invokevirtual intValue : ()I
    //   3055: bipush #32
    //   3057: irem
    //   3058: invokestatic abs : (I)I
    //   3061: invokevirtual charAt : (I)C
    //   3064: if_icmple -> 3409
    //   3067: sipush #6500
    //   3070: sipush #-26151
    //   3073: invokestatic a : (II)Ljava/lang/String;
    //   3076: iconst_1
    //   3077: ldc burp/Zgqp
    //   3079: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3082: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3085: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3088: astore #4
    //   3090: aload #4
    //   3092: arraylength
    //   3093: istore #5
    //   3095: iconst_0
    //   3096: istore #6
    //   3098: iload #6
    //   3100: iload #5
    //   3102: if_icmpge -> 3240
    //   3105: aload #4
    //   3107: iload #6
    //   3109: aaload
    //   3110: astore #7
    //   3112: aload #7
    //   3114: invokevirtual getModifiers : ()I
    //   3117: invokestatic isStatic : (I)Z
    //   3120: ifne -> 3130
    //   3123: goto -> 3233
    //   3126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3129: athrow
    //   3130: aload #7
    //   3132: invokevirtual getType : ()Ljava/lang/Class;
    //   3135: astore #8
    //   3137: aload #8
    //   3139: ifnull -> 3220
    //   3142: aload #8
    //   3144: invokevirtual isPrimitive : ()Z
    //   3147: ifne -> 3220
    //   3150: goto -> 3157
    //   3153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3156: athrow
    //   3157: aload #8
    //   3159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3162: ifnull -> 3220
    //   3165: goto -> 3172
    //   3168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3171: athrow
    //   3172: aload #8
    //   3174: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3177: invokevirtual getName : ()Ljava/lang/String;
    //   3180: ifnull -> 3220
    //   3183: goto -> 3190
    //   3186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3189: athrow
    //   3190: aload #8
    //   3192: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3195: invokevirtual getName : ()Ljava/lang/String;
    //   3198: sipush #6527
    //   3201: sipush #11115
    //   3204: invokestatic a : (II)Ljava/lang/String;
    //   3207: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3210: ifne -> 3220
    //   3213: goto -> 3220
    //   3216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3219: athrow
    //   3220: aload #7
    //   3222: iconst_1
    //   3223: invokevirtual setAccessible : (Z)V
    //   3226: aload #7
    //   3228: aconst_null
    //   3229: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3232: pop
    //   3233: iinc #6, 1
    //   3236: iload_2
    //   3237: ifne -> 3098
    //   3240: sipush #6511
    //   3243: sipush #2130
    //   3246: invokestatic a : (II)Ljava/lang/String;
    //   3249: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3252: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3255: astore #4
    //   3257: aload #4
    //   3259: arraylength
    //   3260: istore #5
    //   3262: iconst_0
    //   3263: istore #6
    //   3265: iload #6
    //   3267: iload #5
    //   3269: if_icmpge -> 3405
    //   3272: aload #4
    //   3274: iload #6
    //   3276: aaload
    //   3277: astore #7
    //   3279: aload #7
    //   3281: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3284: pop
    //   3285: aload #7
    //   3287: invokevirtual getModifiers : ()I
    //   3290: invokestatic isStatic : (I)Z
    //   3293: ifeq -> 3391
    //   3296: aload #7
    //   3298: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3301: arraylength
    //   3302: iconst_2
    //   3303: if_icmpne -> 3391
    //   3306: goto -> 3313
    //   3309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3312: athrow
    //   3313: aload #7
    //   3315: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3318: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3321: if_acmpne -> 3391
    //   3324: goto -> 3331
    //   3327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3330: athrow
    //   3331: aload #7
    //   3333: iconst_1
    //   3334: invokevirtual setAccessible : (Z)V
    //   3337: aload #7
    //   3339: aconst_null
    //   3340: iconst_2
    //   3341: anewarray java/lang/Object
    //   3344: dup
    //   3345: iconst_0
    //   3346: aload_0
    //   3347: aastore
    //   3348: dup
    //   3349: iconst_1
    //   3350: aload_1
    //   3351: ifnonnull -> 3369
    //   3354: goto -> 3361
    //   3357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3360: athrow
    //   3361: aload_1
    //   3362: goto -> 3376
    //   3365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3368: athrow
    //   3369: aload_1
    //   3370: checkcast [B
    //   3373: invokevirtual clone : ()Ljava/lang/Object;
    //   3376: aastore
    //   3377: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3380: checkcast java/lang/Boolean
    //   3383: invokevirtual booleanValue : ()Z
    //   3386: istore_3
    //   3387: iload_2
    //   3388: ifne -> 3405
    //   3391: iinc #6, 1
    //   3394: iload_2
    //   3395: ifne -> 3265
    //   3398: goto -> 3405
    //   3401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3404: athrow
    //   3405: iload_2
    //   3406: ifne -> 3747
    //   3409: sipush #6513
    //   3412: sipush #-9034
    //   3415: invokestatic a : (II)Ljava/lang/String;
    //   3418: iconst_1
    //   3419: ldc burp/Zgly
    //   3421: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3424: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3427: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3430: astore #4
    //   3432: aload #4
    //   3434: arraylength
    //   3435: istore #5
    //   3437: iconst_0
    //   3438: istore #6
    //   3440: iload #6
    //   3442: iload #5
    //   3444: if_icmpge -> 3582
    //   3447: aload #4
    //   3449: iload #6
    //   3451: aaload
    //   3452: astore #7
    //   3454: aload #7
    //   3456: invokevirtual getModifiers : ()I
    //   3459: invokestatic isStatic : (I)Z
    //   3462: ifne -> 3472
    //   3465: goto -> 3575
    //   3468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3471: athrow
    //   3472: aload #7
    //   3474: invokevirtual getType : ()Ljava/lang/Class;
    //   3477: astore #8
    //   3479: aload #8
    //   3481: ifnull -> 3562
    //   3484: aload #8
    //   3486: invokevirtual isPrimitive : ()Z
    //   3489: ifne -> 3562
    //   3492: goto -> 3499
    //   3495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3498: athrow
    //   3499: aload #8
    //   3501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3504: ifnull -> 3562
    //   3507: goto -> 3514
    //   3510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3513: athrow
    //   3514: aload #8
    //   3516: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3519: invokevirtual getName : ()Ljava/lang/String;
    //   3522: ifnull -> 3562
    //   3525: goto -> 3532
    //   3528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3531: athrow
    //   3532: aload #8
    //   3534: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3537: invokevirtual getName : ()Ljava/lang/String;
    //   3540: sipush #6527
    //   3543: sipush #11115
    //   3546: invokestatic a : (II)Ljava/lang/String;
    //   3549: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3552: ifne -> 3562
    //   3555: goto -> 3562
    //   3558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3561: athrow
    //   3562: aload #7
    //   3564: iconst_1
    //   3565: invokevirtual setAccessible : (Z)V
    //   3568: aload #7
    //   3570: aconst_null
    //   3571: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3574: pop
    //   3575: iinc #6, 1
    //   3578: iload_2
    //   3579: ifne -> 3440
    //   3582: sipush #6521
    //   3585: sipush #1354
    //   3588: invokestatic a : (II)Ljava/lang/String;
    //   3591: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3594: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3597: astore #4
    //   3599: aload #4
    //   3601: arraylength
    //   3602: istore #5
    //   3604: iconst_0
    //   3605: istore #6
    //   3607: iload #6
    //   3609: iload #5
    //   3611: if_icmpge -> 3747
    //   3614: aload #4
    //   3616: iload #6
    //   3618: aaload
    //   3619: astore #7
    //   3621: aload #7
    //   3623: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3626: pop
    //   3627: aload #7
    //   3629: invokevirtual getModifiers : ()I
    //   3632: invokestatic isStatic : (I)Z
    //   3635: ifeq -> 3733
    //   3638: aload #7
    //   3640: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3643: arraylength
    //   3644: iconst_2
    //   3645: if_icmpne -> 3733
    //   3648: goto -> 3655
    //   3651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3654: athrow
    //   3655: aload #7
    //   3657: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3660: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3663: if_acmpne -> 3733
    //   3666: goto -> 3673
    //   3669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3672: athrow
    //   3673: aload #7
    //   3675: iconst_1
    //   3676: invokevirtual setAccessible : (Z)V
    //   3679: aload #7
    //   3681: aconst_null
    //   3682: iconst_2
    //   3683: anewarray java/lang/Object
    //   3686: dup
    //   3687: iconst_0
    //   3688: aload_0
    //   3689: aastore
    //   3690: dup
    //   3691: iconst_1
    //   3692: aload_1
    //   3693: ifnonnull -> 3711
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3702: athrow
    //   3703: aload_1
    //   3704: goto -> 3718
    //   3707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3710: athrow
    //   3711: aload_1
    //   3712: checkcast [B
    //   3715: invokevirtual clone : ()Ljava/lang/Object;
    //   3718: aastore
    //   3719: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3722: checkcast java/lang/Boolean
    //   3725: invokevirtual booleanValue : ()Z
    //   3728: istore_3
    //   3729: iload_2
    //   3730: ifne -> 3747
    //   3733: iinc #6, 1
    //   3736: iload_2
    //   3737: ifne -> 3607
    //   3740: goto -> 3747
    //   3743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3746: athrow
    //   3747: iload_3
    //   3748: ifeq -> 3753
    //   3751: iload_3
    //   3752: ireturn
    //   3753: getstatic burp/Zly7.ZC : Ljava/lang/String;
    //   3756: getstatic burp/Zbu.ZW : Ljava/lang/Object;
    //   3759: checkcast java/math/BigInteger
    //   3762: invokevirtual intValue : ()I
    //   3765: bipush #32
    //   3767: irem
    //   3768: invokestatic abs : (I)I
    //   3771: invokevirtual charAt : (I)C
    //   3774: getstatic burp/Zec_.Zv : Ljava/lang/String;
    //   3777: getstatic burp/Zl5d.Za : Ljava/lang/Object;
    //   3780: checkcast java/math/BigInteger
    //   3783: invokevirtual intValue : ()I
    //   3786: bipush #32
    //   3788: irem
    //   3789: invokestatic abs : (I)I
    //   3792: invokevirtual charAt : (I)C
    //   3795: if_icmple -> 4140
    //   3798: sipush #6512
    //   3801: sipush #-25203
    //   3804: invokestatic a : (II)Ljava/lang/String;
    //   3807: iconst_1
    //   3808: ldc burp/Zeud
    //   3810: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3813: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3816: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3819: astore #4
    //   3821: aload #4
    //   3823: arraylength
    //   3824: istore #5
    //   3826: iconst_0
    //   3827: istore #6
    //   3829: iload #6
    //   3831: iload #5
    //   3833: if_icmpge -> 3971
    //   3836: aload #4
    //   3838: iload #6
    //   3840: aaload
    //   3841: astore #7
    //   3843: aload #7
    //   3845: invokevirtual getModifiers : ()I
    //   3848: invokestatic isStatic : (I)Z
    //   3851: ifne -> 3861
    //   3854: goto -> 3964
    //   3857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3860: athrow
    //   3861: aload #7
    //   3863: invokevirtual getType : ()Ljava/lang/Class;
    //   3866: astore #8
    //   3868: aload #8
    //   3870: ifnull -> 3951
    //   3873: aload #8
    //   3875: invokevirtual isPrimitive : ()Z
    //   3878: ifne -> 3951
    //   3881: goto -> 3888
    //   3884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3887: athrow
    //   3888: aload #8
    //   3890: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3893: ifnull -> 3951
    //   3896: goto -> 3903
    //   3899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3902: athrow
    //   3903: aload #8
    //   3905: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3908: invokevirtual getName : ()Ljava/lang/String;
    //   3911: ifnull -> 3951
    //   3914: goto -> 3921
    //   3917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3920: athrow
    //   3921: aload #8
    //   3923: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3926: invokevirtual getName : ()Ljava/lang/String;
    //   3929: sipush #6527
    //   3932: sipush #11115
    //   3935: invokestatic a : (II)Ljava/lang/String;
    //   3938: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3941: ifne -> 3951
    //   3944: goto -> 3951
    //   3947: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3950: athrow
    //   3951: aload #7
    //   3953: iconst_1
    //   3954: invokevirtual setAccessible : (Z)V
    //   3957: aload #7
    //   3959: aconst_null
    //   3960: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3963: pop
    //   3964: iinc #6, 1
    //   3967: iload_2
    //   3968: ifne -> 3829
    //   3971: sipush #6514
    //   3974: sipush #-28854
    //   3977: invokestatic a : (II)Ljava/lang/String;
    //   3980: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3983: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3986: astore #4
    //   3988: aload #4
    //   3990: arraylength
    //   3991: istore #5
    //   3993: iconst_0
    //   3994: istore #6
    //   3996: iload #6
    //   3998: iload #5
    //   4000: if_icmpge -> 4136
    //   4003: aload #4
    //   4005: iload #6
    //   4007: aaload
    //   4008: astore #7
    //   4010: aload #7
    //   4012: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4015: pop
    //   4016: aload #7
    //   4018: invokevirtual getModifiers : ()I
    //   4021: invokestatic isStatic : (I)Z
    //   4024: ifeq -> 4122
    //   4027: aload #7
    //   4029: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4032: arraylength
    //   4033: iconst_2
    //   4034: if_icmpne -> 4122
    //   4037: goto -> 4044
    //   4040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4043: athrow
    //   4044: aload #7
    //   4046: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4049: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4052: if_acmpne -> 4122
    //   4055: goto -> 4062
    //   4058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4061: athrow
    //   4062: aload #7
    //   4064: iconst_1
    //   4065: invokevirtual setAccessible : (Z)V
    //   4068: aload #7
    //   4070: aconst_null
    //   4071: iconst_2
    //   4072: anewarray java/lang/Object
    //   4075: dup
    //   4076: iconst_0
    //   4077: aload_0
    //   4078: aastore
    //   4079: dup
    //   4080: iconst_1
    //   4081: aload_1
    //   4082: ifnonnull -> 4100
    //   4085: goto -> 4092
    //   4088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4091: athrow
    //   4092: aload_1
    //   4093: goto -> 4107
    //   4096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4099: athrow
    //   4100: aload_1
    //   4101: checkcast [B
    //   4104: invokevirtual clone : ()Ljava/lang/Object;
    //   4107: aastore
    //   4108: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4111: checkcast java/lang/Boolean
    //   4114: invokevirtual booleanValue : ()Z
    //   4117: istore_3
    //   4118: iload_2
    //   4119: ifne -> 4136
    //   4122: iinc #6, 1
    //   4125: iload_2
    //   4126: ifne -> 3996
    //   4129: goto -> 4136
    //   4132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4135: athrow
    //   4136: iload_2
    //   4137: ifne -> 4478
    //   4140: sipush #6519
    //   4143: sipush #20471
    //   4146: invokestatic a : (II)Ljava/lang/String;
    //   4149: iconst_1
    //   4150: ldc burp/Zk88
    //   4152: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4155: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4158: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4161: astore #4
    //   4163: aload #4
    //   4165: arraylength
    //   4166: istore #5
    //   4168: iconst_0
    //   4169: istore #6
    //   4171: iload #6
    //   4173: iload #5
    //   4175: if_icmpge -> 4313
    //   4178: aload #4
    //   4180: iload #6
    //   4182: aaload
    //   4183: astore #7
    //   4185: aload #7
    //   4187: invokevirtual getModifiers : ()I
    //   4190: invokestatic isStatic : (I)Z
    //   4193: ifne -> 4203
    //   4196: goto -> 4306
    //   4199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4202: athrow
    //   4203: aload #7
    //   4205: invokevirtual getType : ()Ljava/lang/Class;
    //   4208: astore #8
    //   4210: aload #8
    //   4212: ifnull -> 4293
    //   4215: aload #8
    //   4217: invokevirtual isPrimitive : ()Z
    //   4220: ifne -> 4293
    //   4223: goto -> 4230
    //   4226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4229: athrow
    //   4230: aload #8
    //   4232: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4235: ifnull -> 4293
    //   4238: goto -> 4245
    //   4241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4244: athrow
    //   4245: aload #8
    //   4247: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4250: invokevirtual getName : ()Ljava/lang/String;
    //   4253: ifnull -> 4293
    //   4256: goto -> 4263
    //   4259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4262: athrow
    //   4263: aload #8
    //   4265: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4268: invokevirtual getName : ()Ljava/lang/String;
    //   4271: sipush #6527
    //   4274: sipush #11115
    //   4277: invokestatic a : (II)Ljava/lang/String;
    //   4280: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4283: ifne -> 4293
    //   4286: goto -> 4293
    //   4289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4292: athrow
    //   4293: aload #7
    //   4295: iconst_1
    //   4296: invokevirtual setAccessible : (Z)V
    //   4299: aload #7
    //   4301: aconst_null
    //   4302: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4305: pop
    //   4306: iinc #6, 1
    //   4309: iload_2
    //   4310: ifne -> 4171
    //   4313: sipush #6503
    //   4316: sipush #-3587
    //   4319: invokestatic a : (II)Ljava/lang/String;
    //   4322: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4325: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4328: astore #4
    //   4330: aload #4
    //   4332: arraylength
    //   4333: istore #5
    //   4335: iconst_0
    //   4336: istore #6
    //   4338: iload #6
    //   4340: iload #5
    //   4342: if_icmpge -> 4478
    //   4345: aload #4
    //   4347: iload #6
    //   4349: aaload
    //   4350: astore #7
    //   4352: aload #7
    //   4354: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4357: pop
    //   4358: aload #7
    //   4360: invokevirtual getModifiers : ()I
    //   4363: invokestatic isStatic : (I)Z
    //   4366: ifeq -> 4464
    //   4369: aload #7
    //   4371: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4374: arraylength
    //   4375: iconst_2
    //   4376: if_icmpne -> 4464
    //   4379: goto -> 4386
    //   4382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4385: athrow
    //   4386: aload #7
    //   4388: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4391: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4394: if_acmpne -> 4464
    //   4397: goto -> 4404
    //   4400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4403: athrow
    //   4404: aload #7
    //   4406: iconst_1
    //   4407: invokevirtual setAccessible : (Z)V
    //   4410: aload #7
    //   4412: aconst_null
    //   4413: iconst_2
    //   4414: anewarray java/lang/Object
    //   4417: dup
    //   4418: iconst_0
    //   4419: aload_0
    //   4420: aastore
    //   4421: dup
    //   4422: iconst_1
    //   4423: aload_1
    //   4424: ifnonnull -> 4442
    //   4427: goto -> 4434
    //   4430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4433: athrow
    //   4434: aload_1
    //   4435: goto -> 4449
    //   4438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4441: athrow
    //   4442: aload_1
    //   4443: checkcast [B
    //   4446: invokevirtual clone : ()Ljava/lang/Object;
    //   4449: aastore
    //   4450: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4453: checkcast java/lang/Boolean
    //   4456: invokevirtual booleanValue : ()Z
    //   4459: istore_3
    //   4460: iload_2
    //   4461: ifne -> 4478
    //   4464: iinc #6, 1
    //   4467: iload_2
    //   4468: ifne -> 4338
    //   4471: goto -> 4478
    //   4474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4477: athrow
    //   4478: iload_3
    //   4479: ireturn
    //   4480: astore_3
    //   4481: new java/lang/Exception
    //   4484: dup
    //   4485: aload_3
    //   4486: invokevirtual getMessage : ()Ljava/lang/String;
    //   4489: invokespecial <init> : (Ljava/lang/String;)V
    //   4492: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2290	4480	java/lang/Throwable
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
    //   931	945	945	java/lang/Throwable
    //   956	969	972	java/lang/Throwable
    //   961	984	987	java/lang/Throwable
    //   976	1002	1005	java/lang/Throwable
    //   991	1032	1035	java/lang/Throwable
    //   1095	1122	1125	java/lang/Throwable
    //   1112	1143	1146	java/lang/Throwable
    //   1129	1173	1176	java/lang/Throwable
    //   1150	1184	1184	java/lang/Throwable
    //   1195	1211	1214	java/lang/Throwable
    //   1218	1555	1558	java/lang/Throwable
    //   1389	1399	1399	java/lang/Throwable
    //   1403	1415	1415	java/lang/Throwable
    //   1419	1431	1431	java/lang/Throwable
    //   1435	1448	1448	java/lang/Throwable
    //   1452	1465	1465	java/lang/Throwable
    //   1651	1665	1665	java/lang/Throwable
    //   1676	1689	1692	java/lang/Throwable
    //   1681	1704	1707	java/lang/Throwable
    //   1696	1722	1725	java/lang/Throwable
    //   1711	1752	1755	java/lang/Throwable
    //   1818	1845	1848	java/lang/Throwable
    //   1835	1863	1866	java/lang/Throwable
    //   1852	1893	1896	java/lang/Throwable
    //   1870	1904	1904	java/lang/Throwable
    //   1926	1937	1940	java/lang/Throwable
    //   1992	2006	2006	java/lang/Throwable
    //   2017	2030	2033	java/lang/Throwable
    //   2022	2045	2048	java/lang/Throwable
    //   2037	2063	2066	java/lang/Throwable
    //   2052	2093	2096	java/lang/Throwable
    //   2159	2186	2189	java/lang/Throwable
    //   2176	2204	2207	java/lang/Throwable
    //   2193	2234	2237	java/lang/Throwable
    //   2211	2245	2245	java/lang/Throwable
    //   2267	2278	2281	java/lang/Throwable
    //   2291	3021	4480	java/lang/Throwable
    //   2381	2395	2395	java/lang/Throwable
    //   2406	2419	2422	java/lang/Throwable
    //   2411	2434	2437	java/lang/Throwable
    //   2426	2452	2455	java/lang/Throwable
    //   2441	2482	2485	java/lang/Throwable
    //   2548	2575	2578	java/lang/Throwable
    //   2565	2593	2596	java/lang/Throwable
    //   2582	2623	2626	java/lang/Throwable
    //   2600	2634	2634	java/lang/Throwable
    //   2656	2667	2670	java/lang/Throwable
    //   2723	2737	2737	java/lang/Throwable
    //   2748	2761	2764	java/lang/Throwable
    //   2753	2776	2779	java/lang/Throwable
    //   2768	2794	2797	java/lang/Throwable
    //   2783	2824	2827	java/lang/Throwable
    //   2890	2917	2920	java/lang/Throwable
    //   2907	2935	2938	java/lang/Throwable
    //   2924	2965	2968	java/lang/Throwable
    //   2942	2976	2976	java/lang/Throwable
    //   2998	3009	3012	java/lang/Throwable
    //   3022	3752	4480	java/lang/Throwable
    //   3112	3126	3126	java/lang/Throwable
    //   3137	3150	3153	java/lang/Throwable
    //   3142	3165	3168	java/lang/Throwable
    //   3157	3183	3186	java/lang/Throwable
    //   3172	3213	3216	java/lang/Throwable
    //   3279	3306	3309	java/lang/Throwable
    //   3296	3324	3327	java/lang/Throwable
    //   3313	3354	3357	java/lang/Throwable
    //   3331	3365	3365	java/lang/Throwable
    //   3387	3398	3401	java/lang/Throwable
    //   3454	3468	3468	java/lang/Throwable
    //   3479	3492	3495	java/lang/Throwable
    //   3484	3507	3510	java/lang/Throwable
    //   3499	3525	3528	java/lang/Throwable
    //   3514	3555	3558	java/lang/Throwable
    //   3621	3648	3651	java/lang/Throwable
    //   3638	3666	3669	java/lang/Throwable
    //   3655	3696	3699	java/lang/Throwable
    //   3673	3707	3707	java/lang/Throwable
    //   3729	3740	3743	java/lang/Throwable
    //   3753	4479	4480	java/lang/Throwable
    //   3843	3857	3857	java/lang/Throwable
    //   3868	3881	3884	java/lang/Throwable
    //   3873	3896	3899	java/lang/Throwable
    //   3888	3914	3917	java/lang/Throwable
    //   3903	3944	3947	java/lang/Throwable
    //   4010	4037	4040	java/lang/Throwable
    //   4027	4055	4058	java/lang/Throwable
    //   4044	4085	4088	java/lang/Throwable
    //   4062	4096	4096	java/lang/Throwable
    //   4118	4129	4132	java/lang/Throwable
    //   4185	4199	4199	java/lang/Throwable
    //   4210	4223	4226	java/lang/Throwable
    //   4215	4238	4241	java/lang/Throwable
    //   4230	4256	4259	java/lang/Throwable
    //   4245	4286	4289	java/lang/Throwable
    //   4352	4379	4382	java/lang/Throwable
    //   4369	4397	4400	java/lang/Throwable
    //   4386	4427	4430	java/lang/Throwable
    //   4404	4438	4438	java/lang/Throwable
    //   4460	4471	4474	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿ \\nZlh¸ì×\\t<¨÷,D³Í¦\\tù¬jSÅÛ\\tl;¢2^zíÁ\\b\\néf @I©[¦Xß²Ú¹9Ù©nA±;ÃÛrÂ3Õ¾\\b\\tÅ.øÀ¦f\\tÙõë¯©Ý\\t«ZA 6 \\tÂhwXäÙ-L!\\t$«Æ\\nOw^\\tÈ 6UÌx(p\\t-´[DÔ¡ ã4©BOîüCA¾éstb9AïÎÓç$¤¾¼ÊG\\t?pÈ[¹Ý¤òðÐÉ¯è ã"ãøÑîØ#ÅÁMRS]SKÿ1^'¿°âÇ"fè^¦ò¡å×Ng1ÿzG³(É2-úÁÅLurød6ñ3Bþ¹£Oí¹¡¬¤\\tä¬³À|Ê!]\\t´¹§=& ò\\t~àbq4 \\t8Ý(îO\\t¾wø»¥÷\\tPÏ%¬®Gy×EDÞÝ\\tÍÌìOÞÉå'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #63
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
    //   68: ldc 'Õó¬ÏÀÇà¶\\tãæÔÃ>Ó'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #113
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
    //   129: putstatic burp/Zxjm.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxjm.b : [Ljava/lang/String;
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
    //   212: bipush #110
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #102
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #71
    //   239: goto -> 244
    //   242: bipush #102
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
    //   310: bipush #97
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-97
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-28
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-94
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #71
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-122
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-58
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-43
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #21
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #51
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #28
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-57
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-74
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #124
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-53
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-86
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #66
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-70
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-73
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #117
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: iconst_5
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #-127
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-100
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-94
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-20
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #83
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #19
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #28
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #67
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #15
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #106
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #59
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zxjm.Zn : Ljava/lang/Object;
    //   499: sipush #6515
    //   502: sipush #-1410
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zxjm.ZG : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x197D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */