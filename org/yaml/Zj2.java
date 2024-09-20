package org.yaml;

class Zj2 implements Zgy {
  final Zln Zy;
  
  private Zj2(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.Zy.ZI.ZC(new Ztt[] { Ztt.Comment })) {
      Zln.ZH(this.Zy, new Zj2(this.Zy));
      return Zln.Zm(this.Zy, (Zg6)this.Zy.ZI.Zs());
    } 
    if (this.Zy.ZI.ZC(new Ztt[] { Ztt.Directive, Ztt.DocumentStart, Ztt.DocumentEnd, Ztt.StreamEnd })) {
      Zlv zlv = Zln.Zg(this.Zy, this.Zy.ZI.ZG().ZL());
      Zln.ZH(this.Zy, Zln.ZC(this.Zy).ZE());
      return zlv;
    } 
    return (new Z_h(this.Zy, null)).ZG();
  }
  
  Zj2(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */