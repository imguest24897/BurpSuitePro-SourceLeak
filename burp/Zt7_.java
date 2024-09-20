package burp;

import com.formdev.flatlaf.extras.components.FlatTriStateCheckBox;
import java.awt.event.MouseEvent;

class Zt7_ implements Zky2 {
  final Zbg3 Zm;
  
  final Zmo5 Zs;
  
  final Zbwi ZA;
  
  Zt7_(Zbwi paramZbwi, Zbg3 paramZbg3, Zmo5 paramZmo5) {}
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 == Zb2j.ENABLED.Zp()) {
      FlatTriStateCheckBox.State state = this.Zm.ZC();
      this.ZA.Zp.ZE((state == FlatTriStateCheckBox.State.SELECTED));
      this.Zs.repaint();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */