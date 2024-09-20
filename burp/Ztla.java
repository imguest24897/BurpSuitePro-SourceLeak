package burp;

import java.util.Optional;
import net.portswigger.Zm2;

public class Ztla implements Zeb5 {
  private final Zmv7 ZI;
  
  private final Zkl6 Zp;
  
  private final Zr_4 ZO;
  
  private final Zxtr Zl;
  
  private final Zmtw Zu;
  
  private final Zbuw ZX;
  
  private final Zta2 ZA;
  
  private final Zxjt Zs;
  
  private final Zkfc Zz;
  
  public Ztla(Zmv7 paramZmv7, Zkl6 paramZkl6, Zr_4 paramZr_4, Zxjt paramZxjt) {
    this.ZI = paramZmv7;
    this.Zp = paramZkl6;
    Zbqc[] arrayOfZbqc = Zgx7.Zb();
    this.ZO = paramZr_4;
    this.Zl = paramZr_4.<Zxtr>ZH(new Zlo3());
    this.Zu = paramZr_4.<Zmtw>ZH(new Zkun());
    this.ZX = paramZr_4.<Zbuw>ZH(new Zg6n());
    this.ZA = paramZr_4.<Zta2>ZH(new Ztlr());
    this.Zz = paramZr_4.<Zkfc>ZH(new Ze7f());
    this.Zs = paramZxjt;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zeu9 Zk(Zzcs paramZzcs) {
    Zzh4 zzh4;
    Zlat zlat = paramZzcs.ZJ().Zl();
    Zz3o zz3o = zlat.ZO();
    Zbqc[] arrayOfZbqc = Zgx7.Zb();
    Zski zski = zlat.ZE().ZJ().Zb();
    if (zz3o == Zz3o.API || zz3o == Zz3o.DISCOVERED_GRAPHQL_OPERATION)
      return this.ZO.<Zeu9>ZH(new Zcg(zski, paramZzcs)); 
    Optional<Zxl6> optional = Zzr9.Zo(paramZzcs);
    if (optional.isPresent()) {
      zzh4 = Zzh4.ADD_TO_FOYER;
      if (optional.get() == Zxl6.API_DEFINITION) {
        this.ZI.Zy(Zrp6.DEBUG, Zlq7.FOUND_API_DEFINITION, new Object[] { zski.ZyJ() });
        Zm2.Zo(Zze0.SCANNER_API_DEFINITION_PARSED);
        if (arrayOfZbqc != null) {
          if (optional.get() == Zxl6.GRAPHQL_INTROSPECTION)
            zzh4 = Zzh4.ADD_TO_PREVIOUS_ROOM; 
          return this.ZO.<Zeu9>ZH(new Zm89(zski, paramZzcs, this.Zp, zzh4));
        } 
        return this.ZO.<Zeu9>ZH(new Zm89(zski, paramZzcs, this.Zp, zzh4));
      } 
    } else {
      if (Zbqc.Zwu() == null)
        Zgx7.ZX(new Zbqc[4]); 
      return this.ZO.<Zeu9>ZH(new Zl73(zski, paramZzcs));
    } 
    if (optional.get() == Zxl6.GRAPHQL_INTROSPECTION)
      zzh4 = Zzh4.ADD_TO_PREVIOUS_ROOM; 
    return this.ZO.<Zeu9>ZH(new Zm89(zski, paramZzcs, this.Zp, zzh4));
  }
  
  public Zgd4 Zm() {
    return this.Zl;
  }
  
  public Zgd4 ZZ() {
    return this.Zu;
  }
  
  public Zgd4 ZA() {
    return this.ZX;
  }
  
  public Zgd4 Zx() {
    return this.ZA;
  }
  
  public Zgd4 Zo() {
    return this.Zz;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztla.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */