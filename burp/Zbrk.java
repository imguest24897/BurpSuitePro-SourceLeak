package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbrk extends Zbg2 {
  private final Zkeg Zl;
  
  private final Zbre ZT;
  
  private Zm2o ZJ;
  
  private Zl8w ZN;
  
  private Zl8w Zo;
  
  private Zm99 ZW;
  
  private Zm99 Zg;
  
  private ButtonGroup Zs;
  
  private ButtonGroup Zy;
  
  private Zzdy Zb;
  
  private Zzdy ZL;
  
  private Zm99 Zd;
  
  private Zm9v ZS;
  
  private Zm99 Za;
  
  private Zm9v ZV;
  
  private Zmg2 ZC;
  
  private Zmg2 ZF;
  
  private Zmg2 ZG;
  
  private Zmg2 Zj;
  
  private Zmg2 ZD;
  
  private Zmg2 Zu;
  
  private Zgff ZM;
  
  private Zgff Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbrk(Zkeg paramZkeg, Zbre paramZbre) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zq : ()Z
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zl : Lburp/Zkeg;
    //   12: istore_3
    //   13: aload_0
    //   14: aload_2
    //   15: putfield ZT : Lburp/Zbre;
    //   18: aload_0
    //   19: invokevirtual Zb : ()V
    //   22: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   25: getfield Zk : B
    //   28: tableswitch default -> 88, 0 -> 56, 1 -> 68, 2 -> 80
    //   56: aload_0
    //   57: getfield ZG : Lburp/Zmg2;
    //   60: iconst_1
    //   61: invokevirtual setSelected : (Z)V
    //   64: iload_3
    //   65: ifeq -> 88
    //   68: aload_0
    //   69: getfield ZC : Lburp/Zmg2;
    //   72: iconst_1
    //   73: invokevirtual setSelected : (Z)V
    //   76: iload_3
    //   77: ifeq -> 88
    //   80: aload_0
    //   81: getfield ZF : Lburp/Zmg2;
    //   84: iconst_1
    //   85: invokevirtual setSelected : (Z)V
    //   88: getstatic burp/Zsh9.ZD : Lburp/Zsh9;
    //   91: getfield Zs : B
    //   94: tableswitch default -> 152, 0 -> 120, 1 -> 132, 2 -> 144
    //   120: aload_0
    //   121: getfield Zu : Lburp/Zmg2;
    //   124: iconst_1
    //   125: invokevirtual setSelected : (Z)V
    //   128: iload_3
    //   129: ifeq -> 152
    //   132: aload_0
    //   133: getfield Zj : Lburp/Zmg2;
    //   136: iconst_1
    //   137: invokevirtual setSelected : (Z)V
    //   140: iload_3
    //   141: ifeq -> 152
    //   144: aload_0
    //   145: getfield ZD : Lburp/Zmg2;
    //   148: iconst_1
    //   149: invokevirtual setSelected : (Z)V
    //   152: aload_0
    //   153: getfield ZS : Lburp/Zm9v;
    //   156: iconst_0
    //   157: invokevirtual setVisible : (Z)V
    //   160: aload_0
    //   161: getfield ZV : Lburp/Zm9v;
    //   164: iconst_0
    //   165: invokevirtual setVisible : (Z)V
    //   168: aload_0
    //   169: iconst_2
    //   170: anewarray java/lang/String
    //   173: dup
    //   174: iconst_0
    //   175: sipush #27617
    //   178: sipush #-30008
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: aastore
    //   185: dup
    //   186: iconst_1
    //   187: sipush #27627
    //   190: sipush #-16552
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: aastore
    //   197: putfield ZB : [Ljava/lang/String;
    //   200: aload_0
    //   201: iconst_2
    //   202: newarray boolean
    //   204: dup
    //   205: iconst_0
    //   206: iconst_1
    //   207: bastore
    //   208: dup
    //   209: iconst_1
    //   210: iconst_1
    //   211: bastore
    //   212: putfield ZA : [Z
    //   215: aload_0
    //   216: iconst_1
    //   217: putfield Zh : I
    //   220: return
  }
  
  public void ZC() {
    boolean bool = Zsh9.ZX();
    if (this.ZT.Zv() == Zxtk.XML) {
      this.ZC.setEnabled(false);
      if (this.ZC.isSelected()) {
        this.ZF.setSelected(true);
        ZZ((ActionEvent)null);
      } 
      this.Zj.setEnabled(false);
      if (this.Zj.isSelected()) {
        this.ZD.setSelected(true);
        Zc((ActionEvent)null);
        if (!bool) {
          this.ZC.setEnabled(true);
          this.Zj.setEnabled(true);
          return;
        } 
      } 
      return;
    } 
    this.ZC.setEnabled(true);
    this.Zj.setEnabled(true);
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore_2
    //   4: iload_1
    //   5: lookupswitch default -> 280, 0 -> 32, 1 -> 45
    //   32: aload_0
    //   33: getfield Zl : Lburp/Zkeg;
    //   36: aload_0
    //   37: invokevirtual ZS : (Lburp/Zsic;)Lburp/Zsic;
    //   40: areturn
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iconst_1
    //   46: istore_3
    //   47: aload_0
    //   48: getfield ZF : Lburp/Zmg2;
    //   51: invokevirtual isSelected : ()Z
    //   54: ifeq -> 139
    //   57: aload_0
    //   58: getfield Zb : Lburp/Zzdy;
    //   61: invokevirtual isSelected : ()Z
    //   64: ifeq -> 139
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_0
    //   75: getfield ZM : Lburp/Zgff;
    //   78: invokevirtual getText : ()Ljava/lang/String;
    //   81: invokestatic parseInt : (Ljava/lang/String;)I
    //   84: istore #4
    //   86: iload #4
    //   88: iconst_1
    //   89: if_icmpge -> 104
    //   92: new java/lang/Exception
    //   95: dup
    //   96: invokespecial <init> : ()V
    //   99: athrow
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: getfield ZS : Lburp/Zm9v;
    //   108: iconst_0
    //   109: invokevirtual setVisible : (Z)V
    //   112: goto -> 154
    //   115: astore #4
    //   117: aload #4
    //   119: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   122: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   125: aload_0
    //   126: getfield ZS : Lburp/Zm9v;
    //   129: iconst_1
    //   130: invokevirtual setVisible : (Z)V
    //   133: iconst_0
    //   134: istore_3
    //   135: iload_2
    //   136: ifne -> 154
    //   139: aload_0
    //   140: getfield ZS : Lburp/Zm9v;
    //   143: iconst_0
    //   144: invokevirtual setVisible : (Z)V
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload_0
    //   155: getfield ZD : Lburp/Zmg2;
    //   158: invokevirtual isSelected : ()Z
    //   161: ifeq -> 246
    //   164: aload_0
    //   165: getfield ZL : Lburp/Zzdy;
    //   168: invokevirtual isSelected : ()Z
    //   171: ifeq -> 246
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: aload_0
    //   182: getfield Zv : Lburp/Zgff;
    //   185: invokevirtual getText : ()Ljava/lang/String;
    //   188: invokestatic parseInt : (Ljava/lang/String;)I
    //   191: istore #4
    //   193: iload #4
    //   195: iconst_1
    //   196: if_icmpge -> 211
    //   199: new java/lang/Exception
    //   202: dup
    //   203: invokespecial <init> : ()V
    //   206: athrow
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: aload_0
    //   212: getfield ZV : Lburp/Zm9v;
    //   215: iconst_0
    //   216: invokevirtual setVisible : (Z)V
    //   219: goto -> 261
    //   222: astore #4
    //   224: aload #4
    //   226: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   229: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   232: aload_0
    //   233: getfield ZV : Lburp/Zm9v;
    //   236: iconst_1
    //   237: invokevirtual setVisible : (Z)V
    //   240: iconst_0
    //   241: istore_3
    //   242: iload_2
    //   243: ifne -> 261
    //   246: aload_0
    //   247: getfield ZV : Lburp/Zm9v;
    //   250: iconst_0
    //   251: invokevirtual setVisible : (Z)V
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   260: athrow
    //   261: iload_3
    //   262: ifeq -> 278
    //   265: aload_0
    //   266: getfield Zl : Lburp/Zkeg;
    //   269: aload_0
    //   270: invokevirtual Zh : (Lburp/Zsic;)Lburp/Zsic;
    //   273: areturn
    //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   277: athrow
    //   278: aload_0
    //   279: areturn
    //   280: iconst_0
    //   281: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   284: iload_1
    //   285: i2l
    //   286: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   289: aload_0
    //   290: areturn
    // Exception table:
    //   from	to	target	type
    //   4	41	41	java/lang/Exception
    //   47	67	70	java/lang/Exception
    //   74	112	115	java/lang/Exception
    //   86	100	100	java/lang/Exception
    //   135	147	150	java/lang/Exception
    //   154	174	177	java/lang/Exception
    //   181	219	222	java/lang/Exception
    //   193	207	207	java/lang/Exception
    //   242	254	257	java/lang/Exception
    //   261	274	274	java/lang/Exception
  }
  
  byte Zi() {
    return this.ZG.isSelected() ? 0 : (this.ZC.isSelected() ? 1 : 2);
  }
  
  int Zf() {
    try {
      int i = Integer.parseInt(this.ZM.getText());
      return (i < 1) ? Integer.MAX_VALUE : i;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      return Integer.MAX_VALUE;
    } 
  }
  
  byte Zh() {
    return this.Zu.isSelected() ? 0 : (this.Zj.isSelected() ? 1 : 2);
  }
  
  int Zu() {
    try {
      int i = Integer.parseInt(this.Zv.getText());
      return (i < 1) ? Integer.MAX_VALUE : i;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      return Integer.MAX_VALUE;
    } 
  }
  
  private void Zb() {
    this.Zs = new ButtonGroup();
    this.Zy = new ButtonGroup();
    this.ZG = new Zmg2();
    this.ZC = new Zmg2();
    this.ZF = new Zmg2();
    this.ZL = new Zzdy();
    this.Zv = new Zgff();
    this.Za = new Zm99();
    this.ZV = new Zm9v();
    this.Zu = new Zmg2();
    this.Zj = new Zmg2();
    this.ZD = new Zmg2();
    this.ZW = new Zm99();
    this.ZN = new Zl8w();
    this.ZJ = new Zm2o();
    this.Zo = new Zl8w();
    this.Zb = new Zzdy();
    this.ZM = new Zgff();
    this.Zd = new Zm99();
    this.ZS = new Zm9v();
    this.Zg = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zs.add(this.ZG);
    this.ZG.setText(a(27625, 9332));
    this.ZG.addActionListener(new Zbj8(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.Zs.add(this.ZC);
    this.ZC.setText(a(27620, 32170));
    this.ZC.addActionListener(new Zzdd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.ZC, gridBagConstraints);
    this.Zs.add(this.ZF);
    this.ZF.setText(a(27623, -5152));
    this.ZF.addActionListener(new Zeal(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.ZL.setText(a(27637, -28662));
    this.ZL.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.ZL, gridBagConstraints);
    this.Zv.setColumns(5);
    this.Zv.ZH(Zlw9.NUMBER);
    this.Zv.setEnabled(false);
    this.Zv.addKeyListener(new Zld7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.Za.setText(a(27621, 13437));
    this.Za.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.Za, gridBagConstraints);
    this.ZV.setText(a(27624, 11441));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    add(this.ZV, gridBagConstraints);
    this.Zy.add(this.Zu);
    this.Zu.setText(a(27622, 721));
    this.Zu.addActionListener(new Zbna(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Zu, gridBagConstraints);
    this.Zy.add(this.Zj);
    this.Zj.setText(a(27626, -23805));
    this.Zj.addActionListener(new Zsp6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Zj, gridBagConstraints);
    this.Zy.add(this.ZD);
    this.ZD.setText(a(27631, 21318));
    this.ZD.addActionListener(new Zgix(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.ZD, gridBagConstraints);
    this.ZW.setText(a(27618, 16989));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZW, gridBagConstraints);
    this.ZN.setText(a(27629, 6415));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZN, gridBagConstraints);
    this.ZJ.Zi(Zk97.DESKTOP_SCANNING_REPORTING_RESULTS_HTTP_MESSAGES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZJ, gridBagConstraints);
    this.Zo.setText(a(27630, -19030));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zo, gridBagConstraints);
    this.Zb.setText(a(27628, 16460));
    this.Zb.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zb, gridBagConstraints);
    this.ZM.setColumns(5);
    this.ZM.ZH(Zlw9.NUMBER);
    this.ZM.setEnabled(false);
    this.ZM.addKeyListener(new Zr9l(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZM, gridBagConstraints);
    this.Zd.setText(a(27616, -23880));
    this.Zd.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.ZS.setText(a(27619, 31993));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 11, 0, 0);
    add(this.ZS, gridBagConstraints);
    this.Zg.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zg, gridBagConstraints);
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    this.Zb.setEnabled(false);
    this.ZM.setEnabled(false);
    this.Zd.setEnabled(false);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.Zb.setEnabled(false);
    this.ZM.setEnabled(false);
    this.Zd.setEnabled(false);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    this.Zb.setEnabled(true);
    this.ZM.setEnabled(true);
    this.Zd.setEnabled(true);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    this.ZL.setEnabled(false);
    this.Zv.setEnabled(false);
    this.Za.setEnabled(false);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.ZL.setEnabled(false);
    this.Zv.setEnabled(false);
    this.Za.setEnabled(false);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZL.setEnabled(true);
    this.Zv.setEnabled(true);
    this.Za.setEnabled(true);
  }
  
  private void ZT(KeyEvent paramKeyEvent) {
    this.ZL.setSelected((this.Zv.getText().length() > 0));
  }
  
  private void Zy(KeyEvent paramKeyEvent) {
    this.Zb.setSelected((this.ZM.getText().length() > 0));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Æª«h=ä»W Y3Ó¯ÖxÛÜã(·ÄèiãéÁ¾ÐÐ_XJE3´.úAl×wµaxog&»wxã»º},¥@/ny9\\\rþ^;IË³tÀîÍ+ýÕ>bfë K~µ/T<Ó\\nh\\fþµÌ«­\\b¥Ñiª¥=ø§^j)ã.{8îÒJÙ ³%zÌÛ3/*§\\bJ_br¶'*Ð-ÑæZ0LCËË2Kâ^L¦=±¶Úà åR/&]ÖqÛ×¾¥"Á(G2ÊñùOÃõË¿ûÉÔêCÎô¾¥ikÜ\\fMËWÏLµJ¨åê­)%qÿà¼t\Ù86:ùq\\r"µÆÖ: C³üúÝOo'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #62
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
    //   67: ldc 'YÛÇ{Ö«ðh\\fFôþTm\\bË÷«*Éü'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #24
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #40
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
    //   128: putstatic burp/Zbrk.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbrk.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
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
    //   212: bipush #81
    //   214: goto -> 243
    //   217: bipush #85
    //   219: goto -> 243
    //   222: bipush #33
    //   224: goto -> 243
    //   227: bipush #19
    //   229: goto -> 243
    //   232: bipush #105
    //   234: goto -> 243
    //   237: bipush #93
    //   239: goto -> 243
    //   242: iconst_2
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6BE5) & 0xFFFF;
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
      byte b1 = 24;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbrk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */