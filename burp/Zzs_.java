package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.portswigger.Zkb;

public class Zzs_ {
  private final Map<Zsoe, Ze5n> Zi = new HashMap<>();
  
  public boolean Zs(Zzcs paramZzcs) {
    Zlat zlat = paramZzcs.ZJ().Zl();
    Optional<Zt70> optional = zlat.ZE().ZO();
    if (optional.isEmpty())
      return false; 
    if (((Zt70)optional.get()).ZC().Ze() == 404)
      return true; 
    Ze5n ze5n = this.Zi.get(Zsoe.ZJ(((Zt70)optional.get()).Zr()));
    return (ze5n == null) ? false : paramZzcs.ZJ().Zl().ZQ().Zp(ze5n);
  }
  
  public boolean ZF(Zlit paramZlit) {
    return this.Zi.containsKey(Zsoe.ZJ(paramZlit));
  }
  
  public void ZY(Zlit paramZlit, Zm0f paramZm0f) {
    this.Zi.put(Zsoe.ZJ(paramZlit), paramZm0f.Zl().ZQ());
  }
  
  public static String Zb(Zlit paramZlit) {
    String str1 = "";
    String str2 = Zkb.ZG(paramZlit.Zd4());
    int i = str2.indexOf(".", str2.lastIndexOf('/'));
    if (i >= 0)
      str1 = str2.substring(i); 
    return str1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzs_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */