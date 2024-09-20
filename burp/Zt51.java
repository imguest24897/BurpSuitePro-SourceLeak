package burp;

import java.awt.Component;
import java.util.List;
import java.util.TreeSet;

public class Zt51 implements Zkuu<Zeo2> {
  private final Zz0n ZO;
  
  private final Zt4u ZL;
  
  private final Zx8n Zq;
  
  private final Zgbj ZV;
  
  private final Zslu Zc;
  
  private final Zskh Zb;
  
  private final Zgb6 ZG;
  
  private final Ze8b Za;
  
  private final Zbiv ZP;
  
  private final Zbnt Zs;
  
  private final Ztwv ZX;
  
  private final Ztdq ZE;
  
  private final Zerg ZT;
  
  private static final String a;
  
  public Zt51(Zz0n paramZz0n, Zt4u paramZt4u, Zx8n paramZx8n, Zgbj paramZgbj, Zgb6 paramZgb6, Zslu paramZslu, Zskh paramZskh, Ze8b paramZe8b, Zbiv paramZbiv, Zbnt paramZbnt, Ztwv paramZtwv, Ztdq paramZtdq) {
    this.ZO = paramZz0n;
    this.ZL = paramZt4u;
    this.Zq = paramZx8n;
    this.ZV = paramZgbj;
    this.Zc = paramZslu;
    this.Zb = paramZskh;
    this.ZG = paramZgb6;
    this.Za = paramZe8b;
    this.ZP = paramZbiv;
    this.Zs = paramZbnt;
    this.ZX = paramZtwv;
    this.ZE = paramZtdq;
    this.ZT = paramZx8n.ZYa();
  }
  
  public boolean ZW(int paramInt, List<Zeo2> paramList, Component paramComponent) {
    // Byte code:
    //   0: invokestatic ZxL : ()I
    //   3: istore #4
    //   5: aload_2
    //   6: invokeinterface isEmpty : ()Z
    //   11: ifeq -> 20
    //   14: iconst_0
    //   15: ireturn
    //   16: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   19: athrow
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast burp/Zeo2
    //   30: astore #5
    //   32: aload #5
    //   34: invokeinterface Zos : ()Lburp/Zstu;
    //   39: astore #6
    //   41: aload #5
    //   43: invokeinterface ZoO : ()Lburp/Zstu;
    //   48: astore #7
    //   50: aload_3
    //   51: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   54: astore #8
    //   56: iload_1
    //   57: lookupswitch default -> 1429, 131328 -> 539, 131584 -> 508, 132608 -> 758, 132672 -> 824, 132736 -> 932, 132992 -> 663, 133008 -> 725, 133120 -> 583, 133376 -> 1333, 133408 -> 302, 133440 -> 302, 133632 -> 1372, 133888 -> 1352, 134144 -> 1392, 134416 -> 1131, 134432 -> 1206, 134784 -> 1232, 134912 -> 1041, 135168 -> 1079, 135424 -> 1079, 136448 -> 252, 136704 -> 264, 136960 -> 283
    //   252: aload_0
    //   253: getfield ZP : Lburp/Zbiv;
    //   256: aload #8
    //   258: aload_2
    //   259: invokevirtual ZH : (Ljava/awt/Component;Ljava/util/List;)V
    //   262: iconst_1
    //   263: ireturn
    //   264: getstatic burp/Zze0.PROXY_HISTORY_DO_PASSIVE_SCAN : Lburp/Zze0;
    //   267: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   270: aload_0
    //   271: getfield ZP : Lburp/Zbiv;
    //   274: invokevirtual Zv : ()Lburp/Zz7i;
    //   277: aload_2
    //   278: invokevirtual Zg : (Ljava/util/List;)V
    //   281: iconst_1
    //   282: ireturn
    //   283: getstatic burp/Zze0.PROXY_HISTORY_DO_ACTIVE_SCAN : Lburp/Zze0;
    //   286: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   289: aload_0
    //   290: getfield ZP : Lburp/Zbiv;
    //   293: invokevirtual Zv : ()Lburp/Zz7i;
    //   296: aload_2
    //   297: invokevirtual ZO : (Ljava/util/List;)V
    //   300: iconst_1
    //   301: ireturn
    //   302: aload_2
    //   303: invokeinterface size : ()I
    //   308: anewarray burp/Zlit
    //   311: astore #9
    //   313: iconst_0
    //   314: istore #10
    //   316: iload #10
    //   318: aload #9
    //   320: arraylength
    //   321: if_icmpge -> 413
    //   324: aload_2
    //   325: iload #10
    //   327: invokeinterface get : (I)Ljava/lang/Object;
    //   332: ifnonnull -> 342
    //   335: goto -> 405
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: aload_2
    //   343: iload #10
    //   345: invokeinterface get : (I)Ljava/lang/Object;
    //   350: checkcast burp/Zeo2
    //   353: invokeinterface ZlL : ()Lburp/Zlit;
    //   358: invokeinterface Zd4 : ()[B
    //   363: astore #11
    //   365: aload #11
    //   367: arraylength
    //   368: iconst_1
    //   369: if_icmpne -> 375
    //   372: aconst_null
    //   373: astore #11
    //   375: aload #9
    //   377: iload #10
    //   379: new burp/Zax
    //   382: dup
    //   383: aload_2
    //   384: iload #10
    //   386: invokeinterface get : (I)Ljava/lang/Object;
    //   391: checkcast burp/Zeo2
    //   394: invokeinterface Zod : ()Lburp/Zmzk;
    //   399: aload #11
    //   401: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   404: aastore
    //   405: iinc #10, 1
    //   408: iload #4
    //   410: ifeq -> 316
    //   413: iload_1
    //   414: lookupswitch default -> 506, 133408 -> 440, 133440 -> 488
    //   440: aload_0
    //   441: getfield Za : Lburp/Ze8b;
    //   444: aload_0
    //   445: getfield ZL : Lburp/Zt4u;
    //   448: invokevirtual ZA : ()Lburp/Zl04;
    //   451: aload_0
    //   452: getfield Zc : Lburp/Zslu;
    //   455: invokeinterface ZAy : ()I
    //   460: invokeinterface ZV : (Ljava/awt/Window;I)V
    //   465: aload_0
    //   466: getfield Zc : Lburp/Zslu;
    //   469: aload #9
    //   471: invokeinterface Zl : ([Lburp/Zlit;)V
    //   476: iload #4
    //   478: ifeq -> 506
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   487: athrow
    //   488: aload_0
    //   489: getfield Zc : Lburp/Zslu;
    //   492: aload #9
    //   494: invokeinterface Zi : ([Lburp/Zlit;)V
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   505: athrow
    //   506: iconst_1
    //   507: ireturn
    //   508: aload_0
    //   509: getfield ZT : Lburp/Zerg;
    //   512: invokevirtual Zg : ()Lburp/Zr00;
    //   515: aload #5
    //   517: invokeinterface ZlL : ()Lburp/Zlit;
    //   522: invokeinterface Zdz : ()Lburp/Zmzk;
    //   527: aload #6
    //   529: aconst_null
    //   530: aload #7
    //   532: invokeinterface Zp : (Lburp/Zmzk;Lburp/Zstu;Ljava/util/List;Lburp/Zstu;)V
    //   537: iconst_1
    //   538: ireturn
    //   539: aload_0
    //   540: getfield ZT : Lburp/Zerg;
    //   543: invokevirtual Zm : ()Lburp/Zx_a;
    //   546: aload #5
    //   548: invokeinterface ZlL : ()Lburp/Zlit;
    //   553: invokeinterface Zdz : ()Lburp/Zmzk;
    //   558: aload #5
    //   560: invokeinterface Zo3 : ()Lburp/Zbr;
    //   565: aconst_null
    //   566: checkcast java/lang/String
    //   569: aload #5
    //   571: invokeinterface ZAs : ()Ljava/lang/String;
    //   576: invokeinterface ZQ : (Lburp/Zmzk;Lburp/Zbr;Ljava/lang/String;Ljava/lang/String;)V
    //   581: iconst_1
    //   582: ireturn
    //   583: aload #7
    //   585: ifnull -> 628
    //   588: aload_0
    //   589: getfield ZT : Lburp/Zerg;
    //   592: invokevirtual ZK : ()Lburp/Zbui;
    //   595: aload #5
    //   597: invokeinterface ZlL : ()Lburp/Zlit;
    //   602: invokeinterface Zdz : ()Lburp/Zmzk;
    //   607: aload #6
    //   609: aload #7
    //   611: invokeinterface ZP : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;)V
    //   616: iload #4
    //   618: ifeq -> 661
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   627: athrow
    //   628: aload_0
    //   629: getfield ZT : Lburp/Zerg;
    //   632: invokevirtual ZK : ()Lburp/Zbui;
    //   635: aload #5
    //   637: invokeinterface ZlL : ()Lburp/Zlit;
    //   642: invokeinterface Zdz : ()Lburp/Zmzk;
    //   647: aload #6
    //   649: invokeinterface ZU : (Lburp/Zmzk;Lburp/Zstu;)V
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   660: athrow
    //   661: iconst_1
    //   662: ireturn
    //   663: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   666: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   669: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   672: aload_0
    //   673: getfield ZT : Lburp/Zerg;
    //   676: invokevirtual Ze : ()Lburp/Zeu0;
    //   679: aload_0
    //   680: getfield Zq : Lburp/Zx8n;
    //   683: invokeinterface ZYi : ()Lburp/Zeew;
    //   688: aload #5
    //   690: invokeinterface Zod : ()Lburp/Zmzk;
    //   695: aload #5
    //   697: invokeinterface Zo3 : ()Lburp/Zbr;
    //   702: aload #7
    //   704: aload #5
    //   706: invokeinterface ZoB : ()J
    //   711: aload #5
    //   713: invokeinterface ZAs : ()Ljava/lang/String;
    //   718: invokeinterface ZE : (Lburp/Zeew;Lburp/Zmzk;Lburp/Zbr;Lburp/Zstu;JLjava/lang/String;)V
    //   723: iconst_1
    //   724: ireturn
    //   725: aload_0
    //   726: getfield ZT : Lburp/Zerg;
    //   729: invokevirtual ZM : ()Lburp/Zgvn;
    //   732: aload #5
    //   734: invokeinterface Zod : ()Lburp/Zmzk;
    //   739: aload #5
    //   741: invokeinterface Zo3 : ()Lburp/Zbr;
    //   746: aload #7
    //   748: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   751: invokeinterface Za : (Lburp/Zmzk;Lburp/Zbr;Lburp/Zstu;Lburp/Zzvh;)V
    //   756: iconst_1
    //   757: ireturn
    //   758: aload #7
    //   760: ifnull -> 789
    //   763: aload_0
    //   764: getfield ZT : Lburp/Zerg;
    //   767: invokevirtual ZH : ()Lburp/Zg_j;
    //   770: aload #7
    //   772: invokeinterface ZM : (Lburp/Zstu;)V
    //   777: iload #4
    //   779: ifeq -> 822
    //   782: goto -> 789
    //   785: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   788: athrow
    //   789: aload #6
    //   791: ifnull -> 822
    //   794: goto -> 801
    //   797: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   800: athrow
    //   801: aload_0
    //   802: getfield ZT : Lburp/Zerg;
    //   805: invokevirtual ZH : ()Lburp/Zg_j;
    //   808: aload #6
    //   810: invokeinterface ZM : (Lburp/Zstu;)V
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   821: athrow
    //   822: iconst_1
    //   823: ireturn
    //   824: new java/util/ArrayList
    //   827: dup
    //   828: invokespecial <init> : ()V
    //   831: astore #9
    //   833: aload_2
    //   834: invokeinterface iterator : ()Ljava/util/Iterator;
    //   839: astore #10
    //   841: aload #10
    //   843: invokeinterface hasNext : ()Z
    //   848: ifeq -> 899
    //   851: aload #10
    //   853: invokeinterface next : ()Ljava/lang/Object;
    //   858: checkcast burp/Zeo2
    //   861: astore #11
    //   863: aload #11
    //   865: invokeinterface Zos : ()Lburp/Zstu;
    //   870: astore #12
    //   872: aload #12
    //   874: ifnull -> 894
    //   877: aload #9
    //   879: aload #12
    //   881: invokeinterface add : (Ljava/lang/Object;)Z
    //   886: pop
    //   887: goto -> 894
    //   890: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   893: athrow
    //   894: iload #4
    //   896: ifeq -> 841
    //   899: aload #9
    //   901: invokeinterface isEmpty : ()Z
    //   906: ifne -> 930
    //   909: aload_0
    //   910: getfield ZT : Lburp/Zerg;
    //   913: invokevirtual ZH : ()Lburp/Zg_j;
    //   916: aload #9
    //   918: invokeinterface Zk : (Ljava/util/List;)V
    //   923: goto -> 930
    //   926: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   929: athrow
    //   930: iconst_1
    //   931: ireturn
    //   932: new java/util/ArrayList
    //   935: dup
    //   936: invokespecial <init> : ()V
    //   939: astore #9
    //   941: aload_2
    //   942: invokeinterface iterator : ()Ljava/util/Iterator;
    //   947: astore #10
    //   949: aload #10
    //   951: invokeinterface hasNext : ()Z
    //   956: ifeq -> 1008
    //   959: aload #10
    //   961: invokeinterface next : ()Ljava/lang/Object;
    //   966: checkcast burp/Zeo2
    //   969: astore #11
    //   971: aload #11
    //   973: invokeinterface ZX7 : ()Lburp/Zstu;
    //   978: ifnull -> 1003
    //   981: aload #9
    //   983: aload #11
    //   985: invokeinterface ZX7 : ()Lburp/Zstu;
    //   990: invokeinterface add : (Ljava/lang/Object;)Z
    //   995: pop
    //   996: goto -> 1003
    //   999: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1002: athrow
    //   1003: iload #4
    //   1005: ifeq -> 949
    //   1008: aload #9
    //   1010: invokeinterface isEmpty : ()Z
    //   1015: ifne -> 1039
    //   1018: aload_0
    //   1019: getfield ZT : Lburp/Zerg;
    //   1022: invokevirtual ZH : ()Lburp/Zg_j;
    //   1025: aload #9
    //   1027: invokeinterface Zk : (Ljava/util/List;)V
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1038: athrow
    //   1039: iconst_1
    //   1040: ireturn
    //   1041: aload #7
    //   1043: ifnull -> 1077
    //   1046: aload_0
    //   1047: getfield ZT : Lburp/Zerg;
    //   1050: invokevirtual ZJ : ()Lburp/Zt80;
    //   1053: aload #5
    //   1055: invokeinterface ZlL : ()Lburp/Zlit;
    //   1060: aload #7
    //   1062: aload #8
    //   1064: iconst_0
    //   1065: invokeinterface Zf : (Lburp/Zlit;Lburp/Zstu;Ljava/awt/Component;B)V
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1076: athrow
    //   1077: iconst_1
    //   1078: ireturn
    //   1079: aload #6
    //   1081: ifnull -> 1129
    //   1084: aload_0
    //   1085: getfield ZT : Lburp/Zerg;
    //   1088: invokevirtual ZJ : ()Lburp/Zt80;
    //   1091: aload #5
    //   1093: invokeinterface ZlL : ()Lburp/Zlit;
    //   1098: aload #6
    //   1100: iload_1
    //   1101: ldc 135424
    //   1103: if_icmpne -> 1121
    //   1106: goto -> 1113
    //   1109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1112: athrow
    //   1113: iconst_1
    //   1114: goto -> 1122
    //   1117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1120: athrow
    //   1121: iconst_0
    //   1122: aload #8
    //   1124: invokeinterface Zj : (Lburp/Zlit;Lburp/Zstu;ZLjava/awt/Component;)V
    //   1129: iconst_1
    //   1130: ireturn
    //   1131: aload_2
    //   1132: invokeinterface size : ()I
    //   1137: iconst_1
    //   1138: if_icmpne -> 1204
    //   1141: aload #5
    //   1143: invokeinterface Zod : ()Lburp/Zmzk;
    //   1148: aload #6
    //   1150: iconst_2
    //   1151: aload_0
    //   1152: getfield Zs : Lburp/Zbnt;
    //   1155: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   1158: astore #9
    //   1160: aload #9
    //   1162: aload #6
    //   1164: aload #8
    //   1166: aload_0
    //   1167: getfield Zb : Lburp/Zskh;
    //   1170: invokestatic ZP : (Lburp/Zz1p;Lburp/Zstu;Ljava/awt/Component;Lburp/Zskh;)Ljava/lang/String;
    //   1173: astore #10
    //   1175: aload #10
    //   1177: invokevirtual isEmpty : ()Z
    //   1180: ifne -> 1204
    //   1183: aload_0
    //   1184: getfield ZO : Lburp/Zz0n;
    //   1187: invokeinterface ZD : ()Lburp/Zb0h;
    //   1192: aload #10
    //   1194: invokevirtual ZR : (Ljava/lang/String;)V
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1203: athrow
    //   1204: iconst_1
    //   1205: ireturn
    //   1206: getstatic burp/Zrrh.PROXY_HISTORY_COPY_LINKS : Lburp/Zrrh;
    //   1209: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   1212: aload_0
    //   1213: getfield ZX : Lburp/Ztwv;
    //   1216: aload_0
    //   1217: aload_3
    //   1218: aload_2
    //   1219: <illegal opcode> run : (Lburp/Zt51;Ljava/awt/Component;Ljava/util/List;)Ljava/lang/Runnable;
    //   1224: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   1229: pop
    //   1230: iconst_1
    //   1231: ireturn
    //   1232: getstatic burp/Zrrh.PROXY_HISTORY_SAVE_ITEM : Lburp/Zrrh;
    //   1235: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   1238: new burp/Zg89
    //   1241: dup
    //   1242: invokespecial <init> : ()V
    //   1245: astore #9
    //   1247: getstatic burp/Zg1m.DATA : Lburp/Zg1m;
    //   1250: aload_0
    //   1251: getfield ZL : Lburp/Zt4u;
    //   1254: aload #8
    //   1256: iconst_1
    //   1257: getstatic burp/Zt51.a : Ljava/lang/String;
    //   1260: aload #9
    //   1262: invokestatic ZA : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;)Ljava/io/File;
    //   1265: astore #10
    //   1267: aload #10
    //   1269: ifnull -> 1331
    //   1272: aload_0
    //   1273: getfield ZX : Lburp/Ztwv;
    //   1276: new burp/Zzq9
    //   1279: dup
    //   1280: aload_2
    //   1281: invokestatic ZZ : (Ljava/util/List;)[Lburp/Zeo2;
    //   1284: aload #8
    //   1286: aload_0
    //   1287: getfield Zq : Lburp/Zx8n;
    //   1290: invokeinterface ZY4 : ()Lburp/Zskh;
    //   1295: aload #10
    //   1297: aload #9
    //   1299: invokevirtual Zi : ()Z
    //   1302: aload_0
    //   1303: getfield Zs : Lburp/Zbnt;
    //   1306: aload_0
    //   1307: getfield ZO : Lburp/Zz0n;
    //   1310: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   1315: invokespecial <init> : ([Lburp/Zll9;Ljava/awt/Window;Lburp/Zskh;Ljava/io/File;ZLburp/Zbnt;Lnet/portswigger/Zl0;)V
    //   1318: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   1323: pop
    //   1324: goto -> 1331
    //   1327: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1330: athrow
    //   1331: iconst_1
    //   1332: ireturn
    //   1333: aload_0
    //   1334: getfield ZE : Lburp/Ztdq;
    //   1337: aload #8
    //   1339: aload #5
    //   1341: invokeinterface ZlL : ()Lburp/Zlit;
    //   1346: invokevirtual Za : (Ljava/awt/Window;Lburp/Zlit;)Lburp/Zl44;
    //   1349: pop
    //   1350: iconst_1
    //   1351: ireturn
    //   1352: aload_0
    //   1353: getfield ZV : Lburp/Zgbj;
    //   1356: aload #8
    //   1358: aload #5
    //   1360: invokeinterface ZlL : ()Lburp/Zlit;
    //   1365: invokeinterface Zt : (Ljava/awt/Window;Lburp/Zlit;)V
    //   1370: iconst_1
    //   1371: ireturn
    //   1372: aload_0
    //   1373: getfield ZV : Lburp/Zgbj;
    //   1376: aload #8
    //   1378: aload #5
    //   1380: invokeinterface ZlL : ()Lburp/Zlit;
    //   1385: invokeinterface Zl : (Ljava/awt/Window;Lburp/Zlit;)V
    //   1390: iconst_1
    //   1391: ireturn
    //   1392: aload_0
    //   1393: getfield ZV : Lburp/Zgbj;
    //   1396: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   1399: aload #8
    //   1401: aload #5
    //   1403: invokeinterface Zod : ()Lburp/Zmzk;
    //   1408: aload #5
    //   1410: invokeinterface Zo3 : ()Lburp/Zbr;
    //   1415: aload #5
    //   1417: invokeinterface Zoe : ()Lburp/Zgsq;
    //   1422: invokeinterface ZC : (Lburp/Zeew;Ljava/awt/Window;Lburp/Zmzk;Lburp/Zbr;Lburp/Zgsq;)V
    //   1427: iconst_1
    //   1428: ireturn
    //   1429: iconst_0
    //   1430: ireturn
    //   1431: astore #5
    //   1433: aload #5
    //   1435: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1438: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1441: iconst_0
    //   1442: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	16	16	java/lang/Exception
    //   20	263	1431	java/lang/Exception
    //   264	282	1431	java/lang/Exception
    //   283	301	1431	java/lang/Exception
    //   302	507	1431	java/lang/Exception
    //   324	338	338	java/lang/Exception
    //   413	481	484	java/lang/Exception
    //   440	499	502	java/lang/Exception
    //   508	538	1431	java/lang/Exception
    //   539	582	1431	java/lang/Exception
    //   583	621	624	java/lang/Exception
    //   583	662	1431	java/lang/Exception
    //   588	654	657	java/lang/Exception
    //   663	724	1431	java/lang/Exception
    //   725	757	1431	java/lang/Exception
    //   758	782	785	java/lang/Exception
    //   758	823	1431	java/lang/Exception
    //   763	794	797	java/lang/Exception
    //   789	815	818	java/lang/Exception
    //   824	931	1431	java/lang/Exception
    //   872	887	890	java/lang/Exception
    //   899	923	926	java/lang/Exception
    //   932	1040	1431	java/lang/Exception
    //   971	996	999	java/lang/Exception
    //   1008	1032	1035	java/lang/Exception
    //   1041	1070	1073	java/lang/Exception
    //   1041	1078	1431	java/lang/Exception
    //   1079	1106	1109	java/lang/Exception
    //   1079	1130	1431	java/lang/Exception
    //   1084	1117	1117	java/lang/Exception
    //   1131	1205	1431	java/lang/Exception
    //   1175	1197	1200	java/lang/Exception
    //   1206	1231	1431	java/lang/Exception
    //   1232	1332	1431	java/lang/Exception
    //   1267	1324	1327	java/lang/Exception
    //   1333	1351	1431	java/lang/Exception
    //   1352	1371	1431	java/lang/Exception
    //   1372	1391	1431	java/lang/Exception
    //   1392	1428	1431	java/lang/Exception
    //   1429	1430	1431	java/lang/Exception
  }
  
  static Zeo2[] ZZ(List<Zeo2> paramList) {
    Zeo2[] arrayOfZeo2 = new Zeo2[paramList.size()];
    return paramList.<Zeo2>toArray(arrayOfZeo2);
  }
  
  private void lambda$handleAction$0(Component paramComponent, List paramList) {
    Zr7r zr7r = new Zr7r(paramComponent, this.ZX);
    Ztdi ztdi = this.ZT.ZA().ZZ();
    TreeSet<String> treeSet = new TreeSet();
    int i = Zb56.ZxL();
    float f1 = 0.0F;
    float f2 = 100.0F / paramList.size();
    for (Zeo2 zeo2 : paramList) {
      if (zeo2 == null)
        continue; 
      Zstu zstu = zeo2.ZX7();
      if (zstu == null)
        continue; 
      byte[] arrayOfByte = zstu.ZiD();
      Zs68 zs68 = Zmre.ZK(null, arrayOfByte, Zt0k.HTML_ANALYSIS, this.Zs);
      for (Zsq8 zsq8 : Zm46.Zl(zeo2.ZlL(), zs68, zstu, arrayOfByte, ztdi, this.Zs, this.ZG.ZU0())) {
        treeSet.add(zsq8.ZZ.toString());
        if (i != 0)
          break; 
      } 
      if (!zr7r.ZL((int)f1))
        break; 
      f1 += f2;
      if (i != 0)
        break; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : treeSet) {
      stringBuilder.append(str);
      stringBuilder.append(Zlb0.Zp);
      if (i != 0)
        break; 
    } 
    this.ZO.ZD().ZR(stringBuilder.toString());
    zr7r.Zi();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #83
    //   2: ldc 'Nsy%FDv'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt51.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #23
    //   82: goto -> 112
    //   85: bipush #53
    //   87: goto -> 112
    //   90: bipush #113
    //   92: goto -> 112
    //   95: bipush #69
    //   97: goto -> 112
    //   100: bipush #73
    //   102: goto -> 112
    //   105: bipush #61
    //   107: goto -> 112
    //   110: bipush #118
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt51.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */