package burp;

import java.util.function.Function;
import java.util.zip.CRC32;
import net.portswigger.Zkb;

public class Zzqm {
  private final Ze93<Zrte<Zs37>> Zv;
  
  private final Zr_4 ZC;
  
  private Zzqm(Ze93<Zrte<Zs37>> paramZe93, Zr_4 paramZr_4) {
    this.Zv = paramZe93;
    this.ZC = paramZr_4;
  }
  
  public static Zzqm ZH(Zz1i paramZz1i, Zr_4 paramZr_4) {
    return new Zzqm(paramZz1i.ZH8(), paramZr_4);
  }
  
  public Zz2h ZX(short paramShort) {
    return Zu(paramShort, Zzqm::lambda$get$0);
  }
  
  public Zz2h Zu(short paramShort, Function<Short, Zz2h> paramFunction) {
    Zrte<Zs37> zrte = this.Zv.Zz(paramShort);
    return (zrte != null) ? new Zz2h(zrte, this.ZC) : paramFunction.apply(Short.valueOf(paramShort));
  }
  
  public Zz2h ZC(Short paramShort) {
    Zrte<Zs37> zrte = this.ZC.<Zrte>Zv((Zllg)new Zguz<>(Zs37.Zr), 20);
    this.Zv.Zl(paramShort.shortValue(), zrte);
    String[] arrayOfString = Zlt9.ZV();
    if (Zbqc.Zwu() == null)
      Zlt9.Zu(new String[4]); 
    return new Zz2h(zrte, this.ZC);
  }
  
  public static short ZG(Zrdb paramZrdb) {
    return ZG(paramZrdb.ZaB(), paramZrdb.Za6(), Zy(paramZrdb));
  }
  
  public static short ZG(Zmzk paramZmzk, Zvs paramZvs, Integer paramInteger) {
    CRC32 cRC32 = new CRC32();
    cRC32.update(Zkb.Zy(paramZmzk.toString()));
    cRC32.update(167);
    String[] arrayOfString = Zlt9.ZV();
    cRC32.update(Zkb.Zy(String.valueOf(paramZvs.ZS())));
    if (paramInteger != null) {
      cRC32.update(167);
      cRC32.update(paramInteger.intValue());
    } 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[4]); 
    return (short)(int)cRC32.getValue();
  }
  
  private static Integer Zy(Zrdb paramZrdb) {
    return paramZrdb.Za6().Zb().Zv() ? Integer.valueOf(paramZrdb.Za8()) : (paramZrdb.Za6().Zb().ZG() ? Integer.valueOf(paramZrdb.Zam()) : null);
  }
  
  private static Zz2h lambda$get$0(Short paramShort) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */