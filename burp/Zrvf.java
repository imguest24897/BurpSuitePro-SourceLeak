package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.Optional;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zm2;

public class Zrvf extends Zrh7 {
  private final int Zc;
  
  private final Ztf9 Zz;
  
  private final boolean Ze;
  
  private final Zg85 ZT;
  
  private final Zm9v Zn;
  
  private final Zm9e Zl;
  
  private final Zbqc ZS;
  
  private final Zk2k Zv;
  
  private final Zr94 ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZC(Window paramWindow, Ztf9 paramZtf9) {
    new Zrvf(paramWindow, 0, null, paramZtf9);
  }
  
  static void ZO(Window paramWindow, int paramInt, Zko4 paramZko4, Ztf9 paramZtf9) {
    new Zrvf(paramWindow, paramInt, paramZko4, paramZtf9);
  }
  
  private Zrvf(Window paramWindow, int paramInt, Zko4 paramZko4, Ztf9 paramZtf9) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.CREDENTIALS_EDITOR : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: invokestatic ZX : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: iload_2
    //   14: putfield Zc : I
    //   17: aload_0
    //   18: aload #4
    //   20: putfield Zz : Lburp/Ztf9;
    //   23: new burp/Zbqc
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #7
    //   32: astore #5
    //   34: new java/awt/GridBagLayout
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: astore #8
    //   43: aload #8
    //   45: iconst_5
    //   46: newarray int
    //   48: dup
    //   49: iconst_0
    //   50: iconst_0
    //   51: iastore
    //   52: dup
    //   53: iconst_1
    //   54: iconst_5
    //   55: iastore
    //   56: dup
    //   57: iconst_2
    //   58: iconst_0
    //   59: iastore
    //   60: dup
    //   61: iconst_3
    //   62: iconst_5
    //   63: iastore
    //   64: dup
    //   65: iconst_4
    //   66: iconst_0
    //   67: iastore
    //   68: putfield columnWidths : [I
    //   71: aload #8
    //   73: bipush #7
    //   75: newarray int
    //   77: dup
    //   78: iconst_0
    //   79: iconst_0
    //   80: iastore
    //   81: dup
    //   82: iconst_1
    //   83: iconst_5
    //   84: iastore
    //   85: dup
    //   86: iconst_2
    //   87: iconst_0
    //   88: iastore
    //   89: dup
    //   90: iconst_3
    //   91: bipush #10
    //   93: iastore
    //   94: dup
    //   95: iconst_4
    //   96: iconst_0
    //   97: iastore
    //   98: dup
    //   99: iconst_5
    //   100: bipush #10
    //   102: iastore
    //   103: dup
    //   104: bipush #6
    //   106: iconst_0
    //   107: iastore
    //   108: putfield rowHeights : [I
    //   111: aload #7
    //   113: aload #8
    //   115: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   118: aload #7
    //   120: new javax/swing/border/EmptyBorder
    //   123: dup
    //   124: bipush #20
    //   126: bipush #20
    //   128: bipush #10
    //   130: bipush #10
    //   132: invokespecial <init> : (IIII)V
    //   135: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   138: aload_0
    //   139: new burp/Zg85
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: putfield ZT : Lburp/Zg85;
    //   149: aload_0
    //   150: getfield ZT : Lburp/Zg85;
    //   153: sipush #-22173
    //   156: sipush #11074
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: invokevirtual setName : (Ljava/lang/String;)V
    //   165: aload_0
    //   166: new burp/Zk2k
    //   169: dup
    //   170: aload_3
    //   171: ifnonnull -> 178
    //   174: aconst_null
    //   175: goto -> 184
    //   178: aload_3
    //   179: invokeinterface ZRc : ()Ljava/lang/String;
    //   184: invokespecial <init> : (Ljava/lang/String;)V
    //   187: putfield Zv : Lburp/Zk2k;
    //   190: aload_0
    //   191: new burp/Zr94
    //   194: dup
    //   195: aload_1
    //   196: aload_0
    //   197: aload_0
    //   198: getfield Zv : Lburp/Zk2k;
    //   201: aload_0
    //   202: getfield ZT : Lburp/Zg85;
    //   205: invokespecial <init> : (Ljava/awt/Window;Lburp/Zrh7;Lburp/Zk2k;Lburp/Zg85;)V
    //   208: putfield ZU : Lburp/Zr94;
    //   211: new burp/Zm99
    //   214: dup
    //   215: sipush #-22158
    //   218: sipush #-17933
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: invokespecial <init> : (Ljava/lang/String;)V
    //   227: astore #9
    //   229: new java/awt/GridBagConstraints
    //   232: dup
    //   233: invokespecial <init> : ()V
    //   236: astore #6
    //   238: aload #6
    //   240: iconst_0
    //   241: putfield gridx : I
    //   244: aload #6
    //   246: iconst_0
    //   247: putfield gridy : I
    //   250: aload #6
    //   252: bipush #24
    //   254: putfield anchor : I
    //   257: aload #7
    //   259: aload #9
    //   261: aload #6
    //   263: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   266: aload_0
    //   267: getfield ZT : Lburp/Zg85;
    //   270: aload_0
    //   271: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   276: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   279: new java/awt/GridBagConstraints
    //   282: dup
    //   283: invokespecial <init> : ()V
    //   286: astore #6
    //   288: aload #6
    //   290: iconst_2
    //   291: putfield gridx : I
    //   294: aload #6
    //   296: iconst_0
    //   297: putfield gridy : I
    //   300: aload #6
    //   302: iconst_2
    //   303: putfield fill : I
    //   306: aload #6
    //   308: bipush #23
    //   310: putfield anchor : I
    //   313: aload #7
    //   315: aload_0
    //   316: getfield ZT : Lburp/Zg85;
    //   319: aload #6
    //   321: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   324: new burp/Zm99
    //   327: dup
    //   328: sipush #-22161
    //   331: sipush #-25692
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: invokespecial <init> : (Ljava/lang/String;)V
    //   340: astore #10
    //   342: new java/awt/GridBagConstraints
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: astore #6
    //   351: aload #6
    //   353: iconst_0
    //   354: putfield gridx : I
    //   357: aload #6
    //   359: iconst_2
    //   360: putfield gridy : I
    //   363: aload #6
    //   365: bipush #24
    //   367: putfield anchor : I
    //   370: aload #7
    //   372: aload #10
    //   374: aload #6
    //   376: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   379: new burp/Zbup
    //   382: dup
    //   383: aload_0
    //   384: getfield ZU : Lburp/Zr94;
    //   387: invokevirtual ZM : ()Ljava/awt/Component;
    //   390: invokespecial <init> : (Ljava/awt/Component;)V
    //   393: astore #11
    //   395: aload #11
    //   397: bipush #31
    //   399: invokevirtual setHorizontalScrollBarPolicy : (I)V
    //   402: new java/awt/GridBagConstraints
    //   405: dup
    //   406: invokespecial <init> : ()V
    //   409: astore #6
    //   411: aload #6
    //   413: iconst_2
    //   414: putfield gridx : I
    //   417: aload #6
    //   419: iconst_2
    //   420: putfield gridy : I
    //   423: aload #6
    //   425: iconst_1
    //   426: putfield fill : I
    //   429: aload #6
    //   431: bipush #23
    //   433: putfield anchor : I
    //   436: aload #6
    //   438: dconst_1
    //   439: putfield weightx : D
    //   442: aload #6
    //   444: dconst_1
    //   445: putfield weighty : D
    //   448: aload #7
    //   450: aload #11
    //   452: aload #6
    //   454: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   457: aload_0
    //   458: new burp/Zm9e
    //   461: dup
    //   462: invokespecial <init> : ()V
    //   465: putfield Zl : Lburp/Zm9e;
    //   468: new java/awt/GridBagConstraints
    //   471: dup
    //   472: invokespecial <init> : ()V
    //   475: astore #6
    //   477: aload #6
    //   479: iconst_0
    //   480: putfield gridx : I
    //   483: aload #6
    //   485: iconst_4
    //   486: putfield gridy : I
    //   489: aload #6
    //   491: bipush #24
    //   493: putfield anchor : I
    //   496: aload #7
    //   498: aload_0
    //   499: getfield Zl : Lburp/Zm9e;
    //   502: aload #6
    //   504: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   507: new burp/Zm99
    //   510: dup
    //   511: sipush #-22167
    //   514: sipush #-228
    //   517: invokestatic a : (II)Ljava/lang/String;
    //   520: invokespecial <init> : (Ljava/lang/String;)V
    //   523: astore #12
    //   525: new java/awt/GridBagConstraints
    //   528: dup
    //   529: invokespecial <init> : ()V
    //   532: astore #6
    //   534: aload #6
    //   536: iconst_2
    //   537: putfield gridx : I
    //   540: aload #6
    //   542: iconst_4
    //   543: putfield gridy : I
    //   546: aload #6
    //   548: bipush #23
    //   550: putfield anchor : I
    //   553: aload #7
    //   555: aload #12
    //   557: aload #6
    //   559: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   562: aload_0
    //   563: aload_0
    //   564: invokevirtual Zu : ()Lburp/Zbqc;
    //   567: putfield ZS : Lburp/Zbqc;
    //   570: new java/awt/GridBagConstraints
    //   573: dup
    //   574: invokespecial <init> : ()V
    //   577: astore #6
    //   579: aload #6
    //   581: iconst_2
    //   582: putfield gridx : I
    //   585: aload #6
    //   587: bipush #6
    //   589: putfield gridy : I
    //   592: aload #6
    //   594: iconst_1
    //   595: putfield fill : I
    //   598: aload #6
    //   600: bipush #23
    //   602: putfield anchor : I
    //   605: aload #7
    //   607: aload_0
    //   608: getfield ZS : Lburp/Zbqc;
    //   611: aload #6
    //   613: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   616: new burp/Zbqc
    //   619: dup
    //   620: new java/awt/GridLayout
    //   623: dup
    //   624: iconst_4
    //   625: iconst_1
    //   626: iconst_0
    //   627: iconst_5
    //   628: invokespecial <init> : (IIII)V
    //   631: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   634: astore #13
    //   636: new burp/Ze01
    //   639: dup
    //   640: sipush #-22176
    //   643: sipush #-24208
    //   646: invokestatic a : (II)Ljava/lang/String;
    //   649: invokespecial <init> : (Ljava/lang/String;)V
    //   652: astore #14
    //   654: aload #14
    //   656: sipush #-22156
    //   659: sipush #-23293
    //   662: invokestatic a : (II)Ljava/lang/String;
    //   665: invokevirtual setName : (Ljava/lang/String;)V
    //   668: aload #14
    //   670: aload_0
    //   671: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   676: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   679: new burp/Ze01
    //   682: dup
    //   683: sipush #-22150
    //   686: sipush #-29061
    //   689: invokestatic a : (II)Ljava/lang/String;
    //   692: invokespecial <init> : (Ljava/lang/String;)V
    //   695: astore #15
    //   697: aload #15
    //   699: sipush #-22172
    //   702: sipush #-8750
    //   705: invokestatic a : (II)Ljava/lang/String;
    //   708: invokevirtual setName : (Ljava/lang/String;)V
    //   711: aload #15
    //   713: aload_0
    //   714: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   719: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   722: new burp/Ze01
    //   725: dup
    //   726: sipush #-22151
    //   729: sipush #20389
    //   732: invokestatic a : (II)Ljava/lang/String;
    //   735: invokespecial <init> : (Ljava/lang/String;)V
    //   738: astore #16
    //   740: aload #16
    //   742: sipush #-22148
    //   745: sipush #-27239
    //   748: invokestatic a : (II)Ljava/lang/String;
    //   751: invokevirtual setName : (Ljava/lang/String;)V
    //   754: aload #16
    //   756: aload_0
    //   757: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   762: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   765: new burp/Ze01
    //   768: dup
    //   769: sipush #-22159
    //   772: sipush #-12857
    //   775: invokestatic a : (II)Ljava/lang/String;
    //   778: invokespecial <init> : (Ljava/lang/String;)V
    //   781: astore #17
    //   783: aload #17
    //   785: sipush #-22162
    //   788: sipush #-28345
    //   791: invokestatic a : (II)Ljava/lang/String;
    //   794: invokevirtual setName : (Ljava/lang/String;)V
    //   797: aload #17
    //   799: aload_0
    //   800: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   805: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   808: aload #13
    //   810: aload #14
    //   812: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   815: pop
    //   816: aload #13
    //   818: aload #15
    //   820: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   823: pop
    //   824: aload #13
    //   826: aload #16
    //   828: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   831: pop
    //   832: aload #13
    //   834: aload #17
    //   836: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   839: pop
    //   840: new java/awt/GridBagConstraints
    //   843: dup
    //   844: invokespecial <init> : ()V
    //   847: astore #6
    //   849: aload #6
    //   851: iconst_4
    //   852: putfield gridx : I
    //   855: aload #6
    //   857: iconst_2
    //   858: putfield gridy : I
    //   861: aload #6
    //   863: bipush #23
    //   865: putfield anchor : I
    //   868: aload #7
    //   870: aload #13
    //   872: aload #6
    //   874: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   877: aload_0
    //   878: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   881: aload #7
    //   883: sipush #-22147
    //   886: sipush #14275
    //   889: invokestatic a : (II)Ljava/lang/String;
    //   892: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   895: new burp/Zbqc
    //   898: dup
    //   899: invokespecial <init> : ()V
    //   902: astore #18
    //   904: aload #18
    //   906: new javax/swing/border/EmptyBorder
    //   909: dup
    //   910: iconst_5
    //   911: bipush #10
    //   913: bipush #10
    //   915: bipush #10
    //   917: invokespecial <init> : (IIII)V
    //   920: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   923: aload #18
    //   925: new java/awt/BorderLayout
    //   928: dup
    //   929: invokespecial <init> : ()V
    //   932: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   935: aload_0
    //   936: new burp/Zm9v
    //   939: dup
    //   940: invokespecial <init> : ()V
    //   943: putfield Zn : Lburp/Zm9v;
    //   946: aload_0
    //   947: getfield Zn : Lburp/Zm9v;
    //   950: iconst_4
    //   951: invokevirtual setHorizontalAlignment : (I)V
    //   954: aload #18
    //   956: aload_0
    //   957: getfield Zn : Lburp/Zm9v;
    //   960: sipush #-22152
    //   963: sipush #-30112
    //   966: invokestatic a : (II)Ljava/lang/String;
    //   969: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   972: new burp/Zbqc
    //   975: dup
    //   976: invokespecial <init> : ()V
    //   979: astore #19
    //   981: aload #19
    //   983: new javax/swing/border/EmptyBorder
    //   986: dup
    //   987: iconst_0
    //   988: bipush #15
    //   990: iconst_0
    //   991: iconst_0
    //   992: invokespecial <init> : (IIII)V
    //   995: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   998: aload #19
    //   1000: new java/awt/GridLayout
    //   1003: dup
    //   1004: iconst_1
    //   1005: iconst_0
    //   1006: bipush #15
    //   1008: iconst_0
    //   1009: invokespecial <init> : (IIII)V
    //   1012: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   1015: new burp/Ze01
    //   1018: dup
    //   1019: invokespecial <init> : ()V
    //   1022: astore #20
    //   1024: aload #20
    //   1026: sipush #-22166
    //   1029: sipush #-31494
    //   1032: invokestatic a : (II)Ljava/lang/String;
    //   1035: invokevirtual setName : (Ljava/lang/String;)V
    //   1038: aload #20
    //   1040: aload_0
    //   1041: aload #20
    //   1043: aload #15
    //   1045: aload #14
    //   1047: aload #16
    //   1049: aload #17
    //   1051: <illegal opcode> actionPerformed : (Lburp/Zrvf;Lburp/Ze01;Lburp/Ze01;Lburp/Ze01;Lburp/Ze01;Lburp/Ze01;)Ljava/awt/event/ActionListener;
    //   1056: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   1059: aload #19
    //   1061: aload #20
    //   1063: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1066: pop
    //   1067: new burp/Ze01
    //   1070: dup
    //   1071: sipush #-22157
    //   1074: sipush #-6687
    //   1077: invokestatic a : (II)Ljava/lang/String;
    //   1080: invokespecial <init> : (Ljava/lang/String;)V
    //   1083: astore #21
    //   1085: aload #21
    //   1087: sipush #-22164
    //   1090: sipush #29139
    //   1093: invokestatic a : (II)Ljava/lang/String;
    //   1096: invokevirtual setName : (Ljava/lang/String;)V
    //   1099: aload #21
    //   1101: aload_0
    //   1102: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   1107: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   1110: aload #19
    //   1112: aload #21
    //   1114: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1117: pop
    //   1118: new burp/Ze01
    //   1121: dup
    //   1122: sipush #-22170
    //   1125: sipush #-12208
    //   1128: invokestatic a : (II)Ljava/lang/String;
    //   1131: invokespecial <init> : (Ljava/lang/String;)V
    //   1134: astore #22
    //   1136: aload #22
    //   1138: aload_0
    //   1139: <illegal opcode> actionPerformed : (Lburp/Zrvf;)Ljava/awt/event/ActionListener;
    //   1144: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   1147: aload #19
    //   1149: aload #22
    //   1151: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1154: pop
    //   1155: aload #18
    //   1157: aload #19
    //   1159: sipush #-22163
    //   1162: sipush #-15270
    //   1165: invokestatic a : (II)Ljava/lang/String;
    //   1168: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1171: aload_0
    //   1172: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   1175: aload #18
    //   1177: sipush #-22168
    //   1180: sipush #-27714
    //   1183: invokestatic a : (II)Ljava/lang/String;
    //   1186: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1189: aload_3
    //   1190: ifnonnull -> 1230
    //   1193: aload_0
    //   1194: sipush #-22169
    //   1197: sipush #-5460
    //   1200: invokestatic a : (II)Ljava/lang/String;
    //   1203: invokevirtual setTitle : (Ljava/lang/String;)V
    //   1206: aload_0
    //   1207: getfield ZU : Lburp/Zr94;
    //   1210: invokevirtual ZP : ()V
    //   1213: aload_0
    //   1214: iconst_0
    //   1215: putfield Ze : Z
    //   1218: aload #5
    //   1220: ifnull -> 1275
    //   1223: goto -> 1230
    //   1226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1229: athrow
    //   1230: aload_0
    //   1231: sipush #-22160
    //   1234: sipush #26236
    //   1237: invokestatic a : (II)Ljava/lang/String;
    //   1240: invokevirtual setTitle : (Ljava/lang/String;)V
    //   1243: aload_0
    //   1244: getfield ZT : Lburp/Zg85;
    //   1247: aload_3
    //   1248: invokeinterface ZP : ()Ljava/lang/String;
    //   1253: invokevirtual setText : (Ljava/lang/String;)V
    //   1256: aload_0
    //   1257: getfield ZU : Lburp/Zr94;
    //   1260: invokevirtual Zr : ()V
    //   1263: aload_0
    //   1264: iconst_1
    //   1265: putfield Ze : Z
    //   1268: goto -> 1275
    //   1271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1274: athrow
    //   1275: aload #20
    //   1277: aload_0
    //   1278: getfield ZU : Lburp/Zr94;
    //   1281: invokevirtual ZA : ()Ljava/lang/String;
    //   1284: invokevirtual setText : (Ljava/lang/String;)V
    //   1287: aload_0
    //   1288: getfield ZU : Lburp/Zr94;
    //   1291: invokevirtual Zs : ()Z
    //   1294: istore #23
    //   1296: aload #15
    //   1298: iload #23
    //   1300: invokevirtual setEnabled : (Z)V
    //   1303: aload #14
    //   1305: iload #23
    //   1307: invokevirtual setEnabled : (Z)V
    //   1310: aload #16
    //   1312: iload #23
    //   1314: invokevirtual setEnabled : (Z)V
    //   1317: aload #17
    //   1319: iload #23
    //   1321: invokevirtual setEnabled : (Z)V
    //   1324: aload_0
    //   1325: invokevirtual ZJ : ()V
    //   1328: aload_1
    //   1329: ifnonnull -> 1351
    //   1332: aload_0
    //   1333: aconst_null
    //   1334: iconst_0
    //   1335: iconst_0
    //   1336: invokevirtual Zv : (Ljava/awt/Window;II)V
    //   1339: aload #5
    //   1341: ifnull -> 1365
    //   1344: goto -> 1351
    //   1347: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1350: athrow
    //   1351: aload_0
    //   1352: aload_1
    //   1353: iconst_0
    //   1354: iconst_0
    //   1355: invokevirtual Zl : (Ljava/awt/Window;II)V
    //   1358: goto -> 1365
    //   1361: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1364: athrow
    //   1365: aload_0
    //   1366: iconst_1
    //   1367: invokevirtual setVisible : (Z)V
    //   1370: goto -> 1402
    //   1373: astore #9
    //   1375: aload #9
    //   1377: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   1380: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1383: new java/lang/IllegalStateException
    //   1386: dup
    //   1387: sipush #-22149
    //   1390: sipush #-3363
    //   1393: invokestatic a : (II)Ljava/lang/String;
    //   1396: aload #9
    //   1398: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1401: athrow
    //   1402: return
    // Exception table:
    //   from	to	target	type
    //   138	1370	1373	net/portswigger/browser/Zcb
    //   1136	1223	1226	net/portswigger/browser/Zcb
    //   1193	1268	1271	net/portswigger/browser/Zcb
    //   1296	1344	1347	net/portswigger/browser/Zcb
    //   1332	1358	1361	net/portswigger/browser/Zcb
  }
  
  private Zbqc Zu() {
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setLayout(new BoxLayout(zbqc1, 1));
    zbqc1.setBorder(new EmptyBorder(10, 0, 10, 0));
    Zl8w zl8w1 = new Zl8w(a(-22165, 6578));
    zbqc1.add(zl8w1);
    Zbqc zbqc2 = new Zbqc();
    zbqc2.setLayout(new BoxLayout(zbqc2, 0));
    zbqc2.setBorder(new EmptyBorder(10, 0, 10, 0));
    Ze01 ze011 = new Ze01(a(-22153, -23598));
    ze011.addActionListener(this::Zk);
    zbqc2.add(ze011);
    zbqc2.add(Box.createHorizontalStrut(10));
    Ze01 ze012 = new Ze01(a(-22155, -9222));
    ze012.addActionListener(this::ZE);
    zbqc2.add(ze012);
    zbqc2.add(Box.createHorizontalGlue());
    zbqc1.add(zbqc2);
    Zl8w zl8w2 = new Zl8w(a(-22175, -21598));
    zbqc1.add(zl8w2);
    return zbqc1;
  }
  
  private void Zd() {
    Zm2.ZC(Zrrh.SCANNER_RECORDED_LOGIN_HOW_IT_WORKS_OPENED);
    this.Zl.Zr(a(-22154, -5183), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL_PRESSED), this::ZJ);
    this.ZS.setVisible(true);
    pack();
  }
  
  private void ZJ() {
    this.Zl.Zr(a(-22167, -228), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_PRESSED), this::Zd);
    this.ZS.setVisible(false);
    pack();
    setMinimumSize(getPreferredSize());
  }
  
  private void Z_() {
    setVisible(false);
    dispose();
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    String[] arrayOfString = Zb5b.ZX();
    try {
      this.ZU.Zv();
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Znk znk = new Znk((this.ZT.getText().isEmpty() && this.ZT.ZQ() != null) ? this.ZT.ZQ().substring(0, this.ZT.ZQ().indexOf(a(-22171, 21309))) : this.ZT.getText(), this.Zv.Zy());
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Optional<String> optional = this.Ze ? this.Zz.Za(this.Zc, znk) : this.Zz.Zy(znk);
    try {
      if (optional.isPresent()) {
        try {
          this.Zn.setText(optional.get());
          if (arrayOfString != null) {
            Z_();
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Z_();
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    Z_();
  }
  
  private void Zk(ActionEvent paramActionEvent) {
    Zke4.Zt(this, a(-22174, 21398), true);
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    Zz1q.Zc(this, Zk97.DESKTOP_SCANNING_SCAN_LAUNCHER_RECORDED_LOGINS);
  }
  
  private void lambda$new$4(Ze01 paramZe011, Ze01 paramZe012, Ze01 paramZe013, Ze01 paramZe014, Ze01 paramZe015, ActionEvent paramActionEvent) {
    this.ZU.ZT();
    paramZe011.setText(this.ZU.ZA());
    boolean bool = this.ZU.Zs();
    paramZe012.setEnabled(bool);
    paramZe013.setEnabled(bool);
    paramZe014.setEnabled(bool);
    paramZe015.setEnabled(bool);
  }
  
  private void lambda$new$3(ActionEvent paramActionEvent) {
    this.Zv.ZW(this.ZU.ZO());
  }
  
  private void lambda$new$2(ActionEvent paramActionEvent) {
    this.ZU.ZV(this.ZU.ZO());
  }
  
  private void lambda$new$1(ActionEvent paramActionEvent) {
    this.ZU.Za(this.ZU.ZO() + 1);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    this.ZU.Za(Math.max(0, this.ZU.ZO()));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥í:Xka¾F-!:hZÀ9\\f{.tÕ±?©ûN3°w3{ÉK,>OË³³;«~wìp?9ÿÝ+¬RÍè§ûf0:ppøÝF1,wòî¸Ô(ÊÑ&D¸.z=SÈ\\fØVFÑPøW:)ÔFØ2pî{)«Ô×j×°ü)\\fìGN®ýd1L0û9;uÕ\´rxû  ß¢x­ÖlvÁÑ³´Û"àwû¡b·è­-ÐÆ¬³¥¦&ö ïR{ «u{ÔÛ'aZ4\\t\\tàbÁª1°~òUë½÷÷$ìhÄ"ñ\\bÊ½ahl(jM6S­Â¸þq>ì?vl2oÜ^q!·l?êODTî@]Î9×ÇÄo@R'GB©Íåk÷ÔäÒöèÓ\\f¾¸æ.Xûòs²mRçƫóiN÷ÿ_fV+ð[=Ãx\\nTÁªû¹LÆ¶ hGÂë®§Ú<PaH±{W´¡|Ï{dX¦¶ÝEOKC\\t¶\\f²¦±/4h2³>k!5Ël5Nª»òO9¸Î¤Y~ qÜ}½ºU1?¢¥c¿÷c_¡jìÚ\«G¿»!=lðy¡Çä(µaLSwk"QÑËø qèÜÐH\\båXy?DàaYpUhPÁÀQ5F]K+/=l⁰á~)M9:aþcO9t₫¿ÑÊà¯O¶Ò\ÿ(ßrm÷ð$ðÎrìX1À\\tnò´2ÒË¼£18gÉDÉhnÝ?>t£F6JÛÿ`À ¬EN{óð ¼Ôe?/¡odé6ÖØÐßª¨\\fYÀ4R?0¸-Íù*ì9u\\rd3Ñ×!©KKK,°ÃÒªIÅ|%«²Ù^¨dÆº4©⃀Usû]CvòJ¹o=¥Ìé⃖!<=¬Ü¬øH91Ö`þd"´¾Ð-h[5úpäHGÈzXö'W'Ú| uoàfz-]ZZé»ßíHWãÁïî-ù&nVÁuL½O.K2p=ôÌ6`ôí\E`Y®Û7áUÖ@ñô¿êÉò·Í\\rQkÏM}îÿ¼(Ó/#»]\\fQêPöl?Oâ²¾ÌdsfE_i)ùçÜP8±âí§_ÈÛ¾L6KÁ$(B23û®¢Jð»Sæ#ÐºRa×³Ñá¬y\\n8³ÜI\\t(ËÑ§r6¶-'óéé¦ÍÜyfý4\\tjDå\÷BUÉ\\bÏçV6'ºíÈ\\fM,¼©à¸LûûDb#KæÆþa9&ìÞÕ\\rñ>Då,ÁX8>?¹ôªTh(ýç@n&?X×\\fðCù»Uïð¸#õ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #106
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #102
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
    //   68: ldc ' ®|Éå!S!ªuÇdoW(sÎöÂIù ú+­ø @<'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #127
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
    //   129: putstatic burp/Zrvf.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrvf.b : [Ljava/lang/String;
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
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #115
    //   219: goto -> 244
    //   222: bipush #68
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #47
    //   239: goto -> 244
    //   242: bipush #22
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
    int i = (paramInt1 ^ 0xFFFFA961) & 0xFFFF;
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
      byte b1 = 13;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */