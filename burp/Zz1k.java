package burp;

import java.math.BigInteger;

class Zz1k extends ClassLoader {
  static String ZC;
  
  static Object ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZG(Object paramObject) {
    Zshq.Zi = a(-6329, -20597);
    Zshq.ZK = new BigInteger(a(-6327, 18071));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zk8b.ZT.charAt(Math.abs(((BigInteger)Zxzd.ZD).intValue() % 32)) <= Zxso.ZH.charAt(Math.abs(((BigInteger)Zbo7.Zl).intValue() % 32))) {
          try {
            Zz80.ZP(Class.forName(a(-6324, 13453)));
            if (!bool)
              Ze3d.Zi(Class.forName(a(-6334, -23734))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze3d.Zi(Class.forName(a(-6334, -23734)));
    } catch (Throwable throwable) {}
  }
  
  static void Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zd1.ZV : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-6336
    //   28: sipush #11404
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
    //   81: sipush #-6330
    //   84: sipush #-19709
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-6326
    //   107: sipush #16262
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
    //   686: getstatic burp/Zkfz.Zr : Ljava/lang/Object;
    //   689: checkcast java/math/BigInteger
    //   692: invokevirtual toByteArray : ()[B
    //   695: astore_3
    //   696: iconst_0
    //   697: istore #5
    //   699: iconst_0
    //   700: istore #6
    //   702: iload #6
    //   704: aload_3
    //   705: arraylength
    //   706: if_icmpge -> 851
    //   709: aload_3
    //   710: iload #6
    //   712: baload
    //   713: istore #7
    //   715: iload #7
    //   717: bipush #48
    //   719: if_icmplt -> 736
    //   722: iload #7
    //   724: bipush #57
    //   726: if_icmple -> 834
    //   729: goto -> 736
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: iload #7
    //   738: bipush #65
    //   740: if_icmplt -> 764
    //   743: goto -> 750
    //   746: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   749: athrow
    //   750: iload #7
    //   752: bipush #90
    //   754: if_icmple -> 834
    //   757: goto -> 764
    //   760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   763: athrow
    //   764: iload #7
    //   766: bipush #97
    //   768: if_icmplt -> 792
    //   771: goto -> 778
    //   774: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   777: athrow
    //   778: iload #7
    //   780: bipush #122
    //   782: if_icmple -> 834
    //   785: goto -> 792
    //   788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   791: athrow
    //   792: iload #7
    //   794: bipush #43
    //   796: if_icmpeq -> 834
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   805: athrow
    //   806: iload #7
    //   808: bipush #47
    //   810: if_icmpeq -> 834
    //   813: goto -> 820
    //   816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   819: athrow
    //   820: iload #7
    //   822: bipush #61
    //   824: if_icmpne -> 844
    //   827: goto -> 834
    //   830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   833: athrow
    //   834: iinc #5, 1
    //   837: goto -> 844
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: iinc #6, 1
    //   847: iload_2
    //   848: ifne -> 702
    //   851: iload #5
    //   853: newarray byte
    //   855: astore #6
    //   857: iconst_0
    //   858: istore #7
    //   860: iconst_0
    //   861: istore #8
    //   863: iload #8
    //   865: aload_3
    //   866: arraylength
    //   867: if_icmpge -> 1019
    //   870: aload_3
    //   871: iload #8
    //   873: baload
    //   874: istore #9
    //   876: iload #9
    //   878: bipush #48
    //   880: if_icmplt -> 897
    //   883: iload #9
    //   885: bipush #57
    //   887: if_icmple -> 995
    //   890: goto -> 897
    //   893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   896: athrow
    //   897: iload #9
    //   899: bipush #65
    //   901: if_icmplt -> 925
    //   904: goto -> 911
    //   907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   910: athrow
    //   911: iload #9
    //   913: bipush #90
    //   915: if_icmple -> 995
    //   918: goto -> 925
    //   921: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   924: athrow
    //   925: iload #9
    //   927: bipush #97
    //   929: if_icmplt -> 953
    //   932: goto -> 939
    //   935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   938: athrow
    //   939: iload #9
    //   941: bipush #122
    //   943: if_icmple -> 995
    //   946: goto -> 953
    //   949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   952: athrow
    //   953: iload #9
    //   955: bipush #43
    //   957: if_icmpeq -> 995
    //   960: goto -> 967
    //   963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   966: athrow
    //   967: iload #9
    //   969: bipush #47
    //   971: if_icmpeq -> 995
    //   974: goto -> 981
    //   977: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   980: athrow
    //   981: iload #9
    //   983: bipush #61
    //   985: if_icmpne -> 1012
    //   988: goto -> 995
    //   991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   994: athrow
    //   995: aload #6
    //   997: iload #7
    //   999: iload #9
    //   1001: bastore
    //   1002: iinc #7, 1
    //   1005: goto -> 1012
    //   1008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1011: athrow
    //   1012: iinc #8, 1
    //   1015: iload_2
    //   1016: ifne -> 863
    //   1019: aload #6
    //   1021: astore #4
    //   1023: aload #4
    //   1025: astore_3
    //   1026: aload_3
    //   1027: arraylength
    //   1028: istore #5
    //   1030: aload_3
    //   1031: iload #5
    //   1033: iconst_1
    //   1034: isub
    //   1035: baload
    //   1036: bipush #61
    //   1038: if_icmpne -> 1048
    //   1041: iinc #5, -1
    //   1044: iload_2
    //   1045: ifne -> 1030
    //   1048: iload #5
    //   1050: aload_3
    //   1051: arraylength
    //   1052: iconst_4
    //   1053: idiv
    //   1054: isub
    //   1055: newarray byte
    //   1057: astore #6
    //   1059: iconst_0
    //   1060: istore #7
    //   1062: iload #7
    //   1064: aload_3
    //   1065: arraylength
    //   1066: if_icmpge -> 1328
    //   1069: aload_3
    //   1070: iload #7
    //   1072: baload
    //   1073: bipush #61
    //   1075: if_icmpne -> 1094
    //   1078: aload_3
    //   1079: iload #7
    //   1081: iconst_0
    //   1082: bastore
    //   1083: iload_2
    //   1084: ifne -> 1321
    //   1087: goto -> 1094
    //   1090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1093: athrow
    //   1094: aload_3
    //   1095: iload #7
    //   1097: baload
    //   1098: bipush #47
    //   1100: if_icmpne -> 1127
    //   1103: goto -> 1110
    //   1106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1109: athrow
    //   1110: aload_3
    //   1111: iload #7
    //   1113: bipush #63
    //   1115: bastore
    //   1116: iload_2
    //   1117: ifne -> 1321
    //   1120: goto -> 1127
    //   1123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1126: athrow
    //   1127: aload_3
    //   1128: iload #7
    //   1130: baload
    //   1131: bipush #43
    //   1133: if_icmpne -> 1160
    //   1136: goto -> 1143
    //   1139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1142: athrow
    //   1143: aload_3
    //   1144: iload #7
    //   1146: bipush #62
    //   1148: bastore
    //   1149: iload_2
    //   1150: ifne -> 1321
    //   1153: goto -> 1160
    //   1156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1159: athrow
    //   1160: aload_3
    //   1161: iload #7
    //   1163: baload
    //   1164: bipush #48
    //   1166: if_icmplt -> 1215
    //   1169: goto -> 1176
    //   1172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1175: athrow
    //   1176: aload_3
    //   1177: iload #7
    //   1179: baload
    //   1180: bipush #57
    //   1182: if_icmpgt -> 1215
    //   1185: goto -> 1192
    //   1188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1191: athrow
    //   1192: aload_3
    //   1193: iload #7
    //   1195: aload_3
    //   1196: iload #7
    //   1198: baload
    //   1199: bipush #-4
    //   1201: isub
    //   1202: i2b
    //   1203: bastore
    //   1204: iload_2
    //   1205: ifne -> 1321
    //   1208: goto -> 1215
    //   1211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1214: athrow
    //   1215: aload_3
    //   1216: iload #7
    //   1218: baload
    //   1219: bipush #97
    //   1221: if_icmplt -> 1270
    //   1224: goto -> 1231
    //   1227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1230: athrow
    //   1231: aload_3
    //   1232: iload #7
    //   1234: baload
    //   1235: bipush #122
    //   1237: if_icmpgt -> 1270
    //   1240: goto -> 1247
    //   1243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1246: athrow
    //   1247: aload_3
    //   1248: iload #7
    //   1250: aload_3
    //   1251: iload #7
    //   1253: baload
    //   1254: bipush #71
    //   1256: isub
    //   1257: i2b
    //   1258: bastore
    //   1259: iload_2
    //   1260: ifne -> 1321
    //   1263: goto -> 1270
    //   1266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1269: athrow
    //   1270: aload_3
    //   1271: iload #7
    //   1273: baload
    //   1274: bipush #65
    //   1276: if_icmplt -> 1321
    //   1279: goto -> 1286
    //   1282: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1285: athrow
    //   1286: aload_3
    //   1287: iload #7
    //   1289: baload
    //   1290: bipush #90
    //   1292: if_icmpgt -> 1321
    //   1295: goto -> 1302
    //   1298: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1301: athrow
    //   1302: aload_3
    //   1303: iload #7
    //   1305: aload_3
    //   1306: iload #7
    //   1308: baload
    //   1309: bipush #65
    //   1311: isub
    //   1312: i2b
    //   1313: bastore
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1320: athrow
    //   1321: iinc #7, 1
    //   1324: iload_2
    //   1325: ifne -> 1062
    //   1328: iconst_0
    //   1329: istore #7
    //   1331: iconst_0
    //   1332: istore #8
    //   1334: iload #8
    //   1336: aload #6
    //   1338: arraylength
    //   1339: iconst_2
    //   1340: isub
    //   1341: if_icmpge -> 1444
    //   1344: aload #6
    //   1346: iload #8
    //   1348: aload_3
    //   1349: iload #7
    //   1351: baload
    //   1352: iconst_2
    //   1353: ishl
    //   1354: sipush #255
    //   1357: iand
    //   1358: aload_3
    //   1359: iload #7
    //   1361: iconst_1
    //   1362: iadd
    //   1363: baload
    //   1364: iconst_4
    //   1365: iushr
    //   1366: iconst_3
    //   1367: iand
    //   1368: ior
    //   1369: i2b
    //   1370: bastore
    //   1371: aload #6
    //   1373: iload #8
    //   1375: iconst_1
    //   1376: iadd
    //   1377: aload_3
    //   1378: iload #7
    //   1380: iconst_1
    //   1381: iadd
    //   1382: baload
    //   1383: iconst_4
    //   1384: ishl
    //   1385: sipush #255
    //   1388: iand
    //   1389: aload_3
    //   1390: iload #7
    //   1392: iconst_2
    //   1393: iadd
    //   1394: baload
    //   1395: iconst_2
    //   1396: iushr
    //   1397: bipush #15
    //   1399: iand
    //   1400: ior
    //   1401: i2b
    //   1402: bastore
    //   1403: aload #6
    //   1405: iload #8
    //   1407: iconst_2
    //   1408: iadd
    //   1409: aload_3
    //   1410: iload #7
    //   1412: iconst_2
    //   1413: iadd
    //   1414: baload
    //   1415: bipush #6
    //   1417: ishl
    //   1418: sipush #255
    //   1421: iand
    //   1422: aload_3
    //   1423: iload #7
    //   1425: iconst_3
    //   1426: iadd
    //   1427: baload
    //   1428: bipush #63
    //   1430: iand
    //   1431: ior
    //   1432: i2b
    //   1433: bastore
    //   1434: iinc #7, 4
    //   1437: iinc #8, 3
    //   1440: iload_2
    //   1441: ifne -> 1334
    //   1444: iload #8
    //   1446: aload #6
    //   1448: arraylength
    //   1449: if_icmpge -> 1486
    //   1452: aload #6
    //   1454: iload #8
    //   1456: aload_3
    //   1457: iload #7
    //   1459: baload
    //   1460: iconst_2
    //   1461: ishl
    //   1462: sipush #255
    //   1465: iand
    //   1466: aload_3
    //   1467: iload #7
    //   1469: iconst_1
    //   1470: iadd
    //   1471: baload
    //   1472: iconst_4
    //   1473: iushr
    //   1474: iconst_3
    //   1475: iand
    //   1476: ior
    //   1477: i2b
    //   1478: bastore
    //   1479: goto -> 1486
    //   1482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1485: athrow
    //   1486: iinc #8, 1
    //   1489: iload #8
    //   1491: aload #6
    //   1493: arraylength
    //   1494: if_icmpge -> 1534
    //   1497: aload #6
    //   1499: iload #8
    //   1501: aload_3
    //   1502: iload #7
    //   1504: iconst_1
    //   1505: iadd
    //   1506: baload
    //   1507: iconst_4
    //   1508: ishl
    //   1509: sipush #255
    //   1512: iand
    //   1513: aload_3
    //   1514: iload #7
    //   1516: iconst_2
    //   1517: iadd
    //   1518: baload
    //   1519: iconst_2
    //   1520: iushr
    //   1521: bipush #15
    //   1523: iand
    //   1524: ior
    //   1525: i2b
    //   1526: bastore
    //   1527: goto -> 1534
    //   1530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1533: athrow
    //   1534: aload #6
    //   1536: astore #4
    //   1538: new java/math/BigInteger
    //   1541: dup
    //   1542: aload #4
    //   1544: invokespecial <init> : ([B)V
    //   1547: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1550: putstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   1553: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   1556: checkcast java/math/BigInteger
    //   1559: invokevirtual toByteArray : ()[B
    //   1562: astore_3
    //   1563: bipush #32
    //   1565: newarray int
    //   1567: dup
    //   1568: iconst_0
    //   1569: ldc 876216579
    //   1571: iastore
    //   1572: dup
    //   1573: iconst_1
    //   1574: ldc 455999525
    //   1576: iastore
    //   1577: dup
    //   1578: iconst_2
    //   1579: ldc 1043334948
    //   1581: iastore
    //   1582: dup
    //   1583: iconst_3
    //   1584: ldc 439222784
    //   1586: iastore
    //   1587: dup
    //   1588: iconst_4
    //   1589: ldc 372376604
    //   1591: iastore
    //   1592: dup
    //   1593: iconst_5
    //   1594: ldc 707731490
    //   1596: iastore
    //   1597: dup
    //   1598: bipush #6
    //   1600: ldc 389426184
    //   1602: iastore
    //   1603: dup
    //   1604: bipush #7
    //   1606: ldc 973875457
    //   1608: iastore
    //   1609: dup
    //   1610: bipush #8
    //   1612: ldc 389160971
    //   1614: iastore
    //   1615: dup
    //   1616: bipush #9
    //   1618: ldc 907870729
    //   1620: iastore
    //   1621: dup
    //   1622: bipush #10
    //   1624: ldc 121057538
    //   1626: iastore
    //   1627: dup
    //   1628: bipush #11
    //   1630: ldc 840500228
    //   1632: iastore
    //   1633: dup
    //   1634: bipush #12
    //   1636: ldc 254150144
    //   1638: iastore
    //   1639: dup
    //   1640: bipush #13
    //   1642: ldc 924386310
    //   1644: iastore
    //   1645: dup
    //   1646: bipush #14
    //   1648: ldc 187632156
    //   1650: iastore
    //   1651: dup
    //   1652: bipush #15
    //   1654: ldc 874189824
    //   1656: iastore
    //   1657: dup
    //   1658: bipush #16
    //   1660: ldc 655302664
    //   1662: iastore
    //   1663: dup
    //   1664: bipush #17
    //   1666: ldc 890966315
    //   1668: iastore
    //   1669: dup
    //   1670: bipush #18
    //   1672: ldc 722417666
    //   1674: iastore
    //   1675: dup
    //   1676: bipush #19
    //   1678: ldc 1026621720
    //   1680: iastore
    //   1681: dup
    //   1682: bipush #20
    //   1684: ldc 957157408
    //   1686: iastore
    //   1687: dup
    //   1688: bipush #21
    //   1690: ldc 892536332
    //   1692: iastore
    //   1693: dup
    //   1694: bipush #22
    //   1696: ldc 689771012
    //   1698: iastore
    //   1699: dup
    //   1700: bipush #23
    //   1702: ldc 221709344
    //   1704: iastore
    //   1705: dup
    //   1706: bipush #24
    //   1708: ldc 940377620
    //   1710: iastore
    //   1711: dup
    //   1712: bipush #25
    //   1714: ldc 255209728
    //   1716: iastore
    //   1717: dup
    //   1718: bipush #26
    //   1720: ldc 1010368540
    //   1722: iastore
    //   1723: dup
    //   1724: bipush #27
    //   1726: ldc 220604441
    //   1728: iastore
    //   1729: dup
    //   1730: bipush #28
    //   1732: ldc 1008414755
    //   1734: iastore
    //   1735: dup
    //   1736: bipush #29
    //   1738: ldc 187049985
    //   1740: iastore
    //   1741: dup
    //   1742: bipush #30
    //   1744: ldc 943331329
    //   1746: iastore
    //   1747: dup
    //   1748: bipush #31
    //   1750: ldc 170788368
    //   1752: iastore
    //   1753: astore #5
    //   1755: bipush #64
    //   1757: newarray int
    //   1759: dup
    //   1760: iconst_0
    //   1761: ldc 16843776
    //   1763: iastore
    //   1764: dup
    //   1765: iconst_1
    //   1766: iconst_0
    //   1767: iastore
    //   1768: dup
    //   1769: iconst_2
    //   1770: ldc 65536
    //   1772: iastore
    //   1773: dup
    //   1774: iconst_3
    //   1775: ldc 16843780
    //   1777: iastore
    //   1778: dup
    //   1779: iconst_4
    //   1780: ldc 16842756
    //   1782: iastore
    //   1783: dup
    //   1784: iconst_5
    //   1785: ldc 66564
    //   1787: iastore
    //   1788: dup
    //   1789: bipush #6
    //   1791: iconst_4
    //   1792: iastore
    //   1793: dup
    //   1794: bipush #7
    //   1796: ldc 65536
    //   1798: iastore
    //   1799: dup
    //   1800: bipush #8
    //   1802: sipush #1024
    //   1805: iastore
    //   1806: dup
    //   1807: bipush #9
    //   1809: ldc 16843776
    //   1811: iastore
    //   1812: dup
    //   1813: bipush #10
    //   1815: ldc 16843780
    //   1817: iastore
    //   1818: dup
    //   1819: bipush #11
    //   1821: sipush #1024
    //   1824: iastore
    //   1825: dup
    //   1826: bipush #12
    //   1828: ldc 16778244
    //   1830: iastore
    //   1831: dup
    //   1832: bipush #13
    //   1834: ldc 16842756
    //   1836: iastore
    //   1837: dup
    //   1838: bipush #14
    //   1840: ldc 16777216
    //   1842: iastore
    //   1843: dup
    //   1844: bipush #15
    //   1846: iconst_4
    //   1847: iastore
    //   1848: dup
    //   1849: bipush #16
    //   1851: sipush #1028
    //   1854: iastore
    //   1855: dup
    //   1856: bipush #17
    //   1858: ldc 16778240
    //   1860: iastore
    //   1861: dup
    //   1862: bipush #18
    //   1864: ldc 16778240
    //   1866: iastore
    //   1867: dup
    //   1868: bipush #19
    //   1870: ldc 66560
    //   1872: iastore
    //   1873: dup
    //   1874: bipush #20
    //   1876: ldc 66560
    //   1878: iastore
    //   1879: dup
    //   1880: bipush #21
    //   1882: ldc 16842752
    //   1884: iastore
    //   1885: dup
    //   1886: bipush #22
    //   1888: ldc 16842752
    //   1890: iastore
    //   1891: dup
    //   1892: bipush #23
    //   1894: ldc 16778244
    //   1896: iastore
    //   1897: dup
    //   1898: bipush #24
    //   1900: ldc 65540
    //   1902: iastore
    //   1903: dup
    //   1904: bipush #25
    //   1906: ldc 16777220
    //   1908: iastore
    //   1909: dup
    //   1910: bipush #26
    //   1912: ldc 16777220
    //   1914: iastore
    //   1915: dup
    //   1916: bipush #27
    //   1918: ldc 65540
    //   1920: iastore
    //   1921: dup
    //   1922: bipush #28
    //   1924: iconst_0
    //   1925: iastore
    //   1926: dup
    //   1927: bipush #29
    //   1929: sipush #1028
    //   1932: iastore
    //   1933: dup
    //   1934: bipush #30
    //   1936: ldc 66564
    //   1938: iastore
    //   1939: dup
    //   1940: bipush #31
    //   1942: ldc 16777216
    //   1944: iastore
    //   1945: dup
    //   1946: bipush #32
    //   1948: ldc 65536
    //   1950: iastore
    //   1951: dup
    //   1952: bipush #33
    //   1954: ldc 16843780
    //   1956: iastore
    //   1957: dup
    //   1958: bipush #34
    //   1960: iconst_4
    //   1961: iastore
    //   1962: dup
    //   1963: bipush #35
    //   1965: ldc 16842752
    //   1967: iastore
    //   1968: dup
    //   1969: bipush #36
    //   1971: ldc 16843776
    //   1973: iastore
    //   1974: dup
    //   1975: bipush #37
    //   1977: ldc 16777216
    //   1979: iastore
    //   1980: dup
    //   1981: bipush #38
    //   1983: ldc 16777216
    //   1985: iastore
    //   1986: dup
    //   1987: bipush #39
    //   1989: sipush #1024
    //   1992: iastore
    //   1993: dup
    //   1994: bipush #40
    //   1996: ldc 16842756
    //   1998: iastore
    //   1999: dup
    //   2000: bipush #41
    //   2002: ldc 65536
    //   2004: iastore
    //   2005: dup
    //   2006: bipush #42
    //   2008: ldc 66560
    //   2010: iastore
    //   2011: dup
    //   2012: bipush #43
    //   2014: ldc 16777220
    //   2016: iastore
    //   2017: dup
    //   2018: bipush #44
    //   2020: sipush #1024
    //   2023: iastore
    //   2024: dup
    //   2025: bipush #45
    //   2027: iconst_4
    //   2028: iastore
    //   2029: dup
    //   2030: bipush #46
    //   2032: ldc 16778244
    //   2034: iastore
    //   2035: dup
    //   2036: bipush #47
    //   2038: ldc 66564
    //   2040: iastore
    //   2041: dup
    //   2042: bipush #48
    //   2044: ldc 16843780
    //   2046: iastore
    //   2047: dup
    //   2048: bipush #49
    //   2050: ldc 65540
    //   2052: iastore
    //   2053: dup
    //   2054: bipush #50
    //   2056: ldc 16842752
    //   2058: iastore
    //   2059: dup
    //   2060: bipush #51
    //   2062: ldc 16778244
    //   2064: iastore
    //   2065: dup
    //   2066: bipush #52
    //   2068: ldc 16777220
    //   2070: iastore
    //   2071: dup
    //   2072: bipush #53
    //   2074: sipush #1028
    //   2077: iastore
    //   2078: dup
    //   2079: bipush #54
    //   2081: ldc 66564
    //   2083: iastore
    //   2084: dup
    //   2085: bipush #55
    //   2087: ldc 16843776
    //   2089: iastore
    //   2090: dup
    //   2091: bipush #56
    //   2093: sipush #1028
    //   2096: iastore
    //   2097: dup
    //   2098: bipush #57
    //   2100: ldc 16778240
    //   2102: iastore
    //   2103: dup
    //   2104: bipush #58
    //   2106: ldc 16778240
    //   2108: iastore
    //   2109: dup
    //   2110: bipush #59
    //   2112: iconst_0
    //   2113: iastore
    //   2114: dup
    //   2115: bipush #60
    //   2117: ldc 65540
    //   2119: iastore
    //   2120: dup
    //   2121: bipush #61
    //   2123: ldc 66560
    //   2125: iastore
    //   2126: dup
    //   2127: bipush #62
    //   2129: iconst_0
    //   2130: iastore
    //   2131: dup
    //   2132: bipush #63
    //   2134: ldc 16842756
    //   2136: iastore
    //   2137: astore #6
    //   2139: bipush #64
    //   2141: newarray int
    //   2143: dup
    //   2144: iconst_0
    //   2145: ldc -2146402272
    //   2147: iastore
    //   2148: dup
    //   2149: iconst_1
    //   2150: ldc -2147450880
    //   2152: iastore
    //   2153: dup
    //   2154: iconst_2
    //   2155: ldc 32768
    //   2157: iastore
    //   2158: dup
    //   2159: iconst_3
    //   2160: ldc 1081376
    //   2162: iastore
    //   2163: dup
    //   2164: iconst_4
    //   2165: ldc 1048576
    //   2167: iastore
    //   2168: dup
    //   2169: iconst_5
    //   2170: bipush #32
    //   2172: iastore
    //   2173: dup
    //   2174: bipush #6
    //   2176: ldc -2146435040
    //   2178: iastore
    //   2179: dup
    //   2180: bipush #7
    //   2182: ldc -2147450848
    //   2184: iastore
    //   2185: dup
    //   2186: bipush #8
    //   2188: ldc -2147483616
    //   2190: iastore
    //   2191: dup
    //   2192: bipush #9
    //   2194: ldc -2146402272
    //   2196: iastore
    //   2197: dup
    //   2198: bipush #10
    //   2200: ldc -2146402304
    //   2202: iastore
    //   2203: dup
    //   2204: bipush #11
    //   2206: ldc -2147483648
    //   2208: iastore
    //   2209: dup
    //   2210: bipush #12
    //   2212: ldc -2147450880
    //   2214: iastore
    //   2215: dup
    //   2216: bipush #13
    //   2218: ldc 1048576
    //   2220: iastore
    //   2221: dup
    //   2222: bipush #14
    //   2224: bipush #32
    //   2226: iastore
    //   2227: dup
    //   2228: bipush #15
    //   2230: ldc -2146435040
    //   2232: iastore
    //   2233: dup
    //   2234: bipush #16
    //   2236: ldc 1081344
    //   2238: iastore
    //   2239: dup
    //   2240: bipush #17
    //   2242: ldc 1048608
    //   2244: iastore
    //   2245: dup
    //   2246: bipush #18
    //   2248: ldc -2147450848
    //   2250: iastore
    //   2251: dup
    //   2252: bipush #19
    //   2254: iconst_0
    //   2255: iastore
    //   2256: dup
    //   2257: bipush #20
    //   2259: ldc -2147483648
    //   2261: iastore
    //   2262: dup
    //   2263: bipush #21
    //   2265: ldc 32768
    //   2267: iastore
    //   2268: dup
    //   2269: bipush #22
    //   2271: ldc 1081376
    //   2273: iastore
    //   2274: dup
    //   2275: bipush #23
    //   2277: ldc -2146435072
    //   2279: iastore
    //   2280: dup
    //   2281: bipush #24
    //   2283: ldc 1048608
    //   2285: iastore
    //   2286: dup
    //   2287: bipush #25
    //   2289: ldc -2147483616
    //   2291: iastore
    //   2292: dup
    //   2293: bipush #26
    //   2295: iconst_0
    //   2296: iastore
    //   2297: dup
    //   2298: bipush #27
    //   2300: ldc 1081344
    //   2302: iastore
    //   2303: dup
    //   2304: bipush #28
    //   2306: ldc 32800
    //   2308: iastore
    //   2309: dup
    //   2310: bipush #29
    //   2312: ldc -2146402304
    //   2314: iastore
    //   2315: dup
    //   2316: bipush #30
    //   2318: ldc -2146435072
    //   2320: iastore
    //   2321: dup
    //   2322: bipush #31
    //   2324: ldc 32800
    //   2326: iastore
    //   2327: dup
    //   2328: bipush #32
    //   2330: iconst_0
    //   2331: iastore
    //   2332: dup
    //   2333: bipush #33
    //   2335: ldc 1081376
    //   2337: iastore
    //   2338: dup
    //   2339: bipush #34
    //   2341: ldc -2146435040
    //   2343: iastore
    //   2344: dup
    //   2345: bipush #35
    //   2347: ldc 1048576
    //   2349: iastore
    //   2350: dup
    //   2351: bipush #36
    //   2353: ldc -2147450848
    //   2355: iastore
    //   2356: dup
    //   2357: bipush #37
    //   2359: ldc -2146435072
    //   2361: iastore
    //   2362: dup
    //   2363: bipush #38
    //   2365: ldc -2146402304
    //   2367: iastore
    //   2368: dup
    //   2369: bipush #39
    //   2371: ldc 32768
    //   2373: iastore
    //   2374: dup
    //   2375: bipush #40
    //   2377: ldc -2146435072
    //   2379: iastore
    //   2380: dup
    //   2381: bipush #41
    //   2383: ldc -2147450880
    //   2385: iastore
    //   2386: dup
    //   2387: bipush #42
    //   2389: bipush #32
    //   2391: iastore
    //   2392: dup
    //   2393: bipush #43
    //   2395: ldc -2146402272
    //   2397: iastore
    //   2398: dup
    //   2399: bipush #44
    //   2401: ldc 1081376
    //   2403: iastore
    //   2404: dup
    //   2405: bipush #45
    //   2407: bipush #32
    //   2409: iastore
    //   2410: dup
    //   2411: bipush #46
    //   2413: ldc 32768
    //   2415: iastore
    //   2416: dup
    //   2417: bipush #47
    //   2419: ldc -2147483648
    //   2421: iastore
    //   2422: dup
    //   2423: bipush #48
    //   2425: ldc 32800
    //   2427: iastore
    //   2428: dup
    //   2429: bipush #49
    //   2431: ldc -2146402304
    //   2433: iastore
    //   2434: dup
    //   2435: bipush #50
    //   2437: ldc 1048576
    //   2439: iastore
    //   2440: dup
    //   2441: bipush #51
    //   2443: ldc -2147483616
    //   2445: iastore
    //   2446: dup
    //   2447: bipush #52
    //   2449: ldc 1048608
    //   2451: iastore
    //   2452: dup
    //   2453: bipush #53
    //   2455: ldc -2147450848
    //   2457: iastore
    //   2458: dup
    //   2459: bipush #54
    //   2461: ldc -2147483616
    //   2463: iastore
    //   2464: dup
    //   2465: bipush #55
    //   2467: ldc 1048608
    //   2469: iastore
    //   2470: dup
    //   2471: bipush #56
    //   2473: ldc 1081344
    //   2475: iastore
    //   2476: dup
    //   2477: bipush #57
    //   2479: iconst_0
    //   2480: iastore
    //   2481: dup
    //   2482: bipush #58
    //   2484: ldc -2147450880
    //   2486: iastore
    //   2487: dup
    //   2488: bipush #59
    //   2490: ldc 32800
    //   2492: iastore
    //   2493: dup
    //   2494: bipush #60
    //   2496: ldc -2147483648
    //   2498: iastore
    //   2499: dup
    //   2500: bipush #61
    //   2502: ldc -2146435040
    //   2504: iastore
    //   2505: dup
    //   2506: bipush #62
    //   2508: ldc -2146402272
    //   2510: iastore
    //   2511: dup
    //   2512: bipush #63
    //   2514: ldc 1081344
    //   2516: iastore
    //   2517: astore #7
    //   2519: bipush #64
    //   2521: newarray int
    //   2523: dup
    //   2524: iconst_0
    //   2525: sipush #520
    //   2528: iastore
    //   2529: dup
    //   2530: iconst_1
    //   2531: ldc 134349312
    //   2533: iastore
    //   2534: dup
    //   2535: iconst_2
    //   2536: iconst_0
    //   2537: iastore
    //   2538: dup
    //   2539: iconst_3
    //   2540: ldc 134348808
    //   2542: iastore
    //   2543: dup
    //   2544: iconst_4
    //   2545: ldc 134218240
    //   2547: iastore
    //   2548: dup
    //   2549: iconst_5
    //   2550: iconst_0
    //   2551: iastore
    //   2552: dup
    //   2553: bipush #6
    //   2555: ldc 131592
    //   2557: iastore
    //   2558: dup
    //   2559: bipush #7
    //   2561: ldc 134218240
    //   2563: iastore
    //   2564: dup
    //   2565: bipush #8
    //   2567: ldc 131080
    //   2569: iastore
    //   2570: dup
    //   2571: bipush #9
    //   2573: ldc 134217736
    //   2575: iastore
    //   2576: dup
    //   2577: bipush #10
    //   2579: ldc 134217736
    //   2581: iastore
    //   2582: dup
    //   2583: bipush #11
    //   2585: ldc 131072
    //   2587: iastore
    //   2588: dup
    //   2589: bipush #12
    //   2591: ldc 134349320
    //   2593: iastore
    //   2594: dup
    //   2595: bipush #13
    //   2597: ldc 131080
    //   2599: iastore
    //   2600: dup
    //   2601: bipush #14
    //   2603: ldc 134348800
    //   2605: iastore
    //   2606: dup
    //   2607: bipush #15
    //   2609: sipush #520
    //   2612: iastore
    //   2613: dup
    //   2614: bipush #16
    //   2616: ldc 134217728
    //   2618: iastore
    //   2619: dup
    //   2620: bipush #17
    //   2622: bipush #8
    //   2624: iastore
    //   2625: dup
    //   2626: bipush #18
    //   2628: ldc 134349312
    //   2630: iastore
    //   2631: dup
    //   2632: bipush #19
    //   2634: sipush #512
    //   2637: iastore
    //   2638: dup
    //   2639: bipush #20
    //   2641: ldc 131584
    //   2643: iastore
    //   2644: dup
    //   2645: bipush #21
    //   2647: ldc 134348800
    //   2649: iastore
    //   2650: dup
    //   2651: bipush #22
    //   2653: ldc 134348808
    //   2655: iastore
    //   2656: dup
    //   2657: bipush #23
    //   2659: ldc 131592
    //   2661: iastore
    //   2662: dup
    //   2663: bipush #24
    //   2665: ldc 134218248
    //   2667: iastore
    //   2668: dup
    //   2669: bipush #25
    //   2671: ldc 131584
    //   2673: iastore
    //   2674: dup
    //   2675: bipush #26
    //   2677: ldc 131072
    //   2679: iastore
    //   2680: dup
    //   2681: bipush #27
    //   2683: ldc 134218248
    //   2685: iastore
    //   2686: dup
    //   2687: bipush #28
    //   2689: bipush #8
    //   2691: iastore
    //   2692: dup
    //   2693: bipush #29
    //   2695: ldc 134349320
    //   2697: iastore
    //   2698: dup
    //   2699: bipush #30
    //   2701: sipush #512
    //   2704: iastore
    //   2705: dup
    //   2706: bipush #31
    //   2708: ldc 134217728
    //   2710: iastore
    //   2711: dup
    //   2712: bipush #32
    //   2714: ldc 134349312
    //   2716: iastore
    //   2717: dup
    //   2718: bipush #33
    //   2720: ldc 134217728
    //   2722: iastore
    //   2723: dup
    //   2724: bipush #34
    //   2726: ldc 131080
    //   2728: iastore
    //   2729: dup
    //   2730: bipush #35
    //   2732: sipush #520
    //   2735: iastore
    //   2736: dup
    //   2737: bipush #36
    //   2739: ldc 131072
    //   2741: iastore
    //   2742: dup
    //   2743: bipush #37
    //   2745: ldc 134349312
    //   2747: iastore
    //   2748: dup
    //   2749: bipush #38
    //   2751: ldc 134218240
    //   2753: iastore
    //   2754: dup
    //   2755: bipush #39
    //   2757: iconst_0
    //   2758: iastore
    //   2759: dup
    //   2760: bipush #40
    //   2762: sipush #512
    //   2765: iastore
    //   2766: dup
    //   2767: bipush #41
    //   2769: ldc 131080
    //   2771: iastore
    //   2772: dup
    //   2773: bipush #42
    //   2775: ldc 134349320
    //   2777: iastore
    //   2778: dup
    //   2779: bipush #43
    //   2781: ldc 134218240
    //   2783: iastore
    //   2784: dup
    //   2785: bipush #44
    //   2787: ldc 134217736
    //   2789: iastore
    //   2790: dup
    //   2791: bipush #45
    //   2793: sipush #512
    //   2796: iastore
    //   2797: dup
    //   2798: bipush #46
    //   2800: iconst_0
    //   2801: iastore
    //   2802: dup
    //   2803: bipush #47
    //   2805: ldc 134348808
    //   2807: iastore
    //   2808: dup
    //   2809: bipush #48
    //   2811: ldc 134218248
    //   2813: iastore
    //   2814: dup
    //   2815: bipush #49
    //   2817: ldc 131072
    //   2819: iastore
    //   2820: dup
    //   2821: bipush #50
    //   2823: ldc 134217728
    //   2825: iastore
    //   2826: dup
    //   2827: bipush #51
    //   2829: ldc 134349320
    //   2831: iastore
    //   2832: dup
    //   2833: bipush #52
    //   2835: bipush #8
    //   2837: iastore
    //   2838: dup
    //   2839: bipush #53
    //   2841: ldc 131592
    //   2843: iastore
    //   2844: dup
    //   2845: bipush #54
    //   2847: ldc 131584
    //   2849: iastore
    //   2850: dup
    //   2851: bipush #55
    //   2853: ldc 134217736
    //   2855: iastore
    //   2856: dup
    //   2857: bipush #56
    //   2859: ldc 134348800
    //   2861: iastore
    //   2862: dup
    //   2863: bipush #57
    //   2865: ldc 134218248
    //   2867: iastore
    //   2868: dup
    //   2869: bipush #58
    //   2871: sipush #520
    //   2874: iastore
    //   2875: dup
    //   2876: bipush #59
    //   2878: ldc 134348800
    //   2880: iastore
    //   2881: dup
    //   2882: bipush #60
    //   2884: ldc 131592
    //   2886: iastore
    //   2887: dup
    //   2888: bipush #61
    //   2890: bipush #8
    //   2892: iastore
    //   2893: dup
    //   2894: bipush #62
    //   2896: ldc 134348808
    //   2898: iastore
    //   2899: dup
    //   2900: bipush #63
    //   2902: ldc 131584
    //   2904: iastore
    //   2905: astore #8
    //   2907: bipush #64
    //   2909: newarray int
    //   2911: dup
    //   2912: iconst_0
    //   2913: ldc 8396801
    //   2915: iastore
    //   2916: dup
    //   2917: iconst_1
    //   2918: sipush #8321
    //   2921: iastore
    //   2922: dup
    //   2923: iconst_2
    //   2924: sipush #8321
    //   2927: iastore
    //   2928: dup
    //   2929: iconst_3
    //   2930: sipush #128
    //   2933: iastore
    //   2934: dup
    //   2935: iconst_4
    //   2936: ldc 8396928
    //   2938: iastore
    //   2939: dup
    //   2940: iconst_5
    //   2941: ldc 8388737
    //   2943: iastore
    //   2944: dup
    //   2945: bipush #6
    //   2947: ldc 8388609
    //   2949: iastore
    //   2950: dup
    //   2951: bipush #7
    //   2953: sipush #8193
    //   2956: iastore
    //   2957: dup
    //   2958: bipush #8
    //   2960: iconst_0
    //   2961: iastore
    //   2962: dup
    //   2963: bipush #9
    //   2965: ldc 8396800
    //   2967: iastore
    //   2968: dup
    //   2969: bipush #10
    //   2971: ldc 8396800
    //   2973: iastore
    //   2974: dup
    //   2975: bipush #11
    //   2977: ldc 8396929
    //   2979: iastore
    //   2980: dup
    //   2981: bipush #12
    //   2983: sipush #129
    //   2986: iastore
    //   2987: dup
    //   2988: bipush #13
    //   2990: iconst_0
    //   2991: iastore
    //   2992: dup
    //   2993: bipush #14
    //   2995: ldc 8388736
    //   2997: iastore
    //   2998: dup
    //   2999: bipush #15
    //   3001: ldc 8388609
    //   3003: iastore
    //   3004: dup
    //   3005: bipush #16
    //   3007: iconst_1
    //   3008: iastore
    //   3009: dup
    //   3010: bipush #17
    //   3012: sipush #8192
    //   3015: iastore
    //   3016: dup
    //   3017: bipush #18
    //   3019: ldc 8388608
    //   3021: iastore
    //   3022: dup
    //   3023: bipush #19
    //   3025: ldc 8396801
    //   3027: iastore
    //   3028: dup
    //   3029: bipush #20
    //   3031: sipush #128
    //   3034: iastore
    //   3035: dup
    //   3036: bipush #21
    //   3038: ldc 8388608
    //   3040: iastore
    //   3041: dup
    //   3042: bipush #22
    //   3044: sipush #8193
    //   3047: iastore
    //   3048: dup
    //   3049: bipush #23
    //   3051: sipush #8320
    //   3054: iastore
    //   3055: dup
    //   3056: bipush #24
    //   3058: ldc 8388737
    //   3060: iastore
    //   3061: dup
    //   3062: bipush #25
    //   3064: iconst_1
    //   3065: iastore
    //   3066: dup
    //   3067: bipush #26
    //   3069: sipush #8320
    //   3072: iastore
    //   3073: dup
    //   3074: bipush #27
    //   3076: ldc 8388736
    //   3078: iastore
    //   3079: dup
    //   3080: bipush #28
    //   3082: sipush #8192
    //   3085: iastore
    //   3086: dup
    //   3087: bipush #29
    //   3089: ldc 8396928
    //   3091: iastore
    //   3092: dup
    //   3093: bipush #30
    //   3095: ldc 8396929
    //   3097: iastore
    //   3098: dup
    //   3099: bipush #31
    //   3101: sipush #129
    //   3104: iastore
    //   3105: dup
    //   3106: bipush #32
    //   3108: ldc 8388736
    //   3110: iastore
    //   3111: dup
    //   3112: bipush #33
    //   3114: ldc 8388609
    //   3116: iastore
    //   3117: dup
    //   3118: bipush #34
    //   3120: ldc 8396800
    //   3122: iastore
    //   3123: dup
    //   3124: bipush #35
    //   3126: ldc 8396929
    //   3128: iastore
    //   3129: dup
    //   3130: bipush #36
    //   3132: sipush #129
    //   3135: iastore
    //   3136: dup
    //   3137: bipush #37
    //   3139: iconst_0
    //   3140: iastore
    //   3141: dup
    //   3142: bipush #38
    //   3144: iconst_0
    //   3145: iastore
    //   3146: dup
    //   3147: bipush #39
    //   3149: ldc 8396800
    //   3151: iastore
    //   3152: dup
    //   3153: bipush #40
    //   3155: sipush #8320
    //   3158: iastore
    //   3159: dup
    //   3160: bipush #41
    //   3162: ldc 8388736
    //   3164: iastore
    //   3165: dup
    //   3166: bipush #42
    //   3168: ldc 8388737
    //   3170: iastore
    //   3171: dup
    //   3172: bipush #43
    //   3174: iconst_1
    //   3175: iastore
    //   3176: dup
    //   3177: bipush #44
    //   3179: ldc 8396801
    //   3181: iastore
    //   3182: dup
    //   3183: bipush #45
    //   3185: sipush #8321
    //   3188: iastore
    //   3189: dup
    //   3190: bipush #46
    //   3192: sipush #8321
    //   3195: iastore
    //   3196: dup
    //   3197: bipush #47
    //   3199: sipush #128
    //   3202: iastore
    //   3203: dup
    //   3204: bipush #48
    //   3206: ldc 8396929
    //   3208: iastore
    //   3209: dup
    //   3210: bipush #49
    //   3212: sipush #129
    //   3215: iastore
    //   3216: dup
    //   3217: bipush #50
    //   3219: iconst_1
    //   3220: iastore
    //   3221: dup
    //   3222: bipush #51
    //   3224: sipush #8192
    //   3227: iastore
    //   3228: dup
    //   3229: bipush #52
    //   3231: ldc 8388609
    //   3233: iastore
    //   3234: dup
    //   3235: bipush #53
    //   3237: sipush #8193
    //   3240: iastore
    //   3241: dup
    //   3242: bipush #54
    //   3244: ldc 8396928
    //   3246: iastore
    //   3247: dup
    //   3248: bipush #55
    //   3250: ldc 8388737
    //   3252: iastore
    //   3253: dup
    //   3254: bipush #56
    //   3256: sipush #8193
    //   3259: iastore
    //   3260: dup
    //   3261: bipush #57
    //   3263: sipush #8320
    //   3266: iastore
    //   3267: dup
    //   3268: bipush #58
    //   3270: ldc 8388608
    //   3272: iastore
    //   3273: dup
    //   3274: bipush #59
    //   3276: ldc 8396801
    //   3278: iastore
    //   3279: dup
    //   3280: bipush #60
    //   3282: sipush #128
    //   3285: iastore
    //   3286: dup
    //   3287: bipush #61
    //   3289: ldc 8388608
    //   3291: iastore
    //   3292: dup
    //   3293: bipush #62
    //   3295: sipush #8192
    //   3298: iastore
    //   3299: dup
    //   3300: bipush #63
    //   3302: ldc 8396928
    //   3304: iastore
    //   3305: astore #9
    //   3307: bipush #64
    //   3309: newarray int
    //   3311: dup
    //   3312: iconst_0
    //   3313: sipush #256
    //   3316: iastore
    //   3317: dup
    //   3318: iconst_1
    //   3319: ldc 34078976
    //   3321: iastore
    //   3322: dup
    //   3323: iconst_2
    //   3324: ldc 34078720
    //   3326: iastore
    //   3327: dup
    //   3328: iconst_3
    //   3329: ldc 1107296512
    //   3331: iastore
    //   3332: dup
    //   3333: iconst_4
    //   3334: ldc 524288
    //   3336: iastore
    //   3337: dup
    //   3338: iconst_5
    //   3339: sipush #256
    //   3342: iastore
    //   3343: dup
    //   3344: bipush #6
    //   3346: ldc 1073741824
    //   3348: iastore
    //   3349: dup
    //   3350: bipush #7
    //   3352: ldc 34078720
    //   3354: iastore
    //   3355: dup
    //   3356: bipush #8
    //   3358: ldc 1074266368
    //   3360: iastore
    //   3361: dup
    //   3362: bipush #9
    //   3364: ldc 524288
    //   3366: iastore
    //   3367: dup
    //   3368: bipush #10
    //   3370: ldc 33554688
    //   3372: iastore
    //   3373: dup
    //   3374: bipush #11
    //   3376: ldc 1074266368
    //   3378: iastore
    //   3379: dup
    //   3380: bipush #12
    //   3382: ldc 1107296512
    //   3384: iastore
    //   3385: dup
    //   3386: bipush #13
    //   3388: ldc 1107820544
    //   3390: iastore
    //   3391: dup
    //   3392: bipush #14
    //   3394: ldc 524544
    //   3396: iastore
    //   3397: dup
    //   3398: bipush #15
    //   3400: ldc 1073741824
    //   3402: iastore
    //   3403: dup
    //   3404: bipush #16
    //   3406: ldc 33554432
    //   3408: iastore
    //   3409: dup
    //   3410: bipush #17
    //   3412: ldc 1074266112
    //   3414: iastore
    //   3415: dup
    //   3416: bipush #18
    //   3418: ldc 1074266112
    //   3420: iastore
    //   3421: dup
    //   3422: bipush #19
    //   3424: iconst_0
    //   3425: iastore
    //   3426: dup
    //   3427: bipush #20
    //   3429: ldc 1073742080
    //   3431: iastore
    //   3432: dup
    //   3433: bipush #21
    //   3435: ldc 1107820800
    //   3437: iastore
    //   3438: dup
    //   3439: bipush #22
    //   3441: ldc 1107820800
    //   3443: iastore
    //   3444: dup
    //   3445: bipush #23
    //   3447: ldc 33554688
    //   3449: iastore
    //   3450: dup
    //   3451: bipush #24
    //   3453: ldc 1107820544
    //   3455: iastore
    //   3456: dup
    //   3457: bipush #25
    //   3459: ldc 1073742080
    //   3461: iastore
    //   3462: dup
    //   3463: bipush #26
    //   3465: iconst_0
    //   3466: iastore
    //   3467: dup
    //   3468: bipush #27
    //   3470: ldc 1107296256
    //   3472: iastore
    //   3473: dup
    //   3474: bipush #28
    //   3476: ldc 34078976
    //   3478: iastore
    //   3479: dup
    //   3480: bipush #29
    //   3482: ldc 33554432
    //   3484: iastore
    //   3485: dup
    //   3486: bipush #30
    //   3488: ldc 1107296256
    //   3490: iastore
    //   3491: dup
    //   3492: bipush #31
    //   3494: ldc 524544
    //   3496: iastore
    //   3497: dup
    //   3498: bipush #32
    //   3500: ldc 524288
    //   3502: iastore
    //   3503: dup
    //   3504: bipush #33
    //   3506: ldc 1107296512
    //   3508: iastore
    //   3509: dup
    //   3510: bipush #34
    //   3512: sipush #256
    //   3515: iastore
    //   3516: dup
    //   3517: bipush #35
    //   3519: ldc 33554432
    //   3521: iastore
    //   3522: dup
    //   3523: bipush #36
    //   3525: ldc 1073741824
    //   3527: iastore
    //   3528: dup
    //   3529: bipush #37
    //   3531: ldc 34078720
    //   3533: iastore
    //   3534: dup
    //   3535: bipush #38
    //   3537: ldc 1107296512
    //   3539: iastore
    //   3540: dup
    //   3541: bipush #39
    //   3543: ldc 1074266368
    //   3545: iastore
    //   3546: dup
    //   3547: bipush #40
    //   3549: ldc 33554688
    //   3551: iastore
    //   3552: dup
    //   3553: bipush #41
    //   3555: ldc 1073741824
    //   3557: iastore
    //   3558: dup
    //   3559: bipush #42
    //   3561: ldc 1107820544
    //   3563: iastore
    //   3564: dup
    //   3565: bipush #43
    //   3567: ldc 34078976
    //   3569: iastore
    //   3570: dup
    //   3571: bipush #44
    //   3573: ldc 1074266368
    //   3575: iastore
    //   3576: dup
    //   3577: bipush #45
    //   3579: sipush #256
    //   3582: iastore
    //   3583: dup
    //   3584: bipush #46
    //   3586: ldc 33554432
    //   3588: iastore
    //   3589: dup
    //   3590: bipush #47
    //   3592: ldc 1107820544
    //   3594: iastore
    //   3595: dup
    //   3596: bipush #48
    //   3598: ldc 1107820800
    //   3600: iastore
    //   3601: dup
    //   3602: bipush #49
    //   3604: ldc 524544
    //   3606: iastore
    //   3607: dup
    //   3608: bipush #50
    //   3610: ldc 1107296256
    //   3612: iastore
    //   3613: dup
    //   3614: bipush #51
    //   3616: ldc 1107820800
    //   3618: iastore
    //   3619: dup
    //   3620: bipush #52
    //   3622: ldc 34078720
    //   3624: iastore
    //   3625: dup
    //   3626: bipush #53
    //   3628: iconst_0
    //   3629: iastore
    //   3630: dup
    //   3631: bipush #54
    //   3633: ldc 1074266112
    //   3635: iastore
    //   3636: dup
    //   3637: bipush #55
    //   3639: ldc 1107296256
    //   3641: iastore
    //   3642: dup
    //   3643: bipush #56
    //   3645: ldc 524544
    //   3647: iastore
    //   3648: dup
    //   3649: bipush #57
    //   3651: ldc 33554688
    //   3653: iastore
    //   3654: dup
    //   3655: bipush #58
    //   3657: ldc 1073742080
    //   3659: iastore
    //   3660: dup
    //   3661: bipush #59
    //   3663: ldc 524288
    //   3665: iastore
    //   3666: dup
    //   3667: bipush #60
    //   3669: iconst_0
    //   3670: iastore
    //   3671: dup
    //   3672: bipush #61
    //   3674: ldc 1074266112
    //   3676: iastore
    //   3677: dup
    //   3678: bipush #62
    //   3680: ldc 34078976
    //   3682: iastore
    //   3683: dup
    //   3684: bipush #63
    //   3686: ldc 1073742080
    //   3688: iastore
    //   3689: astore #10
    //   3691: bipush #64
    //   3693: newarray int
    //   3695: dup
    //   3696: iconst_0
    //   3697: ldc 536870928
    //   3699: iastore
    //   3700: dup
    //   3701: iconst_1
    //   3702: ldc 541065216
    //   3704: iastore
    //   3705: dup
    //   3706: iconst_2
    //   3707: sipush #16384
    //   3710: iastore
    //   3711: dup
    //   3712: iconst_3
    //   3713: ldc 541081616
    //   3715: iastore
    //   3716: dup
    //   3717: iconst_4
    //   3718: ldc 541065216
    //   3720: iastore
    //   3721: dup
    //   3722: iconst_5
    //   3723: bipush #16
    //   3725: iastore
    //   3726: dup
    //   3727: bipush #6
    //   3729: ldc 541081616
    //   3731: iastore
    //   3732: dup
    //   3733: bipush #7
    //   3735: ldc 4194304
    //   3737: iastore
    //   3738: dup
    //   3739: bipush #8
    //   3741: ldc 536887296
    //   3743: iastore
    //   3744: dup
    //   3745: bipush #9
    //   3747: ldc 4210704
    //   3749: iastore
    //   3750: dup
    //   3751: bipush #10
    //   3753: ldc 4194304
    //   3755: iastore
    //   3756: dup
    //   3757: bipush #11
    //   3759: ldc 536870928
    //   3761: iastore
    //   3762: dup
    //   3763: bipush #12
    //   3765: ldc 4194320
    //   3767: iastore
    //   3768: dup
    //   3769: bipush #13
    //   3771: ldc 536887296
    //   3773: iastore
    //   3774: dup
    //   3775: bipush #14
    //   3777: ldc 536870912
    //   3779: iastore
    //   3780: dup
    //   3781: bipush #15
    //   3783: sipush #16400
    //   3786: iastore
    //   3787: dup
    //   3788: bipush #16
    //   3790: iconst_0
    //   3791: iastore
    //   3792: dup
    //   3793: bipush #17
    //   3795: ldc 4194320
    //   3797: iastore
    //   3798: dup
    //   3799: bipush #18
    //   3801: ldc 536887312
    //   3803: iastore
    //   3804: dup
    //   3805: bipush #19
    //   3807: sipush #16384
    //   3810: iastore
    //   3811: dup
    //   3812: bipush #20
    //   3814: ldc 4210688
    //   3816: iastore
    //   3817: dup
    //   3818: bipush #21
    //   3820: ldc 536887312
    //   3822: iastore
    //   3823: dup
    //   3824: bipush #22
    //   3826: bipush #16
    //   3828: iastore
    //   3829: dup
    //   3830: bipush #23
    //   3832: ldc 541065232
    //   3834: iastore
    //   3835: dup
    //   3836: bipush #24
    //   3838: ldc 541065232
    //   3840: iastore
    //   3841: dup
    //   3842: bipush #25
    //   3844: iconst_0
    //   3845: iastore
    //   3846: dup
    //   3847: bipush #26
    //   3849: ldc 4210704
    //   3851: iastore
    //   3852: dup
    //   3853: bipush #27
    //   3855: ldc 541081600
    //   3857: iastore
    //   3858: dup
    //   3859: bipush #28
    //   3861: sipush #16400
    //   3864: iastore
    //   3865: dup
    //   3866: bipush #29
    //   3868: ldc 4210688
    //   3870: iastore
    //   3871: dup
    //   3872: bipush #30
    //   3874: ldc 541081600
    //   3876: iastore
    //   3877: dup
    //   3878: bipush #31
    //   3880: ldc 536870912
    //   3882: iastore
    //   3883: dup
    //   3884: bipush #32
    //   3886: ldc 536887296
    //   3888: iastore
    //   3889: dup
    //   3890: bipush #33
    //   3892: bipush #16
    //   3894: iastore
    //   3895: dup
    //   3896: bipush #34
    //   3898: ldc 541065232
    //   3900: iastore
    //   3901: dup
    //   3902: bipush #35
    //   3904: ldc 4210688
    //   3906: iastore
    //   3907: dup
    //   3908: bipush #36
    //   3910: ldc 541081616
    //   3912: iastore
    //   3913: dup
    //   3914: bipush #37
    //   3916: ldc 4194304
    //   3918: iastore
    //   3919: dup
    //   3920: bipush #38
    //   3922: sipush #16400
    //   3925: iastore
    //   3926: dup
    //   3927: bipush #39
    //   3929: ldc 536870928
    //   3931: iastore
    //   3932: dup
    //   3933: bipush #40
    //   3935: ldc 4194304
    //   3937: iastore
    //   3938: dup
    //   3939: bipush #41
    //   3941: ldc 536887296
    //   3943: iastore
    //   3944: dup
    //   3945: bipush #42
    //   3947: ldc 536870912
    //   3949: iastore
    //   3950: dup
    //   3951: bipush #43
    //   3953: sipush #16400
    //   3956: iastore
    //   3957: dup
    //   3958: bipush #44
    //   3960: ldc 536870928
    //   3962: iastore
    //   3963: dup
    //   3964: bipush #45
    //   3966: ldc 541081616
    //   3968: iastore
    //   3969: dup
    //   3970: bipush #46
    //   3972: ldc 4210688
    //   3974: iastore
    //   3975: dup
    //   3976: bipush #47
    //   3978: ldc 541065216
    //   3980: iastore
    //   3981: dup
    //   3982: bipush #48
    //   3984: ldc 4210704
    //   3986: iastore
    //   3987: dup
    //   3988: bipush #49
    //   3990: ldc 541081600
    //   3992: iastore
    //   3993: dup
    //   3994: bipush #50
    //   3996: iconst_0
    //   3997: iastore
    //   3998: dup
    //   3999: bipush #51
    //   4001: ldc 541065232
    //   4003: iastore
    //   4004: dup
    //   4005: bipush #52
    //   4007: bipush #16
    //   4009: iastore
    //   4010: dup
    //   4011: bipush #53
    //   4013: sipush #16384
    //   4016: iastore
    //   4017: dup
    //   4018: bipush #54
    //   4020: ldc 541065216
    //   4022: iastore
    //   4023: dup
    //   4024: bipush #55
    //   4026: ldc 4210704
    //   4028: iastore
    //   4029: dup
    //   4030: bipush #56
    //   4032: sipush #16384
    //   4035: iastore
    //   4036: dup
    //   4037: bipush #57
    //   4039: ldc 4194320
    //   4041: iastore
    //   4042: dup
    //   4043: bipush #58
    //   4045: ldc 536887312
    //   4047: iastore
    //   4048: dup
    //   4049: bipush #59
    //   4051: iconst_0
    //   4052: iastore
    //   4053: dup
    //   4054: bipush #60
    //   4056: ldc 541081600
    //   4058: iastore
    //   4059: dup
    //   4060: bipush #61
    //   4062: ldc 536870912
    //   4064: iastore
    //   4065: dup
    //   4066: bipush #62
    //   4068: ldc 4194320
    //   4070: iastore
    //   4071: dup
    //   4072: bipush #63
    //   4074: ldc 536887312
    //   4076: iastore
    //   4077: astore #11
    //   4079: bipush #64
    //   4081: newarray int
    //   4083: dup
    //   4084: iconst_0
    //   4085: ldc 2097152
    //   4087: iastore
    //   4088: dup
    //   4089: iconst_1
    //   4090: ldc 69206018
    //   4092: iastore
    //   4093: dup
    //   4094: iconst_2
    //   4095: ldc 67110914
    //   4097: iastore
    //   4098: dup
    //   4099: iconst_3
    //   4100: iconst_0
    //   4101: iastore
    //   4102: dup
    //   4103: iconst_4
    //   4104: sipush #2048
    //   4107: iastore
    //   4108: dup
    //   4109: iconst_5
    //   4110: ldc 67110914
    //   4112: iastore
    //   4113: dup
    //   4114: bipush #6
    //   4116: ldc 2099202
    //   4118: iastore
    //   4119: dup
    //   4120: bipush #7
    //   4122: ldc 69208064
    //   4124: iastore
    //   4125: dup
    //   4126: bipush #8
    //   4128: ldc 69208066
    //   4130: iastore
    //   4131: dup
    //   4132: bipush #9
    //   4134: ldc 2097152
    //   4136: iastore
    //   4137: dup
    //   4138: bipush #10
    //   4140: iconst_0
    //   4141: iastore
    //   4142: dup
    //   4143: bipush #11
    //   4145: ldc 67108866
    //   4147: iastore
    //   4148: dup
    //   4149: bipush #12
    //   4151: iconst_2
    //   4152: iastore
    //   4153: dup
    //   4154: bipush #13
    //   4156: ldc 67108864
    //   4158: iastore
    //   4159: dup
    //   4160: bipush #14
    //   4162: ldc 69206018
    //   4164: iastore
    //   4165: dup
    //   4166: bipush #15
    //   4168: sipush #2050
    //   4171: iastore
    //   4172: dup
    //   4173: bipush #16
    //   4175: ldc 67110912
    //   4177: iastore
    //   4178: dup
    //   4179: bipush #17
    //   4181: ldc 2099202
    //   4183: iastore
    //   4184: dup
    //   4185: bipush #18
    //   4187: ldc 2097154
    //   4189: iastore
    //   4190: dup
    //   4191: bipush #19
    //   4193: ldc 67110912
    //   4195: iastore
    //   4196: dup
    //   4197: bipush #20
    //   4199: ldc 67108866
    //   4201: iastore
    //   4202: dup
    //   4203: bipush #21
    //   4205: ldc 69206016
    //   4207: iastore
    //   4208: dup
    //   4209: bipush #22
    //   4211: ldc 69208064
    //   4213: iastore
    //   4214: dup
    //   4215: bipush #23
    //   4217: ldc 2097154
    //   4219: iastore
    //   4220: dup
    //   4221: bipush #24
    //   4223: ldc 69206016
    //   4225: iastore
    //   4226: dup
    //   4227: bipush #25
    //   4229: sipush #2048
    //   4232: iastore
    //   4233: dup
    //   4234: bipush #26
    //   4236: sipush #2050
    //   4239: iastore
    //   4240: dup
    //   4241: bipush #27
    //   4243: ldc 69208066
    //   4245: iastore
    //   4246: dup
    //   4247: bipush #28
    //   4249: ldc 2099200
    //   4251: iastore
    //   4252: dup
    //   4253: bipush #29
    //   4255: iconst_2
    //   4256: iastore
    //   4257: dup
    //   4258: bipush #30
    //   4260: ldc 67108864
    //   4262: iastore
    //   4263: dup
    //   4264: bipush #31
    //   4266: ldc 2099200
    //   4268: iastore
    //   4269: dup
    //   4270: bipush #32
    //   4272: ldc 67108864
    //   4274: iastore
    //   4275: dup
    //   4276: bipush #33
    //   4278: ldc 2099200
    //   4280: iastore
    //   4281: dup
    //   4282: bipush #34
    //   4284: ldc 2097152
    //   4286: iastore
    //   4287: dup
    //   4288: bipush #35
    //   4290: ldc 67110914
    //   4292: iastore
    //   4293: dup
    //   4294: bipush #36
    //   4296: ldc 67110914
    //   4298: iastore
    //   4299: dup
    //   4300: bipush #37
    //   4302: ldc 69206018
    //   4304: iastore
    //   4305: dup
    //   4306: bipush #38
    //   4308: ldc 69206018
    //   4310: iastore
    //   4311: dup
    //   4312: bipush #39
    //   4314: iconst_2
    //   4315: iastore
    //   4316: dup
    //   4317: bipush #40
    //   4319: ldc 2097154
    //   4321: iastore
    //   4322: dup
    //   4323: bipush #41
    //   4325: ldc 67108864
    //   4327: iastore
    //   4328: dup
    //   4329: bipush #42
    //   4331: ldc 67110912
    //   4333: iastore
    //   4334: dup
    //   4335: bipush #43
    //   4337: ldc 2097152
    //   4339: iastore
    //   4340: dup
    //   4341: bipush #44
    //   4343: ldc 69208064
    //   4345: iastore
    //   4346: dup
    //   4347: bipush #45
    //   4349: sipush #2050
    //   4352: iastore
    //   4353: dup
    //   4354: bipush #46
    //   4356: ldc 2099202
    //   4358: iastore
    //   4359: dup
    //   4360: bipush #47
    //   4362: ldc 69208064
    //   4364: iastore
    //   4365: dup
    //   4366: bipush #48
    //   4368: sipush #2050
    //   4371: iastore
    //   4372: dup
    //   4373: bipush #49
    //   4375: ldc 67108866
    //   4377: iastore
    //   4378: dup
    //   4379: bipush #50
    //   4381: ldc 69208066
    //   4383: iastore
    //   4384: dup
    //   4385: bipush #51
    //   4387: ldc 69206016
    //   4389: iastore
    //   4390: dup
    //   4391: bipush #52
    //   4393: ldc 2099200
    //   4395: iastore
    //   4396: dup
    //   4397: bipush #53
    //   4399: iconst_0
    //   4400: iastore
    //   4401: dup
    //   4402: bipush #54
    //   4404: iconst_2
    //   4405: iastore
    //   4406: dup
    //   4407: bipush #55
    //   4409: ldc 69208066
    //   4411: iastore
    //   4412: dup
    //   4413: bipush #56
    //   4415: iconst_0
    //   4416: iastore
    //   4417: dup
    //   4418: bipush #57
    //   4420: ldc 2099202
    //   4422: iastore
    //   4423: dup
    //   4424: bipush #58
    //   4426: ldc 69206016
    //   4428: iastore
    //   4429: dup
    //   4430: bipush #59
    //   4432: sipush #2048
    //   4435: iastore
    //   4436: dup
    //   4437: bipush #60
    //   4439: ldc 67108866
    //   4441: iastore
    //   4442: dup
    //   4443: bipush #61
    //   4445: ldc 67110912
    //   4447: iastore
    //   4448: dup
    //   4449: bipush #62
    //   4451: sipush #2048
    //   4454: iastore
    //   4455: dup
    //   4456: bipush #63
    //   4458: ldc 2097154
    //   4460: iastore
    //   4461: astore #12
    //   4463: bipush #64
    //   4465: newarray int
    //   4467: dup
    //   4468: iconst_0
    //   4469: ldc 268439616
    //   4471: iastore
    //   4472: dup
    //   4473: iconst_1
    //   4474: sipush #4096
    //   4477: iastore
    //   4478: dup
    //   4479: iconst_2
    //   4480: ldc 262144
    //   4482: iastore
    //   4483: dup
    //   4484: iconst_3
    //   4485: ldc 268701760
    //   4487: iastore
    //   4488: dup
    //   4489: iconst_4
    //   4490: ldc 268435456
    //   4492: iastore
    //   4493: dup
    //   4494: iconst_5
    //   4495: ldc 268439616
    //   4497: iastore
    //   4498: dup
    //   4499: bipush #6
    //   4501: bipush #64
    //   4503: iastore
    //   4504: dup
    //   4505: bipush #7
    //   4507: ldc 268435456
    //   4509: iastore
    //   4510: dup
    //   4511: bipush #8
    //   4513: ldc 262208
    //   4515: iastore
    //   4516: dup
    //   4517: bipush #9
    //   4519: ldc 268697600
    //   4521: iastore
    //   4522: dup
    //   4523: bipush #10
    //   4525: ldc 268701760
    //   4527: iastore
    //   4528: dup
    //   4529: bipush #11
    //   4531: ldc 266240
    //   4533: iastore
    //   4534: dup
    //   4535: bipush #12
    //   4537: ldc 268701696
    //   4539: iastore
    //   4540: dup
    //   4541: bipush #13
    //   4543: ldc 266304
    //   4545: iastore
    //   4546: dup
    //   4547: bipush #14
    //   4549: sipush #4096
    //   4552: iastore
    //   4553: dup
    //   4554: bipush #15
    //   4556: bipush #64
    //   4558: iastore
    //   4559: dup
    //   4560: bipush #16
    //   4562: ldc 268697600
    //   4564: iastore
    //   4565: dup
    //   4566: bipush #17
    //   4568: ldc 268435520
    //   4570: iastore
    //   4571: dup
    //   4572: bipush #18
    //   4574: ldc 268439552
    //   4576: iastore
    //   4577: dup
    //   4578: bipush #19
    //   4580: sipush #4160
    //   4583: iastore
    //   4584: dup
    //   4585: bipush #20
    //   4587: ldc 266240
    //   4589: iastore
    //   4590: dup
    //   4591: bipush #21
    //   4593: ldc 262208
    //   4595: iastore
    //   4596: dup
    //   4597: bipush #22
    //   4599: ldc 268697664
    //   4601: iastore
    //   4602: dup
    //   4603: bipush #23
    //   4605: ldc 268701696
    //   4607: iastore
    //   4608: dup
    //   4609: bipush #24
    //   4611: sipush #4160
    //   4614: iastore
    //   4615: dup
    //   4616: bipush #25
    //   4618: iconst_0
    //   4619: iastore
    //   4620: dup
    //   4621: bipush #26
    //   4623: iconst_0
    //   4624: iastore
    //   4625: dup
    //   4626: bipush #27
    //   4628: ldc 268697664
    //   4630: iastore
    //   4631: dup
    //   4632: bipush #28
    //   4634: ldc 268435520
    //   4636: iastore
    //   4637: dup
    //   4638: bipush #29
    //   4640: ldc 268439552
    //   4642: iastore
    //   4643: dup
    //   4644: bipush #30
    //   4646: ldc 266304
    //   4648: iastore
    //   4649: dup
    //   4650: bipush #31
    //   4652: ldc 262144
    //   4654: iastore
    //   4655: dup
    //   4656: bipush #32
    //   4658: ldc 266304
    //   4660: iastore
    //   4661: dup
    //   4662: bipush #33
    //   4664: ldc 262144
    //   4666: iastore
    //   4667: dup
    //   4668: bipush #34
    //   4670: ldc 268701696
    //   4672: iastore
    //   4673: dup
    //   4674: bipush #35
    //   4676: sipush #4096
    //   4679: iastore
    //   4680: dup
    //   4681: bipush #36
    //   4683: bipush #64
    //   4685: iastore
    //   4686: dup
    //   4687: bipush #37
    //   4689: ldc 268697664
    //   4691: iastore
    //   4692: dup
    //   4693: bipush #38
    //   4695: sipush #4096
    //   4698: iastore
    //   4699: dup
    //   4700: bipush #39
    //   4702: ldc 266304
    //   4704: iastore
    //   4705: dup
    //   4706: bipush #40
    //   4708: ldc 268439552
    //   4710: iastore
    //   4711: dup
    //   4712: bipush #41
    //   4714: bipush #64
    //   4716: iastore
    //   4717: dup
    //   4718: bipush #42
    //   4720: ldc 268435520
    //   4722: iastore
    //   4723: dup
    //   4724: bipush #43
    //   4726: ldc 268697600
    //   4728: iastore
    //   4729: dup
    //   4730: bipush #44
    //   4732: ldc 268697664
    //   4734: iastore
    //   4735: dup
    //   4736: bipush #45
    //   4738: ldc 268435456
    //   4740: iastore
    //   4741: dup
    //   4742: bipush #46
    //   4744: ldc 262144
    //   4746: iastore
    //   4747: dup
    //   4748: bipush #47
    //   4750: ldc 268439616
    //   4752: iastore
    //   4753: dup
    //   4754: bipush #48
    //   4756: iconst_0
    //   4757: iastore
    //   4758: dup
    //   4759: bipush #49
    //   4761: ldc 268701760
    //   4763: iastore
    //   4764: dup
    //   4765: bipush #50
    //   4767: ldc 262208
    //   4769: iastore
    //   4770: dup
    //   4771: bipush #51
    //   4773: ldc 268435520
    //   4775: iastore
    //   4776: dup
    //   4777: bipush #52
    //   4779: ldc 268697600
    //   4781: iastore
    //   4782: dup
    //   4783: bipush #53
    //   4785: ldc 268439552
    //   4787: iastore
    //   4788: dup
    //   4789: bipush #54
    //   4791: ldc 268439616
    //   4793: iastore
    //   4794: dup
    //   4795: bipush #55
    //   4797: iconst_0
    //   4798: iastore
    //   4799: dup
    //   4800: bipush #56
    //   4802: ldc 268701760
    //   4804: iastore
    //   4805: dup
    //   4806: bipush #57
    //   4808: ldc 266240
    //   4810: iastore
    //   4811: dup
    //   4812: bipush #58
    //   4814: ldc 266240
    //   4816: iastore
    //   4817: dup
    //   4818: bipush #59
    //   4820: sipush #4160
    //   4823: iastore
    //   4824: dup
    //   4825: bipush #60
    //   4827: sipush #4160
    //   4830: iastore
    //   4831: dup
    //   4832: bipush #61
    //   4834: ldc 262208
    //   4836: iastore
    //   4837: dup
    //   4838: bipush #62
    //   4840: ldc 268435456
    //   4842: iastore
    //   4843: dup
    //   4844: bipush #63
    //   4846: ldc 268701696
    //   4848: iastore
    //   4849: astore #13
    //   4851: aload_3
    //   4852: arraylength
    //   4853: istore #14
    //   4855: iload #14
    //   4857: bipush #8
    //   4859: irem
    //   4860: ifeq -> 4884
    //   4863: new java/lang/Exception
    //   4866: dup
    //   4867: sipush #-6333
    //   4870: sipush #-4608
    //   4873: invokestatic a : (II)Ljava/lang/String;
    //   4876: invokespecial <init> : (Ljava/lang/String;)V
    //   4879: athrow
    //   4880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4883: athrow
    //   4884: iconst_2
    //   4885: newarray int
    //   4887: astore #15
    //   4889: iload #14
    //   4891: newarray byte
    //   4893: astore #16
    //   4895: iload #14
    //   4897: bipush #8
    //   4899: idiv
    //   4900: istore #17
    //   4902: iconst_0
    //   4903: istore #18
    //   4905: iload #18
    //   4907: iload #17
    //   4909: if_icmpge -> 5823
    //   4912: iload #18
    //   4914: bipush #8
    //   4916: imul
    //   4917: istore #19
    //   4919: iconst_0
    //   4920: istore #20
    //   4922: iload #20
    //   4924: iconst_2
    //   4925: if_icmpge -> 5010
    //   4928: aload #15
    //   4930: iload #20
    //   4932: aload_3
    //   4933: iload #19
    //   4935: iload #20
    //   4937: iconst_4
    //   4938: imul
    //   4939: iadd
    //   4940: baload
    //   4941: sipush #255
    //   4944: iand
    //   4945: bipush #24
    //   4947: ishl
    //   4948: aload_3
    //   4949: iload #19
    //   4951: iload #20
    //   4953: iconst_4
    //   4954: imul
    //   4955: iadd
    //   4956: iconst_1
    //   4957: iadd
    //   4958: baload
    //   4959: sipush #255
    //   4962: iand
    //   4963: bipush #16
    //   4965: ishl
    //   4966: ior
    //   4967: aload_3
    //   4968: iload #19
    //   4970: iload #20
    //   4972: iconst_4
    //   4973: imul
    //   4974: iadd
    //   4975: iconst_2
    //   4976: iadd
    //   4977: baload
    //   4978: sipush #255
    //   4981: iand
    //   4982: bipush #8
    //   4984: ishl
    //   4985: ior
    //   4986: aload_3
    //   4987: iload #19
    //   4989: iload #20
    //   4991: iconst_4
    //   4992: imul
    //   4993: iadd
    //   4994: iconst_3
    //   4995: iadd
    //   4996: baload
    //   4997: sipush #255
    //   5000: iand
    //   5001: ior
    //   5002: iastore
    //   5003: iinc #20, 1
    //   5006: iload_2
    //   5007: ifne -> 4922
    //   5010: iconst_0
    //   5011: istore #25
    //   5013: aload #15
    //   5015: iconst_0
    //   5016: iaload
    //   5017: istore #23
    //   5019: aload #15
    //   5021: iconst_1
    //   5022: iaload
    //   5023: istore #22
    //   5025: iload #23
    //   5027: iconst_4
    //   5028: iushr
    //   5029: iload #22
    //   5031: ixor
    //   5032: ldc 252645135
    //   5034: iand
    //   5035: istore #21
    //   5037: iload #22
    //   5039: iload #21
    //   5041: ixor
    //   5042: istore #22
    //   5044: iload #23
    //   5046: iload #21
    //   5048: iconst_4
    //   5049: ishl
    //   5050: ixor
    //   5051: istore #23
    //   5053: iload #23
    //   5055: bipush #16
    //   5057: iushr
    //   5058: iload #22
    //   5060: ixor
    //   5061: ldc 65535
    //   5063: iand
    //   5064: istore #21
    //   5066: iload #22
    //   5068: iload #21
    //   5070: ixor
    //   5071: istore #22
    //   5073: iload #23
    //   5075: iload #21
    //   5077: bipush #16
    //   5079: ishl
    //   5080: ixor
    //   5081: istore #23
    //   5083: iload #22
    //   5085: iconst_2
    //   5086: iushr
    //   5087: iload #23
    //   5089: ixor
    //   5090: ldc 858993459
    //   5092: iand
    //   5093: istore #21
    //   5095: iload #23
    //   5097: iload #21
    //   5099: ixor
    //   5100: istore #23
    //   5102: iload #22
    //   5104: iload #21
    //   5106: iconst_2
    //   5107: ishl
    //   5108: ixor
    //   5109: istore #22
    //   5111: iload #22
    //   5113: bipush #8
    //   5115: iushr
    //   5116: iload #23
    //   5118: ixor
    //   5119: ldc 16711935
    //   5121: iand
    //   5122: istore #21
    //   5124: iload #23
    //   5126: iload #21
    //   5128: ixor
    //   5129: istore #23
    //   5131: iload #22
    //   5133: iload #21
    //   5135: bipush #8
    //   5137: ishl
    //   5138: ixor
    //   5139: istore #22
    //   5141: iload #22
    //   5143: iconst_1
    //   5144: ishl
    //   5145: iload #22
    //   5147: bipush #31
    //   5149: iushr
    //   5150: iconst_1
    //   5151: iand
    //   5152: ior
    //   5153: istore #22
    //   5155: iload #23
    //   5157: iload #22
    //   5159: ixor
    //   5160: ldc -1431655766
    //   5162: iand
    //   5163: istore #21
    //   5165: iload #23
    //   5167: iload #21
    //   5169: ixor
    //   5170: istore #23
    //   5172: iload #22
    //   5174: iload #21
    //   5176: ixor
    //   5177: istore #22
    //   5179: iload #23
    //   5181: iconst_1
    //   5182: ishl
    //   5183: iload #23
    //   5185: bipush #31
    //   5187: iushr
    //   5188: iconst_1
    //   5189: iand
    //   5190: ior
    //   5191: istore #23
    //   5193: iconst_0
    //   5194: istore #24
    //   5196: iload #24
    //   5198: bipush #8
    //   5200: if_icmpge -> 5538
    //   5203: iload #22
    //   5205: bipush #28
    //   5207: ishl
    //   5208: iload #22
    //   5210: iconst_4
    //   5211: iushr
    //   5212: ior
    //   5213: istore #21
    //   5215: iload #21
    //   5217: aload #5
    //   5219: iload #25
    //   5221: iinc #25, 1
    //   5224: iaload
    //   5225: ixor
    //   5226: istore #21
    //   5228: aload #12
    //   5230: iload #21
    //   5232: bipush #63
    //   5234: iand
    //   5235: iaload
    //   5236: istore #20
    //   5238: iload #20
    //   5240: aload #10
    //   5242: iload #21
    //   5244: bipush #8
    //   5246: iushr
    //   5247: bipush #63
    //   5249: iand
    //   5250: iaload
    //   5251: ior
    //   5252: istore #20
    //   5254: iload #20
    //   5256: aload #8
    //   5258: iload #21
    //   5260: bipush #16
    //   5262: iushr
    //   5263: bipush #63
    //   5265: iand
    //   5266: iaload
    //   5267: ior
    //   5268: istore #20
    //   5270: iload #20
    //   5272: aload #6
    //   5274: iload #21
    //   5276: bipush #24
    //   5278: iushr
    //   5279: bipush #63
    //   5281: iand
    //   5282: iaload
    //   5283: ior
    //   5284: istore #20
    //   5286: iload #22
    //   5288: aload #5
    //   5290: iload #25
    //   5292: iinc #25, 1
    //   5295: iaload
    //   5296: ixor
    //   5297: istore #21
    //   5299: iload #20
    //   5301: aload #13
    //   5303: iload #21
    //   5305: bipush #63
    //   5307: iand
    //   5308: iaload
    //   5309: ior
    //   5310: istore #20
    //   5312: iload #20
    //   5314: aload #11
    //   5316: iload #21
    //   5318: bipush #8
    //   5320: iushr
    //   5321: bipush #63
    //   5323: iand
    //   5324: iaload
    //   5325: ior
    //   5326: istore #20
    //   5328: iload #20
    //   5330: aload #9
    //   5332: iload #21
    //   5334: bipush #16
    //   5336: iushr
    //   5337: bipush #63
    //   5339: iand
    //   5340: iaload
    //   5341: ior
    //   5342: istore #20
    //   5344: iload #20
    //   5346: aload #7
    //   5348: iload #21
    //   5350: bipush #24
    //   5352: iushr
    //   5353: bipush #63
    //   5355: iand
    //   5356: iaload
    //   5357: ior
    //   5358: istore #20
    //   5360: iload #23
    //   5362: iload #20
    //   5364: ixor
    //   5365: istore #23
    //   5367: iload #23
    //   5369: bipush #28
    //   5371: ishl
    //   5372: iload #23
    //   5374: iconst_4
    //   5375: iushr
    //   5376: ior
    //   5377: istore #21
    //   5379: iload #21
    //   5381: aload #5
    //   5383: iload #25
    //   5385: iinc #25, 1
    //   5388: iaload
    //   5389: ixor
    //   5390: istore #21
    //   5392: aload #12
    //   5394: iload #21
    //   5396: bipush #63
    //   5398: iand
    //   5399: iaload
    //   5400: istore #20
    //   5402: iload #20
    //   5404: aload #10
    //   5406: iload #21
    //   5408: bipush #8
    //   5410: iushr
    //   5411: bipush #63
    //   5413: iand
    //   5414: iaload
    //   5415: ior
    //   5416: istore #20
    //   5418: iload #20
    //   5420: aload #8
    //   5422: iload #21
    //   5424: bipush #16
    //   5426: iushr
    //   5427: bipush #63
    //   5429: iand
    //   5430: iaload
    //   5431: ior
    //   5432: istore #20
    //   5434: iload #20
    //   5436: aload #6
    //   5438: iload #21
    //   5440: bipush #24
    //   5442: iushr
    //   5443: bipush #63
    //   5445: iand
    //   5446: iaload
    //   5447: ior
    //   5448: istore #20
    //   5450: iload #23
    //   5452: aload #5
    //   5454: iload #25
    //   5456: iinc #25, 1
    //   5459: iaload
    //   5460: ixor
    //   5461: istore #21
    //   5463: iload #20
    //   5465: aload #13
    //   5467: iload #21
    //   5469: bipush #63
    //   5471: iand
    //   5472: iaload
    //   5473: ior
    //   5474: istore #20
    //   5476: iload #20
    //   5478: aload #11
    //   5480: iload #21
    //   5482: bipush #8
    //   5484: iushr
    //   5485: bipush #63
    //   5487: iand
    //   5488: iaload
    //   5489: ior
    //   5490: istore #20
    //   5492: iload #20
    //   5494: aload #9
    //   5496: iload #21
    //   5498: bipush #16
    //   5500: iushr
    //   5501: bipush #63
    //   5503: iand
    //   5504: iaload
    //   5505: ior
    //   5506: istore #20
    //   5508: iload #20
    //   5510: aload #7
    //   5512: iload #21
    //   5514: bipush #24
    //   5516: iushr
    //   5517: bipush #63
    //   5519: iand
    //   5520: iaload
    //   5521: ior
    //   5522: istore #20
    //   5524: iload #22
    //   5526: iload #20
    //   5528: ixor
    //   5529: istore #22
    //   5531: iinc #24, 1
    //   5534: iload_2
    //   5535: ifne -> 5196
    //   5538: iload #22
    //   5540: bipush #31
    //   5542: ishl
    //   5543: iload #22
    //   5545: iconst_1
    //   5546: iushr
    //   5547: ior
    //   5548: istore #22
    //   5550: iload #23
    //   5552: iload #22
    //   5554: ixor
    //   5555: ldc -1431655766
    //   5557: iand
    //   5558: istore #21
    //   5560: iload #23
    //   5562: iload #21
    //   5564: ixor
    //   5565: istore #23
    //   5567: iload #22
    //   5569: iload #21
    //   5571: ixor
    //   5572: istore #22
    //   5574: iload #23
    //   5576: bipush #31
    //   5578: ishl
    //   5579: iload #23
    //   5581: iconst_1
    //   5582: iushr
    //   5583: ior
    //   5584: istore #23
    //   5586: iload #23
    //   5588: bipush #8
    //   5590: iushr
    //   5591: iload #22
    //   5593: ixor
    //   5594: ldc 16711935
    //   5596: iand
    //   5597: istore #21
    //   5599: iload #22
    //   5601: iload #21
    //   5603: ixor
    //   5604: istore #22
    //   5606: iload #23
    //   5608: iload #21
    //   5610: bipush #8
    //   5612: ishl
    //   5613: ixor
    //   5614: istore #23
    //   5616: iload #23
    //   5618: iconst_2
    //   5619: iushr
    //   5620: iload #22
    //   5622: ixor
    //   5623: ldc 858993459
    //   5625: iand
    //   5626: istore #21
    //   5628: iload #22
    //   5630: iload #21
    //   5632: ixor
    //   5633: istore #22
    //   5635: iload #23
    //   5637: iload #21
    //   5639: iconst_2
    //   5640: ishl
    //   5641: ixor
    //   5642: istore #23
    //   5644: iload #22
    //   5646: bipush #16
    //   5648: iushr
    //   5649: iload #23
    //   5651: ixor
    //   5652: ldc 65535
    //   5654: iand
    //   5655: istore #21
    //   5657: iload #23
    //   5659: iload #21
    //   5661: ixor
    //   5662: istore #23
    //   5664: iload #22
    //   5666: iload #21
    //   5668: bipush #16
    //   5670: ishl
    //   5671: ixor
    //   5672: istore #22
    //   5674: iload #22
    //   5676: iconst_4
    //   5677: iushr
    //   5678: iload #23
    //   5680: ixor
    //   5681: ldc 252645135
    //   5683: iand
    //   5684: istore #21
    //   5686: iload #23
    //   5688: iload #21
    //   5690: ixor
    //   5691: istore #23
    //   5693: iload #22
    //   5695: iload #21
    //   5697: iconst_4
    //   5698: ishl
    //   5699: ixor
    //   5700: istore #22
    //   5702: aload #15
    //   5704: iconst_0
    //   5705: iload #22
    //   5707: iastore
    //   5708: aload #15
    //   5710: iconst_1
    //   5711: iload #23
    //   5713: iastore
    //   5714: iload #18
    //   5716: bipush #8
    //   5718: imul
    //   5719: istore #26
    //   5721: iconst_0
    //   5722: istore #27
    //   5724: iload #27
    //   5726: iconst_2
    //   5727: if_icmpge -> 5816
    //   5730: aload #16
    //   5732: iload #26
    //   5734: iload #27
    //   5736: iconst_4
    //   5737: imul
    //   5738: iadd
    //   5739: aload #15
    //   5741: iload #27
    //   5743: iaload
    //   5744: bipush #24
    //   5746: iushr
    //   5747: i2b
    //   5748: bastore
    //   5749: aload #16
    //   5751: iload #26
    //   5753: iload #27
    //   5755: iconst_4
    //   5756: imul
    //   5757: iadd
    //   5758: iconst_1
    //   5759: iadd
    //   5760: aload #15
    //   5762: iload #27
    //   5764: iaload
    //   5765: bipush #16
    //   5767: iushr
    //   5768: i2b
    //   5769: bastore
    //   5770: aload #16
    //   5772: iload #26
    //   5774: iload #27
    //   5776: iconst_4
    //   5777: imul
    //   5778: iadd
    //   5779: iconst_2
    //   5780: iadd
    //   5781: aload #15
    //   5783: iload #27
    //   5785: iaload
    //   5786: bipush #8
    //   5788: iushr
    //   5789: i2b
    //   5790: bastore
    //   5791: aload #16
    //   5793: iload #26
    //   5795: iload #27
    //   5797: iconst_4
    //   5798: imul
    //   5799: iadd
    //   5800: iconst_3
    //   5801: iadd
    //   5802: aload #15
    //   5804: iload #27
    //   5806: iaload
    //   5807: i2b
    //   5808: bastore
    //   5809: iinc #27, 1
    //   5812: iload_2
    //   5813: ifne -> 5724
    //   5816: iinc #18, 1
    //   5819: iload_2
    //   5820: ifne -> 4905
    //   5823: aload #16
    //   5825: aload #16
    //   5827: arraylength
    //   5828: iconst_1
    //   5829: isub
    //   5830: baload
    //   5831: istore #18
    //   5833: aload #16
    //   5835: arraylength
    //   5836: iload #18
    //   5838: isub
    //   5839: newarray byte
    //   5841: astore #4
    //   5843: aload #16
    //   5845: arraylength
    //   5846: aload #4
    //   5848: arraylength
    //   5849: if_icmpge -> 5873
    //   5852: new java/lang/Exception
    //   5855: dup
    //   5856: sipush #-6325
    //   5859: sipush #-28331
    //   5862: invokestatic a : (II)Ljava/lang/String;
    //   5865: invokespecial <init> : (Ljava/lang/String;)V
    //   5868: athrow
    //   5869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5872: athrow
    //   5873: iconst_0
    //   5874: istore #19
    //   5876: iload #19
    //   5878: aload #4
    //   5880: arraylength
    //   5881: if_icmpge -> 5901
    //   5884: aload #4
    //   5886: iload #19
    //   5888: aload #16
    //   5890: iload #19
    //   5892: baload
    //   5893: bastore
    //   5894: iinc #19, 1
    //   5897: iload_2
    //   5898: ifne -> 5876
    //   5901: new java/math/BigInteger
    //   5904: dup
    //   5905: aload #4
    //   5907: invokespecial <init> : ([B)V
    //   5910: invokevirtual abs : ()Ljava/math/BigInteger;
    //   5913: putstatic burp/Zxzd.ZD : Ljava/lang/Object;
    //   5916: sipush #-6328
    //   5919: sipush #22077
    //   5922: invokestatic a : (II)Ljava/lang/String;
    //   5925: iconst_1
    //   5926: ldc burp/Zkcd
    //   5928: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5931: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5934: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5937: astore_3
    //   5938: aload_3
    //   5939: arraylength
    //   5940: istore #4
    //   5942: iconst_0
    //   5943: istore #5
    //   5945: iload #5
    //   5947: iload #4
    //   5949: if_icmpge -> 6086
    //   5952: aload_3
    //   5953: iload #5
    //   5955: aaload
    //   5956: astore #6
    //   5958: aload #6
    //   5960: invokevirtual getModifiers : ()I
    //   5963: invokestatic isStatic : (I)Z
    //   5966: ifne -> 5976
    //   5969: goto -> 6079
    //   5972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5975: athrow
    //   5976: aload #6
    //   5978: invokevirtual getType : ()Ljava/lang/Class;
    //   5981: astore #7
    //   5983: aload #7
    //   5985: ifnull -> 6066
    //   5988: aload #7
    //   5990: invokevirtual isPrimitive : ()Z
    //   5993: ifne -> 6066
    //   5996: goto -> 6003
    //   5999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6002: athrow
    //   6003: aload #7
    //   6005: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6008: ifnull -> 6066
    //   6011: goto -> 6018
    //   6014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6017: athrow
    //   6018: aload #7
    //   6020: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6023: invokevirtual getName : ()Ljava/lang/String;
    //   6026: ifnull -> 6066
    //   6029: goto -> 6036
    //   6032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6035: athrow
    //   6036: aload #7
    //   6038: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6041: invokevirtual getName : ()Ljava/lang/String;
    //   6044: sipush #-6331
    //   6047: sipush #-8682
    //   6050: invokestatic a : (II)Ljava/lang/String;
    //   6053: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6056: ifne -> 6066
    //   6059: goto -> 6066
    //   6062: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6065: athrow
    //   6066: aload #6
    //   6068: iconst_1
    //   6069: invokevirtual setAccessible : (Z)V
    //   6072: aload #6
    //   6074: aconst_null
    //   6075: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6078: pop
    //   6079: iinc #5, 1
    //   6082: iload_2
    //   6083: ifne -> 5945
    //   6086: sipush #-6332
    //   6089: sipush #27310
    //   6092: invokestatic a : (II)Ljava/lang/String;
    //   6095: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6098: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6101: astore_3
    //   6102: aload_3
    //   6103: arraylength
    //   6104: istore #4
    //   6106: iconst_0
    //   6107: istore #5
    //   6109: iload #5
    //   6111: iload #4
    //   6113: if_icmpge -> 6245
    //   6116: aload_3
    //   6117: iload #5
    //   6119: aaload
    //   6120: astore #6
    //   6122: aload #6
    //   6124: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6127: pop
    //   6128: aload #6
    //   6130: invokevirtual getModifiers : ()I
    //   6133: invokestatic isStatic : (I)Z
    //   6136: ifeq -> 6231
    //   6139: aload #6
    //   6141: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6144: arraylength
    //   6145: iconst_2
    //   6146: if_icmpne -> 6231
    //   6149: goto -> 6156
    //   6152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6155: athrow
    //   6156: aload #6
    //   6158: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6161: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   6164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6167: ifeq -> 6231
    //   6170: goto -> 6177
    //   6173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6176: athrow
    //   6177: aload #6
    //   6179: iconst_1
    //   6180: invokevirtual setAccessible : (Z)V
    //   6183: aload #6
    //   6185: aconst_null
    //   6186: iconst_2
    //   6187: anewarray java/lang/Object
    //   6190: dup
    //   6191: iconst_0
    //   6192: aload_0
    //   6193: aastore
    //   6194: dup
    //   6195: iconst_1
    //   6196: aload_1
    //   6197: ifnonnull -> 6215
    //   6200: goto -> 6207
    //   6203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6206: athrow
    //   6207: aload_1
    //   6208: goto -> 6222
    //   6211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6214: athrow
    //   6215: aload_1
    //   6216: checkcast [B
    //   6219: invokevirtual clone : ()Ljava/lang/Object;
    //   6222: aastore
    //   6223: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6226: pop
    //   6227: iload_2
    //   6228: ifne -> 6245
    //   6231: iinc #5, 1
    //   6234: iload_2
    //   6235: ifne -> 6109
    //   6238: goto -> 6245
    //   6241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6244: athrow
    //   6245: getstatic burp/Ztbf.Zv : Ljava/lang/Object;
    //   6248: checkcast java/math/BigInteger
    //   6251: invokevirtual toByteArray : ()[B
    //   6254: astore_3
    //   6255: bipush #64
    //   6257: newarray byte
    //   6259: dup
    //   6260: iconst_0
    //   6261: bipush #-128
    //   6263: bastore
    //   6264: dup
    //   6265: iconst_1
    //   6266: iconst_0
    //   6267: bastore
    //   6268: dup
    //   6269: iconst_2
    //   6270: iconst_0
    //   6271: bastore
    //   6272: dup
    //   6273: iconst_3
    //   6274: iconst_0
    //   6275: bastore
    //   6276: dup
    //   6277: iconst_4
    //   6278: iconst_0
    //   6279: bastore
    //   6280: dup
    //   6281: iconst_5
    //   6282: iconst_0
    //   6283: bastore
    //   6284: dup
    //   6285: bipush #6
    //   6287: iconst_0
    //   6288: bastore
    //   6289: dup
    //   6290: bipush #7
    //   6292: iconst_0
    //   6293: bastore
    //   6294: dup
    //   6295: bipush #8
    //   6297: iconst_0
    //   6298: bastore
    //   6299: dup
    //   6300: bipush #9
    //   6302: iconst_0
    //   6303: bastore
    //   6304: dup
    //   6305: bipush #10
    //   6307: iconst_0
    //   6308: bastore
    //   6309: dup
    //   6310: bipush #11
    //   6312: iconst_0
    //   6313: bastore
    //   6314: dup
    //   6315: bipush #12
    //   6317: iconst_0
    //   6318: bastore
    //   6319: dup
    //   6320: bipush #13
    //   6322: iconst_0
    //   6323: bastore
    //   6324: dup
    //   6325: bipush #14
    //   6327: iconst_0
    //   6328: bastore
    //   6329: dup
    //   6330: bipush #15
    //   6332: iconst_0
    //   6333: bastore
    //   6334: dup
    //   6335: bipush #16
    //   6337: iconst_0
    //   6338: bastore
    //   6339: dup
    //   6340: bipush #17
    //   6342: iconst_0
    //   6343: bastore
    //   6344: dup
    //   6345: bipush #18
    //   6347: iconst_0
    //   6348: bastore
    //   6349: dup
    //   6350: bipush #19
    //   6352: iconst_0
    //   6353: bastore
    //   6354: dup
    //   6355: bipush #20
    //   6357: iconst_0
    //   6358: bastore
    //   6359: dup
    //   6360: bipush #21
    //   6362: iconst_0
    //   6363: bastore
    //   6364: dup
    //   6365: bipush #22
    //   6367: iconst_0
    //   6368: bastore
    //   6369: dup
    //   6370: bipush #23
    //   6372: iconst_0
    //   6373: bastore
    //   6374: dup
    //   6375: bipush #24
    //   6377: iconst_0
    //   6378: bastore
    //   6379: dup
    //   6380: bipush #25
    //   6382: iconst_0
    //   6383: bastore
    //   6384: dup
    //   6385: bipush #26
    //   6387: iconst_0
    //   6388: bastore
    //   6389: dup
    //   6390: bipush #27
    //   6392: iconst_0
    //   6393: bastore
    //   6394: dup
    //   6395: bipush #28
    //   6397: iconst_0
    //   6398: bastore
    //   6399: dup
    //   6400: bipush #29
    //   6402: iconst_0
    //   6403: bastore
    //   6404: dup
    //   6405: bipush #30
    //   6407: iconst_0
    //   6408: bastore
    //   6409: dup
    //   6410: bipush #31
    //   6412: iconst_0
    //   6413: bastore
    //   6414: dup
    //   6415: bipush #32
    //   6417: iconst_0
    //   6418: bastore
    //   6419: dup
    //   6420: bipush #33
    //   6422: iconst_0
    //   6423: bastore
    //   6424: dup
    //   6425: bipush #34
    //   6427: iconst_0
    //   6428: bastore
    //   6429: dup
    //   6430: bipush #35
    //   6432: iconst_0
    //   6433: bastore
    //   6434: dup
    //   6435: bipush #36
    //   6437: iconst_0
    //   6438: bastore
    //   6439: dup
    //   6440: bipush #37
    //   6442: iconst_0
    //   6443: bastore
    //   6444: dup
    //   6445: bipush #38
    //   6447: iconst_0
    //   6448: bastore
    //   6449: dup
    //   6450: bipush #39
    //   6452: iconst_0
    //   6453: bastore
    //   6454: dup
    //   6455: bipush #40
    //   6457: iconst_0
    //   6458: bastore
    //   6459: dup
    //   6460: bipush #41
    //   6462: iconst_0
    //   6463: bastore
    //   6464: dup
    //   6465: bipush #42
    //   6467: iconst_0
    //   6468: bastore
    //   6469: dup
    //   6470: bipush #43
    //   6472: iconst_0
    //   6473: bastore
    //   6474: dup
    //   6475: bipush #44
    //   6477: iconst_0
    //   6478: bastore
    //   6479: dup
    //   6480: bipush #45
    //   6482: iconst_0
    //   6483: bastore
    //   6484: dup
    //   6485: bipush #46
    //   6487: iconst_0
    //   6488: bastore
    //   6489: dup
    //   6490: bipush #47
    //   6492: iconst_0
    //   6493: bastore
    //   6494: dup
    //   6495: bipush #48
    //   6497: iconst_0
    //   6498: bastore
    //   6499: dup
    //   6500: bipush #49
    //   6502: iconst_0
    //   6503: bastore
    //   6504: dup
    //   6505: bipush #50
    //   6507: iconst_0
    //   6508: bastore
    //   6509: dup
    //   6510: bipush #51
    //   6512: iconst_0
    //   6513: bastore
    //   6514: dup
    //   6515: bipush #52
    //   6517: iconst_0
    //   6518: bastore
    //   6519: dup
    //   6520: bipush #53
    //   6522: iconst_0
    //   6523: bastore
    //   6524: dup
    //   6525: bipush #54
    //   6527: iconst_0
    //   6528: bastore
    //   6529: dup
    //   6530: bipush #55
    //   6532: iconst_0
    //   6533: bastore
    //   6534: dup
    //   6535: bipush #56
    //   6537: iconst_0
    //   6538: bastore
    //   6539: dup
    //   6540: bipush #57
    //   6542: iconst_0
    //   6543: bastore
    //   6544: dup
    //   6545: bipush #58
    //   6547: iconst_0
    //   6548: bastore
    //   6549: dup
    //   6550: bipush #59
    //   6552: iconst_0
    //   6553: bastore
    //   6554: dup
    //   6555: bipush #60
    //   6557: iconst_0
    //   6558: bastore
    //   6559: dup
    //   6560: bipush #61
    //   6562: iconst_0
    //   6563: bastore
    //   6564: dup
    //   6565: bipush #62
    //   6567: iconst_0
    //   6568: bastore
    //   6569: dup
    //   6570: bipush #63
    //   6572: iconst_0
    //   6573: bastore
    //   6574: astore #5
    //   6576: bipush #64
    //   6578: newarray int
    //   6580: dup
    //   6581: iconst_0
    //   6582: ldc 1116352408
    //   6584: iastore
    //   6585: dup
    //   6586: iconst_1
    //   6587: ldc 1899447441
    //   6589: iastore
    //   6590: dup
    //   6591: iconst_2
    //   6592: ldc -1245643825
    //   6594: iastore
    //   6595: dup
    //   6596: iconst_3
    //   6597: ldc -373957723
    //   6599: iastore
    //   6600: dup
    //   6601: iconst_4
    //   6602: ldc 961987163
    //   6604: iastore
    //   6605: dup
    //   6606: iconst_5
    //   6607: ldc 1508970993
    //   6609: iastore
    //   6610: dup
    //   6611: bipush #6
    //   6613: ldc -1841331548
    //   6615: iastore
    //   6616: dup
    //   6617: bipush #7
    //   6619: ldc -1424204075
    //   6621: iastore
    //   6622: dup
    //   6623: bipush #8
    //   6625: ldc -670586216
    //   6627: iastore
    //   6628: dup
    //   6629: bipush #9
    //   6631: ldc 310598401
    //   6633: iastore
    //   6634: dup
    //   6635: bipush #10
    //   6637: ldc 607225278
    //   6639: iastore
    //   6640: dup
    //   6641: bipush #11
    //   6643: ldc 1426881987
    //   6645: iastore
    //   6646: dup
    //   6647: bipush #12
    //   6649: ldc 1925078388
    //   6651: iastore
    //   6652: dup
    //   6653: bipush #13
    //   6655: ldc -2132889090
    //   6657: iastore
    //   6658: dup
    //   6659: bipush #14
    //   6661: ldc -1680079193
    //   6663: iastore
    //   6664: dup
    //   6665: bipush #15
    //   6667: ldc -1046744716
    //   6669: iastore
    //   6670: dup
    //   6671: bipush #16
    //   6673: ldc -459576895
    //   6675: iastore
    //   6676: dup
    //   6677: bipush #17
    //   6679: ldc -272742522
    //   6681: iastore
    //   6682: dup
    //   6683: bipush #18
    //   6685: ldc 264347078
    //   6687: iastore
    //   6688: dup
    //   6689: bipush #19
    //   6691: ldc 604807628
    //   6693: iastore
    //   6694: dup
    //   6695: bipush #20
    //   6697: ldc 770255983
    //   6699: iastore
    //   6700: dup
    //   6701: bipush #21
    //   6703: ldc 1249150122
    //   6705: iastore
    //   6706: dup
    //   6707: bipush #22
    //   6709: ldc 1555081692
    //   6711: iastore
    //   6712: dup
    //   6713: bipush #23
    //   6715: ldc 1996064986
    //   6717: iastore
    //   6718: dup
    //   6719: bipush #24
    //   6721: ldc -1740746414
    //   6723: iastore
    //   6724: dup
    //   6725: bipush #25
    //   6727: ldc -1473132947
    //   6729: iastore
    //   6730: dup
    //   6731: bipush #26
    //   6733: ldc -1341970488
    //   6735: iastore
    //   6736: dup
    //   6737: bipush #27
    //   6739: ldc -1084653625
    //   6741: iastore
    //   6742: dup
    //   6743: bipush #28
    //   6745: ldc -958395405
    //   6747: iastore
    //   6748: dup
    //   6749: bipush #29
    //   6751: ldc -710438585
    //   6753: iastore
    //   6754: dup
    //   6755: bipush #30
    //   6757: ldc 113926993
    //   6759: iastore
    //   6760: dup
    //   6761: bipush #31
    //   6763: ldc 338241895
    //   6765: iastore
    //   6766: dup
    //   6767: bipush #32
    //   6769: ldc 666307205
    //   6771: iastore
    //   6772: dup
    //   6773: bipush #33
    //   6775: ldc 773529912
    //   6777: iastore
    //   6778: dup
    //   6779: bipush #34
    //   6781: ldc 1294757372
    //   6783: iastore
    //   6784: dup
    //   6785: bipush #35
    //   6787: ldc 1396182291
    //   6789: iastore
    //   6790: dup
    //   6791: bipush #36
    //   6793: ldc 1695183700
    //   6795: iastore
    //   6796: dup
    //   6797: bipush #37
    //   6799: ldc 1986661051
    //   6801: iastore
    //   6802: dup
    //   6803: bipush #38
    //   6805: ldc -2117940946
    //   6807: iastore
    //   6808: dup
    //   6809: bipush #39
    //   6811: ldc -1838011259
    //   6813: iastore
    //   6814: dup
    //   6815: bipush #40
    //   6817: ldc -1564481375
    //   6819: iastore
    //   6820: dup
    //   6821: bipush #41
    //   6823: ldc -1474664885
    //   6825: iastore
    //   6826: dup
    //   6827: bipush #42
    //   6829: ldc -1035236496
    //   6831: iastore
    //   6832: dup
    //   6833: bipush #43
    //   6835: ldc -949202525
    //   6837: iastore
    //   6838: dup
    //   6839: bipush #44
    //   6841: ldc -778901479
    //   6843: iastore
    //   6844: dup
    //   6845: bipush #45
    //   6847: ldc -694614492
    //   6849: iastore
    //   6850: dup
    //   6851: bipush #46
    //   6853: ldc -200395387
    //   6855: iastore
    //   6856: dup
    //   6857: bipush #47
    //   6859: ldc 275423344
    //   6861: iastore
    //   6862: dup
    //   6863: bipush #48
    //   6865: ldc 430227734
    //   6867: iastore
    //   6868: dup
    //   6869: bipush #49
    //   6871: ldc 506948616
    //   6873: iastore
    //   6874: dup
    //   6875: bipush #50
    //   6877: ldc 659060556
    //   6879: iastore
    //   6880: dup
    //   6881: bipush #51
    //   6883: ldc 883997877
    //   6885: iastore
    //   6886: dup
    //   6887: bipush #52
    //   6889: ldc 958139571
    //   6891: iastore
    //   6892: dup
    //   6893: bipush #53
    //   6895: ldc 1322822218
    //   6897: iastore
    //   6898: dup
    //   6899: bipush #54
    //   6901: ldc 1537002063
    //   6903: iastore
    //   6904: dup
    //   6905: bipush #55
    //   6907: ldc 1747873779
    //   6909: iastore
    //   6910: dup
    //   6911: bipush #56
    //   6913: ldc 1955562222
    //   6915: iastore
    //   6916: dup
    //   6917: bipush #57
    //   6919: ldc 2024104815
    //   6921: iastore
    //   6922: dup
    //   6923: bipush #58
    //   6925: ldc -2067236844
    //   6927: iastore
    //   6928: dup
    //   6929: bipush #59
    //   6931: ldc -1933114872
    //   6933: iastore
    //   6934: dup
    //   6935: bipush #60
    //   6937: ldc -1866530822
    //   6939: iastore
    //   6940: dup
    //   6941: bipush #61
    //   6943: ldc -1538233109
    //   6945: iastore
    //   6946: dup
    //   6947: bipush #62
    //   6949: ldc -1090935817
    //   6951: iastore
    //   6952: dup
    //   6953: bipush #63
    //   6955: ldc -965641998
    //   6957: iastore
    //   6958: astore #6
    //   6960: iconst_2
    //   6961: newarray int
    //   6963: dup
    //   6964: iconst_0
    //   6965: iconst_0
    //   6966: iastore
    //   6967: dup
    //   6968: iconst_1
    //   6969: iconst_0
    //   6970: iastore
    //   6971: astore #7
    //   6973: bipush #8
    //   6975: newarray int
    //   6977: dup
    //   6978: iconst_0
    //   6979: ldc 1779033703
    //   6981: iastore
    //   6982: dup
    //   6983: iconst_1
    //   6984: ldc -1150833019
    //   6986: iastore
    //   6987: dup
    //   6988: iconst_2
    //   6989: ldc 1013904242
    //   6991: iastore
    //   6992: dup
    //   6993: iconst_3
    //   6994: ldc -1521486534
    //   6996: iastore
    //   6997: dup
    //   6998: iconst_4
    //   6999: ldc 1359893119
    //   7001: iastore
    //   7002: dup
    //   7003: iconst_5
    //   7004: ldc -1694144372
    //   7006: iastore
    //   7007: dup
    //   7008: bipush #6
    //   7010: ldc 528734635
    //   7012: iastore
    //   7013: dup
    //   7014: bipush #7
    //   7016: ldc 1541459225
    //   7018: iastore
    //   7019: astore #8
    //   7021: bipush #64
    //   7023: newarray byte
    //   7025: astore #9
    //   7027: bipush #64
    //   7029: newarray byte
    //   7031: astore #10
    //   7033: aload_3
    //   7034: arraylength
    //   7035: istore #11
    //   7037: aload #7
    //   7039: iconst_0
    //   7040: iaload
    //   7041: bipush #63
    //   7043: iand
    //   7044: istore #12
    //   7046: aload #7
    //   7048: iconst_0
    //   7049: dup2
    //   7050: iaload
    //   7051: iload #11
    //   7053: iadd
    //   7054: iastore
    //   7055: aload #7
    //   7057: iconst_0
    //   7058: dup2
    //   7059: iaload
    //   7060: iconst_m1
    //   7061: iand
    //   7062: iastore
    //   7063: aload #7
    //   7065: iconst_0
    //   7066: iaload
    //   7067: iload #11
    //   7069: if_icmpge -> 7087
    //   7072: aload #7
    //   7074: iconst_1
    //   7075: dup2
    //   7076: iaload
    //   7077: iconst_1
    //   7078: iadd
    //   7079: iastore
    //   7080: goto -> 7087
    //   7083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7086: athrow
    //   7087: iconst_0
    //   7088: istore #13
    //   7090: iload #11
    //   7092: bipush #64
    //   7094: if_icmplt -> 7703
    //   7097: iconst_0
    //   7098: istore #14
    //   7100: iload #14
    //   7102: bipush #64
    //   7104: if_icmpge -> 7126
    //   7107: aload #10
    //   7109: iload #14
    //   7111: aload_3
    //   7112: iload #13
    //   7114: iload #14
    //   7116: iadd
    //   7117: baload
    //   7118: bastore
    //   7119: iinc #14, 1
    //   7122: iload_2
    //   7123: ifne -> 7100
    //   7126: bipush #64
    //   7128: newarray int
    //   7130: astore #14
    //   7132: bipush #8
    //   7134: newarray int
    //   7136: astore #15
    //   7138: iconst_0
    //   7139: istore #16
    //   7141: iload #16
    //   7143: bipush #8
    //   7145: if_icmpge -> 7165
    //   7148: aload #15
    //   7150: iload #16
    //   7152: aload #8
    //   7154: iload #16
    //   7156: iaload
    //   7157: iastore
    //   7158: iinc #16, 1
    //   7161: iload_2
    //   7162: ifne -> 7141
    //   7165: iconst_0
    //   7166: istore #16
    //   7168: iload #16
    //   7170: bipush #64
    //   7172: if_icmpge -> 7663
    //   7175: iload #16
    //   7177: bipush #16
    //   7179: if_icmpge -> 7260
    //   7182: aload #14
    //   7184: iload #16
    //   7186: aload #10
    //   7188: iconst_4
    //   7189: iload #16
    //   7191: imul
    //   7192: baload
    //   7193: sipush #255
    //   7196: iand
    //   7197: bipush #24
    //   7199: ishl
    //   7200: aload #10
    //   7202: iconst_4
    //   7203: iload #16
    //   7205: imul
    //   7206: iconst_1
    //   7207: iadd
    //   7208: baload
    //   7209: sipush #255
    //   7212: iand
    //   7213: bipush #16
    //   7215: ishl
    //   7216: ior
    //   7217: aload #10
    //   7219: iconst_4
    //   7220: iload #16
    //   7222: imul
    //   7223: iconst_2
    //   7224: iadd
    //   7225: baload
    //   7226: sipush #255
    //   7229: iand
    //   7230: bipush #8
    //   7232: ishl
    //   7233: ior
    //   7234: aload #10
    //   7236: iconst_4
    //   7237: iload #16
    //   7239: imul
    //   7240: iconst_3
    //   7241: iadd
    //   7242: baload
    //   7243: sipush #255
    //   7246: iand
    //   7247: ior
    //   7248: iastore
    //   7249: iload_2
    //   7250: ifne -> 7403
    //   7253: goto -> 7260
    //   7256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7259: athrow
    //   7260: aload #14
    //   7262: iload #16
    //   7264: aload #14
    //   7266: iload #16
    //   7268: iconst_2
    //   7269: isub
    //   7270: iaload
    //   7271: bipush #17
    //   7273: iushr
    //   7274: aload #14
    //   7276: iload #16
    //   7278: iconst_2
    //   7279: isub
    //   7280: iaload
    //   7281: bipush #15
    //   7283: ishl
    //   7284: ior
    //   7285: aload #14
    //   7287: iload #16
    //   7289: iconst_2
    //   7290: isub
    //   7291: iaload
    //   7292: bipush #19
    //   7294: iushr
    //   7295: aload #14
    //   7297: iload #16
    //   7299: iconst_2
    //   7300: isub
    //   7301: iaload
    //   7302: bipush #13
    //   7304: ishl
    //   7305: ior
    //   7306: ixor
    //   7307: aload #14
    //   7309: iload #16
    //   7311: iconst_2
    //   7312: isub
    //   7313: iaload
    //   7314: bipush #10
    //   7316: iushr
    //   7317: ixor
    //   7318: aload #14
    //   7320: iload #16
    //   7322: bipush #7
    //   7324: isub
    //   7325: iaload
    //   7326: iadd
    //   7327: aload #14
    //   7329: iload #16
    //   7331: bipush #15
    //   7333: isub
    //   7334: iaload
    //   7335: bipush #7
    //   7337: iushr
    //   7338: aload #14
    //   7340: iload #16
    //   7342: bipush #15
    //   7344: isub
    //   7345: iaload
    //   7346: bipush #25
    //   7348: ishl
    //   7349: ior
    //   7350: aload #14
    //   7352: iload #16
    //   7354: bipush #15
    //   7356: isub
    //   7357: iaload
    //   7358: bipush #18
    //   7360: iushr
    //   7361: aload #14
    //   7363: iload #16
    //   7365: bipush #15
    //   7367: isub
    //   7368: iaload
    //   7369: bipush #14
    //   7371: ishl
    //   7372: ior
    //   7373: ixor
    //   7374: aload #14
    //   7376: iload #16
    //   7378: bipush #15
    //   7380: isub
    //   7381: iaload
    //   7382: iconst_3
    //   7383: iushr
    //   7384: ixor
    //   7385: iadd
    //   7386: aload #14
    //   7388: iload #16
    //   7390: bipush #16
    //   7392: isub
    //   7393: iaload
    //   7394: iadd
    //   7395: iastore
    //   7396: goto -> 7403
    //   7399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7402: athrow
    //   7403: aload #15
    //   7405: bipush #7
    //   7407: iaload
    //   7408: aload #15
    //   7410: iconst_4
    //   7411: iaload
    //   7412: bipush #6
    //   7414: iushr
    //   7415: aload #15
    //   7417: iconst_4
    //   7418: iaload
    //   7419: bipush #26
    //   7421: ishl
    //   7422: ior
    //   7423: aload #15
    //   7425: iconst_4
    //   7426: iaload
    //   7427: bipush #11
    //   7429: iushr
    //   7430: aload #15
    //   7432: iconst_4
    //   7433: iaload
    //   7434: bipush #21
    //   7436: ishl
    //   7437: ior
    //   7438: ixor
    //   7439: aload #15
    //   7441: iconst_4
    //   7442: iaload
    //   7443: bipush #25
    //   7445: iushr
    //   7446: aload #15
    //   7448: iconst_4
    //   7449: iaload
    //   7450: bipush #7
    //   7452: ishl
    //   7453: ior
    //   7454: ixor
    //   7455: iadd
    //   7456: aload #15
    //   7458: bipush #6
    //   7460: iaload
    //   7461: aload #15
    //   7463: iconst_4
    //   7464: iaload
    //   7465: aload #15
    //   7467: iconst_5
    //   7468: iaload
    //   7469: aload #15
    //   7471: bipush #6
    //   7473: iaload
    //   7474: ixor
    //   7475: iand
    //   7476: ixor
    //   7477: iadd
    //   7478: aload #6
    //   7480: iload #16
    //   7482: iaload
    //   7483: iadd
    //   7484: aload #14
    //   7486: iload #16
    //   7488: iaload
    //   7489: iadd
    //   7490: istore #17
    //   7492: aload #15
    //   7494: iconst_0
    //   7495: iaload
    //   7496: iconst_2
    //   7497: iushr
    //   7498: aload #15
    //   7500: iconst_0
    //   7501: iaload
    //   7502: bipush #30
    //   7504: ishl
    //   7505: ior
    //   7506: aload #15
    //   7508: iconst_0
    //   7509: iaload
    //   7510: bipush #13
    //   7512: iushr
    //   7513: aload #15
    //   7515: iconst_0
    //   7516: iaload
    //   7517: bipush #19
    //   7519: ishl
    //   7520: ior
    //   7521: ixor
    //   7522: aload #15
    //   7524: iconst_0
    //   7525: iaload
    //   7526: bipush #22
    //   7528: iushr
    //   7529: aload #15
    //   7531: iconst_0
    //   7532: iaload
    //   7533: bipush #10
    //   7535: ishl
    //   7536: ior
    //   7537: ixor
    //   7538: aload #15
    //   7540: iconst_0
    //   7541: iaload
    //   7542: aload #15
    //   7544: iconst_1
    //   7545: iaload
    //   7546: iand
    //   7547: aload #15
    //   7549: iconst_2
    //   7550: iaload
    //   7551: aload #15
    //   7553: iconst_0
    //   7554: iaload
    //   7555: aload #15
    //   7557: iconst_1
    //   7558: iaload
    //   7559: ior
    //   7560: iand
    //   7561: ior
    //   7562: iadd
    //   7563: istore #18
    //   7565: aload #15
    //   7567: iconst_3
    //   7568: dup2
    //   7569: iaload
    //   7570: iload #17
    //   7572: iadd
    //   7573: iastore
    //   7574: aload #15
    //   7576: bipush #7
    //   7578: iload #17
    //   7580: iload #18
    //   7582: iadd
    //   7583: iastore
    //   7584: aload #15
    //   7586: bipush #7
    //   7588: iaload
    //   7589: istore #17
    //   7591: aload #15
    //   7593: bipush #7
    //   7595: aload #15
    //   7597: bipush #6
    //   7599: iaload
    //   7600: iastore
    //   7601: aload #15
    //   7603: bipush #6
    //   7605: aload #15
    //   7607: iconst_5
    //   7608: iaload
    //   7609: iastore
    //   7610: aload #15
    //   7612: iconst_5
    //   7613: aload #15
    //   7615: iconst_4
    //   7616: iaload
    //   7617: iastore
    //   7618: aload #15
    //   7620: iconst_4
    //   7621: aload #15
    //   7623: iconst_3
    //   7624: iaload
    //   7625: iastore
    //   7626: aload #15
    //   7628: iconst_3
    //   7629: aload #15
    //   7631: iconst_2
    //   7632: iaload
    //   7633: iastore
    //   7634: aload #15
    //   7636: iconst_2
    //   7637: aload #15
    //   7639: iconst_1
    //   7640: iaload
    //   7641: iastore
    //   7642: aload #15
    //   7644: iconst_1
    //   7645: aload #15
    //   7647: iconst_0
    //   7648: iaload
    //   7649: iastore
    //   7650: aload #15
    //   7652: iconst_0
    //   7653: iload #17
    //   7655: iastore
    //   7656: iinc #16, 1
    //   7659: iload_2
    //   7660: ifne -> 7168
    //   7663: iconst_0
    //   7664: istore #16
    //   7666: iload #16
    //   7668: bipush #8
    //   7670: if_icmpge -> 7693
    //   7673: aload #8
    //   7675: iload #16
    //   7677: dup2
    //   7678: iaload
    //   7679: aload #15
    //   7681: iload #16
    //   7683: iaload
    //   7684: iadd
    //   7685: iastore
    //   7686: iinc #16, 1
    //   7689: iload_2
    //   7690: ifne -> 7666
    //   7693: iinc #13, 64
    //   7696: iinc #11, -64
    //   7699: iload_2
    //   7700: ifne -> 7090
    //   7703: iload #11
    //   7705: ifle -> 7740
    //   7708: iconst_0
    //   7709: istore #14
    //   7711: iload #14
    //   7713: iload #11
    //   7715: if_icmpge -> 7740
    //   7718: aload #9
    //   7720: iload #12
    //   7722: iload #14
    //   7724: iadd
    //   7725: aload_3
    //   7726: iload #13
    //   7728: iload #14
    //   7730: iadd
    //   7731: baload
    //   7732: bastore
    //   7733: iinc #14, 1
    //   7736: iload_2
    //   7737: ifne -> 7711
    //   7740: aload #7
    //   7742: iconst_0
    //   7743: iaload
    //   7744: bipush #29
    //   7746: iushr
    //   7747: aload #7
    //   7749: iconst_1
    //   7750: iaload
    //   7751: iconst_3
    //   7752: ishl
    //   7753: ior
    //   7754: istore #14
    //   7756: aload #7
    //   7758: iconst_0
    //   7759: iaload
    //   7760: iconst_3
    //   7761: ishl
    //   7762: istore #15
    //   7764: aload #7
    //   7766: iconst_0
    //   7767: iaload
    //   7768: bipush #63
    //   7770: iand
    //   7771: istore #16
    //   7773: iload #16
    //   7775: bipush #56
    //   7777: if_icmpge -> 7792
    //   7780: bipush #56
    //   7782: iload #16
    //   7784: isub
    //   7785: goto -> 7797
    //   7788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7791: athrow
    //   7792: bipush #120
    //   7794: iload #16
    //   7796: isub
    //   7797: istore #17
    //   7799: aload #7
    //   7801: iconst_0
    //   7802: iaload
    //   7803: bipush #63
    //   7805: iand
    //   7806: istore #12
    //   7808: bipush #64
    //   7810: iload #12
    //   7812: isub
    //   7813: istore #18
    //   7815: aload #7
    //   7817: iconst_0
    //   7818: dup2
    //   7819: iaload
    //   7820: iload #17
    //   7822: iadd
    //   7823: iastore
    //   7824: aload #7
    //   7826: iconst_0
    //   7827: dup2
    //   7828: iaload
    //   7829: iconst_m1
    //   7830: iand
    //   7831: iastore
    //   7832: aload #7
    //   7834: iconst_0
    //   7835: iaload
    //   7836: iload #17
    //   7838: if_icmpge -> 7856
    //   7841: aload #7
    //   7843: iconst_1
    //   7844: dup2
    //   7845: iaload
    //   7846: iconst_1
    //   7847: iadd
    //   7848: iastore
    //   7849: goto -> 7856
    //   7852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7855: athrow
    //   7856: iconst_0
    //   7857: istore #13
    //   7859: iload #12
    //   7861: ifle -> 8492
    //   7864: iload #17
    //   7866: iload #18
    //   7868: if_icmplt -> 8492
    //   7871: goto -> 7878
    //   7874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7877: athrow
    //   7878: iconst_0
    //   7879: istore #19
    //   7881: iload #19
    //   7883: iload #18
    //   7885: if_icmpge -> 7908
    //   7888: aload #9
    //   7890: iload #12
    //   7892: iload #19
    //   7894: iadd
    //   7895: aload #5
    //   7897: iload #19
    //   7899: baload
    //   7900: bastore
    //   7901: iinc #19, 1
    //   7904: iload_2
    //   7905: ifne -> 7881
    //   7908: bipush #64
    //   7910: newarray int
    //   7912: astore #19
    //   7914: bipush #8
    //   7916: newarray int
    //   7918: astore #20
    //   7920: iconst_0
    //   7921: istore #21
    //   7923: iload #21
    //   7925: bipush #8
    //   7927: if_icmpge -> 7947
    //   7930: aload #20
    //   7932: iload #21
    //   7934: aload #8
    //   7936: iload #21
    //   7938: iaload
    //   7939: iastore
    //   7940: iinc #21, 1
    //   7943: iload_2
    //   7944: ifne -> 7923
    //   7947: iconst_0
    //   7948: istore #21
    //   7950: iload #21
    //   7952: bipush #64
    //   7954: if_icmpge -> 8445
    //   7957: iload #21
    //   7959: bipush #16
    //   7961: if_icmpge -> 8042
    //   7964: aload #19
    //   7966: iload #21
    //   7968: aload #9
    //   7970: iconst_4
    //   7971: iload #21
    //   7973: imul
    //   7974: baload
    //   7975: sipush #255
    //   7978: iand
    //   7979: bipush #24
    //   7981: ishl
    //   7982: aload #9
    //   7984: iconst_4
    //   7985: iload #21
    //   7987: imul
    //   7988: iconst_1
    //   7989: iadd
    //   7990: baload
    //   7991: sipush #255
    //   7994: iand
    //   7995: bipush #16
    //   7997: ishl
    //   7998: ior
    //   7999: aload #9
    //   8001: iconst_4
    //   8002: iload #21
    //   8004: imul
    //   8005: iconst_2
    //   8006: iadd
    //   8007: baload
    //   8008: sipush #255
    //   8011: iand
    //   8012: bipush #8
    //   8014: ishl
    //   8015: ior
    //   8016: aload #9
    //   8018: iconst_4
    //   8019: iload #21
    //   8021: imul
    //   8022: iconst_3
    //   8023: iadd
    //   8024: baload
    //   8025: sipush #255
    //   8028: iand
    //   8029: ior
    //   8030: iastore
    //   8031: iload_2
    //   8032: ifne -> 8185
    //   8035: goto -> 8042
    //   8038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8041: athrow
    //   8042: aload #19
    //   8044: iload #21
    //   8046: aload #19
    //   8048: iload #21
    //   8050: iconst_2
    //   8051: isub
    //   8052: iaload
    //   8053: bipush #17
    //   8055: iushr
    //   8056: aload #19
    //   8058: iload #21
    //   8060: iconst_2
    //   8061: isub
    //   8062: iaload
    //   8063: bipush #15
    //   8065: ishl
    //   8066: ior
    //   8067: aload #19
    //   8069: iload #21
    //   8071: iconst_2
    //   8072: isub
    //   8073: iaload
    //   8074: bipush #19
    //   8076: iushr
    //   8077: aload #19
    //   8079: iload #21
    //   8081: iconst_2
    //   8082: isub
    //   8083: iaload
    //   8084: bipush #13
    //   8086: ishl
    //   8087: ior
    //   8088: ixor
    //   8089: aload #19
    //   8091: iload #21
    //   8093: iconst_2
    //   8094: isub
    //   8095: iaload
    //   8096: bipush #10
    //   8098: iushr
    //   8099: ixor
    //   8100: aload #19
    //   8102: iload #21
    //   8104: bipush #7
    //   8106: isub
    //   8107: iaload
    //   8108: iadd
    //   8109: aload #19
    //   8111: iload #21
    //   8113: bipush #15
    //   8115: isub
    //   8116: iaload
    //   8117: bipush #7
    //   8119: iushr
    //   8120: aload #19
    //   8122: iload #21
    //   8124: bipush #15
    //   8126: isub
    //   8127: iaload
    //   8128: bipush #25
    //   8130: ishl
    //   8131: ior
    //   8132: aload #19
    //   8134: iload #21
    //   8136: bipush #15
    //   8138: isub
    //   8139: iaload
    //   8140: bipush #18
    //   8142: iushr
    //   8143: aload #19
    //   8145: iload #21
    //   8147: bipush #15
    //   8149: isub
    //   8150: iaload
    //   8151: bipush #14
    //   8153: ishl
    //   8154: ior
    //   8155: ixor
    //   8156: aload #19
    //   8158: iload #21
    //   8160: bipush #15
    //   8162: isub
    //   8163: iaload
    //   8164: iconst_3
    //   8165: iushr
    //   8166: ixor
    //   8167: iadd
    //   8168: aload #19
    //   8170: iload #21
    //   8172: bipush #16
    //   8174: isub
    //   8175: iaload
    //   8176: iadd
    //   8177: iastore
    //   8178: goto -> 8185
    //   8181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8184: athrow
    //   8185: aload #20
    //   8187: bipush #7
    //   8189: iaload
    //   8190: aload #20
    //   8192: iconst_4
    //   8193: iaload
    //   8194: bipush #6
    //   8196: iushr
    //   8197: aload #20
    //   8199: iconst_4
    //   8200: iaload
    //   8201: bipush #26
    //   8203: ishl
    //   8204: ior
    //   8205: aload #20
    //   8207: iconst_4
    //   8208: iaload
    //   8209: bipush #11
    //   8211: iushr
    //   8212: aload #20
    //   8214: iconst_4
    //   8215: iaload
    //   8216: bipush #21
    //   8218: ishl
    //   8219: ior
    //   8220: ixor
    //   8221: aload #20
    //   8223: iconst_4
    //   8224: iaload
    //   8225: bipush #25
    //   8227: iushr
    //   8228: aload #20
    //   8230: iconst_4
    //   8231: iaload
    //   8232: bipush #7
    //   8234: ishl
    //   8235: ior
    //   8236: ixor
    //   8237: iadd
    //   8238: aload #20
    //   8240: bipush #6
    //   8242: iaload
    //   8243: aload #20
    //   8245: iconst_4
    //   8246: iaload
    //   8247: aload #20
    //   8249: iconst_5
    //   8250: iaload
    //   8251: aload #20
    //   8253: bipush #6
    //   8255: iaload
    //   8256: ixor
    //   8257: iand
    //   8258: ixor
    //   8259: iadd
    //   8260: aload #6
    //   8262: iload #21
    //   8264: iaload
    //   8265: iadd
    //   8266: aload #19
    //   8268: iload #21
    //   8270: iaload
    //   8271: iadd
    //   8272: istore #22
    //   8274: aload #20
    //   8276: iconst_0
    //   8277: iaload
    //   8278: iconst_2
    //   8279: iushr
    //   8280: aload #20
    //   8282: iconst_0
    //   8283: iaload
    //   8284: bipush #30
    //   8286: ishl
    //   8287: ior
    //   8288: aload #20
    //   8290: iconst_0
    //   8291: iaload
    //   8292: bipush #13
    //   8294: iushr
    //   8295: aload #20
    //   8297: iconst_0
    //   8298: iaload
    //   8299: bipush #19
    //   8301: ishl
    //   8302: ior
    //   8303: ixor
    //   8304: aload #20
    //   8306: iconst_0
    //   8307: iaload
    //   8308: bipush #22
    //   8310: iushr
    //   8311: aload #20
    //   8313: iconst_0
    //   8314: iaload
    //   8315: bipush #10
    //   8317: ishl
    //   8318: ior
    //   8319: ixor
    //   8320: aload #20
    //   8322: iconst_0
    //   8323: iaload
    //   8324: aload #20
    //   8326: iconst_1
    //   8327: iaload
    //   8328: iand
    //   8329: aload #20
    //   8331: iconst_2
    //   8332: iaload
    //   8333: aload #20
    //   8335: iconst_0
    //   8336: iaload
    //   8337: aload #20
    //   8339: iconst_1
    //   8340: iaload
    //   8341: ior
    //   8342: iand
    //   8343: ior
    //   8344: iadd
    //   8345: istore #23
    //   8347: aload #20
    //   8349: iconst_3
    //   8350: dup2
    //   8351: iaload
    //   8352: iload #22
    //   8354: iadd
    //   8355: iastore
    //   8356: aload #20
    //   8358: bipush #7
    //   8360: iload #22
    //   8362: iload #23
    //   8364: iadd
    //   8365: iastore
    //   8366: aload #20
    //   8368: bipush #7
    //   8370: iaload
    //   8371: istore #22
    //   8373: aload #20
    //   8375: bipush #7
    //   8377: aload #20
    //   8379: bipush #6
    //   8381: iaload
    //   8382: iastore
    //   8383: aload #20
    //   8385: bipush #6
    //   8387: aload #20
    //   8389: iconst_5
    //   8390: iaload
    //   8391: iastore
    //   8392: aload #20
    //   8394: iconst_5
    //   8395: aload #20
    //   8397: iconst_4
    //   8398: iaload
    //   8399: iastore
    //   8400: aload #20
    //   8402: iconst_4
    //   8403: aload #20
    //   8405: iconst_3
    //   8406: iaload
    //   8407: iastore
    //   8408: aload #20
    //   8410: iconst_3
    //   8411: aload #20
    //   8413: iconst_2
    //   8414: iaload
    //   8415: iastore
    //   8416: aload #20
    //   8418: iconst_2
    //   8419: aload #20
    //   8421: iconst_1
    //   8422: iaload
    //   8423: iastore
    //   8424: aload #20
    //   8426: iconst_1
    //   8427: aload #20
    //   8429: iconst_0
    //   8430: iaload
    //   8431: iastore
    //   8432: aload #20
    //   8434: iconst_0
    //   8435: iload #22
    //   8437: iastore
    //   8438: iinc #21, 1
    //   8441: iload_2
    //   8442: ifne -> 7950
    //   8445: iconst_0
    //   8446: istore #21
    //   8448: iload #21
    //   8450: bipush #8
    //   8452: if_icmpge -> 8475
    //   8455: aload #8
    //   8457: iload #21
    //   8459: dup2
    //   8460: iaload
    //   8461: aload #20
    //   8463: iload #21
    //   8465: iaload
    //   8466: iadd
    //   8467: iastore
    //   8468: iinc #21, 1
    //   8471: iload_2
    //   8472: ifne -> 8448
    //   8475: iload #13
    //   8477: iload #18
    //   8479: iadd
    //   8480: istore #13
    //   8482: iload #17
    //   8484: iload #18
    //   8486: isub
    //   8487: istore #17
    //   8489: iconst_0
    //   8490: istore #12
    //   8492: iload #17
    //   8494: bipush #64
    //   8496: if_icmplt -> 9106
    //   8499: iconst_0
    //   8500: istore #19
    //   8502: iload #19
    //   8504: bipush #64
    //   8506: if_icmpge -> 8529
    //   8509: aload #10
    //   8511: iload #19
    //   8513: aload #5
    //   8515: iload #13
    //   8517: iload #19
    //   8519: iadd
    //   8520: baload
    //   8521: bastore
    //   8522: iinc #19, 1
    //   8525: iload_2
    //   8526: ifne -> 8502
    //   8529: bipush #64
    //   8531: newarray int
    //   8533: astore #19
    //   8535: bipush #8
    //   8537: newarray int
    //   8539: astore #20
    //   8541: iconst_0
    //   8542: istore #21
    //   8544: iload #21
    //   8546: bipush #8
    //   8548: if_icmpge -> 8568
    //   8551: aload #20
    //   8553: iload #21
    //   8555: aload #8
    //   8557: iload #21
    //   8559: iaload
    //   8560: iastore
    //   8561: iinc #21, 1
    //   8564: iload_2
    //   8565: ifne -> 8544
    //   8568: iconst_0
    //   8569: istore #21
    //   8571: iload #21
    //   8573: bipush #64
    //   8575: if_icmpge -> 9066
    //   8578: iload #21
    //   8580: bipush #16
    //   8582: if_icmpge -> 8663
    //   8585: aload #19
    //   8587: iload #21
    //   8589: aload #10
    //   8591: iconst_4
    //   8592: iload #21
    //   8594: imul
    //   8595: baload
    //   8596: sipush #255
    //   8599: iand
    //   8600: bipush #24
    //   8602: ishl
    //   8603: aload #10
    //   8605: iconst_4
    //   8606: iload #21
    //   8608: imul
    //   8609: iconst_1
    //   8610: iadd
    //   8611: baload
    //   8612: sipush #255
    //   8615: iand
    //   8616: bipush #16
    //   8618: ishl
    //   8619: ior
    //   8620: aload #10
    //   8622: iconst_4
    //   8623: iload #21
    //   8625: imul
    //   8626: iconst_2
    //   8627: iadd
    //   8628: baload
    //   8629: sipush #255
    //   8632: iand
    //   8633: bipush #8
    //   8635: ishl
    //   8636: ior
    //   8637: aload #10
    //   8639: iconst_4
    //   8640: iload #21
    //   8642: imul
    //   8643: iconst_3
    //   8644: iadd
    //   8645: baload
    //   8646: sipush #255
    //   8649: iand
    //   8650: ior
    //   8651: iastore
    //   8652: iload_2
    //   8653: ifne -> 8806
    //   8656: goto -> 8663
    //   8659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8662: athrow
    //   8663: aload #19
    //   8665: iload #21
    //   8667: aload #19
    //   8669: iload #21
    //   8671: iconst_2
    //   8672: isub
    //   8673: iaload
    //   8674: bipush #17
    //   8676: iushr
    //   8677: aload #19
    //   8679: iload #21
    //   8681: iconst_2
    //   8682: isub
    //   8683: iaload
    //   8684: bipush #15
    //   8686: ishl
    //   8687: ior
    //   8688: aload #19
    //   8690: iload #21
    //   8692: iconst_2
    //   8693: isub
    //   8694: iaload
    //   8695: bipush #19
    //   8697: iushr
    //   8698: aload #19
    //   8700: iload #21
    //   8702: iconst_2
    //   8703: isub
    //   8704: iaload
    //   8705: bipush #13
    //   8707: ishl
    //   8708: ior
    //   8709: ixor
    //   8710: aload #19
    //   8712: iload #21
    //   8714: iconst_2
    //   8715: isub
    //   8716: iaload
    //   8717: bipush #10
    //   8719: iushr
    //   8720: ixor
    //   8721: aload #19
    //   8723: iload #21
    //   8725: bipush #7
    //   8727: isub
    //   8728: iaload
    //   8729: iadd
    //   8730: aload #19
    //   8732: iload #21
    //   8734: bipush #15
    //   8736: isub
    //   8737: iaload
    //   8738: bipush #7
    //   8740: iushr
    //   8741: aload #19
    //   8743: iload #21
    //   8745: bipush #15
    //   8747: isub
    //   8748: iaload
    //   8749: bipush #25
    //   8751: ishl
    //   8752: ior
    //   8753: aload #19
    //   8755: iload #21
    //   8757: bipush #15
    //   8759: isub
    //   8760: iaload
    //   8761: bipush #18
    //   8763: iushr
    //   8764: aload #19
    //   8766: iload #21
    //   8768: bipush #15
    //   8770: isub
    //   8771: iaload
    //   8772: bipush #14
    //   8774: ishl
    //   8775: ior
    //   8776: ixor
    //   8777: aload #19
    //   8779: iload #21
    //   8781: bipush #15
    //   8783: isub
    //   8784: iaload
    //   8785: iconst_3
    //   8786: iushr
    //   8787: ixor
    //   8788: iadd
    //   8789: aload #19
    //   8791: iload #21
    //   8793: bipush #16
    //   8795: isub
    //   8796: iaload
    //   8797: iadd
    //   8798: iastore
    //   8799: goto -> 8806
    //   8802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8805: athrow
    //   8806: aload #20
    //   8808: bipush #7
    //   8810: iaload
    //   8811: aload #20
    //   8813: iconst_4
    //   8814: iaload
    //   8815: bipush #6
    //   8817: iushr
    //   8818: aload #20
    //   8820: iconst_4
    //   8821: iaload
    //   8822: bipush #26
    //   8824: ishl
    //   8825: ior
    //   8826: aload #20
    //   8828: iconst_4
    //   8829: iaload
    //   8830: bipush #11
    //   8832: iushr
    //   8833: aload #20
    //   8835: iconst_4
    //   8836: iaload
    //   8837: bipush #21
    //   8839: ishl
    //   8840: ior
    //   8841: ixor
    //   8842: aload #20
    //   8844: iconst_4
    //   8845: iaload
    //   8846: bipush #25
    //   8848: iushr
    //   8849: aload #20
    //   8851: iconst_4
    //   8852: iaload
    //   8853: bipush #7
    //   8855: ishl
    //   8856: ior
    //   8857: ixor
    //   8858: iadd
    //   8859: aload #20
    //   8861: bipush #6
    //   8863: iaload
    //   8864: aload #20
    //   8866: iconst_4
    //   8867: iaload
    //   8868: aload #20
    //   8870: iconst_5
    //   8871: iaload
    //   8872: aload #20
    //   8874: bipush #6
    //   8876: iaload
    //   8877: ixor
    //   8878: iand
    //   8879: ixor
    //   8880: iadd
    //   8881: aload #6
    //   8883: iload #21
    //   8885: iaload
    //   8886: iadd
    //   8887: aload #19
    //   8889: iload #21
    //   8891: iaload
    //   8892: iadd
    //   8893: istore #22
    //   8895: aload #20
    //   8897: iconst_0
    //   8898: iaload
    //   8899: iconst_2
    //   8900: iushr
    //   8901: aload #20
    //   8903: iconst_0
    //   8904: iaload
    //   8905: bipush #30
    //   8907: ishl
    //   8908: ior
    //   8909: aload #20
    //   8911: iconst_0
    //   8912: iaload
    //   8913: bipush #13
    //   8915: iushr
    //   8916: aload #20
    //   8918: iconst_0
    //   8919: iaload
    //   8920: bipush #19
    //   8922: ishl
    //   8923: ior
    //   8924: ixor
    //   8925: aload #20
    //   8927: iconst_0
    //   8928: iaload
    //   8929: bipush #22
    //   8931: iushr
    //   8932: aload #20
    //   8934: iconst_0
    //   8935: iaload
    //   8936: bipush #10
    //   8938: ishl
    //   8939: ior
    //   8940: ixor
    //   8941: aload #20
    //   8943: iconst_0
    //   8944: iaload
    //   8945: aload #20
    //   8947: iconst_1
    //   8948: iaload
    //   8949: iand
    //   8950: aload #20
    //   8952: iconst_2
    //   8953: iaload
    //   8954: aload #20
    //   8956: iconst_0
    //   8957: iaload
    //   8958: aload #20
    //   8960: iconst_1
    //   8961: iaload
    //   8962: ior
    //   8963: iand
    //   8964: ior
    //   8965: iadd
    //   8966: istore #23
    //   8968: aload #20
    //   8970: iconst_3
    //   8971: dup2
    //   8972: iaload
    //   8973: iload #22
    //   8975: iadd
    //   8976: iastore
    //   8977: aload #20
    //   8979: bipush #7
    //   8981: iload #22
    //   8983: iload #23
    //   8985: iadd
    //   8986: iastore
    //   8987: aload #20
    //   8989: bipush #7
    //   8991: iaload
    //   8992: istore #22
    //   8994: aload #20
    //   8996: bipush #7
    //   8998: aload #20
    //   9000: bipush #6
    //   9002: iaload
    //   9003: iastore
    //   9004: aload #20
    //   9006: bipush #6
    //   9008: aload #20
    //   9010: iconst_5
    //   9011: iaload
    //   9012: iastore
    //   9013: aload #20
    //   9015: iconst_5
    //   9016: aload #20
    //   9018: iconst_4
    //   9019: iaload
    //   9020: iastore
    //   9021: aload #20
    //   9023: iconst_4
    //   9024: aload #20
    //   9026: iconst_3
    //   9027: iaload
    //   9028: iastore
    //   9029: aload #20
    //   9031: iconst_3
    //   9032: aload #20
    //   9034: iconst_2
    //   9035: iaload
    //   9036: iastore
    //   9037: aload #20
    //   9039: iconst_2
    //   9040: aload #20
    //   9042: iconst_1
    //   9043: iaload
    //   9044: iastore
    //   9045: aload #20
    //   9047: iconst_1
    //   9048: aload #20
    //   9050: iconst_0
    //   9051: iaload
    //   9052: iastore
    //   9053: aload #20
    //   9055: iconst_0
    //   9056: iload #22
    //   9058: iastore
    //   9059: iinc #21, 1
    //   9062: iload_2
    //   9063: ifne -> 8571
    //   9066: iconst_0
    //   9067: istore #21
    //   9069: iload #21
    //   9071: bipush #8
    //   9073: if_icmpge -> 9096
    //   9076: aload #8
    //   9078: iload #21
    //   9080: dup2
    //   9081: iaload
    //   9082: aload #20
    //   9084: iload #21
    //   9086: iaload
    //   9087: iadd
    //   9088: iastore
    //   9089: iinc #21, 1
    //   9092: iload_2
    //   9093: ifne -> 9069
    //   9096: iinc #13, 64
    //   9099: iinc #17, -64
    //   9102: iload_2
    //   9103: ifne -> 8492
    //   9106: iload #17
    //   9108: ifle -> 9144
    //   9111: iconst_0
    //   9112: istore #19
    //   9114: iload #19
    //   9116: iload #17
    //   9118: if_icmpge -> 9144
    //   9121: aload #9
    //   9123: iload #12
    //   9125: iload #19
    //   9127: iadd
    //   9128: aload #5
    //   9130: iload #13
    //   9132: iload #19
    //   9134: iadd
    //   9135: baload
    //   9136: bastore
    //   9137: iinc #19, 1
    //   9140: iload_2
    //   9141: ifne -> 9114
    //   9144: bipush #8
    //   9146: newarray byte
    //   9148: astore #19
    //   9150: aload #19
    //   9152: iconst_0
    //   9153: iload #14
    //   9155: bipush #24
    //   9157: iushr
    //   9158: i2b
    //   9159: bastore
    //   9160: aload #19
    //   9162: iconst_1
    //   9163: iload #14
    //   9165: bipush #16
    //   9167: iushr
    //   9168: i2b
    //   9169: bastore
    //   9170: aload #19
    //   9172: iconst_2
    //   9173: iload #14
    //   9175: bipush #8
    //   9177: iushr
    //   9178: i2b
    //   9179: bastore
    //   9180: aload #19
    //   9182: iconst_3
    //   9183: iload #14
    //   9185: i2b
    //   9186: bastore
    //   9187: aload #19
    //   9189: iconst_4
    //   9190: iload #15
    //   9192: bipush #24
    //   9194: iushr
    //   9195: i2b
    //   9196: bastore
    //   9197: aload #19
    //   9199: iconst_5
    //   9200: iload #15
    //   9202: bipush #16
    //   9204: iushr
    //   9205: i2b
    //   9206: bastore
    //   9207: aload #19
    //   9209: bipush #6
    //   9211: iload #15
    //   9213: bipush #8
    //   9215: iushr
    //   9216: i2b
    //   9217: bastore
    //   9218: aload #19
    //   9220: bipush #7
    //   9222: iload #15
    //   9224: i2b
    //   9225: bastore
    //   9226: bipush #8
    //   9228: istore #11
    //   9230: aload #7
    //   9232: iconst_0
    //   9233: iaload
    //   9234: bipush #63
    //   9236: iand
    //   9237: istore #12
    //   9239: bipush #64
    //   9241: iload #12
    //   9243: isub
    //   9244: istore #18
    //   9246: aload #7
    //   9248: iconst_0
    //   9249: dup2
    //   9250: iaload
    //   9251: iload #11
    //   9253: iadd
    //   9254: iastore
    //   9255: aload #7
    //   9257: iconst_0
    //   9258: dup2
    //   9259: iaload
    //   9260: iconst_m1
    //   9261: iand
    //   9262: iastore
    //   9263: aload #7
    //   9265: iconst_0
    //   9266: iaload
    //   9267: iload #11
    //   9269: if_icmpge -> 9287
    //   9272: aload #7
    //   9274: iconst_1
    //   9275: dup2
    //   9276: iaload
    //   9277: iconst_1
    //   9278: iadd
    //   9279: iastore
    //   9280: goto -> 9287
    //   9283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   9286: athrow
    //   9287: iload #12
    //   9289: ifle -> 9903
    //   9292: iload #11
    //   9294: iload #18
    //   9296: if_icmplt -> 9903
    //   9299: goto -> 9306
    //   9302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   9305: athrow
    //   9306: iconst_0
    //   9307: istore #20
    //   9309: iload #20
    //   9311: iload #18
    //   9313: if_icmpge -> 9336
    //   9316: aload #9
    //   9318: iload #12
    //   9320: iload #20
    //   9322: iadd
    //   9323: aload #19
    //   9325: iload #20
    //   9327: baload
    //   9328: bastore
    //   9329: iinc #20, 1
    //   9332: iload_2
    //   9333: ifne -> 9309
    //   9336: bipush #64
    //   9338: newarray int
    //   9340: astore #20
    //   9342: bipush #8
    //   9344: newarray int
    //   9346: astore #21
    //   9348: iconst_0
    //   9349: istore #22
    //   9351: iload #22
    //   9353: bipush #8
    //   9355: if_icmpge -> 9375
    //   9358: aload #21
    //   9360: iload #22
    //   9362: aload #8
    //   9364: iload #22
    //   9366: iaload
    //   9367: iastore
    //   9368: iinc #22, 1
    //   9371: iload_2
    //   9372: ifne -> 9351
    //   9375: iconst_0
    //   9376: istore #22
    //   9378: iload #22
    //   9380: bipush #64
    //   9382: if_icmpge -> 9873
    //   9385: iload #22
    //   9387: bipush #16
    //   9389: if_icmpge -> 9470
    //   9392: aload #20
    //   9394: iload #22
    //   9396: aload #9
    //   9398: iconst_4
    //   9399: iload #22
    //   9401: imul
    //   9402: baload
    //   9403: sipush #255
    //   9406: iand
    //   9407: bipush #24
    //   9409: ishl
    //   9410: aload #9
    //   9412: iconst_4
    //   9413: iload #22
    //   9415: imul
    //   9416: iconst_1
    //   9417: iadd
    //   9418: baload
    //   9419: sipush #255
    //   9422: iand
    //   9423: bipush #16
    //   9425: ishl
    //   9426: ior
    //   9427: aload #9
    //   9429: iconst_4
    //   9430: iload #22
    //   9432: imul
    //   9433: iconst_2
    //   9434: iadd
    //   9435: baload
    //   9436: sipush #255
    //   9439: iand
    //   9440: bipush #8
    //   9442: ishl
    //   9443: ior
    //   9444: aload #9
    //   9446: iconst_4
    //   9447: iload #22
    //   9449: imul
    //   9450: iconst_3
    //   9451: iadd
    //   9452: baload
    //   9453: sipush #255
    //   9456: iand
    //   9457: ior
    //   9458: iastore
    //   9459: iload_2
    //   9460: ifne -> 9613
    //   9463: goto -> 9470
    //   9466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   9469: athrow
    //   9470: aload #20
    //   9472: iload #22
    //   9474: aload #20
    //   9476: iload #22
    //   9478: iconst_2
    //   9479: isub
    //   9480: iaload
    //   9481: bipush #17
    //   9483: iushr
    //   9484: aload #20
    //   9486: iload #22
    //   9488: iconst_2
    //   9489: isub
    //   9490: iaload
    //   9491: bipush #15
    //   9493: ishl
    //   9494: ior
    //   9495: aload #20
    //   9497: iload #22
    //   9499: iconst_2
    //   9500: isub
    //   9501: iaload
    //   9502: bipush #19
    //   9504: iushr
    //   9505: aload #20
    //   9507: iload #22
    //   9509: iconst_2
    //   9510: isub
    //   9511: iaload
    //   9512: bipush #13
    //   9514: ishl
    //   9515: ior
    //   9516: ixor
    //   9517: aload #20
    //   9519: iload #22
    //   9521: iconst_2
    //   9522: isub
    //   9523: iaload
    //   9524: bipush #10
    //   9526: iushr
    //   9527: ixor
    //   9528: aload #20
    //   9530: iload #22
    //   9532: bipush #7
    //   9534: isub
    //   9535: iaload
    //   9536: iadd
    //   9537: aload #20
    //   9539: iload #22
    //   9541: bipush #15
    //   9543: isub
    //   9544: iaload
    //   9545: bipush #7
    //   9547: iushr
    //   9548: aload #20
    //   9550: iload #22
    //   9552: bipush #15
    //   9554: isub
    //   9555: iaload
    //   9556: bipush #25
    //   9558: ishl
    //   9559: ior
    //   9560: aload #20
    //   9562: iload #22
    //   9564: bipush #15
    //   9566: isub
    //   9567: iaload
    //   9568: bipush #18
    //   9570: iushr
    //   9571: aload #20
    //   9573: iload #22
    //   9575: bipush #15
    //   9577: isub
    //   9578: iaload
    //   9579: bipush #14
    //   9581: ishl
    //   9582: ior
    //   9583: ixor
    //   9584: aload #20
    //   9586: iload #22
    //   9588: bipush #15
    //   9590: isub
    //   9591: iaload
    //   9592: iconst_3
    //   9593: iushr
    //   9594: ixor
    //   9595: iadd
    //   9596: aload #20
    //   9598: iload #22
    //   9600: bipush #16
    //   9602: isub
    //   9603: iaload
    //   9604: iadd
    //   9605: iastore
    //   9606: goto -> 9613
    //   9609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   9612: athrow
    //   9613: aload #21
    //   9615: bipush #7
    //   9617: iaload
    //   9618: aload #21
    //   9620: iconst_4
    //   9621: iaload
    //   9622: bipush #6
    //   9624: iushr
    //   9625: aload #21
    //   9627: iconst_4
    //   9628: iaload
    //   9629: bipush #26
    //   9631: ishl
    //   9632: ior
    //   9633: aload #21
    //   9635: iconst_4
    //   9636: iaload
    //   9637: bipush #11
    //   9639: iushr
    //   9640: aload #21
    //   9642: iconst_4
    //   9643: iaload
    //   9644: bipush #21
    //   9646: ishl
    //   9647: ior
    //   9648: ixor
    //   9649: aload #21
    //   9651: iconst_4
    //   9652: iaload
    //   9653: bipush #25
    //   9655: iushr
    //   9656: aload #21
    //   9658: iconst_4
    //   9659: iaload
    //   9660: bipush #7
    //   9662: ishl
    //   9663: ior
    //   9664: ixor
    //   9665: iadd
    //   9666: aload #21
    //   9668: bipush #6
    //   9670: iaload
    //   9671: aload #21
    //   9673: iconst_4
    //   9674: iaload
    //   9675: aload #21
    //   9677: iconst_5
    //   9678: iaload
    //   9679: aload #21
    //   9681: bipush #6
    //   9683: iaload
    //   9684: ixor
    //   9685: iand
    //   9686: ixor
    //   9687: iadd
    //   9688: aload #6
    //   9690: iload #22
    //   9692: iaload
    //   9693: iadd
    //   9694: aload #20
    //   9696: iload #22
    //   9698: iaload
    //   9699: iadd
    //   9700: istore #23
    //   9702: aload #21
    //   9704: iconst_0
    //   9705: iaload
    //   9706: iconst_2
    //   9707: iushr
    //   9708: aload #21
    //   9710: iconst_0
    //   9711: iaload
    //   9712: bipush #30
    //   9714: ishl
    //   9715: ior
    //   9716: aload #21
    //   9718: iconst_0
    //   9719: iaload
    //   9720: bipush #13
    //   9722: iushr
    //   9723: aload #21
    //   9725: iconst_0
    //   9726: iaload
    //   9727: bipush #19
    //   9729: ishl
    //   9730: ior
    //   9731: ixor
    //   9732: aload #21
    //   9734: iconst_0
    //   9735: iaload
    //   9736: bipush #22
    //   9738: iushr
    //   9739: aload #21
    //   9741: iconst_0
    //   9742: iaload
    //   9743: bipush #10
    //   9745: ishl
    //   9746: ior
    //   9747: ixor
    //   9748: aload #21
    //   9750: iconst_0
    //   9751: iaload
    //   9752: aload #21
    //   9754: iconst_1
    //   9755: iaload
    //   9756: iand
    //   9757: aload #21
    //   9759: iconst_2
    //   9760: iaload
    //   9761: aload #21
    //   9763: iconst_0
    //   9764: iaload
    //   9765: aload #21
    //   9767: iconst_1
    //   9768: iaload
    //   9769: ior
    //   9770: iand
    //   9771: ior
    //   9772: iadd
    //   9773: istore #24
    //   9775: aload #21
    //   9777: iconst_3
    //   9778: dup2
    //   9779: iaload
    //   9780: iload #23
    //   9782: iadd
    //   9783: iastore
    //   9784: aload #21
    //   9786: bipush #7
    //   9788: iload #23
    //   9790: iload #24
    //   9792: iadd
    //   9793: iastore
    //   9794: aload #21
    //   9796: bipush #7
    //   9798: iaload
    //   9799: istore #23
    //   9801: aload #21
    //   9803: bipush #7
    //   9805: aload #21
    //   9807: bipush #6
    //   9809: iaload
    //   9810: iastore
    //   9811: aload #21
    //   9813: bipush #6
    //   9815: aload #21
    //   9817: iconst_5
    //   9818: iaload
    //   9819: iastore
    //   9820: aload #21
    //   9822: iconst_5
    //   9823: aload #21
    //   9825: iconst_4
    //   9826: iaload
    //   9827: iastore
    //   9828: aload #21
    //   9830: iconst_4
    //   9831: aload #21
    //   9833: iconst_3
    //   9834: iaload
    //   9835: iastore
    //   9836: aload #21
    //   9838: iconst_3
    //   9839: aload #21
    //   9841: iconst_2
    //   9842: iaload
    //   9843: iastore
    //   9844: aload #21
    //   9846: iconst_2
    //   9847: aload #21
    //   9849: iconst_1
    //   9850: iaload
    //   9851: iastore
    //   9852: aload #21
    //   9854: iconst_1
    //   9855: aload #21
    //   9857: iconst_0
    //   9858: iaload
    //   9859: iastore
    //   9860: aload #21
    //   9862: iconst_0
    //   9863: iload #23
    //   9865: iastore
    //   9866: iinc #22, 1
    //   9869: iload_2
    //   9870: ifne -> 9378
    //   9873: iconst_0
    //   9874: istore #22
    //   9876: iload #22
    //   9878: bipush #8
    //   9880: if_icmpge -> 9903
    //   9883: aload #8
    //   9885: iload #22
    //   9887: dup2
    //   9888: iaload
    //   9889: aload #21
    //   9891: iload #22
    //   9893: iaload
    //   9894: iadd
    //   9895: iastore
    //   9896: iinc #22, 1
    //   9899: iload_2
    //   9900: ifne -> 9876
    //   9903: bipush #32
    //   9905: newarray byte
    //   9907: astore #4
    //   9909: aload #4
    //   9911: iconst_0
    //   9912: aload #8
    //   9914: iconst_0
    //   9915: iaload
    //   9916: bipush #24
    //   9918: iushr
    //   9919: i2b
    //   9920: bastore
    //   9921: aload #4
    //   9923: iconst_1
    //   9924: aload #8
    //   9926: iconst_0
    //   9927: iaload
    //   9928: bipush #16
    //   9930: iushr
    //   9931: i2b
    //   9932: bastore
    //   9933: aload #4
    //   9935: iconst_2
    //   9936: aload #8
    //   9938: iconst_0
    //   9939: iaload
    //   9940: bipush #8
    //   9942: iushr
    //   9943: i2b
    //   9944: bastore
    //   9945: aload #4
    //   9947: iconst_3
    //   9948: aload #8
    //   9950: iconst_0
    //   9951: iaload
    //   9952: i2b
    //   9953: bastore
    //   9954: aload #4
    //   9956: iconst_4
    //   9957: aload #8
    //   9959: iconst_1
    //   9960: iaload
    //   9961: bipush #24
    //   9963: iushr
    //   9964: i2b
    //   9965: bastore
    //   9966: aload #4
    //   9968: iconst_5
    //   9969: aload #8
    //   9971: iconst_1
    //   9972: iaload
    //   9973: bipush #16
    //   9975: iushr
    //   9976: i2b
    //   9977: bastore
    //   9978: aload #4
    //   9980: bipush #6
    //   9982: aload #8
    //   9984: iconst_1
    //   9985: iaload
    //   9986: bipush #8
    //   9988: iushr
    //   9989: i2b
    //   9990: bastore
    //   9991: aload #4
    //   9993: bipush #7
    //   9995: aload #8
    //   9997: iconst_1
    //   9998: iaload
    //   9999: i2b
    //   10000: bastore
    //   10001: aload #4
    //   10003: bipush #8
    //   10005: aload #8
    //   10007: iconst_2
    //   10008: iaload
    //   10009: bipush #24
    //   10011: iushr
    //   10012: i2b
    //   10013: bastore
    //   10014: aload #4
    //   10016: bipush #9
    //   10018: aload #8
    //   10020: iconst_2
    //   10021: iaload
    //   10022: bipush #16
    //   10024: iushr
    //   10025: i2b
    //   10026: bastore
    //   10027: aload #4
    //   10029: bipush #10
    //   10031: aload #8
    //   10033: iconst_2
    //   10034: iaload
    //   10035: bipush #8
    //   10037: iushr
    //   10038: i2b
    //   10039: bastore
    //   10040: aload #4
    //   10042: bipush #11
    //   10044: aload #8
    //   10046: iconst_2
    //   10047: iaload
    //   10048: i2b
    //   10049: bastore
    //   10050: aload #4
    //   10052: bipush #12
    //   10054: aload #8
    //   10056: iconst_3
    //   10057: iaload
    //   10058: bipush #24
    //   10060: iushr
    //   10061: i2b
    //   10062: bastore
    //   10063: aload #4
    //   10065: bipush #13
    //   10067: aload #8
    //   10069: iconst_3
    //   10070: iaload
    //   10071: bipush #16
    //   10073: iushr
    //   10074: i2b
    //   10075: bastore
    //   10076: aload #4
    //   10078: bipush #14
    //   10080: aload #8
    //   10082: iconst_3
    //   10083: iaload
    //   10084: bipush #8
    //   10086: iushr
    //   10087: i2b
    //   10088: bastore
    //   10089: aload #4
    //   10091: bipush #15
    //   10093: aload #8
    //   10095: iconst_3
    //   10096: iaload
    //   10097: i2b
    //   10098: bastore
    //   10099: aload #4
    //   10101: bipush #16
    //   10103: aload #8
    //   10105: iconst_4
    //   10106: iaload
    //   10107: bipush #24
    //   10109: iushr
    //   10110: i2b
    //   10111: bastore
    //   10112: aload #4
    //   10114: bipush #17
    //   10116: aload #8
    //   10118: iconst_4
    //   10119: iaload
    //   10120: bipush #16
    //   10122: iushr
    //   10123: i2b
    //   10124: bastore
    //   10125: aload #4
    //   10127: bipush #18
    //   10129: aload #8
    //   10131: iconst_4
    //   10132: iaload
    //   10133: bipush #8
    //   10135: iushr
    //   10136: i2b
    //   10137: bastore
    //   10138: aload #4
    //   10140: bipush #19
    //   10142: aload #8
    //   10144: iconst_4
    //   10145: iaload
    //   10146: i2b
    //   10147: bastore
    //   10148: aload #4
    //   10150: bipush #20
    //   10152: aload #8
    //   10154: iconst_5
    //   10155: iaload
    //   10156: bipush #24
    //   10158: iushr
    //   10159: i2b
    //   10160: bastore
    //   10161: aload #4
    //   10163: bipush #21
    //   10165: aload #8
    //   10167: iconst_5
    //   10168: iaload
    //   10169: bipush #16
    //   10171: iushr
    //   10172: i2b
    //   10173: bastore
    //   10174: aload #4
    //   10176: bipush #22
    //   10178: aload #8
    //   10180: iconst_5
    //   10181: iaload
    //   10182: bipush #8
    //   10184: iushr
    //   10185: i2b
    //   10186: bastore
    //   10187: aload #4
    //   10189: bipush #23
    //   10191: aload #8
    //   10193: iconst_5
    //   10194: iaload
    //   10195: i2b
    //   10196: bastore
    //   10197: aload #4
    //   10199: bipush #24
    //   10201: aload #8
    //   10203: bipush #6
    //   10205: iaload
    //   10206: bipush #24
    //   10208: iushr
    //   10209: i2b
    //   10210: bastore
    //   10211: aload #4
    //   10213: bipush #25
    //   10215: aload #8
    //   10217: bipush #6
    //   10219: iaload
    //   10220: bipush #16
    //   10222: iushr
    //   10223: i2b
    //   10224: bastore
    //   10225: aload #4
    //   10227: bipush #26
    //   10229: aload #8
    //   10231: bipush #6
    //   10233: iaload
    //   10234: bipush #8
    //   10236: iushr
    //   10237: i2b
    //   10238: bastore
    //   10239: aload #4
    //   10241: bipush #27
    //   10243: aload #8
    //   10245: bipush #6
    //   10247: iaload
    //   10248: i2b
    //   10249: bastore
    //   10250: aload #4
    //   10252: bipush #28
    //   10254: aload #8
    //   10256: bipush #7
    //   10258: iaload
    //   10259: bipush #24
    //   10261: iushr
    //   10262: i2b
    //   10263: bastore
    //   10264: aload #4
    //   10266: bipush #29
    //   10268: aload #8
    //   10270: bipush #7
    //   10272: iaload
    //   10273: bipush #16
    //   10275: iushr
    //   10276: i2b
    //   10277: bastore
    //   10278: aload #4
    //   10280: bipush #30
    //   10282: aload #8
    //   10284: bipush #7
    //   10286: iaload
    //   10287: bipush #8
    //   10289: iushr
    //   10290: i2b
    //   10291: bastore
    //   10292: aload #4
    //   10294: bipush #31
    //   10296: aload #8
    //   10298: bipush #7
    //   10300: iaload
    //   10301: i2b
    //   10302: bastore
    //   10303: getstatic burp/Zl2q.ZI : Ljava/lang/String;
    //   10306: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   10309: checkcast java/math/BigInteger
    //   10312: invokevirtual intValue : ()I
    //   10315: bipush #32
    //   10317: irem
    //   10318: invokestatic abs : (I)I
    //   10321: invokevirtual charAt : (I)C
    //   10324: getstatic burp/Zl2g.ZI : Ljava/lang/String;
    //   10327: getstatic burp/Zb8v.ZA : Ljava/lang/Object;
    //   10330: checkcast java/math/BigInteger
    //   10333: invokevirtual intValue : ()I
    //   10336: bipush #32
    //   10338: irem
    //   10339: invokestatic abs : (I)I
    //   10342: invokevirtual charAt : (I)C
    //   10345: if_icmple -> 10460
    //   10348: getstatic burp/Zr3q.ZM : Ljava/lang/String;
    //   10351: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   10354: checkcast java/math/BigInteger
    //   10357: invokevirtual intValue : ()I
    //   10360: bipush #32
    //   10362: irem
    //   10363: invokestatic abs : (I)I
    //   10366: invokevirtual charAt : (I)C
    //   10369: getstatic burp/Zrdy.ZO : Ljava/lang/String;
    //   10372: getstatic burp/Zk9s.ZY : Ljava/lang/Object;
    //   10375: checkcast java/math/BigInteger
    //   10378: invokevirtual intValue : ()I
    //   10381: bipush #32
    //   10383: irem
    //   10384: invokestatic abs : (I)I
    //   10387: invokevirtual charAt : (I)C
    //   10390: if_icmple -> 10460
    //   10393: goto -> 10400
    //   10396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   10399: athrow
    //   10400: getstatic burp/Zb2s.Zq : Ljava/lang/String;
    //   10403: getstatic burp/Zlhm.ZT : Ljava/lang/Object;
    //   10406: checkcast java/math/BigInteger
    //   10409: invokevirtual intValue : ()I
    //   10412: bipush #32
    //   10414: irem
    //   10415: invokestatic abs : (I)I
    //   10418: invokevirtual charAt : (I)C
    //   10421: getstatic burp/Zod.ZS : Ljava/lang/String;
    //   10424: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
    //   10427: checkcast java/math/BigInteger
    //   10430: invokevirtual intValue : ()I
    //   10433: bipush #32
    //   10435: irem
    //   10436: invokestatic abs : (I)I
    //   10439: invokevirtual charAt : (I)C
    //   10442: if_icmpgt -> 10460
    //   10445: goto -> 10452
    //   10448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   10451: athrow
    //   10452: iconst_1
    //   10453: goto -> 10461
    //   10456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   10459: athrow
    //   10460: iconst_0
    //   10461: ireturn
    //   10462: astore_3
    //   10463: new java/lang/Exception
    //   10466: dup
    //   10467: aload_3
    //   10468: invokevirtual getMessage : ()Ljava/lang/String;
    //   10471: invokespecial <init> : (Ljava/lang/String;)V
    //   10474: athrow
    // Exception table:
    //   from	to	target	type
    //   4	10461	10462	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   715	729	732	java/lang/Throwable
    //   722	743	746	java/lang/Throwable
    //   736	757	760	java/lang/Throwable
    //   750	771	774	java/lang/Throwable
    //   764	785	788	java/lang/Throwable
    //   778	799	802	java/lang/Throwable
    //   792	813	816	java/lang/Throwable
    //   806	827	830	java/lang/Throwable
    //   820	837	840	java/lang/Throwable
    //   876	890	893	java/lang/Throwable
    //   883	904	907	java/lang/Throwable
    //   897	918	921	java/lang/Throwable
    //   911	932	935	java/lang/Throwable
    //   925	946	949	java/lang/Throwable
    //   939	960	963	java/lang/Throwable
    //   953	974	977	java/lang/Throwable
    //   967	988	991	java/lang/Throwable
    //   981	1005	1008	java/lang/Throwable
    //   1069	1087	1090	java/lang/Throwable
    //   1078	1103	1106	java/lang/Throwable
    //   1094	1120	1123	java/lang/Throwable
    //   1110	1136	1139	java/lang/Throwable
    //   1127	1153	1156	java/lang/Throwable
    //   1143	1169	1172	java/lang/Throwable
    //   1160	1185	1188	java/lang/Throwable
    //   1176	1208	1211	java/lang/Throwable
    //   1192	1224	1227	java/lang/Throwable
    //   1215	1240	1243	java/lang/Throwable
    //   1231	1263	1266	java/lang/Throwable
    //   1247	1279	1282	java/lang/Throwable
    //   1270	1295	1298	java/lang/Throwable
    //   1286	1314	1317	java/lang/Throwable
    //   1444	1479	1482	java/lang/Throwable
    //   1486	1527	1530	java/lang/Throwable
    //   4855	4880	4880	java/lang/Throwable
    //   5843	5869	5869	java/lang/Throwable
    //   5958	5972	5972	java/lang/Throwable
    //   5983	5996	5999	java/lang/Throwable
    //   5988	6011	6014	java/lang/Throwable
    //   6003	6029	6032	java/lang/Throwable
    //   6018	6059	6062	java/lang/Throwable
    //   6122	6149	6152	java/lang/Throwable
    //   6139	6170	6173	java/lang/Throwable
    //   6156	6200	6203	java/lang/Throwable
    //   6177	6211	6211	java/lang/Throwable
    //   6222	6238	6241	java/lang/Throwable
    //   7046	7080	7083	java/lang/Throwable
    //   7175	7253	7256	java/lang/Throwable
    //   7182	7396	7399	java/lang/Throwable
    //   7773	7788	7788	java/lang/Throwable
    //   7815	7849	7852	java/lang/Throwable
    //   7859	7871	7874	java/lang/Throwable
    //   7957	8035	8038	java/lang/Throwable
    //   7964	8178	8181	java/lang/Throwable
    //   8578	8656	8659	java/lang/Throwable
    //   8585	8799	8802	java/lang/Throwable
    //   9246	9280	9283	java/lang/Throwable
    //   9287	9299	9302	java/lang/Throwable
    //   9385	9463	9466	java/lang/Throwable
    //   9392	9606	9609	java/lang/Throwable
    //   9909	10393	10396	java/lang/Throwable
    //   10348	10445	10448	java/lang/Throwable
    //   10400	10456	10456	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '2<£íä>\\b&< ó}àÐçO­ÃÀà24;¡ àvH]¥~Edõ\\f\p-Uõ)½*çûù»ª½S¬îô\\tË¼°Öøuç^x<Ãå¦á^ÍÏ3Uî²/PEs\\téÏÃ09èùÿGmdØá-{¡w ÑÃw)ì½h%m\fú.iBýäµ$â ô\\rêqÀ\\t´éhôLp!ê*M®³óG±8Ü[~£ñ_|`½À\\fºÖÔ\ëØqysÌtXz¯! ô<ý¤ÃüO=\\nu ¶ªiókoÅÝÙ6¾¶Þ`:öÏ~*B4\\t¦\\fÈ­\\tb·'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #16
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
    //   68: ldc 'Ä®õ^¡&8*§CØì×¦\\t-è ~ðy'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #18
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
    //   129: putstatic burp/Zz1k.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz1k.b : [Ljava/lang/String;
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
    //   212: bipush #85
    //   214: goto -> 243
    //   217: bipush #32
    //   219: goto -> 243
    //   222: bipush #26
    //   224: goto -> 243
    //   227: bipush #116
    //   229: goto -> 243
    //   232: iconst_2
    //   233: goto -> 243
    //   236: bipush #86
    //   238: goto -> 243
    //   241: bipush #98
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
    //   300: sipush #-6335
    //   303: sipush #-10252
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zz1k.ZC : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #51
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-24
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-40
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-20
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-75
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-38
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #7
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #118
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-42
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #68
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-12
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #28
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-28
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-41
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #56
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #47
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #103
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-16
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-51
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-44
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-55
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-63
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #123
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-73
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-83
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: iconst_3
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #79
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #70
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #55
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #119
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-74
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-34
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zz1k.ZP : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE740) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */