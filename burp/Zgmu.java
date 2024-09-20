package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zgmu extends Zgmw {
  private static final Comparator<Ztu8> ZV = new Zx53();
  
  public final List<Ztu8> ZR = new ArrayList<>();
  
  public List<Ztu8> ZZ() {
    Collections.sort(this.ZR, ZV);
    return this.ZR;
  }
  
  public void Zh(Zgim paramZgim, Ztu8 paramZtu8) {
    if (Zljb.ZG(paramZtu8)) {
      this.ZR.add(paramZtu8);
      paramZgim.ZQ(paramZtu8.ZlP());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */