package burp;

public abstract class Zz1f<T extends Zzwz> implements Zz1_ {
  final Zewx Zh;
  
  final Zbjl ZL;
  
  final T Zt;
  
  private final Zesv ZD;
  
  private final Zroy ZO;
  
  private final Zer0 Zm;
  
  private final Zxs7 Zs;
  
  private final Ze3n Zr;
  
  private static int Zn;
  
  Zz1f(Zesv paramZesv, Zbjl paramZbjl, Zroy paramZroy, Zxs7 paramZxs7, Zer0 paramZer0, T paramT, Zewx paramZewx, Ze3n paramZe3n) {
    this.ZD = paramZesv;
    this.ZL = paramZbjl;
    this.ZO = paramZroy;
    this.Zs = paramZxs7;
    this.Zm = paramZer0;
    this.Zt = paramT;
    this.Zh = paramZewx;
    this.Zr = paramZe3n;
  }
  
  void Zw(Zbll paramZbll) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZD : Lburp/Zesv;
    //   4: aload_0
    //   5: getfield Zr : Lburp/Ze3n;
    //   8: aload_0
    //   9: getfield Zs : Lburp/Zxs7;
    //   12: invokevirtual Za : (Lburp/Ze3n;Lburp/Zxs7;)Lburp/Zszi;
    //   15: astore_3
    //   16: invokestatic ZB : ()I
    //   19: iconst_0
    //   20: istore #4
    //   22: istore_2
    //   23: aload_0
    //   24: getfield Zr : Lburp/Ze3n;
    //   27: invokevirtual ZR : ()Z
    //   30: ifne -> 53
    //   33: aload_0
    //   34: getfield Zr : Lburp/Ze3n;
    //   37: invokevirtual ZU : ()Z
    //   40: ifne -> 53
    //   43: iinc #4, -1
    //   46: goto -> 53
    //   49: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   52: athrow
    //   53: aload_1
    //   54: aload_1
    //   55: getfield Zk : Lburp/Zewx;
    //   58: aload_3
    //   59: invokevirtual Zs : (Lburp/Zmhe;)Ljava/util/Optional;
    //   62: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   67: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   70: checkcast burp/Zlvf
    //   73: invokeinterface ZM : ()Lburp/Zzud;
    //   78: invokeinterface ZT : ()Lburp/Zb6q;
    //   83: invokeinterface Za : ()Lburp/Zstu;
    //   88: invokeinterface ZiD : ()[B
    //   93: putfield ZR : [B
    //   96: new burp/Zrh3
    //   99: dup
    //   100: aload_1
    //   101: getfield Zk : Lburp/Zewx;
    //   104: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   107: getfield ZO : Ljava/lang/String;
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: invokevirtual Zd : ()Lburp/Ztt6;
    //   116: astore #5
    //   118: aload #5
    //   120: ifnonnull -> 134
    //   123: iconst_0
    //   124: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   127: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   130: iload_2
    //   131: ifeq -> 232
    //   134: aload_0
    //   135: getfield ZL : Lburp/Zbjl;
    //   138: aload_1
    //   139: getfield Zk : Lburp/Zewx;
    //   142: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   145: invokeinterface Zb : (Lnet/portswigger/Zen;)Ljava/util/List;
    //   150: astore #6
    //   152: aload_1
    //   153: aload_0
    //   154: getfield ZO : Lburp/Zroy;
    //   157: aload_1
    //   158: getfield Zk : Lburp/Zewx;
    //   161: aload_0
    //   162: getfield Zm : Lburp/Zer0;
    //   165: aload #6
    //   167: invokeinterface Zb : (Lburp/Zewx;Lburp/Zer0;Ljava/util/List;)Ljava/util/List;
    //   172: putfield ZP : Ljava/util/List;
    //   175: goto -> 204
    //   178: astore #5
    //   180: aload #5
    //   182: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   185: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   188: iinc #4, -1
    //   191: goto -> 204
    //   194: astore #5
    //   196: aload #5
    //   198: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   201: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   204: aload_1
    //   205: getfield ZP : Ljava/util/List;
    //   208: invokeinterface isEmpty : ()Z
    //   213: ifeq -> 232
    //   216: iinc #4, 1
    //   219: iload #4
    //   221: iconst_3
    //   222: if_icmplt -> 23
    //   225: goto -> 232
    //   228: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   231: athrow
    //   232: return
    // Exception table:
    //   from	to	target	type
    //   33	46	49	burp/Zg57
    //   53	130	178	burp/Zg57
    //   53	130	194	burp/Zsc2
    //   134	175	178	burp/Zg57
    //   134	175	194	burp/Zsc2
    //   204	225	228	burp/Zg57
  }
  
  public static void ZN(int paramInt) {
    Zn = paramInt;
  }
  
  public static int ZB() {
    return Zn;
  }
  
  public static int Zz() {
    int i = ZB();
    try {
      if (i == 0)
        return 74; 
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Zg57 a(Zg57 paramZg57) {
    return paramZg57;
  }
  
  static {
    if (ZB() != 0)
      ZN(112); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */