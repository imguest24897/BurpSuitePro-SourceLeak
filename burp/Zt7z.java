package burp;

import net.portswigger.Zsy;

public class Zt7z {
  private final Ze51 ZS;
  
  private final Zxs7 Zo;
  
  public Zt7z(Zmhe paramZmhe, Zxs7 paramZxs7, Zsy paramZsy, Zspd paramZspd) {
    this.Zo = paramZxs7;
    this.ZS = new Ze51(paramZsy, paramZxs7, paramZmhe, paramZspd);
  }
  
  public void ZE() {
    Zf(this.ZS.ZJ());
  }
  
  public void Zk(Zgfe paramZgfe) {
    Zf(this.ZS.ZA(paramZgfe));
  }
  
  public void ZS() {
    Zf(this.ZS.Zo());
  }
  
  private void Zf(Zmgx paramZmgx) {
    paramZmgx.ZM((byte)0);
    if (ZW())
      paramZmgx.ZM((byte)1); 
  }
  
  private boolean ZW() {
    return (!this.Zo.ZI().isEmpty() && this.Zo.Z_() != Zs66.PARAM_NAME_URL && this.Zo.Z_() != Zs66.PARAM_NAME_BODY_URL_ENCODED && this.Zo.Z_() != Zs66.PARAM_NAME_BODY_MULTIPART);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */