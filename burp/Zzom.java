package burp;

import java.time.Duration;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public abstract class Zzom {
  private final Zgna Zv;
  
  private final Zx0k ZS;
  
  protected Zzom(Zgna paramZgna, Zx0k paramZx0k) {
    this.Zv = paramZgna;
    this.ZS = paramZx0k;
  }
  
  public final void Zh(int paramInt) {
    this.ZS.Zz(paramInt);
  }
  
  public final Zxp4 Zb() {
    int i = ZI();
    Optional<Duration> optional1 = Zu(i);
    List<Duration> list = Zi();
    Optional<Duration> optional2 = Zd(list);
    return optional1.isEmpty() ? optional2.<Zxp4>map(Zxp4::ZP).orElseGet(Zxp4::ZP) : ((optional2.isPresent() && ((Duration)optional2.get()).compareTo(optional1.get()) < 0) ? Zxp4.ZP(optional2.get()) : Zxp4.Zw(optional1.get()));
  }
  
  protected abstract int ZI();
  
  protected abstract List<Duration> Zi();
  
  private Optional<Duration> Zu(int paramInt) {
    return this.ZS.Z_().filter(Zzom::lambda$getEstimatedRemainingTime$0).map(paramInt::lambda$getEstimatedRemainingTime$1);
  }
  
  private Optional<Duration> Zd(Collection<Duration> paramCollection) {
    LinkedList<Duration> linkedList = new LinkedList<>(paramCollection);
    if (this.Zv.ZPf().isPresent())
      linkedList.add(this.Zv.ZPf().get()); 
    Optional<Duration> optional = linkedList.stream().min(Duration::compareTo);
    if (optional.isEmpty())
      return Optional.empty(); 
    Duration duration1 = this.Zv.ZPB();
    Duration duration2 = ((Duration)optional.get()).minus(duration1);
    return Optional.of(duration2);
  }
  
  private static Duration lambda$getEstimatedRemainingTime$1(int paramInt, Double paramDouble) {
    return Duration.ofSeconds((long)(paramInt / paramDouble.doubleValue()));
  }
  
  private static boolean lambda$getEstimatedRemainingTime$0(Double paramDouble) {
    return (paramDouble.doubleValue() > 0.0D);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzom.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */