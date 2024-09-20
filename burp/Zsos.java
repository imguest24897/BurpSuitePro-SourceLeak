package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.util.List;
import javax.swing.Icon;
import javax.swing.border.EmptyBorder;

public class Zsos {
  private static final Icon Zc;
  
  private final Zxer ZI;
  
  private final Zkjh ZQ;
  
  private final Ztca Zh;
  
  private final List<Ztsa> Zr;
  
  private final Zgf8 Zm;
  
  private final Zbqc ZC;
  
  private int Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsos(Zxer paramZxer, Ztca paramZtca) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield Z_ : I
    //   9: aload_0
    //   10: aload_1
    //   11: putfield ZI : Lburp/Zxer;
    //   14: aload_0
    //   15: aload_2
    //   16: putfield Zh : Lburp/Ztca;
    //   19: invokestatic Zr : ()[Ljava/lang/String;
    //   22: aload_0
    //   23: new burp/Zkjh
    //   26: dup
    //   27: aload_1
    //   28: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   31: invokespecial <init> : (Ljava/awt/Window;)V
    //   34: putfield ZQ : Lburp/Zkjh;
    //   37: astore_3
    //   38: aload_0
    //   39: new java/util/ArrayList
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: putfield Zr : Ljava/util/List;
    //   49: aload_0
    //   50: new burp/Zgf8
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: putfield Zm : Lburp/Zgf8;
    //   60: aload_0
    //   61: getfield Zm : Lburp/Zgf8;
    //   64: sipush #814
    //   67: sipush #-20882
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokevirtual setName : (Ljava/lang/String;)V
    //   76: aload_0
    //   77: getfield Zm : Lburp/Zgf8;
    //   80: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   83: invokevirtual Zu : (Lburp/Zlkk;)V
    //   86: aload_0
    //   87: getfield Zm : Lburp/Zgf8;
    //   90: new javax/swing/border/CompoundBorder
    //   93: dup
    //   94: new javax/swing/border/EmptyBorder
    //   97: dup
    //   98: iconst_2
    //   99: iconst_5
    //   100: iconst_5
    //   101: iconst_5
    //   102: invokespecial <init> : (IIII)V
    //   105: aload_0
    //   106: getfield Zm : Lburp/Zgf8;
    //   109: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   112: invokespecial <init> : (Ljavax/swing/border/Border;Ljavax/swing/border/Border;)V
    //   115: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   118: aload_0
    //   119: new burp/Zbqc
    //   122: dup
    //   123: new java/awt/GridBagLayout
    //   126: dup
    //   127: invokespecial <init> : ()V
    //   130: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   133: putfield ZC : Lburp/Zbqc;
    //   136: aload_0
    //   137: getfield ZC : Lburp/Zbqc;
    //   140: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   143: invokevirtual Zl : (Lburp/Zlkk;)V
    //   146: new burp/Zbqc
    //   149: dup
    //   150: new java/awt/BorderLayout
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   160: astore #4
    //   162: aload #4
    //   164: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   167: invokevirtual Zl : (Lburp/Zlkk;)V
    //   170: aload #4
    //   172: aload_0
    //   173: getfield ZC : Lburp/Zbqc;
    //   176: sipush #811
    //   179: sipush #-13567
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   188: new burp/Zbup
    //   191: dup
    //   192: aload #4
    //   194: invokespecial <init> : (Ljava/awt/Component;)V
    //   197: astore #5
    //   199: aload #5
    //   201: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   204: invokevirtual Zh : (Lburp/Zlkk;)V
    //   207: aload #5
    //   209: aconst_null
    //   210: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   213: aload_0
    //   214: getfield Zm : Lburp/Zgf8;
    //   217: aload_0
    //   218: aload #5
    //   220: <illegal opcode> Zc : (Lburp/Zsos;Lburp/Zbup;)Lburp/Zm6a;
    //   225: invokevirtual ZR : (Lburp/Zm6a;)V
    //   228: aload_0
    //   229: getfield Zm : Lburp/Zgf8;
    //   232: new burp/Zeah
    //   235: dup
    //   236: aload_0
    //   237: invokespecial <init> : (Lburp/Zsos;)V
    //   240: invokevirtual addKeyListener : (Ljava/awt/event/KeyListener;)V
    //   243: aload_0
    //   244: ldc ''
    //   246: invokevirtual Z_ : (Ljava/lang/String;)V
    //   249: new burp/Zbqc
    //   252: dup
    //   253: new java/awt/BorderLayout
    //   256: dup
    //   257: invokespecial <init> : ()V
    //   260: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   263: astore #6
    //   265: aload #6
    //   267: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   270: invokevirtual Zl : (Lburp/Zlkk;)V
    //   273: aload #6
    //   275: aload_0
    //   276: getfield Zm : Lburp/Zgf8;
    //   279: sipush #813
    //   282: sipush #19785
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   291: aload #6
    //   293: aload #5
    //   295: sipush #815
    //   298: sipush #-27440
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   307: aload_0
    //   308: getfield ZQ : Lburp/Zkjh;
    //   311: aload #6
    //   313: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   316: pop
    //   317: aload_0
    //   318: getfield ZQ : Lburp/Zkjh;
    //   321: new java/awt/Dimension
    //   324: dup
    //   325: invokestatic ZH : ()F
    //   328: ldc 35.0
    //   330: fmul
    //   331: f2i
    //   332: invokestatic Zx : ()F
    //   335: ldc 35.0
    //   337: fmul
    //   338: f2i
    //   339: invokespecial <init> : (II)V
    //   342: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   345: aload_0
    //   346: getfield ZQ : Lburp/Zkjh;
    //   349: invokevirtual pack : ()V
    //   352: aload_3
    //   353: ifnull -> 363
    //   356: iconst_5
    //   357: anewarray burp/Zbqc
    //   360: invokestatic Zr : ([Lburp/Zbqc;)V
    //   363: return
  }
  
  public void Zv(Component paramComponent, int paramInt1, int paramInt2) {
    this.ZQ.show(paramComponent, paramInt1, paramInt2);
    this.Zm.Ze();
    this.Zh.ZX();
  }
  
  public Dimension ZV() {
    return this.ZQ.getPreferredSize();
  }
  
  private void Z_(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic Zr : ()[Ljava/lang/String;
    //   5: aload_0
    //   6: getfield ZC : Lburp/Zbqc;
    //   9: invokevirtual removeAll : ()V
    //   12: aload_0
    //   13: getfield Zr : Ljava/util/List;
    //   16: invokeinterface clear : ()V
    //   21: astore_2
    //   22: aload_0
    //   23: iconst_m1
    //   24: putfield Z_ : I
    //   27: aconst_null
    //   28: astore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iconst_0
    //   34: istore #6
    //   36: iload #6
    //   38: aload_0
    //   39: getfield ZI : Lburp/Zxer;
    //   42: invokevirtual getTabCount : ()I
    //   45: if_icmpge -> 323
    //   48: aload_0
    //   49: getfield ZI : Lburp/Zxer;
    //   52: iload #6
    //   54: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   57: checkcast burp/Zewb
    //   60: astore #7
    //   62: aload #7
    //   64: invokeinterface getText : ()Ljava/lang/String;
    //   69: astore #8
    //   71: aload #7
    //   73: invokeinterface ZR : ()Lburp/Zr6e;
    //   78: astore #9
    //   80: iload #5
    //   82: ifeq -> 102
    //   85: aload #9
    //   87: ifnull -> 102
    //   90: aload #9
    //   92: aload #4
    //   94: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   99: ifne -> 138
    //   102: aload_1
    //   103: ifnull -> 138
    //   106: aload_1
    //   107: invokevirtual isEmpty : ()Z
    //   110: ifne -> 138
    //   113: aload #8
    //   115: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   118: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   121: aload_1
    //   122: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   125: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   128: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   131: ifne -> 138
    //   134: aload_2
    //   135: ifnull -> 316
    //   138: aload #9
    //   140: ifnull -> 206
    //   143: aload #9
    //   145: aload #4
    //   147: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   152: ifne -> 206
    //   155: iload #6
    //   157: ifle -> 175
    //   160: aload_0
    //   161: new burp/Zem9
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: iload_3
    //   169: iinc #3, 1
    //   172: invokevirtual ZQ : (Ljava/awt/Component;I)V
    //   175: aload_0
    //   176: aload_0
    //   177: aload #9
    //   179: invokevirtual Zr : (Lburp/Zr6e;)Ljava/awt/Component;
    //   182: iload_3
    //   183: iinc #3, 1
    //   186: invokevirtual ZQ : (Ljava/awt/Component;I)V
    //   189: aload #9
    //   191: astore #4
    //   193: aload #7
    //   195: invokeinterface Zp : ()Z
    //   200: istore #5
    //   202: aload_2
    //   203: ifnull -> 237
    //   206: aload #9
    //   208: ifnonnull -> 237
    //   211: aload #4
    //   213: ifnull -> 231
    //   216: aload_0
    //   217: new burp/Zem9
    //   220: dup
    //   221: invokespecial <init> : ()V
    //   224: iload_3
    //   225: iinc #3, 1
    //   228: invokevirtual ZQ : (Ljava/awt/Component;I)V
    //   231: aconst_null
    //   232: astore #4
    //   234: iconst_0
    //   235: istore #5
    //   237: iload #5
    //   239: ifeq -> 264
    //   242: aload #7
    //   244: invokeinterface Zp : ()Z
    //   249: ifne -> 316
    //   252: aload #9
    //   254: aload #4
    //   256: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   261: ifeq -> 316
    //   264: aload_0
    //   265: iload #6
    //   267: aload #8
    //   269: aload #9
    //   271: aload_0
    //   272: getfield Zr : Ljava/util/List;
    //   275: invokeinterface size : ()I
    //   280: invokevirtual ZM : (ILjava/lang/String;Lburp/Zr6e;I)Lburp/Zm99;
    //   283: astore #10
    //   285: aload_0
    //   286: getfield Zr : Ljava/util/List;
    //   289: new burp/Ztsa
    //   292: dup
    //   293: aload #10
    //   295: iload #6
    //   297: invokespecial <init> : (Lburp/Zm99;I)V
    //   300: invokeinterface add : (Ljava/lang/Object;)Z
    //   305: pop
    //   306: aload_0
    //   307: aload #10
    //   309: iload_3
    //   310: iinc #3, 1
    //   313: invokevirtual ZQ : (Ljava/awt/Component;I)V
    //   316: iinc #6, 1
    //   319: aload_2
    //   320: ifnull -> 36
    //   323: aload_0
    //   324: aload_0
    //   325: getfield Zr : Ljava/util/List;
    //   328: invokeinterface isEmpty : ()Z
    //   333: ifeq -> 340
    //   336: iconst_m1
    //   337: goto -> 341
    //   340: iconst_0
    //   341: invokevirtual ZN : (I)V
    //   344: return
  }
  
  private void ZN(int paramInt) {
    if (this.Z_ >= 0)
      ((Ztsa)this.Zr.get(this.Z_)).ZY(false); 
    if (paramInt >= 0)
      ((Ztsa)this.Zr.get(paramInt)).ZY(true); 
    this.Z_ = paramInt;
  }
  
  private Component Zr(Zr6e paramZr6e) {
    Ze9n ze9n = Ze3m.ZC(Zeuf.FOLDER, (paramZr6e.Zyd()).selectorColour).ZU(Zmcx.SMALL_LINE_SIZE).Z_();
    String str = paramZr6e.ZyV();
    Zm99 zm99 = new Zm99(str, ze9n);
    zm99.setBorder(new EmptyBorder(5, 15, 3, 5));
    zm99.setName(a(812, 5585) + a(812, 5585));
    return zm99;
  }
  
  private Zm99 ZM(int paramInt1, String paramString, Zr6e paramZr6e, int paramInt2) {
    Zm99 zm99 = new Zm99(paramString, Zc);
    zm99.setOpaque(true);
    zm99.setBorder(new EmptyBorder(0, 15, 0, 0));
    zm99.setName(a(810, -12994) + a(810, -12994));
    zm99.addMouseListener(new Zlf4(this, paramInt1, paramInt2));
    if (paramZr6e == null)
      zm99.setHorizontalTextPosition(10); 
    return zm99;
  }
  
  private void ZP(int paramInt) {
    this.ZQ.Zy();
    this.ZI.setSelectedIndex(paramInt);
  }
  
  private void ZQ(Component paramComponent, int paramInt) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = paramInt;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZC.add(paramComponent, gridBagConstraints);
  }
  
  private void lambda$new$0(Zbup paramZbup, String paramString) {
    Z_(paramString);
    paramZbup.revalidate();
    paramZbup.repaint();
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥äu'=­Ôdn%ÀCo«îOñ9\\bpôd+·$Ü\\t¤[&ût<¾?=è4Î]íÌz'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
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
    //   68: ldc 'íò+Þ¼¥/O¼/8î£òPã#Úzg3Ktõëî\\nDL'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #127
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
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zsos.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zsos.b : [Ljava/lang/String;
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
    //   212: bipush #22
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #49
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #59
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #101
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
    //   300: getstatic burp/Zeuf.EMPTY : Lburp/Zeuf;
    //   303: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   306: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   309: getstatic burp/Zmcx.SMALL_LINE_SIZE : Lburp/Zmcx;
    //   312: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   315: invokevirtual Z_ : ()Lburp/Ze9n;
    //   318: putstatic burp/Zsos.Zc : Ljavax/swing/Icon;
    //   321: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x32F) & 0xFFFF;
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
      byte b1 = 21;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */