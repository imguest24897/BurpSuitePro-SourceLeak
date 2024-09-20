package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgk3 {
  private final Ztai ZV;
  
  private final Ze3n Zp;
  
  private final Zb9e ZS;
  
  private final Zebl ZJ;
  
  public Zgk3(Ztai paramZtai, Ze3n paramZe3n, Zb9e paramZb9e, Zebl paramZebl) {
    this.ZV = paramZtai;
    this.Zp = paramZe3n;
    this.ZS = paramZb9e;
    this.ZJ = paramZebl;
  }
  
  public void ZZ(List<Zer0> paramList) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Zgkf zgkf : (Zz(paramList)).Zs) {
      for (Zliq zliq : zgkf.Ze) {
        Zuh.Zv(zliq.ZH.Zg().contains(Zr3z.INFILTRATOR_BASED), Zqf.Zr, zliq.ZH.ZS());
        if (this.ZV.ZS(zliq.ZH, Zr3z.INFILTRATOR_BASED)) {
          Zx_5 zx_5 = Zzmy.Zi(this.Zp.Za(), this.Zp.ZN(), zgkf.Zm, Ze(zgkf.Zm, zliq.Zo()), zliq.ZH);
          this.ZJ.Zc(zx_5, zgkf.Zm);
        } 
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private Zzjd Zz(List<Zer0> paramList) {
    Zzjd zzjd = new Zzjd();
    Iterator<Zxov> iterator = (new Zsfq(paramList)).ZT().iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zxov zxov = iterator.next();
      if (zxov.ZR.ZO.ZA() != Zb25.DNS && zxov.ZR.ZO.ZA() != Zb25.HTTP && zxov.ZR.ZO.ZA() != Zb25.HTTPS)
        continue; 
      Zxs7 zxs7 = this.Zp.ZS().Zt(zxov.ZR.Zy.Zk());
      if (zxs7 != null)
        zzjd.Zy(zxov, zxs7); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return zzjd;
  }
  
  private List<Zr3k> Ze(Zxs7 paramZxs7, Zxlj paramZxlj) {
    ArrayList<Zr3k> arrayList = new ArrayList();
    Iterator<Zlez> iterator = paramZxlj.iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zlez zlez = iterator.next();
      Zzwz zzwz = this.ZS.Zl(paramZxs7, zlez.Zu);
      arrayList.addAll(this.ZJ.Zt(paramZxs7, zlez, zzwz));
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList;
  }
  
  static List<Zxov> Zj(List<Zer0> paramList, List<Zxov> paramList1) {
    List<Zxov> list = (new Zsfq(paramList)).ZT();
    ArrayList<Zxov> arrayList = new ArrayList();
    Iterator<Zxov> iterator = paramList1.iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zxov zxov = iterator.next();
      boolean bool = false;
      for (Zxov zxov1 : list) {
        if (zxov1.Zg.Zg(zxov.Zg) && zxov1.ZR.ZO.ZA() == zxov.ZR.ZO.ZA() && zxov1.ZC() == zxov.ZC()) {
          arrayList.add(zxov1);
          bool = true;
          if (arrayOfZbqc != null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (!bool)
        arrayList.add(zxov); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */