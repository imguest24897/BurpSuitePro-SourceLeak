package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Zg4s implements Iterable<Zkyq> {
  private final List<Zkyq> Zf = new CopyOnWriteArrayList<>();
  
  public boolean ZH() {
    return this.Zf.isEmpty();
  }
  
  public int ZG() {
    return this.Zf.size();
  }
  
  void ZT(Zkyq paramZkyq) {
    this.Zf.addFirst(paramZkyq);
  }
  
  void Zh(Zkyq paramZkyq) {
    this.Zf.add(paramZkyq);
  }
  
  void ZB(int paramInt, Zkyq paramZkyq) {
    this.Zf.add(paramInt, paramZkyq);
  }
  
  public Zkyq Zf(int paramInt) {
    return this.Zf.get(paramInt);
  }
  
  public Zkyq Zc() {
    return this.Zf.getFirst();
  }
  
  public Zkyq ZT() {
    return this.Zf.getLast();
  }
  
  boolean Zs(Zkyq paramZkyq) {
    return this.Zf.remove(paramZkyq);
  }
  
  public Zg4s ZM(Predicate<Zkyq> paramPredicate) {
    Zg4s zg4s = new Zg4s();
    Objects.requireNonNull(zg4s);
    this.Zf.stream().filter(paramPredicate).forEach(zg4s::Zh);
    return zg4s;
  }
  
  public void Zj(int paramInt, Consumer<Zkyq> paramConsumer) {
    Zo(paramInt).ifPresent(paramConsumer);
  }
  
  public void Zl(int paramInt, List<Consumer<Zkyq>> paramList) {
    Zo(paramInt).ifPresent(paramList::lambda$performOperationsOnTaskWithId$1);
  }
  
  void ZW(int paramInt) {
    Zo(paramInt).ifPresent(this::lambda$deleteTaskWithId$2);
  }
  
  Optional<Zkyq> Zo(int paramInt) {
    return this.Zf.stream().filter(paramInt::lambda$findTaskWithId$3).findFirst();
  }
  
  Optional<Zkyq> ZB(int paramInt) {
    return Zo(paramInt).flatMap(this::lambda$findNextTask$4);
  }
  
  public Iterator<Zkyq> iterator() {
    return this.Zf.iterator();
  }
  
  private Optional lambda$findNextTask$4(Zkyq paramZkyq) {
    int i = this.Zf.indexOf(paramZkyq);
    boolean bool1 = (i + 1 < this.Zf.size()) ? true : false;
    boolean bool2 = (i - 1 >= 0 && i - 1 < this.Zf.size()) ? true : false;
    return bool1 ? Optional.of(this.Zf.get(i + 1)) : (bool2 ? Optional.of(this.Zf.get(i - 1)) : Optional.empty());
  }
  
  private static boolean lambda$findTaskWithId$3(int paramInt, Zkyq paramZkyq) {
    return (paramZkyq.Zi() == paramInt);
  }
  
  private void lambda$deleteTaskWithId$2(Zkyq paramZkyq) {
    paramZkyq.Zo();
    paramZkyq.Zk();
    paramZkyq.Zy();
    this.Zf.remove(paramZkyq);
  }
  
  private static void lambda$performOperationsOnTaskWithId$1(List paramList, Zkyq paramZkyq) {
    paramList.forEach(paramZkyq::lambda$performOperationsOnTaskWithId$0);
  }
  
  private static void lambda$performOperationsOnTaskWithId$0(Zkyq paramZkyq, Consumer<Zkyq> paramConsumer) {
    paramConsumer.accept(paramZkyq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg4s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */