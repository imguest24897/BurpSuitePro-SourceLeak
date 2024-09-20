package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zgzb {
  private static int[] Zk;
  
  public static Zsqx<Zrdb> Zm(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    int[] arrayOfInt = ZS();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zx_5(Zzu2.SQL_STATEMENT_IN_REQUEST_PARAMETER, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)1, (byte)3, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZX(int[] paramArrayOfint) {
    Zk = paramArrayOfint;
  }
  
  public static int[] ZS() {
    return Zk;
  }
  
  static {
    if (ZS() == null)
      ZX(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */