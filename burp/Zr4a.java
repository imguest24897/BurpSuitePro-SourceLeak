package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zr4a implements Zg9e {
  private final List<Zgrr> Zc = new CopyOnWriteArrayList<>();
  
  public void Zh(Zgrr paramZgrr) {
    this.Zc.add(paramZgrr);
  }
  
  public void Zo(Zgrr paramZgrr) {
    this.Zc.remove(paramZgrr);
  }
  
  public void Zn() {
    this.Zc.forEach(Zgrr::ZP);
  }
  
  public void ZI() {
    this.Zc.forEach(Zgrr::ZH);
  }
  
  public void Zi() {
    this.Zc.forEach(Zgrr::Zl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */