package burp;

import java.util.ArrayList;
import net.portswigger.Zkb;

class Zm18 implements Zmxf {
  private final Zey9 Ze;
  
  private final Zefx ZK;
  
  private final Zlou ZZ;
  
  private static final String a;
  
  private Zm18(Zey9 paramZey9, Zefx paramZefx, Zlou paramZlou) {
    this.Ze = paramZey9;
    this.ZK = paramZefx;
    this.ZZ = paramZlou;
  }
  
  public Zefx ZF(Zr6h paramZr6h) {
    int i = Zeg6.ZX(paramZr6h.ZK(), Zm18::lambda$modify$0);
    if (i == -1)
      return this.ZK; 
    Ztnz ztnz1 = paramZr6h.ZK().get(i);
    byte[] arrayOfByte1 = Zljl.Zz(Zeg6.Zs(ztnz1), this.ZK.ZF(), Zkb.Zy(this.ZZ.ZA), Zkb.Zy(this.ZZ.Zr));
    byte[] arrayOfByte2 = Zeg6.Zu(arrayOfByte1);
    Ztnz ztnz2 = new Ztnz(ztnz1.Ze, arrayOfByte2);
    ArrayList<Ztnz> arrayList = new ArrayList<>(paramZr6h.ZK());
    arrayList.set(i, ztnz2);
    Zmzk zmzk = paramZr6h.ZT();
    return this.Ze.ZR(zmzk, arrayList, paramZr6h.Zw());
  }
  
  private static boolean lambda$modify$0(Ztnz paramZtnz) {
    return Ztnz.ZM(paramZtnz.Ze).equals(a);
  }
  
  static {
    // Byte code:
    //   0: bipush #79
    //   2: ldc 'jS'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm18.a : Ljava/lang/String;
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
    //   80: bipush #126
    //   82: goto -> 112
    //   85: bipush #85
    //   87: goto -> 112
    //   90: bipush #125
    //   92: goto -> 112
    //   95: bipush #42
    //   97: goto -> 112
    //   100: bipush #57
    //   102: goto -> 112
    //   105: bipush #34
    //   107: goto -> 112
    //   110: bipush #121
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm18.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */