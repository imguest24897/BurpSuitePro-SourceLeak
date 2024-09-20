package burp;

public class Zekh extends Zeku {
  private final double ZS;
  
  public Zekh(int paramInt) {
    this(paramInt, 0.0D);
  }
  
  public Zekh(int paramInt, double paramDouble) {
    super(paramInt, 8);
    this.ZS = paramDouble;
  }
  
  public double Zb() {
    return this.ZS;
  }
  
  public void ZB(Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    double d = paramZkit.ZL(paramZgpi1, this);
    paramZkit.Zn(paramZgpi2, this, d);
  }
  
  public void ZK(Zs7v paramZs7v) {
    paramZs7v.Zt(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zekh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */