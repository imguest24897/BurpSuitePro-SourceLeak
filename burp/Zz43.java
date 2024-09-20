package burp;

import java.util.function.Supplier;

final class Zz43 implements Zzc2 {
  private final Supplier<Zlte> Zv;
  
  final Zbqr Zi;
  
  private Zz43(Zbqr paramZbqr, Supplier<Zlte> paramSupplier) {
    this.Zv = paramSupplier;
  }
  
  public void ZB(int paramInt) {
    Zlte zlte = this.Zv.get();
    if (zlte.getTabCount() <= 1)
      this.Zi.ZJ(); 
  }
  
  public void ZW(int paramInt, Zmkb paramZmkb) {
    this.Zi.ZR();
  }
  
  public void Zk(int paramInt1, int paramInt2) {}
  
  public void ZP(Zlte paramZlte, int paramInt1, int paramInt2, Zr6e paramZr6e) {}
  
  public void Zw(int paramInt) {}
  
  public void Zv(int paramInt, String paramString) {}
  
  public void Zn(Ztal paramZtal) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz43.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */