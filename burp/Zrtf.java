package burp;

import java.util.Optional;

public class Zrtf {
  private final String ZJ;
  
  private final String ZY;
  
  private Zrtf(String paramString1, String paramString2) {
    this.ZJ = paramString1;
    this.ZY = paramString2;
  }
  
  public static Zrtf Z_(String paramString) {
    return new Zrtf(paramString, null);
  }
  
  public static Zrtf ZV(String paramString1, String paramString2) {
    return new Zrtf(paramString1, paramString2);
  }
  
  public String ZD() {
    return this.ZJ;
  }
  
  public Optional<String> ZK() {
    return Optional.ofNullable(this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */