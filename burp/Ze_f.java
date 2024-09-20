package burp;

import java.util.ServiceLoader;
import net.portswigger.browser.Zm;
import net.portswigger.browser.service.Zg;

public class Ze_f {
  private static final Zg ZN = ServiceLoader.<Zg>load(Zg.class).stream().filter(Ze_f::lambda$static$0).map(ServiceLoader.Provider::get).findAny().orElseThrow();
  
  private static Zbqc[] ZB;
  
  public static Zg Z_() {
    return ZN;
  }
  
  private static boolean lambda$static$0(ServiceLoader.Provider paramProvider) {
    return paramProvider.type().isAnnotationPresent((Class)Zm.class);
  }
  
  public static void ZX(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZP() {
    return ZB;
  }
  
  static {
    if (ZP() == null)
      ZX(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */