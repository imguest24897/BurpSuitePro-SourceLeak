package burp;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Zz7o extends Authenticator {
  private static final PasswordAuthentication ZO = new PasswordAuthentication("", new char[0]);
  
  protected PasswordAuthentication getPasswordAuthentication() {
    return ZO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */