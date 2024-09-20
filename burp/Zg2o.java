package burp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zg2o implements Zeih {
  private final Consumer<Zbza> ZC;
  
  private final boolean Zt;
  
  private final Supplier<Zz28> Zv;
  
  private final Zlae Zc;
  
  private final Ztr3 Zy;
  
  private final Zsus Zl;
  
  public Zg2o(Consumer<Zbza> paramConsumer, boolean paramBoolean, Supplier<Zz28> paramSupplier, Ztr3 paramZtr3, Zsus paramZsus) {
    this.ZC = paramConsumer;
    this.Zt = paramBoolean;
    this.Zv = paramSupplier;
    this.Zc = paramZtr3.ZPT();
    this.Zy = paramZtr3;
    String str = Zkn.ZI();
    this.Zl = paramZsus;
    if (Zbqc.Zwu() == null)
      Zkn.Ze("JWYHlb"); 
  }
  
  public Zbza Zk(Zmup paramZmup, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Zz1p paramZz1p, long paramLong1, long paramLong2, List<int[]> paramList) {
    Zm2.ZC(Zrrh.SCANNER_LIVE_ACTIVE);
    Zbza zbza = null;
    if (this.Zy.ZPp() && this.Zy.ZPW().contains(paramZmup) && ((Zz28)this.Zv.get()).ZG(paramZz1p.Zo) && paramZstu2 != null && (!this.Zy.ZPG() || !this.Zc.Zx(paramZz1p))) {
      zbza = this.Zl.Zv(paramZmzk, paramZstu1, paramZstu2, Zkb.ZG(paramZz1p.Zo.Zd4()), this.Zt, paramLong1, paramLong2, null);
      this.ZC.accept(zbza);
    } 
    return zbza;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */