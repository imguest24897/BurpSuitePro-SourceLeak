package burp;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzz4 implements Zzwz {
  private final Zbjl ZR;
  
  private final int Zv;
  
  private final int Zr;
  
  private static String ZV;
  
  public Zzz4(Zbjl paramZbjl, int paramInt1, int paramInt2) {
    this.ZR = paramZbjl;
    this.Zv = paramInt1;
    this.Zr = paramInt2;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    Zuh.Zb((paramZlp9 == Zlp9.BCHECK_GENERATED), Zqf.Zk);
    return ZI();
  }
  
  public List<? extends Zewx> ZK() {
    Zuh.Zb(false, Zqf.ZC);
    return Collections.singletonList(ZI());
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    Zuh.Zb((paramZlp9 == Zlp9.BCHECK_GENERATED), Zqf.Zk);
    return Ze(paramZen);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return new Zt4y();
  }
  
  public Zewx ZI() {
    Zen zen = this.ZR.ZK(1, (new Ztt6(this.Zv, this.Zr, Zlp9.BCHECK_GENERATED, Zmrn.Zp)).toString());
    return Ze(zen);
  }
  
  public Zewx Ze(Zen paramZen) {
    Zzi5 zzi5 = this.ZR.ZB();
    String str2 = zzi5.Zq(paramZen);
    String str1 = ZJ();
    if (str1 == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zewx(paramZen, Zkb.Zy(str2), Zlp9.BCHECK_GENERATED, new Zmhr(zzi5.ZJ(), 443, true), (byte)0, EnumSet.allOf(Zb25.class));
  }
  
  public static void ZZ(String paramString) {
    ZV = paramString;
  }
  
  public static String ZJ() {
    return ZV;
  }
  
  static {
    if (ZJ() == null)
      ZZ("EOf8lc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */