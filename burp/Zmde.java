package burp;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class Zmde implements Zsni, Zbq6 {
  private final Zrby ZX;
  
  private Zmde(int paramInt, Consumer<Integer> paramConsumer) {
    this.ZX = new Zrby(paramInt, paramConsumer);
  }
  
  public void ZL(List<Zzem> paramList) {
    this.ZX.Zu(paramList.size());
  }
  
  public void ZD() {
    this.ZX.Zy(1);
  }
  
  public void ZX(int paramInt) {
    this.ZX.Zy(paramInt);
  }
  
  public static Zmde Zq(Zg94 paramZg94, Consumer<Integer> paramConsumer) {
    long l = paramZg94.ZI().stream().map(Zmx::Zp).flatMap(Collection::stream).filter(Zzem::Zi).count();
    return new Zmde((int)l, paramConsumer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmde.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */