package burp;

import java.awt.event.MouseEvent;
import java.util.function.BiFunction;

public class Zt7y implements Zky2 {
  private final Ztne ZP;
  
  private final BiFunction<Integer, Integer, Boolean> ZX;
  
  private final Zmo5 Zl;
  
  private final Runnable Zz;
  
  public Zt7y(Ztne paramZtne, BiFunction<Integer, Integer, Boolean> paramBiFunction, Zmo5 paramZmo5, Runnable paramRunnable) {
    this.ZP = paramZtne;
    this.ZX = paramBiFunction;
    this.Zl = paramZmo5;
    this.Zz = paramRunnable;
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (((Boolean)this.ZX.apply(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2))).booleanValue()) {
      this.Zl.repaint();
      this.ZP.fireTableRowsUpdated(paramInt1, paramInt1);
      this.Zz.run();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */