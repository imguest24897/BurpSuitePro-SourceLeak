package burp;

import java.util.Currency;

public class Zw6 extends Zni implements Zxck {
  @Zzvo(0)
  private String ZF;
  
  public Zw6(Currency paramCurrency) {
    ZB(paramCurrency);
  }
  
  public Currency ZrH() {
    return (this.ZF == null) ? null : Currency.getInstance(this.ZF);
  }
  
  private void ZB(Currency paramCurrency) {
    String str = Zb6j.ZL();
    if (paramCurrency == null) {
      this.ZF = null;
      if (str == null) {
        this.ZF = paramCurrency.getCurrencyCode();
        return;
      } 
      return;
    } 
    this.ZF = paramCurrency.getCurrencyCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zw6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */