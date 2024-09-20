package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zl4y {
  private final Supplier<Zes1> Zr;
  
  private final Consumer<Ze05> Zw;
  
  private final Map<Integer, Ze05> ZM;
  
  public Zl4y(Supplier<Zes1> paramSupplier, Consumer<Ze05> paramConsumer) {
    this.Zr = paramSupplier;
    this.Zw = paramConsumer;
    this.ZM = new HashMap<>();
  }
  
  public Ze05 Zc(int paramInt, Zmi paramZmi) {
    Ze05 ze05 = new Ze05(this.Zr, paramZmi);
    this.ZM.put(Integer.valueOf(paramInt), ze05);
    return ze05;
  }
  
  public void Za(int paramInt) {
    Ze05 ze05 = this.ZM.remove(Integer.valueOf(paramInt));
    if (ze05 != null)
      this.Zw.accept(ze05); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */