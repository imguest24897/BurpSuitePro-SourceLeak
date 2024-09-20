package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Zbi implements Zky2 {
  private final IntConsumer Ze;
  
  private final Zt2_ ZH;
  
  private final Supplier<List<Zryx>> ZZ;
  
  Zbi(IntConsumer paramIntConsumer, Zt2_ paramZt2_, Supplier<List<Zryx>> paramSupplier) {
    this.Ze = paramIntConsumer;
    this.ZH = paramZt2_;
    this.ZZ = paramSupplier;
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    if (((List)this.ZZ.get()).isEmpty())
      return; 
    boolean bool1 = ((List)this.ZZ.get()).stream().filter(Zmo3::Zb).anyMatch(Predicate.not(Zryx::ZT));
    boolean bool2 = ((List)this.ZZ.get()).stream().anyMatch(Zryx::ZT);
    boolean bool = (((List)this.ZZ.get()).size() <= 1) ? true : false;
    Zkjq zkjq = new Zkjq(this.ZH, bool1, bool2, bool);
    zkjq.show(paramComponent, paramPoint.x, paramPoint.y);
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 == Zt5z.ENABLED.ZM)
      this.Ze.accept(paramInt1); 
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    this.ZH.ZI(140800, paramMouseEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */