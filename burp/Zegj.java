package burp;

import java.math.BigInteger;

class Zegj extends ClassLoader {
  static Object ZT;
  
  static String ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZL(Object paramObject) {
    Zbx5.Zz = a(16439, -31559);
    Zbx5.ZL = new BigInteger(a(16416, -19147));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zz41.Zc.charAt(Math.abs(((BigInteger)Zvh.Zb).intValue() % 32)) > Zrye.Za.charAt(Math.abs(((BigInteger)Ztwp.Ze).intValue() % 32))) {
          try {
            Zz3b.ZH(Class.forName(a(16431, -28620)));
            if (bool)
              Zez0.ZN(Class.forName(a(16427, -17809))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zez0.ZN(Class.forName(a(16427, -17809)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm_u.Zf : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zegj.ZT : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zlt1.ZH : Ljava/lang/Object;
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
    //   185: getstatic burp/Zmtr.Zd : Ljava/lang/String;
    //   188: getstatic burp/Zsko.ZD : Ljava/lang/Object;
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
    //   222: getstatic burp/Ztq2.Zt : Ljava/lang/String;
    //   225: getstatic burp/Zv8d.ZN : Ljava/lang/Object;
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
    //   259: getstatic burp/Zzl4.ZT : Ljava/lang/String;
    //   262: getstatic burp/Zt85.Zl : Ljava/lang/Object;
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
    //   296: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   299: getstatic burp/Zs1d.Zo : Ljava/lang/Object;
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
    //   333: getstatic burp/Zbsz.Zu : Ljava/lang/String;
    //   336: getstatic burp/Zeva.Zf : Ljava/lang/Object;
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
    //   370: getstatic burp/Zkhf.Zb : Ljava/lang/String;
    //   373: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
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
    //   407: getstatic burp/Zm1d.ZE : Ljava/lang/String;
    //   410: getstatic burp/Zv8l.ZL : Ljava/lang/Object;
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
    //   444: getstatic burp/Zst7.Zi : Ljava/lang/String;
    //   447: getstatic burp/Zsn3.Zy : Ljava/lang/Object;
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
    //   481: getstatic burp/Zbze.ZK : Ljava/lang/String;
    //   484: getstatic burp/Zlwc.ZG : Ljava/lang/Object;
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
    //   518: getstatic burp/Zt4p.ZL : Ljava/lang/String;
    //   521: getstatic burp/Ze2w.ZA : Ljava/lang/Object;
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
    //   555: getstatic burp/Zmui.ZY : Ljava/lang/String;
    //   558: getstatic burp/Zrnt.Zh : Ljava/lang/Object;
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
    //   592: getstatic burp/Zmlr.ZJ : Ljava/lang/String;
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
    //   618: ifne -> 1364
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   627: athrow
    //   628: aload_3
    //   629: getstatic burp/Zmz.Zp : Ljava/lang/String;
    //   632: getstatic burp/Zt7x.ZE : Ljava/lang/Object;
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
    //   666: getstatic burp/Zezi.Ze : Ljava/lang/String;
    //   669: getstatic burp/Zzh5.ZG : Ljava/lang/Object;
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
    //   703: getstatic burp/Zek4.Zo : Ljava/lang/String;
    //   706: getstatic burp/Zl7b.ZK : Ljava/lang/Object;
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
    //   740: getstatic burp/Ztgv.ZC : Ljava/lang/String;
    //   743: getstatic burp/Zewr.Zw : Ljava/lang/Object;
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
    //   777: getstatic burp/Zrfa.ZT : Ljava/lang/String;
    //   780: getstatic burp/Zedq.Zy : Ljava/lang/Object;
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
    //   814: getstatic burp/Zr36.Ze : Ljava/lang/String;
    //   817: getstatic burp/Zz0f.ZL : Ljava/lang/Object;
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
    //   851: getstatic burp/Zz7m.Zq : Ljava/lang/String;
    //   854: getstatic burp/Zgis.ZV : Ljava/lang/Object;
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
    //   888: getstatic burp/Zrjw.Zz : Ljava/lang/String;
    //   891: getstatic burp/Zrww.ZN : Ljava/lang/Object;
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
    //   925: getstatic burp/Zeqz.ZV : Ljava/lang/String;
    //   928: getstatic burp/Zz91.Z_ : Ljava/lang/Object;
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
    //   962: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   965: getstatic burp/Zb6m.ZQ : Ljava/lang/Object;
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
    //   999: getstatic burp/Zl_a.ZD : Ljava/lang/String;
    //   1002: getstatic burp/Zsvd.Zk : Ljava/lang/Object;
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
    //   1036: getstatic burp/Zrh_.ZU : Ljava/lang/String;
    //   1039: getstatic burp/Zm3x.ZM : Ljava/lang/Object;
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
    //   1073: getstatic burp/Zka9.ZM : Ljava/lang/String;
    //   1076: getstatic burp/Zzn6.ZO : Ljava/lang/Object;
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
    //   1110: getstatic burp/Zr1t.Ze : Ljava/lang/String;
    //   1113: getstatic burp/Zssc.Zr : Ljava/lang/Object;
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
    //   1147: getstatic burp/Zrd3.Z_ : Ljava/lang/String;
    //   1150: getstatic burp/Ztl6.ZQ : Ljava/lang/Object;
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
    //   1184: getstatic burp/Zz0f.ZW : Ljava/lang/String;
    //   1187: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
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
    //   1221: getstatic burp/Zmf2.ZK : Ljava/lang/String;
    //   1224: getstatic burp/Zkca.ZQ : Ljava/lang/Object;
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
    //   1258: getstatic burp/Zbw5.ZC : Ljava/lang/String;
    //   1261: getstatic burp/Zxzv.Zg : Ljava/lang/Object;
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
    //   1295: getstatic burp/Zse8.Ze : Ljava/lang/String;
    //   1298: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
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
    //   1332: getstatic burp/Zkql.ZR : Ljava/lang/String;
    //   1335: getstatic burp/Zmzj.Zm : Ljava/lang/Object;
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
    //   1375: putstatic burp/Ztle.ZR : Ljava/lang/String;
    //   1378: sipush #16436
    //   1381: getstatic burp/Zgi9.Zc : Ljava/lang/Object;
    //   1384: checkcast java/math/BigInteger
    //   1387: getstatic burp/Zrov.Zk : Ljava/lang/Object;
    //   1390: checkcast java/math/BigInteger
    //   1393: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1396: putstatic burp/Zm69.Zg : Ljava/lang/Object;
    //   1399: sipush #-30772
    //   1402: invokestatic a : (II)Ljava/lang/String;
    //   1405: iconst_1
    //   1406: ldc burp/Zk7w
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
    //   1527: sipush #16434
    //   1530: sipush #-32543
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
    //   1569: sipush #16423
    //   1572: sipush #-666
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
    //   1731: new java/io/ByteArrayOutputStream
    //   1734: dup
    //   1735: invokespecial <init> : ()V
    //   1738: astore #4
    //   1740: sipush #16420
    //   1743: aload #4
    //   1745: sipush #202
    //   1748: invokevirtual write : (I)V
    //   1751: sipush #-1994
    //   1754: aload #4
    //   1756: sipush #254
    //   1759: invokevirtual write : (I)V
    //   1762: aload #4
    //   1764: sipush #186
    //   1767: invokevirtual write : (I)V
    //   1770: aload #4
    //   1772: sipush #190
    //   1775: invokevirtual write : (I)V
    //   1778: aload #4
    //   1780: iconst_0
    //   1781: invokevirtual write : (I)V
    //   1784: aload #4
    //   1786: iconst_1
    //   1787: invokevirtual write : (I)V
    //   1790: aload #4
    //   1792: iconst_0
    //   1793: invokevirtual write : (I)V
    //   1796: aload #4
    //   1798: bipush #50
    //   1800: invokevirtual write : (I)V
    //   1803: aload #4
    //   1805: getstatic burp/Zrod.ZX : Ljava/lang/Object;
    //   1808: checkcast java/math/BigInteger
    //   1811: invokevirtual toByteArray : ()[B
    //   1814: invokevirtual write : ([B)V
    //   1817: aload #4
    //   1819: getstatic burp/Zs1d.Zo : Ljava/lang/Object;
    //   1822: checkcast java/math/BigInteger
    //   1825: invokevirtual toByteArray : ()[B
    //   1828: invokevirtual write : ([B)V
    //   1831: aload #4
    //   1833: getstatic burp/Zsts.Zu : Ljava/lang/Object;
    //   1836: checkcast java/math/BigInteger
    //   1839: invokevirtual toByteArray : ()[B
    //   1842: invokevirtual write : ([B)V
    //   1845: aload #4
    //   1847: invokevirtual toByteArray : ()[B
    //   1850: astore #5
    //   1852: aconst_null
    //   1853: astore #6
    //   1855: invokestatic a : (II)Ljava/lang/String;
    //   1858: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1861: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1864: astore #7
    //   1866: aload #7
    //   1868: arraylength
    //   1869: istore #8
    //   1871: iconst_0
    //   1872: istore #9
    //   1874: iload #9
    //   1876: iload #8
    //   1878: if_icmpge -> 2006
    //   1881: aload #7
    //   1883: iload #9
    //   1885: aaload
    //   1886: astore #10
    //   1888: aload #10
    //   1890: invokevirtual getName : ()Ljava/lang/String;
    //   1893: sipush #16429
    //   1896: sipush #-26183
    //   1899: invokestatic a : (II)Ljava/lang/String;
    //   1902: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1905: ifeq -> 1999
    //   1908: aload #10
    //   1910: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1913: astore #11
    //   1915: aload #11
    //   1917: arraylength
    //   1918: iconst_4
    //   1919: if_icmpeq -> 1929
    //   1922: goto -> 1999
    //   1925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1928: athrow
    //   1929: aload #11
    //   1931: iconst_0
    //   1932: aaload
    //   1933: ldc java/lang/String
    //   1935: if_acmpeq -> 1945
    //   1938: goto -> 1999
    //   1941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1944: athrow
    //   1945: aload #11
    //   1947: iconst_1
    //   1948: aaload
    //   1949: ldc [B
    //   1951: if_acmpeq -> 1961
    //   1954: goto -> 1999
    //   1957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1960: athrow
    //   1961: aload #11
    //   1963: iconst_2
    //   1964: aaload
    //   1965: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1968: if_acmpeq -> 1978
    //   1971: goto -> 1999
    //   1974: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1977: athrow
    //   1978: aload #11
    //   1980: iconst_3
    //   1981: aaload
    //   1982: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1985: if_acmpeq -> 1995
    //   1988: goto -> 1999
    //   1991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1994: athrow
    //   1995: aload #10
    //   1997: astore #6
    //   1999: iinc #9, 1
    //   2002: iload_2
    //   2003: ifne -> 1874
    //   2006: aload #6
    //   2008: iconst_1
    //   2009: invokevirtual setAccessible : (Z)V
    //   2012: ldc burp/Zm54
    //   2014: iconst_0
    //   2015: anewarray java/lang/Class
    //   2018: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2021: astore #7
    //   2023: aload #7
    //   2025: iconst_1
    //   2026: invokevirtual setAccessible : (Z)V
    //   2029: aload #6
    //   2031: aload #7
    //   2033: iconst_0
    //   2034: anewarray java/lang/Object
    //   2037: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2040: iconst_4
    //   2041: anewarray java/lang/Object
    //   2044: dup
    //   2045: iconst_0
    //   2046: sipush #16432
    //   2049: sipush #25834
    //   2052: invokestatic a : (II)Ljava/lang/String;
    //   2055: aastore
    //   2056: dup
    //   2057: iconst_1
    //   2058: aload #5
    //   2060: aastore
    //   2061: dup
    //   2062: iconst_2
    //   2063: iconst_0
    //   2064: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2067: aastore
    //   2068: dup
    //   2069: iconst_3
    //   2070: aload #5
    //   2072: arraylength
    //   2073: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2076: aastore
    //   2077: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2080: pop
    //   2081: goto -> 2086
    //   2084: astore #4
    //   2086: sipush #16428
    //   2089: sipush #-26778
    //   2092: invokestatic a : (II)Ljava/lang/String;
    //   2095: iconst_1
    //   2096: ldc burp/Zb2s
    //   2098: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2101: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2104: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2107: astore #4
    //   2109: aload #4
    //   2111: arraylength
    //   2112: istore #5
    //   2114: iconst_0
    //   2115: istore #6
    //   2117: iload #6
    //   2119: iload #5
    //   2121: if_icmpge -> 2259
    //   2124: aload #4
    //   2126: iload #6
    //   2128: aaload
    //   2129: astore #7
    //   2131: aload #7
    //   2133: invokevirtual getModifiers : ()I
    //   2136: invokestatic isStatic : (I)Z
    //   2139: ifne -> 2149
    //   2142: goto -> 2252
    //   2145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2148: athrow
    //   2149: aload #7
    //   2151: invokevirtual getType : ()Ljava/lang/Class;
    //   2154: astore #8
    //   2156: aload #8
    //   2158: ifnull -> 2239
    //   2161: aload #8
    //   2163: invokevirtual isPrimitive : ()Z
    //   2166: ifne -> 2239
    //   2169: goto -> 2176
    //   2172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2175: athrow
    //   2176: aload #8
    //   2178: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2181: ifnull -> 2239
    //   2184: goto -> 2191
    //   2187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2190: athrow
    //   2191: aload #8
    //   2193: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2196: invokevirtual getName : ()Ljava/lang/String;
    //   2199: ifnull -> 2239
    //   2202: goto -> 2209
    //   2205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2208: athrow
    //   2209: aload #8
    //   2211: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2214: invokevirtual getName : ()Ljava/lang/String;
    //   2217: sipush #16424
    //   2220: sipush #-28230
    //   2223: invokestatic a : (II)Ljava/lang/String;
    //   2226: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2229: ifne -> 2239
    //   2232: goto -> 2239
    //   2235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2238: athrow
    //   2239: aload #7
    //   2241: iconst_1
    //   2242: invokevirtual setAccessible : (Z)V
    //   2245: aload #7
    //   2247: aconst_null
    //   2248: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2251: pop
    //   2252: iinc #6, 1
    //   2255: iload_2
    //   2256: ifne -> 2117
    //   2259: sipush #16422
    //   2262: bipush #8
    //   2264: invokestatic a : (II)Ljava/lang/String;
    //   2267: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2270: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2273: astore #4
    //   2275: aload #4
    //   2277: arraylength
    //   2278: istore #5
    //   2280: iconst_0
    //   2281: istore #6
    //   2283: iload #6
    //   2285: iload #5
    //   2287: if_icmpge -> 2399
    //   2290: aload #4
    //   2292: iload #6
    //   2294: aaload
    //   2295: astore #7
    //   2297: aload #7
    //   2299: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2302: pop
    //   2303: aload #7
    //   2305: invokevirtual getModifiers : ()I
    //   2308: invokestatic isStatic : (I)Z
    //   2311: ifeq -> 2385
    //   2314: aload #7
    //   2316: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2319: arraylength
    //   2320: iconst_2
    //   2321: if_icmpne -> 2385
    //   2324: goto -> 2331
    //   2327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2330: athrow
    //   2331: aload #7
    //   2333: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2336: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2339: if_acmpne -> 2385
    //   2342: goto -> 2349
    //   2345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2348: athrow
    //   2349: aload #7
    //   2351: iconst_1
    //   2352: invokevirtual setAccessible : (Z)V
    //   2355: aload #7
    //   2357: aconst_null
    //   2358: iconst_2
    //   2359: anewarray java/lang/Object
    //   2362: dup
    //   2363: iconst_0
    //   2364: aload_0
    //   2365: aastore
    //   2366: dup
    //   2367: iconst_1
    //   2368: aload_1
    //   2369: aastore
    //   2370: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2373: pop
    //   2374: iload_2
    //   2375: ifne -> 2399
    //   2378: goto -> 2385
    //   2381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2384: athrow
    //   2385: iinc #6, 1
    //   2388: iload_2
    //   2389: ifne -> 2283
    //   2392: goto -> 2399
    //   2395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2398: athrow
    //   2399: iconst_0
    //   2400: istore #4
    //   2402: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   2405: getstatic burp/Zlwj.ZE : Ljava/lang/Object;
    //   2408: checkcast java/math/BigInteger
    //   2411: invokevirtual intValue : ()I
    //   2414: bipush #32
    //   2416: irem
    //   2417: invokestatic abs : (I)I
    //   2420: invokevirtual charAt : (I)C
    //   2423: getstatic burp/Zzk_.ZX : Ljava/lang/String;
    //   2426: getstatic burp/Zedu.ZL : Ljava/lang/Object;
    //   2429: checkcast java/math/BigInteger
    //   2432: invokevirtual intValue : ()I
    //   2435: bipush #32
    //   2437: irem
    //   2438: invokestatic abs : (I)I
    //   2441: invokevirtual charAt : (I)C
    //   2444: if_icmple -> 2789
    //   2447: sipush #16418
    //   2450: sipush #-14573
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: iconst_1
    //   2457: ldc burp/Zl_9
    //   2459: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2462: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2465: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2468: astore #5
    //   2470: aload #5
    //   2472: arraylength
    //   2473: istore #6
    //   2475: iconst_0
    //   2476: istore #7
    //   2478: iload #7
    //   2480: iload #6
    //   2482: if_icmpge -> 2620
    //   2485: aload #5
    //   2487: iload #7
    //   2489: aaload
    //   2490: astore #8
    //   2492: aload #8
    //   2494: invokevirtual getModifiers : ()I
    //   2497: invokestatic isStatic : (I)Z
    //   2500: ifne -> 2510
    //   2503: goto -> 2613
    //   2506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2509: athrow
    //   2510: aload #8
    //   2512: invokevirtual getType : ()Ljava/lang/Class;
    //   2515: astore #9
    //   2517: aload #9
    //   2519: ifnull -> 2600
    //   2522: aload #9
    //   2524: invokevirtual isPrimitive : ()Z
    //   2527: ifne -> 2600
    //   2530: goto -> 2537
    //   2533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2536: athrow
    //   2537: aload #9
    //   2539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2542: ifnull -> 2600
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2551: athrow
    //   2552: aload #9
    //   2554: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2557: invokevirtual getName : ()Ljava/lang/String;
    //   2560: ifnull -> 2600
    //   2563: goto -> 2570
    //   2566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2569: athrow
    //   2570: aload #9
    //   2572: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2575: invokevirtual getName : ()Ljava/lang/String;
    //   2578: sipush #16424
    //   2581: sipush #-28230
    //   2584: invokestatic a : (II)Ljava/lang/String;
    //   2587: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2590: ifne -> 2600
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #8
    //   2602: iconst_1
    //   2603: invokevirtual setAccessible : (Z)V
    //   2606: aload #8
    //   2608: aconst_null
    //   2609: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2612: pop
    //   2613: iinc #7, 1
    //   2616: iload_2
    //   2617: ifne -> 2478
    //   2620: sipush #16425
    //   2623: sipush #28965
    //   2626: invokestatic a : (II)Ljava/lang/String;
    //   2629: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2632: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2635: astore #5
    //   2637: aload #5
    //   2639: arraylength
    //   2640: istore #6
    //   2642: iconst_0
    //   2643: istore #7
    //   2645: iload #7
    //   2647: iload #6
    //   2649: if_icmpge -> 2786
    //   2652: aload #5
    //   2654: iload #7
    //   2656: aaload
    //   2657: astore #8
    //   2659: aload #8
    //   2661: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2664: pop
    //   2665: aload #8
    //   2667: invokevirtual getModifiers : ()I
    //   2670: invokestatic isStatic : (I)Z
    //   2673: ifeq -> 2772
    //   2676: aload #8
    //   2678: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2681: arraylength
    //   2682: iconst_2
    //   2683: if_icmpne -> 2772
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2692: athrow
    //   2693: aload #8
    //   2695: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2698: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2701: if_acmpne -> 2772
    //   2704: goto -> 2711
    //   2707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2710: athrow
    //   2711: aload #8
    //   2713: iconst_1
    //   2714: invokevirtual setAccessible : (Z)V
    //   2717: aload #8
    //   2719: aconst_null
    //   2720: iconst_2
    //   2721: anewarray java/lang/Object
    //   2724: dup
    //   2725: iconst_0
    //   2726: aload_0
    //   2727: aastore
    //   2728: dup
    //   2729: iconst_1
    //   2730: aload_1
    //   2731: ifnonnull -> 2749
    //   2734: goto -> 2741
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload_1
    //   2742: goto -> 2756
    //   2745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2748: athrow
    //   2749: aload_1
    //   2750: checkcast [B
    //   2753: invokevirtual clone : ()Ljava/lang/Object;
    //   2756: aastore
    //   2757: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2760: checkcast java/lang/Boolean
    //   2763: invokevirtual booleanValue : ()Z
    //   2766: istore #4
    //   2768: iload_2
    //   2769: ifne -> 2786
    //   2772: iinc #7, 1
    //   2775: iload_2
    //   2776: ifne -> 2645
    //   2779: goto -> 2786
    //   2782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2785: athrow
    //   2786: goto -> 3128
    //   2789: sipush #16433
    //   2792: sipush #-22659
    //   2795: invokestatic a : (II)Ljava/lang/String;
    //   2798: iconst_1
    //   2799: ldc burp/Zg1l
    //   2801: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2804: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2807: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2810: astore #5
    //   2812: aload #5
    //   2814: arraylength
    //   2815: istore #6
    //   2817: iconst_0
    //   2818: istore #7
    //   2820: iload #7
    //   2822: iload #6
    //   2824: if_icmpge -> 2962
    //   2827: aload #5
    //   2829: iload #7
    //   2831: aaload
    //   2832: astore #8
    //   2834: aload #8
    //   2836: invokevirtual getModifiers : ()I
    //   2839: invokestatic isStatic : (I)Z
    //   2842: ifne -> 2852
    //   2845: goto -> 2955
    //   2848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2851: athrow
    //   2852: aload #8
    //   2854: invokevirtual getType : ()Ljava/lang/Class;
    //   2857: astore #9
    //   2859: aload #9
    //   2861: ifnull -> 2942
    //   2864: aload #9
    //   2866: invokevirtual isPrimitive : ()Z
    //   2869: ifne -> 2942
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: aload #9
    //   2881: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2884: ifnull -> 2942
    //   2887: goto -> 2894
    //   2890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2893: athrow
    //   2894: aload #9
    //   2896: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2899: invokevirtual getName : ()Ljava/lang/String;
    //   2902: ifnull -> 2942
    //   2905: goto -> 2912
    //   2908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2911: athrow
    //   2912: aload #9
    //   2914: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2917: invokevirtual getName : ()Ljava/lang/String;
    //   2920: sipush #16424
    //   2923: sipush #-28230
    //   2926: invokestatic a : (II)Ljava/lang/String;
    //   2929: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2932: ifne -> 2942
    //   2935: goto -> 2942
    //   2938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2941: athrow
    //   2942: aload #8
    //   2944: iconst_1
    //   2945: invokevirtual setAccessible : (Z)V
    //   2948: aload #8
    //   2950: aconst_null
    //   2951: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2954: pop
    //   2955: iinc #7, 1
    //   2958: iload_2
    //   2959: ifne -> 2820
    //   2962: sipush #16447
    //   2965: sipush #16437
    //   2968: invokestatic a : (II)Ljava/lang/String;
    //   2971: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2974: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2977: astore #5
    //   2979: aload #5
    //   2981: arraylength
    //   2982: istore #6
    //   2984: iconst_0
    //   2985: istore #7
    //   2987: iload #7
    //   2989: iload #6
    //   2991: if_icmpge -> 3128
    //   2994: aload #5
    //   2996: iload #7
    //   2998: aaload
    //   2999: astore #8
    //   3001: aload #8
    //   3003: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3006: pop
    //   3007: aload #8
    //   3009: invokevirtual getModifiers : ()I
    //   3012: invokestatic isStatic : (I)Z
    //   3015: ifeq -> 3114
    //   3018: aload #8
    //   3020: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3023: arraylength
    //   3024: iconst_2
    //   3025: if_icmpne -> 3114
    //   3028: goto -> 3035
    //   3031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3034: athrow
    //   3035: aload #8
    //   3037: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3040: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3043: if_acmpne -> 3114
    //   3046: goto -> 3053
    //   3049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3052: athrow
    //   3053: aload #8
    //   3055: iconst_1
    //   3056: invokevirtual setAccessible : (Z)V
    //   3059: aload #8
    //   3061: aconst_null
    //   3062: iconst_2
    //   3063: anewarray java/lang/Object
    //   3066: dup
    //   3067: iconst_0
    //   3068: aload_0
    //   3069: aastore
    //   3070: dup
    //   3071: iconst_1
    //   3072: aload_1
    //   3073: ifnonnull -> 3091
    //   3076: goto -> 3083
    //   3079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3082: athrow
    //   3083: aload_1
    //   3084: goto -> 3098
    //   3087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3090: athrow
    //   3091: aload_1
    //   3092: checkcast [B
    //   3095: invokevirtual clone : ()Ljava/lang/Object;
    //   3098: aastore
    //   3099: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3102: checkcast java/lang/Boolean
    //   3105: invokevirtual booleanValue : ()Z
    //   3108: istore #4
    //   3110: iload_2
    //   3111: ifne -> 3128
    //   3114: iinc #7, 1
    //   3117: iload_2
    //   3118: ifne -> 2987
    //   3121: goto -> 3128
    //   3124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3127: athrow
    //   3128: iload #4
    //   3130: ifeq -> 3136
    //   3133: iload #4
    //   3135: ireturn
    //   3136: getstatic burp/Zea8.ZE : Ljava/lang/String;
    //   3139: getstatic burp/Zs1d.Zo : Ljava/lang/Object;
    //   3142: checkcast java/math/BigInteger
    //   3145: invokevirtual intValue : ()I
    //   3148: bipush #32
    //   3150: irem
    //   3151: invokestatic abs : (I)I
    //   3154: invokevirtual charAt : (I)C
    //   3157: getstatic burp/Zk8f.ZV : Ljava/lang/String;
    //   3160: getstatic burp/Zewr.Zw : Ljava/lang/Object;
    //   3163: checkcast java/math/BigInteger
    //   3166: invokevirtual intValue : ()I
    //   3169: bipush #32
    //   3171: irem
    //   3172: invokestatic abs : (I)I
    //   3175: invokevirtual charAt : (I)C
    //   3178: if_icmpgt -> 3524
    //   3181: sipush #16435
    //   3184: sipush #-26558
    //   3187: invokestatic a : (II)Ljava/lang/String;
    //   3190: iconst_1
    //   3191: ldc burp/Zsqi
    //   3193: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3196: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3199: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3202: astore #5
    //   3204: aload #5
    //   3206: arraylength
    //   3207: istore #6
    //   3209: iconst_0
    //   3210: istore #7
    //   3212: iload #7
    //   3214: iload #6
    //   3216: if_icmpge -> 3354
    //   3219: aload #5
    //   3221: iload #7
    //   3223: aaload
    //   3224: astore #8
    //   3226: aload #8
    //   3228: invokevirtual getModifiers : ()I
    //   3231: invokestatic isStatic : (I)Z
    //   3234: ifne -> 3244
    //   3237: goto -> 3347
    //   3240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3243: athrow
    //   3244: aload #8
    //   3246: invokevirtual getType : ()Ljava/lang/Class;
    //   3249: astore #9
    //   3251: aload #9
    //   3253: ifnull -> 3334
    //   3256: aload #9
    //   3258: invokevirtual isPrimitive : ()Z
    //   3261: ifne -> 3334
    //   3264: goto -> 3271
    //   3267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3270: athrow
    //   3271: aload #9
    //   3273: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3276: ifnull -> 3334
    //   3279: goto -> 3286
    //   3282: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3285: athrow
    //   3286: aload #9
    //   3288: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3291: invokevirtual getName : ()Ljava/lang/String;
    //   3294: ifnull -> 3334
    //   3297: goto -> 3304
    //   3300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3303: athrow
    //   3304: aload #9
    //   3306: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3309: invokevirtual getName : ()Ljava/lang/String;
    //   3312: sipush #16424
    //   3315: sipush #-28230
    //   3318: invokestatic a : (II)Ljava/lang/String;
    //   3321: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3324: ifne -> 3334
    //   3327: goto -> 3334
    //   3330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3333: athrow
    //   3334: aload #8
    //   3336: iconst_1
    //   3337: invokevirtual setAccessible : (Z)V
    //   3340: aload #8
    //   3342: aconst_null
    //   3343: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3346: pop
    //   3347: iinc #7, 1
    //   3350: iload_2
    //   3351: ifne -> 3212
    //   3354: sipush #16417
    //   3357: sipush #7696
    //   3360: invokestatic a : (II)Ljava/lang/String;
    //   3363: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3366: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3369: astore #5
    //   3371: aload #5
    //   3373: arraylength
    //   3374: istore #6
    //   3376: iconst_0
    //   3377: istore #7
    //   3379: iload #7
    //   3381: iload #6
    //   3383: if_icmpge -> 3520
    //   3386: aload #5
    //   3388: iload #7
    //   3390: aaload
    //   3391: astore #8
    //   3393: aload #8
    //   3395: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3398: pop
    //   3399: aload #8
    //   3401: invokevirtual getModifiers : ()I
    //   3404: invokestatic isStatic : (I)Z
    //   3407: ifeq -> 3506
    //   3410: aload #8
    //   3412: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3415: arraylength
    //   3416: iconst_2
    //   3417: if_icmpne -> 3506
    //   3420: goto -> 3427
    //   3423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3426: athrow
    //   3427: aload #8
    //   3429: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3432: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3435: if_acmpne -> 3506
    //   3438: goto -> 3445
    //   3441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3444: athrow
    //   3445: aload #8
    //   3447: iconst_1
    //   3448: invokevirtual setAccessible : (Z)V
    //   3451: aload #8
    //   3453: aconst_null
    //   3454: iconst_2
    //   3455: anewarray java/lang/Object
    //   3458: dup
    //   3459: iconst_0
    //   3460: aload_0
    //   3461: aastore
    //   3462: dup
    //   3463: iconst_1
    //   3464: aload_1
    //   3465: ifnonnull -> 3483
    //   3468: goto -> 3475
    //   3471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3474: athrow
    //   3475: aload_1
    //   3476: goto -> 3490
    //   3479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3482: athrow
    //   3483: aload_1
    //   3484: checkcast [B
    //   3487: invokevirtual clone : ()Ljava/lang/Object;
    //   3490: aastore
    //   3491: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3494: checkcast java/lang/Boolean
    //   3497: invokevirtual booleanValue : ()Z
    //   3500: istore #4
    //   3502: iload_2
    //   3503: ifne -> 3520
    //   3506: iinc #7, 1
    //   3509: iload_2
    //   3510: ifne -> 3379
    //   3513: goto -> 3520
    //   3516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3519: athrow
    //   3520: iload_2
    //   3521: ifne -> 3863
    //   3524: sipush #16443
    //   3527: sipush #-31372
    //   3530: invokestatic a : (II)Ljava/lang/String;
    //   3533: iconst_1
    //   3534: ldc burp/Zz35
    //   3536: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3539: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3542: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3545: astore #5
    //   3547: aload #5
    //   3549: arraylength
    //   3550: istore #6
    //   3552: iconst_0
    //   3553: istore #7
    //   3555: iload #7
    //   3557: iload #6
    //   3559: if_icmpge -> 3697
    //   3562: aload #5
    //   3564: iload #7
    //   3566: aaload
    //   3567: astore #8
    //   3569: aload #8
    //   3571: invokevirtual getModifiers : ()I
    //   3574: invokestatic isStatic : (I)Z
    //   3577: ifne -> 3587
    //   3580: goto -> 3690
    //   3583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3586: athrow
    //   3587: aload #8
    //   3589: invokevirtual getType : ()Ljava/lang/Class;
    //   3592: astore #9
    //   3594: aload #9
    //   3596: ifnull -> 3677
    //   3599: aload #9
    //   3601: invokevirtual isPrimitive : ()Z
    //   3604: ifne -> 3677
    //   3607: goto -> 3614
    //   3610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3613: athrow
    //   3614: aload #9
    //   3616: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3619: ifnull -> 3677
    //   3622: goto -> 3629
    //   3625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3628: athrow
    //   3629: aload #9
    //   3631: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3634: invokevirtual getName : ()Ljava/lang/String;
    //   3637: ifnull -> 3677
    //   3640: goto -> 3647
    //   3643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3646: athrow
    //   3647: aload #9
    //   3649: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3652: invokevirtual getName : ()Ljava/lang/String;
    //   3655: sipush #16424
    //   3658: sipush #-28230
    //   3661: invokestatic a : (II)Ljava/lang/String;
    //   3664: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3667: ifne -> 3677
    //   3670: goto -> 3677
    //   3673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3676: athrow
    //   3677: aload #8
    //   3679: iconst_1
    //   3680: invokevirtual setAccessible : (Z)V
    //   3683: aload #8
    //   3685: aconst_null
    //   3686: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3689: pop
    //   3690: iinc #7, 1
    //   3693: iload_2
    //   3694: ifne -> 3555
    //   3697: sipush #16442
    //   3700: sipush #17079
    //   3703: invokestatic a : (II)Ljava/lang/String;
    //   3706: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3709: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3712: astore #5
    //   3714: aload #5
    //   3716: arraylength
    //   3717: istore #6
    //   3719: iconst_0
    //   3720: istore #7
    //   3722: iload #7
    //   3724: iload #6
    //   3726: if_icmpge -> 3863
    //   3729: aload #5
    //   3731: iload #7
    //   3733: aaload
    //   3734: astore #8
    //   3736: aload #8
    //   3738: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3741: pop
    //   3742: aload #8
    //   3744: invokevirtual getModifiers : ()I
    //   3747: invokestatic isStatic : (I)Z
    //   3750: ifeq -> 3849
    //   3753: aload #8
    //   3755: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3758: arraylength
    //   3759: iconst_2
    //   3760: if_icmpne -> 3849
    //   3763: goto -> 3770
    //   3766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3769: athrow
    //   3770: aload #8
    //   3772: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3775: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3778: if_acmpne -> 3849
    //   3781: goto -> 3788
    //   3784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3787: athrow
    //   3788: aload #8
    //   3790: iconst_1
    //   3791: invokevirtual setAccessible : (Z)V
    //   3794: aload #8
    //   3796: aconst_null
    //   3797: iconst_2
    //   3798: anewarray java/lang/Object
    //   3801: dup
    //   3802: iconst_0
    //   3803: aload_0
    //   3804: aastore
    //   3805: dup
    //   3806: iconst_1
    //   3807: aload_1
    //   3808: ifnonnull -> 3826
    //   3811: goto -> 3818
    //   3814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3817: athrow
    //   3818: aload_1
    //   3819: goto -> 3833
    //   3822: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3825: athrow
    //   3826: aload_1
    //   3827: checkcast [B
    //   3830: invokevirtual clone : ()Ljava/lang/Object;
    //   3833: aastore
    //   3834: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3837: checkcast java/lang/Boolean
    //   3840: invokevirtual booleanValue : ()Z
    //   3843: istore #4
    //   3845: iload_2
    //   3846: ifne -> 3863
    //   3849: iinc #7, 1
    //   3852: iload_2
    //   3853: ifne -> 3722
    //   3856: goto -> 3863
    //   3859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3862: athrow
    //   3863: iload #4
    //   3865: ifeq -> 3871
    //   3868: iload #4
    //   3870: ireturn
    //   3871: getstatic burp/Zedq.Zj : Ljava/lang/String;
    //   3874: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   3877: checkcast java/math/BigInteger
    //   3880: invokevirtual intValue : ()I
    //   3883: bipush #32
    //   3885: irem
    //   3886: invokestatic abs : (I)I
    //   3889: invokevirtual charAt : (I)C
    //   3892: getstatic burp/Zlsg.Zs : Ljava/lang/String;
    //   3895: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   3898: checkcast java/math/BigInteger
    //   3901: invokevirtual intValue : ()I
    //   3904: bipush #32
    //   3906: irem
    //   3907: invokestatic abs : (I)I
    //   3910: invokevirtual charAt : (I)C
    //   3913: if_icmple -> 4259
    //   3916: sipush #16440
    //   3919: sipush #-26174
    //   3922: invokestatic a : (II)Ljava/lang/String;
    //   3925: iconst_1
    //   3926: ldc burp/Zkby
    //   3928: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3931: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3934: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3937: astore #5
    //   3939: aload #5
    //   3941: arraylength
    //   3942: istore #6
    //   3944: iconst_0
    //   3945: istore #7
    //   3947: iload #7
    //   3949: iload #6
    //   3951: if_icmpge -> 4089
    //   3954: aload #5
    //   3956: iload #7
    //   3958: aaload
    //   3959: astore #8
    //   3961: aload #8
    //   3963: invokevirtual getModifiers : ()I
    //   3966: invokestatic isStatic : (I)Z
    //   3969: ifne -> 3979
    //   3972: goto -> 4082
    //   3975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3978: athrow
    //   3979: aload #8
    //   3981: invokevirtual getType : ()Ljava/lang/Class;
    //   3984: astore #9
    //   3986: aload #9
    //   3988: ifnull -> 4069
    //   3991: aload #9
    //   3993: invokevirtual isPrimitive : ()Z
    //   3996: ifne -> 4069
    //   3999: goto -> 4006
    //   4002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4005: athrow
    //   4006: aload #9
    //   4008: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4011: ifnull -> 4069
    //   4014: goto -> 4021
    //   4017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4020: athrow
    //   4021: aload #9
    //   4023: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4026: invokevirtual getName : ()Ljava/lang/String;
    //   4029: ifnull -> 4069
    //   4032: goto -> 4039
    //   4035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4038: athrow
    //   4039: aload #9
    //   4041: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4044: invokevirtual getName : ()Ljava/lang/String;
    //   4047: sipush #16424
    //   4050: sipush #-28230
    //   4053: invokestatic a : (II)Ljava/lang/String;
    //   4056: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4059: ifne -> 4069
    //   4062: goto -> 4069
    //   4065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4068: athrow
    //   4069: aload #8
    //   4071: iconst_1
    //   4072: invokevirtual setAccessible : (Z)V
    //   4075: aload #8
    //   4077: aconst_null
    //   4078: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4081: pop
    //   4082: iinc #7, 1
    //   4085: iload_2
    //   4086: ifne -> 3947
    //   4089: sipush #16446
    //   4092: sipush #10134
    //   4095: invokestatic a : (II)Ljava/lang/String;
    //   4098: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4101: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4104: astore #5
    //   4106: aload #5
    //   4108: arraylength
    //   4109: istore #6
    //   4111: iconst_0
    //   4112: istore #7
    //   4114: iload #7
    //   4116: iload #6
    //   4118: if_icmpge -> 4255
    //   4121: aload #5
    //   4123: iload #7
    //   4125: aaload
    //   4126: astore #8
    //   4128: aload #8
    //   4130: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4133: pop
    //   4134: aload #8
    //   4136: invokevirtual getModifiers : ()I
    //   4139: invokestatic isStatic : (I)Z
    //   4142: ifeq -> 4241
    //   4145: aload #8
    //   4147: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4150: arraylength
    //   4151: iconst_2
    //   4152: if_icmpne -> 4241
    //   4155: goto -> 4162
    //   4158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4161: athrow
    //   4162: aload #8
    //   4164: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4167: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4170: if_acmpne -> 4241
    //   4173: goto -> 4180
    //   4176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4179: athrow
    //   4180: aload #8
    //   4182: iconst_1
    //   4183: invokevirtual setAccessible : (Z)V
    //   4186: aload #8
    //   4188: aconst_null
    //   4189: iconst_2
    //   4190: anewarray java/lang/Object
    //   4193: dup
    //   4194: iconst_0
    //   4195: aload_0
    //   4196: aastore
    //   4197: dup
    //   4198: iconst_1
    //   4199: aload_1
    //   4200: ifnonnull -> 4218
    //   4203: goto -> 4210
    //   4206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4209: athrow
    //   4210: aload_1
    //   4211: goto -> 4225
    //   4214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4217: athrow
    //   4218: aload_1
    //   4219: checkcast [B
    //   4222: invokevirtual clone : ()Ljava/lang/Object;
    //   4225: aastore
    //   4226: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4229: checkcast java/lang/Boolean
    //   4232: invokevirtual booleanValue : ()Z
    //   4235: istore #4
    //   4237: iload_2
    //   4238: ifne -> 4255
    //   4241: iinc #7, 1
    //   4244: iload_2
    //   4245: ifne -> 4114
    //   4248: goto -> 4255
    //   4251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4254: athrow
    //   4255: iload_2
    //   4256: ifne -> 4598
    //   4259: sipush #16419
    //   4262: sipush #-14241
    //   4265: invokestatic a : (II)Ljava/lang/String;
    //   4268: iconst_1
    //   4269: ldc burp/Zoa
    //   4271: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4274: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4277: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4280: astore #5
    //   4282: aload #5
    //   4284: arraylength
    //   4285: istore #6
    //   4287: iconst_0
    //   4288: istore #7
    //   4290: iload #7
    //   4292: iload #6
    //   4294: if_icmpge -> 4432
    //   4297: aload #5
    //   4299: iload #7
    //   4301: aaload
    //   4302: astore #8
    //   4304: aload #8
    //   4306: invokevirtual getModifiers : ()I
    //   4309: invokestatic isStatic : (I)Z
    //   4312: ifne -> 4322
    //   4315: goto -> 4425
    //   4318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4321: athrow
    //   4322: aload #8
    //   4324: invokevirtual getType : ()Ljava/lang/Class;
    //   4327: astore #9
    //   4329: aload #9
    //   4331: ifnull -> 4412
    //   4334: aload #9
    //   4336: invokevirtual isPrimitive : ()Z
    //   4339: ifne -> 4412
    //   4342: goto -> 4349
    //   4345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4348: athrow
    //   4349: aload #9
    //   4351: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4354: ifnull -> 4412
    //   4357: goto -> 4364
    //   4360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4363: athrow
    //   4364: aload #9
    //   4366: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4369: invokevirtual getName : ()Ljava/lang/String;
    //   4372: ifnull -> 4412
    //   4375: goto -> 4382
    //   4378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4381: athrow
    //   4382: aload #9
    //   4384: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4387: invokevirtual getName : ()Ljava/lang/String;
    //   4390: sipush #16424
    //   4393: sipush #-28230
    //   4396: invokestatic a : (II)Ljava/lang/String;
    //   4399: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4402: ifne -> 4412
    //   4405: goto -> 4412
    //   4408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4411: athrow
    //   4412: aload #8
    //   4414: iconst_1
    //   4415: invokevirtual setAccessible : (Z)V
    //   4418: aload #8
    //   4420: aconst_null
    //   4421: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4424: pop
    //   4425: iinc #7, 1
    //   4428: iload_2
    //   4429: ifne -> 4290
    //   4432: sipush #16437
    //   4435: sipush #19290
    //   4438: invokestatic a : (II)Ljava/lang/String;
    //   4441: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4444: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4447: astore #5
    //   4449: aload #5
    //   4451: arraylength
    //   4452: istore #6
    //   4454: iconst_0
    //   4455: istore #7
    //   4457: iload #7
    //   4459: iload #6
    //   4461: if_icmpge -> 4598
    //   4464: aload #5
    //   4466: iload #7
    //   4468: aaload
    //   4469: astore #8
    //   4471: aload #8
    //   4473: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4476: pop
    //   4477: aload #8
    //   4479: invokevirtual getModifiers : ()I
    //   4482: invokestatic isStatic : (I)Z
    //   4485: ifeq -> 4584
    //   4488: aload #8
    //   4490: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4493: arraylength
    //   4494: iconst_2
    //   4495: if_icmpne -> 4584
    //   4498: goto -> 4505
    //   4501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4504: athrow
    //   4505: aload #8
    //   4507: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4510: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4513: if_acmpne -> 4584
    //   4516: goto -> 4523
    //   4519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4522: athrow
    //   4523: aload #8
    //   4525: iconst_1
    //   4526: invokevirtual setAccessible : (Z)V
    //   4529: aload #8
    //   4531: aconst_null
    //   4532: iconst_2
    //   4533: anewarray java/lang/Object
    //   4536: dup
    //   4537: iconst_0
    //   4538: aload_0
    //   4539: aastore
    //   4540: dup
    //   4541: iconst_1
    //   4542: aload_1
    //   4543: ifnonnull -> 4561
    //   4546: goto -> 4553
    //   4549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4552: athrow
    //   4553: aload_1
    //   4554: goto -> 4568
    //   4557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4560: athrow
    //   4561: aload_1
    //   4562: checkcast [B
    //   4565: invokevirtual clone : ()Ljava/lang/Object;
    //   4568: aastore
    //   4569: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4572: checkcast java/lang/Boolean
    //   4575: invokevirtual booleanValue : ()Z
    //   4578: istore #4
    //   4580: iload_2
    //   4581: ifne -> 4598
    //   4584: iinc #7, 1
    //   4587: iload_2
    //   4588: ifne -> 4457
    //   4591: goto -> 4598
    //   4594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4597: athrow
    //   4598: iload #4
    //   4600: ifeq -> 4606
    //   4603: iload #4
    //   4605: ireturn
    //   4606: getstatic burp/Zmlr.ZJ : Ljava/lang/String;
    //   4609: getstatic burp/Ztq8.Zm : Ljava/lang/Object;
    //   4612: checkcast java/math/BigInteger
    //   4615: invokevirtual intValue : ()I
    //   4618: bipush #32
    //   4620: irem
    //   4621: invokestatic abs : (I)I
    //   4624: invokevirtual charAt : (I)C
    //   4627: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   4630: getstatic burp/Zea.ZO : Ljava/lang/Object;
    //   4633: checkcast java/math/BigInteger
    //   4636: invokevirtual intValue : ()I
    //   4639: bipush #32
    //   4641: irem
    //   4642: invokestatic abs : (I)I
    //   4645: invokevirtual charAt : (I)C
    //   4648: if_icmpgt -> 4994
    //   4651: sipush #16438
    //   4654: sipush #845
    //   4657: invokestatic a : (II)Ljava/lang/String;
    //   4660: iconst_1
    //   4661: ldc burp/Zm8i
    //   4663: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4666: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4669: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4672: astore #5
    //   4674: aload #5
    //   4676: arraylength
    //   4677: istore #6
    //   4679: iconst_0
    //   4680: istore #7
    //   4682: iload #7
    //   4684: iload #6
    //   4686: if_icmpge -> 4824
    //   4689: aload #5
    //   4691: iload #7
    //   4693: aaload
    //   4694: astore #8
    //   4696: aload #8
    //   4698: invokevirtual getModifiers : ()I
    //   4701: invokestatic isStatic : (I)Z
    //   4704: ifne -> 4714
    //   4707: goto -> 4817
    //   4710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4713: athrow
    //   4714: aload #8
    //   4716: invokevirtual getType : ()Ljava/lang/Class;
    //   4719: astore #9
    //   4721: aload #9
    //   4723: ifnull -> 4804
    //   4726: aload #9
    //   4728: invokevirtual isPrimitive : ()Z
    //   4731: ifne -> 4804
    //   4734: goto -> 4741
    //   4737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4740: athrow
    //   4741: aload #9
    //   4743: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4746: ifnull -> 4804
    //   4749: goto -> 4756
    //   4752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4755: athrow
    //   4756: aload #9
    //   4758: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4761: invokevirtual getName : ()Ljava/lang/String;
    //   4764: ifnull -> 4804
    //   4767: goto -> 4774
    //   4770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4773: athrow
    //   4774: aload #9
    //   4776: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4779: invokevirtual getName : ()Ljava/lang/String;
    //   4782: sipush #16424
    //   4785: sipush #-28230
    //   4788: invokestatic a : (II)Ljava/lang/String;
    //   4791: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4794: ifne -> 4804
    //   4797: goto -> 4804
    //   4800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4803: athrow
    //   4804: aload #8
    //   4806: iconst_1
    //   4807: invokevirtual setAccessible : (Z)V
    //   4810: aload #8
    //   4812: aconst_null
    //   4813: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4816: pop
    //   4817: iinc #7, 1
    //   4820: iload_2
    //   4821: ifne -> 4682
    //   4824: sipush #16430
    //   4827: sipush #25612
    //   4830: invokestatic a : (II)Ljava/lang/String;
    //   4833: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4836: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4839: astore #5
    //   4841: aload #5
    //   4843: arraylength
    //   4844: istore #6
    //   4846: iconst_0
    //   4847: istore #7
    //   4849: iload #7
    //   4851: iload #6
    //   4853: if_icmpge -> 4990
    //   4856: aload #5
    //   4858: iload #7
    //   4860: aaload
    //   4861: astore #8
    //   4863: aload #8
    //   4865: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4868: pop
    //   4869: aload #8
    //   4871: invokevirtual getModifiers : ()I
    //   4874: invokestatic isStatic : (I)Z
    //   4877: ifeq -> 4976
    //   4880: aload #8
    //   4882: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4885: arraylength
    //   4886: iconst_2
    //   4887: if_icmpne -> 4976
    //   4890: goto -> 4897
    //   4893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4896: athrow
    //   4897: aload #8
    //   4899: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4902: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4905: if_acmpne -> 4976
    //   4908: goto -> 4915
    //   4911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4914: athrow
    //   4915: aload #8
    //   4917: iconst_1
    //   4918: invokevirtual setAccessible : (Z)V
    //   4921: aload #8
    //   4923: aconst_null
    //   4924: iconst_2
    //   4925: anewarray java/lang/Object
    //   4928: dup
    //   4929: iconst_0
    //   4930: aload_0
    //   4931: aastore
    //   4932: dup
    //   4933: iconst_1
    //   4934: aload_1
    //   4935: ifnonnull -> 4953
    //   4938: goto -> 4945
    //   4941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4944: athrow
    //   4945: aload_1
    //   4946: goto -> 4960
    //   4949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4952: athrow
    //   4953: aload_1
    //   4954: checkcast [B
    //   4957: invokevirtual clone : ()Ljava/lang/Object;
    //   4960: aastore
    //   4961: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4964: checkcast java/lang/Boolean
    //   4967: invokevirtual booleanValue : ()Z
    //   4970: istore #4
    //   4972: iload_2
    //   4973: ifne -> 4990
    //   4976: iinc #7, 1
    //   4979: iload_2
    //   4980: ifne -> 4849
    //   4983: goto -> 4990
    //   4986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4989: athrow
    //   4990: iload_2
    //   4991: ifne -> 5333
    //   4994: sipush #16426
    //   4997: sipush #29114
    //   5000: invokestatic a : (II)Ljava/lang/String;
    //   5003: iconst_1
    //   5004: ldc burp/Zs56
    //   5006: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5009: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5012: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5015: astore #5
    //   5017: aload #5
    //   5019: arraylength
    //   5020: istore #6
    //   5022: iconst_0
    //   5023: istore #7
    //   5025: iload #7
    //   5027: iload #6
    //   5029: if_icmpge -> 5167
    //   5032: aload #5
    //   5034: iload #7
    //   5036: aaload
    //   5037: astore #8
    //   5039: aload #8
    //   5041: invokevirtual getModifiers : ()I
    //   5044: invokestatic isStatic : (I)Z
    //   5047: ifne -> 5057
    //   5050: goto -> 5160
    //   5053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5056: athrow
    //   5057: aload #8
    //   5059: invokevirtual getType : ()Ljava/lang/Class;
    //   5062: astore #9
    //   5064: aload #9
    //   5066: ifnull -> 5147
    //   5069: aload #9
    //   5071: invokevirtual isPrimitive : ()Z
    //   5074: ifne -> 5147
    //   5077: goto -> 5084
    //   5080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5083: athrow
    //   5084: aload #9
    //   5086: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5089: ifnull -> 5147
    //   5092: goto -> 5099
    //   5095: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5098: athrow
    //   5099: aload #9
    //   5101: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5104: invokevirtual getName : ()Ljava/lang/String;
    //   5107: ifnull -> 5147
    //   5110: goto -> 5117
    //   5113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5116: athrow
    //   5117: aload #9
    //   5119: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5122: invokevirtual getName : ()Ljava/lang/String;
    //   5125: sipush #16424
    //   5128: sipush #-28230
    //   5131: invokestatic a : (II)Ljava/lang/String;
    //   5134: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5137: ifne -> 5147
    //   5140: goto -> 5147
    //   5143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5146: athrow
    //   5147: aload #8
    //   5149: iconst_1
    //   5150: invokevirtual setAccessible : (Z)V
    //   5153: aload #8
    //   5155: aconst_null
    //   5156: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5159: pop
    //   5160: iinc #7, 1
    //   5163: iload_2
    //   5164: ifne -> 5025
    //   5167: sipush #16421
    //   5170: sipush #-8282
    //   5173: invokestatic a : (II)Ljava/lang/String;
    //   5176: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5179: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5182: astore #5
    //   5184: aload #5
    //   5186: arraylength
    //   5187: istore #6
    //   5189: iconst_0
    //   5190: istore #7
    //   5192: iload #7
    //   5194: iload #6
    //   5196: if_icmpge -> 5333
    //   5199: aload #5
    //   5201: iload #7
    //   5203: aaload
    //   5204: astore #8
    //   5206: aload #8
    //   5208: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5211: pop
    //   5212: aload #8
    //   5214: invokevirtual getModifiers : ()I
    //   5217: invokestatic isStatic : (I)Z
    //   5220: ifeq -> 5319
    //   5223: aload #8
    //   5225: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5228: arraylength
    //   5229: iconst_2
    //   5230: if_icmpne -> 5319
    //   5233: goto -> 5240
    //   5236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5239: athrow
    //   5240: aload #8
    //   5242: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5245: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5248: if_acmpne -> 5319
    //   5251: goto -> 5258
    //   5254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5257: athrow
    //   5258: aload #8
    //   5260: iconst_1
    //   5261: invokevirtual setAccessible : (Z)V
    //   5264: aload #8
    //   5266: aconst_null
    //   5267: iconst_2
    //   5268: anewarray java/lang/Object
    //   5271: dup
    //   5272: iconst_0
    //   5273: aload_0
    //   5274: aastore
    //   5275: dup
    //   5276: iconst_1
    //   5277: aload_1
    //   5278: ifnonnull -> 5296
    //   5281: goto -> 5288
    //   5284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5287: athrow
    //   5288: aload_1
    //   5289: goto -> 5303
    //   5292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5295: athrow
    //   5296: aload_1
    //   5297: checkcast [B
    //   5300: invokevirtual clone : ()Ljava/lang/Object;
    //   5303: aastore
    //   5304: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5307: checkcast java/lang/Boolean
    //   5310: invokevirtual booleanValue : ()Z
    //   5313: istore #4
    //   5315: iload_2
    //   5316: ifne -> 5333
    //   5319: iinc #7, 1
    //   5322: iload_2
    //   5323: ifne -> 5192
    //   5326: goto -> 5333
    //   5329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5332: athrow
    //   5333: iload #4
    //   5335: ireturn
    //   5336: astore_3
    //   5337: new java/lang/Exception
    //   5340: dup
    //   5341: aload_3
    //   5342: invokevirtual getMessage : ()Ljava/lang/String;
    //   5345: invokespecial <init> : (Ljava/lang/String;)V
    //   5348: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3135	5336	java/lang/Throwable
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
    //   1731	2081	2084	java/lang/Throwable
    //   1915	1925	1925	java/lang/Throwable
    //   1929	1941	1941	java/lang/Throwable
    //   1945	1957	1957	java/lang/Throwable
    //   1961	1974	1974	java/lang/Throwable
    //   1978	1991	1991	java/lang/Throwable
    //   2131	2145	2145	java/lang/Throwable
    //   2156	2169	2172	java/lang/Throwable
    //   2161	2184	2187	java/lang/Throwable
    //   2176	2202	2205	java/lang/Throwable
    //   2191	2232	2235	java/lang/Throwable
    //   2297	2324	2327	java/lang/Throwable
    //   2314	2342	2345	java/lang/Throwable
    //   2331	2378	2381	java/lang/Throwable
    //   2349	2392	2395	java/lang/Throwable
    //   2492	2506	2506	java/lang/Throwable
    //   2517	2530	2533	java/lang/Throwable
    //   2522	2545	2548	java/lang/Throwable
    //   2537	2563	2566	java/lang/Throwable
    //   2552	2593	2596	java/lang/Throwable
    //   2659	2686	2689	java/lang/Throwable
    //   2676	2704	2707	java/lang/Throwable
    //   2693	2734	2737	java/lang/Throwable
    //   2711	2745	2745	java/lang/Throwable
    //   2768	2779	2782	java/lang/Throwable
    //   2834	2848	2848	java/lang/Throwable
    //   2859	2872	2875	java/lang/Throwable
    //   2864	2887	2890	java/lang/Throwable
    //   2879	2905	2908	java/lang/Throwable
    //   2894	2935	2938	java/lang/Throwable
    //   3001	3028	3031	java/lang/Throwable
    //   3018	3046	3049	java/lang/Throwable
    //   3035	3076	3079	java/lang/Throwable
    //   3053	3087	3087	java/lang/Throwable
    //   3110	3121	3124	java/lang/Throwable
    //   3136	3870	5336	java/lang/Throwable
    //   3226	3240	3240	java/lang/Throwable
    //   3251	3264	3267	java/lang/Throwable
    //   3256	3279	3282	java/lang/Throwable
    //   3271	3297	3300	java/lang/Throwable
    //   3286	3327	3330	java/lang/Throwable
    //   3393	3420	3423	java/lang/Throwable
    //   3410	3438	3441	java/lang/Throwable
    //   3427	3468	3471	java/lang/Throwable
    //   3445	3479	3479	java/lang/Throwable
    //   3502	3513	3516	java/lang/Throwable
    //   3569	3583	3583	java/lang/Throwable
    //   3594	3607	3610	java/lang/Throwable
    //   3599	3622	3625	java/lang/Throwable
    //   3614	3640	3643	java/lang/Throwable
    //   3629	3670	3673	java/lang/Throwable
    //   3736	3763	3766	java/lang/Throwable
    //   3753	3781	3784	java/lang/Throwable
    //   3770	3811	3814	java/lang/Throwable
    //   3788	3822	3822	java/lang/Throwable
    //   3845	3856	3859	java/lang/Throwable
    //   3871	4605	5336	java/lang/Throwable
    //   3961	3975	3975	java/lang/Throwable
    //   3986	3999	4002	java/lang/Throwable
    //   3991	4014	4017	java/lang/Throwable
    //   4006	4032	4035	java/lang/Throwable
    //   4021	4062	4065	java/lang/Throwable
    //   4128	4155	4158	java/lang/Throwable
    //   4145	4173	4176	java/lang/Throwable
    //   4162	4203	4206	java/lang/Throwable
    //   4180	4214	4214	java/lang/Throwable
    //   4237	4248	4251	java/lang/Throwable
    //   4304	4318	4318	java/lang/Throwable
    //   4329	4342	4345	java/lang/Throwable
    //   4334	4357	4360	java/lang/Throwable
    //   4349	4375	4378	java/lang/Throwable
    //   4364	4405	4408	java/lang/Throwable
    //   4471	4498	4501	java/lang/Throwable
    //   4488	4516	4519	java/lang/Throwable
    //   4505	4546	4549	java/lang/Throwable
    //   4523	4557	4557	java/lang/Throwable
    //   4580	4591	4594	java/lang/Throwable
    //   4606	5335	5336	java/lang/Throwable
    //   4696	4710	4710	java/lang/Throwable
    //   4721	4734	4737	java/lang/Throwable
    //   4726	4749	4752	java/lang/Throwable
    //   4741	4767	4770	java/lang/Throwable
    //   4756	4797	4800	java/lang/Throwable
    //   4863	4890	4893	java/lang/Throwable
    //   4880	4908	4911	java/lang/Throwable
    //   4897	4938	4941	java/lang/Throwable
    //   4915	4949	4949	java/lang/Throwable
    //   4972	4983	4986	java/lang/Throwable
    //   5039	5053	5053	java/lang/Throwable
    //   5064	5077	5080	java/lang/Throwable
    //   5069	5092	5095	java/lang/Throwable
    //   5084	5110	5113	java/lang/Throwable
    //   5099	5140	5143	java/lang/Throwable
    //   5206	5233	5236	java/lang/Throwable
    //   5223	5251	5254	java/lang/Throwable
    //   5240	5281	5284	java/lang/Throwable
    //   5258	5292	5292	java/lang/Throwable
    //   5315	5326	5329	java/lang/Throwable
  }
  
  static void Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'IÜ!û¾Ó>\\tËBÛñá9\\tM0r÷ûÞÜÉ÷B-ÍÀÉ·l;©^w\\f§3'MwÔWÀaôVÂ·[²1;Ø¶ªõîÇGP«¶ýÁ À*Ä°A×|Õ\\t1#Ó÷d÷Ó¡\\tMU\9ë½Éèb\\tÚÇÈ 3© Rü^{TÎ"a`ÜùoôEþ<I6\\t¡HÁXÉ§wõ\\tD­}&Ï^U«\\t·l Y³iDM}:\\tdyOD²\\tþ¦*G%r\\tw;ôÍÅÚ\\tÒÉÒ£î+èKÒ±a0²3£õ\\t+Õ)r¿éùR\\bDñè»ù\\tÁ«òïä¹\\tß)¶¡LËA È¼Õß\\táöØ@ÔËHÅ?79íÏa²¯1&Ùm!\\t£ÈPË¹:\\tO^XãÎ7A\\bÊGÊÃ´=\\b®  d)\\t¬Õ`)l¿?ø+ O²K>ÑkH\ÍàÖRÆC\»Ó })x}AË¸\Y=Nò'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #71
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
    //   68: ldc 'ÏXúâ@/\\t\\r&LOñk1'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #21
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
    //   129: putstatic burp/Zegj.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zegj.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #74
    //   214: goto -> 243
    //   217: bipush #125
    //   219: goto -> 243
    //   222: bipush #79
    //   224: goto -> 243
    //   227: bipush #56
    //   229: goto -> 243
    //   232: bipush #52
    //   234: goto -> 243
    //   237: bipush #22
    //   239: goto -> 243
    //   242: iconst_2
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #53
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-123
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #105
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #72
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-101
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-92
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #87
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #119
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #26
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-125
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-37
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #92
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-35
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-114
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #105
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #44
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-74
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #102
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-69
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-51
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-40
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #108
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #6
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-46
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #13
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #16
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #20
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-93
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #50
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #43
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-29
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #6
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zegj.ZT : Ljava/lang/Object;
    //   500: sipush #16441
    //   503: sipush #-25739
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zegj.ZS : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4022) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */