package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zk5g {
  private static Zbqc[] ZK;
  
  public static Zsqx<Zrdb> ZA(Zmzk paramZmzk, String paramString1, Zvow paramZvow, Zxs7 paramZxs7, String paramString2) {
    Zbqc[] arrayOfZbqc = Zf();
    if (Zbqc.Zwu() == null)
      Zq(new Zbqc[5]); 
    return new Zx_5(Zzu2.XML_ENTITY_EXPANSION, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(new Zz25(Zkb.Zy(paramString2), 0), paramZvow)), (byte)2, (byte)3, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void Zq(Zbqc[] paramArrayOfZbqc) {
    ZK = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zf() {
    return ZK;
  }
  
  static {
    if (Zf() != null)
      Zq(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */