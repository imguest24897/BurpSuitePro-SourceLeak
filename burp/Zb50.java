package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb50 extends Zbqc implements Zsuo, Zrxb, Zkgx, Zzyl {
  private final Zbnt ZJ;
  
  private final Zzyl Zk;
  
  private final Ztyg Za;
  
  private final Zgq7 ZQ;
  
  private final Zs5l Zx;
  
  private final Zey9 Zz;
  
  private final AtomicInteger Zo;
  
  private final Set<Integer> ZR;
  
  private final Zlu8<Zs0m> ZS;
  
  private final Zb54 ZL;
  
  private final Zb5p ZT;
  
  private final Collection<Zg5b<Integer>> ZA;
  
  private final Map<Integer, Zgir> ZM;
  
  private final Map<Integer, Zmgv> Zf;
  
  private final AtomicReference<Zbdx> ZO;
  
  private Zoi Zw;
  
  private Ztk2 ZY;
  
  private Zbdf Zr;
  
  private Zbdf ZN;
  
  private Zbdx Zj;
  
  private Ztpl Zu;
  
  private Zg1v Zs;
  
  private boolean Zd;
  
  private Zbqc ZU;
  
  private Ze01 ZW;
  
  private Ze01 Zg;
  
  private Zm9t ZP;
  
  private Zm2o ZD;
  
  private Zm99 Zn;
  
  private Zm99 ZC;
  
  private Zm99 Zb;
  
  private Zm99 Zc;
  
  private JSeparator ZE;
  
  private Zbqc ZK;
  
  private Ze01 Zl;
  
  private Zbqc ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zb50(Zz0n paramZz0n, Zt4u paramZt4u, Zr_4 paramZr_4, Zrek paramZrek, Zbnt paramZbnt, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, Zerg paramZerg, Supplier<Zskh> paramSupplier, Ze47 paramZe47, Zs5l paramZs5l, Zey9 paramZey9, Zm6x paramZm6x, Zz37 paramZz37) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/HashMap
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield ZM : Ljava/util/Map;
    //   15: aload_0
    //   16: new java/util/HashMap
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: putfield Zf : Ljava/util/Map;
    //   26: aload_0
    //   27: new java/util/concurrent/atomic/AtomicReference
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: putfield ZO : Ljava/util/concurrent/atomic/AtomicReference;
    //   37: aload_0
    //   38: aload #5
    //   40: putfield ZJ : Lburp/Zbnt;
    //   43: aload_0
    //   44: aload #7
    //   46: putfield Za : Lburp/Ztyg;
    //   49: aload_0
    //   50: aload #8
    //   52: putfield ZQ : Lburp/Zgq7;
    //   55: aload_0
    //   56: aload #12
    //   58: putfield Zx : Lburp/Zs5l;
    //   61: aload_0
    //   62: aload #13
    //   64: putfield Zz : Lburp/Zey9;
    //   67: aload_0
    //   68: new java/util/concurrent/atomic/AtomicInteger
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: putfield Zo : Ljava/util/concurrent/atomic/AtomicInteger;
    //   78: invokestatic Zr : ()[I
    //   81: aload_0
    //   82: new java/util/HashSet
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: putfield ZR : Ljava/util/Set;
    //   92: aload_0
    //   93: new java/util/ArrayList
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: putfield ZA : Ljava/util/Collection;
    //   103: aload_0
    //   104: new burp/Zb5p
    //   107: dup
    //   108: aload_0
    //   109: <illegal opcode> run : (Lburp/Zb50;)Ljava/lang/Runnable;
    //   114: aload_0
    //   115: <illegal opcode> accept : (Lburp/Zb50;)Ljava/util/function/Consumer;
    //   120: iconst_0
    //   121: invokespecial <init> : (Ljava/lang/Runnable;Ljava/util/function/Consumer;Z)V
    //   124: putfield ZT : Lburp/Zb5p;
    //   127: aload_0
    //   128: new burp/Zb54
    //   131: dup
    //   132: aload_0
    //   133: <illegal opcode> get : (Lburp/Zb50;)Ljava/util/function/Supplier;
    //   138: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   141: putfield ZL : Lburp/Zb54;
    //   144: aload_0
    //   145: invokevirtual ZBR : ()V
    //   148: astore #16
    //   150: aload_0
    //   151: invokevirtual ZBk : ()V
    //   154: aload_0
    //   155: new burp/Zlu8
    //   158: dup
    //   159: getstatic burp/Zv8r.REPEATER_UI_NOTES_ADDED : Lburp/Zv8r;
    //   162: getstatic burp/Zv8r.REPEATER_UI_NOTES_EDITED : Lburp/Zv8r;
    //   165: getstatic burp/Zze0.REPEATER_UI_NOTES_SIDE_PANEL_CLICKED : Lburp/Zze0;
    //   168: aload #14
    //   170: invokespecial <init> : (Lburp/Zv8r;Lburp/Zv8r;Lburp/Zze0;Lburp/Zm6x;)V
    //   173: putfield ZS : Lburp/Zlu8;
    //   176: aload_0
    //   177: aload_3
    //   178: aload #6
    //   180: aload #15
    //   182: <illegal opcode> run : (Lburp/Zb50;Lburp/Zr_4;Lburp/Ztwv;Lburp/Zz37;)Ljava/lang/Runnable;
    //   187: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   190: aload_0
    //   191: new burp/Zxn3
    //   194: dup
    //   195: aload_1
    //   196: aload_2
    //   197: aload_3
    //   198: aload_0
    //   199: <illegal opcode> get : (Lburp/Zb50;)Ljava/util/function/Supplier;
    //   204: aload_0
    //   205: aload #4
    //   207: aload #5
    //   209: aload #6
    //   211: aload #9
    //   213: aload #10
    //   215: aload #11
    //   217: aload #13
    //   219: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zr_4;Ljava/util/function/Supplier;Ljava/awt/Component;Lburp/Zrek;Lburp/Zbnt;Lburp/Ztwv;Lburp/Zerg;Ljava/util/function/Supplier;Lburp/Ze47;Lburp/Zey9;)V
    //   222: putfield Zk : Lburp/Zzyl;
    //   225: aload #16
    //   227: ifnull -> 237
    //   230: iconst_2
    //   231: anewarray burp/Zbqc
    //   234: invokestatic Zr : ([Lburp/Zbqc;)V
    //   237: return
  }
  
  public void ZD(Ztpl paramZtpl) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zb(paramZtpl);
    try {
      paramZtpl.ZJ();
    } catch (Exception exception) {
      Zah.ZU(new Zx4r(exception), a(-233, -7868), Zk_.UNEXPECTED);
      Zc(paramZtpl);
      this.ZR.remove(Integer.valueOf(paramZtpl.Z_()));
      ZU();
    } 
    ZBj();
    this.Zs = new Zg1v(paramZtpl.Zf(), paramZtpl.Zr(), this.Zl);
    Objects.requireNonNull(paramZtpl);
    this.Zr.ZW(paramZtpl::ZT);
    Objects.requireNonNull(paramZtpl);
    this.ZN.ZW(paramZtpl::ZT);
    Zey();
    Ze8();
    ZeQ();
    Ze9();
    Zen();
    Zei();
    ZeB();
    Zj(paramZtpl.ZH());
    ZB3();
  }
  
  private void Zb(Ztpl paramZtpl) {
    if (this.Zu != null && this.Zu != paramZtpl) {
      this.Zu.ZO(new Ztd7(ZI(), this.Zz.Zy(this.Zr.Zi())));
      this.ZS.ZI();
    } 
    this.Zd = false;
    ZH(paramZtpl);
  }
  
  private void ZH(Ztpl paramZtpl) {
    this.Zu = paramZtpl;
    this.Zo.set(paramZtpl.Z_());
  }
  
  private void ZBj() {
    int[] arrayOfInt = Zzg5.Zr();
    if (ZB0()) {
      if (this.Zu.Ze())
        ZJ(false); 
      if (this.Zu.ZK())
        ZBg(); 
      ZBy();
      if (arrayOfInt != null) {
        ZBB();
        return;
      } 
      return;
    } 
    ZBB();
  }
  
  private boolean ZB0() {
    return this.ZR.contains(Integer.valueOf(this.Zu.Z_()));
  }
  
  private void ZBB() {
    if (this.ZR.isEmpty())
      ZB5(); 
    this.Zr.ZF().Zjh();
    ZJ(true);
    ZBg();
    ZBy();
    this.ZR.add(Integer.valueOf(this.Zu.Z_()));
  }
  
  private void ZB5() {
    ZBu();
    ZBW();
    List<Zlu8<Zs0m>> list = List.of(this.ZS);
    this.Zj = this.ZQ.ZP(Zxff.REPEATER_HTTP).ZE(new Zgib[] { new Zbx_(a(-244, 2983), this.Zr, this::lambda$initialiseMessageAnalyzers$1) }).ZM(new Zgib[] { new Zbx_(a(-247, -26117), this.ZN, this::lambda$initialiseMessageAnalyzers$2) }).Zf((List)list, Zs_i.INSPECTOR).Zl();
    this.ZO.set(this.Zj);
    this.ZK.add(this.Zj, a(-243, 11088));
  }
  
  private Zgir ZBO() {
    return this.ZM.computeIfAbsent(Integer.valueOf(this.Zo.get()), this::lambda$currentRequesterMessageSources$4);
  }
  
  private Zmgv ZB9() {
    return this.Zf.computeIfAbsent(Integer.valueOf(this.Zo.get()), this::lambda$currentRequesterMessageInfoSource$5);
  }
  
  private void ZBu() {
    this.Zr = ZBf();
    this.Zr.Zw(this.Zu.ZX(), this.Zu.ZB(), ZB9());
    this.Zr.ZH(new Zre2(this));
    this.Zr.Zn(new Zskr(this));
    this.Zr.setName(a(-232, 18889));
    this.Zr.ZD(a(-238, 15476));
  }
  
  private void ZBW() {
    this.ZN = ZB2();
    this.ZN.ZL((Zstu)null, Zgu3.HTTP_RESPONSE, ZB9());
    this.ZN.setName(a(-237, -28265));
    this.ZN.ZD(a(-236, 22215));
  }
  
  private Zbdf ZBf() {
    Zs6b zs6b = new Zs6b(new Zrgp(this::lambda$createRequestMessageAnalyzer$6, this::lambda$createRequestMessageAnalyzer$7, this::ZB4));
    Objects.requireNonNull(this.Zo);
    Zzie zzie = ZQ(new Zlny(this.Zo::get));
    return this.Za.ZE(new Zr96(), new Zl1b(this::lambda$createRequestMessageAnalyzer$8, this::lambda$createRequestMessageAnalyzer$9), Zeew.REPEATER, true, Zbdf.ZD, Zghz.Zq, new Zzha(zs6b), Zs18.ZV, zzie, this.Zw.ZI());
  }
  
  private Zbdf ZB2() {
    Objects.requireNonNull(this.Zo);
    Zs18 zs18 = ZQ(new Zgu9(this.Zo::get, this.ZJ));
    Objects.requireNonNull(this.Zo);
    Zzie zzie = ZQ(new Zlny(this.Zo::get));
    return this.Za.ZE(new Zr96(), new Zl1b(this::lambda$createResponseMessageAnalyzer$10, Zb50::lambda$createResponseMessageAnalyzer$11), Zeew.REPEATER, false, Zbdf.ZU, Zghz.Zq, new Zzha(Zkjk.Zf), zs18, zzie, this.Zw.ZI());
  }
  
  private Ztpl ZBC() {
    return this.Zu;
  }
  
  public void requestFocus() {
    super.requestFocus();
    this.Zr.requestFocus();
  }
  
  private void ZBi() {
    if (this.Zu.Zl() == null) {
      ZB6();
      return;
    } 
    this.Zu.ZE();
  }
  
  private void ZN(Zb2t paramZb2t) {
    Zsny zsny = this.Zx.Zq(this.Zu.ZT());
    zsny.Zy().forEach(paramZb2t::lambda$newSendOptionSelected$12);
  }
  
  private Zb2t ZB4() {
    return (this.ZT == null) ? Zb2t.SEND : this.ZT.Zl();
  }
  
  private void ZBc() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZU.add(this.ZT, gridBagConstraints);
  }
  
  private void ZBV() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 21;
    this.ZU.add(this.ZL, gridBagConstraints);
  }
  
  public void Ze8() {
    Zbsv.Zb(this::lambda$targetInfoUpdated$13);
  }
  
  private void ZJ(boolean paramBoolean) {
    this.Zr.ZW(this.Zu.ZX(), this.Zu.ZB(), paramBoolean);
  }
  
  private void ZBg() {
    Zvo1 zvo1 = this.Zu.ZH();
    this.ZN.ZE((zvo1 == null) ? null : zvo1.ZoO(), Zgu3.HTTP_RESPONSE);
  }
  
  private void ZBy() {
    Zkjf.ZO(this::lambda$setExplainerDataFromCurrentRequester$14);
  }
  
  private Zsc_ ZBn() {
    return this.Zu.ZA();
  }
  
  public void Zt(Zefx paramZefx, Zzg5 paramZzg5) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zb50;Lburp/Zzg5;Lburp/Zefx;)Ljava/lang/Runnable;
    //   8: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZV(Zstu paramZstu) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zb50;Lburp/Zstu;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZeB() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lburp/Ztpl;
    //   4: invokevirtual ZB : ()Lburp/Zgsq;
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zb50;Lburp/Zgsq;)Ljava/lang/Runnable;
    //   15: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   18: return
  }
  
  public void Zen() {
    Zbsv.Zb(this::lambda$sendOptionUpdated$18);
  }
  
  public void Ze9() {
    Zbsv.Zb(this::lambda$availableSendOptionsUpdated$19);
  }
  
  public void ZeY() {
    Zbsv.Zb(this::lambda$displayedItemChanged$21);
  }
  
  public void ZL(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: <illegal opcode> run : (Lburp/Zb50;[BI)Ljava/lang/Runnable;
    //   8: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void Zj(Zvo1 paramZvo1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zb50;Lburp/Zvo1;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZeQ() {
    Zbsv.Zb(this::lambda$redirectInfoUpdated$24);
  }
  
  private void ZBw() {
    this.Zc.setName(a(-228, -14445));
    this.ZP.setName(a(-229, -28224));
    this.ZW.setName(a(-235, 17289));
    this.Zb.setName(a(-225, -25470));
    this.Zn.setName(a(-227, -28458));
    this.ZC.setName(a(-241, 1356));
    this.Zl.setName(a(-231, -30729));
  }
  
  private void ZB3() {
    boolean bool = this.Zu.Zf().Zgn();
    Zlkk zlkk1 = bool ? Zlkk.REPEATER_CONFIGURATION_BUTTON_ICON_ACTIVE : Zlkk.REPEATER_CONFIGURATION_BUTTON_ICON;
    this.Zl.setIcon(Ze3m.ZC(Zeuf.SETTINGS, zlkk1).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    Zlkk zlkk2 = bool ? Zlkk.REPEATER_CONFIGURATION_BUTTON_BACKGROUND_ACTIVE : Zlkk.REPEATER_CONFIGURATION_BUTTON_BACKGROUND;
    this.Zl.Zj(zlkk2);
  }
  
  private void ZBA() {
    this.Zs.ZQ();
  }
  
  private void ZBR() {
    this.Zb = new Zm99();
    this.Zn = new Zm99();
    this.ZZ = new Zbqc();
    this.ZU = new Zbqc();
    this.Zl = new Ze01();
    this.ZW = new Ze01();
    this.Zg = new Ze01();
    this.Zc = new Zm99();
    this.ZP = new Zm9t();
    this.ZE = new JSeparator();
    this.ZC = new Zm99();
    this.ZD = new Zm2o();
    this.ZK = new Zbqc();
    JSeparator jSeparator = new JSeparator();
    setName(a(-240, -25817));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    setLayout(gridBagLayout);
    this.Zb.setText(" ");
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 16;
    gridBagConstraints.insets = new Insets(0, 5, 5, 0);
    add(this.Zb, gridBagConstraints);
    this.Zn.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 14;
    gridBagConstraints.insets = new Insets(0, 0, 5, 5);
    add(this.Zn, gridBagConstraints);
    this.ZZ.setLayout(new GridBagLayout());
    this.ZU.setLayout(new GridBagLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZU.add(this.Zl, gridBagConstraints);
    this.ZW.setText(a(-248, -382));
    this.ZW.setEnabled(false);
    this.ZW.addActionListener(this::Zi);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZU.add(this.ZW, gridBagConstraints);
    this.Zg.setText(a(-239, 24411));
    this.Zg.setToolTipText(a(-230, -18721));
    this.Zg.setName(a(-234, -12028));
    this.Zg.addActionListener(this::ZK);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 5, 0, 10);
    this.ZU.add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 512;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZZ.add(this.ZU, gridBagConstraints);
    this.Zc.addMouseListener(new Ztru(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 2304;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 10);
    this.ZZ.add(this.Zc, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    this.ZZ.add(this.ZP, gridBagConstraints);
    this.ZE.setOrientation(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 256;
    gridBagConstraints.insets = new Insets(0, 10, 0, 10);
    this.ZZ.add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1792;
    gridBagConstraints.insets = new Insets(0, 0, 0, 10);
    this.ZZ.add(this.ZC, gridBagConstraints);
    this.ZD.Zi(Zk97.DESKTOP_TOOLS_REPEATER_USING_USING_BURP_REPEATER_WITH_HTTP_MESSAGES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
    this.ZZ.add(this.ZD, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZZ, gridBagConstraints);
    this.ZK.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(jSeparator, gridBagConstraints);
  }
  
  private void ZBk() {
    this.ZZ.setBorder(new Zgnl());
    this.Zc.ZE(Zt00.BOLD_FONT);
    this.Zc.setToolTipText(a(-242, 27861));
    this.ZC.addMouseListener(new Zmpq(this));
    this.ZP.Zv(Ze3m.ZC(Zeuf.EDIT, Zlkk.ACTION_NORMAL).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(-226, 12762), this::ZB6);
    this.ZP.setFocusable(true);
    this.ZD.setFocusable(true);
    this.Zb.addMouseListener(new Zs1l(this));
    this.Zl.addActionListener(this::lambda$configureComponents$25);
    Zb(false);
    ZBc();
    ZBV();
    ZBw();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.Zu.ZU();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.REPEATER_UI_REDIRECTION_MANUALLY_FOLLOWED);
    this.Zu.Zy();
  }
  
  private void Zb(MouseEvent paramMouseEvent) {
    ZB6();
  }
  
  private void ZB6() {
    Zm2.ZC(Zrrh.REPEATER_UI_TARGET_EDITED);
    Zmzk zmzk = this.Zu.Zl();
    int[] arrayOfInt = Zzg5.Zr();
    if (zmzk == null) {
      Zsmh zsmh = this.Zr.ZF().ZjZ();
      (new Zrq_(this, zsmh)).execute();
      if (arrayOfInt != null) {
        (new Zrhy(new Ztlw(this.Zu), zmzk, this.Zu.Zp(), this.ZJ, Zzmm.REPEATER)).setVisible(true);
        return;
      } 
      return;
    } 
    (new Zrhy(new Ztlw(this.Zu), zmzk, this.Zu.Zp(), this.ZJ, Zzmm.REPEATER)).setVisible(true);
  }
  
  public void Zey() {
    this.ZS.ZS(this.Zu.Zf());
  }
  
  private void ZX(boolean paramBoolean) {
    this.ZT.setEnabled(!paramBoolean);
    this.ZL.setEnabled(!paramBoolean);
    this.ZW.setEnabled(paramBoolean);
    this.Zr.requestFocus();
  }
  
  public void Zei() {
    Zbsv.Zb(this::lambda$statusUpdated$26);
  }
  
  private void Zb(boolean paramBoolean) {
    this.Zg.setVisible(paramBoolean);
  }
  
  public Ztcw ZI() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return Zr_1.Zb(new Ztcw[] { this.Zj.ZI(), this.Zr.ZI(), this.ZN.ZI() });
  }
  
  public void ZU() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.Zj != null) {
      this.Zj.ZU();
      this.Zr.ZU();
      this.ZN.ZU();
      Zmgv zmgv = ZB9();
      this.Zr.ZF().Zk(zmgv);
      this.ZN.ZF().Zk(zmgv);
    } 
  }
  
  public void ZHY() {
    if (this.Zr != null)
      this.Zr.repaint(); 
  }
  
  public boolean ZH_() {
    return this.Zd;
  }
  
  public Zsmh ZHS() {
    return this.Zr.Zi();
  }
  
  public Zsmh ZHq() {
    return this.ZN.Zi();
  }
  
  public Component ZHt() {
    return this;
  }
  
  public List<Component> ZHi() {
    return (this.Zr == null) ? Collections.<Component>emptyList() : this.Zr.Zo();
  }
  
  public void ZH0() {
    this.ZS.ZI();
  }
  
  public void Zc(Ztpl paramZtpl) {
    int i = paramZtpl.Z_();
    this.ZA.forEach(i::lambda$disposeState$27);
    this.ZM.remove(Integer.valueOf(i));
    this.Zf.remove(Integer.valueOf(i));
    this.ZR.remove(Integer.valueOf(i));
  }
  
  public Zsuo ZHM() {
    return this;
  }
  
  public int[] ZHE() {
    return this.Zr.ZG();
  }
  
  private <T extends Zg5b<Integer>> T ZQ(T paramT) {
    this.ZA.add((Zg5b<Integer>)paramT);
    return paramT;
  }
  
  private Zoi Zb(Zr_4 paramZr_4, Ztwv paramZtwv, Zz37 paramZz37, Supplier<Zbdx> paramSupplier) {
    // Byte code:
    //   0: new burp/Zbcp
    //   3: dup
    //   4: aload_0
    //   5: getfield ZY : Lburp/Ztk2;
    //   8: invokespecial <init> : (Lburp/Ztk9;)V
    //   11: astore #5
    //   13: new burp/Zgsi
    //   16: dup
    //   17: aload_2
    //   18: aload_3
    //   19: invokespecial <init> : (Lburp/Ztwv;Lburp/Zz37;)V
    //   22: astore #6
    //   24: new burp/Zxcj
    //   27: dup
    //   28: aload_1
    //   29: aload_0
    //   30: <illegal opcode> get : (Lburp/Zb50;)Ljava/util/function/Supplier;
    //   35: aload #6
    //   37: getstatic burp/Zze0.REPEATER_UI_EXPLANATION_REQUESTED : Lburp/Zze0;
    //   40: invokespecial <init> : (Lburp/Zr_4;Ljava/util/function/Supplier;Lburp/Zgsi;Lburp/Zze0;)V
    //   43: astore #7
    //   45: new burp/Zl6x
    //   48: dup
    //   49: aload #4
    //   51: aload #7
    //   53: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zxcj;)V
    //   56: astore #8
    //   58: aload_0
    //   59: aload_3
    //   60: <illegal opcode> apply : (Lburp/Zb50;Lburp/Zz37;)Ljava/util/function/BiFunction;
    //   65: astore #9
    //   67: new burp/Zl_l
    //   70: dup
    //   71: aload_0
    //   72: <illegal opcode> accept : (Lburp/Zb50;)Ljava/util/function/IntConsumer;
    //   77: aload #6
    //   79: dup
    //   80: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   83: pop
    //   84: <illegal opcode> accept : (Lburp/Zgsi;)Ljava/util/function/Consumer;
    //   89: aload #9
    //   91: getstatic burp/Zze0.REPEATER_UI_EXPLANATION_RE_REQUESTED : Lburp/Zze0;
    //   94: getstatic burp/Zze0.REPEATER_UI_EXPLANATION_DELETED : Lburp/Zze0;
    //   97: getstatic burp/Zze0.REPEATER_UI_EXPLANATION_ERROR_RE_REQUESTED : Lburp/Zze0;
    //   100: getstatic burp/Zze0.REPEATER_UI_EXPLANATION_ERROR_DELETED : Lburp/Zze0;
    //   103: invokespecial <init> : (Ljava/util/function/IntConsumer;Ljava/util/function/Consumer;Ljava/util/function/BiFunction;Lburp/Zze0;Lburp/Zze0;Lburp/Zze0;Lburp/Zze0;)V
    //   106: astore #10
    //   108: new burp/Zoi
    //   111: dup
    //   112: aload #8
    //   114: aload_0
    //   115: getfield ZY : Lburp/Ztk2;
    //   118: aload #5
    //   120: aload #10
    //   122: getstatic burp/Zze0.REPEATER_UI_EXPLAINER_SIDE_PANEL_CLICKED : Lburp/Zze0;
    //   125: invokespecial <init> : (Lburp/Zb9b;Lburp/Ztk2;Lburp/Zbcp;Lburp/Zl_l;Lburp/Zze0;)V
    //   128: areturn
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.Zk.ZI(paramInt, paramObject);
  }
  
  private void lambda$getExplainerSidebarComponent$29(int paramInt) {
    this.ZY.ZV(paramInt);
  }
  
  private Boolean lambda$getExplainerSidebarComponent$28(Zz37 paramZz37, Integer paramInteger, Boolean paramBoolean) {
    Object object = this.ZY.ZE(paramInteger.intValue()).Zk();
    if (object instanceof Zmkf) {
      Zmkf zmkf = (Zmkf)object;
      boolean bool = paramZz37.ZA(zmkf.ZiQ(), paramBoolean.booleanValue());
      if (bool) {
        Zze0 zze0 = paramBoolean.booleanValue() ? Zze0.REPEATER_UI_EXPLANATION_POSITIVE_FEEDBACK_GIVEN : Zze0.REPEATER_UI_EXPLANATION_NEGATIVE_FEEDBACK_GIVEN;
        Zm2.Zo(zze0);
      } 
      zmkf.ZC(bool);
      return Boolean.valueOf(bool);
    } 
    return Boolean.valueOf(false);
  }
  
  private static void lambda$disposeState$27(int paramInt, Zg5b<Integer> paramZg5b) {
    paramZg5b.ZY(Integer.valueOf(paramInt));
  }
  
  private void lambda$statusUpdated$26() {
    Zgdp zgdp = this.Zu.Zd();
    this.Zb.setText(zgdp.Zg());
    ZX(zgdp.Zs());
  }
  
  private void lambda$configureComponents$25(ActionEvent paramActionEvent) {
    ZBA();
  }
  
  private void lambda$redirectInfoUpdated$24() {
    Zb((this.Zu.Zs() != null));
  }
  
  private void lambda$updateItemDescription$23(Zvo1 paramZvo1) {
    Zs2d.Zx(paramZvo1, this.Zn);
  }
  
  private void lambda$responseAppended$22(byte[] paramArrayOfbyte, int paramInt) {
    this.ZN.ZK(paramArrayOfbyte, 0, paramInt);
    Zj(this.Zu.ZH());
  }
  
  private void lambda$displayedItemChanged$21() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokevirtual Zb : (Z)V
    //   5: aload_0
    //   6: getfield Zu : Lburp/Ztpl;
    //   9: invokevirtual ZH : ()Lburp/Zvo1;
    //   12: astore_1
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual Zj : (Lburp/Zvo1;)V
    //   18: aload_1
    //   19: ifnonnull -> 23
    //   22: return
    //   23: aload_1
    //   24: invokeinterface ZYt : ()[I
    //   29: astore_2
    //   30: aload_0
    //   31: aload_2
    //   32: <illegal opcode> run : (Lburp/Zb50;[I)Ljava/lang/Runnable;
    //   37: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   40: aload_0
    //   41: getfield Zr : Lburp/Zbdf;
    //   44: invokevirtual requestFocus : ()V
    //   47: aload_0
    //   48: getfield ZL : Lburp/Zb54;
    //   51: invokevirtual Zp : ()V
    //   54: goto -> 65
    //   57: astore_1
    //   58: aload_1
    //   59: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   62: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   65: return
    // Exception table:
    //   from	to	target	type
    //   0	22	57	java/lang/Exception
    //   23	54	57	java/lang/Exception
  }
  
  private void lambda$displayedItemChanged$20(int[] paramArrayOfint) {
    this.Zr.Ze(paramArrayOfint[0], paramArrayOfint[1]);
  }
  
  private void lambda$availableSendOptionsUpdated$19() {
    this.ZT.ZZ((this.Zu.ZT() != null));
  }
  
  private void lambda$sendOptionUpdated$18() {
    this.ZT.Zv(this.Zu.Zj());
  }
  
  private void lambda$messageProtocolUpdated$17(Zgsq paramZgsq) {
    boolean bool = (paramZgsq.label != null) ? true : false;
    this.ZC.setText(paramZgsq.label);
    this.ZC.setToolTipText(paramZgsq.tooltip);
    this.ZE.setVisible(bool);
    this.ZT.ZN(paramZgsq);
  }
  
  private void lambda$responseMessageChanged$16(Zstu paramZstu) {
    this.ZN.ZE(paramZstu, Zgu3.HTTP_RESPONSE);
  }
  
  private void lambda$requestMessageChanged$15(Zzg5 paramZzg5, Zefx paramZefx) {
    int[] arrayOfInt = Zs2d.ZG(paramZzg5) ? this.Zr.ZG() : null;
    this.Zr.ZW(paramZefx, this.Zu.ZB(), Zs2d.ZF(paramZzg5));
    if (arrayOfInt != null)
      this.Zr.Ze(arrayOfInt[0], arrayOfInt[1]); 
  }
  
  private void lambda$setExplainerDataFromCurrentRequester$14() {
    this.ZY.Zy(ZBn());
  }
  
  private void lambda$targetInfoUpdated$13() {
    Zs2d.ZZ(this.Zu.Zl(), this.Zu.Zp(), this.Zc);
  }
  
  private static void lambda$newSendOptionSelected$12(Zb2t paramZb2t, Ztpl paramZtpl) {
    paramZtpl.Zr(paramZb2t);
  }
  
  private static void lambda$createResponseMessageAnalyzer$11(Zgsq paramZgsq) {}
  
  private Zgsq lambda$createResponseMessageAnalyzer$10() {
    return this.Zu.ZH().Zoe();
  }
  
  private void lambda$createRequestMessageAnalyzer$9(Zgsq paramZgsq) {
    this.Zu.ZG(paramZgsq);
  }
  
  private Zgsq lambda$createRequestMessageAnalyzer$8() {
    return this.Zu.ZB();
  }
  
  private Zbr lambda$createRequestMessageAnalyzer$7() {
    return ZBC().Zg();
  }
  
  private Zrtw lambda$createRequestMessageAnalyzer$6() {
    return ZBC().Zr().Zh();
  }
  
  private Zmgv lambda$currentRequesterMessageInfoSource$5(Integer paramInteger) {
    return this.Zu.Zf(this.Zk);
  }
  
  private Zgir lambda$currentRequesterMessageSources$4(Integer paramInteger) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lburp/Ztpl;
    //   4: new burp/Zr__
    //   7: dup
    //   8: aload_0
    //   9: getfield Zr : Lburp/Zbdf;
    //   12: invokevirtual ZF : ()Lburp/Zkki;
    //   15: aload_0
    //   16: aload_1
    //   17: <illegal opcode> get : (Lburp/Zb50;Ljava/lang/Integer;)Ljava/util/function/Supplier;
    //   22: invokespecial <init> : (Lburp/Ztrk;Ljava/util/function/Supplier;)V
    //   25: invokevirtual Zd : (Lburp/Ztrk;)Lburp/Zgir;
    //   28: areturn
  }
  
  private Boolean lambda$currentRequesterMessageSources$3(Integer paramInteger) {
    return Boolean.valueOf((this.Zo.get() == paramInteger.intValue()));
  }
  
  private Zke5 lambda$initialiseMessageAnalyzers$2() {
    return ZBO().ZFt();
  }
  
  private Zke5 lambda$initialiseMessageAnalyzers$1() {
    return ZBO().ZF7();
  }
  
  private void lambda$new$0(Zr_4 paramZr_4, Ztwv paramZtwv, Zz37 paramZz37) {
    this.ZY = new Ztk2();
    Objects.requireNonNull(this.ZO);
    this.Zw = Zb(paramZr_4, paramZtwv, paramZz37, this.ZO::get);
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '%ïcZ-Fs´ÑE<w«=ºê\\nBaµÀâ"nj1@ðt´X1Ïîq=\\r»§É3'Þ2§ë7.6M±Ê}u²fò"\\fu'Ä´Ùí 9N³³ÞG6ÿ2·Äw\\nÉÀÛI+£ýj `éËîÐB¬Fº¡ÒÌÎ/êæDä¹(6¢Y&W9`å¬ÙÍ&k0¸9|P.ubÇ©(Y{P{Dy÷{SÅ>[ üÞóáH£(.&Üc=æ¯_êdúAÃõ¿¶. ¹½áùLIV!?,4WV-mä JhåßÜYm.\ òà#Æ¯8ú:e\½[PÉép`î°1BÀ .ÈÆ÷ ÈmÏöU\\tRh-Ûã¬²D0:PãË{ß\Ó¬¬-ML·KÒ¢­ÿqnc¥ï]NBïâô557¯±ë°\Ñ,{¹m{,O3;ºýÖIq¼cÒ÷ fôý^Hº-¶Y.\ÿT¨Å²ù[é0PäÊY%3Vði¯ì¯û!c¢Ìú¥Óx¼PKí¿ÁYý©ÿRæHÊå{æ"CÈ×ôÞ)UÙ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #60
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
    //   68: ldc 'pÂZ^ÓßÁ}ÂÉ^'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #99
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
    //   129: putstatic burp/Zb50.a : [Ljava/lang/String;
    //   132: bipush #22
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb50.b : [Ljava/lang/String;
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
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #13
    //   219: goto -> 244
    //   222: bipush #125
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #74
    //   234: goto -> 244
    //   237: bipush #41
    //   239: goto -> 244
    //   242: bipush #12
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
    int i = (paramInt1 ^ 0xFFFFFF1D) & 0xFFFF;
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
      char c = '½';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb50.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */