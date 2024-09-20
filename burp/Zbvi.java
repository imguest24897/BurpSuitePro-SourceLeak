package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import net.portswigger.Zop;
import net.portswigger.Zqe;

class Zbvi extends Zbqc {
  private static final DateFormat ZL;
  
  private final Zmwq Za;
  
  private final Zrn7 Zt;
  
  private Zscl ZI;
  
  private Zm99 Zc;
  
  private Zem9 ZT;
  
  private Zem9 ZD;
  
  private Ze0q Zv;
  
  private Ze01 Zi;
  
  private Zm99 ZR;
  
  private Zm99 Zh;
  
  private Zm99 ZE;
  
  private Zm99 Zg;
  
  private Zm99 Zy;
  
  private Zm99 ZW;
  
  private Zm99 Zj;
  
  private Zbkc ZS;
  
  private Zx0_ ZK;
  
  private Zm99 Zn;
  
  private Zx0_ Zz;
  
  private Zm99 ZH;
  
  private Zl8w ZV;
  
  private Zbv2 ZC;
  
  private Zm9c Zw;
  
  private Zbqc ZZ;
  
  private Zm2z ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbvi(Zmwq paramZmwq, Zrn7 paramZrn7) {
    this.Zt = paramZrn7;
    this.Za = paramZmwq;
    ZA();
    this.Zi.setText(a(-10431, -18753));
    this.ZK.setContentType(a(-10412, -22736));
    this.ZK.Zf();
    this.ZK.addHyperlinkListener(new Zew1(this));
    this.ZK.Zx(Zlkk.PANEL_BACKGROUND);
    this.Zz.setContentType(a(-10430, -29538));
    this.Zz.Zf();
    this.Zz.addHyperlinkListener(new Zew1(this));
    this.Zz.Zx(Zlkk.PANEL_BACKGROUND);
    this.ZR.ZE(Zt00.BOLD_FONT);
    this.Zh.ZE(Zt00.BOLD_FONT);
    this.ZE.ZE(Zt00.BOLD_FONT);
    this.Zg.ZE(Zt00.BOLD_FONT);
    this.Zy.ZE(Zt00.BOLD_FONT);
    this.ZW.ZE(Zt00.BOLD_FONT);
    this.Zv.setName(a(-10427, -12735));
  }
  
  void ZQ(Zscl paramZscl) {
    // Byte code:
    //   0: invokestatic isEventDispatchThread : ()Z
    //   3: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   6: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   9: invokestatic Zc : ()I
    //   12: aload_0
    //   13: aload_1
    //   14: putfield ZI : Lburp/Zscl;
    //   17: istore_2
    //   18: aload_1
    //   19: getfield Z_ : Lnet/portswigger/Zcr;
    //   22: astore_3
    //   23: aload_0
    //   24: getfield ZS : Lburp/Zbkc;
    //   27: aload_3
    //   28: invokevirtual ZI : ()Ljava/lang/String;
    //   31: invokevirtual Zx : (Ljava/lang/String;)V
    //   34: aload_0
    //   35: getfield Zj : Lburp/Zm99;
    //   38: aload_3
    //   39: invokevirtual Zm : ()Ljava/lang/String;
    //   42: invokevirtual setText : (Ljava/lang/String;)V
    //   45: aload_0
    //   46: getfield ZH : Lburp/Zm99;
    //   49: aload_3
    //   50: invokevirtual ZE : ()Ljava/lang/String;
    //   53: invokevirtual setText : (Ljava/lang/String;)V
    //   56: aload_3
    //   57: invokevirtual ZD : ()J
    //   60: lstore #4
    //   62: aload_0
    //   63: getfield Zn : Lburp/Zm99;
    //   66: lload #4
    //   68: lconst_0
    //   69: lcmp
    //   70: ifne -> 82
    //   73: ldc ''
    //   75: goto -> 97
    //   78: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   81: athrow
    //   82: getstatic burp/Zbvi.ZL : Ljava/text/DateFormat;
    //   85: new java/util/Date
    //   88: dup
    //   89: lload #4
    //   91: invokespecial <init> : (J)V
    //   94: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   97: invokevirtual setText : (Ljava/lang/String;)V
    //   100: aload_0
    //   101: getfield ZA : Lburp/Zm2z;
    //   104: new burp/Zzog
    //   107: dup
    //   108: aload_3
    //   109: invokevirtual Z_ : ()I
    //   112: invokespecial <init> : (I)V
    //   115: invokevirtual Zh : (Lburp/Zzog;)V
    //   118: aload_0
    //   119: getfield Zw : Lburp/Zm9c;
    //   122: new burp/Zsyx
    //   125: dup
    //   126: aload_3
    //   127: invokevirtual Zi : ()I
    //   130: invokespecial <init> : (I)V
    //   133: invokevirtual Z_ : (Lburp/Zsyx;)V
    //   136: aload_3
    //   137: invokevirtual Zx : ()Ljava/lang/String;
    //   140: invokestatic Zw : (Ljava/lang/String;)Ljava/lang/String;
    //   143: astore #6
    //   145: aload_0
    //   146: getfield ZK : Lburp/Zx0_;
    //   149: aload #6
    //   151: invokevirtual setText : (Ljava/lang/String;)V
    //   154: goto -> 180
    //   157: astore #7
    //   159: aload #7
    //   161: aload_3
    //   162: invokevirtual ZI : ()Ljava/lang/String;
    //   165: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   168: invokestatic ZU : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;)V
    //   171: aload_0
    //   172: getfield ZK : Lburp/Zx0_;
    //   175: ldc ''
    //   177: invokevirtual setText : (Ljava/lang/String;)V
    //   180: aload_3
    //   181: invokevirtual ZJ : ()Ljava/lang/String;
    //   184: astore #7
    //   186: aload #7
    //   188: ifnull -> 255
    //   191: aload #7
    //   193: invokevirtual isEmpty : ()Z
    //   196: ifne -> 255
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   205: athrow
    //   206: aload_0
    //   207: getfield ZE : Lburp/Zm99;
    //   210: iconst_1
    //   211: invokevirtual setVisible : (Z)V
    //   214: aload_0
    //   215: getfield Zz : Lburp/Zx0_;
    //   218: iconst_1
    //   219: invokevirtual setVisible : (Z)V
    //   222: aload_0
    //   223: getfield Zz : Lburp/Zx0_;
    //   226: aload #7
    //   228: invokestatic ZD : (Ljava/lang/String;)Ljava/lang/String;
    //   231: invokevirtual setText : (Ljava/lang/String;)V
    //   234: aload_0
    //   235: getfield Zz : Lburp/Zx0_;
    //   238: invokestatic createEmptyBorder : ()Ljavax/swing/border/Border;
    //   241: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   244: iload_2
    //   245: ifeq -> 278
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   254: athrow
    //   255: aload_0
    //   256: getfield ZE : Lburp/Zm99;
    //   259: iconst_0
    //   260: invokevirtual setVisible : (Z)V
    //   263: aload_0
    //   264: getfield Zz : Lburp/Zx0_;
    //   267: iconst_0
    //   268: invokevirtual setVisible : (Z)V
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   277: athrow
    //   278: aload_0
    //   279: getfield ZZ : Lburp/Zbqc;
    //   282: invokevirtual removeAll : ()V
    //   285: aload_3
    //   286: invokevirtual Zp : ()B
    //   289: invokestatic Zo : (I)Lburp/Ztqs;
    //   292: aload_3
    //   293: invokevirtual ZF : ()Z
    //   296: aload_3
    //   297: invokevirtual Zl : ()I
    //   300: aload_0
    //   301: getfield Zt : Lburp/Zrn7;
    //   304: invokestatic Zd : (Lburp/Ztqs;ZILburp/Zrn7;)Lburp/Zmi7;
    //   307: astore #8
    //   309: aload #8
    //   311: invokevirtual Zz : ()Z
    //   314: ifeq -> 380
    //   317: aload_0
    //   318: getfield Zv : Lburp/Ze0q;
    //   321: aload_0
    //   322: getfield Za : Lburp/Zmwq;
    //   325: aload_1
    //   326: invokeinterface ZB : (Lburp/Zscl;)Ljava/lang/String;
    //   331: invokevirtual setText : (Ljava/lang/String;)V
    //   334: aload_0
    //   335: getfield Zv : Lburp/Ze0q;
    //   338: aload_1
    //   339: getfield Zt : Lburp/Zm36;
    //   342: getstatic burp/Zm36.INSTALLING : Lburp/Zm36;
    //   345: if_acmpeq -> 363
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   354: athrow
    //   355: iconst_1
    //   356: goto -> 364
    //   359: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   362: athrow
    //   363: iconst_0
    //   364: invokevirtual setEnabled : (Z)V
    //   367: aload_0
    //   368: getfield ZV : Lburp/Zl8w;
    //   371: ldc ''
    //   373: invokevirtual setText : (Ljava/lang/String;)V
    //   376: iload_2
    //   377: ifeq -> 465
    //   380: aload_0
    //   381: getfield Zv : Lburp/Ze0q;
    //   384: sipush #-10429
    //   387: sipush #27182
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: invokevirtual setText : (Ljava/lang/String;)V
    //   396: aload_0
    //   397: getfield Zv : Lburp/Ze0q;
    //   400: iconst_0
    //   401: invokevirtual setEnabled : (Z)V
    //   404: aload #8
    //   406: invokevirtual Zb : ()Lburp/Ze5q;
    //   409: astore #9
    //   411: aload_0
    //   412: getfield ZV : Lburp/Zl8w;
    //   415: aload #9
    //   417: invokeinterface Zn : ()Ljava/lang/String;
    //   422: invokevirtual setText : (Ljava/lang/String;)V
    //   425: aload #9
    //   427: invokeinterface ZU : ()Z
    //   432: ifeq -> 465
    //   435: aload_0
    //   436: getfield ZZ : Lburp/Zbqc;
    //   439: aload #9
    //   441: invokeinterface ZG : ()Ljava/awt/Component;
    //   446: sipush #-10425
    //   449: sipush #20390
    //   452: invokestatic a : (II)Ljava/lang/String;
    //   455: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   464: athrow
    //   465: aload_0
    //   466: getfield Zi : Lburp/Ze01;
    //   469: aload_0
    //   470: getfield Za : Lburp/Zmwq;
    //   473: aload_1
    //   474: invokeinterface Zr : (Lburp/Zscl;)Z
    //   479: invokevirtual setEnabled : (Z)V
    //   482: aload_3
    //   483: invokevirtual Zf : ()Ljava/util/Optional;
    //   486: astore #9
    //   488: aload #9
    //   490: aload_0
    //   491: <illegal opcode> accept : (Lburp/Zbvi;)Ljava/util/function/Consumer;
    //   496: aload_0
    //   497: <illegal opcode> run : (Lburp/Zbvi;)Ljava/lang/Runnable;
    //   502: invokevirtual ifPresentOrElse : (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   505: aload_0
    //   506: invokevirtual validate : ()V
    //   509: return
    // Exception table:
    //   from	to	target	type
    //   62	78	78	java/lang/NullPointerException
    //   145	154	157	java/lang/NullPointerException
    //   186	199	202	java/lang/NullPointerException
    //   191	248	251	java/lang/NullPointerException
    //   206	271	274	java/lang/NullPointerException
    //   309	348	351	java/lang/NullPointerException
    //   317	359	359	java/lang/NullPointerException
    //   411	458	461	java/lang/NullPointerException
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      if (this.ZI != null)
        ZQ(this.ZI); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  private static String ZD(String paramString) {
    return Zmy2.Zw(String.format(a(-10421, -1320), new Object[] { paramString, paramString }));
  }
  
  private void ZA() {
    this.ZS = new Zbkc();
    this.ZT = new Zem9();
    this.ZC = new Zbv2();
    this.ZD = new Zem9();
    this.ZK = new Zx0_();
    this.ZR = new Zm99();
    this.Zj = new Zm99();
    this.Zh = new Zm99();
    this.ZH = new Zm99();
    this.ZE = new Zm99();
    this.Zz = new Zx0_();
    this.Zg = new Zm99();
    this.ZA = new Zm2z();
    this.Zi = new Ze01();
    this.Zy = new Zm99();
    this.Zw = new Zm9c();
    this.ZW = new Zm99();
    this.Zn = new Zm99();
    this.Zv = new Ze0q();
    this.Zc = new Zm99();
    this.ZZ = new Zbqc();
    this.ZV = new Zl8w();
    setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZS, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(5, 0, 5, 0);
    add(this.ZT, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 21;
    add(this.ZC, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 15, 0);
    add(this.ZD, gridBagConstraints);
    this.ZK.setEditable(false);
    this.ZK.setBorder((Border)null);
    this.ZK.setMargin(new Insets(0, 0, 0, 0));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZK, gridBagConstraints);
    this.ZR.setText(a(-10424, -28809));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 23;
    add(this.ZR, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zj, gridBagConstraints);
    this.Zh.setText(a(-10420, -14582));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 23;
    add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZH, gridBagConstraints);
    this.ZE.setText(a(-10418, 27085));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 23;
    add(this.ZE, gridBagConstraints);
    this.Zz.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    add(this.Zz, gridBagConstraints);
    this.Zg.setText(a(-10423, -6558));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 21;
    add(this.Zg, gridBagConstraints);
    this.ZA.setText(a(-10422, 11084));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 21;
    add(this.ZA, gridBagConstraints);
    this.Zi.setText(a(-10428, -31035));
    this.Zi.addActionListener(new Zrs1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    add(this.Zi, gridBagConstraints);
    this.Zy.setText(a(-10410, -20227));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 23;
    add(this.Zw, gridBagConstraints);
    this.ZW.setText(a(-10426, -25967));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zn, gridBagConstraints);
    this.Zv.setText(a(-10409, 30625));
    this.Zv.addActionListener(new Zs43(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zv, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zc, gridBagConstraints);
    this.ZZ.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    add(this.ZZ, gridBagConstraints);
    this.ZV.Zl(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZV, gridBagConstraints);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    this.Zv.setEnabled(false);
    this.Zv.setText(a(-10419, -31657));
    this.Za.Zz(this.ZI);
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.Zi.setEnabled(false);
    Zrht zrht = new Zrht(Zt2m.ZF(this), a(-10411, -163), String.format(a(-10417, 24332), new Object[] { this.ZI.Z_.ZI() }));
    zrht.setVisible(true);
    int i = Zbm2.Zc();
    int j = zrht.Zc();
    try {
      if (j > 0) {
        try {
          this.Za.ZG(this.ZI, j);
          if (i != 0) {
            this.Zi.setEnabled(true);
            return;
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zi.setEnabled(true);
  }
  
  private void lambda$showBappDetails$1() {
    this.ZC.ZV(new Zop(Zqe.LOW, Zqe.LOW, Zqe.LOW, Zqe.LOW, Zqe.LOW));
  }
  
  private void lambda$showBappDetails$0(Zop paramZop) {
    this.ZC.ZV(paramZop);
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¾nõÒJXÜóû jÝ;dÑ+õx\\rsRIÞ·g;àS'h¨3§ù\\bo\\nÜ\\r)vZÞ÷º)E®oþT3>áw/qï}ðeÆÃ-Ý;w8Ëf¸K·s^{e \\nJð&ëaã\\b«Ù*\\bÁs âns*%\àµ¼@°'|ºûÚÖkÙ{¥×$º5j¤©Uä+ËU«Ë$IQ¦:Ò\\nqÝÒ;@+Øÿgøc3I¹ê '+¢°¾X/&\\fØ7a·;®T¦bÕuqº¯ë U/-áå+ÏøëE7ñ|Øq~·Ýµç`Êíõ\'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #13
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
    //   68: ldc 'MDô¯Sð\ÊÜ«_R'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
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
    //   129: putstatic burp/Zbvi.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbvi.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #22
    //   219: goto -> 244
    //   222: bipush #26
    //   224: goto -> 244
    //   227: bipush #76
    //   229: goto -> 244
    //   232: bipush #54
    //   234: goto -> 244
    //   237: bipush #45
    //   239: goto -> 244
    //   242: bipush #111
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
    //   300: new java/text/SimpleDateFormat
    //   303: dup
    //   304: sipush #-10432
    //   307: sipush #-26441
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zbvi.ZL : Ljava/text/DateFormat;
    //   319: return
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD745) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */