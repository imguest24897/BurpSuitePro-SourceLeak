package burp;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Zzx implements Zi5 {
  public int Zk(Zrnc paramZrnc) {
    return Arrays.hashCode(paramZrnc.Zr().Zd4()) + 31 * Zn(paramZrnc).hashCode();
  }
  
  private static Set<String> Zn(Zrnc paramZrnc) {
    return (Set<String>)paramZrnc.ZW().stream().map(Zzx::lambda$parameterNames$0).collect(Collectors.toSet());
  }
  
  private static String lambda$parameterNames$0(Zlou paramZlou) {
    return paramZlou.ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */