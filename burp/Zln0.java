package burp;

public class Zln0 implements Zbu2 {
  private int Zq;
  
  public void ZW(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    this.Zq = Zzvi.Zw(Zyf.Zy(paramArrayOfbyte).Zb(paramZs68.Zd(), paramArrayOfbyte.length)).size();
  }
  
  public void ZB(Zt82 paramZt82) {
    paramZt82.Ze(ZV(), this.Zq);
  }
  
  public Zlug ZV() {
    return Zlug.EMAIL_ADDRESS_COUNT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zln0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */