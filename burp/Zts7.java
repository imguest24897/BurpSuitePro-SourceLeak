package burp;

import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class Zts7 {
  private static Zbqc[] Zi;
  
  @NotNull
  static Optional<Zgxp> Zk(int paramInt, Collection<Zgxp> paramCollection) {
    return (paramCollection == null) ? Optional.empty() : paramCollection.stream().filter(paramInt::lambda$getResultItem$0).findFirst();
  }
  
  static int Zn(Zefg<Zgxp> paramZefg) {
    return (paramZefg == null) ? 0 : paramZefg.size();
  }
  
  static Zgxp Zf(Zefg<Zgxp> paramZefg) {
    return (paramZefg == null || paramZefg.isEmpty()) ? null : paramZefg.get(paramZefg.size() - 1);
  }
  
  static boolean Zt(Zkgn paramZkgn, Object paramObject) {
    if (Zewd.ZI(paramZkgn, (Zgpi)paramObject))
      return true; 
    if (paramObject == null || paramZkgn.getClass() != paramObject.getClass())
      return false; 
    Zkgn zkgn = (Zkgn)paramObject;
    return paramZkgn.ZvQ().equals(zkgn.ZvQ());
  }
  
  private static boolean lambda$getResultItem$0(int paramInt, Zgxp paramZgxp) {
    return (paramZgxp.Zep() == paramInt);
  }
  
  public static void Zw(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZB() {
    return Zi;
  }
  
  static {
    if (ZB() != null)
      Zw(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zts7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */