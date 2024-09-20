package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl41 extends Zl40 implements ActionListener, Zky2, Zeq {
  private final Zz_r ZP;
  
  private final Ztwv Zu;
  
  private final Zerg Zb;
  
  private final Zskh ZI;
  
  private final Zz28 Ze;
  
  private final Zez3[] Zi;
  
  private final Zkl6 ZF;
  
  private static List<Zr8p> ZH;
  
  private byte Zr;
  
  private Zl2r ZC;
  
  private Zbws Zo;
  
  private Zmiz ZS;
  
  private Zgor Zz;
  
  private Zqy Zv;
  
  private int ZJ;
  
  private Timer ZK;
  
  private Zzdy ZL;
  
  private Zzdy Zd;
  
  private Zzdy ZR;
  
  private Zzdy Zl;
  
  private Zzdy Zq;
  
  private Zzdy Zf;
  
  private Zzdy ZW;
  
  private Zzdy Zc;
  
  private Zzdy Zm;
  
  private Ze01 ZU;
  
  private Zbkd ZG;
  
  private Zbqc ZT;
  
  private Zbqc ZM;
  
  private Zm9v ZY;
  
  private Zm99 Zt;
  
  private Zm99 Zg;
  
  private Zbqc ZX;
  
  private Zbqc ZO;
  
  private Zbqc Z_;
  
  private Zbqc Zh;
  
  private Zbqc ZE;
  
  private Zbup ZN;
  
  private Zzdy Zs;
  
  private Zbqc ZQ;
  
  private Zzdy ZV;
  
  private Zzdy Zw;
  
  private Zzdy ZZ;
  
  private Zmyz Zy;
  
  private Zbqc Za;
  
  private Zgff Zn;
  
  private static String ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl41(Window paramWindow, Zerg paramZerg, Zz_r paramZz_r, Zskh paramZskh, Zz28 paramZz28, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Zez3[] paramArrayOfZez3, Zkl6 paramZkl6, Ze47 paramZe47, Zs6i paramZs6i, Zm6x paramZm6x) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore #15
    //   5: aload_0
    //   6: invokespecial <init> : ()V
    //   9: aload #10
    //   11: ifnonnull -> 20
    //   14: getstatic burp/Zrrh.SUITE_SEARCH_GLOBAL : Lburp/Zrrh;
    //   17: goto -> 23
    //   20: getstatic burp/Zrrh.SUITE_SEARCH_SITE_MAP_BRANCH : Lburp/Zrrh;
    //   23: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   26: aload_0
    //   27: aload_2
    //   28: putfield Zb : Lburp/Zerg;
    //   31: aload_0
    //   32: aload_3
    //   33: putfield ZP : Lburp/Zz_r;
    //   36: aload_0
    //   37: aload #4
    //   39: putfield ZI : Lburp/Zskh;
    //   42: aload_0
    //   43: aload #5
    //   45: putfield Ze : Lburp/Zz28;
    //   48: aload_0
    //   49: aload #6
    //   51: putfield Zu : Lburp/Ztwv;
    //   54: aload_0
    //   55: aload #10
    //   57: putfield Zi : [Lburp/Zez3;
    //   60: aload_0
    //   61: aload #11
    //   63: putfield ZF : Lburp/Zkl6;
    //   66: aload_0
    //   67: invokevirtual Ze : ()V
    //   70: aload_0
    //   71: getfield Zn : Lburp/Zgff;
    //   74: sipush #-9903
    //   77: sipush #-32626
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual setName : (Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield ZY : Lburp/Zm9v;
    //   90: iconst_0
    //   91: invokevirtual setVisible : (Z)V
    //   94: aload_0
    //   95: getfield ZN : Lburp/Zbup;
    //   98: bipush #120
    //   100: bipush #30
    //   102: invokestatic Zf : (Ljava/awt/Component;II)V
    //   105: aload_0
    //   106: getfield ZZ : Lburp/Zzdy;
    //   109: aload_2
    //   110: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   113: invokevirtual ZU : (Lburp/Zeew;)Z
    //   116: invokevirtual setSelected : (Z)V
    //   119: aload_0
    //   120: getfield ZZ : Lburp/Zzdy;
    //   123: aload_2
    //   124: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   127: invokevirtual ZU : (Lburp/Zeew;)Z
    //   130: invokevirtual setEnabled : (Z)V
    //   133: aload_0
    //   134: getfield ZV : Lburp/Zzdy;
    //   137: aload_2
    //   138: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   141: invokevirtual ZU : (Lburp/Zeew;)Z
    //   144: invokevirtual setSelected : (Z)V
    //   147: aload_0
    //   148: getfield ZV : Lburp/Zzdy;
    //   151: aload_2
    //   152: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   155: invokevirtual ZU : (Lburp/Zeew;)Z
    //   158: invokevirtual setEnabled : (Z)V
    //   161: aload_0
    //   162: getfield Zw : Lburp/Zzdy;
    //   165: aload_2
    //   166: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   169: invokevirtual ZU : (Lburp/Zeew;)Z
    //   172: invokevirtual setSelected : (Z)V
    //   175: aload_0
    //   176: getfield Zw : Lburp/Zzdy;
    //   179: aload_2
    //   180: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   183: invokevirtual ZU : (Lburp/Zeew;)Z
    //   186: invokevirtual setEnabled : (Z)V
    //   189: aload_0
    //   190: getfield Zs : Lburp/Zzdy;
    //   193: aload_2
    //   194: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   197: invokevirtual ZU : (Lburp/Zeew;)Z
    //   200: invokevirtual setSelected : (Z)V
    //   203: aload_0
    //   204: getfield Zs : Lburp/Zzdy;
    //   207: aload_2
    //   208: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   211: invokevirtual ZU : (Lburp/Zeew;)Z
    //   214: invokevirtual setEnabled : (Z)V
    //   217: aload #10
    //   219: ifnull -> 432
    //   222: aload #10
    //   224: arraylength
    //   225: lookupswitch default -> 362, 1 -> 256, 2 -> 315
    //   252: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   255: athrow
    //   256: aload_0
    //   257: aload #10
    //   259: iconst_0
    //   260: aaload
    //   261: invokeinterface ZlL : ()Lburp/Zlit;
    //   266: invokeinterface toString : ()Ljava/lang/String;
    //   271: sipush #-9866
    //   274: sipush #3167
    //   277: invokestatic a : (II)Ljava/lang/String;
    //   280: swap
    //   281: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   286: invokevirtual setTitle : (Ljava/lang/String;)V
    //   289: aload #15
    //   291: ifnull -> 452
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   300: athrow
    //   301: iconst_3
    //   302: anewarray burp/Zbqc
    //   305: invokestatic Zr : ([Lburp/Zbqc;)V
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   314: athrow
    //   315: aload_0
    //   316: aload #10
    //   318: iconst_0
    //   319: aaload
    //   320: invokeinterface ZlL : ()Lburp/Zlit;
    //   325: invokeinterface toString : ()Ljava/lang/String;
    //   330: sipush #-9873
    //   333: sipush #-5558
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: swap
    //   340: sipush #-9863
    //   343: sipush #-15835
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   354: invokevirtual setTitle : (Ljava/lang/String;)V
    //   357: aload #15
    //   359: ifnull -> 452
    //   362: aload_0
    //   363: aload #10
    //   365: iconst_0
    //   366: aaload
    //   367: invokeinterface ZlL : ()Lburp/Zlit;
    //   372: invokeinterface toString : ()Ljava/lang/String;
    //   377: aload #10
    //   379: arraylength
    //   380: iconst_1
    //   381: isub
    //   382: sipush #-9873
    //   385: sipush #-5558
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: dup_x2
    //   392: pop
    //   393: sipush #-9916
    //   396: sipush #5620
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: swap
    //   403: sipush #-9862
    //   406: sipush #-22179
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   417: invokevirtual setTitle : (Ljava/lang/String;)V
    //   420: aload #15
    //   422: ifnull -> 452
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   431: athrow
    //   432: aload_0
    //   433: sipush #-9876
    //   436: sipush #-19967
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: invokevirtual setTitle : (Ljava/lang/String;)V
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   451: athrow
    //   452: aload_0
    //   453: iconst_0
    //   454: invokevirtual setDefaultCloseOperation : (I)V
    //   457: aload_0
    //   458: new burp/Zxsj
    //   461: dup
    //   462: aload_0
    //   463: aload_3
    //   464: invokespecial <init> : (Lburp/Zl41;Lburp/Zz_r;)V
    //   467: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   470: aload_0
    //   471: new burp/Zmiz
    //   474: dup
    //   475: invokestatic observableArrayList : ()Ljavafx/collections/ObservableList;
    //   478: invokespecial <init> : (Ljavafx/collections/ObservableList;)V
    //   481: putfield ZS : Lburp/Zmiz;
    //   484: aload_0
    //   485: getfield ZS : Lburp/Zmiz;
    //   488: aload_0
    //   489: <illegal opcode> tableChanged : (Lburp/Zl41;)Ljavax/swing/event/TableModelListener;
    //   494: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   497: aload_0
    //   498: new burp/Zbws
    //   501: dup
    //   502: aload_0
    //   503: getfield ZS : Lburp/Zmiz;
    //   506: invokespecial <init> : (Lburp/Zztu;)V
    //   509: putfield Zo : Lburp/Zbws;
    //   512: aload_0
    //   513: getfield Zo : Lburp/Zbws;
    //   516: sipush #-9861
    //   519: sipush #-12240
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: invokevirtual setName : (Ljava/lang/String;)V
    //   528: aload_0
    //   529: getfield Zo : Lburp/Zbws;
    //   532: iconst_1
    //   533: invokevirtual setAutoCreateRowSorter : (Z)V
    //   536: aload_0
    //   537: getfield Zo : Lburp/Zbws;
    //   540: iconst_1
    //   541: invokevirtual ZF : (Z)V
    //   544: aload_0
    //   545: getfield Zo : Lburp/Zbws;
    //   548: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   551: iconst_1
    //   552: invokevirtual setReorderingAllowed : (Z)V
    //   555: aload_0
    //   556: getfield Zo : Lburp/Zbws;
    //   559: iconst_1
    //   560: invokevirtual setFillsViewportHeight : (Z)V
    //   563: getstatic burp/Zl41.ZH : Ljava/util/List;
    //   566: ifnull -> 586
    //   569: aload_0
    //   570: getfield Zo : Lburp/Zbws;
    //   573: getstatic burp/Zl41.ZH : Ljava/util/List;
    //   576: invokevirtual Zg : (Ljava/util/List;)V
    //   579: goto -> 586
    //   582: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   585: athrow
    //   586: aload_0
    //   587: getfield ZN : Lburp/Zbup;
    //   590: aload_0
    //   591: getfield Zo : Lburp/Zbws;
    //   594: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   597: aload_0
    //   598: getfield ZG : Lburp/Zbkd;
    //   601: iconst_5
    //   602: bipush #10
    //   604: bipush #10
    //   606: bipush #10
    //   608: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   611: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   614: aload_0
    //   615: getfield ZG : Lburp/Zbkd;
    //   618: new burp/Zm2j
    //   621: dup
    //   622: aload_0
    //   623: getfield Zo : Lburp/Zbws;
    //   626: invokespecial <init> : (Lburp/Zbws;)V
    //   629: invokevirtual Zh : (Lburp/Zm9t;)V
    //   632: aload_0
    //   633: getfield ZG : Lburp/Zbkd;
    //   636: sipush #-9882
    //   639: sipush #18768
    //   642: invokestatic a : (II)Ljava/lang/String;
    //   645: invokevirtual Zj : (Ljava/lang/String;)V
    //   648: aload_0
    //   649: aload #9
    //   651: aload_0
    //   652: invokevirtual ZK : (Lburp/Zl04;)Lburp/Zqy;
    //   655: putfield Zv : Lburp/Zqy;
    //   658: aload_0
    //   659: getfield Zo : Lburp/Zbws;
    //   662: aload_0
    //   663: invokevirtual Zk : (Lburp/Zky2;)V
    //   666: aload_0
    //   667: getfield Zo : Lburp/Zbws;
    //   670: aload_0
    //   671: invokevirtual Zc : (Lburp/Zeq;)V
    //   674: aload_0
    //   675: new burp/Zgor
    //   678: dup
    //   679: aload #7
    //   681: aload #8
    //   683: aload #11
    //   685: aload #12
    //   687: invokespecial <init> : (Lburp/Ztyg;Lburp/Zgq7;Lburp/Zkl6;Lburp/Ze47;)V
    //   690: putfield Zz : Lburp/Zgor;
    //   693: aload_0
    //   694: getfield Zy : Lburp/Zmyz;
    //   697: aload_0
    //   698: getfield Zz : Lburp/Zgor;
    //   701: invokevirtual setBottomComponent : (Ljava/awt/Component;)V
    //   704: aload_0
    //   705: getfield Zy : Lburp/Zmyz;
    //   708: bipush #35
    //   710: invokevirtual Za : (I)V
    //   713: aload_0
    //   714: invokevirtual pack : ()V
    //   717: aload_0
    //   718: aload_1
    //   719: invokevirtual ZO : (Ljava/awt/Window;)V
    //   722: aload_0
    //   723: iconst_1
    //   724: invokevirtual setVisible : (Z)V
    //   727: aload_0
    //   728: new javax/swing/Timer
    //   731: dup
    //   732: sipush #1000
    //   735: aload_0
    //   736: invokespecial <init> : (ILjava/awt/event/ActionListener;)V
    //   739: putfield ZK : Ljavax/swing/Timer;
    //   742: aload_0
    //   743: getfield ZK : Ljavax/swing/Timer;
    //   746: iconst_0
    //   747: invokevirtual setInitialDelay : (I)V
    //   750: return
    // Exception table:
    //   from	to	target	type
    //   23	252	252	java/util/regex/PatternSyntaxException
    //   222	294	297	java/util/regex/PatternSyntaxException
    //   256	308	311	java/util/regex/PatternSyntaxException
    //   315	425	428	java/util/regex/PatternSyntaxException
    //   362	445	448	java/util/regex/PatternSyntaxException
    //   452	579	582	java/util/regex/PatternSyntaxException
  }
  
  void ZS(Zbx0 paramZbx0, Zll9 paramZll9) {
    try {
      if (paramZbx0 != this.ZC)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZS.ZO(paramZll9);
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    this.Zz.ZZ(this.ZS.ZW(this.Zo.convertRowIndexToModel(paramInt1)));
  }
  
  private void ZD(Consumer<Zt2i> paramConsumer) {
    try {
      if (this.ZC == null)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zt2i zt2i = this.ZC.Zy();
    paramConsumer.accept(zt2i);
  }
  
  private void Ze() {
    this.ZT = new Zbqc();
    this.Zh = new Zbqc();
    this.Zg = new Zm99();
    this.Zt = new Zm99();
    this.Zy = new Zmyz();
    this.ZE = new Zbqc();
    this.ZG = new Zbkd();
    this.ZN = new Zbup();
    this.Z_ = new Zbqc();
    this.ZQ = new Zbqc();
    this.Zn = new Zgff();
    this.ZM = new Zbqc();
    this.ZU = new Ze01();
    this.ZY = new Zm9v();
    this.ZO = new Zbqc();
    this.ZL = new Zzdy();
    this.ZR = new Zzdy();
    this.Zq = new Zzdy();
    this.Zd = new Zzdy();
    this.Zl = new Zzdy();
    this.ZX = new Zbqc();
    this.ZW = new Zzdy();
    this.Zm = new Zzdy();
    this.Zf = new Zzdy();
    this.Zc = new Zzdy();
    this.Za = new Zbqc();
    this.ZZ = new Zzdy();
    this.ZV = new Zzdy();
    this.Zw = new Zzdy();
    this.Zs = new Zzdy();
    this.ZT.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    this.ZT.setLayout(new BorderLayout());
    this.Zh.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.Zh.setLayout(new BorderLayout());
    this.Zg.setText(" ");
    this.Zh.add(this.Zg, a(-9909, 11799));
    this.Zh.add(this.Zt, a(-9918, -31861));
    this.ZT.add(this.Zh, a(-9872, 25139));
    this.Zy.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Zlkk.BORDER.ZS()));
    this.Zy.setOrientation(0);
    this.ZE.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZE.setLayout(new BorderLayout());
    this.ZE.add(this.ZG, a(-9901, -28749));
    this.ZE.add(this.ZN, a(-9911, -13625));
    this.Zy.setLeftComponent(this.ZE);
    this.ZT.add(this.Zy, a(-9858, -8903));
    this.Z_.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    this.Z_.setLayout(new GridLayout(1, 4, 10, 0));
    this.ZQ.setBorder(BorderFactory.createTitledBorder(a(-9881, 22222)));
    this.ZQ.setLayout(new BorderLayout());
    this.Zn.ZH(Zlw9.SEARCH_TERM);
    this.Zn.addActionListener(new Zldp(this));
    this.Zn.addKeyListener(new Zs7g(this));
    this.ZQ.add(this.Zn, a(-9858, -8903));
    this.ZM.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
    this.ZM.setLayout(new BorderLayout());
    this.ZU.setText(a(-9912, -13713));
    this.ZU.addActionListener(new Zb1k(this));
    this.ZM.add(this.ZU, a(-9883, -5224));
    this.ZY.setText(a(-9888, 25479));
    this.ZY.setVerifyInputWhenFocusTarget(false);
    this.ZM.add(this.ZY, a(-9914, -17727));
    this.ZQ.add(this.ZM, a(-9886, 16885));
    this.Z_.add(this.ZQ);
    this.ZO.setBorder(BorderFactory.createTitledBorder(a(-9865, -10670)));
    this.ZO.setLayout(new GridLayout(3, 2));
    this.ZL.setText(a(-9910, -7904));
    this.ZO.add(this.ZL);
    this.ZR.setText(a(-9919, -18186));
    this.ZR.addActionListener(new Zgxa(this));
    this.ZO.add(this.ZR);
    this.Zq.setText(a(-9870, -23585));
    this.Zq.addActionListener(new Zrxc(this));
    this.ZO.add(this.Zq);
    this.Zd.setText(a(-9880, 28594));
    this.Zd.addActionListener(new Zsp3(this));
    this.ZO.add(this.Zd);
    this.Zl.setText(a(-9868, 17212));
    this.ZO.add(this.Zl);
    this.Z_.add(this.ZO);
    this.ZX.setBorder(BorderFactory.createTitledBorder(a(-9913, -8704)));
    this.ZX.setLayout(new GridLayout(3, 2));
    this.ZW.setSelected(true);
    this.ZW.setText(a(-9877, 16719));
    this.ZW.addActionListener(new Zmxq(this));
    this.ZX.add(this.ZW);
    this.Zm.setSelected(true);
    this.Zm.setText(a(-9874, -26006));
    this.Zm.addActionListener(new Zsxi(this));
    this.ZX.add(this.Zm);
    this.Zf.setSelected(true);
    this.Zf.setText(a(-9884, 15183));
    this.Zf.addActionListener(new Ztg7(this));
    this.ZX.add(this.Zf);
    this.Zc.setSelected(true);
    this.Zc.setText(a(-9907, -28511));
    this.Zc.addActionListener(new Ztll(this));
    this.ZX.add(this.Zc);
    this.Z_.add(this.ZX);
    this.Za.setBorder(BorderFactory.createTitledBorder(a(-9879, -32473)));
    this.Za.setLayout(new GridLayout(3, 2));
    this.ZZ.setSelected(true);
    this.ZZ.setText(a(-9867, -28464));
    this.ZZ.addActionListener(new Zrt1(this));
    this.Za.add(this.ZZ);
    this.ZV.setSelected(true);
    this.ZV.setText(a(-9904, -6292));
    this.ZV.addActionListener(new Zz24(this));
    this.Za.add(this.ZV);
    this.Zw.setSelected(true);
    this.Zw.setText(a(-9900, 14410));
    this.Zw.addActionListener(new Zkib(this));
    this.Za.add(this.Zw);
    this.Zs.setSelected(true);
    this.Zs.setText(a(-9917, 496));
    this.Zs.addActionListener(new Zxla(this));
    this.Za.add(this.Zs);
    this.Z_.add(this.Za);
    this.ZT.add(this.Z_, a(-9908, 3648));
    getContentPane().add(this.ZT, a(-9858, -8903));
    pack();
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    String str2;
    boolean bool1;
    boolean bool2;
    String str1 = ZU();
    this.ZY.setVisible(false);
    switch (this.Zr) {
      case 0:
        str2 = this.Zn.getText();
        try {
          if (str2.isEmpty())
            return; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        bool1 = this.Zq.isSelected();
        bool2 = this.ZL.isSelected();
        if (bool1) {
          try {
            try {
            
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            Pattern pattern = Pattern.compile(str2, 0x20 | (bool2 ? 0 : 2));
            Zvr zvr = new Zvr(pattern);
            this.ZC = new Zl2r(this.Zi, this, this.Zb, this.ZI, this.Ze, this.ZF.ZH(), zvr, new Zt2i(this.ZR.isSelected(), this.ZW.isSelected(), this.Zf.isSelected(), this.Zm.isSelected(), this.Zc.isSelected(), this.ZZ.isSelected(), this.ZV.isSelected(), this.Zw.isSelected(), this.Zs.isSelected()), this.Zl.isSelected());
          } catch (PatternSyntaxException patternSyntaxException) {
            Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
            this.ZY.setVisible(true);
            return;
          } 
        } else {
          Zte3 zte3 = new Zte3(Zkb.Zy(str2), bool2);
          this.ZC = new Zl2r(this.Zi, this, this.Zb, this.ZI, this.Ze, this.ZF.ZH(), zte3, new Zt2i(this.ZR.isSelected(), this.ZW.isSelected(), this.Zf.isSelected(), this.Zm.isSelected(), this.Zc.isSelected(), this.ZZ.isSelected(), this.ZV.isSelected(), this.Zw.isSelected(), this.Zs.isSelected()), this.Zl.isSelected());
        } 
        try {
          this.ZS.ZZ();
          this.Zz.ZZ(null);
          if (this.Zd.isSelected())
            this.ZP.Zy(this.ZC); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
          this.Zz.ZJ(str2, bool1, bool2);
          this.Zr = 1;
          this.ZK.restart();
          this.ZJ = 0;
          this.Zt.setText(a(-9875, -7020).formatted(new Object[] { Integer.valueOf(0) }));
          this.ZU.setText(a(-9887, -2534));
          this.Zu.Zx(this::lambda$cmdGoCancelActionPerformed$2);
          if (str1 != null);
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return;
      case 1:
        try {
          this.ZC.ZP();
          this.Zr = 0;
          this.Zg.setText(a(-9920, -18734));
          this.ZU.setText(a(-9912, -13713));
          if (str1 != null)
            break; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zr);
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    this.Zn.focusLost((FocusEvent)null);
    ZI(paramActionEvent);
    this.Zn.focusGained((FocusEvent)null);
  }
  
  private void Zc(KeyEvent paramKeyEvent) {
    this.ZY.setVisible(false);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    this.ZY.setVisible(false);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zl2r;
    //   8: ifnull -> 162
    //   11: aload_0
    //   12: getfield Zd : Lburp/Zzdy;
    //   15: invokevirtual isSelected : ()Z
    //   18: ifeq -> 97
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZP : Lburp/Zz_r;
    //   32: aload_0
    //   33: getfield ZC : Lburp/Zl2r;
    //   36: invokeinterface Zy : (Lburp/Zbx0;)V
    //   41: aload_0
    //   42: getfield Zg : Lburp/Zm99;
    //   45: invokevirtual getText : ()Ljava/lang/String;
    //   48: sipush #-9869
    //   51: sipush #-27618
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 162
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   69: athrow
    //   70: aload_0
    //   71: getfield Zg : Lburp/Zm99;
    //   74: sipush #-9857
    //   77: sipush #14034
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual setText : (Ljava/lang/String;)V
    //   86: aload_2
    //   87: ifnull -> 162
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   96: athrow
    //   97: aload_0
    //   98: getfield ZP : Lburp/Zz_r;
    //   101: aload_0
    //   102: getfield ZC : Lburp/Zl2r;
    //   105: invokeinterface Za : (Lburp/Zbx0;)V
    //   110: aload_0
    //   111: getfield Zg : Lburp/Zm99;
    //   114: invokevirtual getText : ()Ljava/lang/String;
    //   117: sipush #-9906
    //   120: sipush #13224
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifeq -> 162
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   138: athrow
    //   139: aload_0
    //   140: getfield Zg : Lburp/Zm99;
    //   143: sipush #-9869
    //   146: sipush #-27618
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: invokevirtual setText : (Ljava/lang/String;)V
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   161: athrow
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/util/regex/PatternSyntaxException
    //   11	63	66	java/util/regex/PatternSyntaxException
    //   28	90	93	java/util/regex/PatternSyntaxException
    //   70	132	135	java/util/regex/PatternSyntaxException
    //   97	155	158	java/util/regex/PatternSyntaxException
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    ZD(this::lambda$chkInScopeOnlyActionPerformed$3);
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    ZD(this::lambda$chkSearchRequestHeadersActionPerformed$4);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    ZD(this::lambda$chkSearchRequestBodyActionPerformed$5);
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    ZD(this::lambda$chkSearchResponseHeadersActionPerformed$6);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    ZD(this::lambda$chkSearchResponseBodyActionPerformed$7);
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    ZD(this::lambda$searchTargetCheckboxActionPerformed$8);
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    ZD(this::lambda$searchProxyCheckboxActionPerformed$9);
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    ZD(this::lambda$searchRepeaterCheckboxActionPerformed$10);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    ZD(this::lambda$searchOrganiserCheckboxActionPerformed$11);
  }
  
  Zll9[] Zb() {
    return Zo((Point)null);
  }
  
  Zll9[] Zo(Point paramPoint) {
    return (Zll9[])Z_(this.Zo.ZS(paramPoint)).toArray(Zl41::lambda$getSelectionItems$12);
  }
  
  private List<Zll9> Z_(int[] paramArrayOfint) {
    return (List<Zll9>)Arrays.stream(paramArrayOfint).mapToObj(this::Zj).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zll9 Zj(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZS.getRowCount()) {
            int i = this.Zo.convertRowIndexToModel(paramInt);
            return this.ZS.ZW(i);
          } 
          return null;
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return null;
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    Zll9[] arrayOfZll9 = Zo(paramPoint);
    try {
      if (arrayOfZll9.length > 0)
        this.Zv.Zk(arrayOfZll9, paramMouseEvent, paramComponent, paramPoint); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.Zv.ZL(paramInt, Zb());
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zr : B
    //   8: iconst_1
    //   9: if_icmpne -> 217
    //   12: aload_0
    //   13: getfield ZJ : I
    //   16: iconst_5
    //   17: if_icmpne -> 39
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   26: athrow
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield ZJ : I
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   38: athrow
    //   39: aload_0
    //   40: getfield ZJ : I
    //   43: tableswitch default -> 207, 0 -> 76, 1 -> 103, 2 -> 130, 3 -> 157, 4 -> 184
    //   76: aload_0
    //   77: getfield Zg : Lburp/Zm99;
    //   80: sipush #-9859
    //   83: sipush #-31362
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokevirtual setText : (Ljava/lang/String;)V
    //   92: aload_2
    //   93: ifnull -> 207
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   102: athrow
    //   103: aload_0
    //   104: getfield Zg : Lburp/Zm99;
    //   107: sipush #-9871
    //   110: sipush #-9003
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: invokevirtual setText : (Ljava/lang/String;)V
    //   119: aload_2
    //   120: ifnull -> 207
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   129: athrow
    //   130: aload_0
    //   131: getfield Zg : Lburp/Zm99;
    //   134: sipush #-9885
    //   137: sipush #-18947
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual setText : (Ljava/lang/String;)V
    //   146: aload_2
    //   147: ifnull -> 207
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   156: athrow
    //   157: aload_0
    //   158: getfield Zg : Lburp/Zm99;
    //   161: sipush #-9864
    //   164: sipush #-6224
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual setText : (Ljava/lang/String;)V
    //   173: aload_2
    //   174: ifnull -> 207
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   183: athrow
    //   184: aload_0
    //   185: getfield Zg : Lburp/Zm99;
    //   188: sipush #-9860
    //   191: sipush #7250
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: invokevirtual setText : (Ljava/lang/String;)V
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   206: athrow
    //   207: aload_0
    //   208: dup
    //   209: getfield ZJ : I
    //   212: iconst_1
    //   213: iadd
    //   214: putfield ZJ : I
    //   217: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/util/regex/PatternSyntaxException
    //   12	32	35	java/util/regex/PatternSyntaxException
    //   39	96	99	java/util/regex/PatternSyntaxException
    //   76	123	126	java/util/regex/PatternSyntaxException
    //   103	150	153	java/util/regex/PatternSyntaxException
    //   130	177	180	java/util/regex/PatternSyntaxException
    //   157	200	203	java/util/regex/PatternSyntaxException
  }
  
  private static Zll9[] lambda$getSelectionItems$12(int paramInt) {
    return new Zll9[paramInt];
  }
  
  private void lambda$searchOrganiserCheckboxActionPerformed$11(Zt2i paramZt2i) {
    paramZt2i.ZN(this.Zs.isSelected());
  }
  
  private void lambda$searchRepeaterCheckboxActionPerformed$10(Zt2i paramZt2i) {
    paramZt2i.ZV(this.Zw.isSelected());
  }
  
  private void lambda$searchProxyCheckboxActionPerformed$9(Zt2i paramZt2i) {
    paramZt2i.ZU(this.ZV.isSelected());
  }
  
  private void lambda$searchTargetCheckboxActionPerformed$8(Zt2i paramZt2i) {
    paramZt2i.ZO(this.ZZ.isSelected());
  }
  
  private void lambda$chkSearchResponseBodyActionPerformed$7(Zt2i paramZt2i) {
    paramZt2i.Zu(this.Zc.isSelected());
  }
  
  private void lambda$chkSearchResponseHeadersActionPerformed$6(Zt2i paramZt2i) {
    paramZt2i.ZS(this.Zm.isSelected());
  }
  
  private void lambda$chkSearchRequestBodyActionPerformed$5(Zt2i paramZt2i) {
    paramZt2i.ZI(this.Zf.isSelected());
  }
  
  private void lambda$chkSearchRequestHeadersActionPerformed$4(Zt2i paramZt2i) {
    paramZt2i.ZP(this.ZW.isSelected());
  }
  
  private void lambda$chkInScopeOnlyActionPerformed$3(Zt2i paramZt2i) {
    paramZt2i.ZM(this.ZR.isSelected());
  }
  
  private void lambda$cmdGoCancelActionPerformed$2() {
    try {
      this.ZC.Zx();
      if (this.Zr == 1) {
        try {
          this.Zr = 0;
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        this.Zg.setText(a(-9905, -23335) + a(-9905, -23335));
        this.ZU.setText(a(-9915, 21690));
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void lambda$new$1(TableModelEvent paramTableModelEvent) {
    EventQueue.invokeLater(this::lambda$new$0);
  }
  
  private void lambda$new$0() {
    this.Zt.setText(a(-9902, 25937).formatted(new Object[] { Integer.valueOf(this.Zo.getRowCount()) }));
  }
  
  public static void Zp(String paramString) {
    ZB = paramString;
  }
  
  public static String ZU() {
    return ZB;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #53
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'ç\\rÝhl>Dþp¦BñJCê Ò\\rCíØXrç¨H» ¥\\fUôX§´OL´õ×F§JÆko]mèíÅ5ÊÍNÙ¦ù2|·ÊjtÎ1ºKÙGDüz3è!jfÈìÑ^\üQôWcòcB##¶kg3[_ÔP@]~¤a«°(ä5ÓeúûèsØ8a[Ç\\b\\n¬"8þµ'é¸fö;ÿi¹*kÌh­®F:Þb6Ì-úE#¡eOQY\\fãÅ\\bOB¤× T\\rm¿åPLgön]0ÞS"ÅH+B>X#ÜÇgËf¿d|;¶óÈ£\\nUås£T#=±TÖ¹w-ý:¢Âü¯(ìj-`æl0k²Ã_ª(ÄÍH-ÖFg¯\\ri¡¿\\b¸p³vîH¤úÿÿó,"n'çFw¢Kñå±ðY® >òsðgÌ/»\\tjr"þiMO.·3(*]õýù^±Ï|õõØ`£O*i&¡lSæ-GÛñ$,Ã>R!.Ìu´í¿\wÝË~\\rlÂÍ\\rä(æÞ4¾ÿ×dkÍt\\t<µ\\t1Ðü@ôY*YV½éä\\t ì®Ð.Lc¦©Ke±ÃFuS³Dí¯Ä´a [â\\rÿ£p\\tW Ú¬(aÃCÈEZª¾ .¯ÉfrJQª2^UcÍþ{¡vkâ~ *Õ3q\\t\\f¨ó+Ê]Êà'«æ:$VÕÈ?gþ³aPvþj?f]\\nÌ°£¨Î³Õ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #13
    //   21: istore_1
    //   22: invokestatic Zp : (Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #33
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc 'Au¦A\\bØÐ±HßV P'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_5
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #54
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zl41.a : [Ljava/lang/String;
    //   135: bipush #53
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zl41.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #8
    //   218: goto -> 248
    //   221: bipush #33
    //   223: goto -> 248
    //   226: bipush #51
    //   228: goto -> 248
    //   231: bipush #42
    //   233: goto -> 248
    //   236: bipush #96
    //   238: goto -> 248
    //   241: bipush #87
    //   243: goto -> 248
    //   246: bipush #15
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD960) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl41.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */