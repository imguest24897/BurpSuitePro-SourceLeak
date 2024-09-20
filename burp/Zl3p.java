package burp;

import java.util.Iterator;

class Zl3p {
  static int Zl(Zswt paramZswt) {
    int i = paramZswt.ZAl().Zjq();
    Iterator<Zz_b> iterator = paramZswt.ZAl().Zjv().Zty().iterator();
    String[] arrayOfString = Zf_.ZCN();
    while (iterator.hasNext()) {
      Zz_b zz_b = iterator.next();
      i += 31 * zz_b.ZM3();
      if (zz_b.ZMm() != null)
        i += 29 * zz_b.ZMm().hashCode(); 
      if (zz_b.ZMp() != null)
        i += 37 * zz_b.ZMp().hashCode(); 
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    return i;
  }
  
  static boolean Zx(Zswt paramZswt, Zeib paramZeib) {
    String[] arrayOfString = Zf_.ZCN();
    if (paramZeib.Zjq() != paramZswt.ZAl().Zjq() || paramZswt.ZAl().Zjv().Zty().size() != paramZeib.Zjv().Zty().size())
      return false; 
    Iterator<Zz_b> iterator1 = paramZswt.ZAl().Zjv().Zty().iterator();
    Iterator<Zz_b> iterator2 = paramZeib.Zjv().Zty().iterator();
    while (iterator1.hasNext()) {
      Zz_b zz_b1 = iterator1.next();
      Zz_b zz_b2 = iterator2.next();
      if (zz_b1.ZM3() != zz_b2.ZM3())
        return false; 
      if (!Zsw8.Zn(zz_b1.ZMm(), zz_b2.ZMm()))
        return false; 
      if (!Zsw8.Zn(zz_b1.ZMp(), zz_b2.ZMp()))
        return false; 
      if (arrayOfString != null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl3p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */