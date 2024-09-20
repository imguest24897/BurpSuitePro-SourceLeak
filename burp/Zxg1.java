package burp;

import java.awt.FontMetrics;
import java.awt.event.MouseEvent;

class Zxg1 implements Zefy {
  private final Zm7b ZS;
  
  public Zxg1(Zm7b paramZm7b) {
    this.ZS = paramZm7b;
  }
  
  public String ZD(Zmgw paramZmgw, MouseEvent paramMouseEvent) {
    FontMetrics fontMetrics = paramZmgw.getFontMetrics(paramZmgw.getFont());
    int i = fontMetrics.charWidth('X');
    int j = i / 2;
    MouseEvent mouseEvent = new MouseEvent(paramMouseEvent.getComponent(), paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiersEx(), paramMouseEvent.getX() - j, paramMouseEvent.getY(), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
    int k = paramZmgw.viewToModel2D(mouseEvent.getPoint());
    String str = this.ZS.Zl(k);
    int[] arrayOfInt = Zs4l.Zz();
    if (str != null && str.length() > 80)
      return Zsw8.ZY(str, 80, ' '); 
    if (Zbqc.Zwu() == null)
      Zs4l.Z_(new int[5]); 
    return str;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxg1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */