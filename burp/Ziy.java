package burp;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Ziy implements Zzyl {
  private final Zr_4 Zl;
  
  private final Zbws Zm;
  
  private final Zmue ZO;
  
  private final Zslu Zf;
  
  private final Zbiv Zp;
  
  private final Zerg ZS;
  
  private final Zbp5 ZT;
  
  private final Zm6x Zg;
  
  public Ziy(Zr_4 paramZr_4, Zbws paramZbws, Zmue paramZmue, Zslu paramZslu, Zbiv paramZbiv, Zerg paramZerg, Zbp5 paramZbp5, Zm6x paramZm6x) {
    this.Zl = paramZr_4;
    this.Zm = paramZbws;
    this.ZO = paramZmue;
    this.Zf = paramZslu;
    this.Zp = paramZbiv;
    this.ZS = paramZerg;
    this.ZT = paramZbp5;
    this.Zg = paramZm6x;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return ZQ(paramInt, ZU(), null);
  }
  
  public boolean ZQ(int paramInt, List<Ztf_<?>> paramList, Point paramPoint) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
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
    //   40: iload_1
    //   41: lookupswitch default -> 1680, 131328 -> 779, 131584 -> 1005, 132608 -> 712, 132672 -> 550, 132736 -> 617, 132992 -> 1154, 133120 -> 1319, 133408 -> 268, 133440 -> 268, 134912 -> 1591, 135168 -> 1474, 135424 -> 1474, 135680 -> 399, 135936 -> 463, 136448 -> 501, 136704 -> 518, 136960 -> 534, 524544 -> 480, 524545 -> 480, 524546 -> 480, 524547 -> 480, 524548 -> 480, 524549 -> 480, 524550 -> 480, 524551 -> 480, 524552 -> 480, 524553 -> 480
    //   268: aload_2
    //   269: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   274: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   279: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   284: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   289: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   294: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   299: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   304: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   309: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   314: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   319: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   324: checkcast [Lburp/Zlit;
    //   327: astore #5
    //   329: iload_1
    //   330: lookupswitch default -> 397, 133408 -> 356, 133440 -> 379
    //   356: aload_0
    //   357: getfield Zf : Lburp/Zslu;
    //   360: aload #5
    //   362: invokeinterface Zl : ([Lburp/Zlit;)V
    //   367: iload #4
    //   369: ifne -> 397
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   378: athrow
    //   379: aload_0
    //   380: getfield Zf : Lburp/Zslu;
    //   383: aload #5
    //   385: invokeinterface Zi : ([Lburp/Zlit;)V
    //   390: goto -> 397
    //   393: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   396: athrow
    //   397: iconst_1
    //   398: ireturn
    //   399: aload_2
    //   400: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   405: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   410: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   415: invokestatic toList : ()Ljava/util/stream/Collector;
    //   418: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   423: checkcast java/util/List
    //   426: astore #5
    //   428: aload #5
    //   430: invokestatic identity : ()Ljava/util/function/Function;
    //   433: getstatic burp/Zv8r.PROXY_INTERCEPT_NOTES_ADDED_VIA_CONTEXT_MENU : Lburp/Zv8r;
    //   436: aload_0
    //   437: getfield Zm : Lburp/Zbws;
    //   440: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   443: aload_0
    //   444: aload_3
    //   445: <illegal opcode> accept : (Lburp/Ziy;Ljava/awt/Point;)Ljava/util/function/Consumer;
    //   450: aload_0
    //   451: aload #5
    //   453: <illegal opcode> run : (Lburp/Ziy;Ljava/util/List;)Ljava/lang/Runnable;
    //   458: invokestatic ZB : (Ljava/util/List;Ljava/util/function/Function;Lnet/portswigger/Zzr;Ljava/awt/Component;Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   461: iconst_1
    //   462: ireturn
    //   463: aload_0
    //   464: aload_2
    //   465: invokevirtual ZN : (Ljava/util/List;)V
    //   468: getstatic burp/Zv8r.PROXY_INTERCEPT_ADD_HIGHLIGHT : Lburp/Zv8r;
    //   471: getstatic burp/Zlxk.ZS : I
    //   474: i2l
    //   475: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   478: iconst_1
    //   479: ireturn
    //   480: iload_1
    //   481: invokestatic ZY : (I)V
    //   484: aload_0
    //   485: aload_2
    //   486: invokevirtual ZN : (Ljava/util/List;)V
    //   489: getstatic burp/Zv8r.PROXY_INTERCEPT_ADD_HIGHLIGHT : Lburp/Zv8r;
    //   492: getstatic burp/Zlxk.ZS : I
    //   495: i2l
    //   496: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   499: iconst_1
    //   500: ireturn
    //   501: aload_0
    //   502: getfield Zp : Lburp/Zbiv;
    //   505: aload_0
    //   506: getfield Zm : Lburp/Zbws;
    //   509: aload_2
    //   510: invokestatic ZQ : (Ljava/util/List;)Ljava/util/List;
    //   513: invokevirtual ZH : (Ljava/awt/Component;Ljava/util/List;)V
    //   516: iconst_1
    //   517: ireturn
    //   518: aload_0
    //   519: getfield Zp : Lburp/Zbiv;
    //   522: invokevirtual Zv : ()Lburp/Zz7i;
    //   525: aload_2
    //   526: invokestatic ZQ : (Ljava/util/List;)Ljava/util/List;
    //   529: invokevirtual Zg : (Ljava/util/List;)V
    //   532: iconst_1
    //   533: ireturn
    //   534: aload_0
    //   535: getfield Zp : Lburp/Zbiv;
    //   538: invokevirtual Zv : ()Lburp/Zz7i;
    //   541: aload_2
    //   542: invokestatic ZQ : (Ljava/util/List;)Ljava/util/List;
    //   545: invokevirtual ZO : (Ljava/util/List;)V
    //   548: iconst_1
    //   549: ireturn
    //   550: aload_2
    //   551: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   556: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   561: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   566: aload_0
    //   567: <illegal opcode> apply : (Lburp/Ziy;)Ljava/util/function/Function;
    //   572: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   577: invokeinterface toList : ()Ljava/util/List;
    //   582: astore #5
    //   584: aload #5
    //   586: invokeinterface isEmpty : ()Z
    //   591: ifne -> 615
    //   594: aload_0
    //   595: getfield ZS : Lburp/Zerg;
    //   598: invokevirtual ZH : ()Lburp/Zg_j;
    //   601: aload #5
    //   603: invokeinterface Zk : (Ljava/util/List;)V
    //   608: goto -> 615
    //   611: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   614: athrow
    //   615: iconst_1
    //   616: ireturn
    //   617: aload_2
    //   618: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   623: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   628: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   633: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   638: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   643: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   648: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   653: aload_0
    //   654: getfield Zl : Lburp/Zr_4;
    //   657: dup
    //   658: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   661: pop
    //   662: <illegal opcode> apply : (Lburp/Zr_4;)Ljava/util/function/Function;
    //   667: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   672: invokeinterface toList : ()Ljava/util/List;
    //   677: astore #5
    //   679: aload #5
    //   681: invokeinterface isEmpty : ()Z
    //   686: ifne -> 710
    //   689: aload_0
    //   690: getfield ZS : Lburp/Zerg;
    //   693: invokevirtual ZH : ()Lburp/Zg_j;
    //   696: aload #5
    //   698: invokeinterface Zk : (Ljava/util/List;)V
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   709: athrow
    //   710: iconst_1
    //   711: ireturn
    //   712: aload_2
    //   713: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   718: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   723: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   728: aload_0
    //   729: <illegal opcode> apply : (Lburp/Ziy;)Ljava/util/function/Function;
    //   734: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   739: invokeinterface toList : ()Ljava/util/List;
    //   744: astore #5
    //   746: aload #5
    //   748: invokeinterface isEmpty : ()Z
    //   753: ifne -> 777
    //   756: aload_0
    //   757: getfield ZS : Lburp/Zerg;
    //   760: invokevirtual ZH : ()Lburp/Zg_j;
    //   763: aload #5
    //   765: invokeinterface Zk : (Ljava/util/List;)V
    //   770: goto -> 777
    //   773: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   776: athrow
    //   777: iconst_1
    //   778: ireturn
    //   779: aload_2
    //   780: invokeinterface size : ()I
    //   785: iconst_1
    //   786: if_icmpne -> 1003
    //   789: aload_2
    //   790: invokeinterface getFirst : ()Ljava/lang/Object;
    //   795: checkcast burp/Ztf_
    //   798: astore #5
    //   800: aload #5
    //   802: instanceof burp/Zsnu
    //   805: ifeq -> 912
    //   808: aload #5
    //   810: checkcast burp/Zsnu
    //   813: astore #6
    //   815: aload #6
    //   817: invokevirtual ZH : ()Lburp/Zzh2;
    //   820: astore #8
    //   822: aload_0
    //   823: getfield ZT : Lburp/Zbp5;
    //   826: aload #8
    //   828: invokevirtual ZJ : (Lburp/Zzh2;)Lburp/Zkod;
    //   831: astore #9
    //   833: aload_0
    //   834: getfield Zl : Lburp/Zr_4;
    //   837: aload #6
    //   839: invokevirtual Zm : ()[B
    //   842: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   847: astore #10
    //   849: aload #6
    //   851: invokevirtual Zc : ()Z
    //   854: ifeq -> 867
    //   857: getstatic burp/Ze3o.CLIENT_TO_SERVER : Lburp/Ze3o;
    //   860: goto -> 870
    //   863: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   866: athrow
    //   867: getstatic burp/Ze3o.SERVER_TO_CLIENT : Lburp/Ze3o;
    //   870: astore #11
    //   872: aload_0
    //   873: getfield ZS : Lburp/Zerg;
    //   876: invokevirtual Zm : ()Lburp/Zx_a;
    //   879: aload #9
    //   881: aload #8
    //   883: invokeinterface ZGz : ()B
    //   888: aload #8
    //   890: invokeinterface ZGP : ()Lnet/portswigger/Zo;
    //   895: aload #11
    //   897: aload #10
    //   899: invokevirtual Zv : (BLnet/portswigger/Zo;Lburp/Ze3o;Lburp/Zstu;)Lburp/Zkmj;
    //   902: invokeinterface Zf : (Lburp/Zkmj;)V
    //   907: iload #4
    //   909: ifne -> 1003
    //   912: aload #5
    //   914: instanceof burp/Zm13
    //   917: ifeq -> 1003
    //   920: goto -> 927
    //   923: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   926: athrow
    //   927: aload #5
    //   929: checkcast burp/Zm13
    //   932: astore #7
    //   934: aload #7
    //   936: invokevirtual Za : ()Lburp/Zgu3;
    //   939: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   942: if_acmpne -> 966
    //   945: aload_0
    //   946: getfield Zl : Lburp/Zr_4;
    //   949: aload #7
    //   951: invokevirtual Zm : ()[B
    //   954: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   959: goto -> 976
    //   962: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   965: athrow
    //   966: aload #7
    //   968: invokevirtual ZF : ()Lburp/Zeo2;
    //   971: invokeinterface Zos : ()Lburp/Zstu;
    //   976: astore #8
    //   978: aload_0
    //   979: getfield ZS : Lburp/Zerg;
    //   982: invokevirtual Zm : ()Lburp/Zx_a;
    //   985: aload #7
    //   987: invokevirtual ZJ : ()Lburp/Zmzk;
    //   990: aload #8
    //   992: aconst_null
    //   993: aload #7
    //   995: invokevirtual ZAs : ()Ljava/lang/String;
    //   998: invokeinterface Ze : (Lburp/Zmzk;Lburp/Zstu;Ljava/lang/String;Ljava/lang/String;)V
    //   1003: iconst_1
    //   1004: ireturn
    //   1005: aload_2
    //   1006: invokeinterface size : ()I
    //   1011: iconst_1
    //   1012: if_icmpne -> 1152
    //   1015: aload_2
    //   1016: invokeinterface getFirst : ()Ljava/lang/Object;
    //   1021: astore #6
    //   1023: aload #6
    //   1025: instanceof burp/Zm13
    //   1028: ifeq -> 1152
    //   1031: aload #6
    //   1033: checkcast burp/Zm13
    //   1036: astore #5
    //   1038: aload_0
    //   1039: getfield ZS : Lburp/Zerg;
    //   1042: invokevirtual Zg : ()Lburp/Zr00;
    //   1045: astore #6
    //   1047: aload #5
    //   1049: invokevirtual Za : ()Lburp/Zgu3;
    //   1052: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1055: if_acmpne -> 1079
    //   1058: aload_0
    //   1059: getfield Zl : Lburp/Zr_4;
    //   1062: aload #5
    //   1064: invokevirtual Zm : ()[B
    //   1067: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1072: goto -> 1089
    //   1075: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1078: athrow
    //   1079: aload #5
    //   1081: invokevirtual ZF : ()Lburp/Zeo2;
    //   1084: invokeinterface Zos : ()Lburp/Zstu;
    //   1089: astore #7
    //   1091: aload #5
    //   1093: invokevirtual Za : ()Lburp/Zgu3;
    //   1096: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1099: if_acmpne -> 1119
    //   1102: aload #5
    //   1104: invokevirtual ZF : ()Lburp/Zeo2;
    //   1107: invokeinterface ZoO : ()Lburp/Zstu;
    //   1112: goto -> 1133
    //   1115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1118: athrow
    //   1119: aload_0
    //   1120: getfield Zl : Lburp/Zr_4;
    //   1123: aload #5
    //   1125: invokevirtual Zm : ()[B
    //   1128: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1133: astore #8
    //   1135: aload #6
    //   1137: aload #5
    //   1139: invokevirtual ZJ : ()Lburp/Zmzk;
    //   1142: aload #7
    //   1144: aconst_null
    //   1145: aload #8
    //   1147: invokeinterface Zp : (Lburp/Zmzk;Lburp/Zstu;Ljava/util/List;Lburp/Zstu;)V
    //   1152: iconst_1
    //   1153: ireturn
    //   1154: aload_2
    //   1155: invokeinterface size : ()I
    //   1160: iconst_1
    //   1161: if_icmpne -> 1317
    //   1164: aload_2
    //   1165: invokeinterface getFirst : ()Ljava/lang/Object;
    //   1170: astore #6
    //   1172: aload #6
    //   1174: instanceof burp/Zm13
    //   1177: ifeq -> 1317
    //   1180: aload #6
    //   1182: checkcast burp/Zm13
    //   1185: astore #5
    //   1187: aload #5
    //   1189: invokevirtual ZF : ()Lburp/Zeo2;
    //   1192: astore #6
    //   1194: aload #5
    //   1196: invokevirtual Za : ()Lburp/Zgu3;
    //   1199: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1202: if_acmpne -> 1226
    //   1205: aload_0
    //   1206: getfield Zl : Lburp/Zr_4;
    //   1209: aload #5
    //   1211: invokevirtual Zm : ()[B
    //   1214: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1219: goto -> 1233
    //   1222: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1225: athrow
    //   1226: aload #6
    //   1228: invokeinterface Zos : ()Lburp/Zstu;
    //   1233: astore #7
    //   1235: aload #5
    //   1237: invokevirtual Za : ()Lburp/Zgu3;
    //   1240: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1243: if_acmpne -> 1263
    //   1246: aload #5
    //   1248: invokevirtual ZF : ()Lburp/Zeo2;
    //   1251: invokeinterface ZoO : ()Lburp/Zstu;
    //   1256: goto -> 1277
    //   1259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1262: athrow
    //   1263: aload_0
    //   1264: getfield Zl : Lburp/Zr_4;
    //   1267: aload #5
    //   1269: invokevirtual Zm : ()[B
    //   1272: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1277: astore #8
    //   1279: aload_0
    //   1280: getfield ZS : Lburp/Zerg;
    //   1283: invokevirtual Ze : ()Lburp/Zeu0;
    //   1286: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   1289: aload #6
    //   1291: invokeinterface Zod : ()Lburp/Zmzk;
    //   1296: aload #7
    //   1298: aload #8
    //   1300: aload #6
    //   1302: invokeinterface ZoB : ()J
    //   1307: aload #5
    //   1309: invokevirtual ZAs : ()Ljava/lang/String;
    //   1312: invokeinterface ZN : (Lburp/Zeew;Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;JLjava/lang/String;)V
    //   1317: iconst_1
    //   1318: ireturn
    //   1319: aload_2
    //   1320: invokeinterface size : ()I
    //   1325: iconst_1
    //   1326: if_icmpne -> 1472
    //   1329: aload_2
    //   1330: invokeinterface getFirst : ()Ljava/lang/Object;
    //   1335: astore #6
    //   1337: aload #6
    //   1339: instanceof burp/Zm13
    //   1342: ifeq -> 1472
    //   1345: aload #6
    //   1347: checkcast burp/Zm13
    //   1350: astore #5
    //   1352: aload #5
    //   1354: invokevirtual ZF : ()Lburp/Zeo2;
    //   1357: astore #6
    //   1359: aload #5
    //   1361: invokevirtual Za : ()Lburp/Zgu3;
    //   1364: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1367: if_acmpne -> 1420
    //   1370: aload_0
    //   1371: getfield ZS : Lburp/Zerg;
    //   1374: invokevirtual ZK : ()Lburp/Zbui;
    //   1377: aload #6
    //   1379: invokeinterface ZlL : ()Lburp/Zlit;
    //   1384: invokeinterface Zdz : ()Lburp/Zmzk;
    //   1389: aload_0
    //   1390: getfield Zl : Lburp/Zr_4;
    //   1393: aload #5
    //   1395: invokevirtual Zm : ()[B
    //   1398: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1403: invokeinterface ZU : (Lburp/Zmzk;Lburp/Zstu;)V
    //   1408: iload #4
    //   1410: ifne -> 1472
    //   1413: goto -> 1420
    //   1416: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1419: athrow
    //   1420: aload_0
    //   1421: getfield ZS : Lburp/Zerg;
    //   1424: invokevirtual ZK : ()Lburp/Zbui;
    //   1427: aload #6
    //   1429: invokeinterface ZlL : ()Lburp/Zlit;
    //   1434: invokeinterface Zdz : ()Lburp/Zmzk;
    //   1439: aload #6
    //   1441: invokeinterface Zos : ()Lburp/Zstu;
    //   1446: aload_0
    //   1447: getfield Zl : Lburp/Zr_4;
    //   1450: aload #5
    //   1452: invokevirtual Zm : ()[B
    //   1455: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1460: invokeinterface ZP : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;)V
    //   1465: goto -> 1472
    //   1468: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1471: athrow
    //   1472: iconst_1
    //   1473: ireturn
    //   1474: aload_2
    //   1475: invokeinterface size : ()I
    //   1480: iconst_1
    //   1481: if_icmpne -> 1589
    //   1484: aload_2
    //   1485: invokeinterface getFirst : ()Ljava/lang/Object;
    //   1490: astore #6
    //   1492: aload #6
    //   1494: instanceof burp/Zm13
    //   1497: ifeq -> 1589
    //   1500: aload #6
    //   1502: checkcast burp/Zm13
    //   1505: astore #5
    //   1507: aload #5
    //   1509: invokevirtual Za : ()Lburp/Zgu3;
    //   1512: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1515: if_acmpne -> 1539
    //   1518: aload_0
    //   1519: getfield Zl : Lburp/Zr_4;
    //   1522: aload #5
    //   1524: invokevirtual Zm : ()[B
    //   1527: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1532: goto -> 1549
    //   1535: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1538: athrow
    //   1539: aload #5
    //   1541: invokevirtual ZF : ()Lburp/Zeo2;
    //   1544: invokeinterface Zos : ()Lburp/Zstu;
    //   1549: astore #6
    //   1551: aload_0
    //   1552: getfield ZS : Lburp/Zerg;
    //   1555: invokevirtual ZJ : ()Lburp/Zt80;
    //   1558: aload #5
    //   1560: invokevirtual Zy : ()Lburp/Zlit;
    //   1563: aload #6
    //   1565: iload_1
    //   1566: ldc 135424
    //   1568: if_icmpne -> 1579
    //   1571: iconst_1
    //   1572: goto -> 1580
    //   1575: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1578: athrow
    //   1579: iconst_0
    //   1580: aload_0
    //   1581: getfield Zm : Lburp/Zbws;
    //   1584: invokeinterface Zj : (Lburp/Zlit;Lburp/Zstu;ZLjava/awt/Component;)V
    //   1589: iconst_1
    //   1590: ireturn
    //   1591: aload_2
    //   1592: invokeinterface size : ()I
    //   1597: iconst_1
    //   1598: if_icmpne -> 1678
    //   1601: aload_2
    //   1602: invokeinterface getFirst : ()Ljava/lang/Object;
    //   1607: astore #6
    //   1609: aload #6
    //   1611: instanceof burp/Zm13
    //   1614: ifeq -> 1678
    //   1617: aload #6
    //   1619: checkcast burp/Zm13
    //   1622: astore #5
    //   1624: aload #5
    //   1626: invokevirtual Za : ()Lburp/Zgu3;
    //   1629: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   1632: if_acmpne -> 1678
    //   1635: aload_0
    //   1636: getfield ZS : Lburp/Zerg;
    //   1639: invokevirtual ZJ : ()Lburp/Zt80;
    //   1642: aload #5
    //   1644: invokevirtual Zy : ()Lburp/Zlit;
    //   1647: aload_0
    //   1648: getfield Zl : Lburp/Zr_4;
    //   1651: aload #5
    //   1653: invokevirtual Zm : ()[B
    //   1656: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   1661: aload_0
    //   1662: getfield Zm : Lburp/Zbws;
    //   1665: iconst_0
    //   1666: invokeinterface Zf : (Lburp/Zlit;Lburp/Zstu;Ljava/awt/Component;B)V
    //   1671: goto -> 1678
    //   1674: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1677: athrow
    //   1678: iconst_1
    //   1679: ireturn
    //   1680: iconst_0
    //   1681: ireturn
    //   1682: astore #5
    //   1684: aload #5
    //   1686: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1689: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1692: iconst_0
    //   1693: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/lang/Exception
    //   18	36	36	java/lang/Exception
    //   40	398	1682	java/lang/Exception
    //   329	372	375	java/lang/Exception
    //   356	390	393	java/lang/Exception
    //   399	462	1682	java/lang/Exception
    //   463	479	1682	java/lang/Exception
    //   480	500	1682	java/lang/Exception
    //   501	517	1682	java/lang/Exception
    //   518	533	1682	java/lang/Exception
    //   534	549	1682	java/lang/Exception
    //   550	616	1682	java/lang/Exception
    //   584	608	611	java/lang/Exception
    //   617	711	1682	java/lang/Exception
    //   679	703	706	java/lang/Exception
    //   712	778	1682	java/lang/Exception
    //   746	770	773	java/lang/Exception
    //   779	1004	1682	java/lang/Exception
    //   849	863	863	java/lang/Exception
    //   872	920	923	java/lang/Exception
    //   934	962	962	java/lang/Exception
    //   1005	1153	1682	java/lang/Exception
    //   1047	1075	1075	java/lang/Exception
    //   1091	1115	1115	java/lang/Exception
    //   1154	1318	1682	java/lang/Exception
    //   1194	1222	1222	java/lang/Exception
    //   1235	1259	1259	java/lang/Exception
    //   1319	1473	1682	java/lang/Exception
    //   1359	1413	1416	java/lang/Exception
    //   1370	1465	1468	java/lang/Exception
    //   1474	1590	1682	java/lang/Exception
    //   1507	1535	1535	java/lang/Exception
    //   1551	1575	1575	java/lang/Exception
    //   1591	1679	1682	java/lang/Exception
    //   1624	1671	1674	java/lang/Exception
    //   1680	1681	1682	java/lang/Exception
  }
  
  private void Zt(Zmw9<?> paramZmw9, Point paramPoint) {
    int i = (paramPoint != null) ? this.Zm.rowAtPoint(paramPoint) : ZO(this.ZO, paramZmw9);
    if (i != -1) {
      this.Zm.setRowSelectionInterval(i, i);
      this.Zg.ZB(new Zlw3(this.ZO.Zf(i)));
    } 
  }
  
  static int ZO(Zmue paramZmue, Zmw9<?> paramZmw9) {
    boolean bool = Zmue.ZH();
    byte b = 0;
    while (b < paramZmue.getRowCount()) {
      Ztf_<?> ztf_ = paramZmue.Zf(b);
      if (paramZmw9.ZF(ztf_.ZL()))
        return b; 
      b++;
      if (bool)
        break; 
    } 
    return -1;
  }
  
  private void Zb(List<Zmw9<?>> paramList) {
    Objects.requireNonNull(Zeo2.class);
    List<Zeo2> list = paramList.stream().filter(Ziy::lambda$notifyHistoryOfUpdate$10).map(Zeo2.class::cast).toList();
    Zg4r zg4r = new Zg4r(list);
    this.Zg.ZB(zg4r);
    Objects.requireNonNull(Zzh2.class);
    List<Zzh2> list1 = paramList.stream().filter(Ziy::lambda$notifyHistoryOfUpdate$11).map(Zzh2.class::cast).toList();
    Zt4d zt4d = new Zt4d(list1);
    this.Zg.ZB(zt4d);
  }
  
  private void ZN(List<Ztf_<?>> paramList) {
    paramList.forEach(Ziy::lambda$applyHighlight$12);
    Iterator<Ztf_<?>> iterator = paramList.iterator();
    boolean bool = Zmue.ZH();
    while (iterator.hasNext()) {
      Zz6e<Object> zz6e = iterator.next();
      Zmw9 zmw9 = (Zmw9)zz6e.ZL();
      int i = ZO(this.ZO, zmw9);
      if (i != -1)
        this.ZO.fireTableRowsUpdated(i, i); 
      if (bool)
        break; 
    } 
  }
  
  private List<Ztf_<?>> ZU() {
    ArrayList<Ztf_<?>> arrayList = new ArrayList();
    int[] arrayOfInt1 = this.Zm.getSelectedRows();
    int[] arrayOfInt2 = arrayOfInt1;
    int i = arrayOfInt2.length;
    byte b = 0;
    boolean bool = Zmue.Zm();
    while (b < i) {
      int j = arrayOfInt2[b];
      if (j >= 0 && j < this.ZO.getRowCount()) {
        j = this.Zm.convertRowIndexToModel(j);
        if (j != -1)
          arrayList.add(this.ZO.Zf(j)); 
      } 
      b++;
      if (!bool)
        break; 
    } 
    return arrayList;
  }
  
  private static List<Zeo2> ZQ(List<Ztf_<?>> paramList) {
    return paramList.stream().filter(Ziy::lambda$findHttpHistoryItems$13).map(Ziy::lambda$handleAction$4).map(Zm13::ZF).toList();
  }
  
  private static boolean lambda$findHttpHistoryItems$13(Ztf_ paramZtf_) {
    return paramZtf_ instanceof Zm13;
  }
  
  private static void lambda$applyHighlight$12(Ztf_ paramZtf_) {
    paramZtf_.ZL().ZB((byte)Zlxk.ZS);
  }
  
  private static boolean lambda$notifyHistoryOfUpdate$11(Zmw9 paramZmw9) {
    return paramZmw9 instanceof Zzh2;
  }
  
  private static boolean lambda$notifyHistoryOfUpdate$10(Zmw9 paramZmw9) {
    return paramZmw9 instanceof Zeo2;
  }
  
  private Zstu lambda$handleAction$9(Zsnu paramZsnu) {
    return this.Zl.ZZ(paramZsnu.Zm());
  }
  
  private static Zsnu lambda$handleAction$8(Ztf_ paramZtf_) {
    return (Zsnu)paramZtf_;
  }
  
  private static byte[] lambda$handleAction$7(Zm13 paramZm13) {
    return (paramZm13.Za() == Zgu3.HTTP_RESPONSE) ? paramZm13.Zm() : null;
  }
  
  private Zstu lambda$handleAction$5(Zm13 paramZm13) {
    return (paramZm13.Za() == Zgu3.HTTP_REQUEST) ? this.Zl.ZZ(paramZm13.Zm()) : paramZm13.ZF().Zos();
  }
  
  private static Zm13 lambda$handleAction$4(Ztf_ paramZtf_) {
    return (Zm13)paramZtf_;
  }
  
  private void lambda$handleAction$3(List<Zmw9<?>> paramList) {
    Zb(paramList);
  }
  
  private void lambda$handleAction$2(Point paramPoint, Zmw9<?> paramZmw9) {
    Zt(paramZmw9, paramPoint);
  }
  
  private static Zlit[] lambda$handleAction$1(int paramInt) {
    return new Zlit[paramInt];
  }
  
  private static Zax lambda$handleAction$0(Zlit paramZlit) {
    byte[] arrayOfByte = paramZlit.Zd4();
    return (arrayOfByte.length > 1) ? new Zax(paramZlit.Zdz(), arrayOfByte) : null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ziy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */