package burp;

import java.util.ArrayList;
import java.util.List;

public class Zsyk implements Zm7j {
  private final Ze3h ZD;
  
  private Zl_v ZV;
  
  public Zsyk(Ze3h paramZe3h) {
    this.ZD = paramZe3h;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.ZV = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    Ze3h ze3h = this.ZD.Zd();
    paramZe0.ZN(Zkcl.SCAN_CRAWL_AND_AUDIT);
    paramZe0.ZW(Ze(ze3h.Zp()));
    paramZe0.Zs(true);
    paramZe0.Zn((List)ze3h.ZL().Zz().Zp());
  }
  
  public void ZR() {
    this.ZV.ZI();
    this.ZV.ZW();
    this.ZV.Zg();
  }
  
  private List<String> Ze(List<Zez3> paramList) {
    int[] arrayOfInt = Zz7i.Zk();
    ArrayList<String> arrayList = new ArrayList();
    if (paramList.size() <= 20)
      for (Zez3 zez3 : paramList) {
        arrayList.add(zez3.ZlL().toString());
        if (arrayOfInt == null)
          break; 
      }  
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */