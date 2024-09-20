package burp;

import java.util.Collections;
import java.util.Optional;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zzq2 {
  private final Zr_4 ZM;
  
  private final Zrny Zz;
  
  public Zzq2(Zr_4 paramZr_4, Zrny paramZrny) {
    this.ZM = paramZr_4;
    this.Zz = paramZrny;
  }
  
  public Optional<Zrdb> Zq(Zrdb paramZrdb, Zs37 paramZs37) {
    boolean bool = Zsz4.Zu();
    Optional<Zrdb> optional = paramZs37.ZvY();
    if (optional.isEmpty()) {
      paramZs37.ZW(paramZrdb);
      return Zf(paramZrdb, paramZs37.Zv2());
    } 
    Zrdb zrdb = optional.get();
    if (ZR(zrdb)) {
      zrdb.Za7().Zp(paramZrdb.Za7());
      this.Zz.Zq(Collections.singleton(zrdb));
    } 
    if (Zbqc.Zwu() == null)
      Zsz4.Zz(!bool); 
    return Optional.empty();
  }
  
  private Optional<Zrdb> Zf(Zrdb paramZrdb, String paramString) {
    paramZrdb.ZaT().Zi(this.ZM, Zlt9.MERGE_SINGLE_IDENTIFIER);
    if (!Zli.ZQ(paramZrdb.Zax(), Zkb.Zy(paramString))) {
      paramZrdb.ZE0(paramString);
      paramZrdb.ZEs(paramString);
    } 
    return Optional.of(paramZrdb);
  }
  
  private static boolean ZR(Zrdb paramZrdb) {
    return (paramZrdb.Za7().Zy().size() < paramZrdb.Za6().Zb().ZA());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzq2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */