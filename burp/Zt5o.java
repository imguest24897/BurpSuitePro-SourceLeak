package burp;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zt5o {
  final Map<Zl5x, Integer> Zl = new ConcurrentHashMap<>();
  
  final Map<Zl5x, Integer> Zr = new ConcurrentHashMap<>();
  
  final Map<Zl5x, Boolean> ZZ = new ConcurrentHashMap<>();
  
  final Map<Zl5x, AtomicInteger> ZF = new ConcurrentHashMap<>();
  
  final Set<Zl5x> Zw = new HashSet<>();
  
  private final Supplier<Integer> Zh;
  
  Zt5o(Supplier<Integer> paramSupplier) {
    this.Zh = paramSupplier;
  }
  
  public void Zk(Consumer<Zl3i> paramConsumer) {
    TreeSet<Zl5x> treeSet = new TreeSet(Comparator.comparingInt(Zl5x::Zn));
    treeSet.addAll(this.Zl.keySet());
    treeSet.addAll(this.Zr.keySet());
    int i = Zrjd.ZL();
    treeSet.addAll(this.ZZ.keySet());
    treeSet.addAll(this.ZF.keySet());
    treeSet.addAll(this.Zw);
    for (Zl5x zl5x : treeSet) {
      paramConsumer.accept(new Zl3i(zl5x, ((Integer)this.Zl.getOrDefault(zl5x, Integer.valueOf(-1))).intValue(), ((Integer)this.Zr.getOrDefault(zl5x, Integer.valueOf(-1))).intValue(), ((Boolean)this.ZZ.getOrDefault(zl5x, Boolean.valueOf(false))).booleanValue(), ((AtomicInteger)this.ZF.getOrDefault(zl5x, new AtomicInteger(-1))).get(), this.Zw.contains(zl5x)));
      if (i == 0)
        break; 
    } 
  }
  
  public Optional<Zsb3> ZQ() {
    TreeSet treeSet = new TreeSet(Comparator.comparingInt(Zl5x::Zn));
    treeSet.addAll(this.Zl.keySet());
    Optional<Zl5x> optional = treeSet.stream().filter(this::lambda$firstUninitialisedItemIndexAndPhase$0).findFirst();
    if (optional.isEmpty())
      return Optional.empty(); 
    Zl5x zl5x = optional.get();
    return Optional.of(new Zsb3(((Integer)this.Zl.get(zl5x)).intValue(), zl5x));
  }
  
  private boolean lambda$firstUninitialisedItemIndexAndPhase$0(Zl5x paramZl5x) {
    return (((Integer)this.Zl.get(paramZl5x)).intValue() < ((Integer)this.Zh.get()).intValue());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */