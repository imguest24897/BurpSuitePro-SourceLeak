package burp;

import java.awt.Dimension;

public class Zl8x extends Zl86 {
  private final int ZY;
  
  private static String Zx;
  
  public Zl8x() {
    this(0);
  }
  
  public Zl8x(int paramInt) {
    this.ZY = paramInt;
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(this.ZY, (super.getPreferredSize()).height);
  }
  
  public static void Zl(String paramString) {
    Zx = paramString;
  }
  
  public static String Z_() {
    return Zx;
  }
  
  static {
    if (Z_() == null)
      Zl("CciDcc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */