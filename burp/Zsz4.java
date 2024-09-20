package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsz4 {
  private final Zr_4 Zu;
  
  private final Zrny Zl;
  
  private static boolean Zd;
  
  public Zsz4(Zr_4 paramZr_4, Zrny paramZrny) {
    this.Zu = paramZr_4;
    this.Zl = paramZrny;
  }
  
  public Optional<Zrdb> Za(Zrdb paramZrdb, Zs37 paramZs37) {
    Optional<Zrdb> optional = paramZs37.ZvY();
    if (optional.isEmpty()) {
      paramZs37.ZW(paramZrdb);
      return ZZ(paramZrdb, paramZs37.Zv2());
    } 
    Zrdb zrdb = optional.get();
    if (Zj(zrdb, paramZrdb.ZaT().ZK())) {
      ZJ(zrdb, paramZrdb);
      this.Zl.Zq(Collections.singleton(zrdb));
    } 
    return Optional.empty();
  }
  
  private Optional<Zrdb> ZZ(Zrdb paramZrdb, String paramString) {
    paramZrdb.ZaT().Zi(this.Zu, Zlt9.MERGE_MULTIPLE_IDENTIFIERS);
    if (!Zli.ZQ(paramZrdb.Zax(), Zkb.Zy(paramString))) {
      paramZrdb.ZE0(paramString);
      paramZrdb.ZEs(paramString);
    } 
    ZH(paramZrdb);
    return Optional.of(paramZrdb);
  }
  
  private void ZH(Zrdb paramZrdb) {
    Zefg<Zsdr> zefg = paramZrdb.Za7().Zt().ZCr();
    zefg.clear();
    zefg.add(this.Zu.Zz(paramZrdb.ZaT().ZK()));
  }
  
  private void ZJ(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    Zn(paramZrdb1, paramZrdb2);
    paramZrdb1.Za7().Zt().ZCr().add(this.Zu.Zz(paramZrdb2.ZaT().ZK()));
  }
  
  private static boolean Zj(Zrdb paramZrdb, String paramString) {
    boolean bool = Zu();
    for (Zsdr zsdr : paramZrdb.Za7().Zt().ZCr()) {
      if (zsdr.toString().equals(paramString))
        return false; 
      if (!bool)
        break; 
    } 
    return true;
  }
  
  private void Zn(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    boolean bool = Zu();
    List<Zzi8> list = paramZrdb1.Za7().Zy();
    Zuh.Zb((paramZrdb2.Za7().Zy().size() == 1), Zqf.Zr);
    Zzi8 zzi8 = paramZrdb2.Za7().Zy().get(0);
    for (Zzi8 zzi81 : list) {
      if (Z_(zzi81, zzi8)) {
        Objects.requireNonNull(zzi81.ZaC());
        zzi8.ZaC().stream().filter(zzi81::lambda$mergeRequestResponses$0).forEach(zzi81.ZaC()::add);
        Objects.requireNonNull(zzi81.Zae());
        zzi8.Zae().stream().filter(zzi81::lambda$mergeRequestResponses$1).forEach(zzi81.Zae()::add);
        return;
      } 
      if (!bool)
        break; 
    } 
    boolean bool1 = (list.size() < paramZrdb2.Za6().Zb().ZA()) ? true : false;
    if (bool1)
      paramZrdb1.Za7().Zp(paramZrdb2.Za7()); 
  }
  
  private boolean Z_(Zzi8 paramZzi81, Zzi8 paramZzi82) {
    return paramZzi81.ZF(paramZzi82) ? true : ((paramZzi82 == null || paramZzi81.getClass() != paramZzi82.getClass()) ? false : ((paramZzi81.Zl7() != paramZzi82.Zl7()) ? false : ((paramZzi81.Zlq() != paramZzi82.Zlq()) ? false : ((paramZzi81.ZoB() != paramZzi82.ZoB()) ? false : ((paramZzi81.ZaY() != paramZzi82.ZaY()) ? false : (!paramZzi81.Zod().equals(paramZzi82.Zod()) ? false : (!paramZzi81.Zos().equals(paramZzi82.Zos()) ? false : (((paramZzi81.ZoO() != null) ? !paramZzi81.ZoO().equals(paramZzi82.ZoO()) : (paramZzi82.ZoO() != null)) ? false : (!((paramZzi81.ZlL() != null) ? !paramZzi81.ZlL().equals(paramZzi82.ZlL()) : (paramZzi82.ZlL() != null)))))))))));
  }
  
  private static boolean lambda$mergeRequestResponses$1(Zzi8 paramZzi8, Zrrc paramZrrc) {
    return !paramZzi8.Zae().contains(paramZrrc);
  }
  
  private static boolean lambda$mergeRequestResponses$0(Zzi8 paramZzi8, Zrrc paramZrrc) {
    return !paramZzi8.ZaC().contains(paramZrrc);
  }
  
  public static void Zz(boolean paramBoolean) {
    Zd = paramBoolean;
  }
  
  public static boolean Zu() {
    return Zd;
  }
  
  public static boolean Za() {
    boolean bool = Zu();
    return !bool;
  }
  
  static {
    if (Za())
      Zz(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */