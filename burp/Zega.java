package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Zega {
  private final Zsgs ZG;
  
  private final Zzcq<Zeo2> Zd;
  
  private final Zzcq<Zvo1> Z_;
  
  private final Zz1m<Zt13> ZX;
  
  private final List<Zb1o> ZH;
  
  private final AtomicInteger Zi;
  
  public Zega(Zsgs paramZsgs, Zzcq<Zeo2> paramZzcq, Zzcq<Zvo1> paramZzcq1, Zz1m<Zt13> paramZz1m) {
    this.ZG = paramZsgs;
    this.Zd = paramZzcq;
    this.Z_ = paramZzcq1;
    this.ZX = paramZz1m;
    this.ZH = new CopyOnWriteArrayList<>();
    boolean bool = Zsgs.Zb();
    byte b1 = (paramZzcq == null) ? 0 : paramZzcq.Zu();
    byte b2 = (paramZzcq1 == null) ? 0 : paramZzcq1.Zu();
    this.Zi = new AtomicInteger(b1 + b2);
    if (!bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public synchronized void ZH(Zeo2 paramZeo2) {
    this.Zd.ZY(paramZeo2);
    Zd();
  }
  
  public synchronized void ZM(Zvo1 paramZvo1) {
    this.Z_.ZY(paramZvo1);
    Zd();
  }
  
  synchronized Zvo9 Zh() {
    boolean bool = Zsgs.Zd();
    Zvo9 zvo9 = (this.Zd.Zu() > this.Z_.Zu()) ? this.ZG.ZG(this.Zd.Zs()) : this.ZG.ZK(this.Z_.Zs());
    if (zvo9 != null) {
      int i = this.Zi.decrementAndGet();
      Zj(i::lambda$poll$0);
    } 
    if (Zbqc.Zwu() == null)
      Zsgs.ZU(!bool); 
    return zvo9;
  }
  
  private void Zd() {
    int i = this.Zi.incrementAndGet();
    Zj(i::lambda$poll$0);
    Zo();
  }
  
  private void Zj(Consumer<Zb1o> paramConsumer) {
    this.ZH.forEach(paramConsumer);
  }
  
  private void Zo() {
    this.ZX.ZD(Zt13.Z_);
  }
  
  void ZQ() {
    Zj(this::lambda$updateListenersBasedOnPersistedData$2);
  }
  
  public void ZN(Zb1o paramZb1o) {
    this.ZH.add(paramZb1o);
  }
  
  private void lambda$updateListenersBasedOnPersistedData$2(Zb1o paramZb1o) {
    paramZb1o.ZJ(this.Zi.get());
  }
  
  private static void lambda$poll$0(int paramInt, Zb1o paramZb1o) {
    paramZb1o.ZJ(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zega.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */