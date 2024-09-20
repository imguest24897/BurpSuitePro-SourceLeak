package burp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreePath;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmrj implements Zskg, Zbzs, Zgrm {
  protected Ztdi Zy;
  
  protected Zgd Zm;
  
  protected Zzi ZG;
  
  protected Zslu ZU;
  
  protected Zxgc ZJ;
  
  protected Zgzy Zb;
  
  protected Zkl6 Zf;
  
  protected Zgx0 ZP;
  
  protected Ztos<Zt1_> ZF;
  
  protected Ztwv Zc;
  
  private Zbqc ZL;
  
  protected Zg_q ZI;
  
  protected Zzm_ Zn;
  
  protected Zg8s ZE;
  
  private Zlh4 ZT;
  
  private Zgos Zq;
  
  private Zg8z ZC;
  
  protected final AtomicBoolean Zx = new AtomicBoolean(true);
  
  private final AtomicBoolean ZK = new AtomicBoolean(true);
  
  private final AtomicBoolean ZQ = new AtomicBoolean(false);
  
  private Zbc9 Zk;
  
  private Zbc9 Zr;
  
  protected Zmyz Z_;
  
  private Zbqc ZH;
  
  private Zlte Zd;
  
  private Zmyz Zl;
  
  protected Zmyz Zv;
  
  private Zzpl ZM;
  
  private Zbqc ZV;
  
  private Zbcg ZZ;
  
  private Zbc9 ZB;
  
  private Zbqc ZS;
  
  private Zbcw Zu;
  
  private double ZR = 0.5D;
  
  private PropertyChangeListener Zs;
  
  private Zbkd Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zmrj() {}
  
  public Zmrj(Zerg paramZerg, Ztdi paramZtdi, Zgd paramZgd, Zkf3 paramZkf3, Zzi paramZzi, Zslu paramZslu, boolean paramBoolean1, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zgx0 paramZgx0, boolean paramBoolean2) {
    Zr(paramZerg, paramZtdi, paramZgd, paramZkf3, paramZzi, paramZslu, paramBoolean1, paramZxgc, paramZgzy, paramZkl6, paramZtwv, paramZgx0, paramBoolean2);
  }
  
  protected void Zr(Zerg paramZerg, Ztdi paramZtdi, Zgd paramZgd, Zkf3 paramZkf3, Zzi paramZzi, Zslu paramZslu, boolean paramBoolean1, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zgx0 paramZgx0, boolean paramBoolean2) {
    this.Zy = paramZtdi;
    this.Zm = paramZgd;
    this.ZG = paramZzi;
    this.ZU = paramZslu;
    this.ZJ = paramZxgc;
    this.Zb = paramZgzy;
    this.Zf = paramZkl6;
    this.Zc = paramZtwv;
    this.ZP = paramZgx0;
    this.ZF = new Ztos<>(Zt1_.Ze());
    this.Zg = new Zbkd();
    this.ZL = new Zbqc();
    this.ZL.setLayout(new BorderLayout());
    Zbqc zbqc = new Zbqc(new BorderLayout());
    this.ZT = Zg(paramZzi, paramBoolean1);
    if (this.ZT != null)
      zbqc.add(this.ZT.Zu(), a(-7529, 30410)); 
    if (ZM()) {
      Component component = paramZgx0.ZK();
      component.setName(a(-7551, -25504));
      zbqc.add(component, a(-7540, -31850));
    } 
    this.ZL.add(zbqc, a(-7540, -31850));
    this.Zk = new Zbc9();
    ZN(paramZerg, paramZtdi, paramZzi, paramZtwv, paramBoolean2);
    if (paramZkf3 != null) {
      ZQ(paramZkf3, paramZtdi, paramZerg, paramZgx0, paramBoolean2);
      this.Zu = new Zbcw();
      this.Zu.setBorder(new EmptyBorder(10, 10, 12, 10));
      Zbcm zbcm1 = new Zbcm(new Zm2w(a(-7531, 22100)), Zmrj::lambda$init$0, this::lambda$init$1, null, false);
      this.Zu.Zk(zbcm1);
      Zbcm zbcm2 = new Zbcm(new Zm2w(a(-7552, -11318)), Zmrj::lambda$init$0, this::lambda$init$3, null, false);
      zbcm2.setName(a(-7534, -21930));
      this.Zu.Zk(zbcm2);
      ZN();
      zbqc.add(this.Zu, a(-7545, -1444));
    } 
    this.ZL.add(this.Zk, a(-7529, 30410));
  }
  
  private void ZN() {
    if (this.Zu != null) {
      this.Zu.ZF(0);
      this.Zk.ZP(this.Zr);
    } 
  }
  
  private void ZN(Zerg paramZerg, Ztdi paramZtdi, Zzi paramZzi, Ztwv paramZtwv, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokevirtual ZU : ()Lburp/Zg_q;
    //   5: putfield ZI : Lburp/Zg_q;
    //   8: aload_0
    //   9: getfield ZI : Lburp/Zg_q;
    //   12: aload_0
    //   13: invokevirtual Zq : (Lburp/Zskg;)V
    //   16: aload_0
    //   17: new burp/Zmyz
    //   20: dup
    //   21: iconst_1
    //   22: invokespecial <init> : (I)V
    //   25: putfield Z_ : Lburp/Zmyz;
    //   28: aload_0
    //   29: getfield Z_ : Lburp/Zmyz;
    //   32: bipush #45
    //   34: invokevirtual Za : (I)V
    //   37: new burp/Zbup
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #7
    //   46: aload #7
    //   48: aload_0
    //   49: getfield ZI : Lburp/Zg_q;
    //   52: invokevirtual Zd : ()Ljava/awt/Component;
    //   55: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   58: aload #7
    //   60: invokestatic createEmptyBorder : ()Ljavax/swing/border/Border;
    //   63: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   66: aload_0
    //   67: getfield Z_ : Lburp/Zmyz;
    //   70: aload #7
    //   72: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   75: aload_0
    //   76: new burp/Zbqc
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: putfield ZH : Lburp/Zbqc;
    //   86: invokestatic ZG : ()Ljava/lang/String;
    //   89: aload_0
    //   90: getfield ZH : Lburp/Zbqc;
    //   93: new java/awt/BorderLayout
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   103: aload_0
    //   104: getfield Z_ : Lburp/Zmyz;
    //   107: aload_0
    //   108: getfield ZH : Lburp/Zbqc;
    //   111: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   114: aload_0
    //   115: aload_0
    //   116: invokevirtual Zf : ()Lburp/Zg8s;
    //   119: putfield ZE : Lburp/Zg8s;
    //   122: aload_0
    //   123: aload_0
    //   124: iload #5
    //   126: invokevirtual Za : (Z)Lburp/Zzm_;
    //   129: putfield Zn : Lburp/Zzm_;
    //   132: aload_0
    //   133: aload_0
    //   134: invokevirtual ZH : ()Lburp/Zmyz;
    //   137: putfield Zv : Lburp/Zmyz;
    //   140: astore #6
    //   142: aload_0
    //   143: getfield Zv : Lburp/Zmyz;
    //   146: aload_0
    //   147: getfield Zn : Lburp/Zzm_;
    //   150: invokevirtual ZT : ()Ljava/awt/Component;
    //   153: invokevirtual setTopComponent : (Ljava/awt/Component;)V
    //   156: aload_0
    //   157: getfield Zv : Lburp/Zmyz;
    //   160: aload_0
    //   161: getfield ZE : Lburp/Zg8s;
    //   164: invokevirtual Zk : ()Ljava/awt/Component;
    //   167: invokevirtual setBottomComponent : (Ljava/awt/Component;)V
    //   170: aload_0
    //   171: new burp/Zbqc
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: putfield ZV : Lburp/Zbqc;
    //   181: aload_0
    //   182: getfield ZV : Lburp/Zbqc;
    //   185: new java/awt/BorderLayout
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   195: iload #5
    //   197: ifeq -> 222
    //   200: aload_0
    //   201: getfield ZV : Lburp/Zbqc;
    //   204: new burp/Zrz7
    //   207: dup
    //   208: getstatic burp/Zlkk.PANEL_BORDER : Lburp/Zlkk;
    //   211: invokespecial <init> : (Lburp/Zlkk;)V
    //   214: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   217: aload #6
    //   219: ifnonnull -> 232
    //   222: aload_0
    //   223: getfield Z_ : Lburp/Zmyz;
    //   226: getstatic burp/Zlkk.PANEL_BORDER : Lburp/Zlkk;
    //   229: invokevirtual ZU : (Lburp/Zlkk;)V
    //   232: aload_0
    //   233: getfield ZV : Lburp/Zbqc;
    //   236: aload_0
    //   237: getfield Z_ : Lburp/Zmyz;
    //   240: sipush #-7529
    //   243: sipush #30410
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   252: aload_0
    //   253: new burp/Zbc9
    //   256: dup
    //   257: iconst_1
    //   258: anewarray java/awt/Component
    //   261: dup
    //   262: iconst_0
    //   263: aload_0
    //   264: getfield ZV : Lburp/Zbqc;
    //   267: aastore
    //   268: invokespecial <init> : ([Ljava/awt/Component;)V
    //   271: putfield Zr : Lburp/Zbc9;
    //   274: aload_0
    //   275: invokevirtual ZL : ()Z
    //   278: ifeq -> 286
    //   281: aload_0
    //   282: aload_3
    //   283: invokevirtual Zw : (Lburp/Zzi;)V
    //   286: aload_0
    //   287: invokevirtual Zv : ()Z
    //   290: ifeq -> 451
    //   293: getstatic burp/Zgzq.SITE_MAP_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   296: sipush #-7538
    //   299: sipush #12903
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   308: sipush #-7541
    //   311: sipush #-23639
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   320: sipush #-7539
    //   323: sipush #-12145
    //   326: invokestatic a : (II)Ljava/lang/String;
    //   329: invokevirtual ZE : (Ljava/lang/String;)Lburp/Zltn;
    //   332: getstatic burp/Zlar.TARGET_LEARN_MORE_INFO : Lburp/Zlar;
    //   335: invokevirtual ZN : (Lburp/Zlar;)Lburp/Zltn;
    //   338: astore #8
    //   340: aload_1
    //   341: ifnull -> 363
    //   344: aload #8
    //   346: new burp/Zxtg
    //   349: dup
    //   350: aload_1
    //   351: aload_1
    //   352: invokevirtual Zj : ()Lburp/Zkr0;
    //   355: invokespecial <init> : (Lburp/Zerg;Lburp/Zx8n;)V
    //   358: invokevirtual ZN : (Lburp/Zxtg;)Lburp/Zltn;
    //   361: astore #8
    //   363: aload_0
    //   364: aload #8
    //   366: invokevirtual Zi : ()Lburp/Zbcg;
    //   369: putfield ZZ : Lburp/Zbcg;
    //   372: aload_0
    //   373: getfield Zr : Lburp/Zbc9;
    //   376: aload_0
    //   377: getfield ZZ : Lburp/Zbcg;
    //   380: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   383: pop
    //   384: aload_2
    //   385: invokeinterface Zk : ()Lburp/Zlli;
    //   390: getstatic burp/Zt10.ZH : Lburp/Zlnb;
    //   393: aload_0
    //   394: <illegal opcode> accept : (Lburp/Zmrj;)Ljava/util/function/Consumer;
    //   399: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   404: pop
    //   405: aload_2
    //   406: invokeinterface Zk : ()Lburp/Zlli;
    //   411: getstatic burp/Zt10.ZB : Lburp/Zlnb;
    //   414: aload_0
    //   415: <illegal opcode> accept : (Lburp/Zmrj;)Ljava/util/function/Consumer;
    //   420: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   425: pop
    //   426: aload_2
    //   427: invokeinterface Zk : ()Lburp/Zlli;
    //   432: getstatic burp/Zt10.Zw : Lburp/Zlnb;
    //   435: aload_0
    //   436: <illegal opcode> accept : (Lburp/Zmrj;)Ljava/util/function/Consumer;
    //   441: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   446: pop
    //   447: aload_0
    //   448: invokevirtual Zr : ()V
    //   451: aload_0
    //   452: invokevirtual ZL : ()Z
    //   455: ifeq -> 496
    //   458: aload_0
    //   459: getfield ZF : Lburp/Ztos;
    //   462: getstatic burp/Zt1_.Zz : Lburp/Zlnb;
    //   465: aload_2
    //   466: <illegal opcode> accept : (Lburp/Ztdi;)Ljava/util/function/Consumer;
    //   471: aload #4
    //   473: invokevirtual Zb : (Lburp/Zlnb;Ljava/util/function/Consumer;Ljava/util/concurrent/Executor;)Lburp/Zgrn;
    //   476: pop
    //   477: aload_0
    //   478: getfield ZF : Lburp/Ztos;
    //   481: getstatic burp/Zt1_.ZW : Lburp/Zlnb;
    //   484: aload_2
    //   485: <illegal opcode> accept : (Lburp/Ztdi;)Ljava/util/function/Consumer;
    //   490: aload #4
    //   492: invokevirtual Zb : (Lburp/Zlnb;Ljava/util/function/Consumer;Ljava/util/concurrent/Executor;)Lburp/Zgrn;
    //   495: pop
    //   496: aload_0
    //   497: getfield Zk : Lburp/Zbc9;
    //   500: aload_0
    //   501: getfield Zr : Lburp/Zbc9;
    //   504: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   507: pop
    //   508: return
  }
  
  private void Zr() {
    String str = Zz_1.ZG();
    Runnable runnable = this::lambda$showAppropriateMapPanel$12;
    if (SwingUtilities.isEventDispatchThread()) {
      this.Zc.Zx(runnable);
      if (str == null) {
        runnable.run();
        return;
      } 
      return;
    } 
    runnable.run();
  }
  
  private void Zx(boolean paramBoolean) {
    this.Zr.ZP(paramBoolean ? this.ZZ : this.ZV);
    if (this.ZT != null && this.Zk.ZR(this.Zr))
      this.ZT.Zu().setVisible(!paramBoolean); 
  }
  
  private void Zw(Zzi paramZzi) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield ZP : Lburp/Zgx0;
    //   5: aload_0
    //   6: getfield ZH : Lburp/Zbqc;
    //   9: aload_0
    //   10: getfield ZI : Lburp/Zg_q;
    //   13: new burp/Zlsl
    //   16: dup
    //   17: aload_0
    //   18: invokespecial <init> : (Lburp/Zmrj;)V
    //   21: aload_0
    //   22: getfield ZF : Lburp/Ztos;
    //   25: invokeinterface ZS : (Ljava/awt/Component;Lburp/Zrhs;Lburp/Zg6q;Lburp/Ztos;)Lburp/Zgos;
    //   30: putfield Zq : Lburp/Zgos;
    //   33: aload_0
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> propertyChange : (Lburp/Zmrj;Lburp/Zzi;)Ljava/beans/PropertyChangeListener;
    //   41: putfield Zs : Ljava/beans/PropertyChangeListener;
    //   44: return
  }
  
  private void ZQ(Zkf3 paramZkf3, Ztdi paramZtdi, Zerg paramZerg, Zgx0 paramZgx0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: new burp/Zbc9
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield ZB : Lburp/Zbc9;
    //   11: aload_0
    //   12: aload #4
    //   14: aload_2
    //   15: aload_1
    //   16: aload_0
    //   17: <illegal opcode> Zf : (Lburp/Zmrj;)Lburp/Zr8q;
    //   22: iload #5
    //   24: invokeinterface Zo : (Lburp/Ztdi;Lburp/Zkf3;Lburp/Zr8q;Z)Lburp/Zg8z;
    //   29: putfield ZC : Lburp/Zg8z;
    //   32: aload_0
    //   33: getfield ZB : Lburp/Zbc9;
    //   36: aload_0
    //   37: getfield ZC : Lburp/Zg8z;
    //   40: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   43: pop
    //   44: aload_0
    //   45: invokevirtual Zv : ()Z
    //   48: ifeq -> 130
    //   51: aload_0
    //   52: getstatic burp/Zgzq.SITE_MAP_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   55: sipush #-7532
    //   58: sipush #-29120
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   67: sipush #-7549
    //   70: sipush #-11416
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   79: bipush #48
    //   81: invokevirtual ZC : (I)Lburp/Zltn;
    //   84: getstatic burp/Zlar.TARGET_CRAWL_PATHS_LEARN_MORE_INFO : Lburp/Zlar;
    //   87: invokevirtual ZN : (Lburp/Zlar;)Lburp/Zltn;
    //   90: sipush #-7530
    //   93: sipush #28791
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: getstatic burp/Zxpj.TASKS_ADD : Lburp/Zxpj;
    //   102: aload_0
    //   103: aload_3
    //   104: <illegal opcode> run : (Lburp/Zmrj;Lburp/Zerg;)Ljava/lang/Runnable;
    //   109: invokevirtual Zz : (Ljava/lang/String;Lburp/Zxpj;Ljava/lang/Runnable;)Lburp/Zltn;
    //   112: invokevirtual Zi : ()Lburp/Zbcg;
    //   115: putfield ZS : Lburp/Zbqc;
    //   118: aload_0
    //   119: getfield ZB : Lburp/Zbc9;
    //   122: aload_0
    //   123: getfield ZS : Lburp/Zbqc;
    //   126: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   129: pop
    //   130: aload_0
    //   131: aload_1
    //   132: invokeinterface ZN : ()Ljavax/swing/tree/DefaultTreeModel;
    //   137: invokevirtual getRoot : ()Ljava/lang/Object;
    //   140: checkcast javax/swing/tree/TreeNode
    //   143: invokeinterface getChildCount : ()I
    //   148: invokevirtual ZZ : (I)V
    //   151: aload_0
    //   152: getfield Zk : Lburp/Zbc9;
    //   155: aload_0
    //   156: getfield ZB : Lburp/Zbc9;
    //   159: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   162: pop
    //   163: return
  }
  
  private void ZZ(int paramInt) {
    this.ZB.ZP((this.ZS != null && paramInt == 0) ? this.ZS : this.ZC);
  }
  
  Zmrj Zn() {
    Zgq4 zgq4 = new Zgq4();
    Zmrj zmrj = this.ZP.ZZ(this.Zy, this.Zm.Zz(zgq4), this.ZG.Za6(), this.ZU, false, this.ZJ, this.Zb, this.Zf);
    zmrj.Zg(zgq4);
    return zmrj;
  }
  
  private void Zg(Zgq4 paramZgq4) {
    ZI();
    this.ZT.Zt();
    Zy();
    paramZgq4.ZB(this);
  }
  
  protected boolean Zv() {
    return true;
  }
  
  protected boolean ZM() {
    return true;
  }
  
  protected boolean ZL() {
    return true;
  }
  
  public void Zb() {
    ZI();
    this.ZT.Zt2();
  }
  
  private void ZI() {
    String str = Zz_1.ZG();
    if (ZL()) {
      switch (Zz08.Zs[this.ZG.Zaf().ordinal()]) {
        case 1:
          Zo();
          if (str == null);
          return;
        case 2:
          ZK();
          if (str == null)
            break; 
          return;
      } 
      Zuh.Zb(false, Zqf.Zk);
      if (str == null) {
        ZI(this.Zv);
        return;
      } 
      return;
    } 
    ZI(this.Zv);
  }
  
  public void Zw(Zez3 paramZez3, Color paramColor) {
    if (ZL() && this.ZG.Zaf() == Zzpl.TABBED && this.ZI.Zr(paramZez3))
      this.Zd.Z_(1, paramColor, true); 
  }
  
  private void Zo() {
    if (this.ZM == Zzpl.TABBED)
      return; 
    this.ZM = Zzpl.TABBED;
    this.Zq.Zd(this.Zs);
    this.Zv.removePropertyChangeListener(a(-7548, 30811), this.Zs);
    this.Zg.Zj("");
    this.Zd = new Zxer();
    this.Zd.addTab(a(-7537, -5676), this.Zv);
    this.Zd.addTab(a(-7543, 15076), this.Zq);
    ZI(this.Zd.ZO());
  }
  
  private void ZK() {
    if (this.ZM == Zzpl.SIDE_BY_SIDE)
      return; 
    this.ZM = Zzpl.SIDE_BY_SIDE;
    this.Zl = new Zmyz(1);
    this.Zl.setLeftComponent(this.Zv);
    this.Zl.setRightComponent(Zf(this.Zq, a(-7544, 28938)));
    this.Zl.setResizeWeight(this.ZR);
    this.Zg.Zj(a(-7546, -8483));
    this.Zl.addPropertyChangeListener(a(-7550, 11952), new Zs6u(this));
    ZI(this.Zl);
    this.Zq.Zc(this.Zv.getDividerLocation());
    this.Zq.ZS(this.Zs);
    this.Zv.addPropertyChangeListener(a(-7548, 30811), this.Zs);
    this.ZQ.set(true);
  }
  
  private Component Zf(Component paramComponent, String paramString) {
    Zbqc zbqc = new Zbqc(new BorderLayout());
    Zbkc zbkc = new Zbkc();
    zbkc.setBorder(new EmptyBorder(5, 5, 1, 0));
    zbkc.Zx(paramString);
    zbqc.add(zbkc, a(-7547, 17513));
    zbqc.add(paramComponent, a(-7529, 30410));
    return zbqc;
  }
  
  protected Zmyz ZH() {
    Zmyz zmyz = new Zmyz(0);
    zmyz.Za(30);
    return zmyz;
  }
  
  protected Zlh4 Zg(Zzi paramZzi, boolean paramBoolean) {
    Zlh4 zlh4 = this.ZP.Zx(paramZzi, this.Zm, paramBoolean);
    this.ZU.ZH(zlh4);
    return zlh4;
  }
  
  protected Zg8s Zf() {
    return this.ZP.ZP(this.Zf, this.Zy.Zk());
  }
  
  protected Zg_q ZU() {
    Zlpy zlpy = new Zlpy(this.ZU, this::lambda$makeMapTreePanel$15);
    return this.ZP.Zp(this.Zy, this.Zm, this, this.ZG, this.ZJ, this.Zb, zlpy, this.Zf);
  }
  
  protected Zzm_ Za(boolean paramBoolean) {
    return this.ZP.Zv(this.Zy, this, this.ZI, this.ZE, this.Zg, paramBoolean);
  }
  
  public void Zy() {
    this.ZI.Zc();
    if (this.ZC != null)
      this.ZC.Zy(); 
  }
  
  public void Z_() {
    this.ZU.Z_(this.ZT);
    this.ZI.Zx();
    if (this.ZC != null)
      this.ZC.ZA(); 
  }
  
  public Component ZC() {
    return this.ZL;
  }
  
  void ZI(Component paramComponent) {
    this.ZH.removeAll();
    this.ZH.add(paramComponent, a(-7542, 5607));
    Zbsv.Zb(this::lambda$setRightHandPanel$16);
  }
  
  void ZB() {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual ZL : ()Z
    //   8: ifeq -> 95
    //   11: getstatic burp/Zz08.Zs : [I
    //   14: aload_0
    //   15: getfield ZG : Lburp/Zzi;
    //   18: invokeinterface Zaf : ()Lburp/Zzpl;
    //   23: invokevirtual ordinal : ()I
    //   26: iaload
    //   27: lookupswitch default -> 91, 1 -> 52, 2 -> 76
    //   52: aload_0
    //   53: getfield Zd : Lburp/Zlte;
    //   56: ifnull -> 91
    //   59: aload_0
    //   60: aload_0
    //   61: getfield Zd : Lburp/Zlte;
    //   64: invokeinterface ZO : ()Ljavax/swing/JComponent;
    //   69: invokevirtual ZI : (Ljava/awt/Component;)V
    //   72: aload_1
    //   73: ifnonnull -> 91
    //   76: aload_0
    //   77: getfield Zl : Lburp/Zmyz;
    //   80: ifnull -> 91
    //   83: aload_0
    //   84: aload_0
    //   85: getfield Zl : Lburp/Zmyz;
    //   88: invokevirtual ZI : (Ljava/awt/Component;)V
    //   91: aload_1
    //   92: ifnonnull -> 103
    //   95: aload_0
    //   96: aload_0
    //   97: getfield Zv : Lburp/Zmyz;
    //   100: invokevirtual ZI : (Ljava/awt/Component;)V
    //   103: return
  }
  
  public Ze3h Zt() {
    return this.ZI.ZX();
  }
  
  public void ZR() {
    Zq(this::lambda$selectFirstItem$17);
  }
  
  public void ZG(Zez3 paramZez3) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZN : ()V
    //   4: aload_0
    //   5: getfield Zm : Lburp/Zgd;
    //   8: aload_1
    //   9: invokevirtual Zu : (Lburp/Zez3;)Z
    //   12: ifeq -> 26
    //   15: aload_0
    //   16: aload_0
    //   17: aload_1
    //   18: <illegal opcode> run : (Lburp/Zmrj;Lburp/Zez3;)Ljava/lang/Runnable;
    //   23: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   26: return
  }
  
  public void Zj() {
    Zt(null);
  }
  
  public void Zt(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zmrj;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void Zy(TreePath[] paramArrayOfTreePath, Zbfx paramZbfx) {
    String str = Zz_1.ZG();
    this.Zn.Zx(paramArrayOfTreePath, paramZbfx, this.Zx);
    if (ZL()) {
      ArrayList<Zrdb> arrayList = new ArrayList();
      Ze3h ze3h = Zgme.Zk(paramArrayOfTreePath).ZU(paramZbfx).Zi(paramZbfx);
      for (Zz_1 zz_1 : ze3h) {
        if (paramZbfx.Zz())
          return; 
        if (((Zxya)zz_1.Z_()).ZK() != null)
          arrayList.addAll(((Zxya)zz_1.Z_()).ZK()); 
        if (str == null)
          break; 
      } 
      this.Zq.Zb(arrayList, paramZbfx);
    } 
  }
  
  public void Zf(Collection<Zrdb> paramCollection) {
    if (ZL() && !paramCollection.isEmpty())
      this.Zq.Zu(paramCollection); 
  }
  
  public void ZD(Collection<Zrdb> paramCollection) {
    if (ZL() && !paramCollection.isEmpty())
      this.Zq.ZK(paramCollection); 
  }
  
  public void ZQ(Collection<Zrdb> paramCollection) {
    if (ZL() && !paramCollection.isEmpty())
      this.Zq.ZP(paramCollection); 
  }
  
  public void ZZ(Zrdb paramZrdb) {
    if (ZL())
      this.Zq.ZA(Collections.singletonList(paramZrdb)); 
  }
  
  public void ZK(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Z_ : ()Ljava/lang/Object;
    //   4: checkcast burp/Zxya
    //   7: getfield Zp : B
    //   10: i2l
    //   11: lconst_1
    //   12: invokestatic Zc : (JJ)Z
    //   15: ifeq -> 28
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> run : (Lburp/Zmrj;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   25: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   28: aload_0
    //   29: invokevirtual ZL : ()Z
    //   32: ifeq -> 55
    //   35: aload_1
    //   36: invokevirtual Z_ : ()Ljava/lang/Object;
    //   39: checkcast burp/Zxya
    //   42: invokevirtual ZK : ()Ljava/util/List;
    //   45: astore_2
    //   46: aload_2
    //   47: ifnull -> 55
    //   50: aload_0
    //   51: aload_2
    //   52: invokevirtual Zf : (Ljava/util/Collection;)V
    //   55: return
  }
  
  public void Zj(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZZ : ()Lburp/Ze3h;
    //   4: astore_3
    //   5: invokestatic ZG : ()Ljava/lang/String;
    //   8: aload_0
    //   9: aload_3
    //   10: <illegal opcode> run : (Lburp/Zmrj;Lburp/Ze3h;)Ljava/lang/Runnable;
    //   15: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   18: astore_2
    //   19: aload_0
    //   20: invokevirtual ZL : ()Z
    //   23: ifeq -> 85
    //   26: aload_3
    //   27: invokevirtual iterator : ()Ljava/util/Iterator;
    //   30: astore #4
    //   32: aload #4
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 85
    //   42: aload #4
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: checkcast burp/Zz_1
    //   52: astore #5
    //   54: aload #5
    //   56: invokevirtual Z_ : ()Ljava/lang/Object;
    //   59: checkcast burp/Zxya
    //   62: invokevirtual ZK : ()Ljava/util/List;
    //   65: astore #6
    //   67: aload #6
    //   69: ifnull -> 81
    //   72: aload_0
    //   73: getfield Zq : Lburp/Zgos;
    //   76: aload #6
    //   78: invokevirtual ZA : (Ljava/util/Collection;)V
    //   81: aload_2
    //   82: ifnonnull -> 32
    //   85: return
  }
  
  public void Zg(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zmrj;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZW(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zmrj;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  Zz_1 ZX() {
    return this.ZE.Zq();
  }
  
  public void ZD() {
    ZI();
  }
  
  protected void Zq(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zmrj;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$performTableSelectionAction$24(Runnable paramRunnable) {
    this.Zx.set(false);
    paramRunnable.run();
    this.Zx.set(true);
  }
  
  private void lambda$nodeSelected$23(Zz_1 paramZz_1) {
    this.ZE.ZP(paramZz_1);
  }
  
  private void lambda$nodeUpdated$22(Zz_1 paramZz_1) {
    this.Zn.Zp(paramZz_1);
  }
  
  private void lambda$removeNodeFromSelection$21(Ze3h paramZe3h) {
    this.Zn.Zj(paramZe3h);
  }
  
  private void lambda$addNodeToCurrentSelection$20(Zz_1 paramZz_1) {
    this.Zn.Z_(paramZz_1);
  }
  
  private void lambda$selectTableItem$19(Zz_1 paramZz_1) {
    this.Zn.Zj(paramZz_1);
  }
  
  private void lambda$selectItem$18(Zez3 paramZez3) {
    this.Zn.Zj(this.ZI.Zm(paramZez3));
  }
  
  private void lambda$selectFirstItem$17() {
    this.ZI.ZP();
    this.Zn.ZE();
  }
  
  private void lambda$setRightHandPanel$16() {
    Zmse.ZF(this.ZH);
  }
  
  private Zrek lambda$makeMapTreePanel$15() {
    return this.ZJ;
  }
  
  private void lambda$initPaths$14(Zerg paramZerg) {
    paramZerg.Zk().ZV(this.ZB);
  }
  
  private void lambda$buildIssuePanels$13(Zzi paramZzi, PropertyChangeEvent paramPropertyChangeEvent) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: invokeinterface Zaf : ()Lburp/Zzpl;
    //   10: getstatic burp/Zzpl.SIDE_BY_SIDE : Lburp/Zzpl;
    //   13: if_acmpne -> 95
    //   16: aload_0
    //   17: getfield ZQ : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   20: invokevirtual get : ()Z
    //   23: ifeq -> 52
    //   26: aload_0
    //   27: getfield Zq : Lburp/Zgos;
    //   30: aload_0
    //   31: getfield Zv : Lburp/Zmyz;
    //   34: invokevirtual getDividerLocation : ()I
    //   37: invokevirtual Zc : (I)V
    //   40: aload_0
    //   41: getfield ZQ : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   44: iconst_0
    //   45: invokevirtual set : (Z)V
    //   48: aload_3
    //   49: ifnonnull -> 95
    //   52: aload_2
    //   53: invokevirtual getSource : ()Ljava/lang/Object;
    //   56: aload_0
    //   57: getfield Zv : Lburp/Zmyz;
    //   60: if_acmpne -> 81
    //   63: aload_0
    //   64: getfield Zq : Lburp/Zgos;
    //   67: aload_0
    //   68: getfield Zv : Lburp/Zmyz;
    //   71: invokevirtual getDividerLocation : ()I
    //   74: invokevirtual Zc : (I)V
    //   77: aload_3
    //   78: ifnonnull -> 95
    //   81: aload_0
    //   82: getfield Zv : Lburp/Zmyz;
    //   85: aload_0
    //   86: getfield Zq : Lburp/Zgos;
    //   89: invokevirtual ZC : ()I
    //   92: invokevirtual setDividerLocation : (I)V
    //   95: return
  }
  
  private void lambda$showAppropriateMapPanel$12() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZZ : Lburp/Zbcg;
    //   4: ifnull -> 23
    //   7: aload_0
    //   8: getfield Zy : Lburp/Ztdi;
    //   11: invokeinterface ZA : ()Z
    //   16: ifeq -> 23
    //   19: iconst_1
    //   20: goto -> 24
    //   23: iconst_0
    //   24: istore_1
    //   25: aload_0
    //   26: iload_1
    //   27: <illegal opcode> run : (Lburp/Zmrj;Z)Ljava/lang/Runnable;
    //   32: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   35: return
  }
  
  private void lambda$showAppropriateMapPanel$11(boolean paramBoolean) {
    Zx(paramBoolean);
  }
  
  private static void lambda$initMap$10(Ztdi paramZtdi, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZtdi::lambda$initMap$9);
  }
  
  private static void lambda$initMap$9(Ztdi paramZtdi, Zgp5 paramZgp5) {
    paramZtdi.ZP(paramZgp5.ZYI());
  }
  
  private static void lambda$initMap$8(Ztdi paramZtdi, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZtdi::lambda$initMap$7);
  }
  
  private static void lambda$initMap$7(Ztdi paramZtdi, Zgp5 paramZgp5) {
    paramZtdi.Zq(paramZgp5.ZYI());
  }
  
  private void lambda$initMap$6(Zxr8 paramZxr8) {
    Zx(true);
  }
  
  private void lambda$initMap$5(Zxr8 paramZxr8) {
    Zr();
  }
  
  private void lambda$initMap$4(Zxr8 paramZxr8) {
    Zx(false);
  }
  
  private void lambda$init$3() {
    this.Zk.ZP(this.ZB);
    this.ZT.Zu().setVisible(false);
    Zm2.ZC(Zrrh.SCANNER_TASK_CRAWL_PATHS_VIEW_OPENED);
  }
  
  private void lambda$init$1() {
    this.Zk.ZP(this.Zr);
    Zr();
  }
  
  private static boolean lambda$init$0() {
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '7þì_.=ÍÊ<Bü]a-CÚmô©;$\\nÒ,¸ßÆ>KÂ²Õó"äWró¶}1|@1fj ÎÞC=Z eó¤8ê\\fÖ'ÝQs¼ÎÃß1Ç£~Å¨tú0gd\\nÔ½¬Îµ+Á¹cÖ·ÿl»!Ĭ`7qÀ)e·fNâYËbDs{ý¥>ËGîopåÜD²p×:»Ì~ê\\fõv\\b½ãçüßð3ÇÚÂ¡ÿÏ\\t§8@½kgÍ!;®5ÔDIÇf)kW{Îòíbv\\fDÏCÖøhJ½«>SÏbYèm%²ôÛ¸ÜìDw ÊNf]oºÃèáÕ×j·kªÑÒ¢²^HÖ:ß8Rç\\b¤Ý$FÙ^H¹Km#õkûàXÃx»4+¾4 )¡5ç8G©\\rõ^æa'H"Ù¨ë)Ð/gúÃËÝ¯j%ÚjSêXSzLÖlÅçv\\bº«µ?^._¼ß.+ÞÄµk­Í\\r`Iø_3/+¥\\b©ÌÓWÙÌ&\\f$íØ¤çä=\\fÐºÜa¿¨[¼÷m÷×ãú¸<q`p\5w±ðØ\®esöarÂþ\\b\\byâþ?Lå´¦0MąhÂ%:N@vu\d3¢öÃEÍ4¬ù|%aÛaE/ßíþÝú§-ºK«'|Ì£ý\\tÃ0àØÅô_uÊTAïÞ£ÂÀâeæÎ¯3´âÐçÄ×+ÔÆìÜVÛ@5ÃèHÀë©6¦Î­°µ]íz¢¦øsä±v. Jª'\\b Ûã´RqBh6\\rO ðFPpúå"É9¥ÍÌGdÚyüTÑx(f_ÀUVæ1'Ñ°¤òËñLú­e¾ùúxB'½µÄÈãÀâ¾í<¡±Á`Q1£hÝàË2¯Ö(AyÛ¢MHI×+'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #94
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
    //   68: ldc '°°§Z-½ÕLÑ\CwfüciÔÌ¸Ú'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
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
    //   129: putstatic burp/Zmrj.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmrj.b : [Ljava/lang/String;
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
    //   212: bipush #24
    //   214: goto -> 244
    //   217: bipush #60
    //   219: goto -> 244
    //   222: bipush #53
    //   224: goto -> 244
    //   227: bipush #42
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #119
    //   239: goto -> 244
    //   242: bipush #21
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
    int i = (paramInt1 ^ 0xFFFFE286) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmrj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */