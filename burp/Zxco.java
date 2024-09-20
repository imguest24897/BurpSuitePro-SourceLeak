package burp;

public class Zxco {
  private final Zz0n Zu;
  
  private final Zgb6 ZX;
  
  private final Ztyg Zp;
  
  private final Zgq7 Zy;
  
  private final Zey9 Zn;
  
  private static int[] Zl;
  
  public Zxco(Zz0n paramZz0n, Zgb6 paramZgb6, Ztyg paramZtyg, Zgq7 paramZgq7, Zey9 paramZey9) {
    this.Zu = paramZz0n;
    this.ZX = paramZgb6;
    this.Zp = paramZtyg;
    this.Zy = paramZgq7;
    this.Zn = paramZey9;
  }
  
  public Zxe5 ZS() {
    return new Zxe5(this.Zp, this.Zy, this.Zn);
  }
  
  public Zxao ZJ() {
    return new Zxao(this.Zu, this.ZX);
  }
  
  public Zxey Zc() {
    return new Zxey(this.Zu.ZD());
  }
  
  public static void ZI(int[] paramArrayOfint) {
    Zl = paramArrayOfint;
  }
  
  public static int[] Z_() {
    return Zl;
  }
  
  static {
    if (Z_() == null)
      ZI(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxco.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */