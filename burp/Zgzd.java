package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zgzd {
  private final List<Zk8d> Zz = new ArrayList<>();
  
  private Zsvl ZP;
  
  private static int Zr;
  
  public Zgzd ZR(Zk8d... paramVarArgs) {
    Collections.addAll(this.Zz, paramVarArgs);
    return this;
  }
  
  public Zgzd ZK(Zsvl paramZsvl) {
    this.ZP = paramZsvl;
    return this;
  }
  
  public Zrx4 Zs() {
    return new Zrx4(this.Zz, this.ZP);
  }
  
  public static void Zt(int paramInt) {
    Zr = paramInt;
  }
  
  public static int Ze() {
    return Zr;
  }
  
  public static int Zv() {
    int i = Ze();
    return (i == 0) ? 114 : 0;
  }
  
  static {
    if (Zv() == 0)
      Zt(48); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */