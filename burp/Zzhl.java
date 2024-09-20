package burp;

import java.util.Arrays;
import net.portswigger.Zmw;

class Zzhl implements Zrst {
  private final Zxpw ZM;
  
  Zzhl(Zxpw paramZxpw) {
    this.ZM = paramZxpw;
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    return Zmw.Zq(new byte[][] { this.ZM.Zt(), arrayOfByte });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzhl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */