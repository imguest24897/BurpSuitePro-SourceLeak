package burp;

import java.util.Iterator;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrr_ extends Zrgr {
  Zrr_(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    boolean bool = false;
    Iterator<Zt8g> iterator = (paramZml3.Zi()).ZV.iterator();
    int i = Zrgr.ZU();
    while (iterator.hasNext()) {
      Zt8g zt8g = iterator.next();
      switch (Zrq5.ZH[zt8g.ZbQ().ordinal()]) {
        case 1:
        case 2:
        case 3:
          try {
            this.ZN.reset(zt8g.Zns());
            if (this.ZN.find()) {
              bool = true;
              try {
                if (i != 0);
              } catch (Exception exception) {
                throw a(null);
              } 
            } 
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          } 
          break;
      } 
      if (i != 0)
        break; 
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    return (bool == ((ZC() == 0) ? true : false));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */