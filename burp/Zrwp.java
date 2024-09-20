package burp;

import java.math.BigInteger;

class Zrwp extends ClassLoader {
  static String ZS;
  
  static Object Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZD(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zkeb.ZH : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zs5y.Zd : Ljava/lang/Object;
    //   22: getstatic burp/Zm69.Zg : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zsp9.ZV : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zelt.ZC : Ljava/lang/Object;
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
    //   205: getstatic burp/Zer1.ZV : Ljava/lang/String;
    //   208: getstatic burp/Zt81.ZY : Ljava/lang/Object;
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
    //   242: getstatic burp/Zld9.Zx : Ljava/lang/String;
    //   245: getstatic burp/Ztlo.ZP : Ljava/lang/Object;
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
    //   279: getstatic burp/Zzac.ZE : Ljava/lang/String;
    //   282: getstatic burp/Zk9q.ZH : Ljava/lang/Object;
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
    //   316: getstatic burp/Ztvg.ZZ : Ljava/lang/String;
    //   319: getstatic burp/Zesw.ZB : Ljava/lang/Object;
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
    //   353: getstatic burp/Zgcg.Zk : Ljava/lang/String;
    //   356: getstatic burp/Zbw5.ZR : Ljava/lang/Object;
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
    //   390: getstatic burp/Zer1.ZV : Ljava/lang/String;
    //   393: getstatic burp/Zzii.ZO : Ljava/lang/Object;
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
    //   427: getstatic burp/Ztq4.Zb : Ljava/lang/String;
    //   430: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
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
    //   464: getstatic burp/Zesw.ZC : Ljava/lang/String;
    //   467: getstatic burp/Zsu2.ZG : Ljava/lang/Object;
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
    //   501: getstatic burp/Zbsz.Zu : Ljava/lang/String;
    //   504: getstatic burp/Zrom.ZF : Ljava/lang/Object;
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
    //   538: getstatic burp/Zsbv.Zr : Ljava/lang/String;
    //   541: getstatic burp/Ztzj.Zv : Ljava/lang/Object;
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
    //   575: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   578: getstatic burp/Zsjw.Zw : Ljava/lang/Object;
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
    //   612: getstatic burp/Zb6m.ZR : Ljava/lang/String;
    //   615: getstatic burp/Zsjc.ZX : Ljava/lang/Object;
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
    //   649: getstatic burp/Zlid.ZU : Ljava/lang/String;
    //   652: getstatic burp/Zt85.Zl : Ljava/lang/Object;
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
    //   686: getstatic burp/Zrb6.ZP : Ljava/lang/String;
    //   689: getstatic burp/Zmdf.ZH : Ljava/lang/Object;
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
    //   723: getstatic burp/Zs1d.Zl : Ljava/lang/String;
    //   726: getstatic burp/Zld9.ZF : Ljava/lang/Object;
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
    //   760: getstatic burp/Zbx4.ZS : Ljava/lang/String;
    //   763: getstatic burp/Zv8l.ZL : Ljava/lang/Object;
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
    //   797: getstatic burp/Zz41.Zc : Ljava/lang/String;
    //   800: getstatic burp/Zedu.ZL : Ljava/lang/Object;
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
    //   834: getstatic burp/Zex0.Zk : Ljava/lang/String;
    //   837: getstatic burp/Zql.Zt : Ljava/lang/Object;
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
    //   871: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   874: getstatic burp/Zbnz.Zb : Ljava/lang/Object;
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
    //   908: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   911: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
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
    //   945: getstatic burp/Zt5t.ZK : Ljava/lang/String;
    //   948: getstatic burp/Zmig.Zh : Ljava/lang/Object;
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
    //   982: getstatic burp/Zr14.ZL : Ljava/lang/String;
    //   985: getstatic burp/Zs1k.Ze : Ljava/lang/Object;
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
    //   1019: getstatic burp/Zzmc.Zr : Ljava/lang/String;
    //   1022: getstatic burp/Zzgb.ZG : Ljava/lang/Object;
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
    //   1056: getstatic burp/Zkca.Ze : Ljava/lang/String;
    //   1059: getstatic burp/Zbjx.ZT : Ljava/lang/Object;
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
    //   1093: getstatic burp/Zt6z.ZL : Ljava/lang/String;
    //   1096: getstatic burp/Zlwc.ZG : Ljava/lang/Object;
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
    //   1130: getstatic burp/Zsfj.Zg : Ljava/lang/String;
    //   1133: getstatic burp/Zkf6.ZS : Ljava/lang/Object;
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
    //   1167: getstatic burp/Zrqi.Zu : Ljava/lang/String;
    //   1170: getstatic burp/Zmui.Zz : Ljava/lang/Object;
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
    //   1204: getstatic burp/Zb_1.Zc : Ljava/lang/String;
    //   1207: getstatic burp/Zxn9.ZN : Ljava/lang/Object;
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
    //   1241: getstatic burp/Zrjq.Zx : Ljava/lang/String;
    //   1244: getstatic burp/Zejz.ZF : Ljava/lang/Object;
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
    //   1278: getstatic burp/Zb9q.Zk : Ljava/lang/String;
    //   1281: getstatic burp/Zgsb.Zl : Ljava/lang/Object;
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
    //   1315: getstatic burp/Ztq4.Zb : Ljava/lang/String;
    //   1318: getstatic burp/Zk7o.ZO : Ljava/lang/Object;
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
    //   1352: getstatic burp/Zmtr.Zd : Ljava/lang/String;
    //   1355: getstatic burp/Zl_a.ZP : Ljava/lang/Object;
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
    //   1395: putstatic burp/Ztl6.Zb : Ljava/lang/String;
    //   1398: sipush #6554
    //   1401: sipush #25530
    //   1404: invokestatic a : (II)Ljava/lang/String;
    //   1407: iconst_1
    //   1408: ldc burp/Zgpx
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
    //   1529: sipush #6549
    //   1532: sipush #17530
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
    //   1571: sipush #6553
    //   1574: sipush #12279
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
    //   1733: new java/io/ByteArrayOutputStream
    //   1736: dup
    //   1737: invokespecial <init> : ()V
    //   1740: astore #4
    //   1742: sipush #6558
    //   1745: aload #4
    //   1747: sipush #202
    //   1750: invokevirtual write : (I)V
    //   1753: sipush #28411
    //   1756: aload #4
    //   1758: sipush #254
    //   1761: invokevirtual write : (I)V
    //   1764: aload #4
    //   1766: sipush #186
    //   1769: invokevirtual write : (I)V
    //   1772: aload #4
    //   1774: sipush #190
    //   1777: invokevirtual write : (I)V
    //   1780: aload #4
    //   1782: iconst_0
    //   1783: invokevirtual write : (I)V
    //   1786: aload #4
    //   1788: iconst_1
    //   1789: invokevirtual write : (I)V
    //   1792: aload #4
    //   1794: iconst_0
    //   1795: invokevirtual write : (I)V
    //   1798: aload #4
    //   1800: bipush #50
    //   1802: invokevirtual write : (I)V
    //   1805: aload #4
    //   1807: getstatic burp/Zlo4.ZC : Ljava/lang/Object;
    //   1810: checkcast java/math/BigInteger
    //   1813: invokevirtual toByteArray : ()[B
    //   1816: invokevirtual write : ([B)V
    //   1819: aload #4
    //   1821: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   1824: checkcast java/math/BigInteger
    //   1827: invokevirtual toByteArray : ()[B
    //   1830: invokevirtual write : ([B)V
    //   1833: aload #4
    //   1835: getstatic burp/Zgq_.ZM : Ljava/lang/Object;
    //   1838: checkcast java/math/BigInteger
    //   1841: invokevirtual toByteArray : ()[B
    //   1844: invokevirtual write : ([B)V
    //   1847: aload #4
    //   1849: invokevirtual toByteArray : ()[B
    //   1852: astore #5
    //   1854: aconst_null
    //   1855: astore #6
    //   1857: invokestatic a : (II)Ljava/lang/String;
    //   1860: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1863: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1866: astore #7
    //   1868: aload #7
    //   1870: arraylength
    //   1871: istore #8
    //   1873: iconst_0
    //   1874: istore #9
    //   1876: iload #9
    //   1878: iload #8
    //   1880: if_icmpge -> 2008
    //   1883: aload #7
    //   1885: iload #9
    //   1887: aaload
    //   1888: astore #10
    //   1890: aload #10
    //   1892: invokevirtual getName : ()Ljava/lang/String;
    //   1895: sipush #6548
    //   1898: sipush #7005
    //   1901: invokestatic a : (II)Ljava/lang/String;
    //   1904: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1907: ifeq -> 2001
    //   1910: aload #10
    //   1912: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1915: astore #11
    //   1917: aload #11
    //   1919: arraylength
    //   1920: iconst_4
    //   1921: if_icmpeq -> 1931
    //   1924: goto -> 2001
    //   1927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1930: athrow
    //   1931: aload #11
    //   1933: iconst_0
    //   1934: aaload
    //   1935: ldc java/lang/String
    //   1937: if_acmpeq -> 1947
    //   1940: goto -> 2001
    //   1943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1946: athrow
    //   1947: aload #11
    //   1949: iconst_1
    //   1950: aaload
    //   1951: ldc [B
    //   1953: if_acmpeq -> 1963
    //   1956: goto -> 2001
    //   1959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1962: athrow
    //   1963: aload #11
    //   1965: iconst_2
    //   1966: aaload
    //   1967: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1970: if_acmpeq -> 1980
    //   1973: goto -> 2001
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #11
    //   1982: iconst_3
    //   1983: aaload
    //   1984: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1987: if_acmpeq -> 1997
    //   1990: goto -> 2001
    //   1993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1996: athrow
    //   1997: aload #10
    //   1999: astore #6
    //   2001: iinc #9, 1
    //   2004: iload_2
    //   2005: ifeq -> 1876
    //   2008: aload #6
    //   2010: iconst_1
    //   2011: invokevirtual setAccessible : (Z)V
    //   2014: ldc burp/Zk8g
    //   2016: iconst_0
    //   2017: anewarray java/lang/Class
    //   2020: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2023: astore #7
    //   2025: aload #7
    //   2027: iconst_1
    //   2028: invokevirtual setAccessible : (Z)V
    //   2031: aload #6
    //   2033: aload #7
    //   2035: iconst_0
    //   2036: anewarray java/lang/Object
    //   2039: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2042: iconst_4
    //   2043: anewarray java/lang/Object
    //   2046: dup
    //   2047: iconst_0
    //   2048: sipush #6559
    //   2051: sipush #23522
    //   2054: invokestatic a : (II)Ljava/lang/String;
    //   2057: aastore
    //   2058: dup
    //   2059: iconst_1
    //   2060: aload #5
    //   2062: aastore
    //   2063: dup
    //   2064: iconst_2
    //   2065: iconst_0
    //   2066: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2069: aastore
    //   2070: dup
    //   2071: iconst_3
    //   2072: aload #5
    //   2074: arraylength
    //   2075: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2078: aastore
    //   2079: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2082: pop
    //   2083: goto -> 2088
    //   2086: astore #4
    //   2088: getstatic burp/Zk92.Zc : Ljava/lang/String;
    //   2091: getstatic burp/Zbnz.Zb : Ljava/lang/Object;
    //   2094: checkcast java/math/BigInteger
    //   2097: invokevirtual intValue : ()I
    //   2100: bipush #32
    //   2102: irem
    //   2103: invokestatic abs : (I)I
    //   2106: invokevirtual charAt : (I)C
    //   2109: getstatic burp/Zgrz.Zu : Ljava/lang/String;
    //   2112: getstatic burp/Zr1h.Z_ : Ljava/lang/Object;
    //   2115: checkcast java/math/BigInteger
    //   2118: invokevirtual intValue : ()I
    //   2121: bipush #32
    //   2123: irem
    //   2124: invokestatic abs : (I)I
    //   2127: invokevirtual charAt : (I)C
    //   2130: if_icmple -> 2237
    //   2133: getstatic burp/Zskf.ZV : Ljava/lang/String;
    //   2136: getstatic burp/Zti4.Zi : Ljava/lang/Object;
    //   2139: checkcast java/math/BigInteger
    //   2142: invokevirtual intValue : ()I
    //   2145: bipush #32
    //   2147: irem
    //   2148: invokestatic abs : (I)I
    //   2151: invokevirtual charAt : (I)C
    //   2154: getstatic burp/Zbjx.ZA : Ljava/lang/String;
    //   2157: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   2160: checkcast java/math/BigInteger
    //   2163: invokevirtual intValue : ()I
    //   2166: bipush #32
    //   2168: irem
    //   2169: invokestatic abs : (I)I
    //   2172: invokevirtual charAt : (I)C
    //   2175: if_icmpgt -> 2237
    //   2178: goto -> 2185
    //   2181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2184: athrow
    //   2185: getstatic burp/Zlc2.Zz : Ljava/lang/String;
    //   2188: getstatic burp/Zk5k.Zr : Ljava/lang/Object;
    //   2191: checkcast java/math/BigInteger
    //   2194: invokevirtual intValue : ()I
    //   2197: bipush #32
    //   2199: irem
    //   2200: invokestatic abs : (I)I
    //   2203: invokevirtual charAt : (I)C
    //   2206: getstatic burp/Zv8l.Zo : Ljava/lang/String;
    //   2209: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   2212: checkcast java/math/BigInteger
    //   2215: invokevirtual intValue : ()I
    //   2218: bipush #32
    //   2220: irem
    //   2221: invokestatic abs : (I)I
    //   2224: invokevirtual charAt : (I)C
    //   2227: if_icmple -> 2245
    //   2230: goto -> 2237
    //   2233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2236: athrow
    //   2237: iconst_1
    //   2238: goto -> 2246
    //   2241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2244: athrow
    //   2245: iconst_0
    //   2246: ireturn
    //   2247: astore_3
    //   2248: new java/lang/Exception
    //   2251: dup
    //   2252: aload_3
    //   2253: invokevirtual getMessage : ()Ljava/lang/String;
    //   2256: invokespecial <init> : (Ljava/lang/String;)V
    //   2259: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2246	2247	java/lang/Throwable
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
    //   1733	2083	2086	java/lang/Throwable
    //   1917	1927	1927	java/lang/Throwable
    //   1931	1943	1943	java/lang/Throwable
    //   1947	1959	1959	java/lang/Throwable
    //   1963	1976	1976	java/lang/Throwable
    //   1980	1993	1993	java/lang/Throwable
    //   2088	2178	2181	java/lang/Throwable
    //   2133	2230	2233	java/lang/Throwable
    //   2185	2241	2241	java/lang/Throwable
  }
  
  static void Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZF(Object paramObject) {
    Zlbd.Zq = a(6557, -12020);
    Zlbd.ZU = new BigInteger(a(6556, 32150));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zbw5.ZC.charAt(Math.abs(((BigInteger)Zg1l.Zg).intValue() % 32)) > Zgis.Zh.charAt(Math.abs(((BigInteger)Zz0y.Zp).intValue() % 32))) {
          try {
            Zrcy.Zs(Class.forName(a(6555, 12099)));
            if (bool)
              Ztbn.Zr(Class.forName(a(6550, 24249))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztbn.Zr(Class.forName(a(6550, 24249)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÆÊJ4TJãÅMÏÞfgæ;ÙÀ¦Û]XT­4ýMUà=ïiãá}¬Ö¨¿F3bàð\\t[ËçÒ¢Åù!2/ÚÕ»+ j8_ÅÕ8@+i+f«·¸àb¹*püóG3ÈUÈ¢ñuÑ\\n`8Ò\\b¯fËÜâZÎ ÂKE!Ôx®Öâx+·äWjØ`rÀ«ÍÎ\\t0mP\\bË×s\\tÊgtIãGv\\t%c:öÎ\\t|Ó4j>_~ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_1
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'óËê\\t/ºÄ£Ônø©'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #77
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zrwp.a : [Ljava/lang/String;
    //   130: bipush #11
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zrwp.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #41
    //   214: goto -> 244
    //   217: bipush #76
    //   219: goto -> 244
    //   222: bipush #102
    //   224: goto -> 244
    //   227: bipush #85
    //   229: goto -> 244
    //   232: bipush #90
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #51
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: sipush #6552
    //   303: sipush #-15249
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrwp.ZS : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #13
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #61
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #10
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-57
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-94
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-87
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-126
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #83
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-13
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #81
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-111
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #114
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-91
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #63
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-85
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-88
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #31
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-25
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #71
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #95
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-98
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-28
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-13
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #54
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: iconst_2
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-33
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #99
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-46
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-122
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #114
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #7
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #61
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zrwp.Zk : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x199C) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */