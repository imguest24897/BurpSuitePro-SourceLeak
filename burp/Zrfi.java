package burp;

import java.util.List;

class Zrfi implements Zln1 {
  private final Zlk4 ZY;
  
  private final Ztfc Zl;
  
  Zrfi(Zlk4 paramZlk4) {
    this.ZY = paramZlk4;
    this.Zl = new Ztfc(paramZlk4);
  }
  
  public List<Zllr> ZV() {
    return (new Zbz8(this.ZY)).ZK();
  }
  
  public List<Zllr> Zn() {
    return (new Zmcu(this.ZY)).Zn();
  }
  
  public List<Zllr> Zc() {
    return (new Zxsl(this.ZY)).ZQ();
  }
  
  public List<Zllr> ZW() {
    return (new Zkdi(this.ZY)).Zu();
  }
  
  public List<Zllr> Zv() {
    return this.Zl.Zn();
  }
  
  public List<Zllr> ZU() {
    return this.Zl.ZR();
  }
  
  public List<Zllr> ZA() {
    return this.Zl.ZS();
  }
  
  public List<Zllr> Zp(String paramString) {
    return this.Zl.Zi(paramString);
  }
  
  public List<Zllr> Zx() {
    return this.Zl.ZF();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */