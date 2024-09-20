package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class Zvf8 {
  private final Lock ZR;
  
  private final Zx5d Zi;
  
  private final Ze97 Zw;
  
  private final Zxgk ZI;
  
  private final AtomicBoolean ZK;
  
  private final AtomicBoolean ZT;
  
  private final AtomicBoolean Zk;
  
  public Zvf8(Zx5d paramZx5d, Ze97 paramZe97, Lock paramLock, Zlli<Zt13> paramZlli, Zxgk paramZxgk) {
    this.Zi = paramZx5d;
    this.Zw = paramZe97;
    this.ZR = paramLock;
    this.ZI = paramZxgk;
    this.ZK = new AtomicBoolean();
    this.Zk = new AtomicBoolean();
    this.ZT = new AtomicBoolean();
    paramZlli.ZE(Zt13.Zd, this::lambda$new$0);
    paramZlli.ZE(Zt13.ZC, this::lambda$new$1);
    paramZlli.ZE(Zt13.ZV, this::lambda$new$3);
  }
  
  public Zk9r Zw(boolean paramBoolean) {
    this.ZR.lock();
    try {
      boolean bool1 = false;
      if (this.ZI.ZF()) {
        this.ZI.ZJ();
        bool1 = true;
      } 
      boolean bool2 = ((paramBoolean && this.Zi.Zd()) || this.Zk.get() || this.ZK.get() || this.ZT.get() || bool1 || Thread.currentThread().isInterrupted()) ? true : false;
      Zk9r zk9r = bool2 ? null : this.Zw.ZN();
      if (zk9r == null)
        this.Zi.Zj(); 
      return zk9r;
    } finally {
      this.ZR.unlock();
    } 
  }
  
  public void Z_() {
    this.ZT.set(true);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$2);
  }
  
  private void lambda$new$2(Ztak paramZtak) {
    if (paramZtak.ZO())
      this.Zk.set(false); 
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    this.Zk.set(true);
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    this.ZK.set(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */