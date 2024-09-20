package net.portswigger.browser;

import burp.Zlli;

class Zc9 implements Zeg {
  private final Zjc Za;
  
  private final Zeg ZC;
  
  public Zc9(Zjc paramZjc, Zeg paramZeg) {
    this.Za = paramZjc;
    this.ZC = paramZeg;
  }
  
  public boolean Zj(Zjc paramZjc) {
    return this.Za.ZG().equals(paramZjc.ZG());
  }
  
  public boolean Zv() {
    return this.ZC.Zv();
  }
  
  public void Zd() {
    this.ZC.Zd();
  }
  
  public void ZY() {
    this.ZC.ZY();
  }
  
  public void Zh(String paramString) {
    this.ZC.Zh(paramString);
  }
  
  public Zlli<Zc2> Zc() {
    return this.ZC.Zc();
  }
  
  public Zj4 Zq() {
    return this.ZC.Zq();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zc9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */