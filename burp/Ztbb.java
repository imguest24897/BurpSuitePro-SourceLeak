package burp;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class Ztbb {
  private final Supplier<Boolean> Zg;
  
  private final Set<Zmzk> ZJ = ConcurrentHashMap.newKeySet();
  
  private final Set<Zmzk> Zp = ConcurrentHashMap.newKeySet();
  
  private static Zbqc[] ZR;
  
  public Ztbb(Zgb6 paramZgb6) {
    Objects.requireNonNull(paramZgb6);
    this.Zg = paramZgb6::ZcC;
  }
  
  public Ztbb() {
    this.Zg = Ztbb::lambda$new$0;
  }
  
  public boolean ZQ(Zmzk paramZmzk) {
    return (paramZmzk != null && this.ZJ.contains(paramZmzk));
  }
  
  public void Z_(Zmzk paramZmzk) {
    this.ZJ.add(paramZmzk);
  }
  
  public boolean ZM(Zmzk paramZmzk) {
    return (paramZmzk != null && this.Zp.contains(paramZmzk));
  }
  
  public void Zo(Zmzk paramZmzk) {
    this.Zp.add(paramZmzk);
  }
  
  public Zxk3 ZP(Zmzk paramZmzk) {
    return (((Boolean)this.Zg.get()).booleanValue() && ZM(paramZmzk)) ? Zxk3.HTTP_V2 : Zxk3.HTTP_V11;
  }
  
  private static Boolean lambda$new$0() {
    return Boolean.valueOf(true);
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZR = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZB() {
    return ZR;
  }
  
  static {
    if (ZB() == null)
      ZS(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztbb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */