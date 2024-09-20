package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Zg1h extends Zg1q {
  private final Zr69 ZH;
  
  public Zg1h(Zr69 paramZr69) {
    this.ZH = paramZr69;
  }
  
  public List<Zs49<?>> Zo(List<Ze7n> paramList) {
    if (paramList.isEmpty())
      return Collections.emptyList(); 
    LinkedList<Zzci> linkedList = new LinkedList();
    Zzci zzci = Zmjh.Zf(this.ZH.ZP());
    if (Zf(paramList) && Zs(paramList))
      linkedList.add(zzci); 
    linkedList.addAll((Collection)Zi(paramList, zzci));
    Objects.requireNonNull(linkedList);
    ZD(paramList, zzci).ifPresent(linkedList::add);
    return (List)linkedList;
  }
  
  protected boolean Zj(Ze7n paramZe7n) {
    Zzuz zzuz = paramZe7n.ZH();
    return (!zzuz.Zu() && zzuz.Zl());
  }
  
  private static boolean Zf(List<Ze7n> paramList) {
    return paramList.stream().anyMatch(Zg1h::lambda$anyInputHasNoValueOrHasExamples$0);
  }
  
  private static boolean Zs(List<Ze7n> paramList) {
    return paramList.stream().anyMatch(Zg1q::Zn);
  }
  
  private static boolean lambda$anyInputHasNoValueOrHasExamples$0(Ze7n paramZe7n) {
    return (Zsw8.ZP(paramZe7n.Ze()) || !paramZe7n.ZX().isEmpty());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */