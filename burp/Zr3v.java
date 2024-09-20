package burp;

public class Zr3v implements Zzc4 {
  private final Zvo9 Zj;
  
  private final Zrc1 ZD;
  
  private volatile boolean ZV;
  
  Zr3v(Zvo9 paramZvo9, Zrc1 paramZrc1) {
    this.Zj = paramZvo9;
    this.ZD = paramZrc1;
  }
  
  public Zm6s<? extends Zmgr> Z_() {
    if (!this.ZV) {
      this.ZV = true;
      return Zm6s.ZQ(this::lambda$nextPhase$0);
    } 
    return Zm6s.ZG();
  }
  
  private void lambda$nextPhase$0(Zrj paramZrj, Zlsy paramZlsy) {
    this.Zj.ZN(this.ZD);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */