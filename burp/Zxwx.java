package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxwx implements Zx7 {
  private final Zkl6 ZG;
  
  private final Zsbf<Zefx, Zsxd> Zp;
  
  public Zxwx(Zkl6 paramZkl6, Zsbf<Zefx, Zsxd> paramZsbf) {
    this.ZG = paramZkl6;
    this.Zp = paramZsbf;
  }
  
  public void Zt(Zz2j paramZz2j, Zml3 paramZml3) throws Zz8h, IOException, Zs2o {
    byte[] arrayOfByte = new byte[0];
    try {
      Zyf zyf = Zyf.Zy(paramZml3.ZC());
      Zefx zefx = this.ZG.ZH().ZY(paramZml3.ZZ(), zyf.ZiD());
      Zsxd zsxd = this.Zp.ZR(zefx);
      Zb6q zb6q = zsxd.ZG().Ze();
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      arrayOfByte = (zb6q == null) ? new byte[0] : zb6q.Za().ZiD();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
    } finally {
      Zsdz.ZJ(paramZml3.Zu(), arrayOfByte);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxwx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */