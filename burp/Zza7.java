package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zvy;

public class Zza7 {
  public static Zzlm ZE(String paramString) {
    byte[] arrayOfByte = Zkb.Zy(paramString);
    if (Zvy.ZC(arrayOfByte)) {
      arrayOfByte = Zvy.Zt(arrayOfByte);
      if (Zrpd.Zq(arrayOfByte))
        try {
          return (new Zrpd(arrayOfByte)).Zr();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
        }  
      if (Zspf.ZJ(arrayOfByte))
        try {
          return (new Zspf(arrayOfByte)).Zy();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
        }  
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    boolean bool = paramString.isEmpty() ? true : false;
    return new Zzlm(bool, null, true, false, arrayOfByte);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zza7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */