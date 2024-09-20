package burp;

import java.util.List;

public class Zg9v implements Zv8b, Ztiu, Zrae, Zerf {
  private final Zxoi Zk;
  
  private final Zec6 Zq;
  
  private final Zs1n Zc;
  
  private final boolean Zz;
  
  private Zrx_ ZC;
  
  public Zg9v(Zs1n paramZs1n, Zz8a paramZz8a, Zrx_ paramZrx_, Zxoi paramZxoi, boolean paramBoolean) {
    this.Zc = paramZs1n;
    this.ZC = paramZrx_;
    this.Zk = paramZxoi;
    this.Zz = paramBoolean;
    this.Zq = new Zec6(paramZz8a);
  }
  
  public void Zr(Zkcl paramZkcl) {
    this.Zk.Zr(paramZkcl);
    ZX(paramZkcl);
  }
  
  public void Zd() {
    this.Zk.Zd();
  }
  
  public void Z_() {
    this.Zk.Z_();
  }
  
  public void ZQ(Zmln paramZmln) {
    this.Zk.ZQ(paramZmln);
  }
  
  public void Zx(Zkbn paramZkbn) {
    this.Zk.Zx(paramZkbn);
  }
  
  public void ZF(int paramInt) {
    this.Zk.ZF(paramInt);
  }
  
  public void Zm(int paramInt) {
    this.Zk.Zm(paramInt);
  }
  
  public void Zq(int paramInt) {
    this.Zk.Zq(paramInt);
  }
  
  public void Zw(int paramInt, String paramString, Zmf_ paramZmf_) {
    this.Zk.Zw(paramInt, paramString, paramZmf_);
  }
  
  public void Zy(int[] paramArrayOfint) {
    this.Zk.Zy(paramArrayOfint);
  }
  
  public void ZG() {
    this.Zk.ZG();
  }
  
  public void ZK(List<Zkbn> paramList) {
    this.Zk.ZK(paramList);
  }
  
  public void ZJ() {
    this.Zk.ZJ();
  }
  
  public void Zp(Zk9f paramZk9f) {
    this.Zk.Zp(paramZk9f);
  }
  
  public Zxz8 ZY(List<Zkbn> paramList) {
    return this.Zk.ZY(paramList);
  }
  
  public void ZH(Zm40 paramZm40) {
    this.Zq.ZH(paramZm40);
  }
  
  public Zm40 ZI() {
    return this.Zq.ZI();
  }
  
  public boolean ZP() {
    return (this.ZC == Zrx_.PRESET) ? this.Zq.ZP() : this.Zk.ZP();
  }
  
  public String ZC() {
    return (this.ZC == Zrx_.PRESET) ? this.Zq.ZC() : this.Zk.ZC();
  }
  
  public Zgyw ZH() {
    return (this.ZC == Zrx_.PRESET) ? this.Zq.ZH() : this.Zk.ZH();
  }
  
  public void Zc(Zrx_ paramZrx_) {
    this.ZC = paramZrx_;
  }
  
  private void ZX(Zkcl paramZkcl) {
    int i = Zbiv.ZV();
    if (this.Zz && paramZkcl == Zkcl.SCAN_CRAWL_AND_AUDIT) {
      this.Zc.ZJ();
      if (i == 0) {
        this.Zc.ZT();
        return;
      } 
      return;
    } 
    this.Zc.ZT();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */