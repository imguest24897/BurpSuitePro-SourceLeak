package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Ze8d {
  final Zvs Zc;
  
  final Ztbx Zd;
  
  private Ze8d(Zvs paramZvs, Ztbx paramZtbx) {
    this.Zc = paramZvs;
    this.Zd = paramZtbx;
  }
  
  static List<Ze8d> Zg(Zvs paramZvs, Ze3n paramZe3n, Zm7h paramZm7h) {
    if (paramZe3n == null)
      return Collections.emptyList(); 
    Objects.requireNonNull(paramZm7h);
    return (List<Ze8d>)paramZe3n.Zo().stream().map(paramZm7h::Zz).flatMap(Collection::stream).map(paramZvs::lambda$from$0).collect(Collectors.toList());
  }
  
  private static Ze8d lambda$from$0(Zvs paramZvs, Ztbx paramZtbx) {
    return new Ze8d(paramZvs, paramZtbx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze8d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */