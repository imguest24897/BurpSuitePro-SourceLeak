package burp;

import java.util.function.Supplier;

public class Zzwb {
  private final Supplier<Ztwh> Zb;
  
  public Zzwb(Supplier<Ztwh> paramSupplier) {
    this.Zb = paramSupplier;
  }
  
  Ztbt Zf(Zxr8<Zk1g> paramZxr8) {
    // Byte code:
    //   0: invokestatic ZG : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_2
    //   11: ifnonnull -> 86
    //   14: aload_1
    //   15: invokevirtual ZF : ()Ljava/util/Optional;
    //   18: invokevirtual isEmpty : ()Z
    //   21: ifeq -> 37
    //   24: iconst_0
    //   25: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   28: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   31: aconst_null
    //   32: astore_3
    //   33: aload_2
    //   34: ifnonnull -> 86
    //   37: aload_1
    //   38: invokevirtual ZF : ()Ljava/util/Optional;
    //   41: invokevirtual get : ()Ljava/lang/Object;
    //   44: checkcast burp/Zk1g
    //   47: invokevirtual Zs : ()I
    //   50: istore #4
    //   52: aload_0
    //   53: iload #4
    //   55: invokevirtual ZZ : (I)Lburp/Ztbt;
    //   58: astore #5
    //   60: aload_0
    //   61: iload #4
    //   63: invokevirtual Zk : (I)Lburp/Ztbt;
    //   66: astore #6
    //   68: iconst_2
    //   69: anewarray burp/Ztbt
    //   72: dup
    //   73: iconst_0
    //   74: aload #5
    //   76: aastore
    //   77: dup
    //   78: iconst_1
    //   79: aload #6
    //   81: aastore
    //   82: invokestatic ZY : ([Lburp/Ztbt;)Lburp/Ztbt;
    //   85: astore_3
    //   86: aload_3
    //   87: areturn
  }
  
  private Ztbt ZZ(int paramInt) {
    Ztwh ztwh = this.Zb.get();
    byte b = ztwh.Zw() ? ztwh.ZY() : 999;
    if (b <= 3) {
      if (paramInt == 0)
        return Ztbt.INCREASE; 
      if (paramInt > 3)
        return Ztbt.DECREASE; 
    } else {
      if (paramInt < 2)
        return Ztbt.INCREASE; 
      if (paramInt > b)
        return Ztbt.DECREASE; 
    } 
    return Ztbt.STAY_SAME;
  }
  
  private Ztbt Zk(int paramInt) {
    Ztwh ztwh = this.Zb.get();
    return ztwh.ZK() ? ((paramInt < 2) ? Ztbt.INCREASE : ((paramInt > 5) ? Ztbt.DECREASE : Ztbt.STAY_SAME)) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */