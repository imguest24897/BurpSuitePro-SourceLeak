package net.portswigger;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.openapi4j.Zau;
import org.openapi4j.Zl;
import org.openapi4j.Zx;

class Zgs<TApi, TSource extends Zl<TSource>> {
  private final Zx ZN;
  
  private final BiFunction<String, TSource, TApi> ZI;
  
  private final Map<String, TApi> Zj = new HashMap<>();
  
  private Zgs(Zx paramZx, BiFunction<String, TSource, TApi> paramBiFunction) {
    this.ZN = paramZx;
    this.ZI = paramBiFunction;
  }
  
  public TApi Zz(TSource paramTSource) {
    try {
      if (!paramTSource.isRef())
        return this.ZI.apply(null, paramTSource); 
    } catch (Zau zau) {
      throw a(null);
    } 
    String str = paramTSource.getRef();
    try {
      if (this.Zj.containsKey(str))
        return this.Zj.get(str); 
    } catch (Zau zau) {
      throw a(null);
    } 
    try {
      Zl zl = (Zl)paramTSource.getReference(this.ZN).Zg(paramTSource.getClass());
      if (zl != null) {
        TApi tApi = this.ZI.apply(str, (TSource)zl);
        this.Zj.put(str, tApi);
        return tApi;
      } 
    } catch (Zau zau) {
      Zah.Zl((Throwable)zau, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    return this.ZI.apply(null, paramTSource);
  }
  
  private static Zau a(Zau paramZau) {
    return paramZau;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */