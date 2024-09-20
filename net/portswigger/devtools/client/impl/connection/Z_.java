package net.portswigger.devtools.client.impl.connection;

import burp.Zbqc;
import burp.Zxr8;
import java.net.URI;
import java.util.Objects;

public class Z_ extends Zg {
  private final URI Zl;
  
  public Z_(URI paramURI) {
    boolean bool = Zg.Zp();
    this.Zl = Objects.<URI>requireNonNull(paramURI);
    if (bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public static Zxr8<Z_> ZB(URI paramURI) {
    return new Zxr8(Zu.ZL, new Z_(paramURI));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Z_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */