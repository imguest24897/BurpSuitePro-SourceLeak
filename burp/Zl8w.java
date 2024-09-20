package burp;

import javax.swing.border.EmptyBorder;

public class Zl8w extends Zl8x {
  private static String[] ZG;
  
  public Zl8w() {
    super(100);
    setEditable(false);
    setOpaque(false);
    setLineWrap(true);
    setWrapStyleWord(true);
    setBorder(new EmptyBorder(0, 0, 10, 0));
    setFocusable(true);
    setCaret(new Zrqt());
  }
  
  public Zl8w(String paramString) {
    this();
    setText(paramString);
  }
  
  public static void ZQ(String[] paramArrayOfString) {
    ZG = paramArrayOfString;
  }
  
  public static String[] ZL() {
    return ZG;
  }
  
  static {
    if (ZL() == null)
      ZQ(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */