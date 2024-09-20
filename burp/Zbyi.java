package burp;

import burp.api.montoya.logger.LoggerHttpRequestResponse;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbyi extends Zbqc implements Zm3g, Zedo, Zzyl {
  private static final Zstu ZC;
  
  private static final Ze9n ZY;
  
  private final Zl1k ZJ;
  
  private final Zkkp ZZ;
  
  private final Ztwv ZT;
  
  private final Zg6x Zq;
  
  private final Zta4 Zu;
  
  private final Zey9 Zb;
  
  private final Zbdf Zg;
  
  private final Zbdf ZQ;
  
  private final Zbdx ZR;
  
  private final AtomicReference<Zz6w> ZH;
  
  private final Zmu5 ZF;
  
  private final Zzee Zl;
  
  private final Ztzi ZS;
  
  private final Zl7c ZN;
  
  private final Zby9 ZM;
  
  private final Zspz ZO;
  
  private final Zzgo Zv;
  
  private Zbkd ZE;
  
  private Zbqc ZB;
  
  private Zbkd Zc;
  
  private Zbws Zf;
  
  private Zmyz ZK;
  
  private Zbqc Z_;
  
  private Zbc9 Zy;
  
  private Zbup Za;
  
  private Zbqc Zj;
  
  private Zbqc ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbyi(Zl1k paramZl1k, Ztyg paramZtyg, Zgq7 paramZgq7, Zm6v paramZm6v, Zslu paramZslu, Zt3z paramZt3z, Zkkp paramZkkp, Ztwv paramZtwv, Zg6x paramZg6x, Zta4 paramZta4, Zs4l<LoggerHttpRequestResponse, Boolean> paramZs4l, Zsju paramZsju, Zgb6 paramZgb6, Zg9z paramZg9z1, Zg9z paramZg9z2, Zm51 paramZm511, Zm51 paramZm512, boolean paramBoolean, Zey9 paramZey9, Zskl paramZskl, Zr_4 paramZr_4, Zs6i paramZs6i, Zgtg<Zto7> paramZgtg, Zmu5 paramZmu5, Zm6x paramZm6x, Consumer<Zbws> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZJ : Lburp/Zl1k;
    //   9: aload_0
    //   10: aload #7
    //   12: putfield ZZ : Lburp/Zkkp;
    //   15: aload_0
    //   16: aload #8
    //   18: putfield ZT : Lburp/Ztwv;
    //   21: aload_0
    //   22: aload #9
    //   24: putfield Zq : Lburp/Zg6x;
    //   27: aload_0
    //   28: aload #10
    //   30: putfield Zu : Lburp/Zta4;
    //   33: aload_0
    //   34: aload #19
    //   36: putfield Zb : Lburp/Zey9;
    //   39: aload_0
    //   40: aload #24
    //   42: putfield ZF : Lburp/Zmu5;
    //   45: invokestatic Z_ : ()I
    //   48: aload_0
    //   49: new java/util/concurrent/atomic/AtomicReference
    //   52: dup
    //   53: aconst_null
    //   54: invokespecial <init> : (Ljava/lang/Object;)V
    //   57: putfield ZH : Ljava/util/concurrent/atomic/AtomicReference;
    //   60: aload_0
    //   61: invokevirtual Zt : ()V
    //   64: istore #27
    //   66: aload_0
    //   67: getfield ZF : Lburp/Zmu5;
    //   70: new burp/Zrz2
    //   73: dup
    //   74: aload_0
    //   75: getfield ZH : Ljava/util/concurrent/atomic/AtomicReference;
    //   78: aload_0
    //   79: <illegal opcode> accept : (Lburp/Zbyi;)Ljava/util/function/Consumer;
    //   84: invokespecial <init> : (Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/function/Consumer;)V
    //   87: invokevirtual ZM : (Lburp/Zrz2;)V
    //   90: aload_0
    //   91: getfield Zf : Lburp/Zbws;
    //   94: sipush #-6219
    //   97: sipush #9599
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual setName : (Ljava/lang/String;)V
    //   106: aload_0
    //   107: getfield Zf : Lburp/Zbws;
    //   110: aload_0
    //   111: <illegal opcode> ZK : (Lburp/Zbyi;)Lburp/Zeq;
    //   116: invokevirtual Zc : (Lburp/Zeq;)V
    //   119: aload_0
    //   120: getfield Zf : Lburp/Zbws;
    //   123: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   126: iconst_2
    //   127: invokeinterface setSelectionMode : (I)V
    //   132: aload_0
    //   133: getfield Zf : Lburp/Zbws;
    //   136: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   139: iconst_1
    //   140: invokevirtual setReorderingAllowed : (Z)V
    //   143: aload_0
    //   144: getfield Zf : Lburp/Zbws;
    //   147: iconst_1
    //   148: invokevirtual ZF : (Z)V
    //   151: aload_0
    //   152: getfield Zf : Lburp/Zbws;
    //   155: iconst_1
    //   156: invokevirtual setAutoCreateRowSorter : (Z)V
    //   159: aload_0
    //   160: getfield Zf : Lburp/Zbws;
    //   163: new burp/Zguy
    //   166: dup
    //   167: aload_0
    //   168: aload #6
    //   170: invokespecial <init> : (Lburp/Zbyi;Lburp/Zt3z;)V
    //   173: invokevirtual Zk : (Lburp/Zky2;)V
    //   176: aload_0
    //   177: getfield Zf : Lburp/Zbws;
    //   180: aload_0
    //   181: aload #10
    //   183: <illegal opcode> hierarchyChanged : (Lburp/Zbyi;Lburp/Zta4;)Ljava/awt/event/HierarchyListener;
    //   188: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   191: aload_0
    //   192: getfield Zf : Lburp/Zbws;
    //   195: aload_0
    //   196: <illegal opcode> hierarchyChanged : (Lburp/Zbyi;)Ljava/awt/event/HierarchyListener;
    //   201: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   204: aload_0
    //   205: aload #26
    //   207: iload #18
    //   209: aload #22
    //   211: <illegal opcode> run : (Lburp/Zbyi;Ljava/util/function/Consumer;ZLburp/Zs6i;)Ljava/lang/Runnable;
    //   216: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   219: iload #18
    //   221: ifeq -> 241
    //   224: aload #25
    //   226: ldc burp/Ztjx
    //   228: getstatic burp/Zehw.SWING : Lburp/Zehw;
    //   231: aload_0
    //   232: <illegal opcode> Zy : (Lburp/Zbyi;)Lburp/Zxjl;
    //   237: invokevirtual ZO : (Ljava/lang/Class;Lburp/Zehw;Lburp/Zxjl;)Lburp/Zmt5;
    //   240: pop
    //   241: new burp/Ztqj
    //   244: dup
    //   245: aload #23
    //   247: getstatic burp/Zm_4.ZF : Lburp/Zg98;
    //   250: getstatic burp/Zk97.BAMBDAS_LOGGER_CUSTOM_COLUMN : Lburp/Zk97;
    //   253: invokespecial <init> : (Lburp/Zgtg;Lburp/Zg98;Lburp/Zk97;)V
    //   256: astore #28
    //   258: aload_0
    //   259: getfield Zf : Lburp/Zbws;
    //   262: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   265: checkcast burp/Zmo5
    //   268: astore #29
    //   270: aload #29
    //   272: aload #28
    //   274: invokevirtual Zh : (Lburp/Zx8i;)V
    //   277: new burp/Zmwz
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: astore #30
    //   286: new burp/Zzbc
    //   289: dup
    //   290: invokespecial <init> : ()V
    //   293: astore #31
    //   295: aload_0
    //   296: new burp/Zby9
    //   299: dup
    //   300: aload #9
    //   302: aload #4
    //   304: iload #18
    //   306: aload #30
    //   308: aload #21
    //   310: aload #31
    //   312: invokespecial <init> : (Lburp/Zg6x;Lburp/Zm6v;ZLburp/Zm3g;Lburp/Zr_4;Lburp/Zbqa;)V
    //   315: putfield ZM : Lburp/Zby9;
    //   318: new burp/Zzbc
    //   321: dup
    //   322: invokespecial <init> : ()V
    //   325: astore #32
    //   327: aload_0
    //   328: new burp/Zbyq
    //   331: dup
    //   332: aload #10
    //   334: aload #4
    //   336: iload #18
    //   338: aload #32
    //   340: aload #21
    //   342: invokespecial <init> : (Lburp/Zta4;Lburp/Zm6v;ZLburp/Zbqa;Lburp/Zr_4;)V
    //   345: putfield ZO : Lburp/Zspz;
    //   348: new burp/Zsud
    //   351: dup
    //   352: aload #5
    //   354: aload #9
    //   356: invokespecial <init> : (Lburp/Zz28;Lburp/Zg6x;)V
    //   359: astore #33
    //   361: new burp/Zmdn
    //   364: dup
    //   365: aload #5
    //   367: aload #10
    //   369: aload #11
    //   371: aload #20
    //   373: invokespecial <init> : (Lburp/Zz28;Lburp/Zta4;Lburp/Zs4l;Lburp/Zskl;)V
    //   376: astore #34
    //   378: aload_0
    //   379: new burp/Ztzi
    //   382: dup
    //   383: aload #33
    //   385: aload #12
    //   387: <illegal opcode> Zg : (Lburp/Zsju;)Lburp/Zxw6;
    //   392: aload_0
    //   393: getfield ZM : Lburp/Zby9;
    //   396: aload #4
    //   398: aload #13
    //   400: aload #14
    //   402: aload #9
    //   404: aload #16
    //   406: aload #31
    //   408: iload #18
    //   410: aload #30
    //   412: aload #25
    //   414: invokespecial <init> : (Lburp/Zsud;Lburp/Zxw6;Lburp/Zspz;Lburp/Zm6v;Lburp/Zgb6;Lburp/Zg9z;Lburp/Zg6x;Lburp/Zm51;Lburp/Zzbc;ZLburp/Zmwz;Lburp/Zm6x;)V
    //   417: putfield ZS : Lburp/Ztzi;
    //   420: aload_0
    //   421: new burp/Zl7c
    //   424: dup
    //   425: aload #34
    //   427: aload_0
    //   428: getfield ZF : Lburp/Zmu5;
    //   431: dup
    //   432: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   435: pop
    //   436: <illegal opcode> Zz : (Lburp/Zmu5;)Lburp/Zrhq;
    //   441: aload #5
    //   443: aload #8
    //   445: aload #4
    //   447: aload #13
    //   449: aload #15
    //   451: aload_0
    //   452: getfield ZO : Lburp/Zspz;
    //   455: aload #10
    //   457: aload #17
    //   459: aload #32
    //   461: aload #25
    //   463: invokespecial <init> : (Lburp/Zmdn;Lburp/Zrhq;Lburp/Zslu;Lburp/Ztwv;Lburp/Zm6v;Lburp/Zgb6;Lburp/Zg9z;Lburp/Zspz;Lburp/Zta4;Lburp/Zm51;Lburp/Zbqa;Lburp/Zm6x;)V
    //   466: putfield ZN : Lburp/Zl7c;
    //   469: new burp/Zbc2
    //   472: dup
    //   473: aload #25
    //   475: invokespecial <init> : (Lburp/Zm6x;)V
    //   478: astore #35
    //   480: aload_0
    //   481: getfield ZI : Lburp/Zbqc;
    //   484: aload #35
    //   486: sipush #-6222
    //   489: sipush #13664
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   498: aload_0
    //   499: new burp/Zzgo
    //   502: dup
    //   503: invokespecial <init> : ()V
    //   506: putfield Zv : Lburp/Zzgo;
    //   509: aload_0
    //   510: getfield Zv : Lburp/Zzgo;
    //   513: sipush #-6230
    //   516: sipush #-22954
    //   519: invokestatic a : (II)Ljava/lang/String;
    //   522: invokevirtual setName : (Ljava/lang/String;)V
    //   525: aload_0
    //   526: getfield Zv : Lburp/Zzgo;
    //   529: bipush #10
    //   531: invokevirtual setIconTextGap : (I)V
    //   534: aload_0
    //   535: getfield Zv : Lburp/Zzgo;
    //   538: aload_0
    //   539: aload #12
    //   541: <illegal opcode> actionPerformed : (Lburp/Zbyi;Lburp/Zsju;)Ljava/awt/event/ActionListener;
    //   546: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   549: new burp/Zm2o
    //   552: dup
    //   553: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   556: invokespecial <init> : (Lburp/Zmcx;)V
    //   559: astore #36
    //   561: aload #36
    //   563: getstatic burp/Zk97.DESKTOP_TOOLS_LOGGER : Lburp/Zk97;
    //   566: invokevirtual Zi : (Lburp/Zk97;)V
    //   569: new burp/Zm2j
    //   572: dup
    //   573: aload_0
    //   574: getfield Zf : Lburp/Zbws;
    //   577: invokespecial <init> : (Lburp/Zbws;)V
    //   580: astore #37
    //   582: aload #37
    //   584: aload_0
    //   585: invokevirtual ZY : ()Lburp/Zepe;
    //   588: invokevirtual ZY : (Lburp/Zepe;)V
    //   591: aload_0
    //   592: aload #23
    //   594: aload #37
    //   596: invokevirtual Zd : (Lburp/Zgtg;Lburp/Zm2j;)V
    //   599: aload_0
    //   600: getfield ZE : Lburp/Zbkd;
    //   603: aload_0
    //   604: getfield ZS : Lburp/Ztzi;
    //   607: invokevirtual ZW : ()Lburp/Zbky;
    //   610: invokevirtual Zn : (Lburp/Zbky;)V
    //   613: aload_0
    //   614: getfield ZE : Lburp/Zbkd;
    //   617: aload_0
    //   618: getfield Zv : Lburp/Zzgo;
    //   621: invokevirtual Zw : (Ljavax/swing/AbstractButton;)V
    //   624: aload_0
    //   625: getfield ZE : Lburp/Zbkd;
    //   628: aload #36
    //   630: invokevirtual Zh : (Lburp/Zm9t;)V
    //   633: aload_0
    //   634: getfield ZE : Lburp/Zbkd;
    //   637: sipush #-6212
    //   640: sipush #1334
    //   643: invokestatic a : (II)Ljava/lang/String;
    //   646: invokevirtual setName : (Ljava/lang/String;)V
    //   649: aload_0
    //   650: getfield Zc : Lburp/Zbkd;
    //   653: aload_0
    //   654: getfield ZN : Lburp/Zl7c;
    //   657: invokevirtual ZL : ()Lburp/Zbk5;
    //   660: invokevirtual Zn : (Lburp/Zbky;)V
    //   663: aload_0
    //   664: getfield Zc : Lburp/Zbkd;
    //   667: aload #37
    //   669: invokevirtual Zh : (Lburp/Zm9t;)V
    //   672: aload_0
    //   673: getfield Zc : Lburp/Zbkd;
    //   676: sipush #-6217
    //   679: sipush #15333
    //   682: invokestatic a : (II)Ljava/lang/String;
    //   685: invokevirtual setName : (Ljava/lang/String;)V
    //   688: new burp/Zgf8
    //   691: dup
    //   692: invokespecial <init> : ()V
    //   695: astore #38
    //   697: aload #38
    //   699: sipush #-6223
    //   702: sipush #-7769
    //   705: invokestatic a : (II)Ljava/lang/String;
    //   708: invokevirtual setName : (Ljava/lang/String;)V
    //   711: aload #38
    //   713: aload_0
    //   714: getfield ZF : Lburp/Zmu5;
    //   717: dup
    //   718: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   721: pop
    //   722: <illegal opcode> Zc : (Lburp/Zmu5;)Lburp/Zm6a;
    //   727: bipush #20
    //   729: invokevirtual Zv : (Lburp/Zm6a;I)V
    //   732: aload #38
    //   734: new burp/Zm9z
    //   737: dup
    //   738: aload #38
    //   740: aload_0
    //   741: getfield Zf : Lburp/Zbws;
    //   744: invokevirtual getName : ()Ljava/lang/String;
    //   747: invokespecial <init> : (Lburp/Zgf8;Ljava/lang/String;)V
    //   750: invokevirtual addFocusListener : (Ljava/awt/event/FocusListener;)V
    //   753: aload_0
    //   754: getfield Zc : Lburp/Zbkd;
    //   757: aload #38
    //   759: invokevirtual ZX : (Lburp/Zgf8;)V
    //   762: aload #9
    //   764: aload_0
    //   765: <illegal opcode> Zt2 : (Lburp/Zbyi;)Lburp/Zedo;
    //   770: invokeinterface ZS : (Lburp/Zedo;)V
    //   775: aload #10
    //   777: aload_0
    //   778: <illegal opcode> Zt2 : (Lburp/Zbyi;)Lburp/Zedo;
    //   783: invokeinterface Zv : (Lburp/Zedo;)V
    //   788: aload_0
    //   789: new burp/Zzee
    //   792: dup
    //   793: aload_0
    //   794: aload_0
    //   795: <illegal opcode> get : (Lburp/Zbyi;)Ljava/util/function/Supplier;
    //   800: invokespecial <init> : (Ljava/awt/Component;Ljava/util/function/Supplier;)V
    //   803: putfield Zl : Lburp/Zzee;
    //   806: aload_0
    //   807: aload_2
    //   808: aload_0
    //   809: getfield Zl : Lburp/Zzee;
    //   812: getstatic burp/Zeew.LOGGER : Lburp/Zeew;
    //   815: iconst_0
    //   816: getstatic burp/Zbdf.ZD : Ljava/util/EnumSet;
    //   819: getstatic burp/Zb9b.Zx : Lburp/Zb9b;
    //   822: invokevirtual Zz : (Lburp/Zmgv;Lburp/Zeew;ZLjava/util/EnumSet;Lburp/Zb9b;)Lburp/Zbdf;
    //   825: putfield Zg : Lburp/Zbdf;
    //   828: aload_0
    //   829: aload_2
    //   830: aload_0
    //   831: getfield Zl : Lburp/Zzee;
    //   834: getstatic burp/Zeew.LOGGER : Lburp/Zeew;
    //   837: iconst_0
    //   838: getstatic burp/Zbdf.ZU : Ljava/util/EnumSet;
    //   841: getstatic burp/Zb9b.Zx : Lburp/Zb9b;
    //   844: invokevirtual Zz : (Lburp/Zmgv;Lburp/Zeew;ZLjava/util/EnumSet;Lburp/Zb9b;)Lburp/Zbdf;
    //   847: putfield ZQ : Lburp/Zbdf;
    //   850: aload_0
    //   851: aload_3
    //   852: getstatic burp/Zxff.LOGGER : Lburp/Zxff;
    //   855: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   858: aload_0
    //   859: getfield Zg : Lburp/Zbdf;
    //   862: sipush #-6220
    //   865: sipush #-5629
    //   868: invokestatic a : (II)Ljava/lang/String;
    //   871: invokeinterface ZA : (Lburp/Zbdf;Ljava/lang/String;)Lburp/Zefl;
    //   876: aload_0
    //   877: getfield ZQ : Lburp/Zbdf;
    //   880: sipush #-6210
    //   883: sipush #-19053
    //   886: invokestatic a : (II)Ljava/lang/String;
    //   889: invokeinterface Zp : (Lburp/Zbdf;Ljava/lang/String;)Lburp/Zefl;
    //   894: invokeinterface Zo : ()Lburp/Zefl;
    //   899: invokeinterface Zl : ()Lburp/Zbdx;
    //   904: putfield ZR : Lburp/Zbdx;
    //   907: aload_0
    //   908: getfield ZR : Lburp/Zbdx;
    //   911: iconst_0
    //   912: invokevirtual setVisible : (Z)V
    //   915: aload_0
    //   916: getfield Z_ : Lburp/Zbqc;
    //   919: aload_0
    //   920: getfield ZR : Lburp/Zbdx;
    //   923: sipush #-6215
    //   926: sipush #13754
    //   929: invokestatic a : (II)Ljava/lang/String;
    //   932: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   935: aload_0
    //   936: getfield ZK : Lburp/Zmyz;
    //   939: new burp/Zzpa
    //   942: dup
    //   943: aload_0
    //   944: invokespecial <init> : (Lburp/Zbyi;)V
    //   947: invokevirtual addComponentListener : (Ljava/awt/event/ComponentListener;)V
    //   950: iload #18
    //   952: ifeq -> 1039
    //   955: getstatic burp/Zgzq.LOGGER_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   958: sipush #-6211
    //   961: sipush #6173
    //   964: invokestatic a : (II)Ljava/lang/String;
    //   967: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   970: sipush #-6224
    //   973: sipush #-10352
    //   976: invokestatic a : (II)Ljava/lang/String;
    //   979: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   982: getstatic burp/Zlar.LOGGER_LEARN_MORE_INFO : Lburp/Zlar;
    //   985: invokevirtual ZN : (Lburp/Zlar;)Lburp/Zltn;
    //   988: invokevirtual Zi : ()Lburp/Zbcg;
    //   991: astore #39
    //   993: aload_0
    //   994: getfield Zy : Lburp/Zbc9;
    //   997: aload #39
    //   999: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1002: pop
    //   1003: aload_0
    //   1004: aload #39
    //   1006: <illegal opcode> ZT : (Lburp/Zbyi;Lburp/Zbqc;)Lburp/Zxtf;
    //   1011: astore #40
    //   1013: aload_0
    //   1014: getfield ZF : Lburp/Zmu5;
    //   1017: aload #40
    //   1019: invokevirtual Zd : (Lburp/Zxtf;)V
    //   1022: aload_0
    //   1023: getfield Zc : Lburp/Zbkd;
    //   1026: iconst_0
    //   1027: invokevirtual setVisible : (Z)V
    //   1030: aload_0
    //   1031: getfield Zy : Lburp/Zbc9;
    //   1034: aload #39
    //   1036: invokevirtual ZP : (Ljava/awt/Component;)V
    //   1039: iload #27
    //   1041: ifeq -> 1051
    //   1044: iconst_5
    //   1045: anewarray burp/Zbqc
    //   1048: invokestatic Zr : ([Lburp/Zbqc;)V
    //   1051: return
  }
  
  private void Zd(Zgtg<Zto7> paramZgtg, Zm2j paramZm2j) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #-6216
    //   7: sipush #8378
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_3
    //   17: aload_3
    //   18: getstatic burp/Zeuf.ADD : Lburp/Zeuf;
    //   21: getstatic burp/Zlkk.ICON_NORMAL : Lburp/Zlkk;
    //   24: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   27: invokevirtual Z_ : ()Lburp/Ze9n;
    //   30: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   33: aload_3
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> actionPerformed : (Lburp/Zbyi;Lburp/Zgtg;)Ljava/awt/event/ActionListener;
    //   41: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   44: aload_2
    //   45: aload_3
    //   46: invokevirtual ZY : (Lburp/Zepe;)V
    //   49: return
  }
  
  private Zepe ZY() {
    Zepe zepe = new Zepe(a(-6214, 25559), ZY);
    zepe.addActionListener(this::lambda$createClearLogMenuItem$10);
    return zepe;
  }
  
  private List<Zto7> Zz() {
    return Zm((Point)null);
  }
  
  private List<Zto7> Zm(Point paramPoint) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return ZR(this.Zf.ZS(paramPoint));
  }
  
  private List<Zto7> ZR(int[] paramArrayOfint) {
    return (List<Zto7>)Arrays.stream(paramArrayOfint).mapToObj(this::ZP).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zto7 ZP(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ZF.getRowCount())
      return null; 
    int i = this.Zf.convertRowIndexToModel(paramInt);
    return this.ZF.ZW(i);
  }
  
  private void ZL(int paramInt1, int paramInt2) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    try {
      int i = this.Zf.convertRowIndexToModel(paramInt1);
      Zto7 zto7 = this.ZF.ZW(i);
      ZY(zto7);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZY(Zto7 paramZto7) {
    // Byte code:
    //   0: invokestatic Zt : ()I
    //   3: istore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   10: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   13: aload_0
    //   14: getfield ZH : Ljava/util/concurrent/atomic/AtomicReference;
    //   17: new burp/Zz6w
    //   20: dup
    //   21: aload_1
    //   22: aload_0
    //   23: <illegal opcode> test : (Lburp/Zbyi;)Ljava/util/function/Predicate;
    //   28: aload_0
    //   29: getfield Zf : Lburp/Zbws;
    //   32: invokevirtual getSelectedRows : ()[I
    //   35: invokespecial <init> : (Lburp/Zto7;Ljava/util/function/Predicate;[I)V
    //   38: invokevirtual getAndSet : (Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast burp/Zz6w
    //   44: astore_3
    //   45: aload_1
    //   46: ifnull -> 100
    //   49: aload_3
    //   50: ifnull -> 100
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: aload_3
    //   61: getfield Zr : Lburp/Zto7;
    //   64: ifnull -> 100
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_3
    //   75: getfield Zr : Lburp/Zto7;
    //   78: invokeinterface ZEd : ()J
    //   83: aload_1
    //   84: invokeinterface ZEd : ()J
    //   89: lcmp
    //   90: ifeq -> 183
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Zg : Lburp/Zbdf;
    //   104: aload_1
    //   105: ifnonnull -> 123
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aconst_null
    //   116: goto -> 142
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_1
    //   124: invokeinterface Zo3 : ()Lburp/Zbr;
    //   129: aload_1
    //   130: invokeinterface Zod : ()Lburp/Zmzk;
    //   135: aload_0
    //   136: getfield Zb : Lburp/Zey9;
    //   139: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   142: aload_0
    //   143: getfield Zl : Lburp/Zzee;
    //   146: invokevirtual ZI : (Lburp/Zefx;Lburp/Zmgv;)V
    //   149: aload_0
    //   150: getfield ZQ : Lburp/Zbdf;
    //   153: aload_1
    //   154: ifnonnull -> 167
    //   157: getstatic burp/Zbyi.ZC : Lburp/Zstu;
    //   160: goto -> 173
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_1
    //   168: invokeinterface ZoO : ()Lburp/Zstu;
    //   173: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   176: aload_0
    //   177: getfield Zl : Lburp/Zzee;
    //   180: invokevirtual ZL : (Lburp/Zstu;Lburp/Zgu3;Lburp/Zmgv;)V
    //   183: aload_1
    //   184: ifnull -> 223
    //   187: aload_0
    //   188: getfield ZR : Lburp/Zbdx;
    //   191: invokevirtual isVisible : ()Z
    //   194: ifne -> 238
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: aload_0
    //   205: getfield ZR : Lburp/Zbdx;
    //   208: iconst_1
    //   209: invokevirtual setVisible : (Z)V
    //   212: iload_2
    //   213: ifne -> 238
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_0
    //   224: getfield ZR : Lburp/Zbdx;
    //   227: iconst_0
    //   228: invokevirtual setVisible : (Z)V
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: goto -> 249
    //   241: astore_3
    //   242: aload_3
    //   243: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   246: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   249: return
    // Exception table:
    //   from	to	target	type
    //   13	238	241	java/lang/Exception
    //   45	53	56	java/lang/Exception
    //   49	67	70	java/lang/Exception
    //   60	93	96	java/lang/Exception
    //   74	108	111	java/lang/Exception
    //   100	119	119	java/lang/Exception
    //   142	163	163	java/lang/Exception
    //   183	197	200	java/lang/Exception
    //   187	216	219	java/lang/Exception
    //   204	231	234	java/lang/Exception
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZM != null) {
      this.ZM.updateUI();
      this.ZO.updateUI();
      Zz6w zz6w = this.ZH.get();
      if (zz6w == null || zz6w.Zr == null) {
        SwingUtilities.updateComponentTreeUI(this.Zg);
        SwingUtilities.updateComponentTreeUI(this.ZQ);
      } 
    } 
  }
  
  public void Zt2() {
    ZR();
    Zn();
  }
  
  private void ZR() {
    Zj(this.Zq.Zk());
    this.ZS.Zt2();
  }
  
  private void Zn() {
    this.ZN.Zt2();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.Zq.Zd(paramZmf_);
    this.Zu.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.Zq.Zl(paramZg4j);
    this.Zu.Zl(paramZg4j);
  }
  
  private void Zj(boolean paramBoolean) {
    this.Zq.Zo(paramBoolean);
    this.Zv.setText(paramBoolean ? a(-6213, 2480) : a(-6221, -32409));
    this.Zv.setSelected(paramBoolean);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    boolean bool = this.ZZ.ZV(paramInt, Zz(), this);
    if (bool && paramInt == 135936 && this.ZH.get() != null)
      ((Zz6w)this.ZH.get()).Zs.forEach(this::lambda$handleAction$13); 
    return bool;
  }
  
  private void Zt() {
    this.ZI = new Zbqc();
    this.ZB = new Zbqc();
    this.Zj = new Zbqc();
    this.ZE = new Zbkd();
    this.Zc = new Zbkd();
    this.Zy = new Zbc9();
    this.ZK = new Zmyz();
    this.Za = new Zbup();
    this.Zf = new Zbws();
    this.Z_ = new Zbqc();
    setLayout(new BorderLayout());
    this.ZI.setLayout(new BorderLayout());
    add(this.ZI, a(-6209, 890));
    this.ZB.setLayout(new BorderLayout());
    this.Zj.setLayout(new GridBagLayout());
    this.ZE.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Zj.add(this.ZE, gridBagConstraints);
    this.Zc.setBorder(BorderFactory.createEmptyBorder(5, 10, 20, 10));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zj.add(this.Zc, gridBagConstraints);
    this.ZB.add(this.Zj, a(-6218, -30818));
    this.ZK.setLeftComponent(this.Za);
    this.ZK.setOrientation(0);
    this.ZK.setRightComponent(this.Z_);
    this.Za.setViewportView(this.Zf);
    this.ZK.setLeftComponent(this.Za);
    this.Z_.setLayout(new BorderLayout());
    this.ZK.setRightComponent(this.Z_);
    this.Zy.add(this.ZK);
    this.ZB.add(this.Zy, a(-6215, 13754));
    add(this.ZB, a(-6215, 13754));
  }
  
  private void lambda$handleAction$13(Integer paramInteger) {
    this.ZF.fireTableRowsUpdated(paramInteger.intValue(), paramInteger.intValue());
  }
  
  private boolean lambda$updateRequestResponseViewer$12(Zto7 paramZto7) {
    return Optional.<Zto7>ofNullable(this.ZF.ZW(0)).map(Zto7::ZEd).filter(paramZto7::lambda$updateRequestResponseViewer$11).isPresent();
  }
  
  private static boolean lambda$updateRequestResponseViewer$11(Zto7 paramZto7, Long paramLong) {
    return (paramLong.longValue() <= paramZto7.ZEd());
  }
  
  private void lambda$createClearLogMenuItem$10(ActionEvent paramActionEvent) {
    Objects.requireNonNull(this.ZJ);
    this.ZT.Zx(this.ZJ::Zl);
  }
  
  private void lambda$addCustomColumnMenuOption$9(Zgtg paramZgtg, ActionEvent paramActionEvent) {
    Window window = SwingUtilities.getWindowAncestor(this.ZN.ZL());
    Zrh7 zrh7 = paramZgtg.Zw(window, Zm_4.ZF, Zk97.BAMBDAS_LOGGER_CUSTOM_COLUMN);
    zrh7.Zq(window);
    zrh7.setVisible(true);
  }
  
  private void lambda$new$8(Zbqc paramZbqc, boolean paramBoolean) {
    this.Zc.setVisible(!paramBoolean);
    Component component = (Component)(paramBoolean ? paramZbqc : this.ZK);
    this.Zy.ZP(component);
  }
  
  private Zto7 lambda$new$7() {
    return ((Zz6w)this.ZH.get()).ZP();
  }
  
  private void lambda$new$6(Zsju paramZsju, ActionEvent paramActionEvent) {
    Zj(this.Zv.isSelected());
    paramZsju.ZGJ();
  }
  
  private static void lambda$new$5(Zsju paramZsju, Zsud paramZsud, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    try {
      paramZsju.ZGJ();
    } finally {
      paramRunnable.run();
    } 
  }
  
  private void lambda$new$4(Ztjx paramZtjx) {
    List<Zlz8> list = paramZtjx.ZEU();
    Iterator<Zlz8> iterator = list.iterator();
    int i = Zmu5.Z_();
    while (iterator.hasNext()) {
      Zlz8 zlz8 = iterator.next();
      if (zlz8.ZLx().equals(Zru.LOGGER.id)) {
        this.Zf.Zj(zlz8);
        if (i != 0)
          continue; 
        break;
      } 
      continue;
      if (i != 0)
        break; 
    } 
  }
  
  private void lambda$new$3(Consumer<Zbws> paramConsumer, boolean paramBoolean, Zs6i paramZs6i) {
    this.Zf.ZL(this.ZF);
    paramConsumer.accept(this.Zf);
    if (paramBoolean)
      paramZs6i.Zc(this::lambda$new$2); 
  }
  
  private Zlz8 lambda$new$2() {
    return new Zlz8(Zru.LOGGER.id, this.Zf.ZHh());
  }
  
  private void lambda$new$1(HierarchyEvent paramHierarchyEvent) {
    Zlhx.ZX(paramHierarchyEvent, this.Zf, Zrrh.LOGGER_CUSTOM_COLUMN_VIEWED);
  }
  
  private void lambda$new$0(Zta4 paramZta4, HierarchyEvent paramHierarchyEvent) {
    Zr30.ZN(paramHierarchyEvent, this.Zf, paramZta4.Zb(), Zrrh.LOGGER_VIEW_FILTERED_BY_BAMBDA_VIEWED);
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ä\\fNJ0úÿ¼\\n÷öÀ¯ÂÿÎtPVPt¥y´ôÛ+R±iïç\\bôi~g0þrÏlï~ºMv!îB1¶Æá¼]à¥"Å®X?#àÄUhÑ)Åý¡]GPÕõ1lsCLsç:ðò7aQ{ÛääoÌF9fÀ)xÞÌiSãíåf:d`aµhÇS\\f½6ÒD­ea§*£Éúºå$%të÷¯¢ë 1¡âIC0B¥N8:/gK|;_<m)Whèp¯¼:ãÁÐm3m)À<xøÖ6$¡\\rÑÐàÜ3¸31¢%Õ²°±$Îh¨[BÞ#pKÒ­ì¨ØIa\\b¢µmsª\\f9\N¸äàÇW"l»`*L7`$`ÃR'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
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
    //   68: ldc ' Xð\t_Ö×5(V^AýP.Þ]þLqê­5'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zbyi.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbyi.b : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #16
    //   224: goto -> 244
    //   227: bipush #119
    //   229: goto -> 244
    //   232: bipush #60
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #98
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
    //   300: invokestatic ZQm : ()Lburp/Zyf;
    //   303: putstatic burp/Zbyi.ZC : Lburp/Zstu;
    //   306: getstatic burp/Zeuf.TRASH : Lburp/Zeuf;
    //   309: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   312: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   315: invokevirtual Z_ : ()Lburp/Ze9n;
    //   318: putstatic burp/Zbyi.ZY : Lburp/Ze9n;
    //   321: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7BA) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */