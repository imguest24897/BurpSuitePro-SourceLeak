package burp;

import net.portswigger.Zrzg;

public class Zedc {
  private final Zrgd Ze;
  
  private final Zrzg ZC;
  
  private final Ztwv Zp;
  
  private final Zm6x Zu;
  
  private static int Zi;
  
  public Zedc(Zrgd paramZrgd, Zrzg paramZrzg, Ztwv paramZtwv, Zm6x paramZm6x) {
    this.Ze = paramZrgd;
    this.ZC = paramZrzg;
    this.Zp = paramZtwv;
    this.Zu = paramZm6x;
  }
  
  public Zb2r ZQ(Zr_4 paramZr_4, Zkit paramZkit, Ztg8 paramZtg8, Zlu6 paramZlu6, String paramString1, String paramString2) {
    return new Zb2r(this.Ze, this.ZC, paramZr_4, paramZkit, paramZtg8, paramZlu6, paramString1, paramString2, this.Zp, this.Zu);
  }
  
  public static void Zg(int paramInt) {
    Zi = paramInt;
  }
  
  public static int Zo() {
    return Zi;
  }
  
  public static int ZV() {
    int i = Zo();
    return (i == 0) ? 6 : 0;
  }
  
  static {
    if (Zo() == 0)
      Zg(91); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */