package burp;

import java.math.BigInteger;

class Zbow extends ClassLoader {
  static String Zr;
  
  static Object ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Ze(Object paramObject) {
    Zb3d.Zr = a(-26634, -10263);
    Zb3d.Zw = new BigInteger(a(-26645, -24965));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmdf.Zo.charAt(Math.abs(((BigInteger)Zku9.Zp).intValue() % 32)) <= Zr.charAt(Math.abs(((BigInteger)Zti4.Zi).intValue() % 32))) {
          try {
            Zty5.Zj(Class.forName(a(-26656, -19694)));
            if (!bool)
              Zkdx.Zs(Class.forName(a(-26646, 21898))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkdx.Zs(Class.forName(a(-26646, 21898)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrfa.Zj : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: iload #6
    //   22: aload_3
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: aload_3
    //   28: iload #6
    //   30: baload
    //   31: istore #7
    //   33: iload #7
    //   35: bipush #48
    //   37: if_icmplt -> 54
    //   40: iload #7
    //   42: bipush #57
    //   44: if_icmple -> 152
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: iload #7
    //   56: bipush #65
    //   58: if_icmplt -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iload #7
    //   70: bipush #90
    //   72: if_icmple -> 152
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: iload #7
    //   84: bipush #97
    //   86: if_icmplt -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #7
    //   98: bipush #122
    //   100: if_icmple -> 152
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: iload #7
    //   112: bipush #43
    //   114: if_icmpeq -> 152
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: iload #7
    //   126: bipush #47
    //   128: if_icmpeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: iload #7
    //   140: bipush #61
    //   142: if_icmpne -> 162
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: iinc #5, 1
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: iinc #6, 1
    //   165: iload_2
    //   166: ifne -> 20
    //   169: iload #5
    //   171: newarray byte
    //   173: astore #6
    //   175: iconst_0
    //   176: istore #7
    //   178: iconst_0
    //   179: istore #8
    //   181: iload #8
    //   183: aload_3
    //   184: arraylength
    //   185: if_icmpge -> 337
    //   188: aload_3
    //   189: iload #8
    //   191: baload
    //   192: istore #9
    //   194: iload #9
    //   196: bipush #48
    //   198: if_icmplt -> 215
    //   201: iload #9
    //   203: bipush #57
    //   205: if_icmple -> 313
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: iload #9
    //   217: bipush #65
    //   219: if_icmplt -> 243
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   228: athrow
    //   229: iload #9
    //   231: bipush #90
    //   233: if_icmple -> 313
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iload #9
    //   245: bipush #97
    //   247: if_icmplt -> 271
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   256: athrow
    //   257: iload #9
    //   259: bipush #122
    //   261: if_icmple -> 313
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: iload #9
    //   273: bipush #43
    //   275: if_icmpeq -> 313
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   284: athrow
    //   285: iload #9
    //   287: bipush #47
    //   289: if_icmpeq -> 313
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: iload #9
    //   301: bipush #61
    //   303: if_icmpne -> 330
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iload #7
    //   317: iload #9
    //   319: bastore
    //   320: iinc #7, 1
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #8, 1
    //   333: iload_2
    //   334: ifne -> 181
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: astore_3
    //   344: aload_3
    //   345: arraylength
    //   346: istore #5
    //   348: aload_3
    //   349: iload #5
    //   351: iconst_1
    //   352: isub
    //   353: baload
    //   354: bipush #61
    //   356: if_icmpne -> 366
    //   359: iinc #5, -1
    //   362: iload_2
    //   363: ifne -> 348
    //   366: iload #5
    //   368: aload_3
    //   369: arraylength
    //   370: iconst_4
    //   371: idiv
    //   372: isub
    //   373: newarray byte
    //   375: astore #6
    //   377: iconst_0
    //   378: istore #7
    //   380: iload #7
    //   382: aload_3
    //   383: arraylength
    //   384: if_icmpge -> 646
    //   387: aload_3
    //   388: iload #7
    //   390: baload
    //   391: bipush #61
    //   393: if_icmpne -> 412
    //   396: aload_3
    //   397: iload #7
    //   399: iconst_0
    //   400: bastore
    //   401: iload_2
    //   402: ifne -> 639
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: athrow
    //   412: aload_3
    //   413: iload #7
    //   415: baload
    //   416: bipush #47
    //   418: if_icmpne -> 445
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   427: athrow
    //   428: aload_3
    //   429: iload #7
    //   431: bipush #63
    //   433: bastore
    //   434: iload_2
    //   435: ifne -> 639
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   444: athrow
    //   445: aload_3
    //   446: iload #7
    //   448: baload
    //   449: bipush #43
    //   451: if_icmpne -> 478
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload_3
    //   462: iload #7
    //   464: bipush #62
    //   466: bastore
    //   467: iload_2
    //   468: ifne -> 639
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   477: athrow
    //   478: aload_3
    //   479: iload #7
    //   481: baload
    //   482: bipush #48
    //   484: if_icmplt -> 533
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload_3
    //   495: iload #7
    //   497: baload
    //   498: bipush #57
    //   500: if_icmpgt -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: aload_3
    //   511: iload #7
    //   513: aload_3
    //   514: iload #7
    //   516: baload
    //   517: bipush #-4
    //   519: isub
    //   520: i2b
    //   521: bastore
    //   522: iload_2
    //   523: ifne -> 639
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: iload #7
    //   536: baload
    //   537: bipush #97
    //   539: if_icmplt -> 588
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #122
    //   555: if_icmpgt -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload_3
    //   566: iload #7
    //   568: aload_3
    //   569: iload #7
    //   571: baload
    //   572: bipush #71
    //   574: isub
    //   575: i2b
    //   576: bastore
    //   577: iload_2
    //   578: ifne -> 639
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload_3
    //   589: iload #7
    //   591: baload
    //   592: bipush #65
    //   594: if_icmplt -> 639
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #90
    //   610: if_icmpgt -> 639
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload_3
    //   621: iload #7
    //   623: aload_3
    //   624: iload #7
    //   626: baload
    //   627: bipush #65
    //   629: isub
    //   630: i2b
    //   631: bastore
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iinc #7, 1
    //   642: iload_2
    //   643: ifne -> 380
    //   646: iconst_0
    //   647: istore #7
    //   649: iconst_0
    //   650: istore #8
    //   652: iload #8
    //   654: aload #6
    //   656: arraylength
    //   657: iconst_2
    //   658: isub
    //   659: if_icmpge -> 762
    //   662: aload #6
    //   664: iload #8
    //   666: aload_3
    //   667: iload #7
    //   669: baload
    //   670: iconst_2
    //   671: ishl
    //   672: sipush #255
    //   675: iand
    //   676: aload_3
    //   677: iload #7
    //   679: iconst_1
    //   680: iadd
    //   681: baload
    //   682: iconst_4
    //   683: iushr
    //   684: iconst_3
    //   685: iand
    //   686: ior
    //   687: i2b
    //   688: bastore
    //   689: aload #6
    //   691: iload #8
    //   693: iconst_1
    //   694: iadd
    //   695: aload_3
    //   696: iload #7
    //   698: iconst_1
    //   699: iadd
    //   700: baload
    //   701: iconst_4
    //   702: ishl
    //   703: sipush #255
    //   706: iand
    //   707: aload_3
    //   708: iload #7
    //   710: iconst_2
    //   711: iadd
    //   712: baload
    //   713: iconst_2
    //   714: iushr
    //   715: bipush #15
    //   717: iand
    //   718: ior
    //   719: i2b
    //   720: bastore
    //   721: aload #6
    //   723: iload #8
    //   725: iconst_2
    //   726: iadd
    //   727: aload_3
    //   728: iload #7
    //   730: iconst_2
    //   731: iadd
    //   732: baload
    //   733: bipush #6
    //   735: ishl
    //   736: sipush #255
    //   739: iand
    //   740: aload_3
    //   741: iload #7
    //   743: iconst_3
    //   744: iadd
    //   745: baload
    //   746: bipush #63
    //   748: iand
    //   749: ior
    //   750: i2b
    //   751: bastore
    //   752: iinc #7, 4
    //   755: iinc #8, 3
    //   758: iload_2
    //   759: ifne -> 652
    //   762: iload #8
    //   764: aload #6
    //   766: arraylength
    //   767: if_icmpge -> 804
    //   770: aload #6
    //   772: iload #8
    //   774: aload_3
    //   775: iload #7
    //   777: baload
    //   778: iconst_2
    //   779: ishl
    //   780: sipush #255
    //   783: iand
    //   784: aload_3
    //   785: iload #7
    //   787: iconst_1
    //   788: iadd
    //   789: baload
    //   790: iconst_4
    //   791: iushr
    //   792: iconst_3
    //   793: iand
    //   794: ior
    //   795: i2b
    //   796: bastore
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: iinc #8, 1
    //   807: iload #8
    //   809: aload #6
    //   811: arraylength
    //   812: if_icmpge -> 852
    //   815: aload #6
    //   817: iload #8
    //   819: aload_3
    //   820: iload #7
    //   822: iconst_1
    //   823: iadd
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: sipush #255
    //   830: iand
    //   831: aload_3
    //   832: iload #7
    //   834: iconst_2
    //   835: iadd
    //   836: baload
    //   837: iconst_2
    //   838: iushr
    //   839: bipush #15
    //   841: iand
    //   842: ior
    //   843: i2b
    //   844: bastore
    //   845: goto -> 852
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #6
    //   854: astore #4
    //   856: new java/math/BigInteger
    //   859: dup
    //   860: aload #4
    //   862: invokespecial <init> : ([B)V
    //   865: invokevirtual abs : ()Ljava/math/BigInteger;
    //   868: putstatic burp/Zreu.Zi : Ljava/lang/Object;
    //   871: new java/lang/StringBuilder
    //   874: dup
    //   875: invokespecial <init> : ()V
    //   878: astore_3
    //   879: iconst_0
    //   880: istore #4
    //   882: iload #4
    //   884: bipush #32
    //   886: if_icmpge -> 2219
    //   889: iload #4
    //   891: tableswitch default -> 2212, 0 -> 1032, 1 -> 1069, 2 -> 1106, 3 -> 1143, 4 -> 1180, 5 -> 1217, 6 -> 1254, 7 -> 1291, 8 -> 1328, 9 -> 1365, 10 -> 1402, 11 -> 1439, 12 -> 1476, 13 -> 1513, 14 -> 1550, 15 -> 1587, 16 -> 1624, 17 -> 1661, 18 -> 1698, 19 -> 1735, 20 -> 1772, 21 -> 1809, 22 -> 1846, 23 -> 1883, 24 -> 1920, 25 -> 1957, 26 -> 1994, 27 -> 2031, 28 -> 2068, 29 -> 2105, 30 -> 2142, 31 -> 2179
    //   1032: aload_3
    //   1033: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   1036: getstatic burp/Zld9.ZF : Ljava/lang/Object;
    //   1039: checkcast java/math/BigInteger
    //   1042: invokevirtual intValue : ()I
    //   1045: bipush #32
    //   1047: irem
    //   1048: invokestatic abs : (I)I
    //   1051: invokevirtual charAt : (I)C
    //   1054: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1057: pop
    //   1058: iload_2
    //   1059: ifne -> 2212
    //   1062: goto -> 1069
    //   1065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1068: athrow
    //   1069: aload_3
    //   1070: getstatic burp/Zdv.Zz : Ljava/lang/String;
    //   1073: getstatic burp/Zb2u.ZY : Ljava/lang/Object;
    //   1076: checkcast java/math/BigInteger
    //   1079: invokevirtual intValue : ()I
    //   1082: bipush #32
    //   1084: irem
    //   1085: invokestatic abs : (I)I
    //   1088: invokevirtual charAt : (I)C
    //   1091: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1094: pop
    //   1095: iload_2
    //   1096: ifne -> 2212
    //   1099: goto -> 1106
    //   1102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1105: athrow
    //   1106: aload_3
    //   1107: getstatic burp/Zl2t.Zg : Ljava/lang/String;
    //   1110: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
    //   1113: checkcast java/math/BigInteger
    //   1116: invokevirtual intValue : ()I
    //   1119: bipush #32
    //   1121: irem
    //   1122: invokestatic abs : (I)I
    //   1125: invokevirtual charAt : (I)C
    //   1128: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1131: pop
    //   1132: iload_2
    //   1133: ifne -> 2212
    //   1136: goto -> 1143
    //   1139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1142: athrow
    //   1143: aload_3
    //   1144: getstatic burp/Zbnz.Zp : Ljava/lang/String;
    //   1147: getstatic burp/Zv8d.ZN : Ljava/lang/Object;
    //   1150: checkcast java/math/BigInteger
    //   1153: invokevirtual intValue : ()I
    //   1156: bipush #32
    //   1158: irem
    //   1159: invokestatic abs : (I)I
    //   1162: invokevirtual charAt : (I)C
    //   1165: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1168: pop
    //   1169: iload_2
    //   1170: ifne -> 2212
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload_3
    //   1181: getstatic burp/Zlcc.Zw : Ljava/lang/String;
    //   1184: getstatic burp/Zxc0.Zl : Ljava/lang/Object;
    //   1187: checkcast java/math/BigInteger
    //   1190: invokevirtual intValue : ()I
    //   1193: bipush #32
    //   1195: irem
    //   1196: invokestatic abs : (I)I
    //   1199: invokevirtual charAt : (I)C
    //   1202: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1205: pop
    //   1206: iload_2
    //   1207: ifne -> 2212
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1216: athrow
    //   1217: aload_3
    //   1218: getstatic burp/Zzii.Zl : Ljava/lang/String;
    //   1221: getstatic burp/Zgsy.ZC : Ljava/lang/Object;
    //   1224: checkcast java/math/BigInteger
    //   1227: invokevirtual intValue : ()I
    //   1230: bipush #32
    //   1232: irem
    //   1233: invokestatic abs : (I)I
    //   1236: invokevirtual charAt : (I)C
    //   1239: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1242: pop
    //   1243: iload_2
    //   1244: ifne -> 2212
    //   1247: goto -> 1254
    //   1250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1253: athrow
    //   1254: aload_3
    //   1255: getstatic burp/Zlxr.ZS : Ljava/lang/String;
    //   1258: getstatic burp/Zse8.Zn : Ljava/lang/Object;
    //   1261: checkcast java/math/BigInteger
    //   1264: invokevirtual intValue : ()I
    //   1267: bipush #32
    //   1269: irem
    //   1270: invokestatic abs : (I)I
    //   1273: invokevirtual charAt : (I)C
    //   1276: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1279: pop
    //   1280: iload_2
    //   1281: ifne -> 2212
    //   1284: goto -> 1291
    //   1287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1290: athrow
    //   1291: aload_3
    //   1292: getstatic burp/Zos.Za : Ljava/lang/String;
    //   1295: getstatic burp/Zg0f.Zm : Ljava/lang/Object;
    //   1298: checkcast java/math/BigInteger
    //   1301: invokevirtual intValue : ()I
    //   1304: bipush #32
    //   1306: irem
    //   1307: invokestatic abs : (I)I
    //   1310: invokevirtual charAt : (I)C
    //   1313: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1316: pop
    //   1317: iload_2
    //   1318: ifne -> 2212
    //   1321: goto -> 1328
    //   1324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1327: athrow
    //   1328: aload_3
    //   1329: getstatic burp/Zxn9.ZU : Ljava/lang/String;
    //   1332: getstatic burp/Zl1e.Zp : Ljava/lang/Object;
    //   1335: checkcast java/math/BigInteger
    //   1338: invokevirtual intValue : ()I
    //   1341: bipush #32
    //   1343: irem
    //   1344: invokestatic abs : (I)I
    //   1347: invokevirtual charAt : (I)C
    //   1350: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1353: pop
    //   1354: iload_2
    //   1355: ifne -> 2212
    //   1358: goto -> 1365
    //   1361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1364: athrow
    //   1365: aload_3
    //   1366: getstatic burp/Zrjq.Zx : Ljava/lang/String;
    //   1369: getstatic burp/Zgtx.Z_ : Ljava/lang/Object;
    //   1372: checkcast java/math/BigInteger
    //   1375: invokevirtual intValue : ()I
    //   1378: bipush #32
    //   1380: irem
    //   1381: invokestatic abs : (I)I
    //   1384: invokevirtual charAt : (I)C
    //   1387: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1390: pop
    //   1391: iload_2
    //   1392: ifne -> 2212
    //   1395: goto -> 1402
    //   1398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1401: athrow
    //   1402: aload_3
    //   1403: getstatic burp/Zek4.Zo : Ljava/lang/String;
    //   1406: getstatic burp/Zbow.ZS : Ljava/lang/Object;
    //   1409: checkcast java/math/BigInteger
    //   1412: invokevirtual intValue : ()I
    //   1415: bipush #32
    //   1417: irem
    //   1418: invokestatic abs : (I)I
    //   1421: invokevirtual charAt : (I)C
    //   1424: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1427: pop
    //   1428: iload_2
    //   1429: ifne -> 2212
    //   1432: goto -> 1439
    //   1435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1438: athrow
    //   1439: aload_3
    //   1440: getstatic burp/Zxn9.ZU : Ljava/lang/String;
    //   1443: getstatic burp/Zxt7.ZV : Ljava/lang/Object;
    //   1446: checkcast java/math/BigInteger
    //   1449: invokevirtual intValue : ()I
    //   1452: bipush #32
    //   1454: irem
    //   1455: invokestatic abs : (I)I
    //   1458: invokevirtual charAt : (I)C
    //   1461: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1464: pop
    //   1465: iload_2
    //   1466: ifne -> 2212
    //   1469: goto -> 1476
    //   1472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1475: athrow
    //   1476: aload_3
    //   1477: getstatic burp/Zb9q.Zk : Ljava/lang/String;
    //   1480: getstatic burp/Zb0q.ZK : Ljava/lang/Object;
    //   1483: checkcast java/math/BigInteger
    //   1486: invokevirtual intValue : ()I
    //   1489: bipush #32
    //   1491: irem
    //   1492: invokestatic abs : (I)I
    //   1495: invokevirtual charAt : (I)C
    //   1498: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1501: pop
    //   1502: iload_2
    //   1503: ifne -> 2212
    //   1506: goto -> 1513
    //   1509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1512: athrow
    //   1513: aload_3
    //   1514: getstatic burp/Zbli.ZW : Ljava/lang/String;
    //   1517: getstatic burp/Zb3d.Zw : Ljava/lang/Object;
    //   1520: checkcast java/math/BigInteger
    //   1523: invokevirtual intValue : ()I
    //   1526: bipush #32
    //   1528: irem
    //   1529: invokestatic abs : (I)I
    //   1532: invokevirtual charAt : (I)C
    //   1535: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1538: pop
    //   1539: iload_2
    //   1540: ifne -> 2212
    //   1543: goto -> 1550
    //   1546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1549: athrow
    //   1550: aload_3
    //   1551: getstatic burp/Ztnn.ZS : Ljava/lang/String;
    //   1554: getstatic burp/Zrym.Zk : Ljava/lang/Object;
    //   1557: checkcast java/math/BigInteger
    //   1560: invokevirtual intValue : ()I
    //   1563: bipush #32
    //   1565: irem
    //   1566: invokestatic abs : (I)I
    //   1569: invokevirtual charAt : (I)C
    //   1572: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1575: pop
    //   1576: iload_2
    //   1577: ifne -> 2212
    //   1580: goto -> 1587
    //   1583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1586: athrow
    //   1587: aload_3
    //   1588: getstatic burp/Zr17.Zu : Ljava/lang/String;
    //   1591: getstatic burp/Zetf.Zs : Ljava/lang/Object;
    //   1594: checkcast java/math/BigInteger
    //   1597: invokevirtual intValue : ()I
    //   1600: bipush #32
    //   1602: irem
    //   1603: invokestatic abs : (I)I
    //   1606: invokevirtual charAt : (I)C
    //   1609: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1612: pop
    //   1613: iload_2
    //   1614: ifne -> 2212
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload_3
    //   1625: getstatic burp/Zt85.ZR : Ljava/lang/String;
    //   1628: getstatic burp/Zv8l.ZL : Ljava/lang/Object;
    //   1631: checkcast java/math/BigInteger
    //   1634: invokevirtual intValue : ()I
    //   1637: bipush #32
    //   1639: irem
    //   1640: invokestatic abs : (I)I
    //   1643: invokevirtual charAt : (I)C
    //   1646: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1649: pop
    //   1650: iload_2
    //   1651: ifne -> 2212
    //   1654: goto -> 1661
    //   1657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1660: athrow
    //   1661: aload_3
    //   1662: getstatic burp/Zxxh.Zm : Ljava/lang/String;
    //   1665: getstatic burp/Zk5k.Zr : Ljava/lang/Object;
    //   1668: checkcast java/math/BigInteger
    //   1671: invokevirtual intValue : ()I
    //   1674: bipush #32
    //   1676: irem
    //   1677: invokestatic abs : (I)I
    //   1680: invokevirtual charAt : (I)C
    //   1683: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1686: pop
    //   1687: iload_2
    //   1688: ifne -> 2212
    //   1691: goto -> 1698
    //   1694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1697: athrow
    //   1698: aload_3
    //   1699: getstatic burp/Zzr8.ZY : Ljava/lang/String;
    //   1702: getstatic burp/Zetf.Zs : Ljava/lang/Object;
    //   1705: checkcast java/math/BigInteger
    //   1708: invokevirtual intValue : ()I
    //   1711: bipush #32
    //   1713: irem
    //   1714: invokestatic abs : (I)I
    //   1717: invokevirtual charAt : (I)C
    //   1720: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1723: pop
    //   1724: iload_2
    //   1725: ifne -> 2212
    //   1728: goto -> 1735
    //   1731: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1734: athrow
    //   1735: aload_3
    //   1736: getstatic burp/Zbnk.Zg : Ljava/lang/String;
    //   1739: getstatic burp/Zos.ZB : Ljava/lang/Object;
    //   1742: checkcast java/math/BigInteger
    //   1745: invokevirtual intValue : ()I
    //   1748: bipush #32
    //   1750: irem
    //   1751: invokestatic abs : (I)I
    //   1754: invokevirtual charAt : (I)C
    //   1757: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1760: pop
    //   1761: iload_2
    //   1762: ifne -> 2212
    //   1765: goto -> 1772
    //   1768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1771: athrow
    //   1772: aload_3
    //   1773: getstatic burp/Zt7x.Zu : Ljava/lang/String;
    //   1776: getstatic burp/Zti7.Zw : Ljava/lang/Object;
    //   1779: checkcast java/math/BigInteger
    //   1782: invokevirtual intValue : ()I
    //   1785: bipush #32
    //   1787: irem
    //   1788: invokestatic abs : (I)I
    //   1791: invokevirtual charAt : (I)C
    //   1794: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1797: pop
    //   1798: iload_2
    //   1799: ifne -> 2212
    //   1802: goto -> 1809
    //   1805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1808: athrow
    //   1809: aload_3
    //   1810: getstatic burp/Zzc9.Zv : Ljava/lang/String;
    //   1813: getstatic burp/Znu.Zf : Ljava/lang/Object;
    //   1816: checkcast java/math/BigInteger
    //   1819: invokevirtual intValue : ()I
    //   1822: bipush #32
    //   1824: irem
    //   1825: invokestatic abs : (I)I
    //   1828: invokevirtual charAt : (I)C
    //   1831: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1834: pop
    //   1835: iload_2
    //   1836: ifne -> 2212
    //   1839: goto -> 1846
    //   1842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1845: athrow
    //   1846: aload_3
    //   1847: getstatic burp/Zrip.Zy : Ljava/lang/String;
    //   1850: getstatic burp/Zl1e.Zp : Ljava/lang/Object;
    //   1853: checkcast java/math/BigInteger
    //   1856: invokevirtual intValue : ()I
    //   1859: bipush #32
    //   1861: irem
    //   1862: invokestatic abs : (I)I
    //   1865: invokevirtual charAt : (I)C
    //   1868: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1871: pop
    //   1872: iload_2
    //   1873: ifne -> 2212
    //   1876: goto -> 1883
    //   1879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1882: athrow
    //   1883: aload_3
    //   1884: getstatic burp/Zrt3.Zu : Ljava/lang/String;
    //   1887: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   1890: checkcast java/math/BigInteger
    //   1893: invokevirtual intValue : ()I
    //   1896: bipush #32
    //   1898: irem
    //   1899: invokestatic abs : (I)I
    //   1902: invokevirtual charAt : (I)C
    //   1905: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1908: pop
    //   1909: iload_2
    //   1910: ifne -> 2212
    //   1913: goto -> 1920
    //   1916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1919: athrow
    //   1920: aload_3
    //   1921: getstatic burp/Zk7o.Zb : Ljava/lang/String;
    //   1924: getstatic burp/Ztbn.ZA : Ljava/lang/Object;
    //   1927: checkcast java/math/BigInteger
    //   1930: invokevirtual intValue : ()I
    //   1933: bipush #32
    //   1935: irem
    //   1936: invokestatic abs : (I)I
    //   1939: invokevirtual charAt : (I)C
    //   1942: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1945: pop
    //   1946: iload_2
    //   1947: ifne -> 2212
    //   1950: goto -> 1957
    //   1953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1956: athrow
    //   1957: aload_3
    //   1958: getstatic burp/Zrye.Za : Ljava/lang/String;
    //   1961: getstatic burp/Zl_a.ZP : Ljava/lang/Object;
    //   1964: checkcast java/math/BigInteger
    //   1967: invokevirtual intValue : ()I
    //   1970: bipush #32
    //   1972: irem
    //   1973: invokestatic abs : (I)I
    //   1976: invokevirtual charAt : (I)C
    //   1979: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1982: pop
    //   1983: iload_2
    //   1984: ifne -> 2212
    //   1987: goto -> 1994
    //   1990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1993: athrow
    //   1994: aload_3
    //   1995: getstatic burp/Zmdf.Zo : Ljava/lang/String;
    //   1998: getstatic burp/Zld5.ZX : Ljava/lang/Object;
    //   2001: checkcast java/math/BigInteger
    //   2004: invokevirtual intValue : ()I
    //   2007: bipush #32
    //   2009: irem
    //   2010: invokestatic abs : (I)I
    //   2013: invokevirtual charAt : (I)C
    //   2016: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2019: pop
    //   2020: iload_2
    //   2021: ifne -> 2212
    //   2024: goto -> 2031
    //   2027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2030: athrow
    //   2031: aload_3
    //   2032: getstatic burp/Zmyk.Zx : Ljava/lang/String;
    //   2035: getstatic burp/Zlwc.ZG : Ljava/lang/Object;
    //   2038: checkcast java/math/BigInteger
    //   2041: invokevirtual intValue : ()I
    //   2044: bipush #32
    //   2046: irem
    //   2047: invokestatic abs : (I)I
    //   2050: invokevirtual charAt : (I)C
    //   2053: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2056: pop
    //   2057: iload_2
    //   2058: ifne -> 2212
    //   2061: goto -> 2068
    //   2064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2067: athrow
    //   2068: aload_3
    //   2069: getstatic burp/Zzk_.ZX : Ljava/lang/String;
    //   2072: getstatic burp/Zgio.ZP : Ljava/lang/Object;
    //   2075: checkcast java/math/BigInteger
    //   2078: invokevirtual intValue : ()I
    //   2081: bipush #32
    //   2083: irem
    //   2084: invokestatic abs : (I)I
    //   2087: invokevirtual charAt : (I)C
    //   2090: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2093: pop
    //   2094: iload_2
    //   2095: ifne -> 2212
    //   2098: goto -> 2105
    //   2101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2104: athrow
    //   2105: aload_3
    //   2106: getstatic burp/Zlxr.ZS : Ljava/lang/String;
    //   2109: getstatic burp/Zse8.Zn : Ljava/lang/Object;
    //   2112: checkcast java/math/BigInteger
    //   2115: invokevirtual intValue : ()I
    //   2118: bipush #32
    //   2120: irem
    //   2121: invokestatic abs : (I)I
    //   2124: invokevirtual charAt : (I)C
    //   2127: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2130: pop
    //   2131: iload_2
    //   2132: ifne -> 2212
    //   2135: goto -> 2142
    //   2138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2141: athrow
    //   2142: aload_3
    //   2143: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   2146: getstatic burp/Zeva.Zf : Ljava/lang/Object;
    //   2149: checkcast java/math/BigInteger
    //   2152: invokevirtual intValue : ()I
    //   2155: bipush #32
    //   2157: irem
    //   2158: invokestatic abs : (I)I
    //   2161: invokevirtual charAt : (I)C
    //   2164: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2167: pop
    //   2168: iload_2
    //   2169: ifne -> 2212
    //   2172: goto -> 2179
    //   2175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2178: athrow
    //   2179: aload_3
    //   2180: getstatic burp/Zsn9.Zp : Ljava/lang/String;
    //   2183: getstatic burp/Zlbd.ZU : Ljava/lang/Object;
    //   2186: checkcast java/math/BigInteger
    //   2189: invokevirtual intValue : ()I
    //   2192: bipush #32
    //   2194: irem
    //   2195: invokestatic abs : (I)I
    //   2198: invokevirtual charAt : (I)C
    //   2201: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2204: pop
    //   2205: goto -> 2212
    //   2208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2211: athrow
    //   2212: iinc #4, 1
    //   2215: iload_2
    //   2216: ifne -> 882
    //   2219: aload_3
    //   2220: invokevirtual toString : ()Ljava/lang/String;
    //   2223: putstatic burp/Ztl6.Zb : Ljava/lang/String;
    //   2226: sipush #-26640
    //   2229: sipush #-11877
    //   2232: invokestatic a : (II)Ljava/lang/String;
    //   2235: iconst_1
    //   2236: ldc burp/Zgqp
    //   2238: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2241: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2244: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2247: astore #4
    //   2249: aload #4
    //   2251: arraylength
    //   2252: istore #5
    //   2254: iconst_0
    //   2255: istore #6
    //   2257: iload #6
    //   2259: iload #5
    //   2261: if_icmpge -> 2399
    //   2264: aload #4
    //   2266: iload #6
    //   2268: aaload
    //   2269: astore #7
    //   2271: aload #7
    //   2273: invokevirtual getModifiers : ()I
    //   2276: invokestatic isStatic : (I)Z
    //   2279: ifne -> 2289
    //   2282: goto -> 2392
    //   2285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2288: athrow
    //   2289: aload #7
    //   2291: invokevirtual getType : ()Ljava/lang/Class;
    //   2294: astore #8
    //   2296: aload #8
    //   2298: ifnull -> 2379
    //   2301: aload #8
    //   2303: invokevirtual isPrimitive : ()Z
    //   2306: ifne -> 2379
    //   2309: goto -> 2316
    //   2312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2315: athrow
    //   2316: aload #8
    //   2318: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2321: ifnull -> 2379
    //   2324: goto -> 2331
    //   2327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2330: athrow
    //   2331: aload #8
    //   2333: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2336: invokevirtual getName : ()Ljava/lang/String;
    //   2339: ifnull -> 2379
    //   2342: goto -> 2349
    //   2345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2348: athrow
    //   2349: aload #8
    //   2351: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2354: invokevirtual getName : ()Ljava/lang/String;
    //   2357: sipush #-26639
    //   2360: sipush #-24203
    //   2363: invokestatic a : (II)Ljava/lang/String;
    //   2366: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2369: ifne -> 2379
    //   2372: goto -> 2379
    //   2375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2378: athrow
    //   2379: aload #7
    //   2381: iconst_1
    //   2382: invokevirtual setAccessible : (Z)V
    //   2385: aload #7
    //   2387: aconst_null
    //   2388: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2391: pop
    //   2392: iinc #6, 1
    //   2395: iload_2
    //   2396: ifne -> 2257
    //   2399: sipush #-26654
    //   2402: sipush #-11502
    //   2405: invokestatic a : (II)Ljava/lang/String;
    //   2408: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2411: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2414: astore #4
    //   2416: aload #4
    //   2418: arraylength
    //   2419: istore #5
    //   2421: iconst_0
    //   2422: istore #6
    //   2424: iload #6
    //   2426: iload #5
    //   2428: if_icmpge -> 2561
    //   2431: aload #4
    //   2433: iload #6
    //   2435: aaload
    //   2436: astore #7
    //   2438: aload #7
    //   2440: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2443: pop
    //   2444: aload #7
    //   2446: invokevirtual getModifiers : ()I
    //   2449: invokestatic isStatic : (I)Z
    //   2452: ifeq -> 2547
    //   2455: aload #7
    //   2457: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2460: arraylength
    //   2461: iconst_2
    //   2462: if_icmpne -> 2547
    //   2465: goto -> 2472
    //   2468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2471: athrow
    //   2472: aload #7
    //   2474: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2477: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2480: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2483: ifeq -> 2547
    //   2486: goto -> 2493
    //   2489: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2492: athrow
    //   2493: aload #7
    //   2495: iconst_1
    //   2496: invokevirtual setAccessible : (Z)V
    //   2499: aload #7
    //   2501: aconst_null
    //   2502: iconst_2
    //   2503: anewarray java/lang/Object
    //   2506: dup
    //   2507: iconst_0
    //   2508: aload_0
    //   2509: aastore
    //   2510: dup
    //   2511: iconst_1
    //   2512: aload_1
    //   2513: ifnonnull -> 2531
    //   2516: goto -> 2523
    //   2519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2522: athrow
    //   2523: aload_1
    //   2524: goto -> 2538
    //   2527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2530: athrow
    //   2531: aload_1
    //   2532: checkcast [B
    //   2535: invokevirtual clone : ()Ljava/lang/Object;
    //   2538: aastore
    //   2539: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2542: pop
    //   2543: iload_2
    //   2544: ifne -> 2561
    //   2547: iinc #6, 1
    //   2550: iload_2
    //   2551: ifne -> 2424
    //   2554: goto -> 2561
    //   2557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2560: athrow
    //   2561: iconst_0
    //   2562: istore #4
    //   2564: getstatic burp/Zx63.ZT : Ljava/lang/String;
    //   2567: getstatic burp/Zxdy.ZZ : Ljava/lang/Object;
    //   2570: checkcast java/math/BigInteger
    //   2573: invokevirtual intValue : ()I
    //   2576: bipush #32
    //   2578: irem
    //   2579: invokestatic abs : (I)I
    //   2582: invokevirtual charAt : (I)C
    //   2585: getstatic burp/Zz3b.Zi : Ljava/lang/String;
    //   2588: getstatic burp/Zt1h.Zb : Ljava/lang/Object;
    //   2591: checkcast java/math/BigInteger
    //   2594: invokevirtual intValue : ()I
    //   2597: bipush #32
    //   2599: irem
    //   2600: invokestatic abs : (I)I
    //   2603: invokevirtual charAt : (I)C
    //   2606: if_icmpgt -> 2951
    //   2609: sipush #-26655
    //   2612: sipush #3178
    //   2615: invokestatic a : (II)Ljava/lang/String;
    //   2618: iconst_1
    //   2619: ldc burp/Ztw4
    //   2621: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2624: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2627: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2630: astore #5
    //   2632: aload #5
    //   2634: arraylength
    //   2635: istore #6
    //   2637: iconst_0
    //   2638: istore #7
    //   2640: iload #7
    //   2642: iload #6
    //   2644: if_icmpge -> 2782
    //   2647: aload #5
    //   2649: iload #7
    //   2651: aaload
    //   2652: astore #8
    //   2654: aload #8
    //   2656: invokevirtual getModifiers : ()I
    //   2659: invokestatic isStatic : (I)Z
    //   2662: ifne -> 2672
    //   2665: goto -> 2775
    //   2668: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2671: athrow
    //   2672: aload #8
    //   2674: invokevirtual getType : ()Ljava/lang/Class;
    //   2677: astore #9
    //   2679: aload #9
    //   2681: ifnull -> 2762
    //   2684: aload #9
    //   2686: invokevirtual isPrimitive : ()Z
    //   2689: ifne -> 2762
    //   2692: goto -> 2699
    //   2695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2698: athrow
    //   2699: aload #9
    //   2701: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2704: ifnull -> 2762
    //   2707: goto -> 2714
    //   2710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2713: athrow
    //   2714: aload #9
    //   2716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2719: invokevirtual getName : ()Ljava/lang/String;
    //   2722: ifnull -> 2762
    //   2725: goto -> 2732
    //   2728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2731: athrow
    //   2732: aload #9
    //   2734: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2737: invokevirtual getName : ()Ljava/lang/String;
    //   2740: sipush #-26641
    //   2743: sipush #15370
    //   2746: invokestatic a : (II)Ljava/lang/String;
    //   2749: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2752: ifne -> 2762
    //   2755: goto -> 2762
    //   2758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2761: athrow
    //   2762: aload #8
    //   2764: iconst_1
    //   2765: invokevirtual setAccessible : (Z)V
    //   2768: aload #8
    //   2770: aconst_null
    //   2771: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2774: pop
    //   2775: iinc #7, 1
    //   2778: iload_2
    //   2779: ifne -> 2640
    //   2782: sipush #-26651
    //   2785: sipush #5031
    //   2788: invokestatic a : (II)Ljava/lang/String;
    //   2791: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2794: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2797: astore #5
    //   2799: aload #5
    //   2801: arraylength
    //   2802: istore #6
    //   2804: iconst_0
    //   2805: istore #7
    //   2807: iload #7
    //   2809: iload #6
    //   2811: if_icmpge -> 2948
    //   2814: aload #5
    //   2816: iload #7
    //   2818: aaload
    //   2819: astore #8
    //   2821: aload #8
    //   2823: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2826: pop
    //   2827: aload #8
    //   2829: invokevirtual getModifiers : ()I
    //   2832: invokestatic isStatic : (I)Z
    //   2835: ifeq -> 2934
    //   2838: aload #8
    //   2840: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2843: arraylength
    //   2844: iconst_2
    //   2845: if_icmpne -> 2934
    //   2848: goto -> 2855
    //   2851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2854: athrow
    //   2855: aload #8
    //   2857: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2860: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2863: if_acmpne -> 2934
    //   2866: goto -> 2873
    //   2869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2872: athrow
    //   2873: aload #8
    //   2875: iconst_1
    //   2876: invokevirtual setAccessible : (Z)V
    //   2879: aload #8
    //   2881: aconst_null
    //   2882: iconst_2
    //   2883: anewarray java/lang/Object
    //   2886: dup
    //   2887: iconst_0
    //   2888: aload_0
    //   2889: aastore
    //   2890: dup
    //   2891: iconst_1
    //   2892: aload_1
    //   2893: ifnonnull -> 2911
    //   2896: goto -> 2903
    //   2899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2902: athrow
    //   2903: aload_1
    //   2904: goto -> 2918
    //   2907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2910: athrow
    //   2911: aload_1
    //   2912: checkcast [B
    //   2915: invokevirtual clone : ()Ljava/lang/Object;
    //   2918: aastore
    //   2919: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2922: checkcast java/lang/Boolean
    //   2925: invokevirtual booleanValue : ()Z
    //   2928: istore #4
    //   2930: iload_2
    //   2931: ifne -> 2948
    //   2934: iinc #7, 1
    //   2937: iload_2
    //   2938: ifne -> 2807
    //   2941: goto -> 2948
    //   2944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2947: athrow
    //   2948: goto -> 3290
    //   2951: sipush #-26647
    //   2954: sipush #-18199
    //   2957: invokestatic a : (II)Ljava/lang/String;
    //   2960: iconst_1
    //   2961: ldc burp/Zr9p
    //   2963: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2966: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2969: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2972: astore #5
    //   2974: aload #5
    //   2976: arraylength
    //   2977: istore #6
    //   2979: iconst_0
    //   2980: istore #7
    //   2982: iload #7
    //   2984: iload #6
    //   2986: if_icmpge -> 3124
    //   2989: aload #5
    //   2991: iload #7
    //   2993: aaload
    //   2994: astore #8
    //   2996: aload #8
    //   2998: invokevirtual getModifiers : ()I
    //   3001: invokestatic isStatic : (I)Z
    //   3004: ifne -> 3014
    //   3007: goto -> 3117
    //   3010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3013: athrow
    //   3014: aload #8
    //   3016: invokevirtual getType : ()Ljava/lang/Class;
    //   3019: astore #9
    //   3021: aload #9
    //   3023: ifnull -> 3104
    //   3026: aload #9
    //   3028: invokevirtual isPrimitive : ()Z
    //   3031: ifne -> 3104
    //   3034: goto -> 3041
    //   3037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3040: athrow
    //   3041: aload #9
    //   3043: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3046: ifnull -> 3104
    //   3049: goto -> 3056
    //   3052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3055: athrow
    //   3056: aload #9
    //   3058: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3061: invokevirtual getName : ()Ljava/lang/String;
    //   3064: ifnull -> 3104
    //   3067: goto -> 3074
    //   3070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3073: athrow
    //   3074: aload #9
    //   3076: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3079: invokevirtual getName : ()Ljava/lang/String;
    //   3082: sipush #-26641
    //   3085: sipush #15370
    //   3088: invokestatic a : (II)Ljava/lang/String;
    //   3091: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3094: ifne -> 3104
    //   3097: goto -> 3104
    //   3100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3103: athrow
    //   3104: aload #8
    //   3106: iconst_1
    //   3107: invokevirtual setAccessible : (Z)V
    //   3110: aload #8
    //   3112: aconst_null
    //   3113: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3116: pop
    //   3117: iinc #7, 1
    //   3120: iload_2
    //   3121: ifne -> 2982
    //   3124: sipush #-26653
    //   3127: sipush #-29613
    //   3130: invokestatic a : (II)Ljava/lang/String;
    //   3133: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3136: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3139: astore #5
    //   3141: aload #5
    //   3143: arraylength
    //   3144: istore #6
    //   3146: iconst_0
    //   3147: istore #7
    //   3149: iload #7
    //   3151: iload #6
    //   3153: if_icmpge -> 3290
    //   3156: aload #5
    //   3158: iload #7
    //   3160: aaload
    //   3161: astore #8
    //   3163: aload #8
    //   3165: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3168: pop
    //   3169: aload #8
    //   3171: invokevirtual getModifiers : ()I
    //   3174: invokestatic isStatic : (I)Z
    //   3177: ifeq -> 3276
    //   3180: aload #8
    //   3182: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3185: arraylength
    //   3186: iconst_2
    //   3187: if_icmpne -> 3276
    //   3190: goto -> 3197
    //   3193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3196: athrow
    //   3197: aload #8
    //   3199: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3202: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3205: if_acmpne -> 3276
    //   3208: goto -> 3215
    //   3211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3214: athrow
    //   3215: aload #8
    //   3217: iconst_1
    //   3218: invokevirtual setAccessible : (Z)V
    //   3221: aload #8
    //   3223: aconst_null
    //   3224: iconst_2
    //   3225: anewarray java/lang/Object
    //   3228: dup
    //   3229: iconst_0
    //   3230: aload_0
    //   3231: aastore
    //   3232: dup
    //   3233: iconst_1
    //   3234: aload_1
    //   3235: ifnonnull -> 3253
    //   3238: goto -> 3245
    //   3241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3244: athrow
    //   3245: aload_1
    //   3246: goto -> 3260
    //   3249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3252: athrow
    //   3253: aload_1
    //   3254: checkcast [B
    //   3257: invokevirtual clone : ()Ljava/lang/Object;
    //   3260: aastore
    //   3261: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3264: checkcast java/lang/Boolean
    //   3267: invokevirtual booleanValue : ()Z
    //   3270: istore #4
    //   3272: iload_2
    //   3273: ifne -> 3290
    //   3276: iinc #7, 1
    //   3279: iload_2
    //   3280: ifne -> 3149
    //   3283: goto -> 3290
    //   3286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3289: athrow
    //   3290: iload #4
    //   3292: ifeq -> 3298
    //   3295: iload #4
    //   3297: ireturn
    //   3298: getstatic burp/Zm83.Zq : Ljava/lang/String;
    //   3301: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   3304: checkcast java/math/BigInteger
    //   3307: invokevirtual intValue : ()I
    //   3310: bipush #32
    //   3312: irem
    //   3313: invokestatic abs : (I)I
    //   3316: invokevirtual charAt : (I)C
    //   3319: getstatic burp/Zesw.ZC : Ljava/lang/String;
    //   3322: getstatic burp/Zlwc.ZG : Ljava/lang/Object;
    //   3325: checkcast java/math/BigInteger
    //   3328: invokevirtual intValue : ()I
    //   3331: bipush #32
    //   3333: irem
    //   3334: invokestatic abs : (I)I
    //   3337: invokevirtual charAt : (I)C
    //   3340: if_icmple -> 3686
    //   3343: sipush #-26636
    //   3346: sipush #-5295
    //   3349: invokestatic a : (II)Ljava/lang/String;
    //   3352: iconst_1
    //   3353: ldc burp/Zkk6
    //   3355: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3358: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3361: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3364: astore #5
    //   3366: aload #5
    //   3368: arraylength
    //   3369: istore #6
    //   3371: iconst_0
    //   3372: istore #7
    //   3374: iload #7
    //   3376: iload #6
    //   3378: if_icmpge -> 3516
    //   3381: aload #5
    //   3383: iload #7
    //   3385: aaload
    //   3386: astore #8
    //   3388: aload #8
    //   3390: invokevirtual getModifiers : ()I
    //   3393: invokestatic isStatic : (I)Z
    //   3396: ifne -> 3406
    //   3399: goto -> 3509
    //   3402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3405: athrow
    //   3406: aload #8
    //   3408: invokevirtual getType : ()Ljava/lang/Class;
    //   3411: astore #9
    //   3413: aload #9
    //   3415: ifnull -> 3496
    //   3418: aload #9
    //   3420: invokevirtual isPrimitive : ()Z
    //   3423: ifne -> 3496
    //   3426: goto -> 3433
    //   3429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3432: athrow
    //   3433: aload #9
    //   3435: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3438: ifnull -> 3496
    //   3441: goto -> 3448
    //   3444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3447: athrow
    //   3448: aload #9
    //   3450: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3453: invokevirtual getName : ()Ljava/lang/String;
    //   3456: ifnull -> 3496
    //   3459: goto -> 3466
    //   3462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3465: athrow
    //   3466: aload #9
    //   3468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3471: invokevirtual getName : ()Ljava/lang/String;
    //   3474: sipush #-26641
    //   3477: sipush #15370
    //   3480: invokestatic a : (II)Ljava/lang/String;
    //   3483: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3486: ifne -> 3496
    //   3489: goto -> 3496
    //   3492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3495: athrow
    //   3496: aload #8
    //   3498: iconst_1
    //   3499: invokevirtual setAccessible : (Z)V
    //   3502: aload #8
    //   3504: aconst_null
    //   3505: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3508: pop
    //   3509: iinc #7, 1
    //   3512: iload_2
    //   3513: ifne -> 3374
    //   3516: sipush #-26643
    //   3519: sipush #-21978
    //   3522: invokestatic a : (II)Ljava/lang/String;
    //   3525: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3528: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3531: astore #5
    //   3533: aload #5
    //   3535: arraylength
    //   3536: istore #6
    //   3538: iconst_0
    //   3539: istore #7
    //   3541: iload #7
    //   3543: iload #6
    //   3545: if_icmpge -> 3682
    //   3548: aload #5
    //   3550: iload #7
    //   3552: aaload
    //   3553: astore #8
    //   3555: aload #8
    //   3557: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3560: pop
    //   3561: aload #8
    //   3563: invokevirtual getModifiers : ()I
    //   3566: invokestatic isStatic : (I)Z
    //   3569: ifeq -> 3668
    //   3572: aload #8
    //   3574: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3577: arraylength
    //   3578: iconst_2
    //   3579: if_icmpne -> 3668
    //   3582: goto -> 3589
    //   3585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3588: athrow
    //   3589: aload #8
    //   3591: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3594: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3597: if_acmpne -> 3668
    //   3600: goto -> 3607
    //   3603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3606: athrow
    //   3607: aload #8
    //   3609: iconst_1
    //   3610: invokevirtual setAccessible : (Z)V
    //   3613: aload #8
    //   3615: aconst_null
    //   3616: iconst_2
    //   3617: anewarray java/lang/Object
    //   3620: dup
    //   3621: iconst_0
    //   3622: aload_0
    //   3623: aastore
    //   3624: dup
    //   3625: iconst_1
    //   3626: aload_1
    //   3627: ifnonnull -> 3645
    //   3630: goto -> 3637
    //   3633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3636: athrow
    //   3637: aload_1
    //   3638: goto -> 3652
    //   3641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3644: athrow
    //   3645: aload_1
    //   3646: checkcast [B
    //   3649: invokevirtual clone : ()Ljava/lang/Object;
    //   3652: aastore
    //   3653: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3656: checkcast java/lang/Boolean
    //   3659: invokevirtual booleanValue : ()Z
    //   3662: istore #4
    //   3664: iload_2
    //   3665: ifne -> 3682
    //   3668: iinc #7, 1
    //   3671: iload_2
    //   3672: ifne -> 3541
    //   3675: goto -> 3682
    //   3678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3681: athrow
    //   3682: iload_2
    //   3683: ifne -> 4025
    //   3686: sipush #-26652
    //   3689: sipush #17674
    //   3692: invokestatic a : (II)Ljava/lang/String;
    //   3695: iconst_1
    //   3696: ldc burp/Zrcy
    //   3698: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3701: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3704: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3707: astore #5
    //   3709: aload #5
    //   3711: arraylength
    //   3712: istore #6
    //   3714: iconst_0
    //   3715: istore #7
    //   3717: iload #7
    //   3719: iload #6
    //   3721: if_icmpge -> 3859
    //   3724: aload #5
    //   3726: iload #7
    //   3728: aaload
    //   3729: astore #8
    //   3731: aload #8
    //   3733: invokevirtual getModifiers : ()I
    //   3736: invokestatic isStatic : (I)Z
    //   3739: ifne -> 3749
    //   3742: goto -> 3852
    //   3745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3748: athrow
    //   3749: aload #8
    //   3751: invokevirtual getType : ()Ljava/lang/Class;
    //   3754: astore #9
    //   3756: aload #9
    //   3758: ifnull -> 3839
    //   3761: aload #9
    //   3763: invokevirtual isPrimitive : ()Z
    //   3766: ifne -> 3839
    //   3769: goto -> 3776
    //   3772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3775: athrow
    //   3776: aload #9
    //   3778: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3781: ifnull -> 3839
    //   3784: goto -> 3791
    //   3787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3790: athrow
    //   3791: aload #9
    //   3793: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3796: invokevirtual getName : ()Ljava/lang/String;
    //   3799: ifnull -> 3839
    //   3802: goto -> 3809
    //   3805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3808: athrow
    //   3809: aload #9
    //   3811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3814: invokevirtual getName : ()Ljava/lang/String;
    //   3817: sipush #-26641
    //   3820: sipush #15370
    //   3823: invokestatic a : (II)Ljava/lang/String;
    //   3826: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3829: ifne -> 3839
    //   3832: goto -> 3839
    //   3835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3838: athrow
    //   3839: aload #8
    //   3841: iconst_1
    //   3842: invokevirtual setAccessible : (Z)V
    //   3845: aload #8
    //   3847: aconst_null
    //   3848: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3851: pop
    //   3852: iinc #7, 1
    //   3855: iload_2
    //   3856: ifne -> 3717
    //   3859: sipush #-26635
    //   3862: sipush #-3882
    //   3865: invokestatic a : (II)Ljava/lang/String;
    //   3868: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3871: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3874: astore #5
    //   3876: aload #5
    //   3878: arraylength
    //   3879: istore #6
    //   3881: iconst_0
    //   3882: istore #7
    //   3884: iload #7
    //   3886: iload #6
    //   3888: if_icmpge -> 4025
    //   3891: aload #5
    //   3893: iload #7
    //   3895: aaload
    //   3896: astore #8
    //   3898: aload #8
    //   3900: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3903: pop
    //   3904: aload #8
    //   3906: invokevirtual getModifiers : ()I
    //   3909: invokestatic isStatic : (I)Z
    //   3912: ifeq -> 4011
    //   3915: aload #8
    //   3917: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3920: arraylength
    //   3921: iconst_2
    //   3922: if_icmpne -> 4011
    //   3925: goto -> 3932
    //   3928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3931: athrow
    //   3932: aload #8
    //   3934: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3937: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3940: if_acmpne -> 4011
    //   3943: goto -> 3950
    //   3946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3949: athrow
    //   3950: aload #8
    //   3952: iconst_1
    //   3953: invokevirtual setAccessible : (Z)V
    //   3956: aload #8
    //   3958: aconst_null
    //   3959: iconst_2
    //   3960: anewarray java/lang/Object
    //   3963: dup
    //   3964: iconst_0
    //   3965: aload_0
    //   3966: aastore
    //   3967: dup
    //   3968: iconst_1
    //   3969: aload_1
    //   3970: ifnonnull -> 3988
    //   3973: goto -> 3980
    //   3976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3979: athrow
    //   3980: aload_1
    //   3981: goto -> 3995
    //   3984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3987: athrow
    //   3988: aload_1
    //   3989: checkcast [B
    //   3992: invokevirtual clone : ()Ljava/lang/Object;
    //   3995: aastore
    //   3996: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3999: checkcast java/lang/Boolean
    //   4002: invokevirtual booleanValue : ()Z
    //   4005: istore #4
    //   4007: iload_2
    //   4008: ifne -> 4025
    //   4011: iinc #7, 1
    //   4014: iload_2
    //   4015: ifne -> 3884
    //   4018: goto -> 4025
    //   4021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4024: athrow
    //   4025: iload #4
    //   4027: ifeq -> 4033
    //   4030: iload #4
    //   4032: ireturn
    //   4033: getstatic burp/Zkdx.Ze : Ljava/lang/String;
    //   4036: getstatic burp/Zeub.ZD : Ljava/lang/Object;
    //   4039: checkcast java/math/BigInteger
    //   4042: invokevirtual intValue : ()I
    //   4045: bipush #32
    //   4047: irem
    //   4048: invokestatic abs : (I)I
    //   4051: invokevirtual charAt : (I)C
    //   4054: getstatic burp/Zl2t.Zg : Ljava/lang/String;
    //   4057: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
    //   4060: checkcast java/math/BigInteger
    //   4063: invokevirtual intValue : ()I
    //   4066: bipush #32
    //   4068: irem
    //   4069: invokestatic abs : (I)I
    //   4072: invokevirtual charAt : (I)C
    //   4075: if_icmpgt -> 4421
    //   4078: sipush #-26649
    //   4081: sipush #11601
    //   4084: invokestatic a : (II)Ljava/lang/String;
    //   4087: iconst_1
    //   4088: ldc burp/Zs5i
    //   4090: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4093: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4096: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4099: astore #5
    //   4101: aload #5
    //   4103: arraylength
    //   4104: istore #6
    //   4106: iconst_0
    //   4107: istore #7
    //   4109: iload #7
    //   4111: iload #6
    //   4113: if_icmpge -> 4251
    //   4116: aload #5
    //   4118: iload #7
    //   4120: aaload
    //   4121: astore #8
    //   4123: aload #8
    //   4125: invokevirtual getModifiers : ()I
    //   4128: invokestatic isStatic : (I)Z
    //   4131: ifne -> 4141
    //   4134: goto -> 4244
    //   4137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4140: athrow
    //   4141: aload #8
    //   4143: invokevirtual getType : ()Ljava/lang/Class;
    //   4146: astore #9
    //   4148: aload #9
    //   4150: ifnull -> 4231
    //   4153: aload #9
    //   4155: invokevirtual isPrimitive : ()Z
    //   4158: ifne -> 4231
    //   4161: goto -> 4168
    //   4164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4167: athrow
    //   4168: aload #9
    //   4170: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4173: ifnull -> 4231
    //   4176: goto -> 4183
    //   4179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4182: athrow
    //   4183: aload #9
    //   4185: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4188: invokevirtual getName : ()Ljava/lang/String;
    //   4191: ifnull -> 4231
    //   4194: goto -> 4201
    //   4197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4200: athrow
    //   4201: aload #9
    //   4203: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4206: invokevirtual getName : ()Ljava/lang/String;
    //   4209: sipush #-26641
    //   4212: sipush #15370
    //   4215: invokestatic a : (II)Ljava/lang/String;
    //   4218: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4221: ifne -> 4231
    //   4224: goto -> 4231
    //   4227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4230: athrow
    //   4231: aload #8
    //   4233: iconst_1
    //   4234: invokevirtual setAccessible : (Z)V
    //   4237: aload #8
    //   4239: aconst_null
    //   4240: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4243: pop
    //   4244: iinc #7, 1
    //   4247: iload_2
    //   4248: ifne -> 4109
    //   4251: sipush #-26637
    //   4254: sipush #770
    //   4257: invokestatic a : (II)Ljava/lang/String;
    //   4260: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4263: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4266: astore #5
    //   4268: aload #5
    //   4270: arraylength
    //   4271: istore #6
    //   4273: iconst_0
    //   4274: istore #7
    //   4276: iload #7
    //   4278: iload #6
    //   4280: if_icmpge -> 4417
    //   4283: aload #5
    //   4285: iload #7
    //   4287: aaload
    //   4288: astore #8
    //   4290: aload #8
    //   4292: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4295: pop
    //   4296: aload #8
    //   4298: invokevirtual getModifiers : ()I
    //   4301: invokestatic isStatic : (I)Z
    //   4304: ifeq -> 4403
    //   4307: aload #8
    //   4309: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4312: arraylength
    //   4313: iconst_2
    //   4314: if_icmpne -> 4403
    //   4317: goto -> 4324
    //   4320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4323: athrow
    //   4324: aload #8
    //   4326: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4329: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4332: if_acmpne -> 4403
    //   4335: goto -> 4342
    //   4338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4341: athrow
    //   4342: aload #8
    //   4344: iconst_1
    //   4345: invokevirtual setAccessible : (Z)V
    //   4348: aload #8
    //   4350: aconst_null
    //   4351: iconst_2
    //   4352: anewarray java/lang/Object
    //   4355: dup
    //   4356: iconst_0
    //   4357: aload_0
    //   4358: aastore
    //   4359: dup
    //   4360: iconst_1
    //   4361: aload_1
    //   4362: ifnonnull -> 4380
    //   4365: goto -> 4372
    //   4368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4371: athrow
    //   4372: aload_1
    //   4373: goto -> 4387
    //   4376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4379: athrow
    //   4380: aload_1
    //   4381: checkcast [B
    //   4384: invokevirtual clone : ()Ljava/lang/Object;
    //   4387: aastore
    //   4388: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4391: checkcast java/lang/Boolean
    //   4394: invokevirtual booleanValue : ()Z
    //   4397: istore #4
    //   4399: iload_2
    //   4400: ifne -> 4417
    //   4403: iinc #7, 1
    //   4406: iload_2
    //   4407: ifne -> 4276
    //   4410: goto -> 4417
    //   4413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4416: athrow
    //   4417: iload_2
    //   4418: ifne -> 4759
    //   4421: sipush #-26644
    //   4424: bipush #-68
    //   4426: invokestatic a : (II)Ljava/lang/String;
    //   4429: iconst_1
    //   4430: ldc burp/Zty4
    //   4432: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4435: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4438: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4441: astore #5
    //   4443: aload #5
    //   4445: arraylength
    //   4446: istore #6
    //   4448: iconst_0
    //   4449: istore #7
    //   4451: iload #7
    //   4453: iload #6
    //   4455: if_icmpge -> 4593
    //   4458: aload #5
    //   4460: iload #7
    //   4462: aaload
    //   4463: astore #8
    //   4465: aload #8
    //   4467: invokevirtual getModifiers : ()I
    //   4470: invokestatic isStatic : (I)Z
    //   4473: ifne -> 4483
    //   4476: goto -> 4586
    //   4479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4482: athrow
    //   4483: aload #8
    //   4485: invokevirtual getType : ()Ljava/lang/Class;
    //   4488: astore #9
    //   4490: aload #9
    //   4492: ifnull -> 4573
    //   4495: aload #9
    //   4497: invokevirtual isPrimitive : ()Z
    //   4500: ifne -> 4573
    //   4503: goto -> 4510
    //   4506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4509: athrow
    //   4510: aload #9
    //   4512: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4515: ifnull -> 4573
    //   4518: goto -> 4525
    //   4521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4524: athrow
    //   4525: aload #9
    //   4527: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4530: invokevirtual getName : ()Ljava/lang/String;
    //   4533: ifnull -> 4573
    //   4536: goto -> 4543
    //   4539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4542: athrow
    //   4543: aload #9
    //   4545: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4548: invokevirtual getName : ()Ljava/lang/String;
    //   4551: sipush #-26641
    //   4554: sipush #15370
    //   4557: invokestatic a : (II)Ljava/lang/String;
    //   4560: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4563: ifne -> 4573
    //   4566: goto -> 4573
    //   4569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4572: athrow
    //   4573: aload #8
    //   4575: iconst_1
    //   4576: invokevirtual setAccessible : (Z)V
    //   4579: aload #8
    //   4581: aconst_null
    //   4582: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4585: pop
    //   4586: iinc #7, 1
    //   4589: iload_2
    //   4590: ifne -> 4451
    //   4593: sipush #-26650
    //   4596: sipush #14466
    //   4599: invokestatic a : (II)Ljava/lang/String;
    //   4602: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4605: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4608: astore #5
    //   4610: aload #5
    //   4612: arraylength
    //   4613: istore #6
    //   4615: iconst_0
    //   4616: istore #7
    //   4618: iload #7
    //   4620: iload #6
    //   4622: if_icmpge -> 4759
    //   4625: aload #5
    //   4627: iload #7
    //   4629: aaload
    //   4630: astore #8
    //   4632: aload #8
    //   4634: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4637: pop
    //   4638: aload #8
    //   4640: invokevirtual getModifiers : ()I
    //   4643: invokestatic isStatic : (I)Z
    //   4646: ifeq -> 4745
    //   4649: aload #8
    //   4651: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4654: arraylength
    //   4655: iconst_2
    //   4656: if_icmpne -> 4745
    //   4659: goto -> 4666
    //   4662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4665: athrow
    //   4666: aload #8
    //   4668: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4671: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4674: if_acmpne -> 4745
    //   4677: goto -> 4684
    //   4680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4683: athrow
    //   4684: aload #8
    //   4686: iconst_1
    //   4687: invokevirtual setAccessible : (Z)V
    //   4690: aload #8
    //   4692: aconst_null
    //   4693: iconst_2
    //   4694: anewarray java/lang/Object
    //   4697: dup
    //   4698: iconst_0
    //   4699: aload_0
    //   4700: aastore
    //   4701: dup
    //   4702: iconst_1
    //   4703: aload_1
    //   4704: ifnonnull -> 4722
    //   4707: goto -> 4714
    //   4710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4713: athrow
    //   4714: aload_1
    //   4715: goto -> 4729
    //   4718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4721: athrow
    //   4722: aload_1
    //   4723: checkcast [B
    //   4726: invokevirtual clone : ()Ljava/lang/Object;
    //   4729: aastore
    //   4730: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4733: checkcast java/lang/Boolean
    //   4736: invokevirtual booleanValue : ()Z
    //   4739: istore #4
    //   4741: iload_2
    //   4742: ifne -> 4759
    //   4745: iinc #7, 1
    //   4748: iload_2
    //   4749: ifne -> 4618
    //   4752: goto -> 4759
    //   4755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4758: athrow
    //   4759: iload #4
    //   4761: ifeq -> 4767
    //   4764: iload #4
    //   4766: ireturn
    //   4767: getstatic burp/Zkf6.ZO : Ljava/lang/String;
    //   4770: getstatic burp/Zrnt.Zh : Ljava/lang/Object;
    //   4773: checkcast java/math/BigInteger
    //   4776: invokevirtual intValue : ()I
    //   4779: bipush #32
    //   4781: irem
    //   4782: invokestatic abs : (I)I
    //   4785: invokevirtual charAt : (I)C
    //   4788: getstatic burp/Zgio.ZS : Ljava/lang/String;
    //   4791: getstatic burp/Zlxr.Zz : Ljava/lang/Object;
    //   4794: checkcast java/math/BigInteger
    //   4797: invokevirtual intValue : ()I
    //   4800: bipush #32
    //   4802: irem
    //   4803: invokestatic abs : (I)I
    //   4806: invokevirtual charAt : (I)C
    //   4809: if_icmpgt -> 5155
    //   4812: sipush #-26638
    //   4815: sipush #1802
    //   4818: invokestatic a : (II)Ljava/lang/String;
    //   4821: iconst_1
    //   4822: ldc burp/Zmnb
    //   4824: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4827: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4830: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4833: astore #5
    //   4835: aload #5
    //   4837: arraylength
    //   4838: istore #6
    //   4840: iconst_0
    //   4841: istore #7
    //   4843: iload #7
    //   4845: iload #6
    //   4847: if_icmpge -> 4985
    //   4850: aload #5
    //   4852: iload #7
    //   4854: aaload
    //   4855: astore #8
    //   4857: aload #8
    //   4859: invokevirtual getModifiers : ()I
    //   4862: invokestatic isStatic : (I)Z
    //   4865: ifne -> 4875
    //   4868: goto -> 4978
    //   4871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4874: athrow
    //   4875: aload #8
    //   4877: invokevirtual getType : ()Ljava/lang/Class;
    //   4880: astore #9
    //   4882: aload #9
    //   4884: ifnull -> 4965
    //   4887: aload #9
    //   4889: invokevirtual isPrimitive : ()Z
    //   4892: ifne -> 4965
    //   4895: goto -> 4902
    //   4898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4901: athrow
    //   4902: aload #9
    //   4904: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4907: ifnull -> 4965
    //   4910: goto -> 4917
    //   4913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4916: athrow
    //   4917: aload #9
    //   4919: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4922: invokevirtual getName : ()Ljava/lang/String;
    //   4925: ifnull -> 4965
    //   4928: goto -> 4935
    //   4931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4934: athrow
    //   4935: aload #9
    //   4937: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4940: invokevirtual getName : ()Ljava/lang/String;
    //   4943: sipush #-26641
    //   4946: sipush #15370
    //   4949: invokestatic a : (II)Ljava/lang/String;
    //   4952: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4955: ifne -> 4965
    //   4958: goto -> 4965
    //   4961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4964: athrow
    //   4965: aload #8
    //   4967: iconst_1
    //   4968: invokevirtual setAccessible : (Z)V
    //   4971: aload #8
    //   4973: aconst_null
    //   4974: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4977: pop
    //   4978: iinc #7, 1
    //   4981: iload_2
    //   4982: ifne -> 4843
    //   4985: sipush #-26642
    //   4988: sipush #22542
    //   4991: invokestatic a : (II)Ljava/lang/String;
    //   4994: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4997: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5000: astore #5
    //   5002: aload #5
    //   5004: arraylength
    //   5005: istore #6
    //   5007: iconst_0
    //   5008: istore #7
    //   5010: iload #7
    //   5012: iload #6
    //   5014: if_icmpge -> 5151
    //   5017: aload #5
    //   5019: iload #7
    //   5021: aaload
    //   5022: astore #8
    //   5024: aload #8
    //   5026: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5029: pop
    //   5030: aload #8
    //   5032: invokevirtual getModifiers : ()I
    //   5035: invokestatic isStatic : (I)Z
    //   5038: ifeq -> 5137
    //   5041: aload #8
    //   5043: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5046: arraylength
    //   5047: iconst_2
    //   5048: if_icmpne -> 5137
    //   5051: goto -> 5058
    //   5054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5057: athrow
    //   5058: aload #8
    //   5060: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5063: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5066: if_acmpne -> 5137
    //   5069: goto -> 5076
    //   5072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5075: athrow
    //   5076: aload #8
    //   5078: iconst_1
    //   5079: invokevirtual setAccessible : (Z)V
    //   5082: aload #8
    //   5084: aconst_null
    //   5085: iconst_2
    //   5086: anewarray java/lang/Object
    //   5089: dup
    //   5090: iconst_0
    //   5091: aload_0
    //   5092: aastore
    //   5093: dup
    //   5094: iconst_1
    //   5095: aload_1
    //   5096: ifnonnull -> 5114
    //   5099: goto -> 5106
    //   5102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5105: athrow
    //   5106: aload_1
    //   5107: goto -> 5121
    //   5110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5113: athrow
    //   5114: aload_1
    //   5115: checkcast [B
    //   5118: invokevirtual clone : ()Ljava/lang/Object;
    //   5121: aastore
    //   5122: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5125: checkcast java/lang/Boolean
    //   5128: invokevirtual booleanValue : ()Z
    //   5131: istore #4
    //   5133: iload_2
    //   5134: ifne -> 5151
    //   5137: iinc #7, 1
    //   5140: iload_2
    //   5141: ifne -> 5010
    //   5144: goto -> 5151
    //   5147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5150: athrow
    //   5151: iload_2
    //   5152: ifne -> 5494
    //   5155: sipush #-26633
    //   5158: sipush #-20873
    //   5161: invokestatic a : (II)Ljava/lang/String;
    //   5164: iconst_1
    //   5165: ldc burp/Ztdx
    //   5167: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5170: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5173: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5176: astore #5
    //   5178: aload #5
    //   5180: arraylength
    //   5181: istore #6
    //   5183: iconst_0
    //   5184: istore #7
    //   5186: iload #7
    //   5188: iload #6
    //   5190: if_icmpge -> 5328
    //   5193: aload #5
    //   5195: iload #7
    //   5197: aaload
    //   5198: astore #8
    //   5200: aload #8
    //   5202: invokevirtual getModifiers : ()I
    //   5205: invokestatic isStatic : (I)Z
    //   5208: ifne -> 5218
    //   5211: goto -> 5321
    //   5214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5217: athrow
    //   5218: aload #8
    //   5220: invokevirtual getType : ()Ljava/lang/Class;
    //   5223: astore #9
    //   5225: aload #9
    //   5227: ifnull -> 5308
    //   5230: aload #9
    //   5232: invokevirtual isPrimitive : ()Z
    //   5235: ifne -> 5308
    //   5238: goto -> 5245
    //   5241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5244: athrow
    //   5245: aload #9
    //   5247: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5250: ifnull -> 5308
    //   5253: goto -> 5260
    //   5256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5259: athrow
    //   5260: aload #9
    //   5262: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5265: invokevirtual getName : ()Ljava/lang/String;
    //   5268: ifnull -> 5308
    //   5271: goto -> 5278
    //   5274: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5277: athrow
    //   5278: aload #9
    //   5280: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5283: invokevirtual getName : ()Ljava/lang/String;
    //   5286: sipush #-26641
    //   5289: sipush #15370
    //   5292: invokestatic a : (II)Ljava/lang/String;
    //   5295: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5298: ifne -> 5308
    //   5301: goto -> 5308
    //   5304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5307: athrow
    //   5308: aload #8
    //   5310: iconst_1
    //   5311: invokevirtual setAccessible : (Z)V
    //   5314: aload #8
    //   5316: aconst_null
    //   5317: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5320: pop
    //   5321: iinc #7, 1
    //   5324: iload_2
    //   5325: ifne -> 5186
    //   5328: sipush #-26633
    //   5331: sipush #-20873
    //   5334: invokestatic a : (II)Ljava/lang/String;
    //   5337: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5340: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5343: astore #5
    //   5345: aload #5
    //   5347: arraylength
    //   5348: istore #6
    //   5350: iconst_0
    //   5351: istore #7
    //   5353: iload #7
    //   5355: iload #6
    //   5357: if_icmpge -> 5494
    //   5360: aload #5
    //   5362: iload #7
    //   5364: aaload
    //   5365: astore #8
    //   5367: aload #8
    //   5369: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5372: pop
    //   5373: aload #8
    //   5375: invokevirtual getModifiers : ()I
    //   5378: invokestatic isStatic : (I)Z
    //   5381: ifeq -> 5480
    //   5384: aload #8
    //   5386: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5389: arraylength
    //   5390: iconst_2
    //   5391: if_icmpne -> 5480
    //   5394: goto -> 5401
    //   5397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5400: athrow
    //   5401: aload #8
    //   5403: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5406: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5409: if_acmpne -> 5480
    //   5412: goto -> 5419
    //   5415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5418: athrow
    //   5419: aload #8
    //   5421: iconst_1
    //   5422: invokevirtual setAccessible : (Z)V
    //   5425: aload #8
    //   5427: aconst_null
    //   5428: iconst_2
    //   5429: anewarray java/lang/Object
    //   5432: dup
    //   5433: iconst_0
    //   5434: aload_0
    //   5435: aastore
    //   5436: dup
    //   5437: iconst_1
    //   5438: aload_1
    //   5439: ifnonnull -> 5457
    //   5442: goto -> 5449
    //   5445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5448: athrow
    //   5449: aload_1
    //   5450: goto -> 5464
    //   5453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5456: athrow
    //   5457: aload_1
    //   5458: checkcast [B
    //   5461: invokevirtual clone : ()Ljava/lang/Object;
    //   5464: aastore
    //   5465: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5468: checkcast java/lang/Boolean
    //   5471: invokevirtual booleanValue : ()Z
    //   5474: istore #4
    //   5476: iload_2
    //   5477: ifne -> 5494
    //   5480: iinc #7, 1
    //   5483: iload_2
    //   5484: ifne -> 5353
    //   5487: goto -> 5494
    //   5490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5493: athrow
    //   5494: iload #4
    //   5496: ireturn
    //   5497: astore_3
    //   5498: new java/lang/Exception
    //   5501: dup
    //   5502: aload_3
    //   5503: invokevirtual getMessage : ()Ljava/lang/String;
    //   5506: invokespecial <init> : (Ljava/lang/String;)V
    //   5509: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3297	5497	java/lang/Throwable
    //   33	47	50	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   54	75	78	java/lang/Throwable
    //   68	89	92	java/lang/Throwable
    //   82	103	106	java/lang/Throwable
    //   96	117	120	java/lang/Throwable
    //   110	131	134	java/lang/Throwable
    //   124	145	148	java/lang/Throwable
    //   138	155	158	java/lang/Throwable
    //   194	208	211	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   215	236	239	java/lang/Throwable
    //   229	250	253	java/lang/Throwable
    //   243	264	267	java/lang/Throwable
    //   257	278	281	java/lang/Throwable
    //   271	292	295	java/lang/Throwable
    //   285	306	309	java/lang/Throwable
    //   299	323	326	java/lang/Throwable
    //   387	405	408	java/lang/Throwable
    //   396	421	424	java/lang/Throwable
    //   412	438	441	java/lang/Throwable
    //   428	454	457	java/lang/Throwable
    //   445	471	474	java/lang/Throwable
    //   461	487	490	java/lang/Throwable
    //   478	503	506	java/lang/Throwable
    //   494	526	529	java/lang/Throwable
    //   510	542	545	java/lang/Throwable
    //   533	558	561	java/lang/Throwable
    //   549	581	584	java/lang/Throwable
    //   565	597	600	java/lang/Throwable
    //   588	613	616	java/lang/Throwable
    //   604	632	635	java/lang/Throwable
    //   762	797	800	java/lang/Throwable
    //   804	845	848	java/lang/Throwable
    //   889	1062	1065	java/lang/Throwable
    //   1032	1099	1102	java/lang/Throwable
    //   1069	1136	1139	java/lang/Throwable
    //   1106	1173	1176	java/lang/Throwable
    //   1143	1210	1213	java/lang/Throwable
    //   1180	1247	1250	java/lang/Throwable
    //   1217	1284	1287	java/lang/Throwable
    //   1254	1321	1324	java/lang/Throwable
    //   1291	1358	1361	java/lang/Throwable
    //   1328	1395	1398	java/lang/Throwable
    //   1365	1432	1435	java/lang/Throwable
    //   1402	1469	1472	java/lang/Throwable
    //   1439	1506	1509	java/lang/Throwable
    //   1476	1543	1546	java/lang/Throwable
    //   1513	1580	1583	java/lang/Throwable
    //   1550	1617	1620	java/lang/Throwable
    //   1587	1654	1657	java/lang/Throwable
    //   1624	1691	1694	java/lang/Throwable
    //   1661	1728	1731	java/lang/Throwable
    //   1698	1765	1768	java/lang/Throwable
    //   1735	1802	1805	java/lang/Throwable
    //   1772	1839	1842	java/lang/Throwable
    //   1809	1876	1879	java/lang/Throwable
    //   1846	1913	1916	java/lang/Throwable
    //   1883	1950	1953	java/lang/Throwable
    //   1920	1987	1990	java/lang/Throwable
    //   1957	2024	2027	java/lang/Throwable
    //   1994	2061	2064	java/lang/Throwable
    //   2031	2098	2101	java/lang/Throwable
    //   2068	2135	2138	java/lang/Throwable
    //   2105	2172	2175	java/lang/Throwable
    //   2142	2205	2208	java/lang/Throwable
    //   2271	2285	2285	java/lang/Throwable
    //   2296	2309	2312	java/lang/Throwable
    //   2301	2324	2327	java/lang/Throwable
    //   2316	2342	2345	java/lang/Throwable
    //   2331	2372	2375	java/lang/Throwable
    //   2438	2465	2468	java/lang/Throwable
    //   2455	2486	2489	java/lang/Throwable
    //   2472	2516	2519	java/lang/Throwable
    //   2493	2527	2527	java/lang/Throwable
    //   2538	2554	2557	java/lang/Throwable
    //   2654	2668	2668	java/lang/Throwable
    //   2679	2692	2695	java/lang/Throwable
    //   2684	2707	2710	java/lang/Throwable
    //   2699	2725	2728	java/lang/Throwable
    //   2714	2755	2758	java/lang/Throwable
    //   2821	2848	2851	java/lang/Throwable
    //   2838	2866	2869	java/lang/Throwable
    //   2855	2896	2899	java/lang/Throwable
    //   2873	2907	2907	java/lang/Throwable
    //   2930	2941	2944	java/lang/Throwable
    //   2996	3010	3010	java/lang/Throwable
    //   3021	3034	3037	java/lang/Throwable
    //   3026	3049	3052	java/lang/Throwable
    //   3041	3067	3070	java/lang/Throwable
    //   3056	3097	3100	java/lang/Throwable
    //   3163	3190	3193	java/lang/Throwable
    //   3180	3208	3211	java/lang/Throwable
    //   3197	3238	3241	java/lang/Throwable
    //   3215	3249	3249	java/lang/Throwable
    //   3272	3283	3286	java/lang/Throwable
    //   3298	4032	5497	java/lang/Throwable
    //   3388	3402	3402	java/lang/Throwable
    //   3413	3426	3429	java/lang/Throwable
    //   3418	3441	3444	java/lang/Throwable
    //   3433	3459	3462	java/lang/Throwable
    //   3448	3489	3492	java/lang/Throwable
    //   3555	3582	3585	java/lang/Throwable
    //   3572	3600	3603	java/lang/Throwable
    //   3589	3630	3633	java/lang/Throwable
    //   3607	3641	3641	java/lang/Throwable
    //   3664	3675	3678	java/lang/Throwable
    //   3731	3745	3745	java/lang/Throwable
    //   3756	3769	3772	java/lang/Throwable
    //   3761	3784	3787	java/lang/Throwable
    //   3776	3802	3805	java/lang/Throwable
    //   3791	3832	3835	java/lang/Throwable
    //   3898	3925	3928	java/lang/Throwable
    //   3915	3943	3946	java/lang/Throwable
    //   3932	3973	3976	java/lang/Throwable
    //   3950	3984	3984	java/lang/Throwable
    //   4007	4018	4021	java/lang/Throwable
    //   4033	4766	5497	java/lang/Throwable
    //   4123	4137	4137	java/lang/Throwable
    //   4148	4161	4164	java/lang/Throwable
    //   4153	4176	4179	java/lang/Throwable
    //   4168	4194	4197	java/lang/Throwable
    //   4183	4224	4227	java/lang/Throwable
    //   4290	4317	4320	java/lang/Throwable
    //   4307	4335	4338	java/lang/Throwable
    //   4324	4365	4368	java/lang/Throwable
    //   4342	4376	4376	java/lang/Throwable
    //   4399	4410	4413	java/lang/Throwable
    //   4465	4479	4479	java/lang/Throwable
    //   4490	4503	4506	java/lang/Throwable
    //   4495	4518	4521	java/lang/Throwable
    //   4510	4536	4539	java/lang/Throwable
    //   4525	4566	4569	java/lang/Throwable
    //   4632	4659	4662	java/lang/Throwable
    //   4649	4677	4680	java/lang/Throwable
    //   4666	4707	4710	java/lang/Throwable
    //   4684	4718	4718	java/lang/Throwable
    //   4741	4752	4755	java/lang/Throwable
    //   4767	5496	5497	java/lang/Throwable
    //   4857	4871	4871	java/lang/Throwable
    //   4882	4895	4898	java/lang/Throwable
    //   4887	4910	4913	java/lang/Throwable
    //   4902	4928	4931	java/lang/Throwable
    //   4917	4958	4961	java/lang/Throwable
    //   5024	5051	5054	java/lang/Throwable
    //   5041	5069	5072	java/lang/Throwable
    //   5058	5099	5102	java/lang/Throwable
    //   5076	5110	5110	java/lang/Throwable
    //   5133	5144	5147	java/lang/Throwable
    //   5200	5214	5214	java/lang/Throwable
    //   5225	5238	5241	java/lang/Throwable
    //   5230	5253	5256	java/lang/Throwable
    //   5245	5271	5274	java/lang/Throwable
    //   5260	5301	5304	java/lang/Throwable
    //   5367	5394	5397	java/lang/Throwable
    //   5384	5412	5415	java/lang/Throwable
    //   5401	5442	5445	java/lang/Throwable
    //   5419	5453	5453	java/lang/Throwable
    //   5476	5487	5490	java/lang/Throwable
  }
  
  static void ZZ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ý<ä¥\\tðåâÞü«³\\tìah®ú!\\tÖrSHPi\\t\\bøý·=ð"4\\to^EI®½ÿ\\t\\bï©3ÁZk\\tXË÷Ñ|<ªãm\\t!ªØý¹¨é\\nÁé\\tdpzI«[î\\tó^cÒjj*\\tqÒ\\nØG+ÖìMØßûùmøÒYv³Ë'f]\\bì°¿`$v*Û¯àéºDê*­Çou5û.}jÚTyÄ¥­\\f:ãßØ¯ãÔw(%µz¯ö ²}û°©$ÎkÊæém)Y'Ø_|Ë\\be±¯ù\\tð¾¶UÐr Ï¯a\\t±Äj$v4JîÎeXñØL 80Ä÷\\tsÙÐ=3\\tÔOfAN.ù¢í\\tFY4v©òÌ\\tâÖ rHü]Ê\\t+\\n±GÓ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
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
    //   68: ldc '<Û­\ÍÒû Ó¶ø '
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #53
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
    //   129: putstatic burp/Zbow.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbow.b : [Ljava/lang/String;
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
    //   212: bipush #59
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #42
    //   224: goto -> 244
    //   227: bipush #77
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #92
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
    //   300: sipush #-26648
    //   303: sipush #-19873
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zbow.Zr : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #99
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #46
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #50
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #76
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #85
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-32
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-115
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #9
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-18
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #108
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #45
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-67
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #108
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #118
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #91
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #83
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #21
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-58
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #43
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-75
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #30
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #14
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #125
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #114
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-59
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #102
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-94
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #94
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #12
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #91
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #101
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: iconst_5
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zbow.ZS : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF97E6) & 0xFFFF;
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
      byte b1 = 52;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbow.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */