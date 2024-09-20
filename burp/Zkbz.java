package burp;

import java.util.List;
import java.util.Objects;

public class Zkbz {
  private final List<Zrup> Zs = List.of(new Zmwd(), new Zrz4(), new Zea1());
  
  public Zrtu ZM(Zefx paramZefx) {
    return this.Zs.stream().map(paramZefx::lambda$parse$0).filter(Objects::nonNull).findFirst().orElseThrow();
  }
  
  public Zefx Ze(Zefx paramZefx, String paramString1, String paramString2, boolean paramBoolean) {
    Zrup zrup = this.Zs.stream().filter(paramZefx::lambda$transform$1).findFirst().orElseThrow();
    return zrup.Zl(paramZefx, paramString1, paramString2, paramBoolean);
  }
  
  private static boolean lambda$transform$1(Zefx paramZefx, Zrup paramZrup) {
    return (paramZrup.Zp(paramZefx) != null);
  }
  
  private static Zrtu lambda$parse$0(Zefx paramZefx, Zrup paramZrup) {
    return paramZrup.Zp(paramZefx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */