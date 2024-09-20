package burp;

public class Zbzg {
  final double Zt;
  
  final int Zd;
  
  private Zbzg(int paramInt, double paramDouble) {
    this.Zd = paramInt;
    this.Zt = paramDouble;
  }
  
  double Zp(int paramInt) {
    return ((this.Zd & paramInt) == this.Zd) ? this.Zt : 0.0D;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbzg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */