package burp;

import java.util.Objects;
import net.portswigger.Zkb;

public final class Zm55 {
  private final Zgnc ZO;
  
  private Zm55(Zgnc paramZgnc) {
    this.ZO = paramZgnc;
  }
  
  public static Zm55 ZK(Zlit paramZlit, Zde paramZde, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    Zstu zstu = paramZkl6.Zs().ZO().Zf(paramZlit).Zj(paramZde).Zr();
    Zski zski = paramZr_4.<Zski>ZH(new Zbx6(paramZlit, null));
    String[] arrayOfString = Zr4x.Zf();
    Zgnc zgnc = paramZr_4.<Zgnc>ZH(new Zt8y(zstu, null, zski, Zkb.ZG(paramZde.ZV()), 0L));
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zm55(zgnc);
  }
  
  boolean Zs(Zgnc paramZgnc) {
    return (this.ZO.ZzX().ZyR().equals(paramZgnc.ZzX().ZyR()) && this.ZO.Zzj().equals(paramZgnc.Zzj()));
  }
  
  Zlit Zy() {
    return this.ZO.ZzX().ZyR().Zdt();
  }
  
  String Zp() {
    return this.ZO.Zzj();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null || paramObject.getClass() != getClass())
      return false; 
    Zm55 zm55 = (Zm55)paramObject;
    return (Objects.equals(this.ZO.ZzX(), zm55.ZO.ZzX()) && Objects.equals(this.ZO.Zzj(), zm55.ZO.Zzj()));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZO.ZzX(), this.ZO.Zzj() });
  }
  
  public Zefx ZQ(Zey9 paramZey9) {
    Zmzk zmzk = this.ZO.ZzX().ZyR().Zdz();
    Zstu zstu = this.ZO.Zzk();
    return (new Zrtz(null, this.ZO.Zzj())).Zv(paramZey9.Zu(zmzk, zstu));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm55.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */