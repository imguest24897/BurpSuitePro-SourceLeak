package burp;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zsy;

class Zv3 implements Zbjl {
  private final Zbj1 Zu;
  
  private final Ztz_ ZF;
  
  private final Zzo_ ZK;
  
  private final Zmtq Zt;
  
  private final Zgb6 Zz;
  
  Zv3(Zbj1 paramZbj1, Ztz_ paramZtz_, Zzo_ paramZzo_, Zmtq paramZmtq, Zgb6 paramZgb6) {
    this.Zu = paramZbj1;
    this.ZF = paramZtz_;
    this.ZK = paramZzo_;
    this.Zt = paramZmtq;
    this.Zz = paramZgb6;
  }
  
  public void ZF(Zkq4 paramZkq4, Zb9a paramZb9a, Zkl6 paramZkl6, Zmz6 paramZmz6, Zr_4 paramZr_4, Zesv paramZesv, List<Zg_8> paramList, Zsy paramZsy, Zly1 paramZly1, Zr5h paramZr5h, boolean paramBoolean, Zz1m<Zt1o> paramZz1m) {
    Zlfp zlfp = new Zlfp(paramZkq4, paramZb9a, paramZkl6, paramZmz6, paramZr_4, paramZesv, paramList, this.ZF, paramZsy, paramZly1, paramZr5h.Zdm(), this, paramBoolean, paramZz1m);
    this.Zu.Zm(paramZr5h.ZPo(), zlfp);
  }
  
  public void Zs() {
    this.ZK.ZJ();
  }
  
  public void ZS() {
    this.ZK.ZC();
  }
  
  public List<Zer0> ZV(int paramInt, Ze3n paramZe3n) {
    return this.Zu.Zw(paramInt, paramZe3n, Zo());
  }
  
  public List<Zer0> Zb(Zen paramZen) {
    return this.Zu.ZJ(paramZen, Zo());
  }
  
  public List<Zer0> Zn(Zen paramZen) {
    return this.Zu.Zd(paramZen, Zo());
  }
  
  public List<Zer0> Ze(Zen paramZen) {
    return this.Zu.Zb(paramZen, Zo());
  }
  
  public void Zz(Collection<Zen> paramCollection, int paramInt1, int paramInt2) {
    this.Zu.Zv(paramCollection, paramInt1, paramInt2);
  }
  
  public boolean ZF(Zen paramZen) {
    return this.Zt.Ze().Zp().equals(paramZen.Zv.Zp());
  }
  
  public Zen ZK(int paramInt, String paramString) {
    return new Zen(this.Zt.Ze(), paramInt, paramString);
  }
  
  public boolean ZG() {
    return (Zo()).ZT;
  }
  
  public Zzi5 ZB() {
    return (Zo()).Zu;
  }
  
  public void ZP() {
    this.ZK.ZN(Duration.ofMinutes(10L));
  }
  
  private Zes1 Zo() {
    return this.Zz.ZU0();
  }
  
  public void ZY() {
    this.ZK.ZY();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */