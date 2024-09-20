package burp;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import net.portswigger.Zm2;

public class Zm9z extends FocusAdapter {
  private final Zgf8 Zc;
  
  private final String ZF;
  
  private String Zt;
  
  public Zm9z(Zgf8 paramZgf8, String paramString) {
    this.Zc = paramZgf8;
    this.ZF = paramString;
    this.Zt = "";
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    String str = this.Zc.getText();
    if (!str.equals(this.Zt)) {
      Zm2.ZB(Zee4.TABLE_SEARCHED, this.ZF);
      this.Zt = str;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */