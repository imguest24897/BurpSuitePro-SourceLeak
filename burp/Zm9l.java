package burp;

public class Zm9l extends Zm9j {
  private final Zeu9 ZG;
  
  private Zm9l(Zeu9 paramZeu9, boolean paramBoolean) {
    super(paramZeu9.ZHN(), paramBoolean);
    this.ZG = paramZeu9;
  }
  
  public static Zm9l Zp(Zeu9 paramZeu9) {
    return new Zm9l(paramZeu9, true);
  }
  
  public static Zm9l Ze(Zeu9 paramZeu9) {
    return new Zm9l(paramZeu9, false);
  }
  
  public Zeu9 ZD() {
    return this.ZG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */