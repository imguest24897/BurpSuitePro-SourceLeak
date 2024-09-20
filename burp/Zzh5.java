package burp;

import java.math.BigInteger;

class Zzh5 extends ClassLoader {
  static Object ZG;
  
  static String Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZM(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zb(Object paramObject) {
    Zsjw.ZQ = a(11455, -31882);
    Zsjw.Zw = new BigInteger(a(11451, -13837));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgei.Zl.charAt(Math.abs(((BigInteger)Zkf6.ZS).intValue() % 32)) <= Zlf7.ZM.charAt(Math.abs(((BigInteger)Zthx.ZH).intValue() % 32))) {
          try {
            Zrip.ZL(Class.forName(a(11452, 30196)));
            if (!bool)
              Zoa.ZP(Class.forName(a(11449, 6303))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zoa.ZP(Class.forName(a(11449, 6303)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zea.ZO : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zbnk.Zp : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zexl.ZG : Ljava/lang/Object;
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
    //   185: getstatic burp/Zxzv.ZI : Ljava/lang/String;
    //   188: getstatic burp/Zz4m.Zo : Ljava/lang/Object;
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
    //   222: getstatic burp/Zlt1.ZA : Ljava/lang/String;
    //   225: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
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
    //   259: getstatic burp/Zr17.Zu : Ljava/lang/String;
    //   262: getstatic burp/Zd9.Zr : Ljava/lang/Object;
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
    //   296: getstatic burp/Zx63.ZT : Ljava/lang/String;
    //   299: getstatic burp/Zz5e.Zl : Ljava/lang/Object;
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
    //   333: getstatic burp/Zea8.ZE : Ljava/lang/String;
    //   336: getstatic burp/Zrwp.Zk : Ljava/lang/Object;
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
    //   370: getstatic burp/Zka9.ZM : Ljava/lang/String;
    //   373: getstatic burp/Zegv.ZL : Ljava/lang/Object;
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
    //   407: getstatic burp/Ztr5.ZY : Ljava/lang/String;
    //   410: getstatic burp/Zti7.Zw : Ljava/lang/Object;
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
    //   444: getstatic burp/Zrom.ZD : Ljava/lang/String;
    //   447: getstatic burp/Zegw.ZW : Ljava/lang/Object;
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
    //   481: getstatic burp/Zk92.Zc : Ljava/lang/String;
    //   484: getstatic burp/Zrzg.ZA : Ljava/lang/Object;
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
    //   518: getstatic burp/Zz5e.Zd : Ljava/lang/String;
    //   521: getstatic burp/Zlo0.Zu : Ljava/lang/Object;
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
    //   555: getstatic burp/Zzyb.Zh : Ljava/lang/String;
    //   558: getstatic burp/Zs5y.Zd : Ljava/lang/Object;
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
    //   592: getstatic burp/Zb3l.Zz : Ljava/lang/String;
    //   595: getstatic burp/Zm83.Zl : Ljava/lang/Object;
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
    //   629: getstatic burp/Zgpx.Z_ : Ljava/lang/String;
    //   632: getstatic burp/Zz66.ZQ : Ljava/lang/Object;
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
    //   666: getstatic burp/Zk1.Zg : Ljava/lang/String;
    //   669: getstatic burp/Zgtx.Z_ : Ljava/lang/Object;
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
    //   703: getstatic burp/Zlbd.Zq : Ljava/lang/String;
    //   706: getstatic burp/Zr9u.ZX : Ljava/lang/Object;
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
    //   740: getstatic burp/Zmh3.Zy : Ljava/lang/String;
    //   743: getstatic burp/Zgeq.ZT : Ljava/lang/Object;
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
    //   777: getstatic burp/Zkql.ZR : Ljava/lang/String;
    //   780: getstatic burp/Zzn6.ZO : Ljava/lang/Object;
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
    //   814: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   817: getstatic burp/Zttd.Zi : Ljava/lang/Object;
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
    //   851: getstatic burp/Zr_x.ZF : Ljava/lang/String;
    //   854: getstatic burp/Zlc2.ZQ : Ljava/lang/Object;
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
    //   888: getstatic burp/Zmkq.Zr : Ljava/lang/String;
    //   891: getstatic burp/Zsko.ZD : Ljava/lang/Object;
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
    //   925: getstatic burp/Zeqx.Zu : Ljava/lang/String;
    //   928: getstatic burp/Zthx.ZH : Ljava/lang/Object;
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
    //   962: getstatic burp/Ze4a.Zm : Ljava/lang/String;
    //   965: getstatic burp/Zs1k.Ze : Ljava/lang/Object;
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
    //   999: getstatic burp/Zxwf.ZX : Ljava/lang/String;
    //   1002: getstatic burp/Zr17.ZR : Ljava/lang/Object;
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
    //   1036: getstatic burp/Zxn4.ZQ : Ljava/lang/String;
    //   1039: getstatic burp/Ze7e.Z_ : Ljava/lang/Object;
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
    //   1073: getstatic burp/Zkf6.ZO : Ljava/lang/String;
    //   1076: getstatic burp/Ztvy.ZH : Ljava/lang/Object;
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
    //   1110: getstatic burp/Zx63.ZT : Ljava/lang/String;
    //   1113: getstatic burp/Zl2t.ZS : Ljava/lang/Object;
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
    //   1147: getstatic burp/Zvob.Zn : Ljava/lang/String;
    //   1150: getstatic burp/Zrex.Zr : Ljava/lang/Object;
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
    //   1184: getstatic burp/Zz4j.ZS : Ljava/lang/String;
    //   1187: getstatic burp/Zs_m.Z_ : Ljava/lang/Object;
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
    //   1221: getstatic burp/Ze7e.Zc : Ljava/lang/String;
    //   1224: getstatic burp/Zsp9.ZV : Ljava/lang/Object;
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
    //   1258: getstatic burp/Zlo0.ZD : Ljava/lang/String;
    //   1261: getstatic burp/Ze84.Zj : Ljava/lang/Object;
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
    //   1295: getstatic burp/Zlg2.ZL : Ljava/lang/String;
    //   1298: getstatic burp/Zmli.Zh : Ljava/lang/Object;
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
    //   1332: getstatic burp/Zrjw.Zz : Ljava/lang/String;
    //   1335: getstatic burp/Zrwp.Zk : Ljava/lang/Object;
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
    //   1375: putstatic burp/Znu.ZF : Ljava/lang/String;
    //   1378: sipush #11454
    //   1381: sipush #4247
    //   1384: invokestatic a : (II)Ljava/lang/String;
    //   1387: iconst_1
    //   1388: ldc burp/Zxzv
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
    //   1509: sipush #11448
    //   1512: sipush #20618
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
    //   1551: sipush #11453
    //   1554: sipush #-20665
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
    //   1713: getstatic burp/Zgi9.Zc : Ljava/lang/Object;
    //   1716: checkcast java/math/BigInteger
    //   1719: invokevirtual toByteArray : ()[B
    //   1722: astore #4
    //   1724: aload #4
    //   1726: arraylength
    //   1727: iconst_2
    //   1728: iadd
    //   1729: newarray byte
    //   1731: astore #6
    //   1733: iconst_0
    //   1734: istore #7
    //   1736: iload #7
    //   1738: aload #4
    //   1740: arraylength
    //   1741: if_icmpge -> 1761
    //   1744: aload #6
    //   1746: iload #7
    //   1748: aload #4
    //   1750: iload #7
    //   1752: baload
    //   1753: bastore
    //   1754: iinc #7, 1
    //   1757: iload_2
    //   1758: ifeq -> 1736
    //   1761: aload #6
    //   1763: arraylength
    //   1764: iconst_3
    //   1765: idiv
    //   1766: iconst_4
    //   1767: imul
    //   1768: newarray byte
    //   1770: astore #5
    //   1772: iconst_0
    //   1773: istore #7
    //   1775: iconst_0
    //   1776: istore #8
    //   1778: iload #7
    //   1780: aload #4
    //   1782: arraylength
    //   1783: if_icmpge -> 1894
    //   1786: aload #5
    //   1788: iload #8
    //   1790: aload #6
    //   1792: iload #7
    //   1794: baload
    //   1795: iconst_2
    //   1796: iushr
    //   1797: bipush #63
    //   1799: iand
    //   1800: i2b
    //   1801: bastore
    //   1802: aload #5
    //   1804: iload #8
    //   1806: iconst_1
    //   1807: iadd
    //   1808: aload #6
    //   1810: iload #7
    //   1812: iconst_1
    //   1813: iadd
    //   1814: baload
    //   1815: iconst_4
    //   1816: iushr
    //   1817: bipush #15
    //   1819: iand
    //   1820: aload #6
    //   1822: iload #7
    //   1824: baload
    //   1825: iconst_4
    //   1826: ishl
    //   1827: bipush #63
    //   1829: iand
    //   1830: ior
    //   1831: i2b
    //   1832: bastore
    //   1833: aload #5
    //   1835: iload #8
    //   1837: iconst_2
    //   1838: iadd
    //   1839: aload #6
    //   1841: iload #7
    //   1843: iconst_2
    //   1844: iadd
    //   1845: baload
    //   1846: bipush #6
    //   1848: iushr
    //   1849: iconst_3
    //   1850: iand
    //   1851: aload #6
    //   1853: iload #7
    //   1855: iconst_1
    //   1856: iadd
    //   1857: baload
    //   1858: iconst_2
    //   1859: ishl
    //   1860: bipush #63
    //   1862: iand
    //   1863: ior
    //   1864: i2b
    //   1865: bastore
    //   1866: aload #5
    //   1868: iload #8
    //   1870: iconst_3
    //   1871: iadd
    //   1872: aload #6
    //   1874: iload #7
    //   1876: iconst_2
    //   1877: iadd
    //   1878: baload
    //   1879: bipush #63
    //   1881: iand
    //   1882: i2b
    //   1883: bastore
    //   1884: iinc #7, 3
    //   1887: iinc #8, 4
    //   1890: iload_2
    //   1891: ifeq -> 1778
    //   1894: iconst_0
    //   1895: istore #7
    //   1897: iload #7
    //   1899: aload #5
    //   1901: arraylength
    //   1902: if_icmpge -> 2086
    //   1905: aload #5
    //   1907: iload #7
    //   1909: baload
    //   1910: bipush #26
    //   1912: if_icmpge -> 1940
    //   1915: aload #5
    //   1917: iload #7
    //   1919: aload #5
    //   1921: iload #7
    //   1923: baload
    //   1924: bipush #65
    //   1926: iadd
    //   1927: i2b
    //   1928: bastore
    //   1929: iload_2
    //   1930: ifeq -> 2079
    //   1933: goto -> 1940
    //   1936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1939: athrow
    //   1940: aload #5
    //   1942: iload #7
    //   1944: baload
    //   1945: bipush #52
    //   1947: if_icmpge -> 1985
    //   1950: goto -> 1957
    //   1953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1956: athrow
    //   1957: aload #5
    //   1959: iload #7
    //   1961: aload #5
    //   1963: iload #7
    //   1965: baload
    //   1966: bipush #97
    //   1968: iadd
    //   1969: bipush #26
    //   1971: isub
    //   1972: i2b
    //   1973: bastore
    //   1974: iload_2
    //   1975: ifeq -> 2079
    //   1978: goto -> 1985
    //   1981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1984: athrow
    //   1985: aload #5
    //   1987: iload #7
    //   1989: baload
    //   1990: bipush #62
    //   1992: if_icmpge -> 2030
    //   1995: goto -> 2002
    //   1998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2001: athrow
    //   2002: aload #5
    //   2004: iload #7
    //   2006: aload #5
    //   2008: iload #7
    //   2010: baload
    //   2011: bipush #48
    //   2013: iadd
    //   2014: bipush #52
    //   2016: isub
    //   2017: i2b
    //   2018: bastore
    //   2019: iload_2
    //   2020: ifeq -> 2079
    //   2023: goto -> 2030
    //   2026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2029: athrow
    //   2030: aload #5
    //   2032: iload #7
    //   2034: baload
    //   2035: bipush #63
    //   2037: if_icmpge -> 2065
    //   2040: goto -> 2047
    //   2043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2046: athrow
    //   2047: aload #5
    //   2049: iload #7
    //   2051: bipush #43
    //   2053: bastore
    //   2054: iload_2
    //   2055: ifeq -> 2079
    //   2058: goto -> 2065
    //   2061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2064: athrow
    //   2065: aload #5
    //   2067: iload #7
    //   2069: bipush #47
    //   2071: bastore
    //   2072: goto -> 2079
    //   2075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2078: athrow
    //   2079: iinc #7, 1
    //   2082: iload_2
    //   2083: ifeq -> 1897
    //   2086: aload #5
    //   2088: arraylength
    //   2089: iconst_1
    //   2090: isub
    //   2091: istore #7
    //   2093: iload #7
    //   2095: aload #4
    //   2097: arraylength
    //   2098: iconst_4
    //   2099: imul
    //   2100: iconst_3
    //   2101: idiv
    //   2102: if_icmple -> 2119
    //   2105: aload #5
    //   2107: iload #7
    //   2109: bipush #61
    //   2111: bastore
    //   2112: iinc #7, -1
    //   2115: iload_2
    //   2116: ifeq -> 2093
    //   2119: getstatic burp/Zr36.Ze : Ljava/lang/String;
    //   2122: getstatic burp/Zr36.Za : Ljava/lang/Object;
    //   2125: checkcast java/math/BigInteger
    //   2128: invokevirtual intValue : ()I
    //   2131: bipush #32
    //   2133: irem
    //   2134: invokestatic abs : (I)I
    //   2137: invokevirtual charAt : (I)C
    //   2140: getstatic burp/Zs1k.Zd : Ljava/lang/String;
    //   2143: getstatic burp/Zmf2.Zx : Ljava/lang/Object;
    //   2146: checkcast java/math/BigInteger
    //   2149: invokevirtual intValue : ()I
    //   2152: bipush #32
    //   2154: irem
    //   2155: invokestatic abs : (I)I
    //   2158: invokevirtual charAt : (I)C
    //   2161: if_icmple -> 2276
    //   2164: getstatic burp/Zg61.ZX : Ljava/lang/String;
    //   2167: getstatic burp/Zm69.Zg : Ljava/lang/Object;
    //   2170: checkcast java/math/BigInteger
    //   2173: invokevirtual intValue : ()I
    //   2176: bipush #32
    //   2178: irem
    //   2179: invokestatic abs : (I)I
    //   2182: invokevirtual charAt : (I)C
    //   2185: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   2188: getstatic burp/Zsvd.Zk : Ljava/lang/Object;
    //   2191: checkcast java/math/BigInteger
    //   2194: invokevirtual intValue : ()I
    //   2197: bipush #32
    //   2199: irem
    //   2200: invokestatic abs : (I)I
    //   2203: invokevirtual charAt : (I)C
    //   2206: if_icmple -> 2276
    //   2209: goto -> 2216
    //   2212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2215: athrow
    //   2216: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   2219: getstatic burp/Zm0d.Zz : Ljava/lang/Object;
    //   2222: checkcast java/math/BigInteger
    //   2225: invokevirtual intValue : ()I
    //   2228: bipush #32
    //   2230: irem
    //   2231: invokestatic abs : (I)I
    //   2234: invokevirtual charAt : (I)C
    //   2237: getstatic burp/Zmt_.ZH : Ljava/lang/String;
    //   2240: getstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   2243: checkcast java/math/BigInteger
    //   2246: invokevirtual intValue : ()I
    //   2249: bipush #32
    //   2251: irem
    //   2252: invokestatic abs : (I)I
    //   2255: invokevirtual charAt : (I)C
    //   2258: if_icmpgt -> 2276
    //   2261: goto -> 2268
    //   2264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2267: athrow
    //   2268: iconst_1
    //   2269: goto -> 2277
    //   2272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2275: athrow
    //   2276: iconst_0
    //   2277: ireturn
    //   2278: astore_3
    //   2279: new java/lang/Exception
    //   2282: dup
    //   2283: aload_3
    //   2284: invokevirtual getMessage : ()Ljava/lang/String;
    //   2287: invokespecial <init> : (Ljava/lang/String;)V
    //   2290: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2277	2278	java/lang/Throwable
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
    //   1905	1933	1936	java/lang/Throwable
    //   1915	1950	1953	java/lang/Throwable
    //   1940	1978	1981	java/lang/Throwable
    //   1957	1995	1998	java/lang/Throwable
    //   1985	2023	2026	java/lang/Throwable
    //   2002	2040	2043	java/lang/Throwable
    //   2030	2058	2061	java/lang/Throwable
    //   2047	2072	2075	java/lang/Throwable
    //   2119	2209	2212	java/lang/Throwable
    //   2164	2261	2264	java/lang/Throwable
    //   2216	2272	2272	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '©¡b\\tÂUÌûïï35 èÈZ=·züñT\\f ¦ y`\5DÄlîç½MÌ>ãb,ÈÎAm³ÇÌx~àÍd9Àü@ì\\rÉíØlÑH#¡nÀ,ÉÂuü%Ö[zEÝÀ7â%×x³~*F¬Í³¶Ôû i0§\\t¹4£×÷j^Ø\\tJÜÝÊ8É§¥¼'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '¯ t±o l±aËá«Âxðëã%à0¿J#Ý¡\\t.µx§'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #70
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
    //   128: putstatic burp/Zzh5.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzh5.b : [Ljava/lang/String;
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
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #115
    //   219: goto -> 244
    //   222: bipush #26
    //   224: goto -> 244
    //   227: bipush #11
    //   229: goto -> 244
    //   232: bipush #77
    //   234: goto -> 244
    //   237: bipush #74
    //   239: goto -> 244
    //   242: bipush #26
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #11
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #71
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #126
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #81
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-7
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-16
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-12
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #32
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-127
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-122
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #51
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #20
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-84
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #72
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #20
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-86
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-73
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-45
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-47
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #49
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #109
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-55
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-119
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-128
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #17
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-112
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #63
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #115
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #38
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #7
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #92
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-2
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zzh5.ZG : Ljava/lang/Object;
    //   501: sipush #11450
    //   504: sipush #24175
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zzh5.Zc : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2CB8) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */