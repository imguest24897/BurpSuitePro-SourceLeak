package burp;

import java.util.ArrayList;
import java.util.Collections;
import net.portswigger.Zkb;

public class Zr1w {
  private static int[] Zv;
  
  public static Zx_5 Za(Zmzk paramZmzk, String paramString, byte paramByte, byte[] paramArrayOfbyte, Zvow paramZvow, Zxs7 paramZxs7) {
    int[] arrayOfInt = ZP();
    if (Zbqc.Zwu() == null)
      Zm(new int[1]); 
    return new Zx_5(Zzu2.XPATH_INJECTION, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.XPATH_TYPE, Byte.toString(paramByte)) }), new ArrayList<>(Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow))), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 ZP(Zmzk paramZmzk, String paramString, byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zvow paramZvow1, Zvow paramZvow2, Zxs7 paramZxs7) {
    int[] arrayOfInt = ZP();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.XPATH_INJECTION, (byte)1, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.XPATH_TYPE, Byte.toString(paramByte1)) }), new ArrayList<>(Collections.singletonList(Zl2v.Zp(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow1), new Zt2w(new Zz25(paramArrayOfbyte2, 0), paramZvow2)))), paramByte2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zm(int[] paramArrayOfint) {
    Zv = paramArrayOfint;
  }
  
  public static int[] ZP() {
    return Zv;
  }
  
  static {
    if (ZP() == null)
      Zm(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */