package burp;

import java.util.Set;

public interface Zkbn {
  String Zd();
  
  Set<Zmln> Zw();
  
  boolean ZU();
  
  default boolean Ze() {
    return false;
  }
  
  default boolean Zl() {
    return false;
  }
  
  default boolean ZS() {
    return Zw().contains(Zmln.APPLICATION_LOGIN);
  }
  
  Zmf_ ZR();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */