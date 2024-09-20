package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.swing.JPopupMenu;

public class Ztim<T extends Zr6e> implements Ztuc {
  private final Supplier<Zlte> Zt;
  
  private final Zrsj<T> Zc;
  
  private final Ztca Zn;
  
  private final boolean Zf;
  
  private final boolean ZX;
  
  private final Predicate<Integer> ZO;
  
  private final boolean ZE;
  
  private final boolean Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztim(Supplier<Zlte> paramSupplier, Zrsj<T> paramZrsj, Ztca paramZtca, boolean paramBoolean1, boolean paramBoolean2, Predicate<Integer> paramPredicate, boolean paramBoolean3, boolean paramBoolean4) {
    this.Zt = paramSupplier;
    this.Zc = paramZrsj;
    this.Zn = paramZtca;
    this.Zf = paramBoolean1;
    this.ZX = paramBoolean2;
    this.ZO = paramPredicate;
    this.ZE = paramBoolean3;
    this.Zw = paramBoolean4;
  }
  
  public Zkj9 Zg(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZO : Ljava/util/function/Predicate;
    //   7: iload_2
    //   8: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11: invokeinterface test : (Ljava/lang/Object;)Z
    //   16: istore #4
    //   18: astore_3
    //   19: aload_0
    //   20: getfield Zf : Z
    //   23: ifne -> 47
    //   26: aload_0
    //   27: getfield ZE : Z
    //   30: ifne -> 47
    //   33: aload_0
    //   34: getfield ZX : Z
    //   37: ifne -> 47
    //   40: iload #4
    //   42: ifne -> 47
    //   45: aconst_null
    //   46: areturn
    //   47: new burp/Zkj9
    //   50: dup
    //   51: invokespecial <init> : ()V
    //   54: astore #5
    //   56: aload #5
    //   58: sipush #22935
    //   61: sipush #21083
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokevirtual setName : (Ljava/lang/String;)V
    //   70: aload_0
    //   71: getfield Zc : Lburp/Zrsj;
    //   74: iload_2
    //   75: invokeinterface ZD : (I)Lburp/Zr6e;
    //   80: astore #6
    //   82: aload_0
    //   83: getfield Zf : Z
    //   86: ifeq -> 95
    //   89: aload_0
    //   90: aload #5
    //   92: invokevirtual Zo : (Lburp/Zkj9;)V
    //   95: iload #4
    //   97: ifeq -> 106
    //   100: aload_0
    //   101: aload #5
    //   103: invokevirtual ZF : (Lburp/Zkj9;)V
    //   106: aload_0
    //   107: getfield Zf : Z
    //   110: ifeq -> 156
    //   113: aload #6
    //   115: ifnull -> 129
    //   118: aload_0
    //   119: aload #5
    //   121: iload_2
    //   122: invokevirtual ZS : (Lburp/Zkj9;I)V
    //   125: aload_3
    //   126: ifnull -> 136
    //   129: aload_0
    //   130: aload #5
    //   132: iload_2
    //   133: invokevirtual ZJ : (Lburp/Zkj9;I)V
    //   136: aload #5
    //   138: new javax/swing/JPopupMenu$Separator
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   148: pop
    //   149: aload_0
    //   150: aload #5
    //   152: iload_1
    //   153: invokevirtual Zj : (Lburp/Zkj9;Z)V
    //   156: aload_0
    //   157: getfield ZE : Z
    //   160: ifeq -> 173
    //   163: aload_0
    //   164: aload #5
    //   166: aload_0
    //   167: getfield Zf : Z
    //   170: invokevirtual Zw : (Lburp/Zkj9;Z)V
    //   173: aload #5
    //   175: areturn
  }
  
  public Zkj9 ZW(boolean paramBoolean) {
    Zkj9 zkj9 = new Zkj9();
    if (this.Zw)
      Zj(zkj9, paramBoolean); 
    if (this.Zf)
      ZD(zkj9); 
    if (this.ZE)
      Zw(zkj9, this.Zf); 
    if (this.ZX) {
      zkj9.add(new JPopupMenu.Separator());
      Zepk zepk = Zz(138752);
      zepk.setEnabled(this.Zc.ZL());
      zkj9.add(zepk);
    } 
    return zkj9;
  }
  
  public Zkj9 ZX(int paramInt) {
    Zkj9 zkj9 = new Zkj9();
    Zl(zkj9, paramInt);
    Zw(zkj9, true);
    return zkj9;
  }
  
  private void ZD(Zkj9 paramZkj9) {
    Zepk zepk = Zr98.Zt(this.Zt.get(), 137728, a(22969, -4097));
    zepk.setName(a(22970, 18509));
    paramZkj9.add(zepk);
  }
  
  private void Zo(Zkj9 paramZkj9) {
    Zepk zepk1 = Zr98.Zt(this.Zt.get(), 138496, a(22944, -27851));
    Zepk zepk2 = Zr98.Zt(this.Zt.get(), 266752, a(22967, -119));
    zepk1.setName(a(22955, 30122));
    zepk2.setName(a(22972, 4308));
    paramZkj9.add(zepk1);
    paramZkj9.add(zepk2);
  }
  
  private void ZS(Zkj9 paramZkj9, int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zt : Ljava/util/function/Supplier;
    //   7: invokeinterface get : ()Ljava/lang/Object;
    //   12: checkcast burp/Zzyl
    //   15: ldc 139264
    //   17: sipush #22946
    //   20: sipush #-6408
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: invokestatic Zt : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   29: astore #4
    //   31: aload_0
    //   32: getfield Zt : Ljava/util/function/Supplier;
    //   35: invokeinterface get : ()Ljava/lang/Object;
    //   40: checkcast burp/Zzyl
    //   43: ldc 139520
    //   45: sipush #22928
    //   48: sipush #-13460
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: invokestatic Zt : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   57: astore #5
    //   59: aload #4
    //   61: sipush #22975
    //   64: sipush #-3634
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual setName : (Ljava/lang/String;)V
    //   73: aload #5
    //   75: sipush #22929
    //   78: sipush #32188
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual setName : (Ljava/lang/String;)V
    //   87: astore_3
    //   88: aload_1
    //   89: aload #4
    //   91: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   94: pop
    //   95: aload_1
    //   96: aload #5
    //   98: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   101: pop
    //   102: aload_0
    //   103: getfield Zc : Lburp/Zrsj;
    //   106: iload_2
    //   107: invokeinterface Zt : (I)Lnet/portswigger/Zto;
    //   112: astore #6
    //   114: aload #5
    //   116: aload #6
    //   118: getfield Zq : Ljava/lang/Object;
    //   121: checkcast java/lang/Integer
    //   124: aload #6
    //   126: getfield Zo : Ljava/lang/Object;
    //   129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   132: ifne -> 139
    //   135: iconst_1
    //   136: goto -> 140
    //   139: iconst_0
    //   140: invokevirtual setEnabled : (Z)V
    //   143: new burp/Zztv
    //   146: dup
    //   147: sipush #22950
    //   150: sipush #-24442
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: astore #7
    //   161: aload #7
    //   163: sipush #22966
    //   166: sipush #-17155
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: invokevirtual setName : (Ljava/lang/String;)V
    //   175: aload_1
    //   176: aload #7
    //   178: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   181: pop
    //   182: aload #7
    //   184: aload_0
    //   185: ldc 139776
    //   187: invokevirtual Zz : (I)Lburp/Zepk;
    //   190: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   193: pop
    //   194: aload_0
    //   195: getfield Zc : Lburp/Zrsj;
    //   198: invokeinterface ZF : ()Ljava/util/List;
    //   203: astore #8
    //   205: aload #8
    //   207: invokeinterface size : ()I
    //   212: iconst_1
    //   213: if_icmple -> 353
    //   216: aload #7
    //   218: new javax/swing/JPopupMenu$Separator
    //   221: dup
    //   222: invokespecial <init> : ()V
    //   225: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   228: pop
    //   229: aload_0
    //   230: getfield Zc : Lburp/Zrsj;
    //   233: iload_2
    //   234: invokeinterface ZD : (I)Lburp/Zr6e;
    //   239: astore #9
    //   241: aload #8
    //   243: invokeinterface iterator : ()Ljava/util/Iterator;
    //   248: astore #10
    //   250: aload #10
    //   252: invokeinterface hasNext : ()Z
    //   257: ifeq -> 353
    //   260: aload #10
    //   262: invokeinterface next : ()Ljava/lang/Object;
    //   267: checkcast burp/Zr6e
    //   270: astore #11
    //   272: aload #11
    //   274: aload #9
    //   276: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   281: ifne -> 349
    //   284: new burp/Zepe
    //   287: dup
    //   288: aload #11
    //   290: invokeinterface ZyV : ()Ljava/lang/String;
    //   295: invokespecial <init> : (Ljava/lang/String;)V
    //   298: astore #12
    //   300: aload #7
    //   302: aload #12
    //   304: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   307: pop
    //   308: aload #12
    //   310: aload_0
    //   311: iload_2
    //   312: aload #11
    //   314: <illegal opcode> actionPerformed : (Lburp/Ztim;ILburp/Zr6e;)Ljava/awt/event/ActionListener;
    //   319: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   322: aload #12
    //   324: aload #11
    //   326: invokeinterface ZyV : ()Ljava/lang/String;
    //   331: sipush #22951
    //   334: sipush #-3895
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: swap
    //   341: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   346: invokevirtual setName : (Ljava/lang/String;)V
    //   349: aload_3
    //   350: ifnull -> 250
    //   353: return
  }
  
  private void ZJ(Zkj9 paramZkj9, int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zt : Ljava/util/function/Supplier;
    //   7: invokeinterface get : ()Ljava/lang/Object;
    //   12: checkcast burp/Zlte
    //   15: invokeinterface getTabCount : ()I
    //   20: istore #4
    //   22: aload_0
    //   23: getfield Zt : Ljava/util/function/Supplier;
    //   26: invokeinterface get : ()Ljava/lang/Object;
    //   31: checkcast burp/Zzyl
    //   34: ldc 266768
    //   36: sipush #22931
    //   39: sipush #22491
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: invokestatic Zt : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   48: astore #5
    //   50: aload_0
    //   51: getfield Zt : Ljava/util/function/Supplier;
    //   54: invokeinterface get : ()Ljava/lang/Object;
    //   59: checkcast burp/Zzyl
    //   62: ldc 137984
    //   64: sipush #22941
    //   67: sipush #-19924
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokestatic Zt : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   76: astore #6
    //   78: astore_3
    //   79: aload_0
    //   80: getfield Zt : Ljava/util/function/Supplier;
    //   83: invokeinterface get : ()Ljava/lang/Object;
    //   88: checkcast burp/Zzyl
    //   91: ldc 138240
    //   93: sipush #22964
    //   96: sipush #-13543
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokestatic Zt : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   105: astore #7
    //   107: aload #5
    //   109: iload #4
    //   111: iconst_1
    //   112: if_icmple -> 119
    //   115: iconst_1
    //   116: goto -> 120
    //   119: iconst_0
    //   120: invokevirtual setEnabled : (Z)V
    //   123: aload #6
    //   125: iload_2
    //   126: ifle -> 133
    //   129: iconst_1
    //   130: goto -> 134
    //   133: iconst_0
    //   134: invokevirtual setEnabled : (Z)V
    //   137: aload #7
    //   139: iload_2
    //   140: iload #4
    //   142: iconst_1
    //   143: isub
    //   144: if_icmpge -> 151
    //   147: iconst_1
    //   148: goto -> 152
    //   151: iconst_0
    //   152: invokevirtual setEnabled : (Z)V
    //   155: aload #5
    //   157: sipush #22960
    //   160: sipush #11874
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: invokevirtual setName : (Ljava/lang/String;)V
    //   169: aload #6
    //   171: sipush #22953
    //   174: sipush #15594
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual setName : (Ljava/lang/String;)V
    //   183: aload #7
    //   185: sipush #22934
    //   188: sipush #-21121
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokevirtual setName : (Ljava/lang/String;)V
    //   197: aload_1
    //   198: aload #5
    //   200: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   203: pop
    //   204: aload_1
    //   205: aload #6
    //   207: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   210: pop
    //   211: aload_1
    //   212: aload #7
    //   214: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   217: pop
    //   218: aload_0
    //   219: getfield ZX : Z
    //   222: ifeq -> 422
    //   225: new burp/Zztv
    //   228: dup
    //   229: sipush #22930
    //   232: sipush #-25864
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: invokespecial <init> : (Ljava/lang/String;)V
    //   241: astore #8
    //   243: aload #8
    //   245: sipush #22959
    //   248: sipush #-4496
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: invokevirtual setName : (Ljava/lang/String;)V
    //   257: aload_1
    //   258: new javax/swing/JPopupMenu$Separator
    //   261: dup
    //   262: invokespecial <init> : ()V
    //   265: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   268: pop
    //   269: aload_1
    //   270: aload #8
    //   272: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   275: pop
    //   276: aload #8
    //   278: aload_0
    //   279: ldc 139008
    //   281: invokevirtual Zz : (I)Lburp/Zepk;
    //   284: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   287: pop
    //   288: aload_0
    //   289: getfield Zc : Lburp/Zrsj;
    //   292: invokeinterface ZF : ()Ljava/util/List;
    //   297: astore #9
    //   299: aload #9
    //   301: invokeinterface isEmpty : ()Z
    //   306: ifne -> 422
    //   309: aload #8
    //   311: new javax/swing/JPopupMenu$Separator
    //   314: dup
    //   315: invokespecial <init> : ()V
    //   318: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   321: pop
    //   322: aload #9
    //   324: invokeinterface iterator : ()Ljava/util/Iterator;
    //   329: astore #10
    //   331: aload #10
    //   333: invokeinterface hasNext : ()Z
    //   338: ifeq -> 422
    //   341: aload #10
    //   343: invokeinterface next : ()Ljava/lang/Object;
    //   348: checkcast burp/Zr6e
    //   351: astore #11
    //   353: new burp/Zepe
    //   356: dup
    //   357: aload #11
    //   359: invokeinterface ZyV : ()Ljava/lang/String;
    //   364: invokespecial <init> : (Ljava/lang/String;)V
    //   367: astore #12
    //   369: aload #8
    //   371: aload #12
    //   373: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   376: pop
    //   377: aload #12
    //   379: aload_0
    //   380: iload_2
    //   381: aload #11
    //   383: <illegal opcode> actionPerformed : (Lburp/Ztim;ILburp/Zr6e;)Ljava/awt/event/ActionListener;
    //   388: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   391: aload #12
    //   393: aload #11
    //   395: invokeinterface ZyV : ()Ljava/lang/String;
    //   400: sipush #22945
    //   403: sipush #24320
    //   406: invokestatic a : (II)Ljava/lang/String;
    //   409: swap
    //   410: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   415: invokevirtual setName : (Ljava/lang/String;)V
    //   418: aload_3
    //   419: ifnull -> 331
    //   422: return
  }
  
  private Zepk Zz(int paramInt) {
    Ze9n ze9n = Ze3m.ZC(Zeuf.NEW_TAB_GROUP, Zlkk.FOREGROUND).Z_();
    Zepk zepk = Zr98.Zi(this.Zt.get(), paramInt, a(22932, -31022), ze9n);
    zepk.setName(a(22954, 10495));
    return zepk;
  }
  
  private void Zj(Zkj9 paramZkj9, boolean paramBoolean) {
    Zepk zepk = Zr98.Zt(this.Zt.get(), 266784, a(22961, -4547));
    zepk.setName(a(22962, 13175));
    zepk.setEnabled(paramBoolean);
    paramZkj9.add(zepk);
  }
  
  private void ZF(Zkj9 paramZkj9) {
    Zepk zepk = Zr98.Zt(this.Zt.get(), 266816, a(22963, 31036));
    zepk.setName(a(22947, -10014));
    paramZkj9.add(zepk);
  }
  
  private void Zw(Zkj9 paramZkj9, boolean paramBoolean) {
    Zztv zztv = new Zztv(a(22943, 6819));
    zztv.setName(a(22965, -4654));
    Ztal ztal = ((Zlte)this.Zt.get()).Zj();
    Ze9n ze9n1 = Ze3m.ZC(Zeuf.TICK, Zlkk.FOREGROUND).Z_();
    Ze9n ze9n2 = (ztal == Ztal.SCROLLING) ? ze9n1 : Ze3m.ZC(Zeuf.HORIZONTAL_SCROLLING_VIEW, Zlkk.FOREGROUND).Z_();
    Ze9n ze9n3 = (ztal == Ztal.WRAPPED) ? ze9n1 : Ze3m.ZC(Zeuf.HORIZONTAL_WRAPPED_VIEW, Zlkk.FOREGROUND).Z_();
    Zepk zepk1 = Zr98.Zi(this.Zt.get(), 137216, a(22940, -6930), ze9n2);
    Zepk zepk2 = Zr98.Zi(this.Zt.get(), 137472, a(22968, -1588), ze9n3);
    zepk1.setSelected((ztal == Ztal.SCROLLING));
    zepk2.setSelected((ztal == Ztal.WRAPPED));
    zepk1.setName(a(22973, -3680));
    zepk2.setName(a(22949, -16694));
    zztv.add(zepk1);
    zztv.add(zepk2);
    if (paramBoolean)
      paramZkj9.add(new JPopupMenu.Separator()); 
    paramZkj9.add(zztv);
  }
  
  private void Zl(Zkj9 paramZkj9, int paramInt) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #22942
    //   7: sipush #32056
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_3
    //   17: aload_3
    //   18: sipush #22952
    //   21: sipush #26941
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: invokevirtual setName : (Ljava/lang/String;)V
    //   30: aload_3
    //   31: aload_0
    //   32: iload_2
    //   33: <illegal opcode> actionPerformed : (Lburp/Ztim;I)Ljava/awt/event/ActionListener;
    //   38: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   41: aload_0
    //   42: getfield Zc : Lburp/Zrsj;
    //   45: iload_2
    //   46: invokeinterface ZD : (I)Lburp/Zr6e;
    //   51: astore #4
    //   53: aload #4
    //   55: invokeinterface Zy5 : ()I
    //   60: istore #5
    //   62: aload_0
    //   63: iload_2
    //   64: iload #5
    //   66: aload #4
    //   68: invokevirtual Zb : (IILburp/Zr6e;)Lburp/Zepe;
    //   71: astore #6
    //   73: new burp/Zepe
    //   76: dup
    //   77: sipush #22956
    //   80: sipush #13707
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: astore #7
    //   91: aload #7
    //   93: sipush #22933
    //   96: sipush #-31570
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokevirtual setName : (Ljava/lang/String;)V
    //   105: aload #7
    //   107: aload_0
    //   108: iload_2
    //   109: <illegal opcode> actionPerformed : (Lburp/Ztim;I)Ljava/awt/event/ActionListener;
    //   114: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   117: aload_1
    //   118: aload #7
    //   120: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   123: pop
    //   124: aload_1
    //   125: new javax/swing/JPopupMenu$Separator
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   135: pop
    //   136: aload_1
    //   137: aload_3
    //   138: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   141: pop
    //   142: aload_1
    //   143: aload #6
    //   145: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   148: pop
    //   149: return
  }
  
  private Zepe Zb(int paramInt1, int paramInt2, T paramT) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #22938
    //   7: sipush #-25881
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore #4
    //   18: aload #4
    //   20: sipush #22957
    //   23: sipush #5657
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: invokevirtual setName : (Ljava/lang/String;)V
    //   32: aload #4
    //   34: aload_0
    //   35: iload_2
    //   36: aload_3
    //   37: iload_1
    //   38: <illegal opcode> actionPerformed : (Lburp/Ztim;ILburp/Zr6e;I)Ljava/awt/event/ActionListener;
    //   43: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   46: aload #4
    //   48: areturn
  }
  
  private void lambda$buildCloseAllTabsInGroupMenuItem$4(int paramInt1, Zr6e paramZr6e, int paramInt2, ActionEvent paramActionEvent) {
    a(22974, 13113);
    boolean bool = (paramInt1 == 1 || Zxt1.Zy((Component)this.Zt.get(), a(22974, 13113) + a(22974, 13113) + paramInt1 + a(22958, -5199) + paramZr6e.ZyV(), a(22948, -26207), 2)) ? true : false;
    if (bool) {
      this.Zc.Zu(this.Zt.get(), paramInt2);
      this.Zn.Zj();
    } 
  }
  
  private void lambda$buildGroupActions$3(int paramInt, ActionEvent paramActionEvent) {
    this.Zc.ZZ(this.Zt.get(), paramInt);
  }
  
  private void lambda$buildGroupActions$2(int paramInt, ActionEvent paramActionEvent) {
    this.Zc.ZK(this.Zt.get(), paramInt);
    this.Zn.ZM();
  }
  
  private void lambda$buildActionsForTabNotInGroup$1(int paramInt, Zr6e paramZr6e, ActionEvent paramActionEvent) {
    Zliy<T> zliy = this.Zc.ZC(paramInt);
    this.Zc.Zz(this.Zt.get(), zliy, (T)paramZr6e);
    this.Zn.ZE();
  }
  
  private void lambda$buildActionsForTabInGroup$0(int paramInt, Zr6e paramZr6e, ActionEvent paramActionEvent) {
    Zliy<T> zliy = this.Zc.ZC(paramInt);
    this.Zc.ZW(this.Zt.get(), paramInt);
    this.Zc.Zz(this.Zt.get(), zliy, (T)paramZr6e);
    this.Zn.ZE();
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '÷ø²¯BÄèd\âµiûr\\rü>\\f ß£¶D\\t ÚfÇ\\n(aîìM üÒO©î²j¥ýÿUöèª£À8þ¢+Ø­çïîÿ|eS^_|òv! J±½º«±kº¹µÛèë\\n÷=úàí¬Z,]þú\\rÄkðu»×?3t$í ãÑ0ºÿæP©özÉðÆüvö¯ó{þz®:(ti-;ðTç>ÁºÖÎc#Ä¢@ç\\nL.µ@v)]kt½Æ1ª¹ d·a+ÅbBä$"O\\biøëµèýtÁ µFð,³kàßhSá2h.|öÃ^zÄÃPE T|=@ÉBim!3.*E¼c¯¤\\tË9É*lWÑÊ«MòõIM´yº\\nK%]Á_´#j+ZÚ´¹6FlÏö(åv\\fßCûá\\f×[äÃëà|>¶m¿¸ÍàÚO%:âv§æiM£M·¸¢Ä&¤±Ø¶âg¨`Ýðú\\n6Ë/#ª1cÙ1JN¾k·¶ÇqøE/\\t°nPÔ*ò±Òþ¦Ý·Î´¼ÙÐt<Å SÀ[Ç¹Y>/ÛÃ»4µ|'7º®ägxLC\\tÆ/Jë§Óëå¸ë?XéÿC\\n®`w²ßîB%¶sªß¡wüÒ]¬z(Ì./üP@:^5y9¼ÀÉa5D4e$=³+|?÷¨ÑÄñï'±dÏ=\\r+i`,úTÝï\\b[úu)Æ`ÅòB\\nÎðçxÇîMû%7~ªO¬Xaä\\fÓÅ-Z:\\n@:Ù| (f¨èâwË|hM\\rÂ¤ÿ34êN¡*zµ²ö-cóqp VP¢TMÆ)!ÐÒ?ù\\rúj\\rv¯5Ó):GÔ!3hæômj!Øé^}*ccÁ+ké>. $ßC·è¬jßìÿbùß,wñ(Ï()çF¢Û\\f/éw%ü³fÇ8tÏr¶YiÔÏ/ö<_dã8nEM ka&`Dõ9J«h+J\\rt/tiYjÙBèÿ¥Fø\\näìÑ¬¨YÒÑ®¶*êZ"ºB#\Ë=(¡;4ÐêyiöJð÷ëÛMþlVÁÄQýy$zêÛîS@¨a²¼kÂ« dO4²5~;\\r½zOÐ@I´_'×Ú¶Û/ÊÕêFßý].Â¤ux^W ¹Áë¸%1Â ·W'Ò\\f®Ne{3£%øÉ>QÀ¨ô  îÏâ?X#BûåV6ðÍ8ç'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
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
    //   68: ldc 'ö<äcn'\\f¤åK¡0.çA hÅ~X¯g$ÞK)È-y7\\f %'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #22
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #8
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
    //   129: putstatic burp/Ztim.a : [Ljava/lang/String;
    //   132: bipush #45
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztim.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #123
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #127
    //   234: goto -> 244
    //   237: bipush #52
    //   239: goto -> 244
    //   242: bipush #33
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
    int i = (paramInt1 ^ 0x59B6) & 0xFFFF;
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
      char c = '­';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztim.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */