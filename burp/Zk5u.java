package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Zk5u {
  private final Zzqm ZM;
  
  private final Zsz4 Zv;
  
  private final Zzq2 ZI;
  
  private final Zg6v Zd;
  
  public Zk5u(Zzqm paramZzqm, Zsz4 paramZsz4, Zzq2 paramZzq2, Zg6v paramZg6v) {
    this.ZM = paramZzqm;
    this.Zv = paramZsz4;
    this.ZI = paramZzq2;
    this.Zd = paramZg6v;
  }
  
  public void ZZ(List<Zrdb> paramList, Zz4i paramZz4i) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zrdb> iterator = paramList.iterator();
    int[] arrayOfInt = Zz4i.ZC();
    while (iterator.hasNext()) {
      Zrdb zrdb = iterator.next();
      short s = Zzqm.ZG(zrdb);
      Zz2h zz2h = this.ZM.ZX(s);
      Zrwb zrwb = new Zrwb(paramZz4i);
      Zrwc zrwc = new Zrwc(zz2h, this.Zv, paramZz4i);
      Zrwk zrwk = new Zrwk(zz2h, this.ZI, paramZz4i);
      Zrwa zrwa = new Zrwa((Map)hashMap, zz2h, paramList, s);
      Zrwe zrwe = new Zrwe(paramZz4i);
      Zsmo zsmo = zrwb.Zf(zrwc.Zf(zrwk.Zf(zrwa.Zf(zrwe))));
      zsmo.Zr(zrdb);
      if (arrayOfInt == null)
        break; 
    } 
    Objects.requireNonNull(this.Zd);
    Objects.requireNonNull(paramZz4i);
    hashMap.values().stream().map(this.Zd::Zd).forEach(paramZz4i::ZK);
    if (Zbqc.Zwu() == null)
      Zz4i.Z_(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */