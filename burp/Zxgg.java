package burp;

import java.awt.Component;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zkb;

class Zxgg implements Zgmk {
  private final Zz0n ZC;
  
  private final Zt4u ZH;
  
  private final Zerg Zu;
  
  private final Supplier<Zeew> Zm;
  
  private final Zbnt Zr;
  
  private final Component ZX;
  
  private final Zbiv ZD;
  
  private final Ztdq Zo;
  
  private final Zskh ZA;
  
  private final Zgbj Zf;
  
  private final Ztwv Zs;
  
  private final Zlfj ZG;
  
  private final boolean ZW;
  
  private final Zey9 Zd;
  
  private final Zb9b Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zxgg(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Supplier<Zeew> paramSupplier, Zbnt paramZbnt, Component paramComponent, Zbiv paramZbiv, Ztdq paramZtdq, Zskh paramZskh, Zgbj paramZgbj, Ztwv paramZtwv, Zlfj paramZlfj, boolean paramBoolean, Zey9 paramZey9, Zb9b paramZb9b) {
    this.ZC = paramZz0n;
    this.ZH = paramZt4u;
    this.Zu = paramZerg;
    this.Zm = paramSupplier;
    this.Zr = paramZbnt;
    this.ZX = paramComponent;
    this.ZD = paramZbiv;
    this.Zo = paramZtdq;
    this.ZA = paramZskh;
    this.Zf = paramZgbj;
    this.Zs = paramZtwv;
    this.ZG = paramZlfj;
    this.ZW = paramBoolean;
    this.Zd = paramZey9;
    this.Zn = paramZb9b;
  }
  
  public Zzzd ZM(boolean paramBoolean, Zgu3 paramZgu3, Zge7 paramZge7, Zmgv paramZmgv, Zgsq paramZgsq, Ztbl paramZtbl, int paramInt, Object paramObject, Zmd9 paramZmd9) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore #10
    //   5: aload #8
    //   7: instanceof javax/swing/JTextField
    //   10: ifeq -> 44
    //   13: aload #8
    //   15: checkcast javax/swing/JTextField
    //   18: invokevirtual getParent : ()Ljava/awt/Container;
    //   21: instanceof burp/Zbws
    //   24: ifeq -> 44
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: new burp/Zzzd
    //   37: dup
    //   38: iload_1
    //   39: iconst_0
    //   40: invokespecial <init> : (ZZ)V
    //   43: areturn
    //   44: aload #8
    //   46: instanceof javax/swing/text/JTextComponent
    //   49: ifeq -> 110
    //   52: iload #7
    //   54: lookupswitch default -> 110, 393472 -> 100, 393728 -> 100, 393984 -> 100, 394752 -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: new burp/Zzzd
    //   103: dup
    //   104: iload_1
    //   105: iconst_0
    //   106: invokespecial <init> : (ZZ)V
    //   109: areturn
    //   110: aload_3
    //   111: invokeinterface Zb : ()Lburp/Zsmh;
    //   116: astore #11
    //   118: aload #11
    //   120: ifnonnull -> 133
    //   123: new burp/Zzzd
    //   126: dup
    //   127: iload_1
    //   128: iconst_0
    //   129: invokespecial <init> : (ZZ)V
    //   132: areturn
    //   133: aload #11
    //   135: invokeinterface Zh : ()Z
    //   140: ifeq -> 146
    //   143: aconst_null
    //   144: astore #11
    //   146: aconst_null
    //   147: astore #12
    //   149: aconst_null
    //   150: astore #13
    //   152: aload_2
    //   153: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   156: if_acmpne -> 201
    //   159: aload #11
    //   161: ifnull -> 201
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: new burp/Zgjd
    //   174: dup
    //   175: aload #5
    //   177: invokespecial <init> : (Lburp/Zgsq;)V
    //   180: astore #14
    //   182: aload #11
    //   184: aload #14
    //   186: invokeinterface Zh : (Lburp/Zbf7;)V
    //   191: aload #14
    //   193: invokevirtual Zw : ()Lburp/Zbr;
    //   196: astore #12
    //   198: goto -> 231
    //   201: aload_2
    //   202: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   205: if_acmpeq -> 222
    //   208: aload_2
    //   209: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   212: if_acmpne -> 231
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload #4
    //   224: invokeinterface Zo3 : ()Lburp/Zbr;
    //   229: astore #12
    //   231: aload #12
    //   233: ifnull -> 296
    //   236: aload #12
    //   238: invokevirtual Zz : ()Z
    //   241: ifeq -> 261
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   250: athrow
    //   251: aload #12
    //   253: invokevirtual Zr : ()Lburp/Zstu;
    //   256: astore #13
    //   258: goto -> 296
    //   261: aload #12
    //   263: aload #4
    //   265: invokeinterface Zod : ()Lburp/Zmzk;
    //   270: aload_0
    //   271: getfield Zd : Lburp/Zey9;
    //   274: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   277: astore #14
    //   279: aload #14
    //   281: invokeinterface Zb : ()Lburp/Zefx;
    //   286: invokeinterface ZD : ()[B
    //   291: invokestatic Zy : ([B)Lburp/Zyf;
    //   294: astore #13
    //   296: aload_0
    //   297: aload #13
    //   299: aload #4
    //   301: invokeinterface Zod : ()Lburp/Zmzk;
    //   306: invokevirtual ZF : (Lburp/Zstu;Lburp/Zmzk;)Lburp/Zlit;
    //   309: astore #14
    //   311: aload #14
    //   313: ifnull -> 341
    //   316: aload #14
    //   318: invokeinterface Zdz : ()Lburp/Zmzk;
    //   323: ifnull -> 341
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   332: athrow
    //   333: iconst_1
    //   334: goto -> 342
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: iconst_0
    //   342: istore #15
    //   344: iload #7
    //   346: lookupswitch default -> 3222, 131328 -> 1237, 131584 -> 1143, 132608 -> 1624, 132864 -> 1533, 132992 -> 1330, 133008 -> 1442, 133120 -> 1715, 133376 -> 2281, 133632 -> 2983, 133888 -> 2827, 134144 -> 2890, 134400 -> 2677, 134416 -> 2747, 134784 -> 3046, 134912 -> 1978, 135168 -> 2058, 135424 -> 2058, 136448 -> 779, 136528 -> 855, 136704 -> 985, 136960 -> 1064, 143360 -> 612, 393728 -> 2343, 394048 -> 2413, 394112 -> 2499, 395264 -> 2139, 395328 -> 2210, 404224 -> 2609, 404480 -> 2626, 404544 -> 2643, 404608 -> 2660, 405248 -> 1878
    //   612: aload_0
    //   613: getfield Zn : Lburp/Zb9b;
    //   616: aload_2
    //   617: invokeinterface Zy : (Lburp/Zgu3;)Z
    //   622: ifeq -> 769
    //   625: goto -> 632
    //   628: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   631: athrow
    //   632: aload_3
    //   633: invokeinterface Zk : ()Ljava/lang/String;
    //   638: aload_3
    //   639: invokeinterface Zg : ()[I
    //   644: invokestatic Zj : (Ljava/lang/String;[I)Lburp/Zrqo;
    //   647: astore #16
    //   649: aload #16
    //   651: invokevirtual Zjx : ()I
    //   654: iconst_3
    //   655: if_icmpge -> 696
    //   658: aload_0
    //   659: getfield ZX : Ljava/awt/Component;
    //   662: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   665: sipush #24000
    //   668: sipush #14585
    //   671: invokestatic a : (II)Ljava/lang/String;
    //   674: sipush #24007
    //   677: sipush #20838
    //   680: invokestatic a : (II)Ljava/lang/String;
    //   683: invokestatic Zf : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   686: new burp/Zzzd
    //   689: dup
    //   690: iload_1
    //   691: iconst_1
    //   692: invokespecial <init> : (ZZ)V
    //   695: areturn
    //   696: aload #16
    //   698: invokevirtual Zjx : ()I
    //   701: sipush #1000
    //   704: if_icmple -> 745
    //   707: aload_0
    //   708: getfield ZX : Ljava/awt/Component;
    //   711: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   714: sipush #24002
    //   717: sipush #-3487
    //   720: invokestatic a : (II)Ljava/lang/String;
    //   723: sipush #24001
    //   726: sipush #-20408
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: invokestatic Zf : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   735: new burp/Zzzd
    //   738: dup
    //   739: iload_1
    //   740: iconst_1
    //   741: invokespecial <init> : (ZZ)V
    //   744: areturn
    //   745: aload_0
    //   746: getfield Zn : Lburp/Zb9b;
    //   749: aload_2
    //   750: aload #11
    //   752: aload #16
    //   754: invokeinterface ZM : (Lburp/Zgu3;Lburp/Zsmh;Lburp/Zrqo;)V
    //   759: new burp/Zzzd
    //   762: dup
    //   763: iload_1
    //   764: iconst_1
    //   765: invokespecial <init> : (ZZ)V
    //   768: areturn
    //   769: new burp/Zzzd
    //   772: dup
    //   773: iload_1
    //   774: iconst_0
    //   775: invokespecial <init> : (ZZ)V
    //   778: areturn
    //   779: aload_0
    //   780: getfield ZW : Z
    //   783: ifeq -> 845
    //   786: aload #13
    //   788: ifnull -> 845
    //   791: goto -> 798
    //   794: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   797: athrow
    //   798: iload #15
    //   800: ifeq -> 845
    //   803: goto -> 810
    //   806: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   809: athrow
    //   810: aload_0
    //   811: getfield ZD : Lburp/Zbiv;
    //   814: aload_0
    //   815: getfield ZX : Ljava/awt/Component;
    //   818: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   821: aload #13
    //   823: aload #4
    //   825: invokeinterface ZoO : ()Lburp/Zstu;
    //   830: aload #14
    //   832: invokevirtual Zm : (Ljava/awt/Component;Lburp/Zstu;Lburp/Zstu;Lburp/Zlit;)V
    //   835: new burp/Zzzd
    //   838: dup
    //   839: iload_1
    //   840: iconst_1
    //   841: invokespecial <init> : (ZZ)V
    //   844: areturn
    //   845: new burp/Zzzd
    //   848: dup
    //   849: iload_1
    //   850: iconst_0
    //   851: invokespecial <init> : (ZZ)V
    //   854: areturn
    //   855: aload_0
    //   856: getfield ZW : Z
    //   859: ifeq -> 975
    //   862: aload #13
    //   864: ifnull -> 975
    //   867: goto -> 874
    //   870: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   873: athrow
    //   874: aload_0
    //   875: getfield ZG : Lburp/Zlfj;
    //   878: invokevirtual ZY : ()I
    //   881: istore #16
    //   883: aload_0
    //   884: getfield ZG : Lburp/Zlfj;
    //   887: invokevirtual ZW : ()I
    //   890: istore #17
    //   892: iload #16
    //   894: iload #17
    //   896: if_icmpeq -> 965
    //   899: aload_0
    //   900: getfield ZD : Lburp/Zbiv;
    //   903: aload_0
    //   904: getfield ZX : Ljava/awt/Component;
    //   907: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   910: new burp/Ztnf
    //   913: dup
    //   914: aload #4
    //   916: aload_0
    //   917: getfield Zm : Ljava/util/function/Supplier;
    //   920: invokeinterface get : ()Ljava/lang/Object;
    //   925: checkcast burp/Zeew
    //   928: aload_0
    //   929: getfield Zr : Lburp/Zbnt;
    //   932: aload_0
    //   933: getfield Zd : Lburp/Zey9;
    //   936: invokespecial <init> : (Lburp/Zmgv;Lburp/Zeew;Lburp/Zbnt;Lburp/Zey9;)V
    //   939: iconst_2
    //   940: newarray int
    //   942: dup
    //   943: iconst_0
    //   944: iload #16
    //   946: iastore
    //   947: dup
    //   948: iconst_1
    //   949: iload #17
    //   951: iastore
    //   952: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   955: invokevirtual Zm : (Ljava/awt/Component;Lburp/Zll9;Ljava/util/List;)V
    //   958: goto -> 965
    //   961: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   964: athrow
    //   965: new burp/Zzzd
    //   968: dup
    //   969: iload_1
    //   970: iconst_1
    //   971: invokespecial <init> : (ZZ)V
    //   974: areturn
    //   975: new burp/Zzzd
    //   978: dup
    //   979: iload_1
    //   980: iconst_0
    //   981: invokespecial <init> : (ZZ)V
    //   984: areturn
    //   985: aload_0
    //   986: getfield ZW : Z
    //   989: ifeq -> 1054
    //   992: aload #13
    //   994: ifnull -> 1054
    //   997: goto -> 1004
    //   1000: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1003: athrow
    //   1004: iload #15
    //   1006: ifeq -> 1054
    //   1009: goto -> 1016
    //   1012: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1015: athrow
    //   1016: getstatic burp/Zze0.SUITE_MESSAGE_ANALYSER_DO_PASSIVE_SCAN : Lburp/Zze0;
    //   1019: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   1022: new burp/Zetn
    //   1025: dup
    //   1026: aload #14
    //   1028: aload #13
    //   1030: aload #4
    //   1032: invokeinterface ZoO : ()Lburp/Zstu;
    //   1037: invokespecial <init> : (Lburp/Zlit;Lburp/Zstu;Lburp/Zstu;)V
    //   1040: astore #16
    //   1042: aload_0
    //   1043: getfield ZD : Lburp/Zbiv;
    //   1046: invokevirtual Zv : ()Lburp/Zz7i;
    //   1049: aload #16
    //   1051: invokevirtual Zp : (Lburp/Zll9;)V
    //   1054: new burp/Zzzd
    //   1057: dup
    //   1058: iload_1
    //   1059: iconst_1
    //   1060: invokespecial <init> : (ZZ)V
    //   1063: areturn
    //   1064: aload_0
    //   1065: getfield ZW : Z
    //   1068: ifeq -> 1133
    //   1071: aload #13
    //   1073: ifnull -> 1133
    //   1076: goto -> 1083
    //   1079: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1082: athrow
    //   1083: iload #15
    //   1085: ifeq -> 1133
    //   1088: goto -> 1095
    //   1091: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1094: athrow
    //   1095: getstatic burp/Zze0.SUITE_MESSAGE_ANALYSER_DO_ACTIVE_SCAN : Lburp/Zze0;
    //   1098: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   1101: new burp/Zetn
    //   1104: dup
    //   1105: aload #14
    //   1107: aload #13
    //   1109: aload #4
    //   1111: invokeinterface ZoO : ()Lburp/Zstu;
    //   1116: invokespecial <init> : (Lburp/Zlit;Lburp/Zstu;Lburp/Zstu;)V
    //   1119: astore #16
    //   1121: aload_0
    //   1122: getfield ZD : Lburp/Zbiv;
    //   1125: invokevirtual Zv : ()Lburp/Zz7i;
    //   1128: aload #16
    //   1130: invokevirtual ZV : (Lburp/Zll9;)V
    //   1133: new burp/Zzzd
    //   1136: dup
    //   1137: iload_1
    //   1138: iconst_1
    //   1139: invokespecial <init> : (ZZ)V
    //   1142: areturn
    //   1143: aload_0
    //   1144: getfield ZW : Z
    //   1147: ifeq -> 1227
    //   1150: aload #13
    //   1152: ifnull -> 1227
    //   1155: goto -> 1162
    //   1158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1161: athrow
    //   1162: aload_3
    //   1163: invokeinterface ZD : ()Z
    //   1168: ifeq -> 1194
    //   1171: goto -> 1178
    //   1174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1177: athrow
    //   1178: aload_3
    //   1179: invokeinterface Zg : ()[I
    //   1184: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   1187: goto -> 1195
    //   1190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1193: athrow
    //   1194: aconst_null
    //   1195: astore #16
    //   1197: aload_0
    //   1198: getfield Zu : Lburp/Zerg;
    //   1201: invokevirtual Zg : ()Lburp/Zr00;
    //   1204: aload #4
    //   1206: invokeinterface Zod : ()Lburp/Zmzk;
    //   1211: aload #13
    //   1213: aload #16
    //   1215: aload #4
    //   1217: invokeinterface ZoO : ()Lburp/Zstu;
    //   1222: invokeinterface Zp : (Lburp/Zmzk;Lburp/Zstu;Ljava/util/List;Lburp/Zstu;)V
    //   1227: new burp/Zzzd
    //   1230: dup
    //   1231: iload_1
    //   1232: iconst_1
    //   1233: invokespecial <init> : (ZZ)V
    //   1236: areturn
    //   1237: aload_0
    //   1238: getfield ZW : Z
    //   1241: ifeq -> 1320
    //   1244: aload #12
    //   1246: ifnull -> 1320
    //   1249: goto -> 1256
    //   1252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1255: athrow
    //   1256: aload #12
    //   1258: invokevirtual Zd : ()Z
    //   1261: ifne -> 1320
    //   1264: goto -> 1271
    //   1267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1270: athrow
    //   1271: aload #9
    //   1273: invokeinterface Zv : ()Lburp/Zr6e;
    //   1278: astore #16
    //   1280: aload #4
    //   1282: invokestatic ZY : (Lburp/Zmgv;)Ljava/lang/String;
    //   1285: astore #17
    //   1287: aload_0
    //   1288: getfield Zu : Lburp/Zerg;
    //   1291: invokevirtual Zm : ()Lburp/Zx_a;
    //   1294: aload #4
    //   1296: invokeinterface Zod : ()Lburp/Zmzk;
    //   1301: aload #12
    //   1303: aload #4
    //   1305: invokeinterface Zoe : ()Lburp/Zgsq;
    //   1310: aconst_null
    //   1311: aload #16
    //   1313: aload #17
    //   1315: invokeinterface ZT : (Lburp/Zmzk;Lburp/Zbr;Lburp/Zgsq;Ljava/lang/String;Lburp/Zr6e;Ljava/lang/String;)V
    //   1320: new burp/Zzzd
    //   1323: dup
    //   1324: iload_1
    //   1325: iconst_1
    //   1326: invokespecial <init> : (ZZ)V
    //   1329: areturn
    //   1330: aload_0
    //   1331: getfield ZW : Z
    //   1334: ifeq -> 1432
    //   1337: aload #12
    //   1339: ifnull -> 1432
    //   1342: goto -> 1349
    //   1345: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1348: athrow
    //   1349: aload #12
    //   1351: invokevirtual Zd : ()Z
    //   1354: ifne -> 1432
    //   1357: goto -> 1364
    //   1360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1363: athrow
    //   1364: aload_0
    //   1365: getfield Zm : Ljava/util/function/Supplier;
    //   1368: invokeinterface get : ()Ljava/lang/Object;
    //   1373: checkcast burp/Zeew
    //   1376: astore #16
    //   1378: aload #16
    //   1380: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   1383: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   1386: aload #4
    //   1388: invokestatic ZY : (Lburp/Zmgv;)Ljava/lang/String;
    //   1391: astore #17
    //   1393: aload_0
    //   1394: getfield Zu : Lburp/Zerg;
    //   1397: invokevirtual Ze : ()Lburp/Zeu0;
    //   1400: aload #16
    //   1402: aload #4
    //   1404: invokeinterface Zod : ()Lburp/Zmzk;
    //   1409: aload #12
    //   1411: aload #4
    //   1413: invokeinterface ZoO : ()Lburp/Zstu;
    //   1418: aload #4
    //   1420: invokeinterface ZoB : ()J
    //   1425: aload #17
    //   1427: invokeinterface ZE : (Lburp/Zeew;Lburp/Zmzk;Lburp/Zbr;Lburp/Zstu;JLjava/lang/String;)V
    //   1432: new burp/Zzzd
    //   1435: dup
    //   1436: iload_1
    //   1437: iconst_1
    //   1438: invokespecial <init> : (ZZ)V
    //   1441: areturn
    //   1442: aload_0
    //   1443: getfield ZW : Z
    //   1446: ifeq -> 1523
    //   1449: aload #12
    //   1451: ifnull -> 1523
    //   1454: goto -> 1461
    //   1457: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1460: athrow
    //   1461: aload #12
    //   1463: invokevirtual Zd : ()Z
    //   1466: ifne -> 1523
    //   1469: goto -> 1476
    //   1472: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1475: athrow
    //   1476: aload_0
    //   1477: getfield Zu : Lburp/Zerg;
    //   1480: invokevirtual ZM : ()Lburp/Zgvn;
    //   1483: aload #4
    //   1485: invokeinterface Zod : ()Lburp/Zmzk;
    //   1490: aload #12
    //   1492: aload #4
    //   1494: invokeinterface ZoO : ()Lburp/Zstu;
    //   1499: aload_0
    //   1500: getfield Zm : Ljava/util/function/Supplier;
    //   1503: invokeinterface get : ()Ljava/lang/Object;
    //   1508: checkcast burp/Zzvh
    //   1511: invokeinterface Za : (Lburp/Zmzk;Lburp/Zbr;Lburp/Zstu;Lburp/Zzvh;)V
    //   1516: goto -> 1523
    //   1519: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1522: athrow
    //   1523: new burp/Zzzd
    //   1526: dup
    //   1527: iload_1
    //   1528: iconst_1
    //   1529: invokespecial <init> : (ZZ)V
    //   1532: areturn
    //   1533: aload #11
    //   1535: ifnull -> 1614
    //   1538: aload_3
    //   1539: invokeinterface ZQ : ()Z
    //   1544: ifeq -> 1587
    //   1547: goto -> 1554
    //   1550: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1553: athrow
    //   1554: aload_0
    //   1555: getfield Zu : Lburp/Zerg;
    //   1558: invokevirtual Za : ()Lburp/Ztw;
    //   1561: aload_3
    //   1562: invokeinterface Zw : ()[B
    //   1567: invokestatic Zy : ([B)Lburp/Zyf;
    //   1570: invokeinterface ZW : (Lburp/Zstu;)V
    //   1575: aload #10
    //   1577: ifnull -> 1614
    //   1580: goto -> 1587
    //   1583: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1586: athrow
    //   1587: aload_0
    //   1588: getfield Zu : Lburp/Zerg;
    //   1591: invokevirtual Za : ()Lburp/Ztw;
    //   1594: aload #11
    //   1596: invokestatic Zb : (Lburp/Zsmh;)[B
    //   1599: invokestatic Zy : ([B)Lburp/Zyf;
    //   1602: invokeinterface ZW : (Lburp/Zstu;)V
    //   1607: goto -> 1614
    //   1610: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1613: athrow
    //   1614: new burp/Zzzd
    //   1617: dup
    //   1618: iload_1
    //   1619: iconst_1
    //   1620: invokespecial <init> : (ZZ)V
    //   1623: areturn
    //   1624: aload #11
    //   1626: ifnull -> 1705
    //   1629: aload_3
    //   1630: invokeinterface ZQ : ()Z
    //   1635: ifeq -> 1678
    //   1638: goto -> 1645
    //   1641: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1644: athrow
    //   1645: aload_0
    //   1646: getfield Zu : Lburp/Zerg;
    //   1649: invokevirtual ZH : ()Lburp/Zg_j;
    //   1652: aload_3
    //   1653: invokeinterface Zw : ()[B
    //   1658: invokestatic Zy : ([B)Lburp/Zyf;
    //   1661: invokeinterface ZM : (Lburp/Zstu;)V
    //   1666: aload #10
    //   1668: ifnull -> 1705
    //   1671: goto -> 1678
    //   1674: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1677: athrow
    //   1678: aload_0
    //   1679: getfield Zu : Lburp/Zerg;
    //   1682: invokevirtual ZH : ()Lburp/Zg_j;
    //   1685: aload #11
    //   1687: invokestatic Zb : (Lburp/Zsmh;)[B
    //   1690: invokestatic Zy : ([B)Lburp/Zyf;
    //   1693: invokeinterface ZM : (Lburp/Zstu;)V
    //   1698: goto -> 1705
    //   1701: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1704: athrow
    //   1705: new burp/Zzzd
    //   1708: dup
    //   1709: iload_1
    //   1710: iconst_1
    //   1711: invokespecial <init> : (ZZ)V
    //   1714: areturn
    //   1715: aload_0
    //   1716: getfield ZW : Z
    //   1719: ifeq -> 1868
    //   1722: aload #13
    //   1724: ifnull -> 1868
    //   1727: goto -> 1734
    //   1730: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1733: athrow
    //   1734: getstatic burp/Zb1f.Zf : [I
    //   1737: aload_2
    //   1738: invokevirtual ordinal : ()I
    //   1741: iaload
    //   1742: lookupswitch default -> 1797, 1 -> 1772, 2 -> 1786
    //   1768: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1771: athrow
    //   1772: aload #4
    //   1774: invokeinterface ZoO : ()Lburp/Zstu;
    //   1779: goto -> 1798
    //   1782: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1785: athrow
    //   1786: aload #11
    //   1788: invokestatic Zu : (Lburp/Zsmh;)[B
    //   1791: invokestatic Zy : ([B)Lburp/Zyf;
    //   1794: goto -> 1798
    //   1797: aconst_null
    //   1798: astore #16
    //   1800: aload #16
    //   1802: ifnonnull -> 1838
    //   1805: aload_0
    //   1806: getfield Zu : Lburp/Zerg;
    //   1809: invokevirtual ZK : ()Lburp/Zbui;
    //   1812: aload #4
    //   1814: invokeinterface Zod : ()Lburp/Zmzk;
    //   1819: aload #13
    //   1821: invokeinterface ZU : (Lburp/Zmzk;Lburp/Zstu;)V
    //   1826: aload #10
    //   1828: ifnull -> 1868
    //   1831: goto -> 1838
    //   1834: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1837: athrow
    //   1838: aload_0
    //   1839: getfield Zu : Lburp/Zerg;
    //   1842: invokevirtual ZK : ()Lburp/Zbui;
    //   1845: aload #4
    //   1847: invokeinterface Zod : ()Lburp/Zmzk;
    //   1852: aload #13
    //   1854: aload #16
    //   1856: invokeinterface ZP : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;)V
    //   1861: goto -> 1868
    //   1864: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1867: athrow
    //   1868: new burp/Zzzd
    //   1871: dup
    //   1872: iload_1
    //   1873: iconst_1
    //   1874: invokespecial <init> : (ZZ)V
    //   1877: areturn
    //   1878: aload_0
    //   1879: getfield Zu : Lburp/Zerg;
    //   1882: invokevirtual ZC : ()Lburp/Zs_f;
    //   1885: invokeinterface Zt : ()Ljava/util/Optional;
    //   1890: astore #16
    //   1892: aload #16
    //   1894: invokevirtual isPresent : ()Z
    //   1897: ifeq -> 1933
    //   1900: aload_0
    //   1901: getfield ZG : Lburp/Zlfj;
    //   1904: aload #16
    //   1906: invokevirtual get : ()Ljava/lang/Object;
    //   1909: checkcast java/lang/String
    //   1912: invokevirtual Zh : (Ljava/lang/String;)V
    //   1915: getstatic burp/Zze0.COLLABORATOR_UI_PAYLOAD_ADDED_FROM_CONTEXT_MENU : Lburp/Zze0;
    //   1918: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   1921: aload #10
    //   1923: ifnull -> 1968
    //   1926: goto -> 1933
    //   1929: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1932: athrow
    //   1933: aload_0
    //   1934: getfield ZX : Ljava/awt/Component;
    //   1937: invokestatic windowForComponent : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1940: sipush #24003
    //   1943: sipush #20791
    //   1946: invokestatic a : (II)Ljava/lang/String;
    //   1949: sipush #24014
    //   1952: sipush #25103
    //   1955: invokestatic a : (II)Ljava/lang/String;
    //   1958: invokestatic Zf : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   1961: goto -> 1968
    //   1964: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1967: athrow
    //   1968: new burp/Zzzd
    //   1971: dup
    //   1972: iload_1
    //   1973: iconst_1
    //   1974: invokespecial <init> : (ZZ)V
    //   1977: areturn
    //   1978: aload #13
    //   1980: ifnull -> 2048
    //   1983: aload #4
    //   1985: invokeinterface ZoO : ()Lburp/Zstu;
    //   1990: astore #16
    //   1992: aload #16
    //   1994: ifnull -> 2048
    //   1997: aload #4
    //   1999: invokeinterface Zod : ()Lburp/Zmzk;
    //   2004: aload #13
    //   2006: aload_0
    //   2007: getfield Zr : Lburp/Zbnt;
    //   2010: invokestatic Zy : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zbnt;)Lburp/Zlit;
    //   2013: astore #17
    //   2015: aload #17
    //   2017: ifnull -> 2048
    //   2020: aload_0
    //   2021: getfield Zu : Lburp/Zerg;
    //   2024: invokevirtual ZJ : ()Lburp/Zt80;
    //   2027: aload #17
    //   2029: aload #16
    //   2031: aload_0
    //   2032: getfield ZX : Ljava/awt/Component;
    //   2035: iconst_0
    //   2036: invokeinterface Zf : (Lburp/Zlit;Lburp/Zstu;Ljava/awt/Component;B)V
    //   2041: goto -> 2048
    //   2044: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2047: athrow
    //   2048: new burp/Zzzd
    //   2051: dup
    //   2052: iload_1
    //   2053: iconst_1
    //   2054: invokespecial <init> : (ZZ)V
    //   2057: areturn
    //   2058: aload #13
    //   2060: ifnull -> 2129
    //   2063: aload #4
    //   2065: invokeinterface Zod : ()Lburp/Zmzk;
    //   2070: aload #13
    //   2072: aload_0
    //   2073: getfield Zr : Lburp/Zbnt;
    //   2076: invokestatic Zy : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zbnt;)Lburp/Zlit;
    //   2079: astore #16
    //   2081: aload #16
    //   2083: ifnull -> 2129
    //   2086: aload_0
    //   2087: getfield Zu : Lburp/Zerg;
    //   2090: invokevirtual ZJ : ()Lburp/Zt80;
    //   2093: aload #16
    //   2095: aload #13
    //   2097: iload #7
    //   2099: ldc 135424
    //   2101: if_icmpne -> 2119
    //   2104: goto -> 2111
    //   2107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2110: athrow
    //   2111: iconst_1
    //   2112: goto -> 2120
    //   2115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2118: athrow
    //   2119: iconst_0
    //   2120: aload_0
    //   2121: getfield ZX : Ljava/awt/Component;
    //   2124: invokeinterface Zj : (Lburp/Zlit;Lburp/Zstu;ZLjava/awt/Component;)V
    //   2129: new burp/Zzzd
    //   2132: dup
    //   2133: iload_1
    //   2134: iconst_1
    //   2135: invokespecial <init> : (ZZ)V
    //   2138: areturn
    //   2139: aload #13
    //   2141: ifnull -> 2200
    //   2144: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CHANGE_REQUEST_METHOD : Lburp/Zrrh;
    //   2147: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   2150: aload #12
    //   2152: aload #4
    //   2154: invokeinterface Zod : ()Lburp/Zmzk;
    //   2159: aload_0
    //   2160: getfield Zd : Lburp/Zey9;
    //   2163: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   2166: aload_0
    //   2167: getfield Zd : Lburp/Zey9;
    //   2170: invokestatic Zi : (Lburp/Zefx;Lburp/Zey9;)Lburp/Zefx;
    //   2173: astore #16
    //   2175: aload #16
    //   2177: getstatic burp/Ztvk.Zv : Lburp/Zrec;
    //   2180: invokeinterface ZN : (Lburp/Zrec;)Lburp/Zefx;
    //   2185: astore #17
    //   2187: aload_0
    //   2188: getfield ZG : Lburp/Zlfj;
    //   2191: aload #17
    //   2193: aload #5
    //   2195: invokevirtual ZN : (Lburp/Zefx;Lburp/Zgsq;)V
    //   2198: iconst_1
    //   2199: istore_1
    //   2200: new burp/Zzzd
    //   2203: dup
    //   2204: iload_1
    //   2205: iconst_1
    //   2206: invokespecial <init> : (ZZ)V
    //   2209: areturn
    //   2210: aload #13
    //   2212: ifnull -> 2271
    //   2215: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CHANGE_BODY_ENCODING : Lburp/Zrrh;
    //   2218: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   2221: aload #12
    //   2223: aload #4
    //   2225: invokeinterface Zod : ()Lburp/Zmzk;
    //   2230: aload_0
    //   2231: getfield Zd : Lburp/Zey9;
    //   2234: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   2237: aload_0
    //   2238: getfield Zd : Lburp/Zey9;
    //   2241: invokestatic Zi : (Lburp/Zefx;Lburp/Zey9;)Lburp/Zefx;
    //   2244: astore #16
    //   2246: aload #16
    //   2248: getstatic burp/Ze6u.ZM : Lburp/Zrec;
    //   2251: invokeinterface ZN : (Lburp/Zrec;)Lburp/Zefx;
    //   2256: astore #17
    //   2258: aload_0
    //   2259: getfield ZG : Lburp/Zlfj;
    //   2262: aload #17
    //   2264: aload #5
    //   2266: invokevirtual ZN : (Lburp/Zefx;Lburp/Zgsq;)V
    //   2269: iconst_1
    //   2270: istore_1
    //   2271: new burp/Zzzd
    //   2274: dup
    //   2275: iload_1
    //   2276: iconst_1
    //   2277: invokespecial <init> : (ZZ)V
    //   2280: areturn
    //   2281: aload #13
    //   2283: ifnull -> 2333
    //   2286: aload #4
    //   2288: invokeinterface Zod : ()Lburp/Zmzk;
    //   2293: aload #13
    //   2295: aload_0
    //   2296: getfield Zr : Lburp/Zbnt;
    //   2299: invokestatic Zy : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zbnt;)Lburp/Zlit;
    //   2302: astore #16
    //   2304: aload #16
    //   2306: ifnull -> 2333
    //   2309: aload_0
    //   2310: getfield Zo : Lburp/Ztdq;
    //   2313: aload_0
    //   2314: getfield ZX : Ljava/awt/Component;
    //   2317: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   2320: aload #16
    //   2322: invokevirtual Za : (Ljava/awt/Window;Lburp/Zlit;)Lburp/Zl44;
    //   2325: pop
    //   2326: goto -> 2333
    //   2329: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2332: athrow
    //   2333: new burp/Zzzd
    //   2336: dup
    //   2337: iload_1
    //   2338: iconst_1
    //   2339: invokespecial <init> : (ZZ)V
    //   2342: areturn
    //   2343: aload_3
    //   2344: invokeinterface ZQ : ()Z
    //   2349: ifeq -> 2365
    //   2352: aload_3
    //   2353: invokeinterface Zk : ()Ljava/lang/String;
    //   2358: goto -> 2387
    //   2361: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2364: athrow
    //   2365: aload #11
    //   2367: ifnonnull -> 2379
    //   2370: ldc ''
    //   2372: goto -> 2387
    //   2375: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2378: athrow
    //   2379: aload #11
    //   2381: invokestatic Zh : (Lburp/Zsmh;)[B
    //   2384: invokestatic ZG : ([B)Ljava/lang/String;
    //   2387: astore #16
    //   2389: aload_0
    //   2390: getfield ZC : Lburp/Zz0n;
    //   2393: invokeinterface ZD : ()Lburp/Zb0h;
    //   2398: aload #16
    //   2400: invokevirtual ZR : (Ljava/lang/String;)V
    //   2403: new burp/Zzzd
    //   2406: dup
    //   2407: iload_1
    //   2408: iconst_1
    //   2409: invokespecial <init> : (ZZ)V
    //   2412: areturn
    //   2413: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_COPY_TO_FILE : Lburp/Zrrh;
    //   2416: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   2419: aload_3
    //   2420: invokeinterface ZQ : ()Z
    //   2425: ifeq -> 2441
    //   2428: aload_3
    //   2429: invokeinterface Zw : ()[B
    //   2434: goto -> 2448
    //   2437: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2440: athrow
    //   2441: aload_0
    //   2442: getfield ZG : Lburp/Zlfj;
    //   2445: invokevirtual Zr : ()[B
    //   2448: astore #16
    //   2450: getstatic burp/Zg1m.DATA : Lburp/Zg1m;
    //   2453: aload_0
    //   2454: getfield ZH : Lburp/Zt4u;
    //   2457: aload_0
    //   2458: getfield ZX : Ljava/awt/Component;
    //   2461: iconst_1
    //   2462: sipush #24006
    //   2465: sipush #6872
    //   2468: invokestatic a : (II)Ljava/lang/String;
    //   2471: aload #16
    //   2473: aload_0
    //   2474: getfield ZC : Lburp/Zz0n;
    //   2477: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   2482: aload_0
    //   2483: getfield ZA : Lburp/Zskh;
    //   2486: invokestatic ZL : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;[BLnet/portswigger/Zl0;Lburp/Zskh;)V
    //   2489: new burp/Zzzd
    //   2492: dup
    //   2493: iload_1
    //   2494: iconst_1
    //   2495: invokespecial <init> : (ZZ)V
    //   2498: areturn
    //   2499: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_PASTE_FROM_FILE : Lburp/Zrrh;
    //   2502: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   2505: getstatic burp/Zg1m.DATA : Lburp/Zg1m;
    //   2508: aload_0
    //   2509: getfield ZH : Lburp/Zt4u;
    //   2512: aload_0
    //   2513: getfield ZX : Ljava/awt/Component;
    //   2516: iconst_0
    //   2517: sipush #24015
    //   2520: sipush #18831
    //   2523: invokestatic a : (II)Ljava/lang/String;
    //   2526: aload_0
    //   2527: getfield ZC : Lburp/Zz0n;
    //   2530: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   2535: aload_0
    //   2536: getfield ZA : Lburp/Zskh;
    //   2539: invokestatic ZQ : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lnet/portswigger/Zl0;Lburp/Zskh;)[B
    //   2542: astore #16
    //   2544: aload #16
    //   2546: ifnull -> 2599
    //   2549: aload_3
    //   2550: invokeinterface Zg : ()[I
    //   2555: astore #17
    //   2557: aload #17
    //   2559: ifnull -> 2582
    //   2562: aload_3
    //   2563: aload #16
    //   2565: invokeinterface Zf : ([B)V
    //   2570: aload #10
    //   2572: ifnull -> 2599
    //   2575: goto -> 2582
    //   2578: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2581: athrow
    //   2582: aload_0
    //   2583: getfield ZG : Lburp/Zlfj;
    //   2586: aload #16
    //   2588: aload_2
    //   2589: invokevirtual ZP : ([BLburp/Zgu3;)V
    //   2592: goto -> 2599
    //   2595: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2598: athrow
    //   2599: new burp/Zzzd
    //   2602: dup
    //   2603: iload_1
    //   2604: iconst_1
    //   2605: invokespecial <init> : (ZZ)V
    //   2608: areturn
    //   2609: aload #6
    //   2611: invokeinterface ZA : ()V
    //   2616: new burp/Zzzd
    //   2619: dup
    //   2620: iload_1
    //   2621: iconst_1
    //   2622: invokespecial <init> : (ZZ)V
    //   2625: areturn
    //   2626: aload #6
    //   2628: invokeinterface ZL : ()V
    //   2633: new burp/Zzzd
    //   2636: dup
    //   2637: iload_1
    //   2638: iconst_1
    //   2639: invokespecial <init> : (ZZ)V
    //   2642: areturn
    //   2643: aload #6
    //   2645: invokeinterface Zf : ()V
    //   2650: new burp/Zzzd
    //   2653: dup
    //   2654: iload_1
    //   2655: iconst_1
    //   2656: invokespecial <init> : (ZZ)V
    //   2659: areturn
    //   2660: aload #6
    //   2662: invokeinterface ZP : ()V
    //   2667: new burp/Zzzd
    //   2670: dup
    //   2671: iload_1
    //   2672: iconst_1
    //   2673: invokespecial <init> : (ZZ)V
    //   2676: areturn
    //   2677: aload #13
    //   2679: ifnull -> 2737
    //   2682: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_COPY_URL : Lburp/Zrrh;
    //   2685: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   2688: aload #4
    //   2690: invokeinterface Zod : ()Lburp/Zmzk;
    //   2695: aload #13
    //   2697: aload_0
    //   2698: getfield Zr : Lburp/Zbnt;
    //   2701: invokestatic Zy : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zbnt;)Lburp/Zlit;
    //   2704: astore #17
    //   2706: aload #17
    //   2708: ifnull -> 2737
    //   2711: aload_0
    //   2712: getfield ZC : Lburp/Zz0n;
    //   2715: invokeinterface ZD : ()Lburp/Zb0h;
    //   2720: aload #17
    //   2722: invokeinterface toString : ()Ljava/lang/String;
    //   2727: invokevirtual ZR : (Ljava/lang/String;)V
    //   2730: goto -> 2737
    //   2733: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2736: athrow
    //   2737: new burp/Zzzd
    //   2740: dup
    //   2741: iload_1
    //   2742: iconst_1
    //   2743: invokespecial <init> : (ZZ)V
    //   2746: areturn
    //   2747: aload #13
    //   2749: ifnull -> 2817
    //   2752: aload #4
    //   2754: invokeinterface Zod : ()Lburp/Zmzk;
    //   2759: aload #13
    //   2761: iconst_2
    //   2762: aload_0
    //   2763: getfield Zr : Lburp/Zbnt;
    //   2766: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   2769: astore #17
    //   2771: aload #17
    //   2773: aload #13
    //   2775: aload_0
    //   2776: getfield ZX : Ljava/awt/Component;
    //   2779: aload_0
    //   2780: getfield ZA : Lburp/Zskh;
    //   2783: invokestatic ZP : (Lburp/Zz1p;Lburp/Zstu;Ljava/awt/Component;Lburp/Zskh;)Ljava/lang/String;
    //   2786: astore #18
    //   2788: aload #18
    //   2790: invokevirtual isEmpty : ()Z
    //   2793: ifne -> 2817
    //   2796: aload_0
    //   2797: getfield ZC : Lburp/Zz0n;
    //   2800: invokeinterface ZD : ()Lburp/Zb0h;
    //   2805: aload #18
    //   2807: invokevirtual ZR : (Ljava/lang/String;)V
    //   2810: goto -> 2817
    //   2813: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2816: athrow
    //   2817: new burp/Zzzd
    //   2820: dup
    //   2821: iload_1
    //   2822: iconst_1
    //   2823: invokespecial <init> : (ZZ)V
    //   2826: areturn
    //   2827: aload #13
    //   2829: ifnull -> 2880
    //   2832: aload #4
    //   2834: invokeinterface Zod : ()Lburp/Zmzk;
    //   2839: aload #13
    //   2841: aload_0
    //   2842: getfield Zr : Lburp/Zbnt;
    //   2845: invokestatic Zy : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zbnt;)Lburp/Zlit;
    //   2848: astore #17
    //   2850: aload #17
    //   2852: ifnull -> 2880
    //   2855: aload_0
    //   2856: getfield Zf : Lburp/Zgbj;
    //   2859: aload_0
    //   2860: getfield ZX : Ljava/awt/Component;
    //   2863: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   2866: aload #17
    //   2868: invokeinterface Zt : (Ljava/awt/Window;Lburp/Zlit;)V
    //   2873: goto -> 2880
    //   2876: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2879: athrow
    //   2880: new burp/Zzzd
    //   2883: dup
    //   2884: iload_1
    //   2885: iconst_1
    //   2886: invokespecial <init> : (ZZ)V
    //   2889: areturn
    //   2890: aload #12
    //   2892: ifnull -> 2973
    //   2895: aload #12
    //   2897: invokevirtual Zd : ()Z
    //   2900: ifne -> 2973
    //   2903: goto -> 2910
    //   2906: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2909: athrow
    //   2910: aload #4
    //   2912: invokeinterface Zod : ()Lburp/Zmzk;
    //   2917: ifnull -> 2973
    //   2920: goto -> 2927
    //   2923: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2926: athrow
    //   2927: aload_0
    //   2928: getfield Zf : Lburp/Zgbj;
    //   2931: aload_0
    //   2932: getfield Zm : Ljava/util/function/Supplier;
    //   2935: invokeinterface get : ()Ljava/lang/Object;
    //   2940: checkcast burp/Zeew
    //   2943: aload_0
    //   2944: getfield ZX : Ljava/awt/Component;
    //   2947: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   2950: aload #4
    //   2952: invokeinterface Zod : ()Lburp/Zmzk;
    //   2957: aload #12
    //   2959: aload #5
    //   2961: invokeinterface ZC : (Lburp/Zeew;Ljava/awt/Window;Lburp/Zmzk;Lburp/Zbr;Lburp/Zgsq;)V
    //   2966: goto -> 2973
    //   2969: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2972: athrow
    //   2973: new burp/Zzzd
    //   2976: dup
    //   2977: iload_1
    //   2978: iconst_1
    //   2979: invokespecial <init> : (ZZ)V
    //   2982: areturn
    //   2983: aload #13
    //   2985: ifnull -> 3036
    //   2988: aload #4
    //   2990: invokeinterface Zod : ()Lburp/Zmzk;
    //   2995: aload #13
    //   2997: aload_0
    //   2998: getfield Zr : Lburp/Zbnt;
    //   3001: invokestatic Zy : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zbnt;)Lburp/Zlit;
    //   3004: astore #17
    //   3006: aload #17
    //   3008: ifnull -> 3036
    //   3011: aload_0
    //   3012: getfield Zf : Lburp/Zgbj;
    //   3015: aload_0
    //   3016: getfield ZX : Ljava/awt/Component;
    //   3019: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   3022: aload #17
    //   3024: invokeinterface Zl : (Ljava/awt/Window;Lburp/Zlit;)V
    //   3029: goto -> 3036
    //   3032: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3035: athrow
    //   3036: new burp/Zzzd
    //   3039: dup
    //   3040: iload_1
    //   3041: iconst_1
    //   3042: invokespecial <init> : (ZZ)V
    //   3045: areturn
    //   3046: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_SAVE_ITEM : Lburp/Zrrh;
    //   3049: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   3052: aload_0
    //   3053: getfield Zu : Lburp/Zerg;
    //   3056: aload_0
    //   3057: getfield Zm : Ljava/util/function/Supplier;
    //   3060: invokeinterface get : ()Ljava/lang/Object;
    //   3065: checkcast burp/Zeew
    //   3068: invokevirtual ZI : (Lburp/Zeew;)Lburp/Zx8n;
    //   3071: astore #17
    //   3073: new burp/Zg89
    //   3076: dup
    //   3077: invokespecial <init> : ()V
    //   3080: astore #18
    //   3082: getstatic burp/Zg1m.DATA : Lburp/Zg1m;
    //   3085: aload_0
    //   3086: getfield ZH : Lburp/Zt4u;
    //   3089: aload #17
    //   3091: invokeinterface ZYW : ()Lburp/Zl04;
    //   3096: iconst_1
    //   3097: sipush #24004
    //   3100: sipush #-32133
    //   3103: invokestatic a : (II)Ljava/lang/String;
    //   3106: aload #18
    //   3108: invokestatic ZA : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;)Ljava/io/File;
    //   3111: astore #19
    //   3113: aload #19
    //   3115: ifnull -> 3212
    //   3118: aload_0
    //   3119: getfield Zs : Lburp/Ztwv;
    //   3122: new burp/Zzq9
    //   3125: dup
    //   3126: iconst_1
    //   3127: anewarray burp/Zll9
    //   3130: dup
    //   3131: iconst_0
    //   3132: new burp/Ztnf
    //   3135: dup
    //   3136: aload #4
    //   3138: aload_0
    //   3139: getfield Zm : Ljava/util/function/Supplier;
    //   3142: invokeinterface get : ()Ljava/lang/Object;
    //   3147: checkcast burp/Zeew
    //   3150: aload_0
    //   3151: getfield Zr : Lburp/Zbnt;
    //   3154: aload_0
    //   3155: getfield Zd : Lburp/Zey9;
    //   3158: invokespecial <init> : (Lburp/Zmgv;Lburp/Zeew;Lburp/Zbnt;Lburp/Zey9;)V
    //   3161: aastore
    //   3162: aload #17
    //   3164: invokeinterface ZYW : ()Lburp/Zl04;
    //   3169: aload #17
    //   3171: invokeinterface ZY4 : ()Lburp/Zskh;
    //   3176: aload #19
    //   3178: aload #18
    //   3180: invokevirtual Zi : ()Z
    //   3183: aload_0
    //   3184: getfield Zr : Lburp/Zbnt;
    //   3187: aload_0
    //   3188: getfield ZC : Lburp/Zz0n;
    //   3191: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   3196: invokespecial <init> : ([Lburp/Zll9;Ljava/awt/Window;Lburp/Zskh;Ljava/io/File;ZLburp/Zbnt;Lnet/portswigger/Zl0;)V
    //   3199: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   3204: pop
    //   3205: goto -> 3212
    //   3208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3211: athrow
    //   3212: new burp/Zzzd
    //   3215: dup
    //   3216: iload_1
    //   3217: iconst_1
    //   3218: invokespecial <init> : (ZZ)V
    //   3221: areturn
    //   3222: new burp/Zzzd
    //   3225: dup
    //   3226: iload_1
    //   3227: iconst_0
    //   3228: invokespecial <init> : (ZZ)V
    //   3231: areturn
    //   3232: astore #11
    //   3234: aload #11
    //   3236: iload #7
    //   3238: invokestatic toString : (I)Ljava/lang/String;
    //   3241: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   3244: invokestatic ZU : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;)V
    //   3247: new burp/Zzzd
    //   3250: dup
    //   3251: iload_1
    //   3252: iconst_0
    //   3253: invokespecial <init> : (ZZ)V
    //   3256: areturn
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/lang/Exception
    //   5	43	3232	java/lang/Exception
    //   44	96	96	java/lang/Exception
    //   44	109	3232	java/lang/Exception
    //   110	132	3232	java/lang/Exception
    //   133	695	3232	java/lang/Exception
    //   152	164	167	java/lang/Exception
    //   201	215	218	java/lang/Exception
    //   231	244	247	java/lang/Exception
    //   311	326	329	java/lang/Exception
    //   316	337	337	java/lang/Exception
    //   344	625	628	java/lang/Exception
    //   696	744	3232	java/lang/Exception
    //   745	768	3232	java/lang/Exception
    //   769	778	3232	java/lang/Exception
    //   779	791	794	java/lang/Exception
    //   779	844	3232	java/lang/Exception
    //   786	803	806	java/lang/Exception
    //   845	854	3232	java/lang/Exception
    //   855	867	870	java/lang/Exception
    //   855	974	3232	java/lang/Exception
    //   892	958	961	java/lang/Exception
    //   975	984	3232	java/lang/Exception
    //   985	997	1000	java/lang/Exception
    //   985	1063	3232	java/lang/Exception
    //   992	1009	1012	java/lang/Exception
    //   1064	1076	1079	java/lang/Exception
    //   1064	1142	3232	java/lang/Exception
    //   1071	1088	1091	java/lang/Exception
    //   1143	1155	1158	java/lang/Exception
    //   1143	1236	3232	java/lang/Exception
    //   1150	1171	1174	java/lang/Exception
    //   1162	1190	1190	java/lang/Exception
    //   1237	1249	1252	java/lang/Exception
    //   1237	1329	3232	java/lang/Exception
    //   1244	1264	1267	java/lang/Exception
    //   1330	1342	1345	java/lang/Exception
    //   1330	1441	3232	java/lang/Exception
    //   1337	1357	1360	java/lang/Exception
    //   1442	1454	1457	java/lang/Exception
    //   1442	1532	3232	java/lang/Exception
    //   1449	1469	1472	java/lang/Exception
    //   1461	1516	1519	java/lang/Exception
    //   1533	1547	1550	java/lang/Exception
    //   1533	1623	3232	java/lang/Exception
    //   1538	1580	1583	java/lang/Exception
    //   1554	1607	1610	java/lang/Exception
    //   1624	1638	1641	java/lang/Exception
    //   1624	1714	3232	java/lang/Exception
    //   1629	1671	1674	java/lang/Exception
    //   1645	1698	1701	java/lang/Exception
    //   1715	1727	1730	java/lang/Exception
    //   1715	1877	3232	java/lang/Exception
    //   1722	1768	1768	java/lang/Exception
    //   1734	1782	1782	java/lang/Exception
    //   1800	1831	1834	java/lang/Exception
    //   1805	1861	1864	java/lang/Exception
    //   1878	1977	3232	java/lang/Exception
    //   1892	1926	1929	java/lang/Exception
    //   1900	1961	1964	java/lang/Exception
    //   1978	2057	3232	java/lang/Exception
    //   2015	2041	2044	java/lang/Exception
    //   2058	2138	3232	java/lang/Exception
    //   2081	2104	2107	java/lang/Exception
    //   2086	2115	2115	java/lang/Exception
    //   2139	2209	3232	java/lang/Exception
    //   2210	2280	3232	java/lang/Exception
    //   2281	2342	3232	java/lang/Exception
    //   2304	2326	2329	java/lang/Exception
    //   2343	2361	2361	java/lang/Exception
    //   2343	2412	3232	java/lang/Exception
    //   2365	2375	2375	java/lang/Exception
    //   2413	2437	2437	java/lang/Exception
    //   2413	2498	3232	java/lang/Exception
    //   2499	2608	3232	java/lang/Exception
    //   2557	2575	2578	java/lang/Exception
    //   2562	2592	2595	java/lang/Exception
    //   2609	2625	3232	java/lang/Exception
    //   2626	2642	3232	java/lang/Exception
    //   2643	2659	3232	java/lang/Exception
    //   2660	2676	3232	java/lang/Exception
    //   2677	2746	3232	java/lang/Exception
    //   2706	2730	2733	java/lang/Exception
    //   2747	2826	3232	java/lang/Exception
    //   2788	2810	2813	java/lang/Exception
    //   2827	2889	3232	java/lang/Exception
    //   2850	2873	2876	java/lang/Exception
    //   2890	2903	2906	java/lang/Exception
    //   2890	2982	3232	java/lang/Exception
    //   2895	2920	2923	java/lang/Exception
    //   2910	2966	2969	java/lang/Exception
    //   2983	3045	3232	java/lang/Exception
    //   3006	3029	3032	java/lang/Exception
    //   3046	3221	3232	java/lang/Exception
    //   3113	3205	3208	java/lang/Exception
    //   3222	3231	3232	java/lang/Exception
  }
  
  private static String ZY(Zmgv paramZmgv) {
    int[] arrayOfInt = Zbdf.ZM();
    if (paramZmgv instanceof Zgap) {
      Zgap zgap = (Zgap)paramZmgv;
      zgap.Zc();
      String str = zgap.ZZ();
      return (arrayOfInt != null) ? null : str;
    } 
    return null;
  }
  
  private Zlit ZF(Zstu paramZstu, Zmzk paramZmzk) {
    List<String> list = Zgyj.ZI(paramZstu);
    if (list.isEmpty())
      return null; 
    String[] arrayOfString = ((String)list.getFirst()).split(a(24012, -969), 3);
    if (arrayOfString.length < 2)
      return null; 
    String str = arrayOfString[1].trim();
    if (Zsw8.ZP(str))
      return null; 
    if (str.startsWith(a(24005, -6306)))
      str = str.substring(str.indexOf("/", 7)); 
    return new Zax(paramZmzk, Zkb.Zy(str));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼OSÏ­åAUâ¼óïò¼Ü»_ùö9CâTl¡ª(Y%ÔÇ¡Þû{ä\\nÞæc°#]{¢æ°tÎðÍ\\féàý·r\\fé"N ½~t°\\rÏæúÀSdw»:PáW¤±ç¢bg\\f~óÝoÇu¿)ÃÏ>·õ6aE¾÷Çï¦ów}îÃ}~-»® úùJ::r2Õ#ú âM¼1Ð\\nÄÒr­#zA}élÛ?5÷eÆÄêA¾µÙq\\fFx:G¨HªäÆcD¹­û7û¡ÓøÝ°»%å³Þ\\nµN!6(§âj+¢H ûc#\\r\\tbWÛìÚBJBAxÖbÍ´nô¬0¹Sî4A|i|Ì T 9qS*¼zÜF¯<ýLþÅEÁVIeBL´ê¤qLËùðÆ½A«ëÖ@kç74;{Kz#Â¡?û;ÏÊâÍHÔâD'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #90
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
    //   68: ldc 'ôÀ\\t;ÙwèwBeL©]Ilé «×3e'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #23
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
    //   129: putstatic burp/Zxgg.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxgg.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #46
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #90
    //   234: goto -> 244
    //   237: bipush #48
    //   239: goto -> 244
    //   242: bipush #123
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5DC6) & 0xFFFF;
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
      char c = 'þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */