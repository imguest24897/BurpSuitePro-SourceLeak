package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbbk extends Zbbv {
  private Zg66 ZS;
  
  private Zzdy Zi;
  
  private Zzdy ZE;
  
  private Zzdy ZV;
  
  private Zzdy Zj;
  
  private Zzdy ZL;
  
  private Zzdy ZP;
  
  private Zedd Zu;
  
  private Zl8w Zs;
  
  private Zm99 ZG;
  
  private Zm99 Zd;
  
  private Zm99 ZD;
  
  private Zm99 Zv;
  
  private Zm99 ZF;
  
  private Zm99 ZI;
  
  private Zm99 ZA;
  
  private Zm99 Zm;
  
  private Zm99 ZK;
  
  private Zm99 ZT;
  
  private Zm99 Zq;
  
  private Zm99 ZR;
  
  private Zbqc Zf;
  
  public Zg85 ZO;
  
  private Zg85 ZJ;
  
  private Zg85 Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbbk(Zz0n paramZz0n, Zt4u paramZt4u, Zbyw paramZbyw, Zr_4 paramZr_4, boolean paramBoolean) {
    super(paramZz0n, paramZt4u, paramZbyw, a(-13736, -28683), paramZr_4, true);
    this.Zg = this.ZS = paramZr_4.<Zgpi>ZH(new Zed5(paramZbyw.ZP().ZM(), this.ZN.ZK()));
    Zi();
    this.ZF.Ze(Zlkk.BURP_TITLE);
    this.ZI.Ze(Zlkk.BURP_TITLE);
    this.ZA.Ze(Zlkk.BURP_TITLE);
    this.Zm.Ze(Zlkk.BURP_TITLE);
    this.ZK.Ze(Zlkk.BURP_TITLE);
    this.ZT.Ze(Zlkk.BURP_TITLE);
    this.Zf.add(this.ZN, a(-13737, 17437));
    this.Zu.addItem(a(-13757, -3295));
    this.Zu.addItem(a(-13753, -20480));
    this.Zu.addItem(a(-13739, -28040));
    this.Zu.addItem(a(-13729, -17794));
    this.Zu.addItem(a(-13747, 17499));
    this.Zu.addItem(a(-13750, 24399));
    this.Zu.setSelectedIndex(1);
    ZN((KeyEvent)null);
    Zt((KeyEvent)null);
    this.ZS.ZDE(Integer.parseInt(this.ZJ.getText()));
    this.ZS.ZAp(this.ZL.isSelected());
    this.ZS.ZAN(this.ZE.isSelected());
    this.ZS.ZAX(this.ZP.isSelected());
    this.ZS.ZAO(this.ZV.isSelected());
    this.ZS.ZAH(this.Zj.isSelected());
    this.ZS.ZAy(this.Zi.isSelected());
    this.ZS.ZJ((byte)(this.Zu.getSelectedIndex() + 1));
    ZJ();
    if (paramBoolean) {
      this.Zu.setEnabled(false);
      this.Zi.setEnabled(false);
      this.ZE.setEnabled(false);
      this.ZV.setEnabled(false);
      this.Zj.setEnabled(false);
      this.ZL.setEnabled(false);
      this.ZP.setEnabled(false);
      this.ZO.setEnabled(false);
      this.Zl.setEnabled(false);
    } 
  }
  
  public void ZB() {
    this.ZS.ZAf(false);
    this.Zw.Z_(this.ZS.Zyv(), true);
  }
  
  private void ZJ() {
    this.Zq.setText(Zlb0.Zl.format(this.ZS.ZAf(true)));
    this.Zw.Z_(this.ZS.Zyv(), true);
  }
  
  private void Zi() {
    this.ZD = new Zm99();
    this.Zl = new Zg85();
    this.Zq = new Zm99();
    this.Zd = new Zm99();
    this.Zu = new Zedd();
    this.ZV = new Zzdy();
    this.ZP = new Zzdy();
    this.ZE = new Zzdy();
    this.ZL = new Zzdy();
    this.Zi = new Zzdy();
    this.Zj = new Zzdy();
    this.ZG = new Zm99();
    this.ZJ = new Zg85();
    this.ZO = new Zg85();
    this.Zv = new Zm99();
    this.ZR = new Zm99();
    this.Zf = new Zbqc();
    this.ZF = new Zm99();
    this.ZI = new Zm99();
    this.ZA = new Zm99();
    this.Zm = new Zm99();
    this.ZK = new Zm99();
    this.ZT = new Zm99();
    this.Zs = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZD.setText(a(-13759, -20565));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZD, gridBagConstraints);
    this.Zl.setColumns(5);
    this.Zl.setText("/");
    this.Zl.addKeyListener(new Zbx2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.anchor = 1280;
    add(this.Zl, gridBagConstraints);
    this.Zq.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 1280;
    add(this.Zq, gridBagConstraints);
    this.Zd.setText(a(-13741, 10427));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.Zu.addActionListener(new Zt5u(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.ZV.setText(a(-13752, 4113));
    this.ZV.addActionListener(new Zkeq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    this.ZP.setText(a(-13731, 23989));
    this.ZP.addActionListener(new Zeax(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZP, gridBagConstraints);
    this.ZE.setText(a(-13732, -19089));
    this.ZE.addActionListener(new Zrew(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    add(this.ZE, gridBagConstraints);
    this.ZL.setText(a(-13734, 7533));
    this.ZL.addActionListener(new Zbfd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZL, gridBagConstraints);
    this.Zi.setSelected(true);
    this.Zi.setText(a(-13751, -27463));
    this.Zi.addActionListener(new Zlqc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.Zi, gridBagConstraints);
    this.Zj.setSelected(true);
    this.Zj.setText(a(-13738, 30967));
    this.Zj.addActionListener(new Zmia(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.Zj, gridBagConstraints);
    this.ZG.setText(a(-13755, 20389));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZG, gridBagConstraints);
    this.ZJ.setColumns(5);
    this.ZJ.setText(a(-13746, -5457));
    this.ZJ.addKeyListener(new Zeth(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = 1280;
    add(this.ZJ, gridBagConstraints);
    this.ZO.setColumns(5);
    this.ZO.setText("*");
    this.ZO.addKeyListener(new Zspp(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.Zv.setText(a(-13756, 5567));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.ZR.setText(a(-13735, 20657));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZR, gridBagConstraints);
    this.Zf.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 32;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Zf, gridBagConstraints);
    this.ZF.setText(a(-13742, 5158));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZF, gridBagConstraints);
    this.ZI.setText(a(-13754, -13301));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZI, gridBagConstraints);
    this.ZA.setText(a(-13758, -20498));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZA, gridBagConstraints);
    this.Zm.setText(a(-13745, -1786));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Zm, gridBagConstraints);
    this.ZK.setText(a(-13740, -5228));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZK, gridBagConstraints);
    this.ZT.setText(a(-13749, -30546));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZT, gridBagConstraints);
    this.Zs.setText(a(-13743, -4063));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zs, gridBagConstraints);
  }
  
  private void Zp(KeyEvent paramKeyEvent) {
    try {
      this.ZS.ZDE(Integer.parseInt(this.ZJ.getText()));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.ZS.ZDE(-1);
    } 
    ZJ();
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    this.ZS.ZAp(this.ZL.isSelected());
    ZJ();
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZE : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 50
    //   14: aload_0
    //   15: getfield Zu : Lburp/Zedd;
    //   18: invokevirtual getSelectedIndex : ()I
    //   21: ifle -> 50
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZL : Lburp/Zzdy;
    //   35: iconst_1
    //   36: invokevirtual setEnabled : (Z)V
    //   39: aload_2
    //   40: ifnonnull -> 73
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   49: athrow
    //   50: aload_0
    //   51: getfield ZL : Lburp/Zzdy;
    //   54: iconst_0
    //   55: invokevirtual setEnabled : (Z)V
    //   58: aload_0
    //   59: getfield ZL : Lburp/Zzdy;
    //   62: iconst_0
    //   63: invokevirtual setSelected : (Z)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield ZS : Lburp/Zg66;
    //   77: aload_0
    //   78: getfield ZE : Lburp/Zzdy;
    //   81: invokevirtual isSelected : ()Z
    //   84: invokeinterface ZAN : (Z)V
    //   89: aload_0
    //   90: invokevirtual ZJ : ()V
    //   93: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/NumberFormatException
    //   14	43	46	java/lang/NumberFormatException
    //   31	66	69	java/lang/NumberFormatException
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    this.ZS.ZAX(this.ZP.isSelected());
    ZJ();
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZV : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 51
    //   14: aload_0
    //   15: getfield Zu : Lburp/Zedd;
    //   18: invokevirtual getSelectedIndex : ()I
    //   21: iconst_1
    //   22: if_icmple -> 51
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   31: athrow
    //   32: aload_0
    //   33: getfield ZP : Lburp/Zzdy;
    //   36: iconst_1
    //   37: invokevirtual setEnabled : (Z)V
    //   40: aload_2
    //   41: ifnonnull -> 74
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   50: athrow
    //   51: aload_0
    //   52: getfield ZP : Lburp/Zzdy;
    //   55: iconst_0
    //   56: invokevirtual setEnabled : (Z)V
    //   59: aload_0
    //   60: getfield ZP : Lburp/Zzdy;
    //   63: iconst_0
    //   64: invokevirtual setSelected : (Z)V
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield ZS : Lburp/Zg66;
    //   78: aload_0
    //   79: getfield ZV : Lburp/Zzdy;
    //   82: invokevirtual isSelected : ()Z
    //   85: invokeinterface ZAO : (Z)V
    //   90: aload_0
    //   91: invokevirtual ZJ : ()V
    //   94: return
    // Exception table:
    //   from	to	target	type
    //   4	25	28	java/lang/NumberFormatException
    //   14	44	47	java/lang/NumberFormatException
    //   32	67	70	java/lang/NumberFormatException
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    this.ZS.ZAH(this.Zj.isSelected());
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.ZS.ZAy(this.Zi.isSelected());
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zu : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: ifle -> 43
    //   14: aload_0
    //   15: getfield ZV : Lburp/Zzdy;
    //   18: iconst_1
    //   19: invokevirtual setEnabled : (Z)V
    //   22: aload_0
    //   23: aconst_null
    //   24: invokevirtual Zs : (Ljava/awt/event/ActionEvent;)V
    //   27: aload_0
    //   28: aconst_null
    //   29: invokevirtual ZT : (Ljava/awt/event/ActionEvent;)V
    //   32: aload_2
    //   33: ifnonnull -> 98
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   42: athrow
    //   43: aload_0
    //   44: getfield ZV : Lburp/Zzdy;
    //   47: iconst_0
    //   48: invokevirtual setEnabled : (Z)V
    //   51: aload_0
    //   52: getfield ZV : Lburp/Zzdy;
    //   55: iconst_0
    //   56: invokevirtual setSelected : (Z)V
    //   59: aload_0
    //   60: getfield ZP : Lburp/Zzdy;
    //   63: iconst_0
    //   64: invokevirtual setEnabled : (Z)V
    //   67: aload_0
    //   68: getfield ZP : Lburp/Zzdy;
    //   71: iconst_0
    //   72: invokevirtual setSelected : (Z)V
    //   75: aload_0
    //   76: getfield ZL : Lburp/Zzdy;
    //   79: iconst_0
    //   80: invokevirtual setEnabled : (Z)V
    //   83: aload_0
    //   84: getfield ZL : Lburp/Zzdy;
    //   87: iconst_0
    //   88: invokevirtual setSelected : (Z)V
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   97: athrow
    //   98: aload_0
    //   99: getfield ZS : Lburp/Zg66;
    //   102: aload_0
    //   103: getfield Zu : Lburp/Zedd;
    //   106: invokevirtual getSelectedIndex : ()I
    //   109: iconst_1
    //   110: iadd
    //   111: i2b
    //   112: invokeinterface ZJ : (B)V
    //   117: aload_0
    //   118: invokevirtual ZJ : ()V
    //   121: return
    // Exception table:
    //   from	to	target	type
    //   4	36	39	java/lang/NumberFormatException
    //   14	91	94	java/lang/NumberFormatException
  }
  
  private void Zt(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zg85;
    //   8: invokevirtual getText : ()Ljava/lang/String;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual length : ()I
    //   16: iconst_1
    //   17: if_icmpne -> 46
    //   20: aload_0
    //   21: getfield ZS : Lburp/Zg66;
    //   24: aload_3
    //   25: invokestatic Zy : (Ljava/lang/String;)[B
    //   28: iconst_0
    //   29: baload
    //   30: invokeinterface Zl : (B)V
    //   35: aload_2
    //   36: ifnonnull -> 120
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   45: athrow
    //   46: aload_3
    //   47: invokevirtual length : ()I
    //   50: iconst_2
    //   51: if_icmpne -> 103
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   60: athrow
    //   61: aload_0
    //   62: getfield ZS : Lburp/Zg66;
    //   65: aload_3
    //   66: bipush #16
    //   68: invokestatic parseByte : (Ljava/lang/String;I)B
    //   71: invokeinterface Zl : (B)V
    //   76: goto -> 120
    //   79: astore #4
    //   81: aload #4
    //   83: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   86: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   89: aload_0
    //   90: getfield ZS : Lburp/Zg66;
    //   93: iconst_0
    //   94: invokeinterface Zl : (B)V
    //   99: aload_2
    //   100: ifnonnull -> 120
    //   103: aload_0
    //   104: getfield ZS : Lburp/Zg66;
    //   107: iconst_0
    //   108: invokeinterface Zl : (B)V
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   119: athrow
    //   120: return
    // Exception table:
    //   from	to	target	type
    //   12	39	42	java/lang/NumberFormatException
    //   20	54	57	java/lang/NumberFormatException
    //   61	76	79	java/lang/NumberFormatException
    //   81	113	116	java/lang/NumberFormatException
  }
  
  private void ZN(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZO : Lburp/Zg85;
    //   8: invokevirtual getText : ()Ljava/lang/String;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual length : ()I
    //   16: iconst_1
    //   17: if_icmpne -> 46
    //   20: aload_0
    //   21: getfield ZS : Lburp/Zg66;
    //   24: aload_3
    //   25: invokestatic Zy : (Ljava/lang/String;)[B
    //   28: iconst_0
    //   29: baload
    //   30: invokeinterface ZX : (B)V
    //   35: aload_2
    //   36: ifnonnull -> 120
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   45: athrow
    //   46: aload_3
    //   47: invokevirtual length : ()I
    //   50: iconst_2
    //   51: if_icmpne -> 103
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   60: athrow
    //   61: aload_0
    //   62: getfield ZS : Lburp/Zg66;
    //   65: aload_3
    //   66: bipush #16
    //   68: invokestatic parseByte : (Ljava/lang/String;I)B
    //   71: invokeinterface ZX : (B)V
    //   76: goto -> 120
    //   79: astore #4
    //   81: aload #4
    //   83: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   86: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   89: aload_0
    //   90: getfield ZS : Lburp/Zg66;
    //   93: iconst_0
    //   94: invokeinterface ZX : (B)V
    //   99: aload_2
    //   100: ifnonnull -> 120
    //   103: aload_0
    //   104: getfield ZS : Lburp/Zg66;
    //   107: iconst_0
    //   108: invokeinterface ZX : (B)V
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   119: athrow
    //   120: return
    // Exception table:
    //   from	to	target	type
    //   12	39	42	java/lang/NumberFormatException
    //   20	54	57	java/lang/NumberFormatException
    //   61	76	79	java/lang/NumberFormatException
    //   81	113	116	java/lang/NumberFormatException
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(-13760, -12766) + a(-13760, -12766), this.ZJ.getText());
    paramZmjc.Zt(a(-13748, 27229) + a(-13748, 27229), this.ZO.getText());
    paramZmjc.Zt(a(-13726, 3509) + a(-13726, 3509), this.Zl.getText());
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    Zzvm zzvm = paramZe9k.Zyi();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zuh.Zv((paramZe9k.Zyi() == this.Zg.Zyi()), Zqf.Zk, zzvm.id);
    this.Zg = this.ZS = (Zg66)paramZe9k;
    this.ZJ.setText(paramZsh8.ZMm(a(-13744, 2606) + a(-13744, 2606)));
    this.ZO.setText(paramZsh8.ZMm(a(-13730, 10463) + a(-13730, 10463)));
    this.Zl.setText(paramZsh8.ZMm(a(-13733, 15245) + a(-13733, 15245)));
    this.ZL.setSelected(this.ZS.ZgG());
    this.ZE.setSelected(this.ZS.Zg7());
    this.ZP.setSelected(this.ZS.Zgp());
    this.ZV.setSelected(this.ZS.Zgk());
    this.Zj.setSelected(this.ZS.ZgU());
    this.Zi.setSelected(this.ZS.ZgO());
    this.Zu.setSelectedIndex(this.ZS.ZgN() - 1);
    this.ZN.Zm(this.ZS.Zgl());
    ZB();
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'öRtl°ÌiX£BÎÞ:LµP¼Ú¬®[/ö,¥Ü|ieÏÒu.t?Ò«¢>|>ïù Ê'Õóx®ÒªØ²ëpd9gUµ°Kr®âfF£HâÇ¦eo0ý»öm"5Ó´ ®pØ\\b°©ËT¼¡\\r&Üó°Ë*BIX9·Ö¸Èf¨K°öwIÌï$ýt0Ã\\f9/_\\rmÿ¡Ê±³vï.pcyGÉã¸æú¤&u1òâ×¯zv¾ùpª-92ÂD#ÔÎ©ãÌ ¨eRÝA\\r{îÈ@Öõë#s}3Ã~Ô£Ì±¨ ÀP¾nËzÃÐQ»ëksWòg¯ÛÁ;â%;D°1`cJ5kzô\\r©`¨ìfTÓ¢¨¶JÏéÞÌ¯.·óû(>+w¤ÎÑ÷XÞõþb®\g©\±Ç"~BRDÀx}ØXÕî@q\\f¯Æ[lDÑá)Ç;Ë³ªýÄ!þiLXäÕú$¼lgÙjñPfCþùµ)~÷í¹Hâ¾¡ùÉÀ.^8|\\n9Ý/WÁÉ»PYæC\ÏÍÝØ*_`kz§è.¼(æ¬Ëåìek´ÔÙ aýQ¥±uzùRV/Í¼q9LUg.`4ï\±ga)Cfõ¸g¤/Ê¯X¾#.kÚ½¡*g-v|y5¬Æ;¹µ¼àP|½º3|U\\r`Vb5:¹9`]¦B¾{ÏªÈcÌ<ÀÏ·ýì"¾]0ý)×LäczÈRú@ ôF=é:nxcûùÎ\\tFá.û'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #49
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
    //   68: ldc 'Ý 26iÐØmoêÔÂÉJ¢kô| )z ´juÇE:p\\fñNaeÕü<BJ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #45
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #111
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
    //   129: putstatic burp/Zbbk.a : [Ljava/lang/String;
    //   132: bipush #33
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbbk.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_4
    //   213: goto -> 243
    //   216: bipush #13
    //   218: goto -> 243
    //   221: bipush #23
    //   223: goto -> 243
    //   226: bipush #37
    //   228: goto -> 243
    //   231: bipush #85
    //   233: goto -> 243
    //   236: bipush #29
    //   238: goto -> 243
    //   241: bipush #103
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCA42) & 0xFFFF;
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
      byte b1 = 85;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */