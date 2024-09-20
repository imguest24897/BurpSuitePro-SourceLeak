package burp;

import net.portswigger.Zen;

public class Zgrd {
  private static final Zro0 Zn;
  
  private final Zb42 Zd;
  
  public Zgrd(Zzod paramZzod, int paramInt1, int paramInt2) {
    this.Zd = new Zb42(paramZzod, paramInt1, paramInt2, Zn, Zz5i.Zs);
  }
  
  Zzow ZR() {
    return this.Zd.Zu(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD);
  }
  
  public Zzow ZO(Zlp9 paramZlp9, Zen paramZen) {
    return this.Zd.Zc(paramZlp9, paramZen);
  }
  
  Zen Zq(Zlp9 paramZlp9) {
    return this.Zd.ZB(paramZlp9);
  }
  
  static {
    // Byte code:
    //   0: bipush #111
    //   2: ldc 'Fsk'
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
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #100
    //   87: goto -> 112
    //   90: bipush #52
    //   92: goto -> 112
    //   95: bipush #79
    //   97: goto -> 112
    //   100: bipush #12
    //   102: goto -> 112
    //   105: bipush #12
    //   107: goto -> 112
    //   110: bipush #63
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
    //   154: aload_0
    //   155: invokestatic Zgd : (Ljava/lang/String;)Lburp/Zro0;
    //   158: putstatic burp/Zgrd.Zn : Lburp/Zro0;
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgrd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */