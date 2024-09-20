package burp;

import java.util.ArrayList;
import java.util.List;

public class Zmzi implements Zm7j {
  private final List<? extends Zll9> Za;
  
  private Zl_v ZD;
  
  public Zmzi(List<? extends Zll9> paramList) {
    this.Za = paramList;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.ZD = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    paramZe0.ZN(Zkcl.SCAN_AUDIT);
    paramZe0.ZW(ZD());
    paramZe0.Zs(true);
    paramZe0.Zn(this.Za);
  }
  
  public void ZR() {
    this.ZD.Zc();
    this.ZD.Zn();
    this.ZD.Zz();
  }
  
  private List<String> ZD() {
    int[] arrayOfInt = Zz7i.Zk();
    ArrayList<String> arrayList = new ArrayList();
    if (this.Za.size() <= 20)
      for (Zll9 zll9 : this.Za) {
        arrayList.add(zll9.ZlL().toString());
        if (arrayOfInt == null)
          break; 
      }  
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */