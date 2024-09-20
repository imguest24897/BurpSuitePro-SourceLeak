package burp;

public class Ztjo implements Ztoy {
  private final Zzbe ZZ;
  
  private boolean Zv;
  
  private boolean Zs;
  
  public Ztjo(Zzbe paramZzbe, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZZ = paramZzbe;
    this.Zv = paramBoolean1;
    this.Zs = paramBoolean2;
  }
  
  public Zzbe ZD() {
    return this.ZZ;
  }
  
  public boolean ZZ() {
    return (!ZT() || this.Zv);
  }
  
  public boolean ZT() {
    return this.ZZ.isHideable;
  }
  
  public void Zj(boolean paramBoolean) {
    if (ZT())
      this.Zv = paramBoolean; 
  }
  
  public boolean Zc() {
    return (Zr() && this.Zs);
  }
  
  public boolean Zr() {
    return this.ZZ.isWrappable;
  }
  
  public void Zt(boolean paramBoolean) {
    if (Zr())
      this.Zs = paramBoolean; 
  }
  
  public void ZY() {
    Zj(!ZZ());
  }
  
  public void Z_() {
    Zt(!Zc());
  }
  
  public Ztjo Zf() {
    return new Ztjo(this.ZZ, this.Zv, this.Zs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */