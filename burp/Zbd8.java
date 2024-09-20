package burp;

import java.awt.Point;
import java.util.function.Supplier;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import net.portswigger.Zm2;

public class Zbd8 extends Zbqc implements Zkgx {
  private final Zm7i Zy;
  
  private final Zt0b Zt;
  
  private final Zm2l Zn;
  
  private final Zm2l Zj;
  
  private final Zm9t Zz;
  
  private Zm26 ZZ;
  
  private Zren ZP;
  
  private ChangeListener ZY;
  
  private boolean ZC;
  
  private Supplier<Boolean> Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbd8(Zm7i paramZm7i, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   10: putfield Za : Ljava/util/function/Supplier;
    //   13: invokestatic ZM : ()[I
    //   16: aload_0
    //   17: aload_1
    //   18: putfield Zy : Lburp/Zm7i;
    //   21: astore_3
    //   22: aload_0
    //   23: new java/awt/BorderLayout
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   33: aload_0
    //   34: new javax/swing/border/EmptyBorder
    //   37: dup
    //   38: iconst_5
    //   39: iconst_0
    //   40: iconst_0
    //   41: iconst_0
    //   42: invokespecial <init> : (IIII)V
    //   45: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   48: aload_0
    //   49: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   52: invokevirtual Zl : (Lburp/Zlkk;)V
    //   55: aload_0
    //   56: new burp/Zt0b
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: putfield Zt : Lburp/Zt0b;
    //   66: new burp/Zbqc
    //   69: dup
    //   70: new java/awt/GridLayout
    //   73: dup
    //   74: iconst_1
    //   75: iconst_0
    //   76: bipush #10
    //   78: iconst_0
    //   79: invokespecial <init> : (IIII)V
    //   82: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   85: astore #4
    //   87: aload #4
    //   89: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   92: invokevirtual Zl : (Lburp/Zlkk;)V
    //   95: aload #4
    //   97: new javax/swing/border/EmptyBorder
    //   100: dup
    //   101: iconst_0
    //   102: iconst_0
    //   103: iconst_5
    //   104: bipush #10
    //   106: invokespecial <init> : (IIII)V
    //   109: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   112: iload_2
    //   113: ifeq -> 254
    //   116: getstatic burp/Zeuf.EYE_CROSSED_OUT : Lburp/Zeuf;
    //   119: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_FOREGROUND : Lburp/Zlkk;
    //   122: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   125: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   128: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   131: getstatic burp/Zlkk.RADIO_BAR_ACTIVE_FOREGROUND : Lburp/Zlkk;
    //   134: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   137: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : Lburp/Zlkk;
    //   140: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   143: invokevirtual Z_ : ()Lburp/Ze9n;
    //   146: astore #5
    //   148: aload_0
    //   149: new burp/Zm26
    //   152: dup
    //   153: invokespecial <init> : ()V
    //   156: putfield ZZ : Lburp/Zm26;
    //   159: aload_0
    //   160: getfield ZZ : Lburp/Zm26;
    //   163: invokestatic Ze : ()Ljavax/swing/border/Border;
    //   166: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   169: aload_0
    //   170: getfield ZZ : Lburp/Zm26;
    //   173: sipush #14494
    //   176: sipush #13836
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: invokevirtual setName : (Ljava/lang/String;)V
    //   185: aload_0
    //   186: getfield ZZ : Lburp/Zm26;
    //   189: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   192: invokevirtual Zy : (Lburp/Zlkk;)V
    //   195: aload_0
    //   196: getfield ZZ : Lburp/Zm26;
    //   199: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_BACKGROUND : Lburp/Zlkk;
    //   202: invokevirtual Zl : (Lburp/Zlkk;)V
    //   205: aload_0
    //   206: getfield ZZ : Lburp/Zm26;
    //   209: aload #5
    //   211: sipush #14480
    //   214: sipush #26741
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: sipush #14485
    //   223: sipush #14101
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: aload_0
    //   230: aload_1
    //   231: <illegal opcode> run : (Lburp/Zbd8;Lburp/Zm7i;)Ljava/lang/Runnable;
    //   236: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   241: invokevirtual Ze : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   244: aload #4
    //   246: aload_0
    //   247: getfield ZZ : Lburp/Zm26;
    //   250: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   253: pop
    //   254: getstatic burp/Zeuf.LINE_WRAP : Lburp/Zeuf;
    //   257: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_FOREGROUND : Lburp/Zlkk;
    //   260: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   263: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   266: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   269: getstatic burp/Zlkk.RADIO_BAR_ACTIVE_FOREGROUND : Lburp/Zlkk;
    //   272: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   275: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : Lburp/Zlkk;
    //   278: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   281: invokevirtual Z_ : ()Lburp/Ze9n;
    //   284: astore #5
    //   286: getstatic burp/Zeuf.NON_PRINTABLE_CHARACTERS : Lburp/Zeuf;
    //   289: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_FOREGROUND : Lburp/Zlkk;
    //   292: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   295: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   298: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   301: getstatic burp/Zlkk.RADIO_BAR_ACTIVE_FOREGROUND : Lburp/Zlkk;
    //   304: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   307: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : Lburp/Zlkk;
    //   310: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   313: invokevirtual Z_ : ()Lburp/Ze9n;
    //   316: astore #6
    //   318: getstatic burp/Zeuf.MENU : Lburp/Zeuf;
    //   321: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_FOREGROUND : Lburp/Zlkk;
    //   324: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   327: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   330: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   333: getstatic burp/Zlkk.RADIO_BAR_ACTIVE_FOREGROUND : Lburp/Zlkk;
    //   336: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   339: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : Lburp/Zlkk;
    //   342: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   345: invokevirtual Z_ : ()Lburp/Ze9n;
    //   348: astore #7
    //   350: aload_0
    //   351: new burp/Zm2l
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: putfield Zn : Lburp/Zm2l;
    //   361: aload_0
    //   362: getfield Zn : Lburp/Zm2l;
    //   365: invokestatic Ze : ()Ljavax/swing/border/Border;
    //   368: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   371: aload_0
    //   372: getfield Zn : Lburp/Zm2l;
    //   375: sipush #14484
    //   378: sipush #-2473
    //   381: invokestatic a : (II)Ljava/lang/String;
    //   384: invokevirtual setName : (Ljava/lang/String;)V
    //   387: aload_0
    //   388: getfield Zn : Lburp/Zm2l;
    //   391: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   394: invokevirtual Zy : (Lburp/Zlkk;)V
    //   397: aload_0
    //   398: getfield Zn : Lburp/Zm2l;
    //   401: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_BACKGROUND : Lburp/Zlkk;
    //   404: invokevirtual Zl : (Lburp/Zlkk;)V
    //   407: aload_0
    //   408: getfield Zn : Lburp/Zm2l;
    //   411: aload #5
    //   413: sipush #14481
    //   416: sipush #15708
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: sipush #14493
    //   425: sipush #3664
    //   428: invokestatic a : (II)Ljava/lang/String;
    //   431: aload_0
    //   432: aload_1
    //   433: <illegal opcode> run : (Lburp/Zbd8;Lburp/Zm7i;)Ljava/lang/Runnable;
    //   438: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   443: invokevirtual Ze : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   446: aload #4
    //   448: aload_0
    //   449: getfield Zn : Lburp/Zm2l;
    //   452: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   455: pop
    //   456: aload_0
    //   457: new burp/Zm2l
    //   460: dup
    //   461: invokespecial <init> : ()V
    //   464: putfield Zj : Lburp/Zm2l;
    //   467: aload_0
    //   468: getfield Zj : Lburp/Zm2l;
    //   471: invokestatic Ze : ()Ljavax/swing/border/Border;
    //   474: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   477: aload_0
    //   478: getfield Zj : Lburp/Zm2l;
    //   481: sipush #14483
    //   484: sipush #-8723
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: invokevirtual setName : (Ljava/lang/String;)V
    //   493: aload_0
    //   494: getfield Zj : Lburp/Zm2l;
    //   497: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   500: invokevirtual Zy : (Lburp/Zlkk;)V
    //   503: aload_0
    //   504: getfield Zj : Lburp/Zm2l;
    //   507: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_BACKGROUND : Lburp/Zlkk;
    //   510: invokevirtual Zl : (Lburp/Zlkk;)V
    //   513: aload_0
    //   514: getfield Zj : Lburp/Zm2l;
    //   517: aload #6
    //   519: sipush #14482
    //   522: sipush #-5844
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: sipush #14489
    //   531: sipush #-28638
    //   534: invokestatic a : (II)Ljava/lang/String;
    //   537: aload_0
    //   538: aload_1
    //   539: <illegal opcode> run : (Lburp/Zbd8;Lburp/Zm7i;)Ljava/lang/Runnable;
    //   544: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   549: invokevirtual Ze : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   552: aload #4
    //   554: aload_0
    //   555: getfield Zj : Lburp/Zm2l;
    //   558: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   561: pop
    //   562: aload_0
    //   563: new burp/Zm9t
    //   566: dup
    //   567: invokespecial <init> : ()V
    //   570: putfield Zz : Lburp/Zm9t;
    //   573: aload_0
    //   574: getfield Zz : Lburp/Zm9t;
    //   577: invokestatic Ze : ()Ljavax/swing/border/Border;
    //   580: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   583: aload_0
    //   584: getfield Zz : Lburp/Zm9t;
    //   587: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   590: invokevirtual ZO : (Lburp/Zlkk;)V
    //   593: aload_0
    //   594: getfield Zz : Lburp/Zm9t;
    //   597: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_BACKGROUND : Lburp/Zlkk;
    //   600: invokevirtual ZD : (Lburp/Zlkk;)V
    //   603: aload_0
    //   604: getfield Zz : Lburp/Zm9t;
    //   607: sipush #14495
    //   610: sipush #-12325
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: invokevirtual setName : (Ljava/lang/String;)V
    //   619: aload_0
    //   620: getfield Zz : Lburp/Zm9t;
    //   623: aload #7
    //   625: sipush #14486
    //   628: sipush #24603
    //   631: invokestatic a : (II)Ljava/lang/String;
    //   634: aload_0
    //   635: aload_1
    //   636: <illegal opcode> run : (Lburp/Zbd8;Lburp/Zm7i;)Ljava/lang/Runnable;
    //   641: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   644: aload_0
    //   645: getfield Zz : Lburp/Zm9t;
    //   648: iconst_1
    //   649: invokevirtual setFocusable : (Z)V
    //   652: aload #4
    //   654: aload_0
    //   655: getfield Zz : Lburp/Zm9t;
    //   658: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   661: pop
    //   662: new burp/Zbqc
    //   665: dup
    //   666: new java/awt/BorderLayout
    //   669: dup
    //   670: invokespecial <init> : ()V
    //   673: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   676: astore #8
    //   678: aload #8
    //   680: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   683: invokevirtual Zl : (Lburp/Zlkk;)V
    //   686: aload #8
    //   688: aload #4
    //   690: sipush #14488
    //   693: sipush #-23151
    //   696: invokestatic a : (II)Ljava/lang/String;
    //   699: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   702: aload_0
    //   703: getfield Zt : Lburp/Zt0b;
    //   706: aload #8
    //   708: invokevirtual setTrailingComponent : (Ljava/awt/Component;)V
    //   711: aload_0
    //   712: getfield Zt : Lburp/Zt0b;
    //   715: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   718: invokevirtual Zy : (Lburp/Zlkk;)V
    //   721: aload_0
    //   722: getfield Zt : Lburp/Zt0b;
    //   725: sipush #14492
    //   728: sipush #-31857
    //   731: invokestatic a : (II)Ljava/lang/String;
    //   734: invokevirtual setName : (Ljava/lang/String;)V
    //   737: aload_0
    //   738: aload_0
    //   739: getfield Zt : Lburp/Zt0b;
    //   742: sipush #14487
    //   745: sipush #-14834
    //   748: invokestatic a : (II)Ljava/lang/String;
    //   751: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   754: invokestatic Zwu : ()[Lburp/Zbqc;
    //   757: ifnonnull -> 766
    //   760: iconst_1
    //   761: newarray int
    //   763: invokestatic ZC : ([I)V
    //   766: return
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Zm2l;
    //   4: invokevirtual isEnabled : ()Z
    //   7: istore_1
    //   8: aload_0
    //   9: getfield Zj : Lburp/Zm2l;
    //   12: invokevirtual isEnabled : ()Z
    //   15: istore_2
    //   16: aload_0
    //   17: getfield Zz : Lburp/Zm9t;
    //   20: invokevirtual isEnabled : ()Z
    //   23: istore_3
    //   24: aload_0
    //   25: getfield ZZ : Lburp/Zm26;
    //   28: ifnull -> 45
    //   31: aload_0
    //   32: getfield ZZ : Lburp/Zm26;
    //   35: invokevirtual isEnabled : ()Z
    //   38: ifeq -> 45
    //   41: iconst_1
    //   42: goto -> 46
    //   45: iconst_0
    //   46: istore #4
    //   48: aload_0
    //   49: getfield Zn : Lburp/Zm2l;
    //   52: invokevirtual Z_ : ()Z
    //   55: istore #5
    //   57: aload_0
    //   58: getfield Zj : Lburp/Zm2l;
    //   61: invokevirtual Z_ : ()Z
    //   64: istore #6
    //   66: aload_0
    //   67: getfield ZZ : Lburp/Zm26;
    //   70: ifnull -> 87
    //   73: aload_0
    //   74: getfield ZZ : Lburp/Zm26;
    //   77: invokevirtual Z_ : ()Z
    //   80: ifeq -> 87
    //   83: iconst_1
    //   84: goto -> 88
    //   87: iconst_0
    //   88: istore #7
    //   90: aload_0
    //   91: iload_1
    //   92: iload_2
    //   93: iload_3
    //   94: iload #5
    //   96: iload #6
    //   98: iload #4
    //   100: iload #7
    //   102: <illegal opcode> Zg : (Lburp/Zbd8;ZZZZZZZ)Lburp/Ztcw;
    //   107: areturn
  }
  
  public void ZU() {
    if (this.ZZ != null)
      this.ZZ.ZJ(((Boolean)this.Za.get()).booleanValue()); 
    this.Zn.ZJ(this.ZC);
    this.Zj.ZJ(false);
  }
  
  void Zl() {
    this.ZP.Zi().ifPresent(this::lambda$togglePrettify$9);
  }
  
  void ZT() {
    this.Zj.ZW();
  }
  
  void ZH() {
    ZR(false);
  }
  
  void ZR(boolean paramBoolean) {
    if (this.ZZ != null) {
      this.ZZ.ZJ(paramBoolean);
      Zn();
    } 
  }
  
  void Zu(Supplier<Boolean> paramSupplier) {
    this.Za = paramSupplier;
  }
  
  public void ZX() {
    if (this.ZZ != null)
      this.ZZ.ZW(); 
  }
  
  void ZJ(boolean paramBoolean) {
    this.ZZ.Zz(paramBoolean);
    if (!paramBoolean) {
      this.ZZ.ZJ(false);
      this.ZZ.setEnabled(false);
    } 
  }
  
  void ZA() {
    this.Zn.ZW();
  }
  
  void Za(boolean paramBoolean) {
    this.Zn.ZJ(paramBoolean);
  }
  
  void ZX(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  void ZA(Zren paramZren) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZY : Ljavax/swing/event/ChangeListener;
    //   8: ifnull -> 22
    //   11: aload_0
    //   12: getfield Zt : Lburp/Zt0b;
    //   15: aload_0
    //   16: getfield ZY : Ljavax/swing/event/ChangeListener;
    //   19: invokevirtual removeChangeListener : (Ljavax/swing/event/ChangeListener;)V
    //   22: aload_1
    //   23: aload_1
    //   24: invokevirtual ZC : ()Lburp/Zkcm;
    //   27: invokevirtual Zj : (Lburp/Zkcm;)I
    //   30: istore_3
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual Zo : (Lburp/Zren;)V
    //   36: aload_0
    //   37: aload_1
    //   38: putfield ZP : Lburp/Zren;
    //   41: iload_3
    //   42: iconst_m1
    //   43: if_icmpeq -> 57
    //   46: aload_0
    //   47: getfield Zt : Lburp/Zt0b;
    //   50: iload_3
    //   51: invokevirtual isEnabledAt : (I)Z
    //   54: ifne -> 77
    //   57: aload_1
    //   58: aload_1
    //   59: invokevirtual Za : ()Lburp/Zkcm;
    //   62: invokevirtual Zj : (Lburp/Zkcm;)I
    //   65: istore #4
    //   67: aload_0
    //   68: iload #4
    //   70: invokevirtual ZZ : (I)V
    //   73: aload_2
    //   74: ifnull -> 82
    //   77: aload_0
    //   78: iload_3
    //   79: invokevirtual ZZ : (I)V
    //   82: aload_0
    //   83: aload_0
    //   84: <illegal opcode> stateChanged : (Lburp/Zbd8;)Ljavax/swing/event/ChangeListener;
    //   89: putfield ZY : Ljavax/swing/event/ChangeListener;
    //   92: aload_0
    //   93: getfield Zt : Lburp/Zt0b;
    //   96: aload_0
    //   97: getfield ZY : Ljavax/swing/event/ChangeListener;
    //   100: invokevirtual addChangeListener : (Ljavax/swing/event/ChangeListener;)V
    //   103: return
  }
  
  private void Zo(Zren paramZren) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lburp/Zren;
    //   4: ifnull -> 18
    //   7: aload_0
    //   8: getfield Zt : Lburp/Zt0b;
    //   11: invokevirtual ZO : ()I
    //   14: iconst_m1
    //   15: if_icmpne -> 22
    //   18: aconst_null
    //   19: goto -> 36
    //   22: aload_0
    //   23: getfield ZP : Lburp/Zren;
    //   26: aload_0
    //   27: getfield Zt : Lburp/Zt0b;
    //   30: invokevirtual ZO : ()I
    //   33: invokevirtual ZX : (I)Lburp/Zkcm;
    //   36: astore_2
    //   37: aload_0
    //   38: getfield Zt : Lburp/Zt0b;
    //   41: invokevirtual removeAll : ()V
    //   44: aload_0
    //   45: getfield Zt : Lburp/Zt0b;
    //   48: iconst_m1
    //   49: invokevirtual Zg : (I)V
    //   52: iconst_0
    //   53: aload_1
    //   54: invokevirtual Zj : ()I
    //   57: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   60: aload_0
    //   61: aload_1
    //   62: <illegal opcode> accept : (Lburp/Zbd8;Lburp/Zren;)Ljava/util/function/IntConsumer;
    //   67: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   72: aload_0
    //   73: getfield Zt : Lburp/Zt0b;
    //   76: aload_1
    //   77: aload_2
    //   78: invokevirtual Zj : (Lburp/Zkcm;)I
    //   81: invokevirtual Zg : (I)V
    //   84: return
  }
  
  private void ZZ(int paramInt) {
    if (paramInt < 0)
      return; 
    ZK(paramInt, this.ZP.ZX(paramInt));
    this.Zy.ZS(this.Zn.Z_());
  }
  
  private void ZK(int paramInt, Zkcm paramZkcm) {
    Zn(paramInt, paramZkcm);
    this.Zt.setSelectedIndex(paramInt);
    this.Zt.repaint();
  }
  
  private void Zl(int paramInt) {
    if (paramInt < 0)
      return; 
    Zz(paramInt, this.ZP.ZX(paramInt));
  }
  
  private void ZY(Zkcm paramZkcm) {
    Zz(this.ZP.Zj(paramZkcm), paramZkcm);
  }
  
  private void Zz(int paramInt, Zkcm paramZkcm) {
    paramZkcm.ZC();
    Zn(paramInt, paramZkcm);
  }
  
  private void Zn(int paramInt, Zkcm paramZkcm) {
    if (this.ZZ != null)
      this.ZZ.setEnabled(paramZkcm.Zg()); 
    this.Zj.setEnabled(paramZkcm.Zq());
    this.Zn.setEnabled(paramZkcm.Zu());
    this.Zz.setEnabled(paramZkcm.Zw());
    this.Zy.ZP(paramInt);
    Zn();
  }
  
  private void Zn() {
    this.Zy.ZQ((this.ZZ == null || !this.ZZ.Z_()));
  }
  
  private void lambda$configureTabbedPane$11(Zren paramZren, int paramInt) {
    Zkcm zkcm = paramZren.ZX(paramInt);
    this.Zt.addTab(zkcm.ZV(), null, null, zkcm.ZR());
    this.Zt.setEnabledAt(paramInt, zkcm.ZD());
  }
  
  private void lambda$configureViewControls$10(ChangeEvent paramChangeEvent) {
    Zl(this.Zt.getSelectedIndex());
  }
  
  private void lambda$togglePrettify$9(Zkcm paramZkcm) {
    int[] arrayOfInt = Zbdf.ZM();
    if (paramZkcm.ZD()) {
      if (this.ZP.ZC() == paramZkcm) {
        ZY(this.ZP.Zb());
        if (arrayOfInt != null) {
          ZY(paramZkcm);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    ZY(paramZkcm);
  }
  
  private void lambda$checkpoint$8(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7) {
    this.Zn.setEnabled(paramBoolean1);
    this.Zj.setEnabled(paramBoolean2);
    this.Zz.setEnabled(paramBoolean3);
    this.Zn.ZJ(paramBoolean4);
    this.Zj.ZJ(paramBoolean5);
    if (this.ZZ != null) {
      this.ZZ.setEnabled(paramBoolean6);
      this.ZZ.ZJ(paramBoolean7);
    } 
  }
  
  private void lambda$new$7(Zm7i paramZm7i) {
    Point point = new Point(0, this.Zz.getHeight());
    paramZm7i.Zm(this.Zz, point);
  }
  
  private static void lambda$new$6() {
    Zm2.Zo(Zze0.SUITE_MESSAGE_ANALYSER_TOGGLE_DISPLAY_NON_PRINTABLE_CHARS);
  }
  
  private void lambda$new$5(Zm7i paramZm7i) {
    paramZm7i.Zs(this.Zj.Z_());
  }
  
  private static void lambda$new$4() {
    Zm2.Zo(Zze0.SUITE_MESSAGE_ANALYSER_TOGGLE_LINE_WRAP);
  }
  
  private void lambda$new$3(Zm7i paramZm7i) {
    paramZm7i.ZS(this.Zn.Z_());
  }
  
  private static void lambda$new$2() {
    Zm2.Zo(Zze0.SUITE_MESSAGE_ANALYSER_TOGGLE_HIDE_UNINTERESTING_HEADERS);
  }
  
  private void lambda$new$1(Zm7i paramZm7i) {
    paramZm7i.ZQ(!this.ZZ.Z_());
  }
  
  private static Boolean lambda$new$0() {
    return Boolean.valueOf(false);
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'â ÿÅ{[&È$PP\\fLßûMqøÑxÅég[òÁ·;è>®í\\tWsqàüX¶!'^ãn@»×Éæ#7a{ªQ\\t%5c5\\b`A®³äý¨Ué¸®wÛ8±8~;àck$óÑCXãQllÿáÍ¿è\\bz/êïSo>d¶&?Çù¡Mûß¼Àt\\téåÙCq_Ã¸Í ÜÛ_ìmÄ}Ï^¥¡ÇRËÊæo[ºEK\\b*8ÙGÎL%SHùjÉ\\tg¥`y¾ÜSQµ]tWJJM&6¡?ý²uÚä§\\bY5 xd¦CÅsÊjà-¦¿bI ¾:ÔYÃRÏrn?£RBñ³ ÉéHã>¿FÖ¦'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc '"Ä|øçn!'lîY×È[VRÁfNç ¿È'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #29
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
    //   129: putstatic burp/Zbd8.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbd8.b : [Ljava/lang/String;
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
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #83
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #30
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #71
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
    int i = (paramInt1 ^ 0x3895) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */