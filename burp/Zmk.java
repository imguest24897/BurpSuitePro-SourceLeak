package burp;

import java.util.function.Supplier;
import net.portswigger.Zsy;

public class Zmk implements Supplier<Zt8g> {
  private final Zsy ZU;
  
  private static Zbqc[] Zt;
  
  public Zmk(Zsy paramZsy) {
    this.ZU = paramZsy;
  }
  
  public Zt8g Zq() {
    String str = this.ZU.Zi().ZG().ZK(10);
    return new Zck(Zrdu.URL_PARAM, str, "1");
  }
  
  public static void Zq(Zbqc[] paramArrayOfZbqc) {
    Zt = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZK() {
    return Zt;
  }
  
  static {
    if (ZK() != null)
      Zq(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */