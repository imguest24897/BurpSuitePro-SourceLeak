package burp;

public class Zevt implements Zbu2 {
  private int Zx;
  
  public void ZW(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    this.Zx = Zrk0.Zo(Zyf.Zy(paramArrayOfbyte).Zb(paramZs68.Zd(), paramArrayOfbyte.length)).size();
  }
  
  public void ZB(Zt82 paramZt82) {
    paramZt82.Ze(ZV(), this.Zx);
  }
  
  public Zlug ZV() {
    return Zlug.CREDIT_CARD_COUNT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */