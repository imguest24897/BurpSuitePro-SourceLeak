package burp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Zt3j {
  private Zx_j Zf;
  
  private Zlc8 ZF;
  
  private byte[][] Zx;
  
  private int Zm;
  
  private int ZK;
  
  private int ZH;
  
  private int ZP;
  
  private double[] Zz;
  
  private boolean[][] ZC;
  
  private short[] ZN;
  
  int[] Zj;
  
  Map<Integer, Double> Zo = new HashMap<>();
  
  private short[][] ZV;
  
  short[][] Zr;
  
  private double[] Zq;
  
  private double Zb;
  
  private double[] Zw;
  
  private double[] ZZ;
  
  private double[] Zp;
  
  private double[] Zy;
  
  private List<Zrmm> ZB;
  
  private int ZT;
  
  private List<Zrmm> Z_;
  
  private int Zs;
  
  private byte[] ZW;
  
  private int Zh;
  
  private byte[][] Zt;
  
  private double[] Za;
  
  private double[] Zg;
  
  private double[] Zk;
  
  private double[] ZO;
  
  private List<Zrmm> ZL;
  
  private List<Zrmm> Zv;
  
  private List<Zrmm> ZY;
  
  private List<Zrmm> ZR;
  
  private int Zl;
  
  private int Zu;
  
  private int ZJ;
  
  private int Zi;
  
  private boolean[] ZU;
  
  private boolean[] ZX;
  
  private boolean[] ZI;
  
  private boolean[] ZM;
  
  private double[] ZE;
  
  private double[] Ze;
  
  private List<Zrmm> ZHu;
  
  private List<Zrmm> Zc;
  
  private List<Zrmm> ZA;
  
  private int Zd;
  
  private int ZHR;
  
  private int ZS;
  
  private double[] ZD;
  
  private double[] Zn;
  
  private double[] ZQ;
  
  private Zgt3 ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zt3j(byte[][] paramArrayOfbyte, Zx_j paramZx_j, Zlc8 paramZlc8) {
    this.Zx = new byte[paramArrayOfbyte.length][];
    int i = Zl4x.ZD();
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      this.Zx[b] = paramArrayOfbyte[b];
      b++;
      if (i == 0)
        break; 
    } 
    this.Zf = paramZx_j;
    this.ZF = paramZlc8;
  }
  
  void Zk() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield Zx : [[B
    //   5: arraylength
    //   6: putfield Zm : I
    //   9: invokestatic Zt : ()I
    //   12: iconst_0
    //   13: istore_2
    //   14: istore_1
    //   15: aload_0
    //   16: getfield ZF : Lburp/Zlc8;
    //   19: iinc #2, 8
    //   22: iload_2
    //   23: i2f
    //   24: sipush #-31475
    //   27: sipush #20226
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: invokeinterface Zq : (FLjava/lang/String;)Z
    //   38: ifne -> 46
    //   41: return
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: getfield Zf : Lburp/Zx_j;
    //   50: getfield ZH : Z
    //   53: aload_0
    //   54: getfield Zf : Lburp/Zx_j;
    //   57: getfield Zy : Z
    //   60: ior
    //   61: aload_0
    //   62: getfield Zf : Lburp/Zx_j;
    //   65: getfield Zh : Z
    //   68: ior
    //   69: aload_0
    //   70: getfield Zf : Lburp/Zx_j;
    //   73: getfield ZM : Z
    //   76: ior
    //   77: aload_0
    //   78: getfield Zf : Lburp/Zx_j;
    //   81: getfield ZA : Z
    //   84: ior
    //   85: aload_0
    //   86: getfield Zf : Lburp/Zx_j;
    //   89: getfield Za : Z
    //   92: ior
    //   93: aload_0
    //   94: getfield Zf : Lburp/Zx_j;
    //   97: getfield Zx : Z
    //   100: ior
    //   101: istore_3
    //   102: aload_0
    //   103: getfield Zf : Lburp/Zx_j;
    //   106: getfield Zr : Z
    //   109: ifeq -> 161
    //   112: iconst_0
    //   113: istore #4
    //   115: iload #4
    //   117: aload_0
    //   118: getfield Zm : I
    //   121: if_icmpge -> 161
    //   124: aload_0
    //   125: getfield Zx : [[B
    //   128: iload #4
    //   130: aload_0
    //   131: getfield Zx : [[B
    //   134: iload #4
    //   136: aaload
    //   137: invokestatic Zt : ([B)[B
    //   140: aastore
    //   141: goto -> 154
    //   144: astore #5
    //   146: aload #5
    //   148: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   151: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   154: iinc #4, 1
    //   157: iload_1
    //   158: ifeq -> 115
    //   161: aload_0
    //   162: ldc 2147483647
    //   164: putfield ZK : I
    //   167: aload_0
    //   168: iconst_0
    //   169: putfield ZH : I
    //   172: iconst_0
    //   173: istore #4
    //   175: iload #4
    //   177: aload_0
    //   178: getfield Zm : I
    //   181: if_icmpge -> 245
    //   184: aload_0
    //   185: getfield Zx : [[B
    //   188: iload #4
    //   190: aaload
    //   191: arraylength
    //   192: istore #5
    //   194: iload #5
    //   196: aload_0
    //   197: getfield ZK : I
    //   200: if_icmpge -> 216
    //   203: aload_0
    //   204: iload #5
    //   206: putfield ZK : I
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: iload #5
    //   218: aload_0
    //   219: getfield ZH : I
    //   222: if_icmple -> 238
    //   225: aload_0
    //   226: iload #5
    //   228: putfield ZH : I
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: iinc #4, 1
    //   241: iload_1
    //   242: ifeq -> 175
    //   245: iconst_0
    //   246: istore #4
    //   248: iload #4
    //   250: aload_0
    //   251: getfield Zm : I
    //   254: if_icmpge -> 430
    //   257: aload_0
    //   258: getfield Zx : [[B
    //   261: iload #4
    //   263: aaload
    //   264: arraylength
    //   265: istore #5
    //   267: iload #5
    //   269: aload_0
    //   270: getfield ZH : I
    //   273: if_icmpne -> 283
    //   276: goto -> 423
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: aload_0
    //   284: getfield ZH : I
    //   287: newarray byte
    //   289: astore #6
    //   291: aload_0
    //   292: getfield Zf : Lburp/Zx_j;
    //   295: getfield Zm : Z
    //   298: ifeq -> 353
    //   301: aload_0
    //   302: getfield Zx : [[B
    //   305: iload #4
    //   307: aaload
    //   308: iconst_0
    //   309: aload #6
    //   311: iconst_0
    //   312: iload #5
    //   314: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   317: iload #5
    //   319: istore #7
    //   321: iload #7
    //   323: aload_0
    //   324: getfield ZH : I
    //   327: if_icmpge -> 349
    //   330: aload #6
    //   332: iload #7
    //   334: aload_0
    //   335: getfield Zf : Lburp/Zx_j;
    //   338: getfield Zb : B
    //   341: bastore
    //   342: iinc #7, 1
    //   345: iload_1
    //   346: ifeq -> 321
    //   349: iload_1
    //   350: ifeq -> 404
    //   353: iconst_0
    //   354: istore #7
    //   356: iload #7
    //   358: aload_0
    //   359: getfield ZH : I
    //   362: iload #5
    //   364: isub
    //   365: if_icmpge -> 387
    //   368: aload #6
    //   370: iload #7
    //   372: aload_0
    //   373: getfield Zf : Lburp/Zx_j;
    //   376: getfield Zb : B
    //   379: bastore
    //   380: iinc #7, 1
    //   383: iload_1
    //   384: ifeq -> 356
    //   387: aload_0
    //   388: getfield Zx : [[B
    //   391: iload #4
    //   393: aaload
    //   394: iconst_0
    //   395: aload #6
    //   397: iload #7
    //   399: iload #5
    //   401: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   404: aload_0
    //   405: getfield Zx : [[B
    //   408: iload #4
    //   410: aload #6
    //   412: aastore
    //   413: aload_0
    //   414: dup
    //   415: getfield ZP : I
    //   418: iconst_1
    //   419: iadd
    //   420: putfield ZP : I
    //   423: iinc #4, 1
    //   426: iload_1
    //   427: ifeq -> 248
    //   430: aload_0
    //   431: getfield ZF : Lburp/Zlc8;
    //   434: iinc #2, 8
    //   437: iload_2
    //   438: i2f
    //   439: sipush #-31479
    //   442: sipush #29830
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: invokeinterface Zq : (FLjava/lang/String;)Z
    //   453: ifne -> 461
    //   456: return
    //   457: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   460: athrow
    //   461: aload_0
    //   462: aload_0
    //   463: getfield ZH : I
    //   466: sipush #256
    //   469: multianewarray[[Z 2
    //   473: putfield ZC : [[Z
    //   476: iconst_0
    //   477: istore #4
    //   479: iload #4
    //   481: aload_0
    //   482: getfield Zm : I
    //   485: if_icmpge -> 537
    //   488: iconst_0
    //   489: istore #5
    //   491: iload #5
    //   493: aload_0
    //   494: getfield ZH : I
    //   497: if_icmpge -> 530
    //   500: aload_0
    //   501: getfield ZC : [[Z
    //   504: iload #5
    //   506: aaload
    //   507: sipush #255
    //   510: aload_0
    //   511: getfield Zx : [[B
    //   514: iload #4
    //   516: aaload
    //   517: iload #5
    //   519: baload
    //   520: iand
    //   521: iconst_1
    //   522: bastore
    //   523: iinc #5, 1
    //   526: iload_1
    //   527: ifeq -> 491
    //   530: iinc #4, 1
    //   533: iload_1
    //   534: ifeq -> 479
    //   537: iconst_0
    //   538: istore #4
    //   540: aload_0
    //   541: aload_0
    //   542: getfield ZH : I
    //   545: newarray short
    //   547: putfield ZN : [S
    //   550: iconst_0
    //   551: istore #5
    //   553: iload #5
    //   555: sipush #256
    //   558: if_icmpge -> 630
    //   561: iconst_0
    //   562: istore #6
    //   564: iload #6
    //   566: aload_0
    //   567: getfield ZH : I
    //   570: if_icmpge -> 619
    //   573: aload_0
    //   574: getfield ZC : [[Z
    //   577: iload #6
    //   579: aaload
    //   580: iload #5
    //   582: baload
    //   583: ifeq -> 612
    //   586: aload_0
    //   587: getfield ZN : [S
    //   590: iload #6
    //   592: dup2
    //   593: saload
    //   594: iconst_1
    //   595: iadd
    //   596: i2s
    //   597: sastore
    //   598: iload #4
    //   600: aload_0
    //   601: getfield ZN : [S
    //   604: iload #6
    //   606: saload
    //   607: invokestatic max : (II)I
    //   610: istore #4
    //   612: iinc #6, 1
    //   615: iload_1
    //   616: ifeq -> 564
    //   619: iload #5
    //   621: iconst_1
    //   622: iadd
    //   623: i2s
    //   624: istore #5
    //   626: iload_1
    //   627: ifeq -> 553
    //   630: aload_0
    //   631: getfield Zm : I
    //   634: iload #4
    //   636: sipush #250
    //   639: imul
    //   640: if_icmpge -> 666
    //   643: aload_0
    //   644: getfield Zf : Lburp/Zx_j;
    //   647: iconst_0
    //   648: putfield Z_ : Z
    //   651: aload_0
    //   652: getfield Zf : Lburp/Zx_j;
    //   655: iconst_0
    //   656: putfield Zf : Z
    //   659: goto -> 666
    //   662: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   665: athrow
    //   666: aload_0
    //   667: getfield Zf : Lburp/Zx_j;
    //   670: getfield Z_ : Z
    //   673: aload_0
    //   674: getfield Zf : Lburp/Zx_j;
    //   677: getfield Zf : Z
    //   680: ior
    //   681: istore #5
    //   683: aload_0
    //   684: aload_0
    //   685: getfield ZH : I
    //   688: newarray double
    //   690: putfield Zq : [D
    //   693: iconst_0
    //   694: istore #6
    //   696: iload #6
    //   698: aload_0
    //   699: getfield ZH : I
    //   702: if_icmpge -> 753
    //   705: aload_0
    //   706: getfield Zq : [D
    //   709: iload #6
    //   711: aload_0
    //   712: getfield ZN : [S
    //   715: iload #6
    //   717: saload
    //   718: i2d
    //   719: invokestatic log : (D)D
    //   722: ldc2_w 2.0
    //   725: invokestatic log : (D)D
    //   728: ddiv
    //   729: dastore
    //   730: aload_0
    //   731: dup
    //   732: getfield Zb : D
    //   735: aload_0
    //   736: getfield Zq : [D
    //   739: iload #6
    //   741: daload
    //   742: dadd
    //   743: putfield Zb : D
    //   746: iinc #6, 1
    //   749: iload_1
    //   750: ifeq -> 696
    //   753: aload_0
    //   754: aload_0
    //   755: getfield ZH : I
    //   758: sipush #256
    //   761: multianewarray[[S 2
    //   765: putfield ZV : [[S
    //   768: aload_0
    //   769: aload_0
    //   770: getfield ZH : I
    //   773: anewarray [S
    //   776: putfield Zr : [[S
    //   779: iconst_0
    //   780: istore #6
    //   782: iload #6
    //   784: aload_0
    //   785: getfield ZH : I
    //   788: if_icmpge -> 893
    //   791: aload_0
    //   792: getfield Zr : [[S
    //   795: iload #6
    //   797: aload_0
    //   798: getfield ZN : [S
    //   801: iload #6
    //   803: saload
    //   804: newarray short
    //   806: aastore
    //   807: iconst_0
    //   808: istore #7
    //   810: iconst_0
    //   811: istore #8
    //   813: iconst_0
    //   814: istore #9
    //   816: iload #9
    //   818: sipush #256
    //   821: if_icmpge -> 886
    //   824: aload_0
    //   825: getfield ZC : [[Z
    //   828: iload #6
    //   830: aaload
    //   831: iload #9
    //   833: baload
    //   834: ifeq -> 875
    //   837: aload_0
    //   838: getfield ZV : [[S
    //   841: iload #6
    //   843: aaload
    //   844: iload #9
    //   846: iload #7
    //   848: iload #7
    //   850: iconst_1
    //   851: iadd
    //   852: i2s
    //   853: istore #7
    //   855: sastore
    //   856: aload_0
    //   857: getfield Zr : [[S
    //   860: iload #6
    //   862: aaload
    //   863: iload #8
    //   865: iload #8
    //   867: iconst_1
    //   868: iadd
    //   869: i2s
    //   870: istore #8
    //   872: iload #9
    //   874: sastore
    //   875: iload #9
    //   877: iconst_1
    //   878: iadd
    //   879: i2s
    //   880: istore #9
    //   882: iload_1
    //   883: ifeq -> 816
    //   886: iinc #6, 1
    //   889: iload_1
    //   890: ifeq -> 782
    //   893: aload_0
    //   894: getfield Zf : Lburp/Zx_j;
    //   897: getfield Z_ : Z
    //   900: aload_0
    //   901: getfield Zf : Lburp/Zx_j;
    //   904: getfield Zf : Z
    //   907: ior
    //   908: ifeq -> 2362
    //   911: aload_0
    //   912: getfield Zf : Lburp/Zx_j;
    //   915: getfield Z_ : Z
    //   918: ifeq -> 956
    //   921: goto -> 928
    //   924: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   927: athrow
    //   928: aload_0
    //   929: aload_0
    //   930: getfield ZH : I
    //   933: newarray double
    //   935: putfield Zp : [D
    //   938: aload_0
    //   939: new java/util/ArrayList
    //   942: dup
    //   943: invokespecial <init> : ()V
    //   946: putfield ZB : Ljava/util/List;
    //   949: goto -> 956
    //   952: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   955: athrow
    //   956: aload_0
    //   957: getfield Zf : Lburp/Zx_j;
    //   960: getfield Zf : Z
    //   963: ifeq -> 994
    //   966: aload_0
    //   967: aload_0
    //   968: getfield ZH : I
    //   971: newarray double
    //   973: putfield Zy : [D
    //   976: aload_0
    //   977: new java/util/ArrayList
    //   980: dup
    //   981: invokespecial <init> : ()V
    //   984: putfield Z_ : Ljava/util/List;
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   993: athrow
    //   994: aload_0
    //   995: aload_0
    //   996: getfield ZH : I
    //   999: newarray double
    //   1001: putfield Zw : [D
    //   1004: aload_0
    //   1005: iconst_5
    //   1006: newarray double
    //   1008: putfield ZZ : [D
    //   1011: aload_0
    //   1012: getfield ZF : Lburp/Zlc8;
    //   1015: iinc #2, 8
    //   1018: iload_2
    //   1019: i2f
    //   1020: sipush #-31487
    //   1023: sipush #13783
    //   1026: invokestatic a : (II)Ljava/lang/String;
    //   1029: invokeinterface Zq : (FLjava/lang/String;)Z
    //   1034: ifne -> 1042
    //   1037: return
    //   1038: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1041: athrow
    //   1042: iconst_0
    //   1043: istore #6
    //   1045: iload #6
    //   1047: aload_0
    //   1048: getfield ZH : I
    //   1051: if_icmpge -> 1974
    //   1054: aload_0
    //   1055: getfield ZN : [S
    //   1058: iload #6
    //   1060: saload
    //   1061: iconst_1
    //   1062: if_icmpgt -> 1072
    //   1065: goto -> 1967
    //   1068: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1071: athrow
    //   1072: aload_0
    //   1073: getfield ZF : Lburp/Zlc8;
    //   1076: iload_2
    //   1077: i2f
    //   1078: iload #6
    //   1080: sipush #-31480
    //   1083: sipush #-8327
    //   1086: invokestatic a : (II)Ljava/lang/String;
    //   1089: swap
    //   1090: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   1095: invokeinterface Zq : (FLjava/lang/String;)Z
    //   1100: ifne -> 1108
    //   1103: return
    //   1104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1107: athrow
    //   1108: aload_0
    //   1109: getfield ZN : [S
    //   1112: iload #6
    //   1114: saload
    //   1115: newarray int
    //   1117: astore #7
    //   1119: iconst_0
    //   1120: istore #8
    //   1122: iload #8
    //   1124: aload_0
    //   1125: getfield ZN : [S
    //   1128: iload #6
    //   1130: saload
    //   1131: if_icmpge -> 1211
    //   1134: aload_0
    //   1135: getfield Zr : [[S
    //   1138: iload #6
    //   1140: aaload
    //   1141: iload #8
    //   1143: saload
    //   1144: istore #9
    //   1146: iconst_0
    //   1147: istore #10
    //   1149: iconst_0
    //   1150: istore #11
    //   1152: iload #11
    //   1154: aload_0
    //   1155: getfield Zm : I
    //   1158: if_icmpge -> 1197
    //   1161: sipush #255
    //   1164: aload_0
    //   1165: getfield Zx : [[B
    //   1168: iload #11
    //   1170: aaload
    //   1171: iload #6
    //   1173: baload
    //   1174: iand
    //   1175: iload #9
    //   1177: if_icmpne -> 1190
    //   1180: iinc #10, 1
    //   1183: goto -> 1190
    //   1186: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1189: athrow
    //   1190: iinc #11, 1
    //   1193: iload_1
    //   1194: ifeq -> 1152
    //   1197: aload #7
    //   1199: iload #8
    //   1201: iload #10
    //   1203: iastore
    //   1204: iinc #8, 1
    //   1207: iload_1
    //   1208: ifeq -> 1122
    //   1211: aload_0
    //   1212: getfield Zf : Lburp/Zx_j;
    //   1215: getfield Z_ : Z
    //   1218: ifeq -> 1500
    //   1221: aload_0
    //   1222: getfield Zp : [D
    //   1225: iload #6
    //   1227: dconst_1
    //   1228: dastore
    //   1229: aload_0
    //   1230: getfield Zm : I
    //   1233: aload #7
    //   1235: arraylength
    //   1236: invokestatic ZT : (II)Ljava/util/Map;
    //   1239: astore #8
    //   1241: iconst_0
    //   1242: istore #9
    //   1244: iload #9
    //   1246: aload #7
    //   1248: arraylength
    //   1249: if_icmpge -> 1473
    //   1252: aload #8
    //   1254: aload #7
    //   1256: iload #9
    //   1258: iaload
    //   1259: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1262: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1267: checkcast java/lang/Double
    //   1270: astore #10
    //   1272: aload #10
    //   1274: ifnonnull -> 1287
    //   1277: ldc2_w 1.0E-6
    //   1280: goto -> 1292
    //   1283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1286: athrow
    //   1287: aload #10
    //   1289: invokevirtual doubleValue : ()D
    //   1292: dstore #11
    //   1294: aload #7
    //   1296: iload #9
    //   1298: iaload
    //   1299: iconst_1
    //   1300: if_icmpne -> 1347
    //   1303: dload #11
    //   1305: ldc2_w 1.0E-4
    //   1308: dcmpg
    //   1309: ifge -> 1347
    //   1312: goto -> 1319
    //   1315: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1318: athrow
    //   1319: aload #7
    //   1321: iload #9
    //   1323: iaload
    //   1324: aload_0
    //   1325: getfield Zm : I
    //   1328: aload #7
    //   1330: arraylength
    //   1331: idiv
    //   1332: if_icmple -> 1347
    //   1335: goto -> 1342
    //   1338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1341: athrow
    //   1342: ldc2_w 1.0E-4
    //   1345: dstore #11
    //   1347: aload_0
    //   1348: getfield Zp : [D
    //   1351: iload #6
    //   1353: dup2
    //   1354: daload
    //   1355: dload #11
    //   1357: dmul
    //   1358: dastore
    //   1359: dload #11
    //   1361: ldc2_w 1.0E-4
    //   1364: dcmpg
    //   1365: ifge -> 1466
    //   1368: aload_0
    //   1369: dup
    //   1370: getfield ZT : I
    //   1373: iconst_1
    //   1374: iadd
    //   1375: putfield ZT : I
    //   1378: aload_0
    //   1379: getfield ZT : I
    //   1382: bipush #100
    //   1384: if_icmpgt -> 1466
    //   1387: goto -> 1394
    //   1390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1393: athrow
    //   1394: new burp/Zrmr
    //   1397: dup
    //   1398: iload #6
    //   1400: aload #7
    //   1402: iload #9
    //   1404: iaload
    //   1405: dload #11
    //   1407: aload_0
    //   1408: getfield Zr : [[S
    //   1411: iload #6
    //   1413: aaload
    //   1414: iload #9
    //   1416: saload
    //   1417: aload #7
    //   1419: iload #9
    //   1421: iaload
    //   1422: aload_0
    //   1423: getfield Zm : I
    //   1426: aload #7
    //   1428: arraylength
    //   1429: idiv
    //   1430: if_icmpge -> 1448
    //   1433: goto -> 1440
    //   1436: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1439: athrow
    //   1440: iconst_1
    //   1441: goto -> 1449
    //   1444: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1447: athrow
    //   1448: iconst_0
    //   1449: invokespecial <init> : (IIDSZ)V
    //   1452: astore #13
    //   1454: aload_0
    //   1455: getfield ZB : Ljava/util/List;
    //   1458: aload #13
    //   1460: invokeinterface add : (Ljava/lang/Object;)Z
    //   1465: pop
    //   1466: iinc #9, 1
    //   1469: iload_1
    //   1470: ifeq -> 1244
    //   1473: aload_0
    //   1474: getfield Zp : [D
    //   1477: iload #6
    //   1479: aload_0
    //   1480: getfield Zp : [D
    //   1483: iload #6
    //   1485: daload
    //   1486: dconst_1
    //   1487: aload_0
    //   1488: getfield ZN : [S
    //   1491: iload #6
    //   1493: saload
    //   1494: i2d
    //   1495: ddiv
    //   1496: invokestatic pow : (DD)D
    //   1499: dastore
    //   1500: aload_0
    //   1501: getfield Zf : Lburp/Zx_j;
    //   1504: getfield Zf : Z
    //   1507: ifeq -> 1967
    //   1510: aload_0
    //   1511: getfield Zy : [D
    //   1514: iload #6
    //   1516: dconst_1
    //   1517: dastore
    //   1518: aload_0
    //   1519: getfield ZN : [S
    //   1522: iload #6
    //   1524: saload
    //   1525: aload_0
    //   1526: getfield ZN : [S
    //   1529: iload #6
    //   1531: saload
    //   1532: multianewarray[[I 2
    //   1536: astore #8
    //   1538: iconst_1
    //   1539: istore #9
    //   1541: iload #9
    //   1543: aload_0
    //   1544: getfield Zm : I
    //   1547: if_icmpge -> 1619
    //   1550: sipush #255
    //   1553: aload_0
    //   1554: getfield Zx : [[B
    //   1557: iload #9
    //   1559: iconst_1
    //   1560: isub
    //   1561: aaload
    //   1562: iload #6
    //   1564: baload
    //   1565: iand
    //   1566: istore #10
    //   1568: sipush #255
    //   1571: aload_0
    //   1572: getfield Zx : [[B
    //   1575: iload #9
    //   1577: aaload
    //   1578: iload #6
    //   1580: baload
    //   1581: iand
    //   1582: istore #11
    //   1584: aload #8
    //   1586: aload_0
    //   1587: getfield ZV : [[S
    //   1590: iload #6
    //   1592: aaload
    //   1593: iload #10
    //   1595: saload
    //   1596: aaload
    //   1597: aload_0
    //   1598: getfield ZV : [[S
    //   1601: iload #6
    //   1603: aaload
    //   1604: iload #11
    //   1606: saload
    //   1607: dup2
    //   1608: iaload
    //   1609: iconst_1
    //   1610: iadd
    //   1611: iastore
    //   1612: iinc #9, 1
    //   1615: iload_1
    //   1616: ifeq -> 1541
    //   1619: iconst_0
    //   1620: istore #9
    //   1622: iload #9
    //   1624: aload_0
    //   1625: getfield ZN : [S
    //   1628: iload #6
    //   1630: saload
    //   1631: if_icmpge -> 1940
    //   1634: aload #7
    //   1636: iload #9
    //   1638: iaload
    //   1639: aload #7
    //   1641: arraylength
    //   1642: invokestatic ZT : (II)Ljava/util/Map;
    //   1645: astore #10
    //   1647: dconst_1
    //   1648: dstore #11
    //   1650: iconst_0
    //   1651: istore #13
    //   1653: iload #13
    //   1655: aload_0
    //   1656: getfield ZN : [S
    //   1659: iload #6
    //   1661: saload
    //   1662: if_icmpge -> 1908
    //   1665: aload #10
    //   1667: aload #8
    //   1669: iload #9
    //   1671: aaload
    //   1672: iload #13
    //   1674: iaload
    //   1675: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1678: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1683: checkcast java/lang/Double
    //   1686: astore #14
    //   1688: aload #14
    //   1690: ifnonnull -> 1703
    //   1693: ldc2_w 1.0E-6
    //   1696: goto -> 1708
    //   1699: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1702: athrow
    //   1703: aload #14
    //   1705: invokevirtual doubleValue : ()D
    //   1708: dstore #15
    //   1710: aload #8
    //   1712: iload #9
    //   1714: aaload
    //   1715: iload #13
    //   1717: iaload
    //   1718: iconst_1
    //   1719: if_icmpne -> 1770
    //   1722: dload #15
    //   1724: ldc2_w 1.0E-4
    //   1727: dcmpg
    //   1728: ifge -> 1770
    //   1731: goto -> 1738
    //   1734: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1737: athrow
    //   1738: aload #8
    //   1740: iload #9
    //   1742: aaload
    //   1743: iload #13
    //   1745: iaload
    //   1746: aload #7
    //   1748: iload #9
    //   1750: iaload
    //   1751: aload #7
    //   1753: arraylength
    //   1754: idiv
    //   1755: if_icmple -> 1770
    //   1758: goto -> 1765
    //   1761: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1764: athrow
    //   1765: ldc2_w 1.0E-4
    //   1768: dstore #15
    //   1770: dload #11
    //   1772: dload #15
    //   1774: dmul
    //   1775: dstore #11
    //   1777: dload #15
    //   1779: ldc2_w 1.0E-4
    //   1782: dcmpg
    //   1783: ifge -> 1901
    //   1786: aload_0
    //   1787: dup
    //   1788: getfield Zs : I
    //   1791: iconst_1
    //   1792: iadd
    //   1793: putfield Zs : I
    //   1796: aload_0
    //   1797: getfield Zs : I
    //   1800: bipush #100
    //   1802: if_icmpgt -> 1901
    //   1805: goto -> 1812
    //   1808: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1811: athrow
    //   1812: new burp/Zrmt
    //   1815: dup
    //   1816: iload #6
    //   1818: aload #8
    //   1820: iload #9
    //   1822: aaload
    //   1823: iload #13
    //   1825: iaload
    //   1826: dload #15
    //   1828: aload_0
    //   1829: getfield Zr : [[S
    //   1832: iload #6
    //   1834: aaload
    //   1835: iload #9
    //   1837: saload
    //   1838: aload_0
    //   1839: getfield Zr : [[S
    //   1842: iload #6
    //   1844: aaload
    //   1845: iload #13
    //   1847: saload
    //   1848: aload #8
    //   1850: iload #9
    //   1852: aaload
    //   1853: iload #13
    //   1855: iaload
    //   1856: aload #7
    //   1858: iload #9
    //   1860: iaload
    //   1861: aload #7
    //   1863: arraylength
    //   1864: idiv
    //   1865: if_icmpge -> 1883
    //   1868: goto -> 1875
    //   1871: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1874: athrow
    //   1875: iconst_1
    //   1876: goto -> 1884
    //   1879: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1882: athrow
    //   1883: iconst_0
    //   1884: invokespecial <init> : (IIDSSZ)V
    //   1887: astore #17
    //   1889: aload_0
    //   1890: getfield Z_ : Ljava/util/List;
    //   1893: aload #17
    //   1895: invokeinterface add : (Ljava/lang/Object;)Z
    //   1900: pop
    //   1901: iinc #13, 1
    //   1904: iload_1
    //   1905: ifeq -> 1653
    //   1908: aload_0
    //   1909: getfield Zy : [D
    //   1912: iload #6
    //   1914: dup2
    //   1915: daload
    //   1916: dload #11
    //   1918: dconst_1
    //   1919: aload_0
    //   1920: getfield ZN : [S
    //   1923: iload #6
    //   1925: saload
    //   1926: i2d
    //   1927: ddiv
    //   1928: invokestatic pow : (DD)D
    //   1931: dmul
    //   1932: dastore
    //   1933: iinc #9, 1
    //   1936: iload_1
    //   1937: ifeq -> 1622
    //   1940: aload_0
    //   1941: getfield Zy : [D
    //   1944: iload #6
    //   1946: aload_0
    //   1947: getfield Zy : [D
    //   1950: iload #6
    //   1952: daload
    //   1953: dconst_1
    //   1954: aload_0
    //   1955: getfield ZN : [S
    //   1958: iload #6
    //   1960: saload
    //   1961: i2d
    //   1962: ddiv
    //   1963: invokestatic pow : (DD)D
    //   1966: dastore
    //   1967: iinc #6, 1
    //   1970: iload_1
    //   1971: ifeq -> 1045
    //   1974: iconst_0
    //   1975: istore #6
    //   1977: iload #6
    //   1979: aload_0
    //   1980: getfield ZH : I
    //   1983: if_icmpge -> 2362
    //   1986: aload_0
    //   1987: getfield Zf : Lburp/Zx_j;
    //   1990: getfield Z_ : Z
    //   1993: ifeq -> 2041
    //   1996: aload_0
    //   1997: getfield Zp : [D
    //   2000: iload #6
    //   2002: aload_0
    //   2003: getfield Zp : [D
    //   2006: iload #6
    //   2008: daload
    //   2009: dconst_1
    //   2010: invokestatic min : (DD)D
    //   2013: dastore
    //   2014: aload_0
    //   2015: getfield Zp : [D
    //   2018: iload #6
    //   2020: aload_0
    //   2021: getfield Zp : [D
    //   2024: iload #6
    //   2026: daload
    //   2027: ldc2_w 1.0E-6
    //   2030: invokestatic max : (DD)D
    //   2033: dastore
    //   2034: goto -> 2041
    //   2037: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2040: athrow
    //   2041: aload_0
    //   2042: getfield Zf : Lburp/Zx_j;
    //   2045: getfield Zf : Z
    //   2048: ifeq -> 2096
    //   2051: aload_0
    //   2052: getfield Zy : [D
    //   2055: iload #6
    //   2057: aload_0
    //   2058: getfield Zy : [D
    //   2061: iload #6
    //   2063: daload
    //   2064: dconst_1
    //   2065: invokestatic min : (DD)D
    //   2068: dastore
    //   2069: aload_0
    //   2070: getfield Zy : [D
    //   2073: iload #6
    //   2075: aload_0
    //   2076: getfield Zy : [D
    //   2079: iload #6
    //   2081: daload
    //   2082: ldc2_w 1.0E-6
    //   2085: invokestatic max : (DD)D
    //   2088: dastore
    //   2089: goto -> 2096
    //   2092: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2095: athrow
    //   2096: aload_0
    //   2097: getfield Zw : [D
    //   2100: iload #6
    //   2102: dconst_1
    //   2103: dastore
    //   2104: aload_0
    //   2105: getfield Zf : Lburp/Zx_j;
    //   2108: getfield Z_ : Z
    //   2111: ifeq -> 2160
    //   2114: aload_0
    //   2115: getfield Zp : [D
    //   2118: iload #6
    //   2120: daload
    //   2121: aload_0
    //   2122: getfield Zw : [D
    //   2125: iload #6
    //   2127: daload
    //   2128: dcmpg
    //   2129: ifge -> 2160
    //   2132: goto -> 2139
    //   2135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2138: athrow
    //   2139: aload_0
    //   2140: getfield Zw : [D
    //   2143: iload #6
    //   2145: aload_0
    //   2146: getfield Zp : [D
    //   2149: iload #6
    //   2151: daload
    //   2152: dastore
    //   2153: goto -> 2160
    //   2156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2159: athrow
    //   2160: aload_0
    //   2161: getfield Zf : Lburp/Zx_j;
    //   2164: getfield Zf : Z
    //   2167: ifeq -> 2216
    //   2170: aload_0
    //   2171: getfield Zy : [D
    //   2174: iload #6
    //   2176: daload
    //   2177: aload_0
    //   2178: getfield Zw : [D
    //   2181: iload #6
    //   2183: daload
    //   2184: dcmpg
    //   2185: ifge -> 2216
    //   2188: goto -> 2195
    //   2191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2194: athrow
    //   2195: aload_0
    //   2196: getfield Zw : [D
    //   2199: iload #6
    //   2201: aload_0
    //   2202: getfield Zy : [D
    //   2205: iload #6
    //   2207: daload
    //   2208: dastore
    //   2209: goto -> 2216
    //   2212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2215: athrow
    //   2216: ldc2_w 5.0
    //   2219: aload_0
    //   2220: getfield Zw : [D
    //   2223: iload #6
    //   2225: daload
    //   2226: invokestatic log10 : (D)D
    //   2229: dadd
    //   2230: d2i
    //   2231: istore #7
    //   2233: iload #7
    //   2235: tableswitch default -> 2355, 0 -> 2339, 1 -> 2323, 2 -> 2307, 3 -> 2291, 4 -> 2268
    //   2268: aload_0
    //   2269: getfield ZZ : [D
    //   2272: iconst_4
    //   2273: dup2
    //   2274: daload
    //   2275: aload_0
    //   2276: getfield Zq : [D
    //   2279: iload #6
    //   2281: daload
    //   2282: dadd
    //   2283: dastore
    //   2284: goto -> 2291
    //   2287: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2290: athrow
    //   2291: aload_0
    //   2292: getfield ZZ : [D
    //   2295: iconst_3
    //   2296: dup2
    //   2297: daload
    //   2298: aload_0
    //   2299: getfield Zq : [D
    //   2302: iload #6
    //   2304: daload
    //   2305: dadd
    //   2306: dastore
    //   2307: aload_0
    //   2308: getfield ZZ : [D
    //   2311: iconst_2
    //   2312: dup2
    //   2313: daload
    //   2314: aload_0
    //   2315: getfield Zq : [D
    //   2318: iload #6
    //   2320: daload
    //   2321: dadd
    //   2322: dastore
    //   2323: aload_0
    //   2324: getfield ZZ : [D
    //   2327: iconst_1
    //   2328: dup2
    //   2329: daload
    //   2330: aload_0
    //   2331: getfield Zq : [D
    //   2334: iload #6
    //   2336: daload
    //   2337: dadd
    //   2338: dastore
    //   2339: aload_0
    //   2340: getfield ZZ : [D
    //   2343: iconst_0
    //   2344: dup2
    //   2345: daload
    //   2346: aload_0
    //   2347: getfield Zq : [D
    //   2350: iload #6
    //   2352: daload
    //   2353: dadd
    //   2354: dastore
    //   2355: iinc #6, 1
    //   2358: iload_1
    //   2359: ifeq -> 1977
    //   2362: aload_0
    //   2363: aload_0
    //   2364: getfield ZH : I
    //   2367: newarray byte
    //   2369: putfield ZW : [B
    //   2372: aload_0
    //   2373: aload_0
    //   2374: getfield ZH : I
    //   2377: newarray int
    //   2379: putfield Zj : [I
    //   2382: iconst_0
    //   2383: istore #6
    //   2385: aload_0
    //   2386: getfield ZH : I
    //   2389: iconst_1
    //   2390: isub
    //   2391: istore #7
    //   2393: iload #7
    //   2395: iflt -> 2544
    //   2398: aload_0
    //   2399: getfield ZN : [S
    //   2402: iload #7
    //   2404: saload
    //   2405: i2d
    //   2406: invokestatic log : (D)D
    //   2409: ldc2_w 2.0
    //   2412: invokestatic log : (D)D
    //   2415: ddiv
    //   2416: dstore #8
    //   2418: aload_0
    //   2419: getfield ZW : [B
    //   2422: iload #7
    //   2424: dload #8
    //   2426: invokestatic floor : (D)D
    //   2429: d2i
    //   2430: i2b
    //   2431: bastore
    //   2432: aload_0
    //   2433: getfield Zj : [I
    //   2436: iload #7
    //   2438: ldc2_w 2.0
    //   2441: aload_0
    //   2442: getfield ZW : [B
    //   2445: iload #7
    //   2447: baload
    //   2448: i2d
    //   2449: invokestatic pow : (DD)D
    //   2452: d2i
    //   2453: iastore
    //   2454: iload #6
    //   2456: aload_0
    //   2457: getfield ZW : [B
    //   2460: iload #7
    //   2462: baload
    //   2463: iadd
    //   2464: istore #6
    //   2466: aload_0
    //   2467: getfield Zj : [I
    //   2470: iload #7
    //   2472: iaload
    //   2473: aload_0
    //   2474: getfield ZN : [S
    //   2477: iload #7
    //   2479: saload
    //   2480: if_icmpeq -> 2521
    //   2483: aload_0
    //   2484: getfield Zo : Ljava/util/Map;
    //   2487: iload #6
    //   2489: iconst_1
    //   2490: isub
    //   2491: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2494: dload #8
    //   2496: aload_0
    //   2497: getfield ZW : [B
    //   2500: iload #7
    //   2502: baload
    //   2503: i2d
    //   2504: ddiv
    //   2505: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2508: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2513: pop
    //   2514: goto -> 2521
    //   2517: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2520: athrow
    //   2521: aload_0
    //   2522: dup
    //   2523: getfield Zh : I
    //   2526: aload_0
    //   2527: getfield ZW : [B
    //   2530: iload #7
    //   2532: baload
    //   2533: iadd
    //   2534: putfield Zh : I
    //   2537: iinc #7, -1
    //   2540: iload_1
    //   2541: ifeq -> 2393
    //   2544: aload_0
    //   2545: aload_0
    //   2546: getfield Zh : I
    //   2549: aload_0
    //   2550: getfield Zm : I
    //   2553: bipush #7
    //   2555: iadd
    //   2556: bipush #8
    //   2558: idiv
    //   2559: multianewarray[[B 2
    //   2563: putfield Zt : [[B
    //   2566: dconst_0
    //   2567: dstore #7
    //   2569: iconst_0
    //   2570: istore #9
    //   2572: iload #9
    //   2574: aload_0
    //   2575: getfield Zm : I
    //   2578: if_icmpge -> 2839
    //   2581: iconst_0
    //   2582: istore #10
    //   2584: aload_0
    //   2585: getfield ZH : I
    //   2588: iconst_1
    //   2589: isub
    //   2590: istore #11
    //   2592: iload #11
    //   2594: iflt -> 2832
    //   2597: aload_0
    //   2598: getfield ZV : [[S
    //   2601: iload #11
    //   2603: aaload
    //   2604: sipush #255
    //   2607: aload_0
    //   2608: getfield Zx : [[B
    //   2611: iload #9
    //   2613: aaload
    //   2614: iload #11
    //   2616: baload
    //   2617: iand
    //   2618: saload
    //   2619: istore #12
    //   2621: aload_0
    //   2622: getfield Zj : [I
    //   2625: iload #11
    //   2627: iaload
    //   2628: aload_0
    //   2629: getfield ZN : [S
    //   2632: iload #11
    //   2634: saload
    //   2635: if_icmpeq -> 2748
    //   2638: iload #12
    //   2640: aload_0
    //   2641: getfield Zj : [I
    //   2644: iload #11
    //   2646: iaload
    //   2647: if_icmplt -> 2748
    //   2650: goto -> 2657
    //   2653: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2656: athrow
    //   2657: iload #12
    //   2659: aload_0
    //   2660: getfield Zj : [I
    //   2663: iload #11
    //   2665: iaload
    //   2666: isub
    //   2667: i2s
    //   2668: istore #12
    //   2670: aload_0
    //   2671: getfield Zj : [I
    //   2674: iload #11
    //   2676: iaload
    //   2677: i2d
    //   2678: aload_0
    //   2679: getfield ZN : [S
    //   2682: iload #11
    //   2684: saload
    //   2685: aload_0
    //   2686: getfield Zj : [I
    //   2689: iload #11
    //   2691: iaload
    //   2692: isub
    //   2693: i2d
    //   2694: ddiv
    //   2695: dstore #13
    //   2697: iload #12
    //   2699: i2d
    //   2700: dload #13
    //   2702: dmul
    //   2703: dstore #15
    //   2705: iload #12
    //   2707: iconst_1
    //   2708: iadd
    //   2709: i2d
    //   2710: dload #13
    //   2712: dmul
    //   2713: dstore #17
    //   2715: dload #7
    //   2717: ldc2_w 0.3
    //   2720: dadd
    //   2721: dstore #7
    //   2723: dload #7
    //   2725: dload #7
    //   2727: invokestatic floor : (D)D
    //   2730: dsub
    //   2731: dstore #7
    //   2733: dload #15
    //   2735: dload #7
    //   2737: dload #17
    //   2739: dload #15
    //   2741: dsub
    //   2742: dmul
    //   2743: dadd
    //   2744: d2i
    //   2745: i2s
    //   2746: istore #12
    //   2748: iconst_0
    //   2749: istore #13
    //   2751: iload #13
    //   2753: aload_0
    //   2754: getfield ZW : [B
    //   2757: iload #11
    //   2759: baload
    //   2760: if_icmpge -> 2818
    //   2763: iload #12
    //   2765: iconst_1
    //   2766: iload #13
    //   2768: ishl
    //   2769: iand
    //   2770: ifeq -> 2807
    //   2773: aload_0
    //   2774: getfield Zt : [[B
    //   2777: iload #10
    //   2779: iload #13
    //   2781: iadd
    //   2782: aaload
    //   2783: iload #9
    //   2785: bipush #8
    //   2787: idiv
    //   2788: dup2
    //   2789: baload
    //   2790: iconst_1
    //   2791: iload #9
    //   2793: bipush #8
    //   2795: irem
    //   2796: ishl
    //   2797: ior
    //   2798: i2b
    //   2799: bastore
    //   2800: goto -> 2807
    //   2803: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2806: athrow
    //   2807: iload #13
    //   2809: iconst_1
    //   2810: iadd
    //   2811: i2b
    //   2812: istore #13
    //   2814: iload_1
    //   2815: ifeq -> 2751
    //   2818: iload #10
    //   2820: iload #13
    //   2822: iadd
    //   2823: istore #10
    //   2825: iinc #11, -1
    //   2828: iload_1
    //   2829: ifeq -> 2592
    //   2832: iinc #9, 1
    //   2835: iload_1
    //   2836: ifeq -> 2572
    //   2839: aload_0
    //   2840: getfield Zf : Lburp/Zx_j;
    //   2843: getfield ZH : Z
    //   2846: ifeq -> 3139
    //   2849: aload_0
    //   2850: getfield ZF : Lburp/Zlc8;
    //   2853: iinc #2, 8
    //   2856: iload_2
    //   2857: i2f
    //   2858: sipush #-31477
    //   2861: sipush #-1983
    //   2864: invokestatic a : (II)Ljava/lang/String;
    //   2867: invokeinterface Zq : (FLjava/lang/String;)Z
    //   2872: ifne -> 2887
    //   2875: goto -> 2882
    //   2878: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2881: athrow
    //   2882: return
    //   2883: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2886: athrow
    //   2887: aload_0
    //   2888: aload_0
    //   2889: getfield Zh : I
    //   2892: newarray double
    //   2894: putfield Za : [D
    //   2897: aload_0
    //   2898: new java/util/ArrayList
    //   2901: dup
    //   2902: invokespecial <init> : ()V
    //   2905: putfield ZL : Ljava/util/List;
    //   2908: aload_0
    //   2909: aload_0
    //   2910: getfield Zh : I
    //   2913: newarray boolean
    //   2915: putfield ZU : [Z
    //   2918: iconst_0
    //   2919: istore #9
    //   2921: iload #9
    //   2923: aload_0
    //   2924: getfield Zh : I
    //   2927: if_icmpge -> 3139
    //   2930: iconst_0
    //   2931: istore #10
    //   2933: iconst_0
    //   2934: istore #11
    //   2936: iload #11
    //   2938: aload_0
    //   2939: getfield Zm : I
    //   2942: if_icmpge -> 2986
    //   2945: aload_0
    //   2946: getfield Zt : [[B
    //   2949: iload #9
    //   2951: aaload
    //   2952: iload #11
    //   2954: bipush #8
    //   2956: idiv
    //   2957: baload
    //   2958: iconst_1
    //   2959: iload #11
    //   2961: bipush #8
    //   2963: irem
    //   2964: ishl
    //   2965: iand
    //   2966: ifeq -> 2979
    //   2969: iinc #10, 1
    //   2972: goto -> 2979
    //   2975: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2978: athrow
    //   2979: iinc #11, 1
    //   2982: iload_1
    //   2983: ifeq -> 2936
    //   2986: aload_0
    //   2987: getfield Za : [D
    //   2990: iload #9
    //   2992: bipush #11
    //   2994: aload_0
    //   2995: getfield Zm : I
    //   2998: iload #10
    //   3000: invokestatic Zn : (BII)D
    //   3003: dastore
    //   3004: aload_0
    //   3005: getfield Za : [D
    //   3008: iload #9
    //   3010: daload
    //   3011: ldc2_w 1.0E-4
    //   3014: dcmpg
    //   3015: ifge -> 3103
    //   3018: aload_0
    //   3019: dup
    //   3020: getfield Zl : I
    //   3023: iconst_1
    //   3024: iadd
    //   3025: putfield Zl : I
    //   3028: aload_0
    //   3029: getfield Zl : I
    //   3032: bipush #100
    //   3034: if_icmpgt -> 3103
    //   3037: goto -> 3044
    //   3040: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3043: athrow
    //   3044: new burp/Zrma
    //   3047: dup
    //   3048: iload #9
    //   3050: iload #10
    //   3052: aload_0
    //   3053: getfield Za : [D
    //   3056: iload #9
    //   3058: daload
    //   3059: iload #10
    //   3061: aload_0
    //   3062: getfield Zm : I
    //   3065: iconst_2
    //   3066: idiv
    //   3067: if_icmpge -> 3085
    //   3070: goto -> 3077
    //   3073: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3076: athrow
    //   3077: iconst_1
    //   3078: goto -> 3086
    //   3081: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3084: athrow
    //   3085: iconst_0
    //   3086: invokespecial <init> : (IIDZ)V
    //   3089: astore #11
    //   3091: aload_0
    //   3092: getfield ZL : Ljava/util/List;
    //   3095: aload #11
    //   3097: invokeinterface add : (Ljava/lang/Object;)Z
    //   3102: pop
    //   3103: aload_0
    //   3104: getfield ZU : [Z
    //   3107: iload #9
    //   3109: bipush #11
    //   3111: aload_0
    //   3112: getfield Zm : I
    //   3115: iload #10
    //   3117: aload_0
    //   3118: getfield Za : [D
    //   3121: iload #9
    //   3123: daload
    //   3124: invokestatic ZY : (BIID)Z
    //   3127: bastore
    //   3128: iload #9
    //   3130: iconst_1
    //   3131: iadd
    //   3132: i2s
    //   3133: istore #9
    //   3135: iload_1
    //   3136: ifeq -> 2921
    //   3139: aload_0
    //   3140: getfield Zf : Lburp/Zx_j;
    //   3143: getfield Zy : Z
    //   3146: ifeq -> 3511
    //   3149: aload_0
    //   3150: getfield ZF : Lburp/Zlc8;
    //   3153: iinc #2, 8
    //   3156: iload_2
    //   3157: i2f
    //   3158: sipush #-31484
    //   3161: sipush #-14891
    //   3164: invokestatic a : (II)Ljava/lang/String;
    //   3167: invokeinterface Zq : (FLjava/lang/String;)Z
    //   3172: ifne -> 3187
    //   3175: goto -> 3182
    //   3178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3181: athrow
    //   3182: return
    //   3183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3186: athrow
    //   3187: aload_0
    //   3188: aload_0
    //   3189: getfield Zh : I
    //   3192: newarray double
    //   3194: putfield Zg : [D
    //   3197: aload_0
    //   3198: new java/util/ArrayList
    //   3201: dup
    //   3202: invokespecial <init> : ()V
    //   3205: putfield Zv : Ljava/util/List;
    //   3208: aload_0
    //   3209: aload_0
    //   3210: getfield Zh : I
    //   3213: newarray boolean
    //   3215: putfield ZX : [Z
    //   3218: iconst_0
    //   3219: istore #9
    //   3221: iload #9
    //   3223: aload_0
    //   3224: getfield Zh : I
    //   3227: if_icmpge -> 3511
    //   3230: bipush #16
    //   3232: newarray int
    //   3234: astore #10
    //   3236: iconst_0
    //   3237: istore #11
    //   3239: iload #11
    //   3241: aload_0
    //   3242: getfield Zm : I
    //   3245: bipush #8
    //   3247: idiv
    //   3248: if_icmpge -> 3305
    //   3251: aload #10
    //   3253: sipush #255
    //   3256: aload_0
    //   3257: getfield Zt : [[B
    //   3260: iload #9
    //   3262: aaload
    //   3263: iload #11
    //   3265: baload
    //   3266: iand
    //   3267: iconst_4
    //   3268: ishr
    //   3269: dup2
    //   3270: iaload
    //   3271: iconst_1
    //   3272: iadd
    //   3273: iastore
    //   3274: aload #10
    //   3276: sipush #255
    //   3279: aload_0
    //   3280: getfield Zt : [[B
    //   3283: iload #9
    //   3285: aaload
    //   3286: iload #11
    //   3288: baload
    //   3289: iand
    //   3290: bipush #15
    //   3292: iand
    //   3293: dup2
    //   3294: iaload
    //   3295: iconst_1
    //   3296: iadd
    //   3297: iastore
    //   3298: iinc #11, 1
    //   3301: iload_1
    //   3302: ifeq -> 3239
    //   3305: dconst_0
    //   3306: dstore #11
    //   3308: iconst_0
    //   3309: istore #13
    //   3311: iload #13
    //   3313: bipush #16
    //   3315: if_icmpge -> 3342
    //   3318: dload #11
    //   3320: aload #10
    //   3322: iload #13
    //   3324: iaload
    //   3325: aload #10
    //   3327: iload #13
    //   3329: iaload
    //   3330: imul
    //   3331: i2d
    //   3332: dadd
    //   3333: dstore #11
    //   3335: iinc #13, 1
    //   3338: iload_1
    //   3339: ifeq -> 3311
    //   3342: ldc2_w 64.0
    //   3345: aload_0
    //   3346: getfield Zm : I
    //   3349: i2d
    //   3350: ddiv
    //   3351: dload #11
    //   3353: dmul
    //   3354: aload_0
    //   3355: getfield Zm : I
    //   3358: i2d
    //   3359: ldc2_w 4.0
    //   3362: ddiv
    //   3363: dsub
    //   3364: dstore #11
    //   3366: aload_0
    //   3367: getfield Zg : [D
    //   3370: iload #9
    //   3372: dload #11
    //   3374: invokestatic Zv : (D)D
    //   3377: dastore
    //   3378: aload_0
    //   3379: getfield Zg : [D
    //   3382: iload #9
    //   3384: daload
    //   3385: ldc2_w 1.0E-4
    //   3388: dcmpg
    //   3389: ifge -> 3475
    //   3392: aload_0
    //   3393: dup
    //   3394: getfield Zu : I
    //   3397: iconst_1
    //   3398: iadd
    //   3399: putfield Zu : I
    //   3402: aload_0
    //   3403: getfield Zu : I
    //   3406: bipush #100
    //   3408: if_icmpgt -> 3475
    //   3411: goto -> 3418
    //   3414: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3417: athrow
    //   3418: new burp/Zrmk
    //   3421: dup
    //   3422: iload #9
    //   3424: dload #11
    //   3426: aload_0
    //   3427: getfield Zg : [D
    //   3430: iload #9
    //   3432: daload
    //   3433: dload #11
    //   3435: ldc2_w 10.0
    //   3438: dcmpg
    //   3439: ifge -> 3457
    //   3442: goto -> 3449
    //   3445: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3448: athrow
    //   3449: iconst_1
    //   3450: goto -> 3458
    //   3453: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3456: athrow
    //   3457: iconst_0
    //   3458: invokespecial <init> : (IDDZ)V
    //   3461: astore #13
    //   3463: aload_0
    //   3464: getfield Zv : Ljava/util/List;
    //   3467: aload #13
    //   3469: invokeinterface add : (Ljava/lang/Object;)Z
    //   3474: pop
    //   3475: aload_0
    //   3476: getfield ZX : [Z
    //   3479: iload #9
    //   3481: bipush #12
    //   3483: aload_0
    //   3484: getfield Zm : I
    //   3487: dload #11
    //   3489: aload_0
    //   3490: getfield Zg : [D
    //   3493: iload #9
    //   3495: daload
    //   3496: invokestatic ZH : (BIDD)Z
    //   3499: bastore
    //   3500: iload #9
    //   3502: iconst_1
    //   3503: iadd
    //   3504: i2s
    //   3505: istore #9
    //   3507: iload_1
    //   3508: ifeq -> 3221
    //   3511: aload_0
    //   3512: getfield Zf : Lburp/Zx_j;
    //   3515: getfield Zh : Z
    //   3518: ifeq -> 3975
    //   3521: aload_0
    //   3522: getfield ZF : Lburp/Zlc8;
    //   3525: iinc #2, 8
    //   3528: iload_2
    //   3529: i2f
    //   3530: sipush #-31486
    //   3533: sipush #-21208
    //   3536: invokestatic a : (II)Ljava/lang/String;
    //   3539: invokeinterface Zq : (FLjava/lang/String;)Z
    //   3544: ifne -> 3559
    //   3547: goto -> 3554
    //   3550: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3553: athrow
    //   3554: return
    //   3555: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3558: athrow
    //   3559: aload_0
    //   3560: aload_0
    //   3561: getfield Zh : I
    //   3564: newarray double
    //   3566: putfield Zk : [D
    //   3569: aload_0
    //   3570: new java/util/ArrayList
    //   3573: dup
    //   3574: invokespecial <init> : ()V
    //   3577: putfield ZY : Ljava/util/List;
    //   3580: aload_0
    //   3581: aload_0
    //   3582: getfield Zh : I
    //   3585: newarray boolean
    //   3587: putfield ZI : [Z
    //   3590: iconst_0
    //   3591: istore #9
    //   3593: iload #9
    //   3595: aload_0
    //   3596: getfield Zh : I
    //   3599: if_icmpge -> 3975
    //   3602: bipush #7
    //   3604: newarray int
    //   3606: astore #10
    //   3608: iconst_0
    //   3609: istore #11
    //   3611: iconst_0
    //   3612: istore #12
    //   3614: iconst_0
    //   3615: istore #13
    //   3617: iload #13
    //   3619: aload_0
    //   3620: getfield Zm : I
    //   3623: if_icmpge -> 3732
    //   3626: sipush #255
    //   3629: aload_0
    //   3630: getfield Zt : [[B
    //   3633: iload #9
    //   3635: aaload
    //   3636: iload #13
    //   3638: bipush #8
    //   3640: idiv
    //   3641: baload
    //   3642: iand
    //   3643: iconst_1
    //   3644: iload #13
    //   3646: bipush #8
    //   3648: irem
    //   3649: ishl
    //   3650: iand
    //   3651: ifeq -> 3662
    //   3654: iconst_1
    //   3655: goto -> 3663
    //   3658: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3661: athrow
    //   3662: iconst_0
    //   3663: iload #11
    //   3665: ixor
    //   3666: ifeq -> 3715
    //   3669: aload #10
    //   3671: iload #12
    //   3673: bipush #6
    //   3675: if_icmple -> 3694
    //   3678: goto -> 3685
    //   3681: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3684: athrow
    //   3685: bipush #6
    //   3687: goto -> 3696
    //   3690: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3693: athrow
    //   3694: iload #12
    //   3696: dup2
    //   3697: iaload
    //   3698: iconst_1
    //   3699: iadd
    //   3700: iastore
    //   3701: iload #11
    //   3703: iconst_1
    //   3704: ixor
    //   3705: i2s
    //   3706: istore #11
    //   3708: iconst_0
    //   3709: istore #12
    //   3711: iload_1
    //   3712: ifeq -> 3725
    //   3715: iinc #12, 1
    //   3718: goto -> 3725
    //   3721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3724: athrow
    //   3725: iinc #13, 1
    //   3728: iload_1
    //   3729: ifeq -> 3617
    //   3732: aload_0
    //   3733: getfield Zk : [D
    //   3736: iload #9
    //   3738: dconst_1
    //   3739: dastore
    //   3740: aload_0
    //   3741: getfield ZI : [Z
    //   3744: iload #9
    //   3746: iconst_1
    //   3747: bastore
    //   3748: iconst_1
    //   3749: istore #13
    //   3751: iload #13
    //   3753: bipush #6
    //   3755: if_icmpgt -> 3964
    //   3758: bipush #13
    //   3760: iload #13
    //   3762: aload_0
    //   3763: getfield Zm : I
    //   3766: aload #10
    //   3768: iload #13
    //   3770: iaload
    //   3771: invokestatic ZC : (BIII)D
    //   3774: dstore #14
    //   3776: dload #14
    //   3778: ldc2_w 1.0E-4
    //   3781: dcmpg
    //   3782: ifge -> 3888
    //   3785: aload_0
    //   3786: dup
    //   3787: getfield ZJ : I
    //   3790: iconst_1
    //   3791: iadd
    //   3792: putfield ZJ : I
    //   3795: aload_0
    //   3796: getfield ZJ : I
    //   3799: bipush #100
    //   3801: if_icmpgt -> 3888
    //   3804: goto -> 3811
    //   3807: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3810: athrow
    //   3811: aload_0
    //   3812: getfield Zm : I
    //   3815: iconst_1
    //   3816: iconst_2
    //   3817: iload #13
    //   3819: iadd
    //   3820: ishl
    //   3821: idiv
    //   3822: istore #16
    //   3824: iload #13
    //   3826: bipush #6
    //   3828: if_icmpne -> 3837
    //   3831: iload #16
    //   3833: iconst_2
    //   3834: idiv
    //   3835: istore #16
    //   3837: new burp/Zrmc
    //   3840: dup
    //   3841: iload #9
    //   3843: iload #13
    //   3845: aload #10
    //   3847: iload #13
    //   3849: iaload
    //   3850: dload #14
    //   3852: aload #10
    //   3854: iload #13
    //   3856: iaload
    //   3857: iload #16
    //   3859: if_icmpge -> 3870
    //   3862: iconst_1
    //   3863: goto -> 3871
    //   3866: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3869: athrow
    //   3870: iconst_0
    //   3871: invokespecial <init> : (IIIDZ)V
    //   3874: astore #17
    //   3876: aload_0
    //   3877: getfield ZY : Ljava/util/List;
    //   3880: aload #17
    //   3882: invokeinterface add : (Ljava/lang/Object;)Z
    //   3887: pop
    //   3888: bipush #13
    //   3890: iload #13
    //   3892: aload_0
    //   3893: getfield Zm : I
    //   3896: aload #10
    //   3898: iload #13
    //   3900: iaload
    //   3901: dload #14
    //   3903: invokestatic Zk : (BIIID)Z
    //   3906: istore #16
    //   3908: iload #16
    //   3910: ifne -> 3928
    //   3913: aload_0
    //   3914: getfield ZI : [Z
    //   3917: iload #9
    //   3919: iconst_0
    //   3920: bastore
    //   3921: goto -> 3928
    //   3924: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3927: athrow
    //   3928: dload #14
    //   3930: aload_0
    //   3931: getfield Zk : [D
    //   3934: iload #9
    //   3936: daload
    //   3937: dcmpg
    //   3938: ifge -> 3957
    //   3941: aload_0
    //   3942: getfield Zk : [D
    //   3945: iload #9
    //   3947: dload #14
    //   3949: dastore
    //   3950: goto -> 3957
    //   3953: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3956: athrow
    //   3957: iinc #13, 1
    //   3960: iload_1
    //   3961: ifeq -> 3751
    //   3964: iload #9
    //   3966: iconst_1
    //   3967: iadd
    //   3968: i2s
    //   3969: istore #9
    //   3971: iload_1
    //   3972: ifeq -> 3593
    //   3975: aload_0
    //   3976: getfield Zf : Lburp/Zx_j;
    //   3979: getfield ZM : Z
    //   3982: ifeq -> 4321
    //   3985: aload_0
    //   3986: getfield ZF : Lburp/Zlc8;
    //   3989: iinc #2, 8
    //   3992: iload_2
    //   3993: i2f
    //   3994: sipush #-31476
    //   3997: sipush #31881
    //   4000: invokestatic a : (II)Ljava/lang/String;
    //   4003: invokeinterface Zq : (FLjava/lang/String;)Z
    //   4008: ifne -> 4023
    //   4011: goto -> 4018
    //   4014: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4017: athrow
    //   4018: return
    //   4019: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4022: athrow
    //   4023: aload_0
    //   4024: aload_0
    //   4025: getfield Zh : I
    //   4028: newarray double
    //   4030: putfield ZO : [D
    //   4033: aload_0
    //   4034: new java/util/ArrayList
    //   4037: dup
    //   4038: invokespecial <init> : ()V
    //   4041: putfield ZR : Ljava/util/List;
    //   4044: aload_0
    //   4045: aload_0
    //   4046: getfield Zh : I
    //   4049: newarray boolean
    //   4051: putfield ZM : [Z
    //   4054: iconst_0
    //   4055: istore #9
    //   4057: iload #9
    //   4059: aload_0
    //   4060: getfield Zh : I
    //   4063: if_icmpge -> 4321
    //   4066: iconst_0
    //   4067: istore #10
    //   4069: iconst_0
    //   4070: istore #11
    //   4072: iconst_0
    //   4073: istore #12
    //   4075: iconst_0
    //   4076: istore #13
    //   4078: iload #13
    //   4080: aload_0
    //   4081: getfield Zm : I
    //   4084: if_icmpge -> 4172
    //   4087: sipush #255
    //   4090: aload_0
    //   4091: getfield Zt : [[B
    //   4094: iload #9
    //   4096: aaload
    //   4097: iload #13
    //   4099: bipush #8
    //   4101: idiv
    //   4102: baload
    //   4103: iand
    //   4104: iconst_1
    //   4105: iload #13
    //   4107: bipush #8
    //   4109: irem
    //   4110: ishl
    //   4111: iand
    //   4112: ifeq -> 4123
    //   4115: iconst_1
    //   4116: goto -> 4124
    //   4119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4122: athrow
    //   4123: iconst_0
    //   4124: iload #11
    //   4126: ixor
    //   4127: ifeq -> 4144
    //   4130: iload #11
    //   4132: iconst_1
    //   4133: ixor
    //   4134: i2s
    //   4135: istore #11
    //   4137: iconst_0
    //   4138: istore #12
    //   4140: iload_1
    //   4141: ifeq -> 4154
    //   4144: iinc #12, 1
    //   4147: goto -> 4154
    //   4150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4153: athrow
    //   4154: iload #12
    //   4156: iload #10
    //   4158: if_icmple -> 4165
    //   4161: iload #12
    //   4163: istore #10
    //   4165: iinc #13, 1
    //   4168: iload_1
    //   4169: ifeq -> 4078
    //   4172: aload_0
    //   4173: getfield ZO : [D
    //   4176: iload #9
    //   4178: bipush #14
    //   4180: aload_0
    //   4181: getfield Zm : I
    //   4184: iload #10
    //   4186: invokestatic Zn : (BII)D
    //   4189: dastore
    //   4190: aload_0
    //   4191: getfield ZO : [D
    //   4194: iload #9
    //   4196: daload
    //   4197: ldc2_w 1.0E-4
    //   4200: dcmpg
    //   4201: ifge -> 4285
    //   4204: aload_0
    //   4205: dup
    //   4206: getfield Zi : I
    //   4209: iconst_1
    //   4210: iadd
    //   4211: putfield Zi : I
    //   4214: aload_0
    //   4215: getfield Zi : I
    //   4218: bipush #100
    //   4220: if_icmpgt -> 4285
    //   4223: goto -> 4230
    //   4226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4229: athrow
    //   4230: new burp/Zrmd
    //   4233: dup
    //   4234: iload #9
    //   4236: iload #10
    //   4238: aload_0
    //   4239: getfield ZO : [D
    //   4242: iload #9
    //   4244: daload
    //   4245: iload #10
    //   4247: bipush #12
    //   4249: if_icmpge -> 4267
    //   4252: goto -> 4259
    //   4255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4258: athrow
    //   4259: iconst_1
    //   4260: goto -> 4268
    //   4263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4266: athrow
    //   4267: iconst_0
    //   4268: invokespecial <init> : (IIDZ)V
    //   4271: astore #13
    //   4273: aload_0
    //   4274: getfield ZR : Ljava/util/List;
    //   4277: aload #13
    //   4279: invokeinterface add : (Ljava/lang/Object;)Z
    //   4284: pop
    //   4285: aload_0
    //   4286: getfield ZM : [Z
    //   4289: iload #9
    //   4291: bipush #14
    //   4293: aload_0
    //   4294: getfield Zm : I
    //   4297: iload #10
    //   4299: aload_0
    //   4300: getfield ZO : [D
    //   4303: iload #9
    //   4305: daload
    //   4306: invokestatic ZY : (BIID)Z
    //   4309: bastore
    //   4310: iload #9
    //   4312: iconst_1
    //   4313: iadd
    //   4314: i2s
    //   4315: istore #9
    //   4317: iload_1
    //   4318: ifeq -> 4057
    //   4321: aload_0
    //   4322: getfield Zf : Lburp/Zx_j;
    //   4325: getfield ZA : Z
    //   4328: ifeq -> 5566
    //   4331: aload_0
    //   4332: getfield ZF : Lburp/Zlc8;
    //   4335: iinc #2, 8
    //   4338: iload_2
    //   4339: i2f
    //   4340: sipush #-31478
    //   4343: sipush #11083
    //   4346: invokestatic a : (II)Ljava/lang/String;
    //   4349: invokeinterface Zq : (FLjava/lang/String;)Z
    //   4354: ifne -> 4369
    //   4357: goto -> 4364
    //   4360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4363: athrow
    //   4364: return
    //   4365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4368: athrow
    //   4369: aload_0
    //   4370: aload_0
    //   4371: getfield Zh : I
    //   4374: newarray double
    //   4376: putfield ZE : [D
    //   4379: aload_0
    //   4380: new java/util/ArrayList
    //   4383: dup
    //   4384: invokespecial <init> : ()V
    //   4387: putfield ZHu : Ljava/util/List;
    //   4390: new java/util/HashMap
    //   4393: dup
    //   4394: invokespecial <init> : ()V
    //   4397: astore #9
    //   4399: iconst_0
    //   4400: istore #10
    //   4402: iload #10
    //   4404: aload_0
    //   4405: getfield Zh : I
    //   4408: if_icmpge -> 5566
    //   4411: aload_0
    //   4412: getfield ZF : Lburp/Zlc8;
    //   4415: iload_2
    //   4416: i2f
    //   4417: iload #10
    //   4419: sipush #-31473
    //   4422: sipush #7883
    //   4425: invokestatic a : (II)Ljava/lang/String;
    //   4428: swap
    //   4429: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;S)Ljava/lang/String;
    //   4434: invokeinterface Zq : (FLjava/lang/String;)Z
    //   4439: ifne -> 4447
    //   4442: return
    //   4443: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4446: athrow
    //   4447: aload_0
    //   4448: getfield ZE : [D
    //   4451: iload #10
    //   4453: dconst_1
    //   4454: dastore
    //   4455: iconst_2
    //   4456: istore #11
    //   4458: iload #11
    //   4460: bipush #6
    //   4462: if_icmpgt -> 5555
    //   4465: iconst_1
    //   4466: istore #12
    //   4468: iload #12
    //   4470: iconst_4
    //   4471: if_icmpgt -> 5544
    //   4474: iload #12
    //   4476: iconst_1
    //   4477: if_icmple -> 4501
    //   4480: iload #12
    //   4482: iload #11
    //   4484: if_icmpge -> 4501
    //   4487: goto -> 4494
    //   4490: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4493: athrow
    //   4494: goto -> 5533
    //   4497: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4500: athrow
    //   4501: iconst_1
    //   4502: iload #12
    //   4504: ishl
    //   4505: istore #13
    //   4507: iload #13
    //   4509: i2d
    //   4510: iload #11
    //   4512: i2d
    //   4513: invokestatic pow : (DD)D
    //   4516: d2i
    //   4517: istore #14
    //   4519: aload_0
    //   4520: getfield Zm : I
    //   4523: iload #14
    //   4525: idiv
    //   4526: bipush #10
    //   4528: if_icmpge -> 4538
    //   4531: goto -> 5533
    //   4534: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4537: athrow
    //   4538: iload #13
    //   4540: iload #13
    //   4542: iload #11
    //   4544: iconst_2
    //   4545: if_icmple -> 4557
    //   4548: iload #13
    //   4550: goto -> 4558
    //   4553: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4556: athrow
    //   4557: iconst_1
    //   4558: iload #11
    //   4560: iconst_3
    //   4561: if_icmple -> 4573
    //   4564: iload #13
    //   4566: goto -> 4574
    //   4569: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4572: athrow
    //   4573: iconst_1
    //   4574: iload #11
    //   4576: iconst_4
    //   4577: if_icmple -> 4589
    //   4580: iload #13
    //   4582: goto -> 4590
    //   4585: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4588: athrow
    //   4589: iconst_1
    //   4590: iload #11
    //   4592: iconst_5
    //   4593: if_icmple -> 4605
    //   4596: iload #13
    //   4598: goto -> 4606
    //   4601: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4604: athrow
    //   4605: iconst_1
    //   4606: multianewarray[[[[[[I 6
    //   4610: astore #15
    //   4612: bipush #6
    //   4614: newarray short
    //   4616: astore #16
    //   4618: iconst_0
    //   4619: istore #17
    //   4621: iload #17
    //   4623: iload #12
    //   4625: if_icmpge -> 4890
    //   4628: iload #17
    //   4630: istore #18
    //   4632: iload #18
    //   4634: aload_0
    //   4635: getfield Zm : I
    //   4638: iload #12
    //   4640: isub
    //   4641: if_icmpgt -> 4883
    //   4644: iconst_5
    //   4645: istore #19
    //   4647: iload #19
    //   4649: ifle -> 4671
    //   4652: aload #16
    //   4654: iload #19
    //   4656: aload #16
    //   4658: iload #19
    //   4660: iconst_1
    //   4661: isub
    //   4662: saload
    //   4663: sastore
    //   4664: iinc #19, -1
    //   4667: iload_1
    //   4668: ifeq -> 4647
    //   4671: aload_0
    //   4672: getfield Zt : [[B
    //   4675: iload #10
    //   4677: aaload
    //   4678: iload #18
    //   4680: bipush #8
    //   4682: idiv
    //   4683: baload
    //   4684: istore #19
    //   4686: iload #18
    //   4688: bipush #8
    //   4690: irem
    //   4691: iload #12
    //   4693: iadd
    //   4694: bipush #8
    //   4696: if_icmple -> 4725
    //   4699: sipush #255
    //   4702: aload_0
    //   4703: getfield Zt : [[B
    //   4706: iload #10
    //   4708: aaload
    //   4709: iload #18
    //   4711: bipush #8
    //   4713: idiv
    //   4714: iconst_1
    //   4715: iadd
    //   4716: baload
    //   4717: iand
    //   4718: goto -> 4726
    //   4721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4724: athrow
    //   4725: iconst_0
    //   4726: istore #20
    //   4728: aload #16
    //   4730: iconst_0
    //   4731: iload #19
    //   4733: bipush #8
    //   4735: ishl
    //   4736: iload #20
    //   4738: ior
    //   4739: bipush #16
    //   4741: iload #12
    //   4743: isub
    //   4744: iload #18
    //   4746: bipush #8
    //   4748: irem
    //   4749: isub
    //   4750: ishr
    //   4751: iload #13
    //   4753: iconst_1
    //   4754: isub
    //   4755: iand
    //   4756: i2s
    //   4757: sastore
    //   4758: iload #18
    //   4760: iload #17
    //   4762: iload #12
    //   4764: iload #11
    //   4766: iconst_1
    //   4767: isub
    //   4768: imul
    //   4769: iadd
    //   4770: if_icmplt -> 4872
    //   4773: aload #15
    //   4775: aload #16
    //   4777: iconst_0
    //   4778: saload
    //   4779: aaload
    //   4780: aload #16
    //   4782: iconst_1
    //   4783: saload
    //   4784: aaload
    //   4785: iload #11
    //   4787: iconst_2
    //   4788: if_icmple -> 4809
    //   4791: goto -> 4798
    //   4794: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4797: athrow
    //   4798: aload #16
    //   4800: iconst_2
    //   4801: saload
    //   4802: goto -> 4810
    //   4805: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4808: athrow
    //   4809: iconst_0
    //   4810: aaload
    //   4811: iload #11
    //   4813: iconst_3
    //   4814: if_icmple -> 4828
    //   4817: aload #16
    //   4819: iconst_3
    //   4820: saload
    //   4821: goto -> 4829
    //   4824: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4827: athrow
    //   4828: iconst_0
    //   4829: aaload
    //   4830: iload #11
    //   4832: iconst_4
    //   4833: if_icmple -> 4847
    //   4836: aload #16
    //   4838: iconst_4
    //   4839: saload
    //   4840: goto -> 4848
    //   4843: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4846: athrow
    //   4847: iconst_0
    //   4848: aaload
    //   4849: iload #11
    //   4851: iconst_5
    //   4852: if_icmple -> 4866
    //   4855: aload #16
    //   4857: iconst_5
    //   4858: saload
    //   4859: goto -> 4867
    //   4862: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4865: athrow
    //   4866: iconst_0
    //   4867: dup2
    //   4868: iaload
    //   4869: iconst_1
    //   4870: iadd
    //   4871: iastore
    //   4872: iload #18
    //   4874: iload #12
    //   4876: iadd
    //   4877: istore #18
    //   4879: iload_1
    //   4880: ifeq -> 4632
    //   4883: iinc #17, 1
    //   4886: iload_1
    //   4887: ifeq -> 4621
    //   4890: aload #9
    //   4892: iload #14
    //   4894: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4897: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4902: checkcast java/util/Map
    //   4905: astore #17
    //   4907: aload #17
    //   4909: ifnonnull -> 4938
    //   4912: aload_0
    //   4913: getfield Zm : I
    //   4916: iload #14
    //   4918: invokestatic ZT : (II)Ljava/util/Map;
    //   4921: astore #17
    //   4923: aload #9
    //   4925: iload #14
    //   4927: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4930: aload #17
    //   4932: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4937: pop
    //   4938: dconst_1
    //   4939: dstore #18
    //   4941: aload #16
    //   4943: iconst_0
    //   4944: iconst_0
    //   4945: sastore
    //   4946: aload #16
    //   4948: iconst_0
    //   4949: saload
    //   4950: iload #13
    //   4952: if_icmpge -> 5492
    //   4955: aload #16
    //   4957: iconst_1
    //   4958: iconst_0
    //   4959: sastore
    //   4960: aload #16
    //   4962: iconst_1
    //   4963: saload
    //   4964: iload #13
    //   4966: if_icmpge -> 5479
    //   4969: aload #16
    //   4971: iconst_2
    //   4972: iconst_0
    //   4973: sastore
    //   4974: aload #16
    //   4976: iconst_2
    //   4977: saload
    //   4978: iload #11
    //   4980: iconst_2
    //   4981: if_icmple -> 4989
    //   4984: iload #13
    //   4986: goto -> 4990
    //   4989: iconst_1
    //   4990: if_icmpge -> 5466
    //   4993: aload #16
    //   4995: iconst_3
    //   4996: iconst_0
    //   4997: sastore
    //   4998: goto -> 5005
    //   5001: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5004: athrow
    //   5005: aload #16
    //   5007: iconst_3
    //   5008: saload
    //   5009: iload #11
    //   5011: iconst_3
    //   5012: if_icmple -> 5020
    //   5015: iload #13
    //   5017: goto -> 5021
    //   5020: iconst_1
    //   5021: if_icmpge -> 5453
    //   5024: aload #16
    //   5026: iconst_4
    //   5027: iconst_0
    //   5028: sastore
    //   5029: goto -> 5036
    //   5032: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5035: athrow
    //   5036: aload #16
    //   5038: iconst_4
    //   5039: saload
    //   5040: iload #11
    //   5042: iconst_4
    //   5043: if_icmple -> 5051
    //   5046: iload #13
    //   5048: goto -> 5052
    //   5051: iconst_1
    //   5052: if_icmpge -> 5440
    //   5055: aload #16
    //   5057: iconst_5
    //   5058: iconst_0
    //   5059: sastore
    //   5060: goto -> 5067
    //   5063: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5066: athrow
    //   5067: aload #16
    //   5069: iconst_5
    //   5070: saload
    //   5071: iload #11
    //   5073: iconst_5
    //   5074: if_icmple -> 5082
    //   5077: iload #13
    //   5079: goto -> 5083
    //   5082: iconst_1
    //   5083: if_icmpge -> 5427
    //   5086: aload #17
    //   5088: aload #15
    //   5090: aload #16
    //   5092: iconst_0
    //   5093: saload
    //   5094: aaload
    //   5095: aload #16
    //   5097: iconst_1
    //   5098: saload
    //   5099: aaload
    //   5100: aload #16
    //   5102: iconst_2
    //   5103: saload
    //   5104: aaload
    //   5105: aload #16
    //   5107: iconst_3
    //   5108: saload
    //   5109: aaload
    //   5110: aload #16
    //   5112: iconst_4
    //   5113: saload
    //   5114: aaload
    //   5115: aload #16
    //   5117: iconst_5
    //   5118: saload
    //   5119: iaload
    //   5120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5123: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5128: checkcast java/lang/Double
    //   5131: astore #20
    //   5133: aload #20
    //   5135: ifnonnull -> 5148
    //   5138: ldc2_w 1.0E-6
    //   5141: goto -> 5153
    //   5144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5147: athrow
    //   5148: aload #20
    //   5150: invokevirtual doubleValue : ()D
    //   5153: dstore #21
    //   5155: ldc2_w 1.0E-6
    //   5158: dload #21
    //   5160: invokestatic max : (DD)D
    //   5163: dstore #21
    //   5165: dload #18
    //   5167: dload #21
    //   5169: dmul
    //   5170: dstore #18
    //   5172: dload #21
    //   5174: ldc2_w 1.0E-4
    //   5177: dcmpg
    //   5178: ifge -> 5414
    //   5181: aload_0
    //   5182: dup
    //   5183: getfield Zd : I
    //   5186: iconst_1
    //   5187: iadd
    //   5188: putfield Zd : I
    //   5191: aload_0
    //   5192: getfield Zd : I
    //   5195: bipush #100
    //   5197: if_icmpgt -> 5414
    //   5200: goto -> 5207
    //   5203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5206: athrow
    //   5207: new burp/Zrmg
    //   5210: dup
    //   5211: iload #10
    //   5213: iload #11
    //   5215: iload #12
    //   5217: aload #16
    //   5219: iconst_0
    //   5220: saload
    //   5221: aload #16
    //   5223: iconst_1
    //   5224: saload
    //   5225: iload #11
    //   5227: iconst_2
    //   5228: if_icmple -> 5254
    //   5231: goto -> 5238
    //   5234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5237: athrow
    //   5238: aload #16
    //   5240: iconst_2
    //   5241: saload
    //   5242: <illegal opcode> makeConcatWithConstants : (S)Ljava/lang/String;
    //   5247: goto -> 5256
    //   5250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5253: athrow
    //   5254: ldc ''
    //   5256: iload #11
    //   5258: iconst_3
    //   5259: if_icmple -> 5274
    //   5262: aload #16
    //   5264: iconst_3
    //   5265: saload
    //   5266: <illegal opcode> makeConcatWithConstants : (S)Ljava/lang/String;
    //   5271: goto -> 5276
    //   5274: ldc ''
    //   5276: iload #11
    //   5278: iconst_4
    //   5279: if_icmple -> 5294
    //   5282: aload #16
    //   5284: iconst_4
    //   5285: saload
    //   5286: <illegal opcode> makeConcatWithConstants : (S)Ljava/lang/String;
    //   5291: goto -> 5296
    //   5294: ldc ''
    //   5296: iload #11
    //   5298: iconst_5
    //   5299: if_icmple -> 5314
    //   5302: aload #16
    //   5304: iconst_5
    //   5305: saload
    //   5306: <illegal opcode> makeConcatWithConstants : (S)Ljava/lang/String;
    //   5311: goto -> 5316
    //   5314: ldc ''
    //   5316: <illegal opcode> makeConcatWithConstants : (SSLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5321: aload #15
    //   5323: aload #16
    //   5325: iconst_0
    //   5326: saload
    //   5327: aaload
    //   5328: aload #16
    //   5330: iconst_1
    //   5331: saload
    //   5332: aaload
    //   5333: aload #16
    //   5335: iconst_2
    //   5336: saload
    //   5337: aaload
    //   5338: aload #16
    //   5340: iconst_3
    //   5341: saload
    //   5342: aaload
    //   5343: aload #16
    //   5345: iconst_4
    //   5346: saload
    //   5347: aaload
    //   5348: aload #16
    //   5350: iconst_5
    //   5351: saload
    //   5352: iaload
    //   5353: dload #21
    //   5355: aload #15
    //   5357: aload #16
    //   5359: iconst_0
    //   5360: saload
    //   5361: aaload
    //   5362: aload #16
    //   5364: iconst_1
    //   5365: saload
    //   5366: aaload
    //   5367: aload #16
    //   5369: iconst_2
    //   5370: saload
    //   5371: aaload
    //   5372: aload #16
    //   5374: iconst_3
    //   5375: saload
    //   5376: aaload
    //   5377: aload #16
    //   5379: iconst_4
    //   5380: saload
    //   5381: aaload
    //   5382: aload #16
    //   5384: iconst_5
    //   5385: saload
    //   5386: iaload
    //   5387: iload #14
    //   5389: if_icmpge -> 5396
    //   5392: iconst_1
    //   5393: goto -> 5397
    //   5396: iconst_0
    //   5397: invokespecial <init> : (IIILjava/lang/String;IDZ)V
    //   5400: astore #23
    //   5402: aload_0
    //   5403: getfield ZHu : Ljava/util/List;
    //   5406: aload #23
    //   5408: invokeinterface add : (Ljava/lang/Object;)Z
    //   5413: pop
    //   5414: aload #16
    //   5416: iconst_5
    //   5417: dup2
    //   5418: saload
    //   5419: iconst_1
    //   5420: iadd
    //   5421: i2s
    //   5422: sastore
    //   5423: iload_1
    //   5424: ifeq -> 5067
    //   5427: aload #16
    //   5429: iconst_4
    //   5430: dup2
    //   5431: saload
    //   5432: iconst_1
    //   5433: iadd
    //   5434: i2s
    //   5435: sastore
    //   5436: iload_1
    //   5437: ifeq -> 5036
    //   5440: aload #16
    //   5442: iconst_3
    //   5443: dup2
    //   5444: saload
    //   5445: iconst_1
    //   5446: iadd
    //   5447: i2s
    //   5448: sastore
    //   5449: iload_1
    //   5450: ifeq -> 5005
    //   5453: aload #16
    //   5455: iconst_2
    //   5456: dup2
    //   5457: saload
    //   5458: iconst_1
    //   5459: iadd
    //   5460: i2s
    //   5461: sastore
    //   5462: iload_1
    //   5463: ifeq -> 4974
    //   5466: aload #16
    //   5468: iconst_1
    //   5469: dup2
    //   5470: saload
    //   5471: iconst_1
    //   5472: iadd
    //   5473: i2s
    //   5474: sastore
    //   5475: iload_1
    //   5476: ifeq -> 4960
    //   5479: aload #16
    //   5481: iconst_0
    //   5482: dup2
    //   5483: saload
    //   5484: iconst_1
    //   5485: iadd
    //   5486: i2s
    //   5487: sastore
    //   5488: iload_1
    //   5489: ifeq -> 4946
    //   5492: dload #18
    //   5494: dconst_1
    //   5495: iload #14
    //   5497: i2d
    //   5498: ddiv
    //   5499: invokestatic pow : (DD)D
    //   5502: dstore #18
    //   5504: dload #18
    //   5506: aload_0
    //   5507: getfield ZE : [D
    //   5510: iload #10
    //   5512: daload
    //   5513: dcmpg
    //   5514: ifge -> 5533
    //   5517: aload_0
    //   5518: getfield ZE : [D
    //   5521: iload #10
    //   5523: dload #18
    //   5525: dastore
    //   5526: goto -> 5533
    //   5529: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5532: athrow
    //   5533: iload #12
    //   5535: iconst_1
    //   5536: iadd
    //   5537: i2b
    //   5538: istore #12
    //   5540: iload_1
    //   5541: ifeq -> 4468
    //   5544: iload #11
    //   5546: iconst_1
    //   5547: iadd
    //   5548: i2b
    //   5549: istore #11
    //   5551: iload_1
    //   5552: ifeq -> 4458
    //   5555: iload #10
    //   5557: iconst_1
    //   5558: iadd
    //   5559: i2s
    //   5560: istore #10
    //   5562: iload_1
    //   5563: ifeq -> 4402
    //   5566: aload_0
    //   5567: getfield Zf : Lburp/Zx_j;
    //   5570: getfield Zx : Z
    //   5573: ifeq -> 5827
    //   5576: aload_0
    //   5577: getfield ZF : Lburp/Zlc8;
    //   5580: iinc #2, 8
    //   5583: iload_2
    //   5584: i2f
    //   5585: sipush #-31488
    //   5588: sipush #2221
    //   5591: invokestatic a : (II)Ljava/lang/String;
    //   5594: invokeinterface Zq : (FLjava/lang/String;)Z
    //   5599: ifne -> 5614
    //   5602: goto -> 5609
    //   5605: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5608: athrow
    //   5609: return
    //   5610: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5613: athrow
    //   5614: aload_0
    //   5615: new java/util/ArrayList
    //   5618: dup
    //   5619: invokespecial <init> : ()V
    //   5622: putfield ZA : Ljava/util/List;
    //   5625: aload_0
    //   5626: aload_0
    //   5627: getfield Zh : I
    //   5630: newarray double
    //   5632: putfield ZQ : [D
    //   5635: iconst_0
    //   5636: istore #9
    //   5638: iload #9
    //   5640: aload_0
    //   5641: getfield Zh : I
    //   5644: if_icmpge -> 5827
    //   5647: aload_0
    //   5648: getfield ZQ : [D
    //   5651: iload #9
    //   5653: aload_0
    //   5654: getfield Zt : [[B
    //   5657: iload #9
    //   5659: aaload
    //   5660: invokestatic ZZ : ([B)D
    //   5663: dastore
    //   5664: aload_0
    //   5665: getfield ZQ : [D
    //   5668: iload #9
    //   5670: daload
    //   5671: dconst_0
    //   5672: dcmpg
    //   5673: ifge -> 5705
    //   5676: iconst_0
    //   5677: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   5680: aload_0
    //   5681: getfield ZQ : [D
    //   5684: iload #9
    //   5686: daload
    //   5687: invokestatic Zp : (ZLnet/portswigger/Zqf;D)V
    //   5690: aload_0
    //   5691: getfield ZQ : [D
    //   5694: iload #9
    //   5696: dconst_0
    //   5697: dastore
    //   5698: goto -> 5705
    //   5701: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5704: athrow
    //   5705: aload_0
    //   5706: getfield ZQ : [D
    //   5709: iload #9
    //   5711: daload
    //   5712: dconst_1
    //   5713: dcmpl
    //   5714: ifle -> 5746
    //   5717: iconst_0
    //   5718: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   5721: aload_0
    //   5722: getfield ZQ : [D
    //   5725: iload #9
    //   5727: daload
    //   5728: invokestatic Zp : (ZLnet/portswigger/Zqf;D)V
    //   5731: aload_0
    //   5732: getfield ZQ : [D
    //   5735: iload #9
    //   5737: dconst_1
    //   5738: dastore
    //   5739: goto -> 5746
    //   5742: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5745: athrow
    //   5746: aload_0
    //   5747: getfield ZQ : [D
    //   5750: iload #9
    //   5752: daload
    //   5753: ldc2_w 0.1
    //   5756: dcmpl
    //   5757: iflt -> 5816
    //   5760: aload_0
    //   5761: dup
    //   5762: getfield ZS : I
    //   5765: iconst_1
    //   5766: iadd
    //   5767: putfield ZS : I
    //   5770: aload_0
    //   5771: getfield ZS : I
    //   5774: bipush #100
    //   5776: if_icmpgt -> 5816
    //   5779: goto -> 5786
    //   5782: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5785: athrow
    //   5786: new burp/Zrmb
    //   5789: dup
    //   5790: iload #9
    //   5792: aload_0
    //   5793: getfield ZQ : [D
    //   5796: iload #9
    //   5798: daload
    //   5799: invokespecial <init> : (ID)V
    //   5802: astore #10
    //   5804: aload_0
    //   5805: getfield ZA : Ljava/util/List;
    //   5808: aload #10
    //   5810: invokeinterface add : (Ljava/lang/Object;)Z
    //   5815: pop
    //   5816: iload #9
    //   5818: iconst_1
    //   5819: iadd
    //   5820: i2s
    //   5821: istore #9
    //   5823: iload_1
    //   5824: ifeq -> 5638
    //   5827: aload_0
    //   5828: aload_0
    //   5829: getfield Zh : I
    //   5832: newarray double
    //   5834: putfield ZD : [D
    //   5837: iconst_0
    //   5838: istore #9
    //   5840: iload #9
    //   5842: aload_0
    //   5843: getfield Zh : I
    //   5846: if_icmpge -> 6423
    //   5849: aload_0
    //   5850: getfield Zf : Lburp/Zx_j;
    //   5853: getfield ZH : Z
    //   5856: ifeq -> 5904
    //   5859: aload_0
    //   5860: getfield Za : [D
    //   5863: iload #9
    //   5865: aload_0
    //   5866: getfield Za : [D
    //   5869: iload #9
    //   5871: daload
    //   5872: dconst_1
    //   5873: invokestatic min : (DD)D
    //   5876: dastore
    //   5877: aload_0
    //   5878: getfield Za : [D
    //   5881: iload #9
    //   5883: aload_0
    //   5884: getfield Za : [D
    //   5887: iload #9
    //   5889: daload
    //   5890: ldc2_w 1.0E-6
    //   5893: invokestatic max : (DD)D
    //   5896: dastore
    //   5897: goto -> 5904
    //   5900: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5903: athrow
    //   5904: aload_0
    //   5905: getfield Zf : Lburp/Zx_j;
    //   5908: getfield Zy : Z
    //   5911: ifeq -> 5959
    //   5914: aload_0
    //   5915: getfield Zg : [D
    //   5918: iload #9
    //   5920: aload_0
    //   5921: getfield Zg : [D
    //   5924: iload #9
    //   5926: daload
    //   5927: dconst_1
    //   5928: invokestatic min : (DD)D
    //   5931: dastore
    //   5932: aload_0
    //   5933: getfield Zg : [D
    //   5936: iload #9
    //   5938: aload_0
    //   5939: getfield Zg : [D
    //   5942: iload #9
    //   5944: daload
    //   5945: ldc2_w 1.0E-6
    //   5948: invokestatic max : (DD)D
    //   5951: dastore
    //   5952: goto -> 5959
    //   5955: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5958: athrow
    //   5959: aload_0
    //   5960: getfield Zf : Lburp/Zx_j;
    //   5963: getfield Zh : Z
    //   5966: ifeq -> 6014
    //   5969: aload_0
    //   5970: getfield Zk : [D
    //   5973: iload #9
    //   5975: aload_0
    //   5976: getfield Zk : [D
    //   5979: iload #9
    //   5981: daload
    //   5982: dconst_1
    //   5983: invokestatic min : (DD)D
    //   5986: dastore
    //   5987: aload_0
    //   5988: getfield Zk : [D
    //   5991: iload #9
    //   5993: aload_0
    //   5994: getfield Zk : [D
    //   5997: iload #9
    //   5999: daload
    //   6000: ldc2_w 1.0E-6
    //   6003: invokestatic max : (DD)D
    //   6006: dastore
    //   6007: goto -> 6014
    //   6010: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6013: athrow
    //   6014: aload_0
    //   6015: getfield Zf : Lburp/Zx_j;
    //   6018: getfield ZM : Z
    //   6021: ifeq -> 6069
    //   6024: aload_0
    //   6025: getfield ZO : [D
    //   6028: iload #9
    //   6030: aload_0
    //   6031: getfield ZO : [D
    //   6034: iload #9
    //   6036: daload
    //   6037: dconst_1
    //   6038: invokestatic min : (DD)D
    //   6041: dastore
    //   6042: aload_0
    //   6043: getfield ZO : [D
    //   6046: iload #9
    //   6048: aload_0
    //   6049: getfield ZO : [D
    //   6052: iload #9
    //   6054: daload
    //   6055: ldc2_w 1.0E-6
    //   6058: invokestatic max : (DD)D
    //   6061: dastore
    //   6062: goto -> 6069
    //   6065: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6068: athrow
    //   6069: aload_0
    //   6070: getfield Zf : Lburp/Zx_j;
    //   6073: getfield ZA : Z
    //   6076: ifeq -> 6124
    //   6079: aload_0
    //   6080: getfield ZE : [D
    //   6083: iload #9
    //   6085: aload_0
    //   6086: getfield ZE : [D
    //   6089: iload #9
    //   6091: daload
    //   6092: dconst_1
    //   6093: invokestatic min : (DD)D
    //   6096: dastore
    //   6097: aload_0
    //   6098: getfield ZE : [D
    //   6101: iload #9
    //   6103: aload_0
    //   6104: getfield ZE : [D
    //   6107: iload #9
    //   6109: daload
    //   6110: ldc2_w 1.0E-6
    //   6113: invokestatic max : (DD)D
    //   6116: dastore
    //   6117: goto -> 6124
    //   6120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6123: athrow
    //   6124: aload_0
    //   6125: getfield ZD : [D
    //   6128: iload #9
    //   6130: dconst_1
    //   6131: dastore
    //   6132: aload_0
    //   6133: getfield Zf : Lburp/Zx_j;
    //   6136: getfield ZH : Z
    //   6139: ifeq -> 6188
    //   6142: aload_0
    //   6143: getfield Za : [D
    //   6146: iload #9
    //   6148: daload
    //   6149: aload_0
    //   6150: getfield ZD : [D
    //   6153: iload #9
    //   6155: daload
    //   6156: dcmpg
    //   6157: ifge -> 6188
    //   6160: goto -> 6167
    //   6163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6166: athrow
    //   6167: aload_0
    //   6168: getfield ZD : [D
    //   6171: iload #9
    //   6173: aload_0
    //   6174: getfield Za : [D
    //   6177: iload #9
    //   6179: daload
    //   6180: dastore
    //   6181: goto -> 6188
    //   6184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6187: athrow
    //   6188: aload_0
    //   6189: getfield Zf : Lburp/Zx_j;
    //   6192: getfield Zy : Z
    //   6195: ifeq -> 6244
    //   6198: aload_0
    //   6199: getfield Zg : [D
    //   6202: iload #9
    //   6204: daload
    //   6205: aload_0
    //   6206: getfield ZD : [D
    //   6209: iload #9
    //   6211: daload
    //   6212: dcmpg
    //   6213: ifge -> 6244
    //   6216: goto -> 6223
    //   6219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6222: athrow
    //   6223: aload_0
    //   6224: getfield ZD : [D
    //   6227: iload #9
    //   6229: aload_0
    //   6230: getfield Zg : [D
    //   6233: iload #9
    //   6235: daload
    //   6236: dastore
    //   6237: goto -> 6244
    //   6240: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6243: athrow
    //   6244: aload_0
    //   6245: getfield Zf : Lburp/Zx_j;
    //   6248: getfield Zh : Z
    //   6251: ifeq -> 6300
    //   6254: aload_0
    //   6255: getfield Zk : [D
    //   6258: iload #9
    //   6260: daload
    //   6261: aload_0
    //   6262: getfield ZD : [D
    //   6265: iload #9
    //   6267: daload
    //   6268: dcmpg
    //   6269: ifge -> 6300
    //   6272: goto -> 6279
    //   6275: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6278: athrow
    //   6279: aload_0
    //   6280: getfield ZD : [D
    //   6283: iload #9
    //   6285: aload_0
    //   6286: getfield Zk : [D
    //   6289: iload #9
    //   6291: daload
    //   6292: dastore
    //   6293: goto -> 6300
    //   6296: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6299: athrow
    //   6300: aload_0
    //   6301: getfield Zf : Lburp/Zx_j;
    //   6304: getfield ZM : Z
    //   6307: ifeq -> 6356
    //   6310: aload_0
    //   6311: getfield ZO : [D
    //   6314: iload #9
    //   6316: daload
    //   6317: aload_0
    //   6318: getfield ZD : [D
    //   6321: iload #9
    //   6323: daload
    //   6324: dcmpg
    //   6325: ifge -> 6356
    //   6328: goto -> 6335
    //   6331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6334: athrow
    //   6335: aload_0
    //   6336: getfield ZD : [D
    //   6339: iload #9
    //   6341: aload_0
    //   6342: getfield ZO : [D
    //   6345: iload #9
    //   6347: daload
    //   6348: dastore
    //   6349: goto -> 6356
    //   6352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6355: athrow
    //   6356: aload_0
    //   6357: getfield Zf : Lburp/Zx_j;
    //   6360: getfield ZA : Z
    //   6363: ifeq -> 6412
    //   6366: aload_0
    //   6367: getfield ZE : [D
    //   6370: iload #9
    //   6372: daload
    //   6373: aload_0
    //   6374: getfield ZD : [D
    //   6377: iload #9
    //   6379: daload
    //   6380: dcmpg
    //   6381: ifge -> 6412
    //   6384: goto -> 6391
    //   6387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6390: athrow
    //   6391: aload_0
    //   6392: getfield ZD : [D
    //   6395: iload #9
    //   6397: aload_0
    //   6398: getfield ZE : [D
    //   6401: iload #9
    //   6403: daload
    //   6404: dastore
    //   6405: goto -> 6412
    //   6408: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6411: athrow
    //   6412: iload #9
    //   6414: iconst_1
    //   6415: iadd
    //   6416: i2s
    //   6417: istore #9
    //   6419: iload_1
    //   6420: ifeq -> 5840
    //   6423: aload_0
    //   6424: getfield Zf : Lburp/Zx_j;
    //   6427: getfield Za : Z
    //   6430: ifeq -> 6966
    //   6433: aload_0
    //   6434: getfield ZF : Lburp/Zlc8;
    //   6437: iinc #2, 8
    //   6440: iload_2
    //   6441: i2f
    //   6442: sipush #-31485
    //   6445: sipush #21398
    //   6448: invokestatic a : (II)Ljava/lang/String;
    //   6451: invokeinterface Zq : (FLjava/lang/String;)Z
    //   6456: ifne -> 6471
    //   6459: goto -> 6466
    //   6462: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6465: athrow
    //   6466: return
    //   6467: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6470: athrow
    //   6471: aload_0
    //   6472: aload_0
    //   6473: getfield Zh : I
    //   6476: newarray double
    //   6478: putfield Ze : [D
    //   6481: aload_0
    //   6482: new java/util/ArrayList
    //   6485: dup
    //   6486: invokespecial <init> : ()V
    //   6489: putfield Zc : Ljava/util/List;
    //   6492: iconst_0
    //   6493: istore #9
    //   6495: iload #9
    //   6497: aload_0
    //   6498: getfield Zh : I
    //   6501: if_icmpge -> 6523
    //   6504: aload_0
    //   6505: getfield Ze : [D
    //   6508: iload #9
    //   6510: dconst_1
    //   6511: dastore
    //   6512: iload #9
    //   6514: iconst_1
    //   6515: iadd
    //   6516: i2s
    //   6517: istore #9
    //   6519: iload_1
    //   6520: ifeq -> 6495
    //   6523: iconst_0
    //   6524: istore #9
    //   6526: iload #9
    //   6528: aload_0
    //   6529: getfield Zh : I
    //   6532: if_icmpge -> 6966
    //   6535: aload_0
    //   6536: getfield ZF : Lburp/Zlc8;
    //   6539: iload_2
    //   6540: i2f
    //   6541: iload #9
    //   6543: sipush #-31474
    //   6546: sipush #29772
    //   6549: invokestatic a : (II)Ljava/lang/String;
    //   6552: swap
    //   6553: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;S)Ljava/lang/String;
    //   6558: invokeinterface Zq : (FLjava/lang/String;)Z
    //   6563: ifne -> 6571
    //   6566: return
    //   6567: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6570: athrow
    //   6571: iload #9
    //   6573: iconst_1
    //   6574: iadd
    //   6575: i2s
    //   6576: istore #10
    //   6578: iload #10
    //   6580: aload_0
    //   6581: getfield Zh : I
    //   6584: if_icmpge -> 6955
    //   6587: iconst_0
    //   6588: istore #11
    //   6590: iconst_0
    //   6591: istore #12
    //   6593: iload #12
    //   6595: aload_0
    //   6596: getfield Zm : I
    //   6599: if_icmpge -> 6704
    //   6602: sipush #255
    //   6605: aload_0
    //   6606: getfield Zt : [[B
    //   6609: iload #9
    //   6611: aaload
    //   6612: iload #12
    //   6614: bipush #8
    //   6616: idiv
    //   6617: baload
    //   6618: iand
    //   6619: iconst_1
    //   6620: iload #12
    //   6622: bipush #8
    //   6624: irem
    //   6625: ishl
    //   6626: iand
    //   6627: ifeq -> 6638
    //   6630: iconst_1
    //   6631: goto -> 6639
    //   6634: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6637: athrow
    //   6638: iconst_0
    //   6639: istore #13
    //   6641: sipush #255
    //   6644: aload_0
    //   6645: getfield Zt : [[B
    //   6648: iload #10
    //   6650: aaload
    //   6651: iload #12
    //   6653: bipush #8
    //   6655: idiv
    //   6656: baload
    //   6657: iand
    //   6658: iconst_1
    //   6659: iload #12
    //   6661: bipush #8
    //   6663: irem
    //   6664: ishl
    //   6665: iand
    //   6666: ifeq -> 6677
    //   6669: iconst_1
    //   6670: goto -> 6678
    //   6673: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6676: athrow
    //   6677: iconst_0
    //   6678: istore #14
    //   6680: iload #13
    //   6682: iload #14
    //   6684: if_icmpne -> 6697
    //   6687: iinc #11, 1
    //   6690: goto -> 6697
    //   6693: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6696: athrow
    //   6697: iinc #12, 1
    //   6700: iload_1
    //   6701: ifeq -> 6593
    //   6704: iload #11
    //   6706: aload_0
    //   6707: getfield Zm : I
    //   6710: iconst_2
    //   6711: idiv
    //   6712: isub
    //   6713: iconst_2
    //   6714: idiv
    //   6715: aload_0
    //   6716: getfield Zm : I
    //   6719: iconst_2
    //   6720: idiv
    //   6721: iadd
    //   6722: istore #12
    //   6724: iconst_2
    //   6725: aload_0
    //   6726: getfield Zm : I
    //   6729: iload #12
    //   6731: invokestatic Zn : (BII)D
    //   6734: dstore #13
    //   6736: dload #13
    //   6738: aload_0
    //   6739: getfield Ze : [D
    //   6742: iload #9
    //   6744: daload
    //   6745: dcmpg
    //   6746: iflt -> 6769
    //   6749: dload #13
    //   6751: aload_0
    //   6752: getfield Ze : [D
    //   6755: iload #10
    //   6757: daload
    //   6758: dcmpg
    //   6759: ifge -> 6853
    //   6762: goto -> 6769
    //   6765: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6768: athrow
    //   6769: iload #9
    //   6771: istore #15
    //   6773: aload_0
    //   6774: getfield ZD : [D
    //   6777: iload #10
    //   6779: daload
    //   6780: aload_0
    //   6781: getfield ZD : [D
    //   6784: iload #9
    //   6786: daload
    //   6787: dcmpg
    //   6788: ifge -> 6795
    //   6791: iload #10
    //   6793: istore #15
    //   6795: dload #13
    //   6797: aload_0
    //   6798: getfield Ze : [D
    //   6801: iload #15
    //   6803: daload
    //   6804: dcmpg
    //   6805: ifge -> 6824
    //   6808: aload_0
    //   6809: getfield Ze : [D
    //   6812: iload #15
    //   6814: dload #13
    //   6816: dastore
    //   6817: goto -> 6824
    //   6820: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6823: athrow
    //   6824: dload #13
    //   6826: aload_0
    //   6827: getfield ZD : [D
    //   6830: iload #15
    //   6832: daload
    //   6833: dcmpg
    //   6834: ifge -> 6853
    //   6837: aload_0
    //   6838: getfield ZD : [D
    //   6841: iload #15
    //   6843: dload #13
    //   6845: dastore
    //   6846: goto -> 6853
    //   6849: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6852: athrow
    //   6853: dload #13
    //   6855: ldc2_w 1.0E-4
    //   6858: dcmpg
    //   6859: ifgt -> 6944
    //   6862: aload_0
    //   6863: dup
    //   6864: getfield ZHR : I
    //   6867: iconst_1
    //   6868: iadd
    //   6869: putfield ZHR : I
    //   6872: aload_0
    //   6873: getfield ZHR : I
    //   6876: bipush #100
    //   6878: if_icmpgt -> 6944
    //   6881: goto -> 6888
    //   6884: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6887: athrow
    //   6888: new burp/Zrme
    //   6891: dup
    //   6892: iload #9
    //   6894: iload #10
    //   6896: iload #11
    //   6898: dload #13
    //   6900: iload #11
    //   6902: aload_0
    //   6903: getfield Zm : I
    //   6906: iconst_2
    //   6907: idiv
    //   6908: if_icmple -> 6926
    //   6911: goto -> 6918
    //   6914: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6917: athrow
    //   6918: iconst_1
    //   6919: goto -> 6927
    //   6922: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6925: athrow
    //   6926: iconst_0
    //   6927: invokespecial <init> : (IIIDZ)V
    //   6930: astore #15
    //   6932: aload_0
    //   6933: getfield Zc : Ljava/util/List;
    //   6936: aload #15
    //   6938: invokeinterface add : (Ljava/lang/Object;)Z
    //   6943: pop
    //   6944: iload #10
    //   6946: iconst_1
    //   6947: iadd
    //   6948: i2s
    //   6949: istore #10
    //   6951: iload_1
    //   6952: ifeq -> 6578
    //   6955: iload #9
    //   6957: iconst_1
    //   6958: iadd
    //   6959: i2s
    //   6960: istore #9
    //   6962: iload_1
    //   6963: ifeq -> 6526
    //   6966: aload_0
    //   6967: iconst_5
    //   6968: newarray double
    //   6970: putfield Zn : [D
    //   6973: iconst_0
    //   6974: istore #9
    //   6976: iload #9
    //   6978: aload_0
    //   6979: getfield Zh : I
    //   6982: if_icmpge -> 7157
    //   6985: dconst_1
    //   6986: dstore #10
    //   6988: aload_0
    //   6989: getfield Zo : Ljava/util/Map;
    //   6992: iload #9
    //   6994: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6997: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7002: checkcast java/lang/Double
    //   7005: astore #12
    //   7007: aload #12
    //   7009: ifnonnull -> 7020
    //   7012: dconst_1
    //   7013: goto -> 7025
    //   7016: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7019: athrow
    //   7020: aload #12
    //   7022: invokevirtual doubleValue : ()D
    //   7025: dstore #10
    //   7027: ldc2_w 5.0
    //   7030: aload_0
    //   7031: getfield ZD : [D
    //   7034: iload #9
    //   7036: daload
    //   7037: invokestatic log10 : (D)D
    //   7040: dadd
    //   7041: d2i
    //   7042: istore #12
    //   7044: iload #12
    //   7046: tableswitch default -> 7146, 0 -> 7135, 1 -> 7124, 2 -> 7113, 3 -> 7102, 4 -> 7084, 5 -> 7084
    //   7084: aload_0
    //   7085: getfield Zn : [D
    //   7088: iconst_4
    //   7089: dup2
    //   7090: daload
    //   7091: dload #10
    //   7093: dadd
    //   7094: dastore
    //   7095: goto -> 7102
    //   7098: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7101: athrow
    //   7102: aload_0
    //   7103: getfield Zn : [D
    //   7106: iconst_3
    //   7107: dup2
    //   7108: daload
    //   7109: dload #10
    //   7111: dadd
    //   7112: dastore
    //   7113: aload_0
    //   7114: getfield Zn : [D
    //   7117: iconst_2
    //   7118: dup2
    //   7119: daload
    //   7120: dload #10
    //   7122: dadd
    //   7123: dastore
    //   7124: aload_0
    //   7125: getfield Zn : [D
    //   7128: iconst_1
    //   7129: dup2
    //   7130: daload
    //   7131: dload #10
    //   7133: dadd
    //   7134: dastore
    //   7135: aload_0
    //   7136: getfield Zn : [D
    //   7139: iconst_0
    //   7140: dup2
    //   7141: daload
    //   7142: dload #10
    //   7144: dadd
    //   7145: dastore
    //   7146: iload #9
    //   7148: iconst_1
    //   7149: iadd
    //   7150: i2s
    //   7151: istore #9
    //   7153: iload_1
    //   7154: ifeq -> 6976
    //   7157: aload_0
    //   7158: iconst_5
    //   7159: newarray double
    //   7161: putfield Zz : [D
    //   7164: iconst_0
    //   7165: istore #9
    //   7167: iload #9
    //   7169: aload_0
    //   7170: getfield Zz : [D
    //   7173: arraylength
    //   7174: if_icmpge -> 7327
    //   7177: iload #5
    //   7179: ifeq -> 7228
    //   7182: iload_3
    //   7183: ifeq -> 7228
    //   7186: goto -> 7193
    //   7189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7192: athrow
    //   7193: aload_0
    //   7194: getfield Zz : [D
    //   7197: iload #9
    //   7199: aload_0
    //   7200: getfield ZZ : [D
    //   7203: iload #9
    //   7205: daload
    //   7206: aload_0
    //   7207: getfield Zn : [D
    //   7210: iload #9
    //   7212: daload
    //   7213: invokestatic min : (DD)D
    //   7216: dastore
    //   7217: iload_1
    //   7218: ifeq -> 7320
    //   7221: goto -> 7228
    //   7224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7227: athrow
    //   7228: iload #5
    //   7230: ifne -> 7276
    //   7233: goto -> 7240
    //   7236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7239: athrow
    //   7240: iload_3
    //   7241: ifeq -> 7276
    //   7244: goto -> 7251
    //   7247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7250: athrow
    //   7251: aload_0
    //   7252: getfield Zz : [D
    //   7255: iload #9
    //   7257: aload_0
    //   7258: getfield Zn : [D
    //   7261: iload #9
    //   7263: daload
    //   7264: dastore
    //   7265: iload_1
    //   7266: ifeq -> 7320
    //   7269: goto -> 7276
    //   7272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7275: athrow
    //   7276: iload #5
    //   7278: ifeq -> 7320
    //   7281: goto -> 7288
    //   7284: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7287: athrow
    //   7288: iload_3
    //   7289: ifne -> 7320
    //   7292: goto -> 7299
    //   7295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7298: athrow
    //   7299: aload_0
    //   7300: getfield Zz : [D
    //   7303: iload #9
    //   7305: aload_0
    //   7306: getfield ZZ : [D
    //   7309: iload #9
    //   7311: daload
    //   7312: dastore
    //   7313: goto -> 7320
    //   7316: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   7319: athrow
    //   7320: iinc #9, 1
    //   7323: iload_1
    //   7324: ifeq -> 7167
    //   7327: aload_0
    //   7328: new burp/Zgt3
    //   7331: dup
    //   7332: invokespecial <init> : ()V
    //   7335: putfield ZG : Lburp/Zgt3;
    //   7338: aload_0
    //   7339: getfield ZG : Lburp/Zgt3;
    //   7342: aload_0
    //   7343: getfield Zm : I
    //   7346: putfield ZU : I
    //   7349: aload_0
    //   7350: getfield ZG : Lburp/Zgt3;
    //   7353: aload_0
    //   7354: getfield ZK : I
    //   7357: putfield ZJ : I
    //   7360: aload_0
    //   7361: getfield ZG : Lburp/Zgt3;
    //   7364: aload_0
    //   7365: getfield ZH : I
    //   7368: putfield ZZ : I
    //   7371: aload_0
    //   7372: getfield ZG : Lburp/Zgt3;
    //   7375: aload_0
    //   7376: getfield ZP : I
    //   7379: putfield Zk : I
    //   7382: aload_0
    //   7383: getfield ZG : Lburp/Zgt3;
    //   7386: aload_0
    //   7387: getfield Zz : [D
    //   7390: putfield Zm : [D
    //   7393: aload_0
    //   7394: getfield ZG : Lburp/Zgt3;
    //   7397: aload_0
    //   7398: getfield ZN : [S
    //   7401: arraylength
    //   7402: newarray double
    //   7404: putfield ZI : [D
    //   7407: iconst_0
    //   7408: istore #9
    //   7410: iload #9
    //   7412: aload_0
    //   7413: getfield ZN : [S
    //   7416: arraylength
    //   7417: if_icmpge -> 7445
    //   7420: aload_0
    //   7421: getfield ZG : Lburp/Zgt3;
    //   7424: getfield ZI : [D
    //   7427: iload #9
    //   7429: aload_0
    //   7430: getfield ZN : [S
    //   7433: iload #9
    //   7435: saload
    //   7436: i2d
    //   7437: dastore
    //   7438: iinc #9, 1
    //   7441: iload_1
    //   7442: ifeq -> 7410
    //   7445: aload_0
    //   7446: getfield ZG : Lburp/Zgt3;
    //   7449: aload_0
    //   7450: getfield Zq : [D
    //   7453: putfield ZM : [D
    //   7456: aload_0
    //   7457: getfield ZG : Lburp/Zgt3;
    //   7460: aload_0
    //   7461: getfield Zb : D
    //   7464: putfield ZD : D
    //   7467: aload_0
    //   7468: getfield ZG : Lburp/Zgt3;
    //   7471: aload_0
    //   7472: getfield Zw : [D
    //   7475: putfield Zb : [D
    //   7478: aload_0
    //   7479: getfield ZG : Lburp/Zgt3;
    //   7482: aload_0
    //   7483: getfield ZZ : [D
    //   7486: putfield ZQ : [D
    //   7489: aload_0
    //   7490: getfield ZG : Lburp/Zgt3;
    //   7493: aload_0
    //   7494: getfield Zp : [D
    //   7497: putfield Za : [D
    //   7500: aload_0
    //   7501: getfield ZG : Lburp/Zgt3;
    //   7504: aload_0
    //   7505: getfield Zy : [D
    //   7508: putfield ZF : [D
    //   7511: aload_0
    //   7512: getfield ZG : Lburp/Zgt3;
    //   7515: aload_0
    //   7516: getfield ZB : Ljava/util/List;
    //   7519: putfield ZK : Ljava/util/List;
    //   7522: aload_0
    //   7523: getfield ZG : Lburp/Zgt3;
    //   7526: aload_0
    //   7527: getfield ZT : I
    //   7530: putfield Zq : I
    //   7533: aload_0
    //   7534: getfield ZG : Lburp/Zgt3;
    //   7537: aload_0
    //   7538: getfield Z_ : Ljava/util/List;
    //   7541: putfield ZS : Ljava/util/List;
    //   7544: aload_0
    //   7545: getfield ZG : Lburp/Zgt3;
    //   7548: aload_0
    //   7549: getfield Zs : I
    //   7552: putfield ZG : I
    //   7555: aload_0
    //   7556: getfield ZG : Lburp/Zgt3;
    //   7559: aload_0
    //   7560: getfield ZW : [B
    //   7563: arraylength
    //   7564: newarray double
    //   7566: putfield Zs : [D
    //   7569: iconst_0
    //   7570: istore #9
    //   7572: iload #9
    //   7574: aload_0
    //   7575: getfield ZW : [B
    //   7578: arraylength
    //   7579: if_icmpge -> 7607
    //   7582: aload_0
    //   7583: getfield ZG : Lburp/Zgt3;
    //   7586: getfield Zs : [D
    //   7589: iload #9
    //   7591: aload_0
    //   7592: getfield ZW : [B
    //   7595: iload #9
    //   7597: baload
    //   7598: i2d
    //   7599: dastore
    //   7600: iinc #9, 1
    //   7603: iload_1
    //   7604: ifeq -> 7572
    //   7607: aload_0
    //   7608: getfield ZG : Lburp/Zgt3;
    //   7611: aload_0
    //   7612: getfield Zh : I
    //   7615: putfield ZY : I
    //   7618: aload_0
    //   7619: getfield ZG : Lburp/Zgt3;
    //   7622: aload_0
    //   7623: getfield Za : [D
    //   7626: putfield ZO : [D
    //   7629: aload_0
    //   7630: getfield ZG : Lburp/Zgt3;
    //   7633: aload_0
    //   7634: getfield Zg : [D
    //   7637: putfield Zh : [D
    //   7640: aload_0
    //   7641: getfield ZG : Lburp/Zgt3;
    //   7644: aload_0
    //   7645: getfield Zk : [D
    //   7648: putfield ZP : [D
    //   7651: aload_0
    //   7652: getfield ZG : Lburp/Zgt3;
    //   7655: aload_0
    //   7656: getfield ZO : [D
    //   7659: putfield Zt : [D
    //   7662: aload_0
    //   7663: getfield ZG : Lburp/Zgt3;
    //   7666: aload_0
    //   7667: getfield ZL : Ljava/util/List;
    //   7670: putfield Zj : Ljava/util/List;
    //   7673: aload_0
    //   7674: getfield ZG : Lburp/Zgt3;
    //   7677: aload_0
    //   7678: getfield Zv : Ljava/util/List;
    //   7681: putfield Zc : Ljava/util/List;
    //   7684: aload_0
    //   7685: getfield ZG : Lburp/Zgt3;
    //   7688: aload_0
    //   7689: getfield ZY : Ljava/util/List;
    //   7692: putfield Zp : Ljava/util/List;
    //   7695: aload_0
    //   7696: getfield ZG : Lburp/Zgt3;
    //   7699: aload_0
    //   7700: getfield ZR : Ljava/util/List;
    //   7703: putfield Zy : Ljava/util/List;
    //   7706: aload_0
    //   7707: getfield ZG : Lburp/Zgt3;
    //   7710: aload_0
    //   7711: getfield Zl : I
    //   7714: putfield ZC : I
    //   7717: aload_0
    //   7718: getfield ZG : Lburp/Zgt3;
    //   7721: aload_0
    //   7722: getfield Zu : I
    //   7725: putfield Ze : I
    //   7728: aload_0
    //   7729: getfield ZG : Lburp/Zgt3;
    //   7732: aload_0
    //   7733: getfield ZJ : I
    //   7736: putfield Zu : I
    //   7739: aload_0
    //   7740: getfield ZG : Lburp/Zgt3;
    //   7743: aload_0
    //   7744: getfield Zi : I
    //   7747: putfield ZB : I
    //   7750: aload_0
    //   7751: getfield ZG : Lburp/Zgt3;
    //   7754: aload_0
    //   7755: getfield ZU : [Z
    //   7758: putfield ZE : [Z
    //   7761: aload_0
    //   7762: getfield ZG : Lburp/Zgt3;
    //   7765: aload_0
    //   7766: getfield ZX : [Z
    //   7769: putfield Z_ : [Z
    //   7772: aload_0
    //   7773: getfield ZG : Lburp/Zgt3;
    //   7776: aload_0
    //   7777: getfield ZI : [Z
    //   7780: putfield Zd : [Z
    //   7783: aload_0
    //   7784: getfield ZG : Lburp/Zgt3;
    //   7787: aload_0
    //   7788: getfield ZM : [Z
    //   7791: putfield ZT : [Z
    //   7794: aload_0
    //   7795: getfield ZG : Lburp/Zgt3;
    //   7798: aload_0
    //   7799: getfield ZE : [D
    //   7802: putfield Zf : [D
    //   7805: aload_0
    //   7806: getfield ZG : Lburp/Zgt3;
    //   7809: aload_0
    //   7810: getfield ZHu : Ljava/util/List;
    //   7813: putfield ZH : Ljava/util/List;
    //   7816: aload_0
    //   7817: getfield ZG : Lburp/Zgt3;
    //   7820: aload_0
    //   7821: getfield Zd : I
    //   7824: putfield ZV : I
    //   7827: aload_0
    //   7828: getfield ZG : Lburp/Zgt3;
    //   7831: aload_0
    //   7832: getfield Ze : [D
    //   7835: putfield Zw : [D
    //   7838: aload_0
    //   7839: getfield ZG : Lburp/Zgt3;
    //   7842: aload_0
    //   7843: getfield Zc : Ljava/util/List;
    //   7846: putfield Zz : Ljava/util/List;
    //   7849: aload_0
    //   7850: getfield ZG : Lburp/Zgt3;
    //   7853: aload_0
    //   7854: getfield ZHR : I
    //   7857: putfield Zx : I
    //   7860: aload_0
    //   7861: getfield ZG : Lburp/Zgt3;
    //   7864: aload_0
    //   7865: getfield ZA : Ljava/util/List;
    //   7868: putfield Zo : Ljava/util/List;
    //   7871: aload_0
    //   7872: getfield ZG : Lburp/Zgt3;
    //   7875: aload_0
    //   7876: getfield ZS : I
    //   7879: putfield ZR : I
    //   7882: aload_0
    //   7883: getfield ZG : Lburp/Zgt3;
    //   7886: aload_0
    //   7887: getfield ZD : [D
    //   7890: putfield Zn : [D
    //   7893: aload_0
    //   7894: getfield ZG : Lburp/Zgt3;
    //   7897: aload_0
    //   7898: getfield Zn : [D
    //   7901: putfield ZL : [D
    //   7904: aload_0
    //   7905: getfield ZG : Lburp/Zgt3;
    //   7908: aload_0
    //   7909: getfield ZQ : [D
    //   7912: putfield ZN : [D
    //   7915: return
    // Exception table:
    //   from	to	target	type
    //   15	42	42	java/lang/Exception
    //   124	141	144	java/lang/Exception
    //   194	209	212	java/lang/Exception
    //   216	231	234	java/lang/Exception
    //   267	279	279	java/lang/Exception
    //   430	457	457	java/lang/Exception
    //   630	659	662	java/lang/Exception
    //   893	921	924	java/lang/Exception
    //   911	949	952	java/lang/Exception
    //   956	987	990	java/lang/Exception
    //   994	1038	1038	java/lang/Exception
    //   1054	1068	1068	java/lang/Exception
    //   1072	1104	1104	java/lang/Exception
    //   1161	1183	1186	java/lang/Exception
    //   1272	1283	1283	java/lang/Exception
    //   1294	1312	1315	java/lang/Exception
    //   1303	1335	1338	java/lang/Exception
    //   1347	1387	1390	java/lang/Exception
    //   1368	1433	1436	java/lang/Exception
    //   1394	1444	1444	java/lang/Exception
    //   1688	1699	1699	java/lang/Exception
    //   1710	1731	1734	java/lang/Exception
    //   1722	1758	1761	java/lang/Exception
    //   1777	1805	1808	java/lang/Exception
    //   1786	1868	1871	java/lang/Exception
    //   1812	1879	1879	java/lang/Exception
    //   1986	2034	2037	java/lang/Exception
    //   2041	2089	2092	java/lang/Exception
    //   2096	2132	2135	java/lang/Exception
    //   2114	2153	2156	java/lang/Exception
    //   2160	2188	2191	java/lang/Exception
    //   2170	2209	2212	java/lang/Exception
    //   2233	2284	2287	java/lang/Exception
    //   2466	2514	2517	java/lang/Exception
    //   2621	2650	2653	java/lang/Exception
    //   2763	2800	2803	java/lang/Exception
    //   2839	2875	2878	java/lang/Exception
    //   2849	2883	2883	java/lang/Exception
    //   2945	2972	2975	java/lang/Exception
    //   2986	3037	3040	java/lang/Exception
    //   3018	3070	3073	java/lang/Exception
    //   3044	3081	3081	java/lang/Exception
    //   3139	3175	3178	java/lang/Exception
    //   3149	3183	3183	java/lang/Exception
    //   3366	3411	3414	java/lang/Exception
    //   3392	3442	3445	java/lang/Exception
    //   3418	3453	3453	java/lang/Exception
    //   3511	3547	3550	java/lang/Exception
    //   3521	3555	3555	java/lang/Exception
    //   3626	3658	3658	java/lang/Exception
    //   3663	3678	3681	java/lang/Exception
    //   3669	3690	3690	java/lang/Exception
    //   3711	3718	3721	java/lang/Exception
    //   3776	3804	3807	java/lang/Exception
    //   3837	3866	3866	java/lang/Exception
    //   3908	3921	3924	java/lang/Exception
    //   3928	3950	3953	java/lang/Exception
    //   3975	4011	4014	java/lang/Exception
    //   3985	4019	4019	java/lang/Exception
    //   4087	4119	4119	java/lang/Exception
    //   4140	4147	4150	java/lang/Exception
    //   4172	4223	4226	java/lang/Exception
    //   4204	4252	4255	java/lang/Exception
    //   4230	4263	4263	java/lang/Exception
    //   4321	4357	4360	java/lang/Exception
    //   4331	4365	4365	java/lang/Exception
    //   4411	4443	4443	java/lang/Exception
    //   4474	4487	4490	java/lang/Exception
    //   4480	4497	4497	java/lang/Exception
    //   4519	4534	4534	java/lang/Exception
    //   4538	4553	4553	java/lang/Exception
    //   4558	4569	4569	java/lang/Exception
    //   4574	4585	4585	java/lang/Exception
    //   4590	4601	4601	java/lang/Exception
    //   4686	4721	4721	java/lang/Exception
    //   4728	4791	4794	java/lang/Exception
    //   4773	4805	4805	java/lang/Exception
    //   4810	4824	4824	java/lang/Exception
    //   4829	4843	4843	java/lang/Exception
    //   4848	4862	4862	java/lang/Exception
    //   4990	4998	5001	java/lang/Exception
    //   5021	5029	5032	java/lang/Exception
    //   5052	5060	5063	java/lang/Exception
    //   5133	5144	5144	java/lang/Exception
    //   5172	5200	5203	java/lang/Exception
    //   5181	5231	5234	java/lang/Exception
    //   5207	5250	5250	java/lang/Exception
    //   5504	5526	5529	java/lang/Exception
    //   5566	5602	5605	java/lang/Exception
    //   5576	5610	5610	java/lang/Exception
    //   5647	5698	5701	java/lang/Exception
    //   5705	5739	5742	java/lang/Exception
    //   5746	5779	5782	java/lang/Exception
    //   5849	5897	5900	java/lang/Exception
    //   5904	5952	5955	java/lang/Exception
    //   5959	6007	6010	java/lang/Exception
    //   6014	6062	6065	java/lang/Exception
    //   6069	6117	6120	java/lang/Exception
    //   6124	6160	6163	java/lang/Exception
    //   6142	6181	6184	java/lang/Exception
    //   6188	6216	6219	java/lang/Exception
    //   6198	6237	6240	java/lang/Exception
    //   6244	6272	6275	java/lang/Exception
    //   6254	6293	6296	java/lang/Exception
    //   6300	6328	6331	java/lang/Exception
    //   6310	6349	6352	java/lang/Exception
    //   6356	6384	6387	java/lang/Exception
    //   6366	6405	6408	java/lang/Exception
    //   6423	6459	6462	java/lang/Exception
    //   6433	6467	6467	java/lang/Exception
    //   6535	6567	6567	java/lang/Exception
    //   6602	6634	6634	java/lang/Exception
    //   6641	6673	6673	java/lang/Exception
    //   6680	6690	6693	java/lang/Exception
    //   6736	6762	6765	java/lang/Exception
    //   6795	6817	6820	java/lang/Exception
    //   6824	6846	6849	java/lang/Exception
    //   6853	6881	6884	java/lang/Exception
    //   6862	6911	6914	java/lang/Exception
    //   6888	6922	6922	java/lang/Exception
    //   7007	7016	7016	java/lang/Exception
    //   7044	7095	7098	java/lang/Exception
    //   7177	7186	7189	java/lang/Exception
    //   7182	7221	7224	java/lang/Exception
    //   7193	7233	7236	java/lang/Exception
    //   7228	7244	7247	java/lang/Exception
    //   7240	7269	7272	java/lang/Exception
    //   7251	7281	7284	java/lang/Exception
    //   7276	7292	7295	java/lang/Exception
    //   7288	7313	7316	java/lang/Exception
  }
  
  Zgt3 Zy() {
    return this.ZG;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'à+Â9¯ÒªÐR:0{M²D@ðX1Ép#VË³¼$v³¿év}ìçíÇâÛcÇ_³¹½¾¦ôçDslÜÀå/oÀ/æðéÀCdÉZtñp]w]õQâ°C®áâ| xÐqfÛ|éyD~¥@~ZädØÝ-ñþÌá\\taø>W jPzJ¾*ÇpÌtª|o¶¶7áWI9\\fåÒ{VØÒÕmúñ¨ÛR¡Å%ºKt1«äoAÃ§DïVaýlãzéÔ\\b®:CþµÉ½?Veá¬5ÕúMªö[³K;üBü^X mÆ²{a/pÞ<§&"ðaQ\\t×X'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #36
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #25
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
    //   68: ldc 'ÓÄ ©9×16IöÖ"D`zxÿ$½ßE~1ý3ßäèoç ÍÃ@'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #26
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #85
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
    //   129: putstatic burp/Zt3j.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt3j.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_4
    //   213: goto -> 243
    //   216: bipush #125
    //   218: goto -> 243
    //   221: bipush #40
    //   223: goto -> 243
    //   226: bipush #57
    //   228: goto -> 243
    //   231: bipush #64
    //   233: goto -> 243
    //   236: bipush #105
    //   238: goto -> 243
    //   241: bipush #47
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8508) & 0xFFFF;
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
      byte b1 = 24;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */