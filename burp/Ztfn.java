package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zrzg;

class Ztfn implements Zm1x {
  private final Map<Integer, Ztmr> Zd = new HashMap<>();
  
  private final Map<Integer, List<Ztac>> ZE = new HashMap<>();
  
  private final Map<Integer, Zx1> Zb;
  
  private final int[] Zw;
  
  private final Zlu6 Zp;
  
  Ztfn(Zrgd paramZrgd, Zrzg paramZrzg, Zkit paramZkit1, Zkit paramZkit2, Ztg8 paramZtg8, Zlu6 paramZlu6, Zzir paramZzir, Ztwv paramZtwv, Zm6x paramZm6x) {
    int i = Zlbi.ZV();
    this.Zb = new HashMap<>();
    this.Zp = paramZlu6;
    if (paramZlu6.ZE()) {
      Ztym ztym = new Ztym(paramZkit1, paramZtg8, paramZzir);
      this.Zd.put(Integer.valueOf(487580250), ztym);
      this.ZE.put(Integer.valueOf(487580250), Zk4t.ZV());
      this.Zb.put(Integer.valueOf(487580250), Zkit.ZM);
    } 
    if (paramZlu6.ZM()) {
      Zzj zzj = new Zzj(paramZkit1, paramZtg8, paramZzir.Zv9());
      this.Zd.put(Integer.valueOf(1639358769), zzj.Zh());
      this.ZE.put(Integer.valueOf(1639358769), Zkp7.ZN());
      this.Zb.put(Integer.valueOf(1639358769), Zkit.ZM);
      this.Zd.put(Integer.valueOf(1871779041), zzj.ZW());
      this.ZE.put(Integer.valueOf(1871779041), Zkpq.Zw());
      this.Zb.put(Integer.valueOf(1871779041), Zkit.ZM);
      this.Zd.put(Integer.valueOf(53344700), zzj.Zi());
      this.ZE.put(Integer.valueOf(53344700), Zkph.ZA());
      this.Zb.put(Integer.valueOf(53344700), Zkit.ZM);
      this.Zd.put(Integer.valueOf(1721893752), zzj.ZD());
      this.ZE.put(Integer.valueOf(1721893752), Zkpb.Zu());
      this.Zb.put(Integer.valueOf(1721893752), Zkit.ZM);
      this.Zd.put(Integer.valueOf(1824540420), zzj.Zv());
      this.ZE.put(Integer.valueOf(1824540420), Zkpm.Zm());
      this.Zb.put(Integer.valueOf(1824540420), Zkit.ZM);
      this.Zd.put(Integer.valueOf(951248736), zzj.ZH());
      this.ZE.put(Integer.valueOf(951248736), Zkpv.ZR());
      this.Zb.put(Integer.valueOf(951248736), Zkit.ZM);
    } 
    if (paramZlu6.ZW()) {
      Zzki zzki = new Zzki(paramZkit1, paramZtg8, paramZzir.Zvu());
      this.Zd.put(Integer.valueOf(2048079167), zzki);
      this.ZE.put(Integer.valueOf(2048079167), Zkpo.ZH());
      this.Zb.put(Integer.valueOf(2048079167), Zkit.ZM);
      this.Zd.put(Integer.valueOf(742456733), zzki);
      this.ZE.put(Integer.valueOf(742456733), Zkpo.ZH());
      this.Zb.put(Integer.valueOf(742456733), Zkit.Zl);
      this.Zd.put(Integer.valueOf(481592017), zzki);
      this.ZE.put(Integer.valueOf(481592017), Zkpf.Zd());
      this.Zb.put(Integer.valueOf(481592017), Zkit.ZM);
      this.Zd.put(Integer.valueOf(852746760), zzki);
      this.ZE.put(Integer.valueOf(852746760), Zkpf.Zd());
      this.Zb.put(Integer.valueOf(852746760), Zkit.Zl);
    } 
    if (paramZlu6.Zu()) {
      Ztii ztii = new Ztii(paramZkit1, paramZtg8, paramZzir.Zvu());
      this.Zd.put(Integer.valueOf(698992465), ztii);
      this.ZE.put(Integer.valueOf(698992465), Zkpz.ZO());
      this.Zb.put(Integer.valueOf(698992465), Zkit.ZM);
      this.Zd.put(Integer.valueOf(559022070), ztii);
      this.ZE.put(Integer.valueOf(559022070), Zkpz.ZO());
      this.Zb.put(Integer.valueOf(559022070), Zkit.Zl);
    } 
    if (paramZlu6.ZC()) {
      Zrql zrql = new Zrql(paramZkit1, paramZtg8, paramZzir.Zvj());
      this.Zd.put(Integer.valueOf(367242080), zrql);
      this.ZE.put(Integer.valueOf(367242080), Zkpw.Zu());
      this.Zb.put(Integer.valueOf(367242080), Zkit.ZM);
      this.Zd.put(Integer.valueOf(299258227), zrql);
      this.ZE.put(Integer.valueOf(299258227), Zkpw.Zu());
      this.Zb.put(Integer.valueOf(299258227), Zkit.Zl);
      this.Zd.put(Integer.valueOf(1158996318), zrql);
      this.ZE.put(Integer.valueOf(1158996318), Zkpi.ZB());
      this.Zb.put(Integer.valueOf(1158996318), Zkit.ZM);
    } 
    if (paramZlu6.ZF()) {
      Zb4w zb4w = new Zb4w(paramZrgd, paramZrzg, paramZkit1, paramZkit2, paramZtg8, paramZzir, paramZtwv, paramZm6x);
      this.Zd.put(Integer.valueOf(518968532), zb4w.ZT());
      this.ZE.put(Integer.valueOf(518968532), Zk3k.Zv());
      this.Zb.put(Integer.valueOf(518968532), Zkit.ZM);
      this.Zd.put(Integer.valueOf(961656479), zb4w.ZT());
      this.ZE.put(Integer.valueOf(961656479), Zk3k.Zv());
      this.Zb.put(Integer.valueOf(961656479), Zkit.Zl);
      this.Zd.put(Integer.valueOf(968708621), zb4w.ZO());
      this.ZE.put(Integer.valueOf(968708621), Zk3g.ZZ());
      this.Zb.put(Integer.valueOf(968708621), Zkit.ZM);
      this.Zd.put(Integer.valueOf(1706278272), zb4w.ZO());
      this.ZE.put(Integer.valueOf(1706278272), Zk3g.ZZ());
      this.Zb.put(Integer.valueOf(1706278272), Zkit.Zl);
    } 
    if (paramZlu6.ZJ()) {
      Zkq_ zkq_ = new Zkq_(paramZkit1, paramZtg8, paramZzir.Zvl());
      this.Zd.put(Integer.valueOf(150412623), zkq_);
      this.ZE.put(Integer.valueOf(150412623), Zkl0.Zg());
      this.Zb.put(Integer.valueOf(150412623), Zkit.ZM);
    } 
    Set<Integer> set = this.Zb.keySet();
    this.Zw = new int[set.size()];
    byte b = 0;
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      int j = ((Integer)iterator.next()).intValue();
      this.Zw[b++] = j;
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zlbi.ZZ(++i); 
  }
  
  public int[] ZY() {
    return this.Zw;
  }
  
  public List<Ztac> ZY(int paramInt) {
    return this.ZE.get(Integer.valueOf(paramInt));
  }
  
  public Zx1 ZN(int paramInt) {
    return this.Zb.get(Integer.valueOf(paramInt));
  }
  
  public void Zw(int paramInt) {
    this.Zp.ZQ(paramInt);
  }
  
  public boolean ZF() {
    return this.Zp.Zg();
  }
  
  Ztmr Zp(int paramInt) {
    return this.Zd.get(Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */