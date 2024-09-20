package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zv1;

class Zteu {
  private static Zv1 Zw(Zt38 paramZt38, Zey9 paramZey9) {
    return new Zv1(Zxfe.ZP(paramZt38.ZCM(), paramZey9), ZY(paramZt38.ZCr()));
  }
  
  private static List<String> ZY(Zefg<Zsdr> paramZefg) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<Zsdr> iterator = paramZefg.iterator();
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    while (iterator.hasNext()) {
      Zsdr zsdr = iterator.next();
      arrayList.add(zsdr.toString());
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zteu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */