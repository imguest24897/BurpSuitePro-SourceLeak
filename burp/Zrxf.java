package burp;

import java.math.BigInteger;

class Zrxf extends ClassLoader {
  static Object ZS;
  
  static String ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zh(Object paramObject) {
    Zs5k.ZI = a(-13100, 4923);
    Zs5k.Zg = new BigInteger(a(-13097, 12660));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrct.ZT.charAt(Math.abs(((BigInteger)Zzh9.Zv).intValue() % 32)) > Zlzs.Zp.charAt(Math.abs(((BigInteger)Ztw4.ZF).intValue() % 32))) {
          try {
            Zl15.ZH(Class.forName(a(-13095, 29366)));
            if (bool)
              Zrdo.Za(Class.forName(a(-13109, -10601))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrdo.Za(Class.forName(a(-13109, -10601)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zewq.ZO : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zm5s.ZB : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   22: new java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore_3
    //   30: iconst_0
    //   31: istore #4
    //   33: iload #4
    //   35: bipush #32
    //   37: if_icmpge -> 1371
    //   40: iload #4
    //   42: tableswitch default -> 1364, 0 -> 184, 1 -> 221, 2 -> 258, 3 -> 295, 4 -> 332, 5 -> 369, 6 -> 406, 7 -> 443, 8 -> 480, 9 -> 517, 10 -> 554, 11 -> 591, 12 -> 628, 13 -> 665, 14 -> 702, 15 -> 739, 16 -> 776, 17 -> 813, 18 -> 850, 19 -> 887, 20 -> 924, 21 -> 961, 22 -> 998, 23 -> 1035, 24 -> 1072, 25 -> 1109, 26 -> 1146, 27 -> 1183, 28 -> 1220, 29 -> 1257, 30 -> 1294, 31 -> 1331
    //   184: aload_3
    //   185: getstatic burp/Zszm.Zf : Ljava/lang/String;
    //   188: getstatic burp/Zrh1.ZF : Ljava/lang/Object;
    //   191: checkcast java/math/BigInteger
    //   194: invokevirtual intValue : ()I
    //   197: bipush #32
    //   199: irem
    //   200: invokestatic abs : (I)I
    //   203: invokevirtual charAt : (I)C
    //   206: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: iload_2
    //   211: ifeq -> 1364
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   220: athrow
    //   221: aload_3
    //   222: getstatic burp/Zsot.Zb : Ljava/lang/String;
    //   225: getstatic burp/Zzhu.ZW : Ljava/lang/Object;
    //   228: checkcast java/math/BigInteger
    //   231: invokevirtual intValue : ()I
    //   234: bipush #32
    //   236: irem
    //   237: invokestatic abs : (I)I
    //   240: invokevirtual charAt : (I)C
    //   243: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: iload_2
    //   248: ifeq -> 1364
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   257: athrow
    //   258: aload_3
    //   259: getstatic burp/Zg_6.Zc : Ljava/lang/String;
    //   262: getstatic burp/Zgs6.Za : Ljava/lang/Object;
    //   265: checkcast java/math/BigInteger
    //   268: invokevirtual intValue : ()I
    //   271: bipush #32
    //   273: irem
    //   274: invokestatic abs : (I)I
    //   277: invokevirtual charAt : (I)C
    //   280: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: iload_2
    //   285: ifeq -> 1364
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload_3
    //   296: getstatic burp/Zzoc.Zg : Ljava/lang/String;
    //   299: getstatic burp/Ze_e.Za : Ljava/lang/Object;
    //   302: checkcast java/math/BigInteger
    //   305: invokevirtual intValue : ()I
    //   308: bipush #32
    //   310: irem
    //   311: invokestatic abs : (I)I
    //   314: invokevirtual charAt : (I)C
    //   317: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: iload_2
    //   322: ifeq -> 1364
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   331: athrow
    //   332: aload_3
    //   333: getstatic burp/Zl15.ZI : Ljava/lang/String;
    //   336: getstatic burp/Zktq.Zn : Ljava/lang/Object;
    //   339: checkcast java/math/BigInteger
    //   342: invokevirtual intValue : ()I
    //   345: bipush #32
    //   347: irem
    //   348: invokestatic abs : (I)I
    //   351: invokevirtual charAt : (I)C
    //   354: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: iload_2
    //   359: ifeq -> 1364
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: aload_3
    //   370: getstatic burp/Zml2.Zh : Ljava/lang/String;
    //   373: getstatic burp/Zeai.ZI : Ljava/lang/Object;
    //   376: checkcast java/math/BigInteger
    //   379: invokevirtual intValue : ()I
    //   382: bipush #32
    //   384: irem
    //   385: invokestatic abs : (I)I
    //   388: invokevirtual charAt : (I)C
    //   391: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: iload_2
    //   396: ifeq -> 1364
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   405: athrow
    //   406: aload_3
    //   407: getstatic burp/Zl1z.Zh : Ljava/lang/String;
    //   410: getstatic burp/Zl15.Zn : Ljava/lang/Object;
    //   413: checkcast java/math/BigInteger
    //   416: invokevirtual intValue : ()I
    //   419: bipush #32
    //   421: irem
    //   422: invokestatic abs : (I)I
    //   425: invokevirtual charAt : (I)C
    //   428: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   431: pop
    //   432: iload_2
    //   433: ifeq -> 1364
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   442: athrow
    //   443: aload_3
    //   444: getstatic burp/Zth8.ZN : Ljava/lang/String;
    //   447: getstatic burp/Zsf4.Zr : Ljava/lang/Object;
    //   450: checkcast java/math/BigInteger
    //   453: invokevirtual intValue : ()I
    //   456: bipush #32
    //   458: irem
    //   459: invokestatic abs : (I)I
    //   462: invokevirtual charAt : (I)C
    //   465: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: iload_2
    //   470: ifeq -> 1364
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: aload_3
    //   481: getstatic burp/Zs5i.ZJ : Ljava/lang/String;
    //   484: getstatic burp/Zrx5.ZE : Ljava/lang/Object;
    //   487: checkcast java/math/BigInteger
    //   490: invokevirtual intValue : ()I
    //   493: bipush #32
    //   495: irem
    //   496: invokestatic abs : (I)I
    //   499: invokevirtual charAt : (I)C
    //   502: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   505: pop
    //   506: iload_2
    //   507: ifeq -> 1364
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   516: athrow
    //   517: aload_3
    //   518: getstatic burp/Zl15.ZI : Ljava/lang/String;
    //   521: getstatic burp/Zmec.ZY : Ljava/lang/Object;
    //   524: checkcast java/math/BigInteger
    //   527: invokevirtual intValue : ()I
    //   530: bipush #32
    //   532: irem
    //   533: invokestatic abs : (I)I
    //   536: invokevirtual charAt : (I)C
    //   539: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   542: pop
    //   543: iload_2
    //   544: ifeq -> 1364
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   553: athrow
    //   554: aload_3
    //   555: getstatic burp/Zm5s.Z_ : Ljava/lang/String;
    //   558: getstatic burp/Zmly.ZT : Ljava/lang/Object;
    //   561: checkcast java/math/BigInteger
    //   564: invokevirtual intValue : ()I
    //   567: bipush #32
    //   569: irem
    //   570: invokestatic abs : (I)I
    //   573: invokevirtual charAt : (I)C
    //   576: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   579: pop
    //   580: iload_2
    //   581: ifeq -> 1364
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   590: athrow
    //   591: aload_3
    //   592: getstatic burp/Zs5k.ZI : Ljava/lang/String;
    //   595: getstatic burp/Zspk.ZF : Ljava/lang/Object;
    //   598: checkcast java/math/BigInteger
    //   601: invokevirtual intValue : ()I
    //   604: bipush #32
    //   606: irem
    //   607: invokestatic abs : (I)I
    //   610: invokevirtual charAt : (I)C
    //   613: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   616: pop
    //   617: iload_2
    //   618: ifeq -> 1364
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   627: athrow
    //   628: aload_3
    //   629: getstatic burp/Zkc5.ZH : Ljava/lang/String;
    //   632: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   635: checkcast java/math/BigInteger
    //   638: invokevirtual intValue : ()I
    //   641: bipush #32
    //   643: irem
    //   644: invokestatic abs : (I)I
    //   647: invokevirtual charAt : (I)C
    //   650: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: iload_2
    //   655: ifeq -> 1364
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   664: athrow
    //   665: aload_3
    //   666: getstatic burp/Zm14.ZE : Ljava/lang/String;
    //   669: getstatic burp/Zrt9.Zy : Ljava/lang/Object;
    //   672: checkcast java/math/BigInteger
    //   675: invokevirtual intValue : ()I
    //   678: bipush #32
    //   680: irem
    //   681: invokestatic abs : (I)I
    //   684: invokevirtual charAt : (I)C
    //   687: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   690: pop
    //   691: iload_2
    //   692: ifeq -> 1364
    //   695: goto -> 702
    //   698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   701: athrow
    //   702: aload_3
    //   703: getstatic burp/Zs5i.ZJ : Ljava/lang/String;
    //   706: getstatic burp/Zgl2.ZS : Ljava/lang/Object;
    //   709: checkcast java/math/BigInteger
    //   712: invokevirtual intValue : ()I
    //   715: bipush #32
    //   717: irem
    //   718: invokestatic abs : (I)I
    //   721: invokevirtual charAt : (I)C
    //   724: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   727: pop
    //   728: iload_2
    //   729: ifeq -> 1364
    //   732: goto -> 739
    //   735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   738: athrow
    //   739: aload_3
    //   740: getstatic burp/Zb8_.ZP : Ljava/lang/String;
    //   743: getstatic burp/Zrx5.ZE : Ljava/lang/Object;
    //   746: checkcast java/math/BigInteger
    //   749: invokevirtual intValue : ()I
    //   752: bipush #32
    //   754: irem
    //   755: invokestatic abs : (I)I
    //   758: invokevirtual charAt : (I)C
    //   761: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   764: pop
    //   765: iload_2
    //   766: ifeq -> 1364
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   775: athrow
    //   776: aload_3
    //   777: getstatic burp/Zl8s.Zn : Ljava/lang/String;
    //   780: getstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   783: checkcast java/math/BigInteger
    //   786: invokevirtual intValue : ()I
    //   789: bipush #32
    //   791: irem
    //   792: invokestatic abs : (I)I
    //   795: invokevirtual charAt : (I)C
    //   798: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   801: pop
    //   802: iload_2
    //   803: ifeq -> 1364
    //   806: goto -> 813
    //   809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   812: athrow
    //   813: aload_3
    //   814: getstatic burp/Zs5i.ZJ : Ljava/lang/String;
    //   817: getstatic burp/Zbxa.ZS : Ljava/lang/Object;
    //   820: checkcast java/math/BigInteger
    //   823: invokevirtual intValue : ()I
    //   826: bipush #32
    //   828: irem
    //   829: invokestatic abs : (I)I
    //   832: invokevirtual charAt : (I)C
    //   835: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   838: pop
    //   839: iload_2
    //   840: ifeq -> 1364
    //   843: goto -> 850
    //   846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   849: athrow
    //   850: aload_3
    //   851: getstatic burp/Zsf4.ZA : Ljava/lang/String;
    //   854: getstatic burp/Zmly.ZT : Ljava/lang/Object;
    //   857: checkcast java/math/BigInteger
    //   860: invokevirtual intValue : ()I
    //   863: bipush #32
    //   865: irem
    //   866: invokestatic abs : (I)I
    //   869: invokevirtual charAt : (I)C
    //   872: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   875: pop
    //   876: iload_2
    //   877: ifeq -> 1364
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   886: athrow
    //   887: aload_3
    //   888: getstatic burp/Ztc2.Zr : Ljava/lang/String;
    //   891: getstatic burp/Zs5i.ZD : Ljava/lang/Object;
    //   894: checkcast java/math/BigInteger
    //   897: invokevirtual intValue : ()I
    //   900: bipush #32
    //   902: irem
    //   903: invokestatic abs : (I)I
    //   906: invokevirtual charAt : (I)C
    //   909: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   912: pop
    //   913: iload_2
    //   914: ifeq -> 1364
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: aload_3
    //   925: getstatic burp/Zmly.Zi : Ljava/lang/String;
    //   928: getstatic burp/Zrp3.Zd : Ljava/lang/Object;
    //   931: checkcast java/math/BigInteger
    //   934: invokevirtual intValue : ()I
    //   937: bipush #32
    //   939: irem
    //   940: invokestatic abs : (I)I
    //   943: invokevirtual charAt : (I)C
    //   946: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   949: pop
    //   950: iload_2
    //   951: ifeq -> 1364
    //   954: goto -> 961
    //   957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   960: athrow
    //   961: aload_3
    //   962: getstatic burp/Zszm.Zf : Ljava/lang/String;
    //   965: getstatic burp/Zt7k.Zc : Ljava/lang/Object;
    //   968: checkcast java/math/BigInteger
    //   971: invokevirtual intValue : ()I
    //   974: bipush #32
    //   976: irem
    //   977: invokestatic abs : (I)I
    //   980: invokevirtual charAt : (I)C
    //   983: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   986: pop
    //   987: iload_2
    //   988: ifeq -> 1364
    //   991: goto -> 998
    //   994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   997: athrow
    //   998: aload_3
    //   999: getstatic burp/Zbsc.Zp : Ljava/lang/String;
    //   1002: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   1005: checkcast java/math/BigInteger
    //   1008: invokevirtual intValue : ()I
    //   1011: bipush #32
    //   1013: irem
    //   1014: invokestatic abs : (I)I
    //   1017: invokevirtual charAt : (I)C
    //   1020: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1023: pop
    //   1024: iload_2
    //   1025: ifeq -> 1364
    //   1028: goto -> 1035
    //   1031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1034: athrow
    //   1035: aload_3
    //   1036: getstatic burp/Zg_6.Zc : Ljava/lang/String;
    //   1039: getstatic burp/Zg_6.ZU : Ljava/lang/Object;
    //   1042: checkcast java/math/BigInteger
    //   1045: invokevirtual intValue : ()I
    //   1048: bipush #32
    //   1050: irem
    //   1051: invokestatic abs : (I)I
    //   1054: invokevirtual charAt : (I)C
    //   1057: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1060: pop
    //   1061: iload_2
    //   1062: ifeq -> 1364
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1071: athrow
    //   1072: aload_3
    //   1073: getstatic burp/Zg3m.Za : Ljava/lang/String;
    //   1076: getstatic burp/Zrp3.Zd : Ljava/lang/Object;
    //   1079: checkcast java/math/BigInteger
    //   1082: invokevirtual intValue : ()I
    //   1085: bipush #32
    //   1087: irem
    //   1088: invokestatic abs : (I)I
    //   1091: invokevirtual charAt : (I)C
    //   1094: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1097: pop
    //   1098: iload_2
    //   1099: ifeq -> 1364
    //   1102: goto -> 1109
    //   1105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1108: athrow
    //   1109: aload_3
    //   1110: getstatic burp/Zb8_.ZP : Ljava/lang/String;
    //   1113: getstatic burp/Zkfb.ZN : Ljava/lang/Object;
    //   1116: checkcast java/math/BigInteger
    //   1119: invokevirtual intValue : ()I
    //   1122: bipush #32
    //   1124: irem
    //   1125: invokestatic abs : (I)I
    //   1128: invokevirtual charAt : (I)C
    //   1131: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1134: pop
    //   1135: iload_2
    //   1136: ifeq -> 1364
    //   1139: goto -> 1146
    //   1142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1145: athrow
    //   1146: aload_3
    //   1147: getstatic burp/Zso7.Zr : Ljava/lang/String;
    //   1150: getstatic burp/Zlzs.ZL : Ljava/lang/Object;
    //   1153: checkcast java/math/BigInteger
    //   1156: invokevirtual intValue : ()I
    //   1159: bipush #32
    //   1161: irem
    //   1162: invokestatic abs : (I)I
    //   1165: invokevirtual charAt : (I)C
    //   1168: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1171: pop
    //   1172: iload_2
    //   1173: ifeq -> 1364
    //   1176: goto -> 1183
    //   1179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1182: athrow
    //   1183: aload_3
    //   1184: getstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   1187: getstatic burp/Zszm.ZI : Ljava/lang/Object;
    //   1190: checkcast java/math/BigInteger
    //   1193: invokevirtual intValue : ()I
    //   1196: bipush #32
    //   1198: irem
    //   1199: invokestatic abs : (I)I
    //   1202: invokevirtual charAt : (I)C
    //   1205: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1208: pop
    //   1209: iload_2
    //   1210: ifeq -> 1364
    //   1213: goto -> 1220
    //   1216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1219: athrow
    //   1220: aload_3
    //   1221: getstatic burp/Zl6z.ZL : Ljava/lang/String;
    //   1224: getstatic burp/Zmly.ZT : Ljava/lang/Object;
    //   1227: checkcast java/math/BigInteger
    //   1230: invokevirtual intValue : ()I
    //   1233: bipush #32
    //   1235: irem
    //   1236: invokestatic abs : (I)I
    //   1239: invokevirtual charAt : (I)C
    //   1242: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1245: pop
    //   1246: iload_2
    //   1247: ifeq -> 1364
    //   1250: goto -> 1257
    //   1253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1256: athrow
    //   1257: aload_3
    //   1258: getstatic burp/Zs5k.ZI : Ljava/lang/String;
    //   1261: getstatic burp/Zl8s.ZY : Ljava/lang/Object;
    //   1264: checkcast java/math/BigInteger
    //   1267: invokevirtual intValue : ()I
    //   1270: bipush #32
    //   1272: irem
    //   1273: invokestatic abs : (I)I
    //   1276: invokevirtual charAt : (I)C
    //   1279: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1282: pop
    //   1283: iload_2
    //   1284: ifeq -> 1364
    //   1287: goto -> 1294
    //   1290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1293: athrow
    //   1294: aload_3
    //   1295: getstatic burp/Zktq.Zc : Ljava/lang/String;
    //   1298: getstatic burp/Zktq.Zn : Ljava/lang/Object;
    //   1301: checkcast java/math/BigInteger
    //   1304: invokevirtual intValue : ()I
    //   1307: bipush #32
    //   1309: irem
    //   1310: invokestatic abs : (I)I
    //   1313: invokevirtual charAt : (I)C
    //   1316: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1319: pop
    //   1320: iload_2
    //   1321: ifeq -> 1364
    //   1324: goto -> 1331
    //   1327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1330: athrow
    //   1331: aload_3
    //   1332: getstatic burp/Ze9.Zh : Ljava/lang/String;
    //   1335: getstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   1338: checkcast java/math/BigInteger
    //   1341: invokevirtual intValue : ()I
    //   1344: bipush #32
    //   1346: irem
    //   1347: invokestatic abs : (I)I
    //   1350: invokevirtual charAt : (I)C
    //   1353: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1356: pop
    //   1357: goto -> 1364
    //   1360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1363: athrow
    //   1364: iinc #4, 1
    //   1367: iload_2
    //   1368: ifeq -> 33
    //   1371: aload_3
    //   1372: invokevirtual toString : ()Ljava/lang/String;
    //   1375: putstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   1378: sipush #-13104
    //   1381: sipush #-29061
    //   1384: invokestatic a : (II)Ljava/lang/String;
    //   1387: iconst_1
    //   1388: ldc burp/Zmsl
    //   1390: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1393: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1396: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1399: astore #4
    //   1401: aload #4
    //   1403: arraylength
    //   1404: istore #5
    //   1406: iconst_0
    //   1407: istore #6
    //   1409: iload #6
    //   1411: iload #5
    //   1413: if_icmpge -> 1551
    //   1416: aload #4
    //   1418: iload #6
    //   1420: aaload
    //   1421: astore #7
    //   1423: aload #7
    //   1425: invokevirtual getModifiers : ()I
    //   1428: invokestatic isStatic : (I)Z
    //   1431: ifne -> 1441
    //   1434: goto -> 1544
    //   1437: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1440: athrow
    //   1441: aload #7
    //   1443: invokevirtual getType : ()Ljava/lang/Class;
    //   1446: astore #8
    //   1448: aload #8
    //   1450: ifnull -> 1531
    //   1453: aload #8
    //   1455: invokevirtual isPrimitive : ()Z
    //   1458: ifne -> 1531
    //   1461: goto -> 1468
    //   1464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1467: athrow
    //   1468: aload #8
    //   1470: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1473: ifnull -> 1531
    //   1476: goto -> 1483
    //   1479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1482: athrow
    //   1483: aload #8
    //   1485: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1488: invokevirtual getName : ()Ljava/lang/String;
    //   1491: ifnull -> 1531
    //   1494: goto -> 1501
    //   1497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1500: athrow
    //   1501: aload #8
    //   1503: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1506: invokevirtual getName : ()Ljava/lang/String;
    //   1509: sipush #-13119
    //   1512: sipush #15225
    //   1515: invokestatic a : (II)Ljava/lang/String;
    //   1518: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1521: ifne -> 1531
    //   1524: goto -> 1531
    //   1527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1530: athrow
    //   1531: aload #7
    //   1533: iconst_1
    //   1534: invokevirtual setAccessible : (Z)V
    //   1537: aload #7
    //   1539: aconst_null
    //   1540: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1543: pop
    //   1544: iinc #6, 1
    //   1547: iload_2
    //   1548: ifeq -> 1409
    //   1551: sipush #-13106
    //   1554: sipush #-20927
    //   1557: invokestatic a : (II)Ljava/lang/String;
    //   1560: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1563: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1566: astore #4
    //   1568: aload #4
    //   1570: arraylength
    //   1571: istore #5
    //   1573: iconst_0
    //   1574: istore #6
    //   1576: iload #6
    //   1578: iload #5
    //   1580: if_icmpge -> 1713
    //   1583: aload #4
    //   1585: iload #6
    //   1587: aaload
    //   1588: astore #7
    //   1590: aload #7
    //   1592: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1595: pop
    //   1596: aload #7
    //   1598: invokevirtual getModifiers : ()I
    //   1601: invokestatic isStatic : (I)Z
    //   1604: ifeq -> 1699
    //   1607: aload #7
    //   1609: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1612: arraylength
    //   1613: iconst_2
    //   1614: if_icmpne -> 1699
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload #7
    //   1626: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1629: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1632: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1635: ifeq -> 1699
    //   1638: goto -> 1645
    //   1641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1644: athrow
    //   1645: aload #7
    //   1647: iconst_1
    //   1648: invokevirtual setAccessible : (Z)V
    //   1651: aload #7
    //   1653: aconst_null
    //   1654: iconst_2
    //   1655: anewarray java/lang/Object
    //   1658: dup
    //   1659: iconst_0
    //   1660: aload_0
    //   1661: aastore
    //   1662: dup
    //   1663: iconst_1
    //   1664: aload_1
    //   1665: ifnonnull -> 1683
    //   1668: goto -> 1675
    //   1671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1674: athrow
    //   1675: aload_1
    //   1676: goto -> 1690
    //   1679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1682: athrow
    //   1683: aload_1
    //   1684: checkcast [B
    //   1687: invokevirtual clone : ()Ljava/lang/Object;
    //   1690: aastore
    //   1691: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1694: pop
    //   1695: iload_2
    //   1696: ifeq -> 1713
    //   1699: iinc #6, 1
    //   1702: iload_2
    //   1703: ifeq -> 1576
    //   1706: goto -> 1713
    //   1709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1712: athrow
    //   1713: getstatic burp/Zrfh.ZJ : Ljava/lang/Object;
    //   1716: checkcast java/math/BigInteger
    //   1719: invokevirtual intValue : ()I
    //   1722: i2l
    //   1723: invokestatic currentTimeMillis : ()J
    //   1726: ladd
    //   1727: getstatic burp/Zxee.Zj : Ljava/lang/Object;
    //   1730: checkcast java/math/BigInteger
    //   1733: invokevirtual intValue : ()I
    //   1736: i2l
    //   1737: lcmp
    //   1738: ifge -> 2076
    //   1741: sipush #-13111
    //   1744: sipush #-1415
    //   1747: invokestatic a : (II)Ljava/lang/String;
    //   1750: iconst_1
    //   1751: ldc burp/Zg4w
    //   1753: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1756: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1759: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1762: astore #4
    //   1764: aload #4
    //   1766: arraylength
    //   1767: istore #5
    //   1769: iconst_0
    //   1770: istore #6
    //   1772: iload #6
    //   1774: iload #5
    //   1776: if_icmpge -> 1914
    //   1779: aload #4
    //   1781: iload #6
    //   1783: aaload
    //   1784: astore #7
    //   1786: aload #7
    //   1788: invokevirtual getModifiers : ()I
    //   1791: invokestatic isStatic : (I)Z
    //   1794: ifne -> 1804
    //   1797: goto -> 1907
    //   1800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1803: athrow
    //   1804: aload #7
    //   1806: invokevirtual getType : ()Ljava/lang/Class;
    //   1809: astore #8
    //   1811: aload #8
    //   1813: ifnull -> 1894
    //   1816: aload #8
    //   1818: invokevirtual isPrimitive : ()Z
    //   1821: ifne -> 1894
    //   1824: goto -> 1831
    //   1827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1830: athrow
    //   1831: aload #8
    //   1833: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1836: ifnull -> 1894
    //   1839: goto -> 1846
    //   1842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1845: athrow
    //   1846: aload #8
    //   1848: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1851: invokevirtual getName : ()Ljava/lang/String;
    //   1854: ifnull -> 1894
    //   1857: goto -> 1864
    //   1860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1863: athrow
    //   1864: aload #8
    //   1866: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1869: invokevirtual getName : ()Ljava/lang/String;
    //   1872: sipush #-13113
    //   1875: sipush #-28671
    //   1878: invokestatic a : (II)Ljava/lang/String;
    //   1881: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1884: ifne -> 1894
    //   1887: goto -> 1894
    //   1890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1893: athrow
    //   1894: aload #7
    //   1896: iconst_1
    //   1897: invokevirtual setAccessible : (Z)V
    //   1900: aload #7
    //   1902: aconst_null
    //   1903: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1906: pop
    //   1907: iinc #6, 1
    //   1910: iload_2
    //   1911: ifeq -> 1772
    //   1914: sipush #-13101
    //   1917: sipush #22558
    //   1920: invokestatic a : (II)Ljava/lang/String;
    //   1923: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1926: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1929: astore #4
    //   1931: aload #4
    //   1933: arraylength
    //   1934: istore #5
    //   1936: iconst_0
    //   1937: istore #6
    //   1939: iload #6
    //   1941: iload #5
    //   1943: if_icmpge -> 2076
    //   1946: aload #4
    //   1948: iload #6
    //   1950: aaload
    //   1951: astore #7
    //   1953: aload #7
    //   1955: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1958: pop
    //   1959: aload #7
    //   1961: invokevirtual getModifiers : ()I
    //   1964: invokestatic isStatic : (I)Z
    //   1967: ifeq -> 2062
    //   1970: aload #7
    //   1972: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1975: arraylength
    //   1976: iconst_2
    //   1977: if_icmpne -> 2062
    //   1980: goto -> 1987
    //   1983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1986: athrow
    //   1987: aload #7
    //   1989: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1992: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1995: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1998: ifeq -> 2062
    //   2001: goto -> 2008
    //   2004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2007: athrow
    //   2008: aload #7
    //   2010: iconst_1
    //   2011: invokevirtual setAccessible : (Z)V
    //   2014: aload #7
    //   2016: aconst_null
    //   2017: iconst_2
    //   2018: anewarray java/lang/Object
    //   2021: dup
    //   2022: iconst_0
    //   2023: aload_0
    //   2024: aastore
    //   2025: dup
    //   2026: iconst_1
    //   2027: aload_1
    //   2028: ifnonnull -> 2046
    //   2031: goto -> 2038
    //   2034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2037: athrow
    //   2038: aload_1
    //   2039: goto -> 2053
    //   2042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2045: athrow
    //   2046: aload_1
    //   2047: checkcast [B
    //   2050: invokevirtual clone : ()Ljava/lang/Object;
    //   2053: aastore
    //   2054: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2057: pop
    //   2058: iload_2
    //   2059: ifeq -> 2076
    //   2062: iinc #6, 1
    //   2065: iload_2
    //   2066: ifeq -> 1939
    //   2069: goto -> 2076
    //   2072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2075: athrow
    //   2076: iconst_0
    //   2077: istore #4
    //   2079: getstatic burp/Zgl2.Zw : Ljava/lang/String;
    //   2082: getstatic burp/Zrh1.ZF : Ljava/lang/Object;
    //   2085: checkcast java/math/BigInteger
    //   2088: invokevirtual intValue : ()I
    //   2091: bipush #32
    //   2093: irem
    //   2094: invokestatic abs : (I)I
    //   2097: invokevirtual charAt : (I)C
    //   2100: getstatic burp/Zms1.ZZ : Ljava/lang/String;
    //   2103: getstatic burp/Zt7k.Zc : Ljava/lang/Object;
    //   2106: checkcast java/math/BigInteger
    //   2109: invokevirtual intValue : ()I
    //   2112: bipush #32
    //   2114: irem
    //   2115: invokestatic abs : (I)I
    //   2118: invokevirtual charAt : (I)C
    //   2121: if_icmpgt -> 2466
    //   2124: sipush #-13102
    //   2127: sipush #12062
    //   2130: invokestatic a : (II)Ljava/lang/String;
    //   2133: iconst_1
    //   2134: ldc burp/Zbz_
    //   2136: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2139: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2142: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2145: astore #5
    //   2147: aload #5
    //   2149: arraylength
    //   2150: istore #6
    //   2152: iconst_0
    //   2153: istore #7
    //   2155: iload #7
    //   2157: iload #6
    //   2159: if_icmpge -> 2297
    //   2162: aload #5
    //   2164: iload #7
    //   2166: aaload
    //   2167: astore #8
    //   2169: aload #8
    //   2171: invokevirtual getModifiers : ()I
    //   2174: invokestatic isStatic : (I)Z
    //   2177: ifne -> 2187
    //   2180: goto -> 2290
    //   2183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2186: athrow
    //   2187: aload #8
    //   2189: invokevirtual getType : ()Ljava/lang/Class;
    //   2192: astore #9
    //   2194: aload #9
    //   2196: ifnull -> 2277
    //   2199: aload #9
    //   2201: invokevirtual isPrimitive : ()Z
    //   2204: ifne -> 2277
    //   2207: goto -> 2214
    //   2210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2213: athrow
    //   2214: aload #9
    //   2216: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2219: ifnull -> 2277
    //   2222: goto -> 2229
    //   2225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2228: athrow
    //   2229: aload #9
    //   2231: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2234: invokevirtual getName : ()Ljava/lang/String;
    //   2237: ifnull -> 2277
    //   2240: goto -> 2247
    //   2243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2246: athrow
    //   2247: aload #9
    //   2249: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2252: invokevirtual getName : ()Ljava/lang/String;
    //   2255: sipush #-13113
    //   2258: sipush #-28671
    //   2261: invokestatic a : (II)Ljava/lang/String;
    //   2264: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2267: ifne -> 2277
    //   2270: goto -> 2277
    //   2273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2276: athrow
    //   2277: aload #8
    //   2279: iconst_1
    //   2280: invokevirtual setAccessible : (Z)V
    //   2283: aload #8
    //   2285: aconst_null
    //   2286: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2289: pop
    //   2290: iinc #7, 1
    //   2293: iload_2
    //   2294: ifeq -> 2155
    //   2297: sipush #-13114
    //   2300: sipush #-3280
    //   2303: invokestatic a : (II)Ljava/lang/String;
    //   2306: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2309: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2312: astore #5
    //   2314: aload #5
    //   2316: arraylength
    //   2317: istore #6
    //   2319: iconst_0
    //   2320: istore #7
    //   2322: iload #7
    //   2324: iload #6
    //   2326: if_icmpge -> 2463
    //   2329: aload #5
    //   2331: iload #7
    //   2333: aaload
    //   2334: astore #8
    //   2336: aload #8
    //   2338: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2341: pop
    //   2342: aload #8
    //   2344: invokevirtual getModifiers : ()I
    //   2347: invokestatic isStatic : (I)Z
    //   2350: ifeq -> 2449
    //   2353: aload #8
    //   2355: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2358: arraylength
    //   2359: iconst_2
    //   2360: if_icmpne -> 2449
    //   2363: goto -> 2370
    //   2366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2369: athrow
    //   2370: aload #8
    //   2372: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2375: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2378: if_acmpne -> 2449
    //   2381: goto -> 2388
    //   2384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2387: athrow
    //   2388: aload #8
    //   2390: iconst_1
    //   2391: invokevirtual setAccessible : (Z)V
    //   2394: aload #8
    //   2396: aconst_null
    //   2397: iconst_2
    //   2398: anewarray java/lang/Object
    //   2401: dup
    //   2402: iconst_0
    //   2403: aload_0
    //   2404: aastore
    //   2405: dup
    //   2406: iconst_1
    //   2407: aload_1
    //   2408: ifnonnull -> 2426
    //   2411: goto -> 2418
    //   2414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2417: athrow
    //   2418: aload_1
    //   2419: goto -> 2433
    //   2422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2425: athrow
    //   2426: aload_1
    //   2427: checkcast [B
    //   2430: invokevirtual clone : ()Ljava/lang/Object;
    //   2433: aastore
    //   2434: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2437: checkcast java/lang/Boolean
    //   2440: invokevirtual booleanValue : ()Z
    //   2443: istore #4
    //   2445: iload_2
    //   2446: ifeq -> 2463
    //   2449: iinc #7, 1
    //   2452: iload_2
    //   2453: ifeq -> 2322
    //   2456: goto -> 2463
    //   2459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2462: athrow
    //   2463: goto -> 2805
    //   2466: sipush #-13098
    //   2469: sipush #6843
    //   2472: invokestatic a : (II)Ljava/lang/String;
    //   2475: iconst_1
    //   2476: ldc burp/Zs4v
    //   2478: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2481: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2484: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2487: astore #5
    //   2489: aload #5
    //   2491: arraylength
    //   2492: istore #6
    //   2494: iconst_0
    //   2495: istore #7
    //   2497: iload #7
    //   2499: iload #6
    //   2501: if_icmpge -> 2639
    //   2504: aload #5
    //   2506: iload #7
    //   2508: aaload
    //   2509: astore #8
    //   2511: aload #8
    //   2513: invokevirtual getModifiers : ()I
    //   2516: invokestatic isStatic : (I)Z
    //   2519: ifne -> 2529
    //   2522: goto -> 2632
    //   2525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2528: athrow
    //   2529: aload #8
    //   2531: invokevirtual getType : ()Ljava/lang/Class;
    //   2534: astore #9
    //   2536: aload #9
    //   2538: ifnull -> 2619
    //   2541: aload #9
    //   2543: invokevirtual isPrimitive : ()Z
    //   2546: ifne -> 2619
    //   2549: goto -> 2556
    //   2552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2555: athrow
    //   2556: aload #9
    //   2558: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2561: ifnull -> 2619
    //   2564: goto -> 2571
    //   2567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2570: athrow
    //   2571: aload #9
    //   2573: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2576: invokevirtual getName : ()Ljava/lang/String;
    //   2579: ifnull -> 2619
    //   2582: goto -> 2589
    //   2585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2588: athrow
    //   2589: aload #9
    //   2591: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2594: invokevirtual getName : ()Ljava/lang/String;
    //   2597: sipush #-13113
    //   2600: sipush #-28671
    //   2603: invokestatic a : (II)Ljava/lang/String;
    //   2606: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2609: ifne -> 2619
    //   2612: goto -> 2619
    //   2615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2618: athrow
    //   2619: aload #8
    //   2621: iconst_1
    //   2622: invokevirtual setAccessible : (Z)V
    //   2625: aload #8
    //   2627: aconst_null
    //   2628: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2631: pop
    //   2632: iinc #7, 1
    //   2635: iload_2
    //   2636: ifeq -> 2497
    //   2639: sipush #-13118
    //   2642: sipush #18690
    //   2645: invokestatic a : (II)Ljava/lang/String;
    //   2648: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2651: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2654: astore #5
    //   2656: aload #5
    //   2658: arraylength
    //   2659: istore #6
    //   2661: iconst_0
    //   2662: istore #7
    //   2664: iload #7
    //   2666: iload #6
    //   2668: if_icmpge -> 2805
    //   2671: aload #5
    //   2673: iload #7
    //   2675: aaload
    //   2676: astore #8
    //   2678: aload #8
    //   2680: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2683: pop
    //   2684: aload #8
    //   2686: invokevirtual getModifiers : ()I
    //   2689: invokestatic isStatic : (I)Z
    //   2692: ifeq -> 2791
    //   2695: aload #8
    //   2697: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2700: arraylength
    //   2701: iconst_2
    //   2702: if_icmpne -> 2791
    //   2705: goto -> 2712
    //   2708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2711: athrow
    //   2712: aload #8
    //   2714: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2717: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2720: if_acmpne -> 2791
    //   2723: goto -> 2730
    //   2726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2729: athrow
    //   2730: aload #8
    //   2732: iconst_1
    //   2733: invokevirtual setAccessible : (Z)V
    //   2736: aload #8
    //   2738: aconst_null
    //   2739: iconst_2
    //   2740: anewarray java/lang/Object
    //   2743: dup
    //   2744: iconst_0
    //   2745: aload_0
    //   2746: aastore
    //   2747: dup
    //   2748: iconst_1
    //   2749: aload_1
    //   2750: ifnonnull -> 2768
    //   2753: goto -> 2760
    //   2756: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2759: athrow
    //   2760: aload_1
    //   2761: goto -> 2775
    //   2764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2767: athrow
    //   2768: aload_1
    //   2769: checkcast [B
    //   2772: invokevirtual clone : ()Ljava/lang/Object;
    //   2775: aastore
    //   2776: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2779: checkcast java/lang/Boolean
    //   2782: invokevirtual booleanValue : ()Z
    //   2785: istore #4
    //   2787: iload_2
    //   2788: ifeq -> 2805
    //   2791: iinc #7, 1
    //   2794: iload_2
    //   2795: ifeq -> 2664
    //   2798: goto -> 2805
    //   2801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2804: athrow
    //   2805: iload #4
    //   2807: ifeq -> 2813
    //   2810: iload #4
    //   2812: ireturn
    //   2813: getstatic burp/Zr4z.Zw : Ljava/lang/String;
    //   2816: getstatic burp/Zz5l.Zb : Ljava/lang/Object;
    //   2819: checkcast java/math/BigInteger
    //   2822: invokevirtual intValue : ()I
    //   2825: bipush #32
    //   2827: irem
    //   2828: invokestatic abs : (I)I
    //   2831: invokevirtual charAt : (I)C
    //   2834: getstatic burp/Zrct.ZT : Ljava/lang/String;
    //   2837: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   2840: checkcast java/math/BigInteger
    //   2843: invokevirtual intValue : ()I
    //   2846: bipush #32
    //   2848: irem
    //   2849: invokestatic abs : (I)I
    //   2852: invokevirtual charAt : (I)C
    //   2855: if_icmpgt -> 3201
    //   2858: sipush #-13110
    //   2861: sipush #17056
    //   2864: invokestatic a : (II)Ljava/lang/String;
    //   2867: iconst_1
    //   2868: ldc burp/Zg6f
    //   2870: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2873: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2876: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2879: astore #5
    //   2881: aload #5
    //   2883: arraylength
    //   2884: istore #6
    //   2886: iconst_0
    //   2887: istore #7
    //   2889: iload #7
    //   2891: iload #6
    //   2893: if_icmpge -> 3031
    //   2896: aload #5
    //   2898: iload #7
    //   2900: aaload
    //   2901: astore #8
    //   2903: aload #8
    //   2905: invokevirtual getModifiers : ()I
    //   2908: invokestatic isStatic : (I)Z
    //   2911: ifne -> 2921
    //   2914: goto -> 3024
    //   2917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2920: athrow
    //   2921: aload #8
    //   2923: invokevirtual getType : ()Ljava/lang/Class;
    //   2926: astore #9
    //   2928: aload #9
    //   2930: ifnull -> 3011
    //   2933: aload #9
    //   2935: invokevirtual isPrimitive : ()Z
    //   2938: ifne -> 3011
    //   2941: goto -> 2948
    //   2944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2947: athrow
    //   2948: aload #9
    //   2950: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2953: ifnull -> 3011
    //   2956: goto -> 2963
    //   2959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2962: athrow
    //   2963: aload #9
    //   2965: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2968: invokevirtual getName : ()Ljava/lang/String;
    //   2971: ifnull -> 3011
    //   2974: goto -> 2981
    //   2977: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2980: athrow
    //   2981: aload #9
    //   2983: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2986: invokevirtual getName : ()Ljava/lang/String;
    //   2989: sipush #-13113
    //   2992: sipush #-28671
    //   2995: invokestatic a : (II)Ljava/lang/String;
    //   2998: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3001: ifne -> 3011
    //   3004: goto -> 3011
    //   3007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3010: athrow
    //   3011: aload #8
    //   3013: iconst_1
    //   3014: invokevirtual setAccessible : (Z)V
    //   3017: aload #8
    //   3019: aconst_null
    //   3020: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3023: pop
    //   3024: iinc #7, 1
    //   3027: iload_2
    //   3028: ifeq -> 2889
    //   3031: sipush #-13099
    //   3034: sipush #24779
    //   3037: invokestatic a : (II)Ljava/lang/String;
    //   3040: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3043: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3046: astore #5
    //   3048: aload #5
    //   3050: arraylength
    //   3051: istore #6
    //   3053: iconst_0
    //   3054: istore #7
    //   3056: iload #7
    //   3058: iload #6
    //   3060: if_icmpge -> 3197
    //   3063: aload #5
    //   3065: iload #7
    //   3067: aaload
    //   3068: astore #8
    //   3070: aload #8
    //   3072: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3075: pop
    //   3076: aload #8
    //   3078: invokevirtual getModifiers : ()I
    //   3081: invokestatic isStatic : (I)Z
    //   3084: ifeq -> 3183
    //   3087: aload #8
    //   3089: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3092: arraylength
    //   3093: iconst_2
    //   3094: if_icmpne -> 3183
    //   3097: goto -> 3104
    //   3100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3103: athrow
    //   3104: aload #8
    //   3106: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3109: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3112: if_acmpne -> 3183
    //   3115: goto -> 3122
    //   3118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3121: athrow
    //   3122: aload #8
    //   3124: iconst_1
    //   3125: invokevirtual setAccessible : (Z)V
    //   3128: aload #8
    //   3130: aconst_null
    //   3131: iconst_2
    //   3132: anewarray java/lang/Object
    //   3135: dup
    //   3136: iconst_0
    //   3137: aload_0
    //   3138: aastore
    //   3139: dup
    //   3140: iconst_1
    //   3141: aload_1
    //   3142: ifnonnull -> 3160
    //   3145: goto -> 3152
    //   3148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3151: athrow
    //   3152: aload_1
    //   3153: goto -> 3167
    //   3156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3159: athrow
    //   3160: aload_1
    //   3161: checkcast [B
    //   3164: invokevirtual clone : ()Ljava/lang/Object;
    //   3167: aastore
    //   3168: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3171: checkcast java/lang/Boolean
    //   3174: invokevirtual booleanValue : ()Z
    //   3177: istore #4
    //   3179: iload_2
    //   3180: ifeq -> 3197
    //   3183: iinc #7, 1
    //   3186: iload_2
    //   3187: ifeq -> 3056
    //   3190: goto -> 3197
    //   3193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3196: athrow
    //   3197: iload_2
    //   3198: ifeq -> 3540
    //   3201: sipush #-13120
    //   3204: sipush #-25939
    //   3207: invokestatic a : (II)Ljava/lang/String;
    //   3210: iconst_1
    //   3211: ldc burp/Zgp_
    //   3213: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3216: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3219: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3222: astore #5
    //   3224: aload #5
    //   3226: arraylength
    //   3227: istore #6
    //   3229: iconst_0
    //   3230: istore #7
    //   3232: iload #7
    //   3234: iload #6
    //   3236: if_icmpge -> 3374
    //   3239: aload #5
    //   3241: iload #7
    //   3243: aaload
    //   3244: astore #8
    //   3246: aload #8
    //   3248: invokevirtual getModifiers : ()I
    //   3251: invokestatic isStatic : (I)Z
    //   3254: ifne -> 3264
    //   3257: goto -> 3367
    //   3260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3263: athrow
    //   3264: aload #8
    //   3266: invokevirtual getType : ()Ljava/lang/Class;
    //   3269: astore #9
    //   3271: aload #9
    //   3273: ifnull -> 3354
    //   3276: aload #9
    //   3278: invokevirtual isPrimitive : ()Z
    //   3281: ifne -> 3354
    //   3284: goto -> 3291
    //   3287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3290: athrow
    //   3291: aload #9
    //   3293: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3296: ifnull -> 3354
    //   3299: goto -> 3306
    //   3302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3305: athrow
    //   3306: aload #9
    //   3308: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3311: invokevirtual getName : ()Ljava/lang/String;
    //   3314: ifnull -> 3354
    //   3317: goto -> 3324
    //   3320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3323: athrow
    //   3324: aload #9
    //   3326: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3329: invokevirtual getName : ()Ljava/lang/String;
    //   3332: sipush #-13113
    //   3335: sipush #-28671
    //   3338: invokestatic a : (II)Ljava/lang/String;
    //   3341: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3344: ifne -> 3354
    //   3347: goto -> 3354
    //   3350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3353: athrow
    //   3354: aload #8
    //   3356: iconst_1
    //   3357: invokevirtual setAccessible : (Z)V
    //   3360: aload #8
    //   3362: aconst_null
    //   3363: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3366: pop
    //   3367: iinc #7, 1
    //   3370: iload_2
    //   3371: ifeq -> 3232
    //   3374: sipush #-13105
    //   3377: sipush #-24191
    //   3380: invokestatic a : (II)Ljava/lang/String;
    //   3383: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3386: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3389: astore #5
    //   3391: aload #5
    //   3393: arraylength
    //   3394: istore #6
    //   3396: iconst_0
    //   3397: istore #7
    //   3399: iload #7
    //   3401: iload #6
    //   3403: if_icmpge -> 3540
    //   3406: aload #5
    //   3408: iload #7
    //   3410: aaload
    //   3411: astore #8
    //   3413: aload #8
    //   3415: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3418: pop
    //   3419: aload #8
    //   3421: invokevirtual getModifiers : ()I
    //   3424: invokestatic isStatic : (I)Z
    //   3427: ifeq -> 3526
    //   3430: aload #8
    //   3432: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3435: arraylength
    //   3436: iconst_2
    //   3437: if_icmpne -> 3526
    //   3440: goto -> 3447
    //   3443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3446: athrow
    //   3447: aload #8
    //   3449: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3452: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3455: if_acmpne -> 3526
    //   3458: goto -> 3465
    //   3461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3464: athrow
    //   3465: aload #8
    //   3467: iconst_1
    //   3468: invokevirtual setAccessible : (Z)V
    //   3471: aload #8
    //   3473: aconst_null
    //   3474: iconst_2
    //   3475: anewarray java/lang/Object
    //   3478: dup
    //   3479: iconst_0
    //   3480: aload_0
    //   3481: aastore
    //   3482: dup
    //   3483: iconst_1
    //   3484: aload_1
    //   3485: ifnonnull -> 3503
    //   3488: goto -> 3495
    //   3491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3494: athrow
    //   3495: aload_1
    //   3496: goto -> 3510
    //   3499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3502: athrow
    //   3503: aload_1
    //   3504: checkcast [B
    //   3507: invokevirtual clone : ()Ljava/lang/Object;
    //   3510: aastore
    //   3511: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3514: checkcast java/lang/Boolean
    //   3517: invokevirtual booleanValue : ()Z
    //   3520: istore #4
    //   3522: iload_2
    //   3523: ifeq -> 3540
    //   3526: iinc #7, 1
    //   3529: iload_2
    //   3530: ifeq -> 3399
    //   3533: goto -> 3540
    //   3536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3539: athrow
    //   3540: iload #4
    //   3542: ifeq -> 3548
    //   3545: iload #4
    //   3547: ireturn
    //   3548: getstatic burp/Zm14.ZE : Ljava/lang/String;
    //   3551: getstatic burp/Zth8.Zk : Ljava/lang/Object;
    //   3554: checkcast java/math/BigInteger
    //   3557: invokevirtual intValue : ()I
    //   3560: bipush #32
    //   3562: irem
    //   3563: invokestatic abs : (I)I
    //   3566: invokevirtual charAt : (I)C
    //   3569: getstatic burp/Ztw4.Zb : Ljava/lang/String;
    //   3572: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
    //   3575: checkcast java/math/BigInteger
    //   3578: invokevirtual intValue : ()I
    //   3581: bipush #32
    //   3583: irem
    //   3584: invokestatic abs : (I)I
    //   3587: invokevirtual charAt : (I)C
    //   3590: if_icmple -> 3936
    //   3593: sipush #-13107
    //   3596: sipush #21020
    //   3599: invokestatic a : (II)Ljava/lang/String;
    //   3602: iconst_1
    //   3603: ldc burp/Zzh0
    //   3605: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3608: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3611: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3614: astore #5
    //   3616: aload #5
    //   3618: arraylength
    //   3619: istore #6
    //   3621: iconst_0
    //   3622: istore #7
    //   3624: iload #7
    //   3626: iload #6
    //   3628: if_icmpge -> 3766
    //   3631: aload #5
    //   3633: iload #7
    //   3635: aaload
    //   3636: astore #8
    //   3638: aload #8
    //   3640: invokevirtual getModifiers : ()I
    //   3643: invokestatic isStatic : (I)Z
    //   3646: ifne -> 3656
    //   3649: goto -> 3759
    //   3652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3655: athrow
    //   3656: aload #8
    //   3658: invokevirtual getType : ()Ljava/lang/Class;
    //   3661: astore #9
    //   3663: aload #9
    //   3665: ifnull -> 3746
    //   3668: aload #9
    //   3670: invokevirtual isPrimitive : ()Z
    //   3673: ifne -> 3746
    //   3676: goto -> 3683
    //   3679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3682: athrow
    //   3683: aload #9
    //   3685: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3688: ifnull -> 3746
    //   3691: goto -> 3698
    //   3694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3697: athrow
    //   3698: aload #9
    //   3700: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3703: invokevirtual getName : ()Ljava/lang/String;
    //   3706: ifnull -> 3746
    //   3709: goto -> 3716
    //   3712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3715: athrow
    //   3716: aload #9
    //   3718: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3721: invokevirtual getName : ()Ljava/lang/String;
    //   3724: sipush #-13113
    //   3727: sipush #-28671
    //   3730: invokestatic a : (II)Ljava/lang/String;
    //   3733: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3736: ifne -> 3746
    //   3739: goto -> 3746
    //   3742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3745: athrow
    //   3746: aload #8
    //   3748: iconst_1
    //   3749: invokevirtual setAccessible : (Z)V
    //   3752: aload #8
    //   3754: aconst_null
    //   3755: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3758: pop
    //   3759: iinc #7, 1
    //   3762: iload_2
    //   3763: ifeq -> 3624
    //   3766: sipush #-13117
    //   3769: sipush #17652
    //   3772: invokestatic a : (II)Ljava/lang/String;
    //   3775: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3778: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3781: astore #5
    //   3783: aload #5
    //   3785: arraylength
    //   3786: istore #6
    //   3788: iconst_0
    //   3789: istore #7
    //   3791: iload #7
    //   3793: iload #6
    //   3795: if_icmpge -> 3932
    //   3798: aload #5
    //   3800: iload #7
    //   3802: aaload
    //   3803: astore #8
    //   3805: aload #8
    //   3807: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3810: pop
    //   3811: aload #8
    //   3813: invokevirtual getModifiers : ()I
    //   3816: invokestatic isStatic : (I)Z
    //   3819: ifeq -> 3918
    //   3822: aload #8
    //   3824: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3827: arraylength
    //   3828: iconst_2
    //   3829: if_icmpne -> 3918
    //   3832: goto -> 3839
    //   3835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3838: athrow
    //   3839: aload #8
    //   3841: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3844: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3847: if_acmpne -> 3918
    //   3850: goto -> 3857
    //   3853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3856: athrow
    //   3857: aload #8
    //   3859: iconst_1
    //   3860: invokevirtual setAccessible : (Z)V
    //   3863: aload #8
    //   3865: aconst_null
    //   3866: iconst_2
    //   3867: anewarray java/lang/Object
    //   3870: dup
    //   3871: iconst_0
    //   3872: aload_0
    //   3873: aastore
    //   3874: dup
    //   3875: iconst_1
    //   3876: aload_1
    //   3877: ifnonnull -> 3895
    //   3880: goto -> 3887
    //   3883: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3886: athrow
    //   3887: aload_1
    //   3888: goto -> 3902
    //   3891: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3894: athrow
    //   3895: aload_1
    //   3896: checkcast [B
    //   3899: invokevirtual clone : ()Ljava/lang/Object;
    //   3902: aastore
    //   3903: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3906: checkcast java/lang/Boolean
    //   3909: invokevirtual booleanValue : ()Z
    //   3912: istore #4
    //   3914: iload_2
    //   3915: ifeq -> 3932
    //   3918: iinc #7, 1
    //   3921: iload_2
    //   3922: ifeq -> 3791
    //   3925: goto -> 3932
    //   3928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3931: athrow
    //   3932: iload_2
    //   3933: ifeq -> 4275
    //   3936: sipush #-13116
    //   3939: sipush #-24147
    //   3942: invokestatic a : (II)Ljava/lang/String;
    //   3945: iconst_1
    //   3946: ldc burp/Zg_5
    //   3948: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3951: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3954: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3957: astore #5
    //   3959: aload #5
    //   3961: arraylength
    //   3962: istore #6
    //   3964: iconst_0
    //   3965: istore #7
    //   3967: iload #7
    //   3969: iload #6
    //   3971: if_icmpge -> 4109
    //   3974: aload #5
    //   3976: iload #7
    //   3978: aaload
    //   3979: astore #8
    //   3981: aload #8
    //   3983: invokevirtual getModifiers : ()I
    //   3986: invokestatic isStatic : (I)Z
    //   3989: ifne -> 3999
    //   3992: goto -> 4102
    //   3995: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3998: athrow
    //   3999: aload #8
    //   4001: invokevirtual getType : ()Ljava/lang/Class;
    //   4004: astore #9
    //   4006: aload #9
    //   4008: ifnull -> 4089
    //   4011: aload #9
    //   4013: invokevirtual isPrimitive : ()Z
    //   4016: ifne -> 4089
    //   4019: goto -> 4026
    //   4022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4025: athrow
    //   4026: aload #9
    //   4028: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4031: ifnull -> 4089
    //   4034: goto -> 4041
    //   4037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4040: athrow
    //   4041: aload #9
    //   4043: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4046: invokevirtual getName : ()Ljava/lang/String;
    //   4049: ifnull -> 4089
    //   4052: goto -> 4059
    //   4055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4058: athrow
    //   4059: aload #9
    //   4061: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4064: invokevirtual getName : ()Ljava/lang/String;
    //   4067: sipush #-13113
    //   4070: sipush #-28671
    //   4073: invokestatic a : (II)Ljava/lang/String;
    //   4076: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4079: ifne -> 4089
    //   4082: goto -> 4089
    //   4085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4088: athrow
    //   4089: aload #8
    //   4091: iconst_1
    //   4092: invokevirtual setAccessible : (Z)V
    //   4095: aload #8
    //   4097: aconst_null
    //   4098: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4101: pop
    //   4102: iinc #7, 1
    //   4105: iload_2
    //   4106: ifeq -> 3967
    //   4109: sipush #-13093
    //   4112: sipush #-1156
    //   4115: invokestatic a : (II)Ljava/lang/String;
    //   4118: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4121: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4124: astore #5
    //   4126: aload #5
    //   4128: arraylength
    //   4129: istore #6
    //   4131: iconst_0
    //   4132: istore #7
    //   4134: iload #7
    //   4136: iload #6
    //   4138: if_icmpge -> 4275
    //   4141: aload #5
    //   4143: iload #7
    //   4145: aaload
    //   4146: astore #8
    //   4148: aload #8
    //   4150: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4153: pop
    //   4154: aload #8
    //   4156: invokevirtual getModifiers : ()I
    //   4159: invokestatic isStatic : (I)Z
    //   4162: ifeq -> 4261
    //   4165: aload #8
    //   4167: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4170: arraylength
    //   4171: iconst_2
    //   4172: if_icmpne -> 4261
    //   4175: goto -> 4182
    //   4178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4181: athrow
    //   4182: aload #8
    //   4184: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4187: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4190: if_acmpne -> 4261
    //   4193: goto -> 4200
    //   4196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4199: athrow
    //   4200: aload #8
    //   4202: iconst_1
    //   4203: invokevirtual setAccessible : (Z)V
    //   4206: aload #8
    //   4208: aconst_null
    //   4209: iconst_2
    //   4210: anewarray java/lang/Object
    //   4213: dup
    //   4214: iconst_0
    //   4215: aload_0
    //   4216: aastore
    //   4217: dup
    //   4218: iconst_1
    //   4219: aload_1
    //   4220: ifnonnull -> 4238
    //   4223: goto -> 4230
    //   4226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4229: athrow
    //   4230: aload_1
    //   4231: goto -> 4245
    //   4234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4237: athrow
    //   4238: aload_1
    //   4239: checkcast [B
    //   4242: invokevirtual clone : ()Ljava/lang/Object;
    //   4245: aastore
    //   4246: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4249: checkcast java/lang/Boolean
    //   4252: invokevirtual booleanValue : ()Z
    //   4255: istore #4
    //   4257: iload_2
    //   4258: ifeq -> 4275
    //   4261: iinc #7, 1
    //   4264: iload_2
    //   4265: ifeq -> 4134
    //   4268: goto -> 4275
    //   4271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4274: athrow
    //   4275: iload #4
    //   4277: ifeq -> 4283
    //   4280: iload #4
    //   4282: ireturn
    //   4283: getstatic burp/Zl6z.ZL : Ljava/lang/String;
    //   4286: getstatic burp/Zl8s.ZY : Ljava/lang/Object;
    //   4289: checkcast java/math/BigInteger
    //   4292: invokevirtual intValue : ()I
    //   4295: bipush #32
    //   4297: irem
    //   4298: invokestatic abs : (I)I
    //   4301: invokevirtual charAt : (I)C
    //   4304: getstatic burp/Zrnw.Zg : Ljava/lang/String;
    //   4307: getstatic burp/Zkfb.ZN : Ljava/lang/Object;
    //   4310: checkcast java/math/BigInteger
    //   4313: invokevirtual intValue : ()I
    //   4316: bipush #32
    //   4318: irem
    //   4319: invokestatic abs : (I)I
    //   4322: invokevirtual charAt : (I)C
    //   4325: if_icmpgt -> 4671
    //   4328: sipush #-13094
    //   4331: sipush #-20264
    //   4334: invokestatic a : (II)Ljava/lang/String;
    //   4337: iconst_1
    //   4338: ldc burp/Zrf9
    //   4340: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4343: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4346: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4349: astore #5
    //   4351: aload #5
    //   4353: arraylength
    //   4354: istore #6
    //   4356: iconst_0
    //   4357: istore #7
    //   4359: iload #7
    //   4361: iload #6
    //   4363: if_icmpge -> 4501
    //   4366: aload #5
    //   4368: iload #7
    //   4370: aaload
    //   4371: astore #8
    //   4373: aload #8
    //   4375: invokevirtual getModifiers : ()I
    //   4378: invokestatic isStatic : (I)Z
    //   4381: ifne -> 4391
    //   4384: goto -> 4494
    //   4387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4390: athrow
    //   4391: aload #8
    //   4393: invokevirtual getType : ()Ljava/lang/Class;
    //   4396: astore #9
    //   4398: aload #9
    //   4400: ifnull -> 4481
    //   4403: aload #9
    //   4405: invokevirtual isPrimitive : ()Z
    //   4408: ifne -> 4481
    //   4411: goto -> 4418
    //   4414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4417: athrow
    //   4418: aload #9
    //   4420: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4423: ifnull -> 4481
    //   4426: goto -> 4433
    //   4429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4432: athrow
    //   4433: aload #9
    //   4435: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4438: invokevirtual getName : ()Ljava/lang/String;
    //   4441: ifnull -> 4481
    //   4444: goto -> 4451
    //   4447: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4450: athrow
    //   4451: aload #9
    //   4453: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4456: invokevirtual getName : ()Ljava/lang/String;
    //   4459: sipush #-13113
    //   4462: sipush #-28671
    //   4465: invokestatic a : (II)Ljava/lang/String;
    //   4468: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4471: ifne -> 4481
    //   4474: goto -> 4481
    //   4477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4480: athrow
    //   4481: aload #8
    //   4483: iconst_1
    //   4484: invokevirtual setAccessible : (Z)V
    //   4487: aload #8
    //   4489: aconst_null
    //   4490: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4493: pop
    //   4494: iinc #7, 1
    //   4497: iload_2
    //   4498: ifeq -> 4359
    //   4501: sipush #-13115
    //   4504: sipush #-27119
    //   4507: invokestatic a : (II)Ljava/lang/String;
    //   4510: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4513: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4516: astore #5
    //   4518: aload #5
    //   4520: arraylength
    //   4521: istore #6
    //   4523: iconst_0
    //   4524: istore #7
    //   4526: iload #7
    //   4528: iload #6
    //   4530: if_icmpge -> 4667
    //   4533: aload #5
    //   4535: iload #7
    //   4537: aaload
    //   4538: astore #8
    //   4540: aload #8
    //   4542: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4545: pop
    //   4546: aload #8
    //   4548: invokevirtual getModifiers : ()I
    //   4551: invokestatic isStatic : (I)Z
    //   4554: ifeq -> 4653
    //   4557: aload #8
    //   4559: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4562: arraylength
    //   4563: iconst_2
    //   4564: if_icmpne -> 4653
    //   4567: goto -> 4574
    //   4570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4573: athrow
    //   4574: aload #8
    //   4576: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4579: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4582: if_acmpne -> 4653
    //   4585: goto -> 4592
    //   4588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4591: athrow
    //   4592: aload #8
    //   4594: iconst_1
    //   4595: invokevirtual setAccessible : (Z)V
    //   4598: aload #8
    //   4600: aconst_null
    //   4601: iconst_2
    //   4602: anewarray java/lang/Object
    //   4605: dup
    //   4606: iconst_0
    //   4607: aload_0
    //   4608: aastore
    //   4609: dup
    //   4610: iconst_1
    //   4611: aload_1
    //   4612: ifnonnull -> 4630
    //   4615: goto -> 4622
    //   4618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4621: athrow
    //   4622: aload_1
    //   4623: goto -> 4637
    //   4626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4629: athrow
    //   4630: aload_1
    //   4631: checkcast [B
    //   4634: invokevirtual clone : ()Ljava/lang/Object;
    //   4637: aastore
    //   4638: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4641: checkcast java/lang/Boolean
    //   4644: invokevirtual booleanValue : ()Z
    //   4647: istore #4
    //   4649: iload_2
    //   4650: ifeq -> 4667
    //   4653: iinc #7, 1
    //   4656: iload_2
    //   4657: ifeq -> 4526
    //   4660: goto -> 4667
    //   4663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4666: athrow
    //   4667: iload_2
    //   4668: ifeq -> 5010
    //   4671: sipush #-13103
    //   4674: sipush #-21408
    //   4677: invokestatic a : (II)Ljava/lang/String;
    //   4680: iconst_1
    //   4681: ldc burp/Zsde
    //   4683: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4686: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4689: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4692: astore #5
    //   4694: aload #5
    //   4696: arraylength
    //   4697: istore #6
    //   4699: iconst_0
    //   4700: istore #7
    //   4702: iload #7
    //   4704: iload #6
    //   4706: if_icmpge -> 4844
    //   4709: aload #5
    //   4711: iload #7
    //   4713: aaload
    //   4714: astore #8
    //   4716: aload #8
    //   4718: invokevirtual getModifiers : ()I
    //   4721: invokestatic isStatic : (I)Z
    //   4724: ifne -> 4734
    //   4727: goto -> 4837
    //   4730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4733: athrow
    //   4734: aload #8
    //   4736: invokevirtual getType : ()Ljava/lang/Class;
    //   4739: astore #9
    //   4741: aload #9
    //   4743: ifnull -> 4824
    //   4746: aload #9
    //   4748: invokevirtual isPrimitive : ()Z
    //   4751: ifne -> 4824
    //   4754: goto -> 4761
    //   4757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4760: athrow
    //   4761: aload #9
    //   4763: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4766: ifnull -> 4824
    //   4769: goto -> 4776
    //   4772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4775: athrow
    //   4776: aload #9
    //   4778: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4781: invokevirtual getName : ()Ljava/lang/String;
    //   4784: ifnull -> 4824
    //   4787: goto -> 4794
    //   4790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4793: athrow
    //   4794: aload #9
    //   4796: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4799: invokevirtual getName : ()Ljava/lang/String;
    //   4802: sipush #-13113
    //   4805: sipush #-28671
    //   4808: invokestatic a : (II)Ljava/lang/String;
    //   4811: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4814: ifne -> 4824
    //   4817: goto -> 4824
    //   4820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4823: athrow
    //   4824: aload #8
    //   4826: iconst_1
    //   4827: invokevirtual setAccessible : (Z)V
    //   4830: aload #8
    //   4832: aconst_null
    //   4833: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4836: pop
    //   4837: iinc #7, 1
    //   4840: iload_2
    //   4841: ifeq -> 4702
    //   4844: sipush #-13108
    //   4847: sipush #21285
    //   4850: invokestatic a : (II)Ljava/lang/String;
    //   4853: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4856: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4859: astore #5
    //   4861: aload #5
    //   4863: arraylength
    //   4864: istore #6
    //   4866: iconst_0
    //   4867: istore #7
    //   4869: iload #7
    //   4871: iload #6
    //   4873: if_icmpge -> 5010
    //   4876: aload #5
    //   4878: iload #7
    //   4880: aaload
    //   4881: astore #8
    //   4883: aload #8
    //   4885: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4888: pop
    //   4889: aload #8
    //   4891: invokevirtual getModifiers : ()I
    //   4894: invokestatic isStatic : (I)Z
    //   4897: ifeq -> 4996
    //   4900: aload #8
    //   4902: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4905: arraylength
    //   4906: iconst_2
    //   4907: if_icmpne -> 4996
    //   4910: goto -> 4917
    //   4913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4916: athrow
    //   4917: aload #8
    //   4919: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4922: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4925: if_acmpne -> 4996
    //   4928: goto -> 4935
    //   4931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4934: athrow
    //   4935: aload #8
    //   4937: iconst_1
    //   4938: invokevirtual setAccessible : (Z)V
    //   4941: aload #8
    //   4943: aconst_null
    //   4944: iconst_2
    //   4945: anewarray java/lang/Object
    //   4948: dup
    //   4949: iconst_0
    //   4950: aload_0
    //   4951: aastore
    //   4952: dup
    //   4953: iconst_1
    //   4954: aload_1
    //   4955: ifnonnull -> 4973
    //   4958: goto -> 4965
    //   4961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4964: athrow
    //   4965: aload_1
    //   4966: goto -> 4980
    //   4969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4972: athrow
    //   4973: aload_1
    //   4974: checkcast [B
    //   4977: invokevirtual clone : ()Ljava/lang/Object;
    //   4980: aastore
    //   4981: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4984: checkcast java/lang/Boolean
    //   4987: invokevirtual booleanValue : ()Z
    //   4990: istore #4
    //   4992: iload_2
    //   4993: ifeq -> 5010
    //   4996: iinc #7, 1
    //   4999: iload_2
    //   5000: ifeq -> 4869
    //   5003: goto -> 5010
    //   5006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5009: athrow
    //   5010: iload #4
    //   5012: ireturn
    //   5013: astore_3
    //   5014: new java/lang/Exception
    //   5017: dup
    //   5018: aload_3
    //   5019: invokevirtual getMessage : ()Ljava/lang/String;
    //   5022: invokespecial <init> : (Ljava/lang/String;)V
    //   5025: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2812	5013	java/lang/Throwable
    //   40	214	217	java/lang/Throwable
    //   184	251	254	java/lang/Throwable
    //   221	288	291	java/lang/Throwable
    //   258	325	328	java/lang/Throwable
    //   295	362	365	java/lang/Throwable
    //   332	399	402	java/lang/Throwable
    //   369	436	439	java/lang/Throwable
    //   406	473	476	java/lang/Throwable
    //   443	510	513	java/lang/Throwable
    //   480	547	550	java/lang/Throwable
    //   517	584	587	java/lang/Throwable
    //   554	621	624	java/lang/Throwable
    //   591	658	661	java/lang/Throwable
    //   628	695	698	java/lang/Throwable
    //   665	732	735	java/lang/Throwable
    //   702	769	772	java/lang/Throwable
    //   739	806	809	java/lang/Throwable
    //   776	843	846	java/lang/Throwable
    //   813	880	883	java/lang/Throwable
    //   850	917	920	java/lang/Throwable
    //   887	954	957	java/lang/Throwable
    //   924	991	994	java/lang/Throwable
    //   961	1028	1031	java/lang/Throwable
    //   998	1065	1068	java/lang/Throwable
    //   1035	1102	1105	java/lang/Throwable
    //   1072	1139	1142	java/lang/Throwable
    //   1109	1176	1179	java/lang/Throwable
    //   1146	1213	1216	java/lang/Throwable
    //   1183	1250	1253	java/lang/Throwable
    //   1220	1287	1290	java/lang/Throwable
    //   1257	1324	1327	java/lang/Throwable
    //   1294	1357	1360	java/lang/Throwable
    //   1423	1437	1437	java/lang/Throwable
    //   1448	1461	1464	java/lang/Throwable
    //   1453	1476	1479	java/lang/Throwable
    //   1468	1494	1497	java/lang/Throwable
    //   1483	1524	1527	java/lang/Throwable
    //   1590	1617	1620	java/lang/Throwable
    //   1607	1638	1641	java/lang/Throwable
    //   1624	1668	1671	java/lang/Throwable
    //   1645	1679	1679	java/lang/Throwable
    //   1690	1706	1709	java/lang/Throwable
    //   1786	1800	1800	java/lang/Throwable
    //   1811	1824	1827	java/lang/Throwable
    //   1816	1839	1842	java/lang/Throwable
    //   1831	1857	1860	java/lang/Throwable
    //   1846	1887	1890	java/lang/Throwable
    //   1953	1980	1983	java/lang/Throwable
    //   1970	2001	2004	java/lang/Throwable
    //   1987	2031	2034	java/lang/Throwable
    //   2008	2042	2042	java/lang/Throwable
    //   2053	2069	2072	java/lang/Throwable
    //   2169	2183	2183	java/lang/Throwable
    //   2194	2207	2210	java/lang/Throwable
    //   2199	2222	2225	java/lang/Throwable
    //   2214	2240	2243	java/lang/Throwable
    //   2229	2270	2273	java/lang/Throwable
    //   2336	2363	2366	java/lang/Throwable
    //   2353	2381	2384	java/lang/Throwable
    //   2370	2411	2414	java/lang/Throwable
    //   2388	2422	2422	java/lang/Throwable
    //   2445	2456	2459	java/lang/Throwable
    //   2511	2525	2525	java/lang/Throwable
    //   2536	2549	2552	java/lang/Throwable
    //   2541	2564	2567	java/lang/Throwable
    //   2556	2582	2585	java/lang/Throwable
    //   2571	2612	2615	java/lang/Throwable
    //   2678	2705	2708	java/lang/Throwable
    //   2695	2723	2726	java/lang/Throwable
    //   2712	2753	2756	java/lang/Throwable
    //   2730	2764	2764	java/lang/Throwable
    //   2787	2798	2801	java/lang/Throwable
    //   2813	3547	5013	java/lang/Throwable
    //   2903	2917	2917	java/lang/Throwable
    //   2928	2941	2944	java/lang/Throwable
    //   2933	2956	2959	java/lang/Throwable
    //   2948	2974	2977	java/lang/Throwable
    //   2963	3004	3007	java/lang/Throwable
    //   3070	3097	3100	java/lang/Throwable
    //   3087	3115	3118	java/lang/Throwable
    //   3104	3145	3148	java/lang/Throwable
    //   3122	3156	3156	java/lang/Throwable
    //   3179	3190	3193	java/lang/Throwable
    //   3246	3260	3260	java/lang/Throwable
    //   3271	3284	3287	java/lang/Throwable
    //   3276	3299	3302	java/lang/Throwable
    //   3291	3317	3320	java/lang/Throwable
    //   3306	3347	3350	java/lang/Throwable
    //   3413	3440	3443	java/lang/Throwable
    //   3430	3458	3461	java/lang/Throwable
    //   3447	3488	3491	java/lang/Throwable
    //   3465	3499	3499	java/lang/Throwable
    //   3522	3533	3536	java/lang/Throwable
    //   3548	4282	5013	java/lang/Throwable
    //   3638	3652	3652	java/lang/Throwable
    //   3663	3676	3679	java/lang/Throwable
    //   3668	3691	3694	java/lang/Throwable
    //   3683	3709	3712	java/lang/Throwable
    //   3698	3739	3742	java/lang/Throwable
    //   3805	3832	3835	java/lang/Throwable
    //   3822	3850	3853	java/lang/Throwable
    //   3839	3880	3883	java/lang/Throwable
    //   3857	3891	3891	java/lang/Throwable
    //   3914	3925	3928	java/lang/Throwable
    //   3981	3995	3995	java/lang/Throwable
    //   4006	4019	4022	java/lang/Throwable
    //   4011	4034	4037	java/lang/Throwable
    //   4026	4052	4055	java/lang/Throwable
    //   4041	4082	4085	java/lang/Throwable
    //   4148	4175	4178	java/lang/Throwable
    //   4165	4193	4196	java/lang/Throwable
    //   4182	4223	4226	java/lang/Throwable
    //   4200	4234	4234	java/lang/Throwable
    //   4257	4268	4271	java/lang/Throwable
    //   4283	5012	5013	java/lang/Throwable
    //   4373	4387	4387	java/lang/Throwable
    //   4398	4411	4414	java/lang/Throwable
    //   4403	4426	4429	java/lang/Throwable
    //   4418	4444	4447	java/lang/Throwable
    //   4433	4474	4477	java/lang/Throwable
    //   4540	4567	4570	java/lang/Throwable
    //   4557	4585	4588	java/lang/Throwable
    //   4574	4615	4618	java/lang/Throwable
    //   4592	4626	4626	java/lang/Throwable
    //   4649	4660	4663	java/lang/Throwable
    //   4716	4730	4730	java/lang/Throwable
    //   4741	4754	4757	java/lang/Throwable
    //   4746	4769	4772	java/lang/Throwable
    //   4761	4787	4790	java/lang/Throwable
    //   4776	4817	4820	java/lang/Throwable
    //   4883	4910	4913	java/lang/Throwable
    //   4900	4928	4931	java/lang/Throwable
    //   4917	4958	4961	java/lang/Throwable
    //   4935	4969	4969	java/lang/Throwable
    //   4992	5003	5006	java/lang/Throwable
  }
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿ÿ$EIÕ\\tV0p4DÞg1?\\tVk×³ÀùVyøü¥\\th;ÞÝK÷2¹\\tfóÄs¢ò^\\t\\f\\bR»ÚMÌ®³\\tÉJQÝ\\trÌ##^úÂ\\tgð?¤w®fÒ Aï.ZY&ô«±µ TúÿÅÃP÷øÂ\\tÛ+¨ßÁ =É\\tBØirø\\tH³âLÅ\\tÇãBìr?\\t´Ei8å \\t´µE\\f8»f`\\tÔÁ ¨>.\\t»¤jw±MÎ1-¬1gWpXv~jgúGå!ÙëLlùqt3ÁÔìÆdwmdün{0KôMÇá¹Au,?<BTOÙhô ¦#\\tüLÚaµ à\\taCøèk ð\\tät³ÿ¹/C+ï\\bÙþÎ5Uh>Â\\r²8ä\\t9¨ô¯ÏX¨º'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #119
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
    //   68: ldc 'ùÁ%Kýï\\t¿ëíä2Åí'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
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
    //   129: putstatic burp/Zrxf.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrxf.b : [Ljava/lang/String;
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
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #76
    //   229: goto -> 244
    //   232: bipush #93
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #34
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
    //   310: bipush #81
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-74
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-84
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #123
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-15
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-84
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #96
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-75
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-117
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #98
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-68
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-63
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #103
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-29
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-119
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #84
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-88
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-70
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-97
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #73
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-64
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #6
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-123
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #19
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-85
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #21
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #62
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-11
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-41
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #106
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-67
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #85
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   500: sipush #-13112
    //   503: sipush #22339
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zrxf.ZG : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCCC3) & 0xFFFF;
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
      char c = 'ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrxf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */