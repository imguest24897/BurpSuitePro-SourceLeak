package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import org.jetbrains.annotations.NotNull;

public class Zqy implements Zzyl {
  private final Zgbj Zv;
  
  private final Zl04 Zb;
  
  private final Zbnt Zu;
  
  private final Zerg ZJ;
  
  private final Zskh ZF;
  
  private final Zgb6 ZP;
  
  private final Zz0n ZR;
  
  private final Zt4u Zx;
  
  private final Ztwv Zg;
  
  private final Zslu Zt;
  
  private final Ztdq ZW;
  
  private final Ze8b Zh;
  
  private final Zbiv Zn;
  
  private final Zgso ZN;
  
  private final Ze47 ZV;
  
  private Zll9[] ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zqy(Zz0n paramZz0n, Zt4u paramZt4u, @NotNull Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zskh paramZskh, Zslu paramZslu, Zl04 paramZl04, Zbnt paramZbnt, Ztwv paramZtwv, Ztdq paramZtdq, Ze8b paramZe8b, Zbiv paramZbiv, Zm6x paramZm6x) {
    this.Zn = paramZbiv;
    Zuh.Zv((paramZgbj != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZskh != null), Zqf.Zv, 2L);
    this.ZR = paramZz0n;
    this.Zx = paramZt4u;
    this.ZJ = paramZerg;
    this.Zv = paramZgbj;
    this.ZP = paramZgb6;
    this.ZF = paramZskh;
    this.Zt = paramZslu;
    this.Zb = paramZl04;
    this.Zu = paramZbnt;
    this.Zg = paramZtwv;
    this.ZW = paramZtdq;
    this.Zh = paramZe8b;
    this.ZN = new Zgso(paramZbnt, paramZt4u.Ze(), paramZerg, Zeew.SUITE, new Zsai(), paramZm6x);
    Objects.requireNonNull(paramZgb6);
    this.ZV = new Ze47(paramZt4u.Ze().ZM(), paramZgb6::ZcC);
  }
  
  public void Zk(Zll9[] paramArrayOfZll9, InputEvent paramInputEvent, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnull -> 14
    //   9: aload_1
    //   10: arraylength
    //   11: ifne -> 15
    //   14: return
    //   15: aload_0
    //   16: aload_1
    //   17: putfield ZX : [Lburp/Zll9;
    //   20: aload_1
    //   21: arraylength
    //   22: iconst_1
    //   23: if_icmple -> 30
    //   26: iconst_1
    //   27: goto -> 31
    //   30: iconst_0
    //   31: istore #6
    //   33: iload #6
    //   35: ifne -> 45
    //   38: aload_1
    //   39: iconst_0
    //   40: aaload
    //   41: ifnonnull -> 45
    //   44: return
    //   45: aload_1
    //   46: iconst_0
    //   47: aaload
    //   48: invokeinterface ZlL : ()Lburp/Zlit;
    //   53: astore #7
    //   55: iload #6
    //   57: ifeq -> 68
    //   60: aload_1
    //   61: arraylength
    //   62: invokestatic ZA : (I)Lburp/Zkj9;
    //   65: goto -> 78
    //   68: aload #7
    //   70: invokeinterface toString : ()Ljava/lang/String;
    //   75: invokestatic ZR : (Ljava/lang/String;)Lburp/Zkj9;
    //   78: astore #8
    //   80: iload #6
    //   82: ifeq -> 114
    //   85: aload #8
    //   87: aload_0
    //   88: ldc 133408
    //   90: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   93: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   96: pop
    //   97: aload #8
    //   99: aload_0
    //   100: ldc 133440
    //   102: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   105: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   108: pop
    //   109: aload #5
    //   111: ifnull -> 183
    //   114: aload_1
    //   115: iconst_0
    //   116: aaload
    //   117: invokeinterface Ze2 : ()Lburp/Zeew;
    //   122: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   125: if_acmpne -> 140
    //   128: aload #8
    //   130: aload_0
    //   131: ldc 133200
    //   133: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   136: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   139: pop
    //   140: aload_0
    //   141: getfield Zt : Lburp/Zslu;
    //   144: aload #7
    //   146: invokeinterface ZG : (Lburp/Zlit;)Z
    //   151: ifeq -> 171
    //   154: aload #8
    //   156: aload_0
    //   157: ldc 133440
    //   159: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   162: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   165: pop
    //   166: aload #5
    //   168: ifnull -> 183
    //   171: aload #8
    //   173: aload_0
    //   174: ldc 133408
    //   176: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   179: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   182: pop
    //   183: aload #8
    //   185: new javax/swing/JSeparator
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   195: pop
    //   196: new burp/Zsz0
    //   199: dup
    //   200: aload_0
    //   201: invokespecial <init> : (Lburp/Zqy;)V
    //   204: astore #9
    //   206: aload_0
    //   207: getfield Zn : Lburp/Zbiv;
    //   210: aload #8
    //   212: aload #9
    //   214: dup
    //   215: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   218: pop
    //   219: <illegal opcode> accept : (Lburp/Zsz0;)Ljava/util/function/Consumer;
    //   224: aload_0
    //   225: invokevirtual ZA : (Lburp/Zkj9;Ljava/util/function/Consumer;Lburp/Zzyl;)V
    //   228: aload #8
    //   230: new javax/swing/JSeparator
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   240: pop
    //   241: iload #6
    //   243: ifne -> 556
    //   246: aload_0
    //   247: getfield ZJ : Lburp/Zerg;
    //   250: invokevirtual Zg : ()Lburp/Zr00;
    //   253: ifnull -> 268
    //   256: aload #8
    //   258: aload_0
    //   259: ldc 131584
    //   261: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   264: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   267: pop
    //   268: aload_0
    //   269: getfield ZJ : Lburp/Zerg;
    //   272: invokevirtual Zm : ()Lburp/Zx_a;
    //   275: ifnull -> 290
    //   278: aload #8
    //   280: aload_0
    //   281: ldc 131328
    //   283: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   286: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   289: pop
    //   290: aload_0
    //   291: getfield ZJ : Lburp/Zerg;
    //   294: invokevirtual ZK : ()Lburp/Zbui;
    //   297: ifnull -> 312
    //   300: aload #8
    //   302: aload_0
    //   303: ldc 133120
    //   305: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   308: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   311: pop
    //   312: aload_0
    //   313: getfield ZJ : Lburp/Zerg;
    //   316: invokevirtual Ze : ()Lburp/Zeu0;
    //   319: ifnull -> 334
    //   322: aload #8
    //   324: aload_0
    //   325: ldc 132992
    //   327: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   330: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   333: pop
    //   334: aload_0
    //   335: getfield ZJ : Lburp/Zerg;
    //   338: invokevirtual ZM : ()Lburp/Zgvn;
    //   341: ifnull -> 371
    //   344: aload_0
    //   345: getfield ZJ : Lburp/Zerg;
    //   348: invokevirtual ZM : ()Lburp/Zgvn;
    //   351: invokeinterface ZR : ()Z
    //   356: ifeq -> 371
    //   359: aload #8
    //   361: aload_0
    //   362: ldc 133008
    //   364: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   367: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   370: pop
    //   371: aload_0
    //   372: getfield ZJ : Lburp/Zerg;
    //   375: invokevirtual ZH : ()Lburp/Zg_j;
    //   378: ifnull -> 460
    //   381: aload_1
    //   382: iconst_0
    //   383: aaload
    //   384: invokeinterface ZoO : ()Lburp/Zstu;
    //   389: ifnonnull -> 418
    //   392: aload #8
    //   394: aload_0
    //   395: ldc 132672
    //   397: sipush #-12757
    //   400: sipush #-16515
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   409: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   412: pop
    //   413: aload #5
    //   415: ifnull -> 460
    //   418: aload #8
    //   420: aload_0
    //   421: ldc 132672
    //   423: sipush #-12764
    //   426: sipush #-5287
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   435: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   438: pop
    //   439: aload #8
    //   441: aload_0
    //   442: ldc 132736
    //   444: sipush #-12753
    //   447: sipush #21204
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   456: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   459: pop
    //   460: aload_1
    //   461: iconst_0
    //   462: aaload
    //   463: invokeinterface ZoO : ()Lburp/Zstu;
    //   468: ifnull -> 483
    //   471: aload #8
    //   473: aload_0
    //   474: ldc 134912
    //   476: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   479: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   482: pop
    //   483: new burp/Zztv
    //   486: dup
    //   487: sipush #-12759
    //   490: sipush #-10773
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: invokespecial <init> : (Ljava/lang/String;)V
    //   499: astore #10
    //   501: aload #10
    //   503: aload_0
    //   504: ldc 135168
    //   506: sipush #-12754
    //   509: sipush #2568
    //   512: invokestatic a : (II)Ljava/lang/String;
    //   515: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   518: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   521: pop
    //   522: aload #10
    //   524: aload_0
    //   525: ldc 135424
    //   527: sipush #-12758
    //   530: sipush #-15828
    //   533: invokestatic a : (II)Ljava/lang/String;
    //   536: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   539: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   542: pop
    //   543: aload #8
    //   545: aload #10
    //   547: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   550: pop
    //   551: aload #5
    //   553: ifnull -> 598
    //   556: aload #8
    //   558: aload_0
    //   559: ldc 132672
    //   561: sipush #-12760
    //   564: sipush #-10731
    //   567: invokestatic a : (II)Ljava/lang/String;
    //   570: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   573: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   576: pop
    //   577: aload #8
    //   579: aload_0
    //   580: ldc 132736
    //   582: sipush #-12765
    //   585: sipush #26301
    //   588: invokestatic a : (II)Ljava/lang/String;
    //   591: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   594: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   597: pop
    //   598: aload_0
    //   599: getfield ZJ : Lburp/Zerg;
    //   602: invokevirtual ZM : ()Lburp/Zgvn;
    //   605: invokeinterface ZY : ()Ljava/util/List;
    //   610: astore #10
    //   612: aload #10
    //   614: ifnull -> 676
    //   617: aload_0
    //   618: getfield ZN : Lburp/Zgso;
    //   621: getstatic burp/Zrpb.CONTEXT_SEARCH_RESULTS : Lburp/Zrpb;
    //   624: aload_2
    //   625: aconst_null
    //   626: aload_1
    //   627: invokevirtual ZU : (Lburp/Zrpb;Ljava/awt/event/InputEvent;[I[Lburp/Zmgv;)Ljava/util/List;
    //   630: astore #11
    //   632: aload #11
    //   634: invokeinterface iterator : ()Ljava/util/Iterator;
    //   639: astore #12
    //   641: aload #12
    //   643: invokeinterface hasNext : ()Z
    //   648: ifeq -> 676
    //   651: aload #12
    //   653: invokeinterface next : ()Ljava/lang/Object;
    //   658: checkcast java/awt/Component
    //   661: astore #13
    //   663: aload #8
    //   665: aload #13
    //   667: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   670: pop
    //   671: aload #5
    //   673: ifnull -> 641
    //   676: iload #6
    //   678: ifne -> 772
    //   681: aload #8
    //   683: new javax/swing/JSeparator
    //   686: dup
    //   687: invokespecial <init> : ()V
    //   690: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   693: pop
    //   694: new burp/Zztv
    //   697: dup
    //   698: sipush #-12755
    //   701: sipush #-30016
    //   704: invokestatic a : (II)Ljava/lang/String;
    //   707: invokespecial <init> : (Ljava/lang/String;)V
    //   710: astore #11
    //   712: aload #8
    //   714: aload #11
    //   716: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   719: pop
    //   720: aload #11
    //   722: aload_0
    //   723: ldc 133376
    //   725: iconst_1
    //   726: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   729: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   732: pop
    //   733: aload #11
    //   735: aload_0
    //   736: ldc 133632
    //   738: iconst_1
    //   739: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   742: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   745: pop
    //   746: aload #11
    //   748: aload_0
    //   749: ldc 133888
    //   751: iconst_1
    //   752: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   755: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   758: pop
    //   759: aload #11
    //   761: aload_0
    //   762: ldc 134144
    //   764: iconst_1
    //   765: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   768: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   771: pop
    //   772: aload #8
    //   774: new javax/swing/JSeparator
    //   777: dup
    //   778: invokespecial <init> : ()V
    //   781: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   784: pop
    //   785: iload #6
    //   787: ifeq -> 837
    //   790: aload #8
    //   792: aload_0
    //   793: ldc 134400
    //   795: sipush #-12767
    //   798: sipush #26195
    //   801: invokestatic a : (II)Ljava/lang/String;
    //   804: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   807: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   810: pop
    //   811: aload #8
    //   813: aload_0
    //   814: ldc 134432
    //   816: sipush #-12756
    //   819: sipush #-10162
    //   822: invokestatic a : (II)Ljava/lang/String;
    //   825: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   828: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   831: pop
    //   832: aload #5
    //   834: ifnull -> 884
    //   837: aload #8
    //   839: aload_0
    //   840: ldc 134400
    //   842: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   845: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   848: pop
    //   849: aload #8
    //   851: aload_0
    //   852: ldc 134416
    //   854: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   857: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   860: pop
    //   861: aload_1
    //   862: iconst_0
    //   863: aaload
    //   864: invokeinterface ZoO : ()Lburp/Zstu;
    //   869: ifnull -> 884
    //   872: aload #8
    //   874: aload_0
    //   875: ldc 134432
    //   877: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   880: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   883: pop
    //   884: iload #6
    //   886: ifeq -> 915
    //   889: aload #8
    //   891: aload_0
    //   892: ldc 134784
    //   894: sipush #-12768
    //   897: sipush #31396
    //   900: invokestatic a : (II)Ljava/lang/String;
    //   903: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   906: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   909: pop
    //   910: aload #5
    //   912: ifnull -> 936
    //   915: aload #8
    //   917: aload_0
    //   918: ldc 134784
    //   920: sipush #-12763
    //   923: sipush #28639
    //   926: invokestatic a : (II)Ljava/lang/String;
    //   929: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   932: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   935: pop
    //   936: aload #8
    //   938: aload_3
    //   939: aload #4
    //   941: getfield x : I
    //   944: aload #4
    //   946: getfield y : I
    //   949: invokevirtual show : (Ljava/awt/Component;II)V
    //   952: return
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return ZL(paramInt, this.ZX);
  }
  
  public boolean ZL(int paramInt, Zll9[] paramArrayOfZll9) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: arraylength
    //   6: ifne -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_2
    //   12: iconst_0
    //   13: aaload
    //   14: astore #4
    //   16: iload_1
    //   17: lookupswitch default -> 1029, 131328 -> 480, 131584 -> 472, 132608 -> 521, 132672 -> 529, 132736 -> 536, 132992 -> 496, 133008 -> 513, 133120 -> 488, 133200 -> 543, 133376 -> 883, 133408 -> 228, 133440 -> 228, 133632 -> 926, 133888 -> 904, 134144 -> 948, 134400 -> 600, 134416 -> 746, 134432 -> 864, 134784 -> 767, 134912 -> 574, 135168 -> 582, 135424 -> 591, 136448 -> 411, 136704 -> 428, 136960 -> 450
    //   228: aload_2
    //   229: arraylength
    //   230: anewarray burp/Zlit
    //   233: astore #5
    //   235: iconst_0
    //   236: istore #6
    //   238: iload #6
    //   240: aload_2
    //   241: arraylength
    //   242: if_icmpge -> 315
    //   245: aload_2
    //   246: iload #6
    //   248: aaload
    //   249: ifnonnull -> 259
    //   252: goto -> 308
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload_2
    //   260: iload #6
    //   262: aaload
    //   263: invokeinterface ZlL : ()Lburp/Zlit;
    //   268: invokeinterface Zd4 : ()[B
    //   273: astore #7
    //   275: aload #7
    //   277: arraylength
    //   278: iconst_1
    //   279: if_icmpne -> 285
    //   282: aconst_null
    //   283: astore #7
    //   285: aload #5
    //   287: iload #6
    //   289: new burp/Zax
    //   292: dup
    //   293: aload_2
    //   294: iload #6
    //   296: aaload
    //   297: invokeinterface Zod : ()Lburp/Zmzk;
    //   302: aload #7
    //   304: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   307: aastore
    //   308: iinc #6, 1
    //   311: aload_3
    //   312: ifnull -> 238
    //   315: iload_1
    //   316: lookupswitch default -> 409, 133408 -> 344, 133440 -> 391
    //   344: aload_0
    //   345: getfield Zh : Lburp/Ze8b;
    //   348: aload_0
    //   349: getfield Zx : Lburp/Zt4u;
    //   352: invokevirtual ZA : ()Lburp/Zl04;
    //   355: aload_0
    //   356: getfield Zt : Lburp/Zslu;
    //   359: invokeinterface ZAy : ()I
    //   364: invokeinterface ZV : (Ljava/awt/Window;I)V
    //   369: aload_0
    //   370: getfield Zt : Lburp/Zslu;
    //   373: aload #5
    //   375: invokeinterface Zl : ([Lburp/Zlit;)V
    //   380: aload_3
    //   381: ifnull -> 409
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: aload_0
    //   392: getfield Zt : Lburp/Zslu;
    //   395: aload #5
    //   397: invokeinterface Zi : ([Lburp/Zlit;)V
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: iconst_1
    //   410: ireturn
    //   411: aload_0
    //   412: getfield Zn : Lburp/Zbiv;
    //   415: aload_0
    //   416: getfield Zb : Lburp/Zl04;
    //   419: aload_2
    //   420: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   423: invokevirtual ZH : (Ljava/awt/Component;Ljava/util/List;)V
    //   426: iconst_1
    //   427: ireturn
    //   428: getstatic burp/Zze0.SUITE_SEARCH_RESULTS_DO_PASSIVE_SCAN : Lburp/Zze0;
    //   431: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   434: aload_0
    //   435: getfield Zn : Lburp/Zbiv;
    //   438: invokevirtual Zv : ()Lburp/Zz7i;
    //   441: aload_2
    //   442: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   445: invokevirtual Zg : (Ljava/util/List;)V
    //   448: iconst_1
    //   449: ireturn
    //   450: getstatic burp/Zze0.SUITE_SEARCH_RESULTS_DO_PASSIVE_SCAN : Lburp/Zze0;
    //   453: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   456: aload_0
    //   457: getfield Zn : Lburp/Zbiv;
    //   460: invokevirtual Zv : ()Lburp/Zz7i;
    //   463: aload_2
    //   464: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   467: invokevirtual ZO : (Ljava/util/List;)V
    //   470: iconst_1
    //   471: ireturn
    //   472: aload_0
    //   473: aload #4
    //   475: invokevirtual ZO : (Lburp/Zll9;)V
    //   478: iconst_1
    //   479: ireturn
    //   480: aload_0
    //   481: aload #4
    //   483: invokevirtual Z_ : (Lburp/Zll9;)V
    //   486: iconst_1
    //   487: ireturn
    //   488: aload_0
    //   489: aload #4
    //   491: invokevirtual Zt : (Lburp/Zll9;)V
    //   494: iconst_1
    //   495: ireturn
    //   496: getstatic burp/Zzu1.SEARCH : Lburp/Zzu1;
    //   499: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   502: invokestatic Zj : (Lburp/Zzvh;Lburp/Zeew;)V
    //   505: aload_0
    //   506: aload #4
    //   508: invokevirtual Zj : (Lburp/Zll9;)V
    //   511: iconst_1
    //   512: ireturn
    //   513: aload_0
    //   514: aload #4
    //   516: invokevirtual ZN : (Lburp/Zll9;)V
    //   519: iconst_1
    //   520: ireturn
    //   521: aload_0
    //   522: aload #4
    //   524: invokevirtual Zv : (Lburp/Zll9;)V
    //   527: iconst_1
    //   528: ireturn
    //   529: aload_0
    //   530: aload_2
    //   531: invokevirtual Ze : ([Lburp/Zll9;)V
    //   534: iconst_1
    //   535: ireturn
    //   536: aload_0
    //   537: aload_2
    //   538: invokevirtual ZO : ([Lburp/Zll9;)V
    //   541: iconst_1
    //   542: ireturn
    //   543: aload #4
    //   545: checkcast burp/Ztzf
    //   548: astore #5
    //   550: aload_0
    //   551: getfield ZJ : Lburp/Zerg;
    //   554: invokevirtual Zm : ()Lburp/Zx_a;
    //   557: aload #5
    //   559: invokevirtual ZAk : ()Lburp/Ztpl;
    //   562: aload #5
    //   564: invokevirtual ZAr : ()Lburp/Zvo1;
    //   567: invokeinterface Zo : (Lburp/Ztpl;Lburp/Zvo1;)V
    //   572: iconst_1
    //   573: ireturn
    //   574: aload_0
    //   575: aload #4
    //   577: invokevirtual Zm : (Lburp/Zll9;)V
    //   580: iconst_1
    //   581: ireturn
    //   582: aload_0
    //   583: aload #4
    //   585: iconst_0
    //   586: invokevirtual ZA : (Lburp/Zll9;Z)V
    //   589: iconst_1
    //   590: ireturn
    //   591: aload_0
    //   592: aload #4
    //   594: iconst_1
    //   595: invokevirtual ZA : (Lburp/Zll9;Z)V
    //   598: iconst_1
    //   599: ireturn
    //   600: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_COPY_URL : Lburp/Zrrh;
    //   603: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   606: aload_2
    //   607: arraylength
    //   608: iconst_1
    //   609: if_icmpne -> 647
    //   612: aload_0
    //   613: getfield ZR : Lburp/Zz0n;
    //   616: invokeinterface ZD : ()Lburp/Zb0h;
    //   621: aload #4
    //   623: invokeinterface ZlL : ()Lburp/Zlit;
    //   628: invokeinterface toString : ()Ljava/lang/String;
    //   633: invokevirtual ZR : (Ljava/lang/String;)V
    //   636: aload_3
    //   637: ifnull -> 744
    //   640: goto -> 647
    //   643: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   646: athrow
    //   647: new java/lang/StringBuilder
    //   650: dup
    //   651: invokespecial <init> : ()V
    //   654: astore #5
    //   656: aload_2
    //   657: astore #6
    //   659: aload #6
    //   661: arraylength
    //   662: istore #7
    //   664: iconst_0
    //   665: istore #8
    //   667: iload #8
    //   669: iload #7
    //   671: if_icmpge -> 727
    //   674: aload #6
    //   676: iload #8
    //   678: aaload
    //   679: astore #9
    //   681: aload #9
    //   683: ifnonnull -> 693
    //   686: goto -> 720
    //   689: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   692: athrow
    //   693: aload #5
    //   695: aload #9
    //   697: invokeinterface ZlL : ()Lburp/Zlit;
    //   702: invokeinterface toString : ()Ljava/lang/String;
    //   707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   710: pop
    //   711: aload #5
    //   713: getstatic burp/Zlb0.Zp : Ljava/lang/String;
    //   716: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   719: pop
    //   720: iinc #8, 1
    //   723: aload_3
    //   724: ifnull -> 667
    //   727: aload_0
    //   728: getfield ZR : Lburp/Zz0n;
    //   731: invokeinterface ZD : ()Lburp/Zb0h;
    //   736: aload #5
    //   738: invokevirtual toString : ()Ljava/lang/String;
    //   741: invokevirtual ZR : (Ljava/lang/String;)V
    //   744: iconst_1
    //   745: ireturn
    //   746: aload_2
    //   747: arraylength
    //   748: iconst_1
    //   749: if_icmpne -> 765
    //   752: aload_0
    //   753: aload #4
    //   755: invokevirtual Zh : (Lburp/Zll9;)V
    //   758: goto -> 765
    //   761: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   764: athrow
    //   765: iconst_1
    //   766: ireturn
    //   767: new burp/Zg89
    //   770: dup
    //   771: invokespecial <init> : ()V
    //   774: astore #5
    //   776: getstatic burp/Zg1m.DATA : Lburp/Zg1m;
    //   779: aload_0
    //   780: getfield Zx : Lburp/Zt4u;
    //   783: aload_0
    //   784: getfield Zb : Lburp/Zl04;
    //   787: iconst_1
    //   788: sipush #-12766
    //   791: sipush #-15351
    //   794: invokestatic a : (II)Ljava/lang/String;
    //   797: aload #5
    //   799: invokestatic ZA : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;)Ljava/io/File;
    //   802: astore #6
    //   804: aload #6
    //   806: ifnull -> 862
    //   809: aload_0
    //   810: getfield Zg : Lburp/Ztwv;
    //   813: new burp/Zzq9
    //   816: dup
    //   817: aload_2
    //   818: aload_0
    //   819: getfield Zb : Lburp/Zl04;
    //   822: aload_0
    //   823: getfield ZF : Lburp/Zskh;
    //   826: aload #6
    //   828: aload #5
    //   830: invokevirtual Zi : ()Z
    //   833: aload_0
    //   834: getfield Zu : Lburp/Zbnt;
    //   837: aload_0
    //   838: getfield ZR : Lburp/Zz0n;
    //   841: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   846: invokespecial <init> : ([Lburp/Zll9;Ljava/awt/Window;Lburp/Zskh;Ljava/io/File;ZLburp/Zbnt;Lnet/portswigger/Zl0;)V
    //   849: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   854: pop
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   861: athrow
    //   862: iconst_1
    //   863: ireturn
    //   864: aload_0
    //   865: getfield Zg : Lburp/Ztwv;
    //   868: aload_0
    //   869: aload_2
    //   870: <illegal opcode> run : (Lburp/Zqy;[Lburp/Zll9;)Ljava/lang/Runnable;
    //   875: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   880: pop
    //   881: iconst_1
    //   882: ireturn
    //   883: aload_0
    //   884: getfield ZW : Lburp/Ztdq;
    //   887: aload_0
    //   888: getfield Zb : Lburp/Zl04;
    //   891: aload #4
    //   893: invokeinterface ZlL : ()Lburp/Zlit;
    //   898: invokevirtual Za : (Ljava/awt/Window;Lburp/Zlit;)Lburp/Zl44;
    //   901: pop
    //   902: iconst_1
    //   903: ireturn
    //   904: aload_0
    //   905: getfield Zv : Lburp/Zgbj;
    //   908: aload_0
    //   909: getfield Zb : Lburp/Zl04;
    //   912: aload #4
    //   914: invokeinterface ZlL : ()Lburp/Zlit;
    //   919: invokeinterface Zt : (Ljava/awt/Window;Lburp/Zlit;)V
    //   924: iconst_1
    //   925: ireturn
    //   926: aload_0
    //   927: getfield Zv : Lburp/Zgbj;
    //   930: aload_0
    //   931: getfield Zb : Lburp/Zl04;
    //   934: aload #4
    //   936: invokeinterface ZlL : ()Lburp/Zlit;
    //   941: invokeinterface Zl : (Ljava/awt/Window;Lburp/Zlit;)V
    //   946: iconst_1
    //   947: ireturn
    //   948: aload #4
    //   950: invokeinterface Zo3 : ()Lburp/Zbr;
    //   955: astore #7
    //   957: aload #7
    //   959: ifnonnull -> 991
    //   962: aload_0
    //   963: getfield ZV : Lburp/Ze47;
    //   966: aload #4
    //   968: invokeinterface Zod : ()Lburp/Zmzk;
    //   973: invokevirtual Zw : (Lburp/Zmzk;)Lburp/Zkyt;
    //   976: astore #8
    //   978: aload_0
    //   979: aload #4
    //   981: invokevirtual Zw : (Lburp/Zll9;)Lburp/Zstu;
    //   984: aload #8
    //   986: invokestatic Zy : (Lburp/Zstu;Lburp/Zkyt;)Lburp/Zbr;
    //   989: astore #7
    //   991: aload_0
    //   992: getfield Zv : Lburp/Zgbj;
    //   995: aload #4
    //   997: invokeinterface Ze2 : ()Lburp/Zeew;
    //   1002: aload_0
    //   1003: getfield Zb : Lburp/Zl04;
    //   1006: aload #4
    //   1008: invokeinterface Zod : ()Lburp/Zmzk;
    //   1013: aload #7
    //   1015: aload #4
    //   1017: invokeinterface Zoe : ()Lburp/Zgsq;
    //   1022: invokeinterface ZC : (Lburp/Zeew;Ljava/awt/Window;Lburp/Zmzk;Lburp/Zbr;Lburp/Zgsq;)V
    //   1027: iconst_1
    //   1028: ireturn
    //   1029: iconst_0
    //   1030: ireturn
    //   1031: astore #4
    //   1033: aload #4
    //   1035: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1038: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1041: iconst_1
    //   1042: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	10	1031	java/lang/Exception
    //   11	410	1031	java/lang/Exception
    //   245	255	255	java/lang/Exception
    //   315	384	387	java/lang/Exception
    //   344	402	405	java/lang/Exception
    //   411	427	1031	java/lang/Exception
    //   428	449	1031	java/lang/Exception
    //   450	471	1031	java/lang/Exception
    //   472	479	1031	java/lang/Exception
    //   480	487	1031	java/lang/Exception
    //   488	495	1031	java/lang/Exception
    //   496	512	1031	java/lang/Exception
    //   513	520	1031	java/lang/Exception
    //   521	528	1031	java/lang/Exception
    //   529	535	1031	java/lang/Exception
    //   536	542	1031	java/lang/Exception
    //   543	573	1031	java/lang/Exception
    //   574	581	1031	java/lang/Exception
    //   582	590	1031	java/lang/Exception
    //   591	599	1031	java/lang/Exception
    //   600	640	643	java/lang/Exception
    //   600	745	1031	java/lang/Exception
    //   681	689	689	java/lang/Exception
    //   746	758	761	java/lang/Exception
    //   746	766	1031	java/lang/Exception
    //   767	863	1031	java/lang/Exception
    //   804	855	858	java/lang/Exception
    //   864	882	1031	java/lang/Exception
    //   883	903	1031	java/lang/Exception
    //   904	925	1031	java/lang/Exception
    //   926	947	1031	java/lang/Exception
    //   948	1028	1031	java/lang/Exception
    //   1029	1030	1031	java/lang/Exception
  }
  
  private void Zh(Zll9 paramZll9) {
    Zstu zstu = Zb(paramZll9);
    Zz1p zz1p = Zghc.ZY(paramZll9.Zod(), zstu, (byte)2, this.Zu);
    String str = Zt5w.ZP(zz1p, zstu, this.Zb, this.ZF);
    if (!str.isEmpty())
      this.ZR.ZD().ZR(str); 
  }
  
  private void ZA(Zll9 paramZll9, boolean paramBoolean) {
    Zstu zstu = Zb(paramZll9);
    if (zstu != null)
      this.ZJ.ZJ().Zj(paramZll9.ZlL(), zstu, paramBoolean, this.Zb); 
  }
  
  private void Zm(Zll9 paramZll9) {
    Zstu zstu = paramZll9.ZoO();
    if (zstu != null)
      this.ZJ.ZJ().Zf(paramZll9.ZlL(), zstu, this.Zb, (byte)0); 
  }
  
  private void ZO(Zll9[] paramArrayOfZll9) {
    ArrayList<Zstu> arrayList = new ArrayList();
    Zll9[] arrayOfZll9 = paramArrayOfZll9;
    int i = arrayOfZll9.length;
    byte b = 0;
    String str = Zl41.ZU();
    while (b < i) {
      Zll9 zll9 = arrayOfZll9[b];
      Zstu zstu = zll9.ZoO();
      if (zstu != null)
        arrayList.add(zstu); 
      b++;
      if (str != null)
        break; 
    } 
    if (!arrayList.isEmpty())
      this.ZJ.ZH().Zk(arrayList); 
  }
  
  private void Ze(Zll9[] paramArrayOfZll9) {
    ArrayList<Zstu> arrayList = new ArrayList();
    Zll9[] arrayOfZll9 = paramArrayOfZll9;
    String str = Zl41.ZU();
    int i = arrayOfZll9.length;
    byte b = 0;
    while (b < i) {
      Zll9 zll9 = arrayOfZll9[b];
      Zstu zstu = ZD(zll9);
      arrayList.add(zstu);
      b++;
      if (str != null)
        break; 
    } 
    this.ZJ.ZH().Zk(arrayList);
  }
  
  private void Zt(Zll9 paramZll9) {
    Zstu zstu1 = ZD(paramZll9);
    Zstu zstu2 = paramZll9.ZoO();
    String str = Zl41.ZU();
    if (zstu2 != null) {
      this.ZJ.ZK().ZP(paramZll9.Zod(), zstu1, zstu2);
      if (str != null) {
        this.ZJ.ZK().ZU(paramZll9.Zod(), zstu1);
        return;
      } 
      return;
    } 
    this.ZJ.ZK().ZU(paramZll9.Zod(), zstu1);
  }
  
  private void Z_(Zll9 paramZll9) {
    String str = Zl41.ZU();
    if (paramZll9.Zo3().Zu()) {
      this.ZJ.Zm().ZQ(paramZll9.Zod(), paramZll9.Zo3(), (String)null, null);
      if (str != null) {
        Zstu zstu1 = ZD(paramZll9);
        this.ZJ.Zm().Ze(paramZll9.Zod(), zstu1, (String)null, null);
        return;
      } 
      return;
    } 
    Zstu zstu = ZD(paramZll9);
    this.ZJ.Zm().Ze(paramZll9.Zod(), zstu, (String)null, null);
  }
  
  private void ZO(Zll9 paramZll9) {
    Zstu zstu1 = ZD(paramZll9);
    Zstu zstu2 = paramZll9.ZoO();
    this.ZJ.Zg().Zp(paramZll9.ZlL().Zdz(), zstu1, null, zstu2);
  }
  
  private void Zv(Zll9 paramZll9) {
    String str = Zl41.ZU();
    Zstu zstu1 = paramZll9.ZoO();
    if (zstu1 != null) {
      this.ZJ.ZH().ZM(zstu1);
      if (str != null) {
        Zstu zstu = ZD(paramZll9);
        this.ZJ.ZH().ZM(zstu);
        return;
      } 
      return;
    } 
    Zstu zstu2 = ZD(paramZll9);
    this.ZJ.ZH().ZM(zstu2);
  }
  
  private void ZN(Zll9 paramZll9) {
    String str = Zl41.ZU();
    Zstu zstu1 = paramZll9.ZoO();
    if (paramZll9.Zo3().Zu()) {
      this.ZJ.ZM().Za(paramZll9.Zod(), paramZll9.Zo3(), zstu1, Zzu1.SEARCH);
      if (str != null) {
        Zstu zstu = ZD(paramZll9);
        this.ZJ.ZM().ZB(paramZll9.Zod(), zstu, zstu1, Zzu1.SEARCH);
        return;
      } 
      return;
    } 
    Zstu zstu2 = ZD(paramZll9);
    this.ZJ.ZM().ZB(paramZll9.Zod(), zstu2, zstu1, Zzu1.SEARCH);
  }
  
  private void Zj(Zll9 paramZll9) {
    String str = Zl41.ZU();
    Zstu zstu1 = paramZll9.ZoO();
    if (paramZll9.Zo3().Zu()) {
      this.ZJ.Ze().ZE(paramZll9.Ze2(), paramZll9.Zod(), paramZll9.Zo3(), zstu1, paramZll9.ZoB(), null);
      if (str != null) {
        Zstu zstu = ZD(paramZll9);
        this.ZJ.Ze().ZN(paramZll9.Ze2(), paramZll9.Zod(), zstu, zstu1, paramZll9.ZoB(), null);
        return;
      } 
      return;
    } 
    Zstu zstu2 = ZD(paramZll9);
    this.ZJ.Ze().ZN(paramZll9.Ze2(), paramZll9.Zod(), zstu2, zstu1, paramZll9.ZoB(), null);
  }
  
  private static Zstu Zb(Zll9 paramZll9) {
    return (paramZll9.Zo3().Zz() || paramZll9.Zo3().ZO().isEmpty()) ? paramZll9.Zos() : paramZll9.Zo3().Zr();
  }
  
  private Zstu ZD(Zll9 paramZll9) {
    Zstu zstu = Zb(paramZll9);
    if (zstu == null)
      zstu = Zw(paramZll9); 
    return zstu;
  }
  
  private Zstu Zw(Zll9 paramZll9) {
    return this.Zx.Ze().Zs().ZO().Zf(paramZll9.ZlL()).Zr();
  }
  
  private void lambda$handleAction$0(Zll9[] paramArrayOfZll9) {
    Zrvp zrvp = new Zrvp(this);
    Ztdi ztdi = this.ZJ.ZA().ZZ();
    TreeSet<String> treeSet = new TreeSet();
    float f1 = 0.0F;
    float f2 = 100.0F / paramArrayOfZll9.length;
    Zll9[] arrayOfZll9 = paramArrayOfZll9;
    int i = arrayOfZll9.length;
    byte b = 0;
    String str = Zl41.ZU();
    while (b < i) {
      Zll9 zll9 = arrayOfZll9[b];
      if (zll9 != null) {
        Zstu zstu = zll9.ZoO();
        if (zstu != null) {
          byte[] arrayOfByte = zstu.ZiD();
          Zs68 zs68 = Zmre.ZK(null, arrayOfByte, Zt0k.HTML_ANALYSIS, this.Zu);
          List<Zsq8> list = Zm46.Zl(zll9.ZlL(), zs68, zstu, arrayOfByte, ztdi, this.Zu, this.ZP.ZU0());
          for (Zsq8 zsq8 : list) {
            treeSet.add(zsq8.ZZ.toString());
            if (str != null)
              break; 
          } 
          if (!zrvp.Zh((int)f1))
            break; 
          f1 += f2;
        } 
      } 
      b++;
      if (str != null)
        break; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (String str1 : treeSet) {
      stringBuilder.append(str1);
      stringBuilder.append(Zlb0.Zp);
      if (str != null)
        break; 
    } 
    this.ZR.ZD().ZR(stringBuilder.toString());
    zrvp.Zx();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Î«\\fæ|lÂTÊê4"D?HWSL?\\nÉÉØÂsÔÆðÇÆHÿMUµ×ØA4T¦=»åyb o0hëõ@tG÷po©!\Ãôºú\¤j¼ëOÞ«)ç}s(£æ\\f¸.\\f·rËã{wÕäëRU"ó:Ç:"±\r`4e1·­v÷ÕÏÒr7hrÉò-íBÂ#Ôh>ã9þÿf¾j\\n±?Mõ®XY)&ùw|²Ýörñö\\tt®ð¼Pð¡\\ryè{yÀëÔõ#'D×=Âb!)ªØýÂ-Ln½Ì!)~!Î¦üôã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #52
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
    //   68: ldc '241Ù|õ\\n½åGÔ=öpyCr¿02\\t®I>@b¤-'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #26
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_5
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zqy.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zqy.b : [Ljava/lang/String;
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
    //   212: bipush #64
    //   214: goto -> 244
    //   217: bipush #80
    //   219: goto -> 244
    //   222: bipush #40
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #81
    //   234: goto -> 244
    //   237: bipush #45
    //   239: goto -> 244
    //   242: bipush #115
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
    int i = (paramInt1 ^ 0xFFFFCE28) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */