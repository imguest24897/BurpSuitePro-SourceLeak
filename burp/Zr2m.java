package burp;

import java.util.List;

class Zr2m implements Zeq7 {
  private final List<Zzyu> Zq;
  
  private final Zsob Zc;
  
  private Zmvm Zb;
  
  Zr2m(List<Zzyu> paramList, Zsob paramZsob) {
    this.Zq = paramList;
    this.Zc = paramZsob;
  }
  
  public Zzyu Zw() {
    return ZH();
  }
  
  private void Zc(Zmvm paramZmvm) {
    this.Zb = paramZmvm;
  }
  
  private Zzyu ZH() {
    if (this.Zb == null)
      return null; 
    synchronized (this.Zq) {
      int i = this.Zb.Zs();
      if (i >= 0 && i < this.Zc.Zh())
        return this.Zq.get(this.Zc.ZE(i).Zc()); 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr2m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */