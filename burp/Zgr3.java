package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zin;

class Zgr3 {
  static Zin ZK(Zgnx paramZgnx) {
    return new Zin(paramZgnx.ZGd(), paramZgnx.ZGF());
  }
  
  static List<Zin> ZL(Zefg<Zgnx> paramZefg) {
    ArrayList<Zin> arrayList = new ArrayList();
    Iterator<Zgnx> iterator = paramZefg.iterator();
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    while (iterator.hasNext()) {
      Zgnx zgnx = iterator.next();
      arrayList.add(ZK(zgnx));
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgr3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */