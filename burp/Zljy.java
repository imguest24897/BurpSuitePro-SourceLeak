package burp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zljy {
  private static String ZI;
  
  static Zkh2 ZK(String paramString1, String paramString2, boolean paramBoolean) {
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      Pattern pattern = Pattern.compile(paramString1, 0x20 | (paramBoolean ? 0 : 2));
      Matcher matcher = pattern.matcher(paramString2);
      long l = matcher.results().limit(255L).count();
      return Zkh2.Zj(Math.toIntExact(l));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return Zkh2.ZO;
    } 
  }
  
  static String Zq(String paramString) {
    return paramString;
  }
  
  static byte[] ZY(String paramString) {
    return Zkb.Zy(paramString);
  }
  
  static void ZF(String paramString, Zs4f paramZs4f) throws IOException {
    paramZs4f.ZL("g", paramString);
  }
  
  public static void Z_(String paramString) {
    ZI = paramString;
  }
  
  public static String ZA() {
    return ZI;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZA() == null)
      Z_("DMj1xb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */