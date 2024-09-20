package burp;

import java.awt.Component;
import java.io.IOException;
import java.io.Writer;

public interface Zlg_ extends Zlhn {
  public static final Zeu4<Zlg_> Zd;
  
  public static final String a;
  
  String Zje();
  
  String ZjN();
  
  String Zj8();
  
  default void ZY(Zb_h paramZb_h) {}
  
  default String Zmm() {
    return a;
  }
  
  default Component ZL(Zrdb paramZrdb) {
    return Zgdn.Zb(Zm15.ZE(this));
  }
  
  default void Zw(Zvon paramZvon) throws IOException {
    Zm15.ZE(paramZvon, this);
  }
  
  default void Zb(Writer paramWriter, Zsh9 paramZsh9, Zefg<Zxtl> paramZefg) throws IOException {
    Zm15.ZQ(paramWriter, this);
  }
  
  default Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zlg_) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
  
  default Zll7 Zub() {
    return null;
  }
  
  default Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.Zz(this);
  }
  
  default Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  static {
    // Byte code:
    //   0: bipush #118
    //   2: ldc 'YT30-_=L31=Ot^'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlg_.a : Ljava/lang/String;
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
    //   80: bipush #107
    //   82: goto -> 112
    //   85: bipush #91
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #9
    //   97: goto -> 112
    //   100: bipush #43
    //   102: goto -> 112
    //   105: bipush #50
    //   107: goto -> 112
    //   110: bipush #74
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
    //   154: new burp/Zksb
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zlg_.Zd : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */