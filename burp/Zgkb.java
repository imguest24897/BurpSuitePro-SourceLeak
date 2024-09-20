package burp;

import java.util.List;
import java.util.Objects;

class Zgkb {
  public static void Zm(List<Zgyy> paramList1, List<Zgyy> paramList2) {
    int i = Zev_.Zn();
    for (Zgyy zgyy : paramList2) {
      Objects.requireNonNull(zgyy);
      if (paramList1.stream().noneMatch(zgyy::Zu))
        paramList1.add(zgyy); 
      if (i == 0)
        break; 
    } 
  }
  
  private static boolean lambda$addAll$0(Zl_ paramZl_, Zrho paramZrho) {
    return paramZrho.ZE(paramZl_.Zf2().ZaG());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */