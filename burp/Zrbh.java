package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zrbh {
  private static int[] ZT;
  
  public static Zsqx<Zrdb> Zg(Zmzk paramZmzk, String paramString, byte paramByte1, Zvow paramZvow1, Zvow paramZvow2, byte paramByte2) {
    int[] arrayOfInt = ZV();
    if (Zbqc.Zwu() == null)
      ZI(new int[2]); 
    return new Zx_5(Zzu2.SPOOFABLE_CLIENT_IP, paramByte1, 0, Collections.emptyMap(), Collections.singletonList(Zl2v.Zp(new Zt2w(null, paramZvow1), new Zt2w(null, paramZvow2))), paramByte2, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static Zx_5 ZU(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, List<Zsjh<?>> paramList, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    boolean bool = (paramByte == 3) ? true : true;
    return new Zx_5(Zzu2.SPOOFABLE_CLIENT_IP, paramByte, 0, Collections.emptyMap(), Zbxq.ZS(paramArrayOfbyte, paramZvow, paramList), bool, (byte)1, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZI(int[] paramArrayOfint) {
    ZT = paramArrayOfint;
  }
  
  public static int[] ZV() {
    return ZT;
  }
  
  static {
    if (ZV() != null)
      ZI(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */