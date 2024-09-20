package burp;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.event.CaretEvent;

public class Zr8v extends CaretEvent implements MouseListener, MouseMotionListener, FocusListener {
  protected int Zy;
  
  protected int ZW;
  
  Zr8v(Zmgw paramZmgw) {
    super(paramZmgw);
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {}
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public int getDot() {
    return this.Zy;
  }
  
  public int getMark() {
    return this.ZW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */