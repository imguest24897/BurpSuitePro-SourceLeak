package burp;

import java.util.concurrent.atomic.AtomicReference;

class Zg8h implements Zg0z {
  private final AtomicReference<Zvb> Zm = new AtomicReference<>();
  
  public void ZZ(Zvb paramZvb) {
    this.Zm.set(paramZvb);
  }
  
  public Zvb ZK() {
    return this.Zm.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */