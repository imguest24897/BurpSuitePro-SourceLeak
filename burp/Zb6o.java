package burp;

import java.util.concurrent.atomic.AtomicReference;

class Zb6o implements Zzgp {
  final AtomicReference ZQ;
  
  Zb6o(Zqf paramZqf, AtomicReference paramAtomicReference) {}
  
  public void ZT(int paramInt) {
    this.ZQ.set(Zb84.SHIFT);
  }
  
  public void ZR(int paramInt) {
    this.ZQ.set(Zb84.REDUCE);
  }
  
  public void Zh(int paramInt) {
    this.ZQ.set(Zb84.GO);
  }
  
  public void Zf() {
    this.ZQ.set(Zb84.ACCEPT);
  }
  
  public void Ze() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */