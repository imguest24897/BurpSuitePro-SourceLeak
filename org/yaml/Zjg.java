package org.yaml;

class Zjg implements Zgy {
  final Zln ZL;
  
  private Zjg(Zln paramZln) {}
  
  public Zlv ZG() {
    Z_8 z_8 = this.ZL.ZI.Zs();
    if (!this.ZL.ZI.ZC(new Ztt[] { Ztt.Value, Ztt.FlowEntry, Ztt.FlowSequenceEnd })) {
      Zln.ZC(this.ZL).Zq(new Zk(this.ZL, null));
      return Zln.ZQ(this.ZL);
    } 
    Zln.ZH(this.ZL, new Zk(this.ZL, null));
    return Zln.Zg(this.ZL, z_8.Zm());
  }
  
  Zjg(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zjg.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */