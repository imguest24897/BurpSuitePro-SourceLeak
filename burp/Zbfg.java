package burp;

import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbfg {
  private final Map<Byte, Zzrl> Zv;
  
  Zbfg(Zssq paramZssq, Map<Byte, Zzrl> paramMap) {
    this.Zv = paramMap;
  }
  
  public Zsov Zo(byte paramByte1, Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte2, byte paramByte3, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zkmp.ZE();
    if (!this.Zv.containsKey(Byte.valueOf(paramByte1))) {
      Zuh.Zv(false, Zqf.Zk, paramByte1);
      return null;
    } 
    if (Zbqc.Zwu() == null)
      Zkmp.Zf(new int[4]); 
    return ((Zzrl)this.Zv.get(Byte.valueOf(paramByte1))).ZJ(paramZlzh, paramZgk_, paramByte2, paramByte3, paramZkv8, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */