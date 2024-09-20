package burp;

import net.portswigger.Zk_;
import net.portswigger.Zsp;
import net.portswigger.Zuz;

public class Zkj_ implements Zsp {
  public Zuz Za(Zuz paramZuz) {
    if (paramZuz.ZA().Zj() > Zk_.COMMON_RUNTIME_FAILURE.Zj()) {
      Throwable throwable = paramZuz.Zc();
      try {
        if (!(throwable instanceof Zkfn)) {
          try {
            if (!(throwable instanceof java.net.UnknownHostException)) {
              try {
                if (Zepz.Zm(throwable))
                  return paramZuz.Zr(Zk_.COMMON_RUNTIME_FAILURE); 
              } catch (Zkfn zkfn) {
                throw a(null);
              } 
            } else {
              return paramZuz.Zr(Zk_.COMMON_RUNTIME_FAILURE);
            } 
          } catch (Zkfn zkfn) {
            throw a(null);
          } 
        } else {
          return paramZuz.Zr(Zk_.COMMON_RUNTIME_FAILURE);
        } 
      } catch (Zkfn zkfn) {
        throw a(null);
      } 
    } 
    return paramZuz;
  }
  
  private static Zkfn a(Zkfn paramZkfn) {
    return paramZkfn;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */