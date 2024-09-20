package burp;

import java.util.concurrent.atomic.AtomicBoolean;

public class Zl2u implements Zgzx {
  private final Zgzx Zl;
  
  private final AtomicBoolean ZY;
  
  private Zl2u(Zgzx paramZgzx) {
    this(paramZgzx, false);
  }
  
  private Zl2u(Zgzx paramZgzx, boolean paramBoolean) {
    this.Zl = paramZgzx;
    this.ZY = new AtomicBoolean(paramBoolean);
  }
  
  public static Zl2u Zv(Zgzx paramZgzx) {
    return new Zl2u(paramZgzx);
  }
  
  public static Zl2u Zs(Zgzx paramZgzx) {
    return new Zl2u(paramZgzx, true);
  }
  
  public boolean Zi() {
    return this.Zl.Zi();
  }
  
  public boolean ZT() {
    return this.Zl.ZT();
  }
  
  public boolean ZL() {
    return (!this.ZY.get() && this.Zl.ZL());
  }
  
  public boolean ZW() {
    return (!this.ZY.get() && this.Zl.ZW());
  }
  
  public boolean ZX() {
    return (!this.ZY.get() && this.Zl.ZX());
  }
  
  public String ZE() {
    return this.ZY.get() ? null : this.Zl.ZE();
  }
  
  public void Zh() {
    this.ZY.set(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */