package org.yaml;

class Z_0 implements Zgy {
  Z_3 ZH;
  
  final Zln Zx;
  
  public Z_0(Zln paramZln, Z_3 paramZ_3) {
    this.ZH = paramZ_3;
  }
  
  public Zlv ZG() {
    if (this.Zx.ZI.ZC(new Ztt[] { Ztt.Comment })) {
      Zln.ZH(this.Zx, new Z_0(this.Zx, this.ZH));
      return Zln.Zm(this.Zx, (Zg6)this.Zx.ZI.Zs());
    } 
    if (!this.Zx.ZI.ZC(new Ztt[] { Ztt.BlockEntry, Ztt.Key, Ztt.Value, Ztt.BlockEnd })) {
      Zln.ZC(this.Zx).Zq(new Zjs(this.Zx, null));
      return (new Z_h(this.Zx, null)).ZG();
    } 
    Zln.ZH(this.Zx, new Zjs(this.Zx, null));
    return Zln.Zg(this.Zx, this.ZH.Zm());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */