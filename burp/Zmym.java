package burp;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Zmym {
  private final Zzc4 ZH;
  
  private final Ze97 Za;
  
  private final Zzzv Z_;
  
  private final Zswj Zm;
  
  private final AtomicInteger ZR = new AtomicInteger();
  
  private final Zsg7 ZI = new Zsg7(this);
  
  private final Zsbq Zk = new Zsbq(this);
  
  public Zmym(Zzc4 paramZzc4, Ze97 paramZe97, Zzzv paramZzzv, Zswj paramZswj) {
    String[] arrayOfString = Zlku.ZH();
    this.ZH = paramZzc4;
    this.Za = paramZe97;
    this.Z_ = paramZzzv;
    this.Zm = paramZswj;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public final void ZF() {
    Zy();
  }
  
  private void Zy() {
    ZL(this.ZH.Z_());
  }
  
  private void ZL(Zm6s<? extends Zmgr> paramZm6s) {
    if (paramZm6s == null || paramZm6s.ZJ())
      return; 
    this.ZR.getAndAdd(paramZm6s.ZF());
    this.Z_.Zq((Collection<Zlku>)paramZm6s.Za().stream().map(this::lambda$queuePassiveItems$0).collect(Collectors.toSet()));
    this.Z_.ZN();
  }
  
  private void ZI(Zmgr paramZmgr) {
    this.ZR.incrementAndGet();
    this.Z_.ZN(this.Zm.ZH(paramZmgr, this::ZY, this.ZI));
    this.Z_.ZN();
  }
  
  private void Zf(Zmgr paramZmgr) {
    this.ZR.incrementAndGet();
    this.Za.ZR(this.Zm.Zh(paramZmgr, this::ZY, this.Zk));
  }
  
  private void ZE(Zz09 paramZz09) {
    this.ZR.incrementAndGet();
    this.Za.Z_(this.Zm.Zz(paramZz09, this::ZY, this.Zk));
  }
  
  private void ZY() {
    if (this.ZR.decrementAndGet() == 0)
      Zy(); 
  }
  
  private Zlku lambda$queuePassiveItems$0(Zmgr paramZmgr) {
    return this.Zm.ZH(paramZmgr, this::ZY, this.ZI);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmym.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */