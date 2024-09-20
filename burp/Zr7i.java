package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;

class Zr7i extends Zrh7 implements Zmgv, Zeq {
  private final Zr73 ZP;
  
  private final Zlil ZA;
  
  private final Zr_4 Zn;
  
  private final Zbnt Zo;
  
  private final Ztwv Zm;
  
  private final Zlr9 Zk;
  
  private final Zxzh ZU;
  
  private final Zbws Zf;
  
  private final Zt_8 ZQ;
  
  private final Zbdf ZK;
  
  private final Zbdf Zp;
  
  private final Zrgd Zz;
  
  private final Zey9 Zw;
  
  private Zz9y Ze;
  
  private Zkg1 ZV;
  
  private Zm2o Zi;
  
  private Zbkc ZZ;
  
  private Ze01 Zv;
  
  private Ze01 ZF;
  
  private Ze01 ZT;
  
  private Zl8w ZH;
  
  private Zm99 ZG;
  
  private Zm99 Zd;
  
  private Zbqc Zl;
  
  private Zm99 ZS;
  
  private Zexh Zc;
  
  private Zbqc ZN;
  
  private Zbup ZE;
  
  private Zmyz ZX;
  
  private Zg85 Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr7i(Zr73 paramZr73, Zlil paramZlil, Zxzh paramZxzh, Zbnt paramZbnt, Window paramWindow, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Zrgd paramZrgd, Zey9 paramZey9) {
    super(paramWindow, true, Zzv7.MACRO_TESTER_UI_DIALOG);
    this.ZP = paramZr73;
    this.ZA = paramZlil;
    this.ZU = paramZxzh;
    this.Zz = paramZrgd;
    this.Zm = paramZtwv;
    this.Zn = paramZr_4;
    this.Zk = paramZlr9;
    this.Zo = paramZbnt;
    this.Zw = paramZey9;
    Zj();
    this.Za.setText(paramZlil.Zs());
    this.ZQ = new Zt_8(paramZlil.Zf());
    this.Zf = new Zbws();
    this.Zf.ZL(this.ZQ);
    this.Zf.Zc(this);
    this.ZE.setViewportView(this.Zf);
    this.ZK = paramZtyg.Zz(this, Zeew.TARGET, true, Zbdf.ZD, Zb9b.Zx);
    this.Zp = paramZtyg.Zz(this, Zeew.TARGET, false, Zbdf.ZU, Zb9b.Zx);
    Zbdx zbdx = paramZgq7.ZP(Zxff.MACRO_TESTER).ZA(this.ZK, a(20418, 7691)).Zp(this.Zp, a(20423, 23648)).Zo().Zl();
    this.ZX.setRightComponent(zbdx);
    Zmse.Zf(this.ZX, 120, 30);
    this.ZX.Za(20);
    setTitle(a(20432, 299));
    setDefaultCloseOperation(0);
    addWindowListener(new Zz6l(this));
    pack();
    Zq(paramWindow);
    SwingUtilities.invokeLater(this::lambda$new$0);
  }
  
  private void Zm(int paramInt) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZQ : Lburp/Zt_8;
    //   9: iload_1
    //   10: invokevirtual Zo : (I)Lburp/Zkg1;
    //   13: putfield ZV : Lburp/Zkg1;
    //   16: aload_0
    //   17: getfield ZV : Lburp/Zkg1;
    //   20: invokevirtual Zo3 : ()Lburp/Zbr;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull -> 53
    //   28: aload_0
    //   29: getfield ZK : Lburp/Zbdf;
    //   32: aconst_null
    //   33: checkcast [B
    //   36: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   39: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   42: aload_2
    //   43: ifnonnull -> 90
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_3
    //   54: aload_0
    //   55: getfield ZV : Lburp/Zkg1;
    //   58: invokevirtual Zod : ()Lburp/Zmzk;
    //   61: aload_0
    //   62: getfield Zw : Lburp/Zey9;
    //   65: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   68: astore #4
    //   70: aload_0
    //   71: getfield ZV : Lburp/Zkg1;
    //   74: invokevirtual Zoe : ()Lburp/Zgsq;
    //   77: astore #5
    //   79: aload_0
    //   80: getfield ZK : Lburp/Zbdf;
    //   83: aload #4
    //   85: aload #5
    //   87: invokevirtual ZA : (Lburp/Zefx;Lburp/Zgsq;)V
    //   90: aload_0
    //   91: getfield ZV : Lburp/Zkg1;
    //   94: ifnonnull -> 105
    //   97: aconst_null
    //   98: goto -> 135
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: getfield ZV : Lburp/Zkg1;
    //   109: getfield Za : Lburp/Zstu;
    //   112: ifnonnull -> 123
    //   115: aconst_null
    //   116: goto -> 135
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: getfield ZV : Lburp/Zkg1;
    //   127: getfield Za : Lburp/Zstu;
    //   130: invokeinterface ZiD : ()[B
    //   135: astore #4
    //   137: aload_0
    //   138: getfield Zp : Lburp/Zbdf;
    //   141: aload #4
    //   143: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   146: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   149: goto -> 160
    //   152: astore_3
    //   153: aload_3
    //   154: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   157: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   160: return
    // Exception table:
    //   from	to	target	type
    //   4	149	152	java/lang/Exception
    //   24	46	49	java/lang/Exception
    //   90	101	101	java/lang/Exception
    //   105	119	119	java/lang/Exception
  }
  
  private void Zj() {
    this.Zl = new Zbqc();
    this.Zv = new Ze01();
    this.ZF = new Ze01();
    this.ZT = new Ze01();
    this.ZG = new Zm99();
    this.Za = new Zg85();
    this.ZX = new Zmyz();
    this.ZE = new Zbup();
    this.Zd = new Zm99();
    this.ZN = new Zbqc();
    this.Zc = new Zexh();
    this.ZS = new Zm99();
    this.ZH = new Zl8w();
    this.ZZ = new Zbkc();
    this.Zi = new Zm2o();
    setDefaultCloseOperation(2);
    this.Zl.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 
        0, 10, 0, 10, 0 };
    this.Zl.setLayout(gridBagLayout1);
    this.Zv.setText(a(20440, -28037));
    this.Zv.addActionListener(this::ZR);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    this.Zl.add(this.Zv, gridBagConstraints);
    this.ZF.setText(a(20435, -3427));
    this.ZF.setToolTipText(a(20436, 12982));
    this.ZF.addActionListener(this::ZB);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zl.add(this.ZF, gridBagConstraints);
    this.ZT.setText(a(20417, 11196));
    this.ZT.setToolTipText(a(20441, 5719));
    this.ZT.addActionListener(this::Ze);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zl.add(this.ZT, gridBagConstraints);
    this.ZG.setText(a(20416, 30242));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zl.add(this.ZG, gridBagConstraints);
    this.Za.setEditable(false);
    this.Za.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zl.add(this.Za, gridBagConstraints);
    this.ZX.setOrientation(0);
    this.ZX.setLeftComponent(this.ZE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zl.add(this.ZX, gridBagConstraints);
    this.Zd.setText(a(20442, -3971));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Zd, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 10, 0 };
    this.ZN.setLayout(gridBagLayout2);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.ZN.add(this.Zc, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    this.ZN.add(this.ZS, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    this.Zl.add(this.ZN, gridBagConstraints);
    this.ZH.setText(a(20447, 2657));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.Zl.add(this.ZH, gridBagConstraints);
    this.ZZ.Zx(a(20431, -13707));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.ZZ, gridBagConstraints);
    this.Zi.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_MACRO_EDITOR_TEST_MACRO);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zl.add(this.Zi, gridBagConstraints);
    getContentPane().add(this.Zl, a(20421, 11603));
    pack();
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    if (this.Ze != null)
      this.Ze.ZC(); 
    this.Ze = null;
    setVisible(false);
    dispose();
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    if (this.Ze != null) {
      if (0 != Zx6o.Zc(this, a(20434, 20255), a(20443, -662), new String[] { a(20420, -4279), a(20419, 28866) }1))
        return; 
      this.Ze.ZC();
    } 
    this.ZV = null;
    this.ZK.ZN((byte[])null, Zgu3.HTTP_REQUEST);
    this.Zp.ZN((byte[])null, Zgu3.HTTP_RESPONSE);
    this.Ze = new Zz9y(this.ZA, this.ZU, this.Zk, new Zbif(this), this.Zo, this.Zw, this.Zn, this.Zz);
    this.ZQ.ZJ(this.Ze.ZQ());
    this.ZT.setEnabled(false);
    this.ZN.setVisible(true);
    this.Zm.Zx(this.Ze);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Ze : Lburp/Zz9y;
    //   8: ifnull -> 21
    //   11: aload_0
    //   12: getfield Ze : Lburp/Zz9y;
    //   15: getfield ZH : Z
    //   18: ifne -> 22
    //   21: return
    //   22: sipush #20433
    //   25: sipush #9285
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: astore_3
    //   32: aload_0
    //   33: getfield Ze : Lburp/Zz9y;
    //   36: getfield Ze : Z
    //   39: ifeq -> 72
    //   42: aload_0
    //   43: getfield Ze : Lburp/Zz9y;
    //   46: getfield ZU : Z
    //   49: ifne -> 72
    //   52: aload_3
    //   53: sipush #20438
    //   56: sipush #10531
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   67: astore_3
    //   68: aload_2
    //   69: ifnonnull -> 148
    //   72: aload_0
    //   73: getfield Ze : Lburp/Zz9y;
    //   76: getfield Ze : Z
    //   79: ifne -> 112
    //   82: aload_0
    //   83: getfield Ze : Lburp/Zz9y;
    //   86: getfield ZU : Z
    //   89: ifeq -> 112
    //   92: aload_3
    //   93: sipush #20445
    //   96: sipush #-9325
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_3
    //   108: aload_2
    //   109: ifnonnull -> 148
    //   112: aload_0
    //   113: getfield Ze : Lburp/Zz9y;
    //   116: getfield Ze : Z
    //   119: ifeq -> 148
    //   122: aload_0
    //   123: getfield Ze : Lburp/Zz9y;
    //   126: getfield ZU : Z
    //   129: ifeq -> 148
    //   132: aload_3
    //   133: sipush #20437
    //   136: sipush #-21302
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   147: astore_3
    //   148: iconst_0
    //   149: aload_0
    //   150: sipush #20446
    //   153: sipush #-2057
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: aload_3
    //   160: iconst_2
    //   161: anewarray java/lang/String
    //   164: dup
    //   165: iconst_0
    //   166: sipush #20439
    //   169: sipush #13053
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: aastore
    //   176: dup
    //   177: iconst_1
    //   178: sipush #20422
    //   181: sipush #12731
    //   184: invokestatic a : (II)Ljava/lang/String;
    //   187: aastore
    //   188: iconst_1
    //   189: invokestatic Zc : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;I)I
    //   192: if_icmpeq -> 196
    //   195: return
    //   196: aload_0
    //   197: getfield ZP : Lburp/Zr73;
    //   200: aload_0
    //   201: getfield Ze : Lburp/Zz9y;
    //   204: invokevirtual ZQ : ()Ljava/util/List;
    //   207: invokevirtual Zc : (Ljava/util/List;)V
    //   210: return
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    Zm(paramInt1);
  }
  
  public Zmzk Zod() {
    return this.ZV.ZL.ZP().Zdz();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a(20444, 11394), Zk97.DESKTOP_OPTIONS_SESSIONS_MACRO_EDITOR_TEST_MACRO, Zt2m.ZF(this));
  }
  
  public Zstu Zos() {
    return this.ZV.Zx;
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public Zstu ZoO() {
    return this.ZV.Za;
  }
  
  public long ZoB() {
    return 0L;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private void lambda$new$0() {
    this.ZF.doClick();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÃBøý°_-Ìæéí7jµû8¤M4RæõËË×`yê§ñJªöàÉ:ÐÒàñÐ&Hx¨ÙW ¨Aï+1ÁÕÞ@BsKfÆóC+ÒTP]Y¥xþ¯$bÅ,ð °£w{BÑÜ.§ãÐëkç×6»Ë3éªÎqÔq-hHóÛ\\tõ]JH3ÆÝè=W5÷æxj~¶þ=kF¡Ðw¬mY^oÌTçµ÷KÛ§Û#k ªµÎ »¿ïE1_YmÒ4\\f4´µñvW·ãÒ¦üïp~Bn>ÐÊÄé(6­­[Ðx%å[fë¾=GA>yTvíqÎ=°\\r=78Ù=Æ(Ö[Ãå3fY«5¥¥ÎÁ¾Äè*ë\\nXÓ$¾vâ*ÜmxFY!,Í¢í>ÀiómêV)ÎãÉ1ÙíÿÀMùhwòÅ\\fb+aAöîõb/[YT:Ìw¿éaSÄ2I\\fWãÀä±î`ú"£âó\\bÏ`NY,¶g\\t\\f¸4«äå¾8ÛÿùØ`så»C<¶Î|CÙËböÙ ÜÓ.ÆvXR¹Ñµ {Xô`ØEÑïûÀX[{Zeÿ%qdMs¿@ãËðÿ©ûýöÚDcSktÇå HwèWHVì^{ïDµ(¡(ßÄð'«óLñ,2,?pN¼Gx*øi¹*=ÔyÆ»#`¦Aa7$Q{«ÇR9 ¼µÅ¯FÁ^ZpÓáÂ¹âÉ\\f?\ÃQ¾<yòY§NÅÍKô*îpüT:\\bMtÿx`wõÕ\\b%ÙÄí%e¼¦jÚýH¯yÿÙº\\r¥4²ÆÆ>R-ÎÖÊ³ó]E;}½ñ©Ì Çv60\\tí»è÷\\bsO¯K=£«L±æµ3PzÙöð÷ÝY;Y'\\fà¦:&`uÚ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #73
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
    //   67: ldc 'ïw­²æ¦¶DÞ¿­\\f!FÇ^B×Òå'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #14
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #69
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
    //   128: putstatic burp/Zr7i.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr7i.b : [Ljava/lang/String;
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
    //   212: bipush #61
    //   214: goto -> 244
    //   217: bipush #50
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #29
    //   239: goto -> 244
    //   242: bipush #115
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
    int i = (paramInt1 ^ 0x4FD7) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */