package burp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbht extends Zbqc implements Zzyl, Zlpt {
  private final Zbws ZS;
  
  private final Zbjf ZI;
  
  private final Zl85 ZY;
  
  private final Zbup ZX;
  
  private final Zkg9 Zu;
  
  private final AtomicBoolean Zb;
  
  private final Zxcf ZT;
  
  private final Runnable ZK;
  
  private final Ztn8 ZH;
  
  private final Zkl6 Zq;
  
  private Future<?> Zh;
  
  private static int[] ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbht(Zerg paramZerg, Zlba paramZlba, Ztyg paramZtyg, Zgq7 paramZgq7, Zkl6 paramZkl6, Zg09 paramZg09, Zkg9 paramZkg9, Zlli<Zt1o> paramZlli, Zb0h paramZb0h, Ztwv paramZtwv) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #7
    //   7: putfield Zu : Lburp/Zkg9;
    //   10: aload_0
    //   11: aload #5
    //   13: putfield Zq : Lburp/Zkl6;
    //   16: new burp/Zmug
    //   19: dup
    //   20: aload #6
    //   22: invokespecial <init> : (Lburp/Zg09;)V
    //   25: astore #12
    //   27: aload_0
    //   28: new burp/Zbjf
    //   31: dup
    //   32: aload #6
    //   34: aload #12
    //   36: invokespecial <init> : (Lburp/Zg09;Lburp/Zmug;)V
    //   39: putfield ZI : Lburp/Zbjf;
    //   42: aload_0
    //   43: new burp/Ztn8
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: putfield ZH : Lburp/Ztn8;
    //   53: aload_0
    //   54: new java/awt/BorderLayout
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   64: aload_0
    //   65: iconst_0
    //   66: invokevirtual setOpaque : (Z)V
    //   69: new burp/Zmyz
    //   72: dup
    //   73: iconst_0
    //   74: invokespecial <init> : (I)V
    //   77: astore #13
    //   79: aload #13
    //   81: iconst_0
    //   82: invokevirtual setOpaque : (Z)V
    //   85: aload_0
    //   86: aload #13
    //   88: sipush #-13181
    //   91: sipush #-11469
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   100: invokestatic ZY : ()[I
    //   103: aload_0
    //   104: aload_0
    //   105: getfield ZI : Lburp/Zbjf;
    //   108: invokevirtual ZV : ()Lburp/Zbws;
    //   111: putfield ZS : Lburp/Zbws;
    //   114: aload_0
    //   115: getfield ZS : Lburp/Zbws;
    //   118: sipush #-13180
    //   121: sipush #31305
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokevirtual setName : (Ljava/lang/String;)V
    //   130: new burp/Ztb6
    //   133: dup
    //   134: aload_0
    //   135: getfield ZS : Lburp/Zbws;
    //   138: aload #6
    //   140: invokespecial <init> : (Lburp/Zbws;Lburp/Zg09;)V
    //   143: astore #14
    //   145: aload_3
    //   146: aload #14
    //   148: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   151: iconst_0
    //   152: getstatic burp/Zbdf.ZD : Ljava/util/EnumSet;
    //   155: getstatic burp/Zb9b.Zx : Lburp/Zb9b;
    //   158: invokevirtual Zz : (Lburp/Zmgv;Lburp/Zeew;ZLjava/util/EnumSet;Lburp/Zb9b;)Lburp/Zbdf;
    //   161: astore #15
    //   163: astore #11
    //   165: aload #15
    //   167: sipush #-13177
    //   170: sipush #-7332
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual setName : (Ljava/lang/String;)V
    //   179: aload_3
    //   180: aload #14
    //   182: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   185: iconst_0
    //   186: getstatic burp/Zbdf.ZU : Ljava/util/EnumSet;
    //   189: getstatic burp/Zb9b.Zx : Lburp/Zb9b;
    //   192: invokevirtual Zz : (Lburp/Zmgv;Lburp/Zeew;ZLjava/util/EnumSet;Lburp/Zb9b;)Lburp/Zbdf;
    //   195: astore #16
    //   197: aload #16
    //   199: sipush #-13179
    //   202: sipush #-7977
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: invokevirtual setName : (Ljava/lang/String;)V
    //   211: new burp/Zbxw
    //   214: dup
    //   215: sipush #-13170
    //   218: sipush #2230
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: aload #15
    //   226: aload_0
    //   227: <illegal opcode> apply : (Lburp/Zbht;)Ljava/util/function/BiFunction;
    //   232: invokespecial <init> : (Ljava/lang/String;Lburp/Zbdf;Ljava/util/function/BiFunction;)V
    //   235: astore #17
    //   237: new burp/Zti6
    //   240: dup
    //   241: aload #15
    //   243: aload #17
    //   245: invokespecial <init> : (Lburp/Zbdf;Lburp/Zbxw;)V
    //   248: astore #18
    //   250: invokestatic ZG : ()Z
    //   253: ifne -> 272
    //   256: new burp/Zbdl
    //   259: dup
    //   260: aload #18
    //   262: aload #8
    //   264: aload #9
    //   266: invokespecial <init> : (Lburp/Zti6;Lburp/Zlli;Lburp/Zb0h;)V
    //   269: goto -> 273
    //   272: aconst_null
    //   273: astore #19
    //   275: new burp/Zbqc
    //   278: dup
    //   279: new java/awt/BorderLayout
    //   282: dup
    //   283: invokespecial <init> : ()V
    //   286: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   289: astore #20
    //   291: aload #20
    //   293: iconst_0
    //   294: invokevirtual setOpaque : (Z)V
    //   297: aload_0
    //   298: new burp/Zbup
    //   301: dup
    //   302: invokespecial <init> : ()V
    //   305: putfield ZX : Lburp/Zbup;
    //   308: aload_0
    //   309: getfield ZX : Lburp/Zbup;
    //   312: aload_0
    //   313: getfield ZS : Lburp/Zbws;
    //   316: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   319: aload #20
    //   321: aload_0
    //   322: getfield ZX : Lburp/Zbup;
    //   325: sipush #-13169
    //   328: sipush #3039
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   337: new burp/Zbkd
    //   340: dup
    //   341: invokespecial <init> : ()V
    //   344: astore #21
    //   346: aload #21
    //   348: iconst_5
    //   349: iconst_0
    //   350: bipush #20
    //   352: iconst_0
    //   353: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   356: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   359: aload #21
    //   361: new burp/Zm2j
    //   364: dup
    //   365: aload_0
    //   366: getfield ZS : Lburp/Zbws;
    //   369: invokespecial <init> : (Lburp/Zbws;)V
    //   372: invokevirtual Zh : (Lburp/Zm9t;)V
    //   375: new burp/Zgf8
    //   378: dup
    //   379: invokespecial <init> : ()V
    //   382: astore #22
    //   384: aload #22
    //   386: sipush #-13184
    //   389: sipush #8737
    //   392: invokestatic a : (II)Ljava/lang/String;
    //   395: invokevirtual setName : (Ljava/lang/String;)V
    //   398: aload #22
    //   400: aload #12
    //   402: dup
    //   403: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   406: pop
    //   407: <illegal opcode> Zc : (Lburp/Zmug;)Lburp/Zm6a;
    //   412: bipush #20
    //   414: invokevirtual Zv : (Lburp/Zm6a;I)V
    //   417: aload #22
    //   419: new burp/Zm9z
    //   422: dup
    //   423: aload #22
    //   425: aload_0
    //   426: getfield ZS : Lburp/Zbws;
    //   429: invokevirtual getName : ()Ljava/lang/String;
    //   432: invokespecial <init> : (Lburp/Zgf8;Ljava/lang/String;)V
    //   435: invokevirtual addFocusListener : (Ljava/awt/event/FocusListener;)V
    //   438: aload #21
    //   440: aload #22
    //   442: invokevirtual ZX : (Lburp/Zgf8;)V
    //   445: aload #20
    //   447: aload #21
    //   449: sipush #-13172
    //   452: sipush #30139
    //   455: invokestatic a : (II)Ljava/lang/String;
    //   458: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   461: aload #13
    //   463: aload #20
    //   465: invokevirtual setTopComponent : (Ljava/awt/Component;)V
    //   468: aload #4
    //   470: getstatic burp/Zxff.SCAN_ITEM : Lburp/Zxff;
    //   473: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   476: iconst_1
    //   477: anewarray burp/Zgib
    //   480: dup
    //   481: iconst_0
    //   482: aload #17
    //   484: aastore
    //   485: invokeinterface ZE : ([Lburp/Zgib;)Lburp/Zefl;
    //   490: aload #16
    //   492: sipush #-13178
    //   495: sipush #14597
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: invokeinterface Zp : (Lburp/Zbdf;Ljava/lang/String;)Lburp/Zefl;
    //   506: aload #19
    //   508: invokeinterface Zh : (Lburp/Zbdj;)Lburp/Zefl;
    //   513: invokeinterface Zo : ()Lburp/Zefl;
    //   518: invokeinterface Zl : ()Lburp/Zbdx;
    //   523: astore #23
    //   525: aload #23
    //   527: sipush #-13182
    //   530: sipush #16662
    //   533: invokestatic a : (II)Ljava/lang/String;
    //   536: invokevirtual setName : (Ljava/lang/String;)V
    //   539: aload #23
    //   541: new burp/Zr43
    //   544: dup
    //   545: getstatic burp/Zlkk.BORDER : Lburp/Zlkk;
    //   548: iconst_1
    //   549: new java/awt/Insets
    //   552: dup
    //   553: iconst_1
    //   554: iconst_1
    //   555: iconst_1
    //   556: iconst_1
    //   557: invokespecial <init> : (IIII)V
    //   560: invokespecial <init> : (Lburp/Zlkk;ILjava/awt/Insets;)V
    //   563: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   566: aload #13
    //   568: aload #23
    //   570: invokevirtual setBottomComponent : (Ljava/awt/Component;)V
    //   573: aload #13
    //   575: aload_0
    //   576: getfield ZS : Lburp/Zbws;
    //   579: invokevirtual getRowHeight : ()I
    //   582: bipush #20
    //   584: imul
    //   585: invokevirtual setDividerLocation : (I)V
    //   588: aload #13
    //   590: new burp/Zzmk
    //   593: dup
    //   594: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   597: invokespecial <init> : (Lburp/Zlkk;)V
    //   600: invokevirtual setUI : (Ljavax/swing/plaf/SplitPaneUI;)V
    //   603: aload_0
    //   604: new burp/Zl85
    //   607: dup
    //   608: aload_0
    //   609: aload #18
    //   611: aload #16
    //   613: aload #19
    //   615: aload #10
    //   617: <illegal opcode> accept : (Lburp/Zbht;Lburp/Zti6;Lburp/Zbdf;Lburp/Zbdl;Lburp/Ztwv;)Ljava/util/function/Consumer;
    //   622: aload_1
    //   623: aload_2
    //   624: aload_0
    //   625: getfield ZI : Lburp/Zbjf;
    //   628: aload_3
    //   629: aload #4
    //   631: aload #5
    //   633: aload #6
    //   635: aload_0
    //   636: getfield ZH : Lburp/Ztn8;
    //   639: aload #23
    //   641: dup
    //   642: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   645: pop
    //   646: <illegal opcode> run : (Lburp/Zbdx;)Ljava/lang/Runnable;
    //   651: invokespecial <init> : (Ljava/util/function/Consumer;Lburp/Zerg;Lburp/Zlba;Lburp/Zbjf;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zkl6;Lburp/Zg09;Lburp/Ztn8;Ljava/lang/Runnable;)V
    //   654: putfield ZY : Lburp/Zl85;
    //   657: aload_0
    //   658: new java/util/concurrent/atomic/AtomicBoolean
    //   661: dup
    //   662: invokespecial <init> : ()V
    //   665: putfield Zb : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   668: aload_0
    //   669: aload_0
    //   670: <illegal opcode> run : (Lburp/Zbht;)Ljava/lang/Runnable;
    //   675: putfield ZK : Ljava/lang/Runnable;
    //   678: aload_0
    //   679: new burp/Zxcf
    //   682: dup
    //   683: aload_0
    //   684: <illegal opcode> get : (Lburp/Zbht;)Ljava/util/function/Supplier;
    //   689: aload_0
    //   690: getfield ZK : Ljava/lang/Runnable;
    //   693: invokespecial <init> : (Ljava/util/function/Supplier;Ljava/lang/Runnable;)V
    //   696: putfield ZT : Lburp/Zxcf;
    //   699: invokestatic Zwu : ()[Lburp/Zbqc;
    //   702: ifnonnull -> 711
    //   705: iconst_4
    //   706: newarray int
    //   708: invokestatic ZZ : ([I)V
    //   711: return
  }
  
  public void ZH() {
    SwingUtilities.invokeLater(this.ZK);
    this.Zu.Zb(this::lambda$open$5);
    Zo();
  }
  
  public void Zw() {
    this.ZT.Zz();
    this.Zu.Zs();
    Zn();
    this.ZH.Zp();
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZS.ZI(paramInt, paramObject);
  }
  
  private List<Zsj0> Z_(Zbza paramZbza) {
    Zey9 zey9 = this.Zq.ZH();
    Zmzk zmzk = paramZbza.Zg0();
    Zefx zefx = zey9.ZY(zmzk, paramZbza.ZgC());
    Zzcc zzcc = (new Zzp6(zefx, paramZbza.Zgf(), this.Zq.ZB())).Zd();
    Zzwo<Zro0, Zga> zzwo = paramZbza.ZgT();
    return zzcc.ZA().stream().flatMap(zzwo::lambda$getInsertionPointModels$7).toList();
  }
  
  private void Zo() {
    this.ZS.ZP(this.ZY);
    this.ZS.Zc(this.ZY);
    this.ZS.addMouseListener(this.ZY);
    this.ZX.addMouseListener(this.ZY);
  }
  
  private void Zn() {
    this.ZS.ZP((Zzyl)null);
    this.ZS.Zc((Zeq)null);
    this.ZS.removeMouseListener(this.ZY);
    this.ZX.removeMouseListener(this.ZY);
  }
  
  private Zsmh Za(Zsmh paramZsmh, Zgsq paramZgsq) {
    Ztuo ztuo = new Ztuo(paramZgsq);
    paramZsmh.Zh(ztuo);
    return ztuo.ZB();
  }
  
  private static Stream lambda$getInsertionPointModels$7(Zzwo paramZzwo, Zgh_ paramZgh_) {
    Zga zga = (Zga)paramZzwo.Zd(paramZgh_.ZM());
    Zuh.Zb((zga != null), Zqf.Zx);
    return Optional.<Zga>ofNullable(zga).map(paramZgh_::lambda$getInsertionPointModels$6).stream();
  }
  
  private static Zsj0 lambda$getInsertionPointModels$6(Zgh_ paramZgh_, Zga paramZga) {
    return new Zsj0(paramZgh_, paramZga);
  }
  
  private void lambda$open$5(Zbza paramZbza) {
    this.Zb.set(true);
    this.ZI.Zd(paramZbza);
  }
  
  private Boolean lambda$new$4() {
    return Boolean.valueOf(this.Zb.getAndSet(false));
  }
  
  private void lambda$new$3() {
    Objects.requireNonNull(this.ZX);
    SwingUtilities.invokeLater(this.ZX::repaint);
  }
  
  private void lambda$new$2(Zti6 paramZti6, Zbdf paramZbdf, Zbdl paramZbdl, Ztwv paramZtwv, Zbza paramZbza) {
    // Byte code:
    //   0: aload_1
    //   1: aload #5
    //   3: invokeinterface ZgC : ()[B
    //   8: invokevirtual ZV : ([B)V
    //   11: aload_1
    //   12: sipush #-13183
    //   15: sipush #-24046
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokevirtual ZX : (Ljava/lang/String;)V
    //   24: aload_2
    //   25: aload #5
    //   27: invokeinterface ZgV : ()[B
    //   32: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   35: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   38: aload_3
    //   39: ifnull -> 96
    //   42: aload_0
    //   43: getfield Zh : Ljava/util/concurrent/Future;
    //   46: ifnull -> 72
    //   49: aload_0
    //   50: getfield Zh : Ljava/util/concurrent/Future;
    //   53: invokeinterface isDone : ()Z
    //   58: ifne -> 72
    //   61: aload_0
    //   62: getfield Zh : Ljava/util/concurrent/Future;
    //   65: iconst_1
    //   66: invokeinterface cancel : (Z)Z
    //   71: pop
    //   72: aload_3
    //   73: invokevirtual ZC : ()V
    //   76: aload_0
    //   77: aload #4
    //   79: aload_0
    //   80: aload #5
    //   82: aload_3
    //   83: <illegal opcode> run : (Lburp/Zbht;Lburp/Zbza;Lburp/Zbdl;)Ljava/lang/Runnable;
    //   88: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   93: putfield Zh : Ljava/util/concurrent/Future;
    //   96: return
  }
  
  private void lambda$new$1(Zbza paramZbza, Zbdl paramZbdl) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Z_ : (Lburp/Zbza;)Ljava/util/List;
    //   5: astore_3
    //   6: aload_2
    //   7: aload_3
    //   8: aload_1
    //   9: <illegal opcode> run : (Lburp/Zbdl;Ljava/util/List;Lburp/Zbza;)Ljava/lang/Runnable;
    //   14: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   17: return
  }
  
  private static void lambda$new$0(Zbdl paramZbdl, List<Zsj0> paramList, Zbza paramZbza) {
    paramZbdl.Zy(paramList, paramZbza.ZgC());
  }
  
  public static void ZZ(int[] paramArrayOfint) {
    ZM = paramArrayOfint;
  }
  
  public static int[] ZY() {
    return ZM;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '"Ï>ä@?®Ôië\\b6ß%Àu2)`0e>Vf\\fhG:^èÐ,ÛÐç¸üs:ãÌ\\tµ]ùé'úÎØÿ¸@®©¤&7"ÌÃ¿mÔA#¢äÂà2ëË¾*Nhkkÿ¤m&z¨ÔQ$ûUø×¦<ã1Óz|mÀlR!èÓ¹Z¢\\bJxC.{¹ÿE¯=«ËiÜût¥ª\\fDò¬Ù6÷\\nÇÜÿ\\fP;pzì¬K¬ô'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: aconst_null
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZZ : ([I)V
    //   27: bipush #126
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
    //   72: ldc 'ç7*þ©ß×¦í'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #6
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: iconst_1
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
    //   127: goto -> 86
    //   130: aload #5
    //   132: putstatic burp/Zbht.a : [Ljava/lang/String;
    //   135: bipush #11
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zbht.b : [Ljava/lang/String;
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
    //   216: bipush #69
    //   218: goto -> 248
    //   221: bipush #95
    //   223: goto -> 248
    //   226: bipush #26
    //   228: goto -> 248
    //   231: bipush #111
    //   233: goto -> 248
    //   236: bipush #72
    //   238: goto -> 248
    //   241: bipush #68
    //   243: goto -> 248
    //   246: bipush #95
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
    int i = (paramInt1 ^ 0xFFFFCC86) & 0xFFFF;
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
      byte b1 = 71;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbht.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */