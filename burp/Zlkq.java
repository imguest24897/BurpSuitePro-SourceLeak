package burp;

import net.portswigger.Zvy;

public class Zlkq {
  private static String[] ZL;
  
  public static boolean ZS(Zstu paramZstu, int paramInt1, int paramInt2) {
    int i = paramInt2 - 2;
    int j = paramInt1;
    String[] arrayOfString = Zm();
    while (j < paramInt2) {
      byte b = paramZstu.Zp(j);
      if (b == 61 && j < i)
        return false; 
      if (!Zvy.Zr(b))
        return false; 
      j++;
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return true;
  }
  
  public static void ZI(String[] paramArrayOfString) {
    ZL = paramArrayOfString;
  }
  
  public static String[] Zm() {
    return ZL;
  }
  
  static {
    if (Zm() != null)
      ZI(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */