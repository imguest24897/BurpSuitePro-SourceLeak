package burp;

import net.portswigger.Zco;
import net.portswigger.Zs4;

public class Zmtq {
  private static final Zs4 Zo = new Zs4();
  
  private final Zziy ZM;
  
  private Zco Zi;
  
  public Zmtq(Zziy paramZziy) {
    this.ZM = paramZziy;
    if (paramZziy.ZM9() == null)
      paramZziy.ZG(ZV()); 
    this.Zi = Zco.Zf(paramZziy.ZM9());
  }
  
  public Zmtq() {
    this.ZM = new Zuk();
    Zc(ZV());
  }
  
  public byte[] ZI() {
    return this.ZM.ZM9();
  }
  
  public void Zc(byte[] paramArrayOfbyte) {
    this.ZM.ZG(paramArrayOfbyte);
    this.Zi = Zco.Zf(paramArrayOfbyte);
  }
  
  public Zco Ze() {
    return this.Zi;
  }
  
  public void Zs() {
    byte[] arrayOfByte = ZV();
    this.ZM.ZG(arrayOfByte);
    this.Zi = Zco.Zf(arrayOfByte);
  }
  
  private static byte[] ZV() {
    return Zo.ZU().Zz(32);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */