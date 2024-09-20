package burp;

import java.util.List;
import java.util.Map;

public class Zmd3 {
  private final String Za;
  
  private final String ZU;
  
  private final List<String> ZM;
  
  private final Map<String, List<String>> ZJ;
  
  private static int ZE;
  
  public Zmd3(String paramString1, String paramString2, List<String> paramList, Map<String, List<String>> paramMap) {
    this.Za = paramString1;
    this.ZU = paramString2;
    this.ZM = paramList;
    this.ZJ = paramMap;
  }
  
  public String Zu() {
    return this.Za;
  }
  
  public String ZL() {
    return this.ZU;
  }
  
  public List<String> Zl() {
    return this.ZM;
  }
  
  public Map<String, List<String>> ZY() {
    return this.ZJ;
  }
  
  public static void Zn(int paramInt) {
    ZE = paramInt;
  }
  
  public static int Zd() {
    return ZE;
  }
  
  public static int Zj() {
    int i = Zd();
    return (i == 0) ? 44 : 0;
  }
  
  static {
    if (Zj() != 0)
      Zn(116); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmd3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */