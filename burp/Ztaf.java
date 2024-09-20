package burp;

import java.util.List;

public class Ztaf {
  private final Zsvv ZF;
  
  private final Zrji Zq;
  
  private final Zeu_ Zc;
  
  public Ztaf(Zsvv paramZsvv, Zrji paramZrji) {
    this.ZF = paramZsvv;
    this.Zq = paramZrji.Zw();
    this.Zc = Zeu_.ZG(this.Zq, paramZsvv);
  }
  
  public Zio Zf(Zio paramZio) {
    paramZio.ZG(this.Zc.Zj());
    List<String> list = this.Zc.Zm(this.Zq, this.ZF);
    if (!list.isEmpty()) {
      paramZio.ZR(list.get(0));
      paramZio.Ze(list);
    } 
    return paramZio;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztaf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */