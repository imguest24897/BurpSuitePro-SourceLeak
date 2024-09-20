package burp;

import java.util.List;
import net.portswigger.Zen;

class Zewp extends Zew4 {
  private final Zzi5 Zd;
  
  private static final String a;
  
  Zewp(Zzow paramZzow, Ze2o paramZe2o, Zzi5 paramZzi5, Zlp9 paramZlp9) {
    super(paramZzow.ZP(paramZlp9), paramZe2o, paramZzi5, paramZlp9);
    this.Zd = paramZzi5;
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    Zs2i zs2i = this.Zi;
    if (zs2i == null)
      zs2i = Zu(paramZxs7); 
    Zen zen = ZF();
    Zl8v.Zm(a + a, zs2i.ZE(), 0, (zs2i.ZE()).length, zs2i.ZO(), false);
    return zs2i.ZO();
  }
  
  boolean ZN() {
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: ldc 'YZN\\n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zewp.a : Ljava/lang/String;
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
    //   80: bipush #112
    //   82: goto -> 112
    //   85: bipush #105
    //   87: goto -> 112
    //   90: bipush #54
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #111
    //   102: goto -> 112
    //   105: bipush #44
    //   107: goto -> 112
    //   110: bipush #62
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zewp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */