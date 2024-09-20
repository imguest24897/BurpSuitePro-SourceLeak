package burp;

import java.util.Iterator;

public class Zrai implements Zkui {
  private static boolean ZJ;
  
  public void ZY(Zes3 paramZes3) {
    ZJ(paramZes3);
    Zr(paramZes3);
  }
  
  private void ZJ(Zes3 paramZes3) {
    Ze1o ze1o = new Ze1o();
    Zz61 zz61 = new Zz61(paramZes3.Zq());
    boolean bool = ZH();
    for (Zb3t zb3t : zz61) {
      zb3t.Zm(ze1o);
      if (!bool)
        break; 
    } 
  }
  
  public void Zr(Zes3 paramZes3) {
    Ze35 ze35 = new Ze35(paramZes3);
    Zz61 zz61 = new Zz61(paramZes3.Zq());
    Iterator<Zb3t> iterator = zz61.iterator();
    boolean bool = ZH();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      zb3t.Zm(ze35);
      if (!bool) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
  }
  
  public static void ZE(boolean paramBoolean) {
    ZJ = paramBoolean;
  }
  
  public static boolean ZE() {
    return ZJ;
  }
  
  public static boolean ZH() {
    boolean bool = ZE();
    return !bool;
  }
  
  static {
    if (ZE())
      ZE(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrai.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */