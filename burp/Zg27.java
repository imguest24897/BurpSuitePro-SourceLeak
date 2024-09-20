package burp;

import java.math.BigInteger;

class Zg27 extends ClassLoader {
  static Object ZQ;
  
  static String ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zi(Object paramObject) {
    Zg7j.ZR = a(-10683, -16083);
    Zg7j.Zr = new BigInteger(a(-10681, -8522));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zec0.Zk.charAt(Math.abs(((BigInteger)Ztzw.Zk).intValue() % 32)) > Zty4.Zu.charAt(Math.abs(((BigInteger)Zgr4.ZL).intValue() % 32))) {
          try {
            Zltb.Zc(Class.forName(a(-10685, 15047)));
            if (!bool)
              Zs9x.ZC(Class.forName(a(-10674, -24640))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zs9x.ZC(Class.forName(a(-10674, -24640)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zf.Zh : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztw4.ZF : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsow.ZV : Ljava/lang/Object;
    //   22: getstatic burp/Zem6.Zm : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: iconst_2
    //   35: iadd
    //   36: newarray byte
    //   38: astore #5
    //   40: iconst_0
    //   41: istore #6
    //   43: iload #6
    //   45: aload_3
    //   46: arraylength
    //   47: if_icmpge -> 66
    //   50: aload #5
    //   52: iload #6
    //   54: aload_3
    //   55: iload #6
    //   57: baload
    //   58: bastore
    //   59: iinc #6, 1
    //   62: iload_2
    //   63: ifeq -> 43
    //   66: aload #5
    //   68: arraylength
    //   69: iconst_3
    //   70: idiv
    //   71: iconst_4
    //   72: imul
    //   73: newarray byte
    //   75: astore #4
    //   77: iconst_0
    //   78: istore #6
    //   80: iconst_0
    //   81: istore #7
    //   83: iload #6
    //   85: aload_3
    //   86: arraylength
    //   87: if_icmpge -> 198
    //   90: aload #4
    //   92: iload #7
    //   94: aload #5
    //   96: iload #6
    //   98: baload
    //   99: iconst_2
    //   100: iushr
    //   101: bipush #63
    //   103: iand
    //   104: i2b
    //   105: bastore
    //   106: aload #4
    //   108: iload #7
    //   110: iconst_1
    //   111: iadd
    //   112: aload #5
    //   114: iload #6
    //   116: iconst_1
    //   117: iadd
    //   118: baload
    //   119: iconst_4
    //   120: iushr
    //   121: bipush #15
    //   123: iand
    //   124: aload #5
    //   126: iload #6
    //   128: baload
    //   129: iconst_4
    //   130: ishl
    //   131: bipush #63
    //   133: iand
    //   134: ior
    //   135: i2b
    //   136: bastore
    //   137: aload #4
    //   139: iload #7
    //   141: iconst_2
    //   142: iadd
    //   143: aload #5
    //   145: iload #6
    //   147: iconst_2
    //   148: iadd
    //   149: baload
    //   150: bipush #6
    //   152: iushr
    //   153: iconst_3
    //   154: iand
    //   155: aload #5
    //   157: iload #6
    //   159: iconst_1
    //   160: iadd
    //   161: baload
    //   162: iconst_2
    //   163: ishl
    //   164: bipush #63
    //   166: iand
    //   167: ior
    //   168: i2b
    //   169: bastore
    //   170: aload #4
    //   172: iload #7
    //   174: iconst_3
    //   175: iadd
    //   176: aload #5
    //   178: iload #6
    //   180: iconst_2
    //   181: iadd
    //   182: baload
    //   183: bipush #63
    //   185: iand
    //   186: i2b
    //   187: bastore
    //   188: iinc #6, 3
    //   191: iinc #7, 4
    //   194: iload_2
    //   195: ifeq -> 83
    //   198: iconst_0
    //   199: istore #6
    //   201: iload #6
    //   203: aload #4
    //   205: arraylength
    //   206: if_icmpge -> 390
    //   209: aload #4
    //   211: iload #6
    //   213: baload
    //   214: bipush #26
    //   216: if_icmpge -> 244
    //   219: aload #4
    //   221: iload #6
    //   223: aload #4
    //   225: iload #6
    //   227: baload
    //   228: bipush #65
    //   230: iadd
    //   231: i2b
    //   232: bastore
    //   233: iload_2
    //   234: ifeq -> 383
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   243: athrow
    //   244: aload #4
    //   246: iload #6
    //   248: baload
    //   249: bipush #52
    //   251: if_icmpge -> 289
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: athrow
    //   261: aload #4
    //   263: iload #6
    //   265: aload #4
    //   267: iload #6
    //   269: baload
    //   270: bipush #97
    //   272: iadd
    //   273: bipush #26
    //   275: isub
    //   276: i2b
    //   277: bastore
    //   278: iload_2
    //   279: ifeq -> 383
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: aload #4
    //   291: iload #6
    //   293: baload
    //   294: bipush #62
    //   296: if_icmpge -> 334
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   305: athrow
    //   306: aload #4
    //   308: iload #6
    //   310: aload #4
    //   312: iload #6
    //   314: baload
    //   315: bipush #48
    //   317: iadd
    //   318: bipush #52
    //   320: isub
    //   321: i2b
    //   322: bastore
    //   323: iload_2
    //   324: ifeq -> 383
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   333: athrow
    //   334: aload #4
    //   336: iload #6
    //   338: baload
    //   339: bipush #63
    //   341: if_icmpge -> 369
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #43
    //   357: bastore
    //   358: iload_2
    //   359: ifeq -> 383
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: aload #4
    //   371: iload #6
    //   373: bipush #47
    //   375: bastore
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: iinc #6, 1
    //   386: iload_2
    //   387: ifeq -> 201
    //   390: aload #4
    //   392: arraylength
    //   393: iconst_1
    //   394: isub
    //   395: istore #6
    //   397: iload #6
    //   399: aload_3
    //   400: arraylength
    //   401: iconst_4
    //   402: imul
    //   403: iconst_3
    //   404: idiv
    //   405: if_icmple -> 422
    //   408: aload #4
    //   410: iload #6
    //   412: bipush #61
    //   414: bastore
    //   415: iinc #6, -1
    //   418: iload_2
    //   419: ifeq -> 397
    //   422: new java/math/BigInteger
    //   425: dup
    //   426: aload #4
    //   428: invokespecial <init> : ([B)V
    //   431: invokevirtual abs : ()Ljava/math/BigInteger;
    //   434: putstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   437: new java/lang/StringBuilder
    //   440: dup
    //   441: invokespecial <init> : ()V
    //   444: astore_3
    //   445: iconst_0
    //   446: istore #4
    //   448: iload #4
    //   450: bipush #32
    //   452: if_icmpge -> 1787
    //   455: iload #4
    //   457: tableswitch default -> 1780, 0 -> 600, 1 -> 637, 2 -> 674, 3 -> 711, 4 -> 748, 5 -> 785, 6 -> 822, 7 -> 859, 8 -> 896, 9 -> 933, 10 -> 970, 11 -> 1007, 12 -> 1044, 13 -> 1081, 14 -> 1118, 15 -> 1155, 16 -> 1192, 17 -> 1229, 18 -> 1266, 19 -> 1303, 20 -> 1340, 21 -> 1377, 22 -> 1414, 23 -> 1451, 24 -> 1488, 25 -> 1525, 26 -> 1562, 27 -> 1599, 28 -> 1636, 29 -> 1673, 30 -> 1710, 31 -> 1747
    //   600: aload_3
    //   601: getstatic burp/Zxf8.Zq : Ljava/lang/String;
    //   604: getstatic burp/Zk7b.ZR : Ljava/lang/Object;
    //   607: checkcast java/math/BigInteger
    //   610: invokevirtual intValue : ()I
    //   613: bipush #32
    //   615: irem
    //   616: invokestatic abs : (I)I
    //   619: invokevirtual charAt : (I)C
    //   622: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   625: pop
    //   626: iload_2
    //   627: ifeq -> 1780
    //   630: goto -> 637
    //   633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   636: athrow
    //   637: aload_3
    //   638: getstatic burp/Zzlg.Zw : Ljava/lang/String;
    //   641: getstatic burp/Zzs9.ZO : Ljava/lang/Object;
    //   644: checkcast java/math/BigInteger
    //   647: invokevirtual intValue : ()I
    //   650: bipush #32
    //   652: irem
    //   653: invokestatic abs : (I)I
    //   656: invokevirtual charAt : (I)C
    //   659: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   662: pop
    //   663: iload_2
    //   664: ifeq -> 1780
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   673: athrow
    //   674: aload_3
    //   675: getstatic burp/Zr1t.Ze : Ljava/lang/String;
    //   678: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
    //   681: checkcast java/math/BigInteger
    //   684: invokevirtual intValue : ()I
    //   687: bipush #32
    //   689: irem
    //   690: invokestatic abs : (I)I
    //   693: invokevirtual charAt : (I)C
    //   696: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   699: pop
    //   700: iload_2
    //   701: ifeq -> 1780
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   710: athrow
    //   711: aload_3
    //   712: getstatic burp/Zrcu.Zb : Ljava/lang/String;
    //   715: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
    //   718: checkcast java/math/BigInteger
    //   721: invokevirtual intValue : ()I
    //   724: bipush #32
    //   726: irem
    //   727: invokestatic abs : (I)I
    //   730: invokevirtual charAt : (I)C
    //   733: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   736: pop
    //   737: iload_2
    //   738: ifeq -> 1780
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: aload_3
    //   749: getstatic burp/Zmpv.Zb : Ljava/lang/String;
    //   752: getstatic burp/Zex5.Zb : Ljava/lang/Object;
    //   755: checkcast java/math/BigInteger
    //   758: invokevirtual intValue : ()I
    //   761: bipush #32
    //   763: irem
    //   764: invokestatic abs : (I)I
    //   767: invokevirtual charAt : (I)C
    //   770: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   773: pop
    //   774: iload_2
    //   775: ifeq -> 1780
    //   778: goto -> 785
    //   781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   784: athrow
    //   785: aload_3
    //   786: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   789: getstatic burp/Zlid.Zx : Ljava/lang/Object;
    //   792: checkcast java/math/BigInteger
    //   795: invokevirtual intValue : ()I
    //   798: bipush #32
    //   800: irem
    //   801: invokestatic abs : (I)I
    //   804: invokevirtual charAt : (I)C
    //   807: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   810: pop
    //   811: iload_2
    //   812: ifeq -> 1780
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   821: athrow
    //   822: aload_3
    //   823: getstatic burp/Zz0j.Zf : Ljava/lang/String;
    //   826: getstatic burp/Zrkc.ZI : Ljava/lang/Object;
    //   829: checkcast java/math/BigInteger
    //   832: invokevirtual intValue : ()I
    //   835: bipush #32
    //   837: irem
    //   838: invokestatic abs : (I)I
    //   841: invokevirtual charAt : (I)C
    //   844: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   847: pop
    //   848: iload_2
    //   849: ifeq -> 1780
    //   852: goto -> 859
    //   855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   858: athrow
    //   859: aload_3
    //   860: getstatic burp/Zz67.Zc : Ljava/lang/String;
    //   863: getstatic burp/Zz6t.ZA : Ljava/lang/Object;
    //   866: checkcast java/math/BigInteger
    //   869: invokevirtual intValue : ()I
    //   872: bipush #32
    //   874: irem
    //   875: invokestatic abs : (I)I
    //   878: invokevirtual charAt : (I)C
    //   881: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   884: pop
    //   885: iload_2
    //   886: ifeq -> 1780
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: aload_3
    //   897: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   900: getstatic burp/Zxxo.ZJ : Ljava/lang/Object;
    //   903: checkcast java/math/BigInteger
    //   906: invokevirtual intValue : ()I
    //   909: bipush #32
    //   911: irem
    //   912: invokestatic abs : (I)I
    //   915: invokevirtual charAt : (I)C
    //   918: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   921: pop
    //   922: iload_2
    //   923: ifeq -> 1780
    //   926: goto -> 933
    //   929: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   932: athrow
    //   933: aload_3
    //   934: getstatic burp/Zrfl.Zy : Ljava/lang/String;
    //   937: getstatic burp/Zle6.ZM : Ljava/lang/Object;
    //   940: checkcast java/math/BigInteger
    //   943: invokevirtual intValue : ()I
    //   946: bipush #32
    //   948: irem
    //   949: invokestatic abs : (I)I
    //   952: invokevirtual charAt : (I)C
    //   955: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   958: pop
    //   959: iload_2
    //   960: ifeq -> 1780
    //   963: goto -> 970
    //   966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   969: athrow
    //   970: aload_3
    //   971: getstatic burp/Zrp3.Zf : Ljava/lang/String;
    //   974: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
    //   977: checkcast java/math/BigInteger
    //   980: invokevirtual intValue : ()I
    //   983: bipush #32
    //   985: irem
    //   986: invokestatic abs : (I)I
    //   989: invokevirtual charAt : (I)C
    //   992: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   995: pop
    //   996: iload_2
    //   997: ifeq -> 1780
    //   1000: goto -> 1007
    //   1003: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1006: athrow
    //   1007: aload_3
    //   1008: getstatic burp/Zmrc.Zx : Ljava/lang/String;
    //   1011: getstatic burp/Zre1.ZN : Ljava/lang/Object;
    //   1014: checkcast java/math/BigInteger
    //   1017: invokevirtual intValue : ()I
    //   1020: bipush #32
    //   1022: irem
    //   1023: invokestatic abs : (I)I
    //   1026: invokevirtual charAt : (I)C
    //   1029: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1032: pop
    //   1033: iload_2
    //   1034: ifeq -> 1780
    //   1037: goto -> 1044
    //   1040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1043: athrow
    //   1044: aload_3
    //   1045: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   1048: getstatic burp/Zsyu.Zj : Ljava/lang/Object;
    //   1051: checkcast java/math/BigInteger
    //   1054: invokevirtual intValue : ()I
    //   1057: bipush #32
    //   1059: irem
    //   1060: invokestatic abs : (I)I
    //   1063: invokevirtual charAt : (I)C
    //   1066: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1069: pop
    //   1070: iload_2
    //   1071: ifeq -> 1780
    //   1074: goto -> 1081
    //   1077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1080: athrow
    //   1081: aload_3
    //   1082: getstatic burp/Zt5a.Zl : Ljava/lang/String;
    //   1085: getstatic burp/Zshq.ZK : Ljava/lang/Object;
    //   1088: checkcast java/math/BigInteger
    //   1091: invokevirtual intValue : ()I
    //   1094: bipush #32
    //   1096: irem
    //   1097: invokestatic abs : (I)I
    //   1100: invokevirtual charAt : (I)C
    //   1103: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1106: pop
    //   1107: iload_2
    //   1108: ifeq -> 1780
    //   1111: goto -> 1118
    //   1114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1117: athrow
    //   1118: aload_3
    //   1119: getstatic burp/Zz58.ZT : Ljava/lang/String;
    //   1122: getstatic burp/Zr_k.Zx : Ljava/lang/Object;
    //   1125: checkcast java/math/BigInteger
    //   1128: invokevirtual intValue : ()I
    //   1131: bipush #32
    //   1133: irem
    //   1134: invokestatic abs : (I)I
    //   1137: invokevirtual charAt : (I)C
    //   1140: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1143: pop
    //   1144: iload_2
    //   1145: ifeq -> 1780
    //   1148: goto -> 1155
    //   1151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1154: athrow
    //   1155: aload_3
    //   1156: getstatic burp/Zl8i.Zb : Ljava/lang/String;
    //   1159: getstatic burp/Zgre.ZD : Ljava/lang/Object;
    //   1162: checkcast java/math/BigInteger
    //   1165: invokevirtual intValue : ()I
    //   1168: bipush #32
    //   1170: irem
    //   1171: invokestatic abs : (I)I
    //   1174: invokevirtual charAt : (I)C
    //   1177: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1180: pop
    //   1181: iload_2
    //   1182: ifeq -> 1780
    //   1185: goto -> 1192
    //   1188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1191: athrow
    //   1192: aload_3
    //   1193: getstatic burp/Zr4k.Zy : Ljava/lang/String;
    //   1196: getstatic burp/Zlxs.ZK : Ljava/lang/Object;
    //   1199: checkcast java/math/BigInteger
    //   1202: invokevirtual intValue : ()I
    //   1205: bipush #32
    //   1207: irem
    //   1208: invokestatic abs : (I)I
    //   1211: invokevirtual charAt : (I)C
    //   1214: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1217: pop
    //   1218: iload_2
    //   1219: ifeq -> 1780
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1228: athrow
    //   1229: aload_3
    //   1230: getstatic burp/Zs8q.Zs : Ljava/lang/String;
    //   1233: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   1236: checkcast java/math/BigInteger
    //   1239: invokevirtual intValue : ()I
    //   1242: bipush #32
    //   1244: irem
    //   1245: invokestatic abs : (I)I
    //   1248: invokevirtual charAt : (I)C
    //   1251: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1254: pop
    //   1255: iload_2
    //   1256: ifeq -> 1780
    //   1259: goto -> 1266
    //   1262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1265: athrow
    //   1266: aload_3
    //   1267: getstatic burp/Zsxm.Zq : Ljava/lang/String;
    //   1270: getstatic burp/Zl8i.ZY : Ljava/lang/Object;
    //   1273: checkcast java/math/BigInteger
    //   1276: invokevirtual intValue : ()I
    //   1279: bipush #32
    //   1281: irem
    //   1282: invokestatic abs : (I)I
    //   1285: invokevirtual charAt : (I)C
    //   1288: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1291: pop
    //   1292: iload_2
    //   1293: ifeq -> 1780
    //   1296: goto -> 1303
    //   1299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1302: athrow
    //   1303: aload_3
    //   1304: getstatic burp/Zty5.Za : Ljava/lang/String;
    //   1307: getstatic burp/Zrd4.Ze : Ljava/lang/Object;
    //   1310: checkcast java/math/BigInteger
    //   1313: invokevirtual intValue : ()I
    //   1316: bipush #32
    //   1318: irem
    //   1319: invokestatic abs : (I)I
    //   1322: invokevirtual charAt : (I)C
    //   1325: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1328: pop
    //   1329: iload_2
    //   1330: ifeq -> 1780
    //   1333: goto -> 1340
    //   1336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1339: athrow
    //   1340: aload_3
    //   1341: getstatic burp/Zl1n.ZZ : Ljava/lang/String;
    //   1344: getstatic burp/Zr14.Zy : Ljava/lang/Object;
    //   1347: checkcast java/math/BigInteger
    //   1350: invokevirtual intValue : ()I
    //   1353: bipush #32
    //   1355: irem
    //   1356: invokestatic abs : (I)I
    //   1359: invokevirtual charAt : (I)C
    //   1362: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1365: pop
    //   1366: iload_2
    //   1367: ifeq -> 1780
    //   1370: goto -> 1377
    //   1373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1376: athrow
    //   1377: aload_3
    //   1378: getstatic burp/Zz5h.Zk : Ljava/lang/String;
    //   1381: getstatic burp/Zmt6.ZK : Ljava/lang/Object;
    //   1384: checkcast java/math/BigInteger
    //   1387: invokevirtual intValue : ()I
    //   1390: bipush #32
    //   1392: irem
    //   1393: invokestatic abs : (I)I
    //   1396: invokevirtual charAt : (I)C
    //   1399: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1402: pop
    //   1403: iload_2
    //   1404: ifeq -> 1780
    //   1407: goto -> 1414
    //   1410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1413: athrow
    //   1414: aload_3
    //   1415: getstatic burp/Zb6b.Zn : Ljava/lang/String;
    //   1418: getstatic burp/Zsxm.Zv : Ljava/lang/Object;
    //   1421: checkcast java/math/BigInteger
    //   1424: invokevirtual intValue : ()I
    //   1427: bipush #32
    //   1429: irem
    //   1430: invokestatic abs : (I)I
    //   1433: invokevirtual charAt : (I)C
    //   1436: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1439: pop
    //   1440: iload_2
    //   1441: ifeq -> 1780
    //   1444: goto -> 1451
    //   1447: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1450: athrow
    //   1451: aload_3
    //   1452: getstatic burp/Zeu2.ZK : Ljava/lang/String;
    //   1455: getstatic burp/Ze6k.Zs : Ljava/lang/Object;
    //   1458: checkcast java/math/BigInteger
    //   1461: invokevirtual intValue : ()I
    //   1464: bipush #32
    //   1466: irem
    //   1467: invokestatic abs : (I)I
    //   1470: invokevirtual charAt : (I)C
    //   1473: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1476: pop
    //   1477: iload_2
    //   1478: ifeq -> 1780
    //   1481: goto -> 1488
    //   1484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1487: athrow
    //   1488: aload_3
    //   1489: getstatic burp/Zgkp.ZS : Ljava/lang/String;
    //   1492: getstatic burp/Zkht.ZR : Ljava/lang/Object;
    //   1495: checkcast java/math/BigInteger
    //   1498: invokevirtual intValue : ()I
    //   1501: bipush #32
    //   1503: irem
    //   1504: invokestatic abs : (I)I
    //   1507: invokevirtual charAt : (I)C
    //   1510: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1513: pop
    //   1514: iload_2
    //   1515: ifeq -> 1780
    //   1518: goto -> 1525
    //   1521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1524: athrow
    //   1525: aload_3
    //   1526: getstatic burp/Zmji.Zs : Ljava/lang/String;
    //   1529: getstatic burp/Ze3d.Ze : Ljava/lang/Object;
    //   1532: checkcast java/math/BigInteger
    //   1535: invokevirtual intValue : ()I
    //   1538: bipush #32
    //   1540: irem
    //   1541: invokestatic abs : (I)I
    //   1544: invokevirtual charAt : (I)C
    //   1547: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1550: pop
    //   1551: iload_2
    //   1552: ifeq -> 1780
    //   1555: goto -> 1562
    //   1558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1561: athrow
    //   1562: aload_3
    //   1563: getstatic burp/Zls0.ZI : Ljava/lang/String;
    //   1566: getstatic burp/Zb9k.Zi : Ljava/lang/Object;
    //   1569: checkcast java/math/BigInteger
    //   1572: invokevirtual intValue : ()I
    //   1575: bipush #32
    //   1577: irem
    //   1578: invokestatic abs : (I)I
    //   1581: invokevirtual charAt : (I)C
    //   1584: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1587: pop
    //   1588: iload_2
    //   1589: ifeq -> 1780
    //   1592: goto -> 1599
    //   1595: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1598: athrow
    //   1599: aload_3
    //   1600: getstatic burp/Zmrc.Zx : Ljava/lang/String;
    //   1603: getstatic burp/Zk7w.ZF : Ljava/lang/Object;
    //   1606: checkcast java/math/BigInteger
    //   1609: invokevirtual intValue : ()I
    //   1612: bipush #32
    //   1614: irem
    //   1615: invokestatic abs : (I)I
    //   1618: invokevirtual charAt : (I)C
    //   1621: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1624: pop
    //   1625: iload_2
    //   1626: ifeq -> 1780
    //   1629: goto -> 1636
    //   1632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1635: athrow
    //   1636: aload_3
    //   1637: getstatic burp/Ze6k.ZM : Ljava/lang/String;
    //   1640: getstatic burp/Zbsr.ZD : Ljava/lang/Object;
    //   1643: checkcast java/math/BigInteger
    //   1646: invokevirtual intValue : ()I
    //   1649: bipush #32
    //   1651: irem
    //   1652: invokestatic abs : (I)I
    //   1655: invokevirtual charAt : (I)C
    //   1658: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1661: pop
    //   1662: iload_2
    //   1663: ifeq -> 1780
    //   1666: goto -> 1673
    //   1669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1672: athrow
    //   1673: aload_3
    //   1674: getstatic burp/Zbxp.ZS : Ljava/lang/String;
    //   1677: getstatic burp/Zz16.ZK : Ljava/lang/Object;
    //   1680: checkcast java/math/BigInteger
    //   1683: invokevirtual intValue : ()I
    //   1686: bipush #32
    //   1688: irem
    //   1689: invokestatic abs : (I)I
    //   1692: invokevirtual charAt : (I)C
    //   1695: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1698: pop
    //   1699: iload_2
    //   1700: ifeq -> 1780
    //   1703: goto -> 1710
    //   1706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1709: athrow
    //   1710: aload_3
    //   1711: getstatic burp/Zgw_.ZH : Ljava/lang/String;
    //   1714: getstatic burp/Zk88.ZX : Ljava/lang/Object;
    //   1717: checkcast java/math/BigInteger
    //   1720: invokevirtual intValue : ()I
    //   1723: bipush #32
    //   1725: irem
    //   1726: invokestatic abs : (I)I
    //   1729: invokevirtual charAt : (I)C
    //   1732: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1735: pop
    //   1736: iload_2
    //   1737: ifeq -> 1780
    //   1740: goto -> 1747
    //   1743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1746: athrow
    //   1747: aload_3
    //   1748: getstatic burp/Zl8f.ZK : Ljava/lang/String;
    //   1751: getstatic burp/Zk7w.ZF : Ljava/lang/Object;
    //   1754: checkcast java/math/BigInteger
    //   1757: invokevirtual intValue : ()I
    //   1760: bipush #32
    //   1762: irem
    //   1763: invokestatic abs : (I)I
    //   1766: invokevirtual charAt : (I)C
    //   1769: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1772: pop
    //   1773: goto -> 1780
    //   1776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1779: athrow
    //   1780: iinc #4, 1
    //   1783: iload_2
    //   1784: ifeq -> 448
    //   1787: aload_3
    //   1788: invokevirtual toString : ()Ljava/lang/String;
    //   1791: putstatic burp/Zb3l.Zz : Ljava/lang/String;
    //   1794: sipush #-10682
    //   1797: sipush #-648
    //   1800: invokestatic a : (II)Ljava/lang/String;
    //   1803: iconst_1
    //   1804: ldc burp/Zlxh
    //   1806: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1809: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1812: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1815: astore #4
    //   1817: aload #4
    //   1819: arraylength
    //   1820: istore #5
    //   1822: iconst_0
    //   1823: istore #6
    //   1825: iload #6
    //   1827: iload #5
    //   1829: if_icmpge -> 1967
    //   1832: aload #4
    //   1834: iload #6
    //   1836: aaload
    //   1837: astore #7
    //   1839: aload #7
    //   1841: invokevirtual getModifiers : ()I
    //   1844: invokestatic isStatic : (I)Z
    //   1847: ifne -> 1857
    //   1850: goto -> 1960
    //   1853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1856: athrow
    //   1857: aload #7
    //   1859: invokevirtual getType : ()Ljava/lang/Class;
    //   1862: astore #8
    //   1864: aload #8
    //   1866: ifnull -> 1947
    //   1869: aload #8
    //   1871: invokevirtual isPrimitive : ()Z
    //   1874: ifne -> 1947
    //   1877: goto -> 1884
    //   1880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1883: athrow
    //   1884: aload #8
    //   1886: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1889: ifnull -> 1947
    //   1892: goto -> 1899
    //   1895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1898: athrow
    //   1899: aload #8
    //   1901: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1904: invokevirtual getName : ()Ljava/lang/String;
    //   1907: ifnull -> 1947
    //   1910: goto -> 1917
    //   1913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1916: athrow
    //   1917: aload #8
    //   1919: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1922: invokevirtual getName : ()Ljava/lang/String;
    //   1925: sipush #-10680
    //   1928: sipush #-6652
    //   1931: invokestatic a : (II)Ljava/lang/String;
    //   1934: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1937: ifne -> 1947
    //   1940: goto -> 1947
    //   1943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1946: athrow
    //   1947: aload #7
    //   1949: iconst_1
    //   1950: invokevirtual setAccessible : (Z)V
    //   1953: aload #7
    //   1955: aconst_null
    //   1956: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1959: pop
    //   1960: iinc #6, 1
    //   1963: iload_2
    //   1964: ifeq -> 1825
    //   1967: sipush #-10686
    //   1970: sipush #-9405
    //   1973: invokestatic a : (II)Ljava/lang/String;
    //   1976: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1979: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1982: astore #4
    //   1984: aload #4
    //   1986: arraylength
    //   1987: istore #5
    //   1989: iconst_0
    //   1990: istore #6
    //   1992: iload #6
    //   1994: iload #5
    //   1996: if_icmpge -> 2108
    //   1999: aload #4
    //   2001: iload #6
    //   2003: aaload
    //   2004: astore #7
    //   2006: aload #7
    //   2008: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2011: pop
    //   2012: aload #7
    //   2014: invokevirtual getModifiers : ()I
    //   2017: invokestatic isStatic : (I)Z
    //   2020: ifeq -> 2094
    //   2023: aload #7
    //   2025: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2028: arraylength
    //   2029: iconst_2
    //   2030: if_icmpne -> 2094
    //   2033: goto -> 2040
    //   2036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2039: athrow
    //   2040: aload #7
    //   2042: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2045: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2048: if_acmpne -> 2094
    //   2051: goto -> 2058
    //   2054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2057: athrow
    //   2058: aload #7
    //   2060: iconst_1
    //   2061: invokevirtual setAccessible : (Z)V
    //   2064: aload #7
    //   2066: aconst_null
    //   2067: iconst_2
    //   2068: anewarray java/lang/Object
    //   2071: dup
    //   2072: iconst_0
    //   2073: aload_0
    //   2074: aastore
    //   2075: dup
    //   2076: iconst_1
    //   2077: aload_1
    //   2078: aastore
    //   2079: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2082: pop
    //   2083: iload_2
    //   2084: ifeq -> 2108
    //   2087: goto -> 2094
    //   2090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2093: athrow
    //   2094: iinc #6, 1
    //   2097: iload_2
    //   2098: ifeq -> 1992
    //   2101: goto -> 2108
    //   2104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2107: athrow
    //   2108: sipush #-10688
    //   2111: sipush #-29962
    //   2114: invokestatic a : (II)Ljava/lang/String;
    //   2117: iconst_1
    //   2118: ldc burp/Zs5i
    //   2120: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2123: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2126: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2129: astore #4
    //   2131: aload #4
    //   2133: arraylength
    //   2134: istore #5
    //   2136: iconst_0
    //   2137: istore #6
    //   2139: iload #6
    //   2141: iload #5
    //   2143: if_icmpge -> 2281
    //   2146: aload #4
    //   2148: iload #6
    //   2150: aaload
    //   2151: astore #7
    //   2153: aload #7
    //   2155: invokevirtual getModifiers : ()I
    //   2158: invokestatic isStatic : (I)Z
    //   2161: ifne -> 2171
    //   2164: goto -> 2274
    //   2167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2170: athrow
    //   2171: aload #7
    //   2173: invokevirtual getType : ()Ljava/lang/Class;
    //   2176: astore #8
    //   2178: aload #8
    //   2180: ifnull -> 2261
    //   2183: aload #8
    //   2185: invokevirtual isPrimitive : ()Z
    //   2188: ifne -> 2261
    //   2191: goto -> 2198
    //   2194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2197: athrow
    //   2198: aload #8
    //   2200: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2203: ifnull -> 2261
    //   2206: goto -> 2213
    //   2209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2212: athrow
    //   2213: aload #8
    //   2215: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2218: invokevirtual getName : ()Ljava/lang/String;
    //   2221: ifnull -> 2261
    //   2224: goto -> 2231
    //   2227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2230: athrow
    //   2231: aload #8
    //   2233: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2236: invokevirtual getName : ()Ljava/lang/String;
    //   2239: sipush #-10684
    //   2242: sipush #-18581
    //   2245: invokestatic a : (II)Ljava/lang/String;
    //   2248: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2251: ifne -> 2261
    //   2254: goto -> 2261
    //   2257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2260: athrow
    //   2261: aload #7
    //   2263: iconst_1
    //   2264: invokevirtual setAccessible : (Z)V
    //   2267: aload #7
    //   2269: aconst_null
    //   2270: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2273: pop
    //   2274: iinc #6, 1
    //   2277: iload_2
    //   2278: ifeq -> 2139
    //   2281: sipush #-10673
    //   2284: sipush #26431
    //   2287: invokestatic a : (II)Ljava/lang/String;
    //   2290: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2293: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2296: astore #4
    //   2298: aload #4
    //   2300: arraylength
    //   2301: istore #5
    //   2303: iconst_0
    //   2304: istore #6
    //   2306: iload #6
    //   2308: iload #5
    //   2310: if_icmpge -> 2443
    //   2313: aload #4
    //   2315: iload #6
    //   2317: aaload
    //   2318: astore #7
    //   2320: aload #7
    //   2322: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2325: pop
    //   2326: aload #7
    //   2328: invokevirtual getModifiers : ()I
    //   2331: invokestatic isStatic : (I)Z
    //   2334: ifeq -> 2429
    //   2337: aload #7
    //   2339: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2342: arraylength
    //   2343: iconst_2
    //   2344: if_icmpne -> 2429
    //   2347: goto -> 2354
    //   2350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2353: athrow
    //   2354: aload #7
    //   2356: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2359: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2362: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2365: ifeq -> 2429
    //   2368: goto -> 2375
    //   2371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2374: athrow
    //   2375: aload #7
    //   2377: iconst_1
    //   2378: invokevirtual setAccessible : (Z)V
    //   2381: aload #7
    //   2383: aconst_null
    //   2384: iconst_2
    //   2385: anewarray java/lang/Object
    //   2388: dup
    //   2389: iconst_0
    //   2390: aload_0
    //   2391: aastore
    //   2392: dup
    //   2393: iconst_1
    //   2394: aload_1
    //   2395: ifnonnull -> 2413
    //   2398: goto -> 2405
    //   2401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2404: athrow
    //   2405: aload_1
    //   2406: goto -> 2420
    //   2409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2412: athrow
    //   2413: aload_1
    //   2414: checkcast [B
    //   2417: invokevirtual clone : ()Ljava/lang/Object;
    //   2420: aastore
    //   2421: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2424: pop
    //   2425: iload_2
    //   2426: ifeq -> 2443
    //   2429: iinc #6, 1
    //   2432: iload_2
    //   2433: ifeq -> 2306
    //   2436: goto -> 2443
    //   2439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2442: athrow
    //   2443: getstatic burp/Zkde.Zk : Ljava/lang/Object;
    //   2446: checkcast java/math/BigInteger
    //   2449: invokevirtual intValue : ()I
    //   2452: i2l
    //   2453: invokestatic currentTimeMillis : ()J
    //   2456: ladd
    //   2457: getstatic burp/Zem6.Zm : Ljava/lang/Object;
    //   2460: checkcast java/math/BigInteger
    //   2463: invokevirtual intValue : ()I
    //   2466: i2l
    //   2467: lcmp
    //   2468: ifge -> 2806
    //   2471: sipush #-10678
    //   2474: sipush #-29891
    //   2477: invokestatic a : (II)Ljava/lang/String;
    //   2480: iconst_1
    //   2481: ldc burp/Zlh2
    //   2483: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2486: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2489: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2492: astore #4
    //   2494: aload #4
    //   2496: arraylength
    //   2497: istore #5
    //   2499: iconst_0
    //   2500: istore #6
    //   2502: iload #6
    //   2504: iload #5
    //   2506: if_icmpge -> 2644
    //   2509: aload #4
    //   2511: iload #6
    //   2513: aaload
    //   2514: astore #7
    //   2516: aload #7
    //   2518: invokevirtual getModifiers : ()I
    //   2521: invokestatic isStatic : (I)Z
    //   2524: ifne -> 2534
    //   2527: goto -> 2637
    //   2530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2533: athrow
    //   2534: aload #7
    //   2536: invokevirtual getType : ()Ljava/lang/Class;
    //   2539: astore #8
    //   2541: aload #8
    //   2543: ifnull -> 2624
    //   2546: aload #8
    //   2548: invokevirtual isPrimitive : ()Z
    //   2551: ifne -> 2624
    //   2554: goto -> 2561
    //   2557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2560: athrow
    //   2561: aload #8
    //   2563: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2566: ifnull -> 2624
    //   2569: goto -> 2576
    //   2572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2575: athrow
    //   2576: aload #8
    //   2578: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2581: invokevirtual getName : ()Ljava/lang/String;
    //   2584: ifnull -> 2624
    //   2587: goto -> 2594
    //   2590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2593: athrow
    //   2594: aload #8
    //   2596: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2599: invokevirtual getName : ()Ljava/lang/String;
    //   2602: sipush #-10684
    //   2605: sipush #-18581
    //   2608: invokestatic a : (II)Ljava/lang/String;
    //   2611: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2614: ifne -> 2624
    //   2617: goto -> 2624
    //   2620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2623: athrow
    //   2624: aload #7
    //   2626: iconst_1
    //   2627: invokevirtual setAccessible : (Z)V
    //   2630: aload #7
    //   2632: aconst_null
    //   2633: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2636: pop
    //   2637: iinc #6, 1
    //   2640: iload_2
    //   2641: ifeq -> 2502
    //   2644: sipush #-10677
    //   2647: sipush #-13781
    //   2650: invokestatic a : (II)Ljava/lang/String;
    //   2653: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2656: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2659: astore #4
    //   2661: aload #4
    //   2663: arraylength
    //   2664: istore #5
    //   2666: iconst_0
    //   2667: istore #6
    //   2669: iload #6
    //   2671: iload #5
    //   2673: if_icmpge -> 2806
    //   2676: aload #4
    //   2678: iload #6
    //   2680: aaload
    //   2681: astore #7
    //   2683: aload #7
    //   2685: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2688: pop
    //   2689: aload #7
    //   2691: invokevirtual getModifiers : ()I
    //   2694: invokestatic isStatic : (I)Z
    //   2697: ifeq -> 2792
    //   2700: aload #7
    //   2702: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2705: arraylength
    //   2706: iconst_2
    //   2707: if_icmpne -> 2792
    //   2710: goto -> 2717
    //   2713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2716: athrow
    //   2717: aload #7
    //   2719: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2722: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2725: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2728: ifeq -> 2792
    //   2731: goto -> 2738
    //   2734: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2737: athrow
    //   2738: aload #7
    //   2740: iconst_1
    //   2741: invokevirtual setAccessible : (Z)V
    //   2744: aload #7
    //   2746: aconst_null
    //   2747: iconst_2
    //   2748: anewarray java/lang/Object
    //   2751: dup
    //   2752: iconst_0
    //   2753: aload_0
    //   2754: aastore
    //   2755: dup
    //   2756: iconst_1
    //   2757: aload_1
    //   2758: ifnonnull -> 2776
    //   2761: goto -> 2768
    //   2764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2767: athrow
    //   2768: aload_1
    //   2769: goto -> 2783
    //   2772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2775: athrow
    //   2776: aload_1
    //   2777: checkcast [B
    //   2780: invokevirtual clone : ()Ljava/lang/Object;
    //   2783: aastore
    //   2784: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2787: pop
    //   2788: iload_2
    //   2789: ifeq -> 2806
    //   2792: iinc #6, 1
    //   2795: iload_2
    //   2796: ifeq -> 2669
    //   2799: goto -> 2806
    //   2802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2805: athrow
    //   2806: getstatic burp/Ztys.Zn : Ljava/lang/String;
    //   2809: getstatic burp/Zsej.ZT : Ljava/lang/Object;
    //   2812: checkcast java/math/BigInteger
    //   2815: invokevirtual intValue : ()I
    //   2818: bipush #32
    //   2820: irem
    //   2821: invokestatic abs : (I)I
    //   2824: invokevirtual charAt : (I)C
    //   2827: getstatic burp/Zlav.ZW : Ljava/lang/String;
    //   2830: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
    //   2833: checkcast java/math/BigInteger
    //   2836: invokevirtual intValue : ()I
    //   2839: bipush #32
    //   2841: irem
    //   2842: invokestatic abs : (I)I
    //   2845: invokevirtual charAt : (I)C
    //   2848: if_icmpgt -> 2955
    //   2851: getstatic burp/Ze08.Zh : Ljava/lang/String;
    //   2854: getstatic burp/Zlp7.ZM : Ljava/lang/Object;
    //   2857: checkcast java/math/BigInteger
    //   2860: invokevirtual intValue : ()I
    //   2863: bipush #32
    //   2865: irem
    //   2866: invokestatic abs : (I)I
    //   2869: invokevirtual charAt : (I)C
    //   2872: getstatic burp/Zvh.ZP : Ljava/lang/String;
    //   2875: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
    //   2878: checkcast java/math/BigInteger
    //   2881: invokevirtual intValue : ()I
    //   2884: bipush #32
    //   2886: irem
    //   2887: invokestatic abs : (I)I
    //   2890: invokevirtual charAt : (I)C
    //   2893: if_icmple -> 2955
    //   2896: goto -> 2903
    //   2899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2902: athrow
    //   2903: getstatic burp/Zxn9.ZU : Ljava/lang/String;
    //   2906: getstatic burp/Zkby.Zv : Ljava/lang/Object;
    //   2909: checkcast java/math/BigInteger
    //   2912: invokevirtual intValue : ()I
    //   2915: bipush #32
    //   2917: irem
    //   2918: invokestatic abs : (I)I
    //   2921: invokevirtual charAt : (I)C
    //   2924: getstatic burp/Zek5.ZE : Ljava/lang/String;
    //   2927: getstatic burp/Zzip.ZW : Ljava/lang/Object;
    //   2930: checkcast java/math/BigInteger
    //   2933: invokevirtual intValue : ()I
    //   2936: bipush #32
    //   2938: irem
    //   2939: invokestatic abs : (I)I
    //   2942: invokevirtual charAt : (I)C
    //   2945: if_icmple -> 2963
    //   2948: goto -> 2955
    //   2951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2954: athrow
    //   2955: iconst_1
    //   2956: goto -> 2964
    //   2959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2962: athrow
    //   2963: iconst_0
    //   2964: ireturn
    //   2965: astore_3
    //   2966: new java/lang/Exception
    //   2969: dup
    //   2970: aload_3
    //   2971: invokevirtual getMessage : ()Ljava/lang/String;
    //   2974: invokespecial <init> : (Ljava/lang/String;)V
    //   2977: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2964	2965	java/lang/Throwable
    //   209	237	240	java/lang/Throwable
    //   219	254	257	java/lang/Throwable
    //   244	282	285	java/lang/Throwable
    //   261	299	302	java/lang/Throwable
    //   289	327	330	java/lang/Throwable
    //   306	344	347	java/lang/Throwable
    //   334	362	365	java/lang/Throwable
    //   351	376	379	java/lang/Throwable
    //   455	630	633	java/lang/Throwable
    //   600	667	670	java/lang/Throwable
    //   637	704	707	java/lang/Throwable
    //   674	741	744	java/lang/Throwable
    //   711	778	781	java/lang/Throwable
    //   748	815	818	java/lang/Throwable
    //   785	852	855	java/lang/Throwable
    //   822	889	892	java/lang/Throwable
    //   859	926	929	java/lang/Throwable
    //   896	963	966	java/lang/Throwable
    //   933	1000	1003	java/lang/Throwable
    //   970	1037	1040	java/lang/Throwable
    //   1007	1074	1077	java/lang/Throwable
    //   1044	1111	1114	java/lang/Throwable
    //   1081	1148	1151	java/lang/Throwable
    //   1118	1185	1188	java/lang/Throwable
    //   1155	1222	1225	java/lang/Throwable
    //   1192	1259	1262	java/lang/Throwable
    //   1229	1296	1299	java/lang/Throwable
    //   1266	1333	1336	java/lang/Throwable
    //   1303	1370	1373	java/lang/Throwable
    //   1340	1407	1410	java/lang/Throwable
    //   1377	1444	1447	java/lang/Throwable
    //   1414	1481	1484	java/lang/Throwable
    //   1451	1518	1521	java/lang/Throwable
    //   1488	1555	1558	java/lang/Throwable
    //   1525	1592	1595	java/lang/Throwable
    //   1562	1629	1632	java/lang/Throwable
    //   1599	1666	1669	java/lang/Throwable
    //   1636	1703	1706	java/lang/Throwable
    //   1673	1740	1743	java/lang/Throwable
    //   1710	1773	1776	java/lang/Throwable
    //   1839	1853	1853	java/lang/Throwable
    //   1864	1877	1880	java/lang/Throwable
    //   1869	1892	1895	java/lang/Throwable
    //   1884	1910	1913	java/lang/Throwable
    //   1899	1940	1943	java/lang/Throwable
    //   2006	2033	2036	java/lang/Throwable
    //   2023	2051	2054	java/lang/Throwable
    //   2040	2087	2090	java/lang/Throwable
    //   2058	2101	2104	java/lang/Throwable
    //   2153	2167	2167	java/lang/Throwable
    //   2178	2191	2194	java/lang/Throwable
    //   2183	2206	2209	java/lang/Throwable
    //   2198	2224	2227	java/lang/Throwable
    //   2213	2254	2257	java/lang/Throwable
    //   2320	2347	2350	java/lang/Throwable
    //   2337	2368	2371	java/lang/Throwable
    //   2354	2398	2401	java/lang/Throwable
    //   2375	2409	2409	java/lang/Throwable
    //   2420	2436	2439	java/lang/Throwable
    //   2516	2530	2530	java/lang/Throwable
    //   2541	2554	2557	java/lang/Throwable
    //   2546	2569	2572	java/lang/Throwable
    //   2561	2587	2590	java/lang/Throwable
    //   2576	2617	2620	java/lang/Throwable
    //   2683	2710	2713	java/lang/Throwable
    //   2700	2731	2734	java/lang/Throwable
    //   2717	2761	2764	java/lang/Throwable
    //   2738	2772	2772	java/lang/Throwable
    //   2783	2799	2802	java/lang/Throwable
    //   2806	2896	2899	java/lang/Throwable
    //   2851	2948	2951	java/lang/Throwable
    //   2903	2959	2959	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¡E2Ý¯?àÖ\\tï&û±L' q÷ñ"tÓª\\tpÜg¹òý\\nßßa'Ð3;ü«ôä\\tüQ_ÚÈýNJÂ¬\\t@XX1ªKÝkL\\b¦?nÂ?Å×Câ/IåER¶ÿÑx&ösØ1}"ôRFÏÊØå 0@qÃVqº®²äÑæ[\\t-ó£Br¦ ¸ÝÔKUlÓ¦áÓô Þ¯ZqKä»VÝ*Ü\\tÓùä9é\\tâPZ¢ÌPü\\t# ba¥àMp9pÖ/m!uøQ:ÒÉ¦éÃ+6kÿAè\\bzßYÂ*HïÁ+¥'B5Ò~¡Ç¤Wx\\fùe(mg³^à,Þé¢e/!ð¥<ÄàÌiUæ¬©'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #61
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
    //   68: ldc 'åÜÂÉ© \\t«Mx8Tµ\æ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #38
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
    //   129: putstatic burp/Zg27.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg27.b : [Ljava/lang/String;
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
    //   212: bipush #23
    //   214: goto -> 244
    //   217: bipush #81
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #37
    //   234: goto -> 244
    //   237: bipush #80
    //   239: goto -> 244
    //   242: bipush #108
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
    //   304: sipush #-10679
    //   307: sipush #-31331
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zg27.ZQ : Ljava/lang/Object;
    //   319: sipush #-10687
    //   322: sipush #-24479
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zg27.ZP : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD643) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg27.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */