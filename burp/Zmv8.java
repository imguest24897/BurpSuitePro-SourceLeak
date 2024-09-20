package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zmv8 implements Zm3g {
  private final List<Zm3g> Zs = new ArrayList<>();
  
  public Zmv8(Zm3g... paramVarArgs) {
    this.Zs.addAll(Arrays.asList(paramVarArgs));
  }
  
  public void Zd(Zmf_ paramZmf_) {
    String[] arrayOfString = Zzkm.Zq();
    for (Zm3g zm3g : this.Zs) {
      zm3g.Zd(paramZmf_);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void Zl(Zg4j paramZg4j) {
    String[] arrayOfString = Zzkm.Zq();
    for (Zm3g zm3g : this.Zs) {
      zm3g.Zl(paramZg4j);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void Zi(Zm3g paramZm3g) {
    this.Zs.add(paramZm3g);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmv8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */