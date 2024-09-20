package org.yaml;

import java.util.List;

class Zt9 implements Zgy {
  List<Zg6> Zs;
  
  final Zln ZS;
  
  public Zt9(Zln paramZln, List<Zg6> paramList) {
    this.Zs = paramList;
  }
  
  public Zlv ZG() {
    return !this.Zs.isEmpty() ? Zln.Zm(this.ZS, this.Zs.remove(0)) : (new Z_i(this.ZS, null)).ZG();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zt9.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */