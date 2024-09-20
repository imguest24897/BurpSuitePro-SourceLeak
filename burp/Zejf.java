package burp;

import java.util.List;
import java.util.stream.Stream;

public interface Zejf {
  List<Zkv5> Zq();
  
  List<Zkv5> Zi();
  
  void Zi(Zc paramZc);
  
  default List<Zkv5> Zd() {
    return Stream.<Zkv5>concat(Zi().stream(), Zq().stream()).toList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */