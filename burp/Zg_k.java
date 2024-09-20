package burp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.ImageIcon;

public class Zg_k {
  private static final Map<Zbpk, Zsps> ZC = new ConcurrentHashMap<>();
  
  public static ImageIcon Zk(Zbpk paramZbpk, byte paramByte1, byte paramByte2, boolean paramBoolean) {
    Zsps zsps = ZC.computeIfAbsent(paramZbpk, Zkb1::ZB);
    return paramBoolean ? zsps.Zu(paramByte1, paramByte2) : zsps.Ze();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */