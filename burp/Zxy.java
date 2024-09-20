package burp;

import java.awt.Component;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxy implements Ztf9 {
  private final Zbs9 ZG;
  
  Zxy(Zbs9 paramZbs9) {
    this.ZG = paramZbs9;
  }
  
  public Optional<String> Zy(Zs3n paramZs3n) {
    return this.ZG.Zy(paramZs3n);
  }
  
  public void ZB(int paramInt) {
    this.ZG.ZY(paramInt);
  }
  
  public Optional<String> Za(int paramInt, Zs3n paramZs3n) {
    return this.ZG.Zl(paramInt, paramZs3n);
  }
  
  public void ZE(List<Integer> paramList) {
    this.ZG.ZN(paramList);
  }
  
  public void ZU() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZP(Zmf_ paramZmf_) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public String ZR(String paramString) {
    Zuh.Zb(false, Zqf.ZC);
    return null;
  }
  
  public void Zk() {
    this.ZG.ZS();
  }
  
  public boolean ZB() {
    return this.ZG.Zd();
  }
  
  public void Z_(Zz62 paramZz62) {
    this.ZG.ZH(paramZz62);
  }
  
  public Optional<String> Zr(Zg96 paramZg96) {
    return this.ZG.ZY(paramZg96);
  }
  
  public void ZL(Zmle paramZmle, Zg96 paramZg96, Zrvo paramZrvo) {
    this.ZG.Zu(paramZmle, paramZg96, paramZrvo);
  }
  
  public void ZY() {
    this.ZG.ZU();
  }
  
  public void ZQ() {
    this.ZG.Zh();
  }
  
  public int ZS() {
    return this.ZG.Zf();
  }
  
  public void Zg(Component paramComponent) {
    Zrv6.ZC(Zt2m.ZF(paramComponent), this);
  }
  
  public void Zl(Component paramComponent) {
    Zrvf.ZC(Zt2m.ZF(paramComponent), this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */