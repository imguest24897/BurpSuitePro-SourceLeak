package burp;

import java.math.BigInteger;

class Zgp_ extends ClassLoader {
  static String Zn;
  
  static Object Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZG(Object paramObject) {
    Zmv9.Zm = a(10044, 5085);
    Zmv9.Zw = new BigInteger(a(10034, -13063));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zf.Zd.charAt(Math.abs(((BigInteger)Zmgl.ZI).intValue() % 32)) <= Zg68.Zg.charAt(Math.abs(((BigInteger)Zmy4.ZB).intValue() % 32))) {
          try {
            Zxc.ZS(Class.forName(a(10046, -5161)));
            if (!bool)
              Zxjm.Zj(Class.forName(a(10042, -7835))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxjm.Zj(Class.forName(a(10042, -7835)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zj(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgly.ZN : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zsmn.Zq : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zex0.Ze : Ljava/lang/Object;
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
    //   185: getstatic burp/Zzmw.Zd : Ljava/lang/String;
    //   188: getstatic burp/Zmha.ZM : Ljava/lang/Object;
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
    //   222: getstatic burp/Zljx.ZD : Ljava/lang/String;
    //   225: getstatic burp/Zm1l.Za : Ljava/lang/Object;
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
    //   259: getstatic burp/Zmvk.Z_ : Ljava/lang/String;
    //   262: getstatic burp/Ztt0.ZF : Ljava/lang/Object;
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
    //   296: getstatic burp/Zzy5.ZD : Ljava/lang/String;
    //   299: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
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
    //   333: getstatic burp/Zsbd.ZA : Ljava/lang/String;
    //   336: getstatic burp/Zegv.ZL : Ljava/lang/Object;
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
    //   370: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   373: getstatic burp/Zgq_.ZM : Ljava/lang/Object;
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
    //   407: getstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   410: getstatic burp/Ze5f.Zh : Ljava/lang/Object;
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
    //   444: getstatic burp/Zr3j.Zj : Ljava/lang/String;
    //   447: getstatic burp/Zgwu.ZD : Ljava/lang/Object;
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
    //   481: getstatic burp/Zgl2.Zw : Ljava/lang/String;
    //   484: getstatic burp/Zl3j.ZY : Ljava/lang/Object;
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
    //   518: getstatic burp/Zbsc.Zp : Ljava/lang/String;
    //   521: getstatic burp/Zlo2.ZM : Ljava/lang/Object;
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
    //   555: getstatic burp/Zme.Zp : Ljava/lang/String;
    //   558: getstatic burp/Zg_6.ZU : Ljava/lang/Object;
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
    //   592: getstatic burp/Zly0.ZE : Ljava/lang/String;
    //   595: getstatic burp/Zz16.ZK : Ljava/lang/Object;
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
    //   629: getstatic burp/Zsuw.ZK : Ljava/lang/String;
    //   632: getstatic burp/Zer1.ZL : Ljava/lang/Object;
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
    //   666: getstatic burp/Zzco.Zu : Ljava/lang/String;
    //   669: getstatic burp/Zmh5.ZN : Ljava/lang/Object;
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
    //   703: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   706: getstatic burp/Zge1.ZK : Ljava/lang/Object;
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
    //   740: getstatic burp/Zty4.Zu : Ljava/lang/String;
    //   743: getstatic burp/Zk88.ZX : Ljava/lang/Object;
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
    //   777: getstatic burp/Zer.Zp : Ljava/lang/String;
    //   780: getstatic burp/Zb8x.Zz : Ljava/lang/Object;
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
    //   814: getstatic burp/Zrye.Za : Ljava/lang/String;
    //   817: getstatic burp/Zm14.ZZ : Ljava/lang/Object;
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
    //   851: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   854: getstatic burp/Zl_k.ZH : Ljava/lang/Object;
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
    //   888: getstatic burp/Zltp.ZY : Ljava/lang/String;
    //   891: getstatic burp/Zzox.Zq : Ljava/lang/Object;
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
    //   925: getstatic burp/Zb6b.Zn : Ljava/lang/String;
    //   928: getstatic burp/Zedz.Za : Ljava/lang/Object;
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
    //   962: getstatic burp/Zeno.ZL : Ljava/lang/String;
    //   965: getstatic burp/Zlb6.Zz : Ljava/lang/Object;
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
    //   999: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   1002: getstatic burp/Zeuz.Zp : Ljava/lang/Object;
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
    //   1036: getstatic burp/Zs9k.Zx : Ljava/lang/String;
    //   1039: getstatic burp/Ztt0.ZF : Ljava/lang/Object;
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
    //   1073: getstatic burp/Zrc0.ZL : Ljava/lang/String;
    //   1076: getstatic burp/Zry9.Zw : Ljava/lang/Object;
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
    //   1110: getstatic burp/Zmf6.Zn : Ljava/lang/String;
    //   1113: getstatic burp/Zmsl.ZB : Ljava/lang/Object;
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
    //   1147: getstatic burp/Zm1l.Zp : Ljava/lang/String;
    //   1150: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
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
    //   1184: getstatic burp/Zxof.Zs : Ljava/lang/String;
    //   1187: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
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
    //   1221: getstatic burp/Zgwh.Zq : Ljava/lang/String;
    //   1224: getstatic burp/Ztdt.ZN : Ljava/lang/Object;
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
    //   1258: getstatic burp/Zexn.ZE : Ljava/lang/String;
    //   1261: getstatic burp/Zxjw.ZU : Ljava/lang/Object;
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
    //   1295: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   1298: getstatic burp/Zre1.ZN : Ljava/lang/Object;
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
    //   1332: getstatic burp/Zmh0.Zs : Ljava/lang/String;
    //   1335: getstatic burp/Zbli.Zo : Ljava/lang/Object;
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
    //   1375: putstatic burp/Zrkc.ZE : Ljava/lang/String;
    //   1378: sipush #10036
    //   1381: sipush #-27434
    //   1384: invokestatic a : (II)Ljava/lang/String;
    //   1387: iconst_1
    //   1388: ldc burp/Zrcy
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
    //   1509: sipush #10040
    //   1512: sipush #29297
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
    //   1548: ifne -> 1409
    //   1551: sipush #10033
    //   1554: sipush #26605
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
    //   1580: if_icmpge -> 1692
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
    //   1604: ifeq -> 1678
    //   1607: aload #7
    //   1609: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1612: arraylength
    //   1613: iconst_2
    //   1614: if_icmpne -> 1678
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload #7
    //   1626: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1629: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1632: if_acmpne -> 1678
    //   1635: goto -> 1642
    //   1638: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1641: athrow
    //   1642: aload #7
    //   1644: iconst_1
    //   1645: invokevirtual setAccessible : (Z)V
    //   1648: aload #7
    //   1650: aconst_null
    //   1651: iconst_2
    //   1652: anewarray java/lang/Object
    //   1655: dup
    //   1656: iconst_0
    //   1657: aload_0
    //   1658: aastore
    //   1659: dup
    //   1660: iconst_1
    //   1661: aload_1
    //   1662: aastore
    //   1663: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1666: pop
    //   1667: iload_2
    //   1668: ifne -> 1692
    //   1671: goto -> 1678
    //   1674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1677: athrow
    //   1678: iinc #6, 1
    //   1681: iload_2
    //   1682: ifne -> 1576
    //   1685: goto -> 1692
    //   1688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1691: athrow
    //   1692: sipush #10032
    //   1695: sipush #3157
    //   1698: invokestatic a : (II)Ljava/lang/String;
    //   1701: iconst_1
    //   1702: ldc burp/Ztkc
    //   1704: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1707: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1710: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1713: astore #4
    //   1715: aload #4
    //   1717: arraylength
    //   1718: istore #5
    //   1720: iconst_0
    //   1721: istore #6
    //   1723: iload #6
    //   1725: iload #5
    //   1727: if_icmpge -> 1865
    //   1730: aload #4
    //   1732: iload #6
    //   1734: aaload
    //   1735: astore #7
    //   1737: aload #7
    //   1739: invokevirtual getModifiers : ()I
    //   1742: invokestatic isStatic : (I)Z
    //   1745: ifne -> 1755
    //   1748: goto -> 1858
    //   1751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1754: athrow
    //   1755: aload #7
    //   1757: invokevirtual getType : ()Ljava/lang/Class;
    //   1760: astore #8
    //   1762: aload #8
    //   1764: ifnull -> 1845
    //   1767: aload #8
    //   1769: invokevirtual isPrimitive : ()Z
    //   1772: ifne -> 1845
    //   1775: goto -> 1782
    //   1778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1781: athrow
    //   1782: aload #8
    //   1784: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1787: ifnull -> 1845
    //   1790: goto -> 1797
    //   1793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1796: athrow
    //   1797: aload #8
    //   1799: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1802: invokevirtual getName : ()Ljava/lang/String;
    //   1805: ifnull -> 1845
    //   1808: goto -> 1815
    //   1811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1814: athrow
    //   1815: aload #8
    //   1817: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1820: invokevirtual getName : ()Ljava/lang/String;
    //   1823: sipush #10041
    //   1826: sipush #-457
    //   1829: invokestatic a : (II)Ljava/lang/String;
    //   1832: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1835: ifne -> 1845
    //   1838: goto -> 1845
    //   1841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1844: athrow
    //   1845: aload #7
    //   1847: iconst_1
    //   1848: invokevirtual setAccessible : (Z)V
    //   1851: aload #7
    //   1853: aconst_null
    //   1854: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1857: pop
    //   1858: iinc #6, 1
    //   1861: iload_2
    //   1862: ifne -> 1723
    //   1865: sipush #10047
    //   1868: sipush #15832
    //   1871: invokestatic a : (II)Ljava/lang/String;
    //   1874: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1877: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1880: astore #4
    //   1882: aload #4
    //   1884: arraylength
    //   1885: istore #5
    //   1887: iconst_0
    //   1888: istore #6
    //   1890: iload #6
    //   1892: iload #5
    //   1894: if_icmpge -> 2024
    //   1897: aload #4
    //   1899: iload #6
    //   1901: aaload
    //   1902: astore #7
    //   1904: aload #7
    //   1906: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1909: pop
    //   1910: aload #7
    //   1912: invokevirtual getModifiers : ()I
    //   1915: invokestatic isStatic : (I)Z
    //   1918: ifeq -> 2010
    //   1921: aload #7
    //   1923: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1926: arraylength
    //   1927: iconst_2
    //   1928: if_icmpne -> 2010
    //   1931: goto -> 1938
    //   1934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1937: athrow
    //   1938: aload #7
    //   1940: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1943: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1946: if_acmpne -> 2010
    //   1949: goto -> 1956
    //   1952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1955: athrow
    //   1956: aload #7
    //   1958: iconst_1
    //   1959: invokevirtual setAccessible : (Z)V
    //   1962: aload #7
    //   1964: aconst_null
    //   1965: iconst_2
    //   1966: anewarray java/lang/Object
    //   1969: dup
    //   1970: iconst_0
    //   1971: aload_0
    //   1972: aastore
    //   1973: dup
    //   1974: iconst_1
    //   1975: aload_1
    //   1976: ifnonnull -> 1994
    //   1979: goto -> 1986
    //   1982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1985: athrow
    //   1986: aload_1
    //   1987: goto -> 2001
    //   1990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1993: athrow
    //   1994: aload_1
    //   1995: checkcast [B
    //   1998: invokevirtual clone : ()Ljava/lang/Object;
    //   2001: aastore
    //   2002: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2005: pop
    //   2006: iload_2
    //   2007: ifne -> 2024
    //   2010: iinc #6, 1
    //   2013: iload_2
    //   2014: ifne -> 1890
    //   2017: goto -> 2024
    //   2020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2023: athrow
    //   2024: sipush #10043
    //   2027: sipush #-13610
    //   2030: invokestatic a : (II)Ljava/lang/String;
    //   2033: iconst_1
    //   2034: ldc burp/Zgfm
    //   2036: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2039: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2042: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2045: astore #4
    //   2047: aload #4
    //   2049: arraylength
    //   2050: istore #5
    //   2052: iconst_0
    //   2053: istore #6
    //   2055: iload #6
    //   2057: iload #5
    //   2059: if_icmpge -> 2197
    //   2062: aload #4
    //   2064: iload #6
    //   2066: aaload
    //   2067: astore #7
    //   2069: aload #7
    //   2071: invokevirtual getModifiers : ()I
    //   2074: invokestatic isStatic : (I)Z
    //   2077: ifne -> 2087
    //   2080: goto -> 2190
    //   2083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2086: athrow
    //   2087: aload #7
    //   2089: invokevirtual getType : ()Ljava/lang/Class;
    //   2092: astore #8
    //   2094: aload #8
    //   2096: ifnull -> 2177
    //   2099: aload #8
    //   2101: invokevirtual isPrimitive : ()Z
    //   2104: ifne -> 2177
    //   2107: goto -> 2114
    //   2110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2113: athrow
    //   2114: aload #8
    //   2116: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2119: ifnull -> 2177
    //   2122: goto -> 2129
    //   2125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2128: athrow
    //   2129: aload #8
    //   2131: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2134: invokevirtual getName : ()Ljava/lang/String;
    //   2137: ifnull -> 2177
    //   2140: goto -> 2147
    //   2143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2146: athrow
    //   2147: aload #8
    //   2149: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2152: invokevirtual getName : ()Ljava/lang/String;
    //   2155: sipush #10041
    //   2158: sipush #-457
    //   2161: invokestatic a : (II)Ljava/lang/String;
    //   2164: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2167: ifne -> 2177
    //   2170: goto -> 2177
    //   2173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2176: athrow
    //   2177: aload #7
    //   2179: iconst_1
    //   2180: invokevirtual setAccessible : (Z)V
    //   2183: aload #7
    //   2185: aconst_null
    //   2186: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2189: pop
    //   2190: iinc #6, 1
    //   2193: iload_2
    //   2194: ifne -> 2055
    //   2197: sipush #10035
    //   2200: sipush #-23089
    //   2203: invokestatic a : (II)Ljava/lang/String;
    //   2206: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2209: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2212: astore #4
    //   2214: aload #4
    //   2216: arraylength
    //   2217: istore #5
    //   2219: iconst_0
    //   2220: istore #6
    //   2222: iload #6
    //   2224: iload #5
    //   2226: if_icmpge -> 2359
    //   2229: aload #4
    //   2231: iload #6
    //   2233: aaload
    //   2234: astore #7
    //   2236: aload #7
    //   2238: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2241: pop
    //   2242: aload #7
    //   2244: invokevirtual getModifiers : ()I
    //   2247: invokestatic isStatic : (I)Z
    //   2250: ifeq -> 2345
    //   2253: aload #7
    //   2255: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2258: arraylength
    //   2259: iconst_2
    //   2260: if_icmpne -> 2345
    //   2263: goto -> 2270
    //   2266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2269: athrow
    //   2270: aload #7
    //   2272: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2275: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2278: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2281: ifeq -> 2345
    //   2284: goto -> 2291
    //   2287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2290: athrow
    //   2291: aload #7
    //   2293: iconst_1
    //   2294: invokevirtual setAccessible : (Z)V
    //   2297: aload #7
    //   2299: aconst_null
    //   2300: iconst_2
    //   2301: anewarray java/lang/Object
    //   2304: dup
    //   2305: iconst_0
    //   2306: aload_0
    //   2307: aastore
    //   2308: dup
    //   2309: iconst_1
    //   2310: aload_1
    //   2311: ifnonnull -> 2329
    //   2314: goto -> 2321
    //   2317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2320: athrow
    //   2321: aload_1
    //   2322: goto -> 2336
    //   2325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2328: athrow
    //   2329: aload_1
    //   2330: checkcast [B
    //   2333: invokevirtual clone : ()Ljava/lang/Object;
    //   2336: aastore
    //   2337: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2340: pop
    //   2341: iload_2
    //   2342: ifne -> 2359
    //   2345: iinc #6, 1
    //   2348: iload_2
    //   2349: ifne -> 2222
    //   2352: goto -> 2359
    //   2355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2358: athrow
    //   2359: getstatic burp/Zmdi.ZA : Ljava/lang/String;
    //   2362: getstatic burp/Zt4g.Zv : Ljava/lang/Object;
    //   2365: checkcast java/math/BigInteger
    //   2368: invokevirtual intValue : ()I
    //   2371: bipush #32
    //   2373: irem
    //   2374: invokestatic abs : (I)I
    //   2377: invokevirtual charAt : (I)C
    //   2380: getstatic burp/Zer.Zp : Ljava/lang/String;
    //   2383: getstatic burp/Zgly.ZN : Ljava/lang/Object;
    //   2386: checkcast java/math/BigInteger
    //   2389: invokevirtual intValue : ()I
    //   2392: bipush #32
    //   2394: irem
    //   2395: invokestatic abs : (I)I
    //   2398: invokevirtual charAt : (I)C
    //   2401: if_icmple -> 2508
    //   2404: getstatic burp/Zgh3.ZR : Ljava/lang/String;
    //   2407: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
    //   2410: checkcast java/math/BigInteger
    //   2413: invokevirtual intValue : ()I
    //   2416: bipush #32
    //   2418: irem
    //   2419: invokestatic abs : (I)I
    //   2422: invokevirtual charAt : (I)C
    //   2425: getstatic burp/Zl1e.Z_ : Ljava/lang/String;
    //   2428: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   2431: checkcast java/math/BigInteger
    //   2434: invokevirtual intValue : ()I
    //   2437: bipush #32
    //   2439: irem
    //   2440: invokestatic abs : (I)I
    //   2443: invokevirtual charAt : (I)C
    //   2446: if_icmpgt -> 2508
    //   2449: goto -> 2456
    //   2452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2455: athrow
    //   2456: getstatic burp/Zl8f.ZK : Ljava/lang/String;
    //   2459: getstatic burp/Zgdj.ZT : Ljava/lang/Object;
    //   2462: checkcast java/math/BigInteger
    //   2465: invokevirtual intValue : ()I
    //   2468: bipush #32
    //   2470: irem
    //   2471: invokestatic abs : (I)I
    //   2474: invokevirtual charAt : (I)C
    //   2477: getstatic burp/Zkw.ZU : Ljava/lang/String;
    //   2480: getstatic burp/Ztev.Zr : Ljava/lang/Object;
    //   2483: checkcast java/math/BigInteger
    //   2486: invokevirtual intValue : ()I
    //   2489: bipush #32
    //   2491: irem
    //   2492: invokestatic abs : (I)I
    //   2495: invokevirtual charAt : (I)C
    //   2498: if_icmple -> 2516
    //   2501: goto -> 2508
    //   2504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2507: athrow
    //   2508: iconst_1
    //   2509: goto -> 2517
    //   2512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2515: athrow
    //   2516: iconst_0
    //   2517: ireturn
    //   2518: astore_3
    //   2519: new java/lang/Exception
    //   2522: dup
    //   2523: aload_3
    //   2524: invokevirtual getMessage : ()Ljava/lang/String;
    //   2527: invokespecial <init> : (Ljava/lang/String;)V
    //   2530: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2517	2518	java/lang/Throwable
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
    //   1607	1635	1638	java/lang/Throwable
    //   1624	1671	1674	java/lang/Throwable
    //   1642	1685	1688	java/lang/Throwable
    //   1737	1751	1751	java/lang/Throwable
    //   1762	1775	1778	java/lang/Throwable
    //   1767	1790	1793	java/lang/Throwable
    //   1782	1808	1811	java/lang/Throwable
    //   1797	1838	1841	java/lang/Throwable
    //   1904	1931	1934	java/lang/Throwable
    //   1921	1949	1952	java/lang/Throwable
    //   1938	1979	1982	java/lang/Throwable
    //   1956	1990	1990	java/lang/Throwable
    //   2001	2017	2020	java/lang/Throwable
    //   2069	2083	2083	java/lang/Throwable
    //   2094	2107	2110	java/lang/Throwable
    //   2099	2122	2125	java/lang/Throwable
    //   2114	2140	2143	java/lang/Throwable
    //   2129	2170	2173	java/lang/Throwable
    //   2236	2263	2266	java/lang/Throwable
    //   2253	2284	2287	java/lang/Throwable
    //   2270	2314	2317	java/lang/Throwable
    //   2291	2325	2325	java/lang/Throwable
    //   2336	2352	2355	java/lang/Throwable
    //   2359	2449	2452	java/lang/Throwable
    //   2404	2501	2504	java/lang/Throwable
    //   2456	2512	2512	java/lang/Throwable
  }
  
  static void ZD(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ûh«ê\\tJ¥=©T\\tqwÉ,Ö÷i bý_\\b:GÇ»h¤ï°õ#\\tÀlÐ®T ¿ûÌÛÚ­'þH§ÉÒ;èé@å)K\\tÑ·Ý\\r®ÕÙ+\\t6Ç!1;¾\\tÊ¾ØÂoBÇ\\tï{VæÙ·Ml\\n¶Sþ8*:ÕäéöÓK3f2­BÞ±ôºÙ¡'ûú¡¸".(P¦6ô¨Tî}f\\fëÞºàAY5nÈÁ¬@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #89
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
    //   67: ldc '<gú^*H\\t;çf÷Ü3'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #19
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
    //   128: putstatic burp/Zgp_.a : [Ljava/lang/String;
    //   131: bipush #13
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgp_.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #94
    //   214: goto -> 243
    //   217: bipush #83
    //   219: goto -> 243
    //   222: iconst_2
    //   223: goto -> 243
    //   226: bipush #72
    //   228: goto -> 243
    //   231: bipush #53
    //   233: goto -> 243
    //   236: bipush #43
    //   238: goto -> 243
    //   241: bipush #86
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
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: sipush #10045
    //   303: sipush #-20872
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgp_.Zn : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #63
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-8
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #110
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #7
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-75
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-89
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #77
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-20
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #105
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #77
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #31
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-83
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-24
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #62
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-41
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #59
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-96
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #19
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-108
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #87
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-102
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-10
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-102
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-113
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-108
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #92
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-127
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-116
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-126
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-60
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #29
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-7
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zgp_.Zm : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2738) & 0xFFFF;
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
      byte b1 = 28;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgp_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */