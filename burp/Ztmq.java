package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import net.portswigger.browser.Zd2;

class Ztmq<F> {
  private final Map<Zd2, List<Zgb7<F>>> ZF = new ConcurrentHashMap<>();
  
  void ZO(Zgb7<F> paramZgb7) {
    Zq(paramZgb7, paramZgb7.Zb());
  }
  
  void Zq(Zgb7<F> paramZgb7, Ztgw paramZtgw) {
    Zd2 zd2 = paramZtgw.Zu();
    if (zd2.ZB8() != null)
      ((List<Zgb7<F>>)this.ZF.computeIfAbsent(zd2, Ztmq::lambda$addToCorridor$0)).add(paramZgb7); 
  }
  
  boolean ZV(Ztgw paramZtgw) {
    return (paramZtgw.Zu().ZB8() != null && this.ZF.containsKey(paramZtgw.Zu()));
  }
  
  Collection<List<Zgb7<F>>> Zs() {
    return this.ZF.values();
  }
  
  List<Zgb7<F>> Zn(Ztgw paramZtgw) {
    return ZV(paramZtgw) ? Collections.unmodifiableList(this.ZF.get(paramZtgw.Zu())) : Collections.emptyList();
  }
  
  Collection<List<Zgb7<F>>> ZY(Ztgw paramZtgw) {
    return (Collection<List<Zgb7<F>>>)this.ZF.entrySet().stream().filter(paramZtgw::lambda$getTrackedCorridorsExcept$1).map(Map.Entry::getValue).collect(Collectors.toSet());
  }
  
  int ZV(Zd2 paramZd2) {
    return (paramZd2.ZB8() == null) ? 0 : ((List)this.ZF.getOrDefault(paramZd2, Collections.emptyList())).size();
  }
  
  private static boolean lambda$getTrackedCorridorsExcept$1(Ztgw paramZtgw, Map.Entry paramEntry) {
    return !((Zd2)paramEntry.getKey()).equals(paramZtgw.Zu());
  }
  
  private static List lambda$addToCorridor$0(Zd2 paramZd2) {
    return new CopyOnWriteArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */