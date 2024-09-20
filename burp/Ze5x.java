package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Ze5x {
  private static boolean ZN;
  
  public static Zx_5 ZI(Zmzk paramZmzk, String paramString, byte paramByte1, Zvow paramZvow1, Zvow paramZvow2, Zxs7 paramZxs7, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    boolean bool = Zj();
    if (Zbqc.Zwu() == null)
      Zq(!bool); 
    return new Zx_5(Zzu2.LDAP_INJECTION, paramByte1, 0, Collections.emptyMap(), Collections.singletonList(Zl2v.Zp(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow1), new Zt2w(new Zz25(paramArrayOfbyte2, 0), paramZvow2))), paramByte2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zq(boolean paramBoolean) {
    ZN = paramBoolean;
  }
  
  public static boolean Zj() {
    return ZN;
  }
  
  public static boolean ZD() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (ZD())
      Zq(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */