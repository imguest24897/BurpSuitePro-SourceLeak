package burp;

import java.util.List;
import java.util.function.BiFunction;
import net.portswigger.Zsy;

class Zzw implements Zebd {
  public <T> void ZD(List<T> paramList, int paramInt, String paramString1, String paramString2, BiFunction<String, String, T> paramBiFunction) {
    paramList.add(paramInt + 1, paramBiFunction.apply(paramString1, (new Zsy()).Zi().Zx().ZK(8)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */