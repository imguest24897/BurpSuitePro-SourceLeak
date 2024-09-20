package net.portswigger.devtools.client.impl.connection;

import burp.Zxr8;
import java.net.URI;
import java.util.Objects;

public class Ze extends Zg {
  private final URI Zn;
  
  private Ze(URI paramURI) {
    this.Zn = Objects.<URI>requireNonNull(paramURI);
  }
  
  public static Zxr8<Ze> ZH(URI paramURI) {
    return new Zxr8(Zu.ZP, new Ze(paramURI));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Ze.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */