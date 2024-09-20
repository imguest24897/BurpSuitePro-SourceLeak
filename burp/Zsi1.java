package burp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Zsi1<K, V> extends LinkedHashMap<K, V> {
  private final int ZQ;
  
  private static String ZG;
  
  public Zsi1(int paramInt) {
    super(paramInt, 0.75F, true);
    this.ZQ = paramInt;
  }
  
  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry) {
    return (size() > this.ZQ);
  }
  
  public static void Zs(String paramString) {
    ZG = paramString;
  }
  
  public static String Ze() {
    return ZG;
  }
  
  static {
    if (Ze() != null)
      Zs("Zuqhz"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsi1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */