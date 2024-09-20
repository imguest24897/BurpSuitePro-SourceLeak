package burp;

public class Zmla implements Zktl {
  private volatile int ZG;
  
  private volatile boolean Zl;
  
  private volatile boolean Zo;
  
  private volatile boolean Zc;
  
  public Zmla() {
    this(0, false, false, false);
  }
  
  private Zmla(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.ZG = paramInt;
    this.Zl = paramBoolean1;
    this.Zo = paramBoolean2;
    this.Zc = paramBoolean3;
  }
  
  public int ZP() {
    return this.ZG;
  }
  
  public boolean ZA() {
    return this.Zl;
  }
  
  public boolean Ze() {
    return this.Zo;
  }
  
  public boolean Z_() {
    return this.Zc;
  }
  
  public void ZL(int paramInt, boolean paramBoolean) {
    this.ZG = paramInt;
    this.Zl = !paramBoolean;
  }
  
  public void ZN(boolean paramBoolean) {
    this.Zo = !paramBoolean;
    this.Zc = paramBoolean;
  }
  
  public void Zy() {
    this.Zo = false;
    this.Zc = false;
  }
  
  public Zmla ZJ() {
    return new Zmla(this.ZG, this.Zl, this.Zo, this.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmla.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */