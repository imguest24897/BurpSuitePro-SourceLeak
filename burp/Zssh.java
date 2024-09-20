package burp;

import java.util.Objects;

public class Zssh {
  private final Zzqm Zp;
  
  private static String Zm;
  
  public Zssh(Zzqm paramZzqm) {
    this.Zp = paramZzqm;
  }
  
  public boolean Zz(Zmzk paramZmzk, String paramString1, Zvs paramZvs, String paramString2) {
    return Zg(paramZmzk, paramString1, paramZvs, paramString2, null);
  }
  
  public synchronized boolean Zg(Zmzk paramZmzk, String paramString1, Zvs paramZvs, String paramString2, Integer paramInteger) {
    if (paramZvs.ZH())
      return true; 
    short s = Zzqm.ZG(paramZmzk, paramZvs, paramInteger);
    Objects.requireNonNull(this.Zp);
    Zz2h zz2h = this.Zp.Zu(s, this.Zp::ZC);
    if (zz2h.Zs())
      return false; 
    Zs37 zs37 = zz2h.ZP(paramString2);
    if (zs37 != null) {
      zs37.ZOv(paramString1);
      if (zs37.ZvI()) {
        zs37.ZvS();
        return true;
      } 
      return false;
    } 
    zz2h.ZP(paramString2, paramString1);
    return true;
  }
  
  public synchronized boolean ZO(Zvs paramZvs, Zmzk paramZmzk, String paramString) {
    if (paramZvs == Zzu2.EXTENSION_GENERATED || paramZvs == Zzu2.BCHECK_GENERATED)
      return true; 
    short s = Zzqm.ZG(paramZmzk, paramZvs, null);
    Zz2h zz2h = this.Zp.ZX(s);
    if (zz2h == null)
      return true; 
    Zs37 zs37 = zz2h.Za();
    return (zs37 == null || zs37.ZvI() || Zg1s.Zi(zs37.Zv2(), paramString));
  }
  
  public static void Zn(String paramString) {
    Zm = paramString;
  }
  
  public static String ZV() {
    return Zm;
  }
  
  static {
    if (ZV() == null)
      Zn("QBN7v"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zssh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */