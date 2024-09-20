package burp;

import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class Zm5b extends FocusAdapter {
  final Zl5i Zl;
  
  Zm5b(Zl5i paramZl5i) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    this.Zl.ZI.getCaret().setVisible(true);
    this.Zl.ZI.setCursor(Cursor.getPredefinedCursor(2));
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    this.Zl.ZI.getCaret().setVisible(false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */