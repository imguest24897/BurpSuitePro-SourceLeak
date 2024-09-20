package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgy5 implements Zz_r {
  private final List<Zbx0> ZD = new ArrayList<>();
  
  public void Zy(Zbx0 paramZbx0) {
    this.ZD.add(paramZbx0);
  }
  
  public void Za(Zbx0 paramZbx0) {
    this.ZD.remove(paramZbx0);
  }
  
  public void Zg(Zeew paramZeew, Zll9 paramZll9) {
    String str = Zl41.ZU();
    try {
      for (Zbx0 zbx0 : this.ZD) {
        zbx0.Zi(paramZeew, paramZll9);
        if (str != null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgy5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */