package burp;

import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import net.portswigger.Zvh;

public class Zgkv {
  public static final int ZG = Zk();
  
  private static Ztja Zz;
  
  private static int Zk() {
    byte b;
    if (Zb12.ZG() || GraphicsEnvironment.isHeadless())
      return 13; 
    int i = (Toolkit.getDefaultToolkit().getScreenSize()).height;
    if (Zvh.ZU.ZG() && i >= 1800) {
      b = 10;
    } else if (i < 600) {
      b = 9;
    } else if (i < 768) {
      b = 10;
    } else if (i < 1024) {
      b = 11;
    } else if (i < 1080) {
      b = 12;
    } else {
      b = 13;
    } 
    return b;
  }
  
  public static Ztja ZI() {
    return Zz;
  }
  
  static void ZM() {
    if (!Zb12.ZG())
      Zz = Zlyp.ZD(); 
  }
  
  static int ZB(String paramString) {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    int i = -1;
    if (paramString != null)
      for (String str : Zrt.Zm()) {
        if (str.equals(paramString)) {
          i = Integer.parseInt(str);
          if (arrayOfZbqc == null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc == null)
          break; 
      }  
    if (i == -1)
      i = ZG; 
    if (Zrt.ZC() == 0)
      Zrt.Zn = i; 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */