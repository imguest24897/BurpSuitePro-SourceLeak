package net.portswigger;

import java.util.ArrayList;

class Zd_ extends ArrayList<Zld> {
  Zd_ ZC;
  
  final Zb1 ZE;
  
  Zd_(Zb1 paramZb1) {
    this.ZC = paramZb1.Zi;
    paramZb1.Zi = this;
  }
  
  Zld Zu() {
    return isEmpty() ? this.ZC.Zu() : remove(size() - 1);
  }
  
  void Zi() {
    this.ZC.addAll(this);
    this.ZE.Zi = this.ZC;
  }
  
  public Zd_ Zf() {
    Zd_ zd_ = (Zd_)super.clone();
    if (this.ZC != null)
      zd_.ZC = this.ZC.Zf(); 
    return zd_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */