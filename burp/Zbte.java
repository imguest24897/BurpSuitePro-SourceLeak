package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbte extends Zbg2 implements Zl_2 {
  private final Zz0n ZT;
  
  private final Zt4u Z_;
  
  private final Zzlr ZV;
  
  private final Zmr Zu;
  
  private Zm2o Zc;
  
  private Zl8w ZQ;
  
  private Zm99 ZF;
  
  private Zbup ZW;
  
  private ButtonGroup Zo;
  
  private ButtonGroup ZJ;
  
  private Zzdy Zs;
  
  private Zzdy ZE;
  
  private Zzdy Zl;
  
  private Zzdy ZZ;
  
  private Zzdy Zm;
  
  private Zzdy Za;
  
  private Ze01 Zv;
  
  private Ze01 ZG;
  
  private Ze01 ZY;
  
  private Ze01 Zr;
  
  private Zm99 Zk;
  
  private Zm99 Zq;
  
  private Zm99 ZN;
  
  private Zm99 Zd;
  
  private Zg85 ZL;
  
  private Zg85 Zw;
  
  private Zg85 ZU;
  
  private Zg85 ZD;
  
  private Zbkc ZI;
  
  private Zbqc Zt;
  
  private Zmg2 ZC;
  
  private Zmg2 ZP;
  
  private Zmg2 ZM;
  
  private Zmg2 Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbte(Zz0n paramZz0n, Zt4u paramZt4u, Zzlr paramZzlr) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZT : Lburp/Zz0n;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Z_ : Lburp/Zt4u;
    //   14: invokestatic Zp : ()[Lburp/Zbqc;
    //   17: aload_0
    //   18: aload_3
    //   19: putfield ZV : Lburp/Zzlr;
    //   22: aload_0
    //   23: aload_3
    //   24: invokevirtual Zz : ()Lburp/Zmr;
    //   27: putfield Zu : Lburp/Zmr;
    //   30: astore #4
    //   32: aload_0
    //   33: invokevirtual ZD : ()V
    //   36: aload_0
    //   37: getfield Zu : Lburp/Zmr;
    //   40: getfield ZQ : Z
    //   43: ifeq -> 59
    //   46: aload_0
    //   47: getfield Zx : Lburp/Zmg2;
    //   50: iconst_1
    //   51: invokevirtual setSelected : (Z)V
    //   54: aload #4
    //   56: ifnull -> 67
    //   59: aload_0
    //   60: getfield ZM : Lburp/Zmg2;
    //   63: iconst_1
    //   64: invokevirtual setSelected : (Z)V
    //   67: aload_0
    //   68: getfield Zm : Lburp/Zzdy;
    //   71: aload_0
    //   72: getfield Zu : Lburp/Zmr;
    //   75: getfield ZF : Z
    //   78: invokevirtual setSelected : (Z)V
    //   81: aload_0
    //   82: getfield ZD : Lburp/Zg85;
    //   85: aload_0
    //   86: getfield Zu : Lburp/Zmr;
    //   89: getfield Zc : Ljava/util/List;
    //   92: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   95: invokevirtual setText : (Ljava/lang/String;)V
    //   98: aload_0
    //   99: getfield ZZ : Lburp/Zzdy;
    //   102: aload_0
    //   103: getfield Zu : Lburp/Zmr;
    //   106: getfield Zn : Z
    //   109: invokevirtual setSelected : (Z)V
    //   112: aload_0
    //   113: getfield ZU : Lburp/Zg85;
    //   116: aload_0
    //   117: getfield Zu : Lburp/Zmr;
    //   120: getfield ZE : Ljava/util/List;
    //   123: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   126: invokevirtual setText : (Ljava/lang/String;)V
    //   129: aload_0
    //   130: getfield Zu : Lburp/Zmr;
    //   133: getfield Zu : Z
    //   136: ifeq -> 152
    //   139: aload_0
    //   140: getfield ZP : Lburp/Zmg2;
    //   143: iconst_1
    //   144: invokevirtual setSelected : (Z)V
    //   147: aload #4
    //   149: ifnull -> 160
    //   152: aload_0
    //   153: getfield ZC : Lburp/Zmg2;
    //   156: iconst_1
    //   157: invokevirtual setSelected : (Z)V
    //   160: aload_0
    //   161: getfield Zl : Lburp/Zzdy;
    //   164: aload_0
    //   165: getfield Zu : Lburp/Zmr;
    //   168: getfield Zl : Z
    //   171: invokevirtual setSelected : (Z)V
    //   174: aload_0
    //   175: getfield Zw : Lburp/Zg85;
    //   178: aload_0
    //   179: getfield Zu : Lburp/Zmr;
    //   182: getfield ZL : Ljava/util/List;
    //   185: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   188: invokevirtual setText : (Ljava/lang/String;)V
    //   191: aload_0
    //   192: getfield ZE : Lburp/Zzdy;
    //   195: aload_0
    //   196: getfield Zu : Lburp/Zmr;
    //   199: getfield ZH : Z
    //   202: invokevirtual setSelected : (Z)V
    //   205: aload_0
    //   206: getfield ZL : Lburp/Zg85;
    //   209: aload_0
    //   210: getfield Zu : Lburp/Zmr;
    //   213: getfield Ze : Ljava/util/List;
    //   216: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   219: invokevirtual setText : (Ljava/lang/String;)V
    //   222: aload_0
    //   223: getfield Za : Lburp/Zzdy;
    //   226: aload_0
    //   227: getfield Zu : Lburp/Zmr;
    //   230: getfield ZD : Z
    //   233: invokevirtual setSelected : (Z)V
    //   236: aload_0
    //   237: getfield Zs : Lburp/Zzdy;
    //   240: aload_0
    //   241: getfield Zu : Lburp/Zmr;
    //   244: getfield Zv : Z
    //   247: invokevirtual setSelected : (Z)V
    //   250: aload_0
    //   251: aconst_null
    //   252: invokevirtual ZZ : (Ljava/awt/event/ActionEvent;)V
    //   255: aload_0
    //   256: aconst_null
    //   257: invokevirtual Zm : (Ljava/awt/event/ActionEvent;)V
    //   260: aload_0
    //   261: aconst_null
    //   262: invokevirtual Zs : (Ljava/awt/event/ActionEvent;)V
    //   265: aload_0
    //   266: aconst_null
    //   267: invokevirtual ZA : (Ljava/awt/event/ActionEvent;)V
    //   270: aload_0
    //   271: iconst_2
    //   272: anewarray java/lang/String
    //   275: dup
    //   276: iconst_0
    //   277: sipush #-14431
    //   280: sipush #21379
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: aastore
    //   287: dup
    //   288: iconst_1
    //   289: sipush #-14424
    //   292: sipush #23441
    //   295: invokestatic a : (II)Ljava/lang/String;
    //   298: aastore
    //   299: putfield ZB : [Ljava/lang/String;
    //   302: aload_0
    //   303: iconst_2
    //   304: newarray boolean
    //   306: dup
    //   307: iconst_0
    //   308: iconst_1
    //   309: bastore
    //   310: dup
    //   311: iconst_1
    //   312: iconst_1
    //   313: bastore
    //   314: putfield ZA : [Z
    //   317: aload_0
    //   318: iconst_1
    //   319: putfield Zh : I
    //   322: invokestatic Zwu : ()[Lburp/Zbqc;
    //   325: ifnonnull -> 335
    //   328: iconst_1
    //   329: anewarray burp/Zbqc
    //   332: invokestatic Zx : ([Lburp/Zbqc;)V
    //   335: return
  }
  
  public void Zz(List<String> paramList) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield Zu : Lburp/Zmr;
    //   9: getfield Zc : Ljava/util/List;
    //   12: if_acmpne -> 38
    //   15: aload_0
    //   16: getfield ZD : Lburp/Zg85;
    //   19: aload_1
    //   20: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   23: invokevirtual setText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield ZD : Lburp/Zg85;
    //   30: iconst_0
    //   31: invokevirtual setCaretPosition : (I)V
    //   34: aload_2
    //   35: ifnull -> 136
    //   38: aload_1
    //   39: aload_0
    //   40: getfield Zu : Lburp/Zmr;
    //   43: getfield ZE : Ljava/util/List;
    //   46: if_acmpne -> 72
    //   49: aload_0
    //   50: getfield ZU : Lburp/Zg85;
    //   53: aload_1
    //   54: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield ZU : Lburp/Zg85;
    //   64: iconst_0
    //   65: invokevirtual setCaretPosition : (I)V
    //   68: aload_2
    //   69: ifnull -> 136
    //   72: aload_1
    //   73: aload_0
    //   74: getfield Zu : Lburp/Zmr;
    //   77: getfield ZL : Ljava/util/List;
    //   80: if_acmpne -> 106
    //   83: aload_0
    //   84: getfield Zw : Lburp/Zg85;
    //   87: aload_1
    //   88: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   91: invokevirtual setText : (Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield Zw : Lburp/Zg85;
    //   98: iconst_0
    //   99: invokevirtual setCaretPosition : (I)V
    //   102: aload_2
    //   103: ifnull -> 136
    //   106: aload_1
    //   107: aload_0
    //   108: getfield Zu : Lburp/Zmr;
    //   111: getfield Ze : Ljava/util/List;
    //   114: if_acmpne -> 136
    //   117: aload_0
    //   118: getfield ZL : Lburp/Zg85;
    //   121: aload_1
    //   122: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   125: invokevirtual setText : (Ljava/lang/String;)V
    //   128: aload_0
    //   129: getfield ZL : Lburp/Zg85;
    //   132: iconst_0
    //   133: invokevirtual setCaretPosition : (I)V
    //   136: return
  }
  
  private void ZD() {
    this.Zo = new ButtonGroup();
    this.ZJ = new ButtonGroup();
    this.ZQ = new Zl8w();
    this.ZI = new Zbkc();
    this.Zc = new Zm2o();
    this.ZW = new Zbup();
    this.Zt = new Zbqc();
    this.Zm = new Zzdy();
    this.Zr = new Ze01();
    this.ZD = new Zg85();
    this.Zk = new Zm99();
    this.Zx = new Zmg2();
    this.ZM = new Zmg2();
    this.ZZ = new Zzdy();
    this.ZU = new Zg85();
    this.ZY = new Ze01();
    this.Zq = new Zm99();
    this.ZP = new Zmg2();
    this.Zl = new Zzdy();
    this.ZC = new Zmg2();
    this.ZE = new Zzdy();
    this.ZL = new Zg85();
    this.Zw = new Zg85();
    this.ZG = new Ze01();
    this.Zv = new Ze01();
    this.Za = new Zzdy();
    this.ZN = new Zm99();
    this.Zd = new Zm99();
    this.Zs = new Zzdy();
    this.ZF = new Zm99();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.ZQ.setText(a(-14429, 10877));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZQ, gridBagConstraints);
    this.ZI.Zx(a(-14422, 12297));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZI, gridBagConstraints);
    this.Zc.Zi(Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_COMPARING_RESPONSE_COMPARISON);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zc, gridBagConstraints);
    this.ZW.setPreferredSize(new Dimension(1, 1));
    this.Zt.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    this.Zt.setLayout(gridBagLayout2);
    this.Zm.setText(a(-14432, 25723));
    this.Zm.addActionListener(new Zloj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.Zm, gridBagConstraints);
    this.Zr.setText(a(-14421, 16471));
    this.Zr.addActionListener(new Zrbz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.Zr, gridBagConstraints);
    this.ZD.setColumns(20);
    this.ZD.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZD, gridBagConstraints);
    this.Zk.setText(a(-14420, -6329));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.Zt.add(this.Zk, gridBagConstraints);
    this.Zo.add(this.Zx);
    this.Zx.setText(a(-14403, 15163));
    this.Zx.addActionListener(new Zmvd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.Zt.add(this.Zx, gridBagConstraints);
    this.Zo.add(this.ZM);
    this.ZM.setText(a(-14428, -6482));
    this.ZM.addActionListener(new Zm3i(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.Zt.add(this.ZM, gridBagConstraints);
    this.ZZ.setText(a(-14404, 13849));
    this.ZZ.addActionListener(new Zbl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZZ, gridBagConstraints);
    this.ZU.setColumns(20);
    this.ZU.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZU, gridBagConstraints);
    this.ZY.setText(a(-14425, -15516));
    this.ZY.addActionListener(new Zz1c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZY, gridBagConstraints);
    this.Zq.setText(a(-14417, -25825));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.Zt.add(this.Zq, gridBagConstraints);
    this.ZJ.add(this.ZP);
    this.ZP.setText(a(-14418, 12825));
    this.ZP.addActionListener(new Zlij(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.Zt.add(this.ZP, gridBagConstraints);
    this.Zl.setText(a(-14404, 13849));
    this.Zl.addActionListener(new Zgd2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.Zl, gridBagConstraints);
    this.ZJ.add(this.ZC);
    this.ZC.setText(a(-14419, 16614));
    this.ZC.addActionListener(new Zto8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.Zt.add(this.ZC, gridBagConstraints);
    this.ZE.setText(a(-14404, 13849));
    this.ZE.addActionListener(new Zt3n(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZE, gridBagConstraints);
    this.ZL.setColumns(20);
    this.ZL.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZL, gridBagConstraints);
    this.Zw.setColumns(20);
    this.Zw.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.Zw, gridBagConstraints);
    this.ZG.setText(a(-14425, -15516));
    this.ZG.addActionListener(new Zm77(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.ZG, gridBagConstraints);
    this.Zv.setText(a(-14425, -15516));
    this.Zv.addActionListener(new Zgqh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    this.Zt.add(this.Zv, gridBagConstraints);
    this.Za.setText(a(-14427, -21752));
    this.Za.addActionListener(new Zlwe(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.Zt.add(this.Za, gridBagConstraints);
    this.ZN.setText(a(-14426, -27209));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.Zt.add(this.ZN, gridBagConstraints);
    this.Zd.setText(a(-14430, 8590));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.Zt.add(this.Zd, gridBagConstraints);
    this.Zs.setText(a(-14423, 15179));
    this.Zs.addActionListener(new Zgk0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zt.add(this.Zs, gridBagConstraints);
    this.ZF.setText(a(-14401, -3350));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    this.Zt.add(this.ZF, gridBagConstraints);
    this.ZW.setViewportView(this.Zt);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZW, gridBagConstraints);
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    new Zrhd(this.ZV.ZG(), this.ZT, this.Z_, this, this.Zu.Zc);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    boolean bool = this.Zm.isSelected();
    this.ZD.Zt(bool);
    this.Zr.setEnabled(bool);
    this.Zu.ZF = bool;
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    boolean bool = this.ZZ.isSelected();
    this.ZU.Zt(bool);
    this.ZY.setEnabled(bool);
    this.Zu.Zn = bool;
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    new Zrhd(this.ZV.ZG(), this.ZT, this.Z_, this, this.Zu.ZE);
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    boolean bool = this.Zl.isSelected();
    this.Zw.Zt(bool);
    this.ZG.setEnabled(bool);
    this.Zu.Zl = bool;
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    boolean bool = this.ZE.isSelected();
    this.ZL.Zt(bool);
    this.Zv.setEnabled(bool);
    this.Zu.ZH = bool;
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    new Zrhd(this.ZV.ZG(), this.ZT, this.Z_, this, this.Zu.ZL);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    new Zrhd(this.ZV.ZG(), this.ZT, this.Z_, this, this.Zu.Ze);
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.Zu.ZD = this.Za.isSelected();
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    this.Zu.ZQ = this.Zx.isSelected();
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.Zu.ZQ = this.Zx.isSelected();
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    this.Zu.Zu = this.ZP.isSelected();
  }
  
  private void Za(ActionEvent paramActionEvent) {
    this.Zu.Zu = this.ZP.isSelected();
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    this.Zu.Zv = this.Zs.isSelected();
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.ZV.Zw(this);
      case 1:
        return this.ZV.ZV(this);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÕôüÃë"ÍbÇ\\t\\tòS«Ó·NÃ±¬¦±Ý@ÁÀbÄ|ÎDÿÇoêcu1 UÝüç5BÌCÊïéoîJp\\fÕfÿ=Åt{tÉæô£«íä«mZ%BpÀñV")RDK*4£Ç<­T³ã\\t}uo>ÉÒ" uGÜáÙê%ëã!Ú®Ú0GùêV\ßù¡ÿÜ,$ïUÉqáÐã¤ðEpË!¤¢Ú*1\\n²8PH@v\\t\\nL¤ûÎ¿1$ÛGgªìu#Au«Ëªc")ÂÁ \¢à#<Ãè¸qIªõ#ãb:ü MºÖG§·<l]í¶?_\\bA?º\\n~#ãU¸b3$¾}&ì£P)7â ½õ~Ë2ÀéXÃ6V1Éý-w?6NË¦ì#ZzÞö\\tW°¨'Ów»¼9ézIúë'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #66
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
    //   68: ldc 'ªúé¿¬|e\\f£Br±'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #39
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
    //   129: putstatic burp/Zbte.a : [Ljava/lang/String;
    //   132: bipush #19
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbte.b : [Ljava/lang/String;
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
    //   212: bipush #93
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #90
    //   224: goto -> 244
    //   227: bipush #117
    //   229: goto -> 244
    //   232: bipush #117
    //   234: goto -> 244
    //   237: bipush #95
    //   239: goto -> 244
    //   242: bipush #71
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
    int i = (paramInt1 ^ 0xFFFFC7AD) & 0xFFFF;
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
      byte b1 = 83;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbte.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */