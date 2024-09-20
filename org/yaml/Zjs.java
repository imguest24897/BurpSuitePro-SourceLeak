package org.yaml;

class Zjs implements Zgy {
  final Zln Zk;
  
  private Zjs(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.Zk.ZI.ZC(new Ztt[] { Ztt.Comment })) {
      Zln.ZH(this.Zk, new Zjs(this.Zk));
      return Zln.Zm(this.Zk, (Zg6)this.Zk.ZI.Zs());
    } 
    if (this.Zk.ZI.ZC(new Ztt[] { Ztt.BlockEntry })) {
      Z_3 z_3 = (Z_3)this.Zk.ZI.Zs();
      return (new Z_0(this.Zk, z_3)).ZG();
    } 
    Z_8 z_8 = this.Zk.ZI.ZG();
    Zlu zlu = new Zlu(z_8.ZL(), z_8.Zm());
    Zln.ZH(this.Zk, Zln.ZC(this.Zk).ZE());
    return zlu;
  }
  
  Zjs(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zjs.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */