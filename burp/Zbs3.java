package burp;

import java.util.List;
import java.util.function.Consumer;

public class Zbs3 implements Zbof {
  private final Zbqc Zu;
  
  private final Zmyx ZU;
  
  private final Zerg Zl;
  
  private final Zbh1 Zo;
  
  private final Zxaf ZS;
  
  private final Zm9t Za;
  
  private final boolean ZG;
  
  private final List<Consumer<List<Zrdb>>> Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbs3(Zz0n paramZz0n, Ztwv paramZtwv, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zrny paramZrny, Zs0g paramZs0g, Zg0s paramZg0s, Zgso paramZgso, Zey9 paramZey9, Zzpo paramZzpo, Zerg paramZerg) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZW : ()[Ljava/lang/String;
    //   7: aload_0
    //   8: aload #12
    //   10: putfield Zl : Lburp/Zerg;
    //   13: astore #13
    //   15: aload_0
    //   16: aload #11
    //   18: invokevirtual ZJ : ()Z
    //   21: ifne -> 28
    //   24: iconst_1
    //   25: goto -> 29
    //   28: iconst_0
    //   29: putfield ZG : Z
    //   32: aload_0
    //   33: new java/util/ArrayList
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: putfield Zr : Ljava/util/List;
    //   43: new burp/Ztos
    //   46: dup
    //   47: invokestatic Ze : ()Lburp/Zt1_;
    //   50: invokespecial <init> : (Lburp/Zt3y;)V
    //   53: astore #14
    //   55: aload_0
    //   56: new burp/Zbh1
    //   59: dup
    //   60: aload_2
    //   61: aload #7
    //   63: aload #9
    //   65: aload #8
    //   67: aload #14
    //   69: aload #11
    //   71: aload #6
    //   73: invokespecial <init> : (Lburp/Ztwv;Lburp/Zs0g;Lburp/Zgso;Lburp/Zg0s;Lburp/Ztos;Lburp/Zzpo;Lburp/Zrny;)V
    //   76: putfield Zo : Lburp/Zbh1;
    //   79: aload_0
    //   80: new burp/Zbqc
    //   83: dup
    //   84: new java/awt/BorderLayout
    //   87: dup
    //   88: invokespecial <init> : ()V
    //   91: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   94: putfield Zu : Lburp/Zbqc;
    //   97: aload_0
    //   98: getfield Zu : Lburp/Zbqc;
    //   101: iconst_0
    //   102: invokevirtual setOpaque : (Z)V
    //   105: new burp/Zbqc
    //   108: dup
    //   109: new java/awt/BorderLayout
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   119: astore #15
    //   121: aload #15
    //   123: iconst_0
    //   124: invokevirtual setOpaque : (Z)V
    //   127: new burp/Zbqc
    //   130: dup
    //   131: new java/awt/BorderLayout
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   141: astore #16
    //   143: aload #16
    //   145: iconst_0
    //   146: invokevirtual setOpaque : (Z)V
    //   149: aload #11
    //   151: invokevirtual ZY : ()Z
    //   154: ifeq -> 525
    //   157: new burp/Zbqc
    //   160: dup
    //   161: new java/awt/BorderLayout
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   171: astore #17
    //   173: aload #17
    //   175: iconst_0
    //   176: invokevirtual setOpaque : (Z)V
    //   179: new burp/Zbqc
    //   182: dup
    //   183: new java/awt/BorderLayout
    //   186: dup
    //   187: invokespecial <init> : ()V
    //   190: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   193: astore #18
    //   195: aload #18
    //   197: iconst_0
    //   198: invokevirtual setOpaque : (Z)V
    //   201: new burp/Zm99
    //   204: dup
    //   205: aload #11
    //   207: invokevirtual Zp : ()Ljava/lang/String;
    //   210: aload #11
    //   212: invokevirtual ZR : ()Lburp/Ze9n;
    //   215: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   218: astore #19
    //   220: aload #19
    //   222: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   225: invokevirtual ZE : (Lburp/Zt00;)V
    //   228: aload #19
    //   230: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   233: invokevirtual Ze : (Lburp/Zlkk;)V
    //   236: aload #19
    //   238: bipush #10
    //   240: invokevirtual setIconTextGap : (I)V
    //   243: aload #18
    //   245: aload #19
    //   247: sipush #15237
    //   250: sipush #-31683
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   259: aload #11
    //   261: invokevirtual Zs : ()Ljava/lang/String;
    //   264: ifnull -> 329
    //   267: new burp/Zbqc
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: astore #20
    //   276: aload #20
    //   278: iconst_0
    //   279: invokevirtual setOpaque : (Z)V
    //   282: new burp/Zm99
    //   285: dup
    //   286: aload #11
    //   288: invokevirtual Zs : ()Ljava/lang/String;
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: astore #21
    //   296: aload #21
    //   298: new javax/swing/border/EmptyBorder
    //   301: dup
    //   302: iconst_3
    //   303: bipush #20
    //   305: iconst_0
    //   306: iconst_0
    //   307: invokespecial <init> : (IIII)V
    //   310: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   313: aload #18
    //   315: aload #21
    //   317: sipush #15247
    //   320: sipush #17266
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   329: aload #17
    //   331: aload #18
    //   333: sipush #15240
    //   336: sipush #12178
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   345: aload #17
    //   347: bipush #10
    //   349: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   352: sipush #15242
    //   355: sipush #-25196
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   364: new burp/Zm2o
    //   367: dup
    //   368: invokespecial <init> : ()V
    //   371: astore #20
    //   373: aload #20
    //   375: getstatic burp/Zk97.DESKTOP_DASHBOARD_ISSUE_ACTIVITY : Lburp/Zk97;
    //   378: invokevirtual Zi : (Lburp/Zk97;)V
    //   381: aload #20
    //   383: iconst_0
    //   384: invokevirtual setOpaque : (Z)V
    //   387: aload_0
    //   388: new burp/Zm9t
    //   391: dup
    //   392: invokespecial <init> : ()V
    //   395: putfield Za : Lburp/Zm9t;
    //   398: aload_0
    //   399: getfield Za : Lburp/Zm9t;
    //   402: iconst_0
    //   403: invokevirtual setOpaque : (Z)V
    //   406: new burp/Zbqc
    //   409: dup
    //   410: new java/awt/BorderLayout
    //   413: dup
    //   414: invokespecial <init> : ()V
    //   417: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   420: astore #21
    //   422: aload #21
    //   424: iconst_0
    //   425: invokevirtual setOpaque : (Z)V
    //   428: aload #21
    //   430: aload #20
    //   432: sipush #15240
    //   435: sipush #12178
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   444: aload #21
    //   446: bipush #10
    //   448: invokestatic createHorizontalStrut : (I)Ljava/awt/Component;
    //   451: sipush #15236
    //   454: sipush #-1882
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   463: aload #21
    //   465: aload_0
    //   466: getfield Za : Lburp/Zm9t;
    //   469: sipush #15243
    //   472: sipush #7003
    //   475: invokestatic a : (II)Ljava/lang/String;
    //   478: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   481: aload #17
    //   483: aload #21
    //   485: sipush #15243
    //   488: sipush #7003
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   497: aload #16
    //   499: aload #17
    //   501: sipush #15239
    //   504: sipush #27015
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   513: aload #13
    //   515: ifnull -> 530
    //   518: iconst_2
    //   519: anewarray burp/Zbqc
    //   522: invokestatic Zr : ([Lburp/Zbqc;)V
    //   525: aload_0
    //   526: aconst_null
    //   527: putfield Za : Lburp/Zm9t;
    //   530: aload #11
    //   532: invokevirtual Zl : ()Z
    //   535: ifeq -> 557
    //   538: new burp/Zm5f
    //   541: dup
    //   542: aload_0
    //   543: getfield Zo : Lburp/Zbh1;
    //   546: aload #11
    //   548: invokevirtual Za : ()I
    //   551: invokespecial <init> : (Lburp/Zbof;I)V
    //   554: goto -> 573
    //   557: new burp/Zm5f
    //   560: dup
    //   561: aload_0
    //   562: getfield Zo : Lburp/Zbh1;
    //   565: aload #11
    //   567: invokevirtual ZW : ()Lburp/Zz28;
    //   570: invokespecial <init> : (Lburp/Zbof;Lburp/Zz28;)V
    //   573: astore #17
    //   575: aload_0
    //   576: aload #11
    //   578: invokevirtual ZJ : ()Z
    //   581: ifeq -> 596
    //   584: new burp/Zstm
    //   587: dup
    //   588: aload #17
    //   590: invokespecial <init> : (Lburp/Zzbt;)V
    //   593: goto -> 598
    //   596: aload #17
    //   598: invokevirtual ZT : (Lburp/Zzbt;)V
    //   601: new burp/Zbqc
    //   604: dup
    //   605: invokespecial <init> : ()V
    //   608: astore #18
    //   610: aload #18
    //   612: new java/awt/BorderLayout
    //   615: dup
    //   616: invokespecial <init> : ()V
    //   619: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   622: aload #18
    //   624: iconst_0
    //   625: invokevirtual setOpaque : (Z)V
    //   628: new burp/Zbkd
    //   631: dup
    //   632: invokespecial <init> : ()V
    //   635: astore #19
    //   637: new java/util/ArrayList
    //   640: dup
    //   641: aload #11
    //   643: invokevirtual Zl : ()Z
    //   646: ifeq -> 653
    //   649: iconst_3
    //   650: goto -> 654
    //   653: iconst_4
    //   654: invokespecial <init> : (I)V
    //   657: astore #20
    //   659: aload #20
    //   661: iconst_4
    //   662: anewarray burp/Zs0l
    //   665: dup
    //   666: iconst_0
    //   667: getstatic burp/Zs0l.HIGH : Lburp/Zs0l;
    //   670: aastore
    //   671: dup
    //   672: iconst_1
    //   673: getstatic burp/Zs0l.MEDIUM : Lburp/Zs0l;
    //   676: aastore
    //   677: dup
    //   678: iconst_2
    //   679: getstatic burp/Zs0l.LOW : Lburp/Zs0l;
    //   682: aastore
    //   683: dup
    //   684: iconst_3
    //   685: getstatic burp/Zs0l.INFO : Lburp/Zs0l;
    //   688: aastore
    //   689: invokestatic ZU : ([Lburp/Zrn3;)Lburp/Zx08;
    //   692: invokeinterface add : (Ljava/lang/Object;)Z
    //   697: pop
    //   698: aload #20
    //   700: iconst_3
    //   701: anewarray burp/Zs0l
    //   704: dup
    //   705: iconst_0
    //   706: getstatic burp/Zs0l.CERTAIN : Lburp/Zs0l;
    //   709: aastore
    //   710: dup
    //   711: iconst_1
    //   712: getstatic burp/Zs0l.FIRM : Lburp/Zs0l;
    //   715: aastore
    //   716: dup
    //   717: iconst_2
    //   718: getstatic burp/Zs0l.TENTATIVE : Lburp/Zs0l;
    //   721: aastore
    //   722: invokestatic ZU : ([Lburp/Zrn3;)Lburp/Zx08;
    //   725: invokeinterface add : (Ljava/lang/Object;)Z
    //   730: pop
    //   731: aload #11
    //   733: invokevirtual Zl : ()Z
    //   736: ifne -> 760
    //   739: aload #20
    //   741: iconst_1
    //   742: anewarray burp/Zs0l
    //   745: dup
    //   746: iconst_0
    //   747: getstatic burp/Zs0l.IN_SCOPE : Lburp/Zs0l;
    //   750: aastore
    //   751: invokestatic ZU : ([Lburp/Zrn3;)Lburp/Zx08;
    //   754: invokeinterface add : (Ljava/lang/Object;)Z
    //   759: pop
    //   760: aload #20
    //   762: iconst_3
    //   763: anewarray burp/Zs0l
    //   766: dup
    //   767: iconst_0
    //   768: getstatic burp/Zs0l.BCHECK_GENERATED : Lburp/Zs0l;
    //   771: aastore
    //   772: dup
    //   773: iconst_1
    //   774: getstatic burp/Zs0l.SCAN_CHECK_GENERATED : Lburp/Zs0l;
    //   777: aastore
    //   778: dup
    //   779: iconst_2
    //   780: getstatic burp/Zs0l.EXTENSION_GENERATED : Lburp/Zs0l;
    //   783: aastore
    //   784: invokestatic ZU : ([Lburp/Zrn3;)Lburp/Zx08;
    //   787: invokeinterface add : (Ljava/lang/Object;)Z
    //   792: pop
    //   793: aload #19
    //   795: aload #17
    //   797: aload #20
    //   799: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   804: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   809: checkcast [Lburp/Zx08;
    //   812: invokevirtual ZX : (Lburp/Zkt2;[Lburp/Zx08;)V
    //   815: aload #19
    //   817: iconst_0
    //   818: invokevirtual setOpaque : (Z)V
    //   821: aload #19
    //   823: new burp/Zm2j
    //   826: dup
    //   827: aload_0
    //   828: invokevirtual Zh : ()Lburp/Zbws;
    //   831: invokespecial <init> : (Lburp/Zbws;)V
    //   834: invokevirtual Zh : (Lburp/Zm9t;)V
    //   837: aload #18
    //   839: aload #19
    //   841: sipush #15246
    //   844: sipush #-1351
    //   847: invokestatic a : (II)Ljava/lang/String;
    //   850: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   853: aload_0
    //   854: new burp/Zxaf
    //   857: dup
    //   858: aload_1
    //   859: aload #12
    //   861: aload_2
    //   862: aload_3
    //   863: aload #4
    //   865: aload #5
    //   867: aload #10
    //   869: iconst_1
    //   870: invokespecial <init> : (Lburp/Zz0n;Lburp/Zerg;Lburp/Ztwv;Lburp/Zgb6;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zey9;Z)V
    //   873: putfield ZS : Lburp/Zxaf;
    //   876: aload_0
    //   877: new burp/Zmyx
    //   880: dup
    //   881: aload #11
    //   883: invokevirtual ZT : ()I
    //   886: invokespecial <init> : (I)V
    //   889: putfield ZU : Lburp/Zmyx;
    //   892: aload_0
    //   893: getfield ZU : Lburp/Zmyx;
    //   896: aload_0
    //   897: getfield Zo : Lburp/Zbh1;
    //   900: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   903: aload_0
    //   904: getfield ZU : Lburp/Zmyx;
    //   907: aload_0
    //   908: getfield ZS : Lburp/Zxaf;
    //   911: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   914: aload_0
    //   915: getfield ZS : Lburp/Zxaf;
    //   918: iconst_0
    //   919: invokevirtual setVisible : (Z)V
    //   922: aload #11
    //   924: invokevirtual Zh : ()Z
    //   927: ifeq -> 951
    //   930: aload #18
    //   932: aload_0
    //   933: getfield ZU : Lburp/Zmyx;
    //   936: invokevirtual Zh : ()Lburp/Zbcw;
    //   939: sipush #15243
    //   942: sipush #7003
    //   945: invokestatic a : (II)Ljava/lang/String;
    //   948: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   951: aload #16
    //   953: aload #18
    //   955: sipush #15241
    //   958: sipush #2888
    //   961: invokestatic a : (II)Ljava/lang/String;
    //   964: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   967: aload #15
    //   969: aload #16
    //   971: sipush #15246
    //   974: sipush #-1351
    //   977: invokestatic a : (II)Ljava/lang/String;
    //   980: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   983: aload #15
    //   985: bipush #15
    //   987: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   990: sipush #15241
    //   993: sipush #2888
    //   996: invokestatic a : (II)Ljava/lang/String;
    //   999: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1002: aload_0
    //   1003: getfield Zu : Lburp/Zbqc;
    //   1006: aload #15
    //   1008: sipush #15244
    //   1011: sipush #-24449
    //   1014: invokestatic a : (II)Ljava/lang/String;
    //   1017: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1020: aload #14
    //   1022: getstatic burp/Zt1_.ZB : Lburp/Zlnb;
    //   1025: aload_0
    //   1026: <illegal opcode> accept : (Lburp/Zbs3;)Ljava/util/function/Consumer;
    //   1031: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   1034: pop
    //   1035: aload_0
    //   1036: getfield Zu : Lburp/Zbqc;
    //   1039: aload_0
    //   1040: getfield ZU : Lburp/Zmyx;
    //   1043: sipush #15246
    //   1046: sipush #-1351
    //   1049: invokestatic a : (II)Ljava/lang/String;
    //   1052: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   1055: return
  }
  
  private void Zr(Zrdb paramZrdb) {
    String[] arrayOfString = Zg0s.ZW();
    if (paramZrdb != null) {
      this.ZU.ZG();
      this.ZS.ZQ(paramZrdb);
      if (arrayOfString != null) {
        this.ZU.Zf();
        return;
      } 
      return;
    } 
    this.ZU.Zf();
  }
  
  public Zbqc ZR() {
    return this.Zu;
  }
  
  public void ZT(Zzbt paramZzbt) {
    this.Zo.Zu(paramZzbt);
  }
  
  public void Zh(List<Zrdb> paramList) {
    this.Zo.Zh(paramList);
  }
  
  public void ZV(List<Zrdb> paramList) {
    this.Zo.ZV(paramList);
    this.Zr.forEach(paramList::lambda$issuesRemoved$3);
  }
  
  public void ZP(Zrdb paramZrdb, Zb9y paramZb9y, int paramInt) {
    if (paramZb9y == Zb9y.ISSUE_UPDATED_WITH_OUT_BAND_DATA || paramZb9y == Zb9y.ISSUE_UPDATED_WITH_IN_BAND_DATA || paramZb9y == Zb9y.ISSUE_UPDATED_WITH_INFILTRATOR_DATA)
      this.Zl.Zk().ZD(-1, false, true, true); 
    this.Zo.ZP(paramZrdb, paramZb9y, paramInt);
  }
  
  public void Zl(List<Zb2e> paramList, int paramInt1, int paramInt2) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zb2e zb2e : paramList) {
      if (zb2e.ZBb() == Zb9y.ISSUE_UPDATED_WITH_OUT_BAND_DATA || zb2e.ZBb() == Zb9y.ISSUE_UPDATED_WITH_IN_BAND_DATA || zb2e.ZBb() == Zb9y.ISSUE_UPDATED_WITH_INFILTRATOR_DATA) {
        this.Zl.Zk().ZD(-1, false, true, true);
        if (arrayOfString != null)
          continue; 
        break;
      } 
      continue;
      if (arrayOfString != null)
        break; 
    } 
    this.Zo.Zl(paramList, paramInt1, paramInt2);
  }
  
  public void Zq() {
    this.Zo.Zq();
  }
  
  public void ZX(Zb2e paramZb2e) {
    this.Zo.ZE(paramZb2e);
  }
  
  public Zbws Zh() {
    return this.Zo.Zg();
  }
  
  public Zzbt ZI() {
    return this.Zo.Zd();
  }
  
  public void Zl(Zb4f paramZb4f) {
    this.Zo.Zf(paramZb4f);
  }
  
  public void Zr(Consumer<List<Zrdb>> paramConsumer) {
    this.Zr.add(paramConsumer);
  }
  
  public void Zs(Runnable paramRunnable) {
    if (this.Za != null) {
      this.Za.Zv((new Ze3m(Zeuf.CLOSE, Zlkk.ACTION_NORMAL)).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Zc(Zlkk.ACTION_PRESSED).Z_(), a(15245, 18747), paramRunnable);
      this.Za.setOpaque(false);
    } 
  }
  
  public void Zi(boolean paramBoolean) {
    if (this.Za != null)
      this.Za.setVisible(!paramBoolean); 
  }
  
  public boolean ZW() {
    return this.ZG;
  }
  
  private static void lambda$issuesRemoved$3(List paramList, Consumer<List> paramConsumer) {
    paramConsumer.accept(paramList);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$1);
  }
  
  private void lambda$new$1(Zrxu paramZrxu) {
    Zr(paramZrxu.Zt_());
  }
  
  private static Zx08[] lambda$new$0(int paramInt) {
    return new Zx08[paramInt];
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'eGq¢ïÐ\\r}õ¨ë·-*tèADPY·|'EÞ¯§ï!güUQýû'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #7
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'ÄÏ9U÷ûan'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #61
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zbs3.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbs3.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #109
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #11
    //   234: goto -> 244
    //   237: bipush #100
    //   239: goto -> 244
    //   242: bipush #33
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    int i = (paramInt1 ^ 0x3B8D) & 0xFFFF;
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
      byte b1 = 23;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */