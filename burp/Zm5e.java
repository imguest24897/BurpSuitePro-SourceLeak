package burp;

import java.util.Objects;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

public interface Zm5e extends Zxss {
  public static final Zeu4<Zm5e> ZM;
  
  public static final String a;
  
  default <T> T ZJ(Zzbv<T> paramZzbv) {
    return paramZzbv.Zd(this);
  }
  
  default Zlvj ZY() {
    return (new Zkkb<>(Zt(), ZFy())).ZH(a).Zl();
  }
  
  default boolean Zu(Zgyy paramZgyy) {
    if (paramZgyy instanceof Zm5e) {
      Zm5e zm5e = (Zm5e)paramZgyy;
      if (Objects.equals(ZFy(), zm5e.ZFy()) && Zt() == zm5e.Zt());
    } 
    return false;
  }
  
  default Zm5e Zl(Zsy paramZsy) {
    return (new Zma_(Znq(), ZK(ZFy(), paramZsy), Zz3o.NOT_FOUND_DETECTION)).Zu(new Zruo());
  }
  
  private Zski ZK(Zski paramZski, Zsy paramZsy) {
    Zlit zlit = paramZski.ZyR();
    String str = Zkb.ZG(zlit.Zdx().Zd4()) + Zkb.ZG(zlit.Zdx().Zd4()) + paramZsy.Zi().ZG().ZK(8);
    return Zski.ZO(new Zax(zlit.Zdz(), Zkb.Zy(str)), paramZski.Zyb());
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: ldc 'X\\tb'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm5e.a : Ljava/lang/String;
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
    //   80: bipush #17
    //   82: goto -> 112
    //   85: bipush #66
    //   87: goto -> 112
    //   90: bipush #56
    //   92: goto -> 112
    //   95: bipush #30
    //   97: goto -> 112
    //   100: bipush #78
    //   102: goto -> 112
    //   105: bipush #88
    //   107: goto -> 112
    //   110: bipush #100
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
    //   154: new burp/Zkwy
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zm5e.ZM : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */