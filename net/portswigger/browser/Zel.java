package net.portswigger.browser;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Zel {
  int Zt();
  
  String ZD();
  
  boolean ZC();
  
  boolean Zu();
  
  boolean ZJ();
  
  Optional<Zjn> ZW();
  
  String ZI();
  
  List<Zjn> ZH(Zt3 paramZt3);
  
  Map<String, String> ZM();
  
  Map<String, List<String>> ZF();
  
  List<Zel> ZZ(Zt3 paramZt3);
  
  List<Integer> Zb();
  
  Zh Zq();
  
  default boolean ZH() {
    return (ZC() || ZJ());
  }
  
  String Zd();
  
  Optional<Integer> Z_();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */