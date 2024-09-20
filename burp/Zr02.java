package burp;

import java.math.BigInteger;

class Zr02 extends ClassLoader {
  static Object ZB;
  
  static String ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZU(Object paramObject) {
    Zt1h.Zw = a(31811, -3970);
    Zt1h.Zb = new BigInteger(a(31832, 18748));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zbjx.ZA.charAt(Math.abs(((BigInteger)Ztl6.ZQ).intValue() % 32)) <= Zrwp.ZS.charAt(Math.abs(((BigInteger)Zsbv.Zl).intValue() % 32))) {
          try {
            Zmu6.Zh(Class.forName(a(31829, 17246)));
            if (!bool)
              Zrjw.Zr(Class.forName(a(31824, -10618))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrjw.Zr(Class.forName(a(31824, -10618)));
    } catch (Throwable throwable) {}
  }
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzii.ZO : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zbli.Zo : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zezi.ZQ : Ljava/lang/Object;
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
    //   185: getstatic burp/Zllk.Zs : Ljava/lang/String;
    //   188: getstatic burp/Zmz.ZW : Ljava/lang/Object;
    //   191: checkcast java/math/BigInteger
    //   194: invokevirtual intValue : ()I
    //   197: bipush #32
    //   199: irem
    //   200: invokestatic abs : (I)I
    //   203: invokevirtual charAt : (I)C
    //   206: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: iload_2
    //   211: ifne -> 1364
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   220: athrow
    //   221: aload_3
    //   222: getstatic burp/Zlo0.ZD : Ljava/lang/String;
    //   225: getstatic burp/Zx5w.Zo : Ljava/lang/Object;
    //   228: checkcast java/math/BigInteger
    //   231: invokevirtual intValue : ()I
    //   234: bipush #32
    //   236: irem
    //   237: invokestatic abs : (I)I
    //   240: invokevirtual charAt : (I)C
    //   243: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: iload_2
    //   248: ifne -> 1364
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   257: athrow
    //   258: aload_3
    //   259: getstatic burp/Zt81.ZL : Ljava/lang/String;
    //   262: getstatic burp/Zrfs.ZV : Ljava/lang/Object;
    //   265: checkcast java/math/BigInteger
    //   268: invokevirtual intValue : ()I
    //   271: bipush #32
    //   273: irem
    //   274: invokestatic abs : (I)I
    //   277: invokevirtual charAt : (I)C
    //   280: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: iload_2
    //   285: ifne -> 1364
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload_3
    //   296: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   299: getstatic burp/Zea.ZO : Ljava/lang/Object;
    //   302: checkcast java/math/BigInteger
    //   305: invokevirtual intValue : ()I
    //   308: bipush #32
    //   310: irem
    //   311: invokestatic abs : (I)I
    //   314: invokevirtual charAt : (I)C
    //   317: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: iload_2
    //   322: ifne -> 1364
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   331: athrow
    //   332: aload_3
    //   333: getstatic burp/Ze1k.ZI : Ljava/lang/String;
    //   336: getstatic burp/Zld9.ZF : Ljava/lang/Object;
    //   339: checkcast java/math/BigInteger
    //   342: invokevirtual intValue : ()I
    //   345: bipush #32
    //   347: irem
    //   348: invokestatic abs : (I)I
    //   351: invokevirtual charAt : (I)C
    //   354: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: iload_2
    //   359: ifne -> 1364
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: aload_3
    //   370: getstatic burp/Zb87.ZK : Ljava/lang/String;
    //   373: getstatic burp/Zbnz.Zb : Ljava/lang/Object;
    //   376: checkcast java/math/BigInteger
    //   379: invokevirtual intValue : ()I
    //   382: bipush #32
    //   384: irem
    //   385: invokestatic abs : (I)I
    //   388: invokevirtual charAt : (I)C
    //   391: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: iload_2
    //   396: ifne -> 1364
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   405: athrow
    //   406: aload_3
    //   407: getstatic burp/Zti4.ZI : Ljava/lang/String;
    //   410: getstatic burp/Zm69.Zg : Ljava/lang/Object;
    //   413: checkcast java/math/BigInteger
    //   416: invokevirtual intValue : ()I
    //   419: bipush #32
    //   421: irem
    //   422: invokestatic abs : (I)I
    //   425: invokevirtual charAt : (I)C
    //   428: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   431: pop
    //   432: iload_2
    //   433: ifne -> 1364
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   442: athrow
    //   443: aload_3
    //   444: getstatic burp/Zmli.Zc : Ljava/lang/String;
    //   447: getstatic burp/Zz4j.Zu : Ljava/lang/Object;
    //   450: checkcast java/math/BigInteger
    //   453: invokevirtual intValue : ()I
    //   456: bipush #32
    //   458: irem
    //   459: invokestatic abs : (I)I
    //   462: invokevirtual charAt : (I)C
    //   465: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: iload_2
    //   470: ifne -> 1364
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: aload_3
    //   481: getstatic burp/Zz0f.ZW : Ljava/lang/String;
    //   484: getstatic burp/Zzah.Za : Ljava/lang/Object;
    //   487: checkcast java/math/BigInteger
    //   490: invokevirtual intValue : ()I
    //   493: bipush #32
    //   495: irem
    //   496: invokestatic abs : (I)I
    //   499: invokevirtual charAt : (I)C
    //   502: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   505: pop
    //   506: iload_2
    //   507: ifne -> 1364
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   516: athrow
    //   517: aload_3
    //   518: getstatic burp/Zt8m.ZT : Ljava/lang/String;
    //   521: getstatic burp/Zs4g.ZC : Ljava/lang/Object;
    //   524: checkcast java/math/BigInteger
    //   527: invokevirtual intValue : ()I
    //   530: bipush #32
    //   532: irem
    //   533: invokestatic abs : (I)I
    //   536: invokevirtual charAt : (I)C
    //   539: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   542: pop
    //   543: iload_2
    //   544: ifne -> 1364
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   553: athrow
    //   554: aload_3
    //   555: getstatic burp/Ze7e.Zc : Ljava/lang/String;
    //   558: getstatic burp/Zlxr.Zz : Ljava/lang/Object;
    //   561: checkcast java/math/BigInteger
    //   564: invokevirtual intValue : ()I
    //   567: bipush #32
    //   569: irem
    //   570: invokestatic abs : (I)I
    //   573: invokevirtual charAt : (I)C
    //   576: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   579: pop
    //   580: iload_2
    //   581: ifne -> 1364
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   590: athrow
    //   591: aload_3
    //   592: getstatic burp/Zka9.ZM : Ljava/lang/String;
    //   595: getstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   598: checkcast java/math/BigInteger
    //   601: invokevirtual intValue : ()I
    //   604: bipush #32
    //   606: irem
    //   607: invokestatic abs : (I)I
    //   610: invokevirtual charAt : (I)C
    //   613: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   616: pop
    //   617: iload_2
    //   618: ifne -> 1364
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   627: athrow
    //   628: aload_3
    //   629: getstatic burp/Zrye.Za : Ljava/lang/String;
    //   632: getstatic burp/Zz5e.Zl : Ljava/lang/Object;
    //   635: checkcast java/math/BigInteger
    //   638: invokevirtual intValue : ()I
    //   641: bipush #32
    //   643: irem
    //   644: invokestatic abs : (I)I
    //   647: invokevirtual charAt : (I)C
    //   650: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: iload_2
    //   655: ifne -> 1364
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   664: athrow
    //   665: aload_3
    //   666: getstatic burp/Zk7o.Zb : Ljava/lang/String;
    //   669: getstatic burp/Zk5k.Zr : Ljava/lang/Object;
    //   672: checkcast java/math/BigInteger
    //   675: invokevirtual intValue : ()I
    //   678: bipush #32
    //   680: irem
    //   681: invokestatic abs : (I)I
    //   684: invokevirtual charAt : (I)C
    //   687: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   690: pop
    //   691: iload_2
    //   692: ifne -> 1364
    //   695: goto -> 702
    //   698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   701: athrow
    //   702: aload_3
    //   703: getstatic burp/Zvob.Zn : Ljava/lang/String;
    //   706: getstatic burp/Zscz.ZN : Ljava/lang/Object;
    //   709: checkcast java/math/BigInteger
    //   712: invokevirtual intValue : ()I
    //   715: bipush #32
    //   717: irem
    //   718: invokestatic abs : (I)I
    //   721: invokevirtual charAt : (I)C
    //   724: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   727: pop
    //   728: iload_2
    //   729: ifne -> 1364
    //   732: goto -> 739
    //   735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   738: athrow
    //   739: aload_3
    //   740: getstatic burp/Zeqz.ZV : Ljava/lang/String;
    //   743: getstatic burp/Zbss.Zh : Ljava/lang/Object;
    //   746: checkcast java/math/BigInteger
    //   749: invokevirtual intValue : ()I
    //   752: bipush #32
    //   754: irem
    //   755: invokestatic abs : (I)I
    //   758: invokevirtual charAt : (I)C
    //   761: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   764: pop
    //   765: iload_2
    //   766: ifne -> 1364
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   775: athrow
    //   776: aload_3
    //   777: getstatic burp/Zti4.ZI : Ljava/lang/String;
    //   780: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   783: checkcast java/math/BigInteger
    //   786: invokevirtual intValue : ()I
    //   789: bipush #32
    //   791: irem
    //   792: invokestatic abs : (I)I
    //   795: invokevirtual charAt : (I)C
    //   798: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   801: pop
    //   802: iload_2
    //   803: ifne -> 1364
    //   806: goto -> 813
    //   809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   812: athrow
    //   813: aload_3
    //   814: getstatic burp/Zgtd.Zj : Ljava/lang/String;
    //   817: getstatic burp/Zsjc.ZX : Ljava/lang/Object;
    //   820: checkcast java/math/BigInteger
    //   823: invokevirtual intValue : ()I
    //   826: bipush #32
    //   828: irem
    //   829: invokestatic abs : (I)I
    //   832: invokevirtual charAt : (I)C
    //   835: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   838: pop
    //   839: iload_2
    //   840: ifne -> 1364
    //   843: goto -> 850
    //   846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   849: athrow
    //   850: aload_3
    //   851: getstatic burp/Zex0.Zk : Ljava/lang/String;
    //   854: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   857: checkcast java/math/BigInteger
    //   860: invokevirtual intValue : ()I
    //   863: bipush #32
    //   865: irem
    //   866: invokestatic abs : (I)I
    //   869: invokevirtual charAt : (I)C
    //   872: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   875: pop
    //   876: iload_2
    //   877: ifne -> 1364
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   886: athrow
    //   887: aload_3
    //   888: getstatic burp/Zetf.Zo : Ljava/lang/String;
    //   891: getstatic burp/Zr17.ZR : Ljava/lang/Object;
    //   894: checkcast java/math/BigInteger
    //   897: invokevirtual intValue : ()I
    //   900: bipush #32
    //   902: irem
    //   903: invokestatic abs : (I)I
    //   906: invokevirtual charAt : (I)C
    //   909: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   912: pop
    //   913: iload_2
    //   914: ifne -> 1364
    //   917: goto -> 924
    //   920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   923: athrow
    //   924: aload_3
    //   925: getstatic burp/Zz0b.ZD : Ljava/lang/String;
    //   928: getstatic burp/Zr6c.ZG : Ljava/lang/Object;
    //   931: checkcast java/math/BigInteger
    //   934: invokevirtual intValue : ()I
    //   937: bipush #32
    //   939: irem
    //   940: invokestatic abs : (I)I
    //   943: invokevirtual charAt : (I)C
    //   946: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   949: pop
    //   950: iload_2
    //   951: ifne -> 1364
    //   954: goto -> 961
    //   957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   960: athrow
    //   961: aload_3
    //   962: getstatic burp/Ztq4.Zb : Ljava/lang/String;
    //   965: getstatic burp/Zxdy.ZZ : Ljava/lang/Object;
    //   968: checkcast java/math/BigInteger
    //   971: invokevirtual intValue : ()I
    //   974: bipush #32
    //   976: irem
    //   977: invokestatic abs : (I)I
    //   980: invokevirtual charAt : (I)C
    //   983: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   986: pop
    //   987: iload_2
    //   988: ifne -> 1364
    //   991: goto -> 998
    //   994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   997: athrow
    //   998: aload_3
    //   999: getstatic burp/Zmhq.Zy : Ljava/lang/String;
    //   1002: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   1005: checkcast java/math/BigInteger
    //   1008: invokevirtual intValue : ()I
    //   1011: bipush #32
    //   1013: irem
    //   1014: invokestatic abs : (I)I
    //   1017: invokevirtual charAt : (I)C
    //   1020: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1023: pop
    //   1024: iload_2
    //   1025: ifne -> 1364
    //   1028: goto -> 1035
    //   1031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1034: athrow
    //   1035: aload_3
    //   1036: getstatic burp/Zzah.Zs : Ljava/lang/String;
    //   1039: getstatic burp/Zlgh.Zd : Ljava/lang/Object;
    //   1042: checkcast java/math/BigInteger
    //   1045: invokevirtual intValue : ()I
    //   1048: bipush #32
    //   1050: irem
    //   1051: invokestatic abs : (I)I
    //   1054: invokevirtual charAt : (I)C
    //   1057: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1060: pop
    //   1061: iload_2
    //   1062: ifne -> 1364
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1071: athrow
    //   1072: aload_3
    //   1073: getstatic burp/Zzts.Zk : Ljava/lang/String;
    //   1076: getstatic burp/Zgtx.Z_ : Ljava/lang/Object;
    //   1079: checkcast java/math/BigInteger
    //   1082: invokevirtual intValue : ()I
    //   1085: bipush #32
    //   1087: irem
    //   1088: invokestatic abs : (I)I
    //   1091: invokevirtual charAt : (I)C
    //   1094: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1097: pop
    //   1098: iload_2
    //   1099: ifne -> 1364
    //   1102: goto -> 1109
    //   1105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1108: athrow
    //   1109: aload_3
    //   1110: getstatic burp/Zg0q.Ze : Ljava/lang/String;
    //   1113: getstatic burp/Zlwj.ZE : Ljava/lang/Object;
    //   1116: checkcast java/math/BigInteger
    //   1119: invokevirtual intValue : ()I
    //   1122: bipush #32
    //   1124: irem
    //   1125: invokestatic abs : (I)I
    //   1128: invokevirtual charAt : (I)C
    //   1131: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1134: pop
    //   1135: iload_2
    //   1136: ifne -> 1364
    //   1139: goto -> 1146
    //   1142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1145: athrow
    //   1146: aload_3
    //   1147: getstatic burp/Zgei.Zl : Ljava/lang/String;
    //   1150: getstatic burp/Zbss.Zh : Ljava/lang/Object;
    //   1153: checkcast java/math/BigInteger
    //   1156: invokevirtual intValue : ()I
    //   1159: bipush #32
    //   1161: irem
    //   1162: invokestatic abs : (I)I
    //   1165: invokevirtual charAt : (I)C
    //   1168: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1171: pop
    //   1172: iload_2
    //   1173: ifne -> 1364
    //   1176: goto -> 1183
    //   1179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1182: athrow
    //   1183: aload_3
    //   1184: getstatic burp/Zxd1.ZQ : Ljava/lang/String;
    //   1187: getstatic burp/Zl7b.ZK : Ljava/lang/Object;
    //   1190: checkcast java/math/BigInteger
    //   1193: invokevirtual intValue : ()I
    //   1196: bipush #32
    //   1198: irem
    //   1199: invokestatic abs : (I)I
    //   1202: invokevirtual charAt : (I)C
    //   1205: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1208: pop
    //   1209: iload_2
    //   1210: ifne -> 1364
    //   1213: goto -> 1220
    //   1216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1219: athrow
    //   1220: aload_3
    //   1221: getstatic burp/Zbnz.Zp : Ljava/lang/String;
    //   1224: getstatic burp/Zrt3.ZG : Ljava/lang/Object;
    //   1227: checkcast java/math/BigInteger
    //   1230: invokevirtual intValue : ()I
    //   1233: bipush #32
    //   1235: irem
    //   1236: invokestatic abs : (I)I
    //   1239: invokevirtual charAt : (I)C
    //   1242: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1245: pop
    //   1246: iload_2
    //   1247: ifne -> 1364
    //   1250: goto -> 1257
    //   1253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1256: athrow
    //   1257: aload_3
    //   1258: getstatic burp/Zrnt.Zy : Ljava/lang/String;
    //   1261: getstatic burp/Zegv.ZL : Ljava/lang/Object;
    //   1264: checkcast java/math/BigInteger
    //   1267: invokevirtual intValue : ()I
    //   1270: bipush #32
    //   1272: irem
    //   1273: invokestatic abs : (I)I
    //   1276: invokevirtual charAt : (I)C
    //   1279: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1282: pop
    //   1283: iload_2
    //   1284: ifne -> 1364
    //   1287: goto -> 1294
    //   1290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1293: athrow
    //   1294: aload_3
    //   1295: getstatic burp/Zsfg.Zh : Ljava/lang/String;
    //   1298: getstatic burp/Zes.Zx : Ljava/lang/Object;
    //   1301: checkcast java/math/BigInteger
    //   1304: invokevirtual intValue : ()I
    //   1307: bipush #32
    //   1309: irem
    //   1310: invokestatic abs : (I)I
    //   1313: invokevirtual charAt : (I)C
    //   1316: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1319: pop
    //   1320: iload_2
    //   1321: ifne -> 1364
    //   1324: goto -> 1331
    //   1327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1330: athrow
    //   1331: aload_3
    //   1332: getstatic burp/Zk1.Zg : Ljava/lang/String;
    //   1335: getstatic burp/Zreu.Zi : Ljava/lang/Object;
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
    //   1368: ifne -> 33
    //   1371: aload_3
    //   1372: invokevirtual toString : ()Ljava/lang/String;
    //   1375: putstatic burp/Zbwj.ZP : Ljava/lang/String;
    //   1378: sipush #31826
    //   1381: getstatic burp/Zb3r.ZI : Ljava/lang/Object;
    //   1384: checkcast java/math/BigInteger
    //   1387: getstatic burp/Zrom.ZF : Ljava/lang/Object;
    //   1390: checkcast java/math/BigInteger
    //   1393: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1396: putstatic burp/Zes.Zx : Ljava/lang/Object;
    //   1399: sipush #-19793
    //   1402: invokestatic a : (II)Ljava/lang/String;
    //   1405: iconst_1
    //   1406: ldc burp/Zmt6
    //   1408: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1411: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1414: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1417: astore #4
    //   1419: aload #4
    //   1421: arraylength
    //   1422: istore #5
    //   1424: iconst_0
    //   1425: istore #6
    //   1427: iload #6
    //   1429: iload #5
    //   1431: if_icmpge -> 1569
    //   1434: aload #4
    //   1436: iload #6
    //   1438: aaload
    //   1439: astore #7
    //   1441: aload #7
    //   1443: invokevirtual getModifiers : ()I
    //   1446: invokestatic isStatic : (I)Z
    //   1449: ifne -> 1459
    //   1452: goto -> 1562
    //   1455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1458: athrow
    //   1459: aload #7
    //   1461: invokevirtual getType : ()Ljava/lang/Class;
    //   1464: astore #8
    //   1466: aload #8
    //   1468: ifnull -> 1549
    //   1471: aload #8
    //   1473: invokevirtual isPrimitive : ()Z
    //   1476: ifne -> 1549
    //   1479: goto -> 1486
    //   1482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1485: athrow
    //   1486: aload #8
    //   1488: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1491: ifnull -> 1549
    //   1494: goto -> 1501
    //   1497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1500: athrow
    //   1501: aload #8
    //   1503: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1506: invokevirtual getName : ()Ljava/lang/String;
    //   1509: ifnull -> 1549
    //   1512: goto -> 1519
    //   1515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1518: athrow
    //   1519: aload #8
    //   1521: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1524: invokevirtual getName : ()Ljava/lang/String;
    //   1527: sipush #31808
    //   1530: sipush #21983
    //   1533: invokestatic a : (II)Ljava/lang/String;
    //   1536: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1539: ifne -> 1549
    //   1542: goto -> 1549
    //   1545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1548: athrow
    //   1549: aload #7
    //   1551: iconst_1
    //   1552: invokevirtual setAccessible : (Z)V
    //   1555: aload #7
    //   1557: aconst_null
    //   1558: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1561: pop
    //   1562: iinc #6, 1
    //   1565: iload_2
    //   1566: ifne -> 1427
    //   1569: sipush #31837
    //   1572: sipush #-5215
    //   1575: invokestatic a : (II)Ljava/lang/String;
    //   1578: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1581: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1584: astore #4
    //   1586: aload #4
    //   1588: arraylength
    //   1589: istore #5
    //   1591: iconst_0
    //   1592: istore #6
    //   1594: iload #6
    //   1596: iload #5
    //   1598: if_icmpge -> 1731
    //   1601: aload #4
    //   1603: iload #6
    //   1605: aaload
    //   1606: astore #7
    //   1608: aload #7
    //   1610: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1613: pop
    //   1614: aload #7
    //   1616: invokevirtual getModifiers : ()I
    //   1619: invokestatic isStatic : (I)Z
    //   1622: ifeq -> 1717
    //   1625: aload #7
    //   1627: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1630: arraylength
    //   1631: iconst_2
    //   1632: if_icmpne -> 1717
    //   1635: goto -> 1642
    //   1638: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1641: athrow
    //   1642: aload #7
    //   1644: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1647: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1650: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1653: ifeq -> 1717
    //   1656: goto -> 1663
    //   1659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1662: athrow
    //   1663: aload #7
    //   1665: iconst_1
    //   1666: invokevirtual setAccessible : (Z)V
    //   1669: aload #7
    //   1671: aconst_null
    //   1672: iconst_2
    //   1673: anewarray java/lang/Object
    //   1676: dup
    //   1677: iconst_0
    //   1678: aload_0
    //   1679: aastore
    //   1680: dup
    //   1681: iconst_1
    //   1682: aload_1
    //   1683: ifnonnull -> 1701
    //   1686: goto -> 1693
    //   1689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1692: athrow
    //   1693: aload_1
    //   1694: goto -> 1708
    //   1697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1700: athrow
    //   1701: aload_1
    //   1702: checkcast [B
    //   1705: invokevirtual clone : ()Ljava/lang/Object;
    //   1708: aastore
    //   1709: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1712: pop
    //   1713: iload_2
    //   1714: ifne -> 1731
    //   1717: iinc #6, 1
    //   1720: iload_2
    //   1721: ifne -> 1594
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1730: athrow
    //   1731: iconst_0
    //   1732: istore #4
    //   1734: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   1737: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   1740: checkcast java/math/BigInteger
    //   1743: invokevirtual intValue : ()I
    //   1746: bipush #32
    //   1748: irem
    //   1749: invokestatic abs : (I)I
    //   1752: invokevirtual charAt : (I)C
    //   1755: getstatic burp/Zgsy.Zv : Ljava/lang/String;
    //   1758: getstatic burp/Zmzj.Zm : Ljava/lang/Object;
    //   1761: checkcast java/math/BigInteger
    //   1764: invokevirtual intValue : ()I
    //   1767: bipush #32
    //   1769: irem
    //   1770: invokestatic abs : (I)I
    //   1773: invokevirtual charAt : (I)C
    //   1776: if_icmpgt -> 2121
    //   1779: sipush #31833
    //   1782: sipush #-4548
    //   1785: invokestatic a : (II)Ljava/lang/String;
    //   1788: iconst_1
    //   1789: ldc burp/Ztpg
    //   1791: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1794: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1797: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1800: astore #5
    //   1802: aload #5
    //   1804: arraylength
    //   1805: istore #6
    //   1807: iconst_0
    //   1808: istore #7
    //   1810: iload #7
    //   1812: iload #6
    //   1814: if_icmpge -> 1952
    //   1817: aload #5
    //   1819: iload #7
    //   1821: aaload
    //   1822: astore #8
    //   1824: aload #8
    //   1826: invokevirtual getModifiers : ()I
    //   1829: invokestatic isStatic : (I)Z
    //   1832: ifne -> 1842
    //   1835: goto -> 1945
    //   1838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1841: athrow
    //   1842: aload #8
    //   1844: invokevirtual getType : ()Ljava/lang/Class;
    //   1847: astore #9
    //   1849: aload #9
    //   1851: ifnull -> 1932
    //   1854: aload #9
    //   1856: invokevirtual isPrimitive : ()Z
    //   1859: ifne -> 1932
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: aload #9
    //   1871: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1874: ifnull -> 1932
    //   1877: goto -> 1884
    //   1880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1883: athrow
    //   1884: aload #9
    //   1886: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1889: invokevirtual getName : ()Ljava/lang/String;
    //   1892: ifnull -> 1932
    //   1895: goto -> 1902
    //   1898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1901: athrow
    //   1902: aload #9
    //   1904: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1907: invokevirtual getName : ()Ljava/lang/String;
    //   1910: sipush #31831
    //   1913: sipush #10975
    //   1916: invokestatic a : (II)Ljava/lang/String;
    //   1919: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1922: ifne -> 1932
    //   1925: goto -> 1932
    //   1928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1931: athrow
    //   1932: aload #8
    //   1934: iconst_1
    //   1935: invokevirtual setAccessible : (Z)V
    //   1938: aload #8
    //   1940: aconst_null
    //   1941: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1944: pop
    //   1945: iinc #7, 1
    //   1948: iload_2
    //   1949: ifne -> 1810
    //   1952: sipush #31815
    //   1955: sipush #16658
    //   1958: invokestatic a : (II)Ljava/lang/String;
    //   1961: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1964: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1967: astore #5
    //   1969: aload #5
    //   1971: arraylength
    //   1972: istore #6
    //   1974: iconst_0
    //   1975: istore #7
    //   1977: iload #7
    //   1979: iload #6
    //   1981: if_icmpge -> 2118
    //   1984: aload #5
    //   1986: iload #7
    //   1988: aaload
    //   1989: astore #8
    //   1991: aload #8
    //   1993: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1996: pop
    //   1997: aload #8
    //   1999: invokevirtual getModifiers : ()I
    //   2002: invokestatic isStatic : (I)Z
    //   2005: ifeq -> 2104
    //   2008: aload #8
    //   2010: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2013: arraylength
    //   2014: iconst_2
    //   2015: if_icmpne -> 2104
    //   2018: goto -> 2025
    //   2021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2024: athrow
    //   2025: aload #8
    //   2027: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2030: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2033: if_acmpne -> 2104
    //   2036: goto -> 2043
    //   2039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2042: athrow
    //   2043: aload #8
    //   2045: iconst_1
    //   2046: invokevirtual setAccessible : (Z)V
    //   2049: aload #8
    //   2051: aconst_null
    //   2052: iconst_2
    //   2053: anewarray java/lang/Object
    //   2056: dup
    //   2057: iconst_0
    //   2058: aload_0
    //   2059: aastore
    //   2060: dup
    //   2061: iconst_1
    //   2062: aload_1
    //   2063: ifnonnull -> 2081
    //   2066: goto -> 2073
    //   2069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2072: athrow
    //   2073: aload_1
    //   2074: goto -> 2088
    //   2077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2080: athrow
    //   2081: aload_1
    //   2082: checkcast [B
    //   2085: invokevirtual clone : ()Ljava/lang/Object;
    //   2088: aastore
    //   2089: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2092: checkcast java/lang/Boolean
    //   2095: invokevirtual booleanValue : ()Z
    //   2098: istore #4
    //   2100: iload_2
    //   2101: ifne -> 2118
    //   2104: iinc #7, 1
    //   2107: iload_2
    //   2108: ifne -> 1977
    //   2111: goto -> 2118
    //   2114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2117: athrow
    //   2118: goto -> 2460
    //   2121: sipush #31820
    //   2124: sipush #19129
    //   2127: invokestatic a : (II)Ljava/lang/String;
    //   2130: iconst_1
    //   2131: ldc burp/Zlav
    //   2133: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2136: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2139: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2142: astore #5
    //   2144: aload #5
    //   2146: arraylength
    //   2147: istore #6
    //   2149: iconst_0
    //   2150: istore #7
    //   2152: iload #7
    //   2154: iload #6
    //   2156: if_icmpge -> 2294
    //   2159: aload #5
    //   2161: iload #7
    //   2163: aaload
    //   2164: astore #8
    //   2166: aload #8
    //   2168: invokevirtual getModifiers : ()I
    //   2171: invokestatic isStatic : (I)Z
    //   2174: ifne -> 2184
    //   2177: goto -> 2287
    //   2180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2183: athrow
    //   2184: aload #8
    //   2186: invokevirtual getType : ()Ljava/lang/Class;
    //   2189: astore #9
    //   2191: aload #9
    //   2193: ifnull -> 2274
    //   2196: aload #9
    //   2198: invokevirtual isPrimitive : ()Z
    //   2201: ifne -> 2274
    //   2204: goto -> 2211
    //   2207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2210: athrow
    //   2211: aload #9
    //   2213: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2216: ifnull -> 2274
    //   2219: goto -> 2226
    //   2222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2225: athrow
    //   2226: aload #9
    //   2228: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2231: invokevirtual getName : ()Ljava/lang/String;
    //   2234: ifnull -> 2274
    //   2237: goto -> 2244
    //   2240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2243: athrow
    //   2244: aload #9
    //   2246: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2249: invokevirtual getName : ()Ljava/lang/String;
    //   2252: sipush #31831
    //   2255: sipush #10975
    //   2258: invokestatic a : (II)Ljava/lang/String;
    //   2261: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2264: ifne -> 2274
    //   2267: goto -> 2274
    //   2270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2273: athrow
    //   2274: aload #8
    //   2276: iconst_1
    //   2277: invokevirtual setAccessible : (Z)V
    //   2280: aload #8
    //   2282: aconst_null
    //   2283: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2286: pop
    //   2287: iinc #7, 1
    //   2290: iload_2
    //   2291: ifne -> 2152
    //   2294: sipush #31834
    //   2297: sipush #-21395
    //   2300: invokestatic a : (II)Ljava/lang/String;
    //   2303: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2306: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2309: astore #5
    //   2311: aload #5
    //   2313: arraylength
    //   2314: istore #6
    //   2316: iconst_0
    //   2317: istore #7
    //   2319: iload #7
    //   2321: iload #6
    //   2323: if_icmpge -> 2460
    //   2326: aload #5
    //   2328: iload #7
    //   2330: aaload
    //   2331: astore #8
    //   2333: aload #8
    //   2335: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2338: pop
    //   2339: aload #8
    //   2341: invokevirtual getModifiers : ()I
    //   2344: invokestatic isStatic : (I)Z
    //   2347: ifeq -> 2446
    //   2350: aload #8
    //   2352: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2355: arraylength
    //   2356: iconst_2
    //   2357: if_icmpne -> 2446
    //   2360: goto -> 2367
    //   2363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2366: athrow
    //   2367: aload #8
    //   2369: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2372: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2375: if_acmpne -> 2446
    //   2378: goto -> 2385
    //   2381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2384: athrow
    //   2385: aload #8
    //   2387: iconst_1
    //   2388: invokevirtual setAccessible : (Z)V
    //   2391: aload #8
    //   2393: aconst_null
    //   2394: iconst_2
    //   2395: anewarray java/lang/Object
    //   2398: dup
    //   2399: iconst_0
    //   2400: aload_0
    //   2401: aastore
    //   2402: dup
    //   2403: iconst_1
    //   2404: aload_1
    //   2405: ifnonnull -> 2423
    //   2408: goto -> 2415
    //   2411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2414: athrow
    //   2415: aload_1
    //   2416: goto -> 2430
    //   2419: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2422: athrow
    //   2423: aload_1
    //   2424: checkcast [B
    //   2427: invokevirtual clone : ()Ljava/lang/Object;
    //   2430: aastore
    //   2431: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2434: checkcast java/lang/Boolean
    //   2437: invokevirtual booleanValue : ()Z
    //   2440: istore #4
    //   2442: iload_2
    //   2443: ifne -> 2460
    //   2446: iinc #7, 1
    //   2449: iload_2
    //   2450: ifne -> 2319
    //   2453: goto -> 2460
    //   2456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2459: athrow
    //   2460: iload #4
    //   2462: ifeq -> 2468
    //   2465: iload #4
    //   2467: ireturn
    //   2468: getstatic burp/Zrh_.ZU : Ljava/lang/String;
    //   2471: getstatic burp/Zbli.Zo : Ljava/lang/Object;
    //   2474: checkcast java/math/BigInteger
    //   2477: invokevirtual intValue : ()I
    //   2480: bipush #32
    //   2482: irem
    //   2483: invokestatic abs : (I)I
    //   2486: invokevirtual charAt : (I)C
    //   2489: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   2492: getstatic burp/Ztl6.ZQ : Ljava/lang/Object;
    //   2495: checkcast java/math/BigInteger
    //   2498: invokevirtual intValue : ()I
    //   2501: bipush #32
    //   2503: irem
    //   2504: invokestatic abs : (I)I
    //   2507: invokevirtual charAt : (I)C
    //   2510: if_icmple -> 2856
    //   2513: sipush #31839
    //   2516: sipush #16493
    //   2519: invokestatic a : (II)Ljava/lang/String;
    //   2522: iconst_1
    //   2523: ldc burp/Zxof
    //   2525: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2528: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2531: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2534: astore #5
    //   2536: aload #5
    //   2538: arraylength
    //   2539: istore #6
    //   2541: iconst_0
    //   2542: istore #7
    //   2544: iload #7
    //   2546: iload #6
    //   2548: if_icmpge -> 2686
    //   2551: aload #5
    //   2553: iload #7
    //   2555: aaload
    //   2556: astore #8
    //   2558: aload #8
    //   2560: invokevirtual getModifiers : ()I
    //   2563: invokestatic isStatic : (I)Z
    //   2566: ifne -> 2576
    //   2569: goto -> 2679
    //   2572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2575: athrow
    //   2576: aload #8
    //   2578: invokevirtual getType : ()Ljava/lang/Class;
    //   2581: astore #9
    //   2583: aload #9
    //   2585: ifnull -> 2666
    //   2588: aload #9
    //   2590: invokevirtual isPrimitive : ()Z
    //   2593: ifne -> 2666
    //   2596: goto -> 2603
    //   2599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2602: athrow
    //   2603: aload #9
    //   2605: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2608: ifnull -> 2666
    //   2611: goto -> 2618
    //   2614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2617: athrow
    //   2618: aload #9
    //   2620: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2623: invokevirtual getName : ()Ljava/lang/String;
    //   2626: ifnull -> 2666
    //   2629: goto -> 2636
    //   2632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2635: athrow
    //   2636: aload #9
    //   2638: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2641: invokevirtual getName : ()Ljava/lang/String;
    //   2644: sipush #31831
    //   2647: sipush #10975
    //   2650: invokestatic a : (II)Ljava/lang/String;
    //   2653: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2656: ifne -> 2666
    //   2659: goto -> 2666
    //   2662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2665: athrow
    //   2666: aload #8
    //   2668: iconst_1
    //   2669: invokevirtual setAccessible : (Z)V
    //   2672: aload #8
    //   2674: aconst_null
    //   2675: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2678: pop
    //   2679: iinc #7, 1
    //   2682: iload_2
    //   2683: ifne -> 2544
    //   2686: sipush #31812
    //   2689: sipush #-15131
    //   2692: invokestatic a : (II)Ljava/lang/String;
    //   2695: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2698: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2701: astore #5
    //   2703: aload #5
    //   2705: arraylength
    //   2706: istore #6
    //   2708: iconst_0
    //   2709: istore #7
    //   2711: iload #7
    //   2713: iload #6
    //   2715: if_icmpge -> 2852
    //   2718: aload #5
    //   2720: iload #7
    //   2722: aaload
    //   2723: astore #8
    //   2725: aload #8
    //   2727: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2730: pop
    //   2731: aload #8
    //   2733: invokevirtual getModifiers : ()I
    //   2736: invokestatic isStatic : (I)Z
    //   2739: ifeq -> 2838
    //   2742: aload #8
    //   2744: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2747: arraylength
    //   2748: iconst_2
    //   2749: if_icmpne -> 2838
    //   2752: goto -> 2759
    //   2755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2758: athrow
    //   2759: aload #8
    //   2761: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2764: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2767: if_acmpne -> 2838
    //   2770: goto -> 2777
    //   2773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2776: athrow
    //   2777: aload #8
    //   2779: iconst_1
    //   2780: invokevirtual setAccessible : (Z)V
    //   2783: aload #8
    //   2785: aconst_null
    //   2786: iconst_2
    //   2787: anewarray java/lang/Object
    //   2790: dup
    //   2791: iconst_0
    //   2792: aload_0
    //   2793: aastore
    //   2794: dup
    //   2795: iconst_1
    //   2796: aload_1
    //   2797: ifnonnull -> 2815
    //   2800: goto -> 2807
    //   2803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2806: athrow
    //   2807: aload_1
    //   2808: goto -> 2822
    //   2811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2814: athrow
    //   2815: aload_1
    //   2816: checkcast [B
    //   2819: invokevirtual clone : ()Ljava/lang/Object;
    //   2822: aastore
    //   2823: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2826: checkcast java/lang/Boolean
    //   2829: invokevirtual booleanValue : ()Z
    //   2832: istore #4
    //   2834: iload_2
    //   2835: ifne -> 2852
    //   2838: iinc #7, 1
    //   2841: iload_2
    //   2842: ifne -> 2711
    //   2845: goto -> 2852
    //   2848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2851: athrow
    //   2852: iload_2
    //   2853: ifne -> 3195
    //   2856: sipush #31827
    //   2859: sipush #-8827
    //   2862: invokestatic a : (II)Ljava/lang/String;
    //   2865: iconst_1
    //   2866: ldc burp/Ze57
    //   2868: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2871: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2874: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2877: astore #5
    //   2879: aload #5
    //   2881: arraylength
    //   2882: istore #6
    //   2884: iconst_0
    //   2885: istore #7
    //   2887: iload #7
    //   2889: iload #6
    //   2891: if_icmpge -> 3029
    //   2894: aload #5
    //   2896: iload #7
    //   2898: aaload
    //   2899: astore #8
    //   2901: aload #8
    //   2903: invokevirtual getModifiers : ()I
    //   2906: invokestatic isStatic : (I)Z
    //   2909: ifne -> 2919
    //   2912: goto -> 3022
    //   2915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2918: athrow
    //   2919: aload #8
    //   2921: invokevirtual getType : ()Ljava/lang/Class;
    //   2924: astore #9
    //   2926: aload #9
    //   2928: ifnull -> 3009
    //   2931: aload #9
    //   2933: invokevirtual isPrimitive : ()Z
    //   2936: ifne -> 3009
    //   2939: goto -> 2946
    //   2942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2945: athrow
    //   2946: aload #9
    //   2948: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2951: ifnull -> 3009
    //   2954: goto -> 2961
    //   2957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2960: athrow
    //   2961: aload #9
    //   2963: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2966: invokevirtual getName : ()Ljava/lang/String;
    //   2969: ifnull -> 3009
    //   2972: goto -> 2979
    //   2975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2978: athrow
    //   2979: aload #9
    //   2981: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2984: invokevirtual getName : ()Ljava/lang/String;
    //   2987: sipush #31831
    //   2990: sipush #10975
    //   2993: invokestatic a : (II)Ljava/lang/String;
    //   2996: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2999: ifne -> 3009
    //   3002: goto -> 3009
    //   3005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3008: athrow
    //   3009: aload #8
    //   3011: iconst_1
    //   3012: invokevirtual setAccessible : (Z)V
    //   3015: aload #8
    //   3017: aconst_null
    //   3018: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3021: pop
    //   3022: iinc #7, 1
    //   3025: iload_2
    //   3026: ifne -> 2887
    //   3029: sipush #31810
    //   3032: sipush #-288
    //   3035: invokestatic a : (II)Ljava/lang/String;
    //   3038: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3041: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3044: astore #5
    //   3046: aload #5
    //   3048: arraylength
    //   3049: istore #6
    //   3051: iconst_0
    //   3052: istore #7
    //   3054: iload #7
    //   3056: iload #6
    //   3058: if_icmpge -> 3195
    //   3061: aload #5
    //   3063: iload #7
    //   3065: aaload
    //   3066: astore #8
    //   3068: aload #8
    //   3070: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3073: pop
    //   3074: aload #8
    //   3076: invokevirtual getModifiers : ()I
    //   3079: invokestatic isStatic : (I)Z
    //   3082: ifeq -> 3181
    //   3085: aload #8
    //   3087: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3090: arraylength
    //   3091: iconst_2
    //   3092: if_icmpne -> 3181
    //   3095: goto -> 3102
    //   3098: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3101: athrow
    //   3102: aload #8
    //   3104: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3107: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3110: if_acmpne -> 3181
    //   3113: goto -> 3120
    //   3116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3119: athrow
    //   3120: aload #8
    //   3122: iconst_1
    //   3123: invokevirtual setAccessible : (Z)V
    //   3126: aload #8
    //   3128: aconst_null
    //   3129: iconst_2
    //   3130: anewarray java/lang/Object
    //   3133: dup
    //   3134: iconst_0
    //   3135: aload_0
    //   3136: aastore
    //   3137: dup
    //   3138: iconst_1
    //   3139: aload_1
    //   3140: ifnonnull -> 3158
    //   3143: goto -> 3150
    //   3146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3149: athrow
    //   3150: aload_1
    //   3151: goto -> 3165
    //   3154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3157: athrow
    //   3158: aload_1
    //   3159: checkcast [B
    //   3162: invokevirtual clone : ()Ljava/lang/Object;
    //   3165: aastore
    //   3166: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3169: checkcast java/lang/Boolean
    //   3172: invokevirtual booleanValue : ()Z
    //   3175: istore #4
    //   3177: iload_2
    //   3178: ifne -> 3195
    //   3181: iinc #7, 1
    //   3184: iload_2
    //   3185: ifne -> 3054
    //   3188: goto -> 3195
    //   3191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3194: athrow
    //   3195: iload #4
    //   3197: ifeq -> 3203
    //   3200: iload #4
    //   3202: ireturn
    //   3203: getstatic burp/Ze4g.Zk : Ljava/lang/String;
    //   3206: getstatic burp/Zlo0.Zu : Ljava/lang/Object;
    //   3209: checkcast java/math/BigInteger
    //   3212: invokevirtual intValue : ()I
    //   3215: bipush #32
    //   3217: irem
    //   3218: invokestatic abs : (I)I
    //   3221: invokevirtual charAt : (I)C
    //   3224: getstatic burp/Zr36.Ze : Ljava/lang/String;
    //   3227: getstatic burp/Zr36.Za : Ljava/lang/Object;
    //   3230: checkcast java/math/BigInteger
    //   3233: invokevirtual intValue : ()I
    //   3236: bipush #32
    //   3238: irem
    //   3239: invokestatic abs : (I)I
    //   3242: invokevirtual charAt : (I)C
    //   3245: if_icmple -> 3591
    //   3248: sipush #31814
    //   3251: sipush #-15716
    //   3254: invokestatic a : (II)Ljava/lang/String;
    //   3257: iconst_1
    //   3258: ldc burp/Zgr1
    //   3260: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3263: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3266: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3269: astore #5
    //   3271: aload #5
    //   3273: arraylength
    //   3274: istore #6
    //   3276: iconst_0
    //   3277: istore #7
    //   3279: iload #7
    //   3281: iload #6
    //   3283: if_icmpge -> 3421
    //   3286: aload #5
    //   3288: iload #7
    //   3290: aaload
    //   3291: astore #8
    //   3293: aload #8
    //   3295: invokevirtual getModifiers : ()I
    //   3298: invokestatic isStatic : (I)Z
    //   3301: ifne -> 3311
    //   3304: goto -> 3414
    //   3307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3310: athrow
    //   3311: aload #8
    //   3313: invokevirtual getType : ()Ljava/lang/Class;
    //   3316: astore #9
    //   3318: aload #9
    //   3320: ifnull -> 3401
    //   3323: aload #9
    //   3325: invokevirtual isPrimitive : ()Z
    //   3328: ifne -> 3401
    //   3331: goto -> 3338
    //   3334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3337: athrow
    //   3338: aload #9
    //   3340: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3343: ifnull -> 3401
    //   3346: goto -> 3353
    //   3349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3352: athrow
    //   3353: aload #9
    //   3355: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3358: invokevirtual getName : ()Ljava/lang/String;
    //   3361: ifnull -> 3401
    //   3364: goto -> 3371
    //   3367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3370: athrow
    //   3371: aload #9
    //   3373: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3376: invokevirtual getName : ()Ljava/lang/String;
    //   3379: sipush #31831
    //   3382: sipush #10975
    //   3385: invokestatic a : (II)Ljava/lang/String;
    //   3388: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3391: ifne -> 3401
    //   3394: goto -> 3401
    //   3397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3400: athrow
    //   3401: aload #8
    //   3403: iconst_1
    //   3404: invokevirtual setAccessible : (Z)V
    //   3407: aload #8
    //   3409: aconst_null
    //   3410: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3413: pop
    //   3414: iinc #7, 1
    //   3417: iload_2
    //   3418: ifne -> 3279
    //   3421: sipush #31830
    //   3424: sipush #-24556
    //   3427: invokestatic a : (II)Ljava/lang/String;
    //   3430: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3433: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3436: astore #5
    //   3438: aload #5
    //   3440: arraylength
    //   3441: istore #6
    //   3443: iconst_0
    //   3444: istore #7
    //   3446: iload #7
    //   3448: iload #6
    //   3450: if_icmpge -> 3587
    //   3453: aload #5
    //   3455: iload #7
    //   3457: aaload
    //   3458: astore #8
    //   3460: aload #8
    //   3462: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3465: pop
    //   3466: aload #8
    //   3468: invokevirtual getModifiers : ()I
    //   3471: invokestatic isStatic : (I)Z
    //   3474: ifeq -> 3573
    //   3477: aload #8
    //   3479: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3482: arraylength
    //   3483: iconst_2
    //   3484: if_icmpne -> 3573
    //   3487: goto -> 3494
    //   3490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3493: athrow
    //   3494: aload #8
    //   3496: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3499: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3502: if_acmpne -> 3573
    //   3505: goto -> 3512
    //   3508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3511: athrow
    //   3512: aload #8
    //   3514: iconst_1
    //   3515: invokevirtual setAccessible : (Z)V
    //   3518: aload #8
    //   3520: aconst_null
    //   3521: iconst_2
    //   3522: anewarray java/lang/Object
    //   3525: dup
    //   3526: iconst_0
    //   3527: aload_0
    //   3528: aastore
    //   3529: dup
    //   3530: iconst_1
    //   3531: aload_1
    //   3532: ifnonnull -> 3550
    //   3535: goto -> 3542
    //   3538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3541: athrow
    //   3542: aload_1
    //   3543: goto -> 3557
    //   3546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3549: athrow
    //   3550: aload_1
    //   3551: checkcast [B
    //   3554: invokevirtual clone : ()Ljava/lang/Object;
    //   3557: aastore
    //   3558: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3561: checkcast java/lang/Boolean
    //   3564: invokevirtual booleanValue : ()Z
    //   3567: istore #4
    //   3569: iload_2
    //   3570: ifne -> 3587
    //   3573: iinc #7, 1
    //   3576: iload_2
    //   3577: ifne -> 3446
    //   3580: goto -> 3587
    //   3583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3586: athrow
    //   3587: iload_2
    //   3588: ifne -> 3930
    //   3591: sipush #31835
    //   3594: sipush #-16965
    //   3597: invokestatic a : (II)Ljava/lang/String;
    //   3600: iconst_1
    //   3601: ldc burp/Ze13
    //   3603: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3606: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3609: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3612: astore #5
    //   3614: aload #5
    //   3616: arraylength
    //   3617: istore #6
    //   3619: iconst_0
    //   3620: istore #7
    //   3622: iload #7
    //   3624: iload #6
    //   3626: if_icmpge -> 3764
    //   3629: aload #5
    //   3631: iload #7
    //   3633: aaload
    //   3634: astore #8
    //   3636: aload #8
    //   3638: invokevirtual getModifiers : ()I
    //   3641: invokestatic isStatic : (I)Z
    //   3644: ifne -> 3654
    //   3647: goto -> 3757
    //   3650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3653: athrow
    //   3654: aload #8
    //   3656: invokevirtual getType : ()Ljava/lang/Class;
    //   3659: astore #9
    //   3661: aload #9
    //   3663: ifnull -> 3744
    //   3666: aload #9
    //   3668: invokevirtual isPrimitive : ()Z
    //   3671: ifne -> 3744
    //   3674: goto -> 3681
    //   3677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3680: athrow
    //   3681: aload #9
    //   3683: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3686: ifnull -> 3744
    //   3689: goto -> 3696
    //   3692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3695: athrow
    //   3696: aload #9
    //   3698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3701: invokevirtual getName : ()Ljava/lang/String;
    //   3704: ifnull -> 3744
    //   3707: goto -> 3714
    //   3710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3713: athrow
    //   3714: aload #9
    //   3716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3719: invokevirtual getName : ()Ljava/lang/String;
    //   3722: sipush #31831
    //   3725: sipush #10975
    //   3728: invokestatic a : (II)Ljava/lang/String;
    //   3731: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3734: ifne -> 3744
    //   3737: goto -> 3744
    //   3740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3743: athrow
    //   3744: aload #8
    //   3746: iconst_1
    //   3747: invokevirtual setAccessible : (Z)V
    //   3750: aload #8
    //   3752: aconst_null
    //   3753: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3756: pop
    //   3757: iinc #7, 1
    //   3760: iload_2
    //   3761: ifne -> 3622
    //   3764: sipush #31828
    //   3767: sipush #-8785
    //   3770: invokestatic a : (II)Ljava/lang/String;
    //   3773: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3776: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3779: astore #5
    //   3781: aload #5
    //   3783: arraylength
    //   3784: istore #6
    //   3786: iconst_0
    //   3787: istore #7
    //   3789: iload #7
    //   3791: iload #6
    //   3793: if_icmpge -> 3930
    //   3796: aload #5
    //   3798: iload #7
    //   3800: aaload
    //   3801: astore #8
    //   3803: aload #8
    //   3805: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3808: pop
    //   3809: aload #8
    //   3811: invokevirtual getModifiers : ()I
    //   3814: invokestatic isStatic : (I)Z
    //   3817: ifeq -> 3916
    //   3820: aload #8
    //   3822: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3825: arraylength
    //   3826: iconst_2
    //   3827: if_icmpne -> 3916
    //   3830: goto -> 3837
    //   3833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3836: athrow
    //   3837: aload #8
    //   3839: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3842: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3845: if_acmpne -> 3916
    //   3848: goto -> 3855
    //   3851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3854: athrow
    //   3855: aload #8
    //   3857: iconst_1
    //   3858: invokevirtual setAccessible : (Z)V
    //   3861: aload #8
    //   3863: aconst_null
    //   3864: iconst_2
    //   3865: anewarray java/lang/Object
    //   3868: dup
    //   3869: iconst_0
    //   3870: aload_0
    //   3871: aastore
    //   3872: dup
    //   3873: iconst_1
    //   3874: aload_1
    //   3875: ifnonnull -> 3893
    //   3878: goto -> 3885
    //   3881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3884: athrow
    //   3885: aload_1
    //   3886: goto -> 3900
    //   3889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3892: athrow
    //   3893: aload_1
    //   3894: checkcast [B
    //   3897: invokevirtual clone : ()Ljava/lang/Object;
    //   3900: aastore
    //   3901: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3904: checkcast java/lang/Boolean
    //   3907: invokevirtual booleanValue : ()Z
    //   3910: istore #4
    //   3912: iload_2
    //   3913: ifne -> 3930
    //   3916: iinc #7, 1
    //   3919: iload_2
    //   3920: ifne -> 3789
    //   3923: goto -> 3930
    //   3926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3929: athrow
    //   3930: iload #4
    //   3932: ifeq -> 3938
    //   3935: iload #4
    //   3937: ireturn
    //   3938: getstatic burp/Zlwj.ZQ : Ljava/lang/String;
    //   3941: getstatic burp/Zbx5.ZL : Ljava/lang/Object;
    //   3944: checkcast java/math/BigInteger
    //   3947: invokevirtual intValue : ()I
    //   3950: bipush #32
    //   3952: irem
    //   3953: invokestatic abs : (I)I
    //   3956: invokevirtual charAt : (I)C
    //   3959: getstatic burp/Zt6z.ZL : Ljava/lang/String;
    //   3962: getstatic burp/Zlxr.Zz : Ljava/lang/Object;
    //   3965: checkcast java/math/BigInteger
    //   3968: invokevirtual intValue : ()I
    //   3971: bipush #32
    //   3973: irem
    //   3974: invokestatic abs : (I)I
    //   3977: invokevirtual charAt : (I)C
    //   3980: if_icmpgt -> 4326
    //   3983: sipush #31825
    //   3986: sipush #5184
    //   3989: invokestatic a : (II)Ljava/lang/String;
    //   3992: iconst_1
    //   3993: ldc burp/Zkby
    //   3995: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3998: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4001: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4004: astore #5
    //   4006: aload #5
    //   4008: arraylength
    //   4009: istore #6
    //   4011: iconst_0
    //   4012: istore #7
    //   4014: iload #7
    //   4016: iload #6
    //   4018: if_icmpge -> 4156
    //   4021: aload #5
    //   4023: iload #7
    //   4025: aaload
    //   4026: astore #8
    //   4028: aload #8
    //   4030: invokevirtual getModifiers : ()I
    //   4033: invokestatic isStatic : (I)Z
    //   4036: ifne -> 4046
    //   4039: goto -> 4149
    //   4042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4045: athrow
    //   4046: aload #8
    //   4048: invokevirtual getType : ()Ljava/lang/Class;
    //   4051: astore #9
    //   4053: aload #9
    //   4055: ifnull -> 4136
    //   4058: aload #9
    //   4060: invokevirtual isPrimitive : ()Z
    //   4063: ifne -> 4136
    //   4066: goto -> 4073
    //   4069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4072: athrow
    //   4073: aload #9
    //   4075: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4078: ifnull -> 4136
    //   4081: goto -> 4088
    //   4084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4087: athrow
    //   4088: aload #9
    //   4090: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4093: invokevirtual getName : ()Ljava/lang/String;
    //   4096: ifnull -> 4136
    //   4099: goto -> 4106
    //   4102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4105: athrow
    //   4106: aload #9
    //   4108: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4111: invokevirtual getName : ()Ljava/lang/String;
    //   4114: sipush #31831
    //   4117: sipush #10975
    //   4120: invokestatic a : (II)Ljava/lang/String;
    //   4123: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4126: ifne -> 4136
    //   4129: goto -> 4136
    //   4132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4135: athrow
    //   4136: aload #8
    //   4138: iconst_1
    //   4139: invokevirtual setAccessible : (Z)V
    //   4142: aload #8
    //   4144: aconst_null
    //   4145: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4148: pop
    //   4149: iinc #7, 1
    //   4152: iload_2
    //   4153: ifne -> 4014
    //   4156: sipush #31836
    //   4159: sipush #-17372
    //   4162: invokestatic a : (II)Ljava/lang/String;
    //   4165: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4168: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4171: astore #5
    //   4173: aload #5
    //   4175: arraylength
    //   4176: istore #6
    //   4178: iconst_0
    //   4179: istore #7
    //   4181: iload #7
    //   4183: iload #6
    //   4185: if_icmpge -> 4322
    //   4188: aload #5
    //   4190: iload #7
    //   4192: aaload
    //   4193: astore #8
    //   4195: aload #8
    //   4197: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4200: pop
    //   4201: aload #8
    //   4203: invokevirtual getModifiers : ()I
    //   4206: invokestatic isStatic : (I)Z
    //   4209: ifeq -> 4308
    //   4212: aload #8
    //   4214: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4217: arraylength
    //   4218: iconst_2
    //   4219: if_icmpne -> 4308
    //   4222: goto -> 4229
    //   4225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4228: athrow
    //   4229: aload #8
    //   4231: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4234: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4237: if_acmpne -> 4308
    //   4240: goto -> 4247
    //   4243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4246: athrow
    //   4247: aload #8
    //   4249: iconst_1
    //   4250: invokevirtual setAccessible : (Z)V
    //   4253: aload #8
    //   4255: aconst_null
    //   4256: iconst_2
    //   4257: anewarray java/lang/Object
    //   4260: dup
    //   4261: iconst_0
    //   4262: aload_0
    //   4263: aastore
    //   4264: dup
    //   4265: iconst_1
    //   4266: aload_1
    //   4267: ifnonnull -> 4285
    //   4270: goto -> 4277
    //   4273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4276: athrow
    //   4277: aload_1
    //   4278: goto -> 4292
    //   4281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4284: athrow
    //   4285: aload_1
    //   4286: checkcast [B
    //   4289: invokevirtual clone : ()Ljava/lang/Object;
    //   4292: aastore
    //   4293: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4296: checkcast java/lang/Boolean
    //   4299: invokevirtual booleanValue : ()Z
    //   4302: istore #4
    //   4304: iload_2
    //   4305: ifne -> 4322
    //   4308: iinc #7, 1
    //   4311: iload_2
    //   4312: ifne -> 4181
    //   4315: goto -> 4322
    //   4318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4321: athrow
    //   4322: iload_2
    //   4323: ifne -> 4665
    //   4326: sipush #31813
    //   4329: sipush #-27874
    //   4332: invokestatic a : (II)Ljava/lang/String;
    //   4335: iconst_1
    //   4336: ldc burp/Zr0u
    //   4338: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4341: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4344: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4347: astore #5
    //   4349: aload #5
    //   4351: arraylength
    //   4352: istore #6
    //   4354: iconst_0
    //   4355: istore #7
    //   4357: iload #7
    //   4359: iload #6
    //   4361: if_icmpge -> 4499
    //   4364: aload #5
    //   4366: iload #7
    //   4368: aaload
    //   4369: astore #8
    //   4371: aload #8
    //   4373: invokevirtual getModifiers : ()I
    //   4376: invokestatic isStatic : (I)Z
    //   4379: ifne -> 4389
    //   4382: goto -> 4492
    //   4385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4388: athrow
    //   4389: aload #8
    //   4391: invokevirtual getType : ()Ljava/lang/Class;
    //   4394: astore #9
    //   4396: aload #9
    //   4398: ifnull -> 4479
    //   4401: aload #9
    //   4403: invokevirtual isPrimitive : ()Z
    //   4406: ifne -> 4479
    //   4409: goto -> 4416
    //   4412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4415: athrow
    //   4416: aload #9
    //   4418: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4421: ifnull -> 4479
    //   4424: goto -> 4431
    //   4427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4430: athrow
    //   4431: aload #9
    //   4433: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4436: invokevirtual getName : ()Ljava/lang/String;
    //   4439: ifnull -> 4479
    //   4442: goto -> 4449
    //   4445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4448: athrow
    //   4449: aload #9
    //   4451: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4454: invokevirtual getName : ()Ljava/lang/String;
    //   4457: sipush #31831
    //   4460: sipush #10975
    //   4463: invokestatic a : (II)Ljava/lang/String;
    //   4466: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4469: ifne -> 4479
    //   4472: goto -> 4479
    //   4475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4478: athrow
    //   4479: aload #8
    //   4481: iconst_1
    //   4482: invokevirtual setAccessible : (Z)V
    //   4485: aload #8
    //   4487: aconst_null
    //   4488: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4491: pop
    //   4492: iinc #7, 1
    //   4495: iload_2
    //   4496: ifne -> 4357
    //   4499: sipush #31838
    //   4502: sipush #-20404
    //   4505: invokestatic a : (II)Ljava/lang/String;
    //   4508: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4511: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4514: astore #5
    //   4516: aload #5
    //   4518: arraylength
    //   4519: istore #6
    //   4521: iconst_0
    //   4522: istore #7
    //   4524: iload #7
    //   4526: iload #6
    //   4528: if_icmpge -> 4665
    //   4531: aload #5
    //   4533: iload #7
    //   4535: aaload
    //   4536: astore #8
    //   4538: aload #8
    //   4540: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4543: pop
    //   4544: aload #8
    //   4546: invokevirtual getModifiers : ()I
    //   4549: invokestatic isStatic : (I)Z
    //   4552: ifeq -> 4651
    //   4555: aload #8
    //   4557: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4560: arraylength
    //   4561: iconst_2
    //   4562: if_icmpne -> 4651
    //   4565: goto -> 4572
    //   4568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4571: athrow
    //   4572: aload #8
    //   4574: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4577: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4580: if_acmpne -> 4651
    //   4583: goto -> 4590
    //   4586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4589: athrow
    //   4590: aload #8
    //   4592: iconst_1
    //   4593: invokevirtual setAccessible : (Z)V
    //   4596: aload #8
    //   4598: aconst_null
    //   4599: iconst_2
    //   4600: anewarray java/lang/Object
    //   4603: dup
    //   4604: iconst_0
    //   4605: aload_0
    //   4606: aastore
    //   4607: dup
    //   4608: iconst_1
    //   4609: aload_1
    //   4610: ifnonnull -> 4628
    //   4613: goto -> 4620
    //   4616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4619: athrow
    //   4620: aload_1
    //   4621: goto -> 4635
    //   4624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4627: athrow
    //   4628: aload_1
    //   4629: checkcast [B
    //   4632: invokevirtual clone : ()Ljava/lang/Object;
    //   4635: aastore
    //   4636: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4639: checkcast java/lang/Boolean
    //   4642: invokevirtual booleanValue : ()Z
    //   4645: istore #4
    //   4647: iload_2
    //   4648: ifne -> 4665
    //   4651: iinc #7, 1
    //   4654: iload_2
    //   4655: ifne -> 4524
    //   4658: goto -> 4665
    //   4661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4664: athrow
    //   4665: iload #4
    //   4667: ireturn
    //   4668: astore_3
    //   4669: new java/lang/Exception
    //   4672: dup
    //   4673: aload_3
    //   4674: invokevirtual getMessage : ()Ljava/lang/String;
    //   4677: invokespecial <init> : (Ljava/lang/String;)V
    //   4680: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2467	4668	java/lang/Throwable
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
    //   1441	1455	1455	java/lang/Throwable
    //   1466	1479	1482	java/lang/Throwable
    //   1471	1494	1497	java/lang/Throwable
    //   1486	1512	1515	java/lang/Throwable
    //   1501	1542	1545	java/lang/Throwable
    //   1608	1635	1638	java/lang/Throwable
    //   1625	1656	1659	java/lang/Throwable
    //   1642	1686	1689	java/lang/Throwable
    //   1663	1697	1697	java/lang/Throwable
    //   1708	1724	1727	java/lang/Throwable
    //   1824	1838	1838	java/lang/Throwable
    //   1849	1862	1865	java/lang/Throwable
    //   1854	1877	1880	java/lang/Throwable
    //   1869	1895	1898	java/lang/Throwable
    //   1884	1925	1928	java/lang/Throwable
    //   1991	2018	2021	java/lang/Throwable
    //   2008	2036	2039	java/lang/Throwable
    //   2025	2066	2069	java/lang/Throwable
    //   2043	2077	2077	java/lang/Throwable
    //   2100	2111	2114	java/lang/Throwable
    //   2166	2180	2180	java/lang/Throwable
    //   2191	2204	2207	java/lang/Throwable
    //   2196	2219	2222	java/lang/Throwable
    //   2211	2237	2240	java/lang/Throwable
    //   2226	2267	2270	java/lang/Throwable
    //   2333	2360	2363	java/lang/Throwable
    //   2350	2378	2381	java/lang/Throwable
    //   2367	2408	2411	java/lang/Throwable
    //   2385	2419	2419	java/lang/Throwable
    //   2442	2453	2456	java/lang/Throwable
    //   2468	3202	4668	java/lang/Throwable
    //   2558	2572	2572	java/lang/Throwable
    //   2583	2596	2599	java/lang/Throwable
    //   2588	2611	2614	java/lang/Throwable
    //   2603	2629	2632	java/lang/Throwable
    //   2618	2659	2662	java/lang/Throwable
    //   2725	2752	2755	java/lang/Throwable
    //   2742	2770	2773	java/lang/Throwable
    //   2759	2800	2803	java/lang/Throwable
    //   2777	2811	2811	java/lang/Throwable
    //   2834	2845	2848	java/lang/Throwable
    //   2901	2915	2915	java/lang/Throwable
    //   2926	2939	2942	java/lang/Throwable
    //   2931	2954	2957	java/lang/Throwable
    //   2946	2972	2975	java/lang/Throwable
    //   2961	3002	3005	java/lang/Throwable
    //   3068	3095	3098	java/lang/Throwable
    //   3085	3113	3116	java/lang/Throwable
    //   3102	3143	3146	java/lang/Throwable
    //   3120	3154	3154	java/lang/Throwable
    //   3177	3188	3191	java/lang/Throwable
    //   3203	3937	4668	java/lang/Throwable
    //   3293	3307	3307	java/lang/Throwable
    //   3318	3331	3334	java/lang/Throwable
    //   3323	3346	3349	java/lang/Throwable
    //   3338	3364	3367	java/lang/Throwable
    //   3353	3394	3397	java/lang/Throwable
    //   3460	3487	3490	java/lang/Throwable
    //   3477	3505	3508	java/lang/Throwable
    //   3494	3535	3538	java/lang/Throwable
    //   3512	3546	3546	java/lang/Throwable
    //   3569	3580	3583	java/lang/Throwable
    //   3636	3650	3650	java/lang/Throwable
    //   3661	3674	3677	java/lang/Throwable
    //   3666	3689	3692	java/lang/Throwable
    //   3681	3707	3710	java/lang/Throwable
    //   3696	3737	3740	java/lang/Throwable
    //   3803	3830	3833	java/lang/Throwable
    //   3820	3848	3851	java/lang/Throwable
    //   3837	3878	3881	java/lang/Throwable
    //   3855	3889	3889	java/lang/Throwable
    //   3912	3923	3926	java/lang/Throwable
    //   3938	4667	4668	java/lang/Throwable
    //   4028	4042	4042	java/lang/Throwable
    //   4053	4066	4069	java/lang/Throwable
    //   4058	4081	4084	java/lang/Throwable
    //   4073	4099	4102	java/lang/Throwable
    //   4088	4129	4132	java/lang/Throwable
    //   4195	4222	4225	java/lang/Throwable
    //   4212	4240	4243	java/lang/Throwable
    //   4229	4270	4273	java/lang/Throwable
    //   4247	4281	4281	java/lang/Throwable
    //   4304	4315	4318	java/lang/Throwable
    //   4371	4385	4385	java/lang/Throwable
    //   4396	4409	4412	java/lang/Throwable
    //   4401	4424	4427	java/lang/Throwable
    //   4416	4442	4445	java/lang/Throwable
    //   4431	4472	4475	java/lang/Throwable
    //   4538	4565	4568	java/lang/Throwable
    //   4555	4583	4586	java/lang/Throwable
    //   4572	4613	4616	java/lang/Throwable
    //   4590	4624	4624	java/lang/Throwable
    //   4647	4658	4661	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Òôýe¾Î\\tÙùÉç*P\\tÅ4(þþçÏÂu'J\\t¬Y¾[KET\\t/ëKñUæ\\tÿQýÑ=Í\\t\ *#MG\\tB¯c[à,¢\\tcG-d^´Ì«\\t?ÖÌtu£f\\t»ÙÏÀÉL_M¼¥ôä*3®°Ù§Ãµbï'ÏýÜ« ÐÅì$¶RøÑfô½þÄNÑÜtn®jÜ?ª}òÆ÷|«ÀWöÖ#]\\tiè+5\\bOGÏÔa\\túýtÙz*9\\t§Åßw9Ëvñ\\tRàa² ­3£·\\tíÂö^%ó´@\\t©AOÓÉ NÊYr Þ=]Û;pîàRÉ¡eÅ[\\n¦±kBZ8ÓÇE+ôëï]\\tôÓµÔ:aw$Í'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_5
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
    //   64: goto -> 23
    //   67: ldc 'kÏ*¼+h+Ycî\\r0ýû)ðeÃdRóa49hO}uÕ_Ô\\tÕCR[ÊË'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #34
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
    //   128: putstatic burp/Zr02.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr02.b : [Ljava/lang/String;
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
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #14
    //   219: goto -> 244
    //   222: bipush #81
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #46
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
    //   311: bipush #118
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #47
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #20
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-56
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-103
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #118
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #113
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-33
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #55
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-3
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #38
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-59
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #64
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #50
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-69
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-85
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-108
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #68
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-85
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-70
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-79
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-79
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #76
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-104
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #124
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #9
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #17
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-91
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #41
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-80
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #36
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-54
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zr02.ZB : Ljava/lang/Object;
    //   501: sipush #31809
    //   504: sipush #-14060
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zr02.ZG : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7C54) & 0xFFFF;
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
      char c = 'ã';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr02.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */