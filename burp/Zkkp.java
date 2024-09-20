package burp;

import java.awt.Component;
import java.util.List;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkkp {
  private final Ztwv ZY;
  
  private final Zl1k Zg;
  
  private final Zz0n ZR;
  
  private final Zslu Zn;
  
  private final Zbiv Zi;
  
  private final Zerg ZM;
  
  private final Zskh ZA;
  
  private final Zskh Zl;
  
  private final Zbnt Zp;
  
  private final Zmjm Zq;
  
  private final Zbc Zs;
  
  private final Zey9 ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkkp(Ztwv paramZtwv, Zl1k paramZl1k, Zz0n paramZz0n, Zslu paramZslu, Zbiv paramZbiv, Zerg paramZerg, Zskh paramZskh1, Zskh paramZskh2, Zbnt paramZbnt, Zmjm paramZmjm, Zbc paramZbc, Zey9 paramZey9) {
    this.ZY = paramZtwv;
    this.Zg = paramZl1k;
    this.ZR = paramZz0n;
    this.Zn = paramZslu;
    this.Zi = paramZbiv;
    this.ZM = paramZerg;
    this.ZA = paramZskh1;
    this.Zl = paramZskh2;
    this.Zp = paramZbnt;
    this.Zq = paramZmjm;
    this.Zs = paramZbc;
    this.ZI = paramZey9;
  }
  
  public boolean ZV(int paramInt, List<Zto7> paramList, Component paramComponent) {
    // Byte code:
    //   0: invokestatic Z_ : ()I
    //   3: istore #4
    //   5: invokestatic isEventDispatchThread : ()Z
    //   8: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   11: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   14: aload_2
    //   15: ifnull -> 34
    //   18: aload_2
    //   19: invokeinterface isEmpty : ()Z
    //   24: ifeq -> 40
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: iconst_0
    //   35: ireturn
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_2
    //   41: iconst_0
    //   42: invokeinterface get : (I)Ljava/lang/Object;
    //   47: checkcast burp/Zto7
    //   50: astore #5
    //   52: aload #5
    //   54: invokeinterface Zo3 : ()Lburp/Zbr;
    //   59: astore #6
    //   61: aconst_null
    //   62: astore #7
    //   64: aload #6
    //   66: ifnull -> 129
    //   69: aload #6
    //   71: invokevirtual Zz : ()Z
    //   74: ifeq -> 94
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload #6
    //   86: invokevirtual Zr : ()Lburp/Zstu;
    //   89: astore #7
    //   91: goto -> 129
    //   94: aload #6
    //   96: aload #5
    //   98: invokeinterface Zod : ()Lburp/Zmzk;
    //   103: aload_0
    //   104: getfield ZI : Lburp/Zey9;
    //   107: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   110: astore #8
    //   112: aload #8
    //   114: invokeinterface Zb : ()Lburp/Zefx;
    //   119: invokeinterface ZD : ()[B
    //   124: invokestatic Zy : ([B)Lburp/Zyf;
    //   127: astore #7
    //   129: aload #5
    //   131: invokeinterface ZoO : ()Lburp/Zstu;
    //   136: astore #8
    //   138: aload_3
    //   139: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   142: astore #9
    //   144: iload_1
    //   145: lookupswitch default -> 1836, 131328 -> 898, 131584 -> 867, 132608 -> 1091, 132672 -> 1157, 132736 -> 1265, 132992 -> 1014, 133008 -> 1063, 133120 -> 934, 133408 -> 685, 133440 -> 685, 134400 -> 479, 134416 -> 1464, 134784 -> 1551, 134864 -> 1662, 134912 -> 1374, 135168 -> 1412, 135424 -> 1412, 135680 -> 1754, 135936 -> 1786, 136448 -> 635, 136704 -> 647, 136960 -> 666, 524544 -> 1815, 524545 -> 1815, 524546 -> 1815, 524547 -> 1815, 524548 -> 1815, 524549 -> 1815, 524550 -> 1815, 524551 -> 1815, 524552 -> 1815, 524553 -> 1815, 536576 -> 428, 536592 -> 1803
    //   428: aload_3
    //   429: sipush #15737
    //   432: sipush #1030
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   441: ifne -> 453
    //   444: goto -> 451
    //   447: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   450: athrow
    //   451: iconst_1
    //   452: ireturn
    //   453: aload_0
    //   454: getfield ZY : Lburp/Ztwv;
    //   457: aload_0
    //   458: getfield Zg : Lburp/Zl1k;
    //   461: dup
    //   462: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   465: pop
    //   466: <illegal opcode> run : (Lburp/Zl1k;)Ljava/lang/Runnable;
    //   471: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   476: pop
    //   477: iconst_1
    //   478: ireturn
    //   479: aload_2
    //   480: invokeinterface size : ()I
    //   485: iconst_1
    //   486: if_icmpne -> 533
    //   489: aload_0
    //   490: getfield ZR : Lburp/Zz0n;
    //   493: invokeinterface ZD : ()Lburp/Zb0h;
    //   498: aload_2
    //   499: iconst_0
    //   500: invokeinterface get : (I)Ljava/lang/Object;
    //   505: checkcast burp/Zto7
    //   508: invokeinterface ZlL : ()Lburp/Zlit;
    //   513: invokeinterface toString : ()Ljava/lang/String;
    //   518: invokevirtual ZR : (Ljava/lang/String;)V
    //   521: iload #4
    //   523: ifeq -> 633
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   532: athrow
    //   533: new java/lang/StringBuilder
    //   536: dup
    //   537: invokespecial <init> : ()V
    //   540: astore #10
    //   542: aload_2
    //   543: invokeinterface iterator : ()Ljava/util/Iterator;
    //   548: astore #11
    //   550: aload #11
    //   552: invokeinterface hasNext : ()Z
    //   557: ifeq -> 616
    //   560: aload #11
    //   562: invokeinterface next : ()Ljava/lang/Object;
    //   567: checkcast burp/Zto7
    //   570: astore #12
    //   572: aload #12
    //   574: ifnonnull -> 584
    //   577: goto -> 550
    //   580: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   583: athrow
    //   584: aload #10
    //   586: aload #12
    //   588: invokeinterface ZlL : ()Lburp/Zlit;
    //   593: invokeinterface toString : ()Ljava/lang/String;
    //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: pop
    //   602: aload #10
    //   604: getstatic burp/Zlb0.Zp : Ljava/lang/String;
    //   607: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: pop
    //   611: iload #4
    //   613: ifeq -> 550
    //   616: aload_0
    //   617: getfield ZR : Lburp/Zz0n;
    //   620: invokeinterface ZD : ()Lburp/Zb0h;
    //   625: aload #10
    //   627: invokevirtual toString : ()Ljava/lang/String;
    //   630: invokevirtual ZR : (Ljava/lang/String;)V
    //   633: iconst_1
    //   634: ireturn
    //   635: aload_0
    //   636: getfield Zi : Lburp/Zbiv;
    //   639: aload #9
    //   641: aload_2
    //   642: invokevirtual ZH : (Ljava/awt/Component;Ljava/util/List;)V
    //   645: iconst_1
    //   646: ireturn
    //   647: getstatic burp/Zze0.LOGGER_DO_PASSIVE_SCAN : Lburp/Zze0;
    //   650: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   653: aload_0
    //   654: getfield Zi : Lburp/Zbiv;
    //   657: invokevirtual Zv : ()Lburp/Zz7i;
    //   660: aload_2
    //   661: invokevirtual Zg : (Ljava/util/List;)V
    //   664: iconst_1
    //   665: ireturn
    //   666: getstatic burp/Zze0.LOGGER_DO_ACTIVE_SCAN : Lburp/Zze0;
    //   669: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   672: aload_0
    //   673: getfield Zi : Lburp/Zbiv;
    //   676: invokevirtual Zv : ()Lburp/Zz7i;
    //   679: aload_2
    //   680: invokevirtual ZO : (Ljava/util/List;)V
    //   683: iconst_1
    //   684: ireturn
    //   685: aload_2
    //   686: invokeinterface size : ()I
    //   691: anewarray burp/Zlit
    //   694: astore #10
    //   696: iconst_0
    //   697: istore #11
    //   699: iload #11
    //   701: aload #10
    //   703: arraylength
    //   704: if_icmpge -> 796
    //   707: aload_2
    //   708: iload #11
    //   710: invokeinterface get : (I)Ljava/lang/Object;
    //   715: ifnonnull -> 725
    //   718: goto -> 788
    //   721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   724: athrow
    //   725: aload_2
    //   726: iload #11
    //   728: invokeinterface get : (I)Ljava/lang/Object;
    //   733: checkcast burp/Zto7
    //   736: invokeinterface ZlL : ()Lburp/Zlit;
    //   741: invokeinterface Zd4 : ()[B
    //   746: astore #12
    //   748: aload #12
    //   750: arraylength
    //   751: iconst_1
    //   752: if_icmpne -> 758
    //   755: aconst_null
    //   756: astore #12
    //   758: aload #10
    //   760: iload #11
    //   762: new burp/Zax
    //   765: dup
    //   766: aload_2
    //   767: iload #11
    //   769: invokeinterface get : (I)Ljava/lang/Object;
    //   774: checkcast burp/Zto7
    //   777: invokeinterface Zod : ()Lburp/Zmzk;
    //   782: aload #12
    //   784: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   787: aastore
    //   788: iinc #11, 1
    //   791: iload #4
    //   793: ifeq -> 699
    //   796: iload_1
    //   797: lookupswitch default -> 865, 133408 -> 824, 133440 -> 847
    //   824: aload_0
    //   825: getfield Zn : Lburp/Zslu;
    //   828: aload #10
    //   830: invokeinterface Zl : ([Lburp/Zlit;)V
    //   835: iload #4
    //   837: ifeq -> 865
    //   840: goto -> 847
    //   843: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   846: athrow
    //   847: aload_0
    //   848: getfield Zn : Lburp/Zslu;
    //   851: aload #10
    //   853: invokeinterface Zi : ([Lburp/Zlit;)V
    //   858: goto -> 865
    //   861: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   864: athrow
    //   865: iconst_1
    //   866: ireturn
    //   867: aload_0
    //   868: getfield ZM : Lburp/Zerg;
    //   871: invokevirtual Zg : ()Lburp/Zr00;
    //   874: aload #5
    //   876: invokeinterface ZlL : ()Lburp/Zlit;
    //   881: invokeinterface Zdz : ()Lburp/Zmzk;
    //   886: aload #7
    //   888: aconst_null
    //   889: aload #8
    //   891: invokeinterface Zp : (Lburp/Zmzk;Lburp/Zstu;Ljava/util/List;Lburp/Zstu;)V
    //   896: iconst_1
    //   897: ireturn
    //   898: aload_0
    //   899: getfield ZM : Lburp/Zerg;
    //   902: invokevirtual Zm : ()Lburp/Zx_a;
    //   905: aload #5
    //   907: invokeinterface ZlL : ()Lburp/Zlit;
    //   912: invokeinterface Zdz : ()Lburp/Zmzk;
    //   917: aload #6
    //   919: aload #5
    //   921: invokeinterface Zoe : ()Lburp/Zgsq;
    //   926: aconst_null
    //   927: invokeinterface Zk : (Lburp/Zmzk;Lburp/Zbr;Lburp/Zgsq;Ljava/lang/String;)V
    //   932: iconst_1
    //   933: ireturn
    //   934: aload #8
    //   936: ifnull -> 979
    //   939: aload_0
    //   940: getfield ZM : Lburp/Zerg;
    //   943: invokevirtual ZK : ()Lburp/Zbui;
    //   946: aload #5
    //   948: invokeinterface ZlL : ()Lburp/Zlit;
    //   953: invokeinterface Zdz : ()Lburp/Zmzk;
    //   958: aload #7
    //   960: aload #8
    //   962: invokeinterface ZP : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;)V
    //   967: iload #4
    //   969: ifeq -> 1012
    //   972: goto -> 979
    //   975: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   978: athrow
    //   979: aload_0
    //   980: getfield ZM : Lburp/Zerg;
    //   983: invokevirtual ZK : ()Lburp/Zbui;
    //   986: aload #5
    //   988: invokeinterface ZlL : ()Lburp/Zlit;
    //   993: invokeinterface Zdz : ()Lburp/Zmzk;
    //   998: aload #7
    //   1000: invokeinterface ZU : (Lburp/Zmzk;Lburp/Zstu;)V
    //   1005: goto -> 1012
    //   1008: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1011: athrow
    //   1012: iconst_1
    //   1013: ireturn
    //   1014: getstatic burp/Zeew.LOGGER : Lburp/Zeew;
    //   1017: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   1020: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   1023: aload_0
    //   1024: getfield ZM : Lburp/Zerg;
    //   1027: invokevirtual Ze : ()Lburp/Zeu0;
    //   1030: aload #5
    //   1032: invokeinterface Ze2 : ()Lburp/Zeew;
    //   1037: aload #5
    //   1039: invokeinterface Zod : ()Lburp/Zmzk;
    //   1044: aload #7
    //   1046: aload #8
    //   1048: aload #5
    //   1050: invokeinterface ZoB : ()J
    //   1055: aconst_null
    //   1056: invokeinterface ZN : (Lburp/Zeew;Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;JLjava/lang/String;)V
    //   1061: iconst_1
    //   1062: ireturn
    //   1063: aload_0
    //   1064: getfield ZM : Lburp/Zerg;
    //   1067: invokevirtual ZM : ()Lburp/Zgvn;
    //   1070: aload #5
    //   1072: invokeinterface Zod : ()Lburp/Zmzk;
    //   1077: aload #7
    //   1079: aload #8
    //   1081: getstatic burp/Zeew.LOGGER : Lburp/Zeew;
    //   1084: invokeinterface ZB : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;Lburp/Zzvh;)V
    //   1089: iconst_1
    //   1090: ireturn
    //   1091: aload #8
    //   1093: ifnull -> 1122
    //   1096: aload_0
    //   1097: getfield ZM : Lburp/Zerg;
    //   1100: invokevirtual ZH : ()Lburp/Zg_j;
    //   1103: aload #8
    //   1105: invokeinterface ZM : (Lburp/Zstu;)V
    //   1110: iload #4
    //   1112: ifeq -> 1155
    //   1115: goto -> 1122
    //   1118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1121: athrow
    //   1122: aload #7
    //   1124: ifnull -> 1155
    //   1127: goto -> 1134
    //   1130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1133: athrow
    //   1134: aload_0
    //   1135: getfield ZM : Lburp/Zerg;
    //   1138: invokevirtual ZH : ()Lburp/Zg_j;
    //   1141: aload #7
    //   1143: invokeinterface ZM : (Lburp/Zstu;)V
    //   1148: goto -> 1155
    //   1151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1154: athrow
    //   1155: iconst_1
    //   1156: ireturn
    //   1157: new java/util/ArrayList
    //   1160: dup
    //   1161: invokespecial <init> : ()V
    //   1164: astore #10
    //   1166: aload_2
    //   1167: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1172: astore #11
    //   1174: aload #11
    //   1176: invokeinterface hasNext : ()Z
    //   1181: ifeq -> 1232
    //   1184: aload #11
    //   1186: invokeinterface next : ()Ljava/lang/Object;
    //   1191: checkcast burp/Zto7
    //   1194: astore #12
    //   1196: aload #12
    //   1198: invokeinterface Zos : ()Lburp/Zstu;
    //   1203: astore #13
    //   1205: aload #13
    //   1207: ifnull -> 1227
    //   1210: aload #10
    //   1212: aload #13
    //   1214: invokeinterface add : (Ljava/lang/Object;)Z
    //   1219: pop
    //   1220: goto -> 1227
    //   1223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1226: athrow
    //   1227: iload #4
    //   1229: ifeq -> 1174
    //   1232: aload #10
    //   1234: invokeinterface isEmpty : ()Z
    //   1239: ifne -> 1263
    //   1242: aload_0
    //   1243: getfield ZM : Lburp/Zerg;
    //   1246: invokevirtual ZH : ()Lburp/Zg_j;
    //   1249: aload #10
    //   1251: invokeinterface Zk : (Ljava/util/List;)V
    //   1256: goto -> 1263
    //   1259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1262: athrow
    //   1263: iconst_1
    //   1264: ireturn
    //   1265: new java/util/ArrayList
    //   1268: dup
    //   1269: invokespecial <init> : ()V
    //   1272: astore #10
    //   1274: aload_2
    //   1275: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1280: astore #11
    //   1282: aload #11
    //   1284: invokeinterface hasNext : ()Z
    //   1289: ifeq -> 1341
    //   1292: aload #11
    //   1294: invokeinterface next : ()Ljava/lang/Object;
    //   1299: checkcast burp/Zto7
    //   1302: astore #12
    //   1304: aload #12
    //   1306: invokeinterface ZoO : ()Lburp/Zstu;
    //   1311: ifnull -> 1336
    //   1314: aload #10
    //   1316: aload #12
    //   1318: invokeinterface ZoO : ()Lburp/Zstu;
    //   1323: invokeinterface add : (Ljava/lang/Object;)Z
    //   1328: pop
    //   1329: goto -> 1336
    //   1332: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1335: athrow
    //   1336: iload #4
    //   1338: ifeq -> 1282
    //   1341: aload #10
    //   1343: invokeinterface isEmpty : ()Z
    //   1348: ifne -> 1372
    //   1351: aload_0
    //   1352: getfield ZM : Lburp/Zerg;
    //   1355: invokevirtual ZH : ()Lburp/Zg_j;
    //   1358: aload #10
    //   1360: invokeinterface Zk : (Ljava/util/List;)V
    //   1365: goto -> 1372
    //   1368: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1371: athrow
    //   1372: iconst_1
    //   1373: ireturn
    //   1374: aload #8
    //   1376: ifnull -> 1410
    //   1379: aload_0
    //   1380: getfield ZM : Lburp/Zerg;
    //   1383: invokevirtual ZJ : ()Lburp/Zt80;
    //   1386: aload #5
    //   1388: invokeinterface ZlL : ()Lburp/Zlit;
    //   1393: aload #8
    //   1395: aload #9
    //   1397: iconst_0
    //   1398: invokeinterface Zf : (Lburp/Zlit;Lburp/Zstu;Ljava/awt/Component;B)V
    //   1403: goto -> 1410
    //   1406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1409: athrow
    //   1410: iconst_1
    //   1411: ireturn
    //   1412: aload #7
    //   1414: ifnull -> 1462
    //   1417: aload_0
    //   1418: getfield ZM : Lburp/Zerg;
    //   1421: invokevirtual ZJ : ()Lburp/Zt80;
    //   1424: aload #5
    //   1426: invokeinterface ZlL : ()Lburp/Zlit;
    //   1431: aload #7
    //   1433: iload_1
    //   1434: ldc 135424
    //   1436: if_icmpne -> 1454
    //   1439: goto -> 1446
    //   1442: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1445: athrow
    //   1446: iconst_1
    //   1447: goto -> 1455
    //   1450: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1453: athrow
    //   1454: iconst_0
    //   1455: aload #9
    //   1457: invokeinterface Zj : (Lburp/Zlit;Lburp/Zstu;ZLjava/awt/Component;)V
    //   1462: iconst_1
    //   1463: ireturn
    //   1464: aload_2
    //   1465: invokeinterface size : ()I
    //   1470: iconst_1
    //   1471: if_icmpne -> 1549
    //   1474: aload #7
    //   1476: ifnull -> 1549
    //   1479: goto -> 1486
    //   1482: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1485: athrow
    //   1486: aload #5
    //   1488: invokeinterface Zod : ()Lburp/Zmzk;
    //   1493: aload #7
    //   1495: iconst_2
    //   1496: aload_0
    //   1497: getfield Zp : Lburp/Zbnt;
    //   1500: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   1503: astore #10
    //   1505: aload #10
    //   1507: aload #7
    //   1509: aload #9
    //   1511: aload_0
    //   1512: getfield ZA : Lburp/Zskh;
    //   1515: invokestatic ZP : (Lburp/Zz1p;Lburp/Zstu;Ljava/awt/Component;Lburp/Zskh;)Ljava/lang/String;
    //   1518: astore #11
    //   1520: aload #11
    //   1522: invokevirtual isEmpty : ()Z
    //   1525: ifne -> 1549
    //   1528: aload_0
    //   1529: getfield ZR : Lburp/Zz0n;
    //   1532: invokeinterface ZD : ()Lburp/Zb0h;
    //   1537: aload #11
    //   1539: invokevirtual ZR : (Ljava/lang/String;)V
    //   1542: goto -> 1549
    //   1545: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1548: athrow
    //   1549: iconst_1
    //   1550: ireturn
    //   1551: getstatic burp/Zrrh.LOGGER_SAVE_ITEM : Lburp/Zrrh;
    //   1554: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   1557: new burp/Zg89
    //   1560: dup
    //   1561: invokespecial <init> : ()V
    //   1564: astore #10
    //   1566: getstatic burp/Zg1m.DATA : Lburp/Zg1m;
    //   1569: aload_0
    //   1570: getfield Zq : Lburp/Zmjm;
    //   1573: aload #9
    //   1575: iconst_1
    //   1576: sipush #15739
    //   1579: sipush #-28522
    //   1582: invokestatic a : (II)Ljava/lang/String;
    //   1585: aload #10
    //   1587: invokestatic ZA : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;)Ljava/io/File;
    //   1590: astore #11
    //   1592: aload #11
    //   1594: ifnull -> 1660
    //   1597: aload_0
    //   1598: getfield ZY : Lburp/Ztwv;
    //   1601: new burp/Zzq9
    //   1604: dup
    //   1605: aload_2
    //   1606: iconst_0
    //   1607: anewarray burp/Zto7
    //   1610: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1615: checkcast [Lburp/Zll9;
    //   1618: aload #9
    //   1620: aload_0
    //   1621: getfield Zl : Lburp/Zskh;
    //   1624: aload #11
    //   1626: aload #10
    //   1628: invokevirtual Zi : ()Z
    //   1631: aload_0
    //   1632: getfield Zp : Lburp/Zbnt;
    //   1635: aload_0
    //   1636: getfield ZR : Lburp/Zz0n;
    //   1639: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   1644: invokespecial <init> : ([Lburp/Zll9;Ljava/awt/Window;Lburp/Zskh;Ljava/io/File;ZLburp/Zbnt;Lnet/portswigger/Zl0;)V
    //   1647: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   1652: pop
    //   1653: goto -> 1660
    //   1656: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1659: athrow
    //   1660: iconst_1
    //   1661: ireturn
    //   1662: sipush #15736
    //   1665: sipush #29359
    //   1668: invokestatic a : (II)Ljava/lang/String;
    //   1671: iconst_1
    //   1672: anewarray java/lang/Object
    //   1675: dup
    //   1676: iconst_0
    //   1677: aload_2
    //   1678: invokeinterface size : ()I
    //   1683: iconst_1
    //   1684: if_icmple -> 1703
    //   1687: sipush #15738
    //   1690: sipush #16015
    //   1693: invokestatic a : (II)Ljava/lang/String;
    //   1696: goto -> 1712
    //   1699: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1702: athrow
    //   1703: sipush #15742
    //   1706: sipush #15131
    //   1709: invokestatic a : (II)Ljava/lang/String;
    //   1712: aastore
    //   1713: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1716: astore #12
    //   1718: aload #9
    //   1720: aload #12
    //   1722: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   1725: ifeq -> 1752
    //   1728: aload_0
    //   1729: getfield ZY : Lburp/Ztwv;
    //   1732: aload_0
    //   1733: aload_2
    //   1734: <illegal opcode> run : (Lburp/Zkkp;Ljava/util/List;)Ljava/lang/Runnable;
    //   1739: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   1744: pop
    //   1745: goto -> 1752
    //   1748: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1751: athrow
    //   1752: iconst_1
    //   1753: ireturn
    //   1754: aload_2
    //   1755: aload_3
    //   1756: invokestatic ZS : (Ljava/util/List;Ljava/awt/Component;)Ljava/lang/String;
    //   1759: astore #12
    //   1761: aload #12
    //   1763: ifnull -> 1784
    //   1766: aload_2
    //   1767: aload #12
    //   1769: <illegal opcode> run : (Ljava/util/List;Ljava/lang/String;)Ljava/lang/Runnable;
    //   1774: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   1777: goto -> 1784
    //   1780: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1783: athrow
    //   1784: iconst_1
    //   1785: ireturn
    //   1786: aload_0
    //   1787: aload_2
    //   1788: invokevirtual ZQ : (Ljava/util/List;)V
    //   1791: getstatic burp/Zv8r.LOGGER_TABLE_HIGHLIGHT : Lburp/Zv8r;
    //   1794: getstatic burp/Zlxk.ZS : I
    //   1797: i2l
    //   1798: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   1801: iconst_1
    //   1802: ireturn
    //   1803: aload_0
    //   1804: aload_2
    //   1805: <illegal opcode> run : (Lburp/Zkkp;Ljava/util/List;)Ljava/lang/Runnable;
    //   1810: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   1813: iconst_1
    //   1814: ireturn
    //   1815: iload_1
    //   1816: invokestatic ZY : (I)V
    //   1819: aload_0
    //   1820: aload_2
    //   1821: invokevirtual ZQ : (Ljava/util/List;)V
    //   1824: getstatic burp/Zv8r.LOGGER_TABLE_HIGHLIGHT : Lburp/Zv8r;
    //   1827: getstatic burp/Zlxk.ZS : I
    //   1830: i2l
    //   1831: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   1834: iconst_1
    //   1835: ireturn
    //   1836: iconst_0
    //   1837: ireturn
    //   1838: astore #10
    //   1840: aload #10
    //   1842: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1845: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1848: iconst_0
    //   1849: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/lang/Exception
    //   18	36	36	java/lang/Exception
    //   64	77	80	java/lang/Exception
    //   144	444	447	java/lang/Exception
    //   144	452	1838	java/lang/Exception
    //   453	478	1838	java/lang/Exception
    //   479	526	529	java/lang/Exception
    //   479	634	1838	java/lang/Exception
    //   572	580	580	java/lang/Exception
    //   635	646	1838	java/lang/Exception
    //   647	665	1838	java/lang/Exception
    //   666	684	1838	java/lang/Exception
    //   685	866	1838	java/lang/Exception
    //   707	721	721	java/lang/Exception
    //   796	840	843	java/lang/Exception
    //   824	858	861	java/lang/Exception
    //   867	897	1838	java/lang/Exception
    //   898	933	1838	java/lang/Exception
    //   934	972	975	java/lang/Exception
    //   934	1013	1838	java/lang/Exception
    //   939	1005	1008	java/lang/Exception
    //   1014	1062	1838	java/lang/Exception
    //   1063	1090	1838	java/lang/Exception
    //   1091	1115	1118	java/lang/Exception
    //   1091	1156	1838	java/lang/Exception
    //   1096	1127	1130	java/lang/Exception
    //   1122	1148	1151	java/lang/Exception
    //   1157	1264	1838	java/lang/Exception
    //   1205	1220	1223	java/lang/Exception
    //   1232	1256	1259	java/lang/Exception
    //   1265	1373	1838	java/lang/Exception
    //   1304	1329	1332	java/lang/Exception
    //   1341	1365	1368	java/lang/Exception
    //   1374	1403	1406	java/lang/Exception
    //   1374	1411	1838	java/lang/Exception
    //   1412	1439	1442	java/lang/Exception
    //   1412	1463	1838	java/lang/Exception
    //   1417	1450	1450	java/lang/Exception
    //   1464	1479	1482	java/lang/Exception
    //   1464	1550	1838	java/lang/Exception
    //   1520	1542	1545	java/lang/Exception
    //   1551	1661	1838	java/lang/Exception
    //   1592	1653	1656	java/lang/Exception
    //   1662	1699	1699	java/lang/Exception
    //   1662	1753	1838	java/lang/Exception
    //   1718	1745	1748	java/lang/Exception
    //   1754	1785	1838	java/lang/Exception
    //   1761	1777	1780	java/lang/Exception
    //   1786	1802	1838	java/lang/Exception
    //   1803	1814	1838	java/lang/Exception
    //   1815	1835	1838	java/lang/Exception
    //   1836	1837	1838	java/lang/Exception
  }
  
  private void ZQ(List<Zto7> paramList) {
    SwingUtilities.invokeLater(paramList::lambda$addHighlight$5);
  }
  
  private void ZK(List<Zto7> paramList) {
    try {
      paramList.forEach(this::ZF);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZF(Zto7 paramZto7) {
    try {
      this.ZM.ZA().Zj(paramZto7.Zod(), paramZto7.Zos(), paramZto7.ZoO(), paramZto7.ZIx(), Zmtd.Zm(paramZto7.ZaP()));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static void lambda$addHighlight$5(List paramList) {
    paramList.forEach(Zkkp::lambda$addHighlight$4);
  }
  
  private static void lambda$addHighlight$4(Zto7 paramZto7) {
    paramZto7.ZB((byte)Zlxk.ZS);
  }
  
  private void lambda$handleAction$3(List<Zto7> paramList) {
    this.Zs.ZI(paramList);
  }
  
  private static void lambda$handleAction$2(List paramList, String paramString) {
    paramList.forEach(paramString::lambda$handleAction$1);
  }
  
  private static void lambda$handleAction$1(String paramString, Zto7 paramZto7) {
    paramZto7.Zxg(paramString);
  }
  
  private void lambda$handleAction$0(List<Zto7> paramList) {
    ZK(paramList);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'iÿ·¿dÄ³Í§+\\rÖÊíê\\rÃUV±20ËÚ3Õ#Ã,*W¤"3¾.CÞ&W¤YyxJCõò­Úö­úþàQ`'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #11
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #25
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
    //   64: goto -> 22
    //   67: ldc 'Ý·\Rëá/uS½ìK\É¶pÂO;÷#;\\fJ¹|H»G"A\\t#>7SÇ q'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #39
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #22
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zkkp.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zkkp.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #24
    //   224: goto -> 244
    //   227: bipush #32
    //   229: goto -> 244
    //   232: bipush #7
    //   234: goto -> 244
    //   237: bipush #48
    //   239: goto -> 244
    //   242: bipush #69
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3D7A) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */