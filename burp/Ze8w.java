package burp;

import java.util.Iterator;
import net.portswigger.Zm2;

public class Ze8w {
  private final Zgxf Zt;
  
  public Ze8w(Zgxf paramZgxf) {
    this.Zt = paramZgxf;
  }
  
  public boolean Zn(Ze3h paramZe3h) {
    Zm2.Zi(Zv8r.TARGET_SITE_MAP_HIGHLIGHT, Zlxk.ZS);
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (!((Zxya)zz_1.Z_()).Zd)
        continue; 
      ((Zxya)zz_1.Z_()).ZB((byte)Zlxk.ZS);
      this.Zt.Zc(zz_1);
      if (arrayOfInt != null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze8w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */