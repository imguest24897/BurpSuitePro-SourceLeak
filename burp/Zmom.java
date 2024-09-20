package burp;

import java.util.Collections;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmom {
  private static String[] Zu;
  
  public static Zsqx<Zrdb> Zy(Zmzk paramZmzk, String paramString, byte paramByte, int paramInt, Zvow paramZvow) {
    Zu(paramByte, paramInt);
    return new Zx_5(Zzu2.CROSS_SITE_REQUEST_FORGERY, paramByte, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)1, ZR(paramByte), paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static Zsqx<Zrdb> ZF(Zmzk paramZmzk, String paramString, byte paramByte, int paramInt, Zvow paramZvow1, Zvow paramZvow2) {
    String[] arrayOfString = ZK();
    Zu(paramByte, paramInt);
    if (Zbqc.Zwu() == null)
      ZD(new String[2]); 
    return new Zx_5(Zzu2.CROSS_SITE_REQUEST_FORGERY, paramByte, paramInt, Collections.emptyMap(), Collections.singletonList(Zl2v.Zp(new Zt2w(null, paramZvow1), new Zt2w(null, paramZvow2))), (byte)1, ZR(paramByte), paramZmzk, Zkb.Zy(paramString), null);
  }
  
  private static void Zu(byte paramByte, int paramInt) {
    if (paramByte == 0 && (paramInt & 0x8) == 8)
      Zuh.ZC(false, Zqf.Zk, paramByte, paramInt); 
  }
  
  private static byte ZR(byte paramByte) {
    String[] arrayOfString = ZK();
    switch (paramByte) {
      case 1:
        b = 1;
        if (arrayOfString != null);
        return b;
      case 0:
        b = 3;
        if (arrayOfString != null)
          break; 
        return b;
    } 
    byte b = 1;
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return b;
  }
  
  public static void ZD(String[] paramArrayOfString) {
    Zu = paramArrayOfString;
  }
  
  public static String[] ZK() {
    return Zu;
  }
  
  static {
    if (ZK() != null)
      ZD(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmom.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */