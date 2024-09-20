package burp;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class Zm9h extends Zm99 {
  private final Zlkk ZP = Zlkk.ANCHOR_FOREGROUND;
  
  private final Zlkk Zk = Zlkk.ANCHOR_HOVER_FOREGROUND;
  
  private MouseAdapter Zn;
  
  private boolean Zd;
  
  private boolean Zw;
  
  public void Zf(String paramString, Consumer<MouseEvent> paramConsumer) {
    setText(paramString);
    setFocusable(false);
    setToolTipText(paramString);
    ZE(Zt00.UNDERLINE_FONT);
    setCursor(Cursor.getPredefinedCursor(12));
    ZD();
    if (this.Zn != null)
      removeMouseListener(this.Zn); 
    this.Zn = new Zkhu(this, paramConsumer);
    addMouseListener(this.Zn);
    this.Zw = true;
  }
  
  private void ZD() {
    if (isEnabled())
      Ze(this.Zd ? this.Zk : this.ZP); 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zw)
      ZD(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */