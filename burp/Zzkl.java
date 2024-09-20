package burp;

import java.awt.event.ActionEvent;
import java.util.function.Supplier;
import javax.swing.JSeparator;

public class Zzkl extends Zzkj implements Zedo {
  private final Zkr6 Zc;
  
  private final Zz8 ZI;
  
  private final Zbsk Zg;
  
  private final Ze7h ZV;
  
  private final Ze7h ZR;
  
  private final Ze7h Zz;
  
  private final Ze7h ZE;
  
  private final Ze7h Zn;
  
  private final Zztv Ze;
  
  private final Zztv ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzkl(Zkr6 paramZkr6, Zxgc paramZxgc, Supplier<Zl4w> paramSupplier, Zz8 paramZz8, Zbsk paramZbsk, Zbb2 paramZbb2, Zbbh paramZbbh) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zc : Lburp/Zkr6;
    //   9: invokestatic Zp : ()I
    //   12: aload_0
    //   13: aload #4
    //   15: putfield ZI : Lburp/Zz8;
    //   18: aload_0
    //   19: aload #5
    //   21: putfield Zg : Lburp/Zbsk;
    //   24: aload_0
    //   25: new burp/Zztv
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: putfield Za : Lburp/Zztv;
    //   35: aload_0
    //   36: getfield Za : Lburp/Zztv;
    //   39: sipush #-27472
    //   42: sipush #14582
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: invokevirtual setText : (Ljava/lang/String;)V
    //   51: aload_0
    //   52: getfield Za : Lburp/Zztv;
    //   55: sipush #-27475
    //   58: sipush #-25943
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual setName : (Ljava/lang/String;)V
    //   67: new burp/Zv9
    //   70: dup
    //   71: aload_0
    //   72: invokespecial <init> : (Lburp/Zzkl;)V
    //   75: astore #9
    //   77: new burp/Zepe
    //   80: dup
    //   81: sipush #-27467
    //   84: sipush #-28923
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: astore #10
    //   95: aload #10
    //   97: new burp/Zg9u
    //   100: dup
    //   101: aload_0
    //   102: aload_1
    //   103: <illegal opcode> actionPerformed : (Lburp/Zkr6;)Ljava/awt/event/ActionListener;
    //   108: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   111: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   114: aload_0
    //   115: getfield Za : Lburp/Zztv;
    //   118: aload #10
    //   120: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   123: pop
    //   124: new burp/Zepe
    //   127: dup
    //   128: sipush #-27476
    //   131: sipush #-28209
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: astore #11
    //   142: aload #11
    //   144: new burp/Zg9u
    //   147: dup
    //   148: aload_0
    //   149: aload_1
    //   150: <illegal opcode> actionPerformed : (Lburp/Zkr6;)Ljava/awt/event/ActionListener;
    //   155: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   158: invokestatic ZW : (Lburp/Zepe;Ljava/awt/event/ActionListener;)V
    //   161: aload_0
    //   162: getfield Za : Lburp/Zztv;
    //   165: aload #11
    //   167: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   170: pop
    //   171: aload_0
    //   172: invokevirtual ZF : ()V
    //   175: new burp/Zepe
    //   178: dup
    //   179: sipush #-27478
    //   182: sipush #-5996
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: invokespecial <init> : (Ljava/lang/String;)V
    //   191: astore #12
    //   193: aload #12
    //   195: new burp/Zg9u
    //   198: dup
    //   199: aload_0
    //   200: aload_1
    //   201: <illegal opcode> actionPerformed : (Lburp/Zkr6;)Ljava/awt/event/ActionListener;
    //   206: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   209: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   212: aload_0
    //   213: getfield Za : Lburp/Zztv;
    //   216: aload #12
    //   218: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   221: pop
    //   222: aload_0
    //   223: getfield Za : Lburp/Zztv;
    //   226: new javax/swing/JSeparator
    //   229: dup
    //   230: invokespecial <init> : ()V
    //   233: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   236: pop
    //   237: new burp/Zztv
    //   240: dup
    //   241: sipush #-27474
    //   244: sipush #-1194
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: invokespecial <init> : (Ljava/lang/String;)V
    //   253: astore #13
    //   255: aload_0
    //   256: getfield Za : Lburp/Zztv;
    //   259: aload #13
    //   261: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   264: pop
    //   265: new burp/Zepe
    //   268: dup
    //   269: sipush #-27487
    //   272: sipush #27630
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: invokespecial <init> : (Ljava/lang/String;)V
    //   281: astore #14
    //   283: aload #14
    //   285: new burp/Zg9u
    //   288: dup
    //   289: aload_0
    //   290: aload_1
    //   291: aload_2
    //   292: <illegal opcode> actionPerformed : (Lburp/Zkr6;Lburp/Zxgc;)Ljava/awt/event/ActionListener;
    //   297: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   300: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   303: aload #14
    //   305: iconst_1
    //   306: invokevirtual setEnabled : (Z)V
    //   309: aload #13
    //   311: aload #14
    //   313: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   316: pop
    //   317: new burp/Zepe
    //   320: dup
    //   321: sipush #-27471
    //   324: sipush #-12860
    //   327: invokestatic a : (II)Ljava/lang/String;
    //   330: invokespecial <init> : (Ljava/lang/String;)V
    //   333: astore #15
    //   335: aload #15
    //   337: new burp/Zg9u
    //   340: dup
    //   341: aload_0
    //   342: aload_1
    //   343: aload_2
    //   344: <illegal opcode> actionPerformed : (Lburp/Zkr6;Lburp/Zxgc;)Ljava/awt/event/ActionListener;
    //   349: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   352: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   355: aload #15
    //   357: iconst_1
    //   358: invokevirtual setEnabled : (Z)V
    //   361: aload #13
    //   363: aload #15
    //   365: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   368: pop
    //   369: new burp/Zztv
    //   372: dup
    //   373: sipush #-27477
    //   376: sipush #21701
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: invokespecial <init> : (Ljava/lang/String;)V
    //   385: astore #16
    //   387: aload_0
    //   388: getfield Za : Lburp/Zztv;
    //   391: aload #16
    //   393: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   396: pop
    //   397: new burp/Zepe
    //   400: dup
    //   401: sipush #-27469
    //   404: sipush #-14762
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: invokespecial <init> : (Ljava/lang/String;)V
    //   413: astore #17
    //   415: aload #17
    //   417: new burp/Zg9u
    //   420: dup
    //   421: aload_0
    //   422: aload_1
    //   423: <illegal opcode> actionPerformed : (Lburp/Zkr6;)Ljava/awt/event/ActionListener;
    //   428: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   431: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   434: aload #17
    //   436: iconst_1
    //   437: invokevirtual setEnabled : (Z)V
    //   440: aload #16
    //   442: aload #17
    //   444: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   447: pop
    //   448: new burp/Zepe
    //   451: dup
    //   452: sipush #-27483
    //   455: sipush #10767
    //   458: invokestatic a : (II)Ljava/lang/String;
    //   461: invokespecial <init> : (Ljava/lang/String;)V
    //   464: astore #18
    //   466: aload #18
    //   468: new burp/Zg9u
    //   471: dup
    //   472: aload_0
    //   473: aload_1
    //   474: <illegal opcode> actionPerformed : (Lburp/Zkr6;)Ljava/awt/event/ActionListener;
    //   479: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   482: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   485: aload #18
    //   487: iconst_1
    //   488: invokevirtual setEnabled : (Z)V
    //   491: aload #16
    //   493: aload #18
    //   495: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   498: pop
    //   499: new burp/Zztv
    //   502: dup
    //   503: sipush #-27485
    //   506: sipush #-8682
    //   509: invokestatic a : (II)Ljava/lang/String;
    //   512: invokespecial <init> : (Ljava/lang/String;)V
    //   515: astore #19
    //   517: aload_0
    //   518: getfield Za : Lburp/Zztv;
    //   521: aload #19
    //   523: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   526: pop
    //   527: aload_0
    //   528: new burp/Zztv
    //   531: dup
    //   532: sipush #-27469
    //   535: sipush #-14762
    //   538: invokestatic a : (II)Ljava/lang/String;
    //   541: invokespecial <init> : (Ljava/lang/String;)V
    //   544: putfield Ze : Lburp/Zztv;
    //   547: aload_0
    //   548: getfield Ze : Lburp/Zztv;
    //   551: aload #9
    //   553: invokevirtual addMenuListener : (Ljavax/swing/event/MenuListener;)V
    //   556: aload #19
    //   558: aload_0
    //   559: getfield Ze : Lburp/Zztv;
    //   562: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   565: pop
    //   566: aload_0
    //   567: new burp/Zztv
    //   570: dup
    //   571: sipush #-27483
    //   574: sipush #10767
    //   577: invokestatic a : (II)Ljava/lang/String;
    //   580: invokespecial <init> : (Ljava/lang/String;)V
    //   583: putfield ZY : Lburp/Zztv;
    //   586: aload_0
    //   587: getfield ZY : Lburp/Zztv;
    //   590: aload #9
    //   592: invokevirtual addMenuListener : (Ljavax/swing/event/MenuListener;)V
    //   595: aload #19
    //   597: aload_0
    //   598: getfield ZY : Lburp/Zztv;
    //   601: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   604: pop
    //   605: aload_0
    //   606: getfield Za : Lburp/Zztv;
    //   609: new javax/swing/JSeparator
    //   612: dup
    //   613: invokespecial <init> : ()V
    //   616: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   619: pop
    //   620: new burp/Zztv
    //   623: dup
    //   624: sipush #-27465
    //   627: sipush #27924
    //   630: invokestatic a : (II)Ljava/lang/String;
    //   633: invokespecial <init> : (Ljava/lang/String;)V
    //   636: astore #20
    //   638: aload_0
    //   639: getfield Za : Lburp/Zztv;
    //   642: aload #20
    //   644: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   647: pop
    //   648: new javax/swing/ButtonGroup
    //   651: dup
    //   652: invokespecial <init> : ()V
    //   655: astore #21
    //   657: aload_0
    //   658: new burp/Ze7h
    //   661: dup
    //   662: sipush #-27466
    //   665: sipush #-3207
    //   668: invokestatic a : (II)Ljava/lang/String;
    //   671: invokespecial <init> : (Ljava/lang/String;)V
    //   674: putfield ZV : Lburp/Ze7h;
    //   677: aload_0
    //   678: getfield ZV : Lburp/Ze7h;
    //   681: new burp/Zg9u
    //   684: dup
    //   685: aload_0
    //   686: aload #5
    //   688: <illegal opcode> actionPerformed : (Lburp/Zbsk;)Ljava/awt/event/ActionListener;
    //   693: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   696: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   699: aload #21
    //   701: aload_0
    //   702: getfield ZV : Lburp/Ze7h;
    //   705: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   708: aload #20
    //   710: aload_0
    //   711: getfield ZV : Lburp/Ze7h;
    //   714: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   717: pop
    //   718: aload_0
    //   719: new burp/Ze7h
    //   722: dup
    //   723: sipush #-27468
    //   726: sipush #4234
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: invokespecial <init> : (Ljava/lang/String;)V
    //   735: putfield ZR : Lburp/Ze7h;
    //   738: aload_0
    //   739: getfield ZR : Lburp/Ze7h;
    //   742: new burp/Zg9u
    //   745: dup
    //   746: aload_0
    //   747: aload #5
    //   749: <illegal opcode> actionPerformed : (Lburp/Zbsk;)Ljava/awt/event/ActionListener;
    //   754: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   757: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   760: aload #21
    //   762: aload_0
    //   763: getfield ZR : Lburp/Ze7h;
    //   766: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   769: aload #20
    //   771: aload_0
    //   772: getfield ZR : Lburp/Ze7h;
    //   775: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   778: pop
    //   779: aload_0
    //   780: new burp/Ze7h
    //   783: dup
    //   784: sipush #-27484
    //   787: sipush #-32306
    //   790: invokestatic a : (II)Ljava/lang/String;
    //   793: invokespecial <init> : (Ljava/lang/String;)V
    //   796: putfield Zz : Lburp/Ze7h;
    //   799: aload_0
    //   800: getfield Zz : Lburp/Ze7h;
    //   803: new burp/Zg9u
    //   806: dup
    //   807: aload_0
    //   808: aload #5
    //   810: <illegal opcode> actionPerformed : (Lburp/Zbsk;)Ljava/awt/event/ActionListener;
    //   815: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   818: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   821: aload #21
    //   823: aload_0
    //   824: getfield Zz : Lburp/Ze7h;
    //   827: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   830: aload #20
    //   832: aload_0
    //   833: getfield Zz : Lburp/Ze7h;
    //   836: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   839: pop
    //   840: new burp/Zztv
    //   843: dup
    //   844: sipush #-27479
    //   847: sipush #-1482
    //   850: invokestatic a : (II)Ljava/lang/String;
    //   853: invokespecial <init> : (Ljava/lang/String;)V
    //   856: astore #22
    //   858: aload_0
    //   859: getfield Za : Lburp/Zztv;
    //   862: aload #22
    //   864: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   867: pop
    //   868: new javax/swing/ButtonGroup
    //   871: dup
    //   872: invokespecial <init> : ()V
    //   875: astore #23
    //   877: aload_0
    //   878: new burp/Ze7h
    //   881: dup
    //   882: sipush #-27470
    //   885: sipush #23293
    //   888: invokestatic a : (II)Ljava/lang/String;
    //   891: invokespecial <init> : (Ljava/lang/String;)V
    //   894: putfield ZE : Lburp/Ze7h;
    //   897: aload_0
    //   898: getfield ZE : Lburp/Ze7h;
    //   901: new burp/Zg9u
    //   904: dup
    //   905: aload_0
    //   906: aload #4
    //   908: <illegal opcode> actionPerformed : (Lburp/Zz8;)Ljava/awt/event/ActionListener;
    //   913: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   916: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   919: istore #8
    //   921: aload #23
    //   923: aload_0
    //   924: getfield ZE : Lburp/Ze7h;
    //   927: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   930: aload #22
    //   932: aload_0
    //   933: getfield ZE : Lburp/Ze7h;
    //   936: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   939: pop
    //   940: aload_0
    //   941: new burp/Ze7h
    //   944: dup
    //   945: sipush #-27486
    //   948: sipush #-14692
    //   951: invokestatic a : (II)Ljava/lang/String;
    //   954: invokespecial <init> : (Ljava/lang/String;)V
    //   957: putfield Zn : Lburp/Ze7h;
    //   960: aload_0
    //   961: getfield Zn : Lburp/Ze7h;
    //   964: new burp/Zg9u
    //   967: dup
    //   968: aload_0
    //   969: aload #4
    //   971: <illegal opcode> actionPerformed : (Lburp/Zz8;)Ljava/awt/event/ActionListener;
    //   976: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   979: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   982: aload #23
    //   984: aload_0
    //   985: getfield Zn : Lburp/Ze7h;
    //   988: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   991: aload #22
    //   993: aload_0
    //   994: getfield Zn : Lburp/Ze7h;
    //   997: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1000: pop
    //   1001: aload_0
    //   1002: getfield Za : Lburp/Zztv;
    //   1005: new javax/swing/JSeparator
    //   1008: dup
    //   1009: invokespecial <init> : ()V
    //   1012: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1015: pop
    //   1016: new burp/Zepe
    //   1019: dup
    //   1020: sipush #-27488
    //   1023: sipush #27689
    //   1026: invokestatic a : (II)Ljava/lang/String;
    //   1029: invokespecial <init> : (Ljava/lang/String;)V
    //   1032: astore #24
    //   1034: aload #24
    //   1036: new burp/Zg9u
    //   1039: dup
    //   1040: aload_0
    //   1041: aload_3
    //   1042: aload #7
    //   1044: <illegal opcode> actionPerformed : (Ljava/util/function/Supplier;Lburp/Zbbh;)Ljava/awt/event/ActionListener;
    //   1049: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   1052: invokestatic ZW : (Lburp/Zepe;Ljava/awt/event/ActionListener;)V
    //   1055: aload_0
    //   1056: getfield Za : Lburp/Zztv;
    //   1059: aload #24
    //   1061: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1064: pop
    //   1065: aload_0
    //   1066: getfield Za : Lburp/Zztv;
    //   1069: new javax/swing/JSeparator
    //   1072: dup
    //   1073: invokespecial <init> : ()V
    //   1076: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1079: pop
    //   1080: new burp/Zepe
    //   1083: dup
    //   1084: sipush #-27480
    //   1087: sipush #-6159
    //   1090: invokestatic a : (II)Ljava/lang/String;
    //   1093: invokespecial <init> : (Ljava/lang/String;)V
    //   1096: astore #25
    //   1098: aload #25
    //   1100: new burp/Zg9u
    //   1103: dup
    //   1104: aload_0
    //   1105: aload_3
    //   1106: aload #6
    //   1108: <illegal opcode> actionPerformed : (Ljava/util/function/Supplier;Lburp/Zbb2;)Ljava/awt/event/ActionListener;
    //   1113: invokespecial <init> : (Lburp/Zzkl;Ljava/awt/event/ActionListener;)V
    //   1116: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   1119: aload_0
    //   1120: getfield Za : Lburp/Zztv;
    //   1123: aload #25
    //   1125: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1128: pop
    //   1129: iload #8
    //   1131: ifne -> 1141
    //   1134: iconst_4
    //   1135: anewarray burp/Zbqc
    //   1138: invokestatic Zr : ([Lburp/Zbqc;)V
    //   1141: return
  }
  
  private void ZF() {
    Zepe zepe1 = new Zepe(a(-27482, -9290));
    zepe1.addActionListener(new Zg9u(this, this::lambda$addScanMenuItems$16));
    this.Za.add(zepe1);
    Zepe zepe2 = new Zepe(a(-27473, 5461));
    zepe2.addActionListener(new Zg9u(this, this::lambda$addScanMenuItems$17));
    this.Za.add(zepe2);
    Zepe zepe3 = new Zepe(a(-27481, 3207));
    zepe3.addActionListener(new Zg9u(this, this::lambda$addScanMenuItems$18));
    this.Za.add(zepe3);
    this.Za.add(new JSeparator());
  }
  
  public void Zt2() {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zbsk;
    //   8: invokeinterface ZJ : ()Lburp/Zts8;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull -> 30
    //   18: aload_0
    //   19: getfield ZV : Lburp/Ze7h;
    //   22: iconst_1
    //   23: invokevirtual setSelected : (Z)V
    //   26: iload_1
    //   27: ifne -> 96
    //   30: getstatic burp/Zssz.Zo : [I
    //   33: aload_2
    //   34: invokevirtual ordinal : ()I
    //   37: iaload
    //   38: lookupswitch default -> 88, 1 -> 64, 2 -> 76
    //   64: aload_0
    //   65: getfield ZR : Lburp/Ze7h;
    //   68: iconst_1
    //   69: invokevirtual setSelected : (Z)V
    //   72: iload_1
    //   73: ifne -> 96
    //   76: aload_0
    //   77: getfield Zz : Lburp/Ze7h;
    //   80: iconst_1
    //   81: invokevirtual setSelected : (Z)V
    //   84: iload_1
    //   85: ifne -> 96
    //   88: aload_0
    //   89: getfield ZV : Lburp/Ze7h;
    //   92: iconst_1
    //   93: invokevirtual setSelected : (Z)V
    //   96: aload_0
    //   97: getfield ZI : Lburp/Zz8;
    //   100: invokeinterface ZX : ()Lburp/Zlw6;
    //   105: getstatic burp/Zlw6.APPEND : Lburp/Zlw6;
    //   108: if_acmpne -> 123
    //   111: aload_0
    //   112: getfield Zn : Lburp/Ze7h;
    //   115: iconst_1
    //   116: invokevirtual setSelected : (Z)V
    //   119: iload_1
    //   120: ifne -> 131
    //   123: aload_0
    //   124: getfield ZE : Lburp/Ze7h;
    //   127: iconst_1
    //   128: invokevirtual setSelected : (Z)V
    //   131: return
  }
  
  private void lambda$addScanMenuItems$18(ActionEvent paramActionEvent) {
    this.Zc.ZfL();
  }
  
  private void lambda$addScanMenuItems$17(ActionEvent paramActionEvent) {
    this.Zc.Zfd();
  }
  
  private void lambda$addScanMenuItems$16(ActionEvent paramActionEvent) {
    this.Zc.ZfF();
  }
  
  private static void lambda$new$15(Supplier<Zl4w> paramSupplier, Zbb2 paramZbb2, ActionEvent paramActionEvent) {
    Zl4w zl4w = paramSupplier.get();
    zl4w.Zi(Zs70.INTRUDER_PATH);
    zl4w.setVisible(true);
    paramZbb2.Zp();
  }
  
  private static void lambda$new$14(Supplier<Zl4w> paramSupplier, Zbbh paramZbbh, ActionEvent paramActionEvent) {
    Zl4w zl4w = paramSupplier.get();
    zl4w.Zi(Zs70.INTRUDER_PATH);
    zl4w.setVisible(true);
    paramZbbh.Zp();
  }
  
  private static void lambda$new$13(Zz8 paramZz8, ActionEvent paramActionEvent) {
    paramZz8.ZF(Zlw6.APPEND);
  }
  
  private static void lambda$new$12(Zz8 paramZz8, ActionEvent paramActionEvent) {
    paramZz8.ZF(Zlw6.REPLACE);
  }
  
  private static void lambda$new$11(Zbsk paramZbsk, ActionEvent paramActionEvent) {
    paramZbsk.Zv(Zts8.COPY_CONFIGURATION_FROM_LAST_TAB);
  }
  
  private static void lambda$new$10(Zbsk paramZbsk, ActionEvent paramActionEvent) {
    paramZbsk.Zv(Zts8.COPY_CONFIGURATION_FROM_FIRST_TAB);
  }
  
  private static void lambda$new$9(Zbsk paramZbsk, ActionEvent paramActionEvent) {
    paramZbsk.Zv(Zts8.USE_DEFAULT_ATTACK_CONFIGURATION);
  }
  
  private static void lambda$new$8(Zkr6 paramZkr6, ActionEvent paramActionEvent) {
    Zxjf.Zi(paramZkr6::lambda$new$7);
  }
  
  private static void lambda$new$7(Zkr6 paramZkr6) {
    paramZkr6.ZG_(false);
  }
  
  private static void lambda$new$6(Zkr6 paramZkr6, ActionEvent paramActionEvent) {
    Zxjf.Zi(paramZkr6::lambda$new$5);
  }
  
  private static void lambda$new$5(Zkr6 paramZkr6) {
    paramZkr6.ZG_(true);
  }
  
  private static void lambda$new$4(Zkr6 paramZkr6, Zxgc paramZxgc, ActionEvent paramActionEvent) {
    paramZkr6.ZP(paramZkr6.Zf3(), false, paramZxgc.ZK1());
  }
  
  private static void lambda$new$3(Zkr6 paramZkr6, Zxgc paramZxgc, ActionEvent paramActionEvent) {
    paramZkr6.ZP(paramZkr6.Zf3(), true, paramZxgc.ZK1());
  }
  
  private static void lambda$new$2(Zkr6 paramZkr6, ActionEvent paramActionEvent) {
    paramZkr6.Zf1();
  }
  
  private static void lambda$new$1(Zkr6 paramZkr6, ActionEvent paramActionEvent) {
    Zlvv zlvv = paramZkr6.Zfw();
    if (zlvv != null)
      zlvv.ZY(); 
  }
  
  private static void lambda$new$0(Zkr6 paramZkr6, ActionEvent paramActionEvent) {
    paramZkr6.Zfc();
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ìÃ'¥qA»°Q|\\r®dÉqÃÊI®ÆÝÆ¬|¿0*NÐ»ÈV ö7g¡Jå,YkZ¤V Eß¡Lrà\\f|÷¥'¸<bê¸+Âû¢uÔ'oëªø:RhUö\\r6èkFð£Jr³ÏÑIîÛàïv¨|´uiÊ+ÃücäöK_\\fM]Ú"3èÁE\\n^M?¬Ij_&]Ó\\tYæt¡k©¬Q]¿Ì?©"µv(9¼®!Y"÷6ÇlÁ ¬dÙòÅýÃ%¯%Îh¨ÎýPÐYÙyB}îñ6jòy5¶N¸Ä Ä¡\¨¯^j>dý\\bé_ M+ÄtãöÃËÛ­/Nv&~'©¢oÁFîk¦÷I|þ õöðÇo¡LéÓ»\\r)lrûºÕ9CÁ<2NÁ?ðÝ}X õ¬ºD7'ÅÈéÖ\\b bä4ÓÚ¯¼6ÿïè´ó5¢%¹¸î`Kp\\n#dÎøzåKéy3!Ø0¢Aòù;»ªÝÁ4$ñdcôn÷ä 6?\\fö&§Sõ¼«CÿqHá3£)ã§H:äÌpÖßrbæJcksÙµ¨i£¡A=ýrÎJï'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc '#øbË.%ØÄø_]¼à¾1÷tMÆ³N\\r'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #64
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
    //   129: putstatic burp/Zzkl.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzkl.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #112
    //   224: goto -> 244
    //   227: bipush #105
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #113
    //   239: goto -> 244
    //   242: bipush #95
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
    int i = (paramInt1 ^ 0xFFFF94A6) & 0xFFFF;
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
      char c = 'Î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzkl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */