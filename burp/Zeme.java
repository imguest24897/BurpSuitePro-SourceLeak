package burp;

import java.util.Iterator;
import java.util.List;

public class Zeme implements Zmv4 {
  private final Zb3t Zz;
  
  private final Zrn9 ZQ;
  
  private final Zzzp Zq;
  
  private final Zxpd Zb;
  
  private final List<List<Zgc7>> ZZ;
  
  private final Zkjg Zi;
  
  private Zmu7 ZY;
  
  private boolean ZT;
  
  private int Zk;
  
  private int Zy;
  
  public Zeme(Zb3t paramZb3t, Zrn9 paramZrn9, Zzzp paramZzzp, Zxpd paramZxpd) {
    this.Zz = paramZb3t;
    this.ZQ = paramZrn9;
    this.Zq = paramZzzp;
    this.Zb = paramZxpd;
    this.ZZ = paramZb3t.<List<List<Zgc7>>>ZO(Zxc6.FunctionCalls);
    this.Zi = new Zkjg(paramZb3t);
    int i = Zlik.ZV();
    this.Zy = paramZzzp.Zj();
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void ZO(Zkr1<Zmv4> paramZkr1) {
    Zmv4 zmv4 = Zi();
    paramZkr1.Zy(zmv4);
  }
  
  private Zmv4 Zi() {
    Zlik zlik;
    int i = Zlik.ZY();
    Zeme zeme = this;
    if (!this.ZT && this.ZZ != null && !this.ZZ.isEmpty()) {
      int j = this.ZZ.size() - 1;
      while (j >= 0) {
        zlik = new Zlik(this.Zz, zeme, this.ZQ, this.ZZ.get(j), this.Zq, this.Zb);
        zlik.Za(this.Zk);
        j--;
        if (i == 0)
          break; 
      } 
      this.ZT = true;
    } 
    return zlik;
  }
  
  public void Za(int paramInt) {
    this.Zk = paramInt;
    if (paramInt < this.ZQ.ZP())
      this.ZY = new Zzbx(this); 
  }
  
  public boolean Za(Zb3t paramZb3t, int paramInt) {
    return (this.Zz == paramZb3t && this.Zk == paramInt);
  }
  
  public Zmu7 ZC() {
    return this.ZY;
  }
  
  public Iterator<Zb3t> ZX() {
    return this.Zi;
  }
  
  public Zb3t ZM() {
    return this.Zz;
  }
  
  public int ZP() {
    return this.Zk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */