package burp;

import net.portswigger.Zrzg;

public class Zlbi implements Zr5g {
  private final Zkit Zy;
  
  private final Zlu6 Zc;
  
  private final Zzir Zz;
  
  private final Ztfn ZK;
  
  private static int Zq;
  
  public Zlbi(Zrgd paramZrgd, Zrzg paramZrzg, Zkit paramZkit1, Zkit paramZkit2, Ztg8 paramZtg8, Zlu6 paramZlu6, Zzir paramZzir, Ztwv paramZtwv, Zm6x paramZm6x) {
    this.Zy = paramZkit1;
    this.Zc = paramZlu6;
    this.Zz = paramZzir;
    this.ZK = new Ztfn(paramZrgd, paramZrzg, paramZkit1, paramZkit2, paramZtg8, paramZlu6, paramZzir, paramZtwv, paramZm6x);
  }
  
  public void ZZ() {
    this.Zy.Zs(this.ZK, this);
    if (this.Zc.Zt())
      this.Zz.Zvu().ZG2().addAll(this.Zz.Zvu().ZGl()); 
    if (this.Zc.Zp())
      this.Zz.Zvu().ZGi().addAll(this.Zz.Zvu().ZGW()); 
  }
  
  public void Zx(int paramInt, long paramLong) {
    this.ZK.Zp(paramInt).Zk(paramLong);
  }
  
  public static void ZZ(int paramInt) {
    Zq = paramInt;
  }
  
  public static int ZV() {
    return Zq;
  }
  
  public static int ZO() {
    int i = ZV();
    return (i == 0) ? 38 : 0;
  }
  
  static {
    if (ZO() != 0)
      ZZ(121); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */