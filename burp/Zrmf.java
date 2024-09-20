package burp;

import java.util.concurrent.locks.Lock;

public class Zrmf {
  private final Zr_h Zc;
  
  private final Lock ZD;
  
  private final Zx5d ZR;
  
  Zrmf(Zr_h paramZr_h, Lock paramLock, Zx5d paramZx5d) {
    this.Zc = paramZr_h;
    this.ZD = paramLock;
    this.ZR = paramZx5d;
  }
  
  void ZO(Zlli<Zt13> paramZlli) {
    paramZlli.ZE(Zt13.ZZ, this::lambda$subscribeTo$0);
    paramZlli.ZE(Zt13.Ze, this::lambda$subscribeTo$1);
  }
  
  private void Zf() {
    this.Zc.ZI();
  }
  
  private void ZD() {
    this.ZD.lock();
    try {
      this.ZR.Zw();
    } finally {
      this.ZD.unlock();
    } 
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    ZD();
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    Zf();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */