package burp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.event.TableModelEvent;
import net.portswigger.Zm2;

public class Zb5s extends Zbqc implements Zzyl {
  private final Zlwv ZW;
  
  private final Ztpe Zw;
  
  private final Zbdf Za;
  
  private final Zbdf Zd;
  
  private final Zxpo Zm;
  
  private final Ztwv Zt;
  
  private final Zmif Zn;
  
  private final Zbws ZC;
  
  private final AtomicReference<Ze3o> Zl;
  
  private final Zli2 Zz;
  
  private Zbqc ZL;
  
  private Zm2o Zo;
  
  private Zm9t ZX;
  
  private Ze01 Zf;
  
  private Ze0q ZP;
  
  private Zzdy ZS;
  
  private Zedd ZV;
  
  private Zbkd ZQ;
  
  private Zbqc ZM;
  
  private Zbup ZJ;
  
  private Zm99 ZH;
  
  private Zm99 Zy;
  
  private Zbkc ZB;
  
  private Zbqc Zs;
  
  private Zmyz Zk;
  
  private Zbqc Zx;
  
  private Zbqc ZA;
  
  private Zmyz Zi;
  
  private Zbqc Zr;
  
  private Zbqc ZN;
  
  private static boolean ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb5s(Zlwv paramZlwv, Consumer<Zeeg> paramConsumer, Ztpe paramZtpe, Zbdf paramZbdf1, Zbdf paramZbdf2, Zerg paramZerg, Ztwv paramZtwv, Zgq7 paramZgq7, Zgfa paramZgfa, Zxpo paramZxpo, boolean paramBoolean, Zgso paramZgso, Zzzt paramZzzt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZW : Lburp/Zlwv;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield Zw : Lburp/Ztpe;
    //   14: aload_0
    //   15: aload #4
    //   17: putfield Za : Lburp/Zbdf;
    //   20: aload_0
    //   21: aload #5
    //   23: putfield Zd : Lburp/Zbdf;
    //   26: aload_0
    //   27: aload #10
    //   29: putfield Zm : Lburp/Zxpo;
    //   32: aload_0
    //   33: aload #7
    //   35: putfield Zt : Lburp/Ztwv;
    //   38: aload_0
    //   39: new java/util/concurrent/atomic/AtomicReference
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: putfield Zl : Ljava/util/concurrent/atomic/AtomicReference;
    //   49: aload_0
    //   50: invokevirtual Zp : ()V
    //   53: aload_0
    //   54: invokevirtual ZP : ()V
    //   57: aload #8
    //   59: getstatic burp/Zxff.REPEATER_WEBSOCKET : Lburp/Zxff;
    //   62: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   65: aload #4
    //   67: ldc ''
    //   69: invokeinterface Zj : (Lburp/Zbdf;Ljava/lang/String;)Lburp/Zefl;
    //   74: invokeinterface Zz : ()Lburp/Zefl;
    //   79: invokeinterface ZR : ()Lburp/Zefl;
    //   84: invokeinterface Zo : ()Lburp/Zefl;
    //   89: invokeinterface Zl : ()Lburp/Zbdx;
    //   94: astore #15
    //   96: aload #8
    //   98: getstatic burp/Zxff.REPEATER_WEBSOCKET_HISTORY : Lburp/Zxff;
    //   101: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   104: aload #5
    //   106: ldc ''
    //   108: invokeinterface Zj : (Lburp/Zbdf;Ljava/lang/String;)Lburp/Zefl;
    //   113: invokeinterface Zz : ()Lburp/Zefl;
    //   118: invokeinterface ZR : ()Lburp/Zefl;
    //   123: invokeinterface Zo : ()Lburp/Zefl;
    //   128: invokeinterface Zl : ()Lburp/Zbdx;
    //   133: astore #16
    //   135: new burp/Zbqc
    //   138: dup
    //   139: new java/awt/BorderLayout
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   149: astore #17
    //   151: aload #17
    //   153: new javax/swing/JSeparator
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: sipush #12003
    //   163: sipush #-24650
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   172: aload #17
    //   174: aload #15
    //   176: sipush #12019
    //   179: sipush #-8356
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   188: invokestatic Zc : ()Z
    //   191: aload_0
    //   192: getfield Zx : Lburp/Zbqc;
    //   195: aload #17
    //   197: sipush #12013
    //   200: sipush #-19387
    //   203: invokestatic a : (II)Ljava/lang/String;
    //   206: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   209: istore #14
    //   211: aload_0
    //   212: getfield ZN : Lburp/Zbqc;
    //   215: aload #16
    //   217: sipush #12013
    //   220: sipush #-19387
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   229: aload_3
    //   230: invokevirtual ZV : ()Ljavafx/collections/ObservableList;
    //   233: astore #18
    //   235: aload_0
    //   236: new burp/Zmif
    //   239: dup
    //   240: aload #18
    //   242: invokespecial <init> : (Ljavafx/collections/ObservableList;)V
    //   245: putfield Zn : Lburp/Zmif;
    //   248: aload_0
    //   249: new burp/Zbws
    //   252: dup
    //   253: aload_0
    //   254: getfield Zn : Lburp/Zmif;
    //   257: invokespecial <init> : (Lburp/Zztu;)V
    //   260: putfield ZC : Lburp/Zbws;
    //   263: aload_1
    //   264: invokevirtual Zp : ()I
    //   267: istore #19
    //   269: iload #19
    //   271: iconst_m1
    //   272: if_icmpeq -> 292
    //   275: aload_0
    //   276: getfield Zn : Lburp/Zmif;
    //   279: new burp/Zea6
    //   282: dup
    //   283: aload_0
    //   284: iload #19
    //   286: invokespecial <init> : (Lburp/Zb5s;I)V
    //   289: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   292: aload_0
    //   293: <illegal opcode> run : (Lburp/Zb5s;)Ljava/lang/Runnable;
    //   298: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   301: aload_0
    //   302: new burp/Zli2
    //   305: dup
    //   306: aload #6
    //   308: aload_2
    //   309: aload_0
    //   310: getfield ZC : Lburp/Zbws;
    //   313: aload_3
    //   314: aload_0
    //   315: <illegal opcode> accept : (Lburp/Zb5s;)Ljava/util/function/BiConsumer;
    //   320: aload #5
    //   322: <illegal opcode> run : (Lburp/Zbdf;)Ljava/lang/Runnable;
    //   327: invokespecial <init> : (Lburp/Zerg;Ljava/util/function/Consumer;Lburp/Zbws;Lburp/Ztpe;Ljava/util/function/BiConsumer;Ljava/lang/Runnable;)V
    //   330: putfield Zz : Lburp/Zli2;
    //   333: aload_0
    //   334: getfield ZC : Lburp/Zbws;
    //   337: new burp/Zeea
    //   340: dup
    //   341: aload_0
    //   342: getfield Zz : Lburp/Zli2;
    //   345: aload #12
    //   347: aload #13
    //   349: invokespecial <init> : (Lburp/Zli2;Lburp/Zgso;Lburp/Zzzt;)V
    //   352: invokevirtual Zk : (Lburp/Zky2;)V
    //   355: aload_0
    //   356: getfield ZJ : Lburp/Zbup;
    //   359: aload_0
    //   360: getfield ZC : Lburp/Zbws;
    //   363: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   366: aload_0
    //   367: getfield ZJ : Lburp/Zbup;
    //   370: new java/awt/Dimension
    //   373: dup
    //   374: bipush #100
    //   376: bipush #15
    //   378: invokespecial <init> : (II)V
    //   381: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   384: aload_1
    //   385: new burp/Zgmg
    //   388: dup
    //   389: aload_0
    //   390: invokespecial <init> : (Lburp/Zb5s;)V
    //   393: invokevirtual ZI : (Lburp/Ztwn;)V
    //   396: aload_0
    //   397: getfield ZX : Lburp/Zm9t;
    //   400: getstatic burp/Zeuf.EDIT : Lburp/Zeuf;
    //   403: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   406: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   409: getstatic burp/Zmcx.EXTRA_LARGE_LINE_SIZE : Lburp/Zmcx;
    //   412: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   415: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   418: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   421: invokevirtual Z_ : ()Lburp/Ze9n;
    //   424: sipush #12021
    //   427: sipush #-30747
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: aload_0
    //   434: aload #10
    //   436: aload_1
    //   437: <illegal opcode> run : (Lburp/Zb5s;Lburp/Zxpo;Lburp/Zlwv;)Ljava/lang/Runnable;
    //   442: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   445: aload #9
    //   447: aload_0
    //   448: <illegal opcode> run : (Lburp/Zb5s;)Ljava/lang/Runnable;
    //   453: invokevirtual ZB : (Ljava/lang/Runnable;)V
    //   456: aload_1
    //   457: invokevirtual ZL : ()Z
    //   460: ifeq -> 479
    //   463: aload_0
    //   464: invokevirtual Ze : ()V
    //   467: iload #14
    //   469: ifeq -> 514
    //   472: iconst_4
    //   473: anewarray burp/Zbqc
    //   476: invokestatic Zr : ([Lburp/Zbqc;)V
    //   479: aload_0
    //   480: getfield ZH : Lburp/Zm99;
    //   483: getstatic burp/Zgzq.LARGE_SWITCH_OFF : Lburp/Zgzq;
    //   486: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   489: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   492: aload_0
    //   493: iconst_0
    //   494: invokevirtual Zg : (Z)V
    //   497: iload #11
    //   499: ifeq -> 514
    //   502: aload_0
    //   503: aload #10
    //   505: aload_1
    //   506: <illegal opcode> run : (Lburp/Zb5s;Lburp/Zxpo;Lburp/Zlwv;)Ljava/lang/Runnable;
    //   511: invokestatic ZH : (Ljava/lang/Runnable;)V
    //   514: aload_0
    //   515: invokevirtual ZG : ()V
    //   518: aload_0
    //   519: invokevirtual Zb : ()V
    //   522: return
  }
  
  private void ZG() {
    this.ZQ.Zj(a(12015, 461));
    Zgf8 zgf8 = new Zgf8();
    zgf8.setName(a(12018, 1790));
    Objects.requireNonNull(this.Zn);
    zgf8.Zv(this.Zn::Zv, 20);
    zgf8.addFocusListener(new Zm9z(zgf8, this.ZC.getName()));
    this.ZQ.ZX(zgf8);
    Zm2j zm2j = new Zm2j(this.ZC);
    this.ZQ.Zh(zm2j);
  }
  
  private void Zb() {
    this.ZB.setName(a(12009, 23390));
    this.ZV.setName(a(12000, 19242));
    this.ZC.setName(a(12001, -3172));
    this.Za.ZD(a(12007, -22780));
    this.Zd.ZD(a(12002, -11148));
  }
  
  public void Zw() {
    this.ZW.Zb();
  }
  
  private void Ze() {
    Zg(true);
    boolean bool = this.ZW.ZM();
    ImageIcon imageIcon = bool ? Zgzq.LARGE_SWITCH_ON.ZD() : Zgzq.LARGE_SWITCH_OFF.ZD();
    this.ZH.setIcon(imageIcon);
    this.ZH.setToolTipText(bool ? a(12008, 3316) : a(12017, -9435));
    Zm();
    this.ZP.setEnabled(bool);
    this.Zf.setVisible(!bool);
    this.ZS.setEnabled(bool);
    String str = String.format(a(12005, -27470), new Object[] { Integer.valueOf(this.ZW.ZA()), Zmg3.ZD(this.ZW.Zv()) });
    this.Zy.setText(str);
    this.Za.Zc();
  }
  
  private void Zg(boolean paramBoolean) {
    this.ZH.setEnabled(paramBoolean);
    this.Zf.setVisible(paramBoolean);
    this.ZP.setEnabled(paramBoolean);
    this.ZV.setEnabled(paramBoolean);
    this.ZS.setEnabled(paramBoolean);
  }
  
  private void Zm() {
    Ze3o ze3o = this.ZW.ZC();
    Ze3o[] arrayOfZe3o = this.ZW.Zu();
    this.ZV.setModel(new DefaultComboBoxModel<>(arrayOfZe3o));
    this.ZV.setSelectedItem(ze3o);
    this.ZV.setEnabled((this.ZW.ZM() && arrayOfZe3o.length > 1));
  }
  
  private void ZX(int paramInt) {
    this.Zw.ZM(paramInt);
    this.ZW.ZG(paramInt);
    Zeeg zeeg = this.Zw.Ze();
    if (zeeg != null)
      this.Zd.ZE(zeeg.Zaa(), Zgu3.WS_MESSAGE); 
  }
  
  public void ZF() {
    boolean bool = this.ZS.isSelected();
    Ze3o ze3o = bool ? this.ZW.ZC().ZX() : null;
    this.Zl.set(ze3o);
    if (!bool)
      Zm2.ZC(Zrrh.REPEATER_UI_WEBSOCKET_AUTOSELECT_DISABLED); 
    this.Zt.Zx(this::lambda$sendCurrentMessage$7);
  }
  
  private void ZD(int paramInt, Ze3o paramZe3o) {
    boolean bool = Zy();
    if (paramZe3o == this.Zl.get()) {
      this.ZC.changeSelection(this.ZC.convertRowIndexToView(paramInt), -1, false, false);
      this.Zl.set(null);
      if (!bool) {
        if (this.ZW.Zp() == -1) {
          ZX(paramInt);
          this.ZC.changeSelection(this.ZC.convertRowIndexToView(paramInt), -1, false, false);
        } 
        return;
      } 
      return;
    } 
    if (this.ZW.Zp() == -1) {
      ZX(paramInt);
      this.ZC.changeSelection(this.ZC.convertRowIndexToView(paramInt), -1, false, false);
    } 
  }
  
  private void ZK() {
    boolean bool = Zy();
    if (this.ZW.ZM()) {
      this.ZW.ZH();
      Ze();
      if (!bool) {
        Zi();
        return;
      } 
      return;
    } 
    Zi();
  }
  
  private void Zi() {
    this.Zf.setEnabled(false);
    this.ZH.setEnabled(false);
    this.Zm.Zn(this, this.ZW.ZW(), this.ZW.ZA());
    this.Zf.setEnabled(true);
    this.ZH.setEnabled(true);
  }
  
  private void ZZ() {
    Zo(Zt6s.Zu(this.Zd.Zi()), this.Zw.Ze());
  }
  
  private void Zo(byte[] paramArrayOfbyte, Zeeg paramZeeg) {
    Zm2.ZC(Zrrh.REPEATER_UI_WEBSOCKET_MESSAGE_COPIED);
    if (paramZeeg != null) {
      this.Za.ZN(paramArrayOfbyte, Zgu3.WS_MESSAGE);
      Ze3o ze3o1 = paramZeeg.Za_();
      Ze3o ze3o2 = this.ZW.Zd(ze3o1) ? ze3o1 : ze3o1.ZX();
      this.ZV.setSelectedItem(ze3o2);
      this.ZW.ZP(paramZeeg.Zaz(), paramZeeg.Zay(), ze3o2);
    } 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return (new Zm3h(this.Zz.ZX(), this)).ZI(paramInt, paramObject);
  }
  
  public void updateUI() {
    ZP();
    super.updateUI();
  }
  
  private void ZP() {
    if (this.Zr != null)
      this.Zr.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Zlkk.PANEL_BORDER.ZS()), BorderFactory.createEmptyBorder(2, 10, 5, 0))); 
  }
  
  private void Zp() {
    this.Zk = new Zmyz();
    this.Zs = new Zbqc();
    this.Zr = new Zbqc();
    this.Zy = new Zm99();
    this.ZH = new Zm99();
    this.Zo = new Zm2o();
    this.ZX = new Zm9t();
    this.Zx = new Zbqc();
    this.ZL = new Zbqc();
    this.ZB = new Zbkc();
    this.ZP = new Ze0q();
    this.ZV = new Zedd();
    this.Zf = new Ze01();
    this.ZS = new Zzdy();
    this.ZA = new Zbqc();
    this.Zi = new Zmyz();
    this.ZM = new Zbqc();
    this.ZQ = new Zbkd();
    this.ZJ = new Zbup();
    this.ZN = new Zbqc();
    setLayout(new BorderLayout());
    this.Zk.setLeftComponent(this.Zs);
    this.Zk.setResizeWeight(0.5D);
    this.Zk.setRightComponent(this.ZA);
    this.Zs.setMinimumSize(new Dimension(150, 100));
    this.Zs.setPreferredSize(new Dimension(100, 100));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0 };
    this.Zs.setLayout(gridBagLayout1);
    this.Zr.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)), BorderFactory.createEmptyBorder(2, 10, 5, 0)));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zr.setLayout(gridBagLayout2);
    this.Zy.setText(a(12016, -28373));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    this.Zr.add(this.Zy, gridBagConstraints);
    this.ZH.addMouseListener(new Zs2m(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.insets = new Insets(0, 8, 0, 0);
    this.Zr.add(this.ZH, gridBagConstraints);
    this.Zo.Zi(Zk97.DESKTOP_TOOLS_REPEATER_USING_USING_BURP_REPEATER_WITH_WEBSOCKET_MESSAGES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zr.add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.Zr.add(this.ZX, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.Zs.add(this.Zr, gridBagConstraints);
    this.Zx.setLayout(new BorderLayout());
    this.ZL.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 10, 0, 10, 0, 10, 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 5, 0 };
    this.ZL.setLayout(gridBagLayout3);
    this.ZB.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.ZB.Zx(a(12006, 12702));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    this.ZL.add(this.ZB, gridBagConstraints);
    this.ZP.setText(a(12011, 15069));
    this.ZP.setName(a(12004, 14598));
    this.ZP.addActionListener(new Zrpe(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZL.add(this.ZP, gridBagConstraints);
    this.ZV.addActionListener(new Zk89(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZL.add(this.ZV, gridBagConstraints);
    this.Zf.setText(a(12014, -20809));
    this.Zf.addActionListener(new Zrvg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZL.add(this.Zf, gridBagConstraints);
    this.ZS.setSelected(true);
    this.ZS.setText(a(12010, -9171));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weightx = 1.0D;
    this.ZL.add(this.ZS, gridBagConstraints);
    this.Zx.add(this.ZL, a(12012, 27516));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    this.Zs.add(this.Zx, gridBagConstraints);
    this.Zk.setLeftComponent(this.Zs);
    this.ZA.setPreferredSize(new Dimension(100, 100));
    this.ZA.setLayout(new BorderLayout());
    this.Zi.setLeftComponent(this.ZM);
    this.Zi.setOrientation(0);
    this.Zi.setResizeWeight(0.5D);
    this.Zi.setRightComponent(this.ZN);
    this.ZM.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.ZM.setPreferredSize(new Dimension(100, 100));
    this.ZM.setLayout(new BorderLayout());
    this.ZQ.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.ZM.add(this.ZQ, a(12012, 27516));
    this.ZJ.setBorder((Border)null);
    this.ZJ.setVerticalScrollBarPolicy(22);
    this.ZM.add(this.ZJ, a(12013, -19387));
    this.Zi.setLeftComponent(this.ZM);
    this.ZN.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZN.setPreferredSize(new Dimension(100, 100));
    this.ZN.setLayout(new BorderLayout());
    this.Zi.setRightComponent(this.ZN);
    this.ZA.add(this.Zi, a(12013, -19387));
    this.Zk.setRightComponent(this.ZA);
    add(this.Zk, a(12013, -19387));
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    ZF();
  }
  
  private void Zd(MouseEvent paramMouseEvent) {
    if (this.ZH.isEnabled())
      ZK(); 
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    Zi();
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    this.ZW.Zp((Ze3o)this.ZV.getSelectedItem());
  }
  
  private void lambda$sendCurrentMessage$7() {
    this.ZW.Zh(Zt6s.Zu(this.Za.Zi()));
    this.Za.requestFocus();
  }
  
  private void lambda$new$5(Zxpo paramZxpo, Zlwv paramZlwv) {
    paramZxpo.Zl(this, paramZlwv.ZA());
  }
  
  private static void lambda$new$4(Zbdf paramZbdf) {
    paramZbdf.ZN(new byte[0], Zgu3.WS_MESSAGE);
  }
  
  private void lambda$new$3() {
    this.ZC.setAutoCreateRowSorter(true);
    this.ZC.setFillsViewportHeight(true);
    this.ZC.ZF(true);
    this.ZC.getTableHeader().setReorderingAllowed(true);
    this.ZC.setSelectionMode(2);
    this.ZC.Zc(this::lambda$new$0);
    this.Zn.addTableModelListener(this::lambda$new$2);
  }
  
  private void lambda$new$2(TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getType : ()I
    //   4: iconst_1
    //   5: if_icmpne -> 18
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zb5s;Ljavax/swing/event/TableModelEvent;)Ljava/lang/Runnable;
    //   15: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   18: return
  }
  
  private void lambda$new$1(TableModelEvent paramTableModelEvent) {
    ZD(paramTableModelEvent.getLastRow(), this.Zn.ZW(paramTableModelEvent.getLastRow()).Za_());
  }
  
  private void lambda$new$0(int paramInt1, int paramInt2) {
    ZX(this.ZC.convertRowIndexToModel(paramInt1));
  }
  
  public static void Zw(boolean paramBoolean) {
    ZT = paramBoolean;
  }
  
  public static boolean Zc() {
    return ZT;
  }
  
  public static boolean Zy() {
    boolean bool = Zc();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_0
    //   10: ldc 'Üøï7?8Û9|ú«$E"Øà³ç/§¥q¬EïÜu/$\\nÑ#[´wï|à!7f.|NçÀ$oÔÆîð¿Ç<Ä¹mø×õ£zÜý°úB}fIbÌÔ!ØRRúÑ8m°Kô¯Æ~GtÓøÿÖ0&A[9]eÅ$ä&£Ý+#yÔ¨øÌÔ¥¤³9è·YãyÝ²Î?Æu`wf\\t](\\t!ÇñÑá¦òõg¤£×¨§å7îÈú½nê`1Ü.Ô 'V*\\n ©ÌÊÜçy²õ\\f¦\\t·ý¶!pÊ/ö9í`CxÝmezOóÙsËvblSù =ùlÎo´Ïó\\b)?\\ruÍduÙF~Å\\tÌî£æGëkbñGr÷\\tñE»°^ÆE³ÿóâ,Rà»K'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #29
    //   21: istore_1
    //   22: invokestatic Zw : (Z)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #115
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'àâøÀùl|5ª'+øn0{¶åã{±ä|®1Éa¥êSE'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #18
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #38
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zb5s.a : [Ljava/lang/String;
    //   136: bipush #21
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zb5s.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #26
    //   218: goto -> 248
    //   221: bipush #22
    //   223: goto -> 248
    //   226: bipush #57
    //   228: goto -> 248
    //   231: bipush #7
    //   233: goto -> 248
    //   236: bipush #13
    //   238: goto -> 248
    //   241: bipush #34
    //   243: goto -> 248
    //   246: bipush #77
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2EE1) & 0xFFFF;
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
      char c = 'Õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */