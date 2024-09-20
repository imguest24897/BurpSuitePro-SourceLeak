package burp;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Optional;

public interface Zsug {
  boolean Zt();
  
  Optional<OutputStream> Z_() throws IOException;
  
  String toString();
  
  static Zsug ZI() {
    return new Zziv();
  }
  
  static Zsug ZL() {
    return new Zt52();
  }
  
  static Zsug ZK(File paramFile) {
    return new Zg63(paramFile, false);
  }
  
  static Zsug Zm(File paramFile) {
    return new Zg63(paramFile, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsug.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */