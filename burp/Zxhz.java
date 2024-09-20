package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxhz extends Zxsr implements Zxwh {
  protected Zxhz(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZWy() {
    return this.Za.Zi(this, Zk_y.ZR);
  }
  
  public void ZvX(boolean paramBoolean) {
    this.Za.ZH(this, Zk_y.ZR, paramBoolean);
  }
  
  public Ze0f ZWG() {
    int i = this.Za.Zx(this, Zk_y.Ze);
    if (i == -1)
      return null; 
    Ze0f ze0f = Ze0f.Zm(i);
    Zuh.Zv((ze0f != null), Zqf.Zk, i);
    return ze0f;
  }
  
  public void ZA(Ze0f paramZe0f) {
    boolean bool = (paramZe0f == null) ? true : paramZe0f.persistedId;
    this.Za.ZM(this, Zk_y.Ze, bool);
  }
  
  public String ZWV() {
    return this.Za.Zf(this, Zk_y.Zq);
  }
  
  public void ZAC(String paramString) {
    this.Za.Zi(this, Zk_y.Zq, paramString);
  }
  
  public String ZWP() {
    return this.Za.Zf(this, Zk_y.ZW);
  }
  
  public void ZAI(String paramString) {
    this.Za.Zi(this, Zk_y.ZW, paramString);
  }
  
  public String ZWp() {
    return this.Za.Zf(this, Zk_y.Zh);
  }
  
  public void ZAe(String paramString) {
    this.Za.Zi(this, Zk_y.Zh, paramString);
  }
  
  public int ZWN() {
    return this.Za.Zx(this, Zk_y.ZI);
  }
  
  public void ZWW(int paramInt) {
    this.Za.ZM(this, Zk_y.ZI, paramInt);
  }
  
  public int ZWn() {
    return this.Za.Zx(this, Zk_y.Zx);
  }
  
  public void ZWA(int paramInt) {
    this.Za.ZM(this, Zk_y.Zx, paramInt);
  }
  
  public Zeu4<? extends Zxwh> ZF() {
    return Zxwh.ZF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */