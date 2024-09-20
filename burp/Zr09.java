package burp;

import java.math.BigInteger;
import java.util.Date;

public class Zr09 {
  private int Zv = (int)(new Date()).getTime();
  
  public synchronized BigInteger Zw() {
    return BigInteger.valueOf(Math.abs(this.Zv++));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr09.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */