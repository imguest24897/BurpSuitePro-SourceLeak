package burp;

import java.time.Duration;
import net.portswigger.Zkb;

public class Zkva {
  private final Zxs7 ZJ;
  
  private final Zmhe Zm;
  
  private final Zkfg ZH;
  
  private final Duration Zo;
  
  private static final String a;
  
  public Zkva(Zxs7 paramZxs7, Zmhe paramZmhe, Zkfg paramZkfg, long paramLong) {
    this.ZJ = paramZxs7;
    this.Zm = paramZmhe;
    this.Zo = Duration.ofMillis(paramLong);
    this.ZH = paramZkfg;
  }
  
  Zej6 Zi(Zllr paramZllr, Zsm7 paramZsm7, int paramInt) {
    return (Zy(paramZllr, paramZsm7, paramInt)).ZB;
  }
  
  Zm0n Zy(Zllr paramZllr, Zsm7 paramZsm7, int paramInt) {
    String str2 = paramZllr.ZW.replace(a, String.valueOf(paramZsm7.Zb().toSeconds()));
    byte[] arrayOfByte = Zkb.Zy(Zv85.Zz(str2, paramInt));
    String str1 = Zm0n.ZX();
    if (paramZsm7.Zp) {
      Zlvf zlvf1 = this.Zm.ZK(Zri7.ZJ(new Zrrb(arrayOfByte, paramZllr.ZK())), Zlp5.Zc().Zd(false).ZQ(paramZsm7.Zh(this.Zo)));
      if (str1 != null) {
        Zbqc.Zr(new Zbqc[3]);
      } else {
        Zs2i zs2i1 = zlvf1.ZY();
        Zej6 zej61 = new Zej6(paramZsm7, zlvf1.ZM());
        return new Zm0n(zej61, zs2i1, zlvf1, arrayOfByte, ZA(paramZllr.ZK(), paramInt, arrayOfByte, zs2i1, zlvf1));
      } 
    } 
    Zlvf zlvf = this.Zm.ZK(Zri7.ZJ(new Zrrb(arrayOfByte, paramZllr.ZK())), Zlp5.Zc().Zd(false));
    Zs2i zs2i = zlvf.ZY();
    Zej6 zej6 = new Zej6(paramZsm7, zlvf.ZM());
    return new Zm0n(zej6, zs2i, zlvf, arrayOfByte, ZA(paramZllr.ZK(), paramInt, arrayOfByte, zs2i, zlvf));
  }
  
  private Zm4g ZA(byte paramByte, int paramInt, byte[] paramArrayOfbyte, Zs2i paramZs2i, Zlvf paramZlvf) {
    Zl6l zl6l = this.ZH.ZH(this.Zm, paramInt, paramByte, true, (byte)3, paramArrayOfbyte, paramZs2i, this.ZJ, paramZlvf);
    return (zl6l == null) ? null : zl6l.Zf;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 'Q'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkva.a : Ljava/lang/String;
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
    //   80: bipush #87
    //   82: goto -> 112
    //   85: bipush #9
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #77
    //   97: goto -> 112
    //   100: bipush #127
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #17
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkva.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */