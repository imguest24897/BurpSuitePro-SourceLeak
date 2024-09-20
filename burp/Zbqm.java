package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public abstract class Zbqm extends Zbqi {
  private final Map<String, Object> ZU = new HashMap<>();
  
  protected Zbqm() {
    ZJ();
  }
  
  protected Zmhz Zp(String paramString) {
    Ztjv ztjv = (Ztjv)this.ZU.get(paramString);
    if (ztjv != null)
      try {
        return ztjv.Zq();
      } catch (RuntimeException runtimeException) {
        Zah.Zl(runtimeException, Zk_.RETHROWN);
        throw runtimeException;
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
    return null;
  }
  
  protected abstract void ZJ();
  
  public void Zd(String paramString1, String paramString2) {
    ZF(paramString1, paramString2, null);
  }
  
  public void ZF(String paramString1, String paramString2, ClassLoader paramClassLoader) {
    this.ZU.put(paramString1, new Ztjv(paramString2, paramClassLoader));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */