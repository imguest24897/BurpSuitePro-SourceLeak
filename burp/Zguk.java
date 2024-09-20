package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zguk implements Zxko {
  private final List<Zxko> ZW = new CopyOnWriteArrayList<>();
  
  public void ZV() {
    this.ZW.forEach(Zxko::ZV);
  }
  
  public void ZU(Zxko paramZxko) {
    this.ZW.add(paramZxko);
  }
  
  public void Zo(Zxko paramZxko) {
    this.ZW.remove(paramZxko);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zguk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */