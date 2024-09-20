package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.swing.Box;

class Zbdy extends Zbqc {
  private final Zbc9 ZI;
  
  private final Supplier<Zl4w> Zm;
  
  private final Map<Integer, Zmon> ZH;
  
  private final Zbcw ZJ;
  
  private final Zbqc Zi;
  
  private final Zz1m<Zt1j> ZW;
  
  private final boolean ZB;
  
  private volatile Zs_i Zn;
  
  private Zm99 Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbdy(List<Zb00> paramList, Zz1m<Zt1j> paramZz1m, Zs_i paramZs_i, Supplier<Zl4w> paramSupplier, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/GridBagLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: invokestatic ZS : ()I
    //   14: aload_0
    //   15: aload_2
    //   16: putfield ZW : Lburp/Zz1m;
    //   19: aload_0
    //   20: iload #5
    //   22: putfield ZB : Z
    //   25: istore #6
    //   27: iconst_0
    //   28: istore #7
    //   30: aload_3
    //   31: ifnull -> 67
    //   34: iconst_0
    //   35: aload_1
    //   36: invokeinterface size : ()I
    //   41: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   44: aload_1
    //   45: aload_3
    //   46: <illegal opcode> test : (Ljava/util/List;Lburp/Zs_i;)Ljava/util/function/IntPredicate;
    //   51: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   56: invokeinterface findFirst : ()Ljava/util/OptionalInt;
    //   61: iconst_0
    //   62: invokevirtual orElse : (I)I
    //   65: istore #7
    //   67: aload_0
    //   68: aload #4
    //   70: putfield Zm : Ljava/util/function/Supplier;
    //   73: aload_0
    //   74: new java/util/HashMap
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: putfield ZH : Ljava/util/Map;
    //   84: aload_0
    //   85: new burp/Zbcw
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: putfield ZJ : Lburp/Zbcw;
    //   95: aload_0
    //   96: new burp/Zbc9
    //   99: dup
    //   100: aload_1
    //   101: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   106: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   111: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   116: invokeinterface toList : ()Ljava/util/List;
    //   121: invokespecial <init> : (Ljava/util/List;)V
    //   124: putfield ZI : Lburp/Zbc9;
    //   127: aload_0
    //   128: getfield ZI : Lburp/Zbc9;
    //   131: new burp/Zr43
    //   134: dup
    //   135: getstatic burp/Zlkk.COLLAPSIBLE_SIDEBAR_PANEL_SEPARATOR : Lburp/Zlkk;
    //   138: iconst_1
    //   139: new java/awt/Insets
    //   142: dup
    //   143: iconst_0
    //   144: iconst_1
    //   145: iconst_0
    //   146: iconst_0
    //   147: invokespecial <init> : (IIII)V
    //   150: invokespecial <init> : (Lburp/Zlkk;ILjava/awt/Insets;)V
    //   153: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   156: aload_0
    //   157: getfield ZI : Lburp/Zbc9;
    //   160: iload #7
    //   162: invokevirtual Zv : (I)V
    //   165: aload_0
    //   166: invokevirtual Zw : ()V
    //   169: aload_1
    //   170: aload_0
    //   171: <illegal opcode> accept : (Lburp/Zbdy;)Ljava/util/function/Consumer;
    //   176: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   181: aload_0
    //   182: getstatic burp/Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND : Lburp/Zlkk;
    //   185: invokevirtual Zl : (Lburp/Zlkk;)V
    //   188: aload_0
    //   189: new burp/Zbqc
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: putfield Zi : Lburp/Zbqc;
    //   199: aload_0
    //   200: getfield Zi : Lburp/Zbqc;
    //   203: getstatic burp/Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND : Lburp/Zlkk;
    //   206: invokevirtual Zl : (Lburp/Zlkk;)V
    //   209: aload_0
    //   210: getfield Zi : Lburp/Zbqc;
    //   213: new burp/Zrf5
    //   216: dup
    //   217: iconst_0
    //   218: iconst_1
    //   219: iconst_0
    //   220: iconst_0
    //   221: getstatic burp/Zlkk.COLLAPSIBLE_SIDEBAR_PANEL_SEPARATOR : Lburp/Zlkk;
    //   224: invokespecial <init> : (IIIILburp/Zlkk;)V
    //   227: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   230: aload_1
    //   231: iload #7
    //   233: invokeinterface get : (I)Ljava/lang/Object;
    //   238: checkcast burp/Zmon
    //   241: astore #8
    //   243: aload_0
    //   244: aload #8
    //   246: invokeinterface ZsO : ()Lburp/Zs_i;
    //   251: putfield Zn : Lburp/Zs_i;
    //   254: aload_0
    //   255: aload #8
    //   257: invokevirtual Zc : (Lburp/Zmon;)V
    //   260: aload_1
    //   261: aload_0
    //   262: <illegal opcode> accept : (Lburp/Zbdy;)Ljava/util/function/Consumer;
    //   267: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   272: new java/awt/GridBagConstraints
    //   275: dup
    //   276: invokespecial <init> : ()V
    //   279: astore #9
    //   281: aload #9
    //   283: iconst_0
    //   284: putfield gridx : I
    //   287: aload #9
    //   289: iconst_0
    //   290: putfield gridy : I
    //   293: aload #9
    //   295: iconst_2
    //   296: putfield fill : I
    //   299: aload #9
    //   301: bipush #21
    //   303: putfield anchor : I
    //   306: aload #9
    //   308: dconst_1
    //   309: putfield weightx : D
    //   312: aload_0
    //   313: aload_0
    //   314: getfield Zi : Lburp/Zbqc;
    //   317: aload #9
    //   319: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   322: new java/awt/GridBagConstraints
    //   325: dup
    //   326: invokespecial <init> : ()V
    //   329: astore #9
    //   331: aload #9
    //   333: iconst_0
    //   334: putfield gridx : I
    //   337: aload #9
    //   339: iconst_1
    //   340: putfield gridy : I
    //   343: aload #9
    //   345: iconst_2
    //   346: putfield fill : I
    //   349: aload #9
    //   351: bipush #10
    //   353: putfield anchor : I
    //   356: aload #9
    //   358: dconst_0
    //   359: putfield weightx : D
    //   362: aload_0
    //   363: new javax/swing/JSeparator
    //   366: dup
    //   367: invokespecial <init> : ()V
    //   370: aload #9
    //   372: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   375: new burp/Zbqc
    //   378: dup
    //   379: new java/awt/BorderLayout
    //   382: dup
    //   383: invokespecial <init> : ()V
    //   386: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   389: astore #10
    //   391: aload #10
    //   393: getstatic burp/Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND : Lburp/Zlkk;
    //   396: invokevirtual Zl : (Lburp/Zlkk;)V
    //   399: aload #10
    //   401: aload_0
    //   402: getfield ZI : Lburp/Zbc9;
    //   405: sipush #-18319
    //   408: sipush #-16699
    //   411: invokestatic a : (II)Ljava/lang/String;
    //   414: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   417: aload #10
    //   419: sipush #-18313
    //   422: sipush #16781
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: invokevirtual setName : (Ljava/lang/String;)V
    //   431: new java/awt/GridBagConstraints
    //   434: dup
    //   435: invokespecial <init> : ()V
    //   438: astore #9
    //   440: aload #9
    //   442: iconst_0
    //   443: putfield gridx : I
    //   446: aload #9
    //   448: iconst_2
    //   449: putfield gridy : I
    //   452: aload #9
    //   454: iconst_1
    //   455: putfield fill : I
    //   458: aload #9
    //   460: bipush #23
    //   462: putfield anchor : I
    //   465: aload #9
    //   467: dconst_1
    //   468: putfield weighty : D
    //   471: aload_0
    //   472: aload #10
    //   474: aload #9
    //   476: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   479: iload #6
    //   481: ifeq -> 491
    //   484: iconst_4
    //   485: anewarray burp/Zbqc
    //   488: invokestatic Zr : ([Lburp/Zbqc;)V
    //   491: return
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    return new Dimension(Zgdi.ZK(), dimension.height);
  }
  
  private void ZM(Zmon paramZmon) {
    Zmon zmon = this.ZH.get(Integer.valueOf(this.Zn.componentId));
    if (paramZmon.ZE() == zmon.ZE())
      this.Zt.setText(zmon.Zsd()); 
  }
  
  void ZP(Zs_i paramZs_i) {
    Zmon zmon = this.ZH.get(Integer.valueOf(paramZs_i.componentId));
    Zc(zmon);
    this.ZI.ZP(zmon.ZE());
    this.Zn = zmon.ZsO();
  }
  
  boolean ZG(Zs_i paramZs_i) {
    return (paramZs_i == this.Zn);
  }
  
  void ZI(Zrpp paramZrpp) {
    this.ZJ.ZF((paramZrpp == Zrpp.LEFT) ? 0 : 1);
  }
  
  private void Zc(Zmon paramZmon) {
    List<Zm9t> list = paramZmon.ZC();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = Zf(list.size());
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Zi.removeAll();
    this.Zi.setLayout(gridBagLayout);
    this.Zt = new Zm99();
    this.Zt.setName(a(-18315, -3056));
    this.Zt.setText(paramZmon.Zsd());
    this.Zt.ZE(Zt00.TITLE_BOLD_FONT);
    int i = Zs_i.ZS();
    if (paramZmon.ZsC() != null) {
      this.Zt.setIconTextGap(10);
      this.Zt.setIcon(Ze3m.ZC(paramZmon.ZsC(), Zlkk.FOREGROUND).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    } 
    GridBagConstraints gridBagConstraints = ZL(0, 21);
    gridBagConstraints.fill = 3;
    gridBagConstraints.insets = new Insets(10, 10, 10, 0);
    this.Zi.add(this.Zt, gridBagConstraints);
    gridBagConstraints = ZL(2, 21);
    gridBagConstraints.weightx = 1.0D;
    this.Zi.add(Box.createHorizontalGlue(), gridBagConstraints);
    byte b = 4;
    if (this.ZB) {
      gridBagConstraints = ZL(b, 22);
      gridBagConstraints.insets = new Insets(10, 0, 10, 0);
      this.Zi.add(this.ZJ, gridBagConstraints);
      b += 2;
    } 
    for (Component component : list) {
      component.setFocusable(true);
      gridBagConstraints = ZL(b, 22);
      gridBagConstraints.insets = new Insets(10, 0, 10, 0);
      this.Zi.add(component, gridBagConstraints);
      b += 2;
      if (i != 0)
        break; 
    } 
    if (this.Zm != null) {
      gridBagConstraints = ZL(b, 22);
      gridBagConstraints.insets = new Insets(10, 0, 10, 0);
      this.Zi.add(Zrqz.Zw(this.Zm), gridBagConstraints);
      b += 2;
    } 
    if (paramZmon.Zsu() != null) {
      Zm2o zm2o = new Zm2o();
      zm2o.Zi(paramZmon.Zsu());
      gridBagConstraints = ZL(b, 22);
      gridBagConstraints.insets = new Insets(10, 0, 10, 0);
      this.Zi.add(zm2o, gridBagConstraints);
      b += 2;
    } 
    gridBagConstraints = ZL(b, 22);
    gridBagConstraints.insets = new Insets(10, 0, 10, 10);
    this.Zi.add(ZR(), gridBagConstraints);
    EventQueue.invokeLater(this::lambda$populateTopPanel$3);
  }
  
  private Zm9t ZR() {
    Zm9t zm9t = new Zm9t();
    zm9t.Zv(Ze3m.ZC(Zeuf.CLOSE, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(-18316, -111), this::lambda$buildCloseButton$4);
    zm9t.setName(a(-18320, 910));
    zm9t.setFocusable(true);
    zm9t.ZO(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zm9t.ZD(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    return zm9t;
  }
  
  private void Zw() {
    Ze9n ze9n1 = Ze3m.ZC(Zeuf.DOCK_LEFT, Zlkk.COLLAPSIBLE_COMPONENT_DOCK_NORMAL).ZU(Zmcx.LINE_SIZE).ZG(Zlkk.COLLAPSIBLE_COMPONENT_DOCK_HOVER).Zc(Zlkk.COLLAPSIBLE_COMPONENT_DOCK_SELECTED).Zr(Zlkk.COLLAPSIBLE_COMPONENT_DOCK_SELECTED).Z_();
    Zbcm zbcm1 = Zgbp.ZM(ze9n1, this::lambda$populateDockBar$5, a(-18312, -16416));
    zbcm1.setName(a(-18317, 10967));
    zbcm1.setFocusable(true);
    Ze9n ze9n2 = Ze3m.ZC(Zeuf.DOCK_RIGHT, Zlkk.COLLAPSIBLE_COMPONENT_DOCK_NORMAL).ZU(Zmcx.LINE_SIZE).ZG(Zlkk.COLLAPSIBLE_COMPONENT_DOCK_HOVER).Zc(Zlkk.COLLAPSIBLE_COMPONENT_DOCK_SELECTED).Zr(Zlkk.COLLAPSIBLE_COMPONENT_DOCK_SELECTED).Z_();
    Zbcm zbcm2 = Zgbp.ZM(ze9n2, this::lambda$populateDockBar$6, a(-18318, -13892));
    zbcm2.setName(a(-18314, 3409));
    zbcm2.setFocusable(true);
    this.ZJ.Zi(List.of(zbcm1, zbcm2), false, 1);
  }
  
  public Zs_i ZD() {
    return this.Zn;
  }
  
  private static int[] Zf(int paramInt) {
    int j = 9 + 2 * paramInt;
    int[] arrayOfInt = new int[j];
    int i = Zs_i.ZS();
    byte b = 0;
    while (b < j) {
      arrayOfInt[b] = (b % 2 == 0) ? 0 : 10;
      b++;
      if (i != 0)
        break; 
    } 
    return arrayOfInt;
  }
  
  private static GridBagConstraints ZL(int paramInt1, int paramInt2) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = paramInt1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = paramInt2;
    return gridBagConstraints;
  }
  
  private void lambda$populateDockBar$6() {
    this.ZW.ZD(new Zxr8(Zt1j.Zk, Zrpp.RIGHT));
  }
  
  private void lambda$populateDockBar$5() {
    this.ZW.ZD(new Zxr8(Zt1j.Zk, Zrpp.LEFT));
  }
  
  private void lambda$buildCloseButton$4() {
    this.ZW.ZD(new Zxr8(Zt1j.ZK));
  }
  
  private void lambda$populateTopPanel$3() {
    Zmse.ZF(this.Zi);
  }
  
  private void lambda$new$2(Zb00 paramZb00) {
    paramZb00.Zn(this::ZM);
  }
  
  private void lambda$new$1(Zb00 paramZb00) {
    this.ZH.put(Integer.valueOf(paramZb00.ZLR()), paramZb00);
  }
  
  private static boolean lambda$new$0(List<Zb00> paramList, Zs_i paramZs_i, int paramInt) {
    return (((Zb00)paramList.get(paramInt)).ZsO() == paramZs_i);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '`ç¼-þQÍVf\\bUhï9vÙOsl!Ê»m\\ruåë©Ë@#jm¡\$EM¹C­ów·Þ"3-£N*!ÿXFÌ[x¹¢$çìÒôçDÅñ¹|{­"Ì\Õ» ¹ïyöï¦{&íòÜÐÜ#¢Kl7L_¥kQôC(¡L]ÆóixQZQ:ÆW'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #34
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
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
    //   68: ldc '¾í$ûtÝêË\\bcd,ÖÃJ<íÀKi#ÑÓ¬ æ/('
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #117
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
    //   129: putstatic burp/Zbdy.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbdy.b : [Ljava/lang/String;
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
    //   212: bipush #98
    //   214: goto -> 244
    //   217: bipush #13
    //   219: goto -> 244
    //   222: bipush #41
    //   224: goto -> 244
    //   227: bipush #103
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #64
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
    int i = (paramInt1 ^ 0xFFFFB870) & 0xFFFF;
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
      byte b1 = 61;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */