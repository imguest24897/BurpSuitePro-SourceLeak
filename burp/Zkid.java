package burp;

import java.util.List;

public class Zkid {
  private final List<Zrup> Zq = List.of(new Zmwd(), new Zrz4(), new Zea1());
  
  public boolean Zz(Zefx paramZefx) {
    if (paramZefx == null || paramZefx.Zh())
      return false; 
    String str = paramZefx.Zr();
    return (str == null) ? false : this.Zq.stream().anyMatch(paramZefx::lambda$containsGraphQL$0);
  }
  
  private static boolean lambda$containsGraphQL$0(Zefx paramZefx, Zrup paramZrup) {
    return (paramZrup.Zp(paramZefx) != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkid.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */