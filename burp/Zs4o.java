package burp;

import java.util.List;

public class Zs4o {
  private final Zkit ZN;
  
  private Zlit Zn;
  
  private String ZL;
  
  private Zez3 ZY;
  
  private List<Zez3> ZT;
  
  public Zs4o(Zkit paramZkit) {
    this.ZN = paramZkit;
  }
  
  public void ZK(Zez3 paramZez3) {
    this.ZN.Zq(paramZez3, Zk3e.Zl, this.Zn);
    this.ZN.Zi(paramZez3, Zk3e.ZW, this.ZL);
    this.ZN.Zq(paramZez3, Zk3e.ZD, this.ZY);
    String str = Zxbg.ZFI();
    if (this.ZT != null) {
      Zefg<Zez3> zefg = Zkk.ZV(this.ZN, Zez3.ZZ);
      this.ZN.Zq(paramZez3, Zk3e.ZX, zefg);
      zefg.addAll(this.ZT);
    } 
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zs4o Zq(Zlit paramZlit) {
    this.Zn = paramZlit;
    return this;
  }
  
  public Zs4o Zl(String paramString) {
    this.ZL = paramString;
    return this;
  }
  
  public Zs4o Zk(Zez3 paramZez3) {
    this.ZY = paramZez3;
    return this;
  }
  
  public Zs4o Zz(List<Zez3> paramList) {
    this.ZT = paramList;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */