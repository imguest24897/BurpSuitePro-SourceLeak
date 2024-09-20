package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.BoundedRangeModel;
import javax.swing.ButtonGroup;

public class Zl0p extends Zl04 implements Runnable {
  private final Zbzh ZG;
  
  private final Zbzh Zs;
  
  private final boolean Zc;
  
  private final Zb0h ZX;
  
  private final Zl04 ZQ;
  
  private final String ZM;
  
  private Zsd9 Zd;
  
  private Zsd9 Zq;
  
  private Zbup ZL;
  
  private Zbup Zo;
  
  BoundedRangeModel ZU;
  
  BoundedRangeModel Zv;
  
  BoundedRangeModel Zi;
  
  BoundedRangeModel ZO;
  
  private static boolean ZB;
  
  private Zzdy Zf;
  
  private Zmg2 Zx;
  
  private Zmg2 Zz;
  
  private Zmg2 Zg;
  
  private Zmg2 ZE;
  
  private Zbqc ZT;
  
  private ButtonGroup ZJ;
  
  private Zbqc ZH;
  
  private Zm99 ZP;
  
  private Zbqc Zt;
  
  private Zbqc ZS;
  
  private Zbqc ZR;
  
  private Zbqc Zn;
  
  private Zbqc ZW;
  
  private Zm99 ZK;
  
  private Zm99 Zb;
  
  private Zm99 ZY;
  
  private Zm99 ZZ;
  
  private Zm99 Zy;
  
  private ButtonGroup ZI;
  
  private Zbqc Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl0p(Zl04 paramZl04, String paramString, Zbzh paramZbzh1, Zbzh paramZbzh2, boolean paramBoolean, Zb0h paramZb0h) {
    this.ZQ = paramZl04;
    this.ZM = paramString;
    this.ZG = paramZbzh1;
    this.Zs = paramZbzh2;
    this.Zc = paramBoolean;
    this.ZX = paramZb0h;
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore_1
    //   4: new burp/Zl0h
    //   7: dup
    //   8: aload_0
    //   9: getfield ZQ : Lburp/Zl04;
    //   12: aload_0
    //   13: getfield Zc : Z
    //   16: ifeq -> 31
    //   19: sipush #11922
    //   22: sipush #19908
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: goto -> 40
    //   31: sipush #11933
    //   34: sipush #-10707
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: iconst_1
    //   41: invokespecial <init> : (Ljava/awt/Window;Ljava/lang/String;Z)V
    //   44: astore_2
    //   45: aload_2
    //   46: iconst_1
    //   47: invokevirtual setVisible : (Z)V
    //   50: aload_0
    //   51: getfield ZG : Lburp/Zbzh;
    //   54: getfield ZZ : [B
    //   57: arraylength
    //   58: newarray byte
    //   60: astore_3
    //   61: aload_0
    //   62: getfield Zs : Lburp/Zbzh;
    //   65: getfield ZZ : [B
    //   68: arraylength
    //   69: newarray byte
    //   71: astore #4
    //   73: aload_0
    //   74: getfield Zc : Z
    //   77: ifeq -> 114
    //   80: new burp/Zz2r
    //   83: dup
    //   84: aload_0
    //   85: getfield ZG : Lburp/Zbzh;
    //   88: getfield ZZ : [B
    //   91: invokestatic Zy : ([B)Lburp/Zyf;
    //   94: aload_0
    //   95: getfield Zs : Lburp/Zbzh;
    //   98: getfield ZZ : [B
    //   101: invokestatic Zy : ([B)Lburp/Zyf;
    //   104: aload_2
    //   105: invokespecial <init> : (Lburp/Zstu;Lburp/Zstu;Lburp/Zlc8;)V
    //   108: invokevirtual ZM : ()Ljava/util/List;
    //   111: goto -> 163
    //   114: new burp/Zrtg
    //   117: dup
    //   118: aload_0
    //   119: getfield ZG : Lburp/Zbzh;
    //   122: getfield ZZ : [B
    //   125: invokestatic Zy : ([B)Lburp/Zyf;
    //   128: iconst_0
    //   129: aload_0
    //   130: getfield ZG : Lburp/Zbzh;
    //   133: getfield ZZ : [B
    //   136: arraylength
    //   137: aload_0
    //   138: getfield Zs : Lburp/Zbzh;
    //   141: getfield ZZ : [B
    //   144: invokestatic Zy : ([B)Lburp/Zyf;
    //   147: iconst_0
    //   148: aload_0
    //   149: getfield Zs : Lburp/Zbzh;
    //   152: getfield ZZ : [B
    //   155: arraylength
    //   156: aload_2
    //   157: invokespecial <init> : (Lburp/Zstu;IILburp/Zstu;IILburp/Zlc8;)V
    //   160: invokevirtual ZT : ()Ljava/util/List;
    //   163: astore #5
    //   165: aload_2
    //   166: ldc 90.0
    //   168: sipush #11912
    //   171: sipush #27565
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual Zq : (FLjava/lang/String;)Z
    //   180: ifne -> 188
    //   183: aload_0
    //   184: invokevirtual dispose : ()V
    //   187: return
    //   188: aload #5
    //   190: invokeinterface iterator : ()Ljava/util/Iterator;
    //   195: astore #6
    //   197: aload #6
    //   199: invokeinterface hasNext : ()Z
    //   204: ifeq -> 378
    //   207: aload #6
    //   209: invokeinterface next : ()Ljava/lang/Object;
    //   214: checkcast burp/Ztsm
    //   217: astore #7
    //   219: aload #7
    //   221: getfield Zz : [I
    //   224: astore #8
    //   226: aload #7
    //   228: getfield ZK : B
    //   231: tableswitch default -> 374, 1 -> 347, 2 -> 315, 3 -> 256
    //   256: aload #8
    //   258: iconst_0
    //   259: iaload
    //   260: istore #9
    //   262: iload #9
    //   264: aload #8
    //   266: iconst_1
    //   267: iaload
    //   268: if_icmpge -> 283
    //   271: aload_3
    //   272: iload #9
    //   274: iconst_3
    //   275: bastore
    //   276: iinc #9, 1
    //   279: iload_1
    //   280: ifeq -> 262
    //   283: aload #8
    //   285: iconst_2
    //   286: iaload
    //   287: istore #9
    //   289: iload #9
    //   291: aload #8
    //   293: iconst_3
    //   294: iaload
    //   295: if_icmpge -> 311
    //   298: aload #4
    //   300: iload #9
    //   302: iconst_3
    //   303: bastore
    //   304: iinc #9, 1
    //   307: iload_1
    //   308: ifeq -> 289
    //   311: iload_1
    //   312: ifeq -> 374
    //   315: aload #8
    //   317: iconst_2
    //   318: iaload
    //   319: istore #9
    //   321: iload #9
    //   323: aload #8
    //   325: iconst_3
    //   326: iaload
    //   327: if_icmpge -> 343
    //   330: aload #4
    //   332: iload #9
    //   334: iconst_2
    //   335: bastore
    //   336: iinc #9, 1
    //   339: iload_1
    //   340: ifeq -> 321
    //   343: iload_1
    //   344: ifeq -> 374
    //   347: aload #8
    //   349: iconst_0
    //   350: iaload
    //   351: istore #9
    //   353: iload #9
    //   355: aload #8
    //   357: iconst_1
    //   358: iaload
    //   359: if_icmpge -> 374
    //   362: aload_3
    //   363: iload #9
    //   365: iconst_1
    //   366: bastore
    //   367: iinc #9, 1
    //   370: iload_1
    //   371: ifeq -> 353
    //   374: iload_1
    //   375: ifeq -> 197
    //   378: aload_2
    //   379: ldc 95.0
    //   381: sipush #11932
    //   384: sipush #-4840
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: invokevirtual Zq : (FLjava/lang/String;)Z
    //   393: ifne -> 401
    //   396: aload_0
    //   397: invokevirtual dispose : ()V
    //   400: return
    //   401: aload_0
    //   402: invokevirtual ZV : ()V
    //   405: aload_0
    //   406: new burp/Zsd9
    //   409: dup
    //   410: aload_0
    //   411: <illegal opcode> get : (Lburp/Zl0p;)Ljava/util/function/Supplier;
    //   416: iconst_0
    //   417: iconst_1
    //   418: new burp/Zs61
    //   421: dup
    //   422: aload_3
    //   423: invokespecial <init> : ([B)V
    //   426: aconst_null
    //   427: aload_0
    //   428: getfield ZX : Lburp/Zb0h;
    //   431: invokespecial <init> : (Ljava/util/function/Supplier;ZZLburp/Zepx;Ljavax/swing/event/DocumentListener;Lburp/Zb0h;)V
    //   434: putfield Zd : Lburp/Zsd9;
    //   437: aload_0
    //   438: getfield Zd : Lburp/Zsd9;
    //   441: aload_0
    //   442: getfield ZG : Lburp/Zbzh;
    //   445: getfield ZZ : [B
    //   448: invokevirtual ZM : ([B)V
    //   451: aload_0
    //   452: aload_0
    //   453: getfield Zd : Lburp/Zsd9;
    //   456: invokevirtual ZO : ()Ljava/awt/Component;
    //   459: checkcast burp/Zbup
    //   462: putfield ZL : Lburp/Zbup;
    //   465: aload_0
    //   466: aload_0
    //   467: getfield ZL : Lburp/Zbup;
    //   470: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
    //   473: invokevirtual getModel : ()Ljavax/swing/BoundedRangeModel;
    //   476: putfield ZU : Ljavax/swing/BoundedRangeModel;
    //   479: aload_0
    //   480: aload_0
    //   481: getfield ZL : Lburp/Zbup;
    //   484: invokevirtual getHorizontalScrollBar : ()Ljavax/swing/JScrollBar;
    //   487: invokevirtual getModel : ()Ljavax/swing/BoundedRangeModel;
    //   490: putfield Zi : Ljavax/swing/BoundedRangeModel;
    //   493: aload_0
    //   494: getfield ZH : Lburp/Zbqc;
    //   497: aload_0
    //   498: getfield ZL : Lburp/Zbup;
    //   501: sipush #11921
    //   504: sipush #25756
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   513: aload_0
    //   514: getfield ZY : Lburp/Zm99;
    //   517: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   520: aload_0
    //   521: getfield ZG : Lburp/Zbzh;
    //   524: getfield ZZ : [B
    //   527: arraylength
    //   528: i2l
    //   529: invokevirtual format : (J)Ljava/lang/String;
    //   532: sipush #11907
    //   535: sipush #-16283
    //   538: invokestatic a : (II)Ljava/lang/String;
    //   541: swap
    //   542: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   547: invokevirtual setText : (Ljava/lang/String;)V
    //   550: aload_0
    //   551: getfield Zc : Z
    //   554: ifeq -> 578
    //   557: aload_0
    //   558: getfield Zd : Lburp/Zsd9;
    //   561: iconst_0
    //   562: iconst_0
    //   563: invokevirtual ZC : (ZZ)V
    //   566: aload_0
    //   567: getfield Zx : Lburp/Zmg2;
    //   570: iconst_1
    //   571: invokevirtual setSelected : (Z)V
    //   574: iload_1
    //   575: ifeq -> 595
    //   578: aload_0
    //   579: getfield Zd : Lburp/Zsd9;
    //   582: iconst_1
    //   583: iconst_0
    //   584: invokevirtual ZC : (ZZ)V
    //   587: aload_0
    //   588: getfield Zz : Lburp/Zmg2;
    //   591: iconst_1
    //   592: invokevirtual setSelected : (Z)V
    //   595: aload_0
    //   596: new burp/Zsd9
    //   599: dup
    //   600: aload_0
    //   601: <illegal opcode> get : (Lburp/Zl0p;)Ljava/util/function/Supplier;
    //   606: iconst_0
    //   607: iconst_1
    //   608: new burp/Zs61
    //   611: dup
    //   612: aload #4
    //   614: invokespecial <init> : ([B)V
    //   617: aconst_null
    //   618: aload_0
    //   619: getfield ZX : Lburp/Zb0h;
    //   622: invokespecial <init> : (Ljava/util/function/Supplier;ZZLburp/Zepx;Ljavax/swing/event/DocumentListener;Lburp/Zb0h;)V
    //   625: putfield Zq : Lburp/Zsd9;
    //   628: aload_0
    //   629: getfield Zq : Lburp/Zsd9;
    //   632: aload_0
    //   633: getfield Zs : Lburp/Zbzh;
    //   636: getfield ZZ : [B
    //   639: invokevirtual ZM : ([B)V
    //   642: aload_0
    //   643: aload_0
    //   644: getfield Zq : Lburp/Zsd9;
    //   647: invokevirtual ZO : ()Ljava/awt/Component;
    //   650: checkcast burp/Zbup
    //   653: putfield Zo : Lburp/Zbup;
    //   656: aload_0
    //   657: aload_0
    //   658: getfield Zo : Lburp/Zbup;
    //   661: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
    //   664: invokevirtual getModel : ()Ljavax/swing/BoundedRangeModel;
    //   667: putfield Zv : Ljavax/swing/BoundedRangeModel;
    //   670: aload_0
    //   671: aload_0
    //   672: getfield Zo : Lburp/Zbup;
    //   675: invokevirtual getHorizontalScrollBar : ()Ljavax/swing/JScrollBar;
    //   678: invokevirtual getModel : ()Ljavax/swing/BoundedRangeModel;
    //   681: putfield ZO : Ljavax/swing/BoundedRangeModel;
    //   684: aload_0
    //   685: getfield Z_ : Lburp/Zbqc;
    //   688: aload_0
    //   689: getfield Zo : Lburp/Zbup;
    //   692: sipush #11921
    //   695: sipush #25756
    //   698: invokestatic a : (II)Ljava/lang/String;
    //   701: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   704: aload_0
    //   705: getfield Zy : Lburp/Zm99;
    //   708: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   711: aload_0
    //   712: getfield Zs : Lburp/Zbzh;
    //   715: getfield ZZ : [B
    //   718: arraylength
    //   719: i2l
    //   720: invokevirtual format : (J)Ljava/lang/String;
    //   723: sipush #11920
    //   726: sipush #-10262
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: swap
    //   733: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   738: invokevirtual setText : (Ljava/lang/String;)V
    //   741: aload_0
    //   742: getfield Zc : Z
    //   745: ifeq -> 769
    //   748: aload_0
    //   749: getfield Zq : Lburp/Zsd9;
    //   752: iconst_0
    //   753: iconst_0
    //   754: invokevirtual ZC : (ZZ)V
    //   757: aload_0
    //   758: getfield Zg : Lburp/Zmg2;
    //   761: iconst_1
    //   762: invokevirtual setSelected : (Z)V
    //   765: iload_1
    //   766: ifeq -> 786
    //   769: aload_0
    //   770: getfield Zq : Lburp/Zsd9;
    //   773: iconst_1
    //   774: iconst_0
    //   775: invokevirtual ZC : (ZZ)V
    //   778: aload_0
    //   779: getfield ZE : Lburp/Zmg2;
    //   782: iconst_1
    //   783: invokevirtual setSelected : (Z)V
    //   786: aload_0
    //   787: getfield ZZ : Lburp/Zm99;
    //   790: getstatic burp/Zlkk.COMPARER_MODIFIED : Lburp/Zlkk;
    //   793: invokestatic Zj : (Lburp/Zm99;Lburp/Zlkk;)V
    //   796: aload_0
    //   797: getfield Zb : Lburp/Zm99;
    //   800: getstatic burp/Zlkk.COMPARER_DELETED : Lburp/Zlkk;
    //   803: invokestatic Zj : (Lburp/Zm99;Lburp/Zlkk;)V
    //   806: aload_0
    //   807: getfield ZK : Lburp/Zm99;
    //   810: getstatic burp/Zlkk.COMPARER_ADDED : Lburp/Zlkk;
    //   813: invokestatic Zj : (Lburp/Zm99;Lburp/Zlkk;)V
    //   816: aload_0
    //   817: getfield Zc : Z
    //   820: ifeq -> 835
    //   823: sipush #11917
    //   826: sipush #23250
    //   829: invokestatic a : (II)Ljava/lang/String;
    //   832: goto -> 844
    //   835: sipush #11910
    //   838: sipush #3325
    //   841: invokestatic a : (II)Ljava/lang/String;
    //   844: astore #6
    //   846: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   849: aload #5
    //   851: invokeinterface size : ()I
    //   856: i2l
    //   857: invokevirtual format : (J)Ljava/lang/String;
    //   860: aload #5
    //   862: invokeinterface size : ()I
    //   867: iconst_1
    //   868: if_icmpne -> 883
    //   871: sipush #11930
    //   874: sipush #-2319
    //   877: invokestatic a : (II)Ljava/lang/String;
    //   880: goto -> 892
    //   883: sipush #11925
    //   886: sipush #32636
    //   889: invokestatic a : (II)Ljava/lang/String;
    //   892: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   897: astore #7
    //   899: aload_0
    //   900: aload_0
    //   901: getfield ZM : Ljava/lang/String;
    //   904: ifnonnull -> 974
    //   907: aload #6
    //   909: aload_0
    //   910: getfield ZG : Lburp/Zbzh;
    //   913: getfield Zv : I
    //   916: aload_0
    //   917: getfield Zs : Lburp/Zbzh;
    //   920: getfield Zv : I
    //   923: aload #7
    //   925: astore #10
    //   927: istore #11
    //   929: istore #12
    //   931: sipush #11909
    //   934: sipush #-27737
    //   937: invokestatic a : (II)Ljava/lang/String;
    //   940: iload #12
    //   942: sipush #11929
    //   945: sipush #9404
    //   948: invokestatic a : (II)Ljava/lang/String;
    //   951: iload #11
    //   953: sipush #11924
    //   956: sipush #-17159
    //   959: invokestatic a : (II)Ljava/lang/String;
    //   962: aload #10
    //   964: ldc ')'
    //   966: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   971: goto -> 978
    //   974: aload_0
    //   975: getfield ZM : Ljava/lang/String;
    //   978: invokevirtual setTitle : (Ljava/lang/String;)V
    //   981: aload_2
    //   982: ldc 100.0
    //   984: sipush #11905
    //   987: sipush #-25244
    //   990: invokestatic a : (II)Ljava/lang/String;
    //   993: invokevirtual Zq : (FLjava/lang/String;)Z
    //   996: ifne -> 1004
    //   999: aload_0
    //   1000: invokevirtual dispose : ()V
    //   1003: return
    //   1004: getstatic burp/Zl0p.ZB : Z
    //   1007: ifeq -> 1023
    //   1010: aload_0
    //   1011: getfield Zf : Lburp/Zzdy;
    //   1014: iconst_1
    //   1015: invokevirtual setSelected : (Z)V
    //   1018: aload_0
    //   1019: aconst_null
    //   1020: invokevirtual Zr : (Ljava/awt/event/ActionEvent;)V
    //   1023: aload_0
    //   1024: getfield Zo : Lburp/Zbup;
    //   1027: bipush #100
    //   1029: bipush #25
    //   1031: invokestatic Zf : (Ljava/awt/Component;II)V
    //   1034: aload_0
    //   1035: getfield ZL : Lburp/Zbup;
    //   1038: bipush #100
    //   1040: bipush #25
    //   1042: invokestatic Zf : (Ljava/awt/Component;II)V
    //   1045: aload_2
    //   1046: iconst_0
    //   1047: invokevirtual setVisible : (Z)V
    //   1050: aload_0
    //   1051: invokevirtual pack : ()V
    //   1054: aload_0
    //   1055: aload_0
    //   1056: getfield ZQ : Lburp/Zl04;
    //   1059: invokevirtual ZO : (Ljava/awt/Window;)V
    //   1062: aload_0
    //   1063: iconst_1
    //   1064: invokevirtual setVisible : (Z)V
    //   1067: return
  }
  
  private static void Zj(Zm99 paramZm99, Zlkk paramZlkk) {
    paramZm99.Ze(Zlkk.COMPARER_FOREGROUND);
    paramZm99.ZO(paramZlkk);
  }
  
  private void ZV() {
    this.ZJ = new ButtonGroup();
    this.ZI = new ButtonGroup();
    this.ZT = new Zbqc();
    this.ZH = new Zbqc();
    this.Zt = new Zbqc();
    this.ZY = new Zm99();
    this.ZS = new Zbqc();
    this.Zz = new Zmg2();
    this.Zx = new Zmg2();
    this.Z_ = new Zbqc();
    this.ZR = new Zbqc();
    this.Zy = new Zm99();
    this.Zn = new Zbqc();
    this.ZE = new Zmg2();
    this.Zg = new Zmg2();
    this.ZW = new Zbqc();
    this.ZP = new Zm99();
    this.ZZ = new Zm99();
    this.Zb = new Zm99();
    this.ZK = new Zm99();
    this.Zf = new Zzdy();
    setDefaultCloseOperation(2);
    this.ZT.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
    this.ZT.setLayout(new GridLayout(1, 2, 25, 0));
    this.ZH.setLayout(new BorderLayout());
    this.Zt.setLayout(new BorderLayout());
    this.Zt.add(this.ZY, a(11906, 29168));
    this.Zz.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZJ.add(this.Zz);
    this.Zz.setSelected(true);
    this.Zz.setText(a(11916, 31369));
    this.Zz.setMargin(new Insets(0, 0, 0, 0));
    this.Zz.addActionListener(new Zm9x(this));
    this.ZS.add(this.Zz);
    this.Zx.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZJ.add(this.Zx);
    this.Zx.setText(a(11915, 12884));
    this.Zx.setMargin(new Insets(0, 0, 0, 0));
    this.Zx.addActionListener(new Zemu(this));
    this.ZS.add(this.Zx);
    this.Zt.add(this.ZS, a(11914, 28921));
    this.ZH.add(this.Zt, a(11927, 12544));
    this.ZT.add(this.ZH);
    this.Z_.setLayout(new BorderLayout());
    this.ZR.setLayout(new BorderLayout());
    this.ZR.add(this.Zy, a(11918, 5194));
    this.ZE.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZI.add(this.ZE);
    this.ZE.setSelected(true);
    this.ZE.setText(a(11931, 101));
    this.ZE.setMargin(new Insets(0, 0, 0, 0));
    this.ZE.addActionListener(new Zz13(this));
    this.Zn.add(this.ZE);
    this.Zg.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZI.add(this.Zg);
    this.Zg.setText(a(11935, 27361));
    this.Zg.setMargin(new Insets(0, 0, 0, 0));
    this.Zg.addActionListener(new Zkfe(this));
    this.Zn.add(this.Zg);
    this.ZR.add(this.Zn, a(11904, 5975));
    this.Z_.add(this.ZR, a(11911, -6760));
    this.ZT.add(this.Z_);
    getContentPane().add(this.ZT, a(11934, -5279));
    this.ZW.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.ZW.setLayout(gridBagLayout);
    this.ZP.setText(a(11923, 21547));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    this.ZW.add(this.ZP, gridBagConstraints);
    this.ZZ.setText(a(11913, -30576));
    this.ZZ.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    this.ZW.add(this.ZZ, gridBagConstraints);
    this.Zb.setText(a(11926, 465));
    this.Zb.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    this.ZW.add(this.Zb, gridBagConstraints);
    this.ZK.setText(a(11919, -17680));
    this.ZK.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    this.ZW.add(this.ZK, gridBagConstraints);
    this.Zf.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.Zf.setText(a(11908, -30399));
    this.Zf.setMargin(new Insets(0, 0, 0, 0));
    this.Zf.addActionListener(new Ztt3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 768;
    gridBagConstraints.weightx = 1.0D;
    this.ZW.add(this.Zf, gridBagConstraints);
    getContentPane().add(this.ZW, a(11928, 2997));
    pack();
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zf : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: putstatic burp/Zl0p.ZB : Z
    //   14: getstatic burp/Zl0p.ZB : Z
    //   17: ifeq -> 100
    //   20: aload_0
    //   21: getfield Zd : Lburp/Zsd9;
    //   24: invokevirtual Zu : ()Z
    //   27: ifeq -> 51
    //   30: aload_0
    //   31: getfield Zq : Lburp/Zsd9;
    //   34: iconst_1
    //   35: iconst_0
    //   36: invokevirtual ZC : (ZZ)V
    //   39: aload_0
    //   40: getfield ZE : Lburp/Zmg2;
    //   43: iconst_1
    //   44: invokevirtual setSelected : (Z)V
    //   47: iload_2
    //   48: ifeq -> 68
    //   51: aload_0
    //   52: getfield Zq : Lburp/Zsd9;
    //   55: iconst_0
    //   56: iconst_0
    //   57: invokevirtual ZC : (ZZ)V
    //   60: aload_0
    //   61: getfield ZE : Lburp/Zmg2;
    //   64: iconst_0
    //   65: invokevirtual setSelected : (Z)V
    //   68: aload_0
    //   69: getfield Zo : Lburp/Zbup;
    //   72: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
    //   75: aload_0
    //   76: getfield ZU : Ljavax/swing/BoundedRangeModel;
    //   79: invokevirtual setModel : (Ljavax/swing/BoundedRangeModel;)V
    //   82: aload_0
    //   83: getfield Zo : Lburp/Zbup;
    //   86: invokevirtual getHorizontalScrollBar : ()Ljavax/swing/JScrollBar;
    //   89: aload_0
    //   90: getfield Zi : Ljavax/swing/BoundedRangeModel;
    //   93: invokevirtual setModel : (Ljavax/swing/BoundedRangeModel;)V
    //   96: iload_2
    //   97: ifeq -> 128
    //   100: aload_0
    //   101: getfield Zo : Lburp/Zbup;
    //   104: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
    //   107: aload_0
    //   108: getfield Zv : Ljavax/swing/BoundedRangeModel;
    //   111: invokevirtual setModel : (Ljavax/swing/BoundedRangeModel;)V
    //   114: aload_0
    //   115: getfield Zo : Lburp/Zbup;
    //   118: invokevirtual getHorizontalScrollBar : ()Ljavax/swing/JScrollBar;
    //   121: aload_0
    //   122: getfield ZO : Ljavax/swing/BoundedRangeModel;
    //   125: invokevirtual setModel : (Ljavax/swing/BoundedRangeModel;)V
    //   128: return
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    this.Zq.ZC(false, false);
    if (this.Zf.isSelected()) {
      this.Zd.ZC(false, false);
      this.Zx.setSelected(true);
    } 
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    this.Zq.ZC(true, false);
    if (this.Zf.isSelected()) {
      this.Zd.ZC(true, false);
      this.Zz.setSelected(true);
    } 
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    this.Zd.ZC(false, false);
    if (this.Zf.isSelected()) {
      this.Zq.ZC(false, false);
      this.Zg.setSelected(true);
    } 
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.Zd.ZC(true, false);
    if (this.Zf.isSelected()) {
      this.Zq.ZC(true, false);
      this.ZE.setSelected(true);
    } 
  }
  
  private Component lambda$run$1() {
    return this.Z_;
  }
  
  private Component lambda$run$0() {
    return this.ZH;
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '[@ÃajìÍ1\\b\\tæµÑ Å8ýW<ÄO+¡\\f¸áÿ®ª]W\\r\\fÚÄµ!JdÑ¸{héjë°\\f Ö÷çª°ÿÏºÕU»¿¿\\bþöêÑ£õcÆ\\tK¿ÇÕ÷T \\fcÀY!<Á ðæ+äS\Þc¥\\n°ö»{»à\\f¦:[éZ8F 3\«v{ÆàÜ_(M¢@D#;\\bâ$z$ãÎJ»\\nÄoËÂ\\b¨"ÔdâtW¨ë'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #116
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
    //   67: ldc 'ËÐÓ%m*DÌB\\n=ëØã³FÎó'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #13
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #113
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
    //   128: putstatic burp/Zl0p.a : [Ljava/lang/String;
    //   131: bipush #32
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zl0p.b : [Ljava/lang/String;
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
    //   212: bipush #34
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #51
    //   224: goto -> 244
    //   227: bipush #56
    //   229: goto -> 244
    //   232: bipush #18
    //   234: goto -> 244
    //   237: bipush #27
    //   239: goto -> 244
    //   242: bipush #89
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
    //   300: iconst_0
    //   301: putstatic burp/Zl0p.ZB : Z
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2E9B) & 0xFFFF;
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
      byte b1 = 18;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */