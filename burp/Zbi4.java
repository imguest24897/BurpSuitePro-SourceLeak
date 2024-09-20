package burp;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.function.Supplier;

class Zbi4 implements ItemListener {
  private final Zxec Zo;
  
  private final Ztiu ZQ;
  
  private final Supplier<Boolean> Zy;
  
  private final Zgx8 ZO;
  
  private Zbi4(Zxec paramZxec, Ztiu paramZtiu, Supplier<Boolean> paramSupplier, Zgx8 paramZgx8) {
    this.Zo = paramZxec;
    this.ZQ = paramZtiu;
    this.Zy = paramSupplier;
    this.ZO = paramZgx8;
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      this.ZQ.ZH(this.Zo.option);
      if (((Boolean)this.Zy.get()).booleanValue())
        this.ZO.ZU(this.Zo.option); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbi4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */