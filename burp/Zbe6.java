package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.function.Supplier;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbe6 extends Zbb7 {
  private final NumberFormat Zz = NumberFormat.getInstance();
  
  private Zkc7 Zj;
  
  private Zm99 ZW;
  
  private Zm99 ZO;
  
  private ButtonGroup ZR;
  
  private ButtonGroup ZC;
  
  private Zl8w Zr;
  
  private Zm99 ZU;
  
  private Zm99 ZG;
  
  private Zm99 ZS;
  
  private Zm99 Z_;
  
  private Zm99 ZV;
  
  private Zm99 ZK;
  
  private Zm99 Zn;
  
  private Zm99 ZJ;
  
  private Zm99 Zu;
  
  private Zm99 ZE;
  
  private Zm99 ZL;
  
  private Zm99 Zs;
  
  private Zm99 Zq;
  
  private Zmg2 Zm;
  
  private Zmg2 ZX;
  
  public Zmg2 Zv;
  
  private Zmg2 Zk;
  
  public Zgff ZB;
  
  public Zgff Zi;
  
  public Zgff ZT;
  
  public Zgff Zc;
  
  public Zgff Zt;
  
  public Zgff ZD;
  
  public Zgff ZF;
  
  public Zgff Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbe6(Zbyw paramZbyw, boolean paramBoolean, Zr_4 paramZr_4) {
    super(paramZbyw, paramZr_4);
    this.Zg = this.Zj = paramZr_4.<Zgpi>ZH(new Zggk(paramZbyw.ZP().ZM()));
    this.Zz.setGroupingUsed(false);
    this.Zz.setMaximumFractionDigits(127);
    this.Zz.setMaximumIntegerDigits(127);
    ZH();
    ZQ();
    ZM();
    Zt(0);
    Zz(0);
    ZZ(0);
    this.Zd.addKeyListener(new Zrld(this));
    this.Zu.Ze(Zlkk.BURP_TITLE);
    this.ZE.Ze(Zlkk.BURP_TITLE);
    this.ZL.Ze(Zlkk.BURP_TITLE);
    this.ZB.setName(a(10728, -21880));
    this.Zd.setName(a(10731, 23249));
    ZN();
    if (paramBoolean) {
      this.Zk.setEnabled(false);
      this.Zv.setEnabled(false);
    } 
  }
  
  private static int ZV(String paramString) {
    double d = Double.parseDouble(paramString);
    String str = Integer.toString((int)d);
    return str.length();
  }
  
  public void ZB(Supplier<byte[]> paramSupplier, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZB : Lburp/Zgff;
    //   4: invokevirtual getText : ()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: getfield Zd : Lburp/Zgff;
    //   12: invokevirtual getText : ()Ljava/lang/String;
    //   15: astore #4
    //   17: aload_3
    //   18: ifnull -> 35
    //   21: aload_3
    //   22: invokevirtual isEmpty : ()Z
    //   25: ifeq -> 159
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   34: athrow
    //   35: aload #4
    //   37: ifnull -> 62
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   46: athrow
    //   47: aload #4
    //   49: invokevirtual isEmpty : ()Z
    //   52: ifeq -> 159
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   61: athrow
    //   62: aload_1
    //   63: invokeinterface get : ()Ljava/lang/Object;
    //   68: checkcast [B
    //   71: invokestatic Zl : ([B)Ljava/util/List;
    //   74: astore #5
    //   76: aload #5
    //   78: invokeinterface isEmpty : ()Z
    //   83: ifeq -> 91
    //   86: return
    //   87: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   90: athrow
    //   91: aload #5
    //   93: iload_2
    //   94: invokeinterface get : (I)Ljava/lang/Object;
    //   99: checkcast java/lang/String
    //   102: astore #6
    //   104: aload #6
    //   106: invokestatic ZO : (Ljava/lang/String;)Z
    //   109: ifeq -> 159
    //   112: aload_0
    //   113: getfield ZB : Lburp/Zgff;
    //   116: aload #6
    //   118: invokevirtual setText : (Ljava/lang/String;)V
    //   121: aload_0
    //   122: getfield Zj : Lburp/Zkc7;
    //   125: aload #6
    //   127: invokeinterface ZCS : (Ljava/lang/String;)V
    //   132: aload_0
    //   133: getfield Zd : Lburp/Zgff;
    //   136: aload #6
    //   138: invokevirtual setText : (Ljava/lang/String;)V
    //   141: aload_0
    //   142: getfield Zj : Lburp/Zkc7;
    //   145: aload #6
    //   147: invokeinterface ZCa : (Ljava/lang/String;)V
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   158: athrow
    //   159: return
    // Exception table:
    //   from	to	target	type
    //   17	28	31	java/lang/NumberFormatException
    //   21	40	43	java/lang/NumberFormatException
    //   35	55	58	java/lang/NumberFormatException
    //   76	87	87	java/lang/NumberFormatException
    //   104	152	155	java/lang/NumberFormatException
  }
  
  private void ZN() {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zm : Lburp/Zmg2;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 59
    //   14: aload_0
    //   15: getfield Zs : Lburp/Zm99;
    //   18: aload_0
    //   19: getfield Zz : Ljava/text/NumberFormat;
    //   22: ldc2_w 1.1
    //   25: invokevirtual format : (D)Ljava/lang/String;
    //   28: invokevirtual setText : (Ljava/lang/String;)V
    //   31: aload_0
    //   32: getfield Zq : Lburp/Zm99;
    //   35: aload_0
    //   36: getfield Zz : Ljava/text/NumberFormat;
    //   39: ldc2_w 9.876543211234568E8
    //   42: invokevirtual format : (D)Ljava/lang/String;
    //   45: invokevirtual setText : (Ljava/lang/String;)V
    //   48: aload_1
    //   49: ifnonnull -> 198
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   58: athrow
    //   59: iconst_1
    //   60: invokestatic toHexString : (I)Ljava/lang/String;
    //   63: astore_2
    //   64: aload_2
    //   65: invokevirtual length : ()I
    //   68: aload_0
    //   69: getfield Zz : Ljava/text/NumberFormat;
    //   72: invokevirtual getMinimumIntegerDigits : ()I
    //   75: if_icmpge -> 89
    //   78: aload_2
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: astore_2
    //   85: aload_1
    //   86: ifnonnull -> 64
    //   89: aload_2
    //   90: invokevirtual length : ()I
    //   93: aload_0
    //   94: getfield Zz : Ljava/text/NumberFormat;
    //   97: invokevirtual getMaximumIntegerDigits : ()I
    //   100: if_icmple -> 120
    //   103: aload_2
    //   104: aload_2
    //   105: invokevirtual length : ()I
    //   108: aload_0
    //   109: getfield Zz : Ljava/text/NumberFormat;
    //   112: invokevirtual getMaximumIntegerDigits : ()I
    //   115: isub
    //   116: invokevirtual substring : (I)Ljava/lang/String;
    //   119: astore_2
    //   120: aload_0
    //   121: getfield Zs : Lburp/Zm99;
    //   124: aload_2
    //   125: invokevirtual setText : (Ljava/lang/String;)V
    //   128: ldc -889275714
    //   130: invokestatic toHexString : (I)Ljava/lang/String;
    //   133: astore_2
    //   134: aload_2
    //   135: invokevirtual length : ()I
    //   138: aload_0
    //   139: getfield Zz : Ljava/text/NumberFormat;
    //   142: invokevirtual getMinimumIntegerDigits : ()I
    //   145: if_icmpge -> 159
    //   148: aload_2
    //   149: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   154: astore_2
    //   155: aload_1
    //   156: ifnonnull -> 134
    //   159: aload_2
    //   160: invokevirtual length : ()I
    //   163: aload_0
    //   164: getfield Zz : Ljava/text/NumberFormat;
    //   167: invokevirtual getMaximumIntegerDigits : ()I
    //   170: if_icmple -> 190
    //   173: aload_2
    //   174: aload_2
    //   175: invokevirtual length : ()I
    //   178: aload_0
    //   179: getfield Zz : Ljava/text/NumberFormat;
    //   182: invokevirtual getMaximumIntegerDigits : ()I
    //   185: isub
    //   186: invokevirtual substring : (I)Ljava/lang/String;
    //   189: astore_2
    //   190: aload_0
    //   191: getfield Zq : Lburp/Zm99;
    //   194: aload_2
    //   195: invokevirtual setText : (Ljava/lang/String;)V
    //   198: return
    // Exception table:
    //   from	to	target	type
    //   4	52	55	java/lang/NumberFormatException
  }
  
  private void ZH() {
    this.ZR = new ButtonGroup();
    this.ZC = new ButtonGroup();
    this.ZU = new Zm99();
    this.ZG = new Zm99();
    this.Z_ = new Zm99();
    this.ZB = new Zgff();
    this.Zd = new Zgff();
    this.Zi = new Zgff();
    this.ZV = new Zm99();
    this.Zt = new Zgff();
    this.ZK = new Zm99();
    this.ZD = new Zgff();
    this.Zn = new Zm99();
    this.ZT = new Zgff();
    this.ZJ = new Zm99();
    this.Zc = new Zgff();
    this.Zk = new Zmg2();
    this.Zv = new Zmg2();
    this.ZS = new Zm99();
    this.ZF = new Zgff();
    this.ZL = new Zm99();
    this.Zm = new Zmg2();
    this.ZX = new Zmg2();
    this.Zs = new Zm99();
    this.Zq = new Zm99();
    this.Zu = new Zm99();
    this.ZE = new Zm99();
    this.ZW = new Zm99();
    this.ZO = new Zm99();
    this.Zr = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZU.setText(a(10726, 24362));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZU, gridBagConstraints);
    this.ZG.setText(a(10723, -418));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZG, gridBagConstraints);
    this.Z_.setText(a(10737, -18060));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    add(this.Z_, gridBagConstraints);
    this.ZB.setColumns(20);
    this.ZB.setText("0");
    this.ZB.ZH(Zlw9.NUMBER);
    this.ZB.addKeyListener(new Zlts(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZB, gridBagConstraints);
    this.Zd.setColumns(20);
    this.Zd.ZH(Zlw9.NUMBER);
    this.Zd.addKeyListener(new Zti1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.Zi.setColumns(20);
    this.Zi.ZH(Zlw9.NUMBER);
    this.Zi.setEnabled(false);
    this.Zi.addKeyListener(new Zxgm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zi, gridBagConstraints);
    this.ZV.setText(a(10727, 2839));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    this.Zt.setColumns(5);
    this.Zt.setText("0");
    this.Zt.ZH(Zlw9.NUMBER);
    this.Zt.addKeyListener(new Zxj9(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zt, gridBagConstraints);
    this.ZK.setText(a(10725, -2045));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    add(this.ZK, gridBagConstraints);
    this.ZD.setColumns(5);
    this.ZD.setText("0");
    this.ZD.ZH(Zlw9.NUMBER);
    this.ZD.addKeyListener(new Zr6u(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZD, gridBagConstraints);
    this.Zn.setText(a(10743, -32125));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 0, 10);
    add(this.Zn, gridBagConstraints);
    this.ZT.setColumns(5);
    this.ZT.setText("0");
    this.ZT.ZH(Zlw9.NUMBER);
    this.ZT.addKeyListener(new Zlmb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZT, gridBagConstraints);
    this.ZJ.setText(a(10750, 1754));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 1280;
    add(this.ZJ, gridBagConstraints);
    this.Zc.setColumns(5);
    this.Zc.setText("0");
    this.Zc.ZH(Zlw9.NUMBER);
    this.Zc.addKeyListener(new Zghh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zc, gridBagConstraints);
    this.ZR.add(this.Zk);
    this.Zk.setSelected(true);
    this.Zk.setText(a(10748, -8047));
    this.Zk.addActionListener(new Zi_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.Zk, gridBagConstraints);
    this.ZR.add(this.Zv);
    this.Zv.setText(a(10711, -24136));
    this.Zv.addActionListener(new Zrl1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.Zv, gridBagConstraints);
    this.ZS.setText(a(10721, 4749));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    add(this.ZS, gridBagConstraints);
    this.ZF.setColumns(20);
    this.ZF.setText("1");
    this.ZF.ZH(Zlw9.NUMBER);
    this.ZF.addKeyListener(new Zthn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZF, gridBagConstraints);
    this.ZL.setText(a(10745, 1128));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZL, gridBagConstraints);
    this.ZC.add(this.Zm);
    this.Zm.setSelected(true);
    this.Zm.setText(a(10741, 2028));
    this.Zm.addActionListener(new Zgpj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.Zm, gridBagConstraints);
    this.ZC.add(this.ZX);
    this.ZX.setText(a(10751, -20636));
    this.ZX.addActionListener(new Zlw5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.ZX, gridBagConstraints);
    this.Zs.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.Zs, gridBagConstraints);
    this.Zq.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 32;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.Zq, gridBagConstraints);
    this.Zu.setText(a(10747, 1022));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(2, 0, 5, 0);
    add(this.Zu, gridBagConstraints);
    this.ZE.setText(a(10709, 16376));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 5, 0);
    add(this.ZE, gridBagConstraints);
    this.ZW.setText(a(10733, 13566));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.ZW, gridBagConstraints);
    this.ZO.setText(a(10740, 2383));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.ZO, gridBagConstraints);
    this.Zr.setText(a(10749, -21757));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zr, gridBagConstraints);
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    boolean bool = this.ZX.isSelected();
    try {
      this.Zj.ZW6(bool);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      this.Zt.setEnabled(!bool);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.ZT.setEnabled(!bool);
    try {
      this.Zj.ZCn(Zy(bool, this.ZF));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZCn("0");
    } 
    try {
      this.Zj.ZCa(Zy(bool, this.Zd));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZCa("0");
    } 
    try {
      this.Zj.ZCS(Zy(bool, this.ZB));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZCS("0");
    } 
    Zv();
    ZN();
  }
  
  private String Zy(boolean paramBoolean, Zg85 paramZg85) {
    String str = paramZg85.getText().trim();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return !paramBoolean ? str : (new BigInteger(str, 16)).toString();
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    Zv((ActionEvent)null);
  }
  
  private void ZT(KeyEvent paramKeyEvent) {
    byte b = Byte.MAX_VALUE;
    try {
      b = Byte.parseByte(this.ZT.getText());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    ZZ(b);
  }
  
  private void ZZ(int paramInt) {
    byte b = (byte)paramInt;
    try {
      if (b < this.Zz.getMinimumFractionDigits()) {
        this.Zt.setText(Byte.toString(b));
        this.Zj.ZL(b);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zj.ZW(b);
    this.Zz.setMaximumFractionDigits(b);
    ZN();
  }
  
  private void ZX(KeyEvent paramKeyEvent) {
    byte b = 0;
    try {
      b = Byte.parseByte(this.Zt.getText());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    Zz(b);
  }
  
  private void Zz(int paramInt) {
    byte b = (byte)paramInt;
    try {
      if (b > this.Zz.getMaximumFractionDigits()) {
        this.ZT.setText(Byte.toString(b));
        this.Zj.ZW(b);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zj.ZL(b);
    this.Zz.setMinimumFractionDigits(b);
    ZN();
  }
  
  private void ZB(KeyEvent paramKeyEvent) {
    byte b = Byte.MAX_VALUE;
    try {
      b = Byte.parseByte(this.Zc.getText());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    Zt(b);
  }
  
  private void Zt(int paramInt) {
    byte b = (byte)paramInt;
    try {
      if (b < this.Zz.getMinimumIntegerDigits()) {
        this.ZD.setText(Byte.toString(b));
        this.Zj.ZH(b);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zj.Zv(b);
    this.Zz.setMaximumIntegerDigits(b);
    ZN();
  }
  
  private void Zv(KeyEvent paramKeyEvent) {
    byte b = 0;
    try {
      b = Byte.parseByte(this.ZD.getText());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    Zx(b);
  }
  
  private void Zx(int paramInt) {
    byte b = (byte)paramInt;
    try {
      if (b > this.Zz.getMaximumIntegerDigits()) {
        this.Zc.setText(Byte.toString(b));
        this.Zj.Zv(b);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zj.ZH(b);
    this.Zz.setMinimumIntegerDigits(b);
    ZN();
  }
  
  private void Zn(KeyEvent paramKeyEvent) {
    ZE();
  }
  
  private void ZE() {
    try {
      this.Zj.ZNR(Integer.parseInt(this.Zi.getText()));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZNR(0);
    } 
    Zv();
  }
  
  private void ZI(KeyEvent paramKeyEvent) {
    ZM();
  }
  
  private void ZM() {
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      this.Zj.ZCn(Zy(!this.Zm.isSelected(), this.ZF));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZCn("0");
    } 
    Zv();
  }
  
  private void ZS(KeyEvent paramKeyEvent) {
    ZB();
  }
  
  private void ZB() {
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      this.Zj.ZCa(Zy(!this.Zm.isSelected(), this.Zd));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZCa("0");
    } 
    Zv();
  }
  
  private void ZL(KeyEvent paramKeyEvent) {
    ZQ();
  }
  
  private void ZQ() {
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      this.Zj.ZCS(Zy(!this.Zm.isSelected(), this.ZB));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zj.ZCS("0");
    } 
    Zv();
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    this.ZF.setEnabled(false);
    this.Zi.setEnabled(true);
    this.Zj.ZWs(this.Zv.isSelected());
    Zv();
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    this.ZF.setEnabled(true);
    this.Zi.setEnabled(false);
    this.Zj.ZWs(this.Zv.isSelected());
    Zv();
  }
  
  private void Zv() {
    this.Zj.ZyK();
    this.Zw.Z_(this.Zj.Zyv(), false);
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(10720, -9170) + a(10720, -9170), this.ZB.getText());
    paramZmjc.Zt(a(10722, -30154) + a(10722, -30154), this.Zd.getText());
    paramZmjc.Zt(a(10734, -30171) + a(10734, -30171), this.ZF.getText());
    paramZmjc.Zt(a(10735, -12645) + a(10735, -12645), this.Zi.getText());
    paramZmjc.Zt(a(10729, 29584) + a(10729, 29584), this.ZD.getText());
    paramZmjc.Zt(a(10742, 26288) + a(10742, 26288), this.Zc.getText());
    paramZmjc.Zt(a(10724, -26277) + a(10724, -26277), this.Zt.getText());
    paramZmjc.Zt(a(10732, -28484) + a(10732, -28484), this.ZT.getText());
  }
  
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
    //   28: if_acmpne -> 39
    //   31: iconst_1
    //   32: goto -> 40
    //   35: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   38: athrow
    //   39: iconst_0
    //   40: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   43: aload #5
    //   45: getfield id : B
    //   48: i2l
    //   49: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   52: aload_0
    //   53: aload_0
    //   54: aload_1
    //   55: checkcast burp/Zkc7
    //   58: dup_x1
    //   59: putfield Zj : Lburp/Zkc7;
    //   62: putfield Zg : Lburp/Ze9k;
    //   65: aload_0
    //   66: getfield ZB : Lburp/Zgff;
    //   69: aload_2
    //   70: iload_3
    //   71: sipush #10736
    //   74: sipush #-29403
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: swap
    //   81: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   86: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   91: invokevirtual setText : (Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield Zd : Lburp/Zgff;
    //   98: aload_2
    //   99: iload_3
    //   100: sipush #10708
    //   103: sipush #13154
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: swap
    //   110: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   115: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   120: invokevirtual setText : (Ljava/lang/String;)V
    //   123: aload_0
    //   124: getfield ZF : Lburp/Zgff;
    //   127: aload_2
    //   128: iload_3
    //   129: sipush #10744
    //   132: sipush #-18186
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: swap
    //   139: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   144: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokevirtual setText : (Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield Zi : Lburp/Zgff;
    //   156: aload_2
    //   157: iload_3
    //   158: sipush #10739
    //   161: sipush #-20557
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: swap
    //   168: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   173: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   178: invokevirtual setText : (Ljava/lang/String;)V
    //   181: aload_0
    //   182: getfield ZD : Lburp/Zgff;
    //   185: aload_2
    //   186: iload_3
    //   187: sipush #10738
    //   190: sipush #-18783
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: swap
    //   197: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   202: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   207: invokevirtual setText : (Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield Zc : Lburp/Zgff;
    //   214: aload_2
    //   215: iload_3
    //   216: sipush #10710
    //   219: sipush #-20705
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: swap
    //   226: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   231: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   236: invokevirtual setText : (Ljava/lang/String;)V
    //   239: aload_0
    //   240: getfield Zt : Lburp/Zgff;
    //   243: aload_2
    //   244: iload_3
    //   245: sipush #10730
    //   248: sipush #24110
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: swap
    //   255: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   260: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   265: invokevirtual setText : (Ljava/lang/String;)V
    //   268: aload_0
    //   269: getfield ZT : Lburp/Zgff;
    //   272: aload_2
    //   273: iload_3
    //   274: sipush #10746
    //   277: sipush #-18831
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: swap
    //   284: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   289: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   294: invokevirtual setText : (Ljava/lang/String;)V
    //   297: aload_0
    //   298: getfield Zj : Lburp/Zkc7;
    //   301: invokeinterface ZvJ : ()Z
    //   306: ifeq -> 334
    //   309: aload_0
    //   310: getfield Zv : Lburp/Zmg2;
    //   313: iconst_1
    //   314: invokevirtual setSelected : (Z)V
    //   317: aload_0
    //   318: aconst_null
    //   319: invokevirtual Zy : (Ljava/awt/event/ActionEvent;)V
    //   322: aload #4
    //   324: ifnonnull -> 354
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   333: athrow
    //   334: aload_0
    //   335: getfield Zk : Lburp/Zmg2;
    //   338: iconst_1
    //   339: invokevirtual setSelected : (Z)V
    //   342: aload_0
    //   343: aconst_null
    //   344: invokevirtual ZT : (Ljava/awt/event/ActionEvent;)V
    //   347: goto -> 354
    //   350: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   353: athrow
    //   354: aload_0
    //   355: getfield Zz : Ljava/text/NumberFormat;
    //   358: aload_0
    //   359: getfield Zj : Lburp/Zkc7;
    //   362: invokeinterface ZvK : ()B
    //   367: invokevirtual setMinimumIntegerDigits : (I)V
    //   370: aload_0
    //   371: getfield Zz : Ljava/text/NumberFormat;
    //   374: aload_0
    //   375: getfield Zj : Lburp/Zkc7;
    //   378: invokeinterface Zv5 : ()B
    //   383: invokevirtual setMaximumIntegerDigits : (I)V
    //   386: aload_0
    //   387: getfield Zz : Ljava/text/NumberFormat;
    //   390: aload_0
    //   391: getfield Zj : Lburp/Zkc7;
    //   394: invokeinterface ZvP : ()B
    //   399: invokevirtual setMinimumFractionDigits : (I)V
    //   402: aload_0
    //   403: getfield Zz : Ljava/text/NumberFormat;
    //   406: aload_0
    //   407: getfield Zj : Lburp/Zkc7;
    //   410: invokeinterface Zvv : ()B
    //   415: invokevirtual setMaximumFractionDigits : (I)V
    //   418: aload_0
    //   419: getfield Zj : Lburp/Zkc7;
    //   422: invokeinterface ZvX : ()Z
    //   427: ifeq -> 455
    //   430: aload_0
    //   431: getfield ZX : Lburp/Zmg2;
    //   434: iconst_1
    //   435: invokevirtual setSelected : (Z)V
    //   438: aload_0
    //   439: aconst_null
    //   440: invokevirtual Zv : (Ljava/awt/event/ActionEvent;)V
    //   443: aload #4
    //   445: ifnonnull -> 475
    //   448: goto -> 455
    //   451: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   454: athrow
    //   455: aload_0
    //   456: getfield Zm : Lburp/Zmg2;
    //   459: iconst_1
    //   460: invokevirtual setSelected : (Z)V
    //   463: aload_0
    //   464: aconst_null
    //   465: invokevirtual ZN : (Ljava/awt/event/ActionEvent;)V
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   474: athrow
    //   475: aload_0
    //   476: invokevirtual ZN : ()V
    //   479: return
    // Exception table:
    //   from	to	target	type
    //   13	35	35	java/lang/NumberFormatException
    //   40	327	330	java/lang/NumberFormatException
    //   309	347	350	java/lang/NumberFormatException
    //   354	448	451	java/lang/NumberFormatException
    //   430	468	471	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '#õjq\\fõ¢/á¼ñtÈÕ°ÊNÇUúýäyÛp[d_\\tqã&Õ_î)\\r]¶Ü¨Ú3\|XØðÖq#e|MúóÇè»^\\tN99#R«ØC`dc² ï\\rAÄjÂêHxáí[X©×ºoô1%èm¯31èr,ëêÍB~=þ~ûZ\\n/5R*_h×ßì=7 ÃKÚóÞQ¸HÔ*þãæ\\bY°¸ìùyL\\f1wò\MwÐV¦ã¤¿ä¸Öx¦åtZ¹?Ï:#ÑXLHì/Ww^¸ÆLqùv¡R6}e¼Xk¾ÙÒ 8B§w ëÚAáráÞ)eoÔwU@\\f.-ÔJÅ¦Ä¹+þsXL®7³SZS¿¸ðN-ÔnnRX:^Ùh¼£}nET å+±Vi%QÉ®%¨²Ñ`×ÖOöÐÏ\\nþÊçìGiE²=&òZýÌs8§ñÒ\\r¸ªÃçk ¬sôØ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #34
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
    //   68: ldc '*~þVÃ¿'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
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
    //   129: putstatic burp/Zbe6.a : [Ljava/lang/String;
    //   132: bipush #36
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbe6.b : [Ljava/lang/String;
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
    //   212: bipush #121
    //   214: goto -> 244
    //   217: bipush #9
    //   219: goto -> 244
    //   222: bipush #119
    //   224: goto -> 244
    //   227: bipush #76
    //   229: goto -> 244
    //   232: bipush #62
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #49
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
    int i = (paramInt1 ^ 0x29F5) & 0xFFFF;
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
      byte b1 = 99;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */