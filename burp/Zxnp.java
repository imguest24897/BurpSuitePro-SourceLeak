package burp;

import java.util.Iterator;

class Zxnp {
  static int Zi(Zlyu paramZlyu) {
    int i = paramZlyu.ZAl().Zjq();
    Iterator<Zz_b> iterator = paramZlyu.ZAl().Zjv().Zty().iterator();
    boolean bool = Zf0.ZXc();
    while (iterator.hasNext()) {
      Zz_b zz_b = iterator.next();
      i += 31 * zz_b.ZM3();
      if (bool) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return i;
  }
  
  static boolean ZO(Zlyu paramZlyu, Zeib paramZeib) {
    if (paramZeib.Zjq() != paramZlyu.ZAl().Zjq() || paramZlyu.ZAl().Zjv().Zty().size() != paramZeib.Zjv().Zty().size())
      return false; 
    Iterator<Zz_b> iterator1 = paramZlyu.ZAl().Zjv().Zty().iterator();
    Iterator<Zz_b> iterator2 = paramZeib.Zjv().Zty().iterator();
    while (iterator1.hasNext()) {
      if (((Zz_b)iterator1.next()).ZM3() != ((Zz_b)iterator2.next()).ZM3())
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */