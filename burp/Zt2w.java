package burp;

import java.util.Map;
import net.portswigger.Zkb;

public class Zt2w implements Zei8<Zkcp> {
  private final Zll7 ZH;
  
  private final Zxcg<?> Zr;
  
  private final Zzi8 Zo;
  
  private final Zvow ZI;
  
  private static int ZQ;
  
  public Zt2w(Zll7 paramZll7, Zzi8 paramZzi8) {
    this.ZH = paramZll7;
    this.Zr = null;
    this.Zo = paramZzi8;
    this.ZI = null;
  }
  
  public Zt2w(Zxcg<?> paramZxcg, Zvow paramZvow) {
    this.ZH = null;
    this.Zr = paramZxcg;
    this.Zo = null;
    this.ZI = paramZvow;
  }
  
  public Zsqx<Zkcp> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zrxx(this, paramMap);
  }
  
  public byte[] Zp(String paramString) {
    return Zkb.Zy(paramString);
  }
  
  public static void ZY(int paramInt) {
    ZQ = paramInt;
  }
  
  public static int ZW() {
    return ZQ;
  }
  
  public static int ZZ() {
    int i = ZW();
    return (i == 0) ? 114 : 0;
  }
  
  static {
    if (ZZ() != 0)
      ZY(75); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */