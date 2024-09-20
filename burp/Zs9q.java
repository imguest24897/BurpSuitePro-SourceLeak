package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class Zs9q implements Zzyl {
  private final Ztwv ZD;
  
  private final Zb0h ZK;
  
  private final Zlqk Zj;
  
  private final Zslu ZT;
  
  private final Zbiv Zs;
  
  private final Zerg Zr;
  
  private final Zbws ZB;
  
  private final Zbnt Zc;
  
  private final Zskh ZI;
  
  private final Zey9 Zb;
  
  private final Supplier<List<Zzme>> ZP;
  
  private final Runnable ZS;
  
  private final Runnable Zo;
  
  private final Zm6x Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs9q(Ztwv paramZtwv, Zb0h paramZb0h, Zlqk paramZlqk, Zslu paramZslu, Zbiv paramZbiv, Zerg paramZerg, Zbws paramZbws, Zbnt paramZbnt, Zskh paramZskh, Zey9 paramZey9, Supplier<List<Zzme>> paramSupplier, Runnable paramRunnable1, Runnable paramRunnable2, Zm6x paramZm6x) {
    this.ZD = paramZtwv;
    this.ZK = paramZb0h;
    this.Zj = paramZlqk;
    this.ZT = paramZslu;
    this.Zs = paramZbiv;
    this.Zr = paramZerg;
    this.ZB = paramZbws;
    this.Zc = paramZbnt;
    this.ZI = paramZskh;
    this.Zb = paramZey9;
    this.ZP = paramSupplier;
    this.ZS = paramRunnable1;
    this.Zo = paramRunnable2;
    this.Zw = paramZm6x;
  }
  
  public boolean Z_(int paramInt, List<Zzme> paramList, Runnable paramRunnable) {
    // Byte code:
    //   0: invokestatic ZiU : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: invokestatic isEventDispatchThread : ()Z
    //   8: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   11: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   14: iload_1
    //   15: lookupswitch default -> 1854, 131328 -> 621, 131584 -> 543, 132608 -> 802, 132672 -> 889, 132736 -> 948, 132992 -> 1006, 133008 -> 1043, 133120 -> 681, 133408 -> 328, 133440 -> 372, 134400 -> 1606, 134416 -> 1751, 134656 -> 1488, 134912 -> 1093, 135168 -> 1151, 135424 -> 1151, 135680 -> 1221, 135936 -> 1438, 136448 -> 416, 136704 -> 455, 136960 -> 499, 524544 -> 1461, 524545 -> 1461, 524546 -> 1461, 524547 -> 1461, 524548 -> 1461, 524549 -> 1461, 524550 -> 1461, 524551 -> 1461, 524552 -> 1461, 524553 -> 1461, 540672 -> 1552, 540673 -> 1250, 540674 -> 1275, 540675 -> 1300, 540676 -> 1325, 540677 -> 1350, 540678 -> 1375
    //   328: aload_2
    //   329: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   334: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   339: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   344: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   349: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   354: checkcast [Lburp/Zlit;
    //   357: astore #5
    //   359: aload_0
    //   360: getfield ZT : Lburp/Zslu;
    //   363: aload #5
    //   365: invokeinterface Zl : ([Lburp/Zlit;)V
    //   370: iconst_1
    //   371: ireturn
    //   372: aload_2
    //   373: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   378: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   383: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   388: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   393: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   398: checkcast [Lburp/Zlit;
    //   401: astore #5
    //   403: aload_0
    //   404: getfield ZT : Lburp/Zslu;
    //   407: aload #5
    //   409: invokeinterface Zi : ([Lburp/Zlit;)V
    //   414: iconst_1
    //   415: ireturn
    //   416: aload_2
    //   417: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   422: aload_0
    //   423: <illegal opcode> apply : (Lburp/Zs9q;)Ljava/util/function/Function;
    //   428: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   433: invokeinterface toList : ()Ljava/util/List;
    //   438: astore #5
    //   440: aload_0
    //   441: getfield Zs : Lburp/Zbiv;
    //   444: aload_0
    //   445: getfield ZB : Lburp/Zbws;
    //   448: aload #5
    //   450: invokevirtual ZH : (Ljava/awt/Component;Ljava/util/List;)V
    //   453: iconst_1
    //   454: ireturn
    //   455: getstatic burp/Zze0.ORGANIZER_DO_PASSIVE_SCAN : Lburp/Zze0;
    //   458: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   461: aload_2
    //   462: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   467: aload_0
    //   468: <illegal opcode> apply : (Lburp/Zs9q;)Ljava/util/function/Function;
    //   473: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   478: invokeinterface toList : ()Ljava/util/List;
    //   483: astore #5
    //   485: aload_0
    //   486: getfield Zs : Lburp/Zbiv;
    //   489: invokevirtual Zv : ()Lburp/Zz7i;
    //   492: aload #5
    //   494: invokevirtual Zg : (Ljava/util/List;)V
    //   497: iconst_1
    //   498: ireturn
    //   499: getstatic burp/Zze0.ORGANIZER_DO_ACTIVE_SCAN : Lburp/Zze0;
    //   502: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   505: aload_2
    //   506: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   511: aload_0
    //   512: <illegal opcode> apply : (Lburp/Zs9q;)Ljava/util/function/Function;
    //   517: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   522: invokeinterface toList : ()Ljava/util/List;
    //   527: astore #5
    //   529: aload_0
    //   530: getfield Zs : Lburp/Zbiv;
    //   533: invokevirtual Zv : ()Lburp/Zz7i;
    //   536: aload #5
    //   538: invokevirtual ZO : (Ljava/util/List;)V
    //   541: iconst_1
    //   542: ireturn
    //   543: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   546: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   549: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   552: aload_2
    //   553: iconst_0
    //   554: invokeinterface get : (I)Ljava/lang/Object;
    //   559: checkcast burp/Zzme
    //   562: astore #5
    //   564: aload #5
    //   566: aload_0
    //   567: getfield Zb : Lburp/Zey9;
    //   570: invokeinterface ZQ : (Lburp/Zey9;)Lburp/Zefx;
    //   575: invokeinterface Zb : ()Lburp/Zefx;
    //   580: astore #6
    //   582: aload_0
    //   583: getfield Zr : Lburp/Zerg;
    //   586: invokevirtual Zg : ()Lburp/Zr00;
    //   589: aload #5
    //   591: invokeinterface ZHC : ()Lburp/Zmzk;
    //   596: aload #6
    //   598: invokeinterface ZD : ()[B
    //   603: invokestatic Zy : ([B)Lburp/Zyf;
    //   606: aconst_null
    //   607: aload #5
    //   609: invokeinterface ZHh : ()Lburp/Zstu;
    //   614: invokeinterface Zp : (Lburp/Zmzk;Lburp/Zstu;Ljava/util/List;Lburp/Zstu;)V
    //   619: iconst_1
    //   620: ireturn
    //   621: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   624: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   627: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   630: aload_2
    //   631: iconst_0
    //   632: invokeinterface get : (I)Ljava/lang/Object;
    //   637: checkcast burp/Zzme
    //   640: astore #5
    //   642: aload_0
    //   643: getfield Zr : Lburp/Zerg;
    //   646: invokevirtual Zm : ()Lburp/Zx_a;
    //   649: aload #5
    //   651: invokeinterface ZHC : ()Lburp/Zmzk;
    //   656: aload #5
    //   658: invokeinterface ZH6 : ()Lburp/Zbr;
    //   663: aconst_null
    //   664: checkcast java/lang/String
    //   667: aload #5
    //   669: invokeinterface ZAs : ()Ljava/lang/String;
    //   674: invokeinterface ZQ : (Lburp/Zmzk;Lburp/Zbr;Ljava/lang/String;Ljava/lang/String;)V
    //   679: iconst_1
    //   680: ireturn
    //   681: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   684: getstatic burp/Zeew.SEQUENCER : Lburp/Zeew;
    //   687: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   690: aload_2
    //   691: iconst_0
    //   692: invokeinterface get : (I)Ljava/lang/Object;
    //   697: checkcast burp/Zzme
    //   700: astore #5
    //   702: aload #5
    //   704: aload_0
    //   705: getfield Zb : Lburp/Zey9;
    //   708: invokeinterface ZQ : (Lburp/Zey9;)Lburp/Zefx;
    //   713: invokeinterface Zb : ()Lburp/Zefx;
    //   718: astore #6
    //   720: aload #5
    //   722: invokeinterface ZHh : ()Lburp/Zstu;
    //   727: ifnull -> 771
    //   730: aload_0
    //   731: getfield Zr : Lburp/Zerg;
    //   734: invokevirtual ZK : ()Lburp/Zbui;
    //   737: aload #5
    //   739: invokeinterface ZHC : ()Lburp/Zmzk;
    //   744: aload #6
    //   746: invokeinterface ZD : ()[B
    //   751: invokestatic Zy : ([B)Lburp/Zyf;
    //   754: aload #5
    //   756: invokeinterface ZHh : ()Lburp/Zstu;
    //   761: invokeinterface ZP : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;)V
    //   766: aload #4
    //   768: ifnonnull -> 800
    //   771: aload_0
    //   772: getfield Zr : Lburp/Zerg;
    //   775: invokevirtual ZK : ()Lburp/Zbui;
    //   778: aload #5
    //   780: invokeinterface ZHC : ()Lburp/Zmzk;
    //   785: aload #6
    //   787: invokeinterface ZD : ()[B
    //   792: invokestatic Zy : ([B)Lburp/Zyf;
    //   795: invokeinterface ZU : (Lburp/Zmzk;Lburp/Zstu;)V
    //   800: iconst_1
    //   801: ireturn
    //   802: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   805: getstatic burp/Zeew.COMPARER : Lburp/Zeew;
    //   808: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   811: aload_2
    //   812: iconst_0
    //   813: invokeinterface get : (I)Ljava/lang/Object;
    //   818: checkcast burp/Zzme
    //   821: astore #5
    //   823: aload #5
    //   825: aload_0
    //   826: getfield Zb : Lburp/Zey9;
    //   829: invokeinterface ZQ : (Lburp/Zey9;)Lburp/Zefx;
    //   834: invokeinterface Zb : ()Lburp/Zefx;
    //   839: astore #6
    //   841: aload #5
    //   843: invokeinterface ZHh : ()Lburp/Zstu;
    //   848: ifnull -> 861
    //   851: aload #5
    //   853: invokeinterface ZHh : ()Lburp/Zstu;
    //   858: goto -> 871
    //   861: aload #6
    //   863: invokeinterface ZD : ()[B
    //   868: invokestatic Zy : ([B)Lburp/Zyf;
    //   871: astore #7
    //   873: aload_0
    //   874: getfield Zr : Lburp/Zerg;
    //   877: invokevirtual ZH : ()Lburp/Zg_j;
    //   880: aload #7
    //   882: invokeinterface ZM : (Lburp/Zstu;)V
    //   887: iconst_1
    //   888: ireturn
    //   889: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   892: getstatic burp/Zeew.COMPARER : Lburp/Zeew;
    //   895: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   898: aload_2
    //   899: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   904: aload_0
    //   905: <illegal opcode> apply : (Lburp/Zs9q;)Ljava/util/function/Function;
    //   910: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   915: invokeinterface toList : ()Ljava/util/List;
    //   920: astore #5
    //   922: aload #5
    //   924: invokeinterface isEmpty : ()Z
    //   929: ifne -> 946
    //   932: aload_0
    //   933: getfield Zr : Lburp/Zerg;
    //   936: invokevirtual ZH : ()Lburp/Zg_j;
    //   939: aload #5
    //   941: invokeinterface Zk : (Ljava/util/List;)V
    //   946: iconst_1
    //   947: ireturn
    //   948: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   951: getstatic burp/Zeew.COMPARER : Lburp/Zeew;
    //   954: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   957: aload_2
    //   958: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   963: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   968: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   973: invokeinterface toList : ()Ljava/util/List;
    //   978: astore #5
    //   980: aload #5
    //   982: invokeinterface isEmpty : ()Z
    //   987: ifne -> 1004
    //   990: aload_0
    //   991: getfield Zr : Lburp/Zerg;
    //   994: invokevirtual ZH : ()Lburp/Zg_j;
    //   997: aload #5
    //   999: invokeinterface Zk : (Ljava/util/List;)V
    //   1004: iconst_1
    //   1005: ireturn
    //   1006: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   1009: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   1012: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   1015: aload_2
    //   1016: iconst_0
    //   1017: invokeinterface get : (I)Ljava/lang/Object;
    //   1022: checkcast burp/Zzme
    //   1025: astore #5
    //   1027: aload_0
    //   1028: getfield Zr : Lburp/Zerg;
    //   1031: invokevirtual Ze : ()Lburp/Zeu0;
    //   1034: aload #5
    //   1036: invokeinterface ZP : (Lburp/Zzme;)V
    //   1041: iconst_1
    //   1042: ireturn
    //   1043: aload_2
    //   1044: iconst_0
    //   1045: invokeinterface get : (I)Ljava/lang/Object;
    //   1050: checkcast burp/Zzme
    //   1053: astore #5
    //   1055: aload_0
    //   1056: getfield Zr : Lburp/Zerg;
    //   1059: invokevirtual ZM : ()Lburp/Zgvn;
    //   1062: aload #5
    //   1064: invokeinterface ZHC : ()Lburp/Zmzk;
    //   1069: aload #5
    //   1071: invokeinterface ZH6 : ()Lburp/Zbr;
    //   1076: aload #5
    //   1078: invokeinterface ZHh : ()Lburp/Zstu;
    //   1083: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   1086: invokeinterface Za : (Lburp/Zmzk;Lburp/Zbr;Lburp/Zstu;Lburp/Zzvh;)V
    //   1091: iconst_1
    //   1092: ireturn
    //   1093: aload_2
    //   1094: iconst_0
    //   1095: invokeinterface get : (I)Ljava/lang/Object;
    //   1100: checkcast burp/Zzme
    //   1103: astore #5
    //   1105: aload #5
    //   1107: invokeinterface ZHh : ()Lburp/Zstu;
    //   1112: ifnull -> 1149
    //   1115: aload_0
    //   1116: getfield Zr : Lburp/Zerg;
    //   1119: invokevirtual ZJ : ()Lburp/Zt80;
    //   1122: aload #5
    //   1124: invokeinterface ZHm : ()Lburp/Zlit;
    //   1129: aload #5
    //   1131: invokeinterface ZHh : ()Lburp/Zstu;
    //   1136: aload_0
    //   1137: getfield ZB : Lburp/Zbws;
    //   1140: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1143: iconst_0
    //   1144: invokeinterface Zf : (Lburp/Zlit;Lburp/Zstu;Ljava/awt/Component;B)V
    //   1149: iconst_1
    //   1150: ireturn
    //   1151: aload_2
    //   1152: iconst_0
    //   1153: invokeinterface get : (I)Ljava/lang/Object;
    //   1158: checkcast burp/Zzme
    //   1161: astore #5
    //   1163: aload_0
    //   1164: getfield Zr : Lburp/Zerg;
    //   1167: invokevirtual ZJ : ()Lburp/Zt80;
    //   1170: aload #5
    //   1172: invokeinterface ZHm : ()Lburp/Zlit;
    //   1177: aload #5
    //   1179: aload_0
    //   1180: getfield Zb : Lburp/Zey9;
    //   1183: invokeinterface ZQ : (Lburp/Zey9;)Lburp/Zefx;
    //   1188: invokeinterface ZD : ()[B
    //   1193: invokestatic Zy : ([B)Lburp/Zyf;
    //   1196: iload_1
    //   1197: ldc 135424
    //   1199: if_icmpne -> 1206
    //   1202: iconst_1
    //   1203: goto -> 1207
    //   1206: iconst_0
    //   1207: aload_0
    //   1208: getfield ZB : Lburp/Zbws;
    //   1211: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1214: invokeinterface Zj : (Lburp/Zlit;Lburp/Zstu;ZLjava/awt/Component;)V
    //   1219: iconst_1
    //   1220: ireturn
    //   1221: aload_2
    //   1222: invokestatic identity : ()Ljava/util/function/Function;
    //   1225: getstatic burp/Zv8r.ORGANIZER_NOTES_ADDED_VIA_CONTEXT_MENU : Lburp/Zv8r;
    //   1228: aload_0
    //   1229: getfield ZB : Lburp/Zbws;
    //   1232: aload_3
    //   1233: <illegal opcode> accept : (Ljava/lang/Runnable;)Ljava/util/function/Consumer;
    //   1238: aload_0
    //   1239: aload_2
    //   1240: <illegal opcode> run : (Lburp/Zs9q;Ljava/util/List;)Ljava/lang/Runnable;
    //   1245: invokestatic ZB : (Ljava/util/List;Ljava/util/function/Function;Lnet/portswigger/Zzr;Ljava/awt/Component;Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   1248: iconst_1
    //   1249: ireturn
    //   1250: getstatic burp/Zec3.ORGANIZER_ENTRY_STATUS_CHANGED : Lburp/Zec3;
    //   1253: getstatic burp/Zzsm.NEW : Lburp/Zzsm;
    //   1256: getfield displayLabel : Ljava/lang/String;
    //   1259: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   1262: aload_2
    //   1263: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1268: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1273: iconst_1
    //   1274: ireturn
    //   1275: getstatic burp/Zec3.ORGANIZER_ENTRY_STATUS_CHANGED : Lburp/Zec3;
    //   1278: getstatic burp/Zzsm.IN_PROGRESS : Lburp/Zzsm;
    //   1281: getfield displayLabel : Ljava/lang/String;
    //   1284: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   1287: aload_2
    //   1288: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1293: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1298: iconst_1
    //   1299: ireturn
    //   1300: getstatic burp/Zec3.ORGANIZER_ENTRY_STATUS_CHANGED : Lburp/Zec3;
    //   1303: getstatic burp/Zzsm.POSTPONED : Lburp/Zzsm;
    //   1306: getfield displayLabel : Ljava/lang/String;
    //   1309: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   1312: aload_2
    //   1313: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1318: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1323: iconst_1
    //   1324: ireturn
    //   1325: getstatic burp/Zec3.ORGANIZER_ENTRY_STATUS_CHANGED : Lburp/Zec3;
    //   1328: getstatic burp/Zzsm.DONE : Lburp/Zzsm;
    //   1331: getfield displayLabel : Ljava/lang/String;
    //   1334: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   1337: aload_2
    //   1338: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1343: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1348: iconst_1
    //   1349: ireturn
    //   1350: getstatic burp/Zec3.ORGANIZER_ENTRY_STATUS_CHANGED : Lburp/Zec3;
    //   1353: getstatic burp/Zzsm.IGNORED : Lburp/Zzsm;
    //   1356: getfield displayLabel : Ljava/lang/String;
    //   1359: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   1362: aload_2
    //   1363: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1368: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1373: iconst_1
    //   1374: ireturn
    //   1375: getstatic burp/Zrrh.ORGANIZER_ENTRY_STATUS_CYCLED : Lburp/Zrrh;
    //   1378: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   1381: aload_2
    //   1382: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1387: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1392: aload_0
    //   1393: getfield ZB : Lburp/Zbws;
    //   1396: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   1399: astore #5
    //   1401: aload #5
    //   1403: invokeinterface getSelectedIndices : ()[I
    //   1408: astore #6
    //   1410: aload_0
    //   1411: getfield ZS : Ljava/lang/Runnable;
    //   1414: invokeinterface run : ()V
    //   1419: aload #6
    //   1421: invokestatic stream : ([I)Ljava/util/stream/IntStream;
    //   1424: aload #5
    //   1426: <illegal opcode> accept : (Ljavax/swing/ListSelectionModel;)Ljava/util/function/IntConsumer;
    //   1431: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   1436: iconst_1
    //   1437: ireturn
    //   1438: getstatic burp/Zv8r.ORGANIZER_ENTRY_HIGHLIGHT : Lburp/Zv8r;
    //   1441: getstatic burp/Zlxk.ZS : I
    //   1444: i2l
    //   1445: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   1448: aload_2
    //   1449: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1454: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1459: iconst_1
    //   1460: ireturn
    //   1461: iload_1
    //   1462: invokestatic ZY : (I)V
    //   1465: aload_2
    //   1466: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1471: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1476: getstatic burp/Zv8r.ORGANIZER_ENTRY_HIGHLIGHT : Lburp/Zv8r;
    //   1479: getstatic burp/Zlxk.ZS : I
    //   1482: i2l
    //   1483: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   1486: iconst_1
    //   1487: ireturn
    //   1488: getstatic burp/Zrrh.ORGANIZER_ENTRY_DELETED : Lburp/Zrrh;
    //   1491: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   1494: iconst_1
    //   1495: istore #7
    //   1497: aload_2
    //   1498: invokeinterface size : ()I
    //   1503: iconst_1
    //   1504: if_icmple -> 1528
    //   1507: aload_0
    //   1508: getfield ZB : Lburp/Zbws;
    //   1511: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1514: sipush #32695
    //   1517: sipush #-23039
    //   1520: invokestatic a : (II)Ljava/lang/String;
    //   1523: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   1526: istore #7
    //   1528: iload #7
    //   1530: ifeq -> 1550
    //   1533: aload_0
    //   1534: getfield ZD : Lburp/Ztwv;
    //   1537: aload_0
    //   1538: aload_2
    //   1539: <illegal opcode> run : (Lburp/Zs9q;Ljava/util/List;)Ljava/lang/Runnable;
    //   1544: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   1549: pop
    //   1550: iconst_1
    //   1551: ireturn
    //   1552: getstatic burp/Zrrh.ORGANIZER_CLEAR_ALL_ITEMS : Lburp/Zrrh;
    //   1555: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   1558: aload_0
    //   1559: getfield ZB : Lburp/Zbws;
    //   1562: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1565: sipush #32694
    //   1568: sipush #29192
    //   1571: invokestatic a : (II)Ljava/lang/String;
    //   1574: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   1577: ifeq -> 1604
    //   1580: aload_0
    //   1581: getfield ZD : Lburp/Ztwv;
    //   1584: aload_0
    //   1585: getfield Zj : Lburp/Zlqk;
    //   1588: dup
    //   1589: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1592: pop
    //   1593: <illegal opcode> run : (Lburp/Zlqk;)Ljava/lang/Runnable;
    //   1598: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   1603: pop
    //   1604: iconst_1
    //   1605: ireturn
    //   1606: aload_2
    //   1607: invokeinterface size : ()I
    //   1612: iconst_1
    //   1613: if_icmpne -> 1657
    //   1616: aload_2
    //   1617: iconst_0
    //   1618: invokeinterface get : (I)Ljava/lang/Object;
    //   1623: checkcast burp/Zzme
    //   1626: invokeinterface ZHm : ()Lburp/Zlit;
    //   1631: astore #7
    //   1633: aload #7
    //   1635: ifnull -> 1652
    //   1638: aload_0
    //   1639: getfield ZK : Lburp/Zb0h;
    //   1642: aload #7
    //   1644: invokeinterface toString : ()Ljava/lang/String;
    //   1649: invokevirtual ZR : (Ljava/lang/String;)V
    //   1652: aload #4
    //   1654: ifnonnull -> 1749
    //   1657: new java/lang/StringBuilder
    //   1660: dup
    //   1661: invokespecial <init> : ()V
    //   1664: astore #7
    //   1666: aload_2
    //   1667: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1672: astore #8
    //   1674: aload #8
    //   1676: invokeinterface hasNext : ()Z
    //   1681: ifeq -> 1737
    //   1684: aload #8
    //   1686: invokeinterface next : ()Ljava/lang/Object;
    //   1691: checkcast burp/Zzme
    //   1694: astore #9
    //   1696: aload #9
    //   1698: ifnull -> 1732
    //   1701: aload #9
    //   1703: invokeinterface ZHm : ()Lburp/Zlit;
    //   1708: astore #10
    //   1710: aload #10
    //   1712: ifnull -> 1732
    //   1715: aload #7
    //   1717: aload #10
    //   1719: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1722: pop
    //   1723: aload #7
    //   1725: getstatic burp/Zlb0.Zp : Ljava/lang/String;
    //   1728: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1731: pop
    //   1732: aload #4
    //   1734: ifnonnull -> 1674
    //   1737: aload_0
    //   1738: getfield ZK : Lburp/Zb0h;
    //   1741: aload #7
    //   1743: invokevirtual toString : ()Ljava/lang/String;
    //   1746: invokevirtual ZR : (Ljava/lang/String;)V
    //   1749: iconst_1
    //   1750: ireturn
    //   1751: aload_2
    //   1752: invokeinterface size : ()I
    //   1757: iconst_1
    //   1758: if_icmpne -> 1852
    //   1761: aload_2
    //   1762: iconst_0
    //   1763: invokeinterface get : (I)Ljava/lang/Object;
    //   1768: checkcast burp/Zzme
    //   1771: astore #7
    //   1773: aload #7
    //   1775: aload_0
    //   1776: getfield Zb : Lburp/Zey9;
    //   1779: invokeinterface ZQ : (Lburp/Zey9;)Lburp/Zefx;
    //   1784: invokeinterface Zb : ()Lburp/Zefx;
    //   1789: invokeinterface ZD : ()[B
    //   1794: astore #8
    //   1796: aload #7
    //   1798: invokeinterface ZHC : ()Lburp/Zmzk;
    //   1803: aload #8
    //   1805: iconst_2
    //   1806: aload_0
    //   1807: getfield Zc : Lburp/Zbnt;
    //   1810: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   1813: astore #9
    //   1815: aload #9
    //   1817: aload #8
    //   1819: invokestatic Zy : ([B)Lburp/Zyf;
    //   1822: aload_0
    //   1823: getfield ZB : Lburp/Zbws;
    //   1826: aload_0
    //   1827: getfield ZI : Lburp/Zskh;
    //   1830: invokestatic ZP : (Lburp/Zz1p;Lburp/Zstu;Ljava/awt/Component;Lburp/Zskh;)Ljava/lang/String;
    //   1833: astore #10
    //   1835: aload #10
    //   1837: invokevirtual isEmpty : ()Z
    //   1840: ifne -> 1852
    //   1843: aload_0
    //   1844: getfield ZK : Lburp/Zb0h;
    //   1847: aload #10
    //   1849: invokevirtual ZR : (Ljava/lang/String;)V
    //   1852: iconst_1
    //   1853: ireturn
    //   1854: iconst_0
    //   1855: ireturn
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    List<Zzme> list = this.ZP.get();
    return Z_(paramInt, list, Zs9q::lambda$handleAction$18);
  }
  
  private static void lambda$handleAction$18() {}
  
  private void lambda$handleAction$17(List paramList) {
    Objects.requireNonNull(this.Zj);
    paramList.forEach(this.Zj::remove);
    SwingUtilities.invokeLater(this.Zo);
  }
  
  private static void lambda$handleAction$15(Zzme paramZzme) {
    paramZzme.ZB((byte)Zlxk.ZS);
  }
  
  private static void lambda$handleAction$14(ListSelectionModel paramListSelectionModel, int paramInt) {
    paramListSelectionModel.addSelectionInterval(paramInt, paramInt);
  }
  
  private static void lambda$handleAction$13(Zzme paramZzme) {
    paramZzme.Zh(paramZzme.ZHq().ZN());
  }
  
  private static void lambda$handleAction$12(Zzme paramZzme) {
    paramZzme.Zh(Zzsm.IGNORED);
  }
  
  private static void lambda$handleAction$11(Zzme paramZzme) {
    paramZzme.Zh(Zzsm.DONE);
  }
  
  private static void lambda$handleAction$10(Zzme paramZzme) {
    paramZzme.Zh(Zzsm.POSTPONED);
  }
  
  private static void lambda$handleAction$9(Zzme paramZzme) {
    paramZzme.Zh(Zzsm.IN_PROGRESS);
  }
  
  private static void lambda$handleAction$8(Zzme paramZzme) {
    paramZzme.Zh(Zzsm.NEW);
  }
  
  private void lambda$handleAction$7(List<Zzme> paramList) {
    this.Zw.ZB(new Zkm4(paramList));
  }
  
  private static void lambda$handleAction$6(Runnable paramRunnable, Zzme paramZzme) {
    paramRunnable.run();
  }
  
  private Zstu lambda$handleAction$5(Zzme paramZzme) {
    Zefx zefx = paramZzme.ZQ(this.Zb).Zb();
    return Zyf.Zy(zefx.ZD());
  }
  
  private Zl7e lambda$handleAction$2(Zzme paramZzme) {
    return new Zl7e(paramZzme, this.Zb);
  }
  
  private static Zlit[] lambda$handleAction$0(int paramInt) {
    return new Zlit[paramInt];
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Úy»oµ÷ÓÇ!4i:éosY¬F2NÄÙÅIdóSüé#@ãÃ3jâ­wÁ~@EÜl³ÃOvÜÂÿEk¸å4"ÆÂEqbáÞâ\\bíä(Øk¹XÃ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #42
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #35
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zs9q.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zs9q.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #70
    //   154: goto -> 184
    //   157: bipush #64
    //   159: goto -> 184
    //   162: bipush #99
    //   164: goto -> 184
    //   167: bipush #19
    //   169: goto -> 184
    //   172: bipush #89
    //   174: goto -> 184
    //   177: bipush #116
    //   179: goto -> 184
    //   182: bipush #96
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7FB6) & 0xFFFF;
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
      char c = 'à';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */