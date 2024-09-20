package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Zb69 {
  private final Ze4y Zy;
  
  private final Zt0e Za;
  
  public Zb69(Ze4y paramZe4y, Zt0e paramZt0e) {
    this.Zy = paramZe4y;
    this.Za = paramZt0e;
  }
  
  public Zb0n ZD(Zen9 paramZen9) {
    ArrayList<Zzsd> arrayList = new ArrayList();
    ZP(paramZen9, arrayList);
    boolean bool = Zzsd.Zq();
    byte b = 0;
    while (b < arrayList.size()) {
      Zzsd zzsd = arrayList.get(b);
      Zw((List)this.Zy.Z_(), zzsd, arrayList);
      Zw((List)this.Zy.Zp(), zzsd, arrayList);
      b++;
      if (!bool) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    this.Za.Z_(arrayList);
    return new Zb0n(this.Zy, arrayList, this.Za);
  }
  
  private void ZP(Zen9 paramZen9, List<Zzsd> paramList) {
    Set<Zgy_> set = paramZen9.Zf().Zx();
    Zzsd zzsd = new Zzsd(set);
    paramList.add(zzsd);
  }
  
  private void Zw(List<? extends Ztx4> paramList, Zzsd paramZzsd, List<Zzsd> paramList1) {
    boolean bool = Zzsd.Zq();
    for (Ztx4 ztx4 : paramList) {
      Set<Zgy_> set = paramZzsd.ZM(ztx4);
      if (!set.isEmpty()) {
        Zzsd zzsd = Zv(set, paramList1);
        paramZzsd.ZK(new Zg6w(ztx4, zzsd));
      } 
      if (!bool)
        break; 
    } 
  }
  
  private Zzsd Zv(Set<Zgy_> paramSet, List<Zzsd> paramList) {
    Zzsd zzsd1 = new Zzsd(paramSet);
    Zzsd zzsd2 = ZL(paramList, zzsd1);
    if (zzsd2 == null) {
      paramList.add(zzsd1);
      return zzsd1;
    } 
    return zzsd2;
  }
  
  private Zzsd ZL(List<Zzsd> paramList, Zzsd paramZzsd) {
    boolean bool = Zzsd.ZW();
    for (Zzsd zzsd : paramList) {
      if (paramZzsd.equals(zzsd))
        return zzsd; 
      if (bool)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb69.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */