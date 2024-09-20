package burp;

public class Zm9j {
  private final Zbj5 Zs;
  
  private final boolean ZQ;
  
  private static int Zg;
  
  protected Zm9j(Zbj5 paramZbj5, boolean paramBoolean) {
    this.Zs = paramZbj5;
    this.ZQ = paramBoolean;
  }
  
  public static Zm9j ZA(Zbj5 paramZbj5) {
    return new Zm9j(paramZbj5, true);
  }
  
  boolean Zj() {
    return this.ZQ;
  }
  
  Zbj5 Zw() {
    return this.Zs;
  }
  
  public static void Zp(int paramInt) {
    Zg = paramInt;
  }
  
  public static int Zm() {
    return Zg;
  }
  
  public static int ZU() {
    int i = Zm();
    return (i == 0) ? 94 : 0;
  }
  
  static {
    if (ZU() != 0)
      Zp(44); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */