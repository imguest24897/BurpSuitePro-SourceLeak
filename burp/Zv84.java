package burp;

public abstract class Zv84 implements Zg0z {
  private static int Z_;
  
  protected abstract Zvb Zb(Zvb paramZvb);
  
  public Zm75 ZC(Zz22 paramZz22) {
    return paramZz22.ZG(this);
  }
  
  public static void ZM(int paramInt) {
    Z_ = paramInt;
  }
  
  public static int ZB() {
    return Z_;
  }
  
  public static int Zn() {
    int i = ZB();
    return (i == 0) ? 92 : 0;
  }
  
  static {
    if (Zn() != 0)
      ZM(88); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv84.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */