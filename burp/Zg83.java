package burp;

import java.util.List;

public class Zg83 extends Zg8s {
  private final int Zg;
  
  private final Zl2z ZL;
  
  public Zg83(int paramInt, Zkl6 paramZkl6, Ze47 paramZe47, Ztyg paramZtyg, Zgq7 paramZgq7, Zl2z paramZl2z, Zm6x paramZm6x) {
    super(paramZkl6, paramZe47, paramZtyg, paramZgq7, paramZm6x);
    this.Zg = paramInt;
    this.ZL = paramZl2z;
  }
  
  public void ZP(Zz_1 paramZz_1) {
    super.ZP(paramZz_1);
    if (paramZz_1 == null)
      return; 
    List<Zkv5> list = null;
    if (Zos() != null) {
      List<Ztsm> list1 = this.ZL.ZU(((Zxya)paramZz_1.Z_()).ZX).Zq();
      if (list1 != null)
        list = Ztsm.ZZ(list1)[this.Zg]; 
    } 
    this.ZK.ZX(list);
    list = null;
    if (ZoO() != null) {
      List<Ztsm> list1 = this.ZL.ZU(((Zxya)paramZz_1.Z_()).ZX).Zz();
      if (list1 != null)
        list = Ztsm.ZZ(list1)[this.Zg]; 
    } 
    this.Zi.ZX(list);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg83.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */