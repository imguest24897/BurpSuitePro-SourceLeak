package burp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

class Zb4r {
  private final Zskh ZY;
  
  private final Deque<Zto7> Zz;
  
  private final Object ZX;
  
  private final AtomicBoolean Zn;
  
  private final AtomicBoolean Zr;
  
  private final List<Zlkw> Zd;
  
  private long Zc;
  
  private long Zk;
  
  public Zb4r(Zskh paramZskh, long paramLong) {
    this.ZY = paramZskh;
    this.Zc = paramLong;
    this.Zz = new ArrayDeque<>();
    this.ZX = new Object();
    this.Zn = new AtomicBoolean();
    this.Zr = new AtomicBoolean();
    this.Zd = new CopyOnWriteArrayList<>();
  }
  
  public void ZM(Zto7 paramZto7) {
    synchronized (this.ZX) {
      if (this.Zr.get())
        return; 
      long l = paramZto7.ZEP();
      if (l > this.Zc) {
        Zmgc.LOGGER_ENTRY_SIZE_EXCEEDED.ZK(this.ZY, new Object[0]);
        return;
      } 
      this.Zk += l;
      ZQ();
      this.Zz.addLast(paramZto7);
      this.Zd.forEach(paramZto7::lambda$add$0);
    } 
  }
  
  public void ZM(long paramLong) {
    if (paramLong == this.Zc)
      return; 
    synchronized (this.ZX) {
      this.Zc = paramLong;
      ZQ();
      this.Zn.set(false);
    } 
  }
  
  void Zo(Zlkw paramZlkw) {
    this.Zd.add(paramZlkw);
  }
  
  void ZY() {
    synchronized (this.ZX) {
      int i = this.Zz.size();
      this.Zz.clear();
      this.Zk = 0L;
      this.Zd.forEach(i::lambda$clear$1);
    } 
  }
  
  void ZT() {
    this.Zr.set(true);
    synchronized (this.ZX) {
      this.Zd.clear();
      this.Zz.clear();
    } 
  }
  
  void ZC() {
    synchronized (this.ZX) {
      if (!this.Zr.get())
        this.Zd.forEach(this::lambda$flush$2); 
    } 
  }
  
  private void ZQ() {
    int[] arrayOfInt = Ze5j.ZP9();
    while (this.Zk > this.Zc) {
      Zto7 zto7 = this.Zz.removeFirst();
      this.Zk -= zto7.ZEP();
      this.Zd.forEach(zto7::lambda$shrinkToSizeBound$3);
      if (this.Zn.compareAndSet(false, true))
        Zmgc.LOGGER_ENTRY_SIZE_EXCEEDED.ZK(this.ZY, new Object[0]); 
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private static void lambda$shrinkToSizeBound$3(Zto7 paramZto7, Zlkw paramZlkw) {
    paramZlkw.Zg(paramZto7);
  }
  
  private void lambda$flush$2(Zlkw paramZlkw) {
    Objects.requireNonNull(paramZlkw);
    this.Zz.forEach(paramZlkw::Zp);
  }
  
  private static void lambda$clear$1(int paramInt, Zlkw paramZlkw) {
    paramZlkw.Zd(paramInt);
  }
  
  private static void lambda$add$0(Zto7 paramZto7, Zlkw paramZlkw) {
    paramZlkw.Zp(paramZto7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */