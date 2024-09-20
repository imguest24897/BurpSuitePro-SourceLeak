package burp;

import java.net.UnknownHostException;

public class Ztp7 extends UnknownHostException {
  public Ztp7(UnknownHostException paramUnknownHostException) {
    super(paramUnknownHostException.getMessage());
    initCause(paramUnknownHostException);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztp7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */