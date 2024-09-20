package burp;

import java.util.Collection;
import java.util.Optional;

public class Zed9 {
  private final Zrim Zw;
  
  private final Zeb5 ZT;
  
  private final Zmv7 Zt;
  
  private final Ze73 Zo;
  
  public Zed9(Zrim paramZrim, Zeb5 paramZeb5, Ze73 paramZe73, Zmv7 paramZmv7) {
    this.Zw = paramZrim;
    this.ZT = paramZeb5;
    this.Zt = paramZmv7;
    this.Zo = paramZe73;
  }
  
  Zsww ZP(Zzcs paramZzcs, Collection<Zt8i> paramCollection) {
    Zlat zlat = paramZzcs.ZJ().Zl();
    if (zlat.Zu() != null) {
      Zgd4 zgd4 = zlat.Zu();
      return new Zsww(zgd4, zgd4.ZHN());
    } 
    Optional<Zt70> optional = zlat.ZE().ZO();
    if (optional.isPresent() && zlat.ZO() == Zz3o.GRAPHQL_INTROSPECTION && !Zkh8.Zk(((Zt70)optional.get()).ZC())) {
      Zgd4 zgd4 = this.ZT.Zx();
      return new Zsww(zgd4, zgd4.ZHN());
    } 
    Zem4<Zm9l> zem4 = this.Zo.Zc(paramZzcs.ZM(), Zras.ZY(paramZzcs, this.Zw, paramCollection));
    if (zem4.Zv()) {
      this.Zt.Zy(Zrp6.DEBUG, Zlq7.FOUND_ROOM_EXACT_MATCH_ROOM_GROUP, new Object[] { Boolean.valueOf(!paramCollection.isEmpty()) });
      return new Zsww(((Zm9l)zem4.Zk().ZF()).ZD(), zem4.Zk().ZG());
    } 
    Zeu9 zeu9 = this.ZT.Zk(paramZzcs);
    this.Zt.Zy(Zrp6.INFO, Zlq7.FOUND_NEW_ROOM, new Object[] { zeu9.ZfT(), zeu9 });
    this.Zw.ZC(zeu9);
    return new Zsww(zeu9, zeu9.ZHN());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */