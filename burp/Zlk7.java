package burp;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.IntSupplier;

public class Zlk7<T, U> implements Ztsb<T> {
  private static final ThreadFactory ZY;
  
  private final Zxlp<U> Zl;
  
  private final Zkoh<T, U> Zd;
  
  private final Zri2 ZC;
  
  private final IntSupplier ZP;
  
  private final Zxr3 Zu;
  
  public Zlk7(Zxlp<U> paramZxlp, Zkoh<T, U> paramZkoh, Zri2 paramZri2, IntSupplier paramIntSupplier, Zxr3 paramZxr3) {
    this.Zl = paramZxlp;
    this.Zd = paramZkoh;
    this.ZC = paramZri2;
    this.ZP = paramIntSupplier;
    this.Zu = paramZxr3;
  }
  
  public Zr6p<T> ZN(Zmfp paramZmfp) {
    if (paramZmfp instanceof Zrg) {
      Zrg zrg = (Zrg)paramZmfp;
      return new Zb05<>(zrg.identifier(), zrg.name(), zrg.ZT(), this.Zl, this.Zd, this.ZC, this.ZP, new Zx6v<>(), Executors.newSingleThreadExecutor(ZY), this.Zu);
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #92
    //   2: ldc ' b*,r[!v4:~[!l+;}'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #30
    //   82: goto -> 112
    //   85: bipush #95
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #18
    //   97: goto -> 112
    //   100: bipush #45
    //   102: goto -> 112
    //   105: bipush #79
    //   107: goto -> 112
    //   110: bipush #42
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: new burp/Zrdt
    //   157: dup
    //   158: aload_0
    //   159: invokespecial <init> : (Ljava/lang/String;)V
    //   162: putstatic burp/Zlk7.ZY : Ljava/util/concurrent/ThreadFactory;
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlk7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */