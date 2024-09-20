package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zs0a {
  final Set<String> Zx = new HashSet<>();
  
  final Map<String, String> ZN = new HashMap<>();
  
  final Map<String, List<String>> ZH = new HashMap<>();
  
  final List<String> ZL = new ArrayList<>();
  
  final List<String> Ze = new ArrayList<>();
  
  boolean Zs(String paramString) {
    return this.Zx.contains(paramString);
  }
  
  List<String> Zz(String paramString) {
    int i = Zek9.Zp();
    List<String> list = this.ZH.get(paramString);
    if (Zbqc.Zwu() == null)
      Zek9.ZF(++i); 
    return (list == null) ? Collections.<String>emptyList() : list;
  }
  
  String ZO(String paramString) {
    return this.ZN.get(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs0a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */