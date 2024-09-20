package burp;

import java.util.HashMap;
import java.util.Map;

public class Zr90 implements Zs63 {
  private final Map<String, Integer> ZF = new HashMap<>();
  
  public String ZU(String paramString) {
    int i = ((Integer)this.ZF.merge(paramString, Integer.valueOf(1), Integer::sum)).intValue();
    return (i > 1) ? (paramString + "_" + paramString) : paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr90.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */