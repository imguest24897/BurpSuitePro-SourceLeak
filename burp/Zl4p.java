package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zl4p extends Zl40 implements ActionListener, Zky2, Zeq {
  Zerg ZW;
  
  Zskh ZU;
  
  Zez3[] Zb;
  
  Zbnt ZV;
  
  private final Ztwv Zw;
  
  private Zz0n ZE;
  
  private Zt4u Zc;
  
  private Zz_r ZP;
  
  private Zbx0 Z_;
  
  private Zbws Zy;
  
  private Zt_t ZR;
  
  private Zxaj Zd;
  
  private Zqy ZO;
  
  private int Zu;
  
  private Timer ZN;
  
  private byte Zx;
  
  private Zzdy Zo;
  
  private Ze01 Zl;
  
  private Ze01 ZI;
  
  private Zm99 Zh;
  
  private Zbqc ZZ;
  
  private Zm99 ZB;
  
  private Zm99 Zt;
  
  private Zbqc ZH;
  
  private Zbqc ZJ;
  
  private Zbqc ZX;
  
  private Zbup Za;
  
  private Zmyz ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zl4p(Window paramWindow, Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zz_r paramZz_r, Zgb6 paramZgb6, Zskh paramZskh, Zbnt paramZbnt, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Zez3[] paramArrayOfZez3, Ztp2 paramZtp2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZU : ()Ljava/lang/String;
    //   7: aload_0
    //   8: aload #9
    //   10: putfield Zw : Lburp/Ztwv;
    //   13: astore #15
    //   15: aload_0
    //   16: aload_2
    //   17: putfield ZE : Lburp/Zz0n;
    //   20: aload_0
    //   21: aload_3
    //   22: putfield Zc : Lburp/Zt4u;
    //   25: aload_0
    //   26: aload #4
    //   28: putfield ZW : Lburp/Zerg;
    //   31: aload_0
    //   32: aload #5
    //   34: putfield ZP : Lburp/Zz_r;
    //   37: aload_0
    //   38: aload #7
    //   40: putfield ZU : Lburp/Zskh;
    //   43: aload_0
    //   44: aload #8
    //   46: putfield ZV : Lburp/Zbnt;
    //   49: aload_0
    //   50: aload #13
    //   52: putfield Zb : [Lburp/Zez3;
    //   55: aload_0
    //   56: invokevirtual Zl : ()V
    //   59: aload_0
    //   60: getfield Za : Lburp/Zbup;
    //   63: bipush #120
    //   65: bipush #30
    //   67: invokestatic Zf : (Ljava/awt/Component;II)V
    //   70: aload #13
    //   72: ifnull -> 264
    //   75: aload #13
    //   77: arraylength
    //   78: lookupswitch default -> 197, 1 -> 104, 2 -> 146
    //   104: aload_0
    //   105: aload_0
    //   106: invokevirtual ZC : ()Ljava/lang/String;
    //   109: aload #13
    //   111: iconst_0
    //   112: aaload
    //   113: invokeinterface ZlL : ()Lburp/Zlit;
    //   118: invokeinterface toString : ()Ljava/lang/String;
    //   123: sipush #8296
    //   126: sipush #25466
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: swap
    //   133: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   138: invokevirtual setTitle : (Ljava/lang/String;)V
    //   141: aload #15
    //   143: ifnull -> 286
    //   146: aload_0
    //   147: aload_0
    //   148: invokevirtual ZC : ()Ljava/lang/String;
    //   151: aload #13
    //   153: iconst_0
    //   154: aaload
    //   155: invokeinterface ZlL : ()Lburp/Zlit;
    //   160: invokeinterface toString : ()Ljava/lang/String;
    //   165: sipush #8317
    //   168: sipush #-11994
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: swap
    //   175: sipush #8313
    //   178: sipush #-8685
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   189: invokevirtual setTitle : (Ljava/lang/String;)V
    //   192: aload #15
    //   194: ifnull -> 286
    //   197: aload_0
    //   198: aload_0
    //   199: invokevirtual ZC : ()Ljava/lang/String;
    //   202: aload #13
    //   204: iconst_0
    //   205: aaload
    //   206: invokeinterface ZlL : ()Lburp/Zlit;
    //   211: invokeinterface toString : ()Ljava/lang/String;
    //   216: aload #13
    //   218: arraylength
    //   219: iconst_1
    //   220: isub
    //   221: sipush #8317
    //   224: sipush #-11994
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: dup_x2
    //   231: pop
    //   232: sipush #8305
    //   235: sipush #-2407
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: swap
    //   242: sipush #8312
    //   245: sipush #30253
    //   248: invokestatic a : (II)Ljava/lang/String;
    //   251: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   256: invokevirtual setTitle : (Ljava/lang/String;)V
    //   259: aload #15
    //   261: ifnull -> 286
    //   264: aload_0
    //   265: aload_0
    //   266: invokevirtual ZC : ()Ljava/lang/String;
    //   269: sipush #8306
    //   272: sipush #20986
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   283: invokevirtual setTitle : (Ljava/lang/String;)V
    //   286: aload_0
    //   287: getfield Zl : Lburp/Ze01;
    //   290: aload_0
    //   291: invokevirtual ZC : ()Ljava/lang/String;
    //   294: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   297: sipush #8293
    //   300: sipush #-15959
    //   303: invokestatic a : (II)Ljava/lang/String;
    //   306: swap
    //   307: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   312: invokevirtual setText : (Ljava/lang/String;)V
    //   315: aload_0
    //   316: iconst_0
    //   317: invokevirtual setDefaultCloseOperation : (I)V
    //   320: aload_0
    //   321: new burp/Ze71
    //   324: dup
    //   325: aload_0
    //   326: invokespecial <init> : (Lburp/Zl4p;)V
    //   329: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   332: aload_0
    //   333: new burp/Zt_t
    //   336: dup
    //   337: invokespecial <init> : ()V
    //   340: putfield ZR : Lburp/Zt_t;
    //   343: aload_0
    //   344: getfield ZR : Lburp/Zt_t;
    //   347: aload_0
    //   348: <illegal opcode> tableChanged : (Lburp/Zl4p;)Ljavax/swing/event/TableModelListener;
    //   353: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   356: aload_0
    //   357: new burp/Zbws
    //   360: dup
    //   361: aload_0
    //   362: getfield ZR : Lburp/Zt_t;
    //   365: invokespecial <init> : (Lburp/Zztu;)V
    //   368: putfield Zy : Lburp/Zbws;
    //   371: aload_0
    //   372: getfield Za : Lburp/Zbup;
    //   375: aload_0
    //   376: getfield Zy : Lburp/Zbws;
    //   379: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   382: aload_0
    //   383: aload #12
    //   385: aload_0
    //   386: invokevirtual ZK : (Lburp/Zl04;)Lburp/Zqy;
    //   389: putfield ZO : Lburp/Zqy;
    //   392: aload_0
    //   393: getfield Zy : Lburp/Zbws;
    //   396: aload_0
    //   397: invokevirtual Zk : (Lburp/Zky2;)V
    //   400: aload_0
    //   401: getfield Zy : Lburp/Zbws;
    //   404: aload_0
    //   405: invokevirtual Zc : (Lburp/Zeq;)V
    //   408: aload_3
    //   409: invokevirtual Ze : ()Lburp/Zkl6;
    //   412: astore #16
    //   414: new burp/Ze47
    //   417: dup
    //   418: aload #16
    //   420: invokeinterface ZM : ()Lburp/Ztbb;
    //   425: aload #6
    //   427: dup
    //   428: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   431: pop
    //   432: <illegal opcode> get : (Lburp/Zgb6;)Ljava/util/function/Supplier;
    //   437: invokespecial <init> : (Lburp/Ztbb;Ljava/util/function/Supplier;)V
    //   440: astore #17
    //   442: aload_0
    //   443: new burp/Zxaj
    //   446: dup
    //   447: aload_2
    //   448: aload #6
    //   450: aload #9
    //   452: aload #10
    //   454: aload #11
    //   456: aload_0
    //   457: invokevirtual ZC : ()Ljava/lang/String;
    //   460: aload #16
    //   462: aload #17
    //   464: aload #14
    //   466: invokespecial <init> : (Lburp/Zz0n;Lburp/Zgb6;Lburp/Ztwv;Lburp/Ztyg;Lburp/Zgq7;Ljava/lang/String;Lburp/Zkl6;Lburp/Ze47;Lburp/Ztp2;)V
    //   469: putfield Zd : Lburp/Zxaj;
    //   472: aload_0
    //   473: getfield ZL : Lburp/Zmyz;
    //   476: aload_0
    //   477: getfield Zd : Lburp/Zxaj;
    //   480: invokevirtual setBottomComponent : (Ljava/awt/Component;)V
    //   483: aload_0
    //   484: getfield ZL : Lburp/Zmyz;
    //   487: bipush #35
    //   489: invokevirtual Za : (I)V
    //   492: aload_0
    //   493: invokevirtual pack : ()V
    //   496: aload_0
    //   497: aload_1
    //   498: invokevirtual ZO : (Ljava/awt/Window;)V
    //   501: aload_0
    //   502: iconst_1
    //   503: invokevirtual setVisible : (Z)V
    //   506: aload_0
    //   507: new javax/swing/Timer
    //   510: dup
    //   511: sipush #1000
    //   514: aload_0
    //   515: invokespecial <init> : (ILjava/awt/event/ActionListener;)V
    //   518: putfield ZN : Ljavax/swing/Timer;
    //   521: aload_0
    //   522: getfield ZN : Ljavax/swing/Timer;
    //   525: iconst_0
    //   526: invokevirtual setInitialDelay : (I)V
    //   529: aload_0
    //   530: aload_0
    //   531: invokevirtual Zs : ()Lburp/Zbx0;
    //   534: putfield Z_ : Lburp/Zbx0;
    //   537: aload_0
    //   538: getfield ZN : Ljavax/swing/Timer;
    //   541: invokevirtual restart : ()V
    //   544: aload_0
    //   545: iconst_0
    //   546: putfield Zu : I
    //   549: aload_0
    //   550: getfield ZB : Lburp/Zm99;
    //   553: sipush #8308
    //   556: sipush #26324
    //   559: invokestatic a : (II)Ljava/lang/String;
    //   562: iconst_1
    //   563: anewarray java/lang/Object
    //   566: dup
    //   567: iconst_0
    //   568: iconst_0
    //   569: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   572: aastore
    //   573: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   576: invokevirtual setText : (Ljava/lang/String;)V
    //   579: aload_0
    //   580: <illegal opcode> run : (Lburp/Zl4p;)Ljava/lang/Runnable;
    //   585: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   588: invokestatic Zwu : ()[Lburp/Zbqc;
    //   591: ifnonnull -> 599
    //   594: ldc 'Brqat'
    //   596: invokestatic Zp : (Ljava/lang/String;)V
    //   599: return
  }
  
  protected abstract String ZC();
  
  protected abstract Zbx0 Zs();
  
  void Za(Zbx0 paramZbx0, Zmj3 paramZmj3) {
    if (paramZbx0 != this.Z_)
      return; 
    this.ZR.Zb(paramZmj3);
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    this.Zd.ZT(this.ZR.ZZ(this.Zy.convertRowIndexToModel(paramInt1)));
  }
  
  private void Zl() {
    this.ZH = new Zbqc();
    this.ZJ = new Zbqc();
    this.ZZ = new Zbqc();
    this.ZI = new Ze01();
    this.Zh = new Zm99();
    this.Zo = new Zzdy();
    this.Zl = new Ze01();
    this.ZX = new Zbqc();
    this.Zt = new Zm99();
    this.ZB = new Zm99();
    this.ZL = new Zmyz();
    this.Za = new Zbup();
    this.ZH.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.ZH.setLayout(new BorderLayout(0, 5));
    this.ZJ.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.ZJ.setLayout(new BorderLayout());
    this.ZZ.setLayout(new FlowLayout(0, 0, 0));
    this.ZI.setText(a(8267, 14978));
    this.ZI.addActionListener(this::lambda$initComponents$3);
    this.ZZ.add(this.ZI);
    this.Zh.setText(a(8302, -20178));
    this.ZZ.add(this.Zh);
    this.Zo.setText(a(8294, 29473));
    this.Zo.addActionListener(this::lambda$initComponents$4);
    this.ZZ.add(this.Zo);
    this.ZJ.add(this.ZZ, a(8300, 3347));
    this.Zl.setText(a(8315, -1982));
    this.Zl.setEnabled(false);
    this.Zl.addActionListener(this::lambda$initComponents$5);
    this.ZJ.add(this.Zl, a(8295, -11851));
    this.ZH.add(this.ZJ, a(8299, 5604));
    this.ZX.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    this.ZX.setLayout(new BorderLayout());
    this.ZX.add(this.Zt, a(8310, 24479));
    this.ZX.add(this.ZB, a(8304, 19095));
    this.ZH.add(this.ZX, a(8311, -17095));
    this.ZL.setOrientation(0);
    this.ZL.setLeftComponent(this.Za);
    this.ZH.add(this.ZL, a(8266, -2780));
    getContentPane().add(this.ZH, a(8289, -17621));
    pack();
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    String str = Zl41.ZU();
    switch (this.Zx) {
      case 0:
        this.Zl.setEnabled(true);
        this.ZR.Zt();
        this.Zd.ZT(null);
        if (this.Zo.isSelected())
          this.ZP.Zy(this.Z_); 
        this.Zx = 1;
        this.ZN.restart();
        this.Zu = 0;
        this.ZB.setText(a(8297, -20326));
        this.ZI.setText(a(8288, -32636));
        this.Zw.Zx(this::lambda$cmdGoCancelActionPerformed$6);
        if (str != null);
        return;
      case 1:
        this.Z_.ZP();
        this.Zx = 0;
        this.Zt.setText(a(8316, -26100));
        this.ZI.setText(a(8267, 14978));
        if (str != null)
          break; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zx);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zbx0;
    //   8: ifnull -> 127
    //   11: aload_0
    //   12: getfield Zo : Lburp/Zzdy;
    //   15: invokevirtual isSelected : ()Z
    //   18: ifeq -> 76
    //   21: aload_0
    //   22: getfield ZP : Lburp/Zz_r;
    //   25: aload_0
    //   26: getfield Z_ : Lburp/Zbx0;
    //   29: invokeinterface Zy : (Lburp/Zbx0;)V
    //   34: aload_0
    //   35: getfield Zt : Lburp/Zm99;
    //   38: invokevirtual getText : ()Ljava/lang/String;
    //   41: sipush #8303
    //   44: sipush #-21444
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 127
    //   56: aload_0
    //   57: getfield Zt : Lburp/Zm99;
    //   60: sipush #8314
    //   63: sipush #10914
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual setText : (Ljava/lang/String;)V
    //   72: aload_2
    //   73: ifnull -> 127
    //   76: aload_0
    //   77: getfield ZP : Lburp/Zz_r;
    //   80: aload_0
    //   81: getfield Z_ : Lburp/Zbx0;
    //   84: invokeinterface Za : (Lburp/Zbx0;)V
    //   89: aload_0
    //   90: getfield Zt : Lburp/Zm99;
    //   93: invokevirtual getText : ()Ljava/lang/String;
    //   96: sipush #8318
    //   99: sipush #30894
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual equals : (Ljava/lang/Object;)Z
    //   108: ifeq -> 127
    //   111: aload_0
    //   112: getfield Zt : Lburp/Zm99;
    //   115: sipush #8292
    //   118: sipush #23916
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual setText : (Ljava/lang/String;)V
    //   127: return
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    new Zrsw(this.Zc, this, ZC(), this.ZR.ZK(), this.ZE.ZD());
  }
  
  Zll9[] ZR() {
    return Z_((Point)null, false);
  }
  
  private Zll9[] Z_(Point paramPoint, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zy : Lburp/Zbws;
    //   8: invokevirtual getSelectedRows : ()[I
    //   11: astore #5
    //   13: iload_2
    //   14: ifeq -> 24
    //   17: aload #5
    //   19: arraylength
    //   20: iconst_1
    //   21: if_icmple -> 78
    //   24: aload #5
    //   26: arraylength
    //   27: anewarray burp/Zll9
    //   30: astore #4
    //   32: iconst_0
    //   33: istore #6
    //   35: iload #6
    //   37: aload #5
    //   39: arraylength
    //   40: if_icmpge -> 74
    //   43: aload #4
    //   45: iload #6
    //   47: aload_0
    //   48: getfield ZR : Lburp/Zt_t;
    //   51: aload_0
    //   52: getfield Zy : Lburp/Zbws;
    //   55: aload #5
    //   57: iload #6
    //   59: iaload
    //   60: invokevirtual convertRowIndexToModel : (I)I
    //   63: invokevirtual ZZ : (I)Lburp/Zll9;
    //   66: aastore
    //   67: iinc #6, 1
    //   70: aload_3
    //   71: ifnull -> 35
    //   74: aload_3
    //   75: ifnull -> 139
    //   78: aload_1
    //   79: ifnull -> 133
    //   82: aload_0
    //   83: getfield Zy : Lburp/Zbws;
    //   86: aload_1
    //   87: invokevirtual rowAtPoint : (Ljava/awt/Point;)I
    //   90: istore #6
    //   92: iload #6
    //   94: iconst_m1
    //   95: if_icmpne -> 103
    //   98: iconst_0
    //   99: anewarray burp/Zll9
    //   102: areturn
    //   103: iconst_1
    //   104: anewarray burp/Zll9
    //   107: astore #4
    //   109: aload #4
    //   111: iconst_0
    //   112: aload_0
    //   113: getfield ZR : Lburp/Zt_t;
    //   116: aload_0
    //   117: getfield Zy : Lburp/Zbws;
    //   120: iload #6
    //   122: invokevirtual convertRowIndexToModel : (I)I
    //   125: invokevirtual ZZ : (I)Lburp/Zll9;
    //   128: aastore
    //   129: aload_3
    //   130: ifnull -> 139
    //   133: iconst_0
    //   134: anewarray burp/Zll9
    //   137: astore #4
    //   139: aload #4
    //   141: areturn
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    Zll9[] arrayOfZll9 = Z_(paramPoint, true);
    if (arrayOfZll9.length > 0)
      this.ZO.Zk(arrayOfZll9, paramMouseEvent, paramComponent, paramPoint); 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZO.ZL(paramInt, ZR());
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zx : B
    //   8: iconst_1
    //   9: if_icmpne -> 169
    //   12: aload_0
    //   13: getfield Zu : I
    //   16: iconst_5
    //   17: if_icmpne -> 25
    //   20: aload_0
    //   21: iconst_1
    //   22: putfield Zu : I
    //   25: aload_0
    //   26: getfield Zu : I
    //   29: tableswitch default -> 159, 0 -> 64, 1 -> 84, 2 -> 103, 3 -> 123, 4 -> 143
    //   64: aload_0
    //   65: getfield Zt : Lburp/Zm99;
    //   68: sipush #8264
    //   71: sipush #-8778
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual setText : (Ljava/lang/String;)V
    //   80: aload_2
    //   81: ifnull -> 159
    //   84: aload_0
    //   85: getfield Zt : Lburp/Zm99;
    //   88: sipush #8291
    //   91: bipush #30
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: invokevirtual setText : (Ljava/lang/String;)V
    //   99: aload_2
    //   100: ifnull -> 159
    //   103: aload_0
    //   104: getfield Zt : Lburp/Zm99;
    //   107: sipush #8298
    //   110: sipush #32615
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: invokevirtual setText : (Ljava/lang/String;)V
    //   119: aload_2
    //   120: ifnull -> 159
    //   123: aload_0
    //   124: getfield Zt : Lburp/Zm99;
    //   127: sipush #8319
    //   130: sipush #19558
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual setText : (Ljava/lang/String;)V
    //   139: aload_2
    //   140: ifnull -> 159
    //   143: aload_0
    //   144: getfield Zt : Lburp/Zm99;
    //   147: sipush #8301
    //   150: sipush #-30803
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokevirtual setText : (Ljava/lang/String;)V
    //   159: aload_0
    //   160: dup
    //   161: getfield Zu : I
    //   164: iconst_1
    //   165: iadd
    //   166: putfield Zu : I
    //   169: return
  }
  
  private void lambda$cmdGoCancelActionPerformed$6() {
    this.Z_.Zx();
    if (this.Zx == 1) {
      this.Zx = 0;
      this.Zt.setText(a(8292, 23916) + a(8292, 23916));
      this.ZI.setText(a(8309, 24908));
    } 
  }
  
  private void lambda$initComponents$5(ActionEvent paramActionEvent) {
    Zl(paramActionEvent);
  }
  
  private void lambda$initComponents$4(ActionEvent paramActionEvent) {
    ZR(paramActionEvent);
  }
  
  private void lambda$initComponents$3(ActionEvent paramActionEvent) {
    ZS(paramActionEvent);
  }
  
  private void lambda$new$2() {
    this.ZI.doClick();
  }
  
  private void lambda$new$1(TableModelEvent paramTableModelEvent) {
    EventQueue.invokeLater(this::lambda$new$0);
  }
  
  private void lambda$new$0() {
    this.ZB.setText(a(8307, -1750).formatted(new Object[] { Integer.valueOf(this.Zy.getRowCount()) }));
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥6D@ØeßÐÛnrÁe\\n°Wÿ«:íÏ\\tS |áÿU­Øú·~¥?2·ÞÁæ©çµqÜ%¢Ó2ú¢ÒÂ|9¿Gþ5ÜêhµyNÔxÕÃûGÏK¨¥,pÏDMÅ\\f5|V\\t¹-útúúµÖ[ÉÓe<,?Áá×6ðvöu|AsªÑ\\n_wïÇ½\\b1Q¾}(`×Ûwå[^G¹Ò3(!ÂÔÞÊCn¨ß­)b¨&M,Ot²ÈZ©lwä¿T¨uæÀÊ0\\n3d¶\\bÆ\\tÀ:ºà=æJ¿¸Õ­Bb©¹(.CðwÞ0Éðî·y·¡È±Ç«tëÍËWæ¸îè.9Ù¼ÀHZwXû{¼xÿ6¯^Â¨­ï\\b¿\\nYÂÂÿ±s¥ò]n\\nµZ¿ìÈ½t´üH©\\rÌGtÙ>¤¯Jï\\n5¯UÊ)ýh"²´ÐÆ/Ã]<'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
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
    //   68: ldc 'òA¹¹p¸\\tGa¯£®2'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #23
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
    //   129: putstatic burp/Zl4p.a : [Ljava/lang/String;
    //   132: bipush #35
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zl4p.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #125
    //   219: goto -> 244
    //   222: bipush #78
    //   224: goto -> 244
    //   227: bipush #112
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #32
    //   239: goto -> 244
    //   242: bipush #80
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
    int i = (paramInt1 ^ 0x206A) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */