package net.portswigger;

import java.util.Optional;
import org.openapi4j.Zg;

public class Zrzn {
  private final Zg Za;
  
  public Zrzn(Zg paramZg) {
    this.Za = paramZg;
  }
  
  public boolean Zb() {
    return ((Boolean)Optional.<String>ofNullable(Zk()).map(Zu1::ZJ).map(Zrzn::lambda$hasJsonContent$0).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  public String Zk() {
    return Optional.<Zg>ofNullable(this.Za).map(Zg::getContentType).orElse("");
  }
  
  private static Boolean lambda$hasJsonContent$0(Zu1 paramZu1) {
    return Boolean.valueOf((paramZu1 == Zu1.JSON || paramZu1 == Zu1.UNKNOWN_JSON));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrzn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */