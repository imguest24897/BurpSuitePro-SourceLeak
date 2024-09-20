package burp;

import java.util.List;

public class Zr_1 implements Ztcw {
  private final List<Ztcw> ZN;
  
  private Zr_1(List<Ztcw> paramList) {
    this.ZN = List.copyOf(paramList);
  }
  
  public static Ztcw ZQ(List<Ztcw> paramList) {
    return new Zr_1(paramList);
  }
  
  public static Ztcw Zb(Ztcw... paramVarArgs) {
    return new Zr_1(List.of(paramVarArgs));
  }
  
  public void Zg() {
    this.ZN.forEach(Ztcw::Zg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */