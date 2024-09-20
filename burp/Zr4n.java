package burp;

import java.io.IOException;
import net.portswigger.Zkb;

public class Zr4n {
  private static Zbqc[] ZZ;
  
  static String Zf(byte[] paramArrayOfbyte) {
    return Zkb.ZG(paramArrayOfbyte);
  }
  
  static byte[] ZU(byte[] paramArrayOfbyte) {
    return paramArrayOfbyte;
  }
  
  static void ZI(byte[] paramArrayOfbyte, Zs4f paramZs4f) throws IOException {
    paramZs4f.ZY("g", paramArrayOfbyte);
  }
  
  public static void Zf(Zbqc[] paramArrayOfZbqc) {
    ZZ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zg() {
    return ZZ;
  }
  
  static {
    if (Zg() == null)
      Zf(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */