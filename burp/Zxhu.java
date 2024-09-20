package burp;

import java.io.IOException;

public class Zxhu extends Zxhw implements Zx05 {
  protected Zxhu(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkq1 ZiB() {
    return new Zkt5(this.Za, this);
  }
  
  public void ZD(Zsh8 paramZsh8, Zerg paramZerg, Zgb6 paramZgb6, int paramInt) throws Zs7w, Ztgu {
    Zelx.Zh(this, this.Za);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    super.ZS(paramZs4f);
    Zelx.ZD(this, paramZs4f);
  }
  
  public Zrte<Zefg<Zstu>> ZCR() {
    return this.Za.<Zrte<Zefg<Zstu>>>ZA(this, Zk0n.Zn);
  }
  
  public void Zu(Zrte<Zefg<Zstu>> paramZrte) {
    this.Za.ZQ(this, Zk0n.Zn, paramZrte);
  }
  
  public void Zd(int paramInt, Zefg<Zstu> paramZefg) {
    Zrte<Zefg<Zstu>> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk0n.Zn);
    if (zrte != null)
      zrte.ZU(paramInt, paramZefg); 
  }
  
  public Zrte<Zstu> ZCC() {
    return this.Za.<Zrte<Zstu>>ZA(this, Zk0n.Zi);
  }
  
  public void ZU(Zrte<Zstu> paramZrte) {
    this.Za.ZQ(this, Zk0n.Zi, paramZrte);
  }
  
  public void ZP(int paramInt, Zstu paramZstu) {
    Zrte<Zstu> zrte = ZCC();
    if (zrte != null)
      zrte.ZU(paramInt, paramZstu); 
  }
  
  public Zmyi ZCg() {
    return this.Za.<Zmyi>ZA(this, Zk0n.Zp);
  }
  
  public void Zq(Zmyi paramZmyi) {
    this.Za.ZQ(this, Zk0n.Zp, paramZmyi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */