package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

class zzzzZl2yCustomizer {
  private final Ztx8 ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  zzzzZl2yCustomizer(Ztx8 paramZtx8) {
    this.ZK = paramZtx8;
  }
  
  synchronized void ZR(Component paramComponent) {
    ZS(paramComponent);
  }
  
  synchronized void ZG(List<Component> paramList) {
    ArrayList<Component> arrayList;
    synchronized (this) {
      arrayList = new ArrayList<>(paramList);
    } 
    arrayList.forEach(this::ZS);
  }
  
  private void ZS(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/zzzzZl2yCustomizer;Ljava/awt/Component;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  private void lambda$applyComponentCustomisations$0(Component paramComponent) throws Throwable {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 29
    //   8: new java/lang/NullPointerException
    //   11: dup
    //   12: sipush #15903
    //   15: sipush #-10540
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: athrow
    //   25: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   28: athrow
    //   29: aload_1
    //   30: instanceof javax/swing/JPanel
    //   33: ifeq -> 57
    //   36: aload_1
    //   37: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   40: invokevirtual ZS : ()Ljava/awt/Color;
    //   43: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   46: aload_2
    //   47: ifnull -> 934
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   56: athrow
    //   57: aload_1
    //   58: instanceof javax/swing/JLabel
    //   61: ifeq -> 87
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   70: athrow
    //   71: aload_1
    //   72: iconst_0
    //   73: invokevirtual setFocusable : (Z)V
    //   76: aload_2
    //   77: ifnull -> 934
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   86: athrow
    //   87: aload_1
    //   88: instanceof javax/swing/JTextField
    //   91: ifeq -> 138
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   100: athrow
    //   101: aload_1
    //   102: checkcast javax/swing/JTextField
    //   105: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   108: invokevirtual ZS : ()Ljava/awt/Color;
    //   111: invokevirtual setSelectionColor : (Ljava/awt/Color;)V
    //   114: aload_1
    //   115: checkcast javax/swing/JTextField
    //   118: getstatic burp/Zlkk.SELECTION_FOREGROUND : Lburp/Zlkk;
    //   121: invokevirtual ZS : ()Ljava/awt/Color;
    //   124: invokevirtual setSelectedTextColor : (Ljava/awt/Color;)V
    //   127: aload_2
    //   128: ifnull -> 934
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: aload_1
    //   139: instanceof javax/swing/JButton
    //   142: ifeq -> 168
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: aload_1
    //   153: iconst_0
    //   154: invokevirtual setFocusable : (Z)V
    //   157: aload_2
    //   158: ifnull -> 934
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: aload_1
    //   169: instanceof javax/swing/JCheckBox
    //   172: ifeq -> 205
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   181: athrow
    //   182: aload_1
    //   183: iconst_0
    //   184: invokevirtual setFocusable : (Z)V
    //   187: aload_1
    //   188: checkcast javax/swing/JCheckBox
    //   191: invokestatic Zq : (Ljavax/swing/JComponent;)V
    //   194: aload_2
    //   195: ifnull -> 934
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload_1
    //   206: instanceof javax/swing/JRadioButton
    //   209: ifeq -> 252
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   218: athrow
    //   219: aload_1
    //   220: iconst_0
    //   221: invokevirtual setFocusable : (Z)V
    //   224: aload_1
    //   225: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   228: invokevirtual ZS : ()Ljava/awt/Color;
    //   231: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   234: aload_1
    //   235: checkcast javax/swing/JRadioButton
    //   238: invokestatic Zq : (Ljavax/swing/JComponent;)V
    //   241: aload_2
    //   242: ifnull -> 934
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   251: athrow
    //   252: aload_1
    //   253: instanceof javax/swing/JComboBox
    //   256: ifeq -> 296
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   265: athrow
    //   266: aload_1
    //   267: iconst_0
    //   268: invokevirtual setFocusable : (Z)V
    //   271: aload_1
    //   272: checkcast javax/swing/JComboBox
    //   275: new burp/Zedw
    //   278: dup
    //   279: invokespecial <init> : ()V
    //   282: invokevirtual setRenderer : (Ljavax/swing/ListCellRenderer;)V
    //   285: aload_2
    //   286: ifnull -> 934
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   295: athrow
    //   296: aload_1
    //   297: instanceof javax/swing/JList
    //   300: ifeq -> 340
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload_1
    //   311: iconst_0
    //   312: invokevirtual setFocusable : (Z)V
    //   315: aload_1
    //   316: checkcast javax/swing/JList
    //   319: new burp/Zedw
    //   322: dup
    //   323: invokespecial <init> : ()V
    //   326: invokevirtual setCellRenderer : (Ljavax/swing/ListCellRenderer;)V
    //   329: aload_2
    //   330: ifnull -> 934
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   339: athrow
    //   340: aload_1
    //   341: instanceof javax/swing/JTable
    //   344: ifeq -> 422
    //   347: goto -> 354
    //   350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   353: athrow
    //   354: aload_1
    //   355: checkcast javax/swing/JTable
    //   358: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   361: invokevirtual ZS : ()Ljava/awt/Color;
    //   364: invokevirtual setSelectionBackground : (Ljava/awt/Color;)V
    //   367: aload_1
    //   368: checkcast javax/swing/JTable
    //   371: getstatic burp/Zlkk.SELECTION_FOREGROUND : Lburp/Zlkk;
    //   374: invokevirtual ZS : ()Ljava/awt/Color;
    //   377: invokevirtual setSelectionForeground : (Ljava/awt/Color;)V
    //   380: aload_1
    //   381: checkcast javax/swing/JTable
    //   384: ldc 1.125
    //   386: invokestatic Zx : ()F
    //   389: fmul
    //   390: f2i
    //   391: invokevirtual setRowHeight : (I)V
    //   394: aload_1
    //   395: checkcast javax/swing/JTable
    //   398: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   401: astore_3
    //   402: aload_3
    //   403: ifnull -> 418
    //   406: aload_3
    //   407: iconst_0
    //   408: invokevirtual setReorderingAllowed : (Z)V
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   417: athrow
    //   418: aload_2
    //   419: ifnull -> 934
    //   422: aload_1
    //   423: instanceof javax/swing/JDialog
    //   426: ifeq -> 473
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   435: athrow
    //   436: aload_1
    //   437: checkcast javax/swing/JDialog
    //   440: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   443: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   446: invokevirtual ZS : ()Ljava/awt/Color;
    //   449: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   452: aload_1
    //   453: checkcast javax/swing/JDialog
    //   456: getstatic burp/Zt2m.ZT : Ljava/util/List;
    //   459: invokevirtual setIconImages : (Ljava/util/List;)V
    //   462: aload_2
    //   463: ifnull -> 934
    //   466: goto -> 473
    //   469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   472: athrow
    //   473: aload_1
    //   474: instanceof javax/swing/JFrame
    //   477: ifeq -> 524
    //   480: goto -> 487
    //   483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   486: athrow
    //   487: aload_1
    //   488: checkcast javax/swing/JFrame
    //   491: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   494: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   497: invokevirtual ZS : ()Ljava/awt/Color;
    //   500: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   503: aload_1
    //   504: checkcast javax/swing/JFrame
    //   507: getstatic burp/Zt2m.ZT : Ljava/util/List;
    //   510: invokevirtual setIconImages : (Ljava/util/List;)V
    //   513: aload_2
    //   514: ifnull -> 934
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   523: athrow
    //   524: aload_1
    //   525: instanceof javax/swing/JScrollPane
    //   528: ifeq -> 589
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   537: athrow
    //   538: aload_1
    //   539: checkcast javax/swing/JScrollPane
    //   542: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
    //   545: bipush #25
    //   547: invokevirtual setUnitIncrement : (I)V
    //   550: aload_1
    //   551: checkcast javax/swing/JScrollPane
    //   554: invokevirtual getHorizontalScrollBar : ()Ljavax/swing/JScrollBar;
    //   557: bipush #25
    //   559: invokevirtual setUnitIncrement : (I)V
    //   562: aload_1
    //   563: checkcast javax/swing/JScrollPane
    //   566: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   569: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   572: invokevirtual ZS : ()Ljava/awt/Color;
    //   575: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   578: aload_2
    //   579: ifnull -> 934
    //   582: goto -> 589
    //   585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   588: athrow
    //   589: aload_1
    //   590: instanceof javax/swing/JTabbedPane
    //   593: ifeq -> 629
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   602: athrow
    //   603: aload_1
    //   604: iconst_0
    //   605: invokevirtual setFocusable : (Z)V
    //   608: aload_1
    //   609: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   612: invokevirtual ZS : ()Ljava/awt/Color;
    //   615: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   618: aload_2
    //   619: ifnull -> 934
    //   622: goto -> 629
    //   625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   628: athrow
    //   629: aload_1
    //   630: instanceof javax/swing/JSplitPane
    //   633: ifeq -> 662
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   642: athrow
    //   643: aload_1
    //   644: checkcast javax/swing/JSplitPane
    //   647: iconst_5
    //   648: invokevirtual setDividerSize : (I)V
    //   651: aload_2
    //   652: ifnull -> 934
    //   655: goto -> 662
    //   658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   661: athrow
    //   662: aload_1
    //   663: instanceof javax/swing/JTree
    //   666: ifeq -> 740
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   675: athrow
    //   676: aload_1
    //   677: checkcast javax/swing/JTree
    //   680: sipush #15900
    //   683: sipush #9905
    //   686: invokestatic a : (II)Ljava/lang/String;
    //   689: sipush #15902
    //   692: sipush #21788
    //   695: invokestatic a : (II)Ljava/lang/String;
    //   698: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   701: aload_1
    //   702: checkcast javax/swing/JTree
    //   705: ldc 1.125
    //   707: invokestatic Zx : ()F
    //   710: fmul
    //   711: f2i
    //   712: invokevirtual setRowHeight : (I)V
    //   715: aload_1
    //   716: checkcast javax/swing/JTree
    //   719: new burp/Zet_
    //   722: dup
    //   723: invokespecial <init> : ()V
    //   726: invokevirtual setCellRenderer : (Ljavax/swing/tree/TreeCellRenderer;)V
    //   729: aload_2
    //   730: ifnull -> 934
    //   733: goto -> 740
    //   736: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   739: athrow
    //   740: aload_1
    //   741: instanceof javax/swing/JTextArea
    //   744: ifeq -> 801
    //   747: goto -> 754
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: aload_1
    //   755: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   758: invokevirtual ZV : ()Ljava/awt/Font;
    //   761: invokevirtual setFont : (Ljava/awt/Font;)V
    //   764: aload_1
    //   765: checkcast javax/swing/JTextArea
    //   768: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   771: invokevirtual ZS : ()Ljava/awt/Color;
    //   774: invokevirtual setSelectionColor : (Ljava/awt/Color;)V
    //   777: aload_1
    //   778: checkcast javax/swing/JTextArea
    //   781: getstatic burp/Zlkk.SELECTION_FOREGROUND : Lburp/Zlkk;
    //   784: invokevirtual ZS : ()Ljava/awt/Color;
    //   787: invokevirtual setSelectedTextColor : (Ljava/awt/Color;)V
    //   790: aload_2
    //   791: ifnull -> 934
    //   794: goto -> 801
    //   797: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   800: athrow
    //   801: aload_1
    //   802: instanceof javax/swing/JTextPane
    //   805: ifeq -> 862
    //   808: goto -> 815
    //   811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   814: athrow
    //   815: aload_1
    //   816: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   819: invokevirtual ZS : ()Ljava/awt/Color;
    //   822: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   825: aload_1
    //   826: checkcast javax/swing/JTextPane
    //   829: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   832: invokevirtual ZS : ()Ljava/awt/Color;
    //   835: invokevirtual setSelectionColor : (Ljava/awt/Color;)V
    //   838: aload_1
    //   839: checkcast javax/swing/JTextPane
    //   842: getstatic burp/Zlkk.SELECTION_FOREGROUND : Lburp/Zlkk;
    //   845: invokevirtual ZS : ()Ljava/awt/Color;
    //   848: invokevirtual setSelectedTextColor : (Ljava/awt/Color;)V
    //   851: aload_2
    //   852: ifnull -> 934
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   861: athrow
    //   862: aload_1
    //   863: instanceof javax/swing/JToggleButton
    //   866: ifeq -> 892
    //   869: goto -> 876
    //   872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   875: athrow
    //   876: aload_1
    //   877: iconst_0
    //   878: invokevirtual setFocusable : (Z)V
    //   881: aload_2
    //   882: ifnull -> 934
    //   885: goto -> 892
    //   888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   891: athrow
    //   892: aload_1
    //   893: instanceof javax/swing/JProgressBar
    //   896: ifeq -> 934
    //   899: goto -> 906
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: aload_1
    //   907: iconst_0
    //   908: invokevirtual setFocusable : (Z)V
    //   911: aload_1
    //   912: sipush #15901
    //   915: sipush #16231
    //   918: invokestatic a : (II)Ljava/lang/String;
    //   921: invokestatic getColor : (Ljava/lang/Object;)Ljava/awt/Color;
    //   924: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   927: goto -> 934
    //   930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   933: athrow
    //   934: aload_1
    //   935: instanceof java/awt/Container
    //   938: ifeq -> 994
    //   941: aload_1
    //   942: checkcast java/awt/Container
    //   945: invokevirtual getComponents : ()[Ljava/awt/Component;
    //   948: astore_3
    //   949: aload_3
    //   950: arraylength
    //   951: istore #4
    //   953: iconst_0
    //   954: istore #5
    //   956: iload #5
    //   958: iload #4
    //   960: if_icmpge -> 994
    //   963: aload_3
    //   964: iload #5
    //   966: aaload
    //   967: astore #6
    //   969: aload #6
    //   971: ifnull -> 987
    //   974: aload_0
    //   975: aload #6
    //   977: invokevirtual ZS : (Ljava/awt/Component;)V
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   986: athrow
    //   987: iinc #5, 1
    //   990: aload_2
    //   991: ifnull -> 956
    //   994: return
    // Exception table:
    //   from	to	target	type
    //   4	25	25	java/lang/Throwable
    //   29	50	53	java/lang/Throwable
    //   36	64	67	java/lang/Throwable
    //   57	80	83	java/lang/Throwable
    //   71	94	97	java/lang/Throwable
    //   87	131	134	java/lang/Throwable
    //   101	145	148	java/lang/Throwable
    //   138	161	164	java/lang/Throwable
    //   152	175	178	java/lang/Throwable
    //   168	198	201	java/lang/Throwable
    //   182	212	215	java/lang/Throwable
    //   205	245	248	java/lang/Throwable
    //   219	259	262	java/lang/Throwable
    //   252	289	292	java/lang/Throwable
    //   266	303	306	java/lang/Throwable
    //   296	333	336	java/lang/Throwable
    //   310	347	350	java/lang/Throwable
    //   402	411	414	java/lang/Throwable
    //   418	429	432	java/lang/Throwable
    //   422	466	469	java/lang/Throwable
    //   436	480	483	java/lang/Throwable
    //   473	517	520	java/lang/Throwable
    //   487	531	534	java/lang/Throwable
    //   524	582	585	java/lang/Throwable
    //   538	596	599	java/lang/Throwable
    //   589	622	625	java/lang/Throwable
    //   603	636	639	java/lang/Throwable
    //   629	655	658	java/lang/Throwable
    //   643	669	672	java/lang/Throwable
    //   662	733	736	java/lang/Throwable
    //   676	747	750	java/lang/Throwable
    //   740	794	797	java/lang/Throwable
    //   754	808	811	java/lang/Throwable
    //   801	855	858	java/lang/Throwable
    //   815	869	872	java/lang/Throwable
    //   862	885	888	java/lang/Throwable
    //   876	899	902	java/lang/Throwable
    //   892	927	930	java/lang/Throwable
    //   969	980	983	java/lang/Throwable
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '\\r]¾ÐñY@^8~ð¥ü@d\\nâa\\t·®¼Äó®8[å'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #22
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #54
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
    //   67: ldc 'ê1ç%KÅ×¿×÷Tø£~®ìì¢f6'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #24
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #43
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
    //   128: putstatic burp/zzzzZl2yCustomizer.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/zzzzZl2yCustomizer.b : [Ljava/lang/String;
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
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #115
    //   229: goto -> 244
    //   232: bipush #96
    //   234: goto -> 244
    //   237: bipush #51
    //   239: goto -> 244
    //   242: bipush #18
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
    int i = (paramInt1 ^ 0x3E1D) & 0xFFFF;
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
      byte b1 = 86;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\zzzzZl2yCustomizer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */