package burp;

import java.util.Arrays;
import java.util.Collections;
import net.portswigger.Zkb;

public class Zzs7 {
  private static String[] Zp;
  
  public static Zx_5 Zg(Zmzk paramZmzk, String paramString, byte paramByte1, Zvow paramZvow1, Zvow paramZvow2, byte paramByte2) {
    String[] arrayOfString = ZN();
    if (Zbqc.Zwu() == null)
      Zf(new String[1]); 
    return new Zx_5(Zzu2.CLIENT_SIDE_DESYNC, paramByte1, 0, Collections.emptyMap(), Arrays.asList((Zlfv<? extends Zgkc>[])new Zlfv[] { new Zt2w(null, paramZvow1), new Zt2w(null, paramZvow2) }), paramByte2, (byte)4, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zf(String[] paramArrayOfString) {
    Zp = paramArrayOfString;
  }
  
  public static String[] ZN() {
    return Zp;
  }
  
  static {
    if (ZN() == null)
      Zf(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzs7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */