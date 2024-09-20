package burp;

import java.awt.Component;
import java.awt.event.HierarchyEvent;
import java.util.List;
import java.util.function.Supplier;

public class Zbdt extends Zbqc implements Zbxj {
  private final Zbc9 ZQ;
  
  private final Zbdy Zl;
  
  private final Zbd5 ZW;
  
  private final List<Zb00> ZS;
  
  private final Ztos<Zt1j> Zw;
  
  private final boolean Zz;
  
  private final int ZO;
  
  private final Zk9a ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zbdt(Zmld paramZmld) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/BorderLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: aload_1
    //   12: getfield ZK : Ljava/util/List;
    //   15: astore_3
    //   16: aload_1
    //   17: getfield ZZ : Lburp/Zs_i;
    //   20: astore #4
    //   22: aload_1
    //   23: getfield ZU : Lburp/Ztos;
    //   26: astore #5
    //   28: invokestatic Zz : ()I
    //   31: aload_1
    //   32: getfield Zn : Lburp/Zgb6;
    //   35: astore #6
    //   37: aload_1
    //   38: getfield Zs : Ljava/util/function/Supplier;
    //   41: astore #7
    //   43: aload_1
    //   44: getfield ZW : Z
    //   47: istore #8
    //   49: istore_2
    //   50: aload_0
    //   51: aload #5
    //   53: putfield Zw : Lburp/Ztos;
    //   56: aload_0
    //   57: sipush #-6038
    //   60: sipush #12881
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual setName : (Ljava/lang/String;)V
    //   69: aload_0
    //   70: aload_1
    //   71: getfield ZV : Z
    //   74: ifne -> 94
    //   77: aload_3
    //   78: invokeinterface size : ()I
    //   83: iconst_1
    //   84: if_icmple -> 102
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 103
    //   98: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   101: athrow
    //   102: iconst_0
    //   103: putfield Zz : Z
    //   106: aload_0
    //   107: aload_1
    //   108: getfield Zu : I
    //   111: putfield ZO : I
    //   114: aload_0
    //   115: getfield Zz : Z
    //   118: ifeq -> 154
    //   121: aload_0
    //   122: new burp/Zr43
    //   125: dup
    //   126: getstatic burp/Zlkk.COLLAPSIBLE_SIDEBAR_PANEL_SEPARATOR : Lburp/Zlkk;
    //   129: iconst_1
    //   130: new java/awt/Insets
    //   133: dup
    //   134: iconst_1
    //   135: iconst_0
    //   136: iconst_0
    //   137: iconst_1
    //   138: invokespecial <init> : (IIII)V
    //   141: invokespecial <init> : (Lburp/Zlkk;ILjava/awt/Insets;)V
    //   144: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   153: athrow
    //   154: aload_0
    //   155: new java/util/LinkedList
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: putfield ZS : Ljava/util/List;
    //   165: aload_3
    //   166: invokeinterface iterator : ()Ljava/util/Iterator;
    //   171: astore #9
    //   173: aload #9
    //   175: invokeinterface hasNext : ()Z
    //   180: ifeq -> 228
    //   183: aload #9
    //   185: invokeinterface next : ()Ljava/lang/Object;
    //   190: checkcast burp/Zmon
    //   193: astore #10
    //   195: aload_0
    //   196: getfield ZS : Ljava/util/List;
    //   199: new burp/Zbz
    //   202: dup
    //   203: aload #10
    //   205: invokeinterface ZsO : ()Lburp/Zs_i;
    //   210: getfield componentId : I
    //   213: aload #10
    //   215: invokespecial <init> : (ILburp/Zmon;)V
    //   218: invokeinterface add : (Ljava/lang/Object;)Z
    //   223: pop
    //   224: iload_2
    //   225: ifne -> 173
    //   228: aload #5
    //   230: getstatic burp/Zt1j.ZD : Lburp/Zlnb;
    //   233: aload_0
    //   234: <illegal opcode> accept : (Lburp/Zbdt;)Ljava/util/function/Consumer;
    //   239: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   242: pop
    //   243: aload #5
    //   245: getstatic burp/Zt1j.ZK : Lburp/Zlnb;
    //   248: aload_0
    //   249: <illegal opcode> accept : (Lburp/Zbdt;)Ljava/util/function/Consumer;
    //   254: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   257: pop
    //   258: aload #5
    //   260: getstatic burp/Zt1j.Zk : Lburp/Zlnb;
    //   263: aload_0
    //   264: <illegal opcode> accept : (Lburp/Zbdt;)Ljava/util/function/Consumer;
    //   269: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   272: pop
    //   273: aload_0
    //   274: new burp/Zbdy
    //   277: dup
    //   278: aload_0
    //   279: getfield ZS : Ljava/util/List;
    //   282: aload #5
    //   284: aload #4
    //   286: aload #7
    //   288: iload #8
    //   290: invokespecial <init> : (Ljava/util/List;Lburp/Zz1m;Lburp/Zs_i;Ljava/util/function/Supplier;Z)V
    //   293: putfield Zl : Lburp/Zbdy;
    //   296: aload_0
    //   297: <illegal opcode> Zl : (Lburp/Zbdt;)Lburp/Zern;
    //   302: astore #9
    //   304: aload_0
    //   305: <illegal opcode> Zz : (Lburp/Zbdt;)Lburp/Zxoz;
    //   310: astore #10
    //   312: aload #6
    //   314: ifnull -> 340
    //   317: aload_0
    //   318: aload_0
    //   319: aload #6
    //   321: aload #9
    //   323: aload #10
    //   325: <illegal opcode> hierarchyChanged : (Lburp/Zbdt;Lburp/Zgb6;Lburp/Zern;Lburp/Zxoz;)Ljava/awt/event/HierarchyListener;
    //   330: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   339: athrow
    //   340: aload_0
    //   341: getfield Zl : Lburp/Zbdy;
    //   344: iconst_0
    //   345: invokevirtual setVisible : (Z)V
    //   348: aload_0
    //   349: aload_0
    //   350: getfield Zl : Lburp/Zbdy;
    //   353: sipush #-6040
    //   356: sipush #28185
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   365: aload_0
    //   366: new burp/Zk9a
    //   369: dup
    //   370: aload_0
    //   371: getfield Zl : Lburp/Zbdy;
    //   374: aload #5
    //   376: aload_0
    //   377: getfield Zl : Lburp/Zbdy;
    //   380: dup
    //   381: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   384: pop
    //   385: <illegal opcode> get : (Lburp/Zbdy;)Ljava/util/function/Supplier;
    //   390: invokespecial <init> : (Lburp/Zbdy;Lburp/Zz1m;Ljava/util/function/Supplier;)V
    //   393: putfield ZD : Lburp/Zk9a;
    //   396: aload #6
    //   398: ifnull -> 415
    //   401: aload #6
    //   403: invokeinterface ZEa : ()Lburp/Zmsv;
    //   408: goto -> 418
    //   411: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   414: athrow
    //   415: getstatic burp/Zmsv.DEFAULT : Lburp/Zmsv;
    //   418: astore #11
    //   420: aload #6
    //   422: ifnull -> 439
    //   425: aload #6
    //   427: invokeinterface Zfn : ()Lburp/Zrpp;
    //   432: goto -> 442
    //   435: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   438: athrow
    //   439: getstatic burp/Zrpp.DEFAULT : Lburp/Zrpp;
    //   442: astore #12
    //   444: aload_0
    //   445: new burp/Zbd5
    //   448: dup
    //   449: aload_0
    //   450: getfield ZD : Lburp/Zk9a;
    //   453: aload_0
    //   454: getfield ZS : Ljava/util/List;
    //   457: aload #4
    //   459: aload #5
    //   461: aload #11
    //   463: invokespecial <init> : (Lburp/Zejo;Ljava/util/List;Lburp/Zs_i;Lburp/Zlli;Lburp/Zmsv;)V
    //   466: putfield ZW : Lburp/Zbd5;
    //   469: new burp/Zbqc
    //   472: dup
    //   473: invokespecial <init> : ()V
    //   476: astore #13
    //   478: aload #13
    //   480: new java/awt/Dimension
    //   483: dup
    //   484: iconst_0
    //   485: iconst_0
    //   486: invokespecial <init> : (II)V
    //   489: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   492: aload_0
    //   493: new burp/Zbc9
    //   496: dup
    //   497: iconst_2
    //   498: anewarray java/awt/Component
    //   501: dup
    //   502: iconst_0
    //   503: aload_0
    //   504: getfield ZW : Lburp/Zbd5;
    //   507: aastore
    //   508: dup
    //   509: iconst_1
    //   510: aload #13
    //   512: aastore
    //   513: invokespecial <init> : ([Ljava/awt/Component;)V
    //   516: putfield ZQ : Lburp/Zbc9;
    //   519: aload_0
    //   520: getfield ZQ : Lburp/Zbc9;
    //   523: iconst_0
    //   524: invokevirtual Zv : (I)V
    //   527: aload_0
    //   528: aload #12
    //   530: invokevirtual ZJ : (Lburp/Zrpp;)V
    //   533: return
    // Exception table:
    //   from	to	target	type
    //   50	87	90	java/lang/IllegalArgumentException
    //   77	98	98	java/lang/IllegalArgumentException
    //   103	147	150	java/lang/IllegalArgumentException
    //   312	333	336	java/lang/IllegalArgumentException
    //   340	411	411	java/lang/IllegalArgumentException
    //   420	435	435	java/lang/IllegalArgumentException
  }
  
  private void ZI(Zrpp paramZrpp) {
    this.Zw.ZD(new Zxr8(Zt1j.Zk, paramZrpp));
  }
  
  private void ZJ(Zrpp paramZrpp) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = (paramZrpp == Zrpp.LEFT) ? a(-6037, -17272) : a(-6039, 374);
    try {
      add(this.ZQ, str);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramZrpp == Zrpp.RIGHT) ? true : false;
    this.Zl.setBorder(new Zrf5(0, 0, 0, bool, Zlkk.COLLAPSIBLE_SIDEBAR_PANEL_SEPARATOR));
    this.Zl.ZI(paramZrpp);
  }
  
  private void Z_(Zmsv paramZmsv) {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore_2
    //   4: getstatic burp/Zemi.ZN : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: lookupswitch default -> 140, 1 -> 40, 2 -> 92
    //   40: aload_0
    //   41: getfield Zw : Lburp/Ztos;
    //   44: new burp/Zxr8
    //   47: dup
    //   48: getstatic burp/Zt1j.ZD : Lburp/Zlnb;
    //   51: invokespecial <init> : (Lburp/Zlnb;)V
    //   54: invokevirtual ZD : (Lburp/Zxr8;)V
    //   57: aload_0
    //   58: getfield Zw : Lburp/Ztos;
    //   61: new burp/Zxr8
    //   64: dup
    //   65: getstatic burp/Zt1j.Zm : Lburp/Zlnb;
    //   68: aload_0
    //   69: getfield ZD : Lburp/Zk9a;
    //   72: invokevirtual Zr : ()Lburp/Zs_i;
    //   75: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   78: invokevirtual ZD : (Lburp/Zxr8;)V
    //   81: iload_2
    //   82: ifne -> 140
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   91: athrow
    //   92: aload_0
    //   93: getfield Zw : Lburp/Ztos;
    //   96: new burp/Zxr8
    //   99: dup
    //   100: getstatic burp/Zt1j.ZK : Lburp/Zlnb;
    //   103: invokespecial <init> : (Lburp/Zlnb;)V
    //   106: invokevirtual ZD : (Lburp/Zxr8;)V
    //   109: aload_0
    //   110: getfield Zw : Lburp/Ztos;
    //   113: new burp/Zxr8
    //   116: dup
    //   117: getstatic burp/Zt1j.Zx : Lburp/Zlnb;
    //   120: aload_0
    //   121: getfield ZD : Lburp/Zk9a;
    //   124: invokevirtual Zr : ()Lburp/Zs_i;
    //   127: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   130: invokevirtual ZD : (Lburp/Zxr8;)V
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   139: athrow
    //   140: return
    // Exception table:
    //   from	to	target	type
    //   4	85	88	java/lang/IllegalArgumentException
    //   40	133	136	java/lang/IllegalArgumentException
  }
  
  public Component ZQ() {
    return this;
  }
  
  public void Zl(Zrpp paramZrpp) {
    ZJ(paramZrpp);
  }
  
  public void Zs() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = !this.Zl.isVisible() ? true : false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zlnb<Void> zlnb = bool ? Zt1j.ZD : Zt1j.ZK;
    this.Zw.ZD(new Zxr8(zlnb));
    ZJ(bool);
  }
  
  public void ZJ(boolean paramBoolean) {
    try {
      if (this.Zl.isVisible())
        try {
          if (paramBoolean)
            return; 
          try {
            if (!this.Zl.isVisible())
              try {
                if (!paramBoolean)
                  return; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!this.Zl.isVisible())
        try {
          if (!paramBoolean)
            return; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int Zd() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.Zl.isVisible() ? ZG() : this.ZW.getWidth();
  }
  
  private int ZG() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZO > 0) ? this.ZO : Zgdi.ZK();
  }
  
  public int Zv() {
    return this.ZW.getWidth();
  }
  
  public void Zv(Zs_i paramZs_i) {
    this.ZS.stream().filter(paramZs_i::lambda$setSelectedView$4).findFirst().ifPresent(this::lambda$setSelectedView$5);
  }
  
  private void ZV(boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: ifeq -> 18
    //   4: aload_0
    //   5: getfield Zz : Z
    //   8: ifeq -> 26
    //   11: goto -> 18
    //   14: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   17: athrow
    //   18: iconst_1
    //   19: goto -> 27
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: iconst_0
    //   27: istore_2
    //   28: iload_2
    //   29: ifeq -> 40
    //   32: iconst_0
    //   33: goto -> 41
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: iconst_1
    //   41: istore_3
    //   42: aload_0
    //   43: getfield ZQ : Lburp/Zbc9;
    //   46: iload_3
    //   47: invokevirtual Zv : (I)V
    //   50: aload_0
    //   51: invokestatic ZF : (Ljava/awt/Component;)V
    //   54: return
    // Exception table:
    //   from	to	target	type
    //   0	11	14	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/IllegalArgumentException
    //   28	36	36	java/lang/IllegalArgumentException
  }
  
  public static Zmld Zl(List<Zmon> paramList, Ztos<Zt1j> paramZtos) {
    return new Zmld(paramList, paramZtos);
  }
  
  private void lambda$setSelectedView$5(Zb00 paramZb00) {
    this.ZW.Zk(paramZb00.ZLR());
  }
  
  private static boolean lambda$setSelectedView$4(Zs_i paramZs_i, Zb00 paramZb00) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramZb00.ZsO() == paramZs_i);
  }
  
  private void lambda$new$3(Zgb6 paramZgb6, Zern paramZern, Zxoz paramZxoz, HierarchyEvent paramHierarchyEvent) {
    int i = Zs_i.ZS();
    try {
      if ((paramHierarchyEvent.getChangeFlags() & 0x2L) != 0L) {
        try {
          if (isDisplayable()) {
            try {
              paramZgb6.ZD(paramZern);
              paramZgb6.ZS(paramZxoz);
              if (i != 0) {
                paramZgb6.ZF(paramZern);
                paramZgb6.Zd(paramZxoz);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramZgb6.ZF(paramZern);
    paramZgb6.Zd(paramZxoz);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    ZJ((Zrpp)paramZxr8.ZF().orElseThrow(IllegalArgumentException::new));
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    ZJ(false);
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    ZJ(true);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '·®cKO|zùÈá"(`Q^HÍ$;bl:Ü'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #22
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #86
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'Êo=÷%Ë}ç'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #10
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zbdt.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbdt.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #90
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #33
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #27
    //   234: goto -> 244
    //   237: bipush #61
    //   239: goto -> 244
    //   242: bipush #82
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE86A) & 0xFFFF;
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
      char c = 'ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */