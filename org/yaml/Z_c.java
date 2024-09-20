package org.yaml;

import java.util.LinkedList;
import java.util.List;

class Z_c implements Zgy {
  List<Zg6> Zm = new LinkedList<>();
  
  final Zln Zp;
  
  private Z_c(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.Zp.ZI.ZC(new Ztt[] { Ztt.Comment })) {
      this.Zm.add((Zg6)this.Zp.ZI.Zs());
      return ZG();
    } 
    if (!this.Zp.ZI.ZC(new Ztt[] { Ztt.Key, Ztt.Value, Ztt.BlockEnd })) {
      if (!this.Zm.isEmpty())
        return Zln.Zm(this.Zp, this.Zm.remove(0)); 
      Zln.ZC(this.Zp).Zq(new Z_i(this.Zp, null));
      return Zln.Ze(this.Zp);
    } 
    Zln.ZH(this.Zp, new Zt9(this.Zp, this.Zm));
    return Zln.Zg(this.Zp, this.Zp.ZI.ZG().ZL());
  }
  
  Z_c(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */