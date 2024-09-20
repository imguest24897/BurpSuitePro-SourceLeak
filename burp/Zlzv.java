package burp;

import net.portswigger.Zkb;

public class Zlzv implements Zzrl {
  private final byte ZP;
  
  private Zs77 Ze;
  
  public Zlzv(byte paramByte) {
    String str1 = "";
    this.ZP = paramByte;
    String str2 = Zkb.ZG(new byte[] { this.ZP });
    if (this.ZP == 32) {
      str2 = "";
      str1 = " ";
    } 
    this.Ze = new Zs77(str2, str2, str1, str2, false);
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    return (this.ZP == -1) ? null : this.Ze.ZJ(paramZlzh, paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */