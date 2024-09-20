package burp;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zzzv {
  private final Zrbm ZZ;
  
  private final Queue<Zlku> Zq;
  
  private final Ze97 ZP;
  
  private final Zz1m<Zt13> ZY;
  
  private final Zswj ZA;
  
  private final AtomicBoolean Zk;
  
  public Zzzv(Zrbm paramZrbm, Ze97 paramZe97, Zz1m<Zt13> paramZz1m, Zswj paramZswj) {
    this.ZZ = paramZrbm;
    this.ZP = paramZe97;
    this.ZY = paramZz1m;
    this.ZA = paramZswj;
    this.Zq = new ConcurrentLinkedQueue<>();
    this.Zk = new AtomicBoolean();
  }
  
  public void ZN(Zlku paramZlku) {
    this.Zq.add(paramZlku);
  }
  
  public void Zq(Collection<Zlku> paramCollection) {
    this.Zq.addAll(paramCollection);
  }
  
  public void ZN() {
    if (!this.Zq.isEmpty())
      this.ZY.ZD(Zt13.Z_); 
  }
  
  public Zlku Zp() {
    if (this.Zq.isEmpty())
      ZM(); 
    return this.Zq.poll();
  }
  
  private void ZM() {
    if (this.Zk.compareAndSet(false, true)) {
      if (this.Zq.isEmpty()) {
        Zzc4 zzc4 = this.ZZ.Zs();
        if (zzc4 != null)
          (new Zmym(zzc4, this.ZP, this, this.ZA)).ZF(); 
      } 
      this.Zk.set(false);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */