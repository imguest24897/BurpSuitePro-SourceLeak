package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ButtonGroup;

class Zbya extends Zbyv implements Zl5s, Zl_2 {
  private final Zs17 ZV;
  
  private final Zxzh Zt;
  
  private final Zz0n ZX;
  
  private final Zt4u ZT;
  
  private final Zerg Zq;
  
  private final Zgb6 Zr;
  
  private final Ztwv ZN;
  
  private final Zr_4 Zj;
  
  private final Ztyg ZD;
  
  private final Zt0_<Zlil> Za;
  
  private final Zbws Zu;
  
  private final Zgq7 Zv;
  
  private final Zlr9 Zb;
  
  private final Ze4m ZG;
  
  private final Zey9 ZF;
  
  private final Zbnt Zi;
  
  private Zm99 ZM;
  
  private Zm99 ZU;
  
  private Zmyw ZY;
  
  private ButtonGroup ZC;
  
  private ButtonGroup ZZ;
  
  private Zzdy Zs;
  
  private Ze01 ZB;
  
  private Ze01 ZI;
  
  private Ze01 Zo;
  
  private Ze01 ZS;
  
  private Zm2o Zg;
  
  private Zm99 Zf;
  
  private Zm99 Zk;
  
  private Zg85 Zw;
  
  private Zg85 ZQ;
  
  private Zmg2 Zc;
  
  private Zmg2 ZK;
  
  private Zmg2 ZW;
  
  private Zmg2 ZJ;
  
  private Zbup ZL;
  
  private Zl8w Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbya(Zs17 paramZs17, boolean paramBoolean, Zxzh paramZxzh, Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgb6 paramZgb6, Zbnt paramZbnt, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Ze4m paramZe4m, Zey9 paramZey9) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZV : Lburp/Zs17;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield Zt : Lburp/Zxzh;
    //   14: aload_0
    //   15: aload #4
    //   17: putfield ZX : Lburp/Zz0n;
    //   20: aload_0
    //   21: aload #5
    //   23: putfield ZT : Lburp/Zt4u;
    //   26: aload_0
    //   27: aload #6
    //   29: putfield Zq : Lburp/Zerg;
    //   32: invokestatic ZI : ()Z
    //   35: aload_0
    //   36: aload #8
    //   38: putfield Zi : Lburp/Zbnt;
    //   41: aload_0
    //   42: aload #7
    //   44: putfield Zr : Lburp/Zgb6;
    //   47: istore #16
    //   49: aload_0
    //   50: aload #9
    //   52: putfield ZN : Lburp/Ztwv;
    //   55: aload_0
    //   56: aload #10
    //   58: putfield Zj : Lburp/Zr_4;
    //   61: aload_0
    //   62: aload #11
    //   64: putfield ZD : Lburp/Ztyg;
    //   67: aload_0
    //   68: aload #12
    //   70: putfield Zv : Lburp/Zgq7;
    //   73: aload_0
    //   74: aload #13
    //   76: putfield Zb : Lburp/Zlr9;
    //   79: aload_0
    //   80: aload #14
    //   82: putfield ZG : Lburp/Ze4m;
    //   85: aload_0
    //   86: aload #15
    //   88: putfield ZF : Lburp/Zey9;
    //   91: aload_0
    //   92: invokevirtual Zl : ()V
    //   95: iload_2
    //   96: ifeq -> 115
    //   99: aload_0
    //   100: getfield Z_ : Lburp/Zl8w;
    //   103: iconst_0
    //   104: invokevirtual setVisible : (Z)V
    //   107: aload_0
    //   108: getfield Zg : Lburp/Zm2o;
    //   111: iconst_0
    //   112: invokevirtual setVisible : (Z)V
    //   115: aload_0
    //   116: new burp/Zt0_
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: putfield Za : Lburp/Zt0_;
    //   126: aload_0
    //   127: new burp/Zbws
    //   130: dup
    //   131: aload_0
    //   132: getfield Za : Lburp/Zt0_;
    //   135: invokespecial <init> : (Lburp/Zztu;)V
    //   138: putfield Zu : Lburp/Zbws;
    //   141: aload_0
    //   142: aload_1
    //   143: invokevirtual ZS : ()Lburp/Zlil;
    //   146: invokevirtual Zm : (Lburp/Zlil;)V
    //   149: aload_0
    //   150: getfield ZL : Lburp/Zbup;
    //   153: aload_0
    //   154: getfield Zu : Lburp/Zbws;
    //   157: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   160: aload_0
    //   161: getfield Zs : Lburp/Zzdy;
    //   164: aload_1
    //   165: invokevirtual ZL : ()Z
    //   168: invokevirtual setSelected : (Z)V
    //   171: aload_0
    //   172: aconst_null
    //   173: invokevirtual ZJ : (Ljava/awt/event/ActionEvent;)V
    //   176: aload_1
    //   177: invokevirtual ZF : ()B
    //   180: lookupswitch default -> 229, 0 -> 208, 1 -> 221
    //   208: aload_0
    //   209: getfield Zc : Lburp/Zmg2;
    //   212: iconst_1
    //   213: invokevirtual setSelected : (Z)V
    //   216: iload #16
    //   218: ifne -> 229
    //   221: aload_0
    //   222: getfield ZJ : Lburp/Zmg2;
    //   225: iconst_1
    //   226: invokevirtual setSelected : (Z)V
    //   229: aload_0
    //   230: getfield Zw : Lburp/Zg85;
    //   233: aload_1
    //   234: invokevirtual ZK : ()Ljava/util/List;
    //   237: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   240: invokevirtual setText : (Ljava/lang/String;)V
    //   243: aload_0
    //   244: getfield Zw : Lburp/Zg85;
    //   247: iconst_0
    //   248: invokevirtual setCaretPosition : (I)V
    //   251: aload_0
    //   252: getfield ZQ : Lburp/Zg85;
    //   255: aload_1
    //   256: invokevirtual Zo : ()Ljava/util/List;
    //   259: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   262: invokevirtual setText : (Ljava/lang/String;)V
    //   265: aload_0
    //   266: getfield ZQ : Lburp/Zg85;
    //   269: iconst_0
    //   270: invokevirtual setCaretPosition : (I)V
    //   273: aload_1
    //   274: invokevirtual Zy : ()Z
    //   277: ifeq -> 293
    //   280: aload_0
    //   281: getfield ZW : Lburp/Zmg2;
    //   284: iconst_1
    //   285: invokevirtual setSelected : (Z)V
    //   288: iload #16
    //   290: ifne -> 301
    //   293: aload_0
    //   294: getfield ZK : Lburp/Zmg2;
    //   297: iconst_1
    //   298: invokevirtual setSelected : (Z)V
    //   301: return
  }
  
  private void Zm(Zlil paramZlil) {
    Ze5r<Zlil, Zmk5> ze5r = this.Zt.Zp();
    this.Za.ZM(ze5r.Za());
    int i = ze5r.Zo(paramZlil);
    if (i >= 0)
      this.Zu.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  public void ZX(Zlil paramZlil) {
    this.Zt.ZX(paramZlil);
    Zm(paramZlil);
  }
  
  public void Zu(Zlil paramZlil) {
    this.Zt.Zu(paramZlil);
    Zm(paramZlil);
  }
  
  public String ZW() {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZK : Lburp/Zmg2;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 33
    //   14: aload_0
    //   15: getfield ZV : Lburp/Zs17;
    //   18: iconst_0
    //   19: invokevirtual ZE : (Z)V
    //   22: iload_1
    //   23: ifeq -> 65
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aload_0
    //   34: getfield ZW : Lburp/Zmg2;
    //   37: invokevirtual isSelected : ()Z
    //   40: ifeq -> 65
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: getfield ZV : Lburp/Zs17;
    //   54: iconst_1
    //   55: invokevirtual ZE : (Z)V
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Zu : Lburp/Zbws;
    //   69: invokevirtual getSelectedRow : ()I
    //   72: istore_2
    //   73: iload_2
    //   74: iconst_m1
    //   75: if_icmpne -> 97
    //   78: aload_0
    //   79: getfield ZV : Lburp/Zs17;
    //   82: aconst_null
    //   83: invokevirtual Z_ : (Lburp/Zlil;)V
    //   86: iload_1
    //   87: ifeq -> 127
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_0
    //   98: getfield ZV : Lburp/Zs17;
    //   101: aload_0
    //   102: getfield Za : Lburp/Zt0_;
    //   105: invokevirtual ZL : ()Ljava/util/List;
    //   108: iload_2
    //   109: invokeinterface get : (I)Ljava/lang/Object;
    //   114: checkcast burp/Zlil
    //   117: invokevirtual Z_ : (Lburp/Zlil;)V
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: goto -> 146
    //   130: astore_2
    //   131: aload_2
    //   132: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   135: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   138: aload_0
    //   139: getfield ZV : Lburp/Zs17;
    //   142: aconst_null
    //   143: invokevirtual Z_ : (Lburp/Zlil;)V
    //   146: aload_0
    //   147: getfield ZV : Lburp/Zs17;
    //   150: invokevirtual ZS : ()Lburp/Zlil;
    //   153: ifnonnull -> 170
    //   156: sipush #-5364
    //   159: sipush #15458
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: areturn
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: aconst_null
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   4	26	29	java/lang/Exception
    //   14	43	46	java/lang/Exception
    //   33	58	61	java/lang/Exception
    //   65	127	130	java/lang/Exception
    //   73	90	93	java/lang/Exception
    //   78	120	123	java/lang/Exception
    //   146	166	166	java/lang/Exception
  }
  
  public void Zz(List<String> paramList) {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZV : Lburp/Zs17;
    //   9: invokevirtual ZK : ()Ljava/util/List;
    //   12: if_acmpne -> 38
    //   15: aload_0
    //   16: getfield Zw : Lburp/Zg85;
    //   19: aload_1
    //   20: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   23: invokevirtual setText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield Zw : Lburp/Zg85;
    //   30: iconst_0
    //   31: invokevirtual setCaretPosition : (I)V
    //   34: iload_2
    //   35: ifne -> 79
    //   38: aload_1
    //   39: aload_0
    //   40: getfield ZV : Lburp/Zs17;
    //   43: invokevirtual Zo : ()Ljava/util/List;
    //   46: if_acmpne -> 72
    //   49: aload_0
    //   50: getfield ZQ : Lburp/Zg85;
    //   53: aload_1
    //   54: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield ZQ : Lburp/Zg85;
    //   64: iconst_0
    //   65: invokevirtual setCaretPosition : (I)V
    //   68: iload_2
    //   69: ifne -> 79
    //   72: iconst_0
    //   73: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   76: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   79: return
  }
  
  private void Zl() {
    this.ZC = new ButtonGroup();
    this.ZZ = new ButtonGroup();
    this.ZI = new Ze01();
    this.ZS = new Ze01();
    this.Zf = new Zm99();
    this.Zc = new Zmg2();
    this.ZJ = new Zmg2();
    this.Zw = new Zg85();
    this.ZB = new Ze01();
    this.ZQ = new Zg85();
    this.Zo = new Ze01();
    this.Zs = new Zzdy();
    this.ZW = new Zmg2();
    this.ZK = new Zmg2();
    this.Zk = new Zm99();
    this.Z_ = new Zl8w();
    this.Zg = new Zm2o();
    this.ZY = new Zmyw();
    this.ZL = new Zbup();
    this.ZM = new Zm99();
    this.ZU = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZI.setText(a(-5371, -22725));
    this.ZI.setToolTipText(a(-5370, 559));
    this.ZI.addActionListener(new Zxzi(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZI, gridBagConstraints);
    this.ZS.setText(a(-5373, 15698));
    this.ZS.setToolTipText(a(-5374, 20070));
    this.ZS.addActionListener(new Zl6h(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZS, gridBagConstraints);
    this.Zf.setText(a(-5361, 31668));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Zf, gridBagConstraints);
    this.ZC.add(this.Zc);
    this.Zc.setText(a(-5365, 9961));
    this.Zc.addActionListener(new Zgpa(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zc, gridBagConstraints);
    this.ZC.add(this.ZJ);
    this.ZJ.setText(a(-5368, 27026));
    this.ZJ.addActionListener(new Zkem(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZJ, gridBagConstraints);
    this.Zw.setColumns(25);
    this.Zw.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zw, gridBagConstraints);
    this.ZB.setText(a(-5363, 15900));
    this.ZB.addActionListener(new Zz5w(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 18;
    add(this.ZB, gridBagConstraints);
    this.ZQ.setColumns(25);
    this.ZQ.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZQ, gridBagConstraints);
    this.Zo.setText(a(-5363, 15900));
    this.Zo.addActionListener(new Zmkh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 18;
    add(this.Zo, gridBagConstraints);
    this.Zs.setText(a(-5372, -17918));
    this.Zs.addActionListener(new Zlj7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.ZZ.add(this.ZW);
    this.ZW.setText(a(-5375, -8628));
    this.ZW.addActionListener(new Zt9o(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZW, gridBagConstraints);
    this.ZZ.add(this.ZK);
    this.ZK.setText(a(-5366, 6043));
    this.ZK.addActionListener(new Zztq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZK, gridBagConstraints);
    this.Zk.setText(a(-5376, 4013));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zk, gridBagConstraints);
    this.Z_.setText(a(-5369, 23367));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Z_, gridBagConstraints);
    this.Zg.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_RULE_EDITOR_RUN_A_POST_REQUEST_MACRO);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 19;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zg, gridBagConstraints);
    this.ZY.setLeftComponent(this.ZL);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    add(this.ZY, gridBagConstraints);
    this.ZM.setText(a(-5362, 5950));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    add(this.ZM, gridBagConstraints);
    this.ZU.setText(a(-5367, 28821));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    add(this.ZU, gridBagConstraints);
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    Zr73 zr73 = new Zr73(this, new Zlil(this.Zt.ZS(), this.Zi, this.Zj), true, this.Zt, this.ZX, this.Zq, this.Zr, Zt2m.ZF(this), this.ZN, this.Zj, this.ZD, this.Zv, this.Zb, this.ZG, this.Zi, this.ZF);
    zr73.setVisible(true);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    int i = this.Zu.getSelectedRow();
    if (i == -1)
      return; 
    Zlil zlil = this.Za.ZL().get(i);
    if (zlil == null)
      return; 
    Zr73 zr73 = new Zr73(this, zlil, false, this.Zt, this.ZX, this.Zq, this.Zr, Zt2m.ZF(this), this.ZN, this.Zj, this.ZD, this.Zv, this.Zb, this.ZG, this.Zi, this.ZF);
    zr73.setVisible(true);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    this.ZV.Zc((byte)0);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    this.ZV.Zc((byte)1);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    new Zrhd(window, this.ZX, this.ZT, this, this.ZV.ZK());
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    new Zrhd(window, this.ZX, this.ZT, this, this.ZV.Zo());
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.ZV.Zv(this.Zs.isSelected());
  }
  
  private void ZY(ActionEvent paramActionEvent) {}
  
  private void Zv(ActionEvent paramActionEvent) {}
  
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
    //   9: ldc 'Ï@³&&\\fâ{ø9m!©ñ]d»«ñªpPOÊÇû;ÿ¾+{q¼ @vðyÖ\\t }ÎÛ%7\\te6ç--1\\b"9\\rf:Þ\\rÆhZØv¸4Bob/b»ûÈÏfi¹{1ªÒV´%&óNí ¾>¦PvC_¸ø([¦Çã"Í«>¿ml{UR½TT$¸R(E¦·Jð]R¥oÿCê_A´E_~§Á«VæR%å?Á\á(:@0¶Ô)Á"ì7ó<\\b¯\\fæÿ°©¸ô']¯ÿ|(Äû\\nd½ ó½êÿ$4ïùÊpêrFíå]QàÞpÇ?\\rÓXÎÛ"evW6Ù4?=>¬¼n9ÏXÿ»&ÓÅ~Ê:yôYÇ'ÌPÅLéÇ!ÏI´ºsÄ.µóhï06©Á%OÕ;ÆS+3xZzaMc{"\\rÁqBæ+wK<k­µ¸£.{¸ÔÎ9Þ°àdy«Z@®>Tâ¢?²ÀÚûptµúHÍEWA¯ñî@J+_téI1£¯Ç$?ÍØkþVGTéO$É7Ké[!î¤°]À]Fº?ðËñ%Ðzx©Y¦{¨7´ßqØ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #62
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
    //   68: ldc ''CctPß|)Idárk\\bÁ¦)ë&Ï- È -¼c^êkÙ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #37
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #17
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
    //   129: putstatic burp/Zbya.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbya.b : [Ljava/lang/String;
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
    //   212: bipush #8
    //   214: goto -> 244
    //   217: bipush #32
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #43
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #51
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
    int i = (paramInt1 ^ 0xFFFFEB06) & 0xFFFF;
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
      byte b1 = 94;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbya.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */