package burp;

import java.util.LinkedList;
import java.util.List;

public class Zg_a {
  private final Zmrn ZF;
  
  private final List<Zsvm> Zg;
  
  private final List<Zsvm> ZD;
  
  private Zg_a(Zmrn paramZmrn) {
    this.ZF = paramZmrn;
    this.Zg = new LinkedList<>();
    this.ZD = new LinkedList<>();
  }
  
  public static Zg_a Zx(Zmrn paramZmrn) {
    return new Zg_a(paramZmrn);
  }
  
  public Zg_a Zt(Zsvm paramZsvm) {
    this.Zg.add(paramZsvm);
    return this;
  }
  
  public Zg_a ZS(Zsvm paramZsvm) {
    this.ZD.add(paramZsvm);
    return this;
  }
  
  public boolean Zu(Zzvx paramZzvx) {
    int[] arrayOfInt = Zmgt.ZK();
    List<Zsvm> list = this.ZF.Zk(paramZzvx) ? this.Zg : this.ZD;
    for (Zsvm zsvm : list) {
      boolean bool = !zsvm.ZL(paramZzvx) ? true : false;
      if (bool && !zsvm.ZR())
        return false; 
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */