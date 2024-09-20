package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ze_4 implements ActionListener {
  public int Zv;
  
  final Zbw2 ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ze_4(Zbw2 paramZbw2) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual getActionCommand : ()Ljava/lang/String;
    //   8: ifnull -> 22
    //   11: aload_1
    //   12: invokevirtual getActionCommand : ()Ljava/lang/String;
    //   15: goto -> 24
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: ldc ''
    //   24: astore_3
    //   25: aload_0
    //   26: getfield ZY : Lburp/Zbw2;
    //   29: invokevirtual Zv : ()V
    //   32: aload_3
    //   33: astore #4
    //   35: iconst_m1
    //   36: istore #5
    //   38: aload #4
    //   40: invokevirtual hashCode : ()I
    //   43: lookupswitch default -> 243, -1830735286 -> 123, -1435561891 -> 216, -436196878 -> 154, -384993417 -> 185, 633680681 -> 92
    //   92: aload #4
    //   94: sipush #30028
    //   97: sipush #-31580
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: ifeq -> 243
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: iconst_0
    //   117: istore #5
    //   119: iload_2
    //   120: ifeq -> 243
    //   123: aload #4
    //   125: sipush #30031
    //   128: sipush #-8406
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 243
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: iconst_1
    //   148: istore #5
    //   150: iload_2
    //   151: ifeq -> 243
    //   154: aload #4
    //   156: sipush #30016
    //   159: sipush #5426
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: invokevirtual equals : (Ljava/lang/Object;)Z
    //   168: ifeq -> 243
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: iconst_2
    //   179: istore #5
    //   181: iload_2
    //   182: ifeq -> 243
    //   185: aload #4
    //   187: sipush #30017
    //   190: sipush #24089
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: invokevirtual equals : (Ljava/lang/Object;)Z
    //   199: ifeq -> 243
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: iconst_3
    //   210: istore #5
    //   212: iload_2
    //   213: ifeq -> 243
    //   216: aload #4
    //   218: sipush #30020
    //   221: sipush #-21058
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifeq -> 243
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: iconst_4
    //   241: istore #5
    //   243: iload #5
    //   245: tableswitch default -> 1350, 0 -> 280, 1 -> 478, 2 -> 759, 3 -> 983, 4 -> 1156
    //   280: aload_0
    //   281: sipush #30029
    //   284: sipush #13030
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: invokevirtual ZY : (Ljava/lang/String;)Ljava/lang/Byte;
    //   293: astore #6
    //   295: aload #6
    //   297: ifnonnull -> 301
    //   300: return
    //   301: aload_0
    //   302: getfield ZY : Lburp/Zbw2;
    //   305: getfield ZR : Lburp/Zran;
    //   308: iconst_0
    //   309: invokeinterface Zj : (Z)[B
    //   314: astore #7
    //   316: new java/io/ByteArrayOutputStream
    //   319: dup
    //   320: invokespecial <init> : ()V
    //   323: astore #8
    //   325: aload_0
    //   326: getfield Zv : I
    //   329: iconst_m1
    //   330: if_icmpne -> 347
    //   333: aload_0
    //   334: aload #7
    //   336: arraylength
    //   337: putfield Zv : I
    //   340: goto -> 347
    //   343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   346: athrow
    //   347: aload #8
    //   349: aload #7
    //   351: iconst_0
    //   352: aload_0
    //   353: getfield Zv : I
    //   356: invokevirtual write : ([BII)V
    //   359: aload #8
    //   361: aload #6
    //   363: invokevirtual byteValue : ()B
    //   366: invokevirtual write : (I)V
    //   369: aload #8
    //   371: aload #7
    //   373: aload_0
    //   374: getfield Zv : I
    //   377: aload #7
    //   379: arraylength
    //   380: aload_0
    //   381: getfield Zv : I
    //   384: isub
    //   385: invokevirtual write : ([BII)V
    //   388: aload_0
    //   389: getfield ZY : Lburp/Zbw2;
    //   392: getfield ZR : Lburp/Zran;
    //   395: aload #8
    //   397: invokevirtual toByteArray : ()[B
    //   400: iconst_0
    //   401: iconst_0
    //   402: invokeinterface Zp : ([BZZ)V
    //   407: aload_0
    //   408: getfield ZY : Lburp/Zbw2;
    //   411: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   414: ifnull -> 448
    //   417: aload_0
    //   418: getfield ZY : Lburp/Zbw2;
    //   421: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   424: new burp/Zzxe
    //   427: dup
    //   428: aload_0
    //   429: getfield Zv : I
    //   432: iconst_1
    //   433: invokespecial <init> : (II)V
    //   436: invokeinterface insertUpdate : (Ljavax/swing/event/DocumentEvent;)V
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   447: athrow
    //   448: aload_0
    //   449: getfield ZY : Lburp/Zbw2;
    //   452: getfield ZR : Lburp/Zran;
    //   455: invokeinterface fireTableDataChanged : ()V
    //   460: aload_0
    //   461: getfield ZY : Lburp/Zbw2;
    //   464: getfield Zr : Lburp/Zeq;
    //   467: iconst_m1
    //   468: iconst_m1
    //   469: invokeinterface ZK : (II)V
    //   474: iload_2
    //   475: ifeq -> 1350
    //   478: aload_0
    //   479: getfield ZY : Lburp/Zbw2;
    //   482: getfield ZI : Ljava/util/function/Supplier;
    //   485: invokeinterface get : ()Ljava/lang/Object;
    //   490: checkcast java/awt/Component
    //   493: sipush #30027
    //   496: sipush #4467
    //   499: invokestatic a : (II)Ljava/lang/String;
    //   502: sipush #30024
    //   505: sipush #9605
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: invokestatic ZL : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   514: invokestatic parseInt : (Ljava/lang/String;)I
    //   517: istore #6
    //   519: goto -> 533
    //   522: astore #7
    //   524: aload #7
    //   526: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   529: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   532: return
    //   533: iload #6
    //   535: ifgt -> 543
    //   538: return
    //   539: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   542: athrow
    //   543: aload_0
    //   544: sipush #30021
    //   547: sipush #28178
    //   550: invokestatic a : (II)Ljava/lang/String;
    //   553: invokevirtual ZY : (Ljava/lang/String;)Ljava/lang/Byte;
    //   556: astore #7
    //   558: aload #7
    //   560: ifnonnull -> 564
    //   563: return
    //   564: aload_0
    //   565: getfield ZY : Lburp/Zbw2;
    //   568: getfield ZR : Lburp/Zran;
    //   571: iconst_0
    //   572: invokeinterface Zj : (Z)[B
    //   577: astore #8
    //   579: new java/io/ByteArrayOutputStream
    //   582: dup
    //   583: invokespecial <init> : ()V
    //   586: astore #9
    //   588: aload_0
    //   589: getfield Zv : I
    //   592: iconst_m1
    //   593: if_icmpne -> 610
    //   596: aload_0
    //   597: aload #8
    //   599: arraylength
    //   600: putfield Zv : I
    //   603: goto -> 610
    //   606: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   609: athrow
    //   610: aload #9
    //   612: aload #8
    //   614: iconst_0
    //   615: aload_0
    //   616: getfield Zv : I
    //   619: invokevirtual write : ([BII)V
    //   622: iconst_0
    //   623: istore #10
    //   625: iload #10
    //   627: iload #6
    //   629: if_icmpge -> 649
    //   632: aload #9
    //   634: aload #7
    //   636: invokevirtual byteValue : ()B
    //   639: invokevirtual write : (I)V
    //   642: iinc #10, 1
    //   645: iload_2
    //   646: ifeq -> 625
    //   649: aload #9
    //   651: aload #8
    //   653: aload_0
    //   654: getfield Zv : I
    //   657: aload #8
    //   659: arraylength
    //   660: aload_0
    //   661: getfield Zv : I
    //   664: isub
    //   665: invokevirtual write : ([BII)V
    //   668: aload_0
    //   669: getfield ZY : Lburp/Zbw2;
    //   672: getfield ZR : Lburp/Zran;
    //   675: aload #9
    //   677: invokevirtual toByteArray : ()[B
    //   680: iconst_0
    //   681: iconst_0
    //   682: invokeinterface Zp : ([BZZ)V
    //   687: aload_0
    //   688: getfield ZY : Lburp/Zbw2;
    //   691: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   694: ifnull -> 729
    //   697: aload_0
    //   698: getfield ZY : Lburp/Zbw2;
    //   701: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   704: new burp/Zzxe
    //   707: dup
    //   708: aload_0
    //   709: getfield Zv : I
    //   712: iload #6
    //   714: invokespecial <init> : (II)V
    //   717: invokeinterface insertUpdate : (Ljavax/swing/event/DocumentEvent;)V
    //   722: goto -> 729
    //   725: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   728: athrow
    //   729: aload_0
    //   730: getfield ZY : Lburp/Zbw2;
    //   733: getfield ZR : Lburp/Zran;
    //   736: invokeinterface fireTableDataChanged : ()V
    //   741: aload_0
    //   742: getfield ZY : Lburp/Zbw2;
    //   745: getfield Zr : Lburp/Zeq;
    //   748: iconst_m1
    //   749: iconst_m1
    //   750: invokeinterface ZK : (II)V
    //   755: iload_2
    //   756: ifeq -> 1350
    //   759: aload_0
    //   760: getfield ZY : Lburp/Zbw2;
    //   763: getfield ZI : Ljava/util/function/Supplier;
    //   766: invokeinterface get : ()Ljava/lang/Object;
    //   771: checkcast java/awt/Component
    //   774: sipush #30023
    //   777: sipush #13051
    //   780: invokestatic a : (II)Ljava/lang/String;
    //   783: sipush #30030
    //   786: sipush #11538
    //   789: invokestatic a : (II)Ljava/lang/String;
    //   792: invokestatic ZL : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   795: astore #6
    //   797: aload #6
    //   799: ifnull -> 1350
    //   802: aload_0
    //   803: getfield ZY : Lburp/Zbw2;
    //   806: getfield ZR : Lburp/Zran;
    //   809: iconst_0
    //   810: invokeinterface Zj : (Z)[B
    //   815: astore #7
    //   817: new java/io/ByteArrayOutputStream
    //   820: dup
    //   821: invokespecial <init> : ()V
    //   824: astore #8
    //   826: aload_0
    //   827: getfield Zv : I
    //   830: iconst_m1
    //   831: if_icmpne -> 848
    //   834: aload_0
    //   835: aload #7
    //   837: arraylength
    //   838: putfield Zv : I
    //   841: goto -> 848
    //   844: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   847: athrow
    //   848: aload #8
    //   850: aload #7
    //   852: iconst_0
    //   853: aload_0
    //   854: getfield Zv : I
    //   857: invokevirtual write : ([BII)V
    //   860: aload #8
    //   862: aload #6
    //   864: invokestatic Zy : (Ljava/lang/String;)[B
    //   867: invokevirtual write : ([B)V
    //   870: aload #8
    //   872: aload #7
    //   874: aload_0
    //   875: getfield Zv : I
    //   878: aload #7
    //   880: arraylength
    //   881: aload_0
    //   882: getfield Zv : I
    //   885: isub
    //   886: invokevirtual write : ([BII)V
    //   889: aload_0
    //   890: getfield ZY : Lburp/Zbw2;
    //   893: getfield ZR : Lburp/Zran;
    //   896: aload #8
    //   898: invokevirtual toByteArray : ()[B
    //   901: iconst_0
    //   902: iconst_0
    //   903: invokeinterface Zp : ([BZZ)V
    //   908: aload_0
    //   909: getfield ZY : Lburp/Zbw2;
    //   912: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   915: ifnull -> 953
    //   918: aload_0
    //   919: getfield ZY : Lburp/Zbw2;
    //   922: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   925: new burp/Zzxe
    //   928: dup
    //   929: aload_0
    //   930: getfield Zv : I
    //   933: aload #6
    //   935: invokevirtual length : ()I
    //   938: invokespecial <init> : (II)V
    //   941: invokeinterface insertUpdate : (Ljavax/swing/event/DocumentEvent;)V
    //   946: goto -> 953
    //   949: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   952: athrow
    //   953: aload_0
    //   954: getfield ZY : Lburp/Zbw2;
    //   957: getfield ZR : Lburp/Zran;
    //   960: invokeinterface fireTableDataChanged : ()V
    //   965: aload_0
    //   966: getfield ZY : Lburp/Zbw2;
    //   969: getfield Zr : Lburp/Zeq;
    //   972: iconst_m1
    //   973: iconst_m1
    //   974: invokeinterface ZK : (II)V
    //   979: iload_2
    //   980: ifeq -> 1350
    //   983: aload_0
    //   984: getfield ZY : Lburp/Zbw2;
    //   987: getfield ZR : Lburp/Zran;
    //   990: iconst_0
    //   991: invokeinterface Zj : (Z)[B
    //   996: astore #6
    //   998: aload_0
    //   999: getfield Zv : I
    //   1002: iconst_m1
    //   1003: if_icmpne -> 1022
    //   1006: aload_0
    //   1007: aload #6
    //   1009: arraylength
    //   1010: iconst_1
    //   1011: isub
    //   1012: putfield Zv : I
    //   1015: goto -> 1022
    //   1018: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1021: athrow
    //   1022: new java/io/ByteArrayOutputStream
    //   1025: dup
    //   1026: invokespecial <init> : ()V
    //   1029: astore #7
    //   1031: aload #7
    //   1033: aload #6
    //   1035: iconst_0
    //   1036: aload_0
    //   1037: getfield Zv : I
    //   1040: invokevirtual write : ([BII)V
    //   1043: aload #7
    //   1045: aload #6
    //   1047: aload_0
    //   1048: getfield Zv : I
    //   1051: iconst_1
    //   1052: iadd
    //   1053: aload #6
    //   1055: arraylength
    //   1056: aload_0
    //   1057: getfield Zv : I
    //   1060: isub
    //   1061: iconst_1
    //   1062: isub
    //   1063: invokevirtual write : ([BII)V
    //   1066: aload_0
    //   1067: getfield ZY : Lburp/Zbw2;
    //   1070: getfield ZR : Lburp/Zran;
    //   1073: aload #7
    //   1075: invokevirtual toByteArray : ()[B
    //   1078: iconst_0
    //   1079: iconst_0
    //   1080: invokeinterface Zp : ([BZZ)V
    //   1085: aload_0
    //   1086: getfield ZY : Lburp/Zbw2;
    //   1089: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   1092: ifnull -> 1126
    //   1095: aload_0
    //   1096: getfield ZY : Lburp/Zbw2;
    //   1099: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   1102: new burp/Zzxe
    //   1105: dup
    //   1106: aload_0
    //   1107: getfield Zv : I
    //   1110: iconst_1
    //   1111: invokespecial <init> : (II)V
    //   1114: invokeinterface removeUpdate : (Ljavax/swing/event/DocumentEvent;)V
    //   1119: goto -> 1126
    //   1122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1125: athrow
    //   1126: aload_0
    //   1127: getfield ZY : Lburp/Zbw2;
    //   1130: getfield ZR : Lburp/Zran;
    //   1133: invokeinterface fireTableDataChanged : ()V
    //   1138: aload_0
    //   1139: getfield ZY : Lburp/Zbw2;
    //   1142: getfield Zr : Lburp/Zeq;
    //   1145: iconst_m1
    //   1146: iconst_m1
    //   1147: invokeinterface ZK : (II)V
    //   1152: iload_2
    //   1153: ifeq -> 1350
    //   1156: aload_0
    //   1157: getfield ZY : Lburp/Zbw2;
    //   1160: getfield ZR : Lburp/Zran;
    //   1163: iconst_0
    //   1164: invokeinterface Zj : (Z)[B
    //   1169: astore #6
    //   1171: aload_0
    //   1172: getfield ZY : Lburp/Zbw2;
    //   1175: invokevirtual Zl : ()I
    //   1178: istore #7
    //   1180: aload_0
    //   1181: getfield ZY : Lburp/Zbw2;
    //   1184: invokevirtual ZC : ()I
    //   1187: istore #8
    //   1189: iload #7
    //   1191: iconst_m1
    //   1192: if_icmpne -> 1225
    //   1195: aload_0
    //   1196: getfield Zv : I
    //   1199: iconst_m1
    //   1200: if_icmpne -> 1211
    //   1203: goto -> 1210
    //   1206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1209: athrow
    //   1210: return
    //   1211: aload_0
    //   1212: getfield Zv : I
    //   1215: istore #7
    //   1217: aload_0
    //   1218: getfield Zv : I
    //   1221: iconst_1
    //   1222: iadd
    //   1223: istore #8
    //   1225: new java/io/ByteArrayOutputStream
    //   1228: dup
    //   1229: invokespecial <init> : ()V
    //   1232: astore #9
    //   1234: aload #9
    //   1236: aload #6
    //   1238: iconst_0
    //   1239: iload #7
    //   1241: invokevirtual write : ([BII)V
    //   1244: aload #9
    //   1246: aload #6
    //   1248: iload #8
    //   1250: aload #6
    //   1252: arraylength
    //   1253: iload #8
    //   1255: isub
    //   1256: invokevirtual write : ([BII)V
    //   1259: aload_0
    //   1260: getfield ZY : Lburp/Zbw2;
    //   1263: getfield ZR : Lburp/Zran;
    //   1266: aload #9
    //   1268: invokevirtual toByteArray : ()[B
    //   1271: iconst_0
    //   1272: iconst_0
    //   1273: invokeinterface Zp : ([BZZ)V
    //   1278: aload_0
    //   1279: getfield ZY : Lburp/Zbw2;
    //   1282: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   1285: ifnull -> 1321
    //   1288: aload_0
    //   1289: getfield ZY : Lburp/Zbw2;
    //   1292: getfield Zy : Ljavax/swing/event/DocumentListener;
    //   1295: new burp/Zzxe
    //   1298: dup
    //   1299: iload #7
    //   1301: iload #8
    //   1303: iload #7
    //   1305: isub
    //   1306: invokespecial <init> : (II)V
    //   1309: invokeinterface removeUpdate : (Ljavax/swing/event/DocumentEvent;)V
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1320: athrow
    //   1321: aload_0
    //   1322: getfield ZY : Lburp/Zbw2;
    //   1325: getfield ZR : Lburp/Zran;
    //   1328: invokeinterface fireTableDataChanged : ()V
    //   1333: aload_0
    //   1334: getfield ZY : Lburp/Zbw2;
    //   1337: getfield Zr : Lburp/Zeq;
    //   1340: iconst_m1
    //   1341: iconst_m1
    //   1342: invokeinterface ZK : (II)V
    //   1347: goto -> 1350
    //   1350: goto -> 1363
    //   1353: astore #4
    //   1355: aload #4
    //   1357: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   1360: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1363: return
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/lang/Exception
    //   32	300	1353	java/io/IOException
    //   38	109	112	java/lang/Exception
    //   119	140	143	java/lang/Exception
    //   150	171	174	java/lang/Exception
    //   181	202	205	java/lang/Exception
    //   212	233	236	java/lang/Exception
    //   301	532	1353	java/io/IOException
    //   325	340	343	java/lang/Exception
    //   347	441	444	java/lang/Exception
    //   478	519	522	java/lang/Exception
    //   533	538	1353	java/io/IOException
    //   533	539	539	java/lang/NumberFormatException
    //   543	563	1353	java/io/IOException
    //   564	1210	1353	java/io/IOException
    //   588	603	606	java/lang/Exception
    //   649	722	725	java/lang/Exception
    //   826	841	844	java/lang/Exception
    //   848	946	949	java/lang/Exception
    //   998	1015	1018	java/lang/Exception
    //   1031	1119	1122	java/lang/Exception
    //   1189	1203	1206	java/lang/Exception
    //   1211	1350	1353	java/io/IOException
    //   1234	1314	1317	java/lang/Exception
  }
  
  private Byte ZY(String paramString) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZY : Lburp/Zbw2;
    //   8: getfield ZI : Ljava/util/function/Supplier;
    //   11: invokeinterface get : ()Ljava/lang/Object;
    //   16: checkcast java/awt/Component
    //   19: aload_1
    //   20: sipush #30019
    //   23: sipush #-9518
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: invokestatic ZL : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   32: astore_3
    //   33: aload_3
    //   34: ifnull -> 51
    //   37: aload_3
    //   38: invokevirtual isEmpty : ()Z
    //   41: ifeq -> 57
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aconst_null
    //   52: areturn
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_3
    //   58: invokevirtual length : ()I
    //   61: iconst_1
    //   62: if_icmpne -> 77
    //   65: aload_3
    //   66: invokestatic Zy : (Ljava/lang/String;)[B
    //   69: iconst_0
    //   70: baload
    //   71: istore #4
    //   73: iload_2
    //   74: ifeq -> 226
    //   77: aload_3
    //   78: invokevirtual length : ()I
    //   81: iconst_2
    //   82: if_icmpne -> 188
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_3
    //   93: iconst_0
    //   94: invokevirtual charAt : (I)C
    //   97: invokestatic isLetterOrDigit : (C)Z
    //   100: ifeq -> 188
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_3
    //   111: iconst_1
    //   112: invokevirtual charAt : (I)C
    //   115: invokestatic isLetterOrDigit : (C)Z
    //   118: ifeq -> 188
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: aload_3
    //   129: bipush #16
    //   131: invokestatic parseInt : (Ljava/lang/String;I)I
    //   134: i2b
    //   135: istore #4
    //   137: goto -> 226
    //   140: astore #5
    //   142: aload #5
    //   144: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   147: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   150: aload_0
    //   151: getfield ZY : Lburp/Zbw2;
    //   154: getfield ZI : Ljava/util/function/Supplier;
    //   157: invokeinterface get : ()Ljava/lang/Object;
    //   162: checkcast java/awt/Component
    //   165: sipush #30025
    //   168: sipush #22129
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: sipush #30018
    //   177: sipush #20856
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokestatic Zt : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   186: aconst_null
    //   187: areturn
    //   188: aload_0
    //   189: getfield ZY : Lburp/Zbw2;
    //   192: getfield ZI : Ljava/util/function/Supplier;
    //   195: invokeinterface get : ()Ljava/lang/Object;
    //   200: checkcast java/awt/Component
    //   203: sipush #30026
    //   206: sipush #-11865
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: sipush #30022
    //   215: sipush #27760
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokestatic Zt : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   224: aconst_null
    //   225: areturn
    //   226: iload #4
    //   228: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   231: areturn
    // Exception table:
    //   from	to	target	type
    //   33	44	47	java/lang/NumberFormatException
    //   37	53	53	java/lang/NumberFormatException
    //   73	85	88	java/lang/NumberFormatException
    //   77	103	106	java/lang/NumberFormatException
    //   92	121	124	java/lang/NumberFormatException
    //   128	137	140	java/lang/NumberFormatException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'cHàõ~ ÿiN8@_d)B´îÀ½·­Î¸\\rßDß~Ú Ô9ÂcàVëWC1.P\\t¡Y¹TöÒ²8ótÐrõºf¹ÜX5ËbÂ?[úÔO,ÿ­fQxÔ°òlE{<§ûù~!äc§úÅÒGÇíòïr×pÃ¯%r±pFxªâ#gT? 7c­@Øì.gÜ¾[mì=ëÐò®\\bmÞ¤e<5>öfÓU=`Îò¼ªþþgj­¿Jaá¨O£Geðu½ Å²öäc¨Ürá¡8H\\n\\b_Å+ºï'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
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
    //   68: ldc 'rÊ£ aN.XÝõSê'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #90
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
    //   129: putstatic burp/Ze_4.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ze_4.b : [Ljava/lang/String;
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
    //   212: iconst_5
    //   213: goto -> 243
    //   216: bipush #98
    //   218: goto -> 243
    //   221: bipush #122
    //   223: goto -> 243
    //   226: bipush #118
    //   228: goto -> 243
    //   231: bipush #72
    //   233: goto -> 243
    //   236: bipush #119
    //   238: goto -> 243
    //   241: bipush #23
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
    int i = (paramInt1 ^ 0x7545) & 0xFFFF;
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
      byte b1 = 16;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */