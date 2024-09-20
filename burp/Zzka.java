package burp;

import java.util.List;

public class Zzka<T> {
  private final Zxnw<T> ZM;
  
  public Zzka(Zxnw<T> paramZxnw) {
    this.ZM = paramZxnw;
  }
  
  public List<String> Zq() {
    return this.ZM.ZJ().stream().map(Zs1_::ZE).toList();
  }
  
  public List<String> ZE(T paramT) {
    return this.ZM.ZJ().stream().map(paramT::lambda$getValues$0).toList();
  }
  
  private static String lambda$getValues$0(Object paramObject, Zs1_<Object> paramZs1_) {
    return paramZs1_.ZP(paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzka.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */