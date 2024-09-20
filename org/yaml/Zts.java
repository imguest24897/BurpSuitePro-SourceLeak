package org.yaml;

import burp.Zbqc;

class Zts implements Zgy {
  final Zln Zn;
  
  private Zts(Zln paramZln) {}
  
  public Zlv ZG() {
    Z_8 z_8 = this.Zn.ZI.ZG();
    Zt1 zt11 = z_8.ZL();
    Zt1 zt12 = zt11;
    boolean bool = false;
    int[] arrayOfInt = Zln.ZS();
    if (this.Zn.ZI.ZC(new Ztt[] { Ztt.DocumentEnd })) {
      z_8 = this.Zn.ZI.Zs();
      zt12 = z_8.Zm();
      bool = true;
    } 
    Zle zle = new Zle(zt11, zt12, bool);
    Zln.ZH(this.Zn, new Ztv(this.Zn, null));
    if (Zbqc.Zwu() == null)
      Zln.ZI(new int[2]); 
    return zle;
  }
  
  Zts(Zln paramZln, Zjo paramZjo) {
    this(paramZln);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zts.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */