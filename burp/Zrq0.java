package burp;

import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Ztu;
import net.portswigger.Zvy;

public class Zrq0 {
  public Zkqp Z_(String paramString, Zeko paramZeko) {
    int i = Zkqp.Zg();
    if (paramString == null || paramString.trim().isEmpty())
      return null; 
    List<Zt8e> list = (new Zlc7(paramZeko)).Zz();
    for (Zt8e zt8e : list) {
      Zkqp zkqp = zt8e.ZX(paramString);
      if (zkqp != null)
        return zkqp; 
      if (i != 0)
        break; 
    } 
    return null;
  }
  
  public byte[] Ze(byte[] paramArrayOfbyte) {
    return Zvy.ZC(paramArrayOfbyte) ? Zvy.Zt(paramArrayOfbyte) : paramArrayOfbyte;
  }
  
  public byte[] ZK(Zlou paramZlou) {
    return Ze(Zy(paramZlou));
  }
  
  private byte[] Zy(Zlou paramZlou) {
    byte[] arrayOfByte = Zkb.Zy(paramZlou.Zr);
    return paramZlou.Zx.Za() ? Ztu.ZS(arrayOfByte) : arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrq0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */