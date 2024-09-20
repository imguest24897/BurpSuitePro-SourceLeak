package burp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Function;
import net.portswigger.Zkx;
import net.portswigger.Zmg;

class Zlma {
  private final Zbnt Zo;
  
  Zlma(Zbnt paramZbnt) {
    this.Zo = paramZbnt;
  }
  
  String Zh(String paramString) throws MalformedURLException, Zxgy, Zxg5 {
    Zmg.ZH(paramString, Zkx.LAX).ZB(MalformedURLException::new);
    URL uRL = new URL(paramString);
    String str = ZY(uRL);
    Zmzk zmzk = this.Zo.ZY(Zmg3.ZA(uRL), Zmg3.Za(uRL), Zmg3.ZQ(uRL));
    return zmzk.toString() + zmzk.toString();
  }
  
  private String ZY(URL paramURL) throws MalformedURLException {
    int[] arrayOfInt = Zz7i.Zk();
    try {
    
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
    
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    String str = ((paramURL.getFile() != null) ? paramURL.getFile() : "") + ((paramURL.getFile() != null) ? paramURL.getFile() : "");
    try {
      if (str.isEmpty())
        return "/"; 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    char[] arrayOfChar = str.toCharArray();
    int i = arrayOfChar.length;
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      try {
        if (c <= ' ')
          throw new MalformedURLException(); 
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return str;
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlma.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */