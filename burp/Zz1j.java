package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zrz9;

public class Zz1j extends Zz1f<Zzwz> {
  private final List<Zer0> Z_;
  
  private final Zz1_ Zg;
  
  public Zz1j(Zesv paramZesv, Zxs7 paramZxs7, Zbjl paramZbjl, Zroy paramZroy, Zzwz paramZzwz, Zer0 paramZer0, List<Zer0> paramList, Zewx paramZewx, Ze3n paramZe3n) {
    super(paramZesv, paramZbjl, paramZroy, paramZxs7, paramZer0, paramZzwz, paramZewx, paramZe3n);
    this.Z_ = paramList;
    this.Zg = new Zk99(paramZewx.ZG(), paramZzwz, paramZroy, paramZer0, paramList);
  }
  
  public Zbll Z_() {
    Zbll zbll = Zbll.Zu(this.Zh);
    Zw(zbll);
    return (zbll.ZP.isEmpty() || Zt(this.Z_, zbll.ZP)) ? this.Zg.Z_() : zbll;
  }
  
  private boolean Zt(List<Zer0> paramList, List<Zsjh<?>> paramList1) {
    boolean bool = false;
    null = paramList.iterator();
    int i = Zz1f.ZB();
    while (null.hasNext()) {
      Zer0 zer0 = null.next();
      if (zer0.ZA() == Zb25.SMTP || zer0.ZA() == Zb25.SMTPS) {
        bool = true;
        if (i != 0)
          continue; 
        break;
      } 
      continue;
      if (i != 0)
        break; 
    } 
    if (!bool)
      return false; 
    for (Zsjh<?> zsjh : paramList1) {
      if (zsjh.Zr() == Zrz9.SMTP)
        return false; 
      if (i != 0)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */