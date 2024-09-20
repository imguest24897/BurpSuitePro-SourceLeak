package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zk23 {
  private static int[] Zt;
  
  public static Zx_5 ZX(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    int[] arrayOfInt = ZD();
    if (Zbqc.Zwu() == null)
      Zb(new int[3]); 
    return new Zx_5(Zzu2.RUBY_CODE_INJECTION, paramByte, 0, Collections.emptyMap(), Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), paramLong1, paramLong2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zb(int[] paramArrayOfint) {
    Zt = paramArrayOfint;
  }
  
  public static int[] ZD() {
    return Zt;
  }
  
  static {
    if (ZD() != null)
      Zb(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk23.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */