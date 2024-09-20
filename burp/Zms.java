package burp;

import java.io.IOException;

public class Zms implements Zx7 {
  private final Zeat Zg;
  
  private static int Zt;
  
  public Zms(Zeat paramZeat) {
    this.Zg = paramZeat;
  }
  
  public void Zt(Zz2j paramZz2j, Zml3 paramZml3) throws IOException {
    Zz1p zz1p = paramZml3.Zi();
    Zxx0 zxx0 = Zxx0.Zf();
    int i = ZQ();
    try {
      Zyf zyf = Zyf.Zy(paramZml3.ZC());
      Zstu zstu = zyf.Zb(zz1p.ZO(), zyf.Zpu());
      zxx0 = this.Zg.Zq(zstu);
    } finally {
      Zsdz.ZJ(paramZml3.Zu(), zxx0.ZS());
    } 
    try {
      if (i == 0)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static void ZD(int paramInt) {
    Zt = paramInt;
  }
  
  public static int ZQ() {
    return Zt;
  }
  
  public static int Ze() {
    int i = ZQ();
    return (i == 0) ? 57 : 0;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    if (Ze() != 0)
      ZD(51); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zms.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */