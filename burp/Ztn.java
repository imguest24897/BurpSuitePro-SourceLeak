package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zkb;

class Ztn implements Zmrh {
  protected final Zxwh Zh;
  
  Ztn(Zxwh paramZxwh) {
    this.Zh = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zby8(this.Zh);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    String str1 = Zkb.ZG(paramArrayOfbyte1);
    String str2 = Zz();
    Matcher matcher = Pattern.compile(str2).matcher(str1);
    if (!matcher.find())
      return paramArrayOfbyte1; 
    String str3 = ZP(paramArrayOfbyte3);
    if (str3 == null)
      return paramArrayOfbyte1; 
    String str4 = matcher.replaceAll(str3);
    return Zkb.Zy(str4);
  }
  
  protected String Zz() {
    return this.Zh.ZWp();
  }
  
  protected String ZP(byte[] paramArrayOfbyte) {
    return this.Zh.ZWP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */