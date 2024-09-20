package burp;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zkub {
  private static final Set<String> Zg = (Set<String>)Stream.<Set>of(new Set[] { Zz60.Zl, Ztdk.Zl }).flatMap(Collection::stream).collect(Collectors.toSet());
  
  private static String Zv;
  
  public static boolean Zv(String paramString) {
    return Zg.contains(paramString);
  }
  
  public static void Ze(String paramString) {
    Zv = paramString;
  }
  
  public static String Zd() {
    return Zv;
  }
  
  static {
    if (Zd() != null)
      Ze("ToWYVb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkub.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */