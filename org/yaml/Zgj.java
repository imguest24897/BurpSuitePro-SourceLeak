package org.yaml;

class Zgj implements Zgy {
  final Zln ZK;
  
  private Zgj(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.ZK.ZI.ZC(new Ztt[] { Ztt.Value })) {
      Z_8 z_81 = this.ZK.ZI.Zs();
      if (this.ZK.ZI.ZC(new Ztt[] { Ztt.Comment })) {
        Zln.ZH(this.ZK, new Z_c(this.ZK, null));
        return Zln.Zy(this.ZK).ZG();
      } 
      if (!this.ZK.ZI.ZC(new Ztt[] { Ztt.Key, Ztt.Value, Ztt.BlockEnd })) {
        Zln.ZC(this.ZK).Zq(new Z_i(this.ZK, null));
        return Zln.Ze(this.ZK);
      } 
      Zln.ZH(this.ZK, new Z_i(this.ZK, null));
      return Zln.Zg(this.ZK, z_81.Zm());
    } 
    if (this.ZK.ZI.ZC(new Ztt[] { Ztt.Scalar })) {
      Zln.ZC(this.ZK).Zq(new Z_i(this.ZK, null));
      return Zln.Ze(this.ZK);
    } 
    Zln.ZH(this.ZK, new Z_i(this.ZK, null));
    Z_8 z_8 = this.ZK.ZI.ZG();
    return Zln.Zg(this.ZK, z_8.ZL());
  }
  
  Zgj(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zgj.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */