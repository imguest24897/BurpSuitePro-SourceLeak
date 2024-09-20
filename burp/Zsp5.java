package burp;

import java.util.HashSet;
import java.util.stream.Collectors;

public interface Zsp5 extends Zm6i {
  public static final Zeu4<Zsp5> Z_;
  
  public static final String a;
  
  Zski ZhF();
  
  String ZhX();
  
  Zsba Zhk();
  
  Zefg<Zbz1> Zhe();
  
  default boolean Zd(Zz28 paramZz28) {
    return paramZz28.ZG(ZhF().ZyR());
  }
  
  default boolean Zp(Zszy paramZszy) {
    null = super.Zp(paramZszy);
    null = (null && paramZszy.ZOs().Zm(ZhX()));
    null = (null && paramZszy.ZOd().Zm(Byte.valueOf(Zhk().Zi())));
    null = (null && paramZszy.ZOG().Zm(ZhF().Zyb()));
    return (null && paramZszy.ZO8().Zm(Zhe()));
  }
  
  default void Zo(Ze2a paramZe2a) {
    super.Zo(paramZe2a);
    paramZe2a.Zv(ZhX()).Zz(Zhk().Zi()).Zb(ZhF().Zyb()).ZH(Zhe());
  }
  
  default Zeib Zt(int paramInt1, int paramInt2, int paramInt3) {
    int i = Ze0p.Zn(ZhF().ZyR());
    int j = Ze0p.Zp(ZhF().ZyR());
    int k = Ze0p.Zw(ZmJ());
    int m = Ze0p.Zs(ZhF().Zyb());
    HashSet<Ztfy> hashSet = new HashSet<>(Ztfy.ZQ(Zm2()));
    return (new Zb0e(this, paramInt3, i, j, k, m, 0, 0, paramInt1, paramInt2, hashSet)).ZR(new Zruo());
  }
  
  default Zl_ ZE(Zeu9 paramZeu9, Zxw8 paramZxw8, Zr_4 paramZr_4) {
    return paramZr_4.<Zl_>ZH(new Zxjs(paramZeu9, paramZxw8));
  }
  
  default Zlvj Zhr() {
    return (new Zkkb<>(Zm2(), ZhF())).Zz(Zhk().ZE()).ZH(ZhX()).Zg(Zmc().Zta().stream().map(Zz_b::ZZg).toList()).Zl();
  }
  
  default <T> T Zr(Zr3l<T> paramZr3l) {
    return paramZr3l.ZX(this);
  }
  
  default String ZmR() {
    return a.formatted(new Object[] { ZmJ().stream().map(Zzjv::ZxZ).collect(Collectors.joining(" ")), ZhF().ZyJ() });
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc '\\fNR*z~'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsp5.a : Ljava/lang/String;
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
    //   80: bipush #42
    //   82: goto -> 112
    //   85: bipush #22
    //   87: goto -> 112
    //   90: bipush #92
    //   92: goto -> 112
    //   95: bipush #38
    //   97: goto -> 112
    //   100: bipush #127
    //   102: goto -> 112
    //   105: bipush #66
    //   107: goto -> 112
    //   110: bipush #116
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
    //   154: new burp/Zkw8
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zsp5.Z_ : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsp5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */