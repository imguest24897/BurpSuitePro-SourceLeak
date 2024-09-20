package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zm4h<S extends Zg0z, E extends Zvb> implements Zxa2 {
  private final List<Zlq2> Zk = new CopyOnWriteArrayList<>();
  
  private static final String a;
  
  public Zm4h(Zejc<S, E> paramZejc) {
    ZV(new Zlq2(paramZejc));
  }
  
  public Zm6s<? extends Zm75> Z_() {
    try {
      if (ZP())
        return Zm6s.ZG(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      switch (((Zs35)(ZT()).Zb.get()).ordinal()) {
        case 0:
          return ZT().Zq();
        case 1:
          return ZT().Zt(this::ZV);
        case 2:
          return ZT().ZL();
        case 3:
          return ZT().Zr();
        case 4:
          return ZT().Zk(this::Zz);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(ZT().toString());
  }
  
  public boolean ZP() {
    return ((Zlq2)this.Zk.get(0)).Zc();
  }
  
  private void ZV(Zlq2 paramZlq2) {
    this.Zk.add(paramZlq2);
  }
  
  private Zlq2 ZT() {
    return this.Zk.get(this.Zk.size() - 1);
  }
  
  private Zlq2 Zz() {
    try {
      if (this.Zk.size() > 1)
        return this.Zk.remove(this.Zk.size() - 1); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public String toString() {
    return a + a;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: ldc 'BR{kfrH{drC$'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm4h.a : Ljava/lang/String;
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
    //   80: bipush #27
    //   82: goto -> 112
    //   85: bipush #113
    //   87: goto -> 112
    //   90: bipush #127
    //   92: goto -> 112
    //   95: bipush #44
    //   97: goto -> 112
    //   100: bipush #20
    //   102: goto -> 112
    //   105: bipush #44
    //   107: goto -> 112
    //   110: bipush #13
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */