package burp;

import burp.api.montoya.ui.editor.extension.EditorMode;
import java.util.function.Supplier;

class Zxt0 implements Zl8t {
  private final Supplier<Zmgv> ZY;
  
  private final Zgli Zr;
  
  private final Zeew Zm;
  
  private final boolean Zv;
  
  private final Zskl Zc;
  
  private final Zey9 Zi;
  
  public Zxt0(Supplier<Zmgv> paramSupplier, Zgli paramZgli, Zeew paramZeew, boolean paramBoolean, Zskl paramZskl, Zey9 paramZey9) {
    this.ZY = paramSupplier;
    this.Zr = paramZgli;
    this.Zm = paramZeew;
    this.Zv = paramBoolean;
    this.Zc = paramZskl;
    this.Zi = paramZey9;
  }
  
  public Zml7 ZN(Zoh paramZoh) {
    return new Zml7(this.ZY.get(), paramZoh, this.Zm, this.Zv, this.Zc, this.Zi);
  }
  
  public Zkvi Zy(Zgi0 paramZgi0) {
    return new Zkvi(this.ZY.get(), paramZgi0, this.Zm, this.Zv, this.Zc, this.Zi);
  }
  
  public Zt8o Zc(Zb2h paramZb2h) {
    return new Zt8o(paramZb2h, this.Zm, this.Zv ? EditorMode.DEFAULT : EditorMode.READ_ONLY, this.Zc, this.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxt0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */