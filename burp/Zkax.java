package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.Optional;
import javax.swing.Icon;
import javax.swing.Timer;

public class Zkax extends Zkaz {
  private final Runnable Zi;
  
  public Zkax(Icon paramIcon, Runnable paramRunnable) {
    super(paramIcon, 10, 2.0F);
    this.Zi = paramRunnable;
  }
  
  public void Zd() {
    Optional.<Timer>ofNullable(this.ZL).ifPresent(Timer::stop);
    this.ZL = null;
  }
  
  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.ZL == null) {
      this.ZL = new Timer(this.ZA, this::lambda$paintIcon$0);
      this.ZL.start();
    } 
    Graphics2D graphics2D = null;
    try {
      graphics2D = ZK(paramGraphics, paramInt1, paramInt2);
      this.Zw.paintIcon(paramComponent, graphics2D, paramInt1, paramInt2);
    } finally {
      if (graphics2D != null)
        graphics2D.dispose(); 
    } 
  }
  
  private void lambda$paintIcon$0(ActionEvent paramActionEvent) {
    this.ZU += this.ZT;
    if (Float.compare(this.ZU, 6.2831855F) >= 0)
      this.ZU -= 6.2831855F; 
    this.Zi.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkax.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */