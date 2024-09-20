package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Zllh {
  private final List<Zzys> ZU = new ArrayList<>();
  
  private final Zz4b Zo;
  
  private static String ZZ;
  
  public Zllh(Zz4b paramZz4b) {
    this.Zo = paramZz4b;
  }
  
  List<Zzys> ZT() {
    Zefg<Zgna> zefg = this.Zo.ZV_();
    List<Zzys> list = (List)zefg.stream().filter(Zllh::lambda$projectAndEphemeralTasks$0).map(Zllh::lambda$projectAndEphemeralTasks$1).collect(Collectors.toCollection(ArrayList::new));
    Set set = (Set)list.stream().map(Zgna::ZPo).collect(Collectors.toSet());
    String str = ZJ();
    Objects.requireNonNull(list);
    this.ZU.stream().filter(set::lambda$projectAndEphemeralTasks$2).forEach(list::add);
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
    return list;
  }
  
  public void Zz(Zzys paramZzys) {
    this.ZU.add(paramZzys);
  }
  
  public void Zf(Zzys paramZzys) {
    this.ZU.remove(paramZzys);
  }
  
  private static boolean lambda$projectAndEphemeralTasks$2(Set paramSet, Zzys paramZzys) {
    return !paramSet.contains(Integer.valueOf(paramZzys.ZPo()));
  }
  
  private static Zzys lambda$projectAndEphemeralTasks$1(Zgna paramZgna) {
    return (Zzys)paramZgna;
  }
  
  private static boolean lambda$projectAndEphemeralTasks$0(Zgna paramZgna) {
    return (paramZgna.ZNs() == Zkcl.INTRUDER_ATTACK);
  }
  
  public static void Zl(String paramString) {
    ZZ = paramString;
  }
  
  public static String ZJ() {
    return ZZ;
  }
  
  static {
    if (ZJ() != null)
      Zl("n0K4cc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */