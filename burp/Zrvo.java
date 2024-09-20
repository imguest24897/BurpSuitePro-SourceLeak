package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import net.portswigger.browser.Zci;
import net.portswigger.browser.Zct;
import net.portswigger.browser.Ztf;

public class Zrvo extends Zrh7 {
  private final Zz62 Z_;
  
  private final Ztf9 ZB;
  
  private final Zg96 ZH;
  
  private Zgrn Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrvo(Zz62 paramZz62, Window paramWindow, Ztf9 paramZtf9, Zg96 paramZg96) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.CREDENTIALS_EDITOR : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield Z_ : Lburp/Zz62;
    //   14: invokestatic ZX : ()[Ljava/lang/String;
    //   17: aload_0
    //   18: aload_3
    //   19: putfield ZB : Lburp/Ztf9;
    //   22: aload_0
    //   23: aload #4
    //   25: putfield ZH : Lburp/Zg96;
    //   28: new burp/Zbqc
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #7
    //   37: new java/awt/GridBagLayout
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #8
    //   46: aload #8
    //   48: iconst_1
    //   49: newarray int
    //   51: dup
    //   52: iconst_0
    //   53: iconst_0
    //   54: iastore
    //   55: putfield columnWidths : [I
    //   58: astore #5
    //   60: aload #8
    //   62: iconst_1
    //   63: newarray int
    //   65: dup
    //   66: iconst_0
    //   67: iconst_0
    //   68: iastore
    //   69: putfield rowHeights : [I
    //   72: aload #7
    //   74: aload #8
    //   76: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   79: aload #7
    //   81: new javax/swing/border/EmptyBorder
    //   84: dup
    //   85: iconst_0
    //   86: iconst_0
    //   87: iconst_5
    //   88: iconst_0
    //   89: invokespecial <init> : (IIII)V
    //   92: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   95: aload_0
    //   96: new java/awt/Dimension
    //   99: dup
    //   100: sipush #1280
    //   103: sipush #790
    //   106: invokespecial <init> : (II)V
    //   109: invokevirtual setMinimumSize : (Ljava/awt/Dimension;)V
    //   112: new burp/Zm99
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: astore #9
    //   121: new java/awt/GridBagConstraints
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore #6
    //   130: aload #6
    //   132: iconst_0
    //   133: putfield gridx : I
    //   136: aload #6
    //   138: iconst_0
    //   139: putfield gridy : I
    //   142: aload #6
    //   144: bipush #24
    //   146: putfield anchor : I
    //   149: aload #7
    //   151: aload #9
    //   153: aload #6
    //   155: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   158: aload_0
    //   159: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   162: aload #7
    //   164: sipush #-12172
    //   167: sipush #-17910
    //   170: invokestatic a : (II)Ljava/lang/String;
    //   173: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   176: new burp/Zbqc
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: astore #10
    //   185: aload #10
    //   187: new javax/swing/border/EmptyBorder
    //   190: dup
    //   191: iconst_5
    //   192: bipush #10
    //   194: bipush #10
    //   196: bipush #10
    //   198: invokespecial <init> : (IIII)V
    //   201: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   204: aload #10
    //   206: new java/awt/BorderLayout
    //   209: dup
    //   210: invokespecial <init> : ()V
    //   213: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   216: new burp/Zbqc
    //   219: dup
    //   220: invokespecial <init> : ()V
    //   223: astore #11
    //   225: aload #11
    //   227: new javax/swing/border/EmptyBorder
    //   230: dup
    //   231: iconst_0
    //   232: bipush #15
    //   234: iconst_0
    //   235: iconst_0
    //   236: invokespecial <init> : (IIII)V
    //   239: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   242: aload #11
    //   244: new java/awt/GridLayout
    //   247: dup
    //   248: iconst_1
    //   249: iconst_0
    //   250: bipush #15
    //   252: iconst_0
    //   253: invokespecial <init> : (IIII)V
    //   256: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   259: new burp/Ze01
    //   262: dup
    //   263: sipush #-12179
    //   266: sipush #27291
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: invokespecial <init> : (Ljava/lang/String;)V
    //   275: astore #12
    //   277: aload #12
    //   279: sipush #-12178
    //   282: sipush #-2582
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual setName : (Ljava/lang/String;)V
    //   291: aload #12
    //   293: aload_0
    //   294: <illegal opcode> actionPerformed : (Lburp/Zrvo;)Ljava/awt/event/ActionListener;
    //   299: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   302: aload #12
    //   304: new java/awt/Dimension
    //   307: dup
    //   308: aload_0
    //   309: invokevirtual getWidth : ()I
    //   312: iconst_5
    //   313: idiv
    //   314: aload #12
    //   316: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   319: getfield height : I
    //   322: invokespecial <init> : (II)V
    //   325: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   328: aload #11
    //   330: aload #12
    //   332: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   335: pop
    //   336: aload #10
    //   338: aload #11
    //   340: sipush #-12175
    //   343: sipush #1696
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   352: aload_0
    //   353: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   356: aload #10
    //   358: sipush #-12163
    //   361: sipush #-7174
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   370: ldc ''
    //   372: astore #13
    //   374: aload_0
    //   375: aload #13
    //   377: invokevirtual setTitle : (Ljava/lang/String;)V
    //   380: aload_2
    //   381: ifnonnull -> 403
    //   384: aload_0
    //   385: aconst_null
    //   386: iconst_0
    //   387: iconst_0
    //   388: invokevirtual Zv : (Ljava/awt/Window;II)V
    //   391: aload #5
    //   393: ifnull -> 417
    //   396: goto -> 403
    //   399: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   402: athrow
    //   403: aload_0
    //   404: aload_2
    //   405: iconst_0
    //   406: iconst_0
    //   407: invokevirtual Zl : (Ljava/awt/Window;II)V
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   416: athrow
    //   417: aload_0
    //   418: new burp/Ztcf
    //   421: dup
    //   422: aload_0
    //   423: invokespecial <init> : (Lburp/Zrvo;)V
    //   426: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   429: aload_1
    //   430: ldc2_w 10
    //   433: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   436: invokevirtual get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   439: checkcast burp/Zmle
    //   442: astore #14
    //   444: aload_0
    //   445: aload #14
    //   447: aload #7
    //   449: aload #9
    //   451: <illegal opcode> accept : (Lburp/Zbqc;Lburp/Zm99;)Ljava/util/function/Consumer;
    //   456: invokevirtual Ze : (Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   459: putfield Zb : Lburp/Zgrn;
    //   462: aload_0
    //   463: aload #14
    //   465: invokevirtual ZZ : (Lburp/Zmle;)V
    //   468: goto -> 488
    //   471: astore #14
    //   473: aload #14
    //   475: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   478: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   481: aload_0
    //   482: getstatic net/portswigger/browser/Zci.BROWSER_STARTUP_FAILURE : Lnet/portswigger/browser/Zci;
    //   485: invokevirtual ZY : (Lnet/portswigger/browser/Zci;)V
    //   488: aload_0
    //   489: iconst_1
    //   490: invokevirtual setVisible : (Z)V
    //   493: return
    // Exception table:
    //   from	to	target	type
    //   374	396	399	java/lang/InterruptedException
    //   384	410	413	java/lang/InterruptedException
    //   429	468	471	java/lang/InterruptedException
    //   429	468	471	java/util/concurrent/ExecutionException
    //   429	468	471	java/util/concurrent/TimeoutException
  }
  
  private void ZZ(Zmle paramZmle) {
    this.ZB.ZL(paramZmle, this.ZH, this);
  }
  
  private void ZW() {
    this.ZB.ZY();
    setVisible(false);
    dispose();
    Zrv8.Zk(this.Z_, getOwner(), this.ZB, this.ZH);
  }
  
  public void ZY(Zci paramZci) {
    // Byte code:
    //   0: invokestatic ZX : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: new burp/Zlvz
    //   7: dup
    //   8: aload_0
    //   9: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   12: invokespecial <init> : (Ljava/awt/Window;)V
    //   15: getstatic burp/Zeuf.WARNING : Lburp/Zeuf;
    //   18: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   21: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   24: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   27: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   30: invokevirtual Z_ : ()Lburp/Ze9n;
    //   33: invokevirtual Zs : (Lburp/Ze9n;)Lburp/Zlvz;
    //   36: aload_1
    //   37: invokestatic ZM : (Lnet/portswigger/browser/Zci;)Ljava/lang/String;
    //   40: invokevirtual ZN : (Ljava/lang/String;)Lburp/Zlvz;
    //   43: aload_1
    //   44: invokestatic Zh : (Lnet/portswigger/browser/Zci;)Ljava/lang/String;
    //   47: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlvz;
    //   50: iconst_1
    //   51: anewarray java/lang/String
    //   54: dup
    //   55: iconst_0
    //   56: aload_1
    //   57: invokestatic ZA : (Lnet/portswigger/browser/Zci;)Ljava/lang/String;
    //   60: aastore
    //   61: invokevirtual Z_ : ([Ljava/lang/String;)Lburp/Zlvz;
    //   64: invokevirtual ZS : ()Lburp/Zlvz;
    //   67: new burp/Zztt
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: sipush #-12168
    //   77: sipush #-14597
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual Zr : (Ljava/lang/String;)Lburp/Zztt;
    //   86: iconst_0
    //   87: invokevirtual ZL : (Z)Lburp/Zztt;
    //   90: invokevirtual Zg : ()Lburp/Ztjb;
    //   93: invokevirtual Zx : (Lburp/Ztjb;)Lburp/Zlvz;
    //   96: astore_3
    //   97: aload_1
    //   98: getstatic net/portswigger/browser/Zci.EXCEEDED_MAXIMUM_REQUESTS : Lnet/portswigger/browser/Zci;
    //   101: if_acmpeq -> 111
    //   104: aload_1
    //   105: getstatic net/portswigger/browser/Zci.EXCEEDED_MAXIMUM_RESTARTS : Lnet/portswigger/browser/Zci;
    //   108: if_acmpne -> 146
    //   111: aload_3
    //   112: new burp/Zztt
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: sipush #-12180
    //   122: sipush #8816
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: invokevirtual Zr : (Ljava/lang/String;)Lburp/Zztt;
    //   131: iconst_1
    //   132: invokevirtual ZL : (Z)Lburp/Zztt;
    //   135: invokevirtual Zg : ()Lburp/Ztjb;
    //   138: invokevirtual Zx : (Lburp/Ztjb;)Lburp/Zlvz;
    //   141: pop
    //   142: aload_2
    //   143: ifnull -> 198
    //   146: aload_3
    //   147: new burp/Zztt
    //   150: dup
    //   151: invokespecial <init> : ()V
    //   154: sipush #-12164
    //   157: sipush #-18045
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual Zr : (Ljava/lang/String;)Lburp/Zztt;
    //   166: iconst_1
    //   167: invokevirtual ZL : (Z)Lburp/Zztt;
    //   170: getstatic burp/Zeuf.RESTORE_DEFAULTS : Lburp/Zeuf;
    //   173: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   176: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   179: invokevirtual Z_ : ()Lburp/Ze9n;
    //   182: invokevirtual Zr : (Lburp/Ze9n;)Lburp/Zztt;
    //   185: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   188: invokevirtual Zz : (Lburp/Zlkk;)Lburp/Zztt;
    //   191: invokevirtual Zg : ()Lburp/Ztjb;
    //   194: invokevirtual Zx : (Lburp/Ztjb;)Lburp/Zlvz;
    //   197: pop
    //   198: aload_3
    //   199: invokevirtual Zc : ()Lburp/Zr7j;
    //   202: astore #4
    //   204: aload #4
    //   206: invokevirtual Zj : ()Lburp/Zt3;
    //   209: astore #5
    //   211: aload_0
    //   212: iconst_0
    //   213: invokevirtual setVisible : (Z)V
    //   216: aload_0
    //   217: invokevirtual dispose : ()V
    //   220: aload #5
    //   222: invokevirtual Zu3 : ()Ljava/lang/String;
    //   225: sipush #-12177
    //   228: sipush #-25287
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokevirtual equals : (Ljava/lang/Object;)Z
    //   237: ifeq -> 263
    //   240: aload_0
    //   241: getfield Z_ : Lburp/Zz62;
    //   244: aload_0
    //   245: invokevirtual getOwner : ()Ljava/awt/Window;
    //   248: aload_0
    //   249: getfield ZB : Lburp/Ztf9;
    //   252: aload_0
    //   253: getfield ZH : Lburp/Zg96;
    //   256: invokestatic Zk : (Lburp/Zz62;Ljava/awt/Window;Lburp/Ztf9;Lburp/Zg96;)V
    //   259: aload_2
    //   260: ifnull -> 293
    //   263: aload #5
    //   265: invokevirtual Zu3 : ()Ljava/lang/String;
    //   268: sipush #-12169
    //   271: sipush #-8999
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: invokevirtual equals : (Ljava/lang/Object;)Z
    //   280: ifeq -> 293
    //   283: aload_0
    //   284: getfield ZB : Lburp/Ztf9;
    //   287: aload_0
    //   288: invokeinterface Zl : (Ljava/awt/Component;)V
    //   293: return
  }
  
  public void Zr() {
    String str = "";
    Zr7j zr7j = (new Zlvz(Zt2m.ZF(this))).ZN(a(-12162, 8258)).Z_(new String[] { str }).ZS().Zx(new Ztjb(a(-12165, 3307), true, null, Zlkk.PRIMARY_BUTTON_BACKGROUND)).Zc();
    Zt3 zt3 = zr7j.Zj();
    setVisible(false);
    dispose();
  }
  
  public void dispose() {
    super.dispose();
    if (this.Zb != null)
      this.Zb.ZZ(); 
  }
  
  private static String ZM(Zci paramZci) {
    switch (Ztga.Zi[paramZci.ordinal()]) {
      case 1:
      
      case 2:
      case 3:
      
      case 4:
      case 5:
      
    } 
    return a(-12173, 6035);
  }
  
  private static String Zh(Zci paramZci) {
    switch (Ztga.Zi[paramZci.ordinal()]) {
      case 1:
      
      case 2:
      case 3:
      
      case 4:
      case 5:
      
    } 
    return a(-12174, -25333);
  }
  
  private static String ZA(Zci paramZci) {
    switch (Ztga.Zi[paramZci.ordinal()]) {
      case 1:
      
      case 2:
      case 3:
      
      case 4:
      case 5:
      
      case 6:
      
    } 
    return a(-12176, -32191);
  }
  
  public static void Za(Zz62 paramZz62, Window paramWindow, Ztf9 paramZtf9, Zg96 paramZg96) throws Ztf {
    new Zrvo(paramZz62, paramWindow, paramZtf9, paramZg96);
  }
  
  private static void lambda$new$2(Zbqc paramZbqc, Zm99 paramZm99, Zct paramZct) {
    // Byte code:
    //   0: new javax/swing/ImageIcon
    //   3: dup
    //   4: aload_2
    //   5: aload_0
    //   6: invokevirtual getWidth : ()I
    //   9: aload_0
    //   10: invokevirtual getHeight : ()I
    //   13: invokevirtual Zn : (II)Ljava/awt/Image;
    //   16: invokespecial <init> : (Ljava/awt/Image;)V
    //   19: astore_3
    //   20: aload_1
    //   21: aload_3
    //   22: <illegal opcode> run : (Lburp/Zm99;Ljavax/swing/ImageIcon;)Ljava/lang/Runnable;
    //   27: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   30: return
  }
  
  private static void lambda$new$1(Zm99 paramZm99, ImageIcon paramImageIcon) {
    paramZm99.setIcon(paramImageIcon);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    ZW();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ',Tó2ì¶ÐüÑdüCýÕ*s\\nÅ4~±¡=qTZÐ|ã~ä#ó%A&ùn°ÚÏ mÎ®ínò¨Ú@?Ýìþn«BÿCþG<Æñ=÷Ã÷äBG~ÌÐ¯ Âw\\nVÓQ,æí/½ïótWNæó\\nJvDÅQ³hGif/Ü¥WáUDËs²sýÓ¡ê®8AKUO®Â¿¹ùy.ûè´QÒh\\t  %|¨¶EH1öOif°µügº¦âÁÏ~[.¯¶=ÑÞTê)ç\\n\\b'­r¬ÉT×eIâ(Iôgi¼ùWBE¥ªw³7!çªÔ o\\f#µ¤ÃËO}¡Ò=H>º?Ð3tåOÓ¢»1µ¿]æ¤ï- jS2ÿÈ>00ÇÂ#¾u¸'è'sDéÏå¸\áÐ]úvye¿ñ¸£2³Þ4 Z7|*R¿MÃgP&Ç SÙf|âIúg¨D0Ãf¬¹Ê ¤)c¦­w¯0;@Û#t¼õz/Ûo*14CÞ°0Wb@Î^ânèðHmz»+bUC-9¯¬f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #87
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
    //   68: ldc 'óyÐOPlù=áB^¬ýixÃíx¢EÑ[µ<¬¤>W}ôÁ\\bìjZáÉÓì©\Ò³ÿ %NÔD­sT%¹èåX¸cd\\tJ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #104
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
    //   129: putstatic burp/Zrvo.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrvo.b : [Ljava/lang/String;
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
    //   212: bipush #58
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #43
    //   224: goto -> 244
    //   227: bipush #94
    //   229: goto -> 244
    //   232: bipush #125
    //   234: goto -> 244
    //   237: bipush #104
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
    int i = (paramInt1 ^ 0xFFFFD07C) & 0xFFFF;
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
      byte b1 = 115;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */