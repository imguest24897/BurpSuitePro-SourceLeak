package burp;

import java.math.BigInteger;

class Zzr5 extends ClassLoader {
  static Object Za;
  
  static String Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZR(Object paramObject) {
    Zlrm.Zt = a(3958, -4347);
    Zlrm.ZM = new BigInteger(a(3939, 4468));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zeqg.Zh.charAt(Math.abs(((BigInteger)Zxzz.ZM).intValue() % 32)) > Ze82.Zx.charAt(Math.abs(((BigInteger)Zzmu.Zy).intValue() % 32))) {
          try {
            Ztpg.Zx(Class.forName(a(3941, 29486)));
            if (bool)
              Zm6h.ZB(Class.forName(a(3956, -32032))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zm6h.ZB(Class.forName(a(3956, -32032)));
    } catch (Throwable throwable) {}
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zb(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrof.ZB : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zm6h.ZB : Ljava/lang/Object;
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
    //   185: getstatic burp/Zex.Zn : Ljava/lang/String;
    //   188: getstatic burp/Zg4k.ZE : Ljava/lang/Object;
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
    //   222: getstatic burp/Ztdd.ZA : Ljava/lang/String;
    //   225: getstatic burp/Zsqy.ZV : Ljava/lang/Object;
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
    //   259: getstatic burp/Ze8m.Zx : Ljava/lang/String;
    //   262: getstatic burp/Zgq_.ZM : Ljava/lang/Object;
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
    //   296: getstatic burp/Zxe.ZD : Ljava/lang/String;
    //   299: getstatic burp/Ze6d.Zw : Ljava/lang/Object;
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
    //   333: getstatic burp/Ztlz.ZE : Ljava/lang/String;
    //   336: getstatic burp/Zt98.Zz : Ljava/lang/Object;
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
    //   370: getstatic burp/Zbzk.ZS : Ljava/lang/String;
    //   373: getstatic burp/Zevr.ZG : Ljava/lang/Object;
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
    //   407: getstatic burp/Zg_5.ZG : Ljava/lang/String;
    //   410: getstatic burp/Zs8s.ZG : Ljava/lang/Object;
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
    //   444: getstatic burp/Ztdd.ZA : Ljava/lang/String;
    //   447: getstatic burp/Zlck.Zr : Ljava/lang/Object;
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
    //   481: getstatic burp/Zl06.ZL : Ljava/lang/String;
    //   484: getstatic burp/Zkjr.Zw : Ljava/lang/Object;
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
    //   518: getstatic burp/Zmj8.ZL : Ljava/lang/String;
    //   521: getstatic burp/Zm8w.Zz : Ljava/lang/Object;
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
    //   555: getstatic burp/Zm4i.Zl : Ljava/lang/String;
    //   558: getstatic burp/Zkt7.ZY : Ljava/lang/Object;
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
    //   592: getstatic burp/Zz0w.ZO : Ljava/lang/String;
    //   595: getstatic burp/Zsbt.Zl : Ljava/lang/Object;
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
    //   629: getstatic burp/Zrjg.Zl : Ljava/lang/String;
    //   632: getstatic burp/Zt3f.Zp : Ljava/lang/Object;
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
    //   666: getstatic burp/Zera.Zn : Ljava/lang/String;
    //   669: getstatic burp/Ze69.ZH : Ljava/lang/Object;
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
    //   703: getstatic burp/Zt5j.ZR : Ljava/lang/String;
    //   706: getstatic burp/Zxzz.ZM : Ljava/lang/Object;
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
    //   740: getstatic burp/Zz2e.ZS : Ljava/lang/String;
    //   743: getstatic burp/Zzmw.ZS : Ljava/lang/Object;
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
    //   777: getstatic burp/Zzgh.Zn : Ljava/lang/String;
    //   780: getstatic burp/Ze69.ZH : Ljava/lang/Object;
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
    //   814: getstatic burp/Zeoy.ZS : Ljava/lang/String;
    //   817: getstatic burp/Zix.ZO : Ljava/lang/Object;
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
    //   851: getstatic burp/Zs34.Zq : Ljava/lang/String;
    //   854: getstatic burp/Zk12.Zh : Ljava/lang/Object;
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
    //   888: getstatic burp/Zex.Zn : Ljava/lang/String;
    //   891: getstatic burp/Zg4w.ZR : Ljava/lang/Object;
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
    //   925: getstatic burp/Zmhi.ZQ : Ljava/lang/String;
    //   928: getstatic burp/Zt3f.Zp : Ljava/lang/Object;
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
    //   962: getstatic burp/Zk7e.ZP : Ljava/lang/String;
    //   965: getstatic burp/Zkm0.ZI : Ljava/lang/Object;
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
    //   999: getstatic burp/Zs4z.Zs : Ljava/lang/String;
    //   1002: getstatic burp/Zeqg.Zm : Ljava/lang/Object;
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
    //   1036: getstatic burp/Zm8v.Zl : Ljava/lang/String;
    //   1039: getstatic burp/Ztye.ZK : Ljava/lang/Object;
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
    //   1073: getstatic burp/Zzox.ZB : Ljava/lang/String;
    //   1076: getstatic burp/Zm8v.ZU : Ljava/lang/Object;
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
    //   1110: getstatic burp/Zxjk.Za : Ljava/lang/String;
    //   1113: getstatic burp/Zke7.Zj : Ljava/lang/Object;
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
    //   1147: getstatic burp/Zstb.Zd : Ljava/lang/String;
    //   1150: getstatic burp/Zlf0.ZC : Ljava/lang/Object;
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
    //   1184: getstatic burp/Zm7x.ZP : Ljava/lang/String;
    //   1187: getstatic burp/Zlx5.Zp : Ljava/lang/Object;
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
    //   1221: getstatic burp/Zlpj.Zj : Ljava/lang/String;
    //   1224: getstatic burp/Zs_3.ZZ : Ljava/lang/Object;
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
    //   1258: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   1261: getstatic burp/Ztye.ZK : Ljava/lang/Object;
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
    //   1295: getstatic burp/Zkc8.Za : Ljava/lang/String;
    //   1298: getstatic burp/Zl06.Zw : Ljava/lang/Object;
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
    //   1332: getstatic burp/Zest.Zd : Ljava/lang/String;
    //   1335: getstatic burp/Zlh8.Zm : Ljava/lang/Object;
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
    //   1375: putstatic burp/Zt98.Zh : Ljava/lang/String;
    //   1378: sipush #3951
    //   1381: sipush #-16174
    //   1384: invokestatic a : (II)Ljava/lang/String;
    //   1387: iconst_1
    //   1388: ldc burp/Zb9h
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
    //   1509: sipush #3953
    //   1512: sipush #-25212
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
    //   1551: sipush #3962
    //   1554: sipush #6964
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
    //   1713: iconst_0
    //   1714: istore #4
    //   1716: getstatic burp/Zs_v.Zn : Ljava/lang/String;
    //   1719: getstatic burp/Zex.ZO : Ljava/lang/Object;
    //   1722: checkcast java/math/BigInteger
    //   1725: invokevirtual intValue : ()I
    //   1728: bipush #32
    //   1730: irem
    //   1731: invokestatic abs : (I)I
    //   1734: invokevirtual charAt : (I)C
    //   1737: getstatic burp/Zm52.Ze : Ljava/lang/String;
    //   1740: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   1743: checkcast java/math/BigInteger
    //   1746: invokevirtual intValue : ()I
    //   1749: bipush #32
    //   1751: irem
    //   1752: invokestatic abs : (I)I
    //   1755: invokevirtual charAt : (I)C
    //   1758: if_icmple -> 2103
    //   1761: sipush #3944
    //   1764: sipush #4995
    //   1767: invokestatic a : (II)Ljava/lang/String;
    //   1770: iconst_1
    //   1771: ldc burp/Zlfi
    //   1773: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1776: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1779: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1782: astore #5
    //   1784: aload #5
    //   1786: arraylength
    //   1787: istore #6
    //   1789: iconst_0
    //   1790: istore #7
    //   1792: iload #7
    //   1794: iload #6
    //   1796: if_icmpge -> 1934
    //   1799: aload #5
    //   1801: iload #7
    //   1803: aaload
    //   1804: astore #8
    //   1806: aload #8
    //   1808: invokevirtual getModifiers : ()I
    //   1811: invokestatic isStatic : (I)Z
    //   1814: ifne -> 1824
    //   1817: goto -> 1927
    //   1820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1823: athrow
    //   1824: aload #8
    //   1826: invokevirtual getType : ()Ljava/lang/Class;
    //   1829: astore #9
    //   1831: aload #9
    //   1833: ifnull -> 1914
    //   1836: aload #9
    //   1838: invokevirtual isPrimitive : ()Z
    //   1841: ifne -> 1914
    //   1844: goto -> 1851
    //   1847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1850: athrow
    //   1851: aload #9
    //   1853: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1856: ifnull -> 1914
    //   1859: goto -> 1866
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: aload #9
    //   1868: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1871: invokevirtual getName : ()Ljava/lang/String;
    //   1874: ifnull -> 1914
    //   1877: goto -> 1884
    //   1880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1883: athrow
    //   1884: aload #9
    //   1886: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1889: invokevirtual getName : ()Ljava/lang/String;
    //   1892: sipush #3959
    //   1895: sipush #14794
    //   1898: invokestatic a : (II)Ljava/lang/String;
    //   1901: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1904: ifne -> 1914
    //   1907: goto -> 1914
    //   1910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1913: athrow
    //   1914: aload #8
    //   1916: iconst_1
    //   1917: invokevirtual setAccessible : (Z)V
    //   1920: aload #8
    //   1922: aconst_null
    //   1923: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1926: pop
    //   1927: iinc #7, 1
    //   1930: iload_2
    //   1931: ifeq -> 1792
    //   1934: sipush #3936
    //   1937: sipush #-825
    //   1940: invokestatic a : (II)Ljava/lang/String;
    //   1943: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1946: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1949: astore #5
    //   1951: aload #5
    //   1953: arraylength
    //   1954: istore #6
    //   1956: iconst_0
    //   1957: istore #7
    //   1959: iload #7
    //   1961: iload #6
    //   1963: if_icmpge -> 2100
    //   1966: aload #5
    //   1968: iload #7
    //   1970: aaload
    //   1971: astore #8
    //   1973: aload #8
    //   1975: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1978: pop
    //   1979: aload #8
    //   1981: invokevirtual getModifiers : ()I
    //   1984: invokestatic isStatic : (I)Z
    //   1987: ifeq -> 2086
    //   1990: aload #8
    //   1992: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1995: arraylength
    //   1996: iconst_2
    //   1997: if_icmpne -> 2086
    //   2000: goto -> 2007
    //   2003: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2006: athrow
    //   2007: aload #8
    //   2009: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2012: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2015: if_acmpne -> 2086
    //   2018: goto -> 2025
    //   2021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2024: athrow
    //   2025: aload #8
    //   2027: iconst_1
    //   2028: invokevirtual setAccessible : (Z)V
    //   2031: aload #8
    //   2033: aconst_null
    //   2034: iconst_2
    //   2035: anewarray java/lang/Object
    //   2038: dup
    //   2039: iconst_0
    //   2040: aload_0
    //   2041: aastore
    //   2042: dup
    //   2043: iconst_1
    //   2044: aload_1
    //   2045: ifnonnull -> 2063
    //   2048: goto -> 2055
    //   2051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2054: athrow
    //   2055: aload_1
    //   2056: goto -> 2070
    //   2059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2062: athrow
    //   2063: aload_1
    //   2064: checkcast [B
    //   2067: invokevirtual clone : ()Ljava/lang/Object;
    //   2070: aastore
    //   2071: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2074: checkcast java/lang/Boolean
    //   2077: invokevirtual booleanValue : ()Z
    //   2080: istore #4
    //   2082: iload_2
    //   2083: ifeq -> 2100
    //   2086: iinc #7, 1
    //   2089: iload_2
    //   2090: ifeq -> 1959
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2099: athrow
    //   2100: goto -> 2442
    //   2103: sipush #3967
    //   2106: sipush #-6121
    //   2109: invokestatic a : (II)Ljava/lang/String;
    //   2112: iconst_1
    //   2113: ldc burp/Zty4
    //   2115: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2118: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2121: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2124: astore #5
    //   2126: aload #5
    //   2128: arraylength
    //   2129: istore #6
    //   2131: iconst_0
    //   2132: istore #7
    //   2134: iload #7
    //   2136: iload #6
    //   2138: if_icmpge -> 2276
    //   2141: aload #5
    //   2143: iload #7
    //   2145: aaload
    //   2146: astore #8
    //   2148: aload #8
    //   2150: invokevirtual getModifiers : ()I
    //   2153: invokestatic isStatic : (I)Z
    //   2156: ifne -> 2166
    //   2159: goto -> 2269
    //   2162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2165: athrow
    //   2166: aload #8
    //   2168: invokevirtual getType : ()Ljava/lang/Class;
    //   2171: astore #9
    //   2173: aload #9
    //   2175: ifnull -> 2256
    //   2178: aload #9
    //   2180: invokevirtual isPrimitive : ()Z
    //   2183: ifne -> 2256
    //   2186: goto -> 2193
    //   2189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2192: athrow
    //   2193: aload #9
    //   2195: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2198: ifnull -> 2256
    //   2201: goto -> 2208
    //   2204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2207: athrow
    //   2208: aload #9
    //   2210: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2213: invokevirtual getName : ()Ljava/lang/String;
    //   2216: ifnull -> 2256
    //   2219: goto -> 2226
    //   2222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2225: athrow
    //   2226: aload #9
    //   2228: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2231: invokevirtual getName : ()Ljava/lang/String;
    //   2234: sipush #3959
    //   2237: sipush #14794
    //   2240: invokestatic a : (II)Ljava/lang/String;
    //   2243: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2246: ifne -> 2256
    //   2249: goto -> 2256
    //   2252: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2255: athrow
    //   2256: aload #8
    //   2258: iconst_1
    //   2259: invokevirtual setAccessible : (Z)V
    //   2262: aload #8
    //   2264: aconst_null
    //   2265: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2268: pop
    //   2269: iinc #7, 1
    //   2272: iload_2
    //   2273: ifeq -> 2134
    //   2276: sipush #3961
    //   2279: sipush #-17906
    //   2282: invokestatic a : (II)Ljava/lang/String;
    //   2285: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2288: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2291: astore #5
    //   2293: aload #5
    //   2295: arraylength
    //   2296: istore #6
    //   2298: iconst_0
    //   2299: istore #7
    //   2301: iload #7
    //   2303: iload #6
    //   2305: if_icmpge -> 2442
    //   2308: aload #5
    //   2310: iload #7
    //   2312: aaload
    //   2313: astore #8
    //   2315: aload #8
    //   2317: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2320: pop
    //   2321: aload #8
    //   2323: invokevirtual getModifiers : ()I
    //   2326: invokestatic isStatic : (I)Z
    //   2329: ifeq -> 2428
    //   2332: aload #8
    //   2334: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2337: arraylength
    //   2338: iconst_2
    //   2339: if_icmpne -> 2428
    //   2342: goto -> 2349
    //   2345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2348: athrow
    //   2349: aload #8
    //   2351: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2354: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2357: if_acmpne -> 2428
    //   2360: goto -> 2367
    //   2363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2366: athrow
    //   2367: aload #8
    //   2369: iconst_1
    //   2370: invokevirtual setAccessible : (Z)V
    //   2373: aload #8
    //   2375: aconst_null
    //   2376: iconst_2
    //   2377: anewarray java/lang/Object
    //   2380: dup
    //   2381: iconst_0
    //   2382: aload_0
    //   2383: aastore
    //   2384: dup
    //   2385: iconst_1
    //   2386: aload_1
    //   2387: ifnonnull -> 2405
    //   2390: goto -> 2397
    //   2393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2396: athrow
    //   2397: aload_1
    //   2398: goto -> 2412
    //   2401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2404: athrow
    //   2405: aload_1
    //   2406: checkcast [B
    //   2409: invokevirtual clone : ()Ljava/lang/Object;
    //   2412: aastore
    //   2413: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2416: checkcast java/lang/Boolean
    //   2419: invokevirtual booleanValue : ()Z
    //   2422: istore #4
    //   2424: iload_2
    //   2425: ifeq -> 2442
    //   2428: iinc #7, 1
    //   2431: iload_2
    //   2432: ifeq -> 2301
    //   2435: goto -> 2442
    //   2438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2441: athrow
    //   2442: iload #4
    //   2444: ifeq -> 2450
    //   2447: iload #4
    //   2449: ireturn
    //   2450: getstatic burp/Zlpj.Zj : Ljava/lang/String;
    //   2453: getstatic burp/Zz0w.ZF : Ljava/lang/Object;
    //   2456: checkcast java/math/BigInteger
    //   2459: invokevirtual intValue : ()I
    //   2462: bipush #32
    //   2464: irem
    //   2465: invokestatic abs : (I)I
    //   2468: invokevirtual charAt : (I)C
    //   2471: getstatic burp/Zlhy.ZS : Ljava/lang/String;
    //   2474: getstatic burp/Zrjg.ZG : Ljava/lang/Object;
    //   2477: checkcast java/math/BigInteger
    //   2480: invokevirtual intValue : ()I
    //   2483: bipush #32
    //   2485: irem
    //   2486: invokestatic abs : (I)I
    //   2489: invokevirtual charAt : (I)C
    //   2492: if_icmpgt -> 2838
    //   2495: sipush #3937
    //   2498: sipush #24555
    //   2501: invokestatic a : (II)Ljava/lang/String;
    //   2504: iconst_1
    //   2505: ldc burp/Zsej
    //   2507: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2510: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2513: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2516: astore #5
    //   2518: aload #5
    //   2520: arraylength
    //   2521: istore #6
    //   2523: iconst_0
    //   2524: istore #7
    //   2526: iload #7
    //   2528: iload #6
    //   2530: if_icmpge -> 2668
    //   2533: aload #5
    //   2535: iload #7
    //   2537: aaload
    //   2538: astore #8
    //   2540: aload #8
    //   2542: invokevirtual getModifiers : ()I
    //   2545: invokestatic isStatic : (I)Z
    //   2548: ifne -> 2558
    //   2551: goto -> 2661
    //   2554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2557: athrow
    //   2558: aload #8
    //   2560: invokevirtual getType : ()Ljava/lang/Class;
    //   2563: astore #9
    //   2565: aload #9
    //   2567: ifnull -> 2648
    //   2570: aload #9
    //   2572: invokevirtual isPrimitive : ()Z
    //   2575: ifne -> 2648
    //   2578: goto -> 2585
    //   2581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2584: athrow
    //   2585: aload #9
    //   2587: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2590: ifnull -> 2648
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #9
    //   2602: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2605: invokevirtual getName : ()Ljava/lang/String;
    //   2608: ifnull -> 2648
    //   2611: goto -> 2618
    //   2614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2617: athrow
    //   2618: aload #9
    //   2620: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2623: invokevirtual getName : ()Ljava/lang/String;
    //   2626: sipush #3959
    //   2629: sipush #14794
    //   2632: invokestatic a : (II)Ljava/lang/String;
    //   2635: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2638: ifne -> 2648
    //   2641: goto -> 2648
    //   2644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2647: athrow
    //   2648: aload #8
    //   2650: iconst_1
    //   2651: invokevirtual setAccessible : (Z)V
    //   2654: aload #8
    //   2656: aconst_null
    //   2657: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2660: pop
    //   2661: iinc #7, 1
    //   2664: iload_2
    //   2665: ifeq -> 2526
    //   2668: sipush #3952
    //   2671: sipush #31455
    //   2674: invokestatic a : (II)Ljava/lang/String;
    //   2677: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2680: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2683: astore #5
    //   2685: aload #5
    //   2687: arraylength
    //   2688: istore #6
    //   2690: iconst_0
    //   2691: istore #7
    //   2693: iload #7
    //   2695: iload #6
    //   2697: if_icmpge -> 2834
    //   2700: aload #5
    //   2702: iload #7
    //   2704: aaload
    //   2705: astore #8
    //   2707: aload #8
    //   2709: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2712: pop
    //   2713: aload #8
    //   2715: invokevirtual getModifiers : ()I
    //   2718: invokestatic isStatic : (I)Z
    //   2721: ifeq -> 2820
    //   2724: aload #8
    //   2726: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2729: arraylength
    //   2730: iconst_2
    //   2731: if_icmpne -> 2820
    //   2734: goto -> 2741
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload #8
    //   2743: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2746: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2749: if_acmpne -> 2820
    //   2752: goto -> 2759
    //   2755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2758: athrow
    //   2759: aload #8
    //   2761: iconst_1
    //   2762: invokevirtual setAccessible : (Z)V
    //   2765: aload #8
    //   2767: aconst_null
    //   2768: iconst_2
    //   2769: anewarray java/lang/Object
    //   2772: dup
    //   2773: iconst_0
    //   2774: aload_0
    //   2775: aastore
    //   2776: dup
    //   2777: iconst_1
    //   2778: aload_1
    //   2779: ifnonnull -> 2797
    //   2782: goto -> 2789
    //   2785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2788: athrow
    //   2789: aload_1
    //   2790: goto -> 2804
    //   2793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2796: athrow
    //   2797: aload_1
    //   2798: checkcast [B
    //   2801: invokevirtual clone : ()Ljava/lang/Object;
    //   2804: aastore
    //   2805: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2808: checkcast java/lang/Boolean
    //   2811: invokevirtual booleanValue : ()Z
    //   2814: istore #4
    //   2816: iload_2
    //   2817: ifeq -> 2834
    //   2820: iinc #7, 1
    //   2823: iload_2
    //   2824: ifeq -> 2693
    //   2827: goto -> 2834
    //   2830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2833: athrow
    //   2834: iload_2
    //   2835: ifeq -> 3177
    //   2838: sipush #3938
    //   2841: sipush #-17010
    //   2844: invokestatic a : (II)Ljava/lang/String;
    //   2847: iconst_1
    //   2848: ldc burp/Zeoa
    //   2850: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2853: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2856: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2859: astore #5
    //   2861: aload #5
    //   2863: arraylength
    //   2864: istore #6
    //   2866: iconst_0
    //   2867: istore #7
    //   2869: iload #7
    //   2871: iload #6
    //   2873: if_icmpge -> 3011
    //   2876: aload #5
    //   2878: iload #7
    //   2880: aaload
    //   2881: astore #8
    //   2883: aload #8
    //   2885: invokevirtual getModifiers : ()I
    //   2888: invokestatic isStatic : (I)Z
    //   2891: ifne -> 2901
    //   2894: goto -> 3004
    //   2897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2900: athrow
    //   2901: aload #8
    //   2903: invokevirtual getType : ()Ljava/lang/Class;
    //   2906: astore #9
    //   2908: aload #9
    //   2910: ifnull -> 2991
    //   2913: aload #9
    //   2915: invokevirtual isPrimitive : ()Z
    //   2918: ifne -> 2991
    //   2921: goto -> 2928
    //   2924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2927: athrow
    //   2928: aload #9
    //   2930: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2933: ifnull -> 2991
    //   2936: goto -> 2943
    //   2939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2942: athrow
    //   2943: aload #9
    //   2945: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2948: invokevirtual getName : ()Ljava/lang/String;
    //   2951: ifnull -> 2991
    //   2954: goto -> 2961
    //   2957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2960: athrow
    //   2961: aload #9
    //   2963: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2966: invokevirtual getName : ()Ljava/lang/String;
    //   2969: sipush #3959
    //   2972: sipush #14794
    //   2975: invokestatic a : (II)Ljava/lang/String;
    //   2978: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2981: ifne -> 2991
    //   2984: goto -> 2991
    //   2987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2990: athrow
    //   2991: aload #8
    //   2993: iconst_1
    //   2994: invokevirtual setAccessible : (Z)V
    //   2997: aload #8
    //   2999: aconst_null
    //   3000: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3003: pop
    //   3004: iinc #7, 1
    //   3007: iload_2
    //   3008: ifeq -> 2869
    //   3011: sipush #3943
    //   3014: sipush #-16783
    //   3017: invokestatic a : (II)Ljava/lang/String;
    //   3020: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3023: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3026: astore #5
    //   3028: aload #5
    //   3030: arraylength
    //   3031: istore #6
    //   3033: iconst_0
    //   3034: istore #7
    //   3036: iload #7
    //   3038: iload #6
    //   3040: if_icmpge -> 3177
    //   3043: aload #5
    //   3045: iload #7
    //   3047: aaload
    //   3048: astore #8
    //   3050: aload #8
    //   3052: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3055: pop
    //   3056: aload #8
    //   3058: invokevirtual getModifiers : ()I
    //   3061: invokestatic isStatic : (I)Z
    //   3064: ifeq -> 3163
    //   3067: aload #8
    //   3069: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3072: arraylength
    //   3073: iconst_2
    //   3074: if_icmpne -> 3163
    //   3077: goto -> 3084
    //   3080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3083: athrow
    //   3084: aload #8
    //   3086: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3089: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3092: if_acmpne -> 3163
    //   3095: goto -> 3102
    //   3098: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3101: athrow
    //   3102: aload #8
    //   3104: iconst_1
    //   3105: invokevirtual setAccessible : (Z)V
    //   3108: aload #8
    //   3110: aconst_null
    //   3111: iconst_2
    //   3112: anewarray java/lang/Object
    //   3115: dup
    //   3116: iconst_0
    //   3117: aload_0
    //   3118: aastore
    //   3119: dup
    //   3120: iconst_1
    //   3121: aload_1
    //   3122: ifnonnull -> 3140
    //   3125: goto -> 3132
    //   3128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3131: athrow
    //   3132: aload_1
    //   3133: goto -> 3147
    //   3136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3139: athrow
    //   3140: aload_1
    //   3141: checkcast [B
    //   3144: invokevirtual clone : ()Ljava/lang/Object;
    //   3147: aastore
    //   3148: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3151: checkcast java/lang/Boolean
    //   3154: invokevirtual booleanValue : ()Z
    //   3157: istore #4
    //   3159: iload_2
    //   3160: ifeq -> 3177
    //   3163: iinc #7, 1
    //   3166: iload_2
    //   3167: ifeq -> 3036
    //   3170: goto -> 3177
    //   3173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3176: athrow
    //   3177: iload #4
    //   3179: ifeq -> 3185
    //   3182: iload #4
    //   3184: ireturn
    //   3185: getstatic burp/Zb4a.Zi : Ljava/lang/String;
    //   3188: getstatic burp/Zl39.ZA : Ljava/lang/Object;
    //   3191: checkcast java/math/BigInteger
    //   3194: invokevirtual intValue : ()I
    //   3197: bipush #32
    //   3199: irem
    //   3200: invokestatic abs : (I)I
    //   3203: invokevirtual charAt : (I)C
    //   3206: getstatic burp/Zest.Zd : Ljava/lang/String;
    //   3209: getstatic burp/Zkc8.ZW : Ljava/lang/Object;
    //   3212: checkcast java/math/BigInteger
    //   3215: invokevirtual intValue : ()I
    //   3218: bipush #32
    //   3220: irem
    //   3221: invokestatic abs : (I)I
    //   3224: invokevirtual charAt : (I)C
    //   3227: if_icmpgt -> 3573
    //   3230: sipush #3948
    //   3233: sipush #-18674
    //   3236: invokestatic a : (II)Ljava/lang/String;
    //   3239: iconst_1
    //   3240: ldc burp/Zkjr
    //   3242: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3245: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3248: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3251: astore #5
    //   3253: aload #5
    //   3255: arraylength
    //   3256: istore #6
    //   3258: iconst_0
    //   3259: istore #7
    //   3261: iload #7
    //   3263: iload #6
    //   3265: if_icmpge -> 3403
    //   3268: aload #5
    //   3270: iload #7
    //   3272: aaload
    //   3273: astore #8
    //   3275: aload #8
    //   3277: invokevirtual getModifiers : ()I
    //   3280: invokestatic isStatic : (I)Z
    //   3283: ifne -> 3293
    //   3286: goto -> 3396
    //   3289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3292: athrow
    //   3293: aload #8
    //   3295: invokevirtual getType : ()Ljava/lang/Class;
    //   3298: astore #9
    //   3300: aload #9
    //   3302: ifnull -> 3383
    //   3305: aload #9
    //   3307: invokevirtual isPrimitive : ()Z
    //   3310: ifne -> 3383
    //   3313: goto -> 3320
    //   3316: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3319: athrow
    //   3320: aload #9
    //   3322: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3325: ifnull -> 3383
    //   3328: goto -> 3335
    //   3331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3334: athrow
    //   3335: aload #9
    //   3337: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3340: invokevirtual getName : ()Ljava/lang/String;
    //   3343: ifnull -> 3383
    //   3346: goto -> 3353
    //   3349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3352: athrow
    //   3353: aload #9
    //   3355: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3358: invokevirtual getName : ()Ljava/lang/String;
    //   3361: sipush #3959
    //   3364: sipush #14794
    //   3367: invokestatic a : (II)Ljava/lang/String;
    //   3370: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3373: ifne -> 3383
    //   3376: goto -> 3383
    //   3379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3382: athrow
    //   3383: aload #8
    //   3385: iconst_1
    //   3386: invokevirtual setAccessible : (Z)V
    //   3389: aload #8
    //   3391: aconst_null
    //   3392: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3395: pop
    //   3396: iinc #7, 1
    //   3399: iload_2
    //   3400: ifeq -> 3261
    //   3403: sipush #3940
    //   3406: sipush #20782
    //   3409: invokestatic a : (II)Ljava/lang/String;
    //   3412: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3415: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3418: astore #5
    //   3420: aload #5
    //   3422: arraylength
    //   3423: istore #6
    //   3425: iconst_0
    //   3426: istore #7
    //   3428: iload #7
    //   3430: iload #6
    //   3432: if_icmpge -> 3569
    //   3435: aload #5
    //   3437: iload #7
    //   3439: aaload
    //   3440: astore #8
    //   3442: aload #8
    //   3444: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3447: pop
    //   3448: aload #8
    //   3450: invokevirtual getModifiers : ()I
    //   3453: invokestatic isStatic : (I)Z
    //   3456: ifeq -> 3555
    //   3459: aload #8
    //   3461: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3464: arraylength
    //   3465: iconst_2
    //   3466: if_icmpne -> 3555
    //   3469: goto -> 3476
    //   3472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3475: athrow
    //   3476: aload #8
    //   3478: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3481: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3484: if_acmpne -> 3555
    //   3487: goto -> 3494
    //   3490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3493: athrow
    //   3494: aload #8
    //   3496: iconst_1
    //   3497: invokevirtual setAccessible : (Z)V
    //   3500: aload #8
    //   3502: aconst_null
    //   3503: iconst_2
    //   3504: anewarray java/lang/Object
    //   3507: dup
    //   3508: iconst_0
    //   3509: aload_0
    //   3510: aastore
    //   3511: dup
    //   3512: iconst_1
    //   3513: aload_1
    //   3514: ifnonnull -> 3532
    //   3517: goto -> 3524
    //   3520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3523: athrow
    //   3524: aload_1
    //   3525: goto -> 3539
    //   3528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3531: athrow
    //   3532: aload_1
    //   3533: checkcast [B
    //   3536: invokevirtual clone : ()Ljava/lang/Object;
    //   3539: aastore
    //   3540: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3543: checkcast java/lang/Boolean
    //   3546: invokevirtual booleanValue : ()Z
    //   3549: istore #4
    //   3551: iload_2
    //   3552: ifeq -> 3569
    //   3555: iinc #7, 1
    //   3558: iload_2
    //   3559: ifeq -> 3428
    //   3562: goto -> 3569
    //   3565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3568: athrow
    //   3569: iload_2
    //   3570: ifeq -> 3912
    //   3573: sipush #3950
    //   3576: sipush #27868
    //   3579: invokestatic a : (II)Ljava/lang/String;
    //   3582: iconst_1
    //   3583: ldc burp/Zbzc
    //   3585: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3588: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3591: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3594: astore #5
    //   3596: aload #5
    //   3598: arraylength
    //   3599: istore #6
    //   3601: iconst_0
    //   3602: istore #7
    //   3604: iload #7
    //   3606: iload #6
    //   3608: if_icmpge -> 3746
    //   3611: aload #5
    //   3613: iload #7
    //   3615: aaload
    //   3616: astore #8
    //   3618: aload #8
    //   3620: invokevirtual getModifiers : ()I
    //   3623: invokestatic isStatic : (I)Z
    //   3626: ifne -> 3636
    //   3629: goto -> 3739
    //   3632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3635: athrow
    //   3636: aload #8
    //   3638: invokevirtual getType : ()Ljava/lang/Class;
    //   3641: astore #9
    //   3643: aload #9
    //   3645: ifnull -> 3726
    //   3648: aload #9
    //   3650: invokevirtual isPrimitive : ()Z
    //   3653: ifne -> 3726
    //   3656: goto -> 3663
    //   3659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3662: athrow
    //   3663: aload #9
    //   3665: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3668: ifnull -> 3726
    //   3671: goto -> 3678
    //   3674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3677: athrow
    //   3678: aload #9
    //   3680: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3683: invokevirtual getName : ()Ljava/lang/String;
    //   3686: ifnull -> 3726
    //   3689: goto -> 3696
    //   3692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3695: athrow
    //   3696: aload #9
    //   3698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3701: invokevirtual getName : ()Ljava/lang/String;
    //   3704: sipush #3959
    //   3707: sipush #14794
    //   3710: invokestatic a : (II)Ljava/lang/String;
    //   3713: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3716: ifne -> 3726
    //   3719: goto -> 3726
    //   3722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3725: athrow
    //   3726: aload #8
    //   3728: iconst_1
    //   3729: invokevirtual setAccessible : (Z)V
    //   3732: aload #8
    //   3734: aconst_null
    //   3735: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3738: pop
    //   3739: iinc #7, 1
    //   3742: iload_2
    //   3743: ifeq -> 3604
    //   3746: sipush #3955
    //   3749: sipush #-15493
    //   3752: invokestatic a : (II)Ljava/lang/String;
    //   3755: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3758: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3761: astore #5
    //   3763: aload #5
    //   3765: arraylength
    //   3766: istore #6
    //   3768: iconst_0
    //   3769: istore #7
    //   3771: iload #7
    //   3773: iload #6
    //   3775: if_icmpge -> 3912
    //   3778: aload #5
    //   3780: iload #7
    //   3782: aaload
    //   3783: astore #8
    //   3785: aload #8
    //   3787: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3790: pop
    //   3791: aload #8
    //   3793: invokevirtual getModifiers : ()I
    //   3796: invokestatic isStatic : (I)Z
    //   3799: ifeq -> 3898
    //   3802: aload #8
    //   3804: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3807: arraylength
    //   3808: iconst_2
    //   3809: if_icmpne -> 3898
    //   3812: goto -> 3819
    //   3815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3818: athrow
    //   3819: aload #8
    //   3821: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3824: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3827: if_acmpne -> 3898
    //   3830: goto -> 3837
    //   3833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3836: athrow
    //   3837: aload #8
    //   3839: iconst_1
    //   3840: invokevirtual setAccessible : (Z)V
    //   3843: aload #8
    //   3845: aconst_null
    //   3846: iconst_2
    //   3847: anewarray java/lang/Object
    //   3850: dup
    //   3851: iconst_0
    //   3852: aload_0
    //   3853: aastore
    //   3854: dup
    //   3855: iconst_1
    //   3856: aload_1
    //   3857: ifnonnull -> 3875
    //   3860: goto -> 3867
    //   3863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3866: athrow
    //   3867: aload_1
    //   3868: goto -> 3882
    //   3871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3874: athrow
    //   3875: aload_1
    //   3876: checkcast [B
    //   3879: invokevirtual clone : ()Ljava/lang/Object;
    //   3882: aastore
    //   3883: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3886: checkcast java/lang/Boolean
    //   3889: invokevirtual booleanValue : ()Z
    //   3892: istore #4
    //   3894: iload_2
    //   3895: ifeq -> 3912
    //   3898: iinc #7, 1
    //   3901: iload_2
    //   3902: ifeq -> 3771
    //   3905: goto -> 3912
    //   3908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3911: athrow
    //   3912: iload #4
    //   3914: ifeq -> 3920
    //   3917: iload #4
    //   3919: ireturn
    //   3920: getstatic burp/Zx6d.ZP : Ljava/lang/String;
    //   3923: getstatic burp/Zm3p.Zz : Ljava/lang/Object;
    //   3926: checkcast java/math/BigInteger
    //   3929: invokevirtual intValue : ()I
    //   3932: bipush #32
    //   3934: irem
    //   3935: invokestatic abs : (I)I
    //   3938: invokevirtual charAt : (I)C
    //   3941: getstatic burp/Zgnp.ZL : Ljava/lang/String;
    //   3944: getstatic burp/Zs0_.Zu : Ljava/lang/Object;
    //   3947: checkcast java/math/BigInteger
    //   3950: invokevirtual intValue : ()I
    //   3953: bipush #32
    //   3955: irem
    //   3956: invokestatic abs : (I)I
    //   3959: invokevirtual charAt : (I)C
    //   3962: if_icmple -> 4308
    //   3965: sipush #3946
    //   3968: sipush #-20982
    //   3971: invokestatic a : (II)Ljava/lang/String;
    //   3974: iconst_1
    //   3975: ldc burp/Zg6f
    //   3977: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3980: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3983: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3986: astore #5
    //   3988: aload #5
    //   3990: arraylength
    //   3991: istore #6
    //   3993: iconst_0
    //   3994: istore #7
    //   3996: iload #7
    //   3998: iload #6
    //   4000: if_icmpge -> 4138
    //   4003: aload #5
    //   4005: iload #7
    //   4007: aaload
    //   4008: astore #8
    //   4010: aload #8
    //   4012: invokevirtual getModifiers : ()I
    //   4015: invokestatic isStatic : (I)Z
    //   4018: ifne -> 4028
    //   4021: goto -> 4131
    //   4024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4027: athrow
    //   4028: aload #8
    //   4030: invokevirtual getType : ()Ljava/lang/Class;
    //   4033: astore #9
    //   4035: aload #9
    //   4037: ifnull -> 4118
    //   4040: aload #9
    //   4042: invokevirtual isPrimitive : ()Z
    //   4045: ifne -> 4118
    //   4048: goto -> 4055
    //   4051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4054: athrow
    //   4055: aload #9
    //   4057: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4060: ifnull -> 4118
    //   4063: goto -> 4070
    //   4066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4069: athrow
    //   4070: aload #9
    //   4072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4075: invokevirtual getName : ()Ljava/lang/String;
    //   4078: ifnull -> 4118
    //   4081: goto -> 4088
    //   4084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4087: athrow
    //   4088: aload #9
    //   4090: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4093: invokevirtual getName : ()Ljava/lang/String;
    //   4096: sipush #3959
    //   4099: sipush #14794
    //   4102: invokestatic a : (II)Ljava/lang/String;
    //   4105: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4108: ifne -> 4118
    //   4111: goto -> 4118
    //   4114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4117: athrow
    //   4118: aload #8
    //   4120: iconst_1
    //   4121: invokevirtual setAccessible : (Z)V
    //   4124: aload #8
    //   4126: aconst_null
    //   4127: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4130: pop
    //   4131: iinc #7, 1
    //   4134: iload_2
    //   4135: ifeq -> 3996
    //   4138: sipush #3960
    //   4141: sipush #16583
    //   4144: invokestatic a : (II)Ljava/lang/String;
    //   4147: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4150: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4153: astore #5
    //   4155: aload #5
    //   4157: arraylength
    //   4158: istore #6
    //   4160: iconst_0
    //   4161: istore #7
    //   4163: iload #7
    //   4165: iload #6
    //   4167: if_icmpge -> 4304
    //   4170: aload #5
    //   4172: iload #7
    //   4174: aaload
    //   4175: astore #8
    //   4177: aload #8
    //   4179: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4182: pop
    //   4183: aload #8
    //   4185: invokevirtual getModifiers : ()I
    //   4188: invokestatic isStatic : (I)Z
    //   4191: ifeq -> 4290
    //   4194: aload #8
    //   4196: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4199: arraylength
    //   4200: iconst_2
    //   4201: if_icmpne -> 4290
    //   4204: goto -> 4211
    //   4207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4210: athrow
    //   4211: aload #8
    //   4213: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4216: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4219: if_acmpne -> 4290
    //   4222: goto -> 4229
    //   4225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4228: athrow
    //   4229: aload #8
    //   4231: iconst_1
    //   4232: invokevirtual setAccessible : (Z)V
    //   4235: aload #8
    //   4237: aconst_null
    //   4238: iconst_2
    //   4239: anewarray java/lang/Object
    //   4242: dup
    //   4243: iconst_0
    //   4244: aload_0
    //   4245: aastore
    //   4246: dup
    //   4247: iconst_1
    //   4248: aload_1
    //   4249: ifnonnull -> 4267
    //   4252: goto -> 4259
    //   4255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4258: athrow
    //   4259: aload_1
    //   4260: goto -> 4274
    //   4263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4266: athrow
    //   4267: aload_1
    //   4268: checkcast [B
    //   4271: invokevirtual clone : ()Ljava/lang/Object;
    //   4274: aastore
    //   4275: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4278: checkcast java/lang/Boolean
    //   4281: invokevirtual booleanValue : ()Z
    //   4284: istore #4
    //   4286: iload_2
    //   4287: ifeq -> 4304
    //   4290: iinc #7, 1
    //   4293: iload_2
    //   4294: ifeq -> 4163
    //   4297: goto -> 4304
    //   4300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4303: athrow
    //   4304: iload_2
    //   4305: ifeq -> 4647
    //   4308: sipush #3949
    //   4311: sipush #-591
    //   4314: invokestatic a : (II)Ljava/lang/String;
    //   4317: iconst_1
    //   4318: ldc burp/Zxrd
    //   4320: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4323: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4326: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4329: astore #5
    //   4331: aload #5
    //   4333: arraylength
    //   4334: istore #6
    //   4336: iconst_0
    //   4337: istore #7
    //   4339: iload #7
    //   4341: iload #6
    //   4343: if_icmpge -> 4481
    //   4346: aload #5
    //   4348: iload #7
    //   4350: aaload
    //   4351: astore #8
    //   4353: aload #8
    //   4355: invokevirtual getModifiers : ()I
    //   4358: invokestatic isStatic : (I)Z
    //   4361: ifne -> 4371
    //   4364: goto -> 4474
    //   4367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4370: athrow
    //   4371: aload #8
    //   4373: invokevirtual getType : ()Ljava/lang/Class;
    //   4376: astore #9
    //   4378: aload #9
    //   4380: ifnull -> 4461
    //   4383: aload #9
    //   4385: invokevirtual isPrimitive : ()Z
    //   4388: ifne -> 4461
    //   4391: goto -> 4398
    //   4394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4397: athrow
    //   4398: aload #9
    //   4400: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4403: ifnull -> 4461
    //   4406: goto -> 4413
    //   4409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4412: athrow
    //   4413: aload #9
    //   4415: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4418: invokevirtual getName : ()Ljava/lang/String;
    //   4421: ifnull -> 4461
    //   4424: goto -> 4431
    //   4427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4430: athrow
    //   4431: aload #9
    //   4433: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4436: invokevirtual getName : ()Ljava/lang/String;
    //   4439: sipush #3959
    //   4442: sipush #14794
    //   4445: invokestatic a : (II)Ljava/lang/String;
    //   4448: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4451: ifne -> 4461
    //   4454: goto -> 4461
    //   4457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4460: athrow
    //   4461: aload #8
    //   4463: iconst_1
    //   4464: invokevirtual setAccessible : (Z)V
    //   4467: aload #8
    //   4469: aconst_null
    //   4470: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4473: pop
    //   4474: iinc #7, 1
    //   4477: iload_2
    //   4478: ifeq -> 4339
    //   4481: sipush #3954
    //   4484: sipush #-20047
    //   4487: invokestatic a : (II)Ljava/lang/String;
    //   4490: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4493: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4496: astore #5
    //   4498: aload #5
    //   4500: arraylength
    //   4501: istore #6
    //   4503: iconst_0
    //   4504: istore #7
    //   4506: iload #7
    //   4508: iload #6
    //   4510: if_icmpge -> 4647
    //   4513: aload #5
    //   4515: iload #7
    //   4517: aaload
    //   4518: astore #8
    //   4520: aload #8
    //   4522: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4525: pop
    //   4526: aload #8
    //   4528: invokevirtual getModifiers : ()I
    //   4531: invokestatic isStatic : (I)Z
    //   4534: ifeq -> 4633
    //   4537: aload #8
    //   4539: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4542: arraylength
    //   4543: iconst_2
    //   4544: if_icmpne -> 4633
    //   4547: goto -> 4554
    //   4550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4553: athrow
    //   4554: aload #8
    //   4556: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4559: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4562: if_acmpne -> 4633
    //   4565: goto -> 4572
    //   4568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4571: athrow
    //   4572: aload #8
    //   4574: iconst_1
    //   4575: invokevirtual setAccessible : (Z)V
    //   4578: aload #8
    //   4580: aconst_null
    //   4581: iconst_2
    //   4582: anewarray java/lang/Object
    //   4585: dup
    //   4586: iconst_0
    //   4587: aload_0
    //   4588: aastore
    //   4589: dup
    //   4590: iconst_1
    //   4591: aload_1
    //   4592: ifnonnull -> 4610
    //   4595: goto -> 4602
    //   4598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4601: athrow
    //   4602: aload_1
    //   4603: goto -> 4617
    //   4606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4609: athrow
    //   4610: aload_1
    //   4611: checkcast [B
    //   4614: invokevirtual clone : ()Ljava/lang/Object;
    //   4617: aastore
    //   4618: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4621: checkcast java/lang/Boolean
    //   4624: invokevirtual booleanValue : ()Z
    //   4627: istore #4
    //   4629: iload_2
    //   4630: ifeq -> 4647
    //   4633: iinc #7, 1
    //   4636: iload_2
    //   4637: ifeq -> 4506
    //   4640: goto -> 4647
    //   4643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4646: athrow
    //   4647: iload #4
    //   4649: ifeq -> 4655
    //   4652: iload #4
    //   4654: ireturn
    //   4655: getstatic burp/Zz2e.ZS : Ljava/lang/String;
    //   4658: getstatic burp/Zb.ZV : Ljava/lang/Object;
    //   4661: checkcast java/math/BigInteger
    //   4664: invokevirtual intValue : ()I
    //   4667: bipush #32
    //   4669: irem
    //   4670: invokestatic abs : (I)I
    //   4673: invokevirtual charAt : (I)C
    //   4676: getstatic burp/Zre5.ZR : Ljava/lang/String;
    //   4679: getstatic burp/Zl39.ZA : Ljava/lang/Object;
    //   4682: checkcast java/math/BigInteger
    //   4685: invokevirtual intValue : ()I
    //   4688: bipush #32
    //   4690: irem
    //   4691: invokestatic abs : (I)I
    //   4694: invokevirtual charAt : (I)C
    //   4697: if_icmple -> 5043
    //   4700: sipush #3942
    //   4703: sipush #363
    //   4706: invokestatic a : (II)Ljava/lang/String;
    //   4709: iconst_1
    //   4710: ldc burp/Zgkl
    //   4712: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4715: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4718: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4721: astore #5
    //   4723: aload #5
    //   4725: arraylength
    //   4726: istore #6
    //   4728: iconst_0
    //   4729: istore #7
    //   4731: iload #7
    //   4733: iload #6
    //   4735: if_icmpge -> 4873
    //   4738: aload #5
    //   4740: iload #7
    //   4742: aaload
    //   4743: astore #8
    //   4745: aload #8
    //   4747: invokevirtual getModifiers : ()I
    //   4750: invokestatic isStatic : (I)Z
    //   4753: ifne -> 4763
    //   4756: goto -> 4866
    //   4759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4762: athrow
    //   4763: aload #8
    //   4765: invokevirtual getType : ()Ljava/lang/Class;
    //   4768: astore #9
    //   4770: aload #9
    //   4772: ifnull -> 4853
    //   4775: aload #9
    //   4777: invokevirtual isPrimitive : ()Z
    //   4780: ifne -> 4853
    //   4783: goto -> 4790
    //   4786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4789: athrow
    //   4790: aload #9
    //   4792: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4795: ifnull -> 4853
    //   4798: goto -> 4805
    //   4801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4804: athrow
    //   4805: aload #9
    //   4807: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4810: invokevirtual getName : ()Ljava/lang/String;
    //   4813: ifnull -> 4853
    //   4816: goto -> 4823
    //   4819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4822: athrow
    //   4823: aload #9
    //   4825: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4828: invokevirtual getName : ()Ljava/lang/String;
    //   4831: sipush #3959
    //   4834: sipush #14794
    //   4837: invokestatic a : (II)Ljava/lang/String;
    //   4840: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4843: ifne -> 4853
    //   4846: goto -> 4853
    //   4849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4852: athrow
    //   4853: aload #8
    //   4855: iconst_1
    //   4856: invokevirtual setAccessible : (Z)V
    //   4859: aload #8
    //   4861: aconst_null
    //   4862: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4865: pop
    //   4866: iinc #7, 1
    //   4869: iload_2
    //   4870: ifeq -> 4731
    //   4873: sipush #3963
    //   4876: sipush #-27884
    //   4879: invokestatic a : (II)Ljava/lang/String;
    //   4882: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4885: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4888: astore #5
    //   4890: aload #5
    //   4892: arraylength
    //   4893: istore #6
    //   4895: iconst_0
    //   4896: istore #7
    //   4898: iload #7
    //   4900: iload #6
    //   4902: if_icmpge -> 5039
    //   4905: aload #5
    //   4907: iload #7
    //   4909: aaload
    //   4910: astore #8
    //   4912: aload #8
    //   4914: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4917: pop
    //   4918: aload #8
    //   4920: invokevirtual getModifiers : ()I
    //   4923: invokestatic isStatic : (I)Z
    //   4926: ifeq -> 5025
    //   4929: aload #8
    //   4931: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4934: arraylength
    //   4935: iconst_2
    //   4936: if_icmpne -> 5025
    //   4939: goto -> 4946
    //   4942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4945: athrow
    //   4946: aload #8
    //   4948: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4951: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4954: if_acmpne -> 5025
    //   4957: goto -> 4964
    //   4960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4963: athrow
    //   4964: aload #8
    //   4966: iconst_1
    //   4967: invokevirtual setAccessible : (Z)V
    //   4970: aload #8
    //   4972: aconst_null
    //   4973: iconst_2
    //   4974: anewarray java/lang/Object
    //   4977: dup
    //   4978: iconst_0
    //   4979: aload_0
    //   4980: aastore
    //   4981: dup
    //   4982: iconst_1
    //   4983: aload_1
    //   4984: ifnonnull -> 5002
    //   4987: goto -> 4994
    //   4990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4993: athrow
    //   4994: aload_1
    //   4995: goto -> 5009
    //   4998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5001: athrow
    //   5002: aload_1
    //   5003: checkcast [B
    //   5006: invokevirtual clone : ()Ljava/lang/Object;
    //   5009: aastore
    //   5010: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5013: checkcast java/lang/Boolean
    //   5016: invokevirtual booleanValue : ()Z
    //   5019: istore #4
    //   5021: iload_2
    //   5022: ifeq -> 5039
    //   5025: iinc #7, 1
    //   5028: iload_2
    //   5029: ifeq -> 4898
    //   5032: goto -> 5039
    //   5035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5038: athrow
    //   5039: iload_2
    //   5040: ifeq -> 5382
    //   5043: sipush #3947
    //   5046: sipush #-4445
    //   5049: invokestatic a : (II)Ljava/lang/String;
    //   5052: iconst_1
    //   5053: ldc burp/Zecw
    //   5055: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5058: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5061: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5064: astore #5
    //   5066: aload #5
    //   5068: arraylength
    //   5069: istore #6
    //   5071: iconst_0
    //   5072: istore #7
    //   5074: iload #7
    //   5076: iload #6
    //   5078: if_icmpge -> 5216
    //   5081: aload #5
    //   5083: iload #7
    //   5085: aaload
    //   5086: astore #8
    //   5088: aload #8
    //   5090: invokevirtual getModifiers : ()I
    //   5093: invokestatic isStatic : (I)Z
    //   5096: ifne -> 5106
    //   5099: goto -> 5209
    //   5102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5105: athrow
    //   5106: aload #8
    //   5108: invokevirtual getType : ()Ljava/lang/Class;
    //   5111: astore #9
    //   5113: aload #9
    //   5115: ifnull -> 5196
    //   5118: aload #9
    //   5120: invokevirtual isPrimitive : ()Z
    //   5123: ifne -> 5196
    //   5126: goto -> 5133
    //   5129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5132: athrow
    //   5133: aload #9
    //   5135: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5138: ifnull -> 5196
    //   5141: goto -> 5148
    //   5144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5147: athrow
    //   5148: aload #9
    //   5150: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5153: invokevirtual getName : ()Ljava/lang/String;
    //   5156: ifnull -> 5196
    //   5159: goto -> 5166
    //   5162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5165: athrow
    //   5166: aload #9
    //   5168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5171: invokevirtual getName : ()Ljava/lang/String;
    //   5174: sipush #3959
    //   5177: sipush #14794
    //   5180: invokestatic a : (II)Ljava/lang/String;
    //   5183: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5186: ifne -> 5196
    //   5189: goto -> 5196
    //   5192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5195: athrow
    //   5196: aload #8
    //   5198: iconst_1
    //   5199: invokevirtual setAccessible : (Z)V
    //   5202: aload #8
    //   5204: aconst_null
    //   5205: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5208: pop
    //   5209: iinc #7, 1
    //   5212: iload_2
    //   5213: ifeq -> 5074
    //   5216: sipush #3957
    //   5219: sipush #-18520
    //   5222: invokestatic a : (II)Ljava/lang/String;
    //   5225: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5228: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5231: astore #5
    //   5233: aload #5
    //   5235: arraylength
    //   5236: istore #6
    //   5238: iconst_0
    //   5239: istore #7
    //   5241: iload #7
    //   5243: iload #6
    //   5245: if_icmpge -> 5382
    //   5248: aload #5
    //   5250: iload #7
    //   5252: aaload
    //   5253: astore #8
    //   5255: aload #8
    //   5257: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5260: pop
    //   5261: aload #8
    //   5263: invokevirtual getModifiers : ()I
    //   5266: invokestatic isStatic : (I)Z
    //   5269: ifeq -> 5368
    //   5272: aload #8
    //   5274: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5277: arraylength
    //   5278: iconst_2
    //   5279: if_icmpne -> 5368
    //   5282: goto -> 5289
    //   5285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5288: athrow
    //   5289: aload #8
    //   5291: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5294: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5297: if_acmpne -> 5368
    //   5300: goto -> 5307
    //   5303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5306: athrow
    //   5307: aload #8
    //   5309: iconst_1
    //   5310: invokevirtual setAccessible : (Z)V
    //   5313: aload #8
    //   5315: aconst_null
    //   5316: iconst_2
    //   5317: anewarray java/lang/Object
    //   5320: dup
    //   5321: iconst_0
    //   5322: aload_0
    //   5323: aastore
    //   5324: dup
    //   5325: iconst_1
    //   5326: aload_1
    //   5327: ifnonnull -> 5345
    //   5330: goto -> 5337
    //   5333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5336: athrow
    //   5337: aload_1
    //   5338: goto -> 5352
    //   5341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5344: athrow
    //   5345: aload_1
    //   5346: checkcast [B
    //   5349: invokevirtual clone : ()Ljava/lang/Object;
    //   5352: aastore
    //   5353: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5356: checkcast java/lang/Boolean
    //   5359: invokevirtual booleanValue : ()Z
    //   5362: istore #4
    //   5364: iload_2
    //   5365: ifeq -> 5382
    //   5368: iinc #7, 1
    //   5371: iload_2
    //   5372: ifeq -> 5241
    //   5375: goto -> 5382
    //   5378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5381: athrow
    //   5382: iload #4
    //   5384: ireturn
    //   5385: astore_3
    //   5386: new java/lang/Exception
    //   5389: dup
    //   5390: aload_3
    //   5391: invokevirtual getMessage : ()Ljava/lang/String;
    //   5394: invokespecial <init> : (Ljava/lang/String;)V
    //   5397: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2449	5385	java/lang/Throwable
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
    //   1806	1820	1820	java/lang/Throwable
    //   1831	1844	1847	java/lang/Throwable
    //   1836	1859	1862	java/lang/Throwable
    //   1851	1877	1880	java/lang/Throwable
    //   1866	1907	1910	java/lang/Throwable
    //   1973	2000	2003	java/lang/Throwable
    //   1990	2018	2021	java/lang/Throwable
    //   2007	2048	2051	java/lang/Throwable
    //   2025	2059	2059	java/lang/Throwable
    //   2082	2093	2096	java/lang/Throwable
    //   2148	2162	2162	java/lang/Throwable
    //   2173	2186	2189	java/lang/Throwable
    //   2178	2201	2204	java/lang/Throwable
    //   2193	2219	2222	java/lang/Throwable
    //   2208	2249	2252	java/lang/Throwable
    //   2315	2342	2345	java/lang/Throwable
    //   2332	2360	2363	java/lang/Throwable
    //   2349	2390	2393	java/lang/Throwable
    //   2367	2401	2401	java/lang/Throwable
    //   2424	2435	2438	java/lang/Throwable
    //   2450	3184	5385	java/lang/Throwable
    //   2540	2554	2554	java/lang/Throwable
    //   2565	2578	2581	java/lang/Throwable
    //   2570	2593	2596	java/lang/Throwable
    //   2585	2611	2614	java/lang/Throwable
    //   2600	2641	2644	java/lang/Throwable
    //   2707	2734	2737	java/lang/Throwable
    //   2724	2752	2755	java/lang/Throwable
    //   2741	2782	2785	java/lang/Throwable
    //   2759	2793	2793	java/lang/Throwable
    //   2816	2827	2830	java/lang/Throwable
    //   2883	2897	2897	java/lang/Throwable
    //   2908	2921	2924	java/lang/Throwable
    //   2913	2936	2939	java/lang/Throwable
    //   2928	2954	2957	java/lang/Throwable
    //   2943	2984	2987	java/lang/Throwable
    //   3050	3077	3080	java/lang/Throwable
    //   3067	3095	3098	java/lang/Throwable
    //   3084	3125	3128	java/lang/Throwable
    //   3102	3136	3136	java/lang/Throwable
    //   3159	3170	3173	java/lang/Throwable
    //   3185	3919	5385	java/lang/Throwable
    //   3275	3289	3289	java/lang/Throwable
    //   3300	3313	3316	java/lang/Throwable
    //   3305	3328	3331	java/lang/Throwable
    //   3320	3346	3349	java/lang/Throwable
    //   3335	3376	3379	java/lang/Throwable
    //   3442	3469	3472	java/lang/Throwable
    //   3459	3487	3490	java/lang/Throwable
    //   3476	3517	3520	java/lang/Throwable
    //   3494	3528	3528	java/lang/Throwable
    //   3551	3562	3565	java/lang/Throwable
    //   3618	3632	3632	java/lang/Throwable
    //   3643	3656	3659	java/lang/Throwable
    //   3648	3671	3674	java/lang/Throwable
    //   3663	3689	3692	java/lang/Throwable
    //   3678	3719	3722	java/lang/Throwable
    //   3785	3812	3815	java/lang/Throwable
    //   3802	3830	3833	java/lang/Throwable
    //   3819	3860	3863	java/lang/Throwable
    //   3837	3871	3871	java/lang/Throwable
    //   3894	3905	3908	java/lang/Throwable
    //   3920	4654	5385	java/lang/Throwable
    //   4010	4024	4024	java/lang/Throwable
    //   4035	4048	4051	java/lang/Throwable
    //   4040	4063	4066	java/lang/Throwable
    //   4055	4081	4084	java/lang/Throwable
    //   4070	4111	4114	java/lang/Throwable
    //   4177	4204	4207	java/lang/Throwable
    //   4194	4222	4225	java/lang/Throwable
    //   4211	4252	4255	java/lang/Throwable
    //   4229	4263	4263	java/lang/Throwable
    //   4286	4297	4300	java/lang/Throwable
    //   4353	4367	4367	java/lang/Throwable
    //   4378	4391	4394	java/lang/Throwable
    //   4383	4406	4409	java/lang/Throwable
    //   4398	4424	4427	java/lang/Throwable
    //   4413	4454	4457	java/lang/Throwable
    //   4520	4547	4550	java/lang/Throwable
    //   4537	4565	4568	java/lang/Throwable
    //   4554	4595	4598	java/lang/Throwable
    //   4572	4606	4606	java/lang/Throwable
    //   4629	4640	4643	java/lang/Throwable
    //   4655	5384	5385	java/lang/Throwable
    //   4745	4759	4759	java/lang/Throwable
    //   4770	4783	4786	java/lang/Throwable
    //   4775	4798	4801	java/lang/Throwable
    //   4790	4816	4819	java/lang/Throwable
    //   4805	4846	4849	java/lang/Throwable
    //   4912	4939	4942	java/lang/Throwable
    //   4929	4957	4960	java/lang/Throwable
    //   4946	4987	4990	java/lang/Throwable
    //   4964	4998	4998	java/lang/Throwable
    //   5021	5032	5035	java/lang/Throwable
    //   5088	5102	5102	java/lang/Throwable
    //   5113	5126	5129	java/lang/Throwable
    //   5118	5141	5144	java/lang/Throwable
    //   5133	5159	5162	java/lang/Throwable
    //   5148	5189	5192	java/lang/Throwable
    //   5255	5282	5285	java/lang/Throwable
    //   5272	5300	5303	java/lang/Throwable
    //   5289	5330	5333	java/lang/Throwable
    //   5307	5341	5341	java/lang/Throwable
    //   5364	5375	5378	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'UóÃÓQj\\fë¡_BWûbW[I_/×Î¬»ð{»{`R¦Æó¦£ÈþÞõ'Hb·\\rÕ\\f¼jÛo¤Ö½3/ÒßÕ\\t@å\\r@ ¬iê\\t\\rå¤@¬ÙáA\\t·m÷\\tHÍ\\t´suÑÝ\\tm£¨µéÈP\\t²¡SÈk½Ï©\\tÔ]WòN4¯\\tOÐìæxñif\\tv~Ë3xÂd0ý §&q7i¹E:rÉxÇu83\\rûÿéº3òä³H\\tûzNG£È$\\tz@JôH:t#3\\tFU4«" <¯\\tª²PªñO0\\t5TZï4\\tÁM=U¦¡¹\\tP|à+i¶v*\\tq+­dñ[·lÉÅ Ü¬öµÅùÝÒÍS¡\\f¢þäßg¾4RìÌ$\\tó{ïnY¯M­\\t.9³É\\tMUÃ·W\\tDêt\*ö!c\\t2Tºó\\f9'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
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
    //   68: ldc 'O°òð%Æ\\tÙ¾ÙÌÝÚ!Ø{'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #66
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
    //   129: putstatic burp/Zzr5.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzr5.b : [Ljava/lang/String;
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
    //   212: bipush #12
    //   214: goto -> 244
    //   217: bipush #79
    //   219: goto -> 244
    //   222: bipush #53
    //   224: goto -> 244
    //   227: bipush #83
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #10
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
    //   311: bipush #39
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-114
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-99
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-2
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #75
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #68
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #63
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #113
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #103
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-110
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-11
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: iconst_3
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-78
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #109
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #103
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #23
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #53
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #87
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-113
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #68
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #31
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #114
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-69
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-14
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-67
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #59
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-15
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-9
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-102
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-97
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #68
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #123
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   500: sipush #3945
    //   503: sipush #-22452
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zzr5.Zg : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xF63) & 0xFFFF;
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
      char c = 'ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzr5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */