package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zkb;

class Zrs7 implements Zmrh {
  private final Zxwh ZC;
  
  Zrs7(Zxwh paramZxwh) {
    this.ZC = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zbyz(this.ZC);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    Matcher matcher = Pattern.compile(this.ZC.ZWp()).matcher(Zkb.ZG(paramArrayOfbyte1));
    return matcher.find() ? Zm41.ZI : paramArrayOfbyte1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrs7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */