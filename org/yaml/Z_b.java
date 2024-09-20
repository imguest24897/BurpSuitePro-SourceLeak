package org.yaml;

class Z_b implements Zgy {
  Z_3 Zv;
  
  final Zln ZC;
  
  public Z_b(Zln paramZln, Z_3 paramZ_3) {
    this.Zv = paramZ_3;
  }
  
  public Zlv ZG() {
    if (this.ZC.ZI.ZC(new Ztt[] { Ztt.Comment })) {
      Zln.ZH(this.ZC, new Z_b(this.ZC, this.Zv));
      return Zln.Zm(this.ZC, (Zg6)this.ZC.ZI.Zs());
    } 
    if (!this.ZC.ZI.ZC(new Ztt[] { Ztt.BlockEntry, Ztt.BlockEnd })) {
      Zln.ZC(this.ZC).Zq(new Zw(this.ZC, null));
      return (new Z_h(this.ZC, null)).ZG();
    } 
    Zln.ZH(this.ZC, new Zw(this.ZC, null));
    return Zln.Zg(this.ZC, this.Zv.Zm());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */