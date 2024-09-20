package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zsd_ implements Zz6i {
  private final List<Zewm> Zb;
  
  private final Zedm ZX;
  
  public Zsd_(Zr9_ paramZr9_, Zedm paramZedm, Ze4y paramZe4y) {
    this.Zb = ZJ(paramZr9_, paramZe4y);
    this.ZX = paramZedm;
  }
  
  public boolean Zl() {
    String[] arrayOfString = Zedm.Zq();
    for (Zewm zewm : this.Zb) {
      if (this.ZX.Zc(zewm))
        return true; 
      if (arrayOfString != null)
        break; 
    } 
    return false;
  }
  
  private List<Zewm> ZJ(Zr9_ paramZr9_, Ze4y paramZe4y) {
    ArrayList<Zewm> arrayList = new ArrayList();
    Iterator<Zl30> iterator = paramZe4y.Zw().iterator();
    String[] arrayOfString = Zedm.Zq();
    while (iterator.hasNext()) {
      Zl30 zl30 = iterator.next();
      if (zl30.ZC() == paramZr9_) {
        Zewm zewm = new Zewm(zl30.ZT());
        arrayList.add(zewm);
      } 
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */