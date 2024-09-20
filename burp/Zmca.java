package burp;

import java.time.Duration;
import net.portswigger.Zkb;

class Zmca {
  private final String Zi;
  
  private final byte[] Za;
  
  private final Zs2i Zl;
  
  private final Zzud ZN;
  
  private final Zej6 ZT;
  
  private Zmca(Zs5f paramZs5f, String paramString, byte paramByte) {
    this.Zi = paramZs5f.Zt.Z_(5);
    String str = paramZs5f.Z_(paramString, this.Zi, Zs5f.Zi);
    this.Za = Zkb.Zy(Zv85.Zz(str, 0));
    Zlvf zlvf = paramZs5f.ZW.ZK(Zri7.ZJ(new Zrrb(this.Za, paramByte)), Zlp5.Zc().Zd(false).ZQ(Zs5f.Zi.Zh(Duration.ofMillis(paramZs5f.ZJ))));
    this.ZN = zlvf.ZM();
    this.Zl = zlvf.ZY();
    this.ZT = new Zej6(Zs5f.Zi, this.ZN);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmca.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */