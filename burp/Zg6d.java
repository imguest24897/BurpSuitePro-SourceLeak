package burp;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

public class Zg6d {
  private final TrustManager[] Zc;
  
  private final KeyManager[] ZG;
  
  private final List<String> Zq;
  
  private static String Zs;
  
  public Zg6d(TrustManager[] paramArrayOfTrustManager, KeyManager[] paramArrayOfKeyManager) {
    this(paramArrayOfTrustManager, paramArrayOfKeyManager, Collections.emptyList());
  }
  
  public Zg6d(TrustManager[] paramArrayOfTrustManager, KeyManager[] paramArrayOfKeyManager, List<String> paramList) {
    this.Zc = paramArrayOfTrustManager;
    this.ZG = paramArrayOfKeyManager;
    this.Zq = paramList;
  }
  
  public TrustManager[] ZJ() {
    return this.Zc;
  }
  
  public KeyManager[] ZI() {
    return this.ZG;
  }
  
  List<String> ZH() {
    return this.Zq;
  }
  
  public static void ZB(String paramString) {
    Zs = paramString;
  }
  
  public static String Ze() {
    return Zs;
  }
  
  static {
    if (Ze() == null)
      ZB("N8d33b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */