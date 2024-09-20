package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zrx4 implements Zmgr {
  private final List<Zk8d> Zj;
  
  private final Zsvl ZQ;
  
  private Zrx4(List<Zk8d> paramList, Zsvl paramZsvl) {
    this.Zj = paramList;
    this.ZQ = paramZsvl;
  }
  
  public void Za(Zrj paramZrj, Zlsy paramZlsy) {
    int i = Zgzd.Ze();
    Ztk8 ztk8 = this.Zj.stream().map(Supplier::get).reduce(Ztk8.ZD(), Ztk8::Zh);
    this.ZQ.ZZ(ztk8);
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrx4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */