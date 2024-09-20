package burp;

import java.awt.Component;
import java.io.IOException;
import java.io.Writer;

public interface Zreg extends Zlhn {
  public static final Zeu4<Zreg> ZZ;
  
  public static final String a;
  
  Zefg<Zgnx> ZIU();
  
  default String Zmm() {
    return a;
  }
  
  default Component ZL(Zrdb paramZrdb) {
    return Zgdn.Zb(Zgdn.ZR(this, paramZrdb.Zaq()));
  }
  
  default void Zb(Writer paramWriter, Zsh9 paramZsh9, Zefg<Zxtl> paramZefg) throws IOException {
    Zgdn.Zb(paramWriter, this, paramZefg);
  }
  
  default void Zw(Zvon paramZvon) throws IOException {
    Zgdn.Ze(paramZvon, this);
  }
  
  default Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zreg) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
  
  default Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)ZZ;
  }
  
  default void ZY(Zb_h paramZb_h) {
    Zgdn.ZF(this, paramZb_h);
  }
  
  default Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.Zf(this);
  }
  
  default Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: ldc 'RD%xQ?`^%`Avr'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zreg.a : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #19
    //   87: goto -> 112
    //   90: bipush #103
    //   92: goto -> 112
    //   95: bipush #47
    //   97: goto -> 112
    //   100: bipush #27
    //   102: goto -> 112
    //   105: bipush #87
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
    //   154: new burp/Zkse
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zreg.ZZ : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zreg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */