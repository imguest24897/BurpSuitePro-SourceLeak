package burp;

import java.util.concurrent.atomic.AtomicLong;
import net.portswigger.Zco;

public class Zzgk {
  private final Zco ZO;
  
  private final AtomicLong Zd;
  
  private final Zg13 Zz;
  
  private static Zbqc[] Zp;
  
  public Zzgk(Zco paramZco, AtomicLong paramAtomicLong, Zg13 paramZg13) {
    this.ZO = paramZco;
    this.Zd = paramAtomicLong;
    this.Zz = paramZg13;
  }
  
  public String ZY(int paramInt, String paramString, boolean paramBoolean) {
    Zgnu zgnu = new Zgnu(new Zljd(paramString, this.Zd), new Zzc1(this.ZO, this.Zz, Zsgv.ZM));
    return zgnu.ZC(paramInt, paramBoolean);
  }
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    Zp = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zy() {
    return Zp;
  }
  
  static {
    if (Zy() == null)
      Zg(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */