package burp;

import com.nimbusds.jose.JWSObject;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zt59 {
  public static Optional<Zxrc> ZF(String paramString) {
    try {
      if (paramString != null)
        try {
          if (paramString.startsWith("e"))
            try {
              if (paramString.length() >= 23)
                try {
                  JWSObject jWSObject = JWSObject.parse(paramString);
                  return Optional.of(new Zbjs(jWSObject));
                } catch (Exception exception) {
                  Zah.Zl(exception, Zk_.IGNORED);
                  return Optional.empty();
                }  
              return Optional.empty();
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt59.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */