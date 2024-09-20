package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

class Zlr7 {
  private final Zbup Zq;
  
  private final List<Zlnf> ZL;
  
  private Zgzq ZV;
  
  private String Zl;
  
  private String ZM;
  
  private Zlar ZK;
  
  private Ze8f Zk;
  
  private Zlkk ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zlr7(Zbup paramZbup) {
    this.Zq = paramZbup;
    this.ZL = new ArrayList<>();
  }
  
  Zlr7 ZR(Zgzq paramZgzq) {
    this.ZV = paramZgzq;
    return this;
  }
  
  Zlr7 ZB(String paramString) {
    this.Zl = paramString;
    return this;
  }
  
  Zlr7 ZO(String paramString) {
    this.ZM = paramString;
    return this;
  }
  
  Zlr7 ZO(Zlar paramZlar) {
    this.ZK = paramZlar;
    return this;
  }
  
  Zlr7 ZI(List<Zlnf> paramList) {
    this.ZL.addAll(paramList);
    return this;
  }
  
  Zlr7 ZU(Ze8f paramZe8f) {
    this.Zk = paramZe8f;
    return this;
  }
  
  Zlr7 Z_(Zlkk paramZlkk) {
    this.ZA = paramZlkk;
    return this;
  }
  
  Component Zu() {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZV : Lburp/Zgzq;
    //   8: ifnull -> 15
    //   11: iconst_1
    //   12: goto -> 16
    //   15: iconst_0
    //   16: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   19: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   22: aload_0
    //   23: getfield ZM : Ljava/lang/String;
    //   26: ifnull -> 33
    //   29: iconst_1
    //   30: goto -> 34
    //   33: iconst_0
    //   34: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   37: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   40: new java/awt/GridBagLayout
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore_2
    //   48: aload_2
    //   49: iconst_1
    //   50: newarray int
    //   52: dup
    //   53: iconst_0
    //   54: iconst_0
    //   55: iastore
    //   56: putfield columnWidths : [I
    //   59: aload_2
    //   60: aload_0
    //   61: invokevirtual ZX : ()[I
    //   64: putfield rowHeights : [I
    //   67: new burp/Zbdp
    //   70: dup
    //   71: aload_2
    //   72: aload_0
    //   73: getfield Zq : Lburp/Zbup;
    //   76: invokespecial <init> : (Ljava/awt/LayoutManager;Lburp/Zbup;)V
    //   79: astore_3
    //   80: aload_3
    //   81: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   84: invokevirtual Zl : (Lburp/Zlkk;)V
    //   87: aload_3
    //   88: new javax/swing/border/EmptyBorder
    //   91: dup
    //   92: bipush #10
    //   94: bipush #10
    //   96: bipush #10
    //   98: bipush #10
    //   100: invokespecial <init> : (IIII)V
    //   103: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   106: iconst_0
    //   107: istore #4
    //   109: new java/awt/GridBagConstraints
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: astore #5
    //   118: aload #5
    //   120: iconst_0
    //   121: putfield gridx : I
    //   124: aload #5
    //   126: iload #4
    //   128: iinc #4, 1
    //   131: putfield gridy : I
    //   134: aload_3
    //   135: new burp/Zm99
    //   138: dup
    //   139: aload_0
    //   140: getfield ZV : Lburp/Zgzq;
    //   143: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   146: invokespecial <init> : (Ljavax/swing/Icon;)V
    //   149: aload #5
    //   151: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   154: aconst_null
    //   155: astore #6
    //   157: aload_0
    //   158: getfield Zl : Ljava/lang/String;
    //   161: ifnull -> 311
    //   164: new burp/Zx0x
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: astore #6
    //   173: aload #6
    //   175: iconst_0
    //   176: invokevirtual setEditable : (Z)V
    //   179: aload #6
    //   181: new burp/Zmjt
    //   184: dup
    //   185: invokespecial <init> : ()V
    //   188: invokevirtual setCaret : (Ljavax/swing/text/Caret;)V
    //   191: aload #6
    //   193: getstatic burp/Zxt_.Zb : Ljavax/swing/border/Border;
    //   196: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   199: aload #6
    //   201: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   204: invokevirtual Zx : (Lburp/Zlkk;)V
    //   207: aload #6
    //   209: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   212: invokevirtual Ze : (Lburp/Zlkk;)V
    //   215: aload #6
    //   217: getstatic burp/Zt00.TITLE_FONT_LARGE : Lburp/Zt00;
    //   220: invokevirtual ZN : (Lburp/Zt00;)V
    //   223: aload #6
    //   225: sipush #-31390
    //   228: sipush #-26434
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokevirtual setContentType : (Ljava/lang/String;)V
    //   237: aload #6
    //   239: aload_0
    //   240: getfield Zl : Ljava/lang/String;
    //   243: sipush #-31387
    //   246: sipush #-2316
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: swap
    //   253: sipush #-31385
    //   256: sipush #-29526
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   267: invokevirtual setText : (Ljava/lang/String;)V
    //   270: new java/awt/GridBagConstraints
    //   273: dup
    //   274: invokespecial <init> : ()V
    //   277: astore #5
    //   279: aload #5
    //   281: iconst_0
    //   282: putfield gridx : I
    //   285: aload #5
    //   287: iconst_2
    //   288: iload #4
    //   290: iinc #4, 1
    //   293: imul
    //   294: putfield gridy : I
    //   297: aload #5
    //   299: iconst_2
    //   300: putfield fill : I
    //   303: aload_3
    //   304: aload #6
    //   306: aload #5
    //   308: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   311: new burp/Zx0x
    //   314: dup
    //   315: invokespecial <init> : ()V
    //   318: astore #7
    //   320: aload #7
    //   322: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   325: invokevirtual Zx : (Lburp/Zlkk;)V
    //   328: aload #7
    //   330: iconst_0
    //   331: invokevirtual setEditable : (Z)V
    //   334: aload #7
    //   336: new burp/Zmjt
    //   339: dup
    //   340: invokespecial <init> : ()V
    //   343: invokevirtual setCaret : (Ljavax/swing/text/Caret;)V
    //   346: aload #7
    //   348: getstatic burp/Zxt_.Zb : Ljavax/swing/border/Border;
    //   351: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   354: aload #7
    //   356: sipush #-31391
    //   359: sipush #-18584
    //   362: invokestatic a : (II)Ljava/lang/String;
    //   365: invokevirtual setContentType : (Ljava/lang/String;)V
    //   368: aload #7
    //   370: sipush #-31392
    //   373: sipush #11584
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   382: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   385: aload #7
    //   387: aload_0
    //   388: getfield ZM : Ljava/lang/String;
    //   391: sipush #-31389
    //   394: sipush #-23484
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: swap
    //   401: sipush #-31384
    //   404: sipush #24856
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   415: invokevirtual setText : (Ljava/lang/String;)V
    //   418: new java/awt/GridBagConstraints
    //   421: dup
    //   422: invokespecial <init> : ()V
    //   425: astore #5
    //   427: aload #5
    //   429: iconst_0
    //   430: putfield gridx : I
    //   433: aload #5
    //   435: iconst_2
    //   436: iload #4
    //   438: iinc #4, 1
    //   441: imul
    //   442: putfield gridy : I
    //   445: aload #5
    //   447: dconst_1
    //   448: putfield weightx : D
    //   451: aload #5
    //   453: iconst_2
    //   454: putfield fill : I
    //   457: aload_3
    //   458: aload #7
    //   460: aload #5
    //   462: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   465: aload_0
    //   466: invokevirtual Zo : ()Z
    //   469: ifeq -> 805
    //   472: new burp/Zbqc
    //   475: dup
    //   476: new java/awt/GridLayout
    //   479: dup
    //   480: iconst_1
    //   481: iconst_0
    //   482: bipush #20
    //   484: iconst_0
    //   485: invokespecial <init> : (IIII)V
    //   488: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   491: astore #8
    //   493: new java/awt/GridBagConstraints
    //   496: dup
    //   497: invokespecial <init> : ()V
    //   500: astore #5
    //   502: aload #5
    //   504: iconst_0
    //   505: putfield gridx : I
    //   508: aload #5
    //   510: iconst_2
    //   511: iload #4
    //   513: iinc #4, 1
    //   516: imul
    //   517: putfield gridy : I
    //   520: aload_3
    //   521: aload #8
    //   523: aload #5
    //   525: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   528: aload_0
    //   529: getfield ZK : Lburp/Zlar;
    //   532: ifnull -> 573
    //   535: new burp/Ze01
    //   538: dup
    //   539: sipush #-31383
    //   542: sipush #-31186
    //   545: invokestatic a : (II)Ljava/lang/String;
    //   548: invokespecial <init> : (Ljava/lang/String;)V
    //   551: astore #9
    //   553: aload #9
    //   555: aload_0
    //   556: aload_3
    //   557: <illegal opcode> actionPerformed : (Lburp/Zlr7;Lburp/Zbqc;)Ljava/awt/event/ActionListener;
    //   562: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   565: aload #8
    //   567: aload #9
    //   569: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   572: pop
    //   573: aload_0
    //   574: getfield ZL : Ljava/util/List;
    //   577: invokeinterface iterator : ()Ljava/util/Iterator;
    //   582: astore #9
    //   584: aload #9
    //   586: invokeinterface hasNext : ()Z
    //   591: ifeq -> 805
    //   594: aload #9
    //   596: invokeinterface next : ()Ljava/lang/Object;
    //   601: checkcast burp/Zlnf
    //   604: astore #10
    //   606: aload #10
    //   608: invokevirtual ZWA : ()Ljava/lang/String;
    //   611: ifnull -> 618
    //   614: iconst_1
    //   615: goto -> 619
    //   618: iconst_0
    //   619: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   622: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   625: aload #10
    //   627: invokevirtual ZWO : ()Ljava/lang/Runnable;
    //   630: ifnull -> 637
    //   633: iconst_1
    //   634: goto -> 638
    //   637: iconst_0
    //   638: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   641: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   644: aload #10
    //   646: getfield Zv : Z
    //   649: ifeq -> 667
    //   652: new burp/Ze01
    //   655: dup
    //   656: aload #10
    //   658: invokevirtual ZWA : ()Ljava/lang/String;
    //   661: invokespecial <init> : (Ljava/lang/String;)V
    //   664: goto -> 679
    //   667: new burp/Ze0q
    //   670: dup
    //   671: aload #10
    //   673: invokevirtual ZWA : ()Ljava/lang/String;
    //   676: invokespecial <init> : (Ljava/lang/String;)V
    //   679: astore #11
    //   681: aload #11
    //   683: sipush #-31386
    //   686: sipush #-15701
    //   689: invokestatic a : (II)Ljava/lang/String;
    //   692: invokevirtual setName : (Ljava/lang/String;)V
    //   695: aload #10
    //   697: invokevirtual ZWW : ()Lburp/Zxpj;
    //   700: ifnull -> 723
    //   703: aload #11
    //   705: aload #10
    //   707: invokevirtual ZWW : ()Lburp/Zxpj;
    //   710: invokestatic ZK : (Lburp/Zxpj;)Ljavax/swing/ImageIcon;
    //   713: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   716: aload #11
    //   718: bipush #10
    //   720: invokevirtual setIconTextGap : (I)V
    //   723: aload #10
    //   725: invokevirtual ZWE : ()Ljava/lang/String;
    //   728: ifnull -> 741
    //   731: aload #11
    //   733: aload #10
    //   735: invokevirtual ZWE : ()Ljava/lang/String;
    //   738: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   741: aload #10
    //   743: invokevirtual ZWB : ()Z
    //   746: ifeq -> 781
    //   749: aload #11
    //   751: iconst_0
    //   752: invokevirtual setEnabled : (Z)V
    //   755: aload #11
    //   757: new burp/Zk7d
    //   760: dup
    //   761: aload_0
    //   762: aload #10
    //   764: invokespecial <init> : (Lburp/Zlr7;Lburp/Zlnf;)V
    //   767: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   770: iload_1
    //   771: ifne -> 793
    //   774: iconst_3
    //   775: anewarray burp/Zbqc
    //   778: invokestatic Zr : ([Lburp/Zbqc;)V
    //   781: aload #11
    //   783: aload #10
    //   785: <illegal opcode> actionPerformed : (Lburp/Zlnf;)Ljava/awt/event/ActionListener;
    //   790: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   793: aload #8
    //   795: aload #11
    //   797: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   800: pop
    //   801: iload_1
    //   802: ifne -> 584
    //   805: aload_0
    //   806: getfield Zk : Lburp/Ze8f;
    //   809: ifnull -> 849
    //   812: new java/awt/GridBagConstraints
    //   815: dup
    //   816: invokespecial <init> : ()V
    //   819: astore #5
    //   821: aload #5
    //   823: iconst_0
    //   824: putfield gridx : I
    //   827: aload #5
    //   829: iconst_2
    //   830: iload #4
    //   832: imul
    //   833: putfield gridy : I
    //   836: aload_3
    //   837: aload_0
    //   838: getfield Zk : Lburp/Ze8f;
    //   841: invokestatic Zm : (Lburp/Ze8f;)Ljava/awt/Component;
    //   844: aload #5
    //   846: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   849: aload_0
    //   850: getfield ZA : Lburp/Zlkk;
    //   853: ifnull -> 887
    //   856: aload_3
    //   857: aload_0
    //   858: getfield ZA : Lburp/Zlkk;
    //   861: invokevirtual Zl : (Lburp/Zlkk;)V
    //   864: aload #7
    //   866: aload_0
    //   867: getfield ZA : Lburp/Zlkk;
    //   870: invokevirtual Zx : (Lburp/Zlkk;)V
    //   873: aload #6
    //   875: ifnull -> 887
    //   878: aload #6
    //   880: aload_0
    //   881: getfield ZA : Lburp/Zlkk;
    //   884: invokevirtual Zx : (Lburp/Zlkk;)V
    //   887: aload_3
    //   888: areturn
  }
  
  private int[] ZX() {
    boolean bool = Zltn.ZR();
    byte b1 = 2;
    if (this.Zl != null)
      b1++; 
    if (Zo())
      b1++; 
    if (this.Zk != null)
      b1++; 
    int i = b1 * 2 - 1;
    int[] arrayOfInt = new int[i];
    byte b2 = 0;
    while (b2 < i) {
      arrayOfInt[b2] = (b2 % 2 == 0) ? 0 : 30;
      b2++;
      if (!bool)
        break; 
    } 
    return arrayOfInt;
  }
  
  private boolean Zo() {
    return (this.ZK != null || !this.ZL.isEmpty());
  }
  
  static Zlr7 Zy(Zbup paramZbup) {
    return new Zlr7(paramZbup);
  }
  
  private static Component Zm(Ze8f paramZe8f) {
    Zm99 zm99 = new Zm99(a(-31388, -26435));
    zm99.Ze(Zlkk.LINK_FOREGROUND_1);
    zm99.addMouseListener(new Zb36(paramZe8f, zm99));
    return zm99;
  }
  
  private static void lambda$build$1(Zlnf paramZlnf, ActionEvent paramActionEvent) {
    paramZlnf.ZWO().run();
  }
  
  private void lambda$build$0(Zbqc paramZbqc, ActionEvent paramActionEvent) {
    this.ZK.ZZ(paramZbqc);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '[c;*\\nN"ø¥v6ûÄiÜè\\bC06 g?§§uÐúò¯d?uUégmxÆ%gAd)äëGv [+àOÑÂ¬P\\t @öXfÞñ¼r¸O&zÕbB;{ovÔ¬Õf\\têbr@à:Ñ2ÔîØ¢Y'öX®0G¾+b¶¾úÝñØ|®7Aí/±æ¯ü÷OHÈ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #67
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
    //   68: ldc 'âü²ÖÁÕR7©Í0e0§0ó¯¶ñ:y®Afû{¾'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #113
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
    //   129: putstatic burp/Zlr7.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlr7.b : [Ljava/lang/String;
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
    //   212: bipush #88
    //   214: goto -> 244
    //   217: bipush #79
    //   219: goto -> 244
    //   222: bipush #80
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #63
    //   234: goto -> 244
    //   237: bipush #49
    //   239: goto -> 244
    //   242: bipush #121
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
    int i = (paramInt1 ^ 0xFFFF8561) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlr7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */