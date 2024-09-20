package burp;

public class Zrwc extends Zrwm {
  private final Zz2h ZD;
  
  private final Zsz4 ZB;
  
  private final Zz4i ZF;
  
  public Zrwc(Zz2h paramZz2h, Zsz4 paramZsz4, Zz4i paramZz4i) {
    this.ZD = paramZz2h;
    this.ZB = paramZsz4;
    this.ZF = paramZz4i;
  }
  
  public void Zr(Zrdb paramZrdb) {
    // Byte code:
    //   0: invokestatic Zl : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZD : Lburp/Zz2h;
    //   8: ifnonnull -> 30
    //   11: iconst_0
    //   12: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   15: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   18: aload_0
    //   19: getfield ZF : Lburp/Zz4i;
    //   22: aload_1
    //   23: invokevirtual ZK : (Lburp/Zrdb;)V
    //   26: iload_2
    //   27: ifeq -> 116
    //   30: aload_0
    //   31: getfield ZD : Lburp/Zz2h;
    //   34: invokevirtual Zs : ()Z
    //   37: ifeq -> 106
    //   40: aload_0
    //   41: getfield ZD : Lburp/Zz2h;
    //   44: invokevirtual ZO : ()Lburp/Zs37;
    //   47: astore_3
    //   48: aload_3
    //   49: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   54: dup
    //   55: astore #4
    //   57: monitorenter
    //   58: aload_0
    //   59: getfield ZB : Lburp/Zsz4;
    //   62: aload_1
    //   63: aload_3
    //   64: invokevirtual Za : (Lburp/Zrdb;Lburp/Zs37;)Ljava/util/Optional;
    //   67: astore #5
    //   69: aload #5
    //   71: aload_0
    //   72: getfield ZF : Lburp/Zz4i;
    //   75: dup
    //   76: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   79: pop
    //   80: <illegal opcode> accept : (Lburp/Zz4i;)Ljava/util/function/Consumer;
    //   85: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   88: aload #4
    //   90: monitorexit
    //   91: goto -> 102
    //   94: astore #6
    //   96: aload #4
    //   98: monitorexit
    //   99: aload #6
    //   101: athrow
    //   102: iload_2
    //   103: ifeq -> 116
    //   106: aload_0
    //   107: getfield Zu : Lburp/Zsmo;
    //   110: aload_1
    //   111: invokeinterface Zr : (Lburp/Zrdb;)V
    //   116: return
    // Exception table:
    //   from	to	target	type
    //   58	91	94	finally
    //   94	99	94	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */