package burp;

import net.portswigger.Zkb;

@FunctionalInterface
public interface Zde {
  byte[] ZV();
  
  static Zde Zv(String paramString) {
    return paramString::lambda$customMethod$0;
  }
  
  private static byte[] lambda$customMethod$0(String paramString) {
    return Zkb.Zy(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zde.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */