package burp;

import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zkb;

class Zrzz implements Zeih {
  private final Supplier<Zb9a> Zg;
  
  private final Zsus Ze;
  
  private final Supplier<Boolean> Zp;
  
  Zrzz(Supplier<Zb9a> paramSupplier, Zsus paramZsus, Supplier<Boolean> paramSupplier1) {
    this.Zg = paramSupplier;
    this.Ze = paramZsus;
    this.Zp = paramSupplier1;
  }
  
  public Zbza Zk(Zmup paramZmup, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Zz1p paramZz1p, long paramLong1, long paramLong2, List<int[]> paramList) {
    Zbza zbza = null;
    if (((Boolean)this.Zp.get()).booleanValue()) {
      zbza = this.Ze.Zv(paramZmzk, paramZstu1, paramZstu2, Zkb.ZG(paramZz1p.Zo.Zd4()), false, paramLong1, paramLong2, paramList);
      ((Zb9a)this.Zg.get()).Zi(zbza);
    } 
    return zbza;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */