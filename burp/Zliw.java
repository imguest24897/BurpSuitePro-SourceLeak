package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zz_;

public class Zliw implements Zebl {
  private final Zmz6 ZD;
  
  private final Zr_4 Zr;
  
  private final long ZN;
  
  private final long Ze;
  
  private final Zbnt ZQ;
  
  private final Ze3n ZY;
  
  private final Zly1 ZI;
  
  public Zliw(Zmz6 paramZmz6, Zr_4 paramZr_4, long paramLong1, long paramLong2, Zbnt paramZbnt, Ze3n paramZe3n, Zly1 paramZly1) {
    this.ZD = paramZmz6;
    this.Zr = paramZr_4;
    this.ZN = paramLong1;
    this.Ze = paramLong2;
    this.ZQ = paramZbnt;
    this.ZY = paramZe3n;
    this.ZI = paramZly1;
  }
  
  public void Zc(Zx_5 paramZx_5, Zxs7 paramZxs7) {
    Zgq<Zgpi> zgq = new Zgq<>();
    zgq.Zu(paramZx_5);
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    this.ZI.ZG(paramZxs7, Zz76.Zf(this.ZY, paramZxs7), this.ZY.Za(), this.ZY.ZA().Zr(), (this.ZY.Zp()).ZH.ZJ, (Zgq)zgq);
    this.ZD.ZB((Zgq)zgq);
    if (Zbqc.Zwu() == null)
      Ztxo.Zn(new Zbqc[5]); 
  }
  
  public List<Zr3k> Zt(Zxs7 paramZxs7, Zlez paramZlez, Zzwz paramZzwz) {
    Iterator<Zxov> iterator = Zgk3.Zj(Collections.emptyList(), paramZlez.ZQ).iterator();
    Zxov zxov = iterator.next();
    ArrayList<Zr3k> arrayList = new ArrayList();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    List<Zen> list = (new Zz_(Zkb.Zy(((Zxov)paramZlez.ZQ.get(0)).ZR.ZO.Zx()))).Z_();
    if (list.size() != 1) {
      Zuh.Zv(false, Zqf.Zr, list.size());
      return Collections.emptyList();
    } 
    Zewx zewx = paramZzwz.ZK(paramZlez.Zu, Zen.Zh(list.get(0)));
    arrayList.add(Zw(zxov, zewx, paramZxs7));
    while (iterator.hasNext()) {
      arrayList.add(Zg(iterator.next(), zewx, null));
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    return arrayList;
  }
  
  private Zr3k Zw(Zxov paramZxov, Zewx paramZewx, Zxs7 paramZxs7) {
    Zs2i zs2i = paramZewx.Zu(paramZxs7);
    Zvow zvow = this.ZY.ZI().Zp(zs2i.ZE()).ZK(zs2i.ZO());
    return Zg(paramZxov, paramZewx, zvow);
  }
  
  private Zr3k Zg(Zxov paramZxov, Zewx paramZewx, Zvow paramZvow) {
    long l = Zr3r.ZU(this.Ze, paramZxov.ZR.ZO.Zn(), this.ZN);
    Zgxe zgxe = new Zgxe(this.ZQ, this.Zr, l);
    return new Zr3k(new Zt69(new Zz25(paramZewx.Zh(), 0), paramZvow, zgxe.Zb(paramZewx, paramZxov.ZR.ZO, Collections.singletonList(paramZxov.ZR.ZO))), paramZxov.Zi(paramZxov.ZR.ZO), paramZewx.ZG().Zz());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zliw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */