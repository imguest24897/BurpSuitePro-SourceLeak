package burp;

import java.util.Set;
import java.util.stream.Collectors;

class Ztlm implements Zmxz {
  private final Zmxz Zs;
  
  public Ztlm(Zmxz paramZmxz) {
    this.Zs = paramZmxz;
  }
  
  private static Set<String> Zw(Zefg<Zxtl> paramZefg) {
    return (Set<String>)paramZefg.stream().map(Ztlm::lambda$mapToString$0).collect(Collectors.toSet());
  }
  
  private static boolean Zd(Zefg<Zxtl> paramZefg1, Zefg<Zxtl> paramZefg2) {
    Set<String> set1 = Zw(paramZefg1);
    Set<String> set2 = Zw(paramZefg2);
    return set1.containsAll(set2);
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    if (paramZrdb1.Za8() == 2 && paramZrdb2.Za8() == 2) {
      if (paramZrdb1.Zan() != null && paramZrdb2.Zan() == null)
        return Zl4m.Zh; 
      if (paramZrdb1.Zan() != null && paramZrdb2.Zan() != null) {
        Zefg<Zxtl> zefg1 = paramZrdb1.Zaq();
        Zefg<Zxtl> zefg2 = paramZrdb2.Zaq();
        if (!Zd(zefg1, zefg2))
          zefg1.addAll(paramZz1h.Zq(zefg2)); 
        return Zl4m.Zh;
      } 
      if (paramZrdb1.Zan() == null && paramZrdb2.Zan() != null)
        return Zl4m.Zf; 
    } 
    if (paramZrdb1.Za8() == 3 && paramZrdb2.Za8() == 3) {
      Zefg<Zxtl> zefg1 = paramZrdb1.Zaq();
      Zefg<Zxtl> zefg2 = paramZrdb2.Zaq();
      if (!Zd(zefg1, zefg2))
        zefg1.addAll(paramZz1h.Zq(zefg2)); 
      return Zl4m.Zh;
    } 
    return this.Zs.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  private static String lambda$mapToString$0(Zxtl paramZxtl) {
    return paramZxtl.ZTs() + "-" + paramZxtl.ZTs();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztlm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */