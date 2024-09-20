package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbtb extends Zbg2 implements Zl_2 {
  private final Zz0n ZS;
  
  private final Zt4u Zi;
  
  private final Zzlr Zk;
  
  private final Zbiw ZE;
  
  private final Zmr Zv;
  
  private Zm2o Zq;
  
  private Zl8w Zs;
  
  private Zm99 ZG;
  
  private Zm99 ZK;
  
  private Zm99 ZU;
  
  private Zbup Zd;
  
  private Zzdy Zb;
  
  private Zzdy Zz;
  
  private Zzdy ZC;
  
  private Zzdy Zr;
  
  private Zzdy ZM;
  
  private Zzdy ZX;
  
  private Zzdy Zc;
  
  private Zzdy Zf;
  
  private Zzdy ZY;
  
  private Zzdy Zx;
  
  private Ze01 Zo;
  
  private Ze01 Zl;
  
  private Ze01 ZR;
  
  private Zg85 Zw;
  
  private Zg85 Zu;
  
  private Zg85 ZQ;
  
  private Zbkc ZN;
  
  private Zbqc ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtb(Zz0n paramZz0n, Zt4u paramZt4u, Zzlr paramZzlr, Zbiw paramZbiw) {
    this.ZS = paramZz0n;
    this.Zi = paramZt4u;
    this.Zk = paramZzlr;
    this.ZE = paramZbiw;
    this.Zv = paramZzlr.Zz();
    Zs();
    this.ZX.setSelected(this.Zv.Zp);
    this.Zc.setSelected(this.Zv.Zq);
    this.ZY.setSelected(this.Zv.Zm);
    this.Zf.setSelected(this.Zv.Zg);
    this.ZQ.setText(Zrhd.Zp(this.Zv.ZG));
    this.Zb.setSelected(this.Zv.ZM);
    this.ZC.setSelected(this.Zv.ZC);
    this.Zz.setSelected(this.Zv.Zr);
    this.Zw.setText(Zrhd.Zp(this.Zv.ZZ));
    this.Zr.setSelected(this.Zv.ZW);
    this.ZM.setSelected(this.Zv.ZB);
    this.Zu.setText(Zrhd.Zp(this.Zv.ZN));
    Zm((ActionEvent)null);
    ZZ((ActionEvent)null);
    ZU((ActionEvent)null);
    this.ZB = new String[] { a(-13531, 29901), a(-13523, -835) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  public void ZC() {
    if (this.Zk.Zu())
      this.ZE.Zx(0, a(-13513, -16215), false); 
  }
  
  public void Zz(List<String> paramList) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield Zv : Lburp/Zmr;
    //   9: getfield ZG : Ljava/util/List;
    //   12: if_acmpne -> 38
    //   15: aload_0
    //   16: getfield ZQ : Lburp/Zg85;
    //   19: aload_1
    //   20: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   23: invokevirtual setText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield ZQ : Lburp/Zg85;
    //   30: iconst_0
    //   31: invokevirtual setCaretPosition : (I)V
    //   34: aload_2
    //   35: ifnull -> 102
    //   38: aload_1
    //   39: aload_0
    //   40: getfield Zv : Lburp/Zmr;
    //   43: getfield ZZ : Ljava/util/List;
    //   46: if_acmpne -> 72
    //   49: aload_0
    //   50: getfield Zw : Lburp/Zg85;
    //   53: aload_1
    //   54: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield Zw : Lburp/Zg85;
    //   64: iconst_0
    //   65: invokevirtual setCaretPosition : (I)V
    //   68: aload_2
    //   69: ifnull -> 102
    //   72: aload_1
    //   73: aload_0
    //   74: getfield Zv : Lburp/Zmr;
    //   77: getfield ZN : Ljava/util/List;
    //   80: if_acmpne -> 102
    //   83: aload_0
    //   84: getfield Zu : Lburp/Zg85;
    //   87: aload_1
    //   88: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   91: invokevirtual setText : (Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield Zu : Lburp/Zg85;
    //   98: iconst_0
    //   99: invokevirtual setCaretPosition : (I)V
    //   102: return
  }
  
  private void Zs() {
    this.Zq = new Zm2o();
    this.ZN = new Zbkc();
    this.Zs = new Zl8w();
    this.Zd = new Zbup();
    this.ZZ = new Zbqc();
    this.Zx = new Zzdy();
    this.Zf = new Zzdy();
    this.ZX = new Zzdy();
    this.Zb = new Zzdy();
    this.Zr = new Zzdy();
    this.Zc = new Zzdy();
    this.ZY = new Zzdy();
    this.ZR = new Ze01();
    this.ZQ = new Zg85();
    this.ZC = new Zzdy();
    this.Zz = new Zzdy();
    this.Zw = new Zg85();
    this.Zo = new Ze01();
    this.ZM = new Zzdy();
    this.Zu = new Zg85();
    this.Zl = new Ze01();
    this.ZG = new Zm99();
    this.ZK = new Zm99();
    this.ZU = new Zm99();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zq.Zi(Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_COMPARING_REQUEST_MATCHING);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zq, gridBagConstraints);
    this.ZN.Zx(a(-13521, 21582));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZN, gridBagConstraints);
    this.Zs.setText(a(-13532, -13012));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zs, gridBagConstraints);
    this.Zd.setPreferredSize(new Dimension(1, 1));
    this.ZZ.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    this.ZZ.setLayout(gridBagLayout2);
    this.Zx.setSelected(true);
    this.Zx.setText(a(-13535, -10178));
    this.Zx.addActionListener(new Zxx3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zx, gridBagConstraints);
    this.Zf.setText(a(-13526, 23920));
    this.Zf.addActionListener(new Zz7_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zf, gridBagConstraints);
    this.ZX.setText(a(-13533, -11385));
    this.ZX.addActionListener(new Zb8c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZX, gridBagConstraints);
    this.Zb.setText(a(-13525, -16437));
    this.Zb.addActionListener(new Zr0_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.ZZ.add(this.Zb, gridBagConstraints);
    this.Zr.setText(a(-13527, 23940));
    this.Zr.addActionListener(new Zs4t(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.ZZ.add(this.Zr, gridBagConstraints);
    this.Zc.setText(a(-13524, 9258));
    this.Zc.addActionListener(new Zt91(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zc, gridBagConstraints);
    this.ZY.setText(a(-13536, 10310));
    this.ZY.addActionListener(new Zeqi(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZY, gridBagConstraints);
    this.ZR.setText(a(-13528, 17818));
    this.ZR.addActionListener(new Zt5_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZR, gridBagConstraints);
    this.ZQ.setColumns(20);
    this.ZQ.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZQ, gridBagConstraints);
    this.ZC.setText(a(-13534, -12784));
    this.ZC.addActionListener(new Zb_z(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZC, gridBagConstraints);
    this.Zz.setText(a(-13529, 26516));
    this.Zz.addActionListener(new Zmol(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zz, gridBagConstraints);
    this.Zw.setColumns(20);
    this.Zw.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zw, gridBagConstraints);
    this.Zo.setText(a(-13516, 24802));
    this.Zo.addActionListener(new Zldd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zo, gridBagConstraints);
    this.ZM.setText(a(-13530, 3856));
    this.ZM.addActionListener(new Zb85(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZM, gridBagConstraints);
    this.Zu.setColumns(20);
    this.Zu.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zu, gridBagConstraints);
    this.Zl.setText(a(-13516, 24802));
    this.Zl.addActionListener(new Zei3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.Zl, gridBagConstraints);
    this.ZG.setText(a(-13522, -29996));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    this.ZZ.add(this.ZG, gridBagConstraints);
    this.ZK.setText(a(-13514, 31434));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    this.ZZ.add(this.ZK, gridBagConstraints);
    this.ZU.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZZ.add(this.ZU, gridBagConstraints);
    this.Zd.setViewportView(this.ZZ);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zd, gridBagConstraints);
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    new Zrhd(this.Zk.ZG(), this.ZS, this.Zi, this, this.Zv.ZG);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    new Zrhd(this.Zk.ZG(), this.ZS, this.Zi, this, this.Zv.ZZ);
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    new Zrhd(this.Zk.ZG(), this.ZS, this.Zi, this, this.Zv.ZN);
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    this.Zx.setSelected(true);
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    boolean bool = this.Zc.isSelected();
    this.ZY.setEnabled(bool);
    this.Zf.setEnabled(bool);
    this.ZR.setEnabled(bool);
    this.Zv.Zq = bool;
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    boolean bool = this.Zb.isSelected();
    this.ZC.setEnabled(bool);
    this.Zz.setEnabled(bool);
    this.Zo.setEnabled(bool);
    this.Zv.ZM = bool;
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    boolean bool = this.Zr.isSelected();
    this.ZM.setEnabled(bool);
    this.Zl.setEnabled(bool);
    this.Zv.ZW = bool;
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.Zv.Zp = this.ZX.isSelected();
  }
  
  private void Za(ActionEvent paramActionEvent) {
    this.Zv.Zm = this.ZY.isSelected();
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.Zv.Zg = this.Zf.isSelected();
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    this.Zv.ZC = this.ZC.isSelected();
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    this.Zv.Zr = this.Zz.isSelected();
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    this.Zv.ZB = this.ZM.isSelected();
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.Zk.Zw(this);
      case 1:
        return this.Zk.ZV(this);
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
    //   9: ldc 'òÙæâre,®c×óeçIy{:¸éÏu\\fB¨cÆn5À\\n-.¿B/«t\\fjG¡ÁLçæ+6*óØý8²wp*Ê:¥\\f·ä;òK½Õ\\bÊNä\\ry£<kðíb ¦ÅÃcÖR¨¢g\çØYP5&Ê8ûõfM0É píU¬½ô²ÚÅé½]òAm¼ÿg£NæÚK¼²í²¨Ûd¿ö×ïäÂsÍ¯X*©ÚBÃC¤V\!Öð¹B!¯KéH|MÞþï8ÆåJØoÊÀC·¸vèð_OGs9ß£².£Òû ÇÕ¼Ø4¨õ_¿ÈËê {ðø½H<ñGw\\f0Åáîß^ýXº³ãìÛèa)Ûà¸êË¥/)WÓ%Ü%Þ32Qc]^èHNWÌïR$Ø4A:«÷·£ÅÂ ®èè_4ÀUGNDSä=_"ñô\\f_X4ÃÆ­\\nH6Õ§UÍÐüvÄüo¦?Ã)Á {'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #72
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
    //   68: ldc '7ùZýÁ¦'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #62
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
    //   128: putstatic burp/Zbtb.a : [Ljava/lang/String;
    //   131: bipush #19
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbtb.b : [Ljava/lang/String;
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
    //   212: bipush #38
    //   214: goto -> 244
    //   217: bipush #34
    //   219: goto -> 244
    //   222: bipush #51
    //   224: goto -> 244
    //   227: bipush #56
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #121
    //   239: goto -> 244
    //   242: bipush #30
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
    int i = (paramInt1 ^ 0xFFFFCB26) & 0xFFFF;
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
      char c = '¹';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */