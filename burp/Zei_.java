package burp;

import java.math.BigInteger;

class Zei_ extends ClassLoader {
  static Object Za;
  
  static String ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZH(Object paramObject) {
    Zl1u.ZO = a(-32715, 14036);
    Zl1u.Zq = new BigInteger(a(-32709, -218));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgdj.Zt.charAt(Math.abs(((BigInteger)Zs36.Zs).intValue() % 32)) <= Zgdt.Zd.charAt(Math.abs(((BigInteger)Zs6g.Zq).intValue() % 32))) {
          try {
            Zr14.ZL(Class.forName(a(-32711, 8867)));
            if (bool)
              Zr8g.ZM(Class.forName(a(-32712, 7991))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zr8g.ZM(Class.forName(a(-32712, 7991)));
    } catch (Throwable throwable) {}
  }
  
  static void ZE(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzy5.ZG : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-32706
    //   28: sipush #-6875
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
    //   76: ifne -> 49
    //   79: aload #5
    //   81: sipush #-32705
    //   84: sipush #-5084
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-32708
    //   107: sipush #-20319
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
    //   202: ifne -> 158
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
    //   330: ifne -> 395
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
    //   553: ifne -> 302
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
    //   595: ifne -> 271
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
    //   679: ifne -> 637
    //   682: aload #14
    //   684: astore #4
    //   686: sipush #-32707
    //   689: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
    //   692: checkcast java/math/BigInteger
    //   695: getstatic burp/Zls_.ZR : Ljava/lang/Object;
    //   698: checkcast java/math/BigInteger
    //   701: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   704: putstatic burp/Zb_u.Zp : Ljava/lang/Object;
    //   707: sipush #-3291
    //   710: getstatic burp/Zmjr.ZU : Ljava/lang/Object;
    //   713: checkcast java/math/BigInteger
    //   716: getstatic burp/Zeyt.ZR : Ljava/lang/Object;
    //   719: checkcast java/math/BigInteger
    //   722: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   725: putstatic burp/Zblv.Zf : Ljava/lang/Object;
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: iconst_1
    //   732: ldc burp/Zgds
    //   734: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   737: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   740: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   743: astore_3
    //   744: aload_3
    //   745: arraylength
    //   746: istore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: iload #5
    //   753: iload #4
    //   755: if_icmpge -> 892
    //   758: aload_3
    //   759: iload #5
    //   761: aaload
    //   762: astore #6
    //   764: aload #6
    //   766: invokevirtual getModifiers : ()I
    //   769: invokestatic isStatic : (I)Z
    //   772: ifne -> 782
    //   775: goto -> 885
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #6
    //   784: invokevirtual getType : ()Ljava/lang/Class;
    //   787: astore #7
    //   789: aload #7
    //   791: ifnull -> 872
    //   794: aload #7
    //   796: invokevirtual isPrimitive : ()Z
    //   799: ifne -> 872
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   814: ifnull -> 872
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   823: athrow
    //   824: aload #7
    //   826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   829: invokevirtual getName : ()Ljava/lang/String;
    //   832: ifnull -> 872
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   841: athrow
    //   842: aload #7
    //   844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   847: invokevirtual getName : ()Ljava/lang/String;
    //   850: sipush #-32713
    //   853: sipush #-11897
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   862: ifne -> 872
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: aload #6
    //   874: iconst_1
    //   875: invokevirtual setAccessible : (Z)V
    //   878: aload #6
    //   880: aconst_null
    //   881: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   884: pop
    //   885: iinc #5, 1
    //   888: iload_2
    //   889: ifne -> 751
    //   892: sipush #-32716
    //   895: sipush #30432
    //   898: invokestatic a : (II)Ljava/lang/String;
    //   901: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   904: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   907: astore_3
    //   908: aload_3
    //   909: arraylength
    //   910: istore #4
    //   912: iconst_0
    //   913: istore #5
    //   915: iload #5
    //   917: iload #4
    //   919: if_icmpge -> 1051
    //   922: aload_3
    //   923: iload #5
    //   925: aaload
    //   926: astore #6
    //   928: aload #6
    //   930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   933: pop
    //   934: aload #6
    //   936: invokevirtual getModifiers : ()I
    //   939: invokestatic isStatic : (I)Z
    //   942: ifeq -> 1037
    //   945: aload #6
    //   947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   950: arraylength
    //   951: iconst_2
    //   952: if_icmpne -> 1037
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   961: athrow
    //   962: aload #6
    //   964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   967: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   970: invokevirtual equals : (Ljava/lang/Object;)Z
    //   973: ifeq -> 1037
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   982: athrow
    //   983: aload #6
    //   985: iconst_1
    //   986: invokevirtual setAccessible : (Z)V
    //   989: aload #6
    //   991: aconst_null
    //   992: iconst_2
    //   993: anewarray java/lang/Object
    //   996: dup
    //   997: iconst_0
    //   998: aload_0
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: aload_1
    //   1003: ifnonnull -> 1021
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1012: athrow
    //   1013: aload_1
    //   1014: goto -> 1028
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload_1
    //   1022: checkcast [B
    //   1025: invokevirtual clone : ()Ljava/lang/Object;
    //   1028: aastore
    //   1029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: pop
    //   1033: iload_2
    //   1034: ifne -> 1051
    //   1037: iinc #5, 1
    //   1040: iload_2
    //   1041: ifne -> 915
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: getstatic burp/Zkv2.Z_ : Ljava/lang/String;
    //   1054: getstatic burp/Zre1.ZN : Ljava/lang/Object;
    //   1057: checkcast java/math/BigInteger
    //   1060: invokevirtual intValue : ()I
    //   1063: bipush #32
    //   1065: irem
    //   1066: invokestatic abs : (I)I
    //   1069: invokevirtual charAt : (I)C
    //   1072: getstatic burp/Zead.Zo : Ljava/lang/String;
    //   1075: getstatic burp/Ztd6.ZI : Ljava/lang/Object;
    //   1078: checkcast java/math/BigInteger
    //   1081: invokevirtual intValue : ()I
    //   1084: bipush #32
    //   1086: irem
    //   1087: invokestatic abs : (I)I
    //   1090: invokevirtual charAt : (I)C
    //   1093: if_icmple -> 1200
    //   1096: getstatic burp/Zl_1.ZH : Ljava/lang/String;
    //   1099: getstatic burp/Zmhx.ZQ : Ljava/lang/Object;
    //   1102: checkcast java/math/BigInteger
    //   1105: invokevirtual intValue : ()I
    //   1108: bipush #32
    //   1110: irem
    //   1111: invokestatic abs : (I)I
    //   1114: invokevirtual charAt : (I)C
    //   1117: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   1120: getstatic burp/Ztd6.ZI : Ljava/lang/Object;
    //   1123: checkcast java/math/BigInteger
    //   1126: invokevirtual intValue : ()I
    //   1129: bipush #32
    //   1131: irem
    //   1132: invokestatic abs : (I)I
    //   1135: invokevirtual charAt : (I)C
    //   1138: if_icmple -> 1200
    //   1141: goto -> 1148
    //   1144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1147: athrow
    //   1148: getstatic burp/Zty5.Za : Ljava/lang/String;
    //   1151: getstatic burp/Zltb.ZL : Ljava/lang/Object;
    //   1154: checkcast java/math/BigInteger
    //   1157: invokevirtual intValue : ()I
    //   1160: bipush #32
    //   1162: irem
    //   1163: invokestatic abs : (I)I
    //   1166: invokevirtual charAt : (I)C
    //   1169: getstatic burp/Zb_u.ZK : Ljava/lang/String;
    //   1172: getstatic burp/Ztes.ZX : Ljava/lang/Object;
    //   1175: checkcast java/math/BigInteger
    //   1178: invokevirtual intValue : ()I
    //   1181: bipush #32
    //   1183: irem
    //   1184: invokestatic abs : (I)I
    //   1187: invokevirtual charAt : (I)C
    //   1190: if_icmpgt -> 1208
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: iconst_1
    //   1201: goto -> 1209
    //   1204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1207: athrow
    //   1208: iconst_0
    //   1209: ireturn
    //   1210: astore_3
    //   1211: new java/lang/Exception
    //   1214: dup
    //   1215: aload_3
    //   1216: invokevirtual getMessage : ()Ljava/lang/String;
    //   1219: invokespecial <init> : (Ljava/lang/String;)V
    //   1222: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1209	1210	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   764	778	778	java/lang/Throwable
    //   789	802	805	java/lang/Throwable
    //   794	817	820	java/lang/Throwable
    //   809	835	838	java/lang/Throwable
    //   824	865	868	java/lang/Throwable
    //   928	955	958	java/lang/Throwable
    //   945	976	979	java/lang/Throwable
    //   962	1006	1009	java/lang/Throwable
    //   983	1017	1017	java/lang/Throwable
    //   1028	1044	1047	java/lang/Throwable
    //   1051	1141	1144	java/lang/Throwable
    //   1096	1193	1196	java/lang/Throwable
    //   1148	1204	1204	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÝÔðÕktA\\tÐk³³H{¬Þ%å\\n~^E µ»A4Þö®¼°¶$aõ+»\\r¾=ÍÉó²ú 41½×¢\\t¦zU8Ñ¡;ã\\tüºË<txM'³ñ-Á*\\t[ÐpÃg2®¶Ï)²=èòB,Çõ'¾ïî ·ªÅ$q|¶aIÁþct_Ðñc¢;Uù*2¸ê-£§iC¨ è £û$³^|³;Q@Íyîi¬}´@#`E2vW ½r©-·CìESdsÌþÌæ±ÎÔ°ÒÁ^'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #73
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
    //   68: ldc 'ç¾SjYÜi'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #65
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
    //   129: putstatic burp/Zei_.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zei_.b : [Ljava/lang/String;
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
    //   212: bipush #17
    //   214: goto -> 244
    //   217: bipush #93
    //   219: goto -> 244
    //   222: bipush #85
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #19
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #45
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
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #80
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-99
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #109
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-96
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-75
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-40
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-26
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-9
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-89
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #41
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-67
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-128
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-107
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #91
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #36
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #64
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #108
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #62
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: iconst_4
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-112
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-106
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #60
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-53
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-35
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #91
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #88
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #105
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-42
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-121
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #77
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-86
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-103
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zei_.Za : Ljava/lang/Object;
    //   500: sipush #-32710
    //   503: sipush #-17499
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zei_.ZZ : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF803D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zei_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */