package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zerz {
  static boolean Zv(Zefg<Zez3> paramZefg, Zl9l paramZl9l) {
    String str = Zxbg.ZFI();
    try {
      if (paramZefg == null)
        return false; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      byte b = 0;
      while (b < paramZefg.size()) {
        try {
          Zez3 zez3 = paramZefg.get(b);
          try {
            if (zez3 != null && zez3.ZN(paramZl9l))
              return true; 
          } catch (Exception exception) {
            throw a(null);
          } 
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
        } 
        b++;
        if (str != null)
          break; 
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.IGNORED);
    } 
    return false;
  }
  
  static boolean Zc(Zez3 paramZez31, Zez3 paramZez32) {
    try {
      if (paramZez32 == null)
        return false; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    while (true) {
      if (paramZez32.equals(paramZez31))
        return true; 
      if ((paramZez31 = paramZez31.ZkJ()) == null)
        return false; 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zerz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */