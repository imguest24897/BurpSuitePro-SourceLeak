package burp;

import javax.swing.SwingUtilities;

class Zbc0 extends Zbqc {
  private final Zm99 ZY;
  
  private final Zm99 Zy;
  
  private final Zm99 Zf;
  
  private final Ze9n Zx;
  
  private final boolean Zm;
  
  private boolean Zj;
  
  private boolean Zu;
  
  Zbc0(Zerv paramZerv, Zx8l paramZx8l, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZQ : ()Z
    //   7: aload_0
    //   8: aload_2
    //   9: invokeinterface ZP : ()Ljava/lang/String;
    //   14: invokevirtual setName : (Ljava/lang/String;)V
    //   17: istore #4
    //   19: aload_0
    //   20: aload_2
    //   21: invokeinterface Zx : ()Lburp/Zze2;
    //   26: getfield Zn : Ljava/lang/String;
    //   29: ifnull -> 51
    //   32: aload_2
    //   33: invokeinterface Zx : ()Lburp/Zze2;
    //   38: getfield Zn : Ljava/lang/String;
    //   41: invokevirtual isEmpty : ()Z
    //   44: ifne -> 51
    //   47: iconst_1
    //   48: goto -> 52
    //   51: iconst_0
    //   52: putfield Zm : Z
    //   55: aload_0
    //   56: new burp/Ze9_
    //   59: dup
    //   60: aload_2
    //   61: invokeinterface ZL : ()Lburp/Zeuf;
    //   66: invokespecial <init> : (Lburp/Zeuf;)V
    //   69: putfield Zx : Lburp/Ze9n;
    //   72: aload_0
    //   73: new burp/Zm99
    //   76: dup
    //   77: aload_0
    //   78: getfield Zx : Lburp/Ze9n;
    //   81: invokespecial <init> : (Ljavax/swing/Icon;)V
    //   84: putfield ZY : Lburp/Zm99;
    //   87: aload_0
    //   88: getfield ZY : Lburp/Zm99;
    //   91: iconst_0
    //   92: invokevirtual setHorizontalAlignment : (I)V
    //   95: aload_0
    //   96: getfield ZY : Lburp/Zm99;
    //   99: iconst_0
    //   100: invokevirtual setIconTextGap : (I)V
    //   103: aload_0
    //   104: getfield ZY : Lburp/Zm99;
    //   107: iconst_0
    //   108: invokevirtual setOpaque : (Z)V
    //   111: aload_0
    //   112: new java/awt/GridBagLayout
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   122: aload_0
    //   123: new javax/swing/border/EmptyBorder
    //   126: dup
    //   127: bipush #10
    //   129: bipush #10
    //   131: bipush #10
    //   133: bipush #10
    //   135: invokespecial <init> : (IIII)V
    //   138: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   141: new java/awt/GridBagConstraints
    //   144: dup
    //   145: invokespecial <init> : ()V
    //   148: astore #5
    //   150: aload #5
    //   152: iconst_0
    //   153: putfield gridx : I
    //   156: aload #5
    //   158: iconst_0
    //   159: putfield gridy : I
    //   162: aload #5
    //   164: bipush #23
    //   166: putfield anchor : I
    //   169: aload #5
    //   171: iconst_1
    //   172: putfield fill : I
    //   175: aload #5
    //   177: new java/awt/Insets
    //   180: dup
    //   181: iconst_0
    //   182: iconst_0
    //   183: iconst_4
    //   184: iconst_0
    //   185: invokespecial <init> : (IIII)V
    //   188: putfield insets : Ljava/awt/Insets;
    //   191: aload_0
    //   192: aload_0
    //   193: getfield ZY : Lburp/Zm99;
    //   196: aload #5
    //   198: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   201: aload_0
    //   202: new burp/Zm99
    //   205: dup
    //   206: aload_2
    //   207: invokeinterface Zx : ()Lburp/Zze2;
    //   212: getfield ZH : Ljava/lang/String;
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: putfield Zy : Lburp/Zm99;
    //   221: aload_0
    //   222: getfield Zy : Lburp/Zm99;
    //   225: iconst_0
    //   226: invokevirtual setHorizontalAlignment : (I)V
    //   229: aload_0
    //   230: getfield Zy : Lburp/Zm99;
    //   233: iconst_0
    //   234: invokevirtual setOpaque : (Z)V
    //   237: new java/awt/GridBagConstraints
    //   240: dup
    //   241: invokespecial <init> : ()V
    //   244: astore #5
    //   246: aload #5
    //   248: iconst_0
    //   249: putfield gridx : I
    //   252: aload #5
    //   254: iconst_1
    //   255: putfield gridy : I
    //   258: aload #5
    //   260: bipush #23
    //   262: putfield anchor : I
    //   265: aload #5
    //   267: iconst_1
    //   268: putfield fill : I
    //   271: aload_0
    //   272: aload_0
    //   273: getfield Zy : Lburp/Zm99;
    //   276: aload #5
    //   278: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   281: aload_0
    //   282: getfield Zm : Z
    //   285: ifeq -> 373
    //   288: aload_0
    //   289: new burp/Zm99
    //   292: dup
    //   293: aload_2
    //   294: invokeinterface Zx : ()Lburp/Zze2;
    //   299: getfield Zn : Ljava/lang/String;
    //   302: invokespecial <init> : (Ljava/lang/String;)V
    //   305: putfield Zf : Lburp/Zm99;
    //   308: aload_0
    //   309: getfield Zf : Lburp/Zm99;
    //   312: iconst_0
    //   313: invokevirtual setHorizontalAlignment : (I)V
    //   316: aload_0
    //   317: getfield Zf : Lburp/Zm99;
    //   320: iconst_0
    //   321: invokevirtual setOpaque : (Z)V
    //   324: new java/awt/GridBagConstraints
    //   327: dup
    //   328: invokespecial <init> : ()V
    //   331: astore #5
    //   333: aload #5
    //   335: iconst_0
    //   336: putfield gridx : I
    //   339: aload #5
    //   341: iconst_2
    //   342: putfield gridy : I
    //   345: aload #5
    //   347: bipush #23
    //   349: putfield anchor : I
    //   352: aload #5
    //   354: iconst_1
    //   355: putfield fill : I
    //   358: aload_0
    //   359: aload_0
    //   360: getfield Zf : Lburp/Zm99;
    //   363: aload #5
    //   365: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   368: iload #4
    //   370: ifeq -> 378
    //   373: aload_0
    //   374: aconst_null
    //   375: putfield Zf : Lburp/Zm99;
    //   378: aload_0
    //   379: new burp/Zg9q
    //   382: dup
    //   383: aload_0
    //   384: aload_1
    //   385: iload_3
    //   386: invokespecial <init> : (Lburp/Zbc0;Lburp/Zerv;I)V
    //   389: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   392: invokestatic Zwu : ()[Lburp/Zbqc;
    //   395: ifnonnull -> 411
    //   398: iload #4
    //   400: ifeq -> 407
    //   403: iconst_0
    //   404: goto -> 408
    //   407: iconst_1
    //   408: invokestatic ZX : (Z)V
    //   411: return
  }
  
  void Zf(boolean paramBoolean) {
    this.Zu = paramBoolean;
    ZR(Zlkk.RIBBON_BUTTON_SELECTED_BACKGROUND, Zlkk.RIBBON_BUTTON_BACKGROUND);
  }
  
  void ZW() {
    setEnabled(true);
    SwingUtilities.invokeLater(this::lambda$activate$0);
  }
  
  void Zc() {
    setEnabled(false);
    SwingUtilities.invokeLater(this::lambda$deactivate$1);
  }
  
  private void ZR(Zlkk paramZlkk1, Zlkk paramZlkk2) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: invokevirtual isEnabled : ()Z
    //   8: ifeq -> 156
    //   11: aload_0
    //   12: getfield Zu : Z
    //   15: ifeq -> 79
    //   18: aload_0
    //   19: getfield Zj : Z
    //   22: ifeq -> 36
    //   25: aload_0
    //   26: getfield Zx : Lburp/Ze9n;
    //   29: invokevirtual Zj : ()V
    //   32: iload_3
    //   33: ifne -> 43
    //   36: aload_0
    //   37: getfield Zx : Lburp/Ze9n;
    //   40: invokevirtual Zk : ()V
    //   43: aload_0
    //   44: getfield Zy : Lburp/Zm99;
    //   47: getstatic burp/Zlkk.RIBBON_BUTTON_SELECTED_FOREGROUND : Lburp/Zlkk;
    //   50: invokevirtual Ze : (Lburp/Zlkk;)V
    //   53: aload_0
    //   54: getfield Zm : Z
    //   57: ifeq -> 70
    //   60: aload_0
    //   61: getfield Zf : Lburp/Zm99;
    //   64: getstatic burp/Zlkk.RIBBON_BUTTON_SELECTED_FOREGROUND : Lburp/Zlkk;
    //   67: invokevirtual Ze : (Lburp/Zlkk;)V
    //   70: aload_0
    //   71: aload_1
    //   72: invokevirtual Zl : (Lburp/Zlkk;)V
    //   75: iload_3
    //   76: ifne -> 163
    //   79: aload_0
    //   80: getfield Zj : Z
    //   83: ifeq -> 97
    //   86: aload_0
    //   87: getfield Zx : Lburp/Ze9n;
    //   90: invokevirtual Zx : ()V
    //   93: iload_3
    //   94: ifne -> 104
    //   97: aload_0
    //   98: getfield Zx : Lburp/Ze9n;
    //   101: invokevirtual Zm : ()V
    //   104: aload_0
    //   105: getfield Zj : Z
    //   108: ifeq -> 117
    //   111: getstatic burp/Zlkk.RIBBON_BUTTON_HOVER_FOREGROUND : Lburp/Zlkk;
    //   114: goto -> 120
    //   117: getstatic burp/Zlkk.RIBBON_BUTTON_FOREGROUND : Lburp/Zlkk;
    //   120: astore #4
    //   122: aload_0
    //   123: getfield Zy : Lburp/Zm99;
    //   126: aload #4
    //   128: invokevirtual Ze : (Lburp/Zlkk;)V
    //   131: aload_0
    //   132: getfield Zm : Z
    //   135: ifeq -> 147
    //   138: aload_0
    //   139: getfield Zf : Lburp/Zm99;
    //   142: aload #4
    //   144: invokevirtual Ze : (Lburp/Zlkk;)V
    //   147: aload_0
    //   148: aload_2
    //   149: invokevirtual Zl : (Lburp/Zlkk;)V
    //   152: iload_3
    //   153: ifne -> 163
    //   156: aload_0
    //   157: getfield Zx : Lburp/Ze9n;
    //   160: invokevirtual ZH : ()V
    //   163: aload_0
    //   164: getfield ZY : Lburp/Zm99;
    //   167: invokevirtual repaint : ()V
    //   170: return
  }
  
  private void lambda$deactivate$1() {
    this.Zx.ZH();
    this.Zy.Ze(Zlkk.RIBBON_BUTTON_INACTIVE_FOREGROUND);
    if (this.Zm)
      this.Zf.Ze(Zlkk.RIBBON_BUTTON_INACTIVE_FOREGROUND); 
    Zl(Zlkk.RIBBON_BUTTON_BACKGROUND);
  }
  
  private void lambda$activate$0() {
    this.Zx.Zm();
    this.Zy.Ze(Zlkk.RIBBON_BUTTON_FOREGROUND);
    if (this.Zm)
      this.Zf.Ze(Zlkk.RIBBON_BUTTON_FOREGROUND); 
    Zl(Zlkk.RIBBON_BUTTON_BACKGROUND);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbc0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */