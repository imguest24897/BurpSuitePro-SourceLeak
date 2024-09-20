package burp;

import java.util.Iterator;

public abstract class Zkr2 implements Zb6r {
  private static String[] ZY;
  
  protected void Zm(Zb3t paramZb3t, Ze1f paramZe1f) {
    Zrqv zrqv = new Zrqv(paramZb3t);
    Iterator<Zb3t> iterator = zrqv.iterator();
    String[] arrayOfString = ZP();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (paramZe1f.ZR())
        return; 
      zb3t.Zm(paramZe1f);
      if (arrayOfString == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
  }
  
  public static void ZC(String[] paramArrayOfString) {
    ZY = paramArrayOfString;
  }
  
  public static String[] ZP() {
    return ZY;
  }
  
  static {
    if (ZP() == null)
      ZC(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkr2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */