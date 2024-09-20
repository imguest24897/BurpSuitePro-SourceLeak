package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import net.portswigger.Zdo;

class Zbe8 extends Zbb7 {
  private final Zz0n Zv;
  
  private final Zt4u Zj;
  
  private final Zbbe[] Zu = new Zbbe[8];
  
  private Zx05 Z_;
  
  private int ZF;
  
  private Zm99 ZO;
  
  private Ze01 ZJ;
  
  private Zedd Zz;
  
  private Zedd ZR;
  
  private Zl8w ZE;
  
  private Zm99 Zm;
  
  private Zbqc ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbe8(Zz0n paramZz0n, Zt4u paramZt4u, Zbyw paramZbyw, Zr_4 paramZr_4) {
    super(paramZbyw, paramZr_4);
    this.Zv = paramZz0n;
    String[] arrayOfString = Zbb7.ZS();
    this.Zj = paramZt4u;
    this.Zg = this.Z_ = paramZr_4.<Zgpi>ZH(new Zz_(paramZbyw.ZP().ZM(), paramZr_4));
    ZX();
    byte b = 0;
    while (b < 8) {
      this.Zz.addItem(Integer.toString(b + 1));
      b++;
      if (arrayOfString == null)
        break; 
    } 
    this.ZR.addItem(a(-28191, -32295));
    this.ZR.addItem(a(-28188, -24463));
    this.ZR.addItem(a(-28192, 26222));
    this.ZR.addItem(a(-28161, 3715));
    this.ZR.setEnabled(true);
    Zn(0);
  }
  
  void Zn(int paramInt) {
    this.ZF = paramInt;
    if (this.Zu[paramInt] == null) {
      this.Zu[paramInt] = new Zbbe(this.Zv, this.Zj, this, this.ZY, paramInt);
      this.Z_.Zd(paramInt, this.Zu[paramInt].Z_().ZK());
    } 
    this.Zu[paramInt].setVisible(true);
    this.ZP.add(this.Zu[paramInt], a(-28184, -14140));
  }
  
  void ZC(Zstu paramZstu) {
    this.Z_.ZP(this.ZF, paramZstu);
  }
  
  void Zk() {
    int i = 1;
    byte b = 0;
    String[] arrayOfString = Zbb7.ZS();
    while (b < 8) {
      if (this.Zu[b] != null) {
        int j = this.Zu[b].Z_().ZK().size();
        if (j > 0)
          i *= j; 
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    this.Z_.ZvH(i);
    this.Zw.Z_(i, false);
  }
  
  private void ZX() {
    this.Zm = new Zm99();
    this.ZR = new Zedd();
    this.ZJ = new Ze01();
    this.ZP = new Zbqc();
    this.Zz = new Zedd();
    this.ZO = new Zm99();
    this.ZE = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zm.setText(a(-28189, -20742));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zm, gridBagConstraints);
    this.ZR.addActionListener(new Ztw1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZR, gridBagConstraints);
    this.ZJ.setText(a(-28162, -16582));
    this.ZJ.setToolTipText(a(-28179, 12153));
    this.ZJ.addActionListener(new Zxfb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZJ, gridBagConstraints);
    this.ZP.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZP, gridBagConstraints);
    this.Zz.addActionListener(new Zgb4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zz, gridBagConstraints);
    this.ZO.setText(a(-28178, -23728));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.ZE.setText(a(-28185, 26716));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZE, gridBagConstraints);
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZR : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: ifne -> 17
    //   16: return
    //   17: iconst_0
    //   18: aload_0
    //   19: sipush #-28186
    //   22: sipush #19144
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: sipush #-28180
    //   31: sipush #-25132
    //   34: invokestatic a : (II)Ljava/lang/String;
    //   37: iconst_2
    //   38: anewarray java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: sipush #-28181
    //   46: sipush #-23737
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: sipush #-28177
    //   58: sipush #-28026
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: aastore
    //   65: iconst_1
    //   66: invokestatic Zc : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;I)I
    //   69: if_icmpeq -> 73
    //   72: return
    //   73: bipush #8
    //   75: anewarray burp/Zefg
    //   78: astore #4
    //   80: bipush #8
    //   82: anewarray java/lang/String
    //   85: astore #5
    //   87: iload_3
    //   88: iconst_1
    //   89: isub
    //   90: tableswitch default -> 697, 0 -> 116, 1 -> 234, 2 -> 630
    //   116: aload #4
    //   118: iconst_0
    //   119: aload_0
    //   120: getfield ZY : Lburp/Zr_4;
    //   123: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   126: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   129: aastore
    //   130: aload #4
    //   132: iconst_0
    //   133: aaload
    //   134: bipush #8
    //   136: aload_0
    //   137: getfield ZY : Lburp/Zr_4;
    //   140: iconst_1
    //   141: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   144: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   149: pop
    //   150: aload #5
    //   152: iconst_0
    //   153: ldc '/'
    //   155: aastore
    //   156: aload #4
    //   158: iconst_1
    //   159: aload_0
    //   160: getfield ZY : Lburp/Zr_4;
    //   163: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   166: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   169: aastore
    //   170: aload #4
    //   172: iconst_1
    //   173: aaload
    //   174: bipush #10
    //   176: aload_0
    //   177: getfield ZY : Lburp/Zr_4;
    //   180: iconst_1
    //   181: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   184: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   189: pop
    //   190: aload #5
    //   192: iconst_1
    //   193: ldc '.'
    //   195: aastore
    //   196: aload #4
    //   198: iconst_2
    //   199: aload_0
    //   200: getfield ZY : Lburp/Zr_4;
    //   203: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   206: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   209: aastore
    //   210: aload #4
    //   212: iconst_2
    //   213: aaload
    //   214: bipush #12
    //   216: aload_0
    //   217: getfield ZY : Lburp/Zr_4;
    //   220: iconst_1
    //   221: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   224: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   229: pop
    //   230: aload_2
    //   231: ifnonnull -> 697
    //   234: aload #4
    //   236: iconst_0
    //   237: aload_0
    //   238: getfield ZY : Lburp/Zr_4;
    //   241: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   244: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   247: aastore
    //   248: aload #4
    //   250: iconst_0
    //   251: aaload
    //   252: bipush #7
    //   254: aload_0
    //   255: getfield ZY : Lburp/Zr_4;
    //   258: iconst_1
    //   259: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   262: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   267: pop
    //   268: aload #4
    //   270: iconst_0
    //   271: aaload
    //   272: aload_0
    //   273: getfield ZY : Lburp/Zr_4;
    //   276: iconst_1
    //   277: newarray byte
    //   279: dup
    //   280: iconst_0
    //   281: bipush #97
    //   283: bastore
    //   284: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   289: invokeinterface add : (Ljava/lang/Object;)Z
    //   294: pop
    //   295: aload #4
    //   297: iconst_0
    //   298: aaload
    //   299: aload_0
    //   300: getfield ZY : Lburp/Zr_4;
    //   303: iconst_1
    //   304: newarray byte
    //   306: dup
    //   307: iconst_0
    //   308: bipush #98
    //   310: bastore
    //   311: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   316: invokeinterface add : (Ljava/lang/Object;)Z
    //   321: pop
    //   322: aload #4
    //   324: iconst_0
    //   325: aaload
    //   326: aload_0
    //   327: getfield ZY : Lburp/Zr_4;
    //   330: iconst_1
    //   331: newarray byte
    //   333: dup
    //   334: iconst_0
    //   335: bipush #99
    //   337: bastore
    //   338: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   343: invokeinterface add : (Ljava/lang/Object;)Z
    //   348: pop
    //   349: aload #4
    //   351: iconst_0
    //   352: aaload
    //   353: aload_0
    //   354: getfield ZY : Lburp/Zr_4;
    //   357: iconst_1
    //   358: newarray byte
    //   360: dup
    //   361: iconst_0
    //   362: bipush #100
    //   364: bastore
    //   365: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   370: invokeinterface add : (Ljava/lang/Object;)Z
    //   375: pop
    //   376: aload #4
    //   378: iconst_0
    //   379: aaload
    //   380: aload_0
    //   381: getfield ZY : Lburp/Zr_4;
    //   384: iconst_1
    //   385: newarray byte
    //   387: dup
    //   388: iconst_0
    //   389: bipush #101
    //   391: bastore
    //   392: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   397: invokeinterface add : (Ljava/lang/Object;)Z
    //   402: pop
    //   403: aload #4
    //   405: iconst_0
    //   406: aaload
    //   407: aload_0
    //   408: getfield ZY : Lburp/Zr_4;
    //   411: iconst_1
    //   412: newarray byte
    //   414: dup
    //   415: iconst_0
    //   416: bipush #102
    //   418: bastore
    //   419: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   424: invokeinterface add : (Ljava/lang/Object;)Z
    //   429: pop
    //   430: aload #4
    //   432: iconst_1
    //   433: aload_0
    //   434: getfield ZY : Lburp/Zr_4;
    //   437: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   440: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   443: aastore
    //   444: aload #4
    //   446: iconst_1
    //   447: aaload
    //   448: bipush #7
    //   450: aload_0
    //   451: getfield ZY : Lburp/Zr_4;
    //   454: iconst_1
    //   455: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   458: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   463: pop
    //   464: aload #4
    //   466: iconst_1
    //   467: aaload
    //   468: aload_0
    //   469: getfield ZY : Lburp/Zr_4;
    //   472: iconst_1
    //   473: newarray byte
    //   475: dup
    //   476: iconst_0
    //   477: bipush #97
    //   479: bastore
    //   480: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   485: invokeinterface add : (Ljava/lang/Object;)Z
    //   490: pop
    //   491: aload #4
    //   493: iconst_1
    //   494: aaload
    //   495: aload_0
    //   496: getfield ZY : Lburp/Zr_4;
    //   499: iconst_1
    //   500: newarray byte
    //   502: dup
    //   503: iconst_0
    //   504: bipush #98
    //   506: bastore
    //   507: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   512: invokeinterface add : (Ljava/lang/Object;)Z
    //   517: pop
    //   518: aload #4
    //   520: iconst_1
    //   521: aaload
    //   522: aload_0
    //   523: getfield ZY : Lburp/Zr_4;
    //   526: iconst_1
    //   527: newarray byte
    //   529: dup
    //   530: iconst_0
    //   531: bipush #99
    //   533: bastore
    //   534: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   539: invokeinterface add : (Ljava/lang/Object;)Z
    //   544: pop
    //   545: aload #4
    //   547: iconst_1
    //   548: aaload
    //   549: aload_0
    //   550: getfield ZY : Lburp/Zr_4;
    //   553: iconst_1
    //   554: newarray byte
    //   556: dup
    //   557: iconst_0
    //   558: bipush #100
    //   560: bastore
    //   561: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   566: invokeinterface add : (Ljava/lang/Object;)Z
    //   571: pop
    //   572: aload #4
    //   574: iconst_1
    //   575: aaload
    //   576: aload_0
    //   577: getfield ZY : Lburp/Zr_4;
    //   580: iconst_1
    //   581: newarray byte
    //   583: dup
    //   584: iconst_0
    //   585: bipush #101
    //   587: bastore
    //   588: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   593: invokeinterface add : (Ljava/lang/Object;)Z
    //   598: pop
    //   599: aload #4
    //   601: iconst_1
    //   602: aaload
    //   603: aload_0
    //   604: getfield ZY : Lburp/Zr_4;
    //   607: iconst_1
    //   608: newarray byte
    //   610: dup
    //   611: iconst_0
    //   612: bipush #102
    //   614: bastore
    //   615: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   620: invokeinterface add : (Ljava/lang/Object;)Z
    //   625: pop
    //   626: aload_2
    //   627: ifnonnull -> 697
    //   630: aload #4
    //   632: iconst_0
    //   633: aload_0
    //   634: getfield ZY : Lburp/Zr_4;
    //   637: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   640: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   643: aastore
    //   644: aload #4
    //   646: iconst_0
    //   647: aaload
    //   648: iconst_3
    //   649: aload_0
    //   650: getfield ZY : Lburp/Zr_4;
    //   653: iconst_1
    //   654: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   657: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   662: pop
    //   663: aload #4
    //   665: iconst_1
    //   666: aload_0
    //   667: getfield ZY : Lburp/Zr_4;
    //   670: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   673: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   676: aastore
    //   677: aload #4
    //   679: iconst_1
    //   680: aaload
    //   681: bipush #7
    //   683: aload_0
    //   684: getfield ZY : Lburp/Zr_4;
    //   687: iconst_1
    //   688: invokestatic Zw : (ILburp/Zr_4;Z)Ljava/util/List;
    //   691: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   696: pop
    //   697: iconst_0
    //   698: istore #6
    //   700: iload #6
    //   702: bipush #8
    //   704: if_icmpge -> 969
    //   707: aload #4
    //   709: iload #6
    //   711: aaload
    //   712: ifnonnull -> 742
    //   715: aload_0
    //   716: getfield Zu : [Lburp/Zbbe;
    //   719: iload #6
    //   721: aaload
    //   722: ifnull -> 823
    //   725: aload_0
    //   726: getfield Zu : [Lburp/Zbbe;
    //   729: iload #6
    //   731: aaload
    //   732: invokevirtual Z_ : ()Lburp/Zbys;
    //   735: invokevirtual Zc : ()V
    //   738: aload_2
    //   739: ifnonnull -> 823
    //   742: aload_0
    //   743: getfield Zu : [Lburp/Zbbe;
    //   746: iload #6
    //   748: aaload
    //   749: ifnonnull -> 781
    //   752: aload_0
    //   753: getfield Zu : [Lburp/Zbbe;
    //   756: iload #6
    //   758: new burp/Zbbe
    //   761: dup
    //   762: aload_0
    //   763: getfield Zv : Lburp/Zz0n;
    //   766: aload_0
    //   767: getfield Zj : Lburp/Zt4u;
    //   770: aload_0
    //   771: aload_0
    //   772: getfield ZY : Lburp/Zr_4;
    //   775: iload #6
    //   777: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zbe8;Lburp/Zr_4;I)V
    //   780: aastore
    //   781: aload_0
    //   782: getfield Zu : [Lburp/Zbbe;
    //   785: iload #6
    //   787: aaload
    //   788: invokevirtual Z_ : ()Lburp/Zbys;
    //   791: aload #4
    //   793: iload #6
    //   795: aaload
    //   796: invokevirtual Zm : (Lburp/Zefg;)V
    //   799: aload_0
    //   800: getfield Z_ : Lburp/Zx05;
    //   803: iload #6
    //   805: aload_0
    //   806: getfield Zu : [Lburp/Zbbe;
    //   809: iload #6
    //   811: aaload
    //   812: invokevirtual Z_ : ()Lburp/Zbys;
    //   815: invokevirtual ZK : ()Lburp/Zefg;
    //   818: invokeinterface Zd : (ILburp/Zefg;)V
    //   823: aload #5
    //   825: iload #6
    //   827: aaload
    //   828: ifnonnull -> 880
    //   831: aload_0
    //   832: getfield Zu : [Lburp/Zbbe;
    //   835: iload #6
    //   837: aaload
    //   838: ifnull -> 853
    //   841: aload_0
    //   842: getfield Zu : [Lburp/Zbbe;
    //   845: iload #6
    //   847: aaload
    //   848: ldc ''
    //   850: invokevirtual Zu : (Ljava/lang/String;)V
    //   853: aload_0
    //   854: getfield Z_ : Lburp/Zx05;
    //   857: iload #6
    //   859: aload_0
    //   860: getfield ZY : Lburp/Zr_4;
    //   863: getstatic net/portswigger/Zdo.ZQ : [B
    //   866: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   871: invokeinterface ZP : (ILburp/Zstu;)V
    //   876: aload_2
    //   877: ifnonnull -> 962
    //   880: aload_0
    //   881: getfield Zu : [Lburp/Zbbe;
    //   884: iload #6
    //   886: aaload
    //   887: ifnonnull -> 919
    //   890: aload_0
    //   891: getfield Zu : [Lburp/Zbbe;
    //   894: iload #6
    //   896: new burp/Zbbe
    //   899: dup
    //   900: aload_0
    //   901: getfield Zv : Lburp/Zz0n;
    //   904: aload_0
    //   905: getfield Zj : Lburp/Zt4u;
    //   908: aload_0
    //   909: aload_0
    //   910: getfield ZY : Lburp/Zr_4;
    //   913: iload #6
    //   915: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zbe8;Lburp/Zr_4;I)V
    //   918: aastore
    //   919: aload_0
    //   920: getfield Zu : [Lburp/Zbbe;
    //   923: iload #6
    //   925: aaload
    //   926: aload #5
    //   928: iload #6
    //   930: aaload
    //   931: invokevirtual Zu : (Ljava/lang/String;)V
    //   934: aload_0
    //   935: getfield Z_ : Lburp/Zx05;
    //   938: iload #6
    //   940: aload_0
    //   941: getfield ZY : Lburp/Zr_4;
    //   944: aload #5
    //   946: iload #6
    //   948: aaload
    //   949: invokestatic Zy : (Ljava/lang/String;)[B
    //   952: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   957: invokeinterface ZP : (ILburp/Zstu;)V
    //   962: iinc #6, 1
    //   965: aload_2
    //   966: ifnonnull -> 700
    //   969: aload_0
    //   970: getfield Zz : Lburp/Zedd;
    //   973: iconst_0
    //   974: invokevirtual setSelectedIndex : (I)V
    //   977: aload_0
    //   978: iconst_0
    //   979: invokevirtual Zn : (I)V
    //   982: aload_0
    //   983: getfield ZR : Lburp/Zedd;
    //   986: iconst_0
    //   987: invokevirtual setSelectedIndex : (I)V
    //   990: aload_0
    //   991: invokevirtual Zk : ()V
    //   994: return
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    String[] arrayOfString = Zbb7.ZS();
    if (0 != Zx6o.Zc(this, a(-28187, 1320), a(-28182, 27806), new String[] { a(-28190, 17989), a(-28183, -4959) }1))
      return; 
    byte b = 0;
    while (b < 8) {
      if (this.Zu[b] != null) {
        this.Zu[b].Z_().Zc();
        this.Zu[b].Zu("");
      } 
      this.Z_.ZP(b, this.ZY.ZZ(Zdo.ZQ));
      b++;
      if (arrayOfString == null)
        break; 
    } 
    this.Zz.setSelectedIndex(0);
    Zn(0);
    this.ZR.setSelectedIndex(0);
    Zk();
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    if (this.Zu[this.ZF] != null) {
      this.Zu[this.ZF].setVisible(false);
      this.ZP.remove(this.Zu[this.ZF]);
    } 
    Zn(this.Zz.getSelectedIndex());
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {}
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface Zyi : ()Lburp/Zzvm;
    //   11: astore #5
    //   13: aload_1
    //   14: invokeinterface Zyi : ()Lburp/Zzvm;
    //   19: aload_0
    //   20: getfield Zg : Lburp/Ze9k;
    //   23: invokeinterface Zyi : ()Lburp/Zzvm;
    //   28: if_acmpne -> 35
    //   31: iconst_1
    //   32: goto -> 36
    //   35: iconst_0
    //   36: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   39: aload #5
    //   41: getfield id : B
    //   44: i2l
    //   45: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   48: aload_0
    //   49: aload_0
    //   50: aload_1
    //   51: checkcast burp/Zx05
    //   54: dup_x1
    //   55: putfield Z_ : Lburp/Zx05;
    //   58: putfield Zg : Lburp/Ze9k;
    //   61: aload_0
    //   62: getfield Z_ : Lburp/Zx05;
    //   65: invokeinterface ZCR : ()Lburp/Zrte;
    //   70: astore #6
    //   72: iconst_0
    //   73: istore #7
    //   75: iload #7
    //   77: aload #6
    //   79: invokeinterface Zpu : ()I
    //   84: if_icmpge -> 223
    //   87: aload #6
    //   89: iload #7
    //   91: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   96: ifnonnull -> 127
    //   99: aload_0
    //   100: getfield Zu : [Lburp/Zbbe;
    //   103: iload #7
    //   105: aaload
    //   106: ifnull -> 215
    //   109: aload_0
    //   110: getfield Zu : [Lburp/Zbbe;
    //   113: iload #7
    //   115: aaload
    //   116: invokevirtual Z_ : ()Lburp/Zbys;
    //   119: invokevirtual Zc : ()V
    //   122: aload #4
    //   124: ifnonnull -> 215
    //   127: aload_0
    //   128: getfield Zu : [Lburp/Zbbe;
    //   131: iload #7
    //   133: aaload
    //   134: ifnonnull -> 166
    //   137: aload_0
    //   138: getfield Zu : [Lburp/Zbbe;
    //   141: iload #7
    //   143: new burp/Zbbe
    //   146: dup
    //   147: aload_0
    //   148: getfield Zv : Lburp/Zz0n;
    //   151: aload_0
    //   152: getfield Zj : Lburp/Zt4u;
    //   155: aload_0
    //   156: aload_0
    //   157: getfield ZY : Lburp/Zr_4;
    //   160: iload #7
    //   162: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zbe8;Lburp/Zr_4;I)V
    //   165: aastore
    //   166: aload_0
    //   167: getfield Zu : [Lburp/Zbbe;
    //   170: iload #7
    //   172: aaload
    //   173: invokevirtual Z_ : ()Lburp/Zbys;
    //   176: aload #6
    //   178: iload #7
    //   180: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   185: checkcast burp/Zefg
    //   188: invokevirtual Zm : (Lburp/Zefg;)V
    //   191: aload_0
    //   192: getfield Z_ : Lburp/Zx05;
    //   195: iload #7
    //   197: aload_0
    //   198: getfield Zu : [Lburp/Zbbe;
    //   201: iload #7
    //   203: aaload
    //   204: invokevirtual Z_ : ()Lburp/Zbys;
    //   207: invokevirtual ZK : ()Lburp/Zefg;
    //   210: invokeinterface Zd : (ILburp/Zefg;)V
    //   215: iinc #7, 1
    //   218: aload #4
    //   220: ifnonnull -> 75
    //   223: aload_0
    //   224: getfield Z_ : Lburp/Zx05;
    //   227: invokeinterface ZCC : ()Lburp/Zrte;
    //   232: astore #7
    //   234: iconst_0
    //   235: istore #8
    //   237: iload #8
    //   239: aload #7
    //   241: invokeinterface Zpu : ()I
    //   246: if_icmpge -> 408
    //   249: aload #7
    //   251: iload #8
    //   253: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   258: ifnonnull -> 311
    //   261: aload_0
    //   262: getfield Zu : [Lburp/Zbbe;
    //   265: iload #8
    //   267: aaload
    //   268: ifnull -> 283
    //   271: aload_0
    //   272: getfield Zu : [Lburp/Zbbe;
    //   275: iload #8
    //   277: aaload
    //   278: ldc ''
    //   280: invokevirtual Zu : (Ljava/lang/String;)V
    //   283: aload_0
    //   284: getfield Z_ : Lburp/Zx05;
    //   287: iload #8
    //   289: aload_0
    //   290: getfield ZY : Lburp/Zr_4;
    //   293: getstatic net/portswigger/Zdo.ZQ : [B
    //   296: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   301: invokeinterface ZP : (ILburp/Zstu;)V
    //   306: aload #4
    //   308: ifnonnull -> 400
    //   311: aload_0
    //   312: getfield Zu : [Lburp/Zbbe;
    //   315: iload #8
    //   317: aaload
    //   318: ifnonnull -> 350
    //   321: aload_0
    //   322: getfield Zu : [Lburp/Zbbe;
    //   325: iload #8
    //   327: new burp/Zbbe
    //   330: dup
    //   331: aload_0
    //   332: getfield Zv : Lburp/Zz0n;
    //   335: aload_0
    //   336: getfield Zj : Lburp/Zt4u;
    //   339: aload_0
    //   340: aload_0
    //   341: getfield ZY : Lburp/Zr_4;
    //   344: iload #8
    //   346: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zbe8;Lburp/Zr_4;I)V
    //   349: aastore
    //   350: aload_0
    //   351: getfield Zu : [Lburp/Zbbe;
    //   354: iload #8
    //   356: aaload
    //   357: aload #7
    //   359: iload #8
    //   361: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   366: checkcast burp/Zstu
    //   369: invokeinterface Zis : ()Ljava/lang/String;
    //   374: invokevirtual Zu : (Ljava/lang/String;)V
    //   377: aload_0
    //   378: getfield Z_ : Lburp/Zx05;
    //   381: iload #8
    //   383: aload #7
    //   385: iload #8
    //   387: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   392: checkcast burp/Zstu
    //   395: invokeinterface ZP : (ILburp/Zstu;)V
    //   400: iinc #8, 1
    //   403: aload #4
    //   405: ifnonnull -> 237
    //   408: aload_0
    //   409: getfield Zz : Lburp/Zedd;
    //   412: iconst_0
    //   413: invokevirtual setSelectedIndex : (I)V
    //   416: aload_0
    //   417: iconst_0
    //   418: invokevirtual Zn : (I)V
    //   421: aload_0
    //   422: getfield ZR : Lburp/Zedd;
    //   425: iconst_0
    //   426: invokevirtual setSelectedIndex : (I)V
    //   429: aload_0
    //   430: invokevirtual Zk : ()V
    //   433: return
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '£¶í\\tÕ^óbì¢Ã1@<&EÿHg59í0TìÛum4»ÈÛÜgëÄ5\\fpÔ&ù#>Øªt@)<5XTÜÞ<g0aÆä?Ù(¢8^¦Øæ®Ìn¬ü«°DÕÀÙp¼ÏsPr'5v1rÇ©p´Ò7.´Y;c+-MñÍLMOåõï+mUÎ¢üÙÉGûå¾X¯ìÞ a\\tÜguØó>5ÅüoË\\t¡@áQþL?ÐÎdtÞÞõ¦·wÙçtÍ2XU!Úo n!\\rsåô®úF{[ÛâEKý¨×|_ÓÃ"6ÄµMïkÞ~Çl*¼æó«@¦ÉUXK(¥¡¬Û\\f ~QÅÖyÐt?N°Ôm5ÌsÙÌALho <'YôÀ;äx¥zÝðzÆö~½ÝÓM\\nÓ}=©Ø; ®I$}`ñÃ+Pí+Ëâ´>²'¯s¨z¸¬\\n|Dzo5\\rVdz#ê=V£µÓ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #92
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
    //   68: ldc '*¯?º>ÚÒÓÁ=3J®£y\\tõX£ú|$b'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Zbe8.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbe8.b : [Ljava/lang/String;
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
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #49
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #124
    //   239: goto -> 244
    //   242: bipush #48
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
    int i = (paramInt1 ^ 0xFFFF91EF) & 0xFFFF;
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
      byte b1 = 112;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */