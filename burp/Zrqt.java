package burp;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.event.ChangeListener;
import javax.swing.text.Caret;
import javax.swing.text.JTextComponent;

public class Zrqt implements Caret {
  public void install(JTextComponent paramJTextComponent) {}
  
  public void deinstall(JTextComponent paramJTextComponent) {}
  
  public void paint(Graphics paramGraphics) {}
  
  public void addChangeListener(ChangeListener paramChangeListener) {}
  
  public void removeChangeListener(ChangeListener paramChangeListener) {}
  
  public boolean isVisible() {
    return false;
  }
  
  public void setVisible(boolean paramBoolean) {}
  
  public boolean isSelectionVisible() {
    return false;
  }
  
  public void setSelectionVisible(boolean paramBoolean) {}
  
  public void setMagicCaretPosition(Point paramPoint) {}
  
  public Point getMagicCaretPosition() {
    return new Point(0, 0);
  }
  
  public void setBlinkRate(int paramInt) {}
  
  public int getBlinkRate() {
    return 0;
  }
  
  public int getDot() {
    return 0;
  }
  
  public int getMark() {
    return 0;
  }
  
  public void setDot(int paramInt) {}
  
  public void moveDot(int paramInt) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */