package net.portswigger.browser;

import java.util.HashMap;
import java.util.Map;

public class Zjv implements Zdt {
  private Zj5 Zk = Zj5.Zc;
  
  private final Map<Integer, Zx> Za = new HashMap<>();
  
  private final Map<Integer, Ze2> ZJ = new HashMap<>();
  
  public Zjv ZG(Zj5 paramZj5) {
    this.Zk = paramZj5;
    return this;
  }
  
  public Zdr Zl() {
    return new Zdr(this.Zk, this.Za, this.ZJ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zjv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */