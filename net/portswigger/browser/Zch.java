package net.portswigger.browser;

import java.util.LinkedList;
import java.util.List;

class Zch {
  List<Zd_> ZT = new LinkedList<>();
  
  Zdr Ze = Zdr.ZR;
  
  public Zch Zf(Zdr paramZdr) {
    this.Ze = paramZdr;
    return this;
  }
  
  public Zch Ze(Zd_ paramZd_) {
    this.ZT.add(paramZd_);
    return this;
  }
  
  public Zc5 ZK() {
    return new Zc5(this.Ze, this.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */