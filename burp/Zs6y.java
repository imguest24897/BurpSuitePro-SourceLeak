package burp;

import java.util.Arrays;
import java.util.Objects;

public class Zs6y {
  private final Zb1i[] ZZ;
  
  private final String ZJ;
  
  private static final String a;
  
  private Zs6y(Zb1i[] paramArrayOfZb1i, String paramString) {
    this.ZZ = paramArrayOfZb1i;
    this.ZJ = paramString;
  }
  
  public Zb1i[] Zt() {
    return this.ZZ;
  }
  
  public String ZA() {
    return this.ZJ;
  }
  
  public Zb1i Zo(Zlug paramZlug) {
    return Zt()[paramZlug.Zs()];
  }
  
  public int Zi(Zlug paramZlug) {
    Zb1i zb1i = Zt()[paramZlug.Zs()];
    return (zb1i == null) ? 0 : zb1i.ZN();
  }
  
  public String toString() {
    return String.format(a, new Object[] { ZA() });
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Zs6y))
      return false; 
    Zs6y zs6y = (Zs6y)paramObject;
    return (Arrays.equals((Object[])Zt(), (Object[])zs6y.Zt()) && Objects.equals(ZA(), zs6y.ZA()));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZZ, this.ZJ });
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc 'W@zd'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs6y.a : Ljava/lang/String;
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
    //   80: bipush #98
    //   82: goto -> 112
    //   85: bipush #120
    //   87: goto -> 112
    //   90: bipush #20
    //   92: goto -> 112
    //   95: bipush #80
    //   97: goto -> 112
    //   100: bipush #61
    //   102: goto -> 112
    //   105: bipush #99
    //   107: goto -> 112
    //   110: bipush #60
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */