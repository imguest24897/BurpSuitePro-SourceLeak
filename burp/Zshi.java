package burp;

import java.util.Iterator;

class Zshi {
  static int ZA(Ztre paramZtre) {
    int i = paramZtre.ZAl().Zjq();
    Iterator<Zz_b> iterator = paramZtre.ZAl().Zjv().Zty().iterator();
    String str = Zfn.ZR5();
    while (iterator.hasNext()) {
      Zz_b zz_b = iterator.next();
      i += 31 * zz_b.ZM3();
      if (zz_b.ZMm() != null)
        i += 29 * zz_b.ZMm().hashCode(); 
      if (zz_b.ZMp() != null)
        i += 37 * zz_b.ZMp().hashCode(); 
      if (str == null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    return i;
  }
  
  static boolean Zh(Ztre paramZtre, Zeib paramZeib) {
    String str = Zfn.ZR5();
    if (paramZeib.Zjq() != paramZtre.ZAl().Zjq() || paramZtre.ZAl().Zjv().Zty().size() != paramZeib.Zjv().Zty().size())
      return false; 
    Iterator<Zz_b> iterator1 = paramZtre.ZAl().Zjv().Zty().iterator();
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
      if (str == null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */