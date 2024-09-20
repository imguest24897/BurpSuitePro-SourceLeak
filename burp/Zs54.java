package burp;

import java.util.function.Supplier;
import net.portswigger.Zoq;

public class Zs54 {
  public static final Zs54 ZD = new Zs54(Zoq.ZZ(Zs54::lambda$static$0), Zoq.ZZ(Zs54::lambda$static$0));
  
  private final Zoq<Integer> ZU;
  
  private final Zoq<Integer> Zh;
  
  private Zs54(Zoq<Integer> paramZoq1, Zoq<Integer> paramZoq2) {
    this.ZU = paramZoq1;
    this.Zh = paramZoq2;
  }
  
  static Zs54 ZX() {
    return ZD;
  }
  
  public static Zs54 Zg(int paramInt1, int paramInt2) {
    return new Zs54(Zoq.ZZ(paramInt1::lambda$from$2), Zoq.ZZ(paramInt2::lambda$from$2));
  }
  
  static Zs54 Zk(Supplier<Integer> paramSupplier1, Supplier<Integer> paramSupplier2) {
    return new Zs54(Zoq.ZZ(paramSupplier1), Zoq.ZZ(paramSupplier2));
  }
  
  public int ZD() {
    return ((Integer)this.ZU.Zz()).intValue();
  }
  
  public int ZS() {
    return ((Integer)this.Zh.Zz()).intValue();
  }
  
  private static Integer lambda$from$2(int paramInt) {
    return Integer.valueOf(paramInt);
  }
  
  private static Integer lambda$static$0() {
    return Integer.valueOf(-1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs54.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */