package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public final class Zbs_ {
  public static Ztdv ZT(String paramString, boolean paramBoolean, Zr1j paramZr1j) {
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty()) {
            if (paramBoolean)
              try {
                Zsfr zsfr = new Zsfr(paramString, paramZr1j);
                return new Zbov(zsfr);
              } catch (Exception exception) {
                Zah.Zl(exception, Zk_.IGNORED);
              }  
            try {
              return new Zgen(paramString);
            } catch (Zs0q zs0q) {
              Zah.Zl(zs0q, Zk_.IGNORED);
              return new Zszc();
            } 
          } 
          return new Zszc();
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return new Zszc();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */