package burp;

import java.io.IOException;
import java.time.ZonedDateTime;
import net.portswigger.Zkb;

public class Zkyo extends Zkte {
  private final Zz0c ZK;
  
  public Zkyo(Zr_4 paramZr_4, Zz0c paramZz0c) {
    super(paramZr_4, paramZz0c);
    this.ZK = paramZz0c;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZK.ZS(paramZs4f);
  }
  
  public void Zy4() {
    this.ZK.Zy4();
  }
  
  public void ZyK() {
    this.ZK.ZyK();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    ZonedDateTime zonedDateTime = this.ZK.ZX6();
    if (zonedDateTime.isAfter(this.ZK.ZXf()))
      return null; 
    byte[] arrayOfByte = Zkb.Zy(this.ZK.ZXs().format(zonedDateTime));
    zonedDateTime = zonedDateTime.plus(this.ZK.ZXz(), this.ZK.ZXL().getBaseUnit());
    this.ZK.ZR(zonedDateTime);
    return this.ZK.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */