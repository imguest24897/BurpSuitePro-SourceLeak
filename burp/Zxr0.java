package burp;

import java.util.Collections;
import java.util.List;

public class Zxr0 {
  private static int[] Zx;
  
  public static Zsqx<Zrdb> Z_(Zzu2 paramZzu2, Zmzk paramZmzk, byte[] paramArrayOfbyte, Zvow paramZvow) {
    int[] arrayOfInt = ZE();
    List<Zt2w> list = List.of(new Zt2w(null, paramZvow));
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(paramZzu2, (byte)0, 0, Collections.emptyMap(), (List)list, (byte)3, (byte)1, paramZmzk, paramArrayOfbyte, null);
  }
  
  public static void Zb(int[] paramArrayOfint) {
    Zx = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return Zx;
  }
  
  static {
    if (ZE() != null)
      Zb(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxr0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */