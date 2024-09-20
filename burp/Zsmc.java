package burp;

public class Zsmc implements Ztoy {
  private final Zmwh ZM;
  
  private boolean Ze;
  
  private boolean ZI;
  
  public Zsmc(Zmwh paramZmwh, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZM = paramZmwh;
    this.Ze = paramBoolean1;
    this.ZI = paramBoolean2;
  }
  
  public Zmwh ZF() {
    return this.ZM;
  }
  
  public boolean ZZ() {
    return (!ZX() || this.Ze);
  }
  
  public boolean ZX() {
    return this.ZM.isHideable;
  }
  
  public void Zj(boolean paramBoolean) {
    if (ZX())
      this.Ze = paramBoolean; 
  }
  
  public boolean Zc() {
    return (ZW() && this.ZI);
  }
  
  public boolean ZW() {
    return this.ZM.isWrappable;
  }
  
  public void Zt(boolean paramBoolean) {
    if (ZW())
      this.ZI = paramBoolean; 
  }
  
  public void ZM() {
    Zj(!ZZ());
  }
  
  public void Zo() {
    Zt(!Zc());
  }
  
  public Zsmc Zf() {
    return new Zsmc(this.ZM, this.Ze, this.ZI);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */