package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zxav implements Iterable<Zen9> {
  private List<Zen9> ZN = new ArrayList<>();
  
  public Zxav ZX(Ze4y paramZe4y) {
    boolean bool = Zgy_.ZN();
    byte b = 0;
    while (b < paramZe4y.Zw().size()) {
      Zl30 zl30 = paramZe4y.Zw().get(b);
      this.ZN.add((new Zen9()).ZO(zl30, b));
      b++;
      if (bool)
        break; 
    } 
    ZC(paramZe4y);
    return this;
  }
  
  private void ZC(Ze4y paramZe4y) {
    boolean bool = Zgy_.ZF();
    for (Zr9_ zr9_ : paramZe4y.Z_()) {
      List<Zes2> list = Zr(zr9_, paramZe4y);
      for (Zen9 zen9 : this.ZN) {
        zen9.ZB(zr9_, list);
        if (!bool)
          break; 
      } 
      if (!bool)
        break; 
    } 
  }
  
  private List<Zes2> Zr(Zr9_ paramZr9_, Ze4y paramZe4y) {
    ArrayList<Zes2> arrayList = new ArrayList();
    byte b = 0;
    Iterator<Zl30> iterator = paramZe4y.Zw().iterator();
    boolean bool = Zgy_.ZN();
    while (iterator.hasNext()) {
      Zl30 zl30 = iterator.next();
      if (zl30.ZC() == paramZr9_) {
        Zen9 zen9 = this.ZN.get(b);
        Zes2 zes2 = new Zes2(Zg4p.EPSILON, zen9.Zf());
        arrayList.add(zes2);
      } 
      b++;
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  public Zen9 ZQ(int paramInt) {
    return this.ZN.get(paramInt);
  }
  
  public Iterator<Zen9> iterator() {
    return this.ZN.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxav.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */