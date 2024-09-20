package burp;

import java.util.Iterator;
import java.util.List;

public class Zs89 {
  private final Zeel Zt;
  
  public Zs89(Zeel paramZeel) {
    this.Zt = paramZeel;
  }
  
  public Zrn9 ZW(Zkal paramZkal) {
    Zrn9 zrn9 = new Zrn9(paramZkal);
    Zb3t zb3t = null;
    boolean bool = Zrn9.Zn();
    for (Zgbi zgbi : paramZkal.Zq()) {
      Zesp zesp = zgbi.ZX();
      if (Zl19.ZM(zesp)) {
        Zrqv zrqv = new Zrqv((Zb3t)zesp);
        for (Zb3t zb3t1 : zrqv) {
          this.Zt.ZO();
          zb3t1.Zm(this.Zt);
          Zb3t zb3t2 = this.Zt.ZC();
          if (zb3t2 != null) {
            if (zb3t2 != zb3t) {
              zrn9.Zv(zb3t2);
              zb3t = zb3t2;
            } 
            ZB(zb3t2, zesp, zrn9);
            if (zrn9.Zx().get(zesp) == null) {
              Zm(zb3t2, zesp, zrn9);
              if (bool)
                continue; 
            } 
            break;
          } 
          continue;
          if (bool)
            break; 
        } 
      } 
      if (bool)
        break; 
    } 
    return zrn9;
  }
  
  private void ZB(Zb3t paramZb3t, Zesp paramZesp, Zrn9 paramZrn9) {
    List list = paramZesp.<List>ZO(Zxc6.TaintHops);
    Iterator<Zgbi> iterator = list.iterator();
    boolean bool = Zrn9.Za();
    while (iterator.hasNext()) {
      Zgbi zgbi = iterator.next();
      if (zgbi.Zm() != paramZesp)
        continue; 
      if (Zl19.ZO(zgbi.ZX()) || Zl19.Zr(zgbi.ZX()))
        paramZrn9.Zx().put(paramZb3t, zgbi); 
      if (!bool)
        break; 
    } 
  }
  
  private void Zm(Zb3t paramZb3t, Zesp paramZesp, Zrn9 paramZrn9) {
    List list = paramZesp.<List>ZO(Zxc6.TaintHops);
    Iterator<Zgbi> iterator = list.iterator();
    boolean bool = Zrn9.Za();
    while (iterator.hasNext()) {
      Zgbi zgbi = iterator.next();
      if (zgbi.Zm() != paramZesp)
        continue; 
      if (!Zl19.ZO(zgbi.ZX()) || !Zl19.ZO(zgbi.Zm()))
        paramZrn9.Zx().put(paramZb3t, zgbi); 
      if (!bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs89.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */