package burp;

public class Zbzr extends Zbzg {
  private final int ZF;
  
  public Zbzr(int paramInt1, int paramInt2, double paramDouble) {
    super(paramInt1, paramDouble);
    this.ZF = paramInt2;
  }
  
  double Zp(int paramInt) {
    return ((this.ZF & paramInt) != this.ZF) ? super.Zp(paramInt) : 0.0D;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbzr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */