package burp;

import java.util.Iterator;

public class Zlek {
  private final Zt0e ZY;
  
  public Zlek(Zt0e paramZt0e) {
    this.ZY = paramZt0e;
  }
  
  public Zen9 Zp(Ze4y paramZe4y) {
    Zxav zxav = (new Zxav()).ZX(paramZe4y);
    this.ZY.Zb(zxav);
    return Zd(zxav);
  }
  
  private Zen9 Zd(Zxav paramZxav) {
    Zen9 zen9 = new Zen9();
    Iterator<Zen9> iterator = paramZxav.iterator();
    boolean bool = Zgy_.ZF();
    while (iterator.hasNext()) {
      Zen9 zen91 = iterator.next();
      zen9.ZU(zen91);
      if (!bool)
        break; 
    } 
    return zen9;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlek.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */