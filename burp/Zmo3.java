package burp;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public interface Zmo3 {
  int ZA();
  
  String Zm();
  
  String Zy();
  
  String ZQ();
  
  Path Ze();
  
  String Zs();
  
  List<Exception> Zt();
  
  Optional<Zsvm> Zq();
  
  default boolean Zb() {
    return Zq().isPresent();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmo3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */