package org.yaml;

class Zk implements Zgy {
  final Zln ZB;
  
  private Zk(Zln paramZln) {}
  
  public Zlv ZG() {
    if (this.ZB.ZI.ZC(new Ztt[] { Ztt.Value })) {
      Z_8 z_81 = this.ZB.ZI.Zs();
      if (!this.ZB.ZI.ZC(new Ztt[] { Ztt.FlowEntry, Ztt.FlowSequenceEnd })) {
        Zln.ZC(this.ZB).Zq(new Zj0(this.ZB, null));
        return Zln.ZQ(this.ZB);
      } 
      Zln.ZH(this.ZB, new Zj0(this.ZB, null));
      return Zln.Zg(this.ZB, z_81.Zm());
    } 
    Zln.ZH(this.ZB, new Zj0(this.ZB, null));
    Z_8 z_8 = this.ZB.ZI.ZG();
    return Zln.Zg(this.ZB, z_8.ZL());
  }
  
  Zk(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */