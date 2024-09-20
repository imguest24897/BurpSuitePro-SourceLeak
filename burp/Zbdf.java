package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.HierarchyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EnumSet;
import java.util.List;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class Zbdf extends Zbqc implements MouseListener, Zzyl, Ztbl, Zkgx {
  public static final EnumSet<Zgu3> ZD;
  
  public static final EnumSet<Zgu3> ZU;
  
  public static final EnumSet<Zgu3> ZR;
  
  public static final EnumSet<Zgu3> ZE;
  
  private static final Dimension ZH;
  
  private final Zerg Zq;
  
  private final Zrs_ Zy;
  
  private final Zgmk ZV;
  
  private final Zgty ZO;
  
  private final Zlhp Zs;
  
  private final Zten Z_;
  
  private final Zbc9 ZZ;
  
  private final Zbd8 ZX;
  
  private final Zkki Zo;
  
  private final EnumSet<Zgu3> Zv;
  
  private final boolean ZW;
  
  private final Zzbd Za;
  
  private final Zkbs ZC;
  
  private Zmd9 Zx;
  
  private boolean ZA;
  
  private boolean Zj;
  
  private boolean ZS;
  
  private static int[] ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbdf(Zz0n paramZz0n, Zerg paramZerg, Zgb6 paramZgb6, Zs18 paramZs18, Zey9 paramZey9, Ztwv paramZtwv, Zb86 paramZb86, Zmgv paramZmgv, Zs9h paramZs9h, Zeew paramZeew, boolean paramBoolean, EnumSet<Zgu3> paramEnumSet, Ze_8 paramZe_8, Zrs_ paramZrs_, Zlul paramZlul, Zebt paramZebt, Zskl paramZskl, Zgli paramZgli, Zghz paramZghz, Zt22 paramZt22, Zzie paramZzie) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/BorderLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: invokestatic ZM : ()[I
    //   14: aload_0
    //   15: getstatic burp/Zmd9.Zi : Lburp/Zmd9;
    //   18: putfield Zx : Lburp/Zmd9;
    //   21: astore #22
    //   23: aload_2
    //   24: ifnull -> 31
    //   27: iconst_1
    //   28: goto -> 32
    //   31: iconst_0
    //   32: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   35: lconst_1
    //   36: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   39: aload_0
    //   40: aload_2
    //   41: putfield Zq : Lburp/Zerg;
    //   44: aload_0
    //   45: iload #11
    //   47: putfield ZW : Z
    //   50: aload_0
    //   51: aload #12
    //   53: putfield Zv : Ljava/util/EnumSet;
    //   56: aload_0
    //   57: aload #14
    //   59: putfield Zy : Lburp/Zrs_;
    //   62: aload_0
    //   63: aload #16
    //   65: aload_0
    //   66: new burp/Zlfj
    //   69: dup
    //   70: aload_0
    //   71: invokespecial <init> : (Lburp/Zbdf;)V
    //   74: invokeinterface Zs : (Ljava/awt/Component;Lburp/Zlfj;)Lburp/Zgmk;
    //   79: putfield ZV : Lburp/Zgmk;
    //   82: aload_0
    //   83: new burp/Zgty
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: putfield ZO : Lburp/Zgty;
    //   93: aload_0
    //   94: new burp/Zlhp
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: putfield Zs : Lburp/Zlhp;
    //   104: aload_0
    //   105: new burp/Zten
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: putfield Z_ : Lburp/Zten;
    //   115: aload_0
    //   116: new burp/Zbc9
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: putfield ZZ : Lburp/Zbc9;
    //   126: aload_0
    //   127: iconst_1
    //   128: putfield ZS : Z
    //   131: aload_0
    //   132: aload #21
    //   134: aload_0
    //   135: getfield Zv : Ljava/util/EnumSet;
    //   138: new burp/Zxt0
    //   141: dup
    //   142: aload_0
    //   143: <illegal opcode> get : (Lburp/Zbdf;)Ljava/util/function/Supplier;
    //   148: aload #18
    //   150: aload #10
    //   152: iload #11
    //   154: aload #17
    //   156: aload #5
    //   158: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zgli;Lburp/Zeew;ZLburp/Zskl;Lburp/Zey9;)V
    //   161: aload_0
    //   162: <illegal opcode> run : (Lburp/Zbdf;)Ljava/lang/Runnable;
    //   167: aload_0
    //   168: <illegal opcode> accept : (Lburp/Zbdf;)Ljava/util/function/Consumer;
    //   173: invokeinterface Zf : (Ljava/util/EnumSet;Lburp/Zl8t;Ljava/lang/Runnable;Ljava/util/function/Consumer;)Lburp/Zkbs;
    //   178: putfield ZC : Lburp/Zkbs;
    //   181: aload_0
    //   182: aload_0
    //   183: <illegal opcode> Zx : (Lburp/Zbdf;)Lburp/Zzbd;
    //   188: putfield Za : Lburp/Zzbd;
    //   191: aload_1
    //   192: invokeinterface ZD : ()Lburp/Zb0h;
    //   197: astore #23
    //   199: new burp/Zth5
    //   202: dup
    //   203: aload_3
    //   204: aload #23
    //   206: aload #6
    //   208: aload_0
    //   209: aload_0
    //   210: getfield ZO : Lburp/Zgty;
    //   213: aload_0
    //   214: getfield Z_ : Lburp/Zten;
    //   217: aload #15
    //   219: iload #11
    //   221: aload #5
    //   223: aload #20
    //   225: aload #19
    //   227: invokespecial <init> : (Lburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Lburp/Zbdf;Lburp/Zgty;Lburp/Zgtp;Lburp/Zlul;ZLburp/Zey9;Lburp/Zt22;Lburp/Zghz;)V
    //   230: astore #24
    //   232: new burp/Zzew
    //   235: dup
    //   236: aload #24
    //   238: invokespecial <init> : (Lburp/Zth5;)V
    //   241: astore #25
    //   243: aload_0
    //   244: getfield ZZ : Lburp/Zbc9;
    //   247: aload #25
    //   249: invokevirtual Zz : ()Ljava/awt/Component;
    //   252: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   255: pop
    //   256: new burp/Zzex
    //   259: dup
    //   260: aload #24
    //   262: invokespecial <init> : (Lburp/Zth5;)V
    //   265: astore #26
    //   267: aload_0
    //   268: getfield ZZ : Lburp/Zbc9;
    //   271: aload #26
    //   273: invokevirtual Zz : ()Ljava/awt/Component;
    //   276: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   279: pop
    //   280: new burp/Zthy
    //   283: dup
    //   284: aload_0
    //   285: iload #11
    //   287: aload #23
    //   289: aload_0
    //   290: getfield ZO : Lburp/Zgty;
    //   293: aload_0
    //   294: getfield Z_ : Lburp/Zten;
    //   297: aload_3
    //   298: aload #15
    //   300: aload #5
    //   302: invokespecial <init> : (Lburp/Zbdf;ZLburp/Zb0h;Lburp/Zt7b;Lburp/Zgtp;Lburp/Zgb6;Lburp/Zlul;Lburp/Zey9;)V
    //   305: astore #27
    //   307: aload_0
    //   308: getfield ZZ : Lburp/Zbc9;
    //   311: aload #27
    //   313: invokevirtual Zz : ()Ljava/awt/Component;
    //   316: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   319: pop
    //   320: aconst_null
    //   321: astore #28
    //   323: aload #12
    //   325: invokestatic ZV : (Ljava/util/EnumSet;)Z
    //   328: ifeq -> 363
    //   331: new burp/Zt7o
    //   334: dup
    //   335: aload_0
    //   336: aload_3
    //   337: aload #23
    //   339: aload #6
    //   341: aload #13
    //   343: aload #5
    //   345: invokespecial <init> : (Lburp/Zbdf;Lburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Lburp/Ze_8;Lburp/Zey9;)V
    //   348: astore #28
    //   350: aload_0
    //   351: getfield ZZ : Lburp/Zbc9;
    //   354: aload #28
    //   356: invokevirtual Zz : ()Ljava/awt/Component;
    //   359: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   362: pop
    //   363: aconst_null
    //   364: astore #29
    //   366: aload #12
    //   368: invokestatic Zq : (Ljava/util/EnumSet;)Z
    //   371: ifeq -> 418
    //   374: new burp/Ztht
    //   377: dup
    //   378: aload_3
    //   379: aload #23
    //   381: aload #6
    //   383: aload_0
    //   384: aload_0
    //   385: getfield ZO : Lburp/Zgty;
    //   388: aload_0
    //   389: getfield Z_ : Lburp/Zten;
    //   392: iload #11
    //   394: aload #5
    //   396: aload #20
    //   398: aload #19
    //   400: invokespecial <init> : (Lburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Lburp/Zbdf;Lburp/Zgty;Lburp/Zgtp;ZLburp/Zey9;Lburp/Zt22;Lburp/Zghz;)V
    //   403: astore #29
    //   405: aload_0
    //   406: getfield ZZ : Lburp/Zbc9;
    //   409: aload #29
    //   411: invokevirtual Zz : ()Ljava/awt/Component;
    //   414: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   417: pop
    //   418: aload_0
    //   419: getfield Zv : Ljava/util/EnumSet;
    //   422: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   425: invokevirtual contains : (Ljava/lang/Object;)Z
    //   428: ifeq -> 437
    //   431: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   434: goto -> 458
    //   437: aload_0
    //   438: getfield Zv : Ljava/util/EnumSet;
    //   441: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   444: invokeinterface findFirst : ()Ljava/util/Optional;
    //   449: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   452: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   455: checkcast burp/Zgu3
    //   458: astore #30
    //   460: aload_0
    //   461: new burp/Zbd8
    //   464: dup
    //   465: new burp/Zk9p
    //   468: dup
    //   469: aload_0
    //   470: invokespecial <init> : (Lburp/Zbdf;)V
    //   473: aload #30
    //   475: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   478: if_acmpne -> 485
    //   481: iconst_1
    //   482: goto -> 486
    //   485: iconst_0
    //   486: invokespecial <init> : (Lburp/Zm7i;Z)V
    //   489: putfield ZX : Lburp/Zbd8;
    //   492: aload_0
    //   493: getfield ZX : Lburp/Zbd8;
    //   496: iconst_0
    //   497: invokevirtual setVisible : (Z)V
    //   500: aload #29
    //   502: ifnull -> 540
    //   505: new burp/Zexf
    //   508: dup
    //   509: aload #4
    //   511: aload #5
    //   513: aload_0
    //   514: getfield ZX : Lburp/Zbd8;
    //   517: aload_0
    //   518: <illegal opcode> get : (Lburp/Zbdf;)Ljava/util/function/Supplier;
    //   523: aload #24
    //   525: iconst_1
    //   526: anewarray burp/Zzmn
    //   529: dup
    //   530: iconst_0
    //   531: aload #29
    //   533: aastore
    //   534: invokespecial <init> : (Lburp/Zs18;Lburp/Zey9;Lburp/Zbd8;Ljava/util/function/Supplier;Lburp/Zth5;[Lburp/Zzmn;)V
    //   537: goto -> 567
    //   540: new burp/Zexf
    //   543: dup
    //   544: aload #4
    //   546: aload #5
    //   548: aload_0
    //   549: getfield ZX : Lburp/Zbd8;
    //   552: aload_0
    //   553: <illegal opcode> get : (Lburp/Zbdf;)Ljava/util/function/Supplier;
    //   558: aload #24
    //   560: iconst_0
    //   561: anewarray burp/Zzmn
    //   564: invokespecial <init> : (Lburp/Zs18;Lburp/Zey9;Lburp/Zbd8;Ljava/util/function/Supplier;Lburp/Zth5;[Lburp/Zzmn;)V
    //   567: astore #31
    //   569: aload_0
    //   570: new burp/Zkki
    //   573: dup
    //   574: new burp/Zko
    //   577: dup
    //   578: iconst_5
    //   579: anewarray burp/Zge7
    //   582: dup
    //   583: iconst_0
    //   584: aload #26
    //   586: aastore
    //   587: dup
    //   588: iconst_1
    //   589: aload #25
    //   591: aastore
    //   592: dup
    //   593: iconst_2
    //   594: aload #27
    //   596: aastore
    //   597: dup
    //   598: iconst_3
    //   599: aload #28
    //   601: aastore
    //   602: dup
    //   603: iconst_4
    //   604: aload #29
    //   606: aastore
    //   607: invokespecial <init> : ([Lburp/Zge7;)V
    //   610: aload #31
    //   612: aload #8
    //   614: aload #9
    //   616: iload #11
    //   618: aload_3
    //   619: dup
    //   620: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   623: pop
    //   624: <illegal opcode> get : (Lburp/Zgb6;)Ljava/util/function/Supplier;
    //   629: aload #30
    //   631: aload #7
    //   633: invokespecial <init> : (Lburp/Zko;Lburp/Zexf;Lburp/Zmgv;Lburp/Zs9h;ZLjava/util/function/Supplier;Lburp/Zgu3;Lburp/Zb86;)V
    //   636: putfield Zo : Lburp/Zkki;
    //   639: aload_0
    //   640: getfield ZX : Lburp/Zbd8;
    //   643: iconst_1
    //   644: invokevirtual ZX : (Z)V
    //   647: aload_0
    //   648: getfield ZX : Lburp/Zbd8;
    //   651: iconst_1
    //   652: invokevirtual Za : (Z)V
    //   655: aload_0
    //   656: getfield ZX : Lburp/Zbd8;
    //   659: aload_3
    //   660: dup
    //   661: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   664: pop
    //   665: <illegal opcode> get : (Lburp/Zgb6;)Ljava/util/function/Supplier;
    //   670: invokevirtual Zu : (Ljava/util/function/Supplier;)V
    //   673: aload_0
    //   674: getfield ZX : Lburp/Zbd8;
    //   677: aload_3
    //   678: invokeinterface ZEy : ()Z
    //   683: invokevirtual ZR : (Z)V
    //   686: aload_0
    //   687: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   690: invokevirtual Zl : (Lburp/Zlkk;)V
    //   693: aload_0
    //   694: aload_0
    //   695: getfield ZX : Lburp/Zbd8;
    //   698: sipush #12174
    //   701: sipush #24706
    //   704: invokestatic a : (II)Ljava/lang/String;
    //   707: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   710: aload_0
    //   711: aload_0
    //   712: getfield ZZ : Lburp/Zbc9;
    //   715: sipush #12172
    //   718: sipush #23972
    //   721: invokestatic a : (II)Ljava/lang/String;
    //   724: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   727: aload_0
    //   728: sipush #12173
    //   731: sipush #7158
    //   734: invokestatic a : (II)Ljava/lang/String;
    //   737: invokevirtual setName : (Ljava/lang/String;)V
    //   740: aload_0
    //   741: invokevirtual ZR : ()V
    //   744: aload_0
    //   745: aload_0
    //   746: aload #7
    //   748: <illegal opcode> hierarchyChanged : (Lburp/Zbdf;Lburp/Zb86;)Ljava/awt/event/HierarchyListener;
    //   753: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   756: aload #22
    //   758: ifnull -> 768
    //   761: iconst_2
    //   762: anewarray burp/Zbqc
    //   765: invokestatic Zr : ([Lburp/Zbqc;)V
    //   768: return
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zo != null)
      this.Zo.Zjy(); 
  }
  
  public void ZD(String paramString) {
    this.ZX.setName(paramString);
  }
  
  public void ZW(Zmd9 paramZmd9) {
    this.Zx = paramZmd9;
  }
  
  public Zkki ZF() {
    return this.Zo;
  }
  
  private void ZJ(Component paramComponent, Point paramPoint) {
    Zt(new MouseEvent(paramComponent, 501, System.currentTimeMillis(), 0, paramPoint.x, paramPoint.y, 1, true, 2));
  }
  
  public void Zn(Zt7b paramZt7b) {
    this.ZO.Zk(paramZt7b);
  }
  
  public void Zo(Zt7b paramZt7b) {
    this.ZO.ZB(paramZt7b);
  }
  
  public void ZY(Zktb paramZktb) {
    this.Zs.Zs(paramZktb);
  }
  
  public void Zo(Zktb paramZktb) {
    this.Zs.Zi(paramZktb);
  }
  
  public void ZH(Zgtp paramZgtp) {
    this.Z_.Zu(paramZgtp);
  }
  
  public void ZT(Zgtp paramZgtp) {
    this.Z_.Zy(paramZgtp);
  }
  
  public void ZU(List<Zt37> paramList) {
    this.Zo.Zk(paramList);
    ZR();
  }
  
  private void ZR() {
    Zge7 zge7 = this.Zo.Zj2();
    Zsmh zsmh = Zi();
    ZH(zge7, zsmh);
    this.Zo.Zjn();
    this.Zo.Zu(this.ZC.Zk(ZY()), zsmh);
    Zr(zge7, zsmh);
  }
  
  private void Zj(Zsmh paramZsmh) {
    this.Zo.Zs(ZY(), paramZsmh);
    this.Zo.Zjn();
    this.Zo.Zu(this.ZC.Zk(ZY()), paramZsmh);
    Zbsv.Zb(this::Za);
  }
  
  public void Zt() {
    this.Zo.Zj_();
  }
  
  private void Za() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZZ : Lburp/Zbc9;
    //   4: invokevirtual getComponents : ()[Ljava/awt/Component;
    //   7: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   10: astore_1
    //   11: aload_0
    //   12: getfield Zo : Lburp/Zkki;
    //   15: invokevirtual ZjP : ()Ljava/util/List;
    //   18: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   23: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   28: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   33: invokeinterface toList : ()Ljava/util/List;
    //   38: astore_2
    //   39: aload_1
    //   40: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   45: aload_2
    //   46: <illegal opcode> test : (Ljava/util/List;)Ljava/util/function/Predicate;
    //   51: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   56: aload_0
    //   57: getfield ZZ : Lburp/Zbc9;
    //   60: dup
    //   61: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: pop
    //   65: <illegal opcode> accept : (Lburp/Zbc9;)Ljava/util/function/Consumer;
    //   70: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   75: iconst_0
    //   76: aload_2
    //   77: invokeinterface size : ()I
    //   82: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   85: aload_0
    //   86: aload_2
    //   87: aload_1
    //   88: <illegal opcode> accept : (Lburp/Zbdf;Ljava/util/List;Ljava/util/List;)Ljava/util/function/IntConsumer;
    //   93: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   98: return
  }
  
  public void ZL(Zstu paramZstu, Zgu3 paramZgu3, Zmgv paramZmgv) {
    this.Zo.Zk(paramZmgv);
    ZU((paramZstu == null) ? null : paramZstu.ZiD(), paramZgu3, true);
  }
  
  public void ZE(Zstu paramZstu, Zgu3 paramZgu3) {
    ZN((paramZstu == null) ? null : paramZstu.ZiD(), paramZgu3);
  }
  
  public void ZN(byte[] paramArrayOfbyte, Zgu3 paramZgu3) {
    ZU(paramArrayOfbyte, paramZgu3, true);
  }
  
  public void ZU(byte[] paramArrayOfbyte, Zgu3 paramZgu3, boolean paramBoolean) {
    ZY(Zsmh.Zh(paramArrayOfbyte), paramZgu3, Zgsq.HIDDEN, paramBoolean);
  }
  
  public void ZI(Zefx paramZefx, Zmgv paramZmgv) {
    this.Zo.Zk(paramZmgv);
    Zgsq zgsq = paramZmgv.Zoe();
    ZW(paramZefx, (zgsq == null) ? Zgsq.AUTO : zgsq, true);
  }
  
  public void Zw(Zefx paramZefx, Zgsq paramZgsq, Zmgv paramZmgv) {
    this.Zo.Zk(paramZmgv);
    ZA(paramZefx, paramZgsq);
  }
  
  public void ZA(Zefx paramZefx, Zgsq paramZgsq) {
    ZW(paramZefx, paramZgsq, true);
  }
  
  public void ZW(Zefx paramZefx, Zgsq paramZgsq, boolean paramBoolean) {
    ZY(ZD(paramZefx, paramZgsq), Zgu3.HTTP_REQUEST, (paramZgsq == null) ? Zgsq.AUTO : paramZgsq, paramBoolean);
  }
  
  private Zefx ZD(Zefx paramZefx, Zgsq paramZgsq) {
    if (paramZefx == null || paramZgsq == null)
      return paramZefx; 
    Zl0o zl0o = new Zl0o(paramZgsq);
    paramZefx.Zi(zl0o);
    return zl0o.ZJ();
  }
  
  private void ZY(Zsmh paramZsmh, Zgu3 paramZgu3, Zgsq paramZgsq, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Ljava/util/EnumSet;
    //   4: aload_2
    //   5: invokevirtual contains : (Ljava/lang/Object;)Z
    //   8: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   11: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   14: aload_0
    //   15: getfield Zo : Lburp/Zkki;
    //   18: aload_2
    //   19: aload_1
    //   20: invokevirtual Zs : (Lburp/Zgu3;Lburp/Zsmh;)V
    //   23: aload_0
    //   24: getfield Zo : Lburp/Zkki;
    //   27: aload_3
    //   28: invokevirtual ZM : (Lburp/Zgsq;)V
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield ZA : Z
    //   36: aload_1
    //   37: ifnonnull -> 57
    //   40: aload_0
    //   41: getfield Zo : Lburp/Zkki;
    //   44: invokevirtual ZjX : ()V
    //   47: aload_0
    //   48: <illegal opcode> run : (Lburp/Zbdf;)Ljava/lang/Runnable;
    //   53: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   56: return
    //   57: aload_0
    //   58: aload_1
    //   59: iload #4
    //   61: <illegal opcode> run : (Lburp/Zbdf;Lburp/Zsmh;Z)Ljava/lang/Runnable;
    //   66: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   69: return
  }
  
  public void Zm(boolean paramBoolean) {
    this.ZS = paramBoolean;
    this.ZX.setVisible(paramBoolean);
    this.ZZ.setVisible(paramBoolean);
  }
  
  private void ZT(Zsmh paramZsmh) {
    this.Zj = true;
    this.ZX.setVisible(false);
    this.Zo.ZO(paramZsmh);
    this.ZX.setVisible(this.ZS);
    this.Zj = false;
  }
  
  public void ZD() {
    this.ZZ.setVisible(this.ZS);
    this.ZZ.ZP(this.Zo.Zj2().Zz());
  }
  
  public void ZK(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Zm(true);
    if (!this.Zo.Zjd() || !this.ZZ.isVisible()) {
      this.Zo.ZjR();
      ZT(Zi());
      ZD();
    } 
    this.Zo.Zb(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void ZX(List<Zkv5> paramList) {
    this.Zo.Zn(paramList);
  }
  
  public void ZN(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zo.Zc(paramString, paramBoolean1, paramBoolean2);
  }
  
  public void requestFocus() {
    SwingUtilities.invokeLater(this::lambda$requestFocus$7);
  }
  
  public Zsmh Zi() {
    return this.Zo.ZjZ();
  }
  
  public Zgsq Zs() {
    return this.Zo.Zjz();
  }
  
  public boolean ZX() {
    return this.ZW;
  }
  
  public boolean Ze() {
    if (this.ZW && this.Zo.Zj2().ZR())
      this.ZA = true; 
    return this.ZA;
  }
  
  public int[] ZG() {
    return this.Zo.Zj2().Zg();
  }
  
  public byte[] Zd() {
    return this.Zo.Zj2().Zw();
  }
  
  public void Ze(int paramInt1, int paramInt2) {
    this.Zo.Zj2().Zm(paramInt1, paramInt2);
  }
  
  public void Zs(int paramInt1, int paramInt2, String paramString) {
    this.Zo.Zj2().ZV(paramInt1, paramInt2, paramString);
  }
  
  private Zgu3 ZY() {
    return this.Zo.ZjE();
  }
  
  Zmgv ZT() {
    return this.Zo.Zjf();
  }
  
  public Dimension getMinimumSize() {
    return ZH;
  }
  
  public List<Component> Zo() {
    return Zl((MouseEvent)null);
  }
  
  private List<Component> Zl(MouseEvent paramMouseEvent) {
    Zmgv zmgv = this.Zo.Zjf();
    Zsgf zsgf = new Zsgf(this);
    List<Component> list1 = this.Zy.Zi(zmgv, zsgf, ZY(), Zs(), paramMouseEvent, this, this, (this.Zo.Zjd() || this.Zo.ZjD()), ZG());
    List<Component> list2 = this.Zo.Zj2().ZR(paramMouseEvent);
    if (list2 != null && !list2.isEmpty()) {
      list1.add(new JSeparator());
      list1.addAll(list2);
    } 
    list1.add(new JSeparator());
    list1.add(new Zepa(a(12175, 21029), Zk97.DESKTOP_FUNCTIONS_MESSAGE_EDITOR, Zt2m.ZF(this)));
    if (zmgv != null) {
      Zepe zepe = zmgv.Zl(this);
      if (zepe != null)
        list1.add(zepe); 
    } 
    return list1;
  }
  
  public void ZA() {
    this.ZX.Zl();
  }
  
  public void ZL() {
    this.ZX.ZT();
  }
  
  public void ZP() {
    this.ZX.ZA();
  }
  
  public void Zf() {
    this.ZX.ZX();
  }
  
  void Zh() {
    this.ZX.ZH();
  }
  
  void Zt(boolean paramBoolean) {
    this.ZX.ZJ(paramBoolean);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zt(paramMouseEvent); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zt(paramMouseEvent); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  private void Zt(MouseEvent paramMouseEvent) {
    int[] arrayOfInt = ZM();
    if (Zi() == null)
      return; 
    Zkj9 zkj9 = new Zkj9();
    List<Component> list = Zl(paramMouseEvent);
    for (Component component : list) {
      zkj9.add(component);
      if (arrayOfInt != null)
        break; 
    } 
    zkj9.show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  public void Zn(boolean paramBoolean) {
    this.ZC.ZO(paramBoolean);
  }
  
  private void ZE() {
    if (!isShowing())
      return; 
    Zgu3 zgu3 = ZY();
    if (!this.ZC.Zd(zgu3))
      return; 
    Zge7 zge7 = this.Zo.Zj2();
    Zsmh zsmh = Zi();
    ZH(zge7, zsmh);
    this.Zo.Ze(this.ZC.Zk(zgu3), zsmh);
    Z_(zge7, zsmh);
  }
  
  private void Zq(Zge7 paramZge7) {
    this.Zo.Zh(paramZge7);
  }
  
  private void Zr(Zge7 paramZge7, Zsmh paramZsmh) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_3
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 20
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: invokevirtual Z_ : (Lburp/Zge7;Lburp/Zsmh;)V
    //   16: aload_3
    //   17: ifnull -> 31
    //   20: aload_0
    //   21: aload_1
    //   22: aload_2
    //   23: <illegal opcode> run : (Lburp/Zbdf;Lburp/Zge7;Lburp/Zsmh;)Ljava/lang/Runnable;
    //   28: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   31: return
  }
  
  private void Z_(Zge7 paramZge7, Zsmh paramZsmh) {
    Za();
    if (paramZsmh != null)
      ZT(paramZsmh); 
    ZD();
    if (paramZsmh != null && Zf(paramZge7, this.Zo.Zj2()))
      this.Zo.Zi(paramZsmh, true); 
  }
  
  private void ZH(Zge7 paramZge7, Zsmh paramZsmh) {
    this.ZA = (this.ZW && paramZge7.ZR());
    if (!this.Zo.Zj1() || this.ZA)
      this.Zo.Zs(ZY(), paramZsmh); 
  }
  
  public void Zc() {
    boolean bool1 = this.Zo.Zjj();
    boolean bool2 = this.Zo.Zjm();
    if (bool1 || bool2)
      SwingUtilities.invokeLater(this::lambda$refreshVisiblePanes$9); 
  }
  
  public void addNotify() {
    this.Zq.ZM().ZI(this.ZC);
    super.addNotify();
  }
  
  public void removeNotify() {
    this.Zq.ZM().ZC(this.ZC);
    super.removeNotify();
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    Zzzd zzzd = this.ZV.ZM(this.ZA, this.Zo.ZjE(), this.Zo.Zj2(), this.Zo.Zjf(), this.Zo.Zjz(), this, paramInt, paramObject, this.Zx);
    this.ZA = zzzd.ZN;
    return zzzd.Zo;
  }
  
  public void ZU() {
    int[] arrayOfInt = ZM();
    for (Zge7 zge7 : ZF().ZjP()) {
      zge7.ZU();
      if (arrayOfInt != null)
        break; 
    } 
    this.ZX.ZU();
    Zm(true);
    ZF().ZU();
    ZD();
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZS : Z
    //   4: istore_2
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore_3
    //   13: invokestatic ZM : ()[I
    //   16: aload_3
    //   17: aload_0
    //   18: iload_2
    //   19: <illegal opcode> Zg : (Lburp/Zbdf;Z)Lburp/Ztcw;
    //   24: invokeinterface add : (Ljava/lang/Object;)Z
    //   29: pop
    //   30: astore_1
    //   31: aload_0
    //   32: invokevirtual ZF : ()Lburp/Zkki;
    //   35: invokevirtual ZjP : ()Ljava/util/List;
    //   38: invokeinterface iterator : ()Ljava/util/Iterator;
    //   43: astore #4
    //   45: aload #4
    //   47: invokeinterface hasNext : ()Z
    //   52: ifeq -> 89
    //   55: aload #4
    //   57: invokeinterface next : ()Ljava/lang/Object;
    //   62: checkcast burp/Zge7
    //   65: astore #5
    //   67: aload #5
    //   69: invokeinterface ZI : ()Lburp/Ztcw;
    //   74: astore #6
    //   76: aload_3
    //   77: aload #6
    //   79: invokeinterface add : (Ljava/lang/Object;)Z
    //   84: pop
    //   85: aload_1
    //   86: ifnull -> 45
    //   89: aload_3
    //   90: aload_0
    //   91: getfield ZX : Lburp/Zbd8;
    //   94: invokevirtual ZI : ()Lburp/Ztcw;
    //   97: invokeinterface add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_3
    //   104: aload_0
    //   105: getfield Zo : Lburp/Zkki;
    //   108: invokevirtual ZI : ()Lburp/Ztcw;
    //   111: invokeinterface add : (Ljava/lang/Object;)Z
    //   116: pop
    //   117: aload_3
    //   118: invokestatic ZQ : (Ljava/util/List;)Lburp/Ztcw;
    //   121: areturn
  }
  
  private static boolean Zf(Zge7 paramZge71, Zge7 paramZge72) {
    return (paramZge71 != paramZge72);
  }
  
  private void lambda$checkpoint$10(boolean paramBoolean) {
    Zm(paramBoolean);
  }
  
  private void lambda$refreshVisiblePanes$9() {
    Za();
    ZD();
    Zsmh zsmh = this.Zo.ZjZ();
    ZT(zsmh);
  }
  
  private void lambda$initialiseTabsForMessageOnEventThread$8(Zge7 paramZge7, Zsmh paramZsmh) {
    Z_(paramZge7, paramZsmh);
  }
  
  private void lambda$requestFocus$7() {
    this.Zo.Zj2().Za();
  }
  
  private void lambda$setMessage$6(Zsmh paramZsmh, boolean paramBoolean) {
    Zj(paramZsmh);
    Zge7 zge7 = this.Zo.ZjC();
    try {
      zge7.ZR(true);
      this.Zo.Zji();
      this.Zo.Zi(paramZsmh, paramBoolean);
      ZT(paramZsmh);
      ZD();
    } finally {
      zge7.ZR(false);
    } 
    Zm(true);
  }
  
  private void lambda$setMessage$5() {
    Zm(false);
  }
  
  private void lambda$configureVisiblePanes$4(List<Component> paramList1, List paramList2, int paramInt) {
    Component component = paramList1.get(paramInt);
    if (paramInt != paramList2.indexOf(component))
      this.ZZ.add(component, paramInt); 
  }
  
  private static boolean lambda$configureVisiblePanes$3(List paramList, Component paramComponent) {
    return !paramList.contains(paramComponent);
  }
  
  private void lambda$new$2(Zb86 paramZb86, HierarchyEvent paramHierarchyEvent) {
    int[] arrayOfInt = ZM();
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L) {
      if (isShowing()) {
        paramZb86.Zx(this.Za);
        ZE();
        ZR();
        if (arrayOfInt != null) {
          paramZb86.Zd(this.Za);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    paramZb86.Zd(this.Za);
  }
  
  private Zrri lambda$new$0() {
    return ZF().Zj2().Zp();
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '%z`ÉYp]¸ýÐ¯e´ÅÀÄküÑÍµR;ì­¿'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #28
    //   20: istore_1
    //   21: invokestatic ZC : ([I)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #22
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'd)Ï PÃÌasÍE±¹¿\\nBc[]'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #15
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #120
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
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
    //   132: putstatic burp/Zbdf.a : [Ljava/lang/String;
    //   135: iconst_4
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zbdf.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #68
    //   218: goto -> 248
    //   221: bipush #110
    //   223: goto -> 248
    //   226: bipush #15
    //   228: goto -> 248
    //   231: bipush #37
    //   233: goto -> 248
    //   236: bipush #67
    //   238: goto -> 248
    //   241: bipush #106
    //   243: goto -> 248
    //   246: bipush #36
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   307: invokestatic of : (Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   310: putstatic burp/Zbdf.ZD : Ljava/util/EnumSet;
    //   313: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   316: invokestatic of : (Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   319: putstatic burp/Zbdf.ZU : Ljava/util/EnumSet;
    //   322: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   325: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   328: invokestatic of : (Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   331: putstatic burp/Zbdf.ZR : Ljava/util/EnumSet;
    //   334: getstatic burp/Zgu3.WS_MESSAGE : Lburp/Zgu3;
    //   337: invokestatic of : (Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   340: putstatic burp/Zbdf.ZE : Ljava/util/EnumSet;
    //   343: new java/awt/Dimension
    //   346: dup
    //   347: iconst_0
    //   348: iconst_0
    //   349: invokespecial <init> : (II)V
    //   352: putstatic burp/Zbdf.ZH : Ljava/awt/Dimension;
    //   355: return
  }
  
  public static void ZC(int[] paramArrayOfint) {
    ZG = paramArrayOfint;
  }
  
  public static int[] ZM() {
    return ZG;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2F8F) & 0xFFFF;
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
      byte b1 = 42;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */