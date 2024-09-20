package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public class Zror {
  private static boolean Zo;
  
  public static Zsqx<Zrdb> ZO(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2, Collection<Zlit> paramCollection) {
    return new Zx_5(Zzu2.CROSS_DOMAIN_SCRIPT_INCLUDE, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, (Collection<String>)paramCollection.stream().map(Zlit::toString).collect(Collectors.toCollection(java.util.TreeSet::new)))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Zt(boolean paramBoolean) {
    Zo = paramBoolean;
  }
  
  public static boolean Zr() {
    return Zo;
  }
  
  public static boolean Zk() {
    boolean bool = Zr();
    return !bool;
  }
  
  static {
    if (Zk())
      Zt(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zror.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */