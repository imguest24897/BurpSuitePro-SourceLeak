package burp;

import net.portswigger.Zv4;

public class Zmxx implements Ztr2 {
  public byte[] ZD(byte[] paramArrayOfbyte) {
    return Zx(paramArrayOfbyte, new int[] { 0, paramArrayOfbyte.length });
  }
  
  public byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    byte[] arrayOfByte = Zv4.Zw(paramArrayOfbyte);
    paramArrayOfint[0] = 0;
    paramArrayOfint[1] = arrayOfByte.length;
    return arrayOfByte;
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    return Zv4.ZK(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmxx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */