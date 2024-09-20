package burp;

import net.portswigger.Zq;

public class Zza_ implements Zq {
  private final Zstu ZD;
  
  public Zza_(Zstu paramZstu) {
    this.ZD = paramZstu;
  }
  
  public boolean Zc() {
    return (this.ZD == null);
  }
  
  public int Zp() {
    return this.ZD.Zpu();
  }
  
  public int Zg(int paramInt) {
    return this.ZD.Zp(paramInt) & 0xFF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zza_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */