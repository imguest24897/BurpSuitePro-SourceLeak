package burp;

public class Zm_m {
  private final Zr9_ Zu;
  
  private final Zr9_ Zz;
  
  private final Zewm Zb;
  
  private static Zbqc[] Zy;
  
  public Zm_m(Zr9_ paramZr9_1, Zr9_ paramZr9_2, Zewm paramZewm) {
    this.Zu = paramZr9_1;
    this.Zz = paramZr9_2;
    this.Zb = paramZewm;
  }
  
  public Zr9_ Z_() {
    return this.Zu;
  }
  
  public Zr9_ Zy() {
    return this.Zz;
  }
  
  public Zewm Zw() {
    return this.Zb;
  }
  
  public static void Zy(Zbqc[] paramArrayOfZbqc) {
    Zy = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZW() {
    return Zy;
  }
  
  static {
    if (ZW() == null)
      Zy(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */