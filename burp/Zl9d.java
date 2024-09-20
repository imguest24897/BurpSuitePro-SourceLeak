package burp;

import java.util.function.BooleanSupplier;

class Zl9d extends Zl9l {
  final BooleanSupplier ZX;
  
  final Zgd ZF;
  
  Zl9d(Zgd paramZgd, BooleanSupplier paramBooleanSupplier) {}
  
  protected boolean ZF(Zez3 paramZez3) {
    if (this.ZX.getAsBoolean())
      return true; 
    if (this.ZF.ZW.Za(paramZez3))
      return false; 
    if (this.ZF.ZW.Zj(paramZez3, this.ZF))
      return false; 
    if (paramZez3.ZkP() > 0)
      this.ZF.Zv(paramZez3, this.ZX); 
    this.ZF.ZW.Zh(paramZez3, this.ZF);
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */