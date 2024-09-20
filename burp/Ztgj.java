package burp;

import java.math.BigInteger;

class Ztgj extends ClassLoader {
  static String Zw;
  
  static Object ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zk88.ZX : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zgly.ZN : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxzp.Zh : Ljava/lang/Object;
    //   22: getstatic burp/Zzri.ZG : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zgly.ZN : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zmuj.ZH : Ljava/lang/Object;
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
    //   205: getstatic burp/Zmze.ZO : Ljava/lang/String;
    //   208: getstatic burp/Zlo4.ZC : Ljava/lang/Object;
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
    //   242: getstatic burp/Zls0.ZI : Ljava/lang/String;
    //   245: getstatic burp/Zmy4.ZB : Ljava/lang/Object;
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
    //   279: getstatic burp/Zvk.ZG : Ljava/lang/String;
    //   282: getstatic burp/Zs26.Z_ : Ljava/lang/Object;
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
    //   316: getstatic burp/Zzco.Zu : Ljava/lang/String;
    //   319: getstatic burp/Zzco.ZC : Ljava/lang/Object;
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
    //   353: getstatic burp/Zrly.ZS : Ljava/lang/String;
    //   356: getstatic burp/Zsow.ZV : Ljava/lang/Object;
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
    //   390: getstatic burp/Zrka.Zy : Ljava/lang/String;
    //   393: getstatic burp/Zez0.ZT : Ljava/lang/Object;
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
    //   427: getstatic burp/Zgp_.Zn : Ljava/lang/String;
    //   430: getstatic burp/Zl8i.ZY : Ljava/lang/Object;
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
    //   464: getstatic burp/Zeuz.Zb : Ljava/lang/String;
    //   467: getstatic burp/Ztv8.ZS : Ljava/lang/Object;
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
    //   501: getstatic burp/Zb38.Zr : Ljava/lang/String;
    //   504: getstatic burp/Ze57.ZR : Ljava/lang/Object;
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
    //   538: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   541: getstatic burp/Zmha.ZM : Ljava/lang/Object;
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
    //   575: getstatic burp/Zg8v.Zd : Ljava/lang/String;
    //   578: getstatic burp/Zls0.ZZ : Ljava/lang/Object;
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
    //   612: getstatic burp/Zro2.ZF : Ljava/lang/String;
    //   615: getstatic burp/Ztp.Zp : Ljava/lang/Object;
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
    //   649: getstatic burp/Zgds.ZA : Ljava/lang/String;
    //   652: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
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
    //   686: getstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   689: getstatic burp/Zgjj.ZW : Ljava/lang/Object;
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
    //   723: getstatic burp/Ztgj.Zw : Ljava/lang/String;
    //   726: getstatic burp/Zlbt.ZF : Ljava/lang/Object;
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
    //   760: getstatic burp/Zvos.Zk : Ljava/lang/String;
    //   763: getstatic burp/Zls0.ZZ : Ljava/lang/Object;
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
    //   797: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   800: getstatic burp/Zlbt.ZF : Ljava/lang/Object;
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
    //   834: getstatic burp/Zxo4.ZW : Ljava/lang/String;
    //   837: getstatic burp/Zb38.ZC : Ljava/lang/Object;
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
    //   871: getstatic burp/Zml.ZN : Ljava/lang/String;
    //   874: getstatic burp/Zk88.ZX : Ljava/lang/Object;
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
    //   908: getstatic burp/Zl8i.Zb : Ljava/lang/String;
    //   911: getstatic burp/Zmy4.ZB : Ljava/lang/Object;
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
    //   945: getstatic burp/Zkgp.ZM : Ljava/lang/String;
    //   948: getstatic burp/Zll8.ZE : Ljava/lang/Object;
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
    //   982: getstatic burp/Zez0.Zp : Ljava/lang/String;
    //   985: getstatic burp/Zlo4.ZC : Ljava/lang/Object;
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
    //   1019: getstatic burp/Zle6.Zh : Ljava/lang/String;
    //   1022: getstatic burp/Zzh1.Zf : Ljava/lang/Object;
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
    //   1056: getstatic burp/Zro2.ZF : Ljava/lang/String;
    //   1059: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
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
    //   1093: getstatic burp/Zzmo.Zx : Ljava/lang/String;
    //   1096: getstatic burp/Zstf.ZA : Ljava/lang/Object;
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
    //   1130: getstatic burp/Zexn.ZE : Ljava/lang/String;
    //   1133: getstatic burp/Zkht.ZR : Ljava/lang/Object;
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
    //   1167: getstatic burp/Ze_0.Zi : Ljava/lang/String;
    //   1170: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
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
    //   1204: getstatic burp/Zsjo.Zu : Ljava/lang/String;
    //   1207: getstatic burp/Zkht.ZR : Ljava/lang/Object;
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
    //   1241: getstatic burp/Ztp.ZG : Ljava/lang/String;
    //   1244: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
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
    //   1278: getstatic burp/Zle6.Zh : Ljava/lang/String;
    //   1281: getstatic burp/Zxc.ZR : Ljava/lang/Object;
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
    //   1315: getstatic burp/Zez0.Zp : Ljava/lang/String;
    //   1318: getstatic burp/Zgja.ZD : Ljava/lang/Object;
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
    //   1352: getstatic burp/Zb4m.ZQ : Ljava/lang/String;
    //   1355: getstatic burp/Zxx4.Zo : Ljava/lang/Object;
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
    //   1395: putstatic burp/Zsjo.Zu : Ljava/lang/String;
    //   1398: sipush #-1510
    //   1401: sipush #14386
    //   1404: invokestatic a : (II)Ljava/lang/String;
    //   1407: iconst_1
    //   1408: ldc burp/Zgyk
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
    //   1529: sipush #-1521
    //   1532: sipush #5150
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
    //   1571: sipush #-1527
    //   1574: sipush #24453
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
    //   1733: getstatic burp/Zb4m.Zp : Ljava/lang/Object;
    //   1736: checkcast java/math/BigInteger
    //   1739: invokevirtual toByteArray : ()[B
    //   1742: astore #4
    //   1744: iconst_0
    //   1745: istore #6
    //   1747: iconst_0
    //   1748: istore #7
    //   1750: iload #7
    //   1752: aload #4
    //   1754: arraylength
    //   1755: if_icmpge -> 1901
    //   1758: aload #4
    //   1760: iload #7
    //   1762: baload
    //   1763: istore #8
    //   1765: iload #8
    //   1767: bipush #48
    //   1769: if_icmplt -> 1786
    //   1772: iload #8
    //   1774: bipush #57
    //   1776: if_icmple -> 1884
    //   1779: goto -> 1786
    //   1782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1785: athrow
    //   1786: iload #8
    //   1788: bipush #65
    //   1790: if_icmplt -> 1814
    //   1793: goto -> 1800
    //   1796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1799: athrow
    //   1800: iload #8
    //   1802: bipush #90
    //   1804: if_icmple -> 1884
    //   1807: goto -> 1814
    //   1810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1813: athrow
    //   1814: iload #8
    //   1816: bipush #97
    //   1818: if_icmplt -> 1842
    //   1821: goto -> 1828
    //   1824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1827: athrow
    //   1828: iload #8
    //   1830: bipush #122
    //   1832: if_icmple -> 1884
    //   1835: goto -> 1842
    //   1838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1841: athrow
    //   1842: iload #8
    //   1844: bipush #43
    //   1846: if_icmpeq -> 1884
    //   1849: goto -> 1856
    //   1852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1855: athrow
    //   1856: iload #8
    //   1858: bipush #47
    //   1860: if_icmpeq -> 1884
    //   1863: goto -> 1870
    //   1866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1869: athrow
    //   1870: iload #8
    //   1872: bipush #61
    //   1874: if_icmpne -> 1894
    //   1877: goto -> 1884
    //   1880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1883: athrow
    //   1884: iinc #6, 1
    //   1887: goto -> 1894
    //   1890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1893: athrow
    //   1894: iinc #7, 1
    //   1897: iload_2
    //   1898: ifeq -> 1750
    //   1901: iload #6
    //   1903: newarray byte
    //   1905: astore #7
    //   1907: iconst_0
    //   1908: istore #8
    //   1910: iconst_0
    //   1911: istore #9
    //   1913: iload #9
    //   1915: aload #4
    //   1917: arraylength
    //   1918: if_icmpge -> 2071
    //   1921: aload #4
    //   1923: iload #9
    //   1925: baload
    //   1926: istore #10
    //   1928: iload #10
    //   1930: bipush #48
    //   1932: if_icmplt -> 1949
    //   1935: iload #10
    //   1937: bipush #57
    //   1939: if_icmple -> 2047
    //   1942: goto -> 1949
    //   1945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1948: athrow
    //   1949: iload #10
    //   1951: bipush #65
    //   1953: if_icmplt -> 1977
    //   1956: goto -> 1963
    //   1959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1962: athrow
    //   1963: iload #10
    //   1965: bipush #90
    //   1967: if_icmple -> 2047
    //   1970: goto -> 1977
    //   1973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1976: athrow
    //   1977: iload #10
    //   1979: bipush #97
    //   1981: if_icmplt -> 2005
    //   1984: goto -> 1991
    //   1987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1990: athrow
    //   1991: iload #10
    //   1993: bipush #122
    //   1995: if_icmple -> 2047
    //   1998: goto -> 2005
    //   2001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2004: athrow
    //   2005: iload #10
    //   2007: bipush #43
    //   2009: if_icmpeq -> 2047
    //   2012: goto -> 2019
    //   2015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2018: athrow
    //   2019: iload #10
    //   2021: bipush #47
    //   2023: if_icmpeq -> 2047
    //   2026: goto -> 2033
    //   2029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2032: athrow
    //   2033: iload #10
    //   2035: bipush #61
    //   2037: if_icmpne -> 2064
    //   2040: goto -> 2047
    //   2043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2046: athrow
    //   2047: aload #7
    //   2049: iload #8
    //   2051: iload #10
    //   2053: bastore
    //   2054: iinc #8, 1
    //   2057: goto -> 2064
    //   2060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2063: athrow
    //   2064: iinc #9, 1
    //   2067: iload_2
    //   2068: ifeq -> 1913
    //   2071: aload #7
    //   2073: astore #5
    //   2075: aload #5
    //   2077: astore #4
    //   2079: aload #4
    //   2081: arraylength
    //   2082: istore #6
    //   2084: aload #4
    //   2086: iload #6
    //   2088: iconst_1
    //   2089: isub
    //   2090: baload
    //   2091: bipush #61
    //   2093: if_icmpne -> 2103
    //   2096: iinc #6, -1
    //   2099: iload_2
    //   2100: ifeq -> 2084
    //   2103: iload #6
    //   2105: aload #4
    //   2107: arraylength
    //   2108: iconst_4
    //   2109: idiv
    //   2110: isub
    //   2111: newarray byte
    //   2113: astore #7
    //   2115: iconst_0
    //   2116: istore #8
    //   2118: iload #8
    //   2120: aload #4
    //   2122: arraylength
    //   2123: if_icmpge -> 2403
    //   2126: aload #4
    //   2128: iload #8
    //   2130: baload
    //   2131: bipush #61
    //   2133: if_icmpne -> 2153
    //   2136: aload #4
    //   2138: iload #8
    //   2140: iconst_0
    //   2141: bastore
    //   2142: iload_2
    //   2143: ifeq -> 2396
    //   2146: goto -> 2153
    //   2149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2152: athrow
    //   2153: aload #4
    //   2155: iload #8
    //   2157: baload
    //   2158: bipush #47
    //   2160: if_icmpne -> 2188
    //   2163: goto -> 2170
    //   2166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2169: athrow
    //   2170: aload #4
    //   2172: iload #8
    //   2174: bipush #63
    //   2176: bastore
    //   2177: iload_2
    //   2178: ifeq -> 2396
    //   2181: goto -> 2188
    //   2184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2187: athrow
    //   2188: aload #4
    //   2190: iload #8
    //   2192: baload
    //   2193: bipush #43
    //   2195: if_icmpne -> 2223
    //   2198: goto -> 2205
    //   2201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2204: athrow
    //   2205: aload #4
    //   2207: iload #8
    //   2209: bipush #62
    //   2211: bastore
    //   2212: iload_2
    //   2213: ifeq -> 2396
    //   2216: goto -> 2223
    //   2219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2222: athrow
    //   2223: aload #4
    //   2225: iload #8
    //   2227: baload
    //   2228: bipush #48
    //   2230: if_icmplt -> 2282
    //   2233: goto -> 2240
    //   2236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2239: athrow
    //   2240: aload #4
    //   2242: iload #8
    //   2244: baload
    //   2245: bipush #57
    //   2247: if_icmpgt -> 2282
    //   2250: goto -> 2257
    //   2253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2256: athrow
    //   2257: aload #4
    //   2259: iload #8
    //   2261: aload #4
    //   2263: iload #8
    //   2265: baload
    //   2266: bipush #-4
    //   2268: isub
    //   2269: i2b
    //   2270: bastore
    //   2271: iload_2
    //   2272: ifeq -> 2396
    //   2275: goto -> 2282
    //   2278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2281: athrow
    //   2282: aload #4
    //   2284: iload #8
    //   2286: baload
    //   2287: bipush #97
    //   2289: if_icmplt -> 2341
    //   2292: goto -> 2299
    //   2295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2298: athrow
    //   2299: aload #4
    //   2301: iload #8
    //   2303: baload
    //   2304: bipush #122
    //   2306: if_icmpgt -> 2341
    //   2309: goto -> 2316
    //   2312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2315: athrow
    //   2316: aload #4
    //   2318: iload #8
    //   2320: aload #4
    //   2322: iload #8
    //   2324: baload
    //   2325: bipush #71
    //   2327: isub
    //   2328: i2b
    //   2329: bastore
    //   2330: iload_2
    //   2331: ifeq -> 2396
    //   2334: goto -> 2341
    //   2337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2340: athrow
    //   2341: aload #4
    //   2343: iload #8
    //   2345: baload
    //   2346: bipush #65
    //   2348: if_icmplt -> 2396
    //   2351: goto -> 2358
    //   2354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2357: athrow
    //   2358: aload #4
    //   2360: iload #8
    //   2362: baload
    //   2363: bipush #90
    //   2365: if_icmpgt -> 2396
    //   2368: goto -> 2375
    //   2371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2374: athrow
    //   2375: aload #4
    //   2377: iload #8
    //   2379: aload #4
    //   2381: iload #8
    //   2383: baload
    //   2384: bipush #65
    //   2386: isub
    //   2387: i2b
    //   2388: bastore
    //   2389: goto -> 2396
    //   2392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2395: athrow
    //   2396: iinc #8, 1
    //   2399: iload_2
    //   2400: ifeq -> 2118
    //   2403: iconst_0
    //   2404: istore #8
    //   2406: iconst_0
    //   2407: istore #9
    //   2409: iload #9
    //   2411: aload #7
    //   2413: arraylength
    //   2414: iconst_2
    //   2415: isub
    //   2416: if_icmpge -> 2525
    //   2419: aload #7
    //   2421: iload #9
    //   2423: aload #4
    //   2425: iload #8
    //   2427: baload
    //   2428: iconst_2
    //   2429: ishl
    //   2430: sipush #255
    //   2433: iand
    //   2434: aload #4
    //   2436: iload #8
    //   2438: iconst_1
    //   2439: iadd
    //   2440: baload
    //   2441: iconst_4
    //   2442: iushr
    //   2443: iconst_3
    //   2444: iand
    //   2445: ior
    //   2446: i2b
    //   2447: bastore
    //   2448: aload #7
    //   2450: iload #9
    //   2452: iconst_1
    //   2453: iadd
    //   2454: aload #4
    //   2456: iload #8
    //   2458: iconst_1
    //   2459: iadd
    //   2460: baload
    //   2461: iconst_4
    //   2462: ishl
    //   2463: sipush #255
    //   2466: iand
    //   2467: aload #4
    //   2469: iload #8
    //   2471: iconst_2
    //   2472: iadd
    //   2473: baload
    //   2474: iconst_2
    //   2475: iushr
    //   2476: bipush #15
    //   2478: iand
    //   2479: ior
    //   2480: i2b
    //   2481: bastore
    //   2482: aload #7
    //   2484: iload #9
    //   2486: iconst_2
    //   2487: iadd
    //   2488: aload #4
    //   2490: iload #8
    //   2492: iconst_2
    //   2493: iadd
    //   2494: baload
    //   2495: bipush #6
    //   2497: ishl
    //   2498: sipush #255
    //   2501: iand
    //   2502: aload #4
    //   2504: iload #8
    //   2506: iconst_3
    //   2507: iadd
    //   2508: baload
    //   2509: bipush #63
    //   2511: iand
    //   2512: ior
    //   2513: i2b
    //   2514: bastore
    //   2515: iinc #8, 4
    //   2518: iinc #9, 3
    //   2521: iload_2
    //   2522: ifeq -> 2409
    //   2525: iload #9
    //   2527: aload #7
    //   2529: arraylength
    //   2530: if_icmpge -> 2569
    //   2533: aload #7
    //   2535: iload #9
    //   2537: aload #4
    //   2539: iload #8
    //   2541: baload
    //   2542: iconst_2
    //   2543: ishl
    //   2544: sipush #255
    //   2547: iand
    //   2548: aload #4
    //   2550: iload #8
    //   2552: iconst_1
    //   2553: iadd
    //   2554: baload
    //   2555: iconst_4
    //   2556: iushr
    //   2557: iconst_3
    //   2558: iand
    //   2559: ior
    //   2560: i2b
    //   2561: bastore
    //   2562: goto -> 2569
    //   2565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2568: athrow
    //   2569: iinc #9, 1
    //   2572: iload #9
    //   2574: aload #7
    //   2576: arraylength
    //   2577: if_icmpge -> 2619
    //   2580: aload #7
    //   2582: iload #9
    //   2584: aload #4
    //   2586: iload #8
    //   2588: iconst_1
    //   2589: iadd
    //   2590: baload
    //   2591: iconst_4
    //   2592: ishl
    //   2593: sipush #255
    //   2596: iand
    //   2597: aload #4
    //   2599: iload #8
    //   2601: iconst_2
    //   2602: iadd
    //   2603: baload
    //   2604: iconst_2
    //   2605: iushr
    //   2606: bipush #15
    //   2608: iand
    //   2609: ior
    //   2610: i2b
    //   2611: bastore
    //   2612: goto -> 2619
    //   2615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2618: athrow
    //   2619: aload #7
    //   2621: astore #5
    //   2623: iconst_0
    //   2624: istore #4
    //   2626: getstatic burp/Zkk2.ZI : Ljava/lang/String;
    //   2629: getstatic burp/Zsow.ZV : Ljava/lang/Object;
    //   2632: checkcast java/math/BigInteger
    //   2635: invokevirtual intValue : ()I
    //   2638: bipush #32
    //   2640: irem
    //   2641: invokestatic abs : (I)I
    //   2644: invokevirtual charAt : (I)C
    //   2647: getstatic burp/Zll8.ZZ : Ljava/lang/String;
    //   2650: getstatic burp/Zzh1.Zf : Ljava/lang/Object;
    //   2653: checkcast java/math/BigInteger
    //   2656: invokevirtual intValue : ()I
    //   2659: bipush #32
    //   2661: irem
    //   2662: invokestatic abs : (I)I
    //   2665: invokevirtual charAt : (I)C
    //   2668: if_icmpgt -> 3013
    //   2671: sipush #-1522
    //   2674: sipush #31270
    //   2677: invokestatic a : (II)Ljava/lang/String;
    //   2680: iconst_1
    //   2681: ldc burp/Zmtr
    //   2683: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2686: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2689: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2692: astore #5
    //   2694: aload #5
    //   2696: arraylength
    //   2697: istore #6
    //   2699: iconst_0
    //   2700: istore #7
    //   2702: iload #7
    //   2704: iload #6
    //   2706: if_icmpge -> 2844
    //   2709: aload #5
    //   2711: iload #7
    //   2713: aaload
    //   2714: astore #8
    //   2716: aload #8
    //   2718: invokevirtual getModifiers : ()I
    //   2721: invokestatic isStatic : (I)Z
    //   2724: ifne -> 2734
    //   2727: goto -> 2837
    //   2730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2733: athrow
    //   2734: aload #8
    //   2736: invokevirtual getType : ()Ljava/lang/Class;
    //   2739: astore #9
    //   2741: aload #9
    //   2743: ifnull -> 2824
    //   2746: aload #9
    //   2748: invokevirtual isPrimitive : ()Z
    //   2751: ifne -> 2824
    //   2754: goto -> 2761
    //   2757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2760: athrow
    //   2761: aload #9
    //   2763: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2766: ifnull -> 2824
    //   2769: goto -> 2776
    //   2772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2775: athrow
    //   2776: aload #9
    //   2778: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2781: invokevirtual getName : ()Ljava/lang/String;
    //   2784: ifnull -> 2824
    //   2787: goto -> 2794
    //   2790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2793: athrow
    //   2794: aload #9
    //   2796: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2799: invokevirtual getName : ()Ljava/lang/String;
    //   2802: sipush #-1512
    //   2805: sipush #11615
    //   2808: invokestatic a : (II)Ljava/lang/String;
    //   2811: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2814: ifne -> 2824
    //   2817: goto -> 2824
    //   2820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2823: athrow
    //   2824: aload #8
    //   2826: iconst_1
    //   2827: invokevirtual setAccessible : (Z)V
    //   2830: aload #8
    //   2832: aconst_null
    //   2833: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2836: pop
    //   2837: iinc #7, 1
    //   2840: iload_2
    //   2841: ifeq -> 2702
    //   2844: sipush #-1513
    //   2847: sipush #-5552
    //   2850: invokestatic a : (II)Ljava/lang/String;
    //   2853: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2856: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2859: astore #5
    //   2861: aload #5
    //   2863: arraylength
    //   2864: istore #6
    //   2866: iconst_0
    //   2867: istore #7
    //   2869: iload #7
    //   2871: iload #6
    //   2873: if_icmpge -> 3010
    //   2876: aload #5
    //   2878: iload #7
    //   2880: aaload
    //   2881: astore #8
    //   2883: aload #8
    //   2885: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2888: pop
    //   2889: aload #8
    //   2891: invokevirtual getModifiers : ()I
    //   2894: invokestatic isStatic : (I)Z
    //   2897: ifeq -> 2996
    //   2900: aload #8
    //   2902: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2905: arraylength
    //   2906: iconst_2
    //   2907: if_icmpne -> 2996
    //   2910: goto -> 2917
    //   2913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2916: athrow
    //   2917: aload #8
    //   2919: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2922: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2925: if_acmpne -> 2996
    //   2928: goto -> 2935
    //   2931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2934: athrow
    //   2935: aload #8
    //   2937: iconst_1
    //   2938: invokevirtual setAccessible : (Z)V
    //   2941: aload #8
    //   2943: aconst_null
    //   2944: iconst_2
    //   2945: anewarray java/lang/Object
    //   2948: dup
    //   2949: iconst_0
    //   2950: aload_0
    //   2951: aastore
    //   2952: dup
    //   2953: iconst_1
    //   2954: aload_1
    //   2955: ifnonnull -> 2973
    //   2958: goto -> 2965
    //   2961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2964: athrow
    //   2965: aload_1
    //   2966: goto -> 2980
    //   2969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2972: athrow
    //   2973: aload_1
    //   2974: checkcast [B
    //   2977: invokevirtual clone : ()Ljava/lang/Object;
    //   2980: aastore
    //   2981: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2984: checkcast java/lang/Boolean
    //   2987: invokevirtual booleanValue : ()Z
    //   2990: istore #4
    //   2992: iload_2
    //   2993: ifeq -> 3010
    //   2996: iinc #7, 1
    //   2999: iload_2
    //   3000: ifeq -> 2869
    //   3003: goto -> 3010
    //   3006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3009: athrow
    //   3010: goto -> 3352
    //   3013: sipush #-1506
    //   3016: sipush #11322
    //   3019: invokestatic a : (II)Ljava/lang/String;
    //   3022: iconst_1
    //   3023: ldc burp/Zr4z
    //   3025: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3028: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3031: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3034: astore #5
    //   3036: aload #5
    //   3038: arraylength
    //   3039: istore #6
    //   3041: iconst_0
    //   3042: istore #7
    //   3044: iload #7
    //   3046: iload #6
    //   3048: if_icmpge -> 3186
    //   3051: aload #5
    //   3053: iload #7
    //   3055: aaload
    //   3056: astore #8
    //   3058: aload #8
    //   3060: invokevirtual getModifiers : ()I
    //   3063: invokestatic isStatic : (I)Z
    //   3066: ifne -> 3076
    //   3069: goto -> 3179
    //   3072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3075: athrow
    //   3076: aload #8
    //   3078: invokevirtual getType : ()Ljava/lang/Class;
    //   3081: astore #9
    //   3083: aload #9
    //   3085: ifnull -> 3166
    //   3088: aload #9
    //   3090: invokevirtual isPrimitive : ()Z
    //   3093: ifne -> 3166
    //   3096: goto -> 3103
    //   3099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3102: athrow
    //   3103: aload #9
    //   3105: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3108: ifnull -> 3166
    //   3111: goto -> 3118
    //   3114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3117: athrow
    //   3118: aload #9
    //   3120: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3123: invokevirtual getName : ()Ljava/lang/String;
    //   3126: ifnull -> 3166
    //   3129: goto -> 3136
    //   3132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3135: athrow
    //   3136: aload #9
    //   3138: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3141: invokevirtual getName : ()Ljava/lang/String;
    //   3144: sipush #-1512
    //   3147: sipush #11615
    //   3150: invokestatic a : (II)Ljava/lang/String;
    //   3153: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3156: ifne -> 3166
    //   3159: goto -> 3166
    //   3162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3165: athrow
    //   3166: aload #8
    //   3168: iconst_1
    //   3169: invokevirtual setAccessible : (Z)V
    //   3172: aload #8
    //   3174: aconst_null
    //   3175: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3178: pop
    //   3179: iinc #7, 1
    //   3182: iload_2
    //   3183: ifeq -> 3044
    //   3186: sipush #-1518
    //   3189: sipush #5286
    //   3192: invokestatic a : (II)Ljava/lang/String;
    //   3195: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3198: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3201: astore #5
    //   3203: aload #5
    //   3205: arraylength
    //   3206: istore #6
    //   3208: iconst_0
    //   3209: istore #7
    //   3211: iload #7
    //   3213: iload #6
    //   3215: if_icmpge -> 3352
    //   3218: aload #5
    //   3220: iload #7
    //   3222: aaload
    //   3223: astore #8
    //   3225: aload #8
    //   3227: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3230: pop
    //   3231: aload #8
    //   3233: invokevirtual getModifiers : ()I
    //   3236: invokestatic isStatic : (I)Z
    //   3239: ifeq -> 3338
    //   3242: aload #8
    //   3244: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3247: arraylength
    //   3248: iconst_2
    //   3249: if_icmpne -> 3338
    //   3252: goto -> 3259
    //   3255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3258: athrow
    //   3259: aload #8
    //   3261: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3264: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3267: if_acmpne -> 3338
    //   3270: goto -> 3277
    //   3273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3276: athrow
    //   3277: aload #8
    //   3279: iconst_1
    //   3280: invokevirtual setAccessible : (Z)V
    //   3283: aload #8
    //   3285: aconst_null
    //   3286: iconst_2
    //   3287: anewarray java/lang/Object
    //   3290: dup
    //   3291: iconst_0
    //   3292: aload_0
    //   3293: aastore
    //   3294: dup
    //   3295: iconst_1
    //   3296: aload_1
    //   3297: ifnonnull -> 3315
    //   3300: goto -> 3307
    //   3303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3306: athrow
    //   3307: aload_1
    //   3308: goto -> 3322
    //   3311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3314: athrow
    //   3315: aload_1
    //   3316: checkcast [B
    //   3319: invokevirtual clone : ()Ljava/lang/Object;
    //   3322: aastore
    //   3323: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3326: checkcast java/lang/Boolean
    //   3329: invokevirtual booleanValue : ()Z
    //   3332: istore #4
    //   3334: iload_2
    //   3335: ifeq -> 3352
    //   3338: iinc #7, 1
    //   3341: iload_2
    //   3342: ifeq -> 3211
    //   3345: goto -> 3352
    //   3348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3351: athrow
    //   3352: iload #4
    //   3354: ifeq -> 3360
    //   3357: iload #4
    //   3359: ireturn
    //   3360: getstatic burp/Zva.Zi : Ljava/lang/String;
    //   3363: getstatic burp/Zvk.ZN : Ljava/lang/Object;
    //   3366: checkcast java/math/BigInteger
    //   3369: invokevirtual intValue : ()I
    //   3372: bipush #32
    //   3374: irem
    //   3375: invokestatic abs : (I)I
    //   3378: invokevirtual charAt : (I)C
    //   3381: getstatic burp/Zzri.ZL : Ljava/lang/String;
    //   3384: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   3387: checkcast java/math/BigInteger
    //   3390: invokevirtual intValue : ()I
    //   3393: bipush #32
    //   3395: irem
    //   3396: invokestatic abs : (I)I
    //   3399: invokevirtual charAt : (I)C
    //   3402: if_icmpgt -> 3748
    //   3405: sipush #-1523
    //   3408: sipush #578
    //   3411: invokestatic a : (II)Ljava/lang/String;
    //   3414: iconst_1
    //   3415: ldc burp/Zsf7
    //   3417: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3420: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3423: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3426: astore #5
    //   3428: aload #5
    //   3430: arraylength
    //   3431: istore #6
    //   3433: iconst_0
    //   3434: istore #7
    //   3436: iload #7
    //   3438: iload #6
    //   3440: if_icmpge -> 3578
    //   3443: aload #5
    //   3445: iload #7
    //   3447: aaload
    //   3448: astore #8
    //   3450: aload #8
    //   3452: invokevirtual getModifiers : ()I
    //   3455: invokestatic isStatic : (I)Z
    //   3458: ifne -> 3468
    //   3461: goto -> 3571
    //   3464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3467: athrow
    //   3468: aload #8
    //   3470: invokevirtual getType : ()Ljava/lang/Class;
    //   3473: astore #9
    //   3475: aload #9
    //   3477: ifnull -> 3558
    //   3480: aload #9
    //   3482: invokevirtual isPrimitive : ()Z
    //   3485: ifne -> 3558
    //   3488: goto -> 3495
    //   3491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3494: athrow
    //   3495: aload #9
    //   3497: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3500: ifnull -> 3558
    //   3503: goto -> 3510
    //   3506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3509: athrow
    //   3510: aload #9
    //   3512: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3515: invokevirtual getName : ()Ljava/lang/String;
    //   3518: ifnull -> 3558
    //   3521: goto -> 3528
    //   3524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3527: athrow
    //   3528: aload #9
    //   3530: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3533: invokevirtual getName : ()Ljava/lang/String;
    //   3536: sipush #-1512
    //   3539: sipush #11615
    //   3542: invokestatic a : (II)Ljava/lang/String;
    //   3545: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3548: ifne -> 3558
    //   3551: goto -> 3558
    //   3554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3557: athrow
    //   3558: aload #8
    //   3560: iconst_1
    //   3561: invokevirtual setAccessible : (Z)V
    //   3564: aload #8
    //   3566: aconst_null
    //   3567: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3570: pop
    //   3571: iinc #7, 1
    //   3574: iload_2
    //   3575: ifeq -> 3436
    //   3578: sipush #-1525
    //   3581: sipush #1325
    //   3584: invokestatic a : (II)Ljava/lang/String;
    //   3587: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3590: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3593: astore #5
    //   3595: aload #5
    //   3597: arraylength
    //   3598: istore #6
    //   3600: iconst_0
    //   3601: istore #7
    //   3603: iload #7
    //   3605: iload #6
    //   3607: if_icmpge -> 3744
    //   3610: aload #5
    //   3612: iload #7
    //   3614: aaload
    //   3615: astore #8
    //   3617: aload #8
    //   3619: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3622: pop
    //   3623: aload #8
    //   3625: invokevirtual getModifiers : ()I
    //   3628: invokestatic isStatic : (I)Z
    //   3631: ifeq -> 3730
    //   3634: aload #8
    //   3636: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3639: arraylength
    //   3640: iconst_2
    //   3641: if_icmpne -> 3730
    //   3644: goto -> 3651
    //   3647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3650: athrow
    //   3651: aload #8
    //   3653: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3656: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3659: if_acmpne -> 3730
    //   3662: goto -> 3669
    //   3665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3668: athrow
    //   3669: aload #8
    //   3671: iconst_1
    //   3672: invokevirtual setAccessible : (Z)V
    //   3675: aload #8
    //   3677: aconst_null
    //   3678: iconst_2
    //   3679: anewarray java/lang/Object
    //   3682: dup
    //   3683: iconst_0
    //   3684: aload_0
    //   3685: aastore
    //   3686: dup
    //   3687: iconst_1
    //   3688: aload_1
    //   3689: ifnonnull -> 3707
    //   3692: goto -> 3699
    //   3695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3698: athrow
    //   3699: aload_1
    //   3700: goto -> 3714
    //   3703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3706: athrow
    //   3707: aload_1
    //   3708: checkcast [B
    //   3711: invokevirtual clone : ()Ljava/lang/Object;
    //   3714: aastore
    //   3715: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3718: checkcast java/lang/Boolean
    //   3721: invokevirtual booleanValue : ()Z
    //   3724: istore #4
    //   3726: iload_2
    //   3727: ifeq -> 3744
    //   3730: iinc #7, 1
    //   3733: iload_2
    //   3734: ifeq -> 3603
    //   3737: goto -> 3744
    //   3740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3743: athrow
    //   3744: iload_2
    //   3745: ifeq -> 4087
    //   3748: sipush #-1524
    //   3751: sipush #27485
    //   3754: invokestatic a : (II)Ljava/lang/String;
    //   3757: iconst_1
    //   3758: ldc burp/Zkfb
    //   3760: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3763: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3766: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3769: astore #5
    //   3771: aload #5
    //   3773: arraylength
    //   3774: istore #6
    //   3776: iconst_0
    //   3777: istore #7
    //   3779: iload #7
    //   3781: iload #6
    //   3783: if_icmpge -> 3921
    //   3786: aload #5
    //   3788: iload #7
    //   3790: aaload
    //   3791: astore #8
    //   3793: aload #8
    //   3795: invokevirtual getModifiers : ()I
    //   3798: invokestatic isStatic : (I)Z
    //   3801: ifne -> 3811
    //   3804: goto -> 3914
    //   3807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3810: athrow
    //   3811: aload #8
    //   3813: invokevirtual getType : ()Ljava/lang/Class;
    //   3816: astore #9
    //   3818: aload #9
    //   3820: ifnull -> 3901
    //   3823: aload #9
    //   3825: invokevirtual isPrimitive : ()Z
    //   3828: ifne -> 3901
    //   3831: goto -> 3838
    //   3834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3837: athrow
    //   3838: aload #9
    //   3840: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3843: ifnull -> 3901
    //   3846: goto -> 3853
    //   3849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3852: athrow
    //   3853: aload #9
    //   3855: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3858: invokevirtual getName : ()Ljava/lang/String;
    //   3861: ifnull -> 3901
    //   3864: goto -> 3871
    //   3867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3870: athrow
    //   3871: aload #9
    //   3873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3876: invokevirtual getName : ()Ljava/lang/String;
    //   3879: sipush #-1512
    //   3882: sipush #11615
    //   3885: invokestatic a : (II)Ljava/lang/String;
    //   3888: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3891: ifne -> 3901
    //   3894: goto -> 3901
    //   3897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3900: athrow
    //   3901: aload #8
    //   3903: iconst_1
    //   3904: invokevirtual setAccessible : (Z)V
    //   3907: aload #8
    //   3909: aconst_null
    //   3910: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3913: pop
    //   3914: iinc #7, 1
    //   3917: iload_2
    //   3918: ifeq -> 3779
    //   3921: sipush #-1508
    //   3924: sipush #-25889
    //   3927: invokestatic a : (II)Ljava/lang/String;
    //   3930: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3933: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3936: astore #5
    //   3938: aload #5
    //   3940: arraylength
    //   3941: istore #6
    //   3943: iconst_0
    //   3944: istore #7
    //   3946: iload #7
    //   3948: iload #6
    //   3950: if_icmpge -> 4087
    //   3953: aload #5
    //   3955: iload #7
    //   3957: aaload
    //   3958: astore #8
    //   3960: aload #8
    //   3962: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3965: pop
    //   3966: aload #8
    //   3968: invokevirtual getModifiers : ()I
    //   3971: invokestatic isStatic : (I)Z
    //   3974: ifeq -> 4073
    //   3977: aload #8
    //   3979: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3982: arraylength
    //   3983: iconst_2
    //   3984: if_icmpne -> 4073
    //   3987: goto -> 3994
    //   3990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3993: athrow
    //   3994: aload #8
    //   3996: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3999: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4002: if_acmpne -> 4073
    //   4005: goto -> 4012
    //   4008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4011: athrow
    //   4012: aload #8
    //   4014: iconst_1
    //   4015: invokevirtual setAccessible : (Z)V
    //   4018: aload #8
    //   4020: aconst_null
    //   4021: iconst_2
    //   4022: anewarray java/lang/Object
    //   4025: dup
    //   4026: iconst_0
    //   4027: aload_0
    //   4028: aastore
    //   4029: dup
    //   4030: iconst_1
    //   4031: aload_1
    //   4032: ifnonnull -> 4050
    //   4035: goto -> 4042
    //   4038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4041: athrow
    //   4042: aload_1
    //   4043: goto -> 4057
    //   4046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4049: athrow
    //   4050: aload_1
    //   4051: checkcast [B
    //   4054: invokevirtual clone : ()Ljava/lang/Object;
    //   4057: aastore
    //   4058: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4061: checkcast java/lang/Boolean
    //   4064: invokevirtual booleanValue : ()Z
    //   4067: istore #4
    //   4069: iload_2
    //   4070: ifeq -> 4087
    //   4073: iinc #7, 1
    //   4076: iload_2
    //   4077: ifeq -> 3946
    //   4080: goto -> 4087
    //   4083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4086: athrow
    //   4087: iload #4
    //   4089: ifeq -> 4095
    //   4092: iload #4
    //   4094: ireturn
    //   4095: getstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   4098: getstatic burp/Zs26.Z_ : Ljava/lang/Object;
    //   4101: checkcast java/math/BigInteger
    //   4104: invokevirtual intValue : ()I
    //   4107: bipush #32
    //   4109: irem
    //   4110: invokestatic abs : (I)I
    //   4113: invokevirtual charAt : (I)C
    //   4116: getstatic burp/Zmv9.Zm : Ljava/lang/String;
    //   4119: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
    //   4122: checkcast java/math/BigInteger
    //   4125: invokevirtual intValue : ()I
    //   4128: bipush #32
    //   4130: irem
    //   4131: invokestatic abs : (I)I
    //   4134: invokevirtual charAt : (I)C
    //   4137: if_icmple -> 4483
    //   4140: sipush #-1509
    //   4143: sipush #-15861
    //   4146: invokestatic a : (II)Ljava/lang/String;
    //   4149: iconst_1
    //   4150: ldc burp/Zs5k
    //   4152: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4155: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4158: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4161: astore #5
    //   4163: aload #5
    //   4165: arraylength
    //   4166: istore #6
    //   4168: iconst_0
    //   4169: istore #7
    //   4171: iload #7
    //   4173: iload #6
    //   4175: if_icmpge -> 4313
    //   4178: aload #5
    //   4180: iload #7
    //   4182: aaload
    //   4183: astore #8
    //   4185: aload #8
    //   4187: invokevirtual getModifiers : ()I
    //   4190: invokestatic isStatic : (I)Z
    //   4193: ifne -> 4203
    //   4196: goto -> 4306
    //   4199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4202: athrow
    //   4203: aload #8
    //   4205: invokevirtual getType : ()Ljava/lang/Class;
    //   4208: astore #9
    //   4210: aload #9
    //   4212: ifnull -> 4293
    //   4215: aload #9
    //   4217: invokevirtual isPrimitive : ()Z
    //   4220: ifne -> 4293
    //   4223: goto -> 4230
    //   4226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4229: athrow
    //   4230: aload #9
    //   4232: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4235: ifnull -> 4293
    //   4238: goto -> 4245
    //   4241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4244: athrow
    //   4245: aload #9
    //   4247: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4250: invokevirtual getName : ()Ljava/lang/String;
    //   4253: ifnull -> 4293
    //   4256: goto -> 4263
    //   4259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4262: athrow
    //   4263: aload #9
    //   4265: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4268: invokevirtual getName : ()Ljava/lang/String;
    //   4271: sipush #-1512
    //   4274: sipush #11615
    //   4277: invokestatic a : (II)Ljava/lang/String;
    //   4280: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4283: ifne -> 4293
    //   4286: goto -> 4293
    //   4289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4292: athrow
    //   4293: aload #8
    //   4295: iconst_1
    //   4296: invokevirtual setAccessible : (Z)V
    //   4299: aload #8
    //   4301: aconst_null
    //   4302: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4305: pop
    //   4306: iinc #7, 1
    //   4309: iload_2
    //   4310: ifeq -> 4171
    //   4313: sipush #-1519
    //   4316: sipush #-32083
    //   4319: invokestatic a : (II)Ljava/lang/String;
    //   4322: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4325: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4328: astore #5
    //   4330: aload #5
    //   4332: arraylength
    //   4333: istore #6
    //   4335: iconst_0
    //   4336: istore #7
    //   4338: iload #7
    //   4340: iload #6
    //   4342: if_icmpge -> 4479
    //   4345: aload #5
    //   4347: iload #7
    //   4349: aaload
    //   4350: astore #8
    //   4352: aload #8
    //   4354: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4357: pop
    //   4358: aload #8
    //   4360: invokevirtual getModifiers : ()I
    //   4363: invokestatic isStatic : (I)Z
    //   4366: ifeq -> 4465
    //   4369: aload #8
    //   4371: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4374: arraylength
    //   4375: iconst_2
    //   4376: if_icmpne -> 4465
    //   4379: goto -> 4386
    //   4382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4385: athrow
    //   4386: aload #8
    //   4388: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4391: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4394: if_acmpne -> 4465
    //   4397: goto -> 4404
    //   4400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4403: athrow
    //   4404: aload #8
    //   4406: iconst_1
    //   4407: invokevirtual setAccessible : (Z)V
    //   4410: aload #8
    //   4412: aconst_null
    //   4413: iconst_2
    //   4414: anewarray java/lang/Object
    //   4417: dup
    //   4418: iconst_0
    //   4419: aload_0
    //   4420: aastore
    //   4421: dup
    //   4422: iconst_1
    //   4423: aload_1
    //   4424: ifnonnull -> 4442
    //   4427: goto -> 4434
    //   4430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4433: athrow
    //   4434: aload_1
    //   4435: goto -> 4449
    //   4438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4441: athrow
    //   4442: aload_1
    //   4443: checkcast [B
    //   4446: invokevirtual clone : ()Ljava/lang/Object;
    //   4449: aastore
    //   4450: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4453: checkcast java/lang/Boolean
    //   4456: invokevirtual booleanValue : ()Z
    //   4459: istore #4
    //   4461: iload_2
    //   4462: ifeq -> 4479
    //   4465: iinc #7, 1
    //   4468: iload_2
    //   4469: ifeq -> 4338
    //   4472: goto -> 4479
    //   4475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4478: athrow
    //   4479: iload_2
    //   4480: ifeq -> 4822
    //   4483: sipush #-1528
    //   4486: sipush #-26030
    //   4489: invokestatic a : (II)Ljava/lang/String;
    //   4492: iconst_1
    //   4493: ldc burp/Zmlu
    //   4495: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4498: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4501: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4504: astore #5
    //   4506: aload #5
    //   4508: arraylength
    //   4509: istore #6
    //   4511: iconst_0
    //   4512: istore #7
    //   4514: iload #7
    //   4516: iload #6
    //   4518: if_icmpge -> 4656
    //   4521: aload #5
    //   4523: iload #7
    //   4525: aaload
    //   4526: astore #8
    //   4528: aload #8
    //   4530: invokevirtual getModifiers : ()I
    //   4533: invokestatic isStatic : (I)Z
    //   4536: ifne -> 4546
    //   4539: goto -> 4649
    //   4542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4545: athrow
    //   4546: aload #8
    //   4548: invokevirtual getType : ()Ljava/lang/Class;
    //   4551: astore #9
    //   4553: aload #9
    //   4555: ifnull -> 4636
    //   4558: aload #9
    //   4560: invokevirtual isPrimitive : ()Z
    //   4563: ifne -> 4636
    //   4566: goto -> 4573
    //   4569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4572: athrow
    //   4573: aload #9
    //   4575: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4578: ifnull -> 4636
    //   4581: goto -> 4588
    //   4584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4587: athrow
    //   4588: aload #9
    //   4590: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4593: invokevirtual getName : ()Ljava/lang/String;
    //   4596: ifnull -> 4636
    //   4599: goto -> 4606
    //   4602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4605: athrow
    //   4606: aload #9
    //   4608: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4611: invokevirtual getName : ()Ljava/lang/String;
    //   4614: sipush #-1512
    //   4617: sipush #11615
    //   4620: invokestatic a : (II)Ljava/lang/String;
    //   4623: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4626: ifne -> 4636
    //   4629: goto -> 4636
    //   4632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4635: athrow
    //   4636: aload #8
    //   4638: iconst_1
    //   4639: invokevirtual setAccessible : (Z)V
    //   4642: aload #8
    //   4644: aconst_null
    //   4645: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4648: pop
    //   4649: iinc #7, 1
    //   4652: iload_2
    //   4653: ifeq -> 4514
    //   4656: sipush #-1515
    //   4659: sipush #12718
    //   4662: invokestatic a : (II)Ljava/lang/String;
    //   4665: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4668: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4671: astore #5
    //   4673: aload #5
    //   4675: arraylength
    //   4676: istore #6
    //   4678: iconst_0
    //   4679: istore #7
    //   4681: iload #7
    //   4683: iload #6
    //   4685: if_icmpge -> 4822
    //   4688: aload #5
    //   4690: iload #7
    //   4692: aaload
    //   4693: astore #8
    //   4695: aload #8
    //   4697: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4700: pop
    //   4701: aload #8
    //   4703: invokevirtual getModifiers : ()I
    //   4706: invokestatic isStatic : (I)Z
    //   4709: ifeq -> 4808
    //   4712: aload #8
    //   4714: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4717: arraylength
    //   4718: iconst_2
    //   4719: if_icmpne -> 4808
    //   4722: goto -> 4729
    //   4725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4728: athrow
    //   4729: aload #8
    //   4731: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4734: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4737: if_acmpne -> 4808
    //   4740: goto -> 4747
    //   4743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4746: athrow
    //   4747: aload #8
    //   4749: iconst_1
    //   4750: invokevirtual setAccessible : (Z)V
    //   4753: aload #8
    //   4755: aconst_null
    //   4756: iconst_2
    //   4757: anewarray java/lang/Object
    //   4760: dup
    //   4761: iconst_0
    //   4762: aload_0
    //   4763: aastore
    //   4764: dup
    //   4765: iconst_1
    //   4766: aload_1
    //   4767: ifnonnull -> 4785
    //   4770: goto -> 4777
    //   4773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4776: athrow
    //   4777: aload_1
    //   4778: goto -> 4792
    //   4781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4784: athrow
    //   4785: aload_1
    //   4786: checkcast [B
    //   4789: invokevirtual clone : ()Ljava/lang/Object;
    //   4792: aastore
    //   4793: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4796: checkcast java/lang/Boolean
    //   4799: invokevirtual booleanValue : ()Z
    //   4802: istore #4
    //   4804: iload_2
    //   4805: ifeq -> 4822
    //   4808: iinc #7, 1
    //   4811: iload_2
    //   4812: ifeq -> 4681
    //   4815: goto -> 4822
    //   4818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4821: athrow
    //   4822: iload #4
    //   4824: ifeq -> 4830
    //   4827: iload #4
    //   4829: ireturn
    //   4830: getstatic burp/Zgp_.Zn : Ljava/lang/String;
    //   4833: getstatic burp/Ztip.Zc : Ljava/lang/Object;
    //   4836: checkcast java/math/BigInteger
    //   4839: invokevirtual intValue : ()I
    //   4842: bipush #32
    //   4844: irem
    //   4845: invokestatic abs : (I)I
    //   4848: invokevirtual charAt : (I)C
    //   4851: getstatic burp/Ztgj.Zw : Ljava/lang/String;
    //   4854: getstatic burp/Zez0.ZT : Ljava/lang/Object;
    //   4857: checkcast java/math/BigInteger
    //   4860: invokevirtual intValue : ()I
    //   4863: bipush #32
    //   4865: irem
    //   4866: invokestatic abs : (I)I
    //   4869: invokevirtual charAt : (I)C
    //   4872: if_icmple -> 5218
    //   4875: sipush #-1526
    //   4878: sipush #-19287
    //   4881: invokestatic a : (II)Ljava/lang/String;
    //   4884: iconst_1
    //   4885: ldc burp/Zzr
    //   4887: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4890: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4893: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4896: astore #5
    //   4898: aload #5
    //   4900: arraylength
    //   4901: istore #6
    //   4903: iconst_0
    //   4904: istore #7
    //   4906: iload #7
    //   4908: iload #6
    //   4910: if_icmpge -> 5048
    //   4913: aload #5
    //   4915: iload #7
    //   4917: aaload
    //   4918: astore #8
    //   4920: aload #8
    //   4922: invokevirtual getModifiers : ()I
    //   4925: invokestatic isStatic : (I)Z
    //   4928: ifne -> 4938
    //   4931: goto -> 5041
    //   4934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4937: athrow
    //   4938: aload #8
    //   4940: invokevirtual getType : ()Ljava/lang/Class;
    //   4943: astore #9
    //   4945: aload #9
    //   4947: ifnull -> 5028
    //   4950: aload #9
    //   4952: invokevirtual isPrimitive : ()Z
    //   4955: ifne -> 5028
    //   4958: goto -> 4965
    //   4961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4964: athrow
    //   4965: aload #9
    //   4967: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4970: ifnull -> 5028
    //   4973: goto -> 4980
    //   4976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4979: athrow
    //   4980: aload #9
    //   4982: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4985: invokevirtual getName : ()Ljava/lang/String;
    //   4988: ifnull -> 5028
    //   4991: goto -> 4998
    //   4994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4997: athrow
    //   4998: aload #9
    //   5000: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5003: invokevirtual getName : ()Ljava/lang/String;
    //   5006: sipush #-1512
    //   5009: sipush #11615
    //   5012: invokestatic a : (II)Ljava/lang/String;
    //   5015: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5018: ifne -> 5028
    //   5021: goto -> 5028
    //   5024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5027: athrow
    //   5028: aload #8
    //   5030: iconst_1
    //   5031: invokevirtual setAccessible : (Z)V
    //   5034: aload #8
    //   5036: aconst_null
    //   5037: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5040: pop
    //   5041: iinc #7, 1
    //   5044: iload_2
    //   5045: ifeq -> 4906
    //   5048: sipush #-1520
    //   5051: sipush #-11549
    //   5054: invokestatic a : (II)Ljava/lang/String;
    //   5057: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5060: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5063: astore #5
    //   5065: aload #5
    //   5067: arraylength
    //   5068: istore #6
    //   5070: iconst_0
    //   5071: istore #7
    //   5073: iload #7
    //   5075: iload #6
    //   5077: if_icmpge -> 5214
    //   5080: aload #5
    //   5082: iload #7
    //   5084: aaload
    //   5085: astore #8
    //   5087: aload #8
    //   5089: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5092: pop
    //   5093: aload #8
    //   5095: invokevirtual getModifiers : ()I
    //   5098: invokestatic isStatic : (I)Z
    //   5101: ifeq -> 5200
    //   5104: aload #8
    //   5106: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5109: arraylength
    //   5110: iconst_2
    //   5111: if_icmpne -> 5200
    //   5114: goto -> 5121
    //   5117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5120: athrow
    //   5121: aload #8
    //   5123: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5126: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5129: if_acmpne -> 5200
    //   5132: goto -> 5139
    //   5135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5138: athrow
    //   5139: aload #8
    //   5141: iconst_1
    //   5142: invokevirtual setAccessible : (Z)V
    //   5145: aload #8
    //   5147: aconst_null
    //   5148: iconst_2
    //   5149: anewarray java/lang/Object
    //   5152: dup
    //   5153: iconst_0
    //   5154: aload_0
    //   5155: aastore
    //   5156: dup
    //   5157: iconst_1
    //   5158: aload_1
    //   5159: ifnonnull -> 5177
    //   5162: goto -> 5169
    //   5165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5168: athrow
    //   5169: aload_1
    //   5170: goto -> 5184
    //   5173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5176: athrow
    //   5177: aload_1
    //   5178: checkcast [B
    //   5181: invokevirtual clone : ()Ljava/lang/Object;
    //   5184: aastore
    //   5185: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5188: checkcast java/lang/Boolean
    //   5191: invokevirtual booleanValue : ()Z
    //   5194: istore #4
    //   5196: iload_2
    //   5197: ifeq -> 5214
    //   5200: iinc #7, 1
    //   5203: iload_2
    //   5204: ifeq -> 5073
    //   5207: goto -> 5214
    //   5210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5213: athrow
    //   5214: iload_2
    //   5215: ifeq -> 5557
    //   5218: sipush #-1505
    //   5221: sipush #2946
    //   5224: invokestatic a : (II)Ljava/lang/String;
    //   5227: iconst_1
    //   5228: ldc burp/Zgq_
    //   5230: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5233: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5236: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5239: astore #5
    //   5241: aload #5
    //   5243: arraylength
    //   5244: istore #6
    //   5246: iconst_0
    //   5247: istore #7
    //   5249: iload #7
    //   5251: iload #6
    //   5253: if_icmpge -> 5391
    //   5256: aload #5
    //   5258: iload #7
    //   5260: aaload
    //   5261: astore #8
    //   5263: aload #8
    //   5265: invokevirtual getModifiers : ()I
    //   5268: invokestatic isStatic : (I)Z
    //   5271: ifne -> 5281
    //   5274: goto -> 5384
    //   5277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5280: athrow
    //   5281: aload #8
    //   5283: invokevirtual getType : ()Ljava/lang/Class;
    //   5286: astore #9
    //   5288: aload #9
    //   5290: ifnull -> 5371
    //   5293: aload #9
    //   5295: invokevirtual isPrimitive : ()Z
    //   5298: ifne -> 5371
    //   5301: goto -> 5308
    //   5304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5307: athrow
    //   5308: aload #9
    //   5310: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5313: ifnull -> 5371
    //   5316: goto -> 5323
    //   5319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5322: athrow
    //   5323: aload #9
    //   5325: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5328: invokevirtual getName : ()Ljava/lang/String;
    //   5331: ifnull -> 5371
    //   5334: goto -> 5341
    //   5337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5340: athrow
    //   5341: aload #9
    //   5343: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5346: invokevirtual getName : ()Ljava/lang/String;
    //   5349: sipush #-1512
    //   5352: sipush #11615
    //   5355: invokestatic a : (II)Ljava/lang/String;
    //   5358: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5361: ifne -> 5371
    //   5364: goto -> 5371
    //   5367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5370: athrow
    //   5371: aload #8
    //   5373: iconst_1
    //   5374: invokevirtual setAccessible : (Z)V
    //   5377: aload #8
    //   5379: aconst_null
    //   5380: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5383: pop
    //   5384: iinc #7, 1
    //   5387: iload_2
    //   5388: ifeq -> 5249
    //   5391: sipush #-1511
    //   5394: sipush #-3141
    //   5397: invokestatic a : (II)Ljava/lang/String;
    //   5400: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5403: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5406: astore #5
    //   5408: aload #5
    //   5410: arraylength
    //   5411: istore #6
    //   5413: iconst_0
    //   5414: istore #7
    //   5416: iload #7
    //   5418: iload #6
    //   5420: if_icmpge -> 5557
    //   5423: aload #5
    //   5425: iload #7
    //   5427: aaload
    //   5428: astore #8
    //   5430: aload #8
    //   5432: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5435: pop
    //   5436: aload #8
    //   5438: invokevirtual getModifiers : ()I
    //   5441: invokestatic isStatic : (I)Z
    //   5444: ifeq -> 5543
    //   5447: aload #8
    //   5449: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5452: arraylength
    //   5453: iconst_2
    //   5454: if_icmpne -> 5543
    //   5457: goto -> 5464
    //   5460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5463: athrow
    //   5464: aload #8
    //   5466: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5469: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5472: if_acmpne -> 5543
    //   5475: goto -> 5482
    //   5478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5481: athrow
    //   5482: aload #8
    //   5484: iconst_1
    //   5485: invokevirtual setAccessible : (Z)V
    //   5488: aload #8
    //   5490: aconst_null
    //   5491: iconst_2
    //   5492: anewarray java/lang/Object
    //   5495: dup
    //   5496: iconst_0
    //   5497: aload_0
    //   5498: aastore
    //   5499: dup
    //   5500: iconst_1
    //   5501: aload_1
    //   5502: ifnonnull -> 5520
    //   5505: goto -> 5512
    //   5508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5511: athrow
    //   5512: aload_1
    //   5513: goto -> 5527
    //   5516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5519: athrow
    //   5520: aload_1
    //   5521: checkcast [B
    //   5524: invokevirtual clone : ()Ljava/lang/Object;
    //   5527: aastore
    //   5528: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5531: checkcast java/lang/Boolean
    //   5534: invokevirtual booleanValue : ()Z
    //   5537: istore #4
    //   5539: iload_2
    //   5540: ifeq -> 5557
    //   5543: iinc #7, 1
    //   5546: iload_2
    //   5547: ifeq -> 5416
    //   5550: goto -> 5557
    //   5553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5556: athrow
    //   5557: iload #4
    //   5559: ireturn
    //   5560: astore_3
    //   5561: new java/lang/Exception
    //   5564: dup
    //   5565: aload_3
    //   5566: invokevirtual getMessage : ()Ljava/lang/String;
    //   5569: invokespecial <init> : (Ljava/lang/String;)V
    //   5572: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3359	5560	java/lang/Throwable
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
    //   1765	1779	1782	java/lang/Throwable
    //   1772	1793	1796	java/lang/Throwable
    //   1786	1807	1810	java/lang/Throwable
    //   1800	1821	1824	java/lang/Throwable
    //   1814	1835	1838	java/lang/Throwable
    //   1828	1849	1852	java/lang/Throwable
    //   1842	1863	1866	java/lang/Throwable
    //   1856	1877	1880	java/lang/Throwable
    //   1870	1887	1890	java/lang/Throwable
    //   1928	1942	1945	java/lang/Throwable
    //   1935	1956	1959	java/lang/Throwable
    //   1949	1970	1973	java/lang/Throwable
    //   1963	1984	1987	java/lang/Throwable
    //   1977	1998	2001	java/lang/Throwable
    //   1991	2012	2015	java/lang/Throwable
    //   2005	2026	2029	java/lang/Throwable
    //   2019	2040	2043	java/lang/Throwable
    //   2033	2057	2060	java/lang/Throwable
    //   2126	2146	2149	java/lang/Throwable
    //   2136	2163	2166	java/lang/Throwable
    //   2153	2181	2184	java/lang/Throwable
    //   2170	2198	2201	java/lang/Throwable
    //   2188	2216	2219	java/lang/Throwable
    //   2205	2233	2236	java/lang/Throwable
    //   2223	2250	2253	java/lang/Throwable
    //   2240	2275	2278	java/lang/Throwable
    //   2257	2292	2295	java/lang/Throwable
    //   2282	2309	2312	java/lang/Throwable
    //   2299	2334	2337	java/lang/Throwable
    //   2316	2351	2354	java/lang/Throwable
    //   2341	2368	2371	java/lang/Throwable
    //   2358	2389	2392	java/lang/Throwable
    //   2525	2562	2565	java/lang/Throwable
    //   2569	2612	2615	java/lang/Throwable
    //   2716	2730	2730	java/lang/Throwable
    //   2741	2754	2757	java/lang/Throwable
    //   2746	2769	2772	java/lang/Throwable
    //   2761	2787	2790	java/lang/Throwable
    //   2776	2817	2820	java/lang/Throwable
    //   2883	2910	2913	java/lang/Throwable
    //   2900	2928	2931	java/lang/Throwable
    //   2917	2958	2961	java/lang/Throwable
    //   2935	2969	2969	java/lang/Throwable
    //   2992	3003	3006	java/lang/Throwable
    //   3058	3072	3072	java/lang/Throwable
    //   3083	3096	3099	java/lang/Throwable
    //   3088	3111	3114	java/lang/Throwable
    //   3103	3129	3132	java/lang/Throwable
    //   3118	3159	3162	java/lang/Throwable
    //   3225	3252	3255	java/lang/Throwable
    //   3242	3270	3273	java/lang/Throwable
    //   3259	3300	3303	java/lang/Throwable
    //   3277	3311	3311	java/lang/Throwable
    //   3334	3345	3348	java/lang/Throwable
    //   3360	4094	5560	java/lang/Throwable
    //   3450	3464	3464	java/lang/Throwable
    //   3475	3488	3491	java/lang/Throwable
    //   3480	3503	3506	java/lang/Throwable
    //   3495	3521	3524	java/lang/Throwable
    //   3510	3551	3554	java/lang/Throwable
    //   3617	3644	3647	java/lang/Throwable
    //   3634	3662	3665	java/lang/Throwable
    //   3651	3692	3695	java/lang/Throwable
    //   3669	3703	3703	java/lang/Throwable
    //   3726	3737	3740	java/lang/Throwable
    //   3793	3807	3807	java/lang/Throwable
    //   3818	3831	3834	java/lang/Throwable
    //   3823	3846	3849	java/lang/Throwable
    //   3838	3864	3867	java/lang/Throwable
    //   3853	3894	3897	java/lang/Throwable
    //   3960	3987	3990	java/lang/Throwable
    //   3977	4005	4008	java/lang/Throwable
    //   3994	4035	4038	java/lang/Throwable
    //   4012	4046	4046	java/lang/Throwable
    //   4069	4080	4083	java/lang/Throwable
    //   4095	4829	5560	java/lang/Throwable
    //   4185	4199	4199	java/lang/Throwable
    //   4210	4223	4226	java/lang/Throwable
    //   4215	4238	4241	java/lang/Throwable
    //   4230	4256	4259	java/lang/Throwable
    //   4245	4286	4289	java/lang/Throwable
    //   4352	4379	4382	java/lang/Throwable
    //   4369	4397	4400	java/lang/Throwable
    //   4386	4427	4430	java/lang/Throwable
    //   4404	4438	4438	java/lang/Throwable
    //   4461	4472	4475	java/lang/Throwable
    //   4528	4542	4542	java/lang/Throwable
    //   4553	4566	4569	java/lang/Throwable
    //   4558	4581	4584	java/lang/Throwable
    //   4573	4599	4602	java/lang/Throwable
    //   4588	4629	4632	java/lang/Throwable
    //   4695	4722	4725	java/lang/Throwable
    //   4712	4740	4743	java/lang/Throwable
    //   4729	4770	4773	java/lang/Throwable
    //   4747	4781	4781	java/lang/Throwable
    //   4804	4815	4818	java/lang/Throwable
    //   4830	5559	5560	java/lang/Throwable
    //   4920	4934	4934	java/lang/Throwable
    //   4945	4958	4961	java/lang/Throwable
    //   4950	4973	4976	java/lang/Throwable
    //   4965	4991	4994	java/lang/Throwable
    //   4980	5021	5024	java/lang/Throwable
    //   5087	5114	5117	java/lang/Throwable
    //   5104	5132	5135	java/lang/Throwable
    //   5121	5162	5165	java/lang/Throwable
    //   5139	5173	5173	java/lang/Throwable
    //   5196	5207	5210	java/lang/Throwable
    //   5263	5277	5277	java/lang/Throwable
    //   5288	5301	5304	java/lang/Throwable
    //   5293	5316	5319	java/lang/Throwable
    //   5308	5334	5337	java/lang/Throwable
    //   5323	5364	5367	java/lang/Throwable
    //   5430	5457	5460	java/lang/Throwable
    //   5447	5475	5478	java/lang/Throwable
    //   5464	5505	5508	java/lang/Throwable
    //   5482	5516	5516	java/lang/Throwable
    //   5539	5550	5553	java/lang/Throwable
  }
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zh(Object paramObject) {
    Zxf8.Zq = a(-1535, 1593);
    Zxf8.Zz = new BigInteger(a(-1514, -29859));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zkgp.ZM.charAt(Math.abs(((BigInteger)Zkgp.Zw).intValue() % 32)) > Zkgp.ZM.charAt(Math.abs(((BigInteger)Zzri.ZG).intValue() % 32))) {
          try {
            Zlh2.ZV(Class.forName(a(-1516, 6962)));
            if (!bool)
              Ztsj.Zf(Class.forName(a(-1517, 29798))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztsj.Zf(Class.forName(a(-1517, 29798)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'c.XËØÙã4\\t(f;!ji\\tIJJÔ¾ZÜ¡u [üÊ\\t9¥EÓ~¡$H<lèmc£\\røn[­)\\tKÃô^â+§\\tÍAÚµ¬vsq\\tòá=¡Pô;\\t®óHÉ<£\\t\\r?Âz¯ùLz\\t\\tBÝ¿{úÕz\\tØsxóø¾\\fkz\\t2²%ËS¹p\\bIeJ1¾æÍ|\\tì ¥À¹¿MMü¦¢5aÐ¬nuáC÷Ý#íÜã«´½q1Ð?/"¤&ÎVõ¨P½¶\\b¶É ðzÔîI\\r*§.T7q{J¥S#Õ0 ï\\tWtÆ¢Ó¾\\t)ñ¸É×*\¿\\tOÏ¦9ÇQ\\t¾´LaI A\\tJ*l²MBU\\t}NÌTnJÞ© -VÆW'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
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
    //   68: ldc 'Íy½{ÔÁá )fBy6¼^wÈ´½µO§Z\ KTEl~­[þ>'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #84
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
    //   129: putstatic burp/Ztgj.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztgj.b : [Ljava/lang/String;
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
    //   212: bipush #49
    //   214: goto -> 244
    //   217: bipush #35
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #20
    //   234: goto -> 244
    //   237: bipush #124
    //   239: goto -> 244
    //   242: bipush #116
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
    //   300: sipush #-1507
    //   303: sipush #22461
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztgj.Zw : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #86
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #42
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #21
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-118
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #82
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-26
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-55
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #24
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-128
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-57
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-72
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-70
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-68
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-30
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #87
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-84
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #22
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #14
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #107
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #120
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-42
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #66
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-53
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-29
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-57
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #107
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-62
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #82
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #69
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-29
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-56
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #108
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Ztgj.ZY : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFA19) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */