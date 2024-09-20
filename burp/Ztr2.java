package burp;

import net.portswigger.Zkb;

public interface Ztr2 {
  byte[] ZD(byte[] paramArrayOfbyte);
  
  byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint);
  
  byte[] Zp(byte[] paramArrayOfbyte);
  
  default String Zy(String paramString) {
    return Zkb.ZG(ZD(Zkb.Zy(paramString)));
  }
  
  default String ZK(String paramString) {
    return Zkb.ZG(Zp(Zkb.Zy(paramString)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztr2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */