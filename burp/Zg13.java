package burp;

public class Zg13 {
  private final Zgb6 ZH;
  
  private static int ZP;
  
  public Zg13(Zgb6 paramZgb6) {
    this.ZH = paramZgb6;
  }
  
  public boolean ZA() {
    return (this.ZH.ZU0()).ZT;
  }
  
  public Zzi5 ZY() {
    return (this.ZH.ZU0()).Zu;
  }
  
  public String ZZ() {
    return (this.ZH.ZU0()).Zu.ZJ();
  }
  
  public static void Zr(int paramInt) {
    ZP = paramInt;
  }
  
  public static int Zm() {
    return ZP;
  }
  
  public static int Zy() {
    int i = Zm();
    return (i == 0) ? 125 : 0;
  }
  
  static {
    if (Zy() == 0)
      Zr(80); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg13.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */