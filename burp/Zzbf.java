package burp;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzbf extends Zzb8 {
  private Insets ZZ;
  
  private Rectangle Zy;
  
  private Zxyv Zt;
  
  private Color Z_;
  
  private Ze2f Zd;
  
  private Ze2f ZR;
  
  private boolean Zp;
  
  private boolean Zv;
  
  private boolean ZV;
  
  private int ZM;
  
  private Zlao Zj;
  
  public static final Color ZS;
  
  public static final Color Zf;
  
  private float ZP;
  
  private Zzb0 Ze;
  
  private Timer Zw;
  
  private Zzy ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzbf(Zmgw paramZmgw) {
    super(paramZmgw);
  }
  
  private Zxyv ZG(Point paramPoint) {
    Zxyv zxyv = null;
    this.Zp = false;
    Zmgn zmgn = (Zmgn)this.Zx;
    int i = Zz85.ZT();
    if (zmgn.ZY()) {
      int j = zmgn.viewToModel(paramPoint);
      if (j > -1)
        try {
          int k = zmgn.getLineOfOffset(j);
          Zxam zxam = zmgn.Zm();
          zxyv = zxam.ZY(k);
          try {
            if (zxyv != null) {
              this.Zp = true;
              if (i == 0)
                zxyv = zxam.ZB(j); 
              return zxyv;
            } 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          zxyv = zxam.ZB(j);
        } catch (BadLocationException badLocationException) {
          Zah.Zl(badLocationException, Zk_.UNEXPECTED);
        }  
    } 
    return zxyv;
  }
  
  private boolean Zl() {
    try {
      if (this.Zj != Zlao.ALWAYS) {
        try {
          if (this.ZP > 0.0F);
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public Dimension getPreferredSize() {
    int i = Math.max(this.ZR.getIconWidth(), this.Zd.getIconWidth());
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    boolean bool = (this.Zx != null) ? this.Zx.getHeight() : true;
    return new Dimension(i + 4 + this.ZM, bool);
  }
  
  public boolean Zo() {
    return this.ZV;
  }
  
  void Z_(DocumentEvent paramDocumentEvent) {
    int i = this.Zx.getLineCount();
    try {
      if (i != this.Zm) {
        this.Zm = i;
        repaint();
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  protected void Zc() {
    super.Zc();
    setForeground(ZS);
    ZW(Zf);
    ZB();
    Zx(Zlao.ALWAYS);
    this.ZJ = new Zzy(this, this);
    this.Zy = new Rectangle();
    this.Ze = new Zzb0(this);
    this.Zw = new Timer(16, this.Ze);
    this.Zw.setRepeats(true);
  }
  
  void Zp() {}
  
  protected void paintComponent(Graphics paramGraphics) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zx : Lburp/Zmgw;
    //   8: ifnonnull -> 16
    //   11: return
    //   12: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   15: athrow
    //   16: aload_0
    //   17: aload_1
    //   18: aload_0
    //   19: getfield Zy : Ljava/awt/Rectangle;
    //   22: invokevirtual getClipBounds : (Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   25: putfield Zy : Ljava/awt/Rectangle;
    //   28: aload_0
    //   29: getfield Zy : Ljava/awt/Rectangle;
    //   32: ifnonnull -> 50
    //   35: aload_0
    //   36: aload_0
    //   37: invokevirtual getVisibleRect : ()Ljava/awt/Rectangle;
    //   40: putfield Zy : Ljava/awt/Rectangle;
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: getfield Zy : Ljava/awt/Rectangle;
    //   54: ifnonnull -> 62
    //   57: return
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: invokevirtual getBackground : ()Ljava/awt/Color;
    //   66: astore_3
    //   67: aload_0
    //   68: invokevirtual ZI : ()Lburp/Zsqn;
    //   71: ifnull -> 82
    //   74: aload_0
    //   75: invokevirtual ZI : ()Lburp/Zsqn;
    //   78: invokevirtual getBackground : ()Ljava/awt/Color;
    //   81: astore_3
    //   82: aload_1
    //   83: aload_3
    //   84: invokevirtual setColor : (Ljava/awt/Color;)V
    //   87: aload_1
    //   88: iconst_0
    //   89: aload_0
    //   90: getfield Zy : Ljava/awt/Rectangle;
    //   93: getfield y : I
    //   96: aload_0
    //   97: invokevirtual getWidth : ()I
    //   100: aload_0
    //   101: getfield Zy : Ljava/awt/Rectangle;
    //   104: getfield height : I
    //   107: invokevirtual fillRect : (IIII)V
    //   110: aload_0
    //   111: getfield Zx : Lburp/Zmgw;
    //   114: checkcast burp/Zmgn
    //   117: astore #4
    //   119: aload #4
    //   121: invokevirtual ZY : ()Z
    //   124: ifne -> 132
    //   127: return
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload_0
    //   133: getfield Zx : Lburp/Zmgw;
    //   136: invokevirtual getLineWrap : ()Z
    //   139: ifeq -> 152
    //   142: aload_0
    //   143: aload_1
    //   144: invokevirtual Zo : (Ljava/awt/Graphics;)V
    //   147: return
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: aload_0
    //   154: getfield Zx : Lburp/Zmgw;
    //   157: aload_0
    //   158: getfield ZZ : Ljava/awt/Insets;
    //   161: invokevirtual getInsets : (Ljava/awt/Insets;)Ljava/awt/Insets;
    //   164: putfield ZZ : Ljava/awt/Insets;
    //   167: aload_0
    //   168: getfield Zy : Ljava/awt/Rectangle;
    //   171: getfield y : I
    //   174: aload_0
    //   175: getfield ZZ : Ljava/awt/Insets;
    //   178: getfield top : I
    //   181: if_icmpge -> 232
    //   184: aload_0
    //   185: getfield Zy : Ljava/awt/Rectangle;
    //   188: dup
    //   189: getfield height : I
    //   192: aload_0
    //   193: getfield ZZ : Ljava/awt/Insets;
    //   196: getfield top : I
    //   199: aload_0
    //   200: getfield Zy : Ljava/awt/Rectangle;
    //   203: getfield y : I
    //   206: isub
    //   207: isub
    //   208: putfield height : I
    //   211: aload_0
    //   212: getfield Zy : Ljava/awt/Rectangle;
    //   215: aload_0
    //   216: getfield ZZ : Ljava/awt/Insets;
    //   219: getfield top : I
    //   222: putfield y : I
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: aload_0
    //   233: getfield Zx : Lburp/Zmgw;
    //   236: invokevirtual ZS : ()F
    //   239: f2i
    //   240: istore #5
    //   242: aload_0
    //   243: getfield Zy : Ljava/awt/Rectangle;
    //   246: getfield y : I
    //   249: aload_0
    //   250: getfield ZZ : Ljava/awt/Insets;
    //   253: getfield top : I
    //   256: isub
    //   257: iload #5
    //   259: idiv
    //   260: istore #6
    //   262: iload #6
    //   264: iload #5
    //   266: imul
    //   267: iload #5
    //   269: aload_0
    //   270: getfield Zd : Lburp/Ze2f;
    //   273: invokevirtual getIconHeight : ()I
    //   276: isub
    //   277: iconst_2
    //   278: idiv
    //   279: iadd
    //   280: istore #7
    //   282: iload #7
    //   284: aload_0
    //   285: getfield ZZ : Ljava/awt/Insets;
    //   288: getfield top : I
    //   291: iadd
    //   292: istore #7
    //   294: aload #4
    //   296: invokevirtual Zm : ()Lburp/Zxam;
    //   299: astore #8
    //   301: iload #6
    //   303: aload #8
    //   305: iload #6
    //   307: iconst_1
    //   308: invokeinterface ZZ : (IZ)I
    //   313: iadd
    //   314: istore #6
    //   316: aload_0
    //   317: invokevirtual getWidth : ()I
    //   320: istore #9
    //   322: iload #6
    //   324: istore #10
    //   326: aload_0
    //   327: invokevirtual Zo : ()Z
    //   330: ifeq -> 374
    //   333: aload_0
    //   334: getfield Zt : Lburp/Zxyv;
    //   337: ifnull -> 374
    //   340: goto -> 347
    //   343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   346: athrow
    //   347: aload_0
    //   348: getfield Zt : Lburp/Zxyv;
    //   351: iload #10
    //   353: invokevirtual Zw : (I)Z
    //   356: ifeq -> 374
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   365: athrow
    //   366: iconst_1
    //   367: goto -> 375
    //   370: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   373: athrow
    //   374: iconst_0
    //   375: istore #11
    //   377: iload #7
    //   379: aload_0
    //   380: getfield Zy : Ljava/awt/Rectangle;
    //   383: getfield y : I
    //   386: aload_0
    //   387: getfield Zy : Ljava/awt/Rectangle;
    //   390: getfield height : I
    //   393: iadd
    //   394: if_icmpge -> 757
    //   397: iload #11
    //   399: ifeq -> 492
    //   402: aload_1
    //   403: aload_0
    //   404: invokevirtual getForeground : ()Ljava/awt/Color;
    //   407: invokevirtual setColor : (Ljava/awt/Color;)V
    //   410: iload #9
    //   412: iconst_2
    //   413: idiv
    //   414: istore #12
    //   416: iload #10
    //   418: aload_0
    //   419: getfield Zt : Lburp/Zxyv;
    //   422: invokevirtual Zl : ()I
    //   425: if_icmpne -> 470
    //   428: iload #7
    //   430: iload #5
    //   432: iconst_2
    //   433: idiv
    //   434: iadd
    //   435: istore #13
    //   437: aload_1
    //   438: iload #12
    //   440: iload #7
    //   442: iload #12
    //   444: iload #13
    //   446: invokevirtual drawLine : (IIII)V
    //   449: aload_1
    //   450: iload #12
    //   452: iload #13
    //   454: iload #9
    //   456: iconst_2
    //   457: isub
    //   458: iload #13
    //   460: invokevirtual drawLine : (IIII)V
    //   463: iconst_0
    //   464: istore #11
    //   466: iload_2
    //   467: ifne -> 492
    //   470: aload_1
    //   471: iload #12
    //   473: iload #7
    //   475: iload #12
    //   477: iload #7
    //   479: iload #5
    //   481: iadd
    //   482: invokevirtual drawLine : (IIII)V
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   491: athrow
    //   492: aload #8
    //   494: iload #10
    //   496: invokeinterface ZY : (I)Lburp/Zxyv;
    //   501: astore #12
    //   503: aload #12
    //   505: ifnull -> 743
    //   508: aload #12
    //   510: aload_0
    //   511: getfield Zt : Lburp/Zxyv;
    //   514: if_acmpne -> 603
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   523: athrow
    //   524: aload #12
    //   526: invokevirtual ZF : ()Z
    //   529: ifne -> 584
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   538: athrow
    //   539: aload_0
    //   540: invokevirtual Zo : ()Z
    //   543: istore #11
    //   545: iload #11
    //   547: ifeq -> 584
    //   550: aload_1
    //   551: aload_0
    //   552: invokevirtual getForeground : ()Ljava/awt/Color;
    //   555: invokevirtual setColor : (Ljava/awt/Color;)V
    //   558: iload #9
    //   560: iconst_2
    //   561: idiv
    //   562: istore #13
    //   564: aload_1
    //   565: iload #13
    //   567: iload #7
    //   569: iload #5
    //   571: iconst_2
    //   572: idiv
    //   573: iadd
    //   574: iload #13
    //   576: iload #7
    //   578: iload #5
    //   580: iadd
    //   581: invokevirtual drawLine : (IIII)V
    //   584: aload_0
    //   585: getfield Zp : Z
    //   588: ifeq -> 603
    //   591: aload_0
    //   592: iconst_1
    //   593: putfield Zv : Z
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   602: athrow
    //   603: aload #12
    //   605: invokevirtual ZF : ()Z
    //   608: ifeq -> 696
    //   611: iload #9
    //   613: aload_0
    //   614: getfield Zd : Lburp/Ze2f;
    //   617: invokevirtual getIconWidth : ()I
    //   620: isub
    //   621: iconst_2
    //   622: idiv
    //   623: istore #13
    //   625: aload_0
    //   626: aload_0
    //   627: getfield Zd : Lburp/Ze2f;
    //   630: aload_1
    //   631: iload #13
    //   633: iload #7
    //   635: iconst_1
    //   636: invokevirtual ZI : (Lburp/Ze2f;Ljava/awt/Graphics;IIZ)V
    //   639: aload #12
    //   641: invokevirtual Z_ : ()I
    //   644: istore #14
    //   646: iload #14
    //   648: ifne -> 654
    //   651: goto -> 692
    //   654: iload #10
    //   656: iload #14
    //   658: iadd
    //   659: istore #10
    //   661: aload #8
    //   663: iload #10
    //   665: invokeinterface ZY : (I)Lburp/Zxyv;
    //   670: astore #12
    //   672: aload #12
    //   674: ifnull -> 692
    //   677: aload #12
    //   679: invokevirtual ZF : ()Z
    //   682: ifne -> 639
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   691: athrow
    //   692: iload_2
    //   693: ifne -> 738
    //   696: aload_0
    //   697: invokevirtual Zl : ()Z
    //   700: ifeq -> 738
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   709: athrow
    //   710: iload #9
    //   712: aload_0
    //   713: getfield ZR : Lburp/Ze2f;
    //   716: invokevirtual getIconWidth : ()I
    //   719: isub
    //   720: iconst_2
    //   721: idiv
    //   722: istore #13
    //   724: aload_0
    //   725: aload_0
    //   726: getfield ZR : Lburp/Ze2f;
    //   729: aload_1
    //   730: iload #13
    //   732: iload #7
    //   734: iconst_0
    //   735: invokevirtual ZI : (Lburp/Ze2f;Ljava/awt/Graphics;IIZ)V
    //   738: aload_0
    //   739: iconst_0
    //   740: putfield Zv : Z
    //   743: iinc #10, 1
    //   746: iload #7
    //   748: iload #5
    //   750: iadd
    //   751: istore #7
    //   753: iload_2
    //   754: ifne -> 377
    //   757: return
    // Exception table:
    //   from	to	target	type
    //   4	12	12	java/lang/NullPointerException
    //   16	43	46	java/lang/NullPointerException
    //   50	58	58	java/lang/NullPointerException
    //   119	128	128	java/lang/NullPointerException
    //   132	148	148	java/lang/NullPointerException
    //   152	225	228	java/lang/NullPointerException
    //   326	340	343	java/lang/NullPointerException
    //   333	359	362	java/lang/NullPointerException
    //   347	370	370	java/lang/NullPointerException
    //   466	485	488	java/lang/NullPointerException
    //   503	517	520	java/lang/NullPointerException
    //   508	532	535	java/lang/NullPointerException
    //   584	596	599	java/lang/NullPointerException
    //   672	685	688	java/lang/NullPointerException
    //   692	703	706	java/lang/NullPointerException
  }
  
  private void Zo(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getWidth : ()I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield Zx : Lburp/Zmgw;
    //   9: invokevirtual getUI : ()Ljavax/swing/plaf/TextUI;
    //   12: checkcast burp/Ztf6
    //   15: astore #4
    //   17: aload #4
    //   19: aload_0
    //   20: getfield Zx : Lburp/Zmgw;
    //   23: invokevirtual getRootView : (Ljavax/swing/text/JTextComponent;)Ljavax/swing/text/View;
    //   26: iconst_0
    //   27: invokevirtual getView : (I)Ljavax/swing/text/View;
    //   30: astore #5
    //   32: aload_0
    //   33: getfield Zx : Lburp/Zmgw;
    //   36: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   39: astore #6
    //   41: aload #6
    //   43: invokeinterface getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   48: astore #7
    //   50: invokestatic Zm : ()I
    //   53: aload_0
    //   54: getfield Zx : Lburp/Zmgw;
    //   57: new java/awt/Point
    //   60: dup
    //   61: aload_0
    //   62: getfield Zy : Ljava/awt/Rectangle;
    //   65: getfield x : I
    //   68: aload_0
    //   69: getfield Zy : Ljava/awt/Rectangle;
    //   72: getfield y : I
    //   75: invokespecial <init> : (II)V
    //   78: invokevirtual viewToModel : (Ljava/awt/Point;)I
    //   81: istore #8
    //   83: aload #7
    //   85: iload #8
    //   87: invokeinterface getElementIndex : (I)I
    //   92: istore #9
    //   94: aload_0
    //   95: getfield Zx : Lburp/Zmgw;
    //   98: invokevirtual ZS : ()F
    //   101: f2i
    //   102: istore #10
    //   104: aload_0
    //   105: getfield Zx : Lburp/Zmgw;
    //   108: checkcast burp/Zmgn
    //   111: invokevirtual Zm : ()Lburp/Zxam;
    //   114: astore #11
    //   116: aload #4
    //   118: invokevirtual getVisibleEditorRect : ()Ljava/awt/Rectangle;
    //   121: astore #12
    //   123: aload #5
    //   125: iload #9
    //   127: aload #12
    //   129: invokestatic ZJ : (Ljavax/swing/text/View;ILjava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   132: astore #13
    //   134: aload #13
    //   136: getfield y : I
    //   139: istore #14
    //   141: iload #14
    //   143: iload #10
    //   145: aload_0
    //   146: getfield Zd : Lburp/Ze2f;
    //   149: invokevirtual getIconHeight : ()I
    //   152: isub
    //   153: iconst_2
    //   154: idiv
    //   155: iadd
    //   156: istore #14
    //   158: aload_0
    //   159: getfield Zy : Ljava/awt/Rectangle;
    //   162: getfield y : I
    //   165: aload_0
    //   166: getfield Zy : Ljava/awt/Rectangle;
    //   169: getfield height : I
    //   172: iadd
    //   173: istore #15
    //   175: iload #9
    //   177: istore #16
    //   179: istore_2
    //   180: aload_0
    //   181: invokevirtual Zo : ()Z
    //   184: ifeq -> 228
    //   187: aload_0
    //   188: getfield Zt : Lburp/Zxyv;
    //   191: ifnull -> 228
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_0
    //   202: getfield Zt : Lburp/Zxyv;
    //   205: iload #16
    //   207: invokevirtual Zw : (I)Z
    //   210: ifeq -> 228
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: iconst_1
    //   221: goto -> 229
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: iconst_0
    //   229: istore #17
    //   231: aload #7
    //   233: invokeinterface getElementCount : ()I
    //   238: istore #18
    //   240: iload #14
    //   242: iload #15
    //   244: if_icmpge -> 616
    //   247: iload #16
    //   249: iload #18
    //   251: if_icmpge -> 616
    //   254: aload #5
    //   256: iload #16
    //   258: aload #12
    //   260: invokestatic ZJ : (Ljavax/swing/text/View;ILjava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   263: getfield height : I
    //   266: istore #19
    //   268: iload #17
    //   270: ifeq -> 364
    //   273: aload_1
    //   274: aload_0
    //   275: invokevirtual getForeground : ()Ljava/awt/Color;
    //   278: invokevirtual setColor : (Ljava/awt/Color;)V
    //   281: iload_3
    //   282: iconst_2
    //   283: idiv
    //   284: istore #20
    //   286: iload #16
    //   288: aload_0
    //   289: getfield Zt : Lburp/Zxyv;
    //   292: invokevirtual Zl : ()I
    //   295: if_icmpne -> 342
    //   298: iload #14
    //   300: iload #19
    //   302: iadd
    //   303: iload #10
    //   305: iconst_2
    //   306: idiv
    //   307: isub
    //   308: istore #21
    //   310: aload_1
    //   311: iload #20
    //   313: iload #14
    //   315: iload #20
    //   317: iload #21
    //   319: invokevirtual drawLine : (IIII)V
    //   322: aload_1
    //   323: iload #20
    //   325: iload #21
    //   327: iload_3
    //   328: iconst_2
    //   329: isub
    //   330: iload #21
    //   332: invokevirtual drawLine : (IIII)V
    //   335: iconst_0
    //   336: istore #17
    //   338: iload_2
    //   339: ifeq -> 364
    //   342: aload_1
    //   343: iload #20
    //   345: iload #14
    //   347: iload #20
    //   349: iload #14
    //   351: iload #19
    //   353: iadd
    //   354: invokevirtual drawLine : (IIII)V
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   363: athrow
    //   364: aload #11
    //   366: iload #16
    //   368: invokeinterface ZY : (I)Lburp/Zxyv;
    //   373: astore #20
    //   375: aload #20
    //   377: ifnull -> 602
    //   380: aload #20
    //   382: aload_0
    //   383: getfield Zt : Lburp/Zxyv;
    //   386: if_acmpne -> 474
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   395: athrow
    //   396: aload #20
    //   398: invokevirtual ZF : ()Z
    //   401: ifne -> 455
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   410: athrow
    //   411: aload_0
    //   412: invokevirtual Zo : ()Z
    //   415: istore #17
    //   417: iload #17
    //   419: ifeq -> 455
    //   422: aload_1
    //   423: aload_0
    //   424: invokevirtual getForeground : ()Ljava/awt/Color;
    //   427: invokevirtual setColor : (Ljava/awt/Color;)V
    //   430: iload_3
    //   431: iconst_2
    //   432: idiv
    //   433: istore #21
    //   435: aload_1
    //   436: iload #21
    //   438: iload #14
    //   440: iload #10
    //   442: iconst_2
    //   443: idiv
    //   444: iadd
    //   445: iload #21
    //   447: iload #14
    //   449: iload #19
    //   451: iadd
    //   452: invokevirtual drawLine : (IIII)V
    //   455: aload_0
    //   456: getfield Zp : Z
    //   459: ifeq -> 474
    //   462: aload_0
    //   463: iconst_1
    //   464: putfield Zv : Z
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   473: athrow
    //   474: aload #20
    //   476: invokevirtual ZF : ()Z
    //   479: ifeq -> 542
    //   482: iload_3
    //   483: aload_0
    //   484: getfield Zd : Lburp/Ze2f;
    //   487: invokevirtual getIconWidth : ()I
    //   490: isub
    //   491: iconst_2
    //   492: idiv
    //   493: istore #21
    //   495: aload_0
    //   496: aload_0
    //   497: getfield Zd : Lburp/Ze2f;
    //   500: aload_1
    //   501: iload #21
    //   503: iload #14
    //   505: iconst_1
    //   506: invokevirtual ZI : (Lburp/Ze2f;Ljava/awt/Graphics;IIZ)V
    //   509: iload #14
    //   511: aload #5
    //   513: iload #16
    //   515: aload #12
    //   517: invokestatic ZJ : (Ljavax/swing/text/View;ILjava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   520: getfield height : I
    //   523: iadd
    //   524: istore #14
    //   526: iload #16
    //   528: aload #20
    //   530: invokevirtual Z_ : ()I
    //   533: iconst_1
    //   534: iadd
    //   535: iadd
    //   536: istore #16
    //   538: iload_2
    //   539: ifeq -> 593
    //   542: aload_0
    //   543: invokevirtual Zl : ()Z
    //   546: ifeq -> 583
    //   549: goto -> 556
    //   552: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   555: athrow
    //   556: iload_3
    //   557: aload_0
    //   558: getfield ZR : Lburp/Ze2f;
    //   561: invokevirtual getIconWidth : ()I
    //   564: isub
    //   565: iconst_2
    //   566: idiv
    //   567: istore #21
    //   569: aload_0
    //   570: aload_0
    //   571: getfield ZR : Lburp/Ze2f;
    //   574: aload_1
    //   575: iload #21
    //   577: iload #14
    //   579: iconst_0
    //   580: invokevirtual ZI : (Lburp/Ze2f;Ljava/awt/Graphics;IIZ)V
    //   583: iload #14
    //   585: iload #19
    //   587: iadd
    //   588: istore #14
    //   590: iinc #16, 1
    //   593: aload_0
    //   594: iconst_0
    //   595: putfield Zv : Z
    //   598: iload_2
    //   599: ifeq -> 612
    //   602: iload #14
    //   604: iload #19
    //   606: iadd
    //   607: istore #14
    //   609: iinc #16, 1
    //   612: iload_2
    //   613: ifeq -> 240
    //   616: return
    // Exception table:
    //   from	to	target	type
    //   180	194	197	java/lang/NullPointerException
    //   187	213	216	java/lang/NullPointerException
    //   201	224	224	java/lang/NullPointerException
    //   338	357	360	java/lang/NullPointerException
    //   375	389	392	java/lang/NullPointerException
    //   380	404	407	java/lang/NullPointerException
    //   455	467	470	java/lang/NullPointerException
    //   538	549	552	java/lang/NullPointerException
  }
  
  private void ZI(Ze2f paramZe2f, Graphics paramGraphics, int paramInt1, int paramInt2, boolean paramBoolean) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    Composite composite = graphics2D.getComposite();
    try {
      if (!paramBoolean) {
        try {
          if (this.ZP == 0.0F)
            return; 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        AlphaComposite alphaComposite = AlphaComposite.getInstance(3, this.ZP);
        graphics2D.setComposite(alphaComposite);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      paramZe2f.Zw(this.Zv);
      paramZe2f.paintIcon(this, paramGraphics, paramInt1, paramInt2);
    } finally {
      try {
        if (!paramBoolean)
          graphics2D.setComposite(composite); 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } 
  }
  
  private int ZW(Point paramPoint) {
    try {
      int i = this.Zx.viewToModel(paramPoint);
      if (i > -1)
        return this.Zx.getLineOfOffset(i); 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    return 0;
  }
  
  private void ZQ(float paramFloat) {
    paramFloat = Math.max(0.0F, Math.min(paramFloat, 1.0F));
    try {
      if (paramFloat != this.ZP) {
        this.ZP = paramFloat;
        repaint();
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  private void Zx(Zlao paramZlao) {
    try {
      if (paramZlao == null)
        throw new NullPointerException(a(-24584, -3636)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.Zj = paramZlao;
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.ZP = (paramZlao == Zlao.ALWAYS) ? 1.0F : 0.0F;
  }
  
  public void ZW(Color paramColor) {
    this.Z_ = paramColor;
    repaint();
  }
  
  public void Zf(Ze2f paramZe2f1, Ze2f paramZe2f2) {
    this.Zd = paramZe2f1;
    this.ZR = paramZe2f2;
    revalidate();
    repaint();
  }
  
  public void Zn(boolean paramBoolean) {
    try {
      if (paramBoolean != this.ZV) {
        this.ZV = paramBoolean;
        repaint();
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  private void ZB() {
    Zf(new Ze2j(true), new Ze2j(false));
    Zn(false);
  }
  
  public void ZQ(Zmgw paramZmgw) {
    try {
      if (this.Zx != null)
        this.Zx.removePropertyChangeListener(a(-24582, 19606), this.ZJ); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      super.ZQ(paramZmgw);
      if (this.Zx != null)
        this.Zx.addPropertyChangeListener(a(-24583, -13824), this.ZJ); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ç¡¦9ËLdG_ÞyµzRp¦'îN3n/'­*ðÕø¢Õ&Ç*_\\fÉY¦aÆÊ}ä'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #23
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #93
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zzbf.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zzbf.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 176
    //   152: bipush #87
    //   154: goto -> 183
    //   157: bipush #107
    //   159: goto -> 183
    //   162: bipush #45
    //   164: goto -> 183
    //   167: bipush #13
    //   169: goto -> 183
    //   172: iconst_4
    //   173: goto -> 183
    //   176: bipush #20
    //   178: goto -> 183
    //   181: bipush #24
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: getstatic java/awt/Color.GRAY : Ljava/awt/Color;
    //   229: putstatic burp/Zzbf.ZS : Ljava/awt/Color;
    //   232: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   235: putstatic burp/Zzbf.Zf : Ljava/awt/Color;
    //   238: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9FF8) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */