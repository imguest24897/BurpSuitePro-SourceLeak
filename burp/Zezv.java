package burp;

public abstract class Zezv extends Zez7 {
  protected final Zl7h ZQ;
  
  protected final Zr69 Zd;
  
  private final Ztos<Zt35> ZB;
  
  protected final String Zp;
  
  protected final Zmv7 ZW;
  
  private static final String a;
  
  public Zezv(byte paramByte, Zr69 paramZr69, Zl7h paramZl7h, Ztos<Zt35> paramZtos, String paramString) {
    super(paramByte);
    this.ZQ = paramZl7h;
    this.Zd = paramZr69;
    this.ZB = paramZtos;
    this.Zp = paramString;
    this.ZW = paramZr69.ZD();
  }
  
  protected abstract Zrp0 Z_();
  
  public boolean ZN(Zsiv paramZsiv) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Zl7h;
    //   4: aconst_null
    //   5: invokeinterface Zu : (Lburp/Zszw;)V
    //   10: aload_0
    //   11: invokevirtual Z_ : ()Lburp/Zrp0;
    //   14: astore_2
    //   15: aload_2
    //   16: ifnull -> 98
    //   19: aload_1
    //   20: invokeinterface ZZR : ()V
    //   25: aload_1
    //   26: aload_2
    //   27: invokestatic Zw : (Lburp/Zrp0;)Lburp/Zs_g;
    //   30: invokevirtual ZF : ()Lburp/Zs_g;
    //   33: aload_0
    //   34: getfield Zd : Lburp/Zr69;
    //   37: aload_0
    //   38: getfield ZB : Lburp/Ztos;
    //   41: invokeinterface Zx : (Lburp/Zs_g;Lburp/Zr69;Lburp/Zz1m;)V
    //   46: aload_1
    //   47: aload_2
    //   48: invokeinterface ZH : (Lburp/Zrp0;)Lburp/Zlru;
    //   53: astore_3
    //   54: aload_0
    //   55: aload_2
    //   56: aload_3
    //   57: invokevirtual ZD : (Lburp/Zrp0;Lburp/Zlru;)Lburp/Zszw;
    //   60: astore #4
    //   62: aload_0
    //   63: getfield Zd : Lburp/Zr69;
    //   66: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   71: invokeinterface Zi : (Ljava/util/function/Predicate;)V
    //   76: aload_0
    //   77: getfield ZB : Lburp/Ztos;
    //   80: getstatic burp/Zt35.ZW : Lburp/Zlnb;
    //   83: aload_0
    //   84: aload_2
    //   85: aload #4
    //   87: <illegal opcode> accept : (Lburp/Zezv;Lburp/Zrp0;Lburp/Zszw;)Ljava/util/function/Consumer;
    //   92: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   95: pop
    //   96: iconst_1
    //   97: ireturn
    //   98: iconst_0
    //   99: ireturn
  }
  
  public void Zl(Zsiv paramZsiv, Zt1g paramZt1g) {}
  
  private Zszw ZD(Zrp0 paramZrp0, Zlru paramZlru) {
    Zg4y zg4y = this.ZQ.ZVz();
    return this.Zd.Zt() ? zg4y.ZV9() : zg4y.ZD(paramZrp0, paramZlru);
  }
  
  public String Zp() {
    return String.format(a, new Object[] { this.Zp });
  }
  
  private void lambda$beforeStart$2(Zrp0 paramZrp0, Zszw paramZszw, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_1
    //   3: aload_2
    //   4: <illegal opcode> accept : (Lburp/Zezv;Lburp/Zrp0;Lburp/Zszw;)Ljava/util/function/Consumer;
    //   9: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   12: return
  }
  
  private void lambda$beforeStart$1(Zrp0 paramZrp0, Zszw paramZszw, Ztas paramZtas) {
    Zt8i zt8i = paramZtas.ZUi();
    if (zt8i.Zsg().equals(paramZrp0) && !(zt8i.Zsu() instanceof Zxtr))
      this.ZQ.Zu(paramZszw); 
  }
  
  private static boolean lambda$beforeStart$0(Zrp0 paramZrp0) {
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: ldc 'YUY#_ Ar[7_!J{NS!J=Jq\7E*[|UT#G [lgX`'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zezv.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 93, 4 -> 98, 5 -> 103
    //   80: bipush #43
    //   82: goto -> 110
    //   85: iconst_4
    //   86: goto -> 110
    //   89: iconst_4
    //   90: goto -> 110
    //   93: bipush #124
    //   95: goto -> 110
    //   98: bipush #21
    //   100: goto -> 110
    //   103: bipush #119
    //   105: goto -> 110
    //   108: bipush #17
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */