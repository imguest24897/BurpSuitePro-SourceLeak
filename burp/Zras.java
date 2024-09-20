package burp;

import java.util.Collection;
import java.util.List;

@FunctionalInterface
public interface Zras<T extends Zm9j> {
  List<T> Zn();
  
  static Zras<Zm9l> ZY(Zzcs paramZzcs, Zrim paramZrim, Collection<Zt8i> paramCollection) {
    Zz3o zz3o = paramZzcs.ZJ().Zl().ZO();
    return Zz3o.API_EDGE_TYPES.contains(zz3o) ? paramCollection::lambda$forAgentStepOutcome$0 : new Zlhl(paramZrim, paramZzcs, paramCollection);
  }
  
  static <T extends Zm9j> Zras<T> ZM(T paramT) {
    return paramT::lambda$onlyMatch$1;
  }
  
  private static List lambda$onlyMatch$1(Zm9j paramZm9j) {
    return List.of(paramZm9j);
  }
  
  private static List lambda$forAgentStepOutcome$0(Collection paramCollection) {
    return paramCollection.stream().map(Zt8i::Zsu).map(Zm9l::Zp).toList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zras.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */