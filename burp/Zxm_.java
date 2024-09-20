package burp;

import java.util.HashSet;
import java.util.Set;

public class Zxm_ extends Zxsr implements Zmj1 {
  public Zxm_(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zeu4<? extends Zmj1> ZF() {
    return Zmj1.ZS;
  }
  
  public Set<Zzgy> Z_N() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zksf.Zb);
    HashSet<Zzgy> hashSet = new HashSet();
    boolean bool = Zmo1.ZS();
    byte b = 0;
    while (b < zstu.Zpu()) {
      byte b1 = zstu.Zp(b);
      Zzgy zzgy = Zzgy.Zc(b1);
      hashSet.add(zzgy);
      b++;
      if (!bool) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxm_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */