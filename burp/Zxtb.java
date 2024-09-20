package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Zxtb extends Zxtv {
  private final AtomicReference<Ze45> ZQ;
  
  private final AtomicReference<Zly6> Zg;
  
  private Zxtb(boolean paramBoolean, Ze45 paramZe45, Zly6 paramZly6) {
    super(paramBoolean);
    this.ZQ = new AtomicReference<>(paramZe45);
    this.Zg = new AtomicReference<>(paramZly6);
  }
  
  void Zx(Ze45 paramZe45) {
    this.ZQ.set(paramZe45);
  }
  
  void Zb(Zly6 paramZly6) {
    this.Zg.set(paramZly6);
  }
  
  public Ze45 Zy() {
    return this.ZQ.get();
  }
  
  public Zly6 ZL() {
    return this.Zg.get();
  }
  
  public static Zxtb ZV(Zxtv paramZxtv) {
    return new Zxtb(paramZxtv.ZU(), paramZxtv.Zy(), paramZxtv.ZL());
  }
  
  public static Zxtb Zk(Zxtv paramZxtv, Zly6 paramZly6) {
    return new Zxtb(paramZxtv.ZU(), paramZxtv.Zy(), paramZly6);
  }
  
  public static Zxtb ZX(Zxtv paramZxtv, Ze45 paramZe45) {
    return new Zxtb(paramZxtv.ZU(), paramZe45, paramZxtv.ZL());
  }
  
  public static Zxtb Zk(Zxtv paramZxtv, Zl7q paramZl7q) {
    Zz7t zz7t = new Zz7t(paramZxtv, paramZl7q);
    return new Zxtb(paramZxtv.ZU(), paramZxtv.Zy(), zz7t);
  }
  
  public static Zxtb Zd(Zxtv paramZxtv, Ze45 paramZe45, Zl7q paramZl7q) {
    Zz7t zz7t = new Zz7t(paramZxtv, paramZl7q);
    return new Zxtb(paramZxtv.ZU(), paramZe45, zz7t);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxtb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */