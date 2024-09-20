package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ButtonGroup;

class Zbye extends Zbyv implements Zl5s, Zl_2 {
  private final Zs1h ZZ;
  
  private final Zxzh ZI;
  
  private final Zz0n ZM;
  
  private final Zt4u Zu;
  
  private final Zerg Zr;
  
  private final Zgb6 Zl;
  
  private final Ztwv ZW;
  
  private final Zr_4 ZQ;
  
  private final Zt0n<Zlil, Zmk5> ZH;
  
  private final Zbws Zn;
  
  private final Zbyd ZK;
  
  private final Ztyg ZJ;
  
  private final Zlr9 ZT;
  
  private final Ze4m Zt;
  
  private final Zey9 ZS;
  
  private final Zgq7 ZE;
  
  private final Zbnt ZB;
  
  private boolean ZY;
  
  private Zm99 Zi;
  
  private Zm99 Zw;
  
  private Zmyw Zs;
  
  private ButtonGroup ZV;
  
  private Zzdy Zv;
  
  private Zzdy Zg;
  
  private Zzdy ZP;
  
  private Zzdy Zq;
  
  private Ze01 ZD;
  
  private Ze01 Zo;
  
  private Ze01 Zc;
  
  private Ze01 Za;
  
  private Zedd ZA;
  
  private Zm2o Zz;
  
  private Zm99 Zy;
  
  private Zg85 ZO;
  
  private Zg85 Zd;
  
  private Zbqc Z_;
  
  private Zmg2 Zk;
  
  private Zmg2 ZG;
  
  private Zbup ZF;
  
  private Zl8w ZX;
  
  private Zl8w Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbye(Zs1h paramZs1h, boolean paramBoolean, Zxzh paramZxzh, Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgb6 paramZgb6, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Ze4m paramZe4m, Zbnt paramZbnt, Zey9 paramZey9) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZZ : Lburp/Zs1h;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield ZI : Lburp/Zxzh;
    //   14: aload_0
    //   15: aload #4
    //   17: putfield ZM : Lburp/Zz0n;
    //   20: aload_0
    //   21: aload #5
    //   23: putfield Zu : Lburp/Zt4u;
    //   26: aload_0
    //   27: aload #6
    //   29: putfield Zr : Lburp/Zerg;
    //   32: aload_0
    //   33: aload #7
    //   35: putfield Zl : Lburp/Zgb6;
    //   38: aload_0
    //   39: aload #11
    //   41: putfield ZE : Lburp/Zgq7;
    //   44: aload_0
    //   45: aload #14
    //   47: putfield ZB : Lburp/Zbnt;
    //   50: aload_0
    //   51: aload #8
    //   53: putfield ZW : Lburp/Ztwv;
    //   56: aload_0
    //   57: aload #9
    //   59: putfield ZQ : Lburp/Zr_4;
    //   62: invokestatic ZI : ()Z
    //   65: aload_0
    //   66: aload #10
    //   68: putfield ZJ : Lburp/Ztyg;
    //   71: istore #16
    //   73: aload_0
    //   74: aload #12
    //   76: putfield ZT : Lburp/Zlr9;
    //   79: aload_0
    //   80: aload #13
    //   82: putfield Zt : Lburp/Ze4m;
    //   85: aload_0
    //   86: aload #15
    //   88: putfield ZS : Lburp/Zey9;
    //   91: aload_0
    //   92: invokevirtual ZK : ()V
    //   95: iload_2
    //   96: ifeq -> 115
    //   99: aload_0
    //   100: getfield ZX : Lburp/Zl8w;
    //   103: iconst_0
    //   104: invokevirtual setVisible : (Z)V
    //   107: aload_0
    //   108: getfield Zz : Lburp/Zm2o;
    //   111: iconst_0
    //   112: invokevirtual setVisible : (Z)V
    //   115: aload_0
    //   116: new burp/Zt0n
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: putfield ZH : Lburp/Zt0n;
    //   126: aload_0
    //   127: new burp/Zbws
    //   130: dup
    //   131: aload_0
    //   132: getfield ZH : Lburp/Zt0n;
    //   135: invokespecial <init> : (Lburp/Zztu;)V
    //   138: putfield Zn : Lburp/Zbws;
    //   141: aload_0
    //   142: aload_1
    //   143: invokevirtual ZE : ()Lburp/Zlil;
    //   146: invokevirtual Zo : (Lburp/Zlil;)V
    //   149: aload_0
    //   150: getfield ZF : Lburp/Zbup;
    //   153: aload_0
    //   154: getfield Zn : Lburp/Zbws;
    //   157: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   160: aload_0
    //   161: getfield Zg : Lburp/Zzdy;
    //   164: aload_1
    //   165: invokevirtual ZO : ()Z
    //   168: invokevirtual setSelected : (Z)V
    //   171: aload_0
    //   172: aconst_null
    //   173: invokevirtual Zx : (Ljava/awt/event/ActionEvent;)V
    //   176: aload_1
    //   177: invokevirtual Zs : ()B
    //   180: lookupswitch default -> 229, 0 -> 208, 1 -> 221
    //   208: aload_0
    //   209: getfield Zk : Lburp/Zmg2;
    //   212: iconst_1
    //   213: invokevirtual setSelected : (Z)V
    //   216: iload #16
    //   218: ifne -> 229
    //   221: aload_0
    //   222: getfield ZG : Lburp/Zmg2;
    //   225: iconst_1
    //   226: invokevirtual setSelected : (Z)V
    //   229: aload_0
    //   230: getfield ZO : Lburp/Zg85;
    //   233: aload_1
    //   234: invokevirtual ZG : ()Ljava/util/List;
    //   237: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   240: invokevirtual setText : (Ljava/lang/String;)V
    //   243: aload_0
    //   244: getfield ZO : Lburp/Zg85;
    //   247: iconst_0
    //   248: invokevirtual setCaretPosition : (I)V
    //   251: aload_0
    //   252: getfield Zd : Lburp/Zg85;
    //   255: aload_1
    //   256: invokevirtual ZB : ()Ljava/util/List;
    //   259: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   262: invokevirtual setText : (Ljava/lang/String;)V
    //   265: aload_0
    //   266: getfield Zd : Lburp/Zg85;
    //   269: iconst_0
    //   270: invokevirtual setCaretPosition : (I)V
    //   273: aload_0
    //   274: getfield ZP : Lburp/Zzdy;
    //   277: aload_1
    //   278: invokevirtual Zz : ()Z
    //   281: invokevirtual setSelected : (Z)V
    //   284: aload_0
    //   285: new burp/Zbyd
    //   288: dup
    //   289: aload #4
    //   291: aload #5
    //   293: aload_1
    //   294: invokevirtual Zc : ()Lburp/Zs1b;
    //   297: iconst_1
    //   298: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zs1b;Z)V
    //   301: putfield ZK : Lburp/Zbyd;
    //   304: aload_0
    //   305: getfield Z_ : Lburp/Zbqc;
    //   308: aload_0
    //   309: getfield ZK : Lburp/Zbyd;
    //   312: sipush #18907
    //   315: sipush #22364
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   324: aload_0
    //   325: getfield Zv : Lburp/Zzdy;
    //   328: aload_1
    //   329: invokevirtual ZK : ()Z
    //   332: invokevirtual setSelected : (Z)V
    //   335: aload_0
    //   336: aconst_null
    //   337: invokevirtual ZQ : (Ljava/awt/event/ActionEvent;)V
    //   340: aload_0
    //   341: getfield Zq : Lburp/Zzdy;
    //   344: aload_1
    //   345: invokevirtual Z_ : ()Z
    //   348: invokevirtual setSelected : (Z)V
    //   351: aload #6
    //   353: invokevirtual ZM : ()Lburp/Zgvn;
    //   356: invokeinterface Zu : ()Ljava/util/List;
    //   361: astore #17
    //   363: aload #17
    //   365: ifnull -> 428
    //   368: aload #17
    //   370: invokeinterface isEmpty : ()Z
    //   375: ifne -> 428
    //   378: aload #17
    //   380: invokeinterface iterator : ()Ljava/util/Iterator;
    //   385: astore #18
    //   387: aload #18
    //   389: invokeinterface hasNext : ()Z
    //   394: ifeq -> 423
    //   397: aload #18
    //   399: invokeinterface next : ()Ljava/lang/Object;
    //   404: checkcast java/lang/String
    //   407: astore #19
    //   409: aload_0
    //   410: getfield ZA : Lburp/Zedd;
    //   413: aload #19
    //   415: invokevirtual addItem : (Ljava/lang/Object;)V
    //   418: iload #16
    //   420: ifne -> 387
    //   423: iload #16
    //   425: ifne -> 449
    //   428: aload_0
    //   429: getfield ZA : Lburp/Zedd;
    //   432: sipush #18909
    //   435: sipush #1384
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: invokevirtual addItem : (Ljava/lang/Object;)V
    //   444: aload_0
    //   445: iconst_1
    //   446: putfield ZY : Z
    //   449: aload_0
    //   450: getfield ZA : Lburp/Zedd;
    //   453: aload_1
    //   454: invokevirtual Zk : ()Ljava/lang/String;
    //   457: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   460: invokestatic Zwu : ()[Lburp/Zbqc;
    //   463: ifnonnull -> 479
    //   466: iload #16
    //   468: ifeq -> 475
    //   471: iconst_0
    //   472: goto -> 476
    //   475: iconst_1
    //   476: invokestatic Zq : (Z)V
    //   479: return
  }
  
  private void Zo(Zlil paramZlil) {
    Ze5r<Zlil, Zmk5> ze5r = this.ZI.Zp();
    synchronized (ze5r.ZB()) {
      this.ZH.Zb(ze5r);
      int i = ze5r.Zo(paramZlil);
      if (i >= 0)
        this.Zn.getSelectionModel().setSelectionInterval(i, i); 
    } 
  }
  
  public void ZX(Zlil paramZlil) {
    this.ZI.ZX(paramZlil);
    Zo(paramZlil);
  }
  
  public void Zu(Zlil paramZlil) {
    this.ZI.Zu(paramZlil);
    Zo(paramZlil);
  }
  
  public String ZW() {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zn : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_2
    //   12: iload_2
    //   13: iconst_m1
    //   14: if_icmpne -> 36
    //   17: aload_0
    //   18: getfield ZZ : Lburp/Zs1h;
    //   21: aconst_null
    //   22: invokevirtual Zc : (Lburp/Zlil;)V
    //   25: iload_1
    //   26: ifne -> 61
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield ZZ : Lburp/Zs1h;
    //   40: aload_0
    //   41: getfield ZH : Lburp/Zt0n;
    //   44: iload_2
    //   45: invokevirtual Zv : (I)Lburp/Zgd8;
    //   48: checkcast burp/Zlil
    //   51: invokevirtual Zc : (Lburp/Zlil;)V
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: goto -> 80
    //   64: astore_2
    //   65: aload_2
    //   66: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   69: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   72: aload_0
    //   73: getfield ZZ : Lburp/Zs1h;
    //   76: aconst_null
    //   77: invokevirtual Zc : (Lburp/Zlil;)V
    //   80: aload_0
    //   81: getfield ZZ : Lburp/Zs1h;
    //   84: invokevirtual ZE : ()Lburp/Zlil;
    //   87: ifnonnull -> 104
    //   90: sipush #18901
    //   93: sipush #441
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: areturn
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: getfield ZZ : Lburp/Zs1h;
    //   108: aload_0
    //   109: getfield Zq : Lburp/Zzdy;
    //   112: invokevirtual isSelected : ()Z
    //   115: invokevirtual ZP : (Z)V
    //   118: aload_0
    //   119: getfield ZZ : Lburp/Zs1h;
    //   122: aload_0
    //   123: getfield ZA : Lburp/Zedd;
    //   126: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   129: checkcast java/lang/String
    //   132: invokevirtual ZQ : (Ljava/lang/String;)V
    //   135: aload_0
    //   136: getfield ZY : Z
    //   139: ifne -> 159
    //   142: aload_0
    //   143: getfield ZZ : Lburp/Zs1h;
    //   146: invokevirtual Z_ : ()Z
    //   149: ifne -> 174
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: getfield ZZ : Lburp/Zs1h;
    //   163: aconst_null
    //   164: invokevirtual ZQ : (Ljava/lang/String;)V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_0
    //   175: getfield ZK : Lburp/Zbyd;
    //   178: invokevirtual ZW : ()Ljava/lang/String;
    //   181: areturn
    // Exception table:
    //   from	to	target	type
    //   4	61	64	java/lang/Exception
    //   12	29	32	java/lang/Exception
    //   17	54	57	java/lang/Exception
    //   80	100	100	java/lang/Exception
    //   104	152	155	java/lang/Exception
    //   142	167	170	java/lang/Exception
  }
  
  public void Zz(List<String> paramList) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZZ : Lburp/Zs1h;
    //   9: invokevirtual ZG : ()Ljava/util/List;
    //   12: if_acmpne -> 38
    //   15: aload_0
    //   16: getfield ZO : Lburp/Zg85;
    //   19: aload_1
    //   20: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   23: invokevirtual setText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield ZO : Lburp/Zg85;
    //   30: iconst_0
    //   31: invokevirtual setCaretPosition : (I)V
    //   34: iload_2
    //   35: ifeq -> 79
    //   38: aload_1
    //   39: aload_0
    //   40: getfield ZZ : Lburp/Zs1h;
    //   43: invokevirtual ZB : ()Ljava/util/List;
    //   46: if_acmpne -> 72
    //   49: aload_0
    //   50: getfield Zd : Lburp/Zg85;
    //   53: aload_1
    //   54: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield Zd : Lburp/Zg85;
    //   64: iconst_0
    //   65: invokevirtual setCaretPosition : (I)V
    //   68: iload_2
    //   69: ifeq -> 79
    //   72: iconst_0
    //   73: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   76: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   79: return
  }
  
  private void ZK() {
    this.ZV = new ButtonGroup();
    this.Zo = new Ze01();
    this.Za = new Ze01();
    this.Zv = new Zzdy();
    this.Zy = new Zm99();
    this.Zk = new Zmg2();
    this.ZG = new Zmg2();
    this.ZO = new Zg85();
    this.ZD = new Ze01();
    this.Zd = new Zg85();
    this.Zc = new Ze01();
    this.Zg = new Zzdy();
    this.ZP = new Zzdy();
    this.Z_ = new Zbqc();
    this.Zh = new Zl8w();
    this.Zz = new Zm2o();
    this.ZX = new Zl8w();
    this.Zs = new Zmyw();
    this.ZF = new Zbup();
    this.Zi = new Zm99();
    this.Zw = new Zm99();
    this.Zq = new Zzdy();
    this.ZA = new Zedd();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zo.setText(a(18902, -29884));
    this.Zo.setToolTipText(a(18904, -21194));
    this.Zo.addActionListener(new Zltu(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zo, gridBagConstraints);
    this.Za.setText(a(18903, 1865));
    this.Za.setToolTipText(a(18908, 9534));
    this.Za.addActionListener(new Zra4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.Zv.setText(a(18905, -25198));
    this.Zv.addActionListener(new Zgo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zv, gridBagConstraints);
    this.Zy.setText(a(18911, -26732));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Zy, gridBagConstraints);
    this.ZV.add(this.Zk);
    this.Zk.setText(a(18897, 18418));
    this.Zk.addActionListener(new Zzl8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zk, gridBagConstraints);
    this.ZV.add(this.ZG);
    this.ZG.setText(a(18900, -336));
    this.ZG.addActionListener(new Zei(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.ZO.setColumns(25);
    this.ZO.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZO, gridBagConstraints);
    this.ZD.setText(a(18885, -25171));
    this.ZD.addActionListener(new Zz_6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 18;
    add(this.ZD, gridBagConstraints);
    this.Zd.setColumns(25);
    this.Zd.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zd, gridBagConstraints);
    this.Zc.setText(a(18885, -25171));
    this.Zc.addActionListener(new Zsqu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 18;
    add(this.Zc, gridBagConstraints);
    this.Zg.setText(a(18884, -17171));
    this.Zg.addActionListener(new Zskv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Zg, gridBagConstraints);
    this.ZP.setText(a(18886, -22332));
    this.ZP.addActionListener(new Zrwu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZP, gridBagConstraints);
    this.Z_.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Z_, gridBagConstraints);
    this.Zh.setText(a(18898, 17340));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zh, gridBagConstraints);
    this.Zz.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_RULE_EDITOR_RUN_A_MACRO);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zz, gridBagConstraints);
    this.ZX.setText(a(18910, -11505));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.Zs.setLeftComponent(this.ZF);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    add(this.Zs, gridBagConstraints);
    this.Zi.setText(a(18899, 3452));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.Zw.setText(a(18896, -14578));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    add(this.Zw, gridBagConstraints);
    this.Zq.setText(a(18906, 15617));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zq, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    add(this.ZA, gridBagConstraints);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    Zr73 zr73 = new Zr73(this, new Zlil(this.ZI.ZS(), this.ZB, this.ZQ), true, this.ZI, this.ZM, this.Zr, this.Zl, Zt2m.ZF(this), this.ZW, this.ZQ, this.ZJ, this.ZE, this.ZT, this.Zt, this.ZB, this.ZS);
    zr73.setVisible(true);
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    this.ZZ.Zf(this.Zv.isSelected());
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    int i = this.Zn.getSelectedRow();
    if (i == -1)
      return; 
    Zlil zlil = this.ZH.Zv(i);
    if (zlil == null)
      return; 
    Zr73 zr73 = new Zr73(this, zlil, false, this.ZI, this.ZM, this.Zr, this.Zl, Zt2m.ZF(this), this.ZW, this.ZQ, this.ZJ, this.ZE, this.ZT, this.Zt, this.ZB, this.ZS);
    zr73.setVisible(true);
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    this.ZZ.Zc((byte)0);
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    this.ZZ.Zc((byte)1);
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    new Zrhd(window, this.ZM, this.Zu, this, this.ZZ.ZG());
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    new Zrhd(window, this.ZM, this.Zu, this, this.ZZ.ZB());
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    this.ZZ.Zo(this.Zg.isSelected());
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.ZZ.ZX(this.ZP.isSelected());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'kß|.,ßh·@,k1H§JÛQ0_ïíÇn\\bÚàjqShûpÓLl4x¡í+Æõ¤¾¹ò÷<Wk÷ êAÆ<®µÛàu­)é¬ó-5.·ïë±)úÅÛ"«ä×âÓVBG 5üú=<ý'ä|)·ºüà¶.ºM¦ÐùECr®\\tlòÊî«l¦B¼ ^ÒßSðÛªÁÐèÓ÷ðLâ¡@÷xUØX»ÕKSÕ4IÑ4§õ&·÷"olÐÂÝgìÆ1]:Ik·§.\\t(,\\n¼õÝ?dÃ¾)B\\na|[NvîHù«£èL÷\\t%aoyóèIYÅKÚ´õ`>ZÆÂn²8ÜÙ!k¿V\\tN+ãÿ°vyÅSD¶A©Ð²ZÆþeúÏa9NUÌx[÷¨\Í¡=\\f-ª-\\ròFf×,Ý|ÖlÐqÚÉòÆFoóõq1\\bØ÷û¥¢6½»>8âRß~ß<8Z,Ù§S^Þ+~3©²Ò]ü>¶$»&4¨*ÆµmB%âPë¹å\\fhê=^út ôÅ4Ô¬o^õ5>GÑ2YòÅÐü´Ó87Ì·ÀÁï%yoûeáL_È[w¤P} "Z&áÿ^PÈú\\r"Z-tÙ7PR#¿0s8BHjæ}W[±t"­D1½å&D.]Ô~&<'¥hc&½©0\\fý¿þ;Øàsñ"Äþrü =¥²>Èzò-n:s&ÚE¸âWE5ÚÄÚ}sÒñÏv2@1±';Ì¿4T¹³úuâ»ÓVþÿn¥f?h×/\\tßäb1Ån~Pääù¬?b\\fx¿¹D'$PéêqX!Ù»ô ÝIH{n~Öêr-6ê¹$ü¦ê2Aµ@[D<ÖaÅãè-vPJ(f¯ÌÀ±tþlBN­ïK`úcê]j'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #49
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #63
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'cñµ¿Qé}ÒUz³ñß××7K5m¼³ÎV_X'\\r;°QJµÃcß"ØTn­ð¬ÐvXåûJ+HÂUôì5v\\rF'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #99
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
    //   128: putstatic burp/Zbye.a : [Ljava/lang/String;
    //   131: bipush #19
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbye.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #8
    //   219: goto -> 244
    //   222: bipush #59
    //   224: goto -> 244
    //   227: bipush #19
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #9
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49D4) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbye.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */