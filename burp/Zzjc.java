package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Zzjc {
  private final AtomicReference<Zg9e> ZE = new AtomicReference<>(Zg9e.Zm);
  
  private final List<Zsgq> Zn = new CopyOnWriteArrayList<>();
  
  public void Zb(Zsgq paramZsgq) {
    this.Zn.add(paramZsgq);
    ((Zg9e)this.ZE.get()).Zn();
  }
  
  public void Zr(int paramInt, Zsgq paramZsgq) {
    this.Zn.set(paramInt, paramZsgq);
  }
  
  public List<Zsgq> ZK() {
    return this.Zn;
  }
  
  public List<Zsgq> ZE() {
    return this.Zn.stream().filter(Zsgq::Zk).toList();
  }
  
  public Zsgq ZK(int paramInt) {
    return this.Zn.get(paramInt);
  }
  
  public void ZP(int paramInt) {
    this.Zn.remove(paramInt);
    ((Zg9e)this.ZE.get()).ZI();
  }
  
  public int Zu() {
    return this.Zn.size();
  }
  
  public void ZB(Zg9e paramZg9e) {
    this.ZE.set(paramZg9e);
  }
  
  public void ZX() {
    this.ZE.set(Zg9e.Zm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */