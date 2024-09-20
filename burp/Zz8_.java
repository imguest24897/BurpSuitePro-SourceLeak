package burp;

import java.awt.Color;

public class Zz8_ {
  public final String ZY;
  
  public final Zrch ZX;
  
  public final Zr4_ Zr;
  
  public static final Zz8_[] ZT;
  
  public static final Zz8_[] ZW;
  
  public static final Zz8_[] ZH;
  
  private static final Color[] Z_;
  
  private Zz8_(String paramString, Zrch paramZrch, Zr4_ paramZr4_) {
    this.ZY = paramString;
    this.ZX = paramZrch;
    this.Zr = paramZr4_;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'l\\n>Fi$Sfl\\n>Fc/i$Sfc$z\\rf$E1Lvo0S#_~"\\tj#{N\\b{6_>c$z\\tj#{N\\bd#W<c/i9W"Rd#W<~"'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_4
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #34
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc '5Rxp'Wwl'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: iconst_5
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #108
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 80
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #9
    //   198: goto -> 228
    //   201: bipush #82
    //   203: goto -> 228
    //   206: bipush #117
    //   208: goto -> 228
    //   211: bipush #20
    //   213: goto -> 228
    //   216: bipush #114
    //   218: goto -> 228
    //   221: bipush #9
    //   223: goto -> 228
    //   226: bipush #49
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 39, 0 -> 97
    //   284: bipush #10
    //   286: anewarray java/awt/Color
    //   289: dup
    //   290: iconst_0
    //   291: getstatic java/awt/Color.RED : Ljava/awt/Color;
    //   294: aastore
    //   295: dup
    //   296: iconst_1
    //   297: getstatic burp/Zlb0.ZM : Ljava/awt/Color;
    //   300: aastore
    //   301: dup
    //   302: iconst_2
    //   303: getstatic burp/Zlb0.ZE : Ljava/awt/Color;
    //   306: aastore
    //   307: dup
    //   308: iconst_3
    //   309: getstatic burp/Zlb0.ZJ : Ljava/awt/Color;
    //   312: aastore
    //   313: dup
    //   314: iconst_4
    //   315: getstatic java/awt/Color.BLUE : Ljava/awt/Color;
    //   318: aastore
    //   319: dup
    //   320: iconst_5
    //   321: getstatic burp/Zlb0.ZP : Ljava/awt/Color;
    //   324: aastore
    //   325: dup
    //   326: bipush #6
    //   328: getstatic java/awt/Color.MAGENTA : Ljava/awt/Color;
    //   331: aastore
    //   332: dup
    //   333: bipush #7
    //   335: getstatic burp/Zlb0.Zs : Ljava/awt/Color;
    //   338: aastore
    //   339: dup
    //   340: bipush #8
    //   342: getstatic java/awt/Color.LIGHT_GRAY : Ljava/awt/Color;
    //   345: aastore
    //   346: dup
    //   347: bipush #9
    //   349: getstatic java/awt/Color.GRAY : Ljava/awt/Color;
    //   352: aastore
    //   353: putstatic burp/Zz8_.Z_ : [Ljava/awt/Color;
    //   356: new java/util/ArrayList
    //   359: dup
    //   360: invokespecial <init> : ()V
    //   363: astore #7
    //   365: getstatic burp/Zz8_.Z_ : [Ljava/awt/Color;
    //   368: astore #8
    //   370: aload #8
    //   372: arraylength
    //   373: istore #9
    //   375: iconst_0
    //   376: istore #10
    //   378: iload #10
    //   380: iload #9
    //   382: if_icmpge -> 418
    //   385: aload #8
    //   387: iload #10
    //   389: aaload
    //   390: astore #11
    //   392: aload #7
    //   394: new burp/Zr4_
    //   397: dup
    //   398: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   401: aload #11
    //   403: invokespecial <init> : (Ljava/awt/Color;Ljava/awt/Color;)V
    //   406: invokeinterface add : (Ljava/lang/Object;)Z
    //   411: pop
    //   412: iinc #10, 1
    //   415: goto -> 378
    //   418: aload #7
    //   420: invokeinterface iterator : ()Ljava/util/Iterator;
    //   425: astore #8
    //   427: new java/util/ArrayList
    //   430: dup
    //   431: invokespecial <init> : ()V
    //   434: astore #7
    //   436: getstatic burp/Zz8_.Z_ : [Ljava/awt/Color;
    //   439: astore #9
    //   441: aload #9
    //   443: arraylength
    //   444: istore #10
    //   446: iconst_0
    //   447: istore #11
    //   449: iload #11
    //   451: iload #10
    //   453: if_icmpge -> 492
    //   456: aload #9
    //   458: iload #11
    //   460: aaload
    //   461: astore #12
    //   463: aload #7
    //   465: new burp/Zr4_
    //   468: dup
    //   469: aload #12
    //   471: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   474: invokevirtual ZS : ()Ljava/awt/Color;
    //   477: invokespecial <init> : (Ljava/awt/Color;Ljava/awt/Color;)V
    //   480: invokeinterface add : (Ljava/lang/Object;)Z
    //   485: pop
    //   486: iinc #11, 1
    //   489: goto -> 449
    //   492: aload #7
    //   494: invokeinterface iterator : ()Ljava/util/Iterator;
    //   499: astore #9
    //   501: new java/util/ArrayList
    //   504: dup
    //   505: invokespecial <init> : ()V
    //   508: astore #10
    //   510: aload #10
    //   512: new burp/Zz8_
    //   515: dup
    //   516: aload_0
    //   517: bipush #9
    //   519: aaload
    //   520: aconst_null
    //   521: getstatic burp/Zr4_.ZZ : Lburp/Zr4_;
    //   524: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   527: invokeinterface add : (Ljava/lang/Object;)Z
    //   532: pop
    //   533: aload #10
    //   535: new burp/Zz8_
    //   538: dup
    //   539: aload_0
    //   540: bipush #7
    //   542: aaload
    //   543: new burp/Zmku
    //   546: dup
    //   547: invokespecial <init> : ()V
    //   550: aload #8
    //   552: invokeinterface next : ()Ljava/lang/Object;
    //   557: checkcast burp/Zr4_
    //   560: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   563: invokeinterface add : (Ljava/lang/Object;)Z
    //   568: pop
    //   569: aload #10
    //   571: new burp/Zz8_
    //   574: dup
    //   575: aload_0
    //   576: bipush #10
    //   578: aaload
    //   579: new burp/Zsye
    //   582: dup
    //   583: invokespecial <init> : ()V
    //   586: aload #8
    //   588: invokeinterface next : ()Ljava/lang/Object;
    //   593: checkcast burp/Zr4_
    //   596: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   599: invokeinterface add : (Ljava/lang/Object;)Z
    //   604: pop
    //   605: aload #10
    //   607: new burp/Zz8_
    //   610: dup
    //   611: aload_0
    //   612: iconst_4
    //   613: aaload
    //   614: new burp/Zrmx
    //   617: dup
    //   618: new burp/Zs8d
    //   621: dup
    //   622: invokespecial <init> : ()V
    //   625: invokespecial <init> : (Lburp/Zs8d;)V
    //   628: aload #8
    //   630: invokeinterface next : ()Ljava/lang/Object;
    //   635: checkcast burp/Zr4_
    //   638: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   641: invokeinterface add : (Ljava/lang/Object;)Z
    //   646: pop
    //   647: aload #10
    //   649: new burp/Zz8_
    //   652: dup
    //   653: aload_0
    //   654: bipush #11
    //   656: aaload
    //   657: new burp/Zkdt
    //   660: dup
    //   661: invokespecial <init> : ()V
    //   664: aload #8
    //   666: invokeinterface next : ()Ljava/lang/Object;
    //   671: checkcast burp/Zr4_
    //   674: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   677: invokeinterface add : (Ljava/lang/Object;)Z
    //   682: pop
    //   683: aload #10
    //   685: new burp/Zz8_
    //   688: dup
    //   689: aload_0
    //   690: iconst_3
    //   691: aaload
    //   692: new burp/Zt73
    //   695: dup
    //   696: bipush #16
    //   698: invokespecial <init> : (I)V
    //   701: aload #8
    //   703: invokeinterface next : ()Ljava/lang/Object;
    //   708: checkcast burp/Zr4_
    //   711: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   714: invokeinterface add : (Ljava/lang/Object;)Z
    //   719: pop
    //   720: aload #10
    //   722: new burp/Zz8_
    //   725: dup
    //   726: aload_0
    //   727: bipush #15
    //   729: aaload
    //   730: new burp/Zt73
    //   733: dup
    //   734: bipush #8
    //   736: invokespecial <init> : (I)V
    //   739: aload #8
    //   741: invokeinterface next : ()Ljava/lang/Object;
    //   746: checkcast burp/Zr4_
    //   749: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   752: invokeinterface add : (Ljava/lang/Object;)Z
    //   757: pop
    //   758: aload #10
    //   760: new burp/Zz8_
    //   763: dup
    //   764: aload_0
    //   765: bipush #18
    //   767: aaload
    //   768: new burp/Zt73
    //   771: dup
    //   772: iconst_2
    //   773: invokespecial <init> : (I)V
    //   776: aload #8
    //   778: invokeinterface next : ()Ljava/lang/Object;
    //   783: checkcast burp/Zr4_
    //   786: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   789: invokeinterface add : (Ljava/lang/Object;)Z
    //   794: pop
    //   795: aload #10
    //   797: new burp/Zz8_
    //   800: dup
    //   801: aload_0
    //   802: iconst_0
    //   803: aaload
    //   804: new burp/Zm5w
    //   807: dup
    //   808: invokespecial <init> : ()V
    //   811: aload #8
    //   813: invokeinterface next : ()Ljava/lang/Object;
    //   818: checkcast burp/Zr4_
    //   821: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   824: invokeinterface add : (Ljava/lang/Object;)Z
    //   829: pop
    //   830: aload #10
    //   832: invokeinterface size : ()I
    //   837: anewarray burp/Zz8_
    //   840: putstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   843: aload #10
    //   845: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   848: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   853: pop
    //   854: new java/util/ArrayList
    //   857: dup
    //   858: invokespecial <init> : ()V
    //   861: astore #11
    //   863: aload #11
    //   865: new burp/Zz8_
    //   868: dup
    //   869: aload_0
    //   870: bipush #17
    //   872: aaload
    //   873: aconst_null
    //   874: getstatic burp/Zr4_.ZZ : Lburp/Zr4_;
    //   877: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   880: invokeinterface add : (Ljava/lang/Object;)Z
    //   885: pop
    //   886: aload #11
    //   888: new burp/Zz8_
    //   891: dup
    //   892: aload_0
    //   893: bipush #16
    //   895: aaload
    //   896: new burp/Zgn
    //   899: dup
    //   900: invokespecial <init> : ()V
    //   903: aload #9
    //   905: invokeinterface next : ()Ljava/lang/Object;
    //   910: checkcast burp/Zr4_
    //   913: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   916: invokeinterface add : (Ljava/lang/Object;)Z
    //   921: pop
    //   922: aload #11
    //   924: new burp/Zz8_
    //   927: dup
    //   928: aload_0
    //   929: iconst_5
    //   930: aaload
    //   931: new burp/Zgx
    //   934: dup
    //   935: invokespecial <init> : ()V
    //   938: aload #9
    //   940: invokeinterface next : ()Ljava/lang/Object;
    //   945: checkcast burp/Zr4_
    //   948: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   951: invokeinterface add : (Ljava/lang/Object;)Z
    //   956: pop
    //   957: aload #11
    //   959: new burp/Zz8_
    //   962: dup
    //   963: aload_0
    //   964: iconst_1
    //   965: aaload
    //   966: new burp/Zgl
    //   969: dup
    //   970: invokespecial <init> : ()V
    //   973: aload #9
    //   975: invokeinterface next : ()Ljava/lang/Object;
    //   980: checkcast burp/Zr4_
    //   983: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   986: invokeinterface add : (Ljava/lang/Object;)Z
    //   991: pop
    //   992: aload #11
    //   994: new burp/Zz8_
    //   997: dup
    //   998: aload_0
    //   999: bipush #8
    //   1001: aaload
    //   1002: new burp/Zgz
    //   1005: dup
    //   1006: invokespecial <init> : ()V
    //   1009: aload #9
    //   1011: invokeinterface next : ()Ljava/lang/Object;
    //   1016: checkcast burp/Zr4_
    //   1019: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   1022: invokeinterface add : (Ljava/lang/Object;)Z
    //   1027: pop
    //   1028: aload #11
    //   1030: new burp/Zz8_
    //   1033: dup
    //   1034: aload_0
    //   1035: bipush #13
    //   1037: aaload
    //   1038: new burp/Zgw
    //   1041: dup
    //   1042: bipush #16
    //   1044: invokespecial <init> : (I)V
    //   1047: aload #9
    //   1049: invokeinterface next : ()Ljava/lang/Object;
    //   1054: checkcast burp/Zr4_
    //   1057: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   1060: invokeinterface add : (Ljava/lang/Object;)Z
    //   1065: pop
    //   1066: aload #11
    //   1068: new burp/Zz8_
    //   1071: dup
    //   1072: aload_0
    //   1073: bipush #12
    //   1075: aaload
    //   1076: new burp/Zgw
    //   1079: dup
    //   1080: bipush #8
    //   1082: invokespecial <init> : (I)V
    //   1085: aload #9
    //   1087: invokeinterface next : ()Ljava/lang/Object;
    //   1092: checkcast burp/Zr4_
    //   1095: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   1098: invokeinterface add : (Ljava/lang/Object;)Z
    //   1103: pop
    //   1104: aload #11
    //   1106: new burp/Zz8_
    //   1109: dup
    //   1110: aload_0
    //   1111: bipush #14
    //   1113: aaload
    //   1114: new burp/Zgw
    //   1117: dup
    //   1118: iconst_2
    //   1119: invokespecial <init> : (I)V
    //   1122: aload #9
    //   1124: invokeinterface next : ()Ljava/lang/Object;
    //   1129: checkcast burp/Zr4_
    //   1132: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   1135: invokeinterface add : (Ljava/lang/Object;)Z
    //   1140: pop
    //   1141: aload #11
    //   1143: new burp/Zz8_
    //   1146: dup
    //   1147: aload_0
    //   1148: iconst_2
    //   1149: aaload
    //   1150: new burp/Zg6
    //   1153: dup
    //   1154: invokespecial <init> : ()V
    //   1157: aload #9
    //   1159: invokeinterface next : ()Ljava/lang/Object;
    //   1164: checkcast burp/Zr4_
    //   1167: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   1170: invokeinterface add : (Ljava/lang/Object;)Z
    //   1175: pop
    //   1176: aload #11
    //   1178: invokeinterface size : ()I
    //   1183: anewarray burp/Zz8_
    //   1186: putstatic burp/Zz8_.ZW : [Lburp/Zz8_;
    //   1189: aload #11
    //   1191: getstatic burp/Zz8_.ZW : [Lburp/Zz8_;
    //   1194: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1199: pop
    //   1200: new java/util/ArrayList
    //   1203: dup
    //   1204: aload_0
    //   1205: bipush #6
    //   1207: aaload
    //   1208: invokestatic getAlgorithms : (Ljava/lang/String;)Ljava/util/Set;
    //   1211: invokespecial <init> : (Ljava/util/Collection;)V
    //   1214: astore #12
    //   1216: aload #12
    //   1218: new burp/Zta
    //   1221: dup
    //   1222: invokespecial <init> : ()V
    //   1225: invokeinterface sort : (Ljava/util/Comparator;)V
    //   1230: new java/util/ArrayList
    //   1233: dup
    //   1234: invokespecial <init> : ()V
    //   1237: astore #13
    //   1239: iconst_0
    //   1240: istore #14
    //   1242: iload #14
    //   1244: aload #12
    //   1246: invokeinterface size : ()I
    //   1251: if_icmpge -> 1375
    //   1254: aload #12
    //   1256: iload #14
    //   1258: invokeinterface get : (I)Ljava/lang/Object;
    //   1263: checkcast java/lang/String
    //   1266: astore #15
    //   1268: aload #15
    //   1270: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   1273: astore #16
    //   1275: bipush #64
    //   1277: iload #14
    //   1279: sipush #128
    //   1282: aload #12
    //   1284: invokeinterface size : ()I
    //   1289: idiv
    //   1290: imul
    //   1291: iadd
    //   1292: istore #17
    //   1294: new burp/Zr4_
    //   1297: dup
    //   1298: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   1301: new java/awt/Color
    //   1304: dup
    //   1305: iload #17
    //   1307: ldc 65536
    //   1309: imul
    //   1310: iload #17
    //   1312: sipush #256
    //   1315: imul
    //   1316: iadd
    //   1317: iload #17
    //   1319: iadd
    //   1320: invokespecial <init> : (I)V
    //   1323: invokespecial <init> : (Ljava/awt/Color;Ljava/awt/Color;)V
    //   1326: astore #18
    //   1328: aload #13
    //   1330: new burp/Zz8_
    //   1333: dup
    //   1334: aload #15
    //   1336: new burp/Zll6
    //   1339: dup
    //   1340: aload #16
    //   1342: invokespecial <init> : (Ljava/security/MessageDigest;)V
    //   1345: aload #18
    //   1347: invokespecial <init> : (Ljava/lang/String;Lburp/Zrch;Lburp/Zr4_;)V
    //   1350: invokeinterface add : (Ljava/lang/Object;)Z
    //   1355: pop
    //   1356: goto -> 1369
    //   1359: astore #15
    //   1361: aload #15
    //   1363: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   1366: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1369: iinc #14, 1
    //   1372: goto -> 1242
    //   1375: aload #13
    //   1377: invokeinterface size : ()I
    //   1382: anewarray burp/Zz8_
    //   1385: putstatic burp/Zz8_.ZH : [Lburp/Zz8_;
    //   1388: aload #13
    //   1390: getstatic burp/Zz8_.ZH : [Lburp/Zz8_;
    //   1393: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1398: pop
    //   1399: return
    // Exception table:
    //   from	to	target	type
    //   1254	1356	1359	java/security/NoSuchAlgorithmException
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */