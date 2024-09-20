package burp;

import java.math.BigInteger;

class Zbsz extends ClassLoader {
  static String Zu;
  
  static Object ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zt(Object paramObject) {
    Zu = a(-3271, -28985);
    ZP = new BigInteger(a(-3280, 520));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrye.Za.charAt(Math.abs(((BigInteger)Zzc9.ZZ).intValue() % 32)) > Zr1h.ZS.charAt(Math.abs(((BigInteger)Zsp9.ZV).intValue() % 32))) {
          try {
            Zzl4.Zg(Class.forName(a(-3267, -2106)));
            if (bool)
              Zkw.Zj(Class.forName(a(-3277, -22585))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkw.Zj(Class.forName(a(-3277, -22585)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-3290
    //   28: sipush #561
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
    //   81: sipush #-3270
    //   84: sipush #2195
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-3265
    //   107: sipush #-28961
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
    //   686: new java/lang/StringBuilder
    //   689: dup
    //   690: invokespecial <init> : ()V
    //   693: astore_3
    //   694: iconst_0
    //   695: istore #4
    //   697: iload #4
    //   699: bipush #32
    //   701: if_icmpge -> 2035
    //   704: iload #4
    //   706: tableswitch default -> 2028, 0 -> 848, 1 -> 885, 2 -> 922, 3 -> 959, 4 -> 996, 5 -> 1033, 6 -> 1070, 7 -> 1107, 8 -> 1144, 9 -> 1181, 10 -> 1218, 11 -> 1255, 12 -> 1292, 13 -> 1329, 14 -> 1366, 15 -> 1403, 16 -> 1440, 17 -> 1477, 18 -> 1514, 19 -> 1551, 20 -> 1588, 21 -> 1625, 22 -> 1662, 23 -> 1699, 24 -> 1736, 25 -> 1773, 26 -> 1810, 27 -> 1847, 28 -> 1884, 29 -> 1921, 30 -> 1958, 31 -> 1995
    //   848: aload_3
    //   849: getstatic burp/Zbze.ZK : Ljava/lang/String;
    //   852: getstatic burp/Zrww.ZN : Ljava/lang/Object;
    //   855: checkcast java/math/BigInteger
    //   858: invokevirtual intValue : ()I
    //   861: bipush #32
    //   863: irem
    //   864: invokestatic abs : (I)I
    //   867: invokevirtual charAt : (I)C
    //   870: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   873: pop
    //   874: iload_2
    //   875: ifeq -> 2028
    //   878: goto -> 885
    //   881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   884: athrow
    //   885: aload_3
    //   886: getstatic burp/Zg6z.ZY : Ljava/lang/String;
    //   889: getstatic burp/Zkca.ZQ : Ljava/lang/Object;
    //   892: checkcast java/math/BigInteger
    //   895: invokevirtual intValue : ()I
    //   898: bipush #32
    //   900: irem
    //   901: invokestatic abs : (I)I
    //   904: invokevirtual charAt : (I)C
    //   907: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   910: pop
    //   911: iload_2
    //   912: ifeq -> 2028
    //   915: goto -> 922
    //   918: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   921: athrow
    //   922: aload_3
    //   923: getstatic burp/Zb3d.Zr : Ljava/lang/String;
    //   926: getstatic burp/Zb0q.ZK : Ljava/lang/Object;
    //   929: checkcast java/math/BigInteger
    //   932: invokevirtual intValue : ()I
    //   935: bipush #32
    //   937: irem
    //   938: invokestatic abs : (I)I
    //   941: invokevirtual charAt : (I)C
    //   944: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   947: pop
    //   948: iload_2
    //   949: ifeq -> 2028
    //   952: goto -> 959
    //   955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   958: athrow
    //   959: aload_3
    //   960: getstatic burp/Ztvg.ZZ : Ljava/lang/String;
    //   963: getstatic burp/Zbli.Zo : Ljava/lang/Object;
    //   966: checkcast java/math/BigInteger
    //   969: invokevirtual intValue : ()I
    //   972: bipush #32
    //   974: irem
    //   975: invokestatic abs : (I)I
    //   978: invokevirtual charAt : (I)C
    //   981: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   984: pop
    //   985: iload_2
    //   986: ifeq -> 2028
    //   989: goto -> 996
    //   992: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   995: athrow
    //   996: aload_3
    //   997: getstatic burp/Zs8w.ZR : Ljava/lang/String;
    //   1000: getstatic burp/Zegv.ZL : Ljava/lang/Object;
    //   1003: checkcast java/math/BigInteger
    //   1006: invokevirtual intValue : ()I
    //   1009: bipush #32
    //   1011: irem
    //   1012: invokestatic abs : (I)I
    //   1015: invokevirtual charAt : (I)C
    //   1018: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1021: pop
    //   1022: iload_2
    //   1023: ifeq -> 2028
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1032: athrow
    //   1033: aload_3
    //   1034: getstatic burp/Ze2k.ZY : Ljava/lang/String;
    //   1037: getstatic burp/Zxy6.Zd : Ljava/lang/Object;
    //   1040: checkcast java/math/BigInteger
    //   1043: invokevirtual intValue : ()I
    //   1046: bipush #32
    //   1048: irem
    //   1049: invokestatic abs : (I)I
    //   1052: invokevirtual charAt : (I)C
    //   1055: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1058: pop
    //   1059: iload_2
    //   1060: ifeq -> 2028
    //   1063: goto -> 1070
    //   1066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1069: athrow
    //   1070: aload_3
    //   1071: getstatic burp/Zxln.Zz : Ljava/lang/String;
    //   1074: getstatic burp/Zzii.ZO : Ljava/lang/Object;
    //   1077: checkcast java/math/BigInteger
    //   1080: invokevirtual intValue : ()I
    //   1083: bipush #32
    //   1085: irem
    //   1086: invokestatic abs : (I)I
    //   1089: invokevirtual charAt : (I)C
    //   1092: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1095: pop
    //   1096: iload_2
    //   1097: ifeq -> 2028
    //   1100: goto -> 1107
    //   1103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1106: athrow
    //   1107: aload_3
    //   1108: getstatic burp/Zzef.Za : Ljava/lang/String;
    //   1111: getstatic burp/Zbnk.Zp : Ljava/lang/Object;
    //   1114: checkcast java/math/BigInteger
    //   1117: invokevirtual intValue : ()I
    //   1120: bipush #32
    //   1122: irem
    //   1123: invokestatic abs : (I)I
    //   1126: invokevirtual charAt : (I)C
    //   1129: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1132: pop
    //   1133: iload_2
    //   1134: ifeq -> 2028
    //   1137: goto -> 1144
    //   1140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1143: athrow
    //   1144: aload_3
    //   1145: getstatic burp/Zgsy.Zv : Ljava/lang/String;
    //   1148: getstatic burp/Zm63.ZT : Ljava/lang/Object;
    //   1151: checkcast java/math/BigInteger
    //   1154: invokevirtual intValue : ()I
    //   1157: bipush #32
    //   1159: irem
    //   1160: invokestatic abs : (I)I
    //   1163: invokevirtual charAt : (I)C
    //   1166: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1169: pop
    //   1170: iload_2
    //   1171: ifeq -> 2028
    //   1174: goto -> 1181
    //   1177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1180: athrow
    //   1181: aload_3
    //   1182: getstatic burp/Zedu.ZD : Ljava/lang/String;
    //   1185: getstatic burp/Zrqi.Zb : Ljava/lang/Object;
    //   1188: checkcast java/math/BigInteger
    //   1191: invokevirtual intValue : ()I
    //   1194: bipush #32
    //   1196: irem
    //   1197: invokestatic abs : (I)I
    //   1200: invokevirtual charAt : (I)C
    //   1203: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1206: pop
    //   1207: iload_2
    //   1208: ifeq -> 2028
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: aload_3
    //   1219: getstatic burp/Zmc_.Zb : Ljava/lang/String;
    //   1222: getstatic burp/Zea.ZO : Ljava/lang/Object;
    //   1225: checkcast java/math/BigInteger
    //   1228: invokevirtual intValue : ()I
    //   1231: bipush #32
    //   1233: irem
    //   1234: invokestatic abs : (I)I
    //   1237: invokevirtual charAt : (I)C
    //   1240: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1243: pop
    //   1244: iload_2
    //   1245: ifeq -> 2028
    //   1248: goto -> 1255
    //   1251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1254: athrow
    //   1255: aload_3
    //   1256: getstatic burp/Zkdq.ZZ : Ljava/lang/String;
    //   1259: getstatic burp/Zld5.ZX : Ljava/lang/Object;
    //   1262: checkcast java/math/BigInteger
    //   1265: invokevirtual intValue : ()I
    //   1268: bipush #32
    //   1270: irem
    //   1271: invokestatic abs : (I)I
    //   1274: invokevirtual charAt : (I)C
    //   1277: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1280: pop
    //   1281: iload_2
    //   1282: ifeq -> 2028
    //   1285: goto -> 1292
    //   1288: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1291: athrow
    //   1292: aload_3
    //   1293: getstatic burp/Zrnt.Zy : Ljava/lang/String;
    //   1296: getstatic burp/Zst7.ZI : Ljava/lang/Object;
    //   1299: checkcast java/math/BigInteger
    //   1302: invokevirtual intValue : ()I
    //   1305: bipush #32
    //   1307: irem
    //   1308: invokestatic abs : (I)I
    //   1311: invokevirtual charAt : (I)C
    //   1314: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1317: pop
    //   1318: iload_2
    //   1319: ifeq -> 2028
    //   1322: goto -> 1329
    //   1325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1328: athrow
    //   1329: aload_3
    //   1330: getstatic burp/Zllk.Zs : Ljava/lang/String;
    //   1333: getstatic burp/Zskf.ZQ : Ljava/lang/Object;
    //   1336: checkcast java/math/BigInteger
    //   1339: invokevirtual intValue : ()I
    //   1342: bipush #32
    //   1344: irem
    //   1345: invokestatic abs : (I)I
    //   1348: invokevirtual charAt : (I)C
    //   1351: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1354: pop
    //   1355: iload_2
    //   1356: ifeq -> 2028
    //   1359: goto -> 1366
    //   1362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1365: athrow
    //   1366: aload_3
    //   1367: getstatic burp/Zmc_.Zb : Ljava/lang/String;
    //   1370: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   1373: checkcast java/math/BigInteger
    //   1376: invokevirtual intValue : ()I
    //   1379: bipush #32
    //   1381: irem
    //   1382: invokestatic abs : (I)I
    //   1385: invokevirtual charAt : (I)C
    //   1388: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1391: pop
    //   1392: iload_2
    //   1393: ifeq -> 2028
    //   1396: goto -> 1403
    //   1399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1402: athrow
    //   1403: aload_3
    //   1404: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   1407: getstatic burp/Zge2.Zv : Ljava/lang/Object;
    //   1410: checkcast java/math/BigInteger
    //   1413: invokevirtual intValue : ()I
    //   1416: bipush #32
    //   1418: irem
    //   1419: invokestatic abs : (I)I
    //   1422: invokevirtual charAt : (I)C
    //   1425: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1428: pop
    //   1429: iload_2
    //   1430: ifeq -> 2028
    //   1433: goto -> 1440
    //   1436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1439: athrow
    //   1440: aload_3
    //   1441: getstatic burp/Zb2u.ZM : Ljava/lang/String;
    //   1444: getstatic burp/Zmui.Zz : Ljava/lang/Object;
    //   1447: checkcast java/math/BigInteger
    //   1450: invokevirtual intValue : ()I
    //   1453: bipush #32
    //   1455: irem
    //   1456: invokestatic abs : (I)I
    //   1459: invokevirtual charAt : (I)C
    //   1462: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1465: pop
    //   1466: iload_2
    //   1467: ifeq -> 2028
    //   1470: goto -> 1477
    //   1473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1476: athrow
    //   1477: aload_3
    //   1478: getstatic burp/Zrnk.Zb : Ljava/lang/String;
    //   1481: getstatic burp/Zedu.ZL : Ljava/lang/Object;
    //   1484: checkcast java/math/BigInteger
    //   1487: invokevirtual intValue : ()I
    //   1490: bipush #32
    //   1492: irem
    //   1493: invokestatic abs : (I)I
    //   1496: invokevirtual charAt : (I)C
    //   1499: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1502: pop
    //   1503: iload_2
    //   1504: ifeq -> 2028
    //   1507: goto -> 1514
    //   1510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1513: athrow
    //   1514: aload_3
    //   1515: getstatic burp/Zmt_.ZH : Ljava/lang/String;
    //   1518: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
    //   1521: checkcast java/math/BigInteger
    //   1524: invokevirtual intValue : ()I
    //   1527: bipush #32
    //   1529: irem
    //   1530: invokestatic abs : (I)I
    //   1533: invokevirtual charAt : (I)C
    //   1536: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1539: pop
    //   1540: iload_2
    //   1541: ifeq -> 2028
    //   1544: goto -> 1551
    //   1547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1550: athrow
    //   1551: aload_3
    //   1552: getstatic burp/Ztbn.Zx : Ljava/lang/String;
    //   1555: getstatic burp/Zbsz.ZP : Ljava/lang/Object;
    //   1558: checkcast java/math/BigInteger
    //   1561: invokevirtual intValue : ()I
    //   1564: bipush #32
    //   1566: irem
    //   1567: invokestatic abs : (I)I
    //   1570: invokevirtual charAt : (I)C
    //   1573: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1576: pop
    //   1577: iload_2
    //   1578: ifeq -> 2028
    //   1581: goto -> 1588
    //   1584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1587: athrow
    //   1588: aload_3
    //   1589: getstatic burp/Zk92.Zc : Ljava/lang/String;
    //   1592: getstatic burp/Zt5t.Za : Ljava/lang/Object;
    //   1595: checkcast java/math/BigInteger
    //   1598: invokevirtual intValue : ()I
    //   1601: bipush #32
    //   1603: irem
    //   1604: invokestatic abs : (I)I
    //   1607: invokevirtual charAt : (I)C
    //   1610: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1613: pop
    //   1614: iload_2
    //   1615: ifeq -> 2028
    //   1618: goto -> 1625
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload_3
    //   1626: getstatic burp/Zssc.ZR : Ljava/lang/String;
    //   1629: getstatic burp/Zs_m.Z_ : Ljava/lang/Object;
    //   1632: checkcast java/math/BigInteger
    //   1635: invokevirtual intValue : ()I
    //   1638: bipush #32
    //   1640: irem
    //   1641: invokestatic abs : (I)I
    //   1644: invokevirtual charAt : (I)C
    //   1647: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1650: pop
    //   1651: iload_2
    //   1652: ifeq -> 2028
    //   1655: goto -> 1662
    //   1658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1661: athrow
    //   1662: aload_3
    //   1663: getstatic burp/Zql.Zf : Ljava/lang/String;
    //   1666: getstatic burp/Zr2q.ZS : Ljava/lang/Object;
    //   1669: checkcast java/math/BigInteger
    //   1672: invokevirtual intValue : ()I
    //   1675: bipush #32
    //   1677: irem
    //   1678: invokestatic abs : (I)I
    //   1681: invokevirtual charAt : (I)C
    //   1684: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1687: pop
    //   1688: iload_2
    //   1689: ifeq -> 2028
    //   1692: goto -> 1699
    //   1695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1698: athrow
    //   1699: aload_3
    //   1700: getstatic burp/Zrov.ZU : Ljava/lang/String;
    //   1703: getstatic burp/Zzl4.ZX : Ljava/lang/Object;
    //   1706: checkcast java/math/BigInteger
    //   1709: invokevirtual intValue : ()I
    //   1712: bipush #32
    //   1714: irem
    //   1715: invokestatic abs : (I)I
    //   1718: invokevirtual charAt : (I)C
    //   1721: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1724: pop
    //   1725: iload_2
    //   1726: ifeq -> 2028
    //   1729: goto -> 1736
    //   1732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1735: athrow
    //   1736: aload_3
    //   1737: getstatic burp/Zst7.Zi : Ljava/lang/String;
    //   1740: getstatic burp/Zsko.ZD : Ljava/lang/Object;
    //   1743: checkcast java/math/BigInteger
    //   1746: invokevirtual intValue : ()I
    //   1749: bipush #32
    //   1751: irem
    //   1752: invokestatic abs : (I)I
    //   1755: invokevirtual charAt : (I)C
    //   1758: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1761: pop
    //   1762: iload_2
    //   1763: ifeq -> 2028
    //   1766: goto -> 1773
    //   1769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1772: athrow
    //   1773: aload_3
    //   1774: getstatic burp/Zxxo.ZH : Ljava/lang/String;
    //   1777: getstatic burp/Zx63.ZX : Ljava/lang/Object;
    //   1780: checkcast java/math/BigInteger
    //   1783: invokevirtual intValue : ()I
    //   1786: bipush #32
    //   1788: irem
    //   1789: invokestatic abs : (I)I
    //   1792: invokevirtual charAt : (I)C
    //   1795: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1798: pop
    //   1799: iload_2
    //   1800: ifeq -> 2028
    //   1803: goto -> 1810
    //   1806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1809: athrow
    //   1810: aload_3
    //   1811: getstatic burp/Zzn6.Za : Ljava/lang/String;
    //   1814: getstatic burp/Zbnk.Zp : Ljava/lang/Object;
    //   1817: checkcast java/math/BigInteger
    //   1820: invokevirtual intValue : ()I
    //   1823: bipush #32
    //   1825: irem
    //   1826: invokestatic abs : (I)I
    //   1829: invokevirtual charAt : (I)C
    //   1832: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1835: pop
    //   1836: iload_2
    //   1837: ifeq -> 2028
    //   1840: goto -> 1847
    //   1843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1846: athrow
    //   1847: aload_3
    //   1848: getstatic burp/Zsbo.Zg : Ljava/lang/String;
    //   1851: getstatic burp/Zrgo.ZJ : Ljava/lang/Object;
    //   1854: checkcast java/math/BigInteger
    //   1857: invokevirtual intValue : ()I
    //   1860: bipush #32
    //   1862: irem
    //   1863: invokestatic abs : (I)I
    //   1866: invokevirtual charAt : (I)C
    //   1869: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1872: pop
    //   1873: iload_2
    //   1874: ifeq -> 2028
    //   1877: goto -> 1884
    //   1880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1883: athrow
    //   1884: aload_3
    //   1885: getstatic burp/Zzpm.Za : Ljava/lang/String;
    //   1888: getstatic burp/Zt8m.Zf : Ljava/lang/Object;
    //   1891: checkcast java/math/BigInteger
    //   1894: invokevirtual intValue : ()I
    //   1897: bipush #32
    //   1899: irem
    //   1900: invokestatic abs : (I)I
    //   1903: invokevirtual charAt : (I)C
    //   1906: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1909: pop
    //   1910: iload_2
    //   1911: ifeq -> 2028
    //   1914: goto -> 1921
    //   1917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1920: athrow
    //   1921: aload_3
    //   1922: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   1925: getstatic burp/Zrov.Zk : Ljava/lang/Object;
    //   1928: checkcast java/math/BigInteger
    //   1931: invokevirtual intValue : ()I
    //   1934: bipush #32
    //   1936: irem
    //   1937: invokestatic abs : (I)I
    //   1940: invokevirtual charAt : (I)C
    //   1943: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1946: pop
    //   1947: iload_2
    //   1948: ifeq -> 2028
    //   1951: goto -> 1958
    //   1954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1957: athrow
    //   1958: aload_3
    //   1959: getstatic burp/Zz91.Zx : Ljava/lang/String;
    //   1962: getstatic burp/Zm0d.Zz : Ljava/lang/Object;
    //   1965: checkcast java/math/BigInteger
    //   1968: invokevirtual intValue : ()I
    //   1971: bipush #32
    //   1973: irem
    //   1974: invokestatic abs : (I)I
    //   1977: invokevirtual charAt : (I)C
    //   1980: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1983: pop
    //   1984: iload_2
    //   1985: ifeq -> 2028
    //   1988: goto -> 1995
    //   1991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1994: athrow
    //   1995: aload_3
    //   1996: getstatic burp/Zm69.ZE : Ljava/lang/String;
    //   1999: getstatic burp/Zegj.ZT : Ljava/lang/Object;
    //   2002: checkcast java/math/BigInteger
    //   2005: invokevirtual intValue : ()I
    //   2008: bipush #32
    //   2010: irem
    //   2011: invokestatic abs : (I)I
    //   2014: invokevirtual charAt : (I)C
    //   2017: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2020: pop
    //   2021: goto -> 2028
    //   2024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2027: athrow
    //   2028: iinc #4, 1
    //   2031: iload_2
    //   2032: ifeq -> 697
    //   2035: aload_3
    //   2036: invokevirtual toString : ()Ljava/lang/String;
    //   2039: putstatic burp/Zsu2.Zq : Ljava/lang/String;
    //   2042: sipush #-3288
    //   2045: sipush #16446
    //   2048: invokestatic a : (II)Ljava/lang/String;
    //   2051: iconst_1
    //   2052: ldc burp/Zoa
    //   2054: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2057: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2060: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2063: astore #4
    //   2065: aload #4
    //   2067: arraylength
    //   2068: istore #5
    //   2070: iconst_0
    //   2071: istore #6
    //   2073: iload #6
    //   2075: iload #5
    //   2077: if_icmpge -> 2215
    //   2080: aload #4
    //   2082: iload #6
    //   2084: aaload
    //   2085: astore #7
    //   2087: aload #7
    //   2089: invokevirtual getModifiers : ()I
    //   2092: invokestatic isStatic : (I)Z
    //   2095: ifne -> 2105
    //   2098: goto -> 2208
    //   2101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2104: athrow
    //   2105: aload #7
    //   2107: invokevirtual getType : ()Ljava/lang/Class;
    //   2110: astore #8
    //   2112: aload #8
    //   2114: ifnull -> 2195
    //   2117: aload #8
    //   2119: invokevirtual isPrimitive : ()Z
    //   2122: ifne -> 2195
    //   2125: goto -> 2132
    //   2128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2131: athrow
    //   2132: aload #8
    //   2134: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2137: ifnull -> 2195
    //   2140: goto -> 2147
    //   2143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2146: athrow
    //   2147: aload #8
    //   2149: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2152: invokevirtual getName : ()Ljava/lang/String;
    //   2155: ifnull -> 2195
    //   2158: goto -> 2165
    //   2161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2164: athrow
    //   2165: aload #8
    //   2167: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2170: invokevirtual getName : ()Ljava/lang/String;
    //   2173: sipush #-3289
    //   2176: sipush #1474
    //   2179: invokestatic a : (II)Ljava/lang/String;
    //   2182: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2185: ifne -> 2195
    //   2188: goto -> 2195
    //   2191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2194: athrow
    //   2195: aload #7
    //   2197: iconst_1
    //   2198: invokevirtual setAccessible : (Z)V
    //   2201: aload #7
    //   2203: aconst_null
    //   2204: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2207: pop
    //   2208: iinc #6, 1
    //   2211: iload_2
    //   2212: ifeq -> 2073
    //   2215: sipush #-3282
    //   2218: sipush #13705
    //   2221: invokestatic a : (II)Ljava/lang/String;
    //   2224: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2227: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2230: astore #4
    //   2232: aload #4
    //   2234: arraylength
    //   2235: istore #5
    //   2237: iconst_0
    //   2238: istore #6
    //   2240: iload #6
    //   2242: iload #5
    //   2244: if_icmpge -> 2377
    //   2247: aload #4
    //   2249: iload #6
    //   2251: aaload
    //   2252: astore #7
    //   2254: aload #7
    //   2256: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2259: pop
    //   2260: aload #7
    //   2262: invokevirtual getModifiers : ()I
    //   2265: invokestatic isStatic : (I)Z
    //   2268: ifeq -> 2363
    //   2271: aload #7
    //   2273: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2276: arraylength
    //   2277: iconst_2
    //   2278: if_icmpne -> 2363
    //   2281: goto -> 2288
    //   2284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2287: athrow
    //   2288: aload #7
    //   2290: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2293: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2296: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2299: ifeq -> 2363
    //   2302: goto -> 2309
    //   2305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2308: athrow
    //   2309: aload #7
    //   2311: iconst_1
    //   2312: invokevirtual setAccessible : (Z)V
    //   2315: aload #7
    //   2317: aconst_null
    //   2318: iconst_2
    //   2319: anewarray java/lang/Object
    //   2322: dup
    //   2323: iconst_0
    //   2324: aload_0
    //   2325: aastore
    //   2326: dup
    //   2327: iconst_1
    //   2328: aload_1
    //   2329: ifnonnull -> 2347
    //   2332: goto -> 2339
    //   2335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2338: athrow
    //   2339: aload_1
    //   2340: goto -> 2354
    //   2343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2346: athrow
    //   2347: aload_1
    //   2348: checkcast [B
    //   2351: invokevirtual clone : ()Ljava/lang/Object;
    //   2354: aastore
    //   2355: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2358: pop
    //   2359: iload_2
    //   2360: ifeq -> 2377
    //   2363: iinc #6, 1
    //   2366: iload_2
    //   2367: ifeq -> 2240
    //   2370: goto -> 2377
    //   2373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2376: athrow
    //   2377: iconst_0
    //   2378: istore #4
    //   2380: getstatic burp/Zmhq.Zy : Ljava/lang/String;
    //   2383: getstatic burp/Zrfs.ZV : Ljava/lang/Object;
    //   2386: checkcast java/math/BigInteger
    //   2389: invokevirtual intValue : ()I
    //   2392: bipush #32
    //   2394: irem
    //   2395: invokestatic abs : (I)I
    //   2398: invokevirtual charAt : (I)C
    //   2401: getstatic burp/Zm0d.ZV : Ljava/lang/String;
    //   2404: getstatic burp/Zetf.Zs : Ljava/lang/Object;
    //   2407: checkcast java/math/BigInteger
    //   2410: invokevirtual intValue : ()I
    //   2413: bipush #32
    //   2415: irem
    //   2416: invokestatic abs : (I)I
    //   2419: invokevirtual charAt : (I)C
    //   2422: if_icmpgt -> 2767
    //   2425: sipush #-3266
    //   2428: sipush #-29729
    //   2431: invokestatic a : (II)Ljava/lang/String;
    //   2434: iconst_1
    //   2435: ldc burp/Zmt_
    //   2437: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2440: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2443: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2446: astore #5
    //   2448: aload #5
    //   2450: arraylength
    //   2451: istore #6
    //   2453: iconst_0
    //   2454: istore #7
    //   2456: iload #7
    //   2458: iload #6
    //   2460: if_icmpge -> 2598
    //   2463: aload #5
    //   2465: iload #7
    //   2467: aaload
    //   2468: astore #8
    //   2470: aload #8
    //   2472: invokevirtual getModifiers : ()I
    //   2475: invokestatic isStatic : (I)Z
    //   2478: ifne -> 2488
    //   2481: goto -> 2591
    //   2484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2487: athrow
    //   2488: aload #8
    //   2490: invokevirtual getType : ()Ljava/lang/Class;
    //   2493: astore #9
    //   2495: aload #9
    //   2497: ifnull -> 2578
    //   2500: aload #9
    //   2502: invokevirtual isPrimitive : ()Z
    //   2505: ifne -> 2578
    //   2508: goto -> 2515
    //   2511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2514: athrow
    //   2515: aload #9
    //   2517: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2520: ifnull -> 2578
    //   2523: goto -> 2530
    //   2526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2529: athrow
    //   2530: aload #9
    //   2532: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2535: invokevirtual getName : ()Ljava/lang/String;
    //   2538: ifnull -> 2578
    //   2541: goto -> 2548
    //   2544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2547: athrow
    //   2548: aload #9
    //   2550: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2553: invokevirtual getName : ()Ljava/lang/String;
    //   2556: sipush #-3292
    //   2559: sipush #15497
    //   2562: invokestatic a : (II)Ljava/lang/String;
    //   2565: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2568: ifne -> 2578
    //   2571: goto -> 2578
    //   2574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2577: athrow
    //   2578: aload #8
    //   2580: iconst_1
    //   2581: invokevirtual setAccessible : (Z)V
    //   2584: aload #8
    //   2586: aconst_null
    //   2587: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2590: pop
    //   2591: iinc #7, 1
    //   2594: iload_2
    //   2595: ifeq -> 2456
    //   2598: sipush #-3268
    //   2601: sipush #-30268
    //   2604: invokestatic a : (II)Ljava/lang/String;
    //   2607: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2610: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2613: astore #5
    //   2615: aload #5
    //   2617: arraylength
    //   2618: istore #6
    //   2620: iconst_0
    //   2621: istore #7
    //   2623: iload #7
    //   2625: iload #6
    //   2627: if_icmpge -> 2764
    //   2630: aload #5
    //   2632: iload #7
    //   2634: aaload
    //   2635: astore #8
    //   2637: aload #8
    //   2639: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2642: pop
    //   2643: aload #8
    //   2645: invokevirtual getModifiers : ()I
    //   2648: invokestatic isStatic : (I)Z
    //   2651: ifeq -> 2750
    //   2654: aload #8
    //   2656: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2659: arraylength
    //   2660: iconst_2
    //   2661: if_icmpne -> 2750
    //   2664: goto -> 2671
    //   2667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2670: athrow
    //   2671: aload #8
    //   2673: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2676: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2679: if_acmpne -> 2750
    //   2682: goto -> 2689
    //   2685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2688: athrow
    //   2689: aload #8
    //   2691: iconst_1
    //   2692: invokevirtual setAccessible : (Z)V
    //   2695: aload #8
    //   2697: aconst_null
    //   2698: iconst_2
    //   2699: anewarray java/lang/Object
    //   2702: dup
    //   2703: iconst_0
    //   2704: aload_0
    //   2705: aastore
    //   2706: dup
    //   2707: iconst_1
    //   2708: aload_1
    //   2709: ifnonnull -> 2727
    //   2712: goto -> 2719
    //   2715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2718: athrow
    //   2719: aload_1
    //   2720: goto -> 2734
    //   2723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2726: athrow
    //   2727: aload_1
    //   2728: checkcast [B
    //   2731: invokevirtual clone : ()Ljava/lang/Object;
    //   2734: aastore
    //   2735: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2738: checkcast java/lang/Boolean
    //   2741: invokevirtual booleanValue : ()Z
    //   2744: istore #4
    //   2746: iload_2
    //   2747: ifeq -> 2764
    //   2750: iinc #7, 1
    //   2753: iload_2
    //   2754: ifeq -> 2623
    //   2757: goto -> 2764
    //   2760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2763: athrow
    //   2764: goto -> 3106
    //   2767: sipush #-3287
    //   2770: sipush #177
    //   2773: invokestatic a : (II)Ljava/lang/String;
    //   2776: iconst_1
    //   2777: ldc burp/Zstf
    //   2779: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2782: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2785: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2788: astore #5
    //   2790: aload #5
    //   2792: arraylength
    //   2793: istore #6
    //   2795: iconst_0
    //   2796: istore #7
    //   2798: iload #7
    //   2800: iload #6
    //   2802: if_icmpge -> 2940
    //   2805: aload #5
    //   2807: iload #7
    //   2809: aaload
    //   2810: astore #8
    //   2812: aload #8
    //   2814: invokevirtual getModifiers : ()I
    //   2817: invokestatic isStatic : (I)Z
    //   2820: ifne -> 2830
    //   2823: goto -> 2933
    //   2826: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2829: athrow
    //   2830: aload #8
    //   2832: invokevirtual getType : ()Ljava/lang/Class;
    //   2835: astore #9
    //   2837: aload #9
    //   2839: ifnull -> 2920
    //   2842: aload #9
    //   2844: invokevirtual isPrimitive : ()Z
    //   2847: ifne -> 2920
    //   2850: goto -> 2857
    //   2853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2856: athrow
    //   2857: aload #9
    //   2859: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2862: ifnull -> 2920
    //   2865: goto -> 2872
    //   2868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2871: athrow
    //   2872: aload #9
    //   2874: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2877: invokevirtual getName : ()Ljava/lang/String;
    //   2880: ifnull -> 2920
    //   2883: goto -> 2890
    //   2886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2889: athrow
    //   2890: aload #9
    //   2892: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2895: invokevirtual getName : ()Ljava/lang/String;
    //   2898: sipush #-3292
    //   2901: sipush #15497
    //   2904: invokestatic a : (II)Ljava/lang/String;
    //   2907: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2910: ifne -> 2920
    //   2913: goto -> 2920
    //   2916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2919: athrow
    //   2920: aload #8
    //   2922: iconst_1
    //   2923: invokevirtual setAccessible : (Z)V
    //   2926: aload #8
    //   2928: aconst_null
    //   2929: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2932: pop
    //   2933: iinc #7, 1
    //   2936: iload_2
    //   2937: ifeq -> 2798
    //   2940: sipush #-3269
    //   2943: sipush #30802
    //   2946: invokestatic a : (II)Ljava/lang/String;
    //   2949: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2952: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2955: astore #5
    //   2957: aload #5
    //   2959: arraylength
    //   2960: istore #6
    //   2962: iconst_0
    //   2963: istore #7
    //   2965: iload #7
    //   2967: iload #6
    //   2969: if_icmpge -> 3106
    //   2972: aload #5
    //   2974: iload #7
    //   2976: aaload
    //   2977: astore #8
    //   2979: aload #8
    //   2981: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2984: pop
    //   2985: aload #8
    //   2987: invokevirtual getModifiers : ()I
    //   2990: invokestatic isStatic : (I)Z
    //   2993: ifeq -> 3092
    //   2996: aload #8
    //   2998: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3001: arraylength
    //   3002: iconst_2
    //   3003: if_icmpne -> 3092
    //   3006: goto -> 3013
    //   3009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3012: athrow
    //   3013: aload #8
    //   3015: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3018: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3021: if_acmpne -> 3092
    //   3024: goto -> 3031
    //   3027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3030: athrow
    //   3031: aload #8
    //   3033: iconst_1
    //   3034: invokevirtual setAccessible : (Z)V
    //   3037: aload #8
    //   3039: aconst_null
    //   3040: iconst_2
    //   3041: anewarray java/lang/Object
    //   3044: dup
    //   3045: iconst_0
    //   3046: aload_0
    //   3047: aastore
    //   3048: dup
    //   3049: iconst_1
    //   3050: aload_1
    //   3051: ifnonnull -> 3069
    //   3054: goto -> 3061
    //   3057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3060: athrow
    //   3061: aload_1
    //   3062: goto -> 3076
    //   3065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3068: athrow
    //   3069: aload_1
    //   3070: checkcast [B
    //   3073: invokevirtual clone : ()Ljava/lang/Object;
    //   3076: aastore
    //   3077: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3080: checkcast java/lang/Boolean
    //   3083: invokevirtual booleanValue : ()Z
    //   3086: istore #4
    //   3088: iload_2
    //   3089: ifeq -> 3106
    //   3092: iinc #7, 1
    //   3095: iload_2
    //   3096: ifeq -> 2965
    //   3099: goto -> 3106
    //   3102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3105: athrow
    //   3106: iload #4
    //   3108: ifeq -> 3114
    //   3111: iload #4
    //   3113: ireturn
    //   3114: getstatic burp/Ze5h.Zk : Ljava/lang/String;
    //   3117: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
    //   3120: checkcast java/math/BigInteger
    //   3123: invokevirtual intValue : ()I
    //   3126: bipush #32
    //   3128: irem
    //   3129: invokestatic abs : (I)I
    //   3132: invokevirtual charAt : (I)C
    //   3135: getstatic burp/Zrfa.ZT : Ljava/lang/String;
    //   3138: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   3141: checkcast java/math/BigInteger
    //   3144: invokevirtual intValue : ()I
    //   3147: bipush #32
    //   3149: irem
    //   3150: invokestatic abs : (I)I
    //   3153: invokevirtual charAt : (I)C
    //   3156: if_icmple -> 3502
    //   3159: sipush #-3274
    //   3162: sipush #-25281
    //   3165: invokestatic a : (II)Ljava/lang/String;
    //   3168: iconst_1
    //   3169: ldc burp/Ztgt
    //   3171: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3174: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3177: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3180: astore #5
    //   3182: aload #5
    //   3184: arraylength
    //   3185: istore #6
    //   3187: iconst_0
    //   3188: istore #7
    //   3190: iload #7
    //   3192: iload #6
    //   3194: if_icmpge -> 3332
    //   3197: aload #5
    //   3199: iload #7
    //   3201: aaload
    //   3202: astore #8
    //   3204: aload #8
    //   3206: invokevirtual getModifiers : ()I
    //   3209: invokestatic isStatic : (I)Z
    //   3212: ifne -> 3222
    //   3215: goto -> 3325
    //   3218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3221: athrow
    //   3222: aload #8
    //   3224: invokevirtual getType : ()Ljava/lang/Class;
    //   3227: astore #9
    //   3229: aload #9
    //   3231: ifnull -> 3312
    //   3234: aload #9
    //   3236: invokevirtual isPrimitive : ()Z
    //   3239: ifne -> 3312
    //   3242: goto -> 3249
    //   3245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3248: athrow
    //   3249: aload #9
    //   3251: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3254: ifnull -> 3312
    //   3257: goto -> 3264
    //   3260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3263: athrow
    //   3264: aload #9
    //   3266: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3269: invokevirtual getName : ()Ljava/lang/String;
    //   3272: ifnull -> 3312
    //   3275: goto -> 3282
    //   3278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3281: athrow
    //   3282: aload #9
    //   3284: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3287: invokevirtual getName : ()Ljava/lang/String;
    //   3290: sipush #-3292
    //   3293: sipush #15497
    //   3296: invokestatic a : (II)Ljava/lang/String;
    //   3299: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3302: ifne -> 3312
    //   3305: goto -> 3312
    //   3308: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3311: athrow
    //   3312: aload #8
    //   3314: iconst_1
    //   3315: invokevirtual setAccessible : (Z)V
    //   3318: aload #8
    //   3320: aconst_null
    //   3321: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3324: pop
    //   3325: iinc #7, 1
    //   3328: iload_2
    //   3329: ifeq -> 3190
    //   3332: sipush #-3291
    //   3335: sipush #-433
    //   3338: invokestatic a : (II)Ljava/lang/String;
    //   3341: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3344: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3347: astore #5
    //   3349: aload #5
    //   3351: arraylength
    //   3352: istore #6
    //   3354: iconst_0
    //   3355: istore #7
    //   3357: iload #7
    //   3359: iload #6
    //   3361: if_icmpge -> 3498
    //   3364: aload #5
    //   3366: iload #7
    //   3368: aaload
    //   3369: astore #8
    //   3371: aload #8
    //   3373: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3376: pop
    //   3377: aload #8
    //   3379: invokevirtual getModifiers : ()I
    //   3382: invokestatic isStatic : (I)Z
    //   3385: ifeq -> 3484
    //   3388: aload #8
    //   3390: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3393: arraylength
    //   3394: iconst_2
    //   3395: if_icmpne -> 3484
    //   3398: goto -> 3405
    //   3401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3404: athrow
    //   3405: aload #8
    //   3407: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3410: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3413: if_acmpne -> 3484
    //   3416: goto -> 3423
    //   3419: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3422: athrow
    //   3423: aload #8
    //   3425: iconst_1
    //   3426: invokevirtual setAccessible : (Z)V
    //   3429: aload #8
    //   3431: aconst_null
    //   3432: iconst_2
    //   3433: anewarray java/lang/Object
    //   3436: dup
    //   3437: iconst_0
    //   3438: aload_0
    //   3439: aastore
    //   3440: dup
    //   3441: iconst_1
    //   3442: aload_1
    //   3443: ifnonnull -> 3461
    //   3446: goto -> 3453
    //   3449: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3452: athrow
    //   3453: aload_1
    //   3454: goto -> 3468
    //   3457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3460: athrow
    //   3461: aload_1
    //   3462: checkcast [B
    //   3465: invokevirtual clone : ()Ljava/lang/Object;
    //   3468: aastore
    //   3469: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3472: checkcast java/lang/Boolean
    //   3475: invokevirtual booleanValue : ()Z
    //   3478: istore #4
    //   3480: iload_2
    //   3481: ifeq -> 3498
    //   3484: iinc #7, 1
    //   3487: iload_2
    //   3488: ifeq -> 3357
    //   3491: goto -> 3498
    //   3494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3497: athrow
    //   3498: iload_2
    //   3499: ifeq -> 3841
    //   3502: sipush #-3279
    //   3505: sipush #9048
    //   3508: invokestatic a : (II)Ljava/lang/String;
    //   3511: iconst_1
    //   3512: ldc burp/Zkbf
    //   3514: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3517: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3520: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3523: astore #5
    //   3525: aload #5
    //   3527: arraylength
    //   3528: istore #6
    //   3530: iconst_0
    //   3531: istore #7
    //   3533: iload #7
    //   3535: iload #6
    //   3537: if_icmpge -> 3675
    //   3540: aload #5
    //   3542: iload #7
    //   3544: aaload
    //   3545: astore #8
    //   3547: aload #8
    //   3549: invokevirtual getModifiers : ()I
    //   3552: invokestatic isStatic : (I)Z
    //   3555: ifne -> 3565
    //   3558: goto -> 3668
    //   3561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3564: athrow
    //   3565: aload #8
    //   3567: invokevirtual getType : ()Ljava/lang/Class;
    //   3570: astore #9
    //   3572: aload #9
    //   3574: ifnull -> 3655
    //   3577: aload #9
    //   3579: invokevirtual isPrimitive : ()Z
    //   3582: ifne -> 3655
    //   3585: goto -> 3592
    //   3588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3591: athrow
    //   3592: aload #9
    //   3594: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3597: ifnull -> 3655
    //   3600: goto -> 3607
    //   3603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3606: athrow
    //   3607: aload #9
    //   3609: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3612: invokevirtual getName : ()Ljava/lang/String;
    //   3615: ifnull -> 3655
    //   3618: goto -> 3625
    //   3621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3624: athrow
    //   3625: aload #9
    //   3627: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3630: invokevirtual getName : ()Ljava/lang/String;
    //   3633: sipush #-3292
    //   3636: sipush #15497
    //   3639: invokestatic a : (II)Ljava/lang/String;
    //   3642: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3645: ifne -> 3655
    //   3648: goto -> 3655
    //   3651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3654: athrow
    //   3655: aload #8
    //   3657: iconst_1
    //   3658: invokevirtual setAccessible : (Z)V
    //   3661: aload #8
    //   3663: aconst_null
    //   3664: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3667: pop
    //   3668: iinc #7, 1
    //   3671: iload_2
    //   3672: ifeq -> 3533
    //   3675: sipush #-3286
    //   3678: sipush #27483
    //   3681: invokestatic a : (II)Ljava/lang/String;
    //   3684: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3687: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3690: astore #5
    //   3692: aload #5
    //   3694: arraylength
    //   3695: istore #6
    //   3697: iconst_0
    //   3698: istore #7
    //   3700: iload #7
    //   3702: iload #6
    //   3704: if_icmpge -> 3841
    //   3707: aload #5
    //   3709: iload #7
    //   3711: aaload
    //   3712: astore #8
    //   3714: aload #8
    //   3716: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3719: pop
    //   3720: aload #8
    //   3722: invokevirtual getModifiers : ()I
    //   3725: invokestatic isStatic : (I)Z
    //   3728: ifeq -> 3827
    //   3731: aload #8
    //   3733: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3736: arraylength
    //   3737: iconst_2
    //   3738: if_icmpne -> 3827
    //   3741: goto -> 3748
    //   3744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3747: athrow
    //   3748: aload #8
    //   3750: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3753: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3756: if_acmpne -> 3827
    //   3759: goto -> 3766
    //   3762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3765: athrow
    //   3766: aload #8
    //   3768: iconst_1
    //   3769: invokevirtual setAccessible : (Z)V
    //   3772: aload #8
    //   3774: aconst_null
    //   3775: iconst_2
    //   3776: anewarray java/lang/Object
    //   3779: dup
    //   3780: iconst_0
    //   3781: aload_0
    //   3782: aastore
    //   3783: dup
    //   3784: iconst_1
    //   3785: aload_1
    //   3786: ifnonnull -> 3804
    //   3789: goto -> 3796
    //   3792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3795: athrow
    //   3796: aload_1
    //   3797: goto -> 3811
    //   3800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3803: athrow
    //   3804: aload_1
    //   3805: checkcast [B
    //   3808: invokevirtual clone : ()Ljava/lang/Object;
    //   3811: aastore
    //   3812: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3815: checkcast java/lang/Boolean
    //   3818: invokevirtual booleanValue : ()Z
    //   3821: istore #4
    //   3823: iload_2
    //   3824: ifeq -> 3841
    //   3827: iinc #7, 1
    //   3830: iload_2
    //   3831: ifeq -> 3700
    //   3834: goto -> 3841
    //   3837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3840: athrow
    //   3841: iload #4
    //   3843: ifeq -> 3849
    //   3846: iload #4
    //   3848: ireturn
    //   3849: getstatic burp/Zrfs.ZD : Ljava/lang/String;
    //   3852: getstatic burp/Zlw8.ZA : Ljava/lang/Object;
    //   3855: checkcast java/math/BigInteger
    //   3858: invokevirtual intValue : ()I
    //   3861: bipush #32
    //   3863: irem
    //   3864: invokestatic abs : (I)I
    //   3867: invokevirtual charAt : (I)C
    //   3870: getstatic burp/Zkjj.ZT : Ljava/lang/String;
    //   3873: getstatic burp/Zkkl.ZE : Ljava/lang/Object;
    //   3876: checkcast java/math/BigInteger
    //   3879: invokevirtual intValue : ()I
    //   3882: bipush #32
    //   3884: irem
    //   3885: invokestatic abs : (I)I
    //   3888: invokevirtual charAt : (I)C
    //   3891: if_icmpgt -> 4237
    //   3894: sipush #-3284
    //   3897: sipush #4778
    //   3900: invokestatic a : (II)Ljava/lang/String;
    //   3903: iconst_1
    //   3904: ldc burp/Zrd0
    //   3906: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3909: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3912: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3915: astore #5
    //   3917: aload #5
    //   3919: arraylength
    //   3920: istore #6
    //   3922: iconst_0
    //   3923: istore #7
    //   3925: iload #7
    //   3927: iload #6
    //   3929: if_icmpge -> 4067
    //   3932: aload #5
    //   3934: iload #7
    //   3936: aaload
    //   3937: astore #8
    //   3939: aload #8
    //   3941: invokevirtual getModifiers : ()I
    //   3944: invokestatic isStatic : (I)Z
    //   3947: ifne -> 3957
    //   3950: goto -> 4060
    //   3953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3956: athrow
    //   3957: aload #8
    //   3959: invokevirtual getType : ()Ljava/lang/Class;
    //   3962: astore #9
    //   3964: aload #9
    //   3966: ifnull -> 4047
    //   3969: aload #9
    //   3971: invokevirtual isPrimitive : ()Z
    //   3974: ifne -> 4047
    //   3977: goto -> 3984
    //   3980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3983: athrow
    //   3984: aload #9
    //   3986: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3989: ifnull -> 4047
    //   3992: goto -> 3999
    //   3995: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3998: athrow
    //   3999: aload #9
    //   4001: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4004: invokevirtual getName : ()Ljava/lang/String;
    //   4007: ifnull -> 4047
    //   4010: goto -> 4017
    //   4013: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4016: athrow
    //   4017: aload #9
    //   4019: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4022: invokevirtual getName : ()Ljava/lang/String;
    //   4025: sipush #-3292
    //   4028: sipush #15497
    //   4031: invokestatic a : (II)Ljava/lang/String;
    //   4034: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4037: ifne -> 4047
    //   4040: goto -> 4047
    //   4043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4046: athrow
    //   4047: aload #8
    //   4049: iconst_1
    //   4050: invokevirtual setAccessible : (Z)V
    //   4053: aload #8
    //   4055: aconst_null
    //   4056: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4059: pop
    //   4060: iinc #7, 1
    //   4063: iload_2
    //   4064: ifeq -> 3925
    //   4067: sipush #-3272
    //   4070: sipush #7540
    //   4073: invokestatic a : (II)Ljava/lang/String;
    //   4076: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4079: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4082: astore #5
    //   4084: aload #5
    //   4086: arraylength
    //   4087: istore #6
    //   4089: iconst_0
    //   4090: istore #7
    //   4092: iload #7
    //   4094: iload #6
    //   4096: if_icmpge -> 4233
    //   4099: aload #5
    //   4101: iload #7
    //   4103: aaload
    //   4104: astore #8
    //   4106: aload #8
    //   4108: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4111: pop
    //   4112: aload #8
    //   4114: invokevirtual getModifiers : ()I
    //   4117: invokestatic isStatic : (I)Z
    //   4120: ifeq -> 4219
    //   4123: aload #8
    //   4125: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4128: arraylength
    //   4129: iconst_2
    //   4130: if_icmpne -> 4219
    //   4133: goto -> 4140
    //   4136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4139: athrow
    //   4140: aload #8
    //   4142: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4145: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4148: if_acmpne -> 4219
    //   4151: goto -> 4158
    //   4154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4157: athrow
    //   4158: aload #8
    //   4160: iconst_1
    //   4161: invokevirtual setAccessible : (Z)V
    //   4164: aload #8
    //   4166: aconst_null
    //   4167: iconst_2
    //   4168: anewarray java/lang/Object
    //   4171: dup
    //   4172: iconst_0
    //   4173: aload_0
    //   4174: aastore
    //   4175: dup
    //   4176: iconst_1
    //   4177: aload_1
    //   4178: ifnonnull -> 4196
    //   4181: goto -> 4188
    //   4184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4187: athrow
    //   4188: aload_1
    //   4189: goto -> 4203
    //   4192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4195: athrow
    //   4196: aload_1
    //   4197: checkcast [B
    //   4200: invokevirtual clone : ()Ljava/lang/Object;
    //   4203: aastore
    //   4204: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4207: checkcast java/lang/Boolean
    //   4210: invokevirtual booleanValue : ()Z
    //   4213: istore #4
    //   4215: iload_2
    //   4216: ifeq -> 4233
    //   4219: iinc #7, 1
    //   4222: iload_2
    //   4223: ifeq -> 4092
    //   4226: goto -> 4233
    //   4229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4232: athrow
    //   4233: iload_2
    //   4234: ifeq -> 4576
    //   4237: sipush #-3285
    //   4240: sipush #-16684
    //   4243: invokestatic a : (II)Ljava/lang/String;
    //   4246: iconst_1
    //   4247: ldc burp/Zly0
    //   4249: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4252: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4255: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4258: astore #5
    //   4260: aload #5
    //   4262: arraylength
    //   4263: istore #6
    //   4265: iconst_0
    //   4266: istore #7
    //   4268: iload #7
    //   4270: iload #6
    //   4272: if_icmpge -> 4410
    //   4275: aload #5
    //   4277: iload #7
    //   4279: aaload
    //   4280: astore #8
    //   4282: aload #8
    //   4284: invokevirtual getModifiers : ()I
    //   4287: invokestatic isStatic : (I)Z
    //   4290: ifne -> 4300
    //   4293: goto -> 4403
    //   4296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4299: athrow
    //   4300: aload #8
    //   4302: invokevirtual getType : ()Ljava/lang/Class;
    //   4305: astore #9
    //   4307: aload #9
    //   4309: ifnull -> 4390
    //   4312: aload #9
    //   4314: invokevirtual isPrimitive : ()Z
    //   4317: ifne -> 4390
    //   4320: goto -> 4327
    //   4323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4326: athrow
    //   4327: aload #9
    //   4329: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4332: ifnull -> 4390
    //   4335: goto -> 4342
    //   4338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4341: athrow
    //   4342: aload #9
    //   4344: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4347: invokevirtual getName : ()Ljava/lang/String;
    //   4350: ifnull -> 4390
    //   4353: goto -> 4360
    //   4356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4359: athrow
    //   4360: aload #9
    //   4362: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4365: invokevirtual getName : ()Ljava/lang/String;
    //   4368: sipush #-3292
    //   4371: sipush #15497
    //   4374: invokestatic a : (II)Ljava/lang/String;
    //   4377: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4380: ifne -> 4390
    //   4383: goto -> 4390
    //   4386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4389: athrow
    //   4390: aload #8
    //   4392: iconst_1
    //   4393: invokevirtual setAccessible : (Z)V
    //   4396: aload #8
    //   4398: aconst_null
    //   4399: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4402: pop
    //   4403: iinc #7, 1
    //   4406: iload_2
    //   4407: ifeq -> 4268
    //   4410: sipush #-3276
    //   4413: sipush #-2790
    //   4416: invokestatic a : (II)Ljava/lang/String;
    //   4419: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4422: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4425: astore #5
    //   4427: aload #5
    //   4429: arraylength
    //   4430: istore #6
    //   4432: iconst_0
    //   4433: istore #7
    //   4435: iload #7
    //   4437: iload #6
    //   4439: if_icmpge -> 4576
    //   4442: aload #5
    //   4444: iload #7
    //   4446: aaload
    //   4447: astore #8
    //   4449: aload #8
    //   4451: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4454: pop
    //   4455: aload #8
    //   4457: invokevirtual getModifiers : ()I
    //   4460: invokestatic isStatic : (I)Z
    //   4463: ifeq -> 4562
    //   4466: aload #8
    //   4468: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4471: arraylength
    //   4472: iconst_2
    //   4473: if_icmpne -> 4562
    //   4476: goto -> 4483
    //   4479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4482: athrow
    //   4483: aload #8
    //   4485: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4488: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4491: if_acmpne -> 4562
    //   4494: goto -> 4501
    //   4497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4500: athrow
    //   4501: aload #8
    //   4503: iconst_1
    //   4504: invokevirtual setAccessible : (Z)V
    //   4507: aload #8
    //   4509: aconst_null
    //   4510: iconst_2
    //   4511: anewarray java/lang/Object
    //   4514: dup
    //   4515: iconst_0
    //   4516: aload_0
    //   4517: aastore
    //   4518: dup
    //   4519: iconst_1
    //   4520: aload_1
    //   4521: ifnonnull -> 4539
    //   4524: goto -> 4531
    //   4527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4530: athrow
    //   4531: aload_1
    //   4532: goto -> 4546
    //   4535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4538: athrow
    //   4539: aload_1
    //   4540: checkcast [B
    //   4543: invokevirtual clone : ()Ljava/lang/Object;
    //   4546: aastore
    //   4547: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4550: checkcast java/lang/Boolean
    //   4553: invokevirtual booleanValue : ()Z
    //   4556: istore #4
    //   4558: iload_2
    //   4559: ifeq -> 4576
    //   4562: iinc #7, 1
    //   4565: iload_2
    //   4566: ifeq -> 4435
    //   4569: goto -> 4576
    //   4572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4575: athrow
    //   4576: iload #4
    //   4578: ifeq -> 4584
    //   4581: iload #4
    //   4583: ireturn
    //   4584: getstatic burp/Zea8.ZE : Ljava/lang/String;
    //   4587: getstatic burp/Zzgb.ZG : Ljava/lang/Object;
    //   4590: checkcast java/math/BigInteger
    //   4593: invokevirtual intValue : ()I
    //   4596: bipush #32
    //   4598: irem
    //   4599: invokestatic abs : (I)I
    //   4602: invokevirtual charAt : (I)C
    //   4605: getstatic burp/Zlgh.Zm : Ljava/lang/String;
    //   4608: getstatic burp/Zex0.Ze : Ljava/lang/Object;
    //   4611: checkcast java/math/BigInteger
    //   4614: invokevirtual intValue : ()I
    //   4617: bipush #32
    //   4619: irem
    //   4620: invokestatic abs : (I)I
    //   4623: invokevirtual charAt : (I)C
    //   4626: if_icmpgt -> 4972
    //   4629: sipush #-3283
    //   4632: sipush #-25253
    //   4635: invokestatic a : (II)Ljava/lang/String;
    //   4638: iconst_1
    //   4639: ldc burp/Zemp
    //   4641: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4644: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4647: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4650: astore #5
    //   4652: aload #5
    //   4654: arraylength
    //   4655: istore #6
    //   4657: iconst_0
    //   4658: istore #7
    //   4660: iload #7
    //   4662: iload #6
    //   4664: if_icmpge -> 4802
    //   4667: aload #5
    //   4669: iload #7
    //   4671: aaload
    //   4672: astore #8
    //   4674: aload #8
    //   4676: invokevirtual getModifiers : ()I
    //   4679: invokestatic isStatic : (I)Z
    //   4682: ifne -> 4692
    //   4685: goto -> 4795
    //   4688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4691: athrow
    //   4692: aload #8
    //   4694: invokevirtual getType : ()Ljava/lang/Class;
    //   4697: astore #9
    //   4699: aload #9
    //   4701: ifnull -> 4782
    //   4704: aload #9
    //   4706: invokevirtual isPrimitive : ()Z
    //   4709: ifne -> 4782
    //   4712: goto -> 4719
    //   4715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4718: athrow
    //   4719: aload #9
    //   4721: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4724: ifnull -> 4782
    //   4727: goto -> 4734
    //   4730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4733: athrow
    //   4734: aload #9
    //   4736: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4739: invokevirtual getName : ()Ljava/lang/String;
    //   4742: ifnull -> 4782
    //   4745: goto -> 4752
    //   4748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4751: athrow
    //   4752: aload #9
    //   4754: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4757: invokevirtual getName : ()Ljava/lang/String;
    //   4760: sipush #-3292
    //   4763: sipush #15497
    //   4766: invokestatic a : (II)Ljava/lang/String;
    //   4769: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4772: ifne -> 4782
    //   4775: goto -> 4782
    //   4778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4781: athrow
    //   4782: aload #8
    //   4784: iconst_1
    //   4785: invokevirtual setAccessible : (Z)V
    //   4788: aload #8
    //   4790: aconst_null
    //   4791: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4794: pop
    //   4795: iinc #7, 1
    //   4798: iload_2
    //   4799: ifeq -> 4660
    //   4802: sipush #-3281
    //   4805: sipush #31889
    //   4808: invokestatic a : (II)Ljava/lang/String;
    //   4811: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4814: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4817: astore #5
    //   4819: aload #5
    //   4821: arraylength
    //   4822: istore #6
    //   4824: iconst_0
    //   4825: istore #7
    //   4827: iload #7
    //   4829: iload #6
    //   4831: if_icmpge -> 4968
    //   4834: aload #5
    //   4836: iload #7
    //   4838: aaload
    //   4839: astore #8
    //   4841: aload #8
    //   4843: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4846: pop
    //   4847: aload #8
    //   4849: invokevirtual getModifiers : ()I
    //   4852: invokestatic isStatic : (I)Z
    //   4855: ifeq -> 4954
    //   4858: aload #8
    //   4860: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4863: arraylength
    //   4864: iconst_2
    //   4865: if_icmpne -> 4954
    //   4868: goto -> 4875
    //   4871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4874: athrow
    //   4875: aload #8
    //   4877: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4880: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4883: if_acmpne -> 4954
    //   4886: goto -> 4893
    //   4889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4892: athrow
    //   4893: aload #8
    //   4895: iconst_1
    //   4896: invokevirtual setAccessible : (Z)V
    //   4899: aload #8
    //   4901: aconst_null
    //   4902: iconst_2
    //   4903: anewarray java/lang/Object
    //   4906: dup
    //   4907: iconst_0
    //   4908: aload_0
    //   4909: aastore
    //   4910: dup
    //   4911: iconst_1
    //   4912: aload_1
    //   4913: ifnonnull -> 4931
    //   4916: goto -> 4923
    //   4919: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4922: athrow
    //   4923: aload_1
    //   4924: goto -> 4938
    //   4927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4930: athrow
    //   4931: aload_1
    //   4932: checkcast [B
    //   4935: invokevirtual clone : ()Ljava/lang/Object;
    //   4938: aastore
    //   4939: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4942: checkcast java/lang/Boolean
    //   4945: invokevirtual booleanValue : ()Z
    //   4948: istore #4
    //   4950: iload_2
    //   4951: ifeq -> 4968
    //   4954: iinc #7, 1
    //   4957: iload_2
    //   4958: ifeq -> 4827
    //   4961: goto -> 4968
    //   4964: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4967: athrow
    //   4968: iload_2
    //   4969: ifeq -> 5311
    //   4972: sipush #-3273
    //   4975: sipush #3173
    //   4978: invokestatic a : (II)Ljava/lang/String;
    //   4981: iconst_1
    //   4982: ldc burp/Zzap
    //   4984: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4987: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4990: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4993: astore #5
    //   4995: aload #5
    //   4997: arraylength
    //   4998: istore #6
    //   5000: iconst_0
    //   5001: istore #7
    //   5003: iload #7
    //   5005: iload #6
    //   5007: if_icmpge -> 5145
    //   5010: aload #5
    //   5012: iload #7
    //   5014: aaload
    //   5015: astore #8
    //   5017: aload #8
    //   5019: invokevirtual getModifiers : ()I
    //   5022: invokestatic isStatic : (I)Z
    //   5025: ifne -> 5035
    //   5028: goto -> 5138
    //   5031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5034: athrow
    //   5035: aload #8
    //   5037: invokevirtual getType : ()Ljava/lang/Class;
    //   5040: astore #9
    //   5042: aload #9
    //   5044: ifnull -> 5125
    //   5047: aload #9
    //   5049: invokevirtual isPrimitive : ()Z
    //   5052: ifne -> 5125
    //   5055: goto -> 5062
    //   5058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5061: athrow
    //   5062: aload #9
    //   5064: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5067: ifnull -> 5125
    //   5070: goto -> 5077
    //   5073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5076: athrow
    //   5077: aload #9
    //   5079: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5082: invokevirtual getName : ()Ljava/lang/String;
    //   5085: ifnull -> 5125
    //   5088: goto -> 5095
    //   5091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5094: athrow
    //   5095: aload #9
    //   5097: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5100: invokevirtual getName : ()Ljava/lang/String;
    //   5103: sipush #-3292
    //   5106: sipush #15497
    //   5109: invokestatic a : (II)Ljava/lang/String;
    //   5112: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5115: ifne -> 5125
    //   5118: goto -> 5125
    //   5121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5124: athrow
    //   5125: aload #8
    //   5127: iconst_1
    //   5128: invokevirtual setAccessible : (Z)V
    //   5131: aload #8
    //   5133: aconst_null
    //   5134: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5137: pop
    //   5138: iinc #7, 1
    //   5141: iload_2
    //   5142: ifeq -> 5003
    //   5145: sipush #-3275
    //   5148: sipush #18116
    //   5151: invokestatic a : (II)Ljava/lang/String;
    //   5154: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5157: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5160: astore #5
    //   5162: aload #5
    //   5164: arraylength
    //   5165: istore #6
    //   5167: iconst_0
    //   5168: istore #7
    //   5170: iload #7
    //   5172: iload #6
    //   5174: if_icmpge -> 5311
    //   5177: aload #5
    //   5179: iload #7
    //   5181: aaload
    //   5182: astore #8
    //   5184: aload #8
    //   5186: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5189: pop
    //   5190: aload #8
    //   5192: invokevirtual getModifiers : ()I
    //   5195: invokestatic isStatic : (I)Z
    //   5198: ifeq -> 5297
    //   5201: aload #8
    //   5203: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5206: arraylength
    //   5207: iconst_2
    //   5208: if_icmpne -> 5297
    //   5211: goto -> 5218
    //   5214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5217: athrow
    //   5218: aload #8
    //   5220: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5223: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5226: if_acmpne -> 5297
    //   5229: goto -> 5236
    //   5232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5235: athrow
    //   5236: aload #8
    //   5238: iconst_1
    //   5239: invokevirtual setAccessible : (Z)V
    //   5242: aload #8
    //   5244: aconst_null
    //   5245: iconst_2
    //   5246: anewarray java/lang/Object
    //   5249: dup
    //   5250: iconst_0
    //   5251: aload_0
    //   5252: aastore
    //   5253: dup
    //   5254: iconst_1
    //   5255: aload_1
    //   5256: ifnonnull -> 5274
    //   5259: goto -> 5266
    //   5262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5265: athrow
    //   5266: aload_1
    //   5267: goto -> 5281
    //   5270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5273: athrow
    //   5274: aload_1
    //   5275: checkcast [B
    //   5278: invokevirtual clone : ()Ljava/lang/Object;
    //   5281: aastore
    //   5282: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5285: checkcast java/lang/Boolean
    //   5288: invokevirtual booleanValue : ()Z
    //   5291: istore #4
    //   5293: iload_2
    //   5294: ifeq -> 5311
    //   5297: iinc #7, 1
    //   5300: iload_2
    //   5301: ifeq -> 5170
    //   5304: goto -> 5311
    //   5307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5310: athrow
    //   5311: iload #4
    //   5313: ireturn
    //   5314: astore_3
    //   5315: new java/lang/Exception
    //   5318: dup
    //   5319: aload_3
    //   5320: invokevirtual getMessage : ()Ljava/lang/String;
    //   5323: invokespecial <init> : (Ljava/lang/String;)V
    //   5326: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3113	5314	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   704	878	881	java/lang/Throwable
    //   848	915	918	java/lang/Throwable
    //   885	952	955	java/lang/Throwable
    //   922	989	992	java/lang/Throwable
    //   959	1026	1029	java/lang/Throwable
    //   996	1063	1066	java/lang/Throwable
    //   1033	1100	1103	java/lang/Throwable
    //   1070	1137	1140	java/lang/Throwable
    //   1107	1174	1177	java/lang/Throwable
    //   1144	1211	1214	java/lang/Throwable
    //   1181	1248	1251	java/lang/Throwable
    //   1218	1285	1288	java/lang/Throwable
    //   1255	1322	1325	java/lang/Throwable
    //   1292	1359	1362	java/lang/Throwable
    //   1329	1396	1399	java/lang/Throwable
    //   1366	1433	1436	java/lang/Throwable
    //   1403	1470	1473	java/lang/Throwable
    //   1440	1507	1510	java/lang/Throwable
    //   1477	1544	1547	java/lang/Throwable
    //   1514	1581	1584	java/lang/Throwable
    //   1551	1618	1621	java/lang/Throwable
    //   1588	1655	1658	java/lang/Throwable
    //   1625	1692	1695	java/lang/Throwable
    //   1662	1729	1732	java/lang/Throwable
    //   1699	1766	1769	java/lang/Throwable
    //   1736	1803	1806	java/lang/Throwable
    //   1773	1840	1843	java/lang/Throwable
    //   1810	1877	1880	java/lang/Throwable
    //   1847	1914	1917	java/lang/Throwable
    //   1884	1951	1954	java/lang/Throwable
    //   1921	1988	1991	java/lang/Throwable
    //   1958	2021	2024	java/lang/Throwable
    //   2087	2101	2101	java/lang/Throwable
    //   2112	2125	2128	java/lang/Throwable
    //   2117	2140	2143	java/lang/Throwable
    //   2132	2158	2161	java/lang/Throwable
    //   2147	2188	2191	java/lang/Throwable
    //   2254	2281	2284	java/lang/Throwable
    //   2271	2302	2305	java/lang/Throwable
    //   2288	2332	2335	java/lang/Throwable
    //   2309	2343	2343	java/lang/Throwable
    //   2354	2370	2373	java/lang/Throwable
    //   2470	2484	2484	java/lang/Throwable
    //   2495	2508	2511	java/lang/Throwable
    //   2500	2523	2526	java/lang/Throwable
    //   2515	2541	2544	java/lang/Throwable
    //   2530	2571	2574	java/lang/Throwable
    //   2637	2664	2667	java/lang/Throwable
    //   2654	2682	2685	java/lang/Throwable
    //   2671	2712	2715	java/lang/Throwable
    //   2689	2723	2723	java/lang/Throwable
    //   2746	2757	2760	java/lang/Throwable
    //   2812	2826	2826	java/lang/Throwable
    //   2837	2850	2853	java/lang/Throwable
    //   2842	2865	2868	java/lang/Throwable
    //   2857	2883	2886	java/lang/Throwable
    //   2872	2913	2916	java/lang/Throwable
    //   2979	3006	3009	java/lang/Throwable
    //   2996	3024	3027	java/lang/Throwable
    //   3013	3054	3057	java/lang/Throwable
    //   3031	3065	3065	java/lang/Throwable
    //   3088	3099	3102	java/lang/Throwable
    //   3114	3848	5314	java/lang/Throwable
    //   3204	3218	3218	java/lang/Throwable
    //   3229	3242	3245	java/lang/Throwable
    //   3234	3257	3260	java/lang/Throwable
    //   3249	3275	3278	java/lang/Throwable
    //   3264	3305	3308	java/lang/Throwable
    //   3371	3398	3401	java/lang/Throwable
    //   3388	3416	3419	java/lang/Throwable
    //   3405	3446	3449	java/lang/Throwable
    //   3423	3457	3457	java/lang/Throwable
    //   3480	3491	3494	java/lang/Throwable
    //   3547	3561	3561	java/lang/Throwable
    //   3572	3585	3588	java/lang/Throwable
    //   3577	3600	3603	java/lang/Throwable
    //   3592	3618	3621	java/lang/Throwable
    //   3607	3648	3651	java/lang/Throwable
    //   3714	3741	3744	java/lang/Throwable
    //   3731	3759	3762	java/lang/Throwable
    //   3748	3789	3792	java/lang/Throwable
    //   3766	3800	3800	java/lang/Throwable
    //   3823	3834	3837	java/lang/Throwable
    //   3849	4583	5314	java/lang/Throwable
    //   3939	3953	3953	java/lang/Throwable
    //   3964	3977	3980	java/lang/Throwable
    //   3969	3992	3995	java/lang/Throwable
    //   3984	4010	4013	java/lang/Throwable
    //   3999	4040	4043	java/lang/Throwable
    //   4106	4133	4136	java/lang/Throwable
    //   4123	4151	4154	java/lang/Throwable
    //   4140	4181	4184	java/lang/Throwable
    //   4158	4192	4192	java/lang/Throwable
    //   4215	4226	4229	java/lang/Throwable
    //   4282	4296	4296	java/lang/Throwable
    //   4307	4320	4323	java/lang/Throwable
    //   4312	4335	4338	java/lang/Throwable
    //   4327	4353	4356	java/lang/Throwable
    //   4342	4383	4386	java/lang/Throwable
    //   4449	4476	4479	java/lang/Throwable
    //   4466	4494	4497	java/lang/Throwable
    //   4483	4524	4527	java/lang/Throwable
    //   4501	4535	4535	java/lang/Throwable
    //   4558	4569	4572	java/lang/Throwable
    //   4584	5313	5314	java/lang/Throwable
    //   4674	4688	4688	java/lang/Throwable
    //   4699	4712	4715	java/lang/Throwable
    //   4704	4727	4730	java/lang/Throwable
    //   4719	4745	4748	java/lang/Throwable
    //   4734	4775	4778	java/lang/Throwable
    //   4841	4868	4871	java/lang/Throwable
    //   4858	4886	4889	java/lang/Throwable
    //   4875	4916	4919	java/lang/Throwable
    //   4893	4927	4927	java/lang/Throwable
    //   4950	4961	4964	java/lang/Throwable
    //   5017	5031	5031	java/lang/Throwable
    //   5042	5055	5058	java/lang/Throwable
    //   5047	5070	5073	java/lang/Throwable
    //   5062	5088	5091	java/lang/Throwable
    //   5077	5118	5121	java/lang/Throwable
    //   5184	5211	5214	java/lang/Throwable
    //   5201	5229	5232	java/lang/Throwable
    //   5218	5259	5262	java/lang/Throwable
    //   5236	5270	5270	java/lang/Throwable
    //   5293	5304	5307	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'C[*'¤&\\rº\\tOWë}¼Ú\\tlecí\±H\\t}ÂAßÂ!ÝM~²ÑÏUòÉ\\t~lz0Þ\\tÅÒV=`Ô ¡¡"y@>EöåÄqÛÎT£!°&©£ÃnZN&«n\\tºüh#×»\\t$j°º÷d\\t)@ËIÈ\\t\\tÄ\\nv 9áâ¦ ¸TÒ1-0`Ié«Ý!«ÑKfPÙí<d=õ:F\\t7§DM?qMß\\füK9.Æ·P,85sÆO$¹a£¶Ðíù¸wè!fäÝ¡Ð+`pb[dþMÉÇtµê"îÞóvãI)§J\\tÊñ·ô^5\\t>0Ü®ó\\t×æuRbÐ²\\t¶B8\\tðÀÛ¸\\tÍ£N(J\\tâ^²¡°à·\\tLjg\\f`»S\\tí£S5GitE\\t8NF>)\\f£ iá$%nµ/.a¬§~Jg%+~þG(¦ôVaDËf8'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #102
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
    //   68: ldc '²\Ô\\tÿ@õ­­°)ÿ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #43
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
    //   128: putstatic burp/Zbsz.a : [Ljava/lang/String;
    //   131: bipush #28
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbsz.b : [Ljava/lang/String;
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
    //   212: bipush #24
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #27
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #44
    //   234: goto -> 244
    //   237: bipush #106
    //   239: goto -> 244
    //   242: bipush #100
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
    //   300: sipush #-3278
    //   303: sipush #-27166
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zbsz.Zu : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: iconst_0
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-4
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-122
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #82
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-48
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #44
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #20
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #40
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-58
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #77
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-24
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-69
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-124
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #45
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #119
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-9
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #26
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #91
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #53
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-59
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-86
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-116
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #62
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #110
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #6
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-76
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-54
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #44
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #61
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-23
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #14
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #48
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zbsz.ZP : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF33E) & 0xFFFF;
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
      byte b1 = 73;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */