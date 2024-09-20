package burp;

import java.awt.GridLayout;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb54 extends Zbqc {
  private final Supplier<Ztm0> ZG;
  
  private final Ze0e ZE;
  
  private final Ze0e Zs;
  
  Zb54(Supplier<Ztm0> paramSupplier) {
    this.ZG = paramSupplier;
    this.ZE = new Ze0e(Zrkp.PREVIOUS, this::lambda$new$0, paramSupplier::lambda$new$1);
    this.Zs = new Ze0e(Zrkp.NEXT, this::lambda$new$2, paramSupplier::lambda$new$3);
    GridLayout gridLayout = new GridLayout(0, 2);
    gridLayout.setHgap(5);
    setLayout(gridLayout);
    add(this.ZE);
    add(this.Zs);
  }
  
  void Zp() {
    Ztm0 ztm0 = this.ZG.get();
    this.ZE.setEnabled(ztm0.Zx());
    this.Zs.setEnabled(ztm0.ZV());
  }
  
  public void setEnabled(boolean paramBoolean) {
    int[] arrayOfInt = Zzg5.Zr();
    super.setEnabled(paramBoolean);
    if (!paramBoolean) {
      this.ZE.setEnabled(false);
      this.Zs.setEnabled(false);
      if (arrayOfInt != null) {
        Zp();
        return;
      } 
      return;
    } 
    Zp();
  }
  
  private void ZM(Zrkp paramZrkp) {
    Ztm0 ztm0 = this.ZG.get();
    Zkj9 zkj9 = new Zkj9();
    int[] arrayOfInt = Zzg5.Zr();
    List<String> list = (paramZrkp == Zrkp.PREVIOUS) ? ztm0.Zh() : ztm0.ZF();
    Zuh.Zb(!list.isEmpty(), Zqf.Zr);
    byte b = 0;
    while (b < list.size()) {
      zkj9.add(new Zepd(ztm0, list.get(b), (paramZrkp == Zrkp.PREVIOUS), b + 1));
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    Ze0e ze0e = (paramZrkp == Zrkp.PREVIOUS) ? this.ZE : this.Zs;
    zkj9.show(ze0e, 0, ze0e.getHeight());
  }
  
  private static void lambda$new$3(Supplier<Ztm0> paramSupplier) {
    ((Ztm0)paramSupplier.get()).ZW();
  }
  
  private void lambda$new$2() {
    ZM(Zrkp.NEXT);
  }
  
  private static void lambda$new$1(Supplier<Ztm0> paramSupplier) {
    ((Ztm0)paramSupplier.get()).Zz();
  }
  
  private void lambda$new$0() {
    ZM(Zrkp.PREVIOUS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb54.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */