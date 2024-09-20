package burp;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Zxuh extends Zxui implements Zzr9 {
  private static final String d;
  
  Zxuh(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void ZR(Zsiv paramZsiv, Ztk0 paramZtk0, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    Zx88.Zq(paramZsiv, ZVj(), paramZz1m, paramZr69);
  }
  
  public Zbj5 ZHN() {
    return this.Za.<Zbj5>ZJ(this, Zkzc.Zk);
  }
  
  public Optional<Zski> ZHk() {
    return Optional.ofNullable(this.Za.<Zski>ZJ(this, Zkzc.Zy));
  }
  
  public void Zk(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Ztk0 paramZtk0, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    Zu1().ZK(paramZrp0);
  }
  
  public Collection<Zrp0> ZSA() {
    return Zu1().ZEN();
  }
  
  private Zkmk Zu1() {
    return this.Za.<Zkmk>ZJ(this, Zkzc.ZJ);
  }
  
  public String toString() {
    return ZHk().<String>map(Zski::ZyJ).orElse(d);
  }
  
  public boolean equals(Object paramObject) {
    return Zx88.ZY(paramObject, this);
  }
  
  public int hashCode() {
    return Zx88.Zf(this);
  }
  
  public Zeu4<? extends Zeu9> ZF() {
    return (Zeu4)Zzr9.ZC;
  }
  
  public List<Zgyy> ZVj() {
    return ((Zttl)this.Za.<Zttl>ZJ(this, Zkzc.ZU)).ZBK();
  }
  
  public Zzh4 ZVt() {
    return Zzh4.Zy(this.Za.ZL(this, Zkzc.ZW));
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: ldc 'Z*A'|E@uO'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxuh.d : Ljava/lang/String;
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
    //   80: bipush #64
    //   82: goto -> 112
    //   85: bipush #29
    //   87: goto -> 112
    //   90: bipush #47
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #110
    //   102: goto -> 112
    //   105: bipush #64
    //   107: goto -> 112
    //   110: bipush #49
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxuh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */