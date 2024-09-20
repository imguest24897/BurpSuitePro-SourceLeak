package burp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Zz6w {
  private final Zto7 Zr;
  
  private final Predicate<Zto7> Zv;
  
  private final List<Integer> Zs;
  
  private Zz6w(Zto7 paramZto7, Predicate<Zto7> paramPredicate, int... paramVarArgs) {
    this.Zr = paramZto7;
    this.Zv = paramPredicate;
    this.Zs = Arrays.stream(paramVarArgs).boxed().collect((Collector)Collectors.toList());
  }
  
  public Zto7 ZP() {
    return this.Zr;
  }
  
  boolean ZW() {
    return (this.Zr != null && this.Zv.test(this.Zr));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */