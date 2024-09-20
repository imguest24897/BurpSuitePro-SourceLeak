package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zm2;
import net.portswigger.browser.Ztf;

class Zrv8 extends Zrh7 {
  private final Window Zp;
  
  private final Ztf9 Zs;
  
  private final Zg85 ZG;
  
  private final Zg85 Zz;
  
  private final Zg85 Zj;
  
  private final Zg85 ZI;
  
  private final Zm9v ZF;
  
  private final Zm9e Zd;
  
  private final Zbqc Zy;
  
  private final Zz62 ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zrv8(Zz62 paramZz62, Window paramWindow, Ztf9 paramZtf9) {
    this(paramZz62, paramWindow, paramZtf9, new Zg96(a(-6646, 19316) + a(-6646, 19316), "", "", ""));
  }
  
  private Zrv8(Zz62 paramZz62, Window paramWindow, Ztf9 paramZtf9, Zg96 paramZg96) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: iconst_0
    //   3: getstatic burp/Zzv7.CREDENTIALS_EDITOR : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield ZU : Lburp/Zz62;
    //   14: aload_0
    //   15: aload_2
    //   16: putfield Zp : Ljava/awt/Window;
    //   19: aload_0
    //   20: aload_3
    //   21: putfield Zs : Lburp/Ztf9;
    //   24: new burp/Zbqc
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore #7
    //   33: new java/awt/GridBagLayout
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #8
    //   42: aload #8
    //   44: iconst_5
    //   45: newarray int
    //   47: dup
    //   48: iconst_0
    //   49: iconst_0
    //   50: iastore
    //   51: dup
    //   52: iconst_1
    //   53: iconst_5
    //   54: iastore
    //   55: dup
    //   56: iconst_2
    //   57: sipush #200
    //   60: iastore
    //   61: dup
    //   62: iconst_3
    //   63: bipush #100
    //   65: iastore
    //   66: dup
    //   67: iconst_4
    //   68: iconst_0
    //   69: iastore
    //   70: putfield columnWidths : [I
    //   73: aload #8
    //   75: bipush #13
    //   77: newarray int
    //   79: dup
    //   80: iconst_0
    //   81: iconst_0
    //   82: iastore
    //   83: dup
    //   84: iconst_1
    //   85: bipush #10
    //   87: iastore
    //   88: dup
    //   89: iconst_2
    //   90: iconst_0
    //   91: iastore
    //   92: dup
    //   93: iconst_3
    //   94: bipush #10
    //   96: iastore
    //   97: dup
    //   98: iconst_4
    //   99: iconst_0
    //   100: iastore
    //   101: dup
    //   102: iconst_5
    //   103: bipush #10
    //   105: iastore
    //   106: dup
    //   107: bipush #6
    //   109: iconst_0
    //   110: iastore
    //   111: dup
    //   112: bipush #7
    //   114: bipush #10
    //   116: iastore
    //   117: dup
    //   118: bipush #8
    //   120: iconst_0
    //   121: iastore
    //   122: dup
    //   123: bipush #9
    //   125: bipush #10
    //   127: iastore
    //   128: dup
    //   129: bipush #10
    //   131: iconst_0
    //   132: iastore
    //   133: dup
    //   134: bipush #11
    //   136: bipush #10
    //   138: iastore
    //   139: dup
    //   140: bipush #12
    //   142: iconst_0
    //   143: iastore
    //   144: putfield rowHeights : [I
    //   147: aload #7
    //   149: aload #8
    //   151: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   154: aload #7
    //   156: new javax/swing/border/EmptyBorder
    //   159: dup
    //   160: bipush #20
    //   162: bipush #20
    //   164: bipush #10
    //   166: bipush #10
    //   168: invokespecial <init> : (IIII)V
    //   171: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   174: aload_0
    //   175: new burp/Zg85
    //   178: dup
    //   179: aload #4
    //   181: invokevirtual ZjQ : ()Ljava/lang/String;
    //   184: invokespecial <init> : (Ljava/lang/String;)V
    //   187: putfield ZG : Lburp/Zg85;
    //   190: new burp/Zm99
    //   193: dup
    //   194: sipush #-6654
    //   197: sipush #-2163
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokespecial <init> : (Ljava/lang/String;)V
    //   206: astore #9
    //   208: new java/awt/GridBagConstraints
    //   211: dup
    //   212: invokespecial <init> : ()V
    //   215: astore #6
    //   217: aload #6
    //   219: iconst_0
    //   220: putfield gridx : I
    //   223: aload #6
    //   225: iconst_0
    //   226: putfield gridy : I
    //   229: aload #6
    //   231: bipush #24
    //   233: putfield anchor : I
    //   236: aload #7
    //   238: aload #9
    //   240: aload #6
    //   242: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   245: aload_0
    //   246: getfield ZG : Lburp/Zg85;
    //   249: aload_0
    //   250: <illegal opcode> actionPerformed : (Lburp/Zrv8;)Ljava/awt/event/ActionListener;
    //   255: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   258: new java/awt/GridBagConstraints
    //   261: dup
    //   262: invokespecial <init> : ()V
    //   265: astore #6
    //   267: aload #6
    //   269: iconst_2
    //   270: putfield gridx : I
    //   273: aload #6
    //   275: iconst_0
    //   276: putfield gridy : I
    //   279: aload #6
    //   281: iconst_2
    //   282: putfield fill : I
    //   285: aload #6
    //   287: bipush #23
    //   289: putfield anchor : I
    //   292: aload #7
    //   294: aload_0
    //   295: getfield ZG : Lburp/Zg85;
    //   298: aload #6
    //   300: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   303: new burp/Zm99
    //   306: dup
    //   307: sipush #-6642
    //   310: sipush #-29012
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: invokespecial <init> : (Ljava/lang/String;)V
    //   319: astore #10
    //   321: new java/awt/GridBagConstraints
    //   324: dup
    //   325: invokespecial <init> : ()V
    //   328: astore #6
    //   330: aload #6
    //   332: iconst_0
    //   333: putfield gridx : I
    //   336: aload #6
    //   338: iconst_2
    //   339: putfield gridy : I
    //   342: aload #6
    //   344: bipush #24
    //   346: putfield anchor : I
    //   349: aload #7
    //   351: aload #10
    //   353: aload #6
    //   355: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   358: aload_0
    //   359: new burp/Zg85
    //   362: dup
    //   363: aload #4
    //   365: invokevirtual ZjX : ()Ljava/lang/String;
    //   368: invokespecial <init> : (Ljava/lang/String;)V
    //   371: putfield Zz : Lburp/Zg85;
    //   374: aload_0
    //   375: getfield Zz : Lburp/Zg85;
    //   378: sipush #-6648
    //   381: sipush #7963
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual setName : (Ljava/lang/String;)V
    //   390: new java/awt/GridBagConstraints
    //   393: dup
    //   394: invokespecial <init> : ()V
    //   397: astore #6
    //   399: aload #6
    //   401: iconst_2
    //   402: putfield gridx : I
    //   405: aload #6
    //   407: iconst_2
    //   408: putfield gridy : I
    //   411: aload #6
    //   413: iconst_2
    //   414: putfield fill : I
    //   417: aload #6
    //   419: bipush #23
    //   421: putfield anchor : I
    //   424: aload #7
    //   426: aload_0
    //   427: getfield Zz : Lburp/Zg85;
    //   430: aload #6
    //   432: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   435: new burp/Zm99
    //   438: dup
    //   439: sipush #-6650
    //   442: sipush #-9232
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: invokespecial <init> : (Ljava/lang/String;)V
    //   451: astore #11
    //   453: new java/awt/GridBagConstraints
    //   456: dup
    //   457: invokespecial <init> : ()V
    //   460: astore #6
    //   462: aload #6
    //   464: iconst_0
    //   465: putfield gridx : I
    //   468: aload #6
    //   470: iconst_4
    //   471: putfield gridy : I
    //   474: aload #6
    //   476: bipush #24
    //   478: putfield anchor : I
    //   481: aload #7
    //   483: aload #11
    //   485: aload #6
    //   487: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   490: aload_0
    //   491: new burp/Zg85
    //   494: dup
    //   495: aload #4
    //   497: invokevirtual ZjR : ()Ljava/lang/String;
    //   500: invokespecial <init> : (Ljava/lang/String;)V
    //   503: putfield Zj : Lburp/Zg85;
    //   506: aload_0
    //   507: getfield Zj : Lburp/Zg85;
    //   510: sipush #-6652
    //   513: sipush #11142
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: invokevirtual setName : (Ljava/lang/String;)V
    //   522: new java/awt/GridBagConstraints
    //   525: dup
    //   526: invokespecial <init> : ()V
    //   529: astore #6
    //   531: aload #6
    //   533: iconst_2
    //   534: putfield gridx : I
    //   537: aload #6
    //   539: iconst_4
    //   540: putfield gridy : I
    //   543: aload #6
    //   545: iconst_2
    //   546: putfield fill : I
    //   549: aload #6
    //   551: bipush #23
    //   553: putfield anchor : I
    //   556: aload #7
    //   558: aload_0
    //   559: getfield Zj : Lburp/Zg85;
    //   562: aload #6
    //   564: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   567: new burp/Zm99
    //   570: dup
    //   571: sipush #-6644
    //   574: sipush #10198
    //   577: invokestatic a : (II)Ljava/lang/String;
    //   580: invokespecial <init> : (Ljava/lang/String;)V
    //   583: astore #12
    //   585: new java/awt/GridBagConstraints
    //   588: dup
    //   589: invokespecial <init> : ()V
    //   592: astore #6
    //   594: aload #6
    //   596: iconst_0
    //   597: putfield gridx : I
    //   600: aload #6
    //   602: bipush #6
    //   604: putfield gridy : I
    //   607: aload #6
    //   609: bipush #24
    //   611: putfield anchor : I
    //   614: aload #7
    //   616: aload #12
    //   618: aload #6
    //   620: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   623: invokestatic ZX : ()[Ljava/lang/String;
    //   626: aload_0
    //   627: new burp/Zg85
    //   630: dup
    //   631: aload #4
    //   633: invokevirtual Zje : ()Ljava/lang/String;
    //   636: invokespecial <init> : (Ljava/lang/String;)V
    //   639: putfield ZI : Lburp/Zg85;
    //   642: aload_0
    //   643: getfield ZI : Lburp/Zg85;
    //   646: sipush #-6651
    //   649: sipush #-15569
    //   652: invokestatic a : (II)Ljava/lang/String;
    //   655: invokevirtual setName : (Ljava/lang/String;)V
    //   658: new java/awt/GridBagConstraints
    //   661: dup
    //   662: invokespecial <init> : ()V
    //   665: astore #6
    //   667: aload #6
    //   669: iconst_2
    //   670: putfield gridx : I
    //   673: aload #6
    //   675: bipush #6
    //   677: putfield gridy : I
    //   680: aload #6
    //   682: iconst_2
    //   683: putfield fill : I
    //   686: aload #6
    //   688: bipush #23
    //   690: putfield anchor : I
    //   693: aload #7
    //   695: aload_0
    //   696: getfield ZI : Lburp/Zg85;
    //   699: aload #6
    //   701: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   704: aload_0
    //   705: new burp/Zm9e
    //   708: dup
    //   709: invokespecial <init> : ()V
    //   712: putfield Zd : Lburp/Zm9e;
    //   715: new java/awt/GridBagConstraints
    //   718: dup
    //   719: invokespecial <init> : ()V
    //   722: astore #6
    //   724: aload #6
    //   726: iconst_0
    //   727: putfield gridx : I
    //   730: aload #6
    //   732: bipush #8
    //   734: putfield gridy : I
    //   737: aload #6
    //   739: bipush #24
    //   741: putfield anchor : I
    //   744: aload #7
    //   746: aload_0
    //   747: getfield Zd : Lburp/Zm9e;
    //   750: aload #6
    //   752: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   755: new burp/Zm99
    //   758: dup
    //   759: sipush #-6631
    //   762: sipush #8252
    //   765: invokestatic a : (II)Ljava/lang/String;
    //   768: invokespecial <init> : (Ljava/lang/String;)V
    //   771: astore #13
    //   773: new java/awt/GridBagConstraints
    //   776: dup
    //   777: invokespecial <init> : ()V
    //   780: astore #6
    //   782: aload #6
    //   784: iconst_2
    //   785: putfield gridx : I
    //   788: aload #6
    //   790: bipush #8
    //   792: putfield gridy : I
    //   795: aload #6
    //   797: bipush #23
    //   799: putfield anchor : I
    //   802: aload #7
    //   804: aload #13
    //   806: aload #6
    //   808: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   811: aload_0
    //   812: aload_0
    //   813: invokevirtual ZC : ()Lburp/Zbqc;
    //   816: putfield Zy : Lburp/Zbqc;
    //   819: new java/awt/GridBagConstraints
    //   822: dup
    //   823: invokespecial <init> : ()V
    //   826: astore #6
    //   828: aload #6
    //   830: iconst_2
    //   831: putfield gridx : I
    //   834: aload #6
    //   836: bipush #10
    //   838: putfield gridy : I
    //   841: aload #6
    //   843: iconst_1
    //   844: putfield fill : I
    //   847: aload #6
    //   849: bipush #23
    //   851: putfield anchor : I
    //   854: aload #7
    //   856: aload_0
    //   857: getfield Zy : Lburp/Zbqc;
    //   860: aload #6
    //   862: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   865: aload_0
    //   866: new burp/Zm9v
    //   869: dup
    //   870: invokespecial <init> : ()V
    //   873: putfield ZF : Lburp/Zm9v;
    //   876: aload_0
    //   877: getfield ZF : Lburp/Zm9v;
    //   880: sipush #-6647
    //   883: sipush #22903
    //   886: invokestatic a : (II)Ljava/lang/String;
    //   889: invokevirtual setName : (Ljava/lang/String;)V
    //   892: aload_0
    //   893: getfield ZF : Lburp/Zm9v;
    //   896: iconst_4
    //   897: invokevirtual setHorizontalAlignment : (I)V
    //   900: new java/awt/GridBagConstraints
    //   903: dup
    //   904: invokespecial <init> : ()V
    //   907: astore #6
    //   909: aload #6
    //   911: iconst_2
    //   912: putfield gridx : I
    //   915: aload #6
    //   917: bipush #12
    //   919: putfield gridy : I
    //   922: aload #6
    //   924: bipush #23
    //   926: putfield anchor : I
    //   929: aload #7
    //   931: aload_0
    //   932: getfield ZF : Lburp/Zm9v;
    //   935: aload #6
    //   937: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   940: aload_0
    //   941: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   944: aload #7
    //   946: sipush #-6643
    //   949: sipush #-12535
    //   952: invokestatic a : (II)Ljava/lang/String;
    //   955: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   958: new burp/Zbqc
    //   961: dup
    //   962: invokespecial <init> : ()V
    //   965: astore #14
    //   967: aload #14
    //   969: new javax/swing/border/EmptyBorder
    //   972: dup
    //   973: iconst_5
    //   974: bipush #10
    //   976: bipush #10
    //   978: bipush #10
    //   980: invokespecial <init> : (IIII)V
    //   983: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   986: aload #14
    //   988: new java/awt/BorderLayout
    //   991: dup
    //   992: invokespecial <init> : ()V
    //   995: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   998: new burp/Zbqc
    //   1001: dup
    //   1002: invokespecial <init> : ()V
    //   1005: astore #15
    //   1007: aload #15
    //   1009: new javax/swing/border/EmptyBorder
    //   1012: dup
    //   1013: iconst_0
    //   1014: bipush #15
    //   1016: iconst_0
    //   1017: iconst_0
    //   1018: invokespecial <init> : (IIII)V
    //   1021: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   1024: aload #15
    //   1026: new java/awt/GridLayout
    //   1029: dup
    //   1030: iconst_1
    //   1031: iconst_0
    //   1032: bipush #15
    //   1034: iconst_0
    //   1035: invokespecial <init> : (IIII)V
    //   1038: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   1041: new burp/Ze01
    //   1044: dup
    //   1045: sipush #-6649
    //   1048: sipush #-19657
    //   1051: invokestatic a : (II)Ljava/lang/String;
    //   1054: invokespecial <init> : (Ljava/lang/String;)V
    //   1057: astore #16
    //   1059: aload #16
    //   1061: getstatic burp/Zt00.BOLD_FONT : Lburp/Zt00;
    //   1064: invokevirtual ZX : (Lburp/Zt00;)V
    //   1067: aload #16
    //   1069: sipush #-6641
    //   1072: sipush #7727
    //   1075: invokestatic a : (II)Ljava/lang/String;
    //   1078: invokevirtual setName : (Ljava/lang/String;)V
    //   1081: aload #16
    //   1083: aload_0
    //   1084: <illegal opcode> actionPerformed : (Lburp/Zrv8;)Ljava/awt/event/ActionListener;
    //   1089: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   1092: aload #15
    //   1094: aload #16
    //   1096: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1099: pop
    //   1100: new burp/Ze01
    //   1103: dup
    //   1104: sipush #-6653
    //   1107: sipush #23548
    //   1110: invokestatic a : (II)Ljava/lang/String;
    //   1113: invokespecial <init> : (Ljava/lang/String;)V
    //   1116: astore #17
    //   1118: aload #17
    //   1120: getstatic burp/Zt00.BOLD_FONT : Lburp/Zt00;
    //   1123: invokevirtual ZX : (Lburp/Zt00;)V
    //   1126: aload #17
    //   1128: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   1131: invokevirtual Zj : (Lburp/Zlkk;)V
    //   1134: aload #17
    //   1136: sipush #-6656
    //   1139: sipush #-28450
    //   1142: invokestatic a : (II)Ljava/lang/String;
    //   1145: invokevirtual setName : (Ljava/lang/String;)V
    //   1148: aload #17
    //   1150: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   1153: invokevirtual Zv : (Lburp/Zlkk;)V
    //   1156: aload #17
    //   1158: aload_0
    //   1159: <illegal opcode> actionPerformed : (Lburp/Zrv8;)Ljava/awt/event/ActionListener;
    //   1164: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   1167: aload #15
    //   1169: aload #17
    //   1171: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1174: pop
    //   1175: astore #5
    //   1177: aload #14
    //   1179: aload #15
    //   1181: sipush #-6655
    //   1184: sipush #27060
    //   1187: invokestatic a : (II)Ljava/lang/String;
    //   1190: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1193: aload_0
    //   1194: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   1197: aload #14
    //   1199: sipush #-6645
    //   1202: sipush #11105
    //   1205: invokestatic a : (II)Ljava/lang/String;
    //   1208: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1211: ldc ''
    //   1213: astore #18
    //   1215: aload_0
    //   1216: aload #18
    //   1218: invokevirtual setTitle : (Ljava/lang/String;)V
    //   1221: aload_0
    //   1222: invokevirtual ZZ : ()V
    //   1225: aload_2
    //   1226: ifnonnull -> 1241
    //   1229: aload_0
    //   1230: aconst_null
    //   1231: iconst_0
    //   1232: iconst_0
    //   1233: invokevirtual Zv : (Ljava/awt/Window;II)V
    //   1236: aload #5
    //   1238: ifnull -> 1248
    //   1241: aload_0
    //   1242: aload_2
    //   1243: iconst_0
    //   1244: iconst_0
    //   1245: invokevirtual Zl : (Ljava/awt/Window;II)V
    //   1248: aload_0
    //   1249: new burp/Zgue
    //   1252: dup
    //   1253: aload_0
    //   1254: invokespecial <init> : (Lburp/Zrv8;)V
    //   1257: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   1260: aload_0
    //   1261: iconst_1
    //   1262: invokevirtual setVisible : (Z)V
    //   1265: aload_0
    //   1266: aload #4
    //   1268: <illegal opcode> run : (Lburp/Zrv8;Lburp/Zg96;)Ljava/lang/Runnable;
    //   1273: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   1276: return
  }
  
  private Zbqc ZC() {
    Zbqc zbqc = new Zbqc();
    zbqc.setLayout(new BoxLayout(zbqc, 1));
    zbqc.setBorder(new EmptyBorder(10, 0, 10, 0));
    Zl8w zl8w = new Zl8w("");
    zbqc.add(zl8w);
    return zbqc;
  }
  
  private void Zx() {
    Zm2.ZC(Zrrh.SCANNER_AI_RECORDED_LOGIN_HOW_IT_WORKS_OPENED);
    this.Zd.Zr(a(-6632, 29938), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL_PRESSED), this::ZZ);
    this.Zy.setVisible(true);
    pack();
  }
  
  private void ZZ() {
    this.Zd.Zr(a(-6632, 29938), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_PRESSED), this::Zx);
    this.Zy.setVisible(false);
    pack();
    setMinimumSize(getPreferredSize());
  }
  
  private void Zz() {
    // Byte code:
    //   0: new burp/Zg96
    //   3: dup
    //   4: aload_0
    //   5: getfield ZG : Lburp/Zg85;
    //   8: invokevirtual getText : ()Ljava/lang/String;
    //   11: aload_0
    //   12: getfield Zz : Lburp/Zg85;
    //   15: invokevirtual getText : ()Ljava/lang/String;
    //   18: aload_0
    //   19: getfield Zj : Lburp/Zg85;
    //   22: invokevirtual getText : ()Ljava/lang/String;
    //   25: aload_0
    //   26: getfield ZI : Lburp/Zg85;
    //   29: invokevirtual getText : ()Ljava/lang/String;
    //   32: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   35: astore_2
    //   36: invokestatic ZX : ()[Ljava/lang/String;
    //   39: aload_0
    //   40: getfield Zs : Lburp/Ztf9;
    //   43: aload_2
    //   44: invokeinterface Zr : (Lburp/Zg96;)Ljava/util/Optional;
    //   49: astore_3
    //   50: astore_1
    //   51: aload_3
    //   52: invokevirtual isPresent : ()Z
    //   55: ifeq -> 83
    //   58: aload_0
    //   59: getfield ZF : Lburp/Zm9v;
    //   62: aload_3
    //   63: invokevirtual get : ()Ljava/lang/Object;
    //   66: checkcast java/lang/String
    //   69: invokevirtual setText : (Ljava/lang/String;)V
    //   72: aload_1
    //   73: ifnull -> 116
    //   76: goto -> 83
    //   79: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   82: athrow
    //   83: aload_0
    //   84: invokevirtual ZP : ()V
    //   87: aload_0
    //   88: getfield ZU : Lburp/Zz62;
    //   91: aload_0
    //   92: getfield Zp : Ljava/awt/Window;
    //   95: aload_0
    //   96: getfield Zs : Lburp/Ztf9;
    //   99: aload_2
    //   100: invokestatic Za : (Lburp/Zz62;Ljava/awt/Window;Lburp/Ztf9;Lburp/Zg96;)V
    //   103: goto -> 116
    //   106: astore #4
    //   108: aload #4
    //   110: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   113: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   116: return
    // Exception table:
    //   from	to	target	type
    //   51	76	79	net/portswigger/browser/Ztf
    //   87	103	106	net/portswigger/browser/Ztf
  }
  
  private void Zn() {
    ZP();
    this.ZU.Za();
  }
  
  private void ZP() {
    setVisible(false);
    dispose();
  }
  
  static void ZG(Zz62 paramZz62, Window paramWindow, Ztf9 paramZtf9) {
    new Zrv8(paramZz62, paramWindow, paramZtf9);
  }
  
  static void Zk(Zz62 paramZz62, Window paramWindow, Ztf9 paramZtf9, Zg96 paramZg96) {
    new Zrv8(paramZz62, paramWindow, paramZtf9, paramZg96);
  }
  
  private void lambda$new$3(Zg96 paramZg96) {
    String[] arrayOfString = Zb5b.ZX();
    if (paramZg96.ZjX().isEmpty()) {
      this.Zz.requestFocus();
      if (arrayOfString != null) {
        this.Zj.requestFocus();
        return;
      } 
      return;
    } 
    this.Zj.requestFocus();
  }
  
  private void lambda$new$1(ActionEvent paramActionEvent) {
    Zn();
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    Zz();
  }
  
  private static Ztf a(Ztf paramZtf) {
    return paramZtf;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '±­È{rU ÇOÒ£H21/l»ÙÀÍøÈµ"èãÉTÚ ¼]õø\\bvK¼_ÿ"J²1ª©ê(»5m\\b<²d8øtºéü\\rÆs\\t»ËÜèVUVRÑNvAC$ºI©ç^Æ¥µÿÚaqj$ö'¶ «±2ö¿×ÌåÊ\\f ó½y{ÏkÓ33L ±m|ß¹Ó¯Ñ)Ø=ÇÍm"±Ò§0Ñ?Ó¾ÅÂY"¬^cÖ=÷í%Ï¤ZqC¨Bò<\\nÁyQeXc·±]ðQxêiaÔËÆ=1%.;\\fï\¶¡1}DÎ°[d]äOABë ¨¾X¾BÌ5ÝO\\tkpuÎhxlæíçY;ªÀÊ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #81
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
    //   68: ldc '3·¸ÞîòiR\\f@üº1~Ãq3'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #57
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
    //   129: putstatic burp/Zrv8.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrv8.b : [Ljava/lang/String;
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
    //   212: bipush #30
    //   214: goto -> 244
    //   217: bipush #14
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #93
    //   234: goto -> 244
    //   237: bipush #37
    //   239: goto -> 244
    //   242: bipush #127
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
    int i = (paramInt1 ^ 0xFFFFE608) & 0xFFFF;
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
      char c = 'ÿ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */