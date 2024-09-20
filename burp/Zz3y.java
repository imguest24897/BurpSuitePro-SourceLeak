package burp;

import java.util.List;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz3y {
  private final List<Zxlk> ZA;
  
  private final Zkks Zz;
  
  private final Zmgu Zq;
  
  protected final Zthl Zm;
  
  private static final String a;
  
  Zz3y(List<Zxlk> paramList, Zkks paramZkks, Zmgu paramZmgu, Zthl paramZthl) {
    this.ZA = paramList;
    this.Zz = paramZkks;
    this.Zq = paramZmgu;
    this.Zm = paramZthl;
  }
  
  public int ZD() {
    return this.ZA.size();
  }
  
  public boolean ZW() {
    return (ZD() == 1);
  }
  
  public Zrp0 ZC() {
    return Zr().ZN();
  }
  
  Zxlk Zr() {
    return ZY(this.ZA.size() - 1);
  }
  
  public Zxlk ZY(int paramInt) {
    return this.ZA.get(paramInt);
  }
  
  public Zzl1 ZP(Consumer<Zzl1> paramConsumer, Zk2h paramZk2h, Zz3v paramZz3v) throws Zmnk, Zmn5 {
    try {
      if (ZW())
        return Zq(null, paramZk2h, paramZz3v); 
      Zzl1 zzl1 = ZW(paramConsumer, paramZk2h);
      return Zq(zzl1, paramZk2h, paramZz3v);
    } finally {
      this.Zm.Z_();
    } 
  }
  
  private Zzl1 Zq(Zzl1 paramZzl1, Zk2h paramZk2h, Zz3v paramZz3v) throws Zmnk, Zmn5 {
    Zkhi.Ze(paramZk2h, this.Zz.Zl());
    return Zi(Zr(), paramZzl1, paramZz3v);
  }
  
  private Zzl1 ZW(Consumer<Zzl1> paramConsumer, Zk2h paramZk2h) throws Zmnk, Zmn5 {
    Zzl1 zzl1 = null;
    byte b = 0;
    int i = Zxlk.ZO();
    while (b < ZD() - 1) {
      Zxlk zxlk = ZY(b);
      Zkhi.Zg(paramZk2h);
      zzl1 = Zi(zxlk, zzl1, Zz3v.ZW());
      paramConsumer.accept(zzl1);
      b++;
      if (i == 0)
        break; 
    } 
    return zzl1;
  }
  
  private Zzl1 Zi(Zxlk paramZxlk, Zzl1 paramZzl1, Zz3v paramZz3v) throws Zmnk, Zmn5 {
    try {
      return paramZxlk.Za(this.Zm, paramZzl1, this.Zq, paramZz3v);
    } catch (Zm_l|Zm_8|Zm_6 zm_l) {
      Zah.Zl(zm_l, Zk_.RETHROWN);
      throw zm_l;
    } catch (Zmn5 zmn5) {
      try {
        Zah.Zl(zmn5, Zk_.RETHROWN);
        if (paramZz3v.ZU())
          throw zmn5; 
      } catch (Zm_l zm_l) {
        throw a(null);
      } 
      throw new Zmnr(paramZxlk.ZN(), zmn5);
    } 
  }
  
  public String toString() {
    return String.format(a, new Object[] { Integer.valueOf(ZD()), ZC() });
  }
  
  public boolean Zs() {
    return (!this.ZA.isEmpty() && ((Zxlk)this.ZA.getFirst()).Zd());
  }
  
  private static Zm_l a(Zm_l paramZm_l) {
    return paramZm_l;
  }
  
  static {
    // Byte code:
    //   0: bipush #120
    //   2: ldc '#j/p&F*Sg>va]$S.?8rFlVx'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zz3y.a : Ljava/lang/String;
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
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #115
    //   87: goto -> 112
    //   90: bipush #35
    //   92: goto -> 112
    //   95: bipush #96
    //   97: goto -> 112
    //   100: bipush #126
    //   102: goto -> 112
    //   105: bipush #81
    //   107: goto -> 112
    //   110: bipush #52
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */