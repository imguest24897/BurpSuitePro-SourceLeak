package net.portswigger;

import java.util.ArrayList;

class Zo2 extends ArrayList<Zot> {
  Zo2 ZX;
  
  final Zdz Zu;
  
  Zo2(Zdz paramZdz) {
    this.ZX = paramZdz.ZaA;
    paramZdz.ZaA = this;
  }
  
  Zot ZY() {
    return isEmpty() ? this.ZX.ZY() : remove(size() - 1);
  }
  
  void Zk() {
    this.ZX.addAll(this);
    this.Zu.ZaA = this.ZX;
  }
  
  public Zo2 ZZ() {
    Zo2 zo2 = (Zo2)super.clone();
    if (this.ZX != null)
      zo2.ZX = this.ZX.ZZ(); 
    return zo2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zo2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */