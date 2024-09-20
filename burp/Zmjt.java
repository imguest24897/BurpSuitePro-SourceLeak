package burp;

import java.awt.Graphics;
import javax.swing.text.DefaultCaret;

public class Zmjt extends DefaultCaret {
  private static String Zb;
  
  public Zmjt() {
    String str = Zm();
    setBlinkRate(0);
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void paint(Graphics paramGraphics) {}
  
  public static void Za(String paramString) {
    Zb = paramString;
  }
  
  public static String Zm() {
    return Zb;
  }
  
  static {
    if (Zm() == null)
      Za("Sz32m"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */