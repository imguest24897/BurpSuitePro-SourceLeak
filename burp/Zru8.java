package burp;

import java.io.IOException;
import java.io.InputStream;

public class Zru8 extends Zr15 {
  private final Ztg4 Zu;
  
  public Zru8(Ztg4 paramZtg4) {
    this.Zu = paramZtg4;
  }
  
  public Zstu ZZ(byte[] paramArrayOfbyte) {
    return (new Zyj(this.Zu, paramArrayOfbyte.length)).Zt(paramArrayOfbyte);
  }
  
  public Zmrq Zc(int paramInt) {
    return ZH(new Zr3b(paramInt));
  }
  
  public Zstu ZI(InputStream paramInputStream, int paramInt) throws IOException {
    return (new Zyj(this.Zu, paramInt)).ZU(paramInputStream, paramInt);
  }
  
  public boolean ZV(Zxsr paramZxsr) {
    return false;
  }
  
  public boolean ZB() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zru8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */