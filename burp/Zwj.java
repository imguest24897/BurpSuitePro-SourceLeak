package burp;

import java.math.BigDecimal;

public class Zwj extends Zni implements Zmu9 {
  @Zzvo(0)
  private String Zc;
  
  public Zwj(BigDecimal paramBigDecimal) {
    ZD(paramBigDecimal);
  }
  
  public BigDecimal Z_s() {
    return Zbns.ZN(this.Zc);
  }
  
  private void ZD(BigDecimal paramBigDecimal) {
    Zbqc[] arrayOfZbqc = Zlct.Zl();
    if (paramBigDecimal == null) {
      this.Zc = null;
      if (arrayOfZbqc == null) {
        this.Zc = paramBigDecimal.toPlainString();
        return;
      } 
      return;
    } 
    this.Zc = paramBigDecimal.toPlainString();
  }
  
  public boolean equals(Object paramObject) {
    return Zbns.ZU(this, paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */