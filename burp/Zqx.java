package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zm5;

class Zqx {
  private static Zm5 Zj(Zglw paramZglw, Zey9 paramZey9) {
    return new Zm5(Zt2a.Zr(paramZglw.ZDt(), paramZey9), Zx6y.Zo(paramZglw.ZDM()), paramZglw.ZDZ());
  }
  
  private static List<Zm5> ZH(Zefg<Zglw> paramZefg, Zey9 paramZey9) {
    ArrayList<Zm5> arrayList = new ArrayList();
    Iterator<Zglw> iterator = paramZefg.iterator();
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    while (iterator.hasNext()) {
      Zglw zglw = iterator.next();
      arrayList.add(Zj(zglw, paramZey9));
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */