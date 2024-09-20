package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Zxlj implements Iterable<Zlez> {
  final List<Zlez> ZI = new ArrayList<>();
  
  Zxlj(List<Zxov> paramList) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Zxov zxov : paramList) {
      boolean bool = false;
      for (Zlez zlez : this.ZI) {
        if (zlez.Zu == zxov.ZR.Zy.ZN()) {
          zlez.ZQ.add(zxov);
          bool = true;
          if (arrayOfZbqc != null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (!bool)
        this.ZI.add(new Zlez(zxov.ZR.Zy.ZN(), zxov)); 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public Iterator<Zlez> iterator() {
    return this.ZI.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxlj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */