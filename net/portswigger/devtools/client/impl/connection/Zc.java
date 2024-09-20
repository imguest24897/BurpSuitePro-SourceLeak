package net.portswigger.devtools.client.impl.connection;

import burp.Zbqc;
import burp.Zxr8;
import java.util.Objects;
import net.portswigger.devtools.client.impl.Zw;
import net.portswigger.devtools.protocol.Zl;

public class Zc extends Zg {
  private final Zw Zs;
  
  private final Zl ZS;
  
  private Zc(Zw paramZw, Zl paramZl) {
    this.Zs = Objects.<Zw>requireNonNull(paramZw);
    this.ZS = Objects.<Zl>requireNonNull(paramZl);
  }
  
  public Zw Zq() {
    return this.Zs;
  }
  
  public Zl ZQ() {
    return this.ZS;
  }
  
  public static Zxr8<Zc> Zg(Zw paramZw, Zl paramZl) {
    boolean bool = Zg.Zp();
    if (Zbqc.Zwu() == null)
      Zg.Z_(!bool); 
    return new Zxr8(Zu.ZX, new Zc(paramZw, paramZl));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Zc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */