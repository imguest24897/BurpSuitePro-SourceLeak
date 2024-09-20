package burp;

import java.math.BigInteger;

class Zzoi extends ClassLoader {
  static String ZR;
  
  static Object ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zs(Object paramObject) {
    Zlhy.ZS = a(-4291, 15432);
    Zlhy.ZN = new BigInteger(a(-4294, -20526));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkt7.ZM.charAt(Math.abs(((BigInteger)Zk7e.ZW).intValue() % 32)) > Zkt7.ZM.charAt(Math.abs(((BigInteger)Zs83.ZT).intValue() % 32))) {
          try {
            Ze82.ZM(Class.forName(a(-4298, 22002)));
            if (bool)
              Zb0z.ZB(Class.forName(a(-4290, -17094))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb0z.ZB(Class.forName(a(-4290, -17094)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg4d.Zm : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zkt7.ZY : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zs34.ZE : Ljava/lang/Object;
    //   22: getstatic burp/Zrtv.Zg : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zsxo.Za : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zxo7.Zi : Ljava/lang/Object;
    //   40: new java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore_3
    //   48: iconst_0
    //   49: istore #4
    //   51: iload #4
    //   53: bipush #32
    //   55: if_icmpge -> 1391
    //   58: iload #4
    //   60: tableswitch default -> 1384, 0 -> 204, 1 -> 241, 2 -> 278, 3 -> 315, 4 -> 352, 5 -> 389, 6 -> 426, 7 -> 463, 8 -> 500, 9 -> 537, 10 -> 574, 11 -> 611, 12 -> 648, 13 -> 685, 14 -> 722, 15 -> 759, 16 -> 796, 17 -> 833, 18 -> 870, 19 -> 907, 20 -> 944, 21 -> 981, 22 -> 1018, 23 -> 1055, 24 -> 1092, 25 -> 1129, 26 -> 1166, 27 -> 1203, 28 -> 1240, 29 -> 1277, 30 -> 1314, 31 -> 1351
    //   204: aload_3
    //   205: getstatic burp/Zxg7.Zi : Ljava/lang/String;
    //   208: getstatic burp/Zrva.ZE : Ljava/lang/Object;
    //   211: checkcast java/math/BigInteger
    //   214: invokevirtual intValue : ()I
    //   217: bipush #32
    //   219: irem
    //   220: invokestatic abs : (I)I
    //   223: invokevirtual charAt : (I)C
    //   226: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: iload_2
    //   231: ifeq -> 1384
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   240: athrow
    //   241: aload_3
    //   242: getstatic burp/Zs34.Zq : Ljava/lang/String;
    //   245: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   248: checkcast java/math/BigInteger
    //   251: invokevirtual intValue : ()I
    //   254: bipush #32
    //   256: irem
    //   257: invokestatic abs : (I)I
    //   260: invokevirtual charAt : (I)C
    //   263: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: iload_2
    //   268: ifeq -> 1384
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   277: athrow
    //   278: aload_3
    //   279: getstatic burp/Zv8c.ZO : Ljava/lang/String;
    //   282: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   285: checkcast java/math/BigInteger
    //   288: invokevirtual intValue : ()I
    //   291: bipush #32
    //   293: irem
    //   294: invokestatic abs : (I)I
    //   297: invokevirtual charAt : (I)C
    //   300: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: iload_2
    //   305: ifeq -> 1384
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   314: athrow
    //   315: aload_3
    //   316: getstatic burp/Zs4z.Zs : Ljava/lang/String;
    //   319: getstatic burp/Zsxh.Zk : Ljava/lang/Object;
    //   322: checkcast java/math/BigInteger
    //   325: invokevirtual intValue : ()I
    //   328: bipush #32
    //   330: irem
    //   331: invokestatic abs : (I)I
    //   334: invokevirtual charAt : (I)C
    //   337: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   340: pop
    //   341: iload_2
    //   342: ifeq -> 1384
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: aload_3
    //   353: getstatic burp/Zt5j.ZR : Ljava/lang/String;
    //   356: getstatic burp/Zkjr.Zw : Ljava/lang/Object;
    //   359: checkcast java/math/BigInteger
    //   362: invokevirtual intValue : ()I
    //   365: bipush #32
    //   367: irem
    //   368: invokestatic abs : (I)I
    //   371: invokevirtual charAt : (I)C
    //   374: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   377: pop
    //   378: iload_2
    //   379: ifeq -> 1384
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   388: athrow
    //   389: aload_3
    //   390: getstatic burp/Zlem.Zl : Ljava/lang/String;
    //   393: getstatic burp/Zltz.Zg : Ljava/lang/Object;
    //   396: checkcast java/math/BigInteger
    //   399: invokevirtual intValue : ()I
    //   402: bipush #32
    //   404: irem
    //   405: invokestatic abs : (I)I
    //   408: invokevirtual charAt : (I)C
    //   411: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   414: pop
    //   415: iload_2
    //   416: ifeq -> 1384
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   425: athrow
    //   426: aload_3
    //   427: getstatic burp/Zs34.Zq : Ljava/lang/String;
    //   430: getstatic burp/Zxe.Zg : Ljava/lang/Object;
    //   433: checkcast java/math/BigInteger
    //   436: invokevirtual intValue : ()I
    //   439: bipush #32
    //   441: irem
    //   442: invokestatic abs : (I)I
    //   445: invokevirtual charAt : (I)C
    //   448: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   451: pop
    //   452: iload_2
    //   453: ifeq -> 1384
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: aload_3
    //   464: getstatic burp/Zkjr.Zg : Ljava/lang/String;
    //   467: getstatic burp/Zv8c.Zx : Ljava/lang/Object;
    //   470: checkcast java/math/BigInteger
    //   473: invokevirtual intValue : ()I
    //   476: bipush #32
    //   478: irem
    //   479: invokestatic abs : (I)I
    //   482: invokevirtual charAt : (I)C
    //   485: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   488: pop
    //   489: iload_2
    //   490: ifeq -> 1384
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   499: athrow
    //   500: aload_3
    //   501: getstatic burp/Zs34.Zq : Ljava/lang/String;
    //   504: getstatic burp/Zs34.ZE : Ljava/lang/Object;
    //   507: checkcast java/math/BigInteger
    //   510: invokevirtual intValue : ()I
    //   513: bipush #32
    //   515: irem
    //   516: invokestatic abs : (I)I
    //   519: invokevirtual charAt : (I)C
    //   522: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   525: pop
    //   526: iload_2
    //   527: ifeq -> 1384
    //   530: goto -> 537
    //   533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   536: athrow
    //   537: aload_3
    //   538: getstatic burp/Zx6d.ZP : Ljava/lang/String;
    //   541: getstatic burp/Zb.ZV : Ljava/lang/Object;
    //   544: checkcast java/math/BigInteger
    //   547: invokevirtual intValue : ()I
    //   550: bipush #32
    //   552: irem
    //   553: invokestatic abs : (I)I
    //   556: invokevirtual charAt : (I)C
    //   559: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   562: pop
    //   563: iload_2
    //   564: ifeq -> 1384
    //   567: goto -> 574
    //   570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   573: athrow
    //   574: aload_3
    //   575: getstatic burp/Ztsu.ZE : Ljava/lang/String;
    //   578: getstatic burp/Zlhy.ZN : Ljava/lang/Object;
    //   581: checkcast java/math/BigInteger
    //   584: invokevirtual intValue : ()I
    //   587: bipush #32
    //   589: irem
    //   590: invokestatic abs : (I)I
    //   593: invokevirtual charAt : (I)C
    //   596: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   599: pop
    //   600: iload_2
    //   601: ifeq -> 1384
    //   604: goto -> 611
    //   607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   610: athrow
    //   611: aload_3
    //   612: getstatic burp/Zxg7.Zi : Ljava/lang/String;
    //   615: getstatic burp/Zxe.Zg : Ljava/lang/Object;
    //   618: checkcast java/math/BigInteger
    //   621: invokevirtual intValue : ()I
    //   624: bipush #32
    //   626: irem
    //   627: invokestatic abs : (I)I
    //   630: invokevirtual charAt : (I)C
    //   633: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   636: pop
    //   637: iload_2
    //   638: ifeq -> 1384
    //   641: goto -> 648
    //   644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   647: athrow
    //   648: aload_3
    //   649: getstatic burp/Zzoi.ZR : Ljava/lang/String;
    //   652: getstatic burp/Zz6t.ZA : Ljava/lang/Object;
    //   655: checkcast java/math/BigInteger
    //   658: invokevirtual intValue : ()I
    //   661: bipush #32
    //   663: irem
    //   664: invokestatic abs : (I)I
    //   667: invokevirtual charAt : (I)C
    //   670: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   673: pop
    //   674: iload_2
    //   675: ifeq -> 1384
    //   678: goto -> 685
    //   681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   684: athrow
    //   685: aload_3
    //   686: getstatic burp/Zlpj.Zj : Ljava/lang/String;
    //   689: getstatic burp/Ztj5.Zj : Ljava/lang/Object;
    //   692: checkcast java/math/BigInteger
    //   695: invokevirtual intValue : ()I
    //   698: bipush #32
    //   700: irem
    //   701: invokestatic abs : (I)I
    //   704: invokevirtual charAt : (I)C
    //   707: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   710: pop
    //   711: iload_2
    //   712: ifeq -> 1384
    //   715: goto -> 722
    //   718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   721: athrow
    //   722: aload_3
    //   723: getstatic burp/Zgqi.Zv : Ljava/lang/String;
    //   726: getstatic burp/Zr2i.ZD : Ljava/lang/Object;
    //   729: checkcast java/math/BigInteger
    //   732: invokevirtual intValue : ()I
    //   735: bipush #32
    //   737: irem
    //   738: invokestatic abs : (I)I
    //   741: invokevirtual charAt : (I)C
    //   744: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: iload_2
    //   749: ifeq -> 1384
    //   752: goto -> 759
    //   755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   758: athrow
    //   759: aload_3
    //   760: getstatic burp/Zef0.ZR : Ljava/lang/String;
    //   763: getstatic burp/Zzmu.Zy : Ljava/lang/Object;
    //   766: checkcast java/math/BigInteger
    //   769: invokevirtual intValue : ()I
    //   772: bipush #32
    //   774: irem
    //   775: invokestatic abs : (I)I
    //   778: invokevirtual charAt : (I)C
    //   781: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   784: pop
    //   785: iload_2
    //   786: ifeq -> 1384
    //   789: goto -> 796
    //   792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   795: athrow
    //   796: aload_3
    //   797: getstatic burp/Ze6d.Zx : Ljava/lang/String;
    //   800: getstatic burp/Zztk.Za : Ljava/lang/Object;
    //   803: checkcast java/math/BigInteger
    //   806: invokevirtual intValue : ()I
    //   809: bipush #32
    //   811: irem
    //   812: invokestatic abs : (I)I
    //   815: invokevirtual charAt : (I)C
    //   818: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   821: pop
    //   822: iload_2
    //   823: ifeq -> 1384
    //   826: goto -> 833
    //   829: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   832: athrow
    //   833: aload_3
    //   834: getstatic burp/Zz20.ZX : Ljava/lang/String;
    //   837: getstatic burp/Zlr.ZK : Ljava/lang/Object;
    //   840: checkcast java/math/BigInteger
    //   843: invokevirtual intValue : ()I
    //   846: bipush #32
    //   848: irem
    //   849: invokestatic abs : (I)I
    //   852: invokevirtual charAt : (I)C
    //   855: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   858: pop
    //   859: iload_2
    //   860: ifeq -> 1384
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   869: athrow
    //   870: aload_3
    //   871: getstatic burp/Zr48.ZG : Ljava/lang/String;
    //   874: getstatic burp/Zzc_.Zi : Ljava/lang/Object;
    //   877: checkcast java/math/BigInteger
    //   880: invokevirtual intValue : ()I
    //   883: bipush #32
    //   885: irem
    //   886: invokestatic abs : (I)I
    //   889: invokevirtual charAt : (I)C
    //   892: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   895: pop
    //   896: iload_2
    //   897: ifeq -> 1384
    //   900: goto -> 907
    //   903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   906: athrow
    //   907: aload_3
    //   908: getstatic burp/Zs00.Zv : Ljava/lang/String;
    //   911: getstatic burp/Zg4d.Zm : Ljava/lang/Object;
    //   914: checkcast java/math/BigInteger
    //   917: invokevirtual intValue : ()I
    //   920: bipush #32
    //   922: irem
    //   923: invokestatic abs : (I)I
    //   926: invokevirtual charAt : (I)C
    //   929: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   932: pop
    //   933: iload_2
    //   934: ifeq -> 1384
    //   937: goto -> 944
    //   940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   943: athrow
    //   944: aload_3
    //   945: getstatic burp/Zzyr.Z_ : Ljava/lang/String;
    //   948: getstatic burp/Zs8s.ZG : Ljava/lang/Object;
    //   951: checkcast java/math/BigInteger
    //   954: invokevirtual intValue : ()I
    //   957: bipush #32
    //   959: irem
    //   960: invokestatic abs : (I)I
    //   963: invokevirtual charAt : (I)C
    //   966: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   969: pop
    //   970: iload_2
    //   971: ifeq -> 1384
    //   974: goto -> 981
    //   977: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   980: athrow
    //   981: aload_3
    //   982: getstatic burp/Zza8.Zm : Ljava/lang/String;
    //   985: getstatic burp/Zqp.ZA : Ljava/lang/Object;
    //   988: checkcast java/math/BigInteger
    //   991: invokevirtual intValue : ()I
    //   994: bipush #32
    //   996: irem
    //   997: invokestatic abs : (I)I
    //   1000: invokevirtual charAt : (I)C
    //   1003: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1006: pop
    //   1007: iload_2
    //   1008: ifeq -> 1384
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: athrow
    //   1018: aload_3
    //   1019: getstatic burp/Zkll.ZX : Ljava/lang/String;
    //   1022: getstatic burp/Zex.ZO : Ljava/lang/Object;
    //   1025: checkcast java/math/BigInteger
    //   1028: invokevirtual intValue : ()I
    //   1031: bipush #32
    //   1033: irem
    //   1034: invokestatic abs : (I)I
    //   1037: invokevirtual charAt : (I)C
    //   1040: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1043: pop
    //   1044: iload_2
    //   1045: ifeq -> 1384
    //   1048: goto -> 1055
    //   1051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1054: athrow
    //   1055: aload_3
    //   1056: getstatic burp/Zrva.Zr : Ljava/lang/String;
    //   1059: getstatic burp/Ze_t.Za : Ljava/lang/Object;
    //   1062: checkcast java/math/BigInteger
    //   1065: invokevirtual intValue : ()I
    //   1068: bipush #32
    //   1070: irem
    //   1071: invokestatic abs : (I)I
    //   1074: invokevirtual charAt : (I)C
    //   1077: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1080: pop
    //   1081: iload_2
    //   1082: ifeq -> 1384
    //   1085: goto -> 1092
    //   1088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1091: athrow
    //   1092: aload_3
    //   1093: getstatic burp/Zb8y.Zn : Ljava/lang/String;
    //   1096: getstatic burp/Zgva.Zr : Ljava/lang/Object;
    //   1099: checkcast java/math/BigInteger
    //   1102: invokevirtual intValue : ()I
    //   1105: bipush #32
    //   1107: irem
    //   1108: invokestatic abs : (I)I
    //   1111: invokevirtual charAt : (I)C
    //   1114: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1117: pop
    //   1118: iload_2
    //   1119: ifeq -> 1384
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload_3
    //   1130: getstatic burp/Ze8m.Zx : Ljava/lang/String;
    //   1133: getstatic burp/Ze82.ZR : Ljava/lang/Object;
    //   1136: checkcast java/math/BigInteger
    //   1139: invokevirtual intValue : ()I
    //   1142: bipush #32
    //   1144: irem
    //   1145: invokestatic abs : (I)I
    //   1148: invokevirtual charAt : (I)C
    //   1151: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1154: pop
    //   1155: iload_2
    //   1156: ifeq -> 1384
    //   1159: goto -> 1166
    //   1162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1165: athrow
    //   1166: aload_3
    //   1167: getstatic burp/Zlck.ZL : Ljava/lang/String;
    //   1170: getstatic burp/Zm52.ZR : Ljava/lang/Object;
    //   1173: checkcast java/math/BigInteger
    //   1176: invokevirtual intValue : ()I
    //   1179: bipush #32
    //   1181: irem
    //   1182: invokestatic abs : (I)I
    //   1185: invokevirtual charAt : (I)C
    //   1188: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1191: pop
    //   1192: iload_2
    //   1193: ifeq -> 1384
    //   1196: goto -> 1203
    //   1199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1202: athrow
    //   1203: aload_3
    //   1204: getstatic burp/Ze5t.ZX : Ljava/lang/String;
    //   1207: getstatic burp/Zltz.Zg : Ljava/lang/Object;
    //   1210: checkcast java/math/BigInteger
    //   1213: invokevirtual intValue : ()I
    //   1216: bipush #32
    //   1218: irem
    //   1219: invokestatic abs : (I)I
    //   1222: invokevirtual charAt : (I)C
    //   1225: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1228: pop
    //   1229: iload_2
    //   1230: ifeq -> 1384
    //   1233: goto -> 1240
    //   1236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1239: athrow
    //   1240: aload_3
    //   1241: getstatic burp/Zzgh.Zn : Ljava/lang/String;
    //   1244: getstatic burp/Zxn5.Zd : Ljava/lang/Object;
    //   1247: checkcast java/math/BigInteger
    //   1250: invokevirtual intValue : ()I
    //   1253: bipush #32
    //   1255: irem
    //   1256: invokestatic abs : (I)I
    //   1259: invokevirtual charAt : (I)C
    //   1262: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1265: pop
    //   1266: iload_2
    //   1267: ifeq -> 1384
    //   1270: goto -> 1277
    //   1273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1276: athrow
    //   1277: aload_3
    //   1278: getstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   1281: getstatic burp/Ztsu.Zr : Ljava/lang/Object;
    //   1284: checkcast java/math/BigInteger
    //   1287: invokevirtual intValue : ()I
    //   1290: bipush #32
    //   1292: irem
    //   1293: invokestatic abs : (I)I
    //   1296: invokevirtual charAt : (I)C
    //   1299: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1302: pop
    //   1303: iload_2
    //   1304: ifeq -> 1384
    //   1307: goto -> 1314
    //   1310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1313: athrow
    //   1314: aload_3
    //   1315: getstatic burp/Zgqi.Zv : Ljava/lang/String;
    //   1318: getstatic burp/Zkjr.Zw : Ljava/lang/Object;
    //   1321: checkcast java/math/BigInteger
    //   1324: invokevirtual intValue : ()I
    //   1327: bipush #32
    //   1329: irem
    //   1330: invokestatic abs : (I)I
    //   1333: invokevirtual charAt : (I)C
    //   1336: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1339: pop
    //   1340: iload_2
    //   1341: ifeq -> 1384
    //   1344: goto -> 1351
    //   1347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1350: athrow
    //   1351: aload_3
    //   1352: getstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   1355: getstatic burp/Zrtv.Zg : Ljava/lang/Object;
    //   1358: checkcast java/math/BigInteger
    //   1361: invokevirtual intValue : ()I
    //   1364: bipush #32
    //   1366: irem
    //   1367: invokestatic abs : (I)I
    //   1370: invokevirtual charAt : (I)C
    //   1373: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1376: pop
    //   1377: goto -> 1384
    //   1380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1383: athrow
    //   1384: iinc #4, 1
    //   1387: iload_2
    //   1388: ifeq -> 51
    //   1391: aload_3
    //   1392: invokevirtual toString : ()Ljava/lang/String;
    //   1395: putstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   1398: sipush #-4300
    //   1401: sipush #-2516
    //   1404: invokestatic a : (II)Ljava/lang/String;
    //   1407: iconst_1
    //   1408: ldc burp/Zvk
    //   1410: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1413: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1416: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1419: astore #4
    //   1421: aload #4
    //   1423: arraylength
    //   1424: istore #5
    //   1426: iconst_0
    //   1427: istore #6
    //   1429: iload #6
    //   1431: iload #5
    //   1433: if_icmpge -> 1571
    //   1436: aload #4
    //   1438: iload #6
    //   1440: aaload
    //   1441: astore #7
    //   1443: aload #7
    //   1445: invokevirtual getModifiers : ()I
    //   1448: invokestatic isStatic : (I)Z
    //   1451: ifne -> 1461
    //   1454: goto -> 1564
    //   1457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1460: athrow
    //   1461: aload #7
    //   1463: invokevirtual getType : ()Ljava/lang/Class;
    //   1466: astore #8
    //   1468: aload #8
    //   1470: ifnull -> 1551
    //   1473: aload #8
    //   1475: invokevirtual isPrimitive : ()Z
    //   1478: ifne -> 1551
    //   1481: goto -> 1488
    //   1484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1487: athrow
    //   1488: aload #8
    //   1490: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1493: ifnull -> 1551
    //   1496: goto -> 1503
    //   1499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1502: athrow
    //   1503: aload #8
    //   1505: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1508: invokevirtual getName : ()Ljava/lang/String;
    //   1511: ifnull -> 1551
    //   1514: goto -> 1521
    //   1517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1520: athrow
    //   1521: aload #8
    //   1523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1526: invokevirtual getName : ()Ljava/lang/String;
    //   1529: sipush #-4301
    //   1532: sipush #10571
    //   1535: invokestatic a : (II)Ljava/lang/String;
    //   1538: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1541: ifne -> 1551
    //   1544: goto -> 1551
    //   1547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1550: athrow
    //   1551: aload #7
    //   1553: iconst_1
    //   1554: invokevirtual setAccessible : (Z)V
    //   1557: aload #7
    //   1559: aconst_null
    //   1560: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1563: pop
    //   1564: iinc #6, 1
    //   1567: iload_2
    //   1568: ifeq -> 1429
    //   1571: sipush #-4318
    //   1574: sipush #16136
    //   1577: invokestatic a : (II)Ljava/lang/String;
    //   1580: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1583: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1586: astore #4
    //   1588: aload #4
    //   1590: arraylength
    //   1591: istore #5
    //   1593: iconst_0
    //   1594: istore #6
    //   1596: iload #6
    //   1598: iload #5
    //   1600: if_icmpge -> 1733
    //   1603: aload #4
    //   1605: iload #6
    //   1607: aaload
    //   1608: astore #7
    //   1610: aload #7
    //   1612: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1615: pop
    //   1616: aload #7
    //   1618: invokevirtual getModifiers : ()I
    //   1621: invokestatic isStatic : (I)Z
    //   1624: ifeq -> 1719
    //   1627: aload #7
    //   1629: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1632: arraylength
    //   1633: iconst_2
    //   1634: if_icmpne -> 1719
    //   1637: goto -> 1644
    //   1640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1643: athrow
    //   1644: aload #7
    //   1646: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1649: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1652: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1655: ifeq -> 1719
    //   1658: goto -> 1665
    //   1661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1664: athrow
    //   1665: aload #7
    //   1667: iconst_1
    //   1668: invokevirtual setAccessible : (Z)V
    //   1671: aload #7
    //   1673: aconst_null
    //   1674: iconst_2
    //   1675: anewarray java/lang/Object
    //   1678: dup
    //   1679: iconst_0
    //   1680: aload_0
    //   1681: aastore
    //   1682: dup
    //   1683: iconst_1
    //   1684: aload_1
    //   1685: ifnonnull -> 1703
    //   1688: goto -> 1695
    //   1691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1694: athrow
    //   1695: aload_1
    //   1696: goto -> 1710
    //   1699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1702: athrow
    //   1703: aload_1
    //   1704: checkcast [B
    //   1707: invokevirtual clone : ()Ljava/lang/Object;
    //   1710: aastore
    //   1711: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1714: pop
    //   1715: iload_2
    //   1716: ifeq -> 1733
    //   1719: iinc #6, 1
    //   1722: iload_2
    //   1723: ifeq -> 1596
    //   1726: goto -> 1733
    //   1729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1732: athrow
    //   1733: iconst_0
    //   1734: istore #4
    //   1736: getstatic burp/Zg4w.ZC : Ljava/lang/String;
    //   1739: getstatic burp/Zt5j.Zn : Ljava/lang/Object;
    //   1742: checkcast java/math/BigInteger
    //   1745: invokevirtual intValue : ()I
    //   1748: bipush #32
    //   1750: irem
    //   1751: invokestatic abs : (I)I
    //   1754: invokevirtual charAt : (I)C
    //   1757: getstatic burp/Zkb_.ZR : Ljava/lang/String;
    //   1760: getstatic burp/Ze69.ZH : Ljava/lang/Object;
    //   1763: checkcast java/math/BigInteger
    //   1766: invokevirtual intValue : ()I
    //   1769: bipush #32
    //   1771: irem
    //   1772: invokestatic abs : (I)I
    //   1775: invokevirtual charAt : (I)C
    //   1778: if_icmpgt -> 2123
    //   1781: sipush #-4320
    //   1784: sipush #-30590
    //   1787: invokestatic a : (II)Ljava/lang/String;
    //   1790: iconst_1
    //   1791: ldc burp/Ztt0
    //   1793: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1796: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1799: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1802: astore #5
    //   1804: aload #5
    //   1806: arraylength
    //   1807: istore #6
    //   1809: iconst_0
    //   1810: istore #7
    //   1812: iload #7
    //   1814: iload #6
    //   1816: if_icmpge -> 1954
    //   1819: aload #5
    //   1821: iload #7
    //   1823: aaload
    //   1824: astore #8
    //   1826: aload #8
    //   1828: invokevirtual getModifiers : ()I
    //   1831: invokestatic isStatic : (I)Z
    //   1834: ifne -> 1844
    //   1837: goto -> 1947
    //   1840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1843: athrow
    //   1844: aload #8
    //   1846: invokevirtual getType : ()Ljava/lang/Class;
    //   1849: astore #9
    //   1851: aload #9
    //   1853: ifnull -> 1934
    //   1856: aload #9
    //   1858: invokevirtual isPrimitive : ()Z
    //   1861: ifne -> 1934
    //   1864: goto -> 1871
    //   1867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1870: athrow
    //   1871: aload #9
    //   1873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1876: ifnull -> 1934
    //   1879: goto -> 1886
    //   1882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1885: athrow
    //   1886: aload #9
    //   1888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1891: invokevirtual getName : ()Ljava/lang/String;
    //   1894: ifnull -> 1934
    //   1897: goto -> 1904
    //   1900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1903: athrow
    //   1904: aload #9
    //   1906: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1909: invokevirtual getName : ()Ljava/lang/String;
    //   1912: sipush #-4289
    //   1915: sipush #14014
    //   1918: invokestatic a : (II)Ljava/lang/String;
    //   1921: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1924: ifne -> 1934
    //   1927: goto -> 1934
    //   1930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1933: athrow
    //   1934: aload #8
    //   1936: iconst_1
    //   1937: invokevirtual setAccessible : (Z)V
    //   1940: aload #8
    //   1942: aconst_null
    //   1943: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1946: pop
    //   1947: iinc #7, 1
    //   1950: iload_2
    //   1951: ifeq -> 1812
    //   1954: sipush #-4306
    //   1957: sipush #-3277
    //   1960: invokestatic a : (II)Ljava/lang/String;
    //   1963: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1966: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1969: astore #5
    //   1971: aload #5
    //   1973: arraylength
    //   1974: istore #6
    //   1976: iconst_0
    //   1977: istore #7
    //   1979: iload #7
    //   1981: iload #6
    //   1983: if_icmpge -> 2120
    //   1986: aload #5
    //   1988: iload #7
    //   1990: aaload
    //   1991: astore #8
    //   1993: aload #8
    //   1995: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1998: pop
    //   1999: aload #8
    //   2001: invokevirtual getModifiers : ()I
    //   2004: invokestatic isStatic : (I)Z
    //   2007: ifeq -> 2106
    //   2010: aload #8
    //   2012: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2015: arraylength
    //   2016: iconst_2
    //   2017: if_icmpne -> 2106
    //   2020: goto -> 2027
    //   2023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2026: athrow
    //   2027: aload #8
    //   2029: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2032: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2035: if_acmpne -> 2106
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2044: athrow
    //   2045: aload #8
    //   2047: iconst_1
    //   2048: invokevirtual setAccessible : (Z)V
    //   2051: aload #8
    //   2053: aconst_null
    //   2054: iconst_2
    //   2055: anewarray java/lang/Object
    //   2058: dup
    //   2059: iconst_0
    //   2060: aload_0
    //   2061: aastore
    //   2062: dup
    //   2063: iconst_1
    //   2064: aload_1
    //   2065: ifnonnull -> 2083
    //   2068: goto -> 2075
    //   2071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2074: athrow
    //   2075: aload_1
    //   2076: goto -> 2090
    //   2079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2082: athrow
    //   2083: aload_1
    //   2084: checkcast [B
    //   2087: invokevirtual clone : ()Ljava/lang/Object;
    //   2090: aastore
    //   2091: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2094: checkcast java/lang/Boolean
    //   2097: invokevirtual booleanValue : ()Z
    //   2100: istore #4
    //   2102: iload_2
    //   2103: ifeq -> 2120
    //   2106: iinc #7, 1
    //   2109: iload_2
    //   2110: ifeq -> 1979
    //   2113: goto -> 2120
    //   2116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2119: athrow
    //   2120: goto -> 2462
    //   2123: sipush #-4318
    //   2126: sipush #16136
    //   2129: invokestatic a : (II)Ljava/lang/String;
    //   2132: iconst_1
    //   2133: ldc burp/Ztgj
    //   2135: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2138: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2141: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2144: astore #5
    //   2146: aload #5
    //   2148: arraylength
    //   2149: istore #6
    //   2151: iconst_0
    //   2152: istore #7
    //   2154: iload #7
    //   2156: iload #6
    //   2158: if_icmpge -> 2296
    //   2161: aload #5
    //   2163: iload #7
    //   2165: aaload
    //   2166: astore #8
    //   2168: aload #8
    //   2170: invokevirtual getModifiers : ()I
    //   2173: invokestatic isStatic : (I)Z
    //   2176: ifne -> 2186
    //   2179: goto -> 2289
    //   2182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2185: athrow
    //   2186: aload #8
    //   2188: invokevirtual getType : ()Ljava/lang/Class;
    //   2191: astore #9
    //   2193: aload #9
    //   2195: ifnull -> 2276
    //   2198: aload #9
    //   2200: invokevirtual isPrimitive : ()Z
    //   2203: ifne -> 2276
    //   2206: goto -> 2213
    //   2209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2212: athrow
    //   2213: aload #9
    //   2215: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2218: ifnull -> 2276
    //   2221: goto -> 2228
    //   2224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2227: athrow
    //   2228: aload #9
    //   2230: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2233: invokevirtual getName : ()Ljava/lang/String;
    //   2236: ifnull -> 2276
    //   2239: goto -> 2246
    //   2242: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2245: athrow
    //   2246: aload #9
    //   2248: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2251: invokevirtual getName : ()Ljava/lang/String;
    //   2254: sipush #-4289
    //   2257: sipush #14014
    //   2260: invokestatic a : (II)Ljava/lang/String;
    //   2263: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2266: ifne -> 2276
    //   2269: goto -> 2276
    //   2272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2275: athrow
    //   2276: aload #8
    //   2278: iconst_1
    //   2279: invokevirtual setAccessible : (Z)V
    //   2282: aload #8
    //   2284: aconst_null
    //   2285: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2288: pop
    //   2289: iinc #7, 1
    //   2292: iload_2
    //   2293: ifeq -> 2154
    //   2296: sipush #-4318
    //   2299: sipush #16136
    //   2302: invokestatic a : (II)Ljava/lang/String;
    //   2305: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2308: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2311: astore #5
    //   2313: aload #5
    //   2315: arraylength
    //   2316: istore #6
    //   2318: iconst_0
    //   2319: istore #7
    //   2321: iload #7
    //   2323: iload #6
    //   2325: if_icmpge -> 2462
    //   2328: aload #5
    //   2330: iload #7
    //   2332: aaload
    //   2333: astore #8
    //   2335: aload #8
    //   2337: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2340: pop
    //   2341: aload #8
    //   2343: invokevirtual getModifiers : ()I
    //   2346: invokestatic isStatic : (I)Z
    //   2349: ifeq -> 2448
    //   2352: aload #8
    //   2354: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2357: arraylength
    //   2358: iconst_2
    //   2359: if_icmpne -> 2448
    //   2362: goto -> 2369
    //   2365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2368: athrow
    //   2369: aload #8
    //   2371: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2374: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2377: if_acmpne -> 2448
    //   2380: goto -> 2387
    //   2383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2386: athrow
    //   2387: aload #8
    //   2389: iconst_1
    //   2390: invokevirtual setAccessible : (Z)V
    //   2393: aload #8
    //   2395: aconst_null
    //   2396: iconst_2
    //   2397: anewarray java/lang/Object
    //   2400: dup
    //   2401: iconst_0
    //   2402: aload_0
    //   2403: aastore
    //   2404: dup
    //   2405: iconst_1
    //   2406: aload_1
    //   2407: ifnonnull -> 2425
    //   2410: goto -> 2417
    //   2413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2416: athrow
    //   2417: aload_1
    //   2418: goto -> 2432
    //   2421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2424: athrow
    //   2425: aload_1
    //   2426: checkcast [B
    //   2429: invokevirtual clone : ()Ljava/lang/Object;
    //   2432: aastore
    //   2433: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2436: checkcast java/lang/Boolean
    //   2439: invokevirtual booleanValue : ()Z
    //   2442: istore #4
    //   2444: iload_2
    //   2445: ifeq -> 2462
    //   2448: iinc #7, 1
    //   2451: iload_2
    //   2452: ifeq -> 2321
    //   2455: goto -> 2462
    //   2458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2461: athrow
    //   2462: iload #4
    //   2464: ifeq -> 2470
    //   2467: iload #4
    //   2469: ireturn
    //   2470: getstatic burp/Ztsu.ZE : Ljava/lang/String;
    //   2473: getstatic burp/Zlhq.Zw : Ljava/lang/Object;
    //   2476: checkcast java/math/BigInteger
    //   2479: invokevirtual intValue : ()I
    //   2482: bipush #32
    //   2484: irem
    //   2485: invokestatic abs : (I)I
    //   2488: invokevirtual charAt : (I)C
    //   2491: getstatic burp/Zk7e.ZP : Ljava/lang/String;
    //   2494: getstatic burp/Zgzv.Zb : Ljava/lang/Object;
    //   2497: checkcast java/math/BigInteger
    //   2500: invokevirtual intValue : ()I
    //   2503: bipush #32
    //   2505: irem
    //   2506: invokestatic abs : (I)I
    //   2509: invokevirtual charAt : (I)C
    //   2512: if_icmple -> 2858
    //   2515: sipush #-4316
    //   2518: sipush #-15366
    //   2521: invokestatic a : (II)Ljava/lang/String;
    //   2524: iconst_1
    //   2525: ldc burp/Zlqm
    //   2527: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2530: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2533: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2536: astore #5
    //   2538: aload #5
    //   2540: arraylength
    //   2541: istore #6
    //   2543: iconst_0
    //   2544: istore #7
    //   2546: iload #7
    //   2548: iload #6
    //   2550: if_icmpge -> 2688
    //   2553: aload #5
    //   2555: iload #7
    //   2557: aaload
    //   2558: astore #8
    //   2560: aload #8
    //   2562: invokevirtual getModifiers : ()I
    //   2565: invokestatic isStatic : (I)Z
    //   2568: ifne -> 2578
    //   2571: goto -> 2681
    //   2574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2577: athrow
    //   2578: aload #8
    //   2580: invokevirtual getType : ()Ljava/lang/Class;
    //   2583: astore #9
    //   2585: aload #9
    //   2587: ifnull -> 2668
    //   2590: aload #9
    //   2592: invokevirtual isPrimitive : ()Z
    //   2595: ifne -> 2668
    //   2598: goto -> 2605
    //   2601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2604: athrow
    //   2605: aload #9
    //   2607: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2610: ifnull -> 2668
    //   2613: goto -> 2620
    //   2616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2619: athrow
    //   2620: aload #9
    //   2622: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2625: invokevirtual getName : ()Ljava/lang/String;
    //   2628: ifnull -> 2668
    //   2631: goto -> 2638
    //   2634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2637: athrow
    //   2638: aload #9
    //   2640: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2643: invokevirtual getName : ()Ljava/lang/String;
    //   2646: sipush #-4289
    //   2649: sipush #14014
    //   2652: invokestatic a : (II)Ljava/lang/String;
    //   2655: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2658: ifne -> 2668
    //   2661: goto -> 2668
    //   2664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2667: athrow
    //   2668: aload #8
    //   2670: iconst_1
    //   2671: invokevirtual setAccessible : (Z)V
    //   2674: aload #8
    //   2676: aconst_null
    //   2677: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2680: pop
    //   2681: iinc #7, 1
    //   2684: iload_2
    //   2685: ifeq -> 2546
    //   2688: sipush #-4303
    //   2691: sipush #-31581
    //   2694: invokestatic a : (II)Ljava/lang/String;
    //   2697: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2700: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2703: astore #5
    //   2705: aload #5
    //   2707: arraylength
    //   2708: istore #6
    //   2710: iconst_0
    //   2711: istore #7
    //   2713: iload #7
    //   2715: iload #6
    //   2717: if_icmpge -> 2854
    //   2720: aload #5
    //   2722: iload #7
    //   2724: aaload
    //   2725: astore #8
    //   2727: aload #8
    //   2729: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2732: pop
    //   2733: aload #8
    //   2735: invokevirtual getModifiers : ()I
    //   2738: invokestatic isStatic : (I)Z
    //   2741: ifeq -> 2840
    //   2744: aload #8
    //   2746: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2749: arraylength
    //   2750: iconst_2
    //   2751: if_icmpne -> 2840
    //   2754: goto -> 2761
    //   2757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2760: athrow
    //   2761: aload #8
    //   2763: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2766: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2769: if_acmpne -> 2840
    //   2772: goto -> 2779
    //   2775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2778: athrow
    //   2779: aload #8
    //   2781: iconst_1
    //   2782: invokevirtual setAccessible : (Z)V
    //   2785: aload #8
    //   2787: aconst_null
    //   2788: iconst_2
    //   2789: anewarray java/lang/Object
    //   2792: dup
    //   2793: iconst_0
    //   2794: aload_0
    //   2795: aastore
    //   2796: dup
    //   2797: iconst_1
    //   2798: aload_1
    //   2799: ifnonnull -> 2817
    //   2802: goto -> 2809
    //   2805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2808: athrow
    //   2809: aload_1
    //   2810: goto -> 2824
    //   2813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2816: athrow
    //   2817: aload_1
    //   2818: checkcast [B
    //   2821: invokevirtual clone : ()Ljava/lang/Object;
    //   2824: aastore
    //   2825: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2828: checkcast java/lang/Boolean
    //   2831: invokevirtual booleanValue : ()Z
    //   2834: istore #4
    //   2836: iload_2
    //   2837: ifeq -> 2854
    //   2840: iinc #7, 1
    //   2843: iload_2
    //   2844: ifeq -> 2713
    //   2847: goto -> 2854
    //   2850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2853: athrow
    //   2854: iload_2
    //   2855: ifeq -> 3197
    //   2858: sipush #-4314
    //   2861: sipush #-13208
    //   2864: invokestatic a : (II)Ljava/lang/String;
    //   2867: iconst_1
    //   2868: ldc burp/Zr9b
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
    //   2989: sipush #-4289
    //   2992: sipush #14014
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
    //   3031: sipush #-4302
    //   3034: sipush #25371
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
    //   3197: iload #4
    //   3199: ifeq -> 3205
    //   3202: iload #4
    //   3204: ireturn
    //   3205: getstatic burp/Zt3p.ZD : Ljava/lang/String;
    //   3208: getstatic burp/Zza8.Zh : Ljava/lang/Object;
    //   3211: checkcast java/math/BigInteger
    //   3214: invokevirtual intValue : ()I
    //   3217: bipush #32
    //   3219: irem
    //   3220: invokestatic abs : (I)I
    //   3223: invokevirtual charAt : (I)C
    //   3226: getstatic burp/Zrtv.ZA : Ljava/lang/String;
    //   3229: getstatic burp/Zs34.ZE : Ljava/lang/Object;
    //   3232: checkcast java/math/BigInteger
    //   3235: invokevirtual intValue : ()I
    //   3238: bipush #32
    //   3240: irem
    //   3241: invokestatic abs : (I)I
    //   3244: invokevirtual charAt : (I)C
    //   3247: if_icmple -> 3593
    //   3250: sipush #-4296
    //   3253: sipush #2310
    //   3256: invokestatic a : (II)Ljava/lang/String;
    //   3259: iconst_1
    //   3260: ldc burp/Ze40
    //   3262: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3265: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3268: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3271: astore #5
    //   3273: aload #5
    //   3275: arraylength
    //   3276: istore #6
    //   3278: iconst_0
    //   3279: istore #7
    //   3281: iload #7
    //   3283: iload #6
    //   3285: if_icmpge -> 3423
    //   3288: aload #5
    //   3290: iload #7
    //   3292: aaload
    //   3293: astore #8
    //   3295: aload #8
    //   3297: invokevirtual getModifiers : ()I
    //   3300: invokestatic isStatic : (I)Z
    //   3303: ifne -> 3313
    //   3306: goto -> 3416
    //   3309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3312: athrow
    //   3313: aload #8
    //   3315: invokevirtual getType : ()Ljava/lang/Class;
    //   3318: astore #9
    //   3320: aload #9
    //   3322: ifnull -> 3403
    //   3325: aload #9
    //   3327: invokevirtual isPrimitive : ()Z
    //   3330: ifne -> 3403
    //   3333: goto -> 3340
    //   3336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3339: athrow
    //   3340: aload #9
    //   3342: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3345: ifnull -> 3403
    //   3348: goto -> 3355
    //   3351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3354: athrow
    //   3355: aload #9
    //   3357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3360: invokevirtual getName : ()Ljava/lang/String;
    //   3363: ifnull -> 3403
    //   3366: goto -> 3373
    //   3369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3372: athrow
    //   3373: aload #9
    //   3375: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3378: invokevirtual getName : ()Ljava/lang/String;
    //   3381: sipush #-4289
    //   3384: sipush #14014
    //   3387: invokestatic a : (II)Ljava/lang/String;
    //   3390: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3393: ifne -> 3403
    //   3396: goto -> 3403
    //   3399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3402: athrow
    //   3403: aload #8
    //   3405: iconst_1
    //   3406: invokevirtual setAccessible : (Z)V
    //   3409: aload #8
    //   3411: aconst_null
    //   3412: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3415: pop
    //   3416: iinc #7, 1
    //   3419: iload_2
    //   3420: ifeq -> 3281
    //   3423: sipush #-4292
    //   3426: sipush #-25567
    //   3429: invokestatic a : (II)Ljava/lang/String;
    //   3432: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3435: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3438: astore #5
    //   3440: aload #5
    //   3442: arraylength
    //   3443: istore #6
    //   3445: iconst_0
    //   3446: istore #7
    //   3448: iload #7
    //   3450: iload #6
    //   3452: if_icmpge -> 3589
    //   3455: aload #5
    //   3457: iload #7
    //   3459: aaload
    //   3460: astore #8
    //   3462: aload #8
    //   3464: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3467: pop
    //   3468: aload #8
    //   3470: invokevirtual getModifiers : ()I
    //   3473: invokestatic isStatic : (I)Z
    //   3476: ifeq -> 3575
    //   3479: aload #8
    //   3481: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3484: arraylength
    //   3485: iconst_2
    //   3486: if_icmpne -> 3575
    //   3489: goto -> 3496
    //   3492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3495: athrow
    //   3496: aload #8
    //   3498: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3501: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3504: if_acmpne -> 3575
    //   3507: goto -> 3514
    //   3510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3513: athrow
    //   3514: aload #8
    //   3516: iconst_1
    //   3517: invokevirtual setAccessible : (Z)V
    //   3520: aload #8
    //   3522: aconst_null
    //   3523: iconst_2
    //   3524: anewarray java/lang/Object
    //   3527: dup
    //   3528: iconst_0
    //   3529: aload_0
    //   3530: aastore
    //   3531: dup
    //   3532: iconst_1
    //   3533: aload_1
    //   3534: ifnonnull -> 3552
    //   3537: goto -> 3544
    //   3540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3543: athrow
    //   3544: aload_1
    //   3545: goto -> 3559
    //   3548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3551: athrow
    //   3552: aload_1
    //   3553: checkcast [B
    //   3556: invokevirtual clone : ()Ljava/lang/Object;
    //   3559: aastore
    //   3560: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3563: checkcast java/lang/Boolean
    //   3566: invokevirtual booleanValue : ()Z
    //   3569: istore #4
    //   3571: iload_2
    //   3572: ifeq -> 3589
    //   3575: iinc #7, 1
    //   3578: iload_2
    //   3579: ifeq -> 3448
    //   3582: goto -> 3589
    //   3585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3588: athrow
    //   3589: iload_2
    //   3590: ifeq -> 3932
    //   3593: sipush #-4313
    //   3596: sipush #30113
    //   3599: invokestatic a : (II)Ljava/lang/String;
    //   3602: iconst_1
    //   3603: ldc burp/Zgwq
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
    //   3724: sipush #-4289
    //   3727: sipush #14014
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
    //   3766: sipush #-4297
    //   3769: sipush #11466
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
    //   3932: iload #4
    //   3934: ifeq -> 3940
    //   3937: iload #4
    //   3939: ireturn
    //   3940: getstatic burp/Zram.Ze : Ljava/lang/String;
    //   3943: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   3946: checkcast java/math/BigInteger
    //   3949: invokevirtual intValue : ()I
    //   3952: bipush #32
    //   3954: irem
    //   3955: invokestatic abs : (I)I
    //   3958: invokevirtual charAt : (I)C
    //   3961: getstatic burp/Zsj5.Zn : Ljava/lang/String;
    //   3964: getstatic burp/Zzmu.Zy : Ljava/lang/Object;
    //   3967: checkcast java/math/BigInteger
    //   3970: invokevirtual intValue : ()I
    //   3973: bipush #32
    //   3975: irem
    //   3976: invokestatic abs : (I)I
    //   3979: invokevirtual charAt : (I)C
    //   3982: if_icmple -> 4328
    //   3985: sipush #-4305
    //   3988: sipush #-31090
    //   3991: invokestatic a : (II)Ljava/lang/String;
    //   3994: iconst_1
    //   3995: ldc burp/Zsgl
    //   3997: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4000: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4003: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4006: astore #5
    //   4008: aload #5
    //   4010: arraylength
    //   4011: istore #6
    //   4013: iconst_0
    //   4014: istore #7
    //   4016: iload #7
    //   4018: iload #6
    //   4020: if_icmpge -> 4158
    //   4023: aload #5
    //   4025: iload #7
    //   4027: aaload
    //   4028: astore #8
    //   4030: aload #8
    //   4032: invokevirtual getModifiers : ()I
    //   4035: invokestatic isStatic : (I)Z
    //   4038: ifne -> 4048
    //   4041: goto -> 4151
    //   4044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4047: athrow
    //   4048: aload #8
    //   4050: invokevirtual getType : ()Ljava/lang/Class;
    //   4053: astore #9
    //   4055: aload #9
    //   4057: ifnull -> 4138
    //   4060: aload #9
    //   4062: invokevirtual isPrimitive : ()Z
    //   4065: ifne -> 4138
    //   4068: goto -> 4075
    //   4071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4074: athrow
    //   4075: aload #9
    //   4077: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4080: ifnull -> 4138
    //   4083: goto -> 4090
    //   4086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4089: athrow
    //   4090: aload #9
    //   4092: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4095: invokevirtual getName : ()Ljava/lang/String;
    //   4098: ifnull -> 4138
    //   4101: goto -> 4108
    //   4104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4107: athrow
    //   4108: aload #9
    //   4110: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4113: invokevirtual getName : ()Ljava/lang/String;
    //   4116: sipush #-4289
    //   4119: sipush #14014
    //   4122: invokestatic a : (II)Ljava/lang/String;
    //   4125: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4128: ifne -> 4138
    //   4131: goto -> 4138
    //   4134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4137: athrow
    //   4138: aload #8
    //   4140: iconst_1
    //   4141: invokevirtual setAccessible : (Z)V
    //   4144: aload #8
    //   4146: aconst_null
    //   4147: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4150: pop
    //   4151: iinc #7, 1
    //   4154: iload_2
    //   4155: ifeq -> 4016
    //   4158: sipush #-4293
    //   4161: sipush #32367
    //   4164: invokestatic a : (II)Ljava/lang/String;
    //   4167: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4170: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4173: astore #5
    //   4175: aload #5
    //   4177: arraylength
    //   4178: istore #6
    //   4180: iconst_0
    //   4181: istore #7
    //   4183: iload #7
    //   4185: iload #6
    //   4187: if_icmpge -> 4324
    //   4190: aload #5
    //   4192: iload #7
    //   4194: aaload
    //   4195: astore #8
    //   4197: aload #8
    //   4199: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4202: pop
    //   4203: aload #8
    //   4205: invokevirtual getModifiers : ()I
    //   4208: invokestatic isStatic : (I)Z
    //   4211: ifeq -> 4310
    //   4214: aload #8
    //   4216: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4219: arraylength
    //   4220: iconst_2
    //   4221: if_icmpne -> 4310
    //   4224: goto -> 4231
    //   4227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4230: athrow
    //   4231: aload #8
    //   4233: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4236: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4239: if_acmpne -> 4310
    //   4242: goto -> 4249
    //   4245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4248: athrow
    //   4249: aload #8
    //   4251: iconst_1
    //   4252: invokevirtual setAccessible : (Z)V
    //   4255: aload #8
    //   4257: aconst_null
    //   4258: iconst_2
    //   4259: anewarray java/lang/Object
    //   4262: dup
    //   4263: iconst_0
    //   4264: aload_0
    //   4265: aastore
    //   4266: dup
    //   4267: iconst_1
    //   4268: aload_1
    //   4269: ifnonnull -> 4287
    //   4272: goto -> 4279
    //   4275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4278: athrow
    //   4279: aload_1
    //   4280: goto -> 4294
    //   4283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4286: athrow
    //   4287: aload_1
    //   4288: checkcast [B
    //   4291: invokevirtual clone : ()Ljava/lang/Object;
    //   4294: aastore
    //   4295: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4298: checkcast java/lang/Boolean
    //   4301: invokevirtual booleanValue : ()Z
    //   4304: istore #4
    //   4306: iload_2
    //   4307: ifeq -> 4324
    //   4310: iinc #7, 1
    //   4313: iload_2
    //   4314: ifeq -> 4183
    //   4317: goto -> 4324
    //   4320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4323: athrow
    //   4324: iload_2
    //   4325: ifeq -> 4667
    //   4328: sipush #-4315
    //   4331: sipush #-1672
    //   4334: invokestatic a : (II)Ljava/lang/String;
    //   4337: iconst_1
    //   4338: ldc burp/Zr04
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
    //   4459: sipush #-4289
    //   4462: sipush #14014
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
    //   4501: sipush #-4308
    //   4504: sipush #7766
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
    //   4667: iload #4
    //   4669: ifeq -> 4675
    //   4672: iload #4
    //   4674: ireturn
    //   4675: getstatic burp/Zeb7.ZH : Ljava/lang/String;
    //   4678: getstatic burp/Zqp.ZA : Ljava/lang/Object;
    //   4681: checkcast java/math/BigInteger
    //   4684: invokevirtual intValue : ()I
    //   4687: bipush #32
    //   4689: irem
    //   4690: invokestatic abs : (I)I
    //   4693: invokevirtual charAt : (I)C
    //   4696: getstatic burp/Zgpp.Zm : Ljava/lang/String;
    //   4699: getstatic burp/Zm52.ZR : Ljava/lang/Object;
    //   4702: checkcast java/math/BigInteger
    //   4705: invokevirtual intValue : ()I
    //   4708: bipush #32
    //   4710: irem
    //   4711: invokestatic abs : (I)I
    //   4714: invokevirtual charAt : (I)C
    //   4717: if_icmpgt -> 5063
    //   4720: sipush #-4307
    //   4723: sipush #2441
    //   4726: invokestatic a : (II)Ljava/lang/String;
    //   4729: iconst_1
    //   4730: ldc burp/Zt7x
    //   4732: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4735: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4738: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4741: astore #5
    //   4743: aload #5
    //   4745: arraylength
    //   4746: istore #6
    //   4748: iconst_0
    //   4749: istore #7
    //   4751: iload #7
    //   4753: iload #6
    //   4755: if_icmpge -> 4893
    //   4758: aload #5
    //   4760: iload #7
    //   4762: aaload
    //   4763: astore #8
    //   4765: aload #8
    //   4767: invokevirtual getModifiers : ()I
    //   4770: invokestatic isStatic : (I)Z
    //   4773: ifne -> 4783
    //   4776: goto -> 4886
    //   4779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4782: athrow
    //   4783: aload #8
    //   4785: invokevirtual getType : ()Ljava/lang/Class;
    //   4788: astore #9
    //   4790: aload #9
    //   4792: ifnull -> 4873
    //   4795: aload #9
    //   4797: invokevirtual isPrimitive : ()Z
    //   4800: ifne -> 4873
    //   4803: goto -> 4810
    //   4806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4809: athrow
    //   4810: aload #9
    //   4812: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4815: ifnull -> 4873
    //   4818: goto -> 4825
    //   4821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4824: athrow
    //   4825: aload #9
    //   4827: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4830: invokevirtual getName : ()Ljava/lang/String;
    //   4833: ifnull -> 4873
    //   4836: goto -> 4843
    //   4839: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4842: athrow
    //   4843: aload #9
    //   4845: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4848: invokevirtual getName : ()Ljava/lang/String;
    //   4851: sipush #-4289
    //   4854: sipush #14014
    //   4857: invokestatic a : (II)Ljava/lang/String;
    //   4860: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4863: ifne -> 4873
    //   4866: goto -> 4873
    //   4869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4872: athrow
    //   4873: aload #8
    //   4875: iconst_1
    //   4876: invokevirtual setAccessible : (Z)V
    //   4879: aload #8
    //   4881: aconst_null
    //   4882: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4885: pop
    //   4886: iinc #7, 1
    //   4889: iload_2
    //   4890: ifeq -> 4751
    //   4893: sipush #-4317
    //   4896: sipush #24539
    //   4899: invokestatic a : (II)Ljava/lang/String;
    //   4902: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4905: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4908: astore #5
    //   4910: aload #5
    //   4912: arraylength
    //   4913: istore #6
    //   4915: iconst_0
    //   4916: istore #7
    //   4918: iload #7
    //   4920: iload #6
    //   4922: if_icmpge -> 5059
    //   4925: aload #5
    //   4927: iload #7
    //   4929: aaload
    //   4930: astore #8
    //   4932: aload #8
    //   4934: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4937: pop
    //   4938: aload #8
    //   4940: invokevirtual getModifiers : ()I
    //   4943: invokestatic isStatic : (I)Z
    //   4946: ifeq -> 5045
    //   4949: aload #8
    //   4951: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4954: arraylength
    //   4955: iconst_2
    //   4956: if_icmpne -> 5045
    //   4959: goto -> 4966
    //   4962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4965: athrow
    //   4966: aload #8
    //   4968: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4971: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4974: if_acmpne -> 5045
    //   4977: goto -> 4984
    //   4980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4983: athrow
    //   4984: aload #8
    //   4986: iconst_1
    //   4987: invokevirtual setAccessible : (Z)V
    //   4990: aload #8
    //   4992: aconst_null
    //   4993: iconst_2
    //   4994: anewarray java/lang/Object
    //   4997: dup
    //   4998: iconst_0
    //   4999: aload_0
    //   5000: aastore
    //   5001: dup
    //   5002: iconst_1
    //   5003: aload_1
    //   5004: ifnonnull -> 5022
    //   5007: goto -> 5014
    //   5010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5013: athrow
    //   5014: aload_1
    //   5015: goto -> 5029
    //   5018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5021: athrow
    //   5022: aload_1
    //   5023: checkcast [B
    //   5026: invokevirtual clone : ()Ljava/lang/Object;
    //   5029: aastore
    //   5030: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5033: checkcast java/lang/Boolean
    //   5036: invokevirtual booleanValue : ()Z
    //   5039: istore #4
    //   5041: iload_2
    //   5042: ifeq -> 5059
    //   5045: iinc #7, 1
    //   5048: iload_2
    //   5049: ifeq -> 4918
    //   5052: goto -> 5059
    //   5055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5058: athrow
    //   5059: iload_2
    //   5060: ifeq -> 5402
    //   5063: sipush #-4319
    //   5066: sipush #-10748
    //   5069: invokestatic a : (II)Ljava/lang/String;
    //   5072: iconst_1
    //   5073: ldc burp/Ztes
    //   5075: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5078: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5081: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5084: astore #5
    //   5086: aload #5
    //   5088: arraylength
    //   5089: istore #6
    //   5091: iconst_0
    //   5092: istore #7
    //   5094: iload #7
    //   5096: iload #6
    //   5098: if_icmpge -> 5236
    //   5101: aload #5
    //   5103: iload #7
    //   5105: aaload
    //   5106: astore #8
    //   5108: aload #8
    //   5110: invokevirtual getModifiers : ()I
    //   5113: invokestatic isStatic : (I)Z
    //   5116: ifne -> 5126
    //   5119: goto -> 5229
    //   5122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5125: athrow
    //   5126: aload #8
    //   5128: invokevirtual getType : ()Ljava/lang/Class;
    //   5131: astore #9
    //   5133: aload #9
    //   5135: ifnull -> 5216
    //   5138: aload #9
    //   5140: invokevirtual isPrimitive : ()Z
    //   5143: ifne -> 5216
    //   5146: goto -> 5153
    //   5149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5152: athrow
    //   5153: aload #9
    //   5155: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5158: ifnull -> 5216
    //   5161: goto -> 5168
    //   5164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5167: athrow
    //   5168: aload #9
    //   5170: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5173: invokevirtual getName : ()Ljava/lang/String;
    //   5176: ifnull -> 5216
    //   5179: goto -> 5186
    //   5182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5185: athrow
    //   5186: aload #9
    //   5188: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5191: invokevirtual getName : ()Ljava/lang/String;
    //   5194: sipush #-4289
    //   5197: sipush #14014
    //   5200: invokestatic a : (II)Ljava/lang/String;
    //   5203: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5206: ifne -> 5216
    //   5209: goto -> 5216
    //   5212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5215: athrow
    //   5216: aload #8
    //   5218: iconst_1
    //   5219: invokevirtual setAccessible : (Z)V
    //   5222: aload #8
    //   5224: aconst_null
    //   5225: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5228: pop
    //   5229: iinc #7, 1
    //   5232: iload_2
    //   5233: ifeq -> 5094
    //   5236: sipush #-4299
    //   5239: sipush #-6578
    //   5242: invokestatic a : (II)Ljava/lang/String;
    //   5245: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5248: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5251: astore #5
    //   5253: aload #5
    //   5255: arraylength
    //   5256: istore #6
    //   5258: iconst_0
    //   5259: istore #7
    //   5261: iload #7
    //   5263: iload #6
    //   5265: if_icmpge -> 5402
    //   5268: aload #5
    //   5270: iload #7
    //   5272: aaload
    //   5273: astore #8
    //   5275: aload #8
    //   5277: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5280: pop
    //   5281: aload #8
    //   5283: invokevirtual getModifiers : ()I
    //   5286: invokestatic isStatic : (I)Z
    //   5289: ifeq -> 5388
    //   5292: aload #8
    //   5294: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5297: arraylength
    //   5298: iconst_2
    //   5299: if_icmpne -> 5388
    //   5302: goto -> 5309
    //   5305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5308: athrow
    //   5309: aload #8
    //   5311: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5314: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5317: if_acmpne -> 5388
    //   5320: goto -> 5327
    //   5323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5326: athrow
    //   5327: aload #8
    //   5329: iconst_1
    //   5330: invokevirtual setAccessible : (Z)V
    //   5333: aload #8
    //   5335: aconst_null
    //   5336: iconst_2
    //   5337: anewarray java/lang/Object
    //   5340: dup
    //   5341: iconst_0
    //   5342: aload_0
    //   5343: aastore
    //   5344: dup
    //   5345: iconst_1
    //   5346: aload_1
    //   5347: ifnonnull -> 5365
    //   5350: goto -> 5357
    //   5353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5356: athrow
    //   5357: aload_1
    //   5358: goto -> 5372
    //   5361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5364: athrow
    //   5365: aload_1
    //   5366: checkcast [B
    //   5369: invokevirtual clone : ()Ljava/lang/Object;
    //   5372: aastore
    //   5373: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5376: checkcast java/lang/Boolean
    //   5379: invokevirtual booleanValue : ()Z
    //   5382: istore #4
    //   5384: iload_2
    //   5385: ifeq -> 5402
    //   5388: iinc #7, 1
    //   5391: iload_2
    //   5392: ifeq -> 5261
    //   5395: goto -> 5402
    //   5398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5401: athrow
    //   5402: iload #4
    //   5404: ireturn
    //   5405: astore_3
    //   5406: new java/lang/Exception
    //   5409: dup
    //   5410: aload_3
    //   5411: invokevirtual getMessage : ()Ljava/lang/String;
    //   5414: invokespecial <init> : (Ljava/lang/String;)V
    //   5417: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2469	5405	java/lang/Throwable
    //   58	234	237	java/lang/Throwable
    //   204	271	274	java/lang/Throwable
    //   241	308	311	java/lang/Throwable
    //   278	345	348	java/lang/Throwable
    //   315	382	385	java/lang/Throwable
    //   352	419	422	java/lang/Throwable
    //   389	456	459	java/lang/Throwable
    //   426	493	496	java/lang/Throwable
    //   463	530	533	java/lang/Throwable
    //   500	567	570	java/lang/Throwable
    //   537	604	607	java/lang/Throwable
    //   574	641	644	java/lang/Throwable
    //   611	678	681	java/lang/Throwable
    //   648	715	718	java/lang/Throwable
    //   685	752	755	java/lang/Throwable
    //   722	789	792	java/lang/Throwable
    //   759	826	829	java/lang/Throwable
    //   796	863	866	java/lang/Throwable
    //   833	900	903	java/lang/Throwable
    //   870	937	940	java/lang/Throwable
    //   907	974	977	java/lang/Throwable
    //   944	1011	1014	java/lang/Throwable
    //   981	1048	1051	java/lang/Throwable
    //   1018	1085	1088	java/lang/Throwable
    //   1055	1122	1125	java/lang/Throwable
    //   1092	1159	1162	java/lang/Throwable
    //   1129	1196	1199	java/lang/Throwable
    //   1166	1233	1236	java/lang/Throwable
    //   1203	1270	1273	java/lang/Throwable
    //   1240	1307	1310	java/lang/Throwable
    //   1277	1344	1347	java/lang/Throwable
    //   1314	1377	1380	java/lang/Throwable
    //   1443	1457	1457	java/lang/Throwable
    //   1468	1481	1484	java/lang/Throwable
    //   1473	1496	1499	java/lang/Throwable
    //   1488	1514	1517	java/lang/Throwable
    //   1503	1544	1547	java/lang/Throwable
    //   1610	1637	1640	java/lang/Throwable
    //   1627	1658	1661	java/lang/Throwable
    //   1644	1688	1691	java/lang/Throwable
    //   1665	1699	1699	java/lang/Throwable
    //   1710	1726	1729	java/lang/Throwable
    //   1826	1840	1840	java/lang/Throwable
    //   1851	1864	1867	java/lang/Throwable
    //   1856	1879	1882	java/lang/Throwable
    //   1871	1897	1900	java/lang/Throwable
    //   1886	1927	1930	java/lang/Throwable
    //   1993	2020	2023	java/lang/Throwable
    //   2010	2038	2041	java/lang/Throwable
    //   2027	2068	2071	java/lang/Throwable
    //   2045	2079	2079	java/lang/Throwable
    //   2102	2113	2116	java/lang/Throwable
    //   2168	2182	2182	java/lang/Throwable
    //   2193	2206	2209	java/lang/Throwable
    //   2198	2221	2224	java/lang/Throwable
    //   2213	2239	2242	java/lang/Throwable
    //   2228	2269	2272	java/lang/Throwable
    //   2335	2362	2365	java/lang/Throwable
    //   2352	2380	2383	java/lang/Throwable
    //   2369	2410	2413	java/lang/Throwable
    //   2387	2421	2421	java/lang/Throwable
    //   2444	2455	2458	java/lang/Throwable
    //   2470	3204	5405	java/lang/Throwable
    //   2560	2574	2574	java/lang/Throwable
    //   2585	2598	2601	java/lang/Throwable
    //   2590	2613	2616	java/lang/Throwable
    //   2605	2631	2634	java/lang/Throwable
    //   2620	2661	2664	java/lang/Throwable
    //   2727	2754	2757	java/lang/Throwable
    //   2744	2772	2775	java/lang/Throwable
    //   2761	2802	2805	java/lang/Throwable
    //   2779	2813	2813	java/lang/Throwable
    //   2836	2847	2850	java/lang/Throwable
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
    //   3205	3939	5405	java/lang/Throwable
    //   3295	3309	3309	java/lang/Throwable
    //   3320	3333	3336	java/lang/Throwable
    //   3325	3348	3351	java/lang/Throwable
    //   3340	3366	3369	java/lang/Throwable
    //   3355	3396	3399	java/lang/Throwable
    //   3462	3489	3492	java/lang/Throwable
    //   3479	3507	3510	java/lang/Throwable
    //   3496	3537	3540	java/lang/Throwable
    //   3514	3548	3548	java/lang/Throwable
    //   3571	3582	3585	java/lang/Throwable
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
    //   3940	4674	5405	java/lang/Throwable
    //   4030	4044	4044	java/lang/Throwable
    //   4055	4068	4071	java/lang/Throwable
    //   4060	4083	4086	java/lang/Throwable
    //   4075	4101	4104	java/lang/Throwable
    //   4090	4131	4134	java/lang/Throwable
    //   4197	4224	4227	java/lang/Throwable
    //   4214	4242	4245	java/lang/Throwable
    //   4231	4272	4275	java/lang/Throwable
    //   4249	4283	4283	java/lang/Throwable
    //   4306	4317	4320	java/lang/Throwable
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
    //   4675	5404	5405	java/lang/Throwable
    //   4765	4779	4779	java/lang/Throwable
    //   4790	4803	4806	java/lang/Throwable
    //   4795	4818	4821	java/lang/Throwable
    //   4810	4836	4839	java/lang/Throwable
    //   4825	4866	4869	java/lang/Throwable
    //   4932	4959	4962	java/lang/Throwable
    //   4949	4977	4980	java/lang/Throwable
    //   4966	5007	5010	java/lang/Throwable
    //   4984	5018	5018	java/lang/Throwable
    //   5041	5052	5055	java/lang/Throwable
    //   5108	5122	5122	java/lang/Throwable
    //   5133	5146	5149	java/lang/Throwable
    //   5138	5161	5164	java/lang/Throwable
    //   5153	5179	5182	java/lang/Throwable
    //   5168	5209	5212	java/lang/Throwable
    //   5275	5302	5305	java/lang/Throwable
    //   5292	5320	5323	java/lang/Throwable
    //   5309	5350	5353	java/lang/Throwable
    //   5327	5361	5361	java/lang/Throwable
    //   5384	5395	5398	java/lang/Throwable
  }
  
  static void Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÂzLJ`llá\\töìtË·Õ\\tcfo¦Ç\\teÖèÙÔÒ 8\\t,Áàñõ ÷9ñcv|oH`@/|n±Ð­Ó"Ç\\b\\twñÜ¾çõ¤½\\t:bO© \\b| ·{®bâ18\\rÊ½-,Áw&LWôñ¶]\\tî{lúde¸|SË.z\\tÙJJ& þ5FM)«{TM'­\\f|[ ªjîBÄNpU©µÑ9©nªèÝo?³k(@®T6>¬ ÊeäHJ¯ÏÀ}ïö.DN,\\t6[hä\\t¨ñ\\tKH-\\nl¨¹v M&x7øã¼ÛÎ´bZG\ÀRt¨W¶R3sí1£¢rÕDÚp!í­l¾Xz=å~÷ÿ=_j&\ $9¸?©CTviU\\t$QMÃ»\\tj5\\t¥è]>s\\t_3¯e<E±f\\tuùê<n±ë\\t{wl'dÙì_\\b×S3R_\\tOÓ­y|Æ­éq\\tW®»ªNù\\t&¶ÕÙS[ç\\tÉ}1fÏç'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
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
    //   68: ldc '´-oþE<\\tä4"wü=°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Zzoi.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzoi.b : [Ljava/lang/String;
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
    //   212: bipush #82
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #76
    //   234: goto -> 244
    //   237: bipush #80
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
    //   300: sipush #-4304
    //   303: sipush #8756
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzoi.ZR : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-4295
    //   319: sipush #6045
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zzoi.ZI : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEF35) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */