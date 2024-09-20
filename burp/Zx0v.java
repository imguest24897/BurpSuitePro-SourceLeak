package burp;

import net.portswigger.Zvy;

public class Zx0v implements Ztr2 {
  public byte[] ZD(byte[] paramArrayOfbyte) {
    return Zx(paramArrayOfbyte, new int[] { 0, paramArrayOfbyte.length });
  }
  
  public byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    byte[] arrayOfByte = Zvy.ZZ(paramArrayOfbyte);
    paramArrayOfint[0] = 0;
    paramArrayOfint[1] = arrayOfByte.length;
    return arrayOfByte;
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    return Zvy.Zt(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */