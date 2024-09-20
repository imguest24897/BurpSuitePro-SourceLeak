package burp;

import java.io.IOException;

public class Zelx {
  private static String ZF;
  
  public static void ZD(Zx05 paramZx05, Zs4f paramZs4f) throws IOException {
    Zrte<Zefg<Zstu>> zrte = paramZx05.ZCR();
    byte b1 = 0;
    String str = Zo();
    while (b1 < 8) {
      for (Zstu zstu : zrte.ZdF(b1)) {
        paramZs4f.Ze("p" + b1, zstu);
        if (str == null)
          break; 
      } 
      b1++;
      if (str == null)
        break; 
    } 
    Zrte<Zstu> zrte1 = paramZx05.ZCC();
    byte b2 = 0;
    while (b2 < 8) {
      paramZs4f.Ze("s", zrte1.ZdF(b2));
      b2++;
      if (str == null)
        break; 
    } 
    Zmyi zmyi = paramZx05.ZCg();
    byte b3 = 0;
    while (b3 < 8) {
      paramZs4f.Zb("p", zmyi.ZN(b3));
      b3++;
      if (str == null)
        break; 
    } 
  }
  
  static void Zh(Zx05 paramZx05, Zr_4 paramZr_4) {
    Zrte<Zefg<Zstu>> zrte = paramZx05.ZCR();
    Zrte<Zstu> zrte1 = paramZx05.ZCC();
    String str = Zo();
    int i = 1;
    byte b = 0;
    while (b < 8) {
      if (zrte.ZdF(b) != null && !((Zefg)zrte.ZdF(b)).isEmpty())
        i *= ((Zefg)zrte.ZdF(b)).size(); 
      Zstu zstu1 = zrte1.ZdF(b);
      Zstu zstu2 = paramZr_4.ZZ(Zsbj.Zi(zstu1.ZiD()));
      zrte1.ZU(b, zstu2);
      b++;
      if (str == null)
        break; 
    } 
    paramZx05.ZvH(i);
    paramZx05.Zy4();
  }
  
  static void Zs(Zx05 paramZx05) {
    Zmyi zmyi = paramZx05.ZCg();
    zmyi.ZX(0, -1);
    String str = Zo();
    byte b = 1;
    while (b < 8) {
      zmyi.ZX(b, 0);
      b++;
      if (str == null)
        break; 
    } 
    paramZx05.Zq(zmyi);
  }
  
  public static void ZI(String paramString) {
    ZF = paramString;
  }
  
  public static String Zo() {
    return ZF;
  }
  
  static {
    if (Zo() == null)
      ZI("VVWhZb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */