package burp;

public class Zvc {
  private final String ZR;
  
  private final Zgzq Zq;
  
  private Zlar Zr;
  
  private Zlkk ZK;
  
  private int Zm = -1;
  
  private Zvc(String paramString, Zgzq paramZgzq) {
    this.ZR = paramString;
    this.Zq = paramZgzq;
  }
  
  public Zvc Zu(Zlar paramZlar) {
    this.Zr = paramZlar;
    return this;
  }
  
  public Zvc ZC(Zlkk paramZlkk) {
    this.ZK = paramZlkk;
    return this;
  }
  
  public Zvc Zy(int paramInt) {
    this.Zm = paramInt;
    return this;
  }
  
  public Zbcr Zc() {
    return new Zbcr(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */