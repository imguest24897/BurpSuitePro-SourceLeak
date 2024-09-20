package burp;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class Zsdf extends Zsc2 {
  public Zsdf(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public Collection<Zblb> Zj() {
    HashSet<Zblb> hashSet = new HashSet<>(Zblb.ZB(getCause()));
    hashSet.add(Zblb.TOO_MANY_CONSECUTIVE);
    return EnumSet.copyOf(hashSet);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */