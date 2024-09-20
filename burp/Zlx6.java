package burp;

import java.util.ArrayList;
import java.util.List;

public class Zlx6 implements Zkc6 {
  private final List<Zkc6> Zw = new ArrayList<>();
  
  public void Zz(Zeew paramZeew, Zxj1 paramZxj1) {
    int i = Zkh7.ZD();
    for (Zkc6 zkc6 : this.Zw) {
      zkc6.Zz(paramZeew, paramZxj1);
      if (i != 0)
        break; 
    } 
  }
  
  public void Z_(Zeew paramZeew, Zxj1 paramZxj1) {
    int i = Zkh7.ZP();
    for (Zkc6 zkc6 : this.Zw) {
      zkc6.Z_(paramZeew, paramZxj1);
      if (i == 0)
        break; 
    } 
  }
  
  public void Zx(Zkc6 paramZkc6) {
    this.Zw.add(paramZkc6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlx6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */