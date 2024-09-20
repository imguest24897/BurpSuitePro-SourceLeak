package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import javax.swing.ButtonGroup;
import javax.swing.text.AbstractDocument;

public class Zgol extends Zbqc implements Zevz {
  private static final AtomicInteger ZN;
  
  private static final Zze2 ZX;
  
  private final Ze7o ZQ;
  
  private final Zz6x Zc;
  
  private final Zt_2 Zd;
  
  private final Zbws ZB;
  
  private final List<Zbf8> Zx;
  
  private Zbqc Zy;
  
  private Zm99 Zi;
  
  private Zm99 ZS;
  
  private Zm99 ZR;
  
  private Zzdy Zu;
  
  private Zzdy ZW;
  
  private Zzdy Za;
  
  private Zzdy Zv;
  
  private Zzdy ZF;
  
  private Zzdy Zw;
  
  private Zm99 Zb;
  
  private Zm99 Zm;
  
  private ButtonGroup ZA;
  
  private Zm99 Zz;
  
  private Zm99 ZC;
  
  private Zm99 Zr;
  
  private ButtonGroup Zk;
  
  private Zmg2 ZL;
  
  private Zmg2 Zh;
  
  private Zmg2 ZZ;
  
  private Zmg2 ZD;
  
  private Zmg2 ZE;
  
  private Zbup Zo;
  
  private Zg85 Zn;
  
  private Zgfo ZI;
  
  private Zgfo ZM;
  
  private Zl8w Zq;
  
  private Zgfo ZK;
  
  private Zg85 ZP;
  
  private Zbkc ZT;
  
  private static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgol(Ze7o paramZe7o, Zz6x paramZz6x) {
    this.ZQ = paramZe7o;
    this.Zc = paramZz6x;
    Zg();
    Zz();
    this.Zq.setText(paramZz6x.Z_);
    this.Zx = new ArrayList<>();
    this.Zd = new Zt_2(this.Zx);
    this.ZB = new Zbws(this.Zd);
    this.ZB.setName(a(-31609, 9998));
    this.ZB.Zk(new Zk2d(this));
    this.Zo.setViewportView(this.ZB);
    Stream.<Zm99>of(new Zm99[] { this.Zb, this.Zm }).forEach(this::lambda$new$0);
    this.ZK.ZI();
    String str = ZS();
    this.ZI.ZI();
    this.ZM.ZI();
    Zw();
    ZB(paramZz6x);
    if (Zbqc.Zwu() == null)
      Zs("AyRlUc"); 
  }
  
  private void Zz() {
    setName(a(-31592, -7929));
    this.ZL.setName(a(-31608, 9306));
    this.Zw.setName(a(-31586, 14977));
    this.ZK.setName(a(-31590, -16748));
  }
  
  private void ZB(Zz6x paramZz6x) {
    if (paramZz6x.Zu) {
      this.ZL.setEnabled(false);
      this.Zr.setEnabled(false);
      this.ZP.setEnabled(false);
      this.Zw.setEnabled(false);
      this.ZK.setEnabled(false);
      this.ZF.setEnabled(false);
      this.ZI.setEnabled(false);
      this.ZC.setEnabled(false);
      this.Zh.setEnabled(false);
      this.ZD.setEnabled(false);
      this.ZZ.setEnabled(false);
      this.ZM.setEnabled(false);
      this.Zz.setEnabled(false);
    } 
  }
  
  private void Zw() {
    AbstractDocument abstractDocument1 = (AbstractDocument)this.ZK.getDocument();
    AbstractDocument abstractDocument2 = (AbstractDocument)this.ZI.getDocument();
    AbstractDocument abstractDocument3 = (AbstractDocument)this.ZM.getDocument();
    abstractDocument1.setDocumentFilter(Zsmk.ZS);
    abstractDocument2.setDocumentFilter(Zsmk.ZS);
    abstractDocument3.setDocumentFilter(Zsmk.ZS);
  }
  
  public Zeuf ZL() {
    return Zeuf.CHART;
  }
  
  public Zze2 Zx() {
    return ZX;
  }
  
  public String ZP() {
    return a(-31587, -287);
  }
  
  public Component ZZ() {
    return this;
  }
  
  public void Zu(List<Zbf8> paramList) {
    int i = this.ZB.convertRowIndexToModel(this.ZB.getSelectedRow());
    int j = this.ZB.getSelectedColumn();
    Zbf8 zbf8 = (i == -1) ? this.Zx.stream().filter(Zbf8::Zb).findFirst().orElse(null) : this.Zx.get(i);
    this.Zx.clear();
    this.Zx.addAll(paramList);
    this.Zd.fireTableDataChanged();
    if (zbf8 != null)
      Zl(zbf8, i, j); 
  }
  
  private void Zl(Zbf8 paramZbf8, int paramInt1, int paramInt2) {
    int i = paramZbf8.Zn.Z_();
    int j = this.Zx.indexOf(paramZbf8);
    String str = ZS();
    if (j != -1) {
      this.ZQ.Zw(i);
      if (paramInt1 != -1) {
        this.ZB.changeSelection(this.ZB.convertRowIndexToView(j), paramInt2, false, false);
        if (str != null) {
          if (i != 0)
            this.ZQ.Zw(0); 
          return;
        } 
      } 
      return;
    } 
    if (i != 0)
      this.ZQ.Zw(0); 
  }
  
  public void ZV() {
    this.ZE.setSelected(true);
  }
  
  public void Zd() {
    this.ZL.setSelected(true);
    if (Zsw8.ZP(this.ZP.getText()))
      this.ZP.setText(String.format(a(-31607, 25372), new Object[] { Integer.valueOf(ZN.incrementAndGet()) })); 
  }
  
  public void ZE() {
    this.Zh.setEnabled(true);
    this.ZD.setEnabled(true);
    this.ZZ.setEnabled(true);
    this.ZM.setEnabled(true);
  }
  
  public void Zf() {
    this.Zh.setEnabled(false);
    this.ZD.setEnabled(false);
    this.ZZ.setEnabled(false);
    this.ZM.setEnabled(false);
  }
  
  public void ZD() {
    this.ZQ.Zt(this.ZP.getText());
    this.ZQ.Zl(this.ZK.ZE());
    this.ZQ.Zr(this.ZI.ZE());
    this.ZQ.Zb(this.ZM.ZE());
    this.ZQ.Zt(this.Zu.isSelected());
    this.ZQ.ZU(this.ZW.isSelected());
    this.ZQ.ZR(this.Za.isSelected());
    this.ZQ.ZS(this.Zv.isSelected());
    this.ZQ.ZI(this.Zn.getText());
  }
  
  private void ZW() {
    if (!this.ZL.isSelected() && !this.Zc.Zu)
      this.ZQ.Zh(); 
  }
  
  public void Zq(Ztwh paramZtwh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lburp/Zg85;
    //   4: aload_1
    //   5: invokevirtual Zz : ()Ljava/lang/String;
    //   8: invokevirtual setText : (Ljava/lang/String;)V
    //   11: invokestatic ZS : ()Ljava/lang/String;
    //   14: aload_0
    //   15: getfield Zw : Lburp/Zzdy;
    //   18: aload_1
    //   19: invokevirtual Zw : ()Z
    //   22: invokevirtual setSelected : (Z)V
    //   25: aload_0
    //   26: getfield ZK : Lburp/Zgfo;
    //   29: aload_1
    //   30: invokevirtual ZY : ()I
    //   33: invokevirtual ZM : (I)V
    //   36: aload_0
    //   37: getfield ZF : Lburp/Zzdy;
    //   40: aload_1
    //   41: invokevirtual ZK : ()Z
    //   44: invokevirtual setSelected : (Z)V
    //   47: astore_2
    //   48: aload_0
    //   49: getfield ZI : Lburp/Zgfo;
    //   52: aload_1
    //   53: invokevirtual Zf : ()I
    //   56: invokevirtual ZM : (I)V
    //   59: aload_0
    //   60: getfield Zh : Lburp/Zmg2;
    //   63: aload_1
    //   64: invokevirtual ZK : ()Z
    //   67: invokevirtual setEnabled : (Z)V
    //   70: aload_0
    //   71: getfield ZD : Lburp/Zmg2;
    //   74: aload_1
    //   75: invokevirtual ZK : ()Z
    //   78: invokevirtual setEnabled : (Z)V
    //   81: aload_0
    //   82: getfield ZZ : Lburp/Zmg2;
    //   85: aload_1
    //   86: invokevirtual ZK : ()Z
    //   89: invokevirtual setEnabled : (Z)V
    //   92: aload_0
    //   93: getfield ZM : Lburp/Zgfo;
    //   96: aload_1
    //   97: invokevirtual ZK : ()Z
    //   100: invokevirtual setEnabled : (Z)V
    //   103: aload_1
    //   104: invokevirtual Zy : ()Z
    //   107: ifeq -> 129
    //   110: aload_0
    //   111: getfield ZD : Lburp/Zmg2;
    //   114: iconst_1
    //   115: invokevirtual setSelected : (Z)V
    //   118: aload_2
    //   119: ifnull -> 167
    //   122: iconst_5
    //   123: anewarray burp/Zbqc
    //   126: invokestatic Zr : ([Lburp/Zbqc;)V
    //   129: aload_1
    //   130: invokevirtual ZB : ()I
    //   133: ifle -> 159
    //   136: aload_0
    //   137: getfield ZZ : Lburp/Zmg2;
    //   140: iconst_1
    //   141: invokevirtual setSelected : (Z)V
    //   144: aload_0
    //   145: getfield ZM : Lburp/Zgfo;
    //   148: aload_1
    //   149: invokevirtual ZB : ()I
    //   152: invokevirtual ZM : (I)V
    //   155: aload_2
    //   156: ifnull -> 167
    //   159: aload_0
    //   160: getfield Zh : Lburp/Zmg2;
    //   163: iconst_1
    //   164: invokevirtual setSelected : (Z)V
    //   167: aload_0
    //   168: getfield Zu : Lburp/Zzdy;
    //   171: aload_1
    //   172: invokevirtual Zc : ()Z
    //   175: invokevirtual setSelected : (Z)V
    //   178: aload_0
    //   179: getfield ZW : Lburp/Zzdy;
    //   182: aload_1
    //   183: invokevirtual ZW : ()Z
    //   186: invokevirtual setSelected : (Z)V
    //   189: aload_0
    //   190: getfield Za : Lburp/Zzdy;
    //   193: aload_1
    //   194: invokevirtual ZQ : ()Z
    //   197: invokevirtual setSelected : (Z)V
    //   200: aload_0
    //   201: getfield Zv : Lburp/Zzdy;
    //   204: aload_1
    //   205: invokevirtual Zo : ()Z
    //   208: invokevirtual setSelected : (Z)V
    //   211: aload_0
    //   212: getfield Zn : Lburp/Zg85;
    //   215: aload_1
    //   216: invokevirtual ZO : ()Ljava/util/List;
    //   219: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   224: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   229: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   234: sipush #-31610
    //   237: sipush #-27086
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   246: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   251: checkcast java/lang/String
    //   254: invokevirtual setText : (Ljava/lang/String;)V
    //   257: aload_0
    //   258: getfield ZW : Lburp/Zzdy;
    //   261: aload_1
    //   262: invokevirtual Zc : ()Z
    //   265: invokevirtual setEnabled : (Z)V
    //   268: aload_0
    //   269: getfield Za : Lburp/Zzdy;
    //   272: aload_1
    //   273: invokevirtual Zc : ()Z
    //   276: invokevirtual setEnabled : (Z)V
    //   279: aload_0
    //   280: getfield Zv : Lburp/Zzdy;
    //   283: aload_1
    //   284: invokevirtual Zc : ()Z
    //   287: invokevirtual setEnabled : (Z)V
    //   290: aload_0
    //   291: getfield Zn : Lburp/Zg85;
    //   294: aload_1
    //   295: invokevirtual Zc : ()Z
    //   298: ifeq -> 312
    //   301: aload_1
    //   302: invokevirtual Zo : ()Z
    //   305: ifeq -> 312
    //   308: iconst_1
    //   309: goto -> 313
    //   312: iconst_0
    //   313: invokevirtual setEnabled : (Z)V
    //   316: return
  }
  
  private void Zg() {
    this.Zk = new ButtonGroup();
    this.ZA = new ButtonGroup();
    this.ZT = new Zbkc();
    this.Zq = new Zl8w();
    this.Zo = new Zbup();
    this.ZE = new Zmg2();
    this.Zi = new Zm99();
    this.ZS = new Zm99();
    this.ZL = new Zmg2();
    this.ZR = new Zm99();
    this.Zr = new Zm99();
    this.ZP = new Zg85();
    this.Zw = new Zzdy();
    this.ZK = new Zgfo();
    this.ZF = new Zzdy();
    this.ZI = new Zgfo();
    this.ZC = new Zm99();
    this.Zh = new Zmg2();
    this.ZD = new Zmg2();
    this.ZZ = new Zmg2();
    this.ZM = new Zgfo();
    this.Zz = new Zm99();
    this.Zu = new Zzdy();
    this.ZW = new Zzdy();
    this.Za = new Zzdy();
    this.Zy = new Zbqc();
    this.Zv = new Zzdy();
    this.Zb = new Zm99();
    this.Zm = new Zm99();
    this.Zn = new Zg85();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZT.Zx(a(-31585, -14740));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZT, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zq, gridBagConstraints);
    this.Zo.setHorizontalScrollBarPolicy(31);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zo, gridBagConstraints);
    this.Zk.add(this.ZE);
    this.ZE.setSelected(true);
    this.ZE.setText(a(-31589, 22522));
    this.ZE.addActionListener(new Zmgj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZE, gridBagConstraints);
    this.Zi.setText(a(-31611, 30073));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    add(this.Zi, gridBagConstraints);
    this.ZS.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    add(this.ZS, gridBagConstraints);
    this.Zk.add(this.ZL);
    this.ZL.setText(a(-31593, 12389));
    this.ZL.addActionListener(new Zgys(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZL, gridBagConstraints);
    this.ZR.setText(a(-31596, -120));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 23;
    add(this.ZR, gridBagConstraints);
    this.Zr.setText(a(-31588, -6670));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 21;
    add(this.Zr, gridBagConstraints);
    this.ZP.setColumns(30);
    this.ZP.addMouseListener(new Zeu5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZP, gridBagConstraints);
    this.Zw.setText(a(-31594, -9417));
    this.Zw.addActionListener(new Zbpc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.Zw, gridBagConstraints);
    this.ZK.setColumns(5);
    this.ZK.addMouseListener(new Zere(this));
    this.ZK.addKeyListener(new Zk5z(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 23;
    add(this.ZK, gridBagConstraints);
    this.ZF.setText(a(-31615, -14924));
    this.ZF.addActionListener(new Zg5j(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.ZF, gridBagConstraints);
    this.ZI.setColumns(5);
    this.ZI.addMouseListener(new Zzzg(this));
    this.ZI.addKeyListener(new Zzkc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 23;
    add(this.ZI, gridBagConstraints);
    this.ZC.setText(a(-31605, 4620));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 5, 0, 0);
    add(this.ZC, gridBagConstraints);
    this.ZA.add(this.Zh);
    this.Zh.setSelected(true);
    this.Zh.setText(a(-31603, 12453));
    this.Zh.setEnabled(false);
    this.Zh.addActionListener(new Zlgz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 21;
    add(this.Zh, gridBagConstraints);
    this.ZA.add(this.ZD);
    this.ZD.setText(a(-31591, 29014));
    this.ZD.setEnabled(false);
    this.ZD.addActionListener(new Zg4g(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 21;
    add(this.ZD, gridBagConstraints);
    this.ZA.add(this.ZZ);
    this.ZZ.setText(a(-31602, -5459));
    this.ZZ.setEnabled(false);
    this.ZZ.addActionListener(new Zmgd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 21;
    add(this.ZZ, gridBagConstraints);
    this.ZM.setColumns(5);
    this.ZM.setEnabled(false);
    this.ZM.addMouseListener(new Zts1(this));
    this.ZM.addKeyListener(new Ztis(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.Zz.setText(a(-31614, -30150));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 5, 0, 0);
    add(this.Zz, gridBagConstraints);
    this.Zu.setText(a(-31616, 15440));
    this.Zu.addActionListener(new Zk8y(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.Zu, gridBagConstraints);
    this.ZW.setSelected(true);
    this.ZW.setText(a(-31601, 3300));
    this.ZW.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.ZW, gridBagConstraints);
    this.Za.setText(a(-31604, -12673));
    this.Za.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.Za, gridBagConstraints);
    this.Zy.setLayout(new GridBagLayout());
    this.Zv.setAlignmentY(0.0F);
    this.Zv.setEnabled(false);
    this.Zv.addActionListener(new Zmx4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.Zy.add(this.Zv, gridBagConstraints);
    this.Zb.setHorizontalAlignment(2);
    this.Zb.setText(a(-31595, 16495));
    this.Zb.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(1, 2, 0, 0);
    this.Zy.add(this.Zb, gridBagConstraints);
    this.Zm.setHorizontalAlignment(2);
    this.Zm.setText(a(-31612, 2792));
    this.Zm.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(1, 2, 0, 0);
    this.Zy.add(this.Zm, gridBagConstraints);
    this.Zn.setColumns(20);
    this.Zn.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(2, 0, 0, 0);
    this.Zy.add(this.Zn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 21;
    add(this.Zy, gridBagConstraints);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.ZQ.Zs();
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.ZQ.Zh();
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    ZW();
    this.ZQ.ZM(this.Zw.isSelected());
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    ZW();
    this.ZQ.Zj(this.ZF.isSelected());
  }
  
  private void Zw(MouseEvent paramMouseEvent) {
    ZW();
  }
  
  private void ZD(MouseEvent paramMouseEvent) {
    ZW();
  }
  
  private void Zi(MouseEvent paramMouseEvent) {
    ZW();
  }
  
  private void Zv(KeyEvent paramKeyEvent) {
    if (!this.Zw.isSelected()) {
      this.Zw.setSelected(true);
      this.ZQ.ZM(true);
    } 
  }
  
  private void ZB(KeyEvent paramKeyEvent) {
    if (!this.ZF.isSelected()) {
      this.ZF.setSelected(true);
      this.ZQ.Zj(true);
    } 
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    ZW();
    this.ZQ.Zb();
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    ZW();
    this.ZQ.Zg();
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    ZW();
    this.ZQ.ZN();
  }
  
  private void ZH(KeyEvent paramKeyEvent) {
    if (!this.ZZ.isSelected()) {
      this.ZZ.setSelected(true);
      this.ZQ.ZN();
    } 
  }
  
  private void ZL(MouseEvent paramMouseEvent) {
    ZW();
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    this.Zn.setEnabled(this.Zv.isSelected());
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    boolean bool = this.Zu.isSelected();
    this.ZW.setEnabled(bool);
    this.Za.setEnabled(bool);
    this.Zv.setEnabled(bool);
    this.Zb.setEnabled(bool);
    this.Zm.setEnabled(bool);
    this.Zn.setEnabled((bool && this.Zv.isSelected()));
    ZW();
  }
  
  private void lambda$new$0(Zm99 paramZm99) {
    paramZm99.addMouseListener(new Ztyu(this));
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zs : (Ljava/lang/String;)V
    //   13: ldc '²;»Ì[üVíO³Ä»¸¯"\\bsA´!<Á£·;è+Û\\fÛ±ÊÅ"ÒCPÌæ@«\\nôL ÊK?&ÎÅ¤g)Tú-:Îù#$r­©õê k:6y[Iâ«ÊrÊ?È6`p`­ Ê>_+8ÿPÚ¼òâ¤ì`4ÂPG¼Ïõ/jþ¸QÙ0xÔ<ãè.Ð÷zÜ2øHßú\\b²Ó[0ws1Ó\\f=þmQtl¼ì«[1Î£|¹WDbªÂ`'ª)¦yVTi4þFÑÊ­a¸A»IVl\\r'\\réë!\\bû¼ÇH_l.uR ìuB¢ÉÎn>x\\ngµõßB)ÏðÏ O.~¶Òï±Ê>\\fÆJ¹Íîµ¶ïæ"aìH\P¦»1ú±Óòô2 ºÑã6aTgr4FVL÷·5Øæë.\\f:¨\\r\\tÔþ'$;0$Ö;sø:ãûv=ð4µõ«(¼/§âÛ\\n\\f=Ïæ:ncbNúwõhÃ/VVñnÒOn4äÌìÏ 1Äÿ¨§ÅKxÆÿe¼z%J;Oóè0xØ 9*ï+I¯6Áëµèåñ.\\n¶ðZ5â+·Â'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: iconst_3
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: iconst_2
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 144
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 26
    //   70: ldc 'ÓÀ£f7Ïõ`'
    //   72: dup
    //   73: astore_2
    //   74: invokevirtual length : ()I
    //   77: istore #4
    //   79: iconst_5
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #17
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zgol.a : [Ljava/lang/String;
    //   133: bipush #28
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zgol.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #27
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #70
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 42, 0 -> 100
    //   300: new java/util/concurrent/atomic/AtomicInteger
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zgol.ZN : Ljava/util/concurrent/atomic/AtomicInteger;
    //   310: new burp/Zze2
    //   313: dup
    //   314: sipush #-31613
    //   317: sipush #-24706
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: sipush #-31606
    //   326: sipush #-9046
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   335: putstatic burp/Zgol.ZX : Lburp/Zze2;
    //   338: return
  }
  
  public static void Zs(String paramString) {
    ZO = paramString;
  }
  
  public static String ZS() {
    return ZO;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF848F) & 0xFFFF;
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
      char c = 'ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgol.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */