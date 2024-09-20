package net.portswigger;

import java.util.Iterator;
import java.util.List;

class Zn9 implements Zak {
  final Zrz7 Zh;
  
  final List Zj;
  
  final Zby ZE;
  
  Zn9(Zby paramZby, Zrz7 paramZrz7, List paramList) {}
  
  public void ZJ(Zkr paramZkr) {
    this.Zh.ZJ(paramZkr);
    Iterator<Zzj> iterator = this.Zj.iterator();
    String str = Zby.Zf();
    while (iterator.hasNext()) {
      Zzj zzj = iterator.next();
      zzj.ZJ(paramZkr);
      if (str == null)
        break; 
    } 
  }
  
  public void ZT(Zrmx paramZrmx) {
    this.Zh.ZT(paramZrmx);
    String str = Zby.Zf();
    for (Zzj zzj : this.Zj) {
      zzj.ZT(paramZrmx);
      if (str == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn9.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */