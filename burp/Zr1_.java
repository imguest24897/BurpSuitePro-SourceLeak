package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.intruder.GeneratedPayload;

public class Zr1_ implements GeneratedPayload {
  private final ByteArray Zi;
  
  public Zr1_(ByteArray paramByteArray) {
    this.Zi = paramByteArray;
  }
  
  public ByteArray value() {
    return this.Zi;
  }
  
  static GeneratedPayload Zt(String paramString) {
    return new Zr1_(Zsyg.Zh(paramString));
  }
  
  static GeneratedPayload ZJ(ByteArray paramByteArray) {
    return new Zr1_(paramByteArray);
  }
  
  static GeneratedPayload ZE() {
    return new Zr1_(null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */