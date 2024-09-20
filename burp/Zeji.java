package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zz_;

class Zeji {
  private final Zbjl Zj;
  
  private final Zlba ZW;
  
  private final Zbnt Zw;
  
  private final Zey9 Zg;
  
  private final Zerg ZT;
  
  Zeji(Zbjl paramZbjl, Zlba paramZlba, Zbnt paramZbnt, Zey9 paramZey9, Zerg paramZerg) {
    this.Zj = paramZbjl;
    this.ZW = paramZlba;
    this.Zw = paramZbnt;
    this.Zg = paramZey9;
    this.ZT = paramZerg;
  }
  
  List<Zlkb> Zg(Zstu paramZstu) {
    Zbj2 zbj2 = new Zbj2(this.Zj, this.ZW, this.Zw, new Zk8s(this.Zw, this.Zg, this.ZT), new Zz_(paramZstu.ZiD()));
    ArrayList<Zlkb> arrayList = new ArrayList();
    Zbqc[] arrayOfZbqc = Zb9e.ZI();
    while (zbj2.hasNext()) {
      arrayList.add(zbj2.ZV());
      if (arrayOfZbqc == null)
        break; 
    } 
    return Collections.unmodifiableList(arrayList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeji.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */