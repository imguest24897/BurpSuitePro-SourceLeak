package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javafx.collections.ListChangeListener;
import javax.swing.RowSorter;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztua<T extends Zmw9<T>, U extends Zsii<T>, V> implements Zzp8<T>, Zzyl, Zeq, Zky2 {
  private final Zz0n ZB;
  
  private final Zerg Zu;
  
  private final Zgb6 Zf;
  
  private final Zskh ZX;
  
  private final Zbnt ZI;
  
  private final Ztwv ZP;
  
  private final Zg01<T> Zk;
  
  private final Zrzt<T, U> ZF;
  
  private final Zkuu<T> ZA;
  
  private final Ztyg ZM;
  
  private final Zbc9 ZQ;
  
  private final Zmi8<T, V> Zj;
  
  private final Zbws ZV;
  
  private final Zsh3<T> ZO;
  
  private final Zecu<T> Zm;
  
  private final Zspx<T> Zq;
  
  private final Zgq7 Zv;
  
  private final Zkl6 Zi;
  
  private final Zze3<T> ZN;
  
  private final Zeds<T> ZR;
  
  private final Zguu<T> Zy;
  
  private final Consumer<T> ZZ;
  
  private final Zze0 ZD;
  
  private final Zv8r ZL;
  
  private final Zm6x Zb;
  
  private final Zg98 Za;
  
  private final Zk97 ZT;
  
  private static boolean ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztua(Zsii<T> paramZsii, Zzit<T, U> paramZzit, Zz0n paramZz0n, Zerg paramZerg, Zkrw paramZkrw, Zgb6 paramZgb6, Zskh paramZskh, Zslu paramZslu, Zbiv paramZbiv, Zbnt paramZbnt, Ztwv paramZtwv, Zg01<T> paramZg01, Zefg<T> paramZefg, Zrzt<T, U> paramZrzt, Zkuu<T> paramZkuu, Ztyg paramZtyg, Zgq7 paramZgq7, Zkl6 paramZkl6, Zze3<T> paramZze3, Zbc2 paramZbc2, Zsza paramZsza, Zeds<T> paramZeds, boolean paramBoolean, Zmla paramZmla, Zl6k paramZl6k, Consumer<T> paramConsumer, Zky<T> paramZky, Zze0 paramZze0, Zv8r paramZv8r, Zrrh paramZrrh1, Zrrh paramZrrh2, Zzl0 paramZzl0, Zm6x paramZm6x, Zr_4 paramZr_4, Zs6i paramZs6i, Zru paramZru, String paramString1, String paramString2, String paramString3, Zx_w paramZx_w, Zg9z paramZg9z, Zxlp<V> paramZxlp, Zkoh<T, V> paramZkoh, Zg98 paramZg98, Zk97 paramZk97, Zb_j paramZb_j) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_3
    //   6: putfield ZB : Lburp/Zz0n;
    //   9: aload_0
    //   10: aload #4
    //   12: putfield Zu : Lburp/Zerg;
    //   15: aload_0
    //   16: aload #6
    //   18: putfield Zf : Lburp/Zgb6;
    //   21: aload_0
    //   22: aload #7
    //   24: putfield ZX : Lburp/Zskh;
    //   27: aload_0
    //   28: aload #10
    //   30: putfield ZI : Lburp/Zbnt;
    //   33: aload_0
    //   34: aload #11
    //   36: putfield ZP : Lburp/Ztwv;
    //   39: aload_0
    //   40: aload #12
    //   42: putfield Zk : Lburp/Zg01;
    //   45: aload_0
    //   46: aload #14
    //   48: putfield ZF : Lburp/Zrzt;
    //   51: aload_0
    //   52: aload #15
    //   54: putfield ZA : Lburp/Zkuu;
    //   57: aload_0
    //   58: aload #16
    //   60: putfield ZM : Lburp/Ztyg;
    //   63: aload_0
    //   64: aload #17
    //   66: putfield Zv : Lburp/Zgq7;
    //   69: aload_0
    //   70: aload #18
    //   72: putfield Zi : Lburp/Zkl6;
    //   75: aload_0
    //   76: aload #19
    //   78: putfield ZN : Lburp/Zze3;
    //   81: aload_0
    //   82: aload #22
    //   84: putfield ZR : Lburp/Zeds;
    //   87: aload_0
    //   88: aload #26
    //   90: putfield ZZ : Ljava/util/function/Consumer;
    //   93: aload_0
    //   94: aload #28
    //   96: putfield ZD : Lburp/Zze0;
    //   99: invokestatic ZX : ()Z
    //   102: aload_0
    //   103: aload #29
    //   105: putfield ZL : Lburp/Zv8r;
    //   108: aload_0
    //   109: aload #33
    //   111: putfield Zb : Lburp/Zm6x;
    //   114: aload_0
    //   115: aload #44
    //   117: putfield Za : Lburp/Zg98;
    //   120: aload_0
    //   121: aload #45
    //   123: putfield ZT : Lburp/Zk97;
    //   126: aload_0
    //   127: new burp/Zbws
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: putfield ZV : Lburp/Zbws;
    //   137: istore #47
    //   139: aload_0
    //   140: getfield ZV : Lburp/Zbws;
    //   143: aload_0
    //   144: invokevirtual ZP : (Lburp/Zzyl;)V
    //   147: aload_0
    //   148: getfield ZV : Lburp/Zbws;
    //   151: aload_0
    //   152: invokevirtual Zc : (Lburp/Zeq;)V
    //   155: aload_0
    //   156: getfield ZV : Lburp/Zbws;
    //   159: aload_0
    //   160: invokevirtual Zk : (Lburp/Zky2;)V
    //   163: aload_0
    //   164: getfield ZV : Lburp/Zbws;
    //   167: aload #38
    //   169: invokevirtual setName : (Ljava/lang/String;)V
    //   172: aload_0
    //   173: getfield ZV : Lburp/Zbws;
    //   176: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   179: iconst_1
    //   180: invokevirtual setReorderingAllowed : (Z)V
    //   183: aload_0
    //   184: getfield ZV : Lburp/Zbws;
    //   187: iconst_1
    //   188: invokevirtual setAutoCreateRowSorter : (Z)V
    //   191: aload_0
    //   192: getfield ZV : Lburp/Zbws;
    //   195: iconst_1
    //   196: invokevirtual ZF : (Z)V
    //   199: aload_0
    //   200: getfield ZV : Lburp/Zbws;
    //   203: iconst_1
    //   204: invokevirtual ZC : (Z)V
    //   207: aload_0
    //   208: getfield ZV : Lburp/Zbws;
    //   211: aload_0
    //   212: aload_1
    //   213: aload #30
    //   215: <illegal opcode> hierarchyChanged : (Lburp/Ztua;Lburp/Zsii;Lburp/Zrrh;)Ljava/awt/event/HierarchyListener;
    //   220: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   223: aload_0
    //   224: getfield ZV : Lburp/Zbws;
    //   227: aload_0
    //   228: aload #31
    //   230: <illegal opcode> hierarchyChanged : (Lburp/Ztua;Lburp/Zrrh;)Ljava/awt/event/HierarchyListener;
    //   235: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   238: new burp/Zswv
    //   241: dup
    //   242: aload #13
    //   244: aload #34
    //   246: <illegal opcode> test : (Lburp/Zr_4;)Ljava/util/function/Predicate;
    //   251: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   256: invokespecial <init> : (Lburp/Zefg;Ljava/util/function/Predicate;Ljava/util/function/Function;)V
    //   259: astore #48
    //   261: aload #14
    //   263: invokeinterface Zq : ()Lburp/Zmjx;
    //   268: astore #49
    //   270: aload_0
    //   271: new burp/Zmi8
    //   274: dup
    //   275: aload_1
    //   276: aload #48
    //   278: aload #12
    //   280: aload_0
    //   281: aload #49
    //   283: aload #8
    //   285: aload #42
    //   287: aload #43
    //   289: ldc2_w 500
    //   292: invokespecial <init> : (Lburp/Zsii;Lburp/Zswv;Ljavafx/collections/ObservableList;Lburp/Zzp8;Lburp/Zmjx;Lburp/Zz28;Lburp/Zxlp;Lburp/Zkoh;J)V
    //   295: putfield Zj : Lburp/Zmi8;
    //   298: aload_0
    //   299: getfield ZV : Lburp/Zbws;
    //   302: aload_0
    //   303: getfield Zj : Lburp/Zmi8;
    //   306: invokevirtual ZL : (Lburp/Zztu;)V
    //   309: aload_0
    //   310: aload #14
    //   312: aload_0
    //   313: aload #4
    //   315: aload #8
    //   317: aload #9
    //   319: aload #10
    //   321: aload #18
    //   323: invokeinterface Zu : (Lburp/Zzp8;Lburp/Zerg;Lburp/Zz28;Lburp/Zbiv;Lburp/Zbnt;Lburp/Zkl6;)Lburp/Zsh3;
    //   328: putfield ZO : Lburp/Zsh3;
    //   331: aload_0
    //   332: aload #14
    //   334: aload_3
    //   335: aload #4
    //   337: aload #6
    //   339: aload #7
    //   341: aload #10
    //   343: aload #11
    //   345: aload #16
    //   347: aload #17
    //   349: aload #18
    //   351: invokeinterface ZH : ()Lburp/Zey9;
    //   356: iconst_1
    //   357: invokeinterface ZR : (Lburp/Zz0n;Lburp/Zerg;Lburp/Zgb6;Lburp/Zskh;Lburp/Zbnt;Lburp/Ztwv;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zey9;Z)Lburp/Zecu;
    //   362: putfield Zm : Lburp/Zecu;
    //   365: new java/util/concurrent/atomic/AtomicReference
    //   368: dup
    //   369: aload_0
    //   370: getfield ZV : Lburp/Zbws;
    //   373: invokespecial <init> : (Ljava/lang/Object;)V
    //   376: astore #50
    //   378: new burp/Zr6
    //   381: dup
    //   382: aload_0
    //   383: getfield Zj : Lburp/Zmi8;
    //   386: aconst_null
    //   387: aload #50
    //   389: dup
    //   390: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   393: pop
    //   394: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   399: invokespecial <init> : (Lburp/Zs97;Ljava/awt/Window;Ljava/util/function/Supplier;)V
    //   402: astore #51
    //   404: new burp/Zgtg
    //   407: dup
    //   408: aload #6
    //   410: aload #41
    //   412: aload #49
    //   414: aload #33
    //   416: aload #51
    //   418: invokevirtual Zh : ()Lburp/Ztqd;
    //   421: aload #51
    //   423: invokevirtual ZJ : ()Lburp/Zsol;
    //   426: aload #51
    //   428: invokevirtual Zr : ()Lburp/Zeoj;
    //   431: aload #40
    //   433: invokespecial <init> : (Lburp/Zgb6;Lburp/Zg9z;Lburp/Zmjx;Lburp/Zm6x;Lburp/Ztqd;Lburp/Zsol;Lburp/Zeoj;Lburp/Zx_w;)V
    //   436: astore #52
    //   438: new burp/Ztqj
    //   441: dup
    //   442: aload #52
    //   444: aload #44
    //   446: aload #45
    //   448: invokespecial <init> : (Lburp/Zgtg;Lburp/Zg98;Lburp/Zk97;)V
    //   451: astore #53
    //   453: aload_0
    //   454: getfield ZV : Lburp/Zbws;
    //   457: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   460: checkcast burp/Zmo5
    //   463: astore #54
    //   465: aload #54
    //   467: aload #53
    //   469: invokevirtual Zh : (Lburp/Zx8i;)V
    //   472: new burp/Zm2j
    //   475: dup
    //   476: aload_0
    //   477: getfield ZV : Lburp/Zbws;
    //   480: invokespecial <init> : (Lburp/Zbws;)V
    //   483: astore #55
    //   485: aload_0
    //   486: aload #52
    //   488: aload #55
    //   490: invokevirtual Zm : (Lburp/Zgtg;Lburp/Zm2j;)V
    //   493: aload #31
    //   495: getstatic burp/Zrrh.PROXY_HTTP_HISTORY_CUSTOM_COLUMN_VIEWED : Lburp/Zrrh;
    //   498: if_acmpne -> 592
    //   501: new burp/Zbgf
    //   504: dup
    //   505: aload #55
    //   507: <illegal opcode> run : (Lburp/Zm2j;)Ljava/lang/Runnable;
    //   512: aload_0
    //   513: aload #52
    //   515: <illegal opcode> run : (Lburp/Ztua;Lburp/Zgtg;)Ljava/lang/Runnable;
    //   520: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   523: astore #56
    //   525: new burp/Zzg
    //   528: dup
    //   529: getstatic burp/Zxdz.PROXY_HISTORY_CUSTOM_COLUMN : Lburp/Zxdz;
    //   532: aload #55
    //   534: aload #46
    //   536: aload #56
    //   538: invokespecial <init> : (Lburp/Zxdz;Ljavax/swing/JComponent;Lburp/Zb_j;Lburp/Zbg8;)V
    //   541: getstatic burp/Zla4.EAST : Lburp/Zla4;
    //   544: invokevirtual Zm : (Lburp/Zla4;)Lburp/Zzg;
    //   547: getstatic burp/Zrf0.NORTH : Lburp/Zrf0;
    //   550: invokevirtual ZH : (Lburp/Zrf0;)Lburp/Zzg;
    //   553: invokevirtual ZG : ()Lburp/Ze8a;
    //   556: astore #57
    //   558: aload #55
    //   560: new burp/Zede
    //   563: dup
    //   564: aload_0
    //   565: aload #57
    //   567: invokespecial <init> : (Lburp/Ztua;Lburp/Ze8a;)V
    //   570: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   573: aload #49
    //   575: new burp/Zkua
    //   578: dup
    //   579: aload_0
    //   580: aload #57
    //   582: aload #49
    //   584: invokespecial <init> : (Lburp/Ztua;Lburp/Ze8a;Lburp/Zmjx;)V
    //   587: invokeinterface ZP : (Lburp/Zqq;)V
    //   592: new burp/Zmd7
    //   595: dup
    //   596: aload_0
    //   597: invokespecial <init> : (Lburp/Ztua;)V
    //   600: astore #56
    //   602: aload_0
    //   603: aload #14
    //   605: aload_1
    //   606: aload_2
    //   607: aload #56
    //   609: aload #11
    //   611: aload #55
    //   613: invokeinterface ZT : (Lburp/Zsii;Lburp/Zzit;Lburp/Zg0a;Lburp/Ztwv;Lburp/Zm2j;)Lburp/Zspx;
    //   618: putfield Zq : Lburp/Zspx;
    //   621: aload #8
    //   623: aload_0
    //   624: getfield Zq : Lburp/Zspx;
    //   627: invokeinterface ZH : (Lburp/Zt5e;)V
    //   632: aload_0
    //   633: new burp/Zguu
    //   636: dup
    //   637: aload #4
    //   639: aload #20
    //   641: aload #24
    //   643: aload #25
    //   645: aload #33
    //   647: invokespecial <init> : (Lburp/Zerg;Lburp/Zlgx;Lburp/Zmla;Lburp/Zl6k;Lburp/Zm6x;)V
    //   650: putfield Zy : Lburp/Zguu;
    //   653: aload #21
    //   655: aload_0
    //   656: getfield Zy : Lburp/Zguu;
    //   659: invokeinterface ZW : (Lburp/Zktl;)V
    //   664: aload #56
    //   666: aload_0
    //   667: getfield Zy : Lburp/Zguu;
    //   670: invokevirtual ZS : (Lburp/Zg0a;)V
    //   673: aload #56
    //   675: aload_0
    //   676: getfield Zj : Lburp/Zmi8;
    //   679: invokevirtual ZS : (Lburp/Zg0a;)V
    //   682: aload #32
    //   684: aload_0
    //   685: getfield Zq : Lburp/Zspx;
    //   688: invokeinterface Zm : (Lburp/Zzkg;)V
    //   693: aload #32
    //   695: aload_0
    //   696: getfield Zy : Lburp/Zguu;
    //   699: invokeinterface Zm : (Lburp/Zzkg;)V
    //   704: new burp/Zbqc
    //   707: dup
    //   708: new java/awt/BorderLayout
    //   711: dup
    //   712: invokespecial <init> : ()V
    //   715: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   718: astore #57
    //   720: aload #57
    //   722: aload #20
    //   724: sipush #32386
    //   727: sipush #3858
    //   730: invokestatic a : (II)Ljava/lang/String;
    //   733: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   736: aload #57
    //   738: aload_0
    //   739: getfield Zq : Lburp/Zspx;
    //   742: invokevirtual ZR : ()Ljavax/swing/JComponent;
    //   745: sipush #32391
    //   748: sipush #29597
    //   751: invokestatic a : (II)Ljava/lang/String;
    //   754: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   757: new burp/Zmyz
    //   760: dup
    //   761: iconst_0
    //   762: invokespecial <init> : (I)V
    //   765: astore #58
    //   767: new burp/Zbup
    //   770: dup
    //   771: invokespecial <init> : ()V
    //   774: astore #59
    //   776: aload #59
    //   778: aload #39
    //   780: invokevirtual setName : (Ljava/lang/String;)V
    //   783: aload #59
    //   785: aload_0
    //   786: getfield ZV : Lburp/Zbws;
    //   789: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   792: aload #58
    //   794: aload #59
    //   796: invokevirtual setTopComponent : (Ljava/awt/Component;)V
    //   799: aload #58
    //   801: aload_0
    //   802: getfield Zm : Lburp/Zecu;
    //   805: invokeinterface Zxw : ()Ljava/awt/Component;
    //   810: invokevirtual setBottomComponent : (Ljava/awt/Component;)V
    //   813: aload #58
    //   815: bipush #35
    //   817: invokevirtual Za : (I)V
    //   820: new burp/Zbqc
    //   823: dup
    //   824: new java/awt/BorderLayout
    //   827: dup
    //   828: invokespecial <init> : ()V
    //   831: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   834: astore #60
    //   836: aload #60
    //   838: aload #37
    //   840: invokevirtual setName : (Ljava/lang/String;)V
    //   843: aload #60
    //   845: aload #57
    //   847: sipush #32388
    //   850: sipush #-6085
    //   853: invokestatic a : (II)Ljava/lang/String;
    //   856: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   859: aload #60
    //   861: aload #58
    //   863: sipush #32385
    //   866: sipush #-29969
    //   869: invokestatic a : (II)Ljava/lang/String;
    //   872: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   875: aload_0
    //   876: new burp/Zbc9
    //   879: dup
    //   880: iconst_1
    //   881: anewarray java/awt/Component
    //   884: dup
    //   885: iconst_0
    //   886: aload #60
    //   888: aastore
    //   889: invokespecial <init> : ([Ljava/awt/Component;)V
    //   892: putfield ZQ : Lburp/Zbc9;
    //   895: aload #27
    //   897: aload_0
    //   898: getfield Zj : Lburp/Zmi8;
    //   901: dup
    //   902: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   905: pop
    //   906: <illegal opcode> accept : (Lburp/Zmi8;)Ljava/util/function/Consumer;
    //   911: invokeinterface Zb : (Ljava/util/function/Consumer;)Lburp/Zmt5;
    //   916: astore #61
    //   918: aload #27
    //   920: aload_0
    //   921: getfield Zj : Lburp/Zmi8;
    //   924: dup
    //   925: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   928: pop
    //   929: <illegal opcode> accept : (Lburp/Zmi8;)Ljava/util/function/Consumer;
    //   934: invokeinterface ZI : (Ljava/util/function/Consumer;)Lburp/Zmt5;
    //   939: astore #62
    //   941: new burp/Zbiq
    //   944: dup
    //   945: aload_0
    //   946: getfield ZQ : Lburp/Zbc9;
    //   949: aload #33
    //   951: iconst_2
    //   952: anewarray burp/Zmt5
    //   955: dup
    //   956: iconst_0
    //   957: aload #61
    //   959: aastore
    //   960: dup
    //   961: iconst_1
    //   962: aload #62
    //   964: aastore
    //   965: invokespecial <init> : (Ljava/awt/Component;Lburp/Zm6x;[Lburp/Zmt5;)V
    //   968: pop
    //   969: iload #23
    //   971: ifeq -> 1072
    //   974: aload #35
    //   976: aload_0
    //   977: aload #36
    //   979: <illegal opcode> get : (Lburp/Ztua;Lburp/Zru;)Ljava/util/function/Supplier;
    //   984: invokevirtual Zc : (Ljava/util/function/Supplier;)V
    //   987: aload #33
    //   989: ldc burp/Ztjx
    //   991: getstatic burp/Zehw.SWING : Lburp/Zehw;
    //   994: aload_0
    //   995: aload #36
    //   997: <illegal opcode> Zy : (Lburp/Ztua;Lburp/Zru;)Lburp/Zxjl;
    //   1002: invokevirtual ZO : (Ljava/lang/Class;Lburp/Zehw;Lburp/Zxjl;)Lburp/Zmt5;
    //   1005: pop
    //   1006: aload #14
    //   1008: aload #4
    //   1010: aload #5
    //   1012: invokeinterface Zm : (Lburp/Zerg;Lburp/Zx8n;)Lburp/Zbqc;
    //   1017: astore #63
    //   1019: aload_0
    //   1020: getfield ZQ : Lburp/Zbc9;
    //   1023: aload #63
    //   1025: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1028: pop
    //   1029: aload #12
    //   1031: aload_0
    //   1032: aload #12
    //   1034: aload #63
    //   1036: aload #60
    //   1038: <illegal opcode> onChanged : (Lburp/Ztua;Lburp/Zg01;Lburp/Zbqc;Lburp/Zbqc;)Ljavafx/collections/ListChangeListener;
    //   1043: invokevirtual addListener : (Ljavafx/collections/ListChangeListener;)V
    //   1046: aload #12
    //   1048: invokevirtual isEmpty : ()Z
    //   1051: ifeq -> 1059
    //   1054: aload #63
    //   1056: goto -> 1061
    //   1059: aload #60
    //   1061: astore #64
    //   1063: aload_0
    //   1064: getfield ZQ : Lburp/Zbc9;
    //   1067: aload #64
    //   1069: invokevirtual ZP : (Ljava/awt/Component;)V
    //   1072: iload #47
    //   1074: ifeq -> 1084
    //   1077: iconst_5
    //   1078: anewarray burp/Zbqc
    //   1081: invokestatic Zr : ([Lburp/Zbqc;)V
    //   1084: return
  }
  
  private void Zm(Zgtg<T> paramZgtg, Zm2j paramZm2j) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #32390
    //   7: sipush #26169
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
    //   36: <illegal opcode> actionPerformed : (Lburp/Ztua;Lburp/Zgtg;)Ljava/awt/event/ActionListener;
    //   41: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   44: aload_2
    //   45: aload_3
    //   46: invokevirtual ZY : (Lburp/Zepe;)V
    //   49: return
  }
  
  private void Zg(Zgtg<T> paramZgtg) {
    Window window = SwingUtilities.getWindowAncestor(this.Zq.ZR());
    Zrh7 zrh7 = paramZgtg.Zw(window, this.Za, this.ZT);
    zrh7.Zq(window);
    zrh7.setVisible(true);
  }
  
  public Zkuh<T> Zu() {
    return this.Zj;
  }
  
  public Component ZW() {
    return this.ZQ;
  }
  
  public List<T> Zy() {
    ArrayList<Zmw9> arrayList = new ArrayList();
    int[] arrayOfInt1 = this.ZV.getSelectedRows();
    int[] arrayOfInt2 = arrayOfInt1;
    int i = arrayOfInt2.length;
    byte b = 0;
    boolean bool = ZX();
    while (b < i) {
      int j = arrayOfInt2[b];
      if (j >= 0 && j < this.Zj.getRowCount()) {
        j = this.ZV.convertRowIndexToModel(j);
        if (j != -1)
          arrayList.add((Zmw9)this.Zj.ZW(j)); 
      } 
      b++;
      if (bool)
        break; 
    } 
    return (List)arrayList;
  }
  
  public Zzp8<T> ZJ() {
    return this.ZR.ZR(this.Zy.ZB().ZJ(), this.Zy.Zu().Zu());
  }
  
  public void Zv() {
    this.Zq.Zt2();
    Zkjf.ZO(this::lambda$configChanged$10);
  }
  
  private List<T> Zv(Point paramPoint) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return ZN(this.ZV.ZS(paramPoint));
  }
  
  private List<T> ZN(int[] paramArrayOfint) {
    return (List<T>)Arrays.stream(paramArrayOfint).mapToObj(this::Zy).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private T Zy(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ZV.getRowCount())
      return null; 
    int i = this.ZV.convertRowIndexToModel(paramInt);
    return this.Zj.ZW(i);
  }
  
  public void Zj(T paramT) {
    this.Zm.Zl(paramT);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return Zd(paramInt, Zy(), null);
  }
  
  public boolean Zd(int paramInt, List<T> paramList, Point paramPoint) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore #4
    //   5: invokestatic isEventDispatchThread : ()Z
    //   8: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   11: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   14: iload_1
    //   15: lookupswitch default -> 584, 134400 -> 415, 134656 -> 292, 135680 -> 202, 135936 -> 254, 524544 -> 271, 524545 -> 271, 524546 -> 271, 524547 -> 271, 524548 -> 271, 524549 -> 271, 524550 -> 271, 524551 -> 271, 524552 -> 271, 524553 -> 271, 524800 -> 152, 525056 -> 367
    //   152: getstatic burp/Zze0.PROXY_HISTORY_SHOW_NEW_WINDOW : Lburp/Zze0;
    //   155: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   158: new burp/Zl0y
    //   161: dup
    //   162: new burp/Zzh6
    //   165: dup
    //   166: aload_0
    //   167: getfield Zk : Lburp/Zg01;
    //   170: aload_0
    //   171: aload_0
    //   172: getfield ZP : Lburp/Ztwv;
    //   175: invokespecial <init> : (Lburp/Zr40;Lburp/Zzp8;Lburp/Ztwv;)V
    //   178: aload_0
    //   179: getfield ZF : Lburp/Zrzt;
    //   182: aload_0
    //   183: getfield ZV : Lburp/Zbws;
    //   186: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   189: invokespecial <init> : (Lburp/Zzh6;Lburp/Zrzt;Ljava/awt/Window;)V
    //   192: astore #5
    //   194: aload #5
    //   196: iconst_1
    //   197: invokevirtual setVisible : (Z)V
    //   200: iconst_1
    //   201: ireturn
    //   202: aload_2
    //   203: invokeinterface isEmpty : ()Z
    //   208: ifeq -> 220
    //   211: iconst_0
    //   212: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   215: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   218: iconst_1
    //   219: ireturn
    //   220: aload_2
    //   221: invokestatic identity : ()Ljava/util/function/Function;
    //   224: aload_0
    //   225: getfield ZL : Lburp/Zv8r;
    //   228: aload_0
    //   229: getfield ZV : Lburp/Zbws;
    //   232: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   235: aload_0
    //   236: aload_3
    //   237: <illegal opcode> accept : (Lburp/Ztua;Ljava/awt/Point;)Ljava/util/function/Consumer;
    //   242: aload_0
    //   243: aload_2
    //   244: <illegal opcode> run : (Lburp/Ztua;Ljava/util/List;)Ljava/lang/Runnable;
    //   249: invokestatic ZB : (Ljava/util/List;Ljava/util/function/Function;Lnet/portswigger/Zzr;Ljava/awt/Component;Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   252: iconst_1
    //   253: ireturn
    //   254: aload_0
    //   255: aload_2
    //   256: invokevirtual ZQ : (Ljava/util/List;)V
    //   259: getstatic burp/Zv8r.PROXY_HISTORY_HIGHLIGHT : Lburp/Zv8r;
    //   262: getstatic burp/Zlxk.ZS : I
    //   265: i2l
    //   266: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   269: iconst_1
    //   270: ireturn
    //   271: iload_1
    //   272: invokestatic ZY : (I)V
    //   275: aload_0
    //   276: aload_2
    //   277: invokevirtual ZQ : (Ljava/util/List;)V
    //   280: getstatic burp/Zv8r.PROXY_HISTORY_HIGHLIGHT : Lburp/Zv8r;
    //   283: getstatic burp/Zlxk.ZS : I
    //   286: i2l
    //   287: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   290: iconst_1
    //   291: ireturn
    //   292: aload_0
    //   293: getfield ZV : Lburp/Zbws;
    //   296: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   299: aload_2
    //   300: invokeinterface size : ()I
    //   305: iconst_1
    //   306: if_icmple -> 325
    //   309: sipush #32384
    //   312: sipush #10807
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: goto -> 334
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: sipush #32387
    //   328: sipush #18478
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   337: ifne -> 342
    //   340: iconst_1
    //   341: ireturn
    //   342: getstatic burp/Zrrh.PROXY_HISTORY_DELETE_ITEM : Lburp/Zrrh;
    //   345: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   348: aload_0
    //   349: getfield ZP : Lburp/Ztwv;
    //   352: aload_0
    //   353: aload_2
    //   354: <illegal opcode> run : (Lburp/Ztua;Ljava/util/List;)Ljava/lang/Runnable;
    //   359: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   364: pop
    //   365: iconst_1
    //   366: ireturn
    //   367: aload_0
    //   368: getfield ZV : Lburp/Zbws;
    //   371: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   374: sipush #32389
    //   377: sipush #490
    //   380: invokestatic a : (II)Ljava/lang/String;
    //   383: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   386: ifne -> 391
    //   389: iconst_1
    //   390: ireturn
    //   391: getstatic burp/Zrrh.PROXY_HISTORY_CLEAR_HISTORY : Lburp/Zrrh;
    //   394: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   397: aload_0
    //   398: getfield ZP : Lburp/Ztwv;
    //   401: aload_0
    //   402: <illegal opcode> run : (Lburp/Ztua;)Ljava/lang/Runnable;
    //   407: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   412: pop
    //   413: iconst_1
    //   414: ireturn
    //   415: getstatic burp/Zrrh.PROXY_HISTORY_COPY_URL : Lburp/Zrrh;
    //   418: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   421: aload_2
    //   422: invokeinterface size : ()I
    //   427: iconst_1
    //   428: if_icmpne -> 478
    //   431: aload_0
    //   432: getfield ZB : Lburp/Zz0n;
    //   435: invokeinterface ZD : ()Lburp/Zb0h;
    //   440: aload_0
    //   441: getfield ZN : Lburp/Zze3;
    //   444: aload_2
    //   445: invokeinterface getFirst : ()Ljava/lang/Object;
    //   450: checkcast burp/Zmw9
    //   453: invokeinterface ZR : (Lburp/Zmw9;)Lburp/Zlit;
    //   458: invokeinterface toString : ()Ljava/lang/String;
    //   463: invokevirtual ZR : (Ljava/lang/String;)V
    //   466: iload #4
    //   468: ifeq -> 582
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   477: athrow
    //   478: new java/lang/StringBuilder
    //   481: dup
    //   482: invokespecial <init> : ()V
    //   485: astore #5
    //   487: aload_2
    //   488: invokeinterface iterator : ()Ljava/util/Iterator;
    //   493: astore #6
    //   495: aload #6
    //   497: invokeinterface hasNext : ()Z
    //   502: ifeq -> 565
    //   505: aload #6
    //   507: invokeinterface next : ()Ljava/lang/Object;
    //   512: checkcast burp/Zmw9
    //   515: astore #7
    //   517: aload #7
    //   519: ifnonnull -> 529
    //   522: goto -> 495
    //   525: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   528: athrow
    //   529: aload #5
    //   531: aload_0
    //   532: getfield ZN : Lburp/Zze3;
    //   535: aload #7
    //   537: invokeinterface ZR : (Lburp/Zmw9;)Lburp/Zlit;
    //   542: invokeinterface toString : ()Ljava/lang/String;
    //   547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: pop
    //   551: aload #5
    //   553: getstatic burp/Zlb0.Zp : Ljava/lang/String;
    //   556: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   559: pop
    //   560: iload #4
    //   562: ifeq -> 495
    //   565: aload_0
    //   566: getfield ZB : Lburp/Zz0n;
    //   569: invokeinterface ZD : ()Lburp/Zb0h;
    //   574: aload #5
    //   576: invokevirtual toString : ()Ljava/lang/String;
    //   579: invokevirtual ZR : (Ljava/lang/String;)V
    //   582: iconst_1
    //   583: ireturn
    //   584: aload_0
    //   585: getfield ZA : Lburp/Zkuu;
    //   588: iload_1
    //   589: aload_2
    //   590: aload_0
    //   591: getfield ZV : Lburp/Zbws;
    //   594: invokeinterface ZW : (ILjava/util/List;Ljava/awt/Component;)Z
    //   599: ireturn
    //   600: astore #5
    //   602: aload #5
    //   604: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   607: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   610: iconst_0
    //   611: ireturn
    // Exception table:
    //   from	to	target	type
    //   14	201	600	java/lang/Exception
    //   202	219	600	java/lang/Exception
    //   220	253	600	java/lang/Exception
    //   254	270	600	java/lang/Exception
    //   271	291	600	java/lang/Exception
    //   292	321	321	java/lang/Exception
    //   292	341	600	java/lang/Exception
    //   342	366	600	java/lang/Exception
    //   367	390	600	java/lang/Exception
    //   391	414	600	java/lang/Exception
    //   415	471	474	java/lang/Exception
    //   415	583	600	java/lang/Exception
    //   517	525	525	java/lang/Exception
    //   584	599	600	java/lang/Exception
  }
  
  private void ZU(T paramT, Point paramPoint) {
    if (!Objects.equals(this.Zm.Zxj(), paramT)) {
      int i = this.ZV.rowAtPoint(paramPoint);
      this.ZV.setRowSelectionInterval(i, i);
      this.Zm.Zq(paramT);
    } 
    Objects.requireNonNull(this.Zm);
    SwingUtilities.invokeLater(this.Zm::ZC);
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    boolean bool = Zo();
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    try {
      if (paramInt1 < 0)
        return; 
      Zmw9 zmw9 = (Zmw9)this.Zj.ZW(this.ZV.convertRowIndexToModel(paramInt1));
      try {
        if (zmw9 != null) {
          try {
            if (this.Zj.ZD(this.ZV.convertColumnIndexToModel(paramInt2))) {
              try {
                this.ZZ.accept((T)zmw9);
                this.Zm.Zq((T)zmw9);
                if (!bool) {
                  this.ZZ.accept((T)zmw9);
                  this.Zm.Zm((T)zmw9);
                } 
              } catch (Exception exception) {
                throw a(null);
              } 
              return;
            } 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZZ.accept((T)zmw9);
      this.Zm.Zm((T)zmw9);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    this.ZO.ZK(Zv(paramPoint), paramMouseEvent, paramComponent, paramPoint);
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.ZF.Z_() == this.ZV.convertColumnIndexToModel(paramInt2)) {
      Zm2.Zo(this.ZD);
      Objects.requireNonNull(this.Zm);
      Zbsv.ZH(this.Zm::ZC);
      return;
    } 
    if (paramInt1 < 0)
      return; 
    Zm2.ZC(Zrrh.PROXY_HISTORY_OPEN_ITEM_DISPLAY_PANEL);
    Zmw9 zmw9 = (Zmw9)this.Zj.ZW(this.ZV.convertRowIndexToModel(paramInt1));
    if (zmw9 != null) {
      Zl05<T> zl05 = new Zl05<>(this.Zj, this.ZV, this.ZF.ZR(this.ZB, this.Zu, this.Zf, this.ZX, this.ZI, this.ZP, this.ZM, this.Zv, this.Zi.ZH(), false), this.ZN);
      zl05.ZI((T)zmw9);
      zl05.setVisible(true);
    } 
  }
  
  private void ZQ(List<T> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Ztua;Ljava/util/List;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void Zi(List<T> paramList) {
    Objects.requireNonNull(this.Zy);
    this.ZP.Zx(this.Zy::ZN);
    this.Zb.ZB(this.Zm.Zc(paramList));
  }
  
  private void lambda$applyHighlight$16(List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Ztua;Ljava/util/List;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$applyHighlight$15(List<T> paramList) {
    boolean bool = ZX();
    for (Zmw9 zmw9 : paramList) {
      zmw9.ZB((byte)Zlxk.ZS);
      if (bool)
        break; 
    } 
    Zi(paramList);
  }
  
  private void lambda$handleAction$14() {
    this.Zk.clear();
    this.Zm.Zq(null);
  }
  
  private void lambda$handleAction$13(List<?> paramList) {
    this.Zk.removeAll(paramList);
    Iterator<?> iterator = paramList.iterator();
    boolean bool = ZX();
    while (iterator.hasNext()) {
      Zmw9 zmw9 = (Zmw9)iterator.next();
      if (zmw9 != null && zmw9.ZF(this.Zm.Zxj()))
        this.Zm.Zq(null); 
      if (bool)
        break; 
    } 
  }
  
  private void lambda$handleAction$12(List<T> paramList) {
    Zi(paramList);
  }
  
  private void lambda$handleAction$11(Point paramPoint, Zmw9 paramZmw9) {
    ZU((T)paramZmw9, paramPoint);
  }
  
  private void lambda$configChanged$10() {
    RowSorter.SortKey sortKey = this.Zk.ZB();
    if (sortKey.getColumn() != -1)
      this.ZV.getRowSorter().setSortKeys(List.of(sortKey)); 
  }
  
  private void lambda$addCustomColumnMenuOption$9(Zgtg<T> paramZgtg, ActionEvent paramActionEvent) {
    Zg(paramZgtg);
  }
  
  private void lambda$new$8(Zg01 paramZg01, Zbqc paramZbqc1, Zbqc paramZbqc2, ListChangeListener.Change paramChange) {
    boolean bool = Zo();
    while (paramChange.next()) {
      Zbqc zbqc = paramZg01.isEmpty() ? paramZbqc1 : paramZbqc2;
      this.ZQ.ZP(zbqc);
      if (!bool)
        break; 
    } 
  }
  
  private void lambda$new$7(Zru paramZru, Ztjx paramZtjx) {
    List<Zlz8> list = paramZtjx.ZEU();
    Iterator<Zlz8> iterator = list.iterator();
    boolean bool = ZX();
    while (iterator.hasNext()) {
      Zlz8 zlz8 = iterator.next();
      if (zlz8.ZLx().equals(paramZru.id)) {
        this.ZV.Zj(zlz8);
        if (bool)
          continue; 
        break;
      } 
      continue;
      if (bool)
        break; 
    } 
  }
  
  private Zlz8 lambda$new$6(Zru paramZru) {
    return new Zlz8(paramZru.id, this.ZV.ZHh());
  }
  
  private void lambda$new$5(Zgtg<T> paramZgtg) {
    Zg(paramZgtg);
  }
  
  private static void lambda$new$4(Zm2j paramZm2j) {
    Zz1q.Zc(SwingUtilities.getWindowAncestor(paramZm2j), Zk97.BAMBDAS_PROXY_HTTP_CUSTOM_COLUMN);
  }
  
  private static Zmw9 lambda$new$3(Zmw9 paramZmw9) {
    Zuh.Zb(false, Zqf.ZC);
    return paramZmw9;
  }
  
  private static boolean lambda$new$2(Zr_4 paramZr_4, Zmw9 paramZmw9) {
    return (paramZr_4.Zi() && (!(paramZmw9 instanceof Zxsr) || !paramZr_4.Zl().ZV((Zxsr)paramZmw9)));
  }
  
  private void lambda$new$1(Zrrh paramZrrh, HierarchyEvent paramHierarchyEvent) {
    Zlhx.ZX(paramHierarchyEvent, this.ZV, paramZrrh);
  }
  
  private void lambda$new$0(Zsii paramZsii, Zrrh paramZrrh, HierarchyEvent paramHierarchyEvent) {
    Zr30.ZN(paramHierarchyEvent, this.ZV, paramZsii.Zb(), paramZrrh);
  }
  
  public static void Zx(boolean paramBoolean) {
    ZY = paramBoolean;
  }
  
  public static boolean ZX() {
    return ZY;
  }
  
  public static boolean Zo() {
    boolean bool = ZX();
    return !bool;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '°8àîµ+mÑ&·ÛmKÉeò+9Áoí)JJíí¾K\\t6nc|µMÐ_ÒÎ\\tÅw75kÂhÇFUab2ÃJZã¸ÃýNÐò¾úû\Â ½[ RaÄÐaÈKçÖ\\bÙ\\fþÆiâ\\f~åI%"'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zx : (Z)V
    //   22: bipush #17
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #17
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
    //   72: ldc 'R\­b;u±ã¶tñ>«¬ôzªÿ"_Ä&2GÏûù$>ÙÇ=ÜTjäð³È3G¼·Z_'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #51
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #49
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
    //   133: putstatic burp/Ztua.a : [Ljava/lang/String;
    //   136: bipush #8
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Ztua.b : [Ljava/lang/String;
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
    //   216: bipush #51
    //   218: goto -> 248
    //   221: bipush #73
    //   223: goto -> 248
    //   226: bipush #107
    //   228: goto -> 248
    //   231: bipush #78
    //   233: goto -> 248
    //   236: bipush #68
    //   238: goto -> 248
    //   241: bipush #66
    //   243: goto -> 248
    //   246: bipush #39
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
    int i = (paramInt1 ^ 0x7E86) & 0xFFFF;
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
      char c = 'ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztua.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */