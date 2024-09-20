package burp;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class Zz45 {
  private final Zmdu ZV;
  
  private final Zbnt ZQ;
  
  private final Zkm8 Za;
  
  private final Zgwp Ze;
  
  private final Zkoz Zs;
  
  private final Zmz6 Zn;
  
  private static int Zh;
  
  public Zz45(Zmdu paramZmdu, Zbnt paramZbnt, Zkm8 paramZkm8, Zgwp paramZgwp, Zkoz paramZkoz, Zmz6 paramZmz6) {
    this.ZV = paramZmdu;
    this.ZQ = paramZbnt;
    this.Za = paramZkm8;
    this.Ze = paramZgwp;
    this.Zs = paramZkoz;
    this.Zn = paramZmz6;
  }
  
  Zrbc Zh(Zl5x paramZl5x, Ze3n paramZe3n, Zz1i paramZz1i, Function<Ztpx, Zmhe> paramFunction, BiConsumer<Zb09, Throwable> paramBiConsumer, Ztbx paramZtbx, byte[] paramArrayOfbyte, Ztl paramZtl, Zz_q paramZz_q, Zg56 paramZg56) {
    return new Ztjm(paramZl5x, paramZe3n, paramZz1i, paramFunction, paramBiConsumer, paramZtbx, this.ZQ, this.Za, paramZtl, paramZz_q, paramArrayOfbyte, paramZg56);
  }
  
  Zrbc ZT(Ze3n paramZe3n, Ztbx paramZtbx, Zvs paramZvs, byte[] paramArrayOfbyte, Ztl paramZtl, Zz_q paramZz_q, Zs4_ paramZs4_) {
    return new Zs_0(paramZe3n, paramZvs, paramZtbx.Zz, paramArrayOfbyte, paramZtbx.Zn.Z_(), paramZs4_, this.Ze, this.Zs, this.Zn, this.ZV, paramZtl, paramZz_q);
  }
  
  public static void ZU(int paramInt) {
    Zh = paramInt;
  }
  
  public static int ZU() {
    return Zh;
  }
  
  public static int ZT() {
    int i = ZU();
    return (i == 0) ? 56 : 0;
  }
  
  static {
    if (ZU() != 0)
      ZU(85); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz45.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */