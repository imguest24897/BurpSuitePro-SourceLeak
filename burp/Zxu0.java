package burp;

public class Zxu0 extends Zxu_ implements Zs82 {
  private static boolean Z_;
  
  protected Zxu0(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public String toString() {
    return Zrmi.Zo(this);
  }
  
  public Zeu4<? extends Zrp0> ZF() {
    return (Zeu4)Zs82.Zu;
  }
  
  public static void ZR(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean Zck() {
    return Z_;
  }
  
  public static boolean Zc9() {
    boolean bool = Zck();
    return !bool;
  }
  
  static {
    if (!Zc9())
      ZR(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxu0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */