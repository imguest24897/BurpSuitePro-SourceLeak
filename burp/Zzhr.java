package burp;

class Zzhr implements Zzva {
  private final Zs1m ZT;
  
  private static final String a;
  
  Zzhr(Zs1m paramZs1m) {
    this.ZT = paramZs1m;
  }
  
  public Zsgw ZA(Ze44 paramZe44, int paramInt, Zsxd paramZsxd, Zlgm paramZlgm) {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore #5
    //   5: aload_3
    //   6: invokeinterface ZG : ()Lburp/Zg3d;
    //   11: invokeinterface ZR : ()Lburp/Zefx;
    //   16: astore #6
    //   18: aload_0
    //   19: aload #4
    //   21: aload #6
    //   23: invokevirtual ZS : (Lburp/Zlgm;Lburp/Zefx;)Z
    //   26: ifeq -> 38
    //   29: new burp/Zsgw
    //   32: dup
    //   33: aload_3
    //   34: invokespecial <init> : (Lburp/Zsxd;)V
    //   37: areturn
    //   38: aload #6
    //   40: invokeinterface Zc : ()Ljava/util/List;
    //   45: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   50: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   55: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   60: aload_0
    //   61: <illegal opcode> test : (Lburp/Zzhr;)Ljava/util/function/Predicate;
    //   66: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   71: invokeinterface toList : ()Ljava/util/List;
    //   76: astore #7
    //   78: aload #7
    //   80: invokeinterface isEmpty : ()Z
    //   85: ifne -> 126
    //   88: aload #6
    //   90: aload_0
    //   91: getfield ZT : Lburp/Zs1m;
    //   94: invokevirtual Zn : ()Ljava/lang/String;
    //   97: aload_0
    //   98: getfield ZT : Lburp/Zs1m;
    //   101: invokevirtual Zd : ()Ljava/lang/String;
    //   104: invokeinterface ZA : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zefx;
    //   109: astore #8
    //   111: aload_0
    //   112: aload_1
    //   113: iload_2
    //   114: aload #6
    //   116: aload #8
    //   118: invokevirtual Zv : (Lburp/Ze44;ILburp/Zefx;Lburp/Zefx;)V
    //   121: iload #5
    //   123: ifne -> 188
    //   126: aload_0
    //   127: getfield ZT : Lburp/Zs1m;
    //   130: invokevirtual Zr : ()Z
    //   133: ifeq -> 184
    //   136: aload #6
    //   138: aload_0
    //   139: getfield ZT : Lburp/Zs1m;
    //   142: invokevirtual ZI : ()Lburp/Zrdu;
    //   145: aload_0
    //   146: getfield ZT : Lburp/Zs1m;
    //   149: invokevirtual Zn : ()Ljava/lang/String;
    //   152: aload_0
    //   153: getfield ZT : Lburp/Zs1m;
    //   156: invokevirtual Zd : ()Ljava/lang/String;
    //   159: invokestatic Z_ : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;)Lburp/Zlou;
    //   162: invokeinterface ZH : (Lburp/Zlou;)Lburp/Zefx;
    //   167: astore #8
    //   169: aload_0
    //   170: aload_1
    //   171: iload_2
    //   172: aload #6
    //   174: aload #8
    //   176: invokevirtual Zv : (Lburp/Ze44;ILburp/Zefx;Lburp/Zefx;)V
    //   179: iload #5
    //   181: ifne -> 188
    //   184: aload #6
    //   186: astore #8
    //   188: new burp/Zsgw
    //   191: dup
    //   192: new burp/Ze5m
    //   195: dup
    //   196: aload #8
    //   198: invokespecial <init> : (Lburp/Zefx;)V
    //   201: invokespecial <init> : (Lburp/Zsxd;)V
    //   204: areturn
  }
  
  private void Zv(Ze44 paramZe44, int paramInt, Zefx paramZefx1, Zefx paramZefx2) {
    if (paramZe44 != null)
      paramZe44.ZI(Zgsg.INFO, paramInt, a + a + this.ZT.Zn() + "=", null, paramZefx1.ZT(), paramZefx2.Zb().ZD(), null); 
  }
  
  private boolean ZS(Zlgm paramZlgm, Zefx paramZefx) {
    return (paramZlgm == null) ? false : ((Zf(paramZlgm) || ZO(paramZlgm, paramZefx)));
  }
  
  private boolean Zf(Zlgm paramZlgm) {
    return (this.ZT.Zr() && !paramZlgm.Zh(this.ZT.ZI(), this.ZT.Zn()));
  }
  
  private boolean ZO(Zlgm paramZlgm, Zefx paramZefx) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface Zc : ()Ljava/util/List;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: aload_0
    //   12: <illegal opcode> test : (Lburp/Zzhr;)Ljava/util/function/Predicate;
    //   17: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   22: aload_0
    //   23: aload_1
    //   24: <illegal opcode> test : (Lburp/Zzhr;Lburp/Zlgm;)Ljava/util/function/Predicate;
    //   29: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   34: ireturn
  }
  
  private static boolean ZO(Zlou paramZlou) {
    switch (Zr0h.ZH[paramZlou.Zx.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      
    } 
    return false;
  }
  
  private boolean lambda$existingParameterModificationVetoed$2(Zlgm paramZlgm, Zlou paramZlou) {
    return !paramZlgm.Zh(paramZlou.Zx, this.ZT.Zn());
  }
  
  private boolean lambda$existingParameterModificationVetoed$1(Zlou paramZlou) {
    return this.ZT.Zn().equals(paramZlou.ZA);
  }
  
  private boolean lambda$performAction$0(Zlou paramZlou) {
    return paramZlou.ZA.equals(this.ZT.Zn());
  }
  
  static {
    // Byte code:
    //   0: bipush #123
    //   2: ldc '/+}>-,:)+>d\'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzhr.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #10
    //   87: goto -> 112
    //   90: bipush #36
    //   92: goto -> 112
    //   95: bipush #38
    //   97: goto -> 112
    //   100: bipush #53
    //   102: goto -> 112
    //   105: bipush #55
    //   107: goto -> 112
    //   110: bipush #37
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzhr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */