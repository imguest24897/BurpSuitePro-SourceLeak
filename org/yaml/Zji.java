package org.yaml;

class Zji implements Zgy {
  final Zln Zf;
  
  private Zji(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.Zf.ZI.ZC(new Ztt[] { Ztt.Value })) {
      Z_8 z_81 = this.Zf.ZI.Zs();
      if (!this.Zf.ZI.ZC(new Ztt[] { Ztt.FlowEntry, Ztt.FlowMappingEnd })) {
        Zln.ZC(this.Zf).Zq(new Zlo(this.Zf, false));
        return Zln.ZQ(this.Zf);
      } 
      Zln.ZH(this.Zf, new Zlo(this.Zf, false));
      return Zln.Zg(this.Zf, z_81.Zm());
    } 
    Zln.ZH(this.Zf, new Zlo(this.Zf, false));
    Z_8 z_8 = this.Zf.ZI.ZG();
    return Zln.Zg(this.Zf, z_8.ZL());
  }
  
  Zji(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zji.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */