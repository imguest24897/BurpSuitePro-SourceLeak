package burp;

import java.util.Set;
import java.util.zip.CRC32;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlae {
  private final Set<Integer> Zw;
  
  public Zlae(Zrpj paramZrpj) {
    this.Zw = paramZrpj;
  }
  
  public synchronized boolean Zx(Zz1p paramZz1p) {
    if (this.Zw == null) {
      Zuh.Zb(false, Zqf.Zr);
      return false;
    } 
    int i = Zz(paramZz1p);
    boolean bool = this.Zw.contains(Integer.valueOf(i));
    this.Zw.add(Integer.valueOf(i));
    return bool;
  }
  
  private int Zz(Zz1p paramZz1p) {
    CRC32 cRC32 = new CRC32();
    cRC32.update(Zkb.Zy(paramZz1p.Zo.Zdq()));
    cRC32.update(167);
    cRC32.update(Zkb.Zy(paramZz1p.Zo.Zd1()));
    cRC32.update(167);
    cRC32.update(Zkb.Zy(Integer.toString(paramZz1p.Zo.Zda())));
    cRC32.update(167);
    cRC32.update(paramZz1p.Zo.Zd4());
    cRC32.update(167);
    paramZz1p.ZV.forEach(cRC32::lambda$getUrlHash$0);
    return (int)cRC32.getValue();
  }
  
  private static void lambda$getUrlHash$0(CRC32 paramCRC32, Zt8g paramZt8g) {
    paramCRC32.update(Zkb.Zy(paramZt8g.Zns() + "$"));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */