package org.yaml;

class Zm implements Zgy {
  final Zln ZN;
  
  private Zm(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.ZN.ZI.ZC(new Ztt[] { Ztt.Comment })) {
      Zln.ZH(this.ZN, new Zm(this.ZN));
      return Zln.Zm(this.ZN, (Zg6)this.ZN.ZI.Zs());
    } 
    if (!this.ZN.ZI.ZC(new Ztt[] { Ztt.Directive, Ztt.DocumentStart, Ztt.StreamEnd })) {
      Z_8 z_8 = this.ZN.ZI.ZG();
      Zt1 zt11 = z_8.ZL();
      Zt1 zt12 = zt11;
      Zl8 zl8 = new Zl8(zt11, zt12, false, null, null);
      Zln.ZC(this.ZN).Zq(new Zts(this.ZN, null));
      Zln.ZH(this.ZN, new Z_h(this.ZN, null));
      return zl8;
    } 
    return (new Ztv(this.ZN, null)).ZG();
  }
  
  Zm(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */