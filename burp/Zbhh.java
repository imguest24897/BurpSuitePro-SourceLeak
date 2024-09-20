package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Collections;
import java.util.List;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public abstract class Zbhh extends Zbqc {
  private static final Ze9n Za;
  
  private static final Ze9n Zm;
  
  private static final Ze9n ZP;
  
  private static final Ze9n Zc;
  
  private static final Ze9n ZN;
  
  protected final Zz6v ZD;
  
  protected final Ztj1 Zw;
  
  protected final Zm6x ZK;
  
  private final Zlfb ZW;
  
  private final List<Component> ZQ;
  
  private final Zm99 ZF;
  
  private final Zm9t ZG;
  
  private final List<Zsm8> ZJ;
  
  private final Zxer Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zbhh(Ztj1 paramZtj1, Zlfb paramZlfb, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zw : Lburp/Ztj1;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield ZK : Lburp/Zm6x;
    //   14: aload_0
    //   15: new burp/Zz6v
    //   18: dup
    //   19: aload_0
    //   20: invokespecial <init> : (Lburp/Zbhh;)V
    //   23: putfield ZD : Lburp/Zz6v;
    //   26: aload_0
    //   27: aload_2
    //   28: putfield ZW : Lburp/Zlfb;
    //   31: aload_0
    //   32: new java/util/ArrayList
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: putfield ZQ : Ljava/util/List;
    //   42: invokestatic Zv : ()Z
    //   45: aload_0
    //   46: new java/awt/BorderLayout
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   56: aload_0
    //   57: getstatic burp/Zxt_.Zb : Ljavax/swing/border/Border;
    //   60: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   63: new burp/Zbqc
    //   66: dup
    //   67: new java/awt/GridBagLayout
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   77: astore #5
    //   79: aload #5
    //   81: new javax/swing/border/EmptyBorder
    //   84: dup
    //   85: bipush #20
    //   87: bipush #20
    //   89: bipush #30
    //   91: bipush #20
    //   93: invokespecial <init> : (IIII)V
    //   96: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   99: new burp/Zbqc
    //   102: dup
    //   103: new java/awt/BorderLayout
    //   106: dup
    //   107: bipush #10
    //   109: iconst_0
    //   110: invokespecial <init> : (II)V
    //   113: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   116: astore #6
    //   118: aload_0
    //   119: new burp/Zm99
    //   122: dup
    //   123: aload_1
    //   124: invokevirtual ZO : ()Ljava/lang/String;
    //   127: getstatic burp/Zbhh.Za : Lburp/Ze9n;
    //   130: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   133: putfield ZF : Lburp/Zm99;
    //   136: aload_0
    //   137: getfield ZF : Lburp/Zm99;
    //   140: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   143: invokevirtual ZE : (Lburp/Zt00;)V
    //   146: aload_0
    //   147: getfield ZF : Lburp/Zm99;
    //   150: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   153: invokevirtual Ze : (Lburp/Zlkk;)V
    //   156: aload_0
    //   157: getfield ZF : Lburp/Zm99;
    //   160: bipush #20
    //   162: invokevirtual setIconTextGap : (I)V
    //   165: aload #6
    //   167: aload_0
    //   168: getfield ZF : Lburp/Zm99;
    //   171: sipush #-22135
    //   174: sipush #-3485
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   183: new burp/Zm9t
    //   186: dup
    //   187: invokespecial <init> : ()V
    //   190: astore #7
    //   192: aload #7
    //   194: getstatic burp/Zbhh.Zm : Lburp/Ze9n;
    //   197: sipush #-22133
    //   200: sipush #2117
    //   203: invokestatic a : (II)Ljava/lang/String;
    //   206: aload_0
    //   207: aload_1
    //   208: <illegal opcode> run : (Lburp/Zbhh;Lburp/Ztj1;)Ljava/lang/Runnable;
    //   213: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   216: aload #7
    //   218: iconst_0
    //   219: invokevirtual setVisible : (Z)V
    //   222: aload #6
    //   224: aload #7
    //   226: sipush #-22140
    //   229: sipush #-6793
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   238: new burp/Zbsa
    //   241: dup
    //   242: aload_0
    //   243: aload #7
    //   245: invokespecial <init> : (Lburp/Zbhh;Lburp/Zm9t;)V
    //   248: astore #8
    //   250: aload #6
    //   252: aload #8
    //   254: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   257: aload_0
    //   258: getfield ZF : Lburp/Zm99;
    //   261: aload #8
    //   263: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   266: istore #4
    //   268: aload #7
    //   270: aload #8
    //   272: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   275: new java/awt/GridBagConstraints
    //   278: dup
    //   279: invokespecial <init> : ()V
    //   282: astore #9
    //   284: aload #9
    //   286: iconst_0
    //   287: putfield gridx : I
    //   290: aload #9
    //   292: iconst_0
    //   293: putfield gridy : I
    //   296: aload #9
    //   298: dconst_1
    //   299: putfield weightx : D
    //   302: aload #9
    //   304: bipush #23
    //   306: putfield anchor : I
    //   309: aload #5
    //   311: aload #6
    //   313: aload #9
    //   315: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   318: new burp/Zbqc
    //   321: dup
    //   322: invokespecial <init> : ()V
    //   325: astore #10
    //   327: aload #10
    //   329: new javax/swing/BoxLayout
    //   332: dup
    //   333: aload #10
    //   335: iconst_0
    //   336: invokespecial <init> : (Ljava/awt/Container;I)V
    //   339: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   342: aload_0
    //   343: aload_0
    //   344: invokevirtual ZE : ()Ljava/util/List;
    //   347: putfield ZJ : Ljava/util/List;
    //   350: aload_0
    //   351: getfield ZJ : Ljava/util/List;
    //   354: invokeinterface iterator : ()Ljava/util/Iterator;
    //   359: astore #11
    //   361: aload #11
    //   363: invokeinterface hasNext : ()Z
    //   368: ifeq -> 417
    //   371: aload #11
    //   373: invokeinterface next : ()Ljava/lang/Object;
    //   378: checkcast burp/Zsm8
    //   381: astore #12
    //   383: aload #10
    //   385: aload #12
    //   387: invokevirtual ZK : ()Lburp/Ze01;
    //   390: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   393: pop
    //   394: aload #10
    //   396: bipush #10
    //   398: invokestatic createHorizontalStrut : (I)Ljava/awt/Component;
    //   401: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   404: pop
    //   405: iload #4
    //   407: ifeq -> 361
    //   410: iconst_2
    //   411: anewarray burp/Zbqc
    //   414: invokestatic Zr : ([Lburp/Zbqc;)V
    //   417: aload_0
    //   418: new burp/Zm9t
    //   421: dup
    //   422: invokespecial <init> : ()V
    //   425: putfield ZG : Lburp/Zm9t;
    //   428: aload_0
    //   429: aload_1
    //   430: invokevirtual ZE : ()Z
    //   433: invokevirtual ZG : (Z)V
    //   436: aload #10
    //   438: aload_0
    //   439: getfield ZG : Lburp/Zm9t;
    //   442: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   445: pop
    //   446: aload #10
    //   448: bipush #10
    //   450: invokestatic createHorizontalStrut : (I)Ljava/awt/Component;
    //   453: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   456: pop
    //   457: aload_0
    //   458: invokevirtual Zi : ()Z
    //   461: ifeq -> 527
    //   464: new burp/Zm9t
    //   467: dup
    //   468: invokespecial <init> : ()V
    //   471: astore #11
    //   473: aload #11
    //   475: getstatic burp/Zbhh.ZN : Lburp/Ze9n;
    //   478: sipush #-22144
    //   481: sipush #18564
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: aload_0
    //   488: <illegal opcode> run : (Lburp/Zbhh;)Ljava/lang/Runnable;
    //   493: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   496: aload_0
    //   497: getfield ZQ : Ljava/util/List;
    //   500: aload #11
    //   502: invokeinterface add : (Ljava/lang/Object;)Z
    //   507: pop
    //   508: aload #10
    //   510: aload #11
    //   512: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   515: pop
    //   516: aload #10
    //   518: bipush #10
    //   520: invokestatic createHorizontalStrut : (I)Ljava/awt/Component;
    //   523: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   526: pop
    //   527: new burp/Zm2o
    //   530: dup
    //   531: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   534: invokespecial <init> : (Lburp/Zmcx;)V
    //   537: astore #11
    //   539: aload #11
    //   541: aload_0
    //   542: invokevirtual Zb : ()Lburp/Zk97;
    //   545: invokevirtual Zi : (Lburp/Zk97;)V
    //   548: aload #10
    //   550: aload #11
    //   552: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   555: pop
    //   556: new java/awt/GridBagConstraints
    //   559: dup
    //   560: invokespecial <init> : ()V
    //   563: astore #9
    //   565: aload #9
    //   567: iconst_1
    //   568: putfield gridx : I
    //   571: aload #9
    //   573: iconst_0
    //   574: putfield gridy : I
    //   577: aload #9
    //   579: dconst_0
    //   580: putfield weightx : D
    //   583: aload #9
    //   585: bipush #24
    //   587: putfield anchor : I
    //   590: aload #5
    //   592: aload #10
    //   594: aload #9
    //   596: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   599: aload_0
    //   600: new burp/Zxer
    //   603: dup
    //   604: invokespecial <init> : ()V
    //   607: putfield Zl : Lburp/Zxer;
    //   610: aload_0
    //   611: getfield Zl : Lburp/Zxer;
    //   614: sipush #-22136
    //   617: sipush #29243
    //   620: invokestatic a : (II)Ljava/lang/String;
    //   623: invokevirtual setName : (Ljava/lang/String;)V
    //   626: aload_0
    //   627: getfield Zl : Lburp/Zxer;
    //   630: new java/awt/Insets
    //   633: dup
    //   634: iconst_0
    //   635: bipush #20
    //   637: iconst_0
    //   638: bipush #20
    //   640: invokespecial <init> : (IIII)V
    //   643: invokevirtual setTabAreaInsets : (Ljava/awt/Insets;)V
    //   646: aload_0
    //   647: aload #5
    //   649: sipush #-22138
    //   652: sipush #31557
    //   655: invokestatic a : (II)Ljava/lang/String;
    //   658: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   661: aload_0
    //   662: aload_0
    //   663: getfield Zl : Lburp/Zxer;
    //   666: invokevirtual ZO : ()Ljavax/swing/JComponent;
    //   669: sipush #-22139
    //   672: sipush #-27847
    //   675: invokestatic a : (II)Ljava/lang/String;
    //   678: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   681: return
  }
  
  protected List<Zsm8> ZE() {
    return Collections.emptyList();
  }
  
  protected boolean Zi() {
    return true;
  }
  
  protected abstract Zk97 Zb();
  
  protected void ZH(String paramString, Component paramComponent) {
    Zw(paramString, paramComponent, false);
  }
  
  protected void Zw(String paramString, Component paramComponent, boolean paramBoolean) {
    boolean bool = Zbhg.Zs();
    if (paramBoolean) {
      Zbup zbup = new Zbup();
      zbup.setBorder(Zxt_.Zb);
      Zbhd zbhd = new Zbhd(this, new BorderLayout(), zbup);
      zbhd.setBorder(ZB());
      zbhd.Zl(Zlkk.BACKGROUNDER);
      zbhd.add(paramComponent, a(-22139, -27847));
      zbup.setViewportView(zbhd);
      this.Zl.addTab(paramString, zbup);
      if (!bool) {
        Zbqc zbqc1 = new Zbqc(new BorderLayout());
        zbqc1.setBorder(ZB());
        zbqc1.add(paramComponent, a(-22139, -27847));
        this.Zl.addTab(paramString, zbqc1);
        return;
      } 
      return;
    } 
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.setBorder(ZB());
    zbqc.add(paramComponent, a(-22139, -27847));
    this.Zl.addTab(paramString, zbqc);
  }
  
  public void ZO(String paramString) {
    this.ZF.setText(paramString);
  }
  
  public void ZI() {
    ZG(true);
  }
  
  public void ZD() {
    ZG(false);
    this.ZQ.forEach(Zbhh::lambda$setRunning$1);
  }
  
  public void Ze() {
    this.ZQ.forEach(Zbhh::lambda$setFinished$2);
    ZL();
  }
  
  public void ZL() {
    this.ZG.setVisible(false);
  }
  
  private void ZM(String paramString) {
    String str = Zx6o.ZE(this, -1, a(-22137, 29939), a(-22143, 26069) + a(-22143, 26069), paramString);
    if (str != null)
      this.ZW.ZT(this.Zw.Zh(), str.trim()); 
  }
  
  private void Zl() {
    this.ZW.ZQ(this, this.Zw.Zh());
  }
  
  private void ZG(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: istore_2
    //   4: iload_1
    //   5: ifeq -> 37
    //   8: aload_0
    //   9: getfield ZG : Lburp/Zm9t;
    //   12: getstatic burp/Zbhh.ZP : Lburp/Ze9n;
    //   15: sipush #-22141
    //   18: sipush #19918
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: aload_0
    //   25: <illegal opcode> run : (Lburp/Zbhh;)Ljava/lang/Runnable;
    //   30: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   33: iload_2
    //   34: ifeq -> 62
    //   37: aload_0
    //   38: getfield ZG : Lburp/Zm9t;
    //   41: getstatic burp/Zbhh.Zc : Lburp/Ze9n;
    //   44: sipush #-22142
    //   47: sipush #21160
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: aload_0
    //   54: <illegal opcode> run : (Lburp/Zbhh;)Ljava/lang/Runnable;
    //   59: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   62: aload_0
    //   63: getfield ZG : Lburp/Zm9t;
    //   66: iconst_1
    //   67: invokevirtual setVisible : (Z)V
    //   70: return
  }
  
  public abstract void Zr();
  
  public abstract void ZC();
  
  public void Zj() {}
  
  public void ZK() {}
  
  void Zj(String paramString) {
    this.Zl.setSelectedIndex(this.Zl.indexOfTab(paramString));
  }
  
  public List<Zsm8> Zg() {
    return this.ZJ;
  }
  
  protected Border ZB() {
    return new EmptyBorder(20, 20, 20, 20);
  }
  
  private void lambda$configurePauseResumeButton$3() {
    this.ZW.Zy(this.Zw.Zh());
  }
  
  private static void lambda$setFinished$2(Component paramComponent) {
    paramComponent.setEnabled(false);
  }
  
  private static void lambda$setRunning$1(Component paramComponent) {
    paramComponent.setEnabled(true);
  }
  
  private void lambda$new$0(Ztj1 paramZtj1) {
    ZM(paramZtj1.ZM());
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '­_(Ü±mi¶8Ã\\buöq;üÐ8dáA{0ÁßvÄÚ¥B~rµ¤í£\\t~KÚ¼ý÷ÖûwüÑl.'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #37
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
    //   68: ldc 'Í@¤ÞW-²ÿ6MÜ?lËÒÿj/¸WýæÛ\\tÂ ²Íi'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #25
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #99
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
    //   129: putstatic burp/Zbhh.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbhh.b : [Ljava/lang/String;
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
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #80
    //   219: goto -> 244
    //   222: bipush #57
    //   224: goto -> 244
    //   227: bipush #120
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #18
    //   239: goto -> 244
    //   242: bipush #124
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
    //   300: new burp/Ze3m
    //   303: dup
    //   304: getstatic burp/Zeuf.SCAN_DETAILS : Lburp/Zeuf;
    //   307: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   310: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   313: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   316: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   319: invokevirtual Z_ : ()Lburp/Ze9n;
    //   322: putstatic burp/Zbhh.Za : Lburp/Ze9n;
    //   325: new burp/Ze3m
    //   328: dup
    //   329: getstatic burp/Zeuf.EDIT : Lburp/Zeuf;
    //   332: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   335: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   338: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   341: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   344: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   347: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   350: invokevirtual Z_ : ()Lburp/Ze9n;
    //   353: putstatic burp/Zbhh.Zm : Lburp/Ze9n;
    //   356: new burp/Ze3m
    //   359: dup
    //   360: getstatic burp/Zeuf.RESUME : Lburp/Zeuf;
    //   363: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   366: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   369: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   372: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   375: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   378: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   381: invokevirtual Z_ : ()Lburp/Ze9n;
    //   384: putstatic burp/Zbhh.ZP : Lburp/Ze9n;
    //   387: new burp/Ze3m
    //   390: dup
    //   391: getstatic burp/Zeuf.PAUSE : Lburp/Zeuf;
    //   394: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   397: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   400: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   403: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   406: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   409: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   412: invokevirtual Z_ : ()Lburp/Ze9n;
    //   415: putstatic burp/Zbhh.Zc : Lburp/Ze9n;
    //   418: new burp/Ze3m
    //   421: dup
    //   422: getstatic burp/Zeuf.SETTINGS : Lburp/Zeuf;
    //   425: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   428: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   431: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   434: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   437: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   440: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   443: invokevirtual Z_ : ()Lburp/Ze9n;
    //   446: putstatic burp/Zbhh.ZN : Lburp/Ze9n;
    //   449: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA981) & 0xFFFF;
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
      byte b1 = 91;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */