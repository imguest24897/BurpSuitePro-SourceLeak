package burp;

public class Zs57 {
  public final Zs6y Zb;
  
  public final byte[] ZR;
  
  public final Zstu ZX;
  
  final long Zp;
  
  Zs57() {
    this(Zi(), null, null, null);
  }
  
  Zs57(long paramLong, Zs6y paramZs6y, byte[] paramArrayOfbyte, Zstu paramZstu) {
    this.Zb = paramZs6y;
    this.Zp = paramLong;
    this.ZR = paramArrayOfbyte;
    this.ZX = paramZstu;
  }
  
  private static long Zi() {
    long l = 0L;
    byte b = 0;
    boolean bool = Zrqj.Zj();
    while (b < 64) {
      l |= (1 << b);
      b++;
      if (bool)
        break; 
    } 
    return l;
  }
  
  static boolean Zb(Zs57 paramZs571, Zs57 paramZs572) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Zb : Lburp/Zs6y;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: getfield Zp : J
    //   13: aload_0
    //   14: getfield Zp : J
    //   17: land
    //   18: aload_1
    //   19: getfield Zp : J
    //   22: lcmp
    //   23: ifeq -> 28
    //   26: iconst_0
    //   27: ireturn
    //   28: invokestatic values : ()[Lburp/Zlug;
    //   31: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   34: aload_1
    //   35: <illegal opcode> test : (Lburp/Zs57;)Ljava/util/function/Predicate;
    //   40: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   45: aload_1
    //   46: aload_0
    //   47: <illegal opcode> test : (Lburp/Zs57;Lburp/Zs57;)Ljava/util/function/Predicate;
    //   52: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   57: ireturn
  }
  
  private static boolean Zw(Zs57 paramZs57, Zlug paramZlug) {
    return ((paramZs57.Zp & paramZlug.Ze()) != 0L && paramZs57.Zb.Zo(paramZlug) != null);
  }
  
  private static boolean lambda$hasSameInvariantAttributesAndSameValues$1(Zs57 paramZs571, Zs57 paramZs572, Zlug paramZlug) {
    Zb1i zb1i1 = paramZs571.Zb.Zo(paramZlug);
    Zb1i zb1i2 = paramZs572.Zb.Zo(paramZlug);
    return ((zb1i1 == null && zb1i2 != null) || (zb1i1 != null && zb1i2 == null)) ? false : ((zb1i1 == null) ? true : ((zb1i1.ZN() == zb1i2.ZN())));
  }
  
  private static boolean lambda$hasSameInvariantAttributesAndSameValues$0(Zs57 paramZs57, Zlug paramZlug) {
    return Zw(paramZs57, paramZlug);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs57.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */