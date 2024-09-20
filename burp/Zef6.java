package burp;

public class Zef6 implements Zsfe {
  private final Zgb6 Zm;
  
  private final Zkl6 ZI;
  
  private final String ZT;
  
  private final boolean ZV;
  
  Zef6(Zgb6 paramZgb6, Zkl6 paramZkl6, Zs7n paramZs7n) {
    this.Zm = paramZgb6;
    this.ZI = paramZkl6;
    this.ZT = (paramZs7n == null) ? null : paramZs7n.ZZ();
    this.ZV = (paramZs7n != null && paramZs7n.ZL());
  }
  
  public Zr59 ZG() {
    return new Zr59(this.Zm.Zfm(), this.ZI.Zc().Zi(), this.ZI.Zc().Zu());
  }
  
  public boolean ZR() {
    return this.Zm.ZfO();
  }
  
  public String Zc(Zmzk paramZmzk) {
    return (this.ZT != null) ? this.ZT : ((paramZmzk.ZJY() == 0) ? paramZmzk.ZJ1() : null);
  }
  
  public boolean ZT() {
    return this.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zef6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */