package burp;

import burp.api.montoya.utilities.HtmlEncoding;
import burp.api.montoya.utilities.HtmlUtils;
import net.portswigger.Zzc;

public class Zgm6 implements HtmlUtils {
  public String encode(String paramString) {
    return encode(paramString, HtmlEncoding.STANDARD);
  }
  
  public String encode(String paramString, HtmlEncoding paramHtmlEncoding) {
    try {
      switch (Ztvm.ZO[paramHtmlEncoding.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Zzc.Zo(paramString);
  }
  
  public String decode(String paramString) {
    return Zzc.ZB(paramString);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgm6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */