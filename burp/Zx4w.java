package burp;

import java.math.BigInteger;

class Zx4w extends ClassLoader {
  static String Zo;
  
  static Object Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zi(Object paramObject) {
    Zb8v.Zo = a(14719, 10729);
    Zb8v.ZA = new BigInteger(a(14717, 27812));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zllw.Zg.charAt(Math.abs(((BigInteger)Zb8v.ZA).intValue() % 32)) <= Zm__.Zf.charAt(Math.abs(((BigInteger)Zxzj.ZO).intValue() % 32))) {
          try {
            Zsde.ZX(Class.forName(a(14713, 32176)));
            if (bool)
              Zb2s.ZH(Class.forName(a(14715, 10187))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb2s.ZH(Class.forName(a(14715, 10187)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zbo7.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zg_p.Zx : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsm3.ZC : Ljava/lang/Object;
    //   22: getstatic burp/Zkig.ZK : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: bipush #64
    //   34: newarray byte
    //   36: dup
    //   37: iconst_0
    //   38: bipush #-128
    //   40: bastore
    //   41: dup
    //   42: iconst_1
    //   43: iconst_0
    //   44: bastore
    //   45: dup
    //   46: iconst_2
    //   47: iconst_0
    //   48: bastore
    //   49: dup
    //   50: iconst_3
    //   51: iconst_0
    //   52: bastore
    //   53: dup
    //   54: iconst_4
    //   55: iconst_0
    //   56: bastore
    //   57: dup
    //   58: iconst_5
    //   59: iconst_0
    //   60: bastore
    //   61: dup
    //   62: bipush #6
    //   64: iconst_0
    //   65: bastore
    //   66: dup
    //   67: bipush #7
    //   69: iconst_0
    //   70: bastore
    //   71: dup
    //   72: bipush #8
    //   74: iconst_0
    //   75: bastore
    //   76: dup
    //   77: bipush #9
    //   79: iconst_0
    //   80: bastore
    //   81: dup
    //   82: bipush #10
    //   84: iconst_0
    //   85: bastore
    //   86: dup
    //   87: bipush #11
    //   89: iconst_0
    //   90: bastore
    //   91: dup
    //   92: bipush #12
    //   94: iconst_0
    //   95: bastore
    //   96: dup
    //   97: bipush #13
    //   99: iconst_0
    //   100: bastore
    //   101: dup
    //   102: bipush #14
    //   104: iconst_0
    //   105: bastore
    //   106: dup
    //   107: bipush #15
    //   109: iconst_0
    //   110: bastore
    //   111: dup
    //   112: bipush #16
    //   114: iconst_0
    //   115: bastore
    //   116: dup
    //   117: bipush #17
    //   119: iconst_0
    //   120: bastore
    //   121: dup
    //   122: bipush #18
    //   124: iconst_0
    //   125: bastore
    //   126: dup
    //   127: bipush #19
    //   129: iconst_0
    //   130: bastore
    //   131: dup
    //   132: bipush #20
    //   134: iconst_0
    //   135: bastore
    //   136: dup
    //   137: bipush #21
    //   139: iconst_0
    //   140: bastore
    //   141: dup
    //   142: bipush #22
    //   144: iconst_0
    //   145: bastore
    //   146: dup
    //   147: bipush #23
    //   149: iconst_0
    //   150: bastore
    //   151: dup
    //   152: bipush #24
    //   154: iconst_0
    //   155: bastore
    //   156: dup
    //   157: bipush #25
    //   159: iconst_0
    //   160: bastore
    //   161: dup
    //   162: bipush #26
    //   164: iconst_0
    //   165: bastore
    //   166: dup
    //   167: bipush #27
    //   169: iconst_0
    //   170: bastore
    //   171: dup
    //   172: bipush #28
    //   174: iconst_0
    //   175: bastore
    //   176: dup
    //   177: bipush #29
    //   179: iconst_0
    //   180: bastore
    //   181: dup
    //   182: bipush #30
    //   184: iconst_0
    //   185: bastore
    //   186: dup
    //   187: bipush #31
    //   189: iconst_0
    //   190: bastore
    //   191: dup
    //   192: bipush #32
    //   194: iconst_0
    //   195: bastore
    //   196: dup
    //   197: bipush #33
    //   199: iconst_0
    //   200: bastore
    //   201: dup
    //   202: bipush #34
    //   204: iconst_0
    //   205: bastore
    //   206: dup
    //   207: bipush #35
    //   209: iconst_0
    //   210: bastore
    //   211: dup
    //   212: bipush #36
    //   214: iconst_0
    //   215: bastore
    //   216: dup
    //   217: bipush #37
    //   219: iconst_0
    //   220: bastore
    //   221: dup
    //   222: bipush #38
    //   224: iconst_0
    //   225: bastore
    //   226: dup
    //   227: bipush #39
    //   229: iconst_0
    //   230: bastore
    //   231: dup
    //   232: bipush #40
    //   234: iconst_0
    //   235: bastore
    //   236: dup
    //   237: bipush #41
    //   239: iconst_0
    //   240: bastore
    //   241: dup
    //   242: bipush #42
    //   244: iconst_0
    //   245: bastore
    //   246: dup
    //   247: bipush #43
    //   249: iconst_0
    //   250: bastore
    //   251: dup
    //   252: bipush #44
    //   254: iconst_0
    //   255: bastore
    //   256: dup
    //   257: bipush #45
    //   259: iconst_0
    //   260: bastore
    //   261: dup
    //   262: bipush #46
    //   264: iconst_0
    //   265: bastore
    //   266: dup
    //   267: bipush #47
    //   269: iconst_0
    //   270: bastore
    //   271: dup
    //   272: bipush #48
    //   274: iconst_0
    //   275: bastore
    //   276: dup
    //   277: bipush #49
    //   279: iconst_0
    //   280: bastore
    //   281: dup
    //   282: bipush #50
    //   284: iconst_0
    //   285: bastore
    //   286: dup
    //   287: bipush #51
    //   289: iconst_0
    //   290: bastore
    //   291: dup
    //   292: bipush #52
    //   294: iconst_0
    //   295: bastore
    //   296: dup
    //   297: bipush #53
    //   299: iconst_0
    //   300: bastore
    //   301: dup
    //   302: bipush #54
    //   304: iconst_0
    //   305: bastore
    //   306: dup
    //   307: bipush #55
    //   309: iconst_0
    //   310: bastore
    //   311: dup
    //   312: bipush #56
    //   314: iconst_0
    //   315: bastore
    //   316: dup
    //   317: bipush #57
    //   319: iconst_0
    //   320: bastore
    //   321: dup
    //   322: bipush #58
    //   324: iconst_0
    //   325: bastore
    //   326: dup
    //   327: bipush #59
    //   329: iconst_0
    //   330: bastore
    //   331: dup
    //   332: bipush #60
    //   334: iconst_0
    //   335: bastore
    //   336: dup
    //   337: bipush #61
    //   339: iconst_0
    //   340: bastore
    //   341: dup
    //   342: bipush #62
    //   344: iconst_0
    //   345: bastore
    //   346: dup
    //   347: bipush #63
    //   349: iconst_0
    //   350: bastore
    //   351: astore #5
    //   353: bipush #64
    //   355: newarray int
    //   357: dup
    //   358: iconst_0
    //   359: ldc 1116352408
    //   361: iastore
    //   362: dup
    //   363: iconst_1
    //   364: ldc 1899447441
    //   366: iastore
    //   367: dup
    //   368: iconst_2
    //   369: ldc -1245643825
    //   371: iastore
    //   372: dup
    //   373: iconst_3
    //   374: ldc -373957723
    //   376: iastore
    //   377: dup
    //   378: iconst_4
    //   379: ldc 961987163
    //   381: iastore
    //   382: dup
    //   383: iconst_5
    //   384: ldc 1508970993
    //   386: iastore
    //   387: dup
    //   388: bipush #6
    //   390: ldc -1841331548
    //   392: iastore
    //   393: dup
    //   394: bipush #7
    //   396: ldc -1424204075
    //   398: iastore
    //   399: dup
    //   400: bipush #8
    //   402: ldc -670586216
    //   404: iastore
    //   405: dup
    //   406: bipush #9
    //   408: ldc 310598401
    //   410: iastore
    //   411: dup
    //   412: bipush #10
    //   414: ldc 607225278
    //   416: iastore
    //   417: dup
    //   418: bipush #11
    //   420: ldc 1426881987
    //   422: iastore
    //   423: dup
    //   424: bipush #12
    //   426: ldc 1925078388
    //   428: iastore
    //   429: dup
    //   430: bipush #13
    //   432: ldc -2132889090
    //   434: iastore
    //   435: dup
    //   436: bipush #14
    //   438: ldc -1680079193
    //   440: iastore
    //   441: dup
    //   442: bipush #15
    //   444: ldc -1046744716
    //   446: iastore
    //   447: dup
    //   448: bipush #16
    //   450: ldc -459576895
    //   452: iastore
    //   453: dup
    //   454: bipush #17
    //   456: ldc -272742522
    //   458: iastore
    //   459: dup
    //   460: bipush #18
    //   462: ldc 264347078
    //   464: iastore
    //   465: dup
    //   466: bipush #19
    //   468: ldc 604807628
    //   470: iastore
    //   471: dup
    //   472: bipush #20
    //   474: ldc 770255983
    //   476: iastore
    //   477: dup
    //   478: bipush #21
    //   480: ldc 1249150122
    //   482: iastore
    //   483: dup
    //   484: bipush #22
    //   486: ldc 1555081692
    //   488: iastore
    //   489: dup
    //   490: bipush #23
    //   492: ldc 1996064986
    //   494: iastore
    //   495: dup
    //   496: bipush #24
    //   498: ldc -1740746414
    //   500: iastore
    //   501: dup
    //   502: bipush #25
    //   504: ldc -1473132947
    //   506: iastore
    //   507: dup
    //   508: bipush #26
    //   510: ldc -1341970488
    //   512: iastore
    //   513: dup
    //   514: bipush #27
    //   516: ldc -1084653625
    //   518: iastore
    //   519: dup
    //   520: bipush #28
    //   522: ldc -958395405
    //   524: iastore
    //   525: dup
    //   526: bipush #29
    //   528: ldc -710438585
    //   530: iastore
    //   531: dup
    //   532: bipush #30
    //   534: ldc 113926993
    //   536: iastore
    //   537: dup
    //   538: bipush #31
    //   540: ldc 338241895
    //   542: iastore
    //   543: dup
    //   544: bipush #32
    //   546: ldc 666307205
    //   548: iastore
    //   549: dup
    //   550: bipush #33
    //   552: ldc 773529912
    //   554: iastore
    //   555: dup
    //   556: bipush #34
    //   558: ldc 1294757372
    //   560: iastore
    //   561: dup
    //   562: bipush #35
    //   564: ldc 1396182291
    //   566: iastore
    //   567: dup
    //   568: bipush #36
    //   570: ldc 1695183700
    //   572: iastore
    //   573: dup
    //   574: bipush #37
    //   576: ldc 1986661051
    //   578: iastore
    //   579: dup
    //   580: bipush #38
    //   582: ldc -2117940946
    //   584: iastore
    //   585: dup
    //   586: bipush #39
    //   588: ldc -1838011259
    //   590: iastore
    //   591: dup
    //   592: bipush #40
    //   594: ldc -1564481375
    //   596: iastore
    //   597: dup
    //   598: bipush #41
    //   600: ldc -1474664885
    //   602: iastore
    //   603: dup
    //   604: bipush #42
    //   606: ldc -1035236496
    //   608: iastore
    //   609: dup
    //   610: bipush #43
    //   612: ldc -949202525
    //   614: iastore
    //   615: dup
    //   616: bipush #44
    //   618: ldc -778901479
    //   620: iastore
    //   621: dup
    //   622: bipush #45
    //   624: ldc -694614492
    //   626: iastore
    //   627: dup
    //   628: bipush #46
    //   630: ldc -200395387
    //   632: iastore
    //   633: dup
    //   634: bipush #47
    //   636: ldc 275423344
    //   638: iastore
    //   639: dup
    //   640: bipush #48
    //   642: ldc 430227734
    //   644: iastore
    //   645: dup
    //   646: bipush #49
    //   648: ldc 506948616
    //   650: iastore
    //   651: dup
    //   652: bipush #50
    //   654: ldc 659060556
    //   656: iastore
    //   657: dup
    //   658: bipush #51
    //   660: ldc 883997877
    //   662: iastore
    //   663: dup
    //   664: bipush #52
    //   666: ldc 958139571
    //   668: iastore
    //   669: dup
    //   670: bipush #53
    //   672: ldc 1322822218
    //   674: iastore
    //   675: dup
    //   676: bipush #54
    //   678: ldc 1537002063
    //   680: iastore
    //   681: dup
    //   682: bipush #55
    //   684: ldc 1747873779
    //   686: iastore
    //   687: dup
    //   688: bipush #56
    //   690: ldc 1955562222
    //   692: iastore
    //   693: dup
    //   694: bipush #57
    //   696: ldc 2024104815
    //   698: iastore
    //   699: dup
    //   700: bipush #58
    //   702: ldc -2067236844
    //   704: iastore
    //   705: dup
    //   706: bipush #59
    //   708: ldc -1933114872
    //   710: iastore
    //   711: dup
    //   712: bipush #60
    //   714: ldc -1866530822
    //   716: iastore
    //   717: dup
    //   718: bipush #61
    //   720: ldc -1538233109
    //   722: iastore
    //   723: dup
    //   724: bipush #62
    //   726: ldc -1090935817
    //   728: iastore
    //   729: dup
    //   730: bipush #63
    //   732: ldc -965641998
    //   734: iastore
    //   735: astore #6
    //   737: iconst_2
    //   738: newarray int
    //   740: dup
    //   741: iconst_0
    //   742: iconst_0
    //   743: iastore
    //   744: dup
    //   745: iconst_1
    //   746: iconst_0
    //   747: iastore
    //   748: astore #7
    //   750: bipush #8
    //   752: newarray int
    //   754: dup
    //   755: iconst_0
    //   756: ldc 1779033703
    //   758: iastore
    //   759: dup
    //   760: iconst_1
    //   761: ldc -1150833019
    //   763: iastore
    //   764: dup
    //   765: iconst_2
    //   766: ldc 1013904242
    //   768: iastore
    //   769: dup
    //   770: iconst_3
    //   771: ldc -1521486534
    //   773: iastore
    //   774: dup
    //   775: iconst_4
    //   776: ldc 1359893119
    //   778: iastore
    //   779: dup
    //   780: iconst_5
    //   781: ldc -1694144372
    //   783: iastore
    //   784: dup
    //   785: bipush #6
    //   787: ldc 528734635
    //   789: iastore
    //   790: dup
    //   791: bipush #7
    //   793: ldc 1541459225
    //   795: iastore
    //   796: astore #8
    //   798: bipush #64
    //   800: newarray byte
    //   802: astore #9
    //   804: bipush #64
    //   806: newarray byte
    //   808: astore #10
    //   810: aload_3
    //   811: arraylength
    //   812: istore #11
    //   814: aload #7
    //   816: iconst_0
    //   817: iaload
    //   818: bipush #63
    //   820: iand
    //   821: istore #12
    //   823: aload #7
    //   825: iconst_0
    //   826: dup2
    //   827: iaload
    //   828: iload #11
    //   830: iadd
    //   831: iastore
    //   832: aload #7
    //   834: iconst_0
    //   835: dup2
    //   836: iaload
    //   837: iconst_m1
    //   838: iand
    //   839: iastore
    //   840: aload #7
    //   842: iconst_0
    //   843: iaload
    //   844: iload #11
    //   846: if_icmpge -> 864
    //   849: aload #7
    //   851: iconst_1
    //   852: dup2
    //   853: iaload
    //   854: iconst_1
    //   855: iadd
    //   856: iastore
    //   857: goto -> 864
    //   860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   863: athrow
    //   864: iconst_0
    //   865: istore #13
    //   867: iload #11
    //   869: bipush #64
    //   871: if_icmplt -> 1480
    //   874: iconst_0
    //   875: istore #14
    //   877: iload #14
    //   879: bipush #64
    //   881: if_icmpge -> 903
    //   884: aload #10
    //   886: iload #14
    //   888: aload_3
    //   889: iload #13
    //   891: iload #14
    //   893: iadd
    //   894: baload
    //   895: bastore
    //   896: iinc #14, 1
    //   899: iload_2
    //   900: ifne -> 877
    //   903: bipush #64
    //   905: newarray int
    //   907: astore #14
    //   909: bipush #8
    //   911: newarray int
    //   913: astore #15
    //   915: iconst_0
    //   916: istore #16
    //   918: iload #16
    //   920: bipush #8
    //   922: if_icmpge -> 942
    //   925: aload #15
    //   927: iload #16
    //   929: aload #8
    //   931: iload #16
    //   933: iaload
    //   934: iastore
    //   935: iinc #16, 1
    //   938: iload_2
    //   939: ifne -> 918
    //   942: iconst_0
    //   943: istore #16
    //   945: iload #16
    //   947: bipush #64
    //   949: if_icmpge -> 1440
    //   952: iload #16
    //   954: bipush #16
    //   956: if_icmpge -> 1037
    //   959: aload #14
    //   961: iload #16
    //   963: aload #10
    //   965: iconst_4
    //   966: iload #16
    //   968: imul
    //   969: baload
    //   970: sipush #255
    //   973: iand
    //   974: bipush #24
    //   976: ishl
    //   977: aload #10
    //   979: iconst_4
    //   980: iload #16
    //   982: imul
    //   983: iconst_1
    //   984: iadd
    //   985: baload
    //   986: sipush #255
    //   989: iand
    //   990: bipush #16
    //   992: ishl
    //   993: ior
    //   994: aload #10
    //   996: iconst_4
    //   997: iload #16
    //   999: imul
    //   1000: iconst_2
    //   1001: iadd
    //   1002: baload
    //   1003: sipush #255
    //   1006: iand
    //   1007: bipush #8
    //   1009: ishl
    //   1010: ior
    //   1011: aload #10
    //   1013: iconst_4
    //   1014: iload #16
    //   1016: imul
    //   1017: iconst_3
    //   1018: iadd
    //   1019: baload
    //   1020: sipush #255
    //   1023: iand
    //   1024: ior
    //   1025: iastore
    //   1026: iload_2
    //   1027: ifne -> 1180
    //   1030: goto -> 1037
    //   1033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1036: athrow
    //   1037: aload #14
    //   1039: iload #16
    //   1041: aload #14
    //   1043: iload #16
    //   1045: iconst_2
    //   1046: isub
    //   1047: iaload
    //   1048: bipush #17
    //   1050: iushr
    //   1051: aload #14
    //   1053: iload #16
    //   1055: iconst_2
    //   1056: isub
    //   1057: iaload
    //   1058: bipush #15
    //   1060: ishl
    //   1061: ior
    //   1062: aload #14
    //   1064: iload #16
    //   1066: iconst_2
    //   1067: isub
    //   1068: iaload
    //   1069: bipush #19
    //   1071: iushr
    //   1072: aload #14
    //   1074: iload #16
    //   1076: iconst_2
    //   1077: isub
    //   1078: iaload
    //   1079: bipush #13
    //   1081: ishl
    //   1082: ior
    //   1083: ixor
    //   1084: aload #14
    //   1086: iload #16
    //   1088: iconst_2
    //   1089: isub
    //   1090: iaload
    //   1091: bipush #10
    //   1093: iushr
    //   1094: ixor
    //   1095: aload #14
    //   1097: iload #16
    //   1099: bipush #7
    //   1101: isub
    //   1102: iaload
    //   1103: iadd
    //   1104: aload #14
    //   1106: iload #16
    //   1108: bipush #15
    //   1110: isub
    //   1111: iaload
    //   1112: bipush #7
    //   1114: iushr
    //   1115: aload #14
    //   1117: iload #16
    //   1119: bipush #15
    //   1121: isub
    //   1122: iaload
    //   1123: bipush #25
    //   1125: ishl
    //   1126: ior
    //   1127: aload #14
    //   1129: iload #16
    //   1131: bipush #15
    //   1133: isub
    //   1134: iaload
    //   1135: bipush #18
    //   1137: iushr
    //   1138: aload #14
    //   1140: iload #16
    //   1142: bipush #15
    //   1144: isub
    //   1145: iaload
    //   1146: bipush #14
    //   1148: ishl
    //   1149: ior
    //   1150: ixor
    //   1151: aload #14
    //   1153: iload #16
    //   1155: bipush #15
    //   1157: isub
    //   1158: iaload
    //   1159: iconst_3
    //   1160: iushr
    //   1161: ixor
    //   1162: iadd
    //   1163: aload #14
    //   1165: iload #16
    //   1167: bipush #16
    //   1169: isub
    //   1170: iaload
    //   1171: iadd
    //   1172: iastore
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload #15
    //   1182: bipush #7
    //   1184: iaload
    //   1185: aload #15
    //   1187: iconst_4
    //   1188: iaload
    //   1189: bipush #6
    //   1191: iushr
    //   1192: aload #15
    //   1194: iconst_4
    //   1195: iaload
    //   1196: bipush #26
    //   1198: ishl
    //   1199: ior
    //   1200: aload #15
    //   1202: iconst_4
    //   1203: iaload
    //   1204: bipush #11
    //   1206: iushr
    //   1207: aload #15
    //   1209: iconst_4
    //   1210: iaload
    //   1211: bipush #21
    //   1213: ishl
    //   1214: ior
    //   1215: ixor
    //   1216: aload #15
    //   1218: iconst_4
    //   1219: iaload
    //   1220: bipush #25
    //   1222: iushr
    //   1223: aload #15
    //   1225: iconst_4
    //   1226: iaload
    //   1227: bipush #7
    //   1229: ishl
    //   1230: ior
    //   1231: ixor
    //   1232: iadd
    //   1233: aload #15
    //   1235: bipush #6
    //   1237: iaload
    //   1238: aload #15
    //   1240: iconst_4
    //   1241: iaload
    //   1242: aload #15
    //   1244: iconst_5
    //   1245: iaload
    //   1246: aload #15
    //   1248: bipush #6
    //   1250: iaload
    //   1251: ixor
    //   1252: iand
    //   1253: ixor
    //   1254: iadd
    //   1255: aload #6
    //   1257: iload #16
    //   1259: iaload
    //   1260: iadd
    //   1261: aload #14
    //   1263: iload #16
    //   1265: iaload
    //   1266: iadd
    //   1267: istore #17
    //   1269: aload #15
    //   1271: iconst_0
    //   1272: iaload
    //   1273: iconst_2
    //   1274: iushr
    //   1275: aload #15
    //   1277: iconst_0
    //   1278: iaload
    //   1279: bipush #30
    //   1281: ishl
    //   1282: ior
    //   1283: aload #15
    //   1285: iconst_0
    //   1286: iaload
    //   1287: bipush #13
    //   1289: iushr
    //   1290: aload #15
    //   1292: iconst_0
    //   1293: iaload
    //   1294: bipush #19
    //   1296: ishl
    //   1297: ior
    //   1298: ixor
    //   1299: aload #15
    //   1301: iconst_0
    //   1302: iaload
    //   1303: bipush #22
    //   1305: iushr
    //   1306: aload #15
    //   1308: iconst_0
    //   1309: iaload
    //   1310: bipush #10
    //   1312: ishl
    //   1313: ior
    //   1314: ixor
    //   1315: aload #15
    //   1317: iconst_0
    //   1318: iaload
    //   1319: aload #15
    //   1321: iconst_1
    //   1322: iaload
    //   1323: iand
    //   1324: aload #15
    //   1326: iconst_2
    //   1327: iaload
    //   1328: aload #15
    //   1330: iconst_0
    //   1331: iaload
    //   1332: aload #15
    //   1334: iconst_1
    //   1335: iaload
    //   1336: ior
    //   1337: iand
    //   1338: ior
    //   1339: iadd
    //   1340: istore #18
    //   1342: aload #15
    //   1344: iconst_3
    //   1345: dup2
    //   1346: iaload
    //   1347: iload #17
    //   1349: iadd
    //   1350: iastore
    //   1351: aload #15
    //   1353: bipush #7
    //   1355: iload #17
    //   1357: iload #18
    //   1359: iadd
    //   1360: iastore
    //   1361: aload #15
    //   1363: bipush #7
    //   1365: iaload
    //   1366: istore #17
    //   1368: aload #15
    //   1370: bipush #7
    //   1372: aload #15
    //   1374: bipush #6
    //   1376: iaload
    //   1377: iastore
    //   1378: aload #15
    //   1380: bipush #6
    //   1382: aload #15
    //   1384: iconst_5
    //   1385: iaload
    //   1386: iastore
    //   1387: aload #15
    //   1389: iconst_5
    //   1390: aload #15
    //   1392: iconst_4
    //   1393: iaload
    //   1394: iastore
    //   1395: aload #15
    //   1397: iconst_4
    //   1398: aload #15
    //   1400: iconst_3
    //   1401: iaload
    //   1402: iastore
    //   1403: aload #15
    //   1405: iconst_3
    //   1406: aload #15
    //   1408: iconst_2
    //   1409: iaload
    //   1410: iastore
    //   1411: aload #15
    //   1413: iconst_2
    //   1414: aload #15
    //   1416: iconst_1
    //   1417: iaload
    //   1418: iastore
    //   1419: aload #15
    //   1421: iconst_1
    //   1422: aload #15
    //   1424: iconst_0
    //   1425: iaload
    //   1426: iastore
    //   1427: aload #15
    //   1429: iconst_0
    //   1430: iload #17
    //   1432: iastore
    //   1433: iinc #16, 1
    //   1436: iload_2
    //   1437: ifne -> 945
    //   1440: iconst_0
    //   1441: istore #16
    //   1443: iload #16
    //   1445: bipush #8
    //   1447: if_icmpge -> 1470
    //   1450: aload #8
    //   1452: iload #16
    //   1454: dup2
    //   1455: iaload
    //   1456: aload #15
    //   1458: iload #16
    //   1460: iaload
    //   1461: iadd
    //   1462: iastore
    //   1463: iinc #16, 1
    //   1466: iload_2
    //   1467: ifne -> 1443
    //   1470: iinc #13, 64
    //   1473: iinc #11, -64
    //   1476: iload_2
    //   1477: ifne -> 867
    //   1480: iload #11
    //   1482: ifle -> 1517
    //   1485: iconst_0
    //   1486: istore #14
    //   1488: iload #14
    //   1490: iload #11
    //   1492: if_icmpge -> 1517
    //   1495: aload #9
    //   1497: iload #12
    //   1499: iload #14
    //   1501: iadd
    //   1502: aload_3
    //   1503: iload #13
    //   1505: iload #14
    //   1507: iadd
    //   1508: baload
    //   1509: bastore
    //   1510: iinc #14, 1
    //   1513: iload_2
    //   1514: ifne -> 1488
    //   1517: aload #7
    //   1519: iconst_0
    //   1520: iaload
    //   1521: bipush #29
    //   1523: iushr
    //   1524: aload #7
    //   1526: iconst_1
    //   1527: iaload
    //   1528: iconst_3
    //   1529: ishl
    //   1530: ior
    //   1531: istore #14
    //   1533: aload #7
    //   1535: iconst_0
    //   1536: iaload
    //   1537: iconst_3
    //   1538: ishl
    //   1539: istore #15
    //   1541: aload #7
    //   1543: iconst_0
    //   1544: iaload
    //   1545: bipush #63
    //   1547: iand
    //   1548: istore #16
    //   1550: iload #16
    //   1552: bipush #56
    //   1554: if_icmpge -> 1569
    //   1557: bipush #56
    //   1559: iload #16
    //   1561: isub
    //   1562: goto -> 1574
    //   1565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1568: athrow
    //   1569: bipush #120
    //   1571: iload #16
    //   1573: isub
    //   1574: istore #17
    //   1576: aload #7
    //   1578: iconst_0
    //   1579: iaload
    //   1580: bipush #63
    //   1582: iand
    //   1583: istore #12
    //   1585: bipush #64
    //   1587: iload #12
    //   1589: isub
    //   1590: istore #18
    //   1592: aload #7
    //   1594: iconst_0
    //   1595: dup2
    //   1596: iaload
    //   1597: iload #17
    //   1599: iadd
    //   1600: iastore
    //   1601: aload #7
    //   1603: iconst_0
    //   1604: dup2
    //   1605: iaload
    //   1606: iconst_m1
    //   1607: iand
    //   1608: iastore
    //   1609: aload #7
    //   1611: iconst_0
    //   1612: iaload
    //   1613: iload #17
    //   1615: if_icmpge -> 1633
    //   1618: aload #7
    //   1620: iconst_1
    //   1621: dup2
    //   1622: iaload
    //   1623: iconst_1
    //   1624: iadd
    //   1625: iastore
    //   1626: goto -> 1633
    //   1629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1632: athrow
    //   1633: iconst_0
    //   1634: istore #13
    //   1636: iload #12
    //   1638: ifle -> 2269
    //   1641: iload #17
    //   1643: iload #18
    //   1645: if_icmplt -> 2269
    //   1648: goto -> 1655
    //   1651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1654: athrow
    //   1655: iconst_0
    //   1656: istore #19
    //   1658: iload #19
    //   1660: iload #18
    //   1662: if_icmpge -> 1685
    //   1665: aload #9
    //   1667: iload #12
    //   1669: iload #19
    //   1671: iadd
    //   1672: aload #5
    //   1674: iload #19
    //   1676: baload
    //   1677: bastore
    //   1678: iinc #19, 1
    //   1681: iload_2
    //   1682: ifne -> 1658
    //   1685: bipush #64
    //   1687: newarray int
    //   1689: astore #19
    //   1691: bipush #8
    //   1693: newarray int
    //   1695: astore #20
    //   1697: iconst_0
    //   1698: istore #21
    //   1700: iload #21
    //   1702: bipush #8
    //   1704: if_icmpge -> 1724
    //   1707: aload #20
    //   1709: iload #21
    //   1711: aload #8
    //   1713: iload #21
    //   1715: iaload
    //   1716: iastore
    //   1717: iinc #21, 1
    //   1720: iload_2
    //   1721: ifne -> 1700
    //   1724: iconst_0
    //   1725: istore #21
    //   1727: iload #21
    //   1729: bipush #64
    //   1731: if_icmpge -> 2222
    //   1734: iload #21
    //   1736: bipush #16
    //   1738: if_icmpge -> 1819
    //   1741: aload #19
    //   1743: iload #21
    //   1745: aload #9
    //   1747: iconst_4
    //   1748: iload #21
    //   1750: imul
    //   1751: baload
    //   1752: sipush #255
    //   1755: iand
    //   1756: bipush #24
    //   1758: ishl
    //   1759: aload #9
    //   1761: iconst_4
    //   1762: iload #21
    //   1764: imul
    //   1765: iconst_1
    //   1766: iadd
    //   1767: baload
    //   1768: sipush #255
    //   1771: iand
    //   1772: bipush #16
    //   1774: ishl
    //   1775: ior
    //   1776: aload #9
    //   1778: iconst_4
    //   1779: iload #21
    //   1781: imul
    //   1782: iconst_2
    //   1783: iadd
    //   1784: baload
    //   1785: sipush #255
    //   1788: iand
    //   1789: bipush #8
    //   1791: ishl
    //   1792: ior
    //   1793: aload #9
    //   1795: iconst_4
    //   1796: iload #21
    //   1798: imul
    //   1799: iconst_3
    //   1800: iadd
    //   1801: baload
    //   1802: sipush #255
    //   1805: iand
    //   1806: ior
    //   1807: iastore
    //   1808: iload_2
    //   1809: ifne -> 1962
    //   1812: goto -> 1819
    //   1815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1818: athrow
    //   1819: aload #19
    //   1821: iload #21
    //   1823: aload #19
    //   1825: iload #21
    //   1827: iconst_2
    //   1828: isub
    //   1829: iaload
    //   1830: bipush #17
    //   1832: iushr
    //   1833: aload #19
    //   1835: iload #21
    //   1837: iconst_2
    //   1838: isub
    //   1839: iaload
    //   1840: bipush #15
    //   1842: ishl
    //   1843: ior
    //   1844: aload #19
    //   1846: iload #21
    //   1848: iconst_2
    //   1849: isub
    //   1850: iaload
    //   1851: bipush #19
    //   1853: iushr
    //   1854: aload #19
    //   1856: iload #21
    //   1858: iconst_2
    //   1859: isub
    //   1860: iaload
    //   1861: bipush #13
    //   1863: ishl
    //   1864: ior
    //   1865: ixor
    //   1866: aload #19
    //   1868: iload #21
    //   1870: iconst_2
    //   1871: isub
    //   1872: iaload
    //   1873: bipush #10
    //   1875: iushr
    //   1876: ixor
    //   1877: aload #19
    //   1879: iload #21
    //   1881: bipush #7
    //   1883: isub
    //   1884: iaload
    //   1885: iadd
    //   1886: aload #19
    //   1888: iload #21
    //   1890: bipush #15
    //   1892: isub
    //   1893: iaload
    //   1894: bipush #7
    //   1896: iushr
    //   1897: aload #19
    //   1899: iload #21
    //   1901: bipush #15
    //   1903: isub
    //   1904: iaload
    //   1905: bipush #25
    //   1907: ishl
    //   1908: ior
    //   1909: aload #19
    //   1911: iload #21
    //   1913: bipush #15
    //   1915: isub
    //   1916: iaload
    //   1917: bipush #18
    //   1919: iushr
    //   1920: aload #19
    //   1922: iload #21
    //   1924: bipush #15
    //   1926: isub
    //   1927: iaload
    //   1928: bipush #14
    //   1930: ishl
    //   1931: ior
    //   1932: ixor
    //   1933: aload #19
    //   1935: iload #21
    //   1937: bipush #15
    //   1939: isub
    //   1940: iaload
    //   1941: iconst_3
    //   1942: iushr
    //   1943: ixor
    //   1944: iadd
    //   1945: aload #19
    //   1947: iload #21
    //   1949: bipush #16
    //   1951: isub
    //   1952: iaload
    //   1953: iadd
    //   1954: iastore
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1961: athrow
    //   1962: aload #20
    //   1964: bipush #7
    //   1966: iaload
    //   1967: aload #20
    //   1969: iconst_4
    //   1970: iaload
    //   1971: bipush #6
    //   1973: iushr
    //   1974: aload #20
    //   1976: iconst_4
    //   1977: iaload
    //   1978: bipush #26
    //   1980: ishl
    //   1981: ior
    //   1982: aload #20
    //   1984: iconst_4
    //   1985: iaload
    //   1986: bipush #11
    //   1988: iushr
    //   1989: aload #20
    //   1991: iconst_4
    //   1992: iaload
    //   1993: bipush #21
    //   1995: ishl
    //   1996: ior
    //   1997: ixor
    //   1998: aload #20
    //   2000: iconst_4
    //   2001: iaload
    //   2002: bipush #25
    //   2004: iushr
    //   2005: aload #20
    //   2007: iconst_4
    //   2008: iaload
    //   2009: bipush #7
    //   2011: ishl
    //   2012: ior
    //   2013: ixor
    //   2014: iadd
    //   2015: aload #20
    //   2017: bipush #6
    //   2019: iaload
    //   2020: aload #20
    //   2022: iconst_4
    //   2023: iaload
    //   2024: aload #20
    //   2026: iconst_5
    //   2027: iaload
    //   2028: aload #20
    //   2030: bipush #6
    //   2032: iaload
    //   2033: ixor
    //   2034: iand
    //   2035: ixor
    //   2036: iadd
    //   2037: aload #6
    //   2039: iload #21
    //   2041: iaload
    //   2042: iadd
    //   2043: aload #19
    //   2045: iload #21
    //   2047: iaload
    //   2048: iadd
    //   2049: istore #22
    //   2051: aload #20
    //   2053: iconst_0
    //   2054: iaload
    //   2055: iconst_2
    //   2056: iushr
    //   2057: aload #20
    //   2059: iconst_0
    //   2060: iaload
    //   2061: bipush #30
    //   2063: ishl
    //   2064: ior
    //   2065: aload #20
    //   2067: iconst_0
    //   2068: iaload
    //   2069: bipush #13
    //   2071: iushr
    //   2072: aload #20
    //   2074: iconst_0
    //   2075: iaload
    //   2076: bipush #19
    //   2078: ishl
    //   2079: ior
    //   2080: ixor
    //   2081: aload #20
    //   2083: iconst_0
    //   2084: iaload
    //   2085: bipush #22
    //   2087: iushr
    //   2088: aload #20
    //   2090: iconst_0
    //   2091: iaload
    //   2092: bipush #10
    //   2094: ishl
    //   2095: ior
    //   2096: ixor
    //   2097: aload #20
    //   2099: iconst_0
    //   2100: iaload
    //   2101: aload #20
    //   2103: iconst_1
    //   2104: iaload
    //   2105: iand
    //   2106: aload #20
    //   2108: iconst_2
    //   2109: iaload
    //   2110: aload #20
    //   2112: iconst_0
    //   2113: iaload
    //   2114: aload #20
    //   2116: iconst_1
    //   2117: iaload
    //   2118: ior
    //   2119: iand
    //   2120: ior
    //   2121: iadd
    //   2122: istore #23
    //   2124: aload #20
    //   2126: iconst_3
    //   2127: dup2
    //   2128: iaload
    //   2129: iload #22
    //   2131: iadd
    //   2132: iastore
    //   2133: aload #20
    //   2135: bipush #7
    //   2137: iload #22
    //   2139: iload #23
    //   2141: iadd
    //   2142: iastore
    //   2143: aload #20
    //   2145: bipush #7
    //   2147: iaload
    //   2148: istore #22
    //   2150: aload #20
    //   2152: bipush #7
    //   2154: aload #20
    //   2156: bipush #6
    //   2158: iaload
    //   2159: iastore
    //   2160: aload #20
    //   2162: bipush #6
    //   2164: aload #20
    //   2166: iconst_5
    //   2167: iaload
    //   2168: iastore
    //   2169: aload #20
    //   2171: iconst_5
    //   2172: aload #20
    //   2174: iconst_4
    //   2175: iaload
    //   2176: iastore
    //   2177: aload #20
    //   2179: iconst_4
    //   2180: aload #20
    //   2182: iconst_3
    //   2183: iaload
    //   2184: iastore
    //   2185: aload #20
    //   2187: iconst_3
    //   2188: aload #20
    //   2190: iconst_2
    //   2191: iaload
    //   2192: iastore
    //   2193: aload #20
    //   2195: iconst_2
    //   2196: aload #20
    //   2198: iconst_1
    //   2199: iaload
    //   2200: iastore
    //   2201: aload #20
    //   2203: iconst_1
    //   2204: aload #20
    //   2206: iconst_0
    //   2207: iaload
    //   2208: iastore
    //   2209: aload #20
    //   2211: iconst_0
    //   2212: iload #22
    //   2214: iastore
    //   2215: iinc #21, 1
    //   2218: iload_2
    //   2219: ifne -> 1727
    //   2222: iconst_0
    //   2223: istore #21
    //   2225: iload #21
    //   2227: bipush #8
    //   2229: if_icmpge -> 2252
    //   2232: aload #8
    //   2234: iload #21
    //   2236: dup2
    //   2237: iaload
    //   2238: aload #20
    //   2240: iload #21
    //   2242: iaload
    //   2243: iadd
    //   2244: iastore
    //   2245: iinc #21, 1
    //   2248: iload_2
    //   2249: ifne -> 2225
    //   2252: iload #13
    //   2254: iload #18
    //   2256: iadd
    //   2257: istore #13
    //   2259: iload #17
    //   2261: iload #18
    //   2263: isub
    //   2264: istore #17
    //   2266: iconst_0
    //   2267: istore #12
    //   2269: iload #17
    //   2271: bipush #64
    //   2273: if_icmplt -> 2883
    //   2276: iconst_0
    //   2277: istore #19
    //   2279: iload #19
    //   2281: bipush #64
    //   2283: if_icmpge -> 2306
    //   2286: aload #10
    //   2288: iload #19
    //   2290: aload #5
    //   2292: iload #13
    //   2294: iload #19
    //   2296: iadd
    //   2297: baload
    //   2298: bastore
    //   2299: iinc #19, 1
    //   2302: iload_2
    //   2303: ifne -> 2279
    //   2306: bipush #64
    //   2308: newarray int
    //   2310: astore #19
    //   2312: bipush #8
    //   2314: newarray int
    //   2316: astore #20
    //   2318: iconst_0
    //   2319: istore #21
    //   2321: iload #21
    //   2323: bipush #8
    //   2325: if_icmpge -> 2345
    //   2328: aload #20
    //   2330: iload #21
    //   2332: aload #8
    //   2334: iload #21
    //   2336: iaload
    //   2337: iastore
    //   2338: iinc #21, 1
    //   2341: iload_2
    //   2342: ifne -> 2321
    //   2345: iconst_0
    //   2346: istore #21
    //   2348: iload #21
    //   2350: bipush #64
    //   2352: if_icmpge -> 2843
    //   2355: iload #21
    //   2357: bipush #16
    //   2359: if_icmpge -> 2440
    //   2362: aload #19
    //   2364: iload #21
    //   2366: aload #10
    //   2368: iconst_4
    //   2369: iload #21
    //   2371: imul
    //   2372: baload
    //   2373: sipush #255
    //   2376: iand
    //   2377: bipush #24
    //   2379: ishl
    //   2380: aload #10
    //   2382: iconst_4
    //   2383: iload #21
    //   2385: imul
    //   2386: iconst_1
    //   2387: iadd
    //   2388: baload
    //   2389: sipush #255
    //   2392: iand
    //   2393: bipush #16
    //   2395: ishl
    //   2396: ior
    //   2397: aload #10
    //   2399: iconst_4
    //   2400: iload #21
    //   2402: imul
    //   2403: iconst_2
    //   2404: iadd
    //   2405: baload
    //   2406: sipush #255
    //   2409: iand
    //   2410: bipush #8
    //   2412: ishl
    //   2413: ior
    //   2414: aload #10
    //   2416: iconst_4
    //   2417: iload #21
    //   2419: imul
    //   2420: iconst_3
    //   2421: iadd
    //   2422: baload
    //   2423: sipush #255
    //   2426: iand
    //   2427: ior
    //   2428: iastore
    //   2429: iload_2
    //   2430: ifne -> 2583
    //   2433: goto -> 2440
    //   2436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2439: athrow
    //   2440: aload #19
    //   2442: iload #21
    //   2444: aload #19
    //   2446: iload #21
    //   2448: iconst_2
    //   2449: isub
    //   2450: iaload
    //   2451: bipush #17
    //   2453: iushr
    //   2454: aload #19
    //   2456: iload #21
    //   2458: iconst_2
    //   2459: isub
    //   2460: iaload
    //   2461: bipush #15
    //   2463: ishl
    //   2464: ior
    //   2465: aload #19
    //   2467: iload #21
    //   2469: iconst_2
    //   2470: isub
    //   2471: iaload
    //   2472: bipush #19
    //   2474: iushr
    //   2475: aload #19
    //   2477: iload #21
    //   2479: iconst_2
    //   2480: isub
    //   2481: iaload
    //   2482: bipush #13
    //   2484: ishl
    //   2485: ior
    //   2486: ixor
    //   2487: aload #19
    //   2489: iload #21
    //   2491: iconst_2
    //   2492: isub
    //   2493: iaload
    //   2494: bipush #10
    //   2496: iushr
    //   2497: ixor
    //   2498: aload #19
    //   2500: iload #21
    //   2502: bipush #7
    //   2504: isub
    //   2505: iaload
    //   2506: iadd
    //   2507: aload #19
    //   2509: iload #21
    //   2511: bipush #15
    //   2513: isub
    //   2514: iaload
    //   2515: bipush #7
    //   2517: iushr
    //   2518: aload #19
    //   2520: iload #21
    //   2522: bipush #15
    //   2524: isub
    //   2525: iaload
    //   2526: bipush #25
    //   2528: ishl
    //   2529: ior
    //   2530: aload #19
    //   2532: iload #21
    //   2534: bipush #15
    //   2536: isub
    //   2537: iaload
    //   2538: bipush #18
    //   2540: iushr
    //   2541: aload #19
    //   2543: iload #21
    //   2545: bipush #15
    //   2547: isub
    //   2548: iaload
    //   2549: bipush #14
    //   2551: ishl
    //   2552: ior
    //   2553: ixor
    //   2554: aload #19
    //   2556: iload #21
    //   2558: bipush #15
    //   2560: isub
    //   2561: iaload
    //   2562: iconst_3
    //   2563: iushr
    //   2564: ixor
    //   2565: iadd
    //   2566: aload #19
    //   2568: iload #21
    //   2570: bipush #16
    //   2572: isub
    //   2573: iaload
    //   2574: iadd
    //   2575: iastore
    //   2576: goto -> 2583
    //   2579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2582: athrow
    //   2583: aload #20
    //   2585: bipush #7
    //   2587: iaload
    //   2588: aload #20
    //   2590: iconst_4
    //   2591: iaload
    //   2592: bipush #6
    //   2594: iushr
    //   2595: aload #20
    //   2597: iconst_4
    //   2598: iaload
    //   2599: bipush #26
    //   2601: ishl
    //   2602: ior
    //   2603: aload #20
    //   2605: iconst_4
    //   2606: iaload
    //   2607: bipush #11
    //   2609: iushr
    //   2610: aload #20
    //   2612: iconst_4
    //   2613: iaload
    //   2614: bipush #21
    //   2616: ishl
    //   2617: ior
    //   2618: ixor
    //   2619: aload #20
    //   2621: iconst_4
    //   2622: iaload
    //   2623: bipush #25
    //   2625: iushr
    //   2626: aload #20
    //   2628: iconst_4
    //   2629: iaload
    //   2630: bipush #7
    //   2632: ishl
    //   2633: ior
    //   2634: ixor
    //   2635: iadd
    //   2636: aload #20
    //   2638: bipush #6
    //   2640: iaload
    //   2641: aload #20
    //   2643: iconst_4
    //   2644: iaload
    //   2645: aload #20
    //   2647: iconst_5
    //   2648: iaload
    //   2649: aload #20
    //   2651: bipush #6
    //   2653: iaload
    //   2654: ixor
    //   2655: iand
    //   2656: ixor
    //   2657: iadd
    //   2658: aload #6
    //   2660: iload #21
    //   2662: iaload
    //   2663: iadd
    //   2664: aload #19
    //   2666: iload #21
    //   2668: iaload
    //   2669: iadd
    //   2670: istore #22
    //   2672: aload #20
    //   2674: iconst_0
    //   2675: iaload
    //   2676: iconst_2
    //   2677: iushr
    //   2678: aload #20
    //   2680: iconst_0
    //   2681: iaload
    //   2682: bipush #30
    //   2684: ishl
    //   2685: ior
    //   2686: aload #20
    //   2688: iconst_0
    //   2689: iaload
    //   2690: bipush #13
    //   2692: iushr
    //   2693: aload #20
    //   2695: iconst_0
    //   2696: iaload
    //   2697: bipush #19
    //   2699: ishl
    //   2700: ior
    //   2701: ixor
    //   2702: aload #20
    //   2704: iconst_0
    //   2705: iaload
    //   2706: bipush #22
    //   2708: iushr
    //   2709: aload #20
    //   2711: iconst_0
    //   2712: iaload
    //   2713: bipush #10
    //   2715: ishl
    //   2716: ior
    //   2717: ixor
    //   2718: aload #20
    //   2720: iconst_0
    //   2721: iaload
    //   2722: aload #20
    //   2724: iconst_1
    //   2725: iaload
    //   2726: iand
    //   2727: aload #20
    //   2729: iconst_2
    //   2730: iaload
    //   2731: aload #20
    //   2733: iconst_0
    //   2734: iaload
    //   2735: aload #20
    //   2737: iconst_1
    //   2738: iaload
    //   2739: ior
    //   2740: iand
    //   2741: ior
    //   2742: iadd
    //   2743: istore #23
    //   2745: aload #20
    //   2747: iconst_3
    //   2748: dup2
    //   2749: iaload
    //   2750: iload #22
    //   2752: iadd
    //   2753: iastore
    //   2754: aload #20
    //   2756: bipush #7
    //   2758: iload #22
    //   2760: iload #23
    //   2762: iadd
    //   2763: iastore
    //   2764: aload #20
    //   2766: bipush #7
    //   2768: iaload
    //   2769: istore #22
    //   2771: aload #20
    //   2773: bipush #7
    //   2775: aload #20
    //   2777: bipush #6
    //   2779: iaload
    //   2780: iastore
    //   2781: aload #20
    //   2783: bipush #6
    //   2785: aload #20
    //   2787: iconst_5
    //   2788: iaload
    //   2789: iastore
    //   2790: aload #20
    //   2792: iconst_5
    //   2793: aload #20
    //   2795: iconst_4
    //   2796: iaload
    //   2797: iastore
    //   2798: aload #20
    //   2800: iconst_4
    //   2801: aload #20
    //   2803: iconst_3
    //   2804: iaload
    //   2805: iastore
    //   2806: aload #20
    //   2808: iconst_3
    //   2809: aload #20
    //   2811: iconst_2
    //   2812: iaload
    //   2813: iastore
    //   2814: aload #20
    //   2816: iconst_2
    //   2817: aload #20
    //   2819: iconst_1
    //   2820: iaload
    //   2821: iastore
    //   2822: aload #20
    //   2824: iconst_1
    //   2825: aload #20
    //   2827: iconst_0
    //   2828: iaload
    //   2829: iastore
    //   2830: aload #20
    //   2832: iconst_0
    //   2833: iload #22
    //   2835: iastore
    //   2836: iinc #21, 1
    //   2839: iload_2
    //   2840: ifne -> 2348
    //   2843: iconst_0
    //   2844: istore #21
    //   2846: iload #21
    //   2848: bipush #8
    //   2850: if_icmpge -> 2873
    //   2853: aload #8
    //   2855: iload #21
    //   2857: dup2
    //   2858: iaload
    //   2859: aload #20
    //   2861: iload #21
    //   2863: iaload
    //   2864: iadd
    //   2865: iastore
    //   2866: iinc #21, 1
    //   2869: iload_2
    //   2870: ifne -> 2846
    //   2873: iinc #13, 64
    //   2876: iinc #17, -64
    //   2879: iload_2
    //   2880: ifne -> 2269
    //   2883: iload #17
    //   2885: ifle -> 2921
    //   2888: iconst_0
    //   2889: istore #19
    //   2891: iload #19
    //   2893: iload #17
    //   2895: if_icmpge -> 2921
    //   2898: aload #9
    //   2900: iload #12
    //   2902: iload #19
    //   2904: iadd
    //   2905: aload #5
    //   2907: iload #13
    //   2909: iload #19
    //   2911: iadd
    //   2912: baload
    //   2913: bastore
    //   2914: iinc #19, 1
    //   2917: iload_2
    //   2918: ifne -> 2891
    //   2921: bipush #8
    //   2923: newarray byte
    //   2925: astore #19
    //   2927: aload #19
    //   2929: iconst_0
    //   2930: iload #14
    //   2932: bipush #24
    //   2934: iushr
    //   2935: i2b
    //   2936: bastore
    //   2937: aload #19
    //   2939: iconst_1
    //   2940: iload #14
    //   2942: bipush #16
    //   2944: iushr
    //   2945: i2b
    //   2946: bastore
    //   2947: aload #19
    //   2949: iconst_2
    //   2950: iload #14
    //   2952: bipush #8
    //   2954: iushr
    //   2955: i2b
    //   2956: bastore
    //   2957: aload #19
    //   2959: iconst_3
    //   2960: iload #14
    //   2962: i2b
    //   2963: bastore
    //   2964: aload #19
    //   2966: iconst_4
    //   2967: iload #15
    //   2969: bipush #24
    //   2971: iushr
    //   2972: i2b
    //   2973: bastore
    //   2974: aload #19
    //   2976: iconst_5
    //   2977: iload #15
    //   2979: bipush #16
    //   2981: iushr
    //   2982: i2b
    //   2983: bastore
    //   2984: aload #19
    //   2986: bipush #6
    //   2988: iload #15
    //   2990: bipush #8
    //   2992: iushr
    //   2993: i2b
    //   2994: bastore
    //   2995: aload #19
    //   2997: bipush #7
    //   2999: iload #15
    //   3001: i2b
    //   3002: bastore
    //   3003: bipush #8
    //   3005: istore #11
    //   3007: aload #7
    //   3009: iconst_0
    //   3010: iaload
    //   3011: bipush #63
    //   3013: iand
    //   3014: istore #12
    //   3016: bipush #64
    //   3018: iload #12
    //   3020: isub
    //   3021: istore #18
    //   3023: aload #7
    //   3025: iconst_0
    //   3026: dup2
    //   3027: iaload
    //   3028: iload #11
    //   3030: iadd
    //   3031: iastore
    //   3032: aload #7
    //   3034: iconst_0
    //   3035: dup2
    //   3036: iaload
    //   3037: iconst_m1
    //   3038: iand
    //   3039: iastore
    //   3040: aload #7
    //   3042: iconst_0
    //   3043: iaload
    //   3044: iload #11
    //   3046: if_icmpge -> 3064
    //   3049: aload #7
    //   3051: iconst_1
    //   3052: dup2
    //   3053: iaload
    //   3054: iconst_1
    //   3055: iadd
    //   3056: iastore
    //   3057: goto -> 3064
    //   3060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3063: athrow
    //   3064: iload #12
    //   3066: ifle -> 3680
    //   3069: iload #11
    //   3071: iload #18
    //   3073: if_icmplt -> 3680
    //   3076: goto -> 3083
    //   3079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3082: athrow
    //   3083: iconst_0
    //   3084: istore #20
    //   3086: iload #20
    //   3088: iload #18
    //   3090: if_icmpge -> 3113
    //   3093: aload #9
    //   3095: iload #12
    //   3097: iload #20
    //   3099: iadd
    //   3100: aload #19
    //   3102: iload #20
    //   3104: baload
    //   3105: bastore
    //   3106: iinc #20, 1
    //   3109: iload_2
    //   3110: ifne -> 3086
    //   3113: bipush #64
    //   3115: newarray int
    //   3117: astore #20
    //   3119: bipush #8
    //   3121: newarray int
    //   3123: astore #21
    //   3125: iconst_0
    //   3126: istore #22
    //   3128: iload #22
    //   3130: bipush #8
    //   3132: if_icmpge -> 3152
    //   3135: aload #21
    //   3137: iload #22
    //   3139: aload #8
    //   3141: iload #22
    //   3143: iaload
    //   3144: iastore
    //   3145: iinc #22, 1
    //   3148: iload_2
    //   3149: ifne -> 3128
    //   3152: iconst_0
    //   3153: istore #22
    //   3155: iload #22
    //   3157: bipush #64
    //   3159: if_icmpge -> 3650
    //   3162: iload #22
    //   3164: bipush #16
    //   3166: if_icmpge -> 3247
    //   3169: aload #20
    //   3171: iload #22
    //   3173: aload #9
    //   3175: iconst_4
    //   3176: iload #22
    //   3178: imul
    //   3179: baload
    //   3180: sipush #255
    //   3183: iand
    //   3184: bipush #24
    //   3186: ishl
    //   3187: aload #9
    //   3189: iconst_4
    //   3190: iload #22
    //   3192: imul
    //   3193: iconst_1
    //   3194: iadd
    //   3195: baload
    //   3196: sipush #255
    //   3199: iand
    //   3200: bipush #16
    //   3202: ishl
    //   3203: ior
    //   3204: aload #9
    //   3206: iconst_4
    //   3207: iload #22
    //   3209: imul
    //   3210: iconst_2
    //   3211: iadd
    //   3212: baload
    //   3213: sipush #255
    //   3216: iand
    //   3217: bipush #8
    //   3219: ishl
    //   3220: ior
    //   3221: aload #9
    //   3223: iconst_4
    //   3224: iload #22
    //   3226: imul
    //   3227: iconst_3
    //   3228: iadd
    //   3229: baload
    //   3230: sipush #255
    //   3233: iand
    //   3234: ior
    //   3235: iastore
    //   3236: iload_2
    //   3237: ifne -> 3390
    //   3240: goto -> 3247
    //   3243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3246: athrow
    //   3247: aload #20
    //   3249: iload #22
    //   3251: aload #20
    //   3253: iload #22
    //   3255: iconst_2
    //   3256: isub
    //   3257: iaload
    //   3258: bipush #17
    //   3260: iushr
    //   3261: aload #20
    //   3263: iload #22
    //   3265: iconst_2
    //   3266: isub
    //   3267: iaload
    //   3268: bipush #15
    //   3270: ishl
    //   3271: ior
    //   3272: aload #20
    //   3274: iload #22
    //   3276: iconst_2
    //   3277: isub
    //   3278: iaload
    //   3279: bipush #19
    //   3281: iushr
    //   3282: aload #20
    //   3284: iload #22
    //   3286: iconst_2
    //   3287: isub
    //   3288: iaload
    //   3289: bipush #13
    //   3291: ishl
    //   3292: ior
    //   3293: ixor
    //   3294: aload #20
    //   3296: iload #22
    //   3298: iconst_2
    //   3299: isub
    //   3300: iaload
    //   3301: bipush #10
    //   3303: iushr
    //   3304: ixor
    //   3305: aload #20
    //   3307: iload #22
    //   3309: bipush #7
    //   3311: isub
    //   3312: iaload
    //   3313: iadd
    //   3314: aload #20
    //   3316: iload #22
    //   3318: bipush #15
    //   3320: isub
    //   3321: iaload
    //   3322: bipush #7
    //   3324: iushr
    //   3325: aload #20
    //   3327: iload #22
    //   3329: bipush #15
    //   3331: isub
    //   3332: iaload
    //   3333: bipush #25
    //   3335: ishl
    //   3336: ior
    //   3337: aload #20
    //   3339: iload #22
    //   3341: bipush #15
    //   3343: isub
    //   3344: iaload
    //   3345: bipush #18
    //   3347: iushr
    //   3348: aload #20
    //   3350: iload #22
    //   3352: bipush #15
    //   3354: isub
    //   3355: iaload
    //   3356: bipush #14
    //   3358: ishl
    //   3359: ior
    //   3360: ixor
    //   3361: aload #20
    //   3363: iload #22
    //   3365: bipush #15
    //   3367: isub
    //   3368: iaload
    //   3369: iconst_3
    //   3370: iushr
    //   3371: ixor
    //   3372: iadd
    //   3373: aload #20
    //   3375: iload #22
    //   3377: bipush #16
    //   3379: isub
    //   3380: iaload
    //   3381: iadd
    //   3382: iastore
    //   3383: goto -> 3390
    //   3386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3389: athrow
    //   3390: aload #21
    //   3392: bipush #7
    //   3394: iaload
    //   3395: aload #21
    //   3397: iconst_4
    //   3398: iaload
    //   3399: bipush #6
    //   3401: iushr
    //   3402: aload #21
    //   3404: iconst_4
    //   3405: iaload
    //   3406: bipush #26
    //   3408: ishl
    //   3409: ior
    //   3410: aload #21
    //   3412: iconst_4
    //   3413: iaload
    //   3414: bipush #11
    //   3416: iushr
    //   3417: aload #21
    //   3419: iconst_4
    //   3420: iaload
    //   3421: bipush #21
    //   3423: ishl
    //   3424: ior
    //   3425: ixor
    //   3426: aload #21
    //   3428: iconst_4
    //   3429: iaload
    //   3430: bipush #25
    //   3432: iushr
    //   3433: aload #21
    //   3435: iconst_4
    //   3436: iaload
    //   3437: bipush #7
    //   3439: ishl
    //   3440: ior
    //   3441: ixor
    //   3442: iadd
    //   3443: aload #21
    //   3445: bipush #6
    //   3447: iaload
    //   3448: aload #21
    //   3450: iconst_4
    //   3451: iaload
    //   3452: aload #21
    //   3454: iconst_5
    //   3455: iaload
    //   3456: aload #21
    //   3458: bipush #6
    //   3460: iaload
    //   3461: ixor
    //   3462: iand
    //   3463: ixor
    //   3464: iadd
    //   3465: aload #6
    //   3467: iload #22
    //   3469: iaload
    //   3470: iadd
    //   3471: aload #20
    //   3473: iload #22
    //   3475: iaload
    //   3476: iadd
    //   3477: istore #23
    //   3479: aload #21
    //   3481: iconst_0
    //   3482: iaload
    //   3483: iconst_2
    //   3484: iushr
    //   3485: aload #21
    //   3487: iconst_0
    //   3488: iaload
    //   3489: bipush #30
    //   3491: ishl
    //   3492: ior
    //   3493: aload #21
    //   3495: iconst_0
    //   3496: iaload
    //   3497: bipush #13
    //   3499: iushr
    //   3500: aload #21
    //   3502: iconst_0
    //   3503: iaload
    //   3504: bipush #19
    //   3506: ishl
    //   3507: ior
    //   3508: ixor
    //   3509: aload #21
    //   3511: iconst_0
    //   3512: iaload
    //   3513: bipush #22
    //   3515: iushr
    //   3516: aload #21
    //   3518: iconst_0
    //   3519: iaload
    //   3520: bipush #10
    //   3522: ishl
    //   3523: ior
    //   3524: ixor
    //   3525: aload #21
    //   3527: iconst_0
    //   3528: iaload
    //   3529: aload #21
    //   3531: iconst_1
    //   3532: iaload
    //   3533: iand
    //   3534: aload #21
    //   3536: iconst_2
    //   3537: iaload
    //   3538: aload #21
    //   3540: iconst_0
    //   3541: iaload
    //   3542: aload #21
    //   3544: iconst_1
    //   3545: iaload
    //   3546: ior
    //   3547: iand
    //   3548: ior
    //   3549: iadd
    //   3550: istore #24
    //   3552: aload #21
    //   3554: iconst_3
    //   3555: dup2
    //   3556: iaload
    //   3557: iload #23
    //   3559: iadd
    //   3560: iastore
    //   3561: aload #21
    //   3563: bipush #7
    //   3565: iload #23
    //   3567: iload #24
    //   3569: iadd
    //   3570: iastore
    //   3571: aload #21
    //   3573: bipush #7
    //   3575: iaload
    //   3576: istore #23
    //   3578: aload #21
    //   3580: bipush #7
    //   3582: aload #21
    //   3584: bipush #6
    //   3586: iaload
    //   3587: iastore
    //   3588: aload #21
    //   3590: bipush #6
    //   3592: aload #21
    //   3594: iconst_5
    //   3595: iaload
    //   3596: iastore
    //   3597: aload #21
    //   3599: iconst_5
    //   3600: aload #21
    //   3602: iconst_4
    //   3603: iaload
    //   3604: iastore
    //   3605: aload #21
    //   3607: iconst_4
    //   3608: aload #21
    //   3610: iconst_3
    //   3611: iaload
    //   3612: iastore
    //   3613: aload #21
    //   3615: iconst_3
    //   3616: aload #21
    //   3618: iconst_2
    //   3619: iaload
    //   3620: iastore
    //   3621: aload #21
    //   3623: iconst_2
    //   3624: aload #21
    //   3626: iconst_1
    //   3627: iaload
    //   3628: iastore
    //   3629: aload #21
    //   3631: iconst_1
    //   3632: aload #21
    //   3634: iconst_0
    //   3635: iaload
    //   3636: iastore
    //   3637: aload #21
    //   3639: iconst_0
    //   3640: iload #23
    //   3642: iastore
    //   3643: iinc #22, 1
    //   3646: iload_2
    //   3647: ifne -> 3155
    //   3650: iconst_0
    //   3651: istore #22
    //   3653: iload #22
    //   3655: bipush #8
    //   3657: if_icmpge -> 3680
    //   3660: aload #8
    //   3662: iload #22
    //   3664: dup2
    //   3665: iaload
    //   3666: aload #21
    //   3668: iload #22
    //   3670: iaload
    //   3671: iadd
    //   3672: iastore
    //   3673: iinc #22, 1
    //   3676: iload_2
    //   3677: ifne -> 3653
    //   3680: bipush #32
    //   3682: newarray byte
    //   3684: astore #4
    //   3686: sipush #14718
    //   3689: aload #4
    //   3691: iconst_0
    //   3692: aload #8
    //   3694: iconst_0
    //   3695: iaload
    //   3696: bipush #24
    //   3698: iushr
    //   3699: i2b
    //   3700: bastore
    //   3701: sipush #372
    //   3704: aload #4
    //   3706: iconst_1
    //   3707: aload #8
    //   3709: iconst_0
    //   3710: iaload
    //   3711: bipush #16
    //   3713: iushr
    //   3714: i2b
    //   3715: bastore
    //   3716: aload #4
    //   3718: iconst_2
    //   3719: aload #8
    //   3721: iconst_0
    //   3722: iaload
    //   3723: bipush #8
    //   3725: iushr
    //   3726: i2b
    //   3727: bastore
    //   3728: aload #4
    //   3730: iconst_3
    //   3731: aload #8
    //   3733: iconst_0
    //   3734: iaload
    //   3735: i2b
    //   3736: bastore
    //   3737: aload #4
    //   3739: iconst_4
    //   3740: aload #8
    //   3742: iconst_1
    //   3743: iaload
    //   3744: bipush #24
    //   3746: iushr
    //   3747: i2b
    //   3748: bastore
    //   3749: aload #4
    //   3751: iconst_5
    //   3752: aload #8
    //   3754: iconst_1
    //   3755: iaload
    //   3756: bipush #16
    //   3758: iushr
    //   3759: i2b
    //   3760: bastore
    //   3761: aload #4
    //   3763: bipush #6
    //   3765: aload #8
    //   3767: iconst_1
    //   3768: iaload
    //   3769: bipush #8
    //   3771: iushr
    //   3772: i2b
    //   3773: bastore
    //   3774: aload #4
    //   3776: bipush #7
    //   3778: aload #8
    //   3780: iconst_1
    //   3781: iaload
    //   3782: i2b
    //   3783: bastore
    //   3784: aload #4
    //   3786: bipush #8
    //   3788: aload #8
    //   3790: iconst_2
    //   3791: iaload
    //   3792: bipush #24
    //   3794: iushr
    //   3795: i2b
    //   3796: bastore
    //   3797: aload #4
    //   3799: bipush #9
    //   3801: aload #8
    //   3803: iconst_2
    //   3804: iaload
    //   3805: bipush #16
    //   3807: iushr
    //   3808: i2b
    //   3809: bastore
    //   3810: aload #4
    //   3812: bipush #10
    //   3814: aload #8
    //   3816: iconst_2
    //   3817: iaload
    //   3818: bipush #8
    //   3820: iushr
    //   3821: i2b
    //   3822: bastore
    //   3823: aload #4
    //   3825: bipush #11
    //   3827: aload #8
    //   3829: iconst_2
    //   3830: iaload
    //   3831: i2b
    //   3832: bastore
    //   3833: aload #4
    //   3835: bipush #12
    //   3837: aload #8
    //   3839: iconst_3
    //   3840: iaload
    //   3841: bipush #24
    //   3843: iushr
    //   3844: i2b
    //   3845: bastore
    //   3846: aload #4
    //   3848: bipush #13
    //   3850: aload #8
    //   3852: iconst_3
    //   3853: iaload
    //   3854: bipush #16
    //   3856: iushr
    //   3857: i2b
    //   3858: bastore
    //   3859: aload #4
    //   3861: bipush #14
    //   3863: aload #8
    //   3865: iconst_3
    //   3866: iaload
    //   3867: bipush #8
    //   3869: iushr
    //   3870: i2b
    //   3871: bastore
    //   3872: aload #4
    //   3874: bipush #15
    //   3876: aload #8
    //   3878: iconst_3
    //   3879: iaload
    //   3880: i2b
    //   3881: bastore
    //   3882: aload #4
    //   3884: bipush #16
    //   3886: aload #8
    //   3888: iconst_4
    //   3889: iaload
    //   3890: bipush #24
    //   3892: iushr
    //   3893: i2b
    //   3894: bastore
    //   3895: aload #4
    //   3897: bipush #17
    //   3899: aload #8
    //   3901: iconst_4
    //   3902: iaload
    //   3903: bipush #16
    //   3905: iushr
    //   3906: i2b
    //   3907: bastore
    //   3908: aload #4
    //   3910: bipush #18
    //   3912: aload #8
    //   3914: iconst_4
    //   3915: iaload
    //   3916: bipush #8
    //   3918: iushr
    //   3919: i2b
    //   3920: bastore
    //   3921: aload #4
    //   3923: bipush #19
    //   3925: aload #8
    //   3927: iconst_4
    //   3928: iaload
    //   3929: i2b
    //   3930: bastore
    //   3931: aload #4
    //   3933: bipush #20
    //   3935: aload #8
    //   3937: iconst_5
    //   3938: iaload
    //   3939: bipush #24
    //   3941: iushr
    //   3942: i2b
    //   3943: bastore
    //   3944: aload #4
    //   3946: bipush #21
    //   3948: aload #8
    //   3950: iconst_5
    //   3951: iaload
    //   3952: bipush #16
    //   3954: iushr
    //   3955: i2b
    //   3956: bastore
    //   3957: aload #4
    //   3959: bipush #22
    //   3961: aload #8
    //   3963: iconst_5
    //   3964: iaload
    //   3965: bipush #8
    //   3967: iushr
    //   3968: i2b
    //   3969: bastore
    //   3970: aload #4
    //   3972: bipush #23
    //   3974: aload #8
    //   3976: iconst_5
    //   3977: iaload
    //   3978: i2b
    //   3979: bastore
    //   3980: aload #4
    //   3982: bipush #24
    //   3984: aload #8
    //   3986: bipush #6
    //   3988: iaload
    //   3989: bipush #24
    //   3991: iushr
    //   3992: i2b
    //   3993: bastore
    //   3994: aload #4
    //   3996: bipush #25
    //   3998: aload #8
    //   4000: bipush #6
    //   4002: iaload
    //   4003: bipush #16
    //   4005: iushr
    //   4006: i2b
    //   4007: bastore
    //   4008: aload #4
    //   4010: bipush #26
    //   4012: aload #8
    //   4014: bipush #6
    //   4016: iaload
    //   4017: bipush #8
    //   4019: iushr
    //   4020: i2b
    //   4021: bastore
    //   4022: aload #4
    //   4024: bipush #27
    //   4026: aload #8
    //   4028: bipush #6
    //   4030: iaload
    //   4031: i2b
    //   4032: bastore
    //   4033: aload #4
    //   4035: bipush #28
    //   4037: aload #8
    //   4039: bipush #7
    //   4041: iaload
    //   4042: bipush #24
    //   4044: iushr
    //   4045: i2b
    //   4046: bastore
    //   4047: aload #4
    //   4049: bipush #29
    //   4051: aload #8
    //   4053: bipush #7
    //   4055: iaload
    //   4056: bipush #16
    //   4058: iushr
    //   4059: i2b
    //   4060: bastore
    //   4061: aload #4
    //   4063: bipush #30
    //   4065: aload #8
    //   4067: bipush #7
    //   4069: iaload
    //   4070: bipush #8
    //   4072: iushr
    //   4073: i2b
    //   4074: bastore
    //   4075: aload #4
    //   4077: bipush #31
    //   4079: aload #8
    //   4081: bipush #7
    //   4083: iaload
    //   4084: i2b
    //   4085: bastore
    //   4086: new java/math/BigInteger
    //   4089: dup
    //   4090: aload #4
    //   4092: invokespecial <init> : ([B)V
    //   4095: invokevirtual abs : ()Ljava/math/BigInteger;
    //   4098: putstatic burp/Zbo7.Zl : Ljava/lang/Object;
    //   4101: invokestatic a : (II)Ljava/lang/String;
    //   4104: iconst_1
    //   4105: ldc burp/Zrpy
    //   4107: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4110: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4113: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4116: astore_3
    //   4117: aload_3
    //   4118: arraylength
    //   4119: istore #4
    //   4121: iconst_0
    //   4122: istore #5
    //   4124: iload #5
    //   4126: iload #4
    //   4128: if_icmpge -> 4265
    //   4131: aload_3
    //   4132: iload #5
    //   4134: aaload
    //   4135: astore #6
    //   4137: aload #6
    //   4139: invokevirtual getModifiers : ()I
    //   4142: invokestatic isStatic : (I)Z
    //   4145: ifne -> 4155
    //   4148: goto -> 4258
    //   4151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4154: athrow
    //   4155: aload #6
    //   4157: invokevirtual getType : ()Ljava/lang/Class;
    //   4160: astore #7
    //   4162: aload #7
    //   4164: ifnull -> 4245
    //   4167: aload #7
    //   4169: invokevirtual isPrimitive : ()Z
    //   4172: ifne -> 4245
    //   4175: goto -> 4182
    //   4178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4181: athrow
    //   4182: aload #7
    //   4184: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4187: ifnull -> 4245
    //   4190: goto -> 4197
    //   4193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4196: athrow
    //   4197: aload #7
    //   4199: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4202: invokevirtual getName : ()Ljava/lang/String;
    //   4205: ifnull -> 4245
    //   4208: goto -> 4215
    //   4211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4214: athrow
    //   4215: aload #7
    //   4217: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4220: invokevirtual getName : ()Ljava/lang/String;
    //   4223: sipush #14711
    //   4226: sipush #-13131
    //   4229: invokestatic a : (II)Ljava/lang/String;
    //   4232: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4235: ifne -> 4245
    //   4238: goto -> 4245
    //   4241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4244: athrow
    //   4245: aload #6
    //   4247: iconst_1
    //   4248: invokevirtual setAccessible : (Z)V
    //   4251: aload #6
    //   4253: aconst_null
    //   4254: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4257: pop
    //   4258: iinc #5, 1
    //   4261: iload_2
    //   4262: ifne -> 4124
    //   4265: sipush #14712
    //   4268: sipush #-21824
    //   4271: invokestatic a : (II)Ljava/lang/String;
    //   4274: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4277: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4280: astore_3
    //   4281: aload_3
    //   4282: arraylength
    //   4283: istore #4
    //   4285: iconst_0
    //   4286: istore #5
    //   4288: iload #5
    //   4290: iload #4
    //   4292: if_icmpge -> 4424
    //   4295: aload_3
    //   4296: iload #5
    //   4298: aaload
    //   4299: astore #6
    //   4301: aload #6
    //   4303: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4306: pop
    //   4307: aload #6
    //   4309: invokevirtual getModifiers : ()I
    //   4312: invokestatic isStatic : (I)Z
    //   4315: ifeq -> 4410
    //   4318: aload #6
    //   4320: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4323: arraylength
    //   4324: iconst_2
    //   4325: if_icmpne -> 4410
    //   4328: goto -> 4335
    //   4331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4334: athrow
    //   4335: aload #6
    //   4337: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4340: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4343: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4346: ifeq -> 4410
    //   4349: goto -> 4356
    //   4352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4355: athrow
    //   4356: aload #6
    //   4358: iconst_1
    //   4359: invokevirtual setAccessible : (Z)V
    //   4362: aload #6
    //   4364: aconst_null
    //   4365: iconst_2
    //   4366: anewarray java/lang/Object
    //   4369: dup
    //   4370: iconst_0
    //   4371: aload_0
    //   4372: aastore
    //   4373: dup
    //   4374: iconst_1
    //   4375: aload_1
    //   4376: ifnonnull -> 4394
    //   4379: goto -> 4386
    //   4382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4385: athrow
    //   4386: aload_1
    //   4387: goto -> 4401
    //   4390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4393: athrow
    //   4394: aload_1
    //   4395: checkcast [B
    //   4398: invokevirtual clone : ()Ljava/lang/Object;
    //   4401: aastore
    //   4402: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4405: pop
    //   4406: iload_2
    //   4407: ifne -> 4424
    //   4410: iinc #5, 1
    //   4413: iload_2
    //   4414: ifne -> 4288
    //   4417: goto -> 4424
    //   4420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4423: athrow
    //   4424: getstatic burp/Zr0g.Zj : Ljava/lang/Object;
    //   4427: checkcast java/math/BigInteger
    //   4430: invokevirtual intValue : ()I
    //   4433: i2l
    //   4434: invokestatic currentTimeMillis : ()J
    //   4437: ladd
    //   4438: getstatic burp/Zl2q.Zg : Ljava/lang/Object;
    //   4441: checkcast java/math/BigInteger
    //   4444: invokevirtual intValue : ()I
    //   4447: i2l
    //   4448: lcmp
    //   4449: ifge -> 4781
    //   4452: sipush #14716
    //   4455: sipush #23251
    //   4458: invokestatic a : (II)Ljava/lang/String;
    //   4461: iconst_1
    //   4462: ldc burp/Zbu6
    //   4464: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4467: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4470: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4473: astore_3
    //   4474: aload_3
    //   4475: arraylength
    //   4476: istore #4
    //   4478: iconst_0
    //   4479: istore #5
    //   4481: iload #5
    //   4483: iload #4
    //   4485: if_icmpge -> 4622
    //   4488: aload_3
    //   4489: iload #5
    //   4491: aaload
    //   4492: astore #6
    //   4494: aload #6
    //   4496: invokevirtual getModifiers : ()I
    //   4499: invokestatic isStatic : (I)Z
    //   4502: ifne -> 4512
    //   4505: goto -> 4615
    //   4508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4511: athrow
    //   4512: aload #6
    //   4514: invokevirtual getType : ()Ljava/lang/Class;
    //   4517: astore #7
    //   4519: aload #7
    //   4521: ifnull -> 4602
    //   4524: aload #7
    //   4526: invokevirtual isPrimitive : ()Z
    //   4529: ifne -> 4602
    //   4532: goto -> 4539
    //   4535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4538: athrow
    //   4539: aload #7
    //   4541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4544: ifnull -> 4602
    //   4547: goto -> 4554
    //   4550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4553: athrow
    //   4554: aload #7
    //   4556: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4559: invokevirtual getName : ()Ljava/lang/String;
    //   4562: ifnull -> 4602
    //   4565: goto -> 4572
    //   4568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4571: athrow
    //   4572: aload #7
    //   4574: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4577: invokevirtual getName : ()Ljava/lang/String;
    //   4580: sipush #14710
    //   4583: sipush #18070
    //   4586: invokestatic a : (II)Ljava/lang/String;
    //   4589: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4592: ifne -> 4602
    //   4595: goto -> 4602
    //   4598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4601: athrow
    //   4602: aload #6
    //   4604: iconst_1
    //   4605: invokevirtual setAccessible : (Z)V
    //   4608: aload #6
    //   4610: aconst_null
    //   4611: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4614: pop
    //   4615: iinc #5, 1
    //   4618: iload_2
    //   4619: ifne -> 4481
    //   4622: sipush #14709
    //   4625: sipush #12417
    //   4628: invokestatic a : (II)Ljava/lang/String;
    //   4631: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4634: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4637: astore_3
    //   4638: aload_3
    //   4639: arraylength
    //   4640: istore #4
    //   4642: iconst_0
    //   4643: istore #5
    //   4645: iload #5
    //   4647: iload #4
    //   4649: if_icmpge -> 4781
    //   4652: aload_3
    //   4653: iload #5
    //   4655: aaload
    //   4656: astore #6
    //   4658: aload #6
    //   4660: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4663: pop
    //   4664: aload #6
    //   4666: invokevirtual getModifiers : ()I
    //   4669: invokestatic isStatic : (I)Z
    //   4672: ifeq -> 4767
    //   4675: aload #6
    //   4677: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4680: arraylength
    //   4681: iconst_2
    //   4682: if_icmpne -> 4767
    //   4685: goto -> 4692
    //   4688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4691: athrow
    //   4692: aload #6
    //   4694: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4697: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4700: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4703: ifeq -> 4767
    //   4706: goto -> 4713
    //   4709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4712: athrow
    //   4713: aload #6
    //   4715: iconst_1
    //   4716: invokevirtual setAccessible : (Z)V
    //   4719: aload #6
    //   4721: aconst_null
    //   4722: iconst_2
    //   4723: anewarray java/lang/Object
    //   4726: dup
    //   4727: iconst_0
    //   4728: aload_0
    //   4729: aastore
    //   4730: dup
    //   4731: iconst_1
    //   4732: aload_1
    //   4733: ifnonnull -> 4751
    //   4736: goto -> 4743
    //   4739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4742: athrow
    //   4743: aload_1
    //   4744: goto -> 4758
    //   4747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4750: athrow
    //   4751: aload_1
    //   4752: checkcast [B
    //   4755: invokevirtual clone : ()Ljava/lang/Object;
    //   4758: aastore
    //   4759: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4762: pop
    //   4763: iload_2
    //   4764: ifne -> 4781
    //   4767: iinc #5, 1
    //   4770: iload_2
    //   4771: ifne -> 4645
    //   4774: goto -> 4781
    //   4777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4780: athrow
    //   4781: getstatic burp/Zsgl.ZG : Ljava/lang/String;
    //   4784: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
    //   4787: checkcast java/math/BigInteger
    //   4790: invokevirtual intValue : ()I
    //   4793: bipush #32
    //   4795: irem
    //   4796: invokestatic abs : (I)I
    //   4799: invokevirtual charAt : (I)C
    //   4802: getstatic burp/Zr0u.Z_ : Ljava/lang/String;
    //   4805: getstatic burp/Zlos.Zk : Ljava/lang/Object;
    //   4808: checkcast java/math/BigInteger
    //   4811: invokevirtual intValue : ()I
    //   4814: bipush #32
    //   4816: irem
    //   4817: invokestatic abs : (I)I
    //   4820: invokevirtual charAt : (I)C
    //   4823: if_icmpgt -> 4930
    //   4826: getstatic burp/Zg99.ZH : Ljava/lang/String;
    //   4829: getstatic burp/Zllw.ZW : Ljava/lang/Object;
    //   4832: checkcast java/math/BigInteger
    //   4835: invokevirtual intValue : ()I
    //   4838: bipush #32
    //   4840: irem
    //   4841: invokestatic abs : (I)I
    //   4844: invokevirtual charAt : (I)C
    //   4847: getstatic burp/Zb2s.Zq : Ljava/lang/String;
    //   4850: getstatic burp/Zrbp.Z_ : Ljava/lang/Object;
    //   4853: checkcast java/math/BigInteger
    //   4856: invokevirtual intValue : ()I
    //   4859: bipush #32
    //   4861: irem
    //   4862: invokestatic abs : (I)I
    //   4865: invokevirtual charAt : (I)C
    //   4868: if_icmple -> 4930
    //   4871: goto -> 4878
    //   4874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4877: athrow
    //   4878: getstatic burp/Ze3j.ZI : Ljava/lang/String;
    //   4881: getstatic burp/Zt4g.Zv : Ljava/lang/Object;
    //   4884: checkcast java/math/BigInteger
    //   4887: invokevirtual intValue : ()I
    //   4890: bipush #32
    //   4892: irem
    //   4893: invokestatic abs : (I)I
    //   4896: invokevirtual charAt : (I)C
    //   4899: getstatic burp/Zkfz.Zs : Ljava/lang/String;
    //   4902: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   4905: checkcast java/math/BigInteger
    //   4908: invokevirtual intValue : ()I
    //   4911: bipush #32
    //   4913: irem
    //   4914: invokestatic abs : (I)I
    //   4917: invokevirtual charAt : (I)C
    //   4920: if_icmpgt -> 4938
    //   4923: goto -> 4930
    //   4926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4929: athrow
    //   4930: iconst_1
    //   4931: goto -> 4939
    //   4934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4937: athrow
    //   4938: iconst_0
    //   4939: ireturn
    //   4940: astore_3
    //   4941: new java/lang/Exception
    //   4944: dup
    //   4945: aload_3
    //   4946: invokevirtual getMessage : ()Ljava/lang/String;
    //   4949: invokespecial <init> : (Ljava/lang/String;)V
    //   4952: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4939	4940	java/lang/Throwable
    //   823	857	860	java/lang/Throwable
    //   952	1030	1033	java/lang/Throwable
    //   959	1173	1176	java/lang/Throwable
    //   1550	1565	1565	java/lang/Throwable
    //   1592	1626	1629	java/lang/Throwable
    //   1636	1648	1651	java/lang/Throwable
    //   1734	1812	1815	java/lang/Throwable
    //   1741	1955	1958	java/lang/Throwable
    //   2355	2433	2436	java/lang/Throwable
    //   2362	2576	2579	java/lang/Throwable
    //   3023	3057	3060	java/lang/Throwable
    //   3064	3076	3079	java/lang/Throwable
    //   3162	3240	3243	java/lang/Throwable
    //   3169	3383	3386	java/lang/Throwable
    //   4137	4151	4151	java/lang/Throwable
    //   4162	4175	4178	java/lang/Throwable
    //   4167	4190	4193	java/lang/Throwable
    //   4182	4208	4211	java/lang/Throwable
    //   4197	4238	4241	java/lang/Throwable
    //   4301	4328	4331	java/lang/Throwable
    //   4318	4349	4352	java/lang/Throwable
    //   4335	4379	4382	java/lang/Throwable
    //   4356	4390	4390	java/lang/Throwable
    //   4401	4417	4420	java/lang/Throwable
    //   4494	4508	4508	java/lang/Throwable
    //   4519	4532	4535	java/lang/Throwable
    //   4524	4547	4550	java/lang/Throwable
    //   4539	4565	4568	java/lang/Throwable
    //   4554	4595	4598	java/lang/Throwable
    //   4658	4685	4688	java/lang/Throwable
    //   4675	4706	4709	java/lang/Throwable
    //   4692	4736	4739	java/lang/Throwable
    //   4713	4747	4747	java/lang/Throwable
    //   4758	4774	4777	java/lang/Throwable
    //   4781	4871	4874	java/lang/Throwable
    //   4826	4923	4926	java/lang/Throwable
    //   4878	4934	4934	java/lang/Throwable
  }
  
  static void ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥ÓPËÐeÌ¤7r0G{Qr$MÓ9ÓKR|æûZõ\\t0Y¯<ÑÃGiM6Ì§ïüÃ%bê¥¥Û¾5¼pó:9H/~MNÙËÿ#qpC%bZ£G¤Àù²j¬^õIqq¨H»]=Ü¢¹^Ë.9[Â­³\\t6/$ÁÎY\\tOþ×ß Ãç¯ôOi¨Â¾¥/i÷ü\\bêeÕØ,Åyÿ\\t²Þ\\tç6Ø&R\\tâ)wªDUmõ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #80
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
    //   68: ldc '`ñÆ\\tjXä-îÈ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
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
    //   128: putstatic burp/Zx4w.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zx4w.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #64
    //   214: goto -> 243
    //   217: bipush #118
    //   219: goto -> 243
    //   222: bipush #81
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #117
    //   233: goto -> 243
    //   236: bipush #58
    //   238: goto -> 243
    //   241: bipush #62
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
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: sipush #14714
    //   303: sipush #22397
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #52
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-21
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-6
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-79
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #111
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-64
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #29
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-102
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #72
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-77
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-13
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-26
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #71
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #66
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-75
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #69
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-90
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-107
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #126
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #83
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #81
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-75
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-69
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #42
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #104
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-86
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-114
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-110
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #13
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #32
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #12
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-95
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zx4w.Zp : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x397F) & 0xFFFF;
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
      char c = 'û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */