package burp;

public class Ztl {
  private final Zg5c ZJ;
  
  private final Zbnt Zf;
  
  private Zs68 Zt;
  
  private Zefx ZU;
  
  private Zb6q Za;
  
  Ztl(Zbnt paramZbnt, Zg5c paramZg5c) {
    this.Zf = paramZbnt;
    this.ZJ = paramZg5c;
  }
  
  public void Z_(Zmhe paramZmhe, byte[] paramArrayOfbyte, byte paramByte) {
    Zlvf zlvf = paramZmhe.ZK(Zri7.ZJ(new Zrrb(paramArrayOfbyte, paramByte)), Zlp5.Zc().Zd(true));
    this.ZJ.ZL(zlvf, paramArrayOfbyte);
    this.ZU = zlvf.Zd().ZL();
    this.Za = zlvf.ZM().ZT();
    if (this.ZU != null && this.Za != null)
      this.Zt = Zbwc.Zt(this.ZU.ZF(), this.Za.Za(), Zt0k.HTML_ANALYSIS, this.Zf); 
  }
  
  public Zefx Zf() {
    return this.ZU;
  }
  
  Zlit ZV() {
    return (this.ZU == null) ? null : this.ZU.ZF();
  }
  
  public Zb6q ZL() {
    return this.Za;
  }
  
  public Zs68 ZG() {
    return this.Zt;
  }
  
  boolean ZJ() {
    return (this.ZU == null || this.Za == null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */