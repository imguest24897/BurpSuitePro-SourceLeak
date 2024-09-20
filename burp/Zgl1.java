package burp;

import java.awt.Graphics2D;
import javax.swing.text.TabExpander;

public class Zgl1 {
  private final Zep3 Zc;
  
  private final Graphics2D ZL;
  
  private final TabExpander Zw;
  
  private static int[] ZJ;
  
  private Zgl1(Zep3 paramZep3, Graphics2D paramGraphics2D, TabExpander paramTabExpander) {
    this.Zc = paramZep3;
    this.ZL = paramGraphics2D;
    this.Zw = paramTabExpander;
  }
  
  public static Zgl1 Zk(Zep3 paramZep3, Graphics2D paramGraphics2D, TabExpander paramTabExpander) {
    return new Zgl1(paramZep3, paramGraphics2D, paramTabExpander);
  }
  
  public Zlpi Zw() {
    return new Zlpi(this.Zc, this.ZL, this.Zw);
  }
  
  public static void Z_(int[] paramArrayOfint) {
    ZJ = paramArrayOfint;
  }
  
  public static int[] Zt() {
    return ZJ;
  }
  
  static {
    if (Zt() != null)
      Z_(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgl1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */