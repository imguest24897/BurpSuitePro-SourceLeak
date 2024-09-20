package burp;

import java.util.List;

public class Zrak {
  private final String ZG;
  
  private final String Zx;
  
  private final String Zb;
  
  private final String ZQ;
  
  private final List<String> ZW;
  
  private static int Zo;
  
  Zrak(String paramString1, String paramString2, String paramString3, String paramString4, List<String> paramList) {
    this.ZG = paramString1;
    this.Zx = paramString2;
    this.Zb = paramString3;
    this.ZQ = paramString4;
    this.ZW = paramList;
  }
  
  public String Zy() {
    return this.ZG;
  }
  
  public String Zi() {
    return this.Zx;
  }
  
  public String ZR() {
    return this.Zb;
  }
  
  public String ZQ() {
    return this.ZQ;
  }
  
  public List<String> ZH() {
    return this.ZW;
  }
  
  public static void Zz(int paramInt) {
    Zo = paramInt;
  }
  
  public static int Zp() {
    return Zo;
  }
  
  public static int ZW() {
    int i = Zp();
    return (i == 0) ? 79 : 0;
  }
  
  static {
    if (ZW() != 0)
      Zz(88); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrak.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */