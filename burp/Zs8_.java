package burp;

import burp.api.montoya.core.Registration;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

class Zs8_<T> {
  private final String ZF;
  
  protected final Runnable ZE;
  
  protected final List<T> ZQ;
  
  private Zs8_() {
    this(null, Zs8_::lambda$new$0);
  }
  
  private Zs8_(String paramString, Runnable paramRunnable) {
    this.ZF = paramString;
    this.ZE = paramRunnable;
    this.ZQ = new CopyOnWriteArrayList<>();
  }
  
  public Registration ZR(T paramT) {
    this.ZQ.add(paramT);
    this.ZE.run();
    return new Zsam(this, paramT);
  }
  
  public void Zl(T paramT) {
    boolean bool = this.ZQ.removeIf(paramT::lambda$remove$1);
    if (bool)
      this.ZE.run(); 
  }
  
  public List<T> Zq() {
    return Collections.unmodifiableList(this.ZQ);
  }
  
  public int ZM() {
    return this.ZQ.size();
  }
  
  public void Z_() {
    this.ZQ.clear();
  }
  
  public Optional<String[]> Zm() {
    return Optional.<List<T>>of(this.ZQ).filter(Predicate.not(List::isEmpty)).map(List::size).map(this::lambda$information$2);
  }
  
  private String[] lambda$information$2(Integer paramInteger) {
    return new String[] { this.ZF, Integer.toString(paramInteger.intValue()) };
  }
  
  private static boolean lambda$remove$1(Object paramObject1, Object paramObject2) {
    return Objects.equals(paramObject2, paramObject1);
  }
  
  private static void lambda$new$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */