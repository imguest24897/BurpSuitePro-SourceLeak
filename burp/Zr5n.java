package burp;

import java.util.HashSet;
import java.util.stream.Collectors;

public interface Zr5n extends Zm6i {
  public static final Zeu4<Zr5n> Zz;
  
  public static final String a;
  
  String Z_M();
  
  String Z_n();
  
  String Z_8();
  
  Zefg<Zsdr> Z_y();
  
  default boolean Zd(Zz28 paramZz28) {
    return true;
  }
  
  default boolean Zp(Zszy paramZszy) {
    null = super.Zp(paramZszy);
    null = (null && paramZszy.ZOY().Zm(Z_M()));
    null = (null && paramZszy.ZOp().Zm(Z_n()));
    null = (null && paramZszy.ZO5().Zm(Z_8()));
    return (null && paramZszy.ZOo().Zm(Z_y()));
  }
  
  default void Zo(Ze2a paramZe2a) {
    super.Zo(paramZe2a);
    paramZe2a.ZV(Z_M()).Z_(Z_n()).Zm(Z_8()).Zd(Z_y());
  }
  
  default Zeib Zt(int paramInt1, int paramInt2, int paramInt3) {
    HashSet<Ztfy> hashSet = new HashSet<>(Ztfy.ZQ(Zm2()));
    int i = Zmxe.ZD(Z_n(), Z_8(), Z_y());
    int j = Zmxe.Zl(Z_M());
    int k = Ze0p.Zw(ZmJ());
    return (new Zb0e(this, paramInt3, 0, 0, k, 0, i, j, paramInt1, paramInt2, hashSet)).ZR(new Zruo());
  }
  
  default Zl_ ZE(Zeu9 paramZeu9, Zxw8 paramZxw8, Zr_4 paramZr_4) {
    return paramZr_4.<Zl_>ZH(new Zxjs(paramZeu9, paramZxw8));
  }
  
  default <T> T Zr(Zr3l<T> paramZr3l) {
    return paramZr3l.Zf(this);
  }
  
  default String ZmR() {
    String str = Z_M();
    if (Zsw8.ZS(Z_8()))
      str = Z_8(); 
    if (Zsw8.ZS(Z_n()))
      str = Z_n(); 
    return a.formatted(new Object[] { ZmJ().stream().map(Zzjv::ZxZ).collect(Collectors.joining(" ")), str });
  }
  
  static {
    // Byte code:
    //   0: bipush #121
    //   2: ldc '$-_V'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr5n.a : Ljava/lang/String;
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
    //   80: bipush #6
    //   82: goto -> 112
    //   85: bipush #78
    //   87: goto -> 112
    //   90: bipush #28
    //   92: goto -> 112
    //   95: bipush #38
    //   97: goto -> 112
    //   100: bipush #73
    //   102: goto -> 112
    //   105: bipush #113
    //   107: goto -> 112
    //   110: bipush #85
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
    //   154: new burp/Zkx9
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zr5n.Zz : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr5n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */